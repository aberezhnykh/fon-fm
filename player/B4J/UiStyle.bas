B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10.5
@EndOfDesignText@

Sub Process_Globals
End Sub

Public Sub CreateLabel(xui As XUI, text As String, fontSize As Float, textColor As Int, bold As Boolean, wrapText As Boolean) As B4XView
	Dim lbl As Label
	lbl.Initialize("")
	lbl.Text = text
	lbl.WrapText = wrapText
	Dim xlbl As B4XView = lbl
	If bold Then
		xlbl.Font = xui.CreateDefaultBoldFont(fontSize)
	Else
		xlbl.Font = xui.CreateDefaultFont(fontSize)
	End If
	xlbl.SetTextAlignment("CENTER", "CENTER")
	SetLabelStyle(xlbl, "-fx-alignment: center; -fx-text-fill: " & ColorToCss(textColor) & ";")
	SetMouseTransparent(xlbl, True)
	Return xlbl
End Sub

Public Sub ApplyMaterialIconFont(xui As XUI, view As B4XView, fontSize As Float)
	view.Font = xui.CreateMaterialIcons(fontSize)
End Sub

Public Sub SetPaneStyle(view As B4XView, style As String)
	Dim jo As JavaObject = view
	jo.RunMethod("setStyle", Array(MergeNodeStyle(jo.RunMethod("getStyle", Null), style)))
End Sub

Public Sub SetLabelStyle(view As B4XView, style As String)
	Dim jo As JavaObject = view
	jo.RunMethod("setStyle", Array(MergeNodeStyle(jo.RunMethod("getStyle", Null), style)))
End Sub

Public Sub SetMouseTransparent(view As B4XView, value As Boolean)
	Dim jo As JavaObject = view
	jo.RunMethod("setMouseTransparent", Array(value))
End Sub

Public Sub SetPickOnBounds(view As B4XView, value As Boolean)
	Dim jo As JavaObject = view
	jo.RunMethod("setPickOnBounds", Array(value))
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

Private Sub MergeNodeStyle(currentStyle As String, extraStyle As String) As String
	If currentStyle = Null Or currentStyle.Trim = "" Then Return extraStyle
	If extraStyle = Null Or extraStyle.Trim = "" Then Return currentStyle
	If currentStyle.EndsWith(";") Then
		Return currentStyle & " " & extraStyle
	Else
		Return currentStyle & "; " & extraStyle
	End If
End Sub
