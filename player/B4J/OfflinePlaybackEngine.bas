B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Простое офлайн-ядро playback.
' Музыка живет отдельно от service queue: сначала prepared/service items, затем direct local music.

Sub Class_Globals
End Sub

Public Sub Initialize
End Sub

Public Sub ResolveAdvanceDecision(shouldPrioritizeServiceQueue As Boolean, canUsePreparedItem As Boolean, hasDispatchableServiceItem As Boolean, hasLocalReserve As Boolean, allowLoad As Boolean) As Map
	Dim result As Map
	result.Initialize
	result.Put("action", "")
	If shouldPrioritizeServiceQueue Then
		result.Put("action", "play_queue_item")
		Return result
	End If
	If canUsePreparedItem Then
		result.Put("action", "use_prepared")
		Return result
	End If
	If hasDispatchableServiceItem Then
		result.Put("action", "play_queue_item")
		Return result
	End If
	If hasLocalReserve Then
		result.Put("action", "play_direct_local")
		Return result
	End If
	If allowLoad Then result.Put("action", "populate_queue")
	Return result
End Sub

Public Sub ResolveNextMusicItem(stateStore As PlayerStateStore) As Map
	Return stateStore.ResolveNextLocalTrackItem
End Sub
