package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class playerstatestore_subs_0 {


public static RemoteObject  _applyclientrequestheaders(RemoteObject __ref,RemoteObject _j) throws Exception{
try {
		Debug.PushSubsStack("ApplyClientRequestHeaders (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("applyclientrequestheaders")) { return __ref.runUserSub(false, "playerstatestore","applyclientrequestheaders", __ref, _j);}
Debug.locals.put("j", _j);
 BA.debugLineNum = 135;BA.debugLine="Public Sub ApplyClientRequestHeaders(j As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="owner.Data_ApplyClientRequestHeaders(j)";
Debug.ShouldStop(128);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_applyclientrequestheaders" /*RemoteObject*/ ,(Object)(_j));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ApplyTemporaryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("applytemporarymode")) { return __ref.runUserSub(false, "playerstatestore","applytemporarymode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 310;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="owner.Data_ApplyTemporaryMode(mode)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_applytemporarymode" /*RemoteObject*/ ,(Object)(_mode));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("BeginOfflineDataRefresh (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("beginofflinedatarefresh")) { return __ref.runUserSub(false, "playerstatestore","beginofflinedatarefresh", __ref);}
 BA.debugLineNum = 147;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Return policyState.BeginOfflineDataRefresh";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackdatapolicystate.class, "_beginofflinedatarefresh" /*RemoteObject*/ );
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("BuildDataSlotKey (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,630);
if (RapidSub.canDelegate("builddataslotkey")) { return __ref.runUserSub(false, "playerstatestore","builddataslotkey", __ref, _currentslot);}
Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 630;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 631;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("schedule_title"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("stream_id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable("|"),_currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("slot_time"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 632;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildqueuesignature(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildQueueSignature (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,457);
if (RapidSub.canDelegate("buildqueuesignature")) { return __ref.runUserSub(false, "playerstatestore","buildqueuesignature", __ref);}
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _signatureparts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlistobject = RemoteObject.declareNull("Object");
RemoteObject _playlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 457;BA.debugLine="Public Sub BuildQueueSignature As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 458;BA.debugLine="If OfflineData.IsInitialized = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 459;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
Debug.ShouldStop(1024);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ )));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 460;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 461;BA.debugLine="Dim signatureParts As List";
Debug.ShouldStop(4096);
_signatureparts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("signatureParts", _signatureparts);
 BA.debugLineNum = 462;BA.debugLine="signatureParts.Initialize";
Debug.ShouldStop(8192);
_signatureparts.runVoidMethod ("Initialize");
 BA.debugLineNum = 463;BA.debugLine="signatureParts.Add(\"v=4\")";
Debug.ShouldStop(16384);
_signatureparts.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("v=4"))));
 BA.debugLineNum = 464;BA.debugLine="signatureParts.Add(\"slot=\" & BuildDataSlotKey(cur";
Debug.ShouldStop(32768);
_signatureparts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("slot="),__ref.runClassMethod (b4j.example.playerstatestore.class, "_builddataslotkey" /*RemoteObject*/ ,(Object)(_currentslot))))));
 BA.debugLineNum = 465;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(65536);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(playerstatestore.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 466;BA.debugLine="If playlists.IsInitialized Then";
Debug.ShouldStop(131072);
if (_playlists.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 467;BA.debugLine="For Each playlistObject As Object In playlists";
Debug.ShouldStop(262144);
{
final RemoteObject group10 = _playlists;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_playlistobject = group10.runMethod(false,"Get",index10);Debug.locals.put("playlistObject", _playlistobject);
Debug.locals.put("playlistObject", _playlistobject);
 BA.debugLineNum = 468;BA.debugLine="If playlistObject Is Map Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("i",_playlistobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 469;BA.debugLine="Dim playlist As Map = playlistObject";
Debug.ShouldStop(1048576);
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _playlistobject);Debug.locals.put("playlist", _playlist);Debug.locals.put("playlist", _playlist);
 BA.debugLineNum = 470;BA.debugLine="signatureParts.Add(\"playlist=\" & playlist.GetD";
Debug.ShouldStop(2097152);
_signatureparts.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("playlist="),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(":"),_playlist.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((RemoteObject.createImmutable(""))))))));
 };
 }
}Debug.locals.put("playlistObject", _playlistobject);
;
 };
 BA.debugLineNum = 474;BA.debugLine="signatureParts.Sort(True)";
Debug.ShouldStop(33554432);
_signatureparts.runVoidMethod ("Sort",(Object)(playerstatestore.__c.getField(true,"True")));
 BA.debugLineNum = 475;BA.debugLine="Return JoinList(signatureParts, \"|\")";
Debug.ShouldStop(67108864);
if (true) return __ref.runClassMethod (b4j.example.playerstatestore.class, "_joinlist" /*RemoteObject*/ ,(Object)(_signatureparts),(Object)(RemoteObject.createImmutable("|")));
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _canusedataplaybackresolver(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CanUseDataPlaybackResolver (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("canusedataplaybackresolver")) { return __ref.runUserSub(false, "playerstatestore","canusedataplaybackresolver", __ref);}
 BA.debugLineNum = 375;BA.debugLine="Public Sub CanUseDataPlaybackResolver As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 376;BA.debugLine="Return queueBuilderRef.CanUseDataPlaybackResolver";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_queuebuilderref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuebuilder.class, "_canusedataplaybackresolver" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )));
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _capturestoppedreservequeue(RemoteObject __ref,RemoteObject _playqueue) throws Exception{
try {
		Debug.PushSubsStack("CaptureStoppedReserveQueue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("capturestoppedreservequeue")) { return __ref.runUserSub(false, "playerstatestore","capturestoppedreservequeue", __ref, _playqueue);}
RemoteObject _currentsignature = RemoteObject.createImmutable("");
RemoteObject _reservequeue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playQueue", _playqueue);
 BA.debugLineNum = 497;BA.debugLine="Public Sub CaptureStoppedReserveQueue(playQueue As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 498;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 499;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
Debug.ShouldStop(262144);
_currentsignature = __ref.runClassMethod (b4j.example.playerstatestore.class, "_buildqueuesignature" /*RemoteObject*/ );Debug.locals.put("currentSignature", _currentsignature);Debug.locals.put("currentSignature", _currentsignature);
 BA.debugLineNum = 500;BA.debugLine="If currentSignature = \"\" Then Return";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_currentsignature,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 501;BA.debugLine="Dim reserveQueue As List";
Debug.ShouldStop(1048576);
_reservequeue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("reserveQueue", _reservequeue);
 BA.debugLineNum = 502;BA.debugLine="reserveQueue.Initialize";
Debug.ShouldStop(2097152);
_reservequeue.runVoidMethod ("Initialize");
 BA.debugLineNum = 503;BA.debugLine="For Each itemObject As Object In playQueue";
Debug.ShouldStop(4194304);
{
final RemoteObject group6 = _playqueue;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.runMethod(false,"Get",index6);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 504;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 505;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(16777216);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 506;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_item)),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 507;BA.debugLine="If mediaCacheRef.IsTrackCached(item.GetDefault(";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 508;BA.debugLine="reserveQueue.Add(CloneMap(item))";
Debug.ShouldStop(134217728);
_reservequeue.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playerstatestore.class, "_clonemap" /*RemoteObject*/ ,(Object)(_item)).getObject())));
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 511;BA.debugLine="queueStateRef.CaptureStoppedReserve(reserveQueue,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_capturestoppedreserve" /*RemoteObject*/ ,(Object)(_reservequeue),(Object)(_currentsignature));
 BA.debugLineNum = 512;BA.debugLine="If queueStateRef.StoppedReserveQueue.Size = 0 The";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 513;BA.debugLine="TraceLog(\"резерв очереди save tracks=\" & queueSta";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("резерв очереди save tracks="),__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ClaimUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("claimurlvalue")) { return __ref.runUserSub(false, "playerstatestore","claimurlvalue", __ref);}
 BA.debugLineNum = 111;BA.debugLine="Public Sub ClaimUrlValue As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Return owner.ClaimUrlValue";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_claimurlvalue" /*RemoteObject*/ );
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private owner As B4XMainPage";
playerstatestore._owner = RemoteObject.createNew ("b4j.example.b4xmainpage");__ref.setField("_owner",playerstatestore._owner);
 //BA.debugLineNum = 7;BA.debugLine="Private policyState As PlaybackDataPolicyState";
playerstatestore._policystate = RemoteObject.createNew ("b4j.example.playbackdatapolicystate");__ref.setField("_policystate",playerstatestore._policystate);
 //BA.debugLineNum = 8;BA.debugLine="Private orchestrationStateRef As PlaybackOrchestr";
playerstatestore._orchestrationstateref = RemoteObject.createNew ("b4j.example.playbackorchestrationstate");__ref.setField("_orchestrationstateref",playerstatestore._orchestrationstateref);
 //BA.debugLineNum = 9;BA.debugLine="Private retryFallbackStateRef As PlaybackRetryFal";
playerstatestore._retryfallbackstateref = RemoteObject.createNew ("b4j.example.playbackretryfallbackstate");__ref.setField("_retryfallbackstateref",playerstatestore._retryfallbackstateref);
 //BA.debugLineNum = 10;BA.debugLine="Private queueStateRef As PlaybackQueueState";
playerstatestore._queuestateref = RemoteObject.createNew ("b4j.example.playbackqueuestate");__ref.setField("_queuestateref",playerstatestore._queuestateref);
 //BA.debugLineNum = 11;BA.debugLine="Private queueBuilderRef As PlaybackQueueBuilder";
playerstatestore._queuebuilderref = RemoteObject.createNew ("b4j.example.playbackqueuebuilder");__ref.setField("_queuebuilderref",playerstatestore._queuebuilderref);
 //BA.debugLineNum = 12;BA.debugLine="Private offlineStoreRef As OfflineStore";
playerstatestore._offlinestoreref = RemoteObject.createNew ("b4j.example.offlinestore");__ref.setField("_offlinestoreref",playerstatestore._offlinestoreref);
 //BA.debugLineNum = 13;BA.debugLine="Private dataResolverRef As DataPlaybackResolver";
playerstatestore._dataresolverref = RemoteObject.createNew ("b4j.example.dataplaybackresolver");__ref.setField("_dataresolverref",playerstatestore._dataresolverref);
 //BA.debugLineNum = 14;BA.debugLine="Private mediaCacheRef As MediaCache";
playerstatestore._mediacacheref = RemoteObject.createNew ("b4j.example.mediacache");__ref.setField("_mediacacheref",playerstatestore._mediacacheref);
 //BA.debugLineNum = 15;BA.debugLine="Private storageRef As KeyValueStore";
playerstatestore._storageref = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_storageref",playerstatestore._storageref);
 //BA.debugLineNum = 16;BA.debugLine="Private trustedSyncTimeKeyValue As String";
playerstatestore._trustedsynctimekeyvalue = RemoteObject.createImmutable("");__ref.setField("_trustedsynctimekeyvalue",playerstatestore._trustedsynctimekeyvalue);
 //BA.debugLineNum = 17;BA.debugLine="Private retryTimerRef As Timer";
playerstatestore._retrytimerref = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_retrytimerref",playerstatestore._retrytimerref);
 //BA.debugLineNum = 18;BA.debugLine="Private offlineDataRef As Map";
playerstatestore._offlinedataref = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_offlinedataref",playerstatestore._offlinedataref);
 //BA.debugLineNum = 19;BA.debugLine="Private consecutiveNetworkErrors As Int";
playerstatestore._consecutivenetworkerrors = RemoteObject.createImmutable(0);__ref.setField("_consecutivenetworkerrors",playerstatestore._consecutivenetworkerrors);
 //BA.debugLineNum = 20;BA.debugLine="Private lastRetryMode As String";
playerstatestore._lastretrymode = RemoteObject.createImmutable("");__ref.setField("_lastretrymode",playerstatestore._lastretrymode);
 //BA.debugLineNum = 21;BA.debugLine="Private dataSuccessAtTicks As Long";
playerstatestore._datasuccessatticks = RemoteObject.createImmutable(0L);__ref.setField("_datasuccessatticks",playerstatestore._datasuccessatticks);
 //BA.debugLineNum = 22;BA.debugLine="Private historySuccessAtTicks As Long";
playerstatestore._historysuccessatticks = RemoteObject.createImmutable(0L);__ref.setField("_historysuccessatticks",playerstatestore._historysuccessatticks);
 //BA.debugLineNum = 23;BA.debugLine="Private startupSequenceInProgress As Boolean";
playerstatestore._startupsequenceinprogress = RemoteObject.createImmutable(false);__ref.setField("_startupsequenceinprogress",playerstatestore._startupsequenceinprogress);
 //BA.debugLineNum = 24;BA.debugLine="Private adWarmupDeferredAfterStartup As Boolean";
playerstatestore._adwarmupdeferredafterstartup = RemoteObject.createImmutable(false);__ref.setField("_adwarmupdeferredafterstartup",playerstatestore._adwarmupdeferredafterstartup);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleardispatchretryafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearDispatchRetryAfter (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,583);
if (RapidSub.canDelegate("cleardispatchretryafter")) { return __ref.runUserSub(false, "playerstatestore","cleardispatchretryafter", __ref);}
 BA.debugLineNum = 583;BA.debugLine="Public Sub ClearDispatchRetryAfter";
Debug.ShouldStop(64);
 BA.debugLineNum = 584;BA.debugLine="retryFallbackStateRef.ClearDispatchRetryAfter";
Debug.ShouldStop(128);
__ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackretryfallbackstate.class, "_cleardispatchretryafter" /*RemoteObject*/ );
 BA.debugLineNum = 585;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ClearLastRetryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("clearlastretrymode")) { return __ref.runUserSub(false, "playerstatestore","clearlastretrymode", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub ClearLastRetryMode";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="lastRetryMode = \"\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_lastretrymode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("ClearPlaybackState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("clearplaybackstate")) { return __ref.runUserSub(false, "playerstatestore","clearplaybackstate", __ref);}
 BA.debugLineNum = 314;BA.debugLine="Public Sub ClearPlaybackState";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="owner.Data_ClearPlaybackState";
Debug.ShouldStop(67108864);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_clearplaybackstate" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("ClearPolicyPause (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("clearpolicypause")) { return __ref.runUserSub(false, "playerstatestore","clearpolicypause", __ref);}
 BA.debugLineNum = 297;BA.debugLine="Public Sub ClearPolicyPause";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="owner.Data_ClearPolicyPause";
Debug.ShouldStop(512);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_clearpolicypause" /*RemoteObject*/ );
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("ClearPolicyPauseAndResumeRequest (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("clearpolicypauseandresumerequest")) { return __ref.runUserSub(false, "playerstatestore","clearpolicypauseandresumerequest", __ref);}
 BA.debugLineNum = 338;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="owner.Data_ClearPolicyPauseAndResumeRequest";
Debug.ShouldStop(262144);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_clearpolicypauseandresumerequest" /*RemoteObject*/ );
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearqueuesnapshotstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearQueueSnapshotState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,547);
if (RapidSub.canDelegate("clearqueuesnapshotstate")) { return __ref.runUserSub(false, "playerstatestore","clearqueuesnapshotstate", __ref);}
 BA.debugLineNum = 547;BA.debugLine="Public Sub ClearQueueSnapshotState";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="queueStateRef.ClearQueueSnapshot(storageRef)";
Debug.ShouldStop(8);
__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_clearqueuesnapshot" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_storageref" /*RemoteObject*/ )));
 BA.debugLineNum = 549;BA.debugLine="TraceLog(\"снимок очереди clear\")";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("снимок очереди clear")));
 BA.debugLineNum = 550;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ClearResumePlaybackWhenServerAllows (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("clearresumeplaybackwhenserverallows")) { return __ref.runUserSub(false, "playerstatestore","clearresumeplaybackwhenserverallows", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Public Sub ClearResumePlaybackWhenServerAllows";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="policyState.ResumePlaybackWhenServerAllows = Fals";
Debug.ShouldStop(2048);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).setField ("_resumeplaybackwhenserverallows" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ClearRetryTimer (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("clearretrytimer")) { return __ref.runUserSub(false, "playerstatestore","clearretrytimer", __ref);}
 BA.debugLineNum = 556;BA.debugLine="Public Sub ClearRetryTimer";
Debug.ShouldStop(2048);
 BA.debugLineNum = 557;BA.debugLine="retryTimerRef.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"setEnabled",playerstatestore.__c.getField(true,"False"));
 BA.debugLineNum = 558;BA.debugLine="ClearLastRetryMode";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_clearlastretrymode" /*RemoteObject*/ );
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ClientOsNameValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("clientosnamevalue")) { return __ref.runUserSub(false, "playerstatestore","clientosnamevalue", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Public Sub ClientOsNameValue As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Return owner.ClientOsNameValue";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_clientosnamevalue" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("CloneMap (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,634);
if (RapidSub.canDelegate("clonemap")) { return __ref.runUserSub(false, "playerstatestore","clonemap", __ref, _sourcemap);}
RemoteObject _clonedmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 634;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 635;BA.debugLine="Dim clonedMap As Map";
Debug.ShouldStop(67108864);
_clonedmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("clonedMap", _clonedmap);
 BA.debugLineNum = 636;BA.debugLine="clonedMap.Initialize";
Debug.ShouldStop(134217728);
_clonedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 637;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_sourcemap.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return _clonedmap;};
 BA.debugLineNum = 638;BA.debugLine="For Each key As Object In sourceMap.Keys";
Debug.ShouldStop(536870912);
{
final RemoteObject group4 = _sourcemap.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 639;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
Debug.ShouldStop(1073741824);
_clonedmap.runVoidMethod ("Put",(Object)(_key),(Object)(_sourcemap.runMethod(false,"Get",(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 641;BA.debugLine="Return clonedMap";
Debug.ShouldStop(1);
if (true) return _clonedmap;
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("ConsumeDispatchRetryAfter (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("consumedispatchretryafter")) { return __ref.runUserSub(false, "playerstatestore","consumedispatchretryafter", __ref);}
 BA.debugLineNum = 591;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 592;BA.debugLine="Return retryFallbackStateRef.ConsumeDispatchRetry";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackretryfallbackstate.class, "_consumedispatchretryafter" /*RemoteObject*/ );
 BA.debugLineNum = 593;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ConsumeLastException (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("consumelastexception")) { return __ref.runUserSub(false, "playerstatestore","consumelastexception", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Public Sub ConsumeLastException";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="owner.Data_ConsumeLastException";
Debug.ShouldStop(8);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_consumelastexception" /*RemoteObject*/ );
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("DataUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("dataurlvalue")) { return __ref.runUserSub(false, "playerstatestore","dataurlvalue", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Public Sub DataUrlValue As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Return owner.DataUrlValue";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_dataurlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("DeferAdWarmupAfterStartup (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("deferadwarmupafterstartup")) { return __ref.runUserSub(false, "playerstatestore","deferadwarmupafterstartup", __ref);}
 BA.debugLineNum = 238;BA.debugLine="Public Sub DeferAdWarmupAfterStartup";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="adWarmupDeferredAfterStartup = True";
Debug.ShouldStop(16384);
__ref.setField ("_adwarmupdeferredafterstartup" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"True"));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("DeviceIdValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("deviceidvalue")) { return __ref.runUserSub(false, "playerstatestore","deviceidvalue", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Public Sub DeviceIdValue As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Return owner.DeviceIdValue";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_deviceidvalue" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("DisableBackgroundRefreshTimers (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("disablebackgroundrefreshtimers")) { return __ref.runUserSub(false, "playerstatestore","disablebackgroundrefreshtimers", __ref);}
 BA.debugLineNum = 371;BA.debugLine="Public Sub DisableBackgroundRefreshTimers";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="owner.Data_DisableBackgroundRefreshTimers";
Debug.ShouldStop(524288);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_disablebackgroundrefreshtimers" /*RemoteObject*/ );
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("EffectiveNowTicks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("effectivenowticks")) { return __ref.runUserSub(false, "playerstatestore","effectivenowticks", __ref);}
RemoteObject _devicenow = RemoteObject.createImmutable(0L);
RemoteObject _trustednow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 250;BA.debugLine="Public Sub EffectiveNowTicks As Long";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
Debug.ShouldStop(67108864);
_devicenow = playerstatestore.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("deviceNow", _devicenow);Debug.locals.put("deviceNow", _devicenow);
 BA.debugLineNum = 252;BA.debugLine="Dim trustedNow As Long = storageRef.GetDefault(tr";
Debug.ShouldStop(134217728);
_trustednow = BA.numberCast(long.class, __ref.getField(false,"_storageref" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_getdefault" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_trustedsynctimekeyvalue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("trustedNow", _trustednow);Debug.locals.put("trustedNow", _trustednow);
 BA.debugLineNum = 253;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_trustednow,_devicenow)) { 
if (true) return _trustednow;};
 BA.debugLineNum = 254;BA.debugLine="Return deviceNow";
Debug.ShouldStop(536870912);
if (true) return _devicenow;
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("EnableRetryTimer (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("enableretrytimer")) { return __ref.runUserSub(false, "playerstatestore","enableretrytimer", __ref);}
 BA.debugLineNum = 573;BA.debugLine="Public Sub EnableRetryTimer";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 574;BA.debugLine="retryTimerRef.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"setEnabled",playerstatestore.__c.getField(true,"True"));
 BA.debugLineNum = 575;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("EndOfflineDataRefresh (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("endofflinedatarefresh")) { return __ref.runUserSub(false, "playerstatestore","endofflinedatarefresh", __ref, _statevalue);}
Debug.locals.put("stateValue", _statevalue);
 BA.debugLineNum = 151;BA.debugLine="Public Sub EndOfflineDataRefresh(stateValue As Str";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="policyState.EndOfflineDataRefresh(stateValue)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackdatapolicystate.class, "_endofflinedatarefresh" /*RemoteObject*/ ,(Object)(_statevalue));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("EnsureAdCacheSyncAsync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("ensureadcachesyncasync")) { return __ref.runUserSub(false, "playerstatestore","ensureadcachesyncasync", __ref);}
 BA.debugLineNum = 246;BA.debugLine="Public Sub EnsureAdCacheSyncAsync";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="owner.Data_EnsureAdCacheSyncAsync";
Debug.ShouldStop(4194304);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_ensureadcachesyncasync" /*RemoteObject*/ );
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ensuredataplaybackqueue(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _minitems) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackQueue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("ensuredataplaybackqueue")) { return __ref.runUserSub(false, "playerstatestore","ensuredataplaybackqueue", __ref, _playqueue, _minitems);}
ResumableSub_EnsureDataPlaybackQueue rsub = new ResumableSub_EnsureDataPlaybackQueue(null,__ref,_playqueue,_minitems);
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
public static class ResumableSub_EnsureDataPlaybackQueue extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackQueue(b4j.example.playerstatestore parent,RemoteObject __ref,RemoteObject _playqueue,RemoteObject _minitems) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this._minitems = _minitems;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playerstatestore parent;
RemoteObject _playqueue;
RemoteObject _minitems;
RemoteObject _queueprepared = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackQueue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,387);
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
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("minItems", _minitems);
 BA.debugLineNum = 388;BA.debugLine="Wait For (queueBuilderRef.EnsureDataPlaybackQueue";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playerstatestore", "ensuredataplaybackqueue"), __ref.getField(false,"_queuebuilderref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuebuilder.class, "_ensuredataplaybackqueue" /*RemoteObject*/ ,(Object)(_playqueue),(Object)(_minitems),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_storageref" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_queuestateref" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_dataresolverref" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_queueprepared = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("queuePrepared", _queueprepared);
;
 BA.debugLineNum = 389;BA.debugLine="Return queuePrepared";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_queueprepared));return;};
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _complete(RemoteObject __ref,RemoteObject _queueprepared) throws Exception{
}
public static RemoteObject  _ensuredataplaybackready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackReady (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("ensuredataplaybackready")) { return __ref.runUserSub(false, "playerstatestore","ensuredataplaybackready", __ref);}
ResumableSub_EnsureDataPlaybackReady rsub = new ResumableSub_EnsureDataPlaybackReady(null,__ref);
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
public static class ResumableSub_EnsureDataPlaybackReady extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackReady(b4j.example.playerstatestore parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playerstatestore parent;
RemoteObject _resolverready = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnsureDataPlaybackReady (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,379);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 380;BA.debugLine="Wait For (queueBuilderRef.EnsureDataPlaybackReady";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playerstatestore", "ensuredataplaybackready"), __ref.getField(false,"_queuebuilderref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuebuilder.class, "_ensuredataplaybackready" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ ))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resolverready = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("resolverReady", _resolverready);
;
 BA.debugLineNum = 381;BA.debugLine="If resolverReady = False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resolverready,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 382;BA.debugLine="TraceLog(\"подготовка data playback ошибка\")";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("подготовка data playback ошибка")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 384;BA.debugLine="Return resolverReady";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resolverready));return;};
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _enterlocalplayback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnterLocalPlayback (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("enterlocalplayback")) { return __ref.runUserSub(false, "playerstatestore","enterlocalplayback", __ref);}
 BA.debugLineNum = 350;BA.debugLine="Public Sub EnterLocalPlayback";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 351;BA.debugLine="owner.Data_EnterLocalPlayback";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_enterlocalplayback" /*RemoteObject*/ );
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("EnterPolicyPause (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("enterpolicypause")) { return __ref.runUserSub(false, "playerstatestore","enterpolicypause", __ref, _reason, _connectionmode);}
Debug.locals.put("reason", _reason);
Debug.locals.put("connectionMode", _connectionmode);
 BA.debugLineNum = 330;BA.debugLine="Public Sub EnterPolicyPause(reason As String, conn";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="owner.Data_EnterPolicyPause(reason, connectionMod";
Debug.ShouldStop(1024);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_enterpolicypause" /*RemoteObject*/ ,(Object)(_reason),(Object)(_connectionmode));
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("EnterStartedState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("enterstartedstate")) { return __ref.runUserSub(false, "playerstatestore","enterstartedstate", __ref);}
 BA.debugLineNum = 281;BA.debugLine="Public Sub EnterStartedState";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 282;BA.debugLine="orchestrationStateRef.EnterStartedState";
Debug.ShouldStop(33554432);
__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackorchestrationstate.class, "_enterstartedstate" /*RemoteObject*/ );
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("EnterUserStoppedState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("enteruserstoppedstate")) { return __ref.runUserSub(false, "playerstatestore","enteruserstoppedstate", __ref);}
 BA.debugLineNum = 342;BA.debugLine="Public Sub EnterUserStoppedState";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="owner.Data_EnterUserStoppedState";
Debug.ShouldStop(4194304);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_enteruserstoppedstate" /*RemoteObject*/ );
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("FlushTraceBufferAsync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("flushtracebufferasync")) { return __ref.runUserSub(false, "playerstatestore","flushtracebufferasync", __ref);}
 BA.debugLineNum = 213;BA.debugLine="Public Sub FlushTraceBufferAsync";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="owner.Data_FlushTraceBufferAsync";
Debug.ShouldStop(2097152);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_flushtracebufferasync" /*RemoteObject*/ );
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("GetConsecutiveNetworkErrors (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getconsecutivenetworkerrors")) { return __ref.runUserSub(false, "playerstatestore","getconsecutivenetworkerrors", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetConsecutiveNetworkErrors As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Return consecutiveNetworkErrors";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_consecutivenetworkerrors" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("GetLastDataOkAt (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("getlastdataokat")) { return __ref.runUserSub(false, "playerstatestore","getlastdataokat", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub GetLastDataOkAt As Long";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Return dataSuccessAtTicks";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_datasuccessatticks" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("GetLastHistoryOkAt (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("getlasthistoryokat")) { return __ref.runUserSub(false, "playerstatestore","getlasthistoryokat", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub GetLastHistoryOkAt As Long";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Return historySuccessAtTicks";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_historysuccessatticks" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("GetLastRetryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("getlastretrymode")) { return __ref.runUserSub(false, "playerstatestore","getlastretrymode", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Public Sub GetLastRetryMode As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Return lastRetryMode";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(true,"_lastretrymode" /*RemoteObject*/ );
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
public static RemoteObject  _getretryinterval(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRetryInterval (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("getretryinterval")) { return __ref.runUserSub(false, "playerstatestore","getretryinterval", __ref);}
 BA.debugLineNum = 565;BA.debugLine="Public Sub GetRetryInterval As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="Return retryTimerRef.Interval";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, __ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"getInterval"));
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("HandleMessageItem (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("handlemessageitem")) { return __ref.runUserSub(false, "playerstatestore","handlemessageitem", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 301;BA.debugLine="Public Sub HandleMessageItem(item As Map)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="owner.Data_HandleMessageItem(item)";
Debug.ShouldStop(8192);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_handlemessageitem" /*RemoteObject*/ ,(Object)(_item));
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
public static RemoteObject  _haslocalplaybackfallback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasLocalPlaybackFallback (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("haslocalplaybackfallback")) { return __ref.runUserSub(false, "playerstatestore","haslocalplaybackfallback", __ref);}
 BA.debugLineNum = 359;BA.debugLine="Public Sub HasLocalPlaybackFallback As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 360;BA.debugLine="Return owner.Data_HasLocalPlaybackFallback";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_haslocalplaybackfallback" /*RemoteObject*/ );
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("HideContentBlocks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("hidecontentblocks")) { return __ref.runUserSub(false, "playerstatestore","hidecontentblocks", __ref);}
 BA.debugLineNum = 289;BA.debugLine="Public Sub HideContentBlocks";
Debug.ShouldStop(1);
 BA.debugLineNum = 290;BA.debugLine="owner.Data_HideContentBlocks";
Debug.ShouldStop(2);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_hidecontentblocks" /*RemoteObject*/ );
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("HidePin (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("hidepin")) { return __ref.runUserSub(false, "playerstatestore","hidepin", __ref);}
 BA.debugLineNum = 318;BA.debugLine="Public Sub HidePin";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="owner.Data_HidePin";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_hidepin" /*RemoteObject*/ );
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("IncrementNetworkErrorCount (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("incrementnetworkerrorcount")) { return __ref.runUserSub(false, "playerstatestore","incrementnetworkerrorcount", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Public Sub IncrementNetworkErrorCount";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErro";
Debug.ShouldStop(2048);
__ref.setField ("_consecutivenetworkerrors" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_consecutivenetworkerrors" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _mainpage,RemoteObject _retrytimervalue,RemoteObject _datapolicyvalue,RemoteObject _orchestrationstatevalue,RemoteObject _retryfallbackstatevalue,RemoteObject _queuestatevalue,RemoteObject _queuebuildervalue,RemoteObject _storagevalue,RemoteObject _trustedsynckeyvalue,RemoteObject _offlinestorevalue,RemoteObject _dataresolvervalue,RemoteObject _mediacachevalue) throws Exception{
try {
		Debug.PushSubsStack("Initialize (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "playerstatestore","initialize", __ref, _ba, _mainpage, _retrytimervalue, _datapolicyvalue, _orchestrationstatevalue, _retryfallbackstatevalue, _queuestatevalue, _queuebuildervalue, _storagevalue, _trustedsynckeyvalue, _offlinestorevalue, _dataresolvervalue, _mediacachevalue);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("mainPage", _mainpage);
Debug.locals.put("retryTimerValue", _retrytimervalue);
Debug.locals.put("dataPolicyValue", _datapolicyvalue);
Debug.locals.put("orchestrationStateValue", _orchestrationstatevalue);
Debug.locals.put("retryFallbackStateValue", _retryfallbackstatevalue);
Debug.locals.put("queueStateValue", _queuestatevalue);
Debug.locals.put("queueBuilderValue", _queuebuildervalue);
Debug.locals.put("storageValue", _storagevalue);
Debug.locals.put("trustedSyncKeyValue", _trustedsynckeyvalue);
Debug.locals.put("offlineStoreValue", _offlinestorevalue);
Debug.locals.put("dataResolverValue", _dataresolvervalue);
Debug.locals.put("mediaCacheValue", _mediacachevalue);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(mainPage As B4XMainPage, ret";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="owner = mainPage";
Debug.ShouldStop(134217728);
__ref.setField ("_owner" /*RemoteObject*/ ,_mainpage);
 BA.debugLineNum = 29;BA.debugLine="policyState = dataPolicyValue";
Debug.ShouldStop(268435456);
__ref.setField ("_policystate" /*RemoteObject*/ ,_datapolicyvalue);
 BA.debugLineNum = 30;BA.debugLine="orchestrationStateRef = orchestrationStateValue";
Debug.ShouldStop(536870912);
__ref.setField ("_orchestrationstateref" /*RemoteObject*/ ,_orchestrationstatevalue);
 BA.debugLineNum = 31;BA.debugLine="retryFallbackStateRef = retryFallbackStateValue";
Debug.ShouldStop(1073741824);
__ref.setField ("_retryfallbackstateref" /*RemoteObject*/ ,_retryfallbackstatevalue);
 BA.debugLineNum = 32;BA.debugLine="queueStateRef = queueStateValue";
Debug.ShouldStop(-2147483648);
__ref.setField ("_queuestateref" /*RemoteObject*/ ,_queuestatevalue);
 BA.debugLineNum = 33;BA.debugLine="queueBuilderRef = queueBuilderValue";
Debug.ShouldStop(1);
__ref.setField ("_queuebuilderref" /*RemoteObject*/ ,_queuebuildervalue);
 BA.debugLineNum = 34;BA.debugLine="offlineStoreRef = offlineStoreValue";
Debug.ShouldStop(2);
__ref.setField ("_offlinestoreref" /*RemoteObject*/ ,_offlinestorevalue);
 BA.debugLineNum = 35;BA.debugLine="dataResolverRef = dataResolverValue";
Debug.ShouldStop(4);
__ref.setField ("_dataresolverref" /*RemoteObject*/ ,_dataresolvervalue);
 BA.debugLineNum = 36;BA.debugLine="mediaCacheRef = mediaCacheValue";
Debug.ShouldStop(8);
__ref.setField ("_mediacacheref" /*RemoteObject*/ ,_mediacachevalue);
 BA.debugLineNum = 37;BA.debugLine="storageRef = storageValue";
Debug.ShouldStop(16);
__ref.setField ("_storageref" /*RemoteObject*/ ,_storagevalue);
 BA.debugLineNum = 38;BA.debugLine="trustedSyncTimeKeyValue = trustedSyncKeyValue";
Debug.ShouldStop(32);
__ref.setField ("_trustedsynctimekeyvalue" /*RemoteObject*/ ,_trustedsynckeyvalue);
 BA.debugLineNum = 39;BA.debugLine="retryTimerRef = retryTimerValue";
Debug.ShouldStop(64);
__ref.setField ("_retrytimerref" /*RemoteObject*/ ,_retrytimervalue);
 BA.debugLineNum = 40;BA.debugLine="offlineDataRef.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _invalidaterelevanttrackidscache(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InvalidateRelevantTrackIdsCache (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("invalidaterelevanttrackidscache")) { return __ref.runUserSub(false, "playerstatestore","invalidaterelevanttrackidscache", __ref);}
 BA.debugLineNum = 217;BA.debugLine="Public Sub InvalidateRelevantTrackIdsCache";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="owner.Data_InvalidateRelevantTrackIdsCache";
Debug.ShouldStop(33554432);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_invalidaterelevanttrackidscache" /*RemoteObject*/ );
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("IsAdWarmupDeferredAfterStartup (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("isadwarmupdeferredafterstartup")) { return __ref.runUserSub(false, "playerstatestore","isadwarmupdeferredafterstartup", __ref);}
 BA.debugLineNum = 242;BA.debugLine="Public Sub IsAdWarmupDeferredAfterStartup As Boole";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="Return adWarmupDeferredAfterStartup";
Debug.ShouldStop(262144);
if (true) return __ref.getField(true,"_adwarmupdeferredafterstartup" /*RemoteObject*/ );
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("IsMediaPathDegraded (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("ismediapathdegraded")) { return __ref.runUserSub(false, "playerstatestore","ismediapathdegraded", __ref);}
 BA.debugLineNum = 599;BA.debugLine="Public Sub IsMediaPathDegraded As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 600;BA.debugLine="Return retryFallbackStateRef.IsMediaPathDegraded";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).getField(true,"_ismediapathdegraded" /*RemoteObject*/ );
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
public static RemoteObject  _isplaybackpausedbypolicy(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsPlaybackPausedByPolicy (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("isplaybackpausedbypolicy")) { return __ref.runUserSub(false, "playerstatestore","isplaybackpausedbypolicy", __ref);}
 BA.debugLineNum = 569;BA.debugLine="Public Sub IsPlaybackPausedByPolicy As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 570;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_isplaybackpausedbypolicy" /*RemoteObject*/ );
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("IsPlaybackStarted (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("isplaybackstarted")) { return __ref.runUserSub(false, "playerstatestore","isplaybackstarted", __ref);}
 BA.debugLineNum = 257;BA.debugLine="Public Sub IsPlaybackStarted As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Return orchestrationStateRef.IsStarted";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstarted" /*RemoteObject*/ );
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("IsPolicyPauseState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("ispolicypausestate")) { return __ref.runUserSub(false, "playerstatestore","ispolicypausestate", __ref);}
 BA.debugLineNum = 269;BA.debugLine="Public Sub IsPolicyPauseState As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_isplaybackpausedbypolicy" /*RemoteObject*/ );
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("IsStartupSequenceInProgress (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("isstartupsequenceinprogress")) { return __ref.runUserSub(false, "playerstatestore","isstartupsequenceinprogress", __ref);}
 BA.debugLineNum = 229;BA.debugLine="Public Sub IsStartupSequenceInProgress As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="Return startupSequenceInProgress";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_startupsequenceinprogress" /*RemoteObject*/ );
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("IsStoppedByUser (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("isstoppedbyuser")) { return __ref.runUserSub(false, "playerstatestore","isstoppedbyuser", __ref);}
 BA.debugLineNum = 261;BA.debugLine="Public Sub IsStoppedByUser As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 262;BA.debugLine="Return orchestrationStateRef.IsStoppedByUser";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstoppedbyuser" /*RemoteObject*/ );
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("IsStopping (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("isstopping")) { return __ref.runUserSub(false, "playerstatestore","isstopping", __ref);}
 BA.debugLineNum = 277;BA.debugLine="Public Sub IsStopping As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="Return orchestrationStateRef.IsStopping";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstopping" /*RemoteObject*/ );
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("IsTraceUploadEnabled (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("istraceuploadenabled")) { return __ref.runUserSub(false, "playerstatestore","istraceuploadenabled", __ref);}
RemoteObject _snapshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playerdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 201;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Dim snapshot As Map = OfflineData";
Debug.ShouldStop(512);
_snapshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_snapshot = __ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ );Debug.locals.put("snapshot", _snapshot);Debug.locals.put("snapshot", _snapshot);
 BA.debugLineNum = 203;BA.debugLine="If snapshot.IsInitialized = False Then Return Fal";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_snapshot.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 204;BA.debugLine="If snapshot.GetDefault(\"ok\", False) <> True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ok"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True")))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 205;BA.debugLine="If snapshot.ContainsKey(\"trace\") Then";
Debug.ShouldStop(4096);
if (_snapshot.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("trace")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="Return snapshot.GetDefault(\"trace\", False) = Tru";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("trace"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True"))));
 };
 BA.debugLineNum = 208;BA.debugLine="Dim playerData As Map = snapshot.GetDefault(\"play";
Debug.ShouldStop(32768);
_playerdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playerdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _snapshot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("player"))),(Object)(playerstatestore.__c.getField(false,"Null"))));Debug.locals.put("playerData", _playerdata);Debug.locals.put("playerData", _playerdata);
 BA.debugLineNum = 209;BA.debugLine="If playerData.IsInitialized = False Then Return F";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_playerdata.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 210;BA.debugLine="Return playerData.ContainsKey(\"trace\") And player";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_playerdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("trace"))))) && RemoteObject.solveBoolean("=",_playerdata.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("trace"))),(Object)((playerstatestore.__c.getField(true,"False")))),(playerstatestore.__c.getField(true,"True"))));
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("IsTrackCached (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("istrackcached")) { return __ref.runUserSub(false, "playerstatestore","istrackcached", __ref, _trackid);}
Debug.locals.put("trackId", _trackid);
 BA.debugLineNum = 619;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
Debug.ShouldStop(1024);
 BA.debugLineNum = 620;BA.debugLine="Return mediaCacheRef.IsTrackCached(trackId)";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(_trackid));
 BA.debugLineNum = 621;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("IsUserStoppedState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("isuserstoppedstate")) { return __ref.runUserSub(false, "playerstatestore","isuserstoppedstate", __ref);}
 BA.debugLineNum = 265;BA.debugLine="Public Sub IsUserStoppedState As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="Return orchestrationStateRef.IsStarted = False An";
Debug.ShouldStop(512);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstarted" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_isplaybackpausedbypolicy" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstoppedbyuser" /*RemoteObject*/ )));
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvaliddatatrackitem(RemoteObject __ref,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("IsValidDataTrackItem (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,623);
if (RapidSub.canDelegate("isvaliddatatrackitem")) { return __ref.runUserSub(false, "playerstatestore","isvaliddatatrackitem", __ref, _item);}
Debug.locals.put("item", _item);
 BA.debugLineNum = 623;BA.debugLine="Private Sub IsValidDataTrackItem(item As Map) As B";
Debug.ShouldStop(16384);
 BA.debugLineNum = 624;BA.debugLine="If item.IsInitialized = False Or item.Size = 0 Th";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_item.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_item.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 625;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("track")))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 626;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return Fal";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))),RemoteObject.createImmutable(("")))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 627;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return playerstatestore.__c.getField(true,"True");
 BA.debugLineNum = 628;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinlist(RemoteObject __ref,RemoteObject _items,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("JoinList (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,644);
if (RapidSub.canDelegate("joinlist")) { return __ref.runUserSub(false, "playerstatestore","joinlist", __ref, _items, _separator);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("items", _items);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 644;BA.debugLine="Private Sub JoinList(items As List, separator As S";
Debug.ShouldStop(8);
 BA.debugLineNum = 645;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 646;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 647;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(64);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_items.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 648;BA.debugLine="If i > 0 Then sb.Append(separator)";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(_separator));};
 BA.debugLineNum = 649;BA.debugLine="sb.Append(items.Get(i))";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_items.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 651;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(1024);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lastofflinedatarefreshstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LastOfflineDataRefreshState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("lastofflinedatarefreshstate")) { return __ref.runUserSub(false, "playerstatestore","lastofflinedatarefreshstate", __ref);}
 BA.debugLineNum = 159;BA.debugLine="Public Sub LastOfflineDataRefreshState As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 160;BA.debugLine="Return policyState.LastOfflineDataRefreshState";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_lastofflinedatarefreshstate" /*RemoteObject*/ );
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
public static RemoteObject  _loadcachedplaylistmetadata(RemoteObject __ref,RemoteObject _playlistid) throws Exception{
try {
		Debug.PushSubsStack("LoadCachedPlaylistMetadata (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,615);
if (RapidSub.canDelegate("loadcachedplaylistmetadata")) { return __ref.runUserSub(false, "playerstatestore","loadcachedplaylistmetadata", __ref, _playlistid);}
Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 615;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
Debug.ShouldStop(64);
 BA.debugLineNum = 616;BA.debugLine="Return dataResolverRef.LoadCachedPlaylistMetadata";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(_playlistid));
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("MessageValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("messagevalue")) { return __ref.runUserSub(false, "playerstatestore","messagevalue", __ref, _key);}
Debug.locals.put("key", _key);
 BA.debugLineNum = 115;BA.debugLine="Public Sub MessageValue(key As String) As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Return owner.Data_MessageValue(key)";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_messagevalue" /*RemoteObject*/ ,(Object)(_key));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("NextUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("nexturlvalue")) { return __ref.runUserSub(false, "playerstatestore","nexturlvalue", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Public Sub NextUrlValue As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Return owner.NextUrlValue";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_nexturlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("OfflineData (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("offlinedata")) { return __ref.runUserSub(false, "playerstatestore","offlinedata", __ref);}
 BA.debugLineNum = 196;BA.debugLine="Public Sub OfflineData As Map";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 198;BA.debugLine="Return offlineDataRef";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_offlinedataref" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("PlayerCodeValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("playercodevalue")) { return __ref.runUserSub(false, "playerstatestore","playercodevalue", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub PlayerCodeValue As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Return owner.PlayerCodeValue";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_playercodevalue" /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("RefreshConnectionIndicatorState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("refreshconnectionindicatorstate")) { return __ref.runUserSub(false, "playerstatestore","refreshconnectionindicatorstate", __ref);}
 BA.debugLineNum = 221;BA.debugLine="Public Sub RefreshConnectionIndicatorState";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="owner.Data_RefreshConnectionIndicatorState";
Debug.ShouldStop(536870912);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_refreshconnectionindicatorstate" /*RemoteObject*/ );
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requestskipqueuesnapshotrestore(RemoteObject __ref,RemoteObject _reason) throws Exception{
try {
		Debug.PushSubsStack("RequestSkipQueueSnapshotRestore (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("requestskipqueuesnapshotrestore")) { return __ref.runUserSub(false, "playerstatestore","requestskipqueuesnapshotrestore", __ref, _reason);}
Debug.locals.put("reason", _reason);
 BA.debugLineNum = 354;BA.debugLine="Public Sub RequestSkipQueueSnapshotRestore(reason";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="queueStateRef.RequestSkipQueueSnapshotRestore";
Debug.ShouldStop(4);
__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_requestskipqueuesnapshotrestore" /*RemoteObject*/ );
 BA.debugLineNum = 356;BA.debugLine="TraceLog(\"снимок очереди восстановление skip reas";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("снимок очереди восстановление skip reason="),_reason)));
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("ResetConsecutiveNetworkErrors (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("resetconsecutivenetworkerrors")) { return __ref.runUserSub(false, "playerstatestore","resetconsecutivenetworkerrors", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub ResetConsecutiveNetworkErrors";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="consecutiveNetworkErrors = 0";
Debug.ShouldStop(32768);
__ref.setField ("_consecutivenetworkerrors" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
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
public static RemoteObject  _resetretrydelaystate(RemoteObject __ref,RemoteObject _localretryinitial,RemoteObject _serverretryinitial) throws Exception{
try {
		Debug.PushSubsStack("ResetRetryDelayState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("resetretrydelaystate")) { return __ref.runUserSub(false, "playerstatestore","resetretrydelaystate", __ref, _localretryinitial, _serverretryinitial);}
Debug.locals.put("localRetryInitial", _localretryinitial);
Debug.locals.put("serverRetryInitial", _serverretryinitial);
 BA.debugLineNum = 577;BA.debugLine="Public Sub ResetRetryDelayState(localRetryInitial";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="retryFallbackStateRef.ResetRetryDelays(localRetry";
Debug.ShouldStop(2);
__ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackretryfallbackstate.class, "_resetretrydelays" /*RemoteObject*/ ,(Object)(_localretryinitial),(Object)(_serverretryinitial));
 BA.debugLineNum = 579;BA.debugLine="If GetConsecutiveNetworkErrors > 0 Then TraceInfo";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.runClassMethod (b4j.example.playerstatestore.class, "_getconsecutivenetworkerrors" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4j.example.playerstatestore.class, "_traceinfo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("network")),(Object)(BA.ObjectToString("retry сброшен")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("errors="),__ref.runClassMethod (b4j.example.playerstatestore.class, "_getconsecutivenetworkerrors" /*RemoteObject*/ ))));};
 BA.debugLineNum = 580;BA.debugLine="ResetConsecutiveNetworkErrors";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_resetconsecutivenetworkerrors" /*RemoteObject*/ );
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
public static RemoteObject  _resolvecurrentdataslot(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("ResolveCurrentDataSlot (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,607);
if (RapidSub.canDelegate("resolvecurrentdataslot")) { return __ref.runUserSub(false, "playerstatestore","resolvecurrentdataslot", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 607;BA.debugLine="Public Sub ResolveCurrentDataSlot(data As Map) As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 608;BA.debugLine="Return dataResolverRef.ResolveCurrentDataSlot(dat";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvecurrentdataslot" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 609;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("ResolveDataSlotAtTicks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("resolvedataslotatticks")) { return __ref.runUserSub(false, "playerstatestore","resolvedataslotatticks", __ref, _data, _targetticks);}
Debug.locals.put("data", _data);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 603;BA.debugLine="Public Sub ResolveDataSlotAtTicks(data As Map, tar";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 604;BA.debugLine="Return dataResolverRef.ResolveDataSlotAtTicks(dat";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(_data),(Object)(_targetticks));
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ResolveIdleUntilMessage (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("resolveidleuntilmessage")) { return __ref.runUserSub(false, "playerstatestore","resolveidleuntilmessage", __ref, _data, _targetticks);}
Debug.locals.put("data", _data);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 367;BA.debugLine="Public Sub ResolveIdleUntilMessage(data As Map, ta";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="Return owner.Data_ResolveIdleUntilMessage(data, t";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_resolveidleuntilmessage" /*RemoteObject*/ ,(Object)(_data),(Object)(_targetticks));
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("ResolveNextDataSlotAtTicks (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("resolvenextdataslotatticks")) { return __ref.runUserSub(false, "playerstatestore","resolvenextdataslotatticks", __ref, _data, _targetticks);}
Debug.locals.put("data", _data);
Debug.locals.put("targetTicks", _targetticks);
 BA.debugLineNum = 611;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(data As Map,";
Debug.ShouldStop(4);
 BA.debugLineNum = 612;BA.debugLine="Return dataResolverRef.ResolveNextDataSlotAtTicks";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvenextdataslotatticks" /*RemoteObject*/ ,(Object)(_data),(Object)(_targetticks));
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("ResolveRetryDelay (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,552);
if (RapidSub.canDelegate("resolveretrydelay")) { return __ref.runUserSub(false, "playerstatestore","resolveretrydelay", __ref, _mode, _delayms, _localretrymax, _serverretrymax, _blockedretrydelay);}
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
Debug.locals.put("localRetryMax", _localretrymax);
Debug.locals.put("serverRetryMax", _serverretrymax);
Debug.locals.put("blockedRetryDelay", _blockedretrydelay);
 BA.debugLineNum = 552;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
Debug.ShouldStop(128);
 BA.debugLineNum = 553;BA.debugLine="Return retryFallbackStateRef.ResolveRetryDelay(mo";
Debug.ShouldStop(256);
if (true) return __ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackretryfallbackstate.class, "_resolveretrydelay" /*RemoteObject*/ ,(Object)(_mode),(Object)(_delayms),(Object)(_localretrymax),(Object)(_serverretrymax),(Object)(_blockedretrydelay));
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _restorestoppedreservequeue(RemoteObject __ref,RemoteObject _playqueue) throws Exception{
try {
		Debug.PushSubsStack("RestoreStoppedReserveQueue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,518);
if (RapidSub.canDelegate("restorestoppedreservequeue")) { return __ref.runUserSub(false, "playerstatestore","restorestoppedreservequeue", __ref, _playqueue);}
RemoteObject _currentsignature = RemoteObject.createImmutable("");
RemoteObject _restoredqueue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _restoredcount = RemoteObject.createImmutable(0);
RemoteObject _restoredobject = RemoteObject.declareNull("Object");
Debug.locals.put("playQueue", _playqueue);
 BA.debugLineNum = 518;BA.debugLine="Public Sub RestoreStoppedReserveQueue(playQueue As";
Debug.ShouldStop(32);
 BA.debugLineNum = 519;BA.debugLine="If queueStateRef.StoppedReserveQueue.IsInitialize";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).getField(false,"_stoppedreservequeue" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 520;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
Debug.ShouldStop(128);
_currentsignature = __ref.runClassMethod (b4j.example.playerstatestore.class, "_buildqueuesignature" /*RemoteObject*/ );Debug.locals.put("currentSignature", _currentsignature);Debug.locals.put("currentSignature", _currentsignature);
 BA.debugLineNum = 521;BA.debugLine="If currentSignature = \"\" Then Return False";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_currentsignature,BA.ObjectToString(""))) { 
if (true) return playerstatestore.__c.getField(true,"False");};
 BA.debugLineNum = 522;BA.debugLine="If queueStateRef.CanRestoreStoppedReserve(current";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_canrestorestoppedreserve" /*RemoteObject*/ ,(Object)(_currentsignature)),playerstatestore.__c.getField(true,"False"))) { 
 BA.debugLineNum = 523;BA.debugLine="queueStateRef.ClearStoppedReserve";
Debug.ShouldStop(1024);
__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_clearstoppedreserve" /*RemoteObject*/ );
 BA.debugLineNum = 524;BA.debugLine="Return False";
Debug.ShouldStop(2048);
if (true) return playerstatestore.__c.getField(true,"False");
 };
 BA.debugLineNum = 526;BA.debugLine="Dim restoredQueue As List";
Debug.ShouldStop(8192);
_restoredqueue = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("restoredQueue", _restoredqueue);
 BA.debugLineNum = 527;BA.debugLine="restoredQueue.Initialize";
Debug.ShouldStop(16384);
_restoredqueue.runVoidMethod ("Initialize");
 BA.debugLineNum = 528;BA.debugLine="For Each itemObject As Object In queueStateRef.St";
Debug.ShouldStop(32768);
{
final RemoteObject group10 = __ref.getField(false,"_queuestateref" /*RemoteObject*/ ).getField(false,"_stoppedreservequeue" /*RemoteObject*/ );
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_itemobject = group10.runMethod(false,"Get",index10);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 529;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 530;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(131072);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 531;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_item)),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 532;BA.debugLine="If mediaCacheRef.IsTrackCached(item.GetDefault(";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mediacacheref" /*RemoteObject*/ ).runClassMethod (b4j.example.mediacache.class, "_istrackcached" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_item.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable(""))))))),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 533;BA.debugLine="restoredQueue.Add(CloneMap(item))";
Debug.ShouldStop(1048576);
_restoredqueue.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playerstatestore.class, "_clonemap" /*RemoteObject*/ ,(Object)(_item)).getObject())));
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 536;BA.debugLine="queueStateRef.ClearStoppedReserve";
Debug.ShouldStop(8388608);
__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_clearstoppedreserve" /*RemoteObject*/ );
 BA.debugLineNum = 537;BA.debugLine="If playQueue.IsInitialized = False Then playQueue";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
_playqueue.runVoidMethod ("Initialize");};
 BA.debugLineNum = 538;BA.debugLine="playQueue.Clear";
Debug.ShouldStop(33554432);
_playqueue.runVoidMethod ("Clear");
 BA.debugLineNum = 539;BA.debugLine="Dim restoredCount As Int = 0";
Debug.ShouldStop(67108864);
_restoredcount = BA.numberCast(int.class, 0);Debug.locals.put("restoredCount", _restoredcount);Debug.locals.put("restoredCount", _restoredcount);
 BA.debugLineNum = 540;BA.debugLine="For Each restoredObject As Object In restoredQueu";
Debug.ShouldStop(134217728);
{
final RemoteObject group22 = _restoredqueue;
final int groupLen22 = group22.runMethod(true,"getSize").<Integer>get()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_restoredobject = group22.runMethod(false,"Get",index22);Debug.locals.put("restoredObject", _restoredobject);
Debug.locals.put("restoredObject", _restoredobject);
 BA.debugLineNum = 541;BA.debugLine="playQueue.Add(restoredObject)";
Debug.ShouldStop(268435456);
_playqueue.runVoidMethod ("Add",(Object)(_restoredobject));
 BA.debugLineNum = 542;BA.debugLine="restoredCount = restoredCount + 1";
Debug.ShouldStop(536870912);
_restoredcount = RemoteObject.solve(new RemoteObject[] {_restoredcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("restoredCount", _restoredcount);
 }
}Debug.locals.put("restoredObject", _restoredobject);
;
 BA.debugLineNum = 544;BA.debugLine="Return restoredCount > 0";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_restoredcount,BA.numberCast(double.class, 0)));
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resumeplaybackafterpolicypauseasync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResumePlaybackAfterPolicyPauseAsync (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("resumeplaybackafterpolicypauseasync")) { return __ref.runUserSub(false, "playerstatestore","resumeplaybackafterpolicypauseasync", __ref);}
 BA.debugLineNum = 293;BA.debugLine="Public Sub ResumePlaybackAfterPolicyPauseAsync";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="owner.Data_ResumePlaybackAfterPolicyPauseAsync";
Debug.ShouldStop(32);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_resumeplaybackafterpolicypauseasync" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("ResumePlaybackWhenServerAllows (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("resumeplaybackwhenserverallows")) { return __ref.runUserSub(false, "playerstatestore","resumeplaybackwhenserverallows", __ref);}
 BA.debugLineNum = 167;BA.debugLine="Public Sub ResumePlaybackWhenServerAllows As Boole";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Return policyState.ResumePlaybackWhenServerAllows";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_policystate" /*RemoteObject*/ ).getField(true,"_resumeplaybackwhenserverallows" /*RemoteObject*/ );
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("SaveOfflineData (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("saveofflinedata")) { return __ref.runUserSub(false, "playerstatestore","saveofflinedata", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 183;BA.debugLine="Public Sub SaveOfflineData(data As Map)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="offlineDataRef = offlineStoreRef.SaveOfflineData(";
Debug.ShouldStop(8388608);
__ref.setField ("_offlinedataref" /*RemoteObject*/ ,__ref.getField(false,"_offlinestoreref" /*RemoteObject*/ ).runClassMethod (b4j.example.offlinestore.class, "_saveofflinedata" /*RemoteObject*/ ,(Object)(_data),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_playercodevalue" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_deviceidvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 185;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
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
public static RemoteObject  _savequeuesnapshotstate(RemoteObject __ref,RemoteObject _playqueue) throws Exception{
try {
		Debug.PushSubsStack("SaveQueueSnapshotState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,479);
if (RapidSub.canDelegate("savequeuesnapshotstate")) { return __ref.runUserSub(false, "playerstatestore","savequeuesnapshotstate", __ref, _playqueue);}
RemoteObject _signature = RemoteObject.createImmutable("");
RemoteObject _snapshottracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemobject = RemoteObject.declareNull("Object");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("playQueue", _playqueue);
 BA.debugLineNum = 479;BA.debugLine="Public Sub SaveQueueSnapshotState(playQueue As Lis";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="If playQueue.IsInitialized = False Then Return";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_playqueue.runMethod(true,"IsInitialized"),playerstatestore.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 481;BA.debugLine="Dim signature As String = BuildQueueSignature";
Debug.ShouldStop(1);
_signature = __ref.runClassMethod (b4j.example.playerstatestore.class, "_buildqueuesignature" /*RemoteObject*/ );Debug.locals.put("signature", _signature);Debug.locals.put("signature", _signature);
 BA.debugLineNum = 482;BA.debugLine="If signature = \"\" Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_signature,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 483;BA.debugLine="Dim snapshotTracks As List";
Debug.ShouldStop(4);
_snapshottracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("snapshotTracks", _snapshottracks);
 BA.debugLineNum = 484;BA.debugLine="snapshotTracks.Initialize";
Debug.ShouldStop(8);
_snapshottracks.runVoidMethod ("Initialize");
 BA.debugLineNum = 485;BA.debugLine="For Each itemObject As Object In playQueue";
Debug.ShouldStop(16);
{
final RemoteObject group6 = _playqueue;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.runMethod(false,"Get",index6);Debug.locals.put("itemObject", _itemobject);
Debug.locals.put("itemObject", _itemobject);
 BA.debugLineNum = 486;BA.debugLine="If itemObject Is Map Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("i",_itemobject, RemoteObject.createImmutable("java.util.Map"))) { 
 BA.debugLineNum = 487;BA.debugLine="Dim item As Map = itemObject";
Debug.ShouldStop(64);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemobject);Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 488;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_isvaliddatatrackitem" /*RemoteObject*/ ,(Object)(_item)),playerstatestore.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 489;BA.debugLine="snapshotTracks.Add(CloneMap(item))";
Debug.ShouldStop(256);
_snapshottracks.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.playerstatestore.class, "_clonemap" /*RemoteObject*/ ,(Object)(_item)).getObject())));
 BA.debugLineNum = 490;BA.debugLine="If snapshotTracks.Size >= 20 Then Exit";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",_snapshottracks.runMethod(true,"getSize"),BA.numberCast(double.class, 20))) { 
if (true) break;};
 };
 }
}Debug.locals.put("itemObject", _itemobject);
;
 BA.debugLineNum = 493;BA.debugLine="queueStateRef.SaveQueueSnapshot(storageRef, signa";
Debug.ShouldStop(4096);
__ref.getField(false,"_queuestateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackqueuestate.class, "_savequeuesnapshot" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_storageref" /*RemoteObject*/ )),(Object)(_signature),(Object)(_snapshottracks),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 494;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("SaveServerSnapshot (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("saveserversnapshot")) { return __ref.runUserSub(false, "playerstatestore","saveserversnapshot", __ref, _method, _url, _success, _body, _errormessage);}
Debug.locals.put("method", _method);
Debug.locals.put("url", _url);
Debug.locals.put("success", _success);
Debug.locals.put("body", _body);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 139;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="owner.Data_SaveServerSnapshot(method, url, succes";
Debug.ShouldStop(2048);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_saveserversnapshot" /*RemoteObject*/ ,(Object)(_method),(Object)(_url),(Object)(_success),(Object)(_body),(Object)(_errormessage));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ScheduleRetry (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("scheduleretry")) { return __ref.runUserSub(false, "playerstatestore","scheduleretry", __ref, _mode, _delayms);}
Debug.locals.put("mode", _mode);
Debug.locals.put("delayMs", _delayms);
 BA.debugLineNum = 326;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="owner.Data_ScheduleRetry(mode, delayMs)";
Debug.ShouldStop(64);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_scheduleretry" /*RemoteObject*/ ,(Object)(_mode),(Object)(_delayms));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("SecondsAgoText (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("secondsagotext")) { return __ref.runUserSub(false, "playerstatestore","secondsagotext", __ref, _ticksvalue);}
Debug.locals.put("ticksValue", _ticksvalue);
 BA.debugLineNum = 143;BA.debugLine="Public Sub SecondsAgoText(ticksValue As Long) As S";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Return owner.Data_SecondsAgoText(ticksValue)";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_secondsagotext" /*RemoteObject*/ ,(Object)(_ticksvalue));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("ServiceCheckUrlValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("servicecheckurlvalue")) { return __ref.runUserSub(false, "playerstatestore","servicecheckurlvalue", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Return owner.ServiceCheckUrlValue";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_servicecheckurlvalue" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("SetDispatchRetryAfter (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("setdispatchretryafter")) { return __ref.runUserSub(false, "playerstatestore","setdispatchretryafter", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 587;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 588;BA.debugLine="retryFallbackStateRef.SetDispatchRetryAfter(value";
Debug.ShouldStop(2048);
__ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackretryfallbackstate.class, "_setdispatchretryafter" /*RemoteObject*/ ,(Object)(_value));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("SetLastDataOkNow (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setlastdataoknow")) { return __ref.runUserSub(false, "playerstatestore","setlastdataoknow", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Public Sub SetLastDataOkNow";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="dataSuccessAtTicks = DateTime.Now";
Debug.ShouldStop(8);
__ref.setField ("_datasuccessatticks" /*RemoteObject*/ ,playerstatestore.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("SetLastHistoryOkNow (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setlasthistoryoknow")) { return __ref.runUserSub(false, "playerstatestore","setlasthistoryoknow", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Public Sub SetLastHistoryOkNow";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="historySuccessAtTicks = DateTime.Now";
Debug.ShouldStop(2048);
__ref.setField ("_historysuccessatticks" /*RemoteObject*/ ,playerstatestore.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("SetLastOfflineDataRefreshState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("setlastofflinedatarefreshstate")) { return __ref.runUserSub(false, "playerstatestore","setlastofflinedatarefreshstate", __ref, _statevalue);}
Debug.locals.put("stateValue", _statevalue);
 BA.debugLineNum = 155;BA.debugLine="Public Sub SetLastOfflineDataRefreshState(stateVal";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="policyState.LastOfflineDataRefreshState = stateVa";
Debug.ShouldStop(134217728);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).setField ("_lastofflinedatarefreshstate" /*RemoteObject*/ ,_statevalue);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("SetLastRetryMode (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setlastretrymode")) { return __ref.runUserSub(false, "playerstatestore","setlastretrymode", __ref, _mode);}
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 55;BA.debugLine="Public Sub SetLastRetryMode(mode As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="lastRetryMode = mode";
Debug.ShouldStop(8388608);
__ref.setField ("_lastretrymode" /*RemoteObject*/ ,_mode);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("SetLocalFallbackReady (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("setlocalfallbackready")) { return __ref.runUserSub(false, "playerstatestore","setlocalfallbackready", __ref, _fallbackready);}
Debug.locals.put("fallbackReady", _fallbackready);
 BA.debugLineNum = 363;BA.debugLine="Public Sub SetLocalFallbackReady(fallbackReady As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 364;BA.debugLine="owner.Data_SetLocalFallbackReady(fallbackReady)";
Debug.ShouldStop(2048);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setlocalfallbackready" /*RemoteObject*/ ,(Object)(_fallbackready));
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("SetMediaPathDegraded (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,595);
if (RapidSub.canDelegate("setmediapathdegraded")) { return __ref.runUserSub(false, "playerstatestore","setmediapathdegraded", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 595;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 596;BA.debugLine="retryFallbackStateRef.SetMediaPathDegraded(value)";
Debug.ShouldStop(524288);
__ref.getField(false,"_retryfallbackstateref" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackretryfallbackstate.class, "_setmediapathdegraded" /*RemoteObject*/ ,(Object)(_value));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOfflineData (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("setofflinedata")) { return __ref.runUserSub(false, "playerstatestore","setofflinedata", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 188;BA.debugLine="Public Sub SetOfflineData(data As Map)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="If data.IsInitialized Then";
Debug.ShouldStop(268435456);
if (_data.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="offlineDataRef = data";
Debug.ShouldStop(536870912);
__ref.setField ("_offlinedataref" /*RemoteObject*/ ,_data);
 }else {
 BA.debugLineNum = 192;BA.debugLine="offlineDataRef.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_offlinedataref" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("SetPlaybackFlowState (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("setplaybackflowstate")) { return __ref.runUserSub(false, "playerstatestore","setplaybackflowstate", __ref, _statevalue, _reason);}
Debug.locals.put("stateValue", _statevalue);
Debug.locals.put("reason", _reason);
 BA.debugLineNum = 334;BA.debugLine="Public Sub SetPlaybackFlowState(stateValue As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 335;BA.debugLine="owner.Data_SetPlaybackFlowState(stateValue, reaso";
Debug.ShouldStop(16384);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setplaybackflowstate" /*RemoteObject*/ ,(Object)(_statevalue),(Object)(_reason));
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
public static RemoteObject  _setplayicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPlayIcon (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("setplayicon")) { return __ref.runUserSub(false, "playerstatestore","setplayicon", __ref);}
 BA.debugLineNum = 346;BA.debugLine="Public Sub SetPlayIcon";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="owner.Data_SetPlayIcon";
Debug.ShouldStop(67108864);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setplayicon" /*RemoteObject*/ );
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("SetRemoteDataReady (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("setremotedataready")) { return __ref.runUserSub(false, "playerstatestore","setremotedataready", __ref);}
 BA.debugLineNum = 163;BA.debugLine="Public Sub SetRemoteDataReady";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="policyState.SetRemoteDataReady";
Debug.ShouldStop(8);
__ref.getField(false,"_policystate" /*RemoteObject*/ ).runClassMethod (b4j.example.playbackdatapolicystate.class, "_setremotedataready" /*RemoteObject*/ );
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("SetRetryInterval (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("setretryinterval")) { return __ref.runUserSub(false, "playerstatestore","setretryinterval", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 561;BA.debugLine="Public Sub SetRetryInterval(value As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 562;BA.debugLine="retryTimerRef.Interval = value";
Debug.ShouldStop(131072);
__ref.getField(false,"_retrytimerref" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, _value));
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("SetStartupSequenceInProgress (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("setstartupsequenceinprogress")) { return __ref.runUserSub(false, "playerstatestore","setstartupsequenceinprogress", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 233;BA.debugLine="Public Sub SetStartupSequenceInProgress(value As B";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="startupSequenceInProgress = value";
Debug.ShouldStop(512);
__ref.setField ("_startupsequenceinprogress" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 235;BA.debugLine="If value = False Then adWarmupDeferredAfterStartu";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_value,playerstatestore.__c.getField(true,"False"))) { 
__ref.setField ("_adwarmupdeferredafterstartup" /*RemoteObject*/ ,playerstatestore.__c.getField(true,"False"));};
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
public static RemoteObject  _setstopicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStopIcon (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,285);
if (RapidSub.canDelegate("setstopicon")) { return __ref.runUserSub(false, "playerstatestore","setstopicon", __ref);}
 BA.debugLineNum = 285;BA.debugLine="Public Sub SetStopIcon";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 286;BA.debugLine="owner.Data_SetStopIcon";
Debug.ShouldStop(536870912);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_setstopicon" /*RemoteObject*/ );
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("ShouldResumeWithNewStart (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("shouldresumewithnewstart")) { return __ref.runUserSub(false, "playerstatestore","shouldresumewithnewstart", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Public Sub ShouldResumeWithNewStart As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Return orchestrationStateRef.IsStarted And IsUser";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstarted" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_isuserstoppedstate" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_ispolicypausestate" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_orchestrationstateref" /*RemoteObject*/ ).getField(true,"_isstopping" /*RemoteObject*/ ),playerstatestore.__c.getField(true,"False")));
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ShowMessage (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("showmessage")) { return __ref.runUserSub(false, "playerstatestore","showmessage", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 322;BA.debugLine="Public Sub ShowMessage(text As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="owner.Data_ShowMessage(text)";
Debug.ShouldStop(4);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_showmessage" /*RemoteObject*/ ,(Object)(_text));
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
public static RemoteObject  _storage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Storage (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("storage")) { return __ref.runUserSub(false, "playerstatestore","storage", __ref);}
 BA.debugLineNum = 175;BA.debugLine="Public Sub Storage As KeyValueStore";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Return storageRef";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_storageref" /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("SyncOfflinePlaylistMetadata (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,305);
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
		Debug.PushSubsStack("SyncOfflinePlaylistMetadata (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,305);
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
 BA.debugLineNum = 306;BA.debugLine="Wait For (owner.Data_SyncOfflinePlaylistMetadata)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playerstatestore", "syncofflineplaylistmetadata"), __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_syncofflineplaylistmetadata" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("synced", _synced);
;
 BA.debugLineNum = 307;BA.debugLine="Return synced";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_synced));return;};
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _timezoneoffsetminutesvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimezoneOffsetMinutesValue (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("timezoneoffsetminutesvalue")) { return __ref.runUserSub(false, "playerstatestore","timezoneoffsetminutesvalue", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Return owner.TimezoneOffsetMinutesValue";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_timezoneoffsetminutesvalue" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("TraceInfo (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("traceinfo")) { return __ref.runUserSub(false, "playerstatestore","traceinfo", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 123;BA.debugLine="Public Sub TraceInfo(category As String, message A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="owner.Data_TraceInfo(category, message, details)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_traceinfo" /*RemoteObject*/ ,(Object)(_category),(Object)(_message),(Object)(_details));
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
public static RemoteObject  _tracelog(RemoteObject __ref,RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("TraceLog (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("tracelog")) { return __ref.runUserSub(false, "playerstatestore","tracelog", __ref, _message);}
Debug.locals.put("message", _message);
 BA.debugLineNum = 119;BA.debugLine="Public Sub TraceLog(message As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="owner.Data_TraceLog(message)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_tracelog" /*RemoteObject*/ ,(Object)(_message));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("TraceWarn (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("tracewarn")) { return __ref.runUserSub(false, "playerstatestore","tracewarn", __ref, _category, _message, _details);}
Debug.locals.put("category", _category);
Debug.locals.put("message", _message);
Debug.locals.put("details", _details);
 BA.debugLineNum = 127;BA.debugLine="Public Sub TraceWarn(category As String, message A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="owner.Data_TraceWarn(category, message, details)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_tracewarn" /*RemoteObject*/ ,(Object)(_category),(Object)(_message),(Object)(_details));
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
public static RemoteObject  _trustedsynctimekey(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TrustedSyncTimeKey (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("trustedsynctimekey")) { return __ref.runUserSub(false, "playerstatestore","trustedsynctimekey", __ref);}
 BA.debugLineNum = 179;BA.debugLine="Public Sub TrustedSyncTimeKey As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Return trustedSyncTimeKeyValue";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_trustedsynctimekeyvalue" /*RemoteObject*/ );
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trypopulatequeuefromlocalplan(RemoteObject __ref,RemoteObject _playqueue,RemoteObject _minitems) throws Exception{
try {
		Debug.PushSubsStack("TryPopulateQueueFromLocalPlan (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,397);
if (RapidSub.canDelegate("trypopulatequeuefromlocalplan")) { return __ref.runUserSub(false, "playerstatestore","trypopulatequeuefromlocalplan", __ref, _playqueue, _minitems);}
ResumableSub_TryPopulateQueueFromLocalPlan rsub = new ResumableSub_TryPopulateQueueFromLocalPlan(null,__ref,_playqueue,_minitems);
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
public static class ResumableSub_TryPopulateQueueFromLocalPlan extends BA.ResumableSub {
public ResumableSub_TryPopulateQueueFromLocalPlan(b4j.example.playerstatestore parent,RemoteObject __ref,RemoteObject _playqueue,RemoteObject _minitems) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
this._minitems = _minitems;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playerstatestore parent;
RemoteObject _playqueue;
RemoteObject _minitems;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resolverready = RemoteObject.createImmutable(false);
RemoteObject _queueprepared = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TryPopulateQueueFromLocalPlan (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,397);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("playQueue", _playqueue);
Debug.locals.put("minItems", _minitems);
 BA.debugLineNum = 398;BA.debugLine="Dim result As Map";
Debug.ShouldStop(8192);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("result", _result);
 BA.debugLineNum = 399;BA.debugLine="result.Initialize";
Debug.ShouldStop(16384);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 400;BA.debugLine="result.Put(\"success\", False)";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("success"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 401;BA.debugLine="result.Put(\"status\", \"\")";
Debug.ShouldStop(65536);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 402;BA.debugLine="result.Put(\"idle_text\", \"\")";
Debug.ShouldStop(131072);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idle_text"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 403;BA.debugLine="ClearDispatchRetryAfter";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_cleardispatchretryafter" /*RemoteObject*/ );
 BA.debugLineNum = 404;BA.debugLine="If CanUseDataPlaybackResolver = False Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_canusedataplaybackresolver" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 405;BA.debugLine="Wait For (EnsureDataPlaybackReady) Complete (res";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playerstatestore", "trypopulatequeuefromlocalplan"), __ref.runClassMethod (b4j.example.playerstatestore.class, "_ensuredataplaybackready" /*RemoteObject*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_resolverready = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("resolverReady", _resolverready);
;
 BA.debugLineNum = 406;BA.debugLine="If resolverReady = False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_resolverready,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 407;BA.debugLine="result.Put(\"status\", \"resolver_unavailable\")";
Debug.ShouldStop(4194304);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("resolver_unavailable"))));
 BA.debugLineNum = 408;BA.debugLine="Return result";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 411;BA.debugLine="Wait For (EnsureDataPlaybackQueue(playQueue, minI";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "playerstatestore", "trypopulatequeuefromlocalplan"), __ref.runClassMethod (b4j.example.playerstatestore.class, "_ensuredataplaybackqueue" /*RemoteObject*/ ,(Object)(_playqueue),(Object)(_minitems)));
this.state = 14;
return;
case 14:
//C
this.state = 9;
_queueprepared = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("queuePrepared", _queueprepared);
;
 BA.debugLineNum = 412;BA.debugLine="If queuePrepared = False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_queueprepared,parent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 413;BA.debugLine="result.Put(\"status\", \"queue_empty\")";
Debug.ShouldStop(268435456);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("queue_empty"))));
 BA.debugLineNum = 414;BA.debugLine="result.Put(\"idle_text\", ResolveIdleUntilMessage(";
Debug.ShouldStop(536870912);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idle_text"))),(Object)((__ref.runClassMethod (b4j.example.playerstatestore.class, "_resolveidleuntilmessage" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ ))))));
 BA.debugLineNum = 415;BA.debugLine="Return result";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 417;BA.debugLine="result.Put(\"success\", True)";
Debug.ShouldStop(1);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 418;BA.debugLine="result.Put(\"status\", \"success\")";
Debug.ShouldStop(2);
_result.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status"))),(Object)((RemoteObject.createImmutable("success"))));
 BA.debugLineNum = 419;BA.debugLine="Return result";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _tryseedfirsttrackfromcache(RemoteObject __ref,RemoteObject _playqueue) throws Exception{
try {
		Debug.PushSubsStack("TrySeedFirstTrackFromCache (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,424);
if (RapidSub.canDelegate("tryseedfirsttrackfromcache")) { return __ref.runUserSub(false, "playerstatestore","tryseedfirsttrackfromcache", __ref, _playqueue);}
ResumableSub_TrySeedFirstTrackFromCache rsub = new ResumableSub_TrySeedFirstTrackFromCache(null,__ref,_playqueue);
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
public static class ResumableSub_TrySeedFirstTrackFromCache extends BA.ResumableSub {
public ResumableSub_TrySeedFirstTrackFromCache(b4j.example.playerstatestore parent,RemoteObject __ref,RemoteObject _playqueue) {
this.parent = parent;
this.__ref = __ref;
this._playqueue = _playqueue;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.playerstatestore parent;
RemoteObject _playqueue;
RemoteObject _emptyresult = RemoteObject.createImmutable(false);
RemoteObject _currentslot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _workingcursors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _seeded = RemoteObject.createImmutable(false);
int _attempt = 0;
RemoteObject _playlistdescriptor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _playlistid = RemoteObject.createImmutable("");
RemoteObject _playlistdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cachedtrack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _queueitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TrySeedFirstTrackFromCache (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,424);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("playQueue", _playqueue);
 BA.debugLineNum = 425;BA.debugLine="Dim emptyResult As Boolean = False";
Debug.ShouldStop(256);
_emptyresult = parent.__c.getField(true,"False");Debug.locals.put("emptyResult", _emptyresult);Debug.locals.put("emptyResult", _emptyresult);
 BA.debugLineNum = 426;BA.debugLine="If CanUseDataPlaybackResolver = False Then Return";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.playerstatestore.class, "_canusedataplaybackresolver" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_emptyresult));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 427;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
Debug.ShouldStop(1024);
_currentslot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_currentslot = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_resolvedataslotatticks" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_effectivenowticks" /*RemoteObject*/ )));Debug.locals.put("currentSlot", _currentslot);Debug.locals.put("currentSlot", _currentslot);
 BA.debugLineNum = 428;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_currentslot.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_emptyresult));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 429;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
Debug.ShouldStop(4096);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _currentslot.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlists"))),(Object)(parent.__c.getField(false,"Null"))));Debug.locals.put("playlists", _playlists);Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 430;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
Debug.ShouldStop(8192);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_playlists.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlists.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_emptyresult));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 431;BA.debugLine="Dim workingCursors As Map = dataResolverRef.Clone";
Debug.ShouldStop(16384);
_workingcursors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_workingcursors = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_cloneplaylistcursors" /*RemoteObject*/ );Debug.locals.put("workingCursors", _workingcursors);Debug.locals.put("workingCursors", _workingcursors);
 BA.debugLineNum = 432;BA.debugLine="Dim seeded As Boolean = False";
Debug.ShouldStop(32768);
_seeded = parent.__c.getField(true,"False");Debug.locals.put("seeded", _seeded);Debug.locals.put("seeded", _seeded);
 BA.debugLineNum = 433;BA.debugLine="For attempt = 0 To playlists.Size - 1";
Debug.ShouldStop(65536);
if (true) break;

case 19:
//for
this.state = 46;
step9 = 1;
limit9 = RemoteObject.solve(new RemoteObject[] {_playlists.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_attempt = 0 ;
Debug.locals.put("attempt", _attempt);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 46;
if ((step9 > 0 && _attempt <= limit9) || (step9 < 0 && _attempt >= limit9)) this.state = 21;
if (true) break;

case 48:
//C
this.state = 47;
_attempt = ((int)(0 + _attempt + step9)) ;
Debug.locals.put("attempt", _attempt);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 434;BA.debugLine="Dim playlistDescriptor As Map = dataResolverRef.";
Debug.ShouldStop(131072);
_playlistdescriptor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdescriptor = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_choosenextplaylistdescriptor" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_workingcursors));Debug.locals.put("playlistDescriptor", _playlistdescriptor);Debug.locals.put("playlistDescriptor", _playlistdescriptor);
 BA.debugLineNum = 435;BA.debugLine="If playlistDescriptor.IsInitialized = False Or p";
Debug.ShouldStop(262144);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_playlistdescriptor.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlistdescriptor.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
this.state = 46;
if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 436;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
Debug.ShouldStop(524288);
_playlistid = BA.ObjectToString(_playlistdescriptor.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("playlistId", _playlistid);Debug.locals.put("playlistId", _playlistid);
 BA.debugLineNum = 437;BA.debugLine="If playlistId = \"\" Then Continue";
Debug.ShouldStop(1048576);
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_playlistid,BA.ObjectToString(""))) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 48;
if (true) break;;
if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 438;BA.debugLine="Dim playlistData As Map = dataResolverRef.LoadCa";
Debug.ShouldStop(2097152);
_playlistdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_playlistdata = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_loadcachedplaylistmetadata" /*RemoteObject*/ ,(Object)(_playlistid));Debug.locals.put("playlistData", _playlistdata);Debug.locals.put("playlistData", _playlistdata);
 BA.debugLineNum = 439;BA.debugLine="If playlistData.IsInitialized = False Or playlis";
Debug.ShouldStop(4194304);
if (true) break;

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_playlistdata.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
this.state = 48;
if (true) break;;
if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 440;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.ChooseR";
Debug.ShouldStop(8388608);
_cachedtrack = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cachedtrack = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_chooserandomtrackfromplaylist" /*RemoteObject*/ ,(Object)(_playlistdata),(Object)(__ref.getField(false,"_mediacacheref" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("cachedTrack", _cachedtrack);Debug.locals.put("cachedTrack", _cachedtrack);
 BA.debugLineNum = 441;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
Debug.ShouldStop(16777216);
if (true) break;

case 40:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_cachedtrack.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
this.state = 48;
if (true) break;;
if (true) break;

case 45:
//C
this.state = 48;
;
 BA.debugLineNum = 442;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQue";
Debug.ShouldStop(33554432);
_queueitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_queueitem = __ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_createqueuetrackfromplaylist" /*RemoteObject*/ ,(Object)(_currentslot),(Object)(_playlistdescriptor),(Object)(_cachedtrack),(Object)(__ref.runClassMethod (b4j.example.playerstatestore.class, "_offlinedata" /*RemoteObject*/ )));Debug.locals.put("queueItem", _queueitem);Debug.locals.put("queueItem", _queueitem);
 BA.debugLineNum = 443;BA.debugLine="playQueue.Add(queueItem)";
Debug.ShouldStop(67108864);
_playqueue.runVoidMethod ("Add",(Object)((_queueitem.getObject())));
 BA.debugLineNum = 444;BA.debugLine="dataResolverRef.SavePreviewPlaylistCursors(stora";
Debug.ShouldStop(134217728);
__ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_savepreviewplaylistcursors" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_storageref" /*RemoteObject*/ )),(Object)(_workingcursors));
 BA.debugLineNum = 445;BA.debugLine="dataResolverRef.RememberResolvedTrack(queueItem.";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrack" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_queueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 446;BA.debugLine="dataResolverRef.RememberResolvedTrackForPlaylist";
Debug.ShouldStop(536870912);
__ref.getField(false,"_dataresolverref" /*RemoteObject*/ ).runClassMethod (b4j.example.dataplaybackresolver.class, "_rememberresolvedtrackforplaylist" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_queueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("playlist_id"))),(Object)((RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToString(_queueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 447;BA.debugLine="SaveQueueSnapshotState(playQueue)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_savequeuesnapshotstate" /*RemoteObject*/ ,(Object)(_playqueue));
 BA.debugLineNum = 448;BA.debugLine="TraceLog(\"первый старт cache hit playlistId=\" &";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.playerstatestore.class, "_tracelog" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("первый старт cache hit playlistId="),_playlistid,RemoteObject.createImmutable(" trackId="),_queueitem.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("id"))),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 449;BA.debugLine="seeded = True";
Debug.ShouldStop(1);
_seeded = parent.__c.getField(true,"True");Debug.locals.put("seeded", _seeded);
 BA.debugLineNum = 450;BA.debugLine="Exit";
Debug.ShouldStop(2);
this.state = 46;
if (true) break;
 if (true) break;
if (true) break;

case 46:
//C
this.state = -1;
Debug.locals.put("attempt", _attempt);
;
 BA.debugLineNum = 452;BA.debugLine="Return seeded";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_seeded));return;};
 BA.debugLineNum = 453;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _writehealthsnapshot(RemoteObject __ref,RemoteObject _trigger) throws Exception{
try {
		Debug.PushSubsStack("WriteHealthSnapshot (playerstatestore) ","playerstatestore",2,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("writehealthsnapshot")) { return __ref.runUserSub(false, "playerstatestore","writehealthsnapshot", __ref, _trigger);}
Debug.locals.put("trigger", _trigger);
 BA.debugLineNum = 225;BA.debugLine="Public Sub WriteHealthSnapshot(trigger As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="owner.Data_WriteHealthSnapshot(trigger)";
Debug.ShouldStop(2);
__ref.getField(false,"_owner" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmainpage.class, "_data_writehealthsnapshot" /*RemoteObject*/ ,(Object)(_trigger));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}