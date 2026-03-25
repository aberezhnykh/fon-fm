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
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=68812801;
 //BA.debugLineNum = 68812801;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager()._mainpage /*b4j.example.b4xmainpage*/ ;
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="End Sub";
return null;
}
public static String  _settitle(Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager()._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.Form  _getnativeparent(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getnativeparent", true))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getnativeparent", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=68878336;
 //BA.debugLineNum = 68878336;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=68878341;
 //BA.debugLineNum = 68878341;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=68878342;
 //BA.debugLineNum = 68878342;BA.debugLine="End Sub";
return null;
}
public static String  _addpage(String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager()._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="End Sub";
return "";
}
public static b4j.example.b4xpagesmanager  _getmanager() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getmanager", true))
	 {return ((b4j.example.b4xpagesmanager) Debug.delegate(ba, "getmanager", null));}
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="Return mPM";
if (true) return (b4j.example.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=68157442;
 //BA.debugLineNum = 68157442;BA.debugLine="End Sub";
return null;
}
public static String  _addpageandcreate(String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager()._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="End Sub";
return "";
}
public static String  _closepage(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=68681728;
 //BA.debugLineNum = 68681728;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager()._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=68681730;
 //BA.debugLineNum = 68681730;BA.debugLine="End Sub";
return "";
}
public static Object  _getpage(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=68288512;
 //BA.debugLineNum = 68288512;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager()._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getpageid", true))
	 {return ((String) Debug.delegate(ba, "getpageid", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(ba, "internalsetpagesmanager", new Object[] {_pm}));}
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=68222977;
 //BA.debugLineNum = 68222977;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=68222979;
 //BA.debugLineNum = 68222979;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(ba, "isinitialized", null));}
RDebugUtils.currentLine=68091904;
 //BA.debugLineNum = 68091904;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4j.example.b4xpagesmanager;
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="End Sub";
return false;
}
public static String  _showpage(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
RDebugUtils.currentLine=68550656;
 //BA.debugLineNum = 68550656;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager()._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=68616193;
 //BA.debugLineNum = 68616193;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager()._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="End Sub";
return "";
}
}