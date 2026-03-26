B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10.5
@EndOfDesignText@

' B4A placeholder для общего B4X-кода.
' Позже здесь появится Android-ориентированная стилизация, а пока модуль держит совместимый API.

Sub Process_Globals
End Sub

Public Sub CreateLabel(xui As XUI, text As String, fontSize As Float, textColor As Int, bold As Boolean, wrapText As Boolean) As B4XView
	Dim lbl As Label
	lbl.Initialize("")
	lbl.Text = text
	lbl.SingleLine = Not(wrapText)
	Dim xlbl As B4XView = lbl
	If bold Then
		xlbl.Font = xui.CreateDefaultBoldFont(fontSize)
	Else
		xlbl.Font = xui.CreateDefaultFont(fontSize)
	End If
	xlbl.TextColor = textColor
	xlbl.SetTextAlignment("CENTER", "CENTER")
	Return xlbl
End Sub

Public Sub ApplyMaterialIconFont(xui As XUI, view As B4XView, fontSize As Float)
	view.Font = xui.CreateMaterialIcons(fontSize)
End Sub

Public Sub SetPaneStyle(view As B4XView, style As String)
End Sub

Public Sub SetLabelStyle(view As B4XView, style As String)
End Sub

Public Sub SetPickOnBounds(view As B4XView, value As Boolean)
End Sub

Public Sub ScaleValue(availableWidth As Int, smallValue As Int, mediumValue As Int, largeValue As Int) As Int
	If availableWidth <= 420dip Then Return smallValue
	If availableWidth <= 720dip Then Return mediumValue
	Return largeValue
End Sub

Public Sub ColorToCss(color As Int) As String
	Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, color)
	Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)
	Return "#" & Bit.ToHexString(rgb)
End Sub
