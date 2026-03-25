B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@
'AutonomousCacheManager.bas
'Class module
'Служебный менеджер автономного пополнения track cache для 24/7 playback по data slots.
'Подкачка идёт по тому же playback manifest order, что и воспроизведение.

Sub Class_Globals
	Private kvs As KeyValueStore
	Private offlineStoreService As OfflineStore
	Private dataResolverService As DataPlaybackResolver
	Private mediaCacheService As MediaCache
	
	Private traceTarget As Object
	Private traceSubName As String
	
	Private workerTimer As Timer
	Private isRunning As Boolean
	Private stepInProgress As Boolean
	
	Private Const DEFAULT_TICK_INTERVAL_MS As Int = 30000
	Private Const DEFAULT_DOWNLOAD_COOLDOWN_MS As Long = 15000
	Private Const DEFAULT_FAILURE_COOLDOWN_MS As Long = 120000
	Private Const DEFAULT_PRUNE_COOLDOWN_MS As Long = 60000
	
	Private Const DEFAULT_CURRENT_SLOT_MIN_RESERVE As Int = 8
	Private Const DEFAULT_NEXT_SLOT_MIN_RESERVE As Int = 4
	Private Const DEFAULT_PER_PLAYLIST_MIN_RESERVE As Int = 2
	Private Const DEFAULT_MAX_DOWNLOADS_PER_STEP As Int = 2
	
	Private tickIntervalMs As Int = DEFAULT_TICK_INTERVAL_MS
	Private downloadCooldownMs As Long = DEFAULT_DOWNLOAD_COOLDOWN_MS
	Private failureCooldownMs As Long = DEFAULT_FAILURE_COOLDOWN_MS
	Private pruneCooldownMs As Long = DEFAULT_PRUNE_COOLDOWN_MS
	
	Private currentSlotMinReserve As Int = DEFAULT_CURRENT_SLOT_MIN_RESERVE
	Private nextSlotMinReserve As Int = DEFAULT_NEXT_SLOT_MIN_RESERVE
	Private perPlaylistMinReserve As Int = DEFAULT_PER_PLAYLIST_MIN_RESERVE
	Private maxDownloadsPerStep As Int = DEFAULT_MAX_DOWNLOADS_PER_STEP
	
	Private lastSuccessfulDownloadAt As Long
	Private lastFailureAt As Long
	Private lastPruneAt As Long
End Sub

Public Sub Initialize( _
	storageValue As KeyValueStore, _
	offlineStoreValue As OfflineStore, _
	dataResolverValue As DataPlaybackResolver, _
	mediaCacheValue As MediaCache, _
	traceTargetValue As Object, _
	traceSubNameValue As String)
	
	kvs = storageValue
	offlineStoreService = offlineStoreValue
	dataResolverService = dataResolverValue
	mediaCacheService = mediaCacheValue
	traceTarget = traceTargetValue
	traceSubName = traceSubNameValue
	
	workerTimer.Initialize("workerTimer", tickIntervalMs)
End Sub

Public Sub Configure( _
	tickMs As Int, _
	currentReserve As Int, _
	nextReserve As Int, _
	perPlaylistReserve As Int, _
	maxDownloads As Int)
	
	If tickMs > 0 Then tickIntervalMs = tickMs
	If currentReserve >= 0 Then currentSlotMinReserve = currentReserve
	If nextReserve >= 0 Then nextSlotMinReserve = nextReserve
	If perPlaylistReserve >= 0 Then perPlaylistMinReserve = perPlaylistReserve
	If maxDownloads > 0 Then maxDownloadsPerStep = maxDownloads
	
	workerTimer.Interval = tickIntervalMs
End Sub

Public Sub SetCooldowns(downloadCooldownValue As Long, failureCooldownValue As Long, pruneCooldownValue As Long)
	If downloadCooldownValue >= 0 Then downloadCooldownMs = downloadCooldownValue
	If failureCooldownValue >= 0 Then failureCooldownMs = failureCooldownValue
	If pruneCooldownValue >= 0 Then pruneCooldownMs = pruneCooldownValue
End Sub

Public Sub Start
	isRunning = True
	workerTimer.Interval = tickIntervalMs
	workerTimer.Enabled = True
	Trace("autocache manager started tickMs=" & tickIntervalMs)
End Sub

Public Sub StopManager
	isRunning = False
	workerTimer.Enabled = False
	Trace("autocache manager stopped")
End Sub

Public Sub IsStarted As Boolean
	Return isRunning
End Sub

Private Sub workerTimer_Tick
	If isRunning = False Then Return
	If stepInProgress Then Return
	
	stepInProgress = True
	Wait For (RunStepAsync) Complete (summary As Map)
	stepInProgress = False
End Sub

Public Sub RunStepAsync As ResumableSub
	Dim summary As Map
	summary.Initialize
	
	If kvs.IsInitialized = False Or offlineStoreService.IsInitialized = False Or dataResolverService.IsInitialized = False Or mediaCacheService.IsInitialized = False Then
		summary.Put("status", "not_initialized")
		Return summary
	End If
	
	If IsFailureCooldownActive Then
		summary.Put("status", "failure_cooldown")
		Trace("autocache step skipped reason=failure_cooldown")
		Return summary
	End If
	
	If IsDownloadCooldownActive Then
		summary.Put("status", "download_cooldown")
		Trace("autocache step skipped reason=download_cooldown")
		RunPruneIfNeeded("cooldown")
		Return summary
	End If
	
	Dim offlineData As Map = offlineStoreService.LoadOfflineData
	If offlineData.IsInitialized = False Or offlineData.Size = 0 Then
		summary.Put("status", "no_offline_data")
		Trace("autocache step skipped reason=no_offline_data")
		Return summary
	End If
	
	mediaCacheService.EnsureTrackCacheReady
	
	Dim nowTicks As Long = DateTime.Now
	Dim currentSlot As Map = dataResolverService.ResolveDataSlotAtTicks(offlineData, nowTicks)
	Dim nextSlot As Map = dataResolverService.ResolveNextDataSlotAtTicks(offlineData, nowTicks)
	
	Dim currentNeed As Int = ResolveSlotNeed(currentSlot, currentSlotMinReserve)
	Dim nextNeed As Int = ResolveSlotNeed(nextSlot, nextSlotMinReserve)
	
	Dim targetDescriptors As List = BuildTargetPlaylistDescriptors(currentSlot, nextSlot)
	Dim desiredTrackItems As List = BuildDesiredTrackItems(targetDescriptors, currentNeed, nextNeed)
	
	summary.Put("current_need", currentNeed)
	summary.Put("next_need", nextNeed)
	summary.Put("candidate_count", desiredTrackItems.Size)
	
	If desiredTrackItems.Size = 0 Then
		summary.Put("status", "nothing_to_download")
		Trace("autocache step no work currentNeed=" & currentNeed & " nextNeed=" & nextNeed)
		RunPruneIfNeeded("idle")
		Return summary
	End If
	
	Dim actualMaxDownloads As Int = Min(maxDownloadsPerStep, desiredTrackItems.Size)
	Trace("autocache step download start candidates=" & desiredTrackItems.Size & " maxDownloads=" & actualMaxDownloads)
	
	Wait For (mediaCacheService.EnsureTracksCached(desiredTrackItems, actualMaxDownloads)) Complete (downloaded As Boolean)
	
	If HasMediaCacheRecentFailure Then
		lastFailureAt = DateTime.Now
		summary.Put("status", "network_failure")
		Trace("autocache step network failure")
		Return summary
	End If
	
	If downloaded Then
		lastSuccessfulDownloadAt = DateTime.Now
		summary.Put("status", "downloaded")
		summary.Put("downloaded", True)
	Else
		summary.Put("status", "no_new_downloads")
		summary.Put("downloaded", False)
	End If
	
	RunPruneIfNeeded("post_download")
	Return summary
End Sub

Private Sub ResolveSlotNeed(slot As Map, minReserve As Int) As Int
	If slot.IsInitialized = False Or slot.Size = 0 Then Return 0
	
	Dim playlists As List = GetSlotPlaylists(slot)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return 0
	
	Dim playableCount As Int = CountPlayableTracksInSlot(slot)
	Return Max(0, minReserve - playableCount)
End Sub

Private Sub CountPlayableTracksInSlot(slot As Map) As Int
	If slot.IsInitialized = False Then Return 0
	
	Dim playlists As List = GetSlotPlaylists(slot)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return 0
	
	Dim totalCount As Int = 0
	
	For Each playlistObject As Object In playlists
		If (playlistObject Is Map) = False Then Continue
		Dim playlistDescriptor As Map = playlistObject
		Dim playlistId As String = GetPlaylistIdFromDescriptor(playlistDescriptor)
		If playlistId = "" Then Continue
		
		Dim manifest As Map = LoadPlaylistManifestSafe(playlistId)
		totalCount = totalCount + CountPlayableTracksInManifest(manifest)
	Next
	
	Return totalCount
End Sub

Private Sub CountPlayableTracksInManifest(manifest As Map) As Int
	If manifest.IsInitialized = False Then Return 0
	
	Dim order As List = manifest.GetDefault("order", Null)
	Dim trackMap As Map = manifest.GetDefault("tracks", Null)
	If order.IsInitialized = False Or order.Size = 0 Then Return 0
	If trackMap.IsInitialized = False Or trackMap.Size = 0 Then Return 0
	
	Dim totalCount As Int = 0
	For Each trackId As String In order
		If trackId = "" Then Continue
		Dim trackObject As Object = trackMap.GetDefault(trackId, Null)
		If (trackObject Is Map) = False Then Continue
		Dim track As Map = trackObject
		If mediaCacheService.HasValidatedLocalMedia(track) Then
			totalCount = totalCount + 1
		End If
	Next
	
	Return totalCount
End Sub

Private Sub BuildTargetPlaylistDescriptors(currentSlot As Map, nextSlot As Map) As List
	Dim result As List
	result.Initialize
	
	Dim seen As Map
	seen.Initialize
	
	AddSlotPlaylistDescriptors(result, seen, currentSlot)
	AddSlotPlaylistDescriptors(result, seen, nextSlot)
	
	Return result
End Sub

Private Sub AddSlotPlaylistDescriptors(result As List, seen As Map, slot As Map)
	If slot.IsInitialized = False Or slot.Size = 0 Then Return
	
	Dim playlists As List = GetSlotPlaylists(slot)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return
	
	For Each playlistObject As Object In playlists
		If (playlistObject Is Map) = False Then Continue
		
		Dim descriptor As Map = playlistObject
		Dim playlistId As String = GetPlaylistIdFromDescriptor(descriptor)
		If playlistId = "" Then Continue
		If seen.ContainsKey(playlistId) Then Continue
		
		seen.Put(playlistId, True)
		result.Add(CloneMap(descriptor))
	Next
End Sub

Private Sub BuildDesiredTrackItems(targetDescriptors As List, currentNeed As Int, nextNeed As Int) As List
	Dim result As List
	result.Initialize
	
	If targetDescriptors.IsInitialized = False Or targetDescriptors.Size = 0 Then Return result
	
	Dim seenTrackIds As Map
	seenTrackIds.Initialize
	
	Dim priorityBudget As Int = currentNeed + nextNeed
	If priorityBudget <= 0 Then priorityBudget = perPlaylistMinReserve
	
	For Each descriptorObject As Object In targetDescriptors
		If (descriptorObject Is Map) = False Then Continue
		
		Dim descriptor As Map = descriptorObject
		Dim playlistId As String = GetPlaylistIdFromDescriptor(descriptor)
		If playlistId = "" Then Continue
		
		Dim manifest As Map = LoadPlaylistManifestSafe(playlistId)
		If manifest.IsInitialized = False Or manifest.Size = 0 Then Continue
		
		Dim missingForPlaylist As Int = ResolveMissingForPlaylistFromManifest(manifest, perPlaylistMinReserve)
		If missingForPlaylist <= 0 And priorityBudget <= 0 Then Continue
		
		Dim desiredForPlaylist As Int = Max(perPlaylistMinReserve, missingForPlaylist)
		If priorityBudget > 0 Then desiredForPlaylist = Max(desiredForPlaylist, 1)
		
		CollectUncachedTracksFromManifest(result, seenTrackIds, manifest, playlistId, desiredForPlaylist)
	Next
	
	Return result
End Sub

Private Sub ResolveMissingForPlaylistFromManifest(manifest As Map, minReserve As Int) As Int
	Dim playableCount As Int = CountPlayableTracksInManifest(manifest)
	Return Max(0, minReserve - playableCount)
End Sub

Private Sub CollectUncachedTracksFromManifest(result As List, seenTrackIds As Map, manifest As Map, playlistId As String, limitCount As Int)
	If limitCount <= 0 Then Return
	If manifest.IsInitialized = False Then Return
	
	Dim order As List = manifest.GetDefault("order", Null)
	Dim trackMap As Map = manifest.GetDefault("tracks", Null)
	If order.IsInitialized = False Or order.Size = 0 Then Return
	If trackMap.IsInitialized = False Or trackMap.Size = 0 Then Return
	
	Dim addedCount As Int = 0
	Dim startIndex As Int = ResolveManifestPrefetchStartIndex(playlistId, order.Size)
	Dim trackIndexKey As String = "playlist_track_index_" & playlistId
	
	For offset = 0 To order.Size - 1
		If addedCount >= limitCount Then Exit
		
		Dim orderIndex As Int = (startIndex + offset) Mod order.Size
		Dim trackId As String = order.Get(orderIndex)
		If trackId = "" Then Continue
		If seenTrackIds.ContainsKey(trackId) Then Continue
		
		Dim trackObject As Object = trackMap.GetDefault(trackId, Null)
		If (trackObject Is Map) = False Then Continue
		
		Dim track As Map = trackObject
		If mediaCacheService.HasValidatedLocalMedia(track) Then Continue
		
		Dim normalizedTrack As Map = CloneMap(track)
		If normalizedTrack.ContainsKey("type") = False Then normalizedTrack.Put("type", "track")
		If normalizedTrack.ContainsKey("playlist_id") = False Then normalizedTrack.Put("playlist_id", playlistId)
		normalizedTrack.Put("playlist_track_index", orderIndex)
		normalizedTrack.Put("playlist_prefetch_source", "manifest_order")
		
		result.Add(normalizedTrack)
		seenTrackIds.Put(trackId, True)
		addedCount = addedCount + 1
		
		Trace("autocache candidate playlistId=" & playlistId & " orderIndex=" & orderIndex & " trackId=" & trackId & " basedOnKey=" & trackIndexKey)
	Next
End Sub

Private Sub ResolveManifestPrefetchStartIndex(playlistId As String, orderSize As Int) As Int
	If orderSize <= 0 Then Return 0
	
	Dim storedTrackIndex As Int = -1
	
	Try
		storedTrackIndex = kvs.GetDefault("playlist_track_index_" & playlistId, -1)
	Catch
		storedTrackIndex = -1
	End Try
	
	Dim startIndex As Int = storedTrackIndex + 1
	If startIndex < 0 Then startIndex = 0
	If startIndex >= orderSize Then startIndex = startIndex Mod orderSize
	
	Return startIndex
End Sub

Private Sub RunPruneIfNeeded(initiator As String)
	If DateTime.Now - lastPruneAt < pruneCooldownMs Then Return
	
	Dim protectedTrackIds As List = BuildProtectedTrackIds
	Dim relevantTrackIds As List = BuildRelevantTrackIds
	
	Dim removedCount As Int = mediaCacheService.PruneTrackCacheIfNeeded(protectedTrackIds, relevantTrackIds)
	lastPruneAt = DateTime.Now
	
	If removedCount > 0 Then
		Trace("autocache prune completed initiator=" & initiator & " removed=" & removedCount)
	Else
		Trace("autocache prune completed initiator=" & initiator & " removed=0")
	End If
End Sub

Private Sub BuildProtectedTrackIds As List
	Dim result As List
	result.Initialize
	Return result
End Sub

Private Sub BuildRelevantTrackIds As List
	Dim result As List
	result.Initialize
	
	Dim relevantIds As Map
	relevantIds.Initialize
	
	Dim descriptors As List = GetStoredPlaylistDescriptorsSafe
	If descriptors.IsInitialized = False Or descriptors.Size = 0 Then Return result
	
	For Each descriptorObject As Object In descriptors
		If (descriptorObject Is Map) = False Then Continue
		
		Dim descriptor As Map = descriptorObject
		Dim playlistId As String = GetPlaylistIdFromDescriptor(descriptor)
		If playlistId = "" Then Continue
		
		Dim manifest As Map = LoadPlaylistManifestSafe(playlistId)
		If manifest.IsInitialized = False Or manifest.Size = 0 Then Continue
		
		Dim order As List = manifest.GetDefault("order", Null)
		If order.IsInitialized = False Then Continue
		
		For Each trackId As String In order
			If trackId = "" Then Continue
			If relevantIds.ContainsKey(trackId) Then Continue
			relevantIds.Put(trackId, True)
		Next
	Next
	
	For Each trackId As String In relevantIds.Keys
		result.Add(trackId)
	Next
	
	Return result
End Sub

Private Sub GetSlotPlaylists(slot As Map) As List
	If slot.IsInitialized = False Then
		Dim emptyList As List
		emptyList.Initialize
		Return emptyList
	End If
	
	Dim playlists As List = slot.GetDefault("playlists", Null)
	If playlists.IsInitialized Then Return playlists
	
	playlists = slot.GetDefault("playlist_descriptors", Null)
	If playlists.IsInitialized Then Return playlists
	
	Dim emptyResult As List
	emptyResult.Initialize
	Return emptyResult
End Sub

Private Sub GetPlaylistIdFromDescriptor(descriptor As Map) As String
	If descriptor.IsInitialized = False Then Return ""
	
	Dim playlistId As String = descriptor.GetDefault("id", "")
	If playlistId <> "" Then Return playlistId
	
	playlistId = descriptor.GetDefault("playlist_id", "")
	If playlistId <> "" Then Return playlistId
	
	playlistId = descriptor.GetDefault("playlistId", "")
	Return playlistId
End Sub

Private Sub LoadPlaylistManifestSafe(playlistId As String) As Map
	Dim result As Map
	result.Initialize
	If playlistId = "" Then Return result
	
	Try
		result = dataResolverService.GetPlaylistPlaybackManifestById(playlistId)
	Catch
		result.Initialize
	End Try
	
	Return result
End Sub

Private Sub GetStoredPlaylistDescriptorsSafe As List
	Dim result As List
	result.Initialize
	
	Try
		result = offlineStoreService.GetStoredPlaylistDescriptors
	Catch
		result.Initialize
	End Try
	
	Return result
End Sub

Private Sub HasMediaCacheRecentFailure As Boolean
	Try
		Return mediaCacheService.ConsumeRecentMediaNetworkFailure
	Catch
		Return False
	End Try
End Sub

Private Sub IsDownloadCooldownActive As Boolean
	If lastSuccessfulDownloadAt <= 0 Then Return False
	Return DateTime.Now - lastSuccessfulDownloadAt < downloadCooldownMs
End Sub

Private Sub IsFailureCooldownActive As Boolean
	If lastFailureAt <= 0 Then Return False
	Return DateTime.Now - lastFailureAt < failureCooldownMs
End Sub

Private Sub CloneMap(sourceMap As Map) As Map
	Dim result As Map
	result.Initialize
	
	If sourceMap.IsInitialized = False Then Return result
	
	For Each key As Object In sourceMap.Keys
		result.Put(key, sourceMap.Get(key))
	Next
	
	Return result
End Sub

Private Sub Trace(message As String)
	If traceTarget = Null Then
		Log(message)
		Return
	End If
	
	If traceSubName = "" Then
		Log(message)
		Return
	End If
	
	Try
		CallSub2(traceTarget, traceSubName, message)
	Catch
		Log(message)
	End Try
End Sub