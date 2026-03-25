# FON.FM: Быстрая Интеграция Prefetch (Прямая интеграция в B4XMainPage)

Поскольку модули CachePrefetchManager и CacheQueuePredictor вызывают конфликты компиляции,
их код нужно интегрировать непосредственно в B4XMainPage.bas.

Этот файл содержит готовые куски кода для копирования в B4XMainPage.bas.

## 📋 ИНСТРУКЦИИ ПО ИНТЕГРАЦИИ

1. **Скопируйте код CacheQueuePredictor** из файла `CacheQueuePredictor.bas` в конец `B4XMainPage.bas` (после всех существующих методов)
2. **Скопируйте код CachePrefetchManager** из файла `CachePrefetchManager.bas` в конец `B4XMainPage.bas`
3. **Добавьте переменные** в Sub_Globals
4. **Добавьте инициализацию** в метод Initialize
5. **Добавьте вызовы Tick** в главный цикл
6. **Добавьте методы Pause/Resume** для обработки пауз

## 1️⃣ ДОБАВИТЬ ПЕРЕМЕННЫЕ в Sub_Globals

**Найти**: Раздел `Private ... As ...` в Sub_Globals

**Добавить после существующих переменных:**

```b4j
	' === Cache Prefetch System ===
	Private prefetchManager As Object  ' Будет содержать CachePrefetchManager
	Private queuePredictor As Object  ' Будет содержать CacheQueuePredictor
	Private prefetchWorkerTicker As Int = 0  ' Counter для вызова Tick() реже
```

---

## 2️⃣ ДОБАВИТЬ ИНИЦИАЛИЗАЦИЮ в метод Initialize

**Найти**: Где инициализируются другие сервисы (после `mediaCacheService.Initialize(...)`)

**Добавить после инициализации mediaCacheService:**

```b4j
	' === Initialize Cache Prefetch System ===
	queuePredictor = CreateCacheQueuePredictor(Me, "ExternalTrace")
	prefetchManager = CreateCachePrefetchManager(queuePredictor, mediaCacheService, Me, "ExternalTrace", dataResolver)
	playerDataCoordinator.SetCachePrefetchManager(prefetchManager)
	TraceLog("Cache Prefetch System инициализирована")
```

## 2.5️⃣ ДОБАВИТЬ ФУНКЦИИ СОЗДАНИЯ ОБЪЕКТОВ

**Добавить в конец файла B4XMainPage.bas (после всех методов):**

```b4j
' === CACHE PREFETCH SYSTEM IMPLEMENTATION ===

' Создает экземпляр CacheQueuePredictor
Private Sub CreateCacheQueuePredictor(targetModule As Object, traceSubName As String) As Object
	' Скопируйте сюда весь код из CacheQueuePredictor.bas
	' Измените Class_Globals на локальные переменные
	' Измените Public методы на Private
	Return Null ' Заглушка - заменить на реальный код
End Sub

' Создает экземпляр CachePrefetchManager  
Private Sub CreateCachePrefetchManager(queuePredictor As Object, mediaCache As Object, targetModule As Object, traceSubName As String, dataResolver As DataPlaybackResolver) As Object
	' Скопируйте сюда весь код из CachePrefetchManager.bas
	' Измените Class_Globals на локальные переменные
	' Измените Public методы на Private
	Return Null ' Заглушка - заменить на реальный код
End Sub
```

---

## 3️⃣ ДОБАВИТЬ ВЫЗОВЫ TICK в главный цикл

**Найти**: Главный цикл приложения (где вызываются другие периодические задачи)

**Найти код типа**:
```b4j
' Периодические задачи
mediaCacheService.Tick
' ... другие tick-и
```

**Добавить после**:

```b4j
	' === Cache Prefetch Tick ===
	prefetchWorkerTicker = prefetchWorkerTicker + 1
	If prefetchWorkerTicker >= 10 Then  ' Каждые 10 тиков (примерно 5 секунд при 2Hz)
		prefetchWorkerTicker = 0
		If prefetchManager <> Null Then
			CallSub(prefetchManager, "Tick")
		End If
	End If
```
	' Это callback для трассирования из CacheQueuePredictor и CachePrefetchManager
	If message = "" Then Return
	If message.StartsWith("[") = False Then Return
	TraceLog(message)
End Sub
```

---

## 4️⃣ ⚠️ КРИТИЧНО: Добавить Tick в основной цикл

**Найти**: Метод `PlaybackWatchdogTimer_Tick` (строка ~1731)

**Текущий код**:
```b4j
Private Sub PlaybackWatchdogTimer_Tick
	If isPlaybackWatchdogTickInProgress Then Return
	isPlaybackWatchdogTickInProgress = True
	Wait For (RunPlaybackWatchdogTick) Complete (unused As Boolean)
	isPlaybackWatchdogTickInProgress = False
End Sub
```

**ЗАМЕНИТЬ НА**:
```b4j
Private Sub PlaybackWatchdogTimer_Tick
	If isPlaybackWatchdogTickInProgress Then Return
	isPlaybackWatchdogTickInProgress = True
	
	' === ДОБАВЛЕНО: Cache Prefetch Tick ===
	If prefetchManager <> Null Then
		prefetchWorkerTicker = prefetchWorkerTicker + 1
		If prefetchWorkerTicker >= 5 Then  ' Вызываем Tick не на каждый цикл, а реже (примерно раз в 5 сек)
			prefetchWorkerTicker = 0
			prefetchManager.Tick
		End If
	End If
	
	Wait For (RunPlaybackWatchdogTick) Complete (unused As Boolean)
	isPlaybackWatchdogTickInProgress = False
End Sub
```

---

## 5️⃣ ОПЦИОНАЛЬНО: Graceful fallback при потере сети

**Найти**: Метод который обрабатывает ошибки сети (где вызывается `HandleTemporaryState` или `HandleBlockedState`)

**Добавить при возникновении ошибки**:
```b4j
' При потере интернета - пауза prefetch
If prefetchManager <> Null Then
	prefetchManager.Pause
	TraceLog("Cache Prefetch паузирован (потеря сети)")
End If
```

**Добавить при восстановлении сети**:
```b4j
' При восстановлении интернета - возобновить prefetch
If prefetchManager <> Null Then
	prefetchManager.Resume
	TraceLog("Cache Prefetch возобновлен (восстановление сети)")
End If
```

---

## 6️⃣ MediaCache.bas: Новые методы (копировать в класс)

**Файл**: [player/B4J/MediaCache.bas](../player/B4J/MediaCache.bas)

**Найти**: Конец класса (после последнего Public Sub)

**Добавить**:

```b4j
' ============ Cache Prefetch Integration ============

' Проверяет есть ли трек уже в кэше
Public Sub HasCachedTrack(trackId As String) As Boolean
	If trackId = "" Then Return False
	If cachedTrackIndex.IsInitialized = False Then Return False
	Return cachedTrackIndex.ContainsKey(trackId)
End Sub

' Преформ cache validation для списка треков
' Используется для определения какие треки действительно доступны
Public Sub ValidateRelevantTracks(trackIds As List) As List
	Dim valid As List
	valid.Initialize
	
	If trackIds.IsInitialized = False Then Return valid
	
	For Each idObject As Object In trackIds
		Dim trackId As String = idObject
		If HasCachedTrack(trackId) Then
			valid.Add(trackId)
		End If
	Next
	
	Return valid
End Sub
```

**Затем обновить** метод `PruneTrackCacheIfNeeded` - найти где вызывается, и передать список "защищенных" треков:

**Найти строку типа**:
```b4j
PruneTrackCacheIfNeeded(CreateInitializedList)  ' Пустой список TODO
```

**Заменить на**:
```b4j
Dim protectedTrackIds As List = dataResolver.GetCurrentPlaylistTrackIds()  ' Треки из текущих плейлистов
PruneTrackCacheIfNeeded(protectedTrackIds)  ' Не удалять эти треки
```

---

## 7️⃣ Проверка: обновить fonfm.b4j конфиг

**Файл**: [player/B4J/fonfm.b4j](../player/B4J/fonfm.b4j)

**Проверить что новые модули добавлены**:

```xml
<Module>CacheQueuePredictor</Module>
<Module>CachePrefetchManager</Module>
```

Если их нет - добавить в конец списка модулей.

---

## 📝 Порядок интеграции

1. [x] Скопируйте куски кода из Шага 1️⃣ в Sub_Globals
2. [x] Скопируйте куски кода из Шага 2️⃣ в Initialize  
3. [x] Добавьте callback метод из Шага 3️⃣
4. ✅ **КРИТИЧНО**: Скопируйте/обновите Шаг 4️⃣ (PlaybackWatchdogTimer_Tick)
5. [x] (Опционально) Добавьте Pause/Resume из Шага 5️⃣
6. [x] Добавьте методы в MediaCache.bas из Шага 6️⃣
7. [x] Проверьте fonfm.b4j из Шага 7️⃣

---

## ✅ Тестирование после интеграции

### Тест 1: Старт приложения
- [ ] Плеер стартует без ошибок
- [ ] В trace логах видно: "Cache Prefetch System инициализирована"

### Тест 2: Загрузка данных
- [ ] После RefreshOfflineData видно: "[Prefetch] Prefetch начат, N треков в очереди"
- [ ] В trace логах видны сообщения типа "[Prefetch] Загрузка трека: track_id"

### Тест 3: Онлайн режим в течение часа
- [ ] Плеер работает без прерываний
- [ ] Трейск загружаются в фоне
- [ ] Нет задержек воспроизведения

### Тест 4: Потеря интернета
- [ ] Плеер **продолжает играть** на кэше
- [ ] В логах: "[Prefetch] Prefetch паузирован (потеря сети)"

### Тест 5: Восстановление интернета
- [ ] Prefetch возобновляется
- [ ] В логах: "[Prefetch] Prefetch возобновлен (восстановление сети)"

### Тест 6: Длительное воспроизведение (2-3 часа)
- [ ] Все расписание должно быть покрыто кэшем
- [ ] Плеер **не прерывается** даже при временной потере сети

---

## 🐛 Отладка при проблемах

### Проблема: Не видно trace логов prefetch

**Решение**:
- Проверьте что `ExternalTrace` метод добавлен (Шаг 3️⃣)
- Проверьте что инициализация добавлена (Шаг 2️⃣)
- Проверьте что Tick добавлен (Шаг 4️⃣)

### Проблема: Плеер прерывается при потере сети

**Решение**:
- Проверьте что кэш имеет достаточно треков
- Проверьте что MediaCache.HasCachedTrack() добавлена
- Проверьте что Pause/Resume добавлены (Шаг 5️⃣)

### Проблема: Высокое использование CPU/памяти

**Решение**:
- Уменьшить `prefetchWorkerTicker` коэффициент в Шаге 4️⃣ (например с 5 на 10)
- Уменьшить `MAX_PARALLEL_DOWNLOADS` с 1 на 0 (отключить)
- Уменьшить `MAX_TRACKS_PER_BATCH` с 50 на 30

---

## 🎯 Ключевые моменты

⭐ **Самое важное**: Не забудьте Шаг 4️⃣ (Tick в PlaybackWatchdogTimer_Tick)  
⚠️ **Если забыли**: Prefetch вообще не будет работать

💡 **Совет**: Добавляйте куски кода поэтапно и тестируйте после каждого  
🔍 **Проверяйте**: trace логи для подтверждения что система работает

---

## 📞 Нужна помощь?

Если что-то не работает:
1. Проверьте точные номера строк в вашей версии B4XMainPage.bas
2. Убедитесь что методы и переменные названы точно так же
3. Посмотрите trace логи для диагностики
4. Проверьте что все новые модули в fonfm.b4j

---

**Готово!** После выполнения всех шагов система предсказательного кэширования будет полностью интегрирована и работающая. 🎉

