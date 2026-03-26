package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class playerstatestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.playerstatestore");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.playerstatestore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.b4xmainpage _owner = null;
public b4a.example.playbackdatapolicystate _policystate = null;
public b4a.example.playbackorchestrationstate _orchestrationstateref = null;
public b4a.example.offlinestore _offlinestoreref = null;
public b4a.example.dataplaybackresolver _dataresolverref = null;
public b4a.example.mediacache _mediacacheref = null;
public b4a.example.keyvaluestore _storageref = null;
public String _trustedsynctimekeyvalue = "";
public anywheresoftware.b4a.objects.Timer _retrytimerref = null;
public anywheresoftware.b4a.objects.collections.Map _offlinedataref = null;
public int _consecutivenetworkerrors = 0;
public String _lastretrymode = "";
public long _datasuccessatticks = 0L;
public long _historysuccessatticks = 0L;
public boolean _startupsequenceinprogress = false;
public boolean _adwarmupdeferredafterstartup = false;
public int _localretrydelay = 0;
public int _serverretrydelay = 0;
public int _dispatchretryafter = 0;
public boolean _mediapathdegradedflag = false;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _applyclientrequestheaders(b4a.example.httpjob _j) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Public Sub ApplyClientRequestHeaders(j As HttpJob)";
 //BA.debugLineNum = 139;BA.debugLine="owner.Data_ApplyClientRequestHeaders(j)";
_owner._data_applyclientrequestheaders /*String*/ (_j);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _applytemporarymode(String _mode) throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Public Sub ApplyTemporaryMode(mode As String)";
 //BA.debugLineNum = 314;BA.debugLine="owner.Data_ApplyTemporaryMode(mode)";
_owner._data_applytemporarymode /*String*/ (_mode);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public boolean  _beginofflinedatarefresh() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub BeginOfflineDataRefresh As Boolean";
 //BA.debugLineNum = 151;BA.debugLine="Return policyState.BeginOfflineDataRefresh";
if (true) return _policystate._beginofflinedatarefresh /*boolean*/ ();
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return false;
}
public String  _builddataslotkey(anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
 //BA.debugLineNum = 647;BA.debugLine="Private Sub BuildDataSlotKey(currentSlot As Map) A";
 //BA.debugLineNum = 648;BA.debugLine="Return currentSlot.GetDefault(\"schedule_title\", \"";
if (true) return BA.ObjectToString(_currentslot.GetDefault((Object)("schedule_title"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("stream_id"),(Object)("")))+"|"+BA.ObjectToString(_currentslot.GetDefault((Object)("slot_time"),(Object)("")));
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return "";
}
public String  _checkforappupdate(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub CheckForAppUpdate(data As Map)";
 //BA.debugLineNum = 107;BA.debugLine="owner.Data_CheckForAppUpdate(data)";
_owner._data_checkforappupdate /*String*/ (_data);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _claimurlvalue() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub ClaimUrlValue As String";
 //BA.debugLineNum = 115;BA.debugLine="Return owner.ClaimUrlValue";
if (true) return _owner._claimurlvalue /*String*/ ();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private owner As B4XMainPage";
_owner = new b4a.example.b4xmainpage();
 //BA.debugLineNum = 7;BA.debugLine="Private policyState As PlaybackDataPolicyState";
_policystate = new b4a.example.playbackdatapolicystate();
 //BA.debugLineNum = 8;BA.debugLine="Private orchestrationStateRef As PlaybackOrchestr";
_orchestrationstateref = new b4a.example.playbackorchestrationstate();
 //BA.debugLineNum = 9;BA.debugLine="Private offlineStoreRef As OfflineStore";
_offlinestoreref = new b4a.example.offlinestore();
 //BA.debugLineNum = 10;BA.debugLine="Private dataResolverRef As DataPlaybackResolver";
_dataresolverref = new b4a.example.dataplaybackresolver();
 //BA.debugLineNum = 11;BA.debugLine="Private mediaCacheRef As MediaCache";
_mediacacheref = new b4a.example.mediacache();
 //BA.debugLineNum = 12;BA.debugLine="Private storageRef As KeyValueStore";
_storageref = new b4a.example.keyvaluestore();
 //BA.debugLineNum = 13;BA.debugLine="Private trustedSyncTimeKeyValue As String";
_trustedsynctimekeyvalue = "";
 //BA.debugLineNum = 14;BA.debugLine="Private retryTimerRef As Timer";
_retrytimerref = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 15;BA.debugLine="Private offlineDataRef As Map";
_offlinedataref = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private consecutiveNetworkErrors As Int";
_consecutivenetworkerrors = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private lastRetryMode As String";
_lastretrymode = "";
 //BA.debugLineNum = 18;BA.debugLine="Private dataSuccessAtTicks As Long";
_datasuccessatticks = 0L;
 //BA.debugLineNum = 19;BA.debugLine="Private historySuccessAtTicks As Long";
_historysuccessatticks = 0L;
 //BA.debugLineNum = 20;BA.debugLine="Private startupSequenceInProgress As Boolean";
_startupsequenceinprogress = false;
 //BA.debugLineNum = 21;BA.debugLine="Private adWarmupDeferredAfterStartup As Boolean";
_adwarmupdeferredafterstartup = false;
 //BA.debugLineNum = 22;BA.debugLine="Private localRetryDelay As Int";
_localretrydelay = 0;
 //BA.debugLineNum = 23;BA.debugLine="Private serverRetryDelay As Int";
_serverretrydelay = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private dispatchRetryAfter As Int";
_dispatchretryafter = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private mediaPathDegradedFlag As Boolean";
_mediapathdegradedflag = false;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _cleardispatchretryafter() throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Public Sub ClearDispatchRetryAfter";
 //BA.debugLineNum = 586;BA.debugLine="dispatchRetryAfter = 0";
_dispatchretryafter = (int) (0);
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
public String  _clearlastretrymode() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub ClearLastRetryMode";
 //BA.debugLineNum = 63;BA.debugLine="lastRetryMode = \"\"";
_lastretrymode = "";
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate() throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Public Sub ClearPlaybackState";
 //BA.debugLineNum = 318;BA.debugLine="owner.Data_ClearPlaybackState";
_owner._data_clearplaybackstate /*String*/ ();
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypause() throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Public Sub ClearPolicyPause";
 //BA.debugLineNum = 301;BA.debugLine="owner.Data_ClearPolicyPause";
_owner._data_clearpolicypause /*String*/ ();
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public String  _clearpolicypauseandresumerequest() throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Public Sub ClearPolicyPauseAndResumeRequest";
 //BA.debugLineNum = 342;BA.debugLine="owner.Data_ClearPolicyPauseAndResumeRequest";
_owner._data_clearpolicypauseandresumerequest /*String*/ ();
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public String  _clearresumeplaybackwhenserverallows() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Public Sub ClearResumePlaybackWhenServerAllows";
 //BA.debugLineNum = 175;BA.debugLine="policyState.ResumePlaybackWhenServerAllows = Fals";
_policystate._resumeplaybackwhenserverallows /*boolean*/  = __c.False;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer() throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Public Sub ClearRetryTimer";
 //BA.debugLineNum = 556;BA.debugLine="retryTimerRef.Enabled = False";
_retrytimerref.setEnabled(__c.False);
 //BA.debugLineNum = 557;BA.debugLine="ClearLastRetryMode";
_clearlastretrymode();
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return "";
}
public String  _clientosnamevalue() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub ClientOsNameValue As String";
 //BA.debugLineNum = 95;BA.debugLine="Return owner.ClientOsNameValue";
if (true) return _owner._clientosnamevalue /*String*/ ();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
 //BA.debugLineNum = 651;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
 //BA.debugLineNum = 652;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 653;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
 //BA.debugLineNum = 654;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
 //BA.debugLineNum = 655;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 656;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
 //BA.debugLineNum = 658;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public int  _consumedispatchretryafter() throws Exception{
int _value = 0;
 //BA.debugLineNum = 593;BA.debugLine="Public Sub ConsumeDispatchRetryAfter As Int";
 //BA.debugLineNum = 594;BA.debugLine="Dim value As Int = dispatchRetryAfter";
_value = _dispatchretryafter;
 //BA.debugLineNum = 595;BA.debugLine="dispatchRetryAfter = 0";
_dispatchretryafter = (int) (0);
 //BA.debugLineNum = 596;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 597;BA.debugLine="End Sub";
return 0;
}
public String  _consumelastexception() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Public Sub ConsumeLastException";
 //BA.debugLineNum = 135;BA.debugLine="owner.Data_ConsumeLastException";
_owner._data_consumelastexception /*String*/ ();
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _dataurlvalue() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub DataUrlValue As String";
 //BA.debugLineNum = 103;BA.debugLine="Return owner.DataUrlValue";
if (true) return _owner._dataurlvalue /*String*/ ();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _deferadwarmupafterstartup() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Public Sub DeferAdWarmupAfterStartup";
 //BA.debugLineNum = 242;BA.debugLine="adWarmupDeferredAfterStartup = True";
_adwarmupdeferredafterstartup = __c.True;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return "";
}
public String  _deviceidvalue() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub DeviceIdValue As String";
 //BA.debugLineNum = 87;BA.debugLine="Return owner.DeviceIdValue";
if (true) return _owner._deviceidvalue /*String*/ ();
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _disablebackgroundrefreshtimers() throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Public Sub DisableBackgroundRefreshTimers";
 //BA.debugLineNum = 383;BA.debugLine="owner.Data_DisableBackgroundRefreshTimers";
_owner._data_disablebackgroundrefreshtimers /*String*/ ();
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public long  _effectivenowticks() throws Exception{
long _devicenow = 0L;
long _trustednow = 0L;
 //BA.debugLineNum = 253;BA.debugLine="Public Sub EffectiveNowTicks As Long";
 //BA.debugLineNum = 254;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
_devicenow = __c.DateTime.getNow();
 //BA.debugLineNum = 255;BA.debugLine="Dim trustedNow As Long = storageRef.GetDefault(tr";
_trustednow = BA.ObjectToLongNumber(_storageref._getdefault /*Object*/ (_trustedsynctimekeyvalue,(Object)(0)));
 //BA.debugLineNum = 256;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
 //BA.debugLineNum = 257;BA.debugLine="Return deviceNow";
if (true) return _devicenow;
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return 0L;
}
public String  _enableretrytimer() throws Exception{
 //BA.debugLineNum = 572;BA.debugLine="Public Sub EnableRetryTimer";
 //BA.debugLineNum = 573;BA.debugLine="retryTimerRef.Enabled = True";
_retrytimerref.setEnabled(__c.True);
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return "";
}
public String  _endofflinedatarefresh(String _statevalue) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Public Sub EndOfflineDataRefresh(stateValue As Str";
 //BA.debugLineNum = 155;BA.debugLine="policyState.EndOfflineDataRefresh(stateValue)";
_policystate._endofflinedatarefresh /*String*/ (_statevalue);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _ensureadcachesyncasync() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Public Sub EnsureAdCacheSyncAsync";
 //BA.debugLineNum = 250;BA.debugLine="owner.Data_EnsureAdCacheSyncAsync";
_owner._data_ensureadcachesyncasync /*String*/ ();
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _enterlocalplayback() throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Public Sub EnterLocalPlayback";
 //BA.debugLineNum = 354;BA.debugLine="owner.Data_EnterLocalPlayback";
_owner._data_enterlocalplayback /*String*/ ();
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypause(String _reason,String _connectionmode) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Public Sub EnterPolicyPause(reason As String, conn";
 //BA.debugLineNum = 334;BA.debugLine="owner.Data_EnterPolicyPause(reason, connectionMod";
_owner._data_enterpolicypause /*String*/ (_reason,_connectionmode);
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public String  _enterstartedstate() throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Public Sub EnterStartedState";
 //BA.debugLineNum = 285;BA.debugLine="orchestrationStateRef.EnterStartedState";
_orchestrationstateref._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public String  _enteruserstoppedstate() throws Exception{
 //BA.debugLineNum = 345;BA.debugLine="Public Sub EnterUserStoppedState";
 //BA.debugLineNum = 346;BA.debugLine="owner.Data_EnterUserStoppedState";
_owner._data_enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return "";
}
public String  _flushtracebufferasync() throws Exception{
 //BA.debugLineNum = 216;BA.debugLine="Public Sub FlushTraceBufferAsync";
 //BA.debugLineNum = 217;BA.debugLine="owner.Data_FlushTraceBufferAsync";
_owner._data_flushtracebufferasync /*String*/ ();
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public int  _getconsecutivenetworkerrors() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GetConsecutiveNetworkErrors As Int";
 //BA.debugLineNum = 51;BA.debugLine="Return consecutiveNetworkErrors";
if (true) return _consecutivenetworkerrors;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0;
}
public int  _getcurrentslotlocalreservecount() throws Exception{
 //BA.debugLineNum = 361;BA.debugLine="Public Sub GetCurrentSlotLocalReserveCount As Int";
 //BA.debugLineNum = 362;BA.debugLine="Return owner.Data_GetCurrentSlotLocalReserveCount";
if (true) return _owner._data_getcurrentslotlocalreservecount /*int*/ ();
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return 0;
}
public long  _getlastdataokat() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub GetLastDataOkAt As Long";
 //BA.debugLineNum = 71;BA.debugLine="Return dataSuccessAtTicks";
if (true) return _datasuccessatticks;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return 0L;
}
public long  _getlasthistoryokat() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub GetLastHistoryOkAt As Long";
 //BA.debugLineNum = 79;BA.debugLine="Return historySuccessAtTicks";
if (true) return _historysuccessatticks;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return 0L;
}
public String  _getlastretrymode() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub GetLastRetryMode As String";
 //BA.debugLineNum = 59;BA.debugLine="Return lastRetryMode";
if (true) return _lastretrymode;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public int  _getlocalplayablequeuecount(anywheresoftware.b4a.objects.collections.List _playqueue) throws Exception{
int _totalcount = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 365;BA.debugLine="Public Sub GetLocalPlayableQueueCount(playQueue As";
 //BA.debugLineNum = 366;BA.debugLine="If playQueue.IsInitialized = False Then Return 0";
if (_playqueue.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 367;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
 //BA.debugLineNum = 368;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group3 = _playqueue;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_itemobject = group3.Get(index3);
 //BA.debugLineNum = 369;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 370;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 371;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then C";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) continue;};
 //BA.debugLineNum = 372;BA.debugLine="If mediaCacheRef.HasValidatedLocalMedia(item) =";
if (_mediacacheref._hasvalidatedlocalmedia /*boolean*/ (_item)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 373;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
 //BA.debugLineNum = 375;BA.debugLine="Return totalCount";
if (true) return _totalcount;
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return 0;
}
public int  _getretryinterval() throws Exception{
 //BA.debugLineNum = 564;BA.debugLine="Public Sub GetRetryInterval As Int";
 //BA.debugLineNum = 565;BA.debugLine="Return retryTimerRef.Interval";
if (true) return (int) (_retrytimerref.getInterval());
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return 0;
}
public String  _handlemessageitem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Public Sub HandleMessageItem(item As Map)";
 //BA.debugLineNum = 305;BA.debugLine="owner.Data_HandleMessageItem(item)";
_owner._data_handlemessageitem /*String*/ (_item);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public boolean  _hasanycachedtrack() throws Exception{
anywheresoftware.b4a.objects.collections.Map _playliststats = null;
 //BA.debugLineNum = 639;BA.debugLine="Public Sub HasAnyCachedTrack As Boolean";
 //BA.debugLineNum = 640;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
_mediacacheref._ensuretrackcacheready /*String*/ ();
 //BA.debugLineNum = 641;BA.debugLine="If mediaCacheRef.GetCachedTrackCount > 0 Then Ret";
if (_mediacacheref._getcachedtrackcount /*int*/ ()>0) { 
if (true) return __c.True;};
 //BA.debugLineNum = 642;BA.debugLine="Dim playlistStats As Map = mediaCacheRef.GetCache";
_playliststats = new anywheresoftware.b4a.objects.collections.Map();
_playliststats = _mediacacheref._getcachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 643;BA.debugLine="If playlistStats.IsInitialized And playlistStats.";
if (_playliststats.IsInitialized() && _playliststats.getSize()>0) { 
if (true) return __c.True;};
 //BA.debugLineNum = 644;BA.debugLine="Return mediaCacheRef.HasAnyTrackFilesOnDisk";
if (true) return _mediacacheref._hasanytrackfilesondisk /*boolean*/ ();
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return false;
}
public boolean  _haslocalplaybackfallback() throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Public Sub HasLocalPlaybackFallback As Boolean";
 //BA.debugLineNum = 358;BA.debugLine="Return owner.Data_HasLocalPlaybackFallback";
if (true) return _owner._data_haslocalplaybackfallback /*boolean*/ ();
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return false;
}
public boolean  _hasusabledataplaybackinstructions() throws Exception{
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.List _schedules = null;
 //BA.debugLineNum = 440;BA.debugLine="Private Sub HasUsableDataPlaybackInstructions As B";
 //BA.debugLineNum = 441;BA.debugLine="Dim data As Map = OfflineData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = _offlinedata();
 //BA.debugLineNum = 442;BA.debugLine="If data.IsInitialized = False Then Return False";
if (_data.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 443;BA.debugLine="If data.GetDefault(\"ok\", False) <> True Then Retu";
if ((_data.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 444;BA.debugLine="Dim schedules As List = data.GetDefault(\"schedule";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data.GetDefault((Object)("schedules"),__c.Null)));
 //BA.debugLineNum = 445;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 446;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return false;
}
public String  _hidecontentblocks() throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Public Sub HideContentBlocks";
 //BA.debugLineNum = 293;BA.debugLine="owner.Data_HideContentBlocks";
_owner._data_hidecontentblocks /*String*/ ();
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _hidepin() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Public Sub HidePin";
 //BA.debugLineNum = 322;BA.debugLine="owner.Data_HidePin";
_owner._data_hidepin /*String*/ ();
 //BA.debugLineNum = 323;BA.debugLine="End Sub";
return "";
}
public String  _incrementnetworkerrorcount() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub IncrementNetworkErrorCount";
 //BA.debugLineNum = 43;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErro";
_consecutivenetworkerrors = (int) (_consecutivenetworkerrors+1);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.example.b4xmainpage _mainpage,anywheresoftware.b4a.objects.Timer _retrytimervalue,b4a.example.playbackdatapolicystate _datapolicyvalue,b4a.example.playbackorchestrationstate _orchestrationstatevalue,b4a.example.keyvaluestore _storagevalue,String _trustedsynckeyvalue,b4a.example.offlinestore _offlinestorevalue,b4a.example.dataplaybackresolver _dataresolvervalue,b4a.example.mediacache _mediacachevalue,int _localretryinitial,int _serverretryinitial) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize(mainPage As B4XMainPage, ret";
 //BA.debugLineNum = 29;BA.debugLine="owner = mainPage";
_owner = _mainpage;
 //BA.debugLineNum = 30;BA.debugLine="policyState = dataPolicyValue";
_policystate = _datapolicyvalue;
 //BA.debugLineNum = 31;BA.debugLine="orchestrationStateRef = orchestrationStateValue";
_orchestrationstateref = _orchestrationstatevalue;
 //BA.debugLineNum = 32;BA.debugLine="offlineStoreRef = offlineStoreValue";
_offlinestoreref = _offlinestorevalue;
 //BA.debugLineNum = 33;BA.debugLine="dataResolverRef = dataResolverValue";
_dataresolverref = _dataresolvervalue;
 //BA.debugLineNum = 34;BA.debugLine="mediaCacheRef = mediaCacheValue";
_mediacacheref = _mediacachevalue;
 //BA.debugLineNum = 35;BA.debugLine="storageRef = storageValue";
_storageref = _storagevalue;
 //BA.debugLineNum = 36;BA.debugLine="trustedSyncTimeKeyValue = trustedSyncKeyValue";
_trustedsynctimekeyvalue = _trustedsynckeyvalue;
 //BA.debugLineNum = 37;BA.debugLine="retryTimerRef = retryTimerValue";
_retrytimerref = _retrytimervalue;
 //BA.debugLineNum = 38;BA.debugLine="offlineDataRef.Initialize";
_offlinedataref.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="ResetRetryDelayState(localRetryInitial, serverRet";
_resetretrydelaystate(_localretryinitial,_serverretryinitial);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _invalidaterelevanttrackidscache() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub InvalidateRelevantTrackIdsCache";
 //BA.debugLineNum = 221;BA.debugLine="owner.Data_InvalidateRelevantTrackIdsCache";
_owner._data_invalidaterelevanttrackidscache /*String*/ ();
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public boolean  _isadwarmupdeferredafterstartup() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Public Sub IsAdWarmupDeferredAfterStartup As Boole";
 //BA.debugLineNum = 246;BA.debugLine="Return adWarmupDeferredAfterStartup";
if (true) return _adwarmupdeferredafterstartup;
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return false;
}
public boolean  _ismediapathdegraded() throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Public Sub IsMediaPathDegraded As Boolean";
 //BA.debugLineNum = 604;BA.debugLine="Return mediaPathDegradedFlag";
if (true) return _mediapathdegradedflag;
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackpausedbypolicy() throws Exception{
 //BA.debugLineNum = 568;BA.debugLine="Public Sub IsPlaybackPausedByPolicy As Boolean";
 //BA.debugLineNum = 569;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
if (true) return _policystate._isplaybackpausedbypolicy /*boolean*/ ;
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackstarted() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Public Sub IsPlaybackStarted As Boolean";
 //BA.debugLineNum = 261;BA.debugLine="Return orchestrationStateRef.IsStarted";
if (true) return _orchestrationstateref._isstarted /*boolean*/ ;
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return false;
}
public boolean  _ispolicypausestate() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Public Sub IsPolicyPauseState As Boolean";
 //BA.debugLineNum = 273;BA.debugLine="Return policyState.IsPlaybackPausedByPolicy";
if (true) return _policystate._isplaybackpausedbypolicy /*boolean*/ ;
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return false;
}
public boolean  _isstartupsequenceinprogress() throws Exception{
 //BA.debugLineNum = 232;BA.debugLine="Public Sub IsStartupSequenceInProgress As Boolean";
 //BA.debugLineNum = 233;BA.debugLine="Return startupSequenceInProgress";
if (true) return _startupsequenceinprogress;
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return false;
}
public boolean  _isstoppedbyuser() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Public Sub IsStoppedByUser As Boolean";
 //BA.debugLineNum = 265;BA.debugLine="Return orchestrationStateRef.IsStoppedByUser";
if (true) return _orchestrationstateref._isstoppedbyuser /*boolean*/ ;
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return false;
}
public boolean  _isstopping() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Public Sub IsStopping As Boolean";
 //BA.debugLineNum = 281;BA.debugLine="Return orchestrationStateRef.IsStopping";
if (true) return _orchestrationstateref._isstopping /*boolean*/ ;
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return false;
}
public boolean  _istraceuploadenabled() throws Exception{
anywheresoftware.b4a.objects.collections.Map _snapshot = null;
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
 //BA.debugLineNum = 204;BA.debugLine="Public Sub IsTraceUploadEnabled As Boolean";
 //BA.debugLineNum = 205;BA.debugLine="Dim snapshot As Map = OfflineData";
_snapshot = new anywheresoftware.b4a.objects.collections.Map();
_snapshot = _offlinedata();
 //BA.debugLineNum = 206;BA.debugLine="If snapshot.IsInitialized = False Then Return Fal";
if (_snapshot.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 207;BA.debugLine="If snapshot.GetDefault(\"ok\", False) <> True Then";
if ((_snapshot.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 208;BA.debugLine="If snapshot.ContainsKey(\"trace\") Then";
if (_snapshot.ContainsKey((Object)("trace"))) { 
 //BA.debugLineNum = 209;BA.debugLine="Return snapshot.GetDefault(\"trace\", False) = Tru";
if (true) return (_snapshot.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
 };
 //BA.debugLineNum = 211;BA.debugLine="Dim playerData As Map = snapshot.GetDefault(\"play";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_snapshot.GetDefault((Object)("player"),__c.Null)));
 //BA.debugLineNum = 212;BA.debugLine="If playerData.IsInitialized = False Then Return F";
if (_playerdata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 213;BA.debugLine="Return playerData.ContainsKey(\"trace\") And player";
if (true) return _playerdata.ContainsKey((Object)("trace")) && (_playerdata.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return false;
}
public boolean  _istrackcached(String _trackid) throws Exception{
 //BA.debugLineNum = 635;BA.debugLine="Public Sub IsTrackCached(trackId As String) As Boo";
 //BA.debugLineNum = 636;BA.debugLine="Return mediaCacheRef.IsTrackCached(trackId)";
if (true) return _mediacacheref._istrackcached /*boolean*/ (_trackid);
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return false;
}
public boolean  _isuserstoppedstate() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Public Sub IsUserStoppedState As Boolean";
 //BA.debugLineNum = 269;BA.debugLine="Return orchestrationStateRef.IsStarted = False An";
if (true) return _orchestrationstateref._isstarted /*boolean*/ ==__c.False && _policystate._isplaybackpausedbypolicy /*boolean*/ ==__c.False && _orchestrationstateref._isstoppedbyuser /*boolean*/ ;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return false;
}
public String  _lastofflinedatarefreshstate() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Public Sub LastOfflineDataRefreshState As String";
 //BA.debugLineNum = 163;BA.debugLine="Return policyState.LastOfflineDataRefreshState";
if (true) return _policystate._lastofflinedatarefreshstate /*String*/ ;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadcachedplaylistmetadata(String _playlistid) throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="Public Sub LoadCachedPlaylistMetadata(playlistId A";
 //BA.debugLineNum = 632;BA.debugLine="Return dataResolverRef.LoadCachedPlaylistMetadata";
if (true) return _dataresolverref._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid);
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return null;
}
public String  _messagevalue(String _key) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub MessageValue(key As String) As String";
 //BA.debugLineNum = 119;BA.debugLine="Return owner.Data_MessageValue(key)";
if (true) return _owner._data_messagevalue /*String*/ (_key);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _nexturlvalue() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub NextUrlValue As String";
 //BA.debugLineNum = 111;BA.debugLine="Return owner.NextUrlValue";
if (true) return _owner._nexturlvalue /*String*/ ();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _offlinedata() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub OfflineData As Map";
 //BA.debugLineNum = 200;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
if (_offlinedataref.IsInitialized()==__c.False) { 
_offlinedataref.Initialize();};
 //BA.debugLineNum = 201;BA.debugLine="Return offlineDataRef";
if (true) return _offlinedataref;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public String  _playercodevalue() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub PlayerCodeValue As String";
 //BA.debugLineNum = 83;BA.debugLine="Return owner.PlayerCodeValue";
if (true) return _owner._playercodevalue /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _refreshconnectionindicatorstate() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Public Sub RefreshConnectionIndicatorState";
 //BA.debugLineNum = 225;BA.debugLine="owner.Data_RefreshConnectionIndicatorState";
_owner._data_refreshconnectionindicatorstate /*String*/ ();
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _resetconsecutivenetworkerrors() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub ResetConsecutiveNetworkErrors";
 //BA.debugLineNum = 47;BA.debugLine="consecutiveNetworkErrors = 0";
_consecutivenetworkerrors = (int) (0);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelaystate(int _localretryinitial,int _serverretryinitial) throws Exception{
 //BA.debugLineNum = 576;BA.debugLine="Public Sub ResetRetryDelayState(localRetryInitial";
 //BA.debugLineNum = 577;BA.debugLine="localRetryDelay = localRetryInitial";
_localretrydelay = _localretryinitial;
 //BA.debugLineNum = 578;BA.debugLine="serverRetryDelay = serverRetryInitial";
_serverretrydelay = _serverretryinitial;
 //BA.debugLineNum = 579;BA.debugLine="dispatchRetryAfter = 0";
_dispatchretryafter = (int) (0);
 //BA.debugLineNum = 580;BA.debugLine="mediaPathDegradedFlag = False";
_mediapathdegradedflag = __c.False;
 //BA.debugLineNum = 581;BA.debugLine="If GetConsecutiveNetworkErrors > 0 Then TraceInfo";
if (_getconsecutivenetworkerrors()>0) { 
_traceinfo("network","retry сброшен","errors="+BA.NumberToString(_getconsecutivenetworkerrors()));};
 //BA.debugLineNum = 582;BA.debugLine="ResetConsecutiveNetworkErrors";
_resetconsecutivenetworkerrors();
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveanycachedlocaltrackitem(anywheresoftware.b4a.objects.collections.Map _currentslot) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.Map _playliststats = null;
anywheresoftware.b4a.objects.collections.Map _fallbackslot = null;
anywheresoftware.b4a.objects.collections.List _playlistids = null;
String _playlistid = "";
int _startindex = 0;
anywheresoftware.b4a.objects.collections.Map _selecteditem = null;
int _offset = 0;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
anywheresoftware.b4a.objects.collections.Map _indexedtrack = null;
anywheresoftware.b4a.objects.collections.Map _indexeddescriptor = null;
anywheresoftware.b4a.objects.collections.Map _indexedqueueitem = null;
 //BA.debugLineNum = 449;BA.debugLine="Private Sub ResolveAnyCachedLocalTrackItem(current";
 //BA.debugLineNum = 450;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 451;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 452;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
_mediacacheref._ensuretrackcacheready /*String*/ ();
 //BA.debugLineNum = 453;BA.debugLine="Dim playlistStats As Map = mediaCacheRef.GetCache";
_playliststats = new anywheresoftware.b4a.objects.collections.Map();
_playliststats = _mediacacheref._getcachedtrackplayliststats /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 454;BA.debugLine="Dim fallbackSlot As Map = currentSlot";
_fallbackslot = new anywheresoftware.b4a.objects.collections.Map();
_fallbackslot = _currentslot;
 //BA.debugLineNum = 455;BA.debugLine="If fallbackSlot.IsInitialized = False Or fallback";
if (_fallbackslot.IsInitialized()==__c.False || _fallbackslot.getSize()==0) { 
 //BA.debugLineNum = 456;BA.debugLine="fallbackSlot = dataResolverRef.ResolveDataSlotAt";
_fallbackslot = _dataresolverref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata(),_effectivenowticks());
 };
 //BA.debugLineNum = 458;BA.debugLine="If fallbackSlot.IsInitialized = False Then fallba";
if (_fallbackslot.IsInitialized()==__c.False) { 
_fallbackslot.Initialize();};
 //BA.debugLineNum = 459;BA.debugLine="Dim playlistIds As List";
_playlistids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 460;BA.debugLine="playlistIds.Initialize";
_playlistids.Initialize();
 //BA.debugLineNum = 461;BA.debugLine="If playlistStats.IsInitialized And playlistStats.";
if (_playliststats.IsInitialized() && _playliststats.getSize()>0) { 
 //BA.debugLineNum = 462;BA.debugLine="For Each playlistId As String In playlistStats.K";
{
final anywheresoftware.b4a.BA.IterableList group13 = _playliststats.Keys();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_playlistid = BA.ObjectToString(group13.Get(index13));
 //BA.debugLineNum = 463;BA.debugLine="If playlistId = \"\" Or playlistId = \"_unknown\" T";
if ((_playlistid).equals("") || (_playlistid).equals("_unknown")) { 
if (true) continue;};
 //BA.debugLineNum = 464;BA.debugLine="playlistIds.Add(playlistId)";
_playlistids.Add((Object)(_playlistid));
 }
};
 };
 //BA.debugLineNum = 467;BA.debugLine="If playlistIds.Size = 0 Then";
if (_playlistids.getSize()==0) { 
 //BA.debugLineNum = 468;BA.debugLine="playlistIds = mediaCacheRef.GetCachedTrackPlayli";
_playlistids = _mediacacheref._getcachedtrackplaylistidsondisk /*anywheresoftware.b4a.objects.collections.List*/ ();
 };
 //BA.debugLineNum = 470;BA.debugLine="Dim startIndex As Int = 0";
_startindex = (int) (0);
 //BA.debugLineNum = 471;BA.debugLine="If playlistIds.Size > 1 Then startIndex = Rnd(0,";
if (_playlistids.getSize()>1) { 
_startindex = __c.Rnd((int) (0),_playlistids.getSize());};
 //BA.debugLineNum = 472;BA.debugLine="Dim selectedItem As Map";
_selecteditem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 473;BA.debugLine="selectedItem.Initialize";
_selecteditem.Initialize();
 //BA.debugLineNum = 474;BA.debugLine="If playlistIds.Size > 0 Then";
if (_playlistids.getSize()>0) { 
 //BA.debugLineNum = 475;BA.debugLine="For offset = 0 To playlistIds.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_playlistids.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit26 ;_offset = _offset + step26 ) {
 //BA.debugLineNum = 476;BA.debugLine="Dim playlistId As String = playlistIds.Get((sta";
_playlistid = BA.ObjectToString(_playlistids.Get((int) ((_startindex+_offset)%_playlistids.getSize())));
 //BA.debugLineNum = 477;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.Resolv";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = _dataresolverref._resolveorderedcachedtrackfromplaylistbyid /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid,_mediacacheref);
 //BA.debugLineNum = 478;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedT";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 479;BA.debugLine="Dim descriptor As Map";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 480;BA.debugLine="descriptor.Initialize";
_descriptor.Initialize();
 //BA.debugLineNum = 481;BA.debugLine="descriptor.Put(\"id\", playlistId)";
_descriptor.Put((Object)("id"),(Object)(_playlistid));
 //BA.debugLineNum = 482;BA.debugLine="descriptor.Put(\"title\", cachedTrack.GetDefault(";
_descriptor.Put((Object)("title"),_cachedtrack.GetDefault((Object)("playlist_title"),(Object)("")));
 //BA.debugLineNum = 483;BA.debugLine="descriptor.Put(\"_slot_key\", BuildDataSlotKey(fa";
_descriptor.Put((Object)("_slot_key"),(Object)(_builddataslotkey(_fallbackslot)));
 //BA.debugLineNum = 484;BA.debugLine="descriptor.Put(\"_playlist_index\", 0)";
_descriptor.Put((Object)("_playlist_index"),(Object)(0));
 //BA.debugLineNum = 485;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQu";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = _dataresolverref._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (_fallbackslot,_descriptor,_cachedtrack,_offlinedata());
 //BA.debugLineNum = 486;BA.debugLine="selectedItem = queueItem";
_selecteditem = _queueitem;
 //BA.debugLineNum = 487;BA.debugLine="Exit";
if (true) break;
 }
};
 };
 //BA.debugLineNum = 490;BA.debugLine="If selectedItem.IsInitialized = False Or selected";
if (_selecteditem.IsInitialized()==__c.False || _selecteditem.getSize()==0) { 
 //BA.debugLineNum = 491;BA.debugLine="Dim indexedTrack As Map = mediaCacheRef.ResolveA";
_indexedtrack = new anywheresoftware.b4a.objects.collections.Map();
_indexedtrack = _mediacacheref._resolveanycachedtrackfromindex /*anywheresoftware.b4a.objects.collections.Map*/ ("","");
 //BA.debugLineNum = 492;BA.debugLine="If indexedTrack.IsInitialized And indexedTrack.S";
if (_indexedtrack.IsInitialized() && _indexedtrack.getSize()>0) { 
 //BA.debugLineNum = 493;BA.debugLine="Dim indexedDescriptor As Map";
_indexeddescriptor = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 494;BA.debugLine="indexedDescriptor.Initialize";
_indexeddescriptor.Initialize();
 //BA.debugLineNum = 495;BA.debugLine="indexedDescriptor.Put(\"id\", indexedTrack.GetDef";
_indexeddescriptor.Put((Object)("id"),_indexedtrack.GetDefault((Object)("playlist_id"),(Object)("")));
 //BA.debugLineNum = 496;BA.debugLine="indexedDescriptor.Put(\"title\", indexedTrack.Get";
_indexeddescriptor.Put((Object)("title"),_indexedtrack.GetDefault((Object)("playlist_title"),(Object)("")));
 //BA.debugLineNum = 497;BA.debugLine="indexedDescriptor.Put(\"_slot_key\", BuildDataSlo";
_indexeddescriptor.Put((Object)("_slot_key"),(Object)(_builddataslotkey(_fallbackslot)));
 //BA.debugLineNum = 498;BA.debugLine="indexedDescriptor.Put(\"_playlist_index\", 0)";
_indexeddescriptor.Put((Object)("_playlist_index"),(Object)(0));
 //BA.debugLineNum = 499;BA.debugLine="Dim indexedQueueItem As Map = dataResolverRef.C";
_indexedqueueitem = new anywheresoftware.b4a.objects.collections.Map();
_indexedqueueitem = _dataresolverref._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (_fallbackslot,_indexeddescriptor,_indexedtrack,_offlinedata());
 //BA.debugLineNum = 500;BA.debugLine="selectedItem = indexedQueueItem";
_selecteditem = _indexedqueueitem;
 };
 };
 //BA.debugLineNum = 503;BA.debugLine="If selectedItem.IsInitialized And selectedItem.Si";
if (_selecteditem.IsInitialized() && _selecteditem.getSize()>0) { 
if (true) return _selecteditem;};
 //BA.debugLineNum = 504;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvecurrentdataslot(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 623;BA.debugLine="Public Sub ResolveCurrentDataSlot(data As Map) As";
 //BA.debugLineNum = 624;BA.debugLine="Return dataResolverRef.ResolveCurrentDataSlot(dat";
if (true) return _dataresolverref._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (_data);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedataslotatticks(anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
 //BA.debugLineNum = 619;BA.debugLine="Public Sub ResolveDataSlotAtTicks(data As Map, tar";
 //BA.debugLineNum = 620;BA.debugLine="Return dataResolverRef.ResolveDataSlotAtTicks(dat";
if (true) return _dataresolverref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_data,_targetticks);
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public String  _resolveidleuntilmessage(anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Public Sub ResolveIdleUntilMessage(data As Map, ta";
 //BA.debugLineNum = 379;BA.debugLine="Return owner.Data_ResolveIdleUntilMessage(data, t";
if (true) return _owner._data_resolveidleuntilmessage /*String*/ (_data,_targetticks);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextdataslotatticks(anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
 //BA.debugLineNum = 627;BA.debugLine="Public Sub ResolveNextDataSlotAtTicks(data As Map,";
 //BA.debugLineNum = 628;BA.debugLine="Return dataResolverRef.ResolveNextDataSlotAtTicks";
if (true) return _dataresolverref._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_data,_targetticks);
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextlocaltrackitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _resolveditem = null;
 //BA.debugLineNum = 388;BA.debugLine="Public Sub ResolveNextLocalTrackItem As Map";
 //BA.debugLineNum = 389;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 390;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 391;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
_mediacacheref._ensuretrackcacheready /*String*/ ();
 //BA.debugLineNum = 392;BA.debugLine="If HasUsableDataPlaybackInstructions = False Then";
if (_hasusabledataplaybackinstructions()==__c.False) { 
if (true) return _resolveanycachedlocaltrackitem(_emptyitem);};
 //BA.debugLineNum = 393;BA.debugLine="Dim currentSlot As Map = dataResolverRef.ResolveD";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = _dataresolverref._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (_offlinedata(),_effectivenowticks());
 //BA.debugLineNum = 394;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
 //BA.debugLineNum = 395;BA.debugLine="Return ResolveAnyCachedLocalTrackItem(emptyItem)";
if (true) return _resolveanycachedlocaltrackitem(_emptyitem);
 };
 //BA.debugLineNum = 397;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
 //BA.debugLineNum = 398;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
 //BA.debugLineNum = 399;BA.debugLine="Return ResolveAnyCachedLocalTrackItem(emptyItem)";
if (true) return _resolveanycachedlocaltrackitem(_emptyitem);
 };
 //BA.debugLineNum = 401;BA.debugLine="Dim resolvedItem As Map = ResolveSequentialSlotTr";
_resolveditem = new anywheresoftware.b4a.objects.collections.Map();
_resolveditem = _resolvesequentialslottrackitem(_currentslot,_playlists);
 //BA.debugLineNum = 402;BA.debugLine="If resolvedItem.IsInitialized And resolvedItem.Si";
if (_resolveditem.IsInitialized() && _resolveditem.getSize()>0) { 
if (true) return _resolveditem;};
 //BA.debugLineNum = 403;BA.debugLine="resolvedItem = ResolveSlotScopedCachedTrackItem(c";
_resolveditem = _resolveslotscopedcachedtrackitem(_currentslot,_playlists);
 //BA.debugLineNum = 404;BA.debugLine="Return resolvedItem";
if (true) return _resolveditem;
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public int  _resolveretrydelay(String _mode,int _delayms,int _localretrymax,int _serverretrymax,int _blockedretrydelay) throws Exception{
int _delay = 0;
int _delayserver = 0;
 //BA.debugLineNum = 542;BA.debugLine="Public Sub ResolveRetryDelay(mode As String, delay";
 //BA.debugLineNum = 543;BA.debugLine="If delayMs > 0 Then Return delayMs";
if (_delayms>0) { 
if (true) return _delayms;};
 //BA.debugLineNum = 544;BA.debugLine="If mode = \"network\" Then";
if ((_mode).equals("network")) { 
 //BA.debugLineNum = 545;BA.debugLine="Dim delay As Int = localRetryDelay";
_delay = _localretrydelay;
 //BA.debugLineNum = 546;BA.debugLine="localRetryDelay = Min(localRetryDelay * 2, local";
_localretrydelay = (int) (__c.Min(_localretrydelay*2,_localretrymax));
 //BA.debugLineNum = 547;BA.debugLine="Return delay";
if (true) return _delay;
 };
 //BA.debugLineNum = 549;BA.debugLine="If mode = \"blocked\" Then Return blockedRetryDelay";
if ((_mode).equals("blocked")) { 
if (true) return _blockedretrydelay;};
 //BA.debugLineNum = 550;BA.debugLine="Dim delayServer As Int = serverRetryDelay";
_delayserver = _serverretrydelay;
 //BA.debugLineNum = 551;BA.debugLine="serverRetryDelay = Min(serverRetryDelay * 2, serv";
_serverretrydelay = (int) (__c.Min(_serverretrydelay*2,_serverretrymax));
 //BA.debugLineNum = 552;BA.debugLine="Return delayServer";
if (true) return _delayserver;
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvesequentialslottrackitem(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.List _playlists) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
String _slotkey = "";
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
int _cursorvalue = 0;
int _startindex = 0;
anywheresoftware.b4a.objects.collections.Map _selecteditem = null;
int _offset = 0;
int _playlistindex = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _normalizeddescriptor = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
 //BA.debugLineNum = 407;BA.debugLine="Private Sub ResolveSequentialSlotTrackItem(current";
 //BA.debugLineNum = 408;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 409;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 410;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptyitem;};
 //BA.debugLineNum = 411;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = _builddataslotkey(_currentslot);
 //BA.debugLineNum = 412;BA.debugLine="Dim workingCursors As Map = dataResolverRef.Clone";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = _dataresolverref._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 413;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),(Object)(0))));
 //BA.debugLineNum = 414;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
 //BA.debugLineNum = 415;BA.debugLine="Dim startIndex As Int = cursorValue Mod playlists";
_startindex = (int) (_cursorvalue%_playlists.getSize());
 //BA.debugLineNum = 416;BA.debugLine="Dim selectedItem As Map";
_selecteditem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 417;BA.debugLine="selectedItem.Initialize";
_selecteditem.Initialize();
 //BA.debugLineNum = 418;BA.debugLine="For offset = 0 To playlists.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_playlists.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit11 ;_offset = _offset + step11 ) {
 //BA.debugLineNum = 419;BA.debugLine="Dim playlistIndex As Int = (startIndex + offset)";
_playlistindex = (int) ((_startindex+_offset)%_playlists.getSize());
 //BA.debugLineNum = 420;BA.debugLine="Dim playlistObject As Object = playlists.Get(pla";
_playlistobject = _playlists.Get(_playlistindex);
 //BA.debugLineNum = 421;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 422;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 423;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 424;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 425;BA.debugLine="Dim cachedTrack As Map = dataResolverRef.Resolve";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = _dataresolverref._resolveorderedcachedtrackfromplaylistbyid /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid,_mediacacheref);
 //BA.debugLineNum = 426;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 427;BA.debugLine="Dim normalizedDescriptor As Map = CloneMap(playl";
_normalizeddescriptor = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddescriptor = _clonemap(_playlistdescriptor);
 //BA.debugLineNum = 428;BA.debugLine="normalizedDescriptor.Put(\"_slot_key\", slotKey)";
_normalizeddescriptor.Put((Object)("_slot_key"),(Object)(_slotkey));
 //BA.debugLineNum = 429;BA.debugLine="normalizedDescriptor.Put(\"_playlist_index\", play";
_normalizeddescriptor.Put((Object)("_playlist_index"),(Object)(_playlistindex));
 //BA.debugLineNum = 430;BA.debugLine="workingCursors.Put(slotKey, playlistIndex + 1)";
_workingcursors.Put((Object)(_slotkey),(Object)(_playlistindex+1));
 //BA.debugLineNum = 431;BA.debugLine="dataResolverRef.SavePreviewPlaylistCursors(stora";
_dataresolverref._savepreviewplaylistcursors /*String*/ (_storageref,_workingcursors);
 //BA.debugLineNum = 432;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQue";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = _dataresolverref._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (_currentslot,_normalizeddescriptor,_cachedtrack,_offlinedata());
 //BA.debugLineNum = 433;BA.debugLine="selectedItem = queueItem";
_selecteditem = _queueitem;
 //BA.debugLineNum = 434;BA.debugLine="Exit";
if (true) break;
 }
};
 //BA.debugLineNum = 436;BA.debugLine="If selectedItem.IsInitialized And selectedItem.Si";
if (_selecteditem.IsInitialized() && _selecteditem.getSize()>0) { 
if (true) return _selecteditem;};
 //BA.debugLineNum = 437;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolveslotscopedcachedtrackitem(anywheresoftware.b4a.objects.collections.Map _currentslot,anywheresoftware.b4a.objects.collections.List _playlists) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
String _slotkey = "";
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
int _cursorvalue = 0;
int _startindex = 0;
int _offset = 0;
int _playlistindex = 0;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _normalizeddescriptor = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
 //BA.debugLineNum = 507;BA.debugLine="Private Sub ResolveSlotScopedCachedTrackItem(curre";
 //BA.debugLineNum = 508;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 509;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 510;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return _emptyitem;};
 //BA.debugLineNum = 511;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return _emptyitem;};
 //BA.debugLineNum = 513;BA.debugLine="mediaCacheRef.EnsureTrackCacheReady";
_mediacacheref._ensuretrackcacheready /*String*/ ();
 //BA.debugLineNum = 514;BA.debugLine="Dim slotKey As String = BuildDataSlotKey(currentS";
_slotkey = _builddataslotkey(_currentslot);
 //BA.debugLineNum = 515;BA.debugLine="Dim workingCursors As Map = dataResolverRef.Clone";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = _dataresolverref._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 516;BA.debugLine="Dim cursorValue As Int = workingCursors.GetDefaul";
_cursorvalue = (int)(BA.ObjectToNumber(_workingcursors.GetDefault((Object)(_slotkey),(Object)(0))));
 //BA.debugLineNum = 517;BA.debugLine="If cursorValue < 0 Then cursorValue = 0";
if (_cursorvalue<0) { 
_cursorvalue = (int) (0);};
 //BA.debugLineNum = 518;BA.debugLine="Dim startIndex As Int = cursorValue Mod playlists";
_startindex = (int) (_cursorvalue%_playlists.getSize());
 //BA.debugLineNum = 520;BA.debugLine="For offset = 0 To playlists.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_playlists.getSize()-1);
_offset = (int) (0) ;
for (;_offset <= limit11 ;_offset = _offset + step11 ) {
 //BA.debugLineNum = 521;BA.debugLine="Dim playlistIndex As Int = (startIndex + offset)";
_playlistindex = (int) ((_startindex+_offset)%_playlists.getSize());
 //BA.debugLineNum = 522;BA.debugLine="Dim playlistObject As Object = playlists.Get(pla";
_playlistobject = _playlists.Get(_playlistindex);
 //BA.debugLineNum = 523;BA.debugLine="If (playlistObject Is Map) = False Then Continue";
if ((_playlistobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 525;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
 //BA.debugLineNum = 526;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 527;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 529;BA.debugLine="Dim cachedTrack As Map = mediaCacheRef.ResolveAn";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = _mediacacheref._resolveanycachedtrackfromindex /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid,"");
 //BA.debugLineNum = 530;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (_cachedtrack.IsInitialized()==__c.False || _cachedtrack.getSize()==0) { 
if (true) continue;};
 //BA.debugLineNum = 532;BA.debugLine="Dim normalizedDescriptor As Map = CloneMap(playl";
_normalizeddescriptor = new anywheresoftware.b4a.objects.collections.Map();
_normalizeddescriptor = _clonemap(_playlistdescriptor);
 //BA.debugLineNum = 533;BA.debugLine="normalizedDescriptor.Put(\"_slot_key\", slotKey)";
_normalizeddescriptor.Put((Object)("_slot_key"),(Object)(_slotkey));
 //BA.debugLineNum = 534;BA.debugLine="normalizedDescriptor.Put(\"_playlist_index\", play";
_normalizeddescriptor.Put((Object)("_playlist_index"),(Object)(_playlistindex));
 //BA.debugLineNum = 535;BA.debugLine="Dim queueItem As Map = dataResolverRef.CreateQue";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = _dataresolverref._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (_currentslot,_normalizeddescriptor,_cachedtrack,_offlinedata());
 //BA.debugLineNum = 536;BA.debugLine="If queueItem.IsInitialized And queueItem.Size >";
if (_queueitem.IsInitialized() && _queueitem.getSize()>0) { 
if (true) return _queueitem;};
 }
};
 //BA.debugLineNum = 539;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return null;
}
public String  _resumeplaybackafterpolicypauseasync() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Public Sub ResumePlaybackAfterPolicyPauseAsync";
 //BA.debugLineNum = 297;BA.debugLine="owner.Data_ResumePlaybackAfterPolicyPauseAsync";
_owner._data_resumeplaybackafterpolicypauseasync /*String*/ ();
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public boolean  _resumeplaybackwhenserverallows() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub ResumePlaybackWhenServerAllows As Boole";
 //BA.debugLineNum = 171;BA.debugLine="Return policyState.ResumePlaybackWhenServerAllows";
if (true) return _policystate._resumeplaybackwhenserverallows /*boolean*/ ;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return false;
}
public String  _saveofflinedata(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Public Sub SaveOfflineData(data As Map)";
 //BA.debugLineNum = 187;BA.debugLine="offlineDataRef = offlineStoreRef.SaveOfflineData(";
_offlinedataref = _offlinestoreref._saveofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (_data,_playercodevalue(),_deviceidvalue());
 //BA.debugLineNum = 188;BA.debugLine="If offlineDataRef.IsInitialized = False Then offl";
if (_offlinedataref.IsInitialized()==__c.False) { 
_offlinedataref.Initialize();};
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub SaveServerSnapshot(method As String, ur";
 //BA.debugLineNum = 143;BA.debugLine="owner.Data_SaveServerSnapshot(method, url, succes";
_owner._data_saveserversnapshot /*String*/ (_method,_url,_success,_body,_errormessage);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(String _mode,int _delayms) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Public Sub ScheduleRetry(mode As String, delayMs A";
 //BA.debugLineNum = 330;BA.debugLine="owner.Data_ScheduleRetry(mode, delayMs)";
_owner._data_scheduleretry /*String*/ (_mode,_delayms);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public String  _secondsagotext(long _ticksvalue) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Public Sub SecondsAgoText(ticksValue As Long) As S";
 //BA.debugLineNum = 147;BA.debugLine="Return owner.Data_SecondsAgoText(ticksValue)";
if (true) return _owner._data_secondsagotext /*String*/ (_ticksvalue);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _servicecheckurlvalue() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
 //BA.debugLineNum = 99;BA.debugLine="Return owner.ServiceCheckUrlValue";
if (true) return _owner._servicecheckurlvalue /*String*/ ();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _setdispatchretryafter(int _value) throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Public Sub SetDispatchRetryAfter(value As Int)";
 //BA.debugLineNum = 590;BA.debugLine="dispatchRetryAfter = Max(0, value)";
_dispatchretryafter = (int) (__c.Max(0,_value));
 //BA.debugLineNum = 591;BA.debugLine="End Sub";
return "";
}
public String  _setlastdataoknow() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub SetLastDataOkNow";
 //BA.debugLineNum = 67;BA.debugLine="dataSuccessAtTicks = DateTime.Now";
_datasuccessatticks = __c.DateTime.getNow();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setlasthistoryoknow() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub SetLastHistoryOkNow";
 //BA.debugLineNum = 75;BA.debugLine="historySuccessAtTicks = DateTime.Now";
_historysuccessatticks = __c.DateTime.getNow();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _setlastofflinedatarefreshstate(String _statevalue) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Public Sub SetLastOfflineDataRefreshState(stateVal";
 //BA.debugLineNum = 159;BA.debugLine="policyState.LastOfflineDataRefreshState = stateVa";
_policystate._lastofflinedatarefreshstate /*String*/  = _statevalue;
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _setlastretrymode(String _mode) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub SetLastRetryMode(mode As String)";
 //BA.debugLineNum = 55;BA.debugLine="lastRetryMode = mode";
_lastretrymode = _mode;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _setmediapathdegraded(boolean _value) throws Exception{
 //BA.debugLineNum = 599;BA.debugLine="Public Sub SetMediaPathDegraded(value As Boolean)";
 //BA.debugLineNum = 600;BA.debugLine="mediaPathDegradedFlag = value";
_mediapathdegradedflag = _value;
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return "";
}
public String  _setofflinedata(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Public Sub SetOfflineData(data As Map)";
 //BA.debugLineNum = 192;BA.debugLine="If data.IsInitialized Then";
if (_data.IsInitialized()) { 
 //BA.debugLineNum = 193;BA.debugLine="offlineDataRef = data";
_offlinedataref = _data;
 }else {
 //BA.debugLineNum = 195;BA.debugLine="offlineDataRef.Initialize";
_offlinedataref.Initialize();
 };
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _setplaybackflowstate(String _statevalue,String _reason) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Public Sub SetPlaybackFlowState(stateValue As Stri";
 //BA.debugLineNum = 338;BA.debugLine="owner.Data_SetPlaybackFlowState(stateValue, reaso";
_owner._data_setplaybackflowstate /*String*/ (_statevalue,_reason);
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon() throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Public Sub SetPlayIcon";
 //BA.debugLineNum = 350;BA.debugLine="owner.Data_SetPlayIcon";
_owner._data_setplayicon /*String*/ ();
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public String  _setremotedataready() throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Public Sub SetRemoteDataReady";
 //BA.debugLineNum = 167;BA.debugLine="policyState.SetRemoteDataReady";
_policystate._setremotedataready /*String*/ ();
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _setretryinterval(int _value) throws Exception{
 //BA.debugLineNum = 560;BA.debugLine="Public Sub SetRetryInterval(value As Int)";
 //BA.debugLineNum = 561;BA.debugLine="retryTimerRef.Interval = value";
_retrytimerref.setInterval((long) (_value));
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _setstartupsequenceinprogress(boolean _value) throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Public Sub SetStartupSequenceInProgress(value As B";
 //BA.debugLineNum = 237;BA.debugLine="startupSequenceInProgress = value";
_startupsequenceinprogress = _value;
 //BA.debugLineNum = 238;BA.debugLine="If value = False Then adWarmupDeferredAfterStartu";
if (_value==__c.False) { 
_adwarmupdeferredafterstartup = __c.False;};
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _setstopicon() throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Public Sub SetStopIcon";
 //BA.debugLineNum = 289;BA.debugLine="owner.Data_SetStopIcon";
_owner._data_setstopicon /*String*/ ();
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public boolean  _shouldresumewithnewstart() throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Public Sub ShouldResumeWithNewStart As Boolean";
 //BA.debugLineNum = 277;BA.debugLine="Return orchestrationStateRef.IsStarted And IsUser";
if (true) return _orchestrationstateref._isstarted /*boolean*/  && _isuserstoppedstate()==__c.False && _ispolicypausestate()==__c.False && _orchestrationstateref._isstopping /*boolean*/ ==__c.False;
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return false;
}
public String  _showmessage(String _text) throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Public Sub ShowMessage(text As String)";
 //BA.debugLineNum = 326;BA.debugLine="owner.Data_ShowMessage(text)";
_owner._data_showmessage /*String*/ (_text);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public b4a.example.keyvaluestore  _storage() throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Public Sub Storage As KeyValueStore";
 //BA.debugLineNum = 179;BA.debugLine="Return storageRef";
if (true) return _storageref;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _syncofflineplaylistmetadata() throws Exception{
ResumableSub_SyncOfflinePlaylistMetadata rsub = new ResumableSub_SyncOfflinePlaylistMetadata(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_SyncOfflinePlaylistMetadata(b4a.example.playerstatestore parent) {
this.parent = parent;
}
b4a.example.playerstatestore parent;
boolean _synced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 309;BA.debugLine="Wait For (owner.Data_SyncOfflinePlaylistMetadata)";
parent.__c.WaitFor("complete", ba, this, parent._owner._data_syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (Boolean) result[0];
;
 //BA.debugLineNum = 310;BA.debugLine="Return synced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_synced));return;};
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _synced) throws Exception{
}
public int  _timezoneoffsetminutesvalue() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
 //BA.debugLineNum = 91;BA.debugLine="Return owner.TimezoneOffsetMinutesValue";
if (true) return _owner._timezoneoffsetminutesvalue /*int*/ ();
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return 0;
}
public String  _traceinfo(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Public Sub TraceInfo(category As String, message A";
 //BA.debugLineNum = 127;BA.debugLine="owner.Data_TraceInfo(category, message, details)";
_owner._data_traceinfo /*String*/ (_category,_message,_details);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(String _message) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub TraceLog(message As String)";
 //BA.debugLineNum = 123;BA.debugLine="owner.Data_TraceLog(message)";
_owner._data_tracelog /*String*/ (_message);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub TraceWarn(category As String, message A";
 //BA.debugLineNum = 131;BA.debugLine="owner.Data_TraceWarn(category, message, details)";
_owner._data_tracewarn /*String*/ (_category,_message,_details);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _trustedsynctimekey() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub TrustedSyncTimeKey As String";
 //BA.debugLineNum = 183;BA.debugLine="Return trustedSyncTimeKeyValue";
if (true) return _trustedsynctimekeyvalue;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _updatemediapathdegradedfromcachesync(boolean _downloaded,boolean _networkfailure) throws Exception{
boolean _previous = false;
 //BA.debugLineNum = 607;BA.debugLine="Public Sub UpdateMediaPathDegradedFromCacheSync(do";
 //BA.debugLineNum = 608;BA.debugLine="Dim previous As Boolean = mediaPathDegradedFlag";
_previous = _mediapathdegradedflag;
 //BA.debugLineNum = 609;BA.debugLine="If downloaded Then";
if (_downloaded) { 
 //BA.debugLineNum = 610;BA.debugLine="mediaPathDegradedFlag = False";
_mediapathdegradedflag = __c.False;
 }else if(_networkfailure) { 
 //BA.debugLineNum = 612;BA.debugLine="mediaPathDegradedFlag = True";
_mediapathdegradedflag = __c.True;
 };
 //BA.debugLineNum = 614;BA.debugLine="If previous = False And mediaPathDegradedFlag The";
if (_previous==__c.False && _mediapathdegradedflag) { 
if (true) return "entered";};
 //BA.debugLineNum = 615;BA.debugLine="If previous = True And mediaPathDegradedFlag = Fa";
if (_previous==__c.True && _mediapathdegradedflag==__c.False) { 
if (true) return "recovered";};
 //BA.debugLineNum = 616;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return "";
}
public String  _writehealthsnapshot(String _trigger) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Public Sub WriteHealthSnapshot(trigger As String)";
 //BA.debugLineNum = 229;BA.debugLine="owner.Data_WriteHealthSnapshot(trigger)";
_owner._data_writehealthsnapshot /*String*/ (_trigger);
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "TRACELOG"))
	return _tracelog((String) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
