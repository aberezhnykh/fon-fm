package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appinfo {
private static appinfo mostCurrent = new appinfo();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static String _labelname = "";
public static String _versionname = "";
public static int _versioncode = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Const LabelName = \"FON.FM\" As String";
_labelname = "FON.FM";
 //BA.debugLineNum = 4;BA.debugLine="Public Const VersionName = \"1.0.1\" As String";
_versionname = "1.0.1";
 //BA.debugLineNum = 5;BA.debugLine="Public Const VersionCode = 1 As Int";
_versioncode = (int) (1);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
