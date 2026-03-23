B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Логический слот director-модели.
' Хранит роль плеера, текущее состояние слота и последний подтвержденный progress.

Sub Class_Globals
	Public SlotId As String
	Public AudioKey As String
	Public Role As String
	Public State As String
	Public Item As Map
	Public LastProgressAt As Long
	Public LastStateChangedAt As Long
End Sub

Public Sub Initialize(slotIdValue As String, audioKeyValue As String)
	SlotId = slotIdValue
	AudioKey = audioKeyValue
	Reset
End Sub

' Сбрасывает слот в свободное состояние без привязки к media item.
Public Sub Reset
	Role = "free"
	State = "empty"
	LastProgressAt = 0
	LastStateChangedAt = DateTime.Now
	Item.Initialize
End Sub

Public Sub SetRoleState(roleValue As String, stateValue As String)
	Role = roleValue
	State = stateValue
	LastStateChangedAt = DateTime.Now
End Sub

' Копирует item в слот, чтобы director не зависел от внешней mutable Map.
Public Sub SetItem(sourceItem As Map)
	Item = CloneStateMap(sourceItem)
	LastStateChangedAt = DateTime.Now
End Sub

Public Sub ClearItem
	Item.Initialize
	LastStateChangedAt = DateTime.Now
End Sub

' Отмечает, что слот подтвердил реальное движение playback/готовности.
Public Sub MarkProgress
	LastProgressAt = DateTime.Now
End Sub

Public Sub HasItem As Boolean
	Return Item.IsInitialized And Item.Size > 0
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
