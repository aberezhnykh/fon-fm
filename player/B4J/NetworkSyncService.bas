B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Сетевой worker backend-синхронизации.
' Он не принимает playback-решений: только выполняет HTTP-запросы, собирает query и классифицирует сетевые результаты.

Sub Class_Globals
	Private stateStore As PlayerStateStore
End Sub

Public Sub Initialize(store As PlayerStateStore)
	stateStore = store
End Sub

' Загружает основной data snapshot backend и возвращает единый network outcome.
Public Sub FetchData(timeoutMs As Int) As ResumableSub
	Dim url As String = stateStore.DataUrlValue & "?" & BuildParams(CreateDataParams(stateStore.PlayerCodeValue, stateStore.DeviceIdValue, stateStore.TimezoneOffsetMinutesValue, stateStore.ClientOsNameValue))
	Wait For (FetchJsonWithTimeout(url, timeoutMs)) Complete (result As Map)
	Return result
End Sub

' Загружает следующий queue item / server response для playback.
Public Sub FetchNext(timeoutMs As Int, appVersion As String, startMode As String, playlistIndex As Int) As ResumableSub
	Dim url As String = stateStore.NextUrlValue & "?" & BuildParams(CreateNextParams(stateStore.PlayerCodeValue, stateStore.DeviceIdValue, stateStore.TimezoneOffsetMinutesValue, appVersion, startMode, playlistIndex))
	Wait For (FetchJsonWithTimeout(url, timeoutMs)) Complete (result As Map)
	Return result
End Sub

' Выполняет claim текущего player code / device pair через backend.
Public Sub SubmitClaim(timeoutMs As Int) As ResumableSub
	Dim url As String = stateStore.ClaimUrlValue & "?" & BuildParams(CreateClaimParams(stateStore.PlayerCodeValue, stateStore.DeviceIdValue, stateStore.TimezoneOffsetMinutesValue))
	Wait For (FetchJsonWithTimeout(url, timeoutMs)) Complete (result As Map)
	Return result
End Sub

' Классифицирует HTTP failures в offline/server для retry и temporary state.
Public Sub ClassifyHttpFailure(errorMessage As String) As String
	If IsOfflineHttpError(errorMessage) Then Return "offline"
	Return "server"
End Sub

' Минимальный backend health-check для принятия решения о temporary mode.
Public Sub CheckServiceAvailability(timeoutMs As Int) As ResumableSub
	Dim j As HttpJob
	j.Initialize("", Me)
	Dim params As Map = CreateDataParams(stateStore.PlayerCodeValue, stateStore.DeviceIdValue, stateStore.TimezoneOffsetMinutesValue, stateStore.ClientOsNameValue)
	params.Put("t", DateTime.Now)
	j.Download(stateStore.ServiceCheckUrlValue & "?" & BuildParams(params))
	stateStore.ApplyClientRequestHeaders(j)
	j.GetRequest.Timeout = timeoutMs
	Wait For (j) JobDone(j As HttpJob)
	Dim ok As Boolean = j.Success
	j.Release
	Return ok
End Sub

' Единая реакция на HTTP failure для data/history/next paths.
Public Sub LogHttpFailure(url As String, kind As String)
	stateStore.IncrementNetworkErrorCount
	Dim consecutiveErrors As Int = stateStore.GetConsecutiveNetworkErrors
	If url.Contains("/data") Then
		stateStore.TraceWarn("network", "data timeout", "retry=" & consecutiveErrors & " lastDataOkAgoSec=" & stateStore.SecondsAgoText(stateStore.GetLastDataOkAt))
	Else If url.Contains("/history") Then
		stateStore.TraceWarn("history", "ошибка отправки", "kind=" & kind)
	Else If url.Contains("/next") Then
		stateStore.TraceWarn("network", "ошибка очереди", "kind=" & kind)
	End If
End Sub

' Унифицированный JSON GET path для backend-запросов data/next/claim с общей HTTP classification.
Public Sub FetchJsonWithTimeout(url As String, timeoutMs As Int) As ResumableSub
	Dim result As Map
	result.Initialize
	result.Put("Success", False)
	result.Put("Kind", "server")
	result.Put("Data", Null)
	result.Put("ErrorMessage", "")
	Dim j As HttpJob
	j.Initialize("", Me)
	stateStore.TraceLog("http get начало timeoutMs=" & timeoutMs & " url=" & url)
	j.Download(url)
	stateStore.ApplyClientRequestHeaders(j)
	j.GetRequest.Timeout = timeoutMs
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Try
			Dim responseText As String = j.GetString
			stateStore.SaveServerSnapshot("GET", url, True, responseText, "")
			Dim parser As JSONParser
			parser.Initialize(responseText)
			result.Put("Data", parser.NextObject)
			result.Put("Success", True)
			result.Put("Kind", "")
			stateStore.TraceLog("http get итог success=true url=" & url)
		Catch
			result.Put("Kind", "server")
			result.Put("ErrorMessage", "bad_json")
			stateStore.SaveServerSnapshot("GET", url, False, "", "bad_json")
			stateStore.TraceLog("http get ошибка kind=server url=" & url & " message=bad_json")
		End Try
	Else
		Dim errorMessage As String = j.ErrorMessage
		result.Put("ErrorMessage", errorMessage)
		Dim failureKind As String = ClassifyHttpFailure(errorMessage)
		result.Put("Kind", failureKind)
		stateStore.SaveServerSnapshot("GET", url, False, "", errorMessage)
		LogHttpFailure(url, failureKind)
	End If
	j.Release
	Return result
End Sub

' Собирает query-параметры для /next с учётом режима старта и cursor state.
Public Sub CreateNextParams(playerCode As String, deviceId As String, timezoneOffsetMinutes As Int, appVersion As String, startMode As String, playlistIndex As Int) As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("tz", timezoneOffsetMinutes)
	params.Put("version", appVersion)
	If startMode = "manual" Or startMode = "auto" Then params.Put("start", startMode)
	If playlistIndex >= 0 Then params.Put("playlist", playlistIndex)
	Return params
End Sub

' Собирает query-параметры для /claim.
Public Sub CreateClaimParams(playerCode As String, deviceId As String, timezoneOffsetMinutes As Int) As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("tz", timezoneOffsetMinutes)
	Return params
End Sub

' Собирает query-параметры для /data.
Public Sub CreateDataParams(playerCode As String, deviceId As String, timezoneOffsetMinutes As Int, clientOsName As String) As Map
	Dim params As Map
	params.Initialize
	params.Put("player", playerCode)
	params.Put("device", deviceId)
	params.Put("tz", timezoneOffsetMinutes)
	params.Put("os", clientOsName)
	Return params
End Sub

' Унифицирует URL encoding query string для backend-запросов.
Public Sub BuildParams(params As Map) As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each key As String In params.Keys
		If sb.Length > 0 Then sb.Append("&")
		sb.Append(UrlEncode(key)).Append("=").Append(UrlEncode(params.Get(key)))
	Next
	Return sb.ToString
End Sub

Private Sub IsOfflineHttpError(errorMessage As String) As Boolean
	Dim messageLower As String = errorMessage.ToLowerCase
	Return messageLower.Contains("timed out") Or messageLower.Contains("timeout") Or messageLower.Contains("unknownhost") Or messageLower.Contains("unreachable") Or messageLower.Contains("refused") Or messageLower.Contains("reset") Or messageLower.Contains("failed to connect") Or messageLower.Contains("no route")
End Sub

Private Sub UrlEncode(value As Object) As String
	Dim jo As JavaObject
	jo.InitializeStatic("java.net.URLEncoder")
	Return jo.RunMethod("encode", Array As Object("" & value, "UTF-8"))
End Sub
