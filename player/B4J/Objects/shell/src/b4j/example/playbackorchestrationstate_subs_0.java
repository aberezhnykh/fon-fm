package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackorchestrationstate_subs_0 {


public static RemoteObject  _begindispatch(RemoteObject __ref,RemoteObject _initiator) throws Exception{
try {
		Debug.PushSubsStack("BeginDispatch (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("begindispatch")) { return __ref.runUserSub(false, "playbackorchestrationstate","begindispatch", __ref, _initiator);}
Debug.locals.put("initiator", _initiator);
 BA.debugLineNum = 82;BA.debugLine="Public Sub BeginDispatch(initiator As String) As B";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="If IsPlaybackDispatchInProgress Then Return False";
Debug.ShouldStop(262144);
if (__ref.getField(true,"_isplaybackdispatchinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackorchestrationstate.__c.getField(true,"False");};
 BA.debugLineNum = 84;BA.debugLine="IsPlaybackDispatchInProgress = True";
Debug.ShouldStop(524288);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="ActiveDispatchInitiator = initiator";
Debug.ShouldStop(1048576);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,_initiator);
 BA.debugLineNum = 86;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return playbackorchestrationstate.__c.getField(true,"True");
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _beginqueuebackfill(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BeginQueueBackfill (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("beginqueuebackfill")) { return __ref.runUserSub(false, "playbackorchestrationstate","beginqueuebackfill", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub BeginQueueBackfill As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="If IsQueueBackfillInProgress Then Return False";
Debug.ShouldStop(256);
if (__ref.getField(true,"_isqueuebackfillinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackorchestrationstate.__c.getField(true,"False");};
 BA.debugLineNum = 74;BA.debugLine="IsQueueBackfillInProgress = True";
Debug.ShouldStop(512);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 75;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return playbackorchestrationstate.__c.getField(true,"True");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public IsStarted As Boolean";
playbackorchestrationstate._isstarted = RemoteObject.createImmutable(false);__ref.setField("_isstarted",playbackorchestrationstate._isstarted);
 //BA.debugLineNum = 4;BA.debugLine="Public IsStoppedByUser As Boolean";
playbackorchestrationstate._isstoppedbyuser = RemoteObject.createImmutable(false);__ref.setField("_isstoppedbyuser",playbackorchestrationstate._isstoppedbyuser);
 //BA.debugLineNum = 5;BA.debugLine="Public IsStopping As Boolean";
playbackorchestrationstate._isstopping = RemoteObject.createImmutable(false);__ref.setField("_isstopping",playbackorchestrationstate._isstopping);
 //BA.debugLineNum = 6;BA.debugLine="Public PrefetchDone As Boolean";
playbackorchestrationstate._prefetchdone = RemoteObject.createImmutable(false);__ref.setField("_prefetchdone",playbackorchestrationstate._prefetchdone);
 //BA.debugLineNum = 7;BA.debugLine="Public IsCrossfadeTriggered As Boolean";
playbackorchestrationstate._iscrossfadetriggered = RemoteObject.createImmutable(false);__ref.setField("_iscrossfadetriggered",playbackorchestrationstate._iscrossfadetriggered);
 //BA.debugLineNum = 8;BA.debugLine="Public IsQueueBackfillInProgress As Boolean";
playbackorchestrationstate._isqueuebackfillinprogress = RemoteObject.createImmutable(false);__ref.setField("_isqueuebackfillinprogress",playbackorchestrationstate._isqueuebackfillinprogress);
 //BA.debugLineNum = 9;BA.debugLine="Public IsPlaybackDispatchInProgress As Boolean";
playbackorchestrationstate._isplaybackdispatchinprogress = RemoteObject.createImmutable(false);__ref.setField("_isplaybackdispatchinprogress",playbackorchestrationstate._isplaybackdispatchinprogress);
 //BA.debugLineNum = 10;BA.debugLine="Public ActiveDispatchInitiator As String";
playbackorchestrationstate._activedispatchinitiator = RemoteObject.createImmutable("");__ref.setField("_activedispatchinitiator",playbackorchestrationstate._activedispatchinitiator);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleartracktransitionflags(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearTrackTransitionFlags (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("cleartracktransitionflags")) { return __ref.runUserSub(false, "playbackorchestrationstate","cleartracktransitionflags", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub ClearTrackTransitionFlags";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="PrefetchDone = False";
Debug.ShouldStop(16);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="IsCrossfadeTriggered = False";
Debug.ShouldStop(32);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
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
public static RemoteObject  _enddispatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndDispatch (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("enddispatch")) { return __ref.runUserSub(false, "playbackorchestrationstate","enddispatch", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Public Sub EndDispatch";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="IsPlaybackDispatchInProgress = False";
Debug.ShouldStop(33554432);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="ActiveDispatchInitiator = \"\"";
Debug.ShouldStop(67108864);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endqueuebackfill(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndQueueBackfill (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("endqueuebackfill")) { return __ref.runUserSub(false, "playbackorchestrationstate","endqueuebackfill", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub EndQueueBackfill";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="IsQueueBackfillInProgress = False";
Debug.ShouldStop(16384);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterinternalstoppingstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterInternalStoppingState (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("enterinternalstoppingstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enterinternalstoppingstate", __ref);}
 BA.debugLineNum = 53;BA.debugLine="Public Sub EnterInternalStoppingState";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="IsStopping = True";
Debug.ShouldStop(2097152);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="IsStarted = False";
Debug.ShouldStop(4194304);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterpolicypausedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterPolicyPausedState (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("enterpolicypausedstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enterpolicypausedstate", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub EnterPolicyPausedState";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="IsStarted = False";
Debug.ShouldStop(67108864);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="IsStoppedByUser = False";
Debug.ShouldStop(134217728);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="IsStopping = False";
Debug.ShouldStop(268435456);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterstartedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterStartedState (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("enterstartedstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enterstartedstate", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Public Sub EnterStartedState";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="IsStarted = True";
Debug.ShouldStop(512);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="IsStoppedByUser = False";
Debug.ShouldStop(1024);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="IsStopping = False";
Debug.ShouldStop(2048);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enteruserstoppedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterUserStoppedState (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("enteruserstoppedstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enteruserstoppedstate", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub EnterUserStoppedState";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="IsStarted = False";
Debug.ShouldStop(32768);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="IsStoppedByUser = True";
Debug.ShouldStop(65536);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="IsStopping = False";
Debug.ShouldStop(131072);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exitstoppingstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExitStoppingState (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("exitstoppingstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","exitstoppingstate", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Public Sub ExitStoppingState";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="IsStopping = False";
Debug.ShouldStop(1);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackorchestrationstate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="ResetToStopped";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playbackorchestrationstate.class, "_resettostopped" /*RemoteObject*/ );
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isplaybackactive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPlaybackActive (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("isplaybackactive")) { return __ref.runUserSub(false, "playbackorchestrationstate","isplaybackactive", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub IsPlaybackActive As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Return IsStarted And IsStoppedByUser = False And";
Debug.ShouldStop(16);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(true,"_isstarted" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ),playbackorchestrationstate.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_isstopping" /*RemoteObject*/ ),playbackorchestrationstate.__c.getField(true,"False")));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resettostopped(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetToStopped (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("resettostopped")) { return __ref.runUserSub(false, "playbackorchestrationstate","resettostopped", __ref);}
 BA.debugLineNum = 17;BA.debugLine="Public Sub ResetToStopped";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="IsStarted = False";
Debug.ShouldStop(131072);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 19;BA.debugLine="IsStoppedByUser = True";
Debug.ShouldStop(262144);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 20;BA.debugLine="IsStopping = False";
Debug.ShouldStop(524288);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="PrefetchDone = False";
Debug.ShouldStop(1048576);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="IsCrossfadeTriggered = False";
Debug.ShouldStop(2097152);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 23;BA.debugLine="IsQueueBackfillInProgress = False";
Debug.ShouldStop(4194304);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="IsPlaybackDispatchInProgress = False";
Debug.ShouldStop(8388608);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="ActiveDispatchInitiator = \"\"";
Debug.ShouldStop(16777216);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resettransientflags(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetTransientFlags (playbackorchestrationstate) ","playbackorchestrationstate",11,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("resettransientflags")) { return __ref.runUserSub(false, "playbackorchestrationstate","resettransientflags", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub ResetTransientFlags";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="PrefetchDone = False";
Debug.ShouldStop(268435456);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="IsCrossfadeTriggered = False";
Debug.ShouldStop(536870912);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="IsQueueBackfillInProgress = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="IsPlaybackDispatchInProgress = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 33;BA.debugLine="ActiveDispatchInitiator = \"\"";
Debug.ShouldStop(1);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}