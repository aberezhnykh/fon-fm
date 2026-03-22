B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Public CurrentMediaUrl As String
	Public CurrentMediaType As String
	Public PendingHistoryItem As Map
	Public HistoryStartedAtTicks As Long
End Sub

Public Sub Initialize
	Reset
End Sub

Public Sub Reset
	CurrentMediaUrl = ""
	CurrentMediaType = ""
	HistoryStartedAtTicks = 0
	PendingHistoryItem.Initialize
End Sub

Public Sub SetCurrentMedia(mediaUrl As String, mediaType As String)
	CurrentMediaUrl = mediaUrl
	CurrentMediaType = mediaType
End Sub

Public Sub StageHistoryItem(item As Map, startedAtTicks As Long)
	PendingHistoryItem = CloneStateMap(item)
	HistoryStartedAtTicks = startedAtTicks
End Sub

Public Sub ClearHistoryStage
	PendingHistoryItem.Initialize
	HistoryStartedAtTicks = 0
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
