B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Фоновый worker, который автоматически загружает треки предсказанные CacheQueuePredictor.
' Это гарантирует что плеер всегда имеет достаточно треков, чтобы продолжить воспроизведение
' даже при потере интернета.
'
' Жизненный цикл:
' 1. Initialize() - создание
' 2. Start() - начать фоновую загрузку (вызывать после каждого RefreshOfflineData)
' 3. Pause() - пауза (при потере интернета)
' 4. Tick() - вызывать периодически (из main loop) - каждые 5-10 секунд
' 5. GetProgress() - проверить статус
' 6. Stop() - остановить (при выходе приложения)

Sub Class_Globals
	Private queuePredictor As CacheQueuePredictor
	Private mediaCacheInstance As Object  ' MediaCache instance
	Private targetModule As Object
	Private traceSubName As String
	Private dataResolver As DataPlaybackResolver  ' DataPlaybackResolver instance
	Private state As String = "idle"  ' idle | running | paused | stopped
	Private offlineData As Map
	Private workQueue As List  ' List<Map> с trackId, priority, status
	Private workIndex As Int = 0
	Private loadedTracksPerSession As Int = 0
	Private failedTracksPerSession As Int = 0
	Private lastTickTicks As Long = 0
	Private Const TICK_INTERVAL_MS As Long = 5000  ' 5 секунд между проверками
	Private Const MAX_PARALLEL_DOWNLOADS As Int = 1  ' Одновременно грузим только 1 трек (чтобы не забивать сеть/диск)
	Private Const MAX_TRACKS_PER_BATCH As Int = 50  ' Максимум 50 треков за сессию
	Private currentDownloads As List  ' List<String> с trackId-ами, которые сейчас загружаются
End Sub

Public Sub Initialize(cacheQueuePredictorValue As CacheQueuePredictor, mediaCacheValue As Object, targetModuleValue As Object, traceSubNameValue As String, dataResolverValue As DataPlaybackResolver)
	queuePredictor = cacheQueuePredictorValue
	mediaCacheInstance = mediaCacheValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	dataResolver = dataResolverValue
	
	workQueue.Initialize
	currentDownloads.Initialize
	offlineData.Initialize
	state = "idle"
	loadedTracksPerSession = 0
	failedTracksPerSession = 0
End Sub

' ============ УПРАВЛЕНИЕ ЖИЗНЕННЫМ ЦИКЛОМ ============

' Начать фоновую загрузку. Вызывается после RefreshOfflineData.
Public Sub Start(offlineDataValue As Map)
	If state = "stopped" Then Return
	
	offlineData = offlineDataValue
	if offlineData = Null Then
		Pause
		Return
	End If
	
	ReloadWorkQueue
	state = "running"
	Trace("Prefetch начат, " & workQueue.Size & " треков в очереди")
End Sub

' Пауза фоновой загрузки (при потере интернета, low battery, и т.п.)
Public Sub Pause
	If state = "running" Then
		state = "paused"
		Trace("Prefetch пауза")
	End If
End Sub

' Возобновить загрузку после паузы
Public Sub Resume
	If state = "paused" Then
		state = "running"
		Trace("Prefetch возобновлен")
	End If
End Sub

' Остановить полностью (при выходе приложения)
Public Sub Stop
	state = "stopped"
	workQueue.Clear
	currentDownloads.Clear
	Trace("Prefetch остановлен")
End Sub

' ============ ОСНОВНОЙ РАБОЧИЙ ЦИКЛ ============

' Вызывается периодически из main loop. Возвращает вместе или пусто (для статуса)
Public Sub GetState As String
	Return state
End Sub

' Основная функция: должна быть вызвана из main runloop каждые 5-10 секунд
' Рекомендуется вызывать из PlaybackOrchestrationState.Tick() или похожего места
Public Sub Tick As Boolean
	If state <> "running" Then Return False
	
	Dim nowTicks As Long = DateTime.Now
	If nowTicks - lastTickTicks < TICK_INTERVAL_MS Then Return False
	lastTickTicks = nowTicks
	
	' Пытаемся загрузить следующий трек
	ProcessNextDownload
	Return True
End Sub

' ============ ИНФОРМАЦИЯ О СОСТОЯНИИ ============

Public Sub GetProgress As Map
	Dim progress As Map
	progress.Initialize
	progress.Put("state", state)
	progress.Put("queue_size", workQueue.Size)
	progress.Put("queue_position", workIndex)
	progress.Put("downloading_count", currentDownloads.Size)
	progress.Put("loaded_this_session", loadedTracksPerSession)
	progress.Put("failed_this_session", failedTracksPerSession)
	Return progress
End Sub

' ============ PRIVATE МЕТОДЫ ============

' Перезагружает очередь работ из предсказания
Private Sub ReloadWorkQueue
	workQueue.Initialize
	workIndex = 0
	loadedTracksPerSession = 0
	failedTracksPerSession = 0
	
	' Получаем predicted tracks от CacheQueuePredictor
	Dim predictedTracks As List = queuePredictor.PredictUpcomingTracks(offlineData, mediaCacheInstance, dataResolver)
	If predictedTracks = Null Or predictedTracks.Size = 0 Then
		Trace("Нет предсказанных треков")
		Return
	End If
	
	' Ограничиваем очередь максимум MAX_TRACKS_PER_BATCH
	Dim takeCount As Int = GetMin(predictedTracks.Size, MAX_TRACKS_PER_BATCH)
	For i = 0 To takeCount - 1
		Dim track As Object = predictedTracks.Get(i)
		If track Is Map Then
			workQueue.Add(track)
		End If
	Next
	
	Trace("Очередь перезагружена: " & workQueue.Size & " треков")
End Sub

' Обрабатывает загрузку следующего трека из очереди
Private Sub ProcessNextDownload
	' Если уже грузим max количество - ждем
	If (currentDownloads.Size >= MAX_PARALLEL_DOWNLOADS) Then
		Return
	End If
	
	' Если очередь пуста - ничего не делаем
	If (workQueue.Size = 0) Or (workIndex >= workQueue.Size) Then
		Return
	End If
	
	' Получаем следующий трек
	Dim trackObject As Object = workQueue.Get(workIndex)
	If (trackObject Is Map) = False Then
		workIndex = workIndex + 1
		Return
	End If
	
	Dim track As Map = trackObject
	Dim trackIdentifier As String = track.GetDefault("id", "")
	If trackIdentifier = "" Then
		workIndex = workIndex + 1
		Return
	End If
	
	' Пускаем загрузку (асинхронная)
	currentDownloads.Add(trackIdentifier)
	workIndex = workIndex + 1
	
	' TODO: Вызвать mediaCache.EnsureSingleTrackCachedAsync(trackIdentifier, callback)
	' Когда будет готово - обработать результат в callback
	Trace("Загрузка трека: " & trackIdentifier)
End Sub

' Обработчик результата загрузки трека (вызывается из MediaCache callback)
Public Sub OnTrackDownloadComplete(trackIdentifier As String, success As Boolean)
	' Удаляем из текущих загрузок
	Dim index As Int = currentDownloads.IndexOf(trackIdentifier)
	If index >= 0 Then
		currentDownloads.RemoveAt(index)
	End If
	
	If success Then
		loadedTracksPerSession = loadedTracksPerSession + 1
		Trace("✓ Трек загружен: " & trackIdentifier)
	Else
		failedTracksPerSession = failedTracksPerSession + 1
		Trace("✗ Ошибка загрузки: " & trackIdentifier)
	End If
End Sub

' ============ ВСПОМОГАТЕЛЬНЫЕ ФУНКЦИИ ============

Private Sub GetMin(a As Int, b As Int) As Int
	If (a < b) Then 
		Return a
	End If
	Return b
End Sub

Private Sub Trace(message As String)
	If targetModule = Null Then Return
	CallSubDelayed(targetModule, traceSubName & ": [Prefetch] " & message)
End Sub
