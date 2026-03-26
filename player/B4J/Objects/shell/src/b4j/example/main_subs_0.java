package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,22);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _pagesmanager = RemoteObject.declareNull("b4j.example.b4xpagesmanager");
Debug.locals.put("form1", _form1);
Debug.locals.put("args", _args);
 BA.debugLineNum = 22;BA.debugLine="Sub AppStart (form1 As Form, args() As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="startedByHost = IsStartedByHost(args)";
Debug.ShouldStop(4194304);
main._startedbyhost = _isstartedbyhost(_args);
 BA.debugLineNum = 24;BA.debugLine="mainForm = form1";
Debug.ShouldStop(8388608);
main._mainform = _form1;
 BA.debugLineNum = 25;BA.debugLine="mainForm.SetWindowSizeLimits(520, 640, fx.Primary";
Debug.ShouldStop(16777216);
main._mainform.runVoidMethod ("SetWindowSizeLimits",(Object)(BA.numberCast(double.class, 520)),(Object)(BA.numberCast(double.class, 640)),(Object)(RemoteObject.solve(new RemoteObject[] {main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxX"),main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX")}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0)));
 BA.debugLineNum = 26;BA.debugLine="mainForm.Title = LabelName";
Debug.ShouldStop(33554432);
main._mainform.runMethod(true,"setTitle",main._labelname);
 BA.debugLineNum = 27;BA.debugLine="mainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
Debug.ShouldStop(67108864);
main._mainform.runMethod(false,"setIcon",(main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject()));
 BA.debugLineNum = 28;BA.debugLine="mainForm.Show";
Debug.ShouldStop(134217728);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 29;BA.debugLine="mainForm.WindowWidth = Max(mainForm.WindowWidth,";
Debug.ShouldStop(268435456);
main._mainform.runMethod(true,"setWindowWidth",main.__c.runMethod(true,"Max",(Object)(main._mainform.runMethod(true,"getWindowWidth")),(Object)(BA.numberCast(double.class, 520))));
 BA.debugLineNum = 30;BA.debugLine="mainForm.WindowHeight = Max(mainForm.WindowHeight";
Debug.ShouldStop(536870912);
main._mainform.runMethod(true,"setWindowHeight",main.__c.runMethod(true,"Max",(Object)(main._mainform.runMethod(true,"getWindowHeight")),(Object)(BA.numberCast(double.class, 640))));
 BA.debugLineNum = 31;BA.debugLine="Dim pagesManager As B4XPagesManager";
Debug.ShouldStop(1073741824);
_pagesmanager = RemoteObject.createNew ("b4j.example.b4xpagesmanager");Debug.locals.put("pagesManager", _pagesmanager);
 BA.debugLineNum = 32;BA.debugLine="pagesManager.Initialize(mainForm)";
Debug.ShouldStop(-2147483648);
_pagesmanager.runClassMethod (b4j.example.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ishosted() throws Exception{
try {
		Debug.PushSubsStack("IsHosted (main) ","main",0,main.ba,main.mostCurrent,43);
if (RapidSub.canDelegate("ishosted")) { return b4j.example.main.remoteMe.runUserSub(false, "main","ishosted");}
 BA.debugLineNum = 43;BA.debugLine="Public Sub IsHosted As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return startedByHost";
Debug.ShouldStop(2048);
if (true) return main._startedbyhost;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstartedbyhost(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("IsStartedByHost (main) ","main",0,main.ba,main.mostCurrent,35);
if (RapidSub.canDelegate("isstartedbyhost")) { return b4j.example.main.remoteMe.runUserSub(false, "main","isstartedbyhost", _args);}
RemoteObject _argvalue = RemoteObject.createImmutable("");
Debug.locals.put("args", _args);
 BA.debugLineNum = 35;BA.debugLine="Private Sub IsStartedByHost(args() As String) As B";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If args = Null Or args.Length = 0 Then Return Fal";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("n",_args) || RemoteObject.solveBoolean("=",_args.getField(true,"length"),BA.numberCast(double.class, 0))) { 
if (true) return main.__c.getField(true,"False");};
 BA.debugLineNum = 37;BA.debugLine="For Each argValue As String In args";
Debug.ShouldStop(16);
{
final RemoteObject group2 = _args;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_argvalue = group2.getArrayElement(true,RemoteObject.createImmutable(index2));Debug.locals.put("argValue", _argvalue);
Debug.locals.put("argValue", _argvalue);
 BA.debugLineNum = 38;BA.debugLine="If argValue = HostArgument Then Return True";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_argvalue,main._hostargument)) { 
if (true) return main.__c.getField(true,"True");};
 }
}Debug.locals.put("argValue", _argvalue);
;
 BA.debugLineNum = 40;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return main.__c.getField(true,"False");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closed() throws Exception{
try {
		Debug.PushSubsStack("MainForm_Closed (main) ","main",0,main.ba,main.mostCurrent,81);
if (RapidSub.canDelegate("mainform_closed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closed");}
 BA.debugLineNum = 81;BA.debugLine="Sub MainForm_Closed";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="B4XPages.MainPage.SaveWindowState";
Debug.ShouldStop(131072);
main._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_savewindowstate" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="B4XPages.MainPage.FlushPendingCacheIndexes";
Debug.ShouldStop(262144);
main._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_flushpendingcacheindexes" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="B4XPages.MainPage.CleanupPlaybackTempFiles";
Debug.ShouldStop(524288);
main._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_cleanupplaybacktempfiles" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
Debug.ShouldStop(1048576);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closed" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MainForm_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,88);
if (RapidSub.canDelegate("mainform_closerequest")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 88;BA.debugLine="Sub MainForm_CloseRequest (eventData As Event)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(eventData";
Debug.ShouldStop(16777216);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closerequest" /*RemoteObject*/ ,(Object)(_eventdata));
 BA.debugLineNum = 90;BA.debugLine="If startedByHost Then";
Debug.ShouldStop(33554432);
if (main._startedbyhost.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 91;BA.debugLine="ExitApplication2(ExitCodeStop)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("ExitApplication2",(Object)(main._exitcodestop));
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("MainForm_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,73);
if (RapidSub.canDelegate("mainform_focuschanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_focuschanged", _hasfocus);}
Debug.locals.put("hasFocus", _hasfocus);
 BA.debugLineNum = 73;BA.debugLine="Sub MainForm_FocusChanged (hasFocus As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(hasFocus)";
Debug.ShouldStop(512);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_focuschanged" /*RemoteObject*/ ,(Object)(_hasfocus));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_iconifiedchanged(RemoteObject _iconified) throws Exception{
try {
		Debug.PushSubsStack("MainForm_IconifiedChanged (main) ","main",0,main.ba,main.mostCurrent,95);
if (RapidSub.canDelegate("mainform_iconifiedchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_iconifiedchanged", _iconified);}
Debug.locals.put("iconified", _iconified);
 BA.debugLineNum = 95;BA.debugLine="Public Sub MainForm_IconifiedChanged (iconified As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(iconi";
Debug.ShouldStop(-2147483648);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_iconifiedchanged" /*RemoteObject*/ ,(Object)(_iconified));
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
public static RemoteObject  _mainform_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (main) ","main",0,main.ba,main.mostCurrent,77);
if (RapidSub.canDelegate("mainform_resize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_resize", _width, _height);}
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 77;BA.debugLine="Sub MainForm_Resize (width As Double, height As Do";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="B4XPages.Delegate.MainForm_Resize(width, height)";
Debug.ShouldStop(8192);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_resize" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));
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

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
uistyle_subs_0._process_globals();
platformbridge_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
audioplayer.myClass = BA.getDeviceClass ("b4j.example.audioplayer");
playeruicontroller.myClass = BA.getDeviceClass ("b4j.example.playeruicontroller");
uistyle.myClass = BA.getDeviceClass ("b4j.example.uistyle");
adscheduler.myClass = BA.getDeviceClass ("b4j.example.adscheduler");
autonomouscachemanager.myClass = BA.getDeviceClass ("b4j.example.autonomouscachemanager");
b4xmainpage.myClass = BA.getDeviceClass ("b4j.example.b4xmainpage");
dataplaybackresolver.myClass = BA.getDeviceClass ("b4j.example.dataplaybackresolver");
mediacache.myClass = BA.getDeviceClass ("b4j.example.mediacache");
networksyncservice.myClass = BA.getDeviceClass ("b4j.example.networksyncservice");
offlineplaybackengine.myClass = BA.getDeviceClass ("b4j.example.offlineplaybackengine");
offlinestore.myClass = BA.getDeviceClass ("b4j.example.offlinestore");
platformbridge.myClass = BA.getDeviceClass ("b4j.example.platformbridge");
playbackdatacoordinator.myClass = BA.getDeviceClass ("b4j.example.playbackdatacoordinator");
playbackdatapolicystate.myClass = BA.getDeviceClass ("b4j.example.playbackdatapolicystate");
playbackdirectorstate.myClass = BA.getDeviceClass ("b4j.example.playbackdirectorstate");
playbackmetastate.myClass = BA.getDeviceClass ("b4j.example.playbackmetastate");
playbackorchestrationstate.myClass = BA.getDeviceClass ("b4j.example.playbackorchestrationstate");
playbackplayerslot.myClass = BA.getDeviceClass ("b4j.example.playbackplayerslot");
playbackruntimestate.myClass = BA.getDeviceClass ("b4j.example.playbackruntimestate");
playbacktraceformatter.myClass = BA.getDeviceClass ("b4j.example.playbacktraceformatter");
playbacktracerouter.myClass = BA.getDeviceClass ("b4j.example.playbacktracerouter");
playbacktraceuploader.myClass = BA.getDeviceClass ("b4j.example.playbacktraceuploader");
playbacktransitioncoordinator.myClass = BA.getDeviceClass ("b4j.example.playbacktransitioncoordinator");
playerstatestore.myClass = BA.getDeviceClass ("b4j.example.playerstatestore");
traceservice.myClass = BA.getDeviceClass ("b4j.example.traceservice");
b4xpages.myClass = BA.getDeviceClass ("b4j.example.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("b4j.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4j.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4j.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4j.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4j.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4j.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4j.example.b4xset");
copyonwritelist.myClass = BA.getDeviceClass ("b4j.example.copyonwritelist");
copyonwritemap.myClass = BA.getDeviceClass ("b4j.example.copyonwritemap");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4j.example.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4j.example.b4xpagesmanager");
httputils2service.myClass = BA.getDeviceClass ("b4j.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.example.httpjob");
keyvaluestore.myClass = BA.getDeviceClass ("b4j.example.keyvaluestore");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public Const LabelName = \"FON.FM\" As String";
main._labelname = BA.ObjectToString("FON.FM");
 //BA.debugLineNum = 11;BA.debugLine="Public Const VersionName = \"1.0.1\" As String";
main._versionname = BA.ObjectToString("1.0.1");
 //BA.debugLineNum = 12;BA.debugLine="Public Const VersionCode = 1 As Int";
main._versioncode = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 13;BA.debugLine="Public Const HostArgument = \"host\" As String";
main._hostargument = BA.ObjectToString("host");
 //BA.debugLineNum = 14;BA.debugLine="Public Const ExitCodeStop = 100 As Int";
main._exitcodestop = BA.numberCast(int.class, 100);
 //BA.debugLineNum = 15;BA.debugLine="Public Const ExitCodeApplyUpdate = 200 As Int";
main._exitcodeapplyupdate = BA.numberCast(int.class, 200);
 //BA.debugLineNum = 16;BA.debugLine="Public Const ExitCodeRestart = 201 As Int";
main._exitcoderestart = BA.numberCast(int.class, 201);
 //BA.debugLineNum = 17;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 18;BA.debugLine="Private mainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 19;BA.debugLine="Private startedByHost As Boolean";
main._startedbyhost = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _requesthostapplyupdate() throws Exception{
try {
		Debug.PushSubsStack("RequestHostApplyUpdate (main) ","main",0,main.ba,main.mostCurrent,63);
if (RapidSub.canDelegate("requesthostapplyupdate")) { return b4j.example.main.remoteMe.runUserSub(false, "main","requesthostapplyupdate");}
 BA.debugLineNum = 63;BA.debugLine="Public Sub RequestHostApplyUpdate";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="If startedByHost Then";
Debug.ShouldStop(-2147483648);
if (main._startedbyhost.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="ExitApplication2(ExitCodeApplyUpdate)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("ExitApplication2",(Object)(main._exitcodeapplyupdate));
 }else {
 BA.debugLineNum = 67;BA.debugLine="ExitApplication";
Debug.ShouldStop(4);
main.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requesthostrestart() throws Exception{
try {
		Debug.PushSubsStack("RequestHostRestart (main) ","main",0,main.ba,main.mostCurrent,55);
if (RapidSub.canDelegate("requesthostrestart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","requesthostrestart");}
 BA.debugLineNum = 55;BA.debugLine="Public Sub RequestHostRestart";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="If startedByHost Then";
Debug.ShouldStop(8388608);
if (main._startedbyhost.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 57;BA.debugLine="ExitApplication2(ExitCodeRestart)";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("ExitApplication2",(Object)(main._exitcoderestart));
 }else {
 BA.debugLineNum = 59;BA.debugLine="ExitApplication";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requesthoststop() throws Exception{
try {
		Debug.PushSubsStack("RequestHostStop (main) ","main",0,main.ba,main.mostCurrent,47);
if (RapidSub.canDelegate("requesthoststop")) { return b4j.example.main.remoteMe.runUserSub(false, "main","requesthoststop");}
 BA.debugLineNum = 47;BA.debugLine="Public Sub RequestHostStop";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If startedByHost Then";
Debug.ShouldStop(32768);
if (main._startedbyhost.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="ExitApplication2(ExitCodeStop)";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("ExitApplication2",(Object)(main._exitcodestop));
 }else {
 BA.debugLineNum = 51;BA.debugLine="ExitApplication";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}