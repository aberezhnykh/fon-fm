package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class audioplayer_subs_0 {


public static RemoteObject  _callifexists(RemoteObject __ref,RemoteObject _subname) throws Exception{
try {
		Debug.PushSubsStack("CallIfExists (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("callifexists")) { return __ref.runUserSub(false, "audioplayer","callifexists", __ref, _subname);}
Debug.locals.put("subName", _subname);
 BA.debugLineNum = 197;BA.debugLine="Private Sub CallIfExists(subName As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="If SubExists(targetModule, subName) Then";
Debug.ShouldStop(32);
if (audioplayer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 199;BA.debugLine="CallSubDelayed(targetModule, subName)";
Debug.ShouldStop(64);
audioplayer.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname));
 };
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checktimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckTimer_Tick (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("checktimer_tick")) { return __ref.runUserSub(false, "audioplayer","checktimer_tick", __ref);}
RemoteObject _positionnow = RemoteObject.createImmutable(0L);
RemoteObject _durationnow = RemoteObject.createImmutable(0L);
RemoteObject _remainms = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 208;BA.debugLine="Private Sub CheckTimer_Tick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_playing" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 210;BA.debugLine="Dim positionNow As Long = Position";
Debug.ShouldStop(131072);
_positionnow = __ref.runClassMethod (b4j.example.audioplayer.class, "_position" /*RemoteObject*/ );Debug.locals.put("positionNow", _positionnow);Debug.locals.put("positionNow", _positionnow);
 BA.debugLineNum = 211;BA.debugLine="If positionNow > lastPosition Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_positionnow,__ref.getField(true,"_lastposition" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 212;BA.debugLine="lastPosition = positionNow";
Debug.ShouldStop(524288);
__ref.setField ("_lastposition" /*RemoteObject*/ ,_positionnow);
 BA.debugLineNum = 213;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 214;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 216;BA.debugLine="Dim durationNow As Long = Duration";
Debug.ShouldStop(8388608);
_durationnow = __ref.runClassMethod (b4j.example.audioplayer.class, "_duration" /*RemoteObject*/ );Debug.locals.put("durationNow", _durationnow);Debug.locals.put("durationNow", _durationnow);
 BA.debugLineNum = 217;BA.debugLine="Dim remainMs As Long = -1";
Debug.ShouldStop(16777216);
_remainms = BA.numberCast(long.class, -(double) (0 + 1));Debug.locals.put("remainMs", _remainms);Debug.locals.put("remainMs", _remainms);
 BA.debugLineNum = 218;BA.debugLine="If durationNow > 0 Then remainMs = Max(0, duratio";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_durationnow,BA.numberCast(long.class, 0))) { 
_remainms = BA.numberCast(long.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_durationnow,_positionnow}, "-",1, 2)))));Debug.locals.put("remainMs", _remainms);};
 BA.debugLineNum = 219;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_durationnow,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("g",_positionnow,BA.numberCast(long.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_durationnow,RemoteObject.createImmutable(2000)}, "-",1, 2))))))) { 
 BA.debugLineNum = 220;BA.debugLine="TraceDiagnostic(\"хвост audio=\" & eventName & \" p";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.audioplayer.class, "_tracediagnostic" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("хвост audio="),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable(" positionMs="),_positionnow,RemoteObject.createImmutable(" durationMs="),_durationnow,RemoteObject.createImmutable(" remainMs="),_remainms,RemoteObject.createImmutable(" stalled="),__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ))));
 BA.debugLineNum = 221;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 223;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
Debug.ShouldStop(1073741824);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 224;BA.debugLine="If stalledCheckCount = 1 Or stalledCheckCount = 3";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),BA.numberCast(double.class, 1)) || RemoteObject.solveBoolean("=",__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 225;BA.debugLine="TraceDiagnostic(\"задержка audio=\" & eventName &";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.audioplayer.class, "_tracediagnostic" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("задержка audio="),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable(" positionMs="),_positionnow,RemoteObject.createImmutable(" durationMs="),_durationnow,RemoteObject.createImmutable(" remainMs="),_remainms,RemoteObject.createImmutable(" stalled="),__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 227;BA.debugLine="If stalledCheckCount < 3 Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),BA.numberCast(double.class, 3))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 228;BA.debugLine="NotifyError(\"Silence detected 3\")";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Silence detected 3")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
audioplayer._state_stopped = BA.numberCast(int.class, 0);__ref.setField("_state_stopped",audioplayer._state_stopped);
audioplayer._state_loading = BA.numberCast(int.class, 1);__ref.setField("_state_loading",audioplayer._state_loading);
audioplayer._state_ready = BA.numberCast(int.class, 2);__ref.setField("_state_ready",audioplayer._state_ready);
audioplayer._state_playing = BA.numberCast(int.class, 3);__ref.setField("_state_playing",audioplayer._state_playing);
 //BA.debugLineNum = 4;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
audioplayer._fade_none = BA.numberCast(int.class, 0);__ref.setField("_fade_none",audioplayer._fade_none);
audioplayer._fade_in = BA.numberCast(int.class, 1);__ref.setField("_fade_in",audioplayer._fade_in);
audioplayer._fade_out = BA.numberCast(int.class, 2);__ref.setField("_fade_out",audioplayer._fade_out);
 //BA.debugLineNum = 6;BA.debugLine="Private player As MediaPlayer";
audioplayer._player = RemoteObject.createNew ("anywheresoftware.b4j.objects.MediaPlayerWrapper");__ref.setField("_player",audioplayer._player);
 //BA.debugLineNum = 7;BA.debugLine="Private jo As JavaObject";
audioplayer._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",audioplayer._jo);
 //BA.debugLineNum = 8;BA.debugLine="Private eventName As String";
audioplayer._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",audioplayer._eventname);
 //BA.debugLineNum = 9;BA.debugLine="Private targetModule As Object";
audioplayer._targetmodule = RemoteObject.createNew ("Object");__ref.setField("_targetmodule",audioplayer._targetmodule);
 //BA.debugLineNum = 10;BA.debugLine="Private timeUpdateTimer As Timer";
audioplayer._timeupdatetimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timeupdatetimer",audioplayer._timeupdatetimer);
 //BA.debugLineNum = 11;BA.debugLine="Private lastPosition As Long";
audioplayer._lastposition = RemoteObject.createImmutable(0L);__ref.setField("_lastposition",audioplayer._lastposition);
 //BA.debugLineNum = 12;BA.debugLine="Private checkTimer As Timer";
audioplayer._checktimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_checktimer",audioplayer._checktimer);
 //BA.debugLineNum = 13;BA.debugLine="Private loadTimer As Timer";
audioplayer._loadtimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_loadtimer",audioplayer._loadtimer);
 //BA.debugLineNum = 14;BA.debugLine="Private fadeTimer As Timer";
audioplayer._fadetimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_fadetimer",audioplayer._fadetimer);
 //BA.debugLineNum = 15;BA.debugLine="Private playerState As Int";
audioplayer._playerstate = RemoteObject.createImmutable(0);__ref.setField("_playerstate",audioplayer._playerstate);
 //BA.debugLineNum = 16;BA.debugLine="Private maxVolume As Double";
audioplayer._maxvolume = RemoteObject.createImmutable(0);__ref.setField("_maxvolume",audioplayer._maxvolume);
 //BA.debugLineNum = 17;BA.debugLine="Private fadeMode As Int";
audioplayer._fademode = RemoteObject.createImmutable(0);__ref.setField("_fademode",audioplayer._fademode);
 //BA.debugLineNum = 18;BA.debugLine="Private fadeTargetVolume As Double";
audioplayer._fadetargetvolume = RemoteObject.createImmutable(0);__ref.setField("_fadetargetvolume",audioplayer._fadetargetvolume);
 //BA.debugLineNum = 19;BA.debugLine="Private fadeStepVolume As Double";
audioplayer._fadestepvolume = RemoteObject.createImmutable(0);__ref.setField("_fadestepvolume",audioplayer._fadestepvolume);
 //BA.debugLineNum = 20;BA.debugLine="Private currentVolume As Double";
audioplayer._currentvolume = RemoteObject.createImmutable(0);__ref.setField("_currentvolume",audioplayer._currentvolume);
 //BA.debugLineNum = 21;BA.debugLine="Private stalledCheckCount As Int";
audioplayer._stalledcheckcount = RemoteObject.createImmutable(0);__ref.setField("_stalledcheckcount",audioplayer._stalledcheckcount);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _duration(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Duration (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("duration")) { return __ref.runUserSub(false, "audioplayer","duration", __ref);}
 BA.debugLineNum = 147;BA.debugLine="Public Sub Duration As Long";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="If player.IsInitialized = False Then Return 0";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 149;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 150;BA.debugLine="Return player.Duration";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, __ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"getDuration"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 152;BA.debugLine="Return 0";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _error_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("Error_Event (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("error_event")) { return __ref.runUserSub(false, "audioplayer","error_event", __ref, _methodname, _args);}
RemoteObject _msg = RemoteObject.createImmutable("");
Debug.locals.put("methodName", _methodname);
Debug.locals.put("args", _args);
 BA.debugLineNum = 163;BA.debugLine="Private Sub Error_Event(methodName As String, args";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Dim msg As String = \"\"";
Debug.ShouldStop(8);
_msg = BA.ObjectToString("");Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 165;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 166;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
Debug.ShouldStop(32);
_msg = BA.ObjectToString(__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getError")),(Object)((audioplayer.__c.getField(false,"Null")))));Debug.locals.put("msg", _msg);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 168;BA.debugLine="msg = LastException.Message";
Debug.ShouldStop(128);
_msg = audioplayer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage");Debug.locals.put("msg", _msg);
 };
 BA.debugLineNum = 170;BA.debugLine="TraceAudio(\"Error_Event. message=\" & msg)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error_Event. message="),_msg)));
 BA.debugLineNum = 171;BA.debugLine="NotifyError(msg)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(_msg));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fadetimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FadeTimer_Tick (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("fadetimer_tick")) { return __ref.runUserSub(false, "audioplayer","fadetimer_tick", __ref);}
RemoteObject _nextvolume = RemoteObject.createImmutable(0);
 BA.debugLineNum = 237;BA.debugLine="Private Sub FadeTimer_Tick";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="If player.IsInitialized = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 239;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 240;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(32768);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 241;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 243;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
Debug.ShouldStop(262144);
_nextvolume = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvolume" /*RemoteObject*/ ),__ref.getField(true,"_fadestepvolume" /*RemoteObject*/ )}, "+",1, 0);Debug.locals.put("nextVolume", _nextvolume);Debug.locals.put("nextVolume", _nextvolume);
 BA.debugLineNum = 244;BA.debugLine="If fadeMode = FADE_IN Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fademode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_fade_in" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 245;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",_nextvolume,__ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 246;BA.debugLine="nextVolume = fadeTargetVolume";
Debug.ShouldStop(2097152);
_nextvolume = __ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ );Debug.locals.put("nextVolume", _nextvolume);
 BA.debugLineNum = 247;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 248;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(8388608);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 };
 }else 
{ BA.debugLineNum = 250;BA.debugLine="Else If fadeMode = FADE_OUT Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fademode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_fade_out" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 251;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("k",_nextvolume,__ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 252;BA.debugLine="nextVolume = fadeTargetVolume";
Debug.ShouldStop(134217728);
_nextvolume = __ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ );Debug.locals.put("nextVolume", _nextvolume);
 BA.debugLineNum = 253;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 254;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(536870912);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 };
 }}
;
 BA.debugLineNum = 257;BA.debugLine="SetPlayerVolume(nextVolume)";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(_nextvolume));
 BA.debugLineNum = 258;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fademode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_fade_none" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("k",_nextvolume,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 259;BA.debugLine="StopImmediately";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.audioplayer.class, "_stopimmediately" /*RemoteObject*/ );
 };
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _eventnamevalue,RemoteObject _targetmodulevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "audioplayer","initialize", __ref, _ba, _eventnamevalue, _targetmodulevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("eventNameValue", _eventnamevalue);
Debug.locals.put("targetModuleValue", _targetmodulevalue);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="eventName = eventNameValue";
Debug.ShouldStop(16777216);
__ref.setField ("_eventname" /*RemoteObject*/ ,_eventnamevalue);
 BA.debugLineNum = 26;BA.debugLine="targetModule = targetModuleValue";
Debug.ShouldStop(33554432);
__ref.setField ("_targetmodule" /*RemoteObject*/ ,_targetmodulevalue);
 BA.debugLineNum = 27;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
Debug.ShouldStop(67108864);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LoadTimer")),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),audioplayer.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "*",0, 2)));
 BA.debugLineNum = 28;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", 10 * DateTime";
Debug.ShouldStop(134217728);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CheckTimer")),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),audioplayer.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "*",0, 2)));
 BA.debugLineNum = 29;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
Debug.ShouldStop(268435456);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("TimeUpdateTimer")),(Object)(BA.numberCast(long.class, 250)));
 BA.debugLineNum = 30;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FadeTimer")),(Object)(BA.numberCast(long.class, 40)));
 BA.debugLineNum = 31;BA.debugLine="TraceAudio(\"Initialize\")";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Initialize")));
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
public static RemoteObject  _isloading(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsLoading (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("isloading")) { return __ref.runUserSub(false, "audioplayer","isloading", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Public Sub IsLoading As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Return playerState = STATE_LOADING";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ ))));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isplaying(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPlaying (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("isplaying")) { return __ref.runUserSub(false, "audioplayer","isplaying", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub IsPlaying As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Return playerState = STATE_PLAYING";
Debug.ShouldStop(64);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_playing" /*RemoteObject*/ ))));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsReady (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("isready")) { return __ref.runUserSub(false, "audioplayer","isready", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Public Sub IsReady As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Return playerState = STATE_READY";
Debug.ShouldStop(4);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ ))));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstopped(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsStopped (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("isstopped")) { return __ref.runUserSub(false, "audioplayer","isstopped", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Public Sub IsStopped As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Return playerState = STATE_STOPPED";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_stopped" /*RemoteObject*/ ))));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadtimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadTimer_Tick (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("loadtimer_tick")) { return __ref.runUserSub(false, "audioplayer","loadtimer_tick", __ref);}
 BA.debugLineNum = 231;BA.debugLine="Private Sub LoadTimer_Tick";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 233;BA.debugLine="TraceAudio(\"Load timeout\")";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Load timeout")));
 BA.debugLineNum = 234;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Track loading timeout expired")));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadurl(RemoteObject __ref,RemoteObject _url,RemoteObject _volume) throws Exception{
try {
		Debug.PushSubsStack("LoadUrl (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("loadurl")) { return __ref.runUserSub(false, "audioplayer","loadurl", __ref, _url, _volume);}
Debug.locals.put("url", _url);
Debug.locals.put("volume", _volume);
 BA.debugLineNum = 34;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Reset";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
Debug.ShouldStop(8);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setInterval",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),audioplayer.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "*",0, 2));
 BA.debugLineNum = 37;BA.debugLine="loadTimer.Enabled = True";
Debug.ShouldStop(16);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="playerState = STATE_LOADING";
Debug.ShouldStop(32);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_loading" /*RemoteObject*/ ));
 BA.debugLineNum = 39;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
Debug.ShouldStop(64);
__ref.setField ("_maxvolume" /*RemoteObject*/ ,audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(audioplayer.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(_volume)))));
 BA.debugLineNum = 40;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("LoadUrl. volume="),audioplayer.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(audioplayer.__c.getField(true,"False"))),RemoteObject.createImmutable(", url="),_url)));
 BA.debugLineNum = 41;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 42;BA.debugLine="player.Initialize(\"Player\", url)";
Debug.ShouldStop(512);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Player")),(Object)(_url));
 BA.debugLineNum = 43;BA.debugLine="jo = player";
Debug.ShouldStop(1024);
__ref.getField(false,"_jo" /*RemoteObject*/ ).setObject (__ref.getField(false,"_player" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 44;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
Debug.ShouldStop(2048);
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnError")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("java.lang.Runnable")),(Object)(BA.ObjectToString("Error")),(Object)((audioplayer.__c.getField(true,"False"))))})));
 BA.debugLineNum = 45;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
Debug.ShouldStop(4096);
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnReady")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("java.lang.Runnable")),(Object)(BA.ObjectToString("Ready")),(Object)((audioplayer.__c.getField(true,"False"))))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 47;BA.debugLine="NotifyError(LastException.Message)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(audioplayer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 };
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
public static RemoteObject  _notifyerror(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("NotifyError (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("notifyerror")) { return __ref.runUserSub(false, "audioplayer","notifyerror", __ref, _message);}
RemoteObject _subname = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 188;BA.debugLine="Private Sub NotifyError(message As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("NotifyError. message="),_message)));
 BA.debugLineNum = 190;BA.debugLine="Reset";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 191;BA.debugLine="Dim subName As String = eventName & \"_Error\"";
Debug.ShouldStop(1073741824);
_subname = RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Error"));Debug.locals.put("subName", _subname);Debug.locals.put("subName", _subname);
 BA.debugLineNum = 192;BA.debugLine="If SubExists(targetModule, subName) Then";
Debug.ShouldStop(-2147483648);
if (audioplayer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="CallSubDelayed2(targetModule, subName, message)";
Debug.ShouldStop(1);
audioplayer.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname),(Object)((_message)));
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _play(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Play (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("play")) { return __ref.runUserSub(false, "audioplayer","play", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub Play";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="PlayWithFade(0)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.audioplayer.class, "_playwithfade" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _player_complete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Player_Complete (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("player_complete")) { return __ref.runUserSub(false, "audioplayer","player_complete", __ref);}
 BA.debugLineNum = 174;BA.debugLine="Private Sub Player_Complete";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="If playerState = STATE_STOPPED Then Return";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_stopped" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 176;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 177;BA.debugLine="checkTimer.Enabled = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 178;BA.debugLine="timeUpdateTimer.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 179;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(262144);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(524288);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 181;BA.debugLine="currentVolume = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 182;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(2097152);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 183;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(4194304);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 184;BA.debugLine="TraceAudio(\"Complete\")";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Complete")));
 BA.debugLineNum = 185;BA.debugLine="CallIfExists(eventName & \"_Complete\")";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.audioplayer.class, "_callifexists" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Complete"))));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playwithfade(RemoteObject __ref,RemoteObject _fadetimems) throws Exception{
try {
		Debug.PushSubsStack("PlayWithFade (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("playwithfade")) { return __ref.runUserSub(false, "audioplayer","playwithfade", __ref, _fadetimems);}
Debug.locals.put("fadeTimeMs", _fadetimems);
 BA.debugLineNum = 55;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="If playerState <> STATE_READY Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 57;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("play_with_fade_not_ready state="),__ref.getField(true,"_playerstate" /*RemoteObject*/ ))));
 BA.debugLineNum = 58;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 60;BA.debugLine="playerState = STATE_PLAYING";
Debug.ShouldStop(134217728);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_playing" /*RemoteObject*/ ));
 BA.debugLineNum = 61;BA.debugLine="lastPosition = 0";
Debug.ShouldStop(268435456);
__ref.setField ("_lastposition" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 62;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(536870912);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 63;BA.debugLine="checkTimer.Enabled = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="timeUpdateTimer.Enabled = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="player.Play";
Debug.ShouldStop(1);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Play");
 BA.debugLineNum = 66;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlayWithFade. fadeTimeMs="),_fadetimems,RemoteObject.createImmutable(", maxVolume="),audioplayer.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(audioplayer.__c.getField(true,"False"))))));
 BA.debugLineNum = 67;BA.debugLine="If fadeTimeMs > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_fadetimems,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 68;BA.debugLine="SetPlayerVolume(0)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 69;BA.debugLine="StartFade(FADE_IN, maxVolume, fadeTimeMs)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.audioplayer.class, "_startfade" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_fade_in" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )),(Object)(_fadetimems));
 }else {
 BA.debugLineNum = 71;BA.debugLine="SetPlayerVolume(maxVolume)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _position(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Position (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("position")) { return __ref.runUserSub(false, "audioplayer","position", __ref);}
 BA.debugLineNum = 138;BA.debugLine="Public Sub Position As Long";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="If player.IsInitialized = False Then Return 0";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 140;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 141;BA.debugLine="Return player.Position";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, __ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"getPosition"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 143;BA.debugLine="Return 0";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(long.class, 0);
 };
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
public static RemoteObject  _ready_event(RemoteObject __ref,RemoteObject _methodname,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("Ready_Event (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("ready_event")) { return __ref.runUserSub(false, "audioplayer","ready_event", __ref, _methodname, _args);}
Debug.locals.put("methodName", _methodname);
Debug.locals.put("args", _args);
 BA.debugLineNum = 156;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="playerState = STATE_READY";
Debug.ShouldStop(268435456);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_ready" /*RemoteObject*/ ));
 BA.debugLineNum = 158;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 159;BA.debugLine="TraceAudio(\"Ready\")";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Ready")));
 BA.debugLineNum = 160;BA.debugLine="CallIfExists(eventName & \"_Ready\")";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.audioplayer.class, "_callifexists" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Ready"))));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Reset (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "audioplayer","reset", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="checkTimer.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="timeUpdateTimer.Enabled = False";
Debug.ShouldStop(2);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 100;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(8);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 101;BA.debugLine="lastPosition = 0";
Debug.ShouldStop(16);
__ref.setField ("_lastposition" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 102;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(32);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 103;BA.debugLine="currentVolume = 0";
Debug.ShouldStop(64);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 104;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(128);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 105;BA.debugLine="If player.IsInitialized Then";
Debug.ShouldStop(256);
if (__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 107;BA.debugLine="player.Volume = 0";
Debug.ShouldStop(1024);
__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"setVolume",BA.numberCast(double.class, 0));
 BA.debugLineNum = 108;BA.debugLine="player.Stop";
Debug.ShouldStop(2048);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Stop");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e15.toString()); BA.debugLineNum = 110;BA.debugLine="TraceInternalError(\"reset_stop\")";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("reset_stop")));
 };
 BA.debugLineNum = 112;BA.debugLine="If jo.IsInitialized Then";
Debug.ShouldStop(32768);
if (__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 114;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
Debug.ShouldStop(131072);
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("dispose")),(Object)((audioplayer.__c.getField(false,"Null"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e21.toString()); BA.debugLineNum = 116;BA.debugLine="TraceInternalError(\"reset_dispose\")";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("reset_dispose")));
 };
 };
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplayervolume(RemoteObject __ref,RemoteObject _volumevalue) throws Exception{
try {
		Debug.PushSubsStack("SetPlayerVolume (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("setplayervolume")) { return __ref.runUserSub(false, "audioplayer","setplayervolume", __ref, _volumevalue);}
Debug.locals.put("volumeValue", _volumevalue);
 BA.debugLineNum = 280;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
Debug.ShouldStop(16777216);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(audioplayer.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(_volumevalue)))));
 BA.debugLineNum = 282;BA.debugLine="If player.IsInitialized = False Then Return";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 283;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 284;BA.debugLine="player.Volume = currentVolume";
Debug.ShouldStop(134217728);
__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"setVolume",__ref.getField(true,"_currentvolume" /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 286;BA.debugLine="TraceInternalError(\"set_volume\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("set_volume")));
 };
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startfade(RemoteObject __ref,RemoteObject _mode,RemoteObject _targetvolume,RemoteObject _fadetimems) throws Exception{
try {
		Debug.PushSubsStack("StartFade (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("startfade")) { return __ref.runUserSub(false, "audioplayer","startfade", __ref, _mode, _targetvolume, _fadetimems);}
RemoteObject _intervalms = RemoteObject.createImmutable(0);
RemoteObject _steps = RemoteObject.createImmutable(0);
Debug.locals.put("mode", _mode);
Debug.locals.put("targetVolume", _targetvolume);
Debug.locals.put("fadeTimeMs", _fadetimems);
 BA.debugLineNum = 263;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 265;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(256);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 266;BA.debugLine="If player.IsInitialized = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 267;BA.debugLine="If fadeTimeMs <= 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("k",_fadetimems,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 268;BA.debugLine="SetPlayerVolume(targetVolume)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(_targetvolume));
 BA.debugLineNum = 269;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("k",_targetvolume,BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.audioplayer.class, "_stopimmediately" /*RemoteObject*/ );};
 BA.debugLineNum = 270;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 272;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
Debug.ShouldStop(32768);
_intervalms = BA.numberCast(int.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, __ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"getInterval")))));Debug.locals.put("intervalMs", _intervalms);Debug.locals.put("intervalMs", _intervalms);
 BA.debugLineNum = 273;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
Debug.ShouldStop(65536);
_steps = BA.numberCast(int.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(audioplayer.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_fadetimems,_intervalms}, "/",0, 0))))));Debug.locals.put("steps", _steps);Debug.locals.put("steps", _steps);
 BA.debugLineNum = 274;BA.debugLine="fadeMode = mode";
Debug.ShouldStop(131072);
__ref.setField ("_fademode" /*RemoteObject*/ ,_mode);
 BA.debugLineNum = 275;BA.debugLine="fadeTargetVolume = targetVolume";
Debug.ShouldStop(262144);
__ref.setField ("_fadetargetvolume" /*RemoteObject*/ ,_targetvolume);
 BA.debugLineNum = 276;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
Debug.ShouldStop(524288);
__ref.setField ("_fadestepvolume" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_targetvolume,__ref.getField(true,"_currentvolume" /*RemoteObject*/ )}, "-",1, 0)),_steps}, "/",0, 0));
 BA.debugLineNum = 277;BA.debugLine="fadeTimer.Enabled = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop(RemoteObject __ref,RemoteObject _fadetimems) throws Exception{
try {
		Debug.PushSubsStack("Stop (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "audioplayer","stop", __ref, _fadetimems);}
Debug.locals.put("fadeTimeMs", _fadetimems);
 BA.debugLineNum = 75;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="checkTimer.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="timeUpdateTimer.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="lastPosition = 0";
Debug.ShouldStop(16384);
__ref.setField ("_lastposition" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 80;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(32768);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 81;BA.debugLine="If player.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 82;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(131072);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Stop ignored. player not initialized.")));
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 86;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Stop. fadeTimeMs="),_fadetimems,RemoteObject.createImmutable(", currentVolume="),audioplayer.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_currentvolume" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(audioplayer.__c.getField(true,"False"))))));
 BA.debugLineNum = 87;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_fadetimems,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(true,"_currentvolume" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(8388608);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 89;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.audioplayer.class, "_startfade" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_fade_out" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(_fadetimems));
 }else {
 BA.debugLineNum = 91;BA.debugLine="StopImmediately";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.audioplayer.class, "_stopimmediately" /*RemoteObject*/ );
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopimmediately(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopImmediately (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("stopimmediately")) { return __ref.runUserSub(false, "audioplayer","stopimmediately", __ref);}
 BA.debugLineNum = 290;BA.debugLine="Private Sub StopImmediately";
Debug.ShouldStop(2);
 BA.debugLineNum = 291;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 292;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(8);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 293;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(16);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 294;BA.debugLine="currentVolume = 0";
Debug.ShouldStop(32);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 295;BA.debugLine="TraceAudio(\"StopImmediately\")";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("StopImmediately")));
 BA.debugLineNum = 296;BA.debugLine="If player.IsInitialized = False Then Return";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 297;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 298;BA.debugLine="player.Volume = 0";
Debug.ShouldStop(512);
__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"setVolume",BA.numberCast(double.class, 0));
 BA.debugLineNum = 299;BA.debugLine="player.Stop";
Debug.ShouldStop(1024);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Stop");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 301;BA.debugLine="TraceInternalError(\"stop_immediately\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("stop_immediately")));
 };
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timeupdatetimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimeUpdateTimer_Tick (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("timeupdatetimer_tick")) { return __ref.runUserSub(false, "audioplayer","timeupdatetimer_tick", __ref);}
 BA.debugLineNum = 203;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_playing" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 205;BA.debugLine="CallIfExists(eventName & \"_Timeupdate\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.audioplayer.class, "_callifexists" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Timeupdate"))));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _traceaudio(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceAudio (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("traceaudio")) { return __ref.runUserSub(false, "audioplayer","traceaudio", __ref, _message);}
RemoteObject _subname = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 319;BA.debugLine="Private Sub TraceAudio(message As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="Dim subName As String = \"TraceLog\"";
Debug.ShouldStop(-2147483648);
_subname = BA.ObjectToString("TraceLog");Debug.locals.put("subName", _subname);Debug.locals.put("subName", _subname);
 BA.debugLineNum = 321;BA.debugLine="If SubExists(targetModule, subName) Then";
Debug.ShouldStop(1);
if (audioplayer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 322;BA.debugLine="CallSubDelayed2(targetModule, subName, \"[\" & eve";
Debug.ShouldStop(2);
audioplayer.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname),(Object)((RemoteObject.concat(RemoteObject.createImmutable("["),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("] "),_message))));
 };
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracediagnostic(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceDiagnostic (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("tracediagnostic")) { return __ref.runUserSub(false, "audioplayer","tracediagnostic", __ref, _message);}
RemoteObject _subname = RemoteObject.createImmutable("");
Debug.locals.put("message", _message);
 BA.debugLineNum = 312;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Dim subName As String = \"TraceLog\"";
Debug.ShouldStop(16777216);
_subname = BA.ObjectToString("TraceLog");Debug.locals.put("subName", _subname);Debug.locals.put("subName", _subname);
 BA.debugLineNum = 314;BA.debugLine="If SubExists(targetModule, subName) Then";
Debug.ShouldStop(33554432);
if (audioplayer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 315;BA.debugLine="CallSubDelayed2(targetModule, subName, message)";
Debug.ShouldStop(67108864);
audioplayer.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname),(Object)((_message)));
 };
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _traceinternalerror(RemoteObject __ref,RemoteObject _context) throws Exception{
try {
		Debug.PushSubsStack("TraceInternalError (audioplayer) ","audioplayer",17,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("traceinternalerror")) { return __ref.runUserSub(false, "audioplayer","traceinternalerror", __ref, _context);}
RemoteObject _subname = RemoteObject.createImmutable("");
Debug.locals.put("context", _context);
 BA.debugLineNum = 305;BA.debugLine="Private Sub TraceInternalError(context As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 306;BA.debugLine="Dim subName As String = \"TraceLog\"";
Debug.ShouldStop(131072);
_subname = BA.ObjectToString("TraceLog");Debug.locals.put("subName", _subname);Debug.locals.put("subName", _subname);
 BA.debugLineNum = 307;BA.debugLine="If SubExists(targetModule, subName) Then";
Debug.ShouldStop(262144);
if (audioplayer.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 308;BA.debugLine="CallSubDelayed2(targetModule, subName, \"ошибка а";
Debug.ShouldStop(524288);
audioplayer.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_targetmodule" /*RemoteObject*/ )),(Object)(_subname),(Object)((RemoteObject.concat(RemoteObject.createImmutable("ошибка аудио internal context="),_context,RemoteObject.createImmutable(" message="),audioplayer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))));
 };
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}