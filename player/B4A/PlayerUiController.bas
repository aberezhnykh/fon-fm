B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' B4A placeholder для общего orchestration-кода.
' Реальная Android UI-реализация будет добавлена после ревизии общего B4XMainPage.

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
	Private txtPlayerCode As EditText
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
	Private initializedValue As Boolean
	Private orbitIdleValue As Boolean = True
	Private playIconBaseSize As Float
	Private stopIconBaseSize As Float
	Private headerActionFontSize As Float
End Sub

Public Sub Initialize(xuiValue As XUI, streamLabel As B4XView, infoLabel As B4XView, headerLabel As B4XView, connectionIconLabel As B4XView, headerActionLabel As B4XView, setupMessageLabel As B4XView, playIconLabel As B4XView, confirmPaneValue As B4XView, confirmYesButton As B4XView, confirmNoButton As B4XView, setupPaneValue As B4XView, playerPaneValue As B4XView, headerActionPaneValue As B4XView, playButtonPaneValue As B4XView, orbitPaneValue As B4XView, accessCirclePaneValue As B4XView, accessCorePaneValue As B4XView, accessInputPaneValue As B4XView, setupSubmitButton As B4XView, playerCodeInput As EditText, playerCodeInputView As B4XView, iconCloudOkValue As String, iconCloudOffValue As String, iconCloudDegradedValue As String, iconMoreValue As String, iconCloseValue As String, iconPlayValue As String, iconStopValue As String)
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
	If txtPlayerCode.IsInitialized Then
		txtPlayerCode.Gravity = 17
		txtPlayerCode.SingleLine = True
	End If
	initializedValue = True
End Sub

Public Sub IsInitialized As Boolean
	Return initializedValue
End Sub

Public Sub IsOrbitIdle As Boolean
	Return orbitIdleValue
End Sub

Public Sub UpdateResponsiveStyles(streamFontSize As Float, infoFontSize As Float, playFontSize As Float, stopFontSize As Float, headerActionSizeValue As Float, codeSize As Float, isCodeInputFocused As Boolean, showStopIcon As Boolean)
	playIconBaseSize = playFontSize
	stopIconBaseSize = stopFontSize
	headerActionFontSize = headerActionSizeValue
	lblStream.Font = xui.CreateDefaultBoldFont(streamFontSize)
	lblInfo.Font = xui.CreateDefaultFont(infoFontSize)
	lblHeader.Font = xui.CreateDefaultFont(12)
	lblSetupMessage.Font = xui.CreateDefaultFont(infoFontSize)
	txtPlayerCode.TextSize = codeSize
	lblConnectionIcon.TextColor = 0xFF747B86
	UpdateHeaderActionAppearance(False)
	UpdateCodeInputAppearance(isCodeInputFocused)
	If showStopIcon Then
		SetStopIcon
	Else
		SetPlayIcon
	End If
End Sub

Public Sub SetStatusText(text As String)
	lblInfo.Text = text
End Sub

Public Sub RenderPlayerHead(formattedCode As String, title As String)
	If title <> "" Then
		lblHeader.Text = formattedCode & " • " & title
	Else
		lblHeader.Text = formattedCode
	End If
End Sub

Public Sub ConfigureSetupScreen(mode As String, formattedPlayerCode As String, messageText As String, setupTitle As String, settingsThanks As String, submitText As String, logoutText As String)
	Dim isSettingsMode As Boolean = mode = "settings"
	headerActionPane.Visible = mode <> "setup"
	If isSettingsMode Then
		lblHeaderAction.Text = iconClose
		txtPlayerCode.Enabled = False
		btnSetupSubmit.Text = logoutText.ToUpperCase
	Else
		lblHeaderAction.Text = iconMore
		txtPlayerCode.Enabled = True
		btnSetupSubmit.Text = submitText.ToUpperCase
	End If
	txtPlayerCode.Text = formattedPlayerCode
	SetPlayerCodeSelectionToEnd
	If messageText <> "" Then
		lblSetupMessage.Text = messageText
	Else If isSettingsMode Then
		lblSetupMessage.Text = settingsThanks
	Else
		lblSetupMessage.Text = setupTitle
	End If
	UpdateTextButtonAppearance(btnSetupSubmit, False)
	If formattedPlayerCode = "" Then lblHeader.Text = ""
End Sub

Public Sub ConfigurePlayerHeader
	headerActionPane.Visible = True
	lblHeaderAction.Text = iconMore
End Sub

Public Sub UpdateVisibleMode(mode As String)
	setupPane.Visible = mode <> "player"
	playerPane.Visible = mode = "player"
	If mode = "setup" Then headerActionPane.Visible = False
End Sub

Public Sub SetPlayIcon
	orbitIdleValue = True
	lblPlayIcon.Text = iconPlay
	lblPlayIcon.Font = xui.CreateMaterialIcons(Max(36, playIconBaseSize))
	lblPlayIcon.TextColor = 0xFFD0FF71
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x00D0FF71, 999dip)
	UpdatePlayButtonAppearance(False, False)
End Sub

Public Sub SetStopIcon
	orbitIdleValue = False
	lblPlayIcon.Text = iconStop
	lblPlayIcon.Font = xui.CreateMaterialIcons(Max(34, stopIconBaseSize))
	lblPlayIcon.TextColor = 0xFFD0FF71
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x66D0FF71, 999dip)
	UpdatePlayButtonAppearance(False, True)
End Sub

Public Sub UpdatePlayButtonAppearance(isHovered As Boolean, isStarted As Boolean)
	Dim backgroundColor As Int
	If isStarted Then
		backgroundColor = 0x14000000
	Else If isHovered Then
		backgroundColor = 0x18000000
	Else
		backgroundColor = 0x10000000
	End If
	playButtonPane.Color = backgroundColor
End Sub

Public Sub AdvanceOrbitFrame(frameStep As Int, fadeStep As Double) As Boolean
	If orbitIdleValue Then Return True
	If (frameStep Mod 2) = 0 Then
		orbitPane.Color = 0x11000000
	Else
		orbitPane.Color = xui.Color_Transparent
	End If
	Return False
End Sub

Public Sub UpdateHeaderActionAppearance(isHovered As Boolean)
	If headerActionPane.IsInitialized = False Then Return
	If isHovered Then
		headerActionPane.SetColorAndBorder(0x18000000, 1dip, 0x24FFFFFF, 999dip)
		lblHeaderAction.TextColor = 0xFFF2F7FB
	Else
		headerActionPane.SetColorAndBorder(0x11000000, 1dip, 0x14FFFFFF, 999dip)
		lblHeaderAction.TextColor = 0xFFB9C0C9
	End If
	lblHeaderAction.Font = xui.CreateMaterialIcons(Max(18, headerActionFontSize))
End Sub

Public Sub UpdateTextButtonAppearance(buttonView As B4XView, isHovered As Boolean)
	If buttonView.IsInitialized = False Then Return
	If isHovered Then
		buttonView.SetColorAndBorder(0x18FFFFFF, 1dip, 0x34FFFFFF, 12dip)
		buttonView.TextColor = 0xFFF2F7FB
	Else
		buttonView.SetColorAndBorder(0x10FFFFFF, 1dip, 0x20FFFFFF, 12dip)
		buttonView.TextColor = 0xFFE0E4EA
	End If
End Sub

Public Sub UpdateCodeInputAppearance(isFocused As Boolean)
	If txtPlayerCode.IsInitialized = False Then Return
	Dim circleBorder As Int
	Dim coreBorder As Int
	If isFocused Then
		circleBorder = 0x77FFFFFF
		coreBorder = 0x88FFFFFF
	Else
		circleBorder = 0x55FFFFFF
		coreBorder = 0x44FFFFFF
	End If
	accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4dip, circleBorder, 999dip)
	accessCorePane.SetColorAndBorder(xui.Color_Transparent, 2dip, coreBorder, 999dip)
	accessInputPane.Color = xui.Color_Transparent
	txtPlayerCode.Color = 0x00FFFFFF
	txtPlayerCode.TextColor = 0xFFF2F7FB
	txtPlayerCode.HintColor = 0x88FFFFFF
	If txtPlayerCodeView.IsInitialized Then
		txtPlayerCodeView.Visible = True
	End If
End Sub

Public Sub BringToFront(view As B4XView)
	view.BringToFront
End Sub

Public Sub ApplyStoppedState(idleText As String)
	ShowStream(idleText)
	SetStatusText("")
End Sub

Public Sub HideContentBlocks
	HidePin
	ShowStream("")
	SetStatusText("")
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
End Sub

Public Sub ShowStream(text As String)
	lblStream.Text = text
End Sub

Public Sub ShowMessage(text As String)
	HideContentBlocks
	SetStatusText(text)
End Sub

Public Sub ShowClaimPrompt(text As String)
	HideContentBlocks
	SetStatusText(text)
	confirmPane.Visible = True
	UpdateTextButtonAppearance(btnConfirmYes, False)
	UpdateTextButtonAppearance(btnConfirmNo, False)
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

Public Sub UpdateConnectionIndicator(mode As String)
	Dim iconText As String = iconCloudOk
	Dim iconColor As Int = 0xFFD0FF71
	Select mode
		Case "online"
			iconText = iconCloudOk
			iconColor = 0xFFD0FF71
		Case "offline", "server"
			iconText = iconCloudOff
			iconColor = 0xFFFF7A7A
		Case "local", "degraded"
			iconText = iconCloudDegraded
			iconColor = 0xFFFFD166
		Case "connecting"
			iconText = iconCloudOk
			iconColor = 0xFF8E97A3
		Case Else
			iconText = iconCloudOk
			iconColor = 0xFFD0FF71
	End Select
	lblConnectionIcon.Text = iconText
	lblConnectionIcon.TextColor = iconColor
	lblConnectionIcon.Font = xui.CreateMaterialIcons(16)
End Sub

Private Sub JoinList(values As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To values.Size - 1
		If i > 0 Then sb.Append(separator)
		sb.Append(values.Get(i))
	Next
	Return sb.ToString
End Sub

Private Sub SetPlayerCodeSelectionToEnd
	If txtPlayerCode.IsInitialized = False Then Return
	Try
		Dim jo As JavaObject = txtPlayerCode
		jo.RunMethod("setSelection", Array As Object(txtPlayerCode.Text.Length))
	Catch
		Log("PlayerUiController.SetPlayerCodeSelectionToEnd: " & LastException.Message)
	End Try
End Sub
