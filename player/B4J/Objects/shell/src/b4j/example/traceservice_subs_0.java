package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class traceservice_subs_0 {


public static RemoteObject  _beginpendingtracebatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BeginPendingTraceBatch (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("beginpendingtracebatch")) { return __ref.runUserSub(false, "traceservice","beginpendingtracebatch", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub BeginPendingTraceBatch As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="pendingTraceBatch = CloneList(traceLogs)";
Debug.ShouldStop(16384);
__ref.setField ("_pendingtracebatch" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.traceservice.class, "_clonelist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tracelogs" /*RemoteObject*/ ))));
 BA.debugLineNum = 80;BA.debugLine="Return CloneList(pendingTraceBatch)";
Debug.ShouldStop(32768);
if (true) return __ref.runClassMethod (b4j.example.traceservice.class, "_clonelist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancelpendingtracebatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CancelPendingTraceBatch (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("cancelpendingtracebatch")) { return __ref.runUserSub(false, "traceservice","cancelpendingtracebatch", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Public Sub CancelPendingTraceBatch";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If pendingTraceBatch.IsInitialized = False Then p";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 96;BA.debugLine="pendingTraceBatch.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private storageDir As String";
traceservice._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",traceservice._storagedir);
 //BA.debugLineNum = 7;BA.debugLine="Private debugResponsesDir As String";
traceservice._debugresponsesdir = RemoteObject.createImmutable("");__ref.setField("_debugresponsesdir",traceservice._debugresponsesdir);
 //BA.debugLineNum = 8;BA.debugLine="Private traceLogs As List";
traceservice._tracelogs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tracelogs",traceservice._tracelogs);
 //BA.debugLineNum = 9;BA.debugLine="Private debugLogs As List";
traceservice._debuglogs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_debuglogs",traceservice._debuglogs);
 //BA.debugLineNum = 10;BA.debugLine="Private pendingTraceBatch As List";
traceservice._pendingtracebatch = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_pendingtracebatch",traceservice._pendingtracebatch);
 //BA.debugLineNum = 11;BA.debugLine="Private serverSnapshots As List";
traceservice._serversnapshots = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_serversnapshots",traceservice._serversnapshots);
 //BA.debugLineNum = 12;BA.debugLine="Private traceLogLimit As Int";
traceservice._traceloglimit = RemoteObject.createImmutable(0);__ref.setField("_traceloglimit",traceservice._traceloglimit);
 //BA.debugLineNum = 13;BA.debugLine="Private serverSnapshotLimit As Int";
traceservice._serversnapshotlimit = RemoteObject.createImmutable(0);__ref.setField("_serversnapshotlimit",traceservice._serversnapshotlimit);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleanupserversnapshotfiles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CleanupServerSnapshotFiles (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("cleanupserversnapshotfiles")) { return __ref.runUserSub(false, "traceservice","cleanupserversnapshotfiles", __ref);}
RemoteObject _listedfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
 BA.debugLineNum = 157;BA.debugLine="Private Sub CleanupServerSnapshotFiles";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 159;BA.debugLine="If File.Exists(debugResponsesDir, \"\") = False Th";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",traceservice.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))),traceservice.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 160;BA.debugLine="Dim listedFiles As List = File.ListFiles(debugRe";
Debug.ShouldStop(-2147483648);
_listedfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listedfiles = traceservice.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )));Debug.locals.put("listedFiles", _listedfiles);Debug.locals.put("listedFiles", _listedfiles);
 BA.debugLineNum = 161;BA.debugLine="If listedFiles.IsInitialized = False Or listedFi";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_listedfiles.runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("k",_listedfiles.runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_serversnapshotlimit" /*RemoteObject*/ )))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 162;BA.debugLine="Dim files As List";
Debug.ShouldStop(2);
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 163;BA.debugLine="files.Initialize";
Debug.ShouldStop(4);
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 164;BA.debugLine="For Each fileName As String In listedFiles";
Debug.ShouldStop(8);
{
final RemoteObject group7 = _listedfiles;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_filename = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("fileName", _filename);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 165;BA.debugLine="files.Add(fileName)";
Debug.ShouldStop(16);
_files.runVoidMethod ("Add",(Object)((_filename)));
 }
}Debug.locals.put("fileName", _filename);
;
 BA.debugLineNum = 167;BA.debugLine="files.Sort(True)";
Debug.ShouldStop(64);
_files.runVoidMethod ("Sort",(Object)(traceservice.__c.getField(true,"True")));
 BA.debugLineNum = 168;BA.debugLine="Do While files.Size > serverSnapshotLimit";
Debug.ShouldStop(128);
while (RemoteObject.solveBoolean(">",_files.runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_serversnapshotlimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 169;BA.debugLine="Dim fileName As String = files.Get(0)";
Debug.ShouldStop(256);
_filename = BA.ObjectToString(_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 170;BA.debugLine="File.Delete(debugResponsesDir, fileName)";
Debug.ShouldStop(512);
traceservice.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )),(Object)(_filename));
 BA.debugLineNum = 171;BA.debugLine="files.RemoveAt(0)";
Debug.ShouldStop(1024);
_files.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 174;BA.debugLine="Trace(\"Не удалось очистить старые snapshots серв";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.traceservice.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось очистить старые snapshots сервера. "),traceservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clonelist(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneList (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("clonelist")) { return __ref.runUserSub(false, "traceservice","clonelist", __ref, _source);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 204;BA.debugLine="Private Sub CloneList(source As List) As List";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Dim copy As List";
Debug.ShouldStop(4096);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 206;BA.debugLine="copy.Initialize";
Debug.ShouldStop(8192);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 207;BA.debugLine="If source.IsInitialized = False Then Return copy";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 208;BA.debugLine="For Each item As Object In source";
Debug.ShouldStop(32768);
{
final RemoteObject group4 = _source;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.runMethod(false,"Get",index4);Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 209;BA.debugLine="copy.Add(item)";
Debug.ShouldStop(65536);
_copy.runVoidMethod ("Add",(Object)(_item));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 211;BA.debugLine="Return copy";
Debug.ShouldStop(262144);
if (true) return _copy;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "traceservice","clonemap", __ref, _source);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 194;BA.debugLine="Private Sub CloneMap(source As Map) As Map";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Dim copy As Map";
Debug.ShouldStop(4);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 196;BA.debugLine="copy.Initialize";
Debug.ShouldStop(8);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 197;BA.debugLine="If source.IsInitialized = False Then Return copy";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 198;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(32);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 199;BA.debugLine="copy.Put(key, source.Get(key))";
Debug.ShouldStop(64);
_copy.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 201;BA.debugLine="Return copy";
Debug.ShouldStop(256);
if (true) return _copy;
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _confirmpendingtracebatchsent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfirmPendingTraceBatchSent (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("confirmpendingtracebatchsent")) { return __ref.runUserSub(false, "traceservice","confirmpendingtracebatchsent", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Public Sub ConfirmPendingTraceBatchSent";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="If pendingTraceBatch.IsInitialized = False Or pen";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 86;BA.debugLine="Do While pendingTraceBatch.Size > 0 And traceLogs";
Debug.ShouldStop(2097152);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 87;BA.debugLine="If traceLogs.Get(0) <> pendingTraceBatch.Get(0)";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))) { 
if (true) break;};
 BA.debugLineNum = 88;BA.debugLine="traceLogs.RemoveAt(0)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 89;BA.debugLine="pendingTraceBatch.RemoveAt(0)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 91;BA.debugLine="pendingTraceBatch.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuredirectory(RemoteObject __ref,RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("EnsureDirectory (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("ensuredirectory")) { return __ref.runUserSub(false, "traceservice","ensuredirectory", __ref, _path);}
RemoteObject _jofile = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("path", _path);
 BA.debugLineNum = 178;BA.debugLine="Private Sub EnsureDirectory(path As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Dim joFile As JavaObject";
Debug.ShouldStop(262144);
_jofile = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joFile", _jofile);
 BA.debugLineNum = 180;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
Debug.ShouldStop(524288);
_jofile.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_path)})));
 BA.debugLineNum = 181;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
Debug.ShouldStop(1048576);
_jofile.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("mkdirs")),(Object)((traceservice.__c.getField(false,"Null"))));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrecentdebuglist(RemoteObject __ref,RemoteObject _maxitems) throws Exception{
try {
		Debug.PushSubsStack("GetRecentDebugList (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("getrecentdebuglist")) { return __ref.runUserSub(false, "traceservice","getrecentdebuglist", __ref, _maxitems);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _startindex = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("maxItems", _maxitems);
 BA.debugLineNum = 66;BA.debugLine="Public Sub GetRecentDebugList(maxItems As Int) As";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim copy As List";
Debug.ShouldStop(4);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 68;BA.debugLine="copy.Initialize";
Debug.ShouldStop(8);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="If debugLogs.IsInitialized = False Or debugLogs.S";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _copy;};
 BA.debugLineNum = 70;BA.debugLine="Dim startIndex As Int = Max(0, debugLogs.Size - M";
Debug.ShouldStop(32);
_startindex = BA.numberCast(int.class, traceservice.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runMethod(true,"getSize"),traceservice.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _maxitems)))}, "-",1, 0))));Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 71;BA.debugLine="For i = startIndex To debugLogs.Size - 1";
Debug.ShouldStop(64);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _startindex.<Integer>get().intValue() ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="copy.Add(debugLogs.Get(i))";
Debug.ShouldStop(128);
_copy.runVoidMethod ("Add",(Object)(__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 74;BA.debugLine="Return copy";
Debug.ShouldStop(512);
if (true) return _copy;
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getservertracelist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetServerTraceList (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("getservertracelist")) { return __ref.runUserSub(false, "traceservice","getservertracelist", __ref);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 111;BA.debugLine="Public Sub GetServerTraceList As List";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim copy As List";
Debug.ShouldStop(32768);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 113;BA.debugLine="copy.Initialize";
Debug.ShouldStop(65536);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="If serverSnapshots.IsInitialized = False Then Ret";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 115;BA.debugLine="For Each entry As Map In serverSnapshots";
Debug.ShouldStop(262144);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = __ref.getField(false,"_serversnapshots" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group4.runMethod(false,"Get",index4));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 116;BA.debugLine="copy.Add(CloneMap(entry))";
Debug.ShouldStop(524288);
_copy.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.traceservice.class, "_clonemap" /*RemoteObject*/ ,(Object)(_entry)).getObject())));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 118;BA.debugLine="Return copy";
Debug.ShouldStop(2097152);
if (true) return _copy;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("GetServerTraceText (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("getservertracetext")) { return __ref.runUserSub(false, "traceservice","getservertracetext", __ref);}
RemoteObject _lines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 99;BA.debugLine="Public Sub GetServerTraceText As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="If serverSnapshots.IsInitialized = False Or serve";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 101;BA.debugLine="Dim lines As List";
Debug.ShouldStop(16);
_lines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lines", _lines);
 BA.debugLineNum = 102;BA.debugLine="lines.Initialize";
Debug.ShouldStop(32);
_lines.runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="For Each entry As Map In serverSnapshots";
Debug.ShouldStop(64);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = __ref.getField(false,"_serversnapshots" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group4.runMethod(false,"Get",index4));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 104;BA.debugLine="lines.Add(entry.GetDefault(\"Header\", \"\"))";
Debug.ShouldStop(128);
_lines.runVoidMethod ("Add",(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 105;BA.debugLine="lines.Add(entry.GetDefault(\"Body\", \"\"))";
Debug.ShouldStop(256);
_lines.runVoidMethod ("Add",(Object)(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Body"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 106;BA.debugLine="lines.Add(\"\")";
Debug.ShouldStop(512);
_lines.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 108;BA.debugLine="Return JoinList(lines, CRLF)";
Debug.ShouldStop(2048);
if (true) return __ref.runClassMethod (b4j.example.traceservice.class, "_joinlist" /*RemoteObject*/ ,(Object)(_lines),(Object)(traceservice.__c.getField(true,"CRLF")));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("GetTraceList (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("gettracelist")) { return __ref.runUserSub(false, "traceservice","gettracelist", __ref);}
RemoteObject _copy = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.createImmutable("");
 BA.debugLineNum = 56;BA.debugLine="Public Sub GetTraceList As List";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim copy As List";
Debug.ShouldStop(16777216);
_copy = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("copy", _copy);
 BA.debugLineNum = 58;BA.debugLine="copy.Initialize";
Debug.ShouldStop(33554432);
_copy.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="If traceLogs.IsInitialized = False Then Return co";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False"))) { 
if (true) return _copy;};
 BA.debugLineNum = 60;BA.debugLine="For Each entry As String In traceLogs";
Debug.ShouldStop(134217728);
{
final RemoteObject group4 = __ref.getField(false,"_tracelogs" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_entry = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("entry", _entry);
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 61;BA.debugLine="copy.Add(entry)";
Debug.ShouldStop(268435456);
_copy.runVoidMethod ("Add",(Object)((_entry)));
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
public static RemoteObject  _gettracetext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTraceText (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("gettracetext")) { return __ref.runUserSub(false, "traceservice","gettracetext", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetTraceText As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="If traceLogs.IsInitialized = False Or traceLogs.S";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),traceservice.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 53;BA.debugLine="Return JoinList(traceLogs, CRLF)";
Debug.ShouldStop(1048576);
if (true) return __ref.runClassMethod (b4j.example.traceservice.class, "_joinlist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tracelogs" /*RemoteObject*/ )),(Object)(traceservice.__c.getField(true,"CRLF")));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _storagedirvalue,RemoteObject _debugresponsesdirvalue,RemoteObject _traceloglimitvalue,RemoteObject _serversnapshotlimitvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "traceservice","initialize", __ref, _ba, _storagedirvalue, _debugresponsesdirvalue, _traceloglimitvalue, _serversnapshotlimitvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("storageDirValue", _storagedirvalue);
Debug.locals.put("debugResponsesDirValue", _debugresponsesdirvalue);
Debug.locals.put("traceLogLimitValue", _traceloglimitvalue);
Debug.locals.put("serverSnapshotLimitValue", _serversnapshotlimitvalue);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(storageDirValue As String, d";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="storageDir = storageDirValue";
Debug.ShouldStop(65536);
__ref.setField ("_storagedir" /*RemoteObject*/ ,_storagedirvalue);
 BA.debugLineNum = 18;BA.debugLine="debugResponsesDir = debugResponsesDirValue";
Debug.ShouldStop(131072);
__ref.setField ("_debugresponsesdir" /*RemoteObject*/ ,_debugresponsesdirvalue);
 BA.debugLineNum = 19;BA.debugLine="traceLogLimit = traceLogLimitValue";
Debug.ShouldStop(262144);
__ref.setField ("_traceloglimit" /*RemoteObject*/ ,_traceloglimitvalue);
 BA.debugLineNum = 20;BA.debugLine="serverSnapshotLimit = serverSnapshotLimitValue";
Debug.ShouldStop(524288);
__ref.setField ("_serversnapshotlimit" /*RemoteObject*/ ,_serversnapshotlimitvalue);
 BA.debugLineNum = 21;BA.debugLine="traceLogs.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="debugLogs.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="pendingTraceBatch.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="serverSnapshots.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("JoinList (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "traceservice","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 184;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16777216);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 186;BA.debugLine="sb.Initialize";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 187;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(67108864);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 188;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 189;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 191;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(1073741824);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("SaveServerSnapshot (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("saveserversnapshot")) { return __ref.runUserSub(false, "traceservice","saveserversnapshot", __ref, _method, _url, _success, _body, _errormessage);}
RemoteObject _timestamp = RemoteObject.createImmutable("");
RemoteObject _header = RemoteObject.createImmutable("");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("method", _method);
Debug.locals.put("url", _url);
Debug.locals.put("success", _success);
Debug.locals.put("body", _body);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 122;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim timestamp As String = DateTime.Time(DateTime.";
Debug.ShouldStop(67108864);
_timestamp = traceservice.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("timestamp", _timestamp);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 124;BA.debugLine="Dim header As String = timestamp & \" SNAPSHOT met";
Debug.ShouldStop(134217728);
_header = RemoteObject.concat(_timestamp,RemoteObject.createImmutable(" SNAPSHOT method="),_method,RemoteObject.createImmutable(" success="),_success,RemoteObject.createImmutable(" url="),_url);Debug.locals.put("header", _header);Debug.locals.put("header", _header);
 BA.debugLineNum = 125;BA.debugLine="If errorMessage <> \"\" Then header = header & \" er";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_errormessage,BA.ObjectToString(""))) { 
_header = RemoteObject.concat(_header,RemoteObject.createImmutable(" error="),_errormessage);Debug.locals.put("header", _header);};
 BA.debugLineNum = 126;BA.debugLine="Dim entry As Map";
Debug.ShouldStop(536870912);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("entry", _entry);
 BA.debugLineNum = 127;BA.debugLine="entry.Initialize";
Debug.ShouldStop(1073741824);
_entry.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="entry.Put(\"Timestamp\", timestamp)";
Debug.ShouldStop(-2147483648);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Timestamp"))),(Object)((_timestamp)));
 BA.debugLineNum = 129;BA.debugLine="entry.Put(\"Method\", method)";
Debug.ShouldStop(1);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Method"))),(Object)((_method)));
 BA.debugLineNum = 130;BA.debugLine="entry.Put(\"Url\", url)";
Debug.ShouldStop(2);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Url"))),(Object)((_url)));
 BA.debugLineNum = 131;BA.debugLine="entry.Put(\"Success\", success)";
Debug.ShouldStop(4);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((_success)));
 BA.debugLineNum = 132;BA.debugLine="entry.Put(\"Error\", errorMessage)";
Debug.ShouldStop(8);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_errormessage)));
 BA.debugLineNum = 133;BA.debugLine="entry.Put(\"Body\", body)";
Debug.ShouldStop(16);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Body"))),(Object)((_body)));
 BA.debugLineNum = 134;BA.debugLine="entry.Put(\"Header\", header)";
Debug.ShouldStop(32);
_entry.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((_header)));
 BA.debugLineNum = 135;BA.debugLine="serverSnapshots.Add(entry)";
Debug.ShouldStop(64);
__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_entry.getObject())));
 BA.debugLineNum = 136;BA.debugLine="Do While serverSnapshots.Size > serverSnapshotLim";
Debug.ShouldStop(128);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_serversnapshotlimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 137;BA.debugLine="serverSnapshots.RemoveAt(0)";
Debug.ShouldStop(256);
__ref.getField(false,"_serversnapshots" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 139;BA.debugLine="WriteServerSnapshotFile(entry)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.traceservice.class, "_writeserversnapshotfile" /*RemoteObject*/ ,(Object)(_entry));
 BA.debugLineNum = 140;BA.debugLine="CleanupServerSnapshotFiles";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.traceservice.class, "_cleanupserversnapshotfiles" /*RemoteObject*/ );
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Trace (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("trace")) { return __ref.runUserSub(false, "traceservice","trace", __ref, _message);}
RemoteObject _entry = RemoteObject.createImmutable("");
RemoteObject _removedentry = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 28;BA.debugLine="Public Sub Trace(message As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(268435456);
_entry = RemoteObject.concat(traceservice.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),_message);Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 30;BA.debugLine="traceLogs.Add(entry)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_entry)));
 BA.debugLineNum = 31;BA.debugLine="Do While traceLogs.Size > traceLogLimit";
Debug.ShouldStop(1073741824);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_traceloglimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 32;BA.debugLine="Dim removedEntry As String = traceLogs.Get(0)";
Debug.ShouldStop(-2147483648);
_removedentry = BA.ObjectToString(__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("removedEntry", _removedentry);Debug.locals.put("removedEntry", _removedentry);
 BA.debugLineNum = 33;BA.debugLine="traceLogs.RemoveAt(0)";
Debug.ShouldStop(1);
__ref.getField(false,"_tracelogs" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 34;BA.debugLine="If pendingTraceBatch.IsInitialized And pendingTr";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 35;BA.debugLine="If pendingTraceBatch.Get(0) = removedEntry Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(_removedentry))) { 
__ref.getField(false,"_pendingtracebatch" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));};
 };
 }
;
 BA.debugLineNum = 38;BA.debugLine="Log(entry)";
Debug.ShouldStop(32);
traceservice.__c.runVoidMethod ("LogImpl","267895306",_entry,0);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracedebug(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceDebug (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("tracedebug")) { return __ref.runUserSub(false, "traceservice","tracedebug", __ref, _message);}
RemoteObject _entry = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 42;BA.debugLine="Public Sub TraceDebug(message As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim entry As String = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(1024);
_entry = RemoteObject.concat(traceservice.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" DEBUG "),_message);Debug.locals.put("entry", _entry);Debug.locals.put("entry", _entry);
 BA.debugLineNum = 44;BA.debugLine="debugLogs.Add(entry)";
Debug.ShouldStop(2048);
__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_entry)));
 BA.debugLineNum = 45;BA.debugLine="Do While debugLogs.Size > traceLogLimit";
Debug.ShouldStop(4096);
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_traceloglimit" /*RemoteObject*/ )))) {
 BA.debugLineNum = 46;BA.debugLine="debugLogs.RemoveAt(0)";
Debug.ShouldStop(8192);
__ref.getField(false,"_debuglogs" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 }
;
 BA.debugLineNum = 48;BA.debugLine="Log(entry)";
Debug.ShouldStop(32768);
traceservice.__c.runVoidMethod ("LogImpl","267960838",_entry,0);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("WriteServerSnapshotFile (traceservice) ","traceservice",22,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("writeserversnapshotfile")) { return __ref.runUserSub(false, "traceservice","writeserversnapshotfile", __ref, _entry);}
RemoteObject _stamp = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _text = RemoteObject.createImmutable("");
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 143;BA.debugLine="Private Sub WriteServerSnapshotFile(entry As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 145;BA.debugLine="EnsureDirectory(storageDir)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.traceservice.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="EnsureDirectory(debugResponsesDir)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.traceservice.class, "_ensuredirectory" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )));
 BA.debugLineNum = 147;BA.debugLine="Dim stamp As String = Regex.Replace(\"[^0-9]\", en";
Debug.ShouldStop(262144);
_stamp = traceservice.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^0-9]")),(Object)(BA.ObjectToString(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Timestamp"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("stamp", _stamp);Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 148;BA.debugLine="If stamp = \"\" Then stamp = \"\" & DateTime.Now";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_stamp,BA.ObjectToString(""))) { 
_stamp = RemoteObject.concat(RemoteObject.createImmutable(""),traceservice.__c.getField(false,"DateTime").runMethod(true,"getNow"));Debug.locals.put("stamp", _stamp);};
 BA.debugLineNum = 149;BA.debugLine="Dim name As String = stamp & \"_\" & entry.GetDefa";
Debug.ShouldStop(1048576);
_name = RemoteObject.concat(_stamp,RemoteObject.createImmutable("_"),_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Method"))),(Object)((RemoteObject.createImmutable("REQ")))),RemoteObject.createImmutable(".txt"));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 150;BA.debugLine="Dim text As String = entry.GetDefault(\"Header\",";
Debug.ShouldStop(2097152);
_text = RemoteObject.concat(_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((RemoteObject.createImmutable("")))),traceservice.__c.getField(true,"CRLF"),traceservice.__c.getField(true,"CRLF"),_entry.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Body"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 151;BA.debugLine="File.WriteString(debugResponsesDir, name, text)";
Debug.ShouldStop(4194304);
traceservice.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_debugresponsesdir" /*RemoteObject*/ )),(Object)(_name),(Object)(_text));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 153;BA.debugLine="Trace(\"Не удалось записать snapshot сервера. \" &";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.traceservice.class, "_trace" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Не удалось записать snapshot сервера. "),traceservice.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}