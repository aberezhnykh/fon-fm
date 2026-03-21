B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private storageDir As String
	Private targetModule As Object
	Private traceSubName As String
	Private playlistCursors As Map
	Private recentTrackIds As List
End Sub

Public Sub Initialize(storageDirValue As String, targetModuleValue As Object, traceSubNameValue As String)
	storageDir = storageDirValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	playlistCursors.Initialize
	recentTrackIds.Initialize
End Sub

Public Sub LoadState(storage As KeyValueStore)
	playlistCursors = storage.GetDefault("data_slot_playlist_cursors", CreateInitializedMap)
	If playlistCursors.IsInitialized = False Then playlistCursors.Initialize
End Sub

Public Sub CursorCount As Int
	If playlistCursors.IsInitialized = False Then Return 0
	Return playlistCursors.Size
End Sub

Public Sub ClonePlaylistCursors As Map
	Return CloneMap(playlistCursors)
End Sub

Public Sub ResolveCurrentDataSlot(offlineData As Map) As Map
	Dim slotContext As Map
	slotContext.Initialize
	If offlineData.IsInitialized = False Then Return slotContext
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return slotContext
	Dim todayKey As String = FormatIsoDate(DateTime.Now)
	Dim nowMinutes As Int = CurrentMinutesOfDay
	Dim todayWeekday As String = CurrentIsoWeekday
	Dim matchedSlots As List
	matchedSlots.Initialize
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			If ScheduleAppliesToday(schedule, todayKey, todayWeekday) = False Then Continue
			Dim scheduleTitle As String = schedule.GetDefault("title", "")
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					Dim slotTime As String = slot.GetDefault("time", "")
					Dim slotMinutes As Int = TimeStringToMinutes(slotTime)
					If slotMinutes < 0 Then Continue
					Dim streamData As Map = ExtractSlotStreamData(slot)
					Dim entry As Map
					entry.Initialize
					entry.Put("schedule_title", scheduleTitle)
					entry.Put("slot_time", slotTime)
					entry.Put("slot_minutes", slotMinutes)
					entry.Put("stream_id", streamData.GetDefault("id", ""))
					entry.Put("stream_title", streamData.GetDefault("title", ""))
					entry.Put("playlists", streamData.GetDefault("playlists", CreateInitializedList))
					matchedSlots.Add(entry)
				End If
			Next
		End If
	Next
	If matchedSlots.Size = 0 Then Return slotContext
	Dim selectedSlot As Map
	selectedSlot.Initialize
	Dim selectedMinutes As Int = -1
	For Each slotEntryObject As Object In matchedSlots
		Dim slotEntry As Map = slotEntryObject
		Dim slotMinutes As Int = slotEntry.GetDefault("slot_minutes", -1)
		If slotMinutes <= nowMinutes And slotMinutes >= selectedMinutes Then
			selectedSlot = slotEntry
			selectedMinutes = slotMinutes
		End If
	Next
	If selectedSlot.Size = 0 Then
		For Each slotEntryObject As Object In matchedSlots
			Dim slotEntry As Map = slotEntryObject
			Dim slotMinutes As Int = slotEntry.GetDefault("slot_minutes", -1)
			If slotMinutes > selectedMinutes Then
				selectedSlot = slotEntry
				selectedMinutes = slotMinutes
			End If
		Next
	End If
	Return selectedSlot
End Sub

Public Sub ChooseNextPlaylistDescriptor(currentSlot As Map, workingCursors As Map) As Map
	Dim emptyDescriptor As Map
	emptyDescriptor.Initialize
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return emptyDescriptor
	Dim slotKey As String = BuildDataSlotKey(currentSlot)
	Dim cursorValue As Int = workingCursors.GetDefault(slotKey, playlistCursors.GetDefault(slotKey, 0))
	If cursorValue < 0 Then cursorValue = 0
	Dim playlistIndexForSlot As Int = cursorValue Mod playlists.Size
	workingCursors.Put(slotKey, playlistIndexForSlot + 1)
	Trace("Курсор playlists. slot=" & slotKey & ", stored=" & cursorValue & ", previewNextStored=" & workingCursors.GetDefault(slotKey, 0) & ", playlists=" & playlists.Size)
	Dim playlistObject As Object = playlists.Get(playlistIndexForSlot)
	If playlistObject Is Map Then
		Dim playlistSource As Map = playlistObject
		Dim playlist As Map = CloneMap(playlistSource)
		playlist.Put("_slot_key", slotKey)
		playlist.Put("_playlist_index", playlistIndexForSlot)
		Trace("Выбран playlist для локального воспроизведения. slot=" & slotKey & ", index=" & playlistIndexForSlot & ", playlistId=" & playlist.GetDefault("id", "") & ", title=" & playlist.GetDefault("title", ""))
		Return playlist
	End If
	Return emptyDescriptor
End Sub

Public Sub LoadCachedPlaylistMetadata(playlistId As String) As Map
	Dim playlistData As Map
	playlistData.Initialize
	If playlistId = "" Then Return playlistData
	If File.Exists(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId)) = False Then Return playlistData
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId)))
		Dim parsedData As Map = parser.NextObject
		If parsedData.IsInitialized Then playlistData = parsedData
	Catch
		playlistData.Initialize
		Trace("Не удалось загрузить playlist metadata из кэша. id=" & playlistId & ", message=" & LastException.Message)
	End Try
	Return playlistData
End Sub

Public Sub ChooseRandomTrackFromPlaylist(playlistData As Map) As Map
	Dim emptyTrack As Map
	emptyTrack.Initialize
	If playlistData.IsInitialized = False Then Return emptyTrack
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Or tracks.Size = 0 Then Return emptyTrack
	Dim filteredTracks As List
	filteredTracks.Initialize
	For Each trackObject As Object In tracks
		If trackObject Is Map Then
			Dim track As Map = trackObject
			Dim trackId As String = track.GetDefault("id", "")
			If trackId = "" Then Continue
			If recentTrackIds.IndexOf(trackId) = -1 Then filteredTracks.Add(track)
		End If
	Next
	Dim sourceTracks As List = tracks
	If filteredTracks.Size > 0 Then sourceTracks = filteredTracks
	Dim randomIndex As Int = Rnd(0, sourceTracks.Size)
	Dim trackObject As Object = sourceTracks.Get(randomIndex)
	If trackObject Is Map Then Return trackObject
	Return emptyTrack
End Sub

Public Sub CreateQueueTrackFromPlaylist(currentSlot As Map, playlistDescriptor As Map, track As Map, offlineData As Map) As Map
	Dim item As Map
	item.Initialize
	item.Put("type", "track")
	item.Put("id", track.GetDefault("id", ""))
	item.Put("code", track.GetDefault("code", ""))
	item.Put("set", track.GetDefault("set", ""))
	item.Put("duration", track.GetDefault("duration", 0))
	item.Put("gain", track.GetDefault("gain", -3))
	item.Put("stream", ResolvePlaybackStreamTitle(currentSlot, playlistDescriptor, offlineData))
	item.Put("playlist_id", playlistDescriptor.GetDefault("id", ""))
	item.Put("playlist_title", playlistDescriptor.GetDefault("title", ""))
	item.Put("slot_key", playlistDescriptor.GetDefault("_slot_key", BuildDataSlotKey(currentSlot)))
	item.Put("playlist_index", playlistDescriptor.GetDefault("_playlist_index", 0))
	item.Put("schedule_title", currentSlot.GetDefault("schedule_title", ""))
	item.Put("slot_time", currentSlot.GetDefault("slot_time", ""))
	Return item
End Sub

Public Sub CommitPlaylistCursor(storage As KeyValueStore, item As Map)
	If item.IsInitialized = False Then Return
	If item.GetDefault("type", "") <> "track" Then Return
	Dim slotKey As String = item.GetDefault("slot_key", "")
	If slotKey = "" Then Return
	Dim nextStored As Int = item.GetDefault("playlist_index", 0) + 1
	playlistCursors.Put(slotKey, nextStored)
	storage.Put("data_slot_playlist_cursors", playlistCursors)
	Trace("Зафиксирован курсор playlists. slot=" & slotKey & ", committed=" & nextStored)
End Sub

Public Sub RememberResolvedTrack(trackId As String)
	If trackId = "" Then Return
	recentTrackIds.Add(trackId)
	Do While recentTrackIds.Size > 20
		recentTrackIds.RemoveAt(0)
	Loop
End Sub

Private Sub ResolvePlaybackStreamTitle(currentSlot As Map, playlistDescriptor As Map, offlineData As Map) As String
	Dim streamTitle As String = currentSlot.GetDefault("stream_title", "")
	If streamTitle <> "" Then Return streamTitle
	Dim resolvedStreamTitle As String = ResolveOfflineStreamTitle(currentSlot, offlineData)
	If resolvedStreamTitle <> "" Then Return resolvedStreamTitle
	Dim scheduleTitle As String = currentSlot.GetDefault("schedule_title", "")
	Dim descriptorStreamTitle As String = playlistDescriptor.GetDefault("stream_title", "")
	If descriptorStreamTitle <> "" Then Return descriptorStreamTitle
	If scheduleTitle <> "" Then Return scheduleTitle
	Return playlistDescriptor.GetDefault("title", "")
End Sub

Private Sub ResolveOfflineStreamTitle(currentSlot As Map, offlineData As Map) As String
	If offlineData.IsInitialized = False Then Return ""
	Dim targetStreamId As String = currentSlot.GetDefault("stream_id", "")
	Dim targetSlotTime As String = currentSlot.GetDefault("slot_time", "")
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return ""
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					If targetSlotTime <> "" And slot.GetDefault("time", "") <> targetSlotTime Then Continue
					Dim streamData As Map = ExtractSlotStreamData(slot)
					If targetStreamId <> "" And streamData.GetDefault("id", "") <> targetStreamId Then Continue
					Dim streamTitle As String = streamData.GetDefault("title", "")
					If streamTitle <> "" Then Return streamTitle
				End If
			Next
		End If
	Next
	Return ""
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

Private Sub ScheduleAppliesToday(schedule As Map, todayKey As String, todayWeekday As String) As Boolean
	Dim startDate As String = schedule.GetDefault("start", "")
	If startDate <> "" And startDate.CompareTo(todayKey) > 0 Then Return False
	Dim weekdays As List = schedule.GetDefault("weekdays", Null)
	If weekdays.IsInitialized = False Or weekdays.Size = 0 Then Return True
	For Each weekdayObject As Object In weekdays
		If ("" & weekdayObject).Trim = todayWeekday Then Return True
	Next
	Return False
End Sub

Private Sub BuildDataSlotKey(currentSlot As Map) As String
	Return currentSlot.GetDefault("schedule_title", "") & "|" & currentSlot.GetDefault("stream_id", "") & "|" & currentSlot.GetDefault("slot_time", "")
End Sub

Private Sub GetOfflinePlaylistsDir As String
	Return File.Combine(storageDir, "playlists")
End Sub

Private Sub PlaylistMetadataFileName(playlistId As String) As String
	Return playlistId & ".json"
End Sub

Private Sub FormatIsoDate(ticks As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim value As String = DateTime.Date(ticks)
	DateTime.DateFormat = previousDateFormat
	Return value
End Sub

Private Sub CurrentMinutesOfDay As Int
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "HH:mm:ss"
	Dim timeValue As String = DateTime.Time(DateTime.Now)
	DateTime.TimeFormat = previousTimeFormat
	Dim parts() As String = Regex.Split(":", timeValue)
	If parts.Length < 2 Then Return 0
	Return parts(0) * 60 + parts(1)
End Sub

Private Sub CurrentIsoWeekday As String
	Dim jo As JavaObject
	jo.InitializeStatic("java.time.LocalDate")
	Dim today As JavaObject = jo.RunMethod("now", Null)
	Dim dayOfWeek As JavaObject = today.RunMethod("getDayOfWeek", Null)
	Return "" & dayOfWeek.RunMethod("getValue", Null)
End Sub

Private Sub TimeStringToMinutes(value As String) As Int
	If value = "" Then Return -1
	Dim parts() As String = Regex.Split(":", value)
	If parts.Length < 2 Then Return -1
	Try
		Dim hours As Int = parts(0)
		Dim minutes As Int = parts(1)
		If hours < 0 Or hours > 23 Then Return -1
		If minutes < 0 Or minutes > 59 Then Return -1
		Return hours * 60 + minutes
	Catch
		Return -1
	End Try
End Sub

Private Sub CreateInitializedMap As Map
	Dim m As Map
	m.Initialize
	Return m
End Sub

Private Sub CloneMap(source As Map) As Map
	Dim copy As Map
	copy.Initialize
	If source.IsInitialized = False Then Return copy
	For Each key As Object In source.Keys
		copy.Put(key, source.Get(key))
	Next
	Return copy
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
