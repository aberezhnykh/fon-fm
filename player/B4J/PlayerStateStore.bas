B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Контракт локального состояния player.
' Coordinator / network worker общаются с приложением через этот store, а не напрямую с page internals.

Sub Class_Globals
	Private owner As B4XMainPage
	Private policyState As PlaybackDataPolicyState
	Private orchestrationStateRef As PlaybackOrchestrationState
	Private retryFallbackStateRef As PlaybackRetryFallbackState
	Private queueStateRef As PlaybackQueueState
	Private queueBuilderRef As PlaybackQueueBuilder
	Private offlineStoreRef As OfflineStore
	Private dataResolverRef As DataPlaybackResolver
	Private mediaCacheRef As MediaCache
	Private storageRef As KeyValueStore
	Private trustedSyncTimeKeyValue As String
	Private retryTimerRef As Timer
	Private offlineDataRef As Map
	Private consecutiveNetworkErrors As Int
	Private lastRetryMode As String
	Private dataSuccessAtTicks As Long
	Private historySuccessAtTicks As Long
	Private startupSequenceInProgress As Boolean
	Private adWarmupDeferredAfterStartup As Boolean
End Sub

Public Sub Initialize(mainPage As B4XMainPage, retryTimerValue As Timer, dataPolicyValue As PlaybackDataPolicyState, orchestrationStateValue As PlaybackOrchestrationState, retryFallbackStateValue As PlaybackRetryFallbackState, queueStateValue As PlaybackQueueState, queueBuilderValue As PlaybackQueueBuilder, storageValue As KeyValueStore, trustedSyncKeyValue As String, offlineStoreValue As OfflineStore, dataResolverValue As DataPlaybackResolver, mediaCacheValue As MediaCache)
	owner = mainPage
	policyState = dataPolicyValue
	orchestrationStateRef = orchestrationStateValue
	retryFallbackStateRef = retryFallbackStateValue
	queueStateRef = queueStateValue
	queueBuilderRef = queueBuilderValue
	offlineStoreRef = offlineStoreValue
	dataResolverRef = dataResolverValue
	mediaCacheRef = mediaCacheValue
	storageRef = storageValue
	trustedSyncTimeKeyValue = trustedSyncKeyValue
	retryTimerRef = retryTimerValue
	offlineDataRef.Initialize
End Sub

Public Sub IncrementNetworkErrorCount
	consecutiveNetworkErrors = consecutiveNetworkErrors + 1
End Sub

Public Sub ResetConsecutiveNetworkErrors
	consecutiveNetworkErrors = 0
End Sub

Public Sub GetConsecutiveNetworkErrors As Int
	Return consecutiveNetworkErrors
End Sub

Public Sub SetLastRetryMode(mode As String)
	lastRetryMode = mode
End Sub

Public Sub GetLastRetryMode As String
	Return lastRetryMode
End Sub

Public Sub ClearLastRetryMode
	lastRetryMode = ""
End Sub

Public Sub SetLastDataOkNow
	dataSuccessAtTicks = DateTime.Now
End Sub

Public Sub GetLastDataOkAt As Long
	Return dataSuccessAtTicks
End Sub

Public Sub SetLastHistoryOkNow
	historySuccessAtTicks = DateTime.Now
End Sub

Public Sub GetLastHistoryOkAt As Long
	Return historySuccessAtTicks
End Sub

Public Sub PlayerCodeValue As String
	Return owner.PlayerCodeValue
End Sub

Public Sub DeviceIdValue As String
	Return owner.DeviceIdValue
End Sub

Public Sub TimezoneOffsetMinutesValue As Int
	Return owner.TimezoneOffsetMinutesValue
End Sub

Public Sub ClientOsNameValue As String
	Return owner.ClientOsNameValue
End Sub

Public Sub ServiceCheckUrlValue As String
	Return owner.ServiceCheckUrlValue
End Sub

Public Sub DataUrlValue As String
	Return owner.DataUrlValue
End Sub

Public Sub NextUrlValue As String
	Return owner.NextUrlValue
End Sub

Public Sub ClaimUrlValue As String
	Return owner.ClaimUrlValue
End Sub

Public Sub MessageValue(key As String) As String
	Return owner.Data_MessageValue(key)
End Sub

Public Sub TraceLog(message As String)
	owner.Data_TraceLog(message)
End Sub

Public Sub TraceInfo(category As String, message As String, details As String)
	owner.Data_TraceInfo(category, message, details)
End Sub

Public Sub TraceWarn(category As String, message As String, details As String)
	owner.Data_TraceWarn(category, message, details)
End Sub

Public Sub ConsumeLastException
	owner.Data_ConsumeLastException
End Sub

Public Sub ApplyClientRequestHeaders(j As HttpJob)
	owner.Data_ApplyClientRequestHeaders(j)
End Sub

Public Sub SaveServerSnapshot(method As String, url As String, success As Boolean, body As String, errorMessage As String)
	owner.Data_SaveServerSnapshot(method, url, success, body, errorMessage)
End Sub

Public Sub SecondsAgoText(ticksValue As Long) As String
	Return owner.Data_SecondsAgoText(ticksValue)
End Sub

Public Sub BeginOfflineDataRefresh As Boolean
	Return policyState.BeginOfflineDataRefresh
End Sub

Public Sub EndOfflineDataRefresh(stateValue As String)
	policyState.EndOfflineDataRefresh(stateValue)
End Sub

Public Sub SetLastOfflineDataRefreshState(stateValue As String)
	policyState.LastOfflineDataRefreshState = stateValue
End Sub

Public Sub LastOfflineDataRefreshState As String
	Return policyState.LastOfflineDataRefreshState
End Sub

Public Sub SetRemoteDataReady
	policyState.SetRemoteDataReady
End Sub

Public Sub ResumePlaybackWhenServerAllows As Boolean
	Return policyState.ResumePlaybackWhenServerAllows
End Sub

Public Sub ClearResumePlaybackWhenServerAllows
	policyState.ResumePlaybackWhenServerAllows = False
End Sub

Public Sub Storage As KeyValueStore
	Return storageRef
End Sub

Public Sub TrustedSyncTimeKey As String
	Return trustedSyncTimeKeyValue
End Sub

Public Sub SaveOfflineData(data As Map)
	offlineDataRef = offlineStoreRef.SaveOfflineData(data, PlayerCodeValue, DeviceIdValue)
	If offlineDataRef.IsInitialized = False Then offlineDataRef.Initialize
End Sub

Public Sub SetOfflineData(data As Map)
	If data.IsInitialized Then
		offlineDataRef = data
	Else
		offlineDataRef.Initialize
	End If
End Sub

Public Sub OfflineData As Map
	If offlineDataRef.IsInitialized = False Then offlineDataRef.Initialize
	Return offlineDataRef
End Sub

Public Sub IsTraceUploadEnabled As Boolean
	Dim snapshot As Map = OfflineData
	If snapshot.IsInitialized = False Then Return False
	If snapshot.GetDefault("ok", False) <> True Then Return False
	If snapshot.ContainsKey("trace") Then
		Return snapshot.GetDefault("trace", False) = True
	End If
	Dim playerData As Map = snapshot.GetDefault("player", Null)
	If playerData.IsInitialized = False Then Return False
	Return playerData.ContainsKey("trace") And playerData.GetDefault("trace", False) = True
End Sub

Public Sub FlushTraceBufferAsync
	owner.Data_FlushTraceBufferAsync
End Sub

Public Sub InvalidateRelevantTrackIdsCache
	owner.Data_InvalidateRelevantTrackIdsCache
End Sub

Public Sub RefreshConnectionIndicatorState
	owner.Data_RefreshConnectionIndicatorState
End Sub

Public Sub WriteHealthSnapshot(trigger As String)
	owner.Data_WriteHealthSnapshot(trigger)
End Sub

Public Sub IsStartupSequenceInProgress As Boolean
	Return startupSequenceInProgress
End Sub

Public Sub SetStartupSequenceInProgress(value As Boolean)
	startupSequenceInProgress = value
	If value = False Then adWarmupDeferredAfterStartup = False
End Sub

Public Sub DeferAdWarmupAfterStartup
	adWarmupDeferredAfterStartup = True
End Sub

Public Sub IsAdWarmupDeferredAfterStartup As Boolean
	Return adWarmupDeferredAfterStartup
End Sub

Public Sub EnsureAdCacheSyncAsync
	owner.Data_EnsureAdCacheSyncAsync
End Sub

Public Sub EffectiveNowTicks As Long
	Dim deviceNow As Long = DateTime.Now
	Dim trustedNow As Long = storageRef.GetDefault(trustedSyncTimeKeyValue, 0)
	If trustedNow > deviceNow Then Return trustedNow
	Return deviceNow
End Sub

Public Sub IsPlaybackStarted As Boolean
	Return orchestrationStateRef.IsStarted
End Sub

Public Sub IsStoppedByUser As Boolean
	Return orchestrationStateRef.IsStoppedByUser
End Sub

Public Sub IsUserStoppedState As Boolean
	Return orchestrationStateRef.IsStarted = False And policyState.IsPlaybackPausedByPolicy = False And orchestrationStateRef.IsStoppedByUser
End Sub

Public Sub IsPolicyPauseState As Boolean
	Return policyState.IsPlaybackPausedByPolicy
End Sub

Public Sub ShouldResumeWithNewStart As Boolean
	Return orchestrationStateRef.IsStarted And IsUserStoppedState = False And IsPolicyPauseState = False And orchestrationStateRef.IsStopping = False
End Sub

Public Sub IsStopping As Boolean
	Return orchestrationStateRef.IsStopping
End Sub

Public Sub EnterStartedState
	orchestrationStateRef.EnterStartedState
End Sub

Public Sub SetStopIcon
	owner.Data_SetStopIcon
End Sub

Public Sub HideContentBlocks
	owner.Data_HideContentBlocks
End Sub

Public Sub ResumePlaybackAfterPolicyPauseAsync
	owner.Data_ResumePlaybackAfterPolicyPauseAsync
End Sub

Public Sub ClearPolicyPause
	owner.Data_ClearPolicyPause
End Sub

Public Sub HandleMessageItem(item As Map)
	owner.Data_HandleMessageItem(item)
End Sub

Public Sub SyncOfflinePlaylistMetadata As ResumableSub
	Wait For (owner.Data_SyncOfflinePlaylistMetadata) Complete (synced As Boolean)
	Return synced
End Sub

Public Sub ApplyTemporaryMode(mode As String)
	owner.Data_ApplyTemporaryMode(mode)
End Sub

Public Sub ClearPlaybackState
	owner.Data_ClearPlaybackState
End Sub

Public Sub HidePin
	owner.Data_HidePin
End Sub

Public Sub ShowMessage(text As String)
	owner.Data_ShowMessage(text)
End Sub

Public Sub ScheduleRetry(mode As String, delayMs As Int)
	owner.Data_ScheduleRetry(mode, delayMs)
End Sub

Public Sub EnterPolicyPause(reason As String, connectionMode As String)
	owner.Data_EnterPolicyPause(reason, connectionMode)
End Sub

Public Sub SetPlaybackFlowState(stateValue As String, reason As String)
	owner.Data_SetPlaybackFlowState(stateValue, reason)
End Sub

Public Sub ClearPolicyPauseAndResumeRequest
	owner.Data_ClearPolicyPauseAndResumeRequest
End Sub

Public Sub EnterUserStoppedState
	owner.Data_EnterUserStoppedState
End Sub

Public Sub SetPlayIcon
	owner.Data_SetPlayIcon
End Sub

Public Sub EnterLocalPlayback
	owner.Data_EnterLocalPlayback
End Sub

Public Sub RequestSkipQueueSnapshotRestore(reason As String)
	queueStateRef.RequestSkipQueueSnapshotRestore
	TraceLog("снимок очереди восстановление skip reason=" & reason)
End Sub

Public Sub HasLocalPlaybackFallback As Boolean
	Return owner.Data_HasLocalPlaybackFallback
End Sub

Public Sub SetLocalFallbackReady(fallbackReady As Boolean)
	owner.Data_SetLocalFallbackReady(fallbackReady)
End Sub

Public Sub ResolveIdleUntilMessage(data As Map, targetTicks As Long) As String
	Return owner.Data_ResolveIdleUntilMessage(data, targetTicks)
End Sub

Public Sub DisableBackgroundRefreshTimers
	owner.Data_DisableBackgroundRefreshTimers
End Sub

Public Sub CanUseDataPlaybackResolver As Boolean
	Return queueBuilderRef.CanUseDataPlaybackResolver(OfflineData)
End Sub

Public Sub EnsureDataPlaybackReady As ResumableSub
	Wait For (queueBuilderRef.EnsureDataPlaybackReady(OfflineData)) Complete (resolverReady As Boolean)
	If resolverReady = False Then
		TraceLog("подготовка data playback ошибка")
	End If
	Return resolverReady
End Sub

Public Sub EnsureDataPlaybackQueue(playQueue As List, minItems As Int) As ResumableSub
	Wait For (queueBuilderRef.EnsureDataPlaybackQueue(playQueue, minItems, OfflineData, EffectiveNowTicks, storageRef, queueStateRef, dataResolverRef, mediaCacheRef)) Complete (queuePrepared As Boolean)
	Return queuePrepared
End Sub

' Пытается локально расширить queue plan до нужного lookahead, если data resolver уже доступен.
' Это удобный helper для backfill/warmup paths, где page не должна повторять одинаковую механику.
Public Sub TryEnsureQueueLookahead(playQueue As List, minItems As Int) As ResumableSub
	If CanUseDataPlaybackResolver = False Then Return False
	Wait For (EnsureDataPlaybackQueue(playQueue, minItems)) Complete (queuePrepared As Boolean)
	Return queuePrepared
End Sub

' Пытается локально подготовить queue plan без сетевого запроса.
' Возвращает status:
' - success: локальная очередь готова
' - resolver_unavailable: resolver не смог подготовиться
' - queue_empty: локальный plan не дал playable items
Public Sub TryPopulateQueueFromLocalPlan(playQueue As List, minItems As Int) As ResumableSub
	Dim result As Map
	result.Initialize
	result.Put("success", False)
	result.Put("status", "")
	result.Put("idle_text", "")
	ClearDispatchRetryAfter
	If CanUseDataPlaybackResolver = False Then
		Wait For (EnsureDataPlaybackReady) Complete (resolverReady As Boolean)
		If resolverReady = False Then
			result.Put("status", "resolver_unavailable")
			Return result
		End If
	End If
	Wait For (EnsureDataPlaybackQueue(playQueue, minItems)) Complete (queuePrepared As Boolean)
	If queuePrepared = False Then
		result.Put("status", "queue_empty")
		result.Put("idle_text", ResolveIdleUntilMessage(OfflineData, EffectiveNowTicks))
		Return result
	End If
	result.Put("success", True)
	result.Put("status", "success")
	Return result
End Sub

' Пытается стартовать player из уже локально доступного кэша, не дожидаясь сети.
' Это одна из главных частей автономного local plan: стартовать по текущему data slot и cached media.
Public Sub TrySeedFirstTrackFromCache(playQueue As List) As ResumableSub
	Dim emptyResult As Boolean = False
	If CanUseDataPlaybackResolver = False Then Return emptyResult
	Dim currentSlot As Map = dataResolverRef.ResolveDataSlotAtTicks(OfflineData, EffectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return emptyResult
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return emptyResult
	Dim workingCursors As Map = dataResolverRef.ClonePlaylistCursors
	Dim seeded As Boolean = False
	For attempt = 0 To playlists.Size - 1
		Dim playlistDescriptor As Map = dataResolverRef.ChooseNextPlaylistDescriptor(currentSlot, workingCursors)
		If playlistDescriptor.IsInitialized = False Or playlistDescriptor.Size = 0 Then Exit
		Dim playlistId As String = playlistDescriptor.GetDefault("id", "")
		If playlistId = "" Then Continue
		Dim playlistData As Map = dataResolverRef.LoadCachedPlaylistMetadata(playlistId)
		If playlistData.IsInitialized = False Or playlistData.Size = 0 Then Continue
		Dim cachedTrack As Map = dataResolverRef.ChooseRandomTrackFromPlaylist(playlistData, mediaCacheRef, True)
		If cachedTrack.IsInitialized = False Or cachedTrack.Size = 0 Then Continue
		Dim queueItem As Map = dataResolverRef.CreateQueueTrackFromPlaylist(currentSlot, playlistDescriptor, cachedTrack, OfflineData)
		playQueue.Add(queueItem)
		dataResolverRef.SavePreviewPlaylistCursors(storageRef, workingCursors)
		dataResolverRef.RememberResolvedTrack(queueItem.GetDefault("id", ""))
		dataResolverRef.RememberResolvedTrackForPlaylist(queueItem.GetDefault("playlist_id", ""), queueItem.GetDefault("id", ""))
		SaveQueueSnapshotState(playQueue)
		TraceLog("первый старт cache hit playlistId=" & playlistId & " trackId=" & queueItem.GetDefault("id", ""))
		seeded = True
		Exit
	Next
	Return seeded
End Sub

' Локальный plan signature описывает текущий data slot и набор playlist revisions.
' Playback может использовать его, чтобы понять, совместим ли сохраненный queue plan с текущим snapshot.
Public Sub BuildQueueSignature As String
	If OfflineData.IsInitialized = False Then Return ""
	Dim currentSlot As Map = dataResolverRef.ResolveDataSlotAtTicks(OfflineData, EffectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return ""
	Dim signatureParts As List
	signatureParts.Initialize
	signatureParts.Add("v=4")
	signatureParts.Add("slot=" & BuildDataSlotKey(currentSlot))
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized Then
		For Each playlistObject As Object In playlists
			If playlistObject Is Map Then
				Dim playlist As Map = playlistObject
				signatureParts.Add("playlist=" & playlist.GetDefault("id", "") & ":" & playlist.GetDefault("updated", ""))
			End If
		Next
	End If
	signatureParts.Sort(True)
	Return JoinList(signatureParts, "|")
End Sub

' Сохраняет краткий локальный plan вперед: только воспроизводимые track items из очереди и их signature.
Public Sub SaveQueueSnapshotState(playQueue As List)
	If playQueue.IsInitialized = False Then Return
	Dim signature As String = BuildQueueSignature
	If signature = "" Then Return
	Dim snapshotTracks As List
	snapshotTracks.Initialize
	For Each itemObject As Object In playQueue
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			snapshotTracks.Add(CloneMap(item))
			If snapshotTracks.Size >= 20 Then Exit
		End If
	Next
	queueStateRef.SaveQueueSnapshot(storageRef, signature, snapshotTracks, 20)
End Sub

' Сохраняет reserve queue только из реально кэшированных треков, чтобы player мог автономно пережить stop/offline state.
Public Sub CaptureStoppedReserveQueue(playQueue As List)
	If playQueue.IsInitialized = False Or playQueue.Size = 0 Then Return
	Dim currentSignature As String = BuildQueueSignature
	If currentSignature = "" Then Return
	Dim reserveQueue As List
	reserveQueue.Initialize
	For Each itemObject As Object In playQueue
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			If mediaCacheRef.IsTrackCached(item.GetDefault("id", "")) = False Then Continue
			reserveQueue.Add(CloneMap(item))
		End If
	Next
	queueStateRef.CaptureStoppedReserve(reserveQueue, currentSignature)
	If queueStateRef.StoppedReserveQueue.Size = 0 Then Return
	TraceLog("резерв очереди save tracks=" & queueStateRef.StoppedReserveQueue.Size)
End Sub

' Восстанавливает reserve queue только если текущий data plan совпадает по signature
' и у элементов все еще есть локальные медиафайлы.
Public Sub RestoreStoppedReserveQueue(playQueue As List) As Boolean
	If queueStateRef.StoppedReserveQueue.IsInitialized = False Or queueStateRef.StoppedReserveQueue.Size = 0 Then Return False
	Dim currentSignature As String = BuildQueueSignature
	If currentSignature = "" Then Return False
	If queueStateRef.CanRestoreStoppedReserve(currentSignature) = False Then
		queueStateRef.ClearStoppedReserve
		Return False
	End If
	Dim restoredQueue As List
	restoredQueue.Initialize
	For Each itemObject As Object In queueStateRef.StoppedReserveQueue
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			If mediaCacheRef.IsTrackCached(item.GetDefault("id", "")) = False Then Continue
			restoredQueue.Add(CloneMap(item))
		End If
	Next
	queueStateRef.ClearStoppedReserve
	If playQueue.IsInitialized = False Then playQueue.Initialize
	playQueue.Clear
	Dim restoredCount As Int = 0
	For Each restoredObject As Object In restoredQueue
		playQueue.Add(restoredObject)
		restoredCount = restoredCount + 1
	Next
	Return restoredCount > 0
End Sub

Public Sub ClearQueueSnapshotState
	queueStateRef.ClearQueueSnapshot(storageRef)
	TraceLog("снимок очереди clear")
End Sub

Public Sub ResolveRetryDelay(mode As String, delayMs As Int, localRetryMax As Int, serverRetryMax As Int, blockedRetryDelay As Int) As Int
	Return retryFallbackStateRef.ResolveRetryDelay(mode, delayMs, localRetryMax, serverRetryMax, blockedRetryDelay)
End Sub

Public Sub ClearRetryTimer
	retryTimerRef.Enabled = False
	ClearLastRetryMode
End Sub

Public Sub SetRetryInterval(value As Int)
	retryTimerRef.Interval = value
End Sub

Public Sub GetRetryInterval As Int
	Return retryTimerRef.Interval
End Sub

Public Sub IsPlaybackPausedByPolicy As Boolean
	Return policyState.IsPlaybackPausedByPolicy
End Sub

Public Sub EnableRetryTimer
	retryTimerRef.Enabled = True
End Sub

Public Sub ResetRetryDelayState(localRetryInitial As Int, serverRetryInitial As Int)
	retryFallbackStateRef.ResetRetryDelays(localRetryInitial, serverRetryInitial)
	If GetConsecutiveNetworkErrors > 0 Then TraceInfo("network", "retry сброшен", "errors=" & GetConsecutiveNetworkErrors)
	ResetConsecutiveNetworkErrors
End Sub

Public Sub ClearDispatchRetryAfter
	retryFallbackStateRef.ClearDispatchRetryAfter
End Sub

Public Sub SetDispatchRetryAfter(value As Int)
	retryFallbackStateRef.SetDispatchRetryAfter(value)
End Sub

Public Sub ConsumeDispatchRetryAfter As Int
	Return retryFallbackStateRef.ConsumeDispatchRetryAfter
End Sub

Public Sub SetMediaPathDegraded(value As Boolean)
	retryFallbackStateRef.SetMediaPathDegraded(value)
End Sub

Public Sub IsMediaPathDegraded As Boolean
	Return retryFallbackStateRef.IsMediaPathDegraded
End Sub

Public Sub ResolveDataSlotAtTicks(data As Map, targetTicks As Long) As Map
	Return dataResolverRef.ResolveDataSlotAtTicks(data, targetTicks)
End Sub

Public Sub ResolveCurrentDataSlot(data As Map) As Map
	Return dataResolverRef.ResolveCurrentDataSlot(data)
End Sub

Public Sub ResolveNextDataSlotAtTicks(data As Map, targetTicks As Long) As Map
	Return dataResolverRef.ResolveNextDataSlotAtTicks(data, targetTicks)
End Sub

Public Sub LoadCachedPlaylistMetadata(playlistId As String) As Map
	Return dataResolverRef.LoadCachedPlaylistMetadata(playlistId)
End Sub

Public Sub IsTrackCached(trackId As String) As Boolean
	Return mediaCacheRef.IsTrackCached(trackId)
End Sub

Private Sub IsValidDataTrackItem(item As Map) As Boolean
	If item.IsInitialized = False Or item.Size = 0 Then Return False
	If item.GetDefault("type", "") <> "track" Then Return False
	If item.GetDefault("id", "") = "" Then Return False
	Return True
End Sub

Private Sub BuildDataSlotKey(currentSlot As Map) As String
	Return currentSlot.GetDefault("schedule_title", "") & "|" & currentSlot.GetDefault("stream_id", "") & "|" & currentSlot.GetDefault("slot_time", "")
End Sub

Private Sub CloneMap(sourceMap As Map) As Map
	Dim clonedMap As Map
	clonedMap.Initialize
	If sourceMap.IsInitialized = False Then Return clonedMap
	For Each key As Object In sourceMap.Keys
		clonedMap.Put(key, sourceMap.Get(key))
	Next
	Return clonedMap
End Sub

Private Sub JoinList(items As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To items.Size - 1
		If i > 0 Then sb.Append(separator)
		sb.Append(items.Get(i))
	Next
	Return sb.ToString
End Sub
