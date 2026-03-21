package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class traceservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private storageDir As String";
traceservice._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",traceservice._storagedir);
 //BA.debugLineNum = 4;BA.debugLine="Private debugResponsesDir As String";
traceservice._debugresponsesdir = RemoteObject.createImmutable("");__ref.setField("_debugresponsesdir",traceservice._debugresponsesdir);
 //BA.debugLineNum = 5;BA.debugLine="Private traceLogs As List";
traceservice._tracelogs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tracelogs",traceservice._tracelogs);
 //BA.debugLineNum = 6;BA.debugLine="Private serverSnapshots As List";
traceservice._serversnapshots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_serversnapshots",traceservice._serversnapshots);
 //BA.debugLineNum = 7;BA.debugLine="Private traceLogLimit As Int";
traceservice._traceloglimit = RemoteObject.createImmutable(0);__ref.setField("_traceloglimit",traceservice._traceloglimit);
 //BA.debugLineNum = 8;BA.debugLine="Private serverSnapshotLimit As Int";
traceservice._serversnapshotlimit = RemoteObject.createImmutable(0);__ref.setField("_serversnapshotlimit",traceservice._serversnapshotlimit);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleanupserversnapshotfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CleanupServerSnapshotFiles (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("cleanupserversnapshotfiles")) { return __ref.runUserSub(false, "traceservice","cleanupserversnapshotfiles", __ref);}
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 101;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 103;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",traceservice.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))),traceservice.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 104;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
Debug.ShouldStop(128);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = traceservice.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )));Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 105;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("k",_listedfiles.runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_serversnapshotlimit" /*RemoteObject*/ )))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 106;BA.debugLine="Dim files As List";
Debug.ShouldStop(512);
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 107;BA.debugLine="files.Initialize";
Debug.ShouldStop(1024);
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 108;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(2048);
{
final RemoteObject group7 = _listedfiles;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 109;BA.debugLine="files.Add(fileName)";
Debug.ShouldStop(4096);
_files.runVoidMethod ("Add",(Object)((_filename)));
 }
}Debug.locals.put("fileName", _filename);
;
 BA.debugLineNum = 111;BA.debugLine="files.Sort(True)";
Debug.ShouldStop(16384);
_files.runVoidMethod ("Sort",(Object)(traceservice.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="Do While files.Size > serverSnapshotLimit";
Debug.ShouldStop(32768);
while (RemoteObject.solveBoolean(">",_files.runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_serversnapshotlimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 113;BA.debugLine="Dim fileName As String = files.Get(0)";
Debug.ShouldStop(65536);
_filename = BA.ObjectToString(_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 114;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
Debug.ShouldStop(131072);
traceservice.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )),(Object)(_filename));
 BA.debugLineNum = 115;BA.debugLine="files.RemoveAt(0)";
Debug.ShouldStop(262144);
_files.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 118;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.traceservice.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось очистить старые snapshots сервера. "),traceservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "traceservice","clonemap", __ref, _source);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 138;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Dim copy As Map";
Debug.ShouldStop(1024);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 140;BA.debugLine="copy.Initialize";
Debug.ShouldStop(2048);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 141;BA.debugLine="If source.IsInitialized = False Then Return copy";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 142;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(8192);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 143;BA.debugLine="copy.Put(key, source.Get(key))";
Debug.ShouldStop(16384);
_copy.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 145;BA.debugLine="Return copy";
Debug.ShouldStop(65536);
if (true) return _copy;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuredirectory(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("EnsureDirectory (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "traceservice","ensuredirectory", __ref, _path);}
RemoteObject _jofile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 122;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim joFile As JavaObject";
Debug.ShouldStop(67108864);
_jofile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joFile", _jofile);
 BA.debugLineNum = 124;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
Debug.ShouldStop(134217728);
_jofile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 125;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(268435456);
_jofile.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((traceservice.__c.getField(false,"Null"))));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getservertracelist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetServerTraceList (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("getservertracelist")) { return __ref.runUserSub(false, "traceservice","getservertracelist", __ref);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 56;BA.debugLine="Public Sub GetServerTraceList As List";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim copy As List";
Debug.ShouldStop(16777216);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 58;BA.debugLine="copy.Initialize";
Debug.ShouldStop(33554432);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 60;BA.debugLine="For Each entry As Map In serverSnapshots";
Debug.ShouldStop(134217728);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = __ref.getField(false,"_serversnapshots" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group4.runMethod(false,"Get",index4));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 61;BA.debugLine="copy.Add(CloneMap(entry))";
Debug.ShouldStop(268435456);
_copy.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.traceservice.class, "_clonemap" /*RemoteObject*/ ,(Object)(_entry)).getObject())));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 63;BA.debugLine="Return copy";
Debug.ShouldStop(1073741824);
if (true) return _copy;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getservertracetext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetServerTraceText (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("getservertracetext")) { return __ref.runUserSub(false, "traceservice","getservertracetext", __ref);}
RemoteObject _lines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 44;BA.debugLine="Public Sub GetServerTraceText As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 46;BA.debugLine="Dim lines As List";
Debug.ShouldStop(8192);
_lines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lines", _lines);
 BA.debugLineNum = 47;BA.debugLine="lines.Initialize";
Debug.ShouldStop(16384);
_lines.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="For Each entry As Map In serverSnapshots";
Debug.ShouldStop(32768);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = __ref.getField(false,"_serversnapshots" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group4.runMethod(false,"Get",index4));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 49;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
Debug.ShouldStop(65536);
_lines.runVoidMethod ("Add",(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 50;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
Debug.ShouldStop(131072);
_lines.runVoidMethod ("Add",(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Body"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 51;BA.debugLine="lines.Add(\"\")";
Debug.ShouldStop(262144);
_lines.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 53;BA.debugLine="Return JoinList(lines, CRLF)";
Debug.ShouldStop(1048576);
if (true) return __ref.runClassMethod (b4j.example.traceservice.class, "_joinlist" /*RemoteObject*/ ,(Object)(_lines),(Object)(traceservice.__c.getField(true,"CRLF")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettracelist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTraceList (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("gettracelist")) { return __ref.runUserSub(false, "traceservice","gettracelist", __ref);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.createImmutable("");
 BA.debugLineNum = 34;BA.debugLine="Public Sub GetTraceList As List";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim copy As List";
Debug.ShouldStop(4);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 36;BA.debugLine="copy.Initialize";
Debug.ShouldStop(8);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 38;BA.debugLine="For Each entry As String In traceLogs";
Debug.ShouldStop(32);
{
final RemoteObject group4 = __ref.getField(false,"_tracelogs" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 39;BA.debugLine="copy.Add(entry)";
Debug.ShouldStop(64);
_copy.runVoidMethod ("Add",(Object)((_entry)));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 41;BA.debugLine="Return copy";
Debug.ShouldStop(256);
if (true) return _copy;
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettracetext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTraceText (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("gettracetext")) { return __ref.runUserSub(false, "traceservice","gettracetext", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Public Sub GetTraceText As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 31;BA.debugLine="Return JoinList(traceLogs, CRLF)";
Debug.ShouldStop(1073741824);
if (true) return __ref.runClassMethod (b4j.example.traceservice.class, "_joinlist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tracelogs" /*RemoteObject*/ )),(Object)(traceservice.__c.getField(true,"CRLF")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _debugresponsesdirvalue,RemoteObject _traceloglimitvalue,RemoteObject _serversnapshotlimitvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "traceservice","initialize", __ref, _ba, _storagedirvalue, _debugresponsesdirvalue, _traceloglimitvalue, _serversnapshotlimitvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("debugResponsesDirValue", _debugresponsesdirvalue);
Debug.locals.put("traceLogLimitValue", _traceloglimitvalue);
Debug.locals.put("serverSnapshotLimitValue", _serversnapshotlimitvalue);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(2048);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 13;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
Debug.ShouldStop(4096);
__ref.setField ("_debugresponsesdir" /*RemoteObject*/ ,_debugresponsesdirvalue);
 BA.debugLineNum = 14;BA.debugLine="traceLogLimit = traceLogLimitValue";
Debug.ShouldStop(8192);
__ref.setField ("_traceloglimit" /*RemoteObject*/ ,_traceloglimitvalue);
 BA.debugLineNum = 15;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
Debug.ShouldStop(16384);
__ref.setField ("_serversnapshotlimit" /*RemoteObject*/ ,_serversnapshotlimitvalue);
 BA.debugLineNum = 16;BA.debugLine="traceLogs.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="serverSnapshots.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlist(RemoteObject __ref,RemoteObject _items,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("JoinList (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "traceservice","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 128;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 130;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 131;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(4);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 133;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 135;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(64);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveserversnapshot(RemoteObject __ref,RemoteObject _method,RemoteObject _url,RemoteObject _success,RemoteObject _body,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("SaveServerSnapshot (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("saveserversnapshot")) { return __ref.runUserSub(false, "traceservice","saveserversnapshot", __ref, _method, _url, _success, _body, _errormessage);}
RemoteObject _timestamp = RemoteObject.createImmutable("");
RemoteObject _header = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("method", _method);
Debug.locals.put("url", _url);
Debug.locals.put("success", _success);
Debug.locals.put("body", _body);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 66;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim timestamp As String = DateTime.Date(DateTime.";
Debug.ShouldStop(4);
_timestamp = RemoteObject.concat(traceservice.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),traceservice.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"))));Debug.locals.put("timestamp", _timestamp);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 68;BA.debugLine="Dim header As String = timestamp & \" | \" & method";
Debug.ShouldStop(8);
_header = RemoteObject.concat(_timestamp,RemoteObject.createImmutable(" | "),_method,RemoteObject.createImmutable(" | success="),_success,RemoteObject.createImmutable(" | "),_url);Debug.locals.put("header", _header);Debug.locals.put("header", _header);
 BA.debugLineNum = 69;BA.debugLine="If errorMessage <> \"\" Then header = header & \" |";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_errormessage,BA.ObjectToString(""))) { 
_header = RemoteObject.concat(_header,RemoteObject.createImmutable(" | error="),_errormessage);Debug.locals.put("header", _header);};
 BA.debugLineNum = 70;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(32);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 71;BA.debugLine="entry.Initialize";
Debug.ShouldStop(64);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
Debug.ShouldStop(128);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Timestamp"))),(Object)((_timestamp)));
 BA.debugLineNum = 73;BA.debugLine="entry.Put(\"Method\", method)";
Debug.ShouldStop(256);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Method"))),(Object)((_method)));
 BA.debugLineNum = 74;BA.debugLine="entry.Put(\"Url\", url)";
Debug.ShouldStop(512);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Url"))),(Object)((_url)));
 BA.debugLineNum = 75;BA.debugLine="entry.Put(\"Success\", success)";
Debug.ShouldStop(1024);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((_success)));
 BA.debugLineNum = 76;BA.debugLine="entry.Put(\"Error\", errorMessage)";
Debug.ShouldStop(2048);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_errormessage)));
 BA.debugLineNum = 77;BA.debugLine="entry.Put(\"Body\", body)";
Debug.ShouldStop(4096);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Body"))),(Object)((_body)));
 BA.debugLineNum = 78;BA.debugLine="entry.Put(\"Header\", header)";
Debug.ShouldStop(8192);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((_header)));
 BA.debugLineNum = 79;BA.debugLine="serverSnapshots.Add(entry)";
Debug.ShouldStop(16384);
__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_entry.getObject())));
 BA.debugLineNum = 80;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
Debug.ShouldStop(32768);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_serversnapshotlimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 81;BA.debugLine="serverSnapshots.RemoveAt(0)";
Debug.ShouldStop(65536);
__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 83;BA.debugLine="WriteServerSnapshotFile(entry)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.traceservice.class, "_writeserversnapshotfile" /*RemoteObject*/ ,(Object)(_entry));
 BA.debugLineNum = 84;BA.debugLine="CleanupServerSnapshotFiles";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.traceservice.class, "_cleanupserversnapshotfiles" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trace(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("Trace (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "traceservice","trace", __ref, _message);}
RemoteObject _entry = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Trace(message As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Dim entry As String = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(1048576);
_entry = RemoteObject.concat(traceservice.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),traceservice.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" | "),_message);Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 22;BA.debugLine="traceLogs.Add(entry)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_entry)));
 BA.debugLineNum = 23;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
Debug.ShouldStop(4194304);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_traceloglimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 24;BA.debugLine="traceLogs.RemoveAt(0)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 26;BA.debugLine="Log(entry)";
Debug.ShouldStop(33554432);
traceservice.__c.runVoidMethod ("LogImpl","435258374",_entry,0);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeserversnapshotfile(RemoteObject __ref,RemoteObject _entry) throws Exception{
try {
		Debug.PushSubsStack("WriteServerSnapshotFile (traceservice) ","traceservice",6,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("writeserversnapshotfile")) { return __ref.runUserSub(false, "traceservice","writeserversnapshotfile", __ref, _entry);}
RemoteObject _stamp = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _text = RemoteObject.createImmutable("");
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 87;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 89;BA.debugLine="EnsureDirectory(storageDir)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.traceservice.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )));
 BA.debugLineNum = 90;BA.debugLine="EnsureDirectory(debugResponsesDir)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.traceservice.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )));
 BA.debugLineNum = 91;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
Debug.ShouldStop(67108864);
_stamp = traceservice.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^0-9]")),(Object)(BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Timestamp"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("stamp", _stamp);Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 92;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_stamp,BA.ObjectToString(""))) { 
_stamp = RemoteObject.concat(RemoteObject.createImmutable(""),traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"));Debug.locals.put("stamp", _stamp);};
 BA.debugLineNum = 93;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
Debug.ShouldStop(268435456);
_name = RemoteObject.concat(_stamp,RemoteObject.createImmutable("_"),_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Method"))),(Object)((RemoteObject.createImmutable("REQ")))),RemoteObject.createImmutable(".txt"));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 94;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
Debug.ShouldStop(536870912);
_text = RemoteObject.concat(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((RemoteObject.createImmutable("")))),traceservice.__c.getField(true,"CRLF"),traceservice.__c.getField(true,"CRLF"),_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Body"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 95;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
Debug.ShouldStop(1073741824);
traceservice.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )),(Object)(_name),(Object)(_text));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 97;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.traceservice.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось записать snapshot сервера. "),traceservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}