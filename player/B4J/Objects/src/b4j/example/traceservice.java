package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class traceservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.traceservice", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.traceservice.class).invoke(this, new Object[] {null});
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
public String _storagedir = "";
public String _debugresponsesdir = "";
public anywheresoftware.b4a.objects.collections.List _tracelogs = null;
public anywheresoftware.b4a.objects.collections.List _debuglogs = null;
public anywheresoftware.b4a.objects.collections.List _pendingtracebatch = null;
public anywheresoftware.b4a.objects.collections.List _serversnapshots = null;
public int _traceloglimit = 0;
public int _serversnapshotlimit = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.List  _getservertracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getservertracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68157442;
 //BA.debugLineNum = 68157442;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68157443;
 //BA.debugLineNum = 68157443;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68157444;
 //BA.debugLineNum = 68157444;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=68157445;
 //BA.debugLineNum = 68157445;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_entry).getObject()));
 }
};
RDebugUtils.currentLine=68157447;
 //BA.debugLineNum = 68157447;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68157448;
 //BA.debugLineNum = 68157448;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="lines.Initialize";
_lines.Initialize();
RDebugUtils.currentLine=68091908;
 //BA.debugLineNum = 68091908;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=68091909;
 //BA.debugLineNum = 68091909;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
RDebugUtils.currentLine=68091910;
 //BA.debugLineNum = 68091910;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=68091911;
 //BA.debugLineNum = 68091911;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
RDebugUtils.currentLine=68091913;
 //BA.debugLineNum = 68091913;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,_lines,__c.CRLF);
RDebugUtils.currentLine=68091914;
 //BA.debugLineNum = 68091914;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Public Sub GetTraceList As List";
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=67764227;
 //BA.debugLineNum = 67764227;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=67764228;
 //BA.debugLineNum = 67764228;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=67764229;
 //BA.debugLineNum = 67764229;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
RDebugUtils.currentLine=67764231;
 //BA.debugLineNum = 67764231;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=67764232;
 //BA.debugLineNum = 67764232;BA.debugLine="End Sub";
return null;
}
public String  _gettracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracetext", false))
	 {return ((String) Debug.delegate(ba, "gettracetext", null));}
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Public Sub GetTraceText As String";
RDebugUtils.currentLine=67698689;
 //BA.debugLineNum = 67698689;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ,__c.CRLF);
RDebugUtils.currentLine=67698691;
 //BA.debugLineNum = 67698691;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.traceservice __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,String _debugresponsesdirvalue,int _traceloglimitvalue,int _serversnapshotlimitvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_debugresponsesdirvalue,_traceloglimitvalue,_serversnapshotlimitvalue}));}
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
__ref._debugresponsesdir /*String*/  = _debugresponsesdirvalue;
RDebugUtils.currentLine=67502083;
 //BA.debugLineNum = 67502083;BA.debugLine="traceLogLimit = traceLogLimitValue";
__ref._traceloglimit /*int*/  = _traceloglimitvalue;
RDebugUtils.currentLine=67502084;
 //BA.debugLineNum = 67502084;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
__ref._serversnapshotlimit /*int*/  = _serversnapshotlimitvalue;
RDebugUtils.currentLine=67502085;
 //BA.debugLineNum = 67502085;BA.debugLine="traceLogs.Initialize";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67502086;
 //BA.debugLineNum = 67502086;BA.debugLine="debugLogs.Initialize";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67502087;
 //BA.debugLineNum = 67502087;BA.debugLine="pendingTraceBatch.Initialize";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67502088;
 //BA.debugLineNum = 67502088;BA.debugLine="serverSnapshots.Initialize";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67502089;
 //BA.debugLineNum = 67502089;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(b4j.example.traceservice __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
String _timestamp = "";
String _header = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=68222977;
 //BA.debugLineNum = 68222977;BA.debugLine="Dim timestamp As String = DateTime.Time(DateTime.";
_timestamp = __c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="Dim header As String = timestamp & \" SNAPSHOT met";
_header = _timestamp+" SNAPSHOT method="+_method+" success="+BA.ObjectToString(_success)+" url="+_url;
RDebugUtils.currentLine=68222979;
 //BA.debugLineNum = 68222979;BA.debugLine="If errorMessage <> \"\" Then header = header & \" er";
if ((_errormessage).equals("") == false) { 
_header = _header+" error="+_errormessage;};
RDebugUtils.currentLine=68222980;
 //BA.debugLineNum = 68222980;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68222981;
 //BA.debugLineNum = 68222981;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=68222982;
 //BA.debugLineNum = 68222982;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
RDebugUtils.currentLine=68222983;
 //BA.debugLineNum = 68222983;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
RDebugUtils.currentLine=68222984;
 //BA.debugLineNum = 68222984;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
RDebugUtils.currentLine=68222985;
 //BA.debugLineNum = 68222985;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
RDebugUtils.currentLine=68222986;
 //BA.debugLineNum = 68222986;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
RDebugUtils.currentLine=68222987;
 //BA.debugLineNum = 68222987;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
RDebugUtils.currentLine=68222988;
 //BA.debugLineNum = 68222988;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
RDebugUtils.currentLine=68222989;
 //BA.debugLineNum = 68222989;BA.debugLine="serverSnapshots.Add(entry)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry.getObject()));
RDebugUtils.currentLine=68222990;
 //BA.debugLineNum = 68222990;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=68222991;
 //BA.debugLineNum = 68222991;BA.debugLine="serverSnapshots.RemoveAt(0)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=68222993;
 //BA.debugLineNum = 68222993;BA.debugLine="WriteServerSnapshotFile(entry)";
__ref._writeserversnapshotfile /*String*/ (null,_entry);
RDebugUtils.currentLine=68222994;
 //BA.debugLineNum = 68222994;BA.debugLine="CleanupServerSnapshotFiles";
__ref._cleanupserversnapshotfiles /*String*/ (null);
RDebugUtils.currentLine=68222995;
 //BA.debugLineNum = 68222995;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrecentdebuglist(b4j.example.traceservice __ref,int _maxitems) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getrecentdebuglist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getrecentdebuglist", new Object[] {_maxitems}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
int _startindex = 0;
int _i = 0;
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Public Sub GetRecentDebugList(maxItems As Int) As";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=67829763;
 //BA.debugLineNum = 67829763;BA.debugLine="If debugLogs.IsInitialized = False Or debugLogs.S";
if (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return _copy;};
RDebugUtils.currentLine=67829764;
 //BA.debugLineNum = 67829764;BA.debugLine="Dim startIndex As Int = Max(0, debugLogs.Size - M";
_startindex = (int) (__c.Max(0,__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-__c.Max(1,_maxitems)));
RDebugUtils.currentLine=67829765;
 //BA.debugLineNum = 67829765;BA.debugLine="For i = startIndex To debugLogs.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _startindex ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=67829766;
 //BA.debugLineNum = 67829766;BA.debugLine="copy.Add(debugLogs.Get(i))";
_copy.Add(__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=67829768;
 //BA.debugLineNum = 67829768;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=67829769;
 //BA.debugLineNum = 67829769;BA.debugLine="End Sub";
return null;
}
public String  _trace(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
String _entry = "";
String _removedentry = "";
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Public Sub Trace(message As String)";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" "+_message;
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="traceLogs.Add(entry)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=67567619;
 //BA.debugLineNum = 67567619;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=67567620;
 //BA.debugLineNum = 67567620;BA.debugLine="Dim removedEntry As String = traceLogs.Get(0)";
_removedentry = BA.ObjectToString(__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=67567621;
 //BA.debugLineNum = 67567621;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=67567622;
 //BA.debugLineNum = 67567622;BA.debugLine="If pendingTraceBatch.IsInitialized And pendingTr";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=67567623;
 //BA.debugLineNum = 67567623;BA.debugLine="If pendingTraceBatch.Get(0) = removedEntry Then";
if ((__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals((Object)(_removedentry))) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
 }
;
RDebugUtils.currentLine=67567626;
 //BA.debugLineNum = 67567626;BA.debugLine="Log(entry)";
__c.LogImpl("267567626",_entry,0);
RDebugUtils.currentLine=67567627;
 //BA.debugLineNum = 67567627;BA.debugLine="End Sub";
return "";
}
public String  _tracedebug(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
String _entry = "";
RDebugUtils.currentLine=67633152;
 //BA.debugLineNum = 67633152;BA.debugLine="Public Sub TraceDebug(message As String)";
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" DEBUG "+_message;
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="debugLogs.Add(entry)";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=67633155;
 //BA.debugLineNum = 67633155;BA.debugLine="Do While debugLogs.Size > traceLogLimit";
while (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=67633156;
 //BA.debugLineNum = 67633156;BA.debugLine="debugLogs.RemoveAt(0)";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=67633158;
 //BA.debugLineNum = 67633158;BA.debugLine="Log(entry)";
__c.LogImpl("267633158",_entry,0);
RDebugUtils.currentLine=67633159;
 //BA.debugLineNum = 67633159;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _beginpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "beginpendingtracebatch", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "beginpendingtracebatch", null));}
RDebugUtils.currentLine=67895296;
 //BA.debugLineNum = 67895296;BA.debugLine="Public Sub BeginPendingTraceBatch As List";
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="pendingTraceBatch = CloneList(traceLogs)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/  = __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="Return CloneList(pendingTraceBatch)";
if (true) return __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="End Sub";
return null;
}
public String  _cancelpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "cancelpendingtracebatch", false))
	 {return ((String) Debug.delegate(ba, "cancelpendingtracebatch", null));}
RDebugUtils.currentLine=68026368;
 //BA.debugLineNum = 68026368;BA.debugLine="Public Sub CancelPendingTraceBatch";
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="If pendingTraceBatch.IsInitialized = False Then p";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=68026371;
 //BA.debugLineNum = 68026371;BA.debugLine="End Sub";
return "";
}
public String  _confirmpendingtracebatchsent(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "confirmpendingtracebatchsent", false))
	 {return ((String) Debug.delegate(ba, "confirmpendingtracebatchsent", null));}
RDebugUtils.currentLine=67960832;
 //BA.debugLineNum = 67960832;BA.debugLine="Public Sub ConfirmPendingTraceBatchSent";
RDebugUtils.currentLine=67960833;
 //BA.debugLineNum = 67960833;BA.debugLine="If pendingTraceBatch.IsInitialized = False Or pen";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=67960834;
 //BA.debugLineNum = 67960834;BA.debugLine="Do While pendingTraceBatch.Size > 0 And traceLogs";
while (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="If traceLogs.Get(0) <> pendingTraceBatch.Get(0)";
if ((__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals(__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))) == false) { 
if (true) break;};
RDebugUtils.currentLine=67960836;
 //BA.debugLineNum = 67960836;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=67960837;
 //BA.debugLineNum = 67960837;BA.debugLine="pendingTraceBatch.RemoveAt(0)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=67960839;
 //BA.debugLineNum = 67960839;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=67960840;
 //BA.debugLineNum = 67960840;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "clonelist", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Private Sub CloneList(source As List) As List";
RDebugUtils.currentLine=68616193;
 //BA.debugLineNum = 68616193;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68616195;
 //BA.debugLineNum = 68616195;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68616196;
 //BA.debugLineNum = 68616196;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
RDebugUtils.currentLine=68616197;
 //BA.debugLineNum = 68616197;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
RDebugUtils.currentLine=68616199;
 //BA.debugLineNum = 68616199;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68616200;
 //BA.debugLineNum = 68616200;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=67436545;
 //BA.debugLineNum = 67436545;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67436548;
 //BA.debugLineNum = 67436548;BA.debugLine="Private debugLogs As List";
_debuglogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67436549;
 //BA.debugLineNum = 67436549;BA.debugLine="Private pendingTraceBatch As List";
_pendingtracebatch = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67436550;
 //BA.debugLineNum = 67436550;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67436551;
 //BA.debugLineNum = 67436551;BA.debugLine="Private traceLogLimit As Int";
_traceloglimit = 0;
RDebugUtils.currentLine=67436552;
 //BA.debugLineNum = 67436552;BA.debugLine="Private serverSnapshotLimit As Int";
_serversnapshotlimit = 0;
RDebugUtils.currentLine=67436553;
 //BA.debugLineNum = 67436553;BA.debugLine="End Sub";
return "";
}
public String  _cleanupserversnapshotfiles(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "cleanupserversnapshotfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupserversnapshotfiles", null));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="Try";
try {RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(__ref._debugresponsesdir /*String*/ ,"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=68354052;
 //BA.debugLineNum = 68354052;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()<=__ref._serversnapshotlimit /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=68354053;
 //BA.debugLineNum = 68354053;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68354054;
 //BA.debugLineNum = 68354054;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=68354055;
 //BA.debugLineNum = 68354055;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listedfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=68354056;
 //BA.debugLineNum = 68354056;BA.debugLine="files.Add(fileName)";
_files.Add((Object)(_filename));
 }
};
RDebugUtils.currentLine=68354058;
 //BA.debugLineNum = 68354058;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
RDebugUtils.currentLine=68354059;
 //BA.debugLineNum = 68354059;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=68354060;
 //BA.debugLineNum = 68354060;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=68354061;
 //BA.debugLineNum = 68354061;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(__ref._debugresponsesdir /*String*/ ,_filename);
RDebugUtils.currentLine=68354062;
 //BA.debugLineNum = 68354062;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=68354065;
 //BA.debugLineNum = 68354065;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
__ref._trace /*String*/ (null,"Не удалось очистить старые snapshots сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=68354067;
 //BA.debugLineNum = 68354067;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=68550656;
 //BA.debugLineNum = 68550656;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68550659;
 //BA.debugLineNum = 68550659;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68550660;
 //BA.debugLineNum = 68550660;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=68550661;
 //BA.debugLineNum = 68550661;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=68550663;
 //BA.debugLineNum = 68550663;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68550664;
 //BA.debugLineNum = 68550664;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.traceservice __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=68419587;
 //BA.debugLineNum = 68419587;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=68419588;
 //BA.debugLineNum = 68419588;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=68485123;
 //BA.debugLineNum = 68485123;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=68485124;
 //BA.debugLineNum = 68485124;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=68485125;
 //BA.debugLineNum = 68485125;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=68485127;
 //BA.debugLineNum = 68485127;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=68485128;
 //BA.debugLineNum = 68485128;BA.debugLine="End Sub";
return "";
}
public String  _writeserversnapshotfile(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.Map _entry) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "writeserversnapshotfile", false))
	 {return ((String) Debug.delegate(ba, "writeserversnapshotfile", new Object[] {_entry}));}
String _stamp = "";
String _name = "";
String _text = "";
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="Try";
try {RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=68288515;
 //BA.debugLineNum = 68288515;BA.debugLine="EnsureDirectory(debugResponsesDir)";
__ref._ensuredirectory /*String*/ (null,__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=68288516;
 //BA.debugLineNum = 68288516;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
RDebugUtils.currentLine=68288517;
 //BA.debugLineNum = 68288517;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
RDebugUtils.currentLine=68288518;
 //BA.debugLineNum = 68288518;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
RDebugUtils.currentLine=68288519;
 //BA.debugLineNum = 68288519;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=68288520;
 //BA.debugLineNum = 68288520;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(__ref._debugresponsesdir /*String*/ ,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=68288522;
 //BA.debugLineNum = 68288522;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
__ref._trace /*String*/ (null,"Не удалось записать snapshot сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=68288524;
 //BA.debugLineNum = 68288524;BA.debugLine="End Sub";
return "";
}
}