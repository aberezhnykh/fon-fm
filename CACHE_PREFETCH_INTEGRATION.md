# FON.FM Cache Prefetch Integration Guide

## Обзор реализации

Была реализована двухуровневая система умного кэширования для гарантии беспрерывного воспроизведения:

### 1. CacheQueuePredictor (новый модуль)
- **Файл**: [player/B4J/CacheQueuePredictor.bas](../player/B4J/CacheQueuePredictor.bas)
- **Функция**: Анализирует расписание и предсказывает какие треки будут нужны в ближайшие часы
- **Основной метод**: `PredictUpcomingTracks(offlineData, mediaCache, dataResolver)`
  - Возвращает список Track descriptor-ов отсортированный по приоритету (0-100)
  - Кэширует предсказания чтобы не пересчитывать часто
  - Учитывает текущий слот, будущие слоты, плейлисты и треки

### 2. CachePrefetchManager (новый модуль)
- **Файл**: [player/B4J/CachePrefetchManager.bas](../player/B4J/CachePrefetchManager.bas)
- **Функция**: Фоновый worker который автоматически загружает треки согласно предсказанию
- **Методы**:
  - `Start(offlineData)` - начать загрузку (вызывается после успешного RefreshOfflineData)
  - `Tick()` - основной цикл (вызывать каждые 5-10 сек из main loop)
  - `Pause()` / `Resume()` - управление загрузкой при потере/восстановлении сети
  - `GetProgress()` - получить статус загрузки
  - `Stop()` - остановить при выходе приложения
- **State machine**: `idle` → `running` → `paused` → `stopped`

### 3. PlaybackDataCoordinator (обновлено)
- **Изменения**:
  - Добавлена переменная `cachePrefetchManager` в `Sub_Globals`
  - Добавлен метод `SetCachePrefetchManager(manager)`
  - Добавлен вызов `cachePrefetchManager.Start(data)` в методе `RefreshOfflineDataNow()` 
    после успешной загрузки данных с сервера

---

## Как завершить интеграцию в B4XMainPage

### Шаг 1: Добавить переменные в Sub_Globals

Найдите секцию `Sub Class_Globals` в [B4XMainPage.bas](../B4XMainPage.bas) (около строки 110-200) и добавьте:

```b4j
' Cache prefetch system
Private cacheQueuePredictor As CacheQueuePredictor
Private cachePrefetchManager As CachePrefetchManager
Private prefetchWorkerTicker As Int = 0  ' Counter для вызова Tick() реже
```

### Шаг 2: Инициализировать в методе создания B4XPage

Найдите метод инициализации (обычно это где инициализируются другие сервисы, примерно строка 400-600), 
добавьте после инициализации других модулей:

```b4j
' Инициализируем систему кэширования
cacheQueuePredictor.Initialize(Me, AppTraceSubName)
cachePrefetchManager.Initialize(cacheQueuePredictor, mediaCacheService, Me, AppTraceSubName, dataResolver)
playerDataCoordinator.SetCachePrefetchManager(cachePrefetchManager)
```

Где:
- `Me` - ссылка на текущий B4XMainPage (для трассировки)
- `AppTraceSubName` - константа имени sub-рутины для трассировки (скорее всего `"ExternalTrace"` или подобное)
- `playerDataCoordinator` - уже существующий объект

### Шаг 3: Добавить вызов Tick в основной рабочий цикл

Найдите метод `PlaybackWatchdogTimer_Tick` (строка ~1731), он должен быть таким:

```b4j
Private Sub PlaybackWatchdogTimer_Tick
	If isPlaybackWatchdogTickInProgress Then Return
	isPlaybackWatchdogTickInProgress = True
	Wait For (RunPlaybackWatchdogTick) Complete (unused As Boolean)
	isPlaybackWatchdogTickInProgress = False
End Sub
```

Обновите его на:

```b4j
Private Sub PlaybackWatchdogTimer_Tick
	If isPlaybackWatchdogTickInProgress Then Return
	isPlaybackWatchdogTickInProgress = True
	
	' Вызываем prefetch manager tick (но не на каждый цикл, а реже)
	prefetchWorkerTicker = prefetchWorkerTicker + 1
	If prefetchWorkerTicker >= 5 Then
		prefetchWorkerTicker = 0
		cachePrefetchManager.Tick
	End If
	
	Wait For (RunPlaybackWatchdogTick) Complete (unused As Boolean)
	isPlaybackWatchdogTickInProgress = False
End Sub
```

Это критично!

### Шаг 4 (опционально): Добавить graceful fallback при потере сети

В методе обработки сетевых ошибок (там где вызывается `HandleTemporaryState` или `HandleBlockedState`), добавьте:

```b4j
' При потере интернета - пауза prefetch
If cachePrefetchManager <> Null Then
	cachePrefetchManager.Pause
End If
```

И при восстановлении сети:

```b4j
' При восстановлении интернета - возобновить prefetch
If cachePrefetchManager <> Null Then
	cachePrefetchManager.Resume
End If
```

---

## Дополнительные работы (для надежности)

### В MediaCache.bas нужно реализовать:

1. **Метод HasCachedTrack** (проверка есть ли трек в кэше):
```b4j
Public Sub HasCachedTrack(trackId As String) As Boolean
	If trackId = "" Then Return False
	' Проверить наличие в cachedTrackIndex
	Return cachedTrackIndex.ContainsKey(trackId)
End Sub
```

2. **Методы асинхронной загрузки** для лучшей интеграции:
```b4j
Public Sub EnsureSingleTrackCachedAsync(trackId As String, targetModule As Object, completeSub As String)
	' Загрузить трек асинхронно и вызвать targetModule.completeSub(trackId, success)
	' Это нужно чтобы CachePrefetchManager знал когда трек загружен
End Sub
```

3. **Обновить PruneTrackCacheIfNeeded** для graceful fallback:
```b4j
Public Sub PruneTrackCacheIfNeeded(protectedTrackIds As List)
	' TODO: Учитывать protectedTrackIds при pruning
	' Треки из этого списка не удаляются (используются в текущем расписании)
End Sub
```

---

## Архитектура потока данных

```
Server: data.php
  ↓
PlaybackDataCoordinator.RefreshOfflineDataNow()
  ├─ NetworkSyncService.FetchData()
  ├─ OfflineStore.SaveOfflineData(data)
  └─ cachePrefetchManager.Start(data) ← ЗАПУСК
        ↓
      CacheQueuePredictor.PredictUpcomingTracks()
        ├─ Анализирует расписание
        ├─ Определяет нужные снэйки
        └─ Возвращает сортированный список
        ↓
      cachePrefetchManager.workQueue = predicted tracks
        ↓
      Main loop: PlaybackWatchdogTimer_Tick() → cachePrefetchManager.Tick()
        ├─ ProcessNextDownload()
        ├─ MediaCache.EnsureTracksCached()
        └─ OnTrackDownloadComplete() → progress update
```

---

## Приоритизация загрузок

1. **High Priority (0-60 минут)**: Треки нужные в ближайший час
   - Priority: 40-100
   
2. **Medium Priority (60-180 минут)**: Треки нужные 1-3 часа
   - Priority: 20-40
   
3. **Low Priority (3+ часа)**: Остальной контент
   - Priority: 0-20

При кэшировании траки загружаются в порядке приоритета.

---

## Отладка и трассировка

Система генерирует trace логи в формате:
```
[Prefetch] Очередь перезагружена: N треков
[Prefetch] Загрузка трека: track_id
[Prefetch] ✓ Трек загружен: track_id
[Prefetch] ✗ Ошибка загрузки: track_id
```

Проверяйте эти логи в debug консоли плеера.

---

## Тестирование

1. **Онлайн режим**: Проверьте что треки загружаются в фоне
2. **При потере сети**: Плеер должен продолжить воспроизведение на кэше
3. **При восстановлении сети**: Prefetch должен возобновиться
4. **После 2-3 часов воспроизведения**: Все треки расписания должны быть кэшированы

---

## Диагностика

Если плеер прерывается при потере сети:
1. Проверьте что cachePrefetchManager.Start() вызывается после RefreshOfflineData ✓
2. Проверьте что cachePrefetchManager.Tick() вызывается из main loop ✓
3. Проверьте что MediaCache имеет достаточно свободного места
4. Проверьте trace логи для ошибок загрузки

