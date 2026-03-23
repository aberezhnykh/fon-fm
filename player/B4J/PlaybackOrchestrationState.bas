B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Public IsStarted As Boolean
	Public IsStoppedByUser As Boolean
	Public IsStopping As Boolean
	Public PrefetchDone As Boolean
	Public IsCrossfadeTriggered As Boolean
	Public IsQueueBackfillInProgress As Boolean
	Public IsPlaybackDispatchInProgress As Boolean
	Public ActiveDispatchInitiator As String
End Sub

Public Sub Initialize
	ResetToStopped
End Sub

Public Sub ResetToStopped
	IsStarted = False
	IsStoppedByUser = True
	IsStopping = False
	PrefetchDone = False
	IsCrossfadeTriggered = False
	IsQueueBackfillInProgress = False
	IsPlaybackDispatchInProgress = False
	ActiveDispatchInitiator = ""
End Sub

Public Sub ResetTransientFlags
	PrefetchDone = False
	IsCrossfadeTriggered = False
	IsQueueBackfillInProgress = False
	IsPlaybackDispatchInProgress = False
	ActiveDispatchInitiator = ""
End Sub

Public Sub ClearTrackTransitionFlags
	PrefetchDone = False
	IsCrossfadeTriggered = False
End Sub

Public Sub EnterStartedState
	IsStarted = True
	IsStoppedByUser = False
	IsStopping = False
End Sub

Public Sub EnterUserStoppedState
	IsStarted = False
	IsStoppedByUser = True
	IsStopping = False
End Sub

Public Sub EnterInternalStoppingState
	IsStopping = True
	IsStarted = False
End Sub

Public Sub EnterPolicyPausedState
	IsStarted = False
	IsStoppedByUser = False
	IsStopping = False
End Sub

Public Sub ExitStoppingState
	IsStopping = False
End Sub

Public Sub IsPlaybackActive As Boolean
	Return IsStarted And IsStoppedByUser = False And IsStopping = False
End Sub

Public Sub BeginQueueBackfill As Boolean
	If IsQueueBackfillInProgress Then Return False
	IsQueueBackfillInProgress = True
	Return True
End Sub

Public Sub EndQueueBackfill
	IsQueueBackfillInProgress = False
End Sub

Public Sub BeginDispatch(initiator As String) As Boolean
	If IsPlaybackDispatchInProgress Then Return False
	IsPlaybackDispatchInProgress = True
	ActiveDispatchInitiator = initiator
	Return True
End Sub

Public Sub EndDispatch
	IsPlaybackDispatchInProgress = False
	ActiveDispatchInitiator = ""
End Sub
