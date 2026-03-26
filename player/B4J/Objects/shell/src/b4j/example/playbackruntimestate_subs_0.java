package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackruntimestate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public ActiveAudioKey As String";
playbackruntimestate._activeaudiokey = RemoteObject.createImmutable("");__ref.setField("_activeaudiokey",playbackruntimestate._activeaudiokey);
 //BA.debugLineNum = 7;BA.debugLine="Public PreparedAudioKey As String";
playbackruntimestate._preparedaudiokey = RemoteObject.createImmutable("");__ref.setField("_preparedaudiokey",playbackruntimestate._preparedaudiokey);
 //BA.debugLineNum = 8;BA.debugLine="Public ActiveItem As Map";
playbackruntimestate._activeitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_activeitem",playbackruntimestate._activeitem);
 //BA.debugLineNum = 9;BA.debugLine="Public PreparedItem As Map";
playbackruntimestate._prepareditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_prepareditem",playbackruntimestate._prepareditem);
 //BA.debugLineNum = 10;BA.debugLine="Public PendingPlayAudioKey As String";
playbackruntimestate._pendingplayaudiokey = RemoteObject.createImmutable("");__ref.setField("_pendingplayaudiokey",playbackruntimestate._pendingplayaudiokey);
 //BA.debugLineNum = 11;BA.debugLine="Public PendingPrepareAudioKey As String";
playbackruntimestate._pendingprepareaudiokey = RemoteObject.createImmutable("");__ref.setField("_pendingprepareaudiokey",playbackruntimestate._pendingprepareaudiokey);
 //BA.debugLineNum = 12;BA.debugLine="Public PendingPlayItem As Map";
playbackruntimestate._pendingplayitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_pendingplayitem",playbackruntimestate._pendingplayitem);
 //BA.debugLineNum = 13;BA.debugLine="Public PendingPrepareItem As Map";
playbackruntimestate._pendingprepareitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_pendingprepareitem",playbackruntimestate._pendingprepareitem);
 //BA.debugLineNum = 14;BA.debugLine="Public PendingPlayFadeInMs As Int";
playbackruntimestate._pendingplayfadeinms = RemoteObject.createImmutable(0);__ref.setField("_pendingplayfadeinms",playbackruntimestate._pendingplayfadeinms);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearpendingplaystate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPendingPlayState (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("clearpendingplaystate")) { return __ref.runUserSub(false, "playbackruntimestate","clearpendingplaystate", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub ClearPendingPlayState";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="PendingPlayAudioKey = \"\"";
Debug.ShouldStop(4);
__ref.setField ("_pendingplayaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 36;BA.debugLine="PendingPlayFadeInMs = 0";
Debug.ShouldStop(8);
__ref.setField ("_pendingplayfadeinms" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 37;BA.debugLine="PendingPlayItem.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_pendingplayitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _clearpendingpreparestate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPendingPrepareState (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("clearpendingpreparestate")) { return __ref.runUserSub(false, "playbackruntimestate","clearpendingpreparestate", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Public Sub ClearPendingPrepareState";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="PendingPrepareAudioKey = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 42;BA.debugLine="PendingPrepareItem.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_pendingprepareitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _clearpreparedifmatchesaudio(RemoteObject __ref,RemoteObject _audiokey) throws Exception{
try {
		Debug.PushSubsStack("ClearPreparedIfMatchesAudio (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("clearpreparedifmatchesaudio")) { return __ref.runUserSub(false, "playbackruntimestate","clearpreparedifmatchesaudio", __ref, _audiokey);}
Debug.locals.put("audioKey", _audiokey);
 BA.debugLineNum = 68;BA.debugLine="Public Sub ClearPreparedIfMatchesAudio(audioKey As";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="If PreparedAudioKey <> audioKey Then Return";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),_audiokey)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 70;BA.debugLine="PreparedAudioKey = \"\"";
Debug.ShouldStop(32);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 71;BA.debugLine="PreparedItem.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("CloneStateMap (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("clonestatemap")) { return __ref.runUserSub(false, "playbackruntimestate","clonestatemap", __ref, _source);}
RemoteObject _cloned = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("source", _source);
 BA.debugLineNum = 82;BA.debugLine="Private Sub CloneStateMap(source As Map) As Map";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Dim cloned As Map";
Debug.ShouldStop(262144);
_cloned = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cloned", _cloned);
 BA.debugLineNum = 84;BA.debugLine="cloned.Initialize";
Debug.ShouldStop(524288);
_cloned.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="If source.IsInitialized = False Then Return clone";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_source.runMethod(true,"IsInitialized"),playbackruntimestate.__c.getField(true,"False"))) { 
if (true) return _cloned;};
 BA.debugLineNum = 86;BA.debugLine="For Each key As Object In source.Keys";
Debug.ShouldStop(2097152);
{
final RemoteObject group4 = _source.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 87;BA.debugLine="cloned.Put(key, source.Get(key))";
Debug.ShouldStop(4194304);
_cloned.runVoidMethod ("Put",(Object)(_key),(Object)(_source.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 89;BA.debugLine="Return cloned";
Debug.ShouldStop(16777216);
if (true) return _cloned;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _haspendingplay(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasPendingPlay (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("haspendingplay")) { return __ref.runUserSub(false, "playbackruntimestate","haspendingplay", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub HasPendingPlay As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Return PendingPlayAudioKey <> \"\" And PendingPlayI";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(true,"_pendingplayaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_pendingplayitem" /*RemoteObject*/ ).runMethod(true,"IsInitialized")));
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
public static RemoteObject  _hasprepared(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasPrepared (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("hasprepared")) { return __ref.runUserSub(false, "playbackruntimestate","hasprepared", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub HasPrepared As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return PreparedAudioKey <> \"\" And PreparedItem.Is";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(true,"_preparedaudiokey" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runMethod(true,"IsInitialized")));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackruntimestate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Reset";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.playbackruntimestate.class, "_reset" /*RemoteObject*/ );
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
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackruntimestate","reset", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="ActiveAudioKey = \"\"";
Debug.ShouldStop(4194304);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 24;BA.debugLine="PreparedAudioKey = \"\"";
Debug.ShouldStop(8388608);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 25;BA.debugLine="PendingPlayAudioKey = \"\"";
Debug.ShouldStop(16777216);
__ref.setField ("_pendingplayaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 26;BA.debugLine="PendingPrepareAudioKey = \"\"";
Debug.ShouldStop(33554432);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 27;BA.debugLine="PendingPlayFadeInMs = 0";
Debug.ShouldStop(67108864);
__ref.setField ("_pendingplayfadeinms" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 28;BA.debugLine="ActiveItem.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_activeitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="PreparedItem.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_prepareditem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="PendingPlayItem.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pendingplayitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="PendingPrepareItem.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pendingprepareitem" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _setactive(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetActive (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setactive")) { return __ref.runUserSub(false, "playbackruntimestate","setactive", __ref, _audiokey, _item);}
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 46;BA.debugLine="Public Sub SetActive(audioKey As String, item As M";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="ActiveAudioKey = audioKey";
Debug.ShouldStop(16384);
__ref.setField ("_activeaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 48;BA.debugLine="ActiveItem = CloneStateMap(item)";
Debug.ShouldStop(32768);
__ref.setField ("_activeitem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackruntimestate.class, "_clonestatemap" /*RemoteObject*/ ,(Object)(_item)));
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
public static RemoteObject  _setpendingplay(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item,RemoteObject _fadeinms) throws Exception{
try {
		Debug.PushSubsStack("SetPendingPlay (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setpendingplay")) { return __ref.runUserSub(false, "playbackruntimestate","setpendingplay", __ref, _audiokey, _item, _fadeinms);}
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
Debug.locals.put("fadeInMs", _fadeinms);
 BA.debugLineNum = 57;BA.debugLine="Public Sub SetPendingPlay(audioKey As String, item";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="PendingPlayAudioKey = audioKey";
Debug.ShouldStop(33554432);
__ref.setField ("_pendingplayaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 59;BA.debugLine="PendingPlayItem = CloneStateMap(item)";
Debug.ShouldStop(67108864);
__ref.setField ("_pendingplayitem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackruntimestate.class, "_clonestatemap" /*RemoteObject*/ ,(Object)(_item)));
 BA.debugLineNum = 60;BA.debugLine="PendingPlayFadeInMs = fadeInMs";
Debug.ShouldStop(134217728);
__ref.setField ("_pendingplayfadeinms" /*RemoteObject*/ ,_fadeinms);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpendingprepare(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetPendingPrepare (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setpendingprepare")) { return __ref.runUserSub(false, "playbackruntimestate","setpendingprepare", __ref, _audiokey, _item);}
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 63;BA.debugLine="Public Sub SetPendingPrepare(audioKey As String, i";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="PendingPrepareAudioKey = audioKey";
Debug.ShouldStop(-2147483648);
__ref.setField ("_pendingprepareaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 65;BA.debugLine="PendingPrepareItem = CloneStateMap(item)";
Debug.ShouldStop(1);
__ref.setField ("_pendingprepareitem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackruntimestate.class, "_clonestatemap" /*RemoteObject*/ ,(Object)(_item)));
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
public static RemoteObject  _setprepared(RemoteObject __ref,RemoteObject _audiokey,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SetPrepared (playbackruntimestate) ","playbackruntimestate",19,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setprepared")) { return __ref.runUserSub(false, "playbackruntimestate","setprepared", __ref, _audiokey, _item);}
Debug.locals.put("audioKey", _audiokey);
Debug.locals.put("item", _item);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SetPrepared(audioKey As String, item As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="PreparedAudioKey = audioKey";
Debug.ShouldStop(1048576);
__ref.setField ("_preparedaudiokey" /*RemoteObject*/ ,_audiokey);
 BA.debugLineNum = 54;BA.debugLine="PreparedItem = CloneStateMap(item)";
Debug.ShouldStop(2097152);
__ref.setField ("_prepareditem" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.playbackruntimestate.class, "_clonestatemap" /*RemoteObject*/ ,(Object)(_item)));
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
}