B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Состояние retry/fallback политики.
' Хранит текущие задержки повторов для local/server режимов и признаки деградации media path.

Sub Class_Globals
	Public LocalRetryDelay As Int
	Public ServerRetryDelay As Int
	Public DispatchRetryAfter As Int
	Public IsMediaPathDegraded As Boolean
End Sub

Public Sub Initialize(localRetryInitial As Int, serverRetryInitial As Int)
	Reset(localRetryInitial, serverRetryInitial)
End Sub

' Сбрасывает backoff и media-path flags к начальному состоянию.
Public Sub Reset(localRetryInitial As Int, serverRetryInitial As Int)
	LocalRetryDelay = localRetryInitial
	ServerRetryDelay = serverRetryInitial
	DispatchRetryAfter = 0
	IsMediaPathDegraded = False
End Sub

' Возвращает текущую задержку повтора и одновременно продвигает backoff для следующей попытки.
Public Sub ResolveRetryDelay(mode As String, delayMs As Int, localRetryMax As Int, serverRetryMax As Int, blockedRetryDelay As Int) As Int
	If delayMs > 0 Then Return delayMs
	If mode = "offline" Then
		Dim delay As Int = LocalRetryDelay
		LocalRetryDelay = Min(LocalRetryDelay * 2, localRetryMax)
		Return delay
	End If
	If mode = "blocked" Then Return blockedRetryDelay
	Dim delayServer As Int = ServerRetryDelay
	ServerRetryDelay = Min(ServerRetryDelay * 2, serverRetryMax)
	Return delayServer
End Sub

Public Sub ResetRetryDelays(localRetryInitial As Int, serverRetryInitial As Int)
	LocalRetryDelay = localRetryInitial
	ServerRetryDelay = serverRetryInitial
End Sub

Public Sub ClearDispatchRetryAfter
	DispatchRetryAfter = 0
End Sub

Public Sub SetDispatchRetryAfter(value As Int)
	DispatchRetryAfter = Max(0, value)
End Sub

Public Sub ConsumeDispatchRetryAfter As Int
	Dim value As Int = DispatchRetryAfter
	DispatchRetryAfter = 0
	Return value
End Sub

Public Sub SetMediaPathDegraded(value As Boolean)
	IsMediaPathDegraded = value
End Sub

' Обновляет degraded flag по результату sync/download, чтобы orchestration мог мягко менять поведение без panic-stop.
Public Sub UpdateMediaPathDegradedFromCacheSync(downloaded As Boolean, networkFailure As Boolean) As String
	Dim previous As Boolean = IsMediaPathDegraded
	If downloaded Then
		IsMediaPathDegraded = False
	Else If networkFailure Then
		IsMediaPathDegraded = True
	End If
	If previous = False And IsMediaPathDegraded Then Return "entered"
	If previous = True And IsMediaPathDegraded = False Then Return "recovered"
	Return ""
End Sub
