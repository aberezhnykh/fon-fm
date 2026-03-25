package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackorchestrationstate_subs_0 {


public static RemoteObject  _begindispatch(RemoteObject __ref,RemoteObject _initiator) throws Exception{
try {
		Debug.PushSubsStack("BeginDispatch (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("begindispatch")) { return __ref.runUserSub(false, "playbackorchestrationstate","begindispatch", __ref, _initiator);}
Debug.locals.put("initiator", _initiator);
 BA.debugLineNum = 87;BA.debugLine="Public Sub BeginDispatch(initiator As String) As B";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="If IsPlaybackDispatchInProgress Then Return False";
Debug.ShouldStop(8388608);
if (__ref.getField(true,"_isplaybackdispatchinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackorchestrationstate.__c.getField(true,"False");};
 BA.debugLineNum = 89;BA.debugLine="IsPlaybackDispatchInProgress = True";
Debug.ShouldStop(16777216);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="ActiveDispatchInitiator = initiator";
Debug.ShouldStop(33554432);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,_initiator);
 BA.debugLineNum = 91;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return playbackorchestrationstate.__c.getField(true,"True");
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("BeginQueueBackfill (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("beginqueuebackfill")) { return __ref.runUserSub(false, "playbackorchestrationstate","beginqueuebackfill", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub BeginQueueBackfill As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="If IsQueueBackfillInProgress Then Return False";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_isqueuebackfillinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackorchestrationstate.__c.getField(true,"False");};
 BA.debugLineNum = 78;BA.debugLine="IsQueueBackfillInProgress = True";
Debug.ShouldStop(8192);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) return playbackorchestrationstate.__c.getField(true,"True");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
 //BA.debugLineNum = 6;BA.debugLine="Public IsStarted As Boolean";
playbackorchestrationstate._isstarted = RemoteObject.createImmutable(false);__ref.setField("_isstarted",playbackorchestrationstate._isstarted);
 //BA.debugLineNum = 7;BA.debugLine="Public IsStoppedByUser As Boolean";
playbackorchestrationstate._isstoppedbyuser = RemoteObject.createImmutable(false);__ref.setField("_isstoppedbyuser",playbackorchestrationstate._isstoppedbyuser);
 //BA.debugLineNum = 8;BA.debugLine="Public IsStopping As Boolean";
playbackorchestrationstate._isstopping = RemoteObject.createImmutable(false);__ref.setField("_isstopping",playbackorchestrationstate._isstopping);
 //BA.debugLineNum = 9;BA.debugLine="Public PrefetchDone As Boolean";
playbackorchestrationstate._prefetchdone = RemoteObject.createImmutable(false);__ref.setField("_prefetchdone",playbackorchestrationstate._prefetchdone);
 //BA.debugLineNum = 10;BA.debugLine="Public IsCrossfadeTriggered As Boolean";
playbackorchestrationstate._iscrossfadetriggered = RemoteObject.createImmutable(false);__ref.setField("_iscrossfadetriggered",playbackorchestrationstate._iscrossfadetriggered);
 //BA.debugLineNum = 11;BA.debugLine="Public IsQueueBackfillInProgress As Boolean";
playbackorchestrationstate._isqueuebackfillinprogress = RemoteObject.createImmutable(false);__ref.setField("_isqueuebackfillinprogress",playbackorchestrationstate._isqueuebackfillinprogress);
 //BA.debugLineNum = 12;BA.debugLine="Public IsPlaybackDispatchInProgress As Boolean";
playbackorchestrationstate._isplaybackdispatchinprogress = RemoteObject.createImmutable(false);__ref.setField("_isplaybackdispatchinprogress",playbackorchestrationstate._isplaybackdispatchinprogress);
 //BA.debugLineNum = 13;BA.debugLine="Public ActiveDispatchInitiator As String";
playbackorchestrationstate._activedispatchinitiator = RemoteObject.createImmutable("");__ref.setField("_activedispatchinitiator",playbackorchestrationstate._activedispatchinitiator);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleartracktransitionflags(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearTrackTransitionFlags (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("cleartracktransitionflags")) { return __ref.runUserSub(false, "playbackorchestrationstate","cleartracktransitionflags", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub ClearTrackTransitionFlags";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="PrefetchDone = False";
Debug.ShouldStop(256);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="IsCrossfadeTriggered = False";
Debug.ShouldStop(512);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
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
public static RemoteObject  _enddispatch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndDispatch (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("enddispatch")) { return __ref.runUserSub(false, "playbackorchestrationstate","enddispatch", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Public Sub EndDispatch";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="IsPlaybackDispatchInProgress = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 96;BA.debugLine="ActiveDispatchInitiator = \"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _endqueuebackfill(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndQueueBackfill (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("endqueuebackfill")) { return __ref.runUserSub(false, "playbackorchestrationstate","endqueuebackfill", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Public Sub EndQueueBackfill";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="IsQueueBackfillInProgress = False";
Debug.ShouldStop(262144);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("EnterInternalStoppingState (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("enterinternalstoppingstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enterinternalstoppingstate", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub EnterInternalStoppingState";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="IsStopping = True";
Debug.ShouldStop(33554432);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="IsStarted = False";
Debug.ShouldStop(67108864);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("EnterPolicyPausedState (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("enterpolicypausedstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enterpolicypausedstate", __ref);}
 BA.debugLineNum = 62;BA.debugLine="Public Sub EnterPolicyPausedState";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="IsStarted = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 64;BA.debugLine="IsStoppedByUser = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
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
public static RemoteObject  _enterstartedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterStartedState (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("enterstartedstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enterstartedstate", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub EnterStartedState";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="IsStarted = True";
Debug.ShouldStop(8192);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="IsStoppedByUser = False";
Debug.ShouldStop(16384);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="IsStopping = False";
Debug.ShouldStop(32768);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("EnterUserStoppedState (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("enteruserstoppedstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","enteruserstoppedstate", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub EnterUserStoppedState";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="IsStarted = False";
Debug.ShouldStop(524288);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="IsStoppedByUser = True";
Debug.ShouldStop(1048576);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="IsStopping = False";
Debug.ShouldStop(2097152);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("ExitStoppingState (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("exitstoppingstate")) { return __ref.runUserSub(false, "playbackorchestrationstate","exitstoppingstate", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub ExitStoppingState";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="IsStopping = False";
Debug.ShouldStop(16);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Initialize (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackorchestrationstate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="ResetToStopped";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.playbackorchestrationstate.class, "_resettostopped" /*RemoteObject*/ );
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("IsPlaybackActive (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("isplaybackactive")) { return __ref.runUserSub(false, "playbackorchestrationstate","isplaybackactive", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Public Sub IsPlaybackActive As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Return IsStarted And IsStoppedByUser = False And";
Debug.ShouldStop(256);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(true,"_isstarted" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(true,"_isstoppedbyuser" /*RemoteObject*/ ),playbackorchestrationstate.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_isstopping" /*RemoteObject*/ ),playbackorchestrationstate.__c.getField(true,"False")));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ResetToStopped (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("resettostopped")) { return __ref.runUserSub(false, "playbackorchestrationstate","resettostopped", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Public Sub ResetToStopped";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="IsStarted = False";
Debug.ShouldStop(2097152);
__ref.setField ("_isstarted" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 23;BA.debugLine="IsStoppedByUser = True";
Debug.ShouldStop(4194304);
__ref.setField ("_isstoppedbyuser" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"True"));
 BA.debugLineNum = 24;BA.debugLine="IsStopping = False";
Debug.ShouldStop(8388608);
__ref.setField ("_isstopping" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="PrefetchDone = False";
Debug.ShouldStop(16777216);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="IsCrossfadeTriggered = False";
Debug.ShouldStop(33554432);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="IsQueueBackfillInProgress = False";
Debug.ShouldStop(67108864);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="IsPlaybackDispatchInProgress = False";
Debug.ShouldStop(134217728);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="ActiveDispatchInitiator = \"\"";
Debug.ShouldStop(268435456);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("ResetTransientFlags (playbackorchestrationstate) ","playbackorchestrationstate",19,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("resettransientflags")) { return __ref.runUserSub(false, "playbackorchestrationstate","resettransientflags", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub ResetTransientFlags";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="PrefetchDone = False";
Debug.ShouldStop(1);
__ref.setField ("_prefetchdone" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 34;BA.debugLine="IsCrossfadeTriggered = False";
Debug.ShouldStop(2);
__ref.setField ("_iscrossfadetriggered" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="IsQueueBackfillInProgress = False";
Debug.ShouldStop(4);
__ref.setField ("_isqueuebackfillinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="IsPlaybackDispatchInProgress = False";
Debug.ShouldStop(8);
__ref.setField ("_isplaybackdispatchinprogress" /*RemoteObject*/ ,playbackorchestrationstate.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="ActiveDispatchInitiator = \"\"";
Debug.ShouldStop(16);
__ref.setField ("_activedispatchinitiator" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}