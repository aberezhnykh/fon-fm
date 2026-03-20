B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

Sub Class_Globals
	Private Const PLAYER_BASE_URL As String = "https://play.fon.fm/meta"
	Private Const NEXT_BASE_URL As String = "https://play.fon.fm/next"
	Private Const CLAIM_BASE_URL As String = "https://play.fon.fm/claim"
	Private Const HISTORY_BASE_URL As String = "https://play.fon.fm/history"
	Private Const DATA_BASE_URL As String = "https://play.fon.fm/data.php"
	Private Const PLAYLIST_CDN_BASE_URL As String = "https://cdn.fon.fm/data/playlists/"
	Private Const CONNECTIVITY_CHECK_URL As String = "https://radiosparx.ru/img/logo-dark.svg"
	Private Const APP_VERSION As String = "1.0.1"
	Private Const USE_DATA_PLAYBACK_RESOLVER As Boolean = True
	Private Const ICON_PLAY As String = Chr(0xE037)
	Private Const ICON_STOP As String = Chr(0xE047)
	Private Const ICON_MORE As String = Chr(0xE5D3)
	Private Const ICON_CLOSE As String = Chr(0xE5CD)
	Private Const PREFETCH_SECONDS As Int = 10
	Private Const STOP_FADE_MS As Int = 3000
	Private Const ORBIT_FADE_MS As Int = 3000
	Private Const START_FADE_MS As Int = 1500
	Private Const TRACK_OVERLAP_MS As Int = 1800
	Private Const AD_TAIL_OVERLAP_MS As Int = 350
	Private Const HISTORY_LOG_DELAY_MS As Int = 15000
	Private Const OFFLINE_DATA_REFRESH_MS As Int = 5 * 60 * 1000
	Private Const FETCH_TIMEOUT_MS As Int = 8000
	Private Const CONNECTIVITY_CHECK_TIMEOUT_MS As Int = 5000
	Private Const PAUSE_RETRY_DELAY As Int = 300000
	Private Const OFFLINE_RETRY_DELAY_INITIAL As Int = 5000
	Private Const OFFLINE_RETRY_DELAY_MAX As Int = 30000
	Private Const SERVER_RETRY_DELAY_INITIAL As Int = 10000
	Private Const SERVER_RETRY_DELAY_MAX As Int = 60000
	Private Const BLOCKED_RETRY_DELAY As Int = 60000
	Private rootView As B4XView
	Private xui As XUI
	Private storageDir As String
	Private storageFile As String = "player_state.json"
	Private storageDbName As String = "PlayerState"
	Private offlineDataFile As String = "offline_data.json"
	Private offlinePlaylistRequirementsFile As String = "offline_playlist_requirements.json"
	Private offlinePlaylistsDirName As String = "playlists"
	Private debugResponsesDir As String

	Private card As B4XView
	Private headerPane As B4XView
	Private headerActionPane As B4XView
	Private contentPane As B4XView
	Private footerPane As B4XView
	Private setupPane As B4XView
	Private playerPane As B4XView
	Private setupHeroPane As B4XView
	Private setupDetailPane As B4XView
	Private setupPrimaryPane As B4XView
	Private setupStatusPane As B4XView
	Private playerHeroPane As B4XView
	Private playerDetailPane As B4XView
	Private playerPrimaryPane As B4XView
	Private playerStatusPane As B4XView
	Private orbitPane As B4XView
	Private playButtonPane As B4XView
	Private confirmPane As B4XView
	Private accessCirclePane As B4XView
	Private accessCorePane As B4XView
	Private accessInputPane As B4XView

	Private lblHeader As B4XView
	Private lblHeaderAction As B4XView
	Private lblPlayIcon As B4XView
	Private lblStream As B4XView
	Private lblInfo As B4XView
	Private lblFooter As B4XView
	Private lblSetupMessage As B4XView

	Private txtPlayerCode As TextField
	Private txtPlayerCodeView As B4XView
	Private btnSetupSubmit As B4XView
	Private btnConfirmYes As B4XView
	Private btnConfirmNo As B4XView
	Private playIconBaseSize As Float
	Private stopIconBaseSize As Float
	Private headerActionFontSize As Float
	Private codeFontSize As Float
	Private isCodeInputFocused As Boolean

	Private audioPrimary As AudioPlayer
	Private audioSecondary As AudioPlayer
	Private storage As KeyValueStore
	Private playQueue As List
	Private messages As Map
	Private traceLogs As List
	Private traceLogLimit As Int = 1000
	Private serverSnapshots As List
	Private serverSnapshotLimit As Int = 30
	Private offlineData As Map

	Private retryTimer As Timer
	Private breakTimer As Timer
	Private historyTimer As Timer
	Private orbitTimer As Timer
	Private offlineDataRefreshTimer As Timer
	Private machineGuidShell As Shell

	Private playerCode As String
	Private deviceId As String
	Private appScreenMode As String
	Private nextStartMode As String
	Private currentTrackUrl As String
	Private currentMediaType As String
	Private activeAudioKey As String
	Private preparedAudioKey As String
	Private historyItem As Map
	Private activeItem As Map
	Private preparedItem As Map
	Private pendingPlayAudioKey As String
	Private pendingPrepareAudioKey As String
	Private pendingPlayItem As Map
	Private pendingPrepareItem As Map
	Private pendingPlayFadeInMs As Int
	Private historyStartedAtTicks As Long
	Private initialStartFadePending As Boolean

	Private isStarted As Boolean
	Private isStoppedByUser As Boolean = True
	Private isStopping As Boolean
	Private isQueueTransitioning As Boolean
	Private prefetchDone As Boolean
	Private isCrossfadeTriggered As Boolean

	Private offlineRetryDelay As Int = OFFLINE_RETRY_DELAY_INITIAL
	Private serverRetryDelay As Int = SERVER_RETRY_DELAY_INITIAL
	Private playlistIndex As Int = -1
	Private scheduledBreakAt As Long = -1
	Private orbitPulseStep As Int
	Private orbitFadeValue As Double
	Private orbitFadeTarget As Double
	Private offlineDataUpdatedAt As Long
	Private isOfflineDataRefreshInProgress As Boolean
	Private recentResolvedTrackIds As List
	Private dataSlotPlaylistCursors As Map
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (root1 As B4XView)
	rootView = root1
	rootView.Color = 0xFF0E0F11
	InitSettings
	InitState
	BuildUi
	RestoreWindowState
	audioPrimary.Initialize("AudioPrimary", Me)
	audioSecondary.Initialize("AudioSecondary", Me)
	TraceLog("Приложение запущено. Версия=" & APP_VERSION & ", код плеера=" & FormatPlayerCodeForDisplay(playerCode) & ", deviceId=" & deviceId)
	StartOfflineDataRefresh
	ShowInitialScreen
End Sub

Private Sub B4XPage_Resize (width As Int, height As Int)
	If card.IsInitialized = False Then Return
	LayoutUi(width, height)
End Sub

Private Sub InitSettings
	DateTime.DateFormat = "dd.MM.yyyy"
	DateTime.TimeFormat = "HH:mm:ss"
	messages.Initialize
	messages.Put("offline", "Требуется интернет")
	messages.Put("server_wait", "Временная остановка")
	messages.Put("idle", "Перерыв...")
	messages.Put("idle_until", "Перерыв до {time}")
	messages.Put("blocked", "Плеер заблокирован")
	messages.Put("idle_stream", "Запусти поток")
	messages.Put("player_required", "Не указан плеер")
	messages.Put("device_required", "Не указано устройство")
	messages.Put("device_busy", "Плеер играет на другом устройстве. Играть здесь?")
	messages.Put("device_confirm_yes", "Да")
	messages.Put("device_confirm_no", "Нет")
	messages.Put("not_found", "Плеер не найден")
	messages.Put("player_updated", "Плеер обновлен")
	messages.Put("player_reloading", "Обновление…")
	messages.Put("ad_label", "Реклама")
	messages.Put("setup_title", "Введите код плеера")
	messages.Put("setup_placeholder", "abc12")
	messages.Put("setup_submit", "Войти")
	messages.Put("setup_invalid", "Введите код из 5 символов")
	messages.Put("logout", "Выйти")
	messages.Put("settings_open", "Настройки")
	messages.Put("settings_close", "Закрыть")
	messages.Put("settings_thanks", "Спасибо!")
End Sub

Private Sub InitState
	storageDir = File.DirData("fonfm")
	debugResponsesDir = File.Combine(storageDir, "debugresponses")
	EnsureDirectory(storageDir)
	storage.Initialize(storageDir, storageDbName)
	MigrateLegacyStorageIfNeeded
	playerCode = NormalizePlayerCode(storage.GetDefault("player_code", ""))
	traceLogs.Initialize
	serverSnapshots.Initialize
	offlineData.Initialize
	playQueue.Initialize
	recentResolvedTrackIds.Initialize
	dataSlotPlaylistCursors.Initialize
	deviceId = GetOrCreateDeviceId
	retryTimer.Initialize("RetryTimer", SERVER_RETRY_DELAY_INITIAL)
	breakTimer.Initialize("BreakTimer", 1000)
	historyTimer.Initialize("HistoryTimer", HISTORY_LOG_DELAY_MS)
	orbitTimer.Initialize("OrbitTimer", 70)
	offlineDataRefreshTimer.Initialize("OfflineDataRefreshTimer", OFFLINE_DATA_REFRESH_MS)
	historyItem.Initialize
	historyStartedAtTicks = 0
	activeItem.Initialize
	preparedItem.Initialize
	activeAudioKey = ""
	preparedAudioKey = ""
	pendingPlayAudioKey = ""
	pendingPrepareAudioKey = ""
	offlineDataUpdatedAt = storage.GetDefault("offline_data_updated_at", 0)
	offlineData = LoadOfflineData
	ResolveMachineGuidAsync
	TraceLog("Состояние инициализировано. Папка=" & storageDir & ", сохраненный код=" & FormatPlayerCodeForDisplay(playerCode))
End Sub

Private Sub BuildUi
	card = xui.CreatePanel("")
	headerPane = xui.CreatePanel("")
	headerActionPane = xui.CreatePanel("HeaderActionPane")
	contentPane = xui.CreatePanel("")
	footerPane = xui.CreatePanel("")
	setupPane = xui.CreatePanel("")
	playerPane = xui.CreatePanel("")
	setupHeroPane = xui.CreatePanel("")
	setupDetailPane = xui.CreatePanel("")
	setupPrimaryPane = xui.CreatePanel("")
	setupStatusPane = xui.CreatePanel("")
	playerHeroPane = xui.CreatePanel("")
	playerDetailPane = xui.CreatePanel("")
	playerPrimaryPane = xui.CreatePanel("")
	playerStatusPane = xui.CreatePanel("")
	orbitPane = xui.CreatePanel("")
	playButtonPane = xui.CreatePanel("PlayButtonPane")
	confirmPane = xui.CreatePanel("")
	accessCirclePane = xui.CreatePanel("")
	accessCorePane = xui.CreatePanel("")
	accessInputPane = xui.CreatePanel("")

	card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFFFF, 24dip)
	accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4dip, 0x55FFFFFF, 999dip)
	accessCorePane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x66FFFFFF, 999dip)
	accessInputPane.SetColorAndBorder(xui.Color_Transparent, 0, xui.Color_Transparent, 999dip)
	playButtonPane.SetColorAndBorder(xui.Color_Transparent, 4dip, 0x33FFFFFF, 999dip)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x00D0FF71, 999dip)
	headerActionPane.SetColorAndBorder(xui.Color_Transparent, 0, xui.Color_Transparent, 999dip)

	lblHeader = CreateLabel("", 12, 0xFF747B86, False, True)
	lblHeaderAction = CreateLabel(ICON_MORE, 22, 0xFFB9C0C9, False, False)
	lblPlayIcon = CreateLabel(ICON_PLAY, 48, 0xFFD0FF71, False, False)
	lblStream = CreateLabel("", 36, 0xFFD0FF71, True, True)
	lblInfo = CreateLabel("", 17, 0xFFBCC3CD, False, True)
	lblFooter = CreateLabel("FON.FM APP " & APP_VERSION, 12, 0xFF747B86, False, True)
	lblSetupMessage = CreateLabel("", 17, 0xFFBCC3CD, False, True)

	txtPlayerCode.Initialize("txtPlayerCode")
	txtPlayerCodeView = txtPlayerCode
	btnSetupSubmit = CreateTextButton(MessageValue("setup_submit"), "BtnSetupSubmit")
	btnConfirmYes = CreateTextButton(MessageValue("device_confirm_yes"), "BtnConfirmYes")
	btnConfirmNo = CreateTextButton(MessageValue("device_confirm_no"), "BtnConfirmNo")
	UpdateTextButtonAppearance(btnSetupSubmit, False)
	UpdateTextButtonAppearance(btnConfirmYes, False)
	UpdateTextButtonAppearance(btnConfirmNo, False)

	rootView.AddView(card, 0, 0, 0, 0)
	card.AddView(headerPane, 0, 0, 0, 0)
	card.AddView(contentPane, 0, 0, 0, 0)
	card.AddView(footerPane, 0, 0, 0, 0)
	headerPane.AddView(lblHeader, 0, 0, 0, 0)
	headerPane.AddView(headerActionPane, 0, 0, 0, 0)
	headerActionPane.AddView(lblHeaderAction, 0, 0, 0, 0)
	contentPane.AddView(setupPane, 0, 0, 0, 0)
	contentPane.AddView(playerPane, 0, 0, 0, 0)
	footerPane.AddView(lblFooter, 0, 0, 0, 0)

	setupPane.AddView(setupHeroPane, 0, 0, 0, 0)
	setupPane.AddView(setupDetailPane, 0, 0, 0, 0)
	setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)
	setupHeroPane.AddView(accessCirclePane, 0, 0, 0, 0)
	accessCirclePane.AddView(accessInputPane, 0, 0, 0, 0)
	accessInputPane.AddView(txtPlayerCodeView, 0, 0, 0, 0)
	setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0, 0)
	setupDetailPane.AddView(setupStatusPane, 0, 0, 0, 0)
	setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0, 0)
	setupStatusPane.AddView(lblSetupMessage, 0, 0, 0, 0)

	playerPane.AddView(playerHeroPane, 0, 0, 0, 0)
	playerPane.AddView(playerDetailPane, 0, 0, 0, 0)
	playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)
	playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0)
	playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)
	playerDetailPane.AddView(playerPrimaryPane, 0, 0, 0, 0)
	playerDetailPane.AddView(playerStatusPane, 0, 0, 0, 0)
	playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)
	playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)
	playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)
	confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)
	confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)

	SetPaneStyle(card, "-fx-background-radius: 24; -fx-border-radius: 24;")
	SetPaneStyle(headerActionPane, "-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;")
	SetPaneStyle(playButtonPane, "-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;")
	SetPaneStyle(accessCirclePane, "-fx-background-radius: 999; -fx-border-radius: 999;")
	SetPaneStyle(accessCorePane, "-fx-background-radius: 999; -fx-border-radius: 999;")
	SetPaneStyle(accessInputPane, "-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;")
	SetPaneStyle(txtPlayerCodeView, "-fx-background-color: transparent; -fx-text-fill: " & ColorToCss(0xFFDDF1FF) & "; -fx-prompt-text-fill: " & ColorToCss(0x7AFFFFFF) & "; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;")
	accessCorePane.Visible = True
	accessCirclePane.Visible = True
	accessInputPane.Visible = True
	SetPickOnBounds(headerActionPane, True)
	SetPickOnBounds(playButtonPane, True)
	txtPlayerCode.PromptText = MessageValue("setup_placeholder").ToUpperCase
	txtPlayerCode.Visible = True
	UpdateHeaderActionAppearance(False)
	UpdatePlayButtonAppearance(False)
	UpdateCodeInputAppearance(False)
	BringToFront(accessCorePane)
	BringToFront(accessCirclePane)
	BringToFront(accessInputPane)
	BringToFront(txtPlayerCodeView)

	confirmPane.Visible = False
	LayoutUi(rootView.Width, rootView.Height)
End Sub

Private Sub LayoutUi(width As Int, height As Int)
	Dim safeWidth As Int = Max(width, 320dip)
	Dim safeHeight As Int = Max(height, 420dip)
	Dim outerPad As Int = ScaleValue(safeWidth, 12dip, 20dip, 20dip)
	Dim horizontalPad As Int = ScaleValue(safeWidth, 12dip, 16dip, 24dip)
	Dim sectionGap As Int = ScaleValue(safeWidth, 24dip, 32dip, 48dip)
	Dim contentGap As Int = ScaleValue(safeWidth, 8dip, 12dip, 12dip)
	Dim headerHeight As Int = ScaleValue(safeWidth, 56dip, 64dip, 72dip)
	Dim footerHeight As Int = headerHeight
	Dim cardWidth As Int = Min(620dip, safeWidth - outerPad * 2)
	Dim preferredHeight As Int = Max(400dip, safeHeight - outerPad * 2)
	Dim cardHeight As Int = Min(preferredHeight, safeHeight - 8dip)
	Dim cardLeft As Int = (safeWidth - cardWidth) / 2
	Dim cardTop As Int = (safeHeight - cardHeight) / 2

	card.SetLayoutAnimated(0, cardLeft, cardTop, cardWidth, cardHeight)
	headerPane.SetLayoutAnimated(0, 0, 0, cardWidth, headerHeight)
	contentPane.SetLayoutAnimated(0, 0, headerHeight + sectionGap / 2, cardWidth, cardHeight - headerHeight - footerHeight - sectionGap)
	footerPane.SetLayoutAnimated(0, 0, cardHeight - footerHeight, cardWidth, footerHeight)

	Dim headerActionSize As Int = ScaleValue(safeWidth, 36dip, 40dip, 42dip)
	headerActionPane.SetLayoutAnimated(0, cardWidth - horizontalPad - headerActionSize, (headerHeight - headerActionSize) / 2, headerActionSize, headerActionSize)
	lblHeaderAction.SetLayoutAnimated(0, 0, 0, headerActionPane.Width, headerActionPane.Height)
	lblHeader.SetLayoutAnimated(0, horizontalPad + headerActionSize + contentGap, 0, cardWidth - (horizontalPad + headerActionSize + contentGap) * 2, headerHeight)

	setupPane.SetLayoutAnimated(0, 0, 0, contentPane.Width, contentPane.Height)
	playerPane.SetLayoutAnimated(0, 0, 0, contentPane.Width, contentPane.Height)

	Dim contentHeight As Int = contentPane.Height
	Dim heroHeight As Int = Max(160dip, (contentHeight - sectionGap) / 2)
	Dim detailHeight As Int = Max(120dip, contentHeight - heroHeight - sectionGap)
	Dim contentWidth As Int = cardWidth - horizontalPad * 2

	setupHeroPane.SetLayoutAnimated(0, horizontalPad, 0, contentWidth, heroHeight)
	setupDetailPane.SetLayoutAnimated(0, horizontalPad, heroHeight + sectionGap, contentWidth, detailHeight)
	playerHeroPane.SetLayoutAnimated(0, horizontalPad, 0, contentWidth, heroHeight)
	playerDetailPane.SetLayoutAnimated(0, horizontalPad, heroHeight + sectionGap, contentWidth, detailHeight)

	Dim controlSize As Int = ScaleValue(safeWidth, 156dip, 172dip, 182dip)
	Dim inputLeft As Int = (setupHeroPane.Width - controlSize) / 2
	Dim inputTop As Int = Max(0, (setupHeroPane.Height - controlSize) / 2)
	Dim accessOrbitSize As Int = controlSize + 20dip
	accessCorePane.SetLayoutAnimated(0, inputLeft - 10dip, inputTop - 10dip, accessOrbitSize, accessOrbitSize)
	accessCirclePane.SetLayoutAnimated(0, inputLeft, inputTop, controlSize, controlSize)
	Dim inputPaneWidth As Int = controlSize - 34dip
	Dim inputPaneHeight As Int = Min(72dip, controlSize - 62dip)
	Dim inputPaneLeft As Int = (controlSize - inputPaneWidth) / 2
	Dim inputPaneTop As Int = (controlSize - inputPaneHeight) / 2
	accessInputPane.SetLayoutAnimated(0, inputPaneLeft, inputPaneTop, inputPaneWidth, inputPaneHeight)
	Dim codeFieldHeight As Int = inputPaneHeight
	txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inputPaneWidth, codeFieldHeight)

	Dim orbitSize As Int = controlSize + 20dip
	Dim orbitLeft As Int = (playerHeroPane.Width - orbitSize) / 2
	Dim controlLeft As Int = (playerHeroPane.Width - controlSize) / 2
	Dim controlTop As Int = Max(0, (playerHeroPane.Height - controlSize) / 2)
	orbitPane.SetLayoutAnimated(0, orbitLeft, controlTop - 10dip, orbitSize, orbitSize)
	playButtonPane.SetLayoutAnimated(0, controlLeft, controlTop, controlSize, controlSize)
	lblPlayIcon.SetLayoutAnimated(0, 0, 1dip, controlSize, controlSize)

	setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setupDetailPane.Width, Max(56dip, setupDetailPane.Height * 0.38))
	setupStatusPane.SetLayoutAnimated(0, 0, setupPrimaryPane.Height + contentGap, setupDetailPane.Width, setupDetailPane.Height - setupPrimaryPane.Height - contentGap)
	btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setupPrimaryPane.Width - 132dip) / 2), Max(0, (setupPrimaryPane.Height - 44dip) / 2), 132dip, 44dip)
	lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupStatusPane.Width, setupStatusPane.Height)

	playerPrimaryPane.SetLayoutAnimated(0, 0, 0, playerDetailPane.Width, Max(56dip, playerDetailPane.Height * 0.4))
	playerStatusPane.SetLayoutAnimated(0, 0, playerPrimaryPane.Height + contentGap, playerDetailPane.Width, playerDetailPane.Height - playerPrimaryPane.Height - contentGap)
	lblStream.SetLayoutAnimated(0, 0, 0, playerPrimaryPane.Width, playerPrimaryPane.Height)
	Dim infoHeight As Int = Max(54dip, playerStatusPane.Height - ConfirmReservedHeight)
	lblInfo.SetLayoutAnimated(0, 0, 0, playerStatusPane.Width, infoHeight)
	If confirmPane.Visible Then
		confirmPane.SetLayoutAnimated(0, 0, playerStatusPane.Height - 72dip, playerStatusPane.Width, 72dip)
	Else
		confirmPane.SetLayoutAnimated(0, 0, playerStatusPane.Height, playerStatusPane.Width, 0)
	End If
	btnConfirmYes.SetLayoutAnimated(0, Max(0, (confirmPane.Width - 236dip) / 2), 14dip, 112dip, 44dip)
	btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.Left + 124dip, 14dip, 112dip, 44dip)

	lblFooter.SetLayoutAnimated(0, horizontalPad, 0, cardWidth - horizontalPad * 2, footerHeight)
	UpdateResponsiveStyles(safeWidth)
	UpdateVisibleMode
End Sub

Private Sub ConfirmReservedHeight As Int
	If confirmPane.Visible Then Return 84dip
	Return 0
End Sub

Private Sub UpdateResponsiveStyles(availableWidth As Int)
	Dim small As Boolean = availableWidth <= 420dip
	Dim medium As Boolean = availableWidth <= 720dip
	Dim streamFontSize As Float
	Dim infoFontSize As Float
	Dim playFontSize As Float
	Dim stopFontSize As Float
	Dim headerActionSize As Float
	Dim codeSize As Float
	Dim cardRadius As Int

	If small Then
		streamFontSize = 28
		infoFontSize = 16
		playFontSize = 60
		stopFontSize = 56
		headerActionSize = 24
		codeSize = 31
		cardRadius = 16dip
	Else If medium Then
		streamFontSize = 32
		infoFontSize = 17
		playFontSize = 68
		stopFontSize = 62
		headerActionSize = 26
		codeSize = 35
		cardRadius = 20dip
	Else
		streamFontSize = 38
		infoFontSize = 17
		playFontSize = 74
		stopFontSize = 68
		headerActionSize = 28
		codeSize = 38
		cardRadius = 24dip
	End If

	playIconBaseSize = playFontSize
	stopIconBaseSize = stopFontSize
	headerActionFontSize = headerActionSize
	codeFontSize = codeSize
	lblStream.Font = xui.CreateDefaultBoldFont(streamFontSize)
	lblInfo.Font = xui.CreateDefaultFont(infoFontSize)
	lblHeader.Font = xui.CreateDefaultFont(12)
	lblFooter.Font = xui.CreateDefaultFont(12)
	card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFFFF, cardRadius)
	UpdateHeaderActionAppearance(False)
	UpdateCodeInputAppearance(isCodeInputFocused)
	If isStarted Then
		SetStopIcon
	Else
		SetPlayIcon
	End If
End Sub

Private Sub ShowInitialScreen
	If playerCode = "" Then
		ShowSetupScreen("")
	Else
		ShowPlayerScreen(True)
		CallSubDelayed(Me, "AutoStartSavedPlayer")
	End If
End Sub

Private Sub StartOfflineDataRefresh
	offlineDataRefreshTimer.Enabled = False
	If playerCode = "" Then Return
	CallSubDelayed(Me, "RefreshOfflineDataNowAsync")
	offlineDataRefreshTimer.Interval = OFFLINE_DATA_REFRESH_MS
	offlineDataRefreshTimer.Enabled = True
	TraceLog("Запущено обновление офлайн-метаданных. Интервал=" & OFFLINE_DATA_REFRESH_MS & " ms")
End Sub

Private Sub RefreshOfflineDataNowAsync
	Wait For (RefreshOfflineDataNow) Complete (unused As Boolean)
End Sub

Private Sub OfflineDataRefreshTimer_Tick
	Wait For (RefreshOfflineDataNow) Complete (unused As Boolean)
End Sub

Private Sub RefreshOfflineDataNow As ResumableSub
	If playerCode = "" Then Return False
	If isOfflineDataRefreshInProgress Then Return False
	isOfflineDataRefreshInProgress = True
	TraceLog("Запрос офлайн-метаданных. playerCode=" & FormatPlayerCodeForDisplay(playerCode) & ", deviceId=" & deviceId)
	Wait For (FetchJsonWithTimeout(DATA_BASE_URL & "?" & BuildParams(CreateDataParams), FETCH_TIMEOUT_MS)) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		TraceLog("Не удалось обновить офлайн-метаданные. kind=" & result.GetDefault("Kind", "") & ", message=" & result.GetDefault("ErrorMessage", ""))
		isOfflineDataRefreshInProgress = False
		Return False
	End If
	Dim resultData As Object = result.Get("Data")
	If resultData Is Map Then
		Dim data As Map = resultData
		If data.GetDefault("ok", False) = True And data.GetDefault("type", "") = "data" Then
			SaveOfflineData(data)
			Wait For (SyncOfflinePlaylistMetadata) Complete (unused As Boolean)
			isOfflineDataRefreshInProgress = False
			Return True
		End If
		TraceLog("Ответ data.php не подходит для офлайн-режима. type=" & data.GetDefault("type", "") & ", ok=" & data.GetDefault("ok", False))
	Else
		TraceLog("Ответ data.php не является Map.")
	End If
	isOfflineDataRefreshInProgress = False
	Return False
End Sub

Private Sub EnsureDataPlaybackReady As ResumableSub
	If CanUseDataPlaybackResolver Then Return True
	TraceLog("Подготовка локального playback-resolver из data/playlists перед стартом.")
	Wait For (RefreshOfflineDataNow) Complete (refreshed As Boolean)
	If refreshed = False Then
		TraceLog("Не удалось подготовить data/playlists для локального воспроизведения.")
		Return False
	End If
	Return CanUseDataPlaybackResolver
End Sub

Private Sub CanUseDataPlaybackResolver As Boolean
	If USE_DATA_PLAYBACK_RESOLVER = False Then Return False
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return False
	Return True
End Sub

Private Sub EnsureDataPlaybackQueue(minItems As Int) As ResumableSub
	If minItems <= 0 Then Return False
	Do While playQueue.Size < minItems
		Wait For (BuildNextTrackFromDataPlayback) Complete (nextItem As Map)
		If nextItem.IsInitialized = False Then Exit
		playQueue.Add(nextItem)
	Loop
	Return playQueue.Size >= minItems
End Sub

Private Sub BuildNextTrackFromDataPlayback As ResumableSub
	Dim emptyItem As Map
	emptyItem.Initialize
	Dim currentSlot As Map = ResolveCurrentDataSlot
	If currentSlot.IsInitialized = False Then
		TraceLog("Не удалось определить текущий слот из data.")
		Return emptyItem
	End If
	Dim playlistDescriptor As Map = ChooseNextPlaylistDescriptor(currentSlot)
	If playlistDescriptor.IsInitialized = False Then
		TraceLog("Не удалось выбрать playlist для текущего слота.")
		Return emptyItem
	End If
	Dim playlistData As Map = LoadCachedPlaylistMetadata(playlistDescriptor.GetDefault("id", ""))
	If playlistData.IsInitialized = False Then
		Wait For (EnsureSinglePlaylistMetadata(playlistDescriptor)) Complete (downloaded As Boolean)
		If downloaded = False Then Return emptyItem
		playlistData = LoadCachedPlaylistMetadata(playlistDescriptor.GetDefault("id", ""))
		If playlistData.IsInitialized = False Then Return emptyItem
	End If
	Dim selectedTrack As Map = ChooseRandomTrackFromPlaylist(playlistData)
	If selectedTrack.IsInitialized = False Then
		TraceLog("Не удалось выбрать трек из playlist. playlistId=" & playlistDescriptor.GetDefault("id", ""))
		Return emptyItem
	End If
	Dim queueItem As Map = CreateQueueTrackFromPlaylist(currentSlot, playlistDescriptor, selectedTrack)
	RememberResolvedTrack(queueItem.GetDefault("id", ""))
	Return queueItem
End Sub

Private Sub AutoStartSavedPlayer
	If playerCode = "" Then Return
	If isStarted Or isStopping Then Return
	If USE_DATA_PLAYBACK_RESOLVER Then
		Wait For (EnsureDataPlaybackReady) Complete (resolverReady As Boolean)
		If resolverReady = False Then
			TraceLog("Автозапуск отложен: data/playlists ещё не готовы.")
			Return
		End If
	End If
	isStarted = True
	isStoppedByUser = False
	SetStopIcon
	HideContentBlocks
	TraceLog("Автозапуск воспроизведения при старте приложения.")
	Wait For (StartFirstTrack("auto")) Complete (unused As Boolean)
End Sub

Private Sub ShowSetupScreen(text As String)
	appScreenMode = "setup"
	ClearPlaybackState
	HidePin
	isStarted = False
	isStoppedByUser = True
	SetPlayIcon
	SetStatusText("")
	lblHeader.Text = ""
	ConfigureSetupScreen("setup", text)
	UpdateVisibleMode
	If txtPlayerCode.IsInitialized Then txtPlayerCode.RequestFocus
End Sub

Private Sub ShowSettingsScreen
	If playerCode = "" Then
		ShowSetupScreen("")
		Return
	End If
	appScreenMode = "settings"
	ConfigureSetupScreen("settings", "")
	UpdateVisibleMode
End Sub

Private Sub ShowPlayerScreen(refreshInfo As Boolean)
	appScreenMode = "player"
	ConfigurePlayerHeader
	UpdateVisibleMode
	If isStarted = False Then ApplyStoppedState
	If refreshInfo = False Then Return
	RenderPlayerHead(playerCode, "")
	Wait For (InitPlayerInfo) Complete (unused As Boolean)
End Sub

Private Sub ConfigureSetupScreen(mode As String, text As String)
	Dim isSettingsMode As Boolean = mode = "settings"
	headerActionPane.Visible = mode <> "setup"
	If isSettingsMode Then
		lblHeaderAction.Text = ICON_CLOSE
	Else
		lblHeaderAction.Text = ICON_MORE
	End If
	If isSettingsMode Then
		txtPlayerCode.Editable = False
	Else
		txtPlayerCode.Editable = True
	End If
	txtPlayerCode.Text = FormatPlayerCodeForDisplay(playerCode)
	If isSettingsMode Then
		btnSetupSubmit.Text = MessageValue("logout").ToUpperCase
	Else
		btnSetupSubmit.Text = MessageValue("setup_submit").ToUpperCase
	End If
	If text <> "" Then
		lblSetupMessage.Text = text
	Else If isSettingsMode Then
		lblSetupMessage.Text = MessageValue("settings_thanks")
	Else
		lblSetupMessage.Text = MessageValue("setup_title")
	End If
	If playerCode = "" Then lblHeader.Text = ""
End Sub

Private Sub ConfigurePlayerHeader
	headerActionPane.Visible = True
	lblHeaderAction.Text = ICON_MORE
End Sub

Private Sub UpdateVisibleMode
	setupPane.Visible = appScreenMode <> "player"
	If appScreenMode = "player" Then
		playerPane.Visible = True
	Else
		playerPane.Visible = False
	End If
	If appScreenMode = "setup" Then headerActionPane.Visible = False
End Sub

Private Sub PlayButtonPane_Click
	If playerCode = "" Then
		ShowSetupScreen(MessageValue("player_required"))
		Return
	End If
	If isStarted = False Then
		If isStopping Then Return
		isStarted = True
		isStoppedByUser = False
		SetStopIcon
		HideContentBlocks
		Wait For (StartFirstTrack("manual")) Complete (unused As Boolean)
		Return
	End If
	If isStopping Then Return
	Wait For (StopPlayer) Complete (unused2 As Boolean)
End Sub

Private Sub PlayButtonPane_MouseClicked (eventData As MouseEvent)
	PlayButtonPane_Click
End Sub

Private Sub PlayButtonPane_MouseEntered (eventData As MouseEvent)
	UpdatePlayButtonAppearance(True)
End Sub

Private Sub PlayButtonPane_MouseExited (eventData As MouseEvent)
	UpdatePlayButtonAppearance(False)
End Sub

Private Sub HeaderActionPane_Click
	If appScreenMode = "player" Then
		ShowSettingsScreen
	Else If appScreenMode = "settings" Then
		ShowPlayerScreen(False)
	End If
End Sub

Private Sub HeaderActionPane_MouseClicked (eventData As MouseEvent)
	HeaderActionPane_Click
End Sub

Private Sub HeaderActionPane_MouseEntered (eventData As MouseEvent)
	UpdateHeaderActionAppearance(True)
End Sub

Private Sub HeaderActionPane_MouseExited (eventData As MouseEvent)
	UpdateHeaderActionAppearance(False)
End Sub

Private Sub BtnSetupSubmit_Click
	If appScreenMode = "settings" Then
		Wait For (LogoutPlayer) Complete (unused As Boolean)
	Else
		Wait For (SubmitPlayerCode) Complete (unused2 As Boolean)
	End If
End Sub

Private Sub BtnSetupSubmit_MouseEntered (eventData As MouseEvent)
	UpdateTextButtonAppearance(btnSetupSubmit, True)
End Sub

Private Sub BtnSetupSubmit_MouseExited (eventData As MouseEvent)
	UpdateTextButtonAppearance(btnSetupSubmit, False)
End Sub

Private Sub BtnConfirmYes_Click
	Wait For (SubmitClaim) Complete (unused As Boolean)
End Sub

Private Sub BtnConfirmYes_MouseEntered (eventData As MouseEvent)
	UpdateTextButtonAppearance(btnConfirmYes, True)
End Sub

Private Sub BtnConfirmYes_MouseExited (eventData As MouseEvent)
	UpdateTextButtonAppearance(btnConfirmYes, False)
End Sub

Private Sub BtnConfirmNo_Click
	HidePin
	ApplyStoppedState
End Sub

Private Sub BtnConfirmNo_MouseEntered (eventData As MouseEvent)
	UpdateTextButtonAppearance(btnConfirmNo, True)
End Sub

Private Sub BtnConfirmNo_MouseExited (eventData As MouseEvent)
	UpdateTextButtonAppearance(btnConfirmNo, False)
End Sub

Private Sub txtPlayerCode_TextChanged (oldValue As String, newValue As String)
	If appScreenMode = "settings" Then Return
	Dim filtered As String = FilterPlayerCode(newValue)
	If filtered <> newValue Then
		txtPlayerCode.Text = filtered
	End If
End Sub

Private Sub txtPlayerCode_Action
	If appScreenMode = "settings" Then Return
	BtnSetupSubmit_Click
End Sub

Private Sub txtPlayerCode_FocusChanged (hasFocus As Boolean)
	isCodeInputFocused = hasFocus
	UpdateCodeInputAppearance(hasFocus)
End Sub

Private Sub SubmitPlayerCode As ResumableSub
	Dim nextPlayer As String = NormalizePlayerCode(txtPlayerCode.Text)
	If nextPlayer = "" Then
		ShowSetupScreen(MessageValue("setup_invalid"))
		txtPlayerCode.RequestFocus
		Return False
	End If
	playerCode = nextPlayer
	SaveValue("player_code", playerCode)
	txtPlayerCode.Text = FormatPlayerCodeForDisplay(playerCode)
	StartOfflineDataRefresh
	ShowPlayerScreen(True)
	Return True
End Sub

Private Sub LogoutPlayer As ResumableSub
	SaveValue("player_code", "")
	playerCode = ""
	Wait For (StopPlayer) Complete (unused As Boolean)
	SetStatusText("")
	ShowSetupScreen("")
	Return True
End Sub

Private Sub InitPlayerInfo As ResumableSub
	If playerCode = "" Then Return False
	Wait For (FetchJsonWithTimeout(PLAYER_BASE_URL & "?" & BuildParams(CreateMetaParams), FETCH_TIMEOUT_MS)) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		RenderPlayerHead(playerCode, "")
		Return False
	End If
	Dim resultData As Object = result.Get("Data")
	If resultData Is Map Then
		Dim data As Map = resultData
		If data.GetDefault("ok", False) <> True Then
			RenderPlayerHead(playerCode, "")
			Return False
		End If
		RenderPlayerHead(data.GetDefault("code", playerCode), data.GetDefault("title", ""))
		Return True
	End If
	RenderPlayerHead(playerCode, "")
	Return False
End Sub

Private Sub PlaybackStartDone(unusedResult As Map)
	If unusedResult.IsInitialized Then
	End If
End Sub

Private Sub PreloadDone(unusedResult As Map)
	If unusedResult.IsInitialized Then
	End If
End Sub

Private Sub GetAudioByKey(audioKey As String) As AudioPlayer
	If audioKey = "secondary" Then Return audioSecondary
	Return audioPrimary
End Sub

Private Sub GetInactiveAudioKey As String
	If activeAudioKey = "primary" Then Return "secondary"
	Return "primary"
End Sub

Private Sub ClearPreparedState(resetPlayer As Boolean)
	If preparedAudioKey <> "" And resetPlayer Then
		GetAudioByKey(preparedAudioKey).Reset
	End If
	preparedAudioKey = ""
	preparedItem.Initialize
	pendingPrepareAudioKey = ""
	pendingPrepareItem.Initialize
End Sub

Private Sub ClearPendingPlayState
	pendingPlayAudioKey = ""
	pendingPlayItem.Initialize
	pendingPlayFadeInMs = 0
End Sub

Private Sub ItemsMatch(firstItem As Map, secondItem As Map) As Boolean
	If firstItem.IsInitialized = False Or secondItem.IsInitialized = False Then Return False
	If firstItem.GetDefault("type", "") <> secondItem.GetDefault("type", "") Then Return False
	If firstItem.GetDefault("id", "") <> "" And firstItem.GetDefault("id", "") = secondItem.GetDefault("id", "") Then Return True
	Return MediaUrl(firstItem) = MediaUrl(secondItem)
End Sub

Private Sub CloneMap(sourceMap As Map) As Map
	Dim clonedMap As Map
	clonedMap.Initialize
	If sourceMap.IsInitialized = False Then Return clonedMap
	For Each key As Object In sourceMap.Keys
		clonedMap.Put(key, sourceMap.Get(key))
	Next
	Return clonedMap
End Sub

Private Sub ConsumePreparedQueueItem
	If playQueue.Size = 0 Or preparedItem.IsInitialized = False Then Return
	If playQueue.Get(0) Is Map Then
		Dim firstQueuedItem As Map = playQueue.Get(0)
		If ItemsMatch(firstQueuedItem, preparedItem) Then playQueue.RemoveAt(0)
	End If
End Sub

Private Sub UpdatePlaybackMeta(item As Map)
	Dim itemType As String = item.GetDefault("type", "")
	If itemType = "ad" Then
		ShowAdMeta(item)
		ShowStream(MessageValue("ad_label"))
	Else
		ShowTrackMeta(item)
		ShowStream(item.GetDefault("stream", ""))
		SyncExactBreakState
	End If
End Sub

Private Sub ActivateLoadedItem(audioKey As String, item As Map, fadeInMs As Int)
	activeAudioKey = audioKey
	activeItem = CloneMap(item)
	currentTrackUrl = MediaUrl(item)
	currentMediaType = item.GetDefault("type", "")
	isCrossfadeTriggered = False
	If preparedAudioKey = audioKey Then
		preparedAudioKey = ""
		preparedItem.Initialize
	End If
	UpdatePlaybackMeta(item)
	TraceLog("ActivateLoadedItem. audio=" & audioKey & ", item=" & DescribeItem(item) & ", fadeInMs=" & fadeInMs)
	GetAudioByKey(audioKey).PlayWithFade(fadeInMs)
	ScheduleHistoryLog(item)
	ResetRetryDelay
	prefetchDone = False
End Sub

Private Sub StartPlaybackWithAudioKey(audioKey As String, item As Map, fadeInMs As Int) As ResumableSub
	ClearPendingPlayState
	pendingPlayAudioKey = audioKey
	pendingPlayItem = item
	pendingPlayFadeInMs = fadeInMs
	TraceLog("StartPlaybackWithAudioKey. audio=" & audioKey & ", item=" & DescribeItem(item) & ", volume=" & NumberFormat2(CurrentVolume(item), 1, 3, 3, False) & ", fadeInMs=" & fadeInMs)
	GetAudioByKey(audioKey).LoadUrl(MediaUrl(item), CurrentVolume(item))
	Wait For PlaybackStartDone(result As Map)
	TraceLog("PlaybackStartDone. audio=" & audioKey & ", success=" & result.GetDefault("Success", False) & ", message=" & result.GetDefault("Message", ""))
	Return result.GetDefault("Success", False)
End Sub

Private Sub PrepareNextPlayable As ResumableSub
	If isStarted = False Or isStoppedByUser Then Return False
	If playQueue.Size = 0 Then Return False
	Dim nextObject As Object = playQueue.Get(0)
	If nextObject Is Map Then
	Else
		Return False
	End If
	Dim nextItem As Map = nextObject
	Dim nextType As String = nextItem.GetDefault("type", "")
	If nextType <> "track" And nextType <> "ad" Then Return False
	If preparedItem.IsInitialized And preparedAudioKey <> "" And ItemsMatch(preparedItem, nextItem) Then Return True
	Dim targetAudioKey As String = GetInactiveAudioKey
	ClearPreparedState(False)
	pendingPrepareAudioKey = targetAudioKey
	pendingPrepareItem = CloneMap(nextItem)
	TraceLog("PrepareNextPlayable. targetAudio=" & targetAudioKey & ", item=" & DescribeItem(nextItem) & ", volume=" & NumberFormat2(CurrentVolume(nextItem), 1, 3, 3, False))
	GetAudioByKey(targetAudioKey).LoadUrl(MediaUrl(nextItem), CurrentVolume(nextItem))
	Wait For PreloadDone(result As Map)
	TraceLog("PreloadDone. audio=" & targetAudioKey & ", success=" & result.GetDefault("Success", False) & ", message=" & result.GetDefault("Message", ""))
	Return result.GetDefault("Success", False)
End Sub

Private Sub CanCrossfadePreparedItem As Boolean
	If isQueueTransitioning Or isCrossfadeTriggered Then Return False
	If currentMediaType <> "track" Then Return False
	If preparedAudioKey = "" Or preparedItem.IsInitialized = False Then Return False
	If preparedItem.GetDefault("type", "") <> "track" Then Return False
	Return True
End Sub

Private Sub CanStartPreparedOnTrackTail As Boolean
	If isQueueTransitioning Or isCrossfadeTriggered Then Return False
	If currentMediaType <> "track" Then Return False
	If preparedAudioKey = "" Or preparedItem.IsInitialized = False Then Return False
	Return preparedItem.GetDefault("type", "") = "ad"
End Sub

Private Sub PreparedFadeInMs As Int
	Return 0
End Sub

Private Sub PreparedFadeOutMs As Int
	If currentMediaType <> "track" Then Return 0
	If preparedItem.IsInitialized = False Then Return 0
	Dim nextType As String = preparedItem.GetDefault("type", "")
	If nextType = "track" Then Return TRACK_OVERLAP_MS
	If nextType = "ad" Then Return AD_TAIL_OVERLAP_MS
	Return 0
End Sub

Private Sub PromotePreparedPlayer(fadeInMs As Int, fadeOutMs As Int) As Boolean
	If preparedAudioKey = "" Or preparedItem.IsInitialized = False Then Return False
	Dim previousAudioKey As String = activeAudioKey
	Dim nextAudioKey As String = preparedAudioKey
	Dim promotedItem As Map = CloneMap(preparedItem)
	TraceLog("PromotePreparedPlayer. fromAudio=" & previousAudioKey & ", toAudio=" & nextAudioKey & ", item=" & DescribeItem(promotedItem) & ", fadeOutMs=" & fadeOutMs)
	ConsumePreparedQueueItem
	If previousAudioKey <> "" And previousAudioKey <> nextAudioKey Then
		GetAudioByKey(previousAudioKey).Stop(fadeOutMs)
	End If
	activeAudioKey = nextAudioKey
	ActivateLoadedItem(activeAudioKey, promotedItem, fadeInMs)
	ClearPreparedState(False)
	Return True
End Sub

Private Sub StartFirstTrack(mode As String) As ResumableSub
	nextStartMode = mode
	playQueue.Clear
	prefetchDone = False
	isCrossfadeTriggered = False
	initialStartFadePending = True
	TraceLog("Запуск первого трека. Режим=" & mode)
	Wait For (LoadNextAndPlay) Complete (unused As Boolean)
	Return True
End Sub

Private Sub LoadNextAndPlay As ResumableSub
	ClearRetryTimer
	TraceLog("Запрос очереди и запуск. Режим старта=" & nextStartMode & ", размер очереди до запроса=" & playQueue.Size)
	If USE_DATA_PLAYBACK_RESOLVER Then
		If CanUseDataPlaybackResolver = False Then
			Wait For (EnsureDataPlaybackReady) Complete (resolverReady As Boolean)
			If resolverReady = False Then
				TraceLog("Локальный resolver недоступен. Запуск через next.php отключен в тестовом режиме.")
				HandleTemporaryState("server", "")
				Return False
			End If
		End If
		Wait For (EnsureDataPlaybackQueue(2)) Complete (queuePrepared As Boolean)
		If queuePrepared = False Then
			TraceLog("Не удалось собрать очередь из data/playlists. Запуск через next.php отключен в тестовом режиме.")
			HandleTemporaryState("server", "")
			Return False
		Else
			SyncExactBreakState
			TraceLog("Локальная очередь из data/playlists готова. Элементов=" & playQueue.Size)
			Wait For (PlayQueueItem(ShiftQueueItem, 0)) Complete (unusedLocal As Boolean)
			Return True
		End If
	End If
	Wait For (FetchNext) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		Wait For (HandleFetchFailure(result)) Complete (unused As Boolean)
		Return False
	End If
	If isStarted = False Or isStoppedByUser Then Return False
	ResetRetryDelay
	Dim queue As List = NormalizeQueueResponse(result.Get("Data"))
	If queue.IsInitialized = False Or queue.Size = 0 Then
		HandleTemporaryState("server", "")
		Return False
	End If
	playQueue = queue
	SyncExactBreakState
	Dim retryAfter As Int = NormalizeRetryAfter(result.Get("Data"))
	TraceLog("Очередь загружена. Элементов=" & playQueue.Size & ", retryAfter=" & retryAfter)
	Wait For (PlayQueueItem(ShiftQueueItem, retryAfter)) Complete (unused2 As Boolean)
	Return True
End Sub

Private Sub PlayPreparedOrLoadNext As ResumableSub
	ClearRetryTimer
	If playQueue.Size > 0 Then
		Wait For (PlayQueueItem(ShiftQueueItem, 0)) Complete (unused As Boolean)
		Return True
	End If
	Wait For (LoadNextAndPlay) Complete (unused2 As Boolean)
	Return True
End Sub

Private Sub PrefetchNext As ResumableSub
	If playQueue.Size > 0 Then
		Wait For (PrepareNextPlayable) Complete (preparedOk As Boolean)
		Return preparedOk
	End If
	If USE_DATA_PLAYBACK_RESOLVER Then
		If CanUseDataPlaybackResolver = False Then
			Wait For (EnsureDataPlaybackReady) Complete (resolverReady As Boolean)
			If resolverReady = False Then Return False
		End If
		Wait For (EnsureDataPlaybackQueue(1)) Complete (queuePrepared As Boolean)
		If queuePrepared And playQueue.Size > 0 Then
			Wait For (PrepareNextPlayable) Complete (preparedOk As Boolean)
			Return preparedOk
		End If
		Return False
	End If
	If HasPendingExactBreak Then Return False
	Wait For (FetchNext) Complete (result As Map)
	If result.GetDefault("Success", False) = False Or isStarted = False Or isStoppedByUser Then Return False
	Dim queue As List = NormalizeQueueResponse(result.Get("Data"))
	If queue.IsInitialized = False Or queue.Size = 0 Then Return False
	playQueue = queue
	SyncExactBreakState
	Wait For (PrepareNextPlayable) Complete (preparedOk As Boolean)
	Return preparedOk
End Sub

Private Sub FetchNext As ResumableSub
	Wait For (FetchJsonWithTimeout(NEXT_BASE_URL & "?" & BuildParams(CreateNextParams), FETCH_TIMEOUT_MS)) Complete (result As Map)
	nextStartMode = ""
	Return result
End Sub

Private Sub FetchJsonWithTimeout(url As String, timeoutMs As Int) As ResumableSub
	Dim result As Map
	result.Initialize
	result.Put("Success", False)
	result.Put("Kind", "server")
	result.Put("Data", Null)
	result.Put("ErrorMessage", "")
	Dim j As HttpJob
	j.Initialize("", Me)
	TraceLog("HTTP GET. timeoutMs=" & timeoutMs & ", url=" & url)
	j.Download(url)
	j.GetRequest.Timeout = timeoutMs
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Try
			Dim responseText As String = j.GetString
			SaveServerSnapshot("GET", url, True, responseText, "")
			Dim parser As JSONParser
			parser.Initialize(responseText)
			result.Put("Data", parser.NextObject)
			result.Put("Success", True)
			result.Put("Kind", "")
			TraceLog("HTTP OK. url=" & url)
		Catch
			result.Put("Kind", "server")
			result.Put("ErrorMessage", "bad_json")
			SaveServerSnapshot("GET", url, False, "", "bad_json")
			TraceLog("HTTP parse error. url=" & url & ", message=bad_json")
		End Try
	Else
		Dim errorMessage As String = j.ErrorMessage
		result.Put("ErrorMessage", errorMessage)
		If errorMessage.ToLowerCase.Contains("timed out") Or errorMessage.ToLowerCase.Contains("unknownhost") Or errorMessage.ToLowerCase.Contains("refused") Then
			result.Put("Kind", "offline")
		Else
			result.Put("Kind", "server")
		End If
		SaveServerSnapshot("GET", url, False, "", errorMessage)
		TraceLog("HTTP failed. kind=" & result.GetDefault("Kind", "") & ", url=" & url & ", message=" & errorMessage)
	End If
	j.Release
	Return result
End Sub

Private Sub SubmitClaim As ResumableSub
	btnConfirmYes.Enabled = False
	btnConfirmNo.Enabled = False
	TraceLog("SubmitClaim. playerCode=" & FormatPlayerCodeForDisplay(playerCode) & ", deviceId=" & deviceId)
	Wait For (FetchJsonWithTimeout(CLAIM_BASE_URL & "?" & BuildParams(CreateClaimParams), FETCH_TIMEOUT_MS)) Complete (result As Map)
	If result.GetDefault("Success", False) Then
		Dim resultData As Object = result.Get("Data")
		If resultData Is Map Then
			Dim data As Map = resultData
			If data.GetDefault("ok", False) = True Then
				isStarted = True
				isStoppedByUser = False
				SetStopIcon
				HideContentBlocks
				TraceLog("Claim OK. starting playback.")
				Wait For (StartFirstTrack("manual")) Complete (unused As Boolean)
				btnConfirmYes.Enabled = True
				btnConfirmNo.Enabled = True
				Return True
			End If
		End If
	End If
	TraceLog("Claim rejected. message=" & ResolveErrorMessage(result, MessageValue("device_busy")))
	ShowClaimPrompt(ResolveErrorMessage(result, MessageValue("device_busy")))
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
	Return False
End Sub

Private Sub PlayQueueItem(current As Object, retryAfter As Int) As ResumableSub
	ClearExactBreakState
	ClearHistoryLogTimer
	isCrossfadeTriggered = False
	If current Is Map Then
		Dim item As Map = current
		Dim itemType As String = item.GetDefault("type", "")
		TraceLog("PlayQueueItem. type=" & itemType & ", retryAfter=" & retryAfter & ", item=" & DescribeItem(item))
		
		If itemType = "message" Then
			HandleMessageItem(item)
			Return False
		End If
		If itemType = "update" Then
			ClearPlaybackState
			isStarted = False
			isStoppedByUser = True
			SetPlayIcon
			ShowMessage(item.GetDefault("message", MessageValue("player_reloading")))
			Return False
		End If
		
		HidePin
		If itemType = "idle" Then
			ClearPlaybackState
			ShowMessage(item.GetDefault("message", MessageValue("idle")))
			If retryAfter > 0 Then
				ScheduleRetry("server", retryAfter * 1000)
			Else
				ScheduleRetry("server", PAUSE_RETRY_DELAY)
			End If
			Return False
		End If
		
		If itemType = "break" Then
			MergeBreakItems(item)
			Wait For (PlayPreparedOrLoadNext) Complete (unused As Boolean)
			Return True
		End If
		
		If itemType <> "track" And itemType <> "ad" Then
			HandleTemporaryState("server", "")
			Return False
		End If
		
		Dim url As String = MediaUrl(item)
		If url = "" Then
			HandleTemporaryState("server", "")
			Return False
		End If
		
		If item.ContainsKey("playlist") Then playlistIndex = item.Get("playlist")
		prefetchDone = False
		Dim fadeInMs As Int = ResolveStartFadeInMs
		Dim targetAudioKey As String = GetInactiveAudioKey
		If activeAudioKey = "" Then targetAudioKey = "primary"
		Wait For (StartPlaybackWithAudioKey(targetAudioKey, item, fadeInMs)) Complete (playbackStarted As Boolean)
		If playbackStarted = False Or isStarted = False Or isStoppedByUser Then Return False
		Return True
	Else
		HandleTemporaryState("server", "")
		Return False
	End If
End Sub

Private Sub HandleMessageItem(item As Map)
	Dim action As String = item.GetDefault("action", "")
	TraceLog("HandleMessageItem. action=" & action & ", message=" & item.GetDefault("message", ""))
	If action = "claim" Then
		ClearPlaybackState
		isStarted = False
		isStoppedByUser = True
		SetPlayIcon
		ShowClaimPrompt(item.GetDefault("message", MessageValue("device_busy")))
	Else If action = "blocked" Then
		HandleBlockedState
	Else If action = "not_found" Then
		StopForMissingData(item.GetDefault("message", MessageValue("not_found")))
	Else
		HandleTemporaryState("server", item.GetDefault("message", MessageValue("server_wait")))
	End If
End Sub

Private Sub MergeBreakItems(item As Map)
	Dim items As List = item.GetDefault("items", Null)
	If items.IsInitialized = False Or items.Size = 0 Then Return
	Dim merged As List
	merged.Initialize
	For Each breakItem As Object In items
		merged.Add(breakItem)
	Next
	For Each existing As Object In playQueue
		merged.Add(existing)
	Next
	playQueue = merged
	SyncExactBreakState
	TraceLog("В очередь добавлен break. Размер очереди=" & playQueue.Size & ", scheduledBreakAt=" & scheduledBreakAt)
End Sub

Private Sub HandleFetchFailure(result As Map) As ResumableSub
	TraceLog("Ошибка загрузки данных. kind=" & result.GetDefault("Kind", "") & ", message=" & result.GetDefault("ErrorMessage", ""))
	If result.GetDefault("Kind", "") = "offline" Then
		HandleTemporaryState("offline", "")
		Return True
	End If
	Wait For (CheckExternalConnectivity) Complete (hasInternet As Boolean)
	If hasInternet Then
		HandleTemporaryState("server", "")
	Else
		HandleTemporaryState("offline", "")
	End If
	Return True
End Sub

Private Sub CheckExternalConnectivity As ResumableSub
	Dim j As HttpJob
	j.Initialize("", Me)
	j.Download(CONNECTIVITY_CHECK_URL & "?t=" & DateTime.Now)
	j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT_MS
	Wait For (j) JobDone(j As HttpJob)
	Dim ok As Boolean = j.Success
	j.Release
	Return ok
End Sub

Private Sub HandleTemporaryState(mode As String, text As String)
	TraceLog("Временное состояние. mode=" & mode & ", text=" & text)
	ClearPlaybackState
	HidePin
	If text <> "" Then
		ShowMessage(text)
	Else If mode = "offline" Then
		ShowMessage(MessageValue("offline"))
	Else
		ShowMessage(MessageValue("server_wait"))
	End If
	ScheduleRetry(mode, 0)
End Sub

Private Sub HandleBlockedState
	TraceLog("Плеер заблокирован.")
	ClearPlaybackState
	HidePin
	ShowMessage(MessageValue("blocked"))
	ScheduleRetry("blocked", 0)
End Sub

Private Sub StopForMissingData(text As String)
	TraceLog("Остановка из-за отсутствующих данных. text=" & text)
	ClearPlaybackState
	HidePin
	isStarted = False
	isStoppedByUser = True
	SetPlayIcon
	ShowMessage(text)
End Sub

Private Sub HandleMediaError As ResumableSub
	Wait For (CheckExternalConnectivity) Complete (hasInternet As Boolean)
	If hasInternet Then
		HandleTemporaryState("server", "")
	Else
		HandleTemporaryState("offline", "")
	End If
	Return True
End Sub

Private Sub ResolveRetryDelay(mode As String, delayMs As Int) As Int
	If delayMs > 0 Then Return delayMs
	If mode = "offline" Then
		Dim delay As Int = offlineRetryDelay
		offlineRetryDelay = Min(offlineRetryDelay * 2, OFFLINE_RETRY_DELAY_MAX)
		Return delay
	End If
	If mode = "blocked" Then Return BLOCKED_RETRY_DELAY
	Dim serverDelay As Int = serverRetryDelay
	serverRetryDelay = Min(serverRetryDelay * 2, SERVER_RETRY_DELAY_MAX)
	Return serverDelay
End Sub

Private Sub ScheduleRetry(mode As String, delayMs As Int)
	ClearRetryTimer
	retryTimer.Interval = ResolveRetryDelay(mode, delayMs)
	TraceLog("ScheduleRetry. mode=" & mode & ", delayMs=" & retryTimer.Interval)
	retryTimer.Enabled = True
End Sub

Private Sub RetryTimer_Tick
	retryTimer.Enabled = False
	If isStarted = False Or isStoppedByUser Then Return
	TraceLog("RetryTimer_Tick. reloading next queue chunk.")
	Wait For (LoadNextAndPlay) Complete (unused As Boolean)
End Sub

Private Sub ResetRetryDelay
	offlineRetryDelay = OFFLINE_RETRY_DELAY_INITIAL
	serverRetryDelay = SERVER_RETRY_DELAY_INITIAL
End Sub

Private Sub ClearRetryTimer
	retryTimer.Enabled = False
End Sub

Private Sub ResolveScheduledBreakAt
	scheduledBreakAt = -1
	For Each itemObj As Object In playQueue
		If itemObj Is Map Then
			Dim item As Map = itemObj
			If item.GetDefault("type", "") = "break" And item.GetDefault("exactly", False) = True And item.ContainsKey("at") Then
				scheduledBreakAt = ToLongDefault(item.Get("at"), -1)
				Exit
			End If
		End If
	Next
	TraceLog("Определена точка exact-break. value=" & scheduledBreakAt & ", queueSize=" & playQueue.Size)
End Sub

Private Sub SyncExactBreakState
	ResolveScheduledBreakAt
	ScheduleBreakWatch
End Sub

Private Sub ScheduleBreakWatch
	breakTimer.Enabled = False
	If HasPendingExactBreak = False Then Return
	Dim delay As Long = Max(1, ((scheduledBreakAt - LocalNowTimestamp) * 1000) - 250)
	breakTimer.Interval = delay
	breakTimer.Enabled = True
End Sub

Private Sub BreakTimer_Tick
	breakTimer.Enabled = False
	If isStarted = False Or isStoppedByUser Then Return
	If ShouldTriggerBreakNow = False Then Return
	TraceLog("Сработал таймер exact-break.")
	Wait For (FadeOutAndContinue) Complete (unused As Boolean)
End Sub

Private Sub ClearExactBreakState
	scheduledBreakAt = -1
	breakTimer.Enabled = False
End Sub

Private Sub HasPendingExactBreak As Boolean
	Return scheduledBreakAt > LocalNowTimestamp
End Sub

Private Sub ShouldTriggerBreakNow As Boolean
	If scheduledBreakAt <= 0 Then Return False
	Return LocalNowTimestamp >= scheduledBreakAt
End Sub

Private Sub EffectiveTrackRemainMs As Long
	Dim trackRemain As Long = 0
	If activeAudioKey <> "" Then
		Dim activeAudio As AudioPlayer = GetAudioByKey(activeAudioKey)
		If activeAudio.Duration > 0 Then trackRemain = activeAudio.Duration - activeAudio.Position
	End If
	If scheduledBreakAt <= 0 Then Return trackRemain
	Dim breakRemain As Long = (scheduledBreakAt - LocalNowTimestamp) * 1000
	If trackRemain <= 0 Then Return breakRemain
	Return Min(trackRemain, breakRemain)
End Sub

Private Sub FadeOutAndContinue As ResumableSub
	If isQueueTransitioning Then Return False
	isQueueTransitioning = True
	ClearExactBreakState
	Dim fadeMs As Int
	If currentMediaType = "track" Then
		fadeMs = STOP_FADE_MS
	Else
		fadeMs = 0
	End If
	TraceLog("Переход через fade-out. currentType=" & currentMediaType & ", fadeMs=" & fadeMs)
	If activeAudioKey <> "" Then GetAudioByKey(activeAudioKey).Stop(fadeMs)
	ClearPreparedState(False)
	Wait For (PlayPreparedOrLoadNext) Complete (unused As Boolean)
	isQueueTransitioning = False
	Return True
End Sub

Private Sub ScheduleHistoryLog(item As Map)
	If item.IsInitialized = False Then Return
	Dim itemType As String = item.GetDefault("type", "")
	If itemType <> "track" And itemType <> "ad" Then Return
	If item.GetDefault("id", "") = "" Then Return
	TraceLog("ScheduleHistoryLog. item=" & DescribeItem(item) & ", delayMs=" & HISTORY_LOG_DELAY_MS)
	ClearHistoryLogTimer
	historyItem = item
	historyStartedAtTicks = DateTime.Now
	historyTimer.Interval = HISTORY_LOG_DELAY_MS
	historyTimer.Enabled = True
End Sub

Private Sub HistoryTimer_Tick
	historyTimer.Enabled = False
	If isStarted = False Or isStoppedByUser Then Return
	If historyItem.IsInitialized = False Then Return
	If currentMediaType <> historyItem.GetDefault("type", "") Then Return
	If currentTrackUrl = "" Then Return
	Wait For (SendHistory(historyItem)) Complete (unused As Boolean)
End Sub

Private Sub SendHistory(item As Map) As ResumableSub
	TraceLog("SendHistory. item=" & DescribeItem(item))
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("type", item.GetDefault("type", ""))
	params.Put("id", item.GetDefault("id", ""))
	Dim startedAt As Long = historyStartedAtTicks
	If startedAt <= 0 Then startedAt = DateTime.Now
	params.Put("date", FormatHistoryDate(startedAt))
	params.Put("time", FormatHistoryTime(startedAt))
	Dim j As HttpJob
	j.Initialize("", Me)
	j.PostString(HISTORY_BASE_URL, BuildParams(params))
	j.GetRequest.Timeout = 5000
	j.GetRequest.SetContentType("application/x-www-form-urlencoded;charset=UTF-8")
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		SaveServerSnapshot("POST", HISTORY_BASE_URL, True, j.GetString, "")
	Else
		SaveServerSnapshot("POST", HISTORY_BASE_URL, False, "", j.ErrorMessage)
	End If
	TraceLog("SendHistory complete. success=" & j.Success)
	j.Release
	Return True
End Sub

Private Sub ClearHistoryLogTimer
	historyTimer.Enabled = False
	historyItem.Initialize
	historyStartedAtTicks = 0
End Sub

Private Sub FormatHistoryDate(ticks As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim value As String = DateTime.Date(ticks)
	DateTime.DateFormat = previousDateFormat
	Return value
End Sub

Private Sub FormatHistoryTime(ticks As Long) As String
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "HH:mm:ss"
	Dim value As String = DateTime.Time(ticks)
	DateTime.TimeFormat = previousTimeFormat
	Return value
End Sub

Private Sub StopPlayer As ResumableSub
	If isStopping Then Return False
	isStopping = True
	TraceLog("StopPlayer requested. currentType=" & currentMediaType & ", activeAudio=" & activeAudioKey & ", preparedAudio=" & preparedAudioKey)
	isStarted = False
	isStoppedByUser = True
	ClearRetryTimer
	ClearExactBreakState
	ClearHistoryLogTimer
	ResetRetryDelay
	If activeAudioKey <> "" Then
		If currentMediaType = "track" Then
			GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS)
		Else
			GetAudioByKey(activeAudioKey).Stop(0)
		End If
	End If
	If preparedAudioKey <> "" Then GetAudioByKey(preparedAudioKey).Stop(0)
	currentTrackUrl = ""
	currentMediaType = ""
	activeAudioKey = ""
	preparedAudioKey = ""
	activeItem.Initialize
	preparedItem.Initialize
	playlistIndex = -1
	playQueue.Clear
	prefetchDone = False
	isCrossfadeTriggered = False
	SetStatusText("")
	HidePin
	SetPlayIcon
	ApplyStoppedState
	isStopping = False
	Return True
End Sub

Private Sub ClearPlaybackState
	TraceLog("ClearPlaybackState")
	audioPrimary.Reset
	audioSecondary.Reset
	currentTrackUrl = ""
	currentMediaType = ""
	activeAudioKey = ""
	preparedAudioKey = ""
	activeItem.Initialize
	preparedItem.Initialize
	ClearPendingPlayState
	ClearPreparedState(False)
	playQueue.Clear
	prefetchDone = False
	isCrossfadeTriggered = False
	initialStartFadePending = False
	ClearRetryTimer
	ClearExactBreakState
	ClearHistoryLogTimer
	SetStatusText("")
End Sub

Private Sub ResolveStartFadeInMs As Int
	If initialStartFadePending = False Then Return 0
	If activeAudioKey <> "" Then Return 0
	initialStartFadePending = False
	Return START_FADE_MS
End Sub

Private Sub AudioPrimary_Ready
	HandleAudioReady("primary")
End Sub

Private Sub AudioSecondary_Ready
	HandleAudioReady("secondary")
End Sub

Private Sub AudioPrimary_Error(message As String)
	HandleAudioError("primary", message)
End Sub

Private Sub AudioSecondary_Error(message As String)
	HandleAudioError("secondary", message)
End Sub

Private Sub AudioPrimary_Complete
	HandleAudioComplete("primary")
End Sub

Private Sub AudioSecondary_Complete
	HandleAudioComplete("secondary")
End Sub

Private Sub AudioPrimary_Timeupdate
	HandleAudioTimeupdate("primary")
End Sub

Private Sub AudioSecondary_Timeupdate
	HandleAudioTimeupdate("secondary")
End Sub

Private Sub HandleAudioReady(audioKey As String)
	TraceLog("Аудио готово. audio=" & audioKey)
	If pendingPlayAudioKey = audioKey Then
		ActivateLoadedItem(audioKey, pendingPlayItem, pendingPlayFadeInMs)
		ClearPendingPlayState
		CallSubDelayed2(Me, "PlaybackStartDone", CreateMap("Success": True))
		Return
	End If
	If pendingPrepareAudioKey = audioKey Then
		preparedAudioKey = audioKey
		preparedItem = CloneMap(pendingPrepareItem)
		pendingPrepareAudioKey = ""
		pendingPrepareItem.Initialize
		CallSubDelayed2(Me, "PreloadDone", CreateMap("Success": True))
	End If
End Sub

Private Sub HandleAudioError(audioKey As String, message As String) As ResumableSub
	TraceLog("Ошибка аудио. audio=" & audioKey & ", message=" & message)
	If pendingPlayAudioKey = audioKey Then
		ClearPendingPlayState
		CallSubDelayed2(Me, "PlaybackStartDone", CreateMap("Success": False, "Message": message))
		Return True
	End If
	If pendingPrepareAudioKey = audioKey Then
		ClearPreparedState(False)
		CallSubDelayed2(Me, "PreloadDone", CreateMap("Success": False, "Message": message))
		Return True
	End If
	If audioKey <> activeAudioKey Then Return False
	If isStoppedByUser Or isStopping Then Return False
	Wait For (HandleMediaError) Complete (unused As Boolean)
	Return True
End Sub

Private Sub HandleAudioComplete(audioKey As String) As ResumableSub
	If isStoppedByUser Then Return False
	If audioKey <> activeAudioKey Then Return False
	TraceLog("Аудио завершилось. audio=" & audioKey & ", элемент=" & DescribeItem(activeItem))
	If PromotePreparedPlayer(0, 0) Then Return True
	Wait For (PlayPreparedOrLoadNext) Complete (unused As Boolean)
	Return True
End Sub

Private Sub HandleAudioTimeupdate(audioKey As String) As ResumableSub
	If audioKey <> activeAudioKey Then Return False
	If isStarted = False Or isStoppedByUser Then Return False
	If ShouldTriggerBreakNow Then
		TraceLog("Достигнута точка exact-break.")
		Wait For (FadeOutAndContinue) Complete (unused As Boolean)
		Return True
	End If
	Dim remain As Long = EffectiveTrackRemainMs
	If CanCrossfadePreparedItem And remain > 0 And remain <= TRACK_OVERLAP_MS Then
		isCrossfadeTriggered = True
		TraceLog("Запуск overlap треков. remainMs=" & remain & ", next=" & DescribeItem(preparedItem))
		PromotePreparedPlayer(PreparedFadeInMs, PreparedFadeOutMs)
		Return True
	End If
	If CanStartPreparedOnTrackTail And remain > 0 And remain <= AD_TAIL_OVERLAP_MS Then
		isCrossfadeTriggered = True
		TraceLog("Запуск ролика на хвосте трека. remainMs=" & remain & ", next=" & DescribeItem(preparedItem))
		PromotePreparedPlayer(PreparedFadeInMs, PreparedFadeOutMs)
		Return True
	End If
	If prefetchDone Then Return False
	If remain <= 0 Then Return False
	If remain <= PREFETCH_SECONDS * 1000 Then
		prefetchDone = True
		TraceLog("Запуск предзагрузки следующего элемента. remainMs=" & remain)
		Wait For (PrefetchNext) Complete (unused2 As Boolean)
	End If
	Return True
End Sub

Public Sub TraceLog(message As String)
	If traceLogs.IsInitialized = False Then traceLogs.Initialize
	Dim entry As String = DateTime.Date(DateTime.Now) & " " & DateTime.Time(DateTime.Now) & " | " & message
	traceLogs.Add(entry)
	Do While traceLogs.Size > traceLogLimit
		traceLogs.RemoveAt(0)
	Loop
	Log(entry)
End Sub

Public Sub GetTraceLogText As String
	If traceLogs.IsInitialized = False Or traceLogs.Size = 0 Then Return ""
	Return JoinList(traceLogs, CRLF)
End Sub

Public Sub GetTraceLogList As List
	Dim copy As List
	copy.Initialize
	If traceLogs.IsInitialized = False Then Return copy
	For Each entry As String In traceLogs
		copy.Add(entry)
	Next
	Return copy
End Sub

Public Sub GetServerTraceText As String
	If serverSnapshots.IsInitialized = False Or serverSnapshots.Size = 0 Then Return ""
	Dim lines As List
	lines.Initialize
	For Each entry As Map In serverSnapshots
		lines.Add(entry.GetDefault("Header", ""))
		lines.Add(entry.GetDefault("Body", ""))
		lines.Add("")
	Next
	Return JoinList(lines, CRLF)
End Sub

Public Sub GetServerTraceList As List
	Dim copy As List
	copy.Initialize
	If serverSnapshots.IsInitialized = False Then Return copy
	For Each entry As Map In serverSnapshots
		copy.Add(CloneMap(entry))
	Next
	Return copy
End Sub

Private Sub SaveServerSnapshot(method As String, url As String, success As Boolean, body As String, errorMessage As String)
	If serverSnapshots.IsInitialized = False Then serverSnapshots.Initialize
	Dim timestamp As String = DateTime.Date(DateTime.Now) & " " & DateTime.Time(DateTime.Now)
	Dim header As String = timestamp & " | " & method & " | success=" & success & " | " & url
	If errorMessage <> "" Then header = header & " | error=" & errorMessage
	Dim entry As Map
	entry.Initialize
	entry.Put("Timestamp", timestamp)
	entry.Put("Method", method)
	entry.Put("Url", url)
	entry.Put("Success", success)
	entry.Put("Error", errorMessage)
	entry.Put("Body", body)
	entry.Put("Header", header)
	serverSnapshots.Add(entry)
	Do While serverSnapshots.Size > serverSnapshotLimit
		serverSnapshots.RemoveAt(0)
	Loop
	WriteServerSnapshotFile(entry)
	CleanupServerSnapshotFiles
End Sub

Private Sub WriteServerSnapshotFile(entry As Map)
	Try
		EnsureDirectory(storageDir)
		EnsureDirectory(debugResponsesDir)
		Dim stamp As String = Regex.Replace("[^0-9]", entry.GetDefault("Timestamp", ""), "")
		If stamp = "" Then stamp = "" & DateTime.Now
		Dim name As String = stamp & "_" & entry.GetDefault("Method", "REQ") & ".txt"
		Dim text As String = entry.GetDefault("Header", "") & CRLF & CRLF & entry.GetDefault("Body", "")
		File.WriteString(debugResponsesDir, name, text)
	Catch
		TraceLog("Не удалось записать snapshot сервера. " & LastException.Message)
	End Try
End Sub

Private Sub EnsureDirectory(path As String)
	Dim joFile As JavaObject
	joFile.InitializeNewInstance("java.io.File", Array As Object(path))
	joFile.RunMethod("mkdirs", Null)
End Sub

Private Sub CleanupServerSnapshotFiles
	Try
		If File.Exists(debugResponsesDir, "") = False Then Return
		Dim files As List = File.ListFiles(debugResponsesDir)
		If files.IsInitialized = False Or files.Size <= serverSnapshotLimit Then Return
		files.Sort(True)
		Do While files.Size > serverSnapshotLimit
			Dim fileName As String = files.Get(0)
			File.Delete(debugResponsesDir, fileName)
			files.RemoveAt(0)
		Loop
	Catch
		TraceLog("Не удалось очистить старые snapshots сервера. " & LastException.Message)
	End Try
End Sub

Private Sub DescribeItem(itemObj As Object) As String
	If itemObj Is Map Then
	Else
		Return "<empty>"
	End If
	Dim item As Map = itemObj
	If item.IsInitialized = False Then Return "<empty>"
	Dim parts As List
	parts.Initialize
	parts.Add("тип=" & item.GetDefault("type", ""))
	If item.GetDefault("id", "") <> "" Then parts.Add("id=" & item.GetDefault("id", ""))
	If item.GetDefault("title", "") <> "" Then parts.Add("название=" & item.GetDefault("title", ""))
	If item.GetDefault("stream", "") <> "" Then parts.Add("поток=" & item.GetDefault("stream", ""))
	If item.GetDefault("set", "") <> "" Then parts.Add("сет=" & item.GetDefault("set", ""))
	If item.GetDefault("code", "") <> "" Then parts.Add("код=" & item.GetDefault("code", ""))
	Return JoinList(parts, ", ")
End Sub

Private Sub SetPlayIcon
	SetLabelStyle(lblPlayIcon, "-fx-alignment: center; -fx-text-fill: " & ColorToCss(0xFFD0FF71) & "; -fx-padding: 0;")
	lblPlayIcon.Text = ICON_PLAY
	ApplyMaterialIconFont(lblPlayIcon, playIconBaseSize)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x00D0FF71, 999dip)
	StopOrbitAnimation
	UpdatePlayButtonAppearance(False)
End Sub

Private Sub SetStopIcon
	SetLabelStyle(lblPlayIcon, "-fx-alignment: center; -fx-text-fill: " & ColorToCss(0xFFD0FF71) & "; -fx-padding: 0;")
	lblPlayIcon.Text = ICON_STOP
	ApplyMaterialIconFont(lblPlayIcon, stopIconBaseSize)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, 0x66D0FF71, 999dip)
	StartOrbitAnimation
	UpdatePlayButtonAppearance(False)
End Sub

Private Sub UpdatePlayButtonAppearance(isHovered As Boolean)
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

Private Sub StartOrbitAnimation
	orbitPulseStep = 0
	orbitFadeTarget = 1
	orbitTimer.Enabled = True
End Sub

Private Sub StopOrbitAnimation
	orbitFadeTarget = 0
	If orbitFadeValue > 0 Then
		orbitTimer.Enabled = True
	Else
		orbitTimer.Enabled = False
		ApplyOrbitFrame(0)
	End If
End Sub

Private Sub OrbitTimer_Tick
	orbitPulseStep = (orbitPulseStep + 1) Mod 24
	Dim fadeStep As Double = orbitTimer.Interval / ORBIT_FADE_MS
	If orbitFadeValue < orbitFadeTarget Then
		orbitFadeValue = Min(orbitFadeTarget, orbitFadeValue + fadeStep)
	Else If orbitFadeValue > orbitFadeTarget Then
		orbitFadeValue = Max(orbitFadeTarget, orbitFadeValue - fadeStep)
	End If
	ApplyOrbitFrame(orbitPulseStep)
	If orbitFadeValue = 0 And orbitFadeTarget = 0 Then orbitTimer.Enabled = False
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

Private Sub UpdateHeaderActionAppearance(isHovered As Boolean)
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
	SetPaneStyle(headerActionPane, "-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;")
	SetLabelStyle(lblHeaderAction, "-fx-alignment: center; -fx-text-fill: " & ColorToCss(textColor) & ";")
	ApplyMaterialIconFont(lblHeaderAction, headerActionFontSize)
End Sub

Private Sub UpdateTextButtonAppearance(buttonView As B4XView, isHovered As Boolean)
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
	SetPaneStyle(buttonView, "-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: " & ColorToCss(textColor) & ";")
	buttonView.Font = xui.CreateDefaultBoldFont(13)
End Sub

Private Sub UpdateCodeInputAppearance(isFocused As Boolean)
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
	SetPaneStyle(accessCirclePane, "-fx-background-radius: 999; -fx-border-radius: 999;")
	SetPaneStyle(accessCorePane, "-fx-background-radius: 999; -fx-border-radius: 999;")
	SetPaneStyle(accessInputPane, "-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;")
	SetPaneStyle(txtPlayerCodeView, "-fx-background-color: transparent; -fx-text-fill: " & ColorToCss(0xFFF2F7FB) & "; -fx-prompt-text-fill: " & ColorToCss(0x66FFFFFF) & "; -fx-highlight-fill: transparent; -fx-highlight-text-fill: " & ColorToCss(0xFFF2F7FB) & "; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: " & codeFontSize & "px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;")
End Sub

Private Sub BringToFront(view As B4XView)
	Dim jo As JavaObject = view
	jo.RunMethod("toFront", Null)
End Sub

Private Sub ApplyStoppedState
	ShowStream(MessageValue("idle_stream"))
	SetStatusText("")
End Sub

Private Sub HideContentBlocks
	HidePin
	SetStreamText("")
	SetStatusText("")
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
End Sub

Private Sub ShowStream(text As String)
	SetStreamText(text)
End Sub

Private Sub ShowMessage(text As String)
	HideContentBlocks
	SetStatusText(text)
End Sub

Private Sub ShowClaimPrompt(text As String)
	HideContentBlocks
	isStarted = False
	isStoppedByUser = True
	SetPlayIcon
	SetStatusText(text)
	confirmPane.Visible = True
	LayoutUi(rootView.Width, rootView.Height)
End Sub

Private Sub HidePin
	confirmPane.Visible = False
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
End Sub

Private Sub ShowTrackMeta(item As Map)
	Dim parts As List
	parts.Initialize
	If item.GetDefault("set", "") <> "" Then parts.Add(item.Get("set"))
	If item.GetDefault("code", "") <> "" Then parts.Add(item.Get("code"))
	SetStatusText(JoinList(parts, " • "))
End Sub

Private Sub ShowAdMeta(item As Map)
	SetStatusText(item.GetDefault("title", ""))
End Sub

Private Sub SetStreamText(text As String)
	lblStream.Text = text
End Sub

Private Sub SetStatusText(text As String)
	lblInfo.Text = text
End Sub

Private Sub RenderPlayerHead(code As String, title As String)
	Dim safeCode As String = FormatPlayerCodeForDisplay(code)
	If title <> "" Then
		lblHeader.Text = safeCode & " • " & title.ToUpperCase
	Else
		lblHeader.Text = safeCode
	End If
End Sub

Private Sub MediaUrl(item As Map) As String
	Dim id As String = item.GetDefault("id", "")
	If id = "" Then Return ""
	Dim first As String = id.SubString2(0, 1)
	Dim folder As String
	If item.GetDefault("type", "") = "ad" Then
		folder = "ads"
	Else
		folder = "tracks"
	End If
	Return "https://cdn.fon.fm/media/" & folder & "/" & first & "/" & id & ".mp3"
End Sub

Private Sub CurrentVolume(item As Map) As Double
	Return ResolveItemVolume(item)
End Sub

Private Sub ResolveItemVolume(item As Map) As Double
	If item.IsInitialized = False Then Return 0.7
	Dim itemType As String = item.GetDefault("type", "")
	Dim gainDb As Double = NormalizeDbValue(item.GetDefault("gain", -3), -3)
	Dim baseFactor As Double = 1
	If itemType = "track" Then baseFactor = ResolvePlayerLevelFactor
	Return Max(0, Min(1, baseFactor * DbToFactor(gainDb)))
End Sub

Private Sub ResolvePlayerLevelFactor As Double
	Dim playerData As Map = offlineData.GetDefault("player", CreateInitializedMap)
	Dim playerLevel As Double = playerData.GetDefault("level", 100)
	Return PlayerLevelToFactor(playerLevel)
End Sub

Private Sub NormalizeQueueResponse(data As Object) As List
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

Private Sub NormalizeRetryAfter(data As Object) As Int
	If data Is Map Then
		Dim m As Map = data
		If m.ContainsKey("retry_after") = False Then Return 0
		Dim value As Int = m.Get("retry_after")
		If value <= 0 Then Return 0
		Return value
	End If
	Return 0
End Sub

Private Sub ShiftQueueItem As Object
	If playQueue.Size = 0 Then Return Null
	Dim item As Object = playQueue.Get(0)
	playQueue.RemoveAt(0)
	Return item
End Sub

Private Sub ResolveErrorMessage(result As Map, fallback As String) As String
	If result.GetDefault("Success", False) Then
		Dim resultData As Object = result.Get("Data")
		If resultData Is Map Then
			Dim m As Map = resultData
			If m.GetDefault("message", "") <> "" Then Return m.Get("message")
		End If
	End If
	Dim errorMessage As String = result.GetDefault("ErrorMessage", "")
	If errorMessage <> "" Then Return errorMessage
	Return fallback
End Sub

Private Sub CreateMetaParams As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("tz", TimezoneOffsetMinutes)
	Return params
End Sub

Private Sub CreateNextParams As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("tz", TimezoneOffsetMinutes)
	params.Put("version", APP_VERSION)
	If nextStartMode = "manual" Or nextStartMode = "auto" Then params.Put("start", nextStartMode)
	If playlistIndex >= 0 Then params.Put("playlist", playlistIndex)
	Return params
End Sub

Private Sub CreateClaimParams As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("tz", TimezoneOffsetMinutes)
	Return params
End Sub

Private Sub CreateDataParams As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("tz", TimezoneOffsetMinutes)
	params.Put("version", APP_VERSION)
	Return params
End Sub

Private Sub BuildParams(params As Map) As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each key As String In params.Keys
		If sb.Length > 0 Then sb.Append("&")
		sb.Append(UrlEncode(key)).Append("=").Append(UrlEncode(params.Get(key)))
	Next
	Return sb.ToString
End Sub

Private Sub UrlEncode(value As Object) As String
	Dim jo As JavaObject
	jo.InitializeStatic("java.net.URLEncoder")
	Return jo.RunMethod("encode", Array As Object("" & value, "UTF-8"))
End Sub

Private Sub NormalizePlayerCode(value As String) As String
	Dim code As String = value.Trim.ToLowerCase
	If Regex.IsMatch("^[a-z0-9]{5}$", code) Then Return code
	Return ""
End Sub

Private Sub FilterPlayerCode(value As String) As String
	Dim filtered As String = Regex.Replace("[^A-Za-z0-9]", value, "")
	If filtered.Length > 5 Then filtered = filtered.SubString2(0, 5)
	Return filtered.ToUpperCase
End Sub

Private Sub FormatPlayerCodeForDisplay(value As String) As String
	Return value.Trim.ToUpperCase
End Sub

Private Sub GetOrCreateDeviceId As String
	Dim id As String = storage.GetDefault("device_id", "")
	If id <> "" Then Return id
	id = CreateRandomDeviceId
	SaveValue("device_id", id)
	Return id
End Sub

Private Sub CreateRandomDeviceId As String
	Dim jo As JavaObject
	jo.InitializeStatic("java.util.UUID")
	Dim uuid As JavaObject = jo.RunMethod("randomUUID", Null)
	Return uuid.RunMethod("toString", Null)
End Sub

Private Sub ResolveMachineGuidAsync
	Try
		machineGuidShell.Initialize("MachineGuidShell", "reg", Array As String("query", "HKLM\SOFTWARE\Microsoft\Cryptography", "/v", "MachineGuid"))
		machineGuidShell.Run(-1)
		TraceLog("Запущено чтение MachineGuid из реестра.")
	Catch
		TraceLog("Не удалось запустить чтение MachineGuid. " & LastException.Message)
	End Try
End Sub

Private Sub MachineGuidShell_ProcessCompleted (success As Boolean, exitCode As Int, stdOut As String, stdErr As String)
	If success And exitCode = 0 Then
		Dim matcher As Matcher = Regex.Matcher("MachineGuid\s+REG_\w+\s+([^\r\n]+)", stdOut)
		If matcher.Find Then
			Dim machineGuid As String = matcher.Group(1).Trim.ToLowerCase
			If machineGuid = "" Then
				TraceLog("MachineGuid получен пустым.")
				Return
			End If
			If deviceId <> machineGuid Then
				deviceId = machineGuid
				SaveValue("device_id", deviceId)
				TraceLog("deviceId обновлен из MachineGuid: " & deviceId)
			Else
				TraceLog("MachineGuid совпадает с текущим deviceId.")
			End If
		Else
			TraceLog("MachineGuid не найден в выводе reg.")
		End If
	Else
		TraceLog("Ошибка чтения MachineGuid. success=" & success & ", exitCode=" & exitCode & ", stderr=" & stdErr)
	End If
End Sub

Private Sub SaveValue(key As String, value As Object)
	storage.Put(key, value)
End Sub

Private Sub MigrateLegacyStorageIfNeeded
	If File.Exists(storageDir, storageFile) = False Then Return
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(storageDir, storageFile))
		Dim legacy As Map = parser.NextObject
		If legacy.IsInitialized Then
			For Each key As String In legacy.Keys
				storage.Put(key, legacy.Get(key))
			Next
			TraceLog("Данные перенесены из legacy JSON в KVS.")
			File.Delete(storageDir, storageFile)
		End If
	Catch
		TraceLog("Не удалось перенести legacy JSON в KVS. " & LastException.Message)
	End Try
End Sub

Private Sub LoadOfflineData As Map
	Dim data As Map
	data.Initialize
	If File.Exists(storageDir, offlineDataFile) = False Then Return data
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(storageDir, offlineDataFile))
		Dim parsedData As Map = parser.NextObject
		If parsedData.IsInitialized Then
			data = parsedData
			TraceLog("Офлайн-метаданные загружены. playlists=" & GetOfflinePlaylistIds(data).Size & ", ads=" & GetOfflineAdsCount(data) & ", schedules=" & GetOfflineSchedulesCount(data))
		End If
	Catch
		data.Initialize
		TraceLog("Не удалось загрузить offline_data.json. " & LastException.Message)
	End Try
	Return data
End Sub

Private Sub SaveOfflineData(sourceData As Map)
	Dim normalizedData As Map = NormalizeOfflineData(sourceData)
	offlineData = normalizedData
	offlineDataUpdatedAt = DateTime.Now
	SaveValue("offline_data_updated_at", offlineDataUpdatedAt)
	SaveValue("offline_data_source_updated", normalizedData.GetDefault("updated", ""))
	Dim playlistIds As List = GetOfflinePlaylistIds(normalizedData)
	Dim playlistDescriptors As List = BuildOfflinePlaylistDescriptors(normalizedData)
	Dim playlistCacheStatus As Map = CompareOfflinePlaylistsWithCache(playlistDescriptors)
	SaveValue("offline_playlist_ids", playlistIds)
	SaveValue("offline_playlist_descriptors", playlistDescriptors)
	SaveValue("offline_playlist_download_ids", playlistCacheStatus.GetDefault("DownloadIds", CreateInitializedList))
	SaveValue("offline_playlist_missing_count", playlistCacheStatus.GetDefault("MissingCount", 0))
	SaveValue("offline_playlist_outdated_count", playlistCacheStatus.GetDefault("OutdatedCount", 0))
	SaveValue("offline_playlist_actual_count", playlistCacheStatus.GetDefault("ActualCount", 0))
	SaveValue("offline_ads_count", GetOfflineAdsCount(normalizedData))
	SaveValue("offline_schedules_count", GetOfflineSchedulesCount(normalizedData))
	Dim generator As JSONGenerator
	generator.Initialize(normalizedData)
	File.WriteString(storageDir, offlineDataFile, generator.ToString)
	WriteOfflinePlaylistRequirementsFile(playlistDescriptors)
	TraceLog("Офлайн-метаданные сохранены. playlists=" & playlistIds.Size & ", ads=" & GetOfflineAdsCount(normalizedData) & ", schedules=" & GetOfflineSchedulesCount(normalizedData) & ", missingPlaylists=" & playlistCacheStatus.GetDefault("MissingCount", 0) & ", outdatedPlaylists=" & playlistCacheStatus.GetDefault("OutdatedCount", 0))
End Sub

Private Sub NormalizeOfflineData(sourceData As Map) As Map
	Dim normalizedData As Map
	normalizedData.Initialize
	normalizedData.Put("ok", sourceData.GetDefault("ok", False))
	normalizedData.Put("type", sourceData.GetDefault("type", ""))
	normalizedData.Put("updated", sourceData.GetDefault("updated", ""))
	normalizedData.Put("saved_at", DateTime.Now)
	normalizedData.Put("player_code", playerCode)
	normalizedData.Put("device_id", deviceId)
	If sourceData.ContainsKey("player") Then normalizedData.Put("player", sourceData.Get("player"))
	If sourceData.ContainsKey("ads") Then normalizedData.Put("ads", sourceData.Get("ads"))
	If sourceData.ContainsKey("schedules") Then normalizedData.Put("schedules", sourceData.Get("schedules"))
	Return normalizedData
End Sub

Private Sub GetOfflinePlaylistIds(data As Map) As List
	Dim playlistIds As List
	playlistIds.Initialize
	If data.IsInitialized = False Then Return playlistIds
	Dim uniqueIds As Map
	uniqueIds.Initialize
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return playlistIds
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					Dim playlists As List = slot.GetDefault("playlists", Null)
					If playlists.IsInitialized = False Then Continue
					For Each playlistObject As Object In playlists
						If playlistObject Is Map Then
							Dim playlist As Map = playlistObject
							Dim playlistId As String = playlist.GetDefault("id", "")
							If playlistId <> "" And uniqueIds.ContainsKey(playlistId) = False Then
								uniqueIds.Put(playlistId, True)
								playlistIds.Add(playlistId)
							End If
						End If
					Next
				End If
			Next
		End If
	Next
	Return playlistIds
End Sub

Private Sub GetOfflineAdsCount(data As Map) As Int
	If data.IsInitialized = False Then Return 0
	Dim ads As List = data.GetDefault("ads", Null)
	If ads.IsInitialized = False Then Return 0
	Return ads.Size
End Sub

Private Sub GetOfflineSchedulesCount(data As Map) As Int
	If data.IsInitialized = False Then Return 0
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return 0
	Return schedules.Size
End Sub

Private Sub BuildOfflinePlaylistDescriptors(data As Map) As List
	Dim descriptors As List
	descriptors.Initialize
	If data.IsInitialized = False Then Return descriptors
	Dim uniqueDescriptors As Map
	uniqueDescriptors.Initialize
	Dim schedules As List = data.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Then Return descriptors
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			Dim scheduleTitle As String = schedule.GetDefault("title", "")
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					Dim slotTime As String = slot.GetDefault("time", "")
					Dim streamId As String = slot.GetDefault("stream", "")
					Dim playlists As List = slot.GetDefault("playlists", Null)
					If playlists.IsInitialized = False Then Continue
					For Each playlistObject As Object In playlists
						If playlistObject Is Map Then
							Dim playlist As Map = playlistObject
							Dim playlistId As String = playlist.GetDefault("id", "")
							If playlistId = "" Then Continue
							If uniqueDescriptors.ContainsKey(playlistId) Then Continue
							Dim descriptor As Map
							descriptor.Initialize
							descriptor.Put("id", playlistId)
							descriptor.Put("updated", playlist.GetDefault("updated", ""))
							descriptor.Put("title", playlist.GetDefault("title", ""))
							descriptor.Put("schedule_title", scheduleTitle)
							descriptor.Put("slot_time", slotTime)
							descriptor.Put("stream_id", streamId)
							uniqueDescriptors.Put(playlistId, descriptor)
							descriptors.Add(descriptor)
						End If
					Next
				End If
			Next
		End If
	Next
	Return descriptors
End Sub

Private Sub ResolveCurrentDataSlot As Map
	Dim slotContext As Map
	slotContext.Initialize
	If offlineData.IsInitialized = False Then Return slotContext
	Dim schedules As List = offlineData.GetDefault("schedules", Null)
	If schedules.IsInitialized = False Or schedules.Size = 0 Then Return slotContext
	Dim todayKey As String = FormatIsoDate(DateTime.Now)
	Dim nowMinutes As Int = CurrentMinutesOfDay
	Dim todayWeekday As String = CurrentIsoWeekday
	Dim matchedSlots As List
	matchedSlots.Initialize
	For Each scheduleObject As Object In schedules
		If scheduleObject Is Map Then
			Dim schedule As Map = scheduleObject
			If ScheduleAppliesToday(schedule, todayKey, todayWeekday) = False Then Continue
			Dim scheduleTitle As String = schedule.GetDefault("title", "")
			Dim slots As List = schedule.GetDefault("slots", Null)
			If slots.IsInitialized = False Then Continue
			For Each slotObject As Object In slots
				If slotObject Is Map Then
					Dim slot As Map = slotObject
					Dim slotTime As String = slot.GetDefault("time", "")
					Dim slotMinutes As Int = TimeStringToMinutes(slotTime)
					If slotMinutes < 0 Then Continue
					Dim entry As Map
					entry.Initialize
					entry.Put("schedule_title", scheduleTitle)
					entry.Put("slot_time", slotTime)
					entry.Put("slot_minutes", slotMinutes)
					entry.Put("stream_id", slot.GetDefault("stream", ""))
					entry.Put("playlists", slot.GetDefault("playlists", CreateInitializedList))
					matchedSlots.Add(entry)
				End If
			Next
		End If
	Next
	If matchedSlots.Size = 0 Then Return slotContext
	Dim selectedSlot As Map
	selectedSlot.Initialize
	Dim selectedMinutes As Int = -1
	For Each slotEntryObject As Object In matchedSlots
		Dim slotEntry As Map = slotEntryObject
		Dim slotMinutes As Int = slotEntry.GetDefault("slot_minutes", -1)
		If slotMinutes <= nowMinutes And slotMinutes >= selectedMinutes Then
			selectedSlot = slotEntry
			selectedMinutes = slotMinutes
		End If
	Next
	If selectedSlot.IsInitialized = False Then
		For Each slotEntryObject As Object In matchedSlots
			Dim slotEntry As Map = slotEntryObject
			Dim slotMinutes As Int = slotEntry.GetDefault("slot_minutes", -1)
			If slotMinutes > selectedMinutes Then
				selectedSlot = slotEntry
				selectedMinutes = slotMinutes
			End If
		Next
	End If
	Return selectedSlot
End Sub

Private Sub ScheduleAppliesToday(schedule As Map, todayKey As String, todayWeekday As String) As Boolean
	Dim startDate As String = schedule.GetDefault("start", "")
	If startDate <> "" And startDate.CompareTo(todayKey) > 0 Then Return False
	Dim weekdays As List = schedule.GetDefault("weekdays", Null)
	If weekdays.IsInitialized = False Or weekdays.Size = 0 Then Return True
	For Each weekdayObject As Object In weekdays
		If ("" & weekdayObject).Trim = todayWeekday Then Return True
	Next
	Return False
End Sub

Private Sub ChooseNextPlaylistDescriptor(currentSlot As Map) As Map
	Dim emptyDescriptor As Map
	emptyDescriptor.Initialize
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return emptyDescriptor
	Dim slotKey As String = BuildDataSlotKey(currentSlot)
	Dim cursorValue As Int = dataSlotPlaylistCursors.GetDefault(slotKey, 0)
	If cursorValue < 0 Then cursorValue = 0
	Dim playlistIndexForSlot As Int = cursorValue Mod playlists.Size
	dataSlotPlaylistCursors.Put(slotKey, playlistIndexForSlot + 1)
	Dim playlistObject As Object = playlists.Get(playlistIndexForSlot)
	If playlistObject Is Map Then
		Dim playlist As Map = playlistObject
		TraceLog("Выбран playlist для локального воспроизведения. slot=" & slotKey & ", index=" & playlistIndexForSlot & ", playlistId=" & playlist.GetDefault("id", "") & ", title=" & playlist.GetDefault("title", ""))
		Return playlistObject
	End If
	Return emptyDescriptor
End Sub

Private Sub BuildDataSlotKey(currentSlot As Map) As String
	Return currentSlot.GetDefault("schedule_title", "") & "|" & currentSlot.GetDefault("stream_id", "") & "|" & currentSlot.GetDefault("slot_time", "")
End Sub

Private Sub LoadCachedPlaylistMetadata(playlistId As String) As Map
	Dim playlistData As Map
	playlistData.Initialize
	If playlistId = "" Then Return playlistData
	If File.Exists(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId)) = False Then Return playlistData
	Try
		Dim parser As JSONParser
		parser.Initialize(File.ReadString(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId)))
		Dim parsedData As Map = parser.NextObject
		If parsedData.IsInitialized Then playlistData = parsedData
	Catch
		playlistData.Initialize
		TraceLog("Не удалось загрузить playlist metadata из кэша. id=" & playlistId & ", message=" & LastException.Message)
	End Try
	Return playlistData
End Sub

Private Sub EnsureSinglePlaylistMetadata(descriptor As Map) As ResumableSub
	Dim cachedPlaylistIndex As Map = storage.GetDefault("cached_playlist_index", CreateInitializedMap)
	Wait For (DownloadOfflinePlaylistMetadata(descriptor, cachedPlaylistIndex)) Complete (downloaded As Boolean)
	If downloaded Then storage.Put("cached_playlist_index", cachedPlaylistIndex)
	Return downloaded
End Sub

Private Sub ChooseRandomTrackFromPlaylist(playlistData As Map) As Map
	Dim emptyTrack As Map
	emptyTrack.Initialize
	If playlistData.IsInitialized = False Then Return emptyTrack
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Or tracks.Size = 0 Then Return emptyTrack
	Dim filteredTracks As List
	filteredTracks.Initialize
	For Each trackObject As Object In tracks
		If trackObject Is Map Then
			Dim track As Map = trackObject
			Dim trackId As String = track.GetDefault("id", "")
			If trackId = "" Then Continue
			If recentResolvedTrackIds.IndexOf(trackId) = -1 Then filteredTracks.Add(track)
		End If
	Next
	Dim sourceTracks As List = tracks
	If filteredTracks.Size > 0 Then sourceTracks = filteredTracks
	Dim randomIndex As Int = Rnd(0, sourceTracks.Size)
	Dim trackObject As Object = sourceTracks.Get(randomIndex)
	If trackObject Is Map Then Return trackObject
	Return emptyTrack
End Sub

Private Sub CreateQueueTrackFromPlaylist(currentSlot As Map, playlistDescriptor As Map, track As Map) As Map
	Dim item As Map
	item.Initialize
	item.Put("type", "track")
	item.Put("id", track.GetDefault("id", ""))
	item.Put("code", track.GetDefault("code", ""))
	item.Put("set", track.GetDefault("set", ""))
	item.Put("duration", track.GetDefault("duration", 0))
	item.Put("gain", track.GetDefault("gain", -3))
	item.Put("stream", ResolvePlaybackStreamTitle(currentSlot, playlistDescriptor))
	item.Put("playlist_id", playlistDescriptor.GetDefault("id", ""))
	item.Put("playlist_title", playlistDescriptor.GetDefault("title", ""))
	item.Put("schedule_title", currentSlot.GetDefault("schedule_title", ""))
	item.Put("slot_time", currentSlot.GetDefault("slot_time", ""))
	Return item
End Sub

Private Sub ResolvePlaybackStreamTitle(currentSlot As Map, playlistDescriptor As Map) As String
	Dim scheduleTitle As String = currentSlot.GetDefault("schedule_title", "")
	If scheduleTitle <> "" Then Return scheduleTitle
	Return playlistDescriptor.GetDefault("title", "")
End Sub

Private Sub ResolveTrackVolumeFromData(track As Map) As Double
	Dim baseFactor As Double = ResolvePlayerLevelFactor
	Dim gainDb As Double = NormalizeDbValue(track.GetDefault("gain", -3), -3)
	Return Max(0, Min(1, baseFactor * DbToFactor(gainDb)))
End Sub

Private Sub PlayerLevelToFactor(levelValue As Double) As Double
	Dim normalized As Double = Max(0, Min(1, levelValue / 100))
	If normalized <= 0 Then Return 0
	Return Power(normalized, 0.7)
End Sub

Private Sub NormalizeDbValue(value As Object, fallbackValue As Double) As Double
	Dim db As Double = fallbackValue
	Try
		db = value
	Catch
		db = fallbackValue
	End Try
	If db > 0 Then db = 0
	If db < -24 Then db = -24
	Return db
End Sub

Private Sub DbToFactor(db As Double) As Double
	If db >= 0 Then Return 1
	Return Power(10, db / 20)
End Sub

Private Sub RememberResolvedTrack(trackId As String)
	If trackId = "" Then Return
	recentResolvedTrackIds.Add(trackId)
	Do While recentResolvedTrackIds.Size > 20
		recentResolvedTrackIds.RemoveAt(0)
	Loop
End Sub

Private Sub FormatIsoDate(ticks As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim value As String = DateTime.Date(ticks)
	DateTime.DateFormat = previousDateFormat
	Return value
End Sub

Private Sub CurrentMinutesOfDay As Int
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "HH:mm:ss"
	Dim timeValue As String = DateTime.Time(DateTime.Now)
	DateTime.TimeFormat = previousTimeFormat
	Dim parts() As String = Regex.Split(":", timeValue)
	If parts.Length < 2 Then Return 0
	Return parts(0) * 60 + parts(1)
End Sub

Private Sub CurrentIsoWeekday As String
	Dim jo As JavaObject
	jo.InitializeStatic("java.time.LocalDate")
	Dim today As JavaObject = jo.RunMethod("now", Null)
	Dim dayOfWeek As JavaObject = today.RunMethod("getDayOfWeek", Null)
	Return "" & dayOfWeek.RunMethod("getValue", Null)
End Sub

Private Sub TimeStringToMinutes(value As String) As Int
	If value = "" Then Return -1
	Dim parts() As String = Regex.Split(":", value)
	If parts.Length < 2 Then Return -1
	Try
		Dim hours As Int = parts(0)
		Dim minutes As Int = parts(1)
		If hours < 0 Or hours > 23 Then Return -1
		If minutes < 0 Or minutes > 59 Then Return -1
		Return hours * 60 + minutes
	Catch
		Return -1
	End Try
End Sub

Private Sub CompareOfflinePlaylistsWithCache(descriptors As List) As Map
	Dim result As Map
	result.Initialize
	Dim downloadIds As List
	downloadIds.Initialize
	Dim cachedPlaylistIndex As Map = storage.GetDefault("cached_playlist_index", CreateInitializedMap)
	Dim missingCount As Int = 0
	Dim outdatedCount As Int = 0
	Dim actualCount As Int = 0
	For Each descriptorObject As Object In descriptors
		If descriptorObject Is Map Then
			Dim descriptor As Map = descriptorObject
			Dim playlistId As String = descriptor.GetDefault("id", "")
			If playlistId = "" Then Continue
			If cachedPlaylistIndex.ContainsKey(playlistId) = False Then
				missingCount = missingCount + 1
				downloadIds.Add(playlistId)
				Continue
			End If
			Dim cachedEntryObject As Object = cachedPlaylistIndex.Get(playlistId)
			If cachedEntryObject Is Map Then
				Dim cachedEntry As Map = cachedEntryObject
				If cachedEntry.GetDefault("updated", "") <> descriptor.GetDefault("updated", "") Then
					outdatedCount = outdatedCount + 1
					downloadIds.Add(playlistId)
				Else
					actualCount = actualCount + 1
				End If
			Else
				missingCount = missingCount + 1
				downloadIds.Add(playlistId)
			End If
		End If
	Next
	result.Put("DownloadIds", downloadIds)
	result.Put("MissingCount", missingCount)
	result.Put("OutdatedCount", outdatedCount)
	result.Put("ActualCount", actualCount)
	Return result
End Sub

Private Sub WriteOfflinePlaylistRequirementsFile(descriptors As List)
	Dim payload As Map
	payload.Initialize
	payload.Put("saved_at", DateTime.Now)
	payload.Put("player_code", playerCode)
	payload.Put("descriptors", descriptors)
	Dim generator As JSONGenerator
	generator.Initialize(payload)
	File.WriteString(storageDir, offlinePlaylistRequirementsFile, generator.ToString)
End Sub

Private Sub SyncOfflinePlaylistMetadata As ResumableSub
	Dim playlistDescriptors As List = storage.GetDefault("offline_playlist_descriptors", CreateInitializedList)
	If playlistDescriptors.IsInitialized = False Or playlistDescriptors.Size = 0 Then
		TraceLog("Для синхронизации playlist metadata ничего не найдено.")
		Return False
	End If
	EnsureDirectory(GetOfflinePlaylistsDir)
	Dim cachedPlaylistIndex As Map = storage.GetDefault("cached_playlist_index", CreateInitializedMap)
	Dim downloadedCount As Int = 0
	Dim updatedCount As Int = 0
	Dim failedCount As Int = 0
	For Each descriptorObject As Object In playlistDescriptors
		If descriptorObject Is Map Then
			Dim descriptor As Map = descriptorObject
			Dim syncAction As String = ResolvePlaylistSyncAction(descriptor, cachedPlaylistIndex)
			If syncAction = "skip" Then Continue
			Wait For (DownloadOfflinePlaylistMetadata(descriptor, cachedPlaylistIndex)) Complete (downloaded As Boolean)
			If downloaded Then
				If syncAction = "missing" Then
					downloadedCount = downloadedCount + 1
				Else
					updatedCount = updatedCount + 1
				End If
			Else
				failedCount = failedCount + 1
			End If
		End If
	Next
	storage.Put("cached_playlist_index", cachedPlaylistIndex)
	Dim refreshedCacheStatus As Map = CompareOfflinePlaylistsWithCache(playlistDescriptors)
	SaveValue("offline_playlist_download_ids", refreshedCacheStatus.GetDefault("DownloadIds", CreateInitializedList))
	SaveValue("offline_playlist_missing_count", refreshedCacheStatus.GetDefault("MissingCount", 0))
	SaveValue("offline_playlist_outdated_count", refreshedCacheStatus.GetDefault("OutdatedCount", 0))
	SaveValue("offline_playlist_actual_count", refreshedCacheStatus.GetDefault("ActualCount", 0))
	TraceLog("Синхронизация playlist metadata завершена. downloaded=" & downloadedCount & ", updated=" & updatedCount & ", failed=" & failedCount & ", actual=" & refreshedCacheStatus.GetDefault("ActualCount", 0))
	Return failedCount = 0
End Sub

Private Sub ResolvePlaylistSyncAction(descriptor As Map, cachedPlaylistIndex As Map) As String
	Dim playlistId As String = descriptor.GetDefault("id", "")
	If playlistId = "" Then Return "skip"
	If cachedPlaylistIndex.ContainsKey(playlistId) = False Then Return "missing"
	Dim cachedEntryObject As Object = cachedPlaylistIndex.Get(playlistId)
	If cachedEntryObject Is Map Then
		Dim cachedEntry As Map = cachedEntryObject
		If cachedEntry.GetDefault("updated", "") <> descriptor.GetDefault("updated", "") Then Return "outdated"
		If File.Exists(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId)) = False Then Return "missing"
		Return "skip"
	End If
	Return "missing"
End Sub

Private Sub DownloadOfflinePlaylistMetadata(descriptor As Map, cachedPlaylistIndex As Map) As ResumableSub
	Dim playlistId As String = descriptor.GetDefault("id", "")
	If playlistId = "" Then Return False
	Dim playlistUrl As String = PlaylistMetadataUrl(playlistId)
	TraceLog("Загрузка playlist metadata. id=" & playlistId & ", url=" & playlistUrl)
	Wait For (FetchJsonWithTimeout(playlistUrl, FETCH_TIMEOUT_MS)) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		TraceLog("Не удалось загрузить playlist metadata. id=" & playlistId & ", message=" & result.GetDefault("ErrorMessage", ""))
		Return False
	End If
	Dim resultData As Object = result.Get("Data")
	If resultData Is Map Then
	Else
		TraceLog("Playlist metadata не является Map. id=" & playlistId)
		Return False
	End If
	Dim playlistData As Map = resultData
	Dim normalizedPlaylistData As Map = NormalizeOfflinePlaylistData(descriptor, playlistData)
	Dim generator As JSONGenerator
	generator.Initialize(normalizedPlaylistData)
	File.WriteString(GetOfflinePlaylistsDir, PlaylistMetadataFileName(playlistId), generator.ToString)
	Dim cachedEntry As Map
	cachedEntry.Initialize
	cachedEntry.Put("id", playlistId)
	cachedEntry.Put("updated", descriptor.GetDefault("updated", ""))
	cachedEntry.Put("saved_at", DateTime.Now)
	cachedEntry.Put("title", descriptor.GetDefault("title", ""))
	cachedEntry.Put("track_count", GetPlaylistTrackCount(normalizedPlaylistData))
	cachedPlaylistIndex.Put(playlistId, cachedEntry)
	TraceLog("Playlist metadata сохранен. id=" & playlistId & ", tracks=" & cachedEntry.GetDefault("track_count", 0) & ", updated=" & cachedEntry.GetDefault("updated", ""))
	Return True
End Sub

Private Sub NormalizeOfflinePlaylistData(descriptor As Map, playlistData As Map) As Map
	Dim normalizedPlaylistData As Map
	normalizedPlaylistData.Initialize
	For Each key As String In playlistData.Keys
		normalizedPlaylistData.Put(key, playlistData.Get(key))
	Next
	normalizedPlaylistData.Put("id", descriptor.GetDefault("id", ""))
	normalizedPlaylistData.Put("required_updated", descriptor.GetDefault("updated", ""))
	normalizedPlaylistData.Put("saved_at", DateTime.Now)
	Return normalizedPlaylistData
End Sub

Private Sub GetPlaylistTrackCount(playlistData As Map) As Int
	If playlistData.IsInitialized = False Then Return 0
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Then Return 0
	Return tracks.Size
End Sub

Private Sub GetOfflinePlaylistsDir As String
	Return File.Combine(storageDir, offlinePlaylistsDirName)
End Sub

Private Sub PlaylistMetadataFileName(playlistId As String) As String
	Return playlistId & ".json"
End Sub

Private Sub PlaylistMetadataUrl(playlistId As String) As String
	Return PLAYLIST_CDN_BASE_URL & playlistId & ".json"
End Sub

Private Sub CreateInitializedMap As Map
	Dim m As Map
	m.Initialize
	Return m
End Sub

Private Sub CreateInitializedList As List
	Dim items As List
	items.Initialize
	Return items
End Sub

Public Sub SaveWindowState
	#If B4J
	Try
		Dim form As Form = B4XPages.GetNativeParent(Me)
		Dim fx As JFX
		If form.IsInitialized = False Then Return
		If fx.PrimaryScreen.MaxX > form.Width Then
			storage.Put("WindowTop", form.WindowTop)
			storage.Put("WindowLeft", form.WindowLeft)
			storage.Put("WindowWidth", form.WindowWidth)
			storage.Put("WindowHeight", form.WindowHeight)
			TraceLog("Положение окна сохранено. left=" & form.WindowLeft & ", top=" & form.WindowTop & ", width=" & form.WindowWidth & ", height=" & form.WindowHeight)
		End If
	Catch
		TraceLog("Не удалось сохранить положение окна. " & LastException.Message)
	End Try
	#End If
End Sub

Private Sub RestoreWindowState
	#If B4J
	Try
		Dim form As Form = B4XPages.GetNativeParent(Me)
		If form.IsInitialized = False Then Return
		Dim fx As JFX
		Dim windowTop As Double = storage.GetDefault("WindowTop", -1)
		Dim windowLeft As Double = storage.GetDefault("WindowLeft", -1)
		Dim windowWidth As Double = storage.GetDefault("WindowWidth", -1)
		Dim windowHeight As Double = storage.GetDefault("WindowHeight", -1)
		Dim maxWidth As Double = fx.PrimaryScreen.MaxX - fx.PrimaryScreen.MinX
		Dim maxHeight As Double = fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY
		If windowTop > -1 Then form.WindowTop = windowTop
		If windowLeft > -1 Then form.WindowLeft = windowLeft
		If windowWidth > -1 Then form.WindowWidth = Min(maxWidth, Max(520, windowWidth))
		If windowHeight > -1 Then
			form.WindowHeight = Min(maxHeight, Max(640, windowHeight))
		Else If maxHeight < 640 Then
			form.WindowHeight = maxHeight
		End If
		TraceLog("Положение окна восстановлено. left=" & form.WindowLeft & ", top=" & form.WindowTop & ", width=" & form.WindowWidth & ", height=" & form.WindowHeight)
	Catch
		TraceLog("Не удалось восстановить положение окна. " & LastException.Message)
	End Try
	#End If
End Sub

Private Sub TimezoneOffsetMinutes As Int
	Dim jo As JavaObject
	jo.InitializeStatic("java.time.OffsetDateTime")
	Dim nowOffset As JavaObject = jo.RunMethod("now", Null)
	Dim zoneOffset As JavaObject = nowOffset.RunMethod("getOffset", Null)
	Dim totalSeconds As Int = zoneOffset.RunMethod("getTotalSeconds", Null)
	Return -Round(totalSeconds / 60)
End Sub

Private Sub LocalNowTimestamp As Long
	Return Floor(DateTime.Now / 1000) - (TimezoneOffsetMinutes * 60)
End Sub

Private Sub ToLongDefault(value As Object, defaultValue As Long) As Long
	Try
		If value = Null Then Return defaultValue
		Return value
	Catch
		Try
			Return Floor(("" & value).Trim)
		Catch
			Return defaultValue
		End Try
	End Try
End Sub

Private Sub JoinList(items As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To items.Size - 1
		If i > 0 Then sb.Append(separator)
		sb.Append(items.Get(i))
	Next
	Return sb.ToString
End Sub

Private Sub MessageValue(key As String) As String
	Return messages.GetDefault(key, "")
End Sub

Private Sub CreateLabel(text As String, fontSize As Float, textColor As Int, bold As Boolean, wrapText As Boolean) As B4XView
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

Private Sub CreateTextButton(text As String, eventName As String) As B4XView
	Dim btn As Button
	btn.Initialize(eventName)
	Dim xbtn As B4XView = btn
	xbtn.Text = text.ToUpperCase
	UpdateTextButtonAppearance(xbtn, False)
	Return xbtn
End Sub

Private Sub ApplyMaterialIconFont(view As B4XView, fontSize As Float)
	view.Font = xui.CreateMaterialIcons(fontSize)
End Sub

Private Sub SetPaneStyle(view As B4XView, style As String)
	Dim jo As JavaObject = view
	jo.RunMethod("setStyle", Array(MergeNodeStyle(jo.RunMethod("getStyle", Null), style)))
End Sub

Private Sub SetLabelStyle(view As B4XView, style As String)
	Dim jo As JavaObject = view
	jo.RunMethod("setStyle", Array(MergeNodeStyle(jo.RunMethod("getStyle", Null), style)))
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

Private Sub SetMouseTransparent(view As B4XView, value As Boolean)
	Dim jo As JavaObject = view
	jo.RunMethod("setMouseTransparent", Array(value))
End Sub

Private Sub SetPickOnBounds(view As B4XView, value As Boolean)
	Dim jo As JavaObject = view
	jo.RunMethod("setPickOnBounds", Array(value))
End Sub

Private Sub ScaleValue(availableWidth As Int, smallValue As Int, mediumValue As Int, largeValue As Int) As Int
	If availableWidth <= 420dip Then Return smallValue
	If availableWidth <= 720dip Then Return mediumValue
	Return largeValue
End Sub

Private Sub ColorToCss(color As Int) As String
	Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, color)
	Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)
	Return "#" & Bit.ToHexString(rgb)
End Sub
