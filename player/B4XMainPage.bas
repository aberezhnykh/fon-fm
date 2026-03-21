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
	Private Const HISTORY_FLUSH_INTERVAL_MS As Int = 30000
	Private Const DATA_BASE_URL As String = "https://play.fon.fm/data.php"
	Private Const PLAYLIST_CDN_BASE_URL As String = "https://cdn.fon.fm/data/playlists/"
	Private Const SERVICE_CHECK_URL As String = "https://play.fon.fm/meta"
	Private Const EXTERNAL_CONNECTIVITY_CHECK_URL As String = "https://radiosparx.ru/img/logo-dark.svg"
	Private Const APP_VERSION As String = "1.0.1"
	Private Const USE_DATA_PLAYBACK_RESOLVER As Boolean = True
	Private Const ICON_PLAY As String = Chr(0xE037)
	Private Const ICON_STOP As String = Chr(0xE047)
	Private Const ICON_MORE As String = Chr(0xE5D3)
	Private Const ICON_CLOSE As String = Chr(0xE5CD)
	Private Const ICON_CLOUD_OK As String = Chr(0xE2BF)
	Private Const ICON_CLOUD_OFF As String = Chr(0xE2C1)
	Private Const PREFETCH_SECONDS As Int = 10
	Private Const STOP_FADE_MS As Int = 3000
	Private Const ORBIT_FADE_MS As Int = 3000
	Private Const START_FADE_MS As Int = 1500
	Private Const TRACK_OVERLAP_MS As Int = 1800
	Private Const AD_TAIL_OVERLAP_MS As Int = 350
	Private Const TRACK_CACHE_WARMUP_DELAY_MS As Int = 7000
	Private Const CACHE_AUDIT_START_DELAY_MS As Int = 20000
	Private Const CACHE_AUDIT_STEP_INTERVAL_MS As Int = 2000
	Private Const CACHE_AUDIT_RECHECK_INTERVAL_MS As Int = 30 * 60 * 1000
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
	Private trustedOnlineTimeKey As String = "trusted_online_time_ticks"
	Private offlineDataFile As String = "offline_data.json"
	Private offlinePlaylistRequirementsFile As String = "offline_playlist_requirements.json"
	Private offlinePlaylistsDirName As String = "playlists"
	Private historyDirName As String = "history"
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
	Private lblConnectionIcon As B4XView
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
	Private localAdScheduler As AdScheduler
	Private dataResolver As DataPlaybackResolver
	Private offlineStoreService As OfflineStore
	Private appTraceService As TraceService
	Private mediaCacheService As MediaCache
	Private storage As KeyValueStore
	Private playQueue As List
	Private messages As Map
	Private traceLogLimit As Int = 1000
	Private serverSnapshotLimit As Int = 30
	Private offlineData As Map

	Private retryTimer As Timer
	Private breakTimer As Timer
	Private historyFlushTimer As Timer
	Private orbitTimer As Timer
	Private offlineDataRefreshTimer As Timer
	Private localAdMinuteTimer As Timer
	Private trackCacheWarmupTimer As Timer
	Private cacheAuditTimer As Timer
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
	Private isHistoryFlushInProgress As Boolean

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
	Private isOfflineDataRefreshInProgress As Boolean
	Private isTrackCacheRefreshInProgress As Boolean
	Private isOfflinePlaybackMode As Boolean
	Private isPlaybackPausedByPolicy As Boolean
	Private isStartupSequenceInProgress As Boolean
	Private isAdWarmupDeferredAfterStartup As Boolean
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
	messages.Put("offline", "Проверьте интернет")
	messages.Put("connecting", "Подключение...")
	messages.Put("server_wait", "Временная остановка")
	messages.Put("playback_paused", "Воспроизведение приостановлено")
	messages.Put("subscription_expired", "Подписка истекла")
	messages.Put("invalid_data_response", "Ошибка ответа сервера. Обратитесь в техподдержку")
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
	EnsureDirectory(GetHistoryDir)
	storage.Initialize(storageDir, storageDbName)
	MigrateLegacyStorageIfNeeded
	playerCode = NormalizePlayerCode(storage.GetDefault("player_code", ""))
	appTraceService.Initialize(storageDir, debugResponsesDir, traceLogLimit, serverSnapshotLimit)
	offlineData.Initialize
	playQueue.Initialize
	localAdScheduler.Initialize(Me, "TraceLog", MessageValue("ad_label"))
	dataResolver.Initialize(storageDir, Me, "TraceLog")
	dataResolver.LoadState(storage)
	TraceLog("Загружены курсоры playlists. count=" & dataResolver.CursorCount)
	deviceId = GetOrCreateDeviceId
	mediaCacheService.Initialize(storageDir, storage, Me, "TraceLog")
	retryTimer.Initialize("RetryTimer", SERVER_RETRY_DELAY_INITIAL)
	breakTimer.Initialize("BreakTimer", 1000)
	historyFlushTimer.Initialize("HistoryFlushTimer", HISTORY_FLUSH_INTERVAL_MS)
	orbitTimer.Initialize("OrbitTimer", 70)
	offlineDataRefreshTimer.Initialize("OfflineDataRefreshTimer", OFFLINE_DATA_REFRESH_MS)
	localAdMinuteTimer.Initialize("LocalAdMinuteTimer", 1000)
	trackCacheWarmupTimer.Initialize("TrackCacheWarmupTimer", TRACK_CACHE_WARMUP_DELAY_MS)
	cacheAuditTimer.Initialize("CacheAuditTimer", CACHE_AUDIT_START_DELAY_MS)
	historyItem.Initialize
	historyStartedAtTicks = 0
	isHistoryFlushInProgress = False
	isStartupSequenceInProgress = False
	isAdWarmupDeferredAfterStartup = False
	activeItem.Initialize
	preparedItem.Initialize
	activeAudioKey = ""
	preparedAudioKey = ""
	pendingPlayAudioKey = ""
	pendingPrepareAudioKey = ""
	offlineStoreService.Initialize(storageDir, storage, Me, "TraceLog", offlineDataFile, offlinePlaylistRequirementsFile, offlinePlaylistsDirName, PLAYLIST_CDN_BASE_URL)
	offlineData = offlineStoreService.LoadOfflineData
	RefreshPendingHistoryState
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
	lblConnectionIcon = CreateLabel(ICON_CLOUD_OK, 16, 0xFF747B86, False, False)
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
	footerPane.AddView(lblConnectionIcon, 0, 0, 0, 0)

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
	Dim connectionIconSize As Int = ScaleValue(safeWidth, 18dip, 20dip, 20dip)
	lblConnectionIcon.SetLayoutAnimated(0, cardWidth - horizontalPad - connectionIconSize, (footerHeight - connectionIconSize) / 2, connectionIconSize, connectionIconSize)
	lblFooter.SetLayoutAnimated(0, horizontalPad, 0, cardWidth - horizontalPad * 2 - connectionIconSize - 8dip, footerHeight)
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
	ApplyMaterialIconFont(lblConnectionIcon, 16)
	card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFFFF, cardRadius)
	UpdateHeaderActionAppearance(False)
	UpdateCodeInputAppearance(isCodeInputFocused)
	If isStarted Or isPlaybackPausedByPolicy Then
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
		UpdateConnectionIndicator("connecting")
		CallSubDelayed(Me, "AutoStartSavedPlayer")
	End If
End Sub

Private Sub StartOfflineDataRefresh
	offlineDataRefreshTimer.Enabled = False
	historyFlushTimer.Enabled = False
	localAdMinuteTimer.Interval = 1000
	localAdMinuteTimer.Enabled = True
	If playerCode = "" Then Return
	offlineDataRefreshTimer.Interval = OFFLINE_DATA_REFRESH_MS
	offlineDataRefreshTimer.Enabled = True
	historyFlushTimer.Interval = HISTORY_FLUSH_INTERVAL_MS
	historyFlushTimer.Enabled = True
	cacheAuditTimer.Enabled = False
	TraceLog("Запущено обновление офлайн-метаданных. Интервал=" & OFFLINE_DATA_REFRESH_MS & " ms")
End Sub

Private Sub HistoryFlushTimer_Tick
	If playerCode = "" Then Return
	If GetPendingHistoryFileCount <= 0 Then Return
	If isHistoryFlushInProgress Then Return
	TraceLog("HistoryFlushTimer_Tick. pendingFiles=" & GetPendingHistoryFileCount)
	CallSubDelayed(Me, "FlushHistoryBufferAsync")
End Sub

Private Sub FlushHistoryBufferAsync
	Wait For (FlushHistoryBuffer) Complete (unused As Boolean)
End Sub

Private Sub EnsureOfflineAdsCachedAsync
	If offlineData.IsInitialized = False Then
		TraceLog("Прогрев кэша рекламы пропущен: offlineData не инициализирован.")
		Return
	End If
	If offlineData.GetDefault("ok", False) <> True Then
		TraceLog("Прогрев кэша рекламы пропущен: offlineData.ok=False.")
		Return
	End If
	TraceLog("Запуск прогрева кэша рекламы. ads=" & storage.GetDefault("offline_ads_count", 0))
	Wait For (mediaCacheService.EnsureAdsCached(offlineData)) Complete (downloaded As Boolean)
	TraceLog("Прогрев кэша рекламы завершен. downloaded=" & downloaded & ", cached=" & storage.GetDefault("cached_ad_count", 0))
End Sub

Private Sub EnsureOfflineAdsCachedNow As ResumableSub
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	TraceLog("Синхронный прогрев кэша рекламы на старте. ads=" & storage.GetDefault("offline_ads_count", 0))
	Wait For (mediaCacheService.EnsureAdsCached(offlineData)) Complete (downloaded As Boolean)
	TraceLog("Синхронный прогрев кэша рекламы завершен. downloaded=" & downloaded & ", cached=" & storage.GetDefault("cached_ad_count", 0))
	Return downloaded
End Sub

Private Sub EnsureUpcomingTracksCachedAsync
	If isTrackCacheRefreshInProgress Then Return
	Dim trackItems As List
	trackItems.Initialize
	If playQueue.IsInitialized Then
		For Each itemObject As Object In playQueue
			If itemObject Is Map Then
				Dim item As Map = itemObject
				If item.GetDefault("type", "") = "track" Then trackItems.Add(CloneMap(item))
			End If
		Next
	End If
	If trackItems.Size = 0 Then Return
	isTrackCacheRefreshInProgress = True
	TraceLog("Запуск прогрева кэша треков. items=" & trackItems.Size)
	Wait For (mediaCacheService.EnsureTracksCached(trackItems, 5)) Complete (downloaded As Boolean)
	TraceLog("Прогрев кэша треков завершен. downloaded=" & downloaded & ", cached=" & storage.GetDefault("cached_track_count", 0))
	isTrackCacheRefreshInProgress = False
End Sub

Private Sub ScheduleTrackCacheWarmup
	trackCacheWarmupTimer.Enabled = False
	If isStarted = False Or isStoppedByUser Then Return
	If currentMediaType <> "track" Then Return
	If playQueue.IsInitialized = False Or playQueue.Size = 0 Then Return
	trackCacheWarmupTimer.Interval = TRACK_CACHE_WARMUP_DELAY_MS
	trackCacheWarmupTimer.Enabled = True
	TraceLog("Запланирован прогрев кэша треков. delayMs=" & TRACK_CACHE_WARMUP_DELAY_MS & ", queueSize=" & playQueue.Size)
End Sub

Private Sub TrackCacheWarmupTimer_Tick
	trackCacheWarmupTimer.Enabled = False
	CallSubDelayed(Me, "EnsureUpcomingTracksCachedAsync")
End Sub

Private Sub CacheAuditTimer_Tick
	cacheAuditTimer.Enabled = False
	If isStartupSequenceInProgress Then
		cacheAuditTimer.Interval = CACHE_AUDIT_START_DELAY_MS
		cacheAuditTimer.Enabled = True
		Return
	End If
	If mediaCacheService.IsCacheAuditInProgress = False Then mediaCacheService.StartCacheAudit
	Dim hasMore As Boolean = mediaCacheService.RunCacheAuditStep
	If hasMore Then
		cacheAuditTimer.Interval = CACHE_AUDIT_STEP_INTERVAL_MS
	Else
		cacheAuditTimer.Interval = CACHE_AUDIT_RECHECK_INTERVAL_MS
	End If
	cacheAuditTimer.Enabled = True
End Sub

Private Sub CompleteStartupSequence
	If isStartupSequenceInProgress = False Then Return
	isStartupSequenceInProgress = False
	isAdWarmupDeferredAfterStartup = False
	cacheAuditTimer.Interval = CACHE_AUDIT_START_DELAY_MS
	cacheAuditTimer.Enabled = True
	TraceLog("Стартовая последовательность завершена.")
End Sub

Private Sub OfflineDataRefreshTimer_Tick
	Wait For (RefreshOfflineDataNow) Complete (unused As Boolean)
End Sub

Private Sub LocalAdMinuteTimer_Tick
	If isStarted = False Or isStoppedByUser Or isStopping Then Return
	If CurrentSecondOfMinute < 50 Then Return
	PreScanUpcomingAdMinute(True)
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
			UpdateTrustedOnlineTimeFromData(data)
			offlineData = offlineStoreService.SaveOfflineData(data, playerCode, deviceId)
			isOfflinePlaybackMode = False
			Wait For (SyncOfflinePlaylistMetadata) Complete (unused As Boolean)
			If isStartupSequenceInProgress Then
				isAdWarmupDeferredAfterStartup = True
				TraceLog("Прогрев кэша рекламы отложен до завершения стартовой последовательности. cached=" & storage.GetDefault("cached_ad_count", 0))
			Else
				CallSubDelayed(Me, "EnsureOfflineAdsCachedAsync")
				TraceLog("Кэш рекламы поставлен в фоновый прогрев после обновления data.php. cached=" & storage.GetDefault("cached_ad_count", 0))
			End If
			If IsPlaybackAllowedByCurrentData = False Then
				PausePlaybackByPolicy(ResolvePlaybackBlockReason(offlineData), "server")
				isOfflineDataRefreshInProgress = False
				Return True
			End If
			If isPlaybackPausedByPolicy Then
				isPlaybackPausedByPolicy = False
				If isStoppedByUser = False And isStarted = False And isStopping = False Then
					TraceLog("Playback снова разрешен. Возобновляю воспроизведение автоматически.")
					isStarted = True
					SetStopIcon
					HideContentBlocks
					CallSubDelayed(Me, "ResumePlaybackAfterPolicyPause")
				End If
			End If
			isOfflineDataRefreshInProgress = False
			Return True
		End If
		If data.GetDefault("type", "") = "message" Then
			TraceLog("data.php вернул message. action=" & data.GetDefault("action", "") & ", reason=" & data.GetDefault("reason", "") & ", message=" & data.GetDefault("message", ""))
			HandleMessageItem(data)
			isOfflineDataRefreshInProgress = False
			Return False
		End If
		TraceLog("Ответ data.php не подходит для офлайн-режима. type=" & data.GetDefault("type", "") & ", ok=" & data.GetDefault("ok", False))
		PausePlaybackByPolicy(MessageValue("invalid_data_response"), "server")
	Else
		TraceLog("Ответ data.php не является Map.")
		PausePlaybackByPolicy(MessageValue("invalid_data_response"), "server")
	End If
	isOfflineDataRefreshInProgress = False
	Return False
End Sub

Private Sub ResumePlaybackAfterPolicyPause
	If isStoppedByUser Or isStopping Then Return
	If isPlaybackPausedByPolicy Then Return
	If isStarted = False Then Return
	Wait For (StartFirstTrack("auto")) Complete (unused As Boolean)
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
	If playQueue.Size = 0 Then
		If RestoreDownloadPlanFromStorage Then
			If playQueue.Size >= minItems Then Return True
		End If
	End If
	Dim workingCursors As Map = dataResolver.ClonePlaylistCursors
	Do While playQueue.Size < minItems
		Wait For (BuildNextTrackFromDataPlayback(workingCursors)) Complete (nextItem As Map)
		If IsValidDataTrackItem(nextItem) = False Then Exit
		playQueue.Add(nextItem)
	Loop
	SaveDownloadPlanState
	Return playQueue.Size >= minItems
End Sub

Private Sub BuildNextTrackFromDataPlayback(workingCursors As Map) As ResumableSub
	Dim emptyItem As Map
	emptyItem.Initialize
	Dim currentSlot As Map = dataResolver.ResolveDataSlotAtTicks(offlineData, EffectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then
		TraceLog("Не удалось определить текущий слот из data.")
		Return emptyItem
	End If
	Dim playlistDescriptor As Map = dataResolver.ChooseNextPlaylistDescriptor(currentSlot, workingCursors)
	If playlistDescriptor.IsInitialized = False Or playlistDescriptor.Size = 0 Then
		TraceLog("Не удалось выбрать playlist для текущего слота.")
		Return emptyItem
	End If
	Dim playlistData As Map = dataResolver.LoadCachedPlaylistMetadata(playlistDescriptor.GetDefault("id", ""))
	If playlistData.IsInitialized = False Or playlistData.Size = 0 Then
		Wait For (EnsureSinglePlaylistMetadata(playlistDescriptor)) Complete (downloaded As Boolean)
		If downloaded = False Then Return emptyItem
		playlistData = dataResolver.LoadCachedPlaylistMetadata(playlistDescriptor.GetDefault("id", ""))
		If playlistData.IsInitialized = False Or playlistData.Size = 0 Then Return emptyItem
	End If
	Dim selectedTrack As Map = dataResolver.ChooseRandomTrackFromPlaylist(playlistData, mediaCacheService, isOfflinePlaybackMode)
	If selectedTrack.IsInitialized = False Or selectedTrack.Size = 0 Then
		If isOfflinePlaybackMode Then
			TraceLog("Не удалось выбрать cached track из playlist в offline fallback. playlistId=" & playlistDescriptor.GetDefault("id", ""))
		Else
			TraceLog("Не удалось выбрать трек из playlist. playlistId=" & playlistDescriptor.GetDefault("id", ""))
		End If
		Return emptyItem
	End If
	Dim queueItem As Map = dataResolver.CreateQueueTrackFromPlaylist(currentSlot, playlistDescriptor, selectedTrack, offlineData)
	If IsValidDataTrackItem(queueItem) = False Then
		TraceLog("Локальный track-item собран неполно. playlistId=" & playlistDescriptor.GetDefault("id", "") & ", trackId=" & selectedTrack.GetDefault("id", ""))
		Return emptyItem
	End If
	dataResolver.RememberResolvedTrack(queueItem.GetDefault("id", ""))
	Return queueItem
End Sub

Private Sub IsValidDataTrackItem(item As Map) As Boolean
	If item.IsInitialized = False Or item.Size = 0 Then Return False
	If item.GetDefault("type", "") <> "track" Then Return False
	If item.GetDefault("id", "") = "" Then Return False
	Return True
End Sub

Private Sub RestoreDownloadPlanFromStorage As Boolean
	If CanUseDataPlaybackResolver = False Then Return False
	Dim storedSignature As String = storage.GetDefault("download_plan_signature", "")
	If storedSignature = "" Then Return False
	Dim currentSignature As String = BuildDownloadPlanSignature
	If currentSignature = "" Then Return False
	If storedSignature <> currentSignature Then
		TraceLog("Download plan не восстановлен: сигнатура изменилась.")
		Return False
	End If
	Dim storedTracks As List = storage.GetDefault("download_plan_tracks", CreateInitializedList)
	If storedTracks.IsInitialized = False Or storedTracks.Size = 0 Then Return False
	Dim restoredCount As Int = 0
	For Each itemObject As Object In storedTracks
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			If isOfflinePlaybackMode And mediaCacheService.IsTrackCached(item.GetDefault("id", "")) = False Then Continue
			playQueue.Add(CloneMap(item))
			dataResolver.RememberResolvedTrack(item.GetDefault("id", ""))
			restoredCount = restoredCount + 1
		End If
	Next
	If restoredCount = 0 Then Return False
	TraceLog("Download plan восстановлен из KVS. tracks=" & restoredCount)
	Return True
End Sub

Private Sub SaveDownloadPlanState
	If CanUseDataPlaybackResolver = False Then Return
	Dim signature As String = BuildDownloadPlanSignature
	If signature = "" Then Return
	Dim tracks As List
	tracks.Initialize
	For Each itemObject As Object In playQueue
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If IsValidDataTrackItem(item) = False Then Continue
			tracks.Add(CloneMap(item))
			If tracks.Size >= 20 Then Exit
		End If
	Next
	storage.Put("download_plan_signature", signature)
	storage.Put("download_plan_tracks", tracks)
	storage.Put("download_plan_saved_at", DateTime.Now)
	TraceLog("Сохранен download plan. tracks=" & tracks.Size)
End Sub

Private Sub BuildDownloadPlanSignature As String
	If CanUseDataPlaybackResolver = False Then Return ""
	Dim currentSlot As Map = dataResolver.ResolveDataSlotAtTicks(offlineData, EffectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return ""
	Dim signatureParts As List
	signatureParts.Initialize
	signatureParts.Add("v=3")
	signatureParts.Add("slot=" & BuildDataSlotKey(currentSlot))
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized Then
		For Each playlistObject As Object In playlists
			If playlistObject Is Map Then
				Dim playlist As Map = playlistObject
				signatureParts.Add("playlist=" & playlist.GetDefault("id", "") & ":" & playlist.GetDefault("updated", ""))
			End If
		Next
	End If
	signatureParts.Sort(True)
	Return JoinList(signatureParts, "|")
End Sub

Private Sub BuildDataSlotKey(currentSlot As Map) As String
	Return currentSlot.GetDefault("schedule_title", "") & "|" & currentSlot.GetDefault("stream_id", "") & "|" & currentSlot.GetDefault("slot_time", "")
End Sub

Private Sub AutoStartSavedPlayer
	If playerCode = "" Then Return
	If isStarted Or isStopping Then Return
	If isStartupSequenceInProgress Then Return
	isStartupSequenceInProgress = True
	isAdWarmupDeferredAfterStartup = False
	cacheAuditTimer.Enabled = False
	ShowMessage(MessageValue("connecting"))
	UpdateConnectionIndicator("connecting")
	If USE_DATA_PLAYBACK_RESOLVER Then
		TraceLog("Автозапуск: сначала пробую получить свежий data.php.")
		Wait For (RefreshOfflineDataNow) Complete (refreshed As Boolean)
		If refreshed = False Then
			If HasOfflinePlaybackFallback Then
				isOfflinePlaybackMode = True
				UpdateConnectionIndicator("offline")
				TraceLog("Свежий data.php недоступен. Перехожу в offline playback по валидному cache.")
			Else
				TraceLog("Свежий data.php недоступен, но playable offline queue отсутствует.")
				HandleOfflineTemporaryState("")
				CompleteStartupSequence
				Return
			End If
		Else
			UpdateConnectionIndicator("online")
		End If
		If CanUseDataPlaybackResolver = False Then
			TraceLog("Автозапуск отменен: нет ни свежих, ни сохраненных data/playlists.")
			CompleteStartupSequence
			Return
		End If
	End If
	If IsPlaybackAllowedByCurrentData = False Then
		PausePlaybackByPolicy(ResolvePlaybackBlockReason(offlineData), "server")
		CompleteStartupSequence
		Return
	End If
	If isAdWarmupDeferredAfterStartup Then
		Wait For (EnsureOfflineAdsCachedNow) Complete (unusedWarmup As Boolean)
	End If
	isStarted = True
	isStoppedByUser = False
	isPlaybackPausedByPolicy = False
	SetStopIcon
	HideContentBlocks
	TraceLog("Автозапуск воспроизведения при старте приложения.")
	Wait For (StartFirstTrack("auto")) Complete (unused As Boolean)
	CompleteStartupSequence
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
	If isStarted = False And isPlaybackPausedByPolicy = False Then ApplyStoppedState
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
	If isStarted = False And isPlaybackPausedByPolicy = False Then
		If isStopping Then Return
		If IsPlaybackAllowedByCurrentData = False Then
			PausePlaybackByPolicy(ResolvePlaybackBlockReason(offlineData), "server")
			Return
		End If
		isStarted = True
		isStoppedByUser = False
		isPlaybackPausedByPolicy = False
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

Private Sub EnsureDirectory(path As String)
	Dim joFile As JavaObject
	joFile.InitializeNewInstance("java.io.File", Array As Object(path))
	joFile.RunMethod("mkdirs", Null)
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
	mediaCacheService.TouchCachedItem(item)
	TraceLog("ActivateLoadedItem. audio=" & audioKey & ", item=" & DescribeItem(item) & ", fadeInMs=" & fadeInMs)
	GetAudioByKey(audioKey).PlayWithFade(fadeInMs)
	ScheduleTrackCacheWarmup
	ScheduleHistoryLog(item)
	ResetRetryDelay
	prefetchDone = False
End Sub

Private Sub StartPlaybackWithAudioKey(audioKey As String, item As Map, fadeInMs As Int) As ResumableSub
	ClearPendingPlayState
	pendingPlayAudioKey = audioKey
	pendingPlayItem = item
	pendingPlayFadeInMs = fadeInMs
	Dim itemUrl As String = MediaUrl(item)
	TraceLog("StartPlaybackWithAudioKey. audio=" & audioKey & ", item=" & DescribeItem(item) & ", volume=" & NumberFormat2(CurrentVolume(item), 1, 3, 3, False) & ", fadeInMs=" & fadeInMs & ", source=" & mediaCacheService.ResolveMediaSource(item))
	GetAudioByKey(audioKey).LoadUrl(itemUrl, CurrentVolume(item))
	Wait For PlaybackStartDone(result As Map)
	TraceLog("PlaybackStartDone. audio=" & audioKey & ", success=" & result.GetDefault("Success", False) & ", message=" & result.GetDefault("Message", ""))
	Return result.GetDefault("Success", False)
End Sub

Private Sub PrepareNextPlayable As ResumableSub
	If isStarted = False Or isStoppedByUser Then Return False
	Do While playQueue.Size > 0
		Dim nextObject As Object = playQueue.Get(0)
		If nextObject Is Map Then
		Else
			Return False
		End If
		Dim candidateItem As Map = nextObject
		Dim candidateType As String = candidateItem.GetDefault("type", "")
		If candidateType <> "track" And candidateType <> "ad" Then Return False
		If isOfflinePlaybackMode Then
			If candidateType = "track" And mediaCacheService.IsTrackCached(candidateItem.GetDefault("id", "")) = False Then
				TraceLog("Удален из очереди трек без локального файла в offline fallback. item=" & DescribeItem(candidateItem))
				playQueue.RemoveAt(0)
				SaveDownloadPlanState
				Continue
			End If
			If candidateType = "ad" And mediaCacheService.IsAdCached(candidateItem.GetDefault("id", "")) = False Then
				TraceLog("Удален из очереди ролик без локального файла в offline fallback. item=" & DescribeItem(candidateItem))
				playQueue.RemoveAt(0)
				SaveDownloadPlanState
				Continue
			End If
		End If
		Exit
	Loop
	If playQueue.Size = 0 Then Return False
	Dim nextItem As Map = playQueue.Get(0)
	If preparedItem.IsInitialized And preparedAudioKey <> "" And ItemsMatch(preparedItem, nextItem) Then Return True
	Dim targetAudioKey As String = GetInactiveAudioKey
	ClearPreparedState(False)
	pendingPrepareAudioKey = targetAudioKey
	pendingPrepareItem = CloneMap(nextItem)
	Dim nextItemUrl As String = MediaUrl(nextItem)
	TraceLog("PrepareNextPlayable. targetAudio=" & targetAudioKey & ", item=" & DescribeItem(nextItem) & ", volume=" & NumberFormat2(CurrentVolume(nextItem), 1, 3, 3, False) & ", source=" & mediaCacheService.ResolveMediaSource(nextItem))
	GetAudioByKey(targetAudioKey).LoadUrl(nextItemUrl, CurrentVolume(nextItem))
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
	dataResolver.CommitPlaylistCursor(storage, promotedItem)
	SaveDownloadPlanState
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
	If IsPlaybackAllowedByCurrentData = False Then
		PausePlaybackByPolicy(ResolvePlaybackBlockReason(offlineData), "server")
		Return False
	End If
	TraceLog("Запрос очереди и запуск. Режим старта=" & nextStartMode & ", размер очереди до запроса=" & playQueue.Size)
	If USE_DATA_PLAYBACK_RESOLVER Then
		PreScanUpcomingAdMinute(True)
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
			Dim idleText As String = ResolveIdleUntilMessage
			If idleText <> "" Then
				HandleTemporaryState("server", idleText)
				Return False
			End If
			If isOfflinePlaybackMode Then
				HandleTemporaryState("offline", "Нет локально доступных треков")
			Else
				HandleTemporaryState("server", "")
			End If
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
			If item.GetDefault("exactly", False) = True And HasPendingExactBreak And ShouldTriggerBreakNow = False Then
				DeferFutureExactBreak(item)
				Wait For (PlayPreparedOrLoadNext) Complete (unusedDeferred As Boolean)
				Return True
			End If
			ClearExactBreakState
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
			If isOfflinePlaybackMode Then
				TraceLog("Пропуск элемента: в offline fallback нет локального файла. item=" & DescribeItem(item))
				Wait For (PlayPreparedOrLoadNext) Complete (unusedSkip As Boolean)
				Return True
			Else
				HandleTemporaryState("server", "")
				Return False
			End If
		End If
		
		If item.ContainsKey("playlist") Then playlistIndex = item.Get("playlist")
		dataResolver.CommitPlaylistCursor(storage, item)
		SaveDownloadPlanState
		prefetchDone = False
		Dim fadeInMs As Int = ResolveStartFadeInMs
		Dim targetAudioKey As String = GetInactiveAudioKey
		If activeAudioKey = "" Then targetAudioKey = "primary"
		Wait For (StartPlaybackWithAudioKey(targetAudioKey, item, fadeInMs)) Complete (playbackStarted As Boolean)
		If playbackStarted = False Then
			If isStoppedByUser = False And isStarted Then
				Wait For (HandleMediaError) Complete (unusedError As Boolean)
				If isOfflinePlaybackMode Then
					Wait For (PlayPreparedOrLoadNext) Complete (unusedOffline As Boolean)
					Return True
				End If
			End If
			Return False
		End If
		If isStarted = False Or isStoppedByUser Then Return False
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
		isPlaybackPausedByPolicy = False
		ClearPlaybackState
		isStarted = False
		isStoppedByUser = True
		SetPlayIcon
		ShowClaimPrompt(item.GetDefault("message", MessageValue("device_busy")))
	Else If action = "shutdown" Then
		HandleShutdownMessage(item.GetDefault("message", MessageValue("server_wait")))
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

Private Sub DeferFutureExactBreak(item As Map)
	Dim insertIndex As Int = Min(1, playQueue.Size)
	playQueue.InsertAt(insertIndex, item)
	SyncExactBreakState
	TraceLog("Exact-break отложен до своей минуты. at=" & ToLongDefault(item.GetDefault("at", -1), -1) & ", queueSize=" & playQueue.Size)
End Sub

Private Sub ScanLocalAdsForTimestamp(targetMinuteTimestamp As Long, force As Boolean)
	Dim allowRegularAds As Boolean = AllowRegularAdsAtTargetMinute(targetMinuteTimestamp)
	If localAdScheduler.ScanTargetMinute(offlineData, playQueue, targetMinuteTimestamp, force, allowRegularAds) Then
		PruneQueuedBreakItemsByLocalCache
		SyncExactBreakState
	End If
End Sub

Private Sub PruneQueuedBreakItemsByLocalCache
	If playQueue.IsInitialized = False Or playQueue.Size = 0 Then Return
	Dim changed As Boolean = False
	For i = playQueue.Size - 1 To 0 Step -1
		Dim itemObject As Object = playQueue.Get(i)
		If (itemObject Is Map) = False Then Continue
		Dim item As Map = itemObject
		If item.GetDefault("type", "") <> "break" Then Continue
		Dim breakItems As List = item.GetDefault("items", Null)
		If breakItems.IsInitialized = False Or breakItems.Size = 0 Then
			playQueue.RemoveAt(i)
			changed = True
			Continue
		End If
		Dim filteredItems As List
		filteredItems.Initialize
		For Each breakItemObject As Object In breakItems
			If breakItemObject Is Map Then
				Dim breakItem As Map = breakItemObject
				If breakItem.GetDefault("type", "") = "ad" Then
					If mediaCacheService.HasValidatedLocalMedia(breakItem) = False Then Continue
				End If
				filteredItems.Add(breakItem)
			End If
		Next
		If filteredItems.Size = 0 Then
			TraceLog("Локальный break удален из очереди: нет playable cached ads.")
			playQueue.RemoveAt(i)
			changed = True
		Else If filteredItems.Size <> breakItems.Size Then
			item.Put("items", filteredItems)
			item.Put("items_count", filteredItems.Size)
			playQueue.Set(i, item)
			changed = True
		End If
	Next
	If changed Then ResolveScheduledBreakAt
End Sub

Private Sub PreScanUpcomingAdMinute(force As Boolean)
	If CurrentSecondOfMinute < 50 Then Return
	Dim targetTimestamp As Long = LocalNowTimestamp + (60 - CurrentSecondOfMinute)
	If (MinuteOfHourFromTimestamp(targetTimestamp) Mod 5) <> 0 Then Return
	If CurrentSecondOfMinute = 50 Then
		TraceLog("Предскан рекламы за 10 секунд до блока. target=" & FormatTimestampForTrace(targetTimestamp))
	End If
	ScanLocalAdsForTimestamp(targetTimestamp, force)
End Sub

Private Sub MinuteOfHourFromTimestamp(targetTimestamp As Long) As Int
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "HH:mm:ss"
	Dim timeValue As String = DateTime.Time(targetTimestamp * 1000)
	DateTime.TimeFormat = previousTimeFormat
	Dim parts() As String = Regex.Split(":", timeValue)
	If parts.Length < 2 Then Return 0
	Return parts(1)
End Sub

Private Sub FormatTimestampForTrace(targetTimestamp As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.DateFormat = "dd.MM.yyyy"
	DateTime.TimeFormat = "HH:mm:ss"
	Dim targetTicks As Long = LocalTimestampToTicks(targetTimestamp)
	Dim value As String = DateTime.Date(targetTicks) & " " & DateTime.Time(targetTicks)
	DateTime.DateFormat = previousDateFormat
	DateTime.TimeFormat = previousTimeFormat
	Return value
End Sub

Private Sub LocalTimestampToTicks(targetTimestamp As Long) As Long
	Return (targetTimestamp + (TimezoneOffsetMinutes * 60)) * 1000
End Sub

Private Sub HandleFetchFailure(result As Map) As ResumableSub
	TraceLog("Ошибка загрузки данных. kind=" & result.GetDefault("Kind", "") & ", message=" & result.GetDefault("ErrorMessage", ""))
	If result.GetDefault("Kind", "") = "offline" Then
		HandleOfflineTemporaryState("")
		Return True
	End If
	If HasOfflinePlaybackFallback Then
		TraceLog("Переход в offline fallback после ошибки загрузки данных.")
		HandleOfflineTemporaryState("")
		Return True
	End If
	Wait For (CheckServiceAvailability) Complete (serviceAvailable As Boolean)
	If serviceAvailable Then
		HandleTemporaryState("server", "")
	Else
		Wait For (CheckExternalConnectivity) Complete (hasInternet As Boolean)
		If hasInternet Then
			HandleTemporaryState("server", "")
		Else
			HandleOfflineTemporaryState("")
		End If
	End If
	Return True
End Sub

Private Sub CheckServiceAvailability As ResumableSub
	Dim j As HttpJob
	j.Initialize("", Me)
	j.Download(SERVICE_CHECK_URL & "?t=" & DateTime.Now)
	j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT_MS
	Wait For (j) JobDone(j As HttpJob)
	Dim ok As Boolean = j.Success
	j.Release
	Return ok
End Sub

Private Sub CheckExternalConnectivity As ResumableSub
	Dim j As HttpJob
	j.Initialize("", Me)
	j.Download(EXTERNAL_CONNECTIVITY_CHECK_URL & "?t=" & DateTime.Now)
	j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT_MS
	Wait For (j) JobDone(j As HttpJob)
	Dim ok As Boolean = j.Success
	j.Release
	Return ok
End Sub

Private Sub HandleTemporaryState(mode As String, text As String)
	TraceLog("Временное состояние. mode=" & mode & ", text=" & text)
	isPlaybackPausedByPolicy = False
	isOfflinePlaybackMode = (mode = "offline")
	UpdateConnectionIndicator(mode)
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
	isPlaybackPausedByPolicy = False
	UpdateConnectionIndicator("server")
	ClearPlaybackState
	HidePin
	ShowMessage(MessageValue("blocked"))
	ScheduleRetry("blocked", 0)
End Sub

Private Sub StopForMissingData(text As String)
	TraceLog("Остановка из-за отсутствующих данных. text=" & text)
	isPlaybackPausedByPolicy = False
	UpdateConnectionIndicator("server")
	ClearPlaybackState
	HidePin
	isStarted = False
	isStoppedByUser = True
	SetPlayIcon
	ShowMessage(text)
End Sub

Private Sub HandleMediaError As ResumableSub
	If HasOfflinePlaybackFallback Then
		TraceLog("Переход в offline fallback после ошибки загрузки media.")
		HandleOfflineTemporaryState("")
		Return True
	End If
	Wait For (CheckServiceAvailability) Complete (serviceAvailable As Boolean)
	If serviceAvailable Then
		HandleTemporaryState("server", "")
	Else
		Wait For (CheckExternalConnectivity) Complete (hasInternet As Boolean)
		If hasInternet Then
			HandleTemporaryState("server", "")
		Else
			HandleOfflineTemporaryState("")
		End If
	End If
	Return True
End Sub

Private Sub HasOfflinePlaybackFallback As Boolean
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	Return HasPlayableOfflineTrackInCurrentSlot
End Sub

Private Sub HandleOfflineTemporaryState(text As String)
	Dim fallbackReady As Boolean = HasOfflinePlaybackFallback
	TraceLog("Временное offline-состояние. playableFallback=" & fallbackReady & ", text=" & text)
	isPlaybackPausedByPolicy = False
	isOfflinePlaybackMode = fallbackReady
	UpdateConnectionIndicator("offline")
	ClearPlaybackState
	HidePin
	If text <> "" Then
		ShowMessage(text)
	Else
		ShowMessage(MessageValue("offline"))
	End If
	ScheduleRetry("offline", 0)
End Sub

Private Sub HasPlayableOfflineTrackInCurrentSlot As Boolean
	Dim currentSlot As Map = dataResolver.ResolveDataSlotAtTicks(offlineData, EffectiveNowTicks)
	If currentSlot.IsInitialized = False Or currentSlot.Size = 0 Then Return False
	Dim playlists As List = currentSlot.GetDefault("playlists", Null)
	If playlists.IsInitialized = False Or playlists.Size = 0 Then Return False
	For Each playlistObject As Object In playlists
		If playlistObject Is Map Then
			Dim playlistDescriptor As Map = playlistObject
			Dim playlistId As String = playlistDescriptor.GetDefault("id", "")
			If playlistId = "" Then Continue
			Dim playlistData As Map = dataResolver.LoadCachedPlaylistMetadata(playlistId)
			If PlaylistHasCachedTrack(playlistData) Then Return True
		End If
	Next
	Return False
End Sub

Private Sub ResolveIdleUntilMessage As String
	If offlineData.IsInitialized = False Then Return ""
	Dim currentSlot As Map = dataResolver.ResolveCurrentDataSlot(offlineData)
	If IsIdleSlot(currentSlot) = False Then Return ""
	Dim nextSlot As Map = dataResolver.ResolveNextDataSlotAtTicks(offlineData, EffectiveNowTicks)
	Dim nextTime As String = nextSlot.GetDefault("slot_time", "")
	If nextTime = "" Then Return MessageValue("idle")
	Return MessageValue("idle_until").Replace("{time}", nextTime)
End Sub

Private Sub IsIdleSlot(slotContext As Map) As Boolean
	If slotContext.IsInitialized = False Or slotContext.Size = 0 Then Return False
	Dim playlists As List = slotContext.GetDefault("playlists", Null)
	If playlists.IsInitialized And playlists.Size > 0 Then Return False
	Dim streamId As String = slotContext.GetDefault("stream_id", "")
	Dim streamTitle As String = slotContext.GetDefault("stream_title", "")
	Return streamId = "" And streamTitle = ""
End Sub

Private Sub AllowRegularAdsAtTargetMinute(targetMinuteTimestamp As Long) As Boolean
	If offlineData.IsInitialized = False Then Return False
	Dim targetTicks As Long = targetMinuteTimestamp * 1000
	Dim targetSlot As Map = dataResolver.ResolveDataSlotAtTicks(offlineData, targetTicks)
	Return IsIdleSlot(targetSlot) = False
End Sub

Private Sub PausePlaybackByPolicy(reason As String, connectionMode As String)
	Dim safeReason As String = reason
	If safeReason = "" Then safeReason = MessageValue("playback_paused")
	TraceLog("Playback остановлен по политике. reason=" & safeReason & ", connectionMode=" & connectionMode)
	isPlaybackPausedByPolicy = True
	isOfflinePlaybackMode = False
	UpdateConnectionIndicator(connectionMode)
	ClearPlaybackState
	HidePin
	isStarted = False
	isStoppedByUser = False
	SetStopIcon
	ShowMessage(safeReason)
End Sub

Private Sub HandleShutdownMessage(text As String)
	Dim safeText As String = text
	If safeText = "" Then safeText = MessageValue("server_wait")
	TraceLog("Получен shutdown message. text=" & safeText)
	isPlaybackPausedByPolicy = False
	ClearPlaybackState
	HidePin
	isStarted = False
	isStoppedByUser = True
	SetPlayIcon
	ShowMessage(safeText)
	offlineDataRefreshTimer.Enabled = False
	historyFlushTimer.Enabled = False
	localAdMinuteTimer.Enabled = False
	trackCacheWarmupTimer.Enabled = False
	cacheAuditTimer.Enabled = False
End Sub

Private Sub IsPlaybackAllowedByCurrentData As Boolean
	If offlineData.IsInitialized = False Then Return True
	Dim playerData As Map = offlineData.GetDefault("player", CreateInitializedMap)
	If playerData.IsInitialized And playerData.ContainsKey("playback_allowed") Then
		If playerData.GetDefault("playback_allowed", True) <> True Then Return False
	End If
	Dim endTimestamp As Long = ResolvePlaybackEndTimestamp(offlineData)
	If endTimestamp <= 0 Then Return True
	Return EffectiveNowTicks < (endTimestamp * 1000)
End Sub

Private Sub ResolvePlaybackBlockReason(data As Map) As String
	If data.IsInitialized = False Then Return MessageValue("playback_paused")
	Dim playerData As Map = data.GetDefault("player", CreateInitializedMap)
	If playerData.IsInitialized Then
		Dim pauseReason As String = playerData.GetDefault("pause_reason", "")
		If pauseReason <> "" Then Return pauseReason
	End If
	Dim endTimestamp As Long = ResolvePlaybackEndTimestamp(data)
	If endTimestamp > 0 And EffectiveNowTicks >= (endTimestamp * 1000) Then Return MessageValue("subscription_expired")
	If playerData.IsInitialized And playerData.ContainsKey("playback_allowed") Then
		If playerData.GetDefault("playback_allowed", True) <> True Then Return MessageValue("playback_paused")
	End If
	Return MessageValue("playback_paused")
End Sub

Private Sub ResolvePlaybackEndTimestamp(data As Map) As Long
	If data.IsInitialized = False Then Return 0
	Dim playerData As Map = data.GetDefault("player", CreateInitializedMap)
	If playerData.IsInitialized Then
		Dim playerEnd As Long = ParseEndValueToTimestamp(playerData.Get("end"))
		If playerEnd > 0 Then Return playerEnd
	End If
	Return ParseEndValueToTimestamp(data.Get("end"))
End Sub

Private Sub ParseEndValueToTimestamp(value As Object) As Long
	If value = Null Then Return 0
	Dim textValue As String = ("" & value).Trim
	If textValue = "" Then Return 0
	If Regex.IsMatch("^\d+$", textValue) Then Return Floor(textValue)
	If Regex.IsMatch("^\d{4}-\d{2}-\d{2}$", textValue) Then
		Return ParseDateOnlyEndTimestamp(textValue)
	End If
	Try
		Dim instantClass As JavaObject
		instantClass.InitializeStatic("java.time.Instant")
		Dim instant As JavaObject = instantClass.RunMethod("parse", Array As Object(textValue))
		Return instant.RunMethod("getEpochSecond", Null)
	Catch
		Log(LastException.Message)
	End Try
	Try
		Dim offsetDateTimeClass As JavaObject
		offsetDateTimeClass.InitializeStatic("java.time.OffsetDateTime")
		Dim offsetDateTime As JavaObject = offsetDateTimeClass.RunMethod("parse", Array As Object(textValue))
		Dim instant As JavaObject = offsetDateTime.RunMethod("toInstant", Null)
		Return instant.RunMethod("getEpochSecond", Null)
	Catch
		Log(LastException.Message)
	End Try
	TraceLog("Не удалось разобрать player.end: " & textValue)
	Return 0
End Sub

Private Sub UpdateTrustedOnlineTimeFromData(data As Map)
	Dim candidateTicks As Long = ParseTrustedOnlineTicks(data)
	If candidateTicks <= 0 Then candidateTicks = DateTime.Now
	UpdateTrustedOnlineTimeTicks(candidateTicks)
End Sub

Private Sub UpdateTrustedOnlineTimeTicks(candidateTicks As Long)
	If candidateTicks <= 0 Then Return
	Dim storedTicks As Long = storage.GetDefault(trustedOnlineTimeKey, 0)
	If candidateTicks <= storedTicks Then Return
	storage.Put(trustedOnlineTimeKey, candidateTicks)
	TraceLog("Обновлено доверенное онлайн-время. ticks=" & candidateTicks)
End Sub

Private Sub ParseTrustedOnlineTicks(data As Map) As Long
	If data.IsInitialized = False Then Return 0
	Dim updatedText As String = ("" & data.GetDefault("updated", "")).Trim
	If updatedText = "" Then Return 0
	Try
		Dim instantClass As JavaObject
		instantClass.InitializeStatic("java.time.Instant")
		Dim instant As JavaObject = instantClass.RunMethod("parse", Array As Object(updatedText))
		Return instant.RunMethod("toEpochMilli", Null)
	Catch
		Try
			Dim offsetDateTimeClass As JavaObject
			offsetDateTimeClass.InitializeStatic("java.time.OffsetDateTime")
			Dim offsetDateTime As JavaObject = offsetDateTimeClass.RunMethod("parse", Array As Object(updatedText))
			Dim instant As JavaObject = offsetDateTime.RunMethod("toInstant", Null)
			Return instant.RunMethod("toEpochMilli", Null)
		Catch
			Log(LastException.Message)
		End Try
	End Try
	Return 0
End Sub

Private Sub ParseDateOnlyEndTimestamp(textValue As String) As Long
	Dim previousDateFormat As String = DateTime.DateFormat
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dayStartTicks As Long = DateTime.DateParse(textValue)
		DateTime.DateFormat = previousDateFormat
		Return Floor((dayStartTicks + DateTime.TicksPerDay) / 1000)
	Catch
		DateTime.DateFormat = previousDateFormat
		Log(LastException.Message)
		Return 0
	End Try
End Sub

Private Sub PlaylistHasCachedTrack(playlistData As Map) As Boolean
	If playlistData.IsInitialized = False Or playlistData.Size = 0 Then Return False
	Dim tracks As List = playlistData.GetDefault("tracks", Null)
	If tracks.IsInitialized = False Or tracks.Size = 0 Then Return False
	For Each trackObject As Object In tracks
		If trackObject Is Map Then
			Dim track As Map = trackObject
			Dim trackId As String = track.GetDefault("id", "")
			If trackId <> "" And mediaCacheService.IsTrackCached(trackId) Then Return True
		End If
	Next
	Return False
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
	If isPlaybackPausedByPolicy Then Return
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
	If itemType = "track" Then
		TraceLog("История подтверждена. reason=playback_start, item=" & DescribeItem(item))
		QueueHistoryRecordAt(item, DateTime.Now)
		ClearHistoryLogTimer
		Return
	End If
	TraceLog("ScheduleHistoryLog. item=" & DescribeItem(item) & ", mode=ad_complete")
	ClearHistoryLogTimer
	historyItem = item
	historyStartedAtTicks = DateTime.Now
End Sub

Private Sub ConfirmPendingHistoryItem(reason As String) As Boolean
	If historyItem.IsInitialized = False Then Return False
	If historyItem.GetDefault("id", "") = "" Then Return False
	TraceLog("История подтверждена. reason=" & reason & ", item=" & DescribeItem(historyItem))
	QueueHistoryRecordAt(historyItem, historyStartedAtTicks)
	ClearHistoryLogTimer
	Return True
End Sub

Private Sub QueueHistoryRecordAt(item As Map, startedAtValue As Long)
	If item.IsInitialized = False Then Return
	If item.GetDefault("id", "") = "" Then Return
	Dim startedAt As Long = startedAtValue
	If startedAt <= 0 Then startedAt = DateTime.Now
	Dim record As Map
	record.Initialize
	Dim recordDate As String = FormatHistoryDate(startedAt)
	record.Put("date", recordDate)
	record.Put("time", FormatHistoryTime(startedAt))
	record.Put("type", item.GetDefault("type", ""))
	record.Put("id", item.GetDefault("id", ""))
	AppendHistoryRecord(recordDate, record)
	TraceLog("История добавлена в локальный буфер. date=" & record.Get("date") & ", time=" & record.Get("time") & ", type=" & record.Get("type") & ", id=" & record.Get("id") & ", pendingFiles=" & GetPendingHistoryFileCount)
End Sub

Private Sub FlushHistoryBuffer As ResumableSub
	If isHistoryFlushInProgress Then Return False
	If playerCode = "" Or deviceId = "" Then Return False
	Dim pendingHistoryFileName As String = GetOldestPendingHistoryFileName
	If pendingHistoryFileName = "" Then Return True
	isHistoryFlushInProgress = True
	Dim batchDate As String = HistoryFileNameToDate(pendingHistoryFileName)
	Dim payload As String = ""
	Try
		payload = File.ReadString(GetHistoryDir, pendingHistoryFileName)
	Catch
		TraceLog("Не удалось прочитать history file. file=" & pendingHistoryFileName & ", message=" & LastException.Message)
	End Try
	payload = NormalizeNdjsonPayload(payload)
	If payload = "" Or batchDate = "" Then
		DeleteHistoryPendingFile(pendingHistoryFileName)
		RefreshPendingHistoryState
		isHistoryFlushInProgress = False
		Return False
	End If
	Dim recordCount As Int = CountNdjsonRecords(payload)
	TraceLog("SendHistory batch. date=" & batchDate & ", records=" & recordCount & ", file=" & pendingHistoryFileName)
	Dim queryParams As Map
	queryParams.Initialize
	queryParams.Put("player", playerCode)
	queryParams.Put("device", deviceId)
	queryParams.Put("date", batchDate)
	Dim requestUrl As String = HISTORY_BASE_URL & "?" & BuildParams(queryParams)
	TraceLog("SendHistory payload. player=" & playerCode & ", device=" & deviceId & ", date=" & batchDate & ", records=" & recordCount)
	Dim j As HttpJob
	j.Initialize("", Me)
	j.PostString(requestUrl, payload)
	j.GetRequest.Timeout = 5000
	j.GetRequest.SetContentType("text/plain; charset=utf-8")
	Wait For (j) JobDone(j As HttpJob)
	Dim success As Boolean = False
	If j.Success Then
		Dim responseText As String = j.GetString
		SaveServerSnapshot("POST", requestUrl, True, responseText, "")
		success = IsHistoryBatchAccepted(responseText)
	Else
		SaveServerSnapshot("POST", requestUrl, False, "", j.ErrorMessage)
	End If
	If success Then
		DeleteHistoryPendingFile(pendingHistoryFileName)
		RefreshPendingHistoryState
		TraceLog("Локальный буфер истории обновлен. removedFile=" & pendingHistoryFileName & ", pendingFiles=" & GetPendingHistoryFileCount)
	End If
	TraceLog("SendHistory complete. success=" & success)
	j.Release
	isHistoryFlushInProgress = False
	Return success
End Sub

Private Sub ClearHistoryLogTimer
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

Private Sub AppendHistoryRecord(recordDate As String, record As Map)
	If recordDate = "" Then Return
	EnsureDirectory(GetHistoryDir)
	Dim generator As JSONGenerator
	generator.Initialize(record)
	Dim outStream As OutputStream = File.OpenOutput(GetHistoryDir, HistoryFileName(recordDate), True)
	Dim writer As TextWriter
	writer.Initialize2(outStream, "UTF8")
	writer.WriteLine(generator.ToString)
	writer.Close
	storage.Put("pending_history_count", storage.GetDefault("pending_history_count", 0) + 1)
End Sub

Private Sub RefreshPendingHistoryState
	storage.Put("pending_history_count", CountAllPendingHistoryRecords)
End Sub

Private Sub GetPendingHistoryFileCount As Int
	If File.Exists(GetHistoryDir, "") = False Then Return 0
	Dim listedFiles As List = File.ListFiles(GetHistoryDir)
	If listedFiles.IsInitialized = False Then Return 0
	Dim count As Int = 0
	For Each fileName As String In listedFiles
		If IsHistoryFileName(fileName) Then count = count + 1
	Next
	Return count
End Sub

Private Sub CountAllPendingHistoryRecords As Int
	If File.Exists(GetHistoryDir, "") = False Then Return 0
	Dim listedFiles As List = File.ListFiles(GetHistoryDir)
	If listedFiles.IsInitialized = False Then Return 0
	Dim total As Int = 0
	For Each fileName As String In listedFiles
		If IsHistoryFileName(fileName) = False Then Continue
		Try
			total = total + CountNdjsonRecords(File.ReadString(GetHistoryDir, fileName))
		Catch
			Log(LastException.Message)
		End Try
	Next
	Return total
End Sub

Private Sub CountNdjsonRecords(payload As String) As Int
	Dim normalized As String = NormalizeNdjsonPayload(payload)
	If normalized = "" Then Return 0
	Dim rows() As String = Regex.Split(CRLF, normalized)
	Dim count As Int = 0
	For Each row As String In rows
		If row.Trim <> "" Then count = count + 1
	Next
	Return count
End Sub

Private Sub IsHistoryBatchAccepted(responseText As String) As Boolean
	Try
		Dim parser As JSONParser
		parser.Initialize(responseText)
		Dim response As Map = parser.NextObject
		Return response.GetDefault("ok", False) = True
	Catch
		TraceLog("История: не удалось разобрать ответ сервера.")
	End Try
	Return False
End Sub

Private Sub NormalizeNdjsonPayload(payload As String) As String
	If payload = Null Then Return ""
	Dim lineFeed As String = Chr(10)
	Dim normalized As String = payload.Replace(CRLF, lineFeed).Replace(Chr(13), lineFeed)
	Do While normalized.Contains(lineFeed & lineFeed)
		normalized = normalized.Replace(lineFeed & lineFeed, lineFeed)
	Loop
	normalized = normalized.Trim
	If normalized = "" Then Return ""
	Return normalized.Replace(lineFeed, CRLF)
End Sub

Private Sub GetOldestPendingHistoryFileName As String
	If File.Exists(GetHistoryDir, "") = False Then Return ""
	Dim listedFiles As List = File.ListFiles(GetHistoryDir)
	If listedFiles.IsInitialized = False Or listedFiles.Size = 0 Then Return ""
	Dim historyFiles As List
	historyFiles.Initialize
	For Each fileName As String In listedFiles
		If IsHistoryFileName(fileName) Then historyFiles.Add(fileName)
	Next
	If historyFiles.Size = 0 Then Return ""
	historyFiles.Sort(True)
	Return historyFiles.Get(0)
End Sub

Private Sub IsHistoryFileName(fileName As String) As Boolean
	If fileName = "" Then Return False
	If fileName.EndsWith(".ndjson") = False Then Return False
	Return Regex.IsMatch("^\d{4}-\d{2}-\d{2}\.ndjson$", fileName)
End Sub

Private Sub HistoryFileName(recordDate As String) As String
	Return recordDate & ".ndjson"
End Sub

Private Sub HistoryFileNameToDate(fileName As String) As String
	If IsHistoryFileName(fileName) = False Then Return ""
	Return fileName.SubString2(0, fileName.Length - 7)
End Sub

Private Sub DeleteHistoryPendingFile(fileName As String)
	If fileName = "" Then Return
	If File.Exists(GetHistoryDir, fileName) Then File.Delete(GetHistoryDir, fileName)
End Sub

Private Sub GetHistoryDir As String
	Return File.Combine(storageDir, historyDirName)
End Sub

Private Sub StopPlayer As ResumableSub
	If isStopping Then Return False
	isStopping = True
	TraceLog("StopPlayer requested. currentType=" & currentMediaType & ", activeAudio=" & activeAudioKey & ", preparedAudio=" & preparedAudioKey)
	isStarted = False
	isStoppedByUser = True
	isPlaybackPausedByPolicy = False
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
	If isOfflinePlaybackMode Then
		UpdateConnectionIndicator("offline")
	Else
		UpdateConnectionIndicator("online")
	End If
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
	If activeItem.GetDefault("type", "") = "ad" Then
		TraceLog("История подтверждена. reason=ad_complete, item=" & DescribeItem(activeItem))
		QueueHistoryRecordAt(activeItem, historyStartedAtTicks)
		ClearHistoryLogTimer
	End If
	If PromotePreparedPlayer(0, 0) Then Return True
	Wait For (PlayPreparedOrLoadNext) Complete (unused As Boolean)
	Return True
End Sub

Private Sub HandleAudioTimeupdate(audioKey As String) As ResumableSub
	If audioKey <> activeAudioKey Then Return False
	If isStarted = False Or isStoppedByUser Then Return False
	If historyItem.IsInitialized Then
		If historyItem.GetDefault("type", "") = "track" And currentTrackUrl <> "" And historyItem.GetDefault("id", "") = activeItem.GetDefault("id", "") And historyItem.GetDefault("type", "") = activeItem.GetDefault("type", "") Then
			ConfirmPendingHistoryItem("timeupdate")
		End If
	End If
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
	appTraceService.Trace(message)
End Sub

Public Sub GetTraceLogText As String
	Return appTraceService.GetTraceText
End Sub

Public Sub GetTraceLogList As List
	Return appTraceService.GetTraceList
End Sub

Public Sub GetServerTraceText As String
	Return appTraceService.GetServerTraceText
End Sub

Public Sub GetServerTraceList As List
	Return appTraceService.GetServerTraceList
End Sub

Private Sub SaveServerSnapshot(method As String, url As String, success As Boolean, body As String, errorMessage As String)
	appTraceService.SaveServerSnapshot(method, url, success, body, errorMessage)
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

Private Sub UpdateConnectionIndicator(mode As String)
	If lblConnectionIcon.IsInitialized = False Then Return
	Dim iconText As String = ICON_CLOUD_OK
	Dim iconColor As Int = 0xFF747B86
	Select mode
		Case "online"
			iconText = ICON_CLOUD_OK
			iconColor = 0xFFD0FF71
		Case "offline"
			iconText = ICON_CLOUD_OFF
			iconColor = 0xFFFF6B6B
		Case "server"
			iconText = ICON_CLOUD_OFF
			iconColor = 0xFFFF6B6B
		Case "connecting"
			iconText = ICON_CLOUD_OK
			iconColor = 0xFF8E97A3
		Case Else
			iconText = ICON_CLOUD_OK
			iconColor = 0xFF747B86
	End Select
	lblConnectionIcon.Text = iconText
	SetLabelStyle(lblConnectionIcon, "-fx-alignment: center; -fx-text-fill: " & ColorToCss(iconColor) & ";")
	ApplyMaterialIconFont(lblConnectionIcon, 16)
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
	Dim localUri As String = mediaCacheService.ResolveLocalMediaUri(item)
	If localUri <> "" Then Return localUri
	If isOfflinePlaybackMode Then Return ""
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

Private Sub EnsureSinglePlaylistMetadata(descriptor As Map) As ResumableSub
	Dim cachedPlaylistIndex As Map = offlineStoreService.GetCachedPlaylistIndex
	Wait For (DownloadOfflinePlaylistMetadata(descriptor, cachedPlaylistIndex)) Complete (downloaded As Boolean)
	If downloaded Then offlineStoreService.SaveCachedPlaylistIndex(cachedPlaylistIndex)
	Return downloaded
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

Private Sub CurrentSecondOfMinute As Int
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "ss"
	Dim value As Int = DateTime.Time(EffectiveNowTicks)
	DateTime.TimeFormat = previousTimeFormat
	Return value
End Sub

Private Sub SyncOfflinePlaylistMetadata As ResumableSub
	Dim playlistDescriptors As List = offlineStoreService.GetStoredPlaylistDescriptors
	If playlistDescriptors.IsInitialized = False Or playlistDescriptors.Size = 0 Then
		TraceLog("Для синхронизации playlist metadata ничего не найдено.")
		Return False
	End If
	EnsureDirectory(offlineStoreService.GetOfflinePlaylistsDir)
	Dim cachedPlaylistIndex As Map = offlineStoreService.GetCachedPlaylistIndex
	Dim downloadedCount As Int = 0
	Dim updatedCount As Int = 0
	Dim failedCount As Int = 0
	For Each descriptorObject As Object In playlistDescriptors
		If descriptorObject Is Map Then
			Dim descriptor As Map = descriptorObject
			Dim syncAction As String = offlineStoreService.ResolvePlaylistSyncAction(descriptor, cachedPlaylistIndex)
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
	offlineStoreService.SaveCachedPlaylistIndex(cachedPlaylistIndex)
	offlineStoreService.RefreshPlaylistCacheStatus(playlistDescriptors)
	Dim actualCount As Int = storage.GetDefault("offline_playlist_actual_count", 0)
	TraceLog("Синхронизация playlist metadata завершена. downloaded=" & downloadedCount & ", updated=" & updatedCount & ", failed=" & failedCount & ", actual=" & actualCount)
	Return failedCount = 0
End Sub

Private Sub DownloadOfflinePlaylistMetadata(descriptor As Map, cachedPlaylistIndex As Map) As ResumableSub
	Dim playlistId As String = descriptor.GetDefault("id", "")
	If playlistId = "" Then Return False
	Dim playlistUrl As String = offlineStoreService.PlaylistMetadataUrl(playlistId)
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
	offlineStoreService.SavePlaylistMetadata(descriptor, playlistData, cachedPlaylistIndex)
	Return True
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
	Return Floor(EffectiveNowTicks / 1000) - (TimezoneOffsetMinutes * 60)
End Sub

Private Sub EffectiveNowTicks As Long
	Dim deviceNow As Long = DateTime.Now
	Dim trustedNow As Long = storage.GetDefault(trustedOnlineTimeKey, 0)
	If trustedNow > deviceNow Then Return trustedNow
	Return deviceNow
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
	Return UiStyle.CreateLabel(xui, text, fontSize, textColor, bold, wrapText)
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
	UiStyle.ApplyMaterialIconFont(xui, view, fontSize)
End Sub

Private Sub SetPaneStyle(view As B4XView, style As String)
	UiStyle.SetPaneStyle(view, style)
End Sub

Private Sub SetLabelStyle(view As B4XView, style As String)
	UiStyle.SetLabelStyle(view, style)
End Sub

Private Sub SetPickOnBounds(view As B4XView, value As Boolean)
	UiStyle.SetPickOnBounds(view, value)
End Sub

Private Sub ScaleValue(availableWidth As Int, smallValue As Int, mediumValue As Int, largeValue As Int) As Int
	Return UiStyle.ScaleValue(availableWidth, smallValue, mediumValue, largeValue)
End Sub

Private Sub ColorToCss(color As Int) As String
	Return UiStyle.ColorToCss(color)
End Sub
