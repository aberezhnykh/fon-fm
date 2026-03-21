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
End Sub

Public Sub Initialize(storageDirValue As String, storageValue As KeyValueStore, targetModuleValue As Object, traceSubNameValue As String)
	storageDir = storageDirValue
	storage = storageValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	EnsureDirectory(GetAdsDir)
	EnsureDirectory(GetTracksDir)
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
	storage.Put("cached_ad_index", cachedAdIndex)
	storage.Put("cached_ad_count", cachedAdIndex.Size)
	Trace("Синхронизация кэша рекламы завершена. downloaded=" & downloadedCount & ", failed=" & failedCount & ", actual=" & cachedAdIndex.Size)
	Return downloadedCount > 0
End Sub

Public Sub ResolveLocalMediaUri(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim itemType As String = item.GetDefault("type", "")
	Dim itemId As String = item.GetDefault("id", "")
	If itemId = "" Then Return ""
	If itemType = "ad" Then
		If IsAdCached(itemId) = False Then Return ""
		Return File.GetUri(GetAdsDir, itemId)
	End If
	If itemType = "track" Then
		If IsTrackCached(itemId) = False Then Return ""
		Return File.GetUri(GetTracksDir, itemId)
	End If
	Return ""
End Sub

Public Sub IsAdCached(adId As String) As Boolean
	If adId = "" Then Return False
	Return IsCachedFileUsable(GetAdsDir, adId)
End Sub

Public Sub GetAdsDir As String
	Return File.Combine(File.Combine(storageDir, mediaDirName), adsDirName)
End Sub

Public Sub GetTracksDir As String
	Return File.Combine(File.Combine(storageDir, mediaDirName), tracksDirName)
End Sub

Public Sub IsTrackCached(trackId As String) As Boolean
	If trackId = "" Then Return False
	Return IsCachedFileUsable(GetTracksDir, trackId)
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
	storage.Put("cached_track_index", cachedTrackIndex)
	storage.Put("cached_track_count", cachedTrackIndex.Size)
	Trace("Синхронизация кэша треков завершена. downloaded=" & downloadedCount & ", failed=" & failedCount & ", actual=" & cachedTrackIndex.Size)
	Return downloadedCount > 0
End Sub

Private Sub EnsureSingleAdCached(ad As Map, cachedAdIndex As Map) As ResumableSub
	Dim adId As String = ad.GetDefault("id", "")
	If adId = "" Then Return False
	If IsAdCached(adId) Then
		UpdateAdIndex(ad, cachedAdIndex)
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
			UpdateAdIndex(ad, cachedAdIndex)
			Trace("Реклама сохранена в кэш. id=" & adId)
			j.Release
			Return True
		Catch
			DeleteFileIfExists(GetAdsDir, BuildTempCacheFileName(adId))
			Trace("Не удалось сохранить рекламу в кэш. id=" & adId & ", message=" & LastException.Message)
		End Try
	Else
		Trace("Не удалось скачать рекламу. id=" & adId & ", message=" & j.ErrorMessage)
	End If
	j.Release
	Return False
End Sub

Private Sub EnsureSingleTrackCached(item As Map, cachedTrackIndex As Map) As ResumableSub
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return False
	If IsTrackCached(trackId) Then
		UpdateTrackIndex(item, cachedTrackIndex)
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
			UpdateTrackIndex(item, cachedTrackIndex)
			Trace("Трек сохранен в кэш. id=" & trackId)
			j.Release
			Return True
		Catch
			DeleteFileIfExists(GetTracksDir, BuildTempCacheFileName(trackId))
			Trace("Не удалось сохранить трек в кэш. id=" & trackId & ", message=" & LastException.Message)
		End Try
	Else
		Trace("Не удалось скачать трек. id=" & trackId & ", message=" & j.ErrorMessage)
	End If
	j.Release
	Return False
End Sub

Private Sub UpdateAdIndex(ad As Map, cachedAdIndex As Map)
	Dim adId As String = ad.GetDefault("id", "")
	If adId = "" Then Return
	Dim entry As Map
	entry.Initialize
	entry.Put("id", adId)
	entry.Put("title", ad.GetDefault("title", ""))
	entry.Put("saved_at", DateTime.Now)
	entry.Put("duration", ad.GetDefault("duration", 0))
	entry.Put("gain", ad.GetDefault("gain", 0))
	cachedAdIndex.Put(adId, entry)
End Sub

Private Sub UpdateTrackIndex(item As Map, cachedTrackIndex As Map)
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return
	Dim entry As Map
	entry.Initialize
	entry.Put("id", trackId)
	entry.Put("title", item.GetDefault("title", ""))
	entry.Put("set", item.GetDefault("set", ""))
	entry.Put("stream", item.GetDefault("stream", ""))
	entry.Put("saved_at", DateTime.Now)
	entry.Put("gain", item.GetDefault("gain", 0))
	cachedTrackIndex.Put(trackId, entry)
End Sub

Private Sub GetCachedAdIndex As Map
	Dim cachedAdIndex As Map = storage.GetDefault("cached_ad_index", Null)
	If cachedAdIndex.IsInitialized = False Then
		cachedAdIndex.Initialize
	End If
	Return cachedAdIndex
End Sub

Private Sub GetCachedTrackIndex As Map
	Dim cachedTrackIndex As Map = storage.GetDefault("cached_track_index", Null)
	If cachedTrackIndex.IsInitialized = False Then
		cachedTrackIndex.Initialize
	End If
	Return cachedTrackIndex
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
	DeleteFileIfExists(dir, finalFileName)
	Dim tempFile As JavaObject
	tempFile.InitializeNewInstance("java.io.File", Array As Object(File.Combine(dir, tempFileName)))
	Dim finalFile As JavaObject
	finalFile.InitializeNewInstance("java.io.File", Array As Object(File.Combine(dir, finalFileName)))
	Return tempFile.RunMethod("renameTo", Array As Object(finalFile))
End Sub

Private Sub DeleteFileIfExists(dir As String, fileName As String)
	If fileName = "" Then Return
	If File.Exists(dir, fileName) Then File.Delete(dir, fileName)
End Sub

Public Sub ResolveMediaSource(item As Map) As String
	If item.IsInitialized = False Then Return "none"
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then
		If IsAdCached(item.GetDefault("id", "")) Then Return "cache"
		Return "cdn"
	End If
	If itemType = "track" Then
		If IsTrackCached(item.GetDefault("id", "")) Then Return "cache"
		Return "cdn"
	End If
	Return "none"
End Sub

Private Sub EnsureDirectory(path As String)
	Dim fileObject As JavaObject
	fileObject.InitializeNewInstance("java.io.File", Array As Object(path))
	fileObject.RunMethod("mkdirs", Null)
End Sub

Private Sub Trace(message As String)
	If SubExists(targetModule, traceSubName) Then
		CallSub2(targetModule, traceSubName, message)
	End If
End Sub
