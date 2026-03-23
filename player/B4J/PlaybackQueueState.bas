B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Состояние очереди playback и exact break scheduling.
' Отвечает за snapshot/restore очереди и за отдельный tracking ближайшего exact break.

Sub Class_Globals
	Public ScheduledBreakAt As Long
	Public SkipQueueSnapshotRestoreOnce As Boolean
	Public StoppedReserveQueue As List
	Public StoppedReserveSignature As String
End Sub

Public Sub Initialize
	Reset
End Sub

' Полный сброс queue-state, reserve-очереди и scheduled break.
Public Sub Reset
	ScheduledBreakAt = -1
	SkipQueueSnapshotRestoreOnce = False
	StoppedReserveQueue.Initialize
	StoppedReserveSignature = ""
End Sub

Public Sub RequestSkipQueueSnapshotRestore
	SkipQueueSnapshotRestoreOnce = True
End Sub

Public Sub ConsumeSkipQueueSnapshotRestore As Boolean
	If SkipQueueSnapshotRestoreOnce = False Then Return False
	SkipQueueSnapshotRestoreOnce = False
	Return True
End Sub

Public Sub ClearQueueSnapshotSkip
	SkipQueueSnapshotRestoreOnce = False
End Sub

Public Sub ClearStoppedReserve
	If StoppedReserveQueue.IsInitialized = False Then StoppedReserveQueue.Initialize
	StoppedReserveQueue.Clear
	StoppedReserveSignature = ""
End Sub

Public Sub CaptureStoppedReserve(sourceQueue As List, signature As String)
	ClearStoppedReserve
	If sourceQueue.IsInitialized = False Or sourceQueue.Size = 0 Then Return
	If signature = "" Then Return
	For Each itemObject As Object In sourceQueue
		If itemObject Is Map Then
			StoppedReserveQueue.Add(CloneStateMap(itemObject))
		End If
	Next
	If StoppedReserveQueue.Size = 0 Then Return
	StoppedReserveSignature = signature
End Sub

' Разрешает вернуть reserve-очередь только если сигнатура данных не изменилась.
Public Sub CanRestoreStoppedReserve(currentSignature As String) As Boolean
	If StoppedReserveQueue.IsInitialized = False Or StoppedReserveQueue.Size = 0 Then Return False
	If currentSignature = "" Then Return False
	Return StoppedReserveSignature = currentSignature
End Sub

Public Sub MoveStoppedReserveToQueue(targetQueue As List) As Int
	If targetQueue.IsInitialized = False Then targetQueue.Initialize
	targetQueue.Clear
	Dim restoredCount As Int = 0
	For Each itemObject As Object In StoppedReserveQueue
		If itemObject Is Map Then
			targetQueue.Add(CloneStateMap(itemObject))
			restoredCount = restoredCount + 1
		End If
	Next
	ClearStoppedReserve
	Return restoredCount
End Sub

Public Sub SaveQueueSnapshot(storage As KeyValueStore, signature As String, queue As List, limit As Int)
	Dim tracks As List
	tracks.Initialize
	If queue.IsInitialized Then
		For Each itemObject As Object In queue
			If itemObject Is Map Then
				tracks.Add(CloneStateMap(itemObject))
				If limit > 0 And tracks.Size >= limit Then Exit
			End If
		Next
	End If
	storage.Put("queue_snapshot_signature", signature)
	storage.Put("queue_snapshot_tracks", tracks)
	storage.Put("queue_snapshot_saved_at", DateTime.Now)
End Sub

Public Sub RestoreQueueSnapshot(storage As KeyValueStore) As Map
	Dim result As Map
	result.Initialize
	result.Put("signature", storage.GetDefault("queue_snapshot_signature", ""))
	result.Put("tracks", storage.GetDefault("queue_snapshot_tracks", CreateInitializedList))
	If result.Get("signature") = "" Then
		result.Put("signature", storage.GetDefault("download_plan_signature", ""))
	End If
	Dim tracks As List = result.Get("tracks")
	If tracks.IsInitialized = False Or tracks.Size = 0 Then
		result.Put("tracks", storage.GetDefault("download_plan_tracks", CreateInitializedList))
	End If
	Return result
End Sub

Public Sub ClearQueueSnapshot(storage As KeyValueStore)
	storage.Put("queue_snapshot_tracks", CreateInitializedList)
	storage.Put("queue_snapshot_saved_at", 0)
	storage.Put("queue_snapshot_signature", "")
	storage.Put("download_plan_tracks", CreateInitializedList)
	storage.Put("download_plan_saved_at", 0)
	storage.Put("download_plan_signature", "")
End Sub

' Ищет первый exact break в очереди и сохраняет его timestamp отдельно от остальных queue item.
Public Sub ResolveScheduledBreakAt(queue As List)
	ScheduledBreakAt = -1
	If queue.IsInitialized = False Then Return
	For Each itemObj As Object In queue
		If itemObj Is Map Then
			Dim item As Map = itemObj
			If item.GetDefault("type", "") = "break" And item.GetDefault("exactly", False) = True And item.ContainsKey("at") Then
				ScheduledBreakAt = ToLongDefault(item.Get("at"), -1)
				Exit
			End If
		End If
	Next
End Sub

Public Sub ClearExactBreakState
	ScheduledBreakAt = -1
End Sub

Public Sub HasPendingExactBreak(localNowTimestamp As Long) As Boolean
	Return ScheduledBreakAt > localNowTimestamp
End Sub

Public Sub ShouldTriggerBreakNow(localNowTimestamp As Long) As Boolean
	If ScheduledBreakAt <= 0 Then Return False
	Return localNowTimestamp >= ScheduledBreakAt
End Sub

' Ограничивает оставшееся время трека ближайшим exact break, чтобы director принимал решения по реальному дедлайну.
Public Sub LimitRemainByBreak(trackRemain As Long, localNowTimestamp As Long) As Long
	If ScheduledBreakAt <= 0 Then Return trackRemain
	Dim breakRemain As Long = (ScheduledBreakAt - localNowTimestamp) * 1000
	If trackRemain <= 0 Then Return breakRemain
	Return Min(trackRemain, breakRemain)
End Sub

Private Sub CloneStateMap(source As Map) As Map
	Dim cloned As Map
	cloned.Initialize
	If source.IsInitialized = False Then Return cloned
	For Each key As Object In source.Keys
		cloned.Put(key, source.Get(key))
	Next
	Return cloned
End Sub

Private Sub CreateInitializedList As List
	Dim items As List
	items.Initialize
	Return items
End Sub

Private Sub ToLongDefault(value As Object, defaultValue As Long) As Long
	If value = Null Then Return defaultValue
	Try
		Return value
	Catch
		Return defaultValue
	End Try
End Sub
