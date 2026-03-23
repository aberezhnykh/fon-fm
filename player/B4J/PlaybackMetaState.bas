B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Метаданные текущего воспроизведения и staging истории.
' Не управляет переходами, а хранит факты о текущем media item и pending history record.

Sub Class_Globals
	Public CurrentMediaUrl As String
	Public CurrentMediaType As String
	Public PendingHistoryItem As Map
	Public HistoryStartedAtTicks As Long
End Sub

Public Sub Initialize
	Reset
End Sub

' Сбрасывает текущий media context и staged history.
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

' Готовит history item к подтверждению после реального старта playback.
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
