B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private Const STATE_STOPPED = 0, STATE_LOADING = 1, STATE_READY = 2, STATE_PLAYING = 3 As Int
	Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OUT = 2 As Int

	Private player As MediaPlayer
	Private jo As JavaObject
	Private eventName As String
	Private targetModule As Object
	Private timeUpdateTimer As Timer
	Private lastPosition As Long
	Private checkTimer As Timer
	Private loadTimer As Timer
	Private fadeTimer As Timer
	Private playerState As Int
	Private maxVolume As Double
	Private fadeMode As Int
	Private fadeTargetVolume As Double
	Private fadeStepVolume As Double
	Private currentVolume As Double
End Sub

Public Sub Initialize (eventNameValue As String, targetModuleValue As Object)
	eventName = eventNameValue
	targetModule = targetModuleValue
	loadTimer.Initialize("LoadTimer", 10 * DateTime.TicksPerSecond)
	checkTimer.Initialize("CheckTimer", 10 * DateTime.TicksPerSecond)
	timeUpdateTimer.Initialize("TimeUpdateTimer", 250)
	fadeTimer.Initialize("FadeTimer", 40)
	TraceAudio("Initialize")
End Sub

Public Sub LoadUrl(url As String, volume As Double)
	Reset
	loadTimer.Interval = 10 * DateTime.TicksPerSecond
	loadTimer.Enabled = True
	playerState = STATE_LOADING
	maxVolume = Max(0, Min(1, volume))
	TraceAudio("LoadUrl. volume=" & NumberFormat2(maxVolume, 1, 3, 3, False) & ", url=" & url)
	Try
		player.Initialize("Player", url)
		jo = player
		jo.RunMethod("setOnError", Array As Object(jo.CreateEventFromUI("java.lang.Runnable", "Error", False)))
		jo.RunMethod("setOnReady", Array As Object(jo.CreateEventFromUI("java.lang.Runnable", "Ready", False)))
	Catch
		NotifyError(LastException.Message)
	End Try
End Sub

Public Sub Play
	PlayWithFade(0)
End Sub

Public Sub PlayWithFade(fadeTimeMs As Int)
	If playerState <> STATE_READY Then Return
	playerState = STATE_PLAYING
	lastPosition = 0
	checkTimer.Enabled = True
	timeUpdateTimer.Enabled = True
	player.Play
	TraceAudio("PlayWithFade. fadeTimeMs=" & fadeTimeMs & ", maxVolume=" & NumberFormat2(maxVolume, 1, 3, 3, False))
	If fadeTimeMs > 0 Then
		SetPlayerVolume(0)
		StartFade(FADE_IN, maxVolume, fadeTimeMs)
	Else
		SetPlayerVolume(maxVolume)
	End If
End Sub

Public Sub Stop(fadeTimeMs As Int)
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	lastPosition = 0
	If player.IsInitialized = False Then
		playerState = STATE_STOPPED
		TraceAudio("Stop ignored. player not initialized.")
		Return
	End If
	TraceAudio("Stop. fadeTimeMs=" & fadeTimeMs & ", currentVolume=" & NumberFormat2(currentVolume, 1, 3, 3, False))
	If fadeTimeMs > 0 And currentVolume > 0 Then
		playerState = STATE_STOPPED
		StartFade(FADE_OUT, 0, fadeTimeMs)
	Else
		StopImmediately
	End If
End Sub

Public Sub Reset
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	lastPosition = 0
	currentVolume = 0
	playerState = STATE_STOPPED
	If player.IsInitialized Then
		Try
			player.Volume = 0
			player.Stop
		Catch
			Log(LastException.Message)
		End Try
		If jo.IsInitialized Then
			Try
				jo.RunMethod("dispose", Null)
			Catch
				Log(LastException.Message)
			End Try
		End If
	End If
End Sub

Public Sub IsStopped As Boolean
	Return playerState = STATE_STOPPED
End Sub

Public Sub IsLoading As Boolean
	Return playerState = STATE_LOADING
End Sub

Public Sub IsReady As Boolean
	Return playerState = STATE_READY
End Sub

Public Sub IsPlaying As Boolean
	Return playerState = STATE_PLAYING
End Sub

Public Sub Position As Long
	If player.IsInitialized = False Then Return 0
	Try
		Return player.Position
	Catch
		Return 0
	End Try
End Sub

Public Sub Duration As Long
	If player.IsInitialized = False Then Return 0
	Try
		Return player.Duration
	Catch
		Return 0
	End Try
End Sub

Private Sub Ready_Event(methodName As String, args() As Object)
	playerState = STATE_READY
	loadTimer.Enabled = False
	TraceAudio("Ready")
	CallIfExists(eventName & "_Ready")
End Sub

Private Sub Error_Event(methodName As String, args() As Object)
	Dim msg As String = ""
	Try
		msg = jo.RunMethod("getError", Null)
	Catch
		msg = LastException.Message
	End Try
	TraceAudio("Error_Event. message=" & msg)
	NotifyError(msg)
End Sub

Private Sub Player_Complete
	If playerState = STATE_STOPPED Then Return
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	currentVolume = 0
	playerState = STATE_STOPPED
	TraceAudio("Complete")
	CallIfExists(eventName & "_Complete")
End Sub

Private Sub NotifyError(message As String)
	TraceAudio("NotifyError. message=" & message)
	Reset
	Dim subName As String = eventName & "_Error"
	If SubExists(targetModule, subName) Then
		CallSubDelayed2(targetModule, subName, message)
	End If
End Sub

Private Sub CallIfExists(subName As String)
	If SubExists(targetModule, subName) Then
		CallSubDelayed(targetModule, subName)
	End If
End Sub

Private Sub TimeUpdateTimer_Tick
	If playerState <> STATE_PLAYING Then Return
	CallIfExists(eventName & "_Timeupdate")
End Sub

Private Sub CheckTimer_Tick
	If playerState <> STATE_PLAYING Then Return
	Dim positionNow As Long = Position
	If positionNow = lastPosition Then
		NotifyError("Silence detected 1")
	Else
		lastPosition = positionNow
	End If
End Sub

Private Sub LoadTimer_Tick
	loadTimer.Enabled = False
	TraceAudio("Load timeout")
	NotifyError("Track loading timeout expired")
End Sub

Private Sub FadeTimer_Tick
	If player.IsInitialized = False Then
		fadeTimer.Enabled = False
		fadeMode = FADE_NONE
		Return
	End If
	Dim nextVolume As Double = currentVolume + fadeStepVolume
	If fadeMode = FADE_IN Then
		If nextVolume >= fadeTargetVolume Then
			nextVolume = fadeTargetVolume
			fadeTimer.Enabled = False
			fadeMode = FADE_NONE
		End If
	Else If fadeMode = FADE_OUT Then
		If nextVolume <= fadeTargetVolume Then
			nextVolume = fadeTargetVolume
			fadeTimer.Enabled = False
			fadeMode = FADE_NONE
		End If
	End If
	SetPlayerVolume(nextVolume)
	If fadeMode = FADE_NONE And nextVolume <= 0 Then
		StopImmediately
	End If
End Sub

Private Sub StartFade(mode As Int, targetVolume As Double, fadeTimeMs As Int)
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	If player.IsInitialized = False Then Return
	If fadeTimeMs <= 0 Then
		SetPlayerVolume(targetVolume)
		If targetVolume <= 0 Then StopImmediately
		Return
	End If
	Dim intervalMs As Int = Max(20, fadeTimer.Interval)
	Dim steps As Int = Max(1, Ceil(fadeTimeMs / intervalMs))
	fadeMode = mode
	fadeTargetVolume = targetVolume
	fadeStepVolume = (targetVolume - currentVolume) / steps
	fadeTimer.Enabled = True
End Sub

Private Sub SetPlayerVolume(volumeValue As Double)
	currentVolume = Max(0, Min(1, volumeValue))
	If player.IsInitialized = False Then Return
	Try
		player.Volume = currentVolume
	Catch
		Log(LastException.Message)
	End Try
End Sub

Private Sub StopImmediately
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	playerState = STATE_STOPPED
	currentVolume = 0
	TraceAudio("StopImmediately")
	If player.IsInitialized = False Then Return
	Try
		player.Volume = 0
		player.Stop
	Catch
		Log(LastException.Message)
	End Try
End Sub

Private Sub TraceAudio(message As String)
	Dim subName As String = "TraceLog"
	If SubExists(targetModule, subName) Then
		CallSubDelayed2(targetModule, subName, "[" & eventName & "] " & message)
	End If
End Sub
