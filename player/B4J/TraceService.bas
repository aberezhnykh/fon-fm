B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

Sub Class_Globals
	Private storageDir As String
	Private debugResponsesDir As String
	Private traceLogs As List
	Private serverSnapshots As List
	Private traceLogLimit As Int
	Private serverSnapshotLimit As Int
End Sub

Public Sub Initialize(storageDirValue As String, debugResponsesDirValue As String, traceLogLimitValue As Int, serverSnapshotLimitValue As Int)
	storageDir = storageDirValue
	debugResponsesDir = debugResponsesDirValue
	traceLogLimit = traceLogLimitValue
	serverSnapshotLimit = serverSnapshotLimitValue
	traceLogs.Initialize
	serverSnapshots.Initialize
End Sub

Public Sub Trace(message As String)
	Dim entry As String = DateTime.Date(DateTime.Now) & " " & DateTime.Time(DateTime.Now) & " | " & message
	traceLogs.Add(entry)
	Do While traceLogs.Size > traceLogLimit
		traceLogs.RemoveAt(0)
	Loop
	Log(entry)
End Sub

Public Sub GetTraceText As String
	If traceLogs.IsInitialized = False Or traceLogs.Size = 0 Then Return ""
	Return JoinList(traceLogs, CRLF)
End Sub

Public Sub GetTraceList As List
	Dim copy As List
	copy.Initialize
	If traceLogs.IsInitialized = False Then Return copy
	For Each entry As String In traceLogs
		copy.Add(entry)
	Next
	Return copy
End Sub

Public Sub GetServerTraceText As String
	If serverSnapshots.IsInitialized = False Or serverSnapshots.Size = 0 Then Return ""
	Dim lines As List
	lines.Initialize
	For Each entry As Map In serverSnapshots
		lines.Add(entry.GetDefault("Header", ""))
		lines.Add(entry.GetDefault("Body", ""))
		lines.Add("")
	Next
	Return JoinList(lines, CRLF)
End Sub

Public Sub GetServerTraceList As List
	Dim copy As List
	copy.Initialize
	If serverSnapshots.IsInitialized = False Then Return copy
	For Each entry As Map In serverSnapshots
		copy.Add(CloneMap(entry))
	Next
	Return copy
End Sub

Public Sub SaveServerSnapshot(method As String, url As String, success As Boolean, body As String, errorMessage As String)
	Dim timestamp As String = DateTime.Date(DateTime.Now) & " " & DateTime.Time(DateTime.Now)
	Dim header As String = timestamp & " | " & method & " | success=" & success & " | " & url
	If errorMessage <> "" Then header = header & " | error=" & errorMessage
	Dim entry As Map
	entry.Initialize
	entry.Put("Timestamp", timestamp)
	entry.Put("Method", method)
	entry.Put("Url", url)
	entry.Put("Success", success)
	entry.Put("Error", errorMessage)
	entry.Put("Body", body)
	entry.Put("Header", header)
	serverSnapshots.Add(entry)
	Do While serverSnapshots.Size > serverSnapshotLimit
		serverSnapshots.RemoveAt(0)
	Loop
	WriteServerSnapshotFile(entry)
	CleanupServerSnapshotFiles
End Sub

Private Sub WriteServerSnapshotFile(entry As Map)
	Try
		EnsureDirectory(storageDir)
		EnsureDirectory(debugResponsesDir)
		Dim stamp As String = Regex.Replace("[^0-9]", entry.GetDefault("Timestamp", ""), "")
		If stamp = "" Then stamp = "" & DateTime.Now
		Dim name As String = stamp & "_" & entry.GetDefault("Method", "REQ") & ".txt"
		Dim text As String = entry.GetDefault("Header", "") & CRLF & CRLF & entry.GetDefault("Body", "")
		File.WriteString(debugResponsesDir, name, text)
	Catch
		Trace("Не удалось записать snapshot сервера. " & LastException.Message)
	End Try
End Sub

Private Sub CleanupServerSnapshotFiles
	Try
		If File.Exists(debugResponsesDir, "") = False Then Return
		Dim listedFiles As List = File.ListFiles(debugResponsesDir)
		If listedFiles.IsInitialized = False Or listedFiles.Size <= serverSnapshotLimit Then Return
		Dim files As List
		files.Initialize
		For Each fileName As String In listedFiles
			files.Add(fileName)
		Next
		files.Sort(True)
		Do While files.Size > serverSnapshotLimit
			Dim fileName As String = files.Get(0)
			File.Delete(debugResponsesDir, fileName)
			files.RemoveAt(0)
		Loop
	Catch
		Trace("Не удалось очистить старые snapshots сервера. " & LastException.Message)
	End Try
End Sub

Private Sub EnsureDirectory(path As String)
	Dim joFile As JavaObject
	joFile.InitializeNewInstance("java.io.File", Array As Object(path))
	joFile.RunMethod("mkdirs", Null)
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

Private Sub CloneMap(source As Map) As Map
	Dim copy As Map
	copy.Initialize
	If source.IsInitialized = False Then Return copy
	For Each key As Object In source.Keys
		copy.Put(key, source.Get(key))
	Next
	Return copy
End Sub
