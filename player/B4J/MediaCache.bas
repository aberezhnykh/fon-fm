B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Локальный media cache для треков и рекламы.
' Отвечает за индексы, загрузку, audit/prune и выдачу локальных URI для playback.

Sub Class_Globals
	Private storageDir As String
	Private storage As KeyValueStore
	Private targetModule As Object
	Private traceSubName As String
	Private mediaDirName As String = "media"
	Private adsDirName As String = "ads"
	Private tracksDirName As String = "tracks"
	Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8
	Private Const AD_DOWNLOAD_TIMEOUT_MS As Int = 15000
	Private Const TRACK_DOWNLOAD_TIMEOUT_MS As Int = 10000
	Private Const STREAM_XOR_BUFFER_SIZE As Int = 32768
Private Const TRACK_CACHE_HARD_LIMIT_MB As Long = 1536
	Private Const TRACK_CACHE_TARGET_MB As Long = 768
	Private Const MIN_FREE_DISK_MB As Long = 1536
	Private Const MIN_FREE_DISK_PERCENT As Int = 5
	Private Const PRIMARY_TEMP_TRACK_FILE As String = "2f7f5f2f-91a0-4f4c-9f5f-70d7b94fd101.tmp"
	Private Const SECONDARY_TEMP_TRACK_FILE As String = "92c2df6a-7f22-4b75-8c09-d5a6f4f40a21.tmp"
	Private cachedAdIndex As Map
	Private cachedTrackIndex As Map
	Private cachedAdIndexDirty As Boolean
	Private cachedTrackIndexDirty As Boolean
	Private playbackTempTrackIds As Map
	Private cacheAuditInProgress As Boolean
	Private cacheAuditPendingTypes As List
	Private cacheAuditCurrentType As String
	Private cacheAuditCurrentFileNames As List
	Private cacheAuditCurrentPosition As Int
	Private cacheAuditSeenIds As Map
	Private cacheAuditAdIndexChanged As Boolean
	Private cacheAuditTrackIndexChanged As Boolean
	Private cacheAuditAddedCount As Int
	Private cacheAuditRemovedCount As Int
	Private cacheAuditTempDeletedCount As Int
	Private recentMediaNetworkFailure As Boolean
	Private pruneLastCacheBytes As Long
	Private pruneLastFreeBytes As Long
	Private cachedTrackCount As Int
	Private cachedAdCount As Int
	Private cachedTrackBytes As Long
	Private cachedAdBytes As Long
	Private cachedTrackPlaylistStats As Map
	Private cacheAuditListingInProgress As Boolean
	Private cacheAuditListingDir As String
End Sub

Public Sub Initialize(storageDirValue As String, storageValue As KeyValueStore, targetModuleValue As Object, traceSubNameValue As String, deviceIdValue As String)
	storageDir = storageDirValue
	storage = storageValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	playbackTempTrackIds.Initialize
	cachedTrackPlaylistStats.Initialize
	cachedAdIndexDirty = False
	cachedTrackIndexDirty = False
	EnsureDirectory(GetAdsDir)
	EnsureDirectory(GetTracksDir)
	LoadIndexesFromStorage
End Sub

Public Sub IsCacheAuditInProgress As Boolean
	Return cacheAuditInProgress
End Sub

Public Sub StartCacheAudit
	If cacheAuditInProgress Then Return
	cacheAuditPendingTypes.Initialize
	cacheAuditPendingTypes.Add("ads")
	cacheAuditPendingTypes.Add("tracks")
	cacheAuditCurrentType = ""
	cacheAuditCurrentFileNames.Initialize
	cacheAuditCurrentPosition = 0
	cacheAuditSeenIds.Initialize
	cacheAuditAdIndexChanged = False
	cacheAuditTrackIndexChanged = False
	cacheAuditAddedCount = 0
	cacheAuditRemovedCount = 0
	cacheAuditTempDeletedCount = 0
	cacheAuditListingInProgress = False
	cacheAuditListingDir = ""
	cacheAuditInProgress = True
End Sub

' Выполняет один шаг audit state machine; вызывается worker/timer-циклом, чтобы не блокировать playback длинной проверкой.
Public Sub RunCacheAuditStep As Boolean
	If cacheAuditInProgress = False Then Return False
	If cacheAuditCurrentType = "" Then
		If PrepareNextCacheAuditType = False Then
			FinishCacheAudit
			Return False
		End If
	End If
	If cacheAuditListingInProgress Then Return True
	ProcessCurrentCacheAuditBatch
	If cacheAuditCurrentPosition >= cacheAuditCurrentFileNames.Size Then
		FinalizeCurrentCacheAuditType
		cacheAuditCurrentType = ""
		If cacheAuditPendingTypes.Size = 0 Then
			FinishCacheAudit
			Return False
		End If
	End If
	Return True
End Sub

' Обеспечивает локальную готовность рекламы по offlineData и синхронизирует ad index с фактическими файлами.
Public Sub EnsureAdsCached(offlineData As Map) As ResumableSub
	FlushPendingIndexSaves
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	Dim ads As List = offlineData.GetDefault("ads", Null)
	Dim cachedAdIndex As Map = GetCachedAdIndex
	Dim actualAdIds As Map
	actualAdIds.Initialize
	Dim downloadedCount As Int = 0
	Dim failedCount As Int = 0
	If ads.IsInitialized Then
		For Each adObject As Object In ads
			If adObject Is Map Then
				Dim ad As Map = adObject
				Dim adId As String = ad.GetDefault("id", "")
				If adId = "" Then Continue
				actualAdIds.Put(adId, True)
				Wait For (EnsureSingleAdCached(ad, cachedAdIndex)) Complete (downloaded As Boolean)
				If downloaded Then
					downloadedCount = downloadedCount + 1
				Else If IsAdCached(adId) = False Then
					failedCount = failedCount + 1
				End If
			End If
		Next
	End If
	Dim removedCount As Int = PruneMissingAds(cachedAdIndex, actualAdIds)
	SaveAdIndex
	Trace("ad cache sync done downloaded=" & downloadedCount & " failed=" & failedCount & " removed=" & removedCount & " actual=" & cachedAdIndex.Size)
	Return downloadedCount > 0 Or removedCount > 0
End Sub

' Выдаёт постоянный локальный URI для уже валидированного media item в кэше.
Public Sub ResolveLocalMediaUri(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim itemType As String = item.GetDefault("type", "")
	Dim itemId As String = item.GetDefault("id", "")
	If itemId = "" Then Return ""
	If HasValidatedLocalMedia(item) = False Then Return ""
	If itemType = "ad" Then Return File.GetUri(GetAdsDir, itemId)
	If itemType = "track" Then Return ResolveRelativeFileUri(GetTracksDir, ResolveTrackRelativeFileNameFromItem(item))
	Return ""
End Sub

' Выдаёт playback URI: для треков это temp-файл конкретного аудиослота, чтобы плееры не конфликтовали по одному файлу.
Public Sub ResolvePlaybackMediaUri(audioKey As String, item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then Return ResolveLocalMediaUri(item)
	If itemType <> "track" Then Return ""
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return ""
	If HasValidatedLocalMedia(item) = False Then Return ""
	If EnsureTrackPlaybackTemp(audioKey, item) = False Then Return ""
	Return File.GetUri(File.DirTemp, BuildPlaybackTempTrackFileName(audioKey))
End Sub

Public Sub CleanupPlaybackTempFiles
	DeleteFileIfExists(File.DirTemp, PRIMARY_TEMP_TRACK_FILE)
	DeleteFileIfExists(File.DirTemp, SECONDARY_TEMP_TRACK_FILE)
	playbackTempTrackIds.Clear
End Sub

Public Sub HasValidatedLocalMedia(item As Map) As Boolean
	If item.IsInitialized = False Then Return False
	Dim itemId As String = item.GetDefault("id", "")
	If itemId = "" Then Return False
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then Return ValidateIndexedFile("ad", itemId)
	If itemType = "track" Then
		Dim preferredRelativeName As String = ResolveTrackRelativeFileNameFromItem(item)
		If IsCachedFileUsable(GetTracksDir, preferredRelativeName) Then
			EnsureTrackIndexEntry(itemId, item.GetDefault("playlist_id", ""), preferredRelativeName)
			Return True
		End If
		Return ValidateIndexedFile("track", itemId)
	End If
	Return False
End Sub

Public Sub IsAdCached(adId As String) As Boolean
	If adId = "" Then Return False
	Return ValidateIndexedFile("ad", adId)
End Sub

Public Sub GetAdsDir As String
	Return File.Combine(File.Combine(storageDir, mediaDirName), adsDirName)
End Sub

Public Sub GetTracksDir As String
	Return File.Combine(File.Combine(storageDir, mediaDirName), tracksDirName)
End Sub

Public Sub IsTrackCached(trackId As String) As Boolean
	If trackId = "" Then Return False
	If ValidateIndexedFile("track", trackId) Then Return True
	BackfillTrackIndexFromFiles
	Return ValidateIndexedFile("track", trackId)
End Sub

Public Sub HasTrackFileByPlaylist(trackId As String, playlistId As String) As Boolean
	If trackId = "" Then Return False
	Return IsCachedFileUsable(GetTracksDir, BuildTrackCacheRelativeFileName(trackId, playlistId))
End Sub

Public Sub GetCachedTrackCount As Int
	Return cachedTrackCount
End Sub

Public Sub GetCachedAdCount As Int
	Return cachedAdCount
End Sub

Public Sub GetCachedTrackBytes As Long
	Return cachedTrackBytes
End Sub

Public Sub GetCachedAdBytes As Long
	Return cachedAdBytes
End Sub

Public Sub GetCachedTrackPlaylistStats As Map
	EnsureTrackCacheReady
	Dim result As Map
	result.Initialize
	For Each playlistId As String In cachedTrackPlaylistStats.Keys
		Dim sourceEntry As Map = cachedTrackPlaylistStats.Get(playlistId)
		Dim copyEntry As Map
		copyEntry.Initialize
		If sourceEntry.IsInitialized Then
			copyEntry.Put("count", sourceEntry.GetDefault("count", 0))
			copyEntry.Put("bytes", sourceEntry.GetDefault("bytes", 0))
		End If
		result.Put(playlistId, copyEntry)
	Next
	Return result
End Sub

Public Sub EnsureTrackCacheReady
	If DirectoryExists(GetTracksDir) = False Then Return
	MigrateLegacyTrackCacheLayout
	Dim actualTrackFiles As Int = CountTrackFilesOnDisk
	If actualTrackFiles = 0 Then Return
	If cachedTrackCount = actualTrackFiles And cachedTrackIndex.IsInitialized And cachedTrackIndex.Size = actualTrackFiles Then Return
	BackfillTrackIndexFromFiles
	RebuildCacheStatsFromIndexes
	SaveCacheStatsSnapshot
End Sub

Private Sub CountTrackFilesOnDisk As Int
	If DirectoryExists(GetTracksDir) = False Then Return 0
	Dim count As Int = 0
	Try
		Dim listedFiles As List = ListTrackCacheFilesRecursive
		If listedFiles.IsInitialized = False Then Return 0
		For Each fileName As String In listedFiles
			If fileName = "" Then Continue
			If fileName.EndsWith(".tmp") Then Continue
			count = count + 1
		Next
	Catch
		Trace("Не удалось посчитать track файлы на диске. message=" & LastException.Message)
	End Try
	Return count
End Sub

Public Sub HasAnyTrackFilesOnDisk As Boolean
	If DirectoryExists(GetTracksDir) = False Then Return False
	Try
		Dim listedFiles As List = ListTrackCacheFilesRecursive
		If listedFiles.IsInitialized = False Then Return False
		For Each fileName As String In listedFiles
			If fileName = "" Then Continue
			If fileName.EndsWith(".tmp") Then Continue
			Return True
		Next
	Catch
		Trace("Не удалось проверить наличие track файлов на диске. message=" & LastException.Message)
	End Try
	Return False
End Sub

Public Sub GetCachedTrackPlaylistIdsOnDisk As List
	Dim result As List
	result.Initialize
	If DirectoryExists(GetTracksDir) = False Then Return result
	EnsureTrackCacheReady
	Dim seenIds As Map
	seenIds.Initialize
	Try
		If cachedTrackIndex.IsInitialized Then
			For Each trackId As String In cachedTrackIndex.Keys
				Dim entry As Map = cachedTrackIndex.GetDefault(trackId, Null)
				If entry.IsInitialized = False Then Continue
				Dim playlistId As String = entry.GetDefault("playlist_id", "")
				If playlistId = "" Or seenIds.ContainsKey(playlistId) Then Continue
				seenIds.Put(playlistId, True)
				result.Add(playlistId)
			Next
		End If
	Catch
		Trace("Не удалось получить список playlist папок из track cache. message=" & LastException.Message)
	End Try
	Return result
End Sub

Public Sub EnsureTracksCached(trackItems As List, maxCount As Int) As ResumableSub
	FlushPendingIndexSaves
	If trackItems.IsInitialized = False Or trackItems.Size = 0 Then Return False
	Dim cachedTrackIndex As Map = GetCachedTrackIndex
	Dim seenTrackIds As Map
	seenTrackIds.Initialize
	Dim downloadedCount As Int = 0
	Dim failedCount As Int = 0
	Dim processedCount As Int = 0
	For Each itemObject As Object In trackItems
		If processedCount >= maxCount Then Exit
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If item.GetDefault("type", "") <> "track" Then Continue
			Dim trackId As String = item.GetDefault("id", "")
			If trackId = "" Then Continue
			If seenTrackIds.ContainsKey(trackId) Then Continue
			seenTrackIds.Put(trackId, True)
			processedCount = processedCount + 1
			Wait For (EnsureSingleTrackCached(item, cachedTrackIndex)) Complete (downloaded As Boolean)
			If downloaded Then
				downloadedCount = downloadedCount + 1
			Else If IsTrackCached(trackId) = False Then
				failedCount = failedCount + 1
			End If
		End If
	Next
	SaveTrackIndex
	Trace("Синхронизация кэша треков завершена. downloaded=" & downloadedCount & ", failed=" & failedCount & ", actual=" & cachedTrackIndex.Size)
	Return downloadedCount > 0
End Sub

Public Sub ConsumeRecentMediaNetworkFailure As Boolean
	Dim value As Boolean = recentMediaNetworkFailure
	recentMediaNetworkFailure = False
	Return value
End Sub

Public Sub FlushPendingIndexSaves
	If cachedAdIndexDirty Then SaveAdIndex
	If cachedTrackIndexDirty Then SaveTrackIndex
End Sub

' Прореживает track cache по размеру диска, hard/target limit и спискам protected/relevant track ids.
Public Sub PruneTrackCacheIfNeeded(protectedTrackIds As List, relevantTrackIds As List) As Int
	Dim protectedIds As Map = CreateTrackIdSet(protectedTrackIds)
	Dim relevantIds As Map = CreateTrackIdSet(relevantTrackIds)
	Dim summary As Map = BuildTrackCacheSummary(protectedIds, relevantIds)
	Dim cacheBytes As Long = summary.GetDefault("cache_bytes", 0)
	Dim freeBytes As Long = GetDriveUsableSpace(storageDir)
	Dim totalBytes As Long = GetDriveTotalSpace(storageDir)
	Dim minFreeBytes As Long = ResolveMinFreeDiskBytes(totalBytes)
	Dim hardLimitBytes As Long = MbToBytes(TRACK_CACHE_HARD_LIMIT_MB)
	Dim targetBytes As Long = MbToBytes(TRACK_CACHE_TARGET_MB)
	Dim needPrune As Boolean = (cacheBytes > hardLimitBytes) Or (freeBytes > 0 And freeBytes < minFreeBytes)
	If needPrune = False Then
		Return 0
	End If
	Dim removedCount As Int = 0
	Dim candidates As List = summary.GetDefault("candidates", CreateInitializedList)
	Dim nonRelevantCandidates As List
	nonRelevantCandidates.Initialize
	Dim relevantCandidates As List
	relevantCandidates.Initialize
	For Each candidateObject As Object In candidates
		If (candidateObject Is Map) = False Then Continue
		Dim candidate As Map = candidateObject
		If candidate.GetDefault("is_relevant", False) Then
			relevantCandidates.Add(candidate)
		Else
			nonRelevantCandidates.Add(candidate)
		End If
	Next
	SortTrackPruneCandidates(nonRelevantCandidates)
	SortTrackPruneCandidates(relevantCandidates)
	' Политика очистки:
	' 1. Сначала вымываем треки, которых нет в актуальных playlist descriptors.
	' 2. К relevant-пулу переходим только если иначе уже не получается освободить место.
	removedCount = removedCount + PruneTrackCandidates(nonRelevantCandidates, cacheBytes, freeBytes, targetBytes, minFreeBytes)
	cacheBytes = pruneLastCacheBytes
	freeBytes = pruneLastFreeBytes
	If cacheBytes > targetBytes Or (freeBytes > 0 And freeBytes < minFreeBytes) Then
		removedCount = removedCount + PruneTrackCandidates(relevantCandidates, cacheBytes, freeBytes, targetBytes, minFreeBytes)
		cacheBytes = pruneLastCacheBytes
		freeBytes = pruneLastFreeBytes
	End If
	If removedCount > 0 Then
		SaveTrackIndex
		Trace("Очистка кэша треков завершена. removed=" & removedCount & ", cacheMb=" & BytesToMb(cacheBytes) & ", freeMb=" & BytesToMb(freeBytes))
	Else
		Trace("Очистка кэша треков пропущена: нет подходящих кандидатов. cacheMb=" & BytesToMb(cacheBytes) & ", freeMb=" & BytesToMb(freeBytes))
	End If
	Return removedCount
End Sub

Private Sub PruneTrackCandidates(candidates As List, initialCacheBytes As Long, initialFreeBytes As Long, targetBytes As Long, minFreeBytes As Long) As Int
	Dim removedCount As Int = 0
	Dim cacheBytes As Long = initialCacheBytes
	Dim freeBytes As Long = initialFreeBytes
	For Each candidateObject As Object In candidates
		If cacheBytes <= targetBytes And (freeBytes <= 0 Or freeBytes >= minFreeBytes) Then Exit
		If (candidateObject Is Map) = False Then Continue
		Dim candidate As Map = candidateObject
		Dim trackId As String = candidate.GetDefault("id", "")
		Dim fileName As String = candidate.GetDefault("file_name", "")
		Dim fileBytes As Long = candidate.GetDefault("size_bytes", 0)
			If trackId = "" Or fileName = "" Then Continue
			DeleteFileIfExists(GetTracksDir, fileName)
			CleanupEmptyTrackPlaylistDir(fileName)
			cachedTrackIndex.Remove(trackId)
			cacheBytes = Max(0, cacheBytes - fileBytes)
		freeBytes = GetDriveUsableSpace(storageDir)
		removedCount = removedCount + 1
		Trace("Удален cached track при очистке кэша. id=" & trackId & ", sizeMb=" & BytesToMb(fileBytes))
	Next
	pruneLastCacheBytes = cacheBytes
	pruneLastFreeBytes = freeBytes
	Return removedCount
End Sub

Private Sub EnsureSingleAdCached(ad As Map, adIndex As Map) As ResumableSub
	Dim adId As String = ad.GetDefault("id", "")
	If adId = "" Then Return False
	If TryRestoreExistingCachedMedia("ad", adId, ad, adIndex) Then Return False
	If IsAdCached(adId) Then
		UpdateAdIndex(ad, adIndex)
		Return False
	End If
	Dim adUrl As String = BuildAdUrl(adId)
	If adUrl = "" Then Return False
	Dim downloadStartedAt As Long = DateTime.Now
	Dim j As HttpJob
	j.Initialize("", Me)
	Trace("Скачивание рекламы в кэш. id=" & adId & ", url=" & adUrl)
	j.Download(adUrl)
	j.GetRequest.Timeout = AD_DOWNLOAD_TIMEOUT_MS
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Try
			EnsureDirectory(GetAdsDir)
			Dim tempFileName As String = BuildTempCacheFileName(adId)
			DeleteFileIfExists(GetAdsDir, tempFileName)
			Dim outStream As OutputStream = File.OpenOutput(GetAdsDir, tempFileName, False)
			File.Copy2(j.GetInputStream, outStream)
			outStream.Close
			If IsCachedFileUsable(GetAdsDir, tempFileName) = False Then
				DeleteFileIfExists(GetAdsDir, tempFileName)
				Trace("Не удалось сохранить рекламу в кэш. id=" & adId & ", message=empty temp file")
				j.Release
				Return False
			End If
			If ReplaceCacheFile(GetAdsDir, tempFileName, adId) = False Then
				DeleteFileIfExists(GetAdsDir, tempFileName)
				Trace("Не удалось сохранить рекламу в кэш. id=" & adId & ", message=rename failed")
				j.Release
				Return False
			End If
			UpdateAdIndex(ad, adIndex)
			SaveAdIndex
			recentMediaNetworkFailure = False
			Trace("Реклама сохранена в кэш. id=" & adId & ", totalElapsedMs=" & ElapsedMs(downloadStartedAt))
			j.Release
			Return True
		Catch
			DeleteFileIfExists(GetAdsDir, BuildTempCacheFileName(adId))
			Trace("Не удалось сохранить рекламу в кэш. id=" & adId & ", message=" & LastException.Message)
		End Try
	Else
		If IsMediaNetworkFailure(j.ErrorMessage) Then recentMediaNetworkFailure = True
		Trace("Не удалось скачать рекламу. id=" & adId & ", message=" & j.ErrorMessage)
	End If
	j.Release
	Return False
End Sub

Private Sub EnsureSingleTrackCached(item As Map, trackIndex As Map) As ResumableSub
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return False
	Dim playlistId As String = ResolveTrackPlaylistId(item, trackIndex, trackId)
	If TryRestoreTrackByExpectedPath(trackId, playlistId, item, trackIndex) Then Return False
	If TryRestoreExistingCachedMedia("track", trackId, item, trackIndex) Then Return False
	If IsTrackCached(trackId) Then
		UpdateTrackIndex(item, trackIndex)
		Return False
	End If
	Dim trackUrl As String = BuildTrackUrl(trackId)
	If trackUrl = "" Then Return False
	Dim downloadStartedAt As Long = DateTime.Now
	Dim j As HttpJob
	j.Initialize("", Me)
	Trace("Скачивание трека в кэш. id=" & trackId & ", url=" & trackUrl)
	j.Download(trackUrl)
	j.GetRequest.Timeout = TRACK_DOWNLOAD_TIMEOUT_MS
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Try
			Dim trackDir As String = GetTracksDir
			EnsureDirectory(trackDir)
			Dim tempFileName As String = BuildTempCacheFileName(trackId)
			DeleteFileIfExists(trackDir, tempFileName)
			Dim outStream As OutputStream = File.OpenOutput(trackDir, tempFileName, False)
			TransformStreamWithXor(j.GetInputStream, outStream, BuildTrackObfuscationKey(trackId))
			outStream.Close
			If IsCachedFileUsable(trackDir, tempFileName) = False Then
				DeleteFileIfExists(trackDir, tempFileName)
				Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=empty temp file")
				j.Release
				Return False
			End If
			If ReplaceCacheFile(trackDir, tempFileName, BuildTrackCacheFileName(trackId)) = False Then
				DeleteFileIfExists(trackDir, tempFileName)
				Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=rename failed")
				j.Release
				Return False
			End If
			UpdateTrackIndex(item, trackIndex)
			If ValidateIndexedFile("track", trackId) = False Then
				BackfillTrackIndexFromFiles
				UpdateTrackIndex(item, trackIndex)
				If ValidateIndexedFile("track", trackId) = False Then
					Trace("Не удалось валидировать трек после сохранения. id=" & trackId)
					j.Release
					Return False
				End If
			End If
			SaveTrackIndex
			recentMediaNetworkFailure = False
			Trace("Трек сохранен в кэш. id=" & trackId & ", totalElapsedMs=" & ElapsedMs(downloadStartedAt))
			j.Release
			Return True
		Catch
			Dim failedPlaylistId As String = ResolveTrackPlaylistId(item, trackIndex, trackId)
			DeleteFileIfExists(GetTracksDir, BuildTempCacheFileName(trackId))
			If failedPlaylistId <> "" Then DeleteFileIfExists(GetTrackPlaylistDir(failedPlaylistId), BuildTempCacheFileName(trackId))
			Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=" & LastException.Message)
		End Try
	Else
		If IsMediaNetworkFailure(j.ErrorMessage) Then recentMediaNetworkFailure = True
		Trace("Не удалось скачать трек. id=" & trackId & ", message=" & j.ErrorMessage)
	End If
	j.Release
	Return False
End Sub

Private Sub TryRestoreTrackByExpectedPath(trackId As String, playlistId As String, item As Map, trackIndex As Map) As Boolean
	If trackId = "" Then Return False
	Dim relativeFileName As String = BuildTrackCacheRelativeFileName(trackId, playlistId)
	If IsCachedFileUsable(GetTracksDir, relativeFileName) = False Then Return False
	EnsureTrackIndexEntry(trackId, playlistId, relativeFileName)
	UpdateTrackIndex(item, trackIndex)
	SaveTrackIndex
	Return True
End Sub

Private Sub UpdateAdIndex(ad As Map, adIndex As Map)
	Dim adId As String = ad.GetDefault("id", "")
	If adId = "" Then Return
	Dim entry As Map = adIndex.GetDefault(adId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	entry.Put("id", adId)
	entry.Put("title", ad.GetDefault("title", ""))
	If entry.ContainsKey("saved_at") = False Then entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	entry.Put("duration", ad.GetDefault("duration", 0))
	entry.Put("gain", ad.GetDefault("gain", 0))
	adIndex.Put(adId, entry)
	cachedAdIndexDirty = True
End Sub

Private Sub PruneMissingAds(adIndex As Map, actualAdIds As Map) As Int
	Dim removedCount As Int = 0
	Dim idsToRemove As List
	idsToRemove.Initialize
	For Each adId As String In adIndex.Keys
		If actualAdIds.ContainsKey(adId) = False Then idsToRemove.Add(adId)
	Next
	For Each adId As String In idsToRemove
		DeleteFileIfExists(GetAdsDir, adId)
		adIndex.Remove(adId)
		removedCount = removedCount + 1
		cachedAdIndexDirty = True
		Trace("Удален cached ad, отсутствующий в актуальном data. id=" & adId)
	Next
	Return removedCount
End Sub

Private Sub UpdateTrackIndex(item As Map, trackIndex As Map)
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return
	Dim entry As Map = trackIndex.GetDefault(trackId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	Dim playlistId As String = ResolveTrackPlaylistId(item, trackIndex, trackId)
	Dim fileName As String = BuildTrackCacheRelativeFileName(trackId, playlistId)
	entry.Put("id", trackId)
	entry.Put("playlist_id", playlistId)
	entry.Put("file_name", fileName)
	entry.Put("title", item.GetDefault("title", ""))
	entry.Put("set", item.GetDefault("set", ""))
	entry.Put("stream", item.GetDefault("stream", ""))
	If entry.ContainsKey("saved_at") = False Then entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	entry.Put("gain", item.GetDefault("gain", 0))
	If IsCachedFileUsable(GetTracksDir, fileName) Then entry.Put("size_bytes", GetFileSizeSafe(GetTracksDir, fileName))
	trackIndex.Put(trackId, entry)
	cachedTrackIndexDirty = True
End Sub

Private Sub GetCachedAdIndex As Map
	If cachedAdIndex.IsInitialized = False Then
		cachedAdIndex.Initialize
	End If
	Return cachedAdIndex
End Sub

Private Sub GetCachedTrackIndex As Map
	If cachedTrackIndex.IsInitialized = False Then
		cachedTrackIndex.Initialize
	End If
	Return cachedTrackIndex
End Sub

Public Sub ResolveAnyCachedTrackFromIndex(playlistId As String, currentTrackId As String) As Map
	Dim emptyTrack As Map
	emptyTrack.Initialize
	EnsureTrackCacheReady
	If cachedTrackIndex.IsInitialized = False Then Return emptyTrack
	Dim selectedTrack As Map
	selectedTrack.Initialize
	For Each trackId As String In cachedTrackIndex.Keys
		If currentTrackId <> "" And cachedTrackIndex.Size > 1 And trackId = currentTrackId Then Continue
		Dim entry As Map = cachedTrackIndex.GetDefault(trackId, Null)
		If entry.IsInitialized = False Then Continue
		Dim entryPlaylistId As String = entry.GetDefault("playlist_id", "")
		If playlistId <> "" And entryPlaylistId <> playlistId Then Continue
		Dim fileName As String = ResolveTrackCacheFileName(trackId, cachedTrackIndex)
		If IsCachedFileUsable(GetTracksDir, fileName) = False Then Continue
		Dim copiedTrack As Map
		copiedTrack.Initialize
		For Each key As Object In entry.Keys
			copiedTrack.Put(key, entry.Get(key))
		Next
		selectedTrack = copiedTrack
		If selectedTrack.GetDefault("id", "") = "" Then selectedTrack.Put("id", trackId)
		If selectedTrack.GetDefault("playlist_id", "") = "" Then selectedTrack.Put("playlist_id", entryPlaylistId)
		If selectedTrack.GetDefault("playlist_title", "") = "" Then selectedTrack.Put("playlist_title", entry.GetDefault("title", ""))
		Exit
	Next
	If selectedTrack.IsInitialized And selectedTrack.Size > 0 Then Return selectedTrack
	Return emptyTrack
End Sub

Public Sub TouchCachedItem(item As Map)
	If item.IsInitialized = False Then Return
	Dim itemId As String = item.GetDefault("id", "")
	If itemId = "" Then Return
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then
		If cachedAdIndex.ContainsKey(itemId) = False Then Return
		UpdateAdIndex(item, cachedAdIndex)
		Return
	End If
	If itemType = "track" Then
		If cachedTrackIndex.ContainsKey(itemId) = False Then Return
		UpdateTrackIndex(item, cachedTrackIndex)
	End If
End Sub

Private Sub LoadIndexesFromStorage
	cachedAdIndex = storage.GetDefault("cached_ad_index", Null)
	If cachedAdIndex.IsInitialized = False Then cachedAdIndex.Initialize
	cachedTrackIndex = storage.GetDefault("cached_track_index", Null)
	If cachedTrackIndex.IsInitialized = False Then cachedTrackIndex.Initialize
	LoadCacheStatsSnapshot
	MigrateLegacyTrackCacheLayout
	NormalizeTrackIndexFileNames(cachedTrackIndex)
	BackfillTrackIndexFromFiles
	RebuildCacheStatsFromIndexes
	SaveCacheStatsSnapshot
End Sub

Private Sub SaveAdIndex
	RebuildCacheStatsFromIndexes
	storage.Put("cached_ad_index", cachedAdIndex)
	storage.Put("cached_ad_count", cachedAdCount)
	SaveCacheStatsSnapshot
	cachedAdIndexDirty = False
End Sub

Private Sub SaveTrackIndex
	RebuildCacheStatsFromIndexes
	storage.Put("cached_track_index", cachedTrackIndex)
	storage.Put("cached_track_count", cachedTrackCount)
	SaveCacheStatsSnapshot
	cachedTrackIndexDirty = False
End Sub

Private Sub BuildAdUrl(adId As String) As String
	If adId = "" Then Return ""
	Dim first As String = adId.SubString2(0, 1)
	Return "https://cdn.fon.fm/media/ads/" & first & "/" & adId & ".mp3"
End Sub

Private Sub BuildTrackUrl(trackId As String) As String
	If trackId = "" Then Return ""
	Dim first As String = trackId.SubString2(0, 1)
	Return "https://cdn.fon.fm/media/tracks/" & first & "/" & trackId & ".mp3"
End Sub

Private Sub BuildTrackCacheFileName(trackId As String) As String
	Dim sourceBytes() As Byte = GetBytesFromString(BuildTrackObfuscationSeed("cache", trackId))
	Dim jo As JavaObject
	jo.InitializeStatic("java.util.UUID")
	Dim uuid As JavaObject = jo.RunMethod("nameUUIDFromBytes", Array As Object(sourceBytes))
	Dim fileName As String = uuid.RunMethod("toString", Null)
	Return fileName.Replace("-", "")
End Sub

Private Sub BuildTrackCacheRelativeFileName(trackId As String, playlistId As String) As String
	Dim unusedPlaylistId As String = playlistId
	If unusedPlaylistId = "" Then
	End If
	Return BuildTrackCacheFileName(trackId)
End Sub

Private Sub GetTrackPlaylistDir(playlistId As String) As String
	Dim unusedPlaylistId As String = playlistId
	If unusedPlaylistId = "" Then
	End If
	Return GetTracksDir
End Sub

Private Sub IsCachedFileUsable(dir As String, fileName As String) As Boolean
	If fileName = "" Then Return False
	Dim fileDir As String = ResolveRelativeParentDir(dir, fileName)
	Dim leafName As String = ResolveRelativeLeafName(fileName)
	If File.Exists(fileDir, leafName) = False Then Return False
	Try
		If File.Size(fileDir, leafName) > 0 Then Return True
	Catch
		Trace("ошибка кэша context=file_size message=" & LastException.Message)
	End Try
	DeleteFileIfExists(dir, fileName)
	Return False
End Sub

Private Sub BuildTempCacheFileName(itemId As String) As String
	Return itemId & ".tmp"
End Sub

Private Sub BuildPlaybackTempTrackFileName(audioKey As String) As String
	If audioKey = "secondary" Then Return SECONDARY_TEMP_TRACK_FILE
	Return PRIMARY_TEMP_TRACK_FILE
End Sub

Private Sub ReplaceCacheFile(dir As String, tempFileName As String, finalFileName As String) As Boolean
	If IsCachedFileUsable(dir, tempFileName) = False Then Return False
	If IsCachedFileUsable(dir, finalFileName) Then
		DeleteFileIfExists(dir, tempFileName)
		Return True
	End If
	DeleteFileIfExists(dir, finalFileName)
	Dim tempFile As JavaObject
	tempFile.InitializeNewInstance("java.io.File", Array As Object(File.Combine(dir, tempFileName)))
	Dim finalFile As JavaObject
	finalFile.InitializeNewInstance("java.io.File", Array As Object(File.Combine(dir, finalFileName)))
	Dim renamed As Boolean = tempFile.RunMethod("renameTo", Array As Object(finalFile))
	If renamed = False And IsCachedFileUsable(dir, finalFileName) Then
		DeleteFileIfExists(dir, tempFileName)
		Return True
	End If
	Return renamed
End Sub

Private Sub EnsureTrackPlaybackTemp(audioKey As String, item As Map) As Boolean
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return False
	Dim tempFileName As String = BuildPlaybackTempTrackFileName(audioKey)
	If playbackTempTrackIds.GetDefault(audioKey, "") = trackId And IsCachedFileUsable(File.DirTemp, tempFileName) Then Return True
	DeleteFileIfExists(File.DirTemp, tempFileName)
	Try
		Dim sourceRelativeName As String = ResolveTrackRelativeFileNameFromItem(item)
		Dim sourceDir As String = ResolveRelativeParentDir(GetTracksDir, sourceRelativeName)
		Dim sourceLeafName As String = ResolveRelativeLeafName(sourceRelativeName)
		Dim inputStream As InputStream = File.OpenInput(sourceDir, sourceLeafName)
		Dim outputStream As OutputStream = File.OpenOutput(File.DirTemp, tempFileName, False)
		TransformStreamWithXor(inputStream, outputStream, BuildTrackObfuscationKey(trackId))
		outputStream.Close
		inputStream.Close
		playbackTempTrackIds.Put(audioKey, trackId)
		Return IsCachedFileUsable(File.DirTemp, tempFileName)
	Catch
		DeleteFileIfExists(File.DirTemp, tempFileName)
		Trace("Не удалось подготовить временный файл трека. id=" & trackId & ", message=" & LastException.Message)
	End Try
	playbackTempTrackIds.Remove(audioKey)
	Return False
End Sub

Private Sub ResolveTrackRelativeFileNameFromItem(item As Map) As String
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return ""
	Dim playlistId As String = item.GetDefault("playlist_id", "")
	Dim preferredRelativeName As String = BuildTrackCacheRelativeFileName(trackId, playlistId)
	If IsCachedFileUsable(GetTracksDir, preferredRelativeName) Then Return preferredRelativeName
	Return ResolveTrackCacheFileName(trackId, cachedTrackIndex)
End Sub

Private Sub EnsureTrackIndexEntry(trackId As String, playlistId As String, relativeFileName As String)
	If trackId = "" Or relativeFileName = "" Then Return
	If cachedTrackIndex.IsInitialized = False Then cachedTrackIndex.Initialize
	Dim entry As Map = cachedTrackIndex.GetDefault(trackId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	entry.Put("id", trackId)
	If playlistId <> "" Then entry.Put("playlist_id", playlistId)
	entry.Put("file_name", relativeFileName)
	entry.Put("size_bytes", GetFileSizeSafe(GetTracksDir, relativeFileName))
	If entry.ContainsKey("saved_at") = False Then entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	cachedTrackIndex.Put(trackId, entry)
	cachedTrackIndexDirty = True
End Sub

Private Sub MigrateLegacyTrackCacheLayout
	If DirectoryExists(GetTracksDir) = False Then Return
	Dim listedFiles As List = ListTrackCacheFilesRecursive
	If listedFiles.IsInitialized = False Or listedFiles.Size = 0 Then Return
	Dim migratedCount As Int = 0
	For Each relativeFileName As String In listedFiles
		If relativeFileName = "" Or relativeFileName.EndsWith(".tmp") Then Continue
		If relativeFileName.Contains("/") = False And relativeFileName.Contains("\") = False Then Continue
		Dim flatFileName As String = ResolveRelativeLeafName(relativeFileName)
		If flatFileName = "" Then Continue
		If MoveLegacyTrackFileToFlat(relativeFileName, flatFileName) Then migratedCount = migratedCount + 1
	Next
	If migratedCount > 0 Then
		Trace("Миграция кэша треков в плоскую структуру завершена. moved=" & migratedCount)
	End If
	CleanupLegacyTrackSubdirs
End Sub

Private Sub MoveLegacyTrackFileToFlat(sourceRelativeName As String, flatFileName As String) As Boolean
	If sourceRelativeName = "" Or flatFileName = "" Then Return False
	If IsCachedFileUsable(GetTracksDir, sourceRelativeName) = False Then Return False
	If IsCachedFileUsable(GetTracksDir, flatFileName) Then
		DeleteFileIfExists(GetTracksDir, sourceRelativeName)
		Return False
	End If
	Dim sourceDir As String = ResolveRelativeParentDir(GetTracksDir, sourceRelativeName)
	Dim sourceLeaf As String = ResolveRelativeLeafName(sourceRelativeName)
	Dim inputStream As InputStream
	Dim outputStream As OutputStream
	Try
		inputStream = File.OpenInput(sourceDir, sourceLeaf)
		outputStream = File.OpenOutput(GetTracksDir, flatFileName, False)
		File.Copy2(inputStream, outputStream)
		outputStream.Close
		inputStream.Close
		If IsCachedFileUsable(GetTracksDir, flatFileName) = False Then
			DeleteFileIfExists(GetTracksDir, flatFileName)
			Return False
		End If
		DeleteFileIfExists(GetTracksDir, sourceRelativeName)
		Return True
	Catch
		Try
			If outputStream.IsInitialized Then outputStream.Close
		Catch
			Log(LastException.Message)
		End Try
		Try
			If inputStream.IsInitialized Then inputStream.Close
		Catch
			Log(LastException.Message)
		End Try
		DeleteFileIfExists(GetTracksDir, flatFileName)
		Trace("Не удалось переместить legacy track cache файл. source=" & sourceRelativeName & ", message=" & LastException.Message)
		Return False
	End Try
End Sub

Private Sub CleanupLegacyTrackSubdirs
	Try
		Dim listed As List = File.ListFiles(GetTracksDir)
		If listed.IsInitialized = False Then Return
		For Each name As String In listed
			If name = "" Then Continue
			If File.IsDirectory(GetTracksDir, name) = False Then Continue
			DeleteTrackSubdirRecursive(File.Combine(GetTracksDir, name))
		Next
	Catch
		Trace("Не удалось очистить legacy папки кэша треков. message=" & LastException.Message)
	End Try
End Sub

Private Sub DeleteTrackSubdirRecursive(path As String)
	Try
		If DirectoryExists(path) = False Then Return
		Dim listed As List = File.ListFiles(path)
		If listed.IsInitialized Then
			For Each name As String In listed
				If name = "" Then Continue
				If File.IsDirectory(path, name) Then
					DeleteTrackSubdirRecursive(File.Combine(path, name))
				Else
					File.Delete(path, name)
				End If
			Next
		End If
		File.Delete(path, "")
	Catch
		Trace("Не удалось удалить legacy папку кэша треков. dir=" & path & ", message=" & LastException.Message)
	End Try
End Sub

Private Sub BuildTrackObfuscationKey(trackId As String) As Byte()
	Return GetBytesFromString(BuildTrackObfuscationSeed("key", trackId))
End Sub

Private Sub BuildTrackObfuscationSeed(purpose As String, trackId As String) As String
	Return "fonfm|" & purpose & "|" & trackId
End Sub

Private Sub GetBytesFromString(value As String) As Byte()
	Dim jo As JavaObject
	jo.InitializeNewInstance("java.lang.String", Array As Object(value))
	Return jo.RunMethod("getBytes", Array As Object("UTF-8"))
End Sub

Private Sub TransformStreamWithXor(inputStream As InputStream, outputStream As OutputStream, keyBytes() As Byte)
	If keyBytes.Length = 0 Then
		File.Copy2(inputStream, outputStream)
		outputStream.Flush
		Return
	End If
	Dim buffer(STREAM_XOR_BUFFER_SIZE) As Byte
	Dim totalProcessed As Long = 0
	Do While True
		Dim count As Int = inputStream.ReadBytes(buffer, 0, buffer.Length)
		If count <= 0 Then Exit
		ApplyXorToBuffer(buffer, count, keyBytes, totalProcessed)
		outputStream.WriteBytes(buffer, 0, count)
		totalProcessed = totalProcessed + count
	Loop
	outputStream.Flush
End Sub

Private Sub ApplyXorToBuffer(buffer() As Byte, count As Int, keyBytes() As Byte, keyOffset As Long)
	If count <= 0 Or keyBytes.Length = 0 Then Return
	For i = 0 To count - 1
		Dim keyIndex As Int = (keyOffset + i) Mod keyBytes.Length
		buffer(i) = Bit.Xor(buffer(i), keyBytes(keyIndex))
	Next
End Sub

Private Sub DeleteFileIfExists(dir As String, fileName As String)
	If fileName = "" Then Return
	Try
		Dim fileDir As String = ResolveRelativeParentDir(dir, fileName)
		Dim leafName As String = ResolveRelativeLeafName(fileName)
		If File.Exists(fileDir, leafName) Then File.Delete(fileDir, leafName)
	Catch
		Trace("ошибка кэша context=file_delete message=" & LastException.Message)
	End Try
End Sub

Public Sub ResolveMediaSource(item As Map) As String
	If item.IsInitialized = False Then Return "none"
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then
		If HasValidatedLocalMedia(item) Then Return "cache"
		Return "missing"
	End If
	If itemType = "track" Then
		If HasValidatedLocalMedia(item) Then Return "cache"
		Return "missing"
	End If
	Return "none"
End Sub

Private Sub ValidateIndexedFile(itemType As String, itemId As String) As Boolean
	If itemId = "" Then Return False
	Dim auditIndex As Map = GetIndexByItemType(itemType)
	Dim auditDir As String = GetDirByItemType(itemType)
	Dim fileName As String = ResolveIndexedFileName(itemType, itemId, auditIndex)
	If itemType = "track" Then
		If TryHealTrackIndexEntry(itemId, auditIndex, auditDir, fileName) Then
			fileName = ResolveIndexedFileName(itemType, itemId, auditIndex)
		End If
	End If
	If auditIndex.ContainsKey(itemId) = False Then
		If IsCachedFileUsable(auditDir, fileName) = False Then Return False
		RestoreIndexedFileById(itemId, auditIndex)
		SaveIndexByItemType(itemType)
		Return True
	End If
	If IsCachedFileUsable(auditDir, fileName) Then Return True
	If itemType = "track" Then
		If TryHealTrackIndexEntry(itemId, auditIndex, auditDir, fileName) Then
			fileName = ResolveIndexedFileName(itemType, itemId, auditIndex)
			If IsCachedFileUsable(auditDir, fileName) Then Return True
		End If
	End If
	auditIndex.Remove(itemId)
	SaveIndexByItemType(itemType)
	Return False
End Sub

Private Sub TryHealTrackIndexEntry(trackId As String, trackIndex As Map, trackDir As String, currentFileName As String) As Boolean
	If trackId = "" Then Return False
	If IsCachedFileUsable(trackDir, currentFileName) Then Return False
	Dim expectedPlaylistId As String = ""
	Dim existingEntry As Map = trackIndex.GetDefault(trackId, Null)
	If existingEntry.IsInitialized Then expectedPlaylistId = existingEntry.GetDefault("playlist_id", "")
	Dim expectedFileName As String = BuildTrackCacheRelativeFileName(trackId, expectedPlaylistId)
	If expectedFileName <> "" And expectedFileName <> currentFileName Then
		If IsCachedFileUsable(trackDir, expectedFileName) Then
			If existingEntry.IsInitialized = False Then existingEntry.Initialize
			existingEntry.Put("id", trackId)
			existingEntry.Put("playlist_id", expectedPlaylistId)
			existingEntry.Put("file_name", expectedFileName)
			existingEntry.Put("size_bytes", GetFileSizeSafe(trackDir, expectedFileName))
			If existingEntry.ContainsKey("saved_at") = False Then existingEntry.Put("saved_at", DateTime.Now)
			existingEntry.Put("last_used_at", DateTime.Now)
			trackIndex.Put(trackId, existingEntry)
			cachedTrackIndexDirty = True
			SaveTrackIndex
			Return True
		End If
	End If
	BackfillTrackIndexFromFiles
	Dim healedFileName As String = ResolveTrackCacheFileName(trackId, cachedTrackIndex)
	If IsCachedFileUsable(trackDir, healedFileName) Then Return True
	Return False
End Sub

Private Sub RestoreIndexedFileById(itemId As String, itemIndex As Map)
	Dim entry As Map = itemIndex.GetDefault(itemId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	entry.Put("id", itemId)
	Dim playlistId As String = entry.GetDefault("playlist_id", "")
	entry.Put("file_name", BuildTrackCacheRelativeFileName(itemId, playlistId))
	If entry.ContainsKey("saved_at") = False Then entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	itemIndex.Put(itemId, entry)
End Sub

Private Sub TryRestoreExistingCachedMedia(itemType As String, itemId As String, item As Map, itemIndex As Map) As Boolean
	If itemId = "" Then Return False
	If IsCachedFileUsable(GetDirByItemType(itemType), ResolveIndexedFileName(itemType, itemId, itemIndex)) = False Then Return False
	If itemType = "ad" Then
		UpdateAdIndex(item, itemIndex)
		SaveAdIndex
		Return True
	End If
	If itemType = "track" Then
		UpdateTrackIndex(item, itemIndex)
		SaveTrackIndex
		Return True
	End If
	Return False
End Sub

Private Sub GetIndexByItemType(itemType As String) As Map
	If itemType = "ad" Then Return cachedAdIndex
	Return cachedTrackIndex
End Sub

Private Sub GetDirByItemType(itemType As String) As String
	If itemType = "ad" Then Return GetAdsDir
	Return GetTracksDir
End Sub

Private Sub SaveIndexByItemType(itemType As String)
	If itemType = "ad" Then
		SaveAdIndex
	Else
		SaveTrackIndex
	End If
End Sub

Private Sub ResolveIndexedFileName(itemType As String, itemId As String, itemIndex As Map) As String
	If itemType = "ad" Then Return itemId
	Return ResolveTrackCacheFileName(itemId, itemIndex)
End Sub

Private Sub ResolveTrackCacheFileName(trackId As String, trackIndex As Map) As String
	Dim entry As Map = trackIndex.GetDefault(trackId, Null)
	If entry.IsInitialized Then
		Dim fileName As String = entry.GetDefault("file_name", "")
		If fileName <> "" Then Return fileName
	End If
	Dim playlistId As String = ""
	If entry.IsInitialized Then playlistId = entry.GetDefault("playlist_id", "")
	Return BuildTrackCacheRelativeFileName(trackId, playlistId)
End Sub

Private Sub IsMediaNetworkFailure(errorMessage As String) As Boolean
	Dim text As String = errorMessage.ToLowerCase
	If text.Contains("timed out") Then Return True
	If text.Contains("unknownhost") Then Return True
	If text.Contains("refused") Then Return True
	If text.Contains("sslhandshakeexception") Then Return True
	If text.Contains("pkix path building failed") Then Return True
	If text.Contains("unable to find valid certification path") Then Return True
	If text.Contains("connectexception") Then Return True
	If text.Contains("socketexception") Then Return True
	If text.Contains("sockettimeoutexception") Then Return True
	Return False
End Sub

Private Sub ElapsedMs(startedAt As Long) As Long
	Return Max(0, DateTime.Now - startedAt)
End Sub

Private Sub EnsureDirectory(path As String)
	Dim fileObject As JavaObject
	fileObject.InitializeNewInstance("java.io.File", Array As Object(path))
	fileObject.RunMethod("mkdirs", Null)
End Sub

Private Sub DirectoryExists(path As String) As Boolean
	If path = "" Then Return False
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(path))
		If fileObject.RunMethod("exists", Null) = False Then Return False
		Return fileObject.RunMethod("isDirectory", Null)
	Catch
		Return False
	End Try
End Sub

Private Sub PrepareNextCacheAuditType As Boolean
	If cacheAuditPendingTypes.IsInitialized = False Or cacheAuditPendingTypes.Size = 0 Then Return False
	cacheAuditCurrentType = cacheAuditPendingTypes.Get(0)
	cacheAuditPendingTypes.RemoveAt(0)
	cacheAuditCurrentPosition = 0
	cacheAuditSeenIds.Initialize
	cacheAuditCurrentFileNames.Initialize
	Dim auditDir As String = GetAuditDirByType(cacheAuditCurrentType)
	Try
		If DirectoryExists(auditDir) Then
			cacheAuditListingDir = auditDir
			cacheAuditListingInProgress = True
			StartCacheAuditFileListingAsync
		End If
	Catch
		Trace("Не удалось получить список файлов для аудита кэша. type=" & cacheAuditCurrentType & ", message=" & LastException.Message)
	End Try
	Return True
End Sub

Private Sub StartCacheAuditFileListingAsync As ResumableSub
	Dim listedFiles As List
	listedFiles.Initialize
	Wait For (File.ListFilesAsync(cacheAuditListingDir)) Complete (success As Boolean, files As List)
	If success And files.IsInitialized Then
		listedFiles = files
	Else
		Trace("Не удалось получить список файлов для аудита кэша async. type=" & cacheAuditCurrentType & ", success=" & success)
	End If
	If cacheAuditCurrentFileNames.IsInitialized = False Then cacheAuditCurrentFileNames.Initialize
	cacheAuditCurrentFileNames.Clear
	For Each fileName As String In listedFiles
		cacheAuditCurrentFileNames.Add(fileName)
	Next
	cacheAuditListingInProgress = False
	cacheAuditListingDir = ""
	Return True
End Sub

Private Sub ProcessCurrentCacheAuditBatch
	Dim auditDir As String = GetAuditDirByType(cacheAuditCurrentType)
	Dim auditIndex As Map = GetAuditIndexByType(cacheAuditCurrentType)
	For i = 1 To CACHE_AUDIT_BATCH_SIZE
		If cacheAuditCurrentPosition >= cacheAuditCurrentFileNames.Size Then Exit
		Dim fileName As String = cacheAuditCurrentFileNames.Get(cacheAuditCurrentPosition)
		cacheAuditCurrentPosition = cacheAuditCurrentPosition + 1
		If fileName = "" Then Continue
		If File.IsDirectory(auditDir, fileName) Then Continue
		If fileName.EndsWith(".tmp") Then
			DeleteFileIfExists(auditDir, fileName)
			cacheAuditTempDeletedCount = cacheAuditTempDeletedCount + 1
			MarkAuditIndexChanged(cacheAuditCurrentType)
			Continue
		End If
		If IsCachedFileUsable(auditDir, fileName) = False Then Continue
		If cacheAuditCurrentType = "tracks" Then
			Dim trackId As String = FindTrackIdByFileName(fileName, auditIndex)
			If trackId = "" Then
				' Be conservative: never delete a usable cached track during audit
				' just because the current index cannot identify it.
				Continue
			End If
			cacheAuditSeenIds.Put(trackId, True)
		Else
			cacheAuditSeenIds.Put(fileName, True)
			If auditIndex.ContainsKey(fileName) = False Then
				AddIndexedFileFromAudit(cacheAuditCurrentType, fileName, auditIndex)
				cacheAuditAddedCount = cacheAuditAddedCount + 1
			End If
		End If
	Next
End Sub

Private Sub FinalizeCurrentCacheAuditType
	Dim auditDir As String = GetAuditDirByType(cacheAuditCurrentType)
	Dim auditIndex As Map = GetAuditIndexByType(cacheAuditCurrentType)
	Dim keysCopy As List
	keysCopy.Initialize
	For Each key As String In auditIndex.Keys
		keysCopy.Add(key)
	Next
	For Each key As String In keysCopy
		If cacheAuditSeenIds.ContainsKey(key) = False Then
			Dim fileName As String = ResolveIndexedAuditFileName(cacheAuditCurrentType, key, auditIndex)
			If IsCachedFileUsable(auditDir, fileName) Then
				cacheAuditSeenIds.Put(key, True)
				Continue
			End If
			auditIndex.Remove(key)
			cacheAuditRemovedCount = cacheAuditRemovedCount + 1
			MarkAuditIndexChanged(cacheAuditCurrentType)
		End If
	Next
End Sub

Private Sub FinishCacheAudit
	If cacheAuditAdIndexChanged Then SaveAdIndex
	If cacheAuditTrackIndexChanged Then SaveTrackIndex
	cacheAuditInProgress = False
	cacheAuditCurrentType = ""
	cacheAuditListingInProgress = False
	cacheAuditListingDir = ""
	Trace("Аудит кэша завершен. added=" & cacheAuditAddedCount & ", removed=" & cacheAuditRemovedCount & ", tempDeleted=" & cacheAuditTempDeletedCount & ", ads=" & cachedAdIndex.Size & ", tracks=" & cachedTrackIndex.Size)
End Sub

Private Sub GetAuditDirByType(itemType As String) As String
	If itemType = "ads" Then Return GetAdsDir
	Return GetTracksDir
End Sub

Private Sub GetAuditIndexByType(itemType As String) As Map
	If itemType = "ads" Then Return cachedAdIndex
	Return cachedTrackIndex
End Sub

Private Sub MarkAuditIndexChanged(itemType As String)
	If itemType = "ads" Then
		cacheAuditAdIndexChanged = True
		cachedAdIndexDirty = True
	Else
		cacheAuditTrackIndexChanged = True
		cachedTrackIndexDirty = True
	End If
End Sub

Private Sub AddIndexedFileFromAudit(itemType As String, fileName As String, auditIndex As Map)
	Dim entry As Map
	entry.Initialize
	entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	If itemType = "ads" Then
		entry.Put("id", fileName)
		entry.Put("title", "")
		entry.Put("duration", 0)
		entry.Put("gain", 0)
		auditIndex.Put(fileName, entry)
	Else
		Dim trackId As String = FindTrackIdByFileName(fileName, auditIndex)
		If trackId = "" Then Return
		entry.Put("id", trackId)
		entry.Put("title", "")
		entry.Put("set", "")
		entry.Put("stream", "")
		entry.Put("gain", 0)
		Dim existingEntry As Map = auditIndex.GetDefault(trackId, Null)
		Dim playlistId As String = ExtractPlaylistIdFromTrackRelativePath(fileName)
		If playlistId = "" And existingEntry.IsInitialized Then playlistId = existingEntry.GetDefault("playlist_id", "")
		entry.Put("playlist_id", playlistId)
		entry.Put("file_name", fileName)
		entry.Put("size_bytes", GetFileSizeSafe(GetTracksDir, fileName))
		auditIndex.Put(trackId, entry)
	End If
	MarkAuditIndexChanged(itemType)
End Sub

Private Sub ResolveIndexedAuditFileName(auditType As String, itemId As String, auditIndex As Map) As String
	If auditType = "ads" Then Return itemId
	Return ResolveTrackCacheFileName(itemId, auditIndex)
End Sub

Private Sub FindTrackIdByFileName(fileName As String, trackIndex As Map) As String
	For Each key As String In trackIndex.Keys
		Dim entry As Map = trackIndex.GetDefault(key, Null)
		If entry.IsInitialized Then
			Dim storedFileName As String = entry.GetDefault("file_name", "")
			If storedFileName = fileName Then Return key
		End If
		If File.GetName(fileName) = BuildTrackCacheFileName(key) Then Return key
	Next
	Return ""
End Sub

Private Sub FindTrackIdByFileNameWithMetadata(fileName As String, trackIndex As Map, playlistTrackMaps As Map) As String
	Dim resolvedTrackId As String = FindTrackIdByFileName(fileName, trackIndex)
	If resolvedTrackId <> "" Then Return resolvedTrackId
	Dim playlistId As String = ExtractPlaylistIdFromTrackRelativePath(fileName)
	If playlistId = "" Then
		Dim globalTrackMap As Map = LoadGlobalTrackFileMap(playlistTrackMaps)
		If globalTrackMap.IsInitialized = False Then Return ""
		Return globalTrackMap.GetDefault(File.GetName(fileName), "")
	End If
	Dim playlistTrackMap As Map = LoadPlaylistTrackFileMap(playlistId, playlistTrackMaps)
	If playlistTrackMap.IsInitialized = False Then Return ""
	Return playlistTrackMap.GetDefault(fileName, "")
End Sub

Private Sub LoadGlobalTrackFileMap(playlistTrackMaps As Map) As Map
	Dim emptyMap As Map
	emptyMap.Initialize
	Dim cacheKey As String = "__global_track_file_map__"
	If playlistTrackMaps.ContainsKey(cacheKey) Then Return playlistTrackMaps.Get(cacheKey)
	Dim result As Map
	result.Initialize
	Dim playlistsDir As String = File.Combine(storageDir, "playlists")
	If DirectoryExists(playlistsDir) = False Then
		playlistTrackMaps.Put(cacheKey, result)
		Return result
	End If
	Try
		Dim listed As List = File.ListFiles(playlistsDir)
		If listed.IsInitialized Then
			For Each fileName As String In listed
				If fileName = "" Then Continue
				If fileName.ToLowerCase.EndsWith(".json") = False Then Continue
				Dim playlistId As String = fileName.SubString2(0, fileName.Length - 5)
				If playlistId = "" Then Continue
				Dim playlistTrackMap As Map = LoadPlaylistTrackFileMap(playlistId, playlistTrackMaps)
				If playlistTrackMap.IsInitialized = False Then Continue
				For Each relativeName As String In playlistTrackMap.Keys
					If result.ContainsKey(relativeName) Then Continue
					result.Put(relativeName, playlistTrackMap.Get(relativeName))
				Next
			Next
		End If
	Catch
		Trace("Не удалось восстановить глобальную track map по playlist metadata. message=" & LastException.Message)
	End Try
	playlistTrackMaps.Put(cacheKey, result)
	Return result
End Sub

Private Sub NormalizeTrackIndexFileNames(trackIndex As Map)
	If trackIndex.IsInitialized = False Then Return
	Dim changed As Boolean = False
	For Each trackId As String In trackIndex.Keys
		Dim entry As Map = trackIndex.GetDefault(trackId, Null)
		If entry.IsInitialized = False Then Continue
		Dim playlistId As String = entry.GetDefault("playlist_id", "")
		Dim canonicalFileName As String = BuildTrackCacheRelativeFileName(trackId, playlistId)
		Dim storedFileName As String = entry.GetDefault("file_name", "")
		If storedFileName = canonicalFileName Then Continue
		If IsCachedFileUsable(GetTracksDir, canonicalFileName) Then
			entry.Put("file_name", canonicalFileName)
			entry.Put("size_bytes", GetFileSizeSafe(GetTracksDir, canonicalFileName))
			trackIndex.Put(trackId, entry)
			changed = True
		End If
	Next
	If changed Then SaveTrackIndex
End Sub

Private Sub BackfillTrackIndexFromFiles
	If cachedTrackIndex.IsInitialized = False Then cachedTrackIndex.Initialize
	Dim changed As Boolean = False
	Dim playlistTrackMaps As Map
	playlistTrackMaps.Initialize
	Try
		If DirectoryExists(GetTracksDir) = False Then Return
		Dim listedFiles As List = ListTrackCacheFilesRecursive
		If listedFiles.IsInitialized = False Then Return
		For Each fileName As String In listedFiles
			If fileName = "" Then Continue
			If fileName.EndsWith(".tmp") Then Continue
			Dim trackId As String = FindTrackIdByFileNameWithMetadata(fileName, cachedTrackIndex, playlistTrackMaps)
			If trackId = "" Then Continue
			Dim entry As Map = cachedTrackIndex.GetDefault(trackId, Null)
			If entry.IsInitialized = False Then entry.Initialize
			Dim storedFileName As String = "" & entry.GetDefault("file_name", "")
			If storedFileName <> fileName Then
				entry.Put("file_name", fileName)
				changed = True
			End If
			Dim playlistId As String = ExtractPlaylistIdFromTrackRelativePath(fileName)
			If playlistId = "" Then playlistId = ResolvePlaylistIdForTrackId(trackId, entry.GetDefault("playlist_id", ""), playlistTrackMaps)
			If playlistId <> "" And entry.GetDefault("playlist_id", "") <> playlistId Then
				entry.Put("playlist_id", playlistId)
				changed = True
			End If
			If entry.ContainsKey("id") = False Then
				entry.Put("id", trackId)
				changed = True
			End If
			Dim fileSize As Long = GetFileSizeSafe(GetTracksDir, fileName)
			Dim storedSize As Long = ToLongDefault(entry.GetDefault("size_bytes", -1), -1)
			If storedSize <> fileSize Then
				entry.Put("size_bytes", fileSize)
				changed = True
			End If
			If entry.ContainsKey("saved_at") = False Then
				entry.Put("saved_at", DateTime.Now)
				changed = True
			End If
			If entry.ContainsKey("last_used_at") = False Then
				entry.Put("last_used_at", DateTime.Now)
				changed = True
			End If
			cachedTrackIndex.Put(trackId, entry)
		Next
	Catch
		Trace("Не удалось выполнить стартовую переиндексацию кэша треков. message=" & LastException.Message)
	End Try
	If changed Then SaveTrackIndex
End Sub

Private Sub ResolvePlaylistIdForTrackId(trackId As String, preferredPlaylistId As String, playlistTrackMaps As Map) As String
	If trackId = "" Then Return ""
	If preferredPlaylistId <> "" Then Return preferredPlaylistId
	Dim playlistsDir As String = File.Combine(storageDir, "playlists")
	If DirectoryExists(playlistsDir) = False Then Return ""
	Try
		Dim listed As List = File.ListFiles(playlistsDir)
		If listed.IsInitialized = False Then Return ""
		For Each fileName As String In listed
			If fileName = "" Then Continue
			If fileName.ToLowerCase.EndsWith(".json") = False Then Continue
			Dim playlistId As String = fileName.SubString2(0, fileName.Length - 5)
			If playlistId = "" Then Continue
			Dim playlistTrackIds As Map = LoadPlaylistTrackIdMap(playlistId, playlistTrackMaps)
			If playlistTrackIds.IsInitialized = False Then Continue
			If playlistTrackIds.ContainsKey(trackId) Then Return playlistId
		Next
	Catch
		Trace("Не удалось определить playlist_id для cached track. trackId=" & trackId & ", message=" & LastException.Message)
	End Try
	Return ""
End Sub

Private Sub LoadPlaylistTrackIdMap(playlistId As String, playlistTrackMaps As Map) As Map
	Dim emptyMap As Map
	emptyMap.Initialize
	If playlistId = "" Then Return emptyMap
	Dim cacheKey As String = "ids:" & playlistId
	If playlistTrackMaps.ContainsKey(cacheKey) Then Return playlistTrackMaps.Get(cacheKey)
	Dim result As Map
	result.Initialize
	Dim playlistsDir As String = File.Combine(storageDir, "playlists")
	Dim metadataFileName As String = playlistId & ".json"
	If File.Exists(playlistsDir, metadataFileName) = False Then
		playlistTrackMaps.Put(cacheKey, result)
		Return result
	End If
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(playlistsDir, metadataFileName))
		Dim playlistData As Map = parser.NextObject
		Dim tracks As List = playlistData.GetDefault("tracks", Null)
		If tracks.IsInitialized Then
			For Each trackObject As Object In tracks
				If (trackObject Is Map) = False Then Continue
				Dim track As Map = trackObject
				Dim trackId As String = track.GetDefault("id", "")
				If trackId = "" Then Continue
				result.Put(trackId, True)
			Next
		End If
	Catch
		Trace("Не удалось восстановить track id map по playlist metadata. playlistId=" & playlistId & ", message=" & LastException.Message)
	End Try
	playlistTrackMaps.Put(cacheKey, result)
	Return result
End Sub

Private Sub LoadPlaylistTrackFileMap(playlistId As String, playlistTrackMaps As Map) As Map
	Dim emptyMap As Map
	emptyMap.Initialize
	If playlistId = "" Then Return emptyMap
	If playlistTrackMaps.ContainsKey(playlistId) Then Return playlistTrackMaps.Get(playlistId)
	Dim result As Map
	result.Initialize
	Dim playlistsDir As String = File.Combine(storageDir, "playlists")
	Dim metadataFileName As String = playlistId & ".json"
	If File.Exists(playlistsDir, metadataFileName) = False Then
		playlistTrackMaps.Put(playlistId, result)
		Return result
	End If
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(playlistsDir, metadataFileName))
		Dim playlistData As Map = parser.NextObject
		Dim tracks As List = playlistData.GetDefault("tracks", Null)
		If tracks.IsInitialized Then
			For Each trackObject As Object In tracks
				If (trackObject Is Map) = False Then Continue
				Dim track As Map = trackObject
				Dim trackId As String = track.GetDefault("id", "")
				If trackId = "" Then Continue
				result.Put(BuildTrackCacheRelativeFileName(trackId, playlistId), trackId)
			Next
		End If
	Catch
		Trace("Не удалось восстановить track map по playlist metadata. playlistId=" & playlistId & ", message=" & LastException.Message)
	End Try
	playlistTrackMaps.Put(playlistId, result)
	Return result
End Sub

Private Sub BuildTrackCacheSummary(protectedIds As Map, relevantIds As Map) As Map
	Dim result As Map
	result.Initialize
	Dim candidates As List
	candidates.Initialize
	Dim keysToRemove As List
	keysToRemove.Initialize
	Dim cacheBytes As Long = 0
	For Each trackId As String In cachedTrackIndex.Keys
		Dim fileName As String = ResolveTrackCacheFileName(trackId, cachedTrackIndex)
		If IsCachedFileUsable(GetTracksDir, fileName) = False Then
			keysToRemove.Add(trackId)
			Continue
		End If
		Dim fileBytes As Long = GetFileSizeSafe(GetTracksDir, fileName)
		cacheBytes = cacheBytes + fileBytes
		Dim entry As Map = cachedTrackIndex.GetDefault(trackId, Null)
		If entry.IsInitialized = False Then entry.Initialize
		entry.Put("file_name", fileName)
		entry.Put("size_bytes", fileBytes)
		cachedTrackIndex.Put(trackId, entry)
		If protectedIds.ContainsKey(trackId) Then Continue
		Dim candidate As Map
		candidate.Initialize
		candidate.Put("id", trackId)
		candidate.Put("file_name", fileName)
		candidate.Put("size_bytes", fileBytes)
		candidate.Put("last_used_at", entry.GetDefault("last_used_at", 0))
		candidate.Put("saved_at", entry.GetDefault("saved_at", 0))
		candidate.Put("is_relevant", relevantIds.ContainsKey(trackId))
		candidates.Add(candidate)
	Next
	For Each trackId As String In keysToRemove
		cachedTrackIndex.Remove(trackId)
	Next
	If keysToRemove.Size > 0 Then SaveTrackIndex
	result.Put("cache_bytes", cacheBytes)
	result.Put("candidates", candidates)
	Return result
End Sub

Private Sub ResolveTrackPlaylistId(item As Map, trackIndex As Map, trackId As String) As String
	If item.IsInitialized Then
		Dim playlistId As String = item.GetDefault("playlist_id", "")
		If playlistId <> "" Then Return playlistId
	End If
	Dim entry As Map = trackIndex.GetDefault(trackId, Null)
	If entry.IsInitialized Then Return entry.GetDefault("playlist_id", "")
	Return ""
End Sub

Private Sub ExtractPlaylistIdFromTrackRelativePath(relativeFileName As String) As String
	If relativeFileName = "" Then Return ""
	Dim normalized As String = relativeFileName.Replace("\\", "/")
	Dim slashIndex As Int = normalized.IndexOf("/")
	If slashIndex <= 0 Then Return ""
	Return normalized.SubString2(0, slashIndex)
End Sub

Private Sub ListTrackCacheFilesRecursive As List
	Dim result As List
	result.Initialize
	ListTrackCacheFilesInto(GetTracksDir, "", result)
	Return result
End Sub

Private Sub ListTrackCacheFilesInto(currentDir As String, relativePrefix As String, result As List)
	Try
		If DirectoryExists(currentDir) = False Then Return
		Dim listed As List = File.ListFiles(currentDir)
		If listed.IsInitialized = False Then Return
		For Each name As String In listed
			Dim childRelative As String
			If relativePrefix = "" Then
				childRelative = name
			Else
				childRelative = File.Combine(relativePrefix, name)
			End If
			Dim childPath As String = File.Combine(currentDir, name)
			If File.IsDirectory(currentDir, name) Then
				ListTrackCacheFilesInto(childPath, childRelative, result)
			Else
				result.Add(childRelative)
			End If
		Next
	Catch
		Trace("Не удалось получить список track cache файлов. dir=" & currentDir & ", message=" & LastException.Message)
	End Try
End Sub

Private Sub CleanupEmptyTrackPlaylistDir(relativeFileName As String)
	Dim playlistId As String = ExtractPlaylistIdFromTrackRelativePath(relativeFileName)
	If playlistId = "" Then Return
	Try
		Dim playlistDir As String = File.Combine(GetTracksDir, playlistId)
		If DirectoryExists(playlistDir) = False Then Return
		Dim listed As List = File.ListFiles(playlistDir)
		If listed.IsInitialized = False Or listed.Size = 0 Then
			File.Delete(playlistDir, "")
		End If
	Catch
		Trace("Не удалось очистить пустую папку плейлиста. playlistId=" & playlistId & ", message=" & LastException.Message)
	End Try
End Sub

Private Sub SortTrackPruneCandidates(candidates As List)
	If candidates.IsInitialized = False Or candidates.Size < 2 Then Return
	For i = 0 To candidates.Size - 2
		For j = i + 1 To candidates.Size - 1
			Dim leftItem As Map = candidates.Get(i)
			Dim rightItem As Map = candidates.Get(j)
			If CompareTrackPruneCandidates(leftItem, rightItem) > 0 Then
				candidates.Set(i, rightItem)
				candidates.Set(j, leftItem)
			End If
		Next
	Next
End Sub

Private Sub CompareTrackPruneCandidates(leftItem As Map, rightItem As Map) As Int
	Dim leftRelevant As Boolean = leftItem.GetDefault("is_relevant", False)
	Dim rightRelevant As Boolean = rightItem.GetDefault("is_relevant", False)
	If leftRelevant <> rightRelevant Then
		If leftRelevant = False Then Return -1 Else Return 1
	End If
	Dim leftLastUsed As Long = leftItem.GetDefault("last_used_at", 0)
	Dim rightLastUsed As Long = rightItem.GetDefault("last_used_at", 0)
	If leftLastUsed <> rightLastUsed Then
		If leftLastUsed < rightLastUsed Then Return -1 Else Return 1
	End If
	Dim leftSaved As Long = leftItem.GetDefault("saved_at", 0)
	Dim rightSaved As Long = rightItem.GetDefault("saved_at", 0)
	If leftSaved <> rightSaved Then
		If leftSaved < rightSaved Then Return -1 Else Return 1
	End If
	Return 0
End Sub

Private Sub CreateTrackIdSet(trackIds As List) As Map
	Dim result As Map
	result.Initialize
	If trackIds.IsInitialized = False Then Return result
	For Each trackId As String In trackIds
		If trackId <> "" Then result.Put(trackId, True)
	Next
	Return result
End Sub

Private Sub GetFileSizeSafe(dir As String, fileName As String) As Long
	Try
		Dim fileDir As String = ResolveRelativeParentDir(dir, fileName)
		Dim leafName As String = ResolveRelativeLeafName(fileName)
		Return File.Size(fileDir, leafName)
	Catch
		Return 0
	End Try
End Sub

Private Sub ResolveRelativeParentDir(baseDir As String, relativeFileName As String) As String
	Dim normalizedName As String = relativeFileName.Replace("\\", "/")
	Dim slashIndex As Int = normalizedName.LastIndexOf("/")
	If slashIndex < 0 Then Return baseDir
	Dim parentRelative As String = normalizedName.SubString2(0, slashIndex)
	If parentRelative = "" Then Return baseDir
	Return File.Combine(baseDir, parentRelative)
End Sub

Private Sub ResolveRelativeLeafName(relativeFileName As String) As String
	Dim normalizedName As String = relativeFileName.Replace("\\", "/")
	Dim slashIndex As Int = normalizedName.LastIndexOf("/")
	If slashIndex < 0 Then Return normalizedName
	Return normalizedName.SubString(slashIndex + 1)
End Sub

Private Sub ResolveRelativeFileUri(baseDir As String, relativeFileName As String) As String
	Return File.GetUri(ResolveRelativeParentDir(baseDir, relativeFileName), ResolveRelativeLeafName(relativeFileName))
End Sub

Private Sub ToLongDefault(value As Object, defaultValue As Long) As Long
	Try
		If value = Null Then Return defaultValue
		Return value
	Catch
		Return defaultValue
	End Try
End Sub

Private Sub LoadCacheStatsSnapshot
	cachedTrackCount = storage.GetDefault("cache_stats_track_count", 0)
	cachedAdCount = storage.GetDefault("cache_stats_ad_count", 0)
	cachedTrackBytes = ToLongDefault(storage.GetDefault("cache_stats_track_bytes", 0), 0)
	cachedAdBytes = ToLongDefault(storage.GetDefault("cache_stats_ad_bytes", 0), 0)
	cachedTrackPlaylistStats = storage.GetDefault("cache_stats_track_playlist", Null)
	If cachedTrackPlaylistStats.IsInitialized = False Then cachedTrackPlaylistStats.Initialize
End Sub

Private Sub SaveCacheStatsSnapshot
	storage.Put("cache_stats_track_count", cachedTrackCount)
	storage.Put("cache_stats_ad_count", cachedAdCount)
	storage.Put("cache_stats_track_bytes", cachedTrackBytes)
	storage.Put("cache_stats_ad_bytes", cachedAdBytes)
	storage.Put("cache_stats_track_playlist", cachedTrackPlaylistStats)
End Sub

Private Sub RebuildCacheStatsFromIndexes
	cachedTrackCount = 0
	cachedAdCount = 0
	cachedTrackBytes = 0
	cachedAdBytes = 0
	cachedTrackPlaylistStats.Initialize
	If cachedTrackIndex.IsInitialized Then
		For Each trackId As String In cachedTrackIndex.Keys
			Dim trackEntry As Map = cachedTrackIndex.Get(trackId)
			If trackEntry.IsInitialized = False Then Continue
			cachedTrackCount = cachedTrackCount + 1
			Dim trackBytes As Long = ToLongDefault(trackEntry.GetDefault("size_bytes", 0), 0)
			cachedTrackBytes = cachedTrackBytes + trackBytes
			AccumulateTrackPlaylistStat(trackEntry.GetDefault("playlist_id", ""), trackBytes)
		Next
	End If
	If cachedAdIndex.IsInitialized Then
		For Each adId As String In cachedAdIndex.Keys
			Dim adEntry As Map = cachedAdIndex.Get(adId)
			If adEntry.IsInitialized = False Then Continue
			cachedAdCount = cachedAdCount + 1
			cachedAdBytes = cachedAdBytes + ToLongDefault(adEntry.GetDefault("size_bytes", 0), 0)
		Next
	End If
End Sub

Private Sub AccumulateTrackPlaylistStat(playlistId As String, trackBytes As Long)
	Dim statsKey As String = playlistId
	If statsKey = "" Then statsKey = "_unknown"
	Dim playlistEntry As Map = cachedTrackPlaylistStats.GetDefault(statsKey, Null)
	If playlistEntry.IsInitialized = False Then
		playlistEntry.Initialize
		playlistEntry.Put("count", 0)
		playlistEntry.Put("bytes", 0)
	End If
	playlistEntry.Put("count", playlistEntry.GetDefault("count", 0) + 1)
	playlistEntry.Put("bytes", ToLongDefault(playlistEntry.GetDefault("bytes", 0), 0) + trackBytes)
	cachedTrackPlaylistStats.Put(statsKey, playlistEntry)
End Sub

Private Sub ResolveMinFreeDiskBytes(totalBytes As Long) As Long
	Dim percentBytes As Long = 0
	If totalBytes > 0 Then percentBytes = Floor(totalBytes * MIN_FREE_DISK_PERCENT / 100)
	Return Max(MbToBytes(MIN_FREE_DISK_MB), percentBytes)
End Sub

Private Sub GetDriveUsableSpace(path As String) As Long
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(path))
		Return fileObject.RunMethod("getUsableSpace", Null)
	Catch
		Return 0
	End Try
End Sub

Private Sub GetDriveTotalSpace(path As String) As Long
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(path))
		Return fileObject.RunMethod("getTotalSpace", Null)
	Catch
		Return 0
	End Try
End Sub

Private Sub MbToBytes(valueMb As Long) As Long
	Return valueMb * 1024 * 1024
End Sub

Private Sub BytesToMb(valueBytes As Long) As Long
	Return Floor(valueBytes / 1024 / 1024)
End Sub

Private Sub CreateInitializedList As List
	Dim items As List
	items.Initialize
	Return items
End Sub

Private Sub Trace(message As String)
	If SubExists(targetModule, traceSubName) Then
		CallSub2(targetModule, traceSubName, message)
	End If
End Sub
