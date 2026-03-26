B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@

Sub Class_Globals
End Sub

Public Sub Initialize
End Sub

Public Sub AttachPage(page As Object)
	Starter.AttachPlaybackPage(page)
End Sub

Public Sub DetachPage(page As Object)
	Starter.DetachPlaybackPage(page)
End Sub

Public Sub OnPageAppear(page As Object)
	AttachPage(page)
End Sub

Public Sub OnPageDisappear(page As Object)
	DetachPage(page)
End Sub

Public Sub HasAttachedPage As Boolean
	Return Starter.HasPlaybackPage
End Sub

Public Sub RequestPlaybackAutoStart
	Starter.RequestPlaybackAutoStart
End Sub

Public Sub RequestPlaybackManualStart
	Starter.RequestPlaybackManualStart
End Sub

Public Sub RequestPlaybackStop
	Starter.RequestPlaybackStop
End Sub

Public Sub ConfigureBackgroundTimers(enableNetworkTimers As Boolean)
	Starter.ConfigurePlaybackBackgroundTimers(enableNetworkTimers)
End Sub

Public Sub StopBackgroundTimers
	Starter.StopPlaybackBackgroundTimers
End Sub

Public Sub SchedulePlaybackBreak(delayMs As Long)
	Starter.SchedulePlaybackBreak(delayMs)
End Sub

Public Sub CancelPlaybackBreak
	Starter.CancelPlaybackBreak
End Sub

Public Sub ScheduleCacheAudit(delayMs As Int)
	Starter.SchedulePlaybackCacheAudit(delayMs)
End Sub

Public Sub CancelCacheAudit
	Starter.CancelPlaybackCacheAudit
End Sub

Public Sub PublishState(publishedState As Map)
	Starter.UpdatePublishedPlaybackState(publishedState)
End Sub

Public Sub GetPublishedState As Map
	Return Starter.GetPublishedPlaybackState
End Sub
