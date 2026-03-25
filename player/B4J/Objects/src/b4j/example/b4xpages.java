package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class b4xpages extends Object{
public static b4xpages mostCurrent = new b4xpages();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpages", null);
		ba.loadHtSubs(b4xpages.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.b4xpages", ba);
		}
	}
    public static Class<?> getObject() {
		return b4xpages.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static Object _mpm = null;
public static b4j.example.b4xpagesdelegator _delegate = null;
public static Object _globalcontext = null;
public static b4j.example.main _main = null;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.b4xmainpage  _mainpage() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "mainpage", true))
	 {return ((b4j.example.b4xmainpage) Debug.delegate(ba, "mainpage", null));}
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=70451201;
 //BA.debugLineNum = 70451201;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager()._mainpage /*b4j.example.b4xmainpage*/ ;
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="End Sub";
return null;
}
public static String  _settitle(Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager()._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.Form  _getnativeparent(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getnativeparent", true))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getnativeparent", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=70516741;
 //BA.debugLineNum = 70516741;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=70516742;
 //BA.debugLineNum = 70516742;BA.debugLine="End Sub";
return null;
}
public static String  _addpage(String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager()._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="End Sub";
return "";
}
public static b4j.example.b4xpagesmanager  _getmanager() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getmanager", true))
	 {return ((b4j.example.b4xpagesmanager) Debug.delegate(ba, "getmanager", null));}
RDebugUtils.currentLine=69795840;
 //BA.debugLineNum = 69795840;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=69795841;
 //BA.debugLineNum = 69795841;BA.debugLine="Return mPM";
if (true) return (b4j.example.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=69795842;
 //BA.debugLineNum = 69795842;BA.debugLine="End Sub";
return null;
}
public static String  _addpageandcreate(String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=70123520;
 //BA.debugLineNum = 70123520;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager()._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="End Sub";
return "";
}
public static String  _closepage(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=70320129;
 //BA.debugLineNum = 70320129;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager()._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="End Sub";
return "";
}
public static Object  _getpage(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager()._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getpageid", true))
	 {return ((String) Debug.delegate(ba, "getpageid", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=69992449;
 //BA.debugLineNum = 69992449;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(ba, "internalsetpagesmanager", new Object[] {_pm}));}
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(ba, "isinitialized", null));}
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=69730305;
 //BA.debugLineNum = 69730305;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4j.example.b4xpagesmanager;
RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="End Sub";
return false;
}
public static String  _showpage(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=70189057;
 //BA.debugLineNum = 70189057;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager()._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager()._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="End Sub";
return "";
}
}