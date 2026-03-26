B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@

' Service-owned playback host.
' Пока берёт на себя критичные playback timers и держит ссылку на UI-page как на клиента,
' а не как на владельца движка.

Sub Class_Globals
	Private directorTimer As Timer
	Private watchdogTimer As Timer
	Private breakTimer As Timer
	Private historyFlushTimer As Timer
	Private traceUploadTimer As Timer
	Private offlineDataRefreshTimer As Timer
	Private localAdMinuteTimer As Timer
	Private cacheAuditTimer As Timer
	Private initializedFlag As Boolean
	Private coreTimersStarted As Boolean
	Private pendingCommand As String
End Sub

Public Sub Initialize
	EnsureCoreInitialized
End Sub

Private Sub EnsureCoreInitialized
	If initializedFlag Then Return
	directorTimer.Initialize("DirectorTimer", 250)
	watchdogTimer.Initialize("WatchdogTimer", 1000)
	breakTimer.Initialize("BreakTimer", 1000)
	historyFlushTimer.Initialize("HistoryFlushTimer", 30000)
	traceUploadTimer.Initialize("TraceUploadTimer", 60000)
	offlineDataRefreshTimer.Initialize("OfflineDataRefreshTimer", 5 * 60 * 1000)
	localAdMinuteTimer.Initialize("LocalAdMinuteTimer", 1000)
	cacheAuditTimer.Initialize("CacheAuditTimer", 20000)
	initializedFlag = True
End Sub

Public Sub AttachPage(page As Object)
	EnsureCoreInitialized
	StartCoreTimers
	TryDispatchPendingCommand
End Sub

Public Sub DetachPage(page As Object)
End Sub

Public Sub StartCoreTimers
	EnsureCoreInitialized
	If coreTimersStarted Then Return
	directorTimer.Enabled = True
	watchdogTimer.Enabled = True
	coreTimersStarted = True
End Sub

Public Sub StopCoreTimers
	directorTimer.Enabled = False
	watchdogTimer.Enabled = False
	breakTimer.Enabled = False
	coreTimersStarted = False
End Sub

Public Sub ConfigureBackgroundTimers(enableNetworkTimers As Boolean)
	EnsureCoreInitialized
	historyFlushTimer.Enabled = False
	traceUploadTimer.Enabled = False
	offlineDataRefreshTimer.Enabled = False
	localAdMinuteTimer.Interval = 1000
	localAdMinuteTimer.Enabled = True
	If enableNetworkTimers = False Then Return
	offlineDataRefreshTimer.Interval = 5 * 60 * 1000
	offlineDataRefreshTimer.Enabled = True
	historyFlushTimer.Interval = 30000
	historyFlushTimer.Enabled = True
	traceUploadTimer.Interval = 60000
	traceUploadTimer.Enabled = True
End Sub

Public Sub StopBackgroundTimers
	historyFlushTimer.Enabled = False
	traceUploadTimer.Enabled = False
	offlineDataRefreshTimer.Enabled = False
	localAdMinuteTimer.Enabled = False
	cacheAuditTimer.Enabled = False
End Sub

Public Sub ScheduleCacheAudit(delayMs As Int)
	EnsureCoreInitialized
	cacheAuditTimer.Enabled = False
	If delayMs <= 0 Then Return
	cacheAuditTimer.Interval = delayMs
	cacheAuditTimer.Enabled = True
End Sub

Public Sub CancelCacheAudit
	cacheAuditTimer.Enabled = False
End Sub

Public Sub RequestAutoStart
	pendingCommand = "auto_start"
	TryDispatchPendingCommand
End Sub

Public Sub RequestManualStart
	pendingCommand = "manual_start"
	TryDispatchPendingCommand
End Sub

Public Sub RequestStop
	pendingCommand = "stop"
	TryDispatchPendingCommand
End Sub

Private Sub TryDispatchPendingCommand
	If pendingCommand = "" Then Return
	Dim commandName As String = pendingCommand
	pendingCommand = ""
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", commandName)
End Sub

Private Sub DirectorTimer_Tick
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "playback_director_tick")
End Sub

Private Sub WatchdogTimer_Tick
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "playback_watchdog_tick")
End Sub

Private Sub HistoryFlushTimer_Tick
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "history_flush")
End Sub

Private Sub TraceUploadTimer_Tick
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "trace_upload")
End Sub

Private Sub OfflineDataRefreshTimer_Tick
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "offline_refresh")
End Sub

Private Sub LocalAdMinuteTimer_Tick
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "local_ad_minute")
End Sub

Private Sub CacheAuditTimer_Tick
	cacheAuditTimer.Enabled = False
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "cache_audit_tick")
End Sub

Public Sub ScheduleBreak(delayMs As Long)
	EnsureCoreInitialized
	breakTimer.Enabled = False
	If delayMs <= 0 Then Return
	breakTimer.Interval = delayMs
	breakTimer.Enabled = True
End Sub

Public Sub CancelBreak
	breakTimer.Enabled = False
End Sub

Private Sub BreakTimer_Tick
	breakTimer.Enabled = False
	CallSubDelayed2(Starter, "DispatchPlaybackHostEvent", "break_tick")
End Sub
