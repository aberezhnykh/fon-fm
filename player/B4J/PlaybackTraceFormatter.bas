B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@

' Форматтер человекочитаемого trace.
' Переводит structured category/message/details в короткие понятные фразы для лога и UI.

Sub Class_Globals
End Sub

Public Sub Initialize
End Sub

Public Sub BuildHumanTraceMessage(category As String, message As String, details As String) As String
	Select category
		Case "app"
			If message = "запуск" Then
				Return "Приложение запущено. " & BuildVersionPlayerText(details)
			End If
		Case "network"
			Select message
				Case "запрос данных"
					Return "Запрос данных"
				Case "data загружены"
					Return "Данные получены."
				Case "data ошибка"
					Return "Ошибка запроса данных. " & BuildReasonText(details)
				Case "data сообщение"
					Return "Сервер вернул сообщение. " & BuildReasonText(details)
				Case "data некорректны"
					Return "Ошибка данных от сервера. " & BuildReasonText(details)
				Case "переход в retry"
					Dim delaySec As String = ExtractDetailValue(details, "delaySec")
					If delaySec = "" Then delaySec = ExtractDetailValue(details, "delay")
					If delaySec <> "" Then Return "Повторный запрос данных через " & delaySec & " секунд"
					Return "Повторный запрос данных позже"
				Case "data timeout"
					Return "Сервер не ответил вовремя. " & BuildReasonText(details)
				Case "метаданные плейлистов обновлены"
					Return "Метаданные плейлистов обновлены. " & BuildCountsText(details)
				Case "ошибка метаданных плейлиста"
					Return "Не удалось загрузить метаданные плейлиста. " & BuildReasonText(details)
				Case "ошибка очереди"
					Return "Не удалось получить очередь. " & BuildReasonText(details)
				Case "media path восстановлен"
					Return "Доступ к медиа восстановлен."
				Case "деградация media path"
					Return "Доступ к медиа ухудшился."
			End Select
		Case "audio"
			Dim playerText As String = "Плеер " & ExtractDetailValue(details, "player")
			Dim itemLabel As String = TraceItemLabelFromDetails(details)
			Dim audioSettingsText As String = BuildAudioSettingsText(details)
			Select message
				Case "плеер load"
					Return playerText & ": Загружен " & itemLabel & audioSettingsText
				Case "плеер ready"
					If ExtractDetailValue(details, "mode") = "prepare" Then
						Return playerText & ": Подготовлен " & itemLabel & audioSettingsText
					End If
					Return playerText & ": Готов к воспроизведению " & itemLabel & audioSettingsText
				Case "плеер play"
					Return playerText & ": Воспроизведение " & itemLabel & audioSettingsText
				Case "плеер complete"
					Return playerText & ": Закончил " & itemLabel
				Case "плеер error"
					Return playerText & ": Ошибка " & itemLabel & ". " & BuildReasonText(details)
				Case "не удалось запустить трек"
					Return playerText & ": Не удалось запустить " & itemLabel & ". " & BuildReasonText(details)
				Case "таймаут старта трека"
					Return playerText & ": Не дождались старта " & itemLabel
				Case "таймаут preload"
					Return playerText & ": Не дождались подготовки " & itemLabel
			End Select
		Case "playback"
			Select message
				Case "первый трек выбран из кэша"
					Return "Первый трек выбран из кэша."
				Case "populate queue start"
					Return "Подготовка очереди."
				Case "populate queue done"
					Return "Очередь подготовлена. Элементов: " & DefaultIfEmpty(ExtractDetailValue(details, "queue"), "0")
				Case "populate queue fail"
					Return "Не удалось подготовить очередь. " & BuildReasonText(details)
				Case "dispatch next"
					Return "Следующий элемент: " & TraceItemLabelFromDetails(details)
				Case "dispatch break"
					Return "Начата обработка break."
				Case "dispatch prepared"
					Return "Запущен следующий элемент."
				Case "dispatch переход"
					Return "Переход к следующему элементу."
				Case "prefetch start"
					Return "Подготовка следующего элемента."
				Case "prefetch done"
					Return "Следующий элемент подготовлен."
				Case "prefetch fail"
					Return "Не удалось подготовить следующий элемент. " & BuildReasonText(details)
				Case "prefetch skip"
					Dim skipReason As String = ExtractDetailValue(details, "reason")
					If skipReason = "break_ahead" Then Return "Предварительная подготовка отложена: впереди break."
					Return "Предварительная подготовка пропущена. " & BuildReasonText(details)
				Case "crossfade trigger"
					Return "Начат кроссфейд на следующий трек."
				Case "старт трека"
					Dim sourceText As String = ExtractDetailValue(details, "source")
					If sourceText <> "" Then
						Return "Старт трека " & ExtractDetailValue(details, "trackId") & ". Источник: " & sourceText
					End If
					Return "Старт трека " & ExtractDetailValue(details, "trackId")
				Case "смена трека"
					Return "Переход после трека " & ExtractDetailValue(details, "trackId")
				Case "watchdog stall"
					Return "Воспроизведение зависло на треке " & DefaultIfEmpty(ExtractDetailValue(details, "trackId"), "без идентификатора") & ". Запускаю восстановление."
				Case "watchdog recovery"
					Return "Восстановление воспроизведения. " & BuildReasonText(details)
				Case "break переход начало"
					Return "Начат переход на break."
				Case "break переход итог"
					Return "Переход на break завершен. " & BuildReasonText(details)
				Case "break переход fade"
					Return "Плавное завершение текущего элемента."
				Case "break переход пропущен"
					Return "Переход на break пропущен. " & BuildReasonText(details)
				Case "вставлен break"
					Return "В очередь вставлен break."
				Case "вставлена реклама"
					Return "Подготовлен переход на рекламу."
				Case "очередь пуста"
					Return "Очередь пуста. " & BuildReasonText(details)
				Case "audio complete пропущен"
					Return "Событие завершения проигнорировано. " & BuildReasonText(details)
			End Select
		Case "player"
			Select message
				Case "старт завершен"
					Return "Старт плеера завершен."
				Case "старт не завершен"
					Return "Старт плеера не завершен. " & BuildReasonText(details)
				Case "автостарт воспроизведение начало"
					Return "Автостарт воспроизведения."
				Case "воспроизведение остановлено"
					Return "Воспроизведение остановлено. " & BuildReasonText(details)
				Case "плеер заблокирован"
					Return "Плеер заблокирован."
			End Select
		Case "cache"
			Select message
				Case "трек загружен в кэш"
					Return "Кэш: Загружен трек " & DefaultIfEmpty(ExtractDetailValue(details, "id"), "без идентификатора")
				Case "ошибка загрузки трека"
					Return "Кэш: Не удалось загрузить трек. " & BuildReasonText(details)
				Case "кэш треков обновлен"
					Return "Кэш: Треки проверены. " & BuildCountsText(details)
				Case "кэш рекламы обновлен"
					Return "Кэш: Реклама проверена. " & BuildCountsText(details)
				Case "аудит кэша"
					Return "Кэш: Проверен. " & BuildCountsText(details)
				Case "очистка кэша"
					Return "Кэш: Очистка завершена. " & BuildCountsText(details)
				Case "реклама удалена из кэша"
					Return "Кэш: Удалена устаревшая реклама " & ExtractDetailValue(details, "id")
				Case "ошибка подготовки трека"
					Return "Кэш: Ошибка подготовки трека. " & BuildReasonText(details)
				Case "нет локального файла"
					Return "Кэш: Локальный файл не найден для трека " & ExtractDetailValue(details, "trackId")
			End Select
		Case "history"
			Select message
				Case "история отправлена"
					Return "История отправлена. Записей: " & DefaultIfEmpty(ExtractDetailValue(details, "records"), "0")
				Case "история не отправлена"
					Return "История не отправлена. Записей: " & DefaultIfEmpty(ExtractDetailValue(details, "records"), "0")
				Case "ошибка отправки"
					Return "Ошибка отправки истории. " & BuildReasonText(details)
				Case "ошибка истории"
					Return "Ошибка чтения истории."
				Case "не удалось прочитать файл истории"
					Return "Не удалось прочитать файл истории " & ExtractDetailValue(details, "file")
			End Select
		Case "health"
			Select message
				Case "воспроизведение"
					Return "Воспроизведение: этап=" & ExtractDetailValue(details, "stage") & _
						", играет=" & ExtractDetailValue(details, "playing") & _
						", трек=" & ExtractDetailValue(details, "currentTrackId") & _
						", очередь=" & ExtractDetailValue(details, "queue") & _
						", запас=" & ExtractDetailValue(details, "reserve") & _
						BuildHealthAudioSettingsText(details)
				Case "кэш"
					Return "Кэш: " & DefaultIfEmpty(ExtractDetailValue(details, "status"), "неизвестно")
				Case "устройство"
					Return "Устройство: " & ExtractDetailValue(details, "device") & _
						", id=" & ExtractDetailValue(details, "deviceId") & _
						", ОС=" & ExtractDetailTail(details, "os")
				Case "ресурсы"
					Return "Система: RAM=" & ExtractDetailValue(details, "ramFreeMb") & " МБ" & _
						", диск=" & ExtractDetailValue(details, "diskFreeMb") & "/" & ExtractDetailValue(details, "diskTotalMb") & " МБ"
				Case "сеть"
					Return "Сеть: ошибок=" & ExtractDetailValue(details, "netErrors") & _
						", данные ок " & ExtractDetailValue(details, "lastDataOkAgoSec") & " сек назад" & _
						", история ок " & ExtractDetailValue(details, "lastHistoryOkAgoSec") & " сек назад"
			End Select
		Case "system"
			Select message
				Case "источник"
					Return "Система: источник=" & details
				Case "устройство"
					Return "Устройство: " & ExtractDetailValue(details, "name") & ", id=" & ExtractDetailValue(details, "id")
				Case "платформа"
					Return "Система: " & ExtractDetailTail(details, "os")
				Case "память"
					Return "RAM: свободно " & ExtractDetailValue(details, "ramFreeMb") & " МБ"
				Case "память доступно"
					Return "RAM: приложению " & ExtractDetailValue(details, "ramTotalMb") & " МБ"
				Case "диск"
					Return "Диск: свободно " & ExtractDetailValue(details, "diskFreeMb") & " МБ из " & ExtractDetailValue(details, "diskTotalMb") & " МБ"
				Case "кэш треков"
					Return "Кэш: треков=" & ExtractDetailValue(details, "trackCount") & ", " & ExtractDetailValue(details, "trackMb") & " МБ, индекс=" & ExtractDetailValue(details, "trackIndex")
				Case "кэш рекламы"
					Return "Кэш: рекламы=" & ExtractDetailValue(details, "adCount") & ", " & ExtractDetailValue(details, "adMb") & " МБ, индекс=" & ExtractDetailValue(details, "adIndex")
				Case "история"
					Return "История: ожидает отправки " & ExtractDetailValue(details, "pendingHistory") & " записей"
			End Select
	End Select
	Dim genericText As String = message
	If details <> "" Then genericText = genericText & ". " & details
	Return genericText
End Sub

Private Sub BuildVersionPlayerText(details As String) As String
	Dim versionText As String = ExtractDetailValue(details, "version")
	Dim playerText As String = ExtractDetailValue(details, "player")
	Dim parts As List
	parts.Initialize
	If versionText <> "" Then parts.Add("Версия " & versionText)
	If playerText <> "" Then parts.Add("Плеер " & playerText)
	If parts.Size = 0 Then Return "Запуск"
	Return JoinWords(parts)
End Sub

Private Sub TraceItemLabelFromDetails(details As String) As String
	Dim itemType As String = ExtractDetailValue(details, "type")
	Dim itemId As String = DefaultIfEmpty(ExtractDetailValue(details, "id"), ExtractDetailValue(details, "trackId"))
	If itemType = "ad" Then
		If itemId <> "" Then Return "рекламу " & itemId
		Return "рекламу"
	End If
	If itemId <> "" Then Return "трек " & itemId
	Return "трек"
End Sub

Private Sub BuildAudioSettingsText(details As String) As String
	Dim volumeText As String = ExtractDetailValue(details, "volume")
	Dim gainText As String = ExtractDetailValue(details, "gainDb")
	Dim gainState As String = ExtractDetailValue(details, "gainApplied")
	Dim parts As List
	parts.Initialize
	If volumeText <> "" Then parts.Add("громкость " & volumeText)
	If gainText <> "" Then
		If gainState = "yes" Then
			parts.Add("gain " & gainText & " дБ")
		Else
			parts.Add("gain по умолчанию " & gainText & " дБ")
		End If
	End If
	If parts.Size = 0 Then Return ""
	Return ". " & JoinWords(parts)
End Sub

Private Sub BuildHealthAudioSettingsText(details As String) As String
	Dim volumeText As String = ExtractDetailValue(details, "volume")
	Dim gainText As String = ExtractDetailValue(details, "gainDb")
	Dim gainState As String = ExtractDetailValue(details, "gainApplied")
	Dim parts As List
	parts.Initialize
	If volumeText <> "" Then parts.Add("громкость=" & volumeText)
	If gainText <> "" Then
		If gainState = "yes" Then
			parts.Add("gain=" & gainText & " дБ")
		Else
			parts.Add("gain=" & gainText & " дБ по умолчанию")
		End If
	End If
	If parts.Size = 0 Then Return ""
	Return ", " & JoinWords(parts)
End Sub

Private Sub BuildReasonText(details As String) As String
	If details = "" Then Return ""
	Dim messageText As String = ExtractDetailTail(details, "message")
	If messageText <> "" Then Return messageText
	Dim reasonText As String = ExtractDetailTail(details, "reason")
	If reasonText <> "" Then Return "Причина: " & reasonText
	Dim kindText As String = ExtractDetailValue(details, "kind")
	If kindText <> "" Then Return "Причина: " & kindText
	Dim stepText As String = ExtractDetailValue(details, "step")
	If stepText <> "" Then Return "Шаг: " & stepText
	Dim resultText As String = ExtractDetailValue(details, "result")
	If resultText <> "" Then Return "Результат: " & resultText
	Return details
End Sub

Private Sub BuildCountsText(details As String) As String
	Dim parts As List
	parts.Initialize
	AddCountPart(parts, details, "downloaded", "загружено")
	AddCountPart(parts, details, "updated", "обновлено")
	AddCountPart(parts, details, "failed", "ошибок")
	AddCountPart(parts, details, "removed", "удалено")
	AddCountPart(parts, details, "actual", "осталось")
	AddCountPart(parts, details, "added", "добавлено")
	AddCountPart(parts, details, "tempDeleted", "временных удалено")
	AddCountPart(parts, details, "ads", "рекламы")
	AddCountPart(parts, details, "tracks", "треков")
	If parts.Size = 0 Then Return BuildReasonText(details)
	Return JoinWords(parts)
End Sub

Private Sub AddCountPart(parts As List, details As String, key As String, label As String)
	Dim value As String = ExtractDetailValue(details, key)
	If value = "" Then Return
	parts.Add(label & " " & value)
End Sub

Private Sub JoinWords(parts As List) As String
	Dim sb As StringBuilder
	sb.Initialize
	For i = 0 To parts.Size - 1
		If i > 0 Then sb.Append(". ")
		sb.Append(parts.Get(i))
	Next
	Return sb.ToString
End Sub

Private Sub DefaultIfEmpty(value As String, fallback As String) As String
	If value = "" Then Return fallback
	Return value
End Sub

Private Sub ExtractDetailValue(details As String, key As String) As String
	Dim marker As String = key & "="
	Dim startIndex As Int = details.IndexOf(marker)
	If startIndex < 0 Then Return ""
	Dim value As String = details.SubString(startIndex + marker.Length).Trim
	Dim nextSpace As Int = value.IndexOf(" ")
	If nextSpace >= 0 Then value = value.SubString2(0, nextSpace)
	Return value.Trim
End Sub

Private Sub ExtractDetailTail(details As String, key As String) As String
	Dim marker As String = key & "="
	Dim startIndex As Int = details.IndexOf(marker)
	If startIndex < 0 Then Return ""
	Return details.SubString(startIndex + marker.Length).Trim
End Sub
