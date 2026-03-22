package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,11);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _pagesmanager = RemoteObject.declareNull("b4j.example.b4xpagesmanager");
Debug.locals.put("form1", _form1);
Debug.locals.put("args", _args);
 BA.debugLineNum = 11;BA.debugLine="Sub AppStart (form1 As Form, args() As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="mainForm = form1";
Debug.ShouldStop(2048);
main._mainform = _form1;
 BA.debugLineNum = 13;BA.debugLine="mainForm.SetWindowSizeLimits(520, 640, fx.Primary";
Debug.ShouldStop(4096);
main._mainform.runVoidMethod ("SetWindowSizeLimits",(Object)(BA.numberCast(double.class, 520)),(Object)(BA.numberCast(double.class, 640)),(Object)(RemoteObject.solve(new RemoteObject[] {main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxX"),main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX")}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),main._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0)));
 BA.debugLineNum = 14;BA.debugLine="mainForm.Show";
Debug.ShouldStop(8192);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 15;BA.debugLine="mainForm.WindowWidth = Max(mainForm.WindowWidth,";
Debug.ShouldStop(16384);
main._mainform.runMethod(true,"setWindowWidth",main.__c.runMethod(true,"Max",(Object)(main._mainform.runMethod(true,"getWindowWidth")),(Object)(BA.numberCast(double.class, 520))));
 BA.debugLineNum = 16;BA.debugLine="mainForm.WindowHeight = Max(mainForm.WindowHeight";
Debug.ShouldStop(32768);
main._mainform.runMethod(true,"setWindowHeight",main.__c.runMethod(true,"Max",(Object)(main._mainform.runMethod(true,"getWindowHeight")),(Object)(BA.numberCast(double.class, 640))));
 BA.debugLineNum = 17;BA.debugLine="Dim pagesManager As B4XPagesManager";
Debug.ShouldStop(65536);
_pagesmanager = RemoteObject.createNew ("b4j.example.b4xpagesmanager");Debug.locals.put("pagesManager", _pagesmanager);
 BA.debugLineNum = 18;BA.debugLine="pagesManager.Initialize(mainForm)";
Debug.ShouldStop(131072);
_pagesmanager.runClassMethod (b4j.example.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closed() throws Exception{
try {
		Debug.PushSubsStack("MainForm_Closed (main) ","main",0,main.ba,main.mostCurrent,31);
if (RapidSub.canDelegate("mainform_closed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closed");}
 BA.debugLineNum = 31;BA.debugLine="Sub MainForm_Closed";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="B4XPages.MainPage.SaveWindowState";
Debug.ShouldStop(-2147483648);
main._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_savewindowstate" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="B4XPages.MainPage.CleanupPlaybackTempFiles";
Debug.ShouldStop(1);
main._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_cleanupplaybacktempfiles" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
Debug.ShouldStop(2);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closed" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("MainForm_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,37);
if (RapidSub.canDelegate("mainform_closerequest")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 37;BA.debugLine="Sub MainForm_CloseRequest (eventData As Event)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(eventData";
Debug.ShouldStop(32);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_closerequest" /*RemoteObject*/ ,(Object)(_eventdata));
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
public static RemoteObject  _mainform_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("MainForm_FocusChanged (main) ","main",0,main.ba,main.mostCurrent,23);
if (RapidSub.canDelegate("mainform_focuschanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_focuschanged", _hasfocus);}
Debug.locals.put("hasFocus", _hasfocus);
 BA.debugLineNum = 23;BA.debugLine="Sub MainForm_FocusChanged (hasFocus As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(hasFocus)";
Debug.ShouldStop(8388608);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_focuschanged" /*RemoteObject*/ ,(Object)(_hasfocus));
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
public static RemoteObject  _mainform_iconifiedchanged(RemoteObject _iconified) throws Exception{
try {
		Debug.PushSubsStack("MainForm_IconifiedChanged (main) ","main",0,main.ba,main.mostCurrent,41);
if (RapidSub.canDelegate("mainform_iconifiedchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_iconifiedchanged", _iconified);}
Debug.locals.put("iconified", _iconified);
 BA.debugLineNum = 41;BA.debugLine="Public Sub MainForm_IconifiedChanged (iconified As";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(iconi";
Debug.ShouldStop(512);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_iconifiedchanged" /*RemoteObject*/ ,(Object)(_iconified));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("MainForm_Resize (main) ","main",0,main.ba,main.mostCurrent,27);
if (RapidSub.canDelegate("mainform_resize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_resize", _width, _height);}
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 27;BA.debugLine="Sub MainForm_Resize (width As Double, height As Do";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="B4XPages.Delegate.MainForm_Resize(width, height)";
Debug.ShouldStop(134217728);
main._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4j.example.b4xpagesdelegator.class, "_mainform_resize" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4j.example.b4xmainpage");
mediacache.myClass = BA.getDeviceClass ("b4j.example.mediacache");
playbacktransitioncoordinator.myClass = BA.getDeviceClass ("b4j.example.playbacktransitioncoordinator");
playbackqueuebuilder.myClass = BA.getDeviceClass ("b4j.example.playbackqueuebuilder");
playbackresponseadapter.myClass = BA.getDeviceClass ("b4j.example.playbackresponseadapter");
playbackfacade.myClass = BA.getDeviceClass ("b4j.example.playbackfacade");
playbackqueuestate.myClass = BA.getDeviceClass ("b4j.example.playbackqueuestate");
playbackretryfallbackstate.myClass = BA.getDeviceClass ("b4j.example.playbackretryfallbackstate");
playbackdatapolicystate.myClass = BA.getDeviceClass ("b4j.example.playbackdatapolicystate");
playbackorchestrationstate.myClass = BA.getDeviceClass ("b4j.example.playbackorchestrationstate");
playbackmetastate.myClass = BA.getDeviceClass ("b4j.example.playbackmetastate");
playbackruntimestate.myClass = BA.getDeviceClass ("b4j.example.playbackruntimestate");
offlinestore.myClass = BA.getDeviceClass ("b4j.example.offlinestore");
dataplaybackresolver.myClass = BA.getDeviceClass ("b4j.example.dataplaybackresolver");
adscheduler.myClass = BA.getDeviceClass ("b4j.example.adscheduler");
audioplayer.myClass = BA.getDeviceClass ("b4j.example.audioplayer");
traceservice.myClass = BA.getDeviceClass ("b4j.example.traceservice");
uistyle.myClass = BA.getDeviceClass ("b4j.example.uistyle");
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private mainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}