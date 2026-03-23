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

' Главный модуль приложения и orchestration layer playback.
' Здесь живут UI, network/data refresh и основной director-driven поток воспроизведения.

Sub Class_Globals
	Private Const NEXT_BASE_URL As String = "https://play.fon.fm/next"
	Private Const CLAIM_BASE_URL As String = "https://play.fon.fm/claim"
	Private Const HISTORY_BASE_URL As String = "https://play.fon.fm/history"
	Private Const TRACE_BASE_URL As String = "https://play.fon.fm/trace"
	Private Const CLIENT_HEADER_NAME As String = "X-Fonfm-Client"
	Private Const CLIENT_HEADER_VALUE As String = "windows-player"
	Private Const HISTORY_FLUSH_INTERVAL_MS As Int = 30000
Private Const TRACE_FLUSH_INTERVAL_MS As Int = 60 * 1000
	Private Const DATA_BASE_URL As String = "https://play.fon.fm/data"
	Private Const PLAYLIST_CDN_BASE_URL As String = "https://cdn.fon.fm/data/playlists/"
	Private Const SERVICE_CHECK_URL As String = "https://play.fon.fm/data"
	Private Const USE_DATA_PLAYBACK_RESOLVER As Boolean = True
	Private Const ICON_PLAY As String = Chr(0xE037)
	Private Const ICON_STOP As String = Chr(0xE047)
	Private Const ICON_MORE As String = Chr(0xE5D3)
	Private Const ICON_CLOSE As String = Chr(0xE5CD)
	Private Const ICON_CLOUD_OK As String = Chr(0xE2BF)
	Private Const ICON_CLOUD_OFF As String = Chr(0xE2C1)
	Private Const ICON_CLOUD_DEGRADED As String = Chr(0xE2C2)
	Private Const PREFETCH_SECONDS As Int = 10
	Private Const STOP_FADE_MS As Int = 3000
	Private Const ORBIT_FADE_MS As Int = 3000
	Private Const START_FADE_MS As Int = 1500
	Private Const TRACK_OVERLAP_MS As Int = 1800
	Private Const AD_TAIL_OVERLAP_MS As Int = 350
	Private Const TRACK_CACHE_WARMUP_DELAY_MS As Int = 7000
	Private Const LOOKAHEAD_QUEUE_TARGET_ITEMS As Int = 2
	Private Const CACHE_AUDIT_START_DELAY_MS As Int = 20000
	Private Const CACHE_AUDIT_STEP_INTERVAL_MS As Int = 2000
	Private Const CACHE_AUDIT_RECHECK_INTERVAL_MS As Int = 30 * 60 * 1000
	Private Const TRACK_CACHE_PRUNE_COOLDOWN_MS As Long = 10 * 60 * 1000
	Private Const DATA_REFRESH_MS As Int = 5 * 60 * 1000
	Private Const FETCH_TIMEOUT_MS As Int = 4000
	Private Const AUDIO_READY_TIMEOUT_MS As Int = 5000
	' После серии подряд audio errors считаем, что проблема, скорее всего, во внешнем audio output,
	' и уходим в редкий recovery probe вместо бесконечного цикла load/play/error.
	Private Const AUDIO_OUTPUT_ERROR_PAUSE_THRESHOLD As Int = 3
	Private Const AUDIO_OUTPUT_RETRY_DELAY_MS As Int = 15000
	Private Const PLAYBACK_WATCHDOG_INTERVAL_MS As Int = 1000
	Private Const PLAYBACK_DIRECTOR_INTERVAL_MS As Int = 250
	Private Const PLAYBACK_WATCHDOG_STALL_MS As Long = 4000
	Private Const PLAYBACK_WATCHDOG_RECOVERY_COOLDOWN_MS As Long = 10000
	Private Const PLAYBACK_WATCHDOG_PROGRESS_DELTA_MS As Long = 150
	Private Const PLAYBACK_WATCHDOG_GRACE_MS As Long = 3000
	Private Const TRACE_ERROR_DEBUG_CONTEXT_LINES As Int = 8
	Private Const PAUSE_RETRY_DELAY As Int = 300000
	Private Const LOCAL_RETRY_DELAY_INITIAL As Int = 5000
	Private Const LOCAL_RETRY_DELAY_MAX As Int = 30000
	Private Const SERVER_RETRY_DELAY_INITIAL As Int = 10000
	Private Const SERVER_RETRY_DELAY_MAX As Int = 60000
	Private Const BLOCKED_RETRY_DELAY As Int = 60000
	Private Const FLOW_IDLE As String = "idle"
	Private Const FLOW_STARTING As String = "starting"
	Private Const FLOW_PLAYING As String = "playing"
	Private Const FLOW_PREPARING As String = "preparing"
	Private Const FLOW_TRANSITIONING As String = "transitioning"
	Private Const FLOW_STOPPING As String = "stopping"
	Private Const FLOW_PAUSED_POLICY As String = "paused_policy"
	Private Const FLOW_ERROR As String = "error"
	Private rootView As B4XView
	Private xui As XUI
	Private storageDir As String
	Private storageFile As String = "player_state.json"
	Private localStateDbName As String = "LocalState"
	Private trustedSyncTimeKey As String = "trusted_sync_time_ticks"
	Private playerDataFile As String = "player_data.json"
	Private playlistRequirementsFile As String = "playlist_requirements.json"
	Private localPlaylistsDirName As String = "playlists"
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
	Private headerActionFontSize As Float
	Private codeFontSize As Float
	Private isCodeInputFocused As Boolean

	Private audioPrimary As AudioPlayer
	Private audioSecondary As AudioPlayer
	Private localAdScheduler As AdScheduler
	Private dataResolver As DataPlaybackResolver
	Private offlineStoreService As OfflineStore
	Private appTraceService As TraceService
	Private traceFormatter As PlaybackTraceFormatter
	Private traceRouter As PlaybackTraceRouter
	Private traceUploader As PlaybackTraceUploader
	Private mediaCacheService As MediaCache
	Private storage As KeyValueStore
	Private playQueue As List
	Private messages As Map
	Private traceLogLimit As Int = 1000
	Private serverSnapshotLimit As Int = 30
	Private retryTimer As Timer
	Private breakTimer As Timer
	Private historyFlushTimer As Timer
	Private traceUploadTimer As Timer
	Private orbitTimer As Timer
	Private offlineDataRefreshTimer As Timer
	Private localAdMinuteTimer As Timer
	Private trackCacheWarmupTimer As Timer
	Private cacheAuditTimer As Timer
	Private playbackWatchdogTimer As Timer
	Private playbackDirectorTimer As Timer
	Private machineGuidShell As Shell

	Private playerCode As String
	Private deviceId As String
	Private appScreenMode As String
	Private nextStartMode As String
	Private runtimeState As PlaybackRuntimeState
	Private metaState As PlaybackMetaState
	Private orchestrationState As PlaybackOrchestrationState
	Private dataPolicyState As PlaybackDataPolicyState
	Private retryFallbackState As PlaybackRetryFallbackState
	Private queueState As PlaybackQueueState
	Private queueBuilder As PlaybackQueueBuilder
	Private transitionCoordinator As PlaybackTransitionCoordinator
	Private facade As PlaybackFacade
	Private responseAdapter As PlaybackResponseAdapter
	Private playerDataCoordinator As PlaybackDataCoordinator
	Private stateStore As PlayerStateStore
	Private syncService As NetworkSyncService
	Private uiController As PlayerUiController
	Private directorState As PlaybackDirectorState
	Private initialStartFadePending As Boolean
	Private isHistoryFlushInProgress As Boolean
	Private cachedRelevantTrackIds As List
	Private lastTrackCachePruneAt As Long
	Private consecutiveAudioOutputErrors As Int
	Private isAudioOutputRecoveryPause As Boolean
	Private lastPlaybackWatchdogPositionMs As Long
	Private lastPlaybackWatchdogTrackId As String
	Private lastPlaybackWatchdogProgressAt As Long
	Private lastPlaybackWatchdogRecoveryAt As Long
	Private isPlaybackWatchdogTickInProgress As Boolean
	Private playbackActivationToken As Long

	Private playlistIndex As Int = -1
	Private orbitPulseStep As Int
	Private isStartupSequenceInProgress As Boolean
	Private isAdWarmupDeferredAfterStartup As Boolean
	Private isPostStartTasksDeferredAfterStartup As Boolean
	Private playbackFlowState As String
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (root1 As B4XView)
	rootView = root1
	B4XPages.SetTitle(Me, Main.LabelName)
	rootView.Color = 0xFF0E0F11
	InitSettings
	InitState
	BuildUi
	uiController.Initialize(xui, lblStream, lblInfo, lblHeader, lblConnectionIcon, lblHeaderAction, lblSetupMessage, lblPlayIcon, confirmPane, btnConfirmYes, btnConfirmNo, setupPane, playerPane, headerActionPane, playButtonPane, orbitPane, accessCirclePane, accessCorePane, accessInputPane, btnSetupSubmit, txtPlayerCode, txtPlayerCodeView, ICON_CLOUD_OK, ICON_CLOUD_OFF, ICON_CLOUD_DEGRADED, ICON_MORE, ICON_CLOSE, ICON_PLAY, ICON_STOP)
	UpdateVisibleMode
	RestoreWindowState
	audioPrimary.Initialize("AudioPrimary", Me)
	audioSecondary.Initialize("AudioSecondary", Me)
	TraceInfo("app", "запуск", "version=" & ResolveAppVersion & " player=" & FormatPlayerCodeForDisplay(playerCode))
	TraceInfo("system", "устройство", "name=" & ResolveDeviceTraceName & " id=" & deviceId)
	TraceInfo("system", "платформа", "os=" & ResolveClientPlatformText)
	TraceInfo("system", "диск", "diskFreeMb=" & ResolveFreeDiskMbText & " diskTotalMb=" & ResolveTotalDiskMbText)
	WriteHealthSnapshot("запуск")
	StartOfflineDataRefresh
	ShowInitialScreen
End Sub

Private Sub B4XPage_Resize (width As Int, height As Int)
	If card.IsInitialized = False Then Return
	LayoutUi(width, height)
End Sub

' Инициализирует локальные сообщения, форматы времени и базовые UI/trace-строки.
Private Sub InitSettings
	DateTime.DateFormat = "dd.MM.yyyy"
	DateTime.TimeFormat = "HH:mm:ss"
	messages.Initialize
	messages.Put("offline", "Проверьте интернет")
	messages.Put("connecting", "Подключение...")
	messages.Put("syncing", "Синхронизация...")
	messages.Put("server_wait", "Временная остановка")
	messages.Put("playback_paused", "Воспроизведение приостановлено")
	messages.Put("audio_device_check", "Проверьте звуковое устройство")
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
	messages.Put("setup_placeholder", "")
	messages.Put("setup_submit", "Войти")
	messages.Put("setup_invalid", "Введите код из 5 символов")
	messages.Put("logout", "Выйти")
	messages.Put("settings_open", "Настройки")
	messages.Put("settings_close", "Закрыть")
	messages.Put("settings_thanks", "Спасибо!")
End Sub

Private Sub ResolveAppVersion As String
	If Main.VersionName <> "" Then Return Main.VersionName
	Return "" & Main.VersionCode
End Sub

Private Sub IsReleaseBuild As Boolean
	#If Release
	Return True
	#Else
	Return False
	#End If
End Sub

Private Sub ConsumeLastException
	Dim ignored As String = LastException.Message
	If ignored = "__never__" Then Return
End Sub

Private Sub InitState
	storageDir = File.DirData("fonfm")
	debugResponsesDir = File.Combine(storageDir, "debugresponses")
	EnsureDirectory(storageDir)
	EnsureDirectory(GetHistoryDir)
	RndSeed(DateTime.Now)
	storage.Initialize(storageDir, localStateDbName)
	MigrateLegacyStorageIfNeeded
	playerCode = NormalizePlayerCode(storage.GetDefault("player_code", ""))
	appTraceService.Initialize(storageDir, debugResponsesDir, traceLogLimit, serverSnapshotLimit)
	traceFormatter.Initialize
	traceRouter.Initialize(appTraceService, traceFormatter, IsReleaseBuild, TRACE_ERROR_DEBUG_CONTEXT_LINES)
	playQueue.Initialize
	orchestrationState.Initialize
	runtimeState.Initialize
	metaState.Initialize
	dataPolicyState.Initialize
	retryFallbackState.Initialize(LOCAL_RETRY_DELAY_INITIAL, SERVER_RETRY_DELAY_INITIAL)
	queueState.Initialize
	directorState.Initialize
	directorState.ConfigureDefaultSlots
	queueBuilder.Initialize(Me)
	transitionCoordinator.Initialize(Me)
	facade.Initialize(Me)
	responseAdapter.Initialize
	localAdScheduler.Initialize(Me, "TraceLog", MessageValue("ad_label"))
	dataResolver.Initialize(storageDir, Me, "TraceLog")
	dataResolver.LoadState(storage)
	TraceLog("курсор плейлистов load count=" & dataResolver.CursorCount)
	deviceId = GetOrCreateDeviceId
	mediaCacheService.Initialize(storageDir, storage, Me, "TraceLog", deviceId)
	mediaCacheService.CleanupPlaybackTempFiles
	retryTimer.Initialize("RetryTimer", SERVER_RETRY_DELAY_INITIAL)
	breakTimer.Initialize("BreakTimer", 1000)
	historyFlushTimer.Initialize("HistoryFlushTimer", HISTORY_FLUSH_INTERVAL_MS)
	traceUploadTimer.Initialize("TraceUploadTimer", TRACE_FLUSH_INTERVAL_MS)
	orbitTimer.Initialize("OrbitTimer", 70)
	offlineDataRefreshTimer.Initialize("OfflineDataRefreshTimer", DATA_REFRESH_MS)
	localAdMinuteTimer.Initialize("LocalAdMinuteTimer", 1000)
	trackCacheWarmupTimer.Initialize("TrackCacheWarmupTimer", TRACK_CACHE_WARMUP_DELAY_MS)
	cacheAuditTimer.Initialize("CacheAuditTimer", CACHE_AUDIT_START_DELAY_MS)
	playbackWatchdogTimer.Initialize("PlaybackWatchdogTimer", PLAYBACK_WATCHDOG_INTERVAL_MS)
	playbackDirectorTimer.Initialize("PlaybackDirectorTimer", PLAYBACK_DIRECTOR_INTERVAL_MS)
	offlineStoreService.Initialize(storageDir, storage, Me, "TraceLog", playerDataFile, playlistRequirementsFile, localPlaylistsDirName, PLAYLIST_CDN_BASE_URL)
	stateStore.Initialize(Me, retryTimer, dataPolicyState, orchestrationState, retryFallbackState, queueState, queueBuilder, storage, trustedSyncTimeKey, offlineStoreService, dataResolver, mediaCacheService)
	syncService.Initialize(stateStore)
	traceUploader.Initialize(stateStore, appTraceService, syncService, TRACE_BASE_URL, ResolveAppVersion)
	playerDataCoordinator.Initialize(stateStore, syncService)
	playbackWatchdogTimer.Enabled = True
	playbackDirectorTimer.Enabled = True
	isHistoryFlushInProgress = False
	isPlaybackWatchdogTickInProgress = False
	isStartupSequenceInProgress = False
	stateStore.SetStartupSequenceInProgress(False)
	isAdWarmupDeferredAfterStartup = False
	isPostStartTasksDeferredAfterStartup = False
	cachedRelevantTrackIds.Initialize
	lastTrackCachePruneAt = 0
	playbackFlowState = FLOW_IDLE
	ResetPlaybackWatchdogState
	directorState.SetFlowState(playbackFlowState)
	MirrorRuntimeStateFromDirector
	stateStore.SetOfflineData(offlineStoreService.LoadOfflineData)
	RefreshPendingHistoryState
	ResolveMachineGuidAsync
	TraceLog("состояние init dir=" & storageDir & " player=" & FormatPlayerCodeForDisplay(playerCode))
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
	lblFooter = CreateLabel(Main.LabelName & " " & ResolveAppVersion, 12, 0xFF747B86, False, True)
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
	UpdateResponsiveStyles(safeWidth)

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

	Dim connectionIconSize As Int = ScaleValue(safeWidth, 18dip, 20dip, 20dip)
	Dim footerGap As Int = 8dip
	Dim footerTextWidth As Int = MeasureViewTextWidth(lblFooter)
	Dim footerGroupWidth As Int = connectionIconSize + footerGap + footerTextWidth
	Dim footerGroupLeft As Int = Max(horizontalPad, (cardWidth - footerGroupWidth) / 2)
	lblConnectionIcon.SetLayoutAnimated(0, footerGroupLeft, (footerHeight - connectionIconSize) / 2, connectionIconSize, connectionIconSize)
	lblFooter.SetLayoutAnimated(0, footerGroupLeft + connectionIconSize + footerGap, 0, footerTextWidth + 4dip, footerHeight)
	UpdateVisibleMode
End Sub

Private Sub MeasureViewTextWidth(view As B4XView) As Int
	Dim textNode As JavaObject
	textNode.InitializeNewInstance("javafx.scene.text.Text", Array As Object(view.Text))
	Dim fontObject As JavaObject = view.Font
	textNode.RunMethod("setFont", Array As Object(fontObject))
	Dim bounds As JavaObject = textNode.RunMethod("getLayoutBounds", Null)
	Return Ceil(bounds.RunMethod("getWidth", Null))
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

	lblStream.Font = xui.CreateDefaultBoldFont(streamFontSize)
	lblInfo.Font = xui.CreateDefaultFont(infoFontSize)
	lblHeader.Font = xui.CreateDefaultFont(12)
	lblFooter.Font = xui.CreateDefaultFont(12)
	headerActionFontSize = headerActionSize
	codeFontSize = codeSize
	UiStyle.ApplyMaterialIconFont(xui, lblConnectionIcon, 16)
	card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFFFF, cardRadius)
	uiController.UpdateResponsiveStyles(streamFontSize, infoFontSize, playFontSize, stopFontSize, headerActionSize, codeSize, isCodeInputFocused, orchestrationState.IsStarted Or dataPolicyState.IsPlaybackPausedByPolicy Or isStartupSequenceInProgress)
End Sub

Private Sub ShowInitialScreen
	If playerCode = "" Then
		ShowSetupScreen("")
	Else
		ShowPlayerScreen(True)
		SetStopIcon
		UpdateConnectionIndicator("connecting")
		AutoStartSavedPlayer
	End If
End Sub

Private Sub StartOfflineDataRefresh
	offlineDataRefreshTimer.Enabled = False
	historyFlushTimer.Enabled = False
	traceUploadTimer.Enabled = False
	localAdMinuteTimer.Interval = 1000
	localAdMinuteTimer.Enabled = True
	If playerCode = "" Then Return
	offlineDataRefreshTimer.Interval = DATA_REFRESH_MS
	offlineDataRefreshTimer.Enabled = True
	historyFlushTimer.Interval = HISTORY_FLUSH_INTERVAL_MS
	historyFlushTimer.Enabled = True
	traceUploadTimer.Interval = TRACE_FLUSH_INTERVAL_MS
	traceUploadTimer.Enabled = True
	cacheAuditTimer.Enabled = False
End Sub

Private Sub HistoryFlushTimer_Tick
	If playerCode = "" Then Return
	If GetPendingHistoryFileCount <= 0 Then Return
	If isHistoryFlushInProgress Then Return
	FlushHistoryBufferAsync
End Sub

Private Sub FlushHistoryBufferAsync
	Wait For (FlushHistoryBuffer) Complete (unused As Boolean)
End Sub

Private Sub FlushTraceBufferAsync
	traceUploader.FlushTraceBufferAsync
End Sub

Private Sub TraceUploadTimer_Tick
	If playerCode = "" Or deviceId = "" Then Return
	If traceUploader.IsUploadInProgress Then Return
	WriteHealthSnapshot("таймер")
	If traceUploader.IsTraceUploadEnabled = False Then Return
	traceUploader.FlushTraceBufferAsync
End Sub

Private Sub EnsureAdCacheSyncAsync
	If isStartupSequenceInProgress Then
		isAdWarmupDeferredAfterStartup = True
		Return
	End If
	Dim offlineData As Map = stateStore.OfflineData
	If offlineData.IsInitialized = False Then Return
	If offlineData.GetDefault("ok", False) <> True Then Return
	Wait For (mediaCacheService.EnsureAdsCached(offlineData)) Complete (downloaded As Boolean)
	UpdateMediaConnectivityStateFromCacheSync(downloaded)
End Sub

Private Sub EnsureUpcomingTracksCachedAsync
	If dataPolicyState.BeginTrackCacheRefresh = False Then Return
	If USE_DATA_PLAYBACK_RESOLVER And metaState.CurrentMediaType = "track" And CanUseDataPlaybackResolver Then
		If playQueue.Size < LOOKAHEAD_QUEUE_TARGET_ITEMS Then
			Wait For (stateStore.TryEnsureQueueLookahead(playQueue, LOOKAHEAD_QUEUE_TARGET_ITEMS)) Complete (queuePrepared As Boolean)
		End If
	End If
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
	If trackItems.Size = 0 Then
		dataPolicyState.EndTrackCacheRefresh
		Return
	End If
	Wait For (mediaCacheService.EnsureTracksCached(trackItems, 5)) Complete (downloaded As Boolean)
	UpdateMediaConnectivityStateFromCacheSync(downloaded)
	PruneTrackCacheIfNeeded("track_warmup")
	dataPolicyState.EndTrackCacheRefresh
End Sub

Private Sub ScheduleTrackCacheWarmup
	trackCacheWarmupTimer.Enabled = False
	If isStartupSequenceInProgress Then
		RequestDeferredPostStartTasks
		Return
	End If
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Then Return
	If metaState.CurrentMediaType <> "track" Then Return
	If playQueue.IsInitialized = False Or playQueue.Size = 0 Then Return
	trackCacheWarmupTimer.Interval = TRACK_CACHE_WARMUP_DELAY_MS
	trackCacheWarmupTimer.Enabled = True
End Sub

Private Sub TrackCacheWarmupTimer_Tick
	trackCacheWarmupTimer.Enabled = False
	EnsureUpcomingTracksCachedAsync
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
		PruneTrackCacheIfNeeded("cache_audit")
		WriteSystemSnapshot("cache_worker")
		cacheAuditTimer.Interval = CACHE_AUDIT_RECHECK_INTERVAL_MS
	End If
	cacheAuditTimer.Enabled = True
End Sub

Private Sub PruneTrackCacheIfNeeded(initiator As String)
	If DateTime.Now - lastTrackCachePruneAt < TRACK_CACHE_PRUNE_COOLDOWN_MS Then Return
	Dim protectedTrackIds As List = CollectProtectedTrackIds
	Dim relevantTrackIds As List = CollectRelevantTrackIds
	Dim removedCount As Int = mediaCacheService.PruneTrackCacheIfNeeded(protectedTrackIds, relevantTrackIds)
	If removedCount > 0 Then
		lastTrackCachePruneAt = DateTime.Now
		TraceLog("кэш треков очистка итог initiator=" & initiator & " removed=" & removedCount)
	End If
End Sub

Private Sub CollectProtectedTrackIds As List
	Dim result As List
	result.Initialize
	Dim protectedIds As Map
	protectedIds.Initialize
	AddProtectedTrackId(protectedIds, Transition_GetDirectorActiveItem)
	AddProtectedTrackId(protectedIds, Transition_GetDirectorPreparedItem)
	AddProtectedTrackId(protectedIds, Transition_GetDirectorPendingPlayItem("primary"))
	AddProtectedTrackId(protectedIds, Transition_GetDirectorPendingPlayItem("secondary"))
	AddProtectedTrackId(protectedIds, Transition_GetDirectorPendingPrepareItem("primary"))
	AddProtectedTrackId(protectedIds, Transition_GetDirectorPendingPrepareItem("secondary"))
	If playQueue.IsInitialized Then
		For Each itemObject As Object In playQueue
			If itemObject Is Map Then
				Dim item As Map = itemObject
				AddProtectedTrackId(protectedIds, item)
			End If
		Next
	End If
	If queueState.StoppedReserveQueue.IsInitialized Then
		For Each itemObject As Object In queueState.StoppedReserveQueue
			If itemObject Is Map Then
				Dim item As Map = itemObject
				AddProtectedTrackId(protectedIds, item)
			End If
		Next
	End If
	For Each trackId As String In protectedIds.Keys
		result.Add(trackId)
	Next
	Return result
End Sub

Private Sub CollectRelevantTrackIds As List
	If cachedRelevantTrackIds.IsInitialized And cachedRelevantTrackIds.Size > 0 Then Return CloneList(cachedRelevantTrackIds)
	Dim result As List
	result.Initialize
	Dim relevantIds As Map
	relevantIds.Initialize
	Dim descriptors As List = offlineStoreService.GetStoredPlaylistDescriptors
	If descriptors.IsInitialized = False Then Return result
	For Each descriptorObject As Object In descriptors
		If descriptorObject Is Map Then
			Dim descriptor As Map = descriptorObject
			Dim playlistId As String = descriptor.GetDefault("id", "")
			If playlistId = "" Then Continue
			Dim playlistData As Map = dataResolver.LoadCachedPlaylistMetadata(playlistId)
			If playlistData.IsInitialized = False Then Continue
			Dim tracks As List = playlistData.GetDefault("tracks", Null)
			If tracks.IsInitialized = False Then Continue
			For Each trackObject As Object In tracks
				If trackObject Is Map Then
					Dim track As Map = trackObject
					Dim trackId As String = track.GetDefault("id", "")
					If trackId <> "" Then relevantIds.Put(trackId, True)
				End If
			Next
		End If
	Next
	For Each trackId As String In relevantIds.Keys
		result.Add(trackId)
	Next
	cachedRelevantTrackIds = CloneList(result)
	Return result
End Sub

Private Sub InvalidateRelevantTrackIdsCache
	If cachedRelevantTrackIds.IsInitialized = False Then cachedRelevantTrackIds.Initialize
	cachedRelevantTrackIds.Clear
End Sub

Private Sub CloneList(source As List) As List
	Dim copy As List
	copy.Initialize
	If source.IsInitialized = False Then Return copy
	For Each item As Object In source
		copy.Add(item)
	Next
	Return copy
End Sub

Private Sub AddProtectedTrackId(protectedIds As Map, item As Map)
	If item.IsInitialized = False Then Return
	If item.GetDefault("type", "") <> "track" Then Return
	Dim trackId As String = item.GetDefault("id", "")
	If trackId = "" Then Return
	protectedIds.Put(trackId, True)
End Sub

Private Sub TryEnterStartupSequence As Boolean
	If isStartupSequenceInProgress Then Return False
	isStartupSequenceInProgress = True
	stateStore.SetStartupSequenceInProgress(True)
	isAdWarmupDeferredAfterStartup = False
	isPostStartTasksDeferredAfterStartup = False
	stateStore.ClearDispatchRetryAfter
	cacheAuditTimer.Enabled = False
	Return True
End Sub

Private Sub CancelDeferredPostStartTasks
	If isAdWarmupDeferredAfterStartup = False And isPostStartTasksDeferredAfterStartup = False Then Return
	isAdWarmupDeferredAfterStartup = False
	isPostStartTasksDeferredAfterStartup = False
End Sub

Private Sub RequestDeferredPostStartTasks
	isPostStartTasksDeferredAfterStartup = True
End Sub

Private Sub CanRunDeferredPostStartTasks As Boolean
	If isStartupSequenceInProgress Then
		Return False
	End If
	If orchestrationState.IsStopping Or orchestrationState.IsStoppedByUser Then
		Return False
	End If
	If orchestrationState.IsStarted = False Then
		Return False
	End If
	Return True
End Sub

Private Sub RunDeferredPostStartTasks
	If isAdWarmupDeferredAfterStartup = False And isPostStartTasksDeferredAfterStartup = False Then Return
	If CanRunDeferredPostStartTasks = False Then
		CancelDeferredPostStartTasks
		Return
	End If
	If isAdWarmupDeferredAfterStartup Then
		isAdWarmupDeferredAfterStartup = False
		EnsureAdCacheSyncAsync
	End If
	If isPostStartTasksDeferredAfterStartup Then
		isPostStartTasksDeferredAfterStartup = False
		BackfillPlaybackQueueAsync
		ScheduleTrackCacheWarmup
	End If
End Sub

Private Sub RunDeferredPostStartTasksAsync
	RunDeferredPostStartTasks
End Sub

Private Sub FailStartupSequence(reason As String)
	If isStartupSequenceInProgress = False Then Return
	CancelDeferredPostStartTasks
	isStartupSequenceInProgress = False
	stateStore.SetStartupSequenceInProgress(False)
	cacheAuditTimer.Interval = CACHE_AUDIT_START_DELAY_MS
	cacheAuditTimer.Enabled = True
	TraceWarn("player", "старт не завершен", "reason=" & reason)
	WriteHealthSnapshot("ошибка_старта")
End Sub

Private Sub CompleteStartupSequence
	facade.CompleteStartupSequence
End Sub

Public Sub Facade_CompleteStartupSequenceCore
	If isStartupSequenceInProgress = False Then Return
	isStartupSequenceInProgress = False
	stateStore.SetStartupSequenceInProgress(False)
	cacheAuditTimer.Interval = CACHE_AUDIT_START_DELAY_MS
	cacheAuditTimer.Enabled = True
	TraceInfo("player", "старт завершен", "stage=" & playbackFlowState)
	RunDeferredPostStartTasksAsync
	WriteHealthSnapshot("старт")
End Sub

Private Sub OfflineDataRefreshTimer_Tick
	Wait For (RefreshOfflineDataNow) Complete (unused As Boolean)
End Sub

Private Sub LocalAdMinuteTimer_Tick
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Or orchestrationState.IsStopping Then Return
	If CurrentSecondOfMinute < 50 Then Return
	PreScanUpcomingAdMinute(True)
End Sub

Private Sub RefreshOfflineDataNow As ResumableSub
	Wait For (playerDataCoordinator.RefreshOfflineDataNow(FETCH_TIMEOUT_MS)) Complete (refreshed As Boolean)
	Return refreshed
End Sub

Private Sub ResumePlaybackAfterPolicyPause
	Wait For (facade.ResumePlaybackAfterPolicyPause) Complete (unused As Boolean)
End Sub

Public Sub Facade_ResumePlaybackAfterPolicyPauseCore As ResumableSub
	If CanResumePlaybackNow("policy_pause", True) = False Then Return False
	If ShouldResumeWithNewStart = False Then
		TraceLog("возобновление запрет reason=policy_pause state=no_new_start")
		Return False
	End If
	TraceLog("возобновление итог mode=auto_restart")
	Wait For (StartFirstTrack("auto")) Complete (unused As Boolean)
	Return True
End Sub

Private Sub CanUseDataPlaybackResolver As Boolean
	If USE_DATA_PLAYBACK_RESOLVER = False Then Return False
	Return stateStore.CanUseDataPlaybackResolver
End Sub

Private Sub RequestSkipQueueSnapshotRestore(reason As String)
	stateStore.RequestSkipQueueSnapshotRestore(reason)
End Sub

Private Sub SaveQueueSnapshotState
	stateStore.SaveQueueSnapshotState(playQueue)
End Sub

Public Sub GetQueueBuilderOfflineData As Map
	Return stateStore.OfflineData
End Sub

Public Sub QueueBuilder_RefreshOfflineDataNow As ResumableSub
	Wait For (RefreshOfflineDataNow) Complete (refreshed As Boolean)
	Return refreshed
End Sub

Public Sub QueueBuilder_EnsureSinglePlaylistMetadata(descriptor As Map) As ResumableSub
	Wait For (EnsureSinglePlaylistMetadata(descriptor)) Complete (downloaded As Boolean)
	Return downloaded
End Sub

Public Sub Transition_SetPlaybackFlowState(args As Map)
	SetPlaybackFlowState(args.GetDefault("state", FLOW_IDLE), args.GetDefault("reason", "transition"))
End Sub

Public Sub Transition_ResolvePlaybackMediaUrl(args As Map) As String
	Return ResolvePlaybackMediaUrl(args.GetDefault("audioKey", ""), args.Get("item"))
End Sub

Public Sub Transition_CurrentVolume(item As Map) As Double
	Return CurrentVolume(item)
End Sub

Public Sub Transition_GetAudioByKey(audioKey As String) As AudioPlayer
	Return GetAudioByKey(audioKey)
End Sub

Public Sub Transition_SaveQueueSnapshotState
	SaveQueueSnapshotState
End Sub

Public Sub Transition_ClearPreparedState(resetPlayer As Boolean)
	ClearPreparedState(resetPlayer)
End Sub

Public Sub Transition_ConsumePreparedQueueItem
	ConsumePreparedQueueItem
End Sub

Public Sub Transition_ActivateLoadedItem(args As Map)
	ActivateLoadedItem(args.GetDefault("audioKey", ""), args.Get("item"), args.GetDefault("fadeInMs", 0))
End Sub

Public Sub Transition_WaitForPreparedAudio(args As Map) As ResumableSub
	Dim audioKey As String = args.GetDefault("audioKey", "")
	Dim item As Map = args.Get("item")
	Dim timeoutMs As Int = args.GetDefault("timeoutMs", AUDIO_READY_TIMEOUT_MS)
	Dim result As Map
	result.Initialize
	Wait For (WaitForPreparedAudio(audioKey, item, timeoutMs)) Complete (prepared As Boolean)
	result.Put("Success", prepared)
	Return result
End Sub

Public Sub Transition_DescribeItem(item As Map) As String
	Return DescribeItem(item)
End Sub

Public Sub Transition_ItemsMatch(args As Map) As Boolean
	Return ItemsMatch(args.Get("first"), args.Get("second"))
End Sub

Public Sub PlaybackFacade_Trace(message As String)
	TraceLog(message)
End Sub

Private Sub AutoStartSavedPlayer As ResumableSub
	If playerCode = "" Then Return False
	If orchestrationState.IsStarted Or orchestrationState.IsStopping Then Return False
	If TryEnterStartupSequence = False Then Return False
	SetStopIcon
	ShowMessage(MessageValue("connecting"))
	UpdateConnectionIndicator("connecting")
	If USE_DATA_PLAYBACK_RESOLVER Then
		TraceLog("автостарт сначала обновление данных")
		Wait For (RefreshOfflineDataNow) Complete (refreshed As Boolean)
		If refreshed = False Then
			If dataPolicyState.LastOfflineDataRefreshState = "message" Then
				TraceLog("автостарт stop reason=server_message")
				FailStartupSequence("server_message")
				Return False
			End If
			If HasLocalPlaybackFallback Then
				SwitchToLocalPlayback(False, "startup_local")
				TraceLog("автостарт fallback reason=fresh_data_unavailable")
			Else
				TraceLog("автостарт ошибка reason=no_local_queue")
				HandleLocalTemporaryState("")
				FailStartupSequence("no_local_fallback")
				Return False
			End If
		Else
			UpdateConnectionIndicator("online")
			RequestSkipQueueSnapshotRestore("fresh_sync")
		End If
		If CanUseDataPlaybackResolver = False Then
			TraceLog("автостарт отмена reason=no_data")
			FailStartupSequence("resolver_unavailable")
			Return False
		End If
	End If
	ShowMessage(MessageValue("syncing"))
	If IsPlaybackAllowedByCurrentData = False Then
		PausePlaybackByPolicy(ResolvePlaybackBlockReason(stateStore.OfflineData), "server")
		FailStartupSequence("playback_not_allowed")
		Return False
	End If
	orchestrationState.EnterStartedState
	dataPolicyState.ClearPolicyPause
	SetStopIcon
	HideContentBlocks
	TraceLog("автостарт воспроизведение начало")
	Wait For (StartFirstTrack("auto")) Complete (unused As Boolean)
	CompleteStartupSequence
	Return True
End Sub

Private Sub ShowSetupScreen(text As String)
	appScreenMode = "setup"
	ClearPlaybackState
	HidePin
	orchestrationState.EnterUserStoppedState
	SetPlayIcon
	uiController.SetStatusText("")
	uiController.RenderPlayerHead("", "")
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
	If orchestrationState.IsStarted = False And dataPolicyState.IsPlaybackPausedByPolicy = False And isStartupSequenceInProgress = False Then ApplyStoppedState
	If refreshInfo = False Then Return
	RefreshPlayerHeaderFromCurrentData
End Sub

Private Sub ConfigureSetupScreen(mode As String, text As String)
	uiController.ConfigureSetupScreen(mode, FormatPlayerCodeForDisplay(playerCode), text, MessageValue("setup_title"), MessageValue("settings_thanks"), MessageValue("setup_submit"), MessageValue("logout"))
End Sub

Private Sub ConfigurePlayerHeader
	uiController.ConfigurePlayerHeader
End Sub

Private Sub UpdateVisibleMode
	uiController.UpdateVisibleMode(appScreenMode)
End Sub

Private Sub PlayButtonPane_Click
	If playerCode = "" Then
		ShowSetupScreen(MessageValue("player_required"))
		Return
	End If
	If orchestrationState.IsStarted = False And IsPolicyPauseState = False And IsUserStoppedState Then
		If orchestrationState.IsStopping Then
			TraceLog("возобновление запрет reason=manual_start state=stopping")
			Return
		End If
		If IsPlaybackAllowedByCurrentData = False Then
			PausePlaybackByPolicy(ResolvePlaybackBlockReason(stateStore.OfflineData), "server")
			Return
		End If
		TraceLog("возобновление итог mode=manual_start")
		orchestrationState.EnterStartedState
		dataPolicyState.ClearPolicyPause
		SetStopIcon
		HideContentBlocks
		Wait For (StartFirstTrack("manual")) Complete (unused As Boolean)
		Return
	End If
	If CanStopPlaybackNow(True) = False Then Return
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
	AutoStartSavedPlayer
	Return True
End Sub

Private Sub LogoutPlayer As ResumableSub
	SaveValue("player_code", "")
	playerCode = ""
	Wait For (StopPlayer) Complete (unused As Boolean)
	uiController.SetStatusText("")
	ShowSetupScreen("")
	Return True
End Sub

Private Sub RefreshPlayerHeaderFromCurrentData
	Dim safeCode As String = playerCode
	Dim title As String = ""
	Dim offlineData As Map = stateStore.OfflineData
	If offlineData.IsInitialized Then
		Dim playerData As Map = offlineData.GetDefault("player", Null)
		If playerData.IsInitialized Then
			safeCode = playerData.GetDefault("code", safeCode)
			title = playerData.GetDefault("title", "")
		End If
	End If
	RenderPlayerHead(safeCode, title)
End Sub

Private Sub GetAudioByKey(audioKey As String) As AudioPlayer
	If audioKey = "secondary" Then Return audioSecondary
	Return audioPrimary
End Sub

Private Sub GetInactiveAudioKey As String
	Return transitionCoordinator.GetInactiveAudioKey(runtimeState)
End Sub

Private Sub ClearPreparedState(resetPlayer As Boolean)
	Dim preparedAudioKey As String = Transition_GetDirectorPreparedAudioKey
	If preparedAudioKey <> "" And resetPlayer Then
		GetAudioByKey(preparedAudioKey).Reset
	End If
	If directorState.IsInitialized And preparedAudioKey <> "" Then directorState.ClearSlotByAudioKey(preparedAudioKey)
	If directorState.IsInitialized Then
		directorState.ClearRole("pending_prepare_music")
		directorState.ClearRole("pending_interrupt")
		directorState.ClearRole("pending_prepare")
		MirrorRuntimeStateFromDirector
	Else
		runtimeState.PreparedAudioKey = ""
		runtimeState.PreparedItem.Initialize
		runtimeState.ClearPendingPrepareState
	End If
End Sub

Private Sub ClearPendingPlayState
	If directorState.IsInitialized Then
		Dim pendingPlaySlot As PlaybackPlayerSlot = directorState.GetPendingPlaySlot
		If pendingPlaySlot.IsInitialized And pendingPlaySlot.AudioKey <> "" Then directorState.ClearSlotByAudioKey(pendingPlaySlot.AudioKey)
		directorState.ClearRole("pending_play")
		MirrorRuntimeStateFromDirector
	Else
		runtimeState.ClearPendingPlayState
	End If
End Sub

Private Sub SyncPlaybackDirectorState
' Compatibility-only bridge for legacy fallback paths. Normal playback should write director first.
	directorState.ApplyLegacyRuntime(runtimeState)
	directorState.SetFlowState(playbackFlowState)
End Sub

' Compatibility mirror: поддерживает старые helper-ветки и trace, пока они не убраны полностью.
Private Sub MirrorRuntimeStateFromDirector
	runtimeState.ActiveAudioKey = ""
	runtimeState.PreparedAudioKey = ""
	runtimeState.PendingPlayAudioKey = ""
	runtimeState.PendingPrepareAudioKey = ""
	runtimeState.ActiveItem.Initialize
	runtimeState.PreparedItem.Initialize
	runtimeState.PendingPlayItem.Initialize
	runtimeState.PendingPrepareItem.Initialize
	Dim activeSlot As PlaybackPlayerSlot = directorState.GetActiveSlot
	If activeSlot.IsInitialized And activeSlot.HasItem Then
		runtimeState.ActiveAudioKey = activeSlot.AudioKey
		runtimeState.ActiveItem = CloneMap(activeSlot.Item)
	End If
	Dim preparedSlot As PlaybackPlayerSlot = directorState.GetPreparedSlot
	If preparedSlot.IsInitialized And preparedSlot.HasItem Then
		runtimeState.PreparedAudioKey = preparedSlot.AudioKey
		runtimeState.PreparedItem = CloneMap(preparedSlot.Item)
	End If
	Dim pendingPlaySlot As PlaybackPlayerSlot = directorState.GetPendingPlaySlot
	If pendingPlaySlot.IsInitialized And pendingPlaySlot.HasItem Then
		runtimeState.PendingPlayAudioKey = pendingPlaySlot.AudioKey
		runtimeState.PendingPlayItem = CloneMap(pendingPlaySlot.Item)
	End If
	Dim pendingPrepareSlot As PlaybackPlayerSlot = directorState.GetPendingPrepareSlot
	If pendingPrepareSlot.IsInitialized And pendingPrepareSlot.HasItem Then
		runtimeState.PendingPrepareAudioKey = pendingPrepareSlot.AudioKey
		runtimeState.PendingPrepareItem = CloneMap(pendingPrepareSlot.Item)
	End If
End Sub

Private Sub ResolvePlaybackTickDecision As Map
	Dim result As Map
	result.Initialize
	result.Put("action", "")
	result.Put("remainMs", EffectiveTrackRemainMs)
	If Transition_GetDirectorActiveAudioKey = "" Then Return result
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Or IsPlaybackFlowActive = False Then Return result
	If ShouldTriggerBreakNow Then
		result.Put("action", "trigger_break")
		Return result
	End If
	Dim remain As Long = result.GetDefault("remainMs", 0)
	If CanCrossfadePreparedItem And remain > 0 And remain <= TRACK_OVERLAP_MS Then
		result.Put("action", "crossfade_prepared_track")
		Return result
	End If
	If CanStartPreparedOnTrackTail And remain > 0 And remain <= AD_TAIL_OVERLAP_MS Then
		result.Put("action", "start_prepared_tail")
		Return result
	End If
	If remain > 0 And remain <= PREFETCH_SECONDS * 1000 And CanPrefetchNextNow(False) Then
		result.Put("action", "prefetch_next")
		Return result
	End If
	Return result
End Sub

Private Sub ExecutePlaybackTickDecision(decision As Map) As ResumableSub
	Dim actionName As String = decision.GetDefault("action", "")
	Dim remain As Long = decision.GetDefault("remainMs", 0)
	Select actionName
		Case "trigger_break"
			TraceInfo("playback", "вставлен break", "mode=exact")
			Wait For (FadeOutAndContinue) Complete (unusedBreak As Boolean)
			Return True
		Case "crossfade_prepared_track"
			Dim preparedSlot As PlaybackPlayerSlot = directorState.GetPreparedSlot
			Dim preparedItem As Map
			If preparedSlot.IsInitialized Then
				preparedItem = preparedSlot.Item
			Else
				preparedItem.Initialize
			End If
			TraceInfo("playback", "crossfade trigger", "remainMs=" & remain & " next=" & TraceTrackValue(preparedItem))
			orchestrationState.IsCrossfadeTriggered = True
			PromotePreparedPlayer(PreparedFadeInMs, PreparedFadeOutMs)
			Return True
		Case "start_prepared_tail"
			orchestrationState.IsCrossfadeTriggered = True
			TraceInfo("playback", "вставлена реклама", "queue=" & playQueue.Size)
			PromotePreparedPlayer(PreparedFadeInMs, PreparedFadeOutMs)
			Return True
		Case "prefetch_next"
			orchestrationState.PrefetchDone = True
			Wait For (PrefetchNext) Complete (prefetchOk As Boolean)
			If prefetchOk = False Then orchestrationState.PrefetchDone = False
			Return prefetchOk
		Case Else
			Return False
	End Select
End Sub

Private Sub RunPlaybackDirectorTick(source As String) As ResumableSub
	If directorState.IsTickInProgress Then Return False
	If Transition_GetDirectorActiveAudioKey = "" Then Return False
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Or IsPlaybackFlowActive = False Then Return False
	directorState.IsTickInProgress = True
	RecoverStaleDirectorSlots
	Dim decision As Map = ResolvePlaybackTickDecision
	Dim actionName As String = decision.GetDefault("action", "")
	If actionName = "" Then
		directorState.IsTickInProgress = False
		Return False
	End If
	If directorState.TryBeginDecision(source & ":" & actionName) = False Then
		directorState.IsTickInProgress = False
		Return False
	End If
	Wait For (ExecutePlaybackTickDecision(decision)) Complete (executed As Boolean)
	directorState.ClearDecision
	directorState.IsTickInProgress = False
	Return executed
End Sub

' Единая точка входа для advance-сценариев из break / complete / error / watchdog.
Private Sub RunPlaybackDirectorAdvance(source As String, allowLoad As Boolean) As ResumableSub
	Dim ownsDecision As Boolean = False
	If directorState.CurrentDecision = "" Then
		If directorState.TryBeginDecision(source & ":advance") = False Then Return False
		ownsDecision = True
	End If
	Wait For (DispatchPlaybackAdvance(source, allowLoad)) Complete (advanced As Boolean)
	If ownsDecision Then directorState.ClearDecision
	Return advanced
End Sub

Private Sub ResolveDispatchDecision(allowLoad As Boolean) As Map
	Dim result As Map
	result.Initialize
	result.Put("action", "")
	If CanUsePreparedItemNow Then
		result.Put("action", "use_prepared")
		Return result
	End If
	If playQueue.Size > 0 Then
		result.Put("action", "play_queue_item")
		Return result
	End If
	If allowLoad Then
		result.Put("action", "populate_queue")
	End If
	Return result
End Sub

Private Sub ResetPlaybackWatchdogState
	lastPlaybackWatchdogPositionMs = -1
	lastPlaybackWatchdogTrackId = ""
	lastPlaybackWatchdogProgressAt = 0
	lastPlaybackWatchdogRecoveryAt = 0
	playbackActivationToken = 0
End Sub

Private Sub RecoverStaleDirectorSlots
	If directorState.IsInitialized = False Then Return
	Dim nowTicks As Long = DateTime.Now
	Dim changed As Boolean = False
	Dim pendingPlaySlot As PlaybackPlayerSlot = directorState.GetPendingPlaySlot
	If pendingPlaySlot.IsInitialized And pendingPlaySlot.HasItem Then
		If nowTicks - pendingPlaySlot.LastStateChangedAt > AUDIO_READY_TIMEOUT_MS Then
			TraceWarn("audio", "pending play timeout", "audio=" & pendingPlaySlot.AudioKey & " trackId=" & TraceTrackValue(pendingPlaySlot.Item))
			directorState.ClearRole("pending_play")
			changed = True
		End If
	End If
	Dim pendingPrepareSlot As PlaybackPlayerSlot = directorState.GetPendingPrepareSlot
	If pendingPrepareSlot.IsInitialized And pendingPrepareSlot.HasItem Then
		If nowTicks - pendingPrepareSlot.LastStateChangedAt > AUDIO_READY_TIMEOUT_MS Then
			TraceWarn("audio", "pending prepare timeout", "audio=" & pendingPrepareSlot.AudioKey & " trackId=" & TraceTrackValue(pendingPrepareSlot.Item))
			directorState.ClearRole(pendingPrepareSlot.Role)
			changed = True
		End If
	End If
	If changed Then MirrorRuntimeStateFromDirector
End Sub

Private Sub ActiveTrackIdForWatchdog As String
	If directorState.IsInitialized Then
		Dim activeSlot As PlaybackPlayerSlot = directorState.GetActiveSlot
		If activeSlot.IsInitialized And activeSlot.HasItem Then Return activeSlot.Item.GetDefault("id", "")
	End If
	Return ""
End Sub

Private Sub ActivePlaybackPositionMs As Long
	If directorState.IsInitialized Then
		Dim activeSlot As PlaybackPlayerSlot = directorState.GetActiveSlot
		If activeSlot.IsInitialized And activeSlot.AudioKey <> "" Then Return Max(-1, GetAudioByKey(activeSlot.AudioKey).Position)
	End If
	Return -1
End Sub

Private Sub HasObservableActivePlayback As Boolean
	If directorState.IsInitialized Then
		Dim activeSlot As PlaybackPlayerSlot = directorState.GetActiveSlot
		If activeSlot.IsInitialized = False Then Return False
		If activeSlot.HasItem = False Then Return False
		If activeSlot.AudioKey = "" Then Return False
		Return GetAudioByKey(activeSlot.AudioKey).IsPlaying
	End If
	Return False
End Sub

Private Sub ShouldWatchPlaybackProgress As Boolean
	If orchestrationState.IsStarted = False Then Return False
	If orchestrationState.IsStoppedByUser Then Return False
	If orchestrationState.IsStopping Then Return False
	If IsPolicyPauseState Then Return False
	If HasObservableActivePlayback Then Return True
	If lastPlaybackWatchdogProgressAt = 0 Then Return False
	Return IsPlaybackTransitionInProgress Or orchestrationState.IsPlaybackDispatchInProgress
End Sub

Private Sub MarkPlaybackWatchdogProgress(trackId As String, positionMs As Long)
	lastPlaybackWatchdogTrackId = trackId
	lastPlaybackWatchdogPositionMs = positionMs
	lastPlaybackWatchdogProgressAt = DateTime.Now
End Sub

Private Sub PlaybackWatchdogTimer_Tick
	If isPlaybackWatchdogTickInProgress Then Return
	isPlaybackWatchdogTickInProgress = True
	Wait For (RunPlaybackWatchdogTick) Complete (unused As Boolean)
	isPlaybackWatchdogTickInProgress = False
End Sub

Private Sub RunPlaybackWatchdogTick As ResumableSub
	If ShouldWatchPlaybackProgress = False Then
		ResetPlaybackWatchdogState
		Return False
	End If
	Dim nowTicks As Long = DateTime.Now
	Dim currentTrackId As String = ActiveTrackIdForWatchdog
	Dim currentPositionMs As Long = ActivePlaybackPositionMs
	Dim expectedActivationToken As Long = playbackActivationToken
	If HasObservableActivePlayback = False And lastPlaybackWatchdogProgressAt = 0 Then Return False
	If lastPlaybackWatchdogProgressAt = 0 Then
		MarkPlaybackWatchdogProgress(currentTrackId, currentPositionMs)
		Return True
	End If
	If currentTrackId <> "" And currentTrackId <> lastPlaybackWatchdogTrackId Then
		MarkPlaybackWatchdogProgress(currentTrackId, currentPositionMs)
		Return True
	End If
	If currentPositionMs >= 0 And currentPositionMs > lastPlaybackWatchdogPositionMs + PLAYBACK_WATCHDOG_PROGRESS_DELTA_MS Then
		MarkPlaybackWatchdogProgress(currentTrackId, currentPositionMs)
		Return True
	End If
	If nowTicks - lastPlaybackWatchdogRecoveryAt < PLAYBACK_WATCHDOG_GRACE_MS Then Return False
	If nowTicks - lastPlaybackWatchdogProgressAt < PLAYBACK_WATCHDOG_STALL_MS Then Return False
	Wait For (RecoverFromPlaybackStall(currentTrackId, currentPositionMs, expectedActivationToken)) Complete (recovered As Boolean)
	If recovered Then
		lastPlaybackWatchdogRecoveryAt = DateTime.Now
		MarkPlaybackWatchdogProgress(ActiveTrackIdForWatchdog, ActivePlaybackPositionMs)
	End If
	Return recovered
End Sub

Private Sub IsPlaybackStallAlreadyRecovered(expectedTrackId As String, expectedPositionMs As Long, expectedActivationToken As Long) As Boolean
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Or orchestrationState.IsStopping Or IsPolicyPauseState Then Return True
	If expectedActivationToken <> playbackActivationToken Then Return True
	If HasObservableActivePlayback = False Then Return False
	Dim currentTrackId As String = ActiveTrackIdForWatchdog
	Dim currentPositionMs As Long = ActivePlaybackPositionMs
	If currentTrackId <> "" And currentTrackId <> expectedTrackId Then Return True
	If currentPositionMs >= 0 And expectedPositionMs < 0 Then Return True
	If currentPositionMs >= 0 And currentPositionMs > expectedPositionMs + PLAYBACK_WATCHDOG_PROGRESS_DELTA_MS Then Return True
	Return False
End Sub

Private Sub RecoverFromPlaybackStall(trackId As String, positionMs As Long, expectedActivationToken As Long) As ResumableSub
	Dim nowTicks As Long = DateTime.Now
	If nowTicks - lastPlaybackWatchdogRecoveryAt < PLAYBACK_WATCHDOG_RECOVERY_COOLDOWN_MS Then Return False
	If IsPlaybackStallAlreadyRecovered(trackId, positionMs, expectedActivationToken) Then Return False
	lastPlaybackWatchdogRecoveryAt = nowTicks
	TraceWarn("playback", "watchdog stall", "trackId=" & trackId & " posMs=" & positionMs & " stage=" & playbackFlowState & " queue=" & playQueue.Size)
	Dim activeAudioKey As String = Transition_GetDirectorActiveAudioKey
	Dim preparedAudioKey As String = Transition_GetDirectorPreparedAudioKey
	If activeAudioKey <> "" Then GetAudioByKey(activeAudioKey).Reset
	If preparedAudioKey <> "" And preparedAudioKey <> activeAudioKey Then
		GetAudioByKey(preparedAudioKey).Reset
	End If
	If directorState.IsInitialized Then
		directorState.Reset
		directorState.ConfigureDefaultSlots
		MirrorRuntimeStateFromDirector
	Else
		runtimeState.ActiveAudioKey = ""
		runtimeState.ActiveItem.Initialize
	End If
	metaState.Reset
	ClearPendingPlayState
	ClearPreparedState(False)
	orchestrationState.ClearTrackTransitionFlags
	orchestrationState.EndDispatch
	stateStore.ClearDispatchRetryAfter
	ClearRetryTimer
	ClearExactBreakState
	ClearHistoryLogTimer
	If playbackFlowState <> FLOW_STOPPING And playbackFlowState <> FLOW_PAUSED_POLICY Then
		SetPlaybackFlowState(FLOW_IDLE, "watchdog_stall")
	End If
	If playQueue.Size = 0 Then
		Wait For (PopulatePlaybackQueue) Complete (queuePrepared As Boolean)
		If IsPlaybackStallAlreadyRecovered(trackId, positionMs, expectedActivationToken) Then Return True
		If queuePrepared = False And playQueue.Size = 0 Then
			TraceWarn("playback", "watchdog recovery", "step=populate_failed")
		End If
	End If
	Wait For (RunPlaybackDirectorAdvance("watchdog_stall", True)) Complete (dispatched As Boolean)
	If IsPlaybackStallAlreadyRecovered(trackId, positionMs, expectedActivationToken) Then Return True
	If dispatched Then
		TraceInfo("playback", "watchdog recovery", "result=dispatch queue=" & playQueue.Size)
		Return True
	End If
	Wait For (LoadNextAndPlay) Complete (advanced As Boolean)
	If IsPlaybackStallAlreadyRecovered(trackId, positionMs, expectedActivationToken) Then Return True
	TraceInfo("playback", "watchdog recovery", "result=" & IIf(advanced, "restart", "failed") & " queue=" & playQueue.Size)
	Return advanced
End Sub

Private Sub SetPlaybackFlowState(newState As String, reason As String)
	If newState = "" Then newState = FLOW_IDLE
	If playbackFlowState = newState Then Return
	TraceLog("flow переход from=" & playbackFlowState & " to=" & newState & " reason=" & reason)
	playbackFlowState = newState
	If directorState.IsInitialized Then directorState.SetFlowState(newState)
End Sub

Private Sub IsPlaybackTransitionInProgress As Boolean
	If directorState.IsInitialized Then Return directorState.IsTransitionInProgress
	Return playbackFlowState = FLOW_STARTING Or playbackFlowState = FLOW_TRANSITIONING Or playbackFlowState = FLOW_STOPPING
End Sub

Private Sub IsPlaybackFlowActive As Boolean
	If directorState.IsInitialized Then Return directorState.IsFlowActive
	Return playbackFlowState = FLOW_PLAYING Or playbackFlowState = FLOW_PREPARING Or playbackFlowState = FLOW_TRANSITIONING Or playbackFlowState = FLOW_STARTING
End Sub

Private Sub HasUsablePreparedItem As Boolean
	If directorState.IsInitialized Then Return directorState.HasPreparedSlot
	Return transitionCoordinator.HasUsablePreparedItem(runtimeState)
End Sub

Private Sub CanAdvancePlaybackNow(initiator As String, logDecision As Boolean) As Boolean
	If orchestrationState.IsStoppedByUser Then
		If logDecision Then TraceLog("guard переход запрет initiator=" & initiator & " reason=stopped_by_user")
		Return False
	End If
	If orchestrationState.IsStopping Then
		If logDecision Then TraceLog("guard переход запрет initiator=" & initiator & " reason=stopping")
		Return False
	End If
	If directorState.IsInitialized Then
		If directorState.FlowState = FLOW_STOPPING Then
			If logDecision Then TraceLog("guard переход запрет initiator=" & initiator & " reason=flow_stopping")
			Return False
		End If
		If directorState.FlowState = FLOW_PAUSED_POLICY Then
			If logDecision Then TraceLog("guard переход запрет initiator=" & initiator & " reason=flow_paused_policy")
			Return False
		End If
	End If
	If playbackFlowState = FLOW_STOPPING Then
		If logDecision Then TraceLog("guard переход запрет initiator=" & initiator & " reason=flow_stopping")
		Return False
	End If
	If playbackFlowState = FLOW_PAUSED_POLICY Then
		If logDecision Then TraceLog("guard переход запрет initiator=" & initiator & " reason=flow_paused_policy")
		Return False
	End If
	Return True
End Sub

Private Sub IsUserStoppedState As Boolean
	Return orchestrationState.IsStoppedByUser
End Sub

Private Sub IsPolicyPauseState As Boolean
	If directorState.IsInitialized Then Return dataPolicyState.IsPlaybackPausedByPolicy Or directorState.FlowState = FLOW_PAUSED_POLICY
	Return dataPolicyState.IsPlaybackPausedByPolicy Or playbackFlowState = FLOW_PAUSED_POLICY
End Sub

Private Sub CanStopPlaybackNow(logDecision As Boolean) As Boolean
	If orchestrationState.IsStopping Then
		If logDecision Then TraceLog("stop skip reason=already_stopping")
		Return False
	End If
	Return True
End Sub

Private Sub CanResumePlaybackNow(reason As String, logDecision As Boolean) As Boolean
	If IsUserStoppedState Then
		If logDecision Then TraceLog("возобновление запрет reason=" & reason & " state=user_stopped")
		Return False
	End If
	If orchestrationState.IsStopping Then
		If logDecision Then TraceLog("возобновление запрет reason=" & reason & " state=stopping")
		Return False
	End If
	If IsPolicyPauseState Then
		If logDecision Then TraceLog("возобновление запрет reason=" & reason & " state=policy_pause")
		Return False
	End If
	If orchestrationState.IsStarted = False Then
		If logDecision Then TraceLog("возобновление запрет reason=" & reason & " state=not_started")
		Return False
	End If
	Return True
End Sub

Private Sub ShouldResumeWithNewStart As Boolean
	Return orchestrationState.IsStarted And IsUserStoppedState = False And IsPolicyPauseState = False And orchestrationState.IsStopping = False
End Sub

Private Sub EnterPolicyPauseState(reason As String, connectionMode As String)
	TraceLog("policy pause reason=" & reason & " mode=" & connectionMode)
	SetPlaybackFlowState(FLOW_PAUSED_POLICY, "policy_pause")
	dataPolicyState.EnterPolicyPause(connectionMode)
	orchestrationState.EnterPolicyPausedState
	RefreshConnectionIndicatorState
	ClearPlaybackState
	HidePin
	SetStopIcon
	ShowMessage(reason)
End Sub

Private Sub EnterAudioOutputRecoveryPause(message As String)
	Dim safeMessage As String = message
	If safeMessage = "" Then safeMessage = MessageValue("audio_device_check")
	TraceWarn("audio", "output pause", "message=" & safeMessage & " errors=" & consecutiveAudioOutputErrors)
	isAudioOutputRecoveryPause = True
	EnterPolicyPauseState(safeMessage, "audio")
	ScheduleRetry("audio_device", AUDIO_OUTPUT_RETRY_DELAY_MS)
End Sub

Private Sub ProbeAudioOutputRecovery As ResumableSub
	If isAudioOutputRecoveryPause = False Then Return False
	TraceInfo("audio", "output probe", "queue=" & playQueue.Size)
	dataPolicyState.ClearPolicyPause
	orchestrationState.EnterStartedState
	SetStopIcon
	HideContentBlocks
	SetPlaybackFlowState(FLOW_IDLE, "audio_output_probe")
	Dim recovered As Boolean = False
	If playQueue.Size = 0 Then
		Wait For (PopulatePlaybackQueue) Complete (queuePrepared As Boolean)
		If queuePrepared = False And playQueue.Size = 0 Then
			EnterPolicyPauseState(MessageValue("audio_device_check"), "audio")
			isAudioOutputRecoveryPause = True
			Return False
		End If
	End If
	Wait For (RunPlaybackDirectorAdvance("audio_output_probe", True)) Complete (advanced As Boolean)
	recovered = advanced
	If recovered = False Then
		Wait For (StartFirstTrack("audio_output_probe")) Complete (started As Boolean)
		recovered = started
	End If
	If recovered Then
		TraceInfo("audio", "output probe recovered", "")
		ResetAudioOutputErrorState
		RefreshConnectionIndicatorState
		Return True
	End If
	EnterPolicyPauseState(MessageValue("audio_device_check"), "audio")
	isAudioOutputRecoveryPause = True
	Return False
End Sub

Private Sub CanPrepareNextPlayableNow(logDecision As Boolean) As Boolean
	If orchestrationState.IsStarted = False Then
		If logDecision Then TraceLog("guard подготовка запрет reason=not_started")
		Return False
	End If
	Return CanAdvancePlaybackNow("prepare_next", logDecision)
End Sub

Private Sub CanPrefetchNextNow(logDecision As Boolean) As Boolean
	If orchestrationState.PrefetchDone Then
		If logDecision Then TraceLog("guard prefetch запрет reason=already_done")
		Return False
	End If
	If ShouldBlockMusicTransitionForExactBreak Then
		If logDecision Then TraceLog("guard prefetch запрет reason=exact_break_pending")
		Return False
	End If
	Return CanPrepareNextPlayableNow(logDecision)
End Sub

Private Sub CanUsePreparedItemNow As Boolean
	If ShouldTriggerBreakNow Then Return False
	Return HasUsablePreparedItem And CanAdvancePlaybackNow("prepared_item", False)
End Sub

Private Sub HasPreparedSlotForTrace As String
	If directorState.IsInitialized Then Return IIf(directorState.HasPreparedSlot, "true", "false")
	Return "false"
End Sub

Private Sub ShouldBlockMusicTransitionForExactBreak As Boolean
	If metaState.CurrentMediaType <> "track" Then Return False
	Return HasPendingExactBreak
End Sub

Private Sub TryEnterPlaybackDispatch(initiator As String) As Boolean
	If orchestrationState.BeginDispatch(initiator) = False Then
		TraceLog("переход dispatch skip reason=reentry initiator=" & initiator & " active=" & orchestrationState.ActiveDispatchInitiator & " stage=" & playbackFlowState)
		Return False
	End If
	TraceLog("переход dispatch начало initiator=" & initiator & " prepared=" & HasPreparedSlotForTrace & " queue=" & playQueue.Size)
	Return True
End Sub

Private Sub ExitPlaybackDispatch(result As Boolean) As Boolean
	TraceLog("переход dispatch итог initiator=" & orchestrationState.ActiveDispatchInitiator & " result=" & result & " stage=" & playbackFlowState & " queue=" & playQueue.Size)
	orchestrationState.EndDispatch
	Return result
End Sub

Private Sub ItemsMatch(firstItem As Map, secondItem As Map) As Boolean
	If firstItem.IsInitialized = False Or secondItem.IsInitialized = False Then Return False
	If firstItem.GetDefault("type", "") <> secondItem.GetDefault("type", "") Then Return False
	If firstItem.GetDefault("id", "") <> "" And firstItem.GetDefault("id", "") = secondItem.GetDefault("id", "") Then Return True
	Return False
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
	Dim preparedItem As Map = Transition_GetDirectorPreparedItem
	If playQueue.Size = 0 Or preparedItem.IsInitialized = False Then Return
	For i = 0 To playQueue.Size - 1
		Dim queuedObject As Object = playQueue.Get(i)
		If queuedObject Is Map Then
			Dim queuedItem As Map = queuedObject
			If ItemsMatch(queuedItem, preparedItem) Then
				playQueue.RemoveAt(i)
				Exit
			End If
		End If
	Next
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
	playbackActivationToken = playbackActivationToken + 1
	ResetAudioOutputErrorState
	If directorState.IsInitialized Then
		directorState.SetActive(audioKey, item)
		directorState.ClearRole("prepared_music")
		directorState.ClearRole("prepared_interrupt")
		directorState.ClearRole("prepared")
		directorState.ClearRole("pending_play")
		MirrorRuntimeStateFromDirector
	Else
		runtimeState.SetActive(audioKey, item)
	End If
	SetPlaybackFlowState(FLOW_PLAYING, "activate_loaded_item")
	metaState.SetCurrentMedia(ResolvePlaybackMediaUrl(audioKey, item), item.GetDefault("type", ""))
	orchestrationState.ClearTrackTransitionFlags
	UpdatePlaybackMeta(item)
	mediaCacheService.TouchCachedItem(item)
	Dim plannedEndDetails As String = BuildPlannedEndTraceDetails(audioKey, item)
	TraceLog("воспроизведение activate audio=" & audioKey & " item=" & DescribeItem(item) & " fadeInMs=" & fadeInMs & IIf(plannedEndDetails <> "", " " & plannedEndDetails, ""))
	TraceInfo("audio", "плеер play", BuildAudioTraceDetails(item, "player=" & TracePlayerNumber(audioKey) & " type=" & TraceItemType(item) & " id=" & TraceTrackValue(item) & IIf(plannedEndDetails <> "", " " & plannedEndDetails, "")))
	GetAudioByKey(audioKey).PlayWithFade(fadeInMs)
	MarkPlaybackWatchdogProgress(item.GetDefault("id", ""), 0)
	ScheduleTrackCacheWarmup
	ScheduleHistoryLog(item)
	ResetRetryDelay
	orchestrationState.ClearTrackTransitionFlags
	If isStartupSequenceInProgress Then
		RequestDeferredPostStartTasks
	Else If metaState.CurrentMediaType = "track" And playQueue.Size = 0 Then
		BackfillPlaybackQueueAsync
	End If
End Sub

Private Sub BackfillPlaybackQueueAsync
	If isStartupSequenceInProgress Then
		RequestDeferredPostStartTasks
		TraceLog("отложенный старт skip initiator=BackfillPlaybackQueueAsync reason=startup_in_progress")
		Return
	End If
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Or orchestrationState.IsStopping Then Return
	If metaState.CurrentMediaType <> "track" Then Return
	If playQueue.Size >= LOOKAHEAD_QUEUE_TARGET_ITEMS Then Return
	If USE_DATA_PLAYBACK_RESOLVER = False Then Return
	If orchestrationState.BeginQueueBackfill = False Then Return
	TraceLog("очередь добор начало current=" & playQueue.Size & " target=" & LOOKAHEAD_QUEUE_TARGET_ITEMS)
	Wait For (stateStore.TryEnsureQueueLookahead(playQueue, LOOKAHEAD_QUEUE_TARGET_ITEMS)) Complete (queuePrepared As Boolean)
	orchestrationState.EndQueueBackfill
	If queuePrepared And playQueue.Size > 0 Then
		TraceLog("очередь добор итог success=true queue=" & playQueue.Size)
		ScheduleTrackCacheWarmup
	Else
		TraceLog("очередь добор итог success=false queue=" & playQueue.Size)
	End If
End Sub

Private Sub StartPlaybackWithAudioKey(audioKey As String, item As Map, fadeInMs As Int) As ResumableSub
	ClearPendingPlayState
	If directorState.IsInitialized Then
		directorState.SetPendingPlay(audioKey, item)
		MirrorRuntimeStateFromDirector
	Else
		runtimeState.SetPendingPlay(audioKey, item, fadeInMs)
	End If
	runtimeState.PendingPlayFadeInMs = fadeInMs
	SetPlaybackFlowState(FLOW_STARTING, "start_playback:" & item.GetDefault("type", ""))
	Dim itemUrl As String = ResolvePlaybackMediaUrl(audioKey, item)
	If itemUrl = "" Then
		TraceError("playback", "не удалось запустить трек", "reason=media_url trackId=" & TraceTrackValue(item))
		WriteHealthSnapshot("ошибка_playback")
		Return False
	End If
	TraceInfo("audio", "плеер load", BuildAudioTraceDetails(item, "player=" & TracePlayerNumber(audioKey) & " type=" & TraceItemType(item) & " id=" & TraceTrackValue(item)))
	GetAudioByKey(audioKey).LoadUrl(itemUrl, CurrentVolume(item))
	Wait For (WaitForPlaybackActivation(audioKey, item, AUDIO_READY_TIMEOUT_MS)) Complete (playbackStarted As Boolean)
	If playbackStarted Then
		TraceInfo("playback", "старт трека", "trackId=" & TraceTrackValue(item) & " source=" & mediaCacheService.ResolveMediaSource(item) & " queue=" & playQueue.Size)
		WriteHealthSnapshot("старт_трека")
	Else
		TraceError("audio", "не удалось запустить трек", "trackId=" & TraceTrackValue(item))
		WriteHealthSnapshot("ошибка_audio")
	End If
	Return playbackStarted
End Sub

' Ожидает подтверждения старта по director active slot, а не по одному факту вызова LoadUrl/Play.
Private Sub WaitForPlaybackActivation(audioKey As String, item As Map, timeoutMs As Int) As ResumableSub
	Dim startedAt As Long = DateTime.Now
	Do While DateTime.Now - startedAt < timeoutMs
		Dim directorActiveAudioKey As String = Transition_GetDirectorActiveAudioKey
		Dim directorActiveItem As Map = Transition_GetDirectorActiveItem
		If directorActiveAudioKey = audioKey And ItemsMatch(directorActiveItem, item) Then Return True
		If runtimeState.PendingPlayAudioKey = "" Then
			Return directorActiveAudioKey = audioKey And ItemsMatch(directorActiveItem, item)
		End If
		Sleep(25)
	Loop
	TraceWarn("audio", "таймаут старта трека", "audio=" & audioKey & " trackId=" & TraceTrackValue(item) & " pendingPlayAudio=" & runtimeState.PendingPlayAudioKey & " activeAudio=" & runtimeState.ActiveAudioKey & " directorActiveAudio=" & Transition_GetDirectorActiveAudioKey)
	Return False
End Sub

' Ожидает, что preload действительно превратится в prepared slot; timeout здесь нужен для recovery, а не для happy path.
Private Sub WaitForPreparedAudio(audioKey As String, item As Map, timeoutMs As Int) As ResumableSub
	Dim startedAt As Long = DateTime.Now
	Do While DateTime.Now - startedAt < timeoutMs
		Dim directorPreparedAudioKey As String = Transition_GetDirectorPreparedAudioKey
		Dim directorPreparedItem As Map = Transition_GetDirectorPreparedItem
		If directorPreparedAudioKey = audioKey And ItemsMatch(directorPreparedItem, item) Then Return True
		If runtimeState.PendingPrepareAudioKey = "" Then
			Return directorPreparedAudioKey = audioKey And ItemsMatch(directorPreparedItem, item)
		End If
		Sleep(25)
	Loop
	TraceWarn("audio", "таймаут preload", "audio=" & audioKey & " trackId=" & TraceTrackValue(item) & " pendingPrepareAudio=" & runtimeState.PendingPrepareAudioKey & " preparedAudio=" & runtimeState.PreparedAudioKey & " directorPreparedAudio=" & Transition_GetDirectorPreparedAudioKey)
	Return False
End Sub

Private Sub PrepareNextPlayable As ResumableSub
	Wait For (facade.PrepareNextPlayable) Complete (prepared As Boolean)
	Return prepared
End Sub

Public Sub Transition_GetPlaybackFlowState As String
	If directorState.IsInitialized Then Return directorState.FlowState
	Return playbackFlowState
End Sub

Public Sub Transition_GetDirectorPreparedItem As Map
	If directorState.IsInitialized Then
		Dim preparedSlot As PlaybackPlayerSlot = directorState.GetPreparedSlot
		If preparedSlot.IsInitialized And preparedSlot.HasItem Then Return CloneMap(preparedSlot.Item)
	End If
	Return CloneMap(runtimeState.PreparedItem)
End Sub

Public Sub Transition_GetDirectorPreparedAudioKey As String
	If directorState.IsInitialized Then
		Dim preparedSlot As PlaybackPlayerSlot = directorState.GetPreparedSlot
		If preparedSlot.IsInitialized Then Return preparedSlot.AudioKey
	End If
	Return runtimeState.PreparedAudioKey
End Sub

Public Sub Transition_GetDirectorActiveItem As Map
	If directorState.IsInitialized Then
		Dim activeSlot As PlaybackPlayerSlot = directorState.GetActiveSlot
		If activeSlot.IsInitialized And activeSlot.HasItem Then Return CloneMap(activeSlot.Item)
	End If
	Return CloneMap(runtimeState.ActiveItem)
End Sub

Public Sub Transition_GetDirectorActiveAudioKey As String
	If directorState.IsInitialized Then
		Dim activeSlot As PlaybackPlayerSlot = directorState.GetActiveSlot
		If activeSlot.IsInitialized Then Return activeSlot.AudioKey
	End If
	Return runtimeState.ActiveAudioKey
End Sub

Public Sub Transition_GetDirectorPendingPlayItem(audioKey As String) As Map
	Dim emptyItem As Map
	emptyItem.Initialize
	If directorState.IsInitialized Then
		Dim pendingPlaySlot As PlaybackPlayerSlot = directorState.GetSlotByAudioKey(audioKey)
		If pendingPlaySlot.IsInitialized And pendingPlaySlot.Role = "pending_play" And pendingPlaySlot.HasItem Then Return CloneMap(pendingPlaySlot.Item)
	End If
	If runtimeState.PendingPlayAudioKey = audioKey And runtimeState.PendingPlayItem.IsInitialized And runtimeState.PendingPlayItem.Size > 0 Then
		Return CloneMap(runtimeState.PendingPlayItem)
	End If
	Return emptyItem
End Sub

Public Sub Transition_GetDirectorPendingPrepareItem(audioKey As String) As Map
	Dim emptyItem As Map
	emptyItem.Initialize
	If directorState.IsInitialized Then
		Dim pendingPrepareSlot As PlaybackPlayerSlot = directorState.GetSlotByAudioKey(audioKey)
		If pendingPrepareSlot.IsInitialized And pendingPrepareSlot.State = "loading" And pendingPrepareSlot.HasItem Then Return CloneMap(pendingPrepareSlot.Item)
	End If
	If runtimeState.PendingPrepareAudioKey = audioKey And runtimeState.PendingPrepareItem.IsInitialized And runtimeState.PendingPrepareItem.Size > 0 Then
		Return CloneMap(runtimeState.PendingPrepareItem)
	End If
	Return emptyItem
End Sub

Public Sub Transition_SetDirectorPendingPrepare(args As Map)
	If directorState.IsInitialized = False Then Return
	directorState.SetPendingPrepare(args.GetDefault("audioKey", ""), args.GetDefault("item", Null))
	MirrorRuntimeStateFromDirector
End Sub

Public Sub Facade_PrepareNextPlayableCore As ResumableSub
	If CanPrepareNextPlayableNow(True) = False Then Return False
	Wait For (transitionCoordinator.PrepareNextPlayable(playQueue, runtimeState, metaState, orchestrationState, mediaCacheService, playbackFlowState, FLOW_PLAYING, FLOW_IDLE, FLOW_PREPARING)) Complete (prepared As Boolean)
	Return prepared
End Sub

Private Sub CanCrossfadePreparedItem As Boolean
	If ShouldBlockMusicTransitionForExactBreak Then Return False
	Return transitionCoordinator.CanCrossfadePreparedItem(runtimeState, metaState, orchestrationState, IsPlaybackTransitionInProgress)
End Sub

Private Sub CanStartPreparedOnTrackTail As Boolean
	Return transitionCoordinator.CanStartPreparedOnTrackTail(runtimeState, metaState, orchestrationState, IsPlaybackTransitionInProgress)
End Sub

Private Sub PreparedFadeInMs As Int
	Return 0
End Sub

Private Sub PreparedFadeOutMs As Int
	Return transitionCoordinator.PreparedFadeOutMs(metaState, runtimeState, TRACK_OVERLAP_MS, AD_TAIL_OVERLAP_MS)
End Sub

Private Sub PromotePreparedPlayer(fadeInMs As Int, fadeOutMs As Int) As Boolean
	Return transitionCoordinator.PromotePreparedPlayer(runtimeState, dataResolver, storage, fadeInMs, fadeOutMs, FLOW_TRANSITIONING)
End Sub

Private Sub StartFirstTrack(mode As String) As ResumableSub
	Wait For (facade.StartFirstTrack(mode)) Complete (started As Boolean)
	Return started
End Sub

Public Sub Facade_StartFirstTrackCore(mode As String) As ResumableSub
	nextStartMode = mode
	SetPlaybackFlowState(FLOW_STARTING, "start_first_track:" & mode)
	If mode = "manual" And RestoreStoppedReserveQueue Then
	Else
		playQueue.Clear
	End If
	orchestrationState.ClearTrackTransitionFlags
	initialStartFadePending = True
	If playQueue.Size = 0 Then
		Wait For (TrySeedFirstTrackFromCache) Complete (seededFromCache As Boolean)
		If seededFromCache Then
			TraceInfo("playback", "первый трек выбран из кэша", "queue=" & playQueue.Size)
		End If
	End If
	If Transition_GetDirectorActiveAudioKey = "" And metaState.CurrentMediaType = "" Then ShowMessage(MessageValue("syncing"))
	Wait For (LoadNextAndPlay) Complete (unused As Boolean)
	Return True
End Sub

Private Sub RestoreStoppedReserveQueue As Boolean
	Return stateStore.RestoreStoppedReserveQueue(playQueue)
End Sub

Private Sub TrySeedFirstTrackFromCache As ResumableSub
	If USE_DATA_PLAYBACK_RESOLVER = False Then Return False
	Wait For (stateStore.TrySeedFirstTrackFromCache(playQueue)) Complete (seeded As Boolean)
	Return seeded
End Sub

Private Sub LoadNextAndPlay As ResumableSub
	Wait For (facade.LoadNextAndPlay) Complete (advanced As Boolean)
	Return advanced
End Sub

Public Sub Facade_LoadNextAndPlayCore As ResumableSub
	ClearRetryTimer
	If playbackFlowState = FLOW_STOPPING Then Return False
	Wait For (PopulatePlaybackQueue) Complete (queuePrepared As Boolean)
	If queuePrepared = False Then Return False
	Wait For (RunPlaybackDirectorAdvance("load_next_and_play:" & nextStartMode, False)) Complete (dispatched As Boolean)
	Return dispatched
End Sub

Private Sub PopulatePlaybackQueue As ResumableSub
	#If Release
	TraceInfo("playback", "populate queue start", "queue=" & playQueue.Size & " stage=" & playbackFlowState)
	#End If
	If IsPlaybackAllowedByCurrentData = False Then
		#If Release
		TraceWarn("playback", "populate queue fail", "reason=playback_blocked")
		#End If
		PausePlaybackByPolicy(ResolvePlaybackBlockReason(stateStore.OfflineData), "server")
		Return False
	End If
	If USE_DATA_PLAYBACK_RESOLVER Then
		PreScanUpcomingAdMinute(True)
		Wait For (stateStore.TryPopulateQueueFromLocalPlan(playQueue, 1)) Complete (localPlanResult As Map)
		If localPlanResult.GetDefault("success", False) = False Then
			Dim localPlanStatus As String = localPlanResult.GetDefault("status", "")
			#If Release
			TraceWarn("playback", "populate queue fail", "reason=" & localPlanStatus)
			#End If
			TraceLog("очередь запрос ошибка reason=" & localPlanStatus)
			If localPlanStatus = "resolver_unavailable" Then
				HandleTemporaryState("server", "")
				Return False
			End If
			Dim idleText As String = localPlanResult.GetDefault("idle_text", "")
			If idleText <> "" Then
				HandleTemporaryState("server", idleText)
				Return False
			End If
			HandleTemporaryState("offline", "Нужен интернет")
			Return False
		End If
		SyncExactBreakState
		#If Release
		TraceInfo("playback", "populate queue done", "queue=" & playQueue.Size)
		#End If
		Return True
	End If
	Wait For (FetchNext) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		#If Release
		TraceWarn("playback", "populate queue fail", "reason=fetch_failed")
		#End If
		Wait For (HandleFetchFailure(result)) Complete (unused As Boolean)
		Return False
	End If
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Then Return False
	ResetRetryDelay
	Dim queue As List = responseAdapter.NormalizeQueueResponse(result.Get("Data"))
	If queue.IsInitialized = False Or queue.Size = 0 Then
		#If Release
		TraceWarn("playback", "populate queue fail", "reason=empty_queue")
		#End If
		HandleTemporaryState("server", "")
		Return False
	End If
	playQueue = queue
	SyncExactBreakState
	#If Release
	TraceInfo("playback", "populate queue done", "queue=" & playQueue.Size)
	#End If
	Dim retryAfter As Int = responseAdapter.NormalizeRetryAfter(result.Get("Data"))
	stateStore.SetDispatchRetryAfter(retryAfter)
	Return True
End Sub

Private Sub DispatchPlaybackAdvance(initiator As String, allowLoad As Boolean) As ResumableSub
	Wait For (facade.DispatchPlaybackAdvance(initiator, allowLoad)) Complete (advanced As Boolean)
	Return advanced
End Sub

Public Sub Facade_DispatchPlaybackAdvanceCore(initiator As String, allowLoad As Boolean) As ResumableSub
	If TryEnterPlaybackDispatch(initiator) = False Then Return False
	TraceInfo("playback", "dispatch переход", "initiator=" & initiator & " queue=" & playQueue.Size & " prepared=" & HasPreparedSlotForTrace)
	Do While playbackFlowState <> FLOW_STOPPING
		Dim dispatchDecision As Map = ResolveDispatchDecision(allowLoad)
		Dim actionName As String = dispatchDecision.GetDefault("action", "")
		directorState.BeginDecision("dispatch:" & actionName)
		Select actionName
			Case "use_prepared"
				TraceInfo("playback", "dispatch prepared", "initiator=" & initiator)
				directorState.ClearDecision
				Return ExitPlaybackDispatch(PromotePreparedPlayer(0, 0))
			Case "play_queue_item"
				Dim nextObject As Object = ShiftQueueItem
				If nextObject Is Map Then
					Dim nextItem As Map = nextObject
					If nextItem.GetDefault("type", "") = "break" Then
						TraceInfo("playback", "dispatch break", "queue=" & playQueue.Size & " exact=" & nextItem.GetDefault("exactly", False))
					Else
						TraceInfo("playback", "dispatch next", "type=" & nextItem.GetDefault("type", "") & " id=" & nextItem.GetDefault("id", ""))
					End If
				End If
				Dim retryAfter As Int = stateStore.ConsumeDispatchRetryAfter
				Wait For (PlayQueueItem(nextObject, retryAfter)) Complete (continueQueue As Boolean)
				directorState.ClearDecision
				If continueQueue = False Then Return ExitPlaybackDispatch(True)
			Case "populate_queue"
				Wait For (PopulatePlaybackQueue) Complete (queuePrepared As Boolean)
				directorState.ClearDecision
				If queuePrepared = False Then Return ExitPlaybackDispatch(False)
			Case Else
				directorState.ClearDecision
				Return ExitPlaybackDispatch(True)
		End Select
	Loop
	Return ExitPlaybackDispatch(False)
End Sub

Private Sub PrefetchNext As ResumableSub
	TraceInfo("playback", "prefetch start", "queue=" & playQueue.Size & " current=" & TraceTrackValue(Transition_GetDirectorActiveItem))
	If playQueue.Size > 0 Then
		Wait For (PrepareNextPlayable) Complete (preparedOk As Boolean)
		TraceInfo("playback", IIf(preparedOk, "prefetch done", "prefetch fail"), "queue=" & playQueue.Size)
		Return preparedOk
	End If
	If USE_DATA_PLAYBACK_RESOLVER Then
		Wait For (stateStore.TryPopulateQueueFromLocalPlan(playQueue, 1)) Complete (localPlanResult As Map)
		If localPlanResult.GetDefault("success", False) And playQueue.Size > 0 Then
			Wait For (PrepareNextPlayable) Complete (preparedOk As Boolean)
			TraceInfo("playback", IIf(preparedOk, "prefetch done", "prefetch fail"), "queue=" & playQueue.Size)
			Return preparedOk
		End If
		TraceInfo("playback", "prefetch fail", "reason=" & localPlanResult.GetDefault("status", "queue_empty"))
		Return False
	End If
	If HasPendingExactBreak Then Return False
	Wait For (FetchNext) Complete (result As Map)
	If result.GetDefault("Success", False) = False Or orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Then Return False
	Dim queue As List = responseAdapter.NormalizeQueueResponse(result.Get("Data"))
	If queue.IsInitialized = False Or queue.Size = 0 Then Return False
	playQueue = queue
	SyncExactBreakState
	Wait For (PrepareNextPlayable) Complete (preparedOk As Boolean)
	TraceInfo("playback", IIf(preparedOk, "prefetch done", "prefetch fail"), "queue=" & playQueue.Size)
	Return preparedOk
End Sub

Private Sub FetchNext As ResumableSub
	Wait For (syncService.FetchNext(FETCH_TIMEOUT_MS, ResolveAppVersion, nextStartMode, playlistIndex)) Complete (result As Map)
	nextStartMode = ""
	Return result
End Sub

Private Sub FetchJsonWithTimeout(url As String, timeoutMs As Int) As ResumableSub
	Wait For (syncService.FetchJsonWithTimeout(url, timeoutMs)) Complete (result As Map)
	Return result
End Sub

Private Sub ApplyClientRequestHeaders(j As HttpJob)
	If j.IsInitialized = False Then Return
	j.GetRequest.SetHeader(CLIENT_HEADER_NAME, CLIENT_HEADER_VALUE)
End Sub

Private Sub LogHttpFailure(url As String, kind As String)
	syncService.LogHttpFailure(url, kind)
End Sub

Private Sub SubmitClaim As ResumableSub
	btnConfirmYes.Enabled = False
	btnConfirmNo.Enabled = False
	TraceLog("claim начало player=" & FormatPlayerCodeForDisplay(playerCode) & " device=" & deviceId)
	Wait For (syncService.SubmitClaim(FETCH_TIMEOUT_MS)) Complete (result As Map)
	If result.GetDefault("Success", False) Then
		Dim resultData As Object = result.Get("Data")
		If resultData Is Map Then
			Dim data As Map = resultData
			If data.GetDefault("ok", False) = True Then
				orchestrationState.EnterStartedState
				SetStopIcon
				HideContentBlocks
				TraceLog("claim итог success=true")
				Wait For (StartFirstTrack("manual")) Complete (unused As Boolean)
				btnConfirmYes.Enabled = True
				btnConfirmNo.Enabled = True
				Return True
			End If
		End If
	End If
	TraceLog("claim итог success=false message=" & ResolveErrorMessage(result, MessageValue("device_busy")))
	ShowClaimPrompt(ResolveErrorMessage(result, MessageValue("device_busy")))
	btnConfirmYes.Enabled = True
	btnConfirmNo.Enabled = True
	Return False
End Sub

Private Sub PlayQueueItem(current As Object, retryAfter As Int) As ResumableSub
	ClearHistoryLogTimer
	orchestrationState.IsCrossfadeTriggered = False
	If current Is Map Then
		Dim item As Map = current
		Dim itemType As String = item.GetDefault("type", "")
		
		If itemType = "message" Then
			HandleMessageItem(item)
			Return False
		End If
		If itemType = "update" Then
			ClearPlaybackState
			orchestrationState.EnterUserStoppedState
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
				Return True
			End If
			ClearExactBreakState
			MergeBreakItems(item)
			Return True
		End If
		
		If itemType <> "track" And itemType <> "ad" Then
			HandleTemporaryState("server", "")
			Return False
		End If
		
		Dim url As String = MediaUrl(item)
		If url = "" Then
			TraceWarn("cache", "нет локального файла", "trackId=" & TraceTrackValue(item))
			If HasLocalPlaybackFallback Then
				SwitchToLocalPlayback(stateStore.IsMediaPathDegraded, "missing_local_media")
			End If
			Return True
		End If
		
		If item.ContainsKey("playlist") Then playlistIndex = item.Get("playlist")
		dataResolver.CommitPlaylistCursor(storage, item)
		SaveQueueSnapshotState
		orchestrationState.PrefetchDone = False
		Dim fadeInMs As Int = ResolveStartFadeInMs
		Dim targetAudioKey As String = GetInactiveAudioKey
		If Transition_GetDirectorActiveAudioKey = "" Then targetAudioKey = "primary"
		Wait For (StartPlaybackWithAudioKey(targetAudioKey, item, fadeInMs)) Complete (playbackStarted As Boolean)
		If playbackStarted = False Then
			If orchestrationState.IsStoppedByUser = False And orchestrationState.IsStarted Then
				Wait For (HandleMediaError) Complete (unusedError As Boolean)
				If dataPolicyState.IsLocalPlaybackMode Then
					Return True
				End If
			End If
			Return False
		End If
		If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Then Return False
		Return False
	Else
		HandleTemporaryState("server", "")
		Return False
	End If
End Sub

Private Sub HandleMessageItem(item As Map)
	Dim action As String = item.GetDefault("action", "")
	TraceLog("сообщение handle action=" & action & " text=" & item.GetDefault("message", ""))
	If action = "claim" Then
		dataPolicyState.ClearPolicyPause
		ClearPlaybackState
		orchestrationState.EnterUserStoppedState
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
	TraceLog("брейк очередь add queue=" & playQueue.Size & " at=" & queueState.ScheduledBreakAt)
End Sub

Private Sub DeferFutureExactBreak(item As Map)
	Dim insertIndex As Int = Min(1, playQueue.Size)
	playQueue.InsertAt(insertIndex, item)
	SyncExactBreakState
	TraceLog("брейк exact defer at=" & ToLongDefault(item.GetDefault("at", -1), -1) & " queue=" & playQueue.Size)
End Sub

Private Sub ScanLocalAdsForTimestamp(targetMinuteTimestamp As Long, force As Boolean)
	Dim allowRegularAds As Boolean = AllowRegularAdsAtTargetMinute(targetMinuteTimestamp)
	If localAdScheduler.ScanTargetMinute(stateStore.OfflineData, playQueue, targetMinuteTimestamp, force, allowRegularAds) Then
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
			TraceLog("брейк очередь drop reason=no_cached_ads")
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
		TraceLog("реклама prescan начало target=" & FormatTimestampForTrace(targetTimestamp))
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

Private Sub BuildPlannedEndTraceDetails(audioKey As String, item As Map) As String
	Dim durationMs As Long = ResolvePlannedDurationMs(audioKey, item)
	If durationMs <= 0 Then Return ""
	Dim plannedEndTicks As Long = DateTime.Now + durationMs
	Return "durationMs=" & durationMs & " plannedEnd=" & FormatTicksTimeForTrace(plannedEndTicks)
End Sub

Private Sub ResolvePlannedDurationMs(audioKey As String, item As Map) As Long
	Dim audio As AudioPlayer = GetAudioByKey(audioKey)
	If audio.IsInitialized Then
		Dim audioDuration As Long = audio.Duration
		If audioDuration > 0 Then Return audioDuration
	End If
	Dim itemDuration As Long = ToLongDefault(item.GetDefault("duration", 0), 0)
	If itemDuration <= 0 Then Return 0
	If itemDuration < 1000 Then Return itemDuration * 1000
	Return itemDuration
End Sub

Private Sub FormatTicksTimeForTrace(targetTicks As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.DateFormat = "dd.MM.yyyy"
	DateTime.TimeFormat = "HH:mm:ss"
	Dim value As String = DateTime.Date(targetTicks) & " " & DateTime.Time(targetTicks)
	DateTime.DateFormat = previousDateFormat
	DateTime.TimeFormat = previousTimeFormat
	Return value
End Sub

Private Sub LocalTimestampToTicks(targetTimestamp As Long) As Long
	Return (targetTimestamp + (TimezoneOffsetMinutes * 60)) * 1000
End Sub

Private Sub HandleFetchFailure(result As Map) As ResumableSub
	Wait For (playerDataCoordinator.HandleFetchFailure(result)) Complete (handled As Boolean)
	Return handled
End Sub

Private Sub HandleTemporaryState(mode As String, text As String)
	playerDataCoordinator.HandleTemporaryState(mode, text)
End Sub

Private Sub HandleBlockedState
	playerDataCoordinator.HandleBlockedState
End Sub

Private Sub StopForMissingData(text As String)
	playerDataCoordinator.StopForMissingData(text)
End Sub

Private Sub HandleMediaError As ResumableSub
	Wait For (playerDataCoordinator.HandleMediaError) Complete (handled As Boolean)
	Return handled
End Sub

Private Sub SwitchToLocalPlayback(markDegraded As Boolean, reason As String)
	playerDataCoordinator.SwitchToLocalPlayback(markDegraded, reason)
End Sub

Private Sub HasLocalPlaybackFallback As Boolean
	Dim offlineData As Map = stateStore.OfflineData
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	Return playerDataCoordinator.HasPlayableLocalTrackInCurrentSlot(offlineData, EffectiveNowTicks)
End Sub

Private Sub HandleLocalTemporaryState(text As String)
	playerDataCoordinator.HandleLocalTemporaryState(text)
End Sub

Public Sub Data_ResolveIdleUntilMessage(data As Map, targetTicks As Long) As String
	Return playerDataCoordinator.ResolveIdleUntilMessage(data, targetTicks)
End Sub

Private Sub AllowRegularAdsAtTargetMinute(targetMinuteTimestamp As Long) As Boolean
	Return playerDataCoordinator.AllowRegularAdsAtTargetMinute(stateStore.OfflineData, targetMinuteTimestamp)
End Sub

Private Sub PausePlaybackByPolicy(reason As String, connectionMode As String)
	facade.PausePlayback(reason, connectionMode)
End Sub

Public Sub Facade_PausePlaybackCore(reason As String, connectionMode As String)
	playerDataCoordinator.PausePlaybackByPolicy(reason, connectionMode)
End Sub

Private Sub HandleShutdownMessage(text As String)
	playerDataCoordinator.HandleShutdownMessage(text)
End Sub

Private Sub IsPlaybackAllowedByCurrentData As Boolean
	Return playerDataCoordinator.IsPlaybackAllowed(stateStore.OfflineData, EffectiveNowTicks)
End Sub

Private Sub ResolvePlaybackBlockReason(data As Map) As String
	Return playerDataCoordinator.ResolvePlaybackBlockReason(data, EffectiveNowTicks)
End Sub

Private Sub ScheduleRetry(mode As String, delayMs As Int)
	playerDataCoordinator.ScheduleRetry(mode, delayMs, LOCAL_RETRY_DELAY_MAX, SERVER_RETRY_DELAY_MAX, BLOCKED_RETRY_DELAY)
End Sub

Private Sub RetryTimer_Tick
	retryTimer.Enabled = False
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Then Return
	If stateStore.GetLastRetryMode = "audio_device" Then
		Wait For (ProbeAudioOutputRecovery) Complete (recovered As Boolean)
		If recovered = False And orchestrationState.IsStarted And orchestrationState.IsStoppedByUser = False Then
			ScheduleRetry("audio_device", AUDIO_OUTPUT_RETRY_DELAY_MS)
		End If
		Return
	End If
	If dataPolicyState.IsPlaybackPausedByPolicy Then Return
	Wait For (LoadNextAndPlay) Complete (unused As Boolean)
End Sub

Private Sub ResetRetryDelay
	playerDataCoordinator.ResetRetryDelay(LOCAL_RETRY_DELAY_INITIAL, SERVER_RETRY_DELAY_INITIAL)
End Sub

Private Sub ResetAudioOutputErrorState
	consecutiveAudioOutputErrors = 0
	isAudioOutputRecoveryPause = False
End Sub

Private Sub ClearRetryTimer
	retryTimer.Enabled = False
	stateStore.ClearLastRetryMode
End Sub

Private Sub ResolveScheduledBreakAt
	queueState.ResolveScheduledBreakAt(playQueue)
	TraceLog("брейк exact sync value=" & queueState.ScheduledBreakAt & " queue=" & playQueue.Size)
End Sub

Private Sub SyncExactBreakState
	ResolveScheduledBreakAt
	ScheduleBreakWatch
End Sub

Private Sub ScheduleBreakWatch
	breakTimer.Enabled = False
	If HasPendingExactBreak = False Then Return
	Dim delay As Long = Max(1, ((queueState.ScheduledBreakAt - LocalNowTimestamp) * 1000) - 250)
	breakTimer.Interval = delay
	breakTimer.Enabled = True
End Sub

Private Sub BreakTimer_Tick
	breakTimer.Enabled = False
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Then Return
	If ShouldTriggerBreakNow = False Then Return
	TraceLog("брейк exact timer hit")
	Wait For (RunPlaybackDirectorTick("break_timer")) Complete (unused As Boolean)
End Sub

Private Sub ClearExactBreakState
	queueState.ClearExactBreakState
	breakTimer.Enabled = False
End Sub

Private Sub HasPendingExactBreak As Boolean
	Return queueState.HasPendingExactBreak(LocalNowTimestamp)
End Sub

Private Sub ShouldTriggerBreakNow As Boolean
	Return queueState.ShouldTriggerBreakNow(LocalNowTimestamp)
End Sub

Private Sub EffectiveTrackRemainMs As Long
	Dim trackRemain As Long = 0
	Dim activeAudioKey As String = Transition_GetDirectorActiveAudioKey
	If activeAudioKey <> "" Then
		Dim activeAudio As AudioPlayer = GetAudioByKey(activeAudioKey)
		If activeAudio.Duration > 0 Then trackRemain = activeAudio.Duration - activeAudio.Position
	End If
	Return queueState.LimitRemainByBreak(trackRemain, LocalNowTimestamp)
End Sub

Private Sub FadeOutAndContinue As ResumableSub
	If CanAdvancePlaybackNow("fade_out_and_continue", True) = False Then Return False
	If IsPlaybackTransitionInProgress Then
		TraceLog("guard fade запрет reason=transition_in_progress")
		Return False
	End If
	If orchestrationState.IsPlaybackDispatchInProgress Then
		TraceWarn("playback", "break переход пропущен", "reason=dispatch_busy active=" & orchestrationState.ActiveDispatchInitiator & " queue=" & playQueue.Size)
		Return False
	End If
	TraceInfo("playback", "break переход начало", "type=" & metaState.CurrentMediaType & " queue=" & playQueue.Size)
	SetPlaybackFlowState(FLOW_TRANSITIONING, "fade_out_and_continue")
	ClearExactBreakState
	Dim fadeMs As Int
	If metaState.CurrentMediaType = "track" Then
		fadeMs = STOP_FADE_MS
	Else
		fadeMs = 0
	End If
	TraceLog("fade начало type=" & metaState.CurrentMediaType & " fadeMs=" & fadeMs)
	Dim activeAudioKey As String = Transition_GetDirectorActiveAudioKey
	If activeAudioKey <> "" Then GetAudioByKey(activeAudioKey).Stop(fadeMs)
	TraceInfo("playback", "break переход fade", "audio=" & activeAudioKey & " fadeMs=" & fadeMs)
	ClearPreparedState(False)
	Wait For (RunPlaybackDirectorAdvance("fade_out_and_continue", True)) Complete (dispatched As Boolean)
	TraceInfo("playback", "break переход итог", "dispatched=" & dispatched & " queue=" & playQueue.Size & " stage=" & playbackFlowState)
	Return dispatched
End Sub

Private Sub ScheduleHistoryLog(item As Map)
	If item.IsInitialized = False Then Return
	Dim itemType As String = item.GetDefault("type", "")
	If itemType <> "track" And itemType <> "ad" Then Return
	If item.GetDefault("id", "") = "" Then Return
	If itemType = "track" Then
		TraceLog("история confirm reason=playback_start item=" & DescribeItem(item))
		QueueHistoryRecordAt(item, DateTime.Now)
		ClearHistoryLogTimer
		Return
	End If
	TraceLog("история stage mode=ad_complete item=" & DescribeItem(item))
	ClearHistoryLogTimer
	metaState.StageHistoryItem(item, DateTime.Now)
End Sub

Private Sub ConfirmPendingHistoryItem(reason As String) As Boolean
	If metaState.PendingHistoryItem.IsInitialized = False Then Return False
	If metaState.PendingHistoryItem.GetDefault("id", "") = "" Then Return False
	TraceLog("история confirm reason=" & reason & " item=" & DescribeItem(metaState.PendingHistoryItem))
	QueueHistoryRecordAt(metaState.PendingHistoryItem, metaState.HistoryStartedAtTicks)
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
	TraceLog("история буфер add date=" & record.Get("date") & " time=" & record.Get("time") & " type=" & record.Get("type") & " id=" & record.Get("id") & " files=" & GetPendingHistoryFileCount)
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
		TraceLog("история чтение ошибка file=" & pendingHistoryFileName & " message=" & LastException.Message)
	End Try
	payload = NormalizeNdjsonPayload(payload)
	If payload = "" Or batchDate = "" Then
		DeleteHistoryPendingFile(pendingHistoryFileName)
		RefreshPendingHistoryState
		isHistoryFlushInProgress = False
		Return False
	End If
	Dim recordCount As Int = CountNdjsonRecords(payload)
	Dim queryParams As Map
	queryParams.Initialize
	queryParams.Put("player", playerCode)
	queryParams.Put("device", deviceId)
	queryParams.Put("date", batchDate)
	Dim requestUrl As String = HISTORY_BASE_URL & "?" & BuildParams(queryParams)
	Dim j As HttpJob
	j.Initialize("", Me)
	j.PostString(requestUrl, payload)
	ApplyClientRequestHeaders(j)
	j.GetRequest.Timeout = 5000
	j.GetRequest.SetContentType("text/plain; charset=utf-8")
	Wait For (j) JobDone(j As HttpJob)
	Dim success As Boolean = False
	If j.Success Then
		Dim responseText As String = j.GetString
		SaveServerSnapshot("POST", requestUrl, True, responseText, "")
		success = IsHistoryBatchAccepted(responseText)
	Else
		Dim failureKind As String = syncService.ClassifyHttpFailure(j.ErrorMessage)
		SaveServerSnapshot("POST", requestUrl, False, "", j.ErrorMessage)
		LogHttpFailure(requestUrl, failureKind)
	End If
	If success Then
		stateStore.SetLastHistoryOkNow
		DeleteHistoryPendingFile(pendingHistoryFileName)
		RefreshPendingHistoryState
		TraceInfo("history", "история отправлена", "records=" & recordCount)
	Else
		TraceWarn("history", "история не отправлена", "records=" & recordCount)
	End If
	WriteHealthSnapshot("history")
	j.Release
	isHistoryFlushInProgress = False
	Return success
End Sub

Private Sub ClearHistoryLogTimer
	metaState.ClearHistoryStage
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
			TraceWarn("history", "не удалось прочитать файл истории", "file=" & fileName)
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
		TraceLog("история response parse ошибка")
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
	Wait For (facade.StopPlayback) Complete (stopped As Boolean)
	Return stopped
End Sub

Public Sub Facade_StopPlayerCore As ResumableSub
	If CanStopPlaybackNow(True) = False Then Return False
	SetPlaybackFlowState(FLOW_STOPPING, "stop_requested")
	orchestrationState.EnterInternalStoppingState
	TraceLog("stop запрос type=" & metaState.CurrentMediaType & " activeAudio=" & Transition_GetDirectorActiveAudioKey & " preparedAudio=" & Transition_GetDirectorPreparedAudioKey)
	CaptureStoppedReserveQueue
	dataPolicyState.ClearPolicyPauseAndResumeRequest
	orchestrationState.EndDispatch
	ClearRetryTimer
	ClearExactBreakState
	ClearHistoryLogTimer
	ResetPlaybackWatchdogState
	ResetRetryDelay
	ResetAudioOutputErrorState
	stateStore.ClearDispatchRetryAfter
	Dim activeAudioKey As String = Transition_GetDirectorActiveAudioKey
	Dim preparedAudioKey As String = Transition_GetDirectorPreparedAudioKey
	If activeAudioKey <> "" Then
		If metaState.CurrentMediaType = "track" Then
			GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS)
		Else
			GetAudioByKey(activeAudioKey).Stop(0)
		End If
	End If
	If preparedAudioKey <> "" Then GetAudioByKey(preparedAudioKey).Stop(0)
	If directorState.IsInitialized Then
		directorState.Reset
		directorState.ConfigureDefaultSlots
		MirrorRuntimeStateFromDirector
	Else
		runtimeState.Reset
	End If
	metaState.Reset
	playlistIndex = -1
	playQueue.Clear
	orchestrationState.EnterUserStoppedState
	orchestrationState.ClearTrackTransitionFlags
	ClearQueueSnapshotState
	mediaCacheService.FlushPendingIndexSaves
	mediaCacheService.CleanupPlaybackTempFiles
	uiController.SetStatusText("")
	HidePin
	SetPlayIcon
	ApplyStoppedState
	SetPlaybackFlowState(FLOW_IDLE, "stop_complete")
	Return True
End Sub

Private Sub CaptureStoppedReserveQueue
	stateStore.CaptureStoppedReserveQueue(playQueue)
End Sub

Private Sub ClearQueueSnapshotState
	stateStore.ClearQueueSnapshotState
End Sub

Private Sub ClearPlaybackState
	TraceLog("состояние воспроизведения clear")
	audioPrimary.Reset
	audioSecondary.Reset
	mediaCacheService.FlushPendingIndexSaves
	mediaCacheService.CleanupPlaybackTempFiles
	If directorState.IsInitialized Then directorState.Reset
	runtimeState.ActiveAudioKey = ""
	runtimeState.PreparedAudioKey = ""
	runtimeState.ActiveItem.Initialize
	runtimeState.PreparedItem.Initialize
	If directorState.IsInitialized Then directorState.ConfigureDefaultSlots
	SyncPlaybackDirectorState
	metaState.Reset
	ClearPendingPlayState
	ClearPreparedState(False)
	playQueue.Clear
	orchestrationState.ClearTrackTransitionFlags
	initialStartFadePending = False
	orchestrationState.EndDispatch
	stateStore.ClearDispatchRetryAfter
	ClearRetryTimer
	ClearExactBreakState
	ClearHistoryLogTimer
	ResetPlaybackWatchdogState
	uiController.SetStatusText("")
End Sub

Private Sub ResolveStartFadeInMs As Int
	If initialStartFadePending = False Then Return 0
	If Transition_GetDirectorActiveAudioKey <> "" Then Return 0
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
	HandleAudioErrorAsync(CreateMap("audioKey": "primary", "message": message))
End Sub

Private Sub AudioSecondary_Error(message As String)
	HandleAudioErrorAsync(CreateMap("audioKey": "secondary", "message": message))
End Sub

Private Sub AudioPrimary_Complete
	HandleAudioCompleteAsync("primary")
End Sub

Private Sub AudioSecondary_Complete
	HandleAudioCompleteAsync("secondary")
End Sub

Private Sub AudioPrimary_Timeupdate
	HandleAudioTimeupdateAsync("primary")
End Sub

Private Sub AudioSecondary_Timeupdate
	HandleAudioTimeupdateAsync("secondary")
End Sub

Public Sub AudioPlayer_Ready(audioKey As String)
	HandleAudioReady(audioKey)
End Sub

Public Sub AudioPlayer_Error(audioKey As String, message As String)
	HandleAudioErrorAsync(CreateMap("audioKey": audioKey, "message": message))
End Sub

Public Sub AudioPlayer_Complete(audioKey As String)
	HandleAudioCompleteAsync(audioKey)
End Sub

Public Sub AudioPlayer_Timeupdate(audioKey As String)
	HandleAudioTimeupdateAsync(audioKey)
End Sub

Private Sub HandleAudioErrorAsync(args As Map)
	Wait For (HandleAudioError(args.GetDefault("audioKey", ""), args.GetDefault("message", ""))) Complete (unused As Boolean)
End Sub

Private Sub HandleAudioCompleteAsync(audioKey As String)
	Wait For (HandleAudioComplete(audioKey)) Complete (unused As Boolean)
End Sub

Private Sub HandleAudioTimeupdateAsync(audioKey As String)
	Wait For (HandleAudioTimeupdate(audioKey)) Complete (unused As Boolean)
End Sub

Private Sub PlaybackDirectorTimer_Tick
	Wait For (RunPlaybackDirectorTick("director_timer")) Complete (unused As Boolean)
End Sub

' Ready только сообщает факт; дальнейшая трактовка зависит от pending role в director-state.
Private Sub HandleAudioReady(audioKey As String)
	RefreshConnectionIndicatorState
	Dim pendingPlayItem As Map = Transition_GetDirectorPendingPlayItem(audioKey)
	If pendingPlayItem.Size > 0 Then
		TraceInfo("audio", "плеер ready", BuildAudioTraceDetails(pendingPlayItem, "player=" & TracePlayerNumber(audioKey) & " mode=play type=" & TraceItemType(pendingPlayItem) & " id=" & TraceTrackValue(pendingPlayItem)))
		ActivateLoadedItem(audioKey, pendingPlayItem, runtimeState.PendingPlayFadeInMs)
		ClearPendingPlayState
		Return
	End If
	Dim pendingPrepareItem As Map = Transition_GetDirectorPendingPrepareItem(audioKey)
	If pendingPrepareItem.Size > 0 Then
		TraceInfo("audio", "плеер ready", BuildAudioTraceDetails(pendingPrepareItem, "player=" & TracePlayerNumber(audioKey) & " mode=prepare type=" & TraceItemType(pendingPrepareItem) & " id=" & TraceTrackValue(pendingPrepareItem)))
		If directorState.IsInitialized Then
			directorState.SetPrepared(audioKey, pendingPrepareItem)
			MirrorRuntimeStateFromDirector
		Else
			runtimeState.SetPrepared(audioKey, pendingPrepareItem)
			runtimeState.ClearPendingPrepareState
		End If
	End If
End Sub

' Error сначала классифицируется по director-slot, а затем либо чистит pending, либо запускает общий recovery path.
Private Sub HandleAudioError(audioKey As String, message As String) As ResumableSub
	Dim errorItem As Map = Transition_GetDirectorActiveItem
	Dim pendingPlayItem As Map = Transition_GetDirectorPendingPlayItem(audioKey)
	Dim pendingPrepareItem As Map = Transition_GetDirectorPendingPrepareItem(audioKey)
	If pendingPlayItem.Size > 0 Then errorItem = pendingPlayItem
	If pendingPrepareItem.Size > 0 Then errorItem = pendingPrepareItem
	TraceError("audio", "плеер error", "player=" & TracePlayerNumber(audioKey) & " type=" & TraceItemType(errorItem) & " id=" & TraceTrackValue(errorItem) & " message=" & message)
	WriteHealthSnapshot("ошибка_audio")
	SetPlaybackFlowState(FLOW_ERROR, "audio_error:" & audioKey)
	If pendingPlayItem.Size > 0 Then
		ClearPendingPlayState
		Return True
	End If
	If pendingPrepareItem.Size > 0 Then
		ClearPreparedState(False)
		Return True
	End If
	If audioKey <> Transition_GetDirectorActiveAudioKey Then Return False
	consecutiveAudioOutputErrors = consecutiveAudioOutputErrors + 1
	If consecutiveAudioOutputErrors >= AUDIO_OUTPUT_ERROR_PAUSE_THRESHOLD Then
		EnterAudioOutputRecoveryPause(MessageValue("audio_device_check"))
		Return True
	End If
	If CanAdvancePlaybackNow("audio_error:" & audioKey, True) = False Then Return False
	Wait For (HandleMediaError) Complete (unused As Boolean)
	If dataPolicyState.IsLocalPlaybackMode And orchestrationState.IsStarted Then
		Wait For (RunPlaybackDirectorAdvance("audio_error_recovery:" & audioKey, True)) Complete (unusedRecovery As Boolean)
	End If
	Return True
End Sub

' Complete не выбирает следующий шаг сам — он передаёт управление в общий advance path.
Private Sub HandleAudioComplete(audioKey As String) As ResumableSub
	If CanAdvancePlaybackNow("audio_complete:" & audioKey, True) = False Then Return False
	Dim activeAudioKey As String = Transition_GetDirectorActiveAudioKey
	Dim activeItem As Map = Transition_GetDirectorActiveItem
	If audioKey <> activeAudioKey Then
		TraceWarn("playback", "audio complete пропущен", "reason=inactive_audio audio=" & audioKey & " active=" & activeAudioKey)
		Return False
	End If
	SetPlaybackFlowState(FLOW_TRANSITIONING, "audio_complete:" & audioKey)
	If activeItem.IsInitialized Then
		TraceInfo("audio", "плеер complete", "player=" & TracePlayerNumber(audioKey) & " type=" & TraceItemType(activeItem) & " id=" & TraceTrackValue(activeItem))
		TraceInfo("playback", "смена трека", "trackId=" & TraceTrackValue(activeItem))
	End If
	If activeItem.GetDefault("type", "") = "ad" Then
		QueueHistoryRecordAt(activeItem, metaState.HistoryStartedAtTicks)
		ClearHistoryLogTimer
	End If
	Wait For (RunPlaybackDirectorAdvance("audio_complete:" & audioKey, True)) Complete (dispatched As Boolean)
	Return dispatched
End Sub

' Timeupdate служит подтверждением реального progress active slot и не должен отдельно оркестрировать переходы.
Private Sub HandleAudioTimeupdate(audioKey As String) As ResumableSub
	If audioKey <> Transition_GetDirectorActiveAudioKey Then Return False
	If orchestrationState.IsStarted = False Or orchestrationState.IsStoppedByUser Or IsPlaybackFlowActive = False Then Return False
	Dim activeSlot As PlaybackPlayerSlot = directorState.GetSlotByAudioKey(audioKey)
	If activeSlot.IsInitialized Then activeSlot.MarkProgress
	If metaState.PendingHistoryItem.IsInitialized Then
		Dim activeItem As Map = Transition_GetDirectorActiveItem
		If metaState.PendingHistoryItem.GetDefault("type", "") = "track" And metaState.CurrentMediaUrl <> "" And metaState.PendingHistoryItem.GetDefault("id", "") = activeItem.GetDefault("id", "") And metaState.PendingHistoryItem.GetDefault("type", "") = activeItem.GetDefault("type", "") Then
			ConfirmPendingHistoryItem("timeupdate")
		End If
	End If
	Return True
End Sub

Public Sub TraceLog(message As String)
	traceRouter.TraceLog(message)
End Sub

Private Sub TraceInfo(category As String, message As String, details As String)
	traceRouter.TraceInfo(category, message, details)
End Sub

Private Sub TraceWarn(category As String, message As String, details As String)
	traceRouter.TraceWarn(category, message, details)
End Sub

Private Sub TraceError(category As String, message As String, details As String)
	traceRouter.TraceError(category, message, details)
End Sub

Private Sub TraceState(category As String, message As String, details As String)
	traceRouter.TraceState(category, message, details)
End Sub

Private Sub TraceDebug(message As String)
	traceRouter.TraceDebugMessage(message)
End Sub

Private Sub TracePlayerNumber(audioKey As String) As String
	If audioKey = "secondary" Then Return "2"
	Return "1"
End Sub

Private Sub TraceItemType(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Return item.GetDefault("type", "")
End Sub

Private Sub TraceTrackValue(item As Map) As String
	If item.IsInitialized = False Then Return ""
	Dim codeValue As String = item.GetDefault("code", "")
	If codeValue <> "" Then Return codeValue
	Return item.GetDefault("id", "")
End Sub

Private Sub WriteHealthSnapshot(trigger As String)
	Dim baseDetails As String = "trigger=" & trigger
	TraceState("health", "воспроизведение", baseDetails & _
		" stage=" & playbackFlowState & _
		" playing=" & IsPlaybackRunningForTrace & _
		" currentTrackId=" & ResolveCurrentTrackTraceValue & _
		" queue=" & playQueue.Size & BuildHealthAudioTraceDetails)
	TraceState("health", "кэш", baseDetails & _
		" trackCache=" & ResolveTrackCacheFileCountText & _
		" adCache=" & ResolveAdCacheFileCountText & _
		" trackIndex=" & storage.GetDefault("cached_track_count", 0) & _
		" adIndex=" & storage.GetDefault("cached_ad_count", 0))
	TraceState("health", "устройство", baseDetails & _
		" device=" & ResolveDeviceTraceName & _
		" deviceId=" & deviceId & _
		" os=" & ResolveClientPlatformText)
	TraceState("health", "ресурсы", baseDetails & _
		" ramFreeMb=" & ResolveFreeRamMbText & _
		" diskFreeMb=" & ResolveFreeDiskMbText & _
		" diskTotalMb=" & ResolveTotalDiskMbText)
	TraceState("health", "сеть", baseDetails & _
		" netErrors=" & stateStore.GetConsecutiveNetworkErrors & _
		" lastDataOkAgoSec=" & SecondsAgoText(stateStore.GetLastDataOkAt) & _
		" lastHistoryOkAgoSec=" & SecondsAgoText(stateStore.GetLastHistoryOkAt))
End Sub

Private Sub WriteSystemSnapshot(trigger As String)
	TraceInfo("system", "источник", trigger)
	TraceInfo("system", "устройство", "name=" & ResolveDeviceTraceName & " id=" & deviceId)
	TraceInfo("system", "платформа", "os=" & ResolveClientPlatformText)
	TraceInfo("system", "память", "ramFreeMb=" & ResolveFreeRamMbText)
	TraceInfo("system", "память доступно", "ramTotalMb=" & ResolveTotalRamMbText)
	TraceInfo("system", "диск", "diskFreeMb=" & ResolveFreeDiskMbText & " diskTotalMb=" & ResolveTotalDiskMbText)
	TraceInfo("system", "кэш треков", "trackCount=" & ResolveTrackCacheFileCountText & _
		" trackIndex=" & storage.GetDefault("cached_track_count", 0) & _
		" trackMb=" & ResolveTrackCacheSizeMbText)
	TraceInfo("system", "кэш рекламы", "adCount=" & ResolveAdCacheFileCountText & _
		" adIndex=" & storage.GetDefault("cached_ad_count", 0) & _
		" adMb=" & ResolveAdCacheSizeMbText)
	TraceInfo("system", "история", "pendingHistory=" & CountAllPendingHistoryRecords)
End Sub

Private Sub IsPlaybackRunningForTrace As String
	If orchestrationState.IsStarted = False Then Return "false"
	If Transition_GetDirectorActiveAudioKey = "" Then Return "false"
	Return "true"
End Sub

Private Sub ResolveCurrentTrackTraceValue As String
	Dim activeItem As Map = Transition_GetDirectorActiveItem
	If activeItem.IsInitialized = False Then Return ""
	Return TraceTrackValue(activeItem)
End Sub

Private Sub ResolveFreeRamMbText As String
	Try
		Dim runtime As JavaObject
		runtime.InitializeStatic("java.lang.Runtime")
		Dim currentRuntime As JavaObject = runtime.RunMethod("getRuntime", Null)
		Dim freeBytes As Long = currentRuntime.RunMethod("freeMemory", Null)
		Dim totalBytes As Long = currentRuntime.RunMethod("totalMemory", Null)
		Dim maxBytes As Long = currentRuntime.RunMethod("maxMemory", Null)
		Dim availableBytes As Long = freeBytes + Max(0, maxBytes - totalBytes)
		Return "" & Floor(availableBytes / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Private Sub ResolveFreeDiskMbText As String
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(storageDir))
		Return "" & Floor(fileObject.RunMethod("getUsableSpace", Null) / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Private Sub ResolveTotalRamMbText As String
	Try
		Dim runtime As JavaObject
		runtime.InitializeStatic("java.lang.Runtime")
		Dim currentRuntime As JavaObject = runtime.RunMethod("getRuntime", Null)
		Dim maxBytes As Long = currentRuntime.RunMethod("maxMemory", Null)
		Return "" & Floor(maxBytes / 1024 / 1024)
	Catch
		TraceDebug("не удалось определить общий объем памяти message=" & LastException.Message)
		Return "unknown"
	End Try
End Sub

Private Sub ResolveTotalDiskMbText As String
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(storageDir))
		Return "" & Floor(fileObject.RunMethod("getTotalSpace", Null) / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Private Sub ResolveTrackCacheSizeMbText As String
	Return "" & Floor(ResolveDirectorySizeBytes(mediaCacheService.GetTracksDir) / 1024 / 1024)
End Sub

Private Sub ResolveAdCacheSizeMbText As String
	Return "" & Floor(ResolveDirectorySizeBytes(mediaCacheService.GetAdsDir) / 1024 / 1024)
End Sub

Private Sub ResolveTrackCacheFileCountText As String
	Return "" & ResolveDirectoryFileCount(mediaCacheService.GetTracksDir)
End Sub

Private Sub ResolveAdCacheFileCountText As String
	Return "" & ResolveDirectoryFileCount(mediaCacheService.GetAdsDir)
End Sub

Private Sub ResolveDirectorySizeBytes(dir As String) As Long
	If dir = "" Then Return 0
	Try
		If File.Exists(dir, "") = False Then Return 0
		Dim listedFiles As List = File.ListFiles(dir)
		If listedFiles.IsInitialized = False Then Return 0
		Dim totalBytes As Long = 0
		For Each fileName As String In listedFiles
			If fileName = "" Then Continue
			Try
				totalBytes = totalBytes + File.Size(dir, fileName)
			Catch
				TraceDebug("не удалось определить размер файла кэша file=" & fileName & " message=" & LastException.Message)
			End Try
		Next
		Return totalBytes
	Catch
		TraceDebug("не удалось определить размер каталога кэша dir=" & dir & " message=" & LastException.Message)
		Return 0
	End Try
End Sub

Private Sub ResolveDirectoryFileCount(dir As String) As Int
	If dir = "" Then Return 0
	Try
		If File.Exists(dir, "") = False Then Return 0
		Dim listedFiles As List = File.ListFiles(dir)
		If listedFiles.IsInitialized = False Then Return 0
		Dim totalCount As Int = 0
		For Each fileName As String In listedFiles
			If fileName = "" Then Continue
			If fileName.EndsWith(".tmp") Then Continue
			totalCount = totalCount + 1
		Next
		Return totalCount
	Catch
		TraceDebug("не удалось определить количество файлов кэша dir=" & dir & " message=" & LastException.Message)
		Return 0
	End Try
End Sub

Private Sub ResolveDeviceTraceName As String
	Try
		Dim jo As JavaObject
		jo.InitializeStatic("java.lang.System")
		Dim computerName As String = "" & jo.RunMethod("getenv", Array As Object("COMPUTERNAME"))
		computerName = computerName.Trim
		If computerName <> "" And computerName.ToLowerCase <> "null" Then Return computerName
	Catch
		TraceDebug("не удалось определить имя устройства message=" & LastException.Message)
	End Try
	Return "unknown"
End Sub

Private Sub ResolveClientPlatformText As String
	Try
		Dim jo As JavaObject
		jo.InitializeStatic("java.lang.System")
		Dim osName As String = ("" & jo.RunMethod("getProperty", Array As Object("os.name"))).Trim
		Dim osVersion As String = ("" & jo.RunMethod("getProperty", Array As Object("os.version"))).Trim
		Dim osArch As String = ("" & jo.RunMethod("getProperty", Array As Object("os.arch"))).Trim
		Dim parts As List
		parts.Initialize
		If osName <> "" And osName.ToLowerCase <> "null" Then parts.Add(osName)
		If osVersion <> "" And osVersion.ToLowerCase <> "null" Then parts.Add(osVersion)
		If osArch <> "" And osArch.ToLowerCase <> "null" Then parts.Add(osArch)
		If parts.Size > 0 Then Return JoinList(parts, " ")
	Catch
		TraceDebug("не удалось определить платформу message=" & LastException.Message)
	End Try
	Return ResolveClientOsName
End Sub

Private Sub SecondsAgoText(ticksValue As Long) As String
	If ticksValue <= 0 Then Return "unknown"
	Return "" & Max(0, Floor((DateTime.Now - ticksValue) / 1000))
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
	uiController.SetPlayIcon
	If uiController.IsOrbitIdle Then
		orbitTimer.Enabled = False
	Else
		orbitTimer.Enabled = True
	End If
End Sub

Private Sub SetStopIcon
	uiController.SetStopIcon
	orbitPulseStep = 0
	orbitTimer.Enabled = True
End Sub

Private Sub UpdatePlayButtonAppearance(isHovered As Boolean)
	If uiController.IsInitialized Then
		uiController.UpdatePlayButtonAppearance(isHovered, orchestrationState.IsStarted)
		Return
	End If
	Dim backgroundColor As Int
	Dim borderColor As Int
	Dim orbitBorderColor As Int
	If orchestrationState.IsStarted Then
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
	If orchestrationState.IsStarted Or isHovered Then
		orbitBorderColor = 0x66D0FF71
	Else
		orbitBorderColor = 0x22D0FF71
	End If
	playButtonPane.SetColorAndBorder(backgroundColor, 4dip, borderColor, 999dip)
	orbitPane.SetColorAndBorder(xui.Color_Transparent, 2dip, orbitBorderColor, 999dip)
End Sub

Private Sub OrbitTimer_Tick
	orbitPulseStep = (orbitPulseStep + 1) Mod 24
	Dim fadeStep As Double = orbitTimer.Interval / ORBIT_FADE_MS
	If uiController.AdvanceOrbitFrame(orbitPulseStep, fadeStep) Then orbitTimer.Enabled = False
End Sub

Private Sub UpdateHeaderActionAppearance(isHovered As Boolean)
	If uiController.IsInitialized Then
		uiController.UpdateHeaderActionAppearance(isHovered)
		Return
	End If
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

Private Sub UpdateTextButtonAppearance(buttonView As B4XView, isHovered As Boolean)
	If uiController.IsInitialized Then
		uiController.UpdateTextButtonAppearance(buttonView, isHovered)
		Return
	End If
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

Private Sub UpdateCodeInputAppearance(isFocused As Boolean)
	If uiController.IsInitialized Then
		uiController.UpdateCodeInputAppearance(isFocused)
		Return
	End If
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

Private Sub BringToFront(view As B4XView)
	If uiController.IsInitialized Then
		uiController.BringToFront(view)
		Return
	End If
	Dim jo As JavaObject = view
	jo.RunMethod("toFront", Null)
End Sub

Private Sub ApplyStoppedState
	uiController.ApplyStoppedState(MessageValue("idle_stream"))
End Sub

Private Sub HideContentBlocks
	uiController.HideContentBlocks
End Sub

Private Sub ShowStream(text As String)
	uiController.ShowStream(text)
End Sub

Private Sub ShowMessage(text As String)
	uiController.ShowMessage(text)
End Sub

Private Sub ShowClaimPrompt(text As String)
	uiController.ShowClaimPrompt(text)
	orchestrationState.EnterUserStoppedState
	SetPlayIcon
	LayoutUi(rootView.Width, rootView.Height)
End Sub

Private Sub HidePin
	uiController.HidePin
End Sub

Private Sub ShowTrackMeta(item As Map)
	uiController.ShowTrackMeta(item)
End Sub

Private Sub ShowAdMeta(item As Map)
	uiController.ShowAdMeta(item)
End Sub

Private Sub UpdateConnectionIndicator(mode As String)
	uiController.UpdateConnectionIndicator(mode)
End Sub

Private Sub RefreshConnectionIndicatorState
	If dataPolicyState.IsLocalPlaybackMode Then
		If stateStore.IsMediaPathDegraded Then
			UpdateConnectionIndicator("degraded")
		Else
			UpdateConnectionIndicator("offline")
		End If
		Return
	End If
	If dataPolicyState.IsPlaybackPausedByPolicy Then
		UpdateConnectionIndicator("server")
		Return
	End If
	If stateStore.IsMediaPathDegraded Then
		UpdateConnectionIndicator("degraded")
		Return
	End If
	UpdateConnectionIndicator("online")
End Sub

Private Sub UpdateMediaConnectivityStateFromCacheSync(downloaded As Boolean)
	Dim transition As String = retryFallbackState.UpdateMediaPathDegradedFromCacheSync(downloaded, mediaCacheService.ConsumeRecentMediaNetworkFailure)
	If transition = "entered" Then
		TraceLog("degraded path вход source=cache_sync")
	Else If transition = "recovered" Then
		TraceLog("degraded path восстановлен source=cache_sync")
	End If
	RefreshConnectionIndicatorState
End Sub

Private Sub RenderPlayerHead(code As String, title As String)
	uiController.RenderPlayerHead(FormatPlayerCodeForDisplay(code), title)
End Sub

Private Sub MediaUrl(item As Map) As String
	Dim id As String = item.GetDefault("id", "")
	If id = "" Then Return ""
	Dim localUri As String = mediaCacheService.ResolveLocalMediaUri(item)
	If localUri <> "" Then Return localUri
	Return ""
End Sub

Private Sub ResolvePlaybackMediaUrl(audioKey As String, item As Map) As String
	Return mediaCacheService.ResolvePlaybackMediaUri(audioKey, item)
End Sub

Public Sub CleanupPlaybackTempFiles
	mediaCacheService.FlushPendingIndexSaves
	mediaCacheService.CleanupPlaybackTempFiles
End Sub

Public Sub FlushPendingCacheIndexes
	mediaCacheService.FlushPendingIndexSaves
End Sub

Private Sub CurrentVolume(item As Map) As Double
	Return ResolveItemVolume(item)
End Sub

Private Sub BuildAudioTraceDetails(item As Map, baseDetails As String) As String
	Dim details As String = baseDetails
	If item.IsInitialized = False Then Return details
	details = details & " volume=" & NumberFormat2(CurrentVolume(item), 1, 3, 3, False)
	details = details & " gainDb=" & NumberFormat2(ResolveItemGainDb(item), 1, 1, 1, False)
	details = details & " gainApplied=" & IIf(item.ContainsKey("gain"), "yes", "default")
	Return details
End Sub

Private Sub BuildHealthAudioTraceDetails As String
	Dim activeItem As Map = Transition_GetDirectorActiveItem
	If activeItem.IsInitialized = False Then Return ""
	Return " volume=" & NumberFormat2(CurrentVolume(activeItem), 1, 3, 3, False) & _
		" gainDb=" & NumberFormat2(ResolveItemGainDb(activeItem), 1, 1, 1, False) & _
		" gainApplied=" & IIf(activeItem.ContainsKey("gain"), "yes", "default")
End Sub

Private Sub ResolveItemVolume(item As Map) As Double
	If item.IsInitialized = False Then Return 0.7
	Dim itemType As String = item.GetDefault("type", "")
	Dim gainDb As Double = ResolveItemGainDb(item)
	Dim baseFactor As Double = 1
	If itemType = "track" Then baseFactor = ResolvePlayerLevelFactor
	Return Max(0, Min(1, baseFactor * DbToFactor(gainDb)))
End Sub

Private Sub ResolveItemGainDb(item As Map) As Double
	If item.IsInitialized = False Then Return -3
	Return NormalizeDbValue(item.GetDefault("gain", -3), -3)
End Sub

Private Sub ResolvePlayerLevelFactor As Double
	Dim playerData As Map = stateStore.OfflineData.GetDefault("player", CreateInitializedMap)
	Dim playerLevel As Double = playerData.GetDefault("level", 100)
	Return PlayerLevelToFactor(playerLevel)
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

Private Sub ResolveClientOsName As String
	Return "windows"
End Sub

Private Sub BuildParams(params As Map) As String
	Return syncService.BuildParams(params)
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
		TraceLog("machine guid чтение начало")
	Catch
		TraceLog("machine guid чтение ошибка message=" & LastException.Message)
	End Try
End Sub

Private Sub MachineGuidShell_ProcessCompleted (success As Boolean, exitCode As Int, stdOut As String, stdErr As String)
	If success And exitCode = 0 Then
		Dim matcher As Matcher = Regex.Matcher("MachineGuid\s+REG_\w+\s+([^\r\n]+)", stdOut)
		If matcher.Find Then
			Dim machineGuid As String = matcher.Group(1).Trim.ToLowerCase
			If machineGuid = "" Then
				TraceLog("machine guid пустой")
				Return
			End If
			If deviceId = machineGuid Then
				TraceLog("machine guid совпадение device=true")
			Else
				TraceLog("machine guid прочитан, deviceId сохранен прежним")
			End If
		Else
			TraceLog("machine guid чтение ошибка reason=not_found")
		End If
	Else
		TraceLog("machine guid чтение ошибка success=" & success & " exitCode=" & exitCode & " stderr=" & stdErr)
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
			TraceLog("legacy migrate итог target=kvs")
			File.Delete(storageDir, storageFile)
		End If
	Catch
		TraceLog("legacy migrate ошибка message=" & LastException.Message)
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
		TraceLog("метаданные плейлистов sync skip reason=nothing_to_sync")
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
	InvalidateRelevantTrackIdsCache
	Dim actualCount As Int = storage.GetDefault("playlist_actual_count", 0)
	TraceLog("метаданные плейлистов sync итог downloaded=" & downloadedCount & " updated=" & updatedCount & " failed=" & failedCount & " actual=" & actualCount)
	Return failedCount = 0
End Sub

Private Sub DownloadOfflinePlaylistMetadata(descriptor As Map, cachedPlaylistIndex As Map) As ResumableSub
	Dim playlistId As String = descriptor.GetDefault("id", "")
	If playlistId = "" Then Return False
	Dim playlistUrl As String = offlineStoreService.PlaylistMetadataUrl(playlistId)
	TraceLog("метаданные плейлиста fetch начало id=" & playlistId & " url=" & playlistUrl)
	Wait For (FetchJsonWithTimeout(playlistUrl, FETCH_TIMEOUT_MS)) Complete (result As Map)
	If result.GetDefault("Success", False) = False Then
		TraceLog("метаданные плейлиста fetch ошибка id=" & playlistId & " message=" & result.GetDefault("ErrorMessage", ""))
		Return False
	End If
	Dim resultData As Object = result.Get("Data")
	If resultData Is Map Then
	Else
		TraceLog("метаданные плейлиста fetch ошибка id=" & playlistId & " reason=not_map")
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
			TraceLog("окно save left=" & form.WindowLeft & " top=" & form.WindowTop & " width=" & form.WindowWidth & " height=" & form.WindowHeight)
		End If
	Catch
		TraceLog("окно save ошибка message=" & LastException.Message)
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
		TraceLog("окно restore left=" & form.WindowLeft & " top=" & form.WindowTop & " width=" & form.WindowWidth & " height=" & form.WindowHeight)
	Catch
		TraceLog("окно restore ошибка message=" & LastException.Message)
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
	Dim trustedNow As Long = storage.GetDefault(trustedSyncTimeKey, 0)
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

' Public bridge for extracted coordinators that should not depend on private page helpers.
Public Sub Data_MessageValue(key As String) As String
	Return MessageValue(key)
End Sub

Public Sub PlayerCodeValue As String
	Return playerCode
End Sub

Public Sub DeviceIdValue As String
	Return deviceId
End Sub

Public Sub TimezoneOffsetMinutesValue As Int
	Return TimezoneOffsetMinutes
End Sub

Public Sub ClientOsNameValue As String
	Return ResolveClientOsName
End Sub

Public Sub ServiceCheckUrlValue As String
	Return SERVICE_CHECK_URL
End Sub

Public Sub DataUrlValue As String
	Return DATA_BASE_URL
End Sub

Public Sub NextUrlValue As String
	Return NEXT_BASE_URL
End Sub

Public Sub ClaimUrlValue As String
	Return CLAIM_BASE_URL
End Sub

Public Sub Data_ConsumeLastException
	ConsumeLastException
End Sub

Public Sub Data_TraceLog(message As String)
	TraceLog(message)
End Sub

Public Sub Data_TraceInfo(category As String, message As String, details As String)
	TraceInfo(category, message, details)
End Sub

Public Sub Data_ApplyTemporaryMode(mode As String)
	dataPolicyState.ApplyTemporaryMode(mode)
End Sub

Public Sub Data_RefreshConnectionIndicatorState
	RefreshConnectionIndicatorState
End Sub

Public Sub Data_ClearPlaybackState
	ClearPlaybackState
End Sub

Public Sub Data_HidePin
	HidePin
End Sub

Public Sub Data_ShowMessage(text As String)
	ShowMessage(text)
End Sub

Public Sub Data_ScheduleRetry(mode As String, delayMs As Int)
	ScheduleRetry(mode, delayMs)
End Sub

Public Sub Data_EnterPolicyPause(reason As String, connectionMode As String)
	EnterPolicyPauseState(reason, connectionMode)
End Sub

Public Sub Data_SetPlaybackFlowState(stateValue As String, reason As String)
	SetPlaybackFlowState(stateValue, reason)
End Sub

Public Sub Data_ClearPolicyPauseAndResumeRequest
	dataPolicyState.ClearPolicyPauseAndResumeRequest
End Sub

Public Sub Data_EnterUserStoppedState
	orchestrationState.EnterUserStoppedState
End Sub

Public Sub Data_SetPlayIcon
	SetPlayIcon
End Sub

Public Sub Data_EnterLocalPlayback
	dataPolicyState.EnterLocalPlayback
End Sub

Public Sub Data_SetMediaPathDegraded(value As Boolean)
	stateStore.SetMediaPathDegraded(value)
End Sub

Public Sub Data_RequestSkipQueueSnapshotRestore(reason As String)
	RequestSkipQueueSnapshotRestore(reason)
End Sub

Public Sub Data_HasLocalPlaybackFallback As Boolean
	Return HasLocalPlaybackFallback
End Sub

Public Sub Data_SetLocalFallbackReady(fallbackReady As Boolean)
	dataPolicyState.SetLocalFallbackReady(fallbackReady)
End Sub

Public Sub Data_DisableBackgroundRefreshTimers
	offlineDataRefreshTimer.Enabled = False
	historyFlushTimer.Enabled = False
	localAdMinuteTimer.Enabled = False
	trackCacheWarmupTimer.Enabled = False
	cacheAuditTimer.Enabled = False
End Sub

Public Sub Data_TraceWarn(category As String, message As String, details As String)
	TraceWarn(category, message, details)
End Sub

Public Sub Data_WriteHealthSnapshot(trigger As String)
	WriteHealthSnapshot(trigger)
End Sub

Public Sub Data_SecondsAgoText(ticksValue As Long) As String
	Return SecondsAgoText(ticksValue)
End Sub

Public Sub Data_ApplyClientRequestHeaders(j As HttpJob)
	ApplyClientRequestHeaders(j)
End Sub

Public Sub Data_SaveServerSnapshot(method As String, url As String, success As Boolean, body As String, errorMessage As String)
	SaveServerSnapshot(method, url, success, body, errorMessage)
End Sub

Public Sub Data_FlushTraceBufferAsync
	FlushTraceBufferAsync
End Sub

Public Sub Data_InvalidateRelevantTrackIdsCache
	InvalidateRelevantTrackIdsCache
End Sub

Public Sub Data_EnsureAdCacheSyncAsync
	EnsureAdCacheSyncAsync
End Sub

Public Sub Data_SetStopIcon
	SetStopIcon
End Sub

Public Sub Data_HideContentBlocks
	HideContentBlocks
End Sub

Public Sub Data_ResumePlaybackAfterPolicyPauseAsync
	ResumePlaybackAfterPolicyPause
End Sub

Public Sub Data_ClearPolicyPause
	dataPolicyState.ClearPolicyPause
End Sub

Public Sub Data_HandleMessageItem(item As Map)
	HandleMessageItem(item)
End Sub

Public Sub Data_SyncOfflinePlaylistMetadata As ResumableSub
	Wait For (SyncOfflinePlaylistMetadata) Complete (synced As Boolean)
	Return synced
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

Private Sub SetPaneStyle(view As B4XView, style As String)
	UiStyle.SetPaneStyle(view, style)
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


