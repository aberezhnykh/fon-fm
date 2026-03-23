B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private mainPage As B4XMainPage
End Sub

Public Sub Initialize(target As B4XMainPage)
	mainPage = target
End Sub

Private Sub Trace(message As String)
	mainPage.PlaybackFacade_Trace(message)
End Sub

Public Sub StartFirstTrack(mode As String) As ResumableSub
	Trace("сценарий старт запрос mode=" & mode)
	Wait For (mainPage.Facade_StartFirstTrackCore(mode)) Complete (started As Boolean)
	Return started
End Sub

Public Sub LoadNextAndPlay As ResumableSub
	Trace("сценарий переход запрос mode=load_next_and_play")
	Wait For (mainPage.Facade_LoadNextAndPlayCore) Complete (advanced As Boolean)
	Return advanced
End Sub

Public Sub DispatchPlaybackAdvance(initiator As String, allowLoad As Boolean) As ResumableSub
	Trace("сценарий переход запрос initiator=" & initiator & " allowLoad=" & allowLoad)
	Wait For (mainPage.Facade_DispatchPlaybackAdvanceCore(initiator, allowLoad)) Complete (advanced As Boolean)
	Return advanced
End Sub

Public Sub PrepareNextPlayable As ResumableSub
	Wait For (mainPage.Facade_PrepareNextPlayableCore) Complete (prepared As Boolean)
	Return prepared
End Sub

Public Sub AdvanceAfterComplete(audioKey As String) As ResumableSub
	Trace("сценарий переход запрос initiator=audio_complete:" & audioKey)
	Wait For (DispatchPlaybackAdvance("audio_complete:" & audioKey, True)) Complete (advanced As Boolean)
	Return advanced
End Sub

Public Sub AdvanceAfterError(audioKey As String) As ResumableSub
	Trace("сценарий переход запрос initiator=audio_error_recovery:" & audioKey)
	Wait For (DispatchPlaybackAdvance("audio_error_recovery:" & audioKey, True)) Complete (advanced As Boolean)
	Return advanced
End Sub

Public Sub StopPlayback As ResumableSub
	Trace("сценарий stop запрос")
	Wait For (mainPage.Facade_StopPlayerCore) Complete (stopped As Boolean)
	Return stopped
End Sub

Public Sub PausePlayback(reason As String, connectionMode As String)
	Trace("сценарий pause запрос mode=" & connectionMode)
	mainPage.Facade_PausePlaybackCore(reason, connectionMode)
End Sub

Public Sub ResumePlaybackAfterPolicyPause As ResumableSub
	Trace("сценарий resume запрос reason=policy_pause")
	Wait For (mainPage.Facade_ResumePlaybackAfterPolicyPauseCore) Complete (resumed As Boolean)
	Return resumed
End Sub

Public Sub CompleteStartupSequence
	mainPage.Facade_CompleteStartupSequenceCore
End Sub
