package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackdatacoordinator_subs_0 {


public static RemoteObject  _allowregularadsattargetminute(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _targetminutetimestamp) throws Exception{
try {
		Debug.PushSubsStack("AllowRegularAdsAtTargetMinute (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("allowregularadsattargetminute")) { return __ref.runUserSub(false, "playbackdatacoordinator","allowregularadsattargetminute", __ref, _offlinedata, _targetminutetimestamp);}
RemoteObject _targetticks = RemoteObject.createImmutable(0L);
RemoteObject _targetslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("targetMinuteTimestamp", _targetminutetimestamp);
 BA.debugLineNum = 323;BA.debugLine="Public Sub AllowRegularAdsAtTargetMinute(offlineDa";
Debug.ShouldStop(4);
 BA.debugLineNum = 324;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 325;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
Debug.ShouldStop(16);
_targetticks = RemoteObject.solve(new RemoteObject[] {_targetminutetimestamp,RemoteObject.createImmutable(1000)}, "*",0, 2);Debug.locals.put("targetTicks", _targetticks);Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 326;BA.debugLine="Dim targetSlot As Map = stateStore.ResolveDataSlo";
Debug.ShouldStop(32);
_targetslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_targetslot = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_targetticks));Debug.locals.put("targetSlot", _targetslot);Debug.locals.put("targetSlot", _targetslot);
 BA.debugLineNum = 327;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
Debug.ShouldStop(64);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_isidleslot" /*RemoteObject*/ ,(Object)(_targetslot)),playbackdatacoordinator.__c.getField(true,"False")));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private stateStore As PlayerStateStore";
playbackdatacoordinator._statestore = RemoteObject.createNew ("b4j.example.playerstatestore");__ref.setField("_statestore",playbackdatacoordinator._statestore);
 //BA.debugLineNum = 7;BA.debugLine="Private syncService As NetworkSyncService";
playbackdatacoordinator._syncservice = RemoteObject.createNew ("b4j.example.networksyncservice");__ref.setField("_syncservice",playbackdatacoordinator._syncservice);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createinitializedmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedMap (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,396);
if (RapidSub.canDelegate("createinitializedmap")) { return __ref.runUserSub(false, "playbackdatacoordinator","createinitializedmap", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 396;BA.debugLine="Private Sub CreateInitializedMap As Map";
Debug.ShouldStop(2048);
 BA.debugLineNum = 397;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4096);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 398;BA.debugLine="m.Initialize";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 399;BA.debugLine="Return m";
Debug.ShouldStop(16384);
if (true) return _m;
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleblockedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HandleBlockedState (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("handleblockedstate")) { return __ref.runUserSub(false, "playbackdatacoordinator","handleblockedstate", __ref);}
 BA.debugLineNum = 167;BA.debugLine="Public Sub HandleBlockedState";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="stateStore.TraceLog(\"состояние blocked\")";
Debug.ShouldStop(128);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("состояние blocked")));
 BA.debugLineNum = 169;BA.debugLine="stateStore.EnterPolicyPause(stateStore.MessageVal";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enterpolicypause" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("blocked")))),(Object)(RemoteObject.createImmutable("blocked")));
 BA.debugLineNum = 170;BA.debugLine="stateStore.ScheduleRetry(\"blocked\", 0)";
Debug.ShouldStop(512);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("blocked")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("HandleFetchFailure (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("handlefetchfailure")) { return __ref.runUserSub(false, "playbackdatacoordinator","handlefetchfailure", __ref, _result);}
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
public ResumableSub_HandleFetchFailure(b4j.example.playbackdatacoordinator parent,RemoteObject __ref,RemoteObject _result) {
this.parent = parent;
this.__ref = __ref;
this._result = _result;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackdatacoordinator parent;
RemoteObject _result;
RemoteObject _serviceavailable = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleFetchFailure (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,232);
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
 BA.debugLineNum = 233;BA.debugLine="stateStore.TraceLog(\"очередь fetch ошибка kind=\"";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("очередь fetch ошибка kind="),_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" message="),_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ErrorMessage"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 234;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"offline\" Then";
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
 BA.debugLineNum = 235;BA.debugLine="HandleLocalTemporaryState(\"\")";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_handlelocaltemporarystate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 236;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 238;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
Debug.ShouldStop(8192);

case 4:
//if
this.state = 7;
if (__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_haslocalplaybackfallback" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 239;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
Debug.ShouldStop(16384);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("fallback выбор mode=local reason=data_fetch_error")));
 BA.debugLineNum = 240;BA.debugLine="HandleLocalTemporaryState(\"\")";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_handlelocaltemporarystate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 241;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 243;BA.debugLine="Wait For (syncService.CheckServiceAvailability(25";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackdatacoordinator", "handlefetchfailure"), __ref.getField(false,"_syncservice" /*RemoteObject*/ ).runClassMethod (b4j.example.networksyncservice.class, "_checkserviceavailability" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2500))));
this.state = 14;
return;
case 14:
//C
this.state = 8;
_serviceavailable = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("serviceAvailable", _serviceavailable);
;
 BA.debugLineNum = 244;BA.debugLine="If serviceAvailable Then";
Debug.ShouldStop(524288);
if (true) break;

case 8:
//if
this.state = 13;
if (_serviceavailable.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 245;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 247;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_handletemporarystate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("server")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 249;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _complete(RemoteObject __ref,RemoteObject _serviceavailable) throws Exception{
}
public static RemoteObject  _handlelocaltemporarystate(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("HandleLocalTemporaryState (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("handlelocaltemporarystate")) { return __ref.runUserSub(false, "playbackdatacoordinator","handlelocaltemporarystate", __ref, _text);}
RemoteObject _fallbackready = RemoteObject.createImmutable(false);
Debug.locals.put("text", _text);
 BA.debugLineNum = 199;BA.debugLine="Public Sub HandleLocalTemporaryState(text As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="Dim fallbackReady As Boolean = stateStore.HasLoca";
Debug.ShouldStop(128);
_fallbackready = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_haslocalplaybackfallback" /*RemoteObject*/ );Debug.locals.put("fallbackReady", _fallbackready);Debug.locals.put("fallbackReady", _fallbackready);
 BA.debugLineNum = 201;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=off";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("состояние temporary mode=offline playableFallback="),_fallbackready,RemoteObject.createImmutable(" text="),_text)));
 BA.debugLineNum = 202;BA.debugLine="If fallbackReady Then stateStore.TraceLog(\"fallba";
Debug.ShouldStop(512);
if (_fallbackready.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("fallback выбор mode=temporary_local reason=playable_local_fallback")));};
 BA.debugLineNum = 203;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"temporar";
Debug.ShouldStop(1024);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplaybackflowstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idle")),(Object)(RemoteObject.createImmutable("temporary_local_state")));
 BA.debugLineNum = 204;BA.debugLine="stateStore.SetLocalFallbackReady(fallbackReady)";
Debug.ShouldStop(2048);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlocalfallbackready" /*RemoteObject*/ ,(Object)(_fallbackready));
 BA.debugLineNum = 205;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
Debug.ShouldStop(4096);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 206;BA.debugLine="stateStore.ClearPlaybackState";
Debug.ShouldStop(8192);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 207;BA.debugLine="stateStore.HidePin";
Debug.ShouldStop(16384);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 208;BA.debugLine="If text <> \"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_text,BA.ObjectToString(""))) { 
 BA.debugLineNum = 209;BA.debugLine="stateStore.ShowMessage(text)";
Debug.ShouldStop(65536);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(_text));
 }else {
 BA.debugLineNum = 211;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("offline")))));
 };
 BA.debugLineNum = 213;BA.debugLine="stateStore.ScheduleRetry(\"offline\", 0)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(BA.ObjectToString("offline")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlemediaerror(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HandleMediaError (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("handlemediaerror")) { return __ref.runUserSub(false, "playbackdatacoordinator","handlemediaerror", __ref);}
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
public ResumableSub_HandleMediaError(b4j.example.playbackdatacoordinator parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackdatacoordinator parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleMediaError (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,274);
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
 BA.debugLineNum = 275;BA.debugLine="stateStore.SetPlaybackFlowState(\"error\", \"media_e";
Debug.ShouldStop(262144);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplaybackflowstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("error")),(Object)(RemoteObject.createImmutable("media_error")));
 BA.debugLineNum = 276;BA.debugLine="If stateStore.HasLocalPlaybackFallback Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_haslocalplaybackfallback" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 277;BA.debugLine="stateStore.TraceLog(\"fallback выбор mode=local r";
Debug.ShouldStop(1048576);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("fallback выбор mode=local reason=media_error")));
 BA.debugLineNum = 278;BA.debugLine="SwitchToLocalPlayback(True, \"media_failure\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_switchtolocalplayback" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(RemoteObject.createImmutable("media_failure")));
 BA.debugLineNum = 279;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 281;BA.debugLine="HandleLocalTemporaryState(\"Нужен интернет\")";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_handlelocaltemporarystate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Нужен интернет")));
 BA.debugLineNum = 282;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 283;BA.debugLine="End Sub";
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
public static RemoteObject  _handleshutdownmessage(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("HandleShutdownMessage (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("handleshutdownmessage")) { return __ref.runUserSub(false, "playbackdatacoordinator","handleshutdownmessage", __ref, _text);}
RemoteObject _safetext = RemoteObject.createImmutable("");
Debug.locals.put("text", _text);
 BA.debugLineNum = 217;BA.debugLine="Public Sub HandleShutdownMessage(text As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Dim safeText As String = text";
Debug.ShouldStop(33554432);
_safetext = _text;Debug.locals.put("safeText", _safetext);Debug.locals.put("safeText", _safetext);
 BA.debugLineNum = 219;BA.debugLine="If safeText = \"\" Then safeText = stateStore.Messa";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_safetext,BA.ObjectToString(""))) { 
_safetext = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("server_wait")));Debug.locals.put("safeText", _safetext);};
 BA.debugLineNum = 220;BA.debugLine="stateStore.TraceLog(\"message shutdown text=\" & sa";
Debug.ShouldStop(134217728);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("message shutdown text="),_safetext)));
 BA.debugLineNum = 221;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"shutdown";
Debug.ShouldStop(268435456);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplaybackflowstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idle")),(Object)(RemoteObject.createImmutable("shutdown")));
 BA.debugLineNum = 222;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(536870912);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearpolicypauseandresumerequest" /*RemoteObject*/ );
 BA.debugLineNum = 223;BA.debugLine="stateStore.ClearPlaybackState";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 224;BA.debugLine="stateStore.HidePin";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 225;BA.debugLine="stateStore.EnterUserStoppedState";
Debug.ShouldStop(1);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enteruserstoppedstate" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="stateStore.SetPlayIcon";
Debug.ShouldStop(2);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 227;BA.debugLine="stateStore.ShowMessage(safeText)";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(_safetext));
 BA.debugLineNum = 228;BA.debugLine="stateStore.DisableBackgroundRefreshTimers";
Debug.ShouldStop(8);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_disablebackgroundrefreshtimers" /*RemoteObject*/ );
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
public static RemoteObject  _handletemporarystate(RemoteObject __ref,RemoteObject _mode,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("HandleTemporaryState (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("handletemporarystate")) { return __ref.runUserSub(false, "playbackdatacoordinator","handletemporarystate", __ref, _mode, _text);}
Debug.locals.put("mode", _mode);
Debug.locals.put("text", _text);
 BA.debugLineNum = 150;BA.debugLine="Public Sub HandleTemporaryState(mode As String, te";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="stateStore.TraceLog(\"состояние temporary mode=\" &";
Debug.ShouldStop(4194304);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("состояние temporary mode="),_mode,RemoteObject.createImmutable(" text="),_text)));
 BA.debugLineNum = 152;BA.debugLine="stateStore.ApplyTemporaryMode(mode)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_applytemporarymode" /*RemoteObject*/ ,(Object)(_mode));
 BA.debugLineNum = 153;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
Debug.ShouldStop(16777216);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="stateStore.ClearPlaybackState";
Debug.ShouldStop(33554432);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 155;BA.debugLine="stateStore.HidePin";
Debug.ShouldStop(67108864);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 156;BA.debugLine="If text <> \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("!",_text,BA.ObjectToString(""))) { 
 BA.debugLineNum = 157;BA.debugLine="stateStore.ShowMessage(text)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(_text));
 }else 
{ BA.debugLineNum = 158;BA.debugLine="Else If mode = \"offline\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("offline"))) { 
 BA.debugLineNum = 159;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("offline")))));
 }else {
 BA.debugLineNum = 161;BA.debugLine="stateStore.ShowMessage(stateStore.MessageValue(\"";
Debug.ShouldStop(1);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("server_wait")))));
 }}
;
 BA.debugLineNum = 163;BA.debugLine="stateStore.ScheduleRetry(mode, 0)";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_scheduleretry" /*RemoteObject*/ ,(Object)(_mode),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasplayablelocaltrackincurrentslot(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _effectivenowticks) throws Exception{
try {
		Debug.PushSubsStack("HasPlayableLocalTrackInCurrentSlot (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("hasplayablelocaltrackincurrentslot")) { return __ref.runUserSub(false, "playbackdatacoordinator","hasplayablelocaltrackincurrentslot", __ref, _offlinedata, _effectivenowticks);}
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("effectiveNowTicks", _effectivenowticks);
 BA.debugLineNum = 294;BA.debugLine="Public Sub HasPlayableLocalTrackInCurrentSlot(offl";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveDataSl";
Debug.ShouldStop(64);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_effectivenowticks));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 296;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 297;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(256);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(playbackdatacoordinator.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 298;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 299;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(1024);
{
final RemoteObject group5 = _playlists;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.runMethod(false,"Get",index5);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 300;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 301;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
Debug.ShouldStop(4096);
_playlistdescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistDescriptor", _playlistdescriptor);Debug.locals.put("playlistDescriptor", _playlistdescriptor);
 BA.debugLineNum = 302;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
Debug.ShouldStop(8192);
_playlistid = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 303;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 304;BA.debugLine="Dim playlistData As Map = stateStore.LoadCached";
Debug.ShouldStop(32768);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdata = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("playlistData", _playlistdata);Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 305;BA.debugLine="If PlaylistHasCachedTrack(playlistData) Then Re";
Debug.ShouldStop(65536);
if (__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_playlisthascachedtrack" /*RemoteObject*/ ,(Object)(_playlistdata)).<Boolean>get().booleanValue()) { 
if (true) return playbackdatacoordinator.__c.getField(true,"True");};
 };
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 BA.debugLineNum = 308;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return playbackdatacoordinator.__c.getField(true,"False");
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _store,RemoteObject _syncworker) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackdatacoordinator","initialize", __ref, _ba, _store, _syncworker);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("store", _store);
Debug.locals.put("syncWorker", _syncworker);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(store As PlayerStateStore, s";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="stateStore = store";
Debug.ShouldStop(1024);
__ref.setField ("_statestore" /*RemoteObject*/ ,_store);
 BA.debugLineNum = 12;BA.debugLine="syncService = syncWorker";
Debug.ShouldStop(2048);
__ref.setField ("_syncservice" /*RemoteObject*/ ,_syncworker);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isidleslot(RemoteObject __ref,RemoteObject _slotcontext) throws Exception{
try {
		Debug.PushSubsStack("IsIdleSlot (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,402);
if (RapidSub.canDelegate("isidleslot")) { return __ref.runUserSub(false, "playbackdatacoordinator","isidleslot", __ref, _slotcontext);}
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _streamid = RemoteObject.createImmutable("");
RemoteObject _streamtitle = RemoteObject.createImmutable("");
Debug.locals.put("slotContext", _slotcontext);
 BA.debugLineNum = 402;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_slotcontext.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_slotcontext.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 404;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
Debug.ShouldStop(524288);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _slotcontext.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(playbackdatacoordinator.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 405;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",_playlists.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 406;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
Debug.ShouldStop(2097152);
_streamid = BA.ObjectToString(_slotcontext.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamId", _streamid);Debug.locals.put("streamId", _streamid);
 BA.debugLineNum = 407;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
Debug.ShouldStop(4194304);
_streamtitle = BA.ObjectToString(_slotcontext.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_title"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("streamTitle", _streamtitle);Debug.locals.put("streamTitle", _streamtitle);
 BA.debugLineNum = 408;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_streamid,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_streamtitle,BA.ObjectToString("")));
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isplaybackallowed(RemoteObject __ref,RemoteObject _data,RemoteObject _effectivenowticks) throws Exception{
try {
		Debug.PushSubsStack("IsPlaybackAllowed (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("isplaybackallowed")) { return __ref.runUserSub(false, "playbackdatacoordinator","isplaybackallowed", __ref, _data, _effectivenowticks);}
RemoteObject _playerdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _endtimestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("data", _data);
Debug.locals.put("effectiveNowTicks", _effectivenowticks);
 BA.debugLineNum = 16;BA.debugLine="Public Sub IsPlaybackAllowed(data As Map, effectiv";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="If data.IsInitialized = False Then Return True";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"True");};
 BA.debugLineNum = 18;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
Debug.ShouldStop(131072);
_playerdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playerdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));Debug.locals.put("playerData", _playerdata);Debug.locals.put("playerData", _playerdata);
 BA.debugLineNum = 19;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",_playerdata.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",_playerdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playback_allowed")))))) { 
 BA.debugLineNum = 20;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_playerdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playback_allowed"))),(Object)((playbackdatacoordinator.__c.getField(true,"True")))),(playbackdatacoordinator.__c.getField(true,"True")))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 };
 BA.debugLineNum = 22;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
Debug.ShouldStop(2097152);
_endtimestamp = __ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_resolveplaybackendtimestamp" /*RemoteObject*/ ,(Object)(_data));Debug.locals.put("endTimestamp", _endtimestamp);Debug.locals.put("endTimestamp", _endtimestamp);
 BA.debugLineNum = 23;BA.debugLine="If endTimestamp <= 0 Then Return True";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("k",_endtimestamp,BA.numberCast(long.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"True");};
 BA.debugLineNum = 24;BA.debugLine="Return effectiveNowTicks < (endTimestamp * 1000)";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_effectivenowticks,(RemoteObject.solve(new RemoteObject[] {_endtimestamp,RemoteObject.createImmutable(1000)}, "*",0, 2))));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsedateonlyendtimestamp(RemoteObject __ref,RemoteObject _textvalue) throws Exception{
try {
		Debug.PushSubsStack("ParseDateOnlyEndTimestamp (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("parsedateonlyendtimestamp")) { return __ref.runUserSub(false, "playbackdatacoordinator","parsedateonlyendtimestamp", __ref, _textvalue);}
RemoteObject _previousdateformat = RemoteObject.createImmutable("");
RemoteObject _daystartticks = RemoteObject.createImmutable(0L);
Debug.locals.put("textValue", _textvalue);
 BA.debugLineNum = 382;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 383;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
Debug.ShouldStop(1073741824);
_previousdateformat = playbackdatacoordinator.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("previousDateFormat", _previousdateformat);Debug.locals.put("previousDateFormat", _previousdateformat);
 BA.debugLineNum = 384;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 385;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1);
playbackdatacoordinator.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 386;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
Debug.ShouldStop(2);
_daystartticks = playbackdatacoordinator.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_textvalue));Debug.locals.put("dayStartTicks", _daystartticks);Debug.locals.put("dayStartTicks", _daystartticks);
 BA.debugLineNum = 387;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(4);
playbackdatacoordinator.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 388;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, playbackdatacoordinator.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_daystartticks,playbackdatacoordinator.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+",1, 2)),RemoteObject.createImmutable(1000)}, "/",0, 0))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 390;BA.debugLine="DateTime.DateFormat = previousDateFormat";
Debug.ShouldStop(32);
playbackdatacoordinator.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_previousdateformat);
 BA.debugLineNum = 391;BA.debugLine="stateStore.ConsumeLastException";
Debug.ShouldStop(64);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_consumelastexception" /*RemoteObject*/ );
 BA.debugLineNum = 392;BA.debugLine="Return 0";
Debug.ShouldStop(128);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseendvaluetotimestamp(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ParseEndValueToTimestamp (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("parseendvaluetotimestamp")) { return __ref.runUserSub(false, "playbackdatacoordinator","parseendvaluetotimestamp", __ref, _value);}
RemoteObject _textvalue = RemoteObject.createImmutable("");
RemoteObject _instantclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _instant = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _offsetdatetimeclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _offsetdatetime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 330;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="If value = Null Then Return 0";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("n",_value)) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 332;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
Debug.ShouldStop(2048);
_textvalue = (RemoteObject.concat(RemoteObject.createImmutable(""),_value)).runMethod(true,"trim");Debug.locals.put("textValue", _textvalue);Debug.locals.put("textValue", _textvalue);
 BA.debugLineNum = 333;BA.debugLine="If textValue = \"\" Then Return 0";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_textvalue,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 334;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
Debug.ShouldStop(8192);
if (playbackdatacoordinator.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("^\\d+$")),(Object)(_textvalue)).<Boolean>get().booleanValue()) { 
if (true) return BA.numberCast(long.class, playbackdatacoordinator.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _textvalue))));};
 BA.debugLineNum = 335;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
Debug.ShouldStop(16384);
if (playbackdatacoordinator.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("^\\d{4}-\\d{2}-\\d{2}$")),(Object)(_textvalue)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 336;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
Debug.ShouldStop(32768);
if (true) return __ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_parsedateonlyendtimestamp" /*RemoteObject*/ ,(Object)(_textvalue));
 };
 BA.debugLineNum = 338;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 339;BA.debugLine="Dim instantClass As JavaObject";
Debug.ShouldStop(262144);
_instantclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("instantClass", _instantclass);
 BA.debugLineNum = 340;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
Debug.ShouldStop(524288);
_instantclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.Instant")));
 BA.debugLineNum = 341;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
Debug.ShouldStop(1048576);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _instantclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_textvalue)}))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 342;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _instant.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getEpochSecond")),(Object)((playbackdatacoordinator.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 344;BA.debugLine="stateStore.ConsumeLastException";
Debug.ShouldStop(8388608);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_consumelastexception" /*RemoteObject*/ );
 };
 BA.debugLineNum = 346;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 347;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
Debug.ShouldStop(67108864);
_offsetdatetimeclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("offsetDateTimeClass", _offsetdatetimeclass);
 BA.debugLineNum = 348;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
Debug.ShouldStop(134217728);
_offsetdatetimeclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.OffsetDateTime")));
 BA.debugLineNum = 349;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
Debug.ShouldStop(268435456);
_offsetdatetime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_offsetdatetime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _offsetdatetimeclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_textvalue)}))));Debug.locals.put("offsetDateTime", _offsetdatetime);Debug.locals.put("offsetDateTime", _offsetdatetime);
 BA.debugLineNum = 350;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
Debug.ShouldStop(536870912);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _offsetdatetime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toInstant")),(Object)((playbackdatacoordinator.__c.getField(false,"Null")))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 351;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _instant.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getEpochSecond")),(Object)((playbackdatacoordinator.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e23.toString()); BA.debugLineNum = 353;BA.debugLine="stateStore.ConsumeLastException";
Debug.ShouldStop(1);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_consumelastexception" /*RemoteObject*/ );
 };
 BA.debugLineNum = 355;BA.debugLine="stateStore.TraceLog(\"player end parse fail value=";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("player end parse fail value="),_textvalue)));
 BA.debugLineNum = 356;BA.debugLine="Return 0";
Debug.ShouldStop(8);
if (true) return BA.numberCast(long.class, 0);
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsetrustedonlineticks(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ParseTrustedOnlineTicks (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("parsetrustedonlineticks")) { return __ref.runUserSub(false, "playbackdatacoordinator","parsetrustedonlineticks", __ref, _data);}
RemoteObject _updatedtext = RemoteObject.createImmutable("");
RemoteObject _instantclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _instant = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _offsetdatetimeclass = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _offsetdatetime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("data", _data);
 BA.debugLineNum = 359;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
Debug.ShouldStop(64);
 BA.debugLineNum = 360;BA.debugLine="If data.IsInitialized = False Then Return 0";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 361;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
Debug.ShouldStop(256);
_updatedtext = (RemoteObject.concat(RemoteObject.createImmutable(""),_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable("")))))).runMethod(true,"trim");Debug.locals.put("updatedText", _updatedtext);Debug.locals.put("updatedText", _updatedtext);
 BA.debugLineNum = 362;BA.debugLine="If updatedText = \"\" Then Return 0";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_updatedtext,BA.ObjectToString(""))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 363;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 364;BA.debugLine="Dim instantClass As JavaObject";
Debug.ShouldStop(2048);
_instantclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("instantClass", _instantclass);
 BA.debugLineNum = 365;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
Debug.ShouldStop(4096);
_instantclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.Instant")));
 BA.debugLineNum = 366;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
Debug.ShouldStop(8192);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _instantclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_updatedtext)}))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 367;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _instant.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toEpochMilli")),(Object)((playbackdatacoordinator.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 369;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 370;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
Debug.ShouldStop(131072);
_offsetdatetimeclass = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("offsetDateTimeClass", _offsetdatetimeclass);
 BA.debugLineNum = 371;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
Debug.ShouldStop(262144);
_offsetdatetimeclass.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.time.OffsetDateTime")));
 BA.debugLineNum = 372;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
Debug.ShouldStop(524288);
_offsetdatetime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_offsetdatetime = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _offsetdatetimeclass.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_updatedtext)}))));Debug.locals.put("offsetDateTime", _offsetdatetime);Debug.locals.put("offsetDateTime", _offsetdatetime);
 BA.debugLineNum = 373;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
Debug.ShouldStop(1048576);
_instant = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_instant = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _offsetdatetime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toInstant")),(Object)((playbackdatacoordinator.__c.getField(false,"Null")))));Debug.locals.put("instant", _instant);Debug.locals.put("instant", _instant);
 BA.debugLineNum = 374;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _instant.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toEpochMilli")),(Object)((playbackdatacoordinator.__c.getField(false,"Null")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 376;BA.debugLine="stateStore.ConsumeLastException";
Debug.ShouldStop(8388608);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_consumelastexception" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 379;BA.debugLine="Return 0";
Debug.ShouldStop(67108864);
if (true) return BA.numberCast(long.class, 0);
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pauseplaybackbypolicy(RemoteObject __ref,RemoteObject _reason,RemoteObject _connectionmode) throws Exception{
try {
		Debug.PushSubsStack("PausePlaybackByPolicy (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("pauseplaybackbypolicy")) { return __ref.runUserSub(false, "playbackdatacoordinator","pauseplaybackbypolicy", __ref, _reason, _connectionmode);}
RemoteObject _safereason = RemoteObject.createImmutable("");
Debug.locals.put("reason", _reason);
Debug.locals.put("connectionMode", _connectionmode);
 BA.debugLineNum = 286;BA.debugLine="Public Sub PausePlaybackByPolicy(reason As String,";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Dim safeReason As String = reason";
Debug.ShouldStop(1073741824);
_safereason = _reason;Debug.locals.put("safeReason", _safereason);Debug.locals.put("safeReason", _safereason);
 BA.debugLineNum = 288;BA.debugLine="If safeReason = \"\" Then safeReason = stateStore.M";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_safereason,BA.ObjectToString(""))) { 
_safereason = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("playback_paused")));Debug.locals.put("safeReason", _safereason);};
 BA.debugLineNum = 289;BA.debugLine="stateStore.EnterPolicyPause(safeReason, connectio";
Debug.ShouldStop(1);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enterpolicypause" /*RemoteObject*/ ,(Object)(_safereason),(Object)(_connectionmode));
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playlisthascachedtrack(RemoteObject __ref,RemoteObject _playlistdata) throws Exception{
try {
		Debug.PushSubsStack("PlaylistHasCachedTrack (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,411);
if (RapidSub.canDelegate("playlisthascachedtrack")) { return __ref.runUserSub(false, "playbackdatacoordinator","playlisthascachedtrack", __ref, _playlistdata);}
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _trackobject = RemoteObject.declareNull("Object");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackid = RemoteObject.createImmutable("");
Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 411;BA.debugLine="Private Sub PlaylistHasCachedTrack(playlistData As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="If playlistData.IsInitialized = False Or playlist";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 413;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
Debug.ShouldStop(268435456);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _playlistdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(playbackdatacoordinator.__c.getField(false,"Null"))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 414;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_tracks.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"False");};
 BA.debugLineNum = 415;BA.debugLine="For Each trackObject As Object In tracks";
Debug.ShouldStop(1073741824);
{
final RemoteObject group4 = _tracks;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackobject = group4.runMethod(false,"Get",index4);Debug.locals.put("trackObject", _trackobject);
Debug.locals.put("trackObject", _trackobject);
 BA.debugLineNum = 416;BA.debugLine="If trackObject Is Map Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("i",_trackobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 417;BA.debugLine="Dim track As Map = trackObject";
Debug.ShouldStop(1);
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _trackobject);Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 418;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
Debug.ShouldStop(2);
_trackid = BA.ObjectToString(_track.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("trackId", _trackid);Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 419;BA.debugLine="If trackId <> \"\" And stateStore.IsTrackCached(t";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",_trackid,BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid)))) { 
if (true) return playbackdatacoordinator.__c.getField(true,"True");};
 };
 }
}Debug.locals.put("trackObject", _trackobject);
;
 BA.debugLineNum = 422;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) return playbackdatacoordinator.__c.getField(true,"False");
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshofflinedatanow(RemoteObject __ref,RemoteObject _fetchtimeoutms) throws Exception{
try {
		Debug.PushSubsStack("RefreshOfflineDataNow (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("refreshofflinedatanow")) { return __ref.runUserSub(false, "playbackdatacoordinator","refreshofflinedatanow", __ref, _fetchtimeoutms);}
ResumableSub_RefreshOfflineDataNow rsub = new ResumableSub_RefreshOfflineDataNow(null,__ref,_fetchtimeoutms);
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
public static class ResumableSub_RefreshOfflineDataNow extends BA.ResumableSub {
public ResumableSub_RefreshOfflineDataNow(b4j.example.playbackdatacoordinator parent,RemoteObject __ref,RemoteObject _fetchtimeoutms) {
this.parent = parent;
this.__ref = __ref;
this._fetchtimeoutms = _fetchtimeoutms;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playbackdatacoordinator parent;
RemoteObject _fetchtimeoutms;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultdata = RemoteObject.declareNull("Object");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefreshOfflineDataNow (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,70);
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
Debug.locals.put("fetchTimeoutMs", _fetchtimeoutms);
 BA.debugLineNum = 71;BA.debugLine="If stateStore.PlayerCodeValue = \"\" Then Return Fa";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 72;BA.debugLine="If stateStore.BeginOfflineDataRefresh = False The";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_beginofflinedatarefresh" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 73;BA.debugLine="stateStore.TraceInfo(\"network\", \"запрос данных\",";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("запрос данных")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 74;BA.debugLine="Wait For (syncService.FetchData(fetchTimeoutMs))";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref.getField(false,"_syncservice" /*RemoteObject*/ ).runClassMethod (b4j.example.networksyncservice.class, "_fetchdata" /*RemoteObject*/ ,(Object)(_fetchtimeoutms)));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 75;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
Debug.ShouldStop(1024);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"False")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 76;BA.debugLine="stateStore.IncrementNetworkErrorCount";
Debug.ShouldStop(2048);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_incrementnetworkerrorcount" /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="stateStore.TraceWarn(\"network\", \"data ошибка\", \"";
Debug.ShouldStop(4096);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("data ошибка")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("kind="),_result.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Kind"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" lastDataOkAgoSec="),__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_secondsagotext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_getlastdataokat" /*RemoteObject*/ ))))));
 BA.debugLineNum = 78;BA.debugLine="stateStore.EndOfflineDataRefresh(\"http_failed\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("http_failed")));
 BA.debugLineNum = 79;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_writehealthsnapshot" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ошибка_data")));
 BA.debugLineNum = 80;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 82;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
Debug.ShouldStop(131072);
_resultdata = _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Data"))));Debug.locals.put("resultData", _resultdata);Debug.locals.put("resultData", _resultdata);
 BA.debugLineNum = 83;BA.debugLine="If resultData Is Map Then";
Debug.ShouldStop(262144);
if (true) break;

case 17:
//if
this.state = 54;
if (RemoteObject.solveBoolean("i",_resultdata, RemoteObject.createImmutable("java.util.Map"))) { 
this.state = 19;
}else {
this.state = 53;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 84;BA.debugLine="Dim data As Map = resultData";
Debug.ShouldStop(524288);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _resultdata);Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 85;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
Debug.ShouldStop(1048576);
if (true) break;

case 20:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((parent.__c.getField(true,"False")))),(parent.__c.getField(true,"True"))) && RemoteObject.solveBoolean("=",_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("data")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 86;BA.debugLine="stateStore.SetLastDataOkNow";
Debug.ShouldStop(2097152);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlastdataoknow" /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="stateStore.ResetConsecutiveNetworkErrors";
Debug.ShouldStop(4194304);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resetconsecutivenetworkerrors" /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"data";
Debug.ShouldStop(8388608);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlastofflinedatarefreshstate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("data")));
 BA.debugLineNum = 89;BA.debugLine="UpdateTrustedOnlineTimeFromData(data, stateStor";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_updatetrustedonlinetimefromdata" /*RemoteObject*/ ,(Object)(_data),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_storage" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_trustedsynctimekey" /*RemoteObject*/ )));
 BA.debugLineNum = 90;BA.debugLine="stateStore.SaveOfflineData(data)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_saveofflinedata" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 91;BA.debugLine="If stateStore.IsTraceUploadEnabled Then stateSt";
Debug.ShouldStop(67108864);
if (true) break;

case 23:
//if
this.state = 28;
if (__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_istraceuploadenabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_flushtracebufferasync" /*RemoteObject*/ );
if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 92;BA.debugLine="stateStore.InvalidateRelevantTrackIdsCache";
Debug.ShouldStop(134217728);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_invalidaterelevanttrackidscache" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="stateStore.SetRemoteDataReady";
Debug.ShouldStop(268435456);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setremotedataready" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
Debug.ShouldStop(536870912);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 95;BA.debugLine="stateStore.TraceInfo(\"network\", \"data загружены";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("data загружены")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("trace="),__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_istraceuploadenabled" /*RemoteObject*/ ))));
 BA.debugLineNum = 96;BA.debugLine="stateStore.WriteHealthSnapshot(\"data\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_writehealthsnapshot" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("data")));
 BA.debugLineNum = 97;BA.debugLine="Wait For (stateStore.SyncOfflinePlaylistMetadat";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playbackdatacoordinator", "refreshofflinedatanow"), __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_syncofflineplaylistmetadata" /*RemoteObject*/ ));
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 98;BA.debugLine="If stateStore.IsStartupSequenceInProgress Then";
Debug.ShouldStop(2);
if (true) break;

case 29:
//if
this.state = 34;
if (__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isstartupsequenceinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 BA.debugLineNum = 99;BA.debugLine="stateStore.DeferAdWarmupAfterStartup";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_deferadwarmupafterstartup" /*RemoteObject*/ );
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 101;BA.debugLine="stateStore.EnsureAdCacheSyncAsync";
Debug.ShouldStop(16);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_ensureadcachesyncasync" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 103;BA.debugLine="If IsPlaybackAllowed(stateStore.OfflineData, st";
Debug.ShouldStop(64);

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_isplaybackallowed" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ ))),parent.__c.getField(true,"False"))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 104;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_pauseplaybackbypolicy" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_resolveplaybackblockreason" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ )))),(Object)(RemoteObject.createImmutable("server")));
 BA.debugLineNum = 105;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("data")));
 BA.debugLineNum = 106;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 108;BA.debugLine="If stateStore.ResumePlaybackWhenServerAllows An";
Debug.ShouldStop(2048);

case 37:
//if
this.state = 40;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resumeplaybackwhenserverallows" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_shouldresumewithnewstart" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isuserstoppedstate" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isstopping" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 109;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=s";
Debug.ShouldStop(4096);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("policy resume авто mode=server_allow")));
 BA.debugLineNum = 110;BA.debugLine="stateStore.ClearResumePlaybackWhenServerAllows";
Debug.ShouldStop(8192);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearresumeplaybackwhenserverallows" /*RemoteObject*/ );
 BA.debugLineNum = 111;BA.debugLine="stateStore.EnterStartedState";
Debug.ShouldStop(16384);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enterstartedstate" /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="stateStore.SetStopIcon";
Debug.ShouldStop(32768);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setstopicon" /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="stateStore.HideContentBlocks";
Debug.ShouldStop(65536);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsync";
Debug.ShouldStop(131072);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resumeplaybackafterpolicypauseasync" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 116;BA.debugLine="If stateStore.IsPolicyPauseState Then";
Debug.ShouldStop(524288);

case 40:
//if
this.state = 47;
if (__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_ispolicypausestate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 117;BA.debugLine="stateStore.ClearPolicyPause";
Debug.ShouldStop(1048576);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearpolicypause" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="If stateStore.IsUserStoppedState = False And s";
Debug.ShouldStop(2097152);
if (true) break;

case 43:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isuserstoppedstate" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isplaybackstarted" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isstopping" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 119;BA.debugLine="stateStore.TraceLog(\"policy resume авто mode=";
Debug.ShouldStop(4194304);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("policy resume авто mode=policy_pause_clear")));
 BA.debugLineNum = 120;BA.debugLine="stateStore.EnterStartedState";
Debug.ShouldStop(8388608);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enterstartedstate" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="stateStore.SetStopIcon";
Debug.ShouldStop(16777216);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setstopicon" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="stateStore.HideContentBlocks";
Debug.ShouldStop(33554432);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="stateStore.ResumePlaybackAfterPolicyPauseAsyn";
Debug.ShouldStop(67108864);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resumeplaybackafterpolicypauseasync" /*RemoteObject*/ );
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 126;BA.debugLine="stateStore.EndOfflineDataRefresh(\"data\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("data")));
 BA.debugLineNum = 127;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;
;
 BA.debugLineNum = 129;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";
Debug.ShouldStop(1);

case 48:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("message")))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 130;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"mess";
Debug.ShouldStop(2);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlastofflinedatarefreshstate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("message")));
 BA.debugLineNum = 131;BA.debugLine="stateStore.TraceWarn(\"network\", \"data сообщение";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("data сообщение")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("action="),_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" reason="),_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("reason"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 132;BA.debugLine="stateStore.HandleMessageItem(data)";
Debug.ShouldStop(8);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_handlemessageitem" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 133;BA.debugLine="stateStore.EndOfflineDataRefresh(\"message\")";
Debug.ShouldStop(16);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("message")));
 BA.debugLineNum = 134;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
 BA.debugLineNum = 136;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
Debug.ShouldStop(128);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlastofflinedatarefreshstate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("invalid_data")));
 BA.debugLineNum = 137;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("data некорректны")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("type="),_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(" ok="),_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((parent.__c.getField(true,"False")))))));
 BA.debugLineNum = 138;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_pauseplaybackbypolicy" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("invalid_data_response")))),(Object)(RemoteObject.createImmutable("server")));
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 140;BA.debugLine="stateStore.SetLastOfflineDataRefreshState(\"inval";
Debug.ShouldStop(2048);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlastofflinedatarefreshstate" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("invalid_payload")));
 BA.debugLineNum = 141;BA.debugLine="stateStore.TraceWarn(\"network\", \"data некорректн";
Debug.ShouldStop(4096);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("data некорректны")),(Object)(RemoteObject.createImmutable("payload=not_map")));
 BA.debugLineNum = 142;BA.debugLine="PausePlaybackByPolicy(stateStore.MessageValue(\"i";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_pauseplaybackbypolicy" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("invalid_data_response")))),(Object)(RemoteObject.createImmutable("server")));
 if (true) break;

case 54:
//C
this.state = -1;
;
 BA.debugLineNum = 144;BA.debugLine="stateStore.EndOfflineDataRefresh(stateStore.LastO";
Debug.ShouldStop(32768);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_lastofflinedatarefreshstate" /*RemoteObject*/ )));
 BA.debugLineNum = 145;BA.debugLine="stateStore.WriteHealthSnapshot(\"ошибка_data\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_writehealthsnapshot" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ошибка_data")));
 BA.debugLineNum = 146;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _resetretrydelay(RemoteObject __ref,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("ResetRetryDelay (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("resetretrydelay")) { return __ref.runUserSub(false, "playbackdatacoordinator","resetretrydelay", __ref, _localretryinitial, _serverretryinitial);}
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 269;BA.debugLine="Public Sub ResetRetryDelay(localRetryInitial As In";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="stateStore.ResetRetryDelayState(localRetryInitial";
Debug.ShouldStop(8192);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resetretrydelaystate" /*RemoteObject*/ ,(Object)(_localretryinitial),(Object)(_serverretryinitial));
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveidleuntilmessage(RemoteObject __ref,RemoteObject _offlinedata,RemoteObject _effectivenowticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveIdleUntilMessage (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("resolveidleuntilmessage")) { return __ref.runUserSub(false, "playbackdatacoordinator","resolveidleuntilmessage", __ref, _offlinedata, _effectivenowticks);}
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nextslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nexttime = RemoteObject.createImmutable("");
Debug.locals.put("offlineData", _offlinedata);
Debug.locals.put("effectiveNowTicks", _effectivenowticks);
 BA.debugLineNum = 312;BA.debugLine="Public Sub ResolveIdleUntilMessage(offlineData As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="If offlineData.IsInitialized = False Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_offlinedata.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 314;BA.debugLine="Dim currentSlot As Map = stateStore.ResolveCurren";
Debug.ShouldStop(33554432);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resolvecurrentdataslot" /*RemoteObject*/ ,(Object)(_offlinedata));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 315;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_isidleslot" /*RemoteObject*/ ,(Object)(_currentslot)),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 316;BA.debugLine="Dim nextSlot As Map = stateStore.ResolveNextDataS";
Debug.ShouldStop(134217728);
_nextslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nextslot = __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resolvenextdataslotatticks" /*RemoteObject*/ ,(Object)(_offlinedata),(Object)(_effectivenowticks));Debug.locals.put("nextSlot", _nextslot);Debug.locals.put("nextSlot", _nextslot);
 BA.debugLineNum = 317;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
Debug.ShouldStop(268435456);
_nexttime = BA.ObjectToString(_nextslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("nextTime", _nexttime);Debug.locals.put("nextTime", _nexttime);
 BA.debugLineNum = 318;BA.debugLine="If nextTime = \"\" Then Return stateStore.MessageVa";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_nexttime,BA.ObjectToString(""))) { 
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("idle")));};
 BA.debugLineNum = 319;BA.debugLine="Return stateStore.MessageValue(\"idle_until\").Repl";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("idle_until"))).runMethod(true,"replace",(Object)(BA.ObjectToString("{time}")),(Object)(_nexttime));
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaybackblockreason(RemoteObject __ref,RemoteObject _data,RemoteObject _effectivenowticks) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaybackBlockReason (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("resolveplaybackblockreason")) { return __ref.runUserSub(false, "playbackdatacoordinator","resolveplaybackblockreason", __ref, _data, _effectivenowticks);}
RemoteObject _playerdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pausereason = RemoteObject.createImmutable("");
RemoteObject _endtimestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("data", _data);
Debug.locals.put("effectiveNowTicks", _effectivenowticks);
 BA.debugLineNum = 28;BA.debugLine="Public Sub ResolvePlaybackBlockReason(data As Map,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="If data.IsInitialized = False Then Return stateSt";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("playback_paused")));};
 BA.debugLineNum = 30;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
Debug.ShouldStop(536870912);
_playerdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playerdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));Debug.locals.put("playerData", _playerdata);Debug.locals.put("playerData", _playerdata);
 BA.debugLineNum = 31;BA.debugLine="If playerData.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (_playerdata.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
Debug.ShouldStop(-2147483648);
_pausereason = BA.ObjectToString(_playerdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("pause_reason"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("pauseReason", _pausereason);Debug.locals.put("pauseReason", _pausereason);
 BA.debugLineNum = 33;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_pausereason,BA.ObjectToString(""))) { 
if (true) return _pausereason;};
 };
 BA.debugLineNum = 35;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
Debug.ShouldStop(4);
_endtimestamp = __ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_resolveplaybackendtimestamp" /*RemoteObject*/ ,(Object)(_data));Debug.locals.put("endTimestamp", _endtimestamp);Debug.locals.put("endTimestamp", _endtimestamp);
 BA.debugLineNum = 36;BA.debugLine="If endTimestamp > 0 And effectiveNowTicks >= (end";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_endtimestamp,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("g",_effectivenowticks,(RemoteObject.solve(new RemoteObject[] {_endtimestamp,RemoteObject.createImmutable(1000)}, "*",0, 2)))) { 
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("subscription_expired")));};
 BA.debugLineNum = 37;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",_playerdata.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",_playerdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("playback_allowed")))))) { 
 BA.debugLineNum = 38;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_playerdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playback_allowed"))),(Object)((playbackdatacoordinator.__c.getField(true,"True")))),(playbackdatacoordinator.__c.getField(true,"True")))) { 
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("playback_paused")));};
 };
 BA.debugLineNum = 40;BA.debugLine="Return stateStore.MessageValue(\"playback_paused\")";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_messagevalue" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("playback_paused")));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveplaybackendtimestamp(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ResolvePlaybackEndTimestamp (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("resolveplaybackendtimestamp")) { return __ref.runUserSub(false, "playbackdatacoordinator","resolveplaybackendtimestamp", __ref, _data);}
RemoteObject _playerdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playerend = RemoteObject.createImmutable(0L);
Debug.locals.put("data", _data);
 BA.debugLineNum = 44;BA.debugLine="Public Sub ResolvePlaybackEndTimestamp(data As Map";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If data.IsInitialized = False Then Return 0";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),playbackdatacoordinator.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 46;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
Debug.ShouldStop(8192);
_playerdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playerdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("player"))),(Object)((__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_createinitializedmap" /*RemoteObject*/ ).getObject()))));Debug.locals.put("playerData", _playerdata);Debug.locals.put("playerData", _playerdata);
 BA.debugLineNum = 47;BA.debugLine="If playerData.IsInitialized Then";
Debug.ShouldStop(16384);
if (_playerdata.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
Debug.ShouldStop(32768);
_playerend = __ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_parseendvaluetotimestamp" /*RemoteObject*/ ,(Object)(_playerdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("end"))))));Debug.locals.put("playerEnd", _playerend);Debug.locals.put("playerEnd", _playerend);
 BA.debugLineNum = 49;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_playerend,BA.numberCast(long.class, 0))) { 
if (true) return _playerend;};
 };
 BA.debugLineNum = 51;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_parseendvaluetotimestamp" /*RemoteObject*/ ,(Object)(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("end"))))));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveretrydelay(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms,RemoteObject _localretrymax,RemoteObject _serverretrymax,RemoteObject _blockedretrydelay) throws Exception{
try {
		Debug.PushSubsStack("ResolveRetryDelay (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("resolveretrydelay")) { return __ref.runUserSub(false, "playbackdatacoordinator","resolveretrydelay", __ref, _mode, _delayms, _localretrymax, _serverretrymax, _blockedretrydelay);}
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
Debug.locals.put("localRetryMax", _localretrymax);
Debug.locals.put("serverRetryMax", _serverretrymax);
Debug.locals.put("blockedRetryDelay", _blockedretrydelay);
 BA.debugLineNum = 253;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Return stateStore.ResolveRetryDelay(mode, delayMs";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_resolveretrydelay" /*RemoteObject*/ ,(Object)(_mode),(Object)(_delayms),(Object)(_localretrymax),(Object)(_serverretrymax),(Object)(_blockedretrydelay));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scheduleretry(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms,RemoteObject _localretrymax,RemoteObject _serverretrymax,RemoteObject _blockedretrydelay) throws Exception{
try {
		Debug.PushSubsStack("ScheduleRetry (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("scheduleretry")) { return __ref.runUserSub(false, "playbackdatacoordinator","scheduleretry", __ref, _mode, _delayms, _localretrymax, _serverretrymax, _blockedretrydelay);}
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
Debug.locals.put("localRetryMax", _localretrymax);
Debug.locals.put("serverRetryMax", _serverretrymax);
Debug.locals.put("blockedRetryDelay", _blockedretrydelay);
 BA.debugLineNum = 258;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
Debug.ShouldStop(2);
 BA.debugLineNum = 259;BA.debugLine="stateStore.ClearRetryTimer";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 260;BA.debugLine="stateStore.SetLastRetryMode(mode)";
Debug.ShouldStop(8);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setlastretrymode" /*RemoteObject*/ ,(Object)(_mode));
 BA.debugLineNum = 261;BA.debugLine="stateStore.SetRetryInterval(ResolveRetryDelay(mod";
Debug.ShouldStop(16);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setretryinterval" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_resolveretrydelay" /*RemoteObject*/ ,(Object)(_mode),(Object)(_delayms),(Object)(_localretrymax),(Object)(_serverretrymax),(Object)(_blockedretrydelay))));
 BA.debugLineNum = 262;BA.debugLine="If stateStore.IsPlaybackStarted = False Or stateS";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isplaybackstarted" /*RemoteObject*/ ),playbackdatacoordinator.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isstoppedbyuser" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 263;BA.debugLine="If stateStore.IsPlaybackPausedByPolicy And mode <";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_isplaybackpausedbypolicy" /*RemoteObject*/ )) && RemoteObject.solveBoolean("!",_mode,BA.ObjectToString("blocked")) && RemoteObject.solveBoolean("!",_mode,BA.ObjectToString("audio_device"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 264;BA.debugLine="stateStore.TraceWarn(\"network\", \"переход в retry\"";
Debug.ShouldStop(128);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracewarn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("переход в retry")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("mode="),_mode,RemoteObject.createImmutable(" delaySec="),playbackdatacoordinator.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_getretryinterval" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/",0, 0))))));
 BA.debugLineNum = 265;BA.debugLine="stateStore.WriteHealthSnapshot(\"retry\")";
Debug.ShouldStop(256);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_writehealthsnapshot" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("retry")));
 BA.debugLineNum = 266;BA.debugLine="stateStore.EnableRetryTimer";
Debug.ShouldStop(512);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enableretrytimer" /*RemoteObject*/ );
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopformissingdata(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("StopForMissingData (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("stopformissingdata")) { return __ref.runUserSub(false, "playbackdatacoordinator","stopformissingdata", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 174;BA.debugLine="Public Sub StopForMissingData(text As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="stateStore.TraceLog(\"состояние stop reason=missin";
Debug.ShouldStop(16384);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("состояние stop reason=missing_data text="),_text)));
 BA.debugLineNum = 176;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"missing_";
Debug.ShouldStop(32768);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplaybackflowstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idle")),(Object)(RemoteObject.createImmutable("missing_data")));
 BA.debugLineNum = 177;BA.debugLine="stateStore.ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(65536);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearpolicypauseandresumerequest" /*RemoteObject*/ );
 BA.debugLineNum = 178;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
Debug.ShouldStop(131072);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 179;BA.debugLine="stateStore.ClearPlaybackState";
Debug.ShouldStop(262144);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="stateStore.HidePin";
Debug.ShouldStop(524288);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 181;BA.debugLine="stateStore.EnterUserStoppedState";
Debug.ShouldStop(1048576);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enteruserstoppedstate" /*RemoteObject*/ );
 BA.debugLineNum = 182;BA.debugLine="stateStore.SetPlayIcon";
Debug.ShouldStop(2097152);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 183;BA.debugLine="stateStore.ShowMessage(text)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_showmessage" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switchtolocalplayback(RemoteObject __ref,RemoteObject _markdegraded,RemoteObject _reason) throws Exception{
try {
		Debug.PushSubsStack("SwitchToLocalPlayback (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("switchtolocalplayback")) { return __ref.runUserSub(false, "playbackdatacoordinator","switchtolocalplayback", __ref, _markdegraded, _reason);}
Debug.locals.put("markDegraded", _markdegraded);
Debug.locals.put("reason", _reason);
 BA.debugLineNum = 187;BA.debugLine="Public Sub SwitchToLocalPlayback(markDegraded As B";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="stateStore.TraceLog(\"fallback activate mode=local";
Debug.ShouldStop(134217728);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("fallback activate mode=local reason="),_reason,RemoteObject.createImmutable(" degraded="),_markdegraded)));
 BA.debugLineNum = 189;BA.debugLine="stateStore.SetPlaybackFlowState(\"idle\", \"switch_l";
Debug.ShouldStop(268435456);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setplaybackflowstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("idle")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("switch_local:"),_reason)));
 BA.debugLineNum = 190;BA.debugLine="stateStore.EnterLocalPlayback";
Debug.ShouldStop(536870912);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_enterlocalplayback" /*RemoteObject*/ );
 BA.debugLineNum = 191;BA.debugLine="stateStore.SetMediaPathDegraded(markDegraded)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_setmediapathdegraded" /*RemoteObject*/ ,(Object)(_markdegraded));
 BA.debugLineNum = 192;BA.debugLine="stateStore.RequestSkipQueueSnapshotRestore(\"switc";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_requestskipqueuesnapshotrestore" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("switch_local:"),_reason)));
 BA.debugLineNum = 193;BA.debugLine="stateStore.RefreshConnectionIndicatorState";
Debug.ShouldStop(1);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 194;BA.debugLine="stateStore.ClearPlaybackState";
Debug.ShouldStop(2);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="stateStore.HidePin";
Debug.ShouldStop(4);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_hidepin" /*RemoteObject*/ );
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
public static RemoteObject  _updatetrustedonlinetimefromdata(RemoteObject __ref,RemoteObject _data,RemoteObject _storage,RemoteObject _storagekey) throws Exception{
try {
		Debug.PushSubsStack("UpdateTrustedOnlineTimeFromData (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("updatetrustedonlinetimefromdata")) { return __ref.runUserSub(false, "playbackdatacoordinator","updatetrustedonlinetimefromdata", __ref, _data, _storage, _storagekey);}
RemoteObject _candidateticks = RemoteObject.createImmutable(0L);
Debug.locals.put("data", _data);
Debug.locals.put("storage", _storage);
Debug.locals.put("storageKey", _storagekey);
 BA.debugLineNum = 55;BA.debugLine="Public Sub UpdateTrustedOnlineTimeFromData(data As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
Debug.ShouldStop(8388608);
_candidateticks = __ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_parsetrustedonlineticks" /*RemoteObject*/ ,(Object)(_data));Debug.locals.put("candidateTicks", _candidateticks);Debug.locals.put("candidateTicks", _candidateticks);
 BA.debugLineNum = 57;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("k",_candidateticks,BA.numberCast(long.class, 0))) { 
_candidateticks = playbackdatacoordinator.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("candidateTicks", _candidateticks);};
 BA.debugLineNum = 58;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks, stor";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.playbackdatacoordinator.class, "_updatetrustedonlinetimeticks" /*RemoteObject*/ ,(Object)(_candidateticks),(Object)(_storage),(Object)(_storagekey));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetrustedonlinetimeticks(RemoteObject __ref,RemoteObject _candidateticks,RemoteObject _storage,RemoteObject _storagekey) throws Exception{
try {
		Debug.PushSubsStack("UpdateTrustedOnlineTimeTicks (playbackdatacoordinator) ","playbackdatacoordinator",6,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("updatetrustedonlinetimeticks")) { return __ref.runUserSub(false, "playbackdatacoordinator","updatetrustedonlinetimeticks", __ref, _candidateticks, _storage, _storagekey);}
RemoteObject _storedticks = RemoteObject.createImmutable(0L);
Debug.locals.put("candidateTicks", _candidateticks);
Debug.locals.put("storage", _storage);
Debug.locals.put("storageKey", _storagekey);
 BA.debugLineNum = 61;BA.debugLine="Public Sub UpdateTrustedOnlineTimeTicks(candidateT";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="If candidateTicks <= 0 Then Return";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("k",_candidateticks,BA.numberCast(long.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 63;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(stor";
Debug.ShouldStop(1073741824);
_storedticks = BA.numberCast(long.class, _storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(_storagekey),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("storedTicks", _storedticks);Debug.locals.put("storedTicks", _storedticks);
 BA.debugLineNum = 64;BA.debugLine="If candidateTicks <= storedTicks Then Return";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",_candidateticks,_storedticks)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 65;BA.debugLine="storage.Put(storageKey, candidateTicks)";
Debug.ShouldStop(1);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_storagekey),(Object)((_candidateticks)));
 BA.debugLineNum = 66;BA.debugLine="stateStore.TraceLog(\"trusted time update ticks=\"";
Debug.ShouldStop(2);
__ref.getField(false,"_statestore" /*RemoteObject*/ ).runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("trusted time update ticks="),_candidateticks)));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}