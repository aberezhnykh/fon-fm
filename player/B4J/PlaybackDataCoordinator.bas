B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Координатор data/policy слоя.
' Держит разбор server data, trusted time и policy-block правила отдельно от UI и audio orchestration.

Sub Class_Globals
	Private stateStore As PlayerStateStore
	Private syncService As NetworkSyncService
End Sub

Public Sub Initialize(store As PlayerStateStore, syncWorker As NetworkSyncService)
	stateStore = store
	syncService = syncWorker
End Sub

' Проверяет, разрешено ли воспроизведение по текущему data snapshot.
Public Sub IsPlaybackAllowed(data As Map, effectiveNowTicks As Long) As Boolean
	If data.IsInitialized = False Then Return True
	Dim playerData As Map = data.GetDefault("player", CreateInitializedMap)
	If playerData.IsInitialized And playerData.ContainsKey("playback_allowed") Then
		If playerData.GetDefault("playback_allowed", True) <> True Then Return False
	End If
	Dim endTimestamp As Long = ResolvePlaybackEndTimestamp(data)
	If endTimestamp <= 0 Then Return True
	Return effectiveNowTicks < (endTimestamp * 1000)
End Sub

' Возвращает человекочитаемую причину policy block на основе текущего data snapshot.
Public Sub ResolvePlaybackBlockReason(data As Map, effectiveNowTicks As Long) As String
	If data.IsInitialized = False Then Return stateStore.MessageValue("playback_paused")
	Dim playerData As Map = data.GetDefault("player", CreateInitializedMap)
	If playerData.IsInitialized Then
		Dim pauseReason As String = playerData.GetDefault("pause_reason", "")
		If pauseReason <> "" Then Return pauseReason
	End If
	Dim endTimestamp As Long = ResolvePlaybackEndTimestamp(data)
	If endTimestamp > 0 And effectiveNowTicks >= (endTimestamp * 1000) Then Return stateStore.MessageValue("subscription_expired")
	If playerData.IsInitialized And playerData.ContainsKey("playback_allowed") Then
		If playerData.GetDefault("playback_allowed", True) <> True Then Return stateStore.MessageValue("playback_paused")
	End If
	Return stateStore.MessageValue("playback_paused")
End Sub

' Ищет effective playback end сначала в player block, затем в top-level response.
Public Sub ResolvePlaybackEndTimestamp(data As Map) As Long
	If data.IsInitialized = False Then Return 0
	Dim playerData As Map = data.GetDefault("player", CreateInitializedMap)
	If playerData.IsInitialized Then
		Dim playerEnd As Long = ParseEndValueToTimestamp(playerData.Get("end"))
		If playerEnd > 0 Then Return playerEnd
	End If
	Return ParseEndValueToTimestamp(data.Get("end"))
End Sub

' Извлекает trusted online time из server data и пишет только монотонно растущее значение.
Public Sub UpdateTrustedOnlineTimeFromData(data As Map, storage As KeyValueStore, storageKey As String)
	Dim candidateTicks As Long = ParseTrustedOnlineTicks(data)
	If candidateTicks <= 0 Then candidateTicks = DateTime.Now
	UpdateTrustedOnlineTimeTicks(candidateTicks, storage, storageKey)
End Sub

Public Sub UpdateTrustedOnlineTimeTicks(candidateTicks As Long, storage As KeyValueStore, storageKey As String)
	If candidateTicks <= 0 Then Return
	Dim storedTicks As Long = storage.GetDefault(storageKey, 0)
	If candidateTicks <= storedTicks Then Return
	storage.Put(storageKey, candidateTicks)
	stateStore.TraceLog("trusted time update ticks=" & candidateTicks)
End Sub

' Полный цикл refresh локального data snapshot: сеть, storage, policy и resume decision.
Public Sub RefreshOfflineDataNow(fetchTimeoutMs As Int) As ResumableSub
	If stateStore.PlayerCodeValue = "" Then Return False
	If stateStore.BeginOfflineDataRefresh = False Then Return False
	stateStore.TraceInfo("network", "запрос данных", "")
	Wait For (syncService.FetchData(fetchTimeoutMs)) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		stateStore.IncrementNetworkErrorCount
		stateStore.TraceWarn("network", "data ошибка", "kind=" & result.GetDefault("Kind", "") & " lastDataOkAgoSec=" & stateStore.SecondsAgoText(stateStore.GetLastDataOkAt))
		stateStore.EndOfflineDataRefresh("http_failed")
		stateStore.WriteHealthSnapshot("ошибка_data")
		Return False
	End If
	Dim resultData As Object = result.Get("Data")
	If resultData Is Map Then
		Dim data As Map = resultData
		If data.GetDefault("ok", False) = True And data.GetDefault("type", "") = "data" Then
			stateStore.SetLastDataOkNow
			stateStore.ResetConsecutiveNetworkErrors
			stateStore.SetLastOfflineDataRefreshState("data")
			UpdateTrustedOnlineTimeFromData(data, stateStore.Storage, stateStore.TrustedSyncTimeKey)
			stateStore.SaveOfflineData(data)
			stateStore.CheckForAppUpdate(data)
			If stateStore.IsTraceUploadEnabled Then stateStore.FlushTraceBufferAsync
			stateStore.InvalidateRelevantTrackIdsCache
			stateStore.SetRemoteDataReady
			stateStore.RefreshConnectionIndicatorState
			stateStore.TraceInfo("network", "data загружены", "trace=" & stateStore.IsTraceUploadEnabled)
			stateStore.WriteHealthSnapshot("data")
			Wait For (stateStore.SyncOfflinePlaylistMetadata) Complete (unused As Boolean)
			If stateStore.IsStartupSequenceInProgress Then
				stateStore.DeferAdWarmupAfterStartup
			Else
				stateStore.EnsureAdCacheSyncAsync
			End If
			If IsPlaybackAllowed(stateStore.OfflineData, stateStore.EffectiveNowTicks) = False Then
				PausePlaybackByPolicy(ResolvePlaybackBlockReason(stateStore.OfflineData, stateStore.EffectiveNowTicks), "server")
				stateStore.EndOfflineDataRefresh("data")
				Return True
			End If
			If stateStore.ResumePlaybackWhenServerAllows And stateStore.ShouldResumeWithNewStart = False And stateStore.IsUserStoppedState = False And stateStore.IsStopping = False Then
				stateStore.TraceLog("policy resume авто mode=server_allow")
				stateStore.ClearResumePlaybackWhenServerAllows
				stateStore.EnterStartedState
				stateStore.SetStopIcon
				stateStore.HideContentBlocks
				stateStore.ResumePlaybackAfterPolicyPauseAsync
			End If
			If stateStore.IsPolicyPauseState Then
				stateStore.ClearPolicyPause
				If stateStore.IsUserStoppedState = False And stateStore.IsPlaybackStarted = False And stateStore.IsStopping = False Then
					stateStore.TraceLog("policy resume авто mode=policy_pause_clear")
					stateStore.EnterStartedState
					stateStore.SetStopIcon
					stateStore.HideContentBlocks
					stateStore.ResumePlaybackAfterPolicyPauseAsync
				End If
			End If
			stateStore.EndOfflineDataRefresh("data")
			Return True
		End If
		If data.GetDefault("type", "") = "message" Then
			stateStore.SetLastOfflineDataRefreshState("message")
			stateStore.TraceWarn("network", "data сообщение", "action=" & data.GetDefault("action", "") & " reason=" & data.GetDefault("reason", ""))
			stateStore.HandleMessageItem(data)
			stateStore.EndOfflineDataRefresh("message")
			Return False
		End If
		stateStore.SetLastOfflineDataRefreshState("invalid_data")
		stateStore.TraceWarn("network", "data некорректны", "type=" & data.GetDefault("type", "") & " ok=" & data.GetDefault("ok", False))
		PausePlaybackByPolicy(stateStore.MessageValue("invalid_data_response"), "server")
	Else
		stateStore.SetLastOfflineDataRefreshState("invalid_payload")
		stateStore.TraceWarn("network", "data некорректны", "payload=not_map")
		PausePlaybackByPolicy(stateStore.MessageValue("invalid_data_response"), "server")
	End If
	stateStore.EndOfflineDataRefresh(stateStore.LastOfflineDataRefreshState)
	stateStore.WriteHealthSnapshot("ошибка_data")
	Return False
End Sub

' Вводит player в temporary state без knowledge о том, кто именно вызвал это состояние.
Public Sub HandleTemporaryState(mode As String, text As String)
	stateStore.TraceLog("состояние temporary mode=" & mode & " text=" & text)
	stateStore.ApplyTemporaryMode(mode)
	stateStore.RefreshConnectionIndicatorState
	stateStore.ClearPlaybackState
	stateStore.HidePin
	If text <> "" Then
		stateStore.ShowMessage(text)
	Else If mode = "network" Then
		stateStore.ShowMessage("Проверьте интернет")
	Else
		stateStore.ShowMessage(stateStore.MessageValue("server_wait"))
	End If
	stateStore.ScheduleRetry(mode, 0)
End Sub

' Переводит player в blocked state и ставит более редкий retry.
Public Sub HandleBlockedState
	stateStore.TraceLog("состояние blocked")
	stateStore.EnterPolicyPause(stateStore.MessageValue("blocked"), "blocked")
	stateStore.ScheduleRetry("blocked", 0)
End Sub

' Останавливает playback при отсутствии valid data и оставляет player в stopped состоянии.
Public Sub StopForMissingData(text As String)
	stateStore.TraceLog("состояние stop reason=missing_data text=" & text)
	stateStore.SetPlaybackFlowState("idle", "missing_data")
	stateStore.ClearPolicyPauseAndResumeRequest
	stateStore.RefreshConnectionIndicatorState
	stateStore.ClearPlaybackState
	stateStore.HidePin
	stateStore.EnterUserStoppedState
	stateStore.SetPlayIcon
	stateStore.ShowMessage(text)
End Sub

' Активация local fallback path без knowledge о playback queue internals.
Public Sub ActivateLocalFallback(markDegraded As Boolean, reason As String)
	stateStore.TraceLog("fallback activate mode=local reason=" & reason & " degraded=" & markDegraded)
	stateStore.SetPlaybackFlowState("idle", "switch_local:" & reason)
	stateStore.EnterLocalPlayback
	stateStore.SetMediaPathDegraded(markDegraded)
	stateStore.RefreshConnectionIndicatorState
	stateStore.ClearPlaybackState
	stateStore.HidePin
End Sub

' Состояние отсутствия локальной музыки: фиксируем факт и не запускаем скрытый retry-цикл.
Public Sub HandleLocalTemporaryState(text As String)
	Dim fallbackReady As Boolean = stateStore.HasLocalPlaybackFallback
	stateStore.TraceLog("состояние local_empty fallbackReady=" & fallbackReady & " text=" & text)
	If fallbackReady Then stateStore.TraceLog("fallback выбор mode=local_ready reason=playable_local_fallback")
	stateStore.SetPlaybackFlowState("idle", "local_media_unavailable")
	If fallbackReady Then
		stateStore.EnterLocalPlayback
	Else
		stateStore.ApplyTemporaryMode("local_empty")
	End If
	stateStore.RefreshConnectionIndicatorState
	stateStore.ClearPlaybackState
	stateStore.HidePin
	If text <> "" Then
		stateStore.ShowMessage(text)
	Else
		stateStore.ShowMessage("Нет локальных треков")
	End If
End Sub

' Policy shutdown message останавливает background refresh и оставляет player в stopped state.
Public Sub HandleShutdownMessage(text As String)
	Dim safeText As String = text
	If safeText = "" Then safeText = stateStore.MessageValue("server_wait")
	stateStore.TraceLog("message shutdown text=" & safeText)
	stateStore.SetPlaybackFlowState("idle", "shutdown")
	stateStore.ClearPolicyPauseAndResumeRequest
	stateStore.ClearPlaybackState
	stateStore.HidePin
	stateStore.EnterUserStoppedState
	stateStore.SetPlayIcon
	stateStore.ShowMessage(safeText)
	stateStore.DisableBackgroundRefreshTimers
End Sub

' Обрабатывает ошибку data fetch и решает, переходить ли в local/server temporary mode.
Public Sub HandleFetchFailure(result As Map) As ResumableSub
	stateStore.TraceLog("очередь fetch ошибка kind=" & result.GetDefault("Kind", "") & " message=" & result.GetDefault("ErrorMessage", ""))
	If result.GetDefault("Kind", "") = "network" Then
		HandleLocalTemporaryState("")
		Return True
	End If
	If stateStore.HasLocalPlaybackFallback Then
		stateStore.TraceLog("fallback выбор mode=local reason=data_fetch_error")
		HandleLocalTemporaryState("")
		Return True
	End If
	HandleTemporaryState("server", "")
	Return True
End Sub

' Проверяет минимальную доступность backend перед переводом player в temporary state.
Public Sub ResolveRetryDelay(mode As String, delayMs As Int, localRetryMax As Int, serverRetryMax As Int, blockedRetryDelay As Int) As Int
	Return stateStore.ResolveRetryDelay(mode, delayMs, localRetryMax, serverRetryMax, blockedRetryDelay)
End Sub

' Централизует переход в retry state, чтобы page не решала отдельно logging/backoff/policy checks.
Public Sub ScheduleRetry(mode As String, delayMs As Int, localRetryMax As Int, serverRetryMax As Int, blockedRetryDelay As Int)
	stateStore.ClearRetryTimer
	stateStore.SetLastRetryMode(mode)
	stateStore.SetRetryInterval(ResolveRetryDelay(mode, delayMs, localRetryMax, serverRetryMax, blockedRetryDelay))
	If stateStore.IsPlaybackStarted = False Or stateStore.IsStoppedByUser Then Return
	If stateStore.IsPlaybackPausedByPolicy And mode <> "blocked" And mode <> "audio_device" Then Return
	stateStore.TraceWarn("network", "переход в retry", "mode=" & mode & " delaySec=" & Floor(stateStore.GetRetryInterval / 1000))
	stateStore.WriteHealthSnapshot("retry")
	stateStore.EnableRetryTimer
End Sub

Public Sub ResetRetryDelay(localRetryInitial As Int, serverRetryInitial As Int)
	stateStore.ResetRetryDelayState(localRetryInitial, serverRetryInitial)
End Sub

' Обрабатывает media failure через local fallback или offline temporary state.
Public Sub HandleMediaError As ResumableSub
	stateStore.SetPlaybackFlowState("error", "media_error")
	If stateStore.HasLocalPlaybackFallback Then
		stateStore.TraceLog("fallback выбор mode=local reason=media_error")
		ActivateLocalFallback(True, "media_failure")
		Return True
	End If
	HandleLocalTemporaryState("Нет локальных треков")
	Return True
End Sub

' Централизованный policy-pause вход для server/network/blocked режимов.
Public Sub PausePlaybackByPolicy(reason As String, connectionMode As String)
	Dim safeReason As String = reason
	If safeReason = "" Then safeReason = stateStore.MessageValue("playback_paused")
	stateStore.EnterPolicyPause(safeReason, connectionMode)
End Sub


' Проверяет, есть ли в текущем data slot локально воспроизводимый track.
Public Sub HasPlayableLocalTrackInCurrentSlot(offlineData As Map, effectiveNowTicks As Long) As Boolean
	Return CountPlayableLocalTracksInCurrentSlot(offlineData, effectiveNowTicks) > 0
End Sub

Public Sub CountPlayableLocalTracksInCurrentSlot(offlineData As Map, effectiveNowTicks As Long) As Int
	Dim currentSlot As Map = stateStore.ResolveDataSlotAtTicks(offlineData, effectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return 0
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return 0
	Dim totalCount As Int = 0
	For Each playlistObject As Object In playlists
		If playlistObject Is Map Then
			Dim playlistDescriptor As Map = playlistObject
			Dim playlistId As String = playlistDescriptor.GetDefault("id", "")
			If playlistId = "" Then Continue
			Dim playlistData As Map = stateStore.LoadCachedPlaylistMetadata(playlistId)
			totalCount = totalCount + CountCachedTracksInPlaylist(playlistData)
		End If
	Next
	Return totalCount
End Sub

Private Sub CountCachedTracksInPlaylist(playlistData As Map) As Int
	If playlistData.IsInitialized = False Then Return 0
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Or tracks.Size = 0 Then Return 0
	Dim totalCount As Int = 0
	For Each trackObject As Object In tracks
		If (trackObject Is Map) = False Then Continue
		Dim track As Map = trackObject
		Dim trackId As String = track.GetDefault("id", "")
		If trackId = "" Then Continue
		If stateStore.IsTrackCached(trackId) = False Then Continue
		totalCount = totalCount + 1
	Next
	Return totalCount
End Sub

' Строит idle message на основе current/next data slots.
Public Sub ResolveIdleUntilMessage(offlineData As Map, effectiveNowTicks As Long) As String
	If offlineData.IsInitialized = False Then Return ""
	Dim currentSlot As Map = stateStore.ResolveCurrentDataSlot(offlineData)
	If IsIdleSlot(currentSlot) = False Then Return ""
	Dim nextSlot As Map = stateStore.ResolveNextDataSlotAtTicks(offlineData, effectiveNowTicks)
	Dim nextTime As String = nextSlot.GetDefault("slot_time", "")
	If nextTime = "" Then Return stateStore.MessageValue("idle")
	Return stateStore.MessageValue("idle_until").Replace("{time}", nextTime)
End Sub

' Для ad prescan разрешает regular ads только если target minute попадает в не-idle data slot.
Public Sub AllowRegularAdsAtTargetMinute(offlineData As Map, targetMinuteTimestamp As Long) As Boolean
	If offlineData.IsInitialized = False Then Return False
	Dim targetTicks As Long = targetMinuteTimestamp * 1000
	Dim targetSlot As Map = stateStore.ResolveDataSlotAtTicks(offlineData, targetTicks)
	Return IsIdleSlot(targetSlot) = False
End Sub

Private Sub ParseEndValueToTimestamp(value As Object) As Long
	If value = Null Then Return 0
	Dim textValue As String = ("" & value).Trim
	If textValue = "" Then Return 0
	If Regex.IsMatch("^\d+$", textValue) Then Return Floor(textValue)
	If Regex.IsMatch("^\d{4}-\d{2}-\d{2}$", textValue) Then
		Return ParseDateOnlyEndTimestamp(textValue)
	End If
	Try
		Dim instantClass As JavaObject
		instantClass.InitializeStatic("java.time.Instant")
		Dim instant As JavaObject = instantClass.RunMethod("parse", Array As Object(textValue))
		Return instant.RunMethod("getEpochSecond", Null)
	Catch
		stateStore.ConsumeLastException
	End Try
	Try
		Dim offsetDateTimeClass As JavaObject
		offsetDateTimeClass.InitializeStatic("java.time.OffsetDateTime")
		Dim offsetDateTime As JavaObject = offsetDateTimeClass.RunMethod("parse", Array As Object(textValue))
		Dim instant As JavaObject = offsetDateTime.RunMethod("toInstant", Null)
		Return instant.RunMethod("getEpochSecond", Null)
	Catch
		stateStore.ConsumeLastException
	End Try
	stateStore.TraceLog("player end parse fail value=" & textValue)
	Return 0
End Sub

Private Sub ParseTrustedOnlineTicks(data As Map) As Long
	If data.IsInitialized = False Then Return 0
	Dim updatedText As String = ("" & data.GetDefault("updated", "")).Trim
	If updatedText = "" Then Return 0
	Try
		Dim instantClass As JavaObject
		instantClass.InitializeStatic("java.time.Instant")
		Dim instant As JavaObject = instantClass.RunMethod("parse", Array As Object(updatedText))
		Return instant.RunMethod("toEpochMilli", Null)
	Catch
		Try
			Dim offsetDateTimeClass As JavaObject
			offsetDateTimeClass.InitializeStatic("java.time.OffsetDateTime")
			Dim offsetDateTime As JavaObject = offsetDateTimeClass.RunMethod("parse", Array As Object(updatedText))
			Dim instant As JavaObject = offsetDateTime.RunMethod("toInstant", Null)
			Return instant.RunMethod("toEpochMilli", Null)
		Catch
			stateStore.ConsumeLastException
		End Try
	End Try
	Return 0
End Sub

Private Sub ParseDateOnlyEndTimestamp(textValue As String) As Long
	Dim previousDateFormat As String = DateTime.DateFormat
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dayStartTicks As Long = DateTime.DateParse(textValue)
		DateTime.DateFormat = previousDateFormat
		Return Floor((dayStartTicks + DateTime.TicksPerDay) / 1000)
	Catch
		DateTime.DateFormat = previousDateFormat
		stateStore.ConsumeLastException
		Return 0
	End Try
End Sub

Private Sub CreateInitializedMap As Map
	Dim m As Map
	m.Initialize
	Return m
End Sub

Private Sub IsIdleSlot(slotContext As Map) As Boolean
	If slotContext.IsInitialized = False Or slotContext.Size = 0 Then Return False
	Dim playlists As List = slotContext.GetDefault("playlists", Null)
	If playlists.IsInitialized And playlists.Size > 0 Then Return False
	Dim streamId As String = slotContext.GetDefault("stream_id", "")
	Dim streamTitle As String = slotContext.GetDefault("stream_title", "")
	Return streamId = "" And streamTitle = ""
End Sub

