package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class platformbridge {
private static platformbridge mostCurrent = new platformbridge();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public static boolean  _ishostedruntime(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub IsHostedRuntime As Boolean";
 //BA.debugLineNum = 36;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return false;
}
public static boolean  _isstagedupdateready(anywheresoftware.b4a.BA _ba,String _updatedir,String _updatefilename) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub IsStagedUpdateReady(updateDir As String";
 //BA.debugLineNum = 29;BA.debugLine="Return File.Exists(updateDir, updateFileName)";
if (true) return anywheresoftware.b4a.keywords.Common.File.Exists(_updatedir,_updatefilename);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return false;
}
public static String  _joinlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _values,String _separator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 176;BA.debugLine="Private Sub JoinList(values As List, separator As";
 //BA.debugLineNum = 177;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 178;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 179;BA.debugLine="For i = 0 To values.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_values.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 180;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
 //BA.debugLineNum = 181;BA.debugLine="sb.Append(values.Get(i))";
_sb.Append(BA.ObjectToString(_values.Get(_i)));
 }
};
 //BA.debugLineNum = 183;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _normalizetextvalue(anywheresoftware.b4a.BA _ba,String _value) throws Exception{
String _normalized = "";
 //BA.debugLineNum = 170;BA.debugLine="Private Sub NormalizeTextValue(value As String) As";
 //BA.debugLineNum = 171;BA.debugLine="Dim normalized As String = value.Trim";
_normalized = _value.trim();
 //BA.debugLineNum = 172;BA.debugLine="If normalized.ToLowerCase = \"null\" Then Return \"\"";
if ((_normalized.toLowerCase()).equals("null")) { 
if (true) return "";};
 //BA.debugLineNum = 173;BA.debugLine="Return normalized";
if (true) return _normalized;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static boolean  _requeststagedupdateapply(anywheresoftware.b4a.BA _ba,String _updatedir,String _updatefilename) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub RequestStagedUpdateApply(updateDir As S";
 //BA.debugLineNum = 41;BA.debugLine="If File.Exists(updateDir, updateFileName) = False";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_updatedir,_updatefilename)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 //BA.debugLineNum = 47;BA.debugLine="Starter.QueueAppUpdateInstall(updateDir, updateFi";
mostCurrent._starter._queueappupdateinstall /*String*/ (_updatedir,_updatefilename);
 //BA.debugLineNum = 48;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return false;
}
public static String  _resolveclientplatformtext(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4j.object.JavaObject _buildclass = null;
anywheresoftware.b4j.object.JavaObject _versionclass = null;
String _releasevalue = "";
String _sdkvalue = "";
String _modelvalue = "";
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 129;BA.debugLine="Public Sub ResolveClientPlatformText As String";
 //BA.debugLineNum = 131;BA.debugLine="Try";
try { //BA.debugLineNum = 132;BA.debugLine="Dim buildClass As JavaObject";
_buildclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 133;BA.debugLine="buildClass.InitializeStatic(\"android.os.Build\")";
_buildclass.InitializeStatic("android.os.Build");
 //BA.debugLineNum = 134;BA.debugLine="Dim versionClass As JavaObject";
_versionclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 135;BA.debugLine="versionClass.InitializeStatic(\"android.os.Build$";
_versionclass.InitializeStatic("android.os.Build$VERSION");
 //BA.debugLineNum = 136;BA.debugLine="Dim releaseValue As String = NormalizeTextValue(";
_releasevalue = _normalizetextvalue(_ba,""+BA.ObjectToString(_versionclass.GetField("RELEASE")));
 //BA.debugLineNum = 137;BA.debugLine="Dim sdkValue As String = \"\" & versionClass.GetFi";
_sdkvalue = ""+BA.ObjectToString(_versionclass.GetField("SDK_INT"));
 //BA.debugLineNum = 138;BA.debugLine="Dim modelValue As String = NormalizeTextValue(\"\"";
_modelvalue = _normalizetextvalue(_ba,""+BA.ObjectToString(_buildclass.GetField("MODEL")));
 //BA.debugLineNum = 139;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 140;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 141;BA.debugLine="parts.Add(\"Android\")";
_parts.Add((Object)("Android"));
 //BA.debugLineNum = 142;BA.debugLine="If releaseValue <> \"\" Then parts.Add(releaseValu";
if ((_releasevalue).equals("") == false) { 
_parts.Add((Object)(_releasevalue));};
 //BA.debugLineNum = 143;BA.debugLine="If sdkValue <> \"\" Then parts.Add(\"SDK \" & sdkVal";
if ((_sdkvalue).equals("") == false) { 
_parts.Add((Object)("SDK "+_sdkvalue));};
 //BA.debugLineNum = 144;BA.debugLine="If modelValue <> \"\" Then parts.Add(modelValue)";
if ((_modelvalue).equals("") == false) { 
_parts.Add((Object)(_modelvalue));};
 //BA.debugLineNum = 145;BA.debugLine="Return JoinList(parts, \" \")";
if (true) return _joinlist(_ba,_parts," ");
 } 
       catch (Exception e17) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e17); //BA.debugLineNum = 147;BA.debugLine="Return \"Android\"";
if (true) return "Android";
 };
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static String  _resolvedevicetracename(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4j.object.JavaObject _buildclass = null;
String _manufacturer = "";
String _model = "";
 //BA.debugLineNum = 101;BA.debugLine="Public Sub ResolveDeviceTraceName As String";
 //BA.debugLineNum = 103;BA.debugLine="Try";
try { //BA.debugLineNum = 104;BA.debugLine="Dim buildClass As JavaObject";
_buildclass = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 105;BA.debugLine="buildClass.InitializeStatic(\"android.os.Build\")";
_buildclass.InitializeStatic("android.os.Build");
 //BA.debugLineNum = 106;BA.debugLine="Dim manufacturer As String = NormalizeTextValue(";
_manufacturer = _normalizetextvalue(_ba,""+BA.ObjectToString(_buildclass.GetField("MANUFACTURER")));
 //BA.debugLineNum = 107;BA.debugLine="Dim model As String = NormalizeTextValue(\"\" & bu";
_model = _normalizetextvalue(_ba,""+BA.ObjectToString(_buildclass.GetField("MODEL")));
 //BA.debugLineNum = 108;BA.debugLine="If manufacturer <> \"\" And model <> \"\" Then Retur";
if ((_manufacturer).equals("") == false && (_model).equals("") == false) { 
if (true) return _manufacturer+" "+_model;};
 //BA.debugLineNum = 109;BA.debugLine="If model <> \"\" Then Return model";
if ((_model).equals("") == false) { 
if (true) return _model;};
 //BA.debugLineNum = 110;BA.debugLine="If manufacturer <> \"\" Then Return manufacturer";
if ((_manufacturer).equals("") == false) { 
if (true) return _manufacturer;};
 } 
       catch (Exception e10) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e10); //BA.debugLineNum = 112;BA.debugLine="Log(\"PlatformBridge.ResolveDeviceTraceName: \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("354525963","PlatformBridge.ResolveDeviceTraceName: "+anywheresoftware.b4a.keywords.Common.LastException(_ba).getMessage(),0);
 };
 //BA.debugLineNum = 114;BA.debugLine="Return \"android\"";
if (true) return "android";
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static String  _resolvefreediskmbtext(anywheresoftware.b4a.BA _ba,String _storagedir) throws Exception{
anywheresoftware.b4j.object.JavaObject _fileobject = null;
 //BA.debugLineNum = 81;BA.debugLine="Public Sub ResolveFreeDiskMbText(storageDir As Str";
 //BA.debugLineNum = 82;BA.debugLine="Try";
try { //BA.debugLineNum = 83;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 84;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_storagedir)});
 //BA.debugLineNum = 85;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getUsabl";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_fileobject.RunMethod("getUsableSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))/(double)1024/(double)1024));
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6); //BA.debugLineNum = 87;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _resolvefreerammbtext(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4j.object.JavaObject _runtime = null;
anywheresoftware.b4j.object.JavaObject _currentruntime = null;
long _freebytes = 0L;
long _totalbytes = 0L;
long _maxbytes = 0L;
long _availablebytes = 0L;
 //BA.debugLineNum = 54;BA.debugLine="Public Sub ResolveFreeRamMbText As String";
 //BA.debugLineNum = 55;BA.debugLine="Try";
try { //BA.debugLineNum = 56;BA.debugLine="Dim runtime As JavaObject";
_runtime = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 57;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
_runtime.InitializeStatic("java.lang.Runtime");
 //BA.debugLineNum = 58;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
_currentruntime = new anywheresoftware.b4j.object.JavaObject();
_currentruntime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_runtime.RunMethod("getRuntime",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 59;BA.debugLine="Dim freeBytes As Long = currentRuntime.RunMethod";
_freebytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("freeMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 60;BA.debugLine="Dim totalBytes As Long = currentRuntime.RunMetho";
_totalbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("totalMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 61;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
_maxbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("maxMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 62;BA.debugLine="Dim availableBytes As Long = freeBytes + Max(0,";
_availablebytes = (long) (_freebytes+anywheresoftware.b4a.keywords.Common.Max(0,_maxbytes-_totalbytes));
 //BA.debugLineNum = 63;BA.debugLine="Return \"\" & Floor(availableBytes / 1024 / 1024)";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor(_availablebytes/(double)1024/(double)1024));
 } 
       catch (Exception e11) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e11); //BA.debugLineNum = 65;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _resolvestoragedir(anywheresoftware.b4a.BA _ba,String _appid) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Public Sub ResolveStorageDir(appId As String) As S";
 //BA.debugLineNum = 10;BA.debugLine="Return File.Combine(File.DirInternal, appId)";
if (true) return anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),_appid);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _resolvetotaldiskmbtext(anywheresoftware.b4a.BA _ba,String _storagedir) throws Exception{
anywheresoftware.b4j.object.JavaObject _fileobject = null;
 //BA.debugLineNum = 91;BA.debugLine="Public Sub ResolveTotalDiskMbText(storageDir As St";
 //BA.debugLineNum = 92;BA.debugLine="Try";
try { //BA.debugLineNum = 93;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 94;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(_storagedir)});
 //BA.debugLineNum = 95;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getTotal";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor((double)(BA.ObjectToNumber(_fileobject.RunMethod("getTotalSpace",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))/(double)1024/(double)1024));
 } 
       catch (Exception e6) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e6); //BA.debugLineNum = 97;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _resolvetotalrammbtext(anywheresoftware.b4a.BA _ba) throws Exception{
anywheresoftware.b4j.object.JavaObject _runtime = null;
anywheresoftware.b4j.object.JavaObject _currentruntime = null;
long _maxbytes = 0L;
 //BA.debugLineNum = 69;BA.debugLine="Public Sub ResolveTotalRamMbText As String";
 //BA.debugLineNum = 70;BA.debugLine="Try";
try { //BA.debugLineNum = 71;BA.debugLine="Dim runtime As JavaObject";
_runtime = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 72;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
_runtime.InitializeStatic("java.lang.Runtime");
 //BA.debugLineNum = 73;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
_currentruntime = new anywheresoftware.b4j.object.JavaObject();
_currentruntime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_runtime.RunMethod("getRuntime",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 74;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
_maxbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("maxMemory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 75;BA.debugLine="Return \"\" & Floor(maxBytes / 1024 / 1024)";
if (true) return ""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Floor(_maxbytes/(double)1024/(double)1024));
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8); //BA.debugLineNum = 77;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _resolveupdatestagedir(anywheresoftware.b4a.BA _ba,String _storagedir) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub ResolveUpdateStageDir(storageDir As Str";
 //BA.debugLineNum = 20;BA.debugLine="Return File.Combine(storageDir, \"updates\")";
if (true) return anywheresoftware.b4a.keywords.Common.File.Combine(_storagedir,"updates");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
}
