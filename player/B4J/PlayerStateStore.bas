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
	Private localRetryDelay As Int
	Private serverRetryDelay As Int
	Private dispatchRetryAfter As Int
	Private mediaPathDegradedFlag As Boolean
End Sub

Public Sub Initialize(mainPage As B4XMainPage, retryTimerValue As Timer, dataPolicyValue As PlaybackDataPolicyState, orchestrationStateValue As PlaybackOrchestrationState, storageValue As KeyValueStore, trustedSyncKeyValue As String, offlineStoreValue As OfflineStore, dataResolverValue As DataPlaybackResolver, mediaCacheValue As MediaCache, localRetryInitial As Int, serverRetryInitial As Int)
	owner = mainPage
	policyState = dataPolicyValue
	orchestrationStateRef = orchestrationStateValue
	offlineStoreRef = offlineStoreValue
	dataResolverRef = dataResolverValue
	mediaCacheRef = mediaCacheValue
	storageRef = storageValue
	trustedSyncTimeKeyValue = trustedSyncKeyValue
	retryTimerRef = retryTimerValue
	offlineDataRef.Initialize
	ResetRetryDelayState(localRetryInitial, serverRetryInitial)
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

Public Sub CheckForAppUpdate(data As Map)
	owner.Data_CheckForAppUpdate(data)
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

Public Sub HasLocalPlaybackFallback As Boolean
	Return owner.Data_HasLocalPlaybackFallback
End Sub

Public Sub GetCurrentSlotLocalReserveCount As Int
	Return owner.Data_GetCurrentSlotLocalReserveCount
End Sub

Public Sub GetLocalPlayableQueueCount(playQueue As List) As Int
	If playQueue.IsInitialized = False Then Return 0
	Dim totalCount As Int = 0
	For Each itemObject As Object In playQueue
		If (itemObject Is Map) = False Then Continue
		Dim item As Map = itemObject
		If item.GetDefault("type", "") <> "track" Then Continue
		If mediaCacheRef.HasValidatedLocalMedia(item) = False Then Continue
		totalCount = totalCount + 1
	Next
	Return totalCount
End Sub

Public Sub ResolveIdleUntilMessage(data As Map, targetTicks As Long) As String
	Return owner.Data_ResolveIdleUntilMessage(data, targetTicks)
End Sub

Public Sub DisableBackgroundRefreshTimers
	owner.Data_DisableBackgroundRefreshTimers
End Sub

' Пытается стартовать player из уже локально доступного кэша, не дожидаясь сети.
' Это одна из главных частей автономного local plan: стартовать по текущему data slot и cached media.
Public Sub ResolveNextLocalTrackItem As Map
	Dim emptyItem As Map
	emptyItem.Initialize
	mediaCacheRef.EnsureTrackCacheReady
	If HasUsableDataPlaybackInstructions = False Then Return ResolveAnyCachedLocalTrackItem(emptyItem)
	Dim currentSlot As Map = dataResolverRef.ResolveDataSlotAtTicks(OfflineData, EffectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then
		Return ResolveAnyCachedLocalTrackItem(emptyItem)
	End If
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then
		Return ResolveAnyCachedLocalTrackItem(emptyItem)
	End If
	Dim resolvedItem As Map = ResolveSequentialSlotTrackItem(currentSlot, playlists)
	If resolvedItem.IsInitialized And resolvedItem.Size > 0 Then Return resolvedItem
	resolvedItem = ResolveSlotScopedCachedTrackItem(currentSlot, playlists)
	Return resolvedItem
End Sub

Private Sub ResolveSequentialSlotTrackItem(currentSlot As Map, playlists As List) As Map
	Dim emptyItem As Map
	emptyItem.Initialize
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return emptyItem
	Dim slotKey As String = BuildDataSlotKey(currentSlot)
	Dim workingCursors As Map = dataResolverRef.ClonePlaylistCursors
	Dim cursorValue As Int = workingCursors.GetDefault(slotKey, 0)
	If cursorValue < 0 Then cursorValue = 0
	Dim startIndex As Int = cursorValue Mod playlists.Size
	Dim selectedItem As Map
	selectedItem.Initialize
	For offset = 0 To playlists.Size - 1
		Dim playlistIndex As Int = (startIndex + offset) Mod playlists.Size
		Dim playlistObject As Object = playlists.Get(playlistIndex)
		If (playlistObject Is Map) = False Then Continue
		Dim playlistDescriptor As Map = playlistObject
		Dim playlistId As String = playlistDescriptor.GetDefault("id", "")
		If playlistId = "" Then Continue
		Dim cachedTrack As Map = dataResolverRef.ResolveOrderedCachedTrackFromPlaylistById(playlistId, mediaCacheRef)
		If cachedTrack.IsInitialized = False Or cachedTrack.Size = 0 Then Continue
		Dim normalizedDescriptor As Map = CloneMap(playlistDescriptor)
		normalizedDescriptor.Put("_slot_key", slotKey)
		normalizedDescriptor.Put("_playlist_index", playlistIndex)
		workingCursors.Put(slotKey, playlistIndex + 1)
		dataResolverRef.SavePreviewPlaylistCursors(storageRef, workingCursors)
		Dim queueItem As Map = dataResolverRef.CreateQueueTrackFromPlaylist(currentSlot, normalizedDescriptor, cachedTrack, OfflineData)
		selectedItem = queueItem
		Exit
	Next
	If selectedItem.IsInitialized And selectedItem.Size > 0 Then Return selectedItem
	Return emptyItem
End Sub

Private Sub HasUsableDataPlaybackInstructions As Boolean
	Dim data As Map = OfflineData
	If data.IsInitialized = False Then Return False
	If data.GetDefault("ok", False) <> True Then Return False
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return False
	Return True
End Sub

Private Sub ResolveAnyCachedLocalTrackItem(currentSlot As Map) As Map
	Dim emptyItem As Map
	emptyItem.Initialize
	mediaCacheRef.EnsureTrackCacheReady
	Dim playlistStats As Map = mediaCacheRef.GetCachedTrackPlaylistStats
	Dim fallbackSlot As Map = currentSlot
	If fallbackSlot.IsInitialized = False Or fallbackSlot.Size = 0 Then
		fallbackSlot = dataResolverRef.ResolveDataSlotAtTicks(OfflineData, EffectiveNowTicks)
	End If
	If fallbackSlot.IsInitialized = False Then fallbackSlot.Initialize
	Dim playlistIds As List
	playlistIds.Initialize
	If playlistStats.IsInitialized And playlistStats.Size > 0 Then
		For Each playlistId As String In playlistStats.Keys
			If playlistId = "" Or playlistId = "_unknown" Then Continue
			playlistIds.Add(playlistId)
		Next
	End If
	If playlistIds.Size = 0 Then
		playlistIds = mediaCacheRef.GetCachedTrackPlaylistIdsOnDisk
	End If
	Dim startIndex As Int = 0
	If playlistIds.Size > 1 Then startIndex = Rnd(0, playlistIds.Size)
	Dim selectedItem As Map
	selectedItem.Initialize
	If playlistIds.Size > 0 Then
		For offset = 0 To playlistIds.Size - 1
			Dim playlistId As String = playlistIds.Get((startIndex + offset) Mod playlistIds.Size)
			Dim cachedTrack As Map = dataResolverRef.ResolveOrderedCachedTrackFromPlaylistById(playlistId, mediaCacheRef)
			If cachedTrack.IsInitialized = False Or cachedTrack.Size = 0 Then Continue
			Dim descriptor As Map
			descriptor.Initialize
			descriptor.Put("id", playlistId)
			descriptor.Put("title", cachedTrack.GetDefault("playlist_title", ""))
			descriptor.Put("_slot_key", BuildDataSlotKey(fallbackSlot))
			descriptor.Put("_playlist_index", 0)
			Dim queueItem As Map = dataResolverRef.CreateQueueTrackFromPlaylist(fallbackSlot, descriptor, cachedTrack, OfflineData)
			selectedItem = queueItem
			Exit
		Next
	End If
	If selectedItem.IsInitialized = False Or selectedItem.Size = 0 Then
		Dim indexedTrack As Map = mediaCacheRef.ResolveAnyCachedTrackFromIndex("", "")
		If indexedTrack.IsInitialized And indexedTrack.Size > 0 Then
			Dim indexedDescriptor As Map
			indexedDescriptor.Initialize
			indexedDescriptor.Put("id", indexedTrack.GetDefault("playlist_id", ""))
			indexedDescriptor.Put("title", indexedTrack.GetDefault("playlist_title", ""))
			indexedDescriptor.Put("_slot_key", BuildDataSlotKey(fallbackSlot))
			indexedDescriptor.Put("_playlist_index", 0)
			Dim indexedQueueItem As Map = dataResolverRef.CreateQueueTrackFromPlaylist(fallbackSlot, indexedDescriptor, indexedTrack, OfflineData)
			selectedItem = indexedQueueItem
		End If
	End If
	If selectedItem.IsInitialized And selectedItem.Size > 0 Then Return selectedItem
	Return emptyItem
End Sub

Private Sub ResolveSlotScopedCachedTrackItem(currentSlot As Map, playlists As List) As Map
	Dim emptyItem As Map
	emptyItem.Initialize
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return emptyItem
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return emptyItem
	
	mediaCacheRef.EnsureTrackCacheReady
	Dim slotKey As String = BuildDataSlotKey(currentSlot)
	Dim workingCursors As Map = dataResolverRef.ClonePlaylistCursors
	Dim cursorValue As Int = workingCursors.GetDefault(slotKey, 0)
	If cursorValue < 0 Then cursorValue = 0
	Dim startIndex As Int = cursorValue Mod playlists.Size
	
	For offset = 0 To playlists.Size - 1
		Dim playlistIndex As Int = (startIndex + offset) Mod playlists.Size
		Dim playlistObject As Object = playlists.Get(playlistIndex)
		If (playlistObject Is Map) = False Then Continue
		
		Dim playlistDescriptor As Map = playlistObject
		Dim playlistId As String = playlistDescriptor.GetDefault("id", "")
		If playlistId = "" Then Continue
		
		Dim cachedTrack As Map = mediaCacheRef.ResolveAnyCachedTrackFromIndex(playlistId, "")
		If cachedTrack.IsInitialized = False Or cachedTrack.Size = 0 Then Continue
		
		Dim normalizedDescriptor As Map = CloneMap(playlistDescriptor)
		normalizedDescriptor.Put("_slot_key", slotKey)
		normalizedDescriptor.Put("_playlist_index", playlistIndex)
		Dim queueItem As Map = dataResolverRef.CreateQueueTrackFromPlaylist(currentSlot, normalizedDescriptor, cachedTrack, OfflineData)
		If queueItem.IsInitialized And queueItem.Size > 0 Then Return queueItem
	Next
	
	Return emptyItem
End Sub

Public Sub ResolveRetryDelay(mode As String, delayMs As Int, localRetryMax As Int, serverRetryMax As Int, blockedRetryDelay As Int) As Int
	If delayMs > 0 Then Return delayMs
	If mode = "network" Then
		Dim delay As Int = localRetryDelay
		localRetryDelay = Min(localRetryDelay * 2, localRetryMax)
		Return delay
	End If
	If mode = "blocked" Then Return blockedRetryDelay
	Dim delayServer As Int = serverRetryDelay
	serverRetryDelay = Min(serverRetryDelay * 2, serverRetryMax)
	Return delayServer
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
	localRetryDelay = localRetryInitial
	serverRetryDelay = serverRetryInitial
	dispatchRetryAfter = 0
	mediaPathDegradedFlag = False
	If GetConsecutiveNetworkErrors > 0 Then TraceInfo("network", "retry сброшен", "errors=" & GetConsecutiveNetworkErrors)
	ResetConsecutiveNetworkErrors
End Sub

Public Sub ClearDispatchRetryAfter
	dispatchRetryAfter = 0
End Sub

Public Sub SetDispatchRetryAfter(value As Int)
	dispatchRetryAfter = Max(0, value)
End Sub

Public Sub ConsumeDispatchRetryAfter As Int
	Dim value As Int = dispatchRetryAfter
	dispatchRetryAfter = 0
	Return value
End Sub

Public Sub SetMediaPathDegraded(value As Boolean)
	mediaPathDegradedFlag = value
End Sub

Public Sub IsMediaPathDegraded As Boolean
	Return mediaPathDegradedFlag
End Sub

Public Sub UpdateMediaPathDegradedFromCacheSync(downloaded As Boolean, networkFailure As Boolean) As String
	Dim previous As Boolean = mediaPathDegradedFlag
	If downloaded Then
		mediaPathDegradedFlag = False
	Else If networkFailure Then
		mediaPathDegradedFlag = True
	End If
	If previous = False And mediaPathDegradedFlag Then Return "entered"
	If previous = True And mediaPathDegradedFlag = False Then Return "recovered"
	Return ""
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

Public Sub HasAnyCachedTrack As Boolean
	mediaCacheRef.EnsureTrackCacheReady
	If mediaCacheRef.GetCachedTrackCount > 0 Then Return True
	Dim playlistStats As Map = mediaCacheRef.GetCachedTrackPlaylistStats
	If playlistStats.IsInitialized And playlistStats.Size > 0 Then Return True
	Return mediaCacheRef.HasAnyTrackFilesOnDisk
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
