package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class playbacktracerouter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.playbacktracerouter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.playbacktracerouter.class).invoke(this, new Object[] {null});
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
public b4j.example.traceservice _traceserviceref = null;
public b4j.example.playbacktraceformatter _formatterref = null;
public boolean _releasebuild = false;
public int _debugcontextlines = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.playbacktracerouter __ref,anywheresoftware.b4a.BA _ba,b4j.example.traceservice _tracesvc,b4j.example.playbacktraceformatter _formattervalue,boolean _isreleasebuild,int _debugcontextlinecount) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_tracesvc,_formattervalue,_isreleasebuild,_debugcontextlinecount}));}
RDebugUtils.currentLine=86376448;
 //BA.debugLineNum = 86376448;BA.debugLine="Public Sub Initialize(traceSvc As TraceService, fo";
RDebugUtils.currentLine=86376449;
 //BA.debugLineNum = 86376449;BA.debugLine="traceServiceRef = traceSvc";
__ref._traceserviceref /*b4j.example.traceservice*/  = _tracesvc;
RDebugUtils.currentLine=86376450;
 //BA.debugLineNum = 86376450;BA.debugLine="formatterRef = formatterValue";
__ref._formatterref /*b4j.example.playbacktraceformatter*/  = _formattervalue;
RDebugUtils.currentLine=86376451;
 //BA.debugLineNum = 86376451;BA.debugLine="releaseBuild = isReleaseBuild";
__ref._releasebuild /*boolean*/  = _isreleasebuild;
RDebugUtils.currentLine=86376452;
 //BA.debugLineNum = 86376452;BA.debugLine="debugContextLines = debugContextLineCount";
__ref._debugcontextlines /*int*/  = _debugcontextlinecount;
RDebugUtils.currentLine=86376453;
 //BA.debugLineNum = 86376453;BA.debugLine="End Sub";
return "";
}
public String  _tracedebugmessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebugmessage", false))
	 {return ((String) Debug.delegate(ba, "tracedebugmessage", new Object[] {_message}));}
RDebugUtils.currentLine=86769664;
 //BA.debugLineNum = 86769664;BA.debugLine="Public Sub TraceDebugMessage(message As String)";
RDebugUtils.currentLine=86769665;
 //BA.debugLineNum = 86769665;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=86769666;
 //BA.debugLineNum = 86769666;BA.debugLine="End Sub";
return "";
}
public String  _traceerror(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceerror", false))
	 {return ((String) Debug.delegate(ba, "traceerror", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=86638592;
 //BA.debugLineNum = 86638592;BA.debugLine="Public Sub TraceError(category As String, message";
RDebugUtils.currentLine=86638593;
 //BA.debugLineNum = 86638593;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"ERROR",_category,_message,_details);
RDebugUtils.currentLine=86638594;
 //BA.debugLineNum = 86638594;BA.debugLine="AppendRecentDebugContext(\"Контекст ошибки\")";
__ref._appendrecentdebugcontext /*String*/ (null,"Контекст ошибки");
RDebugUtils.currentLine=86638595;
 //BA.debugLineNum = 86638595;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=86507520;
 //BA.debugLineNum = 86507520;BA.debugLine="Public Sub TraceInfo(category As String, message A";
RDebugUtils.currentLine=86507521;
 //BA.debugLineNum = 86507521;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"INFO",_category,_message,_details);
RDebugUtils.currentLine=86507522;
 //BA.debugLineNum = 86507522;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=86441984;
 //BA.debugLineNum = 86441984;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=86441985;
 //BA.debugLineNum = 86441985;BA.debugLine="If message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=86441986;
 //BA.debugLineNum = 86441986;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
if (__ref._handlediagnostictracemessage /*boolean*/ (null,_message)) { 
if (true) return "";};
RDebugUtils.currentLine=86441987;
 //BA.debugLineNum = 86441987;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=86441988;
 //BA.debugLineNum = 86441988;BA.debugLine="End Sub";
return "";
}
public String  _tracestate(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracestate", false))
	 {return ((String) Debug.delegate(ba, "tracestate", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=86704128;
 //BA.debugLineNum = 86704128;BA.debugLine="Public Sub TraceState(category As String, message";
RDebugUtils.currentLine=86704129;
 //BA.debugLineNum = 86704129;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"STATE",_category,_message,_details);
RDebugUtils.currentLine=86704130;
 //BA.debugLineNum = 86704130;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=86573056;
 //BA.debugLineNum = 86573056;BA.debugLine="Public Sub TraceWarn(category As String, message A";
RDebugUtils.currentLine=86573057;
 //BA.debugLineNum = 86573057;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"WARN",_category,_message,_details);
RDebugUtils.currentLine=86573058;
 //BA.debugLineNum = 86573058;BA.debugLine="End Sub";
return "";
}
public String  _appendrecentdebugcontext(b4j.example.playbacktracerouter __ref,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "appendrecentdebugcontext", false))
	 {return ((String) Debug.delegate(ba, "appendrecentdebugcontext", new Object[] {_title}));}
anywheresoftware.b4a.objects.collections.List _debuglines = null;
String _debugline = "";
RDebugUtils.currentLine=86900736;
 //BA.debugLineNum = 86900736;BA.debugLine="Private Sub AppendRecentDebugContext(title As Stri";
RDebugUtils.currentLine=86900737;
 //BA.debugLineNum = 86900737;BA.debugLine="Dim debugLines As List = traceServiceRef.GetRecen";
_debuglines = new anywheresoftware.b4a.objects.collections.List();
_debuglines = __ref._traceserviceref /*b4j.example.traceservice*/ ._getrecentdebuglist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._debugcontextlines /*int*/ );
RDebugUtils.currentLine=86900738;
 //BA.debugLineNum = 86900738;BA.debugLine="If debugLines.IsInitialized = False Or debugLines";
if (_debuglines.IsInitialized()==__c.False || _debuglines.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=86900739;
 //BA.debugLineNum = 86900739;BA.debugLine="WriteTraceEntry(\"DEBUG\", \"debug\", title, \"\")";
__ref._writetraceentry /*String*/ (null,"DEBUG","debug",_title,"");
RDebugUtils.currentLine=86900740;
 //BA.debugLineNum = 86900740;BA.debugLine="For Each debugLine As String In debugLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _debuglines;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_debugline = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=86900741;
 //BA.debugLineNum = 86900741;BA.debugLine="traceServiceRef.Trace(\"DEBUG \" & TrimDebugContex";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,"DEBUG "+__ref._trimdebugcontextline /*String*/ (null,_debugline));
 }
};
RDebugUtils.currentLine=86900743;
 //BA.debugLineNum = 86900743;BA.debugLine="End Sub";
return "";
}
public String  _writetraceentry(b4j.example.playbacktracerouter __ref,String _level,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "writetraceentry", false))
	 {return ((String) Debug.delegate(ba, "writetraceentry", new Object[] {_level,_category,_message,_details}));}
String _line = "";
RDebugUtils.currentLine=87031808;
 //BA.debugLineNum = 87031808;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
RDebugUtils.currentLine=87031809;
 //BA.debugLineNum = 87031809;BA.debugLine="Dim line As String = level & \" \" & formatterRef.B";
_line = _level+" "+__ref._formatterref /*b4j.example.playbacktraceformatter*/ ._buildhumantracemessage /*String*/ (null,_category,_message,_details.trim());
RDebugUtils.currentLine=87031810;
 //BA.debugLineNum = 87031810;BA.debugLine="traceServiceRef.Trace(line)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,_line);
RDebugUtils.currentLine=87031811;
 //BA.debugLineNum = 87031811;BA.debugLine="End Sub";
return "";
}
public String  _trimdebugcontextline(b4j.example.playbacktracerouter __ref,String _debugline) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "trimdebugcontextline", false))
	 {return ((String) Debug.delegate(ba, "trimdebugcontextline", new Object[] {_debugline}));}
String _marker = "";
int _markerindex = 0;
RDebugUtils.currentLine=86966272;
 //BA.debugLineNum = 86966272;BA.debugLine="Private Sub TrimDebugContextLine(debugLine As Stri";
RDebugUtils.currentLine=86966273;
 //BA.debugLineNum = 86966273;BA.debugLine="If debugLine = \"\" Then Return \"\"";
if ((_debugline).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=86966274;
 //BA.debugLineNum = 86966274;BA.debugLine="Dim marker As String = \" DEBUG \"";
_marker = " DEBUG ";
RDebugUtils.currentLine=86966275;
 //BA.debugLineNum = 86966275;BA.debugLine="Dim markerIndex As Int = debugLine.IndexOf(marker";
_markerindex = _debugline.indexOf(_marker);
RDebugUtils.currentLine=86966276;
 //BA.debugLineNum = 86966276;BA.debugLine="If markerIndex < 0 Then Return debugLine";
if (_markerindex<0) { 
if (true) return _debugline;};
RDebugUtils.currentLine=86966277;
 //BA.debugLineNum = 86966277;BA.debugLine="Return debugLine.SubString(markerIndex + marker.L";
if (true) return _debugline.substring((int) (_markerindex+_marker.length())).trim();
RDebugUtils.currentLine=86966278;
 //BA.debugLineNum = 86966278;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktracerouter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
RDebugUtils.currentLine=86310912;
 //BA.debugLineNum = 86310912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=86310913;
 //BA.debugLineNum = 86310913;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4j.example.traceservice();
RDebugUtils.currentLine=86310914;
 //BA.debugLineNum = 86310914;BA.debugLine="Private formatterRef As PlaybackTraceFormatter";
_formatterref = new b4j.example.playbacktraceformatter();
RDebugUtils.currentLine=86310915;
 //BA.debugLineNum = 86310915;BA.debugLine="Private releaseBuild As Boolean";
_releasebuild = false;
RDebugUtils.currentLine=86310916;
 //BA.debugLineNum = 86310916;BA.debugLine="Private debugContextLines As Int";
_debugcontextlines = 0;
RDebugUtils.currentLine=86310917;
 //BA.debugLineNum = 86310917;BA.debugLine="End Sub";
return "";
}
public boolean  _handlediagnostictracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "handlediagnostictracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "handlediagnostictracemessage", new Object[] {_message}));}
RDebugUtils.currentLine=87097344;
 //BA.debugLineNum = 87097344;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
RDebugUtils.currentLine=87097345;
 //BA.debugLineNum = 87097345;BA.debugLine="If message = \"\" Then Return True";
if ((_message).equals("")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=87097346;
 //BA.debugLineNum = 87097346;BA.debugLine="If ShouldSuppressTraceMessage(message) Then";
if (__ref._shouldsuppresstracemessage /*boolean*/ (null,_message)) { 
RDebugUtils.currentLine=87097347;
 //BA.debugLineNum = 87097347;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=87097348;
 //BA.debugLineNum = 87097348;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097350;
 //BA.debugLineNum = 87097350;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
if (_message.startsWith("Трек сохранен в кэш.")) { 
RDebugUtils.currentLine=87097351;
 //BA.debugLineNum = 87097351;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
__ref._traceinfo /*String*/ (null,"cache","трек загружен в кэш",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Трек сохранен в кэш.")));
RDebugUtils.currentLine=87097352;
 //BA.debugLineNum = 87097352;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097354;
 //BA.debugLineNum = 87097354;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
if (_message.startsWith("Не удалось скачать трек.") || _message.startsWith("Не удалось сохранить трек в кэш.")) { 
RDebugUtils.currentLine=87097355;
 //BA.debugLineNum = 87097355;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
__ref._traceerror /*String*/ (null,"cache","ошибка загрузки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=87097356;
 //BA.debugLineNum = 87097356;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097358;
 //BA.debugLineNum = 87097358;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
if (_message.startsWith("Синхронизация кэша треков завершена.")) { 
RDebugUtils.currentLine=87097359;
 //BA.debugLineNum = 87097359;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
__ref._traceinfo /*String*/ (null,"cache","кэш треков обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Синхронизация кэша треков завершена.")));
RDebugUtils.currentLine=87097360;
 //BA.debugLineNum = 87097360;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097362;
 //BA.debugLineNum = 87097362;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
if (_message.startsWith("ad cache sync done")) { 
RDebugUtils.currentLine=87097363;
 //BA.debugLineNum = 87097363;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
__ref._traceinfo /*String*/ (null,"cache","кэш рекламы обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"ad cache sync done")));
RDebugUtils.currentLine=87097364;
 //BA.debugLineNum = 87097364;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097366;
 //BA.debugLineNum = 87097366;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
if (_message.startsWith("Аудит кэша завершен.")) { 
RDebugUtils.currentLine=87097367;
 //BA.debugLineNum = 87097367;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
__ref._traceinfo /*String*/ (null,"cache","аудит кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Аудит кэша завершен.")));
RDebugUtils.currentLine=87097368;
 //BA.debugLineNum = 87097368;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097370;
 //BA.debugLineNum = 87097370;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
if (_message.startsWith("Очистка кэша треков завершена.")) { 
RDebugUtils.currentLine=87097371;
 //BA.debugLineNum = 87097371;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Очистка кэша треков завершена.")));
RDebugUtils.currentLine=87097372;
 //BA.debugLineNum = 87097372;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097374;
 //BA.debugLineNum = 87097374;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
if (_message.startsWith("кэш треков очистка итог")) { 
RDebugUtils.currentLine=87097375;
 //BA.debugLineNum = 87097375;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"кэш треков очистка итог")));
RDebugUtils.currentLine=87097376;
 //BA.debugLineNum = 87097376;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097378;
 //BA.debugLineNum = 87097378;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
if (_message.startsWith("Удален cached ad, отсутствующий в актуальном data.")) { 
RDebugUtils.currentLine=87097379;
 //BA.debugLineNum = 87097379;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
__ref._traceinfo /*String*/ (null,"cache","реклама удалена из кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Удален cached ad, отсутствующий в актуальном data.")));
RDebugUtils.currentLine=87097380;
 //BA.debugLineNum = 87097380;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097382;
 //BA.debugLineNum = 87097382;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
if (_message.startsWith("подготовка data playback ошибка")) { 
RDebugUtils.currentLine=87097383;
 //BA.debugLineNum = 87097383;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста","");
RDebugUtils.currentLine=87097384;
 //BA.debugLineNum = 87097384;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097386;
 //BA.debugLineNum = 87097386;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
if (_message.startsWith("очередь запрос ошибка")) { 
RDebugUtils.currentLine=87097387;
 //BA.debugLineNum = 87097387;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь запрос ошибка")));
RDebugUtils.currentLine=87097388;
 //BA.debugLineNum = 87097388;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097390;
 //BA.debugLineNum = 87097390;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
if (_message.startsWith("очередь next ошибка")) { 
RDebugUtils.currentLine=87097391;
 //BA.debugLineNum = 87097391;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь next ошибка")));
RDebugUtils.currentLine=87097392;
 //BA.debugLineNum = 87097392;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097394;
 //BA.debugLineNum = 87097394;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
if (_message.startsWith("очередь fetch ошибка")) { 
RDebugUtils.currentLine=87097395;
 //BA.debugLineNum = 87097395;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
__ref._tracewarn /*String*/ (null,"network","ошибка очереди",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь fetch ошибка")));
RDebugUtils.currentLine=87097396;
 //BA.debugLineNum = 87097396;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097398;
 //BA.debugLineNum = 87097398;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
if (_message.startsWith("состояние blocked")) { 
RDebugUtils.currentLine=87097399;
 //BA.debugLineNum = 87097399;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
__ref._tracewarn /*String*/ (null,"player","плеер заблокирован","");
RDebugUtils.currentLine=87097400;
 //BA.debugLineNum = 87097400;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097402;
 //BA.debugLineNum = 87097402;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
if (_message.startsWith("состояние stop") || _message.startsWith("message shutdown")) { 
RDebugUtils.currentLine=87097403;
 //BA.debugLineNum = 87097403;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
__ref._tracewarn /*String*/ (null,"player","воспроизведение остановлено",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=87097404;
 //BA.debugLineNum = 87097404;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097406;
 //BA.debugLineNum = 87097406;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
if (_message.startsWith("fallback activate")) { 
RDebugUtils.currentLine=87097407;
 //BA.debugLineNum = 87097407;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
__ref._tracewarn /*String*/ (null,"playback","включен локальный fallback",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"fallback activate")));
RDebugUtils.currentLine=87097408;
 //BA.debugLineNum = 87097408;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097410;
 //BA.debugLineNum = 87097410;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
if (_message.startsWith("degraded path вход")) { 
RDebugUtils.currentLine=87097411;
 //BA.debugLineNum = 87097411;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
__ref._tracewarn /*String*/ (null,"network","деградация media path","");
RDebugUtils.currentLine=87097412;
 //BA.debugLineNum = 87097412;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097414;
 //BA.debugLineNum = 87097414;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
if (_message.startsWith("degraded path восстановлен")) { 
RDebugUtils.currentLine=87097415;
 //BA.debugLineNum = 87097415;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
__ref._traceinfo /*String*/ (null,"network","media path восстановлен","");
RDebugUtils.currentLine=87097416;
 //BA.debugLineNum = 87097416;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097418;
 //BA.debugLineNum = 87097418;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
if (_message.startsWith("история чтение ошибка") || _message.startsWith("история response parse ошибка")) { 
RDebugUtils.currentLine=87097419;
 //BA.debugLineNum = 87097419;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
__ref._tracewarn /*String*/ (null,"history","ошибка истории","");
RDebugUtils.currentLine=87097420;
 //BA.debugLineNum = 87097420;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097422;
 //BA.debugLineNum = 87097422;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
if (_message.startsWith("метаданные плейлистов sync итог")) { 
RDebugUtils.currentLine=87097423;
 //BA.debugLineNum = 87097423;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
__ref._traceinfo /*String*/ (null,"network","метаданные плейлистов обновлены",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлистов sync итог")));
RDebugUtils.currentLine=87097424;
 //BA.debugLineNum = 87097424;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097426;
 //BA.debugLineNum = 87097426;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
if (_message.startsWith("метаданные плейлиста fetch ошибка")) { 
RDebugUtils.currentLine=87097427;
 //BA.debugLineNum = 87097427;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
__ref._tracewarn /*String*/ (null,"network","ошибка метаданных плейлиста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлиста fetch ошибка")));
RDebugUtils.currentLine=87097428;
 //BA.debugLineNum = 87097428;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097430;
 //BA.debugLineNum = 87097430;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
if (_message.startsWith("Не удалось подготовить временный файл трека.")) { 
RDebugUtils.currentLine=87097431;
 //BA.debugLineNum = 87097431;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
__ref._traceerror /*String*/ (null,"cache","ошибка подготовки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Не удалось подготовить временный файл трека.")));
RDebugUtils.currentLine=87097432;
 //BA.debugLineNum = 87097432;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=87097434;
 //BA.debugLineNum = 87097434;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=87097435;
 //BA.debugLineNum = 87097435;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=87097436;
 //BA.debugLineNum = 87097436;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldsuppresstracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "shouldsuppresstracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldsuppresstracemessage", new Object[] {_message}));}
anywheresoftware.b4a.objects.collections.List _noisyprefixes = null;
String _prefix = "";
RDebugUtils.currentLine=87162880;
 //BA.debugLineNum = 87162880;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
RDebugUtils.currentLine=87162881;
 //BA.debugLineNum = 87162881;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
if (_message.startsWith("guard переход") || _message.startsWith("переход dispatch")) { 
RDebugUtils.currentLine=87162882;
 //BA.debugLineNum = 87162882;BA.debugLine="If releaseBuild Then";
if (__ref._releasebuild /*boolean*/ ) { 
RDebugUtils.currentLine=87162883;
 //BA.debugLineNum = 87162883;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=87162885;
 //BA.debugLineNum = 87162885;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=87162888;
 //BA.debugLineNum = 87162888;BA.debugLine="Dim noisyPrefixes As List";
_noisyprefixes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87162889;
 //BA.debugLineNum = 87162889;BA.debugLine="noisyPrefixes.Initialize";
_noisyprefixes.Initialize();
RDebugUtils.currentLine=87162890;
 //BA.debugLineNum = 87162890;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
_noisyprefixes.Add((Object)("курсор плейлистов load"));
RDebugUtils.currentLine=87162891;
 //BA.debugLineNum = 87162891;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
_noisyprefixes.Add((Object)("состояние init"));
RDebugUtils.currentLine=87162892;
 //BA.debugLineNum = 87162892;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
_noisyprefixes.Add((Object)("старт skip"));
RDebugUtils.currentLine=87162893;
 //BA.debugLineNum = 87162893;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
_noisyprefixes.Add((Object)("старт вход"));
RDebugUtils.currentLine=87162894;
 //BA.debugLineNum = 87162894;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
_noisyprefixes.Add((Object)("отложенный старт"));
RDebugUtils.currentLine=87162895;
 //BA.debugLineNum = 87162895;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
_noisyprefixes.Add((Object)("сценарий "));
RDebugUtils.currentLine=87162896;
 //BA.debugLineNum = 87162896;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
_noisyprefixes.Add((Object)("flow переход"));
RDebugUtils.currentLine=87162897;
 //BA.debugLineNum = 87162897;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
_noisyprefixes.Add((Object)("guard переход"));
RDebugUtils.currentLine=87162898;
 //BA.debugLineNum = 87162898;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
_noisyprefixes.Add((Object)("guard подготовка"));
RDebugUtils.currentLine=87162899;
 //BA.debugLineNum = 87162899;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
_noisyprefixes.Add((Object)("guard prefetch"));
RDebugUtils.currentLine=87162900;
 //BA.debugLineNum = 87162900;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
_noisyprefixes.Add((Object)("guard fade"));
RDebugUtils.currentLine=87162901;
 //BA.debugLineNum = 87162901;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
_noisyprefixes.Add((Object)("переход dispatch"));
RDebugUtils.currentLine=87162902;
 //BA.debugLineNum = 87162902;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
_noisyprefixes.Add((Object)("воспроизведение activate"));
RDebugUtils.currentLine=87162903;
 //BA.debugLineNum = 87162903;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
_noisyprefixes.Add((Object)("очередь добор"));
RDebugUtils.currentLine=87162904;
 //BA.debugLineNum = 87162904;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=87162905;
 //BA.debugLineNum = 87162905;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=87162906;
 //BA.debugLineNum = 87162906;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=87162907;
 //BA.debugLineNum = 87162907;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
_noisyprefixes.Add((Object)("автостарт сначала обновление данных"));
RDebugUtils.currentLine=87162908;
 //BA.debugLineNum = 87162908;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
_noisyprefixes.Add((Object)("policy resume авто"));
RDebugUtils.currentLine=87162909;
 //BA.debugLineNum = 87162909;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
_noisyprefixes.Add((Object)("возобновление запрет"));
RDebugUtils.currentLine=87162910;
 //BA.debugLineNum = 87162910;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
_noisyprefixes.Add((Object)("возобновление итог"));
RDebugUtils.currentLine=87162911;
 //BA.debugLineNum = 87162911;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
_noisyprefixes.Add((Object)("снимок очереди восстановление skip"));
RDebugUtils.currentLine=87162912;
 //BA.debugLineNum = 87162912;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
_noisyprefixes.Add((Object)("http get начало"));
RDebugUtils.currentLine=87162913;
 //BA.debugLineNum = 87162913;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
_noisyprefixes.Add((Object)("http get итог"));
RDebugUtils.currentLine=87162914;
 //BA.debugLineNum = 87162914;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
_noisyprefixes.Add((Object)("claim начало"));
RDebugUtils.currentLine=87162915;
 //BA.debugLineNum = 87162915;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
_noisyprefixes.Add((Object)("claim итог"));
RDebugUtils.currentLine=87162916;
 //BA.debugLineNum = 87162916;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
_noisyprefixes.Add((Object)("элемент очереди play"));
RDebugUtils.currentLine=87162917;
 //BA.debugLineNum = 87162917;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
_noisyprefixes.Add((Object)("курсор плейлистов commit"));
RDebugUtils.currentLine=87162918;
 //BA.debugLineNum = 87162918;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
_noisyprefixes.Add((Object)("реклама prescan начало"));
RDebugUtils.currentLine=87162919;
 //BA.debugLineNum = 87162919;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
_noisyprefixes.Add((Object)("брейк exact defer"));
RDebugUtils.currentLine=87162920;
 //BA.debugLineNum = 87162920;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
_noisyprefixes.Add((Object)("брейк exact sync"));
RDebugUtils.currentLine=87162921;
 //BA.debugLineNum = 87162921;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
_noisyprefixes.Add((Object)("fade начало"));
RDebugUtils.currentLine=87162922;
 //BA.debugLineNum = 87162922;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
_noisyprefixes.Add((Object)("история confirm"));
RDebugUtils.currentLine=87162923;
 //BA.debugLineNum = 87162923;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
_noisyprefixes.Add((Object)("история stage"));
RDebugUtils.currentLine=87162924;
 //BA.debugLineNum = 87162924;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
_noisyprefixes.Add((Object)("история буфер add"));
RDebugUtils.currentLine=87162925;
 //BA.debugLineNum = 87162925;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
_noisyprefixes.Add((Object)("история отправка начало"));
RDebugUtils.currentLine=87162926;
 //BA.debugLineNum = 87162926;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
_noisyprefixes.Add((Object)("история отправка payload"));
RDebugUtils.currentLine=87162927;
 //BA.debugLineNum = 87162927;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
_noisyprefixes.Add((Object)("история отправка ack"));
RDebugUtils.currentLine=87162928;
 //BA.debugLineNum = 87162928;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
_noisyprefixes.Add((Object)("stop запрос"));
RDebugUtils.currentLine=87162929;
 //BA.debugLineNum = 87162929;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
_noisyprefixes.Add((Object)("резерв очереди save"));
RDebugUtils.currentLine=87162930;
 //BA.debugLineNum = 87162930;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
_noisyprefixes.Add((Object)("снимок очереди clear"));
RDebugUtils.currentLine=87162931;
 //BA.debugLineNum = 87162931;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
_noisyprefixes.Add((Object)("состояние воспроизведения clear"));
RDebugUtils.currentLine=87162932;
 //BA.debugLineNum = 87162932;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
_noisyprefixes.Add((Object)("аудио ready"));
RDebugUtils.currentLine=87162933;
 //BA.debugLineNum = 87162933;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
_noisyprefixes.Add((Object)("аудио complete"));
RDebugUtils.currentLine=87162934;
 //BA.debugLineNum = 87162934;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
_noisyprefixes.Add((Object)("переход overlap начало"));
RDebugUtils.currentLine=87162935;
 //BA.debugLineNum = 87162935;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
_noisyprefixes.Add((Object)("переход tail начало"));
RDebugUtils.currentLine=87162936;
 //BA.debugLineNum = 87162936;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
_noisyprefixes.Add((Object)("переход prefetch начало"));
RDebugUtils.currentLine=87162937;
 //BA.debugLineNum = 87162937;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
_noisyprefixes.Add((Object)("trusted time update"));
RDebugUtils.currentLine=87162938;
 //BA.debugLineNum = 87162938;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
_noisyprefixes.Add((Object)("player end parse fail"));
RDebugUtils.currentLine=87162939;
 //BA.debugLineNum = 87162939;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
_noisyprefixes.Add((Object)("[AudioPrimary]"));
RDebugUtils.currentLine=87162940;
 //BA.debugLineNum = 87162940;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
_noisyprefixes.Add((Object)("[AudioSecondary]"));
RDebugUtils.currentLine=87162941;
 //BA.debugLineNum = 87162941;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
_noisyprefixes.Add((Object)("machine guid"));
RDebugUtils.currentLine=87162942;
 //BA.debugLineNum = 87162942;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
_noisyprefixes.Add((Object)("legacy migrate итог"));
RDebugUtils.currentLine=87162943;
 //BA.debugLineNum = 87162943;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
_noisyprefixes.Add((Object)("метаданные плейлистов sync skip"));
RDebugUtils.currentLine=87162944;
 //BA.debugLineNum = 87162944;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
_noisyprefixes.Add((Object)("метаданные плейлиста fetch начало"));
RDebugUtils.currentLine=87162945;
 //BA.debugLineNum = 87162945;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
_noisyprefixes.Add((Object)("окно save"));
RDebugUtils.currentLine=87162946;
 //BA.debugLineNum = 87162946;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
_noisyprefixes.Add((Object)("окно restore"));
RDebugUtils.currentLine=87162947;
 //BA.debugLineNum = 87162947;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
_noisyprefixes.Add((Object)("trace отправка"));
RDebugUtils.currentLine=87162948;
 //BA.debugLineNum = 87162948;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
_noisyprefixes.Add((Object)("скачивание рекламы в кэш"));
RDebugUtils.currentLine=87162949;
 //BA.debugLineNum = 87162949;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
_noisyprefixes.Add((Object)("скачивание трека в кэш"));
RDebugUtils.currentLine=87162950;
 //BA.debugLineNum = 87162950;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
_noisyprefixes.Add((Object)("удален cached track при очистке кэша"));
RDebugUtils.currentLine=87162951;
 //BA.debugLineNum = 87162951;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
_noisyprefixes.Add((Object)("очистка кэша треков пропущена"));
RDebugUtils.currentLine=87162952;
 //BA.debugLineNum = 87162952;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=87162953;
 //BA.debugLineNum = 87162953;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=87162954;
 //BA.debugLineNum = 87162954;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=87162955;
 //BA.debugLineNum = 87162955;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
_noisyprefixes.Add((Object)("переход очередь drop"));
RDebugUtils.currentLine=87162956;
 //BA.debugLineNum = 87162956;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
_noisyprefixes.Add((Object)("переход preload ошибка"));
RDebugUtils.currentLine=87162957;
 //BA.debugLineNum = 87162957;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
_noisyprefixes.Add((Object)("переход prepared reject"));
RDebugUtils.currentLine=87162958;
 //BA.debugLineNum = 87162958;BA.debugLine="For Each prefix As String In noisyPrefixes";
{
final anywheresoftware.b4a.BA.IterableList group78 = _noisyprefixes;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=87162959;
 //BA.debugLineNum = 87162959;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
if (_message.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).startsWith(_prefix.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=87162961;
 //BA.debugLineNum = 87162961;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=87162962;
 //BA.debugLineNum = 87162962;BA.debugLine="End Sub";
return false;
}
public String  _tracedebug(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
RDebugUtils.currentLine=86835200;
 //BA.debugLineNum = 86835200;BA.debugLine="Private Sub TraceDebug(message As String)";
RDebugUtils.currentLine=86835201;
 //BA.debugLineNum = 86835201;BA.debugLine="traceServiceRef.TraceDebug(message)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=86835202;
 //BA.debugLineNum = 86835202;BA.debugLine="End Sub";
return "";
}
public String  _normalizelegacydetails(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "normalizelegacydetails", false))
	 {return ((String) Debug.delegate(ba, "normalizelegacydetails", new Object[] {_text}));}
String _value = "";
RDebugUtils.currentLine=87228416;
 //BA.debugLineNum = 87228416;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
RDebugUtils.currentLine=87228417;
 //BA.debugLineNum = 87228417;BA.debugLine="Dim value As String = text.Trim";
_value = _text.trim();
RDebugUtils.currentLine=87228418;
 //BA.debugLineNum = 87228418;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
if (_value.startsWith(".") || _value.startsWith(":")) { 
_value = _value.substring((int) (1)).trim();};
RDebugUtils.currentLine=87228419;
 //BA.debugLineNum = 87228419;BA.debugLine="value = value.Replace(\",\", \"\")";
_value = _value.replace(",","");
RDebugUtils.currentLine=87228420;
 //BA.debugLineNum = 87228420;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=87228421;
 //BA.debugLineNum = 87228421;BA.debugLine="End Sub";
return "";
}
public String  _tailafter(b4j.example.playbacktracerouter __ref,String _text,String _prefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafter", false))
	 {return ((String) Debug.delegate(ba, "tailafter", new Object[] {_text,_prefix}));}
RDebugUtils.currentLine=87293952;
 //BA.debugLineNum = 87293952;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
RDebugUtils.currentLine=87293953;
 //BA.debugLineNum = 87293953;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
if (_text.startsWith(_prefix)==__c.False) { 
if (true) return _text;};
RDebugUtils.currentLine=87293954;
 //BA.debugLineNum = 87293954;BA.debugLine="Return text.SubString(prefix.Length).Trim";
if (true) return _text.substring(_prefix.length()).trim();
RDebugUtils.currentLine=87293955;
 //BA.debugLineNum = 87293955;BA.debugLine="End Sub";
return "";
}
public String  _tailafterfirstspace(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafterfirstspace", false))
	 {return ((String) Debug.delegate(ba, "tailafterfirstspace", new Object[] {_text}));}
int _firstspace = 0;
RDebugUtils.currentLine=87359488;
 //BA.debugLineNum = 87359488;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
RDebugUtils.currentLine=87359489;
 //BA.debugLineNum = 87359489;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
_firstspace = _text.indexOf(" ");
RDebugUtils.currentLine=87359490;
 //BA.debugLineNum = 87359490;BA.debugLine="If firstSpace < 0 Then Return \"\"";
if (_firstspace<0) { 
if (true) return "";};
RDebugUtils.currentLine=87359491;
 //BA.debugLineNum = 87359491;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
if (true) return _text.substring((int) (_firstspace+1)).trim();
RDebugUtils.currentLine=87359492;
 //BA.debugLineNum = 87359492;BA.debugLine="End Sub";
return "";
}
}