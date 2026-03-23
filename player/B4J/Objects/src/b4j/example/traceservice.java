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
public anywheresoftware.b4a.objects.collections.List _pendingtracebatch = null;
public anywheresoftware.b4a.objects.collections.List _serversnapshots = null;
public int _traceloglimit = 0;
public int _serversnapshotlimit = 0;
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.List  _beginpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "beginpendingtracebatch", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "beginpendingtracebatch", null));}
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Public Sub BeginPendingTraceBatch As List";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="pendingTraceBatch = CloneList(traceLogs)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/  = __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="Return CloneList(pendingTraceBatch)";
if (true) return __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=57933827;
 //BA.debugLineNum = 57933827;BA.debugLine="End Sub";
return null;
}
public String  _cancelpendingtracebatch(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "cancelpendingtracebatch", false))
	 {return ((String) Debug.delegate(ba, "cancelpendingtracebatch", null));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Public Sub CancelPendingTraceBatch";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="If pendingTraceBatch.IsInitialized = False Then p";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=58064899;
 //BA.debugLineNum = 58064899;BA.debugLine="End Sub";
return "";
}
public String  _confirmpendingtracebatchsent(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "confirmpendingtracebatchsent", false))
	 {return ((String) Debug.delegate(ba, "confirmpendingtracebatchsent", null));}
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Public Sub ConfirmPendingTraceBatchSent";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="If pendingTraceBatch.IsInitialized = False Or pen";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="Do While pendingTraceBatch.Size > 0 And traceLogs";
while (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="If traceLogs.Get(0) <> pendingTraceBatch.Get(0)";
if ((__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals(__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))) == false) { 
if (true) break;};
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=57999365;
 //BA.debugLineNum = 57999365;BA.debugLine="pendingTraceBatch.RemoveAt(0)";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=57999367;
 //BA.debugLineNum = 57999367;BA.debugLine="pendingTraceBatch.Clear";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=57999368;
 //BA.debugLineNum = 57999368;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getservertracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_entry).getObject()));
 }
};
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="lines.Initialize";
_lines.Initialize();
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
RDebugUtils.currentLine=30539782;
 //BA.debugLineNum = 30539782;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,_lines,__c.CRLF);
RDebugUtils.currentLine=30539786;
 //BA.debugLineNum = 30539786;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Public Sub GetTraceList As List";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=30474244;
 //BA.debugLineNum = 30474244;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=30474245;
 //BA.debugLineNum = 30474245;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
RDebugUtils.currentLine=30474247;
 //BA.debugLineNum = 30474247;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=30474248;
 //BA.debugLineNum = 30474248;BA.debugLine="End Sub";
return null;
}
public String  _gettracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracetext", false))
	 {return ((String) Debug.delegate(ba, "gettracetext", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Public Sub GetTraceText As String";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ,__c.CRLF);
RDebugUtils.currentLine=30408707;
 //BA.debugLineNum = 30408707;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.traceservice __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,String _debugresponsesdirvalue,int _traceloglimitvalue,int _serversnapshotlimitvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_debugresponsesdirvalue,_traceloglimitvalue,_serversnapshotlimitvalue}));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
__ref._debugresponsesdir /*String*/  = _debugresponsesdirvalue;
RDebugUtils.currentLine=30277635;
 //BA.debugLineNum = 30277635;BA.debugLine="traceLogLimit = traceLogLimitValue";
__ref._traceloglimit /*int*/  = _traceloglimitvalue;
RDebugUtils.currentLine=30277636;
 //BA.debugLineNum = 30277636;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
__ref._serversnapshotlimit /*int*/  = _serversnapshotlimitvalue;
RDebugUtils.currentLine=30277637;
 //BA.debugLineNum = 30277637;BA.debugLine="traceLogs.Initialize";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=30277638;
 //BA.debugLineNum = 30277638;BA.debugLine="pendingTraceBatch.Initialize";
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=30277639;
 //BA.debugLineNum = 30277639;BA.debugLine="serverSnapshots.Initialize";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=30277640;
 //BA.debugLineNum = 30277640;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Dim timestamp As String = DateTime.Date(DateTime.";
_timestamp = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="Dim header As String = timestamp & \" | \" & method";
_header = _timestamp+" | "+_method+" | success="+BA.ObjectToString(_success)+" | "+_url;
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="If errorMessage <> \"\" Then header = header & \" |";
if ((_errormessage).equals("") == false) { 
_header = _header+" | error="+_errormessage;};
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
RDebugUtils.currentLine=30670855;
 //BA.debugLineNum = 30670855;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
RDebugUtils.currentLine=30670856;
 //BA.debugLineNum = 30670856;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
RDebugUtils.currentLine=30670857;
 //BA.debugLineNum = 30670857;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
RDebugUtils.currentLine=30670858;
 //BA.debugLineNum = 30670858;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
RDebugUtils.currentLine=30670859;
 //BA.debugLineNum = 30670859;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
RDebugUtils.currentLine=30670860;
 //BA.debugLineNum = 30670860;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
RDebugUtils.currentLine=30670861;
 //BA.debugLineNum = 30670861;BA.debugLine="serverSnapshots.Add(entry)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry.getObject()));
RDebugUtils.currentLine=30670862;
 //BA.debugLineNum = 30670862;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=30670863;
 //BA.debugLineNum = 30670863;BA.debugLine="serverSnapshots.RemoveAt(0)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=30670865;
 //BA.debugLineNum = 30670865;BA.debugLine="WriteServerSnapshotFile(entry)";
__ref._writeserversnapshotfile /*String*/ (null,_entry);
RDebugUtils.currentLine=30670866;
 //BA.debugLineNum = 30670866;BA.debugLine="CleanupServerSnapshotFiles";
__ref._cleanupserversnapshotfiles /*String*/ (null);
RDebugUtils.currentLine=30670867;
 //BA.debugLineNum = 30670867;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
String _entry = "";
String _removedentry = "";
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Public Sub Trace(message As String)";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="Dim entry As String = DateTime.Date(DateTime.Now)";
_entry = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow())+" | "+_message;
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="traceLogs.Add(entry)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="Dim removedEntry As String = traceLogs.Get(0)";
_removedentry = BA.ObjectToString(__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="If pendingTraceBatch.IsInitialized And pendingTr";
if (__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="If pendingTraceBatch.Get(0) = removedEntry Then";
if ((__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))).equals((Object)(_removedentry))) { 
__ref._pendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
 }
;
RDebugUtils.currentLine=30343178;
 //BA.debugLineNum = 30343178;BA.debugLine="Log(entry)";
__c.LogImpl("530343178",_entry,0);
RDebugUtils.currentLine=30343179;
 //BA.debugLineNum = 30343179;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "clonelist", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Private Sub CloneList(source As List) As List";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=58130435;
 //BA.debugLineNum = 58130435;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
RDebugUtils.currentLine=58130437;
 //BA.debugLineNum = 58130437;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
RDebugUtils.currentLine=58130439;
 //BA.debugLineNum = 58130439;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=58130440;
 //BA.debugLineNum = 58130440;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="Private pendingTraceBatch As List";
_pendingtracebatch = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="Private traceLogLimit As Int";
_traceloglimit = 0;
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="Private serverSnapshotLimit As Int";
_serversnapshotlimit = 0;
RDebugUtils.currentLine=30212104;
 //BA.debugLineNum = 30212104;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Try";
try {RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(__ref._debugresponsesdir /*String*/ ,"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()<=__ref._serversnapshotlimit /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=30801925;
 //BA.debugLineNum = 30801925;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=30801927;
 //BA.debugLineNum = 30801927;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listedfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=30801928;
 //BA.debugLineNum = 30801928;BA.debugLine="files.Add(fileName)";
_files.Add((Object)(_filename));
 }
};
RDebugUtils.currentLine=30801930;
 //BA.debugLineNum = 30801930;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
RDebugUtils.currentLine=30801931;
 //BA.debugLineNum = 30801931;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=30801932;
 //BA.debugLineNum = 30801932;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=30801933;
 //BA.debugLineNum = 30801933;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(__ref._debugresponsesdir /*String*/ ,_filename);
RDebugUtils.currentLine=30801934;
 //BA.debugLineNum = 30801934;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=30801937;
 //BA.debugLineNum = 30801937;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
__ref._trace /*String*/ (null,"Не удалось очистить старые snapshots сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=30801939;
 //BA.debugLineNum = 30801939;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=30998535;
 //BA.debugLineNum = 30998535;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=30998536;
 //BA.debugLineNum = 30998536;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.traceservice __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=30867460;
 //BA.debugLineNum = 30867460;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=30932999;
 //BA.debugLineNum = 30932999;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=30933000;
 //BA.debugLineNum = 30933000;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Try";
try {RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="EnsureDirectory(debugResponsesDir)";
__ref._ensuredirectory /*String*/ (null,__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=30736388;
 //BA.debugLineNum = 30736388;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
RDebugUtils.currentLine=30736389;
 //BA.debugLineNum = 30736389;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
RDebugUtils.currentLine=30736390;
 //BA.debugLineNum = 30736390;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
RDebugUtils.currentLine=30736391;
 //BA.debugLineNum = 30736391;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=30736392;
 //BA.debugLineNum = 30736392;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(__ref._debugresponsesdir /*String*/ ,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=30736394;
 //BA.debugLineNum = 30736394;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
__ref._trace /*String*/ (null,"Не удалось записать snapshot сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=30736396;
 //BA.debugLineNum = 30736396;BA.debugLine="End Sub";
return "";
}
}