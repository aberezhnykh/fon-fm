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
	Private mediaDirName As String = "media"
	Private adsDirName As String = "ads"
	Private tracksDirName As String = "tracks"
	Private Const CACHE_AUDIT_BATCH_SIZE As Int = 8
	Private cachedAdIndex As Map
	Private cachedTrackIndex As Map
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

Public Sub Initialize(storageDirValue As String, storageValue As KeyValueStore, targetModuleValue As Object, traceSubNameValue As String)
	storageDir = storageDirValue
	storage = storageValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
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
	Trace("Запущен аудит кэша media.")
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
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	Dim ads As List = offlineData.GetDefault("ads", Null)
	If ads.IsInitialized = False Or ads.Size = 0 Then Return False
	Dim cachedAdIndex As Map = GetCachedAdIndex
	Dim downloadedCount As Int = 0
	Dim failedCount As Int = 0
	For Each adObject As Object In ads
		If adObject Is Map Then
			Dim ad As Map = adObject
			Wait For (EnsureSingleAdCached(ad, cachedAdIndex)) Complete (downloaded As Boolean)
			If downloaded Then
				downloadedCount = downloadedCount + 1
			Else If IsAdCached(ad.GetDefault("id", "")) = False Then
				failedCount = failedCount + 1
			End If
		End If
	Next
	SaveAdIndex
	Trace("Синхронизация кэша рекламы завершена. downloaded=" & downloadedCount & ", failed=" & failedCount & ", actual=" & cachedAdIndex.Size)
	Return downloadedCount > 0
End Sub

Public Sub ResolveLocalMediaUri(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim itemType As String = item.GetDefault("type", "")
	Dim itemId As String = item.GetDefault("id", "")
	If itemId = "" Then Return ""
	If HasValidatedLocalMedia(item) = False Then Return ""
	If itemType = "ad" Then Return File.GetUri(GetAdsDir, itemId)
	If itemType = "track" Then Return File.GetUri(GetTracksDir, itemId)
	Return ""
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
	Dim j As HttpJob
	j.Initialize("", Me)
	Trace("Скачивание рекламы в кэш. id=" & adId & ", url=" & adUrl)
	j.Download(adUrl)
	j.GetRequest.Timeout = 15000
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
			Trace("Реклама сохранена в кэш. id=" & adId)
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
	Dim j As HttpJob
	j.Initialize("", Me)
	Trace("Скачивание трека в кэш. id=" & trackId & ", url=" & trackUrl)
	j.Download(trackUrl)
	j.GetRequest.Timeout = 20000
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Try
			EnsureDirectory(GetTracksDir)
			Dim tempFileName As String = BuildTempCacheFileName(trackId)
			DeleteFileIfExists(GetTracksDir, tempFileName)
			Dim outStream As OutputStream = File.OpenOutput(GetTracksDir, tempFileName, False)
			File.Copy2(j.GetInputStream, outStream)
			outStream.Close
			If IsCachedFileUsable(GetTracksDir, tempFileName) = False Then
				DeleteFileIfExists(GetTracksDir, tempFileName)
				Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=empty temp file")
				j.Release
				Return False
			End If
			If ReplaceCacheFile(GetTracksDir, tempFileName, trackId) = False Then
				DeleteFileIfExists(GetTracksDir, tempFileName)
				Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=rename failed")
				j.Release
				Return False
			End If
			UpdateTrackIndex(item, trackIndex)
			SaveTrackIndex
			recentMediaNetworkFailure = False
			Trace("Трек сохранен в кэш. id=" & trackId)
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
End Sub

Private Sub UpdateTrackIndex(item As Map, trackIndex As Map)
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return
	Dim entry As Map = trackIndex.GetDefault(trackId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	entry.Put("id", trackId)
	entry.Put("title", item.GetDefault("title", ""))
	entry.Put("set", item.GetDefault("set", ""))
	entry.Put("stream", item.GetDefault("stream", ""))
	If entry.ContainsKey("saved_at") = False Then entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	entry.Put("gain", item.GetDefault("gain", 0))
	trackIndex.Put(trackId, entry)
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
End Sub

Private Sub SaveTrackIndex
	storage.Put("cached_track_index", cachedTrackIndex)
	storage.Put("cached_track_count", cachedTrackIndex.Size)
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

Private Sub IsCachedFileUsable(dir As String, fileName As String) As Boolean
	If fileName = "" Then Return False
	If File.Exists(dir, fileName) = False Then Return False
	Try
		If File.Size(dir, fileName) > 0 Then Return True
	Catch
		Log(LastException.Message)
	End Try
	DeleteFileIfExists(dir, fileName)
	Return False
End Sub

Private Sub BuildTempCacheFileName(itemId As String) As String
	Return itemId & ".tmp"
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

Private Sub DeleteFileIfExists(dir As String, fileName As String)
	If fileName = "" Then Return
	If File.Exists(dir, fileName) Then File.Delete(dir, fileName)
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
	If auditIndex.ContainsKey(itemId) = False Then
		If IsCachedFileUsable(auditDir, itemId) = False Then Return False
		RestoreIndexedFileById(itemId, auditIndex)
		SaveIndexByItemType(itemType)
		Trace("Валидный cached " & itemType & " восстановлен в индексе по точечной проверке. id=" & itemId)
		Return True
	End If
	If IsCachedFileUsable(auditDir, itemId) Then Return True
	auditIndex.Remove(itemId)
	SaveIndexByItemType(itemType)
	Return False
End Sub

Private Sub RestoreIndexedFileById(itemId As String, itemIndex As Map)
	Dim entry As Map = itemIndex.GetDefault(itemId, Null)
	If entry.IsInitialized = False Then entry.Initialize
	entry.Put("id", itemId)
	If entry.ContainsKey("saved_at") = False Then entry.Put("saved_at", DateTime.Now)
	entry.Put("last_used_at", DateTime.Now)
	itemIndex.Put(itemId, entry)
End Sub

Private Sub TryRestoreExistingCachedMedia(itemType As String, itemId As String, item As Map, itemIndex As Map) As Boolean
	If itemId = "" Then Return False
	If IsCachedFileUsable(GetDirByItemType(itemType), itemId) = False Then Return False
	If itemType = "ad" Then
		UpdateAdIndex(item, itemIndex)
		SaveAdIndex
		Trace("Валидный cached ad восстановлен в индексе без скачивания. id=" & itemId)
		Return True
	End If
	If itemType = "track" Then
		UpdateTrackIndex(item, itemIndex)
		SaveTrackIndex
		Trace("Валидный cached track восстановлен в индексе без скачивания. id=" & itemId)
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
	Trace("Аудит кэша: подготовлен каталог. type=" & cacheAuditCurrentType & ", files=" & cacheAuditCurrentFileNames.Size)
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
		cacheAuditSeenIds.Put(fileName, True)
		If auditIndex.ContainsKey(fileName) = False Then
			AddIndexedFileFromAudit(cacheAuditCurrentType, fileName, auditIndex)
			cacheAuditAddedCount = cacheAuditAddedCount + 1
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
			If IsCachedFileUsable(auditDir, key) Then
				cacheAuditSeenIds.Put(key, True)
				Continue
			End If
			auditIndex.Remove(key)
			cacheAuditRemovedCount = cacheAuditRemovedCount + 1
			MarkAuditIndexChanged(cacheAuditCurrentType)
		End If
	Next
	Trace("Аудит кэша: каталог обработан. type=" & cacheAuditCurrentType & ", seen=" & cacheAuditSeenIds.Size)
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
	Else
		cacheAuditTrackIndexChanged = True
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
	End If
	auditIndex.Put(fileName, entry)
	MarkAuditIndexChanged(itemType)
End Sub

Private Sub Trace(message As String)
	If SubExists(targetModule, traceSubName) Then
		CallSub2(targetModule, traceSubName, message)
	End If
End Sub
