package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playeruicontroller_subs_0 {


public static RemoteObject  _advanceorbitframe(RemoteObject __ref,RemoteObject _stepindex,RemoteObject _fadestep) throws Exception{
try {
		Debug.PushSubsStack("AdvanceOrbitFrame (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("advanceorbitframe")) { return __ref.runUserSub(false, "playeruicontroller","advanceorbitframe", __ref, _stepindex, _fadestep);}
Debug.locals.put("stepIndex", _stepindex);
Debug.locals.put("fadeStep", _fadestep);
 BA.debugLineNum = 279;BA.debugLine="Public Sub AdvanceOrbitFrame(stepIndex As Int, fad";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="If orbitFadeValue < orbitFadeTarget Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),__ref.getField(true,"_orbitfadetarget" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 281;BA.debugLine="orbitFadeValue = Min(orbitFadeTarget, orbitFadeV";
Debug.ShouldStop(16777216);
__ref.setField ("_orbitfadevalue" /*RemoteObject*/ ,playeruicontroller.__c.runMethod(true,"Min",(Object)(__ref.getField(true,"_orbitfadetarget" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),_fadestep}, "+",1, 0))));
 }else 
{ BA.debugLineNum = 282;BA.debugLine="Else If orbitFadeValue > orbitFadeTarget Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),__ref.getField(true,"_orbitfadetarget" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 283;BA.debugLine="orbitFadeValue = Max(orbitFadeTarget, orbitFadeV";
Debug.ShouldStop(67108864);
__ref.setField ("_orbitfadevalue" /*RemoteObject*/ ,playeruicontroller.__c.runMethod(true,"Max",(Object)(__ref.getField(true,"_orbitfadetarget" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),_fadestep}, "-",1, 0))));
 }}
;
 BA.debugLineNum = 285;BA.debugLine="ApplyOrbitFrame(stepIndex)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_applyorbitframe" /*RemoteObject*/ ,(Object)(_stepindex));
 BA.debugLineNum = 286;BA.debugLine="Return orbitFadeValue = 0 And orbitFadeTarget = 0";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_orbitfadetarget" /*RemoteObject*/ ),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applyorbitframe(RemoteObject __ref,RemoteObject _stepindex) throws Exception{
try {
		Debug.PushSubsStack("ApplyOrbitFrame (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,357);
if (RapidSub.canDelegate("applyorbitframe")) { return __ref.runUserSub(false, "playeruicontroller","applyorbitframe", __ref, _stepindex);}
RemoteObject _opacity = RemoteObject.createImmutable(0);
RemoteObject _basephase = RemoteObject.createImmutable(0);
RemoteObject _wave = RemoteObject.createImmutable(0);
Debug.locals.put("stepIndex", _stepindex);
 BA.debugLineNum = 357;BA.debugLine="Private Sub ApplyOrbitFrame(stepIndex As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="Dim opacity As Double";
Debug.ShouldStop(32);
_opacity = RemoteObject.createImmutable(0);Debug.locals.put("opacity", _opacity);
 BA.debugLineNum = 359;BA.debugLine="If orbitFadeValue <= 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 360;BA.debugLine="opacity = 0";
Debug.ShouldStop(128);
_opacity = BA.numberCast(double.class, 0);Debug.locals.put("opacity", _opacity);
 }else {
 BA.debugLineNum = 362;BA.debugLine="Dim basePhase As Double = stepIndex / 24";
Debug.ShouldStop(512);
_basephase = RemoteObject.solve(new RemoteObject[] {_stepindex,RemoteObject.createImmutable(24)}, "/",0, 0);Debug.locals.put("basePhase", _basephase);Debug.locals.put("basePhase", _basephase);
 BA.debugLineNum = 363;BA.debugLine="Dim wave As Double = (Sin(basePhase * cPI * 2) +";
Debug.ShouldStop(1024);
_wave = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {playeruicontroller.__c.runMethod(true,"Sin",(Object)(RemoteObject.solve(new RemoteObject[] {_basephase,playeruicontroller.__c.getField(true,"cPI"),RemoteObject.createImmutable(2)}, "**",0, 0))),RemoteObject.createImmutable(1)}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("wave", _wave);Debug.locals.put("wave", _wave);
 BA.debugLineNum = 364;BA.debugLine="opacity = (0.38 + wave * 0.28) * orbitFadeValue";
Debug.ShouldStop(2048);
_opacity = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.38),_wave,RemoteObject.createImmutable(0.28)}, "+*",1, 0)),__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ )}, "*",0, 0);Debug.locals.put("opacity", _opacity);
 };
 BA.debugLineNum = 366;BA.debugLine="ApplyOrbitState(opacity)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_applyorbitstate" /*RemoteObject*/ ,(Object)(_opacity));
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applyorbitstate(RemoteObject __ref,RemoteObject _opacity) throws Exception{
try {
		Debug.PushSubsStack("ApplyOrbitState (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("applyorbitstate")) { return __ref.runUserSub(false, "playeruicontroller","applyorbitstate", __ref, _opacity);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("opacity", _opacity);
 BA.debugLineNum = 369;BA.debugLine="Private Sub ApplyOrbitState(opacity As Double)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="Dim jo As JavaObject = orbitPane";
Debug.ShouldStop(131072);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_orbitpane" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 371;BA.debugLine="jo.RunMethod(\"setOpacity\", Array As Object(opacit";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOpacity")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_opacity)})));
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applystoppedstate(RemoteObject __ref,RemoteObject _idletext) throws Exception{
try {
		Debug.PushSubsStack("ApplyStoppedState (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("applystoppedstate")) { return __ref.runUserSub(false, "playeruicontroller","applystoppedstate", __ref, _idletext);}
Debug.locals.put("idleText", _idletext);
 BA.debugLineNum = 78;BA.debugLine="Public Sub ApplyStoppedState(idleText As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="ShowStream(idleText)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_showstream" /*RemoteObject*/ ,(Object)(_idletext));
 BA.debugLineNum = 80;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bringtofront(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("BringToFront (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("bringtofront")) { return __ref.runUserSub(false, "playeruicontroller","bringtofront", __ref, _view);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
 BA.debugLineNum = 352;BA.debugLine="Public Sub BringToFront(view As B4XView)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 354;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
Debug.ShouldStop(2);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("toFront")),(Object)((playeruicontroller.__c.getField(false,"Null"))));
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
playeruicontroller._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",playeruicontroller._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private lblStream As B4XView";
playeruicontroller._lblstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblstream",playeruicontroller._lblstream);
 //BA.debugLineNum = 10;BA.debugLine="Private lblInfo As B4XView";
playeruicontroller._lblinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblinfo",playeruicontroller._lblinfo);
 //BA.debugLineNum = 11;BA.debugLine="Private lblHeader As B4XView";
playeruicontroller._lblheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblheader",playeruicontroller._lblheader);
 //BA.debugLineNum = 12;BA.debugLine="Private lblConnectionIcon As B4XView";
playeruicontroller._lblconnectionicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblconnectionicon",playeruicontroller._lblconnectionicon);
 //BA.debugLineNum = 13;BA.debugLine="Private lblHeaderAction As B4XView";
playeruicontroller._lblheaderaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblheaderaction",playeruicontroller._lblheaderaction);
 //BA.debugLineNum = 14;BA.debugLine="Private lblSetupMessage As B4XView";
playeruicontroller._lblsetupmessage = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblsetupmessage",playeruicontroller._lblsetupmessage);
 //BA.debugLineNum = 15;BA.debugLine="Private lblPlayIcon As B4XView";
playeruicontroller._lblplayicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblplayicon",playeruicontroller._lblplayicon);
 //BA.debugLineNum = 16;BA.debugLine="Private confirmPane As B4XView";
playeruicontroller._confirmpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_confirmpane",playeruicontroller._confirmpane);
 //BA.debugLineNum = 17;BA.debugLine="Private btnConfirmYes As B4XView";
playeruicontroller._btnconfirmyes = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnconfirmyes",playeruicontroller._btnconfirmyes);
 //BA.debugLineNum = 18;BA.debugLine="Private btnConfirmNo As B4XView";
playeruicontroller._btnconfirmno = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnconfirmno",playeruicontroller._btnconfirmno);
 //BA.debugLineNum = 19;BA.debugLine="Private setupPane As B4XView";
playeruicontroller._setuppane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_setuppane",playeruicontroller._setuppane);
 //BA.debugLineNum = 20;BA.debugLine="Private playerPane As B4XView";
playeruicontroller._playerpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playerpane",playeruicontroller._playerpane);
 //BA.debugLineNum = 21;BA.debugLine="Private headerActionPane As B4XView";
playeruicontroller._headeractionpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_headeractionpane",playeruicontroller._headeractionpane);
 //BA.debugLineNum = 22;BA.debugLine="Private btnSetupSubmit As B4XView";
playeruicontroller._btnsetupsubmit = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsetupsubmit",playeruicontroller._btnsetupsubmit);
 //BA.debugLineNum = 23;BA.debugLine="Private txtPlayerCode As TextField";
playeruicontroller._txtplayercode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtplayercode",playeruicontroller._txtplayercode);
 //BA.debugLineNum = 24;BA.debugLine="Private txtPlayerCodeView As B4XView";
playeruicontroller._txtplayercodeview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtplayercodeview",playeruicontroller._txtplayercodeview);
 //BA.debugLineNum = 25;BA.debugLine="Private playButtonPane As B4XView";
playeruicontroller._playbuttonpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playbuttonpane",playeruicontroller._playbuttonpane);
 //BA.debugLineNum = 26;BA.debugLine="Private orbitPane As B4XView";
playeruicontroller._orbitpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_orbitpane",playeruicontroller._orbitpane);
 //BA.debugLineNum = 27;BA.debugLine="Private accessCirclePane As B4XView";
playeruicontroller._accesscirclepane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_accesscirclepane",playeruicontroller._accesscirclepane);
 //BA.debugLineNum = 28;BA.debugLine="Private accessCorePane As B4XView";
playeruicontroller._accesscorepane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_accesscorepane",playeruicontroller._accesscorepane);
 //BA.debugLineNum = 29;BA.debugLine="Private accessInputPane As B4XView";
playeruicontroller._accessinputpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_accessinputpane",playeruicontroller._accessinputpane);
 //BA.debugLineNum = 30;BA.debugLine="Private iconCloudOk As String";
playeruicontroller._iconcloudok = RemoteObject.createImmutable("");__ref.setField("_iconcloudok",playeruicontroller._iconcloudok);
 //BA.debugLineNum = 31;BA.debugLine="Private iconCloudOff As String";
playeruicontroller._iconcloudoff = RemoteObject.createImmutable("");__ref.setField("_iconcloudoff",playeruicontroller._iconcloudoff);
 //BA.debugLineNum = 32;BA.debugLine="Private iconCloudDegraded As String";
playeruicontroller._iconclouddegraded = RemoteObject.createImmutable("");__ref.setField("_iconclouddegraded",playeruicontroller._iconclouddegraded);
 //BA.debugLineNum = 33;BA.debugLine="Private iconMore As String";
playeruicontroller._iconmore = RemoteObject.createImmutable("");__ref.setField("_iconmore",playeruicontroller._iconmore);
 //BA.debugLineNum = 34;BA.debugLine="Private iconClose As String";
playeruicontroller._iconclose = RemoteObject.createImmutable("");__ref.setField("_iconclose",playeruicontroller._iconclose);
 //BA.debugLineNum = 35;BA.debugLine="Private iconPlay As String";
playeruicontroller._iconplay = RemoteObject.createImmutable("");__ref.setField("_iconplay",playeruicontroller._iconplay);
 //BA.debugLineNum = 36;BA.debugLine="Private iconStop As String";
playeruicontroller._iconstop = RemoteObject.createImmutable("");__ref.setField("_iconstop",playeruicontroller._iconstop);
 //BA.debugLineNum = 37;BA.debugLine="Private playIconBaseSize As Float";
playeruicontroller._playiconbasesize = RemoteObject.createImmutable(0f);__ref.setField("_playiconbasesize",playeruicontroller._playiconbasesize);
 //BA.debugLineNum = 38;BA.debugLine="Private stopIconBaseSize As Float";
playeruicontroller._stopiconbasesize = RemoteObject.createImmutable(0f);__ref.setField("_stopiconbasesize",playeruicontroller._stopiconbasesize);
 //BA.debugLineNum = 39;BA.debugLine="Private headerActionFontSize As Float";
playeruicontroller._headeractionfontsize = RemoteObject.createImmutable(0f);__ref.setField("_headeractionfontsize",playeruicontroller._headeractionfontsize);
 //BA.debugLineNum = 40;BA.debugLine="Private codeFontSize As Float";
playeruicontroller._codefontsize = RemoteObject.createImmutable(0f);__ref.setField("_codefontsize",playeruicontroller._codefontsize);
 //BA.debugLineNum = 41;BA.debugLine="Private orbitFadeValue As Double";
playeruicontroller._orbitfadevalue = RemoteObject.createImmutable(0);__ref.setField("_orbitfadevalue",playeruicontroller._orbitfadevalue);
 //BA.debugLineNum = 42;BA.debugLine="Private orbitFadeTarget As Double";
playeruicontroller._orbitfadetarget = RemoteObject.createImmutable(0);__ref.setField("_orbitfadetarget",playeruicontroller._orbitfadetarget);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configureplayerheader(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfigurePlayerHeader (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("configureplayerheader")) { return __ref.runUserSub(false, "playeruicontroller","configureplayerheader", __ref);}
 BA.debugLineNum = 193;BA.debugLine="Public Sub ConfigurePlayerHeader";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="headerActionPane.Visible = True";
Debug.ShouldStop(2);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"setVisible",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 195;BA.debugLine="lblHeaderAction.Text = iconMore";
Debug.ShouldStop(4);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_iconmore" /*RemoteObject*/ ));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configuresetupscreen(RemoteObject __ref,RemoteObject _mode,RemoteObject _formattedplayercode,RemoteObject _messagetext,RemoteObject _setuptitle,RemoteObject _settingsthanks,RemoteObject _submittext,RemoteObject _logouttext) throws Exception{
try {
		Debug.PushSubsStack("ConfigureSetupScreen (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("configuresetupscreen")) { return __ref.runUserSub(false, "playeruicontroller","configuresetupscreen", __ref, _mode, _formattedplayercode, _messagetext, _setuptitle, _settingsthanks, _submittext, _logouttext);}
RemoteObject _issettingsmode = RemoteObject.createImmutable(false);
Debug.locals.put("mode", _mode);
Debug.locals.put("formattedPlayerCode", _formattedplayercode);
Debug.locals.put("messageText", _messagetext);
Debug.locals.put("setupTitle", _setuptitle);
Debug.locals.put("settingsThanks", _settingsthanks);
Debug.locals.put("submitText", _submittext);
Debug.locals.put("logoutText", _logouttext);
 BA.debugLineNum = 170;BA.debugLine="Public Sub ConfigureSetupScreen(mode As String, fo";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
Debug.ShouldStop(1024);
_issettingsmode = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("settings")));Debug.locals.put("isSettingsMode", _issettingsmode);Debug.locals.put("isSettingsMode", _issettingsmode);
 BA.debugLineNum = 172;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_mode,BA.ObjectToString("setup"))));
 BA.debugLineNum = 173;BA.debugLine="If isSettingsMode Then";
Debug.ShouldStop(4096);
if (_issettingsmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 174;BA.debugLine="lblHeaderAction.Text = iconClose";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_iconclose" /*RemoteObject*/ ));
 BA.debugLineNum = 175;BA.debugLine="txtPlayerCode.Editable = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setEditable",playeruicontroller.__c.getField(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="btnSetupSubmit.Text = logoutText.ToUpperCase";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnsetupsubmit" /*RemoteObject*/ ).runMethod(true,"setText",_logouttext.runMethod(true,"toUpperCase"));
 }else {
 BA.debugLineNum = 178;BA.debugLine="lblHeaderAction.Text = iconMore";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_iconmore" /*RemoteObject*/ ));
 BA.debugLineNum = 179;BA.debugLine="txtPlayerCode.Editable = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setEditable",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 180;BA.debugLine="btnSetupSubmit.Text = submitText.ToUpperCase";
Debug.ShouldStop(524288);
__ref.getField(false,"_btnsetupsubmit" /*RemoteObject*/ ).runMethod(true,"setText",_submittext.runMethod(true,"toUpperCase"));
 };
 BA.debugLineNum = 182;BA.debugLine="txtPlayerCode.Text = formattedPlayerCode";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setText",_formattedplayercode);
 BA.debugLineNum = 183;BA.debugLine="If messageText <> \"\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_messagetext,BA.ObjectToString(""))) { 
 BA.debugLineNum = 184;BA.debugLine="lblSetupMessage.Text = messageText";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runMethod(true,"setText",_messagetext);
 }else 
{ BA.debugLineNum = 185;BA.debugLine="Else If isSettingsMode Then";
Debug.ShouldStop(16777216);
if (_issettingsmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 186;BA.debugLine="lblSetupMessage.Text = settingsThanks";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runMethod(true,"setText",_settingsthanks);
 }else {
 BA.debugLineNum = 188;BA.debugLine="lblSetupMessage.Text = setupTitle";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runMethod(true,"setText",_setuptitle);
 }}
;
 BA.debugLineNum = 190;BA.debugLine="If formattedPlayerCode = \"\" Then lblHeader.Text =";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_formattedplayercode,BA.ObjectToString(""))) { 
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));};
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidecontentblocks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideContentBlocks (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("hidecontentblocks")) { return __ref.runUserSub(false, "playeruicontroller","hidecontentblocks", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Public Sub HideContentBlocks";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="HidePin";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 86;BA.debugLine="SetStreamText(\"\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstreamtext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 87;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 88;BA.debugLine="btnConfirmYes.Enabled = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 89;BA.debugLine="btnConfirmNo.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidepin(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HidePin (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("hidepin")) { return __ref.runUserSub(false, "playeruicontroller","hidepin", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Public Sub HidePin";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="confirmPane.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"setVisible",playeruicontroller.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="btnConfirmYes.Enabled = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="btnConfirmNo.Enabled = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _xuivalue,RemoteObject _streamlabel,RemoteObject _infolabel,RemoteObject _headerlabel,RemoteObject _connectioniconlabel,RemoteObject _headeractionlabel,RemoteObject _setupmessagelabel,RemoteObject _playiconlabel,RemoteObject _confirmpanevalue,RemoteObject _confirmyesbutton,RemoteObject _confirmnobutton,RemoteObject _setuppanevalue,RemoteObject _playerpanevalue,RemoteObject _headeractionpanevalue,RemoteObject _playbuttonpanevalue,RemoteObject _orbitpanevalue,RemoteObject _accesscirclepanevalue,RemoteObject _accesscorepanevalue,RemoteObject _accessinputpanevalue,RemoteObject _setupsubmitbutton,RemoteObject _playercodeinput,RemoteObject _playercodeinputview,RemoteObject _iconcloudokvalue,RemoteObject _iconcloudoffvalue,RemoteObject _iconclouddegradedvalue,RemoteObject _iconmorevalue,RemoteObject _iconclosevalue,RemoteObject _iconplayvalue,RemoteObject _iconstopvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playeruicontroller","initialize", __ref, _ba, _xuivalue, _streamlabel, _infolabel, _headerlabel, _connectioniconlabel, _headeractionlabel, _setupmessagelabel, _playiconlabel, _confirmpanevalue, _confirmyesbutton, _confirmnobutton, _setuppanevalue, _playerpanevalue, _headeractionpanevalue, _playbuttonpanevalue, _orbitpanevalue, _accesscirclepanevalue, _accesscorepanevalue, _accessinputpanevalue, _setupsubmitbutton, _playercodeinput, _playercodeinputview, _iconcloudokvalue, _iconcloudoffvalue, _iconclouddegradedvalue, _iconmorevalue, _iconclosevalue, _iconplayvalue, _iconstopvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("xuiValue", _xuivalue);
Debug.locals.put("streamLabel", _streamlabel);
Debug.locals.put("infoLabel", _infolabel);
Debug.locals.put("headerLabel", _headerlabel);
Debug.locals.put("connectionIconLabel", _connectioniconlabel);
Debug.locals.put("headerActionLabel", _headeractionlabel);
Debug.locals.put("setupMessageLabel", _setupmessagelabel);
Debug.locals.put("playIconLabel", _playiconlabel);
Debug.locals.put("confirmPaneValue", _confirmpanevalue);
Debug.locals.put("confirmYesButton", _confirmyesbutton);
Debug.locals.put("confirmNoButton", _confirmnobutton);
Debug.locals.put("setupPaneValue", _setuppanevalue);
Debug.locals.put("playerPaneValue", _playerpanevalue);
Debug.locals.put("headerActionPaneValue", _headeractionpanevalue);
Debug.locals.put("playButtonPaneValue", _playbuttonpanevalue);
Debug.locals.put("orbitPaneValue", _orbitpanevalue);
Debug.locals.put("accessCirclePaneValue", _accesscirclepanevalue);
Debug.locals.put("accessCorePaneValue", _accesscorepanevalue);
Debug.locals.put("accessInputPaneValue", _accessinputpanevalue);
Debug.locals.put("setupSubmitButton", _setupsubmitbutton);
Debug.locals.put("playerCodeInput", _playercodeinput);
Debug.locals.put("playerCodeInputView", _playercodeinputview);
Debug.locals.put("iconCloudOkValue", _iconcloudokvalue);
Debug.locals.put("iconCloudOffValue", _iconcloudoffvalue);
Debug.locals.put("iconCloudDegradedValue", _iconclouddegradedvalue);
Debug.locals.put("iconMoreValue", _iconmorevalue);
Debug.locals.put("iconCloseValue", _iconclosevalue);
Debug.locals.put("iconPlayValue", _iconplayvalue);
Debug.locals.put("iconStopValue", _iconstopvalue);
 BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize(xuiValue As XUI, streamLabel";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="xui = xuiValue";
Debug.ShouldStop(8192);
__ref.setField ("_xui" /*RemoteObject*/ ,_xuivalue);
 BA.debugLineNum = 47;BA.debugLine="lblStream = streamLabel";
Debug.ShouldStop(16384);
__ref.setField ("_lblstream" /*RemoteObject*/ ,_streamlabel);
 BA.debugLineNum = 48;BA.debugLine="lblInfo = infoLabel";
Debug.ShouldStop(32768);
__ref.setField ("_lblinfo" /*RemoteObject*/ ,_infolabel);
 BA.debugLineNum = 49;BA.debugLine="lblHeader = headerLabel";
Debug.ShouldStop(65536);
__ref.setField ("_lblheader" /*RemoteObject*/ ,_headerlabel);
 BA.debugLineNum = 50;BA.debugLine="lblConnectionIcon = connectionIconLabel";
Debug.ShouldStop(131072);
__ref.setField ("_lblconnectionicon" /*RemoteObject*/ ,_connectioniconlabel);
 BA.debugLineNum = 51;BA.debugLine="lblHeaderAction = headerActionLabel";
Debug.ShouldStop(262144);
__ref.setField ("_lblheaderaction" /*RemoteObject*/ ,_headeractionlabel);
 BA.debugLineNum = 52;BA.debugLine="lblSetupMessage = setupMessageLabel";
Debug.ShouldStop(524288);
__ref.setField ("_lblsetupmessage" /*RemoteObject*/ ,_setupmessagelabel);
 BA.debugLineNum = 53;BA.debugLine="lblPlayIcon = playIconLabel";
Debug.ShouldStop(1048576);
__ref.setField ("_lblplayicon" /*RemoteObject*/ ,_playiconlabel);
 BA.debugLineNum = 54;BA.debugLine="confirmPane = confirmPaneValue";
Debug.ShouldStop(2097152);
__ref.setField ("_confirmpane" /*RemoteObject*/ ,_confirmpanevalue);
 BA.debugLineNum = 55;BA.debugLine="btnConfirmYes = confirmYesButton";
Debug.ShouldStop(4194304);
__ref.setField ("_btnconfirmyes" /*RemoteObject*/ ,_confirmyesbutton);
 BA.debugLineNum = 56;BA.debugLine="btnConfirmNo = confirmNoButton";
Debug.ShouldStop(8388608);
__ref.setField ("_btnconfirmno" /*RemoteObject*/ ,_confirmnobutton);
 BA.debugLineNum = 57;BA.debugLine="setupPane = setupPaneValue";
Debug.ShouldStop(16777216);
__ref.setField ("_setuppane" /*RemoteObject*/ ,_setuppanevalue);
 BA.debugLineNum = 58;BA.debugLine="playerPane = playerPaneValue";
Debug.ShouldStop(33554432);
__ref.setField ("_playerpane" /*RemoteObject*/ ,_playerpanevalue);
 BA.debugLineNum = 59;BA.debugLine="headerActionPane = headerActionPaneValue";
Debug.ShouldStop(67108864);
__ref.setField ("_headeractionpane" /*RemoteObject*/ ,_headeractionpanevalue);
 BA.debugLineNum = 60;BA.debugLine="playButtonPane = playButtonPaneValue";
Debug.ShouldStop(134217728);
__ref.setField ("_playbuttonpane" /*RemoteObject*/ ,_playbuttonpanevalue);
 BA.debugLineNum = 61;BA.debugLine="orbitPane = orbitPaneValue";
Debug.ShouldStop(268435456);
__ref.setField ("_orbitpane" /*RemoteObject*/ ,_orbitpanevalue);
 BA.debugLineNum = 62;BA.debugLine="accessCirclePane = accessCirclePaneValue";
Debug.ShouldStop(536870912);
__ref.setField ("_accesscirclepane" /*RemoteObject*/ ,_accesscirclepanevalue);
 BA.debugLineNum = 63;BA.debugLine="accessCorePane = accessCorePaneValue";
Debug.ShouldStop(1073741824);
__ref.setField ("_accesscorepane" /*RemoteObject*/ ,_accesscorepanevalue);
 BA.debugLineNum = 64;BA.debugLine="accessInputPane = accessInputPaneValue";
Debug.ShouldStop(-2147483648);
__ref.setField ("_accessinputpane" /*RemoteObject*/ ,_accessinputpanevalue);
 BA.debugLineNum = 65;BA.debugLine="btnSetupSubmit = setupSubmitButton";
Debug.ShouldStop(1);
__ref.setField ("_btnsetupsubmit" /*RemoteObject*/ ,_setupsubmitbutton);
 BA.debugLineNum = 66;BA.debugLine="txtPlayerCode = playerCodeInput";
Debug.ShouldStop(2);
__ref.setField ("_txtplayercode" /*RemoteObject*/ ,_playercodeinput);
 BA.debugLineNum = 67;BA.debugLine="txtPlayerCodeView = playerCodeInputView";
Debug.ShouldStop(4);
__ref.setField ("_txtplayercodeview" /*RemoteObject*/ ,_playercodeinputview);
 BA.debugLineNum = 68;BA.debugLine="iconCloudOk = iconCloudOkValue";
Debug.ShouldStop(8);
__ref.setField ("_iconcloudok" /*RemoteObject*/ ,_iconcloudokvalue);
 BA.debugLineNum = 69;BA.debugLine="iconCloudOff = iconCloudOffValue";
Debug.ShouldStop(16);
__ref.setField ("_iconcloudoff" /*RemoteObject*/ ,_iconcloudoffvalue);
 BA.debugLineNum = 70;BA.debugLine="iconCloudDegraded = iconCloudDegradedValue";
Debug.ShouldStop(32);
__ref.setField ("_iconclouddegraded" /*RemoteObject*/ ,_iconclouddegradedvalue);
 BA.debugLineNum = 71;BA.debugLine="iconMore = iconMoreValue";
Debug.ShouldStop(64);
__ref.setField ("_iconmore" /*RemoteObject*/ ,_iconmorevalue);
 BA.debugLineNum = 72;BA.debugLine="iconClose = iconCloseValue";
Debug.ShouldStop(128);
__ref.setField ("_iconclose" /*RemoteObject*/ ,_iconclosevalue);
 BA.debugLineNum = 73;BA.debugLine="iconPlay = iconPlayValue";
Debug.ShouldStop(256);
__ref.setField ("_iconplay" /*RemoteObject*/ ,_iconplayvalue);
 BA.debugLineNum = 74;BA.debugLine="iconStop = iconStopValue";
Debug.ShouldStop(512);
__ref.setField ("_iconstop" /*RemoteObject*/ ,_iconstopvalue);
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
public static RemoteObject  _isorbitidle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsOrbitIdle (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("isorbitidle")) { return __ref.runUserSub(false, "playeruicontroller","isorbitidle", __ref);}
 BA.debugLineNum = 289;BA.debugLine="Public Sub IsOrbitIdle As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="Return orbitFadeValue = 0 And orbitFadeTarget = 0";
Debug.ShouldStop(2);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_orbitfadetarget" /*RemoteObject*/ ),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlist(RemoteObject __ref,RemoteObject _items,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("JoinList (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "playeruicontroller","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 374;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 375;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_items.runMethod(true,"IsInitialized"),playeruicontroller.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_items.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 376;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 377;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 378;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 379;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 380;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 382;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(536870912);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _renderplayerhead(RemoteObject __ref,RemoteObject _formattedcode,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("RenderPlayerHead (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("renderplayerhead")) { return __ref.runUserSub(false, "playeruicontroller","renderplayerhead", __ref, _formattedcode, _title);}
Debug.locals.put("formattedCode", _formattedcode);
Debug.locals.put("title", _title);
 BA.debugLineNum = 161;BA.debugLine="Public Sub RenderPlayerHead(formattedCode As Strin";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="If title <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_title,BA.ObjectToString(""))) { 
 BA.debugLineNum = 163;BA.debugLine="lblHeader.Text = formattedCode & \" • \" & title.T";
Debug.ShouldStop(4);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(_formattedcode,RemoteObject.createImmutable(" • "),_title.runMethod(true,"toUpperCase")));
 }else {
 BA.debugLineNum = 165;BA.debugLine="lblHeader.Text = formattedCode";
Debug.ShouldStop(16);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",_formattedcode);
 };
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
public static RemoteObject  _setplayicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPlayIcon (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("setplayicon")) { return __ref.runUserSub(false, "playeruicontroller","setplayicon", __ref);}
 BA.debugLineNum = 222;BA.debugLine="Public Sub SetPlayIcon";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="UiStyle.SetLabelStyle(lblPlayIcon, \"-fx-alignment";
Debug.ShouldStop(1073741824);
playeruicontroller._uistyle.runVoidMethod ("_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblplayicon" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xffd0ff71)))),RemoteObject.createImmutable("; -fx-padding: 0;"))));
 BA.debugLineNum = 224;BA.debugLine="lblPlayIcon.Text = iconPlay";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_iconplay" /*RemoteObject*/ ));
 BA.debugLineNum = 225;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, p";
Debug.ShouldStop(1);
playeruicontroller._uistyle.runVoidMethod ("_applymaterialiconfont" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblplayicon" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_playiconbasesize" /*RemoteObject*/ )));
 BA.debugLineNum = 226;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(2);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(int.class, ((int)0x00d0ff71))),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 227;BA.debugLine="StopOrbitAnimation";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_stoporbitanimation" /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="UpdatePlayButtonAppearance(False, False)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(playeruicontroller.__c.getField(true,"False")),(Object)(playeruicontroller.__c.getField(true,"False")));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatustext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetStatusText (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("setstatustext")) { return __ref.runUserSub(false, "playeruicontroller","setstatustext", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 130;BA.debugLine="Public Sub SetStatusText(text As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="lblInfo.Text = text";
Debug.ShouldStop(4);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstopicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStopIcon (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("setstopicon")) { return __ref.runUserSub(false, "playeruicontroller","setstopicon", __ref);}
 BA.debugLineNum = 231;BA.debugLine="Public Sub SetStopIcon";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="UiStyle.SetLabelStyle(lblPlayIcon, \"-fx-alignment";
Debug.ShouldStop(128);
playeruicontroller._uistyle.runVoidMethod ("_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblplayicon" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xffd0ff71)))),RemoteObject.createImmutable("; -fx-padding: 0;"))));
 BA.debugLineNum = 233;BA.debugLine="lblPlayIcon.Text = iconStop";
Debug.ShouldStop(256);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_iconstop" /*RemoteObject*/ ));
 BA.debugLineNum = 234;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblPlayIcon, s";
Debug.ShouldStop(512);
playeruicontroller._uistyle.runVoidMethod ("_applymaterialiconfont" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblplayicon" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_stopiconbasesize" /*RemoteObject*/ )));
 BA.debugLineNum = 235;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(1024);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(int.class, ((int)0x66d0ff71))),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 236;BA.debugLine="StartOrbitAnimation";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_startorbitanimation" /*RemoteObject*/ );
 BA.debugLineNum = 237;BA.debugLine="UpdatePlayButtonAppearance(False, True)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(playeruicontroller.__c.getField(true,"False")),(Object)(playeruicontroller.__c.getField(true,"True")));
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstreamtext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetStreamText (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setstreamtext")) { return __ref.runUserSub(false, "playeruicontroller","setstreamtext", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 126;BA.debugLine="Public Sub SetStreamText(text As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="lblStream.Text = text";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblstream" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showadmeta(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ShowAdMeta (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("showadmeta")) { return __ref.runUserSub(false, "playeruicontroller","showadmeta", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 122;BA.debugLine="Public Sub ShowAdMeta(item As Map)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstatustext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showclaimprompt(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ShowClaimPrompt (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("showclaimprompt")) { return __ref.runUserSub(false, "playeruicontroller","showclaimprompt", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 102;BA.debugLine="Public Sub ShowClaimPrompt(text As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="HideContentBlocks";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="SetStatusText(text)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstatustext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 105;BA.debugLine="confirmPane.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"setVisible",playeruicontroller.__c.getField(true,"True"));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showmessage(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ShowMessage (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("showmessage")) { return __ref.runUserSub(false, "playeruicontroller","showmessage", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 96;BA.debugLine="Public Sub ShowMessage(text As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="HideContentBlocks";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 98;BA.debugLine="SetStatusText(text)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstatustext" /*RemoteObject*/ ,(Object)(_text));
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
public static RemoteObject  _showstream(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ShowStream (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("showstream")) { return __ref.runUserSub(false, "playeruicontroller","showstream", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 92;BA.debugLine="Public Sub ShowStream(text As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="SetStreamText(text)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstreamtext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showtrackmeta(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ShowTrackMeta (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("showtrackmeta")) { return __ref.runUserSub(false, "playeruicontroller","showtrackmeta", __ref, _item);}
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("item", _item);
 BA.debugLineNum = 114;BA.debugLine="Public Sub ShowTrackMeta(item As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim parts As List";
Debug.ShouldStop(262144);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 116;BA.debugLine="parts.Initialize";
Debug.ShouldStop(524288);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_parts.runVoidMethod ("Add",(Object)(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set"))))));};
 BA.debugLineNum = 118;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_parts.runVoidMethod ("Add",(Object)(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code"))))));};
 BA.debugLineNum = 119;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstatustext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playeruicontroller.class, "_joinlist" /*RemoteObject*/ ,(Object)(_parts),(Object)(RemoteObject.createImmutable(" • ")))));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startorbitanimation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartOrbitAnimation (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("startorbitanimation")) { return __ref.runUserSub(false, "playeruicontroller","startorbitanimation", __ref);}
 BA.debugLineNum = 270;BA.debugLine="Public Sub StartOrbitAnimation";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="orbitFadeTarget = 1";
Debug.ShouldStop(16384);
__ref.setField ("_orbitfadetarget" /*RemoteObject*/ ,BA.numberCast(double.class, 1));
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stoporbitanimation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopOrbitAnimation (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("stoporbitanimation")) { return __ref.runUserSub(false, "playeruicontroller","stoporbitanimation", __ref);}
 BA.debugLineNum = 274;BA.debugLine="Public Sub StopOrbitAnimation";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="orbitFadeTarget = 0";
Debug.ShouldStop(262144);
__ref.setField ("_orbitfadetarget" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 276;BA.debugLine="If orbitFadeValue = 0 Then ApplyOrbitState(0)";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_orbitfadevalue" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_applyorbitstate" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)));};
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatecodeinputappearance(RemoteObject __ref,RemoteObject _isfocused) throws Exception{
try {
		Debug.PushSubsStack("UpdateCodeInputAppearance (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("updatecodeinputappearance")) { return __ref.runUserSub(false, "playeruicontroller","updatecodeinputappearance", __ref, _isfocused);}
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _orbitbordercolor = RemoteObject.createImmutable(0);
Debug.locals.put("isFocused", _isfocused);
 BA.debugLineNum = 330;BA.debugLine="Public Sub UpdateCodeInputAppearance(isFocused As";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(1024);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 332;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(2048);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 333;BA.debugLine="Dim orbitBorderColor As Int";
Debug.ShouldStop(4096);
_orbitbordercolor = RemoteObject.createImmutable(0);Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 BA.debugLineNum = 334;BA.debugLine="If isFocused Then";
Debug.ShouldStop(8192);
if (_isfocused.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 335;BA.debugLine="fillColor = 0x10FFFFFF";
Debug.ShouldStop(16384);
_fillcolor = BA.numberCast(int.class, ((int)0x10ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 336;BA.debugLine="borderColor = 0x77FFFFFF";
Debug.ShouldStop(32768);
_bordercolor = BA.numberCast(int.class, ((int)0x77ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 337;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
Debug.ShouldStop(65536);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x88ffffff));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 }else {
 BA.debugLineNum = 339;BA.debugLine="fillColor = 0x07FFFFFF";
Debug.ShouldStop(262144);
_fillcolor = BA.numberCast(int.class, ((int)0x07ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 340;BA.debugLine="borderColor = 0x55FFFFFF";
Debug.ShouldStop(524288);
_bordercolor = BA.numberCast(int.class, ((int)0x55ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 341;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
Debug.ShouldStop(1048576);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x66ffffff));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 };
 BA.debugLineNum = 343;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
Debug.ShouldStop(4194304);
__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_fillcolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 344;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
Debug.ShouldStop(8388608);
__ref.getField(false,"_accesscorepane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(_orbitbordercolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 345;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
Debug.ShouldStop(16777216);
__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 346;BA.debugLine="UiStyle.SetPaneStyle(accessCirclePane, \"-fx-backg";
Debug.ShouldStop(33554432);
playeruicontroller._uistyle.runVoidMethod ("_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 347;BA.debugLine="UiStyle.SetPaneStyle(accessCorePane, \"-fx-backgro";
Debug.ShouldStop(67108864);
playeruicontroller._uistyle.runVoidMethod ("_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscorepane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 348;BA.debugLine="UiStyle.SetPaneStyle(accessInputPane, \"-fx-backgr";
Debug.ShouldStop(134217728);
playeruicontroller._uistyle.runVoidMethod ("_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accessinputpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;")));
 BA.debugLineNum = 349;BA.debugLine="UiStyle.SetPaneStyle(txtPlayerCodeView, \"-fx-back";
Debug.ShouldStop(268435456);
playeruicontroller._uistyle.runVoidMethod ("_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xfff2f7fb)))),RemoteObject.createImmutable("; -fx-prompt-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x66ffffff)))),RemoteObject.createImmutable("; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xfff2f7fb)))),RemoteObject.createImmutable("; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "),__ref.getField(true,"_codefontsize" /*RemoteObject*/ ),RemoteObject.createImmutable("px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;"))));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateconnectionindicator(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("UpdateConnectionIndicator (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("updateconnectionindicator")) { return __ref.runUserSub(false, "playeruicontroller","updateconnectionindicator", __ref, _mode);}
RemoteObject _icontext = RemoteObject.createImmutable("");
RemoteObject _iconcolor = RemoteObject.createImmutable(0);
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 135;BA.debugLine="Public Sub UpdateConnectionIndicator(mode As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="If lblConnectionIcon.IsInitialized = False Then R";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblconnectionicon" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playeruicontroller.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 137;BA.debugLine="Dim iconText As String = iconCloudOk";
Debug.ShouldStop(256);
_icontext = __ref.getField(true,"_iconcloudok" /*RemoteObject*/ );Debug.locals.put("iconText", _icontext);Debug.locals.put("iconText", _icontext);
 BA.debugLineNum = 138;BA.debugLine="Dim iconColor As Int = 0xFF747B86";
Debug.ShouldStop(512);
_iconcolor = BA.numberCast(int.class, ((int)0xff747b86));Debug.locals.put("iconColor", _iconcolor);Debug.locals.put("iconColor", _iconcolor);
 BA.debugLineNum = 139;BA.debugLine="Select mode";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_mode,BA.ObjectToString("online"),BA.ObjectToString("offline"),BA.ObjectToString("server"),BA.ObjectToString("local"),BA.ObjectToString("degraded"),BA.ObjectToString("connecting"))) {
case 0: {
 BA.debugLineNum = 141;BA.debugLine="iconText = iconCloudOk";
Debug.ShouldStop(4096);
_icontext = __ref.getField(true,"_iconcloudok" /*RemoteObject*/ );Debug.locals.put("iconText", _icontext);
 BA.debugLineNum = 142;BA.debugLine="iconColor = 0xFFD0FF71";
Debug.ShouldStop(8192);
_iconcolor = BA.numberCast(int.class, ((int)0xffd0ff71));Debug.locals.put("iconColor", _iconcolor);
 break; }
case 1: 
case 2: {
 BA.debugLineNum = 144;BA.debugLine="iconText = iconCloudOff";
Debug.ShouldStop(32768);
_icontext = __ref.getField(true,"_iconcloudoff" /*RemoteObject*/ );Debug.locals.put("iconText", _icontext);
 BA.debugLineNum = 145;BA.debugLine="iconColor = 0xFFFF6B6B";
Debug.ShouldStop(65536);
_iconcolor = BA.numberCast(int.class, ((int)0xffff6b6b));Debug.locals.put("iconColor", _iconcolor);
 break; }
case 3: {
 BA.debugLineNum = 147;BA.debugLine="iconText = iconCloudDegraded";
Debug.ShouldStop(262144);
_icontext = __ref.getField(true,"_iconclouddegraded" /*RemoteObject*/ );Debug.locals.put("iconText", _icontext);
 BA.debugLineNum = 148;BA.debugLine="iconColor = 0xFFFFD166";
Debug.ShouldStop(524288);
_iconcolor = BA.numberCast(int.class, ((int)0xffffd166));Debug.locals.put("iconColor", _iconcolor);
 break; }
case 4: {
 BA.debugLineNum = 150;BA.debugLine="iconText = iconCloudDegraded";
Debug.ShouldStop(2097152);
_icontext = __ref.getField(true,"_iconclouddegraded" /*RemoteObject*/ );Debug.locals.put("iconText", _icontext);
 BA.debugLineNum = 151;BA.debugLine="iconColor = 0xFFFFD166";
Debug.ShouldStop(4194304);
_iconcolor = BA.numberCast(int.class, ((int)0xffffd166));Debug.locals.put("iconColor", _iconcolor);
 break; }
case 5: {
 BA.debugLineNum = 153;BA.debugLine="iconText = iconCloudOk";
Debug.ShouldStop(16777216);
_icontext = __ref.getField(true,"_iconcloudok" /*RemoteObject*/ );Debug.locals.put("iconText", _icontext);
 BA.debugLineNum = 154;BA.debugLine="iconColor = 0xFF8E97A3";
Debug.ShouldStop(33554432);
_iconcolor = BA.numberCast(int.class, ((int)0xff8e97a3));Debug.locals.put("iconColor", _iconcolor);
 break; }
}
;
 BA.debugLineNum = 156;BA.debugLine="lblConnectionIcon.Text = iconText";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblconnectionicon" /*RemoteObject*/ ).runMethod(true,"setText",_icontext);
 BA.debugLineNum = 157;BA.debugLine="UiStyle.SetLabelStyle(lblConnectionIcon, \"-fx-ali";
Debug.ShouldStop(268435456);
playeruicontroller._uistyle.runVoidMethod ("_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblconnectionicon" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(_iconcolor)),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 158;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
Debug.ShouldStop(536870912);
playeruicontroller._uistyle.runVoidMethod ("_applymaterialiconfont" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblconnectionicon" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateheaderactionappearance(RemoteObject __ref,RemoteObject _ishovered) throws Exception{
try {
		Debug.PushSubsStack("UpdateHeaderActionAppearance (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("updateheaderactionappearance")) { return __ref.runUserSub(false, "playeruicontroller","updateheaderactionappearance", __ref, _ishovered);}
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("isHovered", _ishovered);
 BA.debugLineNum = 293;BA.debugLine="Public Sub UpdateHeaderActionAppearance(isHovered";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(32);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 295;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(64);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 296;BA.debugLine="Dim textColor As Int";
Debug.ShouldStop(128);
_textcolor = RemoteObject.createImmutable(0);Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 297;BA.debugLine="If isHovered Then";
Debug.ShouldStop(256);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 298;BA.debugLine="fillColor = 0x14FFFFFF";
Debug.ShouldStop(512);
_fillcolor = BA.numberCast(int.class, ((int)0x14ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 299;BA.debugLine="borderColor = 0x30FFFFFF";
Debug.ShouldStop(1024);
_bordercolor = BA.numberCast(int.class, ((int)0x30ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 300;BA.debugLine="textColor = 0xFFDDE6EF";
Debug.ShouldStop(2048);
_textcolor = BA.numberCast(int.class, ((int)0xffdde6ef));Debug.locals.put("textColor", _textcolor);
 }else {
 BA.debugLineNum = 302;BA.debugLine="fillColor = 0x08FFFFFF";
Debug.ShouldStop(8192);
_fillcolor = BA.numberCast(int.class, ((int)0x08ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 303;BA.debugLine="borderColor = 0x18FFFFFF";
Debug.ShouldStop(16384);
_bordercolor = BA.numberCast(int.class, ((int)0x18ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 304;BA.debugLine="textColor = 0xFFB9C0C9";
Debug.ShouldStop(32768);
_textcolor = BA.numberCast(int.class, ((int)0xffb9c0c9));Debug.locals.put("textColor", _textcolor);
 };
 BA.debugLineNum = 306;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
Debug.ShouldStop(131072);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_fillcolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 307;BA.debugLine="UiStyle.SetPaneStyle(headerActionPane, \"-fx-curso";
Debug.ShouldStop(262144);
playeruicontroller._uistyle.runVoidMethod ("_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_headeractionpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 308;BA.debugLine="UiStyle.SetLabelStyle(lblHeaderAction, \"-fx-align";
Debug.ShouldStop(524288);
playeruicontroller._uistyle.runVoidMethod ("_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(_textcolor)),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 309;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblHeaderActio";
Debug.ShouldStop(1048576);
playeruicontroller._uistyle.runVoidMethod ("_applymaterialiconfont" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_headeractionfontsize" /*RemoteObject*/ )));
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateplaybuttonappearance(RemoteObject __ref,RemoteObject _ishovered,RemoteObject _isstarted) throws Exception{
try {
		Debug.PushSubsStack("UpdatePlayButtonAppearance (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("updateplaybuttonappearance")) { return __ref.runUserSub(false, "playeruicontroller","updateplaybuttonappearance", __ref, _ishovered, _isstarted);}
RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _orbitbordercolor = RemoteObject.createImmutable(0);
Debug.locals.put("isHovered", _ishovered);
Debug.locals.put("isStarted", _isstarted);
 BA.debugLineNum = 240;BA.debugLine="Public Sub UpdatePlayButtonAppearance(isHovered As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="Dim backgroundColor As Int";
Debug.ShouldStop(65536);
_backgroundcolor = RemoteObject.createImmutable(0);Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 242;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(131072);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 243;BA.debugLine="Dim orbitBorderColor As Int";
Debug.ShouldStop(262144);
_orbitbordercolor = RemoteObject.createImmutable(0);Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 BA.debugLineNum = 244;BA.debugLine="If isStarted Then";
Debug.ShouldStop(524288);
if (_isstarted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 245;BA.debugLine="If isHovered Then";
Debug.ShouldStop(1048576);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 246;BA.debugLine="backgroundColor = 0x12FFFFFF";
Debug.ShouldStop(2097152);
_backgroundcolor = BA.numberCast(int.class, ((int)0x12ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 247;BA.debugLine="borderColor = 0x77FFFFFF";
Debug.ShouldStop(4194304);
_bordercolor = BA.numberCast(int.class, ((int)0x77ffffff));Debug.locals.put("borderColor", _bordercolor);
 }else {
 BA.debugLineNum = 249;BA.debugLine="backgroundColor = 0x08FFFFFF";
Debug.ShouldStop(16777216);
_backgroundcolor = BA.numberCast(int.class, ((int)0x08ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 250;BA.debugLine="borderColor = 0x55FFFFFF";
Debug.ShouldStop(33554432);
_bordercolor = BA.numberCast(int.class, ((int)0x55ffffff));Debug.locals.put("borderColor", _bordercolor);
 };
 }else {
 BA.debugLineNum = 253;BA.debugLine="If isHovered Then";
Debug.ShouldStop(268435456);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 254;BA.debugLine="backgroundColor = 0x12FFFFFF";
Debug.ShouldStop(536870912);
_backgroundcolor = BA.numberCast(int.class, ((int)0x12ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 255;BA.debugLine="borderColor = 0x55D0FF71";
Debug.ShouldStop(1073741824);
_bordercolor = BA.numberCast(int.class, ((int)0x55d0ff71));Debug.locals.put("borderColor", _bordercolor);
 }else {
 BA.debugLineNum = 257;BA.debugLine="backgroundColor = 0x07FFFFFF";
Debug.ShouldStop(1);
_backgroundcolor = BA.numberCast(int.class, ((int)0x07ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 258;BA.debugLine="borderColor = 0x40FFFFFF";
Debug.ShouldStop(2);
_bordercolor = BA.numberCast(int.class, ((int)0x40ffffff));Debug.locals.put("borderColor", _bordercolor);
 };
 };
 BA.debugLineNum = 261;BA.debugLine="If isStarted Or isHovered Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",_isstarted) || RemoteObject.solveBoolean(".",_ishovered)) { 
 BA.debugLineNum = 262;BA.debugLine="orbitBorderColor = 0x66D0FF71";
Debug.ShouldStop(32);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x66d0ff71));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 }else {
 BA.debugLineNum = 264;BA.debugLine="orbitBorderColor = 0x22D0FF71";
Debug.ShouldStop(128);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x22d0ff71));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 };
 BA.debugLineNum = 266;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
Debug.ShouldStop(512);
__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_backgroundcolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 267;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(1024);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(_orbitbordercolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateresponsivestyles(RemoteObject __ref,RemoteObject _streamfontsize,RemoteObject _infofontsize,RemoteObject _playfontsize,RemoteObject _stopfontsize,RemoteObject _headeractionsizevalue,RemoteObject _codesize,RemoteObject _iscodeinputfocused,RemoteObject _showstopicon) throws Exception{
try {
		Debug.PushSubsStack("UpdateResponsiveStyles (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("updateresponsivestyles")) { return __ref.runUserSub(false, "playeruicontroller","updateresponsivestyles", __ref, _streamfontsize, _infofontsize, _playfontsize, _stopfontsize, _headeractionsizevalue, _codesize, _iscodeinputfocused, _showstopicon);}
Debug.locals.put("streamFontSize", _streamfontsize);
Debug.locals.put("infoFontSize", _infofontsize);
Debug.locals.put("playFontSize", _playfontsize);
Debug.locals.put("stopFontSize", _stopfontsize);
Debug.locals.put("headerActionSizeValue", _headeractionsizevalue);
Debug.locals.put("codeSize", _codesize);
Debug.locals.put("isCodeInputFocused", _iscodeinputfocused);
Debug.locals.put("showStopIcon", _showstopicon);
 BA.debugLineNum = 205;BA.debugLine="Public Sub UpdateResponsiveStyles(streamFontSize A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="playIconBaseSize = playFontSize";
Debug.ShouldStop(8192);
__ref.setField ("_playiconbasesize" /*RemoteObject*/ ,_playfontsize);
 BA.debugLineNum = 207;BA.debugLine="stopIconBaseSize = stopFontSize";
Debug.ShouldStop(16384);
__ref.setField ("_stopiconbasesize" /*RemoteObject*/ ,_stopfontsize);
 BA.debugLineNum = 208;BA.debugLine="headerActionFontSize = headerActionSizeValue";
Debug.ShouldStop(32768);
__ref.setField ("_headeractionfontsize" /*RemoteObject*/ ,_headeractionsizevalue);
 BA.debugLineNum = 209;BA.debugLine="codeFontSize = codeSize";
Debug.ShouldStop(65536);
__ref.setField ("_codefontsize" /*RemoteObject*/ ,_codesize);
 BA.debugLineNum = 210;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblstream" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(_streamfontsize)));
 BA.debugLineNum = 211;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(_infofontsize)));
 BA.debugLineNum = 212;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
Debug.ShouldStop(524288);
playeruicontroller._uistyle.runVoidMethod ("_applymaterialiconfont" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_lblconnectionicon" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 16)));
 BA.debugLineNum = 213;BA.debugLine="UpdateHeaderActionAppearance(False)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_updateheaderactionappearance" /*RemoteObject*/ ,(Object)(playeruicontroller.__c.getField(true,"False")));
 BA.debugLineNum = 214;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_updatecodeinputappearance" /*RemoteObject*/ ,(Object)(_iscodeinputfocused));
 BA.debugLineNum = 215;BA.debugLine="If showStopIcon Then";
Debug.ShouldStop(4194304);
if (_showstopicon.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 216;BA.debugLine="SetStopIcon";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setstopicon" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 218;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.playeruicontroller.class, "_setplayicon" /*RemoteObject*/ );
 };
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetextbuttonappearance(RemoteObject __ref,RemoteObject _buttonview,RemoteObject _ishovered) throws Exception{
try {
		Debug.PushSubsStack("UpdateTextButtonAppearance (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("updatetextbuttonappearance")) { return __ref.runUserSub(false, "playeruicontroller","updatetextbuttonappearance", __ref, _buttonview, _ishovered);}
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("buttonView", _buttonview);
Debug.locals.put("isHovered", _ishovered);
 BA.debugLineNum = 312;BA.debugLine="Public Sub UpdateTextButtonAppearance(buttonView A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(16777216);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 314;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(33554432);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 315;BA.debugLine="Dim textColor As Int";
Debug.ShouldStop(67108864);
_textcolor = RemoteObject.createImmutable(0);Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 316;BA.debugLine="If isHovered Then";
Debug.ShouldStop(134217728);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 317;BA.debugLine="fillColor = 0x12FFFFFF";
Debug.ShouldStop(268435456);
_fillcolor = BA.numberCast(int.class, ((int)0x12ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 318;BA.debugLine="borderColor = 0x34FFFFFF";
Debug.ShouldStop(536870912);
_bordercolor = BA.numberCast(int.class, ((int)0x34ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 319;BA.debugLine="textColor = 0xFFF2F7FB";
Debug.ShouldStop(1073741824);
_textcolor = BA.numberCast(int.class, ((int)0xfff2f7fb));Debug.locals.put("textColor", _textcolor);
 }else {
 BA.debugLineNum = 321;BA.debugLine="fillColor = 0x06FFFFFF";
Debug.ShouldStop(1);
_fillcolor = BA.numberCast(int.class, ((int)0x06ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 322;BA.debugLine="borderColor = 0x1EFFFFFF";
Debug.ShouldStop(2);
_bordercolor = BA.numberCast(int.class, ((int)0x1effffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 323;BA.debugLine="textColor = 0xFFE0E4EA";
Debug.ShouldStop(4);
_textcolor = BA.numberCast(int.class, ((int)0xffe0e4ea));Debug.locals.put("textColor", _textcolor);
 };
 BA.debugLineNum = 325;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
Debug.ShouldStop(16);
_buttonview.runVoidMethod ("SetColorAndBorder",(Object)(_fillcolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, playeruicontroller.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12))))));
 BA.debugLineNum = 326;BA.debugLine="UiStyle.SetPaneStyle(buttonView, \"-fx-cursor: han";
Debug.ShouldStop(32);
playeruicontroller._uistyle.runVoidMethod ("_setpanestyle" /*RemoteObject*/ ,(Object)(_buttonview),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "),playeruicontroller._uistyle.runMethod(true,"_colortocss" /*RemoteObject*/ ,(Object)(_textcolor)),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 327;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
Debug.ShouldStop(64);
_buttonview.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 13))));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatevisiblemode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleMode (playeruicontroller) ","playeruicontroller",2,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("updatevisiblemode")) { return __ref.runUserSub(false, "playeruicontroller","updatevisiblemode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 199;BA.debugLine="Public Sub UpdateVisibleMode(mode As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="setupPane.Visible = mode <> \"player\"";
Debug.ShouldStop(128);
__ref.getField(false,"_setuppane" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_mode,BA.ObjectToString("player"))));
 BA.debugLineNum = 201;BA.debugLine="playerPane.Visible = mode = \"player\"";
Debug.ShouldStop(256);
__ref.getField(false,"_playerpane" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("player"))));
 BA.debugLineNum = 202;BA.debugLine="If mode = \"setup\" Then headerActionPane.Visible =";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("setup"))) { 
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"setVisible",playeruicontroller.__c.getField(true,"False"));};
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}