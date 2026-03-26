package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class platformbridge extends Object{
public static platformbridge mostCurrent = new platformbridge();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.platformbridge", null);
		ba.loadHtSubs(platformbridge.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.platformbridge", ba);
		}
	}
    public static Class<?> getObject() {
		return platformbridge.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static boolean  _requeststagedupdateapply(String _updatedir,String _updatefilename) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "requeststagedupdateapply", false))
	 {return ((Boolean) Debug.delegate(ba, "requeststagedupdateapply", new Object[] {_updatedir,_updatefilename}));}
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Public Sub RequestStagedUpdateApply(updateDir As S";
RDebugUtils.currentLine=69664769;
 //BA.debugLineNum = 69664769;BA.debugLine="If File.Exists(updateDir, updateFileName) = False";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_updatedir,_updatefilename)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=69664771;
 //BA.debugLineNum = 69664771;BA.debugLine="If Main.IsHosted = False Then Return False";
if (_main._ishosted /*boolean*/ ()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=69664772;
 //BA.debugLineNum = 69664772;BA.debugLine="Main.RequestHostApplyUpdate";
_main._requesthostapplyupdate /*String*/ ();
RDebugUtils.currentLine=69664773;
 //BA.debugLineNum = 69664773;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=69664780;
 //BA.debugLineNum = 69664780;BA.debugLine="End Sub";
return false;
}
public static String  _resolvestoragedir(String _appid) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolvestoragedir", false))
	 {return ((String) Debug.delegate(ba, "resolvestoragedir", new Object[] {_appid}));}
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Public Sub ResolveStorageDir(appId As String) As S";
RDebugUtils.currentLine=69402628;
 //BA.debugLineNum = 69402628;BA.debugLine="Return File.DirData(appId)";
if (true) return anywheresoftware.b4a.keywords.Common.File.DirData(_appid);
RDebugUtils.currentLine=69402632;
 //BA.debugLineNum = 69402632;BA.debugLine="End Sub";
return "";
}
public static String  _resolveupdatestagedir(String _storagedir) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolveupdatestagedir", false))
	 {return ((String) Debug.delegate(ba, "resolveupdatestagedir", new Object[] {_storagedir}));}
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Public Sub ResolveUpdateStageDir(storageDir As Str";
RDebugUtils.currentLine=69468164;
 //BA.debugLineNum = 69468164;BA.debugLine="Return File.DirApp";
if (true) return anywheresoftware.b4a.keywords.Common.File.getDirApp();
RDebugUtils.currentLine=69468168;
 //BA.debugLineNum = 69468168;BA.debugLine="End Sub";
return "";
}
public static String  _resolveclientplatformtext() throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolveclientplatformtext", false))
	 {return ((String) Debug.delegate(ba, "resolveclientplatformtext", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _osname = "";
String _osversion = "";
String _osarch = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Public Sub ResolveClientPlatformText As String";
RDebugUtils.currentLine=70058005;
 //BA.debugLineNum = 70058005;BA.debugLine="Try";
try {RDebugUtils.currentLine=70058006;
 //BA.debugLineNum = 70058006;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=70058007;
 //BA.debugLineNum = 70058007;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
_jo.InitializeStatic("java.lang.System");
RDebugUtils.currentLine=70058008;
 //BA.debugLineNum = 70058008;BA.debugLine="Dim osName As String = NormalizeTextValue(\"\" & j";
_osname = _normalizetextvalue(""+BA.ObjectToString(_jo.RunMethod("getProperty",new Object[]{(Object)("os.name")})));
RDebugUtils.currentLine=70058009;
 //BA.debugLineNum = 70058009;BA.debugLine="Dim osVersion As String = NormalizeTextValue(\"\"";
_osversion = _normalizetextvalue(""+BA.ObjectToString(_jo.RunMethod("getProperty",new Object[]{(Object)("os.version")})));
RDebugUtils.currentLine=70058010;
 //BA.debugLineNum = 70058010;BA.debugLine="Dim osArch As String = NormalizeTextValue(\"\" & j";
_osarch = _normalizetextvalue(""+BA.ObjectToString(_jo.RunMethod("getProperty",new Object[]{(Object)("os.arch")})));
RDebugUtils.currentLine=70058011;
 //BA.debugLineNum = 70058011;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=70058012;
 //BA.debugLineNum = 70058012;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=70058013;
 //BA.debugLineNum = 70058013;BA.debugLine="If osName <> \"\" Then parts.Add(osName)";
if ((_osname).equals("") == false) { 
_parts.Add((Object)(_osname));};
RDebugUtils.currentLine=70058014;
 //BA.debugLineNum = 70058014;BA.debugLine="If osVersion <> \"\" Then parts.Add(osVersion)";
if ((_osversion).equals("") == false) { 
_parts.Add((Object)(_osversion));};
RDebugUtils.currentLine=70058015;
 //BA.debugLineNum = 70058015;BA.debugLine="If osArch <> \"\" Then parts.Add(osArch)";
if ((_osarch).equals("") == false) { 
_parts.Add((Object)(_osarch));};
RDebugUtils.currentLine=70058016;
 //BA.debugLineNum = 70058016;BA.debugLine="If parts.Size > 0 Then Return JoinList(parts, \"";
if (_parts.getSize()>0) { 
if (true) return _joinlist(_parts," ");};
 } 
       catch (Exception e14) {
			ba.setLastException(e14); };
RDebugUtils.currentLine=70058019;
 //BA.debugLineNum = 70058019;BA.debugLine="Return \"desktop\"";
if (true) return "desktop";
RDebugUtils.currentLine=70058023;
 //BA.debugLineNum = 70058023;BA.debugLine="End Sub";
return "";
}
public static String  _resolvedevicetracename() throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolvedevicetracename", false))
	 {return ((String) Debug.delegate(ba, "resolvedevicetracename", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _computername = "";
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Public Sub ResolveDeviceTraceName As String";
RDebugUtils.currentLine=69992462;
 //BA.debugLineNum = 69992462;BA.debugLine="Try";
try {RDebugUtils.currentLine=69992463;
 //BA.debugLineNum = 69992463;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=69992464;
 //BA.debugLineNum = 69992464;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
_jo.InitializeStatic("java.lang.System");
RDebugUtils.currentLine=69992465;
 //BA.debugLineNum = 69992465;BA.debugLine="Dim computerName As String = NormalizeTextValue(";
_computername = _normalizetextvalue(""+BA.ObjectToString(_jo.RunMethod("getenv",new Object[]{(Object)("COMPUTERNAME")})));
RDebugUtils.currentLine=69992466;
 //BA.debugLineNum = 69992466;BA.debugLine="If computerName <> \"\" Then Return computerName";
if ((_computername).equals("") == false) { 
if (true) return _computername;};
 } 
       catch (Exception e7) {
			ba.setLastException(e7); };
RDebugUtils.currentLine=69992469;
 //BA.debugLineNum = 69992469;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
RDebugUtils.currentLine=69992473;
 //BA.debugLineNum = 69992473;BA.debugLine="End Sub";
return "";
}
public static String  _resolvefreediskmbtext(String _storagedir) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolvefreediskmbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvefreediskmbtext", new Object[] {_storagedir}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Public Sub ResolveFreeDiskMbText(storageDir As Str";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Try";
try {RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_storagedir)});
RDebugUtils.currentLine=69861380;
 //BA.debugLineNum = 69861380;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getUsabl";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_fileobject.RunMethod("getUsableSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))/(double)1024/(double)1024));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=69861382;
 //BA.debugLineNum = 69861382;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
RDebugUtils.currentLine=69861384;
 //BA.debugLineNum = 69861384;BA.debugLine="End Sub";
return "";
}
public static String  _resolvefreerammbtext() throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolvefreerammbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvefreerammbtext", null));}
anywheresoftware.b4j.object.JavaObject _runtime = null;
anywheresoftware.b4j.object.JavaObject _currentruntime = null;
long _freebytes = 0L;
long _totalbytes = 0L;
long _maxbytes = 0L;
long _availablebytes = 0L;
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Public Sub ResolveFreeRamMbText As String";
RDebugUtils.currentLine=69730305;
 //BA.debugLineNum = 69730305;BA.debugLine="Try";
try {RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="Dim runtime As JavaObject";
_runtime = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=69730307;
 //BA.debugLineNum = 69730307;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
_runtime.InitializeStatic("java.lang.Runtime");
RDebugUtils.currentLine=69730308;
 //BA.debugLineNum = 69730308;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
_currentruntime = new anywheresoftware.b4j.object.JavaObject();
_currentruntime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_runtime.RunMethod("getRuntime",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=69730309;
 //BA.debugLineNum = 69730309;BA.debugLine="Dim freeBytes As Long = currentRuntime.RunMethod";
_freebytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("freeMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=69730310;
 //BA.debugLineNum = 69730310;BA.debugLine="Dim totalBytes As Long = currentRuntime.RunMetho";
_totalbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("totalMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=69730311;
 //BA.debugLineNum = 69730311;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
_maxbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("maxMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=69730312;
 //BA.debugLineNum = 69730312;BA.debugLine="Dim availableBytes As Long = freeBytes + Max(0,";
_availablebytes = (long) (_freebytes+anywheresoftware.b4a.keywords.Common.Max(0,_maxbytes-_totalbytes));
RDebugUtils.currentLine=69730313;
 //BA.debugLineNum = 69730313;BA.debugLine="Return \"\" & Floor(availableBytes / 1024 / 1024)";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor(_availablebytes/(double)1024/(double)1024));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=69730315;
 //BA.debugLineNum = 69730315;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
RDebugUtils.currentLine=69730317;
 //BA.debugLineNum = 69730317;BA.debugLine="End Sub";
return "";
}
public static String  _resolvetotaldiskmbtext(String _storagedir) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolvetotaldiskmbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvetotaldiskmbtext", new Object[] {_storagedir}));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Public Sub ResolveTotalDiskMbText(storageDir As St";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="Try";
try {RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_storagedir)});
RDebugUtils.currentLine=69926916;
 //BA.debugLineNum = 69926916;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getTotal";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_fileobject.RunMethod("getTotalSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))/(double)1024/(double)1024));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=69926918;
 //BA.debugLineNum = 69926918;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
RDebugUtils.currentLine=69926920;
 //BA.debugLineNum = 69926920;BA.debugLine="End Sub";
return "";
}
public static String  _resolvetotalrammbtext() throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "resolvetotalrammbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvetotalrammbtext", null));}
anywheresoftware.b4j.object.JavaObject _runtime = null;
anywheresoftware.b4j.object.JavaObject _currentruntime = null;
long _maxbytes = 0L;
RDebugUtils.currentLine=69795840;
 //BA.debugLineNum = 69795840;BA.debugLine="Public Sub ResolveTotalRamMbText As String";
RDebugUtils.currentLine=69795841;
 //BA.debugLineNum = 69795841;BA.debugLine="Try";
try {RDebugUtils.currentLine=69795842;
 //BA.debugLineNum = 69795842;BA.debugLine="Dim runtime As JavaObject";
_runtime = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=69795843;
 //BA.debugLineNum = 69795843;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
_runtime.InitializeStatic("java.lang.Runtime");
RDebugUtils.currentLine=69795844;
 //BA.debugLineNum = 69795844;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
_currentruntime = new anywheresoftware.b4j.object.JavaObject();
_currentruntime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_runtime.RunMethod("getRuntime",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=69795845;
 //BA.debugLineNum = 69795845;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
_maxbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("maxMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=69795846;
 //BA.debugLineNum = 69795846;BA.debugLine="Return \"\" & Floor(maxBytes / 1024 / 1024)";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor(_maxbytes/(double)1024/(double)1024));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=69795848;
 //BA.debugLineNum = 69795848;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
RDebugUtils.currentLine=69795850;
 //BA.debugLineNum = 69795850;BA.debugLine="End Sub";
return "";
}
public static boolean  _isstagedupdateready(String _updatedir,String _updatefilename) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "isstagedupdateready", false))
	 {return ((Boolean) Debug.delegate(ba, "isstagedupdateready", new Object[] {_updatedir,_updatefilename}));}
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Public Sub IsStagedUpdateReady(updateDir As String";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="Return File.Exists(updateDir, updateFileName)";
if (true) return anywheresoftware.b4a.keywords.Common.File.Exists(_updatedir,_updatefilename);
RDebugUtils.currentLine=69533698;
 //BA.debugLineNum = 69533698;BA.debugLine="End Sub";
return false;
}
public static boolean  _ishostedruntime() throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "ishostedruntime", false))
	 {return ((Boolean) Debug.delegate(ba, "ishostedruntime", null));}
RDebugUtils.currentLine=69599232;
 //BA.debugLineNum = 69599232;BA.debugLine="Public Sub IsHostedRuntime As Boolean";
RDebugUtils.currentLine=69599234;
 //BA.debugLineNum = 69599234;BA.debugLine="Return Main.IsHosted";
if (true) return _main._ishosted /*boolean*/ ();
RDebugUtils.currentLine=69599238;
 //BA.debugLineNum = 69599238;BA.debugLine="End Sub";
return false;
}
public static String  _joinlist(anywheresoftware.b4a.objects.collections.List _values,String _separator) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_values,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Private Sub JoinList(values As List, separator As";
RDebugUtils.currentLine=70189057;
 //BA.debugLineNum = 70189057;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=70189059;
 //BA.debugLineNum = 70189059;BA.debugLine="For i = 0 To values.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_values.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=70189060;
 //BA.debugLineNum = 70189060;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=70189061;
 //BA.debugLineNum = 70189061;BA.debugLine="sb.Append(values.Get(i))";
_sb.Append(BA.ObjectToString(_values.Get(_i)));
 }
};
RDebugUtils.currentLine=70189063;
 //BA.debugLineNum = 70189063;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=70189064;
 //BA.debugLineNum = 70189064;BA.debugLine="End Sub";
return "";
}
public static String  _normalizetextvalue(String _value) throws Exception{
RDebugUtils.currentModule="platformbridge";
if (Debug.shouldDelegate(ba, "normalizetextvalue", false))
	 {return ((String) Debug.delegate(ba, "normalizetextvalue", new Object[] {_value}));}
String _normalized = "";
RDebugUtils.currentLine=70123520;
 //BA.debugLineNum = 70123520;BA.debugLine="Private Sub NormalizeTextValue(value As String) As";
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="Dim normalized As String = value.Trim";
_normalized = _value.trim();
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="If normalized.ToLowerCase = \"null\" Then Return \"\"";
if ((_normalized.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale)).equals("null")) { 
if (true) return "";};
RDebugUtils.currentLine=70123523;
 //BA.debugLineNum = 70123523;BA.debugLine="Return normalized";
if (true) return _normalized;
RDebugUtils.currentLine=70123524;
 //BA.debugLineNum = 70123524;BA.debugLine="End Sub";
return "";
}
}