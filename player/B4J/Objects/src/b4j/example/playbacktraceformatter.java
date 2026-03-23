package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbacktraceformatter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbacktraceformatter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbacktraceformatter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=75759616;
 //BA.debugLineNum = 75759616;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="End Sub";
return "";
}
public String  _buildhumantracemessage(b4j.example.playbacktraceformatter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildhumantracemessage", false))
	 {return ((String) Debug.delegate(ba, "buildhumantracemessage", new Object[] {_category,_message,_details}));}
String _delaysec = "";
String _playertext = "";
String _itemlabel = "";
String _audiosettingstext = "";
String _skipreason = "";
String _sourcetext = "";
String _generictext = "";
RDebugUtils.currentLine=75825152;
 //BA.debugLineNum = 75825152;BA.debugLine="Public Sub BuildHumanTraceMessage(category As Stri";
RDebugUtils.currentLine=75825153;
 //BA.debugLineNum = 75825153;BA.debugLine="Select category";
switch (BA.switchObjectToInt(_category,"app","network","audio","playback","player","cache","history","health","system")) {
case 0: {
RDebugUtils.currentLine=75825155;
 //BA.debugLineNum = 75825155;BA.debugLine="If message = \"запуск\" Then";
if ((_message).equals("запуск")) { 
RDebugUtils.currentLine=75825156;
 //BA.debugLineNum = 75825156;BA.debugLine="Return \"Приложение запущено. \" & BuildVersionP";
if (true) return "Приложение запущено. "+__ref._buildversionplayertext /*String*/ (null,_details);
 };
 break; }
case 1: {
RDebugUtils.currentLine=75825159;
 //BA.debugLineNum = 75825159;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"запрос данных","data загружены","data ошибка","data сообщение","data некорректны","переход в retry","data timeout","метаданные плейлистов обновлены","ошибка метаданных плейлиста","ошибка очереди","media path восстановлен","деградация media path")) {
case 0: {
RDebugUtils.currentLine=75825161;
 //BA.debugLineNum = 75825161;BA.debugLine="Return \"Запрос данных\"";
if (true) return "Запрос данных";
 break; }
case 1: {
RDebugUtils.currentLine=75825163;
 //BA.debugLineNum = 75825163;BA.debugLine="Return \"Данные получены.\"";
if (true) return "Данные получены.";
 break; }
case 2: {
RDebugUtils.currentLine=75825165;
 //BA.debugLineNum = 75825165;BA.debugLine="Return \"Ошибка запроса данных. \" & BuildReaso";
if (true) return "Ошибка запроса данных. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=75825167;
 //BA.debugLineNum = 75825167;BA.debugLine="Return \"Сервер вернул сообщение. \" & BuildRea";
if (true) return "Сервер вернул сообщение. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=75825169;
 //BA.debugLineNum = 75825169;BA.debugLine="Return \"Ошибка данных от сервера. \" & BuildRe";
if (true) return "Ошибка данных от сервера. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=75825171;
 //BA.debugLineNum = 75825171;BA.debugLine="Dim delaySec As String = ExtractDetailValue(d";
_delaysec = __ref._extractdetailvalue /*String*/ (null,_details,"delaySec");
RDebugUtils.currentLine=75825172;
 //BA.debugLineNum = 75825172;BA.debugLine="If delaySec = \"\" Then delaySec = ExtractDetai";
if ((_delaysec).equals("")) { 
_delaysec = __ref._extractdetailvalue /*String*/ (null,_details,"delay");};
RDebugUtils.currentLine=75825173;
 //BA.debugLineNum = 75825173;BA.debugLine="If delaySec <> \"\" Then Return \"Повторный запр";
if ((_delaysec).equals("") == false) { 
if (true) return "Повторный запрос данных через "+_delaysec+" секунд";};
RDebugUtils.currentLine=75825174;
 //BA.debugLineNum = 75825174;BA.debugLine="Return \"Повторный запрос данных позже\"";
if (true) return "Повторный запрос данных позже";
 break; }
case 6: {
RDebugUtils.currentLine=75825176;
 //BA.debugLineNum = 75825176;BA.debugLine="Return \"Сервер не ответил вовремя. \" & BuildR";
if (true) return "Сервер не ответил вовремя. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 7: {
RDebugUtils.currentLine=75825178;
 //BA.debugLineNum = 75825178;BA.debugLine="Return \"Метаданные плейлистов обновлены. \" &";
if (true) return "Метаданные плейлистов обновлены. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 8: {
RDebugUtils.currentLine=75825180;
 //BA.debugLineNum = 75825180;BA.debugLine="Return \"Не удалось загрузить метаданные плейл";
if (true) return "Не удалось загрузить метаданные плейлиста. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 9: {
RDebugUtils.currentLine=75825182;
 //BA.debugLineNum = 75825182;BA.debugLine="Return \"Не удалось получить очередь. \" & Buil";
if (true) return "Не удалось получить очередь. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 10: {
RDebugUtils.currentLine=75825184;
 //BA.debugLineNum = 75825184;BA.debugLine="Return \"Доступ к медиа восстановлен.\"";
if (true) return "Доступ к медиа восстановлен.";
 break; }
case 11: {
RDebugUtils.currentLine=75825186;
 //BA.debugLineNum = 75825186;BA.debugLine="Return \"Доступ к медиа ухудшился.\"";
if (true) return "Доступ к медиа ухудшился.";
 break; }
}
;
 break; }
case 2: {
RDebugUtils.currentLine=75825189;
 //BA.debugLineNum = 75825189;BA.debugLine="Dim playerText As String = \"Плеер \" & ExtractDe";
_playertext = "Плеер "+__ref._extractdetailvalue /*String*/ (null,_details,"player");
RDebugUtils.currentLine=75825190;
 //BA.debugLineNum = 75825190;BA.debugLine="Dim itemLabel As String = TraceItemLabelFromDet";
_itemlabel = __ref._traceitemlabelfromdetails /*String*/ (null,_details);
RDebugUtils.currentLine=75825191;
 //BA.debugLineNum = 75825191;BA.debugLine="Dim audioSettingsText As String = BuildAudioSet";
_audiosettingstext = __ref._buildaudiosettingstext /*String*/ (null,_details);
RDebugUtils.currentLine=75825192;
 //BA.debugLineNum = 75825192;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"плеер load","плеер ready","плеер play","плеер complete","плеер error","не удалось запустить трек","таймаут старта трека","таймаут preload")) {
case 0: {
RDebugUtils.currentLine=75825194;
 //BA.debugLineNum = 75825194;BA.debugLine="Return playerText & \": Загружен \" & itemLabel";
if (true) return _playertext+": Загружен "+_itemlabel+_audiosettingstext;
 break; }
case 1: {
RDebugUtils.currentLine=75825196;
 //BA.debugLineNum = 75825196;BA.debugLine="If ExtractDetailValue(details, \"mode\") = \"pre";
if ((__ref._extractdetailvalue /*String*/ (null,_details,"mode")).equals("prepare")) { 
RDebugUtils.currentLine=75825197;
 //BA.debugLineNum = 75825197;BA.debugLine="Return playerText & \": Подготовлен \" & itemL";
if (true) return _playertext+": Подготовлен "+_itemlabel+_audiosettingstext;
 };
RDebugUtils.currentLine=75825199;
 //BA.debugLineNum = 75825199;BA.debugLine="Return playerText & \": Готов к воспроизведени";
if (true) return _playertext+": Готов к воспроизведению "+_itemlabel+_audiosettingstext;
 break; }
case 2: {
RDebugUtils.currentLine=75825201;
 //BA.debugLineNum = 75825201;BA.debugLine="Return playerText & \": Воспроизведение \" & it";
if (true) return _playertext+": Воспроизведение "+_itemlabel+_audiosettingstext;
 break; }
case 3: {
RDebugUtils.currentLine=75825203;
 //BA.debugLineNum = 75825203;BA.debugLine="Return playerText & \": Закончил \" & itemLabel";
if (true) return _playertext+": Закончил "+_itemlabel;
 break; }
case 4: {
RDebugUtils.currentLine=75825205;
 //BA.debugLineNum = 75825205;BA.debugLine="Return playerText & \": Ошибка \" & itemLabel &";
if (true) return _playertext+": Ошибка "+_itemlabel+". "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=75825207;
 //BA.debugLineNum = 75825207;BA.debugLine="Return playerText & \": Не удалось запустить \"";
if (true) return _playertext+": Не удалось запустить "+_itemlabel+". "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 6: {
RDebugUtils.currentLine=75825209;
 //BA.debugLineNum = 75825209;BA.debugLine="Return playerText & \": Не дождались старта \"";
if (true) return _playertext+": Не дождались старта "+_itemlabel;
 break; }
case 7: {
RDebugUtils.currentLine=75825211;
 //BA.debugLineNum = 75825211;BA.debugLine="Return playerText & \": Не дождались подготовк";
if (true) return _playertext+": Не дождались подготовки "+_itemlabel;
 break; }
}
;
 break; }
case 3: {
RDebugUtils.currentLine=75825214;
 //BA.debugLineNum = 75825214;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"первый трек выбран из кэша","populate queue start","populate queue done","populate queue fail","dispatch next","dispatch break","dispatch prepared","dispatch переход","prefetch start","prefetch done","prefetch fail","prefetch skip","crossfade trigger","старт трека","смена трека","watchdog stall","watchdog recovery","break переход начало","break переход итог","break переход fade","break переход пропущен","вставлен break","вставлена реклама","очередь пуста","audio complete пропущен")) {
case 0: {
RDebugUtils.currentLine=75825216;
 //BA.debugLineNum = 75825216;BA.debugLine="Return \"Первый трек выбран из кэша.\"";
if (true) return "Первый трек выбран из кэша.";
 break; }
case 1: {
RDebugUtils.currentLine=75825218;
 //BA.debugLineNum = 75825218;BA.debugLine="Return \"Подготовка очереди.\"";
if (true) return "Подготовка очереди.";
 break; }
case 2: {
RDebugUtils.currentLine=75825220;
 //BA.debugLineNum = 75825220;BA.debugLine="Return \"Очередь подготовлена. Элементов: \" &";
if (true) return "Очередь подготовлена. Элементов: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"queue"),"0");
 break; }
case 3: {
RDebugUtils.currentLine=75825222;
 //BA.debugLineNum = 75825222;BA.debugLine="Return \"Не удалось подготовить очередь. \" & B";
if (true) return "Не удалось подготовить очередь. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=75825224;
 //BA.debugLineNum = 75825224;BA.debugLine="Return \"Следующий элемент очереди: \" & TraceI";
if (true) return "Следующий элемент очереди: "+__ref._traceitemlabelfromdetails /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=75825226;
 //BA.debugLineNum = 75825226;BA.debugLine="Return \"Начата обработка break.\"";
if (true) return "Начата обработка break.";
 break; }
case 6: {
RDebugUtils.currentLine=75825228;
 //BA.debugLineNum = 75825228;BA.debugLine="Return \"Запущен заранее подготовленный элемен";
if (true) return "Запущен заранее подготовленный элемент.";
 break; }
case 7: {
RDebugUtils.currentLine=75825230;
 //BA.debugLineNum = 75825230;BA.debugLine="Return \"Переход к следующему элементу.\"";
if (true) return "Переход к следующему элементу.";
 break; }
case 8: {
RDebugUtils.currentLine=75825232;
 //BA.debugLineNum = 75825232;BA.debugLine="Return \"Начата подготовка следующего элемента";
if (true) return "Начата подготовка следующего элемента.";
 break; }
case 9: {
RDebugUtils.currentLine=75825234;
 //BA.debugLineNum = 75825234;BA.debugLine="Return \"Следующий элемент подготовлен заранее";
if (true) return "Следующий элемент подготовлен заранее.";
 break; }
case 10: {
RDebugUtils.currentLine=75825236;
 //BA.debugLineNum = 75825236;BA.debugLine="Return \"Не удалось заранее подготовить следую";
if (true) return "Не удалось заранее подготовить следующий элемент. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 11: {
RDebugUtils.currentLine=75825238;
 //BA.debugLineNum = 75825238;BA.debugLine="Dim skipReason As String = ExtractDetailValue";
_skipreason = __ref._extractdetailvalue /*String*/ (null,_details,"reason");
RDebugUtils.currentLine=75825239;
 //BA.debugLineNum = 75825239;BA.debugLine="If skipReason = \"break_ahead\" Then Return \"Пр";
if ((_skipreason).equals("break_ahead")) { 
if (true) return "Предварительная подготовка отложена: впереди break.";};
RDebugUtils.currentLine=75825240;
 //BA.debugLineNum = 75825240;BA.debugLine="Return \"Предварительная подготовка пропущена.";
if (true) return "Предварительная подготовка пропущена. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 12: {
RDebugUtils.currentLine=75825242;
 //BA.debugLineNum = 75825242;BA.debugLine="Return \"Начат кроссфейд на следующий трек.\"";
if (true) return "Начат кроссфейд на следующий трек.";
 break; }
case 13: {
RDebugUtils.currentLine=75825244;
 //BA.debugLineNum = 75825244;BA.debugLine="Dim sourceText As String = ExtractDetailValue";
_sourcetext = __ref._extractdetailvalue /*String*/ (null,_details,"source");
RDebugUtils.currentLine=75825245;
 //BA.debugLineNum = 75825245;BA.debugLine="If sourceText <> \"\" Then";
if ((_sourcetext).equals("") == false) { 
RDebugUtils.currentLine=75825246;
 //BA.debugLineNum = 75825246;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(d";
if (true) return "Старт трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId")+". Источник: "+_sourcetext;
 };
RDebugUtils.currentLine=75825248;
 //BA.debugLineNum = 75825248;BA.debugLine="Return \"Старт трека \" & ExtractDetailValue(de";
if (true) return "Старт трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
case 14: {
RDebugUtils.currentLine=75825250;
 //BA.debugLineNum = 75825250;BA.debugLine="Return \"Переход после трека \" & ExtractDetail";
if (true) return "Переход после трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
case 15: {
RDebugUtils.currentLine=75825252;
 //BA.debugLineNum = 75825252;BA.debugLine="Return \"Воспроизведение зависло на треке \" &";
if (true) return "Воспроизведение зависло на треке "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"trackId"),"без идентификатора")+". Запускаю восстановление.";
 break; }
case 16: {
RDebugUtils.currentLine=75825254;
 //BA.debugLineNum = 75825254;BA.debugLine="Return \"Восстановление воспроизведения. \" & B";
if (true) return "Восстановление воспроизведения. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 17: {
RDebugUtils.currentLine=75825256;
 //BA.debugLineNum = 75825256;BA.debugLine="Return \"Начат переход на break.\"";
if (true) return "Начат переход на break.";
 break; }
case 18: {
RDebugUtils.currentLine=75825258;
 //BA.debugLineNum = 75825258;BA.debugLine="Return \"Переход на break завершен. \" & BuildR";
if (true) return "Переход на break завершен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 19: {
RDebugUtils.currentLine=75825260;
 //BA.debugLineNum = 75825260;BA.debugLine="Return \"Плавное завершение текущего элемента.";
if (true) return "Плавное завершение текущего элемента.";
 break; }
case 20: {
RDebugUtils.currentLine=75825262;
 //BA.debugLineNum = 75825262;BA.debugLine="Return \"Переход на break пропущен. \" & BuildR";
if (true) return "Переход на break пропущен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 21: {
RDebugUtils.currentLine=75825264;
 //BA.debugLineNum = 75825264;BA.debugLine="Return \"В очередь вставлен break.\"";
if (true) return "В очередь вставлен break.";
 break; }
case 22: {
RDebugUtils.currentLine=75825266;
 //BA.debugLineNum = 75825266;BA.debugLine="Return \"Подготовлен переход на рекламу.\"";
if (true) return "Подготовлен переход на рекламу.";
 break; }
case 23: {
RDebugUtils.currentLine=75825268;
 //BA.debugLineNum = 75825268;BA.debugLine="Return \"Очередь пуста. \" & BuildReasonText(de";
if (true) return "Очередь пуста. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 24: {
RDebugUtils.currentLine=75825270;
 //BA.debugLineNum = 75825270;BA.debugLine="Return \"Событие завершения проигнорировано. \"";
if (true) return "Событие завершения проигнорировано. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
}
;
 break; }
case 4: {
RDebugUtils.currentLine=75825273;
 //BA.debugLineNum = 75825273;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"старт завершен","старт не завершен","автостарт воспроизведение начало","воспроизведение остановлено","плеер заблокирован")) {
case 0: {
RDebugUtils.currentLine=75825275;
 //BA.debugLineNum = 75825275;BA.debugLine="Return \"Старт плеера завершен.\"";
if (true) return "Старт плеера завершен.";
 break; }
case 1: {
RDebugUtils.currentLine=75825277;
 //BA.debugLineNum = 75825277;BA.debugLine="Return \"Старт плеера не завершен. \" & BuildRe";
if (true) return "Старт плеера не завершен. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 2: {
RDebugUtils.currentLine=75825279;
 //BA.debugLineNum = 75825279;BA.debugLine="Return \"Автостарт воспроизведения.\"";
if (true) return "Автостарт воспроизведения.";
 break; }
case 3: {
RDebugUtils.currentLine=75825281;
 //BA.debugLineNum = 75825281;BA.debugLine="Return \"Воспроизведение остановлено. \" & Buil";
if (true) return "Воспроизведение остановлено. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=75825283;
 //BA.debugLineNum = 75825283;BA.debugLine="Return \"Плеер заблокирован.\"";
if (true) return "Плеер заблокирован.";
 break; }
}
;
 break; }
case 5: {
RDebugUtils.currentLine=75825286;
 //BA.debugLineNum = 75825286;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"трек загружен в кэш","ошибка загрузки трека","кэш треков обновлен","кэш рекламы обновлен","аудит кэша","очистка кэша","реклама удалена из кэша","ошибка подготовки трека","нет локального файла")) {
case 0: {
RDebugUtils.currentLine=75825288;
 //BA.debugLineNum = 75825288;BA.debugLine="Return \"Кэш: Загружен трек \" & DefaultIfEmpty";
if (true) return "Кэш: Загружен трек "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"id"),"без идентификатора");
 break; }
case 1: {
RDebugUtils.currentLine=75825290;
 //BA.debugLineNum = 75825290;BA.debugLine="Return \"Кэш: Не удалось загрузить трек. \" & B";
if (true) return "Кэш: Не удалось загрузить трек. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 2: {
RDebugUtils.currentLine=75825292;
 //BA.debugLineNum = 75825292;BA.debugLine="Return \"Кэш треков проверен. \" & BuildCountsT";
if (true) return "Кэш треков проверен. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=75825294;
 //BA.debugLineNum = 75825294;BA.debugLine="Return \"Кэш рекламы проверен. \" & BuildCounts";
if (true) return "Кэш рекламы проверен. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 4: {
RDebugUtils.currentLine=75825296;
 //BA.debugLineNum = 75825296;BA.debugLine="Return \"Кэш проверен. \" & BuildCountsText(det";
if (true) return "Кэш проверен. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 5: {
RDebugUtils.currentLine=75825298;
 //BA.debugLineNum = 75825298;BA.debugLine="Return \"Очистка кэша завершена. \" & BuildCoun";
if (true) return "Очистка кэша завершена. "+__ref._buildcountstext /*String*/ (null,_details);
 break; }
case 6: {
RDebugUtils.currentLine=75825300;
 //BA.debugLineNum = 75825300;BA.debugLine="Return \"Кэш: Удалена устаревшая реклама \" & E";
if (true) return "Кэш: Удалена устаревшая реклама "+__ref._extractdetailvalue /*String*/ (null,_details,"id");
 break; }
case 7: {
RDebugUtils.currentLine=75825302;
 //BA.debugLineNum = 75825302;BA.debugLine="Return \"Кэш: Ошибка подготовки трека. \" & Bui";
if (true) return "Кэш: Ошибка подготовки трека. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 8: {
RDebugUtils.currentLine=75825304;
 //BA.debugLineNum = 75825304;BA.debugLine="Return \"Кэш: Локальный файл не найден для тре";
if (true) return "Кэш: Локальный файл не найден для трека "+__ref._extractdetailvalue /*String*/ (null,_details,"trackId");
 break; }
}
;
 break; }
case 6: {
RDebugUtils.currentLine=75825307;
 //BA.debugLineNum = 75825307;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"история отправлена","история не отправлена","ошибка отправки","ошибка истории","не удалось прочитать файл истории")) {
case 0: {
RDebugUtils.currentLine=75825309;
 //BA.debugLineNum = 75825309;BA.debugLine="Return \"История отправлена. Записей: \" & Defa";
if (true) return "История отправлена. Записей: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"records"),"0");
 break; }
case 1: {
RDebugUtils.currentLine=75825311;
 //BA.debugLineNum = 75825311;BA.debugLine="Return \"История не отправлена. Записей: \" & D";
if (true) return "История не отправлена. Записей: "+__ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"records"),"0");
 break; }
case 2: {
RDebugUtils.currentLine=75825313;
 //BA.debugLineNum = 75825313;BA.debugLine="Return \"Ошибка отправки истории. \" & BuildRea";
if (true) return "Ошибка отправки истории. "+__ref._buildreasontext /*String*/ (null,_details);
 break; }
case 3: {
RDebugUtils.currentLine=75825315;
 //BA.debugLineNum = 75825315;BA.debugLine="Return \"Ошибка чтения истории.\"";
if (true) return "Ошибка чтения истории.";
 break; }
case 4: {
RDebugUtils.currentLine=75825317;
 //BA.debugLineNum = 75825317;BA.debugLine="Return \"Не удалось прочитать файл истории \" &";
if (true) return "Не удалось прочитать файл истории "+__ref._extractdetailvalue /*String*/ (null,_details,"file");
 break; }
}
;
 break; }
case 7: {
RDebugUtils.currentLine=75825320;
 //BA.debugLineNum = 75825320;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"воспроизведение","кэш","устройство","ресурсы","сеть")) {
case 0: {
RDebugUtils.currentLine=75825322;
 //BA.debugLineNum = 75825322;BA.debugLine="Return \"Состояние воспроизведения: этап=\" & E";
if (true) return "Состояние воспроизведения: этап="+__ref._extractdetailvalue /*String*/ (null,_details,"stage")+", играет="+__ref._extractdetailvalue /*String*/ (null,_details,"playing")+", трек="+__ref._extractdetailvalue /*String*/ (null,_details,"currentTrackId")+", очередь="+__ref._extractdetailvalue /*String*/ (null,_details,"queue")+__ref._buildhealthaudiosettingstext /*String*/ (null,_details);
 break; }
case 1: {
RDebugUtils.currentLine=75825328;
 //BA.debugLineNum = 75825328;BA.debugLine="Return \"Состояние кэша: треков=\" & ExtractDet";
if (true) return "Состояние кэша: треков="+__ref._extractdetailvalue /*String*/ (null,_details,"trackCache")+", рекламы="+__ref._extractdetailvalue /*String*/ (null,_details,"adCache")+", индекс треков="+__ref._extractdetailvalue /*String*/ (null,_details,"trackIndex")+", индекс рекламы="+__ref._extractdetailvalue /*String*/ (null,_details,"adIndex");
 break; }
case 2: {
RDebugUtils.currentLine=75825333;
 //BA.debugLineNum = 75825333;BA.debugLine="Return \"Состояние устройства: \" & ExtractDeta";
if (true) return "Состояние устройства: "+__ref._extractdetailvalue /*String*/ (null,_details,"device")+", id="+__ref._extractdetailvalue /*String*/ (null,_details,"deviceId")+", ОС="+__ref._extractdetailtail /*String*/ (null,_details,"os");
 break; }
case 3: {
RDebugUtils.currentLine=75825337;
 //BA.debugLineNum = 75825337;BA.debugLine="Return \"Состояние ресурсов: RAM=\" & ExtractDe";
if (true) return "Состояние ресурсов: RAM="+__ref._extractdetailvalue /*String*/ (null,_details,"ramFreeMb")+" МБ"+", диск="+__ref._extractdetailvalue /*String*/ (null,_details,"diskFreeMb")+"/"+__ref._extractdetailvalue /*String*/ (null,_details,"diskTotalMb")+" МБ";
 break; }
case 4: {
RDebugUtils.currentLine=75825340;
 //BA.debugLineNum = 75825340;BA.debugLine="Return \"Состояние сети: ошибок=\" & ExtractDet";
if (true) return "Состояние сети: ошибок="+__ref._extractdetailvalue /*String*/ (null,_details,"netErrors")+", данные ок "+__ref._extractdetailvalue /*String*/ (null,_details,"lastDataOkAgoSec")+" сек назад"+", история ок "+__ref._extractdetailvalue /*String*/ (null,_details,"lastHistoryOkAgoSec")+" сек назад";
 break; }
}
;
 break; }
case 8: {
RDebugUtils.currentLine=75825345;
 //BA.debugLineNum = 75825345;BA.debugLine="Select message";
switch (BA.switchObjectToInt(_message,"источник","устройство","платформа","память","память доступно","диск","кэш треков","кэш рекламы","история")) {
case 0: {
RDebugUtils.currentLine=75825347;
 //BA.debugLineNum = 75825347;BA.debugLine="Return \"Системный снимок. Источник: \" & detai";
if (true) return "Системный снимок. Источник: "+_details;
 break; }
case 1: {
RDebugUtils.currentLine=75825349;
 //BA.debugLineNum = 75825349;BA.debugLine="Return \"Устройство: \" & ExtractDetailValue(de";
if (true) return "Устройство: "+__ref._extractdetailvalue /*String*/ (null,_details,"name")+", id="+__ref._extractdetailvalue /*String*/ (null,_details,"id");
 break; }
case 2: {
RDebugUtils.currentLine=75825351;
 //BA.debugLineNum = 75825351;BA.debugLine="Return \"Платформа: \" & ExtractDetailTail(deta";
if (true) return "Платформа: "+__ref._extractdetailtail /*String*/ (null,_details,"os");
 break; }
case 3: {
RDebugUtils.currentLine=75825353;
 //BA.debugLineNum = 75825353;BA.debugLine="Return \"Память: свободно \" & ExtractDetailVal";
if (true) return "Память: свободно "+__ref._extractdetailvalue /*String*/ (null,_details,"ramFreeMb")+" МБ";
 break; }
case 4: {
RDebugUtils.currentLine=75825355;
 //BA.debugLineNum = 75825355;BA.debugLine="Return \"Память: доступно приложению \" & Extra";
if (true) return "Память: доступно приложению "+__ref._extractdetailvalue /*String*/ (null,_details,"ramTotalMb")+" МБ";
 break; }
case 5: {
RDebugUtils.currentLine=75825357;
 //BA.debugLineNum = 75825357;BA.debugLine="Return \"Диск: свободно \" & ExtractDetailValue";
if (true) return "Диск: свободно "+__ref._extractdetailvalue /*String*/ (null,_details,"diskFreeMb")+" МБ из "+__ref._extractdetailvalue /*String*/ (null,_details,"diskTotalMb")+" МБ";
 break; }
case 6: {
RDebugUtils.currentLine=75825359;
 //BA.debugLineNum = 75825359;BA.debugLine="Return \"Кэш треков: \" & ExtractDetailValue(de";
if (true) return "Кэш треков: "+__ref._extractdetailvalue /*String*/ (null,_details,"trackCount")+" файлов, "+__ref._extractdetailvalue /*String*/ (null,_details,"trackMb")+" МБ, в индексе "+__ref._extractdetailvalue /*String*/ (null,_details,"trackIndex");
 break; }
case 7: {
RDebugUtils.currentLine=75825361;
 //BA.debugLineNum = 75825361;BA.debugLine="Return \"Кэш рекламы: \" & ExtractDetailValue(d";
if (true) return "Кэш рекламы: "+__ref._extractdetailvalue /*String*/ (null,_details,"adCount")+" файлов, "+__ref._extractdetailvalue /*String*/ (null,_details,"adMb")+" МБ, в индексе "+__ref._extractdetailvalue /*String*/ (null,_details,"adIndex");
 break; }
case 8: {
RDebugUtils.currentLine=75825363;
 //BA.debugLineNum = 75825363;BA.debugLine="Return \"История: ожидает отправки \" & Extract";
if (true) return "История: ожидает отправки "+__ref._extractdetailvalue /*String*/ (null,_details,"pendingHistory")+" записей";
 break; }
}
;
 break; }
}
;
RDebugUtils.currentLine=75825366;
 //BA.debugLineNum = 75825366;BA.debugLine="Dim genericText As String = message";
_generictext = _message;
RDebugUtils.currentLine=75825367;
 //BA.debugLineNum = 75825367;BA.debugLine="If details <> \"\" Then genericText = genericText &";
if ((_details).equals("") == false) { 
_generictext = _generictext+". "+_details;};
RDebugUtils.currentLine=75825368;
 //BA.debugLineNum = 75825368;BA.debugLine="Return genericText";
if (true) return _generictext;
RDebugUtils.currentLine=75825369;
 //BA.debugLineNum = 75825369;BA.debugLine="End Sub";
return "";
}
public String  _addcountpart(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.objects.collections.List _parts,String _details,String _key,String _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "addcountpart", false))
	 {return ((String) Debug.delegate(ba, "addcountpart", new Object[] {_parts,_details,_key,_label}));}
String _value = "";
RDebugUtils.currentLine=76283904;
 //BA.debugLineNum = 76283904;BA.debugLine="Private Sub AddCountPart(parts As List, details As";
RDebugUtils.currentLine=76283905;
 //BA.debugLineNum = 76283905;BA.debugLine="Dim value As String = ExtractDetailValue(details,";
_value = __ref._extractdetailvalue /*String*/ (null,_details,_key);
RDebugUtils.currentLine=76283906;
 //BA.debugLineNum = 76283906;BA.debugLine="If value = \"\" Then Return";
if ((_value).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=76283907;
 //BA.debugLineNum = 76283907;BA.debugLine="parts.Add(label & \" \" & value)";
_parts.Add((Object)(_label+" "+_value));
RDebugUtils.currentLine=76283908;
 //BA.debugLineNum = 76283908;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailvalue(b4j.example.playbacktraceformatter __ref,String _details,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "extractdetailvalue", false))
	 {return ((String) Debug.delegate(ba, "extractdetailvalue", new Object[] {_details,_key}));}
String _marker = "";
int _startindex = 0;
String _value = "";
int _nextspace = 0;
RDebugUtils.currentLine=76480512;
 //BA.debugLineNum = 76480512;BA.debugLine="Private Sub ExtractDetailValue(details As String,";
RDebugUtils.currentLine=76480513;
 //BA.debugLineNum = 76480513;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
RDebugUtils.currentLine=76480514;
 //BA.debugLineNum = 76480514;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
RDebugUtils.currentLine=76480515;
 //BA.debugLineNum = 76480515;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=76480516;
 //BA.debugLineNum = 76480516;BA.debugLine="Dim value As String = details.SubString(startInde";
_value = _details.substring((int) (_startindex+_marker.length())).trim();
RDebugUtils.currentLine=76480517;
 //BA.debugLineNum = 76480517;BA.debugLine="Dim nextSpace As Int = value.IndexOf(\" \")";
_nextspace = _value.indexOf(" ");
RDebugUtils.currentLine=76480518;
 //BA.debugLineNum = 76480518;BA.debugLine="If nextSpace >= 0 Then value = value.SubString2(0";
if (_nextspace>=0) { 
_value = _value.substring((int) (0),_nextspace);};
RDebugUtils.currentLine=76480519;
 //BA.debugLineNum = 76480519;BA.debugLine="Return value.Trim";
if (true) return _value.trim();
RDebugUtils.currentLine=76480520;
 //BA.debugLineNum = 76480520;BA.debugLine="End Sub";
return "";
}
public String  _buildaudiosettingstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildaudiosettingstext", false))
	 {return ((String) Debug.delegate(ba, "buildaudiosettingstext", new Object[] {_details}));}
String _volumetext = "";
String _gaintext = "";
String _gainstate = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=76021760;
 //BA.debugLineNum = 76021760;BA.debugLine="Private Sub BuildAudioSettingsText(details As Stri";
RDebugUtils.currentLine=76021761;
 //BA.debugLineNum = 76021761;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = __ref._extractdetailvalue /*String*/ (null,_details,"volume");
RDebugUtils.currentLine=76021762;
 //BA.debugLineNum = 76021762;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = __ref._extractdetailvalue /*String*/ (null,_details,"gainDb");
RDebugUtils.currentLine=76021763;
 //BA.debugLineNum = 76021763;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = __ref._extractdetailvalue /*String*/ (null,_details,"gainApplied");
RDebugUtils.currentLine=76021764;
 //BA.debugLineNum = 76021764;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76021765;
 //BA.debugLineNum = 76021765;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=76021766;
 //BA.debugLineNum = 76021766;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость \" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость "+_volumetext));};
RDebugUtils.currentLine=76021767;
 //BA.debugLineNum = 76021767;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
RDebugUtils.currentLine=76021768;
 //BA.debugLineNum = 76021768;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
RDebugUtils.currentLine=76021769;
 //BA.debugLineNum = 76021769;BA.debugLine="parts.Add(\"gain \" & gainText & \" дБ\")";
_parts.Add((Object)("gain "+_gaintext+" дБ"));
 }else {
RDebugUtils.currentLine=76021771;
 //BA.debugLineNum = 76021771;BA.debugLine="parts.Add(\"gain по умолчанию \" & gainText & \" д";
_parts.Add((Object)("gain по умолчанию "+_gaintext+" дБ"));
 };
 };
RDebugUtils.currentLine=76021774;
 //BA.debugLineNum = 76021774;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=76021775;
 //BA.debugLineNum = 76021775;BA.debugLine="Return \". \" & JoinWords(parts)";
if (true) return ". "+__ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=76021776;
 //BA.debugLineNum = 76021776;BA.debugLine="End Sub";
return "";
}
public String  _joinwords(b4j.example.playbacktraceformatter __ref,anywheresoftware.b4a.objects.collections.List _parts) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "joinwords", false))
	 {return ((String) Debug.delegate(ba, "joinwords", new Object[] {_parts}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=76349440;
 //BA.debugLineNum = 76349440;BA.debugLine="Private Sub JoinWords(parts As List) As String";
RDebugUtils.currentLine=76349441;
 //BA.debugLineNum = 76349441;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=76349442;
 //BA.debugLineNum = 76349442;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=76349443;
 //BA.debugLineNum = 76349443;BA.debugLine="For i = 0 To parts.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_parts.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=76349444;
 //BA.debugLineNum = 76349444;BA.debugLine="If i > 0 Then sb.Append(\". \")";
if (_i>0) { 
_sb.Append(". ");};
RDebugUtils.currentLine=76349445;
 //BA.debugLineNum = 76349445;BA.debugLine="sb.Append(parts.Get(i))";
_sb.Append(BA.ObjectToString(_parts.Get(_i)));
 }
};
RDebugUtils.currentLine=76349447;
 //BA.debugLineNum = 76349447;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=76349448;
 //BA.debugLineNum = 76349448;BA.debugLine="End Sub";
return "";
}
public String  _buildcountstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildcountstext", false))
	 {return ((String) Debug.delegate(ba, "buildcountstext", new Object[] {_details}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=76218368;
 //BA.debugLineNum = 76218368;BA.debugLine="Private Sub BuildCountsText(details As String) As";
RDebugUtils.currentLine=76218369;
 //BA.debugLineNum = 76218369;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76218370;
 //BA.debugLineNum = 76218370;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=76218371;
 //BA.debugLineNum = 76218371;BA.debugLine="AddCountPart(parts, details, \"downloaded\", \"загру";
__ref._addcountpart /*String*/ (null,_parts,_details,"downloaded","загружено");
RDebugUtils.currentLine=76218372;
 //BA.debugLineNum = 76218372;BA.debugLine="AddCountPart(parts, details, \"updated\", \"обновлен";
__ref._addcountpart /*String*/ (null,_parts,_details,"updated","обновлено");
RDebugUtils.currentLine=76218373;
 //BA.debugLineNum = 76218373;BA.debugLine="AddCountPart(parts, details, \"failed\", \"ошибок\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"failed","ошибок");
RDebugUtils.currentLine=76218374;
 //BA.debugLineNum = 76218374;BA.debugLine="AddCountPart(parts, details, \"removed\", \"удалено\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"removed","удалено");
RDebugUtils.currentLine=76218375;
 //BA.debugLineNum = 76218375;BA.debugLine="AddCountPart(parts, details, \"actual\", \"осталось\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"actual","осталось");
RDebugUtils.currentLine=76218376;
 //BA.debugLineNum = 76218376;BA.debugLine="AddCountPart(parts, details, \"added\", \"добавлено\"";
__ref._addcountpart /*String*/ (null,_parts,_details,"added","добавлено");
RDebugUtils.currentLine=76218377;
 //BA.debugLineNum = 76218377;BA.debugLine="AddCountPart(parts, details, \"tempDeleted\", \"врем";
__ref._addcountpart /*String*/ (null,_parts,_details,"tempDeleted","временных удалено");
RDebugUtils.currentLine=76218378;
 //BA.debugLineNum = 76218378;BA.debugLine="AddCountPart(parts, details, \"ads\", \"рекламы\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"ads","рекламы");
RDebugUtils.currentLine=76218379;
 //BA.debugLineNum = 76218379;BA.debugLine="AddCountPart(parts, details, \"tracks\", \"треков\")";
__ref._addcountpart /*String*/ (null,_parts,_details,"tracks","треков");
RDebugUtils.currentLine=76218380;
 //BA.debugLineNum = 76218380;BA.debugLine="If parts.Size = 0 Then Return BuildReasonText(det";
if (_parts.getSize()==0) { 
if (true) return __ref._buildreasontext /*String*/ (null,_details);};
RDebugUtils.currentLine=76218381;
 //BA.debugLineNum = 76218381;BA.debugLine="Return JoinWords(parts)";
if (true) return __ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=76218382;
 //BA.debugLineNum = 76218382;BA.debugLine="End Sub";
return "";
}
public String  _buildreasontext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildreasontext", false))
	 {return ((String) Debug.delegate(ba, "buildreasontext", new Object[] {_details}));}
String _messagetext = "";
String _reasontext = "";
String _kindtext = "";
String _steptext = "";
String _resulttext = "";
RDebugUtils.currentLine=76152832;
 //BA.debugLineNum = 76152832;BA.debugLine="Private Sub BuildReasonText(details As String) As";
RDebugUtils.currentLine=76152833;
 //BA.debugLineNum = 76152833;BA.debugLine="If details = \"\" Then Return \"\"";
if ((_details).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=76152834;
 //BA.debugLineNum = 76152834;BA.debugLine="Dim messageText As String = ExtractDetailTail(det";
_messagetext = __ref._extractdetailtail /*String*/ (null,_details,"message");
RDebugUtils.currentLine=76152835;
 //BA.debugLineNum = 76152835;BA.debugLine="If messageText <> \"\" Then Return messageText";
if ((_messagetext).equals("") == false) { 
if (true) return _messagetext;};
RDebugUtils.currentLine=76152836;
 //BA.debugLineNum = 76152836;BA.debugLine="Dim reasonText As String = ExtractDetailTail(deta";
_reasontext = __ref._extractdetailtail /*String*/ (null,_details,"reason");
RDebugUtils.currentLine=76152837;
 //BA.debugLineNum = 76152837;BA.debugLine="If reasonText <> \"\" Then Return \"Причина: \" & rea";
if ((_reasontext).equals("") == false) { 
if (true) return "Причина: "+_reasontext;};
RDebugUtils.currentLine=76152838;
 //BA.debugLineNum = 76152838;BA.debugLine="Dim kindText As String = ExtractDetailValue(detai";
_kindtext = __ref._extractdetailvalue /*String*/ (null,_details,"kind");
RDebugUtils.currentLine=76152839;
 //BA.debugLineNum = 76152839;BA.debugLine="If kindText <> \"\" Then Return \"Причина: \" & kindT";
if ((_kindtext).equals("") == false) { 
if (true) return "Причина: "+_kindtext;};
RDebugUtils.currentLine=76152840;
 //BA.debugLineNum = 76152840;BA.debugLine="Dim stepText As String = ExtractDetailValue(detai";
_steptext = __ref._extractdetailvalue /*String*/ (null,_details,"step");
RDebugUtils.currentLine=76152841;
 //BA.debugLineNum = 76152841;BA.debugLine="If stepText <> \"\" Then Return \"Шаг: \" & stepText";
if ((_steptext).equals("") == false) { 
if (true) return "Шаг: "+_steptext;};
RDebugUtils.currentLine=76152842;
 //BA.debugLineNum = 76152842;BA.debugLine="Dim resultText As String = ExtractDetailValue(det";
_resulttext = __ref._extractdetailvalue /*String*/ (null,_details,"result");
RDebugUtils.currentLine=76152843;
 //BA.debugLineNum = 76152843;BA.debugLine="If resultText <> \"\" Then Return \"Результат: \" & r";
if ((_resulttext).equals("") == false) { 
if (true) return "Результат: "+_resulttext;};
RDebugUtils.currentLine=76152844;
 //BA.debugLineNum = 76152844;BA.debugLine="Return details";
if (true) return _details;
RDebugUtils.currentLine=76152845;
 //BA.debugLineNum = 76152845;BA.debugLine="End Sub";
return "";
}
public String  _buildhealthaudiosettingstext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildhealthaudiosettingstext", false))
	 {return ((String) Debug.delegate(ba, "buildhealthaudiosettingstext", new Object[] {_details}));}
String _volumetext = "";
String _gaintext = "";
String _gainstate = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=76087296;
 //BA.debugLineNum = 76087296;BA.debugLine="Private Sub BuildHealthAudioSettingsText(details A";
RDebugUtils.currentLine=76087297;
 //BA.debugLineNum = 76087297;BA.debugLine="Dim volumeText As String = ExtractDetailValue(det";
_volumetext = __ref._extractdetailvalue /*String*/ (null,_details,"volume");
RDebugUtils.currentLine=76087298;
 //BA.debugLineNum = 76087298;BA.debugLine="Dim gainText As String = ExtractDetailValue(detai";
_gaintext = __ref._extractdetailvalue /*String*/ (null,_details,"gainDb");
RDebugUtils.currentLine=76087299;
 //BA.debugLineNum = 76087299;BA.debugLine="Dim gainState As String = ExtractDetailValue(deta";
_gainstate = __ref._extractdetailvalue /*String*/ (null,_details,"gainApplied");
RDebugUtils.currentLine=76087300;
 //BA.debugLineNum = 76087300;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=76087301;
 //BA.debugLineNum = 76087301;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=76087302;
 //BA.debugLineNum = 76087302;BA.debugLine="If volumeText <> \"\" Then parts.Add(\"громкость=\" &";
if ((_volumetext).equals("") == false) { 
_parts.Add((Object)("громкость="+_volumetext));};
RDebugUtils.currentLine=76087303;
 //BA.debugLineNum = 76087303;BA.debugLine="If gainText <> \"\" Then";
if ((_gaintext).equals("") == false) { 
RDebugUtils.currentLine=76087304;
 //BA.debugLineNum = 76087304;BA.debugLine="If gainState = \"yes\" Then";
if ((_gainstate).equals("yes")) { 
RDebugUtils.currentLine=76087305;
 //BA.debugLineNum = 76087305;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ\")";
_parts.Add((Object)("gain="+_gaintext+" дБ"));
 }else {
RDebugUtils.currentLine=76087307;
 //BA.debugLineNum = 76087307;BA.debugLine="parts.Add(\"gain=\" & gainText & \" дБ по умолчани";
_parts.Add((Object)("gain="+_gaintext+" дБ по умолчанию"));
 };
 };
RDebugUtils.currentLine=76087310;
 //BA.debugLineNum = 76087310;BA.debugLine="If parts.Size = 0 Then Return \"\"";
if (_parts.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=76087311;
 //BA.debugLineNum = 76087311;BA.debugLine="Return \", \" & JoinWords(parts)";
if (true) return ", "+__ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=76087312;
 //BA.debugLineNum = 76087312;BA.debugLine="End Sub";
return "";
}
public String  _buildversionplayertext(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "buildversionplayertext", false))
	 {return ((String) Debug.delegate(ba, "buildversionplayertext", new Object[] {_details}));}
String _versiontext = "";
String _playertext = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=75890688;
 //BA.debugLineNum = 75890688;BA.debugLine="Private Sub BuildVersionPlayerText(details As Stri";
RDebugUtils.currentLine=75890689;
 //BA.debugLineNum = 75890689;BA.debugLine="Dim versionText As String = ExtractDetailValue(de";
_versiontext = __ref._extractdetailvalue /*String*/ (null,_details,"version");
RDebugUtils.currentLine=75890690;
 //BA.debugLineNum = 75890690;BA.debugLine="Dim playerText As String = ExtractDetailValue(det";
_playertext = __ref._extractdetailvalue /*String*/ (null,_details,"player");
RDebugUtils.currentLine=75890691;
 //BA.debugLineNum = 75890691;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=75890692;
 //BA.debugLineNum = 75890692;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=75890693;
 //BA.debugLineNum = 75890693;BA.debugLine="If versionText <> \"\" Then parts.Add(\"Версия \" & v";
if ((_versiontext).equals("") == false) { 
_parts.Add((Object)("Версия "+_versiontext));};
RDebugUtils.currentLine=75890694;
 //BA.debugLineNum = 75890694;BA.debugLine="If playerText <> \"\" Then parts.Add(\"Плеер \" & pla";
if ((_playertext).equals("") == false) { 
_parts.Add((Object)("Плеер "+_playertext));};
RDebugUtils.currentLine=75890695;
 //BA.debugLineNum = 75890695;BA.debugLine="If parts.Size = 0 Then Return \"Запуск\"";
if (_parts.getSize()==0) { 
if (true) return "Запуск";};
RDebugUtils.currentLine=75890696;
 //BA.debugLineNum = 75890696;BA.debugLine="Return JoinWords(parts)";
if (true) return __ref._joinwords /*String*/ (null,_parts);
RDebugUtils.currentLine=75890697;
 //BA.debugLineNum = 75890697;BA.debugLine="End Sub";
return "";
}
public String  _traceitemlabelfromdetails(b4j.example.playbacktraceformatter __ref,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "traceitemlabelfromdetails", false))
	 {return ((String) Debug.delegate(ba, "traceitemlabelfromdetails", new Object[] {_details}));}
String _itemtype = "";
String _itemid = "";
RDebugUtils.currentLine=75956224;
 //BA.debugLineNum = 75956224;BA.debugLine="Private Sub TraceItemLabelFromDetails(details As S";
RDebugUtils.currentLine=75956225;
 //BA.debugLineNum = 75956225;BA.debugLine="Dim itemType As String = ExtractDetailValue(detai";
_itemtype = __ref._extractdetailvalue /*String*/ (null,_details,"type");
RDebugUtils.currentLine=75956226;
 //BA.debugLineNum = 75956226;BA.debugLine="Dim itemId As String = DefaultIfEmpty(ExtractDeta";
_itemid = __ref._defaultifempty /*String*/ (null,__ref._extractdetailvalue /*String*/ (null,_details,"id"),__ref._extractdetailvalue /*String*/ (null,_details,"trackId"));
RDebugUtils.currentLine=75956227;
 //BA.debugLineNum = 75956227;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=75956228;
 //BA.debugLineNum = 75956228;BA.debugLine="If itemId <> \"\" Then Return \"рекламу \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "рекламу "+_itemid;};
RDebugUtils.currentLine=75956229;
 //BA.debugLineNum = 75956229;BA.debugLine="Return \"рекламу\"";
if (true) return "рекламу";
 };
RDebugUtils.currentLine=75956231;
 //BA.debugLineNum = 75956231;BA.debugLine="If itemId <> \"\" Then Return \"трек \" & itemId";
if ((_itemid).equals("") == false) { 
if (true) return "трек "+_itemid;};
RDebugUtils.currentLine=75956232;
 //BA.debugLineNum = 75956232;BA.debugLine="Return \"трек\"";
if (true) return "трек";
RDebugUtils.currentLine=75956233;
 //BA.debugLineNum = 75956233;BA.debugLine="End Sub";
return "";
}
public String  _defaultifempty(b4j.example.playbacktraceformatter __ref,String _value,String _fallback) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "defaultifempty", false))
	 {return ((String) Debug.delegate(ba, "defaultifempty", new Object[] {_value,_fallback}));}
RDebugUtils.currentLine=76414976;
 //BA.debugLineNum = 76414976;BA.debugLine="Private Sub DefaultIfEmpty(value As String, fallba";
RDebugUtils.currentLine=76414977;
 //BA.debugLineNum = 76414977;BA.debugLine="If value = \"\" Then Return fallback";
if ((_value).equals("")) { 
if (true) return _fallback;};
RDebugUtils.currentLine=76414978;
 //BA.debugLineNum = 76414978;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=76414979;
 //BA.debugLineNum = 76414979;BA.debugLine="End Sub";
return "";
}
public String  _extractdetailtail(b4j.example.playbacktraceformatter __ref,String _details,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
if (Debug.shouldDelegate(ba, "extractdetailtail", false))
	 {return ((String) Debug.delegate(ba, "extractdetailtail", new Object[] {_details,_key}));}
String _marker = "";
int _startindex = 0;
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Private Sub ExtractDetailTail(details As String, k";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="Dim marker As String = key & \"=\"";
_marker = _key+"=";
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="Dim startIndex As Int = details.IndexOf(marker)";
_startindex = _details.indexOf(_marker);
RDebugUtils.currentLine=76546051;
 //BA.debugLineNum = 76546051;BA.debugLine="If startIndex < 0 Then Return \"\"";
if (_startindex<0) { 
if (true) return "";};
RDebugUtils.currentLine=76546052;
 //BA.debugLineNum = 76546052;BA.debugLine="Return details.SubString(startIndex + marker.Leng";
if (true) return _details.substring((int) (_startindex+_marker.length())).trim();
RDebugUtils.currentLine=76546053;
 //BA.debugLineNum = 76546053;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktraceformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktraceformatter";
RDebugUtils.currentLine=75694080;
 //BA.debugLineNum = 75694080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=75694081;
 //BA.debugLineNum = 75694081;BA.debugLine="End Sub";
return "";
}
}