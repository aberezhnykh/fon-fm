package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class audioplayer_subs_0 {


public static RemoteObject  _checktimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckTimer_Tick (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("checktimer_tick")) { return __ref.runUserSub(false, "audioplayer","checktimer_tick", __ref);}
RemoteObject _positionnow = RemoteObject.createImmutable(0L);
RemoteObject _durationnow = RemoteObject.createImmutable(0L);
RemoteObject _remainms = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 239;BA.debugLine="Private Sub CheckTimer_Tick";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_playing" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 241;BA.debugLine="Dim positionNow As Long = Position";
Debug.ShouldStop(65536);
_positionnow = __ref.runClassMethod (b4j.example.audioplayer.class, "_position" /*RemoteObject*/ );Debug.locals.put("positionNow", _positionnow);Debug.locals.put("positionNow", _positionnow);
 BA.debugLineNum = 242;BA.debugLine="If positionNow > lastPosition Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_positionnow,__ref.getField(true,"_lastposition" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 243;BA.debugLine="lastPosition = positionNow";
Debug.ShouldStop(262144);
__ref.setField ("_lastposition" /*RemoteObject*/ ,_positionnow);
 BA.debugLineNum = 244;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(524288);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 245;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 247;BA.debugLine="Dim durationNow As Long = Duration";
Debug.ShouldStop(4194304);
_durationnow = __ref.runClassMethod (b4j.example.audioplayer.class, "_duration" /*RemoteObject*/ );Debug.locals.put("durationNow", _durationnow);Debug.locals.put("durationNow", _durationnow);
 BA.debugLineNum = 248;BA.debugLine="Dim remainMs As Long = -1";
Debug.ShouldStop(8388608);
_remainms = BA.numberCast(long.class, -(double) (0 + 1));Debug.locals.put("remainMs", _remainms);Debug.locals.put("remainMs", _remainms);
 BA.debugLineNum = 249;BA.debugLine="If durationNow > 0 Then remainMs = Max(0, duratio";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_durationnow,BA.numberCast(long.class, 0))) { 
_remainms = BA.numberCast(long.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_durationnow,_positionnow}, "-",1, 2)))));Debug.locals.put("remainMs", _remainms);};
 BA.debugLineNum = 250;BA.debugLine="If durationNow > 0 And positionNow >= Max(0, dura";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_durationnow,BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("g",_positionnow,BA.numberCast(long.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_durationnow,RemoteObject.createImmutable(2000)}, "-",1, 2))))))) { 
 BA.debugLineNum = 251;BA.debugLine="TraceDiagnostic(\"хвост audio=\" & eventName & \" p";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.audioplayer.class, "_tracediagnostic" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("хвост audio="),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable(" positionMs="),_positionnow,RemoteObject.createImmutable(" durationMs="),_durationnow,RemoteObject.createImmutable(" remainMs="),_remainms,RemoteObject.createImmutable(" stalled="),__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ))));
 BA.debugLineNum = 252;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 254;BA.debugLine="stalledCheckCount = stalledCheckCount + 1";
Debug.ShouldStop(536870912);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 255;BA.debugLine="If stalledCheckCount = 1 Or stalledCheckCount = 3";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),BA.numberCast(double.class, 1)) || RemoteObject.solveBoolean("=",__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 256;BA.debugLine="TraceDiagnostic(\"задержка audio=\" & eventName &";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.audioplayer.class, "_tracediagnostic" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("задержка audio="),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable(" positionMs="),_positionnow,RemoteObject.createImmutable(" durationMs="),_durationnow,RemoteObject.createImmutable(" remainMs="),_remainms,RemoteObject.createImmutable(" stalled="),__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 258;BA.debugLine="If stalledCheckCount < SILENCE_STALL_THRESHOLD Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_stalledcheckcount" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_silence_stall_threshold" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 259;BA.debugLine="NotifyError(\"Silence detected \" & SILENCE_STALL_T";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Silence detected "),__ref.getField(true,"_silence_stall_threshold" /*RemoteObject*/ ))));
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private Const STATE_STOPPED = 0, STATE_LOADING =";
audioplayer._state_stopped = BA.numberCast(int.class, 0);__ref.setField("_state_stopped",audioplayer._state_stopped);
audioplayer._state_loading = BA.numberCast(int.class, 1);__ref.setField("_state_loading",audioplayer._state_loading);
audioplayer._state_ready = BA.numberCast(int.class, 2);__ref.setField("_state_ready",audioplayer._state_ready);
audioplayer._state_playing = BA.numberCast(int.class, 3);__ref.setField("_state_playing",audioplayer._state_playing);
 //BA.debugLineNum = 7;BA.debugLine="Private Const FADE_NONE = 0, FADE_IN = 1, FADE_OU";
audioplayer._fade_none = BA.numberCast(int.class, 0);__ref.setField("_fade_none",audioplayer._fade_none);
audioplayer._fade_in = BA.numberCast(int.class, 1);__ref.setField("_fade_in",audioplayer._fade_in);
audioplayer._fade_out = BA.numberCast(int.class, 2);__ref.setField("_fade_out",audioplayer._fade_out);
 //BA.debugLineNum = 8;BA.debugLine="Private Const CHECK_TIMER_INTERVAL_MS As Int = 20";
audioplayer._check_timer_interval_ms = BA.numberCast(int.class, 2000);__ref.setField("_check_timer_interval_ms",audioplayer._check_timer_interval_ms);
 //BA.debugLineNum = 9;BA.debugLine="Private Const SILENCE_STALL_THRESHOLD As Int = 3";
audioplayer._silence_stall_threshold = BA.numberCast(int.class, 3);__ref.setField("_silence_stall_threshold",audioplayer._silence_stall_threshold);
 //BA.debugLineNum = 11;BA.debugLine="Private player As MediaPlayer";
audioplayer._player = RemoteObject.createNew ("anywheresoftware.b4j.objects.MediaPlayerWrapper");__ref.setField("_player",audioplayer._player);
 //BA.debugLineNum = 12;BA.debugLine="Private jo As JavaObject";
audioplayer._jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jo",audioplayer._jo);
 //BA.debugLineNum = 13;BA.debugLine="Private eventName As String";
audioplayer._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",audioplayer._eventname);
 //BA.debugLineNum = 14;BA.debugLine="Private targetPage As B4XMainPage";
audioplayer._targetpage = RemoteObject.createNew ("b4j.example.b4xmainpage");__ref.setField("_targetpage",audioplayer._targetpage);
 //BA.debugLineNum = 15;BA.debugLine="Private timeUpdateTimer As Timer";
audioplayer._timeupdatetimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timeupdatetimer",audioplayer._timeupdatetimer);
 //BA.debugLineNum = 16;BA.debugLine="Private lastPosition As Long";
audioplayer._lastposition = RemoteObject.createImmutable(0L);__ref.setField("_lastposition",audioplayer._lastposition);
 //BA.debugLineNum = 17;BA.debugLine="Private checkTimer As Timer";
audioplayer._checktimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_checktimer",audioplayer._checktimer);
 //BA.debugLineNum = 18;BA.debugLine="Private loadTimer As Timer";
audioplayer._loadtimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_loadtimer",audioplayer._loadtimer);
 //BA.debugLineNum = 19;BA.debugLine="Private fadeTimer As Timer";
audioplayer._fadetimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_fadetimer",audioplayer._fadetimer);
 //BA.debugLineNum = 20;BA.debugLine="Private playerState As Int";
audioplayer._playerstate = RemoteObject.createImmutable(0);__ref.setField("_playerstate",audioplayer._playerstate);
 //BA.debugLineNum = 21;BA.debugLine="Private maxVolume As Double";
audioplayer._maxvolume = RemoteObject.createImmutable(0);__ref.setField("_maxvolume",audioplayer._maxvolume);
 //BA.debugLineNum = 22;BA.debugLine="Private fadeMode As Int";
audioplayer._fademode = RemoteObject.createImmutable(0);__ref.setField("_fademode",audioplayer._fademode);
 //BA.debugLineNum = 23;BA.debugLine="Private fadeTargetVolume As Double";
audioplayer._fadetargetvolume = RemoteObject.createImmutable(0);__ref.setField("_fadetargetvolume",audioplayer._fadetargetvolume);
 //BA.debugLineNum = 24;BA.debugLine="Private fadeStepVolume As Double";
audioplayer._fadestepvolume = RemoteObject.createImmutable(0);__ref.setField("_fadestepvolume",audioplayer._fadestepvolume);
 //BA.debugLineNum = 25;BA.debugLine="Private currentVolume As Double";
audioplayer._currentvolume = RemoteObject.createImmutable(0);__ref.setField("_currentvolume",audioplayer._currentvolume);
 //BA.debugLineNum = 26;BA.debugLine="Private stalledCheckCount As Int";
audioplayer._stalledcheckcount = RemoteObject.createImmutable(0);__ref.setField("_stalledcheckcount",audioplayer._stalledcheckcount);
 //BA.debugLineNum = 27;BA.debugLine="Private currentLoadToken As Long";
audioplayer._currentloadtoken = RemoteObject.createImmutable(0L);__ref.setField("_currentloadtoken",audioplayer._currentloadtoken);
 //BA.debugLineNum = 28;BA.debugLine="Private activeEventLoadToken As Long";
audioplayer._activeeventloadtoken = RemoteObject.createImmutable(0L);__ref.setField("_activeeventloadtoken",audioplayer._activeeventloadtoken);
 //BA.debugLineNum = 29;BA.debugLine="Private audioKey As String";
audioplayer._audiokey = RemoteObject.createImmutable("");__ref.setField("_audiokey",audioplayer._audiokey);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _duration(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Duration (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("duration")) { return __ref.runUserSub(false, "audioplayer","duration", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Public Sub Duration As Long";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="If player.IsInitialized = False Then Return 0";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 173;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 174;BA.debugLine="Return player.Duration";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, __ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"getDuration"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 176;BA.debugLine="Return 0";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Error_Event (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("error_event")) { return __ref.runUserSub(false, "audioplayer","error_event", __ref, _methodname, _args);}
RemoteObject _msg = RemoteObject.createImmutable("");
Debug.locals.put("methodName", _methodname);
Debug.locals.put("args", _args);
 BA.debugLineNum = 192;BA.debugLine="Private Sub Error_Event(methodName As String, args";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 194;BA.debugLine="TraceAudio(\"Error ignored. stale_token=\" & activ";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error ignored. stale_token="),__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),RemoteObject.createImmutable(" current="),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))));
 BA.debugLineNum = 195;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 197;BA.debugLine="Dim msg As String = \"\"";
Debug.ShouldStop(16);
_msg = BA.ObjectToString("");Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 198;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 199;BA.debugLine="msg = jo.RunMethod(\"getError\", Null)";
Debug.ShouldStop(64);
_msg = BA.ObjectToString(__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getError")),(Object)((audioplayer.__c.getField(false,"Null")))));Debug.locals.put("msg", _msg);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e9.toString()); BA.debugLineNum = 201;BA.debugLine="msg = LastException.Message";
Debug.ShouldStop(256);
_msg = audioplayer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage");Debug.locals.put("msg", _msg);
 };
 BA.debugLineNum = 203;BA.debugLine="TraceAudio(\"Error_Event. message=\" & msg)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error_Event. message="),_msg)));
 BA.debugLineNum = 204;BA.debugLine="NotifyError(msg)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(_msg));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("FadeTimer_Tick (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("fadetimer_tick")) { return __ref.runUserSub(false, "audioplayer","fadetimer_tick", __ref);}
RemoteObject _nextvolume = RemoteObject.createImmutable(0);
 BA.debugLineNum = 268;BA.debugLine="Private Sub FadeTimer_Tick";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="If player.IsInitialized = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 270;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 271;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(16384);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 272;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 274;BA.debugLine="Dim nextVolume As Double = currentVolume + fadeSt";
Debug.ShouldStop(131072);
_nextvolume = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvolume" /*RemoteObject*/ ),__ref.getField(true,"_fadestepvolume" /*RemoteObject*/ )}, "+",1, 0);Debug.locals.put("nextVolume", _nextvolume);Debug.locals.put("nextVolume", _nextvolume);
 BA.debugLineNum = 275;BA.debugLine="If fadeMode = FADE_IN Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fademode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_fade_in" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 276;BA.debugLine="If nextVolume >= fadeTargetVolume Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("g",_nextvolume,__ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 277;BA.debugLine="nextVolume = fadeTargetVolume";
Debug.ShouldStop(1048576);
_nextvolume = __ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ );Debug.locals.put("nextVolume", _nextvolume);
 BA.debugLineNum = 278;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 279;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(4194304);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 };
 }else 
{ BA.debugLineNum = 281;BA.debugLine="Else If fadeMode = FADE_OUT Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fademode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_fade_out" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 282;BA.debugLine="If nextVolume <= fadeTargetVolume Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("k",_nextvolume,__ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 283;BA.debugLine="nextVolume = fadeTargetVolume";
Debug.ShouldStop(67108864);
_nextvolume = __ref.getField(true,"_fadetargetvolume" /*RemoteObject*/ );Debug.locals.put("nextVolume", _nextvolume);
 BA.debugLineNum = 284;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 285;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(268435456);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 };
 }}
;
 BA.debugLineNum = 288;BA.debugLine="SetPlayerVolume(nextVolume)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(_nextvolume));
 BA.debugLineNum = 289;BA.debugLine="If fadeMode = FADE_NONE And nextVolume <= 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fademode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_fade_none" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("k",_nextvolume,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 290;BA.debugLine="StopImmediately";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.audioplayer.class, "_stopimmediately" /*RemoteObject*/ );
 };
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _eventnamevalue,RemoteObject _targetpagevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "audioplayer","initialize", __ref, _ba, _eventnamevalue, _targetpagevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("eventNameValue", _eventnamevalue);
Debug.locals.put("targetPageValue", _targetpagevalue);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (eventNameValue As String, t";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="eventName = eventNameValue";
Debug.ShouldStop(1);
__ref.setField ("_eventname" /*RemoteObject*/ ,_eventnamevalue);
 BA.debugLineNum = 34;BA.debugLine="targetPage = targetPageValue";
Debug.ShouldStop(2);
__ref.setField ("_targetpage" /*RemoteObject*/ ,_targetpagevalue);
 BA.debugLineNum = 35;BA.debugLine="audioKey = ResolveAudioKey(eventName)";
Debug.ShouldStop(4);
__ref.setField ("_audiokey" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.audioplayer.class, "_resolveaudiokey" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_eventname" /*RemoteObject*/ ))));
 BA.debugLineNum = 36;BA.debugLine="loadTimer.Initialize(\"LoadTimer\", 10 * DateTime.T";
Debug.ShouldStop(8);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("LoadTimer")),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),audioplayer.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "*",0, 2)));
 BA.debugLineNum = 37;BA.debugLine="checkTimer.Initialize(\"CheckTimer\", CHECK_TIMER_I";
Debug.ShouldStop(16);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("CheckTimer")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_check_timer_interval_ms" /*RemoteObject*/ ))));
 BA.debugLineNum = 38;BA.debugLine="timeUpdateTimer.Initialize(\"TimeUpdateTimer\", 250";
Debug.ShouldStop(32);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("TimeUpdateTimer")),(Object)(BA.numberCast(long.class, 250)));
 BA.debugLineNum = 39;BA.debugLine="fadeTimer.Initialize(\"FadeTimer\", 40)";
Debug.ShouldStop(64);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("FadeTimer")),(Object)(BA.numberCast(long.class, 40)));
 BA.debugLineNum = 40;BA.debugLine="TraceAudio(\"Initialize\")";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Initialize")));
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
public static RemoteObject  _isloading(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsLoading (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("isloading")) { return __ref.runUserSub(false, "audioplayer","isloading", __ref);}
 BA.debugLineNum = 150;BA.debugLine="Public Sub IsLoading As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Return playerState = STATE_LOADING";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ ))));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("IsPlaying (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("isplaying")) { return __ref.runUserSub(false, "audioplayer","isplaying", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Public Sub IsPlaying As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Return playerState = STATE_PLAYING";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_playing" /*RemoteObject*/ ))));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("IsReady (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("isready")) { return __ref.runUserSub(false, "audioplayer","isready", __ref);}
 BA.debugLineNum = 154;BA.debugLine="Public Sub IsReady As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Return playerState = STATE_READY";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ ))));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("IsStopped (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("isstopped")) { return __ref.runUserSub(false, "audioplayer","isstopped", __ref);}
 BA.debugLineNum = 146;BA.debugLine="Public Sub IsStopped As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Return playerState = STATE_STOPPED";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_stopped" /*RemoteObject*/ ))));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("LoadTimer_Tick (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,262);
if (RapidSub.canDelegate("loadtimer_tick")) { return __ref.runUserSub(false, "audioplayer","loadtimer_tick", __ref);}
 BA.debugLineNum = 262;BA.debugLine="Private Sub LoadTimer_Tick";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(64);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 264;BA.debugLine="TraceAudio(\"Load timeout\")";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Load timeout")));
 BA.debugLineNum = 265;BA.debugLine="NotifyError(\"Track loading timeout expired\")";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Track loading timeout expired")));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("LoadUrl (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("loadurl")) { return __ref.runUserSub(false, "audioplayer","loadurl", __ref, _url, _volume);}
RemoteObject _startedat = RemoteObject.createImmutable(0L);
Debug.locals.put("url", _url);
Debug.locals.put("volume", _volume);
 BA.debugLineNum = 44;BA.debugLine="Public Sub LoadUrl(url As String, volume As Double";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim startedAt As Long = DateTime.Now";
Debug.ShouldStop(4096);
_startedat = audioplayer.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("startedAt", _startedat);Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 46;BA.debugLine="Reset";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="currentLoadToken = currentLoadToken + 1";
Debug.ShouldStop(16384);
__ref.setField ("_currentloadtoken" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 2));
 BA.debugLineNum = 48;BA.debugLine="activeEventLoadToken = currentLoadToken";
Debug.ShouldStop(32768);
__ref.setField ("_activeeventloadtoken" /*RemoteObject*/ ,__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ));
 BA.debugLineNum = 49;BA.debugLine="loadTimer.Interval = 10 * DateTime.TicksPerSecond";
Debug.ShouldStop(65536);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setInterval",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),audioplayer.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "*",0, 2));
 BA.debugLineNum = 50;BA.debugLine="loadTimer.Enabled = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 51;BA.debugLine="playerState = STATE_LOADING";
Debug.ShouldStop(262144);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_loading" /*RemoteObject*/ ));
 BA.debugLineNum = 52;BA.debugLine="maxVolume = Max(0, Min(1, volume))";
Debug.ShouldStop(524288);
__ref.setField ("_maxvolume" /*RemoteObject*/ ,audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(audioplayer.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(_volume)))));
 BA.debugLineNum = 53;BA.debugLine="TraceAudio(\"LoadUrl. volume=\" & NumberFormat2(max";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("LoadUrl. volume="),audioplayer.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(audioplayer.__c.getField(true,"False"))),RemoteObject.createImmutable(", url="),_url)));
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 55;BA.debugLine="player.Initialize(\"Player\", url)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Player")),(Object)(_url));
 BA.debugLineNum = 56;BA.debugLine="jo = player";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jo" /*RemoteObject*/ ).setObject (__ref.getField(false,"_player" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 57;BA.debugLine="jo.RunMethod(\"setOnError\", Array As Object(jo.Cr";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnError")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("java.lang.Runnable")),(Object)(BA.ObjectToString("Error")),(Object)((audioplayer.__c.getField(true,"False"))))})));
 BA.debugLineNum = 58;BA.debugLine="jo.RunMethod(\"setOnReady\", Array As Object(jo.Cr";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnReady")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(false,"CreateEventFromUI",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("java.lang.Runnable")),(Object)(BA.ObjectToString("Ready")),(Object)((audioplayer.__c.getField(true,"False"))))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 60;BA.debugLine="NotifyError(LastException.Message)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.audioplayer.class, "_notifyerror" /*RemoteObject*/ ,(Object)(audioplayer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 62;BA.debugLine="LogSlowOperation(\"LoadUrl\", startedAt)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.audioplayer.class, "_logslowoperation" /*RemoteObject*/ ,(Object)(BA.ObjectToString("LoadUrl")),(Object)(_startedat));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logslowoperation(RemoteObject __ref,RemoteObject _operationname,RemoteObject _startedat) throws Exception{
try {
		Debug.PushSubsStack("LogSlowOperation (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("logslowoperation")) { return __ref.runUserSub(false, "audioplayer","logslowoperation", __ref, _operationname, _startedat);}
RemoteObject _elapsed = RemoteObject.createImmutable(0L);
Debug.locals.put("operationName", _operationname);
Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 338;BA.debugLine="Private Sub LogSlowOperation(operationName As Stri";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="Dim elapsed As Long = DateTime.Now - startedAt";
Debug.ShouldStop(262144);
_elapsed = RemoteObject.solve(new RemoteObject[] {audioplayer.__c.getField(false,"DateTime").runMethod(true,"getNow"),_startedat}, "-",1, 2);Debug.locals.put("elapsed", _elapsed);Debug.locals.put("elapsed", _elapsed);
 BA.debugLineNum = 340;BA.debugLine="If elapsed < 50 Then Return";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_elapsed,BA.numberCast(long.class, 50))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 341;BA.debugLine="TraceDiagnostic(\"audio slow op=\" & eventName & \".";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.audioplayer.class, "_tracediagnostic" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("audio slow op="),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("."),_operationname,RemoteObject.createImmutable(" elapsedMs="),_elapsed,RemoteObject.createImmutable(" state="),__ref.getField(true,"_playerstate" /*RemoteObject*/ ))));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("NotifyError (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("notifyerror")) { return __ref.runUserSub(false, "audioplayer","notifyerror", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 226;BA.debugLine="Private Sub NotifyError(message As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="TraceAudio(\"NotifyError. message=\" & message)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("NotifyError. message="),_message)));
 BA.debugLineNum = 228;BA.debugLine="Reset";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.audioplayer.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 229;BA.debugLine="targetPage.AudioPlayer_Error(audioKey, message)";
Debug.ShouldStop(16);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_audioplayer_error" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_audiokey" /*RemoteObject*/ )),(Object)(_message));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Play (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("play")) { return __ref.runUserSub(false, "audioplayer","play", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Public Sub Play";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="PlayWithFade(0)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.audioplayer.class, "_playwithfade" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
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
public static RemoteObject  _player_complete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Player_Complete (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("player_complete")) { return __ref.runUserSub(false, "audioplayer","player_complete", __ref);}
 BA.debugLineNum = 208;BA.debugLine="Private Sub Player_Complete";
Debug.ShouldStop(32768);
 BA.debugLineNum = 209;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 210;BA.debugLine="TraceAudio(\"Complete ignored. stale_token=\" & ac";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Complete ignored. stale_token="),__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),RemoteObject.createImmutable(" current="),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))));
 BA.debugLineNum = 211;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 213;BA.debugLine="If playerState = STATE_STOPPED Then Return";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_stopped" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 214;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 215;BA.debugLine="checkTimer.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 216;BA.debugLine="timeUpdateTimer.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 217;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 218;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(33554432);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 219;BA.debugLine="currentVolume = 0";
Debug.ShouldStop(67108864);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 220;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(134217728);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 221;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(268435456);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 222;BA.debugLine="TraceAudio(\"Complete\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Complete")));
 BA.debugLineNum = 223;BA.debugLine="targetPage.AudioPlayer_Complete(audioKey)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_audioplayer_complete" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_audiokey" /*RemoteObject*/ )));
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("PlayWithFade (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("playwithfade")) { return __ref.runUserSub(false, "audioplayer","playwithfade", __ref, _fadetimems);}
Debug.locals.put("fadeTimeMs", _fadetimems);
 BA.debugLineNum = 70;BA.debugLine="Public Sub PlayWithFade(fadeTimeMs As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If playerState <> STATE_READY Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 72;BA.debugLine="TraceInternalError(\"play_with_fade_not_ready sta";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("play_with_fade_not_ready state="),__ref.getField(true,"_playerstate" /*RemoteObject*/ ))));
 BA.debugLineNum = 73;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 75;BA.debugLine="playerState = STATE_PLAYING";
Debug.ShouldStop(1024);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_playing" /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="lastPosition = 0";
Debug.ShouldStop(2048);
__ref.setField ("_lastposition" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 77;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(4096);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 78;BA.debugLine="checkTimer.Enabled = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="timeUpdateTimer.Enabled = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 80;BA.debugLine="If fadeTimeMs > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_fadetimems,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 81;BA.debugLine="SetPlayerVolume(0)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)));
 }else {
 BA.debugLineNum = 83;BA.debugLine="SetPlayerVolume(maxVolume)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 85;BA.debugLine="player.Play";
Debug.ShouldStop(1048576);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Play");
 BA.debugLineNum = 86;BA.debugLine="TraceAudio(\"PlayWithFade. fadeTimeMs=\" & fadeTime";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("PlayWithFade. fadeTimeMs="),_fadetimems,RemoteObject.createImmutable(", maxVolume="),audioplayer.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(audioplayer.__c.getField(true,"False"))))));
 BA.debugLineNum = 87;BA.debugLine="If fadeTimeMs > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_fadetimems,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="StartFade(FADE_IN, maxVolume, fadeTimeMs)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.audioplayer.class, "_startfade" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_fade_in" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_maxvolume" /*RemoteObject*/ )),(Object)(_fadetimems));
 };
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Position (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("position")) { return __ref.runUserSub(false, "audioplayer","position", __ref);}
 BA.debugLineNum = 162;BA.debugLine="Public Sub Position As Long";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="If player.IsInitialized = False Then Return 0";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(long.class, 0);};
 BA.debugLineNum = 164;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 165;BA.debugLine="Return player.Position";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, __ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"getPosition"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 167;BA.debugLine="Return 0";
Debug.ShouldStop(64);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Ready_Event (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("ready_event")) { return __ref.runUserSub(false, "audioplayer","ready_event", __ref, _methodname, _args);}
Debug.locals.put("methodName", _methodname);
Debug.locals.put("args", _args);
 BA.debugLineNum = 181;BA.debugLine="Private Sub Ready_Event(methodName As String, args";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 183;BA.debugLine="TraceAudio(\"Ready ignored. stale_token=\" & activ";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ready ignored. stale_token="),__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),RemoteObject.createImmutable(" current="),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))));
 BA.debugLineNum = 184;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 186;BA.debugLine="playerState = STATE_READY";
Debug.ShouldStop(33554432);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_ready" /*RemoteObject*/ ));
 BA.debugLineNum = 187;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="TraceAudio(\"Ready\")";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Ready")));
 BA.debugLineNum = 189;BA.debugLine="targetPage.AudioPlayer_Ready(audioKey)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_audioplayer_ready" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_audiokey" /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Reset (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "audioplayer","reset", __ref);}
RemoteObject _startedat = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 116;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim startedAt As Long = DateTime.Now";
Debug.ShouldStop(1048576);
_startedat = audioplayer.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("startedAt", _startedat);Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 118;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 119;BA.debugLine="checkTimer.Enabled = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 120;BA.debugLine="timeUpdateTimer.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 121;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(33554432);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 123;BA.debugLine="lastPosition = 0";
Debug.ShouldStop(67108864);
__ref.setField ("_lastposition" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 124;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(134217728);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 125;BA.debugLine="currentVolume = 0";
Debug.ShouldStop(268435456);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 126;BA.debugLine="activeEventLoadToken = 0";
Debug.ShouldStop(536870912);
__ref.setField ("_activeeventloadtoken" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 127;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(1073741824);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 128;BA.debugLine="If player.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 129;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 130;BA.debugLine="player.Volume = 0";
Debug.ShouldStop(2);
__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"setVolume",BA.numberCast(double.class, 0));
 BA.debugLineNum = 131;BA.debugLine="player.Stop";
Debug.ShouldStop(4);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Stop");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 133;BA.debugLine="TraceInternalError(\"reset_stop\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("reset_stop")));
 };
 BA.debugLineNum = 135;BA.debugLine="If jo.IsInitialized Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_jo" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 137;BA.debugLine="jo.RunMethod(\"dispose\", Null)";
Debug.ShouldStop(256);
__ref.getField(false,"_jo" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("dispose")),(Object)((audioplayer.__c.getField(false,"Null"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e23.toString()); BA.debugLineNum = 139;BA.debugLine="TraceInternalError(\"reset_dispose\")";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("reset_dispose")));
 };
 };
 };
 BA.debugLineNum = 143;BA.debugLine="LogSlowOperation(\"Reset\", startedAt)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.audioplayer.class, "_logslowoperation" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Reset")),(Object)(_startedat));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveaudiokey(RemoteObject __ref,RemoteObject _namevalue) throws Exception{
try {
		Debug.PushSubsStack("ResolveAudioKey (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("resolveaudiokey")) { return __ref.runUserSub(false, "audioplayer","resolveaudiokey", __ref, _namevalue);}
Debug.locals.put("nameValue", _namevalue);
 BA.debugLineNum = 356;BA.debugLine="Private Sub ResolveAudioKey(nameValue As String) A";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="If nameValue.ToLowerCase.Contains(\"secondary\") Th";
Debug.ShouldStop(16);
if (_namevalue.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("secondary"))).<Boolean>get().booleanValue()) { 
if (true) return BA.ObjectToString("secondary");};
 BA.debugLineNum = 358;BA.debugLine="Return \"primary\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("primary");
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("SetPlayerVolume (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("setplayervolume")) { return __ref.runUserSub(false, "audioplayer","setplayervolume", __ref, _volumevalue);}
Debug.locals.put("volumeValue", _volumevalue);
 BA.debugLineNum = 311;BA.debugLine="Private Sub SetPlayerVolume(volumeValue As Double)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="currentVolume = Max(0, Min(1, volumeValue))";
Debug.ShouldStop(8388608);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(audioplayer.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(_volumevalue)))));
 BA.debugLineNum = 313;BA.debugLine="If player.IsInitialized = False Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 314;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 315;BA.debugLine="player.Volume = currentVolume";
Debug.ShouldStop(67108864);
__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"setVolume",__ref.getField(true,"_currentvolume" /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 317;BA.debugLine="TraceInternalError(\"set_volume\")";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("set_volume")));
 };
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("StartFade (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("startfade")) { return __ref.runUserSub(false, "audioplayer","startfade", __ref, _mode, _targetvolume, _fadetimems);}
RemoteObject _intervalms = RemoteObject.createImmutable(0);
RemoteObject _steps = RemoteObject.createImmutable(0);
Debug.locals.put("mode", _mode);
Debug.locals.put("targetVolume", _targetvolume);
Debug.locals.put("fadeTimeMs", _fadetimems);
 BA.debugLineNum = 294;BA.debugLine="Private Sub StartFade(mode As Int, targetVolume As";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(64);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 296;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(128);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 297;BA.debugLine="If player.IsInitialized = False Then Return";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 298;BA.debugLine="If fadeTimeMs <= 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("k",_fadetimems,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 299;BA.debugLine="SetPlayerVolume(targetVolume)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.audioplayer.class, "_setplayervolume" /*RemoteObject*/ ,(Object)(_targetvolume));
 BA.debugLineNum = 300;BA.debugLine="If targetVolume <= 0 Then StopImmediately";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("k",_targetvolume,BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.audioplayer.class, "_stopimmediately" /*RemoteObject*/ );};
 BA.debugLineNum = 301;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 303;BA.debugLine="Dim intervalMs As Int = Max(20, fadeTimer.Interva";
Debug.ShouldStop(16384);
_intervalms = BA.numberCast(int.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 20)),(Object)(BA.numberCast(double.class, __ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"getInterval")))));Debug.locals.put("intervalMs", _intervalms);Debug.locals.put("intervalMs", _intervalms);
 BA.debugLineNum = 304;BA.debugLine="Dim steps As Int = Max(1, Ceil(fadeTimeMs / inter";
Debug.ShouldStop(32768);
_steps = BA.numberCast(int.class, audioplayer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(audioplayer.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_fadetimems,_intervalms}, "/",0, 0))))));Debug.locals.put("steps", _steps);Debug.locals.put("steps", _steps);
 BA.debugLineNum = 305;BA.debugLine="fadeMode = mode";
Debug.ShouldStop(65536);
__ref.setField ("_fademode" /*RemoteObject*/ ,_mode);
 BA.debugLineNum = 306;BA.debugLine="fadeTargetVolume = targetVolume";
Debug.ShouldStop(131072);
__ref.setField ("_fadetargetvolume" /*RemoteObject*/ ,_targetvolume);
 BA.debugLineNum = 307;BA.debugLine="fadeStepVolume = (targetVolume - currentVolume) /";
Debug.ShouldStop(262144);
__ref.setField ("_fadestepvolume" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_targetvolume,__ref.getField(true,"_currentvolume" /*RemoteObject*/ )}, "-",1, 0)),_steps}, "/",0, 0));
 BA.debugLineNum = 308;BA.debugLine="fadeTimer.Enabled = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"True"));
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Stop (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "audioplayer","stop", __ref, _fadetimems);}
RemoteObject _startedat = RemoteObject.createImmutable(0L);
Debug.locals.put("fadeTimeMs", _fadetimems);
 BA.debugLineNum = 93;BA.debugLine="Public Sub Stop(fadeTimeMs As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim startedAt As Long = DateTime.Now";
Debug.ShouldStop(536870912);
_startedat = audioplayer.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("startedAt", _startedat);Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 95;BA.debugLine="loadTimer.Enabled = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_loadtimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 96;BA.debugLine="checkTimer.Enabled = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_checktimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="timeUpdateTimer.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_timeupdatetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="lastPosition = 0";
Debug.ShouldStop(2);
__ref.setField ("_lastposition" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 99;BA.debugLine="stalledCheckCount = 0";
Debug.ShouldStop(4);
__ref.setField ("_stalledcheckcount" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 100;BA.debugLine="If player.IsInitialized = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 101;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(16);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 102;BA.debugLine="TraceAudio(\"Stop ignored. player not initialized";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Stop ignored. player not initialized.")));
 BA.debugLineNum = 103;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 105;BA.debugLine="TraceAudio(\"Stop. fadeTimeMs=\" & fadeTimeMs & \",";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Stop. fadeTimeMs="),_fadetimems,RemoteObject.createImmutable(", currentVolume="),audioplayer.__c.runMethod(true,"NumberFormat2",(Object)(__ref.getField(true,"_currentvolume" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(audioplayer.__c.getField(true,"False"))))));
 BA.debugLineNum = 106;BA.debugLine="If fadeTimeMs > 0 And currentVolume > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_fadetimems,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(true,"_currentvolume" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 107;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(1024);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 108;BA.debugLine="StartFade(FADE_OUT, 0, fadeTimeMs)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.audioplayer.class, "_startfade" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_fade_out" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(_fadetimems));
 }else {
 BA.debugLineNum = 110;BA.debugLine="StopImmediately";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.audioplayer.class, "_stopimmediately" /*RemoteObject*/ );
 };
 BA.debugLineNum = 112;BA.debugLine="LogSlowOperation(\"Stop\", startedAt)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.audioplayer.class, "_logslowoperation" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Stop")),(Object)(_startedat));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("StopImmediately (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("stopimmediately")) { return __ref.runUserSub(false, "audioplayer","stopimmediately", __ref);}
RemoteObject _startedat = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 321;BA.debugLine="Private Sub StopImmediately";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="Dim startedAt As Long = DateTime.Now";
Debug.ShouldStop(2);
_startedat = audioplayer.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("startedAt", _startedat);Debug.locals.put("startedAt", _startedat);
 BA.debugLineNum = 323;BA.debugLine="fadeTimer.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_fadetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",audioplayer.__c.getField(true,"False"));
 BA.debugLineNum = 324;BA.debugLine="fadeMode = FADE_NONE";
Debug.ShouldStop(8);
__ref.setField ("_fademode" /*RemoteObject*/ ,__ref.getField(true,"_fade_none" /*RemoteObject*/ ));
 BA.debugLineNum = 325;BA.debugLine="playerState = STATE_STOPPED";
Debug.ShouldStop(16);
__ref.setField ("_playerstate" /*RemoteObject*/ ,__ref.getField(true,"_state_stopped" /*RemoteObject*/ ));
 BA.debugLineNum = 326;BA.debugLine="currentVolume = 0";
Debug.ShouldStop(32);
__ref.setField ("_currentvolume" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 327;BA.debugLine="TraceAudio(\"StopImmediately\")";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceaudio" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("StopImmediately")));
 BA.debugLineNum = 328;BA.debugLine="If player.IsInitialized = False Then Return";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),audioplayer.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 329;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 330;BA.debugLine="player.Volume = 0";
Debug.ShouldStop(512);
__ref.getField(false,"_player" /*RemoteObject*/ ).runMethod(true,"setVolume",BA.numberCast(double.class, 0));
 BA.debugLineNum = 331;BA.debugLine="player.Stop";
Debug.ShouldStop(1024);
__ref.getField(false,"_player" /*RemoteObject*/ ).runVoidMethod ("Stop");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 333;BA.debugLine="TraceInternalError(\"stop_immediately\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.audioplayer.class, "_traceinternalerror" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("stop_immediately")));
 };
 BA.debugLineNum = 335;BA.debugLine="LogSlowOperation(\"StopImmediately\", startedAt)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.audioplayer.class, "_logslowoperation" /*RemoteObject*/ ,(Object)(BA.ObjectToString("StopImmediately")),(Object)(_startedat));
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("TimeUpdateTimer_Tick (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("timeupdatetimer_tick")) { return __ref.runUserSub(false, "audioplayer","timeupdatetimer_tick", __ref);}
 BA.debugLineNum = 232;BA.debugLine="Private Sub TimeUpdateTimer_Tick";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="If playerState <> STATE_PLAYING Then Return";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_playerstate" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_playing" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 234;BA.debugLine="If activeEventLoadToken <> currentLoadToken Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_activeeventloadtoken" /*RemoteObject*/ ),__ref.getField(true,"_currentloadtoken" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 235;BA.debugLine="targetPage.AudioPlayer_Timeupdate(audioKey)";
Debug.ShouldStop(1024);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_audioplayer_timeupdate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_audiokey" /*RemoteObject*/ )));
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("TraceAudio (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("traceaudio")) { return __ref.runUserSub(false, "audioplayer","traceaudio", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 352;BA.debugLine="Private Sub TraceAudio(message As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 353;BA.debugLine="targetPage.TraceLog(\"[\" & eventName & \"] \" & mess";
Debug.ShouldStop(1);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("] "),_message)));
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("TraceDiagnostic (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("tracediagnostic")) { return __ref.runUserSub(false, "audioplayer","tracediagnostic", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 348;BA.debugLine="Private Sub TraceDiagnostic(message As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="targetPage.TraceLog(message)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_tracelog" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("TraceInternalError (audioplayer) ","audioplayer",24,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("traceinternalerror")) { return __ref.runUserSub(false, "audioplayer","traceinternalerror", __ref, _context);}
Debug.locals.put("context", _context);
 BA.debugLineNum = 344;BA.debugLine="Private Sub TraceInternalError(context As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="targetPage.TraceLog(\"ошибка аудио internal contex";
Debug.ShouldStop(16777216);
__ref.getField(false,"_targetpage" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("ошибка аудио internal context="),_context,RemoteObject.createImmutable(" message="),audioplayer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}