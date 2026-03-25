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
RDebugUtils.currentLine=66846720;
 //BA.debugLineNum = 66846720;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=66846721;
 //BA.debugLineNum = 66846721;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66846722;
 //BA.debugLineNum = 66846722;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=66846723;
 //BA.debugLineNum = 66846723;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=66846724;
 //BA.debugLineNum = 66846724;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=66846725;
 //BA.debugLineNum = 66846725;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_entry).getObject()));
 }
};
RDebugUtils.currentLine=66846727;
 //BA.debugLineNum = 66846727;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=66846728;
 //BA.debugLineNum = 66846728;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=66781184;
 //BA.debugLineNum = 66781184;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=66781185;
 //BA.debugLineNum = 66781185;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=66781186;
 //BA.debugLineNum = 66781186;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66781187;
 //BA.debugLineNum = 66781187;BA.debugLine="lines.Initialize";
_lines.Initialize();
RDebugUtils.currentLine=66781188;
 //BA.debugLineNum = 66781188;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=66781189;
 //BA.debugLineNum = 66781189;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
RDebugUtils.currentLine=66781190;
 //BA.debugLineNum = 66781190;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=66781191;
 //BA.debugLineNum = 66781191;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
RDebugUtils.currentLine=66781193;
 //BA.debugLineNum = 66781193;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,_lines,__c.CRLF);
RDebugUtils.currentLine=66781194;
 //BA.debugLineNum = 66781194;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
RDebugUtils.currentLine=66453504;
 //BA.debugLineNum = 66453504;BA.debugLine="Public Sub GetTraceList As List";
RDebugUtils.currentLine=66453505;
 //BA.debugLineNum = 66453505;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66453506;
 //BA.debugLineNum = 66453506;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=66453507;
 //BA.debugLineNum = 66453507;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=66453508;
 //BA.debugLineNum = 66453508;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=66453509;
 //BA.debugLineNum = 66453509;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
RDebugUtils.currentLine=66453511;
 //BA.debugLineNum = 66453511;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=66453512;
 //BA.debugLineNum = 66453512;BA.debugLine="End Sub";
return null;
}
public String  _gettracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracetext", false))
	 {return ((String) Debug.delegate(ba, "gettracetext", null));}
RDebugUtils.currentLine=66387968;
 //BA.debugLineNum = 66387968;BA.debugLine="Public Sub GetTraceText As String";
RDebugUtils.currentLine=66387969;
 //BA.debugLineNum = 66387969;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=66387970;
 //BA.debugLineNum = 66387970;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ,__c.CRLF);
RDebugUtils.currentLine=66387971;
 //BA.debugLineNum = 66387971;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.traceservice __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,String _debugresponsesdirvalue,int _traceloglimitvalue,int _serversnapshotlimitvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_debugresponsesdirvalue,_traceloglimitvalue,_serversnapshotlimitvalue}));}
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
__ref._debugresponsesdir /*String*/  = _debugresponsesdirvalue;
RDebugUtils.currentLine=66191363;
 //BA.debugLineNum = 66191363;BA.debugLine="traceLogLimit = traceLogLimitValue";
__ref._traceloglimit /*int*/  = _traceloglimitvalue;
RDebugUtils.currentLine=66191364;
 //BA.debugLineNum = 66191364;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
__ref._serversnapshotlimit /*int*/  = _serversnapshotlimitvalue;
RDebugUtils.currentLine=66191365;
 //BA.debugLineNum = 66191365;BA.debugLine="traceLogs.Initialize";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66191366;
 //BA.debugLineNum = 66191366;BA.debugLine="debugLogs.Initialize";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66191367;
 //BA.debugLineNum = 66191367;BA.debugLine="pendingTraceBatch.Initialize";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66191368;
 //BA.debugLineNum = 66191368;BA.debugLine="serverSnapshots.Initialize";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66191369;
 //BA.debugLineNum = 66191369;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=66912256;
 //BA.debugLineNum = 66912256;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=66912257;
 //BA.debugLineNum = 66912257;BA.debugLine="Dim timestamp As String = DateTime.Time(DateTime.";
_timestamp = __c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=66912258;
 //BA.debugLineNum = 66912258;BA.debugLine="Dim header As String = timestamp & \" SNAPSHOT met";
_header = _timestamp+" SNAPSHOT method="+_method+" success="+BA.ObjectToString(_success)+" url="+_url;
RDebugUtils.currentLine=66912259;
 //BA.debugLineNum = 66912259;BA.debugLine="If errorMessage <> \"\" Then header = header & \" er";
if ((_errormessage).equals("") == false) { 
_header = _header+" error="+_errormessage;};
RDebugUtils.currentLine=66912260;
 //BA.debugLineNum = 66912260;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=66912261;
 //BA.debugLineNum = 66912261;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=66912262;
 //BA.debugLineNum = 66912262;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
RDebugUtils.currentLine=66912263;
 //BA.debugLineNum = 66912263;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
RDebugUtils.currentLine=66912264;
 //BA.debugLineNum = 66912264;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
RDebugUtils.currentLine=66912265;
 //BA.debugLineNum = 66912265;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
RDebugUtils.currentLine=66912266;
 //BA.debugLineNum = 66912266;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
RDebugUtils.currentLine=66912267;
 //BA.debugLineNum = 66912267;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
RDebugUtils.currentLine=66912268;
 //BA.debugLineNum = 66912268;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
RDebugUtils.currentLine=66912269;
 //BA.debugLineNum = 66912269;BA.debugLine="serverSnapshots.Add(entry)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry.getObject()));
RDebugUtils.currentLine=66912270;
 //BA.debugLineNum = 66912270;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=66912271;
 //BA.debugLineNum = 66912271;BA.debugLine="serverSnapshots.RemoveAt(0)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=66912273;
 //BA.debugLineNum = 66912273;BA.debugLine="WriteServerSnapshotFile(entry)";
__ref._writeserversnapshotfile /*String*/ (null,_entry);
RDebugUtils.currentLine=66912274;
 //BA.debugLineNum = 66912274;BA.debugLine="CleanupServerSnapshotFiles";
__ref._cleanupserversnapshotfiles /*String*/ (null);
RDebugUtils.currentLine=66912275;
 //BA.debugLineNum = 66912275;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _beginpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "beginpendingtracebatch", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "beginpendingtracebatch", null));}
RDebugUtils.currentLine=66584576;
 //BA.debugLineNum = 66584576;BA.debugLine="Public Sub BeginPendingTraceBatch As List";
RDebugUtils.currentLine=66584577;
 //BA.debugLineNum = 66584577;BA.debugLine="pendingTraceBatch = CloneList(traceLogs)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/  = __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=66584578;
 //BA.debugLineNum = 66584578;BA.debugLine="Return CloneList(pendingTraceBatch)";
if (true) return __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=66584579;
 //BA.debugLineNum = 66584579;BA.debugLine="End Sub";
return null;
}
public String  _cancelpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "cancelpendingtracebatch", false))
	 {return ((String) Debug.delegate(ba, "cancelpendingtracebatch", null));}
RDebugUtils.currentLine=66715648;
 //BA.debugLineNum = 66715648;BA.debugLine="Public Sub CancelPendingTraceBatch";
RDebugUtils.currentLine=66715649;
 //BA.debugLineNum = 66715649;BA.debugLine="If pendingTraceBatch.IsInitialized = False Then p";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=66715650;
 //BA.debugLineNum = 66715650;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=66715651;
 //BA.debugLineNum = 66715651;BA.debugLine="End Sub";
return "";
}
public String  _confirmpendingtracebatchsent(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "confirmpendingtracebatchsent", false))
	 {return ((String) Debug.delegate(ba, "confirmpendingtracebatchsent", null));}
RDebugUtils.currentLine=66650112;
 //BA.debugLineNum = 66650112;BA.debugLine="Public Sub ConfirmPendingTraceBatchSent";
RDebugUtils.currentLine=66650113;
 //BA.debugLineNum = 66650113;BA.debugLine="If pendingTraceBatch.IsInitialized = False Or pen";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=66650114;
 //BA.debugLineNum = 66650114;BA.debugLine="Do While pendingTraceBatch.Size > 0 And traceLogs";
while (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
RDebugUtils.currentLine=66650115;
 //BA.debugLineNum = 66650115;BA.debugLine="If traceLogs.Get(0) <> pendingTraceBatch.Get(0)";
if ((__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals(__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))) == false) { 
if (true) break;};
RDebugUtils.currentLine=66650116;
 //BA.debugLineNum = 66650116;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=66650117;
 //BA.debugLineNum = 66650117;BA.debugLine="pendingTraceBatch.RemoveAt(0)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=66650119;
 //BA.debugLineNum = 66650119;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=66650120;
 //BA.debugLineNum = 66650120;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=66519040;
 //BA.debugLineNum = 66519040;BA.debugLine="Public Sub GetRecentDebugList(maxItems As Int) As";
RDebugUtils.currentLine=66519041;
 //BA.debugLineNum = 66519041;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66519042;
 //BA.debugLineNum = 66519042;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=66519043;
 //BA.debugLineNum = 66519043;BA.debugLine="If debugLogs.IsInitialized = False Or debugLogs.S";
if (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return _copy;};
RDebugUtils.currentLine=66519044;
 //BA.debugLineNum = 66519044;BA.debugLine="Dim startIndex As Int = Max(0, debugLogs.Size - M";
_startindex = (int) (__c.Max(0,__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-__c.Max(1,_maxitems)));
RDebugUtils.currentLine=66519045;
 //BA.debugLineNum = 66519045;BA.debugLine="For i = startIndex To debugLogs.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _startindex ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=66519046;
 //BA.debugLineNum = 66519046;BA.debugLine="copy.Add(debugLogs.Get(i))";
_copy.Add(__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=66519048;
 //BA.debugLineNum = 66519048;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=66519049;
 //BA.debugLineNum = 66519049;BA.debugLine="End Sub";
return null;
}
public String  _trace(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
String _entry = "";
String _removedentry = "";
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Public Sub Trace(message As String)";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" "+_message;
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="traceLogs.Add(entry)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=66256899;
 //BA.debugLineNum = 66256899;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=66256900;
 //BA.debugLineNum = 66256900;BA.debugLine="Dim removedEntry As String = traceLogs.Get(0)";
_removedentry = BA.ObjectToString(__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=66256901;
 //BA.debugLineNum = 66256901;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=66256902;
 //BA.debugLineNum = 66256902;BA.debugLine="If pendingTraceBatch.IsInitialized And pendingTr";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=66256903;
 //BA.debugLineNum = 66256903;BA.debugLine="If pendingTraceBatch.Get(0) = removedEntry Then";
if ((__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals((Object)(_removedentry))) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
 }
;
RDebugUtils.currentLine=66256906;
 //BA.debugLineNum = 66256906;BA.debugLine="Log(entry)";
__c.LogImpl("266256906",_entry,0);
RDebugUtils.currentLine=66256907;
 //BA.debugLineNum = 66256907;BA.debugLine="End Sub";
return "";
}
public String  _tracedebug(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
String _entry = "";
RDebugUtils.currentLine=66322432;
 //BA.debugLineNum = 66322432;BA.debugLine="Public Sub TraceDebug(message As String)";
RDebugUtils.currentLine=66322433;
 //BA.debugLineNum = 66322433;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" DEBUG "+_message;
RDebugUtils.currentLine=66322434;
 //BA.debugLineNum = 66322434;BA.debugLine="debugLogs.Add(entry)";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=66322435;
 //BA.debugLineNum = 66322435;BA.debugLine="Do While debugLogs.Size > traceLogLimit";
while (__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=66322436;
 //BA.debugLineNum = 66322436;BA.debugLine="debugLogs.RemoveAt(0)";
__ref._debuglogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=66322438;
 //BA.debugLineNum = 66322438;BA.debugLine="Log(entry)";
__c.LogImpl("266322438",_entry,0);
RDebugUtils.currentLine=66322439;
 //BA.debugLineNum = 66322439;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "clonelist", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Private Sub CloneList(source As List) As List";
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=67305476;
 //BA.debugLineNum = 67305476;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
RDebugUtils.currentLine=67305477;
 //BA.debugLineNum = 67305477;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
RDebugUtils.currentLine=67305479;
 //BA.debugLineNum = 67305479;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=67305480;
 //BA.debugLineNum = 67305480;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=66125826;
 //BA.debugLineNum = 66125826;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=66125827;
 //BA.debugLineNum = 66125827;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66125828;
 //BA.debugLineNum = 66125828;BA.debugLine="Private debugLogs As List";
_debuglogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66125829;
 //BA.debugLineNum = 66125829;BA.debugLine="Private pendingTraceBatch As List";
_pendingtracebatch = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66125830;
 //BA.debugLineNum = 66125830;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66125831;
 //BA.debugLineNum = 66125831;BA.debugLine="Private traceLogLimit As Int";
_traceloglimit = 0;
RDebugUtils.currentLine=66125832;
 //BA.debugLineNum = 66125832;BA.debugLine="Private serverSnapshotLimit As Int";
_serversnapshotlimit = 0;
RDebugUtils.currentLine=66125833;
 //BA.debugLineNum = 66125833;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=67043328;
 //BA.debugLineNum = 67043328;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="Try";
try {RDebugUtils.currentLine=67043330;
 //BA.debugLineNum = 67043330;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(__ref._debugresponsesdir /*String*/ ,"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=67043331;
 //BA.debugLineNum = 67043331;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=67043332;
 //BA.debugLineNum = 67043332;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()<=__ref._serversnapshotlimit /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=67043333;
 //BA.debugLineNum = 67043333;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67043334;
 //BA.debugLineNum = 67043334;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=67043335;
 //BA.debugLineNum = 67043335;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listedfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=67043336;
 //BA.debugLineNum = 67043336;BA.debugLine="files.Add(fileName)";
_files.Add((Object)(_filename));
 }
};
RDebugUtils.currentLine=67043338;
 //BA.debugLineNum = 67043338;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
RDebugUtils.currentLine=67043339;
 //BA.debugLineNum = 67043339;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=67043340;
 //BA.debugLineNum = 67043340;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=67043341;
 //BA.debugLineNum = 67043341;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(__ref._debugresponsesdir /*String*/ ,_filename);
RDebugUtils.currentLine=67043342;
 //BA.debugLineNum = 67043342;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=67043345;
 //BA.debugLineNum = 67043345;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
__ref._trace /*String*/ (null,"Не удалось очистить старые snapshots сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=67043347;
 //BA.debugLineNum = 67043347;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=67239936;
 //BA.debugLineNum = 67239936;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=67239937;
 //BA.debugLineNum = 67239937;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=67239939;
 //BA.debugLineNum = 67239939;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=67239940;
 //BA.debugLineNum = 67239940;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=67239941;
 //BA.debugLineNum = 67239941;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=67239943;
 //BA.debugLineNum = 67239943;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=67239944;
 //BA.debugLineNum = 67239944;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.traceservice __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=67108864;
 //BA.debugLineNum = 67108864;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=67108865;
 //BA.debugLineNum = 67108865;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=67108866;
 //BA.debugLineNum = 67108866;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=67108867;
 //BA.debugLineNum = 67108867;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=67108868;
 //BA.debugLineNum = 67108868;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=67174400;
 //BA.debugLineNum = 67174400;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=67174402;
 //BA.debugLineNum = 67174402;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=67174403;
 //BA.debugLineNum = 67174403;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=67174404;
 //BA.debugLineNum = 67174404;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=67174405;
 //BA.debugLineNum = 67174405;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=67174407;
 //BA.debugLineNum = 67174407;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=67174408;
 //BA.debugLineNum = 67174408;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=66977792;
 //BA.debugLineNum = 66977792;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
RDebugUtils.currentLine=66977793;
 //BA.debugLineNum = 66977793;BA.debugLine="Try";
try {RDebugUtils.currentLine=66977794;
 //BA.debugLineNum = 66977794;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=66977795;
 //BA.debugLineNum = 66977795;BA.debugLine="EnsureDirectory(debugResponsesDir)";
__ref._ensuredirectory /*String*/ (null,__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=66977796;
 //BA.debugLineNum = 66977796;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
RDebugUtils.currentLine=66977797;
 //BA.debugLineNum = 66977797;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
RDebugUtils.currentLine=66977798;
 //BA.debugLineNum = 66977798;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
RDebugUtils.currentLine=66977799;
 //BA.debugLineNum = 66977799;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=66977800;
 //BA.debugLineNum = 66977800;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(__ref._debugresponsesdir /*String*/ ,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=66977802;
 //BA.debugLineNum = 66977802;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
__ref._trace /*String*/ (null,"Не удалось записать snapshot сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=66977804;
 //BA.debugLineNum = 66977804;BA.debugLine="End Sub";
return "";
}
}