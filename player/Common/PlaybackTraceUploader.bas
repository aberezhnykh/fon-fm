B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Отправка trace-batch на backend.
' Не знает о playback, только о trace buffer, backend URL и transport result.

Sub Class_Globals
	Private stateStore As PlayerStateStore
	Private traceServiceRef As TraceService
	Private syncServiceRef As NetworkSyncService
	Private traceBaseUrl As String
	Private appVersionValue As String
	Private uploadInProgress As Boolean
End Sub

Public Sub Initialize(store As PlayerStateStore, traceSvc As TraceService, syncWorker As NetworkSyncService, baseUrl As String, appVersion As String)
	stateStore = store
	traceServiceRef = traceSvc
	syncServiceRef = syncWorker
	traceBaseUrl = baseUrl
	appVersionValue = appVersion
End Sub

Public Sub IsTraceUploadEnabled As Boolean
	Return stateStore.IsTraceUploadEnabled
End Sub

Public Sub IsUploadInProgress As Boolean
	Return uploadInProgress
End Sub

Public Sub FlushTraceBufferAsync
	Wait For (FlushTraceBuffer) Complete (unused As Boolean)
End Sub

Public Sub FlushTraceBuffer As ResumableSub
	If stateStore.PlayerCodeValue = "" Or stateStore.DeviceIdValue = "" Then Return False
	If uploadInProgress Then Return False
	If IsTraceUploadEnabled = False Then Return False
	Dim traceLines As List = traceServiceRef.BeginPendingTraceBatch
	If traceLines.IsInitialized = False Or traceLines.Size = 0 Then Return False
	Dim payload As String = JoinList(traceLines, CRLF)
	If payload.Trim = "" Then
		traceServiceRef.CancelPendingTraceBatch
		Return False
	End If
	uploadInProgress = True
	Dim queryParams As Map
	queryParams.Initialize
	queryParams.Put("player", stateStore.PlayerCodeValue)
	queryParams.Put("device", stateStore.DeviceIdValue)
	queryParams.Put("tz", stateStore.TimezoneOffsetMinutesValue)
	queryParams.Put("version", appVersionValue)
	Dim requestUrl As String = traceBaseUrl & "?" & syncServiceRef.BuildParams(queryParams)
	Dim j As HttpJob
	j.Initialize("", Me)
	j.PostString(requestUrl, payload)
	stateStore.ApplyClientRequestHeaders(j)
	j.GetRequest.Timeout = 5000
	j.GetRequest.SetContentType("text/plain; charset=utf-8")
	Wait For (j) JobDone(j As HttpJob)
	Dim success As Boolean = False
	If j.Success Then
		Dim responseText As String = ""
		Try
			responseText = j.GetString
		Catch
			responseText = ""
		End Try
		stateStore.SaveServerSnapshot("POST", requestUrl, True, responseText, "")
		success = True
	Else
		Dim statusCode As Int = 0
		Try
			statusCode = j.Response.StatusCode
		Catch
			statusCode = 0
		End Try
		If statusCode = 204 Then
			stateStore.SaveServerSnapshot("POST", requestUrl, True, "", "")
			success = True
		Else
			stateStore.SaveServerSnapshot("POST", requestUrl, False, "", j.ErrorMessage)
			stateStore.TraceWarn("network", "ошибка trace upload", "reason=" & syncServiceRef.ClassifyHttpFailure(j.ErrorMessage))
		End If
	End If
	If success Then
		traceServiceRef.ConfirmPendingTraceBatchSent
	Else
		traceServiceRef.CancelPendingTraceBatch
	End If
	j.Release
	uploadInProgress = False
	Return success
End Sub

Private Sub JoinList(items As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To items.Size - 1
		If i > 0 Then sb.Append(separator)
		sb.Append(items.Get(i))
	Next
	Return sb.ToString
End Sub
