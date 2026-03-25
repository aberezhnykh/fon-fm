package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playerstatestore_subs_0 {


public static RemoteObject  _applyclientrequestheaders(RemoteObject __ref,RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("ApplyClientRequestHeaders (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("applyclientrequestheaders")) { return __ref.runUserSub(false, "playerstatestore","applyclientrequestheaders", __ref, _j);}
Debug.locals.put("j", _j);
 BA.debugLineNum = 138;BA.debugLine="Public Sub ApplyClientRequestHeaders(j As HttpJob)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="owner.Data_ApplyClientRequestHeaders(j)";
Debug.ShouldStop(1024);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_applyclientrequestheaders" /*RemoteObject*/ ,(Object)(_j));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _applytemporarymode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("ApplyTemporaryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("applytemporarymode")) { return __ref.runUserSub(false, "playerstatestore","applytemporarymode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 313;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="owner.Data_ApplyTemporaryMode(mode)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_applytemporarymode" /*RemoteObject*/ ,(Object)(_mode));
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("BeginOfflineDataRefresh (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("beginofflinedatarefresh")) { return __ref.runUserSub(false, "playerstatestore","beginofflinedatarefresh", __ref);}
 BA.debugLineNum = 150;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Return policyState.BeginOfflineDataRefresh";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackdatapolicystate.class, "_beginofflinedatarefresh" /*RemoteObject*/ );
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
public static RemoteObject  _builddataslotkey(RemoteObject __ref,RemoteObject _currentslot) throws Exception{
try {
		Debug.PushSubsStack("BuildDataSlotKey (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("builddataslotkey")) { return __ref.runUserSub(false, "playerstatestore","builddataslotkey", __ref, _currentslot);}
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 611;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkforappupdate(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("CheckForAppUpdate (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("checkforappupdate")) { return __ref.runUserSub(false, "playerstatestore","checkforappupdate", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 106;BA.debugLine="Public Sub CheckForAppUpdate(data As Map)";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="owner.Data_CheckForAppUpdate(data)";
Debug.ShouldStop(1024);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_checkforappupdate" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claimurlvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClaimUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("claimurlvalue")) { return __ref.runUserSub(false, "playerstatestore","claimurlvalue", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Public Sub ClaimUrlValue As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Return owner.ClaimUrlValue";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_claimurlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 6;BA.debugLine="Private owner As B4XMainPage";
playerstatestore._owner = RemoteObject.createNew ("b4j.example.b4xmainpage");__ref.setField("_owner",playerstatestore._owner);
 //BA.debugLineNum = 7;BA.debugLine="Private policyState As PlaybackDataPolicyState";
playerstatestore._policystate = RemoteObject.createNew ("b4j.example.playbackdatapolicystate");__ref.setField("_policystate",playerstatestore._policystate);
 //BA.debugLineNum = 8;BA.debugLine="Private orchestrationStateRef As PlaybackOrchestr";
playerstatestore._orchestrationstateref = RemoteObject.createNew ("b4j.example.playbackorchestrationstate");__ref.setField("_orchestrationstateref",playerstatestore._orchestrationstateref);
 //BA.debugLineNum = 9;BA.debugLine="Private offlineStoreRef As OfflineStore";
playerstatestore._offlinestoreref = RemoteObject.createNew ("b4j.example.offlinestore");__ref.setField("_offlinestoreref",playerstatestore._offlinestoreref);
 //BA.debugLineNum = 10;BA.debugLine="Private dataResolverRef As DataPlaybackResolver";
playerstatestore._dataresolverref = RemoteObject.createNew ("b4j.example.dataplaybackresolver");__ref.setField("_dataresolverref",playerstatestore._dataresolverref);
 //BA.debugLineNum = 11;BA.debugLine="Private mediaCacheRef As MediaCache";
playerstatestore._mediacacheref = RemoteObject.createNew ("b4j.example.mediacache");__ref.setField("_mediacacheref",playerstatestore._mediacacheref);
 //BA.debugLineNum = 12;BA.debugLine="Private storageRef As KeyValueStore";
playerstatestore._storageref = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_storageref",playerstatestore._storageref);
 //BA.debugLineNum = 13;BA.debugLine="Private trustedSyncTimeKeyValue As String";
playerstatestore._trustedsynctimekeyvalue = RemoteObject.createImmutable("");__ref.setField("_trustedsynctimekeyvalue",playerstatestore._trustedsynctimekeyvalue);
 //BA.debugLineNum = 14;BA.debugLine="Private retryTimerRef As Timer";
playerstatestore._retrytimerref = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_retrytimerref",playerstatestore._retrytimerref);
 //BA.debugLineNum = 15;BA.debugLine="Private offlineDataRef As Map";
playerstatestore._offlinedataref = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_offlinedataref",playerstatestore._offlinedataref);
 //BA.debugLineNum = 16;BA.debugLine="Private consecutiveNetworkErrors As Int";
playerstatestore._consecutivenetworkerrors = RemoteObject.createImmutable(0);__ref.setField("_consecutivenetworkerrors",playerstatestore._consecutivenetworkerrors);
 //BA.debugLineNum = 17;BA.debugLine="Private lastRetryMode As String";
playerstatestore._lastretrymode = RemoteObject.createImmutable("");__ref.setField("_lastretrymode",playerstatestore._lastretrymode);
 //BA.debugLineNum = 18;BA.debugLine="Private dataSuccessAtTicks As Long";
playerstatestore._datasuccessatticks = RemoteObject.createImmutable(0L);__ref.setField("_datasuccessatticks",playerstatestore._datasuccessatticks);
 //BA.debugLineNum = 19;BA.debugLine="Private historySuccessAtTicks As Long";
playerstatestore._historysuccessatticks = RemoteObject.createImmutable(0L);__ref.setField("_historysuccessatticks",playerstatestore._historysuccessatticks);
 //BA.debugLineNum = 20;BA.debugLine="Private startupSequenceInProgress As Boolean";
playerstatestore._startupsequenceinprogress = RemoteObject.createImmutable(false);__ref.setField("_startupsequenceinprogress",playerstatestore._startupsequenceinprogress);
 //BA.debugLineNum = 21;BA.debugLine="Private adWarmupDeferredAfterStartup As Boolean";
playerstatestore._adwarmupdeferredafterstartup = RemoteObject.createImmutable(false);__ref.setField("_adwarmupdeferredafterstartup",playerstatestore._adwarmupdeferredafterstartup);
 //BA.debugLineNum = 22;BA.debugLine="Private localRetryDelay As Int";
playerstatestore._localretrydelay = RemoteObject.createImmutable(0);__ref.setField("_localretrydelay",playerstatestore._localretrydelay);
 //BA.debugLineNum = 23;BA.debugLine="Private serverRetryDelay As Int";
playerstatestore._serverretrydelay = RemoteObject.createImmutable(0);__ref.setField("_serverretrydelay",playerstatestore._serverretrydelay);
 //BA.debugLineNum = 24;BA.debugLine="Private dispatchRetryAfter As Int";
playerstatestore._dispatchretryafter = RemoteObject.createImmutable(0);__ref.setField("_dispatchretryafter",playerstatestore._dispatchretryafter);
 //BA.debugLineNum = 25;BA.debugLine="Private mediaPathDegradedFlag As Boolean";
playerstatestore._mediapathdegradedflag = RemoteObject.createImmutable(false);__ref.setField("_mediapathdegradedflag",playerstatestore._mediapathdegradedflag);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleardispatchretryafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearDispatchRetryAfter (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("cleardispatchretryafter")) { return __ref.runUserSub(false, "playerstatestore","cleardispatchretryafter", __ref);}
 BA.debugLineNum = 549;BA.debugLine="Public Sub ClearDispatchRetryAfter";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="dispatchRetryAfter = 0";
Debug.ShouldStop(32);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearlastretrymode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearLastRetryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("clearlastretrymode")) { return __ref.runUserSub(false, "playerstatestore","clearlastretrymode", __ref);}
 BA.debugLineNum = 62;BA.debugLine="Public Sub ClearLastRetryMode";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="lastRetryMode = \"\"";
Debug.ShouldStop(1073741824);
__ref.setField ("_lastretrymode" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _clearplaybackstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPlaybackState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("clearplaybackstate")) { return __ref.runUserSub(false, "playerstatestore","clearplaybackstate", __ref);}
 BA.debugLineNum = 317;BA.debugLine="Public Sub ClearPlaybackState";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="owner.Data_ClearPlaybackState";
Debug.ShouldStop(536870912);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_clearplaybackstate" /*RemoteObject*/ );
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
public static RemoteObject  _clearpolicypause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearPolicyPause (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,300);
if (RapidSub.canDelegate("clearpolicypause")) { return __ref.runUserSub(false, "playerstatestore","clearpolicypause", __ref);}
 BA.debugLineNum = 300;BA.debugLine="Public Sub ClearPolicyPause";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="owner.Data_ClearPolicyPause";
Debug.ShouldStop(4096);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_clearpolicypause" /*RemoteObject*/ );
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ClearPolicyPauseAndResumeRequest (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("clearpolicypauseandresumerequest")) { return __ref.runUserSub(false, "playerstatestore","clearpolicypauseandresumerequest", __ref);}
 BA.debugLineNum = 341;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 342;BA.debugLine="owner.Data_ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(2097152);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_clearpolicypauseandresumerequest" /*RemoteObject*/ );
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearresumeplaybackwhenserverallows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearResumePlaybackWhenServerAllows (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("clearresumeplaybackwhenserverallows")) { return __ref.runUserSub(false, "playerstatestore","clearresumeplaybackwhenserverallows", __ref);}
 BA.debugLineNum = 174;BA.debugLine="Public Sub ClearResumePlaybackWhenServerAllows";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="policyState.ResumePlaybackWhenServerAllows = Fals";
Debug.ShouldStop(16384);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearretrytimer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearRetryTimer (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,519);
if (RapidSub.canDelegate("clearretrytimer")) { return __ref.runUserSub(false, "playerstatestore","clearretrytimer", __ref);}
 BA.debugLineNum = 519;BA.debugLine="Public Sub ClearRetryTimer";
Debug.ShouldStop(64);
 BA.debugLineNum = 520;BA.debugLine="retryTimerRef.Enabled = False";
Debug.ShouldStop(128);
__ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"setEnabled",playerstatestore.__c.getField(true,"False"));
 BA.debugLineNum = 521;BA.debugLine="ClearLastRetryMode";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_clearlastretrymode" /*RemoteObject*/ );
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clientosnamevalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClientOsNameValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("clientosnamevalue")) { return __ref.runUserSub(false, "playerstatestore","clientosnamevalue", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Public Sub ClientOsNameValue As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Return owner.ClientOsNameValue";
Debug.ShouldStop(1073741824);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_clientosnamevalue" /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clonemap(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("CloneMap (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,615);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "playerstatestore","clonemap", __ref, _sourcemap);}
RemoteObject _clonedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 615;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(64);
 BA.debugLineNum = 616;BA.debugLine="Dim clonedMap As Map";
Debug.ShouldStop(128);
_clonedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("clonedMap", _clonedmap);
 BA.debugLineNum = 617;BA.debugLine="clonedMap.Initialize";
Debug.ShouldStop(256);
_clonedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 618;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return _clonedmap;};
 BA.debugLineNum = 619;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 620;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(2048);
_clonedmap.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 622;BA.debugLine="Return clonedMap";
Debug.ShouldStop(8192);
if (true) return _clonedmap;
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consumedispatchretryafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumeDispatchRetryAfter (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("consumedispatchretryafter")) { return __ref.runUserSub(false, "playerstatestore","consumedispatchretryafter", __ref);}
RemoteObject _value = RemoteObject.createImmutable(0);
 BA.debugLineNum = 557;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Dim value As Int = dispatchRetryAfter";
Debug.ShouldStop(8192);
_value = __ref.getField(true,"_dispatchretryafter" /*RemoteObject*/ );Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 559;BA.debugLine="dispatchRetryAfter = 0";
Debug.ShouldStop(16384);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 560;BA.debugLine="Return value";
Debug.ShouldStop(32768);
if (true) return _value;
 BA.debugLineNum = 561;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _consumelastexception(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConsumeLastException (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("consumelastexception")) { return __ref.runUserSub(false, "playerstatestore","consumelastexception", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub ConsumeLastException";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="owner.Data_ConsumeLastException";
Debug.ShouldStop(64);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_consumelastexception" /*RemoteObject*/ );
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dataurlvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DataUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("dataurlvalue")) { return __ref.runUserSub(false, "playerstatestore","dataurlvalue", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Public Sub DataUrlValue As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Return owner.DataUrlValue";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_dataurlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deferadwarmupafterstartup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DeferAdWarmupAfterStartup (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("deferadwarmupafterstartup")) { return __ref.runUserSub(false, "playerstatestore","deferadwarmupafterstartup", __ref);}
 BA.debugLineNum = 241;BA.debugLine="Public Sub DeferAdWarmupAfterStartup";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="adWarmupDeferredAfterStartup = True";
Debug.ShouldStop(131072);
__ref.setField ("_adwarmupdeferredafterstartup" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"True"));
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deviceidvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DeviceIdValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("deviceidvalue")) { return __ref.runUserSub(false, "playerstatestore","deviceidvalue", __ref);}
 BA.debugLineNum = 86;BA.debugLine="Public Sub DeviceIdValue As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Return owner.DeviceIdValue";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_deviceidvalue" /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disablebackgroundrefreshtimers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DisableBackgroundRefreshTimers (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("disablebackgroundrefreshtimers")) { return __ref.runUserSub(false, "playerstatestore","disablebackgroundrefreshtimers", __ref);}
 BA.debugLineNum = 382;BA.debugLine="Public Sub DisableBackgroundRefreshTimers";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 383;BA.debugLine="owner.Data_DisableBackgroundRefreshTimers";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_disablebackgroundrefreshtimers" /*RemoteObject*/ );
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _effectivenowticks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EffectiveNowTicks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("effectivenowticks")) { return __ref.runUserSub(false, "playerstatestore","effectivenowticks", __ref);}
RemoteObject _devicenow = RemoteObject.createImmutable(0L);
RemoteObject _trustednow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 253;BA.debugLine="Public Sub EffectiveNowTicks As Long";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
Debug.ShouldStop(536870912);
_devicenow = playerstatestore.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("deviceNow", _devicenow);Debug.locals.put("deviceNow", _devicenow);
 BA.debugLineNum = 255;BA.debugLine="Dim trustedNow As Long = storageRef.GetDefault(tr";
Debug.ShouldStop(1073741824);
_trustednow = BA.numberCast(long.class, __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_trustedsynctimekeyvalue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("trustedNow", _trustednow);Debug.locals.put("trustedNow", _trustednow);
 BA.debugLineNum = 256;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_trustednow,_devicenow)) { 
if (true) return _trustednow;};
 BA.debugLineNum = 257;BA.debugLine="Return deviceNow";
Debug.ShouldStop(1);
if (true) return _devicenow;
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enableretrytimer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnableRetryTimer (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,536);
if (RapidSub.canDelegate("enableretrytimer")) { return __ref.runUserSub(false, "playerstatestore","enableretrytimer", __ref);}
 BA.debugLineNum = 536;BA.debugLine="Public Sub EnableRetryTimer";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 537;BA.debugLine="retryTimerRef.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"setEnabled",playerstatestore.__c.getField(true,"True"));
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endofflinedatarefresh(RemoteObject __ref,RemoteObject _statevalue) throws Exception{
try {
		Debug.PushSubsStack("EndOfflineDataRefresh (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("endofflinedatarefresh")) { return __ref.runUserSub(false, "playerstatestore","endofflinedatarefresh", __ref, _statevalue);}
Debug.locals.put("stateValue", _statevalue);
 BA.debugLineNum = 154;BA.debugLine="Public Sub EndOfflineDataRefresh(stateValue As Str";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="policyState.EndOfflineDataRefresh(stateValue)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackdatapolicystate.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(_statevalue));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensureadcachesyncasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnsureAdCacheSyncAsync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("ensureadcachesyncasync")) { return __ref.runUserSub(false, "playerstatestore","ensureadcachesyncasync", __ref);}
 BA.debugLineNum = 249;BA.debugLine="Public Sub EnsureAdCacheSyncAsync";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="owner.Data_EnsureAdCacheSyncAsync";
Debug.ShouldStop(33554432);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_ensureadcachesyncasync" /*RemoteObject*/ );
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("EnterLocalPlayback (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("enterlocalplayback")) { return __ref.runUserSub(false, "playerstatestore","enterlocalplayback", __ref);}
 BA.debugLineNum = 353;BA.debugLine="Public Sub EnterLocalPlayback";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="owner.Data_EnterLocalPlayback";
Debug.ShouldStop(2);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_enterlocalplayback" /*RemoteObject*/ );
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterpolicypause(RemoteObject __ref,RemoteObject _reason,RemoteObject _connectionmode) throws Exception{
try {
		Debug.PushSubsStack("EnterPolicyPause (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("enterpolicypause")) { return __ref.runUserSub(false, "playerstatestore","enterpolicypause", __ref, _reason, _connectionmode);}
Debug.locals.put("reason", _reason);
Debug.locals.put("connectionMode", _connectionmode);
 BA.debugLineNum = 333;BA.debugLine="Public Sub EnterPolicyPause(reason As String, conn";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="owner.Data_EnterPolicyPause(reason, connectionMod";
Debug.ShouldStop(8192);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_enterpolicypause" /*RemoteObject*/ ,(Object)(_reason),(Object)(_connectionmode));
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enterstartedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterStartedState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("enterstartedstate")) { return __ref.runUserSub(false, "playerstatestore","enterstartedstate", __ref);}
 BA.debugLineNum = 284;BA.debugLine="Public Sub EnterStartedState";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="orchestrationStateRef.EnterStartedState";
Debug.ShouldStop(268435456);
__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackorchestrationstate.class, "_enterstartedstate" /*RemoteObject*/ );
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enteruserstoppedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterUserStoppedState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("enteruserstoppedstate")) { return __ref.runUserSub(false, "playerstatestore","enteruserstoppedstate", __ref);}
 BA.debugLineNum = 345;BA.debugLine="Public Sub EnterUserStoppedState";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="owner.Data_EnterUserStoppedState";
Debug.ShouldStop(33554432);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_enteruserstoppedstate" /*RemoteObject*/ );
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _flushtracebufferasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FlushTraceBufferAsync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("flushtracebufferasync")) { return __ref.runUserSub(false, "playerstatestore","flushtracebufferasync", __ref);}
 BA.debugLineNum = 216;BA.debugLine="Public Sub FlushTraceBufferAsync";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="owner.Data_FlushTraceBufferAsync";
Debug.ShouldStop(16777216);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_flushtracebufferasync" /*RemoteObject*/ );
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getconsecutivenetworkerrors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetConsecutiveNetworkErrors (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("getconsecutivenetworkerrors")) { return __ref.runUserSub(false, "playerstatestore","getconsecutivenetworkerrors", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Public Sub GetConsecutiveNetworkErrors As Int";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Return consecutiveNetworkErrors";
Debug.ShouldStop(262144);
if (true) return __ref.getField(true,"_consecutivenetworkerrors" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentslotlocalreservecount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentSlotLocalReserveCount (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("getcurrentslotlocalreservecount")) { return __ref.runUserSub(false, "playerstatestore","getcurrentslotlocalreservecount", __ref);}
 BA.debugLineNum = 361;BA.debugLine="Public Sub GetCurrentSlotLocalReserveCount As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 362;BA.debugLine="Return owner.Data_GetCurrentSlotLocalReserveCount";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_getcurrentslotlocalreservecount" /*RemoteObject*/ );
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastdataokat(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastDataOkAt (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getlastdataokat")) { return __ref.runUserSub(false, "playerstatestore","getlastdataokat", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Public Sub GetLastDataOkAt As Long";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Return dataSuccessAtTicks";
Debug.ShouldStop(64);
if (true) return __ref.getField(true,"_datasuccessatticks" /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlasthistoryokat(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastHistoryOkAt (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("getlasthistoryokat")) { return __ref.runUserSub(false, "playerstatestore","getlasthistoryokat", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub GetLastHistoryOkAt As Long";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Return historySuccessAtTicks";
Debug.ShouldStop(16384);
if (true) return __ref.getField(true,"_historysuccessatticks" /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastretrymode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastRetryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("getlastretrymode")) { return __ref.runUserSub(false, "playerstatestore","getlastretrymode", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub GetLastRetryMode As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return lastRetryMode";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(true,"_lastretrymode" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlocalplayablequeuecount(RemoteObject __ref,RemoteObject _playqueue) throws Exception{
try {
		Debug.PushSubsStack("GetLocalPlayableQueueCount (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("getlocalplayablequeuecount")) { return __ref.runUserSub(false, "playerstatestore","getlocalplayablequeuecount", __ref, _playqueue);}
RemoteObject _totalcount = RemoteObject.createImmutable(0);
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playQueue", _playqueue);
 BA.debugLineNum = 365;BA.debugLine="Public Sub GetLocalPlayableQueueCount(playQueue As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="If playQueue.IsInitialized = False Then Return 0";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 367;BA.debugLine="Dim totalCount As Int = 0";
Debug.ShouldStop(16384);
_totalcount = BA.numberCast(int.class, 0);Debug.locals.put("totalCount", _totalcount);Debug.locals.put("totalCount", _totalcount);
 BA.debugLineNum = 368;BA.debugLine="For Each itemObject As Object In playQueue";
Debug.ShouldStop(32768);
{
final RemoteObject group3 = _playqueue;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobject = group3.runMethod(false,"Get",index3);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 369;BA.debugLine="If (itemObject Is Map) = False Then Continue";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map")))),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 370;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(131072);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 371;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then C";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) continue;};
 BA.debugLineNum = 372;BA.debugLine="If mediaCacheRef.HasValidatedLocalMedia(item) =";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_hasvalidatedlocalmedia" /*RemoteObject*/ ,(Object)(_item)),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 373;BA.debugLine="totalCount = totalCount + 1";
Debug.ShouldStop(1048576);
_totalcount = RemoteObject.solve(new RemoteObject[] {_totalcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("totalCount", _totalcount);
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 375;BA.debugLine="Return totalCount";
Debug.ShouldStop(4194304);
if (true) return _totalcount;
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getretryinterval(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRetryInterval (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,528);
if (RapidSub.canDelegate("getretryinterval")) { return __ref.runUserSub(false, "playerstatestore","getretryinterval", __ref);}
 BA.debugLineNum = 528;BA.debugLine="Public Sub GetRetryInterval As Int";
Debug.ShouldStop(32768);
 BA.debugLineNum = 529;BA.debugLine="Return retryTimerRef.Interval";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"getInterval"));
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlemessageitem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("HandleMessageItem (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("handlemessageitem")) { return __ref.runUserSub(false, "playerstatestore","handlemessageitem", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 304;BA.debugLine="Public Sub HandleMessageItem(item As Map)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="owner.Data_HandleMessageItem(item)";
Debug.ShouldStop(65536);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_handlemessageitem" /*RemoteObject*/ ,(Object)(_item));
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasanycachedtrack(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasAnyCachedTrack (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("hasanycachedtrack")) { return __ref.runUserSub(false, "playerstatestore","hasanycachedtrack", __ref);}
RemoteObject _playliststats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 603;BA.debugLine="Public Sub HasAnyCachedTrack As Boolean";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 604;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_ensuretrackcacheready" /*RemoteObject*/ );
 BA.debugLineNum = 605;BA.debugLine="If mediaCacheRef.GetCachedTrackCount > 0 Then Ret";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_getcachedtrackcount" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return playerstatestore.__c.getField(true,"True");};
 BA.debugLineNum = 606;BA.debugLine="Dim playlistStats As Map = mediaCacheRef.GetCache";
Debug.ShouldStop(536870912);
_playliststats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playliststats = __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_getcachedtrackplayliststats" /*RemoteObject*/ );Debug.locals.put("playlistStats", _playliststats);Debug.locals.put("playlistStats", _playliststats);
 BA.debugLineNum = 607;BA.debugLine="If playlistStats.IsInitialized And playlistStats.";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",_playliststats.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_playliststats.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playerstatestore.__c.getField(true,"True");};
 BA.debugLineNum = 608;BA.debugLine="Return mediaCacheRef.HasAnyTrackFilesOnDisk";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_hasanytrackfilesondisk" /*RemoteObject*/ );
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _haslocalplaybackfallback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasLocalPlaybackFallback (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,357);
if (RapidSub.canDelegate("haslocalplaybackfallback")) { return __ref.runUserSub(false, "playerstatestore","haslocalplaybackfallback", __ref);}
 BA.debugLineNum = 357;BA.debugLine="Public Sub HasLocalPlaybackFallback As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="Return owner.Data_HasLocalPlaybackFallback";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_haslocalplaybackfallback" /*RemoteObject*/ );
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasusabledataplaybackinstructions(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasUsableDataPlaybackInstructions (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("hasusabledataplaybackinstructions")) { return __ref.runUserSub(false, "playerstatestore","hasusabledataplaybackinstructions", __ref);}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _schedules = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 439;BA.debugLine="Private Sub HasUsableDataPlaybackInstructions As B";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="Dim data As Map = OfflineData";
Debug.ShouldStop(8388608);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = __ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ );Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 441;BA.debugLine="If data.IsInitialized = False Then Return False";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_data.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 442;BA.debugLine="If data.GetDefault(\"ok\", False) <> True Then Retu";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True")))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 443;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
Debug.ShouldStop(67108864);
_schedules = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_schedules = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedules"))),(Object)(playerstatestore.__c.getField(false,"Null"))));Debug.locals.put("schedules", _schedules);Debug.locals.put("schedules", _schedules);
 BA.debugLineNum = 444;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_schedules.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_schedules.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 445;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return playerstatestore.__c.getField(true,"True");
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidecontentblocks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HideContentBlocks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("hidecontentblocks")) { return __ref.runUserSub(false, "playerstatestore","hidecontentblocks", __ref);}
 BA.debugLineNum = 292;BA.debugLine="Public Sub HideContentBlocks";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="owner.Data_HideContentBlocks";
Debug.ShouldStop(16);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidepin(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HidePin (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("hidepin")) { return __ref.runUserSub(false, "playerstatestore","hidepin", __ref);}
 BA.debugLineNum = 321;BA.debugLine="Public Sub HidePin";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="owner.Data_HidePin";
Debug.ShouldStop(2);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _incrementnetworkerrorcount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IncrementNetworkErrorCount (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("incrementnetworkerrorcount")) { return __ref.runUserSub(false, "playerstatestore","incrementnetworkerrorcount", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub IncrementNetworkErrorCount";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErro";
Debug.ShouldStop(1024);
__ref.setField ("_consecutivenetworkerrors" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_consecutivenetworkerrors" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mainpage,RemoteObject _retrytimervalue,RemoteObject _datapolicyvalue,RemoteObject _orchestrationstatevalue,RemoteObject _storagevalue,RemoteObject _trustedsynckeyvalue,RemoteObject _offlinestorevalue,RemoteObject _dataresolvervalue,RemoteObject _mediacachevalue,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playerstatestore","initialize", __ref, _ba, _mainpage, _retrytimervalue, _datapolicyvalue, _orchestrationstatevalue, _storagevalue, _trustedsynckeyvalue, _offlinestorevalue, _dataresolvervalue, _mediacachevalue, _localretryinitial, _serverretryinitial);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mainPage", _mainpage);
Debug.locals.put("retryTimerValue", _retrytimervalue);
Debug.locals.put("dataPolicyValue", _datapolicyvalue);
Debug.locals.put("orchestrationStateValue", _orchestrationstatevalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("trustedSyncKeyValue", _trustedsynckeyvalue);
Debug.locals.put("offlineStoreValue", _offlinestorevalue);
Debug.locals.put("dataResolverValue", _dataresolvervalue);
Debug.locals.put("mediaCacheValue", _mediacachevalue);
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize(mainPage As B4XMainPage, ret";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="owner = mainPage";
Debug.ShouldStop(268435456);
__ref.setField ("_owner" /*RemoteObject*/ ,_mainpage);
 BA.debugLineNum = 30;BA.debugLine="policyState = dataPolicyValue";
Debug.ShouldStop(536870912);
__ref.setField ("_policystate" /*RemoteObject*/ ,_datapolicyvalue);
 BA.debugLineNum = 31;BA.debugLine="orchestrationStateRef = orchestrationStateValue";
Debug.ShouldStop(1073741824);
__ref.setField ("_orchestrationstateref" /*RemoteObject*/ ,_orchestrationstatevalue);
 BA.debugLineNum = 32;BA.debugLine="offlineStoreRef = offlineStoreValue";
Debug.ShouldStop(-2147483648);
__ref.setField ("_offlinestoreref" /*RemoteObject*/ ,_offlinestorevalue);
 BA.debugLineNum = 33;BA.debugLine="dataResolverRef = dataResolverValue";
Debug.ShouldStop(1);
__ref.setField ("_dataresolverref" /*RemoteObject*/ ,_dataresolvervalue);
 BA.debugLineNum = 34;BA.debugLine="mediaCacheRef = mediaCacheValue";
Debug.ShouldStop(2);
__ref.setField ("_mediacacheref" /*RemoteObject*/ ,_mediacachevalue);
 BA.debugLineNum = 35;BA.debugLine="storageRef = storageValue";
Debug.ShouldStop(4);
__ref.setField ("_storageref" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 36;BA.debugLine="trustedSyncTimeKeyValue = trustedSyncKeyValue";
Debug.ShouldStop(8);
__ref.setField ("_trustedsynctimekeyvalue" /*RemoteObject*/ ,_trustedsynckeyvalue);
 BA.debugLineNum = 37;BA.debugLine="retryTimerRef = retryTimerValue";
Debug.ShouldStop(16);
__ref.setField ("_retrytimerref" /*RemoteObject*/ ,_retrytimervalue);
 BA.debugLineNum = 38;BA.debugLine="offlineDataRef.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="ResetRetryDelayState(localRetryInitial, serverRet";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_resetretrydelaystate" /*RemoteObject*/ ,(Object)(_localretryinitial),(Object)(_serverretryinitial));
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
public static RemoteObject  _invalidaterelevanttrackidscache(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InvalidateRelevantTrackIdsCache (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("invalidaterelevanttrackidscache")) { return __ref.runUserSub(false, "playerstatestore","invalidaterelevanttrackidscache", __ref);}
 BA.debugLineNum = 220;BA.debugLine="Public Sub InvalidateRelevantTrackIdsCache";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="owner.Data_InvalidateRelevantTrackIdsCache";
Debug.ShouldStop(268435456);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_invalidaterelevanttrackidscache" /*RemoteObject*/ );
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isadwarmupdeferredafterstartup(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsAdWarmupDeferredAfterStartup (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("isadwarmupdeferredafterstartup")) { return __ref.runUserSub(false, "playerstatestore","isadwarmupdeferredafterstartup", __ref);}
 BA.debugLineNum = 245;BA.debugLine="Public Sub IsAdWarmupDeferredAfterStartup As Boole";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 246;BA.debugLine="Return adWarmupDeferredAfterStartup";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(true,"_adwarmupdeferredafterstartup" /*RemoteObject*/ );
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ismediapathdegraded(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsMediaPathDegraded (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,567);
if (RapidSub.canDelegate("ismediapathdegraded")) { return __ref.runUserSub(false, "playerstatestore","ismediapathdegraded", __ref);}
 BA.debugLineNum = 567;BA.debugLine="Public Sub IsMediaPathDegraded As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 568;BA.debugLine="Return mediaPathDegradedFlag";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(true,"_mediapathdegradedflag" /*RemoteObject*/ );
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isplaybackpausedbypolicy(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPlaybackPausedByPolicy (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("isplaybackpausedbypolicy")) { return __ref.runUserSub(false, "playerstatestore","isplaybackpausedbypolicy", __ref);}
 BA.debugLineNum = 532;BA.debugLine="Public Sub IsPlaybackPausedByPolicy As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_isplaybackpausedbypolicy" /*RemoteObject*/ );
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isplaybackstarted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPlaybackStarted (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("isplaybackstarted")) { return __ref.runUserSub(false, "playerstatestore","isplaybackstarted", __ref);}
 BA.debugLineNum = 260;BA.debugLine="Public Sub IsPlaybackStarted As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 261;BA.debugLine="Return orchestrationStateRef.IsStarted";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstarted" /*RemoteObject*/ );
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ispolicypausestate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPolicyPauseState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("ispolicypausestate")) { return __ref.runUserSub(false, "playerstatestore","ispolicypausestate", __ref);}
 BA.debugLineNum = 272;BA.debugLine="Public Sub IsPolicyPauseState As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_isplaybackpausedbypolicy" /*RemoteObject*/ );
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstartupsequenceinprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsStartupSequenceInProgress (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("isstartupsequenceinprogress")) { return __ref.runUserSub(false, "playerstatestore","isstartupsequenceinprogress", __ref);}
 BA.debugLineNum = 232;BA.debugLine="Public Sub IsStartupSequenceInProgress As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Return startupSequenceInProgress";
Debug.ShouldStop(256);
if (true) return __ref.getField(true,"_startupsequenceinprogress" /*RemoteObject*/ );
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstoppedbyuser(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsStoppedByUser (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("isstoppedbyuser")) { return __ref.runUserSub(false, "playerstatestore","isstoppedbyuser", __ref);}
 BA.debugLineNum = 264;BA.debugLine="Public Sub IsStoppedByUser As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Return orchestrationStateRef.IsStoppedByUser";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstoppedbyuser" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstopping(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsStopping (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("isstopping")) { return __ref.runUserSub(false, "playerstatestore","isstopping", __ref);}
 BA.debugLineNum = 280;BA.debugLine="Public Sub IsStopping As Boolean";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="Return orchestrationStateRef.IsStopping";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstopping" /*RemoteObject*/ );
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istraceuploadenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsTraceUploadEnabled (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("istraceuploadenabled")) { return __ref.runUserSub(false, "playerstatestore","istraceuploadenabled", __ref);}
RemoteObject _snapshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playerdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 204;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Dim snapshot As Map = OfflineData";
Debug.ShouldStop(4096);
_snapshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_snapshot = __ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ );Debug.locals.put("snapshot", _snapshot);Debug.locals.put("snapshot", _snapshot);
 BA.debugLineNum = 206;BA.debugLine="If snapshot.IsInitialized = False Then Return Fal";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_snapshot.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 207;BA.debugLine="If snapshot.GetDefault(\"ok\", False) <> True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True")))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 208;BA.debugLine="If snapshot.ContainsKey(\"trace\") Then";
Debug.ShouldStop(32768);
if (_snapshot.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("trace")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 209;BA.debugLine="Return snapshot.GetDefault(\"trace\", False) = Tru";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("trace"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True"))));
 };
 BA.debugLineNum = 211;BA.debugLine="Dim playerData As Map = snapshot.GetDefault(\"play";
Debug.ShouldStop(262144);
_playerdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playerdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("player"))),(Object)(playerstatestore.__c.getField(false,"Null"))));Debug.locals.put("playerData", _playerdata);Debug.locals.put("playerData", _playerdata);
 BA.debugLineNum = 212;BA.debugLine="If playerData.IsInitialized = False Then Return F";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_playerdata.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 213;BA.debugLine="Return playerData.ContainsKey(\"trace\") And player";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_playerdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("trace"))))) && RemoteObject.solveBoolean("=",_playerdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("trace"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True"))));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istrackcached(RemoteObject __ref,RemoteObject _trackid) throws Exception{
try {
		Debug.PushSubsStack("IsTrackCached (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("istrackcached")) { return __ref.runUserSub(false, "playerstatestore","istrackcached", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 599;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 600;BA.debugLine="Return mediaCacheRef.IsTrackCached(trackId)";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid));
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isuserstoppedstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsUserStoppedState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("isuserstoppedstate")) { return __ref.runUserSub(false, "playerstatestore","isuserstoppedstate", __ref);}
 BA.debugLineNum = 268;BA.debugLine="Public Sub IsUserStoppedState As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Return orchestrationStateRef.IsStarted = False An";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstarted" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_isplaybackpausedbypolicy" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstoppedbyuser" /*RemoteObject*/ )));
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lastofflinedatarefreshstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LastOfflineDataRefreshState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("lastofflinedatarefreshstate")) { return __ref.runUserSub(false, "playerstatestore","lastofflinedatarefreshstate", __ref);}
 BA.debugLineNum = 162;BA.debugLine="Public Sub LastOfflineDataRefreshState As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Return policyState.LastOfflineDataRefreshState";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_lastofflinedatarefreshstate" /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadcachedplaylistmetadata(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("LoadCachedPlaylistMetadata (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,595);
if (RapidSub.canDelegate("loadcachedplaylistmetadata")) { return __ref.runUserSub(false, "playerstatestore","loadcachedplaylistmetadata", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 595;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 596;BA.debugLine="Return dataResolverRef.LoadCachedPlaylistMetadata";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(_playlistid));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _messagevalue(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("MessageValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("messagevalue")) { return __ref.runUserSub(false, "playerstatestore","messagevalue", __ref, _key);}
Debug.locals.put("key", _key);
 BA.debugLineNum = 118;BA.debugLine="Public Sub MessageValue(key As String) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Return owner.Data_MessageValue(key)";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_messagevalue" /*RemoteObject*/ ,(Object)(_key));
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
public static RemoteObject  _nexturlvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("nexturlvalue")) { return __ref.runUserSub(false, "playerstatestore","nexturlvalue", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Public Sub NextUrlValue As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Return owner.NextUrlValue";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_nexturlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _offlinedata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OfflineData (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("offlinedata")) { return __ref.runUserSub(false, "playerstatestore","offlinedata", __ref);}
 BA.debugLineNum = 199;BA.debugLine="Public Sub OfflineData As Map";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 201;BA.debugLine="Return offlineDataRef";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_offlinedataref" /*RemoteObject*/ );
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playercodevalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PlayerCodeValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("playercodevalue")) { return __ref.runUserSub(false, "playerstatestore","playercodevalue", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Public Sub PlayerCodeValue As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Return owner.PlayerCodeValue";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_playercodevalue" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshconnectionindicatorstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshConnectionIndicatorState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("refreshconnectionindicatorstate")) { return __ref.runUserSub(false, "playerstatestore","refreshconnectionindicatorstate", __ref);}
 BA.debugLineNum = 224;BA.debugLine="Public Sub RefreshConnectionIndicatorState";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="owner.Data_RefreshConnectionIndicatorState";
Debug.ShouldStop(1);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetconsecutivenetworkerrors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetConsecutiveNetworkErrors (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("resetconsecutivenetworkerrors")) { return __ref.runUserSub(false, "playerstatestore","resetconsecutivenetworkerrors", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Public Sub ResetConsecutiveNetworkErrors";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="consecutiveNetworkErrors = 0";
Debug.ShouldStop(16384);
__ref.setField ("_consecutivenetworkerrors" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetretrydelaystate(RemoteObject __ref,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("ResetRetryDelayState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("resetretrydelaystate")) { return __ref.runUserSub(false, "playerstatestore","resetretrydelaystate", __ref, _localretryinitial, _serverretryinitial);}
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 540;BA.debugLine="Public Sub ResetRetryDelayState(localRetryInitial";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="localRetryDelay = localRetryInitial";
Debug.ShouldStop(268435456);
__ref.setField ("_localretrydelay" /*RemoteObject*/ ,_localretryinitial);
 BA.debugLineNum = 542;BA.debugLine="serverRetryDelay = serverRetryInitial";
Debug.ShouldStop(536870912);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,_serverretryinitial);
 BA.debugLineNum = 543;BA.debugLine="dispatchRetryAfter = 0";
Debug.ShouldStop(1073741824);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 544;BA.debugLine="mediaPathDegradedFlag = False";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mediapathdegradedflag" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"False"));
 BA.debugLineNum = 545;BA.debugLine="If GetConsecutiveNetworkErrors > 0 Then TraceInfo";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.runClassMethod (b4j.example.playerstatestore.class, "_getconsecutivenetworkerrors" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.playerstatestore.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("retry сброшен")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("errors="),__ref.runClassMethod (b4j.example.playerstatestore.class, "_getconsecutivenetworkerrors" /*RemoteObject*/ ))));};
 BA.debugLineNum = 546;BA.debugLine="ResetConsecutiveNetworkErrors";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_resetconsecutivenetworkerrors" /*RemoteObject*/ );
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveanycachedlocaltrackitem(RemoteObject __ref,RemoteObject _currentslot) throws Exception{
try {
		Debug.PushSubsStack("ResolveAnyCachedLocalTrackItem (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("resolveanycachedlocaltrackitem")) { return __ref.runUserSub(false, "playerstatestore","resolveanycachedlocaltrackitem", __ref, _currentslot);}
RemoteObject _emptyitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playliststats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fallbackslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistids = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _startindex = RemoteObject.createImmutable(0);
RemoteObject _selecteditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _offset = 0;
RemoteObject _cachedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _descriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _queueitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexeddescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _indexedqueueitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 448;BA.debugLine="Private Sub ResolveAnyCachedLocalTrackItem(current";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 449;BA.debugLine="Dim emptyItem As Map";
Debug.ShouldStop(1);
_emptyitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyItem", _emptyitem);
 BA.debugLineNum = 450;BA.debugLine="emptyItem.Initialize";
Debug.ShouldStop(2);
_emptyitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 451;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
Debug.ShouldStop(4);
__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_ensuretrackcacheready" /*RemoteObject*/ );
 BA.debugLineNum = 452;BA.debugLine="Dim playlistStats As Map = mediaCacheRef.GetCache";
Debug.ShouldStop(8);
_playliststats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playliststats = __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_getcachedtrackplayliststats" /*RemoteObject*/ );Debug.locals.put("playlistStats", _playliststats);Debug.locals.put("playlistStats", _playliststats);
 BA.debugLineNum = 453;BA.debugLine="Dim fallbackSlot As Map = currentSlot";
Debug.ShouldStop(16);
_fallbackslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fallbackslot = _currentslot;Debug.locals.put("fallbackSlot", _fallbackslot);Debug.locals.put("fallbackSlot", _fallbackslot);
 BA.debugLineNum = 454;BA.debugLine="If fallbackSlot.IsInitialized = False Or fallback";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_fallbackslot.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_fallbackslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 455;BA.debugLine="fallbackSlot = dataResolverRef.ResolveDataSlotAt";
Debug.ShouldStop(64);
_fallbackslot = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ )));Debug.locals.put("fallbackSlot", _fallbackslot);
 };
 BA.debugLineNum = 457;BA.debugLine="If fallbackSlot.IsInitialized = False Then fallba";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_fallbackslot.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
_fallbackslot.runVoidMethod ("Initialize");};
 BA.debugLineNum = 458;BA.debugLine="Dim playlistIds As List";
Debug.ShouldStop(512);
_playlistids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("playlistIds", _playlistids);
 BA.debugLineNum = 459;BA.debugLine="playlistIds.Initialize";
Debug.ShouldStop(1024);
_playlistids.runVoidMethod ("Initialize");
 BA.debugLineNum = 460;BA.debugLine="If playlistStats.IsInitialized And playlistStats.";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",_playliststats.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_playliststats.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 461;BA.debugLine="For Each playlistId As String In playlistStats.K";
Debug.ShouldStop(4096);
{
final RemoteObject group13 = _playliststats.runMethod(false,"Keys");
final int groupLen13 = group13.runMethod(true,"getSize").<Integer>get()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_playlistid = BA.ObjectToString(group13.runMethod(false,"Get",index13));Debug.locals.put("playlistId", _playlistid);
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 462;BA.debugLine="If playlistId = \"\" Or playlistId = \"_unknown\" T";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString("_unknown"))) { 
if (true) continue;};
 BA.debugLineNum = 463;BA.debugLine="playlistIds.Add(playlistId)";
Debug.ShouldStop(16384);
_playlistids.runVoidMethod ("Add",(Object)((_playlistid)));
 }
}Debug.locals.put("playlistId", _playlistid);
;
 };
 BA.debugLineNum = 466;BA.debugLine="If playlistIds.Size = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_playlistids.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 467;BA.debugLine="playlistIds = mediaCacheRef.GetCachedTrackPlayli";
Debug.ShouldStop(262144);
_playlistids = __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_getcachedtrackplaylistidsondisk" /*RemoteObject*/ );Debug.locals.put("playlistIds", _playlistids);
 };
 BA.debugLineNum = 469;BA.debugLine="Dim startIndex As Int = 0";
Debug.ShouldStop(1048576);
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 470;BA.debugLine="If playlistIds.Size > 1 Then startIndex = Rnd(0,";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_playlistids.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
_startindex = playerstatestore.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_playlistids.runMethod(true,"getSize")));Debug.locals.put("startIndex", _startindex);};
 BA.debugLineNum = 471;BA.debugLine="Dim selectedItem As Map";
Debug.ShouldStop(4194304);
_selecteditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedItem", _selecteditem);
 BA.debugLineNum = 472;BA.debugLine="selectedItem.Initialize";
Debug.ShouldStop(8388608);
_selecteditem.runVoidMethod ("Initialize");
 BA.debugLineNum = 473;BA.debugLine="If playlistIds.Size > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_playlistids.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 474;BA.debugLine="For offset = 0 To playlistIds.Size - 1";
Debug.ShouldStop(33554432);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_playlistids.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_offset = 0 ;
for (;(step26 > 0 && _offset <= limit26) || (step26 < 0 && _offset >= limit26) ;_offset = ((int)(0 + _offset + step26))  ) {
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 475;BA.debugLine="Dim playlistId As String = playlistIds.Get((sta";
Debug.ShouldStop(67108864);
_playlistid = BA.ObjectToString(_playlistids.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_startindex,RemoteObject.createImmutable(_offset)}, "+",1, 1)),_playlistids.runMethod(true,"getSize")}, "%",0, 1))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 476;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.Resolv";
Debug.ShouldStop(134217728);
_cachedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedtrack = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveorderedcachedtrackfromplaylistbyid" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(__ref.getField(false,"_mediacacheref" /*RemoteObject*/ )));Debug.locals.put("cachedTrack", _cachedtrack);Debug.locals.put("cachedTrack", _cachedtrack);
 BA.debugLineNum = 477;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedT";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 478;BA.debugLine="Dim descriptor As Map";
Debug.ShouldStop(536870912);
_descriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("descriptor", _descriptor);
 BA.debugLineNum = 479;BA.debugLine="descriptor.Initialize";
Debug.ShouldStop(1073741824);
_descriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 480;BA.debugLine="descriptor.Put(\"id\", playlistId)";
Debug.ShouldStop(-2147483648);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_playlistid)));
 BA.debugLineNum = 481;BA.debugLine="descriptor.Put(\"title\", cachedTrack.GetDefault(";
Debug.ShouldStop(1);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_cachedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 482;BA.debugLine="descriptor.Put(\"_slot_key\", BuildDataSlotKey(fa";
Debug.ShouldStop(2);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((__ref.runClassMethod (b4j.example.playerstatestore.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_fallbackslot)))));
 BA.debugLineNum = 483;BA.debugLine="descriptor.Put(\"_playlist_index\", 0)";
Debug.ShouldStop(4);
_descriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 484;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQu";
Debug.ShouldStop(8);
_queueitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_queueitem = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_createqueuetrackfromplaylist" /*RemoteObject*/ ,(Object)(_fallbackslot),(Object)(_descriptor),(Object)(_cachedtrack),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )));Debug.locals.put("queueItem", _queueitem);Debug.locals.put("queueItem", _queueitem);
 BA.debugLineNum = 485;BA.debugLine="selectedItem = queueItem";
Debug.ShouldStop(16);
_selecteditem = _queueitem;Debug.locals.put("selectedItem", _selecteditem);
 BA.debugLineNum = 486;BA.debugLine="Exit";
Debug.ShouldStop(32);
if (true) break;
 }
}Debug.locals.put("offset", _offset);
;
 };
 BA.debugLineNum = 489;BA.debugLine="If selectedItem.IsInitialized = False Or selected";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_selecteditem.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_selecteditem.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 490;BA.debugLine="Dim indexedTrack As Map = mediaCacheRef.ResolveA";
Debug.ShouldStop(512);
_indexedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_indexedtrack = __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_resolveanycachedtrackfromindex" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("indexedTrack", _indexedtrack);Debug.locals.put("indexedTrack", _indexedtrack);
 BA.debugLineNum = 491;BA.debugLine="If indexedTrack.IsInitialized And indexedTrack.S";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",_indexedtrack.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_indexedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 492;BA.debugLine="Dim indexedDescriptor As Map";
Debug.ShouldStop(2048);
_indexeddescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("indexedDescriptor", _indexeddescriptor);
 BA.debugLineNum = 493;BA.debugLine="indexedDescriptor.Initialize";
Debug.ShouldStop(4096);
_indexeddescriptor.runVoidMethod ("Initialize");
 BA.debugLineNum = 494;BA.debugLine="indexedDescriptor.Put(\"id\", indexedTrack.GetDef";
Debug.ShouldStop(8192);
_indexeddescriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(_indexedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 495;BA.debugLine="indexedDescriptor.Put(\"title\", indexedTrack.Get";
Debug.ShouldStop(16384);
_indexeddescriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)(_indexedtrack.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_title"))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 496;BA.debugLine="indexedDescriptor.Put(\"_slot_key\", BuildDataSlo";
Debug.ShouldStop(32768);
_indexeddescriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((__ref.runClassMethod (b4j.example.playerstatestore.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_fallbackslot)))));
 BA.debugLineNum = 497;BA.debugLine="indexedDescriptor.Put(\"_playlist_index\", 0)";
Debug.ShouldStop(65536);
_indexeddescriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 498;BA.debugLine="Dim indexedQueueItem As Map = dataResolverRef.C";
Debug.ShouldStop(131072);
_indexedqueueitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_indexedqueueitem = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_createqueuetrackfromplaylist" /*RemoteObject*/ ,(Object)(_fallbackslot),(Object)(_indexeddescriptor),(Object)(_indexedtrack),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )));Debug.locals.put("indexedQueueItem", _indexedqueueitem);Debug.locals.put("indexedQueueItem", _indexedqueueitem);
 BA.debugLineNum = 499;BA.debugLine="selectedItem = indexedQueueItem";
Debug.ShouldStop(262144);
_selecteditem = _indexedqueueitem;Debug.locals.put("selectedItem", _selecteditem);
 };
 };
 BA.debugLineNum = 502;BA.debugLine="If selectedItem.IsInitialized And selectedItem.Si";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(".",_selecteditem.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_selecteditem.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _selecteditem;};
 BA.debugLineNum = 503;BA.debugLine="Return emptyItem";
Debug.ShouldStop(4194304);
if (true) return _emptyitem;
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvecurrentdataslot(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ResolveCurrentDataSlot (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("resolvecurrentdataslot")) { return __ref.runUserSub(false, "playerstatestore","resolvecurrentdataslot", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 587;BA.debugLine="Public Sub ResolveCurrentDataSlot(data As Map) As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 588;BA.debugLine="Return dataResolverRef.ResolveCurrentDataSlot(dat";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvecurrentdataslot" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvedataslotatticks(RemoteObject __ref,RemoteObject _data,RemoteObject _targetticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveDataSlotAtTicks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,583);
if (RapidSub.canDelegate("resolvedataslotatticks")) { return __ref.runUserSub(false, "playerstatestore","resolvedataslotatticks", __ref, _data, _targetticks);}
Debug.locals.put("data", _data);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 583;BA.debugLine="Public Sub ResolveDataSlotAtTicks(data As Map, tar";
Debug.ShouldStop(64);
 BA.debugLineNum = 584;BA.debugLine="Return dataResolverRef.ResolveDataSlotAtTicks(dat";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_data),(Object)(_targetticks));
 BA.debugLineNum = 585;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveidleuntilmessage(RemoteObject __ref,RemoteObject _data,RemoteObject _targetticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveIdleUntilMessage (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,378);
if (RapidSub.canDelegate("resolveidleuntilmessage")) { return __ref.runUserSub(false, "playerstatestore","resolveidleuntilmessage", __ref, _data, _targetticks);}
Debug.locals.put("data", _data);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 378;BA.debugLine="Public Sub ResolveIdleUntilMessage(data As Map, ta";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 379;BA.debugLine="Return owner.Data_ResolveIdleUntilMessage(data, t";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_resolveidleuntilmessage" /*RemoteObject*/ ,(Object)(_data),(Object)(_targetticks));
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvenextdataslotatticks(RemoteObject __ref,RemoteObject _data,RemoteObject _targetticks) throws Exception{
try {
		Debug.PushSubsStack("ResolveNextDataSlotAtTicks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("resolvenextdataslotatticks")) { return __ref.runUserSub(false, "playerstatestore","resolvenextdataslotatticks", __ref, _data, _targetticks);}
Debug.locals.put("data", _data);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 591;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(data As Map,";
Debug.ShouldStop(16384);
 BA.debugLineNum = 592;BA.debugLine="Return dataResolverRef.ResolveNextDataSlotAtTicks";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvenextdataslotatticks" /*RemoteObject*/ ,(Object)(_data),(Object)(_targetticks));
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvenextlocaltrackitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResolveNextLocalTrackItem (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("resolvenextlocaltrackitem")) { return __ref.runUserSub(false, "playerstatestore","resolvenextlocaltrackitem", __ref);}
RemoteObject _emptyitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resolveditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 388;BA.debugLine="Public Sub ResolveNextLocalTrackItem As Map";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Dim emptyItem As Map";
Debug.ShouldStop(16);
_emptyitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyItem", _emptyitem);
 BA.debugLineNum = 390;BA.debugLine="emptyItem.Initialize";
Debug.ShouldStop(32);
_emptyitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 391;BA.debugLine="If HasUsableDataPlaybackInstructions = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_hasusabledataplaybackinstructions" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False"))) { 
if (true) return __ref.runClassMethod (b4j.example.playerstatestore.class, "_resolveanycachedlocaltrackitem" /*RemoteObject*/ ,(Object)(_emptyitem));};
 BA.debugLineNum = 392;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
Debug.ShouldStop(128);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ )));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 393;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 394;BA.debugLine="Return ResolveAnyCachedLocalTrackItem(emptyItem)";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (b4j.example.playerstatestore.class, "_resolveanycachedlocaltrackitem" /*RemoteObject*/ ,(Object)(_emptyitem));
 };
 BA.debugLineNum = 396;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(2048);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(playerstatestore.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 397;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 398;BA.debugLine="Return ResolveAnyCachedLocalTrackItem(currentSlo";
Debug.ShouldStop(8192);
if (true) return __ref.runClassMethod (b4j.example.playerstatestore.class, "_resolveanycachedlocaltrackitem" /*RemoteObject*/ ,(Object)(_currentslot));
 };
 BA.debugLineNum = 400;BA.debugLine="Dim resolvedItem As Map = ResolveSequentialSlotTr";
Debug.ShouldStop(32768);
_resolveditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_resolveditem = __ref.runClassMethod (b4j.example.playerstatestore.class, "_resolvesequentialslottrackitem" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlists));Debug.locals.put("resolvedItem", _resolveditem);Debug.locals.put("resolvedItem", _resolveditem);
 BA.debugLineNum = 401;BA.debugLine="If resolvedItem.IsInitialized And resolvedItem.Si";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(".",_resolveditem.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_resolveditem.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _resolveditem;};
 BA.debugLineNum = 402;BA.debugLine="resolvedItem = ResolveAnyCachedLocalTrackItem(cur";
Debug.ShouldStop(131072);
_resolveditem = __ref.runClassMethod (b4j.example.playerstatestore.class, "_resolveanycachedlocaltrackitem" /*RemoteObject*/ ,(Object)(_currentslot));Debug.locals.put("resolvedItem", _resolveditem);
 BA.debugLineNum = 403;BA.debugLine="Return resolvedItem";
Debug.ShouldStop(262144);
if (true) return _resolveditem;
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolveretrydelay(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms,RemoteObject _localretrymax,RemoteObject _serverretrymax,RemoteObject _blockedretrydelay) throws Exception{
try {
		Debug.PushSubsStack("ResolveRetryDelay (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,506);
if (RapidSub.canDelegate("resolveretrydelay")) { return __ref.runUserSub(false, "playerstatestore","resolveretrydelay", __ref, _mode, _delayms, _localretrymax, _serverretrymax, _blockedretrydelay);}
RemoteObject _delay = RemoteObject.createImmutable(0);
RemoteObject _delayserver = RemoteObject.createImmutable(0);
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
Debug.locals.put("localRetryMax", _localretrymax);
Debug.locals.put("serverRetryMax", _serverretrymax);
Debug.locals.put("blockedRetryDelay", _blockedretrydelay);
 BA.debugLineNum = 506;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 507;BA.debugLine="If delayMs > 0 Then Return delayMs";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",_delayms,BA.numberCast(double.class, 0))) { 
if (true) return _delayms;};
 BA.debugLineNum = 508;BA.debugLine="If mode = \"network\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("network"))) { 
 BA.debugLineNum = 509;BA.debugLine="Dim delay As Int = localRetryDelay";
Debug.ShouldStop(268435456);
_delay = __ref.getField(true,"_localretrydelay" /*RemoteObject*/ );Debug.locals.put("delay", _delay);Debug.locals.put("delay", _delay);
 BA.debugLineNum = 510;BA.debugLine="localRetryDelay = Min(localRetryDelay * 2, local";
Debug.ShouldStop(536870912);
__ref.setField ("_localretrydelay" /*RemoteObject*/ ,BA.numberCast(int.class, playerstatestore.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_localretrydelay" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, _localretrymax)))));
 BA.debugLineNum = 511;BA.debugLine="Return delay";
Debug.ShouldStop(1073741824);
if (true) return _delay;
 };
 BA.debugLineNum = 513;BA.debugLine="If mode = \"blocked\" Then Return blockedRetryDelay";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_mode,BA.ObjectToString("blocked"))) { 
if (true) return _blockedretrydelay;};
 BA.debugLineNum = 514;BA.debugLine="Dim delayServer As Int = serverRetryDelay";
Debug.ShouldStop(2);
_delayserver = __ref.getField(true,"_serverretrydelay" /*RemoteObject*/ );Debug.locals.put("delayServer", _delayserver);Debug.locals.put("delayServer", _delayserver);
 BA.debugLineNum = 515;BA.debugLine="serverRetryDelay = Min(serverRetryDelay * 2, serv";
Debug.ShouldStop(4);
__ref.setField ("_serverretrydelay" /*RemoteObject*/ ,BA.numberCast(int.class, playerstatestore.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_serverretrydelay" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, _serverretrymax)))));
 BA.debugLineNum = 516;BA.debugLine="Return delayServer";
Debug.ShouldStop(8);
if (true) return _delayserver;
 BA.debugLineNum = 517;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resolvesequentialslottrackitem(RemoteObject __ref,RemoteObject _currentslot,RemoteObject _playlists) throws Exception{
try {
		Debug.PushSubsStack("ResolveSequentialSlotTrackItem (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("resolvesequentialslottrackitem")) { return __ref.runUserSub(false, "playerstatestore","resolvesequentialslottrackitem", __ref, _currentslot, _playlists);}
RemoteObject _emptyitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _slotkey = RemoteObject.createImmutable("");
RemoteObject _workingcursors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cursorvalue = RemoteObject.createImmutable(0);
RemoteObject _startindex = RemoteObject.createImmutable(0);
RemoteObject _selecteditem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _offset = 0;
RemoteObject _playlistindex = RemoteObject.createImmutable(0);
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _cachedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _normalizeddescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _queueitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentSlot", _currentslot);
Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 406;BA.debugLine="Private Sub ResolveSequentialSlotTrackItem(current";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="Dim emptyItem As Map";
Debug.ShouldStop(4194304);
_emptyitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("emptyItem", _emptyitem);
 BA.debugLineNum = 408;BA.debugLine="emptyItem.Initialize";
Debug.ShouldStop(8388608);
_emptyitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 409;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _emptyitem;};
 BA.debugLineNum = 410;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
Debug.ShouldStop(33554432);
_slotkey = __ref.runClassMethod (b4j.example.playerstatestore.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot));Debug.locals.put("slotKey", _slotkey);Debug.locals.put("slotKey", _slotkey);
 BA.debugLineNum = 411;BA.debugLine="Dim workingCursors As Map = dataResolverRef.Clone";
Debug.ShouldStop(67108864);
_workingcursors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_workingcursors = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_cloneplaylistcursors" /*RemoteObject*/ );Debug.locals.put("workingCursors", _workingcursors);Debug.locals.put("workingCursors", _workingcursors);
 BA.debugLineNum = 412;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
Debug.ShouldStop(134217728);
_cursorvalue = BA.numberCast(int.class, _workingcursors.runMethod(false,"GetDefault",(Object)((_slotkey)),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("cursorValue", _cursorvalue);Debug.locals.put("cursorValue", _cursorvalue);
 BA.debugLineNum = 413;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_cursorvalue,BA.numberCast(double.class, 0))) { 
_cursorvalue = BA.numberCast(int.class, 0);Debug.locals.put("cursorValue", _cursorvalue);};
 BA.debugLineNum = 414;BA.debugLine="Dim startIndex As Int = cursorValue Mod playlists";
Debug.ShouldStop(536870912);
_startindex = RemoteObject.solve(new RemoteObject[] {_cursorvalue,_playlists.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("startIndex", _startindex);Debug.locals.put("startIndex", _startindex);
 BA.debugLineNum = 415;BA.debugLine="Dim selectedItem As Map";
Debug.ShouldStop(1073741824);
_selecteditem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("selectedItem", _selecteditem);
 BA.debugLineNum = 416;BA.debugLine="selectedItem.Initialize";
Debug.ShouldStop(-2147483648);
_selecteditem.runVoidMethod ("Initialize");
 BA.debugLineNum = 417;BA.debugLine="For offset = 0 To playlists.Size - 1";
Debug.ShouldStop(1);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_playlists.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_offset = 0 ;
for (;(step11 > 0 && _offset <= limit11) || (step11 < 0 && _offset >= limit11) ;_offset = ((int)(0 + _offset + step11))  ) {
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 418;BA.debugLine="Dim playlistIndex As Int = (startIndex + offset)";
Debug.ShouldStop(2);
_playlistindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_startindex,RemoteObject.createImmutable(_offset)}, "+",1, 1)),_playlists.runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("playlistIndex", _playlistindex);Debug.locals.put("playlistIndex", _playlistindex);
 BA.debugLineNum = 419;BA.debugLine="Dim playlistObject As Object = playlists.Get(pla";
Debug.ShouldStop(4);
_playlistobject = _playlists.runMethod(false,"Get",(Object)(_playlistindex));Debug.locals.put("playlistObject", _playlistobject);Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 420;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map")))),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 421;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
Debug.ShouldStop(16);
_playlistdescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlistDescriptor", _playlistdescriptor);Debug.locals.put("playlistDescriptor", _playlistdescriptor);
 BA.debugLineNum = 422;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
Debug.ShouldStop(32);
_playlistid = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 423;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
if (true) continue;};
 BA.debugLineNum = 424;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.Resolve";
Debug.ShouldStop(128);
_cachedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedtrack = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolveorderedcachedtrackfromplaylistbyid" /*RemoteObject*/ ,(Object)(_playlistid),(Object)(__ref.getField(false,"_mediacacheref" /*RemoteObject*/ )));Debug.locals.put("cachedTrack", _cachedtrack);Debug.locals.put("cachedTrack", _cachedtrack);
 BA.debugLineNum = 425;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 426;BA.debugLine="Dim normalizedDescriptor As Map = CloneMap(playl";
Debug.ShouldStop(512);
_normalizeddescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_normalizeddescriptor = __ref.runClassMethod (b4j.example.playerstatestore.class, "_clonemap" /*RemoteObject*/ ,(Object)(_playlistdescriptor));Debug.locals.put("normalizedDescriptor", _normalizeddescriptor);Debug.locals.put("normalizedDescriptor", _normalizeddescriptor);
 BA.debugLineNum = 427;BA.debugLine="normalizedDescriptor.Put(\"_slot_key\", slotKey)";
Debug.ShouldStop(1024);
_normalizeddescriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_slot_key"))),(Object)((_slotkey)));
 BA.debugLineNum = 428;BA.debugLine="normalizedDescriptor.Put(\"_playlist_index\", play";
Debug.ShouldStop(2048);
_normalizeddescriptor.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_playlist_index"))),(Object)((_playlistindex)));
 BA.debugLineNum = 429;BA.debugLine="workingCursors.Put(slotKey, playlistIndex + 1)";
Debug.ShouldStop(4096);
_workingcursors.runVoidMethod ("Put",(Object)((_slotkey)),(Object)((RemoteObject.solve(new RemoteObject[] {_playlistindex,RemoteObject.createImmutable(1)}, "+",1, 1))));
 BA.debugLineNum = 430;BA.debugLine="dataResolverRef.SavePreviewPlaylistCursors(stora";
Debug.ShouldStop(8192);
__ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_savepreviewplaylistcursors" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_storageref" /*RemoteObject*/ )),(Object)(_workingcursors));
 BA.debugLineNum = 431;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQue";
Debug.ShouldStop(16384);
_queueitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_queueitem = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_createqueuetrackfromplaylist" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_normalizeddescriptor),(Object)(_cachedtrack),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )));Debug.locals.put("queueItem", _queueitem);Debug.locals.put("queueItem", _queueitem);
 BA.debugLineNum = 432;BA.debugLine="selectedItem = queueItem";
Debug.ShouldStop(32768);
_selecteditem = _queueitem;Debug.locals.put("selectedItem", _selecteditem);
 BA.debugLineNum = 433;BA.debugLine="Exit";
Debug.ShouldStop(65536);
if (true) break;
 }
}Debug.locals.put("offset", _offset);
;
 BA.debugLineNum = 435;BA.debugLine="If selectedItem.IsInitialized And selectedItem.Si";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",_selecteditem.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_selecteditem.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return _selecteditem;};
 BA.debugLineNum = 436;BA.debugLine="Return emptyItem";
Debug.ShouldStop(524288);
if (true) return _emptyitem;
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resumeplaybackafterpolicypauseasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResumePlaybackAfterPolicyPauseAsync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("resumeplaybackafterpolicypauseasync")) { return __ref.runUserSub(false, "playerstatestore","resumeplaybackafterpolicypauseasync", __ref);}
 BA.debugLineNum = 296;BA.debugLine="Public Sub ResumePlaybackAfterPolicyPauseAsync";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="owner.Data_ResumePlaybackAfterPolicyPauseAsync";
Debug.ShouldStop(256);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_resumeplaybackafterpolicypauseasync" /*RemoteObject*/ );
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resumeplaybackwhenserverallows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResumePlaybackWhenServerAllows (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("resumeplaybackwhenserverallows")) { return __ref.runUserSub(false, "playerstatestore","resumeplaybackwhenserverallows", __ref);}
 BA.debugLineNum = 170;BA.debugLine="Public Sub ResumePlaybackWhenServerAllows As Boole";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Return policyState.ResumePlaybackWhenServerAllows";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_resumeplaybackwhenserverallows" /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveofflinedata(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("SaveOfflineData (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("saveofflinedata")) { return __ref.runUserSub(false, "playerstatestore","saveofflinedata", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 186;BA.debugLine="Public Sub SaveOfflineData(data As Map)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="offlineDataRef = offlineStoreRef.SaveOfflineData(";
Debug.ShouldStop(67108864);
__ref.setField ("_offlinedataref" /*RemoteObject*/ ,__ref.getField(false,"_offlinestoreref" /*RemoteObject*/ ).runClassMethod (b4j.example.offlinestore.class, "_saveofflinedata" /*RemoteObject*/ ,(Object)(_data),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 188;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveserversnapshot(RemoteObject __ref,RemoteObject _method,RemoteObject _url,RemoteObject _success,RemoteObject _body,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("SaveServerSnapshot (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("saveserversnapshot")) { return __ref.runUserSub(false, "playerstatestore","saveserversnapshot", __ref, _method, _url, _success, _body, _errormessage);}
Debug.locals.put("method", _method);
Debug.locals.put("url", _url);
Debug.locals.put("success", _success);
Debug.locals.put("body", _body);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 142;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="owner.Data_SaveServerSnapshot(method, url, succes";
Debug.ShouldStop(16384);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_saveserversnapshot" /*RemoteObject*/ ,(Object)(_method),(Object)(_url),(Object)(_success),(Object)(_body),(Object)(_errormessage));
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
public static RemoteObject  _scheduleretry(RemoteObject __ref,RemoteObject _mode,RemoteObject _delayms) throws Exception{
try {
		Debug.PushSubsStack("ScheduleRetry (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("scheduleretry")) { return __ref.runUserSub(false, "playerstatestore","scheduleretry", __ref, _mode, _delayms);}
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
 BA.debugLineNum = 329;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="owner.Data_ScheduleRetry(mode, delayMs)";
Debug.ShouldStop(512);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_scheduleretry" /*RemoteObject*/ ,(Object)(_mode),(Object)(_delayms));
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _secondsagotext(RemoteObject __ref,RemoteObject _ticksvalue) throws Exception{
try {
		Debug.PushSubsStack("SecondsAgoText (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("secondsagotext")) { return __ref.runUserSub(false, "playerstatestore","secondsagotext", __ref, _ticksvalue);}
Debug.locals.put("ticksValue", _ticksvalue);
 BA.debugLineNum = 146;BA.debugLine="Public Sub SecondsAgoText(ticksValue As Long) As S";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Return owner.Data_SecondsAgoText(ticksValue)";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_secondsagotext" /*RemoteObject*/ ,(Object)(_ticksvalue));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _servicecheckurlvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ServiceCheckUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("servicecheckurlvalue")) { return __ref.runUserSub(false, "playerstatestore","servicecheckurlvalue", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Return owner.ServiceCheckUrlValue";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_servicecheckurlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdispatchretryafter(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetDispatchRetryAfter (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,553);
if (RapidSub.canDelegate("setdispatchretryafter")) { return __ref.runUserSub(false, "playerstatestore","setdispatchretryafter", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 553;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 554;BA.debugLine="dispatchRetryAfter = Max(0, value)";
Debug.ShouldStop(512);
__ref.setField ("_dispatchretryafter" /*RemoteObject*/ ,BA.numberCast(int.class, playerstatestore.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _value)))));
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlastdataoknow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLastDataOkNow (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setlastdataoknow")) { return __ref.runUserSub(false, "playerstatestore","setlastdataoknow", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub SetLastDataOkNow";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="dataSuccessAtTicks = DateTime.Now";
Debug.ShouldStop(4);
__ref.setField ("_datasuccessatticks" /*RemoteObject*/ ,playerstatestore.__c.getField(false,"DateTime").runMethod(true,"getNow"));
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
public static RemoteObject  _setlasthistoryoknow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLastHistoryOkNow (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setlasthistoryoknow")) { return __ref.runUserSub(false, "playerstatestore","setlasthistoryoknow", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub SetLastHistoryOkNow";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="historySuccessAtTicks = DateTime.Now";
Debug.ShouldStop(1024);
__ref.setField ("_historysuccessatticks" /*RemoteObject*/ ,playerstatestore.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlastofflinedatarefreshstate(RemoteObject __ref,RemoteObject _statevalue) throws Exception{
try {
		Debug.PushSubsStack("SetLastOfflineDataRefreshState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setlastofflinedatarefreshstate")) { return __ref.runUserSub(false, "playerstatestore","setlastofflinedatarefreshstate", __ref, _statevalue);}
Debug.locals.put("stateValue", _statevalue);
 BA.debugLineNum = 158;BA.debugLine="Public Sub SetLastOfflineDataRefreshState(stateVal";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="policyState.LastOfflineDataRefreshState = stateVa";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,_statevalue);
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlastretrymode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetLastRetryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setlastretrymode")) { return __ref.runUserSub(false, "playerstatestore","setlastretrymode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 54;BA.debugLine="Public Sub SetLastRetryMode(mode As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="lastRetryMode = mode";
Debug.ShouldStop(4194304);
__ref.setField ("_lastretrymode" /*RemoteObject*/ ,_mode);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("SetMediaPathDegraded (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,563);
if (RapidSub.canDelegate("setmediapathdegraded")) { return __ref.runUserSub(false, "playerstatestore","setmediapathdegraded", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 563;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 564;BA.debugLine="mediaPathDegradedFlag = value";
Debug.ShouldStop(524288);
__ref.setField ("_mediapathdegradedflag" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setofflinedata(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("SetOfflineData (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("setofflinedata")) { return __ref.runUserSub(false, "playerstatestore","setofflinedata", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 191;BA.debugLine="Public Sub SetOfflineData(data As Map)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="If data.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (_data.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="offlineDataRef = data";
Debug.ShouldStop(1);
__ref.setField ("_offlinedataref" /*RemoteObject*/ ,_data);
 }else {
 BA.debugLineNum = 195;BA.debugLine="offlineDataRef.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplaybackflowstate(RemoteObject __ref,RemoteObject _statevalue,RemoteObject _reason) throws Exception{
try {
		Debug.PushSubsStack("SetPlaybackFlowState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("setplaybackflowstate")) { return __ref.runUserSub(false, "playerstatestore","setplaybackflowstate", __ref, _statevalue, _reason);}
Debug.locals.put("stateValue", _statevalue);
Debug.locals.put("reason", _reason);
 BA.debugLineNum = 337;BA.debugLine="Public Sub SetPlaybackFlowState(stateValue As Stri";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="owner.Data_SetPlaybackFlowState(stateValue, reaso";
Debug.ShouldStop(131072);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_statevalue),(Object)(_reason));
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplayicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPlayIcon (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("setplayicon")) { return __ref.runUserSub(false, "playerstatestore","setplayicon", __ref);}
 BA.debugLineNum = 349;BA.debugLine="Public Sub SetPlayIcon";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="owner.Data_SetPlayIcon";
Debug.ShouldStop(536870912);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("SetRemoteDataReady (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("setremotedataready")) { return __ref.runUserSub(false, "playerstatestore","setremotedataready", __ref);}
 BA.debugLineNum = 166;BA.debugLine="Public Sub SetRemoteDataReady";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="policyState.SetRemoteDataReady";
Debug.ShouldStop(64);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackdatapolicystate.class, "_setremotedataready" /*RemoteObject*/ );
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setretryinterval(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetRetryInterval (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,524);
if (RapidSub.canDelegate("setretryinterval")) { return __ref.runUserSub(false, "playerstatestore","setretryinterval", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 524;BA.debugLine="Public Sub SetRetryInterval(value As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 525;BA.debugLine="retryTimerRef.Interval = value";
Debug.ShouldStop(4096);
__ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, _value));
 BA.debugLineNum = 526;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstartupsequenceinprogress(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetStartupSequenceInProgress (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("setstartupsequenceinprogress")) { return __ref.runUserSub(false, "playerstatestore","setstartupsequenceinprogress", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 236;BA.debugLine="Public Sub SetStartupSequenceInProgress(value As B";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="startupSequenceInProgress = value";
Debug.ShouldStop(4096);
__ref.setField ("_startupsequenceinprogress" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 238;BA.debugLine="If value = False Then adWarmupDeferredAfterStartu";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_value,playerstatestore.__c.getField(true,"False"))) { 
__ref.setField ("_adwarmupdeferredafterstartup" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"False"));};
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstopicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStopIcon (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("setstopicon")) { return __ref.runUserSub(false, "playerstatestore","setstopicon", __ref);}
 BA.debugLineNum = 288;BA.debugLine="Public Sub SetStopIcon";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="owner.Data_SetStopIcon";
Debug.ShouldStop(1);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setstopicon" /*RemoteObject*/ );
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shouldresumewithnewstart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShouldResumeWithNewStart (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("shouldresumewithnewstart")) { return __ref.runUserSub(false, "playerstatestore","shouldresumewithnewstart", __ref);}
 BA.debugLineNum = 276;BA.debugLine="Public Sub ShouldResumeWithNewStart As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="Return orchestrationStateRef.IsStarted And IsUser";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstarted" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_isuserstoppedstate" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_ispolicypausestate" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstopping" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showmessage(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ShowMessage (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("showmessage")) { return __ref.runUserSub(false, "playerstatestore","showmessage", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 325;BA.debugLine="Public Sub ShowMessage(text As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 326;BA.debugLine="owner.Data_ShowMessage(text)";
Debug.ShouldStop(32);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_showmessage" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _storage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Storage (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("storage")) { return __ref.runUserSub(false, "playerstatestore","storage", __ref);}
 BA.debugLineNum = 178;BA.debugLine="Public Sub Storage As KeyValueStore";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Return storageRef";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_storageref" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _syncofflineplaylistmetadata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SyncOfflinePlaylistMetadata (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("syncofflineplaylistmetadata")) { return __ref.runUserSub(false, "playerstatestore","syncofflineplaylistmetadata", __ref);}
ResumableSub_SyncOfflinePlaylistMetadata rsub = new ResumableSub_SyncOfflinePlaylistMetadata(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_SyncOfflinePlaylistMetadata(b4j.example.playerstatestore parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playerstatestore parent;
RemoteObject _synced = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SyncOfflinePlaylistMetadata (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,308);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 309;BA.debugLine="Wait For (owner.Data_SyncOfflinePlaylistMetadata)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playerstatestore", "syncofflineplaylistmetadata"), __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_syncofflineplaylistmetadata" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("synced", _synced);
;
 BA.debugLineNum = 310;BA.debugLine="Return synced";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_synced));return;};
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _synced) throws Exception{
}
public static RemoteObject  _timezoneoffsetminutesvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimezoneOffsetMinutesValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("timezoneoffsetminutesvalue")) { return __ref.runUserSub(false, "playerstatestore","timezoneoffsetminutesvalue", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Return owner.TimezoneOffsetMinutesValue";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _traceinfo(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceInfo (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("traceinfo")) { return __ref.runUserSub(false, "playerstatestore","traceinfo", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 126;BA.debugLine="Public Sub TraceInfo(category As String, message A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="owner.Data_TraceInfo(category, message, details)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_traceinfo" /*RemoteObject*/ ,(Object)(_category),(Object)(_message),(Object)(_details));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracelog(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceLog (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("tracelog")) { return __ref.runUserSub(false, "playerstatestore","tracelog", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 122;BA.debugLine="Public Sub TraceLog(message As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="owner.Data_TraceLog(message)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_tracelog" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tracewarn(RemoteObject __ref,RemoteObject _category,RemoteObject _message,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("TraceWarn (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("tracewarn")) { return __ref.runUserSub(false, "playerstatestore","tracewarn", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 130;BA.debugLine="Public Sub TraceWarn(category As String, message A";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="owner.Data_TraceWarn(category, message, details)";
Debug.ShouldStop(4);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_tracewarn" /*RemoteObject*/ ,(Object)(_category),(Object)(_message),(Object)(_details));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trustedsynctimekey(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TrustedSyncTimeKey (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("trustedsynctimekey")) { return __ref.runUserSub(false, "playerstatestore","trustedsynctimekey", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Public Sub TrustedSyncTimeKey As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Return trustedSyncTimeKeyValue";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(true,"_trustedsynctimekeyvalue" /*RemoteObject*/ );
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("UpdateMediaPathDegradedFromCacheSync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,571);
if (RapidSub.canDelegate("updatemediapathdegradedfromcachesync")) { return __ref.runUserSub(false, "playerstatestore","updatemediapathdegradedfromcachesync", __ref, _downloaded, _networkfailure);}
RemoteObject _previous = RemoteObject.createImmutable(false);
Debug.locals.put("downloaded", _downloaded);
Debug.locals.put("networkFailure", _networkfailure);
 BA.debugLineNum = 571;BA.debugLine="Public Sub UpdateMediaPathDegradedFromCacheSync(do";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 572;BA.debugLine="Dim previous As Boolean = mediaPathDegradedFlag";
Debug.ShouldStop(134217728);
_previous = __ref.getField(true,"_mediapathdegradedflag" /*RemoteObject*/ );Debug.locals.put("previous", _previous);Debug.locals.put("previous", _previous);
 BA.debugLineNum = 573;BA.debugLine="If downloaded Then";
Debug.ShouldStop(268435456);
if (_downloaded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 574;BA.debugLine="mediaPathDegradedFlag = False";
Debug.ShouldStop(536870912);
__ref.setField ("_mediapathdegradedflag" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 575;BA.debugLine="Else If networkFailure Then";
Debug.ShouldStop(1073741824);
if (_networkfailure.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 576;BA.debugLine="mediaPathDegradedFlag = True";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mediapathdegradedflag" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 578;BA.debugLine="If previous = False And mediaPathDegradedFlag The";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_previous,playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(true,"_mediapathdegradedflag" /*RemoteObject*/ ))) { 
if (true) return BA.ObjectToString("entered");};
 BA.debugLineNum = 579;BA.debugLine="If previous = True And mediaPathDegradedFlag = Fa";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_previous,playerstatestore.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_mediapathdegradedflag" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("recovered");};
 BA.debugLineNum = 580;BA.debugLine="Return \"\"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 581;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writehealthsnapshot(RemoteObject __ref,RemoteObject _trigger) throws Exception{
try {
		Debug.PushSubsStack("WriteHealthSnapshot (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("writehealthsnapshot")) { return __ref.runUserSub(false, "playerstatestore","writehealthsnapshot", __ref, _trigger);}
Debug.locals.put("trigger", _trigger);
 BA.debugLineNum = 228;BA.debugLine="Public Sub WriteHealthSnapshot(trigger As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="owner.Data_WriteHealthSnapshot(trigger)";
Debug.ShouldStop(16);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_writehealthsnapshot" /*RemoteObject*/ ,(Object)(_trigger));
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
}