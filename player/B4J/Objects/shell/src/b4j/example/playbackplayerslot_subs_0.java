package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackplayerslot_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public SlotId As String";
playbackplayerslot._slotid = RemoteObject.createImmutable("");__ref.setField("_slotid",playbackplayerslot._slotid);
 //BA.debugLineNum = 7;BA.debugLine="Public AudioKey As String";
playbackplayerslot._audiokey = RemoteObject.createImmutable("");__ref.setField("_audiokey",playbackplayerslot._audiokey);
 //BA.debugLineNum = 8;BA.debugLine="Public Role As String";
playbackplayerslot._role = RemoteObject.createImmutable("");__ref.setField("_role",playbackplayerslot._role);
 //BA.debugLineNum = 9;BA.debugLine="Public State As String";
playbackplayerslot._state = RemoteObject.createImmutable("");__ref.setField("_state",playbackplayerslot._state);
 //BA.debugLineNum = 10;BA.debugLine="Public Item As Map";
playbackplayerslot._item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_item",playbackplayerslot._item);
 //BA.debugLineNum = 11;BA.debugLine="Public LastProgressAt As Long";
playbackplayerslot._lastprogressat = RemoteObject.createImmutable(0L);__ref.setField("_lastprogressat",playbackplayerslot._lastprogressat);
 //BA.debugLineNum = 12;BA.debugLine="Public LastStateChangedAt As Long";
playbackplayerslot._laststatechangedat = RemoteObject.createImmutable(0L);__ref.setField("_laststatechangedat",playbackplayerslot._laststatechangedat);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearItem (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("clearitem")) { return __ref.runUserSub(false, "playbackplayerslot","clearitem", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub ClearItem";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Item.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_item" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="LastStateChangedAt = DateTime.Now";
Debug.ShouldStop(2048);
__ref.setField ("_laststatechangedat" /*RemoteObject*/ ,playbackplayerslot.__c.getField(false,"DateTime").runMethod(true,"getNow"));
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
public static RemoteObject  _clonestatemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneStateMap (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("clonestatemap")) { return __ref.runUserSub(false, "playbackplayerslot","clonestatemap", __ref, _source);}
RemoteObject _cloned = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 56;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim cloned As Map";
Debug.ShouldStop(16777216);
_cloned = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cloned", _cloned);
 BA.debugLineNum = 58;BA.debugLine="cloned.Initialize";
Debug.ShouldStop(33554432);
_cloned.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="If source.IsInitialized = False Then Return clone";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),playbackplayerslot.__c.getField(true,"False"))) { 
if (true) return _cloned;};
 BA.debugLineNum = 60;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(134217728);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 61;BA.debugLine="cloned.Put(key, source.Get(key))";
Debug.ShouldStop(268435456);
_cloned.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 63;BA.debugLine="Return cloned";
Debug.ShouldStop(1073741824);
if (true) return _cloned;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasItem (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("hasitem")) { return __ref.runUserSub(false, "playbackplayerslot","hasitem", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub HasItem As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Return Item.IsInitialized And Item.Size > 0";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_item" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_item" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _slotidvalue,RemoteObject _audiokeyvalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackplayerslot","initialize", __ref, _ba, _slotidvalue, _audiokeyvalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("slotIdValue", _slotidvalue);
Debug.locals.put("audioKeyValue", _audiokeyvalue);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(slotIdValue As String, audio";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="SlotId = slotIdValue";
Debug.ShouldStop(32768);
__ref.setField ("_slotid" /*RemoteObject*/ ,_slotidvalue);
 BA.debugLineNum = 17;BA.debugLine="AudioKey = audioKeyValue";
Debug.ShouldStop(65536);
__ref.setField ("_audiokey" /*RemoteObject*/ ,_audiokeyvalue);
 BA.debugLineNum = 18;BA.debugLine="Reset";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.playbackplayerslot.class, "_reset" /*RemoteObject*/ );
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
public static RemoteObject  _markprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MarkProgress (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("markprogress")) { return __ref.runUserSub(false, "playbackplayerslot","markprogress", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Public Sub MarkProgress";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="LastProgressAt = DateTime.Now";
Debug.ShouldStop(65536);
__ref.setField ("_lastprogressat" /*RemoteObject*/ ,playbackplayerslot.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Reset (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackplayerslot","reset", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Role = \"free\"";
Debug.ShouldStop(4194304);
__ref.setField ("_role" /*RemoteObject*/ ,BA.ObjectToString("free"));
 BA.debugLineNum = 24;BA.debugLine="State = \"empty\"";
Debug.ShouldStop(8388608);
__ref.setField ("_state" /*RemoteObject*/ ,BA.ObjectToString("empty"));
 BA.debugLineNum = 25;BA.debugLine="LastProgressAt = 0";
Debug.ShouldStop(16777216);
__ref.setField ("_lastprogressat" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 26;BA.debugLine="LastStateChangedAt = DateTime.Now";
Debug.ShouldStop(33554432);
__ref.setField ("_laststatechangedat" /*RemoteObject*/ ,playbackplayerslot.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 27;BA.debugLine="Item.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_item" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitem(RemoteObject __ref,RemoteObject _sourceitem) throws Exception{
try {
		Debug.PushSubsStack("SetItem (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setitem")) { return __ref.runUserSub(false, "playbackplayerslot","setitem", __ref, _sourceitem);}
Debug.locals.put("sourceItem", _sourceitem);
 BA.debugLineNum = 37;BA.debugLine="Public Sub SetItem(sourceItem As Map)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Item = CloneStateMap(sourceItem)";
Debug.ShouldStop(32);
__ref.setField ("_item" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackplayerslot.class, "_clonestatemap" /*RemoteObject*/ ,(Object)(_sourceitem)));
 BA.debugLineNum = 39;BA.debugLine="LastStateChangedAt = DateTime.Now";
Debug.ShouldStop(64);
__ref.setField ("_laststatechangedat" /*RemoteObject*/ ,playbackplayerslot.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrolestate(RemoteObject __ref,RemoteObject _rolevalue,RemoteObject _statevalue) throws Exception{
try {
		Debug.PushSubsStack("SetRoleState (playbackplayerslot) ","playbackplayerslot",20,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("setrolestate")) { return __ref.runUserSub(false, "playbackplayerslot","setrolestate", __ref, _rolevalue, _statevalue);}
Debug.locals.put("roleValue", _rolevalue);
Debug.locals.put("stateValue", _statevalue);
 BA.debugLineNum = 30;BA.debugLine="Public Sub SetRoleState(roleValue As String, state";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Role = roleValue";
Debug.ShouldStop(1073741824);
__ref.setField ("_role" /*RemoteObject*/ ,_rolevalue);
 BA.debugLineNum = 32;BA.debugLine="State = stateValue";
Debug.ShouldStop(-2147483648);
__ref.setField ("_state" /*RemoteObject*/ ,_statevalue);
 BA.debugLineNum = 33;BA.debugLine="LastStateChangedAt = DateTime.Now";
Debug.ShouldStop(1);
__ref.setField ("_laststatechangedat" /*RemoteObject*/ ,playbackplayerslot.__c.getField(false,"DateTime").runMethod(true,"getNow"));
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