B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.85
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

' B4A-only service scaffold: boot/package-replaced/update queue.

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public PendingUpdateDir As String
	Public PendingUpdateFile As String
	Public PlaybackEngineHost As PlaybackHost
	Private playbackPage As Object
	Private playbackPageAttached As Boolean
	Private publishedPlaybackState As Map
	Private pendingPlaybackEvents As List
	Private Const ACTION_BOOT_COMPLETED As String = "android.intent.action.BOOT_COMPLETED"
	Private Const ACTION_LOCKED_BOOT_COMPLETED As String = "android.intent.action.LOCKED_BOOT_COMPLETED"
	Private Const ACTION_MY_PACKAGE_REPLACED As String = "android.intent.action.MY_PACKAGE_REPLACED"
	Private Const ACTION_PACKAGE_REPLACED As String = "android.intent.action.PACKAGE_REPLACED"
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	PlaybackEngineHost.Initialize
	If publishedPlaybackState.IsInitialized = False Then publishedPlaybackState.Initialize
	If pendingPlaybackEvents.IsInitialized = False Then pendingPlaybackEvents.Initialize
End Sub

Sub Service_Start (StartingIntent As Intent)
	PlaybackEngineHost.Initialize
	Dim action As String = ResolveIntentAction(StartingIntent)
	If action = ACTION_BOOT_COMPLETED Or action = ACTION_LOCKED_BOOT_COMPLETED Then
		RequestPlaybackAutoStart
		StartActivity(Main)
	Else If action = ACTION_MY_PACKAGE_REPLACED Or action = ACTION_PACKAGE_REPLACED Then
		RequestPlaybackAutoStart
		StartActivity(Main)
	Else If PendingUpdateFile <> "" Then
		' Здесь будет rooted APK install flow.
		' Пока сервис только принимает staged update в очередь для следующего этапа миграции.
	End If
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Log("Starter.Application_Error: " & Error.Message)
	Log(StackTrace)
	Return True
End Sub

Sub Service_Destroy
End Sub

Public Sub QueueAppUpdateInstall(updateDir As String, updateFile As String)
	PendingUpdateDir = updateDir
	PendingUpdateFile = updateFile
	StartService(Me)
End Sub

Public Sub RegisterPlaybackPage(page As Object)
	playbackPage = page
	playbackPageAttached = True
	FlushPendingPlaybackEvents
End Sub

Public Sub AttachPlaybackPage(page As Object)
	RegisterPlaybackPage(page)
	PlaybackEngineHost.AttachPage(page)
End Sub

Public Sub DetachPlaybackPage(page As Object)
	PlaybackEngineHost.DetachPage(page)
	UnregisterPlaybackPage(page)
End Sub

Public Sub UnregisterPlaybackPage(page As Object)
	playbackPage = Null
	playbackPageAttached = False
End Sub

Public Sub HasPlaybackPage As Boolean
	Return playbackPageAttached
End Sub

Public Sub DispatchPlaybackHostEvent(eventName As String)
	If playbackPageAttached = False Then
		EnqueuePendingPlaybackEvent(eventName)
		Return
	End If
	DispatchPlaybackPageEvent(eventName)
End Sub

Private Sub EnqueuePendingPlaybackEvent(eventName As String)
	If pendingPlaybackEvents.IsInitialized = False Then pendingPlaybackEvents.Initialize
	If eventName = "" Then Return
	If IsCoalescedPlaybackEvent(eventName) And pendingPlaybackEvents.IndexOf(eventName) > -1 Then Return
	pendingPlaybackEvents.Add(eventName)
End Sub

Private Sub FlushPendingPlaybackEvents
	If playbackPageAttached = False Then Return
	If pendingPlaybackEvents.IsInitialized = False Or pendingPlaybackEvents.Size = 0 Then Return
	Dim eventsCopy As List
	eventsCopy.Initialize
	For Each eventName As String In pendingPlaybackEvents
		eventsCopy.Add(eventName)
	Next
	pendingPlaybackEvents.Clear
	For Each eventName As String In eventsCopy
		DispatchPlaybackPageEvent(eventName)
	Next
End Sub

Private Sub DispatchPlaybackPageEvent(eventName As String)
	If playbackPageAttached = False Then Return
	If IsPlaybackCommandEvent(eventName) Then
		DispatchPlaybackPageCommand(eventName)
		Return
	End If
	DispatchPlaybackPageTimer(eventName)
End Sub

Private Sub DispatchPlaybackPageCommand(eventName As String)
	Select eventName
		Case "auto_start"
			CallSubDelayed(playbackPage, "Host_CommandAutoStart")
		Case "manual_start"
			CallSubDelayed(playbackPage, "Host_CommandManualStart")
		Case "stop"
			CallSubDelayed(playbackPage, "Host_CommandStop")
	End Select
End Sub

Private Sub DispatchPlaybackPageTimer(eventName As String)
	Select eventName
		Case "playback_watchdog_tick"
			CallSubDelayed(playbackPage, "Host_TimerPlaybackWatchdogTick")
		Case "playback_director_tick"
			CallSubDelayed(playbackPage, "Host_TimerPlaybackDirectorTick")
		Case "break_tick"
			CallSubDelayed(playbackPage, "Host_TimerBreakTick")
		Case "history_flush"
			CallSubDelayed(playbackPage, "Host_TimerHistoryFlush")
		Case "trace_upload"
			CallSubDelayed(playbackPage, "Host_TimerTraceUpload")
		Case "offline_refresh"
			CallSubDelayed(playbackPage, "Host_TimerOfflineRefresh")
		Case "local_ad_minute"
			CallSubDelayed(playbackPage, "Host_TimerLocalAdMinute")
		Case "cache_audit_tick"
			CallSubDelayed(playbackPage, "Host_TimerCacheAudit")
	End Select
End Sub

Private Sub IsCoalescedPlaybackEvent(eventName As String) As Boolean
	Select eventName
		Case "playback_director_tick", "playback_watchdog_tick", "history_flush", "trace_upload", "offline_refresh", "local_ad_minute", "cache_audit_tick", "break_tick"
			Return True
	End Select
	Return False
End Sub

Private Sub IsPlaybackCommandEvent(eventName As String) As Boolean
	Select eventName
		Case "auto_start", "manual_start", "stop"
			Return True
	End Select
	Return False
End Sub

Public Sub RequestPlaybackAutoStart
	PlaybackEngineHost.RequestAutoStart
End Sub

Public Sub RequestPlaybackManualStart
	PlaybackEngineHost.RequestManualStart
End Sub

Public Sub RequestPlaybackStop
	PlaybackEngineHost.RequestStop
End Sub

Public Sub ConfigurePlaybackBackgroundTimers(enableNetworkTimers As Boolean)
	PlaybackEngineHost.ConfigureBackgroundTimers(enableNetworkTimers)
End Sub

Public Sub StopPlaybackBackgroundTimers
	PlaybackEngineHost.StopBackgroundTimers
End Sub

Public Sub SchedulePlaybackBreak(delayMs As Long)
	PlaybackEngineHost.ScheduleBreak(delayMs)
End Sub

Public Sub CancelPlaybackBreak
	PlaybackEngineHost.CancelBreak
End Sub

Public Sub SchedulePlaybackCacheAudit(delayMs As Int)
	PlaybackEngineHost.ScheduleCacheAudit(delayMs)
End Sub

Public Sub CancelPlaybackCacheAudit
	PlaybackEngineHost.CancelCacheAudit
End Sub

Public Sub UpdatePublishedPlaybackState(stateBundle As Map)
	If publishedPlaybackState.IsInitialized = False Then publishedPlaybackState.Initialize
	publishedPlaybackState.Clear
	If stateBundle.IsInitialized = False Then Return
	For Each key As String In stateBundle.Keys
		publishedPlaybackState.Put(key, stateBundle.Get(key))
	Next
End Sub

Public Sub GetPublishedPlaybackState As Map
	Dim stateBundle As Map
	stateBundle.Initialize
	If publishedPlaybackState.IsInitialized = False Then Return stateBundle
	For Each key As String In publishedPlaybackState.Keys
		stateBundle.Put(key, publishedPlaybackState.Get(key))
	Next
	Return stateBundle
End Sub

Private Sub ResolveIntentAction(startingIntent As Intent) As String
	If startingIntent.IsInitialized = False Then Return ""
	If startingIntent.Action = Null Then Return ""
	Return startingIntent.Action
End Sub
