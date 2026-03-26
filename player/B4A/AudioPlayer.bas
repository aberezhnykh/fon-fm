B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Android AudioPlayer implementation for shared playback orchestration.

Sub Class_Globals
	Private Const STATE_STOPPED As Int = 0
	Private Const STATE_LOADING As Int = 1
	Private Const STATE_READY As Int = 2
	Private Const STATE_PLAYING As Int = 3
	Private Const FADE_NONE As Int = 0
	Private Const FADE_IN As Int = 1
	Private Const FADE_OUT As Int = 2
	Private Const CHECK_TIMER_INTERVAL_MS As Int = 2000
	Private Const SILENCE_STALL_THRESHOLD As Int = 3

	Private player As JavaObject
	Private eventName As String
	Private targetPage As Object
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
	Private stalledCheckCount As Int
	Private currentLoadToken As Long
	Private activeEventLoadToken As Long
	Private audioKey As String
	Private durationValue As Long
	Private playStartedAtUs As Long
	Private firstProgressLogged As Boolean
End Sub

Public Sub Initialize(eventNameValue As String, targetPageValue As Object)
	eventName = eventNameValue
	targetPage = targetPageValue
	audioKey = ResolveAudioKey(eventName)
	loadTimer.Initialize("LoadTimer", 10 * DateTime.TicksPerSecond)
	checkTimer.Initialize("CheckTimer", CHECK_TIMER_INTERVAL_MS)
	timeUpdateTimer.Initialize("TimeUpdateTimer", 250)
	fadeTimer.Initialize("FadeTimer", 40)
	TraceAudio("Initialize")
End Sub

Public Sub LoadUrl(url As String, volume As Double)
	Dim startedAt As Long = DateTime.Now
	Reset
	currentLoadToken = currentLoadToken + 1
	activeEventLoadToken = currentLoadToken
	loadTimer.Interval = 10 * DateTime.TicksPerSecond
	loadTimer.Enabled = True
	playerState = STATE_LOADING
	maxVolume = Max(0, Min(1, volume))
	TraceAudio("LoadUrl. volume=" & NumberFormat2(maxVolume, 1, 3, 3, False) & ", url=" & url)
	Try
		CreatePlayerInstance
		BindPlayerListeners
		SetPlayerDataSource(url)
		player.RunMethod("prepareAsync", Null)
	Catch
		NotifyError(LastException.Message)
	End Try
	LogSlowOperation("LoadUrl", startedAt)
End Sub

Public Sub Play
	PlayWithFade(0)
End Sub

Public Sub PlayWithFade(fadeTimeMs As Int)
	If playerState <> STATE_READY Then
		TraceInternalError("play_with_fade_not_ready state=" & playerState)
		Return
	End If
	playerState = STATE_PLAYING
	lastPosition = 0
	stalledCheckCount = 0
	checkTimer.Enabled = True
	timeUpdateTimer.Enabled = True
	playStartedAtUs = MonotonicMicros
	firstProgressLogged = False
	If fadeTimeMs > 0 Then
		SetPlayerVolume(0)
	Else
		SetPlayerVolume(maxVolume)
	End If
	player.RunMethod("start", Null)
	TraceAudio("PlayWithFade. fadeTimeMs=" & fadeTimeMs & ", maxVolume=" & NumberFormat2(maxVolume, 1, 3, 3, False))
	If fadeTimeMs > 0 Then StartFade(FADE_IN, maxVolume, fadeTimeMs)
End Sub

Public Sub Stop(fadeTimeMs As Int)
	Dim startedAt As Long = DateTime.Now
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	lastPosition = 0
	stalledCheckCount = 0
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
	LogSlowOperation("Stop", startedAt)
End Sub

Public Sub Reset
	Dim startedAt As Long = DateTime.Now
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	lastPosition = 0
	stalledCheckCount = 0
	currentVolume = 0
	durationValue = 0
	activeEventLoadToken = 0
	playStartedAtUs = 0
	firstProgressLogged = False
	playerState = STATE_STOPPED
	ReleasePlayerInstance
	LogSlowOperation("Reset", startedAt)
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
		Return player.RunMethod("getCurrentPosition", Null)
	Catch
		Return 0
	End Try
End Sub

Public Sub Duration As Long
	If player.IsInitialized = False Then Return durationValue
	Try
		durationValue = player.RunMethod("getDuration", Null)
		Return durationValue
	Catch
		Return durationValue
	End Try
End Sub

Private Sub NativePrepared_Event(MethodName As String, Args() As Object) As Object
	If activeEventLoadToken <> currentLoadToken Then
		TraceAudio("Prepared ignored. stale_token=" & activeEventLoadToken & " current=" & currentLoadToken)
		Return Null
	End If
	playerState = STATE_READY
	loadTimer.Enabled = False
	durationValue = Duration
	TraceAudio("Ready")
	CallSub2(targetPage, "AudioPlayer_Ready", audioKey)
	Return Null
End Sub

Private Sub NativeComplete_Event(MethodName As String, Args() As Object) As Object
	If activeEventLoadToken <> currentLoadToken Then
		TraceAudio("Complete ignored. stale_token=" & activeEventLoadToken & " current=" & currentLoadToken)
		Return Null
	End If
	If playerState = STATE_STOPPED Then Return Null
	loadTimer.Enabled = False
	checkTimer.Enabled = False
	timeUpdateTimer.Enabled = False
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	currentVolume = 0
	stalledCheckCount = 0
	playerState = STATE_STOPPED
	TraceAudio("Complete")
	CallSub2(targetPage, "AudioPlayer_Complete", audioKey)
	Return Null
End Sub

Private Sub NativeError_Event(MethodName As String, Args() As Object) As Object
	If activeEventLoadToken <> currentLoadToken Then
		TraceAudio("Error ignored. stale_token=" & activeEventLoadToken & " current=" & currentLoadToken)
		Return True
	End If
	Dim whatCode As Int = 0
	Dim extraCode As Int = 0
	Try
		whatCode = Args(1)
		extraCode = Args(2)
	Catch
		TraceAudio("NativeError_Event args parse failed: " & LastException.Message)
	End Try
	NotifyError("MediaPlayer error what=" & whatCode & " extra=" & extraCode)
	Return True
End Sub

Private Sub TimeUpdateTimer_Tick
	If playerState <> STATE_PLAYING Then Return
	If activeEventLoadToken <> currentLoadToken Then Return
	If firstProgressLogged = False Then
		Dim positionNow As Long = Position
		If positionNow > 0 Then
			firstProgressLogged = True
			Dim deltaUs As Long = 0
			If playStartedAtUs > 0 Then deltaUs = MonotonicMicros - playStartedAtUs
			TraceAudio("FirstProgress. positionMs=" & positionNow & ", deltaUs=" & deltaUs & ", deltaMs=" & Round(deltaUs / 1000))
		End If
	End If
	CallSub2(targetPage, "AudioPlayer_Timeupdate", audioKey)
End Sub

Private Sub CheckTimer_Tick
	If playerState <> STATE_PLAYING Then Return
	Dim positionNow As Long = Position
	If positionNow > lastPosition Then
		lastPosition = positionNow
		stalledCheckCount = 0
		Return
	End If
	Dim durationNow As Long = Duration
	If durationNow > 0 And positionNow >= Max(0, durationNow - 2000) Then Return
	stalledCheckCount = stalledCheckCount + 1
	If stalledCheckCount < SILENCE_STALL_THRESHOLD Then Return
	NotifyError("Silence detected " & SILENCE_STALL_THRESHOLD)
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
	If fadeMode = FADE_NONE And nextVolume <= 0 Then StopImmediately
End Sub

Private Sub StartFade(modeValue As Int, targetVolume As Double, fadeTimeMs As Int)
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
	fadeMode = modeValue
	fadeTargetVolume = targetVolume
	fadeStepVolume = (targetVolume - currentVolume) / steps
	fadeTimer.Enabled = True
End Sub

Private Sub SetPlayerVolume(volumeValue As Double)
	currentVolume = Max(0, Min(1, volumeValue))
	If player.IsInitialized = False Then Return
	Try
		Dim leftVolume As Float = currentVolume
		Dim rightVolume As Float = currentVolume
		player.RunMethod("setVolume", Array As Object(leftVolume, rightVolume))
	Catch
		TraceInternalError("set_volume")
	End Try
End Sub

Private Sub StopImmediately
	Dim startedAt As Long = DateTime.Now
	fadeTimer.Enabled = False
	fadeMode = FADE_NONE
	playerState = STATE_STOPPED
	currentVolume = 0
	TraceAudio("StopImmediately")
	If player.IsInitialized Then
		Try
			player.RunMethod("stop", Null)
		Catch
			TraceInternalError("stop_immediately")
		End Try
	End If
	ReleasePlayerInstance
	LogSlowOperation("StopImmediately", startedAt)
End Sub

Private Sub CreatePlayerInstance
	player.InitializeNewInstance("android.media.MediaPlayer", Null)
	Try
		Dim attrsBuilder As JavaObject
		attrsBuilder.InitializeNewInstance("android.media.AudioAttributes$Builder", Null)
		attrsBuilder.RunMethod("setUsage", Array As Object(1))
		attrsBuilder.RunMethod("setContentType", Array As Object(2))
		player.RunMethod("setAudioAttributes", Array As Object(attrsBuilder.RunMethod("build", Null)))
	Catch
		TraceInternalError("set_audio_attributes")
	End Try
End Sub

Private Sub BindPlayerListeners
	Dim preparedListener As Object = player.CreateEventFromUI("android.media.MediaPlayer$OnPreparedListener", "NativePrepared", Null)
	Dim completionListener As Object = player.CreateEventFromUI("android.media.MediaPlayer$OnCompletionListener", "NativeComplete", Null)
	Dim errorListener As Object = player.CreateEventFromUI("android.media.MediaPlayer$OnErrorListener", "NativeError", True)
	player.RunMethod("setOnPreparedListener", Array As Object(preparedListener))
	player.RunMethod("setOnCompletionListener", Array As Object(completionListener))
	player.RunMethod("setOnErrorListener", Array As Object(errorListener))
End Sub

Private Sub SetPlayerDataSource(url As String)
	Dim normalizedUrl As String = url
	If normalizedUrl.StartsWith("file:") Then
		Dim uri As JavaObject
		uri.InitializeStatic("android.net.Uri")
		Dim parsed As JavaObject = uri.RunMethod("parse", Array As Object(normalizedUrl))
		normalizedUrl = parsed.RunMethod("getPath", Null)
	End If
	If normalizedUrl.StartsWith("content:") Then
		Dim context As JavaObject
		context.InitializeContext
		Dim uriContent As JavaObject
		uriContent.InitializeStatic("android.net.Uri")
		Dim parsedContent As JavaObject = uriContent.RunMethod("parse", Array As Object(normalizedUrl))
		player.RunMethod("setDataSource", Array As Object(context, parsedContent))
	Else
		player.RunMethod("setDataSource", Array As Object(normalizedUrl))
	End If
End Sub

Private Sub ReleasePlayerInstance
	If player.IsInitialized = False Then Return
	Try
		player.RunMethod("reset", Null)
	Catch
		TraceInternalError("release_reset")
	End Try
	Try
		player.RunMethod("release", Null)
	Catch
		TraceInternalError("release_release")
	End Try
	Dim emptyPlayer As JavaObject
	player = emptyPlayer
End Sub


Private Sub NotifyError(message As String)
	TraceAudio("NotifyError. message=" & message)
	Reset
	CallSub3(targetPage, "AudioPlayer_Error", audioKey, message)
End Sub

Private Sub LogSlowOperation(operationName As String, startedAt As Long)
	Dim elapsed As Long = DateTime.Now - startedAt
	If elapsed < 50 Then Return
	TraceDiagnostic("audio slow op=" & eventName & "." & operationName & " elapsedMs=" & elapsed & " state=" & playerState)
End Sub

Private Sub TraceInternalError(context As String)
	If SubExists(targetPage, "TraceLog") Then CallSub2(targetPage, "TraceLog", "ошибка аудио internal context=" & context & " message=" & LastException.Message)
End Sub

Private Sub TraceDiagnostic(message As String)
	If SubExists(targetPage, "TraceLog") Then CallSub2(targetPage, "TraceLog", message)
End Sub

Private Sub TraceAudio(message As String)
	If SubExists(targetPage, "TraceLog") Then CallSub2(targetPage, "TraceLog", "[" & eventName & "] " & message)
End Sub

Private Sub ResolveAudioKey(nameValue As String) As String
	If nameValue.ToLowerCase.Contains("secondary") Then Return "secondary"
	Return "primary"
End Sub

Private Sub MonotonicMicros As Long
	Dim jo As JavaObject
	jo.InitializeStatic("java.lang.System")
	Return jo.RunMethod("nanoTime", Null) / 1000
End Sub
