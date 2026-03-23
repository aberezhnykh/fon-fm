B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private storageDir As String
	Private storage As KeyValueStore
	Private targetModule As Object
	Private traceSubName As String
	Private deviceKeySeed As String
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
End Sub

Public Sub Initialize(storageDirValue As String, storageValue As KeyValueStore, targetModuleValue As Object, traceSubNameValue As String, deviceIdValue As String)
	storageDir = storageDirValue
	storage = storageValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	deviceKeySeed = deviceIdValue
	playbackTempTrackIds.Initialize
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
	cacheAuditInProgress = True
End Sub

Public Sub RunCacheAuditStep As Boolean
	If cacheAuditInProgress = False Then Return False
	If cacheAuditCurrentType = "" Then
		If PrepareNextCacheAuditType = False Then
			FinishCacheAudit
			Return False
		End If
	End If
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

Public Sub ResolveLocalMediaUri(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim itemType As String = item.GetDefault("type", "")
	Dim itemId As String = item.GetDefault("id", "")
	If itemId = "" Then Return ""
	If HasValidatedLocalMedia(item) = False Then Return ""
	If itemType = "ad" Then Return File.GetUri(GetAdsDir, itemId)
	If itemType = "track" Then Return File.GetUri(GetTracksDir, ResolveTrackCacheFileName(itemId, cachedTrackIndex))
	Return ""
End Sub

Public Sub ResolvePlaybackMediaUri(audioKey As String, item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then Return ResolveLocalMediaUri(item)
	If itemType <> "track" Then Return ""
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return ""
	If HasValidatedLocalMedia(item) = False Then Return ""
	If EnsureTrackPlaybackTemp(audioKey, trackId) = False Then Return ""
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
	If itemType = "track" Then Return ValidateIndexedFile("track", itemId)
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
	Return ValidateIndexedFile("track", trackId)
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
	Dim candidates As List = summary.GetDefault("candidates", CreateInitializedList)
	SortTrackPruneCandidates(candidates)
	Dim removedCount As Int = 0
	For Each candidateObject As Object In candidates
		If cacheBytes <= targetBytes And (freeBytes <= 0 Or freeBytes >= minFreeBytes) Then Exit
		If candidateObject Is Map Then
			Dim candidate As Map = candidateObject
			Dim trackId As String = candidate.GetDefault("id", "")
			Dim fileName As String = candidate.GetDefault("file_name", "")
			Dim fileBytes As Long = candidate.GetDefault("size_bytes", 0)
			If trackId = "" Or fileName = "" Then Continue
			DeleteFileIfExists(GetTracksDir, fileName)
			cachedTrackIndex.Remove(trackId)
			cacheBytes = Max(0, cacheBytes - fileBytes)
			freeBytes = GetDriveUsableSpace(storageDir)
			removedCount = removedCount + 1
			Trace("Удален cached track при очистке кэша. id=" & trackId & ", sizeMb=" & BytesToMb(fileBytes))
		End If
	Next
	If removedCount > 0 Then
		SaveTrackIndex
		Trace("Очистка кэша треков завершена. removed=" & removedCount & ", cacheMb=" & BytesToMb(cacheBytes) & ", freeMb=" & BytesToMb(freeBytes))
	Else
		Trace("Очистка кэша треков пропущена: нет подходящих кандидатов. cacheMb=" & BytesToMb(cacheBytes) & ", freeMb=" & BytesToMb(freeBytes))
	End If
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
				EnsureDirectory(GetTracksDir)
				Dim tempFileName As String = BuildTempCacheFileName(trackId)
				DeleteFileIfExists(GetTracksDir, tempFileName)
				Dim outStream As OutputStream = File.OpenOutput(GetTracksDir, tempFileName, False)
				TransformStreamWithXor(j.GetInputStream, outStream, BuildTrackObfuscationKey(trackId))
				outStream.Close
				If IsCachedFileUsable(GetTracksDir, tempFileName) = False Then
					DeleteFileIfExists(GetTracksDir, tempFileName)
					Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=empty temp file")
					j.Release
					Return False
				End If
			If ReplaceCacheFile(GetTracksDir, tempFileName, BuildTrackCacheFileName(trackId)) = False Then
				DeleteFileIfExists(GetTracksDir, tempFileName)
				Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=rename failed")
				j.Release
				Return False
			End If
			UpdateTrackIndex(item, trackIndex)
			SaveTrackIndex
			recentMediaNetworkFailure = False
			Trace("Трек сохранен в кэш. id=" & trackId & ", totalElapsedMs=" & ElapsedMs(downloadStartedAt))
			j.Release
			Return True
		Catch
			DeleteFileIfExists(GetTracksDir, BuildTempCacheFileName(trackId))
			Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=" & LastException.Message)
		End Try
	Else
		If IsMediaNetworkFailure(j.ErrorMessage) Then recentMediaNetworkFailure = True
		Trace("Не удалось скачать трек. id=" & trackId & ", message=" & j.ErrorMessage)
	End If
	j.Release
	Return False
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
	Dim fileName As String = BuildTrackCacheFileName(trackId)
	entry.Put("id", trackId)
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
End Sub

Private Sub SaveAdIndex
	storage.Put("cached_ad_index", cachedAdIndex)
	storage.Put("cached_ad_count", cachedAdIndex.Size)
	cachedAdIndexDirty = False
End Sub

Private Sub SaveTrackIndex
	storage.Put("cached_track_index", cachedTrackIndex)
	storage.Put("cached_track_count", cachedTrackIndex.Size)
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
	Dim sourceBytes() As Byte = GetBytesFromString("fonfm-track|" & deviceKeySeed & "|" & trackId)
	Dim jo As JavaObject
	jo.InitializeStatic("java.util.UUID")
	Dim uuid As JavaObject = jo.RunMethod("nameUUIDFromBytes", Array As Object(sourceBytes))
	Dim fileName As String = uuid.RunMethod("toString", Null)
	Return fileName.Replace("-", "")
End Sub

Private Sub IsCachedFileUsable(dir As String, fileName As String) As Boolean
	If fileName = "" Then Return False
	If File.Exists(dir, fileName) = False Then Return False
	Try
		If File.Size(dir, fileName) > 0 Then Return True
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

Private Sub EnsureTrackPlaybackTemp(audioKey As String, trackId As String) As Boolean
	Dim tempFileName As String = BuildPlaybackTempTrackFileName(audioKey)
	If playbackTempTrackIds.GetDefault(audioKey, "") = trackId And IsCachedFileUsable(File.DirTemp, tempFileName) Then Return True
	DeleteFileIfExists(File.DirTemp, tempFileName)
	Try
		Dim inputStream As InputStream = File.OpenInput(GetTracksDir, ResolveTrackCacheFileName(trackId, cachedTrackIndex))
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

Private Sub BuildTrackObfuscationKey(trackId As String) As Byte()
	Return GetBytesFromString("fonfm-track-key|" & deviceKeySeed & "|" & trackId)
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
		If File.Exists(dir, fileName) Then File.Delete(dir, fileName)
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
	If auditIndex.ContainsKey(itemId) = False Then
		If IsCachedFileUsable(auditDir, fileName) = False Then Return False
		RestoreIndexedFileById(itemId, auditIndex)
		SaveIndexByItemType(itemType)
		Return True
	End If
	If IsCachedFileUsable(auditDir, fileName) Then Return True
	auditIndex.Remove(itemId)
	SaveIndexByItemType(itemType)
	Return False
End Sub

Private Sub RestoreIndexedFileById(itemId As String, itemIndex As Map)
	Dim entry As Map = itemIndex.GetDefault(itemId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	entry.Put("id", itemId)
	entry.Put("file_name", BuildTrackCacheFileName(itemId))
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
	Return BuildTrackCacheFileName(trackId)
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

Private Sub PrepareNextCacheAuditType As Boolean
	If cacheAuditPendingTypes.IsInitialized = False Or cacheAuditPendingTypes.Size = 0 Then Return False
	cacheAuditCurrentType = cacheAuditPendingTypes.Get(0)
	cacheAuditPendingTypes.RemoveAt(0)
	cacheAuditCurrentPosition = 0
	cacheAuditSeenIds.Initialize
	cacheAuditCurrentFileNames.Initialize
	Dim auditDir As String = GetAuditDirByType(cacheAuditCurrentType)
	Try
		If File.Exists(auditDir, "") Then
			Dim listedFiles As List = File.ListFiles(auditDir)
			If listedFiles.IsInitialized Then
				For Each fileName As String In listedFiles
					cacheAuditCurrentFileNames.Add(fileName)
				Next
			End If
		End If
	Catch
		Trace("Не удалось получить список файлов для аудита кэша. type=" & cacheAuditCurrentType & ", message=" & LastException.Message)
	End Try
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
				DeleteFileIfExists(auditDir, fileName)
				cacheAuditRemovedCount = cacheAuditRemovedCount + 1
				MarkAuditIndexChanged(cacheAuditCurrentType)
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
	entry.Put("id", fileName)
	entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	If itemType = "ads" Then
		entry.Put("title", "")
		entry.Put("duration", 0)
		entry.Put("gain", 0)
	Else
		entry.Put("title", "")
		entry.Put("set", "")
		entry.Put("stream", "")
		entry.Put("gain", 0)
		entry.Put("file_name", fileName)
		entry.Put("size_bytes", GetFileSizeSafe(GetTracksDir, fileName))
	End If
	auditIndex.Put(fileName, entry)
	MarkAuditIndexChanged(itemType)
End Sub

Private Sub ResolveIndexedAuditFileName(auditType As String, itemId As String, auditIndex As Map) As String
	If auditType = "ads" Then Return itemId
	Return ResolveTrackCacheFileName(itemId, auditIndex)
End Sub

Private Sub FindTrackIdByFileName(fileName As String, trackIndex As Map) As String
	For Each key As String In trackIndex.Keys
		If ResolveTrackCacheFileName(key, trackIndex) = fileName Then Return key
	Next
	Return ""
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
		Return File.Size(dir, fileName)
	Catch
		Return 0
	End Try
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
