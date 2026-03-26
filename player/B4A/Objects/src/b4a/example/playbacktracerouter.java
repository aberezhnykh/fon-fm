package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playbacktracerouter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playbacktracerouter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playbacktracerouter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.traceservice _traceserviceref = null;
public b4a.example.playbacktraceformatter _formatterref = null;
public boolean _releasebuild = false;
public int _debugcontextlines = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _appendrecentdebugcontext(String _title) throws Exception{
anywheresoftware.b4a.objects.collections.List _debuglines = null;
String _debugline = "";
 //BA.debugLineNum = 50;BA.debugLine="Private Sub AppendRecentDebugContext(title As Stri";
 //BA.debugLineNum = 51;BA.debugLine="Dim debugLines As List = traceServiceRef.GetRecen";
_debuglines = new anywheresoftware.b4a.objects.collections.List();
_debuglines = _traceserviceref._getrecentdebuglist /*anywheresoftware.b4a.objects.collections.List*/ (_debugcontextlines);
 //BA.debugLineNum = 52;BA.debugLine="If debugLines.IsInitialized = False Or debugLines";
if (_debuglines.IsInitialized()==__c.False || _debuglines.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 53;BA.debugLine="WriteTraceEntry(\"DEBUG\", \"debug\", title, \"\")";
_writetraceentry("DEBUG","debug",_title,"");
 //BA.debugLineNum = 54;BA.debugLine="For Each debugLine As String In debugLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _debuglines;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_debugline = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 55;BA.debugLine="traceServiceRef.Trace(\"DEBUG \" & TrimDebugContex";
_traceserviceref._trace /*String*/ ("DEBUG "+_trimdebugcontextline(_debugline));
 }
};
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4a.example.traceservice();
 //BA.debugLineNum = 7;BA.debugLine="Private formatterRef As PlaybackTraceFormatter";
_formatterref = new b4a.example.playbacktraceformatter();
 //BA.debugLineNum = 8;BA.debugLine="Private releaseBuild As Boolean";
_releasebuild = false;
 //BA.debugLineNum = 9;BA.debugLine="Private debugContextLines As Int";
_debugcontextlines = 0;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public boolean  _handlediagnostictracemessage(String _message) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
 //BA.debugLineNum = 73;BA.debugLine="If message = \"\" Then Return True";
if ((_message).equals("")) { 
if (true) return __c.True;};
 //BA.debugLineNum = 74;BA.debugLine="If ShouldSuppressTraceMessage(message) Then";
if (_shouldsuppresstracemessage(_message)) { 
 //BA.debugLineNum = 75;BA.debugLine="TraceDebug(message)";
_tracedebug(_message);
 //BA.debugLineNum = 76;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 78;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
if (_message.startsWith("Трек сохранен в кэш.")) { 
 //BA.debugLineNum = 79;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
_traceinfo("cache","трек загружен в кэш",_normalizelegacydetails(_tailafter(_message,"Трек сохранен в кэш.")));
 //BA.debugLineNum = 80;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 82;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
if (_message.startsWith("Не удалось скачать трек.") || _message.startsWith("Не удалось сохранить трек в кэш.")) { 
 //BA.debugLineNum = 83;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
_traceerror("cache","ошибка загрузки трека",_normalizelegacydetails(_tailafterfirstspace(_message)));
 //BA.debugLineNum = 84;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 86;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
if (_message.startsWith("Синхронизация кэша треков завершена.")) { 
 //BA.debugLineNum = 87;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
_traceinfo("cache","кэш треков обновлен",_normalizelegacydetails(_tailafter(_message,"Синхронизация кэша треков завершена.")));
 //BA.debugLineNum = 88;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 90;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
if (_message.startsWith("ad cache sync done")) { 
 //BA.debugLineNum = 91;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
_traceinfo("cache","кэш рекламы обновлен",_normalizelegacydetails(_tailafter(_message,"ad cache sync done")));
 //BA.debugLineNum = 92;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 94;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
if (_message.startsWith("Аудит кэша завершен.")) { 
 //BA.debugLineNum = 95;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
_traceinfo("cache","аудит кэша",_normalizelegacydetails(_tailafter(_message,"Аудит кэша завершен.")));
 //BA.debugLineNum = 96;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 98;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
if (_message.startsWith("Очистка кэша треков завершена.")) { 
 //BA.debugLineNum = 99;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
_traceinfo("cache","очистка кэша",_normalizelegacydetails(_tailafter(_message,"Очистка кэша треков завершена.")));
 //BA.debugLineNum = 100;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 102;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
if (_message.startsWith("кэш треков очистка итог")) { 
 //BA.debugLineNum = 103;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
_traceinfo("cache","очистка кэша",_normalizelegacydetails(_tailafter(_message,"кэш треков очистка итог")));
 //BA.debugLineNum = 104;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 106;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
if (_message.startsWith("Удален cached ad, отсутствующий в актуальном data.")) { 
 //BA.debugLineNum = 107;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
_traceinfo("cache","реклама удалена из кэша",_normalizelegacydetails(_tailafter(_message,"Удален cached ad, отсутствующий в актуальном data.")));
 //BA.debugLineNum = 108;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 110;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
if (_message.startsWith("подготовка data playback ошибка")) { 
 //BA.debugLineNum = 111;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
_tracewarn("playback","очередь пуста","");
 //BA.debugLineNum = 112;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 114;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
if (_message.startsWith("очередь запрос ошибка")) { 
 //BA.debugLineNum = 115;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
_tracewarn("playback","очередь пуста",_normalizelegacydetails(_tailafter(_message,"очередь запрос ошибка")));
 //BA.debugLineNum = 116;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 118;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
if (_message.startsWith("очередь next ошибка")) { 
 //BA.debugLineNum = 119;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
_tracewarn("playback","очередь пуста",_normalizelegacydetails(_tailafter(_message,"очередь next ошибка")));
 //BA.debugLineNum = 120;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 122;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
if (_message.startsWith("очередь fetch ошибка")) { 
 //BA.debugLineNum = 123;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
_tracewarn("network","ошибка очереди",_normalizelegacydetails(_tailafter(_message,"очередь fetch ошибка")));
 //BA.debugLineNum = 124;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 126;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
if (_message.startsWith("состояние blocked")) { 
 //BA.debugLineNum = 127;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
_tracewarn("player","плеер заблокирован","");
 //BA.debugLineNum = 128;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 130;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
if (_message.startsWith("состояние stop") || _message.startsWith("message shutdown")) { 
 //BA.debugLineNum = 131;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
_tracewarn("player","воспроизведение остановлено",_normalizelegacydetails(_tailafterfirstspace(_message)));
 //BA.debugLineNum = 132;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 134;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
if (_message.startsWith("fallback activate")) { 
 //BA.debugLineNum = 135;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
_tracewarn("playback","включен локальный fallback",_normalizelegacydetails(_tailafter(_message,"fallback activate")));
 //BA.debugLineNum = 136;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 138;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
if (_message.startsWith("degraded path вход")) { 
 //BA.debugLineNum = 139;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
_tracewarn("network","деградация media path","");
 //BA.debugLineNum = 140;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 142;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
if (_message.startsWith("degraded path восстановлен")) { 
 //BA.debugLineNum = 143;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
_traceinfo("network","media path восстановлен","");
 //BA.debugLineNum = 144;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 146;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
if (_message.startsWith("история чтение ошибка") || _message.startsWith("история response parse ошибка")) { 
 //BA.debugLineNum = 147;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
_tracewarn("history","ошибка истории","");
 //BA.debugLineNum = 148;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 150;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
if (_message.startsWith("метаданные плейлистов sync итог")) { 
 //BA.debugLineNum = 151;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
_traceinfo("network","метаданные плейлистов обновлены",_normalizelegacydetails(_tailafter(_message,"метаданные плейлистов sync итог")));
 //BA.debugLineNum = 152;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 154;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
if (_message.startsWith("метаданные плейлиста fetch ошибка")) { 
 //BA.debugLineNum = 155;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
_tracewarn("network","ошибка метаданных плейлиста",_normalizelegacydetails(_tailafter(_message,"метаданные плейлиста fetch ошибка")));
 //BA.debugLineNum = 156;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 158;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
if (_message.startsWith("Не удалось подготовить временный файл трека.")) { 
 //BA.debugLineNum = 159;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
_traceerror("cache","ошибка подготовки трека",_normalizelegacydetails(_tailafter(_message,"Не удалось подготовить временный файл трека.")));
 //BA.debugLineNum = 160;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 162;BA.debugLine="TraceDebug(message)";
_tracedebug(_message);
 //BA.debugLineNum = 163;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.traceservice _tracesvc,b4a.example.playbacktraceformatter _formattervalue,boolean _isreleasebuild,int _debugcontextlinecount) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(traceSvc As TraceService, fo";
 //BA.debugLineNum = 13;BA.debugLine="traceServiceRef = traceSvc";
_traceserviceref = _tracesvc;
 //BA.debugLineNum = 14;BA.debugLine="formatterRef = formatterValue";
_formatterref = _formattervalue;
 //BA.debugLineNum = 15;BA.debugLine="releaseBuild = isReleaseBuild";
_releasebuild = _isreleasebuild;
 //BA.debugLineNum = 16;BA.debugLine="debugContextLines = debugContextLineCount";
_debugcontextlines = _debugcontextlinecount;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _normalizelegacydetails(String _text) throws Exception{
String _value = "";
 //BA.debugLineNum = 250;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
 //BA.debugLineNum = 251;BA.debugLine="Dim value As String = text.Trim";
_value = _text.trim();
 //BA.debugLineNum = 252;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
if (_value.startsWith(".") || _value.startsWith(":")) { 
_value = _value.substring((int) (1)).trim();};
 //BA.debugLineNum = 253;BA.debugLine="value = value.Replace(\",\", \"\")";
_value = _value.replace(",","");
 //BA.debugLineNum = 254;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public boolean  _shouldsuppresstracemessage(String _message) throws Exception{
anywheresoftware.b4a.objects.collections.List _noisyprefixes = null;
String _prefix = "";
 //BA.debugLineNum = 166;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
 //BA.debugLineNum = 167;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
if (_message.startsWith("guard переход") || _message.startsWith("переход dispatch")) { 
 //BA.debugLineNum = 168;BA.debugLine="If releaseBuild Then";
if (_releasebuild) { 
 //BA.debugLineNum = 169;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
 //BA.debugLineNum = 171;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 //BA.debugLineNum = 174;BA.debugLine="Dim noisyPrefixes As List";
_noisyprefixes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 175;BA.debugLine="noisyPrefixes.Initialize";
_noisyprefixes.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
_noisyprefixes.Add((Object)("курсор плейлистов load"));
 //BA.debugLineNum = 177;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
_noisyprefixes.Add((Object)("состояние init"));
 //BA.debugLineNum = 178;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
_noisyprefixes.Add((Object)("старт skip"));
 //BA.debugLineNum = 179;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
_noisyprefixes.Add((Object)("старт вход"));
 //BA.debugLineNum = 180;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
_noisyprefixes.Add((Object)("отложенный старт"));
 //BA.debugLineNum = 181;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
_noisyprefixes.Add((Object)("сценарий "));
 //BA.debugLineNum = 182;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
_noisyprefixes.Add((Object)("flow переход"));
 //BA.debugLineNum = 183;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
_noisyprefixes.Add((Object)("guard переход"));
 //BA.debugLineNum = 184;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
_noisyprefixes.Add((Object)("guard подготовка"));
 //BA.debugLineNum = 185;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
_noisyprefixes.Add((Object)("guard prefetch"));
 //BA.debugLineNum = 186;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
_noisyprefixes.Add((Object)("guard fade"));
 //BA.debugLineNum = 187;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
_noisyprefixes.Add((Object)("переход dispatch"));
 //BA.debugLineNum = 188;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
_noisyprefixes.Add((Object)("воспроизведение activate"));
 //BA.debugLineNum = 189;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
_noisyprefixes.Add((Object)("очередь добор"));
 //BA.debugLineNum = 190;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
 //BA.debugLineNum = 191;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
 //BA.debugLineNum = 192;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
 //BA.debugLineNum = 193;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
_noisyprefixes.Add((Object)("автостарт сначала обновление данных"));
 //BA.debugLineNum = 194;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
_noisyprefixes.Add((Object)("policy resume авто"));
 //BA.debugLineNum = 195;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
_noisyprefixes.Add((Object)("возобновление запрет"));
 //BA.debugLineNum = 196;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
_noisyprefixes.Add((Object)("возобновление итог"));
 //BA.debugLineNum = 197;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
_noisyprefixes.Add((Object)("снимок очереди восстановление skip"));
 //BA.debugLineNum = 198;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
_noisyprefixes.Add((Object)("http get начало"));
 //BA.debugLineNum = 199;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
_noisyprefixes.Add((Object)("http get итог"));
 //BA.debugLineNum = 200;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
_noisyprefixes.Add((Object)("claim начало"));
 //BA.debugLineNum = 201;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
_noisyprefixes.Add((Object)("claim итог"));
 //BA.debugLineNum = 202;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
_noisyprefixes.Add((Object)("элемент очереди play"));
 //BA.debugLineNum = 203;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
_noisyprefixes.Add((Object)("курсор плейлистов commit"));
 //BA.debugLineNum = 204;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
_noisyprefixes.Add((Object)("реклама prescan начало"));
 //BA.debugLineNum = 205;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
_noisyprefixes.Add((Object)("брейк exact defer"));
 //BA.debugLineNum = 206;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
_noisyprefixes.Add((Object)("брейк exact sync"));
 //BA.debugLineNum = 207;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
_noisyprefixes.Add((Object)("fade начало"));
 //BA.debugLineNum = 208;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
_noisyprefixes.Add((Object)("история confirm"));
 //BA.debugLineNum = 209;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
_noisyprefixes.Add((Object)("история stage"));
 //BA.debugLineNum = 210;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
_noisyprefixes.Add((Object)("история буфер add"));
 //BA.debugLineNum = 211;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
_noisyprefixes.Add((Object)("история отправка начало"));
 //BA.debugLineNum = 212;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
_noisyprefixes.Add((Object)("история отправка payload"));
 //BA.debugLineNum = 213;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
_noisyprefixes.Add((Object)("история отправка ack"));
 //BA.debugLineNum = 214;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
_noisyprefixes.Add((Object)("stop запрос"));
 //BA.debugLineNum = 215;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
_noisyprefixes.Add((Object)("резерв очереди save"));
 //BA.debugLineNum = 216;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
_noisyprefixes.Add((Object)("снимок очереди clear"));
 //BA.debugLineNum = 217;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
_noisyprefixes.Add((Object)("состояние воспроизведения clear"));
 //BA.debugLineNum = 218;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
_noisyprefixes.Add((Object)("аудио ready"));
 //BA.debugLineNum = 219;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
_noisyprefixes.Add((Object)("аудио complete"));
 //BA.debugLineNum = 220;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
_noisyprefixes.Add((Object)("переход overlap начало"));
 //BA.debugLineNum = 221;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
_noisyprefixes.Add((Object)("переход tail начало"));
 //BA.debugLineNum = 222;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
_noisyprefixes.Add((Object)("переход prefetch начало"));
 //BA.debugLineNum = 223;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
_noisyprefixes.Add((Object)("trusted time update"));
 //BA.debugLineNum = 224;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
_noisyprefixes.Add((Object)("player end parse fail"));
 //BA.debugLineNum = 225;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
_noisyprefixes.Add((Object)("[AudioPrimary]"));
 //BA.debugLineNum = 226;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
_noisyprefixes.Add((Object)("[AudioSecondary]"));
 //BA.debugLineNum = 227;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
_noisyprefixes.Add((Object)("machine guid"));
 //BA.debugLineNum = 228;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
_noisyprefixes.Add((Object)("legacy migrate итог"));
 //BA.debugLineNum = 229;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
_noisyprefixes.Add((Object)("метаданные плейлистов sync skip"));
 //BA.debugLineNum = 230;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
_noisyprefixes.Add((Object)("метаданные плейлиста fetch начало"));
 //BA.debugLineNum = 231;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
_noisyprefixes.Add((Object)("окно save"));
 //BA.debugLineNum = 232;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
_noisyprefixes.Add((Object)("окно restore"));
 //BA.debugLineNum = 233;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
_noisyprefixes.Add((Object)("trace отправка"));
 //BA.debugLineNum = 234;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
_noisyprefixes.Add((Object)("скачивание рекламы в кэш"));
 //BA.debugLineNum = 235;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
_noisyprefixes.Add((Object)("скачивание трека в кэш"));
 //BA.debugLineNum = 236;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
_noisyprefixes.Add((Object)("удален cached track при очистке кэша"));
 //BA.debugLineNum = 237;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
_noisyprefixes.Add((Object)("очистка кэша треков пропущена"));
 //BA.debugLineNum = 238;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
 //BA.debugLineNum = 239;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
 //BA.debugLineNum = 240;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
 //BA.debugLineNum = 241;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
_noisyprefixes.Add((Object)("переход очередь drop"));
 //BA.debugLineNum = 242;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
_noisyprefixes.Add((Object)("переход preload ошибка"));
 //BA.debugLineNum = 243;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
_noisyprefixes.Add((Object)("переход prepared reject"));
 //BA.debugLineNum = 244;BA.debugLine="For Each prefix As String In noisyPrefixes";
{
final anywheresoftware.b4a.BA.IterableList group78 = _noisyprefixes;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.Get(index78));
 //BA.debugLineNum = 245;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
if (_message.toLowerCase().startsWith(_prefix.toLowerCase())) { 
if (true) return __c.True;};
 }
};
 //BA.debugLineNum = 247;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return false;
}
public String  _tailafter(String _text,String _prefix) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
 //BA.debugLineNum = 258;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
if (_text.startsWith(_prefix)==__c.False) { 
if (true) return _text;};
 //BA.debugLineNum = 259;BA.debugLine="Return text.SubString(prefix.Length).Trim";
if (true) return _text.substring(_prefix.length()).trim();
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public String  _tailafterfirstspace(String _text) throws Exception{
int _firstspace = 0;
 //BA.debugLineNum = 262;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
 //BA.debugLineNum = 263;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
_firstspace = _text.indexOf(" ");
 //BA.debugLineNum = 264;BA.debugLine="If firstSpace < 0 Then Return \"\"";
if (_firstspace<0) { 
if (true) return "";};
 //BA.debugLineNum = 265;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
if (true) return _text.substring((int) (_firstspace+1)).trim();
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _tracedebug(String _message) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub TraceDebug(message As String)";
 //BA.debugLineNum = 47;BA.debugLine="traceServiceRef.TraceDebug(message)";
_traceserviceref._tracedebug /*String*/ (_message);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _tracedebugmessage(String _message) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub TraceDebugMessage(message As String)";
 //BA.debugLineNum = 43;BA.debugLine="TraceDebug(message)";
_tracedebug(_message);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _traceerror(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub TraceError(category As String, message";
 //BA.debugLineNum = 34;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
_writetraceentry("ERROR",_category,_message,_details);
 //BA.debugLineNum = 35;BA.debugLine="AppendRecentDebugContext(\"Контекст ошибки\")";
_appendrecentdebugcontext("Контекст ошибки");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub TraceInfo(category As String, message A";
 //BA.debugLineNum = 26;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
_writetraceentry("INFO",_category,_message,_details);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(String _message) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub TraceLog(message As String)";
 //BA.debugLineNum = 20;BA.debugLine="If message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 21;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
if (_handlediagnostictracemessage(_message)) { 
if (true) return "";};
 //BA.debugLineNum = 22;BA.debugLine="TraceDebug(message)";
_tracedebug(_message);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _tracestate(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub TraceState(category As String, message";
 //BA.debugLineNum = 39;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
_writetraceentry("STATE",_category,_message,_details);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub TraceWarn(category As String, message A";
 //BA.debugLineNum = 30;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
_writetraceentry("WARN",_category,_message,_details);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _trimdebugcontextline(String _debugline) throws Exception{
String _marker = "";
int _markerindex = 0;
 //BA.debugLineNum = 59;BA.debugLine="Private Sub TrimDebugContextLine(debugLine As Stri";
 //BA.debugLineNum = 60;BA.debugLine="If debugLine = \"\" Then Return \"\"";
if ((_debugline).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 61;BA.debugLine="Dim marker As String = \" DEBUG \"";
_marker = " DEBUG ";
 //BA.debugLineNum = 62;BA.debugLine="Dim markerIndex As Int = debugLine.IndexOf(marker";
_markerindex = _debugline.indexOf(_marker);
 //BA.debugLineNum = 63;BA.debugLine="If markerIndex < 0 Then Return debugLine";
if (_markerindex<0) { 
if (true) return _debugline;};
 //BA.debugLineNum = 64;BA.debugLine="Return debugLine.SubString(markerIndex + marker.L";
if (true) return _debugline.substring((int) (_markerindex+_marker.length())).trim();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _writetraceentry(String _level,String _category,String _message,String _details) throws Exception{
String _line = "";
 //BA.debugLineNum = 67;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
 //BA.debugLineNum = 68;BA.debugLine="Dim line As String = level & \" \" & formatterRef.B";
_line = _level+" "+_formatterref._buildhumantracemessage /*String*/ (_category,_message,_details.trim());
 //BA.debugLineNum = 69;BA.debugLine="traceServiceRef.Trace(line)";
_traceserviceref._trace /*String*/ (_line);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "TRACELOG"))
	return _tracelog((String) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
