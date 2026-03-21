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
End Sub

Public Sub Initialize(storageDirValue As String, storageValue As KeyValueStore, targetModuleValue As Object, traceSubNameValue As String)
	storageDir = storageDirValue
	storage = storageValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	EnsureDirectory(GetAdsDir)
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
	If item.GetDefault("type", "") <> "ad" Then Return ""
	Dim adId As String = item.GetDefault("id", "")
	If IsAdCached(adId) = False Then Return ""
	Return File.GetUri(GetAdsDir, adId)
End Sub

Public Sub IsAdCached(adId As String) As Boolean
	If adId = "" Then Return False
	Return File.Exists(GetAdsDir, adId)
End Sub

Public Sub GetAdsDir As String
	Return File.Combine(File.Combine(storageDir, mediaDirName), adsDirName)
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
			Dim outStream As OutputStream = File.OpenOutput(GetAdsDir, adId, False)
			File.Copy2(j.GetInputStream, outStream)
			outStream.Close
			UpdateAdIndex(ad, cachedAdIndex)
			Trace("Реклама сохранена в кэш. id=" & adId)
			j.Release
			Return True
		Catch
			Trace("Не удалось сохранить рекламу в кэш. id=" & adId & ", message=" & LastException.Message)
		End Try
	Else
		Trace("Не удалось скачать рекламу. id=" & adId & ", message=" & j.ErrorMessage)
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

Private Sub GetCachedAdIndex As Map
	Dim cachedAdIndex As Map = storage.GetDefault("cached_ad_index", Null)
	If cachedAdIndex.IsInitialized = False Then
		cachedAdIndex.Initialize
	End If
	Return cachedAdIndex
End Sub

Private Sub BuildAdUrl(adId As String) As String
	If adId = "" Then Return ""
	Dim first As String = adId.SubString2(0, 1)
	Return "https://cdn.fon.fm/media/ads/" & first & "/" & adId & ".mp3"
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
