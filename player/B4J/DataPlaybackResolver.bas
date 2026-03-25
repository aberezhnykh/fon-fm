B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Разрешает offline/data playback модель в конкретные слоты, плейлисты и queue tracks.
' Здесь живут cursor-ы, выбор playlist/track и работа с cached playlist metadata.

Sub Class_Globals
	Private storageDir As String
	Private targetModule As Object
	Private traceSubName As String
	Private playlistCursors As Map
	Private storageRef As KeyValueStore
End Sub

Public Sub Initialize(storageDirValue As String, targetModuleValue As Object, traceSubNameValue As String)
	storageDir = storageDirValue
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	playlistCursors.Initialize
End Sub

' Загружает persisted cursors и историю недавних треков для более устойчивого выбора следующего контента.
Public Sub LoadState(storage As KeyValueStore)
	storageRef = storage
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
	Return ResolveDataSlotAtTicks(offlineData, DateTime.Now)
End Sub

' Определяет текущий data slot по расписаниям и времени.
Public Sub ResolveDataSlotAtTicks(offlineData As Map, targetTicks As Long) As Map
	Dim slotContext As Map
	slotContext.Initialize
	If offlineData.IsInitialized = False Then Return slotContext
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return slotContext
	Dim todayKey As String = FormatIsoDate(targetTicks)
	Dim nowMinutes As Int = MinutesOfDayFromTicks(targetTicks)
	Dim todayWeekday As String = IsoWeekdayFromTicks(targetTicks)
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
		selectedMinutes = 24 * 60 + 1
		For Each slotEntryObject As Object In matchedSlots
			Dim slotEntry As Map = slotEntryObject
			Dim slotMinutes As Int = slotEntry.GetDefault("slot_minutes", -1)
			If slotMinutes > nowMinutes And slotMinutes < selectedMinutes Then
				selectedSlot = slotEntry
				selectedMinutes = slotMinutes
			End If
		Next
	End If
	Return selectedSlot
End Sub

Public Sub ResolveNextDataSlot(offlineData As Map) As Map
	Return ResolveNextDataSlotAtTicks(offlineData, DateTime.Now)
End Sub

' Ищет ближайший следующий data slot, полезно для прогнозов и debug.
Public Sub ResolveNextDataSlotAtTicks(offlineData As Map, referenceTicks As Long) As Map
	Dim nextSlot As Map
	nextSlot.Initialize
	If offlineData.IsInitialized = False Then Return nextSlot
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return nextSlot
	Dim nowTicks As Long = referenceTicks
	Dim bestSlotTicks As Long = 0
	For dayOffset = 0 To 7
		Dim dayTicks As Long = StartOfDayTicks(nowTicks + dayOffset * DateTime.TicksPerDay)
		Dim dayKey As String = FormatIsoDate(dayTicks)
		Dim dayWeekday As String = IsoWeekdayFromTicks(dayTicks)
		For Each scheduleObject As Object In schedules
			If scheduleObject Is Map Then
				Dim schedule As Map = scheduleObject
				If ScheduleAppliesOnDate(schedule, dayKey, dayWeekday) = False Then Continue
				Dim scheduleTitle As String = schedule.GetDefault("title", "")
				Dim slots As List = schedule.GetDefault("slots", Null)
				If slots.IsInitialized = False Then Continue
				For Each slotObject As Object In slots
					If slotObject Is Map Then
						Dim slot As Map = slotObject
						Dim slotTime As String = slot.GetDefault("time", "")
						Dim slotMinutes As Int = TimeStringToMinutes(slotTime)
						If slotMinutes < 0 Then Continue
						Dim slotTicks As Long = dayTicks + slotMinutes * DateTime.TicksPerMinute
						If slotTicks <= nowTicks Then Continue
						If bestSlotTicks > 0 And slotTicks >= bestSlotTicks Then Continue
						Dim streamData As Map = ExtractSlotStreamData(slot)
						nextSlot.Initialize
						nextSlot.Put("schedule_title", scheduleTitle)
						nextSlot.Put("slot_time", slotTime)
						nextSlot.Put("slot_minutes", slotMinutes)
						nextSlot.Put("slot_ticks", slotTicks)
						nextSlot.Put("stream_id", streamData.GetDefault("id", ""))
						nextSlot.Put("stream_title", streamData.GetDefault("title", ""))
						nextSlot.Put("playlists", streamData.GetDefault("playlists", CreateInitializedList))
						bestSlotTicks = slotTicks
					End If
				Next
			End If
		Next
		If nextSlot.IsInitialized And nextSlot.Size > 0 Then Exit
	Next
	Return nextSlot
End Sub

' Выбирает следующий playlist descriptor для текущего slot с учётом cursor-ов по slot_key.
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
	Dim playlistObject As Object = playlists.Get(playlistIndexForSlot)
	If playlistObject Is Map Then
		Dim playlistSource As Map = playlistObject
		Dim playlist As Map = CloneMap(playlistSource)
		playlist.Put("_slot_key", slotKey)
		playlist.Put("_playlist_index", playlistIndexForSlot)
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

' Возвращает следующий локально доступный track из cached playback order плейлиста.
' Порядок собирается один раз, сохраняется в storage и дальше обходится сверху вниз с wrap-around.
Public Sub ResolveOrderedCachedTrackFromPlaylistById(playlistId As String, mediaCacheService As MediaCache) As Map
	Dim emptyTrack As Map
	emptyTrack.Initialize
	If storageRef.IsInitialized = False Then Return emptyTrack
	If playlistId = "" Then Return emptyTrack
	Dim manifest As Map = LoadOrBuildPlaylistPlaybackManifestById(playlistId)
	If manifest.IsInitialized = False Or manifest.Size = 0 Then Return emptyTrack
	Dim playlistTitle As String = manifest.GetDefault("title", "")
	Dim order As List = manifest.GetDefault("order", Null)
	If order.IsInitialized = False Or order.Size = 0 Then Return emptyTrack
	Dim trackMap As Map = manifest.GetDefault("tracks", Null)
	If trackMap.IsInitialized = False Or trackMap.Size = 0 Then Return emptyTrack
	Dim cursorKey As String = PlaylistPlaybackCursorKey(playlistId)
	Dim storedCursor As Int = storageRef.GetDefault(cursorKey, -1)
	Dim trackIndexKey As String = PlaylistTrackIndexKey(playlistId)
	Dim storedTrackIndexValue As Int = storageRef.GetDefault(trackIndexKey, -1)
	If storedCursor < 0 Then
		If storedTrackIndexValue >= 0 Then storedCursor = storedTrackIndexValue + 1
	End If
	Dim storedTrackIndex As Int = storedCursor - 1
	If storedTrackIndex >= order.Size Then storedTrackIndex = storedTrackIndex Mod order.Size
	Trace("playlist resolve start playlistId=" & playlistId & " orderSize=" & order.Size & " storedCursor=" & storedCursor & " storedTrackIndexKey=" & storedTrackIndexValue & " effectiveStoredTrackIndex=" & storedTrackIndex)
	Dim selectedTrack As Map
	selectedTrack.Initialize
	Dim startIndex As Int = storedTrackIndex + 1
	If startIndex < 0 Then startIndex = 0
	If startIndex >= order.Size Then startIndex = startIndex Mod order.Size
	For offset = 0 To order.Size - 1
		Dim orderIndex As Int = (startIndex + offset) Mod order.Size
		Dim trackId As String = order.Get(orderIndex)
		If trackId = "" Then Continue
		If storedTrackIndex >= 0 And order.Size > 1 And orderIndex = storedTrackIndex Then
			Trace("playlist resolve skip_current playlistId=" & playlistId & " orderIndex=" & orderIndex & " trackId=" & trackId)
			Continue
		End If
		Dim trackObject As Object = trackMap.GetDefault(trackId, Null)
		If (trackObject Is Map) = False Then Continue
		Dim track As Map = trackObject
		If mediaCacheService.HasValidatedLocalMedia(track) Then
			storageRef.Put(trackIndexKey, orderIndex)
			storageRef.Put(cursorKey, orderIndex + 1)
			selectedTrack = CloneMap(track)
			selectedTrack.Put("playlist_track_index", orderIndex)
			selectedTrack.Put("playlist_cursor", orderIndex + 1)
			selectedTrack.Put("playlist_title", playlistTitle)
			Trace("playlist resolve selected playlistId=" & playlistId & " orderIndex=" & orderIndex & " nextCursor=" & (orderIndex + 1) & " trackId=" & trackId)
			Exit
		Else
'			Trace("playlist resolve skip_uncached playlistId=" & playlistId & " orderIndex=" & orderIndex & " trackId=" & trackId)
		End If
	Next
	If selectedTrack.IsInitialized = False Or selectedTrack.Size = 0 Then
		For offset = 0 To order.Size - 1
			Dim fallbackOrderIndex As Int = (startIndex + offset) Mod order.Size
			Dim fallbackTrackId As String = order.Get(fallbackOrderIndex)
			If fallbackTrackId = "" Then Continue
			If storedTrackIndex >= 0 And order.Size > 1 And fallbackOrderIndex = storedTrackIndex Then Continue
			If mediaCacheService.IsTrackCached(fallbackTrackId) = False Then Continue
			Dim fallbackTrackObject As Object = trackMap.GetDefault(fallbackTrackId, Null)
			If (fallbackTrackObject Is Map) = False Then Continue
			selectedTrack = CloneMap(fallbackTrackObject)
			selectedTrack.Put("playlist_title", playlistTitle)
			storageRef.Put(trackIndexKey, fallbackOrderIndex)
			storageRef.Put(cursorKey, fallbackOrderIndex + 1)
			selectedTrack.Put("playlist_track_index", fallbackOrderIndex)
			selectedTrack.Put("playlist_cursor", fallbackOrderIndex + 1)
			Trace("playlist resolve fallback_index playlistId=" & playlistId & " orderIndex=" & fallbackOrderIndex & " trackId=" & fallbackTrackId)
			Exit
		Next
		If selectedTrack.IsInitialized = False Or selectedTrack.Size = 0 Then
			Trace("playlist resolve empty playlistId=" & playlistId & " orderSize=" & order.Size)
		End If
	End If
	If selectedTrack.IsInitialized And selectedTrack.Size > 0 Then Return selectedTrack
	Return emptyTrack
End Sub

Public Sub GetUpcomingPlaybackTracksById(playlistId As String, limitCount As Int, mediaCacheService As MediaCache, includeCached As Boolean) As List
	Dim result As List
	result.Initialize
	If storageRef.IsInitialized = False Then Return result
	If playlistId = "" Or limitCount <= 0 Then Return result
	Dim manifest As Map = LoadOrBuildPlaylistPlaybackManifestById(playlistId)
	If manifest.IsInitialized = False Or manifest.Size = 0 Then Return result
	Dim playlistTitle As String = manifest.GetDefault("title", "")
	Dim order As List = manifest.GetDefault("order", Null)
	If order.IsInitialized = False Or order.Size = 0 Then Return result
	Dim trackMap As Map = manifest.GetDefault("tracks", Null)
	If trackMap.IsInitialized = False Or trackMap.Size = 0 Then Return result
	
	Dim cursorKey As String = PlaylistPlaybackCursorKey(playlistId)
	Dim storedCursor As Int = storageRef.GetDefault(cursorKey, -1)
	Dim trackIndexKey As String = PlaylistTrackIndexKey(playlistId)
	Dim storedTrackIndexValue As Int = storageRef.GetDefault(trackIndexKey, -1)
	If storedCursor < 0 Then
		If storedTrackIndexValue >= 0 Then storedCursor = storedTrackIndexValue + 1
	End If
	Dim storedTrackIndex As Int = storedCursor - 1
	If storedTrackIndex >= order.Size Then storedTrackIndex = storedTrackIndex Mod order.Size
	
	Dim startIndex As Int = storedTrackIndex + 1
	If startIndex < 0 Then startIndex = 0
	If startIndex >= order.Size Then startIndex = startIndex Mod order.Size
	
	For offset = 0 To order.Size - 1
		If result.Size >= limitCount Then Exit
		Dim orderIndex As Int = (startIndex + offset) Mod order.Size
		Dim trackId As String = order.Get(orderIndex)
		If trackId = "" Then Continue
		If storedTrackIndex >= 0 And order.Size > 1 And orderIndex = storedTrackIndex Then Continue
		Dim trackObject As Object = trackMap.GetDefault(trackId, Null)
		If (trackObject Is Map) = False Then Continue
		Dim track As Map = CloneMap(trackObject)
		track.Put("playlist_id", playlistId)
		track.Put("playlist_title", playlistTitle)
		track.Put("playlist_track_index", orderIndex)
		track.Put("playlist_cursor", orderIndex + 1)
		If includeCached = False And mediaCacheService.HasValidatedLocalMedia(track) Then Continue
		result.Add(track)
	Next
	
	Return result
End Sub

Private Sub LoadOrBuildPlaylistPlaybackManifestById(playlistId As String) As Map
	Dim manifest As Map
	manifest.Initialize
	If playlistId = "" Then Return manifest
	Dim storedManifest As Map = storageRef.GetDefault(PlaylistPlaybackManifestKey(playlistId), Null)
	If storedManifest.IsInitialized Then
		Dim storedOrder As List = storedManifest.GetDefault("order", Null)
		Dim storedTracks As Map = storedManifest.GetDefault("tracks", Null)
		If storedOrder.IsInitialized And storedOrder.Size > 0 And storedTracks.IsInitialized And storedTracks.Size > 0 Then
			Return storedManifest
		End If
	End If
	Dim sourcePlaylistData As Map = LoadCachedPlaylistMetadata(playlistId)
	If sourcePlaylistData.IsInitialized = False Or sourcePlaylistData.Size = 0 Then Return manifest
	manifest = BuildPlaylistPlaybackManifest(sourcePlaylistData)
	If manifest.IsInitialized And manifest.Size > 0 Then
		storageRef.Put(PlaylistPlaybackManifestKey(playlistId), manifest)
	End If
	Return manifest
End Sub

Private Sub BuildPlaylistPlaybackManifest(playlistData As Map) As Map
	Dim manifest As Map
	manifest.Initialize
	If playlistData.IsInitialized = False Then Return manifest
	Dim playlistId As String = playlistData.GetDefault("id", "")
	If playlistId = "" Then Return manifest
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Or tracks.Size = 0 Then Return manifest
	Dim trackEntries As Map
	trackEntries.Initialize
	Dim order As List
	order.Initialize
	For Each trackObject As Object In tracks
		If (trackObject Is Map) = False Then Continue
		Dim track As Map = trackObject
		Dim trackId As String = track.GetDefault("id", "")
		If trackId = "" Then Continue
		If trackEntries.ContainsKey(trackId) Then Continue
		Dim entry As Map
		entry.Initialize
		entry.Put("type", "track")
		entry.Put("id", trackId)
		entry.Put("code", track.GetDefault("code", ""))
		entry.Put("set", track.GetDefault("set", ""))
		entry.Put("duration", track.GetDefault("duration", 0))
		entry.Put("gain", track.GetDefault("gain", -3))
		entry.Put("title", track.GetDefault("title", ""))
		entry.Put("playlist_id", playlistId)
		trackEntries.Put(trackId, entry)
		order.Add(trackId)
	Next
	If order.Size = 0 Then Return manifest
	ShuffleListInPlace(order)
	manifest.Put("version", PlaylistPlaybackManifestVersion(playlistData))
	manifest.Put("playlist_id", playlistId)
	manifest.Put("title", playlistData.GetDefault("title", ""))
	manifest.Put("updated", playlistData.GetDefault("updated", ""))
	manifest.Put("track_count", order.Size)
	manifest.Put("order", order)
	manifest.Put("tracks", trackEntries)
	Return manifest
End Sub

Private Sub PlaylistPlaybackManifestVersion(playlistData As Map) As String
	Dim updatedValue As String = playlistData.GetDefault("updated", "")
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	Dim trackCount As Int = 0
	If tracks.IsInitialized Then trackCount = tracks.Size
	Return updatedValue & "|" & trackCount
End Sub

Private Sub PlaylistPlaybackManifestKey(playlistId As String) As String
	Return "playlist_playback_manifest_" & playlistId
End Sub

Private Sub PlaylistPlaybackCursorKey(playlistId As String) As String
	Return "playlist_playback_cursor_" & playlistId
End Sub

Private Sub PlaylistTrackIndexKey(playlistId As String) As String
	Return "playlist_track_index_" & playlistId
End Sub

Private Sub ShuffleListInPlace(items As List)
	If items.IsInitialized = False Or items.Size < 2 Then Return
	For i = items.Size - 1 To 1 Step -1
		Dim j As Int = Rnd(0, i + 1)
		If j = i Then Continue
		Dim temp As Object = items.Get(i)
		items.Set(i, items.Get(j))
		items.Set(j, temp)
	Next
End Sub

Public Sub ChooseCachedTrackFromSlot(currentSlot As Map, preferredPlaylistId As String, mediaCacheService As MediaCache) As Map
	Dim emptyResult As Map
	emptyResult.Initialize
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return emptyResult
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return emptyResult
	Dim preferredDescriptor As Map
	preferredDescriptor.Initialize
	Dim fallbackDescriptors As List
	fallbackDescriptors.Initialize
	For Each playlistObject As Object In playlists
		If (playlistObject Is Map) = False Then Continue
		Dim playlistDescriptor As Map = playlistObject
		Dim playlistId As String = playlistDescriptor.GetDefault("id", "")
		If playlistId = "" Then Continue
		If playlistId = preferredPlaylistId Then
			preferredDescriptor = CloneMap(playlistDescriptor)
		Else
			fallbackDescriptors.Add(CloneMap(playlistDescriptor))
		End If
	Next
	Dim orderedDescriptors As List
	orderedDescriptors.Initialize
	If preferredDescriptor.IsInitialized And preferredDescriptor.Size > 0 Then orderedDescriptors.Add(preferredDescriptor)
	For Each descriptorObject As Object In fallbackDescriptors
		orderedDescriptors.Add(descriptorObject)
	Next
	Dim selectedResult As Map
	selectedResult.Initialize
	For Each descriptorObject As Object In orderedDescriptors
		If (descriptorObject Is Map) = False Then Continue
		Dim descriptor As Map = descriptorObject
		Dim playlistId As String = descriptor.GetDefault("id", "")
		If playlistId = "" Then Continue
		Dim cachedTrack As Map = ResolveOrderedCachedTrackFromPlaylistById(playlistId, mediaCacheService)
		If cachedTrack.IsInitialized = False Or cachedTrack.Size = 0 Then Continue
		selectedResult = BuildSlotFallbackResult(descriptor, cachedTrack, playlistId = preferredPlaylistId)
		Exit
	Next
	If selectedResult.IsInitialized And selectedResult.Size > 0 Then Return selectedResult
	Return emptyResult
End Sub

Private Sub BuildSlotFallbackResult(descriptor As Map, cachedTrack As Map, isPreferredPlaylist As Boolean) As Map
	Dim result As Map
	result.Initialize
	result.Put("playlist", descriptor)
	result.Put("track", cachedTrack)
	If isPreferredPlaylist Then
		result.Put("source", "fallback_same_playlist")
	Else
		result.Put("source", "fallback_other_playlist")
	End If
	Return result
End Sub

' Собирает queue item из slot/playlist/track так, чтобы дальше orchestration уже работал с нормализованной playback queue.
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
	item.Put("playlist_track_index", track.GetDefault("playlist_track_index", -1))
	item.Put("playlist_cursor", track.GetDefault("playlist_cursor", -1))
	item.Put("schedule_title", currentSlot.GetDefault("schedule_title", ""))
	item.Put("slot_time", currentSlot.GetDefault("slot_time", ""))
	Return item
End Sub

Public Sub CommitPlaylistCursor(storage As KeyValueStore, item As Map)
	If item.IsInitialized = False Then Return
	If item.GetDefault("type", "") <> "track" Then Return
	Dim slotKey As String = item.GetDefault("slot_key", "")
	Dim playlistId As String = item.GetDefault("playlist_id", "")
	Dim playlistTrackIndex As Int = item.GetDefault("playlist_track_index", -1)
	If playlistId <> "" And playlistTrackIndex >= 0 Then
		Dim storedCursor As Int = item.GetDefault("playlist_cursor", playlistTrackIndex + 1)
		storage.Put(PlaylistTrackIndexKey(playlistId), playlistTrackIndex)
		storage.Put(PlaylistPlaybackCursorKey(playlistId), storedCursor)
		Trace("playlist commit track playlistId=" & playlistId & " trackIndex=" & playlistTrackIndex & " cursor=" & storedCursor & " trackId=" & item.GetDefault("id", ""))
	End If
	If slotKey = "" Then Return
	Dim playlistIndex As Int = item.GetDefault("playlist_index", -1)
	If playlistIndex < 0 Then Return
	playlistCursors.Put(slotKey, playlistIndex + 1)
	storage.Put("data_slot_playlist_cursors", playlistCursors)
	Trace("playlist commit slot slotKey=" & slotKey & " playlistIndex=" & playlistIndex & " nextPlaylistCursor=" & (playlistIndex + 1))
End Sub

Public Sub SavePreviewPlaylistCursors(storage As KeyValueStore, workingCursors As Map)
	If workingCursors.IsInitialized = False Or workingCursors.Size = 0 Then Return
	playlistCursors = CloneMap(workingCursors)
	storage.Put("data_slot_playlist_cursors", playlistCursors)
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
	Return ScheduleAppliesOnDate(schedule, todayKey, todayWeekday)
End Sub

Private Sub ScheduleAppliesOnDate(schedule As Map, targetDateKey As String, targetWeekday As String) As Boolean
	Dim startDate As String = schedule.GetDefault("start", "")
	If startDate <> "" And startDate.CompareTo(targetDateKey) > 0 Then Return False
	Dim weekdays As List = schedule.GetDefault("weekdays", Null)
	If weekdays.IsInitialized = False Or weekdays.Size = 0 Then Return True
	For Each weekdayObject As Object In weekdays
		If ("" & weekdayObject).Trim = targetWeekday Then Return True
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

Private Sub MinutesOfDayFromTicks(ticks As Long) As Int
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "HH:mm:ss"
	Dim timeValue As String = DateTime.Time(ticks)
	DateTime.TimeFormat = previousTimeFormat
	Dim parts() As String = Regex.Split(":", timeValue)
	If parts.Length < 2 Then Return 0
	Return parts(0) * 60 + parts(1)
End Sub

Private Sub IsoWeekdayFromTicks(ticks As Long) As String
	Dim instantClass As JavaObject
	instantClass.InitializeStatic("java.time.Instant")
	Dim zoneClass As JavaObject
	zoneClass.InitializeStatic("java.time.ZoneId")
	Dim zonedDateTimeClass As JavaObject
	zonedDateTimeClass.InitializeStatic("java.time.ZonedDateTime")
	Dim instant As JavaObject = instantClass.RunMethod("ofEpochMilli", Array As Object(ticks))
	Dim zoneId As JavaObject = zoneClass.RunMethod("systemDefault", Null)
	Dim zonedDateTime As JavaObject = zonedDateTimeClass.RunMethod("ofInstant", Array As Object(instant, zoneId))
	Dim localDate As JavaObject = zonedDateTime.RunMethod("toLocalDate", Null)
	Dim dayOfWeek As JavaObject = localDate.RunMethod("getDayOfWeek", Null)
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

Private Sub StartOfDayTicks(ticks As Long) As Long
	Dim previousDateFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim dayKey As String = DateTime.Date(ticks)
	Dim dayTicks As Long = DateTime.DateParse(dayKey)
	DateTime.DateFormat = previousDateFormat
	Return dayTicks
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

Public Sub GetPlaylistPlaybackManifestById(playlistId As String) As Map
	Return LoadOrBuildPlaylistPlaybackManifestById(playlistId)
End Sub
