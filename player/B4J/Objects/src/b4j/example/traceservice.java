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
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68485123;
 //BA.debugLineNum = 68485123;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68485124;
 //BA.debugLineNum = 68485124;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=68485125;
 //BA.debugLineNum = 68485125;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_entry).getObject()));
 }
};
RDebugUtils.currentLine=68485127;
 //BA.debugLineNum = 68485127;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68485128;
 //BA.debugLineNum = 68485128;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68419587;
 //BA.debugLineNum = 68419587;BA.debugLine="lines.Initialize";
_lines.Initialize();
RDebugUtils.currentLine=68419588;
 //BA.debugLineNum = 68419588;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=68419589;
 //BA.debugLineNum = 68419589;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
RDebugUtils.currentLine=68419590;
 //BA.debugLineNum = 68419590;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=68419591;
 //BA.debugLineNum = 68419591;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
RDebugUtils.currentLine=68419593;
 //BA.debugLineNum = 68419593;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,_lines,__c.CRLF);
RDebugUtils.currentLine=68419594;
 //BA.debugLineNum = 68419594;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Public Sub GetTraceList As List";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68091908;
 //BA.debugLineNum = 68091908;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=68091909;
 //BA.debugLineNum = 68091909;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
RDebugUtils.currentLine=68091911;
 //BA.debugLineNum = 68091911;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68091912;
 //BA.debugLineNum = 68091912;BA.debugLine="End Sub";
return null;
}
public String  _gettracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracetext", false))
	 {return ((String) Debug.delegate(ba, "gettracetext", null));}
RDebugUtils.currentLine=68026368;
 //BA.debugLineNum = 68026368;BA.debugLine="Public Sub GetTraceText As String";
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ,__c.CRLF);
RDebugUtils.currentLine=68026371;
 //BA.debugLineNum = 68026371;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.traceservice __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,String _debugresponsesdirvalue,int _traceloglimitvalue,int _serversnapshotlimitvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_debugresponsesdirvalue,_traceloglimitvalue,_serversnapshotlimitvalue}));}
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
__ref._debugresponsesdir /*String*/  = _debugresponsesdirvalue;
RDebugUtils.currentLine=67829763;
 //BA.debugLineNum = 67829763;BA.debugLine="traceLogLimit = traceLogLimitValue";
__ref._traceloglimit /*int*/  = _traceloglimitvalue;
RDebugUtils.currentLine=67829764;
 //BA.debugLineNum = 67829764;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
__ref._serversnapshotlimit /*int*/  = _serversnapshotlimitvalue;
RDebugUtils.currentLine=67829765;
 //BA.debugLineNum = 67829765;BA.debugLine="traceLogs.Initialize";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67829766;
 //BA.debugLineNum = 67829766;BA.debugLine="debugLogs.Initialize";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67829767;
 //BA.debugLineNum = 67829767;BA.debugLine="pendingTraceBatch.Initialize";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67829768;
 //BA.debugLineNum = 67829768;BA.debugLine="serverSnapshots.Initialize";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=67829769;
 //BA.debugLineNum = 67829769;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=68550656;
 //BA.debugLineNum = 68550656;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Dim timestamp As String = DateTime.Time(DateTime.";
_timestamp = __c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="Dim header As String = timestamp & \" SNAPSHOT met";
_header = _timestamp+" SNAPSHOT method="+_method+" success="+BA.ObjectToString(_success)+" url="+_url;
RDebugUtils.currentLine=68550659;
 //BA.debugLineNum = 68550659;BA.debugLine="If errorMessage <> \"\" Then header = header & \" er";
if ((_errormessage).equals("") == false) { 
_header = _header+" error="+_errormessage;};
RDebugUtils.currentLine=68550660;
 //BA.debugLineNum = 68550660;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68550661;
 //BA.debugLineNum = 68550661;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=68550662;
 //BA.debugLineNum = 68550662;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
RDebugUtils.currentLine=68550663;
 //BA.debugLineNum = 68550663;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
RDebugUtils.currentLine=68550664;
 //BA.debugLineNum = 68550664;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
RDebugUtils.currentLine=68550665;
 //BA.debugLineNum = 68550665;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
RDebugUtils.currentLine=68550666;
 //BA.debugLineNum = 68550666;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
RDebugUtils.currentLine=68550667;
 //BA.debugLineNum = 68550667;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
RDebugUtils.currentLine=68550668;
 //BA.debugLineNum = 68550668;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
RDebugUtils.currentLine=68550669;
 //BA.debugLineNum = 68550669;BA.debugLine="serverSnapshots.Add(entry)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry.getObject()));
RDebugUtils.currentLine=68550670;
 //BA.debugLineNum = 68550670;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=68550671;
 //BA.debugLineNum = 68550671;BA.debugLine="serverSnapshots.RemoveAt(0)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=68550673;
 //BA.debugLineNum = 68550673;BA.debugLine="WriteServerSnapshotFile(entry)";
__ref._writeserversnapshotfile /*String*/ (null,_entry);
RDebugUtils.currentLine=68550674;
 //BA.debugLineNum = 68550674;BA.debugLine="CleanupServerSnapshotFiles";
__ref._cleanupserversnapshotfiles /*String*/ (null);
RDebugUtils.currentLine=68550675;
 //BA.debugLineNum = 68550675;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _beginpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "beginpendingtracebatch", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "beginpendingtracebatch", null));}
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Public Sub BeginPendingTraceBatch As List";
RDebugUtils.currentLine=68222977;
 //BA.debugLineNum = 68222977;BA.debugLine="pendingTraceBatch = CloneList(traceLogs)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/  = __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="Return CloneList(pendingTraceBatch)";
if (true) return __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=68222979;
 //BA.debugLineNum = 68222979;BA.debugLine="End Sub";
return null;
}
public String  _cancelpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "cancelpendingtracebatch", false))
	 {return ((String) Debug.delegate(ba, "cancelpendingtracebatch", null));}
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Public Sub CancelPendingTraceBatch";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="If pendingTraceBatch.IsInitialized = False Then p";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="End Sub";
return "";
}
public String  _confirmpendingtracebatchsent(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "confirmpendingtracebatchsent", false))
	 {return ((String) Debug.delegate(ba, "confirmpendingtracebatchsent", null));}
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Public Sub ConfirmPendingTraceBatchSent";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="If pendingTraceBatch.IsInitialized = False Or pen";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="Do While pendingTraceBatch.Size > 0 And traceLogs";
while (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
RDebugUtils.currentLine=68288515;
 //BA.debugLineNum = 68288515;BA.debugLine="If traceLogs.Get(0) <> pendingTraceBatch.Get(0)";
if ((__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals(__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))) == false) { 
if (true) break;};
RDebugUtils.currentLine=68288516;
 //BA.debugLineNum = 68288516;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=68288517;
 //BA.debugLineNum = 68288517;BA.debugLine="pendingTraceBatch.RemoveAt(0)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=68288519;
 //BA.debugLineNum = 68288519;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=68288520;
 //BA.debugLineNum = 68288520;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Public Sub GetRecentDebugList(maxItems As Int) As";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68157442;
 //BA.debugLineNum = 68157442;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68157443;
 //BA.debugLineNum = 68157443;BA.debugLine="If debugLogs.IsInitialized = False Or debugLogs.S";
if (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return _copy;};
RDebugUtils.currentLine=68157444;
 //BA.debugLineNum = 68157444;BA.debugLine="Dim startIndex As Int = Max(0, debugLogs.Size - M";
_startindex = (int) (__c.Max(0,__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-__c.Max(1,_maxitems)));
RDebugUtils.currentLine=68157445;
 //BA.debugLineNum = 68157445;BA.debugLine="For i = startIndex To debugLogs.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _startindex ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=68157446;
 //BA.debugLineNum = 68157446;BA.debugLine="copy.Add(debugLogs.Get(i))";
_copy.Add(__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=68157448;
 //BA.debugLineNum = 68157448;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68157449;
 //BA.debugLineNum = 68157449;BA.debugLine="End Sub";
return null;
}
public String  _trace(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
String _entry = "";
String _removedentry = "";
RDebugUtils.currentLine=67895296;
 //BA.debugLineNum = 67895296;BA.debugLine="Public Sub Trace(message As String)";
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" "+_message;
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="traceLogs.Add(entry)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=67895300;
 //BA.debugLineNum = 67895300;BA.debugLine="Dim removedEntry As String = traceLogs.Get(0)";
_removedentry = BA.ObjectToString(__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=67895301;
 //BA.debugLineNum = 67895301;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=67895302;
 //BA.debugLineNum = 67895302;BA.debugLine="If pendingTraceBatch.IsInitialized And pendingTr";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=67895303;
 //BA.debugLineNum = 67895303;BA.debugLine="If pendingTraceBatch.Get(0) = removedEntry Then";
if ((__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals((Object)(_removedentry))) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
 }
;
RDebugUtils.currentLine=67895306;
 //BA.debugLineNum = 67895306;BA.debugLine="Log(entry)";
__c.LogImpl("267895306",_entry,0);
RDebugUtils.currentLine=67895307;
 //BA.debugLineNum = 67895307;BA.debugLine="End Sub";
return "";
}
public String  _tracedebug(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
String _entry = "";
RDebugUtils.currentLine=67960832;
 //BA.debugLineNum = 67960832;BA.debugLine="Public Sub TraceDebug(message As String)";
RDebugUtils.currentLine=67960833;
 //BA.debugLineNum = 67960833;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" DEBUG "+_message;
RDebugUtils.currentLine=67960834;
 //BA.debugLineNum = 67960834;BA.debugLine="debugLogs.Add(entry)";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="Do While debugLogs.Size > traceLogLimit";
while (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=67960836;
 //BA.debugLineNum = 67960836;BA.debugLine="debugLogs.RemoveAt(0)";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=67960838;
 //BA.debugLineNum = 67960838;BA.debugLine="Log(entry)";
__c.LogImpl("267960838",_entry,0);
RDebugUtils.currentLine=67960839;
 //BA.debugLineNum = 67960839;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "clonelist", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
RDebugUtils.currentLine=68943872;
 //BA.debugLineNum = 68943872;BA.debugLine="Private Sub CloneList(source As List) As List";
RDebugUtils.currentLine=68943873;
 //BA.debugLineNum = 68943873;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68943874;
 //BA.debugLineNum = 68943874;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68943875;
 //BA.debugLineNum = 68943875;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68943876;
 //BA.debugLineNum = 68943876;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
RDebugUtils.currentLine=68943877;
 //BA.debugLineNum = 68943877;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
RDebugUtils.currentLine=68943879;
 //BA.debugLineNum = 68943879;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68943880;
 //BA.debugLineNum = 68943880;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=67764227;
 //BA.debugLineNum = 67764227;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67764228;
 //BA.debugLineNum = 67764228;BA.debugLine="Private debugLogs As List";
_debuglogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67764229;
 //BA.debugLineNum = 67764229;BA.debugLine="Private pendingTraceBatch As List";
_pendingtracebatch = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67764230;
 //BA.debugLineNum = 67764230;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67764231;
 //BA.debugLineNum = 67764231;BA.debugLine="Private traceLogLimit As Int";
_traceloglimit = 0;
RDebugUtils.currentLine=67764232;
 //BA.debugLineNum = 67764232;BA.debugLine="Private serverSnapshotLimit As Int";
_serversnapshotlimit = 0;
RDebugUtils.currentLine=67764233;
 //BA.debugLineNum = 67764233;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=68681728;
 //BA.debugLineNum = 68681728;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="Try";
try {RDebugUtils.currentLine=68681730;
 //BA.debugLineNum = 68681730;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(__ref._debugresponsesdir /*String*/ ,"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=68681731;
 //BA.debugLineNum = 68681731;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=68681732;
 //BA.debugLineNum = 68681732;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()<=__ref._serversnapshotlimit /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=68681733;
 //BA.debugLineNum = 68681733;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=68681734;
 //BA.debugLineNum = 68681734;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=68681735;
 //BA.debugLineNum = 68681735;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listedfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=68681736;
 //BA.debugLineNum = 68681736;BA.debugLine="files.Add(fileName)";
_files.Add((Object)(_filename));
 }
};
RDebugUtils.currentLine=68681738;
 //BA.debugLineNum = 68681738;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
RDebugUtils.currentLine=68681739;
 //BA.debugLineNum = 68681739;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=68681740;
 //BA.debugLineNum = 68681740;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=68681741;
 //BA.debugLineNum = 68681741;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(__ref._debugresponsesdir /*String*/ ,_filename);
RDebugUtils.currentLine=68681742;
 //BA.debugLineNum = 68681742;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=68681745;
 //BA.debugLineNum = 68681745;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
__ref._trace /*String*/ (null,"Не удалось очистить старые snapshots сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=68681747;
 //BA.debugLineNum = 68681747;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=68878336;
 //BA.debugLineNum = 68878336;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=68878337;
 //BA.debugLineNum = 68878337;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68878338;
 //BA.debugLineNum = 68878338;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=68878339;
 //BA.debugLineNum = 68878339;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=68878340;
 //BA.debugLineNum = 68878340;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=68878341;
 //BA.debugLineNum = 68878341;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=68878343;
 //BA.debugLineNum = 68878343;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=68878344;
 //BA.debugLineNum = 68878344;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.traceservice __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=68747267;
 //BA.debugLineNum = 68747267;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=68747268;
 //BA.debugLineNum = 68747268;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=68812801;
 //BA.debugLineNum = 68812801;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=68812803;
 //BA.debugLineNum = 68812803;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=68812804;
 //BA.debugLineNum = 68812804;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=68812805;
 //BA.debugLineNum = 68812805;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=68812807;
 //BA.debugLineNum = 68812807;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=68812808;
 //BA.debugLineNum = 68812808;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
RDebugUtils.currentLine=68616193;
 //BA.debugLineNum = 68616193;BA.debugLine="Try";
try {RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=68616195;
 //BA.debugLineNum = 68616195;BA.debugLine="EnsureDirectory(debugResponsesDir)";
__ref._ensuredirectory /*String*/ (null,__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=68616196;
 //BA.debugLineNum = 68616196;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
RDebugUtils.currentLine=68616197;
 //BA.debugLineNum = 68616197;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
RDebugUtils.currentLine=68616198;
 //BA.debugLineNum = 68616198;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
RDebugUtils.currentLine=68616199;
 //BA.debugLineNum = 68616199;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=68616200;
 //BA.debugLineNum = 68616200;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(__ref._debugresponsesdir /*String*/ ,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=68616202;
 //BA.debugLineNum = 68616202;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
__ref._trace /*String*/ (null,"Не удалось записать snapshot сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=68616204;
 //BA.debugLineNum = 68616204;BA.debugLine="End Sub";
return "";
}
}