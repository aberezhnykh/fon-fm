B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Обёртка над MediaPlayer с защитой от stale events, fade-in/fade-out и stall detection.
' Даёт B4XMainPage чистые события Ready / Error / Complete / Timeupdate по audioKey.

Sub Class_Globals
	Private Const STATE_STOPPED = 0, STATE_LOADING = 1, STATE_READY = 2, STATE_PLAYING = 3 As Int
	Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OUT = 2 As Int
	Private Const CHECK_TIMER_INTERVAL_MS As Int = 2000
	Private Const SILENCE_STALL_THRESHOLD As Int = 3

	Private player As MediaPlayer
	Private jo As JavaObject
	Private eventName As String
	Private targetPage As B4XMainPage
	Private timeUpdateTimer As Timer
	Private lastPosition As Long
	Private checkTimer As Timer
	Private loadTimer As Timer
	Private fadeTimer As Timer
	Private playerState As Int
	Private maxVolume As Double
	Private fadeMode As Int
	Private fadeTargetVolume As Double
	Private fadeStepVolume As Double
	Private currentVolume As Double
	Private stalledCheckCount As Int
	Private currentLoadToken As Long
	Private activeEventLoadToken As Long
	Private audioKey As String
End Sub

Public Sub Initialize (eventNameValue As String, targetPageValue As B4XMainPage)
	eventName = eventNameValue
	targetPage = targetPageValue
	audioKey = ResolveAudioKey(eventName)
	loadTimer.Initialize("LoadTimer", 10 * DateTime.TicksPerSecond)
	checkTimer.Initialize("CheckTimer", CHECK_TIMER_INTERVAL_MS)
	timeUpdateTimer.Initialize("TimeUpdateTimer", 250)
	fadeTimer.Initialize("FadeTimer", 40)
	TraceAudio("Initialize")
End Sub

' Загружает media в player и выдаёт новый load token, чтобы старые Ready/Error/Complete не ломали актуальный playback.
Public Sub LoadUrl(url As String, volume As Double)
	Dim startedAt As Long = DateTime.Now
	Reset
	currentLoadToken = currentLoadToken + 1
	activeEventLoadToken = currentLoadToken
	loadTimer.Interval = 10 * DateTime.TicksPerSecond
	loadTimer.Enabled = True
	playerState = STATE_LOADING
	maxVolume = Max(0, Min(1, volume))
	TraceAudio("LoadUrl. volume=" & NumberFormat2(maxVolume, 1, 3, 3, False) & ", url=" & url)
	Try
		player.Initialize("Player", url)
		jo = player
		jo.RunMethod("setOnError", Array As Object(jo.CreateEventFromUI("java.lang.Runnable", "Error", False)))
		jo.RunMethod("setOnReady", Array As Object(jo.CreateEventFromUI("java.lang.Runnable", "Ready", False)))
	Catch
		NotifyError(LastException.Message)
	End Try
	LogSlowOperation("LoadUrl", startedAt)
End Sub

Public Sub Play
	PlayWithFade(0)
End Sub

' Запускает playback после Ready и, если нужно, выполняет fade-in до maxVolume.
Public Sub PlayWithFade(fadeTimeMs As Int)
	If playerState <> STATE_READY Then
		TraceInternalError("play_with_fade_not_ready state=" & playerState)
		Return
	End If
	playerState = STATE_PLAYING
	lastPosition = 0
	stalledCheckCount = 0
	checkTimer.Enabled = True
	timeUpdateTimer.Enabled = True
	If fadeTimeMs > 0 Then
		SetPlayerVolume(0)
	Else
		SetPlayerVolume(maxVolume)
	End If
	player.Play
	TraceAudio("PlayWithFade. fadeTimeMs=" & fadeTimeMs & ", maxVolume=" & NumberFormat2(maxVolume, 1, 3, 3, False))
	If fadeTimeMs > 0 Then
		StartFade(FADE_IN, maxVolume, fadeTimeMs)
	End If
End Sub

' Останавливает playback сразу или через fade-out, в зависимости от fadeTimeMs и текущей громкости.
Public Sub Stop(fadeTimeMs As Int)
	Dim startedAt As Long = DateTime.Now
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	lastPosition = 0
	stalledCheckCount = 0
	If player.IsInitialized = False Then
		playerState = STATE_STOPPED
		TraceAudio("Stop ignored. player not initialized.")
		Return
	End If
	TraceAudio("Stop. fadeTimeMs=" & fadeTimeMs & ", currentVolume=" & NumberFormat2(currentVolume, 1, 3, 3, False))
	If fadeTimeMs > 0 And currentVolume > 0 Then
		playerState = STATE_STOPPED
		StartFade(FADE_OUT, 0, fadeTimeMs)
	Else
		StopImmediately
	End If
	LogSlowOperation("Stop", startedAt)
End Sub

' Полный reset player instance, таймеров и токенов текущей загрузки.
Public Sub Reset
	Dim startedAt As Long = DateTime.Now
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	lastPosition = 0
	stalledCheckCount = 0
	currentVolume = 0
	activeEventLoadToken = 0
	playerState = STATE_STOPPED
	If player.IsInitialized Then
		Try
			player.Volume = 0
			player.Stop
		Catch
			TraceInternalError("reset_stop")
		End Try
		If jo.IsInitialized Then
			Try
				jo.RunMethod("dispose", Null)
			Catch
				TraceInternalError("reset_dispose")
			End Try
		End If
	End If
	LogSlowOperation("Reset", startedAt)
End Sub

Public Sub IsStopped As Boolean
	Return playerState = STATE_STOPPED
End Sub

Public Sub IsLoading As Boolean
	Return playerState = STATE_LOADING
End Sub

Public Sub IsReady As Boolean
	Return playerState = STATE_READY
End Sub

Public Sub IsPlaying As Boolean
	Return playerState = STATE_PLAYING
End Sub

Public Sub Position As Long
	If player.IsInitialized = False Then Return 0
	Try
		Return player.Position
	Catch
		Return 0
	End Try
End Sub

Public Sub Duration As Long
	If player.IsInitialized = False Then Return 0
	Try
		Return player.Duration
	Catch
		Return 0
	End Try
End Sub

' OnReady игнорирует stale callbacks и сообщает page только о актуальной загрузке.
Private Sub Ready_Event(methodName As String, args() As Object)
	If activeEventLoadToken <> currentLoadToken Then
		TraceAudio("Ready ignored. stale_token=" & activeEventLoadToken & " current=" & currentLoadToken)
		Return
	End If
	playerState = STATE_READY
	loadTimer.Enabled = False
	TraceAudio("Ready")
	targetPage.AudioPlayer_Ready(audioKey)
End Sub

Private Sub Error_Event(methodName As String, args() As Object)
	If activeEventLoadToken <> currentLoadToken Then
		TraceAudio("Error ignored. stale_token=" & activeEventLoadToken & " current=" & currentLoadToken)
		Return
	End If
	Dim msg As String = ""
	Try
		msg = jo.RunMethod("getError", Null)
	Catch
		msg = LastException.Message
	End Try
	TraceAudio("Error_Event. message=" & msg)
	NotifyError(msg)
End Sub

' OnComplete завершает только актуальный playback и не реагирует на устаревшие callbacks.
Private Sub Player_Complete
	If activeEventLoadToken <> currentLoadToken Then
		TraceAudio("Complete ignored. stale_token=" & activeEventLoadToken & " current=" & currentLoadToken)
		Return
	End If
	If playerState = STATE_STOPPED Then Return
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	currentVolume = 0
	stalledCheckCount = 0
	playerState = STATE_STOPPED
	TraceAudio("Complete")
	targetPage.AudioPlayer_Complete(audioKey)
End Sub

Private Sub NotifyError(message As String)
	TraceAudio("NotifyError. message=" & message)
	Reset
	targetPage.AudioPlayer_Error(audioKey, message)
End Sub

Private Sub TimeUpdateTimer_Tick
	If playerState <> STATE_PLAYING Then Return
	If activeEventLoadToken <> currentLoadToken Then Return
	targetPage.AudioPlayer_Timeupdate(audioKey)
End Sub

' Периодически проверяет реальное движение позиции и поднимает error, если playback завис в тишине.
Private Sub CheckTimer_Tick
	If playerState <> STATE_PLAYING Then Return
	Dim positionNow As Long = Position
	If positionNow > lastPosition Then
		lastPosition = positionNow
		stalledCheckCount = 0
		Return
	End If
	Dim durationNow As Long = Duration
	Dim remainMs As Long = -1
	If durationNow > 0 Then remainMs = Max(0, durationNow - positionNow)
	If durationNow > 0 And positionNow >= Max(0, durationNow - 2000) Then
		TraceDiagnostic("хвост audio=" & eventName & " positionMs=" & positionNow & " durationMs=" & durationNow & " remainMs=" & remainMs & " stalled=" & stalledCheckCount)
		Return
	End If
	stalledCheckCount = stalledCheckCount + 1
	If stalledCheckCount = 1 Or stalledCheckCount = 3 Then
		TraceDiagnostic("задержка audio=" & eventName & " positionMs=" & positionNow & " durationMs=" & durationNow & " remainMs=" & remainMs & " stalled=" & stalledCheckCount)
	End If
	If stalledCheckCount < SILENCE_STALL_THRESHOLD Then Return
	NotifyError("Silence detected " & SILENCE_STALL_THRESHOLD)
End Sub

Private Sub LoadTimer_Tick
	loadTimer.Enabled = False
	TraceAudio("Load timeout")
	NotifyError("Track loading timeout expired")
End Sub

Private Sub FadeTimer_Tick
	If player.IsInitialized = False Then
		fadeTimer.Enabled = False
		fadeMode = FADE_NONE
		Return
	End If
	Dim nextVolume As Double = currentVolume + fadeStepVolume
	If fadeMode = FADE_IN Then
		If nextVolume >= fadeTargetVolume Then
			nextVolume = fadeTargetVolume
			fadeTimer.Enabled = False
			fadeMode = FADE_NONE
		End If
	Else If fadeMode = FADE_OUT Then
		If nextVolume <= fadeTargetVolume Then
			nextVolume = fadeTargetVolume
			fadeTimer.Enabled = False
			fadeMode = FADE_NONE
		End If
	End If
	SetPlayerVolume(nextVolume)
	If fadeMode = FADE_NONE And nextVolume <= 0 Then
		StopImmediately
	End If
End Sub

Private Sub StartFade(mode As Int, targetVolume As Double, fadeTimeMs As Int)
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	If player.IsInitialized = False Then Return
	If fadeTimeMs <= 0 Then
		SetPlayerVolume(targetVolume)
		If targetVolume <= 0 Then StopImmediately
		Return
	End If
	Dim intervalMs As Int = Max(20, fadeTimer.Interval)
	Dim steps As Int = Max(1, Ceil(fadeTimeMs / intervalMs))
	fadeMode = mode
	fadeTargetVolume = targetVolume
	fadeStepVolume = (targetVolume - currentVolume) / steps
	fadeTimer.Enabled = True
End Sub

Private Sub SetPlayerVolume(volumeValue As Double)
	currentVolume = Max(0, Min(1, volumeValue))
	If player.IsInitialized = False Then Return
	Try
		player.Volume = currentVolume
	Catch
		TraceInternalError("set_volume")
	End Try
End Sub

Private Sub StopImmediately
	Dim startedAt As Long = DateTime.Now
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	playerState = STATE_STOPPED
	currentVolume = 0
	TraceAudio("StopImmediately")
	If player.IsInitialized = False Then Return
	Try
		player.Volume = 0
		player.Stop
	Catch
		TraceInternalError("stop_immediately")
	End Try
	LogSlowOperation("StopImmediately", startedAt)
End Sub

Private Sub LogSlowOperation(operationName As String, startedAt As Long)
	Dim elapsed As Long = DateTime.Now - startedAt
	If elapsed < 50 Then Return
	TraceDiagnostic("audio slow op=" & eventName & "." & operationName & " elapsedMs=" & elapsed & " state=" & playerState)
End Sub

Private Sub TraceInternalError(context As String)
	targetPage.TraceLog("ошибка аудио internal context=" & context & " message=" & LastException.Message)
End Sub

Private Sub TraceDiagnostic(message As String)
	targetPage.TraceLog(message)
End Sub

Private Sub TraceAudio(message As String)
	targetPage.TraceLog("[" & eventName & "] " & message)
End Sub

Private Sub ResolveAudioKey(nameValue As String) As String
	If nameValue.ToLowerCase.Contains("secondary") Then Return "secondary"
	Return "primary"
End Sub
