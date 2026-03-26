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
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _initialize(b4j.example.playbacktracerouter __ref,anywheresoftware.b4a.BA _ba,b4j.example.traceservice _tracesvc,b4j.example.playbacktraceformatter _formattervalue,boolean _isreleasebuild,int _debugcontextlinecount) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_tracesvc,_formattervalue,_isreleasebuild,_debugcontextlinecount}));}
RDebugUtils.currentLine=55836672;
 //BA.debugLineNum = 55836672;BA.debugLine="Public Sub Initialize(traceSvc As TraceService, fo";
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="traceServiceRef = traceSvc";
__ref._traceserviceref /*b4j.example.traceservice*/  = _tracesvc;
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="formatterRef = formatterValue";
__ref._formatterref /*b4j.example.playbacktraceformatter*/  = _formattervalue;
RDebugUtils.currentLine=55836675;
 //BA.debugLineNum = 55836675;BA.debugLine="releaseBuild = isReleaseBuild";
__ref._releasebuild /*boolean*/  = _isreleasebuild;
RDebugUtils.currentLine=55836676;
 //BA.debugLineNum = 55836676;BA.debugLine="debugContextLines = debugContextLineCount";
__ref._debugcontextlines /*int*/  = _debugcontextlinecount;
RDebugUtils.currentLine=55836677;
 //BA.debugLineNum = 55836677;BA.debugLine="End Sub";
return "";
}
public String  _tracedebugmessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebugmessage", false))
	 {return ((String) Debug.delegate(ba, "tracedebugmessage", new Object[] {_message}));}
RDebugUtils.currentLine=56229888;
 //BA.debugLineNum = 56229888;BA.debugLine="Public Sub TraceDebugMessage(message As String)";
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="End Sub";
return "";
}
public String  _traceerror(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceerror", false))
	 {return ((String) Debug.delegate(ba, "traceerror", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Public Sub TraceError(category As String, message";
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"ERROR",_category,_message,_details);
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="AppendRecentDebugContext(\"Контекст ошибки\")";
__ref._appendrecentdebugcontext /*String*/ (null,"Контекст ошибки");
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=55967744;
 //BA.debugLineNum = 55967744;BA.debugLine="Public Sub TraceInfo(category As String, message A";
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"INFO",_category,_message,_details);
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=55902208;
 //BA.debugLineNum = 55902208;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=55902209;
 //BA.debugLineNum = 55902209;BA.debugLine="If message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=55902210;
 //BA.debugLineNum = 55902210;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
if (__ref._handlediagnostictracemessage /*boolean*/ (null,_message)) { 
if (true) return "";};
RDebugUtils.currentLine=55902211;
 //BA.debugLineNum = 55902211;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=55902212;
 //BA.debugLineNum = 55902212;BA.debugLine="End Sub";
return "";
}
public String  _tracestate(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracestate", false))
	 {return ((String) Debug.delegate(ba, "tracestate", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56164352;
 //BA.debugLineNum = 56164352;BA.debugLine="Public Sub TraceState(category As String, message";
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"STATE",_category,_message,_details);
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56033280;
 //BA.debugLineNum = 56033280;BA.debugLine="Public Sub TraceWarn(category As String, message A";
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"WARN",_category,_message,_details);
RDebugUtils.currentLine=56033282;
 //BA.debugLineNum = 56033282;BA.debugLine="End Sub";
return "";
}
public String  _appendrecentdebugcontext(b4j.example.playbacktracerouter __ref,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "appendrecentdebugcontext", false))
	 {return ((String) Debug.delegate(ba, "appendrecentdebugcontext", new Object[] {_title}));}
anywheresoftware.b4a.objects.collections.List _debuglines = null;
String _debugline = "";
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Private Sub AppendRecentDebugContext(title As Stri";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="Dim debugLines As List = traceServiceRef.GetRecen";
_debuglines = new anywheresoftware.b4a.objects.collections.List();
_debuglines = __ref._traceserviceref /*b4j.example.traceservice*/ ._getrecentdebuglist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._debugcontextlines /*int*/ );
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="If debugLines.IsInitialized = False Or debugLines";
if (_debuglines.IsInitialized()==__c.False || _debuglines.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=56360963;
 //BA.debugLineNum = 56360963;BA.debugLine="WriteTraceEntry(\"DEBUG\", \"debug\", title, \"\")";
__ref._writetraceentry /*String*/ (null,"DEBUG","debug",_title,"");
RDebugUtils.currentLine=56360964;
 //BA.debugLineNum = 56360964;BA.debugLine="For Each debugLine As String In debugLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _debuglines;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_debugline = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=56360965;
 //BA.debugLineNum = 56360965;BA.debugLine="traceServiceRef.Trace(\"DEBUG \" & TrimDebugContex";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,"DEBUG "+__ref._trimdebugcontextline /*String*/ (null,_debugline));
 }
};
RDebugUtils.currentLine=56360967;
 //BA.debugLineNum = 56360967;BA.debugLine="End Sub";
return "";
}
public String  _writetraceentry(b4j.example.playbacktracerouter __ref,String _level,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "writetraceentry", false))
	 {return ((String) Debug.delegate(ba, "writetraceentry", new Object[] {_level,_category,_message,_details}));}
String _line = "";
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="Dim line As String = level & \" \" & formatterRef.B";
_line = _level+" "+__ref._formatterref /*b4j.example.playbacktraceformatter*/ ._buildhumantracemessage /*String*/ (null,_category,_message,_details.trim());
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="traceServiceRef.Trace(line)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,_line);
RDebugUtils.currentLine=56492035;
 //BA.debugLineNum = 56492035;BA.debugLine="End Sub";
return "";
}
public String  _trimdebugcontextline(b4j.example.playbacktracerouter __ref,String _debugline) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "trimdebugcontextline", false))
	 {return ((String) Debug.delegate(ba, "trimdebugcontextline", new Object[] {_debugline}));}
String _marker = "";
int _markerindex = 0;
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Private Sub TrimDebugContextLine(debugLine As Stri";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="If debugLine = \"\" Then Return \"\"";
if ((_debugline).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="Dim marker As String = \" DEBUG \"";
_marker = " DEBUG ";
RDebugUtils.currentLine=56426499;
 //BA.debugLineNum = 56426499;BA.debugLine="Dim markerIndex As Int = debugLine.IndexOf(marker";
_markerindex = _debugline.indexOf(_marker);
RDebugUtils.currentLine=56426500;
 //BA.debugLineNum = 56426500;BA.debugLine="If markerIndex < 0 Then Return debugLine";
if (_markerindex<0) { 
if (true) return _debugline;};
RDebugUtils.currentLine=56426501;
 //BA.debugLineNum = 56426501;BA.debugLine="Return debugLine.SubString(markerIndex + marker.L";
if (true) return _debugline.substring((int) (_markerindex+_marker.length())).trim();
RDebugUtils.currentLine=56426502;
 //BA.debugLineNum = 56426502;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktracerouter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
RDebugUtils.currentLine=55771136;
 //BA.debugLineNum = 55771136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=55771137;
 //BA.debugLineNum = 55771137;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4j.example.traceservice();
RDebugUtils.currentLine=55771138;
 //BA.debugLineNum = 55771138;BA.debugLine="Private formatterRef As PlaybackTraceFormatter";
_formatterref = new b4j.example.playbacktraceformatter();
RDebugUtils.currentLine=55771139;
 //BA.debugLineNum = 55771139;BA.debugLine="Private releaseBuild As Boolean";
_releasebuild = false;
RDebugUtils.currentLine=55771140;
 //BA.debugLineNum = 55771140;BA.debugLine="Private debugContextLines As Int";
_debugcontextlines = 0;
RDebugUtils.currentLine=55771141;
 //BA.debugLineNum = 55771141;BA.debugLine="End Sub";
return "";
}
public boolean  _handlediagnostictracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "handlediagnostictracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "handlediagnostictracemessage", new Object[] {_message}));}
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="If message = \"\" Then Return True";
if ((_message).equals("")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="If ShouldSuppressTraceMessage(message) Then";
if (__ref._shouldsuppresstracemessage /*boolean*/ (null,_message)) { 
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56557572;
 //BA.debugLineNum = 56557572;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557574;
 //BA.debugLineNum = 56557574;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
if (_message.startsWith("Трек сохранен в кэш.")) { 
RDebugUtils.currentLine=56557575;
 //BA.debugLineNum = 56557575;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
__ref._traceinfo /*String*/ (null,"cache","трек загружен в кэш",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Трек сохранен в кэш.")));
RDebugUtils.currentLine=56557576;
 //BA.debugLineNum = 56557576;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557578;
 //BA.debugLineNum = 56557578;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
if (_message.startsWith("Не удалось скачать трек.") || _message.startsWith("Не удалось сохранить трек в кэш.")) { 
RDebugUtils.currentLine=56557579;
 //BA.debugLineNum = 56557579;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
__ref._traceerror /*String*/ (null,"cache","ошибка загрузки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=56557580;
 //BA.debugLineNum = 56557580;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557582;
 //BA.debugLineNum = 56557582;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
if (_message.startsWith("Синхронизация кэша треков завершена.")) { 
RDebugUtils.currentLine=56557583;
 //BA.debugLineNum = 56557583;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
__ref._traceinfo /*String*/ (null,"cache","кэш треков обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Синхронизация кэша треков завершена.")));
RDebugUtils.currentLine=56557584;
 //BA.debugLineNum = 56557584;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557586;
 //BA.debugLineNum = 56557586;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
if (_message.startsWith("ad cache sync done")) { 
RDebugUtils.currentLine=56557587;
 //BA.debugLineNum = 56557587;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
__ref._traceinfo /*String*/ (null,"cache","кэш рекламы обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"ad cache sync done")));
RDebugUtils.currentLine=56557588;
 //BA.debugLineNum = 56557588;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557590;
 //BA.debugLineNum = 56557590;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
if (_message.startsWith("Аудит кэша завершен.")) { 
RDebugUtils.currentLine=56557591;
 //BA.debugLineNum = 56557591;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
__ref._traceinfo /*String*/ (null,"cache","аудит кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Аудит кэша завершен.")));
RDebugUtils.currentLine=56557592;
 //BA.debugLineNum = 56557592;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557594;
 //BA.debugLineNum = 56557594;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
if (_message.startsWith("Очистка кэша треков завершена.")) { 
RDebugUtils.currentLine=56557595;
 //BA.debugLineNum = 56557595;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Очистка кэша треков завершена.")));
RDebugUtils.currentLine=56557596;
 //BA.debugLineNum = 56557596;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557598;
 //BA.debugLineNum = 56557598;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
if (_message.startsWith("кэш треков очистка итог")) { 
RDebugUtils.currentLine=56557599;
 //BA.debugLineNum = 56557599;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"кэш треков очистка итог")));
RDebugUtils.currentLine=56557600;
 //BA.debugLineNum = 56557600;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557602;
 //BA.debugLineNum = 56557602;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
if (_message.startsWith("Удален cached ad, отсутствующий в актуальном data.")) { 
RDebugUtils.currentLine=56557603;
 //BA.debugLineNum = 56557603;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
__ref._traceinfo /*String*/ (null,"cache","реклама удалена из кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Удален cached ad, отсутствующий в актуальном data.")));
RDebugUtils.currentLine=56557604;
 //BA.debugLineNum = 56557604;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557606;
 //BA.debugLineNum = 56557606;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
if (_message.startsWith("подготовка data playback ошибка")) { 
RDebugUtils.currentLine=56557607;
 //BA.debugLineNum = 56557607;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста","");
RDebugUtils.currentLine=56557608;
 //BA.debugLineNum = 56557608;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557610;
 //BA.debugLineNum = 56557610;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
if (_message.startsWith("очередь запрос ошибка")) { 
RDebugUtils.currentLine=56557611;
 //BA.debugLineNum = 56557611;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь запрос ошибка")));
RDebugUtils.currentLine=56557612;
 //BA.debugLineNum = 56557612;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557614;
 //BA.debugLineNum = 56557614;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
if (_message.startsWith("очередь next ошибка")) { 
RDebugUtils.currentLine=56557615;
 //BA.debugLineNum = 56557615;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь next ошибка")));
RDebugUtils.currentLine=56557616;
 //BA.debugLineNum = 56557616;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557618;
 //BA.debugLineNum = 56557618;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
if (_message.startsWith("очередь fetch ошибка")) { 
RDebugUtils.currentLine=56557619;
 //BA.debugLineNum = 56557619;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
__ref._tracewarn /*String*/ (null,"network","ошибка очереди",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь fetch ошибка")));
RDebugUtils.currentLine=56557620;
 //BA.debugLineNum = 56557620;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557622;
 //BA.debugLineNum = 56557622;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
if (_message.startsWith("состояние blocked")) { 
RDebugUtils.currentLine=56557623;
 //BA.debugLineNum = 56557623;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
__ref._tracewarn /*String*/ (null,"player","плеер заблокирован","");
RDebugUtils.currentLine=56557624;
 //BA.debugLineNum = 56557624;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557626;
 //BA.debugLineNum = 56557626;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
if (_message.startsWith("состояние stop") || _message.startsWith("message shutdown")) { 
RDebugUtils.currentLine=56557627;
 //BA.debugLineNum = 56557627;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
__ref._tracewarn /*String*/ (null,"player","воспроизведение остановлено",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=56557628;
 //BA.debugLineNum = 56557628;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557630;
 //BA.debugLineNum = 56557630;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
if (_message.startsWith("fallback activate")) { 
RDebugUtils.currentLine=56557631;
 //BA.debugLineNum = 56557631;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
__ref._tracewarn /*String*/ (null,"playback","включен локальный fallback",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"fallback activate")));
RDebugUtils.currentLine=56557632;
 //BA.debugLineNum = 56557632;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557634;
 //BA.debugLineNum = 56557634;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
if (_message.startsWith("degraded path вход")) { 
RDebugUtils.currentLine=56557635;
 //BA.debugLineNum = 56557635;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
__ref._tracewarn /*String*/ (null,"network","деградация media path","");
RDebugUtils.currentLine=56557636;
 //BA.debugLineNum = 56557636;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557638;
 //BA.debugLineNum = 56557638;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
if (_message.startsWith("degraded path восстановлен")) { 
RDebugUtils.currentLine=56557639;
 //BA.debugLineNum = 56557639;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
__ref._traceinfo /*String*/ (null,"network","media path восстановлен","");
RDebugUtils.currentLine=56557640;
 //BA.debugLineNum = 56557640;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557642;
 //BA.debugLineNum = 56557642;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
if (_message.startsWith("история чтение ошибка") || _message.startsWith("история response parse ошибка")) { 
RDebugUtils.currentLine=56557643;
 //BA.debugLineNum = 56557643;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
__ref._tracewarn /*String*/ (null,"history","ошибка истории","");
RDebugUtils.currentLine=56557644;
 //BA.debugLineNum = 56557644;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557646;
 //BA.debugLineNum = 56557646;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
if (_message.startsWith("метаданные плейлистов sync итог")) { 
RDebugUtils.currentLine=56557647;
 //BA.debugLineNum = 56557647;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
__ref._traceinfo /*String*/ (null,"network","метаданные плейлистов обновлены",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлистов sync итог")));
RDebugUtils.currentLine=56557648;
 //BA.debugLineNum = 56557648;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557650;
 //BA.debugLineNum = 56557650;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
if (_message.startsWith("метаданные плейлиста fetch ошибка")) { 
RDebugUtils.currentLine=56557651;
 //BA.debugLineNum = 56557651;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
__ref._tracewarn /*String*/ (null,"network","ошибка метаданных плейлиста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлиста fetch ошибка")));
RDebugUtils.currentLine=56557652;
 //BA.debugLineNum = 56557652;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557654;
 //BA.debugLineNum = 56557654;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
if (_message.startsWith("Не удалось подготовить временный файл трека.")) { 
RDebugUtils.currentLine=56557655;
 //BA.debugLineNum = 56557655;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
__ref._traceerror /*String*/ (null,"cache","ошибка подготовки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Не удалось подготовить временный файл трека.")));
RDebugUtils.currentLine=56557656;
 //BA.debugLineNum = 56557656;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56557658;
 //BA.debugLineNum = 56557658;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56557659;
 //BA.debugLineNum = 56557659;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=56557660;
 //BA.debugLineNum = 56557660;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldsuppresstracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "shouldsuppresstracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldsuppresstracemessage", new Object[] {_message}));}
anywheresoftware.b4a.objects.collections.List _noisyprefixes = null;
String _prefix = "";
RDebugUtils.currentLine=56623104;
 //BA.debugLineNum = 56623104;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
if (_message.startsWith("guard переход") || _message.startsWith("переход dispatch")) { 
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="If releaseBuild Then";
if (__ref._releasebuild /*boolean*/ ) { 
RDebugUtils.currentLine=56623107;
 //BA.debugLineNum = 56623107;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=56623109;
 //BA.debugLineNum = 56623109;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=56623112;
 //BA.debugLineNum = 56623112;BA.debugLine="Dim noisyPrefixes As List";
_noisyprefixes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56623113;
 //BA.debugLineNum = 56623113;BA.debugLine="noisyPrefixes.Initialize";
_noisyprefixes.Initialize();
RDebugUtils.currentLine=56623114;
 //BA.debugLineNum = 56623114;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
_noisyprefixes.Add((Object)("курсор плейлистов load"));
RDebugUtils.currentLine=56623115;
 //BA.debugLineNum = 56623115;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
_noisyprefixes.Add((Object)("состояние init"));
RDebugUtils.currentLine=56623116;
 //BA.debugLineNum = 56623116;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
_noisyprefixes.Add((Object)("старт skip"));
RDebugUtils.currentLine=56623117;
 //BA.debugLineNum = 56623117;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
_noisyprefixes.Add((Object)("старт вход"));
RDebugUtils.currentLine=56623118;
 //BA.debugLineNum = 56623118;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
_noisyprefixes.Add((Object)("отложенный старт"));
RDebugUtils.currentLine=56623119;
 //BA.debugLineNum = 56623119;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
_noisyprefixes.Add((Object)("сценарий "));
RDebugUtils.currentLine=56623120;
 //BA.debugLineNum = 56623120;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
_noisyprefixes.Add((Object)("flow переход"));
RDebugUtils.currentLine=56623121;
 //BA.debugLineNum = 56623121;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
_noisyprefixes.Add((Object)("guard переход"));
RDebugUtils.currentLine=56623122;
 //BA.debugLineNum = 56623122;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
_noisyprefixes.Add((Object)("guard подготовка"));
RDebugUtils.currentLine=56623123;
 //BA.debugLineNum = 56623123;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
_noisyprefixes.Add((Object)("guard prefetch"));
RDebugUtils.currentLine=56623124;
 //BA.debugLineNum = 56623124;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
_noisyprefixes.Add((Object)("guard fade"));
RDebugUtils.currentLine=56623125;
 //BA.debugLineNum = 56623125;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
_noisyprefixes.Add((Object)("переход dispatch"));
RDebugUtils.currentLine=56623126;
 //BA.debugLineNum = 56623126;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
_noisyprefixes.Add((Object)("воспроизведение activate"));
RDebugUtils.currentLine=56623127;
 //BA.debugLineNum = 56623127;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
_noisyprefixes.Add((Object)("очередь добор"));
RDebugUtils.currentLine=56623128;
 //BA.debugLineNum = 56623128;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=56623129;
 //BA.debugLineNum = 56623129;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=56623130;
 //BA.debugLineNum = 56623130;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=56623131;
 //BA.debugLineNum = 56623131;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
_noisyprefixes.Add((Object)("автостарт сначала обновление данных"));
RDebugUtils.currentLine=56623132;
 //BA.debugLineNum = 56623132;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
_noisyprefixes.Add((Object)("policy resume авто"));
RDebugUtils.currentLine=56623133;
 //BA.debugLineNum = 56623133;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
_noisyprefixes.Add((Object)("возобновление запрет"));
RDebugUtils.currentLine=56623134;
 //BA.debugLineNum = 56623134;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
_noisyprefixes.Add((Object)("возобновление итог"));
RDebugUtils.currentLine=56623135;
 //BA.debugLineNum = 56623135;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
_noisyprefixes.Add((Object)("снимок очереди восстановление skip"));
RDebugUtils.currentLine=56623136;
 //BA.debugLineNum = 56623136;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
_noisyprefixes.Add((Object)("http get начало"));
RDebugUtils.currentLine=56623137;
 //BA.debugLineNum = 56623137;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
_noisyprefixes.Add((Object)("http get итог"));
RDebugUtils.currentLine=56623138;
 //BA.debugLineNum = 56623138;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
_noisyprefixes.Add((Object)("claim начало"));
RDebugUtils.currentLine=56623139;
 //BA.debugLineNum = 56623139;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
_noisyprefixes.Add((Object)("claim итог"));
RDebugUtils.currentLine=56623140;
 //BA.debugLineNum = 56623140;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
_noisyprefixes.Add((Object)("элемент очереди play"));
RDebugUtils.currentLine=56623141;
 //BA.debugLineNum = 56623141;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
_noisyprefixes.Add((Object)("курсор плейлистов commit"));
RDebugUtils.currentLine=56623142;
 //BA.debugLineNum = 56623142;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
_noisyprefixes.Add((Object)("реклама prescan начало"));
RDebugUtils.currentLine=56623143;
 //BA.debugLineNum = 56623143;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
_noisyprefixes.Add((Object)("брейк exact defer"));
RDebugUtils.currentLine=56623144;
 //BA.debugLineNum = 56623144;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
_noisyprefixes.Add((Object)("брейк exact sync"));
RDebugUtils.currentLine=56623145;
 //BA.debugLineNum = 56623145;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
_noisyprefixes.Add((Object)("fade начало"));
RDebugUtils.currentLine=56623146;
 //BA.debugLineNum = 56623146;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
_noisyprefixes.Add((Object)("история confirm"));
RDebugUtils.currentLine=56623147;
 //BA.debugLineNum = 56623147;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
_noisyprefixes.Add((Object)("история stage"));
RDebugUtils.currentLine=56623148;
 //BA.debugLineNum = 56623148;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
_noisyprefixes.Add((Object)("история буфер add"));
RDebugUtils.currentLine=56623149;
 //BA.debugLineNum = 56623149;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
_noisyprefixes.Add((Object)("история отправка начало"));
RDebugUtils.currentLine=56623150;
 //BA.debugLineNum = 56623150;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
_noisyprefixes.Add((Object)("история отправка payload"));
RDebugUtils.currentLine=56623151;
 //BA.debugLineNum = 56623151;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
_noisyprefixes.Add((Object)("история отправка ack"));
RDebugUtils.currentLine=56623152;
 //BA.debugLineNum = 56623152;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
_noisyprefixes.Add((Object)("stop запрос"));
RDebugUtils.currentLine=56623153;
 //BA.debugLineNum = 56623153;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
_noisyprefixes.Add((Object)("резерв очереди save"));
RDebugUtils.currentLine=56623154;
 //BA.debugLineNum = 56623154;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
_noisyprefixes.Add((Object)("снимок очереди clear"));
RDebugUtils.currentLine=56623155;
 //BA.debugLineNum = 56623155;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
_noisyprefixes.Add((Object)("состояние воспроизведения clear"));
RDebugUtils.currentLine=56623156;
 //BA.debugLineNum = 56623156;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
_noisyprefixes.Add((Object)("аудио ready"));
RDebugUtils.currentLine=56623157;
 //BA.debugLineNum = 56623157;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
_noisyprefixes.Add((Object)("аудио complete"));
RDebugUtils.currentLine=56623158;
 //BA.debugLineNum = 56623158;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
_noisyprefixes.Add((Object)("переход overlap начало"));
RDebugUtils.currentLine=56623159;
 //BA.debugLineNum = 56623159;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
_noisyprefixes.Add((Object)("переход tail начало"));
RDebugUtils.currentLine=56623160;
 //BA.debugLineNum = 56623160;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
_noisyprefixes.Add((Object)("переход prefetch начало"));
RDebugUtils.currentLine=56623161;
 //BA.debugLineNum = 56623161;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
_noisyprefixes.Add((Object)("trusted time update"));
RDebugUtils.currentLine=56623162;
 //BA.debugLineNum = 56623162;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
_noisyprefixes.Add((Object)("player end parse fail"));
RDebugUtils.currentLine=56623163;
 //BA.debugLineNum = 56623163;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
_noisyprefixes.Add((Object)("[AudioPrimary]"));
RDebugUtils.currentLine=56623164;
 //BA.debugLineNum = 56623164;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
_noisyprefixes.Add((Object)("[AudioSecondary]"));
RDebugUtils.currentLine=56623165;
 //BA.debugLineNum = 56623165;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
_noisyprefixes.Add((Object)("machine guid"));
RDebugUtils.currentLine=56623166;
 //BA.debugLineNum = 56623166;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
_noisyprefixes.Add((Object)("legacy migrate итог"));
RDebugUtils.currentLine=56623167;
 //BA.debugLineNum = 56623167;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
_noisyprefixes.Add((Object)("метаданные плейлистов sync skip"));
RDebugUtils.currentLine=56623168;
 //BA.debugLineNum = 56623168;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
_noisyprefixes.Add((Object)("метаданные плейлиста fetch начало"));
RDebugUtils.currentLine=56623169;
 //BA.debugLineNum = 56623169;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
_noisyprefixes.Add((Object)("окно save"));
RDebugUtils.currentLine=56623170;
 //BA.debugLineNum = 56623170;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
_noisyprefixes.Add((Object)("окно restore"));
RDebugUtils.currentLine=56623171;
 //BA.debugLineNum = 56623171;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
_noisyprefixes.Add((Object)("trace отправка"));
RDebugUtils.currentLine=56623172;
 //BA.debugLineNum = 56623172;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
_noisyprefixes.Add((Object)("скачивание рекламы в кэш"));
RDebugUtils.currentLine=56623173;
 //BA.debugLineNum = 56623173;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
_noisyprefixes.Add((Object)("скачивание трека в кэш"));
RDebugUtils.currentLine=56623174;
 //BA.debugLineNum = 56623174;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
_noisyprefixes.Add((Object)("удален cached track при очистке кэша"));
RDebugUtils.currentLine=56623175;
 //BA.debugLineNum = 56623175;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
_noisyprefixes.Add((Object)("очистка кэша треков пропущена"));
RDebugUtils.currentLine=56623176;
 //BA.debugLineNum = 56623176;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=56623177;
 //BA.debugLineNum = 56623177;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=56623178;
 //BA.debugLineNum = 56623178;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=56623179;
 //BA.debugLineNum = 56623179;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
_noisyprefixes.Add((Object)("переход очередь drop"));
RDebugUtils.currentLine=56623180;
 //BA.debugLineNum = 56623180;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
_noisyprefixes.Add((Object)("переход preload ошибка"));
RDebugUtils.currentLine=56623181;
 //BA.debugLineNum = 56623181;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
_noisyprefixes.Add((Object)("переход prepared reject"));
RDebugUtils.currentLine=56623182;
 //BA.debugLineNum = 56623182;BA.debugLine="For Each prefix As String In noisyPrefixes";
{
final anywheresoftware.b4a.BA.IterableList group78 = _noisyprefixes;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=56623183;
 //BA.debugLineNum = 56623183;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
if (_message.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).startsWith(_prefix.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=56623185;
 //BA.debugLineNum = 56623185;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=56623186;
 //BA.debugLineNum = 56623186;BA.debugLine="End Sub";
return false;
}
public String  _tracedebug(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Private Sub TraceDebug(message As String)";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="traceServiceRef.TraceDebug(message)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="End Sub";
return "";
}
public String  _normalizelegacydetails(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "normalizelegacydetails", false))
	 {return ((String) Debug.delegate(ba, "normalizelegacydetails", new Object[] {_text}));}
String _value = "";
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="Dim value As String = text.Trim";
_value = _text.trim();
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
if (_value.startsWith(".") || _value.startsWith(":")) { 
_value = _value.substring((int) (1)).trim();};
RDebugUtils.currentLine=56688643;
 //BA.debugLineNum = 56688643;BA.debugLine="value = value.Replace(\",\", \"\")";
_value = _value.replace(",","");
RDebugUtils.currentLine=56688644;
 //BA.debugLineNum = 56688644;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=56688645;
 //BA.debugLineNum = 56688645;BA.debugLine="End Sub";
return "";
}
public String  _tailafter(b4j.example.playbacktracerouter __ref,String _text,String _prefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafter", false))
	 {return ((String) Debug.delegate(ba, "tailafter", new Object[] {_text,_prefix}));}
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
if (_text.startsWith(_prefix)==__c.False) { 
if (true) return _text;};
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="Return text.SubString(prefix.Length).Trim";
if (true) return _text.substring(_prefix.length()).trim();
RDebugUtils.currentLine=56754179;
 //BA.debugLineNum = 56754179;BA.debugLine="End Sub";
return "";
}
public String  _tailafterfirstspace(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafterfirstspace", false))
	 {return ((String) Debug.delegate(ba, "tailafterfirstspace", new Object[] {_text}));}
int _firstspace = 0;
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
_firstspace = _text.indexOf(" ");
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="If firstSpace < 0 Then Return \"\"";
if (_firstspace<0) { 
if (true) return "";};
RDebugUtils.currentLine=56819715;
 //BA.debugLineNum = 56819715;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
if (true) return _text.substring((int) (_firstspace+1)).trim();
RDebugUtils.currentLine=56819716;
 //BA.debugLineNum = 56819716;BA.debugLine="End Sub";
return "";
}
}