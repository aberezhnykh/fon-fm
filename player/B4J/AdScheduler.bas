B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Локальный планировщик рекламных break-элементов.
' Сканирует offline ads на целевую минуту и при необходимости вставляет exact break в начало очереди.

Sub Class_Globals
	Private targetModule As Object
	Private traceSubName As String
	Private adLabelText As String
	Private lastScanMinuteKey As String = ""
	Private lastInjectedMinuteKey As String = ""
End Sub

Public Sub Initialize(targetModuleValue As Object, traceSubNameValue As String, adLabelTextValue As String)
	targetModule = targetModuleValue
	traceSubName = traceSubNameValue
	adLabelText = adLabelTextValue
End Sub

' Сбрасывает защиту от повторного scan/inject для минутного break-цикла.
Public Sub Reset
	lastScanMinuteKey = ""
	lastInjectedMinuteKey = ""
End Sub

' Проверяет target minute и, если для неё положен local break, вставляет break в начало очереди ровно один раз.
Public Sub ScanTargetMinute(offlineData As Map, playQueue As List, targetMinuteTimestamp As Long, force As Boolean, allowRegularAds As Boolean) As Boolean
	If offlineData.IsInitialized = False Then Return False
	If offlineData.GetDefault("ok", False) <> True Then Return False
	If playQueue.IsInitialized = False Then Return False
	Dim minuteKey As String = MinuteKeyFromTimestamp(targetMinuteTimestamp)
	If force = False And minuteKey = lastScanMinuteKey Then Return False
	lastScanMinuteKey = minuteKey
	Dim breakItem As Map = BuildBreakForMinute(offlineData, targetMinuteTimestamp, allowRegularAds)
	If breakItem.IsInitialized = False Or breakItem.Size = 0 Then Return False
	Dim breakAt As Long = ToLongDefault(breakItem.GetDefault("at", -1), -1)
	If breakAt <= 0 Then Return False
	If HasBreakScheduledAt(playQueue, breakAt) Then
		lastInjectedMinuteKey = minuteKey
		Return False
	End If
	If lastInjectedMinuteKey = minuteKey Then Return False
	playQueue.InsertAt(0, breakItem)
	lastInjectedMinuteKey = minuteKey
	Trace("Локальный break добавлен в начало очереди. minute=" & minuteKey & ", items=" & breakItem.GetDefault("items_count", 0) & ", queueSize=" & playQueue.Size)
	Return True
End Sub

' Собирает break item со списком ad queue items, которые должны стартовать в указанную минуту.
Private Sub BuildBreakForMinute(offlineData As Map, targetMinuteTimestamp As Long, allowRegularAds As Boolean) As Map
	Dim emptyBreak As Map
	emptyBreak.Initialize
	Dim ads As List = offlineData.GetDefault("ads", Null)
	If ads.IsInitialized = False Or ads.Size = 0 Then Return emptyBreak
	Dim targetTicks As Long = LocalTimestampToTicks(targetMinuteTimestamp)
	Dim todayKey As String = FormatIsoDate(targetTicks)
	Dim todayWeekday As String = IsoWeekdayFromTimestamp(targetTicks)
	Dim currentMinuteOfDay As Int = MinutesOfDayFromTimestamp(targetTicks)
	Dim dueItems As List
	dueItems.Initialize
	For Each adObject As Object In ads
		If adObject Is Map Then
			Dim ad As Map = adObject
			If AdMatchesCurrentMinute(ad, todayKey, todayWeekday, currentMinuteOfDay, allowRegularAds) Then
				dueItems.Add(CreateAdQueueItem(ad))
			End If
		End If
	Next
	If dueItems.Size = 0 Then Return emptyBreak
	Dim breakItem As Map
	breakItem.Initialize
	breakItem.Put("type", "break")
	breakItem.Put("exactly", True)
	breakItem.Put("at", targetMinuteTimestamp)
	breakItem.Put("items", dueItems)
	breakItem.Put("items_count", dueItems.Size)
	Return breakItem
End Sub

' Проверяет, подходит ли объявление под текущую минуту, даты, weekdays и exact/regular режим.
Private Sub AdMatchesCurrentMinute(ad As Map, todayKey As String, todayWeekday As String, currentMinuteOfDay As Int, allowRegularAds As Boolean) As Boolean
	If ad.IsInitialized = False Then Return False
	Dim isExact As Boolean = ad.GetDefault("exactly", False) = True
	If isExact = False And allowRegularAds = False Then Return False
	Dim startDate As String = ad.GetDefault("start", "")
	If startDate <> "" And startDate.CompareTo(todayKey) > 0 Then Return False
	Dim endDate As String = ad.GetDefault("end", "")
	If endDate <> "" And endDate.CompareTo(todayKey) < 0 Then Return False
	Dim weekdays As List = ad.GetDefault("weekdays", Null)
	If weekdays.IsInitialized And weekdays.Size > 0 Then
		Dim weekdayMatched As Boolean = False
		For Each weekdayObject As Object In weekdays
			If ("" & weekdayObject).Trim = todayWeekday Then
				weekdayMatched = True
				Exit
			End If
		Next
		If weekdayMatched = False Then Return False
	End If
	Dim baseMinute As Int = TimeStringToMinutes(ad.GetDefault("time", ""))
	If baseMinute < 0 Then Return False
	If currentMinuteOfDay < baseMinute Then Return False
	Dim intervalMinutes As Int = ToLongDefault(ad.GetDefault("interval", 0), 0)
	If intervalMinutes <= 0 Then Return currentMinuteOfDay = baseMinute
	Return ((currentMinuteOfDay - baseMinute) Mod intervalMinutes) = 0
End Sub

Private Sub CreateAdQueueItem(ad As Map) As Map
	Dim item As Map
	item.Initialize
	item.Put("type", "ad")
	item.Put("id", ad.GetDefault("id", ""))
	item.Put("title", ad.GetDefault("title", adLabelText))
	item.Put("duration", ToLongDefault(ad.GetDefault("duration", 0), 0))
	item.Put("gain", ad.GetDefault("gain", -3))
	item.Put("exactly", ad.GetDefault("exactly", False))
	Return item
End Sub

Private Sub HasBreakScheduledAt(playQueue As List, breakAt As Long) As Boolean
	If breakAt <= 0 Then Return False
	For Each itemObject As Object In playQueue
		If itemObject Is Map Then
			Dim item As Map = itemObject
			If item.GetDefault("type", "") = "break" And ToLongDefault(item.GetDefault("at", -1), -1) = breakAt Then Return True
		End If
	Next
	Return False
End Sub

Private Sub Trace(message As String)
	If SubExists(targetModule, traceSubName) Then
		CallSub2(targetModule, traceSubName, message)
	End If
End Sub

Private Sub FormatIsoDate(ticks As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim value As String = DateTime.Date(ticks)
	DateTime.DateFormat = previousDateFormat
	Return value
End Sub

Private Sub MinutesOfDayFromTimestamp(ticks As Long) As Int
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.TimeFormat = "HH:mm:ss"
	Dim timeValue As String = DateTime.Time(ticks)
	DateTime.TimeFormat = previousTimeFormat
	Dim parts() As String = Regex.Split(":", timeValue)
	If parts.Length < 2 Then Return 0
	Return parts(0) * 60 + parts(1)
End Sub

Private Sub IsoWeekdayFromTimestamp(ticks As Long) As String
	Dim jo As JavaObject
	jo.InitializeStatic("java.time.LocalDate")
	Dim instantClass As JavaObject
	instantClass.InitializeStatic("java.time.Instant")
	Dim zoneClass As JavaObject
	zoneClass.InitializeStatic("java.time.ZoneId")
	Dim instant As JavaObject = instantClass.RunMethod("ofEpochMilli", Array As Object(ticks))
	Dim zoneId As JavaObject = zoneClass.RunMethod("systemDefault", Null)
	Dim zonedDateTimeClass As JavaObject
	zonedDateTimeClass.InitializeStatic("java.time.ZonedDateTime")
	Dim zonedDateTime As JavaObject = zonedDateTimeClass.RunMethod("ofInstant", Array As Object(instant, zoneId))
	Dim localDate As JavaObject = zonedDateTime.RunMethod("toLocalDate", Null)
	Dim dayOfWeek As JavaObject = localDate.RunMethod("getDayOfWeek", Null)
	Return "" & dayOfWeek.RunMethod("getValue", Null)
End Sub

Private Sub MinuteKeyFromTimestamp(targetMinuteTimestamp As Long) As String
	Dim previousDateFormat As String = DateTime.DateFormat
	Dim previousTimeFormat As String = DateTime.TimeFormat
	DateTime.DateFormat = "yyyy-MM-dd"
	DateTime.TimeFormat = "HH:mm"
	Dim ticks As Long = LocalTimestampToTicks(targetMinuteTimestamp)
	Dim value As String = DateTime.Date(ticks) & " " & DateTime.Time(ticks)
	DateTime.DateFormat = previousDateFormat
	DateTime.TimeFormat = previousTimeFormat
	Return value
End Sub

Private Sub LocalTimestampToTicks(targetTimestamp As Long) As Long
	Return (targetTimestamp + (TimezoneOffsetMinutes * 60)) * 1000
End Sub

Private Sub TimezoneOffsetMinutes As Int
	Dim jo As JavaObject
	jo.InitializeStatic("java.time.OffsetDateTime")
	Dim nowOffset As JavaObject = jo.RunMethod("now", Null)
	Dim zoneOffset As JavaObject = nowOffset.RunMethod("getOffset", Null)
	Dim totalSeconds As Int = zoneOffset.RunMethod("getTotalSeconds", Null)
	Return -Round(totalSeconds / 60)
End Sub

Private Sub TimeStringToMinutes(value As String) As Int
	If value = "" Then Return -1
	Dim parts() As String = Regex.Split(":", value)
	If parts.Length < 2 Then Return -1
	Try
		Dim hours As Int = parts(0)
		Dim minutes As Int = parts(1)
		If hours < 0 Or hours > 23 Then Return -1
		If minutes < 0 Or minutes > 59 Then Return -1
		Return hours * 60 + minutes
	Catch
		Return -1
	End Try
End Sub

Private Sub ToLongDefault(value As Object, defaultValue As Long) As Long
	Try
		If value = Null Then Return defaultValue
		Return value
	Catch
		Try
			Return Floor(("" & value).Trim)
		Catch
			Return defaultValue
		End Try
	End Try
End Sub
