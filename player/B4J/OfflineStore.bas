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
	Private playerDataFileName As String
	Private playlistRequirementsFileName As String
	Private playlistsDirName As String
	Private playlistCdnBaseUrl As String
End Sub

Public Sub Initialize(storageDirValue As String, storageValue As KeyValueStore, targetModuleValue As Object, traceSubNameValue As String, playerDataFileNameValue As String, playlistRequirementsFileNameValue As String, playlistsDirNameValue As String, playlistCdnBaseUrlValue As String)
	storageDir = storageDirValue
	storage = storageValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	playerDataFileName = playerDataFileNameValue
	playlistRequirementsFileName = playlistRequirementsFileNameValue
	playlistsDirName = playlistsDirNameValue
	playlistCdnBaseUrl = playlistCdnBaseUrlValue
End Sub

Public Sub LoadOfflineData As Map
	Dim data As Map
	data.Initialize
	If File.Exists(storageDir, playerDataFileName) = False Then Return data
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(storageDir, playerDataFileName))
		Dim parsed As Map = parser.NextObject
		If parsed.IsInitialized Then
			data = parsed
		Trace("Данные плеера загружены. playlists=" & GetOfflinePlaylistIds(data).Size & ", ads=" & GetOfflineAdsCount(data) & ", schedules=" & GetOfflineSchedulesCount(data))
		End If
	Catch
		data.Initialize
		Trace("Не удалось загрузить player_data.json. " & LastException.Message)
	End Try
	Return data
End Sub

Public Sub SaveOfflineData(sourceData As Map, playerCode As String, deviceId As String) As Map
	Dim normalizedData As Map = NormalizeOfflineData(sourceData, playerCode, deviceId)
	Dim offlineDataUpdatedAt As Long = DateTime.Now
	storage.Put("player_data_updated_at", offlineDataUpdatedAt)
	storage.Put("player_data_source_updated", normalizedData.GetDefault("updated", ""))
	Dim playlistIds As List = GetOfflinePlaylistIds(normalizedData)
	Dim playlistDescriptors As List = BuildOfflinePlaylistDescriptors(normalizedData)
	Dim playlistCacheStatus As Map = CompareOfflinePlaylistsWithCache(playlistDescriptors)
	storage.Put("playlist_ids", playlistIds)
	storage.Put("playlist_descriptors", playlistDescriptors)
	storage.Put("playlist_download_ids", playlistCacheStatus.GetDefault("DownloadIds", CreateInitializedList))
	storage.Put("playlist_missing_count", playlistCacheStatus.GetDefault("MissingCount", 0))
	storage.Put("playlist_outdated_count", playlistCacheStatus.GetDefault("OutdatedCount", 0))
	storage.Put("playlist_actual_count", playlistCacheStatus.GetDefault("ActualCount", 0))
	storage.Put("ad_count", GetOfflineAdsCount(normalizedData))
	storage.Put("schedule_count", GetOfflineSchedulesCount(normalizedData))
	Dim generator As JSONGenerator
	generator.Initialize(normalizedData)
	File.WriteString(storageDir, playerDataFileName, generator.ToString)
	WriteOfflinePlaylistRequirementsFile(playlistDescriptors, playerCode)
	Trace("Данные плеера сохранены. playlists=" & playlistIds.Size & ", ads=" & GetOfflineAdsCount(normalizedData) & ", schedules=" & GetOfflineSchedulesCount(normalizedData) & ", missingPlaylists=" & playlistCacheStatus.GetDefault("MissingCount", 0) & ", outdatedPlaylists=" & playlistCacheStatus.GetDefault("OutdatedCount", 0))
	Return normalizedData
End Sub

Public Sub GetStoredPlaylistDescriptors As List
	Return storage.GetDefault("playlist_descriptors", CreateInitializedList)
End Sub

Public Sub GetCachedPlaylistIndex As Map
	Return storage.GetDefault("cached_playlist_index", CreateInitializedMap)
End Sub

Public Sub SaveCachedPlaylistIndex(cachedPlaylistIndex As Map)
	storage.Put("cached_playlist_index", cachedPlaylistIndex)
End Sub

Public Sub RefreshPlaylistCacheStatus(playlistDescriptors As List)
	Dim refreshedCacheStatus As Map = CompareOfflinePlaylistsWithCache(playlistDescriptors)
	storage.Put("playlist_download_ids", refreshedCacheStatus.GetDefault("DownloadIds", CreateInitializedList))
	storage.Put("playlist_missing_count", refreshedCacheStatus.GetDefault("MissingCount", 0))
	storage.Put("playlist_outdated_count", refreshedCacheStatus.GetDefault("OutdatedCount", 0))
	storage.Put("playlist_actual_count", refreshedCacheStatus.GetDefault("ActualCount", 0))
End Sub

Public Sub ResolvePlaylistSyncAction(descriptor As Map, cachedPlaylistIndex As Map) As String
	Dim playlistId As String = descriptor.GetDefault("id", "")
	If playlistId = "" Then Return "skip"
	If cachedPlaylistIndex.ContainsKey(playlistId) = False Then Return "missing"
	Dim cachedEntryObject As Object = cachedPlaylistIndex.Get(playlistId)
	If cachedEntryObject Is Map Then
		Dim cachedEntry As Map = cachedEntryObject
		If cachedEntry.GetDefault("updated", "") <> descriptor.GetDefault("updated", "") Then Return "outdated"
		If File.Exists(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId)) = False Then Return "missing"
		Return "skip"
	End If
	Return "missing"
End Sub

Public Sub SavePlaylistMetadata(descriptor As Map, playlistData As Map, cachedPlaylistIndex As Map)
	EnsureDirectory(GetOfflinePlaylistsDir)
	Dim playlistId As String = descriptor.GetDefault("id", "")
	Dim normalizedPlaylistData As Map = NormalizeOfflinePlaylistData(descriptor, playlistData)
	Dim generator As JSONGenerator
	generator.Initialize(normalizedPlaylistData)
	File.WriteString(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId), generator.ToString)
	Dim cachedEntry As Map
	cachedEntry.Initialize
	cachedEntry.Put("id", playlistId)
	cachedEntry.Put("updated", descriptor.GetDefault("updated", ""))
	cachedEntry.Put("saved_at", DateTime.Now)
	cachedEntry.Put("title", descriptor.GetDefault("title", ""))
	cachedEntry.Put("track_count", GetPlaylistTrackCount(normalizedPlaylistData))
	cachedPlaylistIndex.Put(playlistId, cachedEntry)
	Trace("Playlist metadata сохранен. id=" & playlistId & ", tracks=" & cachedEntry.GetDefault("track_count", 0) & ", updated=" & cachedEntry.GetDefault("updated", ""))
End Sub

Public Sub GetOfflinePlaylistsDir As String
	Return File.Combine(storageDir, playlistsDirName)
End Sub

Public Sub PlaylistMetadataFileName(playlistId As String) As String
	Return playlistId & ".json"
End Sub

Public Sub PlaylistMetadataUrl(playlistId As String) As String
	Return playlistCdnBaseUrl & playlistId & ".json"
End Sub

Private Sub NormalizeOfflineData(sourceData As Map, playerCode As String, deviceId As String) As Map
	Dim normalizedData As Map
	normalizedData.Initialize
	normalizedData.Put("ok", sourceData.GetDefault("ok", False))
	normalizedData.Put("type", sourceData.GetDefault("type", ""))
	normalizedData.Put("updated", sourceData.GetDefault("updated", ""))
	normalizedData.Put("saved_at", DateTime.Now)
	normalizedData.Put("player_code", playerCode)
	normalizedData.Put("device_id", deviceId)
	If sourceData.ContainsKey("player") Then normalizedData.Put("player", sourceData.Get("player"))
	If sourceData.ContainsKey("ads") Then normalizedData.Put("ads", sourceData.Get("ads"))
	If sourceData.ContainsKey("schedules") Then normalizedData.Put("schedules", sourceData.Get("schedules"))
	Return normalizedData
End Sub

Private Sub GetOfflinePlaylistIds(data As Map) As List
	Dim playlistIds As List
	playlistIds.Initialize
	If data.IsInitialized = False Then Return playlistIds
	Dim uniqueIds As Map
	uniqueIds.Initialize
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return playlistIds
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					Dim streamData As Map = ExtractSlotStreamData(slot)
					Dim playlists As List = streamData.GetDefault("playlists", Null)
					If playlists.IsInitialized = False Then Continue
					For Each playlistObject As Object In playlists
						If playlistObject Is Map Then
							Dim playlist As Map = playlistObject
							Dim playlistId As String = playlist.GetDefault("id", "")
							If playlistId <> "" And uniqueIds.ContainsKey(playlistId) = False Then
								uniqueIds.Put(playlistId, True)
								playlistIds.Add(playlistId)
							End If
						End If
					Next
				End If
			Next
		End If
	Next
	Return playlistIds
End Sub

Private Sub GetOfflineAdsCount(data As Map) As Int
	If data.IsInitialized = False Then Return 0
	Dim ads As List = data.GetDefault("ads", Null)
	If ads.IsInitialized = False Then Return 0
	Return ads.Size
End Sub

Private Sub GetOfflineSchedulesCount(data As Map) As Int
	If data.IsInitialized = False Then Return 0
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return 0
	Return schedules.Size
End Sub

Private Sub BuildOfflinePlaylistDescriptors(data As Map) As List
	Dim descriptors As List
	descriptors.Initialize
	If data.IsInitialized = False Then Return descriptors
	Dim uniqueDescriptors As Map
	uniqueDescriptors.Initialize
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return descriptors
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			Dim scheduleTitle As String = schedule.GetDefault("title", "")
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					Dim slotTime As String = slot.GetDefault("time", "")
					Dim streamData As Map = ExtractSlotStreamData(slot)
					Dim streamId As String = streamData.GetDefault("id", "")
					Dim streamTitle As String = streamData.GetDefault("title", "")
					Dim playlists As List = streamData.GetDefault("playlists", Null)
					If playlists.IsInitialized = False Then Continue
					For Each playlistObject As Object In playlists
						If playlistObject Is Map Then
							Dim playlist As Map = playlistObject
							Dim playlistId As String = playlist.GetDefault("id", "")
							If playlistId = "" Then Continue
							If uniqueDescriptors.ContainsKey(playlistId) Then Continue
							Dim descriptor As Map
							descriptor.Initialize
							descriptor.Put("id", playlistId)
							descriptor.Put("updated", playlist.GetDefault("updated", ""))
							descriptor.Put("title", playlist.GetDefault("title", ""))
							descriptor.Put("schedule_title", scheduleTitle)
							descriptor.Put("slot_time", slotTime)
							descriptor.Put("stream_id", streamId)
							descriptor.Put("stream_title", streamTitle)
							uniqueDescriptors.Put(playlistId, descriptor)
							descriptors.Add(descriptor)
						End If
					Next
				End If
			Next
		End If
	Next
	Return descriptors
End Sub

Private Sub CompareOfflinePlaylistsWithCache(descriptors As List) As Map
	Dim result As Map
	result.Initialize
	Dim downloadIds As List
	downloadIds.Initialize
	Dim cachedPlaylistIndex As Map = storage.GetDefault("cached_playlist_index", CreateInitializedMap)
	Dim missingCount As Int = 0
	Dim outdatedCount As Int = 0
	Dim actualCount As Int = 0
	For Each descriptorObject As Object In descriptors
		If descriptorObject Is Map Then
			Dim descriptor As Map = descriptorObject
			Dim playlistId As String = descriptor.GetDefault("id", "")
			If playlistId = "" Then Continue
			If cachedPlaylistIndex.ContainsKey(playlistId) = False Then
				missingCount = missingCount + 1
				downloadIds.Add(playlistId)
				Continue
			End If
			Dim cachedEntryObject As Object = cachedPlaylistIndex.Get(playlistId)
			If cachedEntryObject Is Map Then
				Dim cachedEntry As Map = cachedEntryObject
				If cachedEntry.GetDefault("updated", "") <> descriptor.GetDefault("updated", "") Then
					outdatedCount = outdatedCount + 1
					downloadIds.Add(playlistId)
				Else
					actualCount = actualCount + 1
				End If
			Else
				missingCount = missingCount + 1
				downloadIds.Add(playlistId)
			End If
		End If
	Next
	result.Put("DownloadIds", downloadIds)
	result.Put("MissingCount", missingCount)
	result.Put("OutdatedCount", outdatedCount)
	result.Put("ActualCount", actualCount)
	Return result
End Sub

Private Sub WriteOfflinePlaylistRequirementsFile(descriptors As List, playerCode As String)
	Dim payload As Map
	payload.Initialize
	payload.Put("saved_at", DateTime.Now)
	payload.Put("player_code", playerCode)
	payload.Put("descriptors", descriptors)
	Dim generator As JSONGenerator
	generator.Initialize(payload)
	File.WriteString(storageDir, playlistRequirementsFileName, generator.ToString)
End Sub

Private Sub NormalizeOfflinePlaylistData(descriptor As Map, playlistData As Map) As Map
	Dim normalizedPlaylistData As Map
	normalizedPlaylistData.Initialize
	For Each key As String In playlistData.Keys
		normalizedPlaylistData.Put(key, playlistData.Get(key))
	Next
	normalizedPlaylistData.Put("id", descriptor.GetDefault("id", ""))
	normalizedPlaylistData.Put("required_updated", descriptor.GetDefault("updated", ""))
	normalizedPlaylistData.Put("saved_at", DateTime.Now)
	Return normalizedPlaylistData
End Sub

Private Sub GetPlaylistTrackCount(playlistData As Map) As Int
	If playlistData.IsInitialized = False Then Return 0
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Then Return 0
	Return tracks.Size
End Sub

Private Sub ExtractSlotStreamData(slot As Map) As Map
	Dim streamData As Map
	streamData.Initialize
	If slot.IsInitialized = False Then Return streamData
	Dim streamObject As Object = slot.Get("stream")
	If streamObject Is Map Then
		streamData = streamObject
		Return streamData
	End If
	If streamObject <> Null Then streamData.Put("id", "" & streamObject)
	If slot.ContainsKey("playlists") Then streamData.Put("playlists", slot.Get("playlists"))
	Return streamData
End Sub

Private Sub EnsureDirectory(path As String)
	Dim joFile As JavaObject
	joFile.InitializeNewInstance("java.io.File", Array As Object(path))
	joFile.RunMethod("mkdirs", Null)
End Sub

Private Sub CreateInitializedMap As Map
	Dim m As Map
	m.Initialize
	Return m
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
