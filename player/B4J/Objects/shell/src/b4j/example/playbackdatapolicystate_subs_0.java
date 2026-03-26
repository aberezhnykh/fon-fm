package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playbackdatapolicystate_subs_0 {


public static RemoteObject  _applytemporarymode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("ApplyTemporaryMode (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("applytemporarymode")) { return __ref.runUserSub(false, "playbackdatapolicystate","applytemporarymode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 70;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(64);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="ResumePlaybackWhenServerAllows = False";
Debug.ShouldStop(128);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="HasLocalMediaFallback = False";
Debug.ShouldStop(256);
__ref.setField ("_haslocalmediafallback" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("BeginOfflineDataRefresh (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("beginofflinedatarefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","beginofflinedatarefresh", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If IsOfflineDataRefreshInProgress Then Return Fal";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_isofflinedatarefreshinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackdatapolicystate.__c.getField(true,"False");};
 BA.debugLineNum = 29;BA.debugLine="IsOfflineDataRefreshInProgress = True";
Debug.ShouldStop(268435456);
__ref.setField ("_isofflinedatarefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 30;BA.debugLine="LastOfflineDataRefreshState = \"\"";
Debug.ShouldStop(536870912);
__ref.setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 31;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) return playbackdatapolicystate.__c.getField(true,"True");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("BeginTrackCacheRefresh (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("begintrackcacherefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","begintrackcacherefresh", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub BeginTrackCacheRefresh As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If IsTrackCacheRefreshInProgress Then Return Fals";
Debug.ShouldStop(128);
if (__ref.getField(true,"_istrackcacherefreshinprogress" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return playbackdatapolicystate.__c.getField(true,"False");};
 BA.debugLineNum = 41;BA.debugLine="IsTrackCacheRefreshInProgress = True";
Debug.ShouldStop(256);
__ref.setField ("_istrackcacherefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return playbackdatapolicystate.__c.getField(true,"True");
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public IsOfflineDataRefreshInProgress As Boolean";
playbackdatapolicystate._isofflinedatarefreshinprogress = RemoteObject.createImmutable(false);__ref.setField("_isofflinedatarefreshinprogress",playbackdatapolicystate._isofflinedatarefreshinprogress);
 //BA.debugLineNum = 6;BA.debugLine="Public IsTrackCacheRefreshInProgress As Boolean";
playbackdatapolicystate._istrackcacherefreshinprogress = RemoteObject.createImmutable(false);__ref.setField("_istrackcacherefreshinprogress",playbackdatapolicystate._istrackcacherefreshinprogress);
 //BA.debugLineNum = 7;BA.debugLine="Public HasLocalMediaFallback As Boolean";
playbackdatapolicystate._haslocalmediafallback = RemoteObject.createImmutable(false);__ref.setField("_haslocalmediafallback",playbackdatapolicystate._haslocalmediafallback);
 //BA.debugLineNum = 8;BA.debugLine="Public IsPlaybackPausedByPolicy As Boolean";
playbackdatapolicystate._isplaybackpausedbypolicy = RemoteObject.createImmutable(false);__ref.setField("_isplaybackpausedbypolicy",playbackdatapolicystate._isplaybackpausedbypolicy);
 //BA.debugLineNum = 9;BA.debugLine="Public ResumePlaybackWhenServerAllows As Boolean";
playbackdatapolicystate._resumeplaybackwhenserverallows = RemoteObject.createImmutable(false);__ref.setField("_resumeplaybackwhenserverallows",playbackdatapolicystate._resumeplaybackwhenserverallows);
 //BA.debugLineNum = 10;BA.debugLine="Public LastOfflineDataRefreshState As String";
playbackdatapolicystate._lastofflinedatarefreshstate = RemoteObject.createImmutable("");__ref.setField("_lastofflinedatarefreshstate",playbackdatapolicystate._lastofflinedatarefreshstate);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearpolicypause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPolicyPause (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("clearpolicypause")) { return __ref.runUserSub(false, "playbackdatapolicystate","clearpolicypause", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Public Sub ClearPolicyPause";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(16777216);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ClearPolicyPauseAndResumeRequest (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("clearpolicypauseandresumerequest")) { return __ref.runUserSub(false, "playbackdatapolicystate","clearpolicypauseandresumerequest", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(268435456);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="ResumePlaybackWhenServerAllows = False";
Debug.ShouldStop(536870912);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
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
public static RemoteObject  _endofflinedatarefresh(RemoteObject __ref,RemoteObject _refreshstate) throws Exception{
try {
		Debug.PushSubsStack("EndOfflineDataRefresh (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("endofflinedatarefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","endofflinedatarefresh", __ref, _refreshstate);}
Debug.locals.put("refreshState", _refreshstate);
 BA.debugLineNum = 34;BA.debugLine="Public Sub EndOfflineDataRefresh(refreshState As S";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="LastOfflineDataRefreshState = refreshState";
Debug.ShouldStop(4);
__ref.setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,_refreshstate);
 BA.debugLineNum = 36;BA.debugLine="IsOfflineDataRefreshInProgress = False";
Debug.ShouldStop(8);
__ref.setField ("_isofflinedatarefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("EndTrackCacheRefresh (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("endtrackcacherefresh")) { return __ref.runUserSub(false, "playbackdatapolicystate","endtrackcacherefresh", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub EndTrackCacheRefresh";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="IsTrackCacheRefreshInProgress = False";
Debug.ShouldStop(8192);
__ref.setField ("_istrackcacherefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("EnterLocalPlayback (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("enterlocalplayback")) { return __ref.runUserSub(false, "playbackdatapolicystate","enterlocalplayback", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Public Sub EnterLocalPlayback";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(2);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="HasLocalMediaFallback = True";
Debug.ShouldStop(4);
__ref.setField ("_haslocalmediafallback" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("EnterPolicyPause (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("enterpolicypause")) { return __ref.runUserSub(false, "playbackdatapolicystate","enterpolicypause", __ref, _connectionmode);}
Debug.locals.put("connectionMode", _connectionmode);
 BA.debugLineNum = 50;BA.debugLine="Public Sub EnterPolicyPause(connectionMode As Stri";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="IsPlaybackPausedByPolicy = True";
Debug.ShouldStop(262144);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="ResumePlaybackWhenServerAllows = True";
Debug.ShouldStop(524288);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="HasLocalMediaFallback = False";
Debug.ShouldStop(1048576);
__ref.setField ("_haslocalmediafallback" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playbackdatapolicystate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Reset";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playbackdatapolicystate.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Reset (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "playbackdatapolicystate","reset", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Public Sub Reset";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="IsOfflineDataRefreshInProgress = False";
Debug.ShouldStop(262144);
__ref.setField ("_isofflinedatarefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 20;BA.debugLine="IsTrackCacheRefreshInProgress = False";
Debug.ShouldStop(524288);
__ref.setField ("_istrackcacherefreshinprogress" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="HasLocalMediaFallback = False";
Debug.ShouldStop(1048576);
__ref.setField ("_haslocalmediafallback" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="IsPlaybackPausedByPolicy = False";
Debug.ShouldStop(2097152);
__ref.setField ("_isplaybackpausedbypolicy" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 23;BA.debugLine="ResumePlaybackWhenServerAllows = False";
Debug.ShouldStop(4194304);
__ref.setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="LastOfflineDataRefreshState = \"\"";
Debug.ShouldStop(8388608);
__ref.setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("SetRemoteDataReady (playbackdatapolicystate) ","playbackdatapolicystate",14,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setremotedataready")) { return __ref.runUserSub(false, "playbackdatapolicystate","setremotedataready", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub SetRemoteDataReady";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="HasLocalMediaFallback = False";
Debug.ShouldStop(4096);
__ref.setField ("_haslocalmediafallback" /*RemoteObject*/ ,playbackdatapolicystate.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}