B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=CodeModule
Version=10.5
@EndOfDesignText@

' Платформенный bridge для общего B4X-кода.
' Держит в одном месте различия storage / platform info / staged updates.

Sub Process_Globals
End Sub

Public Sub ResolveStorageDir(appId As String) As String
	#If B4A
	Return File.Combine(File.DirInternal, appId)
	#Else If B4J
	Return File.DirData(appId)
	#Else
	Return File.DirApp
	#End If
End Sub

Public Sub ResolveUpdateStageDir(storageDir As String) As String
	#If B4A
	Return File.Combine(storageDir, "updates")
	#Else If B4J
	Return File.DirApp
	#Else
	Return storageDir
	#End If
End Sub

Public Sub IsStagedUpdateReady(updateDir As String, updateFileName As String) As Boolean
	Return File.Exists(updateDir, updateFileName)
End Sub

Public Sub IsHostedRuntime As Boolean
	#If B4J
	Return Main.IsHosted
	#Else
	Return False
	#End If
End Sub

Public Sub RequestStagedUpdateApply(updateDir As String, updateFileName As String) As Boolean
	If File.Exists(updateDir, updateFileName) = False Then Return False
	#If B4J
	If Main.IsHosted = False Then Return False
	Main.RequestHostApplyUpdate
	Return True
	#Else If B4A
	Starter.QueueAppUpdateInstall(updateDir, updateFileName)
	Return True
	#Else
	Return False
	#End If
End Sub

Public Sub ResolveFreeRamMbText As String
	Try
		Dim runtime As JavaObject
		runtime.InitializeStatic("java.lang.Runtime")
		Dim currentRuntime As JavaObject = runtime.RunMethod("getRuntime", Null)
		Dim freeBytes As Long = currentRuntime.RunMethod("freeMemory", Null)
		Dim totalBytes As Long = currentRuntime.RunMethod("totalMemory", Null)
		Dim maxBytes As Long = currentRuntime.RunMethod("maxMemory", Null)
		Dim availableBytes As Long = freeBytes + Max(0, maxBytes - totalBytes)
		Return "" & Floor(availableBytes / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Public Sub ResolveTotalRamMbText As String
	Try
		Dim runtime As JavaObject
		runtime.InitializeStatic("java.lang.Runtime")
		Dim currentRuntime As JavaObject = runtime.RunMethod("getRuntime", Null)
		Dim maxBytes As Long = currentRuntime.RunMethod("maxMemory", Null)
		Return "" & Floor(maxBytes / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Public Sub ResolveFreeDiskMbText(storageDir As String) As String
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(storageDir))
		Return "" & Floor(fileObject.RunMethod("getUsableSpace", Null) / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Public Sub ResolveTotalDiskMbText(storageDir As String) As String
	Try
		Dim fileObject As JavaObject
		fileObject.InitializeNewInstance("java.io.File", Array As Object(storageDir))
		Return "" & Floor(fileObject.RunMethod("getTotalSpace", Null) / 1024 / 1024)
	Catch
		Return "unknown"
	End Try
End Sub

Public Sub ResolveDeviceTraceName As String
	#If B4A
	Try
		Dim buildClass As JavaObject
		buildClass.InitializeStatic("android.os.Build")
		Dim manufacturer As String = NormalizeTextValue("" & buildClass.GetField("MANUFACTURER"))
		Dim model As String = NormalizeTextValue("" & buildClass.GetField("MODEL"))
		If manufacturer <> "" And model <> "" Then Return manufacturer & " " & model
		If model <> "" Then Return model
		If manufacturer <> "" Then Return manufacturer
	Catch
		Log("PlatformBridge.ResolveDeviceTraceName: " & LastException.Message)
	End Try
	Return "android"
	#Else If B4J
	Try
		Dim jo As JavaObject
		jo.InitializeStatic("java.lang.System")
		Dim computerName As String = NormalizeTextValue("" & jo.RunMethod("getenv", Array As Object("COMPUTERNAME")))
		If computerName <> "" Then Return computerName
	Catch
	End Try
	Return "unknown"
	#Else
	Return "unknown"
	#End If
End Sub

Public Sub ResolveClientPlatformText As String
	#If B4A
	Try
		Dim buildClass As JavaObject
		buildClass.InitializeStatic("android.os.Build")
		Dim versionClass As JavaObject
		versionClass.InitializeStatic("android.os.Build$VERSION")
		Dim releaseValue As String = NormalizeTextValue("" & versionClass.GetField("RELEASE"))
		Dim sdkValue As String = "" & versionClass.GetField("SDK_INT")
		Dim modelValue As String = NormalizeTextValue("" & buildClass.GetField("MODEL"))
		Dim parts As List
		parts.Initialize
		parts.Add("Android")
		If releaseValue <> "" Then parts.Add(releaseValue)
		If sdkValue <> "" Then parts.Add("SDK " & sdkValue)
		If modelValue <> "" Then parts.Add(modelValue)
		Return JoinList(parts, " ")
	Catch
		Return "Android"
	End Try
	#Else If B4J
	Try
		Dim jo As JavaObject
		jo.InitializeStatic("java.lang.System")
		Dim osName As String = NormalizeTextValue("" & jo.RunMethod("getProperty", Array As Object("os.name")))
		Dim osVersion As String = NormalizeTextValue("" & jo.RunMethod("getProperty", Array As Object("os.version")))
		Dim osArch As String = NormalizeTextValue("" & jo.RunMethod("getProperty", Array As Object("os.arch")))
		Dim parts As List
		parts.Initialize
		If osName <> "" Then parts.Add(osName)
		If osVersion <> "" Then parts.Add(osVersion)
		If osArch <> "" Then parts.Add(osArch)
		If parts.Size > 0 Then Return JoinList(parts, " ")
	Catch
	End Try
	Return "desktop"
	#Else
	Return "unknown"
	#End If
End Sub

Private Sub NormalizeTextValue(value As String) As String
	Dim normalized As String = value.Trim
	If normalized.ToLowerCase = "null" Then Return ""
	Return normalized
End Sub

Private Sub JoinList(values As List, separator As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To values.Size - 1
		If i > 0 Then sb.Append(separator)
		sb.Append(values.Get(i))
	Next
	Return sb.ToString
End Sub
