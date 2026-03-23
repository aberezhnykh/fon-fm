package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackretryfallbackstate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public LocalRetryDelay As Int";
playbackretryfallbackstate._localretrydelay = RemoteObject.createImmutable(0);__ref.setField("_localretrydelay",playbackretryfallbackstate._localretrydelay);
 //BA.debugLineNum = 4;BA.debugLine="Public ServerRetryDelay As Int";
playbackretryfallbackstate._serverretrydelay = RemoteObject.createImmutable(0);__ref.setField("_serverretrydelay",playbackretryfallbackstate._serverretrydelay);
 //BA.debugLineNum = 5;BA.debugLine="Public DispatchRetryAfter As Int";
playbackretryfallbackstate._dispatchretryafter = RemoteObject.createImmutable(0);__ref.setField("_dispatchretryafter",playbackretryfallbackstate._dispatchretryafter);
 //BA.debugLineNum = 6;BA.debugLine="Public IsMediaPathDegraded As Boolean";
playbackretryfallbackstate._ismediapathdegraded = RemoteObject.createImmutable(false);__ref.setField("_ismediapathdegraded",playbackretryfallbackstate._ismediapathdegraded);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleardispatchretryafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearDispatchRetryAfter (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("cleardispatchretryafter")) { return __ref.runUserSub(false, "playbackretryfallbackstate","cleardispatchretryafter", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub ClearDispatchRetryAfter";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="DispatchRetryAfter = 0";
Debug.ShouldStop(64);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
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
public static RemoteObject  _consumedispatchretryafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumeDispatchRetryAfter (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("consumedispatchretryafter")) { return __ref.runUserSub(false, "playbackretryfallbackstate","consumedispatchretryafter", __ref);}
RemoteObject _value = RemoteObject.createImmutable(0);
 BA.debugLineNum = 46;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim value As Int = DispatchRetryAfter";
Debug.ShouldStop(16384);
_value = __ref.getField(true,"_dispatchretryafter" /*RemoteObject*/ );Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 48;BA.debugLine="DispatchRetryAfter = 0";
Debug.ShouldStop(32768);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 49;BA.debugLine="Return value";
Debug.ShouldStop(65536);
if (true) return _value;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackretryfallbackstate","initialize", __ref, _ba, _localretryinitial, _serverretryinitial);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(localRetryInitial As Int, se";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Reset(localRetryInitial, serverRetryInitial)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.playbackretryfallbackstate.class, "_reset" /*RemoteObject*/ ,(Object)(_localretryinitial),(Object)(_serverretryinitial));
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
public static RemoteObject  _reset(RemoteObject __ref,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("Reset (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackretryfallbackstate","reset", __ref, _localretryinitial, _serverretryinitial);}
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Reset(localRetryInitial As Int, serverR";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="LocalRetryDelay = localRetryInitial";
Debug.ShouldStop(8192);
__ref.setField ("_localretrydelay" /*RemoteObject*/ ,_localretryinitial);
 BA.debugLineNum = 15;BA.debugLine="ServerRetryDelay = serverRetryInitial";
Debug.ShouldStop(16384);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,_serverretryinitial);
 BA.debugLineNum = 16;BA.debugLine="DispatchRetryAfter = 0";
Debug.ShouldStop(32768);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 17;BA.debugLine="IsMediaPathDegraded = False";
Debug.ShouldStop(65536);
__ref.setField ("_ismediapathdegraded" /*RemoteObject*/ ,playbackretryfallbackstate.__c.getField(true,"False"));
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
public static RemoteObject  _resetretrydelays(RemoteObject __ref,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("ResetRetryDelays (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("resetretrydelays")) { return __ref.runUserSub(false, "playbackretryfallbackstate","resetretrydelays", __ref, _localretryinitial, _serverretryinitial);}
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 33;BA.debugLine="Public Sub ResetRetryDelays(localRetryInitial As I";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="LocalRetryDelay = localRetryInitial";
Debug.ShouldStop(2);
__ref.setField ("_localretrydelay" /*RemoteObject*/ ,_localretryinitial);
 BA.debugLineNum = 35;BA.debugLine="ServerRetryDelay = serverRetryInitial";
Debug.ShouldStop(4);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,_serverretryinitial);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveretrydelay(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms,RemoteObject _localretrymax,RemoteObject _serverretrymax,RemoteObject _blockedretrydelay) throws Exception{
try {
		Debug.PushSubsStack("ResolveRetryDelay (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("resolveretrydelay")) { return __ref.runUserSub(false, "playbackretryfallbackstate","resolveretrydelay", __ref, _mode, _delayms, _localretrymax, _serverretrymax, _blockedretrydelay);}
RemoteObject _delay = RemoteObject.createImmutable(0);
RemoteObject _delayserver = RemoteObject.createImmutable(0);
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
Debug.locals.put("localRetryMax", _localretrymax);
Debug.locals.put("serverRetryMax", _serverretrymax);
Debug.locals.put("blockedRetryDelay", _blockedretrydelay);
 BA.debugLineNum = 20;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="If delayMs > 0 Then Return delayMs";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_delayms,BA.numberCast(double.class, 0))) { 
if (true) return _delayms;};
 BA.debugLineNum = 22;BA.debugLine="If mode = \"offline\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("offline"))) { 
 BA.debugLineNum = 23;BA.debugLine="Dim delay As Int = LocalRetryDelay";
Debug.ShouldStop(4194304);
_delay = __ref.getField(true,"_localretrydelay" /*RemoteObject*/ );Debug.locals.put("delay", _delay);Debug.locals.put("delay", _delay);
 BA.debugLineNum = 24;BA.debugLine="LocalRetryDelay = Min(LocalRetryDelay * 2, local";
Debug.ShouldStop(8388608);
__ref.setField ("_localretrydelay" /*RemoteObject*/ ,BA.numberCast(int.class, playbackretryfallbackstate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_localretrydelay" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, _localretrymax)))));
 BA.debugLineNum = 25;BA.debugLine="Return delay";
Debug.ShouldStop(16777216);
if (true) return _delay;
 };
 BA.debugLineNum = 27;BA.debugLine="If mode = \"blocked\" Then Return blockedRetryDelay";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("blocked"))) { 
if (true) return _blockedretrydelay;};
 BA.debugLineNum = 28;BA.debugLine="Dim delayServer As Int = ServerRetryDelay";
Debug.ShouldStop(134217728);
_delayserver = __ref.getField(true,"_serverretrydelay" /*RemoteObject*/ );Debug.locals.put("delayServer", _delayserver);Debug.locals.put("delayServer", _delayserver);
 BA.debugLineNum = 29;BA.debugLine="ServerRetryDelay = Min(ServerRetryDelay * 2, serv";
Debug.ShouldStop(268435456);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,BA.numberCast(int.class, playbackretryfallbackstate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_serverretrydelay" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, _serverretrymax)))));
 BA.debugLineNum = 30;BA.debugLine="Return delayServer";
Debug.ShouldStop(536870912);
if (true) return _delayserver;
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdispatchretryafter(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetDispatchRetryAfter (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setdispatchretryafter")) { return __ref.runUserSub(false, "playbackretryfallbackstate","setdispatchretryafter", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 42;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="DispatchRetryAfter = Max(0, value)";
Debug.ShouldStop(1024);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, playbackretryfallbackstate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _value)))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmediapathdegraded(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetMediaPathDegraded (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setmediapathdegraded")) { return __ref.runUserSub(false, "playbackretryfallbackstate","setmediapathdegraded", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="IsMediaPathDegraded = value";
Debug.ShouldStop(1048576);
__ref.setField ("_ismediapathdegraded" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemediapathdegradedfromcachesync(RemoteObject __ref,RemoteObject _downloaded,RemoteObject _networkfailure) throws Exception{
try {
		Debug.PushSubsStack("UpdateMediaPathDegradedFromCacheSync (playbackretryfallbackstate) ","playbackretryfallbackstate",9,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("updatemediapathdegradedfromcachesync")) { return __ref.runUserSub(false, "playbackretryfallbackstate","updatemediapathdegradedfromcachesync", __ref, _downloaded, _networkfailure);}
RemoteObject _previous = RemoteObject.createImmutable(false);
Debug.locals.put("downloaded", _downloaded);
Debug.locals.put("networkFailure", _networkfailure);
 BA.debugLineNum = 56;BA.debugLine="Public Sub UpdateMediaPathDegradedFromCacheSync(do";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim previous As Boolean = IsMediaPathDegraded";
Debug.ShouldStop(16777216);
_previous = __ref.getField(true,"_ismediapathdegraded" /*RemoteObject*/ );Debug.locals.put("previous", _previous);Debug.locals.put("previous", _previous);
 BA.debugLineNum = 58;BA.debugLine="If downloaded Then";
Debug.ShouldStop(33554432);
if (_downloaded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="IsMediaPathDegraded = False";
Debug.ShouldStop(67108864);
__ref.setField ("_ismediapathdegraded" /*RemoteObject*/ ,playbackretryfallbackstate.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="Else If networkFailure Then";
Debug.ShouldStop(134217728);
if (_networkfailure.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="IsMediaPathDegraded = True";
Debug.ShouldStop(268435456);
__ref.setField ("_ismediapathdegraded" /*RemoteObject*/ ,playbackretryfallbackstate.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 63;BA.debugLine="If previous = False And IsMediaPathDegraded Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_previous,playbackretryfallbackstate.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(true,"_ismediapathdegraded" /*RemoteObject*/ ))) { 
if (true) return BA.ObjectToString("entered");};
 BA.debugLineNum = 64;BA.debugLine="If previous = True And IsMediaPathDegraded = Fals";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_previous,playbackretryfallbackstate.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_ismediapathdegraded" /*RemoteObject*/ ),playbackretryfallbackstate.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("recovered");};
 BA.debugLineNum = 65;BA.debugLine="Return \"\"";
Debug.ShouldStop(1);
if (true) return BA.ObjectToString("");
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
}