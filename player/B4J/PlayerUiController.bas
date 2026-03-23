B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Presentation helper для player screen.
' Держит текстовый/rendering слой отдельно от orchestration, чтобы B4XMainPage был ближе к composition-root.

Sub Class_Globals
	Private xui As XUI
	Private lblStream As B4XView
	Private lblInfo As B4XView
	Private lblHeader As B4XView
	Private lblConnectionIcon As B4XView
	Private lblHeaderAction As B4XView
	Private lblSetupMessage As B4XView
	Private lblPlayIcon As B4XView
	Private confirmPane As B4XView
	Private btnConfirmYes As B4XView
	Private btnConfirmNo As B4XView
	Private setupPane As B4XView
	Private playerPane As B4XView
	Private headerActionPane As B4XView
	Private btnSetupSubmit As B4XView
	Private txtPlayerCode As TextField
	Private txtPlayerCodeView As B4XView
	Private playButtonPane As B4XView
	Private orbitPane As B4XView
	Private accessCirclePane As B4XView
	Private accessCorePane As B4XView
	Private accessInputPane As B4XView
	Private iconCloudOk As String
	Private iconCloudOff As String
	Private iconCloudDegraded As String
	Private iconMore As String
	Private iconClose As String
	Private iconPlay As String
	Private iconStop As String
	Private playIconBaseSize As Float
	Private stopIconBaseSize As Float
	Private headerActionFontSize As Float
	Private codeFontSize As Float
	Private orbitFadeValue As Double
	Private orbitFadeTarget As Double
End Sub

Public Sub Initialize(xuiValue As XUI, streamLabel As B4XView, infoLabel As B4XView, headerLabel As B4XView, connectionIconLabel As B4XView, headerActionLabel As B4XView, setupMessageLabel As B4XView, playIconLabel As B4XView, confirmPaneValue As B4XView, confirmYesButton As B4XView, confirmNoButton As B4XView, setupPaneValue As B4XView, playerPaneValue As B4XView, headerActionPaneValue As B4XView, playButtonPaneValue As B4XView, orbitPaneValue As B4XView, accessCirclePaneValue As B4XView, accessCorePaneValue As B4XView, accessInputPaneValue As B4XView, setupSubmitButton As B4XView, playerCodeInput As TextField, playerCodeInputView As B4XView, iconCloudOkValue As String, iconCloudOffValue As String, iconCloudDegradedValue As String, iconMoreValue As String, iconCloseValue As String, iconPlayValue As String, iconStopValue As String)
	xui = xuiValue
	lblStream = streamLabel
	lblInfo = infoLabel
	lblHeader = headerLabel
	lblConnectionIcon = connectionIconLabel
	lblHeaderAction = headerActionLabel
	lblSetupMessage = setupMessageLabel
	lblPlayIcon = playIconLabel
	confirmPane = confirmPaneValue
	btnConfirmYes = confirmYesButton
	btnConfirmNo = confirmNoButton
	setupPane = setupPaneValue
	playerPane = playerPaneValue
	headerActionPane = headerActionPaneValue
	playButtonPane = playButtonPaneValue
	orbitPane = orbitPaneValue
	accessCirclePane = accessCirclePaneValue
	accessCorePane = accessCorePaneValue
	accessInputPane = accessInputPaneValue
	btnSetupSubmit = setupSubmitButton
	txtPlayerCode = playerCodeInput
	txtPlayerCodeView = playerCodeInputView
	iconCloudOk = iconCloudOkValue
	iconCloudOff = iconCloudOffValue
	iconCloudDegraded = iconCloudDegradedValue
	iconMore = iconMoreValue
	iconClose = iconCloseValue
	iconPlay = iconPlayValue
	iconStop = iconStopValue
End Sub

' Возвращает player screen в нейтральное stopped-состояние без play/pause orchestration.
Public Sub ApplyStoppedState(idleText As String)
	ShowStream(idleText)
	SetStatusText("")
End Sub

' Скрывает transient UI-блоки и очищает текущий текстовый статус.
Public Sub HideContentBlocks
	HidePin
	SetStreamText("")
	SetStatusText("")
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
End Sub

Public Sub ShowStream(text As String)
	SetStreamText(text)
End Sub

Public Sub ShowMessage(text As String)
	HideContentBlocks
	SetStatusText(text)
End Sub

' Показывает claim prompt без принятия playback-решений.
Public Sub ShowClaimPrompt(text As String)
	HideContentBlocks
	SetStatusText(text)
	confirmPane.Visible = True
End Sub

Public Sub HidePin
	confirmPane.Visible = False
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
End Sub

Public Sub ShowTrackMeta(item As Map)
	Dim parts As List
	parts.Initialize
	If item.GetDefault("set", "") <> "" Then parts.Add(item.Get("set"))
	If item.GetDefault("code", "") <> "" Then parts.Add(item.Get("code"))
	SetStatusText(JoinList(parts, " • "))
End Sub

Public Sub ShowAdMeta(item As Map)
	SetStatusText(item.GetDefault("title", ""))
End Sub

Public Sub SetStreamText(text As String)
	lblStream.Text = text
End Sub

Public Sub SetStatusText(text As String)
	lblInfo.Text = text
End Sub

' Отображает агрегированное состояние connectivity без knowledge о data-policy/retry machine.
Public Sub UpdateConnectionIndicator(mode As String)
	If lblConnectionIcon.IsInitialized = False Then Return
	Dim iconText As String = iconCloudOk
	Dim iconColor As Int = 0xFF747B86
	Select mode
		Case "online"
			iconText = iconCloudOk
			iconColor = 0xFFD0FF71
		Case "offline", "server"
			iconText = iconCloudOff
			iconColor = 0xFFFF6B6B
		Case "degraded"
			iconText = iconCloudDegraded
			iconColor = 0xFFFFD166
		Case "connecting"
			iconText = iconCloudOk
			iconColor = 0xFF8E97A3
	End Select
	lblConnectionIcon.Text = iconText
	UiStyle.SetLabelStyle(lblConnectionIcon, "-fx-alignment: center; -fx-text-fill: " & UiStyle.ColorToCss(iconColor) & ";")
	UiStyle.ApplyMaterialIconFont(xui, lblConnectionIcon, 16)
End Sub

Public Sub RenderPlayerHead(formattedCode As String, title As String)
	If title <> "" Then
		lblHeader.Text = formattedCode & " • " & title.ToUpperCase
	Else
		lblHeader.Text = formattedCode
	End If
End Sub

' Настраивает setup/settings экран без влияния на playback-state.
Public Sub ConfigureSetupScreen(mode As String, formattedPlayerCode As String, messageText As String, setupTitle As String, settingsThanks As String, submitText As String, logoutText As String)
	Dim isSettingsMode As Boolean = mode = "settings"
	headerActionPane.Visible = mode <> "setup"
	If isSettingsMode Then
		lblHeaderAction.Text = iconClose
		txtPlayerCode.Editable = False
		btnSetupSubmit.Text = logoutText.ToUpperCase
	Else
		lblHeaderAction.Text = iconMore
		txtPlayerCode.Editable = True
		btnSetupSubmit.Text = submitText.ToUpperCase
	End If
	txtPlayerCode.Text = formattedPlayerCode
	If messageText <> "" Then
		lblSetupMessage.Text = messageText
	Else If isSettingsMode Then
		lblSetupMessage.Text = settingsThanks
	Else
		lblSetupMessage.Text = setupTitle
	End If
	If formattedPlayerCode = "" Then lblHeader.Text = ""
End Sub

Public Sub ConfigurePlayerHeader
	headerActionPane.Visible = True
	lblHeaderAction.Text = iconMore
End Sub

' Управляет только видимостью pane'ов текущего screen mode.
Public Sub UpdateVisibleMode(mode As String)
	setupPane.Visible = mode <> "player"
	playerPane.Visible = mode = "player"
	If mode = "setup" Then headerActionPane.Visible = False
End Sub

Public Sub UpdateResponsiveStyles(streamFontSize As Float, infoFontSize As Float, playFontSize As Float, stopFontSize As Float, headerActionSizeValue As Float, codeSize As Float, isCodeInputFocused As Boolean, showStopIcon As Boolean)
	playIconBaseSize = playFontSize
	stopIconBaseSize = stopFontSize
	headerActionFontSize = headerActionSizeValue
	codeFontSize = codeSize
	lblStream.Font = xui.CreateDefaultBoldFont(streamFontSize)
	lblInfo.Font = xui.CreateDefaultFont(infoFontSize)
	UiStyle.ApplyMaterialIconFont(xui, lblConnectionIcon, 16)
	UpdateHeaderActionAppearance(False)
	UpdateCodeInputAppearance(isCodeInputFocused)
	If showStopIcon Then
		SetStopIcon
	Else
		SetPlayIcon
	End If
End Sub

Public Sub SetPlayIcon
	UiStyle.SetLabelStyle(lblPlayIcon, "-fx-alignment: center; -fx-text-fill: " & UiStyle.ColorToCss(0xFFD0FF71) & "; -fx-padding: 0;")
	lblPlayIcon.Text = iconPlay
	UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, playIconBaseSize)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x00D0FF71, 999dip)
	StopOrbitAnimation
	UpdatePlayButtonAppearance(False, False)
End Sub

Public Sub SetStopIcon
	UiStyle.SetLabelStyle(lblPlayIcon, "-fx-alignment: center; -fx-text-fill: " & UiStyle.ColorToCss(0xFFD0FF71) & "; -fx-padding: 0;")
	lblPlayIcon.Text = iconStop
	UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, stopIconBaseSize)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x66D0FF71, 999dip)
	StartOrbitAnimation
	UpdatePlayButtonAppearance(False, True)
End Sub

Public Sub UpdatePlayButtonAppearance(isHovered As Boolean, isStarted As Boolean)
	Dim backgroundColor As Int
	Dim borderColor As Int
	Dim orbitBorderColor As Int
	If isStarted Then
		If isHovered Then
			backgroundColor = 0x12FFFFFF
			borderColor = 0x77FFFFFF
		Else
			backgroundColor = 0x08FFFFFF
			borderColor = 0x55FFFFFF
		End If
	Else
		If isHovered Then
			backgroundColor = 0x12FFFFFF
			borderColor = 0x55D0FF71
		Else
			backgroundColor = 0x07FFFFFF
			borderColor = 0x40FFFFFF
		End If
	End If
	If isStarted Or isHovered Then
		orbitBorderColor = 0x66D0FF71
	Else
		orbitBorderColor = 0x22D0FF71
	End If
	playButtonPane.SetColorAndBorder(backgroundColor, 4dip, borderColor, 999dip)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, orbitBorderColor, 999dip)
End Sub

Public Sub StartOrbitAnimation
	orbitFadeTarget = 1
End Sub

Public Sub StopOrbitAnimation
	orbitFadeTarget = 0
	If orbitFadeValue = 0 Then ApplyOrbitState(0)
End Sub

Public Sub AdvanceOrbitFrame(stepIndex As Int, fadeStep As Double) As Boolean
	If orbitFadeValue < orbitFadeTarget Then
		orbitFadeValue = Min(orbitFadeTarget, orbitFadeValue + fadeStep)
	Else If orbitFadeValue > orbitFadeTarget Then
		orbitFadeValue = Max(orbitFadeTarget, orbitFadeValue - fadeStep)
	End If
	ApplyOrbitFrame(stepIndex)
	Return orbitFadeValue = 0 And orbitFadeTarget = 0
End Sub

Public Sub IsOrbitIdle As Boolean
	Return orbitFadeValue = 0 And orbitFadeTarget = 0
End Sub

Public Sub UpdateHeaderActionAppearance(isHovered As Boolean)
	Dim fillColor As Int
	Dim borderColor As Int
	Dim textColor As Int
	If isHovered Then
		fillColor = 0x14FFFFFF
		borderColor = 0x30FFFFFF
		textColor = 0xFFDDE6EF
	Else
		fillColor = 0x08FFFFFF
		borderColor = 0x18FFFFFF
		textColor = 0xFFB9C0C9
	End If
	headerActionPane.SetColorAndBorder(fillColor, 1dip, borderColor, 999dip)
	UiStyle.SetPaneStyle(headerActionPane, "-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;")
	UiStyle.SetLabelStyle(lblHeaderAction, "-fx-alignment: center; -fx-text-fill: " & UiStyle.ColorToCss(textColor) & ";")
	UiStyle.ApplyMaterialIconFont(xui, lblHeaderAction, headerActionFontSize)
End Sub

Public Sub UpdateTextButtonAppearance(buttonView As B4XView, isHovered As Boolean)
	Dim fillColor As Int
	Dim borderColor As Int
	Dim textColor As Int
	If isHovered Then
		fillColor = 0x12FFFFFF
		borderColor = 0x34FFFFFF
		textColor = 0xFFF2F7FB
	Else
		fillColor = 0x06FFFFFF
		borderColor = 0x1EFFFFFF
		textColor = 0xFFE0E4EA
	End If
	buttonView.SetColorAndBorder(fillColor, 1dip, borderColor, 12dip)
	UiStyle.SetPaneStyle(buttonView, "-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: " & UiStyle.ColorToCss(textColor) & ";")
	buttonView.Font = xui.CreateDefaultBoldFont(13)
End Sub

Public Sub UpdateCodeInputAppearance(isFocused As Boolean)
	Dim fillColor As Int
	Dim borderColor As Int
	Dim orbitBorderColor As Int
	If isFocused Then
		fillColor = 0x10FFFFFF
		borderColor = 0x77FFFFFF
		orbitBorderColor = 0x88FFFFFF
	Else
		fillColor = 0x07FFFFFF
		borderColor = 0x55FFFFFF
		orbitBorderColor = 0x66FFFFFF
	End If
	accessCirclePane.SetColorAndBorder(fillColor, 4dip, borderColor, 999dip)
	accessCorePane.SetColorAndBorder(xui.Color_Transparent, 2dip, orbitBorderColor, 999dip)
	accessInputPane.SetColorAndBorder(xui.Color_Transparent, 0, xui.Color_Transparent, 0)
	UiStyle.SetPaneStyle(accessCirclePane, "-fx-background-radius: 999; -fx-border-radius: 999;")
	UiStyle.SetPaneStyle(accessCorePane, "-fx-background-radius: 999; -fx-border-radius: 999;")
	UiStyle.SetPaneStyle(accessInputPane, "-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;")
	UiStyle.SetPaneStyle(txtPlayerCodeView, "-fx-background-color: transparent; -fx-text-fill: " & UiStyle.ColorToCss(0xFFF2F7FB) & "; -fx-prompt-text-fill: " & UiStyle.ColorToCss(0x66FFFFFF) & "; -fx-highlight-fill: transparent; -fx-highlight-text-fill: " & UiStyle.ColorToCss(0xFFF2F7FB) & "; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: " & codeFontSize & "px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;")
End Sub

Public Sub BringToFront(view As B4XView)
	Dim jo As JavaObject = view
	jo.RunMethod("toFront", Null)
End Sub

Private Sub ApplyOrbitFrame(stepIndex As Int)
	Dim opacity As Double
	If orbitFadeValue <= 0 Then
		opacity = 0
	Else
		Dim basePhase As Double = stepIndex / 24
		Dim wave As Double = (Sin(basePhase * cPI * 2) + 1) / 2
		opacity = (0.38 + wave * 0.28) * orbitFadeValue
	End If
	ApplyOrbitState(opacity)
End Sub

Private Sub ApplyOrbitState(opacity As Double)
	Dim jo As JavaObject = orbitPane
	jo.RunMethod("setOpacity", Array As Object(opacity))
End Sub

Private Sub JoinList(items As List, separator As String) As String
	If items.IsInitialized = False Or items.Size = 0 Then Return ""
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To items.Size - 1
		If i > 0 Then sb.Append(separator)
		sb.Append(items.Get(i))
	Next
	Return sb.ToString
End Sub
