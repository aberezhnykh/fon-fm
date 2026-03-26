package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbacktraceformatter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbacktraceformatter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbacktraceformatter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _addcountpart(anywheresoftware.b4a.objects.collections.List _parts,String _details,String _key,String _label) throws Exception{
String _value = "";
 //BA.debugLineNum = 317;BA.debugLine="Private Sub AddCountPart(parts As List, details As";
 //BA.debugLineNum = 318;BA.debugLine="Dim value As String = ExtractDetailValue(details,";
_value = _extractdetailvalue(_details,_key);
 //BA.debugLineNum = 319;BA.debugLine="If value = \"\" Then Return";
if ((_value).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 320;BA.debugLine="parts.Add(label & \" \" & value)";
_parts.Add((Object)(_label+" "+_value));
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public String  _buildaudiosettingstext(String _details) throws Exception{
String _volumetext = "";
String _gaintext = "";
String _gainstate = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 250;BA.debugLine="Private Sub BuildAudioSettingsText(details As Stri";
 //BA.debugLineNum = 251;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = _extractdetailvalue(_details,"volume");
 //BA.debugLineNum = 252;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = _extractdetailvalue(_details,"gainDb");
 //BA.debugLineNum = 253;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = _extractdetailvalue(_details,"gainApplied");
 //BA.debugLineNum = 254;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 255;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 256;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость \" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость "+_volumetext));};
 //BA.debugLineNum = 257;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
 //BA.debugLineNum = 258;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
 //BA.debugLineNum = 259;BA.debugLine="parts.Add(\"gain \" & gainText & \" дБ\")";
_parts.Add((Object)("gain "+_gaintext+" дБ"));
 }else {
 //BA.debugLineNum = 261;BA.debugLine="parts.Add(\"gain по умолчанию \" & gainText & \" д";
_parts.Add((Object)("gain по умолчанию "+_gaintext+" дБ"));
 };
 };
 //BA.debugLineNum = 264;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 265;BA.debugLine="Return \". \" & JoinWords(parts)";
if (true) return ". "+_joinwords(_parts);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _buildcountstext(String _details) throws Exception{
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 301;BA.debugLine="Private Sub BuildCountsText(details As String) As";
 //BA.debugLineNum = 302;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 303;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 304;BA.debugLine="AddCountPart(parts, details, \"downloaded\", \"загру";
_addcountpart(_parts,_details,"downloaded","загружено");
 //BA.debugLineNum = 305;BA.debugLine="AddCountPart(parts, details, \"updated\", \"обновлен";
_addcountpart(_parts,_details,"updated","обновлено");
 //BA.debugLineNum = 306;BA.debugLine="AddCountPart(parts, details, \"failed\", \"ошибок\")";
_addcountpart(_parts,_details,"failed","ошибок");
 //BA.debugLineNum = 307;BA.debugLine="AddCountPart(parts, details, \"removed\", \"удалено\"";
_addcountpart(_parts,_details,"removed","удалено");
 //BA.debugLineNum = 308;BA.debugLine="AddCountPart(parts, details, \"actual\", \"осталось\"";
_addcountpart(_parts,_details,"actual","осталось");
 //BA.debugLineNum = 309;BA.debugLine="AddCountPart(parts, details, \"added\", \"добавлено\"";
_addcountpart(_parts,_details,"added","добавлено");
 //BA.debugLineNum = 310;BA.debugLine="AddCountPart(parts, details, \"tempDeleted\", \"врем";
_addcountpart(_parts,_details,"tempDeleted","временных удалено");
 //BA.debugLineNum = 311;BA.debugLine="AddCountPart(parts, details, \"ads\", \"рекламы\")";
_addcountpart(_parts,_details,"ads","рекламы");
 //BA.debugLineNum = 312;BA.debugLine="AddCountPart(parts, details, \"tracks\", \"треков\")";
_addcountpart(_parts,_details,"tracks","треков");
 //BA.debugLineNum = 313;BA.debugLine="If parts.Size = 0 Then Return BuildReasonText(det";
if (_parts.getSize()==0) { 
if (true) return _buildreasontext(_details);};
 //BA.debugLineNum = 314;BA.debugLine="Return JoinWords(parts)";
if (true) return _joinwords(_parts);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _buildhealthaudiosettingstext(String _details) throws Exception{
String _volumetext = "";
String _gaintext = "";
String _gainstate = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 268;BA.debugLine="Private Sub BuildHealthAudioSettingsText(details A";
 //BA.debugLineNum = 269;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = _extractdetailvalue(_details,"volume");
 //BA.debugLineNum = 270;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = _extractdetailvalue(_details,"gainDb");
 //BA.debugLineNum = 271;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = _extractdetailvalue(_details,"gainApplied");
 //BA.debugLineNum = 272;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 273;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 274;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость=\" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость="+_volumetext));};
 //BA.debugLineNum = 275;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
 //BA.debugLineNum = 276;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
 //BA.debugLineNum = 277;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ\")";
_parts.Add((Object)("gain="+_gaintext+" дБ"));
 }else {
 //BA.debugLineNum = 279;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ по умолчани";
_parts.Add((Object)("gain="+_gaintext+" дБ по умолчанию"));
 };
 };
 //BA.debugLineNum = 282;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 283;BA.debugLine="Return \", \" & JoinWords(parts)";
if (true) return ", "+_joinwords(_parts);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public String  _buildhumantracemessage(String _category,String _message,String _details) throws Exception{
String _delaysec = "";
String _playertext = "";
String _itemlabel = "";
String _audiosettingstext = "";
String _skipreason = "";
String _sourcetext = "";
String _generictext = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Sub BuildHumanTraceMessage(category As Stri";
 //BA.debugLineNum = 12;BA.debugLine="Select category";
switch (BA.switchObjectToInt(_category,"app","network","audio","playback","player","cache","history","health","system")) {
case 0: {
 //BA.debugLineNum = 14;BA.debugLine="If message = \"запуск\" Then";
if ((_message).equals("запуск")) { 
 //BA.debugLineNum = 15;BA.debugLine="Return \"Приложение запущено. \" & BuildVersionP";
if (true) return "Приложение запущено. "+_buildversionplayertext(_details);
 };
 break; }
case 1: {
 //BA.debugLineNum = 18;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"запрос данных","data загружены","data ошибка","data сообщение","data некорректны","переход в retry","data timeout","метаданные плейлистов обновлены","ошибка метаданных плейлиста","ошибка очереди","media path восстановлен","деградация media path")) {
case 0: {
 //BA.debugLineNum = 20;BA.debugLine="Return \"Запрос данных\"";
if (true) return "Запрос данных";
 break; }
case 1: {
 //BA.debugLineNum = 22;BA.debugLine="Return \"Данные получены.\"";
if (true) return "Данные получены.";
 break; }
case 2: {
 //BA.debugLineNum = 24;BA.debugLine="Return \"Ошибка запроса данных. \" & BuildReaso";
if (true) return "Ошибка запроса данных. "+_buildreasontext(_details);
 break; }
case 3: {
 //BA.debugLineNum = 26;BA.debugLine="Return \"Сервер вернул сообщение. \" & BuildRea";
if (true) return "Сервер вернул сообщение. "+_buildreasontext(_details);
 break; }
case 4: {
 //BA.debugLineNum = 28;BA.debugLine="Return \"Ошибка данных от сервера. \" & BuildRe";
if (true) return "Ошибка данных от сервера. "+_buildreasontext(_details);
 break; }
case 5: {
 //BA.debugLineNum = 30;BA.debugLine="Dim delaySec As String = ExtractDetailValue(d";
_delaysec = _extractdetailvalue(_details,"delaySec");
 //BA.debugLineNum = 31;BA.debugLine="If delaySec = \"\" Then delaySec = ExtractDetai";
if ((_delaysec).equals("")) { 
_delaysec = _extractdetailvalue(_details,"delay");};
 //BA.debugLineNum = 32;BA.debugLine="If delaySec <> \"\" Then Return \"Повторный запр";
if ((_delaysec).equals("") == false) { 
if (true) return "Повторный запрос данных через "+_delaysec+" секунд";};
 //BA.debugLineNum = 33;BA.debugLine="Return \"Повторный запрос данных позже\"";
if (true) return "Повторный запрос данных позже";
 break; }
case 6: {
 //BA.debugLineNum = 35;BA.debugLine="Return \"Сервер не ответил вовремя. \" & BuildR";
if (true) return "Сервер не ответил вовремя. "+_buildreasontext(_details);
 break; }
case 7: {
 //BA.debugLineNum = 37;BA.debugLine="Return \"Метаданные плейлистов обновлены. \" &";
if (true) return "Метаданные плейлистов обновлены. "+_buildcountstext(_details);
 break; }
case 8: {
 //BA.debugLineNum = 39;BA.debugLine="Return \"Не удалось загрузить метаданные плейл";
if (true) return "Не удалось загрузить метаданные плейлиста. "+_buildreasontext(_details);
 break; }
case 9: {
 //BA.debugLineNum = 41;BA.debugLine="Return \"Не удалось получить очередь. \" & Buil";
if (true) return "Не удалось получить очередь. "+_buildreasontext(_details);
 break; }
case 10: {
 //BA.debugLineNum = 43;BA.debugLine="Return \"Доступ к медиа восстановлен.\"";
if (true) return "Доступ к медиа восстановлен.";
 break; }
case 11: {
 //BA.debugLineNum = 45;BA.debugLine="Return \"Доступ к медиа ухудшился.\"";
if (true) return "Доступ к медиа ухудшился.";
 break; }
}
;
 break; }
case 2: {
 //BA.debugLineNum = 48;BA.debugLine="Dim playerText As String = \"Плеер \" & ExtractDe";
_playertext = "Плеер "+_extractdetailvalue(_details,"player");
 //BA.debugLineNum = 49;BA.debugLine="Dim itemLabel As String = TraceItemLabelFromDet";
_itemlabel = _traceitemlabelfromdetails(_details);
 //BA.debugLineNum = 50;BA.debugLine="Dim audioSettingsText As String = BuildAudioSet";
_audiosettingstext = _buildaudiosettingstext(_details);
 //BA.debugLineNum = 51;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"плеер load","плеер ready","плеер play","плеер complete","плеер error","не удалось запустить трек","таймаут старта трека","таймаут preload")) {
case 0: {
 //BA.debugLineNum = 53;BA.debugLine="Return playerText & \": Загружен \" & itemLabel";
if (true) return _playertext+": Загружен "+_itemlabel+_audiosettingstext;
 break; }
case 1: {
 //BA.debugLineNum = 55;BA.debugLine="If ExtractDetailValue(details, \"mode\") = \"pre";
if ((_extractdetailvalue(_details,"mode")).equals("prepare")) { 
 //BA.debugLineNum = 56;BA.debugLine="Return playerText & \": Подготовлен \" & itemL";
if (true) return _playertext+": Подготовлен "+_itemlabel+_audiosettingstext;
 };
 //BA.debugLineNum = 58;BA.debugLine="Return playerText & \": Готов к воспроизведени";
if (true) return _playertext+": Готов к воспроизведению "+_itemlabel+_audiosettingstext;
 break; }
case 2: {
 //BA.debugLineNum = 60;BA.debugLine="Return playerText & \": Воспроизведение \" & it";
if (true) return _playertext+": Воспроизведение "+_itemlabel+_audiosettingstext;
 break; }
case 3: {
 //BA.debugLineNum = 62;BA.debugLine="Return playerText & \": Закончил \" & itemLabel";
if (true) return _playertext+": Закончил "+_itemlabel;
 break; }
case 4: {
 //BA.debugLineNum = 64;BA.debugLine="Return playerText & \": Ошибка \" & itemLabel &";
if (true) return _playertext+": Ошибка "+_itemlabel+". "+_buildreasontext(_details);
 break; }
case 5: {
 //BA.debugLineNum = 66;BA.debugLine="Return playerText & \": Не удалось запустить \"";
if (true) return _playertext+": Не удалось запустить "+_itemlabel+". "+_buildreasontext(_details);
 break; }
case 6: {
 //BA.debugLineNum = 68;BA.debugLine="Return playerText & \": Не дождались старта \"";
if (true) return _playertext+": Не дождались старта "+_itemlabel;
 break; }
case 7: {
 //BA.debugLineNum = 70;BA.debugLine="Return playerText & \": Не дождались подготовк";
if (true) return _playertext+": Не дождались подготовки "+_itemlabel;
 break; }
}
;
 break; }
case 3: {
 //BA.debugLineNum = 73;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"первый трек выбран из кэша","populate queue start","populate queue done","populate queue fail","dispatch next","dispatch break","dispatch prepared","dispatch переход","prefetch start","prefetch done","prefetch fail","prefetch skip","crossfade trigger","старт трека","смена трека","watchdog stall","watchdog recovery","break переход начало","break переход итог","break переход fade","break переход пропущен","вставлен break","вставлена реклама","очередь пуста","audio complete пропущен")) {
case 0: {
 //BA.debugLineNum = 75;BA.debugLine="Return \"Первый трек выбран из кэша.\"";
if (true) return "Первый трек выбран из кэша.";
 break; }
case 1: {
 //BA.debugLineNum = 77;BA.debugLine="Return \"Подготовка очереди.\"";
if (true) return "Подготовка очереди.";
 break; }
case 2: {
 //BA.debugLineNum = 79;BA.debugLine="Return \"Очередь подготовлена. Элементов: \" &";
if (true) return "Очередь подготовлена. Элементов: "+_defaultifempty(_extractdetailvalue(_details,"queue"),"0");
 break; }
case 3: {
 //BA.debugLineNum = 81;BA.debugLine="Return \"Не удалось подготовить очередь. \" & B";
if (true) return "Не удалось подготовить очередь. "+_buildreasontext(_details);
 break; }
case 4: {
 //BA.debugLineNum = 83;BA.debugLine="Return \"Следующий элемент: \" & TraceItemLabel";
if (true) return "Следующий элемент: "+_traceitemlabelfromdetails(_details);
 break; }
case 5: {
 //BA.debugLineNum = 85;BA.debugLine="Return \"Начата обработка break.\"";
if (true) return "Начата обработка break.";
 break; }
case 6: {
 //BA.debugLineNum = 87;BA.debugLine="Return \"Запущен следующий элемент.\"";
if (true) return "Запущен следующий элемент.";
 break; }
case 7: {
 //BA.debugLineNum = 89;BA.debugLine="Return \"Переход к следующему элементу.\"";
if (true) return "Переход к следующему элементу.";
 break; }
case 8: {
 //BA.debugLineNum = 91;BA.debugLine="Return \"Подготовка следующего элемента.\"";
if (true) return "Подготовка следующего элемента.";
 break; }
case 9: {
 //BA.debugLineNum = 93;BA.debugLine="Return \"Следующий элемент подготовлен.\"";
if (true) return "Следующий элемент подготовлен.";
 break; }
case 10: {
 //BA.debugLineNum = 95;BA.debugLine="Return \"Не удалось подготовить следующий элем";
if (true) return "Не удалось подготовить следующий элемент. "+_buildreasontext(_details);
 break; }
case 11: {
 //BA.debugLineNum = 97;BA.debugLine="Dim skipReason As String = ExtractDetailValue";
_skipreason = _extractdetailvalue(_details,"reason");
 //BA.debugLineNum = 98;BA.debugLine="If skipReason = \"break_ahead\" Then Return \"Пр";
if ((_skipreason).equals("break_ahead")) { 
if (true) return "Предварительная подготовка отложена: впереди break.";};
 //BA.debugLineNum = 99;BA.debugLine="Return \"Предварительная подготовка пропущена.";
if (true) return "Предварительная подготовка пропущена. "+_buildreasontext(_details);
 break; }
case 12: {
 //BA.debugLineNum = 101;BA.debugLine="Return \"Начат кроссфейд на следующий трек.\"";
if (true) return "Начат кроссфейд на следующий трек.";
 break; }
case 13: {
 //BA.debugLineNum = 103;BA.debugLine="Dim sourceText As String = ExtractDetailValue";
_sourcetext = _extractdetailvalue(_details,"source");
 //BA.debugLineNum = 104;BA.debugLine="If sourceText <> \"\" Then";
if ((_sourcetext).equals("") == false) { 
 //BA.debugLineNum = 105;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(d";
if (true) return "Старт трека "+_extractdetailvalue(_details,"trackId")+". Источник: "+_sourcetext;
 };
 //BA.debugLineNum = 107;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(de";
if (true) return "Старт трека "+_extractdetailvalue(_details,"trackId");
 break; }
case 14: {
 //BA.debugLineNum = 109;BA.debugLine="Return \"Переход после трека \" & ExtractDetail";
if (true) return "Переход после трека "+_extractdetailvalue(_details,"trackId");
 break; }
case 15: {
 //BA.debugLineNum = 111;BA.debugLine="Return \"Воспроизведение зависло на треке \" &";
if (true) return "Воспроизведение зависло на треке "+_defaultifempty(_extractdetailvalue(_details,"trackId"),"без идентификатора")+". Запускаю восстановление.";
 break; }
case 16: {
 //BA.debugLineNum = 113;BA.debugLine="Return \"Восстановление воспроизведения. \" & B";
if (true) return "Восстановление воспроизведения. "+_buildreasontext(_details);
 break; }
case 17: {
 //BA.debugLineNum = 115;BA.debugLine="Return \"Начат переход на break.\"";
if (true) return "Начат переход на break.";
 break; }
case 18: {
 //BA.debugLineNum = 117;BA.debugLine="Return \"Переход на break завершен. \" & BuildR";
if (true) return "Переход на break завершен. "+_buildreasontext(_details);
 break; }
case 19: {
 //BA.debugLineNum = 119;BA.debugLine="Return \"Плавное завершение текущего элемента.";
if (true) return "Плавное завершение текущего элемента.";
 break; }
case 20: {
 //BA.debugLineNum = 121;BA.debugLine="Return \"Переход на break пропущен. \" & BuildR";
if (true) return "Переход на break пропущен. "+_buildreasontext(_details);
 break; }
case 21: {
 //BA.debugLineNum = 123;BA.debugLine="Return \"В очередь вставлен break.\"";
if (true) return "В очередь вставлен break.";
 break; }
case 22: {
 //BA.debugLineNum = 125;BA.debugLine="Return \"Подготовлен переход на рекламу.\"";
if (true) return "Подготовлен переход на рекламу.";
 break; }
case 23: {
 //BA.debugLineNum = 127;BA.debugLine="Return \"Очередь пуста. \" & BuildReasonText(de";
if (true) return "Очередь пуста. "+_buildreasontext(_details);
 break; }
case 24: {
 //BA.debugLineNum = 129;BA.debugLine="Return \"Событие завершения проигнорировано. \"";
if (true) return "Событие завершения проигнорировано. "+_buildreasontext(_details);
 break; }
}
;
 break; }
case 4: {
 //BA.debugLineNum = 132;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"старт завершен","старт не завершен","автостарт воспроизведение начало","воспроизведение остановлено","плеер заблокирован")) {
case 0: {
 //BA.debugLineNum = 134;BA.debugLine="Return \"Старт плеера завершен.\"";
if (true) return "Старт плеера завершен.";
 break; }
case 1: {
 //BA.debugLineNum = 136;BA.debugLine="Return \"Старт плеера не завершен. \" & BuildRe";
if (true) return "Старт плеера не завершен. "+_buildreasontext(_details);
 break; }
case 2: {
 //BA.debugLineNum = 138;BA.debugLine="Return \"Автостарт воспроизведения.\"";
if (true) return "Автостарт воспроизведения.";
 break; }
case 3: {
 //BA.debugLineNum = 140;BA.debugLine="Return \"Воспроизведение остановлено. \" & Buil";
if (true) return "Воспроизведение остановлено. "+_buildreasontext(_details);
 break; }
case 4: {
 //BA.debugLineNum = 142;BA.debugLine="Return \"Плеер заблокирован.\"";
if (true) return "Плеер заблокирован.";
 break; }
}
;
 break; }
case 5: {
 //BA.debugLineNum = 145;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"трек загружен в кэш","ошибка загрузки трека","кэш треков обновлен","кэш рекламы обновлен","аудит кэша","очистка кэша","реклама удалена из кэша","ошибка подготовки трека","нет локального файла")) {
case 0: {
 //BA.debugLineNum = 147;BA.debugLine="Return \"Кэш: Загружен трек \" & DefaultIfEmpty";
if (true) return "Кэш: Загружен трек "+_defaultifempty(_extractdetailvalue(_details,"id"),"без идентификатора");
 break; }
case 1: {
 //BA.debugLineNum = 149;BA.debugLine="Return \"Кэш: Не удалось загрузить трек. \" & B";
if (true) return "Кэш: Не удалось загрузить трек. "+_buildreasontext(_details);
 break; }
case 2: {
 //BA.debugLineNum = 151;BA.debugLine="Return \"Кэш: Треки проверены. \" & BuildCounts";
if (true) return "Кэш: Треки проверены. "+_buildcountstext(_details);
 break; }
case 3: {
 //BA.debugLineNum = 153;BA.debugLine="Return \"Кэш: Реклама проверена. \" & BuildCoun";
if (true) return "Кэш: Реклама проверена. "+_buildcountstext(_details);
 break; }
case 4: {
 //BA.debugLineNum = 155;BA.debugLine="Return \"Кэш: Проверен. \" & BuildCountsText(de";
if (true) return "Кэш: Проверен. "+_buildcountstext(_details);
 break; }
case 5: {
 //BA.debugLineNum = 157;BA.debugLine="Return \"Кэш: Очистка завершена. \" & BuildCoun";
if (true) return "Кэш: Очистка завершена. "+_buildcountstext(_details);
 break; }
case 6: {
 //BA.debugLineNum = 159;BA.debugLine="Return \"Кэш: Удалена устаревшая реклама \" & E";
if (true) return "Кэш: Удалена устаревшая реклама "+_extractdetailvalue(_details,"id");
 break; }
case 7: {
 //BA.debugLineNum = 161;BA.debugLine="Return \"Кэш: Ошибка подготовки трека. \" & Bui";
if (true) return "Кэш: Ошибка подготовки трека. "+_buildreasontext(_details);
 break; }
case 8: {
 //BA.debugLineNum = 163;BA.debugLine="Return \"Кэш: Локальный файл не найден для тре";
if (true) return "Кэш: Локальный файл не найден для трека "+_extractdetailvalue(_details,"trackId");
 break; }
}
;
 break; }
case 6: {
 //BA.debugLineNum = 166;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"история отправлена","история не отправлена","ошибка отправки","ошибка истории","не удалось прочитать файл истории")) {
case 0: {
 //BA.debugLineNum = 168;BA.debugLine="Return \"История отправлена. Записей: \" & Defa";
if (true) return "История отправлена. Записей: "+_defaultifempty(_extractdetailvalue(_details,"records"),"0");
 break; }
case 1: {
 //BA.debugLineNum = 170;BA.debugLine="Return \"История не отправлена. Записей: \" & D";
if (true) return "История не отправлена. Записей: "+_defaultifempty(_extractdetailvalue(_details,"records"),"0");
 break; }
case 2: {
 //BA.debugLineNum = 172;BA.debugLine="Return \"Ошибка отправки истории. \" & BuildRea";
if (true) return "Ошибка отправки истории. "+_buildreasontext(_details);
 break; }
case 3: {
 //BA.debugLineNum = 174;BA.debugLine="Return \"Ошибка чтения истории.\"";
if (true) return "Ошибка чтения истории.";
 break; }
case 4: {
 //BA.debugLineNum = 176;BA.debugLine="Return \"Не удалось прочитать файл истории \" &";
if (true) return "Не удалось прочитать файл истории "+_extractdetailvalue(_details,"file");
 break; }
}
;
 break; }
case 7: {
 //BA.debugLineNum = 179;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"воспроизведение","кэш","устройство","ресурсы","сеть")) {
case 0: {
 //BA.debugLineNum = 181;BA.debugLine="Return \"Воспроизведение: этап=\" & ExtractDeta";
if (true) return "Воспроизведение: этап="+_extractdetailvalue(_details,"stage")+", играет="+_extractdetailvalue(_details,"playing")+", трек="+_extractdetailvalue(_details,"currentTrackId")+", очередь="+_extractdetailvalue(_details,"queue")+", запас="+_extractdetailvalue(_details,"reserve")+_buildhealthaudiosettingstext(_details);
 break; }
case 1: {
 //BA.debugLineNum = 188;BA.debugLine="Return \"Кэш: \" & DefaultIfEmpty(ExtractDetail";
if (true) return "Кэш: "+_defaultifempty(_extractdetailvalue(_details,"status"),"неизвестно");
 break; }
case 2: {
 //BA.debugLineNum = 190;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+_extractdetailvalue(_details,"device")+", id="+_extractdetailvalue(_details,"deviceId")+", ОС="+_extractdetailtail(_details,"os");
 break; }
case 3: {
 //BA.debugLineNum = 194;BA.debugLine="Return \"Система: RAM=\" & ExtractDetailValue(d";
if (true) return "Система: RAM="+_extractdetailvalue(_details,"ramFreeMb")+" МБ"+", диск="+_extractdetailvalue(_details,"diskFreeMb")+"/"+_extractdetailvalue(_details,"diskTotalMb")+" МБ";
 break; }
case 4: {
 //BA.debugLineNum = 197;BA.debugLine="Return \"Сеть: ошибок=\" & ExtractDetailValue(d";
if (true) return "Сеть: ошибок="+_extractdetailvalue(_details,"netErrors")+", данные ок "+_extractdetailvalue(_details,"lastDataOkAgoSec")+" сек назад"+", история ок "+_extractdetailvalue(_details,"lastHistoryOkAgoSec")+" сек назад";
 break; }
}
;
 break; }
case 8: {
 //BA.debugLineNum = 202;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"источник","устройство","платформа","память","память доступно","диск","кэш треков","кэш рекламы","история")) {
case 0: {
 //BA.debugLineNum = 204;BA.debugLine="Return \"Система: источник=\" & details";
if (true) return "Система: источник="+_details;
 break; }
case 1: {
 //BA.debugLineNum = 206;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+_extractdetailvalue(_details,"name")+", id="+_extractdetailvalue(_details,"id");
 break; }
case 2: {
 //BA.debugLineNum = 208;BA.debugLine="Return \"Система: \" & ExtractDetailTail(detail";
if (true) return "Система: "+_extractdetailtail(_details,"os");
 break; }
case 3: {
 //BA.debugLineNum = 210;BA.debugLine="Return \"RAM: свободно \" & ExtractDetailValue(";
if (true) return "RAM: свободно "+_extractdetailvalue(_details,"ramFreeMb")+" МБ";
 break; }
case 4: {
 //BA.debugLineNum = 212;BA.debugLine="Return \"RAM: приложению \" & ExtractDetailValu";
if (true) return "RAM: приложению "+_extractdetailvalue(_details,"ramTotalMb")+" МБ";
 break; }
case 5: {
 //BA.debugLineNum = 214;BA.debugLine="Return \"Диск: свободно \" & ExtractDetailValue";
if (true) return "Диск: свободно "+_extractdetailvalue(_details,"diskFreeMb")+" МБ из "+_extractdetailvalue(_details,"diskTotalMb")+" МБ";
 break; }
case 6: {
 //BA.debugLineNum = 216;BA.debugLine="Return \"Кэш: треков=\" & ExtractDetailValue(de";
if (true) return "Кэш: треков="+_extractdetailvalue(_details,"trackCount")+", "+_extractdetailvalue(_details,"trackMb")+" МБ, индекс="+_extractdetailvalue(_details,"trackIndex");
 break; }
case 7: {
 //BA.debugLineNum = 218;BA.debugLine="Return \"Кэш: рекламы=\" & ExtractDetailValue(d";
if (true) return "Кэш: рекламы="+_extractdetailvalue(_details,"adCount")+", "+_extractdetailvalue(_details,"adMb")+" МБ, индекс="+_extractdetailvalue(_details,"adIndex");
 break; }
case 8: {
 //BA.debugLineNum = 220;BA.debugLine="Return \"История: ожидает отправки \" & Extract";
if (true) return "История: ожидает отправки "+_extractdetailvalue(_details,"pendingHistory")+" записей";
 break; }
}
;
 break; }
}
;
 //BA.debugLineNum = 223;BA.debugLine="Dim genericText As String = message";
_generictext = _message;
 //BA.debugLineNum = 224;BA.debugLine="If details <> \"\" Then genericText = genericText &";
if ((_details).equals("") == false) { 
_generictext = _generictext+". "+_details;};
 //BA.debugLineNum = 225;BA.debugLine="Return genericText";
if (true) return _generictext;
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _buildreasontext(String _details) throws Exception{
String _messagetext = "";
String _reasontext = "";
String _kindtext = "";
String _steptext = "";
String _resulttext = "";
 //BA.debugLineNum = 286;BA.debugLine="Private Sub BuildReasonText(details As String) As";
 //BA.debugLineNum = 287;BA.debugLine="If details = \"\" Then Return \"\"";
if ((_details).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 288;BA.debugLine="Dim messageText As String = ExtractDetailTail(det";
_messagetext = _extractdetailtail(_details,"message");
 //BA.debugLineNum = 289;BA.debugLine="If messageText <> \"\" Then Return messageText";
if ((_messagetext).equals("") == false) { 
if (true) return _messagetext;};
 //BA.debugLineNum = 290;BA.debugLine="Dim reasonText As String = ExtractDetailTail(deta";
_reasontext = _extractdetailtail(_details,"reason");
 //BA.debugLineNum = 291;BA.debugLine="If reasonText <> \"\" Then Return \"Причина: \" & rea";
if ((_reasontext).equals("") == false) { 
if (true) return "Причина: "+_reasontext;};
 //BA.debugLineNum = 292;BA.debugLine="Dim kindText As String = ExtractDetailValue(detai";
_kindtext = _extractdetailvalue(_details,"kind");
 //BA.debugLineNum = 293;BA.debugLine="If kindText <> \"\" Then Return \"Причина: \" & kindT";
if ((_kindtext).equals("") == false) { 
if (true) return "Причина: "+_kindtext;};
 //BA.debugLineNum = 294;BA.debugLine="Dim stepText As String = ExtractDetailValue(detai";
_steptext = _extractdetailvalue(_details,"step");
 //BA.debugLineNum = 295;BA.debugLine="If stepText <> \"\" Then Return \"Шаг: \" & stepText";
if ((_steptext).equals("") == false) { 
if (true) return "Шаг: "+_steptext;};
 //BA.debugLineNum = 296;BA.debugLine="Dim resultText As String = ExtractDetailValue(det";
_resulttext = _extractdetailvalue(_details,"result");
 //BA.debugLineNum = 297;BA.debugLine="If resultText <> \"\" Then Return \"Результат: \" & r";
if ((_resulttext).equals("") == false) { 
if (true) return "Результат: "+_resulttext;};
 //BA.debugLineNum = 298;BA.debugLine="Return details";
if (true) return _details;
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _buildversionplayertext(String _details) throws Exception{
String _versiontext = "";
String _playertext = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 228;BA.debugLine="Private Sub BuildVersionPlayerText(details As Stri";
 //BA.debugLineNum = 229;BA.debugLine="Dim versionText As String = ExtractDetailValue(de";
_versiontext = _extractdetailvalue(_details,"version");
 //BA.debugLineNum = 230;BA.debugLine="Dim playerText As String = ExtractDetailValue(det";
_playertext = _extractdetailvalue(_details,"player");
 //BA.debugLineNum = 231;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 232;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 233;BA.debugLine="If versionText <> \"\" Then parts.Add(\"Версия \" & v";
if ((_versiontext).equals("") == false) { 
_parts.Add((Object)("Версия "+_versiontext));};
 //BA.debugLineNum = 234;BA.debugLine="If playerText <> \"\" Then parts.Add(\"Плеер \" & pla";
if ((_playertext).equals("") == false) { 
_parts.Add((Object)("Плеер "+_playertext));};
 //BA.debugLineNum = 235;BA.debugLine="If parts.Size = 0 Then Return \"Запуск\"";
if (_parts.getSize()==0) { 
if (true) return "Запуск";};
 //BA.debugLineNum = 236;BA.debugLine="Return JoinWords(parts)";
if (true) return _joinwords(_parts);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _defaultifempty(String _value,String _fallback) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Private Sub DefaultIfEmpty(value As String, fallba";
 //BA.debugLineNum = 334;BA.debugLine="If value = \"\" Then Return fallback";
if ((_value).equals("")) { 
if (true) return _fallback;};
 //BA.debugLineNum = 335;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailtail(String _details,String _key) throws Exception{
String _marker = "";
int _startindex = 0;
 //BA.debugLineNum = 348;BA.debugLine="Private Sub ExtractDetailTail(details As String, k";
 //BA.debugLineNum = 349;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
 //BA.debugLineNum = 350;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
 //BA.debugLineNum = 351;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
 //BA.debugLineNum = 352;BA.debugLine="Return details.SubString(startIndex + marker.Leng";
if (true) return _details.substring((int) (_startindex+_marker.length())).trim();
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailvalue(String _details,String _key) throws Exception{
String _marker = "";
int _startindex = 0;
String _value = "";
int _nextspace = 0;
 //BA.debugLineNum = 338;BA.debugLine="Private Sub ExtractDetailValue(details As String,";
 //BA.debugLineNum = 339;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
 //BA.debugLineNum = 340;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
 //BA.debugLineNum = 341;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
 //BA.debugLineNum = 342;BA.debugLine="Dim value As String = details.SubString(startInde";
_value = _details.substring((int) (_startindex+_marker.length())).trim();
 //BA.debugLineNum = 343;BA.debugLine="Dim nextSpace As Int = value.IndexOf(\" \")";
_nextspace = _value.indexOf(" ");
 //BA.debugLineNum = 344;BA.debugLine="If nextSpace >= 0 Then value = value.SubString2(0";
if (_nextspace>=0) { 
_value = _value.substring((int) (0),_nextspace);};
 //BA.debugLineNum = 345;BA.debugLine="Return value.Trim";
if (true) return _value.trim();
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _joinwords(anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 323;BA.debugLine="Private Sub JoinWords(parts As List) As String";
 //BA.debugLineNum = 324;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 325;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 326;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 327;BA.debugLine="If i > 0 Then sb.Append(\". \")";
if (_i>0) { 
_sb.Append(". ");};
 //BA.debugLineNum = 328;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
 //BA.debugLineNum = 330;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public String  _traceitemlabelfromdetails(String _details) throws Exception{
String _itemtype = "";
String _itemid = "";
 //BA.debugLineNum = 239;BA.debugLine="Private Sub TraceItemLabelFromDetails(details As S";
 //BA.debugLineNum = 240;BA.debugLine="Dim itemType As String = ExtractDetailValue(detai";
_itemtype = _extractdetailvalue(_details,"type");
 //BA.debugLineNum = 241;BA.debugLine="Dim itemId As String = DefaultIfEmpty(ExtractDeta";
_itemid = _defaultifempty(_extractdetailvalue(_details,"id"),_extractdetailvalue(_details,"trackId"));
 //BA.debugLineNum = 242;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 243;BA.debugLine="If itemId <> \"\" Then Return \"рекламу \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "рекламу "+_itemid;};
 //BA.debugLineNum = 244;BA.debugLine="Return \"рекламу\"";
if (true) return "рекламу";
 };
 //BA.debugLineNum = 246;BA.debugLine="If itemId <> \"\" Then Return \"трек \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "трек "+_itemid;};
 //BA.debugLineNum = 247;BA.debugLine="Return \"трек\"";
if (true) return "трек";
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
