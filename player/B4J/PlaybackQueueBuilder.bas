B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private targetModule As Object
	Private traceSubName As String
	Private refreshDataSubName As String
	Private ensurePlaylistMetadataSubName As String
End Sub

Public Sub Initialize(targetModuleValue As Object, traceSubNameValue As String, refreshDataSubNameValue As String, ensurePlaylistMetadataSubNameValue As String)
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	refreshDataSubName = refreshDataSubNameValue
	ensurePlaylistMetadataSubName = ensurePlaylistMetadataSubNameValue
End Sub

Public Sub CanUseDataPlaybackResolver(offlineData As Map) As Boolean
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return False
	Return True
End Sub

Public Sub EnsureDataPlaybackReady(offlineData As Map) As ResumableSub
	If CanUseDataPlaybackResolver(offlineData) Then
		Trace("PlaybackQueueBuilder resolver ready check succeeded.")
		Return True
	End If
	Trace("PlaybackQueueBuilder resolver ready check failed. Refresh required.")
	Wait For (CallSub(targetModule, refreshDataSubName)) Complete (refreshed As Boolean)
	If refreshed = False Then
		Trace("PlaybackQueueBuilder resolver ready check failed after refresh.")
		Return False
	End If
	Dim refreshedOfflineData As Map = CallSub(targetModule, "GetQueueBuilderOfflineData")
	If CanUseDataPlaybackResolver(refreshedOfflineData) Then
		Trace("PlaybackQueueBuilder resolver ready check succeeded after refresh.")
		Return True
	End If
	Trace("PlaybackQueueBuilder resolver ready check failed after refresh.")
	Return False
End Sub

Public Sub EnsureDataPlaybackQueue(playQueue As List, minItems As Int, offlineData As Map, nowTicks As Long, storage As KeyValueStore, queueState As PlaybackQueueState, dataResolver As DataPlaybackResolver, mediaCacheService As MediaCache) As ResumableSub
	If minItems <= 0 Then Return False
	Trace("PlaybackQueueBuilder queue build started. minItems=" & minItems & ", queueSize=" & playQueue.Size)
	If playQueue.Size = 0 Then
		If queueState.ConsumeSkipQueueSnapshotRestore Then
			Trace("PlaybackQueueBuilder queue snapshot restore skipped.")
		Else
			Trace("PlaybackQueueBuilder queue snapshot restore attempted.")
			If RestoreQueueSnapshotFromStorage(playQueue, offlineData, nowTicks, storage, queueState, dataResolver, mediaCacheService) Then
				If playQueue.Size >= minItems Then
					Trace("PlaybackQueueBuilder queue build completed from snapshot. queueSize=" & playQueue.Size)
					Return True
				End If
			End If
		End If
	End If
	Dim workingCursors As Map = dataResolver.ClonePlaylistCursors
	ApplyExistingQueueToWorkingCursors(workingCursors, playQueue)
	Do While playQueue.Size < minItems
		Wait For (BuildNextTrackFromDataPlayback(workingCursors, offlineData, nowTicks, dataResolver, mediaCacheService)) Complete (nextItem As Map)
		If IsValidDataTrackItem(nextItem) = False Then Exit
		playQueue.Add(nextItem)
	Loop
	If playQueue.Size > 0 Then
		dataResolver.SavePreviewPlaylistCursors(storage, workingCursors)
		Trace("PlaybackQueueBuilder playlist cursor preview updated. count=" & dataResolver.CursorCount)
	End If
	SaveQueueSnapshotState(playQueue, offlineData, nowTicks, storage, queueState, dataResolver)
	Trace("PlaybackQueueBuilder queue build completed. queueSize=" & playQueue.Size)
	Return playQueue.Size >= minItems
End Sub

Private Sub ApplyExistingQueueToWorkingCursors(workingCursors As Map, playQueue As List)
	If workingCursors.IsInitialized = False Then Return
	If playQueue.IsInitialized = False Or playQueue.Size = 0 Then Return
	For Each itemObject As Object In playQueue
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			Dim slotKey As String = item.GetDefault("slot_key", "")
			If slotKey = "" Then Continue
			Dim nextStored As Int = item.GetDefault("playlist_index", 0) + 1
			workingCursors.Put(slotKey, nextStored)
		End If
	Next
	Trace("PlaybackQueueBuilder queue state rebuilt. queueSize=" & playQueue.Size & ", cursorCount=" & workingCursors.Size)
End Sub

Public Sub BuildNextTrackFromDataPlayback(workingCursors As Map, offlineData As Map, nowTicks As Long, dataResolver As DataPlaybackResolver, mediaCacheService As MediaCache) As ResumableSub
	Dim emptyItem As Map
	emptyItem.Initialize
	Dim currentSlot As Map = dataResolver.ResolveDataSlotAtTicks(offlineData, nowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then
		Trace("PlaybackQueueBuilder next track resolve failed: current slot unavailable.")
		Return emptyItem
	End If
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then
		Trace("PlaybackQueueBuilder next track resolve failed: no playlists in current slot.")
		Return emptyItem
	End If
	For attempt = 0 To playlists.Size - 1
		Dim playlistDescriptor As Map = dataResolver.ChooseNextPlaylistDescriptor(currentSlot, workingCursors)
		If playlistDescriptor.IsInitialized = False Or playlistDescriptor.Size = 0 Then Exit
		Dim canUsePlaylist As Boolean = True
		Dim playlistData As Map = dataResolver.LoadCachedPlaylistMetadata(playlistDescriptor.GetDefault("id", ""))
		If playlistData.IsInitialized = False Or playlistData.Size = 0 Then
			Wait For (CallSub2(targetModule, ensurePlaylistMetadataSubName, playlistDescriptor)) Complete (downloaded As Boolean)
			If downloaded = False Then
				canUsePlaylist = False
			Else
				playlistData = dataResolver.LoadCachedPlaylistMetadata(playlistDescriptor.GetDefault("id", ""))
				If playlistData.IsInitialized = False Or playlistData.Size = 0 Then canUsePlaylist = False
			End If
		End If
		If canUsePlaylist = False Then
			Trace("PlaybackQueueBuilder playlist skipped: metadata unavailable. playlistId=" & playlistDescriptor.GetDefault("id", ""))
		Else
			Dim chosenTrack As Map = dataResolver.ChooseRandomTrackFromPlaylist(playlistData, mediaCacheService, False)
			If chosenTrack.IsInitialized = False Or chosenTrack.Size = 0 Then
				Trace("PlaybackQueueBuilder next track resolve failed: playlist has no track. playlistId=" & playlistDescriptor.GetDefault("id", ""))
			Else
				Dim chosenQueueItem As Map = dataResolver.CreateQueueTrackFromPlaylist(currentSlot, playlistDescriptor, chosenTrack, offlineData)
				If mediaCacheService.IsTrackCached(chosenQueueItem.GetDefault("id", "")) Then
					Trace("PlaybackQueueBuilder next track resolved from slot/playlist. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & chosenQueueItem.GetDefault("id", "") & ", source=cache")
					dataResolver.RememberResolvedTrack(chosenQueueItem.GetDefault("id", ""))
					dataResolver.RememberResolvedTrackForPlaylist(chosenQueueItem.GetDefault("playlist_id", ""), chosenQueueItem.GetDefault("id", ""))
					Return chosenQueueItem
				End If
				Trace("Выбран новый track из playlist. Пробую подготовить локально. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & chosenQueueItem.GetDefault("id", ""))
				Dim singleTrackItems As List
				singleTrackItems.Initialize
				singleTrackItems.Add(chosenQueueItem)
				Wait For (mediaCacheService.EnsureTracksCached(singleTrackItems, 1)) Complete (downloadedTrack As Boolean)
				If mediaCacheService.IsTrackCached(chosenQueueItem.GetDefault("id", "")) Then
					Trace("Новый track подготовлен для локального воспроизведения. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & chosenQueueItem.GetDefault("id", "") & ", downloaded=" & downloadedTrack)
					Trace("PlaybackQueueBuilder next track resolved from slot/playlist. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & chosenQueueItem.GetDefault("id", "") & ", source=downloaded")
					dataResolver.RememberResolvedTrack(chosenQueueItem.GetDefault("id", ""))
					dataResolver.RememberResolvedTrackForPlaylist(chosenQueueItem.GetDefault("playlist_id", ""), chosenQueueItem.GetDefault("id", ""))
					Return chosenQueueItem
				End If
				Trace("Не удалось подготовить выбранный track. Пробую cached fallback. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & chosenQueueItem.GetDefault("id", ""))
				Dim fallbackTrack As Map = dataResolver.ChooseRandomTrackFromPlaylist(playlistData, mediaCacheService, True)
				If fallbackTrack.IsInitialized And fallbackTrack.Size > 0 Then
					Dim fallbackQueueItem As Map = dataResolver.CreateQueueTrackFromPlaylist(currentSlot, playlistDescriptor, fallbackTrack, offlineData)
					Trace("Использую cached fallback track. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & fallbackQueueItem.GetDefault("id", ""))
					Trace("PlaybackQueueBuilder next track resolved from slot/playlist. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & fallbackQueueItem.GetDefault("id", "") & ", source=fallback")
					dataResolver.RememberResolvedTrack(fallbackQueueItem.GetDefault("id", ""))
					dataResolver.RememberResolvedTrackForPlaylist(fallbackQueueItem.GetDefault("playlist_id", ""), fallbackQueueItem.GetDefault("id", ""))
					Return fallbackQueueItem
				End If
				Trace("Не удалось подготовить track для локального воспроизведения. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & chosenQueueItem.GetDefault("id", ""))
			End If
		End If
	Next
	Return emptyItem
End Sub

Public Sub RestoreQueueSnapshotFromStorage(playQueue As List, offlineData As Map, nowTicks As Long, storage As KeyValueStore, queueState As PlaybackQueueState, dataResolver As DataPlaybackResolver, mediaCacheService As MediaCache) As Boolean
	If CanUseDataPlaybackResolver(offlineData) = False Then Return False
	Dim snapshot As Map = queueState.RestoreQueueSnapshot(storage)
	Dim storedSignature As String = snapshot.GetDefault("signature", "")
	If storedSignature = "" Then Return False
	Dim currentSignature As String = BuildQueueSignature(offlineData, nowTicks, dataResolver)
	If currentSignature = "" Then Return False
	If storedSignature <> currentSignature Then
		Trace("PlaybackQueueBuilder queue signature mismatch. stored=" & storedSignature & ", current=" & currentSignature)
		Return False
	End If
	Dim storedTracks As List = snapshot.GetDefault("tracks", CreateInitializedList)
	If storedTracks.IsInitialized = False Or storedTracks.Size = 0 Then Return False
	Dim restoredCount As Int = 0
	For Each itemObject As Object In storedTracks
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			If mediaCacheService.IsTrackCached(item.GetDefault("id", "")) = False Then Continue
			playQueue.Add(CloneMap(item))
			dataResolver.RememberResolvedTrack(item.GetDefault("id", ""))
			dataResolver.RememberResolvedTrackForPlaylist(item.GetDefault("playlist_id", ""), item.GetDefault("id", ""))
			restoredCount = restoredCount + 1
		End If
	Next
	If restoredCount = 0 Then Return False
	Trace("PlaybackQueueBuilder queue snapshot restored. tracks=" & restoredCount)
	Return True
End Sub

Public Sub SaveQueueSnapshotState(playQueue As List, offlineData As Map, nowTicks As Long, storage As KeyValueStore, queueState As PlaybackQueueState, dataResolver As DataPlaybackResolver)
	If CanUseDataPlaybackResolver(offlineData) = False Then Return
	Dim signature As String = BuildQueueSignature(offlineData, nowTicks, dataResolver)
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
	queueState.SaveQueueSnapshot(storage, signature, snapshotTracks, 20)
	Trace("PlaybackQueueBuilder queue snapshot saved. tracks=" & snapshotTracks.Size)
End Sub

Public Sub BuildQueueSignature(offlineData As Map, nowTicks As Long, dataResolver As DataPlaybackResolver) As String
	If CanUseDataPlaybackResolver(offlineData) = False Then Return ""
	Dim currentSlot As Map = dataResolver.ResolveDataSlotAtTicks(offlineData, nowTicks)
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

Private Sub CreateInitializedList As List
	Dim items As List
	items.Initialize
	Return items
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

Private Sub Trace(message As String)
	If SubExists(targetModule, traceSubName) Then
		CallSub2(targetModule, traceSubName, message)
	End If
End Sub
