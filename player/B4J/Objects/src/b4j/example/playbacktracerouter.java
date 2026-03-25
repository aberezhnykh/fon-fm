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
RDebugUtils.currentLine=54198272;
 //BA.debugLineNum = 54198272;BA.debugLine="Public Sub Initialize(traceSvc As TraceService, fo";
RDebugUtils.currentLine=54198273;
 //BA.debugLineNum = 54198273;BA.debugLine="traceServiceRef = traceSvc";
__ref._traceserviceref /*b4j.example.traceservice*/  = _tracesvc;
RDebugUtils.currentLine=54198274;
 //BA.debugLineNum = 54198274;BA.debugLine="formatterRef = formatterValue";
__ref._formatterref /*b4j.example.playbacktraceformatter*/  = _formattervalue;
RDebugUtils.currentLine=54198275;
 //BA.debugLineNum = 54198275;BA.debugLine="releaseBuild = isReleaseBuild";
__ref._releasebuild /*boolean*/  = _isreleasebuild;
RDebugUtils.currentLine=54198276;
 //BA.debugLineNum = 54198276;BA.debugLine="debugContextLines = debugContextLineCount";
__ref._debugcontextlines /*int*/  = _debugcontextlinecount;
RDebugUtils.currentLine=54198277;
 //BA.debugLineNum = 54198277;BA.debugLine="End Sub";
return "";
}
public String  _tracedebugmessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebugmessage", false))
	 {return ((String) Debug.delegate(ba, "tracedebugmessage", new Object[] {_message}));}
RDebugUtils.currentLine=54591488;
 //BA.debugLineNum = 54591488;BA.debugLine="Public Sub TraceDebugMessage(message As String)";
RDebugUtils.currentLine=54591489;
 //BA.debugLineNum = 54591489;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=54591490;
 //BA.debugLineNum = 54591490;BA.debugLine="End Sub";
return "";
}
public String  _traceerror(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceerror", false))
	 {return ((String) Debug.delegate(ba, "traceerror", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=54460416;
 //BA.debugLineNum = 54460416;BA.debugLine="Public Sub TraceError(category As String, message";
RDebugUtils.currentLine=54460417;
 //BA.debugLineNum = 54460417;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"ERROR",_category,_message,_details);
RDebugUtils.currentLine=54460418;
 //BA.debugLineNum = 54460418;BA.debugLine="AppendRecentDebugContext(\"Контекст ошибки\")";
__ref._appendrecentdebugcontext /*String*/ (null,"Контекст ошибки");
RDebugUtils.currentLine=54460419;
 //BA.debugLineNum = 54460419;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=54329344;
 //BA.debugLineNum = 54329344;BA.debugLine="Public Sub TraceInfo(category As String, message A";
RDebugUtils.currentLine=54329345;
 //BA.debugLineNum = 54329345;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"INFO",_category,_message,_details);
RDebugUtils.currentLine=54329346;
 //BA.debugLineNum = 54329346;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=54263808;
 //BA.debugLineNum = 54263808;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=54263809;
 //BA.debugLineNum = 54263809;BA.debugLine="If message = \"\" Then Return";
if ((_message).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=54263810;
 //BA.debugLineNum = 54263810;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
if (__ref._handlediagnostictracemessage /*boolean*/ (null,_message)) { 
if (true) return "";};
RDebugUtils.currentLine=54263811;
 //BA.debugLineNum = 54263811;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=54263812;
 //BA.debugLineNum = 54263812;BA.debugLine="End Sub";
return "";
}
public String  _tracestate(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracestate", false))
	 {return ((String) Debug.delegate(ba, "tracestate", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=54525952;
 //BA.debugLineNum = 54525952;BA.debugLine="Public Sub TraceState(category As String, message";
RDebugUtils.currentLine=54525953;
 //BA.debugLineNum = 54525953;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"STATE",_category,_message,_details);
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(b4j.example.playbacktracerouter __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=54394880;
 //BA.debugLineNum = 54394880;BA.debugLine="Public Sub TraceWarn(category As String, message A";
RDebugUtils.currentLine=54394881;
 //BA.debugLineNum = 54394881;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"WARN",_category,_message,_details);
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="End Sub";
return "";
}
public String  _appendrecentdebugcontext(b4j.example.playbacktracerouter __ref,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "appendrecentdebugcontext", false))
	 {return ((String) Debug.delegate(ba, "appendrecentdebugcontext", new Object[] {_title}));}
anywheresoftware.b4a.objects.collections.List _debuglines = null;
String _debugline = "";
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="Private Sub AppendRecentDebugContext(title As Stri";
RDebugUtils.currentLine=54722561;
 //BA.debugLineNum = 54722561;BA.debugLine="Dim debugLines As List = traceServiceRef.GetRecen";
_debuglines = new anywheresoftware.b4a.objects.collections.List();
_debuglines = __ref._traceserviceref /*b4j.example.traceservice*/ ._getrecentdebuglist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._debugcontextlines /*int*/ );
RDebugUtils.currentLine=54722562;
 //BA.debugLineNum = 54722562;BA.debugLine="If debugLines.IsInitialized = False Or debugLines";
if (_debuglines.IsInitialized()==__c.False || _debuglines.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=54722563;
 //BA.debugLineNum = 54722563;BA.debugLine="WriteTraceEntry(\"DEBUG\", \"debug\", title, \"\")";
__ref._writetraceentry /*String*/ (null,"DEBUG","debug",_title,"");
RDebugUtils.currentLine=54722564;
 //BA.debugLineNum = 54722564;BA.debugLine="For Each debugLine As String In debugLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _debuglines;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_debugline = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=54722565;
 //BA.debugLineNum = 54722565;BA.debugLine="traceServiceRef.Trace(\"DEBUG \" & TrimDebugContex";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,"DEBUG "+__ref._trimdebugcontextline /*String*/ (null,_debugline));
 }
};
RDebugUtils.currentLine=54722567;
 //BA.debugLineNum = 54722567;BA.debugLine="End Sub";
return "";
}
public String  _writetraceentry(b4j.example.playbacktracerouter __ref,String _level,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "writetraceentry", false))
	 {return ((String) Debug.delegate(ba, "writetraceentry", new Object[] {_level,_category,_message,_details}));}
String _line = "";
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
RDebugUtils.currentLine=54853633;
 //BA.debugLineNum = 54853633;BA.debugLine="Dim line As String = level & \" \" & formatterRef.B";
_line = _level+" "+__ref._formatterref /*b4j.example.playbacktraceformatter*/ ._buildhumantracemessage /*String*/ (null,_category,_message,_details.trim());
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="traceServiceRef.Trace(line)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._trace /*String*/ (null,_line);
RDebugUtils.currentLine=54853635;
 //BA.debugLineNum = 54853635;BA.debugLine="End Sub";
return "";
}
public String  _trimdebugcontextline(b4j.example.playbacktracerouter __ref,String _debugline) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "trimdebugcontextline", false))
	 {return ((String) Debug.delegate(ba, "trimdebugcontextline", new Object[] {_debugline}));}
String _marker = "";
int _markerindex = 0;
RDebugUtils.currentLine=54788096;
 //BA.debugLineNum = 54788096;BA.debugLine="Private Sub TrimDebugContextLine(debugLine As Stri";
RDebugUtils.currentLine=54788097;
 //BA.debugLineNum = 54788097;BA.debugLine="If debugLine = \"\" Then Return \"\"";
if ((_debugline).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=54788098;
 //BA.debugLineNum = 54788098;BA.debugLine="Dim marker As String = \" DEBUG \"";
_marker = " DEBUG ";
RDebugUtils.currentLine=54788099;
 //BA.debugLineNum = 54788099;BA.debugLine="Dim markerIndex As Int = debugLine.IndexOf(marker";
_markerindex = _debugline.indexOf(_marker);
RDebugUtils.currentLine=54788100;
 //BA.debugLineNum = 54788100;BA.debugLine="If markerIndex < 0 Then Return debugLine";
if (_markerindex<0) { 
if (true) return _debugline;};
RDebugUtils.currentLine=54788101;
 //BA.debugLineNum = 54788101;BA.debugLine="Return debugLine.SubString(markerIndex + marker.L";
if (true) return _debugline.substring((int) (_markerindex+_marker.length())).trim();
RDebugUtils.currentLine=54788102;
 //BA.debugLineNum = 54788102;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.playbacktracerouter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
RDebugUtils.currentLine=54132736;
 //BA.debugLineNum = 54132736;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=54132737;
 //BA.debugLineNum = 54132737;BA.debugLine="Private traceServiceRef As TraceService";
_traceserviceref = new b4j.example.traceservice();
RDebugUtils.currentLine=54132738;
 //BA.debugLineNum = 54132738;BA.debugLine="Private formatterRef As PlaybackTraceFormatter";
_formatterref = new b4j.example.playbacktraceformatter();
RDebugUtils.currentLine=54132739;
 //BA.debugLineNum = 54132739;BA.debugLine="Private releaseBuild As Boolean";
_releasebuild = false;
RDebugUtils.currentLine=54132740;
 //BA.debugLineNum = 54132740;BA.debugLine="Private debugContextLines As Int";
_debugcontextlines = 0;
RDebugUtils.currentLine=54132741;
 //BA.debugLineNum = 54132741;BA.debugLine="End Sub";
return "";
}
public boolean  _handlediagnostictracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "handlediagnostictracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "handlediagnostictracemessage", new Object[] {_message}));}
RDebugUtils.currentLine=54919168;
 //BA.debugLineNum = 54919168;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="If message = \"\" Then Return True";
if ((_message).equals("")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=54919170;
 //BA.debugLineNum = 54919170;BA.debugLine="If ShouldSuppressTraceMessage(message) Then";
if (__ref._shouldsuppresstracemessage /*boolean*/ (null,_message)) { 
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=54919172;
 //BA.debugLineNum = 54919172;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919174;
 //BA.debugLineNum = 54919174;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
if (_message.startsWith("Трек сохранен в кэш.")) { 
RDebugUtils.currentLine=54919175;
 //BA.debugLineNum = 54919175;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
__ref._traceinfo /*String*/ (null,"cache","трек загружен в кэш",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Трек сохранен в кэш.")));
RDebugUtils.currentLine=54919176;
 //BA.debugLineNum = 54919176;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919178;
 //BA.debugLineNum = 54919178;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
if (_message.startsWith("Не удалось скачать трек.") || _message.startsWith("Не удалось сохранить трек в кэш.")) { 
RDebugUtils.currentLine=54919179;
 //BA.debugLineNum = 54919179;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
__ref._traceerror /*String*/ (null,"cache","ошибка загрузки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=54919180;
 //BA.debugLineNum = 54919180;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919182;
 //BA.debugLineNum = 54919182;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
if (_message.startsWith("Синхронизация кэша треков завершена.")) { 
RDebugUtils.currentLine=54919183;
 //BA.debugLineNum = 54919183;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
__ref._traceinfo /*String*/ (null,"cache","кэш треков обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Синхронизация кэша треков завершена.")));
RDebugUtils.currentLine=54919184;
 //BA.debugLineNum = 54919184;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919186;
 //BA.debugLineNum = 54919186;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
if (_message.startsWith("ad cache sync done")) { 
RDebugUtils.currentLine=54919187;
 //BA.debugLineNum = 54919187;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
__ref._traceinfo /*String*/ (null,"cache","кэш рекламы обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"ad cache sync done")));
RDebugUtils.currentLine=54919188;
 //BA.debugLineNum = 54919188;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919190;
 //BA.debugLineNum = 54919190;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
if (_message.startsWith("Аудит кэша завершен.")) { 
RDebugUtils.currentLine=54919191;
 //BA.debugLineNum = 54919191;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
__ref._traceinfo /*String*/ (null,"cache","аудит кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Аудит кэша завершен.")));
RDebugUtils.currentLine=54919192;
 //BA.debugLineNum = 54919192;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919194;
 //BA.debugLineNum = 54919194;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
if (_message.startsWith("Очистка кэша треков завершена.")) { 
RDebugUtils.currentLine=54919195;
 //BA.debugLineNum = 54919195;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Очистка кэша треков завершена.")));
RDebugUtils.currentLine=54919196;
 //BA.debugLineNum = 54919196;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919198;
 //BA.debugLineNum = 54919198;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
if (_message.startsWith("кэш треков очистка итог")) { 
RDebugUtils.currentLine=54919199;
 //BA.debugLineNum = 54919199;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"кэш треков очистка итог")));
RDebugUtils.currentLine=54919200;
 //BA.debugLineNum = 54919200;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919202;
 //BA.debugLineNum = 54919202;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
if (_message.startsWith("Удален cached ad, отсутствующий в актуальном data.")) { 
RDebugUtils.currentLine=54919203;
 //BA.debugLineNum = 54919203;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
__ref._traceinfo /*String*/ (null,"cache","реклама удалена из кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Удален cached ad, отсутствующий в актуальном data.")));
RDebugUtils.currentLine=54919204;
 //BA.debugLineNum = 54919204;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919206;
 //BA.debugLineNum = 54919206;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
if (_message.startsWith("подготовка data playback ошибка")) { 
RDebugUtils.currentLine=54919207;
 //BA.debugLineNum = 54919207;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста","");
RDebugUtils.currentLine=54919208;
 //BA.debugLineNum = 54919208;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919210;
 //BA.debugLineNum = 54919210;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
if (_message.startsWith("очередь запрос ошибка")) { 
RDebugUtils.currentLine=54919211;
 //BA.debugLineNum = 54919211;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь запрос ошибка")));
RDebugUtils.currentLine=54919212;
 //BA.debugLineNum = 54919212;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919214;
 //BA.debugLineNum = 54919214;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
if (_message.startsWith("очередь next ошибка")) { 
RDebugUtils.currentLine=54919215;
 //BA.debugLineNum = 54919215;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь next ошибка")));
RDebugUtils.currentLine=54919216;
 //BA.debugLineNum = 54919216;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919218;
 //BA.debugLineNum = 54919218;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
if (_message.startsWith("очередь fetch ошибка")) { 
RDebugUtils.currentLine=54919219;
 //BA.debugLineNum = 54919219;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
__ref._tracewarn /*String*/ (null,"network","ошибка очереди",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь fetch ошибка")));
RDebugUtils.currentLine=54919220;
 //BA.debugLineNum = 54919220;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919222;
 //BA.debugLineNum = 54919222;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
if (_message.startsWith("состояние blocked")) { 
RDebugUtils.currentLine=54919223;
 //BA.debugLineNum = 54919223;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
__ref._tracewarn /*String*/ (null,"player","плеер заблокирован","");
RDebugUtils.currentLine=54919224;
 //BA.debugLineNum = 54919224;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919226;
 //BA.debugLineNum = 54919226;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
if (_message.startsWith("состояние stop") || _message.startsWith("message shutdown")) { 
RDebugUtils.currentLine=54919227;
 //BA.debugLineNum = 54919227;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
__ref._tracewarn /*String*/ (null,"player","воспроизведение остановлено",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=54919228;
 //BA.debugLineNum = 54919228;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919230;
 //BA.debugLineNum = 54919230;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
if (_message.startsWith("fallback activate")) { 
RDebugUtils.currentLine=54919231;
 //BA.debugLineNum = 54919231;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
__ref._tracewarn /*String*/ (null,"playback","включен локальный fallback",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"fallback activate")));
RDebugUtils.currentLine=54919232;
 //BA.debugLineNum = 54919232;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919234;
 //BA.debugLineNum = 54919234;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
if (_message.startsWith("degraded path вход")) { 
RDebugUtils.currentLine=54919235;
 //BA.debugLineNum = 54919235;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
__ref._tracewarn /*String*/ (null,"network","деградация media path","");
RDebugUtils.currentLine=54919236;
 //BA.debugLineNum = 54919236;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919238;
 //BA.debugLineNum = 54919238;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
if (_message.startsWith("degraded path восстановлен")) { 
RDebugUtils.currentLine=54919239;
 //BA.debugLineNum = 54919239;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
__ref._traceinfo /*String*/ (null,"network","media path восстановлен","");
RDebugUtils.currentLine=54919240;
 //BA.debugLineNum = 54919240;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919242;
 //BA.debugLineNum = 54919242;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
if (_message.startsWith("история чтение ошибка") || _message.startsWith("история response parse ошибка")) { 
RDebugUtils.currentLine=54919243;
 //BA.debugLineNum = 54919243;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
__ref._tracewarn /*String*/ (null,"history","ошибка истории","");
RDebugUtils.currentLine=54919244;
 //BA.debugLineNum = 54919244;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919246;
 //BA.debugLineNum = 54919246;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
if (_message.startsWith("метаданные плейлистов sync итог")) { 
RDebugUtils.currentLine=54919247;
 //BA.debugLineNum = 54919247;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
__ref._traceinfo /*String*/ (null,"network","метаданные плейлистов обновлены",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлистов sync итог")));
RDebugUtils.currentLine=54919248;
 //BA.debugLineNum = 54919248;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919250;
 //BA.debugLineNum = 54919250;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
if (_message.startsWith("метаданные плейлиста fetch ошибка")) { 
RDebugUtils.currentLine=54919251;
 //BA.debugLineNum = 54919251;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
__ref._tracewarn /*String*/ (null,"network","ошибка метаданных плейлиста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлиста fetch ошибка")));
RDebugUtils.currentLine=54919252;
 //BA.debugLineNum = 54919252;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919254;
 //BA.debugLineNum = 54919254;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
if (_message.startsWith("Не удалось подготовить временный файл трека.")) { 
RDebugUtils.currentLine=54919255;
 //BA.debugLineNum = 54919255;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
__ref._traceerror /*String*/ (null,"cache","ошибка подготовки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Не удалось подготовить временный файл трека.")));
RDebugUtils.currentLine=54919256;
 //BA.debugLineNum = 54919256;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=54919258;
 //BA.debugLineNum = 54919258;BA.debugLine="TraceDebug(message)";
__ref._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=54919259;
 //BA.debugLineNum = 54919259;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=54919260;
 //BA.debugLineNum = 54919260;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldsuppresstracemessage(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "shouldsuppresstracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldsuppresstracemessage", new Object[] {_message}));}
anywheresoftware.b4a.objects.collections.List _noisyprefixes = null;
String _prefix = "";
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
RDebugUtils.currentLine=54984705;
 //BA.debugLineNum = 54984705;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
if (_message.startsWith("guard переход") || _message.startsWith("переход dispatch")) { 
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="If releaseBuild Then";
if (__ref._releasebuild /*boolean*/ ) { 
RDebugUtils.currentLine=54984707;
 //BA.debugLineNum = 54984707;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=54984709;
 //BA.debugLineNum = 54984709;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=54984712;
 //BA.debugLineNum = 54984712;BA.debugLine="Dim noisyPrefixes As List";
_noisyprefixes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=54984713;
 //BA.debugLineNum = 54984713;BA.debugLine="noisyPrefixes.Initialize";
_noisyprefixes.Initialize();
RDebugUtils.currentLine=54984714;
 //BA.debugLineNum = 54984714;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
_noisyprefixes.Add((Object)("курсор плейлистов load"));
RDebugUtils.currentLine=54984715;
 //BA.debugLineNum = 54984715;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
_noisyprefixes.Add((Object)("состояние init"));
RDebugUtils.currentLine=54984716;
 //BA.debugLineNum = 54984716;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
_noisyprefixes.Add((Object)("старт skip"));
RDebugUtils.currentLine=54984717;
 //BA.debugLineNum = 54984717;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
_noisyprefixes.Add((Object)("старт вход"));
RDebugUtils.currentLine=54984718;
 //BA.debugLineNum = 54984718;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
_noisyprefixes.Add((Object)("отложенный старт"));
RDebugUtils.currentLine=54984719;
 //BA.debugLineNum = 54984719;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
_noisyprefixes.Add((Object)("сценарий "));
RDebugUtils.currentLine=54984720;
 //BA.debugLineNum = 54984720;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
_noisyprefixes.Add((Object)("flow переход"));
RDebugUtils.currentLine=54984721;
 //BA.debugLineNum = 54984721;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
_noisyprefixes.Add((Object)("guard переход"));
RDebugUtils.currentLine=54984722;
 //BA.debugLineNum = 54984722;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
_noisyprefixes.Add((Object)("guard подготовка"));
RDebugUtils.currentLine=54984723;
 //BA.debugLineNum = 54984723;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
_noisyprefixes.Add((Object)("guard prefetch"));
RDebugUtils.currentLine=54984724;
 //BA.debugLineNum = 54984724;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
_noisyprefixes.Add((Object)("guard fade"));
RDebugUtils.currentLine=54984725;
 //BA.debugLineNum = 54984725;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
_noisyprefixes.Add((Object)("переход dispatch"));
RDebugUtils.currentLine=54984726;
 //BA.debugLineNum = 54984726;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
_noisyprefixes.Add((Object)("воспроизведение activate"));
RDebugUtils.currentLine=54984727;
 //BA.debugLineNum = 54984727;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
_noisyprefixes.Add((Object)("очередь добор"));
RDebugUtils.currentLine=54984728;
 //BA.debugLineNum = 54984728;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=54984729;
 //BA.debugLineNum = 54984729;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=54984730;
 //BA.debugLineNum = 54984730;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=54984731;
 //BA.debugLineNum = 54984731;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
_noisyprefixes.Add((Object)("автостарт сначала обновление данных"));
RDebugUtils.currentLine=54984732;
 //BA.debugLineNum = 54984732;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
_noisyprefixes.Add((Object)("policy resume авто"));
RDebugUtils.currentLine=54984733;
 //BA.debugLineNum = 54984733;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
_noisyprefixes.Add((Object)("возобновление запрет"));
RDebugUtils.currentLine=54984734;
 //BA.debugLineNum = 54984734;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
_noisyprefixes.Add((Object)("возобновление итог"));
RDebugUtils.currentLine=54984735;
 //BA.debugLineNum = 54984735;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
_noisyprefixes.Add((Object)("снимок очереди восстановление skip"));
RDebugUtils.currentLine=54984736;
 //BA.debugLineNum = 54984736;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
_noisyprefixes.Add((Object)("http get начало"));
RDebugUtils.currentLine=54984737;
 //BA.debugLineNum = 54984737;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
_noisyprefixes.Add((Object)("http get итог"));
RDebugUtils.currentLine=54984738;
 //BA.debugLineNum = 54984738;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
_noisyprefixes.Add((Object)("claim начало"));
RDebugUtils.currentLine=54984739;
 //BA.debugLineNum = 54984739;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
_noisyprefixes.Add((Object)("claim итог"));
RDebugUtils.currentLine=54984740;
 //BA.debugLineNum = 54984740;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
_noisyprefixes.Add((Object)("элемент очереди play"));
RDebugUtils.currentLine=54984741;
 //BA.debugLineNum = 54984741;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
_noisyprefixes.Add((Object)("курсор плейлистов commit"));
RDebugUtils.currentLine=54984742;
 //BA.debugLineNum = 54984742;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
_noisyprefixes.Add((Object)("реклама prescan начало"));
RDebugUtils.currentLine=54984743;
 //BA.debugLineNum = 54984743;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
_noisyprefixes.Add((Object)("брейк exact defer"));
RDebugUtils.currentLine=54984744;
 //BA.debugLineNum = 54984744;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
_noisyprefixes.Add((Object)("брейк exact sync"));
RDebugUtils.currentLine=54984745;
 //BA.debugLineNum = 54984745;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
_noisyprefixes.Add((Object)("fade начало"));
RDebugUtils.currentLine=54984746;
 //BA.debugLineNum = 54984746;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
_noisyprefixes.Add((Object)("история confirm"));
RDebugUtils.currentLine=54984747;
 //BA.debugLineNum = 54984747;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
_noisyprefixes.Add((Object)("история stage"));
RDebugUtils.currentLine=54984748;
 //BA.debugLineNum = 54984748;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
_noisyprefixes.Add((Object)("история буфер add"));
RDebugUtils.currentLine=54984749;
 //BA.debugLineNum = 54984749;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
_noisyprefixes.Add((Object)("история отправка начало"));
RDebugUtils.currentLine=54984750;
 //BA.debugLineNum = 54984750;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
_noisyprefixes.Add((Object)("история отправка payload"));
RDebugUtils.currentLine=54984751;
 //BA.debugLineNum = 54984751;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
_noisyprefixes.Add((Object)("история отправка ack"));
RDebugUtils.currentLine=54984752;
 //BA.debugLineNum = 54984752;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
_noisyprefixes.Add((Object)("stop запрос"));
RDebugUtils.currentLine=54984753;
 //BA.debugLineNum = 54984753;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
_noisyprefixes.Add((Object)("резерв очереди save"));
RDebugUtils.currentLine=54984754;
 //BA.debugLineNum = 54984754;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
_noisyprefixes.Add((Object)("снимок очереди clear"));
RDebugUtils.currentLine=54984755;
 //BA.debugLineNum = 54984755;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
_noisyprefixes.Add((Object)("состояние воспроизведения clear"));
RDebugUtils.currentLine=54984756;
 //BA.debugLineNum = 54984756;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
_noisyprefixes.Add((Object)("аудио ready"));
RDebugUtils.currentLine=54984757;
 //BA.debugLineNum = 54984757;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
_noisyprefixes.Add((Object)("аудио complete"));
RDebugUtils.currentLine=54984758;
 //BA.debugLineNum = 54984758;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
_noisyprefixes.Add((Object)("переход overlap начало"));
RDebugUtils.currentLine=54984759;
 //BA.debugLineNum = 54984759;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
_noisyprefixes.Add((Object)("переход tail начало"));
RDebugUtils.currentLine=54984760;
 //BA.debugLineNum = 54984760;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
_noisyprefixes.Add((Object)("переход prefetch начало"));
RDebugUtils.currentLine=54984761;
 //BA.debugLineNum = 54984761;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
_noisyprefixes.Add((Object)("trusted time update"));
RDebugUtils.currentLine=54984762;
 //BA.debugLineNum = 54984762;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
_noisyprefixes.Add((Object)("player end parse fail"));
RDebugUtils.currentLine=54984763;
 //BA.debugLineNum = 54984763;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
_noisyprefixes.Add((Object)("[AudioPrimary]"));
RDebugUtils.currentLine=54984764;
 //BA.debugLineNum = 54984764;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
_noisyprefixes.Add((Object)("[AudioSecondary]"));
RDebugUtils.currentLine=54984765;
 //BA.debugLineNum = 54984765;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
_noisyprefixes.Add((Object)("machine guid"));
RDebugUtils.currentLine=54984766;
 //BA.debugLineNum = 54984766;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
_noisyprefixes.Add((Object)("legacy migrate итог"));
RDebugUtils.currentLine=54984767;
 //BA.debugLineNum = 54984767;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
_noisyprefixes.Add((Object)("метаданные плейлистов sync skip"));
RDebugUtils.currentLine=54984768;
 //BA.debugLineNum = 54984768;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
_noisyprefixes.Add((Object)("метаданные плейлиста fetch начало"));
RDebugUtils.currentLine=54984769;
 //BA.debugLineNum = 54984769;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
_noisyprefixes.Add((Object)("окно save"));
RDebugUtils.currentLine=54984770;
 //BA.debugLineNum = 54984770;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
_noisyprefixes.Add((Object)("окно restore"));
RDebugUtils.currentLine=54984771;
 //BA.debugLineNum = 54984771;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
_noisyprefixes.Add((Object)("trace отправка"));
RDebugUtils.currentLine=54984772;
 //BA.debugLineNum = 54984772;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
_noisyprefixes.Add((Object)("скачивание рекламы в кэш"));
RDebugUtils.currentLine=54984773;
 //BA.debugLineNum = 54984773;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
_noisyprefixes.Add((Object)("скачивание трека в кэш"));
RDebugUtils.currentLine=54984774;
 //BA.debugLineNum = 54984774;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
_noisyprefixes.Add((Object)("удален cached track при очистке кэша"));
RDebugUtils.currentLine=54984775;
 //BA.debugLineNum = 54984775;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
_noisyprefixes.Add((Object)("очистка кэша треков пропущена"));
RDebugUtils.currentLine=54984776;
 //BA.debugLineNum = 54984776;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=54984777;
 //BA.debugLineNum = 54984777;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=54984778;
 //BA.debugLineNum = 54984778;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=54984779;
 //BA.debugLineNum = 54984779;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
_noisyprefixes.Add((Object)("переход очередь drop"));
RDebugUtils.currentLine=54984780;
 //BA.debugLineNum = 54984780;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
_noisyprefixes.Add((Object)("переход preload ошибка"));
RDebugUtils.currentLine=54984781;
 //BA.debugLineNum = 54984781;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
_noisyprefixes.Add((Object)("переход prepared reject"));
RDebugUtils.currentLine=54984782;
 //BA.debugLineNum = 54984782;BA.debugLine="For Each prefix As String In noisyPrefixes";
{
final anywheresoftware.b4a.BA.IterableList group78 = _noisyprefixes;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=54984783;
 //BA.debugLineNum = 54984783;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
if (_message.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).startsWith(_prefix.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=54984785;
 //BA.debugLineNum = 54984785;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=54984786;
 //BA.debugLineNum = 54984786;BA.debugLine="End Sub";
return false;
}
public String  _tracedebug(b4j.example.playbacktracerouter __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
RDebugUtils.currentLine=54657024;
 //BA.debugLineNum = 54657024;BA.debugLine="Private Sub TraceDebug(message As String)";
RDebugUtils.currentLine=54657025;
 //BA.debugLineNum = 54657025;BA.debugLine="traceServiceRef.TraceDebug(message)";
__ref._traceserviceref /*b4j.example.traceservice*/ ._tracedebug /*String*/ (null,_message);
RDebugUtils.currentLine=54657026;
 //BA.debugLineNum = 54657026;BA.debugLine="End Sub";
return "";
}
public String  _normalizelegacydetails(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "normalizelegacydetails", false))
	 {return ((String) Debug.delegate(ba, "normalizelegacydetails", new Object[] {_text}));}
String _value = "";
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="Dim value As String = text.Trim";
_value = _text.trim();
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
if (_value.startsWith(".") || _value.startsWith(":")) { 
_value = _value.substring((int) (1)).trim();};
RDebugUtils.currentLine=55050243;
 //BA.debugLineNum = 55050243;BA.debugLine="value = value.Replace(\",\", \"\")";
_value = _value.replace(",","");
RDebugUtils.currentLine=55050244;
 //BA.debugLineNum = 55050244;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=55050245;
 //BA.debugLineNum = 55050245;BA.debugLine="End Sub";
return "";
}
public String  _tailafter(b4j.example.playbacktracerouter __ref,String _text,String _prefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafter", false))
	 {return ((String) Debug.delegate(ba, "tailafter", new Object[] {_text,_prefix}));}
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
RDebugUtils.currentLine=55115777;
 //BA.debugLineNum = 55115777;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
if (_text.startsWith(_prefix)==__c.False) { 
if (true) return _text;};
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="Return text.SubString(prefix.Length).Trim";
if (true) return _text.substring(_prefix.length()).trim();
RDebugUtils.currentLine=55115779;
 //BA.debugLineNum = 55115779;BA.debugLine="End Sub";
return "";
}
public String  _tailafterfirstspace(b4j.example.playbacktracerouter __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="playbacktracerouter";
if (Debug.shouldDelegate(ba, "tailafterfirstspace", false))
	 {return ((String) Debug.delegate(ba, "tailafterfirstspace", new Object[] {_text}));}
int _firstspace = 0;
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
_firstspace = _text.indexOf(" ");
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="If firstSpace < 0 Then Return \"\"";
if (_firstspace<0) { 
if (true) return "";};
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
if (true) return _text.substring((int) (_firstspace+1)).trim();
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="End Sub";
return "";
}
}