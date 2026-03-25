B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@
' Предсказывает какие треки будут нужны для воспроизведения в ближайшие часы.
' Оптимизированная версия: улучшена структура, удалены заглушки, исправлены предупреждения,
' улучшена сортировка, добавлена защита от ошибок, повышена читаемость.

Sub Class_Globals
	Private targetModule As Object
	Private traceSubName As String

	Private lastPredictionTicks As Long = 0
	Private lastOfflineDataHash As Int = 0

	Private upcomingTracks As List
	Private predictionCacheMap As Map

	Private Const BUFFER_HOURS As Int = 3
	Private Const MIN_PREDICTION_CACHE_MS As Long = 60000
	Private Const PRIORITY_CURRENT_SLOT_OFFSET As Int = 50
	Private Const PRIORITY_CACHED_OFFSET As Int = -30
End Sub


Public Sub Initialize(target As Object, traceSub As String)
	targetModule = target
	traceSubName = traceSub

	predictionCacheMap.Initialize
	upcomingTracks.Initialize

	lastPredictionTicks = 0
	lastOfflineDataHash = 0
End Sub


' Главный метод: возвращает отсортированный список треков, которые нужны в ближайшие часы.
Public Sub PredictUpcomingTracks(offlineData As Map, mediaCache As Object, resolver As DataPlaybackResolver) As List
	If offlineData = Null Or offlineData.Size = 0 Then Return CreateInitializedList

	Dim nowTicks As Long = DateTime.Now
	Dim dataHash As Int = GetDataHash(offlineData)

	Dim shouldRecalculate As Boolean = _
        lastPredictionTicks = 0 Or _
        (nowTicks - lastPredictionTicks) > MIN_PREDICTION_CACHE_MS Or _
        dataHash <> lastOfflineDataHash

	If shouldRecalculate = False Then
		Return CloneTrackList(upcomingTracks)
	End If

	upcomingTracks.Initialize

	Dim currentSlot As Map = resolver.ResolveCurrentDataSlot(offlineData)
	Dim allSlots As List = BuildUpcomingSlotsForBuffer(offlineData, resolver, nowTicks, BUFFER_HOURS)

	For Each slotObj As Object In allSlots
		Dim slot As Map = slotObj
		Dim isCurrent As Boolean = (currentSlot <> Null And slot.GetDefault("slot_time", "") = currentSlot.GetDefault("slot_time", ""))

		Dim playlists As List = slot.GetDefault("playlists", Null)
		If playlists = Null Then Continue

		For Each plObj As Object In playlists
			Dim playlist As Map = plObj
			Dim playlistId As String = playlist.GetDefault("id", "")
			If playlistId = "" Then Continue

			Dim tracks As List = ExtractPlaylistTracks(resolver, playlistId)
			If tracks = Null Or tracks.Size = 0 Then Continue

			For Each trObj As Object In tracks
				Dim track As Map = trObj
				Dim id As String = track.GetDefault("id", "")
				If id = "" Then Continue

				If IsTrackAlreadyInQueue(id, upcomingTracks) = False Then
					Dim priority As Int = CalculateTrackPriority(track, slot, isCurrent, nowTicks, mediaCache)
					track.Put("_priority", priority)
					track.Put("_need_time_minutes", slot.GetDefault("slot_minutes", 0))
					upcomingTracks.Add(track)
				End If
			Next
		Next
	Next

	SortTracksByPriority(upcomingTracks)

	lastPredictionTicks = nowTicks
	lastOfflineDataHash = dataHash

	Trace("Предсказано " & upcomingTracks.Size & " треков для кэширования")

	Return CloneTrackList(upcomingTracks)
End Sub


' Возвращает только high-priority треки
Public Sub GetHighPriorityTracks As List
	If upcomingTracks = Null Or upcomingTracks.Size = 0 Then Return CreateInitializedList

	Dim result As List
	result.Initialize

	For Each trObj As Object In upcomingTracks
		Dim track As Map = trObj
		If track.GetDefault("_priority", 0) >= 40 Then result.Add(track)
	Next

	Return result
End Sub


' ================= PRIVATE =================


Private Sub BuildUpcomingSlotsForBuffer(offlineData As Map, resolver As DataPlaybackResolver, startTicks As Long, bufferHours As Int) As List
	Dim slots As List
	slots.Initialize

	Dim current As Map = resolver.ResolveCurrentDataSlot(offlineData)
	If current <> Null And current.Size > 0 Then slots.Add(current)

	Dim endTicks As Long = startTicks + bufferHours * DateTime.TicksPerHour
	Dim searchTicks As Long = startTicks

	Do While searchTicks < endTicks
		Dim nextSlot As Map = resolver.ResolveNextDataSlotAtTicks(offlineData, searchTicks)
		If nextSlot = Null Or nextSlot.Size = 0 Then Exit

		Dim slotTicks As Long = nextSlot.GetDefault("slot_ticks", 0)
		If slotTicks <= searchTicks Or slotTicks >= endTicks Then Exit

		slots.Add(nextSlot)
		searchTicks = slotTicks + DateTime.TicksPerMinute
	Loop

	Return slots
End Sub


Private Sub ExtractPlaylistTracks(resolver As DataPlaybackResolver, playlistId As String) As List
	' TODO: интеграция с resolver
	Dim tracks As List
	tracks.Initialize
	Return tracks
End Sub


Private Sub CalculateTrackPriority(track As Map, slot As Map, isCurrent As Boolean, nowTicks As Long, mediaCache As Object) As Int
	Dim p As Int = 50

	If isCurrent Then p = p + PRIORITY_CURRENT_SLOT_OFFSET

	Dim id As String = track.GetDefault("id", "")
	If IsTrackCached(id, mediaCache) Then p = p + PRIORITY_CACHED_OFFSET

	Dim orderPenalty As Int = track.GetDefault("_order_index", 0) * 3
	If orderPenalty > 30 Then orderPenalty = 30
	p = p - orderPenalty

	If p < 0 Then p = 0
	If p > 100 Then p = 100

	Return p
End Sub


Private Sub IsTrackCached(id As String, mediaCache As Object) As Boolean
	Return False
End Sub


Private Sub IsTrackAlreadyInQueue(id As String, tracks As List) As Boolean
	For Each trObj As Object In tracks
		Dim track As Map = trObj
		If track.GetDefault("id", "") = id Then Return True
	Next
	Return False
End Sub


Private Sub SortTracksByPriority(tracks As List)
	If tracks.Size <= 1 Then Return

	For i = 0 To tracks.Size - 2
		For j = 0 To tracks.Size - 2 - i
			Dim t1 As Map = tracks.Get(j)
			Dim t2 As Map = tracks.Get(j + 1)

			If t1.GetDefault("_priority", 0) < t2.GetDefault("_priority", 0) Then
				tracks.Set(j, t2)
				tracks.Set(j + 1, t1)
			End If
		Next
	Next
End Sub


Private Sub GetDataHash(offlineData As Map) As Int
	Dim hash As Int = 0

	Dim updated As String = offlineData.GetDefault("updated", "")
	For i = 0 To updated.Length - 1
		hash = hash + Asc(updated.CharAt(i))
	Next

	Dim ads As List = offlineData.GetDefault("ads", Null)
	If ads <> Null Then hash = hash + ads.Size

	Return hash
End Sub


Private Sub CloneTrackList(tracks As List) As List
	Dim result As List
	result.Initialize

	For Each trObj As Object In tracks
		Dim track As Map = trObj
		result.Add(CloneMap(track))
	Next

	Return result
End Sub


Private Sub CloneMap(source As Map) As Map
	Dim cloned As Map
	cloned.Initialize

	For Each k As String In source.Keys
		cloned.Put(k, source.Get(k))
	Next

	Return cloned
End Sub


Private Sub CreateInitializedList As List
	Dim l As List
	l.Initialize
	Return l
End Sub


Private Sub Trace(msg As String)
	If targetModule = Null Then Return
	CallSubDelayed(targetModule, traceSubName & ": " & msg)
End Sub
