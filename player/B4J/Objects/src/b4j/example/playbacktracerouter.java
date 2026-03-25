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
RDebugUtils.currentLine=56229888;
 //BA.debugLineNum = 56229888;BA.debugLine="Public Sub Initialize(traceSvc As TraceService, fo";
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="traceServiceRef = traceSvc";
__ref._traceserviceref /*b4j.example.traceservice*/  = _tracesvc;
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="formatterRef = formatterValue";
__ref._formatterref /*b4j.example.playbacktraceformatter*/  = _formattervalue;
RDebugUtils.currentLine=56229891;
 //BA.debugLineNum = 56229891;BA.debugLine="releaseBuild = isReleaseBuild";
__ref._releasebuild /*boolean*/  = _isreleasebuild;
RDebugUtils.currentLine=56229892;
 //BA.debugLineNum = 56229892;BA.debugLine="debugContextLines = debugContextLineCount";
__ref._debugcontextlines /*int*/  = _debugcontextlinecount;
RDebugUtils.currentLine=56229893;
 //BA.debugLineNum = 56229893;BA.debugLine="End Sub";
return "";
}
public String  _tracedebugmessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebugmessage", false))
	 {return ((String) Debug.delegate(ba, "tracedebugmessage", new Object[] {_message}));}
RDebugUtils.currentLine=56623104;
 //BA.debugLineNum = 56623104;BA.debugLine="Public Sub TraceDebugMessage(message As String)";
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="End Sub";
return "";
}
public String  _traceerror(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceerror", false))
	 {return ((String) Debug.delegate(ba, "traceerror", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Public Sub TraceError(category As String, message";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"ERROR",_category,_message,_details);
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="AppendRecentDebugContext(\"Контекст ошибки\")";
__ref._appendrecentdebugcontext /*String*/ (null,"Контекст ошибки");
RDebugUtils.currentLine=56492035;
 //BA.debugLineNum = 56492035;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Public Sub TraceInfo(category As String, message A";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"INFO",_category,_message,_details);
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="If message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
if (__ref._handlediagnostictracemessage /*boolean*/ (null,_message)) { 
if (true) return "";};
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56295428;
 //BA.debugLineNum = 56295428;BA.debugLine="End Sub";
return "";
}
public String  _tracestate(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracestate", false))
	 {return ((String) Debug.delegate(ba, "tracestate", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Public Sub TraceState(category As String, message";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"STATE",_category,_message,_details);
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Public Sub TraceWarn(category As String, message A";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"WARN",_category,_message,_details);
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="End Sub";
return "";
}
public String  _appendrecentdebugcontext(b4j.example.playbacktracerouter __ref,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "appendrecentdebugcontext", false))
	 {return ((String) Debug.delegate(ba, "appendrecentdebugcontext", new Object[] {_title}));}
anywheresoftware.b4a.objects.collections.List _debuglines = null;
String _debugline = "";
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Private Sub AppendRecentDebugContext(title As Stri";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="Dim debugLines As List = traceServiceRef.GetRecen";
_debuglines = new anywheresoftware.b4a.objects.collections.List();
_debuglines = __ref._traceserviceref /*b4j.example.traceservice*/ ._getrecentdebuglist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._debugcontextlines /*int*/ );
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="If debugLines.IsInitialized = False Or debugLines";
if (_debuglines.IsInitialized()==__c.False || _debuglines.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=56754179;
 //BA.debugLineNum = 56754179;BA.debugLine="WriteTraceEntry(\"DEBUG\", \"debug\", title, \"\")";
__ref._writetraceentry /*String*/ (null,"DEBUG","debug",_title,"");
RDebugUtils.currentLine=56754180;
 //BA.debugLineNum = 56754180;BA.debugLine="For Each debugLine As String In debugLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _debuglines;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_debugline = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=56754181;
 //BA.debugLineNum = 56754181;BA.debugLine="traceServiceRef.Trace(\"DEBUG \" & TrimDebugContex";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,"DEBUG "+__ref._trimdebugcontextline /*String*/ (null,_debugline));
 }
};
RDebugUtils.currentLine=56754183;
 //BA.debugLineNum = 56754183;BA.debugLine="End Sub";
return "";
}
public String  _writetraceentry(b4j.example.playbacktracerouter __ref,String _level,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "writetraceentry", false))
	 {return ((String) Debug.delegate(ba, "writetraceentry", new Object[] {_level,_category,_message,_details}));}
String _line = "";
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="Dim line As String = level & \" \" & formatterRef.B";
_line = _level+" "+__ref._formatterref /*b4j.example.playbacktraceformatter*/ ._buildhumantracemessage /*String*/ (null,_category,_message,_details.trim());
RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="traceServiceRef.Trace(line)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,_line);
RDebugUtils.currentLine=56885251;
 //BA.debugLineNum = 56885251;BA.debugLine="End Sub";
return "";
}
public String  _trimdebugcontextline(b4j.example.playbacktracerouter __ref,String _debugline) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "trimdebugcontextline", false))
	 {return ((String) Debug.delegate(ba, "trimdebugcontextline", new Object[] {_debugline}));}
String _marker = "";
int _markerindex = 0;
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Private Sub TrimDebugContextLine(debugLine As Stri";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="If debugLine = \"\" Then Return \"\"";
if ((_debugline).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="Dim marker As String = \" DEBUG \"";
_marker = " DEBUG ";
RDebugUtils.currentLine=56819715;
 //BA.debugLineNum = 56819715;BA.debugLine="Dim markerIndex As Int = debugLine.IndexOf(marker";
_markerindex = _debugline.indexOf(_marker);
RDebugUtils.currentLine=56819716;
 //BA.debugLineNum = 56819716;BA.debugLine="If markerIndex < 0 Then Return debugLine";
if (_markerindex<0) { 
if (true) return _debugline;};
RDebugUtils.currentLine=56819717;
 //BA.debugLineNum = 56819717;BA.debugLine="Return debugLine.SubString(markerIndex + marker.L";
if (true) return _debugline.substring((int) (_markerindex+_marker.length())).trim();
RDebugUtils.currentLine=56819718;
 //BA.debugLineNum = 56819718;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktracerouter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
RDebugUtils.currentLine=56164352;
 //BA.debugLineNum = 56164352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4j.example.traceservice();
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="Private formatterRef As PlaybackTraceFormatter";
_formatterref = new b4j.example.playbacktraceformatter();
RDebugUtils.currentLine=56164355;
 //BA.debugLineNum = 56164355;BA.debugLine="Private releaseBuild As Boolean";
_releasebuild = false;
RDebugUtils.currentLine=56164356;
 //BA.debugLineNum = 56164356;BA.debugLine="Private debugContextLines As Int";
_debugcontextlines = 0;
RDebugUtils.currentLine=56164357;
 //BA.debugLineNum = 56164357;BA.debugLine="End Sub";
return "";
}
public boolean  _handlediagnostictracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "handlediagnostictracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "handlediagnostictracemessage", new Object[] {_message}));}
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="If message = \"\" Then Return True";
if ((_message).equals("")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="If ShouldSuppressTraceMessage(message) Then";
if (__ref._shouldsuppresstracemessage /*boolean*/ (null,_message)) { 
RDebugUtils.currentLine=56950787;
 //BA.debugLineNum = 56950787;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56950788;
 //BA.debugLineNum = 56950788;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950790;
 //BA.debugLineNum = 56950790;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
if (_message.startsWith("Трек сохранен в кэш.")) { 
RDebugUtils.currentLine=56950791;
 //BA.debugLineNum = 56950791;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
__ref._traceinfo /*String*/ (null,"cache","трек загружен в кэш",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Трек сохранен в кэш.")));
RDebugUtils.currentLine=56950792;
 //BA.debugLineNum = 56950792;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950794;
 //BA.debugLineNum = 56950794;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
if (_message.startsWith("Не удалось скачать трек.") || _message.startsWith("Не удалось сохранить трек в кэш.")) { 
RDebugUtils.currentLine=56950795;
 //BA.debugLineNum = 56950795;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
__ref._traceerror /*String*/ (null,"cache","ошибка загрузки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=56950796;
 //BA.debugLineNum = 56950796;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950798;
 //BA.debugLineNum = 56950798;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
if (_message.startsWith("Синхронизация кэша треков завершена.")) { 
RDebugUtils.currentLine=56950799;
 //BA.debugLineNum = 56950799;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
__ref._traceinfo /*String*/ (null,"cache","кэш треков обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Синхронизация кэша треков завершена.")));
RDebugUtils.currentLine=56950800;
 //BA.debugLineNum = 56950800;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950802;
 //BA.debugLineNum = 56950802;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
if (_message.startsWith("ad cache sync done")) { 
RDebugUtils.currentLine=56950803;
 //BA.debugLineNum = 56950803;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
__ref._traceinfo /*String*/ (null,"cache","кэш рекламы обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"ad cache sync done")));
RDebugUtils.currentLine=56950804;
 //BA.debugLineNum = 56950804;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950806;
 //BA.debugLineNum = 56950806;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
if (_message.startsWith("Аудит кэша завершен.")) { 
RDebugUtils.currentLine=56950807;
 //BA.debugLineNum = 56950807;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
__ref._traceinfo /*String*/ (null,"cache","аудит кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Аудит кэша завершен.")));
RDebugUtils.currentLine=56950808;
 //BA.debugLineNum = 56950808;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950810;
 //BA.debugLineNum = 56950810;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
if (_message.startsWith("Очистка кэша треков завершена.")) { 
RDebugUtils.currentLine=56950811;
 //BA.debugLineNum = 56950811;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Очистка кэша треков завершена.")));
RDebugUtils.currentLine=56950812;
 //BA.debugLineNum = 56950812;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950814;
 //BA.debugLineNum = 56950814;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
if (_message.startsWith("кэш треков очистка итог")) { 
RDebugUtils.currentLine=56950815;
 //BA.debugLineNum = 56950815;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"кэш треков очистка итог")));
RDebugUtils.currentLine=56950816;
 //BA.debugLineNum = 56950816;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950818;
 //BA.debugLineNum = 56950818;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
if (_message.startsWith("Удален cached ad, отсутствующий в актуальном data.")) { 
RDebugUtils.currentLine=56950819;
 //BA.debugLineNum = 56950819;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
__ref._traceinfo /*String*/ (null,"cache","реклама удалена из кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Удален cached ad, отсутствующий в актуальном data.")));
RDebugUtils.currentLine=56950820;
 //BA.debugLineNum = 56950820;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950822;
 //BA.debugLineNum = 56950822;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
if (_message.startsWith("подготовка data playback ошибка")) { 
RDebugUtils.currentLine=56950823;
 //BA.debugLineNum = 56950823;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста","");
RDebugUtils.currentLine=56950824;
 //BA.debugLineNum = 56950824;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950826;
 //BA.debugLineNum = 56950826;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
if (_message.startsWith("очередь запрос ошибка")) { 
RDebugUtils.currentLine=56950827;
 //BA.debugLineNum = 56950827;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь запрос ошибка")));
RDebugUtils.currentLine=56950828;
 //BA.debugLineNum = 56950828;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950830;
 //BA.debugLineNum = 56950830;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
if (_message.startsWith("очередь next ошибка")) { 
RDebugUtils.currentLine=56950831;
 //BA.debugLineNum = 56950831;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь next ошибка")));
RDebugUtils.currentLine=56950832;
 //BA.debugLineNum = 56950832;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950834;
 //BA.debugLineNum = 56950834;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
if (_message.startsWith("очередь fetch ошибка")) { 
RDebugUtils.currentLine=56950835;
 //BA.debugLineNum = 56950835;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
__ref._tracewarn /*String*/ (null,"network","ошибка очереди",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь fetch ошибка")));
RDebugUtils.currentLine=56950836;
 //BA.debugLineNum = 56950836;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950838;
 //BA.debugLineNum = 56950838;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
if (_message.startsWith("состояние blocked")) { 
RDebugUtils.currentLine=56950839;
 //BA.debugLineNum = 56950839;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
__ref._tracewarn /*String*/ (null,"player","плеер заблокирован","");
RDebugUtils.currentLine=56950840;
 //BA.debugLineNum = 56950840;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950842;
 //BA.debugLineNum = 56950842;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
if (_message.startsWith("состояние stop") || _message.startsWith("message shutdown")) { 
RDebugUtils.currentLine=56950843;
 //BA.debugLineNum = 56950843;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
__ref._tracewarn /*String*/ (null,"player","воспроизведение остановлено",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=56950844;
 //BA.debugLineNum = 56950844;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950846;
 //BA.debugLineNum = 56950846;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
if (_message.startsWith("fallback activate")) { 
RDebugUtils.currentLine=56950847;
 //BA.debugLineNum = 56950847;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
__ref._tracewarn /*String*/ (null,"playback","включен локальный fallback",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"fallback activate")));
RDebugUtils.currentLine=56950848;
 //BA.debugLineNum = 56950848;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950850;
 //BA.debugLineNum = 56950850;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
if (_message.startsWith("degraded path вход")) { 
RDebugUtils.currentLine=56950851;
 //BA.debugLineNum = 56950851;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
__ref._tracewarn /*String*/ (null,"network","деградация media path","");
RDebugUtils.currentLine=56950852;
 //BA.debugLineNum = 56950852;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950854;
 //BA.debugLineNum = 56950854;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
if (_message.startsWith("degraded path восстановлен")) { 
RDebugUtils.currentLine=56950855;
 //BA.debugLineNum = 56950855;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
__ref._traceinfo /*String*/ (null,"network","media path восстановлен","");
RDebugUtils.currentLine=56950856;
 //BA.debugLineNum = 56950856;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950858;
 //BA.debugLineNum = 56950858;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
if (_message.startsWith("история чтение ошибка") || _message.startsWith("история response parse ошибка")) { 
RDebugUtils.currentLine=56950859;
 //BA.debugLineNum = 56950859;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
__ref._tracewarn /*String*/ (null,"history","ошибка истории","");
RDebugUtils.currentLine=56950860;
 //BA.debugLineNum = 56950860;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950862;
 //BA.debugLineNum = 56950862;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
if (_message.startsWith("метаданные плейлистов sync итог")) { 
RDebugUtils.currentLine=56950863;
 //BA.debugLineNum = 56950863;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
__ref._traceinfo /*String*/ (null,"network","метаданные плейлистов обновлены",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлистов sync итог")));
RDebugUtils.currentLine=56950864;
 //BA.debugLineNum = 56950864;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950866;
 //BA.debugLineNum = 56950866;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
if (_message.startsWith("метаданные плейлиста fetch ошибка")) { 
RDebugUtils.currentLine=56950867;
 //BA.debugLineNum = 56950867;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
__ref._tracewarn /*String*/ (null,"network","ошибка метаданных плейлиста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлиста fetch ошибка")));
RDebugUtils.currentLine=56950868;
 //BA.debugLineNum = 56950868;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950870;
 //BA.debugLineNum = 56950870;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
if (_message.startsWith("Не удалось подготовить временный файл трека.")) { 
RDebugUtils.currentLine=56950871;
 //BA.debugLineNum = 56950871;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
__ref._traceerror /*String*/ (null,"cache","ошибка подготовки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Не удалось подготовить временный файл трека.")));
RDebugUtils.currentLine=56950872;
 //BA.debugLineNum = 56950872;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=56950874;
 //BA.debugLineNum = 56950874;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56950875;
 //BA.debugLineNum = 56950875;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=56950876;
 //BA.debugLineNum = 56950876;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldsuppresstracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "shouldsuppresstracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldsuppresstracemessage", new Object[] {_message}));}
anywheresoftware.b4a.objects.collections.List _noisyprefixes = null;
String _prefix = "";
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
if (_message.startsWith("guard переход") || _message.startsWith("переход dispatch")) { 
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="If releaseBuild Then";
if (__ref._releasebuild /*boolean*/ ) { 
RDebugUtils.currentLine=57016323;
 //BA.debugLineNum = 57016323;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=57016325;
 //BA.debugLineNum = 57016325;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=57016328;
 //BA.debugLineNum = 57016328;BA.debugLine="Dim noisyPrefixes As List";
_noisyprefixes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57016329;
 //BA.debugLineNum = 57016329;BA.debugLine="noisyPrefixes.Initialize";
_noisyprefixes.Initialize();
RDebugUtils.currentLine=57016330;
 //BA.debugLineNum = 57016330;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
_noisyprefixes.Add((Object)("курсор плейлистов load"));
RDebugUtils.currentLine=57016331;
 //BA.debugLineNum = 57016331;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
_noisyprefixes.Add((Object)("состояние init"));
RDebugUtils.currentLine=57016332;
 //BA.debugLineNum = 57016332;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
_noisyprefixes.Add((Object)("старт skip"));
RDebugUtils.currentLine=57016333;
 //BA.debugLineNum = 57016333;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
_noisyprefixes.Add((Object)("старт вход"));
RDebugUtils.currentLine=57016334;
 //BA.debugLineNum = 57016334;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
_noisyprefixes.Add((Object)("отложенный старт"));
RDebugUtils.currentLine=57016335;
 //BA.debugLineNum = 57016335;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
_noisyprefixes.Add((Object)("сценарий "));
RDebugUtils.currentLine=57016336;
 //BA.debugLineNum = 57016336;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
_noisyprefixes.Add((Object)("flow переход"));
RDebugUtils.currentLine=57016337;
 //BA.debugLineNum = 57016337;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
_noisyprefixes.Add((Object)("guard переход"));
RDebugUtils.currentLine=57016338;
 //BA.debugLineNum = 57016338;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
_noisyprefixes.Add((Object)("guard подготовка"));
RDebugUtils.currentLine=57016339;
 //BA.debugLineNum = 57016339;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
_noisyprefixes.Add((Object)("guard prefetch"));
RDebugUtils.currentLine=57016340;
 //BA.debugLineNum = 57016340;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
_noisyprefixes.Add((Object)("guard fade"));
RDebugUtils.currentLine=57016341;
 //BA.debugLineNum = 57016341;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
_noisyprefixes.Add((Object)("переход dispatch"));
RDebugUtils.currentLine=57016342;
 //BA.debugLineNum = 57016342;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
_noisyprefixes.Add((Object)("воспроизведение activate"));
RDebugUtils.currentLine=57016343;
 //BA.debugLineNum = 57016343;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
_noisyprefixes.Add((Object)("очередь добор"));
RDebugUtils.currentLine=57016344;
 //BA.debugLineNum = 57016344;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=57016345;
 //BA.debugLineNum = 57016345;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=57016346;
 //BA.debugLineNum = 57016346;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=57016347;
 //BA.debugLineNum = 57016347;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
_noisyprefixes.Add((Object)("автостарт сначала обновление данных"));
RDebugUtils.currentLine=57016348;
 //BA.debugLineNum = 57016348;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
_noisyprefixes.Add((Object)("policy resume авто"));
RDebugUtils.currentLine=57016349;
 //BA.debugLineNum = 57016349;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
_noisyprefixes.Add((Object)("возобновление запрет"));
RDebugUtils.currentLine=57016350;
 //BA.debugLineNum = 57016350;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
_noisyprefixes.Add((Object)("возобновление итог"));
RDebugUtils.currentLine=57016351;
 //BA.debugLineNum = 57016351;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
_noisyprefixes.Add((Object)("снимок очереди восстановление skip"));
RDebugUtils.currentLine=57016352;
 //BA.debugLineNum = 57016352;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
_noisyprefixes.Add((Object)("http get начало"));
RDebugUtils.currentLine=57016353;
 //BA.debugLineNum = 57016353;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
_noisyprefixes.Add((Object)("http get итог"));
RDebugUtils.currentLine=57016354;
 //BA.debugLineNum = 57016354;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
_noisyprefixes.Add((Object)("claim начало"));
RDebugUtils.currentLine=57016355;
 //BA.debugLineNum = 57016355;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
_noisyprefixes.Add((Object)("claim итог"));
RDebugUtils.currentLine=57016356;
 //BA.debugLineNum = 57016356;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
_noisyprefixes.Add((Object)("элемент очереди play"));
RDebugUtils.currentLine=57016357;
 //BA.debugLineNum = 57016357;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
_noisyprefixes.Add((Object)("курсор плейлистов commit"));
RDebugUtils.currentLine=57016358;
 //BA.debugLineNum = 57016358;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
_noisyprefixes.Add((Object)("реклама prescan начало"));
RDebugUtils.currentLine=57016359;
 //BA.debugLineNum = 57016359;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
_noisyprefixes.Add((Object)("брейк exact defer"));
RDebugUtils.currentLine=57016360;
 //BA.debugLineNum = 57016360;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
_noisyprefixes.Add((Object)("брейк exact sync"));
RDebugUtils.currentLine=57016361;
 //BA.debugLineNum = 57016361;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
_noisyprefixes.Add((Object)("fade начало"));
RDebugUtils.currentLine=57016362;
 //BA.debugLineNum = 57016362;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
_noisyprefixes.Add((Object)("история confirm"));
RDebugUtils.currentLine=57016363;
 //BA.debugLineNum = 57016363;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
_noisyprefixes.Add((Object)("история stage"));
RDebugUtils.currentLine=57016364;
 //BA.debugLineNum = 57016364;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
_noisyprefixes.Add((Object)("история буфер add"));
RDebugUtils.currentLine=57016365;
 //BA.debugLineNum = 57016365;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
_noisyprefixes.Add((Object)("история отправка начало"));
RDebugUtils.currentLine=57016366;
 //BA.debugLineNum = 57016366;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
_noisyprefixes.Add((Object)("история отправка payload"));
RDebugUtils.currentLine=57016367;
 //BA.debugLineNum = 57016367;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
_noisyprefixes.Add((Object)("история отправка ack"));
RDebugUtils.currentLine=57016368;
 //BA.debugLineNum = 57016368;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
_noisyprefixes.Add((Object)("stop запрос"));
RDebugUtils.currentLine=57016369;
 //BA.debugLineNum = 57016369;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
_noisyprefixes.Add((Object)("резерв очереди save"));
RDebugUtils.currentLine=57016370;
 //BA.debugLineNum = 57016370;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
_noisyprefixes.Add((Object)("снимок очереди clear"));
RDebugUtils.currentLine=57016371;
 //BA.debugLineNum = 57016371;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
_noisyprefixes.Add((Object)("состояние воспроизведения clear"));
RDebugUtils.currentLine=57016372;
 //BA.debugLineNum = 57016372;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
_noisyprefixes.Add((Object)("аудио ready"));
RDebugUtils.currentLine=57016373;
 //BA.debugLineNum = 57016373;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
_noisyprefixes.Add((Object)("аудио complete"));
RDebugUtils.currentLine=57016374;
 //BA.debugLineNum = 57016374;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
_noisyprefixes.Add((Object)("переход overlap начало"));
RDebugUtils.currentLine=57016375;
 //BA.debugLineNum = 57016375;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
_noisyprefixes.Add((Object)("переход tail начало"));
RDebugUtils.currentLine=57016376;
 //BA.debugLineNum = 57016376;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
_noisyprefixes.Add((Object)("переход prefetch начало"));
RDebugUtils.currentLine=57016377;
 //BA.debugLineNum = 57016377;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
_noisyprefixes.Add((Object)("trusted time update"));
RDebugUtils.currentLine=57016378;
 //BA.debugLineNum = 57016378;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
_noisyprefixes.Add((Object)("player end parse fail"));
RDebugUtils.currentLine=57016379;
 //BA.debugLineNum = 57016379;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
_noisyprefixes.Add((Object)("[AudioPrimary]"));
RDebugUtils.currentLine=57016380;
 //BA.debugLineNum = 57016380;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
_noisyprefixes.Add((Object)("[AudioSecondary]"));
RDebugUtils.currentLine=57016381;
 //BA.debugLineNum = 57016381;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
_noisyprefixes.Add((Object)("machine guid"));
RDebugUtils.currentLine=57016382;
 //BA.debugLineNum = 57016382;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
_noisyprefixes.Add((Object)("legacy migrate итог"));
RDebugUtils.currentLine=57016383;
 //BA.debugLineNum = 57016383;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
_noisyprefixes.Add((Object)("метаданные плейлистов sync skip"));
RDebugUtils.currentLine=57016384;
 //BA.debugLineNum = 57016384;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
_noisyprefixes.Add((Object)("метаданные плейлиста fetch начало"));
RDebugUtils.currentLine=57016385;
 //BA.debugLineNum = 57016385;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
_noisyprefixes.Add((Object)("окно save"));
RDebugUtils.currentLine=57016386;
 //BA.debugLineNum = 57016386;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
_noisyprefixes.Add((Object)("окно restore"));
RDebugUtils.currentLine=57016387;
 //BA.debugLineNum = 57016387;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
_noisyprefixes.Add((Object)("trace отправка"));
RDebugUtils.currentLine=57016388;
 //BA.debugLineNum = 57016388;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
_noisyprefixes.Add((Object)("скачивание рекламы в кэш"));
RDebugUtils.currentLine=57016389;
 //BA.debugLineNum = 57016389;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
_noisyprefixes.Add((Object)("скачивание трека в кэш"));
RDebugUtils.currentLine=57016390;
 //BA.debugLineNum = 57016390;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
_noisyprefixes.Add((Object)("удален cached track при очистке кэша"));
RDebugUtils.currentLine=57016391;
 //BA.debugLineNum = 57016391;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
_noisyprefixes.Add((Object)("очистка кэша треков пропущена"));
RDebugUtils.currentLine=57016392;
 //BA.debugLineNum = 57016392;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=57016393;
 //BA.debugLineNum = 57016393;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=57016394;
 //BA.debugLineNum = 57016394;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=57016395;
 //BA.debugLineNum = 57016395;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
_noisyprefixes.Add((Object)("переход очередь drop"));
RDebugUtils.currentLine=57016396;
 //BA.debugLineNum = 57016396;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
_noisyprefixes.Add((Object)("переход preload ошибка"));
RDebugUtils.currentLine=57016397;
 //BA.debugLineNum = 57016397;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
_noisyprefixes.Add((Object)("переход prepared reject"));
RDebugUtils.currentLine=57016398;
 //BA.debugLineNum = 57016398;BA.debugLine="For Each prefix As String In noisyPrefixes";
{
final anywheresoftware.b4a.BA.IterableList group78 = _noisyprefixes;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=57016399;
 //BA.debugLineNum = 57016399;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
if (_message.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).startsWith(_prefix.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=57016401;
 //BA.debugLineNum = 57016401;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=57016402;
 //BA.debugLineNum = 57016402;BA.debugLine="End Sub";
return false;
}
public String  _tracedebug(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Private Sub TraceDebug(message As String)";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="traceServiceRef.TraceDebug(message)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="End Sub";
return "";
}
public String  _normalizelegacydetails(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "normalizelegacydetails", false))
	 {return ((String) Debug.delegate(ba, "normalizelegacydetails", new Object[] {_text}));}
String _value = "";
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="Dim value As String = text.Trim";
_value = _text.trim();
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
if (_value.startsWith(".") || _value.startsWith(":")) { 
_value = _value.substring((int) (1)).trim();};
RDebugUtils.currentLine=57081859;
 //BA.debugLineNum = 57081859;BA.debugLine="value = value.Replace(\",\", \"\")";
_value = _value.replace(",","");
RDebugUtils.currentLine=57081860;
 //BA.debugLineNum = 57081860;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=57081861;
 //BA.debugLineNum = 57081861;BA.debugLine="End Sub";
return "";
}
public String  _tailafter(b4j.example.playbacktracerouter __ref,String _text,String _prefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafter", false))
	 {return ((String) Debug.delegate(ba, "tailafter", new Object[] {_text,_prefix}));}
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
if (_text.startsWith(_prefix)==__c.False) { 
if (true) return _text;};
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="Return text.SubString(prefix.Length).Trim";
if (true) return _text.substring(_prefix.length()).trim();
RDebugUtils.currentLine=57147395;
 //BA.debugLineNum = 57147395;BA.debugLine="End Sub";
return "";
}
public String  _tailafterfirstspace(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafterfirstspace", false))
	 {return ((String) Debug.delegate(ba, "tailafterfirstspace", new Object[] {_text}));}
int _firstspace = 0;
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
_firstspace = _text.indexOf(" ");
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="If firstSpace < 0 Then Return \"\"";
if (_firstspace<0) { 
if (true) return "";};
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
if (true) return _text.substring((int) (_firstspace+1)).trim();
RDebugUtils.currentLine=57212932;
 //BA.debugLineNum = 57212932;BA.debugLine="End Sub";
return "";
}
}