B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Legacy compatibility mirror для playback-state.
' В нормальном потоке canonical state живёт в PlaybackDirectorState, а этот класс нужен старым helper/path-веткам.

Sub Class_Globals
	Public ActiveAudioKey As String
	Public PreparedAudioKey As String
	Public ActiveItem As Map
	Public PreparedItem As Map
	Public PendingPlayAudioKey As String
	Public PendingPrepareAudioKey As String
	Public PendingPlayItem As Map
	Public PendingPrepareItem As Map
	Public PendingPlayFadeInMs As Int
End Sub

Public Sub Initialize
	Reset
End Sub

' Полный сброс legacy snapshot-состояния.
Public Sub Reset
	ActiveAudioKey = ""
	PreparedAudioKey = ""
	PendingPlayAudioKey = ""
	PendingPrepareAudioKey = ""
	PendingPlayFadeInMs = 0
	ActiveItem.Initialize
	PreparedItem.Initialize
	PendingPlayItem.Initialize
	PendingPrepareItem.Initialize
End Sub

Public Sub ClearPendingPlayState
	PendingPlayAudioKey = ""
	PendingPlayFadeInMs = 0
	PendingPlayItem.Initialize
End Sub

Public Sub ClearPendingPrepareState
	PendingPrepareAudioKey = ""
	PendingPrepareItem.Initialize
End Sub

' Compatibility setter для active item; в новой модели это зеркало director active slot.
Public Sub SetActive(audioKey As String, item As Map)
	ActiveAudioKey = audioKey
	ActiveItem = CloneStateMap(item)
End Sub

' Compatibility setter для prepared item; в новой модели это зеркало director prepared slot.
Public Sub SetPrepared(audioKey As String, item As Map)
	PreparedAudioKey = audioKey
	PreparedItem = CloneStateMap(item)
End Sub

Public Sub SetPendingPlay(audioKey As String, item As Map, fadeInMs As Int)
	PendingPlayAudioKey = audioKey
	PendingPlayItem = CloneStateMap(item)
	PendingPlayFadeInMs = fadeInMs
End Sub

Public Sub SetPendingPrepare(audioKey As String, item As Map)
	PendingPrepareAudioKey = audioKey
	PendingPrepareItem = CloneStateMap(item)
End Sub

Public Sub ClearPreparedIfMatchesAudio(audioKey As String)
	If PreparedAudioKey <> audioKey Then Return
	PreparedAudioKey = ""
	PreparedItem.Initialize
End Sub

Public Sub HasPrepared As Boolean
	Return PreparedAudioKey <> "" And PreparedItem.IsInitialized
End Sub

Public Sub HasPendingPlay As Boolean
	Return PendingPlayAudioKey <> "" And PendingPlayItem.IsInitialized
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
