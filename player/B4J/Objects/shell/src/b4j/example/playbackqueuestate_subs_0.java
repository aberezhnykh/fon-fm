package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackqueuestate_subs_0 {


public static RemoteObject  _canrestorestoppedreserve(RemoteObject __ref,RemoteObject _currentsignature) throws Exception{
try {
		Debug.PushSubsStack("CanRestoreStoppedReserve (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("canrestorestoppedreserve")) { return __ref.runUserSub(false, "playbackqueuestate","canrestorestoppedreserve", __ref, _currentsignature);}
Debug.locals.put("currentSignature", _currentsignature);
 BA.debugLineNum = 53;BA.debugLine="Public Sub CanRestoreStoppedReserve(currentSignatu";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If StoppedReserveQueue.IsInitialized = False Or S";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playbackqueuestate.__c.getField(true,"False");};
 BA.debugLineNum = 55;BA.debugLine="If currentSignature = \"\" Then Return False";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_currentsignature,BA.ObjectToString(""))) { 
if (true) return playbackqueuestate.__c.getField(true,"False");};
 BA.debugLineNum = 56;BA.debugLine="Return StoppedReserveSignature = currentSignature";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_stoppedreservesignature" /*RemoteObject*/ ),_currentsignature));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _capturestoppedreserve(RemoteObject __ref,RemoteObject _sourcequeue,RemoteObject _signature) throws Exception{
try {
		Debug.PushSubsStack("CaptureStoppedReserve (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("capturestoppedreserve")) { return __ref.runUserSub(false, "playbackqueuestate","capturestoppedreserve", __ref, _sourcequeue, _signature);}
RemoteObject _itemobject = RemoteObject.declareNull("Object");
Debug.locals.put("sourceQueue", _sourcequeue);
Debug.locals.put("signature", _signature);
 BA.debugLineNum = 40;BA.debugLine="Public Sub CaptureStoppedReserve(sourceQueue As Li";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="ClearStoppedReserve";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_clearstoppedreserve" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="If sourceQueue.IsInitialized = False Or sourceQue";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_sourcequeue.runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_sourcequeue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 43;BA.debugLine="If signature = \"\" Then Return";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_signature,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 44;BA.debugLine="For Each itemObject As Object In sourceQueue";
Debug.ShouldStop(2048);
{
final RemoteObject group4 = _sourcequeue;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_itemobject = group4.runMethod(false,"Get",index4);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 45;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 46;BA.debugLine="StoppedReserveQueue.Add(CloneStateMap(itemObjec";
Debug.ShouldStop(8192);
__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_clonestatemap" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject)).getObject())));
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 49;BA.debugLine="If StoppedReserveQueue.Size = 0 Then Return";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 50;BA.debugLine="StoppedReserveSignature = signature";
Debug.ShouldStop(131072);
__ref.setField ("_stoppedreservesignature" /*RemoteObject*/ ,_signature);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ScheduledBreakAt As Long";
playbackqueuestate._scheduledbreakat = RemoteObject.createImmutable(0L);__ref.setField("_scheduledbreakat",playbackqueuestate._scheduledbreakat);
 //BA.debugLineNum = 4;BA.debugLine="Public SkipQueueSnapshotRestoreOnce As Boolean";
playbackqueuestate._skipqueuesnapshotrestoreonce = RemoteObject.createImmutable(false);__ref.setField("_skipqueuesnapshotrestoreonce",playbackqueuestate._skipqueuesnapshotrestoreonce);
 //BA.debugLineNum = 5;BA.debugLine="Public StoppedReserveQueue As List";
playbackqueuestate._stoppedreservequeue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_stoppedreservequeue",playbackqueuestate._stoppedreservequeue);
 //BA.debugLineNum = 6;BA.debugLine="Public StoppedReserveSignature As String";
playbackqueuestate._stoppedreservesignature = RemoteObject.createImmutable("");__ref.setField("_stoppedreservesignature",playbackqueuestate._stoppedreservesignature);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearexactbreakstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearExactBreakState (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("clearexactbreakstate")) { return __ref.runUserSub(false, "playbackqueuestate","clearexactbreakstate", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Public Sub ClearExactBreakState";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="ScheduledBreakAt = -1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,BA.numberCast(long.class, -(double) (0 + 1)));
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
public static RemoteObject  _clearqueuesnapshot(RemoteObject __ref,RemoteObject _storage) throws Exception{
try {
		Debug.PushSubsStack("ClearQueueSnapshot (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("clearqueuesnapshot")) { return __ref.runUserSub(false, "playbackqueuestate","clearqueuesnapshot", __ref, _storage);}
Debug.locals.put("storage", _storage);
 BA.debugLineNum = 104;BA.debugLine="Public Sub ClearQueueSnapshot(storage As KeyValueS";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="storage.Put(\"queue_snapshot_tracks\", CreateInitia";
Debug.ShouldStop(256);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_tracks")),(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 106;BA.debugLine="storage.Put(\"queue_snapshot_saved_at\", 0)";
Debug.ShouldStop(512);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_saved_at")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 107;BA.debugLine="storage.Put(\"queue_snapshot_signature\", \"\")";
Debug.ShouldStop(1024);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_signature")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 108;BA.debugLine="storage.Put(\"download_plan_tracks\", CreateInitial";
Debug.ShouldStop(2048);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download_plan_tracks")),(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 109;BA.debugLine="storage.Put(\"download_plan_saved_at\", 0)";
Debug.ShouldStop(4096);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download_plan_saved_at")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 110;BA.debugLine="storage.Put(\"download_plan_signature\", \"\")";
Debug.ShouldStop(8192);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download_plan_signature")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearqueuesnapshotskip(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearQueueSnapshotSkip (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("clearqueuesnapshotskip")) { return __ref.runUserSub(false, "playbackqueuestate","clearqueuesnapshotskip", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Public Sub ClearQueueSnapshotSkip";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="SkipQueueSnapshotRestoreOnce = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_skipqueuesnapshotrestoreonce" /*RemoteObject*/ ,playbackqueuestate.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearstoppedreserve(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearStoppedReserve (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("clearstoppedreserve")) { return __ref.runUserSub(false, "playbackqueuestate","clearstoppedreserve", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub ClearStoppedReserve";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If StoppedReserveQueue.IsInitialized = False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False"))) { 
__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 36;BA.debugLine="StoppedReserveQueue.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 37;BA.debugLine="StoppedReserveSignature = \"\"";
Debug.ShouldStop(16);
__ref.setField ("_stoppedreservesignature" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _clonestatemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneStateMap (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("clonestatemap")) { return __ref.runUserSub(false, "playbackqueuestate","clonestatemap", __ref, _source);}
RemoteObject _cloned = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 147;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Dim cloned As Map";
Debug.ShouldStop(524288);
_cloned = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cloned", _cloned);
 BA.debugLineNum = 149;BA.debugLine="cloned.Initialize";
Debug.ShouldStop(1048576);
_cloned.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="If source.IsInitialized = False Then Return clone";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False"))) { 
if (true) return _cloned;};
 BA.debugLineNum = 151;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(4194304);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 152;BA.debugLine="cloned.Put(key, source.Get(key))";
Debug.ShouldStop(8388608);
_cloned.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 154;BA.debugLine="Return cloned";
Debug.ShouldStop(33554432);
if (true) return _cloned;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consumeskipqueuesnapshotrestore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumeSkipQueueSnapshotRestore (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("consumeskipqueuesnapshotrestore")) { return __ref.runUserSub(false, "playbackqueuestate","consumeskipqueuesnapshotrestore", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub ConsumeSkipQueueSnapshotRestore As Bool";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If SkipQueueSnapshotRestoreOnce = False Then Retu";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_skipqueuesnapshotrestoreonce" /*RemoteObject*/ ),playbackqueuestate.__c.getField(true,"False"))) { 
if (true) return playbackqueuestate.__c.getField(true,"False");};
 BA.debugLineNum = 26;BA.debugLine="SkipQueueSnapshotRestoreOnce = False";
Debug.ShouldStop(33554432);
__ref.setField ("_skipqueuesnapshotrestoreonce" /*RemoteObject*/ ,playbackqueuestate.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return playbackqueuestate.__c.getField(true,"True");
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinitializedlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateInitializedList (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("createinitializedlist")) { return __ref.runUserSub(false, "playbackqueuestate","createinitializedlist", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 157;BA.debugLine="Private Sub CreateInitializedList As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Dim items As List";
Debug.ShouldStop(536870912);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 159;BA.debugLine="items.Initialize";
Debug.ShouldStop(1073741824);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 160;BA.debugLine="Return items";
Debug.ShouldStop(-2147483648);
if (true) return _items;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _haspendingexactbreak(RemoteObject __ref,RemoteObject _localnowtimestamp) throws Exception{
try {
		Debug.PushSubsStack("HasPendingExactBreak (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("haspendingexactbreak")) { return __ref.runUserSub(false, "playbackqueuestate","haspendingexactbreak", __ref, _localnowtimestamp);}
Debug.locals.put("localNowTimestamp", _localnowtimestamp);
 BA.debugLineNum = 131;BA.debugLine="Public Sub HasPendingExactBreak(localNowTimestamp";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Return ScheduledBreakAt > localNowTimestamp";
Debug.ShouldStop(8);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),_localnowtimestamp));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackqueuestate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Reset";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _limitremainbybreak(RemoteObject __ref,RemoteObject _trackremain,RemoteObject _localnowtimestamp) throws Exception{
try {
		Debug.PushSubsStack("LimitRemainByBreak (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("limitremainbybreak")) { return __ref.runUserSub(false, "playbackqueuestate","limitremainbybreak", __ref, _trackremain, _localnowtimestamp);}
RemoteObject _breakremain = RemoteObject.createImmutable(0L);
Debug.locals.put("trackRemain", _trackremain);
Debug.locals.put("localNowTimestamp", _localnowtimestamp);
 BA.debugLineNum = 140;BA.debugLine="Public Sub LimitRemainByBreak(trackRemain As Long,";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="If ScheduledBreakAt <= 0 Then Return trackRemain";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return _trackremain;};
 BA.debugLineNum = 142;BA.debugLine="Dim breakRemain As Long = (ScheduledBreakAt - loc";
Debug.ShouldStop(8192);
_breakremain = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),_localnowtimestamp}, "-",1, 2)),RemoteObject.createImmutable(1000)}, "*",0, 2);Debug.locals.put("breakRemain", _breakremain);Debug.locals.put("breakRemain", _breakremain);
 BA.debugLineNum = 143;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("k",_trackremain,BA.numberCast(long.class, 0))) { 
if (true) return _breakremain;};
 BA.debugLineNum = 144;BA.debugLine="Return Min(trackRemain, breakRemain)";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(long.class, playbackqueuestate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _trackremain)),(Object)(BA.numberCast(double.class, _breakremain))));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _movestoppedreservetoqueue(RemoteObject __ref,RemoteObject _targetqueue) throws Exception{
try {
		Debug.PushSubsStack("MoveStoppedReserveToQueue (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("movestoppedreservetoqueue")) { return __ref.runUserSub(false, "playbackqueuestate","movestoppedreservetoqueue", __ref, _targetqueue);}
RemoteObject _restoredcount = RemoteObject.createImmutable(0);
RemoteObject _itemobject = RemoteObject.declareNull("Object");
Debug.locals.put("targetQueue", _targetqueue);
 BA.debugLineNum = 59;BA.debugLine="Public Sub MoveStoppedReserveToQueue(targetQueue A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="If targetQueue.IsInitialized = False Then targetQ";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_targetqueue.runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False"))) { 
_targetqueue.runVoidMethod ("Initialize");};
 BA.debugLineNum = 61;BA.debugLine="targetQueue.Clear";
Debug.ShouldStop(268435456);
_targetqueue.runVoidMethod ("Clear");
 BA.debugLineNum = 62;BA.debugLine="Dim restoredCount As Int = 0";
Debug.ShouldStop(536870912);
_restoredcount = BA.numberCast(int.class, 0);Debug.locals.put("restoredCount", _restoredcount);Debug.locals.put("restoredCount", _restoredcount);
 BA.debugLineNum = 63;BA.debugLine="For Each itemObject As Object In StoppedReserveQu";
Debug.ShouldStop(1073741824);
{
final RemoteObject group4 = __ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_itemobject = group4.runMethod(false,"Get",index4);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 64;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 65;BA.debugLine="targetQueue.Add(CloneStateMap(itemObject))";
Debug.ShouldStop(1);
_targetqueue.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_clonestatemap" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject)).getObject())));
 BA.debugLineNum = 66;BA.debugLine="restoredCount = restoredCount + 1";
Debug.ShouldStop(2);
_restoredcount = RemoteObject.solve(new RemoteObject[] {_restoredcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("restoredCount", _restoredcount);
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 69;BA.debugLine="ClearStoppedReserve";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_clearstoppedreserve" /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="Return restoredCount";
Debug.ShouldStop(32);
if (true) return _restoredcount;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requestskipqueuesnapshotrestore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RequestSkipQueueSnapshotRestore (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("requestskipqueuesnapshotrestore")) { return __ref.runUserSub(false, "playbackqueuestate","requestskipqueuesnapshotrestore", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Public Sub RequestSkipQueueSnapshotRestore";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="SkipQueueSnapshotRestoreOnce = True";
Debug.ShouldStop(1048576);
__ref.setField ("_skipqueuesnapshotrestoreonce" /*RemoteObject*/ ,playbackqueuestate.__c.getField(true,"True"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackqueuestate","reset", __ref);}
 BA.debugLineNum = 13;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="ScheduledBreakAt = -1";
Debug.ShouldStop(8192);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,BA.numberCast(long.class, -(double) (0 + 1)));
 BA.debugLineNum = 15;BA.debugLine="SkipQueueSnapshotRestoreOnce = False";
Debug.ShouldStop(16384);
__ref.setField ("_skipqueuesnapshotrestoreonce" /*RemoteObject*/ ,playbackqueuestate.__c.getField(true,"False"));
 BA.debugLineNum = 16;BA.debugLine="StoppedReserveQueue.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="StoppedReserveSignature = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_stoppedreservesignature" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _resolvescheduledbreakat(RemoteObject __ref,RemoteObject _queue) throws Exception{
try {
		Debug.PushSubsStack("ResolveScheduledBreakAt (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("resolvescheduledbreakat")) { return __ref.runUserSub(false, "playbackqueuestate","resolvescheduledbreakat", __ref, _queue);}
RemoteObject _itemobj = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("queue", _queue);
 BA.debugLineNum = 113;BA.debugLine="Public Sub ResolveScheduledBreakAt(queue As List)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="ScheduledBreakAt = -1";
Debug.ShouldStop(131072);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,BA.numberCast(long.class, -(double) (0 + 1)));
 BA.debugLineNum = 115;BA.debugLine="If queue.IsInitialized = False Then Return";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_queue.runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 116;BA.debugLine="For Each itemObj As Object In queue";
Debug.ShouldStop(524288);
{
final RemoteObject group3 = _queue;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobj = group3.runMethod(false,"Get",index3);Debug.locals.put("itemObj", _itemobj);
Debug.locals.put("itemObj", _itemobj);
 BA.debugLineNum = 117;BA.debugLine="If itemObj Is Map Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("i",_itemobj, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 118;BA.debugLine="Dim item As Map = itemObj";
Debug.ShouldStop(2097152);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobj);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 119;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("break"))) && RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("exactly"))),(Object)((playbackqueuestate.__c.getField(true,"False")))),(playbackqueuestate.__c.getField(true,"True"))) && RemoteObject.solveBoolean(".",_item.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("at")))))) { 
 BA.debugLineNum = 120;BA.debugLine="ScheduledBreakAt = ToLongDefault(item.Get(\"at\"";
Debug.ShouldStop(8388608);
__ref.setField ("_scheduledbreakat" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_tolongdefault" /*RemoteObject*/ ,(Object)(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("at"))))),(Object)(BA.numberCast(long.class, -(double) (0 + 1)))));
 BA.debugLineNum = 121;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 };
 }
}Debug.locals.put("itemObj", _itemobj);
;
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _restorequeuesnapshot(RemoteObject __ref,RemoteObject _storage) throws Exception{
try {
		Debug.PushSubsStack("RestoreQueueSnapshot (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("restorequeuesnapshot")) { return __ref.runUserSub(false, "playbackqueuestate","restorequeuesnapshot", __ref, _storage);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("storage", _storage);
 BA.debugLineNum = 89;BA.debugLine="Public Sub RestoreQueueSnapshot(storage As KeyValu";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim result As Map";
Debug.ShouldStop(33554432);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 91;BA.debugLine="result.Initialize";
Debug.ShouldStop(67108864);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="result.Put(\"signature\", storage.GetDefault(\"queue";
Debug.ShouldStop(134217728);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("signature"))),(Object)(_storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_signature")),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 93;BA.debugLine="result.Put(\"tracks\", storage.GetDefault(\"queue_sn";
Debug.ShouldStop(268435456);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(_storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_tracks")),(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 94;BA.debugLine="If result.Get(\"signature\") = \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("signature")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 95;BA.debugLine="result.Put(\"signature\", storage.GetDefault(\"down";
Debug.ShouldStop(1073741824);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("signature"))),(Object)(_storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download_plan_signature")),(Object)((RemoteObject.createImmutable(""))))));
 };
 BA.debugLineNum = 97;BA.debugLine="Dim tracks As List = result.Get(\"tracks\")";
Debug.ShouldStop(1);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_tracks = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _result.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tracks")))));Debug.locals.put("tracks", _tracks);Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 98;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_tracks.runMethod(true,"IsInitialized"),playbackqueuestate.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_tracks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 99;BA.debugLine="result.Put(\"tracks\", storage.GetDefault(\"downloa";
Debug.ShouldStop(4);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tracks"))),(Object)(_storage.runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download_plan_tracks")),(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_createinitializedlist" /*RemoteObject*/ ).getObject())))));
 };
 BA.debugLineNum = 101;BA.debugLine="Return result";
Debug.ShouldStop(16);
if (true) return _result;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savequeuesnapshot(RemoteObject __ref,RemoteObject _storage,RemoteObject _signature,RemoteObject _queue,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("SaveQueueSnapshot (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("savequeuesnapshot")) { return __ref.runUserSub(false, "playbackqueuestate","savequeuesnapshot", __ref, _storage, _signature, _queue, _limit);}
RemoteObject _tracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemobject = RemoteObject.declareNull("Object");
Debug.locals.put("storage", _storage);
Debug.locals.put("signature", _signature);
Debug.locals.put("queue", _queue);
Debug.locals.put("limit", _limit);
 BA.debugLineNum = 73;BA.debugLine="Public Sub SaveQueueSnapshot(storage As KeyValueSt";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim tracks As List";
Debug.ShouldStop(512);
_tracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tracks", _tracks);
 BA.debugLineNum = 75;BA.debugLine="tracks.Initialize";
Debug.ShouldStop(1024);
_tracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="If queue.IsInitialized Then";
Debug.ShouldStop(2048);
if (_queue.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 77;BA.debugLine="For Each itemObject As Object In queue";
Debug.ShouldStop(4096);
{
final RemoteObject group4 = _queue;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_itemobject = group4.runMethod(false,"Get",index4);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 78;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 79;BA.debugLine="tracks.Add(CloneStateMap(itemObject))";
Debug.ShouldStop(16384);
_tracks.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playbackqueuestate.class, "_clonestatemap" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject)).getObject())));
 BA.debugLineNum = 80;BA.debugLine="If limit > 0 And tracks.Size >= limit Then Exi";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_tracks.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 };
 BA.debugLineNum = 84;BA.debugLine="storage.Put(\"queue_snapshot_signature\", signature";
Debug.ShouldStop(524288);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_signature")),(Object)((_signature)));
 BA.debugLineNum = 85;BA.debugLine="storage.Put(\"queue_snapshot_tracks\", tracks)";
Debug.ShouldStop(1048576);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_tracks")),(Object)((_tracks.getObject())));
 BA.debugLineNum = 86;BA.debugLine="storage.Put(\"queue_snapshot_saved_at\", DateTime.N";
Debug.ShouldStop(2097152);
_storage.runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("queue_snapshot_saved_at")),(Object)((playbackqueuestate.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shouldtriggerbreaknow(RemoteObject __ref,RemoteObject _localnowtimestamp) throws Exception{
try {
		Debug.PushSubsStack("ShouldTriggerBreakNow (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("shouldtriggerbreaknow")) { return __ref.runUserSub(false, "playbackqueuestate","shouldtriggerbreaknow", __ref, _localnowtimestamp);}
Debug.locals.put("localNowTimestamp", _localnowtimestamp);
 BA.debugLineNum = 135;BA.debugLine="Public Sub ShouldTriggerBreakNow(localNowTimestamp";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="If ScheduledBreakAt <= 0 Then Return False";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return playbackqueuestate.__c.getField(true,"False");};
 BA.debugLineNum = 137;BA.debugLine="Return localNowTimestamp >= ScheduledBreakAt";
Debug.ShouldStop(256);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_localnowtimestamp,__ref.getField(true,"_scheduledbreakat" /*RemoteObject*/ )));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tolongdefault(RemoteObject __ref,RemoteObject _value,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("ToLongDefault (playbackqueuestate) ","playbackqueuestate",8,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("tolongdefault")) { return __ref.runUserSub(false, "playbackqueuestate","tolongdefault", __ref, _value, _defaultvalue);}
Debug.locals.put("value", _value);
Debug.locals.put("defaultValue", _defaultvalue);
 BA.debugLineNum = 163;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="If value = Null Then Return defaultValue";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("n",_value)) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 165;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 166;BA.debugLine="Return value";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, _value);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 168;BA.debugLine="Return defaultValue";
Debug.ShouldStop(128);
if (true) return _defaultvalue;
 };
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}