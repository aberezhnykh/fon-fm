B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Public IsOfflineDataRefreshInProgress As Boolean
	Public IsTrackCacheRefreshInProgress As Boolean
	Public IsLocalPlaybackMode As Boolean
	Public IsPlaybackPausedByPolicy As Boolean
	Public ResumePlaybackWhenServerAllows As Boolean
	Public LastOfflineDataRefreshState As String
End Sub

Public Sub Initialize
	Reset
End Sub

Public Sub Reset
	IsOfflineDataRefreshInProgress = False
	IsTrackCacheRefreshInProgress = False
	IsLocalPlaybackMode = False
	IsPlaybackPausedByPolicy = False
	ResumePlaybackWhenServerAllows = False
	LastOfflineDataRefreshState = ""
End Sub

Public Sub BeginOfflineDataRefresh As Boolean
	If IsOfflineDataRefreshInProgress Then Return False
	IsOfflineDataRefreshInProgress = True
	LastOfflineDataRefreshState = ""
	Return True
End Sub

Public Sub EndOfflineDataRefresh(refreshState As String)
	LastOfflineDataRefreshState = refreshState
	IsOfflineDataRefreshInProgress = False
End Sub

Public Sub BeginTrackCacheRefresh As Boolean
	If IsTrackCacheRefreshInProgress Then Return False
	IsTrackCacheRefreshInProgress = True
	Return True
End Sub

Public Sub EndTrackCacheRefresh
	IsTrackCacheRefreshInProgress = False
End Sub

Public Sub EnterPolicyPause(connectionMode As String)
	IsPlaybackPausedByPolicy = True
	ResumePlaybackWhenServerAllows = True
	IsLocalPlaybackMode = (connectionMode = "offline")
End Sub

Public Sub ClearPolicyPause
	IsPlaybackPausedByPolicy = False
End Sub

Public Sub ClearPolicyPauseAndResumeRequest
	IsPlaybackPausedByPolicy = False
	ResumePlaybackWhenServerAllows = False
End Sub

Public Sub EnterLocalPlayback
	IsPlaybackPausedByPolicy = False
	IsLocalPlaybackMode = True
End Sub

Public Sub ApplyTemporaryMode(mode As String)
	IsPlaybackPausedByPolicy = False
	ResumePlaybackWhenServerAllows = False
	IsLocalPlaybackMode = (mode = "offline")
End Sub

Public Sub SetLocalFallbackReady(fallbackReady As Boolean)
	IsPlaybackPausedByPolicy = False
	IsLocalPlaybackMode = fallbackReady
End Sub

Public Sub SetRemoteDataReady
	IsLocalPlaybackMode = False
End Sub
