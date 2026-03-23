B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Маршрутизатор trace-сообщений.
' Принимает сырые debug/legacy сообщения, подавляет шум и переводит их в structured trace.

Sub Class_Globals
	Private traceServiceRef As TraceService
	Private formatterRef As PlaybackTraceFormatter
	Private releaseBuild As Boolean
	Private debugContextLines As Int
End Sub

Public Sub Initialize(traceSvc As TraceService, formatterValue As PlaybackTraceFormatter, isReleaseBuild As Boolean, debugContextLineCount As Int)
	traceServiceRef = traceSvc
	formatterRef = formatterValue
	releaseBuild = isReleaseBuild
	debugContextLines = debugContextLineCount
End Sub

Public Sub TraceLog(message As String)
	If message = "" Then Return
	If HandleDiagnosticTraceMessage(message) Then Return
	TraceDebug(message)
End Sub

Public Sub TraceInfo(category As String, message As String, details As String)
	WriteTraceEntry("INFO", category, message, details)
End Sub

Public Sub TraceWarn(category As String, message As String, details As String)
	WriteTraceEntry("WARN", category, message, details)
End Sub

Public Sub TraceError(category As String, message As String, details As String)
	WriteTraceEntry("ERROR", category, message, details)
	AppendRecentDebugContext("Контекст ошибки")
End Sub

Public Sub TraceState(category As String, message As String, details As String)
	WriteTraceEntry("STATE", category, message, details)
End Sub

Public Sub TraceDebugMessage(message As String)
	TraceDebug(message)
End Sub

Private Sub TraceDebug(message As String)
	traceServiceRef.TraceDebug(message)
End Sub

Private Sub AppendRecentDebugContext(title As String)
	Dim debugLines As List = traceServiceRef.GetRecentDebugList(debugContextLines)
	If debugLines.IsInitialized = False Or debugLines.Size = 0 Then Return
	WriteTraceEntry("DEBUG", "debug", title, "")
	For Each debugLine As String In debugLines
		traceServiceRef.Trace("DEBUG " & TrimDebugContextLine(debugLine))
	Next
End Sub

Private Sub TrimDebugContextLine(debugLine As String) As String
	If debugLine = "" Then Return ""
	Dim marker As String = " DEBUG "
	Dim markerIndex As Int = debugLine.IndexOf(marker)
	If markerIndex < 0 Then Return debugLine
	Return debugLine.SubString(markerIndex + marker.Length).Trim
End Sub

Private Sub WriteTraceEntry(level As String, category As String, message As String, details As String)
	Dim line As String = level & " " & formatterRef.BuildHumanTraceMessage(category, message, details.Trim)
	traceServiceRef.Trace(line)
End Sub

Private Sub HandleDiagnosticTraceMessage(message As String) As Boolean
	If message = "" Then Return True
	If ShouldSuppressTraceMessage(message) Then
		TraceDebug(message)
		Return True
	End If
	If message.StartsWith("Трек сохранен в кэш.") Then
		TraceInfo("cache", "трек загружен в кэш", NormalizeLegacyDetails(TailAfter(message, "Трек сохранен в кэш.")))
		Return True
	End If
	If message.StartsWith("Не удалось скачать трек.") Or message.StartsWith("Не удалось сохранить трек в кэш.") Then
		TraceError("cache", "ошибка загрузки трека", NormalizeLegacyDetails(TailAfterFirstSpace(message)))
		Return True
	End If
	If message.StartsWith("Синхронизация кэша треков завершена.") Then
		TraceInfo("cache", "кэш треков обновлен", NormalizeLegacyDetails(TailAfter(message, "Синхронизация кэша треков завершена.")))
		Return True
	End If
	If message.StartsWith("ad cache sync done") Then
		TraceInfo("cache", "кэш рекламы обновлен", NormalizeLegacyDetails(TailAfter(message, "ad cache sync done")))
		Return True
	End If
	If message.StartsWith("Аудит кэша завершен.") Then
		TraceInfo("cache", "аудит кэша", NormalizeLegacyDetails(TailAfter(message, "Аудит кэша завершен.")))
		Return True
	End If
	If message.StartsWith("Очистка кэша треков завершена.") Then
		TraceInfo("cache", "очистка кэша", NormalizeLegacyDetails(TailAfter(message, "Очистка кэша треков завершена.")))
		Return True
	End If
	If message.StartsWith("кэш треков очистка итог") Then
		TraceInfo("cache", "очистка кэша", NormalizeLegacyDetails(TailAfter(message, "кэш треков очистка итог")))
		Return True
	End If
	If message.StartsWith("Удален cached ad, отсутствующий в актуальном data.") Then
		TraceInfo("cache", "реклама удалена из кэша", NormalizeLegacyDetails(TailAfter(message, "Удален cached ad, отсутствующий в актуальном data.")))
		Return True
	End If
	If message.StartsWith("подготовка data playback ошибка") Then
		TraceWarn("playback", "очередь пуста", "")
		Return True
	End If
	If message.StartsWith("очередь запрос ошибка") Then
		TraceWarn("playback", "очередь пуста", NormalizeLegacyDetails(TailAfter(message, "очередь запрос ошибка")))
		Return True
	End If
	If message.StartsWith("очередь next ошибка") Then
		TraceWarn("playback", "очередь пуста", NormalizeLegacyDetails(TailAfter(message, "очередь next ошибка")))
		Return True
	End If
	If message.StartsWith("очередь fetch ошибка") Then
		TraceWarn("network", "ошибка очереди", NormalizeLegacyDetails(TailAfter(message, "очередь fetch ошибка")))
		Return True
	End If
	If message.StartsWith("состояние blocked") Then
		TraceWarn("player", "плеер заблокирован", "")
		Return True
	End If
	If message.StartsWith("состояние stop") Or message.StartsWith("message shutdown") Then
		TraceWarn("player", "воспроизведение остановлено", NormalizeLegacyDetails(TailAfterFirstSpace(message)))
		Return True
	End If
	If message.StartsWith("fallback activate") Then
		TraceWarn("playback", "включен локальный fallback", NormalizeLegacyDetails(TailAfter(message, "fallback activate")))
		Return True
	End If
	If message.StartsWith("degraded path вход") Then
		TraceWarn("network", "деградация media path", "")
		Return True
	End If
	If message.StartsWith("degraded path восстановлен") Then
		TraceInfo("network", "media path восстановлен", "")
		Return True
	End If
	If message.StartsWith("история чтение ошибка") Or message.StartsWith("история response parse ошибка") Then
		TraceWarn("history", "ошибка истории", "")
		Return True
	End If
	If message.StartsWith("метаданные плейлистов sync итог") Then
		TraceInfo("network", "метаданные плейлистов обновлены", NormalizeLegacyDetails(TailAfter(message, "метаданные плейлистов sync итог")))
		Return True
	End If
	If message.StartsWith("метаданные плейлиста fetch ошибка") Then
		TraceWarn("network", "ошибка метаданных плейлиста", NormalizeLegacyDetails(TailAfter(message, "метаданные плейлиста fetch ошибка")))
		Return True
	End If
	If message.StartsWith("Не удалось подготовить временный файл трека.") Then
		TraceError("cache", "ошибка подготовки трека", NormalizeLegacyDetails(TailAfter(message, "Не удалось подготовить временный файл трека.")))
		Return True
	End If
	TraceDebug(message)
	Return True
End Sub

Private Sub ShouldSuppressTraceMessage(message As String) As Boolean
	If message.StartsWith("guard переход") Or message.StartsWith("переход dispatch") Then
		If releaseBuild Then
			Return False
		Else
			Return True
		End If
	End If
	Dim noisyPrefixes As List
	noisyPrefixes.Initialize
	noisyPrefixes.Add("курсор плейлистов load")
	noisyPrefixes.Add("состояние init")
	noisyPrefixes.Add("старт skip")
	noisyPrefixes.Add("старт вход")
	noisyPrefixes.Add("отложенный старт")
	noisyPrefixes.Add("сценарий ")
	noisyPrefixes.Add("flow переход")
	noisyPrefixes.Add("guard переход")
	noisyPrefixes.Add("guard подготовка")
	noisyPrefixes.Add("guard prefetch")
	noisyPrefixes.Add("guard fade")
	noisyPrefixes.Add("переход dispatch")
	noisyPrefixes.Add("воспроизведение activate")
	noisyPrefixes.Add("очередь добор")
	noisyPrefixes.Add("очередь next итог")
	noisyPrefixes.Add("очередь playlist skip")
	noisyPrefixes.Add("очередь signature mismatch")
	noisyPrefixes.Add("автостарт сначала обновление данных")
	noisyPrefixes.Add("policy resume авто")
	noisyPrefixes.Add("возобновление запрет")
	noisyPrefixes.Add("возобновление итог")
	noisyPrefixes.Add("снимок очереди восстановление skip")
	noisyPrefixes.Add("http get начало")
	noisyPrefixes.Add("http get итог")
	noisyPrefixes.Add("claim начало")
	noisyPrefixes.Add("claim итог")
	noisyPrefixes.Add("элемент очереди play")
	noisyPrefixes.Add("курсор плейлистов commit")
	noisyPrefixes.Add("реклама prescan начало")
	noisyPrefixes.Add("брейк exact defer")
	noisyPrefixes.Add("брейк exact sync")
	noisyPrefixes.Add("fade начало")
	noisyPrefixes.Add("история confirm")
	noisyPrefixes.Add("история stage")
	noisyPrefixes.Add("история буфер add")
	noisyPrefixes.Add("история отправка начало")
	noisyPrefixes.Add("история отправка payload")
	noisyPrefixes.Add("история отправка ack")
	noisyPrefixes.Add("stop запрос")
	noisyPrefixes.Add("резерв очереди save")
	noisyPrefixes.Add("снимок очереди clear")
	noisyPrefixes.Add("состояние воспроизведения clear")
	noisyPrefixes.Add("аудио ready")
	noisyPrefixes.Add("аудио complete")
	noisyPrefixes.Add("переход overlap начало")
	noisyPrefixes.Add("переход tail начало")
	noisyPrefixes.Add("переход prefetch начало")
	noisyPrefixes.Add("trusted time update")
	noisyPrefixes.Add("player end parse fail")
	noisyPrefixes.Add("[AudioPrimary]")
	noisyPrefixes.Add("[AudioSecondary]")
	noisyPrefixes.Add("machine guid")
	noisyPrefixes.Add("legacy migrate итог")
	noisyPrefixes.Add("метаданные плейлистов sync skip")
	noisyPrefixes.Add("метаданные плейлиста fetch начало")
	noisyPrefixes.Add("окно save")
	noisyPrefixes.Add("окно restore")
	noisyPrefixes.Add("trace отправка")
	noisyPrefixes.Add("скачивание рекламы в кэш")
	noisyPrefixes.Add("скачивание трека в кэш")
	noisyPrefixes.Add("удален cached track при очистке кэша")
	noisyPrefixes.Add("очистка кэша треков пропущена")
	noisyPrefixes.Add("очередь playlist skip")
	noisyPrefixes.Add("очередь next итог")
	noisyPrefixes.Add("очередь signature mismatch")
	noisyPrefixes.Add("переход очередь drop")
	noisyPrefixes.Add("переход preload ошибка")
	noisyPrefixes.Add("переход prepared reject")
	For Each prefix As String In noisyPrefixes
		If message.ToLowerCase.StartsWith(prefix.ToLowerCase) Then Return True
	Next
	Return False
End Sub

Private Sub NormalizeLegacyDetails(text As String) As String
	Dim value As String = text.Trim
	If value.StartsWith(".") Or value.StartsWith(":") Then value = value.SubString(1).Trim
	value = value.Replace(",", "")
	Return value
End Sub

Private Sub TailAfter(text As String, prefix As String) As String
	If text.StartsWith(prefix) = False Then Return text
	Return text.SubString(prefix.Length).Trim
End Sub

Private Sub TailAfterFirstSpace(text As String) As String
	Dim firstSpace As Int = text.IndexOf(" ")
	If firstSpace < 0 Then Return ""
	Return text.SubString(firstSpace + 1).Trim
End Sub
