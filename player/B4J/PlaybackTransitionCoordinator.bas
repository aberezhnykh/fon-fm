B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Координатор переходов между элементами очереди.
' Здесь собрана логика prepared/prefetch/promote без владения самим playback-state.

Sub Class_Globals
	Private targetPage As B4XMainPage
End Sub

Public Sub Initialize(targetPageValue As B4XMainPage)
	targetPage = targetPageValue
End Sub

' Выбирает свободный audio slot относительно текущего active slot.
Public Sub GetInactiveAudioKey(runtimeState As PlaybackRuntimeState) As String
	If targetPage.Transition_GetDirectorActiveAudioKey = "primary" Then Return "secondary"
	Return "primary"
End Sub

' Проверяет, что prepared slot реально пригоден для немедленного promote.
Public Sub HasUsablePreparedItem(runtimeState As PlaybackRuntimeState) As Boolean
	Dim preparedAudioKey As String = targetPage.Transition_GetDirectorPreparedAudioKey
	Dim preparedItem As Map = targetPage.Transition_GetDirectorPreparedItem
	If preparedAudioKey = "" Then Return False
	If preparedItem.IsInitialized = False Then Return False
	Dim preparedType As String = preparedItem.GetDefault("type", "")
	Return preparedType = "track" Or preparedType = "ad"
End Sub

' Общая проверка, можно ли использовать prepared item в текущем transition-сценарии.
Public Sub CanUsePreparedTransition(runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, transitionInProgress As Boolean, currentType As String, preparedType As String, decisionName As String) As Boolean
	If transitionInProgress Then Return False
	If orchestrationState.IsCrossfadeTriggered Then Return False
	If metaState.CurrentMediaType <> currentType Then Return False
	If HasUsablePreparedItem(runtimeState) = False Then Return False
	Dim preparedItem As Map = targetPage.Transition_GetDirectorPreparedItem
	Return preparedItem.GetDefault("type", "") = preparedType
End Sub

Public Sub CanCrossfadePreparedItem(runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, transitionInProgress As Boolean) As Boolean
	Return CanUsePreparedTransition(runtimeState, metaState, orchestrationState, transitionInProgress, "track", "track", "crossfade")
End Sub

Public Sub CanStartPreparedOnTrackTail(runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, transitionInProgress As Boolean) As Boolean
	Return CanUsePreparedTransition(runtimeState, metaState, orchestrationState, transitionInProgress, "track", "ad", "tail_start")
End Sub

Public Sub PreparedFadeOutMs(metaState As PlaybackMetaState, runtimeState As PlaybackRuntimeState, trackOverlapMs As Int, adTailOverlapMs As Int) As Int
	If metaState.CurrentMediaType <> "track" Then Return 0
	Dim preparedItem As Map = targetPage.Transition_GetDirectorPreparedItem
	If preparedItem.IsInitialized = False Then Return 0
	Dim nextType As String = preparedItem.GetDefault("type", "")
	If nextType = "track" Then Return trackOverlapMs
	If nextType = "ad" Then Return adTailOverlapMs
	Return 0
End Sub

' Подготавливает следующий playable item заранее, но не ломает очередь и не перепрыгивает через break.
Public Sub PrepareNextPlayable(playQueue As List, runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, mediaCacheService As MediaCache, playbackFlowState As String, flowPlaying As String, flowIdle As String, flowPreparing As String) As ResumableSub
	Dim candidateIndex As Int = -1
	Do While playQueue.Size > 0
		Dim scanIndex As Int = candidateIndex + 1
		If scanIndex < 0 Then scanIndex = 0
		If scanIndex >= playQueue.Size Then Return False
		Dim nextObject As Object = playQueue.Get(scanIndex)
		If nextObject Is Map Then
		Else
			Return False
		End If
		Dim candidateItem As Map = nextObject
		Dim candidateType As String = candidateItem.GetDefault("type", "")
		If candidateType = "break" Then
			Trace("prefetch skip reason=break_ahead item=" & DescribeItem(candidateItem))
			candidateIndex = scanIndex
			Continue
		End If
		If candidateType <> "track" And candidateType <> "ad" Then Return False
		Dim activeItem As Map = targetPage.Transition_GetDirectorActiveItem
		If ItemsMatch(activeItem, candidateItem) Then
			Trace("prefetch skip reason=active_item item=" & DescribeItem(candidateItem))
			candidateIndex = scanIndex
			Continue
		End If
		If candidateType = "track" And mediaCacheService.IsTrackCached(candidateItem.GetDefault("id", "")) = False Then
			Trace("переход очередь drop reason=no_local_track item=" & DescribeItem(candidateItem))
			playQueue.RemoveAt(scanIndex)
			targetPage.Transition_SaveQueueSnapshotState
			candidateIndex = -1
			Continue
		End If
		If candidateType = "ad" And mediaCacheService.IsAdCached(candidateItem.GetDefault("id", "")) = False Then
			Trace("переход очередь drop reason=no_local_ad item=" & DescribeItem(candidateItem))
			playQueue.RemoveAt(scanIndex)
			targetPage.Transition_SaveQueueSnapshotState
			candidateIndex = -1
			Continue
		End If
		candidateIndex = scanIndex
		Exit
	Loop
	If candidateIndex < 0 Or candidateIndex >= playQueue.Size Then Return False
	Dim nextItem As Map = playQueue.Get(candidateIndex)
	Dim existingPreparedItem As Map = targetPage.Transition_GetDirectorPreparedItem
	Dim existingPreparedAudioKey As String = targetPage.Transition_GetDirectorPreparedAudioKey
	If existingPreparedItem.IsInitialized And existingPreparedAudioKey <> "" Then
		Dim matchArgs As Map
		matchArgs.Initialize
		matchArgs.Put("first", existingPreparedItem)
		matchArgs.Put("second", nextItem)
		If targetPage.Transition_ItemsMatch(matchArgs) Then
			Trace("prefetch reuse prepared item=" & DescribeItem(nextItem))
			Return True
		End If
	End If
	Dim targetAudioKey As String = GetInactiveAudioKey(runtimeState)
	targetPage.Transition_ClearPreparedState(False)
	Dim pendingPrepareArgs As Map
	pendingPrepareArgs.Initialize
	pendingPrepareArgs.Put("audioKey", targetAudioKey)
	pendingPrepareArgs.Put("item", nextItem)
	targetPage.Transition_SetDirectorPendingPrepare(pendingPrepareArgs)
	Dim previousFlowState As String = playbackFlowState
	If playbackFlowState = flowPlaying Or playbackFlowState = flowIdle Then
		Dim flowArgs As Map
		flowArgs.Initialize
		flowArgs.Put("state", flowPreparing)
		flowArgs.Put("reason", "prepare_next:" & nextItem.GetDefault("type", ""))
		targetPage.Transition_SetPlaybackFlowState(flowArgs)
	End If
	Dim mediaArgs As Map
	mediaArgs.Initialize
	mediaArgs.Put("audioKey", targetAudioKey)
	mediaArgs.Put("item", nextItem)
	Dim nextItemUrl As String = targetPage.Transition_ResolvePlaybackMediaUrl(mediaArgs)
	If nextItemUrl = "" Then
		Trace("переход preload ошибка audio=" & targetAudioKey & " message=empty_media_url")
		Return False
	End If
	Trace("prefetch load audio=" & targetAudioKey & " item=" & DescribeItem(nextItem))
	Dim volume As Double = targetPage.Transition_CurrentVolume(nextItem)
	Dim targetAudio As AudioPlayer = targetPage.Transition_GetAudioByKey(targetAudioKey)
	targetAudio.LoadUrl(nextItemUrl, volume)
	Dim waitArgs As Map
	waitArgs.Initialize
	waitArgs.Put("audioKey", targetAudioKey)
	waitArgs.Put("item", nextItem)
	waitArgs.Put("timeoutMs", 5000)
	Wait For (targetPage.Transition_WaitForPreparedAudio(waitArgs)) Complete (result As Map)
	If targetPage.Transition_GetPlaybackFlowState = flowPreparing Then
		If result.GetDefault("Success", False) Then
			Dim readyArgs As Map
			readyArgs.Initialize
			readyArgs.Put("state", previousFlowState)
			readyArgs.Put("reason", "prepare_ready")
			targetPage.Transition_SetPlaybackFlowState(readyArgs)
			Trace("prefetch prepared audio=" & targetAudioKey & " item=" & DescribeItem(nextItem))
		Else
			Dim failedArgs As Map
			failedArgs.Initialize
			failedArgs.Put("state", "error")
			failedArgs.Put("reason", "prepare_failed")
			targetPage.Transition_SetPlaybackFlowState(failedArgs)
			Trace("переход preload ошибка audio=" & targetAudioKey)
		End If
	End If
	Return result.GetDefault("Success", False)
End Sub

' Поднимает prepared slot в active playback и выполняет сопутствующую очистку/фиксацию курсора.
Public Sub PromotePreparedPlayer(runtimeState As PlaybackRuntimeState, dataResolver As DataPlaybackResolver, storage As KeyValueStore, fadeInMs As Int, fadeOutMs As Int, flowTransitioning As String) As Boolean
	Dim preparedAudioKey As String = targetPage.Transition_GetDirectorPreparedAudioKey
	Dim preparedItem As Map = targetPage.Transition_GetDirectorPreparedItem
	If preparedAudioKey = "" Or preparedItem.IsInitialized = False Then
		Trace("переход prepared reject reason=missing_prepared")
		Return False
	End If
	Dim flowArgs As Map
	flowArgs.Initialize
	flowArgs.Put("state", flowTransitioning)
	flowArgs.Put("reason", "promote_prepared")
	targetPage.Transition_SetPlaybackFlowState(flowArgs)
	Dim previousAudioKey As String = targetPage.Transition_GetDirectorActiveAudioKey
	Dim nextAudioKey As String = preparedAudioKey
	Dim promotedItem As Map = CloneMap(preparedItem)
	targetPage.Transition_ConsumePreparedQueueItem
	If previousAudioKey <> "" And previousAudioKey <> nextAudioKey Then
		Dim previousAudio As AudioPlayer = targetPage.Transition_GetAudioByKey(previousAudioKey)
		previousAudio.Stop(fadeOutMs)
	End If
	dataResolver.CommitPlaylistCursor(storage, promotedItem)
	targetPage.Transition_SaveQueueSnapshotState
	Dim activateArgs As Map
	activateArgs.Initialize
	activateArgs.Put("audioKey", nextAudioKey)
	activateArgs.Put("item", promotedItem)
	activateArgs.Put("fadeInMs", fadeInMs)
	Trace("prepared promote audio=" & nextAudioKey & " type=" & promotedItem.GetDefault("type", "") & " id=" & promotedItem.GetDefault("id", ""))
	targetPage.Transition_ActivateLoadedItem(activateArgs)
	targetPage.Transition_ClearPreparedState(False)
	Return True
End Sub

Private Sub DescribeItem(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Return targetPage.Transition_DescribeItem(item)
End Sub

Private Sub ItemsMatch(firstItem As Map, secondItem As Map) As Boolean
	Dim args As Map
	args.Initialize
	args.Put("first", firstItem)
	args.Put("second", secondItem)
	Return targetPage.Transition_ItemsMatch(args)
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

Private Sub Trace(message As String)
	targetPage.TraceLog(message)
End Sub
