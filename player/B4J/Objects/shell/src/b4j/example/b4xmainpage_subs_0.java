package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _activateloadeditem(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item,RemoteObject _fadeinms) throws Exception{
try {
		Debug.PushSubsStack("ActivateLoadedItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,713);
if (RapidSub.canDelegate("activateloadeditem")) { return __ref.runUserSub(false, "b4xmainpage","activateloadeditem", __ref, _audiokey, _item, _fadeinms);}
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
Debug.locals.put("fadeInMs", _fadeinms);
 BA.debugLineNum = 713;BA.debugLine="Private Sub ActivateLoadedItem(audioKey As String,";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="activeAudioKey = audioKey";
Debug.ShouldStop(512);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 715;BA.debugLine="activeItem = CloneMap(item)";
Debug.ShouldStop(1024);
__ref.setField ("_activeitem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clonemap" /*RemoteObject*/ ,(Object)(_item)));
 BA.debugLineNum = 716;BA.debugLine="currentTrackUrl = MediaUrl(item)";
Debug.ShouldStop(2048);
__ref.setField ("_currenttrackurl" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mediaurl" /*RemoteObject*/ ,(Object)(_item)));
 BA.debugLineNum = 717;BA.debugLine="currentMediaType = item.GetDefault(\"type\", \"\")";
Debug.ShouldStop(4096);
__ref.setField ("_currentmediatype" /*RemoteObject*/ ,BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 718;BA.debugLine="isCrossfadeTriggered = False";
Debug.ShouldStop(8192);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 719;BA.debugLine="If preparedAudioKey = audioKey Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),_audiokey)) { 
 BA.debugLineNum = 720;BA.debugLine="preparedAudioKey = \"\"";
Debug.ShouldStop(32768);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 721;BA.debugLine="preparedItem.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 723;BA.debugLine="UpdatePlaybackMeta(item)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateplaybackmeta" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 724;BA.debugLine="GetAudioByKey(audioKey).PlayWithFade(fadeInMs)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(_audiokey)).runClassMethod (b4j.example.audioplayer.class, "_playwithfade" /*RemoteObject*/ ,(Object)(_fadeinms));
 BA.debugLineNum = 725;BA.debugLine="ScheduleHistoryLog(item)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_schedulehistorylog" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 726;BA.debugLine="ResetRetryDelay";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_resetretrydelay" /*RemoteObject*/ );
 BA.debugLineNum = 727;BA.debugLine="prefetchDone = False";
Debug.ShouldStop(4194304);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applystoppedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ApplyStoppedState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1460);
if (RapidSub.canDelegate("applystoppedstate")) { return __ref.runUserSub(false, "b4xmainpage","applystoppedstate", __ref);}
 BA.debugLineNum = 1460;BA.debugLine="Private Sub ApplyStoppedState";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1461;BA.debugLine="ShowStream(MessageValue(\"idle_stream\"))";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showstream" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("idle_stream")))));
 BA.debugLineNum = 1462;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1463;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audioprimary_complete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AudioPrimary_Complete (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1290);
if (RapidSub.canDelegate("audioprimary_complete")) { return __ref.runUserSub(false, "b4xmainpage","audioprimary_complete", __ref);}
 BA.debugLineNum = 1290;BA.debugLine="Private Sub AudioPrimary_Complete";
Debug.ShouldStop(512);
 BA.debugLineNum = 1291;BA.debugLine="HandleAudioComplete(\"primary\")";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudiocomplete" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("primary")));
 BA.debugLineNum = 1292;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audioprimary_error(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("AudioPrimary_Error (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1282);
if (RapidSub.canDelegate("audioprimary_error")) { return __ref.runUserSub(false, "b4xmainpage","audioprimary_error", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 1282;BA.debugLine="Private Sub AudioPrimary_Error(message As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1283;BA.debugLine="HandleAudioError(\"primary\", message)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudioerror" /*RemoteObject*/ ,(Object)(BA.ObjectToString("primary")),(Object)(_message));
 BA.debugLineNum = 1284;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audioprimary_ready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AudioPrimary_Ready (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1274);
if (RapidSub.canDelegate("audioprimary_ready")) { return __ref.runUserSub(false, "b4xmainpage","audioprimary_ready", __ref);}
 BA.debugLineNum = 1274;BA.debugLine="Private Sub AudioPrimary_Ready";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1275;BA.debugLine="HandleAudioReady(\"primary\")";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudioready" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("primary")));
 BA.debugLineNum = 1276;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audioprimary_timeupdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AudioPrimary_Timeupdate (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1298);
if (RapidSub.canDelegate("audioprimary_timeupdate")) { return __ref.runUserSub(false, "b4xmainpage","audioprimary_timeupdate", __ref);}
 BA.debugLineNum = 1298;BA.debugLine="Private Sub AudioPrimary_Timeupdate";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1299;BA.debugLine="HandleAudioTimeupdate(\"primary\")";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudiotimeupdate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("primary")));
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audiosecondary_complete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AudioSecondary_Complete (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1294);
if (RapidSub.canDelegate("audiosecondary_complete")) { return __ref.runUserSub(false, "b4xmainpage","audiosecondary_complete", __ref);}
 BA.debugLineNum = 1294;BA.debugLine="Private Sub AudioSecondary_Complete";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1295;BA.debugLine="HandleAudioComplete(\"secondary\")";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudiocomplete" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("secondary")));
 BA.debugLineNum = 1296;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audiosecondary_error(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("AudioSecondary_Error (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1286);
if (RapidSub.canDelegate("audiosecondary_error")) { return __ref.runUserSub(false, "b4xmainpage","audiosecondary_error", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 1286;BA.debugLine="Private Sub AudioSecondary_Error(message As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 1287;BA.debugLine="HandleAudioError(\"secondary\", message)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudioerror" /*RemoteObject*/ ,(Object)(BA.ObjectToString("secondary")),(Object)(_message));
 BA.debugLineNum = 1288;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audiosecondary_ready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AudioSecondary_Ready (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1278);
if (RapidSub.canDelegate("audiosecondary_ready")) { return __ref.runUserSub(false, "b4xmainpage","audiosecondary_ready", __ref);}
 BA.debugLineNum = 1278;BA.debugLine="Private Sub AudioSecondary_Ready";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1279;BA.debugLine="HandleAudioReady(\"secondary\")";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudioready" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("secondary")));
 BA.debugLineNum = 1280;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _audiosecondary_timeupdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AudioSecondary_Timeupdate (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1302);
if (RapidSub.canDelegate("audiosecondary_timeupdate")) { return __ref.runUserSub(false, "b4xmainpage","audiosecondary_timeupdate", __ref);}
 BA.debugLineNum = 1302;BA.debugLine="Private Sub AudioSecondary_Timeupdate";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1303;BA.debugLine="HandleAudioTimeupdate(\"secondary\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleaudiotimeupdate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("secondary")));
 BA.debugLineNum = 1304;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("root1", _root1);
 BA.debugLineNum = 115;BA.debugLine="Private Sub B4XPage_Created (root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="rootView = root1";
Debug.ShouldStop(524288);
__ref.setField ("_rootview" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 117;BA.debugLine="rootView.Color = 0xFF0E0F11";
Debug.ShouldStop(1048576);
__ref.getField(false,"_rootview" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, ((int)0xff0e0f11)));
 BA.debugLineNum = 118;BA.debugLine="InitSettings";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_initsettings" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="InitState";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_initstate" /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="BuildUi";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_buildui" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="audioPrimary.Initialize(\"AudioPrimary\", Me)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_audioprimary" /*RemoteObject*/ ).runClassMethod (b4j.example.audioplayer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("AudioPrimary")),(Object)(__ref));
 BA.debugLineNum = 122;BA.debugLine="audioSecondary.Initialize(\"AudioSecondary\", Me)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_audiosecondary" /*RemoteObject*/ ).runClassMethod (b4j.example.audioplayer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("AudioSecondary")),(Object)(__ref));
 BA.debugLineNum = 123;BA.debugLine="ShowInitialScreen";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showinitialscreen" /*RemoteObject*/ );
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
public static RemoteObject  _b4xpage_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Resize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("b4xpage_resize")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_resize", __ref, _width, _height);}
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 126;BA.debugLine="Private Sub B4XPage_Resize (width As Int, height A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="If card.IsInitialized = False Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_card" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 128;BA.debugLine="LayoutUi(width, height)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_layoutui" /*RemoteObject*/ ,(Object)(_width),(Object)(_height));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _breaktimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BreakTimer_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1125);
if (RapidSub.canDelegate("breaktimer_tick")) { __ref.runUserSub(false, "b4xmainpage","breaktimer_tick", __ref); return;}
ResumableSub_BreakTimer_Tick rsub = new ResumableSub_BreakTimer_Tick(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BreakTimer_Tick extends BA.ResumableSub {
public ResumableSub_BreakTimer_Tick(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BreakTimer_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1125);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1126;BA.debugLine="breakTimer.Enabled = False";
Debug.ShouldStop(32);
__ref.getField(false,"_breaktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1127;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1128;BA.debugLine="If ShouldTriggerBreakNow = False Then Return";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_shouldtriggerbreaknow" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1129;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused As";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "breaktimer_tick"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fadeoutandcontinue" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1130;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _unused) throws Exception{
}
public static RemoteObject  _bringtofront(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("BringToFront (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1455);
if (RapidSub.canDelegate("bringtofront")) { return __ref.runUserSub(false, "b4xmainpage","bringtofront", __ref, _view);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
 BA.debugLineNum = 1455;BA.debugLine="Private Sub BringToFront(view As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1456;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(32768);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1457;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("toFront")),(Object)((b4xmainpage.__c.getField(false,"Null"))));
 BA.debugLineNum = 1458;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfirmno_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnConfirmNo_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("btnconfirmno_click")) { return __ref.runUserSub(false, "b4xmainpage","btnconfirmno_click", __ref);}
 BA.debugLineNum = 573;BA.debugLine="Private Sub BtnConfirmNo_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="HidePin";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 575;BA.debugLine="ApplyStoppedState";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_applystoppedstate" /*RemoteObject*/ );
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnconfirmyes_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnConfirmYes_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("btnconfirmyes_click")) { __ref.runUserSub(false, "b4xmainpage","btnconfirmyes_click", __ref); return;}
ResumableSub_BtnConfirmYes_Click rsub = new ResumableSub_BtnConfirmYes_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnConfirmYes_Click extends BA.ResumableSub {
public ResumableSub_BtnConfirmYes_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnConfirmYes_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,569);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 570;BA.debugLine="Wait For (SubmitClaim) Complete (unused As Boolea";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btnconfirmyes_click"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_submitclaim" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnsetupsubmit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BtnSetupSubmit_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("btnsetupsubmit_click")) { __ref.runUserSub(false, "b4xmainpage","btnsetupsubmit_click", __ref); return;}
ResumableSub_BtnSetupSubmit_Click rsub = new ResumableSub_BtnSetupSubmit_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnSetupSubmit_Click extends BA.ResumableSub {
public ResumableSub_BtnSetupSubmit_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);
RemoteObject _unused2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnSetupSubmit_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,561);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 562;BA.debugLine="If appScreenMode = \"settings\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("settings"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 563;BA.debugLine="Wait For (LogoutPlayer) Complete (unused As Bool";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btnsetupsubmit_click"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_logoutplayer" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 565;BA.debugLine="Wait For (SubmitPlayerCode) Complete (unused2 As";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btnsetupsubmit_click"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_submitplayercode" /*RemoteObject*/ ));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_unused2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused2", _unused2);
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _buildparams(RemoteObject __ref,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("BuildParams (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1623);
if (RapidSub.canDelegate("buildparams")) { return __ref.runUserSub(false, "b4xmainpage","buildparams", __ref, _params);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("params", _params);
 BA.debugLineNum = 1623;BA.debugLine="Private Sub BuildParams(params As Map) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1624;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1625;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1626;BA.debugLine="For Each key As String In params.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group3 = _params.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1627;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&")));};
 BA.debugLineNum = 1628;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
Debug.ShouldStop(134217728);
_sb.runMethod(false,"Append",(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_urlencode" /*RemoteObject*/ ,(Object)((_key))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("="))).runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_urlencode" /*RemoteObject*/ ,(Object)(_params.runMethod(false,"Get",(Object)((_key)))))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1630;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(536870912);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 1631;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUi (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("buildui")) { return __ref.runUserSub(false, "b4xmainpage","buildui", __ref);}
 BA.debugLineNum = 176;BA.debugLine="Private Sub BuildUi";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="card = xui.CreatePanel(\"\")";
Debug.ShouldStop(65536);
__ref.setField ("_card" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 178;BA.debugLine="headerPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(131072);
__ref.setField ("_headerpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 179;BA.debugLine="headerActionPane = xui.CreatePanel(\"HeaderActionP";
Debug.ShouldStop(262144);
__ref.setField ("_headeractionpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("HeaderActionPane"))));
 BA.debugLineNum = 180;BA.debugLine="contentPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(524288);
__ref.setField ("_contentpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 181;BA.debugLine="footerPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(1048576);
__ref.setField ("_footerpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 182;BA.debugLine="setupPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(2097152);
__ref.setField ("_setuppane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 183;BA.debugLine="playerPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
__ref.setField ("_playerpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 184;BA.debugLine="setupHeroPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(8388608);
__ref.setField ("_setupheropane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 185;BA.debugLine="setupDetailPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(16777216);
__ref.setField ("_setupdetailpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 186;BA.debugLine="setupPrimaryPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(33554432);
__ref.setField ("_setupprimarypane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 187;BA.debugLine="setupStatusPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(67108864);
__ref.setField ("_setupstatuspane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 188;BA.debugLine="playerHeroPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(134217728);
__ref.setField ("_playerheropane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 189;BA.debugLine="playerDetailPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(268435456);
__ref.setField ("_playerdetailpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 190;BA.debugLine="playerPrimaryPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(536870912);
__ref.setField ("_playerprimarypane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 191;BA.debugLine="playerStatusPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_playerstatuspane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 192;BA.debugLine="orbitPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_orbitpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 193;BA.debugLine="playButtonPane = xui.CreatePanel(\"PlayButtonPane\"";
Debug.ShouldStop(1);
__ref.setField ("_playbuttonpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PlayButtonPane"))));
 BA.debugLineNum = 194;BA.debugLine="confirmPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(2);
__ref.setField ("_confirmpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 195;BA.debugLine="accessCirclePane = xui.CreatePanel(\"\")";
Debug.ShouldStop(4);
__ref.setField ("_accesscirclepane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 196;BA.debugLine="accessCorePane = xui.CreatePanel(\"\")";
Debug.ShouldStop(8);
__ref.setField ("_accesscorepane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 197;BA.debugLine="accessInputPane = xui.CreatePanel(\"\")";
Debug.ShouldStop(16);
__ref.setField ("_accessinputpane" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 199;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
Debug.ShouldStop(64);
__ref.getField(false,"_card" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xff1a1b1e))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, ((int)0x14ffffff))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24))))));
 BA.debugLineNum = 200;BA.debugLine="accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4d";
Debug.ShouldStop(128);
__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0x07ffffff))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 201;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
Debug.ShouldStop(256);
__ref.getField(false,"_accesscorepane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(int.class, ((int)0x66ffffff))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 202;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
Debug.ShouldStop(512);
__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 203;BA.debugLine="playButtonPane.SetColorAndBorder(xui.Color_Transp";
Debug.ShouldStop(1024);
__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(int.class, ((int)0x33ffffff))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 204;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(2048);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(int.class, ((int)0x00d0ff71))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 205;BA.debugLine="headerActionPane.SetColorAndBorder(xui.Color_Tran";
Debug.ShouldStop(4096);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 207;BA.debugLine="lblHeader = CreateLabel(\"\", 12, 0xFF747B86, False";
Debug.ShouldStop(16384);
__ref.setField ("_lblheader" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 12)),(Object)(BA.numberCast(int.class, ((int)0xff747b86))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True"))));
 BA.debugLineNum = 208;BA.debugLine="lblHeaderAction = CreateLabel(Chr(0x22EF), 22, 0x";
Debug.ShouldStop(32768);
__ref.setField ("_lblheaderaction" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0x22ef)))))),(Object)(BA.numberCast(float.class, 22)),(Object)(BA.numberCast(int.class, ((int)0xffb9c0c9))),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"False"))));
 BA.debugLineNum = 209;BA.debugLine="lblPlayIcon = CreateLabel(\"▶\", 48, 0xFFD0FF71, Tr";
Debug.ShouldStop(65536);
__ref.setField ("_lblplayicon" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("▶")),(Object)(BA.numberCast(float.class, 48)),(Object)(BA.numberCast(int.class, ((int)0xffd0ff71))),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"False"))));
 BA.debugLineNum = 210;BA.debugLine="lblStream = CreateLabel(\"\", 36, 0xFFD0FF71, True,";
Debug.ShouldStop(131072);
__ref.setField ("_lblstream" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 36)),(Object)(BA.numberCast(int.class, ((int)0xffd0ff71))),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"True"))));
 BA.debugLineNum = 211;BA.debugLine="lblInfo = CreateLabel(\"\", 17, 0xFFBCC3CD, False,";
Debug.ShouldStop(262144);
__ref.setField ("_lblinfo" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 17)),(Object)(BA.numberCast(int.class, ((int)0xffbcc3cd))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True"))));
 BA.debugLineNum = 212;BA.debugLine="lblFooter = CreateLabel(\"FON.FM APP \" & APP_VERSI";
Debug.ShouldStop(524288);
__ref.setField ("_lblfooter" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("FON.FM APP "),__ref.getField(true,"_app_version" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 12)),(Object)(BA.numberCast(int.class, ((int)0xff747b86))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True"))));
 BA.debugLineNum = 213;BA.debugLine="lblSetupMessage = CreateLabel(\"\", 17, 0xFFBCC3CD,";
Debug.ShouldStop(1048576);
__ref.setField ("_lblsetupmessage" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, 17)),(Object)(BA.numberCast(int.class, ((int)0xffbcc3cd))),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True"))));
 BA.debugLineNum = 215;BA.debugLine="txtPlayerCode.Initialize(\"txtPlayerCode\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("txtPlayerCode")));
 BA.debugLineNum = 216;BA.debugLine="txtPlayerCodeView = txtPlayerCode";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ ).setObject (__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 217;BA.debugLine="btnSetupSubmit = CreateTextButton(MessageValue(\"s";
Debug.ShouldStop(16777216);
__ref.setField ("_btnsetupsubmit" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createtextbutton" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("setup_submit")))),(Object)(RemoteObject.createImmutable("BtnSetupSubmit"))));
 BA.debugLineNum = 218;BA.debugLine="btnConfirmYes = CreateTextButton(MessageValue(\"de";
Debug.ShouldStop(33554432);
__ref.setField ("_btnconfirmyes" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createtextbutton" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("device_confirm_yes")))),(Object)(RemoteObject.createImmutable("BtnConfirmYes"))));
 BA.debugLineNum = 219;BA.debugLine="btnConfirmNo = CreateTextButton(MessageValue(\"dev";
Debug.ShouldStop(67108864);
__ref.setField ("_btnconfirmno" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createtextbutton" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("device_confirm_no")))),(Object)(RemoteObject.createImmutable("BtnConfirmNo"))));
 BA.debugLineNum = 221;BA.debugLine="rootView.AddView(card, 0, 0, 0, 0)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_rootview" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_card" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 222;BA.debugLine="card.AddView(headerPane, 0, 0, 0, 0)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_card" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_headerpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 223;BA.debugLine="card.AddView(contentPane, 0, 0, 0, 0)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_card" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_contentpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 224;BA.debugLine="card.AddView(footerPane, 0, 0, 0, 0)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_card" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_footerpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 225;BA.debugLine="headerPane.AddView(lblHeader, 0, 0, 0, 0)";
Debug.ShouldStop(1);
__ref.getField(false,"_headerpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblheader" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 226;BA.debugLine="headerPane.AddView(headerActionPane, 0, 0, 0, 0)";
Debug.ShouldStop(2);
__ref.getField(false,"_headerpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 227;BA.debugLine="headerActionPane.AddView(lblHeaderAction, 0, 0, 0";
Debug.ShouldStop(4);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 228;BA.debugLine="contentPane.AddView(setupPane, 0, 0, 0, 0)";
Debug.ShouldStop(8);
__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_setuppane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 229;BA.debugLine="contentPane.AddView(playerPane, 0, 0, 0, 0)";
Debug.ShouldStop(16);
__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_playerpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 230;BA.debugLine="footerPane.AddView(lblFooter, 0, 0, 0, 0)";
Debug.ShouldStop(32);
__ref.getField(false,"_footerpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblfooter" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 232;BA.debugLine="setupPane.AddView(setupHeroPane, 0, 0, 0, 0)";
Debug.ShouldStop(128);
__ref.getField(false,"_setuppane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_setupheropane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 233;BA.debugLine="setupPane.AddView(setupDetailPane, 0, 0, 0, 0)";
Debug.ShouldStop(256);
__ref.getField(false,"_setuppane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 234;BA.debugLine="setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)";
Debug.ShouldStop(512);
__ref.getField(false,"_setupheropane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accesscorepane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 235;BA.debugLine="setupHeroPane.AddView(accessCirclePane, 0, 0, 0,";
Debug.ShouldStop(1024);
__ref.getField(false,"_setupheropane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 236;BA.debugLine="accessCirclePane.AddView(accessInputPane, 0, 0, 0";
Debug.ShouldStop(2048);
__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 237;BA.debugLine="accessInputPane.AddView(txtPlayerCodeView, 0, 0,";
Debug.ShouldStop(4096);
__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 238;BA.debugLine="setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0";
Debug.ShouldStop(8192);
__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 239;BA.debugLine="setupDetailPane.AddView(setupStatusPane, 0, 0, 0,";
Debug.ShouldStop(16384);
__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_setupstatuspane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 240;BA.debugLine="setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0,";
Debug.ShouldStop(32768);
__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnsetupsubmit" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 241;BA.debugLine="setupStatusPane.AddView(lblSetupMessage, 0, 0, 0,";
Debug.ShouldStop(65536);
__ref.getField(false,"_setupstatuspane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 243;BA.debugLine="playerPane.AddView(playerHeroPane, 0, 0, 0, 0)";
Debug.ShouldStop(262144);
__ref.getField(false,"_playerpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 244;BA.debugLine="playerPane.AddView(playerDetailPane, 0, 0, 0, 0)";
Debug.ShouldStop(524288);
__ref.getField(false,"_playerpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 245;BA.debugLine="playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 246;BA.debugLine="playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0";
Debug.ShouldStop(2097152);
__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 247;BA.debugLine="playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 248;BA.debugLine="playerDetailPane.AddView(playerPrimaryPane, 0, 0,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 249;BA.debugLine="playerDetailPane.AddView(playerStatusPane, 0, 0,";
Debug.ShouldStop(16777216);
__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 250;BA.debugLine="playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblstream" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 251;BA.debugLine="playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 252;BA.debugLine="playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 253;BA.debugLine="confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 254;BA.debugLine="confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 256;BA.debugLine="SetPaneStyle(card, \"-fx-background-radius: 24; -f";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_card" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 24; -fx-border-radius: 24;")));
 BA.debugLineNum = 257;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_headeractionpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 258;BA.debugLine="SetPaneStyle(playButtonPane, \"-fx-cursor: hand; -";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 259;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 260;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscorepane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 261;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accessinputpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;")));
 BA.debugLineNum = 262;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xffddf1ff)))),RemoteObject.createImmutable("; -fx-prompt-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x7affffff)))),RemoteObject.createImmutable("; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;"))));
 BA.debugLineNum = 263;BA.debugLine="accessCorePane.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_accesscorepane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 264;BA.debugLine="accessCirclePane.Visible = True";
Debug.ShouldStop(128);
__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 265;BA.debugLine="accessInputPane.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 266;BA.debugLine="SetPickOnBounds(headerActionPane, True)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpickonbounds" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_headeractionpane" /*RemoteObject*/ )),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 267;BA.debugLine="SetPickOnBounds(playButtonPane, True)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpickonbounds" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ )),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 268;BA.debugLine="txtPlayerCode.PromptText = MessageValue(\"setup_pl";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setPromptText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("setup_placeholder"))).runMethod(true,"toUpperCase"));
 BA.debugLineNum = 269;BA.debugLine="txtPlayerCode.Visible = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 270;BA.debugLine="UpdateHeaderActionAppearance(False)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateheaderactionappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 271;BA.debugLine="UpdatePlayButtonAppearance(False)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 272;BA.debugLine="UpdateCodeInputAppearance(False)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatecodeinputappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 273;BA.debugLine="BringToFront(accessCorePane)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_bringtofront" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscorepane" /*RemoteObject*/ )));
 BA.debugLineNum = 274;BA.debugLine="BringToFront(accessCirclePane)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_bringtofront" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ )));
 BA.debugLineNum = 275;BA.debugLine="BringToFront(accessInputPane)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_bringtofront" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accessinputpane" /*RemoteObject*/ )));
 BA.debugLineNum = 276;BA.debugLine="BringToFront(txtPlayerCodeView)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_bringtofront" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ )));
 BA.debugLineNum = 278;BA.debugLine="confirmPane.Visible = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 279;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_layoutui" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_rootview" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_rootview" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancrossfadeprepareditem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CanCrossfadePreparedItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,761);
if (RapidSub.canDelegate("cancrossfadeprepareditem")) { return __ref.runUserSub(false, "b4xmainpage","cancrossfadeprepareditem", __ref);}
 BA.debugLineNum = 761;BA.debugLine="Private Sub CanCrossfadePreparedItem As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 762;BA.debugLine="If isQueueTransitioning Or isCrossfadeTriggered T";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_isqueuetransitioning" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",__ref.getField(true,"_iscrossfadetriggered" /*RemoteObject*/ ))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 763;BA.debugLine="If currentMediaType <> \"track\" Then Return False";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString("track"))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 764;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 765;BA.debugLine="If preparedItem.GetDefault(\"type\", \"\") <> \"track\"";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 766;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return b4xmainpage.__c.getField(true,"True");
 BA.debugLineNum = 767;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkexternalconnectivity(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckExternalConnectivity (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1015);
if (RapidSub.canDelegate("checkexternalconnectivity")) { return __ref.runUserSub(false, "b4xmainpage","checkexternalconnectivity", __ref);}
ResumableSub_CheckExternalConnectivity rsub = new ResumableSub_CheckExternalConnectivity(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckExternalConnectivity extends BA.ResumableSub {
public ResumableSub_CheckExternalConnectivity(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _ok = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckExternalConnectivity (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1015);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1016;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(8388608);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 1017;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1018;BA.debugLine="j.Download(CONNECTIVITY_CHECK_URL & \"?t=\" & DateT";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_connectivity_check_url" /*RemoteObject*/ ),RemoteObject.createImmutable("?t="),parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1019;BA.debugLine="j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT";
Debug.ShouldStop(67108864);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_connectivity_check_timeout_ms" /*RemoteObject*/ ));
 BA.debugLineNum = 1020;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "checkexternalconnectivity"), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1021;BA.debugLine="Dim ok As Boolean = j.Success";
Debug.ShouldStop(268435456);
_ok = _j.getField(true,"_success" /*RemoteObject*/ );Debug.locals.put("ok", _ok);Debug.locals.put("ok", _ok);
 BA.debugLineNum = 1022;BA.debugLine="j.Release";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1023;BA.debugLine="Return ok";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ok));return;};
 BA.debugLineNum = 1024;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private Const PLAYER_BASE_URL As String = \"https:";
b4xmainpage._player_base_url = BA.ObjectToString("https://play.fon.fm/meta");__ref.setField("_player_base_url",b4xmainpage._player_base_url);
 //BA.debugLineNum = 8;BA.debugLine="Private Const NEXT_BASE_URL As String = \"https://";
b4xmainpage._next_base_url = BA.ObjectToString("https://play.fon.fm/next");__ref.setField("_next_base_url",b4xmainpage._next_base_url);
 //BA.debugLineNum = 9;BA.debugLine="Private Const CLAIM_BASE_URL As String = \"https:/";
b4xmainpage._claim_base_url = BA.ObjectToString("https://play.fon.fm/claim");__ref.setField("_claim_base_url",b4xmainpage._claim_base_url);
 //BA.debugLineNum = 10;BA.debugLine="Private Const HISTORY_BASE_URL As String = \"https";
b4xmainpage._history_base_url = BA.ObjectToString("https://play.fon.fm/history");__ref.setField("_history_base_url",b4xmainpage._history_base_url);
 //BA.debugLineNum = 11;BA.debugLine="Private Const CONNECTIVITY_CHECK_URL As String =";
b4xmainpage._connectivity_check_url = BA.ObjectToString("https://radiosparx.ru/img/logo-dark.svg");__ref.setField("_connectivity_check_url",b4xmainpage._connectivity_check_url);
 //BA.debugLineNum = 12;BA.debugLine="Private Const APP_VERSION As String = \"1.0.1\"";
b4xmainpage._app_version = BA.ObjectToString("1.0.1");__ref.setField("_app_version",b4xmainpage._app_version);
 //BA.debugLineNum = 13;BA.debugLine="Private Const PREFETCH_SECONDS As Int = 10";
b4xmainpage._prefetch_seconds = BA.numberCast(int.class, 10);__ref.setField("_prefetch_seconds",b4xmainpage._prefetch_seconds);
 //BA.debugLineNum = 14;BA.debugLine="Private Const STOP_FADE_MS As Int = 3000";
b4xmainpage._stop_fade_ms = BA.numberCast(int.class, 3000);__ref.setField("_stop_fade_ms",b4xmainpage._stop_fade_ms);
 //BA.debugLineNum = 15;BA.debugLine="Private Const TRACK_OVERLAP_MS As Int = 1800";
b4xmainpage._track_overlap_ms = BA.numberCast(int.class, 1800);__ref.setField("_track_overlap_ms",b4xmainpage._track_overlap_ms);
 //BA.debugLineNum = 16;BA.debugLine="Private Const HISTORY_LOG_DELAY_MS As Int = 15000";
b4xmainpage._history_log_delay_ms = BA.numberCast(int.class, 15000);__ref.setField("_history_log_delay_ms",b4xmainpage._history_log_delay_ms);
 //BA.debugLineNum = 17;BA.debugLine="Private Const FETCH_TIMEOUT_MS As Int = 8000";
b4xmainpage._fetch_timeout_ms = BA.numberCast(int.class, 8000);__ref.setField("_fetch_timeout_ms",b4xmainpage._fetch_timeout_ms);
 //BA.debugLineNum = 18;BA.debugLine="Private Const CONNECTIVITY_CHECK_TIMEOUT_MS As In";
b4xmainpage._connectivity_check_timeout_ms = BA.numberCast(int.class, 5000);__ref.setField("_connectivity_check_timeout_ms",b4xmainpage._connectivity_check_timeout_ms);
 //BA.debugLineNum = 19;BA.debugLine="Private Const PAUSE_RETRY_DELAY As Int = 300000";
b4xmainpage._pause_retry_delay = BA.numberCast(int.class, 300000);__ref.setField("_pause_retry_delay",b4xmainpage._pause_retry_delay);
 //BA.debugLineNum = 20;BA.debugLine="Private Const OFFLINE_RETRY_DELAY_INITIAL As Int";
b4xmainpage._offline_retry_delay_initial = BA.numberCast(int.class, 5000);__ref.setField("_offline_retry_delay_initial",b4xmainpage._offline_retry_delay_initial);
 //BA.debugLineNum = 21;BA.debugLine="Private Const OFFLINE_RETRY_DELAY_MAX As Int = 30";
b4xmainpage._offline_retry_delay_max = BA.numberCast(int.class, 30000);__ref.setField("_offline_retry_delay_max",b4xmainpage._offline_retry_delay_max);
 //BA.debugLineNum = 22;BA.debugLine="Private Const SERVER_RETRY_DELAY_INITIAL As Int =";
b4xmainpage._server_retry_delay_initial = BA.numberCast(int.class, 10000);__ref.setField("_server_retry_delay_initial",b4xmainpage._server_retry_delay_initial);
 //BA.debugLineNum = 23;BA.debugLine="Private Const SERVER_RETRY_DELAY_MAX As Int = 600";
b4xmainpage._server_retry_delay_max = BA.numberCast(int.class, 60000);__ref.setField("_server_retry_delay_max",b4xmainpage._server_retry_delay_max);
 //BA.debugLineNum = 24;BA.debugLine="Private Const BLOCKED_RETRY_DELAY As Int = 60000";
b4xmainpage._blocked_retry_delay = BA.numberCast(int.class, 60000);__ref.setField("_blocked_retry_delay",b4xmainpage._blocked_retry_delay);
 //BA.debugLineNum = 26;BA.debugLine="Private rootView As B4XView";
b4xmainpage._rootview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_rootview",b4xmainpage._rootview);
 //BA.debugLineNum = 27;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 28;BA.debugLine="Private storageDir As String";
b4xmainpage._storagedir = RemoteObject.createImmutable("");__ref.setField("_storagedir",b4xmainpage._storagedir);
 //BA.debugLineNum = 29;BA.debugLine="Private storageFile As String = \"player_state.jso";
b4xmainpage._storagefile = BA.ObjectToString("player_state.json");__ref.setField("_storagefile",b4xmainpage._storagefile);
 //BA.debugLineNum = 31;BA.debugLine="Private card As B4XView";
b4xmainpage._card = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_card",b4xmainpage._card);
 //BA.debugLineNum = 32;BA.debugLine="Private headerPane As B4XView";
b4xmainpage._headerpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_headerpane",b4xmainpage._headerpane);
 //BA.debugLineNum = 33;BA.debugLine="Private headerActionPane As B4XView";
b4xmainpage._headeractionpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_headeractionpane",b4xmainpage._headeractionpane);
 //BA.debugLineNum = 34;BA.debugLine="Private contentPane As B4XView";
b4xmainpage._contentpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_contentpane",b4xmainpage._contentpane);
 //BA.debugLineNum = 35;BA.debugLine="Private footerPane As B4XView";
b4xmainpage._footerpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_footerpane",b4xmainpage._footerpane);
 //BA.debugLineNum = 36;BA.debugLine="Private setupPane As B4XView";
b4xmainpage._setuppane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_setuppane",b4xmainpage._setuppane);
 //BA.debugLineNum = 37;BA.debugLine="Private playerPane As B4XView";
b4xmainpage._playerpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playerpane",b4xmainpage._playerpane);
 //BA.debugLineNum = 38;BA.debugLine="Private setupHeroPane As B4XView";
b4xmainpage._setupheropane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_setupheropane",b4xmainpage._setupheropane);
 //BA.debugLineNum = 39;BA.debugLine="Private setupDetailPane As B4XView";
b4xmainpage._setupdetailpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_setupdetailpane",b4xmainpage._setupdetailpane);
 //BA.debugLineNum = 40;BA.debugLine="Private setupPrimaryPane As B4XView";
b4xmainpage._setupprimarypane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_setupprimarypane",b4xmainpage._setupprimarypane);
 //BA.debugLineNum = 41;BA.debugLine="Private setupStatusPane As B4XView";
b4xmainpage._setupstatuspane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_setupstatuspane",b4xmainpage._setupstatuspane);
 //BA.debugLineNum = 42;BA.debugLine="Private playerHeroPane As B4XView";
b4xmainpage._playerheropane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playerheropane",b4xmainpage._playerheropane);
 //BA.debugLineNum = 43;BA.debugLine="Private playerDetailPane As B4XView";
b4xmainpage._playerdetailpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playerdetailpane",b4xmainpage._playerdetailpane);
 //BA.debugLineNum = 44;BA.debugLine="Private playerPrimaryPane As B4XView";
b4xmainpage._playerprimarypane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playerprimarypane",b4xmainpage._playerprimarypane);
 //BA.debugLineNum = 45;BA.debugLine="Private playerStatusPane As B4XView";
b4xmainpage._playerstatuspane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playerstatuspane",b4xmainpage._playerstatuspane);
 //BA.debugLineNum = 46;BA.debugLine="Private orbitPane As B4XView";
b4xmainpage._orbitpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_orbitpane",b4xmainpage._orbitpane);
 //BA.debugLineNum = 47;BA.debugLine="Private playButtonPane As B4XView";
b4xmainpage._playbuttonpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_playbuttonpane",b4xmainpage._playbuttonpane);
 //BA.debugLineNum = 48;BA.debugLine="Private confirmPane As B4XView";
b4xmainpage._confirmpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_confirmpane",b4xmainpage._confirmpane);
 //BA.debugLineNum = 49;BA.debugLine="Private accessCirclePane As B4XView";
b4xmainpage._accesscirclepane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_accesscirclepane",b4xmainpage._accesscirclepane);
 //BA.debugLineNum = 50;BA.debugLine="Private accessCorePane As B4XView";
b4xmainpage._accesscorepane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_accesscorepane",b4xmainpage._accesscorepane);
 //BA.debugLineNum = 51;BA.debugLine="Private accessInputPane As B4XView";
b4xmainpage._accessinputpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_accessinputpane",b4xmainpage._accessinputpane);
 //BA.debugLineNum = 53;BA.debugLine="Private lblHeader As B4XView";
b4xmainpage._lblheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblheader",b4xmainpage._lblheader);
 //BA.debugLineNum = 54;BA.debugLine="Private lblHeaderAction As B4XView";
b4xmainpage._lblheaderaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblheaderaction",b4xmainpage._lblheaderaction);
 //BA.debugLineNum = 55;BA.debugLine="Private lblPlayIcon As B4XView";
b4xmainpage._lblplayicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblplayicon",b4xmainpage._lblplayicon);
 //BA.debugLineNum = 56;BA.debugLine="Private lblStream As B4XView";
b4xmainpage._lblstream = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblstream",b4xmainpage._lblstream);
 //BA.debugLineNum = 57;BA.debugLine="Private lblInfo As B4XView";
b4xmainpage._lblinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblinfo",b4xmainpage._lblinfo);
 //BA.debugLineNum = 58;BA.debugLine="Private lblFooter As B4XView";
b4xmainpage._lblfooter = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblfooter",b4xmainpage._lblfooter);
 //BA.debugLineNum = 59;BA.debugLine="Private lblSetupMessage As B4XView";
b4xmainpage._lblsetupmessage = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblsetupmessage",b4xmainpage._lblsetupmessage);
 //BA.debugLineNum = 61;BA.debugLine="Private txtPlayerCode As TextField";
b4xmainpage._txtplayercode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtplayercode",b4xmainpage._txtplayercode);
 //BA.debugLineNum = 62;BA.debugLine="Private txtPlayerCodeView As B4XView";
b4xmainpage._txtplayercodeview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtplayercodeview",b4xmainpage._txtplayercodeview);
 //BA.debugLineNum = 63;BA.debugLine="Private btnSetupSubmit As B4XView";
b4xmainpage._btnsetupsubmit = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsetupsubmit",b4xmainpage._btnsetupsubmit);
 //BA.debugLineNum = 64;BA.debugLine="Private btnConfirmYes As B4XView";
b4xmainpage._btnconfirmyes = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnconfirmyes",b4xmainpage._btnconfirmyes);
 //BA.debugLineNum = 65;BA.debugLine="Private btnConfirmNo As B4XView";
b4xmainpage._btnconfirmno = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnconfirmno",b4xmainpage._btnconfirmno);
 //BA.debugLineNum = 66;BA.debugLine="Private playIconBaseSize As Float";
b4xmainpage._playiconbasesize = RemoteObject.createImmutable(0f);__ref.setField("_playiconbasesize",b4xmainpage._playiconbasesize);
 //BA.debugLineNum = 67;BA.debugLine="Private stopIconBaseSize As Float";
b4xmainpage._stopiconbasesize = RemoteObject.createImmutable(0f);__ref.setField("_stopiconbasesize",b4xmainpage._stopiconbasesize);
 //BA.debugLineNum = 68;BA.debugLine="Private headerActionFontSize As Float";
b4xmainpage._headeractionfontsize = RemoteObject.createImmutable(0f);__ref.setField("_headeractionfontsize",b4xmainpage._headeractionfontsize);
 //BA.debugLineNum = 69;BA.debugLine="Private codeFontSize As Float";
b4xmainpage._codefontsize = RemoteObject.createImmutable(0f);__ref.setField("_codefontsize",b4xmainpage._codefontsize);
 //BA.debugLineNum = 70;BA.debugLine="Private isCodeInputFocused As Boolean";
b4xmainpage._iscodeinputfocused = RemoteObject.createImmutable(false);__ref.setField("_iscodeinputfocused",b4xmainpage._iscodeinputfocused);
 //BA.debugLineNum = 72;BA.debugLine="Private audioPrimary As AudioPlayer";
b4xmainpage._audioprimary = RemoteObject.createNew ("b4j.example.audioplayer");__ref.setField("_audioprimary",b4xmainpage._audioprimary);
 //BA.debugLineNum = 73;BA.debugLine="Private audioSecondary As AudioPlayer";
b4xmainpage._audiosecondary = RemoteObject.createNew ("b4j.example.audioplayer");__ref.setField("_audiosecondary",b4xmainpage._audiosecondary);
 //BA.debugLineNum = 74;BA.debugLine="Private storage As Map";
b4xmainpage._storage = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_storage",b4xmainpage._storage);
 //BA.debugLineNum = 75;BA.debugLine="Private playQueue As List";
b4xmainpage._playqueue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_playqueue",b4xmainpage._playqueue);
 //BA.debugLineNum = 76;BA.debugLine="Private messages As Map";
b4xmainpage._messages = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_messages",b4xmainpage._messages);
 //BA.debugLineNum = 78;BA.debugLine="Private retryTimer As Timer";
b4xmainpage._retrytimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_retrytimer",b4xmainpage._retrytimer);
 //BA.debugLineNum = 79;BA.debugLine="Private breakTimer As Timer";
b4xmainpage._breaktimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_breaktimer",b4xmainpage._breaktimer);
 //BA.debugLineNum = 80;BA.debugLine="Private historyTimer As Timer";
b4xmainpage._historytimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_historytimer",b4xmainpage._historytimer);
 //BA.debugLineNum = 82;BA.debugLine="Private playerCode As String";
b4xmainpage._playercode = RemoteObject.createImmutable("");__ref.setField("_playercode",b4xmainpage._playercode);
 //BA.debugLineNum = 83;BA.debugLine="Private deviceId As String";
b4xmainpage._deviceid = RemoteObject.createImmutable("");__ref.setField("_deviceid",b4xmainpage._deviceid);
 //BA.debugLineNum = 84;BA.debugLine="Private appScreenMode As String";
b4xmainpage._appscreenmode = RemoteObject.createImmutable("");__ref.setField("_appscreenmode",b4xmainpage._appscreenmode);
 //BA.debugLineNum = 85;BA.debugLine="Private nextStartMode As String";
b4xmainpage._nextstartmode = RemoteObject.createImmutable("");__ref.setField("_nextstartmode",b4xmainpage._nextstartmode);
 //BA.debugLineNum = 86;BA.debugLine="Private currentTrackUrl As String";
b4xmainpage._currenttrackurl = RemoteObject.createImmutable("");__ref.setField("_currenttrackurl",b4xmainpage._currenttrackurl);
 //BA.debugLineNum = 87;BA.debugLine="Private currentMediaType As String";
b4xmainpage._currentmediatype = RemoteObject.createImmutable("");__ref.setField("_currentmediatype",b4xmainpage._currentmediatype);
 //BA.debugLineNum = 88;BA.debugLine="Private activeAudioKey As String";
b4xmainpage._activeaudiokey = RemoteObject.createImmutable("");__ref.setField("_activeaudiokey",b4xmainpage._activeaudiokey);
 //BA.debugLineNum = 89;BA.debugLine="Private preparedAudioKey As String";
b4xmainpage._preparedaudiokey = RemoteObject.createImmutable("");__ref.setField("_preparedaudiokey",b4xmainpage._preparedaudiokey);
 //BA.debugLineNum = 90;BA.debugLine="Private historyItem As Map";
b4xmainpage._historyitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_historyitem",b4xmainpage._historyitem);
 //BA.debugLineNum = 91;BA.debugLine="Private activeItem As Map";
b4xmainpage._activeitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_activeitem",b4xmainpage._activeitem);
 //BA.debugLineNum = 92;BA.debugLine="Private preparedItem As Map";
b4xmainpage._prepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_prepareditem",b4xmainpage._prepareditem);
 //BA.debugLineNum = 93;BA.debugLine="Private pendingPlayAudioKey As String";
b4xmainpage._pendingplayaudiokey = RemoteObject.createImmutable("");__ref.setField("_pendingplayaudiokey",b4xmainpage._pendingplayaudiokey);
 //BA.debugLineNum = 94;BA.debugLine="Private pendingPrepareAudioKey As String";
b4xmainpage._pendingprepareaudiokey = RemoteObject.createImmutable("");__ref.setField("_pendingprepareaudiokey",b4xmainpage._pendingprepareaudiokey);
 //BA.debugLineNum = 95;BA.debugLine="Private pendingPlayItem As Map";
b4xmainpage._pendingplayitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_pendingplayitem",b4xmainpage._pendingplayitem);
 //BA.debugLineNum = 96;BA.debugLine="Private pendingPrepareItem As Map";
b4xmainpage._pendingprepareitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_pendingprepareitem",b4xmainpage._pendingprepareitem);
 //BA.debugLineNum = 97;BA.debugLine="Private pendingPlayFadeInMs As Int";
b4xmainpage._pendingplayfadeinms = RemoteObject.createImmutable(0);__ref.setField("_pendingplayfadeinms",b4xmainpage._pendingplayfadeinms);
 //BA.debugLineNum = 99;BA.debugLine="Private isStarted As Boolean";
b4xmainpage._isstarted = RemoteObject.createImmutable(false);__ref.setField("_isstarted",b4xmainpage._isstarted);
 //BA.debugLineNum = 100;BA.debugLine="Private isStoppedByUser As Boolean = True";
b4xmainpage._isstoppedbyuser = b4xmainpage.__c.getField(true,"True");__ref.setField("_isstoppedbyuser",b4xmainpage._isstoppedbyuser);
 //BA.debugLineNum = 101;BA.debugLine="Private isStopping As Boolean";
b4xmainpage._isstopping = RemoteObject.createImmutable(false);__ref.setField("_isstopping",b4xmainpage._isstopping);
 //BA.debugLineNum = 102;BA.debugLine="Private isQueueTransitioning As Boolean";
b4xmainpage._isqueuetransitioning = RemoteObject.createImmutable(false);__ref.setField("_isqueuetransitioning",b4xmainpage._isqueuetransitioning);
 //BA.debugLineNum = 103;BA.debugLine="Private prefetchDone As Boolean";
b4xmainpage._prefetchdone = RemoteObject.createImmutable(false);__ref.setField("_prefetchdone",b4xmainpage._prefetchdone);
 //BA.debugLineNum = 104;BA.debugLine="Private isCrossfadeTriggered As Boolean";
b4xmainpage._iscrossfadetriggered = RemoteObject.createImmutable(false);__ref.setField("_iscrossfadetriggered",b4xmainpage._iscrossfadetriggered);
 //BA.debugLineNum = 106;BA.debugLine="Private offlineRetryDelay As Int = OFFLINE_RETRY_";
b4xmainpage._offlineretrydelay = __ref.getField(true,"_offline_retry_delay_initial" /*RemoteObject*/ );__ref.setField("_offlineretrydelay",b4xmainpage._offlineretrydelay);
 //BA.debugLineNum = 107;BA.debugLine="Private serverRetryDelay As Int = SERVER_RETRY_DE";
b4xmainpage._serverretrydelay = __ref.getField(true,"_server_retry_delay_initial" /*RemoteObject*/ );__ref.setField("_serverretrydelay",b4xmainpage._serverretrydelay);
 //BA.debugLineNum = 108;BA.debugLine="Private playlistIndex As Int = -1";
b4xmainpage._playlistindex = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_playlistindex",b4xmainpage._playlistindex);
 //BA.debugLineNum = 109;BA.debugLine="Private scheduledBreakAt As Long = -1";
b4xmainpage._scheduledbreakat = BA.numberCast(long.class, -(double) (0 + 1));__ref.setField("_scheduledbreakat",b4xmainpage._scheduledbreakat);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearexactbreakstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearExactBreakState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1132);
if (RapidSub.canDelegate("clearexactbreakstate")) { return __ref.runUserSub(false, "b4xmainpage","clearexactbreakstate", __ref);}
 BA.debugLineNum = 1132;BA.debugLine="Private Sub ClearExactBreakState";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1133;BA.debugLine="scheduledBreakAt = -1";
Debug.ShouldStop(4096);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,BA.numberCast(long.class, -(double) (0 + 1)));
 BA.debugLineNum = 1134;BA.debugLine="breakTimer.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_breaktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1135;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearhistorylogtimer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearHistoryLogTimer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1214);
if (RapidSub.canDelegate("clearhistorylogtimer")) { return __ref.runUserSub(false, "b4xmainpage","clearhistorylogtimer", __ref);}
 BA.debugLineNum = 1214;BA.debugLine="Private Sub ClearHistoryLogTimer";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1215;BA.debugLine="historyTimer.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_historytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1216;BA.debugLine="historyItem.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_historyitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1217;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearpendingplaystate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPendingPlayState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("clearpendingplaystate")) { return __ref.runUserSub(false, "b4xmainpage","clearpendingplaystate", __ref);}
 BA.debugLineNum = 670;BA.debugLine="Private Sub ClearPendingPlayState";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="pendingPlayAudioKey = \"\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_pendingplayaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 672;BA.debugLine="pendingPlayItem.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pendingplayitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 673;BA.debugLine="pendingPlayFadeInMs = 0";
Debug.ShouldStop(1);
__ref.setField ("_pendingplayfadeinms" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 674;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearplaybackstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPlaybackState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1254);
if (RapidSub.canDelegate("clearplaybackstate")) { return __ref.runUserSub(false, "b4xmainpage","clearplaybackstate", __ref);}
 BA.debugLineNum = 1254;BA.debugLine="Private Sub ClearPlaybackState";
Debug.ShouldStop(32);
 BA.debugLineNum = 1255;BA.debugLine="audioPrimary.Reset";
Debug.ShouldStop(64);
__ref.getField(false,"_audioprimary" /*RemoteObject*/ ).runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 1256;BA.debugLine="audioSecondary.Reset";
Debug.ShouldStop(128);
__ref.getField(false,"_audiosecondary" /*RemoteObject*/ ).runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 1257;BA.debugLine="currentTrackUrl = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_currenttrackurl" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1258;BA.debugLine="currentMediaType = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_currentmediatype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1259;BA.debugLine="activeAudioKey = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1260;BA.debugLine="preparedAudioKey = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1261;BA.debugLine="activeItem.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_activeitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1262;BA.debugLine="preparedItem.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1263;BA.debugLine="ClearPendingPlayState";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpendingplaystate" /*RemoteObject*/ );
 BA.debugLineNum = 1264;BA.debugLine="ClearPreparedState(False)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpreparedstate" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 1265;BA.debugLine="playQueue.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1266;BA.debugLine="prefetchDone = False";
Debug.ShouldStop(131072);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1267;BA.debugLine="isCrossfadeTriggered = False";
Debug.ShouldStop(262144);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1268;BA.debugLine="ClearRetryTimer";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 1269;BA.debugLine="ClearExactBreakState";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearexactbreakstate" /*RemoteObject*/ );
 BA.debugLineNum = 1270;BA.debugLine="ClearHistoryLogTimer";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearhistorylogtimer" /*RemoteObject*/ );
 BA.debugLineNum = 1271;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1272;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearpreparedstate(RemoteObject __ref,RemoteObject _resetplayer) throws Exception{
try {
		Debug.PushSubsStack("ClearPreparedState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,660);
if (RapidSub.canDelegate("clearpreparedstate")) { return __ref.runUserSub(false, "b4xmainpage","clearpreparedstate", __ref, _resetplayer);}
Debug.locals.put("resetPlayer", _resetplayer);
 BA.debugLineNum = 660;BA.debugLine="Private Sub ClearPreparedState(resetPlayer As Bool";
Debug.ShouldStop(524288);
 BA.debugLineNum = 661;BA.debugLine="If preparedAudioKey <> \"\" And resetPlayer Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",_resetplayer)) { 
 BA.debugLineNum = 662;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ))).runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 };
 BA.debugLineNum = 664;BA.debugLine="preparedAudioKey = \"\"";
Debug.ShouldStop(8388608);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 665;BA.debugLine="preparedItem.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 666;BA.debugLine="pendingPrepareAudioKey = \"\"";
Debug.ShouldStop(33554432);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 667;BA.debugLine="pendingPrepareItem.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pendingprepareitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearretrytimer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearRetryTimer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1095);
if (RapidSub.canDelegate("clearretrytimer")) { return __ref.runUserSub(false, "b4xmainpage","clearretrytimer", __ref);}
 BA.debugLineNum = 1095;BA.debugLine="Private Sub ClearRetryTimer";
Debug.ShouldStop(64);
 BA.debugLineNum = 1096;BA.debugLine="retryTimer.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_retrytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1097;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,683);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "b4xmainpage","clonemap", __ref, _sourcemap);}
RemoteObject _clonedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 683;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(1024);
 BA.debugLineNum = 684;BA.debugLine="Dim clonedMap As Map";
Debug.ShouldStop(2048);
_clonedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("clonedMap", _clonedmap);
 BA.debugLineNum = 685;BA.debugLine="clonedMap.Initialize";
Debug.ShouldStop(4096);
_clonedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 686;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return _clonedmap;};
 BA.debugLineNum = 687;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 688;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(32768);
_clonedmap.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 690;BA.debugLine="Return clonedMap";
Debug.ShouldStop(131072);
if (true) return _clonedmap;
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortocss(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("ColorToCss (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1777);
if (RapidSub.canDelegate("colortocss")) { return __ref.runUserSub(false, "b4xmainpage","colortocss", __ref, _color);}
RemoteObject _unsignedcolor = RemoteObject.createImmutable(0L);
RemoteObject _rgb = RemoteObject.createImmutable(0);
Debug.locals.put("color", _color);
 BA.debugLineNum = 1777;BA.debugLine="Private Sub ColorToCss(color As Int) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1778;BA.debugLine="Dim unsignedColor As Long = Bit.And(0xFFFFFFFF, c";
Debug.ShouldStop(131072);
_unsignedcolor = BA.numberCast(long.class, b4xmainpage.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xffffffff))),(Object)(_color)));Debug.locals.put("unsignedColor", _unsignedcolor);Debug.locals.put("unsignedColor", _unsignedcolor);
 BA.debugLineNum = 1779;BA.debugLine="Dim rgb As Int = Bit.And(unsignedColor, 0xFFFFFF)";
Debug.ShouldStop(262144);
_rgb = b4xmainpage.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, _unsignedcolor)),(Object)(BA.numberCast(int.class, ((int)0xffffff))));Debug.locals.put("rgb", _rgb);Debug.locals.put("rgb", _rgb);
 BA.debugLineNum = 1780;BA.debugLine="Return \"#\" & Bit.ToHexString(rgb)";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),b4xmainpage.__c.getField(false,"Bit").runMethod(true,"ToHexString",(Object)(_rgb)));
 BA.debugLineNum = 1781;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configureplayerheader(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfigurePlayerHeader (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("configureplayerheader")) { return __ref.runUserSub(false, "b4xmainpage","configureplayerheader", __ref);}
 BA.debugLineNum = 496;BA.debugLine="Private Sub ConfigurePlayerHeader";
Debug.ShouldStop(32768);
 BA.debugLineNum = 497;BA.debugLine="headerActionPane.Visible = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 498;BA.debugLine="lblHeaderAction.Text = Chr(0x22EF)";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0x22ef))))));
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configuresetupscreen(RemoteObject __ref,RemoteObject _mode,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ConfigureSetupScreen (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("configuresetupscreen")) { return __ref.runUserSub(false, "b4xmainpage","configuresetupscreen", __ref, _mode, _text);}
RemoteObject _issettingsmode = RemoteObject.createImmutable(false);
Debug.locals.put("mode", _mode);
Debug.locals.put("text", _text);
 BA.debugLineNum = 467;BA.debugLine="Private Sub ConfigureSetupScreen(mode As String, t";
Debug.ShouldStop(262144);
 BA.debugLineNum = 468;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
Debug.ShouldStop(524288);
_issettingsmode = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("settings")));Debug.locals.put("isSettingsMode", _issettingsmode);Debug.locals.put("isSettingsMode", _issettingsmode);
 BA.debugLineNum = 469;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_mode,BA.ObjectToString("setup"))));
 BA.debugLineNum = 470;BA.debugLine="If isSettingsMode Then";
Debug.ShouldStop(2097152);
if (_issettingsmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 471;BA.debugLine="lblHeaderAction.Text = \"×\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("×"));
 }else {
 BA.debugLineNum = 473;BA.debugLine="lblHeaderAction.Text = Chr(0x22EF)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0x22ef))))));
 };
 BA.debugLineNum = 475;BA.debugLine="If isSettingsMode Then";
Debug.ShouldStop(67108864);
if (_issettingsmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 476;BA.debugLine="txtPlayerCode.Editable = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setEditable",b4xmainpage.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 478;BA.debugLine="txtPlayerCode.Editable = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setEditable",b4xmainpage.__c.getField(true,"True"));
 };
 BA.debugLineNum = 480;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_formatplayercodefordisplay" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 481;BA.debugLine="If isSettingsMode Then";
Debug.ShouldStop(1);
if (_issettingsmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 482;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"logout\").ToU";
Debug.ShouldStop(2);
__ref.getField(false,"_btnsetupsubmit" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("logout"))).runMethod(true,"toUpperCase"));
 }else {
 BA.debugLineNum = 484;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"setup_submit";
Debug.ShouldStop(8);
__ref.getField(false,"_btnsetupsubmit" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("setup_submit"))).runMethod(true,"toUpperCase"));
 };
 BA.debugLineNum = 486;BA.debugLine="If text <> \"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_text,BA.ObjectToString(""))) { 
 BA.debugLineNum = 487;BA.debugLine="lblSetupMessage.Text = text";
Debug.ShouldStop(64);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 }else 
{ BA.debugLineNum = 488;BA.debugLine="Else If isSettingsMode Then";
Debug.ShouldStop(128);
if (_issettingsmode.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 489;BA.debugLine="lblSetupMessage.Text = MessageValue(\"settings_th";
Debug.ShouldStop(256);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("settings_thanks"))));
 }else {
 BA.debugLineNum = 491;BA.debugLine="lblSetupMessage.Text = MessageValue(\"setup_title";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("setup_title"))));
 }}
;
 BA.debugLineNum = 493;BA.debugLine="If playerCode = \"\" Then lblHeader.Text = \"\"";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playercode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));};
 BA.debugLineNum = 494;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _confirmreservedheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfirmReservedHeight (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("confirmreservedheight")) { return __ref.runUserSub(false, "b4xmainpage","confirmreservedheight", __ref);}
 BA.debugLineNum = 365;BA.debugLine="Private Sub ConfirmReservedHeight As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="If confirmPane.Visible Then Return 84dip";
Debug.ShouldStop(8192);
if (__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
if (true) return b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 84)));};
 BA.debugLineNum = 367;BA.debugLine="Return 0";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consumepreparedqueueitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumePreparedQueueItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,693);
if (RapidSub.canDelegate("consumepreparedqueueitem")) { return __ref.runUserSub(false, "b4xmainpage","consumepreparedqueueitem", __ref);}
RemoteObject _firstqueueditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 693;BA.debugLine="Private Sub ConsumePreparedQueueItem";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 694;BA.debugLine="If playQueue.Size = 0 Or preparedItem.IsInitializ";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 695;BA.debugLine="If playQueue.Get(0) Is Map Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("i",__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))), RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 696;BA.debugLine="Dim firstQueuedItem As Map = playQueue.Get(0)";
Debug.ShouldStop(8388608);
_firstqueueditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_firstqueueditem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstQueuedItem", _firstqueueditem);Debug.locals.put("firstQueuedItem", _firstqueueditem);
 BA.debugLineNum = 697;BA.debugLine="If ItemsMatch(firstQueuedItem, preparedItem) The";
Debug.ShouldStop(16777216);
if (__ref.runClassMethod (b4j.example.b4xmainpage.class, "_itemsmatch" /*RemoteObject*/ ,(Object)(_firstqueueditem),(Object)(__ref.getField(false,"_prepareditem" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));};
 };
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createclaimparams(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateClaimParams (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1614);
if (RapidSub.canDelegate("createclaimparams")) { return __ref.runUserSub(false, "b4xmainpage","createclaimparams", __ref);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1614;BA.debugLine="Private Sub CreateClaimParams As Map";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1615;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16384);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1616;BA.debugLine="params.Initialize";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1617;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1618;BA.debugLine="params.Put(\"device\", deviceId)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((__ref.getField(true,"_deviceid" /*RemoteObject*/ ))));
 BA.debugLineNum = 1619;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_timezoneoffsetminutes" /*RemoteObject*/ ))));
 BA.debugLineNum = 1620;BA.debugLine="Return params";
Debug.ShouldStop(524288);
if (true) return _params;
 BA.debugLineNum = 1621;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _text,RemoteObject _fontsize,RemoteObject _textcolor,RemoteObject _bold,RemoteObject _wraptext) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1714);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "b4xmainpage","createlabel", __ref, _text, _fontsize, _textcolor, _bold, _wraptext);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("text", _text);
Debug.locals.put("fontSize", _fontsize);
Debug.locals.put("textColor", _textcolor);
Debug.locals.put("bold", _bold);
Debug.locals.put("wrapText", _wraptext);
 BA.debugLineNum = 1714;BA.debugLine="Private Sub CreateLabel(text As String, fontSize A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1715;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(262144);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1716;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(524288);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1717;BA.debugLine="lbl.Text = text";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setText",_text);
 BA.debugLineNum = 1718;BA.debugLine="lbl.WrapText = wrapText";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setWrapText",_wraptext);
 BA.debugLineNum = 1719;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.ShouldStop(4194304);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 1720;BA.debugLine="If bold Then";
Debug.ShouldStop(8388608);
if (_bold.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1721;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(fontSize)";
Debug.ShouldStop(16777216);
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(_fontsize)));
 }else {
 BA.debugLineNum = 1723;BA.debugLine="xlbl.Font = xui.CreateDefaultFont(fontSize)";
Debug.ShouldStop(67108864);
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(_fontsize)));
 };
 BA.debugLineNum = 1725;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.ShouldStop(268435456);
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 1726;BA.debugLine="SetLabelStyle(xlbl, \"-fx-alignment: center; -fx-t";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setlabelstyle" /*RemoteObject*/ ,(Object)(_xlbl),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(_textcolor)),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 1727;BA.debugLine="SetMouseTransparent(xlbl, True)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setmousetransparent" /*RemoteObject*/ ,(Object)(_xlbl),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 1728;BA.debugLine="Return xlbl";
Debug.ShouldStop(-2147483648);
if (true) return _xlbl;
 BA.debugLineNum = 1729;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmetaparams(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateMetaParams (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1594);
if (RapidSub.canDelegate("createmetaparams")) { return __ref.runUserSub(false, "b4xmainpage","createmetaparams", __ref);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1594;BA.debugLine="Private Sub CreateMetaParams As Map";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1595;BA.debugLine="Dim params As Map";
Debug.ShouldStop(67108864);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1596;BA.debugLine="params.Initialize";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1597;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1598;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_timezoneoffsetminutes" /*RemoteObject*/ ))));
 BA.debugLineNum = 1599;BA.debugLine="Return params";
Debug.ShouldStop(1073741824);
if (true) return _params;
 BA.debugLineNum = 1600;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnextparams(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateNextParams (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1602);
if (RapidSub.canDelegate("createnextparams")) { return __ref.runUserSub(false, "b4xmainpage","createnextparams", __ref);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1602;BA.debugLine="Private Sub CreateNextParams As Map";
Debug.ShouldStop(2);
 BA.debugLineNum = 1603;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1604;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1605;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1606;BA.debugLine="params.Put(\"device\", deviceId)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((__ref.getField(true,"_deviceid" /*RemoteObject*/ ))));
 BA.debugLineNum = 1607;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tz"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_timezoneoffsetminutes" /*RemoteObject*/ ))));
 BA.debugLineNum = 1608;BA.debugLine="params.Put(\"version\", APP_VERSION)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("version"))),(Object)((__ref.getField(true,"_app_version" /*RemoteObject*/ ))));
 BA.debugLineNum = 1609;BA.debugLine="If nextStartMode = \"manual\" Or nextStartMode = \"a";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_nextstartmode" /*RemoteObject*/ ),BA.ObjectToString("manual")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_nextstartmode" /*RemoteObject*/ ),BA.ObjectToString("auto"))) { 
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start"))),(Object)((__ref.getField(true,"_nextstartmode" /*RemoteObject*/ ))));};
 BA.debugLineNum = 1610;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_playlistindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("playlist"))),(Object)((__ref.getField(true,"_playlistindex" /*RemoteObject*/ ))));};
 BA.debugLineNum = 1611;BA.debugLine="Return params";
Debug.ShouldStop(1024);
if (true) return _params;
 BA.debugLineNum = 1612;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextbutton(RemoteObject __ref,RemoteObject _text,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateTextButton (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1731);
if (RapidSub.canDelegate("createtextbutton")) { return __ref.runUserSub(false, "b4xmainpage","createtextbutton", __ref, _text, _eventname);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _xbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("text", _text);
Debug.locals.put("eventName", _eventname);
 BA.debugLineNum = 1731;BA.debugLine="Private Sub CreateTextButton(text As String, event";
Debug.ShouldStop(4);
 BA.debugLineNum = 1732;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(8);
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1733;BA.debugLine="btn.Initialize(eventName)";
Debug.ShouldStop(16);
_btn.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 1734;BA.debugLine="Dim xbtn As B4XView = btn";
Debug.ShouldStop(32);
_xbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xbtn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject());Debug.locals.put("xbtn", _xbtn);Debug.locals.put("xbtn", _xbtn);
 BA.debugLineNum = 1735;BA.debugLine="xbtn.Text = text";
Debug.ShouldStop(64);
_xbtn.runMethod(true,"setText",_text);
 BA.debugLineNum = 1736;BA.debugLine="xbtn.Font = xui.CreateDefaultFont(12)";
Debug.ShouldStop(128);
_xbtn.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12))));
 BA.debugLineNum = 1737;BA.debugLine="SetPaneStyle(xbtn, \"-fx-background-color: transpa";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(_xbtn),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-border-color: rgba(255,255,255,0.12); -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xffe0e4ea)))),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 1738;BA.debugLine="Return xbtn";
Debug.ShouldStop(512);
if (true) return _xbtn;
 BA.debugLineNum = 1739;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _currentvolume(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("CurrentVolume (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1540);
if (RapidSub.canDelegate("currentvolume")) { return __ref.runUserSub(false, "b4xmainpage","currentvolume", __ref, _item);}
RemoteObject _volume = RemoteObject.createImmutable(0);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1540;BA.debugLine="Private Sub CurrentVolume(item As Map) As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 1541;BA.debugLine="Dim volume As Double = 0.7";
Debug.ShouldStop(16);
_volume = BA.numberCast(double.class, 0.7);Debug.locals.put("volume", _volume);Debug.locals.put("volume", _volume);
 BA.debugLineNum = 1542;BA.debugLine="If item.ContainsKey(\"volume\") Then volume = item.";
Debug.ShouldStop(32);
if (_item.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("volume")))).<Boolean>get().booleanValue()) { 
_volume = BA.numberCast(double.class, _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("volume")))));Debug.locals.put("volume", _volume);};
 BA.debugLineNum = 1543;BA.debugLine="If volume < 0 Then volume = 0";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_volume,BA.numberCast(double.class, 0))) { 
_volume = BA.numberCast(double.class, 0);Debug.locals.put("volume", _volume);};
 BA.debugLineNum = 1544;BA.debugLine="If volume > 1 Then volume = 1";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_volume,BA.numberCast(double.class, 1))) { 
_volume = BA.numberCast(double.class, 1);Debug.locals.put("volume", _volume);};
 BA.debugLineNum = 1545;BA.debugLine="Return Round(volume * 100)";
Debug.ShouldStop(256);
if (true) return BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_volume,RemoteObject.createImmutable(100)}, "*",0, 0))));
 BA.debugLineNum = 1546;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _effectivetrackremainms(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EffectiveTrackRemainMs (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1146);
if (RapidSub.canDelegate("effectivetrackremainms")) { return __ref.runUserSub(false, "b4xmainpage","effectivetrackremainms", __ref);}
RemoteObject _trackremain = RemoteObject.createImmutable(0L);
RemoteObject _activeaudio = RemoteObject.declareNull("b4j.example.audioplayer");
RemoteObject _breakremain = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 1146;BA.debugLine="Private Sub EffectiveTrackRemainMs As Long";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1147;BA.debugLine="Dim trackRemain As Long = 0";
Debug.ShouldStop(67108864);
_trackremain = BA.numberCast(long.class, 0);Debug.locals.put("trackRemain", _trackremain);Debug.locals.put("trackRemain", _trackremain);
 BA.debugLineNum = 1148;BA.debugLine="If activeAudioKey <> \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1149;BA.debugLine="Dim activeAudio As AudioPlayer = GetAudioByKey(a";
Debug.ShouldStop(268435456);
_activeaudio = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ )));Debug.locals.put("activeAudio", _activeaudio);Debug.locals.put("activeAudio", _activeaudio);
 BA.debugLineNum = 1150;BA.debugLine="If activeAudio.Duration > 0 Then trackRemain = a";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_activeaudio.runClassMethod (b4j.example.audioplayer.class, "_duration" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
_trackremain = RemoteObject.solve(new RemoteObject[] {_activeaudio.runClassMethod (b4j.example.audioplayer.class, "_duration" /*RemoteObject*/ ),_activeaudio.runClassMethod (b4j.example.audioplayer.class, "_position" /*RemoteObject*/ )}, "-",1, 2);Debug.locals.put("trackRemain", _trackremain);};
 };
 BA.debugLineNum = 1152;BA.debugLine="If scheduledBreakAt <= 0 Then Return trackRemain";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return _trackremain;};
 BA.debugLineNum = 1153;BA.debugLine="Dim breakRemain As Long = (scheduledBreakAt - Loc";
Debug.ShouldStop(1);
_breakremain = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_localnowtimestamp" /*RemoteObject*/ )}, "-",1, 2)),RemoteObject.createImmutable(1000)}, "*",0, 2);Debug.locals.put("breakRemain", _breakremain);Debug.locals.put("breakRemain", _breakremain);
 BA.debugLineNum = 1154;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("k",_trackremain,BA.numberCast(long.class, 0))) { 
if (true) return _breakremain;};
 BA.debugLineNum = 1155;BA.debugLine="Return Min(trackRemain, breakRemain)";
Debug.ShouldStop(4);
if (true) return BA.numberCast(long.class, b4xmainpage.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _trackremain)),(Object)(BA.numberCast(double.class, _breakremain))));
 BA.debugLineNum = 1156;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fadeoutandcontinue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FadeOutAndContinue (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1158);
if (RapidSub.canDelegate("fadeoutandcontinue")) { return __ref.runUserSub(false, "b4xmainpage","fadeoutandcontinue", __ref);}
ResumableSub_FadeOutAndContinue rsub = new ResumableSub_FadeOutAndContinue(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FadeOutAndContinue extends BA.ResumableSub {
public ResumableSub_FadeOutAndContinue(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _fadems = RemoteObject.createImmutable(0);
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FadeOutAndContinue (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1158);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1159;BA.debugLine="If isQueueTransitioning Then Return False";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_isqueuetransitioning" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1160;BA.debugLine="isQueueTransitioning = True";
Debug.ShouldStop(128);
__ref.setField ("_isqueuetransitioning" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1161;BA.debugLine="ClearExactBreakState";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearexactbreakstate" /*RemoteObject*/ );
 BA.debugLineNum = 1162;BA.debugLine="Dim fadeMs As Int";
Debug.ShouldStop(512);
_fadems = RemoteObject.createImmutable(0);Debug.locals.put("fadeMs", _fadems);
 BA.debugLineNum = 1163;BA.debugLine="If currentMediaType = \"track\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString("track"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1164;BA.debugLine="fadeMs = STOP_FADE_MS";
Debug.ShouldStop(2048);
_fadems = __ref.getField(true,"_stop_fade_ms" /*RemoteObject*/ );Debug.locals.put("fadeMs", _fadems);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1166;BA.debugLine="fadeMs = 0";
Debug.ShouldStop(8192);
_fadems = BA.numberCast(int.class, 0);Debug.locals.put("fadeMs", _fadems);
 if (true) break;
;
 BA.debugLineNum = 1168;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
Debug.ShouldStop(32768);

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))).runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(_fadems));
if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 1169;BA.debugLine="ClearPreparedState(False)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpreparedstate" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 1170;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unuse";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "fadeoutandcontinue"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_playpreparedorloadnext" /*RemoteObject*/ ));
this.state = 18;
return;
case 18:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1171;BA.debugLine="isQueueTransitioning = False";
Debug.ShouldStop(262144);
__ref.setField ("_isqueuetransitioning" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1172;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1173;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _fetchjsonwithtimeout(RemoteObject __ref,RemoteObject _url,RemoteObject _timeoutms) throws Exception{
try {
		Debug.PushSubsStack("FetchJsonWithTimeout (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,843);
if (RapidSub.canDelegate("fetchjsonwithtimeout")) { return __ref.runUserSub(false, "b4xmainpage","fetchjsonwithtimeout", __ref, _url, _timeoutms);}
ResumableSub_FetchJsonWithTimeout rsub = new ResumableSub_FetchJsonWithTimeout(null,__ref,_url,_timeoutms);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FetchJsonWithTimeout extends BA.ResumableSub {
public ResumableSub_FetchJsonWithTimeout(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _url,RemoteObject _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this._timeoutms = _timeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _url;
RemoteObject _timeoutms;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _errormessage = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FetchJsonWithTimeout (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,843);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("url", _url);
Debug.locals.put("timeoutMs", _timeoutms);
 BA.debugLineNum = 844;BA.debugLine="Dim result As Map";
Debug.ShouldStop(2048);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 845;BA.debugLine="result.Initialize";
Debug.ShouldStop(4096);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 846;BA.debugLine="result.Put(\"Success\", False)";
Debug.ShouldStop(8192);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 847;BA.debugLine="result.Put(\"Kind\", \"server\")";
Debug.ShouldStop(16384);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("server"))));
 BA.debugLineNum = 848;BA.debugLine="result.Put(\"Data\", Null)";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Data"))),(Object)(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 849;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
Debug.ShouldStop(65536);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 850;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(131072);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 851;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(262144);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 852;BA.debugLine="j.Download(url)";
Debug.ShouldStop(524288);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 853;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",_timeoutms);
 BA.debugLineNum = 854;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "fetchjsonwithtimeout"), (_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 855;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 18;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 856;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 857;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16777216);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 858;BA.debugLine="parser.Initialize(j.GetString)";
Debug.ShouldStop(33554432);
_parser.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 859;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Data"))),(Object)((_parser.runMethod(false,"NextObject").getObject())));
 BA.debugLineNum = 860;BA.debugLine="result.Put(\"Success\", True)";
Debug.ShouldStop(134217728);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 861;BA.debugLine="result.Put(\"Kind\", \"\")";
Debug.ShouldStop(268435456);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable(""))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 863;BA.debugLine="result.Put(\"Kind\", \"server\")";
Debug.ShouldStop(1073741824);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("server"))));
 BA.debugLineNum = 864;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
Debug.ShouldStop(-2147483648);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((RemoteObject.createImmutable("bad_json"))));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 18;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 867;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
Debug.ShouldStop(4);
_errormessage = _j.getField(true,"_errormessage" /*RemoteObject*/ );Debug.locals.put("errorMessage", _errormessage);Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 868;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
Debug.ShouldStop(8);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((_errormessage)));
 BA.debugLineNum = 869;BA.debugLine="If errorMessage.ToLowerCase.Contains(\"timed out\"";
Debug.ShouldStop(16);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean(".",_errormessage.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("timed out")))) || RemoteObject.solveBoolean(".",_errormessage.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("unknownhost")))) || RemoteObject.solveBoolean(".",_errormessage.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("refused"))))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 870;BA.debugLine="result.Put(\"Kind\", \"offline\")";
Debug.ShouldStop(32);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("offline"))));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 872;BA.debugLine="result.Put(\"Kind\", \"server\")";
Debug.ShouldStop(128);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("server"))));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 875;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 876;BA.debugLine="Return result";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 877;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _fetchnext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FetchNext (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,837);
if (RapidSub.canDelegate("fetchnext")) { return __ref.runUserSub(false, "b4xmainpage","fetchnext", __ref);}
ResumableSub_FetchNext rsub = new ResumableSub_FetchNext(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FetchNext extends BA.ResumableSub {
public ResumableSub_FetchNext(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FetchNext (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,837);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 838;BA.debugLine="Wait For (FetchJsonWithTimeout(NEXT_BASE_URL & \"?";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "fetchnext"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fetchjsonwithtimeout" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_next_base_url" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_buildparams" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createnextparams" /*RemoteObject*/ ))))),(Object)(__ref.getField(true,"_fetch_timeout_ms" /*RemoteObject*/ ))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 839;BA.debugLine="nextStartMode = \"\"";
Debug.ShouldStop(64);
__ref.setField ("_nextstartmode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 840;BA.debugLine="Return result";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 841;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _filterplayercode(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("FilterPlayerCode (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1645);
if (RapidSub.canDelegate("filterplayercode")) { return __ref.runUserSub(false, "b4xmainpage","filterplayercode", __ref, _value);}
RemoteObject _filtered = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 1645;BA.debugLine="Private Sub FilterPlayerCode(value As String) As S";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1646;BA.debugLine="Dim filtered As String = Regex.Replace(\"[^A-Za-z0";
Debug.ShouldStop(8192);
_filtered = b4xmainpage.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^A-Za-z0-9]")),(Object)(_value),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("filtered", _filtered);Debug.locals.put("filtered", _filtered);
 BA.debugLineNum = 1647;BA.debugLine="If filtered.Length > 5 Then filtered = filtered.S";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_filtered.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
_filtered = _filtered.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("filtered", _filtered);};
 BA.debugLineNum = 1648;BA.debugLine="Return filtered.ToUpperCase";
Debug.ShouldStop(32768);
if (true) return _filtered.runMethod(true,"toUpperCase");
 BA.debugLineNum = 1649;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatplayercodefordisplay(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("FormatPlayerCodeForDisplay (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1651);
if (RapidSub.canDelegate("formatplayercodefordisplay")) { return __ref.runUserSub(false, "b4xmainpage","formatplayercodefordisplay", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 1651;BA.debugLine="Private Sub FormatPlayerCodeForDisplay(value As St";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1652;BA.debugLine="Return value.Trim.ToUpperCase";
Debug.ShouldStop(524288);
if (true) return _value.runMethod(true,"trim").runMethod(true,"toUpperCase");
 BA.debugLineNum = 1653;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getaudiobykey(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("GetAudioByKey (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,650);
if (RapidSub.canDelegate("getaudiobykey")) { return __ref.runUserSub(false, "b4xmainpage","getaudiobykey", __ref, _audiokey);}
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 650;BA.debugLine="Private Sub GetAudioByKey(audioKey As String) As A";
Debug.ShouldStop(512);
 BA.debugLineNum = 651;BA.debugLine="If audioKey = \"secondary\" Then Return audioSecond";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_audiokey,BA.ObjectToString("secondary"))) { 
if (true) return __ref.getField(false,"_audiosecondary" /*RemoteObject*/ );};
 BA.debugLineNum = 652;BA.debugLine="Return audioPrimary";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_audioprimary" /*RemoteObject*/ );
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinactiveaudiokey(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetInactiveAudioKey (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,655);
if (RapidSub.canDelegate("getinactiveaudiokey")) { return __ref.runUserSub(false, "b4xmainpage","getinactiveaudiokey", __ref);}
 BA.debugLineNum = 655;BA.debugLine="Private Sub GetInactiveAudioKey As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 656;BA.debugLine="If activeAudioKey = \"primary\" Then Return \"second";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString("primary"))) { 
if (true) return BA.ObjectToString("secondary");};
 BA.debugLineNum = 657;BA.debugLine="Return \"primary\"";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToString("primary");
 BA.debugLineNum = 658;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getorcreatedeviceid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetOrCreateDeviceId (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1655);
if (RapidSub.canDelegate("getorcreatedeviceid")) { return __ref.runUserSub(false, "b4xmainpage","getorcreatedeviceid", __ref);}
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _uuid = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 1655;BA.debugLine="Private Sub GetOrCreateDeviceId As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1656;BA.debugLine="Dim id As String = storage.GetDefault(\"device_id\"";
Debug.ShouldStop(8388608);
_id = BA.ObjectToString(__ref.getField(false,"_storage" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("device_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1657;BA.debugLine="If id <> \"\" Then Return id";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("!",_id,BA.ObjectToString(""))) { 
if (true) return _id;};
 BA.debugLineNum = 1658;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(33554432);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1659;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
Debug.ShouldStop(67108864);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.util.UUID")));
 BA.debugLineNum = 1660;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"randomUUID";
Debug.ShouldStop(134217728);
_uuid = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_uuid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("randomUUID")),(Object)((b4xmainpage.__c.getField(false,"Null")))));Debug.locals.put("uuid", _uuid);Debug.locals.put("uuid", _uuid);
 BA.debugLineNum = 1661;BA.debugLine="id = uuid.RunMethod(\"toString\", Null)";
Debug.ShouldStop(268435456);
_id = BA.ObjectToString(_uuid.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((b4xmainpage.__c.getField(false,"Null")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 1662;BA.debugLine="SaveValue(\"device_id\", id)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_savevalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString("device_id")),(Object)((_id)));
 BA.debugLineNum = 1663;BA.debugLine="Return id";
Debug.ShouldStop(1073741824);
if (true) return _id;
 BA.debugLineNum = 1664;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleaudiocomplete(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioComplete (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1339);
if (RapidSub.canDelegate("handleaudiocomplete")) { return __ref.runUserSub(false, "b4xmainpage","handleaudiocomplete", __ref, _audiokey);}
ResumableSub_HandleAudioComplete rsub = new ResumableSub_HandleAudioComplete(null,__ref,_audiokey);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleAudioComplete extends BA.ResumableSub {
public ResumableSub_HandleAudioComplete(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _audiokey;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioComplete (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1339);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 1340;BA.debugLine="If isStoppedByUser Then Return False";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1341;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_audiokey,__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1342;BA.debugLine="If PromotePreparedPlayer(0, 0) Then Return True";
Debug.ShouldStop(536870912);
if (true) break;

case 13:
//if
this.state = 18;
if (__ref.runClassMethod (b4j.example.b4xmainpage.class, "_promotepreparedplayer" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1343;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unuse";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "handleaudiocomplete"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_playpreparedorloadnext" /*RemoteObject*/ ));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1344;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1345;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _handleaudioerror(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioError (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1322);
if (RapidSub.canDelegate("handleaudioerror")) { return __ref.runUserSub(false, "b4xmainpage","handleaudioerror", __ref, _audiokey, _message);}
ResumableSub_HandleAudioError rsub = new ResumableSub_HandleAudioError(null,__ref,_audiokey,_message);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleAudioError extends BA.ResumableSub {
public ResumableSub_HandleAudioError(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _audiokey,RemoteObject _message) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this._message = _message;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _audiokey;
RemoteObject _message;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioError (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1322);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("message", _message);
 BA.debugLineNum = 1323;BA.debugLine="If pendingPlayAudioKey = audioKey Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pendingplayaudiokey" /*RemoteObject*/ ),_audiokey)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1324;BA.debugLine="ClearPendingPlayState";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpendingplaystate" /*RemoteObject*/ );
 BA.debugLineNum = 1325;BA.debugLine="CallSubDelayed2(Me, \"PlaybackStartDone\", CreateM";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("PlaybackStartDone")),(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Success")),(parent.__c.getField(true,"False")),RemoteObject.createImmutable(("Message")),(_message)})))));
 BA.debugLineNum = 1326;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 1328;BA.debugLine="If pendingPrepareAudioKey = audioKey Then";
Debug.ShouldStop(32768);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pendingprepareaudiokey" /*RemoteObject*/ ),_audiokey)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1329;BA.debugLine="ClearPreparedState(False)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpreparedstate" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 1330;BA.debugLine="CallSubDelayed2(Me, \"PreloadDone\", CreateMap(\"Su";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("PreloadDone")),(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Success")),(parent.__c.getField(true,"False")),RemoteObject.createImmutable(("Message")),(_message)})))));
 BA.debugLineNum = 1331;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 1333;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
Debug.ShouldStop(1048576);

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("!",_audiokey,__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1334;BA.debugLine="If isStoppedByUser Or isStopping Then Return Fals";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstopping" /*RemoteObject*/ ))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 1335;BA.debugLine="Wait For (HandleMediaError) Complete (unused As B";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "handleaudioerror"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_handlemediaerror" /*RemoteObject*/ ));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1336;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1337;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _handleaudioready(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioReady (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1306);
if (RapidSub.canDelegate("handleaudioready")) { return __ref.runUserSub(false, "b4xmainpage","handleaudioready", __ref, _audiokey);}
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 1306;BA.debugLine="Private Sub HandleAudioReady(audioKey As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1307;BA.debugLine="If pendingPlayAudioKey = audioKey Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pendingplayaudiokey" /*RemoteObject*/ ),_audiokey)) { 
 BA.debugLineNum = 1308;BA.debugLine="ActivateLoadedItem(audioKey, pendingPlayItem, pe";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_activateloadeditem" /*RemoteObject*/ ,(Object)(_audiokey),(Object)(__ref.getField(false,"_pendingplayitem" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_pendingplayfadeinms" /*RemoteObject*/ )));
 BA.debugLineNum = 1309;BA.debugLine="ClearPendingPlayState";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpendingplaystate" /*RemoteObject*/ );
 BA.debugLineNum = 1310;BA.debugLine="CallSubDelayed2(Me, \"PlaybackStartDone\", CreateM";
Debug.ShouldStop(536870912);
b4xmainpage.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("PlaybackStartDone")),(Object)((b4xmainpage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Success")),(b4xmainpage.__c.getField(true,"True"))})))));
 BA.debugLineNum = 1311;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1313;BA.debugLine="If pendingPrepareAudioKey = audioKey Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pendingprepareaudiokey" /*RemoteObject*/ ),_audiokey)) { 
 BA.debugLineNum = 1314;BA.debugLine="preparedAudioKey = audioKey";
Debug.ShouldStop(2);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 1315;BA.debugLine="preparedItem = CloneMap(pendingPrepareItem)";
Debug.ShouldStop(4);
__ref.setField ("_prepareditem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clonemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_pendingprepareitem" /*RemoteObject*/ ))));
 BA.debugLineNum = 1316;BA.debugLine="pendingPrepareAudioKey = \"\"";
Debug.ShouldStop(8);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1317;BA.debugLine="pendingPrepareItem.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_pendingprepareitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1318;BA.debugLine="CallSubDelayed2(Me, \"PreloadDone\", CreateMap(\"Su";
Debug.ShouldStop(32);
b4xmainpage.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("PreloadDone")),(Object)((b4xmainpage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Success")),(b4xmainpage.__c.getField(true,"True"))})))));
 };
 BA.debugLineNum = 1320;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleaudiotimeupdate(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioTimeupdate (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1347);
if (RapidSub.canDelegate("handleaudiotimeupdate")) { return __ref.runUserSub(false, "b4xmainpage","handleaudiotimeupdate", __ref, _audiokey);}
ResumableSub_HandleAudioTimeupdate rsub = new ResumableSub_HandleAudioTimeupdate(null,__ref,_audiokey);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleAudioTimeupdate extends BA.ResumableSub {
public ResumableSub_HandleAudioTimeupdate(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _audiokey;
RemoteObject _unused = RemoteObject.createImmutable(false);
RemoteObject _remain = RemoteObject.createImmutable(0L);
RemoteObject _unused2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleAudioTimeupdate (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1347);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 1348;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_audiokey,__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1349;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1350;BA.debugLine="If ShouldTriggerBreakNow Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 16;
if (__ref.runClassMethod (b4j.example.b4xmainpage.class, "_shouldtriggerbreaknow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1351;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused A";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fadeoutandcontinue" /*RemoteObject*/ ));
this.state = 36;
return;
case 36:
//C
this.state = 16;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1352;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1354;BA.debugLine="Dim remain As Long = EffectiveTrackRemainMs";
Debug.ShouldStop(512);
_remain = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_effectivetrackremainms" /*RemoteObject*/ );Debug.locals.put("remain", _remain);Debug.locals.put("remain", _remain);
 BA.debugLineNum = 1355;BA.debugLine="If CanCrossfadePreparedItem And remain > 0 And re";
Debug.ShouldStop(1024);
if (true) break;

case 17:
//if
this.state = 20;
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_cancrossfadeprepareditem" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",_remain,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("k",_remain,BA.numberCast(long.class, __ref.getField(true,"_track_overlap_ms" /*RemoteObject*/ )))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1356;BA.debugLine="isCrossfadeTriggered = True";
Debug.ShouldStop(2048);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1357;BA.debugLine="PromotePreparedPlayer(TRACK_OVERLAP_MS, TRACK_OV";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_promotepreparedplayer" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_track_overlap_ms" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_track_overlap_ms" /*RemoteObject*/ )));
 BA.debugLineNum = 1358;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 1360;BA.debugLine="If prefetchDone Then Return False";
Debug.ShouldStop(32768);

case 20:
//if
this.state = 25;
if (__ref.getField(true,"_prefetchdone" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 1361;BA.debugLine="If remain <= 0 Then Return False";
Debug.ShouldStop(65536);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("k",_remain,BA.numberCast(long.class, 0))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 1362;BA.debugLine="If remain <= PREFETCH_SECONDS * 1000 Then";
Debug.ShouldStop(131072);
if (true) break;

case 32:
//if
this.state = 35;
if (RemoteObject.solveBoolean("k",_remain,BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_prefetch_seconds" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "*",0, 1)))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1363;BA.debugLine="prefetchDone = True";
Debug.ShouldStop(262144);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1364;BA.debugLine="Wait For (PrefetchNext) Complete (unused2 As Boo";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_prefetchnext" /*RemoteObject*/ ));
this.state = 37;
return;
case 37:
//C
this.state = 35;
_unused2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused2", _unused2);
;
 if (true) break;

case 35:
//C
this.state = -1;
;
 BA.debugLineNum = 1366;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1367;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _handleblockedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HandleBlockedState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1039);
if (RapidSub.canDelegate("handleblockedstate")) { return __ref.runUserSub(false, "b4xmainpage","handleblockedstate", __ref);}
 BA.debugLineNum = 1039;BA.debugLine="Private Sub HandleBlockedState";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1040;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 1041;BA.debugLine="HidePin";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 1042;BA.debugLine="ShowMessage(MessageValue(\"blocked\"))";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("blocked")))));
 BA.debugLineNum = 1043;BA.debugLine="ScheduleRetry(\"blocked\", 0)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("blocked")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlefetchfailure(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("HandleFetchFailure (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1001);
if (RapidSub.canDelegate("handlefetchfailure")) { return __ref.runUserSub(false, "b4xmainpage","handlefetchfailure", __ref, _result);}
ResumableSub_HandleFetchFailure rsub = new ResumableSub_HandleFetchFailure(null,__ref,_result);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleFetchFailure extends BA.ResumableSub {
public ResumableSub_HandleFetchFailure(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _result) {
this.parent = parent;
this.__ref = __ref;
this._result = _result;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result;
RemoteObject _hasinternet = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleFetchFailure (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1001);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("result", _result);
 BA.debugLineNum = 1002;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"offline\" Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("offline")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1003;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("offline")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1004;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1006;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (ha";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "handlefetchfailure"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_checkexternalconnectivity" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_hasinternet = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("hasInternet", _hasinternet);
;
 BA.debugLineNum = 1007;BA.debugLine="If hasInternet Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 10;
if (_hasinternet.<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1008;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1010;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("offline")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1012;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1013;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _handlemediaerror(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HandleMediaError (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1055);
if (RapidSub.canDelegate("handlemediaerror")) { return __ref.runUserSub(false, "b4xmainpage","handlemediaerror", __ref);}
ResumableSub_HandleMediaError rsub = new ResumableSub_HandleMediaError(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleMediaError extends BA.ResumableSub {
public ResumableSub_HandleMediaError(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _hasinternet = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleMediaError (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1055);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1056;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (ha";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "handlemediaerror"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_checkexternalconnectivity" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_hasinternet = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("hasInternet", _hasinternet);
;
 BA.debugLineNum = 1057;BA.debugLine="If hasInternet Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 6;
if (_hasinternet.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1058;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1060;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("offline")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1062;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1063;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _handlemessageitem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("HandleMessageItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,970);
if (RapidSub.canDelegate("handlemessageitem")) { return __ref.runUserSub(false, "b4xmainpage","handlemessageitem", __ref, _item);}
RemoteObject _action = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 970;BA.debugLine="Private Sub HandleMessageItem(item As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 971;BA.debugLine="Dim action As String = item.GetDefault(\"action\",";
Debug.ShouldStop(1024);
_action = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("action", _action);Debug.locals.put("action", _action);
 BA.debugLineNum = 972;BA.debugLine="If action = \"claim\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_action,BA.ObjectToString("claim"))) { 
 BA.debugLineNum = 973;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 974;BA.debugLine="isStarted = False";
Debug.ShouldStop(8192);
__ref.setField ("_isstarted" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 975;BA.debugLine="isStoppedByUser = True";
Debug.ShouldStop(16384);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 976;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 977;BA.debugLine="ShowClaimPrompt(item.GetDefault(\"message\", Messa";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showclaimprompt" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("message"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("device_busy")))))))));
 }else 
{ BA.debugLineNum = 978;BA.debugLine="Else If action = \"blocked\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_action,BA.ObjectToString("blocked"))) { 
 BA.debugLineNum = 979;BA.debugLine="HandleBlockedState";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handleblockedstate" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 980;BA.debugLine="Else If action = \"not_found\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_action,BA.ObjectToString("not_found"))) { 
 BA.debugLineNum = 981;BA.debugLine="StopForMissingData(item.GetDefault(\"message\", Me";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_stopformissingdata" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("message"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("not_found")))))))));
 }else {
 BA.debugLineNum = 983;BA.debugLine="HandleTemporaryState(\"server\", item.GetDefault(\"";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("message"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("server_wait")))))))));
 }}}
;
 BA.debugLineNum = 985;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handletemporarystate(RemoteObject __ref,RemoteObject _mode,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("HandleTemporaryState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1026);
if (RapidSub.canDelegate("handletemporarystate")) { return __ref.runUserSub(false, "b4xmainpage","handletemporarystate", __ref, _mode, _text);}
Debug.locals.put("mode", _mode);
Debug.locals.put("text", _text);
 BA.debugLineNum = 1026;BA.debugLine="Private Sub HandleTemporaryState(mode As String, t";
Debug.ShouldStop(2);
 BA.debugLineNum = 1027;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 1028;BA.debugLine="HidePin";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 1029;BA.debugLine="If text <> \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_text,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1030;BA.debugLine="ShowMessage(text)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(_text));
 }else 
{ BA.debugLineNum = 1031;BA.debugLine="Else If mode = \"offline\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("offline"))) { 
 BA.debugLineNum = 1032;BA.debugLine="ShowMessage(MessageValue(\"offline\"))";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("offline")))));
 }else {
 BA.debugLineNum = 1034;BA.debugLine="ShowMessage(MessageValue(\"server_wait\"))";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("server_wait")))));
 }}
;
 BA.debugLineNum = 1036;BA.debugLine="ScheduleRetry(mode, 0)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(_mode),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1037;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _haspendingexactbreak(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasPendingExactBreak (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1137);
if (RapidSub.canDelegate("haspendingexactbreak")) { return __ref.runUserSub(false, "b4xmainpage","haspendingexactbreak", __ref);}
 BA.debugLineNum = 1137;BA.debugLine="Private Sub HasPendingExactBreak As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1138;BA.debugLine="Return scheduledBreakAt > LocalNowTimestamp";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_localnowtimestamp" /*RemoteObject*/ )));
 BA.debugLineNum = 1139;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _headeractionpane_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HeaderActionPane_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("headeractionpane_click")) { return __ref.runUserSub(false, "b4xmainpage","headeractionpane_click", __ref);}
 BA.debugLineNum = 541;BA.debugLine="Private Sub HeaderActionPane_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 542;BA.debugLine="If appScreenMode = \"player\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("player"))) { 
 BA.debugLineNum = 543;BA.debugLine="ShowSettingsScreen";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsettingsscreen" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 544;BA.debugLine="Else If appScreenMode = \"settings\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("settings"))) { 
 BA.debugLineNum = 545;BA.debugLine="ShowPlayerScreen(False)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showplayerscreen" /*void*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 }}
;
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _headeractionpane_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("HeaderActionPane_MouseClicked (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("headeractionpane_mouseclicked")) { return __ref.runUserSub(false, "b4xmainpage","headeractionpane_mouseclicked", __ref, _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 549;BA.debugLine="Private Sub HeaderActionPane_MouseClicked (eventDa";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="HeaderActionPane_Click";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_headeractionpane_click" /*RemoteObject*/ );
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _headeractionpane_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("HeaderActionPane_MouseEntered (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,553);
if (RapidSub.canDelegate("headeractionpane_mouseentered")) { return __ref.runUserSub(false, "b4xmainpage","headeractionpane_mouseentered", __ref, _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 553;BA.debugLine="Private Sub HeaderActionPane_MouseEntered (eventDa";
Debug.ShouldStop(256);
 BA.debugLineNum = 554;BA.debugLine="UpdateHeaderActionAppearance(True)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateheaderactionappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _headeractionpane_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("HeaderActionPane_MouseExited (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("headeractionpane_mouseexited")) { return __ref.runUserSub(false, "b4xmainpage","headeractionpane_mouseexited", __ref, _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 557;BA.debugLine="Private Sub HeaderActionPane_MouseExited (eventDat";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="UpdateHeaderActionAppearance(False)";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateheaderactionappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("HideContentBlocks (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1465);
if (RapidSub.canDelegate("hidecontentblocks")) { return __ref.runUserSub(false, "b4xmainpage","hidecontentblocks", __ref);}
 BA.debugLineNum = 1465;BA.debugLine="Private Sub HideContentBlocks";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1466;BA.debugLine="HidePin";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 1467;BA.debugLine="SetStreamText(\"\")";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstreamtext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1468;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1469;BA.debugLine="btnConfirmYes.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1470;BA.debugLine="btnConfirmNo.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1471;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("HidePin (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1492);
if (RapidSub.canDelegate("hidepin")) { return __ref.runUserSub(false, "b4xmainpage","hidepin", __ref);}
 BA.debugLineNum = 1492;BA.debugLine="Private Sub HidePin";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1493;BA.debugLine="confirmPane.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1494;BA.debugLine="btnConfirmYes.Enabled = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1495;BA.debugLine="btnConfirmNo.Enabled = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1496;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _historytimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HistoryTimer_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1186);
if (RapidSub.canDelegate("historytimer_tick")) { __ref.runUserSub(false, "b4xmainpage","historytimer_tick", __ref); return;}
ResumableSub_HistoryTimer_Tick rsub = new ResumableSub_HistoryTimer_Tick(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HistoryTimer_Tick extends BA.ResumableSub {
public ResumableSub_HistoryTimer_Tick(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HistoryTimer_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1186);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1187;BA.debugLine="historyTimer.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_historytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1188;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1189;BA.debugLine="If historyItem.IsInitialized = False Then Return";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_historyitem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1190;BA.debugLine="If currentMediaType <> historyItem.GetDefault(\"ty";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString(__ref.getField(false,"_historyitem" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1191;BA.debugLine="If currentTrackUrl = \"\" Then Return";
Debug.ShouldStop(64);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currenttrackurl" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 1192;BA.debugLine="Wait For (SendHistory(historyItem)) Complete (unu";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "historytimer_tick"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_sendhistory" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_historyitem" /*RemoteObject*/ ))));
this.state = 25;
return;
case 25:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1193;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 112;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initplayerinfo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitPlayerInfo (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("initplayerinfo")) { return __ref.runUserSub(false, "b4xmainpage","initplayerinfo", __ref);}
ResumableSub_InitPlayerInfo rsub = new ResumableSub_InitPlayerInfo(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InitPlayerInfo extends BA.ResumableSub {
public ResumableSub_InitPlayerInfo(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultdata = RemoteObject.declareNull("Object");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InitPlayerInfo (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,619);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 620;BA.debugLine="If playerCode = \"\" Then Return False";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playercode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 621;BA.debugLine="Wait For (FetchJsonWithTimeout(PLAYER_BASE_URL &";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "initplayerinfo"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fetchjsonwithtimeout" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_player_base_url" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_buildparams" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createmetaparams" /*RemoteObject*/ ))))),(Object)(__ref.getField(true,"_fetch_timeout_ms" /*RemoteObject*/ ))));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 622;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"False")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 623;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_renderplayerhead" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_playercode" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 624;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 626;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
Debug.ShouldStop(131072);
_resultdata = _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))));Debug.locals.put("resultData", _resultdata);Debug.locals.put("resultData", _resultdata);
 BA.debugLineNum = 627;BA.debugLine="If resultData Is Map Then";
Debug.ShouldStop(262144);
if (true) break;

case 11:
//if
this.state = 18;
if (RemoteObject.solveBoolean("i",_resultdata, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 628;BA.debugLine="Dim data As Map = resultData";
Debug.ShouldStop(524288);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _resultdata);Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 629;BA.debugLine="If data.GetDefault(\"ok\", False) <> True Then";
Debug.ShouldStop(1048576);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"True")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 630;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_renderplayerhead" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_playercode" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 631;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 633;BA.debugLine="RenderPlayerHead(data.GetDefault(\"code\", playerC";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_renderplayerhead" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((__ref.getField(true,"_playercode" /*RemoteObject*/ )))))),(Object)(BA.ObjectToString(_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 634;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 636;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_renderplayerhead" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_playercode" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 637;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initsettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitSettings (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("initsettings")) { return __ref.runUserSub(false, "b4xmainpage","initsettings", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Private Sub InitSettings";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="messages.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="messages.Put(\"offline\", \"Требуется интернет\")";
Debug.ShouldStop(16);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("offline"))),(Object)((RemoteObject.createImmutable("Требуется интернет"))));
 BA.debugLineNum = 134;BA.debugLine="messages.Put(\"server_wait\", \"Временная остановка\"";
Debug.ShouldStop(32);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("server_wait"))),(Object)((RemoteObject.createImmutable("Временная остановка"))));
 BA.debugLineNum = 135;BA.debugLine="messages.Put(\"idle\", \"Перерыв...\")";
Debug.ShouldStop(64);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idle"))),(Object)((RemoteObject.createImmutable("Перерыв..."))));
 BA.debugLineNum = 136;BA.debugLine="messages.Put(\"idle_until\", \"Перерыв до {time}\")";
Debug.ShouldStop(128);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idle_until"))),(Object)((RemoteObject.createImmutable("Перерыв до {time}"))));
 BA.debugLineNum = 137;BA.debugLine="messages.Put(\"blocked\", \"Плеер заблокирован\")";
Debug.ShouldStop(256);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("blocked"))),(Object)((RemoteObject.createImmutable("Плеер заблокирован"))));
 BA.debugLineNum = 138;BA.debugLine="messages.Put(\"idle_stream\", \"Запусти поток\")";
Debug.ShouldStop(512);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idle_stream"))),(Object)((RemoteObject.createImmutable("Запусти поток"))));
 BA.debugLineNum = 139;BA.debugLine="messages.Put(\"player_required\", \"Не указан плеер\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player_required"))),(Object)((RemoteObject.createImmutable("Не указан плеер"))));
 BA.debugLineNum = 140;BA.debugLine="messages.Put(\"device_required\", \"Не указано устро";
Debug.ShouldStop(2048);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device_required"))),(Object)((RemoteObject.createImmutable("Не указано устройство"))));
 BA.debugLineNum = 141;BA.debugLine="messages.Put(\"device_busy\", \"Плеер играет на друг";
Debug.ShouldStop(4096);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device_busy"))),(Object)((RemoteObject.createImmutable("Плеер играет на другом устройстве. Играть здесь?"))));
 BA.debugLineNum = 142;BA.debugLine="messages.Put(\"device_confirm_yes\", \"Да\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device_confirm_yes"))),(Object)((RemoteObject.createImmutable("Да"))));
 BA.debugLineNum = 143;BA.debugLine="messages.Put(\"device_confirm_no\", \"Нет\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device_confirm_no"))),(Object)((RemoteObject.createImmutable("Нет"))));
 BA.debugLineNum = 144;BA.debugLine="messages.Put(\"not_found\", \"Плеер не найден\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("not_found"))),(Object)((RemoteObject.createImmutable("Плеер не найден"))));
 BA.debugLineNum = 145;BA.debugLine="messages.Put(\"player_updated\", \"Плеер обновлен\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player_updated"))),(Object)((RemoteObject.createImmutable("Плеер обновлен"))));
 BA.debugLineNum = 146;BA.debugLine="messages.Put(\"player_reloading\", \"Обновление…\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player_reloading"))),(Object)((RemoteObject.createImmutable("Обновление…"))));
 BA.debugLineNum = 147;BA.debugLine="messages.Put(\"ad_label\", \"Реклама\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ad_label"))),(Object)((RemoteObject.createImmutable("Реклама"))));
 BA.debugLineNum = 148;BA.debugLine="messages.Put(\"setup_title\", \"Введите код плеера\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setup_title"))),(Object)((RemoteObject.createImmutable("Введите код плеера"))));
 BA.debugLineNum = 149;BA.debugLine="messages.Put(\"setup_placeholder\", \"abc12\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setup_placeholder"))),(Object)((RemoteObject.createImmutable("abc12"))));
 BA.debugLineNum = 150;BA.debugLine="messages.Put(\"setup_submit\", \"Войти\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setup_submit"))),(Object)((RemoteObject.createImmutable("Войти"))));
 BA.debugLineNum = 151;BA.debugLine="messages.Put(\"setup_invalid\", \"Введите код из 5 с";
Debug.ShouldStop(4194304);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setup_invalid"))),(Object)((RemoteObject.createImmutable("Введите код из 5 символов"))));
 BA.debugLineNum = 152;BA.debugLine="messages.Put(\"logout\", \"Выйти\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logout"))),(Object)((RemoteObject.createImmutable("Выйти"))));
 BA.debugLineNum = 153;BA.debugLine="messages.Put(\"settings_open\", \"Настройки\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("settings_open"))),(Object)((RemoteObject.createImmutable("Настройки"))));
 BA.debugLineNum = 154;BA.debugLine="messages.Put(\"settings_close\", \"Закрыть\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("settings_close"))),(Object)((RemoteObject.createImmutable("Закрыть"))));
 BA.debugLineNum = 155;BA.debugLine="messages.Put(\"settings_thanks\", \"Спасибо!\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_messages" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("settings_thanks"))),(Object)((RemoteObject.createImmutable("Спасибо!"))));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("initstate")) { return __ref.runUserSub(false, "b4xmainpage","initstate", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Private Sub InitState";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="storageDir = File.DirData(\"fonfm\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_storagedir" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("fonfm"))));
 BA.debugLineNum = 160;BA.debugLine="storage = LoadStorage";
Debug.ShouldStop(-2147483648);
__ref.setField ("_storage" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_loadstorage" /*RemoteObject*/ ));
 BA.debugLineNum = 161;BA.debugLine="deviceId = GetOrCreateDeviceId";
Debug.ShouldStop(1);
__ref.setField ("_deviceid" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getorcreatedeviceid" /*RemoteObject*/ ));
 BA.debugLineNum = 162;BA.debugLine="playerCode = NormalizePlayerCode(storage.GetDefau";
Debug.ShouldStop(2);
__ref.setField ("_playercode" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_normalizeplayercode" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_storage" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("player_code"))),(Object)((RemoteObject.createImmutable(""))))))));
 BA.debugLineNum = 163;BA.debugLine="playQueue.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 164;BA.debugLine="retryTimer.Initialize(\"RetryTimer\", SERVER_RETRY_";
Debug.ShouldStop(8);
__ref.getField(false,"_retrytimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RetryTimer")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_server_retry_delay_initial" /*RemoteObject*/ ))));
 BA.debugLineNum = 165;BA.debugLine="breakTimer.Initialize(\"BreakTimer\", 1000)";
Debug.ShouldStop(16);
__ref.getField(false,"_breaktimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("BreakTimer")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 166;BA.debugLine="historyTimer.Initialize(\"HistoryTimer\", HISTORY_L";
Debug.ShouldStop(32);
__ref.getField(false,"_historytimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("HistoryTimer")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_history_log_delay_ms" /*RemoteObject*/ ))));
 BA.debugLineNum = 167;BA.debugLine="historyItem.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_historyitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 168;BA.debugLine="activeItem.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_activeitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="preparedItem.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 170;BA.debugLine="activeAudioKey = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 171;BA.debugLine="preparedAudioKey = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 172;BA.debugLine="pendingPlayAudioKey = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_pendingplayaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 173;BA.debugLine="pendingPrepareAudioKey = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemsmatch(RemoteObject __ref,RemoteObject _firstitem,RemoteObject _seconditem) throws Exception{
try {
		Debug.PushSubsStack("ItemsMatch (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,676);
if (RapidSub.canDelegate("itemsmatch")) { return __ref.runUserSub(false, "b4xmainpage","itemsmatch", __ref, _firstitem, _seconditem);}
Debug.locals.put("firstItem", _firstitem);
Debug.locals.put("secondItem", _seconditem);
 BA.debugLineNum = 676;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
Debug.ShouldStop(8);
 BA.debugLineNum = 677;BA.debugLine="If firstItem.IsInitialized = False Or secondItem.";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_firstitem.runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_seconditem.runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 678;BA.debugLine="If firstItem.GetDefault(\"type\", \"\") <> secondItem";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_firstitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),_seconditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 679;BA.debugLine="If firstItem.GetDefault(\"id\", \"\") <> \"\" And first";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_firstitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable((""))) && RemoteObject.solveBoolean("=",_firstitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),_seconditem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))) { 
if (true) return b4xmainpage.__c.getField(true,"True");};
 BA.debugLineNum = 680;BA.debugLine="Return MediaUrl(firstItem) = MediaUrl(secondItem)";
Debug.ShouldStop(128);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mediaurl" /*RemoteObject*/ ,(Object)(_firstitem)),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mediaurl" /*RemoteObject*/ ,(Object)(_seconditem))));
 BA.debugLineNum = 681;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("JoinList (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1700);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "b4xmainpage","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 1700;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(8);
 BA.debugLineNum = 1701;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1702;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1703;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(64);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1704;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 1705;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1707;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(1024);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 1708;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _layoutui(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("LayoutUi (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("layoutui")) { return __ref.runUserSub(false, "b4xmainpage","layoutui", __ref, _width, _height);}
RemoteObject _safewidth = RemoteObject.createImmutable(0);
RemoteObject _safeheight = RemoteObject.createImmutable(0);
RemoteObject _outerpad = RemoteObject.createImmutable(0);
RemoteObject _horizontalpad = RemoteObject.createImmutable(0);
RemoteObject _sectiongap = RemoteObject.createImmutable(0);
RemoteObject _contentgap = RemoteObject.createImmutable(0);
RemoteObject _headerheight = RemoteObject.createImmutable(0);
RemoteObject _footerheight = RemoteObject.createImmutable(0);
RemoteObject _cardwidth = RemoteObject.createImmutable(0);
RemoteObject _preferredheight = RemoteObject.createImmutable(0);
RemoteObject _cardheight = RemoteObject.createImmutable(0);
RemoteObject _cardleft = RemoteObject.createImmutable(0);
RemoteObject _cardtop = RemoteObject.createImmutable(0);
RemoteObject _headeractionsize = RemoteObject.createImmutable(0);
RemoteObject _contentheight = RemoteObject.createImmutable(0);
RemoteObject _heroheight = RemoteObject.createImmutable(0);
RemoteObject _detailheight = RemoteObject.createImmutable(0);
RemoteObject _contentwidth = RemoteObject.createImmutable(0);
RemoteObject _controlsize = RemoteObject.createImmutable(0);
RemoteObject _inputleft = RemoteObject.createImmutable(0);
RemoteObject _inputtop = RemoteObject.createImmutable(0);
RemoteObject _accessorbitsize = RemoteObject.createImmutable(0);
RemoteObject _inputpanewidth = RemoteObject.createImmutable(0);
RemoteObject _inputpaneheight = RemoteObject.createImmutable(0);
RemoteObject _inputpaneleft = RemoteObject.createImmutable(0);
RemoteObject _inputpanetop = RemoteObject.createImmutable(0);
RemoteObject _codefieldheight = RemoteObject.createImmutable(0);
RemoteObject _orbitsize = RemoteObject.createImmutable(0);
RemoteObject _orbitleft = RemoteObject.createImmutable(0);
RemoteObject _controlleft = RemoteObject.createImmutable(0);
RemoteObject _controltop = RemoteObject.createImmutable(0);
RemoteObject _infoheight = RemoteObject.createImmutable(0);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 282;BA.debugLine="Private Sub LayoutUi(width As Int, height As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="Dim safeWidth As Int = Max(width, 320dip)";
Debug.ShouldStop(67108864);
_safewidth = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 320)))))));Debug.locals.put("safeWidth", _safewidth);Debug.locals.put("safeWidth", _safewidth);
 BA.debugLineNum = 284;BA.debugLine="Dim safeHeight As Int = Max(height, 420dip)";
Debug.ShouldStop(134217728);
_safeheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _height)),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 420)))))));Debug.locals.put("safeHeight", _safeheight);Debug.locals.put("safeHeight", _safeheight);
 BA.debugLineNum = 285;BA.debugLine="Dim outerPad As Int = ScaleValue(safeWidth, 12dip";
Debug.ShouldStop(268435456);
_outerpad = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));Debug.locals.put("outerPad", _outerpad);Debug.locals.put("outerPad", _outerpad);
 BA.debugLineNum = 286;BA.debugLine="Dim horizontalPad As Int = ScaleValue(safeWidth,";
Debug.ShouldStop(536870912);
_horizontalpad = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));Debug.locals.put("horizontalPad", _horizontalpad);Debug.locals.put("horizontalPad", _horizontalpad);
 BA.debugLineNum = 287;BA.debugLine="Dim sectionGap As Int = ScaleValue(safeWidth, 24d";
Debug.ShouldStop(1073741824);
_sectiongap = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 48)))));Debug.locals.put("sectionGap", _sectiongap);Debug.locals.put("sectionGap", _sectiongap);
 BA.debugLineNum = 288;BA.debugLine="Dim contentGap As Int = ScaleValue(safeWidth, 8di";
Debug.ShouldStop(-2147483648);
_contentgap = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))));Debug.locals.put("contentGap", _contentgap);Debug.locals.put("contentGap", _contentgap);
 BA.debugLineNum = 289;BA.debugLine="Dim headerHeight As Int = ScaleValue(safeWidth, 5";
Debug.ShouldStop(1);
_headerheight = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 56)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))));Debug.locals.put("headerHeight", _headerheight);Debug.locals.put("headerHeight", _headerheight);
 BA.debugLineNum = 290;BA.debugLine="Dim footerHeight As Int = headerHeight";
Debug.ShouldStop(2);
_footerheight = _headerheight;Debug.locals.put("footerHeight", _footerheight);Debug.locals.put("footerHeight", _footerheight);
 BA.debugLineNum = 291;BA.debugLine="Dim cardWidth As Int = Min(620dip, safeWidth - ou";
Debug.ShouldStop(4);
_cardwidth = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 620))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_safewidth,_outerpad,RemoteObject.createImmutable(2)}, "-*",1, 1)))));Debug.locals.put("cardWidth", _cardwidth);Debug.locals.put("cardWidth", _cardwidth);
 BA.debugLineNum = 292;BA.debugLine="Dim preferredHeight As Int = Max(400dip, safeHeig";
Debug.ShouldStop(8);
_preferredheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_safeheight,_outerpad,RemoteObject.createImmutable(2)}, "-*",1, 1)))));Debug.locals.put("preferredHeight", _preferredheight);Debug.locals.put("preferredHeight", _preferredheight);
 BA.debugLineNum = 293;BA.debugLine="Dim cardHeight As Int = Min(preferredHeight, safe";
Debug.ShouldStop(16);
_cardheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _preferredheight)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_safeheight,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "-",1, 1)))));Debug.locals.put("cardHeight", _cardheight);Debug.locals.put("cardHeight", _cardheight);
 BA.debugLineNum = 294;BA.debugLine="Dim cardLeft As Int = (safeWidth - cardWidth) / 2";
Debug.ShouldStop(32);
_cardleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_safewidth,_cardwidth}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("cardLeft", _cardleft);Debug.locals.put("cardLeft", _cardleft);
 BA.debugLineNum = 295;BA.debugLine="Dim cardTop As Int = (safeHeight - cardHeight) /";
Debug.ShouldStop(64);
_cardtop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_safeheight,_cardheight}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("cardTop", _cardtop);Debug.locals.put("cardTop", _cardtop);
 BA.debugLineNum = 297;BA.debugLine="card.SetLayoutAnimated(0, cardLeft, cardTop, card";
Debug.ShouldStop(256);
__ref.getField(false,"_card" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _cardleft)),(Object)(BA.numberCast(double.class, _cardtop)),(Object)(BA.numberCast(double.class, _cardwidth)),(Object)(BA.numberCast(double.class, _cardheight)));
 BA.debugLineNum = 298;BA.debugLine="headerPane.SetLayoutAnimated(0, 0, 0, cardWidth,";
Debug.ShouldStop(512);
__ref.getField(false,"_headerpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cardwidth)),(Object)(BA.numberCast(double.class, _headerheight)));
 BA.debugLineNum = 299;BA.debugLine="contentPane.SetLayoutAnimated(0, 0, headerHeight";
Debug.ShouldStop(1024);
__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_headerheight,_sectiongap,RemoteObject.createImmutable(2)}, "+/",1, 0)),(Object)(BA.numberCast(double.class, _cardwidth)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardheight,_headerheight,_footerheight,_sectiongap}, "---",3, 1))));
 BA.debugLineNum = 300;BA.debugLine="footerPane.SetLayoutAnimated(0, 0, cardHeight - f";
Debug.ShouldStop(2048);
__ref.getField(false,"_footerpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardheight,_footerheight}, "-",1, 1))),(Object)(BA.numberCast(double.class, _cardwidth)),(Object)(BA.numberCast(double.class, _footerheight)));
 BA.debugLineNum = 302;BA.debugLine="Dim headerActionSize As Int = ScaleValue(safeWidt";
Debug.ShouldStop(8192);
_headeractionsize = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 36)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 42)))));Debug.locals.put("headerActionSize", _headeractionsize);Debug.locals.put("headerActionSize", _headeractionsize);
 BA.debugLineNum = 303;BA.debugLine="headerActionPane.SetLayoutAnimated(0, cardWidth -";
Debug.ShouldStop(16384);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardwidth,_horizontalpad,_headeractionsize}, "--",2, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_headerheight,_headeractionsize}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(BA.numberCast(double.class, _headeractionsize)),(Object)(BA.numberCast(double.class, _headeractionsize)));
 BA.debugLineNum = 304;BA.debugLine="lblHeaderAction.SetLayoutAnimated(0, 0, 0, header";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 305;BA.debugLine="lblHeader.SetLayoutAnimated(0, horizontalPad + he";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_horizontalpad,_headeractionsize,_contentgap}, "++",2, 1))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardwidth,(RemoteObject.solve(new RemoteObject[] {_horizontalpad,_headeractionsize,_contentgap}, "++",2, 1)),RemoteObject.createImmutable(2)}, "-*",1, 1))),(Object)(BA.numberCast(double.class, _headerheight)));
 BA.debugLineNum = 307;BA.debugLine="setupPane.SetLayoutAnimated(0, 0, 0, contentPane.";
Debug.ShouldStop(262144);
__ref.getField(false,"_setuppane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 308;BA.debugLine="playerPane.SetLayoutAnimated(0, 0, 0, contentPane";
Debug.ShouldStop(524288);
__ref.getField(false,"_playerpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_contentpane" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 310;BA.debugLine="Dim contentHeight As Int = contentPane.Height";
Debug.ShouldStop(2097152);
_contentheight = BA.numberCast(int.class, __ref.getField(false,"_contentpane" /*RemoteObject*/ ).runMethod(true,"getHeight"));Debug.locals.put("contentHeight", _contentheight);Debug.locals.put("contentHeight", _contentheight);
 BA.debugLineNum = 311;BA.debugLine="Dim heroHeight As Int = Max(160dip, (contentHeigh";
Debug.ShouldStop(4194304);
_heroheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160))))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_contentheight,_sectiongap}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("heroHeight", _heroheight);Debug.locals.put("heroHeight", _heroheight);
 BA.debugLineNum = 312;BA.debugLine="Dim detailHeight As Int = Max(120dip, contentHeig";
Debug.ShouldStop(8388608);
_detailheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_contentheight,_heroheight,_sectiongap}, "--",2, 1)))));Debug.locals.put("detailHeight", _detailheight);Debug.locals.put("detailHeight", _detailheight);
 BA.debugLineNum = 313;BA.debugLine="Dim contentWidth As Int = cardWidth - horizontalP";
Debug.ShouldStop(16777216);
_contentwidth = RemoteObject.solve(new RemoteObject[] {_cardwidth,_horizontalpad,RemoteObject.createImmutable(2)}, "-*",1, 1);Debug.locals.put("contentWidth", _contentwidth);Debug.locals.put("contentWidth", _contentwidth);
 BA.debugLineNum = 315;BA.debugLine="setupHeroPane.SetLayoutAnimated(0, horizontalPad,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_setupheropane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _horizontalpad)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _contentwidth)),(Object)(BA.numberCast(double.class, _heroheight)));
 BA.debugLineNum = 316;BA.debugLine="setupDetailPane.SetLayoutAnimated(0, horizontalPa";
Debug.ShouldStop(134217728);
__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _horizontalpad)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_heroheight,_sectiongap}, "+",1, 1))),(Object)(BA.numberCast(double.class, _contentwidth)),(Object)(BA.numberCast(double.class, _detailheight)));
 BA.debugLineNum = 317;BA.debugLine="playerHeroPane.SetLayoutAnimated(0, horizontalPad";
Debug.ShouldStop(268435456);
__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _horizontalpad)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _contentwidth)),(Object)(BA.numberCast(double.class, _heroheight)));
 BA.debugLineNum = 318;BA.debugLine="playerDetailPane.SetLayoutAnimated(0, horizontalP";
Debug.ShouldStop(536870912);
__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _horizontalpad)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_heroheight,_sectiongap}, "+",1, 1))),(Object)(BA.numberCast(double.class, _contentwidth)),(Object)(BA.numberCast(double.class, _detailheight)));
 BA.debugLineNum = 320;BA.debugLine="Dim controlSize As Int = ScaleValue(safeWidth, 15";
Debug.ShouldStop(-2147483648);
_controlsize = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_scalevalue" /*RemoteObject*/ ,(Object)(_safewidth),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 156)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 172)))),(Object)(b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 182)))));Debug.locals.put("controlSize", _controlsize);Debug.locals.put("controlSize", _controlsize);
 BA.debugLineNum = 321;BA.debugLine="Dim inputLeft As Int = (setupHeroPane.Width - con";
Debug.ShouldStop(1);
_inputleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupheropane" /*RemoteObject*/ ).runMethod(true,"getWidth"),_controlsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("inputLeft", _inputleft);Debug.locals.put("inputLeft", _inputleft);
 BA.debugLineNum = 322;BA.debugLine="Dim inputTop As Int = Max(0, (setupHeroPane.Heigh";
Debug.ShouldStop(2);
_inputtop = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupheropane" /*RemoteObject*/ ).runMethod(true,"getHeight"),_controlsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("inputTop", _inputtop);Debug.locals.put("inputTop", _inputtop);
 BA.debugLineNum = 323;BA.debugLine="Dim accessOrbitSize As Int = controlSize + 20dip";
Debug.ShouldStop(4);
_accessorbitsize = RemoteObject.solve(new RemoteObject[] {_controlsize,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 1);Debug.locals.put("accessOrbitSize", _accessorbitsize);Debug.locals.put("accessOrbitSize", _accessorbitsize);
 BA.debugLineNum = 324;BA.debugLine="accessCorePane.SetLayoutAnimated(0, inputLeft - 1";
Debug.ShouldStop(8);
__ref.getField(false,"_accesscorepane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_inputleft,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_inputtop,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(BA.numberCast(double.class, _accessorbitsize)),(Object)(BA.numberCast(double.class, _accessorbitsize)));
 BA.debugLineNum = 325;BA.debugLine="accessCirclePane.SetLayoutAnimated(0, inputLeft,";
Debug.ShouldStop(16);
__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _inputleft)),(Object)(BA.numberCast(double.class, _inputtop)),(Object)(BA.numberCast(double.class, _controlsize)),(Object)(BA.numberCast(double.class, _controlsize)));
 BA.debugLineNum = 326;BA.debugLine="Dim inputPaneWidth As Int = controlSize - 34dip";
Debug.ShouldStop(32);
_inputpanewidth = RemoteObject.solve(new RemoteObject[] {_controlsize,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 34)))}, "-",1, 1);Debug.locals.put("inputPaneWidth", _inputpanewidth);Debug.locals.put("inputPaneWidth", _inputpanewidth);
 BA.debugLineNum = 327;BA.debugLine="Dim inputPaneHeight As Int = Min(72dip, controlSi";
Debug.ShouldStop(64);
_inputpaneheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_controlsize,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 62)))}, "-",1, 1)))));Debug.locals.put("inputPaneHeight", _inputpaneheight);Debug.locals.put("inputPaneHeight", _inputpaneheight);
 BA.debugLineNum = 328;BA.debugLine="Dim inputPaneLeft As Int = (controlSize - inputPa";
Debug.ShouldStop(128);
_inputpaneleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_controlsize,_inputpanewidth}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("inputPaneLeft", _inputpaneleft);Debug.locals.put("inputPaneLeft", _inputpaneleft);
 BA.debugLineNum = 329;BA.debugLine="Dim inputPaneTop As Int = (controlSize - inputPan";
Debug.ShouldStop(256);
_inputpanetop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_controlsize,_inputpaneheight}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("inputPaneTop", _inputpanetop);Debug.locals.put("inputPaneTop", _inputpanetop);
 BA.debugLineNum = 330;BA.debugLine="accessInputPane.SetLayoutAnimated(0, inputPaneLef";
Debug.ShouldStop(512);
__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _inputpaneleft)),(Object)(BA.numberCast(double.class, _inputpanetop)),(Object)(BA.numberCast(double.class, _inputpanewidth)),(Object)(BA.numberCast(double.class, _inputpaneheight)));
 BA.debugLineNum = 331;BA.debugLine="Dim codeFieldHeight As Int = inputPaneHeight";
Debug.ShouldStop(1024);
_codefieldheight = _inputpaneheight;Debug.locals.put("codeFieldHeight", _codefieldheight);Debug.locals.put("codeFieldHeight", _codefieldheight);
 BA.debugLineNum = 332;BA.debugLine="txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inpu";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _inputpanewidth)),(Object)(BA.numberCast(double.class, _codefieldheight)));
 BA.debugLineNum = 334;BA.debugLine="Dim orbitSize As Int = controlSize + 20dip";
Debug.ShouldStop(8192);
_orbitsize = RemoteObject.solve(new RemoteObject[] {_controlsize,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 1);Debug.locals.put("orbitSize", _orbitsize);Debug.locals.put("orbitSize", _orbitsize);
 BA.debugLineNum = 335;BA.debugLine="Dim orbitLeft As Int = (playerHeroPane.Width - or";
Debug.ShouldStop(16384);
_orbitleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).runMethod(true,"getWidth"),_orbitsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("orbitLeft", _orbitleft);Debug.locals.put("orbitLeft", _orbitleft);
 BA.debugLineNum = 336;BA.debugLine="Dim controlLeft As Int = (playerHeroPane.Width -";
Debug.ShouldStop(32768);
_controlleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).runMethod(true,"getWidth"),_controlsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("controlLeft", _controlleft);Debug.locals.put("controlLeft", _controlleft);
 BA.debugLineNum = 337;BA.debugLine="Dim controlTop As Int = Max(0, (playerHeroPane.He";
Debug.ShouldStop(65536);
_controltop = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerheropane" /*RemoteObject*/ ).runMethod(true,"getHeight"),_controlsize}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("controlTop", _controltop);Debug.locals.put("controlTop", _controltop);
 BA.debugLineNum = 338;BA.debugLine="orbitPane.SetLayoutAnimated(0, orbitLeft, control";
Debug.ShouldStop(131072);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _orbitleft)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_controltop,b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(BA.numberCast(double.class, _orbitsize)),(Object)(BA.numberCast(double.class, _orbitsize)));
 BA.debugLineNum = 339;BA.debugLine="playButtonPane.SetLayoutAnimated(0, controlLeft,";
Debug.ShouldStop(262144);
__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _controlleft)),(Object)(BA.numberCast(double.class, _controltop)),(Object)(BA.numberCast(double.class, _controlsize)),(Object)(BA.numberCast(double.class, _controlsize)));
 BA.debugLineNum = 340;BA.debugLine="lblPlayIcon.SetLayoutAnimated(0, 0, 0, controlSiz";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _controlsize)),(Object)(BA.numberCast(double.class, _controlsize)));
 BA.debugLineNum = 342;BA.debugLine="setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setup";
Debug.ShouldStop(2097152);
__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 56))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.38)}, "*",0, 0)))));
 BA.debugLineNum = 343;BA.debugLine="setupStatusPane.SetLayoutAnimated(0, 0, setupPrim";
Debug.ShouldStop(4194304);
__ref.getField(false,"_setupstatuspane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).runMethod(true,"getHeight"),_contentgap}, "+",1, 0)),(Object)(__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupdetailpane" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).runMethod(true,"getHeight"),_contentgap}, "--",2, 0)));
 BA.debugLineNum = 344;BA.debugLine="btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setup";
Debug.ShouldStop(8388608);
__ref.getField(false,"_btnsetupsubmit" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).runMethod(true,"getWidth"),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 132)))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_setupprimarypane" /*RemoteObject*/ ).runMethod(true,"getHeight"),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44)))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 132))))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44))))));
 BA.debugLineNum = 345;BA.debugLine="lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupS";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblsetupmessage" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_setupstatuspane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_setupstatuspane" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 347;BA.debugLine="playerPrimaryPane.SetLayoutAnimated(0, 0, 0, play";
Debug.ShouldStop(67108864);
__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 56))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(0.4)}, "*",0, 0)))));
 BA.debugLineNum = 348;BA.debugLine="playerStatusPane.SetLayoutAnimated(0, 0, playerPr";
Debug.ShouldStop(134217728);
__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).runMethod(true,"getHeight"),_contentgap}, "+",1, 0)),(Object)(__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerdetailpane" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).runMethod(true,"getHeight"),_contentgap}, "--",2, 0)));
 BA.debugLineNum = 349;BA.debugLine="lblStream.SetLayoutAnimated(0, 0, 0, playerPrimar";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblstream" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_playerprimarypane" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 350;BA.debugLine="Dim infoHeight As Int = Max(54dip, playerStatusPa";
Debug.ShouldStop(536870912);
_infoheight = BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 54))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_confirmreservedheight" /*RemoteObject*/ )}, "-",1, 0))));Debug.locals.put("infoHeight", _infoheight);Debug.locals.put("infoHeight", _infoheight);
 BA.debugLineNum = 351;BA.debugLine="lblInfo.SetLayoutAnimated(0, 0, 0, playerStatusPa";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, _infoheight)));
 BA.debugLineNum = 352;BA.debugLine="If confirmPane.Visible Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 353;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
Debug.ShouldStop(1);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runMethod(true,"getHeight"),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))}, "-",1, 0)),(Object)(__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72))))));
 }else {
 BA.debugLineNum = 355;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
Debug.ShouldStop(4);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_playerstatuspane" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, 0)));
 };
 BA.debugLineNum = 357;BA.debugLine="btnConfirmYes.SetLayoutAnimated(0, Max(0, (confir";
Debug.ShouldStop(16);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"getWidth"),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 236)))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 112))))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44))))));
 BA.debugLineNum = 358;BA.debugLine="btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.L";
Debug.ShouldStop(32);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"getLeft"),b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 124)))}, "+",1, 0)),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 112))))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 44))))));
 BA.debugLineNum = 360;BA.debugLine="lblFooter.SetLayoutAnimated(0, horizontalPad, 0,";
Debug.ShouldStop(128);
__ref.getField(false,"_lblfooter" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _horizontalpad)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_cardwidth,_horizontalpad,RemoteObject.createImmutable(2)}, "-*",1, 1))),(Object)(BA.numberCast(double.class, _footerheight)));
 BA.debugLineNum = 361;BA.debugLine="UpdateResponsiveStyles(safeWidth)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateresponsivestyles" /*RemoteObject*/ ,(Object)(_safewidth));
 BA.debugLineNum = 362;BA.debugLine="UpdateVisibleMode";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatevisiblemode" /*RemoteObject*/ );
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadnextandplay(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadNextAndPlay (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,792);
if (RapidSub.canDelegate("loadnextandplay")) { return __ref.runUserSub(false, "b4xmainpage","loadnextandplay", __ref);}
ResumableSub_LoadNextAndPlay rsub = new ResumableSub_LoadNextAndPlay(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LoadNextAndPlay extends BA.ResumableSub {
public ResumableSub_LoadNextAndPlay(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _unused = RemoteObject.createImmutable(false);
RemoteObject _queue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _retryafter = RemoteObject.createImmutable(0);
RemoteObject _unused2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadNextAndPlay (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,792);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 793;BA.debugLine="ClearRetryTimer";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 794;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "loadnextandplay"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fetchnext" /*RemoteObject*/ ));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 795;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 796;BA.debugLine="Wait For (HandleFetchFailure(result)) Complete (";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "loadnextandplay"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_handlefetchfailure" /*RemoteObject*/ ,(Object)(_result)));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 797;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 799;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
Debug.ShouldStop(1073741824);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 800;BA.debugLine="ResetRetryDelay";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_resetretrydelay" /*RemoteObject*/ );
 BA.debugLineNum = 801;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
Debug.ShouldStop(1);
_queue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_queue = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_normalizequeueresponse" /*RemoteObject*/ ,(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))))));Debug.locals.put("queue", _queue);Debug.locals.put("queue", _queue);
 BA.debugLineNum = 802;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
Debug.ShouldStop(2);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_queue.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_queue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 803;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 804;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 806;BA.debugLine="playQueue = queue";
Debug.ShouldStop(32);
__ref.setField ("_playqueue" /*RemoteObject*/ ,_queue);
 BA.debugLineNum = 807;BA.debugLine="Dim retryAfter As Int = NormalizeRetryAfter(resul";
Debug.ShouldStop(64);
_retryafter = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_normalizeretryafter" /*RemoteObject*/ ,(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))))));Debug.locals.put("retryAfter", _retryafter);Debug.locals.put("retryAfter", _retryafter);
 BA.debugLineNum = 808;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, retryAfte";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "loadnextandplay"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_playqueueitem" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_shiftqueueitem" /*RemoteObject*/ )),(Object)(_retryafter)));
this.state = 16;
return;
case 16:
//C
this.state = -1;
_unused2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused2", _unused2);
;
 BA.debugLineNum = 809;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 810;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _loadstorage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadStorage (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1666);
if (RapidSub.canDelegate("loadstorage")) { return __ref.runUserSub(false, "b4xmainpage","loadstorage", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
 BA.debugLineNum = 1666;BA.debugLine="Private Sub LoadStorage As Map";
Debug.ShouldStop(2);
 BA.debugLineNum = 1667;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1668;BA.debugLine="m.Initialize";
Debug.ShouldStop(8);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1669;BA.debugLine="If File.Exists(storageDir, storageFile) = False T";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",b4xmainpage.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_storagefile" /*RemoteObject*/ ))),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return _m;};
 BA.debugLineNum = 1670;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 1671;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1672;BA.debugLine="parser.Initialize(File.ReadString(storageDir, st";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_storagefile" /*RemoteObject*/ )))));
 BA.debugLineNum = 1673;BA.debugLine="m = parser.NextObject";
Debug.ShouldStop(256);
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 1675;BA.debugLine="m.Initialize";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 1677;BA.debugLine="Return m";
Debug.ShouldStop(4096);
if (true) return _m;
 BA.debugLineNum = 1678;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _localnowtimestamp(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LocalNowTimestamp (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1696);
if (RapidSub.canDelegate("localnowtimestamp")) { return __ref.runUserSub(false, "b4xmainpage","localnowtimestamp", __ref);}
 BA.debugLineNum = 1696;BA.debugLine="Private Sub LocalNowTimestamp As Long";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1697;BA.debugLine="Return Floor(DateTime.Now / 1000) - (TimezoneOffs";
Debug.ShouldStop(1);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000)}, "/",0, 0))),(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.example.b4xmainpage.class, "_timezoneoffsetminutes" /*RemoteObject*/ ),RemoteObject.createImmutable(60)}, "*",0, 1))}, "-",1, 0));
 BA.debugLineNum = 1698;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logoutplayer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LogoutPlayer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,610);
if (RapidSub.canDelegate("logoutplayer")) { return __ref.runUserSub(false, "b4xmainpage","logoutplayer", __ref);}
ResumableSub_LogoutPlayer rsub = new ResumableSub_LogoutPlayer(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LogoutPlayer extends BA.ResumableSub {
public ResumableSub_LogoutPlayer(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LogoutPlayer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,610);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 611;BA.debugLine="SaveValue(\"player_code\", \"\")";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_savevalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString("player_code")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 612;BA.debugLine="playerCode = \"\"";
Debug.ShouldStop(8);
__ref.setField ("_playercode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 613;BA.debugLine="Wait For (StopPlayer) Complete (unused As Boolean";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "logoutplayer"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_stopplayer" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 614;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 615;BA.debugLine="ShowSetupScreen(\"\")";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsetupscreen" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 616;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _mediaurl(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("MediaUrl (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1527);
if (RapidSub.canDelegate("mediaurl")) { return __ref.runUserSub(false, "b4xmainpage","mediaurl", __ref, _item);}
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _first = RemoteObject.createImmutable("");
RemoteObject _folder = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 1527;BA.debugLine="Private Sub MediaUrl(item As Map) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1528;BA.debugLine="Dim id As String = item.GetDefault(\"id\", \"\")";
Debug.ShouldStop(8388608);
_id = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1529;BA.debugLine="If id = \"\" Then Return \"\"";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_id,BA.ObjectToString(""))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1530;BA.debugLine="Dim first As String = id.SubString2(0, 1)";
Debug.ShouldStop(33554432);
_first = _id.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 1531;BA.debugLine="Dim folder As String";
Debug.ShouldStop(67108864);
_folder = RemoteObject.createImmutable("");Debug.locals.put("folder", _folder);
 BA.debugLineNum = 1532;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("ad")))) { 
 BA.debugLineNum = 1533;BA.debugLine="folder = \"ads\"";
Debug.ShouldStop(268435456);
_folder = BA.ObjectToString("ads");Debug.locals.put("folder", _folder);
 }else {
 BA.debugLineNum = 1535;BA.debugLine="folder = \"tracks\"";
Debug.ShouldStop(1073741824);
_folder = BA.ObjectToString("tracks");Debug.locals.put("folder", _folder);
 };
 BA.debugLineNum = 1537;BA.debugLine="Return \"https://cdn.fon.fm/media/\" & folder & \"/\"";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("https://cdn.fon.fm/media/"),_folder,RemoteObject.createImmutable("/"),_first,RemoteObject.createImmutable("/"),_id,RemoteObject.createImmutable(".mp3"));
 BA.debugLineNum = 1538;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mergebreakitems(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("MergeBreakItems (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,987);
if (RapidSub.canDelegate("mergebreakitems")) { return __ref.runUserSub(false, "b4xmainpage","mergebreakitems", __ref, _item);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _merged = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _breakitem = RemoteObject.declareNull("Object");
RemoteObject _existing = RemoteObject.declareNull("Object");
Debug.locals.put("item", _item);
 BA.debugLineNum = 987;BA.debugLine="Private Sub MergeBreakItems(item As Map)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 988;BA.debugLine="Dim items As List = item.GetDefault(\"items\", Null";
Debug.ShouldStop(134217728);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("items"))),(Object)(b4xmainpage.__c.getField(false,"Null"))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 989;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_items.runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_items.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 990;BA.debugLine="Dim merged As List";
Debug.ShouldStop(536870912);
_merged = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("merged", _merged);
 BA.debugLineNum = 991;BA.debugLine="merged.Initialize";
Debug.ShouldStop(1073741824);
_merged.runVoidMethod ("Initialize");
 BA.debugLineNum = 992;BA.debugLine="For Each breakItem As Object In items";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group5 = _items;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_breakitem = group5.runMethod(false,"Get",index5);Debug.locals.put("breakItem", _breakitem);
Debug.locals.put("breakItem", _breakitem);
 BA.debugLineNum = 993;BA.debugLine="merged.Add(breakItem)";
Debug.ShouldStop(1);
_merged.runVoidMethod ("Add",(Object)(_breakitem));
 }
}Debug.locals.put("breakItem", _breakitem);
;
 BA.debugLineNum = 995;BA.debugLine="For Each existing As Object In playQueue";
Debug.ShouldStop(4);
{
final RemoteObject group8 = __ref.getField(false,"_playqueue" /*RemoteObject*/ );
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_existing = group8.runMethod(false,"Get",index8);Debug.locals.put("existing", _existing);
Debug.locals.put("existing", _existing);
 BA.debugLineNum = 996;BA.debugLine="merged.Add(existing)";
Debug.ShouldStop(8);
_merged.runVoidMethod ("Add",(Object)(_existing));
 }
}Debug.locals.put("existing", _existing);
;
 BA.debugLineNum = 998;BA.debugLine="playQueue = merged";
Debug.ShouldStop(32);
__ref.setField ("_playqueue" /*RemoteObject*/ ,_merged);
 BA.debugLineNum = 999;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mergenodestyle(RemoteObject __ref,RemoteObject _currentstyle,RemoteObject _extrastyle) throws Exception{
try {
		Debug.PushSubsStack("MergeNodeStyle (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1751);
if (RapidSub.canDelegate("mergenodestyle")) { return __ref.runUserSub(false, "b4xmainpage","mergenodestyle", __ref, _currentstyle, _extrastyle);}
Debug.locals.put("currentStyle", _currentstyle);
Debug.locals.put("extraStyle", _extrastyle);
 BA.debugLineNum = 1751;BA.debugLine="Private Sub MergeNodeStyle(currentStyle As String,";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1752;BA.debugLine="If currentStyle = Null Or currentStyle.Trim = \"\"";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("n",_currentstyle) || RemoteObject.solveBoolean("=",_currentstyle.runMethod(true,"trim"),BA.ObjectToString(""))) { 
if (true) return _extrastyle;};
 BA.debugLineNum = 1753;BA.debugLine="If extraStyle = Null Or extraStyle.Trim = \"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_extrastyle) || RemoteObject.solveBoolean("=",_extrastyle.runMethod(true,"trim"),BA.ObjectToString(""))) { 
if (true) return _currentstyle;};
 BA.debugLineNum = 1754;BA.debugLine="If currentStyle.EndsWith(\";\") Then";
Debug.ShouldStop(33554432);
if (_currentstyle.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1755;BA.debugLine="Return currentStyle & \" \" & extraStyle";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(_currentstyle,RemoteObject.createImmutable(" "),_extrastyle);
 }else {
 BA.debugLineNum = 1757;BA.debugLine="Return currentStyle & \"; \" & extraStyle";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(_currentstyle,RemoteObject.createImmutable("; "),_extrastyle);
 };
 BA.debugLineNum = 1759;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _messagevalue(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("MessageValue (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1710);
if (RapidSub.canDelegate("messagevalue")) { return __ref.runUserSub(false, "b4xmainpage","messagevalue", __ref, _key);}
Debug.locals.put("key", _key);
 BA.debugLineNum = 1710;BA.debugLine="Private Sub MessageValue(key As String) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1711;BA.debugLine="Return messages.GetDefault(key, \"\")";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString(__ref.getField(false,"_messages" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_key)),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1712;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizeplayercode(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("NormalizePlayerCode (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1639);
if (RapidSub.canDelegate("normalizeplayercode")) { return __ref.runUserSub(false, "b4xmainpage","normalizeplayercode", __ref, _value);}
RemoteObject _code = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 1639;BA.debugLine="Private Sub NormalizePlayerCode(value As String) A";
Debug.ShouldStop(64);
 BA.debugLineNum = 1640;BA.debugLine="Dim code As String = value.Trim.ToLowerCase";
Debug.ShouldStop(128);
_code = _value.runMethod(true,"trim").runMethod(true,"toLowerCase");Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 1641;BA.debugLine="If Regex.IsMatch(\"^[a-z0-9]{5}$\", code) Then Retu";
Debug.ShouldStop(256);
if (b4xmainpage.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("^[a-z0-9]{5}$")),(Object)(_code)).<Boolean>get().booleanValue()) { 
if (true) return _code;};
 BA.debugLineNum = 1642;BA.debugLine="Return \"\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 1643;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizequeueresponse(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("NormalizeQueueResponse (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1548);
if (RapidSub.canDelegate("normalizequeueresponse")) { return __ref.runUserSub(false, "b4xmainpage","normalizequeueresponse", __ref, _data);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _normalized = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("Object");
Debug.locals.put("data", _data);
 BA.debugLineNum = 1548;BA.debugLine="Private Sub NormalizeQueueResponse(data As Object)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1549;BA.debugLine="If data Is Map Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("i",_data, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1550;BA.debugLine="Dim m As Map = data";
Debug.ShouldStop(8192);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1551;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
Debug.ShouldStop(16384);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("queue"))),(Object)(b4xmainpage.__c.getField(false,"Null"))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 1552;BA.debugLine="If items.IsInitialized = False Then Return Null";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_items.runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null"));};
 BA.debugLineNum = 1553;BA.debugLine="Dim normalized As List";
Debug.ShouldStop(65536);
_normalized = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("normalized", _normalized);
 BA.debugLineNum = 1554;BA.debugLine="normalized.Initialize";
Debug.ShouldStop(131072);
_normalized.runVoidMethod ("Initialize");
 BA.debugLineNum = 1555;BA.debugLine="For Each item As Object In items";
Debug.ShouldStop(262144);
{
final RemoteObject group7 = _items;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.runMethod(false,"Get",index7);Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1556;BA.debugLine="If item Is Map Then normalized.Add(item)";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("i",_item, RemoteObject.createImmutable("java.util.Map"))) { 
_normalized.runVoidMethod ("Add",(Object)(_item));};
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 1558;BA.debugLine="Return normalized";
Debug.ShouldStop(2097152);
if (true) return _normalized;
 };
 BA.debugLineNum = 1560;BA.debugLine="Return Null";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null"));
 BA.debugLineNum = 1561;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _normalizeretryafter(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("NormalizeRetryAfter (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1563);
if (RapidSub.canDelegate("normalizeretryafter")) { return __ref.runUserSub(false, "b4xmainpage","normalizeretryafter", __ref, _data);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable(0);
Debug.locals.put("data", _data);
 BA.debugLineNum = 1563;BA.debugLine="Private Sub NormalizeRetryAfter(data As Object) As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1564;BA.debugLine="If data Is Map Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_data, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1565;BA.debugLine="Dim m As Map = data";
Debug.ShouldStop(268435456);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1566;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("retry_after")))),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 1567;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
Debug.ShouldStop(1073741824);
_value = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("retry_after")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1568;BA.debugLine="If value <= 0 Then Return 0";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",_value,BA.numberCast(double.class, 0))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 1569;BA.debugLine="Return value";
Debug.ShouldStop(1);
if (true) return _value;
 };
 BA.debugLineNum = 1571;BA.debugLine="Return 0";
Debug.ShouldStop(4);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 1572;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playbackstartdone(RemoteObject __ref,RemoteObject _unusedresult) throws Exception{
try {
		Debug.PushSubsStack("PlaybackStartDone (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,640);
if (RapidSub.canDelegate("playbackstartdone")) { return __ref.runUserSub(false, "b4xmainpage","playbackstartdone", __ref, _unusedresult);}
Debug.locals.put("unusedResult", _unusedresult);
 BA.debugLineNum = 640;BA.debugLine="Private Sub PlaybackStartDone(unusedResult As Map)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="If unusedResult.IsInitialized Then";
Debug.ShouldStop(1);
if (_unusedresult.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _playbuttonpane_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PlayButtonPane_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("playbuttonpane_click")) { __ref.runUserSub(false, "b4xmainpage","playbuttonpane_click", __ref); return;}
ResumableSub_PlayButtonPane_Click rsub = new ResumableSub_PlayButtonPane_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PlayButtonPane_Click extends BA.ResumableSub {
public ResumableSub_PlayButtonPane_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);
RemoteObject _unused2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PlayButtonPane_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,511);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 512;BA.debugLine="If playerCode = \"\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playercode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 513;BA.debugLine="ShowSetupScreen(MessageValue(\"player_required\"))";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsetupscreen" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("player_required")))));
 BA.debugLineNum = 514;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 516;BA.debugLine="If isStarted = False Then";
Debug.ShouldStop(8);

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 517;BA.debugLine="If isStopping Then Return";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 12;
if (__ref.getField(true,"_isstopping" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 518;BA.debugLine="isStarted = True";
Debug.ShouldStop(32);
__ref.setField ("_isstarted" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 519;BA.debugLine="isStoppedByUser = False";
Debug.ShouldStop(64);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 520;BA.debugLine="SetStopIcon";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstopicon" /*RemoteObject*/ );
 BA.debugLineNum = 521;BA.debugLine="HideContentBlocks";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 522;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete (u";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "playbuttonpane_click"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_startfirsttrack" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("manual"))));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 523;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 525;BA.debugLine="If isStopping Then Return";
Debug.ShouldStop(4096);

case 13:
//if
this.state = 18;
if (__ref.getField(true,"_isstopping" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 526;BA.debugLine="Wait For (StopPlayer) Complete (unused2 As Boolea";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "playbuttonpane_click"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_stopplayer" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = -1;
_unused2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused2", _unused2);
;
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _playbuttonpane_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("PlayButtonPane_MouseClicked (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("playbuttonpane_mouseclicked")) { return __ref.runUserSub(false, "b4xmainpage","playbuttonpane_mouseclicked", __ref, _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 529;BA.debugLine="Private Sub PlayButtonPane_MouseClicked (eventData";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="PlayButtonPane_Click";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_playbuttonpane_click" /*void*/ );
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playbuttonpane_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("PlayButtonPane_MouseEntered (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("playbuttonpane_mouseentered")) { return __ref.runUserSub(false, "b4xmainpage","playbuttonpane_mouseentered", __ref, _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 533;BA.debugLine="Private Sub PlayButtonPane_MouseEntered (eventData";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 534;BA.debugLine="UpdatePlayButtonAppearance(True)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playbuttonpane_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("PlayButtonPane_MouseExited (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("playbuttonpane_mouseexited")) { return __ref.runUserSub(false, "b4xmainpage","playbuttonpane_mouseexited", __ref, _eventdata);}
Debug.locals.put("eventData", _eventdata);
 BA.debugLineNum = 537;BA.debugLine="Private Sub PlayButtonPane_MouseExited (eventData";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 538;BA.debugLine="UpdatePlayButtonAppearance(False)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playpreparedorloadnext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PlayPreparedOrLoadNext (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,812);
if (RapidSub.canDelegate("playpreparedorloadnext")) { return __ref.runUserSub(false, "b4xmainpage","playpreparedorloadnext", __ref);}
ResumableSub_PlayPreparedOrLoadNext rsub = new ResumableSub_PlayPreparedOrLoadNext(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PlayPreparedOrLoadNext extends BA.ResumableSub {
public ResumableSub_PlayPreparedOrLoadNext(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);
RemoteObject _unused2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PlayPreparedOrLoadNext (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,812);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 813;BA.debugLine="ClearRetryTimer";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 814;BA.debugLine="If playQueue.Size > 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 815;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, 0)) Comp";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "playpreparedorloadnext"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_playqueueitem" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_shiftqueueitem" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0))));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 816;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 818;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused2 As B";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "playpreparedorloadnext"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_loadnextandplay" /*RemoteObject*/ ));
this.state = 6;
return;
case 6:
//C
this.state = -1;
_unused2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused2", _unused2);
;
 BA.debugLineNum = 819;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 820;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _playqueueitem(RemoteObject __ref,RemoteObject _current,RemoteObject _retryafter) throws Exception{
try {
		Debug.PushSubsStack("PlayQueueItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,905);
if (RapidSub.canDelegate("playqueueitem")) { return __ref.runUserSub(false, "b4xmainpage","playqueueitem", __ref, _current, _retryafter);}
ResumableSub_PlayQueueItem rsub = new ResumableSub_PlayQueueItem(null,__ref,_current,_retryafter);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PlayQueueItem extends BA.ResumableSub {
public ResumableSub_PlayQueueItem(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _current,RemoteObject _retryafter) {
this.parent = parent;
this.__ref = __ref;
this._current = _current;
this._retryafter = _retryafter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _current;
RemoteObject _retryafter;
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _unused = RemoteObject.createImmutable(false);
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _fadeinms = RemoteObject.createImmutable(0);
RemoteObject _targetaudiokey = RemoteObject.createImmutable("");
RemoteObject _playbackstarted = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PlayQueueItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,905);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("current", _current);
Debug.locals.put("retryAfter", _retryafter);
 BA.debugLineNum = 906;BA.debugLine="ClearExactBreakState";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearexactbreakstate" /*RemoteObject*/ );
 BA.debugLineNum = 907;BA.debugLine="ClearHistoryLogTimer";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearhistorylogtimer" /*RemoteObject*/ );
 BA.debugLineNum = 908;BA.debugLine="isCrossfadeTriggered = False";
Debug.ShouldStop(2048);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 909;BA.debugLine="If current Is Map Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 56;
if (RemoteObject.solveBoolean("i",_current, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 3;
}else {
this.state = 55;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 910;BA.debugLine="Dim item As Map = current";
Debug.ShouldStop(8192);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _current);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 911;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(16384);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 913;BA.debugLine="If itemType = \"message\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("message"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 914;BA.debugLine="HandleMessageItem(item)";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handlemessageitem" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 915;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 917;BA.debugLine="If itemType = \"update\" Then";
Debug.ShouldStop(1048576);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("update"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 918;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 919;BA.debugLine="isStarted = False";
Debug.ShouldStop(4194304);
__ref.setField ("_isstarted" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 920;BA.debugLine="isStoppedByUser = True";
Debug.ShouldStop(8388608);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 921;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 922;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("message"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("player_reloading")))))))));
 BA.debugLineNum = 923;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 926;BA.debugLine="HidePin";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 927;BA.debugLine="If itemType = \"idle\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("idle"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 928;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 929;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("message"))),(Object)((__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("idle")))))))));
 BA.debugLineNum = 930;BA.debugLine="If retryAfter > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",_retryafter,BA.numberCast(double.class, 0))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 931;BA.debugLine="ScheduleRetry(\"server\", retryAfter * 1000)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.solve(new RemoteObject[] {_retryafter,RemoteObject.createImmutable(1000)}, "*",0, 1)));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 933;BA.debugLine="ScheduleRetry(\"server\", PAUSE_RETRY_DELAY)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(__ref.getField(true,"_pause_retry_delay" /*RemoteObject*/ )));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 935;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 938;BA.debugLine="If itemType = \"break\" Then";
Debug.ShouldStop(512);

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("break"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 939;BA.debugLine="MergeBreakItems(item)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mergebreakitems" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 940;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unu";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "playqueueitem"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_playpreparedorloadnext" /*RemoteObject*/ ));
this.state = 57;
return;
case 57:
//C
this.state = 23;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 941;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 944;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
Debug.ShouldStop(32768);

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_itemtype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("!",_itemtype,BA.ObjectToString("ad"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 945;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 946;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 949;BA.debugLine="Dim url As String = MediaUrl(item)";
Debug.ShouldStop(1048576);
_url = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_mediaurl" /*RemoteObject*/ ,(Object)(_item));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 950;BA.debugLine="If url = \"\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_url,BA.ObjectToString(""))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 951;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 952;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 955;BA.debugLine="If item.ContainsKey(\"playlist\") Then playlistInd";
Debug.ShouldStop(67108864);

case 30:
//if
this.state = 35;
if (_item.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playlist")))).<Boolean>get().booleanValue()) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
__ref.setField ("_playlistindex" /*RemoteObject*/ ,BA.numberCast(int.class, _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("playlist"))))));
if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 956;BA.debugLine="prefetchDone = False";
Debug.ShouldStop(134217728);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 957;BA.debugLine="Dim fadeInMs As Int = 0";
Debug.ShouldStop(268435456);
_fadeinms = BA.numberCast(int.class, 0);Debug.locals.put("fadeInMs", _fadeinms);Debug.locals.put("fadeInMs", _fadeinms);
 BA.debugLineNum = 958;BA.debugLine="If itemType = \"track\" And currentMediaType = \"tr";
Debug.ShouldStop(536870912);
if (true) break;

case 36:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString("track")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
_fadeinms = __ref.getField(true,"_track_overlap_ms" /*RemoteObject*/ );Debug.locals.put("fadeInMs", _fadeinms);
if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 959;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioK";
Debug.ShouldStop(1073741824);
_targetaudiokey = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_getinactiveaudiokey" /*RemoteObject*/ );Debug.locals.put("targetAudioKey", _targetaudiokey);Debug.locals.put("targetAudioKey", _targetaudiokey);
 BA.debugLineNum = 960;BA.debugLine="If activeAudioKey = \"\" Then targetAudioKey = \"pr";
Debug.ShouldStop(-2147483648);
if (true) break;

case 42:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
_targetaudiokey = BA.ObjectToString("primary");Debug.locals.put("targetAudioKey", _targetaudiokey);
if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 961;BA.debugLine="Wait For (StartPlaybackWithAudioKey(targetAudioK";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "playqueueitem"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_startplaybackwithaudiokey" /*RemoteObject*/ ,(Object)(_targetaudiokey),(Object)(_item),(Object)(_fadeinms)));
this.state = 58;
return;
case 58:
//C
this.state = 48;
_playbackstarted = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("playbackStarted", _playbackstarted);
;
 BA.debugLineNum = 962;BA.debugLine="If playbackStarted = False Or isStarted = False";
Debug.ShouldStop(2);
if (true) break;

case 48:
//if
this.state = 53;
if (RemoteObject.solveBoolean("=",_playbackstarted,parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 50;
;}if (true) break;

case 50:
//C
this.state = 53;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 53:
//C
this.state = 56;
;
 BA.debugLineNum = 963;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 965;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 966;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 56:
//C
this.state = -1;
;
 BA.debugLineNum = 968;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _prefetchnext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrefetchNext (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,822);
if (RapidSub.canDelegate("prefetchnext")) { return __ref.runUserSub(false, "b4xmainpage","prefetchnext", __ref);}
ResumableSub_PrefetchNext rsub = new ResumableSub_PrefetchNext(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrefetchNext extends BA.ResumableSub {
public ResumableSub_PrefetchNext(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _preparedok = RemoteObject.createImmutable(false);
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _queue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrefetchNext (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,822);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 823;BA.debugLine="If playQueue.Size > 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 824;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepare";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "prefetchnext"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_preparenextplayable" /*RemoteObject*/ ));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_preparedok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("preparedOk", _preparedok);
;
 BA.debugLineNum = 825;BA.debugLine="Return preparedOk";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_preparedok));return;};
 if (true) break;
;
 BA.debugLineNum = 827;BA.debugLine="If HasPendingExactBreak Then Return False";
Debug.ShouldStop(67108864);

case 4:
//if
this.state = 9;
if (__ref.runClassMethod (b4j.example.b4xmainpage.class, "_haspendingexactbreak" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 828;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "prefetchnext"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fetchnext" /*RemoteObject*/ ));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 829;BA.debugLine="If result.GetDefault(\"Success\", False) = False Or";
Debug.ShouldStop(268435456);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"False"))) || RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 830;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
Debug.ShouldStop(536870912);
_queue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_queue = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_normalizequeueresponse" /*RemoteObject*/ ,(Object)(_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))))));Debug.locals.put("queue", _queue);Debug.locals.put("queue", _queue);
 BA.debugLineNum = 831;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
Debug.ShouldStop(1073741824);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_queue.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_queue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 832;BA.debugLine="playQueue = queue";
Debug.ShouldStop(-2147483648);
__ref.setField ("_playqueue" /*RemoteObject*/ ,_queue);
 BA.debugLineNum = 833;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepared";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "prefetchnext"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_preparenextplayable" /*RemoteObject*/ ));
this.state = 24;
return;
case 24:
//C
this.state = -1;
_preparedok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("preparedOk", _preparedok);
;
 BA.debugLineNum = 834;BA.debugLine="Return preparedOk";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_preparedok));return;};
 BA.debugLineNum = 835;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _preloaddone(RemoteObject __ref,RemoteObject _unusedresult) throws Exception{
try {
		Debug.PushSubsStack("PreloadDone (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,645);
if (RapidSub.canDelegate("preloaddone")) { return __ref.runUserSub(false, "b4xmainpage","preloaddone", __ref, _unusedresult);}
Debug.locals.put("unusedResult", _unusedresult);
 BA.debugLineNum = 645;BA.debugLine="Private Sub PreloadDone(unusedResult As Map)";
Debug.ShouldStop(16);
 BA.debugLineNum = 646;BA.debugLine="If unusedResult.IsInitialized Then";
Debug.ShouldStop(32);
if (_unusedresult.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 648;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparenextplayable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,740);
if (RapidSub.canDelegate("preparenextplayable")) { return __ref.runUserSub(false, "b4xmainpage","preparenextplayable", __ref);}
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _nextobject = RemoteObject.declareNull("Object");
RemoteObject _nextitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nexttype = RemoteObject.createImmutable("");
RemoteObject _targetaudiokey = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareNextPlayable (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,740);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 741;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 742;BA.debugLine="If playQueue.Size = 0 Then Return False";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 743;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
Debug.ShouldStop(64);
_nextobject = __ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("nextObject", _nextobject);Debug.locals.put("nextObject", _nextobject);
 BA.debugLineNum = 744;BA.debugLine="If nextObject Is Map Then";
Debug.ShouldStop(128);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("i",_nextobject, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 746;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 748;BA.debugLine="Dim nextItem As Map = nextObject";
Debug.ShouldStop(2048);
_nextitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nextitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _nextobject);Debug.locals.put("nextItem", _nextitem);Debug.locals.put("nextItem", _nextitem);
 BA.debugLineNum = 749;BA.debugLine="Dim nextType As String = nextItem.GetDefault(\"typ";
Debug.ShouldStop(4096);
_nexttype = BA.ObjectToString(_nextitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("nextType", _nexttype);Debug.locals.put("nextType", _nexttype);
 BA.debugLineNum = 750;BA.debugLine="If nextType <> \"track\" And nextType <> \"ad\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_nexttype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("!",_nexttype,BA.ObjectToString("ad"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 751;BA.debugLine="If preparedItem.IsInitialized And preparedAudioKe";
Debug.ShouldStop(16384);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_itemsmatch" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_prepareditem" /*RemoteObject*/ )),(Object)(_nextitem)))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 752;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
Debug.ShouldStop(32768);
_targetaudiokey = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_getinactiveaudiokey" /*RemoteObject*/ );Debug.locals.put("targetAudioKey", _targetaudiokey);Debug.locals.put("targetAudioKey", _targetaudiokey);
 BA.debugLineNum = 753;BA.debugLine="ClearPreparedState(False)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpreparedstate" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 754;BA.debugLine="pendingPrepareAudioKey = targetAudioKey";
Debug.ShouldStop(131072);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,_targetaudiokey);
 BA.debugLineNum = 755;BA.debugLine="pendingPrepareItem = CloneMap(nextItem)";
Debug.ShouldStop(262144);
__ref.setField ("_pendingprepareitem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clonemap" /*RemoteObject*/ ,(Object)(_nextitem)));
 BA.debugLineNum = 756;BA.debugLine="GetAudioByKey(targetAudioKey).LoadUrl(MediaUrl(ne";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(_targetaudiokey)).runClassMethod (b4j.example.audioplayer.class, "_loadurl" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mediaurl" /*RemoteObject*/ ,(Object)(_nextitem))),(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_currentvolume" /*RemoteObject*/ ,(Object)(_nextitem))));
 BA.debugLineNum = 757;BA.debugLine="Wait For PreloadDone(result As Map)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","preloaddone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "preparenextplayable"), null);
this.state = 31;
return;
case 31:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 758;BA.debugLine="Return result.GetDefault(\"Success\", False)";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))));return;};
 BA.debugLineNum = 759;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _promotepreparedplayer(RemoteObject __ref,RemoteObject _fadeinms,RemoteObject _fadeoutms) throws Exception{
try {
		Debug.PushSubsStack("PromotePreparedPlayer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,769);
if (RapidSub.canDelegate("promotepreparedplayer")) { return __ref.runUserSub(false, "b4xmainpage","promotepreparedplayer", __ref, _fadeinms, _fadeoutms);}
RemoteObject _previousaudiokey = RemoteObject.createImmutable("");
RemoteObject _promoteditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("fadeInMs", _fadeinms);
Debug.locals.put("fadeOutMs", _fadeoutms);
 BA.debugLineNum = 769;BA.debugLine="Private Sub PromotePreparedPlayer(fadeInMs As Int,";
Debug.ShouldStop(1);
 BA.debugLineNum = 770;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 771;BA.debugLine="Dim previousAudioKey As String = activeAudioKey";
Debug.ShouldStop(4);
_previousaudiokey = __ref.getField(true,"_activeaudiokey" /*RemoteObject*/ );Debug.locals.put("previousAudioKey", _previousaudiokey);Debug.locals.put("previousAudioKey", _previousaudiokey);
 BA.debugLineNum = 772;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
Debug.ShouldStop(8);
_promoteditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_promoteditem = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_clonemap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_prepareditem" /*RemoteObject*/ )));Debug.locals.put("promotedItem", _promoteditem);Debug.locals.put("promotedItem", _promoteditem);
 BA.debugLineNum = 773;BA.debugLine="ConsumePreparedQueueItem";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_consumepreparedqueueitem" /*RemoteObject*/ );
 BA.debugLineNum = 774;BA.debugLine="activeAudioKey = preparedAudioKey";
Debug.ShouldStop(32);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ));
 BA.debugLineNum = 775;BA.debugLine="ActivateLoadedItem(activeAudioKey, promotedItem,";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_activateloadeditem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ )),(Object)(_promoteditem),(Object)(_fadeinms));
 BA.debugLineNum = 776;BA.debugLine="ClearPreparedState(False)";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpreparedstate" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 777;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_previousaudiokey,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_previousaudiokey,__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 778;BA.debugLine="GetAudioByKey(previousAudioKey).Stop(fadeOutMs)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(_previousaudiokey)).runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(_fadeoutms));
 };
 BA.debugLineNum = 780;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return b4xmainpage.__c.getField(true,"True");
 BA.debugLineNum = 781;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _renderplayerhead(RemoteObject __ref,RemoteObject _code,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("RenderPlayerHead (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1518);
if (RapidSub.canDelegate("renderplayerhead")) { return __ref.runUserSub(false, "b4xmainpage","renderplayerhead", __ref, _code, _title);}
RemoteObject _safecode = RemoteObject.createImmutable("");
Debug.locals.put("code", _code);
Debug.locals.put("title", _title);
 BA.debugLineNum = 1518;BA.debugLine="Private Sub RenderPlayerHead(code As String, title";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1519;BA.debugLine="Dim safeCode As String = FormatPlayerCodeForDispl";
Debug.ShouldStop(16384);
_safecode = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_formatplayercodefordisplay" /*RemoteObject*/ ,(Object)(_code));Debug.locals.put("safeCode", _safecode);Debug.locals.put("safeCode", _safecode);
 BA.debugLineNum = 1520;BA.debugLine="If title <> \"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_title,BA.ObjectToString(""))) { 
 BA.debugLineNum = 1521;BA.debugLine="lblHeader.Text = safeCode & \" • \" & title.ToUppe";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(_safecode,RemoteObject.createImmutable(" • "),_title.runMethod(true,"toUpperCase")));
 }else {
 BA.debugLineNum = 1523;BA.debugLine="lblHeader.Text = safeCode";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",_safecode);
 };
 BA.debugLineNum = 1525;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetretrydelay(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetRetryDelay (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1090);
if (RapidSub.canDelegate("resetretrydelay")) { return __ref.runUserSub(false, "b4xmainpage","resetretrydelay", __ref);}
 BA.debugLineNum = 1090;BA.debugLine="Private Sub ResetRetryDelay";
Debug.ShouldStop(2);
 BA.debugLineNum = 1091;BA.debugLine="offlineRetryDelay = OFFLINE_RETRY_DELAY_INITIAL";
Debug.ShouldStop(4);
__ref.setField ("_offlineretrydelay" /*RemoteObject*/ ,__ref.getField(true,"_offline_retry_delay_initial" /*RemoteObject*/ ));
 BA.debugLineNum = 1092;BA.debugLine="serverRetryDelay = SERVER_RETRY_DELAY_INITIAL";
Debug.ShouldStop(8);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,__ref.getField(true,"_server_retry_delay_initial" /*RemoteObject*/ ));
 BA.debugLineNum = 1093;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveerrormessage(RemoteObject __ref,RemoteObject _result,RemoteObject _fallback) throws Exception{
try {
		Debug.PushSubsStack("ResolveErrorMessage (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1581);
if (RapidSub.canDelegate("resolveerrormessage")) { return __ref.runUserSub(false, "b4xmainpage","resolveerrormessage", __ref, _result, _fallback);}
RemoteObject _resultdata = RemoteObject.declareNull("Object");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errormessage = RemoteObject.createImmutable("");
Debug.locals.put("result", _result);
Debug.locals.put("fallback", _fallback);
 BA.debugLineNum = 1581;BA.debugLine="Private Sub ResolveErrorMessage(result As Map, fal";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1582;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
Debug.ShouldStop(8192);
if (BA.ObjectToBoolean(_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((b4xmainpage.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1583;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
Debug.ShouldStop(16384);
_resultdata = _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))));Debug.locals.put("resultData", _resultdata);Debug.locals.put("resultData", _resultdata);
 BA.debugLineNum = 1584;BA.debugLine="If resultData Is Map Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("i",_resultdata, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1585;BA.debugLine="Dim m As Map = resultData";
Debug.ShouldStop(65536);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _resultdata);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1586;BA.debugLine="If m.GetDefault(\"message\", \"\") <> \"\" Then Retur";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("message"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
if (true) return BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));};
 };
 };
 BA.debugLineNum = 1589;BA.debugLine="Dim errorMessage As String = result.GetDefault(\"E";
Debug.ShouldStop(1048576);
_errormessage = BA.ObjectToString(_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("errorMessage", _errormessage);Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 1590;BA.debugLine="If errorMessage <> \"\" Then Return errorMessage";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_errormessage,BA.ObjectToString(""))) { 
if (true) return _errormessage;};
 BA.debugLineNum = 1591;BA.debugLine="Return fallback";
Debug.ShouldStop(4194304);
if (true) return _fallback;
 BA.debugLineNum = 1592;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveretrydelay(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms) throws Exception{
try {
		Debug.PushSubsStack("ResolveRetryDelay (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1065);
if (RapidSub.canDelegate("resolveretrydelay")) { return __ref.runUserSub(false, "b4xmainpage","resolveretrydelay", __ref, _mode, _delayms);}
RemoteObject _delay = RemoteObject.createImmutable(0);
RemoteObject _serverdelay = RemoteObject.createImmutable(0);
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
 BA.debugLineNum = 1065;BA.debugLine="Private Sub ResolveRetryDelay(mode As String, dela";
Debug.ShouldStop(256);
 BA.debugLineNum = 1066;BA.debugLine="If delayMs > 0 Then Return delayMs";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_delayms,BA.numberCast(double.class, 0))) { 
if (true) return _delayms;};
 BA.debugLineNum = 1067;BA.debugLine="If mode = \"offline\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("offline"))) { 
 BA.debugLineNum = 1068;BA.debugLine="Dim delay As Int = offlineRetryDelay";
Debug.ShouldStop(2048);
_delay = __ref.getField(true,"_offlineretrydelay" /*RemoteObject*/ );Debug.locals.put("delay", _delay);Debug.locals.put("delay", _delay);
 BA.debugLineNum = 1069;BA.debugLine="offlineRetryDelay = Min(offlineRetryDelay * 2, O";
Debug.ShouldStop(4096);
__ref.setField ("_offlineretrydelay" /*RemoteObject*/ ,BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_offlineretrydelay" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_offline_retry_delay_max" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1070;BA.debugLine="Return delay";
Debug.ShouldStop(8192);
if (true) return _delay;
 };
 BA.debugLineNum = 1072;BA.debugLine="If mode = \"blocked\" Then Return BLOCKED_RETRY_DEL";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("blocked"))) { 
if (true) return __ref.getField(true,"_blocked_retry_delay" /*RemoteObject*/ );};
 BA.debugLineNum = 1073;BA.debugLine="Dim serverDelay As Int = serverRetryDelay";
Debug.ShouldStop(65536);
_serverdelay = __ref.getField(true,"_serverretrydelay" /*RemoteObject*/ );Debug.locals.put("serverDelay", _serverdelay);Debug.locals.put("serverDelay", _serverdelay);
 BA.debugLineNum = 1074;BA.debugLine="serverRetryDelay = Min(serverRetryDelay * 2, SERV";
Debug.ShouldStop(131072);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,BA.numberCast(int.class, b4xmainpage.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_serverretrydelay" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_server_retry_delay_max" /*RemoteObject*/ ))))));
 BA.debugLineNum = 1075;BA.debugLine="Return serverDelay";
Debug.ShouldStop(262144);
if (true) return _serverdelay;
 BA.debugLineNum = 1076;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvescheduledbreakat(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResolveScheduledBreakAt (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1099);
if (RapidSub.canDelegate("resolvescheduledbreakat")) { return __ref.runUserSub(false, "b4xmainpage","resolvescheduledbreakat", __ref);}
RemoteObject _itemobj = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 1099;BA.debugLine="Private Sub ResolveScheduledBreakAt";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1100;BA.debugLine="scheduledBreakAt = -1";
Debug.ShouldStop(2048);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,BA.numberCast(long.class, -(double) (0 + 1)));
 BA.debugLineNum = 1101;BA.debugLine="For Each itemObj As Object In playQueue";
Debug.ShouldStop(4096);
{
final RemoteObject group2 = __ref.getField(false,"_playqueue" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobj = group2.runMethod(false,"Get",index2);Debug.locals.put("itemObj", _itemobj);
Debug.locals.put("itemObj", _itemobj);
 BA.debugLineNum = 1102;BA.debugLine="If itemObj Is Map Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("i",_itemobj, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 1103;BA.debugLine="Dim item As Map = itemObj";
Debug.ShouldStop(16384);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobj);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 1104;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("break"))) && RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("exactly"))),(Object)((b4xmainpage.__c.getField(true,"False")))),(b4xmainpage.__c.getField(true,"True"))) && RemoteObject.solveBoolean(".",_item.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("at")))))) { 
 BA.debugLineNum = 1105;BA.debugLine="scheduledBreakAt = item.Get(\"at\")";
Debug.ShouldStop(65536);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,BA.numberCast(long.class, _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("at"))))));
 BA.debugLineNum = 1106;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 };
 }
}Debug.locals.put("itemObj", _itemobj);
;
 BA.debugLineNum = 1110;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _retrytimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RetryTimer_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1084);
if (RapidSub.canDelegate("retrytimer_tick")) { __ref.runUserSub(false, "b4xmainpage","retrytimer_tick", __ref); return;}
ResumableSub_RetryTimer_Tick rsub = new ResumableSub_RetryTimer_Tick(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RetryTimer_Tick extends BA.ResumableSub {
public ResumableSub_RetryTimer_Tick(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RetryTimer_Tick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1084);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1085;BA.debugLine="retryTimer.Enabled = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_retrytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1086;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1087;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "retrytimer_tick"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_loadnextandplay" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 1088;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _savevalue(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SaveValue (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1680);
if (RapidSub.canDelegate("savevalue")) { return __ref.runUserSub(false, "b4xmainpage","savevalue", __ref, _key, _value);}
RemoteObject _gen = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1680;BA.debugLine="Private Sub SaveValue(key As String, value As Obje";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1681;BA.debugLine="storage.Put(key, value)";
Debug.ShouldStop(65536);
__ref.getField(false,"_storage" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 BA.debugLineNum = 1682;BA.debugLine="Dim gen As JSONGenerator";
Debug.ShouldStop(131072);
_gen = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("gen", _gen);
 BA.debugLineNum = 1683;BA.debugLine="gen.Initialize(storage)";
Debug.ShouldStop(262144);
_gen.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_storage" /*RemoteObject*/ )));
 BA.debugLineNum = 1684;BA.debugLine="File.WriteString(storageDir, storageFile, gen.ToS";
Debug.ShouldStop(524288);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_storagedir" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_storagefile" /*RemoteObject*/ )),(Object)(_gen.runMethod(true,"ToString")));
 BA.debugLineNum = 1685;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scalevalue(RemoteObject __ref,RemoteObject _availablewidth,RemoteObject _smallvalue,RemoteObject _mediumvalue,RemoteObject _largevalue) throws Exception{
try {
		Debug.PushSubsStack("ScaleValue (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1771);
if (RapidSub.canDelegate("scalevalue")) { return __ref.runUserSub(false, "b4xmainpage","scalevalue", __ref, _availablewidth, _smallvalue, _mediumvalue, _largevalue);}
Debug.locals.put("availableWidth", _availablewidth);
Debug.locals.put("smallValue", _smallvalue);
Debug.locals.put("mediumValue", _mediumvalue);
Debug.locals.put("largeValue", _largevalue);
 BA.debugLineNum = 1771;BA.debugLine="Private Sub ScaleValue(availableWidth As Int, smal";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1772;BA.debugLine="If availableWidth <= 420dip Then Return smallValu";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("k",_availablewidth,BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 420)))))) { 
if (true) return _smallvalue;};
 BA.debugLineNum = 1773;BA.debugLine="If availableWidth <= 720dip Then Return mediumVal";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("k",_availablewidth,BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 720)))))) { 
if (true) return _mediumvalue;};
 BA.debugLineNum = 1774;BA.debugLine="Return largeValue";
Debug.ShouldStop(8192);
if (true) return _largevalue;
 BA.debugLineNum = 1775;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schedulebreakwatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScheduleBreakWatch (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1117);
if (RapidSub.canDelegate("schedulebreakwatch")) { return __ref.runUserSub(false, "b4xmainpage","schedulebreakwatch", __ref);}
RemoteObject _delay = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 1117;BA.debugLine="Private Sub ScheduleBreakWatch";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1118;BA.debugLine="breakTimer.Enabled = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_breaktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1119;BA.debugLine="If HasPendingExactBreak = False Then Return";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_haspendingexactbreak" /*RemoteObject*/ ),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1120;BA.debugLine="Dim delay As Long = Max(1, ((scheduledBreakAt - L";
Debug.ShouldStop(-2147483648);
_delay = BA.numberCast(long.class, b4xmainpage.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_localnowtimestamp" /*RemoteObject*/ )}, "-",1, 2)),RemoteObject.createImmutable(1000)}, "*",0, 2)),RemoteObject.createImmutable(250)}, "-",1, 2)))));Debug.locals.put("delay", _delay);Debug.locals.put("delay", _delay);
 BA.debugLineNum = 1121;BA.debugLine="breakTimer.Interval = delay";
Debug.ShouldStop(1);
__ref.getField(false,"_breaktimer" /*RemoteObject*/ ).runMethod(true,"setInterval",_delay);
 BA.debugLineNum = 1122;BA.debugLine="breakTimer.Enabled = True";
Debug.ShouldStop(2);
__ref.getField(false,"_breaktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1123;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schedulehistorylog(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ScheduleHistoryLog (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1175);
if (RapidSub.canDelegate("schedulehistorylog")) { return __ref.runUserSub(false, "b4xmainpage","schedulehistorylog", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 1175;BA.debugLine="Private Sub ScheduleHistoryLog(item As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1176;BA.debugLine="If item.IsInitialized = False Then Return";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),b4xmainpage.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1177;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(16777216);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 1178;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_itemtype,BA.ObjectToString("track")) && RemoteObject.solveBoolean("!",_itemtype,BA.ObjectToString("ad"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1179;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1180;BA.debugLine="ClearHistoryLogTimer";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearhistorylogtimer" /*RemoteObject*/ );
 BA.debugLineNum = 1181;BA.debugLine="historyItem = item";
Debug.ShouldStop(268435456);
__ref.setField ("_historyitem" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 1182;BA.debugLine="historyTimer.Interval = HISTORY_LOG_DELAY_MS";
Debug.ShouldStop(536870912);
__ref.getField(false,"_historytimer" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_history_log_delay_ms" /*RemoteObject*/ )));
 BA.debugLineNum = 1183;BA.debugLine="historyTimer.Enabled = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_historytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1184;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scheduleretry(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms) throws Exception{
try {
		Debug.PushSubsStack("ScheduleRetry (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1078);
if (RapidSub.canDelegate("scheduleretry")) { return __ref.runUserSub(false, "b4xmainpage","scheduleretry", __ref, _mode, _delayms);}
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
 BA.debugLineNum = 1078;BA.debugLine="Private Sub ScheduleRetry(mode As String, delayMs";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1079;BA.debugLine="ClearRetryTimer";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 1080;BA.debugLine="retryTimer.Interval = ResolveRetryDelay(mode, del";
Debug.ShouldStop(8388608);
__ref.getField(false,"_retrytimer" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, __ref.runClassMethod (b4j.example.b4xmainpage.class, "_resolveretrydelay" /*RemoteObject*/ ,(Object)(_mode),(Object)(_delayms))));
 BA.debugLineNum = 1081;BA.debugLine="retryTimer.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_retrytimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1082;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendhistory(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SendHistory (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1195);
if (RapidSub.canDelegate("sendhistory")) { return __ref.runUserSub(false, "b4xmainpage","sendhistory", __ref, _item);}
ResumableSub_SendHistory rsub = new ResumableSub_SendHistory(null,__ref,_item);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SendHistory extends BA.ResumableSub {
public ResumableSub_SendHistory(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _item) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _item;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendHistory (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1195);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("item", _item);
 BA.debugLineNum = 1196;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2048);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1197;BA.debugLine="params.Initialize";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1198;BA.debugLine="params.Put(\"player\", playerCode)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1199;BA.debugLine="params.Put(\"device\", deviceId)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("device"))),(Object)((__ref.getField(true,"_deviceid" /*RemoteObject*/ ))));
 BA.debugLineNum = 1200;BA.debugLine="params.Put(\"type\", item.GetDefault(\"type\", \"\"))";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1201;BA.debugLine="params.Put(\"id\", item.GetDefault(\"id\", \"\"))";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1202;BA.debugLine="params.Put(\"date\", DateTime.Date(DateTime.Now))";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))));
 BA.debugLineNum = 1203;BA.debugLine="params.Put(\"time\", DateTime.Time(DateTime.Now))";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("time"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))));
 BA.debugLineNum = 1204;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(524288);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 1205;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1206;BA.debugLine="j.PostString(HISTORY_BASE_URL, BuildParams(params";
Debug.ShouldStop(2097152);
_j.runClassMethod (b4j.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_history_base_url" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_buildparams" /*RemoteObject*/ ,(Object)(_params))));
 BA.debugLineNum = 1207;BA.debugLine="j.GetRequest.Timeout = 5000";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 5000));
 BA.debugLineNum = 1208;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-fo";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded;charset=UTF-8")));
 BA.debugLineNum = 1209;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "sendhistory"), (_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1210;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1211;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1212;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setlabelstyle(RemoteObject __ref,RemoteObject _view,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetLabelStyle (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1746);
if (RapidSub.canDelegate("setlabelstyle")) { return __ref.runUserSub(false, "b4xmainpage","setlabelstyle", __ref, _view, _style);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("style", _style);
 BA.debugLineNum = 1746;BA.debugLine="Private Sub SetLabelStyle(view As B4XView, style A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1747;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1748;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
Debug.ShouldStop(524288);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mergenodestyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStyle")),(Object)((b4xmainpage.__c.getField(false,"Null")))))),(Object)(_style)))})));
 BA.debugLineNum = 1749;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmousetransparent(RemoteObject __ref,RemoteObject _view,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetMouseTransparent (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1761);
if (RapidSub.canDelegate("setmousetransparent")) { return __ref.runUserSub(false, "b4xmainpage","setmousetransparent", __ref, _view, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1761;BA.debugLine="Private Sub SetMouseTransparent(view As B4XView, v";
Debug.ShouldStop(1);
 BA.debugLineNum = 1762;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1763;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(value))";
Debug.ShouldStop(4);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)})));
 BA.debugLineNum = 1764;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpanestyle(RemoteObject __ref,RemoteObject _view,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetPaneStyle (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1741);
if (RapidSub.canDelegate("setpanestyle")) { return __ref.runUserSub(false, "b4xmainpage","setpanestyle", __ref, _view, _style);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("style", _style);
 BA.debugLineNum = 1741;BA.debugLine="Private Sub SetPaneStyle(view As B4XView, style As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1742;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1743;BA.debugLine="jo.RunMethod(\"setStyle\", Array(MergeNodeStyle(jo.";
Debug.ShouldStop(16384);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mergenodestyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStyle")),(Object)((b4xmainpage.__c.getField(false,"Null")))))),(Object)(_style)))})));
 BA.debugLineNum = 1744;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpickonbounds(RemoteObject __ref,RemoteObject _view,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetPickOnBounds (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1766);
if (RapidSub.canDelegate("setpickonbounds")) { return __ref.runUserSub(false, "b4xmainpage","setpickonbounds", __ref, _view, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("view", _view);
Debug.locals.put("value", _value);
 BA.debugLineNum = 1766;BA.debugLine="Private Sub SetPickOnBounds(view As B4XView, value";
Debug.ShouldStop(32);
 BA.debugLineNum = 1767;BA.debugLine="Dim jo As JavaObject = view";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1768;BA.debugLine="jo.RunMethod(\"setPickOnBounds\", Array(value))";
Debug.ShouldStop(128);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPickOnBounds")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)})));
 BA.debugLineNum = 1769;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("SetPlayIcon (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1369);
if (RapidSub.canDelegate("setplayicon")) { return __ref.runUserSub(false, "b4xmainpage","setplayicon", __ref);}
 BA.debugLineNum = 1369;BA.debugLine="Private Sub SetPlayIcon";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1370;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblplayicon" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xffd0ff71)))),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 1371;BA.debugLine="lblPlayIcon.Text = \"▶\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("▶"));
 BA.debugLineNum = 1372;BA.debugLine="lblPlayIcon.Font = xui.CreateDefaultBoldFont(play";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(__ref.getField(true,"_playiconbasesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 1373;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(268435456);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(int.class, ((int)0x00d0ff71))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1374;BA.debugLine="UpdatePlayButtonAppearance(False)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 1375;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("SetStatusText (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1514);
if (RapidSub.canDelegate("setstatustext")) { return __ref.runUserSub(false, "b4xmainpage","setstatustext", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1514;BA.debugLine="Private Sub SetStatusText(text As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1515;BA.debugLine="lblInfo.Text = text";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 1516;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SetStopIcon (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1377);
if (RapidSub.canDelegate("setstopicon")) { return __ref.runUserSub(false, "b4xmainpage","setstopicon", __ref);}
 BA.debugLineNum = 1377;BA.debugLine="Private Sub SetStopIcon";
Debug.ShouldStop(1);
 BA.debugLineNum = 1378;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblplayicon" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xffd0ff71)))),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 1379;BA.debugLine="lblPlayIcon.Text = \"■\"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("■"));
 BA.debugLineNum = 1380;BA.debugLine="lblPlayIcon.Font = xui.CreateDefaultBoldFont(stop";
Debug.ShouldStop(8);
__ref.getField(false,"_lblplayicon" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(__ref.getField(true,"_stopiconbasesize" /*RemoteObject*/ ))));
 BA.debugLineNum = 1381;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(16);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(int.class, ((int)0x66d0ff71))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1382;BA.debugLine="UpdatePlayButtonAppearance(False)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updateplaybuttonappearance" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 1383;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("SetStreamText (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1510);
if (RapidSub.canDelegate("setstreamtext")) { return __ref.runUserSub(false, "b4xmainpage","setstreamtext", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1510;BA.debugLine="Private Sub SetStreamText(text As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1511;BA.debugLine="lblStream.Text = text";
Debug.ShouldStop(64);
__ref.getField(false,"_lblstream" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 1512;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shiftqueueitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShiftQueueItem (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1574);
if (RapidSub.canDelegate("shiftqueueitem")) { return __ref.runUserSub(false, "b4xmainpage","shiftqueueitem", __ref);}
RemoteObject _item = RemoteObject.declareNull("Object");
 BA.debugLineNum = 1574;BA.debugLine="Private Sub ShiftQueueItem As Object";
Debug.ShouldStop(32);
 BA.debugLineNum = 1575;BA.debugLine="If playQueue.Size = 0 Then Return Null";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return b4xmainpage.__c.getField(false,"Null");};
 BA.debugLineNum = 1576;BA.debugLine="Dim item As Object = playQueue.Get(0)";
Debug.ShouldStop(128);
_item = __ref.getField(false,"_playqueue" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 1577;BA.debugLine="playQueue.RemoveAt(0)";
Debug.ShouldStop(256);
__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1578;BA.debugLine="Return item";
Debug.ShouldStop(512);
if (true) return _item;
 BA.debugLineNum = 1579;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shouldtriggerbreaknow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShouldTriggerBreakNow (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1141);
if (RapidSub.canDelegate("shouldtriggerbreaknow")) { return __ref.runUserSub(false, "b4xmainpage","shouldtriggerbreaknow", __ref);}
 BA.debugLineNum = 1141;BA.debugLine="Private Sub ShouldTriggerBreakNow As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1142;BA.debugLine="If scheduledBreakAt <= 0 Then Return False";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return b4xmainpage.__c.getField(true,"False");};
 BA.debugLineNum = 1143;BA.debugLine="Return LocalNowTimestamp >= scheduledBreakAt";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_localnowtimestamp" /*RemoteObject*/ ),__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ )));
 BA.debugLineNum = 1144;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showadmeta(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ShowAdMeta (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1506);
if (RapidSub.canDelegate("showadmeta")) { return __ref.runUserSub(false, "b4xmainpage","showadmeta", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 1506;BA.debugLine="Private Sub ShowAdMeta(item As Map)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1507;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 1508;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("ShowClaimPrompt (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1482);
if (RapidSub.canDelegate("showclaimprompt")) { return __ref.runUserSub(false, "b4xmainpage","showclaimprompt", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1482;BA.debugLine="Private Sub ShowClaimPrompt(text As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1483;BA.debugLine="HideContentBlocks";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 1484;BA.debugLine="isStarted = False";
Debug.ShouldStop(2048);
__ref.setField ("_isstarted" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1485;BA.debugLine="isStoppedByUser = True";
Debug.ShouldStop(4096);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1486;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 1487;BA.debugLine="SetStatusText(text)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 1488;BA.debugLine="confirmPane.Visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_confirmpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1489;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_layoutui" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_rootview" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_rootview" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 1490;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showinitialscreen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowInitialScreen (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("showinitialscreen")) { return __ref.runUserSub(false, "b4xmainpage","showinitialscreen", __ref);}
 BA.debugLineNum = 425;BA.debugLine="Private Sub ShowInitialScreen";
Debug.ShouldStop(256);
 BA.debugLineNum = 426;BA.debugLine="If playerCode = \"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playercode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 427;BA.debugLine="ShowSetupScreen(\"\")";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsetupscreen" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 429;BA.debugLine="ShowPlayerScreen(True)";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showplayerscreen" /*void*/ ,(Object)(b4xmainpage.__c.getField(true,"True")));
 };
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ShowMessage (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1477);
if (RapidSub.canDelegate("showmessage")) { return __ref.runUserSub(false, "b4xmainpage","showmessage", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1477;BA.debugLine="Private Sub ShowMessage(text As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1478;BA.debugLine="HideContentBlocks";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 1479;BA.debugLine="SetStatusText(text)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 1480;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showplayerscreen(RemoteObject __ref,RemoteObject _refreshinfo) throws Exception{
try {
		Debug.PushSubsStack("ShowPlayerScreen (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,457);
if (RapidSub.canDelegate("showplayerscreen")) { __ref.runUserSub(false, "b4xmainpage","showplayerscreen", __ref, _refreshinfo); return;}
ResumableSub_ShowPlayerScreen rsub = new ResumableSub_ShowPlayerScreen(null,__ref,_refreshinfo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowPlayerScreen extends BA.ResumableSub {
public ResumableSub_ShowPlayerScreen(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _refreshinfo) {
this.parent = parent;
this.__ref = __ref;
this._refreshinfo = _refreshinfo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _refreshinfo;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowPlayerScreen (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,457);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("refreshInfo", _refreshinfo);
 BA.debugLineNum = 458;BA.debugLine="appScreenMode = \"player\"";
Debug.ShouldStop(512);
__ref.setField ("_appscreenmode" /*RemoteObject*/ ,BA.ObjectToString("player"));
 BA.debugLineNum = 459;BA.debugLine="ConfigurePlayerHeader";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_configureplayerheader" /*RemoteObject*/ );
 BA.debugLineNum = 460;BA.debugLine="UpdateVisibleMode";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatevisiblemode" /*RemoteObject*/ );
 BA.debugLineNum = 461;BA.debugLine="If isStarted = False Then ApplyStoppedState";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_applystoppedstate" /*RemoteObject*/ );
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 462;BA.debugLine="If refreshInfo = False Then Return";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_refreshinfo,parent.__c.getField(true,"False"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 463;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_renderplayerhead" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_playercode" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 464;BA.debugLine="Wait For (InitPlayerInfo) Complete (unused As Boo";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "showplayerscreen"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_initplayerinfo" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _showsettingsscreen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowSettingsScreen (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,447);
if (RapidSub.canDelegate("showsettingsscreen")) { return __ref.runUserSub(false, "b4xmainpage","showsettingsscreen", __ref);}
 BA.debugLineNum = 447;BA.debugLine="Private Sub ShowSettingsScreen";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 448;BA.debugLine="If playerCode = \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playercode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 449;BA.debugLine="ShowSetupScreen(\"\")";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsetupscreen" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 450;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 452;BA.debugLine="appScreenMode = \"settings\"";
Debug.ShouldStop(8);
__ref.setField ("_appscreenmode" /*RemoteObject*/ ,BA.ObjectToString("settings"));
 BA.debugLineNum = 453;BA.debugLine="ConfigureSetupScreen(\"settings\", \"\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_configuresetupscreen" /*RemoteObject*/ ,(Object)(BA.ObjectToString("settings")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 454;BA.debugLine="UpdateVisibleMode";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatevisiblemode" /*RemoteObject*/ );
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showsetupscreen(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ShowSetupScreen (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("showsetupscreen")) { return __ref.runUserSub(false, "b4xmainpage","showsetupscreen", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 433;BA.debugLine="Private Sub ShowSetupScreen(text As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 434;BA.debugLine="appScreenMode = \"setup\"";
Debug.ShouldStop(131072);
__ref.setField ("_appscreenmode" /*RemoteObject*/ ,BA.ObjectToString("setup"));
 BA.debugLineNum = 435;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 436;BA.debugLine="HidePin";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 437;BA.debugLine="isStarted = False";
Debug.ShouldStop(1048576);
__ref.setField ("_isstarted" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 438;BA.debugLine="isStoppedByUser = True";
Debug.ShouldStop(2097152);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 439;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 440;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 441;BA.debugLine="lblHeader.Text = \"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 442;BA.debugLine="ConfigureSetupScreen(\"setup\", text)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_configuresetupscreen" /*RemoteObject*/ ,(Object)(BA.ObjectToString("setup")),(Object)(_text));
 BA.debugLineNum = 443;BA.debugLine="UpdateVisibleMode";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatevisiblemode" /*RemoteObject*/ );
 BA.debugLineNum = 444;BA.debugLine="If txtPlayerCode.IsInitialized Then txtPlayerCode";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");};
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ShowStream (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1473);
if (RapidSub.canDelegate("showstream")) { return __ref.runUserSub(false, "b4xmainpage","showstream", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1473;BA.debugLine="Private Sub ShowStream(text As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1474;BA.debugLine="SetStreamText(text)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstreamtext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 1475;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ShowTrackMeta (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1498);
if (RapidSub.canDelegate("showtrackmeta")) { return __ref.runUserSub(false, "b4xmainpage","showtrackmeta", __ref, _item);}
RemoteObject _parts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("item", _item);
 BA.debugLineNum = 1498;BA.debugLine="Private Sub ShowTrackMeta(item As Map)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1499;BA.debugLine="Dim parts As List";
Debug.ShouldStop(67108864);
_parts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("parts", _parts);
 BA.debugLineNum = 1500;BA.debugLine="parts.Initialize";
Debug.ShouldStop(134217728);
_parts.runVoidMethod ("Initialize");
 BA.debugLineNum = 1501;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("set"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_parts.runVoidMethod ("Add",(Object)(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set"))))));};
 BA.debugLineNum = 1502;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("code"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
_parts.runVoidMethod ("Add",(Object)(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code"))))));};
 BA.debugLineNum = 1503;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_joinlist" /*RemoteObject*/ ,(Object)(_parts),(Object)(RemoteObject.createImmutable(" • ")))));
 BA.debugLineNum = 1504;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startfirsttrack(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("StartFirstTrack (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,783);
if (RapidSub.canDelegate("startfirsttrack")) { return __ref.runUserSub(false, "b4xmainpage","startfirsttrack", __ref, _mode);}
ResumableSub_StartFirstTrack rsub = new ResumableSub_StartFirstTrack(null,__ref,_mode);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartFirstTrack extends BA.ResumableSub {
public ResumableSub_StartFirstTrack(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _mode) {
this.parent = parent;
this.__ref = __ref;
this._mode = _mode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _mode;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartFirstTrack (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,783);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 784;BA.debugLine="nextStartMode = mode";
Debug.ShouldStop(32768);
__ref.setField ("_nextstartmode" /*RemoteObject*/ ,_mode);
 BA.debugLineNum = 785;BA.debugLine="playQueue.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 786;BA.debugLine="prefetchDone = False";
Debug.ShouldStop(131072);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 787;BA.debugLine="isCrossfadeTriggered = False";
Debug.ShouldStop(262144);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 788;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "startfirsttrack"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_loadnextandplay" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 789;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 790;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _startplaybackwithaudiokey(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item,RemoteObject _fadeinms) throws Exception{
try {
		Debug.PushSubsStack("StartPlaybackWithAudioKey (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,730);
if (RapidSub.canDelegate("startplaybackwithaudiokey")) { return __ref.runUserSub(false, "b4xmainpage","startplaybackwithaudiokey", __ref, _audiokey, _item, _fadeinms);}
ResumableSub_StartPlaybackWithAudioKey rsub = new ResumableSub_StartPlaybackWithAudioKey(null,__ref,_audiokey,_item,_fadeinms);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartPlaybackWithAudioKey extends BA.ResumableSub {
public ResumableSub_StartPlaybackWithAudioKey(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item,RemoteObject _fadeinms) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this._item = _item;
this._fadeinms = _fadeinms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _audiokey;
RemoteObject _item;
RemoteObject _fadeinms;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartPlaybackWithAudioKey (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,730);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
Debug.locals.put("fadeInMs", _fadeinms);
 BA.debugLineNum = 731;BA.debugLine="ClearPendingPlayState";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearpendingplaystate" /*RemoteObject*/ );
 BA.debugLineNum = 732;BA.debugLine="pendingPlayAudioKey = audioKey";
Debug.ShouldStop(134217728);
__ref.setField ("_pendingplayaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 733;BA.debugLine="pendingPlayItem = item";
Debug.ShouldStop(268435456);
__ref.setField ("_pendingplayitem" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 734;BA.debugLine="pendingPlayFadeInMs = fadeInMs";
Debug.ShouldStop(536870912);
__ref.setField ("_pendingplayfadeinms" /*RemoteObject*/ ,_fadeinms);
 BA.debugLineNum = 735;BA.debugLine="GetAudioByKey(audioKey).LoadUrl(MediaUrl(item), C";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(_audiokey)).runClassMethod (b4j.example.audioplayer.class, "_loadurl" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_mediaurl" /*RemoteObject*/ ,(Object)(_item))),(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_currentvolume" /*RemoteObject*/ ,(Object)(_item))));
 BA.debugLineNum = 736;BA.debugLine="Wait For PlaybackStartDone(result As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","playbackstartdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "startplaybackwithaudiokey"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 737;BA.debugLine="Return result.GetDefault(\"Success\", False)";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))));return;};
 BA.debugLineNum = 738;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _stopformissingdata(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("StopForMissingData (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1046);
if (RapidSub.canDelegate("stopformissingdata")) { return __ref.runUserSub(false, "b4xmainpage","stopformissingdata", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1046;BA.debugLine="Private Sub StopForMissingData(text As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1047;BA.debugLine="ClearPlaybackState";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 1048;BA.debugLine="HidePin";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 1049;BA.debugLine="isStarted = False";
Debug.ShouldStop(16777216);
__ref.setField ("_isstarted" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 1050;BA.debugLine="isStoppedByUser = True";
Debug.ShouldStop(33554432);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 1051;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 1052;BA.debugLine="ShowMessage(text)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showmessage" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 1053;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopplayer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopPlayer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1219);
if (RapidSub.canDelegate("stopplayer")) { return __ref.runUserSub(false, "b4xmainpage","stopplayer", __ref);}
ResumableSub_StopPlayer rsub = new ResumableSub_StopPlayer(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StopPlayer extends BA.ResumableSub {
public ResumableSub_StopPlayer(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StopPlayer (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1219);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1220;BA.debugLine="If isStopping Then Return False";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_isstopping" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1221;BA.debugLine="isStopping = True";
Debug.ShouldStop(16);
__ref.setField ("_isstopping" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1222;BA.debugLine="isStarted = False";
Debug.ShouldStop(32);
__ref.setField ("_isstarted" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1223;BA.debugLine="isStoppedByUser = True";
Debug.ShouldStop(64);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1224;BA.debugLine="ClearRetryTimer";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 1225;BA.debugLine="ClearExactBreakState";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearexactbreakstate" /*RemoteObject*/ );
 BA.debugLineNum = 1226;BA.debugLine="ClearHistoryLogTimer";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_clearhistorylogtimer" /*RemoteObject*/ );
 BA.debugLineNum = 1227;BA.debugLine="ResetRetryDelay";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_resetretrydelay" /*RemoteObject*/ );
 BA.debugLineNum = 1228;BA.debugLine="If activeAudioKey <> \"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1229;BA.debugLine="If currentMediaType = \"track\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_currentmediatype" /*RemoteObject*/ ),BA.ObjectToString("track"))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 1230;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))).runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_stop_fade_ms" /*RemoteObject*/ )));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1232;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(0)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_activeaudiokey" /*RemoteObject*/ ))).runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 1235;BA.debugLine="If preparedAudioKey <> \"\" Then GetAudioByKey(prep";
Debug.ShouldStop(262144);

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_getaudiobykey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ))).runClassMethod (b4j.example.audioplayer.class, "_stop" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
if (true) break;

case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 1236;BA.debugLine="currentTrackUrl = \"\"";
Debug.ShouldStop(524288);
__ref.setField ("_currenttrackurl" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1237;BA.debugLine="currentMediaType = \"\"";
Debug.ShouldStop(1048576);
__ref.setField ("_currentmediatype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1238;BA.debugLine="activeAudioKey = \"\"";
Debug.ShouldStop(2097152);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1239;BA.debugLine="preparedAudioKey = \"\"";
Debug.ShouldStop(4194304);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1240;BA.debugLine="activeItem.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_activeitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1241;BA.debugLine="preparedItem.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1242;BA.debugLine="playlistIndex = -1";
Debug.ShouldStop(33554432);
__ref.setField ("_playlistindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 1243;BA.debugLine="playQueue.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_playqueue" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1244;BA.debugLine="prefetchDone = False";
Debug.ShouldStop(134217728);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1245;BA.debugLine="isCrossfadeTriggered = False";
Debug.ShouldStop(268435456);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1246;BA.debugLine="SetStatusText(\"\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstatustext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1247;BA.debugLine="HidePin";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 1248;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 1249;BA.debugLine="ApplyStoppedState";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_applystoppedstate" /*RemoteObject*/ );
 BA.debugLineNum = 1250;BA.debugLine="isStopping = False";
Debug.ShouldStop(2);
__ref.setField ("_isstopping" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1251;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1252;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _submitclaim(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SubmitClaim (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,879);
if (RapidSub.canDelegate("submitclaim")) { return __ref.runUserSub(false, "b4xmainpage","submitclaim", __ref);}
ResumableSub_SubmitClaim rsub = new ResumableSub_SubmitClaim(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SubmitClaim extends BA.ResumableSub {
public ResumableSub_SubmitClaim(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultdata = RemoteObject.declareNull("Object");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SubmitClaim (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,879);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 880;BA.debugLine="btnConfirmYes.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 881;BA.debugLine="btnConfirmNo.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 882;BA.debugLine="Wait For (FetchJsonWithTimeout(CLAIM_BASE_URL & \"";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "submitclaim"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_fetchjsonwithtimeout" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_claim_base_url" /*RemoteObject*/ ),RemoteObject.createImmutable("?"),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_buildparams" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_createclaimparams" /*RemoteObject*/ ))))),(Object)(__ref.getField(true,"_fetch_timeout_ms" /*RemoteObject*/ ))));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 883;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 12;
if (BA.ObjectToBoolean(_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 884;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
Debug.ShouldStop(524288);
_resultdata = _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))));Debug.locals.put("resultData", _resultdata);Debug.locals.put("resultData", _resultdata);
 BA.debugLineNum = 885;BA.debugLine="If resultData Is Map Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("i",_resultdata, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 886;BA.debugLine="Dim data As Map = resultData";
Debug.ShouldStop(2097152);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _resultdata);Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 887;BA.debugLine="If data.GetDefault(\"ok\", False) = True Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"True")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 888;BA.debugLine="isStarted = True";
Debug.ShouldStop(8388608);
__ref.setField ("_isstarted" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 889;BA.debugLine="isStoppedByUser = False";
Debug.ShouldStop(16777216);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 890;BA.debugLine="SetStopIcon";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstopicon" /*RemoteObject*/ );
 BA.debugLineNum = 891;BA.debugLine="HideContentBlocks";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 892;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "submitclaim"), __ref.runClassMethod (b4j.example.b4xmainpage.class, "_startfirsttrack" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("manual"))));
this.state = 14;
return;
case 14:
//C
this.state = 10;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 893;BA.debugLine="btnConfirmYes.Enabled = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 894;BA.debugLine="btnConfirmNo.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 895;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 899;BA.debugLine="ShowClaimPrompt(ResolveErrorMessage(result, Messa";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showclaimprompt" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_resolveerrormessage" /*RemoteObject*/ ,(Object)(_result),(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("device_busy")))))));
 BA.debugLineNum = 900;BA.debugLine="btnConfirmYes.Enabled = True";
Debug.ShouldStop(8);
__ref.getField(false,"_btnconfirmyes" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 901;BA.debugLine="btnConfirmNo.Enabled = True";
Debug.ShouldStop(16);
__ref.getField(false,"_btnconfirmno" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 902;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 903;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _submitplayercode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SubmitPlayerCode (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,596);
if (RapidSub.canDelegate("submitplayercode")) { return __ref.runUserSub(false, "b4xmainpage","submitplayercode", __ref);}
ResumableSub_SubmitPlayerCode rsub = new ResumableSub_SubmitPlayerCode(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SubmitPlayerCode extends BA.ResumableSub {
public ResumableSub_SubmitPlayerCode(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _nextplayer = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SubmitPlayerCode (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,596);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 597;BA.debugLine="Dim nextPlayer As String = NormalizePlayerCode(tx";
Debug.ShouldStop(1048576);
_nextplayer = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_normalizeplayercode" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("nextPlayer", _nextplayer);Debug.locals.put("nextPlayer", _nextplayer);
 BA.debugLineNum = 598;BA.debugLine="If nextPlayer = \"\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_nextplayer,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 599;BA.debugLine="ShowSetupScreen(MessageValue(\"setup_invalid\"))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showsetupscreen" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("setup_invalid")))));
 BA.debugLineNum = 600;BA.debugLine="txtPlayerCode.RequestFocus";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 601;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 603;BA.debugLine="playerCode = nextPlayer";
Debug.ShouldStop(67108864);
__ref.setField ("_playercode" /*RemoteObject*/ ,_nextplayer);
 BA.debugLineNum = 604;BA.debugLine="SaveValue(\"player_code\", playerCode)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_savevalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString("player_code")),(Object)((__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 605;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setText",__ref.runClassMethod (b4j.example.b4xmainpage.class, "_formatplayercodefordisplay" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_playercode" /*RemoteObject*/ ))));
 BA.debugLineNum = 606;BA.debugLine="ShowPlayerScreen(True)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showplayerscreen" /*void*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 607;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 608;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _syncexactbreakstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SyncExactBreakState (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1112);
if (RapidSub.canDelegate("syncexactbreakstate")) { return __ref.runUserSub(false, "b4xmainpage","syncexactbreakstate", __ref);}
 BA.debugLineNum = 1112;BA.debugLine="Private Sub SyncExactBreakState";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1113;BA.debugLine="ResolveScheduledBreakAt";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_resolvescheduledbreakat" /*RemoteObject*/ );
 BA.debugLineNum = 1114;BA.debugLine="ScheduleBreakWatch";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_schedulebreakwatch" /*RemoteObject*/ );
 BA.debugLineNum = 1115;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timezoneoffsetminutes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimezoneOffsetMinutes (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1687);
if (RapidSub.canDelegate("timezoneoffsetminutes")) { return __ref.runUserSub(false, "b4xmainpage","timezoneoffsetminutes", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _nowoffset = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _zoneoffset = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _totalseconds = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1687;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1688;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(8388608);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1689;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
Debug.ShouldStop(16777216);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.OffsetDateTime")));
 BA.debugLineNum = 1690;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
Debug.ShouldStop(33554432);
_nowoffset = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_nowoffset = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("now")),(Object)((b4xmainpage.__c.getField(false,"Null")))));Debug.locals.put("nowOffset", _nowoffset);Debug.locals.put("nowOffset", _nowoffset);
 BA.debugLineNum = 1691;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
Debug.ShouldStop(67108864);
_zoneoffset = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_zoneoffset = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _nowoffset.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getOffset")),(Object)((b4xmainpage.__c.getField(false,"Null")))));Debug.locals.put("zoneOffset", _zoneoffset);Debug.locals.put("zoneOffset", _zoneoffset);
 BA.debugLineNum = 1692;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
Debug.ShouldStop(134217728);
_totalseconds = BA.numberCast(int.class, _zoneoffset.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTotalSeconds")),(Object)((b4xmainpage.__c.getField(false,"Null")))));Debug.locals.put("totalSeconds", _totalseconds);Debug.locals.put("totalSeconds", _totalseconds);
 BA.debugLineNum = 1693;BA.debugLine="Return -Round(totalSeconds / 60)";
Debug.ShouldStop(268435456);
if (true) return BA.numberCast(int.class, -(double) (0 + b4xmainpage.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_totalseconds,RemoteObject.createImmutable(60)}, "/",0, 0))).<Long>get().longValue()));
 BA.debugLineNum = 1694;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtplayercode_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("txtPlayerCode_Action (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("txtplayercode_action")) { return __ref.runUserSub(false, "b4xmainpage","txtplayercode_action", __ref);}
 BA.debugLineNum = 586;BA.debugLine="Private Sub txtPlayerCode_Action";
Debug.ShouldStop(512);
 BA.debugLineNum = 587;BA.debugLine="If appScreenMode = \"settings\" Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("settings"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 588;BA.debugLine="BtnSetupSubmit_Click";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btnsetupsubmit_click" /*void*/ );
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtplayercode_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtPlayerCode_FocusChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("txtplayercode_focuschanged")) { return __ref.runUserSub(false, "b4xmainpage","txtplayercode_focuschanged", __ref, _hasfocus);}
Debug.locals.put("hasFocus", _hasfocus);
 BA.debugLineNum = 591;BA.debugLine="Private Sub txtPlayerCode_FocusChanged (hasFocus A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 592;BA.debugLine="isCodeInputFocused = hasFocus";
Debug.ShouldStop(32768);
__ref.setField ("_iscodeinputfocused" /*RemoteObject*/ ,_hasfocus);
 BA.debugLineNum = 593;BA.debugLine="UpdateCodeInputAppearance(hasFocus)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatecodeinputappearance" /*RemoteObject*/ ,(Object)(_hasfocus));
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtplayercode_textchanged(RemoteObject __ref,RemoteObject _oldvalue,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("txtPlayerCode_TextChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("txtplayercode_textchanged")) { return __ref.runUserSub(false, "b4xmainpage","txtplayercode_textchanged", __ref, _oldvalue, _newvalue);}
RemoteObject _filtered = RemoteObject.createImmutable("");
Debug.locals.put("oldValue", _oldvalue);
Debug.locals.put("newValue", _newvalue);
 BA.debugLineNum = 578;BA.debugLine="Private Sub txtPlayerCode_TextChanged (oldValue As";
Debug.ShouldStop(2);
 BA.debugLineNum = 579;BA.debugLine="If appScreenMode = \"settings\" Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("settings"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 580;BA.debugLine="Dim filtered As String = FilterPlayerCode(newValu";
Debug.ShouldStop(8);
_filtered = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_filterplayercode" /*RemoteObject*/ ,(Object)(_newvalue));Debug.locals.put("filtered", _filtered);Debug.locals.put("filtered", _filtered);
 BA.debugLineNum = 581;BA.debugLine="If filtered <> newValue Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_filtered,_newvalue)) { 
 BA.debugLineNum = 582;BA.debugLine="txtPlayerCode.Text = filtered";
Debug.ShouldStop(32);
__ref.getField(false,"_txtplayercode" /*RemoteObject*/ ).runMethod(true,"setText",_filtered);
 };
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("UpdateCodeInputAppearance (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1433);
if (RapidSub.canDelegate("updatecodeinputappearance")) { return __ref.runUserSub(false, "b4xmainpage","updatecodeinputappearance", __ref, _isfocused);}
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _orbitbordercolor = RemoteObject.createImmutable(0);
Debug.locals.put("isFocused", _isfocused);
 BA.debugLineNum = 1433;BA.debugLine="Private Sub UpdateCodeInputAppearance(isFocused As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1434;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(33554432);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 1435;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(67108864);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1436;BA.debugLine="Dim orbitBorderColor As Int";
Debug.ShouldStop(134217728);
_orbitbordercolor = RemoteObject.createImmutable(0);Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 BA.debugLineNum = 1437;BA.debugLine="If isFocused Then";
Debug.ShouldStop(268435456);
if (_isfocused.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1438;BA.debugLine="fillColor = 0x10FFFFFF";
Debug.ShouldStop(536870912);
_fillcolor = BA.numberCast(int.class, ((int)0x10ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 1439;BA.debugLine="borderColor = 0x77FFFFFF";
Debug.ShouldStop(1073741824);
_bordercolor = BA.numberCast(int.class, ((int)0x77ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1440;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
Debug.ShouldStop(-2147483648);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x88ffffff));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 }else {
 BA.debugLineNum = 1442;BA.debugLine="fillColor = 0x07FFFFFF";
Debug.ShouldStop(2);
_fillcolor = BA.numberCast(int.class, ((int)0x07ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 1443;BA.debugLine="borderColor = 0x55FFFFFF";
Debug.ShouldStop(4);
_bordercolor = BA.numberCast(int.class, ((int)0x55ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1444;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
Debug.ShouldStop(8);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x66ffffff));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 };
 BA.debugLineNum = 1446;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
Debug.ShouldStop(32);
__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_fillcolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1447;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
Debug.ShouldStop(64);
__ref.getField(false,"_accesscorepane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(_orbitbordercolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1448;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
Debug.ShouldStop(128);
__ref.getField(false,"_accessinputpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1449;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscirclepane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 1450;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accesscorepane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 1451;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_accessinputpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;")));
 BA.debugLineNum = 1452;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtplayercodeview" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-background-color: transparent; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xfff2f7fb)))),RemoteObject.createImmutable("; -fx-prompt-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0x66ffffff)))),RemoteObject.createImmutable("; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((int)0xfff2f7fb)))),RemoteObject.createImmutable("; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "),__ref.getField(true,"_codefontsize" /*RemoteObject*/ ),RemoteObject.createImmutable("px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;"))));
 BA.debugLineNum = 1453;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("UpdateHeaderActionAppearance (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1415);
if (RapidSub.canDelegate("updateheaderactionappearance")) { return __ref.runUserSub(false, "b4xmainpage","updateheaderactionappearance", __ref, _ishovered);}
RemoteObject _fillcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("isHovered", _ishovered);
 BA.debugLineNum = 1415;BA.debugLine="Private Sub UpdateHeaderActionAppearance(isHovered";
Debug.ShouldStop(64);
 BA.debugLineNum = 1416;BA.debugLine="Dim fillColor As Int";
Debug.ShouldStop(128);
_fillcolor = RemoteObject.createImmutable(0);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 1417;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(256);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1418;BA.debugLine="Dim textColor As Int";
Debug.ShouldStop(512);
_textcolor = RemoteObject.createImmutable(0);Debug.locals.put("textColor", _textcolor);
 BA.debugLineNum = 1419;BA.debugLine="If isHovered Then";
Debug.ShouldStop(1024);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1420;BA.debugLine="fillColor = 0x14FFFFFF";
Debug.ShouldStop(2048);
_fillcolor = BA.numberCast(int.class, ((int)0x14ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 1421;BA.debugLine="borderColor = 0x30FFFFFF";
Debug.ShouldStop(4096);
_bordercolor = BA.numberCast(int.class, ((int)0x30ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1422;BA.debugLine="textColor = 0xFFDDE6EF";
Debug.ShouldStop(8192);
_textcolor = BA.numberCast(int.class, ((int)0xffdde6ef));Debug.locals.put("textColor", _textcolor);
 }else {
 BA.debugLineNum = 1424;BA.debugLine="fillColor = 0x08FFFFFF";
Debug.ShouldStop(32768);
_fillcolor = BA.numberCast(int.class, ((int)0x08ffffff));Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 1425;BA.debugLine="borderColor = 0x18FFFFFF";
Debug.ShouldStop(65536);
_bordercolor = BA.numberCast(int.class, ((int)0x18ffffff));Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1426;BA.debugLine="textColor = 0xFFB9C0C9";
Debug.ShouldStop(131072);
_textcolor = BA.numberCast(int.class, ((int)0xffb9c0c9));Debug.locals.put("textColor", _textcolor);
 };
 BA.debugLineNum = 1428;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
Debug.ShouldStop(524288);
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_fillcolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1429;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setpanestyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_headeractionpane" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;")));
 BA.debugLineNum = 1430;BA.debugLine="SetLabelStyle(lblHeaderAction, \"-fx-alignment: ce";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setlabelstyle" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ )),(Object)(RemoteObject.concat(RemoteObject.createImmutable("-fx-alignment: center; -fx-text-fill: "),__ref.runClassMethod (b4j.example.b4xmainpage.class, "_colortocss" /*RemoteObject*/ ,(Object)(_textcolor)),RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 1431;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateplaybackmeta(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("UpdatePlaybackMeta (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,701);
if (RapidSub.canDelegate("updateplaybackmeta")) { return __ref.runUserSub(false, "b4xmainpage","updateplaybackmeta", __ref, _item);}
RemoteObject _itemtype = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
 BA.debugLineNum = 701;BA.debugLine="Private Sub UpdatePlaybackMeta(item As Map)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 702;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
Debug.ShouldStop(536870912);
_itemtype = BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 703;BA.debugLine="If itemType = \"ad\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_itemtype,BA.ObjectToString("ad"))) { 
 BA.debugLineNum = 704;BA.debugLine="ShowAdMeta(item)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showadmeta" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 705;BA.debugLine="ShowStream(MessageValue(\"ad_label\"))";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showstream" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ad_label")))));
 }else {
 BA.debugLineNum = 707;BA.debugLine="ShowTrackMeta(item)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showtrackmeta" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 708;BA.debugLine="ShowStream(item.GetDefault(\"stream\", \"\"))";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showstream" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 709;BA.debugLine="SyncExactBreakState";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_syncexactbreakstate" /*RemoteObject*/ );
 };
 BA.debugLineNum = 711;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateplaybuttonappearance(RemoteObject __ref,RemoteObject _ishovered) throws Exception{
try {
		Debug.PushSubsStack("UpdatePlayButtonAppearance (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1385);
if (RapidSub.canDelegate("updateplaybuttonappearance")) { return __ref.runUserSub(false, "b4xmainpage","updateplaybuttonappearance", __ref, _ishovered);}
RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _orbitbordercolor = RemoteObject.createImmutable(0);
Debug.locals.put("isHovered", _ishovered);
 BA.debugLineNum = 1385;BA.debugLine="Private Sub UpdatePlayButtonAppearance(isHovered A";
Debug.ShouldStop(256);
 BA.debugLineNum = 1386;BA.debugLine="Dim backgroundColor As Int";
Debug.ShouldStop(512);
_backgroundcolor = RemoteObject.createImmutable(0);Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 1387;BA.debugLine="Dim borderColor As Int";
Debug.ShouldStop(1024);
_bordercolor = RemoteObject.createImmutable(0);Debug.locals.put("borderColor", _bordercolor);
 BA.debugLineNum = 1388;BA.debugLine="Dim orbitBorderColor As Int";
Debug.ShouldStop(2048);
_orbitbordercolor = RemoteObject.createImmutable(0);Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 BA.debugLineNum = 1389;BA.debugLine="If isStarted Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_isstarted" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1390;BA.debugLine="If isHovered Then";
Debug.ShouldStop(8192);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1391;BA.debugLine="backgroundColor = 0x12FFFFFF";
Debug.ShouldStop(16384);
_backgroundcolor = BA.numberCast(int.class, ((int)0x12ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 1392;BA.debugLine="borderColor = 0x77FFFFFF";
Debug.ShouldStop(32768);
_bordercolor = BA.numberCast(int.class, ((int)0x77ffffff));Debug.locals.put("borderColor", _bordercolor);
 }else {
 BA.debugLineNum = 1394;BA.debugLine="backgroundColor = 0x08FFFFFF";
Debug.ShouldStop(131072);
_backgroundcolor = BA.numberCast(int.class, ((int)0x08ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 1395;BA.debugLine="borderColor = 0x55FFFFFF";
Debug.ShouldStop(262144);
_bordercolor = BA.numberCast(int.class, ((int)0x55ffffff));Debug.locals.put("borderColor", _bordercolor);
 };
 }else {
 BA.debugLineNum = 1398;BA.debugLine="If isHovered Then";
Debug.ShouldStop(2097152);
if (_ishovered.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1399;BA.debugLine="backgroundColor = 0x12FFFFFF";
Debug.ShouldStop(4194304);
_backgroundcolor = BA.numberCast(int.class, ((int)0x12ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 1400;BA.debugLine="borderColor = 0x55D0FF71";
Debug.ShouldStop(8388608);
_bordercolor = BA.numberCast(int.class, ((int)0x55d0ff71));Debug.locals.put("borderColor", _bordercolor);
 }else {
 BA.debugLineNum = 1402;BA.debugLine="backgroundColor = 0x07FFFFFF";
Debug.ShouldStop(33554432);
_backgroundcolor = BA.numberCast(int.class, ((int)0x07ffffff));Debug.locals.put("backgroundColor", _backgroundcolor);
 BA.debugLineNum = 1403;BA.debugLine="borderColor = 0x40FFFFFF";
Debug.ShouldStop(67108864);
_bordercolor = BA.numberCast(int.class, ((int)0x40ffffff));Debug.locals.put("borderColor", _bordercolor);
 };
 };
 BA.debugLineNum = 1406;BA.debugLine="If isStarted Or isHovered Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_isstarted" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",_ishovered)) { 
 BA.debugLineNum = 1407;BA.debugLine="orbitBorderColor = 0x66D0FF71";
Debug.ShouldStop(1073741824);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x66d0ff71));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 }else {
 BA.debugLineNum = 1409;BA.debugLine="orbitBorderColor = 0x22D0FF71";
Debug.ShouldStop(1);
_orbitbordercolor = BA.numberCast(int.class, ((int)0x22d0ff71));Debug.locals.put("orbitBorderColor", _orbitbordercolor);
 };
 BA.debugLineNum = 1411;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
Debug.ShouldStop(4);
__ref.getField(false,"_playbuttonpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(_backgroundcolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))),(Object)(_bordercolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1412;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
Debug.ShouldStop(8);
__ref.getField(false,"_orbitpane" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(_orbitbordercolor),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 999))))));
 BA.debugLineNum = 1413;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateresponsivestyles(RemoteObject __ref,RemoteObject _availablewidth) throws Exception{
try {
		Debug.PushSubsStack("UpdateResponsiveStyles (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("updateresponsivestyles")) { return __ref.runUserSub(false, "b4xmainpage","updateresponsivestyles", __ref, _availablewidth);}
RemoteObject _small = RemoteObject.createImmutable(false);
RemoteObject _medium = RemoteObject.createImmutable(false);
RemoteObject _streamfontsize = RemoteObject.createImmutable(0f);
RemoteObject _infofontsize = RemoteObject.createImmutable(0f);
RemoteObject _playfontsize = RemoteObject.createImmutable(0f);
RemoteObject _stopfontsize = RemoteObject.createImmutable(0f);
RemoteObject _headeractionsize = RemoteObject.createImmutable(0f);
RemoteObject _codesize = RemoteObject.createImmutable(0f);
RemoteObject _cardradius = RemoteObject.createImmutable(0);
Debug.locals.put("availableWidth", _availablewidth);
 BA.debugLineNum = 370;BA.debugLine="Private Sub UpdateResponsiveStyles(availableWidth";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="Dim small As Boolean = availableWidth <= 420dip";
Debug.ShouldStop(262144);
_small = BA.ObjectToBoolean(RemoteObject.solveBoolean("k",_availablewidth,BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 420))))));Debug.locals.put("small", _small);Debug.locals.put("small", _small);
 BA.debugLineNum = 372;BA.debugLine="Dim medium As Boolean = availableWidth <= 720dip";
Debug.ShouldStop(524288);
_medium = BA.ObjectToBoolean(RemoteObject.solveBoolean("k",_availablewidth,BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 720))))));Debug.locals.put("medium", _medium);Debug.locals.put("medium", _medium);
 BA.debugLineNum = 373;BA.debugLine="Dim streamFontSize As Float";
Debug.ShouldStop(1048576);
_streamfontsize = RemoteObject.createImmutable(0f);Debug.locals.put("streamFontSize", _streamfontsize);
 BA.debugLineNum = 374;BA.debugLine="Dim infoFontSize As Float";
Debug.ShouldStop(2097152);
_infofontsize = RemoteObject.createImmutable(0f);Debug.locals.put("infoFontSize", _infofontsize);
 BA.debugLineNum = 375;BA.debugLine="Dim playFontSize As Float";
Debug.ShouldStop(4194304);
_playfontsize = RemoteObject.createImmutable(0f);Debug.locals.put("playFontSize", _playfontsize);
 BA.debugLineNum = 376;BA.debugLine="Dim stopFontSize As Float";
Debug.ShouldStop(8388608);
_stopfontsize = RemoteObject.createImmutable(0f);Debug.locals.put("stopFontSize", _stopfontsize);
 BA.debugLineNum = 377;BA.debugLine="Dim headerActionSize As Float";
Debug.ShouldStop(16777216);
_headeractionsize = RemoteObject.createImmutable(0f);Debug.locals.put("headerActionSize", _headeractionsize);
 BA.debugLineNum = 378;BA.debugLine="Dim codeSize As Float";
Debug.ShouldStop(33554432);
_codesize = RemoteObject.createImmutable(0f);Debug.locals.put("codeSize", _codesize);
 BA.debugLineNum = 379;BA.debugLine="Dim cardRadius As Int";
Debug.ShouldStop(67108864);
_cardradius = RemoteObject.createImmutable(0);Debug.locals.put("cardRadius", _cardradius);
 BA.debugLineNum = 381;BA.debugLine="If small Then";
Debug.ShouldStop(268435456);
if (_small.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 382;BA.debugLine="streamFontSize = 28";
Debug.ShouldStop(536870912);
_streamfontsize = BA.numberCast(float.class, 28);Debug.locals.put("streamFontSize", _streamfontsize);
 BA.debugLineNum = 383;BA.debugLine="infoFontSize = 16";
Debug.ShouldStop(1073741824);
_infofontsize = BA.numberCast(float.class, 16);Debug.locals.put("infoFontSize", _infofontsize);
 BA.debugLineNum = 384;BA.debugLine="playFontSize = 60";
Debug.ShouldStop(-2147483648);
_playfontsize = BA.numberCast(float.class, 60);Debug.locals.put("playFontSize", _playfontsize);
 BA.debugLineNum = 385;BA.debugLine="stopFontSize = 44";
Debug.ShouldStop(1);
_stopfontsize = BA.numberCast(float.class, 44);Debug.locals.put("stopFontSize", _stopfontsize);
 BA.debugLineNum = 386;BA.debugLine="headerActionSize = 24";
Debug.ShouldStop(2);
_headeractionsize = BA.numberCast(float.class, 24);Debug.locals.put("headerActionSize", _headeractionsize);
 BA.debugLineNum = 387;BA.debugLine="codeSize = 31";
Debug.ShouldStop(4);
_codesize = BA.numberCast(float.class, 31);Debug.locals.put("codeSize", _codesize);
 BA.debugLineNum = 388;BA.debugLine="cardRadius = 16dip";
Debug.ShouldStop(8);
_cardradius = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("cardRadius", _cardradius);
 }else 
{ BA.debugLineNum = 389;BA.debugLine="Else If medium Then";
Debug.ShouldStop(16);
if (_medium.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 390;BA.debugLine="streamFontSize = 32";
Debug.ShouldStop(32);
_streamfontsize = BA.numberCast(float.class, 32);Debug.locals.put("streamFontSize", _streamfontsize);
 BA.debugLineNum = 391;BA.debugLine="infoFontSize = 17";
Debug.ShouldStop(64);
_infofontsize = BA.numberCast(float.class, 17);Debug.locals.put("infoFontSize", _infofontsize);
 BA.debugLineNum = 392;BA.debugLine="playFontSize = 68";
Debug.ShouldStop(128);
_playfontsize = BA.numberCast(float.class, 68);Debug.locals.put("playFontSize", _playfontsize);
 BA.debugLineNum = 393;BA.debugLine="stopFontSize = 50";
Debug.ShouldStop(256);
_stopfontsize = BA.numberCast(float.class, 50);Debug.locals.put("stopFontSize", _stopfontsize);
 BA.debugLineNum = 394;BA.debugLine="headerActionSize = 26";
Debug.ShouldStop(512);
_headeractionsize = BA.numberCast(float.class, 26);Debug.locals.put("headerActionSize", _headeractionsize);
 BA.debugLineNum = 395;BA.debugLine="codeSize = 35";
Debug.ShouldStop(1024);
_codesize = BA.numberCast(float.class, 35);Debug.locals.put("codeSize", _codesize);
 BA.debugLineNum = 396;BA.debugLine="cardRadius = 20dip";
Debug.ShouldStop(2048);
_cardradius = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));Debug.locals.put("cardRadius", _cardradius);
 }else {
 BA.debugLineNum = 398;BA.debugLine="streamFontSize = 38";
Debug.ShouldStop(8192);
_streamfontsize = BA.numberCast(float.class, 38);Debug.locals.put("streamFontSize", _streamfontsize);
 BA.debugLineNum = 399;BA.debugLine="infoFontSize = 17";
Debug.ShouldStop(16384);
_infofontsize = BA.numberCast(float.class, 17);Debug.locals.put("infoFontSize", _infofontsize);
 BA.debugLineNum = 400;BA.debugLine="playFontSize = 74";
Debug.ShouldStop(32768);
_playfontsize = BA.numberCast(float.class, 74);Debug.locals.put("playFontSize", _playfontsize);
 BA.debugLineNum = 401;BA.debugLine="stopFontSize = 54";
Debug.ShouldStop(65536);
_stopfontsize = BA.numberCast(float.class, 54);Debug.locals.put("stopFontSize", _stopfontsize);
 BA.debugLineNum = 402;BA.debugLine="headerActionSize = 28";
Debug.ShouldStop(131072);
_headeractionsize = BA.numberCast(float.class, 28);Debug.locals.put("headerActionSize", _headeractionsize);
 BA.debugLineNum = 403;BA.debugLine="codeSize = 38";
Debug.ShouldStop(262144);
_codesize = BA.numberCast(float.class, 38);Debug.locals.put("codeSize", _codesize);
 BA.debugLineNum = 404;BA.debugLine="cardRadius = 24dip";
Debug.ShouldStop(524288);
_cardradius = b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)));Debug.locals.put("cardRadius", _cardradius);
 }}
;
 BA.debugLineNum = 407;BA.debugLine="playIconBaseSize = playFontSize";
Debug.ShouldStop(4194304);
__ref.setField ("_playiconbasesize" /*RemoteObject*/ ,_playfontsize);
 BA.debugLineNum = 408;BA.debugLine="stopIconBaseSize = stopFontSize";
Debug.ShouldStop(8388608);
__ref.setField ("_stopiconbasesize" /*RemoteObject*/ ,_stopfontsize);
 BA.debugLineNum = 409;BA.debugLine="headerActionFontSize = headerActionSize";
Debug.ShouldStop(16777216);
__ref.setField ("_headeractionfontsize" /*RemoteObject*/ ,_headeractionsize);
 BA.debugLineNum = 410;BA.debugLine="codeFontSize = codeSize";
Debug.ShouldStop(33554432);
__ref.setField ("_codefontsize" /*RemoteObject*/ ,_codesize);
 BA.debugLineNum = 411;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblstream" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(_streamfontsize)));
 BA.debugLineNum = 412;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblinfo" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(_infofontsize)));
 BA.debugLineNum = 413;BA.debugLine="lblHeader.Font = xui.CreateDefaultFont(12)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblheader" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12))));
 BA.debugLineNum = 414;BA.debugLine="lblFooter.Font = xui.CreateDefaultFont(12)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblfooter" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12))));
 BA.debugLineNum = 415;BA.debugLine="lblHeaderAction.Font = xui.CreateDefaultBoldFont(";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblheaderaction" /*RemoteObject*/ ).runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(__ref.getField(true,"_headeractionfontsize" /*RemoteObject*/ ))));
 BA.debugLineNum = 416;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_card" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, ((int)0xff1a1b1e))),(Object)(BA.numberCast(double.class, b4xmainpage.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(int.class, ((int)0x14ffffff))),(Object)(BA.numberCast(double.class, _cardradius)));
 BA.debugLineNum = 417;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_updatecodeinputappearance" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_iscodeinputfocused" /*RemoteObject*/ )));
 BA.debugLineNum = 418;BA.debugLine="If isStarted Then";
Debug.ShouldStop(2);
if (__ref.getField(true,"_isstarted" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 419;BA.debugLine="SetStopIcon";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setstopicon" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 421;BA.debugLine="SetPlayIcon";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_setplayicon" /*RemoteObject*/ );
 };
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatevisiblemode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleMode (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("updatevisiblemode")) { return __ref.runUserSub(false, "b4xmainpage","updatevisiblemode", __ref);}
 BA.debugLineNum = 501;BA.debugLine="Private Sub UpdateVisibleMode";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 502;BA.debugLine="setupPane.Visible = appScreenMode <> \"player\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_setuppane" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("player"))));
 BA.debugLineNum = 503;BA.debugLine="If appScreenMode = \"player\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("player"))) { 
 BA.debugLineNum = 504;BA.debugLine="playerPane.Visible = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_playerpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 506;BA.debugLine="playerPane.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_playerpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 };
 BA.debugLineNum = 508;BA.debugLine="If appScreenMode = \"setup\" Then headerActionPane.";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_appscreenmode" /*RemoteObject*/ ),BA.ObjectToString("setup"))) { 
__ref.getField(false,"_headeractionpane" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));};
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _urlencode(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("UrlEncode (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,1633);
if (RapidSub.canDelegate("urlencode")) { return __ref.runUserSub(false, "b4xmainpage","urlencode", __ref, _value);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 1633;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 1634;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1635;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
Debug.ShouldStop(4);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.net.URLEncoder")));
 BA.debugLineNum = 1636;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("encode")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable(""),_value)),(RemoteObject.createImmutable("UTF-8"))}))));
 BA.debugLineNum = 1637;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}