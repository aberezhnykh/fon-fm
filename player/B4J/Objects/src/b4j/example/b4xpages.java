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
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager()._mainpage /*b4j.example.b4xmainpage*/ ;
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="End Sub";
return null;
}
public static String  _settitle(Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager()._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.Form  _getnativeparent(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getnativeparent", true))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getnativeparent", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=32571398;
 //BA.debugLineNum = 32571398;BA.debugLine="End Sub";
return null;
}
public static String  _addpage(String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager()._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="End Sub";
return "";
}
public static b4j.example.b4xpagesmanager  _getmanager() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getmanager", true))
	 {return ((b4j.example.b4xpagesmanager) Debug.delegate(ba, "getmanager", null));}
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Return mPM";
if (true) return (b4j.example.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="End Sub";
return null;
}
public static String  _addpageandcreate(String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager()._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="End Sub";
return "";
}
public static String  _closepage(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager()._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="End Sub";
return "";
}
public static Object  _getpage(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager()._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "getpageid", true))
	 {return ((String) Debug.delegate(ba, "getpageid", new Object[] {_b4xpage}));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager()._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(ba, "internalsetpagesmanager", new Object[] {_pm}));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized() throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(ba, "isinitialized", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4j.example.b4xpagesmanager;
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return false;
}
public static String  _showpage(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager()._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager()._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="End Sub";
return "";
}
}