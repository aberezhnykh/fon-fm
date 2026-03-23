B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Нормализует сетевые ответы playback API в простые структуры, удобные для orchestration-слоя.

Sub Class_Globals
End Sub

Public Sub Initialize
End Sub

' Извлекает и очищает queue list из server response.
Public Sub NormalizeQueueResponse(data As Object) As List
	If data Is Map Then
		Dim m As Map = data
		Dim items As List = m.GetDefault("queue", Null)
		If items.IsInitialized = False Then Return Null
		Dim normalized As List
		normalized.Initialize
		For Each item As Object In items
			If item Is Map Then normalized.Add(item)
		Next
		Return normalized
	End If
	Return Null
End Sub

' Безопасно вытаскивает retry_after, если сервер временно просит не дёргать next/data слишком часто.
Public Sub NormalizeRetryAfter(data As Object) As Int
	If data Is Map Then
		Dim m As Map = data
		If m.ContainsKey("retry_after") = False Then Return 0
		Dim value As Int = m.Get("retry_after")
		If value <= 0 Then Return 0
		Return value
	End If
	Return 0
End Sub
