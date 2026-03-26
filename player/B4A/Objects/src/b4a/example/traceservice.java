package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class traceservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.traceservice");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.traceservice.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.collections.List  _beginpendingtracebatch() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub BeginPendingTraceBatch As List";
 //BA.debugLineNum = 79;BA.debugLine="pendingTraceBatch = CloneList(traceLogs)";
_pendingtracebatch = _clonelist(_tracelogs);
 //BA.debugLineNum = 80;BA.debugLine="Return CloneList(pendingTraceBatch)";
if (true) return _clonelist(_pendingtracebatch);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public String  _cancelpendingtracebatch() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub CancelPendingTraceBatch";
 //BA.debugLineNum = 95;BA.debugLine="If pendingTraceBatch.IsInitialized = False Then p";
if (_pendingtracebatch.IsInitialized()==__c.False) { 
_pendingtracebatch.Initialize();};
 //BA.debugLineNum = 96;BA.debugLine="pendingTraceBatch.Clear";
_pendingtracebatch.Clear();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private storageDir As String";
_storagedir = "";
 //BA.debugLineNum = 7;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
 //BA.debugLineNum = 8;BA.debugLine="Private traceLogs As List";
_tracelogs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Private debugLogs As List";
_debuglogs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private pendingTraceBatch As List";
_pendingtracebatch = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Private serverSnapshots As List";
_serversnapshots = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private traceLogLimit As Int";
_traceloglimit = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private serverSnapshotLimit As Int";
_serversnapshotlimit = 0;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _cleanupserversnapshotfiles() throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
 //BA.debugLineNum = 157;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
 //BA.debugLineNum = 158;BA.debugLine="Try";
try { //BA.debugLineNum = 159;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
if (__c.File.Exists(_debugresponsesdir,"")==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 160;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_debugresponsesdir);
 //BA.debugLineNum = 161;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()<=_serversnapshotlimit) { 
if (true) return "";};
 //BA.debugLineNum = 162;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 163;BA.debugLine="files.Initialize";
_files.Initialize();
 //BA.debugLineNum = 164;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group7 = _listedfiles;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 165;BA.debugLine="files.Add(fileName)";
_files.Add((Object)(_filename));
 }
};
 //BA.debugLineNum = 167;BA.debugLine="files.Sort(True)";
_files.Sort(__c.True);
 //BA.debugLineNum = 168;BA.debugLine="Do While files.Size > serverSnapshotLimit";
while (_files.getSize()>_serversnapshotlimit) {
 //BA.debugLineNum = 169;BA.debugLine="Dim fileName As String = files.Get(0)";
_filename = BA.ObjectToString(_files.Get((int) (0)));
 //BA.debugLineNum = 170;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
__c.File.Delete(_debugresponsesdir,_filename);
 //BA.debugLineNum = 171;BA.debugLine="files.RemoveAt(0)";
_files.RemoveAt((int) (0));
 }
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 174;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
_trace("Не удалось очистить старые snapshots сервера. "+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(anywheresoftware.b4a.objects.collections.List _source) throws Exception{
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
 //BA.debugLineNum = 204;BA.debugLine="Private Sub CloneList(source As List) As List";
 //BA.debugLineNum = 205;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 206;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 207;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
 //BA.debugLineNum = 208;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
 //BA.debugLineNum = 209;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
 //BA.debugLineNum = 211;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _copy = null;
Object _key = null;
 //BA.debugLineNum = 194;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
 //BA.debugLineNum = 195;BA.debugLine="Dim copy As Map";
_copy = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 196;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 197;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
 //BA.debugLineNum = 198;BA.debugLine="For Each key As Object In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 199;BA.debugLine="copy.Put(key, source.Get(key))";
_copy.Put(_key,_source.Get(_key));
 }
};
 //BA.debugLineNum = 201;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public String  _confirmpendingtracebatchsent() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub ConfirmPendingTraceBatchSent";
 //BA.debugLineNum = 85;BA.debugLine="If pendingTraceBatch.IsInitialized = False Or pen";
if (_pendingtracebatch.IsInitialized()==__c.False || _pendingtracebatch.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 86;BA.debugLine="Do While pendingTraceBatch.Size > 0 And traceLogs";
while (_pendingtracebatch.getSize()>0 && _tracelogs.getSize()>0) {
 //BA.debugLineNum = 87;BA.debugLine="If traceLogs.Get(0) <> pendingTraceBatch.Get(0)";
if ((_tracelogs.Get((int) (0))).equals(_pendingtracebatch.Get((int) (0))) == false) { 
if (true) break;};
 //BA.debugLineNum = 88;BA.debugLine="traceLogs.RemoveAt(0)";
_tracelogs.RemoveAt((int) (0));
 //BA.debugLineNum = 89;BA.debugLine="pendingTraceBatch.RemoveAt(0)";
_pendingtracebatch.RemoveAt((int) (0));
 }
;
 //BA.debugLineNum = 91;BA.debugLine="pendingTraceBatch.Clear";
_pendingtracebatch.Clear();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _jofile = null;
 //BA.debugLineNum = 178;BA.debugLine="Private Sub EnsureDirectory(path As String)";
 //BA.debugLineNum = 179;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 180;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 181;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrecentdebuglist(int _maxitems) throws Exception{
anywheresoftware.b4a.objects.collections.List _copy = null;
int _startindex = 0;
int _i = 0;
 //BA.debugLineNum = 66;BA.debugLine="Public Sub GetRecentDebugList(maxItems As Int) As";
 //BA.debugLineNum = 67;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 68;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 69;BA.debugLine="If debugLogs.IsInitialized = False Or debugLogs.S";
if (_debuglogs.IsInitialized()==__c.False || _debuglogs.getSize()==0) { 
if (true) return _copy;};
 //BA.debugLineNum = 70;BA.debugLine="Dim startIndex As Int = Max(0, debugLogs.Size - M";
_startindex = (int) (__c.Max(0,_debuglogs.getSize()-__c.Max(1,_maxitems)));
 //BA.debugLineNum = 71;BA.debugLine="For i = startIndex To debugLogs.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_debuglogs.getSize()-1);
_i = _startindex ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 72;BA.debugLine="copy.Add(debugLogs.Get(i))";
_copy.Add(_debuglogs.Get(_i));
 }
};
 //BA.debugLineNum = 74;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist() throws Exception{
anywheresoftware.b4a.objects.collections.List _copy = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 111;BA.debugLine="Public Sub GetServerTraceList As List";
 //BA.debugLineNum = 112;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 113;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 114;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
if (_serversnapshots.IsInitialized()==__c.False) { 
if (true) return _copy;};
 //BA.debugLineNum = 115;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _serversnapshots;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
 //BA.debugLineNum = 116;BA.debugLine="copy.Add(CloneMap(entry))";
_copy.Add((Object)(_clonemap(_entry).getObject()));
 }
};
 //BA.debugLineNum = 118;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext() throws Exception{
anywheresoftware.b4a.objects.collections.List _lines = null;
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 99;BA.debugLine="Public Sub GetServerTraceText As String";
 //BA.debugLineNum = 100;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
if (_serversnapshots.IsInitialized()==__c.False || _serversnapshots.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 101;BA.debugLine="Dim lines As List";
_lines = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 102;BA.debugLine="lines.Initialize";
_lines.Initialize();
 //BA.debugLineNum = 103;BA.debugLine="For Each entry As Map In serverSnapshots";
_entry = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _serversnapshots;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group4.Get(index4)));
 //BA.debugLineNum = 104;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Header"),(Object)("")));
 //BA.debugLineNum = 105;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
_lines.Add(_entry.GetDefault((Object)("Body"),(Object)("")));
 //BA.debugLineNum = 106;BA.debugLine="lines.Add(\"\")";
_lines.Add((Object)(""));
 }
};
 //BA.debugLineNum = 108;BA.debugLine="Return JoinList(lines, CRLF)";
if (true) return _joinlist(_lines,__c.CRLF);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettracelist() throws Exception{
anywheresoftware.b4a.objects.collections.List _copy = null;
String _entry = "";
 //BA.debugLineNum = 56;BA.debugLine="Public Sub GetTraceList As List";
 //BA.debugLineNum = 57;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 58;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
if (_tracelogs.IsInitialized()==__c.False) { 
if (true) return _copy;};
 //BA.debugLineNum = 60;BA.debugLine="For Each entry As String In traceLogs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tracelogs;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 61;BA.debugLine="copy.Add(entry)";
_copy.Add((Object)(_entry));
 }
};
 //BA.debugLineNum = 63;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public String  _gettracetext() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub GetTraceText As String";
 //BA.debugLineNum = 52;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
if (_tracelogs.IsInitialized()==__c.False || _tracelogs.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 53;BA.debugLine="Return JoinList(traceLogs, CRLF)";
if (true) return _joinlist(_tracelogs,__c.CRLF);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _storagedirvalue,String _debugresponsesdirvalue,int _traceloglimitvalue,int _serversnapshotlimitvalue) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
 //BA.debugLineNum = 17;BA.debugLine="storageDir = storageDirValue";
_storagedir = _storagedirvalue;
 //BA.debugLineNum = 18;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
_debugresponsesdir = _debugresponsesdirvalue;
 //BA.debugLineNum = 19;BA.debugLine="traceLogLimit = traceLogLimitValue";
_traceloglimit = _traceloglimitvalue;
 //BA.debugLineNum = 20;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
_serversnapshotlimit = _serversnapshotlimitvalue;
 //BA.debugLineNum = 21;BA.debugLine="traceLogs.Initialize";
_tracelogs.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="debugLogs.Initialize";
_debuglogs.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="pendingTraceBatch.Initialize";
_pendingtracebatch.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="serverSnapshots.Initialize";
_serversnapshots.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 184;BA.debugLine="Private Sub JoinList(items As List, separator As S";
 //BA.debugLineNum = 185;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 186;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 187;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 188;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
 //BA.debugLineNum = 189;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
 //BA.debugLineNum = 191;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
String _timestamp = "";
String _header = "";
anywheresoftware.b4a.objects.collections.Map _entry = null;
 //BA.debugLineNum = 122;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
 //BA.debugLineNum = 123;BA.debugLine="Dim timestamp As String = DateTime.Time(DateTime.";
_timestamp = __c.DateTime.Time(__c.DateTime.getNow());
 //BA.debugLineNum = 124;BA.debugLine="Dim header As String = timestamp & \" SNAPSHOT met";
_header = _timestamp+" SNAPSHOT method="+_method+" success="+BA.ObjectToString(_success)+" url="+_url;
 //BA.debugLineNum = 125;BA.debugLine="If errorMessage <> \"\" Then header = header & \" er";
if ((_errormessage).equals("") == false) { 
_header = _header+" error="+_errormessage;};
 //BA.debugLineNum = 126;BA.debugLine="Dim entry As Map";
_entry = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 127;BA.debugLine="entry.Initialize";
_entry.Initialize();
 //BA.debugLineNum = 128;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
_entry.Put((Object)("Timestamp"),(Object)(_timestamp));
 //BA.debugLineNum = 129;BA.debugLine="entry.Put(\"Method\", method)";
_entry.Put((Object)("Method"),(Object)(_method));
 //BA.debugLineNum = 130;BA.debugLine="entry.Put(\"Url\", url)";
_entry.Put((Object)("Url"),(Object)(_url));
 //BA.debugLineNum = 131;BA.debugLine="entry.Put(\"Success\", success)";
_entry.Put((Object)("Success"),(Object)(_success));
 //BA.debugLineNum = 132;BA.debugLine="entry.Put(\"Error\", errorMessage)";
_entry.Put((Object)("Error"),(Object)(_errormessage));
 //BA.debugLineNum = 133;BA.debugLine="entry.Put(\"Body\", body)";
_entry.Put((Object)("Body"),(Object)(_body));
 //BA.debugLineNum = 134;BA.debugLine="entry.Put(\"Header\", header)";
_entry.Put((Object)("Header"),(Object)(_header));
 //BA.debugLineNum = 135;BA.debugLine="serverSnapshots.Add(entry)";
_serversnapshots.Add((Object)(_entry.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
while (_serversnapshots.getSize()>_serversnapshotlimit) {
 //BA.debugLineNum = 137;BA.debugLine="serverSnapshots.RemoveAt(0)";
_serversnapshots.RemoveAt((int) (0));
 }
;
 //BA.debugLineNum = 139;BA.debugLine="WriteServerSnapshotFile(entry)";
_writeserversnapshotfile(_entry);
 //BA.debugLineNum = 140;BA.debugLine="CleanupServerSnapshotFiles";
_cleanupserversnapshotfiles();
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _trace(String _message) throws Exception{
String _entry = "";
String _removedentry = "";
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Trace(message As String)";
 //BA.debugLineNum = 29;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" "+_message;
 //BA.debugLineNum = 30;BA.debugLine="traceLogs.Add(entry)";
_tracelogs.Add((Object)(_entry));
 //BA.debugLineNum = 31;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
while (_tracelogs.getSize()>_traceloglimit) {
 //BA.debugLineNum = 32;BA.debugLine="Dim removedEntry As String = traceLogs.Get(0)";
_removedentry = BA.ObjectToString(_tracelogs.Get((int) (0)));
 //BA.debugLineNum = 33;BA.debugLine="traceLogs.RemoveAt(0)";
_tracelogs.RemoveAt((int) (0));
 //BA.debugLineNum = 34;BA.debugLine="If pendingTraceBatch.IsInitialized And pendingTr";
if (_pendingtracebatch.IsInitialized() && _pendingtracebatch.getSize()>0) { 
 //BA.debugLineNum = 35;BA.debugLine="If pendingTraceBatch.Get(0) = removedEntry Then";
if ((_pendingtracebatch.Get((int) (0))).equals((Object)(_removedentry))) { 
_pendingtracebatch.RemoveAt((int) (0));};
 };
 }
;
 //BA.debugLineNum = 38;BA.debugLine="Log(entry)";
__c.LogImpl("377987850",_entry,0);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _tracedebug(String _message) throws Exception{
String _entry = "";
 //BA.debugLineNum = 42;BA.debugLine="Public Sub TraceDebug(message As String)";
 //BA.debugLineNum = 43;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
_entry = __c.DateTime.Time(__c.DateTime.getNow())+" DEBUG "+_message;
 //BA.debugLineNum = 44;BA.debugLine="debugLogs.Add(entry)";
_debuglogs.Add((Object)(_entry));
 //BA.debugLineNum = 45;BA.debugLine="Do While debugLogs.Size > traceLogLimit";
while (_debuglogs.getSize()>_traceloglimit) {
 //BA.debugLineNum = 46;BA.debugLine="debugLogs.RemoveAt(0)";
_debuglogs.RemoveAt((int) (0));
 }
;
 //BA.debugLineNum = 48;BA.debugLine="Log(entry)";
__c.LogImpl("378053382",_entry,0);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _writeserversnapshotfile(anywheresoftware.b4a.objects.collections.Map _entry) throws Exception{
String _stamp = "";
String _name = "";
String _text = "";
 //BA.debugLineNum = 143;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
 //BA.debugLineNum = 144;BA.debugLine="Try";
try { //BA.debugLineNum = 145;BA.debugLine="EnsureDirectory(storageDir)";
_ensuredirectory(_storagedir);
 //BA.debugLineNum = 146;BA.debugLine="EnsureDirectory(debugResponsesDir)";
_ensuredirectory(_debugresponsesdir);
 //BA.debugLineNum = 147;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
_stamp = __c.Regex.Replace("[^0-9]",BA.ObjectToString(_entry.GetDefault((Object)("Timestamp"),(Object)(""))),"");
 //BA.debugLineNum = 148;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
if ((_stamp).equals("")) { 
_stamp = ""+BA.NumberToString(__c.DateTime.getNow());};
 //BA.debugLineNum = 149;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
_name = _stamp+"_"+BA.ObjectToString(_entry.GetDefault((Object)("Method"),(Object)("REQ")))+".txt";
 //BA.debugLineNum = 150;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
_text = BA.ObjectToString(_entry.GetDefault((Object)("Header"),(Object)("")))+__c.CRLF+__c.CRLF+BA.ObjectToString(_entry.GetDefault((Object)("Body"),(Object)("")));
 //BA.debugLineNum = 151;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
__c.File.WriteString(_debugresponsesdir,_name,_text);
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 153;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
_trace("Не удалось записать snapshot сервера. "+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
