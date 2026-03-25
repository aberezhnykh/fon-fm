package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 520, 640);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _labelname = "";
public static String _versionname = "";
public static int _versioncode = 0;
public static String _hostargument = "";
public static int _exitcodestop = 0;
public static int _exitcodeapplyupdate = 0;
public static int _exitcoderestart = 0;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static boolean _startedbyhost = false;
public static b4j.example.uistyle _uistyle = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
b4j.example.b4xpagesmanager _pagesmanager = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (form1 As Form, args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="startedByHost = IsStartedByHost(args)";
_startedbyhost = _isstartedbyhost(_args);
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="mainForm = form1";
_mainform = _form1;
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="mainForm.SetWindowSizeLimits(520, 640, fx.Primary";
_mainform.SetWindowSizeLimits(520,640,_fx.getPrimaryScreen().getMaxX()-_fx.getPrimaryScreen().getMinX(),_fx.getPrimaryScreen().getMaxY()-_fx.getPrimaryScreen().getMinY());
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="mainForm.Title = LabelName";
_mainform.setTitle(_labelname);
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="mainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png").getObject()));
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="mainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="mainForm.WindowWidth = Max(mainForm.WindowWidth,";
_mainform.setWindowWidth(anywheresoftware.b4a.keywords.Common.Max(_mainform.getWindowWidth(),520));
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="mainForm.WindowHeight = Max(mainForm.WindowHeight";
_mainform.setWindowHeight(anywheresoftware.b4a.keywords.Common.Max(_mainform.getWindowHeight(),640));
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="Dim pagesManager As B4XPagesManager";
_pagesmanager = new b4j.example.b4xpagesmanager();
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="pagesManager.Initialize(mainForm)";
_pagesmanager._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="End Sub";
return "";
}
public static boolean  _isstartedbyhost(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "isstartedbyhost", false))
	 {return ((Boolean) Debug.delegate(ba, "isstartedbyhost", new Object[] {_args}));}
String _argvalue = "";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub IsStartedByHost(args() As String) As B";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If args = Null Or args.Length = 0 Then Return Fal";
if (_args== null || _args.length==0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="For Each argValue As String In args";
{
final String[] group2 = _args;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_argvalue = group2[index2];
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="If argValue = HostArgument Then Return True";
if ((_argvalue).equals(_hostargument)) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
 }
};
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="End Sub";
return false;
}
public static boolean  _ishosted() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ishosted", false))
	 {return ((Boolean) Debug.delegate(ba, "ishosted", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Public Sub IsHosted As Boolean";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Return startedByHost";
if (true) return _startedbyhost;
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return false;
}
public static String  _mainform_closed() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closed", false))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub MainForm_Closed";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="B4XPages.MainPage.SaveWindowState";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._savewindowstate /*String*/ (null);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="B4XPages.MainPage.FlushPendingCacheIndexes";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._flushpendingcacheindexes /*String*/ (null);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="B4XPages.MainPage.CleanupPlaybackTempFiles";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_closed /*String*/ (null);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closerequest", false))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub MainForm_CloseRequest (eventData As Event)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(eventData";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_closerequest /*String*/ (null,_eventdata);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If startedByHost Then";
if (_startedbyhost) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="ExitApplication2(ExitCodeStop)";
anywheresoftware.b4a.keywords.Common.ExitApplication2(_exitcodestop);
 };
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mainform_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub MainForm_FocusChanged (hasFocus As Boolean)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(hasFocus)";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_focuschanged /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_iconifiedchanged(boolean _iconified) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_iconifiedchanged", false))
	 {return ((String) Debug.delegate(ba, "mainform_iconifiedchanged", new Object[] {_iconified}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub MainForm_IconifiedChanged (iconified As";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(iconi";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_iconifiedchanged /*String*/ (null,_iconified);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_resize", false))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub MainForm_Resize (width As Double, height As Do";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="B4XPages.Delegate.MainForm_Resize(width, height)";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_resize /*String*/ (null,_width,_height);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _requesthostapplyupdate() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "requesthostapplyupdate", false))
	 {return ((String) Debug.delegate(ba, "requesthostapplyupdate", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub RequestHostApplyUpdate";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If startedByHost Then";
if (_startedbyhost) { 
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="ExitApplication2(ExitCodeApplyUpdate)";
anywheresoftware.b4a.keywords.Common.ExitApplication2(_exitcodeapplyupdate);
 }else {
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return "";
}
public static String  _requesthostrestart() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "requesthostrestart", false))
	 {return ((String) Debug.delegate(ba, "requesthostrestart", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub RequestHostRestart";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If startedByHost Then";
if (_startedbyhost) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ExitApplication2(ExitCodeRestart)";
anywheresoftware.b4a.keywords.Common.ExitApplication2(_exitcoderestart);
 }else {
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="End Sub";
return "";
}
public static String  _requesthoststop() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "requesthoststop", false))
	 {return ((String) Debug.delegate(ba, "requesthoststop", null));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub RequestHostStop";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="If startedByHost Then";
if (_startedbyhost) { 
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="ExitApplication2(ExitCodeStop)";
anywheresoftware.b4a.keywords.Common.ExitApplication2(_exitcodestop);
 }else {
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="End Sub";
return "";
}
}