package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackdatapolicystate_subs_0 {


public static RemoteObject  _applytemporarymode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("ApplyTemporaryMode (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("applytemporarymode")) { return __ref.runUserSub(false, "playbackdatapolicystate","applytemporarymode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 66;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(4);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="ResumePlaybackWhenServerAllows = False";
Debug.ShouldStop(8);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="IsLocalPlaybackMode = (mode = \"offline\")";
Debug.ShouldStop(16);
__ref.setField ("_islocalplaybackmode" /*RemoteObject*/ ,BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_mode,RemoteObject.createImmutable("offline")))));
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
public static RemoteObject  _beginofflinedatarefresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BeginOfflineDataRefresh (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("beginofflinedatarefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","beginofflinedatarefresh", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If IsOfflineDataRefreshInProgress Then Return Fal";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_isofflinedatarefreshinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackdatapolicystate.__c.getField(true,"False");};
 BA.debugLineNum = 26;BA.debugLine="IsOfflineDataRefreshInProgress = True";
Debug.ShouldStop(33554432);
__ref.setField ("_isofflinedatarefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 27;BA.debugLine="LastOfflineDataRefreshState = \"\"";
Debug.ShouldStop(67108864);
__ref.setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 28;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return playbackdatapolicystate.__c.getField(true,"True");
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _begintrackcacherefresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BeginTrackCacheRefresh (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("begintrackcacherefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","begintrackcacherefresh", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub BeginTrackCacheRefresh As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="If IsTrackCacheRefreshInProgress Then Return Fals";
Debug.ShouldStop(16);
if (__ref.getField(true,"_istrackcacherefreshinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackdatapolicystate.__c.getField(true,"False");};
 BA.debugLineNum = 38;BA.debugLine="IsTrackCacheRefreshInProgress = True";
Debug.ShouldStop(32);
__ref.setField ("_istrackcacherefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return playbackdatapolicystate.__c.getField(true,"True");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 3;BA.debugLine="Public IsOfflineDataRefreshInProgress As Boolean";
playbackdatapolicystate._isofflinedatarefreshinprogress = RemoteObject.createImmutable(false);__ref.setField("_isofflinedatarefreshinprogress",playbackdatapolicystate._isofflinedatarefreshinprogress);
 //BA.debugLineNum = 4;BA.debugLine="Public IsTrackCacheRefreshInProgress As Boolean";
playbackdatapolicystate._istrackcacherefreshinprogress = RemoteObject.createImmutable(false);__ref.setField("_istrackcacherefreshinprogress",playbackdatapolicystate._istrackcacherefreshinprogress);
 //BA.debugLineNum = 5;BA.debugLine="Public IsLocalPlaybackMode As Boolean";
playbackdatapolicystate._islocalplaybackmode = RemoteObject.createImmutable(false);__ref.setField("_islocalplaybackmode",playbackdatapolicystate._islocalplaybackmode);
 //BA.debugLineNum = 6;BA.debugLine="Public IsPlaybackPausedByPolicy As Boolean";
playbackdatapolicystate._isplaybackpausedbypolicy = RemoteObject.createImmutable(false);__ref.setField("_isplaybackpausedbypolicy",playbackdatapolicystate._isplaybackpausedbypolicy);
 //BA.debugLineNum = 7;BA.debugLine="Public ResumePlaybackWhenServerAllows As Boolean";
playbackdatapolicystate._resumeplaybackwhenserverallows = RemoteObject.createImmutable(false);__ref.setField("_resumeplaybackwhenserverallows",playbackdatapolicystate._resumeplaybackwhenserverallows);
 //BA.debugLineNum = 8;BA.debugLine="Public LastOfflineDataRefreshState As String";
playbackdatapolicystate._lastofflinedatarefreshstate = RemoteObject.createImmutable("");__ref.setField("_lastofflinedatarefreshstate",playbackdatapolicystate._lastofflinedatarefreshstate);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearpolicypause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPolicyPause (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("clearpolicypause")) { return __ref.runUserSub(false, "playbackdatapolicystate","clearpolicypause", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub ClearPolicyPause";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(1048576);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
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
public static RemoteObject  _clearpolicypauseandresumerequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPolicyPauseAndResumeRequest (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("clearpolicypauseandresumerequest")) { return __ref.runUserSub(false, "playbackdatapolicystate","clearpolicypauseandresumerequest", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(16777216);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="ResumePlaybackWhenServerAllows = False";
Debug.ShouldStop(33554432);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endofflinedatarefresh(RemoteObject __ref,RemoteObject _refreshstate) throws Exception{
try {
		Debug.PushSubsStack("EndOfflineDataRefresh (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("endofflinedatarefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","endofflinedatarefresh", __ref, _refreshstate);}
Debug.locals.put("refreshState", _refreshstate);
 BA.debugLineNum = 31;BA.debugLine="Public Sub EndOfflineDataRefresh(refreshState As S";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="LastOfflineDataRefreshState = refreshState";
Debug.ShouldStop(-2147483648);
__ref.setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,_refreshstate);
 BA.debugLineNum = 33;BA.debugLine="IsOfflineDataRefreshInProgress = False";
Debug.ShouldStop(1);
__ref.setField ("_isofflinedatarefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
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
public static RemoteObject  _endtrackcacherefresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndTrackCacheRefresh (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("endtrackcacherefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","endtrackcacherefresh", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub EndTrackCacheRefresh";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="IsTrackCacheRefreshInProgress = False";
Debug.ShouldStop(1024);
__ref.setField ("_istrackcacherefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
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
public static RemoteObject  _enterlocalplayback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterLocalPlayback (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("enterlocalplayback")) { return __ref.runUserSub(false, "playbackdatapolicystate","enterlocalplayback", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Public Sub EnterLocalPlayback";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(536870912);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 63;BA.debugLine="IsLocalPlaybackMode = True";
Debug.ShouldStop(1073741824);
__ref.setField ("_islocalplaybackmode" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterpolicypause(RemoteObject __ref,RemoteObject _connectionmode) throws Exception{
try {
		Debug.PushSubsStack("EnterPolicyPause (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("enterpolicypause")) { return __ref.runUserSub(false, "playbackdatapolicystate","enterpolicypause", __ref, _connectionmode);}
Debug.locals.put("connectionMode", _connectionmode);
 BA.debugLineNum = 46;BA.debugLine="Public Sub EnterPolicyPause(connectionMode As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="IsPlaybackPausedByPolicy = True";
Debug.ShouldStop(16384);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="ResumePlaybackWhenServerAllows = True";
Debug.ShouldStop(32768);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="IsLocalPlaybackMode = (connectionMode = \"offline\"";
Debug.ShouldStop(65536);
__ref.setField ("_islocalplaybackmode" /*RemoteObject*/ ,BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_connectionmode,RemoteObject.createImmutable("offline")))));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackdatapolicystate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Reset";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.playbackdatapolicystate.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Reset (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackdatapolicystate","reset", __ref);}
 BA.debugLineNum = 15;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="IsOfflineDataRefreshInProgress = False";
Debug.ShouldStop(32768);
__ref.setField ("_isofflinedatarefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="IsTrackCacheRefreshInProgress = False";
Debug.ShouldStop(65536);
__ref.setField ("_istrackcacherefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 18;BA.debugLine="IsLocalPlaybackMode = False";
Debug.ShouldStop(131072);
__ref.setField ("_islocalplaybackmode" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 19;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(262144);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 20;BA.debugLine="ResumePlaybackWhenServerAllows = False";
Debug.ShouldStop(524288);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="LastOfflineDataRefreshState = \"\"";
Debug.ShouldStop(1048576);
__ref.setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _setlocalfallbackready(RemoteObject __ref,RemoteObject _fallbackready) throws Exception{
try {
		Debug.PushSubsStack("SetLocalFallbackReady (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setlocalfallbackready")) { return __ref.runUserSub(false, "playbackdatapolicystate","setlocalfallbackready", __ref, _fallbackready);}
Debug.locals.put("fallbackReady", _fallbackready);
 BA.debugLineNum = 72;BA.debugLine="Public Sub SetLocalFallbackReady(fallbackReady As";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(256);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="IsLocalPlaybackMode = fallbackReady";
Debug.ShouldStop(512);
__ref.setField ("_islocalplaybackmode" /*RemoteObject*/ ,_fallbackready);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setremotedataready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetRemoteDataReady (playbackdatapolicystate) ","playbackdatapolicystate",9,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setremotedataready")) { return __ref.runUserSub(false, "playbackdatapolicystate","setremotedataready", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Public Sub SetRemoteDataReady";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="IsLocalPlaybackMode = False";
Debug.ShouldStop(8192);
__ref.setField ("_islocalplaybackmode" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}