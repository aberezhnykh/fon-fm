B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private targetModule As Object
	Private traceSubName As String
End Sub

Public Sub Initialize(targetModuleValue As Object, traceSubNameValue As String)
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
End Sub

Public Sub GetInactiveAudioKey(runtimeState As PlaybackRuntimeState) As String
	If runtimeState.ActiveAudioKey = "primary" Then Return "secondary"
	Return "primary"
End Sub

Public Sub HasUsablePreparedItem(runtimeState As PlaybackRuntimeState) As Boolean
	If runtimeState.PreparedAudioKey = "" Then Return False
	If runtimeState.PreparedItem.IsInitialized = False Then Return False
	Dim preparedType As String = runtimeState.PreparedItem.GetDefault("type", "")
	Return preparedType = "track" Or preparedType = "ad"
End Sub

Public Sub CanUsePreparedTransition(runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, transitionInProgress As Boolean, currentType As String, preparedType As String, decisionName As String) As Boolean
	If transitionInProgress Then Return False
	If orchestrationState.IsCrossfadeTriggered Then Return False
	If metaState.CurrentMediaType <> currentType Then Return False
	If HasUsablePreparedItem(runtimeState) = False Then Return False
	Return runtimeState.PreparedItem.GetDefault("type", "") = preparedType
End Sub

Public Sub CanCrossfadePreparedItem(runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, transitionInProgress As Boolean) As Boolean
	Return CanUsePreparedTransition(runtimeState, metaState, orchestrationState, transitionInProgress, "track", "track", "crossfade")
End Sub

Public Sub CanStartPreparedOnTrackTail(runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, transitionInProgress As Boolean) As Boolean
	Return CanUsePreparedTransition(runtimeState, metaState, orchestrationState, transitionInProgress, "track", "ad", "tail_start")
End Sub

Public Sub PreparedFadeOutMs(metaState As PlaybackMetaState, runtimeState As PlaybackRuntimeState, trackOverlapMs As Int, adTailOverlapMs As Int) As Int
	If metaState.CurrentMediaType <> "track" Then Return 0
	If runtimeState.PreparedItem.IsInitialized = False Then Return 0
	Dim nextType As String = runtimeState.PreparedItem.GetDefault("type", "")
	If nextType = "track" Then Return trackOverlapMs
	If nextType = "ad" Then Return adTailOverlapMs
	Return 0
End Sub

Public Sub PrepareNextPlayable(playQueue As List, runtimeState As PlaybackRuntimeState, metaState As PlaybackMetaState, orchestrationState As PlaybackOrchestrationState, mediaCacheService As MediaCache, playbackFlowState As String, flowPlaying As String, flowIdle As String, flowPreparing As String) As ResumableSub
	Do While playQueue.Size > 0
		Dim nextObject As Object = playQueue.Get(0)
		If nextObject Is Map Then
		Else
			Return False
		End If
		Dim candidateItem As Map = nextObject
		Dim candidateType As String = candidateItem.GetDefault("type", "")
		If candidateType <> "track" And candidateType <> "ad" Then Return False
		If candidateType = "track" And mediaCacheService.IsTrackCached(candidateItem.GetDefault("id", "")) = False Then
			Trace("Удален из очереди трек без локального файла. item=" & DescribeItem(candidateItem))
			playQueue.RemoveAt(0)
			CallSub(targetModule, "Transition_SaveQueueSnapshotState")
			Continue
		End If
		If candidateType = "ad" And mediaCacheService.IsAdCached(candidateItem.GetDefault("id", "")) = False Then
			Trace("Удален из очереди ролик без локального файла. item=" & DescribeItem(candidateItem))
			playQueue.RemoveAt(0)
			CallSub(targetModule, "Transition_SaveQueueSnapshotState")
			Continue
		End If
		Exit
	Loop
	If playQueue.Size = 0 Then Return False
	Dim nextItem As Map = playQueue.Get(0)
	If runtimeState.PreparedItem.IsInitialized And runtimeState.PreparedAudioKey <> "" Then
		Dim matchArgs As Map
		matchArgs.Initialize
		matchArgs.Put("first", runtimeState.PreparedItem)
		matchArgs.Put("second", nextItem)
		If CallSub2(targetModule, "Transition_ItemsMatch", matchArgs) Then
			Trace("PlaybackTransitionCoordinator prepared item accepted. item=" & DescribeItem(nextItem))
			Return True
		End If
	End If
	Dim targetAudioKey As String = GetInactiveAudioKey(runtimeState)
	CallSub2(targetModule, "Transition_ClearPreparedState", False)
	runtimeState.SetPendingPrepare(targetAudioKey, nextItem)
	Dim previousFlowState As String = playbackFlowState
	If playbackFlowState = flowPlaying Or playbackFlowState = flowIdle Then
		Dim flowArgs As Map
		flowArgs.Initialize
		flowArgs.Put("state", flowPreparing)
		flowArgs.Put("reason", "prepare_next:" & nextItem.GetDefault("type", ""))
		CallSub2(targetModule, "Transition_SetPlaybackFlowState", flowArgs)
	End If
	Dim mediaArgs As Map
	mediaArgs.Initialize
	mediaArgs.Put("audioKey", targetAudioKey)
	mediaArgs.Put("item", nextItem)
	Dim nextItemUrl As String = CallSub2(targetModule, "Transition_ResolvePlaybackMediaUrl", mediaArgs)
	If nextItemUrl = "" Then
		Trace("PlaybackTransitionCoordinator preload failed. audio=" & targetAudioKey & ", message=empty_media_url")
		Return False
	End If
	Dim volume As Double = CallSub2(targetModule, "Transition_CurrentVolume", nextItem)
	Trace("PlaybackTransitionCoordinator preload requested. targetAudio=" & targetAudioKey & ", item=" & DescribeItem(nextItem) & ", source=" & mediaCacheService.ResolveMediaSource(nextItem))
	Dim targetAudio As AudioPlayer = CallSub2(targetModule, "Transition_GetAudioByKey", targetAudioKey)
	targetAudio.LoadUrl(nextItemUrl, volume)
	Wait For PreloadDone(result As Map)
	Trace("PlaybackTransitionCoordinator preload completed. audio=" & targetAudioKey & ", success=" & result.GetDefault("Success", False) & ", message=" & result.GetDefault("Message", ""))
	If playbackFlowState = flowPreparing Then
		If result.GetDefault("Success", False) Then
			Dim readyArgs As Map
			readyArgs.Initialize
			readyArgs.Put("state", previousFlowState)
			readyArgs.Put("reason", "prepare_ready")
			CallSub2(targetModule, "Transition_SetPlaybackFlowState", readyArgs)
		Else
			Dim failedArgs As Map
			failedArgs.Initialize
			failedArgs.Put("state", "error")
			failedArgs.Put("reason", "prepare_failed")
			CallSub2(targetModule, "Transition_SetPlaybackFlowState", failedArgs)
			Trace("PlaybackTransitionCoordinator preload failed. audio=" & targetAudioKey)
		End If
	End If
	Return result.GetDefault("Success", False)
End Sub

Public Sub PromotePreparedPlayer(runtimeState As PlaybackRuntimeState, dataResolver As DataPlaybackResolver, storage As KeyValueStore, fadeInMs As Int, fadeOutMs As Int, flowTransitioning As String) As Boolean
	If runtimeState.PreparedAudioKey = "" Or runtimeState.PreparedItem.IsInitialized = False Then
		Trace("PlaybackTransitionCoordinator prepared item rejected. reason=missing_prepared")
		Return False
	End If
	Dim flowArgs As Map
	flowArgs.Initialize
	flowArgs.Put("state", flowTransitioning)
	flowArgs.Put("reason", "promote_prepared")
	CallSub2(targetModule, "Transition_SetPlaybackFlowState", flowArgs)
	Dim previousAudioKey As String = runtimeState.ActiveAudioKey
	Dim nextAudioKey As String = runtimeState.PreparedAudioKey
	Dim promotedItem As Map = CloneMap(runtimeState.PreparedItem)
	Trace("PlaybackTransitionCoordinator prepared item promoted. fromAudio=" & previousAudioKey & ", toAudio=" & nextAudioKey & ", item=" & DescribeItem(promotedItem) & ", fadeOutMs=" & fadeOutMs)
	CallSub(targetModule, "Transition_ConsumePreparedQueueItem")
	If previousAudioKey <> "" And previousAudioKey <> nextAudioKey Then
		Dim previousAudio As AudioPlayer = CallSub2(targetModule, "Transition_GetAudioByKey", previousAudioKey)
		previousAudio.Stop(fadeOutMs)
	End If
	dataResolver.CommitPlaylistCursor(storage, promotedItem)
	Trace("PlaybackQueueState playlist cursor committed. item=" & DescribeItem(promotedItem))
	CallSub(targetModule, "Transition_SaveQueueSnapshotState")
	Dim activateArgs As Map
	activateArgs.Initialize
	activateArgs.Put("audioKey", nextAudioKey)
	activateArgs.Put("item", promotedItem)
	activateArgs.Put("fadeInMs", fadeInMs)
	CallSub2(targetModule, "Transition_ActivateLoadedItem", activateArgs)
	CallSub2(targetModule, "Transition_ClearPreparedState", False)
	Return True
End Sub

Private Sub DescribeItem(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Return CallSub2(targetModule, "Transition_DescribeItem", item)
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
	If SubExists(targetModule, traceSubName) Then
		CallSub2(targetModule, traceSubName, message)
	End If
End Sub
