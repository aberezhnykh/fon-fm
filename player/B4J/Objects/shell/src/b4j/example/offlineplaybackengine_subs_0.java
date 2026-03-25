package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class offlineplaybackengine_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (offlineplaybackengine) ","offlineplaybackengine",9,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "offlineplaybackengine","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveadvancedecision(RemoteObject __ref,RemoteObject _shouldprioritizeservicequeue,RemoteObject _canuseprepareditem,RemoteObject _hasdispatchableserviceitem,RemoteObject _haslocalreserve,RemoteObject _allowload) throws Exception{
try {
		Debug.PushSubsStack("ResolveAdvanceDecision (offlineplaybackengine) ","offlineplaybackengine",9,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("resolveadvancedecision")) { return __ref.runUserSub(false, "offlineplaybackengine","resolveadvancedecision", __ref, _shouldprioritizeservicequeue, _canuseprepareditem, _hasdispatchableserviceitem, _haslocalreserve, _allowload);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("shouldPrioritizeServiceQueue", _shouldprioritizeservicequeue);
Debug.locals.put("canUsePreparedItem", _canuseprepareditem);
Debug.locals.put("hasDispatchableServiceItem", _hasdispatchableserviceitem);
Debug.locals.put("hasLocalReserve", _haslocalreserve);
Debug.locals.put("allowLoad", _allowload);
 BA.debugLineNum = 11;BA.debugLine="Public Sub ResolveAdvanceDecision(shouldPrioritize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Dim result As Map";
Debug.ShouldStop(2048);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 13;BA.debugLine="result.Initialize";
Debug.ShouldStop(4096);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 14;BA.debugLine="result.Put(\"action\", \"\")";
Debug.ShouldStop(8192);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 15;BA.debugLine="If shouldPrioritizeServiceQueue Then";
Debug.ShouldStop(16384);
if (_shouldprioritizeservicequeue.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 16;BA.debugLine="result.Put(\"action\", \"play_queue_item\")";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("play_queue_item"))));
 BA.debugLineNum = 17;BA.debugLine="Return result";
Debug.ShouldStop(65536);
if (true) return _result;
 };
 BA.debugLineNum = 19;BA.debugLine="If canUsePreparedItem Then";
Debug.ShouldStop(262144);
if (_canuseprepareditem.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 20;BA.debugLine="result.Put(\"action\", \"use_prepared\")";
Debug.ShouldStop(524288);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("use_prepared"))));
 BA.debugLineNum = 21;BA.debugLine="Return result";
Debug.ShouldStop(1048576);
if (true) return _result;
 };
 BA.debugLineNum = 23;BA.debugLine="If hasDispatchableServiceItem Then";
Debug.ShouldStop(4194304);
if (_hasdispatchableserviceitem.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 24;BA.debugLine="result.Put(\"action\", \"play_queue_item\")";
Debug.ShouldStop(8388608);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("play_queue_item"))));
 BA.debugLineNum = 25;BA.debugLine="Return result";
Debug.ShouldStop(16777216);
if (true) return _result;
 };
 BA.debugLineNum = 27;BA.debugLine="If hasLocalReserve Then";
Debug.ShouldStop(67108864);
if (_haslocalreserve.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="result.Put(\"action\", \"play_direct_local\")";
Debug.ShouldStop(134217728);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("play_direct_local"))));
 BA.debugLineNum = 29;BA.debugLine="Return result";
Debug.ShouldStop(268435456);
if (true) return _result;
 };
 BA.debugLineNum = 31;BA.debugLine="If allowLoad Then result.Put(\"action\", \"populate_";
Debug.ShouldStop(1073741824);
if (_allowload.<Boolean>get().booleanValue()) { 
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("action"))),(Object)((RemoteObject.createImmutable("populate_queue"))));};
 BA.debugLineNum = 32;BA.debugLine="Return result";
Debug.ShouldStop(-2147483648);
if (true) return _result;
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvenextmusicitem(RemoteObject __ref,RemoteObject _statestore) throws Exception{
try {
		Debug.PushSubsStack("ResolveNextMusicItem (offlineplaybackengine) ","offlineplaybackengine",9,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("resolvenextmusicitem")) { return __ref.runUserSub(false, "offlineplaybackengine","resolvenextmusicitem", __ref, _statestore);}
Debug.locals.put("stateStore", _statestore);
 BA.debugLineNum = 35;BA.debugLine="Public Sub ResolveNextMusicItem(stateStore As Play";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return stateStore.ResolveNextLocalTrackItem";
Debug.ShouldStop(8);
if (true) return _statestore.runClassMethod (b4j.example.playerstatestore.class, "_resolvenextlocaltrackitem" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}