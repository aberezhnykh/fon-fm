package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackmetastate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CurrentMediaUrl As String";
playbackmetastate._currentmediaurl = RemoteObject.createImmutable("");__ref.setField("_currentmediaurl",playbackmetastate._currentmediaurl);
 //BA.debugLineNum = 4;BA.debugLine="Public CurrentMediaType As String";
playbackmetastate._currentmediatype = RemoteObject.createImmutable("");__ref.setField("_currentmediatype",playbackmetastate._currentmediatype);
 //BA.debugLineNum = 5;BA.debugLine="Public PendingHistoryItem As Map";
playbackmetastate._pendinghistoryitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_pendinghistoryitem",playbackmetastate._pendinghistoryitem);
 //BA.debugLineNum = 6;BA.debugLine="Public HistoryStartedAtTicks As Long";
playbackmetastate._historystartedatticks = RemoteObject.createImmutable(0L);__ref.setField("_historystartedatticks",playbackmetastate._historystartedatticks);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearhistorystage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearHistoryStage (playbackmetastate) ","playbackmetastate",11,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("clearhistorystage")) { return __ref.runUserSub(false, "playbackmetastate","clearhistorystage", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Public Sub ClearHistoryStage";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="PendingHistoryItem.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pendinghistoryitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="HistoryStartedAtTicks = 0";
Debug.ShouldStop(-2147483648);
__ref.setField ("_historystartedatticks" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
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
public static RemoteObject  _clonestatemap(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CloneStateMap (playbackmetastate) ","playbackmetastate",11,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("clonestatemap")) { return __ref.runUserSub(false, "playbackmetastate","clonestatemap", __ref, _source);}
RemoteObject _cloned = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 35;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim cloned As Map";
Debug.ShouldStop(8);
_cloned = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cloned", _cloned);
 BA.debugLineNum = 37;BA.debugLine="cloned.Initialize";
Debug.ShouldStop(16);
_cloned.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="If source.IsInitialized = False Then Return clone";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),playbackmetastate.__c.getField(true,"False"))) { 
if (true) return _cloned;};
 BA.debugLineNum = 39;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(64);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 40;BA.debugLine="cloned.Put(key, source.Get(key))";
Debug.ShouldStop(128);
_cloned.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 42;BA.debugLine="Return cloned";
Debug.ShouldStop(512);
if (true) return _cloned;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackmetastate) ","playbackmetastate",11,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackmetastate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Reset";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbackmetastate.class, "_reset" /*RemoteObject*/ );
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
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (playbackmetastate) ","playbackmetastate",11,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackmetastate","reset", __ref);}
 BA.debugLineNum = 13;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="CurrentMediaUrl = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_currentmediaurl" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 15;BA.debugLine="CurrentMediaType = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_currentmediatype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 16;BA.debugLine="HistoryStartedAtTicks = 0";
Debug.ShouldStop(32768);
__ref.setField ("_historystartedatticks" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 17;BA.debugLine="PendingHistoryItem.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_pendinghistoryitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _setcurrentmedia(RemoteObject __ref,RemoteObject _mediaurl,RemoteObject _mediatype) throws Exception{
try {
		Debug.PushSubsStack("SetCurrentMedia (playbackmetastate) ","playbackmetastate",11,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("setcurrentmedia")) { return __ref.runUserSub(false, "playbackmetastate","setcurrentmedia", __ref, _mediaurl, _mediatype);}
Debug.locals.put("mediaUrl", _mediaurl);
Debug.locals.put("mediaType", _mediatype);
 BA.debugLineNum = 20;BA.debugLine="Public Sub SetCurrentMedia(mediaUrl As String, med";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="CurrentMediaUrl = mediaUrl";
Debug.ShouldStop(1048576);
__ref.setField ("_currentmediaurl" /*RemoteObject*/ ,_mediaurl);
 BA.debugLineNum = 22;BA.debugLine="CurrentMediaType = mediaType";
Debug.ShouldStop(2097152);
__ref.setField ("_currentmediatype" /*RemoteObject*/ ,_mediatype);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stagehistoryitem(RemoteObject __ref,RemoteObject _item,RemoteObject _startedatticks) throws Exception{
try {
		Debug.PushSubsStack("StageHistoryItem (playbackmetastate) ","playbackmetastate",11,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("stagehistoryitem")) { return __ref.runUserSub(false, "playbackmetastate","stagehistoryitem", __ref, _item, _startedatticks);}
Debug.locals.put("item", _item);
Debug.locals.put("startedAtTicks", _startedatticks);
 BA.debugLineNum = 25;BA.debugLine="Public Sub StageHistoryItem(item As Map, startedAt";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="PendingHistoryItem = CloneStateMap(item)";
Debug.ShouldStop(33554432);
__ref.setField ("_pendinghistoryitem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackmetastate.class, "_clonestatemap" /*RemoteObject*/ ,(Object)(_item)));
 BA.debugLineNum = 27;BA.debugLine="HistoryStartedAtTicks = startedAtTicks";
Debug.ShouldStop(67108864);
__ref.setField ("_historystartedatticks" /*RemoteObject*/ ,_startedatticks);
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
}