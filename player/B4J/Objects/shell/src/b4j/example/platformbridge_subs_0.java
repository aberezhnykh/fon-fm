package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class platformbridge_subs_0 {


public static RemoteObject  _ishostedruntime() throws Exception{
try {
		Debug.PushSubsStack("IsHostedRuntime (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,32);
if (RapidSub.canDelegate("ishostedruntime")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","ishostedruntime");}
 BA.debugLineNum = 32;BA.debugLine="Public Sub IsHostedRuntime As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Return Main.IsHosted";
Debug.ShouldStop(2);
if (true) return platformbridge._main.runMethod(true,"_ishosted" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstagedupdateready(RemoteObject _updatedir,RemoteObject _updatefilename) throws Exception{
try {
		Debug.PushSubsStack("IsStagedUpdateReady (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,28);
if (RapidSub.canDelegate("isstagedupdateready")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","isstagedupdateready", _updatedir, _updatefilename);}
Debug.locals.put("updateDir", _updatedir);
Debug.locals.put("updateFileName", _updatefilename);
 BA.debugLineNum = 28;BA.debugLine="Public Sub IsStagedUpdateReady(updateDir As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return File.Exists(updateDir, updateFileName)";
Debug.ShouldStop(268435456);
if (true) return platformbridge.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_updatedir),(Object)(_updatefilename));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlist(RemoteObject _values,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("JoinList (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,175);
if (RapidSub.canDelegate("joinlist")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","joinlist", _values, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("values", _values);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 175;BA.debugLine="Private Sub JoinList(values As List, separator As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32768);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 177;BA.debugLine="sb.Initialize";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 178;BA.debugLine="For i = 0 To values.Size - 1";
Debug.ShouldStop(131072);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 179;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 180;BA.debugLine="sb.Append(values.Get(i))";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 182;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(2097152);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizetextvalue(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NormalizeTextValue (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,169);
if (RapidSub.canDelegate("normalizetextvalue")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","normalizetextvalue", _value);}
RemoteObject _normalized = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 169;BA.debugLine="Private Sub NormalizeTextValue(value As String) As";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Dim normalized As String = value.Trim";
Debug.ShouldStop(512);
_normalized = _value.runMethod(true,"trim");Debug.locals.put("normalized", _normalized);Debug.locals.put("normalized", _normalized);
 BA.debugLineNum = 171;BA.debugLine="If normalized.ToLowerCase = \"null\" Then Return \"\"";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_normalized.runMethod(true,"toLowerCase"),BA.ObjectToString("null"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 172;BA.debugLine="Return normalized";
Debug.ShouldStop(2048);
if (true) return _normalized;
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _requeststagedupdateapply(RemoteObject _updatedir,RemoteObject _updatefilename) throws Exception{
try {
		Debug.PushSubsStack("RequestStagedUpdateApply (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,40);
if (RapidSub.canDelegate("requeststagedupdateapply")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","requeststagedupdateapply", _updatedir, _updatefilename);}
Debug.locals.put("updateDir", _updatedir);
Debug.locals.put("updateFileName", _updatefilename);
 BA.debugLineNum = 40;BA.debugLine="Public Sub RequestStagedUpdateApply(updateDir As S";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If File.Exists(updateDir, updateFileName) = False";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",platformbridge.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_updatedir),(Object)(_updatefilename)),platformbridge.__c.getField(true,"False"))) { 
if (true) return platformbridge.__c.getField(true,"False");};
 BA.debugLineNum = 43;BA.debugLine="If Main.IsHosted = False Then Return False";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",platformbridge._main.runMethod(true,"_ishosted" /*RemoteObject*/ ),platformbridge.__c.getField(true,"False"))) { 
if (true) return platformbridge.__c.getField(true,"False");};
 BA.debugLineNum = 44;BA.debugLine="Main.RequestHostApplyUpdate";
Debug.ShouldStop(2048);
platformbridge._main.runVoidMethod ("_requesthostapplyupdate" /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return platformbridge.__c.getField(true,"True");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveclientplatformtext() throws Exception{
try {
		Debug.PushSubsStack("ResolveClientPlatformText (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,128);
if (RapidSub.canDelegate("resolveclientplatformtext")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolveclientplatformtext");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _osname = RemoteObject.createImmutable("");
RemoteObject _osversion = RemoteObject.createImmutable("");
RemoteObject _osarch = RemoteObject.createImmutable("");
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 128;BA.debugLine="Public Sub ResolveClientPlatformText As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 149;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 150;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2097152);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 151;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
Debug.ShouldStop(4194304);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.System")));
 BA.debugLineNum = 152;BA.debugLine="Dim osName As String = NormalizeTextValue(\"\" & j";
Debug.ShouldStop(8388608);
_osname = _normalizetextvalue(RemoteObject.concat(RemoteObject.createImmutable(""),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getProperty")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("os.name"))})))));Debug.locals.put("osName", _osname);Debug.locals.put("osName", _osname);
 BA.debugLineNum = 153;BA.debugLine="Dim osVersion As String = NormalizeTextValue(\"\"";
Debug.ShouldStop(16777216);
_osversion = _normalizetextvalue(RemoteObject.concat(RemoteObject.createImmutable(""),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getProperty")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("os.version"))})))));Debug.locals.put("osVersion", _osversion);Debug.locals.put("osVersion", _osversion);
 BA.debugLineNum = 154;BA.debugLine="Dim osArch As String = NormalizeTextValue(\"\" & j";
Debug.ShouldStop(33554432);
_osarch = _normalizetextvalue(RemoteObject.concat(RemoteObject.createImmutable(""),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getProperty")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("os.arch"))})))));Debug.locals.put("osArch", _osarch);Debug.locals.put("osArch", _osarch);
 BA.debugLineNum = 155;BA.debugLine="Dim parts As List";
Debug.ShouldStop(67108864);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 156;BA.debugLine="parts.Initialize";
Debug.ShouldStop(134217728);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 157;BA.debugLine="If osName <> \"\" Then parts.Add(osName)";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_osname,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((_osname)));};
 BA.debugLineNum = 158;BA.debugLine="If osVersion <> \"\" Then parts.Add(osVersion)";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_osversion,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((_osversion)));};
 BA.debugLineNum = 159;BA.debugLine="If osArch <> \"\" Then parts.Add(osArch)";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_osarch,BA.ObjectToString(""))) { 
_parts.runVoidMethod ("Add",(Object)((_osarch)));};
 BA.debugLineNum = 160;BA.debugLine="If parts.Size > 0 Then Return JoinList(parts, \"";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_parts.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return _joinlist(_parts,RemoteObject.createImmutable(" "));};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",platformbridge.ba, e14.toString()); };
 BA.debugLineNum = 163;BA.debugLine="Return \"desktop\"";
Debug.ShouldStop(4);
if (true) return BA.ObjectToString("desktop");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvedevicetracename() throws Exception{
try {
		Debug.PushSubsStack("ResolveDeviceTraceName (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,101);
if (RapidSub.canDelegate("resolvedevicetracename")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolvedevicetracename");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _computername = RemoteObject.createImmutable("");
 BA.debugLineNum = 101;BA.debugLine="Public Sub ResolveDeviceTraceName As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 115;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 116;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 117;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.System")));
 BA.debugLineNum = 118;BA.debugLine="Dim computerName As String = NormalizeTextValue(";
Debug.ShouldStop(2097152);
_computername = _normalizetextvalue(RemoteObject.concat(RemoteObject.createImmutable(""),_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getenv")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("COMPUTERNAME"))})))));Debug.locals.put("computerName", _computername);Debug.locals.put("computerName", _computername);
 BA.debugLineNum = 119;BA.debugLine="If computerName <> \"\" Then Return computerName";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_computername,BA.ObjectToString(""))) { 
Debug.CheckDeviceExceptions();if (true) return _computername;};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",platformbridge.ba, e7.toString()); };
 BA.debugLineNum = 122;BA.debugLine="Return \"unknown\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("unknown");
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
public static RemoteObject  _resolvefreediskmbtext(RemoteObject _storagedir) throws Exception{
try {
		Debug.PushSubsStack("ResolveFreeDiskMbText (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,81);
if (RapidSub.canDelegate("resolvefreediskmbtext")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolvefreediskmbtext", _storagedir);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("storageDir", _storagedir);
 BA.debugLineNum = 81;BA.debugLine="Public Sub ResolveFreeDiskMbText(storageDir As Str";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 83;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(262144);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 84;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(524288);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_storagedir)})));
 BA.debugLineNum = 85;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getUsabl";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),platformbridge.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fileobject.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUsableSpace")),(Object)((platformbridge.__c.getField(false,"Null"))))),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",platformbridge.ba, e6.toString()); BA.debugLineNum = 87;BA.debugLine="Return \"unknown\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("unknown");
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvefreerammbtext() throws Exception{
try {
		Debug.PushSubsStack("ResolveFreeRamMbText (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,54);
if (RapidSub.canDelegate("resolvefreerammbtext")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolvefreerammbtext");}
RemoteObject _runtime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _currentruntime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _freebytes = RemoteObject.createImmutable(0L);
RemoteObject _totalbytes = RemoteObject.createImmutable(0L);
RemoteObject _maxbytes = RemoteObject.createImmutable(0L);
RemoteObject _availablebytes = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 54;BA.debugLine="Public Sub ResolveFreeRamMbText As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 56;BA.debugLine="Dim runtime As JavaObject";
Debug.ShouldStop(8388608);
_runtime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("runtime", _runtime);
 BA.debugLineNum = 57;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
Debug.ShouldStop(16777216);
_runtime.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.Runtime")));
 BA.debugLineNum = 58;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
Debug.ShouldStop(33554432);
_currentruntime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_currentruntime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _runtime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRuntime")),(Object)((platformbridge.__c.getField(false,"Null")))));Debug.locals.put("currentRuntime", _currentruntime);Debug.locals.put("currentRuntime", _currentruntime);
 BA.debugLineNum = 59;BA.debugLine="Dim freeBytes As Long = currentRuntime.RunMethod";
Debug.ShouldStop(67108864);
_freebytes = BA.numberCast(long.class, _currentruntime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("freeMemory")),(Object)((platformbridge.__c.getField(false,"Null")))));Debug.locals.put("freeBytes", _freebytes);Debug.locals.put("freeBytes", _freebytes);
 BA.debugLineNum = 60;BA.debugLine="Dim totalBytes As Long = currentRuntime.RunMetho";
Debug.ShouldStop(134217728);
_totalbytes = BA.numberCast(long.class, _currentruntime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("totalMemory")),(Object)((platformbridge.__c.getField(false,"Null")))));Debug.locals.put("totalBytes", _totalbytes);Debug.locals.put("totalBytes", _totalbytes);
 BA.debugLineNum = 61;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
Debug.ShouldStop(268435456);
_maxbytes = BA.numberCast(long.class, _currentruntime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("maxMemory")),(Object)((platformbridge.__c.getField(false,"Null")))));Debug.locals.put("maxBytes", _maxbytes);Debug.locals.put("maxBytes", _maxbytes);
 BA.debugLineNum = 62;BA.debugLine="Dim availableBytes As Long = freeBytes + Max(0,";
Debug.ShouldStop(536870912);
_availablebytes = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_freebytes,platformbridge.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_maxbytes,_totalbytes}, "-",1, 2))))}, "+",1, 0));Debug.locals.put("availableBytes", _availablebytes);Debug.locals.put("availableBytes", _availablebytes);
 BA.debugLineNum = 63;BA.debugLine="Return \"\" & Floor(availableBytes / 1024 / 1024)";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),platformbridge.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_availablebytes,RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",platformbridge.ba, e11.toString()); BA.debugLineNum = 65;BA.debugLine="Return \"unknown\"";
Debug.ShouldStop(1);
if (true) return BA.ObjectToString("unknown");
 };
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvestoragedir(RemoteObject _appid) throws Exception{
try {
		Debug.PushSubsStack("ResolveStorageDir (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,8);
if (RapidSub.canDelegate("resolvestoragedir")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolvestoragedir", _appid);}
Debug.locals.put("appId", _appid);
 BA.debugLineNum = 8;BA.debugLine="Public Sub ResolveStorageDir(appId As String) As S";
Debug.ShouldStop(128);
 BA.debugLineNum = 12;BA.debugLine="Return File.DirData(appId)";
Debug.ShouldStop(2048);
if (true) return platformbridge.__c.getField(false,"File").runMethod(true,"DirData",(Object)(_appid));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvetotaldiskmbtext(RemoteObject _storagedir) throws Exception{
try {
		Debug.PushSubsStack("ResolveTotalDiskMbText (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,91);
if (RapidSub.canDelegate("resolvetotaldiskmbtext")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolvetotaldiskmbtext", _storagedir);}
RemoteObject _fileobject = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("storageDir", _storagedir);
 BA.debugLineNum = 91;BA.debugLine="Public Sub ResolveTotalDiskMbText(storageDir As St";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 93;BA.debugLine="Dim fileObject As JavaObject";
Debug.ShouldStop(268435456);
_fileobject = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fileObject", _fileobject);
 BA.debugLineNum = 94;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
Debug.ShouldStop(536870912);
_fileobject.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_storagedir)})));
 BA.debugLineNum = 95;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getTotal";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),platformbridge.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _fileobject.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTotalSpace")),(Object)((platformbridge.__c.getField(false,"Null"))))),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",platformbridge.ba, e6.toString()); BA.debugLineNum = 97;BA.debugLine="Return \"unknown\"";
Debug.ShouldStop(1);
if (true) return BA.ObjectToString("unknown");
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
public static RemoteObject  _resolvetotalrammbtext() throws Exception{
try {
		Debug.PushSubsStack("ResolveTotalRamMbText (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,69);
if (RapidSub.canDelegate("resolvetotalrammbtext")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolvetotalrammbtext");}
RemoteObject _runtime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _currentruntime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _maxbytes = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 69;BA.debugLine="Public Sub ResolveTotalRamMbText As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 71;BA.debugLine="Dim runtime As JavaObject";
Debug.ShouldStop(64);
_runtime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("runtime", _runtime);
 BA.debugLineNum = 72;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
Debug.ShouldStop(128);
_runtime.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.lang.Runtime")));
 BA.debugLineNum = 73;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
Debug.ShouldStop(256);
_currentruntime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_currentruntime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _runtime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRuntime")),(Object)((platformbridge.__c.getField(false,"Null")))));Debug.locals.put("currentRuntime", _currentruntime);Debug.locals.put("currentRuntime", _currentruntime);
 BA.debugLineNum = 74;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
Debug.ShouldStop(512);
_maxbytes = BA.numberCast(long.class, _currentruntime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("maxMemory")),(Object)((platformbridge.__c.getField(false,"Null")))));Debug.locals.put("maxBytes", _maxbytes);Debug.locals.put("maxBytes", _maxbytes);
 BA.debugLineNum = 75;BA.debugLine="Return \"\" & Floor(maxBytes / 1024 / 1024)";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),platformbridge.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_maxbytes,RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",platformbridge.ba, e8.toString()); BA.debugLineNum = 77;BA.debugLine="Return \"unknown\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("unknown");
 };
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveupdatestagedir(RemoteObject _storagedir) throws Exception{
try {
		Debug.PushSubsStack("ResolveUpdateStageDir (platformbridge) ","platformbridge",12,platformbridge.ba,platformbridge.mostCurrent,18);
if (RapidSub.canDelegate("resolveupdatestagedir")) { return b4j.example.platformbridge.remoteMe.runUserSub(false, "platformbridge","resolveupdatestagedir", _storagedir);}
Debug.locals.put("storageDir", _storagedir);
 BA.debugLineNum = 18;BA.debugLine="Public Sub ResolveUpdateStageDir(storageDir As Str";
Debug.ShouldStop(131072);
 BA.debugLineNum = 22;BA.debugLine="Return File.DirApp";
Debug.ShouldStop(2097152);
if (true) return platformbridge.__c.getField(false,"File").runMethod(true,"getDirApp");
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}