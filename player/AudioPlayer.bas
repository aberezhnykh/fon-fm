Sub Class_Globals
	Private Const STATE_STOPPED = 0, STATE_LOADING = 1, STATE_READY = 2, STATE_PLAYING = 3 As Int
	#If B4j
	Private Player As MediaPlayer
	Private jo As JavaObject
	#End If
	Private Event As String
	Private Target As Object
	Private TimeupdateTimer As Timer
	Private LastPosition As Long
	Private CheckTimer As Timer
	Private LoadTimer As Timer
	Private PlayerState As Int
	Private MaxVolume As Int
End Sub

Public Sub Initialize (EventName As String, TargetModule As Object)
	Event = EventName
	Target = TargetModule
	LoadTimer.Initialize("LoadTimer", 10 * DateTime.TicksPerSecond)
	CheckTimer.Initialize("CheckTimer", 10 * DateTime.TicksPerSecond)
	TimeupdateTimer.Initialize("TimeupdateTimer", 250)
End Sub

Public Sub LoadUrl(Url As String, Volume As Int)
	LoadTimer.Enabled = False
	TimeupdateTimer.Enabled = False
	Reset
	LoadTimer.Interval = 10 * DateTime.TicksPerSecond
	LoadTimer.Enabled = True
	PlayerState = STATE_LOADING
	MaxVolume = Volume
	Try
		Player.Initialize("Player", Url)
		jo = Player
		jo.RunMethod("setOnError", Array As Object(jo.CreateEventFromUI("java.lang.Runnable", "Error", False)))
		jo.RunMethod("setOnReady", Array As Object(jo.CreateEventFromUI("java.lang.Runnable", "Ready", False)))
	Catch
		NotifyError(LastException.Message)
	End Try
End Sub

Public Sub Play
	If PlayerState <> STATE_READY Then Return
	PlayerState = STATE_PLAYING
	LastPosition = 0
	CheckTimer.Enabled = True
	TimeupdateTimer.Enabled = True
	Player.Volume = MaxVolume / 100
	Player.Play
End Sub

Public Sub Stop(FadeTime As Int)
	PlayerState = STATE_STOPPED
	LastPosition = 0
	CheckTimer.Enabled = False
	TimeupdateTimer.Enabled = False
	If Player.IsInitialized = False Then Return
	If PlayerState = STATE_STOPPED Then
		Player.Volume = 0
		Player.Stop
	End If
End Sub

Public Sub Reset
	PlayerState = STATE_STOPPED
	LastPosition = 0
	LoadTimer.Enabled = False
	CheckTimer.Enabled = False
	TimeupdateTimer.Enabled = False
	If Player.IsInitialized Then
		Player.Volume = 0
		Player.Stop
		jo.RunMethod("dispose", Null)
	End If
End Sub

Public Sub IsStopped As Boolean
	Return PlayerState = STATE_STOPPED
End Sub

Public Sub IsLoading As Boolean
	Return PlayerState = STATE_LOADING
End Sub

Public Sub IsReady As Boolean
	Return PlayerState = STATE_READY
End Sub

Public Sub IsPlaying As Boolean
	Return PlayerState = STATE_PLAYING
End Sub

Public Sub Position As Long
	If PlayerState = STATE_PLAYING Then
		Return Player.Position
	End If
	Return 0
End Sub

Public Sub Duration As Long
	If PlayerState = STATE_READY Or PlayerState = STATE_PLAYING Then
		Return Player.Duration
	End If
	Return 0
End Sub

Private Sub Ready_Event(MethodName As String, Args() As Object)
	PlayerState = STATE_READY
	LoadTimer.Enabled = False
	CallIfExists(Event & "_Ready")
End Sub

Private Sub Error_Event(MethodName As String, Args() As Object)
	Dim msg As String = ""
	Try
		msg = jo.RunMethod("getError", Null)
	Catch
		msg = LastException.Message
	End Try
	NotifyError(msg)
End Sub

Private Sub NotifyError(Message As String)
	Reset
	Dim subName As String = Event & "_Error"
	If SubExists(Target, subName) Then
		CallSubDelayed2(Target, subName, Message)
	End If
End Sub

Private Sub CallIfExists(SubName As String)
	If SubExists(Target, SubName) Then
		CallSubDelayed(Target, SubName)
	End If
End Sub

Private Sub TimeupdateTimer_Tick
	If Duration > 40000 Then
		If Position > Duration - 3000 Then
			Stop(3000)
			CallIfExists(Event & "_Complete")
		Else
			CallIfExists(Event & "_Timeupdate")
		End If
	Else If Duration > 300 Then
		If Position > Duration - 300 Then
			Stop(300)
			CallIfExists(Event & "_Complete")
		Else
			CallIfExists(Event & "_Timeupdate")
		End If
	End If
End Sub

Private Sub CheckTimer_Tick
	If Position = LastPosition Then
		NotifyError("Silence detected 1")
	Else
		LastPosition = Position
	End If
End Sub

Private Sub LoadTimer_Tick
	LoadTimer.Enabled = False
	NotifyError("Track loading timeout expired")
End Sub
