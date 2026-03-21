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
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_entry).getObject()));
 }
};
RDebugUtils.currentLine=35520519;
 //BA.debugLineNum = 35520519;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="lines.Initialize";
_lines.Initialize();
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=35454983;
 //BA.debugLineNum = 35454983;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
RDebugUtils.currentLine=35454985;
 //BA.debugLineNum = 35454985;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,_lines,__c.CRLF);
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettracelist(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettracelist", null));}
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub GetTraceList As List";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="End Sub";
return null;
}
public String  _gettracetext(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "gettracetext", false))
	 {return ((String) Debug.delegate(ba, "gettracetext", null));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub GetTraceText As String";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return __ref._joinlist /*String*/ (null,__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ ,__c.CRLF);
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.traceservice __ref,anywheresoftware.b4a.BA _ba,String _storagedirvalue,String _debugresponsesdirvalue,int _traceloglimitvalue,int _serversnapshotlimitvalue) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_storagedirvalue,_debugresponsesdirvalue,_traceloglimitvalue,_serversnapshotlimitvalue}));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="storageDir = storageDirValue";
__ref._storagedir /*String*/  = _storagedirvalue;
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
__ref._debugresponsesdir /*String*/  = _debugresponsesdirvalue;
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="traceLogLimit = traceLogLimitValue";
__ref._traceloglimit /*int*/  = _traceloglimitvalue;
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
__ref._serversnapshotlimit /*int*/  = _serversnapshotlimitvalue;
RDebugUtils.currentLine=35192837;
 //BA.debugLineNum = 35192837;BA.debugLine="traceLogs.Initialize";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=35192838;
 //BA.debugLineNum = 35192838;BA.debugLine="serverSnapshots.Initialize";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Dim timestamp As String = DateTime.Date(DateTime.";
_timestamp = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow());
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="Dim header As String = timestamp & \" | \" & method";
_header = _timestamp+" | "+_method+" | success="+BA.ObjectToString(_success)+" | "+_url;
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="If errorMessage <> \"\" Then header = header & \" |";
if ((_errormessage).equals("") == false) { 
_header = _header+" | error="+_errormessage;};
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35586053;
 //BA.debugLineNum = 35586053;BA.debugLine="entry.Initialize";
_entry.Initialize();
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
RDebugUtils.currentLine=35586055;
 //BA.debugLineNum = 35586055;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
RDebugUtils.currentLine=35586056;
 //BA.debugLineNum = 35586056;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
RDebugUtils.currentLine=35586057;
 //BA.debugLineNum = 35586057;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
RDebugUtils.currentLine=35586058;
 //BA.debugLineNum = 35586058;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
RDebugUtils.currentLine=35586059;
 //BA.debugLineNum = 35586059;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
RDebugUtils.currentLine=35586060;
 //BA.debugLineNum = 35586060;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
RDebugUtils.currentLine=35586061;
 //BA.debugLineNum = 35586061;BA.debugLine="serverSnapshots.Add(entry)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry.getObject()));
RDebugUtils.currentLine=35586062;
 //BA.debugLineNum = 35586062;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=35586063;
 //BA.debugLineNum = 35586063;BA.debugLine="serverSnapshots.RemoveAt(0)";
__ref._serversnapshots /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=35586065;
 //BA.debugLineNum = 35586065;BA.debugLine="WriteServerSnapshotFile(entry)";
__ref._writeserversnapshotfile /*String*/ (null,_entry);
RDebugUtils.currentLine=35586066;
 //BA.debugLineNum = 35586066;BA.debugLine="CleanupServerSnapshotFiles";
__ref._cleanupserversnapshotfiles /*String*/ (null);
RDebugUtils.currentLine=35586067;
 //BA.debugLineNum = 35586067;BA.debugLine="End Sub";
return "";
}
public String  _trace(b4j.example.traceservice __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "trace", false))
	 {return ((String) Debug.delegate(ba, "trace", new Object[] {_message}));}
String _entry = "";
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub Trace(message As String)";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Dim entry As String = DateTime.Date(DateTime.Now)";
_entry = __c.DateTime.Date(__c.DateTime.getNow())+" "+__c.DateTime.Time(__c.DateTime.getNow())+" | "+_message;
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="traceLogs.Add(entry)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_entry));
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>__ref._traceloglimit /*int*/ ) {
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="traceLogs.RemoveAt(0)";
__ref._tracelogs /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
 }
;
RDebugUtils.currentLine=35258374;
 //BA.debugLineNum = 35258374;BA.debugLine="Log(entry)";
__c.LogImpl("435258374",_entry,0);
RDebugUtils.currentLine=35258375;
 //BA.debugLineNum = 35258375;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.traceservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=35127299;
 //BA.debugLineNum = 35127299;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35127300;
 //BA.debugLineNum = 35127300;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35127301;
 //BA.debugLineNum = 35127301;BA.debugLine="Private traceLogLimit As Int";
_traceloglimit = 0;
RDebugUtils.currentLine=35127302;
 //BA.debugLineNum = 35127302;BA.debugLine="Private serverSnapshotLimit As Int";
_serversnapshotlimit = 0;
RDebugUtils.currentLine=35127303;
 //BA.debugLineNum = 35127303;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Try";
try {RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(__ref._debugresponsesdir /*String*/ ,"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()<=__ref._serversnapshotlimit /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listedfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="files.Add(fileName)";
_files.Add((Object)(_filename));
 }
};
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>__ref._serversnapshotlimit /*int*/ ) {
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
RDebugUtils.currentLine=35717133;
 //BA.debugLineNum = 35717133;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(__ref._debugresponsesdir /*String*/ ,_filename);
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=35717137;
 //BA.debugLineNum = 35717137;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
__ref._trace /*String*/ (null,"Не удалось очистить старые snapshots сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=35717139;
 //BA.debugLineNum = 35717139;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=35913736;
 //BA.debugLineNum = 35913736;BA.debugLine="End Sub";
return null;
}
public String  _ensuredirectory(b4j.example.traceservice __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.traceservice __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="traceservice";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=35848199;
 //BA.debugLineNum = 35848199;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=35848200;
 //BA.debugLineNum = 35848200;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Try";
try {RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="EnsureDirectory(debugResponsesDir)";
__ref._ensuredirectory /*String*/ (null,__ref._debugresponsesdir /*String*/ );
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(__ref._debugresponsesdir /*String*/ ,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
__ref._trace /*String*/ (null,"Не удалось записать snapshot сервера. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=35651596;
 //BA.debugLineNum = 35651596;BA.debugLine="End Sub";
return "";
}
}