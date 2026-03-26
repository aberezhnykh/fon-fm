package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _next_base_url = "";
public String _claim_base_url = "";
public String _history_base_url = "";
public String _trace_base_url = "";
public String _client_header_name = "";
public String _client_header_value = "";
public String _data_base_url = "";
public String _app_update_url = "";
public String _app_update_file = "";
public String _app_update_temp_file = "";
public long _app_update_retry_delay_ms = 0L;
public String _app_update_failed_version_key = "";
public String _app_update_failed_reason_key = "";
public String _app_update_failed_at_key = "";
public String _app_update_failed_retry_after_key = "";
public String _app_update_failed_attempts_key = "";
public String _playlist_cdn_base_url = "";
public String _service_check_url = "";
public boolean _use_data_playback_resolver = false;
public boolean _local_playback_only = false;
public String _icon_play = "";
public String _icon_stop = "";
public String _icon_more = "";
public String _icon_close = "";
public String _icon_cloud_ok = "";
public String _icon_cloud_off = "";
public String _icon_cloud_degraded = "";
public int _prefetch_seconds = 0;
public int _stop_fade_ms = 0;
public int _orbit_fade_ms = 0;
public int _start_fade_ms = 0;
public int _track_overlap_ms = 0;
public int _ad_tail_overlap_ms = 0;
public int _cache_audit_start_delay_ms = 0;
public int _cache_audit_step_interval_ms = 0;
public int _cache_audit_recheck_interval_ms = 0;
public long _track_cache_prune_cooldown_ms = 0L;
public int _fetch_timeout_ms = 0;
public int _audio_ready_timeout_ms = 0;
public int _audio_output_error_pause_threshold = 0;
public int _audio_output_retry_delay_ms = 0;
public long _playback_watchdog_stall_ms = 0L;
public long _playback_watchdog_recovery_cooldown_ms = 0L;
public long _playback_watchdog_progress_delta_ms = 0L;
public long _playback_watchdog_grace_ms = 0L;
public int _trace_error_debug_context_lines = 0;
public int _pause_retry_delay = 0;
public int _local_retry_delay_initial = 0;
public int _local_retry_delay_max = 0;
public int _server_retry_delay_initial = 0;
public int _server_retry_delay_max = 0;
public int _blocked_retry_delay = 0;
public String _flow_idle = "";
public String _flow_starting = "";
public String _flow_playing = "";
public String _flow_preparing = "";
public String _flow_transitioning = "";
public String _flow_stopping = "";
public String _flow_paused_policy = "";
public String _flow_error = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _rootview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _storagedir = "";
public String _appupdatedir = "";
public String _storagefile = "";
public String _localstatedbname = "";
public String _trustedsynctimekey = "";
public String _trustedsynclocaltimekey = "";
public String _playerdatafile = "";
public String _playlistrequirementsfile = "";
public String _localplaylistsdirname = "";
public String _historydirname = "";
public String _debugresponsesdir = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _card = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _headerpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _headeractionpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _contentpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _footerpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _setuppane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playerpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _setupheropane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _setupdetailpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _setupprimarypane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _setupstatuspane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playerheropane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playerdetailpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playerprimarypane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playerstatuspane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _orbitpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _playbuttonpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _confirmpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _accesscirclepane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _accesscorepane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _accessinputpane = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblheader = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblheaderaction = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblplayicon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblstream = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfooter = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblconnectionicon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsetupmessage = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtplayercode = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtplayercodeview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsetupsubmit = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfirmyes = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfirmno = null;
public float _headeractionfontsize = 0f;
public float _codefontsize = 0f;
public boolean _iscodeinputfocused = false;
public b4a.example.audioplayer _audioprimary = null;
public b4a.example.audioplayer _audiosecondary = null;
public b4a.example.adscheduler _localadscheduler = null;
public b4a.example.dataplaybackresolver _dataresolver = null;
public b4a.example.offlinestore _offlinestoreservice = null;
public b4a.example.traceservice _apptraceservice = null;
public b4a.example.autonomouscachemanager _autocachemanager = null;
public b4a.example.playbacktraceformatter _traceformatter = null;
public b4a.example.playbacktracerouter _tracerouter = null;
public b4a.example.playbacktraceuploader _traceuploader = null;
public b4a.example.mediacache _mediacacheservice = null;
public b4a.example.keyvaluestore _storage = null;
public anywheresoftware.b4a.objects.collections.List _playqueue = null;
public anywheresoftware.b4a.objects.collections.Map _messages = null;
public int _traceloglimit = 0;
public int _serversnapshotlimit = 0;
public anywheresoftware.b4a.objects.Timer _retrytimer = null;
public anywheresoftware.b4a.objects.Timer _orbittimer = null;
public b4a.example.playbackservicebridge _servicebridge = null;
public String _playercode = "";
public String _deviceid = "";
public String _appscreenmode = "";
public String _nextstartmode = "";
public b4a.example.playbackruntimestate _runtimestate = null;
public b4a.example.playbackmetastate _metastate = null;
public b4a.example.playbackorchestrationstate _orchestrationstate = null;
public b4a.example.playbackdatapolicystate _datapolicystate = null;
public b4a.example.offlineplaybackengine _offlineplaybackcore = null;
public b4a.example.playbacktransitioncoordinator _transitioncoordinator = null;
public b4a.example.playbackdatacoordinator _playerdatacoordinator = null;
public b4a.example.playerstatestore _statestore = null;
public b4a.example.networksyncservice _syncservice = null;
public b4a.example.playeruicontroller _uicontroller = null;
public boolean _uicontrollerready = false;
public b4a.example.playbackdirectorstate _directorstate = null;
public boolean _initialstartfadepending = false;
public boolean _ishistoryflushinprogress = false;
public anywheresoftware.b4a.objects.collections.List _cachedrelevanttrackids = null;
public long _lastplaybuttoninputat = 0L;
public long _lastheaderactioninputat = 0L;
public long _lastuserplaybackinputat = 0L;
public long _lasttrackcachepruneat = 0L;
public int _consecutiveaudiooutputerrors = 0;
public boolean _isaudiooutputrecoverypause = false;
public long _lastplaybackwatchdogpositionms = 0L;
public String _lastplaybackwatchdogtrackid = "";
public long _lastplaybackwatchdogprogressat = 0L;
public long _lastplaybackwatchdogrecoveryat = 0L;
public long _lasttransitionfadestartedatus = 0L;
public String _lasttransitionfadefromaudiokey = "";
public String _lasttransitionfadetoaudiokey = "";
public String _lasttransitionfadereason = "";
public boolean _isplaybackwatchdogtickinprogress = false;
public boolean _isplaybackdirectortickqueued = false;
public boolean _isplaybackdirectorretickrequested = false;
public long _playbackactivationtoken = 0L;
public long _scheduledbreakat = 0L;
public anywheresoftware.b4a.objects.collections.Map _audiotimeupdatequeuedbykey = null;
public int _playlistindex = 0;
public int _orbitpulsestep = 0;
public boolean _isstartupsequenceinprogress = false;
public boolean _isadwarmupdeferredafterstartup = false;
public boolean _ispoststarttasksdeferredafterstartup = false;
public String _playbackflowstate = "";
public boolean _isappupdatedownloadinprogress = false;
public int _pendingappupdateversion = 0;
public int _downloadedappupdateversion = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.appinfo _appinfo = null;
public b4a.example.platformbridge _platformbridge = null;
public b4a.example.uistyle _uistyle = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _activateloadeditem(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
String _plannedenddetails = "";
long _deltaus = 0L;
 //BA.debugLineNum = 2526;BA.debugLine="Private Sub ActivateLoadedItem(audioKey As String,";
 //BA.debugLineNum = 2527;BA.debugLine="playbackActivationToken = playbackActivationToken";
_playbackactivationtoken = (long) (_playbackactivationtoken+1);
 //BA.debugLineNum = 2528;BA.debugLine="ResetAudioOutputErrorState";
_resetaudiooutputerrorstate();
 //BA.debugLineNum = 2529;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2530;BA.debugLine="directorState.SetActive(audioKey, item)";
_directorstate._setactive /*String*/ (_audiokey,_item);
 //BA.debugLineNum = 2531;BA.debugLine="directorState.ClearRole(\"prepared_music\")";
_directorstate._clearrole /*String*/ ("prepared_music");
 //BA.debugLineNum = 2532;BA.debugLine="directorState.ClearRole(\"prepared_interrupt\")";
_directorstate._clearrole /*String*/ ("prepared_interrupt");
 //BA.debugLineNum = 2533;BA.debugLine="directorState.ClearRole(\"prepared\")";
_directorstate._clearrole /*String*/ ("prepared");
 //BA.debugLineNum = 2534;BA.debugLine="directorState.ClearRole(\"pending_play\")";
_directorstate._clearrole /*String*/ ("pending_play");
 //BA.debugLineNum = 2535;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 }else {
 //BA.debugLineNum = 2537;BA.debugLine="runtimeState.SetActive(audioKey, item)";
_runtimestate._setactive /*String*/ (_audiokey,_item);
 };
 //BA.debugLineNum = 2539;BA.debugLine="SetPlaybackFlowState(FLOW_PLAYING, \"activate_load";
_setplaybackflowstate(_flow_playing,"activate_loaded_item");
 //BA.debugLineNum = 2540;BA.debugLine="metaState.SetCurrentMedia(ResolvePlaybackMediaUrl";
_metastate._setcurrentmedia /*String*/ (_resolveplaybackmediaurl(_audiokey,_item),BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)(""))));
 //BA.debugLineNum = 2541;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
_orchestrationstate._cleartracktransitionflags /*String*/ ();
 //BA.debugLineNum = 2542;BA.debugLine="UpdatePlaybackMeta(item)";
_updateplaybackmeta(_item);
 //BA.debugLineNum = 2543;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"track\" Then";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track"))) { 
 //BA.debugLineNum = 2544;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, item)";
_dataresolver._commitplaylistcursor /*String*/ (_storage,_item);
 };
 //BA.debugLineNum = 2546;BA.debugLine="mediaCacheService.TouchCachedItem(item)";
_mediacacheservice._touchcacheditem /*String*/ (_item);
 //BA.debugLineNum = 2547;BA.debugLine="Dim plannedEndDetails As String = BuildPlannedEnd";
_plannedenddetails = _buildplannedendtracedetails(_audiokey,_item);
 //BA.debugLineNum = 2548;BA.debugLine="TraceLog(\"воспроизведение activate audio=\" & audi";
_tracelog("воспроизведение activate audio="+_audiokey+" item="+_describeitem((Object)(_item.getObject()))+" fadeInMs="+BA.NumberToString(_fadeinms)+BA.ObjectToString((((_plannedenddetails).equals("") == false) ? ((Object)(" "+_plannedenddetails)) : ((Object)("")))));
 //BA.debugLineNum = 2549;BA.debugLine="If lastTransitionFadeStartedAtUs > 0 Then";
if (_lasttransitionfadestartedatus>0) { 
 //BA.debugLineNum = 2550;BA.debugLine="Dim deltaUs As Long = MonotonicMicros - lastTran";
_deltaus = (long) (_monotonicmicros()-_lasttransitionfadestartedatus);
 //BA.debugLineNum = 2551;BA.debugLine="TraceInfo(\"playback\", \"fade to play\", \"from=\" &";
_traceinfo("playback","fade to play","from="+_lasttransitionfadefromaudiokey+" to="+_audiokey+" deltaUs="+BA.NumberToString(_deltaus)+" deltaMs="+BA.NumberToString(__c.Round(_deltaus/(double)1000))+" reason="+_lasttransitionfadereason+" item="+_tracetrackvalue(_item));
 //BA.debugLineNum = 2552;BA.debugLine="lastTransitionFadeStartedAtUs = 0";
_lasttransitionfadestartedatus = (long) (0);
 //BA.debugLineNum = 2553;BA.debugLine="lastTransitionFadeFromAudioKey = \"\"";
_lasttransitionfadefromaudiokey = "";
 //BA.debugLineNum = 2554;BA.debugLine="lastTransitionFadeToAudioKey = \"\"";
_lasttransitionfadetoaudiokey = "";
 //BA.debugLineNum = 2555;BA.debugLine="lastTransitionFadeReason = \"\"";
_lasttransitionfadereason = "";
 };
 //BA.debugLineNum = 2557;BA.debugLine="TraceInfo(\"audio\", \"плеер play\", BuildAudioTraceD";
_traceinfo("audio","плеер play",_buildaudiotracedetails(_item,"player="+_traceplayernumber(_audiokey)+" type="+_traceitemtype(_item)+" id="+_tracetrackvalue(_item)+BA.ObjectToString((((_plannedenddetails).equals("") == false) ? ((Object)(" "+_plannedenddetails)) : ((Object)(""))))));
 //BA.debugLineNum = 2558;BA.debugLine="GetAudioByKey(audioKey).PlayWithFade(fadeInMs)";
_getaudiobykey(_audiokey)._playwithfade /*String*/ (_fadeinms);
 //BA.debugLineNum = 2559;BA.debugLine="MarkPlaybackWatchdogProgress(item.GetDefault(\"id\"";
_markplaybackwatchdogprogress(BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))),(long) (0));
 //BA.debugLineNum = 2560;BA.debugLine="ScheduleHistoryLog(item)";
_schedulehistorylog(_item);
 //BA.debugLineNum = 2561;BA.debugLine="ResetRetryDelay";
_resetretrydelay();
 //BA.debugLineNum = 2562;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
_orchestrationstate._cleartracktransitionflags /*String*/ ();
 //BA.debugLineNum = 2563;BA.debugLine="If isStartupSequenceInProgress Then";
if (_isstartupsequenceinprogress) { 
 //BA.debugLineNum = 2564;BA.debugLine="RequestDeferredPostStartTasks";
_requestdeferredpoststarttasks();
 };
 //BA.debugLineNum = 2566;BA.debugLine="End Sub";
return "";
}
public long  _activeplaybackpositionms() throws Exception{
b4a.example.playbackplayerslot _activeslot = null;
 //BA.debugLineNum = 2097;BA.debugLine="Private Sub ActivePlaybackPositionMs As Long";
 //BA.debugLineNum = 2098;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2099;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = _directorstate._getactiveslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2100;BA.debugLine="If activeSlot.IsInitialized And activeSlot.Audio";
if (_activeslot.IsInitialized /*boolean*/ () && (_activeslot._audiokey /*String*/ ).equals("") == false) { 
if (true) return (long) (__c.Max(-1,_getaudiobykey(_activeslot._audiokey /*String*/ )._position /*long*/ ()));};
 };
 //BA.debugLineNum = 2102;BA.debugLine="Return -1";
if (true) return (long) (-1);
 //BA.debugLineNum = 2103;BA.debugLine="End Sub";
return 0L;
}
public String  _activetrackidforwatchdog() throws Exception{
b4a.example.playbackplayerslot _activeslot = null;
 //BA.debugLineNum = 2089;BA.debugLine="Private Sub ActiveTrackIdForWatchdog As String";
 //BA.debugLineNum = 2090;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2091;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = _directorstate._getactiveslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2092;BA.debugLine="If activeSlot.IsInitialized And activeSlot.HasIt";
if (_activeslot.IsInitialized /*boolean*/ () && _activeslot._hasitem /*boolean*/ ()) { 
if (true) return BA.ObjectToString(_activeslot._item /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));};
 };
 //BA.debugLineNum = 2094;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 2095;BA.debugLine="End Sub";
return "";
}
public String  _addprotectedtrackid(anywheresoftware.b4a.objects.collections.Map _protectedids,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _trackid = "";
 //BA.debugLineNum = 1128;BA.debugLine="Private Sub AddProtectedTrackId(protectedIds As Ma";
 //BA.debugLineNum = 1129;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1130;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
 //BA.debugLineNum = 1131;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 1132;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 1133;BA.debugLine="protectedIds.Put(trackId, True)";
_protectedids.Put((Object)(_trackid),(Object)(__c.True));
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _advanceplaybackattransitionboundary(String _reason) throws Exception{
ResumableSub_AdvancePlaybackAtTransitionBoundary rsub = new ResumableSub_AdvancePlaybackAtTransitionBoundary(this,_reason);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AdvancePlaybackAtTransitionBoundary extends BA.ResumableSub {
public ResumableSub_AdvancePlaybackAtTransitionBoundary(b4a.example.b4xmainpage parent,String _reason) {
this.parent = parent;
this._reason = _reason;
}
b4a.example.b4xmainpage parent;
String _reason;
boolean _immediatehandled = false;
boolean _dispatched = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1982;BA.debugLine="If CanAdvancePlaybackNow(reason, True) = False Th";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._canadvanceplaybacknow(_reason,parent.__c.True)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1983;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._transition_getdirectoractiveaudiokey()).equals("")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1984;BA.debugLine="ResetPlaybackWatchdogState";
parent._resetplaybackwatchdogstate();
 //BA.debugLineNum = 1985;BA.debugLine="SetPlaybackFlowState(FLOW_TRANSITIONING, reason)";
parent._setplaybackflowstate(parent._flow_transitioning,_reason);
 //BA.debugLineNum = 1986;BA.debugLine="FinalizeActiveItemAtTransitionBoundary(reason)";
parent._finalizeactiveitemattransitionboundary(_reason);
 //BA.debugLineNum = 1987;BA.debugLine="If ShouldApplyPendingAppUpdateBeforeNextTrack The";
if (true) break;

case 13:
//if
this.state = 16;
if (parent._shouldapplypendingappupdatebeforenexttrack()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 1988;BA.debugLine="TraceInfo(\"update\", \"применение обновления\", \"re";
parent._traceinfo("update","применение обновления","reason=track_boundary_before_next_track target="+BA.NumberToString(parent._downloadedappupdateversion));
 //BA.debugLineNum = 1989;BA.debugLine="ShowMessage(MessageValue(\"player_reloading\"))";
parent._showmessage(parent._messagevalue("player_reloading"));
 //BA.debugLineNum = 1990;BA.debugLine="Return PlatformBridge.RequestStagedUpdateApply(a";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._platformbridge._requeststagedupdateapply /*boolean*/ (ba,parent._appupdatedir,parent._app_update_file)));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 1992;BA.debugLine="Wait For (TryRunImmediateBoundaryTransition) Comp";
parent.__c.WaitFor("complete", ba, this, parent._tryrunimmediateboundarytransition());
this.state = 23;
return;
case 23:
//C
this.state = 17;
_immediatehandled = (Boolean) result[0];
;
 //BA.debugLineNum = 1993;BA.debugLine="If immediateHandled Then Return True";
if (true) break;

case 17:
//if
this.state = 22;
if (_immediatehandled) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 1994;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(reason, True";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance(_reason,parent.__c.True));
this.state = 24;
return;
case 24:
//C
this.state = -1;
_dispatched = (Boolean) result[0];
;
 //BA.debugLineNum = 1995;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
 //BA.debugLineNum = 1996;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _immediatehandled) throws Exception{
}
public boolean  _allowregularadsattargetminute(long _targetminutetimestamp) throws Exception{
 //BA.debugLineNum = 3375;BA.debugLine="Private Sub AllowRegularAdsAtTargetMinute(targetMi";
 //BA.debugLineNum = 3376;BA.debugLine="Return playerDataCoordinator.AllowRegularAdsAtTar";
if (true) return _playerdatacoordinator._allowregularadsattargetminute /*boolean*/ (_statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (),_targetminutetimestamp);
 //BA.debugLineNum = 3377;BA.debugLine="End Sub";
return false;
}
public String  _appendhistoryrecord(String _recorddate,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _generator = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
 //BA.debugLineNum = 3674;BA.debugLine="Private Sub AppendHistoryRecord(recordDate As Stri";
 //BA.debugLineNum = 3675;BA.debugLine="If recordDate = \"\" Then Return";
if ((_recorddate).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 3676;BA.debugLine="EnsureDirectory(GetHistoryDir)";
_ensuredirectory(_gethistorydir());
 //BA.debugLineNum = 3677;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 3678;BA.debugLine="generator.Initialize(record)";
_generator.Initialize(_record);
 //BA.debugLineNum = 3679;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput(G";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = __c.File.OpenOutput(_gethistorydir(),_historyfilename(_recorddate),__c.True);
 //BA.debugLineNum = 3680;BA.debugLine="Dim writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 3681;BA.debugLine="writer.Initialize2(outStream, \"UTF8\")";
_writer.Initialize2((java.io.OutputStream)(_outstream.getObject()),"UTF8");
 //BA.debugLineNum = 3682;BA.debugLine="writer.WriteLine(generator.ToString)";
_writer.WriteLine(_generator.ToString());
 //BA.debugLineNum = 3683;BA.debugLine="writer.Close";
_writer.Close();
 //BA.debugLineNum = 3684;BA.debugLine="storage.Put(\"pending_history_count\", storage.GetD";
_storage._put /*String*/ ("pending_history_count",(Object)((double)(BA.ObjectToNumber(_storage._getdefault /*Object*/ ("pending_history_count",(Object)(0))))+1));
 //BA.debugLineNum = 3685;BA.debugLine="End Sub";
return "";
}
public String  _applyclientrequestheaders(b4a.example.httpjob _j) throws Exception{
 //BA.debugLineNum = 3023;BA.debugLine="Private Sub ApplyClientRequestHeaders(j As HttpJob";
 //BA.debugLineNum = 3024;BA.debugLine="If j.IsInitialized = False Then Return";
if (_j.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 3025;BA.debugLine="j.GetRequest.SetHeader(CLIENT_HEADER_NAME, CLIENT";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader(_client_header_name,_client_header_value);
 //BA.debugLineNum = 3026;BA.debugLine="End Sub";
return "";
}
public String  _applyhostsnapshotifavailable() throws Exception{
anywheresoftware.b4a.objects.collections.Map _publishedstate = null;
 //BA.debugLineNum = 5281;BA.debugLine="Private Sub ApplyHostSnapshotIfAvailable";
 //BA.debugLineNum = 5283;BA.debugLine="Dim publishedState As Map = ServiceGetPublishedSt";
_publishedstate = new anywheresoftware.b4a.objects.collections.Map();
_publishedstate = _servicegetpublishedstate();
 //BA.debugLineNum = 5284;BA.debugLine="ApplyPublishedHostState(publishedState)";
_applypublishedhoststate(_publishedstate);
 //BA.debugLineNum = 5286;BA.debugLine="End Sub";
return "";
}
public String  _applypublishedhoststate(anywheresoftware.b4a.objects.collections.Map _publishedstate) throws Exception{
anywheresoftware.b4a.objects.collections.Map _snapshot = null;
String _snapshotstreamtext = "";
String _snapshotinfotext = "";
anywheresoftware.b4a.objects.collections.Map _runtimestatesnapshot = null;
 //BA.debugLineNum = 5288;BA.debugLine="Private Sub ApplyPublishedHostState(publishedState";
 //BA.debugLineNum = 5289;BA.debugLine="If publishedState.IsInitialized = False Or publis";
if (_publishedstate.IsInitialized()==__c.False || _publishedstate.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 5290;BA.debugLine="Dim snapshot As Map = publishedState.GetDefault(\"";
_snapshot = new anywheresoftware.b4a.objects.collections.Map();
_snapshot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_publishedstate.GetDefault((Object)("snapshot"),__c.Null)));
 //BA.debugLineNum = 5291;BA.debugLine="If snapshot.IsInitialized = False Or snapshot.Siz";
if (_snapshot.IsInitialized()==__c.False || _snapshot.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 5292;BA.debugLine="appScreenMode = snapshot.GetDefault(\"screen_mode\"";
_appscreenmode = BA.ObjectToString(_snapshot.GetDefault((Object)("screen_mode"),(Object)(_appscreenmode)));
 //BA.debugLineNum = 5293;BA.debugLine="If snapshot.GetDefault(\"header_text\", \"\") <> \"\" T";
if ((_snapshot.GetDefault((Object)("header_text"),(Object)(""))).equals((Object)("")) == false) { 
_lblheader.setText(BA.ObjectToCharSequence(_snapshot.GetDefault((Object)("header_text"),(Object)(""))));};
 //BA.debugLineNum = 5294;BA.debugLine="Dim snapshotStreamText As String = snapshot.GetDe";
_snapshotstreamtext = BA.ObjectToString(_snapshot.GetDefault((Object)("stream_text"),(Object)("")));
 //BA.debugLineNum = 5295;BA.debugLine="If snapshotStreamText <> \"\" Or lblStream.Text = \"";
if ((_snapshotstreamtext).equals("") == false || (_lblstream.getText()).equals("")) { 
_lblstream.setText(BA.ObjectToCharSequence(_snapshot.GetDefault((Object)("stream_text"),(Object)(_lblstream.getText()))));};
 //BA.debugLineNum = 5296;BA.debugLine="Dim snapshotInfoText As String = snapshot.GetDefa";
_snapshotinfotext = BA.ObjectToString(_snapshot.GetDefault((Object)("info_text"),(Object)("")));
 //BA.debugLineNum = 5297;BA.debugLine="If snapshotInfoText <> \"\" Or lblInfo.Text = \"\" Th";
if ((_snapshotinfotext).equals("") == false || (_lblinfo.getText()).equals("")) { 
_lblinfo.setText(BA.ObjectToCharSequence(_snapshot.GetDefault((Object)("info_text"),(Object)(_lblinfo.getText()))));};
 //BA.debugLineNum = 5298;BA.debugLine="lblPlayIcon.Text = snapshot.GetDefault(\"play_icon";
_lblplayicon.setText(BA.ObjectToCharSequence(_snapshot.GetDefault((Object)("play_icon_text"),(Object)(_lblplayicon.getText()))));
 //BA.debugLineNum = 5299;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 5300;BA.debugLine="uiController.UpdateVisibleMode(appScreenMode)";
_uicontroller._updatevisiblemode /*String*/ (_appscreenmode);
 //BA.debugLineNum = 5301;BA.debugLine="uiController.ShowStream(lblStream.Text)";
_uicontroller._showstream /*String*/ (_lblstream.getText());
 //BA.debugLineNum = 5302;BA.debugLine="uiController.ShowMessage(lblInfo.Text)";
_uicontroller._showmessage /*String*/ (_lblinfo.getText());
 //BA.debugLineNum = 5303;BA.debugLine="uiController.UpdateConnectionIndicator(snapshot.";
_uicontroller._updateconnectionindicator /*String*/ (BA.ObjectToString(_snapshot.GetDefault((Object)("connection_mode"),(Object)("online"))));
 };
 //BA.debugLineNum = 5305;BA.debugLine="If snapshot.GetDefault(\"play_icon_text\", ICON_PLA";
if ((_snapshot.GetDefault((Object)("play_icon_text"),(Object)(_icon_play))).equals((Object)(_icon_stop))) { 
 //BA.debugLineNum = 5306;BA.debugLine="SetStopIcon";
_setstopicon();
 }else {
 //BA.debugLineNum = 5308;BA.debugLine="SetPlayIcon";
_setplayicon();
 };
 //BA.debugLineNum = 5310;BA.debugLine="Dim runtimeStateSnapshot As Map = publishedState.";
_runtimestatesnapshot = new anywheresoftware.b4a.objects.collections.Map();
_runtimestatesnapshot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_publishedstate.GetDefault((Object)("runtime_state"),__c.Null)));
 //BA.debugLineNum = 5311;BA.debugLine="If runtimeStateSnapshot.IsInitialized And runtime";
if (_runtimestatesnapshot.IsInitialized() && _runtimestatesnapshot.getSize()>0) { 
 //BA.debugLineNum = 5312;BA.debugLine="playbackFlowState = runtimeStateSnapshot.GetDefa";
_playbackflowstate = BA.ObjectToString(_runtimestatesnapshot.GetDefault((Object)("flow_state"),(Object)(_playbackflowstate)));
 //BA.debugLineNum = 5313;BA.debugLine="appScreenMode = runtimeStateSnapshot.GetDefault(";
_appscreenmode = BA.ObjectToString(_runtimestatesnapshot.GetDefault((Object)("screen_mode"),(Object)(_appscreenmode)));
 //BA.debugLineNum = 5314;BA.debugLine="isStartupSequenceInProgress = runtimeStateSnapsh";
_isstartupsequenceinprogress = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("startup_in_progress"),(Object)(_isstartupsequenceinprogress)));
 //BA.debugLineNum = 5315;BA.debugLine="orchestrationState.IsStarted = runtimeStateSnaps";
_orchestrationstate._isstarted /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("is_started"),(Object)(_orchestrationstate._isstarted /*boolean*/ )));
 //BA.debugLineNum = 5316;BA.debugLine="orchestrationState.IsStoppedByUser = runtimeStat";
_orchestrationstate._isstoppedbyuser /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("is_stopped_by_user"),(Object)(_orchestrationstate._isstoppedbyuser /*boolean*/ )));
 //BA.debugLineNum = 5317;BA.debugLine="orchestrationState.IsStopping = runtimeStateSnap";
_orchestrationstate._isstopping /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("is_stopping"),(Object)(_orchestrationstate._isstopping /*boolean*/ )));
 //BA.debugLineNum = 5318;BA.debugLine="orchestrationState.PrefetchDone = runtimeStateSn";
_orchestrationstate._prefetchdone /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("prefetch_done"),(Object)(_orchestrationstate._prefetchdone /*boolean*/ )));
 //BA.debugLineNum = 5319;BA.debugLine="orchestrationState.IsCrossfadeTriggered = runtim";
_orchestrationstate._iscrossfadetriggered /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("is_crossfade_triggered"),(Object)(_orchestrationstate._iscrossfadetriggered /*boolean*/ )));
 //BA.debugLineNum = 5320;BA.debugLine="dataPolicyState.HasLocalMediaFallback = runtimeS";
_datapolicystate._haslocalmediafallback /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("has_local_media_fallback"),(Object)(_datapolicystate._haslocalmediafallback /*boolean*/ )));
 //BA.debugLineNum = 5321;BA.debugLine="dataPolicyState.IsPlaybackPausedByPolicy = runti";
_datapolicystate._isplaybackpausedbypolicy /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("policy_paused"),(Object)(_datapolicystate._isplaybackpausedbypolicy /*boolean*/ )));
 //BA.debugLineNum = 5322;BA.debugLine="dataPolicyState.ResumePlaybackWhenServerAllows =";
_datapolicystate._resumeplaybackwhenserverallows /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("resume_when_server_allows"),(Object)(_datapolicystate._resumeplaybackwhenserverallows /*boolean*/ )));
 //BA.debugLineNum = 5323;BA.debugLine="dataPolicyState.IsOfflineDataRefreshInProgress =";
_datapolicystate._isofflinedatarefreshinprogress /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("offline_data_refresh_in_progress"),(Object)(_datapolicystate._isofflinedatarefreshinprogress /*boolean*/ )));
 //BA.debugLineNum = 5324;BA.debugLine="dataPolicyState.IsTrackCacheRefreshInProgress =";
_datapolicystate._istrackcacherefreshinprogress /*boolean*/  = BA.ObjectToBoolean(_runtimestatesnapshot.GetDefault((Object)("track_cache_refresh_in_progress"),(Object)(_datapolicystate._istrackcacherefreshinprogress /*boolean*/ )));
 };
 //BA.debugLineNum = 5326;BA.debugLine="End Sub";
return "";
}
public String  _applystoppedstate() throws Exception{
 //BA.debugLineNum = 4491;BA.debugLine="Private Sub ApplyStoppedState";
 //BA.debugLineNum = 4492;BA.debugLine="If uiControllerReady = False Then";
if (_uicontrollerready==__c.False) { 
 //BA.debugLineNum = 4493;BA.debugLine="lblStream.Text = MessageValue(\"idle_stream\")";
_lblstream.setText(BA.ObjectToCharSequence(_messagevalue("idle_stream")));
 //BA.debugLineNum = 4494;BA.debugLine="lblInfo.Text = \"\"";
_lblinfo.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 4495;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4496;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4498;BA.debugLine="uiController.ApplyStoppedState(MessageValue(\"idle";
_uicontroller._applystoppedstate /*String*/ (_messagevalue("idle_stream"));
 //BA.debugLineNum = 4499;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4500;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_complete(String _audiokey) throws Exception{
 //BA.debugLineNum = 3926;BA.debugLine="Public Sub AudioPlayer_Complete(audioKey As String";
 //BA.debugLineNum = 3927;BA.debugLine="HandleAudioCompleteAsync(audioKey)";
_handleaudiocompleteasync(_audiokey);
 //BA.debugLineNum = 3928;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_error(String _audiokey,String _message) throws Exception{
 //BA.debugLineNum = 3922;BA.debugLine="Public Sub AudioPlayer_Error(audioKey As String, m";
 //BA.debugLineNum = 3923;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": audio";
_handleaudioerrorasync(__c.createMap(new Object[] {(Object)("audioKey"),(Object)(_audiokey),(Object)("message"),(Object)(_message)}));
 //BA.debugLineNum = 3924;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_ready(String _audiokey) throws Exception{
 //BA.debugLineNum = 3918;BA.debugLine="Public Sub AudioPlayer_Ready(audioKey As String)";
 //BA.debugLineNum = 3919;BA.debugLine="HandleAudioReady(audioKey)";
_handleaudioready(_audiokey);
 //BA.debugLineNum = 3920;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_timeupdate(String _audiokey) throws Exception{
 //BA.debugLineNum = 3930;BA.debugLine="Public Sub AudioPlayer_Timeupdate(audioKey As Stri";
 //BA.debugLineNum = 3931;BA.debugLine="HandleAudioTimeupdateAsync(audioKey)";
_handleaudiotimeupdateasync(_audiokey);
 //BA.debugLineNum = 3932;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_complete() throws Exception{
 //BA.debugLineNum = 3902;BA.debugLine="Private Sub AudioPrimary_Complete";
 //BA.debugLineNum = 3903;BA.debugLine="HandleAudioCompleteAsync(\"primary\")";
_handleaudiocompleteasync("primary");
 //BA.debugLineNum = 3904;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_error(String _message) throws Exception{
 //BA.debugLineNum = 3894;BA.debugLine="Private Sub AudioPrimary_Error(message As String)";
 //BA.debugLineNum = 3895;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": \"prim";
_handleaudioerrorasync(__c.createMap(new Object[] {(Object)("audioKey"),(Object)("primary"),(Object)("message"),(Object)(_message)}));
 //BA.debugLineNum = 3896;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_ready() throws Exception{
 //BA.debugLineNum = 3886;BA.debugLine="Private Sub AudioPrimary_Ready";
 //BA.debugLineNum = 3887;BA.debugLine="HandleAudioReady(\"primary\")";
_handleaudioready("primary");
 //BA.debugLineNum = 3888;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_timeupdate() throws Exception{
 //BA.debugLineNum = 3910;BA.debugLine="Private Sub AudioPrimary_Timeupdate";
 //BA.debugLineNum = 3911;BA.debugLine="HandleAudioTimeupdateAsync(\"primary\")";
_handleaudiotimeupdateasync("primary");
 //BA.debugLineNum = 3912;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_complete() throws Exception{
 //BA.debugLineNum = 3906;BA.debugLine="Private Sub AudioSecondary_Complete";
 //BA.debugLineNum = 3907;BA.debugLine="HandleAudioCompleteAsync(\"secondary\")";
_handleaudiocompleteasync("secondary");
 //BA.debugLineNum = 3908;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_error(String _message) throws Exception{
 //BA.debugLineNum = 3898;BA.debugLine="Private Sub AudioSecondary_Error(message As String";
 //BA.debugLineNum = 3899;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": \"seco";
_handleaudioerrorasync(__c.createMap(new Object[] {(Object)("audioKey"),(Object)("secondary"),(Object)("message"),(Object)(_message)}));
 //BA.debugLineNum = 3900;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_ready() throws Exception{
 //BA.debugLineNum = 3890;BA.debugLine="Private Sub AudioSecondary_Ready";
 //BA.debugLineNum = 3891;BA.debugLine="HandleAudioReady(\"secondary\")";
_handleaudioready("secondary");
 //BA.debugLineNum = 3892;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_timeupdate() throws Exception{
 //BA.debugLineNum = 3914;BA.debugLine="Private Sub AudioSecondary_Timeupdate";
 //BA.debugLineNum = 3915;BA.debugLine="HandleAudioTimeupdateAsync(\"secondary\")";
_handleaudiotimeupdateasync("secondary");
 //BA.debugLineNum = 3916;BA.debugLine="End Sub";
return "";
}
public String  _autoresumeaftercachewarmup() throws Exception{
 //BA.debugLineNum = 1574;BA.debugLine="Public Sub AutoResumeAfterCacheWarmup";
 //BA.debugLineNum = 1575;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1576;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (_orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
if (true) return "";};
 //BA.debugLineNum = 1577;BA.debugLine="If orchestrationState.IsStopping Then Return";
if (_orchestrationstate._isstopping /*boolean*/ ) { 
if (true) return "";};
 //BA.debugLineNum = 1578;BA.debugLine="If IsPolicyPauseState Then Return";
if (_ispolicypausestate()) { 
if (true) return "";};
 //BA.debugLineNum = 1579;BA.debugLine="If playbackFlowState <> FLOW_IDLE Then Return";
if ((_playbackflowstate).equals(_flow_idle) == false) { 
if (true) return "";};
 //BA.debugLineNum = 1580;BA.debugLine="If stateStore.HasAnyCachedTrack = False Then Retu";
if (_statestore._hasanycachedtrack /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1581;BA.debugLine="TraceLog(\"autocache resume trigger mode=auto\")";
_tracelog("autocache resume trigger mode=auto");
 //BA.debugLineNum = 1582;BA.debugLine="RequestAutoStartCommand";
_requestautostartcommand();
 //BA.debugLineNum = 1583;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _autostartsavedplayer() throws Exception{
ResumableSub_AutoStartSavedPlayer rsub = new ResumableSub_AutoStartSavedPlayer(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AutoStartSavedPlayer extends BA.ResumableSub {
public ResumableSub_AutoStartSavedPlayer(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unusedoffline = false;
boolean _refreshed = false;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1388;BA.debugLine="If playerCode = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._playercode).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1389;BA.debugLine="If orchestrationState.IsStarted Or orchestrationS";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._orchestrationstate._isstarted /*boolean*/  || parent._orchestrationstate._isstopping /*boolean*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1390;BA.debugLine="If TryEnterStartupSequence = False Then Return Fa";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._tryenterstartupsequence()==parent.__c.False) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 1391;BA.debugLine="SetStopIcon";
parent._setstopicon();
 //BA.debugLineNum = 1392;BA.debugLine="ShowMessage(MessageValue(\"connecting\"))";
parent._showmessage(parent._messagevalue("connecting"));
 //BA.debugLineNum = 1393;BA.debugLine="UpdateConnectionIndicator(\"connecting\")";
parent._updateconnectionindicator("connecting");
 //BA.debugLineNum = 1394;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (true) break;

case 19:
//if
this.state = 22;
if (parent._local_playback_only) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 1395;BA.debugLine="orchestrationState.EnterStartedState";
parent._orchestrationstate._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 1396;BA.debugLine="dataPolicyState.ClearPolicyPause";
parent._datapolicystate._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 1397;BA.debugLine="SetStopIcon";
parent._setstopicon();
 //BA.debugLineNum = 1398;BA.debugLine="HideContentBlocks";
parent._hidecontentblocks();
 //BA.debugLineNum = 1399;BA.debugLine="ShowMessage(MessageValue(\"syncing\"))";
parent._showmessage(parent._messagevalue("syncing"));
 //BA.debugLineNum = 1400;BA.debugLine="TraceLog(\"автостарт local only\")";
parent._tracelog("автостарт local only");
 //BA.debugLineNum = 1401;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unu";
parent.__c.WaitFor("complete", ba, this, parent._startfirsttrack("auto"));
this.state = 45;
return;
case 45:
//C
this.state = 22;
_unusedoffline = (Boolean) result[0];
;
 //BA.debugLineNum = 1402;BA.debugLine="CompleteStartupSequence";
parent._completestartupsequence();
 //BA.debugLineNum = 1403;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 1405;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 22:
//if
this.state = 40;
if (parent._use_data_playback_resolver) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 1406;BA.debugLine="TraceLog(\"автостарт сначала обновление данных\")";
parent._tracelog("автостарт сначала обновление данных");
 //BA.debugLineNum = 1407;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refre";
parent.__c.WaitFor("complete", ba, this, parent._refreshofflinedatanow());
this.state = 46;
return;
case 46:
//C
this.state = 25;
_refreshed = (Boolean) result[0];
;
 //BA.debugLineNum = 1408;BA.debugLine="If refreshed = False Then";
if (true) break;

case 25:
//if
this.state = 39;
if (_refreshed==parent.__c.False) { 
this.state = 27;
}else {
this.state = 38;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 1409;BA.debugLine="If dataPolicyState.LastOfflineDataRefreshState";
if (true) break;

case 28:
//if
this.state = 31;
if ((parent._datapolicystate._lastofflinedatarefreshstate /*String*/ ).equals("message")) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 1410;BA.debugLine="TraceLog(\"автостарт stop reason=server_message";
parent._tracelog("автостарт stop reason=server_message");
 //BA.debugLineNum = 1411;BA.debugLine="FailStartupSequence(\"server_message\")";
parent._failstartupsequence("server_message");
 //BA.debugLineNum = 1412;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 1414;BA.debugLine="If HasLocalPlaybackFallback Then";

case 31:
//if
this.state = 36;
if (parent._haslocalplaybackfallback()) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 //BA.debugLineNum = 1415;BA.debugLine="playerDataCoordinator.ActivateLocalFallback(Fa";
parent._playerdatacoordinator._activatelocalfallback /*String*/ (parent.__c.False,"startup_local");
 //BA.debugLineNum = 1416;BA.debugLine="TraceLog(\"автостарт fallback reason=fresh_data";
parent._tracelog("автостарт fallback reason=fresh_data_unavailable");
 if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 1418;BA.debugLine="TraceLog(\"автостарт ошибка reason=no_local_que";
parent._tracelog("автостарт ошибка reason=no_local_queue");
 //BA.debugLineNum = 1419;BA.debugLine="HandleLocalTemporaryState(\"\")";
parent._handlelocaltemporarystate("");
 //BA.debugLineNum = 1420;BA.debugLine="FailStartupSequence(\"no_local_fallback\")";
parent._failstartupsequence("no_local_fallback");
 //BA.debugLineNum = 1421;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 36:
//C
this.state = 39;
;
 if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 1424;BA.debugLine="UpdateConnectionIndicator(\"online\")";
parent._updateconnectionindicator("online");
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 //BA.debugLineNum = 1427;BA.debugLine="ShowMessage(MessageValue(\"syncing\"))";
parent._showmessage(parent._messagevalue("syncing"));
 //BA.debugLineNum = 1428;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";
if (true) break;

case 41:
//if
this.state = 44;
if (parent._isplaybackallowedbycurrentdata()==parent.__c.False) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 1429;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReason";
parent._pauseplaybackbypolicy(parent._resolveplaybackblockreason(parent._statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ()),"server");
 //BA.debugLineNum = 1430;BA.debugLine="FailStartupSequence(\"playback_not_allowed\")";
parent._failstartupsequence("playback_not_allowed");
 //BA.debugLineNum = 1431;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 44:
//C
this.state = -1;
;
 //BA.debugLineNum = 1433;BA.debugLine="orchestrationState.EnterStartedState";
parent._orchestrationstate._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 1434;BA.debugLine="dataPolicyState.ClearPolicyPause";
parent._datapolicystate._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 1435;BA.debugLine="SetStopIcon";
parent._setstopicon();
 //BA.debugLineNum = 1436;BA.debugLine="HideContentBlocks";
parent._hidecontentblocks();
 //BA.debugLineNum = 1437;BA.debugLine="TraceLog(\"автостарт воспроизведение начало\")";
parent._tracelog("автостарт воспроизведение начало");
 //BA.debugLineNum = 1438;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, this, parent._startfirsttrack("auto"));
this.state = 47;
return;
case 47:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1439;BA.debugLine="CompleteStartupSequence";
parent._completestartupsequence();
 //BA.debugLineNum = 1440;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1441;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 274;BA.debugLine="If ServiceHasAttachedPage = False Then ServiceOnP";
if (_servicehasattachedpage()==__c.False) { 
_serviceonpageappear();};
 //BA.debugLineNum = 275;BA.debugLine="ApplyHostSnapshotIfAvailable";
_applyhostsnapshotifavailable();
 //BA.debugLineNum = 276;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Private Sub B4XPage_Created (root1 As B4XView)";
 //BA.debugLineNum = 238;BA.debugLine="rootView = root1";
_rootview = _root1;
 //BA.debugLineNum = 239;BA.debugLine="B4XPages.SetTitle(Me, AppInfo.LabelName)";
_b4xpages._settitle /*String*/ (ba,this,(Object)(_appinfo._labelname /*String*/ ));
 //BA.debugLineNum = 240;BA.debugLine="rootView.Color = 0xFF0E0F11";
_rootview.setColor(((int)0xff0e0f11));
 //BA.debugLineNum = 241;BA.debugLine="InitSettings";
_initsettings();
 //BA.debugLineNum = 242;BA.debugLine="InitState";
_initstate();
 //BA.debugLineNum = 243;BA.debugLine="BuildUi";
_buildui();
 //BA.debugLineNum = 244;BA.debugLine="uiController.Initialize(xui, lblStream, lblInfo,";
_uicontroller._initialize /*String*/ (ba,_xui,_lblstream,_lblinfo,_lblheader,_lblconnectionicon,_lblheaderaction,_lblsetupmessage,_lblplayicon,_confirmpane,_btnconfirmyes,_btnconfirmno,_setuppane,_playerpane,_headeractionpane,_playbuttonpane,_orbitpane,_accesscirclepane,_accesscorepane,_accessinputpane,_btnsetupsubmit,_txtplayercode,_txtplayercodeview,_icon_cloud_ok,_icon_cloud_off,_icon_cloud_degraded,_icon_more,_icon_close,_icon_play,_icon_stop);
 //BA.debugLineNum = 245;BA.debugLine="uiControllerReady = True";
_uicontrollerready = __c.True;
 //BA.debugLineNum = 246;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
_layoutui(_rootview.getWidth(),_rootview.getHeight());
 //BA.debugLineNum = 247;BA.debugLine="ApplyHostSnapshotIfAvailable";
_applyhostsnapshotifavailable();
 //BA.debugLineNum = 248;BA.debugLine="UpdateVisibleMode";
_updatevisiblemode();
 //BA.debugLineNum = 249;BA.debugLine="RestoreWindowState";
_restorewindowstate();
 //BA.debugLineNum = 250;BA.debugLine="audioPrimary.Initialize(\"AudioPrimary\", Me)";
_audioprimary._initialize /*String*/ (ba,"AudioPrimary",this);
 //BA.debugLineNum = 251;BA.debugLine="audioSecondary.Initialize(\"AudioSecondary\", Me)";
_audiosecondary._initialize /*String*/ (ba,"AudioSecondary",this);
 //BA.debugLineNum = 253;BA.debugLine="autoCacheManager.Initialize(storage, offlineStore";
_autocachemanager._initialize /*String*/ (ba,_storage,_offlinestoreservice,_dataresolver,_mediacacheservice,this,"TraceLog");
 //BA.debugLineNum = 254;BA.debugLine="autoCacheManager.Configure(30000, 8, 4, 2, 2)";
_autocachemanager._configure /*String*/ ((int) (30000),(int) (8),(int) (4),(int) (2),(int) (2));
 //BA.debugLineNum = 255;BA.debugLine="autoCacheManager.SetCooldowns(15000, 120000, 6000";
_autocachemanager._setcooldowns /*String*/ ((long) (15000),(long) (120000),(long) (60000));
 //BA.debugLineNum = 256;BA.debugLine="autoCacheManager.Start";
_autocachemanager._start /*String*/ ();
 //BA.debugLineNum = 258;BA.debugLine="TraceInfo(\"app\", \"запуск\", \"version=\" & ResolveAp";
_traceinfo("app","запуск","version="+_resolveappversion()+" player="+_formatplayercodefordisplay(_playercode));
 //BA.debugLineNum = 259;BA.debugLine="TraceInfo(\"system\", \"устройство\", \"name=\" & Resol";
_traceinfo("system","устройство","name="+_resolvedevicetracename()+" id="+_deviceid);
 //BA.debugLineNum = 260;BA.debugLine="TraceInfo(\"system\", \"платформа\", \"os=\" & ResolveC";
_traceinfo("system","платформа","os="+_resolveclientplatformtext());
 //BA.debugLineNum = 261;BA.debugLine="TraceInfo(\"system\", \"диск\", \"diskFreeMb=\" & Resol";
_traceinfo("system","диск","diskFreeMb="+_resolvefreediskmbtext()+" diskTotalMb="+_resolvetotaldiskmbtext());
 //BA.debugLineNum = 262;BA.debugLine="WriteHealthSnapshot(\"запуск\")";
_writehealthsnapshot("запуск");
 //BA.debugLineNum = 263;BA.debugLine="StartOfflineDataRefresh";
_startofflinedatarefresh();
 //BA.debugLineNum = 264;BA.debugLine="ShowInitialScreen";
_showinitialscreen();
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 280;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 282;BA.debugLine="ServiceOnPageDisappear";
_serviceonpagedisappear();
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Private Sub B4XPage_Resize (width As Int, height A";
 //BA.debugLineNum = 268;BA.debugLine="If card.IsInitialized = False Then Return";
if (_card.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 269;BA.debugLine="LayoutUi(width, height)";
_layoutui(_width,_height);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public String  _breaktimer_tick() throws Exception{
 //BA.debugLineNum = 3471;BA.debugLine="Private Sub BreakTimer_Tick";
 //BA.debugLineNum = 3479;BA.debugLine="Host_BreakTimerTick";
_host_breaktimertick();
 //BA.debugLineNum = 3481;BA.debugLine="End Sub";
return "";
}
public String  _bringtofront(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
 //BA.debugLineNum = 4478;BA.debugLine="Private Sub BringToFront(view As B4XView)";
 //BA.debugLineNum = 4479;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 4480;BA.debugLine="uiController.BringToFront(view)";
_uicontroller._bringtofront /*String*/ (_view);
 //BA.debugLineNum = 4481;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4484;BA.debugLine="view.BringToFront";
_view.BringToFront();
 //BA.debugLineNum = 4489;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_click() throws Exception{
 //BA.debugLineNum = 1653;BA.debugLine="Private Sub BtnConfirmNo_Click";
 //BA.debugLineNum = 1654;BA.debugLine="ExecuteClaimConfirmNoCommand";
_executeclaimconfirmnocommand();
 //BA.debugLineNum = 1655;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseentered(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1657;BA.debugLine="Private Sub BtnConfirmNo_MouseEntered (eventData A";
 //BA.debugLineNum = 1658;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, True)";
_updatetextbuttonappearance(_btnconfirmno,__c.True);
 //BA.debugLineNum = 1659;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseexited(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1661;BA.debugLine="Private Sub BtnConfirmNo_MouseExited (eventData As";
 //BA.debugLineNum = 1662;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
_updatetextbuttonappearance(_btnconfirmno,__c.False);
 //BA.debugLineNum = 1663;BA.debugLine="End Sub";
return "";
}
public void  _btnconfirmyes_click() throws Exception{
ResumableSub_BtnConfirmYes_Click rsub = new ResumableSub_BtnConfirmYes_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BtnConfirmYes_Click extends BA.ResumableSub {
public ResumableSub_BtnConfirmYes_Click(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1642;BA.debugLine="Wait For (ExecuteClaimConfirmYesCommand) Complete";
parent.__c.WaitFor("complete", ba, this, parent._executeclaimconfirmyescommand());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1643;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnconfirmyes_mouseentered(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1645;BA.debugLine="Private Sub BtnConfirmYes_MouseEntered (eventData";
 //BA.debugLineNum = 1646;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, True)";
_updatetextbuttonappearance(_btnconfirmyes,__c.True);
 //BA.debugLineNum = 1647;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmyes_mouseexited(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1649;BA.debugLine="Private Sub BtnConfirmYes_MouseExited (eventData A";
 //BA.debugLineNum = 1650;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
_updatetextbuttonappearance(_btnconfirmyes,__c.False);
 //BA.debugLineNum = 1651;BA.debugLine="End Sub";
return "";
}
public void  _btnsetupsubmit_click() throws Exception{
ResumableSub_BtnSetupSubmit_Click rsub = new ResumableSub_BtnSetupSubmit_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BtnSetupSubmit_Click extends BA.ResumableSub {
public ResumableSub_BtnSetupSubmit_Click(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1630;BA.debugLine="Wait For (ExecuteSetupSubmitCommand) Complete (un";
parent.__c.WaitFor("complete", ba, this, parent._executesetupsubmitcommand());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1631;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsetupsubmit_mouseentered(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1633;BA.debugLine="Private Sub BtnSetupSubmit_MouseEntered (eventData";
 //BA.debugLineNum = 1634;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, True)";
_updatetextbuttonappearance(_btnsetupsubmit,__c.True);
 //BA.debugLineNum = 1635;BA.debugLine="End Sub";
return "";
}
public String  _btnsetupsubmit_mouseexited(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1637;BA.debugLine="Private Sub BtnSetupSubmit_MouseExited (eventData";
 //BA.debugLineNum = 1638;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
_updatetextbuttonappearance(_btnsetupsubmit,__c.False);
 //BA.debugLineNum = 1639;BA.debugLine="End Sub";
return "";
}
public String  _buildaudiotracedetails(anywheresoftware.b4a.objects.collections.Map _item,String _basedetails) throws Exception{
String _details = "";
 //BA.debugLineNum = 4618;BA.debugLine="Private Sub BuildAudioTraceDetails(item As Map, ba";
 //BA.debugLineNum = 4619;BA.debugLine="Dim details As String = baseDetails";
_details = _basedetails;
 //BA.debugLineNum = 4620;BA.debugLine="If item.IsInitialized = False Then Return details";
if (_item.IsInitialized()==__c.False) { 
if (true) return _details;};
 //BA.debugLineNum = 4621;BA.debugLine="details = details & \" volume=\" & NumberFormat2(Cu";
_details = _details+" volume="+__c.NumberFormat2(_currentvolume(_item),(int) (1),(int) (3),(int) (3),__c.False);
 //BA.debugLineNum = 4622;BA.debugLine="details = details & \" gainDb=\" & NumberFormat2(Re";
_details = _details+" gainDb="+__c.NumberFormat2(_resolveitemgaindb(_item),(int) (1),(int) (1),(int) (1),__c.False);
 //BA.debugLineNum = 4623;BA.debugLine="details = details & \" gainApplied=\" & IIf(item.Co";
_details = _details+" gainApplied="+BA.ObjectToString(((_item.ContainsKey((Object)("gain"))) ? ((Object)("yes")) : ((Object)("default"))));
 //BA.debugLineNum = 4624;BA.debugLine="Return details";
if (true) return _details;
 //BA.debugLineNum = 4625;BA.debugLine="End Sub";
return "";
}
public String  _buildhealthaudiotracedetails() throws Exception{
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
 //BA.debugLineNum = 4627;BA.debugLine="Private Sub BuildHealthAudioTraceDetails As String";
 //BA.debugLineNum = 4628;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = _transition_getdirectoractiveitem();
 //BA.debugLineNum = 4629;BA.debugLine="If activeItem.IsInitialized = False Then Return \"";
if (_activeitem.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4630;BA.debugLine="Return \" volume=\" & NumberFormat2(CurrentVolume(a";
if (true) return " volume="+__c.NumberFormat2(_currentvolume(_activeitem),(int) (1),(int) (3),(int) (3),__c.False)+" gainDb="+__c.NumberFormat2(_resolveitemgaindb(_activeitem),(int) (1),(int) (1),(int) (1),__c.False)+" gainApplied="+BA.ObjectToString(((_activeitem.ContainsKey((Object)("gain"))) ? ((Object)("yes")) : ((Object)("default"))));
 //BA.debugLineNum = 4633;BA.debugLine="End Sub";
return "";
}
public String  _buildparams(anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
 //BA.debugLineNum = 4795;BA.debugLine="Private Sub BuildParams(params As Map) As String";
 //BA.debugLineNum = 4796;BA.debugLine="Return syncService.BuildParams(params)";
if (true) return _syncservice._buildparams /*String*/ (_params);
 //BA.debugLineNum = 4797;BA.debugLine="End Sub";
return "";
}
public String  _buildplannedendtracedetails(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
long _durationms = 0L;
long _plannedendticks = 0L;
 //BA.debugLineNum = 3270;BA.debugLine="Private Sub BuildPlannedEndTraceDetails(audioKey A";
 //BA.debugLineNum = 3271;BA.debugLine="Dim durationMs As Long = ResolvePlannedDurationMs";
_durationms = _resolveplanneddurationms(_audiokey,_item);
 //BA.debugLineNum = 3272;BA.debugLine="If durationMs <= 0 Then Return \"\"";
if (_durationms<=0) { 
if (true) return "";};
 //BA.debugLineNum = 3273;BA.debugLine="Dim plannedEndTicks As Long = DateTime.Now + dura";
_plannedendticks = (long) (__c.DateTime.getNow()+_durationms);
 //BA.debugLineNum = 3274;BA.debugLine="Return \"durationMs=\" & durationMs & \" plannedEnd=";
if (true) return "durationMs="+BA.NumberToString(_durationms)+" plannedEnd="+_formattickstimefortrace(_plannedendticks);
 //BA.debugLineNum = 3275;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _buildpublishedhoststate() throws Exception{
anywheresoftware.b4a.objects.collections.Map _publishedstate = null;
anywheresoftware.b4a.objects.collections.Map _snapshot = null;
anywheresoftware.b4a.objects.collections.Map _runtimestatesnapshot = null;
 //BA.debugLineNum = 5223;BA.debugLine="Private Sub BuildPublishedHostState As Map";
 //BA.debugLineNum = 5224;BA.debugLine="Dim publishedState As Map";
_publishedstate = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5225;BA.debugLine="Dim snapshot As Map";
_snapshot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5226;BA.debugLine="Dim runtimeStateSnapshot As Map";
_runtimestatesnapshot = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5227;BA.debugLine="publishedState.Initialize";
_publishedstate.Initialize();
 //BA.debugLineNum = 5228;BA.debugLine="snapshot.Initialize";
_snapshot.Initialize();
 //BA.debugLineNum = 5229;BA.debugLine="runtimeStateSnapshot.Initialize";
_runtimestatesnapshot.Initialize();
 //BA.debugLineNum = 5230;BA.debugLine="snapshot.Put(\"screen_mode\", appScreenMode)";
_snapshot.Put((Object)("screen_mode"),(Object)(_appscreenmode));
 //BA.debugLineNum = 5231;BA.debugLine="snapshot.Put(\"stream_text\", lblStream.Text)";
_snapshot.Put((Object)("stream_text"),(Object)(_lblstream.getText()));
 //BA.debugLineNum = 5232;BA.debugLine="snapshot.Put(\"info_text\", lblInfo.Text)";
_snapshot.Put((Object)("info_text"),(Object)(_lblinfo.getText()));
 //BA.debugLineNum = 5233;BA.debugLine="snapshot.Put(\"header_text\", lblHeader.Text)";
_snapshot.Put((Object)("header_text"),(Object)(_lblheader.getText()));
 //BA.debugLineNum = 5234;BA.debugLine="snapshot.Put(\"play_icon_text\", lblPlayIcon.Text)";
_snapshot.Put((Object)("play_icon_text"),(Object)(_lblplayicon.getText()));
 //BA.debugLineNum = 5235;BA.debugLine="snapshot.Put(\"player_code\", FormatPlayerCodeForDi";
_snapshot.Put((Object)("player_code"),(Object)(_formatplayercodefordisplay(_playercode)));
 //BA.debugLineNum = 5236;BA.debugLine="snapshot.Put(\"is_started\", orchestrationState.IsS";
_snapshot.Put((Object)("is_started"),(Object)(_orchestrationstate._isstarted /*boolean*/ ));
 //BA.debugLineNum = 5237;BA.debugLine="snapshot.Put(\"is_stopped_by_user\", orchestrationS";
_snapshot.Put((Object)("is_stopped_by_user"),(Object)(_orchestrationstate._isstoppedbyuser /*boolean*/ ));
 //BA.debugLineNum = 5238;BA.debugLine="snapshot.Put(\"flow_state\", playbackFlowState)";
_snapshot.Put((Object)("flow_state"),(Object)(_playbackflowstate));
 //BA.debugLineNum = 5239;BA.debugLine="snapshot.Put(\"connection_mode\", ResolveConnection";
_snapshot.Put((Object)("connection_mode"),(Object)(_resolveconnectionindicatormode()));
 //BA.debugLineNum = 5240;BA.debugLine="snapshot.Put(\"cache_status\", ResolveCacheHealthSt";
_snapshot.Put((Object)("cache_status"),(Object)(_resolvecachehealthstatustext()));
 //BA.debugLineNum = 5241;BA.debugLine="snapshot.Put(\"media_type\", metaState.CurrentMedia";
_snapshot.Put((Object)("media_type"),(Object)(_metastate._currentmediatype /*String*/ ));
 //BA.debugLineNum = 5242;BA.debugLine="snapshot.Put(\"current_track_trace\", ResolveCurren";
_snapshot.Put((Object)("current_track_trace"),(Object)(_resolvecurrenttracktracevalue()));
 //BA.debugLineNum = 5243;BA.debugLine="snapshot.Put(\"queue_size\", playQueue.Size)";
_snapshot.Put((Object)("queue_size"),(Object)(_playqueue.getSize()));
 //BA.debugLineNum = 5244;BA.debugLine="snapshot.Put(\"startup_in_progress\", isStartupSequ";
_snapshot.Put((Object)("startup_in_progress"),(Object)(_isstartupsequenceinprogress));
 //BA.debugLineNum = 5245;BA.debugLine="runtimeStateSnapshot.Put(\"flow_state\", playbackFl";
_runtimestatesnapshot.Put((Object)("flow_state"),(Object)(_playbackflowstate));
 //BA.debugLineNum = 5246;BA.debugLine="runtimeStateSnapshot.Put(\"screen_mode\", appScreen";
_runtimestatesnapshot.Put((Object)("screen_mode"),(Object)(_appscreenmode));
 //BA.debugLineNum = 5247;BA.debugLine="runtimeStateSnapshot.Put(\"is_started\", orchestrat";
_runtimestatesnapshot.Put((Object)("is_started"),(Object)(_orchestrationstate._isstarted /*boolean*/ ));
 //BA.debugLineNum = 5248;BA.debugLine="runtimeStateSnapshot.Put(\"is_stopped_by_user\", or";
_runtimestatesnapshot.Put((Object)("is_stopped_by_user"),(Object)(_orchestrationstate._isstoppedbyuser /*boolean*/ ));
 //BA.debugLineNum = 5249;BA.debugLine="runtimeStateSnapshot.Put(\"is_stopping\", orchestra";
_runtimestatesnapshot.Put((Object)("is_stopping"),(Object)(_orchestrationstate._isstopping /*boolean*/ ));
 //BA.debugLineNum = 5250;BA.debugLine="runtimeStateSnapshot.Put(\"prefetch_done\", orchest";
_runtimestatesnapshot.Put((Object)("prefetch_done"),(Object)(_orchestrationstate._prefetchdone /*boolean*/ ));
 //BA.debugLineNum = 5251;BA.debugLine="runtimeStateSnapshot.Put(\"is_crossfade_triggered\"";
_runtimestatesnapshot.Put((Object)("is_crossfade_triggered"),(Object)(_orchestrationstate._iscrossfadetriggered /*boolean*/ ));
 //BA.debugLineNum = 5252;BA.debugLine="runtimeStateSnapshot.Put(\"startup_in_progress\", i";
_runtimestatesnapshot.Put((Object)("startup_in_progress"),(Object)(_isstartupsequenceinprogress));
 //BA.debugLineNum = 5253;BA.debugLine="runtimeStateSnapshot.Put(\"has_local_media_fallbac";
_runtimestatesnapshot.Put((Object)("has_local_media_fallback"),(Object)(_datapolicystate._haslocalmediafallback /*boolean*/ ));
 //BA.debugLineNum = 5254;BA.debugLine="runtimeStateSnapshot.Put(\"policy_paused\", dataPol";
_runtimestatesnapshot.Put((Object)("policy_paused"),(Object)(_datapolicystate._isplaybackpausedbypolicy /*boolean*/ ));
 //BA.debugLineNum = 5255;BA.debugLine="runtimeStateSnapshot.Put(\"resume_when_server_allo";
_runtimestatesnapshot.Put((Object)("resume_when_server_allows"),(Object)(_datapolicystate._resumeplaybackwhenserverallows /*boolean*/ ));
 //BA.debugLineNum = 5256;BA.debugLine="runtimeStateSnapshot.Put(\"offline_data_refresh_in";
_runtimestatesnapshot.Put((Object)("offline_data_refresh_in_progress"),(Object)(_datapolicystate._isofflinedatarefreshinprogress /*boolean*/ ));
 //BA.debugLineNum = 5257;BA.debugLine="runtimeStateSnapshot.Put(\"track_cache_refresh_in_";
_runtimestatesnapshot.Put((Object)("track_cache_refresh_in_progress"),(Object)(_datapolicystate._istrackcacherefreshinprogress /*boolean*/ ));
 //BA.debugLineNum = 5258;BA.debugLine="runtimeStateSnapshot.Put(\"connection_mode\", Resol";
_runtimestatesnapshot.Put((Object)("connection_mode"),(Object)(_resolveconnectionindicatormode()));
 //BA.debugLineNum = 5259;BA.debugLine="runtimeStateSnapshot.Put(\"cache_status\", ResolveC";
_runtimestatesnapshot.Put((Object)("cache_status"),(Object)(_resolvecachehealthstatustext()));
 //BA.debugLineNum = 5260;BA.debugLine="runtimeStateSnapshot.Put(\"current_track_trace\", R";
_runtimestatesnapshot.Put((Object)("current_track_trace"),(Object)(_resolvecurrenttracktracevalue()));
 //BA.debugLineNum = 5261;BA.debugLine="runtimeStateSnapshot.Put(\"media_type\", metaState.";
_runtimestatesnapshot.Put((Object)("media_type"),(Object)(_metastate._currentmediatype /*String*/ ));
 //BA.debugLineNum = 5262;BA.debugLine="runtimeStateSnapshot.Put(\"queue_size\", playQueue.";
_runtimestatesnapshot.Put((Object)("queue_size"),(Object)(_playqueue.getSize()));
 //BA.debugLineNum = 5263;BA.debugLine="publishedState.Put(\"snapshot\", snapshot)";
_publishedstate.Put((Object)("snapshot"),(Object)(_snapshot.getObject()));
 //BA.debugLineNum = 5264;BA.debugLine="publishedState.Put(\"runtime_state\", runtimeStateS";
_publishedstate.Put((Object)("runtime_state"),(Object)(_runtimestatesnapshot.getObject()));
 //BA.debugLineNum = 5265;BA.debugLine="Return publishedState";
if (true) return _publishedstate;
 //BA.debugLineNum = 5266;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _playercodeinput = null;
 //BA.debugLineNum = 645;BA.debugLine="Private Sub BuildUi";
 //BA.debugLineNum = 646;BA.debugLine="card = xui.CreatePanel(\"\")";
_card = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 647;BA.debugLine="headerPane = xui.CreatePanel(\"\")";
_headerpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 648;BA.debugLine="headerActionPane = xui.CreatePanel(\"HeaderActionP";
_headeractionpane = _xui.CreatePanel(ba,"HeaderActionPane");
 //BA.debugLineNum = 649;BA.debugLine="contentPane = xui.CreatePanel(\"\")";
_contentpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 650;BA.debugLine="footerPane = xui.CreatePanel(\"\")";
_footerpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 651;BA.debugLine="setupPane = xui.CreatePanel(\"\")";
_setuppane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 652;BA.debugLine="playerPane = xui.CreatePanel(\"\")";
_playerpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 653;BA.debugLine="setupHeroPane = xui.CreatePanel(\"\")";
_setupheropane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 654;BA.debugLine="setupDetailPane = xui.CreatePanel(\"\")";
_setupdetailpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 655;BA.debugLine="setupPrimaryPane = xui.CreatePanel(\"\")";
_setupprimarypane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 656;BA.debugLine="setupStatusPane = xui.CreatePanel(\"\")";
_setupstatuspane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 657;BA.debugLine="playerHeroPane = xui.CreatePanel(\"\")";
_playerheropane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 658;BA.debugLine="playerDetailPane = xui.CreatePanel(\"\")";
_playerdetailpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 659;BA.debugLine="playerPrimaryPane = xui.CreatePanel(\"\")";
_playerprimarypane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 660;BA.debugLine="playerStatusPane = xui.CreatePanel(\"\")";
_playerstatuspane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 661;BA.debugLine="orbitPane = xui.CreatePanel(\"\")";
_orbitpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 662;BA.debugLine="playButtonPane = xui.CreatePanel(\"PlayButtonPane\"";
_playbuttonpane = _xui.CreatePanel(ba,"PlayButtonPane");
 //BA.debugLineNum = 663;BA.debugLine="confirmPane = xui.CreatePanel(\"\")";
_confirmpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 664;BA.debugLine="accessCirclePane = xui.CreatePanel(\"\")";
_accesscirclepane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 665;BA.debugLine="accessCorePane = xui.CreatePanel(\"\")";
_accesscorepane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 666;BA.debugLine="accessInputPane = xui.CreatePanel(\"\")";
_accessinputpane = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 668;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
_card.SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),__c.DipToCurrent((int) (24)));
 //BA.debugLineNum = 669;BA.debugLine="accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4d";
_accesscirclepane.SetColorAndBorder(((int)0x07ffffff),__c.DipToCurrent((int) (4)),((int)0x55ffffff),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 670;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
_accesscorepane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66ffffff),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 671;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
_accessinputpane.SetColorAndBorder(_xui.Color_Transparent,(int) (0),_xui.Color_Transparent,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 672;BA.debugLine="playButtonPane.SetColorAndBorder(xui.Color_Transp";
_playbuttonpane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (4)),((int)0x33ffffff),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 673;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
_orbitpane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 674;BA.debugLine="headerActionPane.SetColorAndBorder(xui.Color_Tran";
_headeractionpane.SetColorAndBorder(_xui.Color_Transparent,(int) (0),_xui.Color_Transparent,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 676;BA.debugLine="lblHeader = CreateLabel(\"\", 12, 0xFF747B86, False";
_lblheader = _createlabel("",(float) (12),((int)0xff747b86),__c.False,__c.True);
 //BA.debugLineNum = 677;BA.debugLine="lblHeaderAction = CreateLabel(ICON_MORE, 22, 0xFF";
_lblheaderaction = _createlabel(_icon_more,(float) (22),((int)0xffb9c0c9),__c.False,__c.False);
 //BA.debugLineNum = 678;BA.debugLine="lblPlayIcon = CreateLabel(ICON_PLAY, 48, 0xFFD0FF";
_lblplayicon = _createlabel(_icon_play,(float) (48),((int)0xffd0ff71),__c.False,__c.False);
 //BA.debugLineNum = 679;BA.debugLine="lblStream = CreateLabel(\"\", 36, 0xFFD0FF71, True,";
_lblstream = _createlabel("",(float) (36),((int)0xffd0ff71),__c.True,__c.True);
 //BA.debugLineNum = 680;BA.debugLine="lblInfo = CreateLabel(\"\", 17, 0xFFBCC3CD, False,";
_lblinfo = _createlabel("",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
 //BA.debugLineNum = 681;BA.debugLine="lblFooter = CreateLabel(AppInfo.LabelName & \" \" &";
_lblfooter = _createlabel(_appinfo._labelname /*String*/ +" "+_resolveappversion(),(float) (12),((int)0xff747b86),__c.False,__c.True);
 //BA.debugLineNum = 682;BA.debugLine="lblConnectionIcon = CreateLabel(ICON_CLOUD_OK, 16";
_lblconnectionicon = _createlabel(_icon_cloud_ok,(float) (16),((int)0xff747b86),__c.False,__c.False);
 //BA.debugLineNum = 683;BA.debugLine="lblSetupMessage = CreateLabel(\"\", 17, 0xFFBCC3CD,";
_lblsetupmessage = _createlabel("",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
 //BA.debugLineNum = 690;BA.debugLine="Dim playerCodeInput As EditText";
_playercodeinput = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 691;BA.debugLine="playerCodeInput.Initialize(\"txtPlayerCode\")";
_playercodeinput.Initialize(ba,"txtPlayerCode");
 //BA.debugLineNum = 692;BA.debugLine="txtPlayerCode = playerCodeInput";
_txtplayercode = _playercodeinput;
 //BA.debugLineNum = 694;BA.debugLine="txtPlayerCodeView = txtPlayerCode";
_txtplayercodeview = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtplayercode.getObject()));
 //BA.debugLineNum = 695;BA.debugLine="btnSetupSubmit = CreateTextButton(MessageValue(\"s";
_btnsetupsubmit = _createtextbutton(_messagevalue("setup_submit"),"BtnSetupSubmit");
 //BA.debugLineNum = 696;BA.debugLine="btnConfirmYes = CreateTextButton(MessageValue(\"de";
_btnconfirmyes = _createtextbutton(_messagevalue("device_confirm_yes"),"BtnConfirmYes");
 //BA.debugLineNum = 697;BA.debugLine="btnConfirmNo = CreateTextButton(MessageValue(\"dev";
_btnconfirmno = _createtextbutton(_messagevalue("device_confirm_no"),"BtnConfirmNo");
 //BA.debugLineNum = 698;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
_updatetextbuttonappearance(_btnsetupsubmit,__c.False);
 //BA.debugLineNum = 699;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
_updatetextbuttonappearance(_btnconfirmyes,__c.False);
 //BA.debugLineNum = 700;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
_updatetextbuttonappearance(_btnconfirmno,__c.False);
 //BA.debugLineNum = 702;BA.debugLine="rootView.AddView(card, 0, 0, 0, 0)";
_rootview.AddView((android.view.View)(_card.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 703;BA.debugLine="card.AddView(headerPane, 0, 0, 0, 0)";
_card.AddView((android.view.View)(_headerpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 704;BA.debugLine="card.AddView(contentPane, 0, 0, 0, 0)";
_card.AddView((android.view.View)(_contentpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 705;BA.debugLine="card.AddView(footerPane, 0, 0, 0, 0)";
_card.AddView((android.view.View)(_footerpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 706;BA.debugLine="headerPane.AddView(lblHeader, 0, 0, 0, 0)";
_headerpane.AddView((android.view.View)(_lblheader.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 707;BA.debugLine="headerPane.AddView(headerActionPane, 0, 0, 0, 0)";
_headerpane.AddView((android.view.View)(_headeractionpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 708;BA.debugLine="headerActionPane.AddView(lblHeaderAction, 0, 0, 0";
_headeractionpane.AddView((android.view.View)(_lblheaderaction.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 709;BA.debugLine="contentPane.AddView(setupPane, 0, 0, 0, 0)";
_contentpane.AddView((android.view.View)(_setuppane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 710;BA.debugLine="contentPane.AddView(playerPane, 0, 0, 0, 0)";
_contentpane.AddView((android.view.View)(_playerpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 711;BA.debugLine="footerPane.AddView(lblFooter, 0, 0, 0, 0)";
_footerpane.AddView((android.view.View)(_lblfooter.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 712;BA.debugLine="footerPane.AddView(lblConnectionIcon, 0, 0, 0, 0)";
_footerpane.AddView((android.view.View)(_lblconnectionicon.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 714;BA.debugLine="setupPane.AddView(setupHeroPane, 0, 0, 0, 0)";
_setuppane.AddView((android.view.View)(_setupheropane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 715;BA.debugLine="setupPane.AddView(setupDetailPane, 0, 0, 0, 0)";
_setuppane.AddView((android.view.View)(_setupdetailpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 716;BA.debugLine="setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)";
_setupheropane.AddView((android.view.View)(_accesscorepane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 717;BA.debugLine="setupHeroPane.AddView(accessCirclePane, 0, 0, 0,";
_setupheropane.AddView((android.view.View)(_accesscirclepane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 718;BA.debugLine="accessCirclePane.AddView(accessInputPane, 0, 0, 0";
_accesscirclepane.AddView((android.view.View)(_accessinputpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 719;BA.debugLine="accessInputPane.AddView(txtPlayerCodeView, 0, 0,";
_accessinputpane.AddView((android.view.View)(_txtplayercodeview.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 720;BA.debugLine="setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0";
_setupdetailpane.AddView((android.view.View)(_setupprimarypane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 721;BA.debugLine="setupDetailPane.AddView(setupStatusPane, 0, 0, 0,";
_setupdetailpane.AddView((android.view.View)(_setupstatuspane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 722;BA.debugLine="setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0,";
_setupprimarypane.AddView((android.view.View)(_btnsetupsubmit.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 723;BA.debugLine="setupStatusPane.AddView(lblSetupMessage, 0, 0, 0,";
_setupstatuspane.AddView((android.view.View)(_lblsetupmessage.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 725;BA.debugLine="playerPane.AddView(playerHeroPane, 0, 0, 0, 0)";
_playerpane.AddView((android.view.View)(_playerheropane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 726;BA.debugLine="playerPane.AddView(playerDetailPane, 0, 0, 0, 0)";
_playerpane.AddView((android.view.View)(_playerdetailpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 727;BA.debugLine="playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)";
_playerheropane.AddView((android.view.View)(_orbitpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 728;BA.debugLine="playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0";
_playerheropane.AddView((android.view.View)(_playbuttonpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 729;BA.debugLine="playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)";
_playbuttonpane.AddView((android.view.View)(_lblplayicon.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 730;BA.debugLine="playerDetailPane.AddView(playerPrimaryPane, 0, 0,";
_playerdetailpane.AddView((android.view.View)(_playerprimarypane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 731;BA.debugLine="playerDetailPane.AddView(playerStatusPane, 0, 0,";
_playerdetailpane.AddView((android.view.View)(_playerstatuspane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 732;BA.debugLine="playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)";
_playerprimarypane.AddView((android.view.View)(_lblstream.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 733;BA.debugLine="playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)";
_playerstatuspane.AddView((android.view.View)(_lblinfo.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 734;BA.debugLine="playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)";
_playerstatuspane.AddView((android.view.View)(_confirmpane.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 735;BA.debugLine="confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)";
_confirmpane.AddView((android.view.View)(_btnconfirmyes.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 736;BA.debugLine="confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)";
_confirmpane.AddView((android.view.View)(_btnconfirmno.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 738;BA.debugLine="SetPaneStyle(card, \"-fx-background-radius: 24; -f";
_setpanestyle(_card,"-fx-background-radius: 24; -fx-border-radius: 24;");
 //BA.debugLineNum = 739;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
_setpanestyle(_headeractionpane,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 740;BA.debugLine="SetPaneStyle(playButtonPane, \"-fx-cursor: hand; -";
_setpanestyle(_playbuttonpane,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 741;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
_setpanestyle(_accesscirclepane,"-fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 742;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
_setpanestyle(_accesscorepane,"-fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 743;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
_setpanestyle(_accessinputpane,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
 //BA.debugLineNum = 744;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
_setpanestyle(_txtplayercodeview,"-fx-background-color: transparent; -fx-text-fill: "+_colortocss(((int)0xffddf1ff))+"; -fx-prompt-text-fill: "+_colortocss(((int)0x7affffff))+"; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;");
 //BA.debugLineNum = 745;BA.debugLine="accessCorePane.Visible = True";
_accesscorepane.setVisible(__c.True);
 //BA.debugLineNum = 746;BA.debugLine="accessCirclePane.Visible = True";
_accesscirclepane.setVisible(__c.True);
 //BA.debugLineNum = 747;BA.debugLine="accessInputPane.Visible = True";
_accessinputpane.setVisible(__c.True);
 //BA.debugLineNum = 748;BA.debugLine="SetPickOnBounds(headerActionPane, True)";
_setpickonbounds(_headeractionpane,__c.True);
 //BA.debugLineNum = 749;BA.debugLine="SetPickOnBounds(playButtonPane, True)";
_setpickonbounds(_playbuttonpane,__c.True);
 //BA.debugLineNum = 750;BA.debugLine="SetPlayerCodePromptText(MessageValue(\"setup_place";
_setplayercodeprompttext(_messagevalue("setup_placeholder").toUpperCase());
 //BA.debugLineNum = 751;BA.debugLine="txtPlayerCode.Visible = True";
_txtplayercode.setVisible(__c.True);
 //BA.debugLineNum = 752;BA.debugLine="UpdateHeaderActionAppearance(False)";
_updateheaderactionappearance(__c.False);
 //BA.debugLineNum = 753;BA.debugLine="UpdatePlayButtonAppearance(False)";
_updateplaybuttonappearance(__c.False);
 //BA.debugLineNum = 754;BA.debugLine="UpdateCodeInputAppearance(False)";
_updatecodeinputappearance(__c.False);
 //BA.debugLineNum = 755;BA.debugLine="BringToFront(accessCorePane)";
_bringtofront(_accesscorepane);
 //BA.debugLineNum = 756;BA.debugLine="BringToFront(accessCirclePane)";
_bringtofront(_accesscirclepane);
 //BA.debugLineNum = 757;BA.debugLine="BringToFront(accessInputPane)";
_bringtofront(_accessinputpane);
 //BA.debugLineNum = 758;BA.debugLine="BringToFront(txtPlayerCodeView)";
_bringtofront(_txtplayercodeview);
 //BA.debugLineNum = 760;BA.debugLine="confirmPane.Visible = False";
_confirmpane.setVisible(__c.False);
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return "";
}
public String  _cacheaudittimer_tick() throws Exception{
boolean _hasmore = false;
 //BA.debugLineNum = 1011;BA.debugLine="Private Sub CacheAuditTimer_Tick";
 //BA.debugLineNum = 1012;BA.debugLine="DisableCacheAuditTimer";
_disablecacheaudittimer();
 //BA.debugLineNum = 1013;BA.debugLine="If isStartupSequenceInProgress Then";
if (_isstartupsequenceinprogress) { 
 //BA.debugLineNum = 1014;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_START_DELAY_";
_schedulecacheauditafter(_cache_audit_start_delay_ms);
 //BA.debugLineNum = 1015;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1017;BA.debugLine="If playbackFlowState <> FLOW_IDLE Then";
if ((_playbackflowstate).equals(_flow_idle) == false) { 
 //BA.debugLineNum = 1018;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_RECHECK_INTE";
_schedulecacheauditafter(_cache_audit_recheck_interval_ms);
 //BA.debugLineNum = 1019;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1021;BA.debugLine="If ShouldDeferCacheWorkerForPlaybackUi Then";
if (_shoulddefercacheworkerforplaybackui()) { 
 //BA.debugLineNum = 1022;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_STEP_INTERVA";
_schedulecacheauditafter(_cache_audit_step_interval_ms);
 //BA.debugLineNum = 1023;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1025;BA.debugLine="If mediaCacheService.IsCacheAuditInProgress = Fal";
if (_mediacacheservice._iscacheauditinprogress /*boolean*/ ()==__c.False) { 
_mediacacheservice._startcacheaudit /*String*/ ();};
 //BA.debugLineNum = 1026;BA.debugLine="Dim hasMore As Boolean = mediaCacheService.RunCac";
_hasmore = _mediacacheservice._runcacheauditstep /*boolean*/ ();
 //BA.debugLineNum = 1027;BA.debugLine="If hasMore Then";
if (_hasmore) { 
 //BA.debugLineNum = 1028;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_STEP_INTERVA";
_schedulecacheauditafter(_cache_audit_step_interval_ms);
 }else {
 //BA.debugLineNum = 1030;BA.debugLine="PruneTrackCacheIfNeeded(\"cache_audit\")";
_prunetrackcacheifneeded("cache_audit");
 //BA.debugLineNum = 1031;BA.debugLine="WriteSystemSnapshot(\"cache_worker\")";
_writesystemsnapshot("cache_worker");
 //BA.debugLineNum = 1032;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_RECHECK_INTE";
_schedulecacheauditafter(_cache_audit_recheck_interval_ms);
 };
 //BA.debugLineNum = 1034;BA.debugLine="End Sub";
return "";
}
public boolean  _canadvanceplaybacknow(String _initiator,boolean _logdecision) throws Exception{
 //BA.debugLineNum = 2262;BA.debugLine="Private Sub CanAdvancePlaybackNow(initiator As Str";
 //BA.debugLineNum = 2263;BA.debugLine="If orchestrationState.IsStoppedByUser Then";
if (_orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
 //BA.debugLineNum = 2264;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
_tracelog("guard переход запрет initiator="+_initiator+" reason=stopped_by_user");};
 //BA.debugLineNum = 2265;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2267;BA.debugLine="If orchestrationState.IsStopping Then";
if (_orchestrationstate._isstopping /*boolean*/ ) { 
 //BA.debugLineNum = 2268;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
_tracelog("guard переход запрет initiator="+_initiator+" reason=stopping");};
 //BA.debugLineNum = 2269;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2271;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2272;BA.debugLine="If directorState.FlowState = FLOW_STOPPING Then";
if ((_directorstate._flowstate /*String*/ ).equals(_flow_stopping)) { 
 //BA.debugLineNum = 2273;BA.debugLine="If logDecision Then TraceLog(\"guard переход зап";
if (_logdecision) { 
_tracelog("guard переход запрет initiator="+_initiator+" reason=flow_stopping");};
 //BA.debugLineNum = 2274;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2276;BA.debugLine="If directorState.FlowState = FLOW_PAUSED_POLICY";
if ((_directorstate._flowstate /*String*/ ).equals(_flow_paused_policy)) { 
 //BA.debugLineNum = 2277;BA.debugLine="If logDecision Then TraceLog(\"guard переход зап";
if (_logdecision) { 
_tracelog("guard переход запрет initiator="+_initiator+" reason=flow_paused_policy");};
 //BA.debugLineNum = 2278;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 //BA.debugLineNum = 2281;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then";
if ((_playbackflowstate).equals(_flow_stopping)) { 
 //BA.debugLineNum = 2282;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
_tracelog("guard переход запрет initiator="+_initiator+" reason=flow_stopping");};
 //BA.debugLineNum = 2283;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2285;BA.debugLine="If playbackFlowState = FLOW_PAUSED_POLICY Then";
if ((_playbackflowstate).equals(_flow_paused_policy)) { 
 //BA.debugLineNum = 2286;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
_tracelog("guard переход запрет initiator="+_initiator+" reason=flow_paused_policy");};
 //BA.debugLineNum = 2287;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2289;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2290;BA.debugLine="End Sub";
return false;
}
public boolean  _canapplypendingappupdatenow() throws Exception{
 //BA.debugLineNum = 520;BA.debugLine="Private Sub CanApplyPendingAppUpdateNow As Boolean";
 //BA.debugLineNum = 521;BA.debugLine="If playbackFlowState = FLOW_IDLE Then Return True";
if ((_playbackflowstate).equals(_flow_idle)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 522;BA.debugLine="If playbackFlowState = FLOW_PAUSED_POLICY Then Re";
if ((_playbackflowstate).equals(_flow_paused_policy)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 523;BA.debugLine="If playbackFlowState = FLOW_ERROR Then Return Tru";
if ((_playbackflowstate).equals(_flow_error)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 524;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (_orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
if (true) return __c.True;};
 //BA.debugLineNum = 525;BA.debugLine="If IsPlaybackFlowActive = False Then Return True";
if (_isplaybackflowactive()==__c.False) { 
if (true) return __c.True;};
 //BA.debugLineNum = 526;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return false;
}
public String  _canceldeferredpoststarttasks() throws Exception{
 //BA.debugLineNum = 1148;BA.debugLine="Private Sub CancelDeferredPostStartTasks";
 //BA.debugLineNum = 1149;BA.debugLine="If isAdWarmupDeferredAfterStartup = False And isP";
if (_isadwarmupdeferredafterstartup==__c.False && _ispoststarttasksdeferredafterstartup==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1150;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
_isadwarmupdeferredafterstartup = __c.False;
 //BA.debugLineNum = 1151;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
_ispoststarttasksdeferredafterstartup = __c.False;
 //BA.debugLineNum = 1152;BA.debugLine="End Sub";
return "";
}
public boolean  _cancrossfadeprepareditem() throws Exception{
 //BA.debugLineNum = 2736;BA.debugLine="Private Sub CanCrossfadePreparedItem As Boolean";
 //BA.debugLineNum = 2737;BA.debugLine="If ShouldBlockMusicTransitionForExactBreak Then R";
if (_shouldblockmusictransitionforexactbreak()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2738;BA.debugLine="Return transitionCoordinator.CanCrossfadePrepared";
if (true) return _transitioncoordinator._cancrossfadeprepareditem /*boolean*/ (_runtimestate,_metastate,_orchestrationstate,_isplaybacktransitioninprogress());
 //BA.debugLineNum = 2739;BA.debugLine="End Sub";
return false;
}
public boolean  _canprefetchnextnow(boolean _logdecision) throws Exception{
 //BA.debugLineNum = 2412;BA.debugLine="Private Sub CanPrefetchNextNow(logDecision As Bool";
 //BA.debugLineNum = 2413;BA.debugLine="If orchestrationState.PrefetchDone Then";
if (_orchestrationstate._prefetchdone /*boolean*/ ) { 
 //BA.debugLineNum = 2414;BA.debugLine="If logDecision Then TraceLog(\"guard prefetch зап";
if (_logdecision) { 
_tracelog("guard prefetch запрет reason=already_done");};
 //BA.debugLineNum = 2415;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2417;BA.debugLine="If ShouldBlockMusicTransitionForExactBreak Then";
if (_shouldblockmusictransitionforexactbreak()) { 
 //BA.debugLineNum = 2418;BA.debugLine="If logDecision Then TraceLog(\"guard prefetch зап";
if (_logdecision) { 
_tracelog("guard prefetch запрет reason=exact_break_pending");};
 //BA.debugLineNum = 2419;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2421;BA.debugLine="Return CanPrepareNextPlayableNow(logDecision)";
if (true) return _canpreparenextplayablenow(_logdecision);
 //BA.debugLineNum = 2422;BA.debugLine="End Sub";
return false;
}
public boolean  _canpreparenextplayablenow(boolean _logdecision) throws Exception{
 //BA.debugLineNum = 2388;BA.debugLine="Private Sub CanPrepareNextPlayableNow(logDecision";
 //BA.debugLineNum = 2389;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2390;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
_tracelog("guard подготовка запрет reason=not_started");};
 //BA.debugLineNum = 2391;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2393;BA.debugLine="If Transition_GetPlaybackFlowState <> FLOW_PLAYIN";
if ((_transition_getplaybackflowstate()).equals(_flow_playing) == false) { 
 //BA.debugLineNum = 2394;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
_tracelog("guard подготовка запрет reason=flow_"+_transition_getplaybackflowstate());};
 //BA.debugLineNum = 2395;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2397;BA.debugLine="If directorState.IsInitialized And directorState.";
if (_directorstate.IsInitialized /*boolean*/ () && (_directorstate._currentdecision /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2398;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
_tracelog("guard подготовка запрет reason=decision_busy active="+_directorstate._currentdecision /*String*/ );};
 //BA.debugLineNum = 2399;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2401;BA.debugLine="If runtimeState.PendingPlayAudioKey <> \"\" Then";
if ((_runtimestate._pendingplayaudiokey /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2402;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
_tracelog("guard подготовка запрет reason=pending_play audio="+_runtimestate._pendingplayaudiokey /*String*/ );};
 //BA.debugLineNum = 2403;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2405;BA.debugLine="If runtimeState.PendingPrepareAudioKey <> \"\" Then";
if ((_runtimestate._pendingprepareaudiokey /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2406;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
_tracelog("guard подготовка запрет reason=pending_prepare audio="+_runtimestate._pendingprepareaudiokey /*String*/ );};
 //BA.debugLineNum = 2407;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2409;BA.debugLine="Return CanAdvancePlaybackNow(\"prepare_next\", logD";
if (true) return _canadvanceplaybacknow("prepare_next",_logdecision);
 //BA.debugLineNum = 2410;BA.debugLine="End Sub";
return false;
}
public boolean  _canresumeplaybacknow(String _reason,boolean _logdecision) throws Exception{
 //BA.debugLineNum = 2309;BA.debugLine="Private Sub CanResumePlaybackNow(reason As String,";
 //BA.debugLineNum = 2310;BA.debugLine="If IsUserStoppedState Then";
if (_isuserstoppedstate()) { 
 //BA.debugLineNum = 2311;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
_tracelog("возобновление запрет reason="+_reason+" state=user_stopped");};
 //BA.debugLineNum = 2312;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2314;BA.debugLine="If orchestrationState.IsStopping Then";
if (_orchestrationstate._isstopping /*boolean*/ ) { 
 //BA.debugLineNum = 2315;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
_tracelog("возобновление запрет reason="+_reason+" state=stopping");};
 //BA.debugLineNum = 2316;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2318;BA.debugLine="If IsPolicyPauseState Then";
if (_ispolicypausestate()) { 
 //BA.debugLineNum = 2319;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
_tracelog("возобновление запрет reason="+_reason+" state=policy_pause");};
 //BA.debugLineNum = 2320;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2322;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2323;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
_tracelog("возобновление запрет reason="+_reason+" state=not_started");};
 //BA.debugLineNum = 2324;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2326;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2327;BA.debugLine="End Sub";
return false;
}
public boolean  _canrundeferredpoststarttasks() throws Exception{
 //BA.debugLineNum = 1158;BA.debugLine="Private Sub CanRunDeferredPostStartTasks As Boolea";
 //BA.debugLineNum = 1159;BA.debugLine="If isStartupSequenceInProgress Then";
if (_isstartupsequenceinprogress) { 
 //BA.debugLineNum = 1160;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 1162;BA.debugLine="If orchestrationState.IsStopping Or orchestration";
if (_orchestrationstate._isstopping /*boolean*/  || _orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
 //BA.debugLineNum = 1163;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 1165;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1166;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 1168;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail() throws Exception{
 //BA.debugLineNum = 2741;BA.debugLine="Private Sub CanStartPreparedOnTrackTail As Boolean";
 //BA.debugLineNum = 2742;BA.debugLine="Return transitionCoordinator.CanStartPreparedOnTr";
if (true) return _transitioncoordinator._canstartpreparedontracktail /*boolean*/ (_runtimestate,_metastate,_orchestrationstate,_isplaybacktransitioninprogress());
 //BA.debugLineNum = 2743;BA.debugLine="End Sub";
return false;
}
public boolean  _canstopplaybacknow(boolean _logdecision) throws Exception{
 //BA.debugLineNum = 2301;BA.debugLine="Private Sub CanStopPlaybackNow(logDecision As Bool";
 //BA.debugLineNum = 2302;BA.debugLine="If orchestrationState.IsStopping Then";
if (_orchestrationstate._isstopping /*boolean*/ ) { 
 //BA.debugLineNum = 2303;BA.debugLine="If logDecision Then TraceLog(\"stop skip reason=a";
if (_logdecision) { 
_tracelog("stop skip reason=already_stopping");};
 //BA.debugLineNum = 2304;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2306;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2307;BA.debugLine="End Sub";
return false;
}
public boolean  _canuseprepareditemnow() throws Exception{
 //BA.debugLineNum = 2424;BA.debugLine="Private Sub CanUsePreparedItemNow As Boolean";
 //BA.debugLineNum = 2425;BA.debugLine="If ShouldTriggerBreakNow Then Return False";
if (_shouldtriggerbreaknow()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2426;BA.debugLine="Return HasUsablePreparedItem And CanAdvancePlayba";
if (true) return _hasusableprepareditem() && _canadvanceplaybacknow("prepared_item",__c.False);
 //BA.debugLineNum = 2427;BA.debugLine="End Sub";
return false;
}
public String  _checkforappupdate(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
int _serverversion = 0;
 //BA.debugLineNum = 343;BA.debugLine="Private Sub CheckForAppUpdate(data As Map)";
 //BA.debugLineNum = 344;BA.debugLine="If data.IsInitialized = False Then Return";
if (_data.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 345;BA.debugLine="Dim serverVersion As Int = Floor(ToLongDefault(da";
_serverversion = (int) (__c.Floor(_tolongdefault(_data.GetDefault((Object)("version"),(Object)(_appinfo._versioncode /*int*/ )),(long) (_appinfo._versioncode /*int*/ ))));
 //BA.debugLineNum = 346;BA.debugLine="If serverVersion <= AppInfo.VersionCode Then Retu";
if (_serverversion<=_appinfo._versioncode /*int*/ ) { 
if (true) return "";};
 //BA.debugLineNum = 347;BA.debugLine="ClearFailedAppUpdateVersionIfNewer(serverVersion)";
_clearfailedappupdateversionifnewer(_serverversion);
 //BA.debugLineNum = 348;BA.debugLine="If serverVersion > pendingAppUpdateVersion Then p";
if (_serverversion>_pendingappupdateversion) { 
_pendingappupdateversion = _serverversion;};
 //BA.debugLineNum = 349;BA.debugLine="If downloadedAppUpdateVersion >= serverVersion Th";
if (_downloadedappupdateversion>=_serverversion) { 
 //BA.debugLineNum = 350;BA.debugLine="TryApplyPendingAppUpdate(\"already_downloaded\")";
_tryapplypendingappupdate("already_downloaded");
 //BA.debugLineNum = 351;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 353;BA.debugLine="If ShouldSkipFailedAppUpdateVersion(serverVersion";
if (_shouldskipfailedappupdateversion(_serverversion)) { 
 //BA.debugLineNum = 354;BA.debugLine="TraceInfo(\"update\", \"обновление пропущено\", \"rea";
_traceinfo("update","обновление пропущено","reason=remembered_failed_version target="+BA.NumberToString(_serverversion)+" retryAfter="+BA.ObjectToString(_storage._getdefault /*Object*/ (_app_update_failed_retry_after_key,(Object)(0))));
 //BA.debugLineNum = 355;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 357;BA.debugLine="If isAppUpdateDownloadInProgress Then Return";
if (_isappupdatedownloadinprogress) { 
if (true) return "";};
 //BA.debugLineNum = 358;BA.debugLine="TraceInfo(\"update\", \"обнаружена новая версия\", \"c";
_traceinfo("update","обнаружена новая версия","current="+BA.NumberToString(_appinfo._versioncode /*int*/ )+" server="+BA.NumberToString(_serverversion));
 //BA.debugLineNum = 359;BA.debugLine="DownloadAppUpdateAsync(serverVersion)";
_downloadappupdateasync(_serverversion);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _claimurlvalue() throws Exception{
 //BA.debugLineNum = 5123;BA.debugLine="Public Sub ClaimUrlValue As String";
 //BA.debugLineNum = 5124;BA.debugLine="Return CLAIM_BASE_URL";
if (true) return _claim_base_url;
 //BA.debugLineNum = 5125;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Const NEXT_BASE_URL As String = \"https://";
_next_base_url = "https://play.fon.fm/next";
 //BA.debugLineNum = 11;BA.debugLine="Private Const CLAIM_BASE_URL As String = \"https:/";
_claim_base_url = "https://play.fon.fm/claim";
 //BA.debugLineNum = 12;BA.debugLine="Private Const HISTORY_BASE_URL As String = \"https";
_history_base_url = "https://play.fon.fm/history";
 //BA.debugLineNum = 13;BA.debugLine="Private Const TRACE_BASE_URL As String = \"https:/";
_trace_base_url = "https://play.fon.fm/trace";
 //BA.debugLineNum = 14;BA.debugLine="Private Const CLIENT_HEADER_NAME As String = \"X-F";
_client_header_name = "X-Fonfm-Client";
 //BA.debugLineNum = 15;BA.debugLine="Private Const CLIENT_HEADER_VALUE As String = \"wi";
_client_header_value = "windows-player";
 //BA.debugLineNum = 20;BA.debugLine="Private Const DATA_BASE_URL As String = \"https://";
_data_base_url = "https://play.fon.fm/data";
 //BA.debugLineNum = 21;BA.debugLine="Private Const APP_UPDATE_URL As String = \"https:/";
_app_update_url = "https://play.fon.fm/app/fonfm.jar";
 //BA.debugLineNum = 22;BA.debugLine="Private Const APP_UPDATE_FILE As String = \"_fonfm";
_app_update_file = "_fonfm.jar";
 //BA.debugLineNum = 23;BA.debugLine="Private Const APP_UPDATE_TEMP_FILE As String = \"_";
_app_update_temp_file = "_fonfm.jar.download";
 //BA.debugLineNum = 24;BA.debugLine="Private Const APP_UPDATE_RETRY_DELAY_MS As Long =";
_app_update_retry_delay_ms = (long) (60*60*1000);
 //BA.debugLineNum = 25;BA.debugLine="Private Const APP_UPDATE_FAILED_VERSION_KEY As St";
_app_update_failed_version_key = "update_failed_version";
 //BA.debugLineNum = 26;BA.debugLine="Private Const APP_UPDATE_FAILED_REASON_KEY As Str";
_app_update_failed_reason_key = "update_failed_reason";
 //BA.debugLineNum = 27;BA.debugLine="Private Const APP_UPDATE_FAILED_AT_KEY As String";
_app_update_failed_at_key = "update_failed_at";
 //BA.debugLineNum = 28;BA.debugLine="Private Const APP_UPDATE_FAILED_RETRY_AFTER_KEY A";
_app_update_failed_retry_after_key = "update_failed_retry_after";
 //BA.debugLineNum = 29;BA.debugLine="Private Const APP_UPDATE_FAILED_ATTEMPTS_KEY As S";
_app_update_failed_attempts_key = "update_failed_attempts";
 //BA.debugLineNum = 30;BA.debugLine="Private Const PLAYLIST_CDN_BASE_URL As String = \"";
_playlist_cdn_base_url = "https://cdn.fon.fm/data/playlists/";
 //BA.debugLineNum = 31;BA.debugLine="Private Const SERVICE_CHECK_URL As String = \"http";
_service_check_url = "https://play.fon.fm/data";
 //BA.debugLineNum = 32;BA.debugLine="Private Const USE_DATA_PLAYBACK_RESOLVER As Boole";
_use_data_playback_resolver = __c.True;
 //BA.debugLineNum = 33;BA.debugLine="Private Const LOCAL_PLAYBACK_ONLY As Boolean = Fa";
_local_playback_only = __c.False;
 //BA.debugLineNum = 34;BA.debugLine="Private Const ICON_PLAY As String = Chr(0xE037)";
_icon_play = BA.ObjectToString(__c.Chr(((int)0xe037)));
 //BA.debugLineNum = 35;BA.debugLine="Private Const ICON_STOP As String = Chr(0xE047)";
_icon_stop = BA.ObjectToString(__c.Chr(((int)0xe047)));
 //BA.debugLineNum = 36;BA.debugLine="Private Const ICON_MORE As String = Chr(0xE5D3)";
_icon_more = BA.ObjectToString(__c.Chr(((int)0xe5d3)));
 //BA.debugLineNum = 37;BA.debugLine="Private Const ICON_CLOSE As String = Chr(0xE5CD)";
_icon_close = BA.ObjectToString(__c.Chr(((int)0xe5cd)));
 //BA.debugLineNum = 38;BA.debugLine="Private Const ICON_CLOUD_OK As String = Chr(0xE2B";
_icon_cloud_ok = BA.ObjectToString(__c.Chr(((int)0xe2bf)));
 //BA.debugLineNum = 39;BA.debugLine="Private Const ICON_CLOUD_OFF As String = Chr(0xE2";
_icon_cloud_off = BA.ObjectToString(__c.Chr(((int)0xe2c1)));
 //BA.debugLineNum = 40;BA.debugLine="Private Const ICON_CLOUD_DEGRADED As String = Chr";
_icon_cloud_degraded = BA.ObjectToString(__c.Chr(((int)0xe2c2)));
 //BA.debugLineNum = 41;BA.debugLine="Private Const PREFETCH_SECONDS As Int = 10";
_prefetch_seconds = (int) (10);
 //BA.debugLineNum = 42;BA.debugLine="Private Const STOP_FADE_MS As Int = 4000";
_stop_fade_ms = (int) (4000);
 //BA.debugLineNum = 43;BA.debugLine="Private Const ORBIT_FADE_MS As Int = 3000";
_orbit_fade_ms = (int) (3000);
 //BA.debugLineNum = 44;BA.debugLine="Private Const START_FADE_MS As Int = 1000";
_start_fade_ms = (int) (1000);
 //BA.debugLineNum = 45;BA.debugLine="Private Const TRACK_OVERLAP_MS As Int = 1800";
_track_overlap_ms = (int) (1800);
 //BA.debugLineNum = 46;BA.debugLine="Private Const AD_TAIL_OVERLAP_MS As Int = 350";
_ad_tail_overlap_ms = (int) (350);
 //BA.debugLineNum = 47;BA.debugLine="Private Const CACHE_AUDIT_START_DELAY_MS As Int =";
_cache_audit_start_delay_ms = (int) (20000);
 //BA.debugLineNum = 48;BA.debugLine="Private Const CACHE_AUDIT_STEP_INTERVAL_MS As Int";
_cache_audit_step_interval_ms = (int) (2000);
 //BA.debugLineNum = 49;BA.debugLine="Private Const CACHE_AUDIT_RECHECK_INTERVAL_MS As";
_cache_audit_recheck_interval_ms = (int) (30*60*1000);
 //BA.debugLineNum = 50;BA.debugLine="Private Const TRACK_CACHE_PRUNE_COOLDOWN_MS As Lo";
_track_cache_prune_cooldown_ms = (long) (10*60*1000);
 //BA.debugLineNum = 54;BA.debugLine="Private Const FETCH_TIMEOUT_MS As Int = 4000";
_fetch_timeout_ms = (int) (4000);
 //BA.debugLineNum = 55;BA.debugLine="Private Const AUDIO_READY_TIMEOUT_MS As Int = 500";
_audio_ready_timeout_ms = (int) (5000);
 //BA.debugLineNum = 58;BA.debugLine="Private Const AUDIO_OUTPUT_ERROR_PAUSE_THRESHOLD";
_audio_output_error_pause_threshold = (int) (3);
 //BA.debugLineNum = 59;BA.debugLine="Private Const AUDIO_OUTPUT_RETRY_DELAY_MS As Int";
_audio_output_retry_delay_ms = (int) (15000);
 //BA.debugLineNum = 64;BA.debugLine="Private Const PLAYBACK_WATCHDOG_STALL_MS As Long";
_playback_watchdog_stall_ms = (long) (4000);
 //BA.debugLineNum = 65;BA.debugLine="Private Const PLAYBACK_WATCHDOG_RECOVERY_COOLDOWN";
_playback_watchdog_recovery_cooldown_ms = (long) (10000);
 //BA.debugLineNum = 66;BA.debugLine="Private Const PLAYBACK_WATCHDOG_PROGRESS_DELTA_MS";
_playback_watchdog_progress_delta_ms = (long) (150);
 //BA.debugLineNum = 67;BA.debugLine="Private Const PLAYBACK_WATCHDOG_GRACE_MS As Long";
_playback_watchdog_grace_ms = (long) (3000);
 //BA.debugLineNum = 68;BA.debugLine="Private Const TRACE_ERROR_DEBUG_CONTEXT_LINES As";
_trace_error_debug_context_lines = (int) (8);
 //BA.debugLineNum = 69;BA.debugLine="Private Const PAUSE_RETRY_DELAY As Int = 300000";
_pause_retry_delay = (int) (300000);
 //BA.debugLineNum = 70;BA.debugLine="Private Const LOCAL_RETRY_DELAY_INITIAL As Int =";
_local_retry_delay_initial = (int) (5000);
 //BA.debugLineNum = 71;BA.debugLine="Private Const LOCAL_RETRY_DELAY_MAX As Int = 3000";
_local_retry_delay_max = (int) (30000);
 //BA.debugLineNum = 72;BA.debugLine="Private Const SERVER_RETRY_DELAY_INITIAL As Int =";
_server_retry_delay_initial = (int) (10000);
 //BA.debugLineNum = 73;BA.debugLine="Private Const SERVER_RETRY_DELAY_MAX As Int = 600";
_server_retry_delay_max = (int) (60000);
 //BA.debugLineNum = 74;BA.debugLine="Private Const BLOCKED_RETRY_DELAY As Int = 60000";
_blocked_retry_delay = (int) (60000);
 //BA.debugLineNum = 75;BA.debugLine="Private Const FLOW_IDLE As String = \"idle\"";
_flow_idle = "idle";
 //BA.debugLineNum = 76;BA.debugLine="Private Const FLOW_STARTING As String = \"starting";
_flow_starting = "starting";
 //BA.debugLineNum = 77;BA.debugLine="Private Const FLOW_PLAYING As String = \"playing\"";
_flow_playing = "playing";
 //BA.debugLineNum = 78;BA.debugLine="Private Const FLOW_PREPARING As String = \"prepari";
_flow_preparing = "preparing";
 //BA.debugLineNum = 79;BA.debugLine="Private Const FLOW_TRANSITIONING As String = \"tra";
_flow_transitioning = "transitioning";
 //BA.debugLineNum = 80;BA.debugLine="Private Const FLOW_STOPPING As String = \"stopping";
_flow_stopping = "stopping";
 //BA.debugLineNum = 81;BA.debugLine="Private Const FLOW_PAUSED_POLICY As String = \"pau";
_flow_paused_policy = "paused_policy";
 //BA.debugLineNum = 82;BA.debugLine="Private Const FLOW_ERROR As String = \"error\"";
_flow_error = "error";
 //BA.debugLineNum = 83;BA.debugLine="Private rootView As B4XView";
_rootview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 85;BA.debugLine="Private storageDir As String";
_storagedir = "";
 //BA.debugLineNum = 86;BA.debugLine="Private appUpdateDir As String";
_appupdatedir = "";
 //BA.debugLineNum = 87;BA.debugLine="Private storageFile As String = \"player_state.jso";
_storagefile = "player_state.json";
 //BA.debugLineNum = 88;BA.debugLine="Private localStateDbName As String = \"LocalState\"";
_localstatedbname = "LocalState";
 //BA.debugLineNum = 89;BA.debugLine="Private trustedSyncTimeKey As String = \"trusted_s";
_trustedsynctimekey = "trusted_sync_time_ticks";
 //BA.debugLineNum = 90;BA.debugLine="Private trustedSyncLocalTimeKey As String = \"trus";
_trustedsynclocaltimekey = "trusted_sync_time_ticks_local";
 //BA.debugLineNum = 91;BA.debugLine="Private playerDataFile As String = \"player_data.j";
_playerdatafile = "player_data.json";
 //BA.debugLineNum = 92;BA.debugLine="Private playlistRequirementsFile As String = \"pla";
_playlistrequirementsfile = "playlist_requirements.json";
 //BA.debugLineNum = 93;BA.debugLine="Private localPlaylistsDirName As String = \"playli";
_localplaylistsdirname = "playlists";
 //BA.debugLineNum = 94;BA.debugLine="Private historyDirName As String = \"history\"";
_historydirname = "history";
 //BA.debugLineNum = 95;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
 //BA.debugLineNum = 97;BA.debugLine="Private card As B4XView";
_card = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 98;BA.debugLine="Private headerPane As B4XView";
_headerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 99;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 100;BA.debugLine="Private contentPane As B4XView";
_contentpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 101;BA.debugLine="Private footerPane As B4XView";
_footerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 104;BA.debugLine="Private setupHeroPane As B4XView";
_setupheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 105;BA.debugLine="Private setupDetailPane As B4XView";
_setupdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 106;BA.debugLine="Private setupPrimaryPane As B4XView";
_setupprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Private setupStatusPane As B4XView";
_setupstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 108;BA.debugLine="Private playerHeroPane As B4XView";
_playerheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Private playerDetailPane As B4XView";
_playerdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 110;BA.debugLine="Private playerPrimaryPane As B4XView";
_playerprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 111;BA.debugLine="Private playerStatusPane As B4XView";
_playerstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 112;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 113;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 120;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 122;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 123;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 124;BA.debugLine="Private lblFooter As B4XView";
_lblfooter = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 125;BA.debugLine="Private lblConnectionIcon As B4XView";
_lblconnectionicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 126;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Private txtPlayerCode As EditText";
_txtplayercode = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 133;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 134;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 135;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 136;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 137;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
 //BA.debugLineNum = 138;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
 //BA.debugLineNum = 139;BA.debugLine="Private isCodeInputFocused As Boolean";
_iscodeinputfocused = false;
 //BA.debugLineNum = 141;BA.debugLine="Private audioPrimary As AudioPlayer";
_audioprimary = new b4a.example.audioplayer();
 //BA.debugLineNum = 142;BA.debugLine="Private audioSecondary As AudioPlayer";
_audiosecondary = new b4a.example.audioplayer();
 //BA.debugLineNum = 143;BA.debugLine="Private localAdScheduler As AdScheduler";
_localadscheduler = new b4a.example.adscheduler();
 //BA.debugLineNum = 144;BA.debugLine="Private dataResolver As DataPlaybackResolver";
_dataresolver = new b4a.example.dataplaybackresolver();
 //BA.debugLineNum = 145;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4a.example.offlinestore();
 //BA.debugLineNum = 146;BA.debugLine="Private appTraceService As TraceService";
_apptraceservice = new b4a.example.traceservice();
 //BA.debugLineNum = 147;BA.debugLine="Private autoCacheManager As AutonomousCacheManage";
_autocachemanager = new b4a.example.autonomouscachemanager();
 //BA.debugLineNum = 148;BA.debugLine="Private traceFormatter As PlaybackTraceFormatter";
_traceformatter = new b4a.example.playbacktraceformatter();
 //BA.debugLineNum = 149;BA.debugLine="Private traceRouter As PlaybackTraceRouter";
_tracerouter = new b4a.example.playbacktracerouter();
 //BA.debugLineNum = 150;BA.debugLine="Private traceUploader As PlaybackTraceUploader";
_traceuploader = new b4a.example.playbacktraceuploader();
 //BA.debugLineNum = 151;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4a.example.mediacache();
 //BA.debugLineNum = 152;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4a.example.keyvaluestore();
 //BA.debugLineNum = 153;BA.debugLine="Private playQueue As List";
_playqueue = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 154;BA.debugLine="Private messages As Map";
_messages = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 155;BA.debugLine="Private traceLogLimit As Int = 1000";
_traceloglimit = (int) (1000);
 //BA.debugLineNum = 156;BA.debugLine="Private serverSnapshotLimit As Int = 30";
_serversnapshotlimit = (int) (30);
 //BA.debugLineNum = 157;BA.debugLine="Private retryTimer As Timer";
_retrytimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 165;BA.debugLine="Private orbitTimer As Timer";
_orbittimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 180;BA.debugLine="Private serviceBridge As PlaybackServiceBridge";
_servicebridge = new b4a.example.playbackservicebridge();
 //BA.debugLineNum = 183;BA.debugLine="Private playerCode As String";
_playercode = "";
 //BA.debugLineNum = 184;BA.debugLine="Private deviceId As String";
_deviceid = "";
 //BA.debugLineNum = 185;BA.debugLine="Private appScreenMode As String";
_appscreenmode = "";
 //BA.debugLineNum = 186;BA.debugLine="Private nextStartMode As String";
_nextstartmode = "";
 //BA.debugLineNum = 187;BA.debugLine="Private runtimeState As PlaybackRuntimeState";
_runtimestate = new b4a.example.playbackruntimestate();
 //BA.debugLineNum = 188;BA.debugLine="Private metaState As PlaybackMetaState";
_metastate = new b4a.example.playbackmetastate();
 //BA.debugLineNum = 189;BA.debugLine="Private orchestrationState As PlaybackOrchestrati";
_orchestrationstate = new b4a.example.playbackorchestrationstate();
 //BA.debugLineNum = 190;BA.debugLine="Private dataPolicyState As PlaybackDataPolicyStat";
_datapolicystate = new b4a.example.playbackdatapolicystate();
 //BA.debugLineNum = 191;BA.debugLine="Private offlinePlaybackCore As OfflinePlaybackEng";
_offlineplaybackcore = new b4a.example.offlineplaybackengine();
 //BA.debugLineNum = 192;BA.debugLine="Private transitionCoordinator As PlaybackTransiti";
_transitioncoordinator = new b4a.example.playbacktransitioncoordinator();
 //BA.debugLineNum = 193;BA.debugLine="Private playerDataCoordinator As PlaybackDataCoor";
_playerdatacoordinator = new b4a.example.playbackdatacoordinator();
 //BA.debugLineNum = 194;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4a.example.playerstatestore();
 //BA.debugLineNum = 195;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4a.example.networksyncservice();
 //BA.debugLineNum = 196;BA.debugLine="Private uiController As PlayerUiController";
_uicontroller = new b4a.example.playeruicontroller();
 //BA.debugLineNum = 197;BA.debugLine="Private uiControllerReady As Boolean";
_uicontrollerready = false;
 //BA.debugLineNum = 198;BA.debugLine="Private directorState As PlaybackDirectorState";
_directorstate = new b4a.example.playbackdirectorstate();
 //BA.debugLineNum = 199;BA.debugLine="Private initialStartFadePending As Boolean";
_initialstartfadepending = false;
 //BA.debugLineNum = 200;BA.debugLine="Private isHistoryFlushInProgress As Boolean";
_ishistoryflushinprogress = false;
 //BA.debugLineNum = 201;BA.debugLine="Private cachedRelevantTrackIds As List";
_cachedrelevanttrackids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 202;BA.debugLine="Private lastPlayButtonInputAt As Long";
_lastplaybuttoninputat = 0L;
 //BA.debugLineNum = 203;BA.debugLine="Private lastHeaderActionInputAt As Long";
_lastheaderactioninputat = 0L;
 //BA.debugLineNum = 204;BA.debugLine="Private lastUserPlaybackInputAt As Long";
_lastuserplaybackinputat = 0L;
 //BA.debugLineNum = 205;BA.debugLine="Private lastTrackCachePruneAt As Long";
_lasttrackcachepruneat = 0L;
 //BA.debugLineNum = 206;BA.debugLine="Private consecutiveAudioOutputErrors As Int";
_consecutiveaudiooutputerrors = 0;
 //BA.debugLineNum = 207;BA.debugLine="Private isAudioOutputRecoveryPause As Boolean";
_isaudiooutputrecoverypause = false;
 //BA.debugLineNum = 208;BA.debugLine="Private lastPlaybackWatchdogPositionMs As Long";
_lastplaybackwatchdogpositionms = 0L;
 //BA.debugLineNum = 209;BA.debugLine="Private lastPlaybackWatchdogTrackId As String";
_lastplaybackwatchdogtrackid = "";
 //BA.debugLineNum = 210;BA.debugLine="Private lastPlaybackWatchdogProgressAt As Long";
_lastplaybackwatchdogprogressat = 0L;
 //BA.debugLineNum = 211;BA.debugLine="Private lastPlaybackWatchdogRecoveryAt As Long";
_lastplaybackwatchdogrecoveryat = 0L;
 //BA.debugLineNum = 212;BA.debugLine="Private lastTransitionFadeStartedAtUs As Long";
_lasttransitionfadestartedatus = 0L;
 //BA.debugLineNum = 213;BA.debugLine="Private lastTransitionFadeFromAudioKey As String";
_lasttransitionfadefromaudiokey = "";
 //BA.debugLineNum = 214;BA.debugLine="Private lastTransitionFadeToAudioKey As String";
_lasttransitionfadetoaudiokey = "";
 //BA.debugLineNum = 215;BA.debugLine="Private lastTransitionFadeReason As String";
_lasttransitionfadereason = "";
 //BA.debugLineNum = 216;BA.debugLine="Private isPlaybackWatchdogTickInProgress As Boole";
_isplaybackwatchdogtickinprogress = false;
 //BA.debugLineNum = 217;BA.debugLine="Private isPlaybackDirectorTickQueued As Boolean";
_isplaybackdirectortickqueued = false;
 //BA.debugLineNum = 218;BA.debugLine="Private isPlaybackDirectorRetickRequested As Bool";
_isplaybackdirectorretickrequested = false;
 //BA.debugLineNum = 219;BA.debugLine="Private playbackActivationToken As Long";
_playbackactivationtoken = 0L;
 //BA.debugLineNum = 220;BA.debugLine="Private scheduledBreakAt As Long";
_scheduledbreakat = 0L;
 //BA.debugLineNum = 221;BA.debugLine="Private audioTimeupdateQueuedByKey As Map";
_audiotimeupdatequeuedbykey = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 223;BA.debugLine="Private playlistIndex As Int = -1";
_playlistindex = (int) (-1);
 //BA.debugLineNum = 224;BA.debugLine="Private orbitPulseStep As Int";
_orbitpulsestep = 0;
 //BA.debugLineNum = 225;BA.debugLine="Private isStartupSequenceInProgress As Boolean";
_isstartupsequenceinprogress = false;
 //BA.debugLineNum = 226;BA.debugLine="Private isAdWarmupDeferredAfterStartup As Boolean";
_isadwarmupdeferredafterstartup = false;
 //BA.debugLineNum = 227;BA.debugLine="Private isPostStartTasksDeferredAfterStartup As B";
_ispoststarttasksdeferredafterstartup = false;
 //BA.debugLineNum = 228;BA.debugLine="Private playbackFlowState As String";
_playbackflowstate = "";
 //BA.debugLineNum = 229;BA.debugLine="Private isAppUpdateDownloadInProgress As Boolean";
_isappupdatedownloadinprogress = false;
 //BA.debugLineNum = 230;BA.debugLine="Private pendingAppUpdateVersion As Int";
_pendingappupdateversion = 0;
 //BA.debugLineNum = 231;BA.debugLine="Private downloadedAppUpdateVersion As Int";
_downloadedappupdateversion = 0;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _cleanupplaybacktempfiles() throws Exception{
 //BA.debugLineNum = 4605;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
 //BA.debugLineNum = 4606;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
_mediacacheservice._flushpendingindexsaves /*String*/ ();
 //BA.debugLineNum = 4607;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
_mediacacheservice._cleanupplaybacktempfiles /*String*/ ();
 //BA.debugLineNum = 4608;BA.debugLine="End Sub";
return "";
}
public String  _clearexactbreakstate() throws Exception{
 //BA.debugLineNum = 3494;BA.debugLine="Private Sub ClearExactBreakState";
 //BA.debugLineNum = 3495;BA.debugLine="scheduledBreakAt = -1";
_scheduledbreakat = (long) (-1);
 //BA.debugLineNum = 3497;BA.debugLine="ServiceCancelPlaybackBreak";
_servicecancelplaybackbreak();
 //BA.debugLineNum = 3501;BA.debugLine="End Sub";
return "";
}
public String  _clearfailedappupdatestate() throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Private Sub ClearFailedAppUpdateState";
 //BA.debugLineNum = 483;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_VERSION_KEY)";
_storage._remove /*String*/ (_app_update_failed_version_key);
 //BA.debugLineNum = 484;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_REASON_KEY)";
_storage._remove /*String*/ (_app_update_failed_reason_key);
 //BA.debugLineNum = 485;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_AT_KEY)";
_storage._remove /*String*/ (_app_update_failed_at_key);
 //BA.debugLineNum = 486;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_RETRY_AFTER_KEY)";
_storage._remove /*String*/ (_app_update_failed_retry_after_key);
 //BA.debugLineNum = 487;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_ATTEMPTS_KEY)";
_storage._remove /*String*/ (_app_update_failed_attempts_key);
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return "";
}
public String  _clearfailedappupdateversionifnewer(int _targetversion) throws Exception{
int _failedversion = 0;
 //BA.debugLineNum = 461;BA.debugLine="Private Sub ClearFailedAppUpdateVersionIfNewer(tar";
 //BA.debugLineNum = 462;BA.debugLine="Dim failedVersion As Int = Floor(ToLongDefault(st";
_failedversion = (int) (__c.Floor(_tolongdefault(_storage._getdefault /*Object*/ (_app_update_failed_version_key,(Object)(0)),(long) (0))));
 //BA.debugLineNum = 463;BA.debugLine="If failedVersion <= 0 Then Return";
if (_failedversion<=0) { 
if (true) return "";};
 //BA.debugLineNum = 464;BA.debugLine="If targetVersion <= failedVersion Then Return";
if (_targetversion<=_failedversion) { 
if (true) return "";};
 //BA.debugLineNum = 465;BA.debugLine="ClearFailedAppUpdateState";
_clearfailedappupdatestate();
 //BA.debugLineNum = 466;BA.debugLine="TraceInfo(\"update\", \"сброс запомненной ошибки\", \"";
_traceinfo("update","сброс запомненной ошибки","failedVersion="+BA.NumberToString(_failedversion)+" newerVersion="+BA.NumberToString(_targetversion));
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorylogtimer() throws Exception{
 //BA.debugLineNum = 3654;BA.debugLine="Private Sub ClearHistoryLogTimer";
 //BA.debugLineNum = 3655;BA.debugLine="metaState.ClearHistoryStage";
_metastate._clearhistorystage /*String*/ ();
 //BA.debugLineNum = 3656;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate() throws Exception{
b4a.example.playbackplayerslot _pendingplayslot = null;
 //BA.debugLineNum = 1773;BA.debugLine="Private Sub ClearPendingPlayState";
 //BA.debugLineNum = 1774;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 1775;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = dire";
_pendingplayslot = _directorstate._getpendingplayslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1776;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlay";
if (_pendingplayslot.IsInitialized /*boolean*/ () && (_pendingplayslot._audiokey /*String*/ ).equals("") == false) { 
_directorstate._clearslotbyaudiokey /*String*/ (_pendingplayslot._audiokey /*String*/ );};
 //BA.debugLineNum = 1777;BA.debugLine="directorState.ClearRole(\"pending_play\")";
_directorstate._clearrole /*String*/ ("pending_play");
 //BA.debugLineNum = 1778;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 }else {
 //BA.debugLineNum = 1780;BA.debugLine="runtimeState.ClearPendingPlayState";
_runtimestate._clearpendingplaystate /*String*/ ();
 };
 //BA.debugLineNum = 1782;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate() throws Exception{
 //BA.debugLineNum = 3851;BA.debugLine="Private Sub ClearPlaybackState";
 //BA.debugLineNum = 3852;BA.debugLine="TraceLog(\"состояние воспроизведения clear\")";
_tracelog("состояние воспроизведения clear");
 //BA.debugLineNum = 3853;BA.debugLine="audioPrimary.Reset";
_audioprimary._reset /*String*/ ();
 //BA.debugLineNum = 3854;BA.debugLine="audioSecondary.Reset";
_audiosecondary._reset /*String*/ ();
 //BA.debugLineNum = 3855;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
_mediacacheservice._flushpendingindexsaves /*String*/ ();
 //BA.debugLineNum = 3856;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
_mediacacheservice._cleanupplaybacktempfiles /*String*/ ();
 //BA.debugLineNum = 3857;BA.debugLine="If directorState.IsInitialized Then directorState";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
_directorstate._reset /*String*/ ();};
 //BA.debugLineNum = 3858;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
_runtimestate._activeaudiokey /*String*/  = "";
 //BA.debugLineNum = 3859;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
_runtimestate._preparedaudiokey /*String*/  = "";
 //BA.debugLineNum = 3860;BA.debugLine="runtimeState.ActiveItem.Initialize";
_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 3861;BA.debugLine="runtimeState.PreparedItem.Initialize";
_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 3862;BA.debugLine="If directorState.IsInitialized Then directorState";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
_directorstate._configuredefaultslots /*String*/ ();};
 //BA.debugLineNum = 3863;BA.debugLine="SyncPlaybackDirectorState";
_syncplaybackdirectorstate();
 //BA.debugLineNum = 3864;BA.debugLine="metaState.Reset";
_metastate._reset /*String*/ ();
 //BA.debugLineNum = 3865;BA.debugLine="ClearPendingPlayState";
_clearpendingplaystate();
 //BA.debugLineNum = 3866;BA.debugLine="ClearPreparedState(False)";
_clearpreparedstate(__c.False);
 //BA.debugLineNum = 3867;BA.debugLine="playQueue.Clear";
_playqueue.Clear();
 //BA.debugLineNum = 3868;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
_orchestrationstate._cleartracktransitionflags /*String*/ ();
 //BA.debugLineNum = 3869;BA.debugLine="initialStartFadePending = False";
_initialstartfadepending = __c.False;
 //BA.debugLineNum = 3870;BA.debugLine="orchestrationState.EndDispatch";
_orchestrationstate._enddispatch /*String*/ ();
 //BA.debugLineNum = 3871;BA.debugLine="stateStore.ClearDispatchRetryAfter";
_statestore._cleardispatchretryafter /*String*/ ();
 //BA.debugLineNum = 3872;BA.debugLine="ClearRetryTimer";
_clearretrytimer();
 //BA.debugLineNum = 3873;BA.debugLine="ClearExactBreakState";
_clearexactbreakstate();
 //BA.debugLineNum = 3874;BA.debugLine="ClearHistoryLogTimer";
_clearhistorylogtimer();
 //BA.debugLineNum = 3875;BA.debugLine="ResetPlaybackWatchdogState";
_resetplaybackwatchdogstate();
 //BA.debugLineNum = 3876;BA.debugLine="uiController.SetStatusText(\"\")";
_uicontroller._setstatustext /*String*/ ("");
 //BA.debugLineNum = 3877;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedstate(boolean _resetplayer) throws Exception{
String _preparedaudiokey = "";
 //BA.debugLineNum = 1755;BA.debugLine="Private Sub ClearPreparedState(resetPlayer As Bool";
 //BA.debugLineNum = 1756;BA.debugLine="Dim preparedAudioKey As String = Transition_GetDi";
_preparedaudiokey = _transition_getdirectorpreparedaudiokey();
 //BA.debugLineNum = 1757;BA.debugLine="If preparedAudioKey <> \"\" And resetPlayer Then";
if ((_preparedaudiokey).equals("") == false && _resetplayer) { 
 //BA.debugLineNum = 1758;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
_getaudiobykey(_preparedaudiokey)._reset /*String*/ ();
 };
 //BA.debugLineNum = 1760;BA.debugLine="If directorState.IsInitialized And preparedAudioK";
if (_directorstate.IsInitialized /*boolean*/ () && (_preparedaudiokey).equals("") == false) { 
_directorstate._clearslotbyaudiokey /*String*/ (_preparedaudiokey);};
 //BA.debugLineNum = 1761;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 1762;BA.debugLine="directorState.ClearRole(\"pending_prepare_music\")";
_directorstate._clearrole /*String*/ ("pending_prepare_music");
 //BA.debugLineNum = 1763;BA.debugLine="directorState.ClearRole(\"pending_interrupt\")";
_directorstate._clearrole /*String*/ ("pending_interrupt");
 //BA.debugLineNum = 1764;BA.debugLine="directorState.ClearRole(\"pending_prepare\")";
_directorstate._clearrole /*String*/ ("pending_prepare");
 //BA.debugLineNum = 1765;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 }else {
 //BA.debugLineNum = 1767;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
_runtimestate._preparedaudiokey /*String*/  = "";
 //BA.debugLineNum = 1768;BA.debugLine="runtimeState.PreparedItem.Initialize";
_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1769;BA.debugLine="runtimeState.ClearPendingPrepareState";
_runtimestate._clearpendingpreparestate /*String*/ ();
 };
 //BA.debugLineNum = 1771;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer() throws Exception{
 //BA.debugLineNum = 3427;BA.debugLine="Private Sub ClearRetryTimer";
 //BA.debugLineNum = 3428;BA.debugLine="retryTimer.Enabled = False";
_retrytimer.setEnabled(__c.False);
 //BA.debugLineNum = 3429;BA.debugLine="stateStore.ClearLastRetryMode";
_statestore._clearlastretrymode /*String*/ ();
 //BA.debugLineNum = 3430;BA.debugLine="End Sub";
return "";
}
public String  _clientosnamevalue() throws Exception{
 //BA.debugLineNum = 5107;BA.debugLine="Public Sub ClientOsNameValue As String";
 //BA.debugLineNum = 5108;BA.debugLine="Return ResolveClientOsName";
if (true) return _resolveclientosname();
 //BA.debugLineNum = 5109;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(anywheresoftware.b4a.objects.collections.List _source) throws Exception{
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
 //BA.debugLineNum = 1118;BA.debugLine="Private Sub CloneList(source As List) As List";
 //BA.debugLineNum = 1119;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1120;BA.debugLine="copy.Initialize";
_copy.Initialize();
 //BA.debugLineNum = 1121;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
 //BA.debugLineNum = 1122;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
 //BA.debugLineNum = 1123;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
 //BA.debugLineNum = 1125;BA.debugLine="Return copy";
if (true) return _copy;
 //BA.debugLineNum = 1126;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
 //BA.debugLineNum = 2461;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
 //BA.debugLineNum = 2462;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2463;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
 //BA.debugLineNum = 2464;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
 //BA.debugLineNum = 2465;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
 //BA.debugLineNum = 2466;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
 //BA.debugLineNum = 2468;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
 //BA.debugLineNum = 2469;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _collectprotectedtrackids() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _protectedids = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _trackid = "";
 //BA.debugLineNum = 1055;BA.debugLine="Private Sub CollectProtectedTrackIds As List";
 //BA.debugLineNum = 1056;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1057;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1058;BA.debugLine="Dim protectedIds As Map";
_protectedids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1059;BA.debugLine="protectedIds.Initialize";
_protectedids.Initialize();
 //BA.debugLineNum = 1060;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
_addprotectedtrackid(_protectedids,_transition_getdirectoractiveitem());
 //BA.debugLineNum = 1061;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
_addprotectedtrackid(_protectedids,_transition_getdirectorprepareditem());
 //BA.debugLineNum = 1062;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
_addprotectedtrackid(_protectedids,_transition_getdirectorpendingplayitem("primary"));
 //BA.debugLineNum = 1063;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
_addprotectedtrackid(_protectedids,_transition_getdirectorpendingplayitem("secondary"));
 //BA.debugLineNum = 1064;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
_addprotectedtrackid(_protectedids,_transition_getdirectorpendingprepareitem("primary"));
 //BA.debugLineNum = 1065;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
_addprotectedtrackid(_protectedids,_transition_getdirectorpendingprepareitem("secondary"));
 //BA.debugLineNum = 1066;BA.debugLine="If playQueue.IsInitialized Then";
if (_playqueue.IsInitialized()) { 
 //BA.debugLineNum = 1067;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group12 = _playqueue;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_itemobject = group12.Get(index12);
 //BA.debugLineNum = 1068;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
 //BA.debugLineNum = 1069;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 1070;BA.debugLine="AddProtectedTrackId(protectedIds, item)";
_addprotectedtrackid(_protectedids,_item);
 };
 }
};
 };
 //BA.debugLineNum = 1074;BA.debugLine="For Each trackId As String In protectedIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group19 = _protectedids.Keys();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackid = BA.ObjectToString(group19.Get(index19));
 //BA.debugLineNum = 1075;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
 //BA.debugLineNum = 1077;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _collectrelevanttrackids() throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _relevantids = null;
anywheresoftware.b4a.objects.collections.List _descriptors = null;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
 //BA.debugLineNum = 1080;BA.debugLine="Private Sub CollectRelevantTrackIds As List";
 //BA.debugLineNum = 1081;BA.debugLine="If cachedRelevantTrackIds.IsInitialized And cache";
if (_cachedrelevanttrackids.IsInitialized() && _cachedrelevanttrackids.getSize()>0) { 
if (true) return _clonelist(_cachedrelevanttrackids);};
 //BA.debugLineNum = 1082;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1083;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1084;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1085;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
 //BA.debugLineNum = 1086;BA.debugLine="Dim descriptors As List = offlineStoreService.Get";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = _offlinestoreservice._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 1087;BA.debugLine="If descriptors.IsInitialized = False Then Return";
if (_descriptors.IsInitialized()==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 1088;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group8 = _descriptors;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_descriptorobject = group8.Get(index8);
 //BA.debugLineNum = 1089;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
 //BA.debugLineNum = 1090;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
 //BA.debugLineNum = 1091;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 1092;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 1093;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCach";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = _dataresolver._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (_playlistid);
 //BA.debugLineNum = 1094;BA.debugLine="If playlistData.IsInitialized = False Then Cont";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1095;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"t";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
 //BA.debugLineNum = 1096;BA.debugLine="If tracks.IsInitialized = False Then Continue";
if (_tracks.IsInitialized()==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 1097;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group17 = _tracks;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_trackobject = group17.Get(index17);
 //BA.debugLineNum = 1098;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
 //BA.debugLineNum = 1099;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
 //BA.debugLineNum = 1100;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 1101;BA.debugLine="If trackId <> \"\" Then relevantIds.Put(trackId";
if ((_trackid).equals("") == false) { 
_relevantids.Put((Object)(_trackid),(Object)(__c.True));};
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 1106;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group26 = _relevantids.Keys();
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_trackid = BA.ObjectToString(group26.Get(index26));
 //BA.debugLineNum = 1107;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
 //BA.debugLineNum = 1109;BA.debugLine="cachedRelevantTrackIds = CloneList(result)";
_cachedrelevanttrackids = _clonelist(_result);
 //BA.debugLineNum = 1110;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1111;BA.debugLine="End Sub";
return null;
}
public String  _colortocss(int _color) throws Exception{
 //BA.debugLineNum = 5449;BA.debugLine="Private Sub ColorToCss(color As Int) As String";
 //BA.debugLineNum = 5450;BA.debugLine="Return UiStyle.ColorToCss(color)";
if (true) return _uistyle._colortocss /*String*/ (ba,_color);
 //BA.debugLineNum = 5451;BA.debugLine="End Sub";
return "";
}
public String  _completestartupsequence() throws Exception{
 //BA.debugLineNum = 1201;BA.debugLine="Private Sub CompleteStartupSequence";
 //BA.debugLineNum = 1202;BA.debugLine="Facade_CompleteStartupSequenceCore";
_facade_completestartupsequencecore();
 //BA.debugLineNum = 1203;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader() throws Exception{
 //BA.debugLineNum = 1540;BA.debugLine="Private Sub ConfigurePlayerHeader";
 //BA.debugLineNum = 1541;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1542;BA.debugLine="uiController.ConfigurePlayerHeader";
_uicontroller._configureplayerheader /*String*/ ();
 //BA.debugLineNum = 1543;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(String _mode,String _text) throws Exception{
 //BA.debugLineNum = 1535;BA.debugLine="Private Sub ConfigureSetupScreen(mode As String, t";
 //BA.debugLineNum = 1536;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1537;BA.debugLine="uiController.ConfigureSetupScreen(mode, FormatPla";
_uicontroller._configuresetupscreen /*String*/ (_mode,_formatplayercodefordisplay(_playercode),_text,_messagevalue("setup_title"),_messagevalue("settings_thanks"),_messagevalue("setup_submit"),_messagevalue("logout"));
 //BA.debugLineNum = 1538;BA.debugLine="End Sub";
return "";
}
public boolean  _confirmpendinghistoryitem(String _reason) throws Exception{
 //BA.debugLineNum = 3570;BA.debugLine="Private Sub ConfirmPendingHistoryItem(reason As St";
 //BA.debugLineNum = 3571;BA.debugLine="If metaState.PendingHistoryItem.IsInitialized = F";
if (_metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3572;BA.debugLine="If metaState.PendingHistoryItem.GetDefault(\"id\",";
if ((_metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3573;BA.debugLine="TraceLog(\"история confirm reason=\" & reason & \" i";
_tracelog("история confirm reason="+_reason+" item="+_describeitem((Object)(_metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
 //BA.debugLineNum = 3574;BA.debugLine="QueueHistoryRecordAt(metaState.PendingHistoryItem";
_queuehistoryrecordat(_metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ ,_metastate._historystartedatticks /*long*/ );
 //BA.debugLineNum = 3575;BA.debugLine="ClearHistoryLogTimer";
_clearhistorylogtimer();
 //BA.debugLineNum = 3576;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 3577;BA.debugLine="End Sub";
return false;
}
public int  _confirmreservedheight() throws Exception{
 //BA.debugLineNum = 870;BA.debugLine="Private Sub ConfirmReservedHeight As Int";
 //BA.debugLineNum = 871;BA.debugLine="If confirmPane.Visible Then Return 84dip";
if (_confirmpane.getVisible()) { 
if (true) return __c.DipToCurrent((int) (84));};
 //BA.debugLineNum = 872;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return 0;
}
public String  _consumelastexception() throws Exception{
String _ignored = "";
 //BA.debugLineNum = 566;BA.debugLine="Private Sub ConsumeLastException";
 //BA.debugLineNum = 567;BA.debugLine="Dim ignored As String = LastException.Message";
_ignored = __c.LastException(ba).getMessage();
 //BA.debugLineNum = 568;BA.debugLine="If ignored = \"__never__\" Then Return";
if ((_ignored).equals("__never__")) { 
if (true) return "";};
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return "";
}
public String  _consumepreparedqueueitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
int _i = 0;
Object _queuedobject = null;
anywheresoftware.b4a.objects.collections.Map _queueditem = null;
anywheresoftware.b4a.objects.collections.List _breakitems = null;
int _j = 0;
Object _breakobject = null;
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
 //BA.debugLineNum = 2477;BA.debugLine="Private Sub ConsumePreparedQueueItem";
 //BA.debugLineNum = 2478;BA.debugLine="Dim preparedItem As Map = Transition_GetDirectorP";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _transition_getdirectorprepareditem();
 //BA.debugLineNum = 2479;BA.debugLine="If playQueue.Size = 0 Or preparedItem.IsInitializ";
if (_playqueue.getSize()==0 || _prepareditem.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 2480;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_playqueue.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 2481;BA.debugLine="Dim queuedObject As Object = playQueue.Get(i)";
_queuedobject = _playqueue.Get(_i);
 //BA.debugLineNum = 2482;BA.debugLine="If queuedObject Is Map Then";
if (_queuedobject instanceof java.util.Map) { 
 //BA.debugLineNum = 2483;BA.debugLine="Dim queuedItem As Map = queuedObject";
_queueditem = new anywheresoftware.b4a.objects.collections.Map();
_queueditem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_queuedobject));
 //BA.debugLineNum = 2484;BA.debugLine="If ItemsMatch(queuedItem, preparedItem) Then";
if (_itemsmatch(_queueditem,_prepareditem)) { 
 //BA.debugLineNum = 2485;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 //BA.debugLineNum = 2486;BA.debugLine="Exit";
if (true) break;
 };
 //BA.debugLineNum = 2488;BA.debugLine="If queuedItem.GetDefault(\"type\", \"\") = \"break\"";
if ((_queueditem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break"))) { 
 //BA.debugLineNum = 2489;BA.debugLine="Dim breakItems As List = queuedItem.GetDefault";
_breakitems = new anywheresoftware.b4a.objects.collections.List();
_breakitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_queueditem.GetDefault((Object)("items"),__c.Null)));
 //BA.debugLineNum = 2490;BA.debugLine="If breakItems.IsInitialized Then";
if (_breakitems.IsInitialized()) { 
 //BA.debugLineNum = 2491;BA.debugLine="For j = breakItems.Size - 1 To 0 Step -1";
{
final int step14 = -1;
final int limit14 = (int) (0);
_j = (int) (_breakitems.getSize()-1) ;
for (;_j >= limit14 ;_j = _j + step14 ) {
 //BA.debugLineNum = 2492;BA.debugLine="Dim breakObject As Object = breakItems.Get(j";
_breakobject = _breakitems.Get(_j);
 //BA.debugLineNum = 2493;BA.debugLine="If breakObject Is Map Then";
if (_breakobject instanceof java.util.Map) { 
 //BA.debugLineNum = 2494;BA.debugLine="Dim breakItem As Map = breakObject";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_breakobject));
 //BA.debugLineNum = 2495;BA.debugLine="If ItemsMatch(breakItem, preparedItem) Then";
if (_itemsmatch(_breakitem,_prepareditem)) { 
 //BA.debugLineNum = 2496;BA.debugLine="breakItems.RemoveAt(j)";
_breakitems.RemoveAt(_j);
 //BA.debugLineNum = 2497;BA.debugLine="If breakItems.Size = 0 Then";
if (_breakitems.getSize()==0) { 
 //BA.debugLineNum = 2498;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 }else {
 //BA.debugLineNum = 2500;BA.debugLine="queuedItem.Put(\"items\", breakItems)";
_queueditem.Put((Object)("items"),(Object)(_breakitems.getObject()));
 //BA.debugLineNum = 2501;BA.debugLine="queuedItem.Put(\"items_count\", breakItems.";
_queueditem.Put((Object)("items_count"),(Object)(_breakitems.getSize()));
 //BA.debugLineNum = 2502;BA.debugLine="playQueue.Set(i, queuedItem)";
_playqueue.Set(_i,(Object)(_queueditem.getObject()));
 };
 //BA.debugLineNum = 2504;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 };
 };
 };
 }
};
 //BA.debugLineNum = 2512;BA.debugLine="End Sub";
return "";
}
public int  _countallpendinghistoryrecords() throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _total = 0;
String _filename = "";
 //BA.debugLineNum = 3706;BA.debugLine="Private Sub CountAllPendingHistoryRecords As Int";
 //BA.debugLineNum = 3707;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(_gethistorydir(),"")==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3708;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_gethistorydir());
 //BA.debugLineNum = 3709;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3710;BA.debugLine="Dim total As Int = 0";
_total = (int) (0);
 //BA.debugLineNum = 3711;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 3712;BA.debugLine="If IsHistoryFileName(fileName) = False Then Cont";
if (_ishistoryfilename(_filename)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 3713;BA.debugLine="Try";
try { //BA.debugLineNum = 3714;BA.debugLine="total = total + CountNdjsonRecords(File.ReadStr";
_total = (int) (_total+_countndjsonrecords(__c.File.ReadString(_gethistorydir(),_filename)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 3716;BA.debugLine="TraceWarn(\"history\", \"не удалось прочитать файл";
_tracewarn("history","не удалось прочитать файл истории","file="+_filename);
 };
 }
};
 //BA.debugLineNum = 3719;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 3720;BA.debugLine="End Sub";
return 0;
}
public int  _countndjsonrecords(String _payload) throws Exception{
String _normalized = "";
String[] _rows = null;
int _count = 0;
String _row = "";
 //BA.debugLineNum = 3722;BA.debugLine="Private Sub CountNdjsonRecords(payload As String)";
 //BA.debugLineNum = 3723;BA.debugLine="Dim normalized As String = NormalizeNdjsonPayload";
_normalized = _normalizendjsonpayload(_payload);
 //BA.debugLineNum = 3724;BA.debugLine="If normalized = \"\" Then Return 0";
if ((_normalized).equals("")) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3725;BA.debugLine="Dim rows() As String = Regex.Split(CRLF, normaliz";
_rows = __c.Regex.Split(__c.CRLF,_normalized);
 //BA.debugLineNum = 3726;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
 //BA.debugLineNum = 3727;BA.debugLine="For Each row As String In rows";
{
final String[] group5 = _rows;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = group5[index5];
 //BA.debugLineNum = 3728;BA.debugLine="If row.Trim <> \"\" Then count = count + 1";
if ((_row.trim()).equals("") == false) { 
_count = (int) (_count+1);};
 }
};
 //BA.debugLineNum = 3730;BA.debugLine="Return count";
if (true) return _count;
 //BA.debugLineNum = 3731;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 4984;BA.debugLine="Private Sub CreateInitializedMap As Map";
 //BA.debugLineNum = 4985;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4986;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 4987;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 4988;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
 //BA.debugLineNum = 5424;BA.debugLine="Private Sub CreateLabel(text As String, fontSize A";
 //BA.debugLineNum = 5425;BA.debugLine="Return UiStyle.CreateLabel(xui, text, fontSize, t";
if (true) return _uistyle._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (ba,_xui,_text,_fontsize,_textcolor,_bold,_wraptext);
 //BA.debugLineNum = 5426;BA.debugLine="End Sub";
return null;
}
public String  _createrandomdeviceid() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
 //BA.debugLineNum = 4823;BA.debugLine="Private Sub CreateRandomDeviceId As String";
 //BA.debugLineNum = 4824;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 4825;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
 //BA.debugLineNum = 4826;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"randomUUID";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("randomUUID",(Object[])(__c.Null))));
 //BA.debugLineNum = 4827;BA.debugLine="Return uuid.RunMethod(\"toString\", Null)";
if (true) return BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 4828;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextbutton(String _text,String _eventname) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
 //BA.debugLineNum = 5428;BA.debugLine="Private Sub CreateTextButton(text As String, event";
 //BA.debugLineNum = 5429;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5430;BA.debugLine="btn.Initialize(eventName)";
_btn.Initialize(ba,_eventname);
 //BA.debugLineNum = 5431;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
 //BA.debugLineNum = 5432;BA.debugLine="xbtn.Text = text.ToUpperCase";
_xbtn.setText(BA.ObjectToCharSequence(_text.toUpperCase()));
 //BA.debugLineNum = 5433;BA.debugLine="UpdateTextButtonAppearance(xbtn, False)";
_updatetextbuttonappearance(_xbtn,__c.False);
 //BA.debugLineNum = 5434;BA.debugLine="Return xbtn";
if (true) return _xbtn;
 //BA.debugLineNum = 5435;BA.debugLine="End Sub";
return null;
}
public int  _currentsecondofminute() throws Exception{
String _previoustimeformat = "";
int _value = 0;
 //BA.debugLineNum = 4919;BA.debugLine="Private Sub CurrentSecondOfMinute As Int";
 //BA.debugLineNum = 4920;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 4921;BA.debugLine="DateTime.TimeFormat = \"ss\"";
__c.DateTime.setTimeFormat("ss");
 //BA.debugLineNum = 4922;BA.debugLine="Dim value As Int = DateTime.Time(EffectiveNowTick";
_value = (int)(Double.parseDouble(__c.DateTime.Time(_effectivenowticks())));
 //BA.debugLineNum = 4923;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 4924;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 4925;BA.debugLine="End Sub";
return 0;
}
public double  _currentvolume(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 4614;BA.debugLine="Private Sub CurrentVolume(item As Map) As Double";
 //BA.debugLineNum = 4615;BA.debugLine="Return ResolveItemVolume(item)";
if (true) return _resolveitemvolume(_item);
 //BA.debugLineNum = 4616;BA.debugLine="End Sub";
return 0;
}
public String  _data_applyclientrequestheaders(b4a.example.httpjob _j) throws Exception{
 //BA.debugLineNum = 5378;BA.debugLine="Public Sub Data_ApplyClientRequestHeaders(j As Htt";
 //BA.debugLineNum = 5379;BA.debugLine="ApplyClientRequestHeaders(j)";
_applyclientrequestheaders(_j);
 //BA.debugLineNum = 5380;BA.debugLine="End Sub";
return "";
}
public String  _data_applytemporarymode(String _mode) throws Exception{
 //BA.debugLineNum = 5143;BA.debugLine="Public Sub Data_ApplyTemporaryMode(mode As String)";
 //BA.debugLineNum = 5144;BA.debugLine="dataPolicyState.ApplyTemporaryMode(mode)";
_datapolicystate._applytemporarymode /*String*/ (_mode);
 //BA.debugLineNum = 5145;BA.debugLine="End Sub";
return "";
}
public String  _data_checkforappupdate(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 5139;BA.debugLine="Public Sub Data_CheckForAppUpdate(data As Map)";
 //BA.debugLineNum = 5140;BA.debugLine="CheckForAppUpdate(data)";
_checkforappupdate(_data);
 //BA.debugLineNum = 5141;BA.debugLine="End Sub";
return "";
}
public String  _data_clearplaybackstate() throws Exception{
 //BA.debugLineNum = 5151;BA.debugLine="Public Sub Data_ClearPlaybackState";
 //BA.debugLineNum = 5152;BA.debugLine="ClearPlaybackState";
_clearplaybackstate();
 //BA.debugLineNum = 5153;BA.debugLine="End Sub";
return "";
}
public String  _data_clearpolicypause() throws Exception{
 //BA.debugLineNum = 5410;BA.debugLine="Public Sub Data_ClearPolicyPause";
 //BA.debugLineNum = 5411;BA.debugLine="dataPolicyState.ClearPolicyPause";
_datapolicystate._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 5412;BA.debugLine="End Sub";
return "";
}
public String  _data_clearpolicypauseandresumerequest() throws Exception{
 //BA.debugLineNum = 5175;BA.debugLine="Public Sub Data_ClearPolicyPauseAndResumeRequest";
 //BA.debugLineNum = 5176;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
_datapolicystate._clearpolicypauseandresumerequest /*String*/ ();
 //BA.debugLineNum = 5177;BA.debugLine="End Sub";
return "";
}
public String  _data_consumelastexception() throws Exception{
 //BA.debugLineNum = 5127;BA.debugLine="Public Sub Data_ConsumeLastException";
 //BA.debugLineNum = 5128;BA.debugLine="ConsumeLastException";
_consumelastexception();
 //BA.debugLineNum = 5129;BA.debugLine="End Sub";
return "";
}
public String  _data_disablebackgroundrefreshtimers() throws Exception{
 //BA.debugLineNum = 5203;BA.debugLine="Public Sub Data_DisableBackgroundRefreshTimers";
 //BA.debugLineNum = 5205;BA.debugLine="ServiceStopBackgroundTimers";
_servicestopbackgroundtimers();
 //BA.debugLineNum = 5212;BA.debugLine="DisableCacheAuditTimer";
_disablecacheaudittimer();
 //BA.debugLineNum = 5213;BA.debugLine="End Sub";
return "";
}
public String  _data_ensureadcachesyncasync() throws Exception{
 //BA.debugLineNum = 5394;BA.debugLine="Public Sub Data_EnsureAdCacheSyncAsync";
 //BA.debugLineNum = 5395;BA.debugLine="EnsureAdCacheSyncAsync";
_ensureadcachesyncasync();
 //BA.debugLineNum = 5396;BA.debugLine="End Sub";
return "";
}
public String  _data_enterlocalplayback() throws Exception{
 //BA.debugLineNum = 5187;BA.debugLine="Public Sub Data_EnterLocalPlayback";
 //BA.debugLineNum = 5188;BA.debugLine="dataPolicyState.EnterLocalPlayback";
_datapolicystate._enterlocalplayback /*String*/ ();
 //BA.debugLineNum = 5189;BA.debugLine="End Sub";
return "";
}
public String  _data_enterpolicypause(String _reason,String _connectionmode) throws Exception{
 //BA.debugLineNum = 5167;BA.debugLine="Public Sub Data_EnterPolicyPause(reason As String,";
 //BA.debugLineNum = 5168;BA.debugLine="EnterPolicyPauseState(reason, connectionMode)";
_enterpolicypausestate(_reason,_connectionmode);
 //BA.debugLineNum = 5169;BA.debugLine="End Sub";
return "";
}
public String  _data_enteruserstoppedstate() throws Exception{
 //BA.debugLineNum = 5179;BA.debugLine="Public Sub Data_EnterUserStoppedState";
 //BA.debugLineNum = 5180;BA.debugLine="orchestrationState.EnterUserStoppedState";
_orchestrationstate._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 5181;BA.debugLine="End Sub";
return "";
}
public String  _data_flushtracebufferasync() throws Exception{
 //BA.debugLineNum = 5386;BA.debugLine="Public Sub Data_FlushTraceBufferAsync";
 //BA.debugLineNum = 5387;BA.debugLine="FlushTraceBufferAsync";
_flushtracebufferasync();
 //BA.debugLineNum = 5388;BA.debugLine="End Sub";
return "";
}
public int  _data_getcurrentslotlocalreservecount() throws Exception{
 //BA.debugLineNum = 5199;BA.debugLine="Public Sub Data_GetCurrentSlotLocalReserveCount As";
 //BA.debugLineNum = 5200;BA.debugLine="Return GetCurrentSlotLocalReserveCount";
if (true) return _getcurrentslotlocalreservecount();
 //BA.debugLineNum = 5201;BA.debugLine="End Sub";
return 0;
}
public String  _data_handlemessageitem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 5414;BA.debugLine="Public Sub Data_HandleMessageItem(item As Map)";
 //BA.debugLineNum = 5415;BA.debugLine="HandleMessageItem(item)";
_handlemessageitem(_item);
 //BA.debugLineNum = 5416;BA.debugLine="End Sub";
return "";
}
public boolean  _data_haslocalplaybackfallback() throws Exception{
 //BA.debugLineNum = 5195;BA.debugLine="Public Sub Data_HasLocalPlaybackFallback As Boolea";
 //BA.debugLineNum = 5196;BA.debugLine="Return HasLocalPlaybackFallback";
if (true) return _haslocalplaybackfallback();
 //BA.debugLineNum = 5197;BA.debugLine="End Sub";
return false;
}
public String  _data_hidecontentblocks() throws Exception{
 //BA.debugLineNum = 5402;BA.debugLine="Public Sub Data_HideContentBlocks";
 //BA.debugLineNum = 5403;BA.debugLine="HideContentBlocks";
_hidecontentblocks();
 //BA.debugLineNum = 5404;BA.debugLine="End Sub";
return "";
}
public String  _data_hidepin() throws Exception{
 //BA.debugLineNum = 5155;BA.debugLine="Public Sub Data_HidePin";
 //BA.debugLineNum = 5156;BA.debugLine="HidePin";
_hidepin();
 //BA.debugLineNum = 5157;BA.debugLine="End Sub";
return "";
}
public String  _data_invalidaterelevanttrackidscache() throws Exception{
 //BA.debugLineNum = 5390;BA.debugLine="Public Sub Data_InvalidateRelevantTrackIdsCache";
 //BA.debugLineNum = 5391;BA.debugLine="InvalidateRelevantTrackIdsCache";
_invalidaterelevanttrackidscache();
 //BA.debugLineNum = 5392;BA.debugLine="End Sub";
return "";
}
public String  _data_messagevalue(String _key) throws Exception{
 //BA.debugLineNum = 5091;BA.debugLine="Public Sub Data_MessageValue(key As String) As Str";
 //BA.debugLineNum = 5092;BA.debugLine="Return MessageValue(key)";
if (true) return _messagevalue(_key);
 //BA.debugLineNum = 5093;BA.debugLine="End Sub";
return "";
}
public String  _data_refreshconnectionindicatorstate() throws Exception{
 //BA.debugLineNum = 5147;BA.debugLine="Public Sub Data_RefreshConnectionIndicatorState";
 //BA.debugLineNum = 5148;BA.debugLine="RefreshConnectionIndicatorState";
_refreshconnectionindicatorstate();
 //BA.debugLineNum = 5149;BA.debugLine="End Sub";
return "";
}
public String  _data_resolveidleuntilmessage(anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
 //BA.debugLineNum = 3371;BA.debugLine="Public Sub Data_ResolveIdleUntilMessage(data As Ma";
 //BA.debugLineNum = 3372;BA.debugLine="Return playerDataCoordinator.ResolveIdleUntilMess";
if (true) return _playerdatacoordinator._resolveidleuntilmessage /*String*/ (_data,_targetticks);
 //BA.debugLineNum = 3373;BA.debugLine="End Sub";
return "";
}
public String  _data_resumeplaybackafterpolicypauseasync() throws Exception{
 //BA.debugLineNum = 5406;BA.debugLine="Public Sub Data_ResumePlaybackAfterPolicyPauseAsyn";
 //BA.debugLineNum = 5407;BA.debugLine="ResumePlaybackAfterPolicyPause";
_resumeplaybackafterpolicypause();
 //BA.debugLineNum = 5408;BA.debugLine="End Sub";
return "";
}
public String  _data_saveserversnapshot(String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
 //BA.debugLineNum = 5382;BA.debugLine="Public Sub Data_SaveServerSnapshot(method As Strin";
 //BA.debugLineNum = 5383;BA.debugLine="SaveServerSnapshot(method, url, success, body, er";
_saveserversnapshot(_method,_url,_success,_body,_errormessage);
 //BA.debugLineNum = 5384;BA.debugLine="End Sub";
return "";
}
public String  _data_scheduleretry(String _mode,int _delayms) throws Exception{
 //BA.debugLineNum = 5163;BA.debugLine="Public Sub Data_ScheduleRetry(mode As String, dela";
 //BA.debugLineNum = 5164;BA.debugLine="ScheduleRetry(mode, delayMs)";
_scheduleretry(_mode,_delayms);
 //BA.debugLineNum = 5165;BA.debugLine="End Sub";
return "";
}
public String  _data_secondsagotext(long _ticksvalue) throws Exception{
 //BA.debugLineNum = 5374;BA.debugLine="Public Sub Data_SecondsAgoText(ticksValue As Long)";
 //BA.debugLineNum = 5375;BA.debugLine="Return SecondsAgoText(ticksValue)";
if (true) return _secondsagotext(_ticksvalue);
 //BA.debugLineNum = 5376;BA.debugLine="End Sub";
return "";
}
public String  _data_setmediapathdegraded(boolean _value) throws Exception{
 //BA.debugLineNum = 5191;BA.debugLine="Public Sub Data_SetMediaPathDegraded(value As Bool";
 //BA.debugLineNum = 5192;BA.debugLine="stateStore.SetMediaPathDegraded(value)";
_statestore._setmediapathdegraded /*String*/ (_value);
 //BA.debugLineNum = 5193;BA.debugLine="End Sub";
return "";
}
public String  _data_setplaybackflowstate(String _statevalue,String _reason) throws Exception{
 //BA.debugLineNum = 5171;BA.debugLine="Public Sub Data_SetPlaybackFlowState(stateValue As";
 //BA.debugLineNum = 5172;BA.debugLine="SetPlaybackFlowState(stateValue, reason)";
_setplaybackflowstate(_statevalue,_reason);
 //BA.debugLineNum = 5173;BA.debugLine="End Sub";
return "";
}
public String  _data_setplayicon() throws Exception{
 //BA.debugLineNum = 5183;BA.debugLine="Public Sub Data_SetPlayIcon";
 //BA.debugLineNum = 5184;BA.debugLine="SetPlayIcon";
_setplayicon();
 //BA.debugLineNum = 5185;BA.debugLine="End Sub";
return "";
}
public String  _data_setstopicon() throws Exception{
 //BA.debugLineNum = 5398;BA.debugLine="Public Sub Data_SetStopIcon";
 //BA.debugLineNum = 5399;BA.debugLine="SetStopIcon";
_setstopicon();
 //BA.debugLineNum = 5400;BA.debugLine="End Sub";
return "";
}
public String  _data_showmessage(String _text) throws Exception{
 //BA.debugLineNum = 5159;BA.debugLine="Public Sub Data_ShowMessage(text As String)";
 //BA.debugLineNum = 5160;BA.debugLine="ShowMessage(text)";
_showmessage(_text);
 //BA.debugLineNum = 5161;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _data_syncofflineplaylistmetadata() throws Exception{
ResumableSub_Data_SyncOfflinePlaylistMetadata rsub = new ResumableSub_Data_SyncOfflinePlaylistMetadata(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Data_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_Data_SyncOfflinePlaylistMetadata(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
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
 //BA.debugLineNum = 5419;BA.debugLine="Wait For (SyncOfflinePlaylistMetadata) Complete (";
parent.__c.WaitFor("complete", ba, this, parent._syncofflineplaylistmetadata());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (Boolean) result[0];
;
 //BA.debugLineNum = 5420;BA.debugLine="Return synced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_synced));return;};
 //BA.debugLineNum = 5421;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _data_traceinfo(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 5135;BA.debugLine="Public Sub Data_TraceInfo(category As String, mess";
 //BA.debugLineNum = 5136;BA.debugLine="TraceInfo(category, message, details)";
_traceinfo(_category,_message,_details);
 //BA.debugLineNum = 5137;BA.debugLine="End Sub";
return "";
}
public String  _data_tracelog(String _message) throws Exception{
 //BA.debugLineNum = 5131;BA.debugLine="Public Sub Data_TraceLog(message As String)";
 //BA.debugLineNum = 5132;BA.debugLine="TraceLog(message)";
_tracelog(_message);
 //BA.debugLineNum = 5133;BA.debugLine="End Sub";
return "";
}
public String  _data_tracewarn(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 5215;BA.debugLine="Public Sub Data_TraceWarn(category As String, mess";
 //BA.debugLineNum = 5216;BA.debugLine="TraceWarn(category, message, details)";
_tracewarn(_category,_message,_details);
 //BA.debugLineNum = 5217;BA.debugLine="End Sub";
return "";
}
public String  _data_writehealthsnapshot(String _trigger) throws Exception{
 //BA.debugLineNum = 5219;BA.debugLine="Public Sub Data_WriteHealthSnapshot(trigger As Str";
 //BA.debugLineNum = 5220;BA.debugLine="WriteHealthSnapshot(trigger)";
_writehealthsnapshot(_trigger);
 //BA.debugLineNum = 5221;BA.debugLine="End Sub";
return "";
}
public String  _dataurlvalue() throws Exception{
 //BA.debugLineNum = 5115;BA.debugLine="Public Sub DataUrlValue As String";
 //BA.debugLineNum = 5116;BA.debugLine="Return DATA_BASE_URL";
if (true) return _data_base_url;
 //BA.debugLineNum = 5117;BA.debugLine="End Sub";
return "";
}
public double  _dbtofactor(double _db) throws Exception{
 //BA.debugLineNum = 4914;BA.debugLine="Private Sub DbToFactor(db As Double) As Double";
 //BA.debugLineNum = 4915;BA.debugLine="If db >= 0 Then Return 1";
if (_db>=0) { 
if (true) return 1;};
 //BA.debugLineNum = 4916;BA.debugLine="Return Power(10, db / 20)";
if (true) return __c.Power(10,_db/(double)20);
 //BA.debugLineNum = 4917;BA.debugLine="End Sub";
return 0;
}
public String  _deferfutureexactbreak(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
int _insertindex = 0;
 //BA.debugLineNum = 3181;BA.debugLine="Private Sub DeferFutureExactBreak(item As Map)";
 //BA.debugLineNum = 3182;BA.debugLine="Dim insertIndex As Int = Min(1, playQueue.Size)";
_insertindex = (int) (__c.Min(1,_playqueue.getSize()));
 //BA.debugLineNum = 3183;BA.debugLine="playQueue.InsertAt(insertIndex, item)";
_playqueue.InsertAt(_insertindex,(Object)(_item.getObject()));
 //BA.debugLineNum = 3184;BA.debugLine="SyncExactBreakState";
_syncexactbreakstate();
 //BA.debugLineNum = 3185;BA.debugLine="RefreshPreparedItemAfterQueueMutation";
_refreshprepareditemafterqueuemutation();
 //BA.debugLineNum = 3186;BA.debugLine="TraceLog(\"брейк exact defer at=\" & ToLongDefault(";
_tracelog("брейк exact defer at="+BA.NumberToString(_tolongdefault(_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1)))+" queue="+BA.NumberToString(_playqueue.getSize()));
 //BA.debugLineNum = 3187;BA.debugLine="End Sub";
return "";
}
public String  _deletehistorypendingfile(String _filename) throws Exception{
int _currentcount = 0;
 //BA.debugLineNum = 3786;BA.debugLine="Private Sub DeleteHistoryPendingFile(fileName As S";
 //BA.debugLineNum = 3787;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 3788;BA.debugLine="If File.Exists(GetHistoryDir, fileName) Then";
if (__c.File.Exists(_gethistorydir(),_filename)) { 
 //BA.debugLineNum = 3789;BA.debugLine="File.Delete(GetHistoryDir, fileName)";
__c.File.Delete(_gethistorydir(),_filename);
 //BA.debugLineNum = 3790;BA.debugLine="Dim currentCount As Int = Max(0, storage.GetDefa";
_currentcount = (int) (__c.Max(0,(double)(BA.ObjectToNumber(_storage._getdefault /*Object*/ ("pending_history_count",(Object)(0))))-1));
 //BA.debugLineNum = 3791;BA.debugLine="storage.Put(\"pending_history_count\", currentCoun";
_storage._put /*String*/ ("pending_history_count",(Object)(_currentcount));
 };
 //BA.debugLineNum = 3793;BA.debugLine="End Sub";
return "";
}
public String  _describeitem(Object _itemobj) throws Exception{
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _parts = null;
 //BA.debugLineNum = 4318;BA.debugLine="Private Sub DescribeItem(itemObj As Object) As Str";
 //BA.debugLineNum = 4319;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
 }else {
 //BA.debugLineNum = 4321;BA.debugLine="Return \"<empty>\"";
if (true) return "<empty>";
 };
 //BA.debugLineNum = 4323;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
 //BA.debugLineNum = 4324;BA.debugLine="If item.IsInitialized = False Then Return \"<empty";
if (_item.IsInitialized()==__c.False) { 
if (true) return "<empty>";};
 //BA.debugLineNum = 4325;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4326;BA.debugLine="parts.Initialize";
_parts.Initialize();
 //BA.debugLineNum = 4327;BA.debugLine="parts.Add(\"тип=\" & item.GetDefault(\"type\", \"\"))";
_parts.Add((Object)("тип="+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")))));
 //BA.debugLineNum = 4328;BA.debugLine="If item.GetDefault(\"id\", \"\") <> \"\" Then parts.Add";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("id="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")))));};
 //BA.debugLineNum = 4329;BA.debugLine="If item.GetDefault(\"title\", \"\") <> \"\" Then parts.";
if ((_item.GetDefault((Object)("title"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("название="+BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)("")))));};
 //BA.debugLineNum = 4330;BA.debugLine="If item.GetDefault(\"stream\", \"\") <> \"\" Then parts";
if ((_item.GetDefault((Object)("stream"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("поток="+BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)("")))));};
 //BA.debugLineNum = 4331;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("сет="+BA.ObjectToString(_item.GetDefault((Object)("set"),(Object)("")))));};
 //BA.debugLineNum = 4332;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("код="+BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")))));};
 //BA.debugLineNum = 4333;BA.debugLine="Return JoinList(parts, \", \")";
if (true) return _joinlist(_parts,", ");
 //BA.debugLineNum = 4334;BA.debugLine="End Sub";
return "";
}
public String  _deviceidvalue() throws Exception{
 //BA.debugLineNum = 5099;BA.debugLine="Public Sub DeviceIdValue As String";
 //BA.debugLineNum = 5100;BA.debugLine="Return deviceId";
if (true) return _deviceid;
 //BA.debugLineNum = 5101;BA.debugLine="End Sub";
return "";
}
public String  _disablecacheaudittimer() throws Exception{
 //BA.debugLineNum = 954;BA.debugLine="Private Sub DisableCacheAuditTimer";
 //BA.debugLineNum = 956;BA.debugLine="ServiceCancelCacheAudit";
_servicecancelcacheaudit();
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _dispatchplaybackadvance(String _initiator,boolean _allowload) throws Exception{
ResumableSub_DispatchPlaybackAdvance rsub = new ResumableSub_DispatchPlaybackAdvance(this,_initiator,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DispatchPlaybackAdvance extends BA.ResumableSub {
public ResumableSub_DispatchPlaybackAdvance(b4a.example.b4xmainpage parent,String _initiator,boolean _allowload) {
this.parent = parent;
this._initiator = _initiator;
this._allowload = _allowload;
}
b4a.example.b4xmainpage parent;
String _initiator;
boolean _allowload;
boolean _advanced = false;

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
 //BA.debugLineNum = 2885;BA.debugLine="Wait For (Facade_DispatchPlaybackAdvanceCore(init";
parent.__c.WaitFor("complete", ba, this, parent._facade_dispatchplaybackadvancecore(_initiator,_allowload));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (Boolean) result[0];
;
 //BA.debugLineNum = 2886;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
 //BA.debugLineNum = 2887;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadappupdateasync(int _targetversion) throws Exception{
ResumableSub_DownloadAppUpdateAsync rsub = new ResumableSub_DownloadAppUpdateAsync(this,_targetversion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadAppUpdateAsync extends BA.ResumableSub {
public ResumableSub_DownloadAppUpdateAsync(b4a.example.b4xmainpage parent,int _targetversion) {
this.parent = parent;
this._targetversion = _targetversion;
}
b4a.example.b4xmainpage parent;
int _targetversion;
String _lastfailurereason = "";
int _attempt = 0;
anywheresoftware.b4a.objects.collections.Map _attemptresult = null;
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 363;BA.debugLine="If isAppUpdateDownloadInProgress Then Return Fals";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._isappupdatedownloadinprogress) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 364;BA.debugLine="isAppUpdateDownloadInProgress = True";
parent._isappupdatedownloadinprogress = parent.__c.True;
 //BA.debugLineNum = 365;BA.debugLine="TraceInfo(\"update\", \"загрузка обновления\", \"targe";
parent._traceinfo("update","загрузка обновления","target="+BA.NumberToString(_targetversion)+" attempts=2");
 //BA.debugLineNum = 366;BA.debugLine="Dim lastFailureReason As String = \"\"";
_lastfailurereason = "";
 //BA.debugLineNum = 367;BA.debugLine="For attempt = 1 To 2";
if (true) break;

case 7:
//for
this.state = 14;
step5 = 1;
limit5 = (int) (2);
_attempt = (int) (1) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 14;
if ((step5 > 0 && _attempt <= limit5) || (step5 < 0 && _attempt >= limit5)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_attempt = ((int)(0 + _attempt + step5)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 368;BA.debugLine="TraceInfo(\"update\", \"попытка загрузки\", \"target=";
parent._traceinfo("update","попытка загрузки","target="+BA.NumberToString(_targetversion)+" attempt="+BA.NumberToString(_attempt));
 //BA.debugLineNum = 369;BA.debugLine="Wait For (TryDownloadAppUpdateOnce(targetVersion";
parent.__c.WaitFor("complete", ba, this, parent._trydownloadappupdateonce(_targetversion,_attempt));
this.state = 17;
return;
case 17:
//C
this.state = 10;
_attemptresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 370;BA.debugLine="If attemptResult.GetDefault(\"success\", False) Th";
if (true) break;

case 10:
//if
this.state = 13;
if (BA.ObjectToBoolean(_attemptresult.GetDefault((Object)("success"),(Object)(parent.__c.False)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 371;BA.debugLine="ClearFailedAppUpdateState";
parent._clearfailedappupdatestate();
 //BA.debugLineNum = 372;BA.debugLine="downloadedAppUpdateVersion = targetVersion";
parent._downloadedappupdateversion = _targetversion;
 //BA.debugLineNum = 373;BA.debugLine="TraceInfo(\"update\", \"обновление загружено\", \"ta";
parent._traceinfo("update","обновление загружено","target="+BA.NumberToString(_targetversion)+" file="+parent._app_update_file);
 //BA.debugLineNum = 374;BA.debugLine="ShowMessage(MessageValue(\"player_updated\"))";
parent._showmessage(parent._messagevalue("player_updated"));
 //BA.debugLineNum = 375;BA.debugLine="TryApplyPendingAppUpdate(\"download_complete\")";
parent._tryapplypendingappupdate("download_complete");
 //BA.debugLineNum = 376;BA.debugLine="isAppUpdateDownloadInProgress = False";
parent._isappupdatedownloadinprogress = parent.__c.False;
 //BA.debugLineNum = 377;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
 //BA.debugLineNum = 379;BA.debugLine="lastFailureReason = attemptResult.GetDefault(\"re";
_lastfailurereason = BA.ObjectToString(_attemptresult.GetDefault((Object)("reason"),(Object)("download_failed")));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 381;BA.debugLine="RememberFailedAppUpdateVersion(targetVersion, las";
parent._rememberfailedappupdateversion(_targetversion,_lastfailurereason,(int) (2));
 //BA.debugLineNum = 382;BA.debugLine="isAppUpdateDownloadInProgress = False";
parent._isappupdatedownloadinprogress = parent.__c.False;
 //BA.debugLineNum = 383;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadofflineplaylistmetadata(anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
ResumableSub_DownloadOfflinePlaylistMetadata rsub = new ResumableSub_DownloadOfflinePlaylistMetadata(this,_descriptor,_cachedplaylistindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_DownloadOfflinePlaylistMetadata(b4a.example.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) {
this.parent = parent;
this._descriptor = _descriptor;
this._cachedplaylistindex = _cachedplaylistindex;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _descriptor;
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex;
String _playlistid = "";
String _playlisturl = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4964;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 4965;BA.debugLine="If playlistId = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((_playlistid).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 4966;BA.debugLine="Dim playlistUrl As String = offlineStoreService.P";
_playlisturl = parent._offlinestoreservice._playlistmetadataurl /*String*/ (_playlistid);
 //BA.debugLineNum = 4967;BA.debugLine="TraceLog(\"метаданные плейлиста fetch начало id=\"";
parent._tracelog("метаданные плейлиста fetch начало id="+_playlistid+" url="+_playlisturl);
 //BA.debugLineNum = 4968;BA.debugLine="Wait For (FetchJsonWithTimeout(playlistUrl, FETCH";
parent.__c.WaitFor("complete", ba, this, parent._fetchjsonwithtimeout(_playlisturl,parent._fetch_timeout_ms));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 4969;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 7:
//if
this.state = 10;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4970;BA.debugLine="TraceLog(\"метаданные плейлиста fetch ошибка id=\"";
parent._tracelog("метаданные плейлиста fetch ошибка id="+_playlistid+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
 //BA.debugLineNum = 4971;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 4973;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
 //BA.debugLineNum = 4974;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_resultdata instanceof java.util.Map) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 4976;BA.debugLine="TraceLog(\"метаданные плейлиста fetch ошибка id=\"";
parent._tracelog("метаданные плейлиста fetch ошибка id="+_playlistid+" reason=not_map");
 //BA.debugLineNum = 4977;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 4979;BA.debugLine="Dim playlistData As Map = resultData";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
 //BA.debugLineNum = 4980;BA.debugLine="offlineStoreService.SavePlaylistMetadata(descript";
parent._offlinestoreservice._saveplaylistmetadata /*String*/ (_descriptor,_playlistdata,_cachedplaylistindex);
 //BA.debugLineNum = 4981;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 4982;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public long  _effectivenowticks() throws Exception{
long _devicenow = 0L;
long _trustedbaseticks = 0L;
long _trustedlocalbaseticks = 0L;
long _elapsedsincesync = 0L;
long _trustednow = 0L;
 //BA.debugLineNum = 5049;BA.debugLine="Private Sub EffectiveNowTicks As Long";
 //BA.debugLineNum = 5050;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
_devicenow = __c.DateTime.getNow();
 //BA.debugLineNum = 5051;BA.debugLine="Dim trustedBaseTicks As Long = storage.GetDefault";
_trustedbaseticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (_trustedsynctimekey,(Object)(0)));
 //BA.debugLineNum = 5052;BA.debugLine="Dim trustedLocalBaseTicks As Long = storage.GetDe";
_trustedlocalbaseticks = BA.ObjectToLongNumber(_storage._getdefault /*Object*/ (_trustedsynclocaltimekey,(Object)(0)));
 //BA.debugLineNum = 5053;BA.debugLine="If trustedBaseTicks > 0 And trustedLocalBaseTicks";
if (_trustedbaseticks>0 && _trustedlocalbaseticks>0) { 
 //BA.debugLineNum = 5054;BA.debugLine="Dim elapsedSinceSync As Long = Max(0, deviceNow";
_elapsedsincesync = (long) (__c.Max(0,_devicenow-_trustedlocalbaseticks));
 //BA.debugLineNum = 5055;BA.debugLine="Dim trustedNow As Long = trustedBaseTicks + elap";
_trustednow = (long) (_trustedbaseticks+_elapsedsincesync);
 //BA.debugLineNum = 5056;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
 };
 //BA.debugLineNum = 5058;BA.debugLine="Dim trustedNow As Long = trustedBaseTicks";
_trustednow = _trustedbaseticks;
 //BA.debugLineNum = 5059;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
 //BA.debugLineNum = 5060;BA.debugLine="Return deviceNow";
if (true) return _devicenow;
 //BA.debugLineNum = 5061;BA.debugLine="End Sub";
return 0L;
}
public long  _effectivetrackremainms() throws Exception{
long _trackremain = 0L;
String _activeaudiokey = "";
b4a.example.audioplayer _activeaudio = null;
long _breakremain = 0L;
 //BA.debugLineNum = 3512;BA.debugLine="Private Sub EffectiveTrackRemainMs As Long";
 //BA.debugLineNum = 3513;BA.debugLine="Dim trackRemain As Long = 0";
_trackremain = (long) (0);
 //BA.debugLineNum = 3514;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = _transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 3515;BA.debugLine="If activeAudioKey <> \"\" Then";
if ((_activeaudiokey).equals("") == false) { 
 //BA.debugLineNum = 3516;BA.debugLine="Dim activeAudio As AudioPlayer = GetAudioByKey(a";
_activeaudio = _getaudiobykey(_activeaudiokey);
 //BA.debugLineNum = 3517;BA.debugLine="If activeAudio.Duration > 0 Then trackRemain = a";
if (_activeaudio._duration /*long*/ ()>0) { 
_trackremain = (long) (_activeaudio._duration /*long*/ ()-_activeaudio._position /*long*/ ());};
 };
 //BA.debugLineNum = 3519;BA.debugLine="If scheduledBreakAt <= 0 Then Return trackRemain";
if (_scheduledbreakat<=0) { 
if (true) return _trackremain;};
 //BA.debugLineNum = 3520;BA.debugLine="Dim breakRemain As Long = (scheduledBreakAt - Loc";
_breakremain = (long) ((_scheduledbreakat-_localnowtimestamp())*1000);
 //BA.debugLineNum = 3521;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
if (_trackremain<=0) { 
if (true) return _breakremain;};
 //BA.debugLineNum = 3522;BA.debugLine="Return Min(trackRemain, breakRemain)";
if (true) return (long) (__c.Min(_trackremain,_breakremain));
 //BA.debugLineNum = 3523;BA.debugLine="End Sub";
return 0L;
}
public void  _ensureadcachesyncasync() throws Exception{
ResumableSub_EnsureAdCacheSyncAsync rsub = new ResumableSub_EnsureAdCacheSyncAsync(this);
rsub.resume(ba, null);
}
public static class ResumableSub_EnsureAdCacheSyncAsync extends BA.ResumableSub {
public ResumableSub_EnsureAdCacheSyncAsync(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
boolean _downloaded = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1000;BA.debugLine="If isStartupSequenceInProgress Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._isstartupsequenceinprogress) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1001;BA.debugLine="isAdWarmupDeferredAfterStartup = True";
parent._isadwarmupdeferredafterstartup = parent.__c.True;
 //BA.debugLineNum = 1002;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1004;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = parent._statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 1005;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if (_offlinedata.IsInitialized()==parent.__c.False) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1006;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if (true) break;

case 11:
//if
this.state = 16;
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) == false) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) return ;
if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 1007;BA.debugLine="Wait For (mediaCacheService.EnsureAdsCached(offli";
parent.__c.WaitFor("complete", ba, this, parent._mediacacheservice._ensureadscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_offlinedata));
this.state = 17;
return;
case 17:
//C
this.state = -1;
_downloaded = (Boolean) result[0];
;
 //BA.debugLineNum = 1008;BA.debugLine="UpdateMediaConnectivityStateFromCacheSync(downloa";
parent._updatemediaconnectivitystatefromcachesync(_downloaded);
 //BA.debugLineNum = 1009;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _ensuredirectory(String _path) throws Exception{
anywheresoftware.b4j.object.JavaObject _jofile = null;
 //BA.debugLineNum = 2471;BA.debugLine="Private Sub EnsureDirectory(path As String)";
 //BA.debugLineNum = 2472;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 2473;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
 //BA.debugLineNum = 2474;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
 //BA.debugLineNum = 2475;BA.debugLine="End Sub";
return "";
}
public String  _enteraudiooutputrecoverypause(String _message) throws Exception{
String _safemessage = "";
 //BA.debugLineNum = 2345;BA.debugLine="Private Sub EnterAudioOutputRecoveryPause(message";
 //BA.debugLineNum = 2346;BA.debugLine="Dim safeMessage As String = message";
_safemessage = _message;
 //BA.debugLineNum = 2347;BA.debugLine="If safeMessage = \"\" Then safeMessage = MessageVal";
if ((_safemessage).equals("")) { 
_safemessage = _messagevalue("audio_device_check");};
 //BA.debugLineNum = 2348;BA.debugLine="TraceWarn(\"audio\", \"output pause\", \"message=\" & s";
_tracewarn("audio","output pause","message="+_safemessage+" errors="+BA.NumberToString(_consecutiveaudiooutputerrors));
 //BA.debugLineNum = 2349;BA.debugLine="isAudioOutputRecoveryPause = True";
_isaudiooutputrecoverypause = __c.True;
 //BA.debugLineNum = 2350;BA.debugLine="EnterPolicyPauseState(safeMessage, \"audio\")";
_enterpolicypausestate(_safemessage,"audio");
 //BA.debugLineNum = 2351;BA.debugLine="ScheduleRetry(\"audio_device\", AUDIO_OUTPUT_RETRY_";
_scheduleretry("audio_device",_audio_output_retry_delay_ms);
 //BA.debugLineNum = 2352;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypausestate(String _reason,String _connectionmode) throws Exception{
 //BA.debugLineNum = 2333;BA.debugLine="Private Sub EnterPolicyPauseState(reason As String";
 //BA.debugLineNum = 2334;BA.debugLine="TraceLog(\"policy pause reason=\" & reason & \" mode";
_tracelog("policy pause reason="+_reason+" mode="+_connectionmode);
 //BA.debugLineNum = 2335;BA.debugLine="SetPlaybackFlowState(FLOW_PAUSED_POLICY, \"policy_";
_setplaybackflowstate(_flow_paused_policy,"policy_pause");
 //BA.debugLineNum = 2336;BA.debugLine="dataPolicyState.EnterPolicyPause(connectionMode)";
_datapolicystate._enterpolicypause /*String*/ (_connectionmode);
 //BA.debugLineNum = 2337;BA.debugLine="orchestrationState.EnterPolicyPausedState";
_orchestrationstate._enterpolicypausedstate /*String*/ ();
 //BA.debugLineNum = 2338;BA.debugLine="RefreshConnectionIndicatorState";
_refreshconnectionindicatorstate();
 //BA.debugLineNum = 2339;BA.debugLine="ClearPlaybackState";
_clearplaybackstate();
 //BA.debugLineNum = 2340;BA.debugLine="HidePin";
_hidepin();
 //BA.debugLineNum = 2341;BA.debugLine="SetStopIcon";
_setstopicon();
 //BA.debugLineNum = 2342;BA.debugLine="ShowMessage(reason)";
_showmessage(_reason);
 //BA.debugLineNum = 2343;BA.debugLine="End Sub";
return "";
}
public String  _executeautostartcommand() throws Exception{
 //BA.debugLineNum = 1239;BA.debugLine="Private Sub ExecuteAutoStartCommand";
 //BA.debugLineNum = 1240;BA.debugLine="AutoStartSavedPlayer";
_autostartsavedplayer();
 //BA.debugLineNum = 1241;BA.debugLine="End Sub";
return "";
}
public String  _executeclaimconfirmnocommand() throws Exception{
 //BA.debugLineNum = 1530;BA.debugLine="Private Sub ExecuteClaimConfirmNoCommand";
 //BA.debugLineNum = 1531;BA.debugLine="HidePin";
_hidepin();
 //BA.debugLineNum = 1532;BA.debugLine="ApplyStoppedState";
_applystoppedstate();
 //BA.debugLineNum = 1533;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executeclaimconfirmyescommand() throws Exception{
ResumableSub_ExecuteClaimConfirmYesCommand rsub = new ResumableSub_ExecuteClaimConfirmYesCommand(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteClaimConfirmYesCommand extends BA.ResumableSub {
public ResumableSub_ExecuteClaimConfirmYesCommand(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

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
 //BA.debugLineNum = 1526;BA.debugLine="Wait For (SubmitClaim) Complete (unused As Boolea";
parent.__c.WaitFor("complete", ba, this, parent._submitclaim());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1527;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1528;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executelogoutplayercommand() throws Exception{
ResumableSub_ExecuteLogoutPlayerCommand rsub = new ResumableSub_ExecuteLogoutPlayerCommand(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteLogoutPlayerCommand extends BA.ResumableSub {
public ResumableSub_ExecuteLogoutPlayerCommand(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

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
 //BA.debugLineNum = 1724;BA.debugLine="SaveValue(\"player_code\", \"\")";
parent._savevalue("player_code",(Object)(""));
 //BA.debugLineNum = 1725;BA.debugLine="playerCode = \"\"";
parent._playercode = "";
 //BA.debugLineNum = 1726;BA.debugLine="Wait For (StopPlayer) Complete (unused As Boolean";
parent.__c.WaitFor("complete", ba, this, parent._stopplayer());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1727;BA.debugLine="ShowMessage(\"\")";
parent._showmessage("");
 //BA.debugLineNum = 1728;BA.debugLine="ExecuteShowSetupScreenCommand(\"\")";
parent._executeshowsetupscreencommand("");
 //BA.debugLineNum = 1729;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1730;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _executemanualstartcommand() throws Exception{
 //BA.debugLineNum = 1243;BA.debugLine="Private Sub ExecuteManualStartCommand";
 //BA.debugLineNum = 1244;BA.debugLine="CallSubDelayed(Me, \"StartFirstTrackManualAsync\")";
__c.CallSubDelayed(ba,this,"StartFirstTrackManualAsync");
 //BA.debugLineNum = 1245;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executeplaybacktickdecision(anywheresoftware.b4a.objects.collections.Map _decision) throws Exception{
ResumableSub_ExecutePlaybackTickDecision rsub = new ResumableSub_ExecutePlaybackTickDecision(this,_decision);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecutePlaybackTickDecision extends BA.ResumableSub {
public ResumableSub_ExecutePlaybackTickDecision(b4a.example.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _decision) {
this.parent = parent;
this._decision = _decision;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _decision;
String _actionname = "";
long _remain = 0L;
String _actionreason = "";
boolean _unusedbreak = false;
b4a.example.playbackplayerslot _preparedslot = null;
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
boolean _advanced = false;
boolean _prefetchok = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1863;BA.debugLine="Dim actionName As String = decision.GetDefault(\"a";
_actionname = BA.ObjectToString(_decision.GetDefault((Object)("action"),(Object)("")));
 //BA.debugLineNum = 1864;BA.debugLine="Dim remain As Long = decision.GetDefault(\"remainM";
_remain = BA.ObjectToLongNumber(_decision.GetDefault((Object)("remainMs"),(Object)(0)));
 //BA.debugLineNum = 1865;BA.debugLine="Dim actionReason As String = decision.GetDefault(";
_actionreason = BA.ObjectToString(_decision.GetDefault((Object)("reason"),(Object)("")));
 //BA.debugLineNum = 1866;BA.debugLine="Select actionName";
if (true) break;

case 1:
//select
this.state = 24;
switch (BA.switchObjectToInt(_actionname,"trigger_break","crossfade_prepared_track","start_prepared_tail","advance_boundary","prefetch_next")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
case 3: {
this.state = 15;
if (true) break;
}
case 4: {
this.state = 17;
if (true) break;
}
default: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 24;
 //BA.debugLineNum = 1868;BA.debugLine="TraceInfo(\"playback\", \"вставлен break\", \"mode=e";
parent._traceinfo("playback","вставлен break","mode=exact");
 //BA.debugLineNum = 1869;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unusedB";
parent.__c.WaitFor("complete", ba, this, parent._fadeoutandcontinue());
this.state = 25;
return;
case 25:
//C
this.state = 24;
_unusedbreak = (Boolean) result[0];
;
 //BA.debugLineNum = 1870;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 1872;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = direct";
_preparedslot = parent._directorstate._getpreparedslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1873;BA.debugLine="Dim preparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1874;BA.debugLine="If preparedSlot.IsInitialized Then";
if (true) break;

case 6:
//if
this.state = 11;
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 //BA.debugLineNum = 1875;BA.debugLine="preparedItem = preparedSlot.Item";
_prepareditem = _preparedslot._item /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 1877;BA.debugLine="preparedItem.Initialize";
_prepareditem.Initialize();
 if (true) break;

case 11:
//C
this.state = 24;
;
 //BA.debugLineNum = 1879;BA.debugLine="TraceInfo(\"playback\", \"crossfade trigger\", \"rem";
parent._traceinfo("playback","crossfade trigger","remainMs="+BA.NumberToString(_remain)+" next="+parent._tracetrackvalue(_prepareditem));
 //BA.debugLineNum = 1880;BA.debugLine="orchestrationState.IsCrossfadeTriggered = True";
parent._orchestrationstate._iscrossfadetriggered /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 1881;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepare";
parent._promotepreparedplayer(parent._preparedfadeinms(),parent._preparedfadeoutms());
 //BA.debugLineNum = 1882;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 13:
//C
this.state = 24;
 //BA.debugLineNum = 1884;BA.debugLine="orchestrationState.IsCrossfadeTriggered = True";
parent._orchestrationstate._iscrossfadetriggered /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 1885;BA.debugLine="TraceInfo(\"playback\", \"вставлена реклама\", \"que";
parent._traceinfo("playback","вставлена реклама","queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 1886;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepare";
parent._promotepreparedplayer(parent._preparedfadeinms(),parent._preparedfadeoutms());
 //BA.debugLineNum = 1887;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 15:
//C
this.state = 24;
 //BA.debugLineNum = 1889;BA.debugLine="TraceInfo(\"playback\", \"boundary trigger\", \"rema";
parent._traceinfo("playback","boundary trigger","remainMs="+BA.NumberToString(_remain)+" current="+parent._tracetrackvalue(parent._transition_getdirectoractiveitem())+" prepared="+parent._tracetrackvalue(parent._transition_getdirectorprepareditem())+" queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 1890;BA.debugLine="Wait For (AdvancePlaybackAtTransitionBoundary(\"";
parent.__c.WaitFor("complete", ba, this, parent._advanceplaybackattransitionboundary("transition_boundary"));
this.state = 26;
return;
case 26:
//C
this.state = 24;
_advanced = (Boolean) result[0];
;
 //BA.debugLineNum = 1891;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 1893;BA.debugLine="If actionReason <> \"\" Then";
if (true) break;

case 18:
//if
this.state = 21;
if ((_actionreason).equals("") == false) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 1894;BA.debugLine="TraceInfo(\"playback\", \"prefetch trigger\", \"rea";
parent._traceinfo("playback","prefetch trigger","reason="+_actionreason+" queue="+BA.NumberToString(parent._playqueue.getSize())+" current="+parent._tracetrackvalue(parent._transition_getdirectoractiveitem()));
 if (true) break;

case 21:
//C
this.state = 24;
;
 //BA.debugLineNum = 1896;BA.debugLine="orchestrationState.PrefetchDone = True";
parent._orchestrationstate._prefetchdone /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 1897;BA.debugLine="Wait For (PrefetchNext) Complete (prefetchOk As";
parent.__c.WaitFor("complete", ba, this, parent._prefetchnext());
this.state = 27;
return;
case 27:
//C
this.state = 24;
_prefetchok = (Boolean) result[0];
;
 //BA.debugLineNum = 1898;BA.debugLine="Return prefetchOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prefetchok));return;};
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 1900;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
 //BA.debugLineNum = 1902;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _executeplaybuttoncommand() throws Exception{
 //BA.debugLineNum = 1490;BA.debugLine="Private Sub ExecutePlayButtonCommand";
 //BA.debugLineNum = 1491;BA.debugLine="If playerCode = \"\" Then";
if ((_playercode).equals("")) { 
 //BA.debugLineNum = 1492;BA.debugLine="ExecuteShowSetupScreenCommand(MessageValue(\"play";
_executeshowsetupscreencommand(_messagevalue("player_required"));
 //BA.debugLineNum = 1493;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1495;BA.debugLine="If orchestrationState.IsStarted = False And IsPol";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False && _ispolicypausestate()==__c.False && _isuserstoppedstate()) { 
 //BA.debugLineNum = 1496;BA.debugLine="If orchestrationState.IsStopping Then";
if (_orchestrationstate._isstopping /*boolean*/ ) { 
 //BA.debugLineNum = 1497;BA.debugLine="TraceLog(\"возобновление запрет reason=manual_st";
_tracelog("возобновление запрет reason=manual_start state=stopping");
 //BA.debugLineNum = 1498;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1500;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";
if (_isplaybackallowedbycurrentdata()==__c.False) { 
 //BA.debugLineNum = 1501;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReaso";
_pauseplaybackbypolicy(_resolveplaybackblockreason(_statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ()),"server");
 //BA.debugLineNum = 1502;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1504;BA.debugLine="TraceLog(\"возобновление итог mode=manual_start\")";
_tracelog("возобновление итог mode=manual_start");
 //BA.debugLineNum = 1505;BA.debugLine="orchestrationState.EnterStartedState";
_orchestrationstate._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 1506;BA.debugLine="dataPolicyState.ClearPolicyPause";
_datapolicystate._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 1507;BA.debugLine="SetStopIcon";
_setstopicon();
 //BA.debugLineNum = 1508;BA.debugLine="HideContentBlocks";
_hidecontentblocks();
 //BA.debugLineNum = 1509;BA.debugLine="RequestManualStartCommand";
_requestmanualstartcommand();
 //BA.debugLineNum = 1510;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1512;BA.debugLine="If CanStopPlaybackNow(True) = False Then Return";
if (_canstopplaybacknow(__c.True)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1513;BA.debugLine="RequestStopCommand";
_requeststopcommand();
 //BA.debugLineNum = 1514;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executesetupsubmitcommand() throws Exception{
ResumableSub_ExecuteSetupSubmitCommand rsub = new ResumableSub_ExecuteSetupSubmitCommand(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteSetupSubmitCommand extends BA.ResumableSub {
public ResumableSub_ExecuteSetupSubmitCommand(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;
boolean _unused2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1517;BA.debugLine="If appScreenMode = \"settings\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._appscreenmode).equals("settings")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1518;BA.debugLine="Wait For (ExecuteLogoutPlayerCommand) Complete (";
parent.__c.WaitFor("complete", ba, this, parent._executelogoutplayercommand());
this.state = 5;
return;
case 5:
//C
this.state = 4;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1519;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1521;BA.debugLine="Wait For (ExecuteSubmitPlayerCodeCommand) Complet";
parent.__c.WaitFor("complete", ba, this, parent._executesubmitplayercodecommand());
this.state = 6;
return;
case 6:
//C
this.state = -1;
_unused2 = (Boolean) result[0];
;
 //BA.debugLineNum = 1522;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1523;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _executeshowplayerscreencommand(boolean _refreshinfo) throws Exception{
 //BA.debugLineNum = 1486;BA.debugLine="Private Sub ExecuteShowPlayerScreenCommand(refresh";
 //BA.debugLineNum = 1487;BA.debugLine="ShowPlayerScreen(refreshInfo)";
_showplayerscreen(_refreshinfo);
 //BA.debugLineNum = 1488;BA.debugLine="End Sub";
return "";
}
public String  _executeshowsettingsscreencommand() throws Exception{
 //BA.debugLineNum = 1482;BA.debugLine="Private Sub ExecuteShowSettingsScreenCommand";
 //BA.debugLineNum = 1483;BA.debugLine="ShowSettingsScreen";
_showsettingsscreen();
 //BA.debugLineNum = 1484;BA.debugLine="End Sub";
return "";
}
public String  _executeshowsetupscreencommand(String _text) throws Exception{
 //BA.debugLineNum = 1478;BA.debugLine="Private Sub ExecuteShowSetupScreenCommand(text As";
 //BA.debugLineNum = 1479;BA.debugLine="ShowSetupScreen(text)";
_showsetupscreen(_text);
 //BA.debugLineNum = 1480;BA.debugLine="End Sub";
return "";
}
public String  _executestopcommand() throws Exception{
 //BA.debugLineNum = 1247;BA.debugLine="Private Sub ExecuteStopCommand";
 //BA.debugLineNum = 1248;BA.debugLine="CallSubDelayed(Me, \"StopPlayerAsync\")";
__c.CallSubDelayed(ba,this,"StopPlayerAsync");
 //BA.debugLineNum = 1249;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executesubmitplayercodecommand() throws Exception{
ResumableSub_ExecuteSubmitPlayerCodeCommand rsub = new ResumableSub_ExecuteSubmitPlayerCodeCommand(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteSubmitPlayerCodeCommand extends BA.ResumableSub {
public ResumableSub_ExecuteSubmitPlayerCodeCommand(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
String _nextplayer = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1708;BA.debugLine="Dim nextPlayer As String = NormalizePlayerCode(tx";
_nextplayer = parent._normalizeplayercode(parent._txtplayercode.getText());
 //BA.debugLineNum = 1709;BA.debugLine="If nextPlayer = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_nextplayer).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1710;BA.debugLine="ExecuteShowSetupScreenCommand(MessageValue(\"setu";
parent._executeshowsetupscreencommand(parent._messagevalue("setup_invalid"));
 //BA.debugLineNum = 1711;BA.debugLine="txtPlayerCode.RequestFocus";
parent._txtplayercode.RequestFocus();
 //BA.debugLineNum = 1712;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1714;BA.debugLine="playerCode = nextPlayer";
parent._playercode = _nextplayer;
 //BA.debugLineNum = 1715;BA.debugLine="SaveValue(\"player_code\", playerCode)";
parent._savevalue("player_code",(Object)(parent._playercode));
 //BA.debugLineNum = 1716;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
parent._txtplayercode.setText(BA.ObjectToCharSequence(parent._formatplayercodefordisplay(parent._playercode)));
 //BA.debugLineNum = 1717;BA.debugLine="StartOfflineDataRefresh";
parent._startofflinedatarefresh();
 //BA.debugLineNum = 1718;BA.debugLine="ExecuteShowPlayerScreenCommand(True)";
parent._executeshowplayerscreencommand(parent.__c.True);
 //BA.debugLineNum = 1719;BA.debugLine="RequestAutoStartCommand";
parent._requestautostartcommand();
 //BA.debugLineNum = 1720;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1721;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _exitplaybackdispatch(boolean _result) throws Exception{
 //BA.debugLineNum = 2448;BA.debugLine="Private Sub ExitPlaybackDispatch(result As Boolean";
 //BA.debugLineNum = 2449;BA.debugLine="TraceLog(\"переход dispatch итог initiator=\" & orc";
_tracelog("переход dispatch итог initiator="+_orchestrationstate._activedispatchinitiator /*String*/ +" result="+BA.ObjectToString(_result)+" stage="+_playbackflowstate+" queue="+BA.NumberToString(_playqueue.getSize()));
 //BA.debugLineNum = 2450;BA.debugLine="orchestrationState.EndDispatch";
_orchestrationstate._enddispatch /*String*/ ();
 //BA.debugLineNum = 2451;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 2452;BA.debugLine="End Sub";
return false;
}
public long  _extractcontentlength(b4a.example.httpjob _j) throws Exception{
anywheresoftware.b4a.objects.collections.List _headerslist = null;
 //BA.debugLineNum = 490;BA.debugLine="Private Sub ExtractContentLength(j As HttpJob) As";
 //BA.debugLineNum = 491;BA.debugLine="Try";
try { //BA.debugLineNum = 492;BA.debugLine="Dim headersList As List = j.Response.GetHeaders.";
_headerslist = new anywheresoftware.b4a.objects.collections.List();
_headerslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders().Get((Object)("Content-Length"))));
 //BA.debugLineNum = 493;BA.debugLine="If headersList.IsInitialized = False Or headersL";
if (_headerslist.IsInitialized()==__c.False || _headerslist.getSize()==0) { 
_headerslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders().Get((Object)("content-length"))));};
 //BA.debugLineNum = 494;BA.debugLine="If headersList.IsInitialized = False Or headersL";
if (_headerslist.IsInitialized()==__c.False || _headerslist.getSize()==0) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 495;BA.debugLine="Return ToLongDefault(headersList.Get(0), 0)";
if (true) return _tolongdefault(_headerslist.Get((int) (0)),(long) (0));
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 497;BA.debugLine="ConsumeLastException";
_consumelastexception();
 //BA.debugLineNum = 498;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return 0L;
}
public String  _facade_completestartupsequencecore() throws Exception{
 //BA.debugLineNum = 1205;BA.debugLine="Public Sub Facade_CompleteStartupSequenceCore";
 //BA.debugLineNum = 1206;BA.debugLine="If isStartupSequenceInProgress = False Then Retur";
if (_isstartupsequenceinprogress==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1207;BA.debugLine="isStartupSequenceInProgress = False";
_isstartupsequenceinprogress = __c.False;
 //BA.debugLineNum = 1208;BA.debugLine="stateStore.SetStartupSequenceInProgress(False)";
_statestore._setstartupsequenceinprogress /*String*/ (__c.False);
 //BA.debugLineNum = 1209;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_START_DELAY_M";
_schedulecacheauditafter(_cache_audit_start_delay_ms);
 //BA.debugLineNum = 1210;BA.debugLine="TraceInfo(\"player\", \"старт завершен\", \"stage=\" &";
_traceinfo("player","старт завершен","stage="+_playbackflowstate);
 //BA.debugLineNum = 1211;BA.debugLine="RunDeferredPostStartTasksAsync";
_rundeferredpoststarttasksasync();
 //BA.debugLineNum = 1212;BA.debugLine="WriteHealthSnapshot(\"старт\")";
_writehealthsnapshot("старт");
 //BA.debugLineNum = 1213;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1214;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_dispatchplaybackadvancecore(String _initiator,boolean _allowload) throws Exception{
ResumableSub_Facade_DispatchPlaybackAdvanceCore rsub = new ResumableSub_Facade_DispatchPlaybackAdvanceCore(this,_initiator,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_DispatchPlaybackAdvanceCore extends BA.ResumableSub {
public ResumableSub_Facade_DispatchPlaybackAdvanceCore(b4a.example.b4xmainpage parent,String _initiator,boolean _allowload) {
this.parent = parent;
this._initiator = _initiator;
this._allowload = _allowload;
}
b4a.example.b4xmainpage parent;
String _initiator;
boolean _allowload;
anywheresoftware.b4a.objects.collections.Map _dispatchdecision = null;
String _actionname = "";
anywheresoftware.b4a.objects.collections.Map _directitem = null;
boolean _queueprepared = false;
int _directretryafter = 0;
boolean _continuedirect = false;
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
int _retryafter = 0;
boolean _continuequeue = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2890;BA.debugLine="If TryEnterPlaybackDispatch(initiator) = False Th";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._tryenterplaybackdispatch(_initiator)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 2891;BA.debugLine="TraceInfo(\"playback\", \"dispatch переход\", \"initia";
parent._traceinfo("playback","dispatch переход","initiator="+_initiator+" queue="+BA.NumberToString(parent._playqueue.getSize())+" prepared="+parent._haspreparedslotfortrace());
 //BA.debugLineNum = 2892;BA.debugLine="Do While playbackFlowState <> FLOW_STOPPING";
if (true) break;

case 7:
//do while
this.state = 64;
while ((parent._playbackflowstate).equals(parent._flow_stopping) == false) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 2893;BA.debugLine="Dim dispatchDecision As Map = ResolveDispatchDec";
_dispatchdecision = new anywheresoftware.b4a.objects.collections.Map();
_dispatchdecision = parent._resolvedispatchdecision(_allowload);
 //BA.debugLineNum = 2894;BA.debugLine="Dim actionName As String = dispatchDecision.GetD";
_actionname = BA.ObjectToString(_dispatchdecision.GetDefault((Object)("action"),(Object)("")));
 //BA.debugLineNum = 2895;BA.debugLine="directorState.BeginDecision(\"dispatch:\" & action";
parent._directorstate._begindecision /*String*/ ("dispatch:"+_actionname);
 //BA.debugLineNum = 2896;BA.debugLine="Select actionName";
if (true) break;

case 10:
//select
this.state = 63;
switch (BA.switchObjectToInt(_actionname,"use_prepared","play_direct_local","play_queue_item","populate_queue")) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
case 2: {
this.state = 36;
if (true) break;
}
case 3: {
this.state = 54;
if (true) break;
}
default: {
this.state = 62;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 63;
 //BA.debugLineNum = 2898;BA.debugLine="TraceInfo(\"playback\", \"dispatch prepared\", \"in";
parent._traceinfo("playback","dispatch prepared","initiator="+_initiator);
 //BA.debugLineNum = 2899;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 2900;BA.debugLine="Return ExitPlaybackDispatch(PromotePreparedPla";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent._promotepreparedplayer((int) (0),(int) (0)))));return;};
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 2902;BA.debugLine="Dim directItem As Map = offlinePlaybackCore.Re";
_directitem = new anywheresoftware.b4a.objects.collections.Map();
_directitem = parent._offlineplaybackcore._resolvenextmusicitem /*anywheresoftware.b4a.objects.collections.Map*/ (parent._statestore);
 //BA.debugLineNum = 2903;BA.debugLine="If directItem.IsInitialized = False Or directI";
if (true) break;

case 15:
//if
this.state = 28;
if (_directitem.IsInitialized()==parent.__c.False || _directitem.getSize()==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 2904;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 2905;BA.debugLine="If allowLoad Then";
if (true) break;

case 18:
//if
this.state = 27;
if (_allowload) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 2906;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (q";
parent.__c.WaitFor("complete", ba, this, parent._populateplaybackqueue());
this.state = 65;
return;
case 65:
//C
this.state = 21;
_queueprepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2907;BA.debugLine="If queuePrepared = False Then Return ExitPla";
if (true) break;

case 21:
//if
this.state = 26;
if (_queueprepared==parent.__c.False) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.False)));return;};
if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 2908;BA.debugLine="Continue";
this.state = 63;
if (true) break;;
 if (true) break;

case 27:
//C
this.state = 28;
;
 //BA.debugLineNum = 2910;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.False)));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 2912;BA.debugLine="TraceInfo(\"playback\", \"dispatch next\", \"mode=d";
parent._traceinfo("playback","dispatch next","mode=direct_local type="+BA.ObjectToString(_directitem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_directitem.GetDefault((Object)("id"),(Object)(""))));
 //BA.debugLineNum = 2913;BA.debugLine="Dim directRetryAfter As Int = stateStore.Consu";
_directretryafter = parent._statestore._consumedispatchretryafter /*int*/ ();
 //BA.debugLineNum = 2914;BA.debugLine="Wait For (PlayQueueItem(directItem, directRetr";
parent.__c.WaitFor("complete", ba, this, parent._playqueueitem((Object)(_directitem.getObject()),_directretryafter));
this.state = 66;
return;
case 66:
//C
this.state = 29;
_continuedirect = (Boolean) result[0];
;
 //BA.debugLineNum = 2915;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 2916;BA.debugLine="If continueDirect = False Then Return ExitPlay";
if (true) break;

case 29:
//if
this.state = 34;
if (_continuedirect==parent.__c.False) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.True)));return;};
if (true) break;

case 34:
//C
this.state = 63;
;
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 2918;BA.debugLine="Dim nextObject As Object = ShiftDispatchableQu";
_nextobject = parent._shiftdispatchablequeueitem();
 //BA.debugLineNum = 2919;BA.debugLine="If nextObject Is Map Then";
if (true) break;

case 37:
//if
this.state = 46;
if (_nextobject instanceof java.util.Map) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 2920;BA.debugLine="Dim nextItem As Map = nextObject";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
 //BA.debugLineNum = 2921;BA.debugLine="If nextItem.GetDefault(\"type\", \"\") = \"break\"";
if (true) break;

case 40:
//if
this.state = 45;
if ((_nextitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break"))) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
 //BA.debugLineNum = 2922;BA.debugLine="TraceInfo(\"playback\", \"dispatch break\", \"que";
parent._traceinfo("playback","dispatch break","queue="+BA.NumberToString(parent._playqueue.getSize())+" exact="+BA.ObjectToString(_nextitem.GetDefault((Object)("exactly"),(Object)(parent.__c.False))));
 if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 2924;BA.debugLine="TraceInfo(\"playback\", \"dispatch next\", \"type";
parent._traceinfo("playback","dispatch next","type="+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_nextitem.GetDefault((Object)("id"),(Object)(""))));
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 47;
;
 //BA.debugLineNum = 2927;BA.debugLine="Dim retryAfter As Int = stateStore.ConsumeDisp";
_retryafter = parent._statestore._consumedispatchretryafter /*int*/ ();
 //BA.debugLineNum = 2928;BA.debugLine="Wait For (PlayQueueItem(nextObject, retryAfter";
parent.__c.WaitFor("complete", ba, this, parent._playqueueitem(_nextobject,_retryafter));
this.state = 67;
return;
case 67:
//C
this.state = 47;
_continuequeue = (Boolean) result[0];
;
 //BA.debugLineNum = 2929;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 2930;BA.debugLine="If continueQueue = False Then Return ExitPlayb";
if (true) break;

case 47:
//if
this.state = 52;
if (_continuequeue==parent.__c.False) { 
this.state = 49;
;}if (true) break;

case 49:
//C
this.state = 52;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.True)));return;};
if (true) break;

case 52:
//C
this.state = 63;
;
 if (true) break;

case 54:
//C
this.state = 55;
 //BA.debugLineNum = 2932;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (que";
parent.__c.WaitFor("complete", ba, this, parent._populateplaybackqueue());
this.state = 68;
return;
case 68:
//C
this.state = 55;
_queueprepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2933;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 2934;BA.debugLine="If queuePrepared = False Then Return ExitPlayb";
if (true) break;

case 55:
//if
this.state = 60;
if (_queueprepared==parent.__c.False) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.False)));return;};
if (true) break;

case 60:
//C
this.state = 63;
;
 if (true) break;

case 62:
//C
this.state = 63;
 //BA.debugLineNum = 2936;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 2937;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.False)));return;};
 if (true) break;

case 63:
//C
this.state = 7;
;
 if (true) break;

case 64:
//C
this.state = -1;
;
 //BA.debugLineNum = 2940;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._exitplaybackdispatch(parent.__c.False)));return;};
 //BA.debugLineNum = 2941;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_loadnextandplaycore() throws Exception{
ResumableSub_Facade_LoadNextAndPlayCore rsub = new ResumableSub_Facade_LoadNextAndPlayCore(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_LoadNextAndPlayCore extends BA.ResumableSub {
public ResumableSub_Facade_LoadNextAndPlayCore(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _offlinedispatched = false;
boolean _directdispatched = false;
String _idletext = "";
boolean _queueprepared = false;
boolean _dispatched = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2781;BA.debugLine="ClearRetryTimer";
parent._clearretrytimer();
 //BA.debugLineNum = 2782;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._playbackflowstate).equals(parent._flow_stopping)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 2783;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (true) break;

case 7:
//if
this.state = 22;
if (parent._local_playback_only) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 2784;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"load_next_";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("load_next_and_play:"+parent._nextstartmode,parent.__c.False));
this.state = 42;
return;
case 42:
//C
this.state = 10;
_offlinedispatched = (Boolean) result[0];
;
 //BA.debugLineNum = 2785;BA.debugLine="If offlineDispatched Then Return True";
if (true) break;

case 10:
//if
this.state = 15;
if (_offlinedispatched) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 2786;BA.debugLine="If stateStore.HasAnyCachedTrack Then";
if (true) break;

case 16:
//if
this.state = 21;
if (parent._statestore._hasanycachedtrack /*boolean*/ ()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 2787;BA.debugLine="HandleNoLocalTracks(\"\")";
parent._handlenolocaltracks("");
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 2789;BA.debugLine="HandleCacheWarmupPending";
parent._handlecachewarmuppending();
 if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 2791;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 2793;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 22:
//if
this.state = 35;
if (parent._use_data_playback_resolver) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 2794;BA.debugLine="PreScanUpcomingAdMinute(True)";
parent._prescanupcomingadminute(parent.__c.True);
 //BA.debugLineNum = 2795;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 //BA.debugLineNum = 2796;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"load_next_";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("load_next_and_play:"+parent._nextstartmode,parent.__c.True));
this.state = 43;
return;
case 43:
//C
this.state = 25;
_directdispatched = (Boolean) result[0];
;
 //BA.debugLineNum = 2797;BA.debugLine="If directDispatched Then Return True";
if (true) break;

case 25:
//if
this.state = 30;
if (_directdispatched) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 2798;BA.debugLine="Dim idleText As String = stateStore.ResolveIdleU";
_idletext = parent._statestore._resolveidleuntilmessage /*String*/ (parent._statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (),parent._statestore._effectivenowticks /*long*/ ());
 //BA.debugLineNum = 2799;BA.debugLine="If idleText <> \"\" Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((_idletext).equals("") == false) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 2800;BA.debugLine="HandleTemporaryState(\"server\", idleText)";
parent._handletemporarystate("server",_idletext);
 //BA.debugLineNum = 2801;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 34:
//C
this.state = 35;
;
 //BA.debugLineNum = 2803;BA.debugLine="HandleLocalTemporaryState(\"\")";
parent._handlelocaltemporarystate("");
 //BA.debugLineNum = 2804;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 36;
;
 //BA.debugLineNum = 2806;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queueP";
parent.__c.WaitFor("complete", ba, this, parent._populateplaybackqueue());
this.state = 44;
return;
case 44:
//C
this.state = 36;
_queueprepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2807;BA.debugLine="If queuePrepared = False Then Return False";
if (true) break;

case 36:
//if
this.state = 41;
if (_queueprepared==parent.__c.False) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 41:
//C
this.state = -1;
;
 //BA.debugLineNum = 2808;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"load_next_a";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("load_next_and_play:"+parent._nextstartmode,parent.__c.False));
this.state = 45;
return;
case 45:
//C
this.state = -1;
_dispatched = (Boolean) result[0];
;
 //BA.debugLineNum = 2809;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
 //BA.debugLineNum = 2810;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _facade_pauseplaybackcore(String _reason,String _connectionmode) throws Exception{
 //BA.debugLineNum = 3383;BA.debugLine="Public Sub Facade_PausePlaybackCore(reason As Stri";
 //BA.debugLineNum = 3384;BA.debugLine="playerDataCoordinator.PausePlaybackByPolicy(reaso";
_playerdatacoordinator._pauseplaybackbypolicy /*String*/ (_reason,_connectionmode);
 //BA.debugLineNum = 3385;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_preparenextplayablecore() throws Exception{
ResumableSub_Facade_PrepareNextPlayableCore rsub = new ResumableSub_Facade_PrepareNextPlayableCore(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_PrepareNextPlayableCore extends BA.ResumableSub {
public ResumableSub_Facade_PrepareNextPlayableCore(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _prepared = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2731;BA.debugLine="If CanPrepareNextPlayableNow(True) = False Then R";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._canpreparenextplayablenow(parent.__c.True)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 2732;BA.debugLine="Wait For (transitionCoordinator.PrepareNextPlayab";
parent.__c.WaitFor("complete", ba, this, parent._transitioncoordinator._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._playqueue,parent._runtimestate,parent._metastate,parent._orchestrationstate,parent._mediacacheservice,parent._playbackflowstate,parent._flow_playing,parent._flow_idle,parent._flow_preparing));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_prepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2733;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
 //BA.debugLineNum = 2734;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_resumeplaybackafterpolicypausecore() throws Exception{
ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore rsub = new ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore extends BA.ResumableSub {
public ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1318;BA.debugLine="If CanResumePlaybackNow(\"policy_pause\", True) = F";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._canresumeplaybacknow("policy_pause",parent.__c.True)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1319;BA.debugLine="If ShouldResumeWithNewStart = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._shouldresumewithnewstart()==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1320;BA.debugLine="TraceLog(\"возобновление запрет reason=policy_pau";
parent._tracelog("возобновление запрет reason=policy_pause state=no_new_start");
 //BA.debugLineNum = 1321;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1323;BA.debugLine="TraceLog(\"возобновление итог mode=auto_restart\")";
parent._tracelog("возобновление итог mode=auto_restart");
 //BA.debugLineNum = 1324;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, this, parent._startfirsttrack("auto"));
this.state = 11;
return;
case 11:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1325;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 1326;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_startfirsttrackcore(String _mode) throws Exception{
ResumableSub_Facade_StartFirstTrackCore rsub = new ResumableSub_Facade_StartFirstTrackCore(this,_mode);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_StartFirstTrackCore extends BA.ResumableSub {
public ResumableSub_Facade_StartFirstTrackCore(b4a.example.b4xmainpage parent,String _mode) {
this.parent = parent;
this._mode = _mode;
}
b4a.example.b4xmainpage parent;
String _mode;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2763;BA.debugLine="nextStartMode = mode";
parent._nextstartmode = _mode;
 //BA.debugLineNum = 2764;BA.debugLine="SetPlaybackFlowState(FLOW_STARTING, \"start_first_";
parent._setplaybackflowstate(parent._flow_starting,"start_first_track:"+_mode);
 //BA.debugLineNum = 2765;BA.debugLine="playQueue.Clear";
parent._playqueue.Clear();
 //BA.debugLineNum = 2766;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 //BA.debugLineNum = 2767;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
parent._orchestrationstate._cleartracktransitionflags /*String*/ ();
 //BA.debugLineNum = 2768;BA.debugLine="initialStartFadePending = (mode = \"manual\")";
parent._initialstartfadepending = ((_mode).equals("manual"));
 //BA.debugLineNum = 2769;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER And LOCAL_PLAYBACK_";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._use_data_playback_resolver && parent._local_playback_only==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._prescanupcomingadminute(parent.__c.True);
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 2770;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" And";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._transition_getdirectoractiveaudiokey()).equals("") && (parent._metastate._currentmediatype /*String*/ ).equals("")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
parent._showmessage(parent._messagevalue("syncing"));
if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 2771;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, this, parent._loadnextandplay());
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 2772;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 2773;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_stopplayercore() throws Exception{
ResumableSub_Facade_StopPlayerCore rsub = new ResumableSub_Facade_StopPlayerCore(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_StopPlayerCore extends BA.ResumableSub {
public ResumableSub_Facade_StopPlayerCore(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
String _activeaudiokey = "";
String _preparedaudiokey = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3805;BA.debugLine="If CanStopPlaybackNow(True) = False Then Return F";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._canstopplaybacknow(parent.__c.True)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3806;BA.debugLine="SetPlaybackFlowState(FLOW_STOPPING, \"stop_request";
parent._setplaybackflowstate(parent._flow_stopping,"stop_requested");
 //BA.debugLineNum = 3807;BA.debugLine="orchestrationState.EnterInternalStoppingState";
parent._orchestrationstate._enterinternalstoppingstate /*String*/ ();
 //BA.debugLineNum = 3808;BA.debugLine="TraceLog(\"stop запрос type=\" & metaState.CurrentM";
parent._tracelog("stop запрос type="+parent._metastate._currentmediatype /*String*/ +" activeAudio="+parent._transition_getdirectoractiveaudiokey()+" preparedAudio="+parent._transition_getdirectorpreparedaudiokey());
 //BA.debugLineNum = 3809;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
parent._datapolicystate._clearpolicypauseandresumerequest /*String*/ ();
 //BA.debugLineNum = 3810;BA.debugLine="orchestrationState.EndDispatch";
parent._orchestrationstate._enddispatch /*String*/ ();
 //BA.debugLineNum = 3811;BA.debugLine="ClearRetryTimer";
parent._clearretrytimer();
 //BA.debugLineNum = 3812;BA.debugLine="ClearExactBreakState";
parent._clearexactbreakstate();
 //BA.debugLineNum = 3813;BA.debugLine="ClearHistoryLogTimer";
parent._clearhistorylogtimer();
 //BA.debugLineNum = 3814;BA.debugLine="ResetPlaybackWatchdogState";
parent._resetplaybackwatchdogstate();
 //BA.debugLineNum = 3815;BA.debugLine="ResetRetryDelay";
parent._resetretrydelay();
 //BA.debugLineNum = 3816;BA.debugLine="ResetAudioOutputErrorState";
parent._resetaudiooutputerrorstate();
 //BA.debugLineNum = 3817;BA.debugLine="stateStore.ClearDispatchRetryAfter";
parent._statestore._cleardispatchretryafter /*String*/ ();
 //BA.debugLineNum = 3818;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = parent._transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 3819;BA.debugLine="Dim preparedAudioKey As String = Transition_GetDi";
_preparedaudiokey = parent._transition_getdirectorpreparedaudiokey();
 //BA.debugLineNum = 3820;BA.debugLine="If activeAudioKey <> \"\" Then";
if (true) break;

case 7:
//if
this.state = 16;
if ((_activeaudiokey).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3821;BA.debugLine="If metaState.CurrentMediaType = \"track\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._metastate._currentmediatype /*String*/ ).equals("track")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 3822;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS";
parent._getaudiobykey(_activeaudiokey)._stop /*String*/ (parent._stop_fade_ms);
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 3824;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(0)";
parent._getaudiobykey(_activeaudiokey)._stop /*String*/ ((int) (0));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 //BA.debugLineNum = 3827;BA.debugLine="If preparedAudioKey <> \"\" Then GetAudioByKey(prep";

case 16:
//if
this.state = 21;
if ((_preparedaudiokey).equals("") == false) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
parent._getaudiobykey(_preparedaudiokey)._stop /*String*/ ((int) (0));
if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 3828;BA.debugLine="If directorState.IsInitialized Then";
if (true) break;

case 22:
//if
this.state = 27;
if (parent._directorstate.IsInitialized /*boolean*/ ()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 //BA.debugLineNum = 3829;BA.debugLine="directorState.Reset";
parent._directorstate._reset /*String*/ ();
 //BA.debugLineNum = 3830;BA.debugLine="directorState.ConfigureDefaultSlots";
parent._directorstate._configuredefaultslots /*String*/ ();
 //BA.debugLineNum = 3831;BA.debugLine="MirrorRuntimeStateFromDirector";
parent._mirrorruntimestatefromdirector();
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 3833;BA.debugLine="runtimeState.Reset";
parent._runtimestate._reset /*String*/ ();
 if (true) break;

case 27:
//C
this.state = -1;
;
 //BA.debugLineNum = 3835;BA.debugLine="metaState.Reset";
parent._metastate._reset /*String*/ ();
 //BA.debugLineNum = 3836;BA.debugLine="playlistIndex = -1";
parent._playlistindex = (int) (-1);
 //BA.debugLineNum = 3837;BA.debugLine="playQueue.Clear";
parent._playqueue.Clear();
 //BA.debugLineNum = 3838;BA.debugLine="orchestrationState.EnterUserStoppedState";
parent._orchestrationstate._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 3839;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
parent._orchestrationstate._cleartracktransitionflags /*String*/ ();
 //BA.debugLineNum = 3840;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
parent._mediacacheservice._flushpendingindexsaves /*String*/ ();
 //BA.debugLineNum = 3841;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
parent._mediacacheservice._cleanupplaybacktempfiles /*String*/ ();
 //BA.debugLineNum = 3842;BA.debugLine="uiController.SetStatusText(\"\")";
parent._uicontroller._setstatustext /*String*/ ("");
 //BA.debugLineNum = 3843;BA.debugLine="HidePin";
parent._hidepin();
 //BA.debugLineNum = 3844;BA.debugLine="SetPlayIcon";
parent._setplayicon();
 //BA.debugLineNum = 3845;BA.debugLine="ApplyStoppedState";
parent._applystoppedstate();
 //BA.debugLineNum = 3846;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"stop_complete\")";
parent._setplaybackflowstate(parent._flow_idle,"stop_complete");
 //BA.debugLineNum = 3847;BA.debugLine="PublishHostState";
parent._publishhoststate();
 //BA.debugLineNum = 3848;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 3849;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fadeoutandcontinue() throws Exception{
ResumableSub_FadeOutAndContinue rsub = new ResumableSub_FadeOutAndContinue(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FadeOutAndContinue extends BA.ResumableSub {
public ResumableSub_FadeOutAndContinue(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
int _fadems = 0;
String _activeaudiokey = "";
boolean _dispatched = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3526;BA.debugLine="If CanAdvancePlaybackNow(\"fade_out_and_continue\",";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._canadvanceplaybacknow("fade_out_and_continue",parent.__c.True)==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3527;BA.debugLine="If IsPlaybackTransitionInProgress Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._isplaybacktransitioninprogress()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3528;BA.debugLine="TraceLog(\"guard fade запрет reason=transition_in";
parent._tracelog("guard fade запрет reason=transition_in_progress");
 //BA.debugLineNum = 3529;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 3531;BA.debugLine="If orchestrationState.IsPlaybackDispatchInProgres";

case 10:
//if
this.state = 13;
if (parent._orchestrationstate._isplaybackdispatchinprogress /*boolean*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 3532;BA.debugLine="TraceWarn(\"playback\", \"break переход пропущен\",";
parent._tracewarn("playback","break переход пропущен","reason=dispatch_busy active="+parent._orchestrationstate._activedispatchinitiator /*String*/ +" queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 3533;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 3535;BA.debugLine="TraceInfo(\"playback\", \"break переход начало\", \"ty";
parent._traceinfo("playback","break переход начало","type="+parent._metastate._currentmediatype /*String*/ +" queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 3536;BA.debugLine="SetPlaybackFlowState(FLOW_TRANSITIONING, \"fade_ou";
parent._setplaybackflowstate(parent._flow_transitioning,"fade_out_and_continue");
 //BA.debugLineNum = 3537;BA.debugLine="ClearExactBreakState";
parent._clearexactbreakstate();
 //BA.debugLineNum = 3538;BA.debugLine="Dim fadeMs As Int";
_fadems = 0;
 //BA.debugLineNum = 3539;BA.debugLine="If metaState.CurrentMediaType = \"track\" Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((parent._metastate._currentmediatype /*String*/ ).equals("track")) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 //BA.debugLineNum = 3540;BA.debugLine="fadeMs = STOP_FADE_MS";
_fadems = parent._stop_fade_ms;
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 3542;BA.debugLine="fadeMs = 0";
_fadems = (int) (0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 3544;BA.debugLine="TraceLog(\"fade начало type=\" & metaState.CurrentM";
parent._tracelog("fade начало type="+parent._metastate._currentmediatype /*String*/ +" fadeMs="+BA.NumberToString(_fadems));
 //BA.debugLineNum = 3545;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = parent._transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 3546;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
if (true) break;

case 20:
//if
this.state = 25;
if ((_activeaudiokey).equals("") == false) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
parent._getaudiobykey(_activeaudiokey)._stop /*String*/ (_fadems);
if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 3547;BA.debugLine="TraceInfo(\"playback\", \"break переход fade\", \"audi";
parent._traceinfo("playback","break переход fade","audio="+_activeaudiokey+" fadeMs="+BA.NumberToString(_fadems));
 //BA.debugLineNum = 3548;BA.debugLine="ClearPreparedState(False)";
parent._clearpreparedstate(parent.__c.False);
 //BA.debugLineNum = 3549;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"fade_out_an";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("fade_out_and_continue",parent.__c.True));
this.state = 26;
return;
case 26:
//C
this.state = -1;
_dispatched = (Boolean) result[0];
;
 //BA.debugLineNum = 3550;BA.debugLine="TraceInfo(\"playback\", \"break переход итог\", \"disp";
parent._traceinfo("playback","break переход итог","dispatched="+BA.ObjectToString(_dispatched)+" queue="+BA.NumberToString(parent._playqueue.getSize())+" stage="+parent._playbackflowstate);
 //BA.debugLineNum = 3551;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
 //BA.debugLineNum = 3552;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _failstartupsequence(String _reason) throws Exception{
 //BA.debugLineNum = 1190;BA.debugLine="Private Sub FailStartupSequence(reason As String)";
 //BA.debugLineNum = 1191;BA.debugLine="If isStartupSequenceInProgress = False Then Retur";
if (_isstartupsequenceinprogress==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1192;BA.debugLine="CancelDeferredPostStartTasks";
_canceldeferredpoststarttasks();
 //BA.debugLineNum = 1193;BA.debugLine="isStartupSequenceInProgress = False";
_isstartupsequenceinprogress = __c.False;
 //BA.debugLineNum = 1194;BA.debugLine="stateStore.SetStartupSequenceInProgress(False)";
_statestore._setstartupsequenceinprogress /*String*/ (__c.False);
 //BA.debugLineNum = 1195;BA.debugLine="ScheduleCacheAuditAfter(CACHE_AUDIT_START_DELAY_M";
_schedulecacheauditafter(_cache_audit_start_delay_ms);
 //BA.debugLineNum = 1196;BA.debugLine="TraceWarn(\"player\", \"старт не завершен\", \"reason=";
_tracewarn("player","старт не завершен","reason="+_reason);
 //BA.debugLineNum = 1197;BA.debugLine="WriteHealthSnapshot(\"ошибка_старта\")";
_writehealthsnapshot("ошибка_старта");
 //BA.debugLineNum = 1198;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1199;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchjsonwithtimeout(String _url,int _timeoutms) throws Exception{
ResumableSub_FetchJsonWithTimeout rsub = new ResumableSub_FetchJsonWithTimeout(this,_url,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchJsonWithTimeout extends BA.ResumableSub {
public ResumableSub_FetchJsonWithTimeout(b4a.example.b4xmainpage parent,String _url,int _timeoutms) {
this.parent = parent;
this._url = _url;
this._timeoutms = _timeoutms;
}
b4a.example.b4xmainpage parent;
String _url;
int _timeoutms;
anywheresoftware.b4a.objects.collections.Map _result = null;

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
 //BA.debugLineNum = 3019;BA.debugLine="Wait For (syncService.FetchJsonWithTimeout(url, t";
parent.__c.WaitFor("complete", ba, this, parent._syncservice._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 3020;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 3021;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchnext() throws Exception{
ResumableSub_FetchNext rsub = new ResumableSub_FetchNext(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchNext extends BA.ResumableSub {
public ResumableSub_FetchNext(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result = null;

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
 //BA.debugLineNum = 2987;BA.debugLine="Wait For (syncService.FetchNext(FETCH_TIMEOUT_MS,";
parent.__c.WaitFor("complete", ba, this, parent._syncservice._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._fetch_timeout_ms,parent._resolveappversion(),parent._nextstartmode,parent._playlistindex));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 2988;BA.debugLine="nextStartMode = \"\"";
parent._nextstartmode = "";
 //BA.debugLineNum = 2989;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 2990;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _filterplayercode(String _value) throws Exception{
String _filtered = "";
 //BA.debugLineNum = 4805;BA.debugLine="Private Sub FilterPlayerCode(value As String) As S";
 //BA.debugLineNum = 4806;BA.debugLine="Dim filtered As String = Regex.Replace(\"[^A-Za-z0";
_filtered = __c.Regex.Replace("[^A-Za-z0-9]",_value,"");
 //BA.debugLineNum = 4807;BA.debugLine="If filtered.Length > 5 Then filtered = filtered.S";
if (_filtered.length()>5) { 
_filtered = _filtered.substring((int) (0),(int) (5));};
 //BA.debugLineNum = 4808;BA.debugLine="Return filtered.ToUpperCase";
if (true) return _filtered.toUpperCase();
 //BA.debugLineNum = 4809;BA.debugLine="End Sub";
return "";
}
public String  _finalizeactiveitemattransitionboundary(String _reason) throws Exception{
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
String _activeaudiokey = "";
 //BA.debugLineNum = 1970;BA.debugLine="Private Sub FinalizeActiveItemAtTransitionBoundary";
 //BA.debugLineNum = 1971;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = _transition_getdirectoractiveitem();
 //BA.debugLineNum = 1972;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = _transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 1973;BA.debugLine="If activeItem.IsInitialized = False Then Return";
if (_activeitem.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1974;BA.debugLine="TraceInfo(\"audio\", \"плеер boundary\", \"player=\" &";
_traceinfo("audio","плеер boundary","player="+_traceplayernumber(_activeaudiokey)+" type="+_traceitemtype(_activeitem)+" id="+_tracetrackvalue(_activeitem)+" reason="+_reason);
 //BA.debugLineNum = 1975;BA.debugLine="TraceInfo(\"playback\", \"смена трека\", \"trackId=\" &";
_traceinfo("playback","смена трека","trackId="+_tracetrackvalue(_activeitem)+" reason="+_reason);
 //BA.debugLineNum = 1976;BA.debugLine="If activeItem.GetDefault(\"type\", \"\") = \"ad\" Then";
if ((_activeitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
 //BA.debugLineNum = 1977;BA.debugLine="ConfirmPendingHistoryItem(\"transition_boundary\")";
_confirmpendinghistoryitem("transition_boundary");
 };
 //BA.debugLineNum = 1979;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _flushhistorybuffer() throws Exception{
ResumableSub_FlushHistoryBuffer rsub = new ResumableSub_FlushHistoryBuffer(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FlushHistoryBuffer extends BA.ResumableSub {
public ResumableSub_FlushHistoryBuffer(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
long _startedat = 0L;
String _pendinghistoryfilename = "";
String _batchdate = "";
String _payload = "";
int _recordcount = 0;
anywheresoftware.b4a.objects.collections.Map _queryparams = null;
String _requesturl = "";
b4a.example.httpjob _j = null;
boolean _success = false;
String _responsetext = "";
String _failurekind = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3596;BA.debugLine="If isHistoryFlushInProgress Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._ishistoryflushinprogress) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3597;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return F";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._playercode).equals("") || (parent._deviceid).equals("")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 3598;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 3599;BA.debugLine="Dim pendingHistoryFileName As String = GetOldestP";
_pendinghistoryfilename = parent._getoldestpendinghistoryfilename();
 //BA.debugLineNum = 3600;BA.debugLine="If pendingHistoryFileName = \"\" Then Return True";
if (true) break;

case 13:
//if
this.state = 18;
if ((_pendinghistoryfilename).equals("")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 3601;BA.debugLine="isHistoryFlushInProgress = True";
parent._ishistoryflushinprogress = parent.__c.True;
 //BA.debugLineNum = 3602;BA.debugLine="Dim batchDate As String = HistoryFileNameToDate(p";
_batchdate = parent._historyfilenametodate(_pendinghistoryfilename);
 //BA.debugLineNum = 3603;BA.debugLine="Dim payload As String = \"\"";
_payload = "";
 //BA.debugLineNum = 3604;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 24;
this.catchState = 23;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 24;
this.catchState = 23;
 //BA.debugLineNum = 3605;BA.debugLine="payload = File.ReadString(GetHistoryDir, pending";
_payload = parent.__c.File.ReadString(parent._gethistorydir(),_pendinghistoryfilename);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 //BA.debugLineNum = 3607;BA.debugLine="TraceLog(\"история чтение ошибка file=\" & pending";
parent._tracelog("история чтение ошибка file="+_pendinghistoryfilename+" message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
 //BA.debugLineNum = 3609;BA.debugLine="payload = NormalizeNdjsonPayload(payload)";
_payload = parent._normalizendjsonpayload(_payload);
 //BA.debugLineNum = 3610;BA.debugLine="If payload = \"\" Or batchDate = \"\" Then";
if (true) break;

case 25:
//if
this.state = 28;
if ((_payload).equals("") || (_batchdate).equals("")) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 3611;BA.debugLine="DeleteHistoryPendingFile(pendingHistoryFileName)";
parent._deletehistorypendingfile(_pendinghistoryfilename);
 //BA.debugLineNum = 3612;BA.debugLine="isHistoryFlushInProgress = False";
parent._ishistoryflushinprogress = parent.__c.False;
 //BA.debugLineNum = 3613;BA.debugLine="LogSlowMainOperation(\"history_flush:empty\", star";
parent._logslowmainoperation("history_flush:empty",_startedat);
 //BA.debugLineNum = 3614;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 3616;BA.debugLine="Dim recordCount As Int = CountNdjsonRecords(paylo";
_recordcount = parent._countndjsonrecords(_payload);
 //BA.debugLineNum = 3617;BA.debugLine="Dim queryParams As Map";
_queryparams = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3618;BA.debugLine="queryParams.Initialize";
_queryparams.Initialize();
 //BA.debugLineNum = 3619;BA.debugLine="queryParams.Put(\"player\", playerCode)";
_queryparams.Put((Object)("player"),(Object)(parent._playercode));
 //BA.debugLineNum = 3620;BA.debugLine="queryParams.Put(\"device\", deviceId)";
_queryparams.Put((Object)("device"),(Object)(parent._deviceid));
 //BA.debugLineNum = 3621;BA.debugLine="queryParams.Put(\"date\", batchDate)";
_queryparams.Put((Object)("date"),(Object)(_batchdate));
 //BA.debugLineNum = 3622;BA.debugLine="Dim requestUrl As String = HISTORY_BASE_URL & \"?\"";
_requesturl = parent._history_base_url+"?"+parent._buildparams(_queryparams);
 //BA.debugLineNum = 3623;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 3624;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 3625;BA.debugLine="j.PostString(requestUrl, payload)";
_j._poststring /*String*/ (_requesturl,_payload);
 //BA.debugLineNum = 3626;BA.debugLine="ApplyClientRequestHeaders(j)";
parent._applyclientrequestheaders(_j);
 //BA.debugLineNum = 3627;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout((int) (5000));
 //BA.debugLineNum = 3628;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("text/plain; charset=utf-8");
 //BA.debugLineNum = 3629;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 29;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 3630;BA.debugLine="Dim success As Boolean = False";
_success = parent.__c.False;
 //BA.debugLineNum = 3631;BA.debugLine="If j.Success Then";
if (true) break;

case 29:
//if
this.state = 34;
if (_j._success /*boolean*/ ) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 //BA.debugLineNum = 3632;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ ();
 //BA.debugLineNum = 3633;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, True, res";
parent._saveserversnapshot("POST",_requesturl,parent.__c.True,_responsetext,"");
 //BA.debugLineNum = 3634;BA.debugLine="success = IsHistoryBatchAccepted(responseText)";
_success = parent._ishistorybatchaccepted(_responsetext);
 if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 3636;BA.debugLine="Dim failureKind As String = syncService.Classify";
_failurekind = parent._syncservice._classifyhttpfailure /*String*/ (_j._errormessage /*String*/ );
 //BA.debugLineNum = 3637;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, False, \"\"";
parent._saveserversnapshot("POST",_requesturl,parent.__c.False,"",_j._errormessage /*String*/ );
 //BA.debugLineNum = 3638;BA.debugLine="LogHttpFailure(requestUrl, failureKind)";
parent._loghttpfailure(_requesturl,_failurekind);
 if (true) break;
;
 //BA.debugLineNum = 3640;BA.debugLine="If success Then";

case 34:
//if
this.state = 39;
if (_success) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 //BA.debugLineNum = 3641;BA.debugLine="stateStore.SetLastHistoryOkNow";
parent._statestore._setlasthistoryoknow /*String*/ ();
 //BA.debugLineNum = 3642;BA.debugLine="DeleteHistoryPendingFile(pendingHistoryFileName)";
parent._deletehistorypendingfile(_pendinghistoryfilename);
 //BA.debugLineNum = 3643;BA.debugLine="TraceInfo(\"history\", \"история отправлена\", \"reco";
parent._traceinfo("history","история отправлена","records="+BA.NumberToString(_recordcount));
 if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 3645;BA.debugLine="TraceWarn(\"history\", \"история не отправлена\", \"r";
parent._tracewarn("history","история не отправлена","records="+BA.NumberToString(_recordcount));
 if (true) break;

case 39:
//C
this.state = -1;
;
 //BA.debugLineNum = 3647;BA.debugLine="WriteHealthSnapshot(\"history\")";
parent._writehealthsnapshot("history");
 //BA.debugLineNum = 3648;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 3649;BA.debugLine="isHistoryFlushInProgress = False";
parent._ishistoryflushinprogress = parent.__c.False;
 //BA.debugLineNum = 3650;BA.debugLine="LogSlowMainOperation(\"history_flush\", startedAt)";
parent._logslowmainoperation("history_flush",_startedat);
 //BA.debugLineNum = 3651;BA.debugLine="Return success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 //BA.debugLineNum = 3652;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _jobdone(b4a.example.httpjob _j) throws Exception{
}
public String  _flushhistorybufferasync() throws Exception{
 //BA.debugLineNum = 979;BA.debugLine="Private Sub FlushHistoryBufferAsync";
 //BA.debugLineNum = 980;BA.debugLine="CallSubDelayed(Me, \"RunHistoryFlushAsync\")";
__c.CallSubDelayed(ba,this,"RunHistoryFlushAsync");
 //BA.debugLineNum = 981;BA.debugLine="End Sub";
return "";
}
public String  _flushpendingcacheindexes() throws Exception{
 //BA.debugLineNum = 4610;BA.debugLine="Public Sub FlushPendingCacheIndexes";
 //BA.debugLineNum = 4611;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
_mediacacheservice._flushpendingindexsaves /*String*/ ();
 //BA.debugLineNum = 4612;BA.debugLine="End Sub";
return "";
}
public String  _flushtracebufferasync() throws Exception{
 //BA.debugLineNum = 987;BA.debugLine="Private Sub FlushTraceBufferAsync";
 //BA.debugLineNum = 988;BA.debugLine="traceUploader.FlushTraceBufferAsync";
_traceuploader._flushtracebufferasync /*void*/ ();
 //BA.debugLineNum = 989;BA.debugLine="End Sub";
return "";
}
public String  _formathistorydate(long _ticks) throws Exception{
String _previousdateformat = "";
String _value = "";
 //BA.debugLineNum = 3658;BA.debugLine="Private Sub FormatHistoryDate(ticks As Long) As St";
 //BA.debugLineNum = 3659;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 3660;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 3661;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
 //BA.debugLineNum = 3662;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 3663;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 3664;BA.debugLine="End Sub";
return "";
}
public String  _formathistorytime(long _ticks) throws Exception{
String _previoustimeformat = "";
String _value = "";
 //BA.debugLineNum = 3666;BA.debugLine="Private Sub FormatHistoryTime(ticks As Long) As St";
 //BA.debugLineNum = 3667;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 3668;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 3669;BA.debugLine="Dim value As String = DateTime.Time(ticks)";
_value = __c.DateTime.Time(_ticks);
 //BA.debugLineNum = 3670;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 3671;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 3672;BA.debugLine="End Sub";
return "";
}
public String  _formatplayercodefordisplay(String _value) throws Exception{
 //BA.debugLineNum = 4811;BA.debugLine="Private Sub FormatPlayerCodeForDisplay(value As St";
 //BA.debugLineNum = 4812;BA.debugLine="Return value.Trim.ToUpperCase";
if (true) return _value.trim().toUpperCase();
 //BA.debugLineNum = 4813;BA.debugLine="End Sub";
return "";
}
public String  _formattickstimefortrace(long _targetticks) throws Exception{
String _previousdateformat = "";
String _previoustimeformat = "";
String _value = "";
 //BA.debugLineNum = 3289;BA.debugLine="Private Sub FormatTicksTimeForTrace(targetTicks As";
 //BA.debugLineNum = 3290;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 3291;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 3292;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
 //BA.debugLineNum = 3293;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 3294;BA.debugLine="Dim value As String = DateTime.Date(targetTicks)";
_value = __c.DateTime.Date(_targetticks)+" "+__c.DateTime.Time(_targetticks);
 //BA.debugLineNum = 3295;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 3296;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 3297;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 3298;BA.debugLine="End Sub";
return "";
}
public String  _formattimestampfortrace(long _targettimestamp) throws Exception{
String _previousdateformat = "";
String _previoustimeformat = "";
long _targetticks = 0L;
String _value = "";
 //BA.debugLineNum = 3258;BA.debugLine="Private Sub FormatTimestampForTrace(targetTimestam";
 //BA.debugLineNum = 3259;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 3260;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 3261;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
 //BA.debugLineNum = 3262;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 3263;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = _localtimestamptoticks(_targettimestamp);
 //BA.debugLineNum = 3264;BA.debugLine="Dim value As String = DateTime.Date(targetTicks)";
_value = __c.DateTime.Date(_targetticks)+" "+__c.DateTime.Time(_targetticks);
 //BA.debugLineNum = 3265;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
 //BA.debugLineNum = 3266;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 3267;BA.debugLine="Return value";
if (true) return _value;
 //BA.debugLineNum = 3268;BA.debugLine="End Sub";
return "";
}
public b4a.example.audioplayer  _getaudiobykey(String _audiokey) throws Exception{
 //BA.debugLineNum = 1746;BA.debugLine="Private Sub GetAudioByKey(audioKey As String) As A";
 //BA.debugLineNum = 1747;BA.debugLine="If audioKey = \"secondary\" Then Return audioSecond";
if ((_audiokey).equals("secondary")) { 
if (true) return _audiosecondary;};
 //BA.debugLineNum = 1748;BA.debugLine="Return audioPrimary";
if (true) return _audioprimary;
 //BA.debugLineNum = 1749;BA.debugLine="End Sub";
return null;
}
public boolean  _getcurrentslothaslocalreserve() throws Exception{
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
 //BA.debugLineNum = 3336;BA.debugLine="Private Sub GetCurrentSlotHasLocalReserve As Boole";
 //BA.debugLineNum = 3337;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = _statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 3338;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3339;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3340;BA.debugLine="Return playerDataCoordinator.HasPlayableLocalTrac";
if (true) return _playerdatacoordinator._hasplayablelocaltrackincurrentslot /*boolean*/ (_offlinedata,_effectivenowticks());
 //BA.debugLineNum = 3341;BA.debugLine="End Sub";
return false;
}
public int  _getcurrentslotlocalreservecount() throws Exception{
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
 //BA.debugLineNum = 3343;BA.debugLine="Private Sub GetCurrentSlotLocalReserveCount As Int";
 //BA.debugLineNum = 3344;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = _statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 3345;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3346;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3347;BA.debugLine="Return playerDataCoordinator.CountPlayableLocalTr";
if (true) return _playerdatacoordinator._countplayablelocaltracksincurrentslot /*int*/ (_offlinedata,_effectivenowticks());
 //BA.debugLineNum = 3348;BA.debugLine="End Sub";
return 0;
}
public String  _gethistorydir() throws Exception{
 //BA.debugLineNum = 3795;BA.debugLine="Private Sub GetHistoryDir As String";
 //BA.debugLineNum = 3796;BA.debugLine="Return File.Combine(storageDir, historyDirName)";
if (true) return __c.File.Combine(_storagedir,_historydirname);
 //BA.debugLineNum = 3797;BA.debugLine="End Sub";
return "";
}
public String  _getinactiveaudiokey() throws Exception{
 //BA.debugLineNum = 1751;BA.debugLine="Private Sub GetInactiveAudioKey As String";
 //BA.debugLineNum = 1752;BA.debugLine="Return transitionCoordinator.GetInactiveAudioKey(";
if (true) return _transitioncoordinator._getinactiveaudiokey /*String*/ (_runtimestate);
 //BA.debugLineNum = 1753;BA.debugLine="End Sub";
return "";
}
public String  _getoldestpendinghistoryfilename() throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
anywheresoftware.b4a.objects.collections.List _historyfiles = null;
String _filename = "";
 //BA.debugLineNum = 3757;BA.debugLine="Private Sub GetOldestPendingHistoryFileName As Str";
 //BA.debugLineNum = 3758;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(_gethistorydir(),"")==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 3759;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_gethistorydir());
 //BA.debugLineNum = 3760;BA.debugLine="If listedFiles.IsInitialized = False Or listedFil";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3761;BA.debugLine="Dim historyFiles As List";
_historyfiles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3762;BA.debugLine="historyFiles.Initialize";
_historyfiles.Initialize();
 //BA.debugLineNum = 3763;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 3764;BA.debugLine="If IsHistoryFileName(fileName) Then historyFiles";
if (_ishistoryfilename(_filename)) { 
_historyfiles.Add((Object)(_filename));};
 }
};
 //BA.debugLineNum = 3766;BA.debugLine="If historyFiles.Size = 0 Then Return \"\"";
if (_historyfiles.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3767;BA.debugLine="historyFiles.Sort(True)";
_historyfiles.Sort(__c.True);
 //BA.debugLineNum = 3768;BA.debugLine="Return historyFiles.Get(0)";
if (true) return BA.ObjectToString(_historyfiles.Get((int) (0)));
 //BA.debugLineNum = 3769;BA.debugLine="End Sub";
return "";
}
public String  _getorcreatedeviceid() throws Exception{
String _id = "";
 //BA.debugLineNum = 4815;BA.debugLine="Private Sub GetOrCreateDeviceId As String";
 //BA.debugLineNum = 4816;BA.debugLine="Dim id As String = storage.GetDefault(\"device_id\"";
_id = BA.ObjectToString(_storage._getdefault /*Object*/ ("device_id",(Object)("")));
 //BA.debugLineNum = 4817;BA.debugLine="If id <> \"\" Then Return id";
if ((_id).equals("") == false) { 
if (true) return _id;};
 //BA.debugLineNum = 4818;BA.debugLine="id = CreateRandomDeviceId";
_id = _createrandomdeviceid();
 //BA.debugLineNum = 4819;BA.debugLine="SaveValue(\"device_id\", id)";
_savevalue("device_id",(Object)(_id));
 //BA.debugLineNum = 4820;BA.debugLine="Return id";
if (true) return _id;
 //BA.debugLineNum = 4821;BA.debugLine="End Sub";
return "";
}
public int  _getpendinghistoryfilecount() throws Exception{
int _storedcount = 0;
 //BA.debugLineNum = 3691;BA.debugLine="Private Sub GetPendingHistoryFileCount As Int";
 //BA.debugLineNum = 3692;BA.debugLine="Dim storedCount As Int = storage.GetDefault(\"pend";
_storedcount = (int)(BA.ObjectToNumber(_storage._getdefault /*Object*/ ("pending_history_count",(Object)(-1))));
 //BA.debugLineNum = 3693;BA.debugLine="If storedCount >= 0 Then Return storedCount";
if (_storedcount>=0) { 
if (true) return _storedcount;};
 //BA.debugLineNum = 3694;BA.debugLine="RefreshPendingHistoryState";
_refreshpendinghistorystate();
 //BA.debugLineNum = 3695;BA.debugLine="Return Max(0, storage.GetDefault(\"pending_history";
if (true) return (int) (__c.Max(0,(double)(BA.ObjectToNumber(_storage._getdefault /*Object*/ ("pending_history_count",(Object)(0))))));
 //BA.debugLineNum = 3696;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist() throws Exception{
 //BA.debugLineNum = 4310;BA.debugLine="Public Sub GetServerTraceList As List";
 //BA.debugLineNum = 4311;BA.debugLine="Return appTraceService.GetServerTraceList";
if (true) return _apptraceservice._getservertracelist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 4312;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext() throws Exception{
 //BA.debugLineNum = 4306;BA.debugLine="Public Sub GetServerTraceText As String";
 //BA.debugLineNum = 4307;BA.debugLine="Return appTraceService.GetServerTraceText";
if (true) return _apptraceservice._getservertracetext /*String*/ ();
 //BA.debugLineNum = 4308;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettraceloglist() throws Exception{
 //BA.debugLineNum = 4302;BA.debugLine="Public Sub GetTraceLogList As List";
 //BA.debugLineNum = 4303;BA.debugLine="Return appTraceService.GetTraceList";
if (true) return _apptraceservice._gettracelist /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 4304;BA.debugLine="End Sub";
return null;
}
public String  _gettracelogtext() throws Exception{
 //BA.debugLineNum = 4298;BA.debugLine="Public Sub GetTraceLogText As String";
 //BA.debugLineNum = 4299;BA.debugLine="Return appTraceService.GetTraceText";
if (true) return _apptraceservice._gettracetext /*String*/ ();
 //BA.debugLineNum = 4300;BA.debugLine="End Sub";
return "";
}
public String  _handleaudiocompleteasync(String _audiokey) throws Exception{
String _activeaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
 //BA.debugLineNum = 3938;BA.debugLine="Private Sub HandleAudioCompleteAsync(audioKey As S";
 //BA.debugLineNum = 3939;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = _transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 3940;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = _transition_getdirectoractiveitem();
 //BA.debugLineNum = 3941;BA.debugLine="If audioKey = activeAudioKey And activeItem.IsIni";
if ((_audiokey).equals(_activeaudiokey) && _activeitem.IsInitialized()) { 
 //BA.debugLineNum = 3942;BA.debugLine="TraceInfo(\"audio\", \"плеер native complete\", \"pla";
_traceinfo("audio","плеер native complete","player="+_traceplayernumber(_audiokey)+" type="+_traceitemtype(_activeitem)+" id="+_tracetrackvalue(_activeitem)+" mode=diagnostic");
 //BA.debugLineNum = 3943;BA.debugLine="If activeItem.GetDefault(\"type\", \"\") = \"ad\" Then";
if ((_activeitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
 //BA.debugLineNum = 3944;BA.debugLine="ConfirmPendingHistoryItem(\"native_complete_fall";
_confirmpendinghistoryitem("native_complete_fallback");
 };
 }else {
 //BA.debugLineNum = 3947;BA.debugLine="TraceLog(\"audio native complete ignored audio=\"";
_tracelog("audio native complete ignored audio="+_audiokey+" active="+_activeaudiokey);
 };
 //BA.debugLineNum = 3949;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handleaudioerror(String _audiokey,String _message) throws Exception{
ResumableSub_HandleAudioError rsub = new ResumableSub_HandleAudioError(this,_audiokey,_message);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleAudioError extends BA.ResumableSub {
public ResumableSub_HandleAudioError(b4a.example.b4xmainpage parent,String _audiokey,String _message) {
this.parent = parent;
this._audiokey = _audiokey;
this._message = _message;
}
b4a.example.b4xmainpage parent;
String _audiokey;
String _message;
anywheresoftware.b4a.objects.collections.Map _erroritem = null;
anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
boolean _unused = false;
boolean _unusedrecovery = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4033;BA.debugLine="Dim errorItem As Map = Transition_GetDirectorActi";
_erroritem = new anywheresoftware.b4a.objects.collections.Map();
_erroritem = parent._transition_getdirectoractiveitem();
 //BA.debugLineNum = 4034;BA.debugLine="Dim pendingPlayItem As Map = Transition_GetDirect";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingplayitem = parent._transition_getdirectorpendingplayitem(_audiokey);
 //BA.debugLineNum = 4035;BA.debugLine="Dim pendingPrepareItem As Map = Transition_GetDir";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingprepareitem = parent._transition_getdirectorpendingprepareitem(_audiokey);
 //BA.debugLineNum = 4036;BA.debugLine="If pendingPlayItem.Size > 0 Then errorItem = pend";
if (true) break;

case 1:
//if
this.state = 6;
if (_pendingplayitem.getSize()>0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_erroritem = _pendingplayitem;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 4037;BA.debugLine="If pendingPrepareItem.Size > 0 Then errorItem = p";
if (true) break;

case 7:
//if
this.state = 12;
if (_pendingprepareitem.getSize()>0) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_erroritem = _pendingprepareitem;
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 4038;BA.debugLine="TraceError(\"audio\", \"плеер error\", \"player=\" & Tr";
parent._traceerror("audio","плеер error","player="+parent._traceplayernumber(_audiokey)+" type="+parent._traceitemtype(_erroritem)+" id="+parent._tracetrackvalue(_erroritem)+" message="+_message);
 //BA.debugLineNum = 4039;BA.debugLine="WriteHealthSnapshot(\"ошибка_audio\")";
parent._writehealthsnapshot("ошибка_audio");
 //BA.debugLineNum = 4040;BA.debugLine="SetPlaybackFlowState(FLOW_ERROR, \"audio_error:\" &";
parent._setplaybackflowstate(parent._flow_error,"audio_error:"+_audiokey);
 //BA.debugLineNum = 4041;BA.debugLine="If pendingPlayItem.Size > 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_pendingplayitem.getSize()>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 4042;BA.debugLine="ClearPendingPlayState";
parent._clearpendingplaystate();
 //BA.debugLineNum = 4043;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 4045;BA.debugLine="If pendingPrepareItem.Size > 0 Then";

case 16:
//if
this.state = 19;
if (_pendingprepareitem.getSize()>0) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 4046;BA.debugLine="ClearPreparedState(False)";
parent._clearpreparedstate(parent.__c.False);
 //BA.debugLineNum = 4047;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 4049;BA.debugLine="If audioKey <> Transition_GetDirectorActiveAudioK";

case 19:
//if
this.state = 24;
if ((_audiokey).equals(parent._transition_getdirectoractiveaudiokey()) == false) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 24:
//C
this.state = 25;
;
 //BA.debugLineNum = 4050;BA.debugLine="consecutiveAudioOutputErrors = consecutiveAudioOu";
parent._consecutiveaudiooutputerrors = (int) (parent._consecutiveaudiooutputerrors+1);
 //BA.debugLineNum = 4051;BA.debugLine="If consecutiveAudioOutputErrors >= AUDIO_OUTPUT_E";
if (true) break;

case 25:
//if
this.state = 28;
if (parent._consecutiveaudiooutputerrors>=parent._audio_output_error_pause_threshold) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 4052;BA.debugLine="EnterAudioOutputRecoveryPause(MessageValue(\"audi";
parent._enteraudiooutputrecoverypause(parent._messagevalue("audio_device_check"));
 //BA.debugLineNum = 4053;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 4055;BA.debugLine="If CanAdvancePlaybackNow(\"audio_error:\" & audioKe";

case 28:
//if
this.state = 33;
if (parent._canadvanceplaybacknow("audio_error:"+_audiokey,parent.__c.True)==parent.__c.False) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 33:
//C
this.state = 34;
;
 //BA.debugLineNum = 4056;BA.debugLine="Wait For (HandleMediaError) Complete (unused As B";
parent.__c.WaitFor("complete", ba, this, parent._handlemediaerror());
this.state = 38;
return;
case 38:
//C
this.state = 34;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 4057;BA.debugLine="If dataPolicyState.HasLocalMediaFallback And orch";
if (true) break;

case 34:
//if
this.state = 37;
if (parent._datapolicystate._haslocalmediafallback /*boolean*/  && parent._orchestrationstate._isstarted /*boolean*/ ) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 4058;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"audio_erro";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("audio_error_recovery:"+_audiokey,parent.__c.True));
this.state = 39;
return;
case 39:
//C
this.state = 37;
_unusedrecovery = (Boolean) result[0];
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 //BA.debugLineNum = 4060;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 4061;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _handleaudioerrorasync(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
ResumableSub_HandleAudioErrorAsync rsub = new ResumableSub_HandleAudioErrorAsync(this,_args);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleAudioErrorAsync extends BA.ResumableSub {
public ResumableSub_HandleAudioErrorAsync(b4a.example.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _args) {
this.parent = parent;
this._args = _args;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _args;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 3935;BA.debugLine="Wait For (HandleAudioError(args.GetDefault(\"audio";
parent.__c.WaitFor("complete", ba, this, parent._handleaudioerror(BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),BA.ObjectToString(_args.GetDefault((Object)("message"),(Object)("")))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 3936;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleaudioready(String _audiokey) throws Exception{
anywheresoftware.b4a.objects.collections.Map _readyplayitem = null;
anywheresoftware.b4a.objects.collections.Map _readyprepareitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
 //BA.debugLineNum = 3994;BA.debugLine="Private Sub HandleAudioReady(audioKey As String)";
 //BA.debugLineNum = 3995;BA.debugLine="RefreshConnectionIndicatorState";
_refreshconnectionindicatorstate();
 //BA.debugLineNum = 3996;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 3997;BA.debugLine="Dim readyPlayItem As Map = Transition_GetDirecto";
_readyplayitem = new anywheresoftware.b4a.objects.collections.Map();
_readyplayitem = _transition_getdirectorpendingplayitem(_audiokey);
 //BA.debugLineNum = 3998;BA.debugLine="If readyPlayItem.Size > 0 Then";
if (_readyplayitem.getSize()>0) { 
 //BA.debugLineNum = 3999;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", BuildAudioTra";
_traceinfo("audio","плеер ready",_buildaudiotracedetails(_readyplayitem,"player="+_traceplayernumber(_audiokey)+" mode=play type="+_traceitemtype(_readyplayitem)+" id="+_tracetrackvalue(_readyplayitem)));
 }else {
 //BA.debugLineNum = 4001;BA.debugLine="Dim readyPrepareItem As Map = Transition_GetDir";
_readyprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_readyprepareitem = _transition_getdirectorpendingprepareitem(_audiokey);
 //BA.debugLineNum = 4002;BA.debugLine="If readyPrepareItem.Size > 0 Then";
if (_readyprepareitem.getSize()>0) { 
 //BA.debugLineNum = 4003;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", BuildAudioTr";
_traceinfo("audio","плеер ready",_buildaudiotracedetails(_readyprepareitem,"player="+_traceplayernumber(_audiokey)+" mode=prepare type="+_traceitemtype(_readyprepareitem)+" id="+_tracetrackvalue(_readyprepareitem)));
 };
 };
 //BA.debugLineNum = 4006;BA.debugLine="directorState.MarkSlotReady(audioKey)";
_directorstate._markslotready /*String*/ (_audiokey);
 //BA.debugLineNum = 4007;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 //BA.debugLineNum = 4008;BA.debugLine="QueuePlaybackDirectorSignalTick(\"audio_ready:\" &";
_queueplaybackdirectorsignaltick("audio_ready:"+_audiokey);
 //BA.debugLineNum = 4009;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4011;BA.debugLine="Dim pendingPlayItem As Map = Transition_GetDirect";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingplayitem = _transition_getdirectorpendingplayitem(_audiokey);
 //BA.debugLineNum = 4012;BA.debugLine="If pendingPlayItem.Size > 0 Then";
if (_pendingplayitem.getSize()>0) { 
 //BA.debugLineNum = 4013;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", BuildAudioTrac";
_traceinfo("audio","плеер ready",_buildaudiotracedetails(_pendingplayitem,"player="+_traceplayernumber(_audiokey)+" mode=play type="+_traceitemtype(_pendingplayitem)+" id="+_tracetrackvalue(_pendingplayitem)));
 //BA.debugLineNum = 4014;BA.debugLine="ActivateLoadedItem(audioKey, pendingPlayItem, ru";
_activateloadeditem(_audiokey,_pendingplayitem,_runtimestate._pendingplayfadeinms /*int*/ );
 //BA.debugLineNum = 4015;BA.debugLine="ClearPendingPlayState";
_clearpendingplaystate();
 //BA.debugLineNum = 4016;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4018;BA.debugLine="Dim pendingPrepareItem As Map = Transition_GetDir";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingprepareitem = _transition_getdirectorpendingprepareitem(_audiokey);
 //BA.debugLineNum = 4019;BA.debugLine="If pendingPrepareItem.Size > 0 Then";
if (_pendingprepareitem.getSize()>0) { 
 //BA.debugLineNum = 4020;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", BuildAudioTrac";
_traceinfo("audio","плеер ready",_buildaudiotracedetails(_pendingprepareitem,"player="+_traceplayernumber(_audiokey)+" mode=prepare type="+_traceitemtype(_pendingprepareitem)+" id="+_tracetrackvalue(_pendingprepareitem)));
 //BA.debugLineNum = 4021;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 4022;BA.debugLine="directorState.SetPrepared(audioKey, pendingPrep";
_directorstate._setprepared /*String*/ (_audiokey,_pendingprepareitem);
 //BA.debugLineNum = 4023;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 }else {
 //BA.debugLineNum = 4025;BA.debugLine="runtimeState.SetPrepared(audioKey, pendingPrepa";
_runtimestate._setprepared /*String*/ (_audiokey,_pendingprepareitem);
 //BA.debugLineNum = 4026;BA.debugLine="runtimeState.ClearPendingPrepareState";
_runtimestate._clearpendingpreparestate /*String*/ ();
 };
 };
 //BA.debugLineNum = 4029;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handleaudiotimeupdate(String _audiokey) throws Exception{
ResumableSub_HandleAudioTimeupdate rsub = new ResumableSub_HandleAudioTimeupdate(this,_audiokey);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleAudioTimeupdate extends BA.ResumableSub {
public ResumableSub_HandleAudioTimeupdate(b4a.example.b4xmainpage parent,String _audiokey) {
this.parent = parent;
this._audiokey = _audiokey;
}
b4a.example.b4xmainpage parent;
String _audiokey;
b4a.example.playbackplayerslot _activeslot = null;
anywheresoftware.b4a.objects.collections.Map _activeitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4090;BA.debugLine="If audioKey <> Transition_GetDirectorActiveAudioK";
if (true) break;

case 1:
//if
this.state = 6;
if ((_audiokey).equals(parent._transition_getdirectoractiveaudiokey()) == false) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 4091;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/  || parent._isplaybackflowactive()==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 4092;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorSt";
_activeslot = parent._directorstate._getslotbyaudiokey /*b4a.example.playbackplayerslot*/ (_audiokey);
 //BA.debugLineNum = 4093;BA.debugLine="If activeSlot.IsInitialized Then activeSlot.MarkP";
if (true) break;

case 13:
//if
this.state = 18;
if (_activeslot.IsInitialized /*boolean*/ ()) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_activeslot._markprogress /*String*/ ();
if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 4094;BA.debugLine="If metaState.PendingHistoryItem.IsInitialized The";
if (true) break;

case 19:
//if
this.state = 26;
if (parent._metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 4095;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAc";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = parent._transition_getdirectoractiveitem();
 //BA.debugLineNum = 4096;BA.debugLine="If metaState.PendingHistoryItem.GetDefault(\"type";
if (true) break;

case 22:
//if
this.state = 25;
if ((parent._metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) && (parent._metastate._currentmediaurl /*String*/ ).equals("") == false && (parent._metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))).equals(_activeitem.GetDefault((Object)("id"),(Object)(""))) && (parent._metastate._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals(_activeitem.GetDefault((Object)("type"),(Object)("")))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 4097;BA.debugLine="ConfirmPendingHistoryItem(\"timeupdate\")";
parent._confirmpendinghistoryitem("timeupdate");
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 //BA.debugLineNum = 4100;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 4101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleaudiotimeupdateasync(String _audiokey) throws Exception{
 //BA.debugLineNum = 3951;BA.debugLine="Private Sub HandleAudioTimeupdateAsync(audioKey As";
 //BA.debugLineNum = 3952;BA.debugLine="If audioTimeupdateQueuedByKey.GetDefault(audioKey";
if (BA.ObjectToBoolean(_audiotimeupdatequeuedbykey.GetDefault((Object)(_audiokey),(Object)(__c.False)))) { 
if (true) return "";};
 //BA.debugLineNum = 3953;BA.debugLine="audioTimeupdateQueuedByKey.Put(audioKey, True)";
_audiotimeupdatequeuedbykey.Put((Object)(_audiokey),(Object)(__c.True));
 //BA.debugLineNum = 3954;BA.debugLine="CallSubDelayed2(Me, \"RunAudioTimeupdateAsync\", au";
__c.CallSubDelayed2(ba,this,"RunAudioTimeupdateAsync",(Object)(_audiokey));
 //BA.debugLineNum = 3955;BA.debugLine="End Sub";
return "";
}
public String  _handleblockedstate() throws Exception{
 //BA.debugLineNum = 3314;BA.debugLine="Private Sub HandleBlockedState";
 //BA.debugLineNum = 3315;BA.debugLine="playerDataCoordinator.HandleBlockedState";
_playerdatacoordinator._handleblockedstate /*String*/ ();
 //BA.debugLineNum = 3316;BA.debugLine="End Sub";
return "";
}
public String  _handlecachewarmuppending() throws Exception{
 //BA.debugLineNum = 3358;BA.debugLine="Private Sub HandleCacheWarmupPending";
 //BA.debugLineNum = 3359;BA.debugLine="ClearPlaybackState";
_clearplaybackstate();
 //BA.debugLineNum = 3360;BA.debugLine="ShowMessage(\"Подготовка воспроизведения...\")";
_showmessage("Подготовка воспроизведения...");
 //BA.debugLineNum = 3361;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"cache_warmup\")";
_setplaybackflowstate(_flow_idle,"cache_warmup");
 //BA.debugLineNum = 3362;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlefetchfailure(anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
ResumableSub_HandleFetchFailure rsub = new ResumableSub_HandleFetchFailure(this,_result);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleFetchFailure extends BA.ResumableSub {
public ResumableSub_HandleFetchFailure(b4a.example.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _result) {
this.parent = parent;
this._result = _result;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result;
boolean _handled = false;

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
 //BA.debugLineNum = 3305;BA.debugLine="Wait For (playerDataCoordinator.HandleFetchFailur";
parent.__c.WaitFor("complete", ba, this, parent._playerdatacoordinator._handlefetchfailure /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_result));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_handled = (Boolean) result[0];
;
 //BA.debugLineNum = 3306;BA.debugLine="Return handled";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_handled));return;};
 //BA.debugLineNum = 3307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleheaderactioninput() throws Exception{
 //BA.debugLineNum = 1607;BA.debugLine="Private Sub HandleHeaderActionInput";
 //BA.debugLineNum = 1608;BA.debugLine="If DateTime.Now - lastHeaderActionInputAt < 250 T";
if (__c.DateTime.getNow()-_lastheaderactioninputat<250) { 
if (true) return "";};
 //BA.debugLineNum = 1609;BA.debugLine="lastHeaderActionInputAt = DateTime.Now";
_lastheaderactioninputat = __c.DateTime.getNow();
 //BA.debugLineNum = 1610;BA.debugLine="If appScreenMode = \"player\" Then";
if ((_appscreenmode).equals("player")) { 
 //BA.debugLineNum = 1611;BA.debugLine="ExecuteShowSettingsScreenCommand";
_executeshowsettingsscreencommand();
 }else if((_appscreenmode).equals("settings")) { 
 //BA.debugLineNum = 1613;BA.debugLine="ExecuteShowPlayerScreenCommand(False)";
_executeshowplayerscreencommand(__c.False);
 };
 //BA.debugLineNum = 1615;BA.debugLine="End Sub";
return "";
}
public String  _handlelocaltemporarystate(String _text) throws Exception{
 //BA.debugLineNum = 3350;BA.debugLine="Private Sub HandleLocalTemporaryState(text As Stri";
 //BA.debugLineNum = 3351;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (_local_playback_only) { 
 //BA.debugLineNum = 3352;BA.debugLine="HandleNoLocalTracks(text)";
_handlenolocaltracks(_text);
 //BA.debugLineNum = 3353;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3355;BA.debugLine="playerDataCoordinator.HandleLocalTemporaryState(t";
_playerdatacoordinator._handlelocaltemporarystate /*String*/ (_text);
 //BA.debugLineNum = 3356;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlemediaerror() throws Exception{
ResumableSub_HandleMediaError rsub = new ResumableSub_HandleMediaError(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleMediaError extends BA.ResumableSub {
public ResumableSub_HandleMediaError(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _handled = false;

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
 //BA.debugLineNum = 3323;BA.debugLine="Wait For (playerDataCoordinator.HandleMediaError)";
parent.__c.WaitFor("complete", ba, this, parent._playerdatacoordinator._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_handled = (Boolean) result[0];
;
 //BA.debugLineNum = 3324;BA.debugLine="Return handled";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_handled));return;};
 //BA.debugLineNum = 3325;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handlemessageitem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _action = "";
 //BA.debugLineNum = 3144;BA.debugLine="Private Sub HandleMessageItem(item As Map)";
 //BA.debugLineNum = 3145;BA.debugLine="Dim action As String = item.GetDefault(\"action\",";
_action = BA.ObjectToString(_item.GetDefault((Object)("action"),(Object)("")));
 //BA.debugLineNum = 3146;BA.debugLine="TraceLog(\"сообщение handle action=\" & action & \"";
_tracelog("сообщение handle action="+_action+" text="+BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(""))));
 //BA.debugLineNum = 3147;BA.debugLine="If action = \"claim\" Then";
if ((_action).equals("claim")) { 
 //BA.debugLineNum = 3148;BA.debugLine="dataPolicyState.ClearPolicyPause";
_datapolicystate._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 3149;BA.debugLine="ClearPlaybackState";
_clearplaybackstate();
 //BA.debugLineNum = 3150;BA.debugLine="orchestrationState.EnterUserStoppedState";
_orchestrationstate._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 3151;BA.debugLine="SetPlayIcon";
_setplayicon();
 //BA.debugLineNum = 3152;BA.debugLine="ShowClaimPrompt(item.GetDefault(\"message\", Messa";
_showclaimprompt(BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(_messagevalue("device_busy")))));
 }else if((_action).equals("shutdown")) { 
 //BA.debugLineNum = 3154;BA.debugLine="HandleShutdownMessage(item.GetDefault(\"message\",";
_handleshutdownmessage(BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(_messagevalue("server_wait")))));
 }else if((_action).equals("blocked")) { 
 //BA.debugLineNum = 3156;BA.debugLine="HandleBlockedState";
_handleblockedstate();
 }else if((_action).equals("not_found")) { 
 //BA.debugLineNum = 3158;BA.debugLine="StopForMissingData(item.GetDefault(\"message\", Me";
_stopformissingdata(BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(_messagevalue("not_found")))));
 }else {
 //BA.debugLineNum = 3160;BA.debugLine="HandleTemporaryState(\"server\", item.GetDefault(\"";
_handletemporarystate("server",BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(_messagevalue("server_wait")))));
 };
 //BA.debugLineNum = 3162;BA.debugLine="End Sub";
return "";
}
public String  _handlenolocaltracks(String _text) throws Exception{
 //BA.debugLineNum = 3364;BA.debugLine="Private Sub HandleNoLocalTracks(text As String)";
 //BA.debugLineNum = 3365;BA.debugLine="ClearPlaybackState";
_clearplaybackstate();
 //BA.debugLineNum = 3366;BA.debugLine="If text = \"\" Then text = \"Подготовка воспроизведе";
if ((_text).equals("")) { 
_text = "Подготовка воспроизведения...";};
 //BA.debugLineNum = 3367;BA.debugLine="ShowMessage(text)";
_showmessage(_text);
 //BA.debugLineNum = 3368;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"no_local_tracks\"";
_setplaybackflowstate(_flow_idle,"no_local_tracks");
 //BA.debugLineNum = 3369;BA.debugLine="End Sub";
return "";
}
public String  _handleplaybuttoninput() throws Exception{
 //BA.debugLineNum = 1555;BA.debugLine="Private Sub HandlePlayButtonInput";
 //BA.debugLineNum = 1556;BA.debugLine="If DateTime.Now - lastPlayButtonInputAt < 250 The";
if (__c.DateTime.getNow()-_lastplaybuttoninputat<250) { 
if (true) return "";};
 //BA.debugLineNum = 1557;BA.debugLine="lastPlayButtonInputAt = DateTime.Now";
_lastplaybuttoninputat = __c.DateTime.getNow();
 //BA.debugLineNum = 1558;BA.debugLine="lastUserPlaybackInputAt = DateTime.Now";
_lastuserplaybackinputat = __c.DateTime.getNow();
 //BA.debugLineNum = 1559;BA.debugLine="ExecutePlayButtonCommand";
_executeplaybuttoncommand();
 //BA.debugLineNum = 1560;BA.debugLine="End Sub";
return "";
}
public String  _handleshutdownmessage(String _text) throws Exception{
 //BA.debugLineNum = 3387;BA.debugLine="Private Sub HandleShutdownMessage(text As String)";
 //BA.debugLineNum = 3388;BA.debugLine="playerDataCoordinator.HandleShutdownMessage(text)";
_playerdatacoordinator._handleshutdownmessage /*String*/ (_text);
 //BA.debugLineNum = 3389;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(String _mode,String _text) throws Exception{
 //BA.debugLineNum = 3309;BA.debugLine="Private Sub HandleTemporaryState(mode As String, t";
 //BA.debugLineNum = 3310;BA.debugLine="playerDataCoordinator.HandleTemporaryState(mode,";
_playerdatacoordinator._handletemporarystate /*String*/ (_mode,_text);
 //BA.debugLineNum = 3311;BA.debugLine="TryApplyPendingAppUpdate(\"temporary_state\")";
_tryapplypendingappupdate("temporary_state");
 //BA.debugLineNum = 3312;BA.debugLine="End Sub";
return "";
}
public boolean  _hasdispatchablequeueitem() throws Exception{
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemtype = "";
long _breakat = 0L;
 //BA.debugLineNum = 4655;BA.debugLine="Private Sub HasDispatchableQueueItem As Boolean";
 //BA.debugLineNum = 4656;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 4657;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_playqueue.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 4658;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = _playqueue.Get(_i);
 //BA.debugLineNum = 4659;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 4660;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 4661;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4662;BA.debugLine="If itemType = \"break\" Then";
if ((_itemtype).equals("break")) { 
 //BA.debugLineNum = 4663;BA.debugLine="Dim breakAt As Long = ToLongDefault(item.GetDef";
_breakat = _tolongdefault(_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
 //BA.debugLineNum = 4664;BA.debugLine="If breakAt > LocalNowTimestamp Then Continue";
if (_breakat>_localnowtimestamp()) { 
if (true) continue;};
 //BA.debugLineNum = 4665;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 4667;BA.debugLine="If itemType = \"track\" And mediaCacheService.IsTr";
if ((_itemtype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return __c.True;};
 //BA.debugLineNum = 4668;BA.debugLine="If itemType = \"ad\" And mediaCacheService.IsAdCac";
if ((_itemtype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return __c.True;};
 }
};
 //BA.debugLineNum = 4670;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 4671;BA.debugLine="End Sub";
return false;
}
public boolean  _haslocalplaybackfallback() throws Exception{
anywheresoftware.b4a.objects.collections.Map _probeitem = null;
 //BA.debugLineNum = 3327;BA.debugLine="Private Sub HasLocalPlaybackFallback As Boolean";
 //BA.debugLineNum = 3328;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (_local_playback_only) { 
 //BA.debugLineNum = 3329;BA.debugLine="Dim probeItem As Map = stateStore.ResolveNextLoc";
_probeitem = new anywheresoftware.b4a.objects.collections.Map();
_probeitem = _statestore._resolvenextlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 3330;BA.debugLine="Return probeItem.IsInitialized And probeItem.Siz";
if (true) return _probeitem.IsInitialized() && _probeitem.getSize()>0;
 };
 //BA.debugLineNum = 3332;BA.debugLine="If stateStore.HasAnyCachedTrack Then Return True";
if (_statestore._hasanycachedtrack /*boolean*/ ()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 3333;BA.debugLine="Return GetCurrentSlotHasLocalReserve Or stateStor";
if (true) return _getcurrentslothaslocalreserve() || _statestore._getlocalplayablequeuecount /*int*/ (_playqueue)>0;
 //BA.debugLineNum = 3334;BA.debugLine="End Sub";
return false;
}
public boolean  _hasobservableactiveplayback() throws Exception{
b4a.example.playbackplayerslot _activeslot = null;
 //BA.debugLineNum = 2105;BA.debugLine="Private Sub HasObservableActivePlayback As Boolean";
 //BA.debugLineNum = 2106;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2107;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = _directorstate._getactiveslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2108;BA.debugLine="If activeSlot.IsInitialized = False Then Return";
if (_activeslot.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2109;BA.debugLine="If activeSlot.HasItem = False Then Return False";
if (_activeslot._hasitem /*boolean*/ ()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2110;BA.debugLine="If activeSlot.AudioKey = \"\" Then Return False";
if ((_activeslot._audiokey /*String*/ ).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2111;BA.debugLine="Return GetAudioByKey(activeSlot.AudioKey).IsPlay";
if (true) return _getaudiobykey(_activeslot._audiokey /*String*/ )._isplaying /*boolean*/ ();
 };
 //BA.debugLineNum = 2113;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 2114;BA.debugLine="End Sub";
return false;
}
public boolean  _haspendingexactbreak() throws Exception{
 //BA.debugLineNum = 3503;BA.debugLine="Private Sub HasPendingExactBreak As Boolean";
 //BA.debugLineNum = 3504;BA.debugLine="Return scheduledBreakAt > LocalNowTimestamp";
if (true) return _scheduledbreakat>_localnowtimestamp();
 //BA.debugLineNum = 3505;BA.debugLine="End Sub";
return false;
}
public String  _haspreparedslotfortrace() throws Exception{
 //BA.debugLineNum = 2429;BA.debugLine="Private Sub HasPreparedSlotForTrace As String";
 //BA.debugLineNum = 2430;BA.debugLine="If directorState.IsInitialized Then Return IIf(di";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
if (true) return BA.ObjectToString(((_directorstate._haspreparedslot /*boolean*/ ()) ? ((Object)("true")) : ((Object)("false"))));};
 //BA.debugLineNum = 2431;BA.debugLine="Return \"false\"";
if (true) return "false";
 //BA.debugLineNum = 2432;BA.debugLine="End Sub";
return "";
}
public boolean  _hasusableprepareditem() throws Exception{
 //BA.debugLineNum = 2257;BA.debugLine="Private Sub HasUsablePreparedItem As Boolean";
 //BA.debugLineNum = 2258;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
if (true) return _directorstate._haspreparedslot /*boolean*/ ();};
 //BA.debugLineNum = 2259;BA.debugLine="Return transitionCoordinator.HasUsablePreparedIte";
if (true) return _transitioncoordinator._hasusableprepareditem /*boolean*/ (_runtimestate);
 //BA.debugLineNum = 2260;BA.debugLine="End Sub";
return false;
}
public String  _headeractionpane_click() throws Exception{
 //BA.debugLineNum = 1603;BA.debugLine="Private Sub HeaderActionPane_Click";
 //BA.debugLineNum = 1604;BA.debugLine="HandleHeaderActionInput";
_handleheaderactioninput();
 //BA.debugLineNum = 1605;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseclicked(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1617;BA.debugLine="Private Sub HeaderActionPane_MouseClicked (eventDa";
 //BA.debugLineNum = 1618;BA.debugLine="HandleHeaderActionInput";
_handleheaderactioninput();
 //BA.debugLineNum = 1619;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseentered(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1621;BA.debugLine="Private Sub HeaderActionPane_MouseEntered (eventDa";
 //BA.debugLineNum = 1622;BA.debugLine="UpdateHeaderActionAppearance(True)";
_updateheaderactionappearance(__c.True);
 //BA.debugLineNum = 1623;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseexited(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1625;BA.debugLine="Private Sub HeaderActionPane_MouseExited (eventDat";
 //BA.debugLineNum = 1626;BA.debugLine="UpdateHeaderActionAppearance(False)";
_updateheaderactionappearance(__c.False);
 //BA.debugLineNum = 1627;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks() throws Exception{
 //BA.debugLineNum = 4502;BA.debugLine="Private Sub HideContentBlocks";
 //BA.debugLineNum = 4503;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4504;BA.debugLine="uiController.HideContentBlocks";
_uicontroller._hidecontentblocks /*String*/ ();
 //BA.debugLineNum = 4505;BA.debugLine="End Sub";
return "";
}
public String  _hidepin() throws Exception{
 //BA.debugLineNum = 4539;BA.debugLine="Private Sub HidePin";
 //BA.debugLineNum = 4540;BA.debugLine="If uiControllerReady = False Then";
if (_uicontrollerready==__c.False) { 
 //BA.debugLineNum = 4541;BA.debugLine="confirmPane.Visible = False";
_confirmpane.setVisible(__c.False);
 //BA.debugLineNum = 4542;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4544;BA.debugLine="uiController.HidePin";
_uicontroller._hidepin /*String*/ ();
 //BA.debugLineNum = 4545;BA.debugLine="End Sub";
return "";
}
public String  _historyfilename(String _recorddate) throws Exception{
 //BA.debugLineNum = 3777;BA.debugLine="Private Sub HistoryFileName(recordDate As String)";
 //BA.debugLineNum = 3778;BA.debugLine="Return recordDate & \".ndjson\"";
if (true) return _recorddate+".ndjson";
 //BA.debugLineNum = 3779;BA.debugLine="End Sub";
return "";
}
public String  _historyfilenametodate(String _filename) throws Exception{
 //BA.debugLineNum = 3781;BA.debugLine="Private Sub HistoryFileNameToDate(fileName As Stri";
 //BA.debugLineNum = 3782;BA.debugLine="If IsHistoryFileName(fileName) = False Then Retur";
if (_ishistoryfilename(_filename)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 3783;BA.debugLine="Return fileName.SubString2(0, fileName.Length - 7";
if (true) return _filename.substring((int) (0),(int) (_filename.length()-7));
 //BA.debugLineNum = 3784;BA.debugLine="End Sub";
return "";
}
public String  _historyflushtimer_tick() throws Exception{
 //BA.debugLineNum = 971;BA.debugLine="Private Sub HistoryFlushTimer_Tick";
 //BA.debugLineNum = 972;BA.debugLine="If playerCode = \"\" Then Return";
if ((_playercode).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 973;BA.debugLine="If GetPendingHistoryFileCount <= 0 Then Return";
if (_getpendinghistoryfilecount()<=0) { 
if (true) return "";};
 //BA.debugLineNum = 974;BA.debugLine="If isHistoryFlushInProgress Then Return";
if (_ishistoryflushinprogress) { 
if (true) return "";};
 //BA.debugLineNum = 975;BA.debugLine="If ShouldDeferHistoryFlushForPlaybackUi Then Retu";
if (_shoulddeferhistoryflushforplaybackui()) { 
if (true) return "";};
 //BA.debugLineNum = 976;BA.debugLine="FlushHistoryBufferAsync";
_flushhistorybufferasync();
 //BA.debugLineNum = 977;BA.debugLine="End Sub";
return "";
}
public void  _host_breaktimertick() throws Exception{
ResumableSub_Host_BreakTimerTick rsub = new ResumableSub_Host_BreakTimerTick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Host_BreakTimerTick extends BA.ResumableSub {
public ResumableSub_Host_BreakTimerTick(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3485;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3486;BA.debugLine="If ShouldTriggerBreakNow = False Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._shouldtriggerbreaknow()==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 3487;BA.debugLine="TraceLog(\"брейк exact timer hit\")";
parent._tracelog("брейк exact timer hit");
 //BA.debugLineNum = 3488;BA.debugLine="Wait For (RunPlaybackDirectorTick(\"break_timer\"))";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectortick("break_timer"));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 3492;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _host_commandautostart() throws Exception{
 //BA.debugLineNum = 1227;BA.debugLine="Public Sub Host_CommandAutoStart";
 //BA.debugLineNum = 1228;BA.debugLine="ExecuteAutoStartCommand";
_executeautostartcommand();
 //BA.debugLineNum = 1229;BA.debugLine="End Sub";
return "";
}
public String  _host_commandmanualstart() throws Exception{
 //BA.debugLineNum = 1231;BA.debugLine="Public Sub Host_CommandManualStart";
 //BA.debugLineNum = 1232;BA.debugLine="ExecuteManualStartCommand";
_executemanualstartcommand();
 //BA.debugLineNum = 1233;BA.debugLine="End Sub";
return "";
}
public String  _host_commandstop() throws Exception{
 //BA.debugLineNum = 1235;BA.debugLine="Public Sub Host_CommandStop";
 //BA.debugLineNum = 1236;BA.debugLine="ExecuteStopCommand";
_executestopcommand();
 //BA.debugLineNum = 1237;BA.debugLine="End Sub";
return "";
}
public String  _host_playbackdirectortimertick() throws Exception{
 //BA.debugLineNum = 3971;BA.debugLine="Public Sub Host_PlaybackDirectorTimerTick";
 //BA.debugLineNum = 3972;BA.debugLine="PlaybackDirectorTimer_Tick";
_playbackdirectortimer_tick();
 //BA.debugLineNum = 3973;BA.debugLine="End Sub";
return "";
}
public String  _host_playbackwatchdogtimertick() throws Exception{
 //BA.debugLineNum = 2139;BA.debugLine="Public Sub Host_PlaybackWatchdogTimerTick";
 //BA.debugLineNum = 2140;BA.debugLine="PlaybackWatchdogTimer_Tick";
_playbackwatchdogtimer_tick();
 //BA.debugLineNum = 2141;BA.debugLine="End Sub";
return "";
}
public String  _host_timerbreaktick() throws Exception{
 //BA.debugLineNum = 1283;BA.debugLine="Public Sub Host_TimerBreakTick";
 //BA.debugLineNum = 1284;BA.debugLine="Host_BreakTimerTick";
_host_breaktimertick();
 //BA.debugLineNum = 1285;BA.debugLine="End Sub";
return "";
}
public String  _host_timercacheaudit() throws Exception{
 //BA.debugLineNum = 1303;BA.debugLine="Public Sub Host_TimerCacheAudit";
 //BA.debugLineNum = 1304;BA.debugLine="CacheAuditTimer_Tick";
_cacheaudittimer_tick();
 //BA.debugLineNum = 1305;BA.debugLine="End Sub";
return "";
}
public String  _host_timerhistoryflush() throws Exception{
 //BA.debugLineNum = 1287;BA.debugLine="Public Sub Host_TimerHistoryFlush";
 //BA.debugLineNum = 1288;BA.debugLine="HistoryFlushTimer_Tick";
_historyflushtimer_tick();
 //BA.debugLineNum = 1289;BA.debugLine="End Sub";
return "";
}
public String  _host_timerlocaladminute() throws Exception{
 //BA.debugLineNum = 1299;BA.debugLine="Public Sub Host_TimerLocalAdMinute";
 //BA.debugLineNum = 1300;BA.debugLine="LocalAdMinuteTimer_Tick";
_localadminutetimer_tick();
 //BA.debugLineNum = 1301;BA.debugLine="End Sub";
return "";
}
public String  _host_timerofflinerefresh() throws Exception{
 //BA.debugLineNum = 1295;BA.debugLine="Public Sub Host_TimerOfflineRefresh";
 //BA.debugLineNum = 1296;BA.debugLine="OfflineDataRefreshTimer_Tick";
_offlinedatarefreshtimer_tick();
 //BA.debugLineNum = 1297;BA.debugLine="End Sub";
return "";
}
public String  _host_timerplaybackdirectortick() throws Exception{
 //BA.debugLineNum = 1279;BA.debugLine="Public Sub Host_TimerPlaybackDirectorTick";
 //BA.debugLineNum = 1280;BA.debugLine="Host_PlaybackDirectorTimerTick";
_host_playbackdirectortimertick();
 //BA.debugLineNum = 1281;BA.debugLine="End Sub";
return "";
}
public String  _host_timerplaybackwatchdogtick() throws Exception{
 //BA.debugLineNum = 1275;BA.debugLine="Public Sub Host_TimerPlaybackWatchdogTick";
 //BA.debugLineNum = 1276;BA.debugLine="Host_PlaybackWatchdogTimerTick";
_host_playbackwatchdogtimertick();
 //BA.debugLineNum = 1277;BA.debugLine="End Sub";
return "";
}
public String  _host_timertraceupload() throws Exception{
 //BA.debugLineNum = 1291;BA.debugLine="Public Sub Host_TimerTraceUpload";
 //BA.debugLineNum = 1292;BA.debugLine="TraceUploadTimer_Tick";
_traceuploadtimer_tick();
 //BA.debugLineNum = 1293;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 234;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _initsettings() throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Private Sub InitSettings";
 //BA.debugLineNum = 288;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
 //BA.debugLineNum = 289;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 290;BA.debugLine="messages.Initialize";
_messages.Initialize();
 //BA.debugLineNum = 291;BA.debugLine="messages.Put(\"network\", \"Проверьте интернет\")";
_messages.Put((Object)("network"),(Object)("Проверьте интернет"));
 //BA.debugLineNum = 292;BA.debugLine="messages.Put(\"connecting\", \"Подключение...\")";
_messages.Put((Object)("connecting"),(Object)("Подключение..."));
 //BA.debugLineNum = 293;BA.debugLine="messages.Put(\"syncing\", \"Синхронизация...\")";
_messages.Put((Object)("syncing"),(Object)("Синхронизация..."));
 //BA.debugLineNum = 294;BA.debugLine="messages.Put(\"server_wait\", \"Временная остановка\"";
_messages.Put((Object)("server_wait"),(Object)("Временная остановка"));
 //BA.debugLineNum = 295;BA.debugLine="messages.Put(\"playback_paused\", \"Воспроизведение";
_messages.Put((Object)("playback_paused"),(Object)("Воспроизведение приостановлено"));
 //BA.debugLineNum = 296;BA.debugLine="messages.Put(\"audio_device_check\", \"Проверьте зву";
_messages.Put((Object)("audio_device_check"),(Object)("Проверьте звуковое устройство"));
 //BA.debugLineNum = 297;BA.debugLine="messages.Put(\"subscription_expired\", \"Подписка ис";
_messages.Put((Object)("subscription_expired"),(Object)("Подписка истекла"));
 //BA.debugLineNum = 298;BA.debugLine="messages.Put(\"invalid_data_response\", \"Ошибка отв";
_messages.Put((Object)("invalid_data_response"),(Object)("Ошибка ответа сервера. Обратитесь в техподдержку"));
 //BA.debugLineNum = 299;BA.debugLine="messages.Put(\"idle\", \"Перерыв...\")";
_messages.Put((Object)("idle"),(Object)("Перерыв..."));
 //BA.debugLineNum = 300;BA.debugLine="messages.Put(\"idle_until\", \"Перерыв до {time}\")";
_messages.Put((Object)("idle_until"),(Object)("Перерыв до {time}"));
 //BA.debugLineNum = 301;BA.debugLine="messages.Put(\"blocked\", \"Плеер заблокирован\")";
_messages.Put((Object)("blocked"),(Object)("Плеер заблокирован"));
 //BA.debugLineNum = 302;BA.debugLine="messages.Put(\"idle_stream\", \"Запусти поток\")";
_messages.Put((Object)("idle_stream"),(Object)("Запусти поток"));
 //BA.debugLineNum = 303;BA.debugLine="messages.Put(\"player_required\", \"Не указан плеер\"";
_messages.Put((Object)("player_required"),(Object)("Не указан плеер"));
 //BA.debugLineNum = 304;BA.debugLine="messages.Put(\"device_required\", \"Не указано устро";
_messages.Put((Object)("device_required"),(Object)("Не указано устройство"));
 //BA.debugLineNum = 305;BA.debugLine="messages.Put(\"device_busy\", \"Плеер играет на друг";
_messages.Put((Object)("device_busy"),(Object)("Плеер играет на другом устройстве. Играть здесь?"));
 //BA.debugLineNum = 306;BA.debugLine="messages.Put(\"device_confirm_yes\", \"Да\")";
_messages.Put((Object)("device_confirm_yes"),(Object)("Да"));
 //BA.debugLineNum = 307;BA.debugLine="messages.Put(\"device_confirm_no\", \"Нет\")";
_messages.Put((Object)("device_confirm_no"),(Object)("Нет"));
 //BA.debugLineNum = 308;BA.debugLine="messages.Put(\"not_found\", \"Плеер не найден\")";
_messages.Put((Object)("not_found"),(Object)("Плеер не найден"));
 //BA.debugLineNum = 309;BA.debugLine="messages.Put(\"player_updated\", \"Плеер обновлен\")";
_messages.Put((Object)("player_updated"),(Object)("Плеер обновлен"));
 //BA.debugLineNum = 310;BA.debugLine="messages.Put(\"player_reloading\", \"Обновление…\")";
_messages.Put((Object)("player_reloading"),(Object)("Обновление…"));
 //BA.debugLineNum = 311;BA.debugLine="messages.Put(\"ad_label\", \"Реклама\")";
_messages.Put((Object)("ad_label"),(Object)("Реклама"));
 //BA.debugLineNum = 312;BA.debugLine="messages.Put(\"setup_title\", \"Введите код плеера\")";
_messages.Put((Object)("setup_title"),(Object)("Введите код плеера"));
 //BA.debugLineNum = 313;BA.debugLine="messages.Put(\"setup_placeholder\", \"\")";
_messages.Put((Object)("setup_placeholder"),(Object)(""));
 //BA.debugLineNum = 314;BA.debugLine="messages.Put(\"setup_submit\", \"Войти\")";
_messages.Put((Object)("setup_submit"),(Object)("Войти"));
 //BA.debugLineNum = 315;BA.debugLine="messages.Put(\"setup_invalid\", \"Введите код из 5 с";
_messages.Put((Object)("setup_invalid"),(Object)("Введите код из 5 символов"));
 //BA.debugLineNum = 316;BA.debugLine="messages.Put(\"logout\", \"Выйти\")";
_messages.Put((Object)("logout"),(Object)("Выйти"));
 //BA.debugLineNum = 317;BA.debugLine="messages.Put(\"settings_open\", \"Настройки\")";
_messages.Put((Object)("settings_open"),(Object)("Настройки"));
 //BA.debugLineNum = 318;BA.debugLine="messages.Put(\"settings_close\", \"Закрыть\")";
_messages.Put((Object)("settings_close"),(Object)("Закрыть"));
 //BA.debugLineNum = 319;BA.debugLine="messages.Put(\"settings_thanks\", \"Спасибо!\")";
_messages.Put((Object)("settings_thanks"),(Object)("Спасибо!"));
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public String  _initstate() throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Private Sub InitState";
 //BA.debugLineNum = 572;BA.debugLine="storageDir = PlatformBridge.ResolveStorageDir(\"fo";
_storagedir = _platformbridge._resolvestoragedir /*String*/ (ba,"fonfm");
 //BA.debugLineNum = 573;BA.debugLine="appUpdateDir = PlatformBridge.ResolveUpdateStageD";
_appupdatedir = _platformbridge._resolveupdatestagedir /*String*/ (ba,_storagedir);
 //BA.debugLineNum = 574;BA.debugLine="debugResponsesDir = File.Combine(storageDir, \"deb";
_debugresponsesdir = __c.File.Combine(_storagedir,"debugresponses");
 //BA.debugLineNum = 575;BA.debugLine="EnsureDirectory(storageDir)";
_ensuredirectory(_storagedir);
 //BA.debugLineNum = 576;BA.debugLine="EnsureDirectory(appUpdateDir)";
_ensuredirectory(_appupdatedir);
 //BA.debugLineNum = 577;BA.debugLine="EnsureDirectory(GetHistoryDir)";
_ensuredirectory(_gethistorydir());
 //BA.debugLineNum = 578;BA.debugLine="RndSeed(DateTime.Now)";
__c.RndSeed(__c.DateTime.getNow());
 //BA.debugLineNum = 579;BA.debugLine="storage.Initialize(storageDir, localStateDbName)";
_storage._initialize /*String*/ (ba,_storagedir,_localstatedbname);
 //BA.debugLineNum = 580;BA.debugLine="MigrateLegacyStorageIfNeeded";
_migratelegacystorageifneeded();
 //BA.debugLineNum = 581;BA.debugLine="playerCode = NormalizePlayerCode(storage.GetDefau";
_playercode = _normalizeplayercode(BA.ObjectToString(_storage._getdefault /*Object*/ ("player_code",(Object)(""))));
 //BA.debugLineNum = 582;BA.debugLine="appTraceService.Initialize(storageDir, debugRespo";
_apptraceservice._initialize /*String*/ (ba,_storagedir,_debugresponsesdir,_traceloglimit,_serversnapshotlimit);
 //BA.debugLineNum = 583;BA.debugLine="traceFormatter.Initialize";
_traceformatter._initialize /*String*/ (ba);
 //BA.debugLineNum = 584;BA.debugLine="traceRouter.Initialize(appTraceService, traceForm";
_tracerouter._initialize /*String*/ (ba,_apptraceservice,_traceformatter,_isreleasebuild(),_trace_error_debug_context_lines);
 //BA.debugLineNum = 585;BA.debugLine="playQueue.Initialize";
_playqueue.Initialize();
 //BA.debugLineNum = 586;BA.debugLine="orchestrationState.Initialize";
_orchestrationstate._initialize /*String*/ (ba);
 //BA.debugLineNum = 587;BA.debugLine="runtimeState.Initialize";
_runtimestate._initialize /*String*/ (ba);
 //BA.debugLineNum = 588;BA.debugLine="metaState.Initialize";
_metastate._initialize /*String*/ (ba);
 //BA.debugLineNum = 589;BA.debugLine="dataPolicyState.Initialize";
_datapolicystate._initialize /*String*/ (ba);
 //BA.debugLineNum = 590;BA.debugLine="directorState.Initialize";
_directorstate._initialize /*String*/ (ba);
 //BA.debugLineNum = 591;BA.debugLine="directorState.ConfigureDefaultSlots";
_directorstate._configuredefaultslots /*String*/ ();
 //BA.debugLineNum = 592;BA.debugLine="offlinePlaybackCore.Initialize";
_offlineplaybackcore._initialize /*String*/ (ba);
 //BA.debugLineNum = 593;BA.debugLine="transitionCoordinator.Initialize(Me)";
_transitioncoordinator._initialize /*String*/ (ba,(b4a.example.b4xmainpage)(this));
 //BA.debugLineNum = 594;BA.debugLine="localAdScheduler.Initialize(Me, \"TraceLog\", Messa";
_localadscheduler._initialize /*String*/ (ba,this,"TraceLog",_messagevalue("ad_label"));
 //BA.debugLineNum = 595;BA.debugLine="dataResolver.Initialize(storageDir, Me, \"TraceLog";
_dataresolver._initialize /*String*/ (ba,_storagedir,this,"TraceLog");
 //BA.debugLineNum = 596;BA.debugLine="dataResolver.LoadState(storage)";
_dataresolver._loadstate /*String*/ (_storage);
 //BA.debugLineNum = 597;BA.debugLine="TraceLog(\"курсор плейлистов load count=\" & dataRe";
_tracelog("курсор плейлистов load count="+BA.NumberToString(_dataresolver._cursorcount /*int*/ ()));
 //BA.debugLineNum = 598;BA.debugLine="deviceId = GetOrCreateDeviceId";
_deviceid = _getorcreatedeviceid();
 //BA.debugLineNum = 599;BA.debugLine="mediaCacheService.Initialize(storageDir, storage,";
_mediacacheservice._initialize /*String*/ (ba,_storagedir,_storage,this,"TraceLog",_deviceid);
 //BA.debugLineNum = 600;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
_mediacacheservice._cleanupplaybacktempfiles /*String*/ ();
 //BA.debugLineNum = 601;BA.debugLine="retryTimer.Initialize(\"RetryTimer\", SERVER_RETRY_";
_retrytimer.Initialize(ba,"RetryTimer",(long) (_server_retry_delay_initial));
 //BA.debugLineNum = 609;BA.debugLine="orbitTimer.Initialize(\"OrbitTimer\", 70)";
_orbittimer.Initialize(ba,"OrbitTimer",(long) (70));
 //BA.debugLineNum = 617;BA.debugLine="offlineStoreService.Initialize(storageDir, storag";
_offlinestoreservice._initialize /*String*/ (ba,_storagedir,_storage,this,"TraceLog",_playerdatafile,_playlistrequirementsfile,_localplaylistsdirname,_playlist_cdn_base_url);
 //BA.debugLineNum = 618;BA.debugLine="stateStore.Initialize(Me, retryTimer, dataPolicyS";
_statestore._initialize /*String*/ (ba,(b4a.example.b4xmainpage)(this),_retrytimer,_datapolicystate,_orchestrationstate,_storage,_trustedsynctimekey,_offlinestoreservice,_dataresolver,_mediacacheservice,_local_retry_delay_initial,_server_retry_delay_initial);
 //BA.debugLineNum = 619;BA.debugLine="syncService.Initialize(stateStore)";
_syncservice._initialize /*String*/ (ba,_statestore);
 //BA.debugLineNum = 620;BA.debugLine="traceUploader.Initialize(stateStore, appTraceServ";
_traceuploader._initialize /*String*/ (ba,_statestore,_apptraceservice,_syncservice,_trace_base_url,_resolveappversion());
 //BA.debugLineNum = 621;BA.debugLine="playerDataCoordinator.Initialize(stateStore, sync";
_playerdatacoordinator._initialize /*String*/ (ba,_statestore,_syncservice);
 //BA.debugLineNum = 623;BA.debugLine="serviceBridge.Initialize";
_servicebridge._initialize /*String*/ (ba);
 //BA.debugLineNum = 625;BA.debugLine="isHistoryFlushInProgress = False";
_ishistoryflushinprogress = __c.False;
 //BA.debugLineNum = 626;BA.debugLine="isPlaybackWatchdogTickInProgress = False";
_isplaybackwatchdogtickinprogress = __c.False;
 //BA.debugLineNum = 627;BA.debugLine="isPlaybackDirectorTickQueued = False";
_isplaybackdirectortickqueued = __c.False;
 //BA.debugLineNum = 628;BA.debugLine="isStartupSequenceInProgress = False";
_isstartupsequenceinprogress = __c.False;
 //BA.debugLineNum = 629;BA.debugLine="stateStore.SetStartupSequenceInProgress(False)";
_statestore._setstartupsequenceinprogress /*String*/ (__c.False);
 //BA.debugLineNum = 630;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
_isadwarmupdeferredafterstartup = __c.False;
 //BA.debugLineNum = 631;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
_ispoststarttasksdeferredafterstartup = __c.False;
 //BA.debugLineNum = 632;BA.debugLine="cachedRelevantTrackIds.Initialize";
_cachedrelevanttrackids.Initialize();
 //BA.debugLineNum = 633;BA.debugLine="audioTimeupdateQueuedByKey.Initialize";
_audiotimeupdatequeuedbykey.Initialize();
 //BA.debugLineNum = 634;BA.debugLine="lastTrackCachePruneAt = 0";
_lasttrackcachepruneat = (long) (0);
 //BA.debugLineNum = 635;BA.debugLine="playbackFlowState = FLOW_IDLE";
_playbackflowstate = _flow_idle;
 //BA.debugLineNum = 636;BA.debugLine="ResetPlaybackWatchdogState";
_resetplaybackwatchdogstate();
 //BA.debugLineNum = 637;BA.debugLine="directorState.SetFlowState(playbackFlowState)";
_directorstate._setflowstate /*String*/ (_playbackflowstate);
 //BA.debugLineNum = 638;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 //BA.debugLineNum = 639;BA.debugLine="stateStore.SetOfflineData(offlineStoreService.Loa";
_statestore._setofflinedata /*String*/ (_offlinestoreservice._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ ());
 //BA.debugLineNum = 640;BA.debugLine="RefreshPendingHistoryState";
_refreshpendinghistorystate();
 //BA.debugLineNum = 641;BA.debugLine="ResolveMachineGuidAsync";
_resolvemachineguidasync();
 //BA.debugLineNum = 642;BA.debugLine="TraceLog(\"состояние init dir=\" & storageDir & \" p";
_tracelog("состояние init dir="+_storagedir+" player="+_formatplayercodefordisplay(_playercode));
 //BA.debugLineNum = 643;BA.debugLine="End Sub";
return "";
}
public String  _invalidaterelevanttrackidscache() throws Exception{
 //BA.debugLineNum = 1113;BA.debugLine="Private Sub InvalidateRelevantTrackIdsCache";
 //BA.debugLineNum = 1114;BA.debugLine="If cachedRelevantTrackIds.IsInitialized = False T";
if (_cachedrelevanttrackids.IsInitialized()==__c.False) { 
_cachedrelevanttrackids.Initialize();};
 //BA.debugLineNum = 1115;BA.debugLine="cachedRelevantTrackIds.Clear";
_cachedrelevanttrackids.Clear();
 //BA.debugLineNum = 1116;BA.debugLine="End Sub";
return "";
}
public boolean  _ishistorybatchaccepted(String _responsetext) throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _response = null;
 //BA.debugLineNum = 3733;BA.debugLine="Private Sub IsHistoryBatchAccepted(responseText As";
 //BA.debugLineNum = 3734;BA.debugLine="Try";
try { //BA.debugLineNum = 3735;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 3736;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
 //BA.debugLineNum = 3737;BA.debugLine="Dim response As Map = parser.NextObject";
_response = new anywheresoftware.b4a.objects.collections.Map();
_response = _parser.NextObject();
 //BA.debugLineNum = 3738;BA.debugLine="Return response.GetDefault(\"ok\", False) = True";
if (true) return (_response.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True));
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 3740;BA.debugLine="TraceLog(\"история response parse ошибка\")";
_tracelog("история response parse ошибка");
 };
 //BA.debugLineNum = 3742;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 3743;BA.debugLine="End Sub";
return false;
}
public boolean  _ishistoryfilename(String _filename) throws Exception{
 //BA.debugLineNum = 3771;BA.debugLine="Private Sub IsHistoryFileName(fileName As String)";
 //BA.debugLineNum = 3772;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3773;BA.debugLine="If fileName.EndsWith(\".ndjson\") = False Then Retu";
if (_filename.endsWith(".ndjson")==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3774;BA.debugLine="Return Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}\\.ndjson$";
if (true) return __c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}\\.ndjson$",_filename);
 //BA.debugLineNum = 3775;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackallowedbycurrentdata() throws Exception{
 //BA.debugLineNum = 3391;BA.debugLine="Private Sub IsPlaybackAllowedByCurrentData As Bool";
 //BA.debugLineNum = 3392;BA.debugLine="Return playerDataCoordinator.IsPlaybackAllowed(st";
if (true) return _playerdatacoordinator._isplaybackallowed /*boolean*/ (_statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (),_effectivenowticks());
 //BA.debugLineNum = 3393;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackflowactive() throws Exception{
 //BA.debugLineNum = 2252;BA.debugLine="Private Sub IsPlaybackFlowActive As Boolean";
 //BA.debugLineNum = 2253;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
if (true) return _directorstate._isflowactive /*boolean*/ ();};
 //BA.debugLineNum = 2254;BA.debugLine="Return playbackFlowState = FLOW_PLAYING Or playba";
if (true) return (_playbackflowstate).equals(_flow_playing) || (_playbackflowstate).equals(_flow_preparing) || (_playbackflowstate).equals(_flow_transitioning) || (_playbackflowstate).equals(_flow_starting);
 //BA.debugLineNum = 2255;BA.debugLine="End Sub";
return false;
}
public String  _isplaybackrunningfortrace() throws Exception{
 //BA.debugLineNum = 4192;BA.debugLine="Private Sub IsPlaybackRunningForTrace As String";
 //BA.debugLineNum = 4193;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False) { 
if (true) return "false";};
 //BA.debugLineNum = 4194;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if ((_transition_getdirectoractiveaudiokey()).equals("")) { 
if (true) return "false";};
 //BA.debugLineNum = 4195;BA.debugLine="Return \"true\"";
if (true) return "true";
 //BA.debugLineNum = 4196;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackstallalreadyrecovered(String _expectedtrackid,long _expectedpositionms,long _expectedactivationtoken) throws Exception{
String _currenttrackid = "";
long _currentpositionms = 0L;
 //BA.debugLineNum = 2175;BA.debugLine="Private Sub IsPlaybackStallAlreadyRecovered(expect";
 //BA.debugLineNum = 2176;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False || _orchestrationstate._isstoppedbyuser /*boolean*/  || _orchestrationstate._isstopping /*boolean*/  || _ispolicypausestate()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2177;BA.debugLine="If expectedActivationToken <> playbackActivationT";
if (_expectedactivationtoken!=_playbackactivationtoken) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2178;BA.debugLine="If HasObservableActivePlayback = False Then Retur";
if (_hasobservableactiveplayback()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2179;BA.debugLine="Dim currentTrackId As String = ActiveTrackIdForWa";
_currenttrackid = _activetrackidforwatchdog();
 //BA.debugLineNum = 2180;BA.debugLine="Dim currentPositionMs As Long = ActivePlaybackPos";
_currentpositionms = _activeplaybackpositionms();
 //BA.debugLineNum = 2181;BA.debugLine="If currentTrackId <> \"\" And currentTrackId <> exp";
if ((_currenttrackid).equals("") == false && (_currenttrackid).equals(_expectedtrackid) == false) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2182;BA.debugLine="If currentPositionMs >= 0 And expectedPositionMs";
if (_currentpositionms>=0 && _expectedpositionms<0) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2183;BA.debugLine="If currentPositionMs >= 0 And currentPositionMs >";
if (_currentpositionms>=0 && _currentpositionms>_expectedpositionms+_playback_watchdog_progress_delta_ms) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2184;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 2185;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybacktransitioninprogress() throws Exception{
 //BA.debugLineNum = 2247;BA.debugLine="Private Sub IsPlaybackTransitionInProgress As Bool";
 //BA.debugLineNum = 2248;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
if (true) return _directorstate._istransitioninprogress /*boolean*/ ();};
 //BA.debugLineNum = 2249;BA.debugLine="Return playbackFlowState = FLOW_STARTING Or playb";
if (true) return (_playbackflowstate).equals(_flow_starting) || (_playbackflowstate).equals(_flow_transitioning) || (_playbackflowstate).equals(_flow_stopping);
 //BA.debugLineNum = 2250;BA.debugLine="End Sub";
return false;
}
public boolean  _ispolicypausestate() throws Exception{
 //BA.debugLineNum = 2296;BA.debugLine="Private Sub IsPolicyPauseState As Boolean";
 //BA.debugLineNum = 2297;BA.debugLine="If directorState.IsInitialized Then Return dataPo";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
if (true) return _datapolicystate._isplaybackpausedbypolicy /*boolean*/  || (_directorstate._flowstate /*String*/ ).equals(_flow_paused_policy);};
 //BA.debugLineNum = 2298;BA.debugLine="Return dataPolicyState.IsPlaybackPausedByPolicy O";
if (true) return _datapolicystate._isplaybackpausedbypolicy /*boolean*/  || (_playbackflowstate).equals(_flow_paused_policy);
 //BA.debugLineNum = 2299;BA.debugLine="End Sub";
return false;
}
public boolean  _isreleasebuild() throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Private Sub IsReleaseBuild As Boolean";
 //BA.debugLineNum = 560;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return false;
}
public boolean  _isuserstoppedstate() throws Exception{
 //BA.debugLineNum = 2292;BA.debugLine="Private Sub IsUserStoppedState As Boolean";
 //BA.debugLineNum = 2293;BA.debugLine="Return orchestrationState.IsStoppedByUser";
if (true) return _orchestrationstate._isstoppedbyuser /*boolean*/ ;
 //BA.debugLineNum = 2294;BA.debugLine="End Sub";
return false;
}
public boolean  _itemsmatch(anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
 //BA.debugLineNum = 2454;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
 //BA.debugLineNum = 2455;BA.debugLine="If firstItem.IsInitialized = False Or secondItem.";
if (_firstitem.IsInitialized()==__c.False || _seconditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2456;BA.debugLine="If firstItem.GetDefault(\"type\", \"\") <> secondItem";
if ((_firstitem.GetDefault((Object)("type"),(Object)(""))).equals(_seconditem.GetDefault((Object)("type"),(Object)(""))) == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2457;BA.debugLine="If firstItem.GetDefault(\"id\", \"\") <> \"\" And first";
if ((_firstitem.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false && (_firstitem.GetDefault((Object)("id"),(Object)(""))).equals(_seconditem.GetDefault((Object)("id"),(Object)("")))) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2458;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 2459;BA.debugLine="End Sub";
return false;
}
public String  _joinlist(anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 5076;BA.debugLine="Private Sub JoinList(items As List, separator As S";
 //BA.debugLineNum = 5077;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 5078;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 5079;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 5080;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
 //BA.debugLineNum = 5081;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
 //BA.debugLineNum = 5083;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 5084;BA.debugLine="End Sub";
return "";
}
public String  _layoutui(int _width,int _height) throws Exception{
int _safewidth = 0;
int _safeheight = 0;
int _outerpad = 0;
int _horizontalpad = 0;
int _sectiongap = 0;
int _contentgap = 0;
int _headerheight = 0;
int _footerheight = 0;
int _cardwidth = 0;
int _preferredheight = 0;
int _cardheight = 0;
int _cardleft = 0;
int _cardtop = 0;
int _headeractionsize = 0;
int _contentheight = 0;
int _heroheight = 0;
int _detailheight = 0;
int _contentwidth = 0;
int _controlsize = 0;
int _inputleft = 0;
int _inputtop = 0;
int _accessorbitsize = 0;
int _inputpanewidth = 0;
int _inputpaneheight = 0;
int _inputpaneleft = 0;
int _inputpanetop = 0;
int _codefieldheight = 0;
int _orbitsize = 0;
int _orbitleft = 0;
int _controlleft = 0;
int _controltop = 0;
int _streamtextwidth = 0;
int _streamtextleft = 0;
int _infoheight = 0;
int _infotextwidth = 0;
int _infotextleft = 0;
int _connectioniconsize = 0;
int _footergap = 0;
int _footeravailablewidth = 0;
int _footergroupleft = 0;
 //BA.debugLineNum = 763;BA.debugLine="Private Sub LayoutUi(width As Int, height As Int)";
 //BA.debugLineNum = 764;BA.debugLine="Dim safeWidth As Int = Max(width, 320dip)";
_safewidth = (int) (__c.Max(_width,__c.DipToCurrent((int) (320))));
 //BA.debugLineNum = 765;BA.debugLine="Dim safeHeight As Int = Max(height, 420dip)";
_safeheight = (int) (__c.Max(_height,__c.DipToCurrent((int) (420))));
 //BA.debugLineNum = 766;BA.debugLine="Dim outerPad As Int = ScaleValue(safeWidth, 12dip";
_outerpad = _scalevalue(_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 767;BA.debugLine="Dim horizontalPad As Int = ScaleValue(safeWidth,";
_horizontalpad = _scalevalue(_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (24)));
 //BA.debugLineNum = 768;BA.debugLine="Dim sectionGap As Int = ScaleValue(safeWidth, 24d";
_sectiongap = _scalevalue(_safewidth,__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (48)));
 //BA.debugLineNum = 769;BA.debugLine="Dim contentGap As Int = ScaleValue(safeWidth, 8di";
_contentgap = _scalevalue(_safewidth,__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (12)));
 //BA.debugLineNum = 770;BA.debugLine="Dim headerHeight As Int = ScaleValue(safeWidth, 5";
_headerheight = _scalevalue(_safewidth,__c.DipToCurrent((int) (56)),__c.DipToCurrent((int) (64)),__c.DipToCurrent((int) (72)));
 //BA.debugLineNum = 771;BA.debugLine="Dim footerHeight As Int = headerHeight";
_footerheight = _headerheight;
 //BA.debugLineNum = 774;BA.debugLine="Dim cardWidth As Int = Min(500dip, safeWidth - ou";
_cardwidth = (int) (__c.Min(__c.DipToCurrent((int) (500)),_safewidth-_outerpad*2));
 //BA.debugLineNum = 775;BA.debugLine="Dim preferredHeight As Int = Max(400dip, safeHeig";
_preferredheight = (int) (__c.Max(__c.DipToCurrent((int) (400)),_safeheight-_outerpad*2));
 //BA.debugLineNum = 776;BA.debugLine="Dim cardHeight As Int = Min(preferredHeight, safe";
_cardheight = (int) (__c.Min(_preferredheight,_safeheight-__c.DipToCurrent((int) (8))));
 //BA.debugLineNum = 777;BA.debugLine="Dim cardLeft As Int = (safeWidth - cardWidth) / 2";
_cardleft = (int) ((_safewidth-_cardwidth)/(double)2);
 //BA.debugLineNum = 778;BA.debugLine="Dim cardTop As Int = (safeHeight - cardHeight) /";
_cardtop = (int) ((_safeheight-_cardheight)/(double)2);
 //BA.debugLineNum = 779;BA.debugLine="UpdateResponsiveStyles(safeWidth)";
_updateresponsivestyles(_safewidth);
 //BA.debugLineNum = 781;BA.debugLine="card.SetLayoutAnimated(0, cardLeft, cardTop, card";
_card.SetLayoutAnimated((int) (0),_cardleft,_cardtop,_cardwidth,_cardheight);
 //BA.debugLineNum = 782;BA.debugLine="headerPane.SetLayoutAnimated(0, 0, 0, cardWidth,";
_headerpane.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_cardwidth,_headerheight);
 //BA.debugLineNum = 783;BA.debugLine="contentPane.SetLayoutAnimated(0, 0, headerHeight";
_contentpane.SetLayoutAnimated((int) (0),(int) (0),(int) (_headerheight+_sectiongap/(double)2),_cardwidth,(int) (_cardheight-_headerheight-_footerheight-_sectiongap));
 //BA.debugLineNum = 784;BA.debugLine="footerPane.SetLayoutAnimated(0, 0, cardHeight - f";
_footerpane.SetLayoutAnimated((int) (0),(int) (0),(int) (_cardheight-_footerheight),_cardwidth,_footerheight);
 //BA.debugLineNum = 786;BA.debugLine="Dim headerActionSize As Int = ScaleValue(safeWidt";
_headeractionsize = _scalevalue(_safewidth,__c.DipToCurrent((int) (36)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (42)));
 //BA.debugLineNum = 787;BA.debugLine="headerActionPane.SetLayoutAnimated(0, cardWidth -";
_headeractionpane.SetLayoutAnimated((int) (0),(int) (_cardwidth-_horizontalpad-_headeractionsize),(int) ((_headerheight-_headeractionsize)/(double)2),_headeractionsize,_headeractionsize);
 //BA.debugLineNum = 788;BA.debugLine="lblHeaderAction.SetLayoutAnimated(0, 0, 0, header";
_lblheaderaction.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_headeractionpane.getWidth(),_headeractionpane.getHeight());
 //BA.debugLineNum = 789;BA.debugLine="lblHeader.SetLayoutAnimated(0, horizontalPad + he";
_lblheader.SetLayoutAnimated((int) (0),(int) (_horizontalpad+_headeractionsize+_contentgap),(int) (0),(int) (_cardwidth-(_horizontalpad+_headeractionsize+_contentgap)*2),_headerheight);
 //BA.debugLineNum = 791;BA.debugLine="setupPane.SetLayoutAnimated(0, 0, 0, contentPane.";
_setuppane.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_contentpane.getWidth(),_contentpane.getHeight());
 //BA.debugLineNum = 792;BA.debugLine="playerPane.SetLayoutAnimated(0, 0, 0, contentPane";
_playerpane.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_contentpane.getWidth(),_contentpane.getHeight());
 //BA.debugLineNum = 794;BA.debugLine="Dim contentHeight As Int = contentPane.Height";
_contentheight = _contentpane.getHeight();
 //BA.debugLineNum = 795;BA.debugLine="Dim heroHeight As Int = Max(160dip, (contentHeigh";
_heroheight = (int) (__c.Max(__c.DipToCurrent((int) (160)),(_contentheight-_sectiongap)/(double)2));
 //BA.debugLineNum = 796;BA.debugLine="Dim detailHeight As Int = Max(120dip, contentHeig";
_detailheight = (int) (__c.Max(__c.DipToCurrent((int) (120)),_contentheight-_heroheight-_sectiongap));
 //BA.debugLineNum = 797;BA.debugLine="Dim contentWidth As Int = cardWidth - horizontalP";
_contentwidth = (int) (_cardwidth-_horizontalpad*2);
 //BA.debugLineNum = 799;BA.debugLine="setupHeroPane.SetLayoutAnimated(0, horizontalPad,";
_setupheropane.SetLayoutAnimated((int) (0),_horizontalpad,(int) (0),_contentwidth,_heroheight);
 //BA.debugLineNum = 800;BA.debugLine="setupDetailPane.SetLayoutAnimated(0, horizontalPa";
_setupdetailpane.SetLayoutAnimated((int) (0),_horizontalpad,(int) (_heroheight+_sectiongap),_contentwidth,_detailheight);
 //BA.debugLineNum = 801;BA.debugLine="playerHeroPane.SetLayoutAnimated(0, horizontalPad";
_playerheropane.SetLayoutAnimated((int) (0),_horizontalpad,(int) (0),_contentwidth,_heroheight);
 //BA.debugLineNum = 802;BA.debugLine="playerDetailPane.SetLayoutAnimated(0, horizontalP";
_playerdetailpane.SetLayoutAnimated((int) (0),_horizontalpad,(int) (_heroheight+_sectiongap),_contentwidth,_detailheight);
 //BA.debugLineNum = 804;BA.debugLine="Dim controlSize As Int = ScaleValue(safeWidth, 15";
_controlsize = _scalevalue(_safewidth,__c.DipToCurrent((int) (156)),__c.DipToCurrent((int) (172)),__c.DipToCurrent((int) (182)));
 //BA.debugLineNum = 805;BA.debugLine="Dim inputLeft As Int = (setupHeroPane.Width - con";
_inputleft = (int) ((_setupheropane.getWidth()-_controlsize)/(double)2);
 //BA.debugLineNum = 806;BA.debugLine="Dim inputTop As Int = Max(0, (setupHeroPane.Heigh";
_inputtop = (int) (__c.Max(0,(_setupheropane.getHeight()-_controlsize)/(double)2));
 //BA.debugLineNum = 807;BA.debugLine="Dim accessOrbitSize As Int = controlSize + 20dip";
_accessorbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 808;BA.debugLine="accessCorePane.SetLayoutAnimated(0, inputLeft - 1";
_accesscorepane.SetLayoutAnimated((int) (0),(int) (_inputleft-__c.DipToCurrent((int) (10))),(int) (_inputtop-__c.DipToCurrent((int) (10))),_accessorbitsize,_accessorbitsize);
 //BA.debugLineNum = 809;BA.debugLine="accessCirclePane.SetLayoutAnimated(0, inputLeft,";
_accesscirclepane.SetLayoutAnimated((int) (0),_inputleft,_inputtop,_controlsize,_controlsize);
 //BA.debugLineNum = 810;BA.debugLine="Dim inputPaneWidth As Int = controlSize - 34dip";
_inputpanewidth = (int) (_controlsize-__c.DipToCurrent((int) (34)));
 //BA.debugLineNum = 811;BA.debugLine="Dim inputPaneHeight As Int = Min(72dip, controlSi";
_inputpaneheight = (int) (__c.Min(__c.DipToCurrent((int) (72)),_controlsize-__c.DipToCurrent((int) (62))));
 //BA.debugLineNum = 812;BA.debugLine="Dim inputPaneLeft As Int = (controlSize - inputPa";
_inputpaneleft = (int) ((_controlsize-_inputpanewidth)/(double)2);
 //BA.debugLineNum = 813;BA.debugLine="Dim inputPaneTop As Int = (controlSize - inputPan";
_inputpanetop = (int) ((_controlsize-_inputpaneheight)/(double)2);
 //BA.debugLineNum = 814;BA.debugLine="accessInputPane.SetLayoutAnimated(0, inputPaneLef";
_accessinputpane.SetLayoutAnimated((int) (0),_inputpaneleft,_inputpanetop,_inputpanewidth,_inputpaneheight);
 //BA.debugLineNum = 815;BA.debugLine="Dim codeFieldHeight As Int = inputPaneHeight";
_codefieldheight = _inputpaneheight;
 //BA.debugLineNum = 816;BA.debugLine="txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inpu";
_txtplayercodeview.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_inputpanewidth,_codefieldheight);
 //BA.debugLineNum = 818;BA.debugLine="Dim orbitSize As Int = controlSize + 20dip";
_orbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 819;BA.debugLine="Dim orbitLeft As Int = (playerHeroPane.Width - or";
_orbitleft = (int) ((_playerheropane.getWidth()-_orbitsize)/(double)2);
 //BA.debugLineNum = 820;BA.debugLine="Dim controlLeft As Int = (playerHeroPane.Width -";
_controlleft = (int) ((_playerheropane.getWidth()-_controlsize)/(double)2);
 //BA.debugLineNum = 821;BA.debugLine="Dim controlTop As Int = Max(0, (playerHeroPane.He";
_controltop = (int) (__c.Max(0,(_playerheropane.getHeight()-_controlsize)/(double)2));
 //BA.debugLineNum = 822;BA.debugLine="orbitPane.SetLayoutAnimated(0, orbitLeft, control";
_orbitpane.SetLayoutAnimated((int) (0),_orbitleft,(int) (_controltop-__c.DipToCurrent((int) (10))),_orbitsize,_orbitsize);
 //BA.debugLineNum = 823;BA.debugLine="playButtonPane.SetLayoutAnimated(0, controlLeft,";
_playbuttonpane.SetLayoutAnimated((int) (0),_controlleft,_controltop,_controlsize,_controlsize);
 //BA.debugLineNum = 824;BA.debugLine="lblPlayIcon.SetLayoutAnimated(0, 0, 1dip, control";
_lblplayicon.SetLayoutAnimated((int) (0),(int) (0),__c.DipToCurrent((int) (1)),_controlsize,_controlsize);
 //BA.debugLineNum = 826;BA.debugLine="setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setup";
_setupprimarypane.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_setupdetailpane.getWidth(),(int) (__c.Max(__c.DipToCurrent((int) (56)),_setupdetailpane.getHeight()*0.38)));
 //BA.debugLineNum = 827;BA.debugLine="setupStatusPane.SetLayoutAnimated(0, 0, setupPrim";
_setupstatuspane.SetLayoutAnimated((int) (0),(int) (0),(int) (_setupprimarypane.getHeight()+_contentgap),_setupdetailpane.getWidth(),(int) (_setupdetailpane.getHeight()-_setupprimarypane.getHeight()-_contentgap));
 //BA.debugLineNum = 828;BA.debugLine="btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setup";
_btnsetupsubmit.SetLayoutAnimated((int) (0),(int) (__c.Max(0,(_setupprimarypane.getWidth()-__c.DipToCurrent((int) (132)))/(double)2)),(int) (__c.Max(0,(_setupprimarypane.getHeight()-__c.DipToCurrent((int) (44)))/(double)2)),__c.DipToCurrent((int) (132)),__c.DipToCurrent((int) (44)));
 //BA.debugLineNum = 829;BA.debugLine="lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupS";
_lblsetupmessage.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_setupstatuspane.getWidth(),_setupstatuspane.getHeight());
 //BA.debugLineNum = 831;BA.debugLine="playerPrimaryPane.SetLayoutAnimated(0, 0, 0, play";
_playerprimarypane.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_playerdetailpane.getWidth(),(int) (__c.Max(__c.DipToCurrent((int) (56)),_playerdetailpane.getHeight()*0.4)));
 //BA.debugLineNum = 832;BA.debugLine="playerStatusPane.SetLayoutAnimated(0, 0, playerPr";
_playerstatuspane.SetLayoutAnimated((int) (0),(int) (0),(int) (_playerprimarypane.getHeight()+_contentgap),_playerdetailpane.getWidth(),(int) (_playerdetailpane.getHeight()-_playerprimarypane.getHeight()-_contentgap));
 //BA.debugLineNum = 835;BA.debugLine="Dim streamTextWidth As Int = Min(playerPrimaryPan";
_streamtextwidth = (int) (__c.Min(_playerprimarypane.getWidth(),__c.DipToCurrent((int) (340))));
 //BA.debugLineNum = 836;BA.debugLine="Dim streamTextLeft As Int = Max(0, (playerPrimary";
_streamtextleft = (int) (__c.Max(0,(_playerprimarypane.getWidth()-_streamtextwidth)/(double)2));
 //BA.debugLineNum = 837;BA.debugLine="lblStream.SetLayoutAnimated(0, streamTextLeft, 0,";
_lblstream.SetLayoutAnimated((int) (0),_streamtextleft,(int) (0),_streamtextwidth,_playerprimarypane.getHeight());
 //BA.debugLineNum = 838;BA.debugLine="Dim infoHeight As Int = Max(54dip, playerStatusPa";
_infoheight = (int) (__c.Max(__c.DipToCurrent((int) (54)),_playerstatuspane.getHeight()-_confirmreservedheight()));
 //BA.debugLineNum = 839;BA.debugLine="Dim infoTextWidth As Int = Min(playerStatusPane.W";
_infotextwidth = (int) (__c.Min(_playerstatuspane.getWidth(),__c.DipToCurrent((int) (380))));
 //BA.debugLineNum = 840;BA.debugLine="Dim infoTextLeft As Int = Max(0, (playerStatusPan";
_infotextleft = (int) (__c.Max(0,(_playerstatuspane.getWidth()-_infotextwidth)/(double)2));
 //BA.debugLineNum = 841;BA.debugLine="lblInfo.SetLayoutAnimated(0, infoTextLeft, 0, inf";
_lblinfo.SetLayoutAnimated((int) (0),_infotextleft,(int) (0),_infotextwidth,_infoheight);
 //BA.debugLineNum = 842;BA.debugLine="If confirmPane.Visible Then";
if (_confirmpane.getVisible()) { 
 //BA.debugLineNum = 843;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
_confirmpane.SetLayoutAnimated((int) (0),(int) (0),(int) (_playerstatuspane.getHeight()-__c.DipToCurrent((int) (72))),_playerstatuspane.getWidth(),__c.DipToCurrent((int) (72)));
 }else {
 //BA.debugLineNum = 845;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
_confirmpane.SetLayoutAnimated((int) (0),(int) (0),_playerstatuspane.getHeight(),_playerstatuspane.getWidth(),(int) (0));
 };
 //BA.debugLineNum = 847;BA.debugLine="btnConfirmYes.SetLayoutAnimated(0, Max(0, (confir";
_btnconfirmyes.SetLayoutAnimated((int) (0),(int) (__c.Max(0,(_confirmpane.getWidth()-__c.DipToCurrent((int) (236)))/(double)2)),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
 //BA.debugLineNum = 848;BA.debugLine="btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.L";
_btnconfirmno.SetLayoutAnimated((int) (0),(int) (_btnconfirmyes.getLeft()+__c.DipToCurrent((int) (124))),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
 //BA.debugLineNum = 850;BA.debugLine="Dim connectionIconSize As Int = ScaleValue(safeWi";
_connectioniconsize = _scalevalue(_safewidth,__c.DipToCurrent((int) (18)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 851;BA.debugLine="Dim footerGap As Int = 8dip";
_footergap = __c.DipToCurrent((int) (8));
 //BA.debugLineNum = 852;BA.debugLine="Dim footerAvailableWidth As Int = Max(120dip, car";
_footeravailablewidth = (int) (__c.Max(__c.DipToCurrent((int) (120)),_cardwidth-_horizontalpad*2));
 //BA.debugLineNum = 853;BA.debugLine="Dim footerGroupLeft As Int = Max(horizontalPad, (";
_footergroupleft = (int) (__c.Max(_horizontalpad,(_cardwidth-_footeravailablewidth)/(double)2));
 //BA.debugLineNum = 854;BA.debugLine="lblConnectionIcon.SetLayoutAnimated(0, footerGrou";
_lblconnectionicon.SetLayoutAnimated((int) (0),_footergroupleft,(int) ((_footerheight-_connectioniconsize)/(double)2),_connectioniconsize,_connectioniconsize);
 //BA.debugLineNum = 855;BA.debugLine="lblFooter.SetLayoutAnimated(0, footerGroupLeft +";
_lblfooter.SetLayoutAnimated((int) (0),(int) (_footergroupleft+_connectioniconsize+_footergap),(int) (0),(int) (_footeravailablewidth-_connectioniconsize-_footergap),_footerheight);
 //BA.debugLineNum = 856;BA.debugLine="UpdateVisibleMode";
_updatevisiblemode();
 //BA.debugLineNum = 857;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadnextandplay() throws Exception{
ResumableSub_LoadNextAndPlay rsub = new ResumableSub_LoadNextAndPlay(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadNextAndPlay extends BA.ResumableSub {
public ResumableSub_LoadNextAndPlay(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _advanced = false;

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
 //BA.debugLineNum = 2776;BA.debugLine="Wait For (Facade_LoadNextAndPlayCore) Complete (a";
parent.__c.WaitFor("complete", ba, this, parent._facade_loadnextandplaycore());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (Boolean) result[0];
;
 //BA.debugLineNum = 2777;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
 //BA.debugLineNum = 2778;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _localadminutetimer_tick() throws Exception{
 //BA.debugLineNum = 1221;BA.debugLine="Private Sub LocalAdMinuteTimer_Tick";
 //BA.debugLineNum = 1222;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False || _orchestrationstate._isstoppedbyuser /*boolean*/  || _orchestrationstate._isstopping /*boolean*/ ) { 
if (true) return "";};
 //BA.debugLineNum = 1223;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (_currentsecondofminute()<50) { 
if (true) return "";};
 //BA.debugLineNum = 1224;BA.debugLine="PreScanUpcomingAdMinute(True)";
_prescanupcomingadminute(__c.True);
 //BA.debugLineNum = 1225;BA.debugLine="End Sub";
return "";
}
public long  _localnowtimestamp() throws Exception{
 //BA.debugLineNum = 5045;BA.debugLine="Private Sub LocalNowTimestamp As Long";
 //BA.debugLineNum = 5046;BA.debugLine="Return Floor(EffectiveNowTicks / 1000) - (Timezon";
if (true) return (long) (__c.Floor(_effectivenowticks()/(double)1000)-(_timezoneoffsetminutes()*60));
 //BA.debugLineNum = 5047;BA.debugLine="End Sub";
return 0L;
}
public long  _localtimestamptoticks(long _targettimestamp) throws Exception{
 //BA.debugLineNum = 3300;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
 //BA.debugLineNum = 3301;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(_timezoneoffsetminutes()*60))*1000);
 //BA.debugLineNum = 3302;BA.debugLine="End Sub";
return 0L;
}
public String  _loghttpfailure(String _url,String _kind) throws Exception{
 //BA.debugLineNum = 3028;BA.debugLine="Private Sub LogHttpFailure(url As String, kind As";
 //BA.debugLineNum = 3029;BA.debugLine="syncService.LogHttpFailure(url, kind)";
_syncservice._loghttpfailure /*String*/ (_url,_kind);
 //BA.debugLineNum = 3030;BA.debugLine="End Sub";
return "";
}
public String  _logslowmainoperation(String _operationname,long _startedat) throws Exception{
long _elapsed = 0L;
 //BA.debugLineNum = 4115;BA.debugLine="Private Sub LogSlowMainOperation(operationName As";
 //BA.debugLineNum = 4116;BA.debugLine="Dim elapsed As Long = DateTime.Now - startedAt";
_elapsed = (long) (__c.DateTime.getNow()-_startedat);
 //BA.debugLineNum = 4117;BA.debugLine="If elapsed < 50 Then Return";
if (_elapsed<50) { 
if (true) return "";};
 //BA.debugLineNum = 4118;BA.debugLine="TraceDebug(\"main slow op=\" & operationName & \" el";
_tracedebug("main slow op="+_operationname+" elapsedMs="+BA.NumberToString(_elapsed)+" flow="+_playbackflowstate);
 //BA.debugLineNum = 4119;BA.debugLine="End Sub";
return "";
}
public String  _machineguidshell_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
 //BA.debugLineNum = 4842;BA.debugLine="Private Sub MachineGuidShell_ProcessCompleted (suc";
 //BA.debugLineNum = 4864;BA.debugLine="End Sub";
return "";
}
public String  _markplaybackwatchdogprogress(String _trackid,long _positionms) throws Exception{
 //BA.debugLineNum = 2126;BA.debugLine="Private Sub MarkPlaybackWatchdogProgress(trackId A";
 //BA.debugLineNum = 2127;BA.debugLine="lastPlaybackWatchdogTrackId = trackId";
_lastplaybackwatchdogtrackid = _trackid;
 //BA.debugLineNum = 2128;BA.debugLine="lastPlaybackWatchdogPositionMs = positionMs";
_lastplaybackwatchdogpositionms = _positionms;
 //BA.debugLineNum = 2129;BA.debugLine="lastPlaybackWatchdogProgressAt = DateTime.Now";
_lastplaybackwatchdogprogressat = __c.DateTime.getNow();
 //BA.debugLineNum = 2130;BA.debugLine="End Sub";
return "";
}
public String  _mediaurl(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _id = "";
String _localuri = "";
 //BA.debugLineNum = 4593;BA.debugLine="Private Sub MediaUrl(item As Map) As String";
 //BA.debugLineNum = 4594;BA.debugLine="Dim id As String = item.GetDefault(\"id\", \"\")";
_id = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 4595;BA.debugLine="If id = \"\" Then Return \"\"";
if ((_id).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 4596;BA.debugLine="Dim localUri As String = mediaCacheService.Resolv";
_localuri = _mediacacheservice._resolvelocalmediauri /*String*/ (_item);
 //BA.debugLineNum = 4597;BA.debugLine="If localUri <> \"\" Then Return localUri";
if ((_localuri).equals("") == false) { 
if (true) return _localuri;};
 //BA.debugLineNum = 4598;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 4599;BA.debugLine="End Sub";
return "";
}
public String  _mergebreakitems(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.List _merged = null;
Object _breakitem = null;
Object _existing = null;
 //BA.debugLineNum = 3164;BA.debugLine="Private Sub MergeBreakItems(item As Map)";
 //BA.debugLineNum = 3165;BA.debugLine="Dim items As List = item.GetDefault(\"items\", Null";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
 //BA.debugLineNum = 3166;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3167;BA.debugLine="Dim merged As List";
_merged = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3168;BA.debugLine="merged.Initialize";
_merged.Initialize();
 //BA.debugLineNum = 3169;BA.debugLine="For Each breakItem As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_breakitem = group5.Get(index5);
 //BA.debugLineNum = 3170;BA.debugLine="merged.Add(breakItem)";
_merged.Add(_breakitem);
 }
};
 //BA.debugLineNum = 3172;BA.debugLine="For Each existing As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group8 = _playqueue;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_existing = group8.Get(index8);
 //BA.debugLineNum = 3173;BA.debugLine="merged.Add(existing)";
_merged.Add(_existing);
 }
};
 //BA.debugLineNum = 3175;BA.debugLine="playQueue = merged";
_playqueue = _merged;
 //BA.debugLineNum = 3176;BA.debugLine="SyncExactBreakState";
_syncexactbreakstate();
 //BA.debugLineNum = 3177;BA.debugLine="RefreshPreparedItemAfterQueueMutation";
_refreshprepareditemafterqueuemutation();
 //BA.debugLineNum = 3178;BA.debugLine="TraceLog(\"брейк очередь add queue=\" & playQueue.S";
_tracelog("брейк очередь add queue="+BA.NumberToString(_playqueue.getSize())+" at="+BA.NumberToString(_scheduledbreakat));
 //BA.debugLineNum = 3179;BA.debugLine="End Sub";
return "";
}
public String  _messagevalue(String _key) throws Exception{
 //BA.debugLineNum = 5086;BA.debugLine="Private Sub MessageValue(key As String) As String";
 //BA.debugLineNum = 5087;BA.debugLine="Return messages.GetDefault(key, \"\")";
if (true) return BA.ObjectToString(_messages.GetDefault((Object)(_key),(Object)("")));
 //BA.debugLineNum = 5088;BA.debugLine="End Sub";
return "";
}
public String  _migratelegacystorageifneeded() throws Exception{
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _legacy = null;
String _key = "";
 //BA.debugLineNum = 4878;BA.debugLine="Private Sub MigrateLegacyStorageIfNeeded";
 //BA.debugLineNum = 4879;BA.debugLine="If File.Exists(storageDir, storageFile) = False T";
if (__c.File.Exists(_storagedir,_storagefile)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4880;BA.debugLine="Try";
try { //BA.debugLineNum = 4881;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 4882;BA.debugLine="parser.Initialize(File.ReadString(storageDir, st";
_parser.Initialize(__c.File.ReadString(_storagedir,_storagefile));
 //BA.debugLineNum = 4883;BA.debugLine="Dim legacy As Map = parser.NextObject";
_legacy = new anywheresoftware.b4a.objects.collections.Map();
_legacy = _parser.NextObject();
 //BA.debugLineNum = 4884;BA.debugLine="If legacy.IsInitialized Then";
if (_legacy.IsInitialized()) { 
 //BA.debugLineNum = 4885;BA.debugLine="For Each key As String In legacy.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _legacy.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 4886;BA.debugLine="storage.Put(key, legacy.Get(key))";
_storage._put /*String*/ (_key,_legacy.Get((Object)(_key)));
 }
};
 //BA.debugLineNum = 4888;BA.debugLine="TraceLog(\"legacy migrate итог target=kvs\")";
_tracelog("legacy migrate итог target=kvs");
 //BA.debugLineNum = 4889;BA.debugLine="File.Delete(storageDir, storageFile)";
__c.File.Delete(_storagedir,_storagefile);
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 4892;BA.debugLine="TraceLog(\"legacy migrate ошибка message=\" & Last";
_tracelog("legacy migrate ошибка message="+__c.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 4894;BA.debugLine="End Sub";
return "";
}
public int  _minuteofhourfromtimestamp(long _targettimestamp) throws Exception{
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
 //BA.debugLineNum = 3248;BA.debugLine="Private Sub MinuteOfHourFromTimestamp(targetTimest";
 //BA.debugLineNum = 3249;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
 //BA.debugLineNum = 3250;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
 //BA.debugLineNum = 3251;BA.debugLine="Dim timeValue As String = DateTime.Time(targetTim";
_timevalue = __c.DateTime.Time((long) (_targettimestamp*1000));
 //BA.debugLineNum = 3252;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
 //BA.debugLineNum = 3253;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
 //BA.debugLineNum = 3254;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3255;BA.debugLine="Return parts(1)";
if (true) return (int)(Double.parseDouble(_parts[(int) (1)]));
 //BA.debugLineNum = 3256;BA.debugLine="End Sub";
return 0;
}
public String  _mirrorruntimestatefromdirector() throws Exception{
b4a.example.playbackplayerslot _activeslot = null;
b4a.example.playbackplayerslot _preparedslot = null;
b4a.example.playbackplayerslot _pendingplayslot = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
 //BA.debugLineNum = 1791;BA.debugLine="Private Sub MirrorRuntimeStateFromDirector";
 //BA.debugLineNum = 1792;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
_runtimestate._activeaudiokey /*String*/  = "";
 //BA.debugLineNum = 1793;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
_runtimestate._preparedaudiokey /*String*/  = "";
 //BA.debugLineNum = 1794;BA.debugLine="runtimeState.PendingPlayAudioKey = \"\"";
_runtimestate._pendingplayaudiokey /*String*/  = "";
 //BA.debugLineNum = 1795;BA.debugLine="runtimeState.PendingPrepareAudioKey = \"\"";
_runtimestate._pendingprepareaudiokey /*String*/  = "";
 //BA.debugLineNum = 1796;BA.debugLine="runtimeState.ActiveItem.Initialize";
_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1797;BA.debugLine="runtimeState.PreparedItem.Initialize";
_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1798;BA.debugLine="runtimeState.PendingPlayItem.Initialize";
_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1799;BA.debugLine="runtimeState.PendingPrepareItem.Initialize";
_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 1800;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorSt";
_activeslot = _directorstate._getactiveslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1801;BA.debugLine="If activeSlot.IsInitialized And activeSlot.HasIte";
if (_activeslot.IsInitialized /*boolean*/ () && _activeslot._hasitem /*boolean*/ ()) { 
 //BA.debugLineNum = 1802;BA.debugLine="runtimeState.ActiveAudioKey = activeSlot.AudioKe";
_runtimestate._activeaudiokey /*String*/  = _activeslot._audiokey /*String*/ ;
 //BA.debugLineNum = 1803;BA.debugLine="runtimeState.ActiveItem = CloneMap(activeSlot.It";
_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/  = _clonemap(_activeslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 //BA.debugLineNum = 1805;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = director";
_preparedslot = _directorstate._getpreparedslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1806;BA.debugLine="If preparedSlot.IsInitialized And preparedSlot.Ha";
if (_preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ ()) { 
 //BA.debugLineNum = 1807;BA.debugLine="runtimeState.PreparedAudioKey = preparedSlot.Aud";
_runtimestate._preparedaudiokey /*String*/  = _preparedslot._audiokey /*String*/ ;
 //BA.debugLineNum = 1808;BA.debugLine="runtimeState.PreparedItem = CloneMap(preparedSlo";
_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/  = _clonemap(_preparedslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 //BA.debugLineNum = 1810;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = direc";
_pendingplayslot = _directorstate._getpendingplayslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1811;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlayS";
if (_pendingplayslot.IsInitialized /*boolean*/ () && _pendingplayslot._hasitem /*boolean*/ ()) { 
 //BA.debugLineNum = 1812;BA.debugLine="runtimeState.PendingPlayAudioKey = pendingPlaySl";
_runtimestate._pendingplayaudiokey /*String*/  = _pendingplayslot._audiokey /*String*/ ;
 //BA.debugLineNum = 1813;BA.debugLine="runtimeState.PendingPlayItem = CloneMap(pendingP";
_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/  = _clonemap(_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 //BA.debugLineNum = 1815;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = di";
_pendingprepareslot = _directorstate._getpendingprepareslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1816;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingPr";
if (_pendingprepareslot.IsInitialized /*boolean*/ () && _pendingprepareslot._hasitem /*boolean*/ ()) { 
 //BA.debugLineNum = 1817;BA.debugLine="runtimeState.PendingPrepareAudioKey = pendingPre";
_runtimestate._pendingprepareaudiokey /*String*/  = _pendingprepareslot._audiokey /*String*/ ;
 //BA.debugLineNum = 1818;BA.debugLine="runtimeState.PendingPrepareItem = CloneMap(pendi";
_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/  = _clonemap(_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 //BA.debugLineNum = 1820;BA.debugLine="End Sub";
return "";
}
public long  _monotonicmicros() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 4745;BA.debugLine="Private Sub MonotonicMicros As Long";
 //BA.debugLineNum = 4746;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 4747;BA.debugLine="jo.InitializeStatic(\"java.lang.System\")";
_jo.InitializeStatic("java.lang.System");
 //BA.debugLineNum = 4748;BA.debugLine="Return jo.RunMethod(\"nanoTime\", Null) / 1000";
if (true) return (long) ((double)(BA.ObjectToNumber(_jo.RunMethod("nanoTime",(Object[])(__c.Null))))/(double)1000);
 //BA.debugLineNum = 4749;BA.debugLine="End Sub";
return 0L;
}
public String  _moveplayercodecursortoend() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 1695;BA.debugLine="Private Sub MovePlayerCodeCursorToEnd";
 //BA.debugLineNum = 1697;BA.debugLine="If txtPlayerCode.IsInitialized = False Then Retur";
if (_txtplayercode.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1698;BA.debugLine="Try";
try { //BA.debugLineNum = 1699;BA.debugLine="Dim jo As JavaObject = txtPlayerCode";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_txtplayercode.getObject()));
 //BA.debugLineNum = 1700;BA.debugLine="jo.RunMethod(\"setSelection\", Array As Object(txt";
_jo.RunMethod("setSelection",new Object[]{(Object)(_txtplayercode.getText().length())});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1702;BA.debugLine="Log(\"MovePlayerCodeCursorToEnd: \" & LastExceptio";
__c.LogImpl("39109511","MovePlayerCodeCursorToEnd: "+__c.LastException(ba).getMessage(),0);
 };
 //BA.debugLineNum = 1705;BA.debugLine="End Sub";
return "";
}
public String  _nexturlvalue() throws Exception{
 //BA.debugLineNum = 5119;BA.debugLine="Public Sub NextUrlValue As String";
 //BA.debugLineNum = 5120;BA.debugLine="Return NEXT_BASE_URL";
if (true) return _next_base_url;
 //BA.debugLineNum = 5121;BA.debugLine="End Sub";
return "";
}
public double  _normalizedbvalue(Object _value,double _fallbackvalue) throws Exception{
double _db = 0;
 //BA.debugLineNum = 4902;BA.debugLine="Private Sub NormalizeDbValue(value As Object, fall";
 //BA.debugLineNum = 4903;BA.debugLine="Dim db As Double = fallbackValue";
_db = _fallbackvalue;
 //BA.debugLineNum = 4904;BA.debugLine="Try";
try { //BA.debugLineNum = 4905;BA.debugLine="db = value";
_db = (double)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 4907;BA.debugLine="db = fallbackValue";
_db = _fallbackvalue;
 };
 //BA.debugLineNum = 4909;BA.debugLine="If db > 0 Then db = 0";
if (_db>0) { 
_db = 0;};
 //BA.debugLineNum = 4910;BA.debugLine="If db < -24 Then db = -24";
if (_db<-24) { 
_db = -24;};
 //BA.debugLineNum = 4911;BA.debugLine="Return db";
if (true) return _db;
 //BA.debugLineNum = 4912;BA.debugLine="End Sub";
return 0;
}
public String  _normalizendjsonpayload(String _payload) throws Exception{
String _linefeed = "";
String _normalized = "";
 //BA.debugLineNum = 3745;BA.debugLine="Private Sub NormalizeNdjsonPayload(payload As Stri";
 //BA.debugLineNum = 3746;BA.debugLine="If payload = Null Then Return \"\"";
if (_payload== null) { 
if (true) return "";};
 //BA.debugLineNum = 3747;BA.debugLine="Dim lineFeed As String = Chr(10)";
_linefeed = BA.ObjectToString(__c.Chr((int) (10)));
 //BA.debugLineNum = 3748;BA.debugLine="Dim normalized As String = payload.Replace(CRLF,";
_normalized = _payload.replace(__c.CRLF,_linefeed).replace(BA.ObjectToString(__c.Chr((int) (13))),_linefeed);
 //BA.debugLineNum = 3749;BA.debugLine="Do While normalized.Contains(lineFeed & lineFeed)";
while (_normalized.contains(_linefeed+_linefeed)) {
 //BA.debugLineNum = 3750;BA.debugLine="normalized = normalized.Replace(lineFeed & lineF";
_normalized = _normalized.replace(_linefeed+_linefeed,_linefeed);
 }
;
 //BA.debugLineNum = 3752;BA.debugLine="normalized = normalized.Trim";
_normalized = _normalized.trim();
 //BA.debugLineNum = 3753;BA.debugLine="If normalized = \"\" Then Return \"\"";
if ((_normalized).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 3754;BA.debugLine="Return normalized.Replace(lineFeed, CRLF)";
if (true) return _normalized.replace(_linefeed,__c.CRLF);
 //BA.debugLineNum = 3755;BA.debugLine="End Sub";
return "";
}
public String  _normalizeplayercode(String _value) throws Exception{
String _code = "";
 //BA.debugLineNum = 4799;BA.debugLine="Private Sub NormalizePlayerCode(value As String) A";
 //BA.debugLineNum = 4800;BA.debugLine="Dim code As String = value.Trim.ToLowerCase";
_code = _value.trim().toLowerCase();
 //BA.debugLineNum = 4801;BA.debugLine="If Regex.IsMatch(\"^[a-z0-9]{5}$\", code) Then Retu";
if (__c.Regex.IsMatch("^[a-z0-9]{5}$",_code)) { 
if (true) return _code;};
 //BA.debugLineNum = 4802;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 4803;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _normalizequeueresponse(Object _data) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.List _normalized = null;
Object _item = null;
 //BA.debugLineNum = 2992;BA.debugLine="Private Sub NormalizeQueueResponse(data As Object)";
 //BA.debugLineNum = 2993;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
 //BA.debugLineNum = 2994;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
 //BA.debugLineNum = 2995;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.GetDefault((Object)("queue"),__c.Null)));
 //BA.debugLineNum = 2996;BA.debugLine="If items.IsInitialized = False Then Return Null";
if (_items.IsInitialized()==__c.False) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));};
 //BA.debugLineNum = 2997;BA.debugLine="Dim normalized As List";
_normalized = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2998;BA.debugLine="normalized.Initialize";
_normalized.Initialize();
 //BA.debugLineNum = 2999;BA.debugLine="For Each item As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group7 = _items;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.Get(index7);
 //BA.debugLineNum = 3000;BA.debugLine="If item Is Map Then normalized.Add(item)";
if (_item instanceof java.util.Map) { 
_normalized.Add(_item);};
 }
};
 //BA.debugLineNum = 3002;BA.debugLine="Return normalized";
if (true) return _normalized;
 };
 //BA.debugLineNum = 3004;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 //BA.debugLineNum = 3005;BA.debugLine="End Sub";
return null;
}
public int  _normalizeretryafter(Object _data) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
int _value = 0;
 //BA.debugLineNum = 3007;BA.debugLine="Private Sub NormalizeRetryAfter(data As Object) As";
 //BA.debugLineNum = 3008;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
 //BA.debugLineNum = 3009;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
 //BA.debugLineNum = 3010;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
if (_m.ContainsKey((Object)("retry_after"))==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3011;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
_value = (int)(BA.ObjectToNumber(_m.Get((Object)("retry_after"))));
 //BA.debugLineNum = 3012;BA.debugLine="If value <= 0 Then Return 0";
if (_value<=0) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3013;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 3015;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 3016;BA.debugLine="End Sub";
return 0;
}
public void  _offlinedatarefreshtimer_tick() throws Exception{
ResumableSub_OfflineDataRefreshTimer_Tick rsub = new ResumableSub_OfflineDataRefreshTimer_Tick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_OfflineDataRefreshTimer_Tick extends BA.ResumableSub {
public ResumableSub_OfflineDataRefreshTimer_Tick(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1217;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._local_playback_only) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 1218;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (unused";
parent.__c.WaitFor("complete", ba, this, parent._refreshofflinedatanow());
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1219;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _orbittimer_tick() throws Exception{
double _fadestep = 0;
 //BA.debugLineNum = 4400;BA.debugLine="Private Sub OrbitTimer_Tick";
 //BA.debugLineNum = 4401;BA.debugLine="orbitPulseStep = (orbitPulseStep + 1) Mod 24";
_orbitpulsestep = (int) ((_orbitpulsestep+1)%24);
 //BA.debugLineNum = 4402;BA.debugLine="Dim fadeStep As Double = orbitTimer.Interval / OR";
_fadestep = _orbittimer.getInterval()/(double)_orbit_fade_ms;
 //BA.debugLineNum = 4403;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4404;BA.debugLine="If uiController.AdvanceOrbitFrame(orbitPulseStep,";
if (_uicontroller._advanceorbitframe /*boolean*/ (_orbitpulsestep,_fadestep)) { 
_orbittimer.setEnabled(__c.False);};
 //BA.debugLineNum = 4405;BA.debugLine="End Sub";
return "";
}
public String  _pauseplaybackbypolicy(String _reason,String _connectionmode) throws Exception{
 //BA.debugLineNum = 3379;BA.debugLine="Private Sub PausePlaybackByPolicy(reason As String";
 //BA.debugLineNum = 3380;BA.debugLine="Facade_PausePlaybackCore(reason, connectionMode)";
_facade_pauseplaybackcore(_reason,_connectionmode);
 //BA.debugLineNum = 3381;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _peekbreakpreparedcandidate(anywheresoftware.b4a.objects.collections.Map _breakitem) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
Object _breakobject = null;
anywheresoftware.b4a.objects.collections.Map _candidate = null;
String _candidatetype = "";
 //BA.debugLineNum = 4726;BA.debugLine="Private Sub PeekBreakPreparedCandidate(breakItem A";
 //BA.debugLineNum = 4727;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4728;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 4729;BA.debugLine="If breakItem.IsInitialized = False Then Return em";
if (_breakitem.IsInitialized()==__c.False) { 
if (true) return _emptyitem;};
 //BA.debugLineNum = 4730;BA.debugLine="Dim items As List = breakItem.GetDefault(\"items\",";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_breakitem.GetDefault((Object)("items"),__c.Null)));
 //BA.debugLineNum = 4731;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return _emptyitem;};
 //BA.debugLineNum = 4732;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = _transition_getdirectoractiveitem();
 //BA.debugLineNum = 4733;BA.debugLine="For Each breakObject As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group7 = _items;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_breakobject = group7.Get(index7);
 //BA.debugLineNum = 4734;BA.debugLine="If (breakObject Is Map) = False Then Continue";
if ((_breakobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 4735;BA.debugLine="Dim candidate As Map = breakObject";
_candidate = new anywheresoftware.b4a.objects.collections.Map();
_candidate = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_breakobject));
 //BA.debugLineNum = 4736;BA.debugLine="Dim candidateType As String = candidate.GetDefau";
_candidatetype = BA.ObjectToString(_candidate.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4737;BA.debugLine="If candidateType <> \"ad\" And candidateType <> \"t";
if ((_candidatetype).equals("ad") == false && (_candidatetype).equals("track") == false) { 
if (true) continue;};
 //BA.debugLineNum = 4738;BA.debugLine="If ItemsMatch(activeItem, candidate) Then Contin";
if (_itemsmatch(_activeitem,_candidate)) { 
if (true) continue;};
 //BA.debugLineNum = 4739;BA.debugLine="If candidateType = \"ad\" And mediaCacheService.Is";
if ((_candidatetype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (BA.ObjectToString(_candidate.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return _clonemap(_candidate);};
 //BA.debugLineNum = 4740;BA.debugLine="If candidateType = \"track\" And mediaCacheService";
if ((_candidatetype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (BA.ObjectToString(_candidate.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return _clonemap(_candidate);};
 }
};
 //BA.debugLineNum = 4742;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 4743;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _peekdispatchablequeueitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemtype = "";
long _breakat = 0L;
 //BA.debugLineNum = 4706;BA.debugLine="Private Sub PeekDispatchableQueueItem As Map";
 //BA.debugLineNum = 4707;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4708;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 4709;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return _emptyitem;};
 //BA.debugLineNum = 4710;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_playqueue.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 4711;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = _playqueue.Get(_i);
 //BA.debugLineNum = 4712;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 4713;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 4714;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4715;BA.debugLine="If itemType = \"break\" Then";
if ((_itemtype).equals("break")) { 
 //BA.debugLineNum = 4716;BA.debugLine="Dim breakAt As Long = ToLongDefault(item.GetDef";
_breakat = _tolongdefault(_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
 //BA.debugLineNum = 4717;BA.debugLine="If breakAt > LocalNowTimestamp Then Continue";
if (_breakat>_localnowtimestamp()) { 
if (true) continue;};
 //BA.debugLineNum = 4718;BA.debugLine="Return CloneMap(item)";
if (true) return _clonemap(_item);
 };
 //BA.debugLineNum = 4720;BA.debugLine="If itemType = \"track\" And mediaCacheService.IsTr";
if ((_itemtype).equals("track") && _mediacacheservice._istrackcached /*boolean*/ (BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return _clonemap(_item);};
 //BA.debugLineNum = 4721;BA.debugLine="If itemType = \"ad\" And mediaCacheService.IsAdCac";
if ((_itemtype).equals("ad") && _mediacacheservice._isadcached /*boolean*/ (BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return _clonemap(_item);};
 }
};
 //BA.debugLineNum = 4723;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 4724;BA.debugLine="End Sub";
return null;
}
public String  _playbackdirectortimer_tick() throws Exception{
 //BA.debugLineNum = 3962;BA.debugLine="Private Sub PlaybackDirectorTimer_Tick";
 //BA.debugLineNum = 3963;BA.debugLine="If isPlaybackDirectorTickQueued Then";
if (_isplaybackdirectortickqueued) { 
 //BA.debugLineNum = 3964;BA.debugLine="isPlaybackDirectorRetickRequested = True";
_isplaybackdirectorretickrequested = __c.True;
 //BA.debugLineNum = 3965;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3967;BA.debugLine="isPlaybackDirectorTickQueued = True";
_isplaybackdirectortickqueued = __c.True;
 //BA.debugLineNum = 3968;BA.debugLine="CallSubDelayed2(Me, \"RunPlaybackDirectorTimerAsyn";
__c.CallSubDelayed2(ba,this,"RunPlaybackDirectorTimerAsync",(Object)("director_timer"));
 //BA.debugLineNum = 3969;BA.debugLine="End Sub";
return "";
}
public void  _playbackwatchdogtimer_tick() throws Exception{
ResumableSub_PlaybackWatchdogTimer_Tick rsub = new ResumableSub_PlaybackWatchdogTimer_Tick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_PlaybackWatchdogTimer_Tick extends BA.ResumableSub {
public ResumableSub_PlaybackWatchdogTimer_Tick(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2133;BA.debugLine="If isPlaybackWatchdogTickInProgress Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._isplaybackwatchdogtickinprogress) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 2134;BA.debugLine="isPlaybackWatchdogTickInProgress = True";
parent._isplaybackwatchdogtickinprogress = parent.__c.True;
 //BA.debugLineNum = 2135;BA.debugLine="Wait For (RunPlaybackWatchdogTick) Complete (unus";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackwatchdogtick());
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 2136;BA.debugLine="isPlaybackWatchdogTickInProgress = False";
parent._isplaybackwatchdogtickinprogress = parent.__c.False;
 //BA.debugLineNum = 2137;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _playbuttonpane_click() throws Exception{
 //BA.debugLineNum = 1551;BA.debugLine="Private Sub PlayButtonPane_Click";
 //BA.debugLineNum = 1552;BA.debugLine="HandlePlayButtonInput";
_handleplaybuttoninput();
 //BA.debugLineNum = 1553;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseclicked(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1591;BA.debugLine="Private Sub PlayButtonPane_MouseClicked (eventData";
 //BA.debugLineNum = 1592;BA.debugLine="HandlePlayButtonInput";
_handleplaybuttoninput();
 //BA.debugLineNum = 1593;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseentered(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1595;BA.debugLine="Private Sub PlayButtonPane_MouseEntered (eventData";
 //BA.debugLineNum = 1596;BA.debugLine="UpdatePlayButtonAppearance(True)";
_updateplaybuttonappearance(__c.True);
 //BA.debugLineNum = 1597;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseexited(Object _eventdata) throws Exception{
 //BA.debugLineNum = 1599;BA.debugLine="Private Sub PlayButtonPane_MouseExited (eventData";
 //BA.debugLineNum = 1600;BA.debugLine="UpdatePlayButtonAppearance(False)";
_updateplaybuttonappearance(__c.False);
 //BA.debugLineNum = 1601;BA.debugLine="End Sub";
return "";
}
public String  _playercodevalue() throws Exception{
 //BA.debugLineNum = 5095;BA.debugLine="Public Sub PlayerCodeValue As String";
 //BA.debugLineNum = 5096;BA.debugLine="Return playerCode";
if (true) return _playercode;
 //BA.debugLineNum = 5097;BA.debugLine="End Sub";
return "";
}
public double  _playerleveltofactor(double _levelvalue) throws Exception{
double _normalized = 0;
 //BA.debugLineNum = 4896;BA.debugLine="Private Sub PlayerLevelToFactor(levelValue As Doub";
 //BA.debugLineNum = 4897;BA.debugLine="Dim normalized As Double = Max(0, Min(1, levelVal";
_normalized = __c.Max(0,__c.Min(1,_levelvalue/(double)100));
 //BA.debugLineNum = 4898;BA.debugLine="If normalized <= 0 Then Return 0";
if (_normalized<=0) { 
if (true) return 0;};
 //BA.debugLineNum = 4899;BA.debugLine="Return Power(normalized, 0.7)";
if (true) return __c.Power(_normalized,0.7);
 //BA.debugLineNum = 4900;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _playqueueitem(Object _current,int _retryafter) throws Exception{
ResumableSub_PlayQueueItem rsub = new ResumableSub_PlayQueueItem(this,_current,_retryafter);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PlayQueueItem extends BA.ResumableSub {
public ResumableSub_PlayQueueItem(b4a.example.b4xmainpage parent,Object _current,int _retryafter) {
this.parent = parent;
this._current = _current;
this._retryafter = _retryafter;
}
b4a.example.b4xmainpage parent;
Object _current;
int _retryafter;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemtype = "";
String _url = "";
int _fadeinms = 0;
String _targetaudiokey = "";
boolean _playbackstarted = false;
boolean _unusederror = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3061;BA.debugLine="ClearHistoryLogTimer";
parent._clearhistorylogtimer();
 //BA.debugLineNum = 3062;BA.debugLine="orchestrationState.IsCrossfadeTriggered = False";
parent._orchestrationstate._iscrossfadetriggered /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 3063;BA.debugLine="If current Is Map Then";
if (true) break;

case 1:
//if
this.state = 69;
if (_current instanceof java.util.Map) { 
this.state = 3;
}else {
this.state = 68;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3064;BA.debugLine="Dim item As Map = current";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_current));
 //BA.debugLineNum = 3065;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 3067;BA.debugLine="If itemType = \"message\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_itemtype).equals("message")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 3068;BA.debugLine="HandleMessageItem(item)";
parent._handlemessageitem(_item);
 //BA.debugLineNum = 3069;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 3071;BA.debugLine="If itemType = \"update\" Then";

case 7:
//if
this.state = 10;
if ((_itemtype).equals("update")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3072;BA.debugLine="ClearPlaybackState";
parent._clearplaybackstate();
 //BA.debugLineNum = 3073;BA.debugLine="orchestrationState.EnterUserStoppedState";
parent._orchestrationstate._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 3074;BA.debugLine="SetPlayIcon";
parent._setplayicon();
 //BA.debugLineNum = 3075;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
parent._showmessage(BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(parent._messagevalue("player_reloading")))));
 //BA.debugLineNum = 3076;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 3079;BA.debugLine="HidePin";
parent._hidepin();
 //BA.debugLineNum = 3080;BA.debugLine="If itemType = \"idle\" Then";
if (true) break;

case 11:
//if
this.state = 20;
if ((_itemtype).equals("idle")) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 3081;BA.debugLine="ClearPlaybackState";
parent._clearplaybackstate();
 //BA.debugLineNum = 3082;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
parent._showmessage(BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(parent._messagevalue("idle")))));
 //BA.debugLineNum = 3083;BA.debugLine="If retryAfter > 0 Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_retryafter>0) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 //BA.debugLineNum = 3084;BA.debugLine="ScheduleRetry(\"server\", retryAfter * 1000)";
parent._scheduleretry("server",(int) (_retryafter*1000));
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 3086;BA.debugLine="ScheduleRetry(\"server\", PAUSE_RETRY_DELAY)";
parent._scheduleretry("server",parent._pause_retry_delay);
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 3088;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 3091;BA.debugLine="If itemType = \"break\" Then";

case 20:
//if
this.state = 27;
if ((_itemtype).equals("break")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 3095;BA.debugLine="If item.ContainsKey(\"at\") And ToLongDefault(ite";
if (true) break;

case 23:
//if
this.state = 26;
if (_item.ContainsKey((Object)("at")) && parent._tolongdefault(_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1))>parent._localnowtimestamp() && parent._shouldtriggerbreaknow()==parent.__c.False) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 3096;BA.debugLine="DeferFutureExactBreak(item)";
parent._deferfutureexactbreak(_item);
 //BA.debugLineNum = 3097;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 3099;BA.debugLine="ClearExactBreakState";
parent._clearexactbreakstate();
 //BA.debugLineNum = 3100;BA.debugLine="MergeBreakItems(item)";
parent._mergebreakitems(_item);
 //BA.debugLineNum = 3101;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 3104;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";

case 27:
//if
this.state = 30;
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 3105;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
parent._handletemporarystate("server","");
 //BA.debugLineNum = 3106;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 3109;BA.debugLine="Dim url As String = MediaUrl(item)";
_url = parent._mediaurl(_item);
 //BA.debugLineNum = 3110;BA.debugLine="If url = \"\" Then";
if (true) break;

case 31:
//if
this.state = 38;
if ((_url).equals("")) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 3111;BA.debugLine="TraceWarn(\"cache\", \"нет локального файла\", \"tra";
parent._tracewarn("cache","нет локального файла","trackId="+parent._tracetrackvalue(_item));
 //BA.debugLineNum = 3112;BA.debugLine="If HasLocalPlaybackFallback Then";
if (true) break;

case 34:
//if
this.state = 37;
if (parent._haslocalplaybackfallback()) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 3113;BA.debugLine="TraceLog(\"fallback reseed reason=missing_local";
parent._tracelog("fallback reseed reason=missing_local_media");
 //BA.debugLineNum = 3114;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 37:
//C
this.state = 38;
;
 //BA.debugLineNum = 3116;BA.debugLine="playerDataCoordinator.ActivateLocalFallback(sta";
parent._playerdatacoordinator._activatelocalfallback /*String*/ (parent._statestore._ismediapathdegraded /*boolean*/ (),"missing_local_media");
 //BA.debugLineNum = 3117;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 3120;BA.debugLine="If item.ContainsKey(\"playlist\") Then playlistInd";

case 38:
//if
this.state = 43;
if (_item.ContainsKey((Object)("playlist"))) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
parent._playlistindex = (int)(BA.ObjectToNumber(_item.Get((Object)("playlist"))));
if (true) break;

case 43:
//C
this.state = 44;
;
 //BA.debugLineNum = 3121;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, item)";
parent._dataresolver._commitplaylistcursor /*String*/ (parent._storage,_item);
 //BA.debugLineNum = 3122;BA.debugLine="orchestrationState.PrefetchDone = False";
parent._orchestrationstate._prefetchdone /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 3123;BA.debugLine="Dim fadeInMs As Int = ResolveStartFadeInMs";
_fadeinms = parent._resolvestartfadeinms();
 //BA.debugLineNum = 3124;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioK";
_targetaudiokey = parent._getinactiveaudiokey();
 //BA.debugLineNum = 3125;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" The";
if (true) break;

case 44:
//if
this.state = 49;
if ((parent._transition_getdirectoractiveaudiokey()).equals("")) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
_targetaudiokey = "primary";
if (true) break;

case 49:
//C
this.state = 50;
;
 //BA.debugLineNum = 3126;BA.debugLine="Wait For (StartPlaybackWithAudioKey(targetAudioK";
parent.__c.WaitFor("complete", ba, this, parent._startplaybackwithaudiokey(_targetaudiokey,_item,_fadeinms));
this.state = 70;
return;
case 70:
//C
this.state = 50;
_playbackstarted = (Boolean) result[0];
;
 //BA.debugLineNum = 3127;BA.debugLine="If playbackStarted = False Then";
if (true) break;

case 50:
//if
this.state = 61;
if (_playbackstarted==parent.__c.False) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 //BA.debugLineNum = 3128;BA.debugLine="If orchestrationState.IsStoppedByUser = False A";
if (true) break;

case 53:
//if
this.state = 60;
if (parent._orchestrationstate._isstoppedbyuser /*boolean*/ ==parent.__c.False && parent._orchestrationstate._isstarted /*boolean*/ ) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
 //BA.debugLineNum = 3129;BA.debugLine="Wait For (HandleMediaError) Complete (unusedEr";
parent.__c.WaitFor("complete", ba, this, parent._handlemediaerror());
this.state = 71;
return;
case 71:
//C
this.state = 56;
_unusederror = (Boolean) result[0];
;
 //BA.debugLineNum = 3130;BA.debugLine="If dataPolicyState.HasLocalMediaFallback Then";
if (true) break;

case 56:
//if
this.state = 59;
if (parent._datapolicystate._haslocalmediafallback /*boolean*/ ) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 //BA.debugLineNum = 3131;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 //BA.debugLineNum = 3134;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 3136;BA.debugLine="If orchestrationState.IsStarted = False Or orche";

case 61:
//if
this.state = 66;
if (parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 66:
//C
this.state = 69;
;
 //BA.debugLineNum = 3137;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 68:
//C
this.state = 69;
 //BA.debugLineNum = 3139;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
parent._handletemporarystate("server","");
 //BA.debugLineNum = 3140;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 69:
//C
this.state = -1;
;
 //BA.debugLineNum = 3142;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _populateplaybackqueue() throws Exception{
ResumableSub_PopulatePlaybackQueue rsub = new ResumableSub_PopulatePlaybackQueue(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PopulatePlaybackQueue extends BA.ResumableSub {
public ResumableSub_PopulatePlaybackQueue(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
int _playablereserve = 0;
boolean _hasmusicreserve = false;
anywheresoftware.b4a.objects.collections.Map _result = null;
boolean _unused = false;
anywheresoftware.b4a.objects.collections.List _queue = null;
int _retryafter = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2814;BA.debugLine="TraceInfo(\"playback\", \"populate queue start\", \"qu";
parent._traceinfo("playback","populate queue start","queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue))+" stage="+parent._playbackflowstate);
 //BA.debugLineNum = 2816;BA.debugLine="Dim playableReserve As Int = stateStore.GetLocalP";
_playablereserve = parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue);
 //BA.debugLineNum = 2817;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._local_playback_only) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2818;BA.debugLine="If HasDispatchableQueueItem Or stateStore.HasAny";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._hasdispatchablequeueitem() || parent._statestore._hasanycachedtrack /*boolean*/ ()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 2819;BA.debugLine="HandleCacheWarmupPending";
parent._handlecachewarmuppending();
 //BA.debugLineNum = 2820;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 2822;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";

case 10:
//if
this.state = 13;
if (parent._isplaybackallowedbycurrentdata()==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 2824;BA.debugLine="TraceWarn(\"playback\", \"populate queue fail\", \"re";
parent._tracewarn("playback","populate queue fail","reason=playback_blocked");
 //BA.debugLineNum = 2826;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReason";
parent._pauseplaybackbypolicy(parent._resolveplaybackblockreason(parent._statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ()),"server");
 //BA.debugLineNum = 2827;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 2829;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 13:
//if
this.state = 26;
if (parent._use_data_playback_resolver) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 2830;BA.debugLine="PreScanUpcomingAdMinute(True)";
parent._prescanupcomingadminute(parent.__c.True);
 //BA.debugLineNum = 2831;BA.debugLine="Dim hasMusicReserve As Boolean = GetCurrentSlotH";
_hasmusicreserve = parent._getcurrentslothaslocalreserve() || _playablereserve>0 || parent._statestore._hasanycachedtrack /*boolean*/ ();
 //BA.debugLineNum = 2832;BA.debugLine="If HasDispatchableQueueItem Then";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._hasdispatchablequeueitem()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 2833;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 //BA.debugLineNum = 2835;BA.debugLine="TraceInfo(\"playback\", \"populate queue done\", \"m";
parent._traceinfo("playback","populate queue done","mode=service_queue queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2837;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2839;BA.debugLine="If hasMusicReserve Then";

case 19:
//if
this.state = 22;
if (_hasmusicreserve) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 2841;BA.debugLine="TraceInfo(\"playback\", \"populate queue done\", \"m";
parent._traceinfo("playback","populate queue done","mode=local_reserve queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2843;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2845;BA.debugLine="If playQueue.IsInitialized And playQueue.Size >";

case 22:
//if
this.state = 25;
if (parent._playqueue.IsInitialized() && parent._playqueue.getSize()>0) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 2846;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 //BA.debugLineNum = 2848;BA.debugLine="TraceInfo(\"playback\", \"populate queue wait\", \"m";
parent._traceinfo("playback","populate queue wait","mode=existing_queue_pending queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 2850;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 25:
//C
this.state = 26;
;
 //BA.debugLineNum = 2853;BA.debugLine="TraceInfo(\"playback\", \"populate queue fallback\",";
parent._traceinfo("playback","populate queue fallback","mode=fetch_next reason=no_local_reserve");
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 2856;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, this, parent._fetchnext());
this.state = 40;
return;
case 40:
//C
this.state = 27;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 2857;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 27:
//if
this.state = 30;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 2859;BA.debugLine="TraceWarn(\"playback\", \"populate queue fail\", \"re";
parent._tracewarn("playback","populate queue fail","reason=fetch_failed");
 //BA.debugLineNum = 2861;BA.debugLine="Wait For (HandleFetchFailure(result)) Complete (";
parent.__c.WaitFor("complete", ba, this, parent._handlefetchfailure(_result));
this.state = 41;
return;
case 41:
//C
this.state = 30;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 2862;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 2864;BA.debugLine="If orchestrationState.IsStarted = False Or orches";

case 30:
//if
this.state = 35;
if (parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 35:
//C
this.state = 36;
;
 //BA.debugLineNum = 2865;BA.debugLine="ResetRetryDelay";
parent._resetretrydelay();
 //BA.debugLineNum = 2866;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = parent._normalizequeueresponse(_result.Get((Object)("Data")));
 //BA.debugLineNum = 2867;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 36:
//if
this.state = 39;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 2869;BA.debugLine="TraceWarn(\"playback\", \"populate queue fail\", \"re";
parent._tracewarn("playback","populate queue fail","reason=empty_queue");
 //BA.debugLineNum = 2871;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
parent._handletemporarystate("server","");
 //BA.debugLineNum = 2872;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 39:
//C
this.state = -1;
;
 //BA.debugLineNum = 2874;BA.debugLine="playQueue = queue";
parent._playqueue = _queue;
 //BA.debugLineNum = 2875;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 //BA.debugLineNum = 2877;BA.debugLine="TraceInfo(\"playback\", \"populate queue done\", \"que";
parent._traceinfo("playback","populate queue done","queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 2879;BA.debugLine="Dim retryAfter As Int = NormalizeRetryAfter(resul";
_retryafter = parent._normalizeretryafter(_result.Get((Object)("Data")));
 //BA.debugLineNum = 2880;BA.debugLine="stateStore.SetDispatchRetryAfter(retryAfter)";
parent._statestore._setdispatchretryafter /*String*/ (_retryafter);
 //BA.debugLineNum = 2881;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 2882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _prefetchnext() throws Exception{
ResumableSub_PrefetchNext rsub = new ResumableSub_PrefetchNext(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrefetchNext extends BA.ResumableSub {
public ResumableSub_PrefetchNext(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _preparedok = false;
anywheresoftware.b4a.objects.collections.Map _offlineitem = null;
boolean _preparedofflineok = false;
anywheresoftware.b4a.objects.collections.Map _directitem = null;
boolean _prepareddirectok = false;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _queue = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2944;BA.debugLine="TraceInfo(\"playback\", \"prefetch start\", \"queue=\"";
parent._traceinfo("playback","prefetch start","queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue))+" current="+parent._tracetrackvalue(parent._transition_getdirectoractiveitem()));
 //BA.debugLineNum = 2945;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER And LOCAL_PLAYBACK_";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._use_data_playback_resolver && parent._local_playback_only==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2946;BA.debugLine="PreScanUpcomingAdMinute(True)";
parent._prescanupcomingadminute(parent.__c.True);
 //BA.debugLineNum = 2947;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 if (true) break;
;
 //BA.debugLineNum = 2949;BA.debugLine="If HasDispatchableQueueItem Then";

case 4:
//if
this.state = 7;
if (parent._hasdispatchablequeueitem()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 2950;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepare";
parent.__c.WaitFor("complete", ba, this, parent._preparenextplayable());
this.state = 45;
return;
case 45:
//C
this.state = 7;
_preparedok = (Boolean) result[0];
;
 //BA.debugLineNum = 2951;BA.debugLine="TraceInfo(\"playback\", IIf(preparedOk, \"prefetch";
parent._traceinfo("playback",BA.ObjectToString(((_preparedok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2952;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;
;
 //BA.debugLineNum = 2954;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";

case 7:
//if
this.state = 14;
if (parent._local_playback_only) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 2955;BA.debugLine="Dim offlineItem As Map = offlinePlaybackCore.Res";
_offlineitem = new anywheresoftware.b4a.objects.collections.Map();
_offlineitem = parent._offlineplaybackcore._resolvenextmusicitem /*anywheresoftware.b4a.objects.collections.Map*/ (parent._statestore);
 //BA.debugLineNum = 2956;BA.debugLine="If offlineItem.IsInitialized And offlineItem.Siz";
if (true) break;

case 10:
//if
this.state = 13;
if (_offlineitem.IsInitialized() && _offlineitem.getSize()>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 2957;BA.debugLine="Wait For (PrepareSpecificPlayable(offlineItem))";
parent.__c.WaitFor("complete", ba, this, parent._preparespecificplayable(_offlineitem));
this.state = 46;
return;
case 46:
//C
this.state = 13;
_preparedofflineok = (Boolean) result[0];
;
 //BA.debugLineNum = 2958;BA.debugLine="TraceInfo(\"playback\", IIf(preparedOfflineOk, \"p";
parent._traceinfo("playback",BA.ObjectToString(((_preparedofflineok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"mode=offline_local id="+BA.ObjectToString(_offlineitem.GetDefault((Object)("id"),(Object)(""))));
 //BA.debugLineNum = 2959;BA.debugLine="Return preparedOfflineOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedofflineok));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 2961;BA.debugLine="TraceInfo(\"playback\", \"prefetch fail\", \"reason=n";
parent._traceinfo("playback","prefetch fail","reason=no_cached_track");
 //BA.debugLineNum = 2962;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 2964;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 14:
//if
this.state = 27;
if (parent._use_data_playback_resolver) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 2965;BA.debugLine="Dim directItem As Map = offlinePlaybackCore.Reso";
_directitem = new anywheresoftware.b4a.objects.collections.Map();
_directitem = parent._offlineplaybackcore._resolvenextmusicitem /*anywheresoftware.b4a.objects.collections.Map*/ (parent._statestore);
 //BA.debugLineNum = 2966;BA.debugLine="If directItem.IsInitialized And directItem.Size";
if (true) break;

case 17:
//if
this.state = 26;
if (_directitem.IsInitialized() && _directitem.getSize()>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 2967;BA.debugLine="Wait For (PrepareSpecificPlayable(directItem))";
parent.__c.WaitFor("complete", ba, this, parent._preparespecificplayable(_directitem));
this.state = 47;
return;
case 47:
//C
this.state = 20;
_prepareddirectok = (Boolean) result[0];
;
 //BA.debugLineNum = 2968;BA.debugLine="TraceInfo(\"playback\", IIf(preparedDirectOk, \"pr";
parent._traceinfo("playback",BA.ObjectToString(((_prepareddirectok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"mode=direct_local reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue))+" id="+BA.ObjectToString(_directitem.GetDefault((Object)("id"),(Object)(""))));
 //BA.debugLineNum = 2969;BA.debugLine="If preparedDirectOk Then Return True";
if (true) break;

case 20:
//if
this.state = 25;
if (_prepareddirectok) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 //BA.debugLineNum = 2971;BA.debugLine="TraceInfo(\"playback\", \"prefetch fail\", \"reason=n";
parent._traceinfo("playback","prefetch fail","reason=no_local_direct reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2972;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 2974;BA.debugLine="If HasPendingExactBreak Then Return False";

case 27:
//if
this.state = 32;
if (parent._haspendingexactbreak()) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 32:
//C
this.state = 33;
;
 //BA.debugLineNum = 2975;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, this, parent._fetchnext());
this.state = 48;
return;
case 48:
//C
this.state = 33;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 2976;BA.debugLine="If result.GetDefault(\"Success\", False) = False Or";
if (true) break;

case 33:
//if
this.state = 38;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False)) || parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 38:
//C
this.state = 39;
;
 //BA.debugLineNum = 2977;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = parent._normalizequeueresponse(_result.Get((Object)("Data")));
 //BA.debugLineNum = 2978;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 39:
//if
this.state = 44;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
this.state = 41;
;}if (true) break;

case 41:
//C
this.state = 44;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 44:
//C
this.state = -1;
;
 //BA.debugLineNum = 2979;BA.debugLine="playQueue = queue";
parent._playqueue = _queue;
 //BA.debugLineNum = 2980;BA.debugLine="SyncExactBreakState";
parent._syncexactbreakstate();
 //BA.debugLineNum = 2981;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepared";
parent.__c.WaitFor("complete", ba, this, parent._preparenextplayable());
this.state = 49;
return;
case 49:
//C
this.state = -1;
_preparedok = (Boolean) result[0];
;
 //BA.debugLineNum = 2982;BA.debugLine="TraceInfo(\"playback\", IIf(preparedOk, \"prefetch d";
parent._traceinfo("playback",BA.ObjectToString(((_preparedok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2983;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 //BA.debugLineNum = 2984;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _preparedfadeinms() throws Exception{
 //BA.debugLineNum = 2745;BA.debugLine="Private Sub PreparedFadeInMs As Int";
 //BA.debugLineNum = 2746;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 2747;BA.debugLine="End Sub";
return 0;
}
public int  _preparedfadeoutms() throws Exception{
 //BA.debugLineNum = 2749;BA.debugLine="Private Sub PreparedFadeOutMs As Int";
 //BA.debugLineNum = 2750;BA.debugLine="Return transitionCoordinator.PreparedFadeOutMs(me";
if (true) return _transitioncoordinator._preparedfadeoutms /*int*/ (_metastate,_runtimestate,_track_overlap_ms,_ad_tail_overlap_ms);
 //BA.debugLineNum = 2751;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparenextplayable() throws Exception{
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _prepared = false;

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
 //BA.debugLineNum = 2652;BA.debugLine="Wait For (Facade_PrepareNextPlayableCore) Complet";
parent.__c.WaitFor("complete", ba, this, parent._facade_preparenextplayablecore());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2653;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
 //BA.debugLineNum = 2654;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparespecificplayable(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
ResumableSub_PrepareSpecificPlayable rsub = new ResumableSub_PrepareSpecificPlayable(this,_item);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSpecificPlayable extends BA.ResumableSub {
public ResumableSub_PrepareSpecificPlayable(b4a.example.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _item) {
this.parent = parent;
this._item = _item;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _item;
boolean _prepared = false;

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
 //BA.debugLineNum = 2657;BA.debugLine="Wait For (transitionCoordinator.PrepareSpecificPl";
parent.__c.WaitFor("complete", ba, this, parent._transitioncoordinator._preparespecificplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_item,parent._runtimestate,parent._metastate,parent._orchestrationstate,parent._playbackflowstate,parent._flow_playing,parent._flow_idle,parent._flow_preparing));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2658;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
 //BA.debugLineNum = 2659;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _prescanupcomingadminute(boolean _force) throws Exception{
long _targettimestamp = 0L;
 //BA.debugLineNum = 3238;BA.debugLine="Private Sub PreScanUpcomingAdMinute(force As Boole";
 //BA.debugLineNum = 3239;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (_currentsecondofminute()<50) { 
if (true) return "";};
 //BA.debugLineNum = 3240;BA.debugLine="Dim targetTimestamp As Long = LocalNowTimestamp +";
_targettimestamp = (long) (_localnowtimestamp()+(60-_currentsecondofminute()));
 //BA.debugLineNum = 3241;BA.debugLine="If (MinuteOfHourFromTimestamp(targetTimestamp) Mo";
if ((_minuteofhourfromtimestamp(_targettimestamp)%5)!=0) { 
if (true) return "";};
 //BA.debugLineNum = 3242;BA.debugLine="If CurrentSecondOfMinute = 50 Then";
if (_currentsecondofminute()==50) { 
 //BA.debugLineNum = 3243;BA.debugLine="TraceLog(\"реклама prescan начало target=\" & Form";
_tracelog("реклама prescan начало target="+_formattimestampfortrace(_targettimestamp));
 };
 //BA.debugLineNum = 3245;BA.debugLine="ScanLocalAdsForTimestamp(targetTimestamp, force)";
_scanlocaladsfortimestamp(_targettimestamp,_force);
 //BA.debugLineNum = 3246;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _probeaudiooutputrecovery() throws Exception{
ResumableSub_ProbeAudioOutputRecovery rsub = new ResumableSub_ProbeAudioOutputRecovery(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ProbeAudioOutputRecovery extends BA.ResumableSub {
public ResumableSub_ProbeAudioOutputRecovery(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _recovered = false;
boolean _queueprepared = false;
boolean _advanced = false;
boolean _started = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2355;BA.debugLine="If isAudioOutputRecoveryPause = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._isaudiooutputrecoverypause==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 2356;BA.debugLine="TraceInfo(\"audio\", \"output probe\", \"queue=\" & pla";
parent._traceinfo("audio","output probe","queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 2357;BA.debugLine="dataPolicyState.ClearPolicyPause";
parent._datapolicystate._clearpolicypause /*String*/ ();
 //BA.debugLineNum = 2358;BA.debugLine="orchestrationState.EnterStartedState";
parent._orchestrationstate._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 2359;BA.debugLine="SetStopIcon";
parent._setstopicon();
 //BA.debugLineNum = 2360;BA.debugLine="HideContentBlocks";
parent._hidecontentblocks();
 //BA.debugLineNum = 2361;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"audio_output_pro";
parent._setplaybackflowstate(parent._flow_idle,"audio_output_probe");
 //BA.debugLineNum = 2362;BA.debugLine="Dim recovered As Boolean = False";
_recovered = parent.__c.False;
 //BA.debugLineNum = 2363;BA.debugLine="If playQueue.Size = 0 Then";
if (true) break;

case 7:
//if
this.state = 14;
if (parent._playqueue.getSize()==0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 2364;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queue";
parent.__c.WaitFor("complete", ba, this, parent._populateplaybackqueue());
this.state = 22;
return;
case 22:
//C
this.state = 10;
_queueprepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2365;BA.debugLine="If queuePrepared = False And playQueue.Size = 0";
if (true) break;

case 10:
//if
this.state = 13;
if (_queueprepared==parent.__c.False && parent._playqueue.getSize()==0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 2366;BA.debugLine="EnterPolicyPauseState(MessageValue(\"audio_devic";
parent._enterpolicypausestate(parent._messagevalue("audio_device_check"),"audio");
 //BA.debugLineNum = 2367;BA.debugLine="isAudioOutputRecoveryPause = True";
parent._isaudiooutputrecoverypause = parent.__c.True;
 //BA.debugLineNum = 2368;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 2371;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"audio_outpu";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("audio_output_probe",parent.__c.True));
this.state = 23;
return;
case 23:
//C
this.state = 15;
_advanced = (Boolean) result[0];
;
 //BA.debugLineNum = 2372;BA.debugLine="recovered = advanced";
_recovered = _advanced;
 //BA.debugLineNum = 2373;BA.debugLine="If recovered = False Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_recovered==parent.__c.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 2374;BA.debugLine="Wait For (StartFirstTrack(\"audio_output_probe\"))";
parent.__c.WaitFor("complete", ba, this, parent._startfirsttrack("audio_output_probe"));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_started = (Boolean) result[0];
;
 //BA.debugLineNum = 2375;BA.debugLine="recovered = started";
_recovered = _started;
 if (true) break;
;
 //BA.debugLineNum = 2377;BA.debugLine="If recovered Then";

case 18:
//if
this.state = 21;
if (_recovered) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 2378;BA.debugLine="TraceInfo(\"audio\", \"output probe recovered\", \"\")";
parent._traceinfo("audio","output probe recovered","");
 //BA.debugLineNum = 2379;BA.debugLine="ResetAudioOutputErrorState";
parent._resetaudiooutputerrorstate();
 //BA.debugLineNum = 2380;BA.debugLine="RefreshConnectionIndicatorState";
parent._refreshconnectionindicatorstate();
 //BA.debugLineNum = 2381;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 21:
//C
this.state = -1;
;
 //BA.debugLineNum = 2383;BA.debugLine="EnterPolicyPauseState(MessageValue(\"audio_device_";
parent._enterpolicypausestate(parent._messagevalue("audio_device_check"),"audio");
 //BA.debugLineNum = 2384;BA.debugLine="isAudioOutputRecoveryPause = True";
parent._isaudiooutputrecoverypause = parent.__c.True;
 //BA.debugLineNum = 2385;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 2386;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _processdirectorsignalstates() throws Exception{
ResumableSub_ProcessDirectorSignalStates rsub = new ResumableSub_ProcessDirectorSignalStates(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ProcessDirectorSignalStates extends BA.ResumableSub {
public ResumableSub_ProcessDirectorSignalStates(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
b4a.example.playbackplayerslot _pendingplayslot = null;
anywheresoftware.b4a.objects.collections.Map _readyplayitem = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
anywheresoftware.b4a.objects.collections.Map _readyprepareitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1942;BA.debugLine="If directorState.IsInitialized = False Then Retur";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._directorstate.IsInitialized /*boolean*/ ()==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1943;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = direc";
_pendingplayslot = parent._directorstate._getpendingplayslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1944;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlayS";
if (true) break;

case 7:
//if
this.state = 10;
if (_pendingplayslot.IsInitialized /*boolean*/ () && _pendingplayslot._hasitem /*boolean*/ () && (_pendingplayslot._state /*String*/ ).equals("ready")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1945;BA.debugLine="Dim readyPlayItem As Map = CloneMap(pendingPlayS";
_readyplayitem = new anywheresoftware.b4a.objects.collections.Map();
_readyplayitem = parent._clonemap(_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 1946;BA.debugLine="ActivateLoadedItem(pendingPlaySlot.AudioKey, rea";
parent._activateloadeditem(_pendingplayslot._audiokey /*String*/ ,_readyplayitem,parent._runtimestate._pendingplayfadeinms /*int*/ );
 //BA.debugLineNum = 1947;BA.debugLine="ClearPendingPlayState";
parent._clearpendingplaystate();
 //BA.debugLineNum = 1948;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1950;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = di";
_pendingprepareslot = parent._directorstate._getpendingprepareslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 1951;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingPr";
if (true) break;

case 11:
//if
this.state = 14;
if (_pendingprepareslot.IsInitialized /*boolean*/ () && _pendingprepareslot._hasitem /*boolean*/ () && (_pendingprepareslot._state /*String*/ ).equals("ready")) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 1952;BA.debugLine="Dim readyPrepareItem As Map = CloneMap(pendingPr";
_readyprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_readyprepareitem = parent._clonemap(_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 1953;BA.debugLine="directorState.SetPrepared(pendingPrepareSlot.Aud";
parent._directorstate._setprepared /*String*/ (_pendingprepareslot._audiokey /*String*/ ,_readyprepareitem);
 //BA.debugLineNum = 1954;BA.debugLine="MirrorRuntimeStateFromDirector";
parent._mirrorruntimestatefromdirector();
 //BA.debugLineNum = 1955;BA.debugLine="TraceLog(\"prefetch prepared audio=\" & pendingPre";
parent._tracelog("prefetch prepared audio="+_pendingprepareslot._audiokey /*String*/ +" item="+parent._describeitem((Object)(_readyprepareitem.getObject())));
 //BA.debugLineNum = 1956;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 1958;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 1959;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _promotepreparedplayer(int _fadeinms,int _fadeoutms) throws Exception{
 //BA.debugLineNum = 2753;BA.debugLine="Private Sub PromotePreparedPlayer(fadeInMs As Int,";
 //BA.debugLineNum = 2754;BA.debugLine="Return transitionCoordinator.PromotePreparedPlaye";
if (true) return _transitioncoordinator._promotepreparedplayer /*boolean*/ (_runtimestate,_dataresolver,_storage,_fadeinms,_fadeoutms,_flow_transitioning);
 //BA.debugLineNum = 2755;BA.debugLine="End Sub";
return false;
}
public String  _prunequeuedbreakitemsbylocalcache() throws Exception{
boolean _changed = false;
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _breakitems = null;
anywheresoftware.b4a.objects.collections.List _filtereditems = null;
Object _breakitemobject = null;
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
 //BA.debugLineNum = 3198;BA.debugLine="Private Sub PruneQueuedBreakItemsByLocalCache";
 //BA.debugLineNum = 3199;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 3200;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
 //BA.debugLineNum = 3201;BA.debugLine="For i = playQueue.Size - 1 To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_i = (int) (_playqueue.getSize()-1) ;
for (;_i >= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 3202;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = _playqueue.Get(_i);
 //BA.debugLineNum = 3203;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 3204;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 3205;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"break\" Then C";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) == false) { 
if (true) continue;};
 //BA.debugLineNum = 3206;BA.debugLine="Dim breakItems As List = item.GetDefault(\"items\"";
_breakitems = new anywheresoftware.b4a.objects.collections.List();
_breakitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
 //BA.debugLineNum = 3207;BA.debugLine="If breakItems.IsInitialized = False Or breakItem";
if (_breakitems.IsInitialized()==__c.False || _breakitems.getSize()==0) { 
 //BA.debugLineNum = 3208;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 //BA.debugLineNum = 3209;BA.debugLine="changed = True";
_changed = __c.True;
 //BA.debugLineNum = 3210;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 3212;BA.debugLine="Dim filteredItems As List";
_filtereditems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3213;BA.debugLine="filteredItems.Initialize";
_filtereditems.Initialize();
 //BA.debugLineNum = 3214;BA.debugLine="For Each breakItemObject As Object In breakItems";
{
final anywheresoftware.b4a.BA.IterableList group16 = _breakitems;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_breakitemobject = group16.Get(index16);
 //BA.debugLineNum = 3215;BA.debugLine="If breakItemObject Is Map Then";
if (_breakitemobject instanceof java.util.Map) { 
 //BA.debugLineNum = 3216;BA.debugLine="Dim breakItem As Map = breakItemObject";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_breakitemobject));
 //BA.debugLineNum = 3217;BA.debugLine="If breakItem.GetDefault(\"type\", \"\") = \"ad\" The";
if ((_breakitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
 //BA.debugLineNum = 3218;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(b";
if (_mediacacheservice._hasvalidatedlocalmedia /*boolean*/ (_breakitem)==__c.False) { 
if (true) continue;};
 };
 //BA.debugLineNum = 3220;BA.debugLine="filteredItems.Add(breakItem)";
_filtereditems.Add((Object)(_breakitem.getObject()));
 };
 }
};
 //BA.debugLineNum = 3223;BA.debugLine="If filteredItems.Size = 0 Then";
if (_filtereditems.getSize()==0) { 
 //BA.debugLineNum = 3224;BA.debugLine="TraceLog(\"брейк очередь drop reason=no_cached_a";
_tracelog("брейк очередь drop reason=no_cached_ads");
 //BA.debugLineNum = 3225;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 //BA.debugLineNum = 3226;BA.debugLine="changed = True";
_changed = __c.True;
 }else if(_filtereditems.getSize()!=_breakitems.getSize()) { 
 //BA.debugLineNum = 3228;BA.debugLine="item.Put(\"items\", filteredItems)";
_item.Put((Object)("items"),(Object)(_filtereditems.getObject()));
 //BA.debugLineNum = 3229;BA.debugLine="item.Put(\"items_count\", filteredItems.Size)";
_item.Put((Object)("items_count"),(Object)(_filtereditems.getSize()));
 //BA.debugLineNum = 3230;BA.debugLine="playQueue.Set(i, item)";
_playqueue.Set(_i,(Object)(_item.getObject()));
 //BA.debugLineNum = 3231;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
 //BA.debugLineNum = 3234;BA.debugLine="If changed Then ResolveScheduledBreakAt";
if (_changed) { 
_resolvescheduledbreakat();};
 //BA.debugLineNum = 3235;BA.debugLine="If changed Then RefreshPreparedItemAfterQueueMuta";
if (_changed) { 
_refreshprepareditemafterqueuemutation();};
 //BA.debugLineNum = 3236;BA.debugLine="End Sub";
return "";
}
public String  _prunetrackcacheifneeded(String _initiator) throws Exception{
anywheresoftware.b4a.objects.collections.List _protectedtrackids = null;
anywheresoftware.b4a.objects.collections.List _relevanttrackids = null;
int _removedcount = 0;
 //BA.debugLineNum = 1044;BA.debugLine="Private Sub PruneTrackCacheIfNeeded(initiator As S";
 //BA.debugLineNum = 1045;BA.debugLine="If DateTime.Now - lastTrackCachePruneAt < TRACK_C";
if (__c.DateTime.getNow()-_lasttrackcachepruneat<_track_cache_prune_cooldown_ms) { 
if (true) return "";};
 //BA.debugLineNum = 1046;BA.debugLine="Dim protectedTrackIds As List = CollectProtectedT";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = _collectprotectedtrackids();
 //BA.debugLineNum = 1047;BA.debugLine="Dim relevantTrackIds As List = CollectRelevantTra";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = _collectrelevanttrackids();
 //BA.debugLineNum = 1048;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = _mediacacheservice._prunetrackcacheifneeded /*int*/ (_protectedtrackids,_relevanttrackids);
 //BA.debugLineNum = 1049;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
 //BA.debugLineNum = 1050;BA.debugLine="lastTrackCachePruneAt = DateTime.Now";
_lasttrackcachepruneat = __c.DateTime.getNow();
 //BA.debugLineNum = 1051;BA.debugLine="TraceLog(\"кэш треков очистка итог initiator=\" &";
_tracelog("кэш треков очистка итог initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 };
 //BA.debugLineNum = 1053;BA.debugLine="End Sub";
return "";
}
public String  _publishhoststate() throws Exception{
 //BA.debugLineNum = 5275;BA.debugLine="Private Sub PublishHostState";
 //BA.debugLineNum = 5277;BA.debugLine="ServicePublishHostState(BuildPublishedHostState)";
_servicepublishhoststate(_buildpublishedhoststate());
 //BA.debugLineNum = 5279;BA.debugLine="End Sub";
return "";
}
public String  _queuehistoryrecordat(anywheresoftware.b4a.objects.collections.Map _item,long _startedatvalue) throws Exception{
long _startedat = 0L;
anywheresoftware.b4a.objects.collections.Map _record = null;
String _recorddate = "";
 //BA.debugLineNum = 3579;BA.debugLine="Private Sub QueueHistoryRecordAt(item As Map, star";
 //BA.debugLineNum = 3580;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 3581;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
 //BA.debugLineNum = 3582;BA.debugLine="Dim startedAt As Long = startedAtValue";
_startedat = _startedatvalue;
 //BA.debugLineNum = 3583;BA.debugLine="If startedAt <= 0 Then startedAt = DateTime.Now";
if (_startedat<=0) { 
_startedat = __c.DateTime.getNow();};
 //BA.debugLineNum = 3584;BA.debugLine="Dim record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3585;BA.debugLine="record.Initialize";
_record.Initialize();
 //BA.debugLineNum = 3586;BA.debugLine="Dim recordDate As String = FormatHistoryDate(star";
_recorddate = _formathistorydate(_startedat);
 //BA.debugLineNum = 3587;BA.debugLine="record.Put(\"date\", recordDate)";
_record.Put((Object)("date"),(Object)(_recorddate));
 //BA.debugLineNum = 3588;BA.debugLine="record.Put(\"time\", FormatHistoryTime(startedAt))";
_record.Put((Object)("time"),(Object)(_formathistorytime(_startedat)));
 //BA.debugLineNum = 3589;BA.debugLine="record.Put(\"type\", item.GetDefault(\"type\", \"\"))";
_record.Put((Object)("type"),_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 3590;BA.debugLine="record.Put(\"id\", item.GetDefault(\"id\", \"\"))";
_record.Put((Object)("id"),_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 3591;BA.debugLine="AppendHistoryRecord(recordDate, record)";
_appendhistoryrecord(_recorddate,_record);
 //BA.debugLineNum = 3592;BA.debugLine="TraceLog(\"история буфер add date=\" & record.Get(\"";
_tracelog("история буфер add date="+BA.ObjectToString(_record.Get((Object)("date")))+" time="+BA.ObjectToString(_record.Get((Object)("time")))+" type="+BA.ObjectToString(_record.Get((Object)("type")))+" id="+BA.ObjectToString(_record.Get((Object)("id")))+" files="+BA.NumberToString(_getpendinghistoryfilecount()));
 //BA.debugLineNum = 3593;BA.debugLine="End Sub";
return "";
}
public String  _queueplaybackdirectorsignaltick(String _source) throws Exception{
 //BA.debugLineNum = 3984;BA.debugLine="Private Sub QueuePlaybackDirectorSignalTick(source";
 //BA.debugLineNum = 3985;BA.debugLine="If isPlaybackDirectorTickQueued Then";
if (_isplaybackdirectortickqueued) { 
 //BA.debugLineNum = 3986;BA.debugLine="isPlaybackDirectorRetickRequested = True";
_isplaybackdirectorretickrequested = __c.True;
 //BA.debugLineNum = 3987;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3989;BA.debugLine="isPlaybackDirectorTickQueued = True";
_isplaybackdirectortickqueued = __c.True;
 //BA.debugLineNum = 3990;BA.debugLine="CallSubDelayed2(Me, \"RunPlaybackDirectorTimerAsyn";
__c.CallSubDelayed2(ba,this,"RunPlaybackDirectorTimerAsync",(Object)(_source));
 //BA.debugLineNum = 3991;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _recoverfromplaybackstall(String _trackid,long _positionms,long _expectedactivationtoken) throws Exception{
ResumableSub_RecoverFromPlaybackStall rsub = new ResumableSub_RecoverFromPlaybackStall(this,_trackid,_positionms,_expectedactivationtoken);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RecoverFromPlaybackStall extends BA.ResumableSub {
public ResumableSub_RecoverFromPlaybackStall(b4a.example.b4xmainpage parent,String _trackid,long _positionms,long _expectedactivationtoken) {
this.parent = parent;
this._trackid = _trackid;
this._positionms = _positionms;
this._expectedactivationtoken = _expectedactivationtoken;
}
b4a.example.b4xmainpage parent;
String _trackid;
long _positionms;
long _expectedactivationtoken;
long _nowticks = 0L;
String _activeaudiokey = "";
String _preparedaudiokey = "";
boolean _queueprepared = false;
boolean _dispatched = false;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2188;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 2189;BA.debugLine="If nowTicks - lastPlaybackWatchdogRecoveryAt < PL";
if (true) break;

case 1:
//if
this.state = 6;
if (_nowticks-parent._lastplaybackwatchdogrecoveryat<parent._playback_watchdog_recovery_cooldown_ms) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 2190;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posit";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._isplaybackstallalreadyrecovered(_trackid,_positionms,_expectedactivationtoken)) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 2191;BA.debugLine="lastPlaybackWatchdogRecoveryAt = nowTicks";
parent._lastplaybackwatchdogrecoveryat = _nowticks;
 //BA.debugLineNum = 2192;BA.debugLine="TraceWarn(\"playback\", \"watchdog stall\", \"trackId=";
parent._tracewarn("playback","watchdog stall","trackId="+_trackid+" posMs="+BA.NumberToString(_positionms)+" stage="+parent._playbackflowstate+" queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 2193;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = parent._transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 2194;BA.debugLine="Dim preparedAudioKey As String = Transition_GetDi";
_preparedaudiokey = parent._transition_getdirectorpreparedaudiokey();
 //BA.debugLineNum = 2195;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
if (true) break;

case 13:
//if
this.state = 18;
if ((_activeaudiokey).equals("") == false) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
parent._getaudiobykey(_activeaudiokey)._reset /*String*/ ();
if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 2196;BA.debugLine="If preparedAudioKey <> \"\" And preparedAudioKey <>";
if (true) break;

case 19:
//if
this.state = 22;
if ((_preparedaudiokey).equals("") == false && (_preparedaudiokey).equals(_activeaudiokey) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 2197;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
parent._getaudiobykey(_preparedaudiokey)._reset /*String*/ ();
 if (true) break;
;
 //BA.debugLineNum = 2199;BA.debugLine="If directorState.IsInitialized Then";

case 22:
//if
this.state = 27;
if (parent._directorstate.IsInitialized /*boolean*/ ()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 //BA.debugLineNum = 2200;BA.debugLine="directorState.Reset";
parent._directorstate._reset /*String*/ ();
 //BA.debugLineNum = 2201;BA.debugLine="directorState.ConfigureDefaultSlots";
parent._directorstate._configuredefaultslots /*String*/ ();
 //BA.debugLineNum = 2202;BA.debugLine="MirrorRuntimeStateFromDirector";
parent._mirrorruntimestatefromdirector();
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 2204;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
parent._runtimestate._activeaudiokey /*String*/  = "";
 //BA.debugLineNum = 2205;BA.debugLine="runtimeState.ActiveItem.Initialize";
parent._runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 if (true) break;

case 27:
//C
this.state = 28;
;
 //BA.debugLineNum = 2207;BA.debugLine="metaState.Reset";
parent._metastate._reset /*String*/ ();
 //BA.debugLineNum = 2208;BA.debugLine="ClearPendingPlayState";
parent._clearpendingplaystate();
 //BA.debugLineNum = 2209;BA.debugLine="ClearPreparedState(False)";
parent._clearpreparedstate(parent.__c.False);
 //BA.debugLineNum = 2210;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
parent._orchestrationstate._cleartracktransitionflags /*String*/ ();
 //BA.debugLineNum = 2211;BA.debugLine="orchestrationState.EndDispatch";
parent._orchestrationstate._enddispatch /*String*/ ();
 //BA.debugLineNum = 2212;BA.debugLine="stateStore.ClearDispatchRetryAfter";
parent._statestore._cleardispatchretryafter /*String*/ ();
 //BA.debugLineNum = 2213;BA.debugLine="ClearRetryTimer";
parent._clearretrytimer();
 //BA.debugLineNum = 2214;BA.debugLine="ClearExactBreakState";
parent._clearexactbreakstate();
 //BA.debugLineNum = 2215;BA.debugLine="ClearHistoryLogTimer";
parent._clearhistorylogtimer();
 //BA.debugLineNum = 2216;BA.debugLine="If playbackFlowState <> FLOW_STOPPING And playbac";
if (true) break;

case 28:
//if
this.state = 31;
if ((parent._playbackflowstate).equals(parent._flow_stopping) == false && (parent._playbackflowstate).equals(parent._flow_paused_policy) == false) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 2217;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"watchdog_stall\"";
parent._setplaybackflowstate(parent._flow_idle,"watchdog_stall");
 if (true) break;
;
 //BA.debugLineNum = 2219;BA.debugLine="If stateStore.GetLocalPlayableQueueCount(playQueu";

case 31:
//if
this.state = 44;
if (parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)==0) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 2220;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queue";
parent.__c.WaitFor("complete", ba, this, parent._populateplaybackqueue());
this.state = 61;
return;
case 61:
//C
this.state = 34;
_queueprepared = (Boolean) result[0];
;
 //BA.debugLineNum = 2221;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posi";
if (true) break;

case 34:
//if
this.state = 39;
if (parent._isplaybackstallalreadyrecovered(_trackid,_positionms,_expectedactivationtoken)) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 39:
//C
this.state = 40;
;
 //BA.debugLineNum = 2222;BA.debugLine="If queuePrepared = False And stateStore.GetLocal";
if (true) break;

case 40:
//if
this.state = 43;
if (_queueprepared==parent.__c.False && parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)==0) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 2223;BA.debugLine="TraceWarn(\"playback\", \"watchdog recovery\", \"ste";
parent._tracewarn("playback","watchdog recovery","step=populate_failed reserve=0");
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = 45;
;
 //BA.debugLineNum = 2226;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"watchdog_st";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectoradvance("watchdog_stall",parent.__c.True));
this.state = 62;
return;
case 62:
//C
this.state = 45;
_dispatched = (Boolean) result[0];
;
 //BA.debugLineNum = 2227;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posit";
if (true) break;

case 45:
//if
this.state = 50;
if (parent._isplaybackstallalreadyrecovered(_trackid,_positionms,_expectedactivationtoken)) { 
this.state = 47;
;}if (true) break;

case 47:
//C
this.state = 50;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 50:
//C
this.state = 51;
;
 //BA.debugLineNum = 2228;BA.debugLine="If dispatched Then";
if (true) break;

case 51:
//if
this.state = 54;
if (_dispatched) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 2229;BA.debugLine="TraceInfo(\"playback\", \"watchdog recovery\", \"resu";
parent._traceinfo("playback","watchdog recovery","result=dispatch queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2230;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
 //BA.debugLineNum = 2232;BA.debugLine="Wait For (LoadNextAndPlay) Complete (advanced As";
parent.__c.WaitFor("complete", ba, this, parent._loadnextandplay());
this.state = 63;
return;
case 63:
//C
this.state = 55;
_advanced = (Boolean) result[0];
;
 //BA.debugLineNum = 2233;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posit";
if (true) break;

case 55:
//if
this.state = 60;
if (parent._isplaybackstallalreadyrecovered(_trackid,_positionms,_expectedactivationtoken)) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 60:
//C
this.state = -1;
;
 //BA.debugLineNum = 2234;BA.debugLine="TraceInfo(\"playback\", \"watchdog recovery\", \"resul";
parent._traceinfo("playback","watchdog recovery","result="+BA.ObjectToString(((_advanced) ? ((Object)("restart")) : ((Object)("failed"))))+" queue="+BA.NumberToString(parent._playqueue.getSize())+" reserve="+BA.NumberToString(parent._statestore._getlocalplayablequeuecount /*int*/ (parent._playqueue)));
 //BA.debugLineNum = 2235;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
 //BA.debugLineNum = 2236;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _recoverstaledirectorslots() throws Exception{
long _nowticks = 0L;
boolean _changed = false;
b4a.example.playbackplayerslot _pendingplayslot = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
 //BA.debugLineNum = 2066;BA.debugLine="Private Sub RecoverStaleDirectorSlots";
 //BA.debugLineNum = 2067;BA.debugLine="If directorState.IsInitialized = False Then Retur";
if (_directorstate.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 2068;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = __c.DateTime.getNow();
 //BA.debugLineNum = 2069;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
 //BA.debugLineNum = 2070;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = direc";
_pendingplayslot = _directorstate._getpendingplayslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2071;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlayS";
if (_pendingplayslot.IsInitialized /*boolean*/ () && _pendingplayslot._hasitem /*boolean*/ ()) { 
 //BA.debugLineNum = 2072;BA.debugLine="If nowTicks - pendingPlaySlot.LastStateChangedAt";
if (_nowticks-_pendingplayslot._laststatechangedat /*long*/ >_audio_ready_timeout_ms) { 
 //BA.debugLineNum = 2073;BA.debugLine="TraceWarn(\"audio\", \"pending play timeout\", \"aud";
_tracewarn("audio","pending play timeout","audio="+_pendingplayslot._audiokey /*String*/ +" trackId="+_tracetrackvalue(_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ ));
 //BA.debugLineNum = 2074;BA.debugLine="directorState.ClearRole(\"pending_play\")";
_directorstate._clearrole /*String*/ ("pending_play");
 //BA.debugLineNum = 2075;BA.debugLine="changed = True";
_changed = __c.True;
 };
 };
 //BA.debugLineNum = 2078;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = di";
_pendingprepareslot = _directorstate._getpendingprepareslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2079;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingPr";
if (_pendingprepareslot.IsInitialized /*boolean*/ () && _pendingprepareslot._hasitem /*boolean*/ ()) { 
 //BA.debugLineNum = 2080;BA.debugLine="If nowTicks - pendingPrepareSlot.LastStateChange";
if (_nowticks-_pendingprepareslot._laststatechangedat /*long*/ >_audio_ready_timeout_ms) { 
 //BA.debugLineNum = 2081;BA.debugLine="TraceWarn(\"audio\", \"pending prepare timeout\", \"";
_tracewarn("audio","pending prepare timeout","audio="+_pendingprepareslot._audiokey /*String*/ +" trackId="+_tracetrackvalue(_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ ));
 //BA.debugLineNum = 2082;BA.debugLine="directorState.ClearRole(pendingPrepareSlot.Role";
_directorstate._clearrole /*String*/ (_pendingprepareslot._role /*String*/ );
 //BA.debugLineNum = 2083;BA.debugLine="changed = True";
_changed = __c.True;
 };
 };
 //BA.debugLineNum = 2086;BA.debugLine="If changed Then MirrorRuntimeStateFromDirector";
if (_changed) { 
_mirrorruntimestatefromdirector();};
 //BA.debugLineNum = 2087;BA.debugLine="End Sub";
return "";
}
public String  _refreshconnectionindicatorstate() throws Exception{
 //BA.debugLineNum = 4563;BA.debugLine="Private Sub RefreshConnectionIndicatorState";
 //BA.debugLineNum = 4564;BA.debugLine="UpdateConnectionIndicator(ResolveConnectionIndica";
_updateconnectionindicator(_resolveconnectionindicatormode());
 //BA.debugLineNum = 4565;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refreshofflinedatanow() throws Exception{
ResumableSub_RefreshOfflineDataNow rsub = new ResumableSub_RefreshOfflineDataNow(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefreshOfflineDataNow extends BA.ResumableSub {
public ResumableSub_RefreshOfflineDataNow(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _refreshed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1308;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._local_playback_only) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 1309;BA.debugLine="Wait For (playerDataCoordinator.RefreshOfflineDat";
parent.__c.WaitFor("complete", ba, this, parent._playerdatacoordinator._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._fetch_timeout_ms));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_refreshed = (Boolean) result[0];
;
 //BA.debugLineNum = 1310;BA.debugLine="Return refreshed";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_refreshed));return;};
 //BA.debugLineNum = 1311;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refreshpendinghistorystate() throws Exception{
 //BA.debugLineNum = 3687;BA.debugLine="Private Sub RefreshPendingHistoryState";
 //BA.debugLineNum = 3688;BA.debugLine="storage.Put(\"pending_history_count\", CountAllPend";
_storage._put /*String*/ ("pending_history_count",(Object)(_countallpendinghistoryrecords()));
 //BA.debugLineNum = 3689;BA.debugLine="End Sub";
return "";
}
public String  _refreshplayerheaderfromcurrentdata() throws Exception{
String _safecode = "";
String _title = "";
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
 //BA.debugLineNum = 1732;BA.debugLine="Private Sub RefreshPlayerHeaderFromCurrentData";
 //BA.debugLineNum = 1733;BA.debugLine="Dim safeCode As String = playerCode";
_safecode = _playercode;
 //BA.debugLineNum = 1734;BA.debugLine="Dim title As String = \"\"";
_title = "";
 //BA.debugLineNum = 1735;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = _statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 1736;BA.debugLine="If offlineData.IsInitialized Then";
if (_offlinedata.IsInitialized()) { 
 //BA.debugLineNum = 1737;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_offlinedata.GetDefault((Object)("player"),__c.Null)));
 //BA.debugLineNum = 1738;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
 //BA.debugLineNum = 1739;BA.debugLine="safeCode = playerData.GetDefault(\"code\", safeCo";
_safecode = BA.ObjectToString(_playerdata.GetDefault((Object)("code"),(Object)(_safecode)));
 //BA.debugLineNum = 1740;BA.debugLine="title = playerData.GetDefault(\"title\", \"\")";
_title = BA.ObjectToString(_playerdata.GetDefault((Object)("title"),(Object)("")));
 };
 };
 //BA.debugLineNum = 1743;BA.debugLine="RenderPlayerHead(safeCode, title)";
_renderplayerhead(_safecode,_title);
 //BA.debugLineNum = 1744;BA.debugLine="End Sub";
return "";
}
public String  _refreshprepareditemafterqueuemutation() throws Exception{
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
anywheresoftware.b4a.objects.collections.Map _dispatchableitem = null;
 //BA.debugLineNum = 4751;BA.debugLine="Private Sub RefreshPreparedItemAfterQueueMutation";
 //BA.debugLineNum = 4752;BA.debugLine="Dim preparedItem As Map = Transition_GetDirectorP";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _transition_getdirectorprepareditem();
 //BA.debugLineNum = 4753;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (_prepareditem.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4754;BA.debugLine="Dim dispatchableItem As Map = PeekDispatchableQue";
_dispatchableitem = new anywheresoftware.b4a.objects.collections.Map();
_dispatchableitem = _peekdispatchablequeueitem();
 //BA.debugLineNum = 4755;BA.debugLine="If dispatchableItem.IsInitialized = False Then Re";
if (_dispatchableitem.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4756;BA.debugLine="If ItemsMatch(preparedItem, dispatchableItem) The";
if (_itemsmatch(_prepareditem,_dispatchableitem)) { 
if (true) return "";};
 //BA.debugLineNum = 4757;BA.debugLine="TraceLog(\"prefetch invalidate reason=queue_change";
_tracelog("prefetch invalidate reason=queue_changed prepared="+_describeitem((Object)(_prepareditem.getObject()))+" head="+_describeitem((Object)(_dispatchableitem.getObject())));
 //BA.debugLineNum = 4758;BA.debugLine="ClearPreparedState(False)";
_clearpreparedstate(__c.False);
 //BA.debugLineNum = 4759;BA.debugLine="orchestrationState.PrefetchDone = False";
_orchestrationstate._prefetchdone /*boolean*/  = __c.False;
 //BA.debugLineNum = 4760;BA.debugLine="QueuePlaybackDirectorSignalTick(\"queue_changed\")";
_queueplaybackdirectorsignaltick("queue_changed");
 //BA.debugLineNum = 4761;BA.debugLine="End Sub";
return "";
}
public String  _rememberfailedappupdateversion(int _targetversion,String _reason,int _attempts) throws Exception{
long _retryafter = 0L;
 //BA.debugLineNum = 471;BA.debugLine="Private Sub RememberFailedAppUpdateVersion(targetV";
 //BA.debugLineNum = 472;BA.debugLine="Dim retryAfter As Long = DateTime.Now + APP_UPDAT";
_retryafter = (long) (__c.DateTime.getNow()+_app_update_retry_delay_ms);
 //BA.debugLineNum = 473;BA.debugLine="storage.Put(APP_UPDATE_FAILED_VERSION_KEY, target";
_storage._put /*String*/ (_app_update_failed_version_key,(Object)(_targetversion));
 //BA.debugLineNum = 474;BA.debugLine="storage.Put(APP_UPDATE_FAILED_REASON_KEY, reason)";
_storage._put /*String*/ (_app_update_failed_reason_key,(Object)(_reason));
 //BA.debugLineNum = 475;BA.debugLine="storage.Put(APP_UPDATE_FAILED_AT_KEY, DateTime.No";
_storage._put /*String*/ (_app_update_failed_at_key,(Object)(__c.DateTime.getNow()));
 //BA.debugLineNum = 476;BA.debugLine="storage.Put(APP_UPDATE_FAILED_RETRY_AFTER_KEY, re";
_storage._put /*String*/ (_app_update_failed_retry_after_key,(Object)(_retryafter));
 //BA.debugLineNum = 477;BA.debugLine="storage.Put(APP_UPDATE_FAILED_ATTEMPTS_KEY, attem";
_storage._put /*String*/ (_app_update_failed_attempts_key,(Object)(_attempts));
 //BA.debugLineNum = 478;BA.debugLine="TraceWarn(\"update\", \"обновление отложено\", \"targe";
_tracewarn("update","обновление отложено","target="+BA.NumberToString(_targetversion)+" reason="+_reason+" retryAfter="+BA.NumberToString(_retryafter));
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return "";
}
public String  _renderplayerhead(String _code,String _title) throws Exception{
 //BA.debugLineNum = 4587;BA.debugLine="Private Sub RenderPlayerHead(code As String, title";
 //BA.debugLineNum = 4588;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4589;BA.debugLine="uiController.RenderPlayerHead(FormatPlayerCodeFor";
_uicontroller._renderplayerhead /*String*/ (_formatplayercodefordisplay(_code),_title);
 //BA.debugLineNum = 4590;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4591;BA.debugLine="End Sub";
return "";
}
public String  _requestautostartcommand() throws Exception{
 //BA.debugLineNum = 1251;BA.debugLine="Private Sub RequestAutoStartCommand";
 //BA.debugLineNum = 1253;BA.debugLine="serviceBridge.RequestPlaybackAutoStart";
_servicebridge._requestplaybackautostart /*String*/ ();
 //BA.debugLineNum = 1257;BA.debugLine="End Sub";
return "";
}
public String  _requestdeferredpoststarttasks() throws Exception{
 //BA.debugLineNum = 1154;BA.debugLine="Private Sub RequestDeferredPostStartTasks";
 //BA.debugLineNum = 1155;BA.debugLine="isPostStartTasksDeferredAfterStartup = True";
_ispoststarttasksdeferredafterstartup = __c.True;
 //BA.debugLineNum = 1156;BA.debugLine="End Sub";
return "";
}
public String  _requestmanualstartcommand() throws Exception{
 //BA.debugLineNum = 1259;BA.debugLine="Private Sub RequestManualStartCommand";
 //BA.debugLineNum = 1261;BA.debugLine="serviceBridge.RequestPlaybackManualStart";
_servicebridge._requestplaybackmanualstart /*String*/ ();
 //BA.debugLineNum = 1265;BA.debugLine="End Sub";
return "";
}
public void  _requestplayercodefocusasync() throws Exception{
ResumableSub_RequestPlayerCodeFocusAsync rsub = new ResumableSub_RequestPlayerCodeFocusAsync(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RequestPlayerCodeFocusAsync extends BA.ResumableSub {
public ResumableSub_RequestPlayerCodeFocusAsync(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1687;BA.debugLine="If appScreenMode <> \"setup\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._appscreenmode).equals("setup") == false) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1688;BA.debugLine="If txtPlayerCode.IsInitialized = False Then Retur";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._txtplayercode.IsInitialized()==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 1689;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 //BA.debugLineNum = 1690;BA.debugLine="txtPlayerCode.RequestFocus";
parent._txtplayercode.RequestFocus();
 //BA.debugLineNum = 1691;BA.debugLine="MovePlayerCodeCursorToEnd";
parent._moveplayercodecursortoend();
 //BA.debugLineNum = 1693;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _requeststopcommand() throws Exception{
 //BA.debugLineNum = 1267;BA.debugLine="Private Sub RequestStopCommand";
 //BA.debugLineNum = 1269;BA.debugLine="serviceBridge.RequestPlaybackStop";
_servicebridge._requestplaybackstop /*String*/ ();
 //BA.debugLineNum = 1273;BA.debugLine="End Sub";
return "";
}
public String  _resetaudiooutputerrorstate() throws Exception{
 //BA.debugLineNum = 3422;BA.debugLine="Private Sub ResetAudioOutputErrorState";
 //BA.debugLineNum = 3423;BA.debugLine="consecutiveAudioOutputErrors = 0";
_consecutiveaudiooutputerrors = (int) (0);
 //BA.debugLineNum = 3424;BA.debugLine="isAudioOutputRecoveryPause = False";
_isaudiooutputrecoverypause = __c.False;
 //BA.debugLineNum = 3425;BA.debugLine="End Sub";
return "";
}
public String  _resetplaybackwatchdogstate() throws Exception{
 //BA.debugLineNum = 2058;BA.debugLine="Private Sub ResetPlaybackWatchdogState";
 //BA.debugLineNum = 2059;BA.debugLine="lastPlaybackWatchdogPositionMs = -1";
_lastplaybackwatchdogpositionms = (long) (-1);
 //BA.debugLineNum = 2060;BA.debugLine="lastPlaybackWatchdogTrackId = \"\"";
_lastplaybackwatchdogtrackid = "";
 //BA.debugLineNum = 2061;BA.debugLine="lastPlaybackWatchdogProgressAt = 0";
_lastplaybackwatchdogprogressat = (long) (0);
 //BA.debugLineNum = 2062;BA.debugLine="lastPlaybackWatchdogRecoveryAt = 0";
_lastplaybackwatchdogrecoveryat = (long) (0);
 //BA.debugLineNum = 2063;BA.debugLine="playbackActivationToken = 0";
_playbackactivationtoken = (long) (0);
 //BA.debugLineNum = 2064;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelay() throws Exception{
 //BA.debugLineNum = 3418;BA.debugLine="Private Sub ResetRetryDelay";
 //BA.debugLineNum = 3419;BA.debugLine="playerDataCoordinator.ResetRetryDelay(LOCAL_RETRY";
_playerdatacoordinator._resetretrydelay /*String*/ (_local_retry_delay_initial,_server_retry_delay_initial);
 //BA.debugLineNum = 3420;BA.debugLine="End Sub";
return "";
}
public String  _resolveadcachefilecounttext() throws Exception{
 //BA.debugLineNum = 4232;BA.debugLine="Private Sub ResolveAdCacheFileCountText As String";
 //BA.debugLineNum = 4233;BA.debugLine="Return \"\" & mediaCacheService.GetCachedAdCount";
if (true) return ""+BA.NumberToString(_mediacacheservice._getcachedadcount /*int*/ ());
 //BA.debugLineNum = 4234;BA.debugLine="End Sub";
return "";
}
public String  _resolveadcachesizembtext() throws Exception{
 //BA.debugLineNum = 4224;BA.debugLine="Private Sub ResolveAdCacheSizeMbText As String";
 //BA.debugLineNum = 4225;BA.debugLine="Return \"\" & Floor(mediaCacheService.GetCachedAdBy";
if (true) return ""+BA.NumberToString(__c.Floor(_mediacacheservice._getcachedadbytes /*long*/ ()/(double)1024/(double)1024));
 //BA.debugLineNum = 4226;BA.debugLine="End Sub";
return "";
}
public String  _resolveappversion() throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Private Sub ResolveAppVersion As String";
 //BA.debugLineNum = 323;BA.debugLine="If AppInfo.VersionName <> \"\" Then Return AppInfo.";
if ((_appinfo._versionname /*String*/ ).equals("") == false) { 
if (true) return _appinfo._versionname /*String*/ ;};
 //BA.debugLineNum = 324;BA.debugLine="Return \"\" & AppInfo.VersionCode";
if (true) return ""+BA.NumberToString(_appinfo._versioncode /*int*/ );
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public String  _resolvecachehealthstatustext() throws Exception{
int _reserve = 0;
 //BA.debugLineNum = 4236;BA.debugLine="Private Sub ResolveCacheHealthStatusText As String";
 //BA.debugLineNum = 4237;BA.debugLine="Dim reserve As Int = stateStore.GetLocalPlayableQ";
_reserve = _statestore._getlocalplayablequeuecount /*int*/ (_playqueue);
 //BA.debugLineNum = 4238;BA.debugLine="If reserve > 0 Then Return \"норма\"";
if (_reserve>0) { 
if (true) return "норма";};
 //BA.debugLineNum = 4239;BA.debugLine="If metaState.CurrentMediaType = \"track\" And IsPla";
if ((_metastate._currentmediatype /*String*/ ).equals("track") && BA.ObjectToBoolean(_isplaybackrunningfortrace())) { 
if (true) return "минимум";};
 //BA.debugLineNum = 4240;BA.debugLine="If HasDispatchableQueueItem Then Return \"вставки";
if (_hasdispatchablequeueitem()) { 
if (true) return "вставки готовы";};
 //BA.debugLineNum = 4241;BA.debugLine="If stateStore.HasAnyCachedTrack Then Return \"мини";
if (_statestore._hasanycachedtrack /*boolean*/ ()) { 
if (true) return "минимум";};
 //BA.debugLineNum = 4242;BA.debugLine="Return \"пусто\"";
if (true) return "пусто";
 //BA.debugLineNum = 4243;BA.debugLine="End Sub";
return "";
}
public String  _resolveclientosname() throws Exception{
 //BA.debugLineNum = 4776;BA.debugLine="Private Sub ResolveClientOsName As String";
 //BA.debugLineNum = 4778;BA.debugLine="Return \"android\"";
if (true) return "android";
 //BA.debugLineNum = 4793;BA.debugLine="End Sub";
return "";
}
public String  _resolveclientplatformtext() throws Exception{
 //BA.debugLineNum = 4289;BA.debugLine="Private Sub ResolveClientPlatformText As String";
 //BA.debugLineNum = 4290;BA.debugLine="Return PlatformBridge.ResolveClientPlatformText";
if (true) return _platformbridge._resolveclientplatformtext /*String*/ (ba);
 //BA.debugLineNum = 4291;BA.debugLine="End Sub";
return "";
}
public String  _resolveconnectionindicatormode() throws Exception{
 //BA.debugLineNum = 4567;BA.debugLine="Private Sub ResolveConnectionIndicatorMode As Stri";
 //BA.debugLineNum = 4568;BA.debugLine="If dataPolicyState.HasLocalMediaFallback Then";
if (_datapolicystate._haslocalmediafallback /*boolean*/ ) { 
 //BA.debugLineNum = 4569;BA.debugLine="If stateStore.IsMediaPathDegraded Then Return \"d";
if (_statestore._ismediapathdegraded /*boolean*/ ()) { 
if (true) return "degraded";};
 //BA.debugLineNum = 4570;BA.debugLine="Return \"local\"";
if (true) return "local";
 };
 //BA.debugLineNum = 4572;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy Then";
if (_datapolicystate._isplaybackpausedbypolicy /*boolean*/ ) { 
if (true) return "server";};
 //BA.debugLineNum = 4573;BA.debugLine="If stateStore.IsMediaPathDegraded Then Return \"de";
if (_statestore._ismediapathdegraded /*boolean*/ ()) { 
if (true) return "degraded";};
 //BA.debugLineNum = 4574;BA.debugLine="Return \"online\"";
if (true) return "online";
 //BA.debugLineNum = 4575;BA.debugLine="End Sub";
return "";
}
public String  _resolvecurrenttracktracevalue() throws Exception{
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
 //BA.debugLineNum = 4198;BA.debugLine="Private Sub ResolveCurrentTrackTraceValue As Strin";
 //BA.debugLineNum = 4199;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = _transition_getdirectoractiveitem();
 //BA.debugLineNum = 4200;BA.debugLine="If activeItem.IsInitialized = False Then Return \"";
if (_activeitem.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4201;BA.debugLine="Return TraceTrackValue(activeItem)";
if (true) return _tracetrackvalue(_activeitem);
 //BA.debugLineNum = 4202;BA.debugLine="End Sub";
return "";
}
public String  _resolvedevicetracename() throws Exception{
 //BA.debugLineNum = 4285;BA.debugLine="Private Sub ResolveDeviceTraceName As String";
 //BA.debugLineNum = 4286;BA.debugLine="Return PlatformBridge.ResolveDeviceTraceName";
if (true) return _platformbridge._resolvedevicetracename /*String*/ (ba);
 //BA.debugLineNum = 4287;BA.debugLine="End Sub";
return "";
}
public int  _resolvedirectoryfilecountrecursive(String _dir) throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _totalcount = 0;
String _filename = "";
 //BA.debugLineNum = 4267;BA.debugLine="Private Sub ResolveDirectoryFileCountRecursive(dir";
 //BA.debugLineNum = 4268;BA.debugLine="If dir = \"\" Then Return 0";
if ((_dir).equals("")) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 4269;BA.debugLine="If File.Exists(dir, \"\") = False Then Return 0";
if (__c.File.Exists(_dir,"")==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 4270;BA.debugLine="Dim listedFiles As List = File.ListFiles(dir)";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_dir);
 //BA.debugLineNum = 4271;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 4272;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
 //BA.debugLineNum = 4273;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 4274;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 4275;BA.debugLine="If File.IsDirectory(dir, fileName) Then";
if (__c.File.IsDirectory(_dir,_filename)) { 
 //BA.debugLineNum = 4276;BA.debugLine="totalCount = totalCount + ResolveDirectoryFileC";
_totalcount = (int) (_totalcount+_resolvedirectoryfilecountrecursive(__c.File.Combine(_dir,_filename)));
 //BA.debugLineNum = 4277;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 4279;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
 //BA.debugLineNum = 4280;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
 //BA.debugLineNum = 4282;BA.debugLine="Return totalCount";
if (true) return _totalcount;
 //BA.debugLineNum = 4283;BA.debugLine="End Sub";
return 0;
}
public long  _resolvedirectorysizebytesrecursive(String _dir) throws Exception{
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
long _totalbytes = 0L;
String _filename = "";
String _childpath = "";
 //BA.debugLineNum = 4245;BA.debugLine="Private Sub ResolveDirectorySizeBytesRecursive(dir";
 //BA.debugLineNum = 4246;BA.debugLine="If dir = \"\" Then Return 0";
if ((_dir).equals("")) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 4247;BA.debugLine="If File.Exists(dir, \"\") = False Then Return 0";
if (__c.File.Exists(_dir,"")==__c.False) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 4248;BA.debugLine="Dim listedFiles As List = File.ListFiles(dir)";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_dir);
 //BA.debugLineNum = 4249;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 4250;BA.debugLine="Dim totalBytes As Long = 0";
_totalbytes = (long) (0);
 //BA.debugLineNum = 4251;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 4252;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
 //BA.debugLineNum = 4253;BA.debugLine="Dim childPath As String = File.Combine(dir, file";
_childpath = __c.File.Combine(_dir,_filename);
 //BA.debugLineNum = 4254;BA.debugLine="If File.IsDirectory(dir, fileName) Then";
if (__c.File.IsDirectory(_dir,_filename)) { 
 //BA.debugLineNum = 4255;BA.debugLine="totalBytes = totalBytes + ResolveDirectorySizeB";
_totalbytes = (long) (_totalbytes+_resolvedirectorysizebytesrecursive(_childpath));
 //BA.debugLineNum = 4256;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 4258;BA.debugLine="Try";
try { //BA.debugLineNum = 4259;BA.debugLine="totalBytes = totalBytes + File.Size(dir, fileNa";
_totalbytes = (long) (_totalbytes+__c.File.Size(_dir,_filename));
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 4261;BA.debugLine="TraceDebug(\"не удалось определить размер файла";
_tracedebug("не удалось определить размер файла кэша file="+_childpath+" message="+__c.LastException(ba).getMessage());
 };
 }
};
 //BA.debugLineNum = 4264;BA.debugLine="Return totalBytes";
if (true) return _totalbytes;
 //BA.debugLineNum = 4265;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedispatchdecision(boolean _allowload) throws Exception{
boolean _haslocalreserve = false;
 //BA.debugLineNum = 2010;BA.debugLine="Private Sub ResolveDispatchDecision(allowLoad As B";
 //BA.debugLineNum = 2011;BA.debugLine="Dim hasLocalReserve As Boolean = False";
_haslocalreserve = __c.False;
 //BA.debugLineNum = 2012;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (_local_playback_only) { 
 //BA.debugLineNum = 2013;BA.debugLine="hasLocalReserve = GetCurrentSlotHasLocalReserve";
_haslocalreserve = _getcurrentslothaslocalreserve() || _statestore._hasanycachedtrack /*boolean*/ ();
 }else {
 //BA.debugLineNum = 2015;BA.debugLine="hasLocalReserve = GetCurrentSlotHasLocalReserve";
_haslocalreserve = _getcurrentslothaslocalreserve() || _statestore._getlocalplayablequeuecount /*int*/ (_playqueue)>0;
 };
 //BA.debugLineNum = 2017;BA.debugLine="Return offlinePlaybackCore.ResolveAdvanceDecision";
if (true) return _offlineplaybackcore._resolveadvancedecision /*anywheresoftware.b4a.objects.collections.Map*/ (_shouldprioritizequeueheadoverprepared(),_canuseprepareditemnow(),_hasdispatchablequeueitem(),_haslocalreserve,_allowload);
 //BA.debugLineNum = 2023;BA.debugLine="End Sub";
return null;
}
public String  _resolveerrormessage(anywheresoftware.b4a.objects.collections.Map _result,String _fallback) throws Exception{
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _errormessage = "";
 //BA.debugLineNum = 4763;BA.debugLine="Private Sub ResolveErrorMessage(result As Map, fal";
 //BA.debugLineNum = 4764;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(__c.False)))) { 
 //BA.debugLineNum = 4765;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
 //BA.debugLineNum = 4766;BA.debugLine="If resultData Is Map Then";
if (_resultdata instanceof java.util.Map) { 
 //BA.debugLineNum = 4767;BA.debugLine="Dim m As Map = resultData";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
 //BA.debugLineNum = 4768;BA.debugLine="If m.GetDefault(\"message\", \"\") <> \"\" Then Retur";
if ((_m.GetDefault((Object)("message"),(Object)(""))).equals((Object)("")) == false) { 
if (true) return BA.ObjectToString(_m.Get((Object)("message")));};
 };
 };
 //BA.debugLineNum = 4771;BA.debugLine="Dim errorMessage As String = result.GetDefault(\"E";
_errormessage = BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)("")));
 //BA.debugLineNum = 4772;BA.debugLine="If errorMessage <> \"\" Then Return errorMessage";
if ((_errormessage).equals("") == false) { 
if (true) return _errormessage;};
 //BA.debugLineNum = 4773;BA.debugLine="Return fallback";
if (true) return _fallback;
 //BA.debugLineNum = 4774;BA.debugLine="End Sub";
return "";
}
public String  _resolvefreediskmbtext() throws Exception{
 //BA.debugLineNum = 4208;BA.debugLine="Private Sub ResolveFreeDiskMbText As String";
 //BA.debugLineNum = 4209;BA.debugLine="Return PlatformBridge.ResolveFreeDiskMbText(stora";
if (true) return _platformbridge._resolvefreediskmbtext /*String*/ (ba,_storagedir);
 //BA.debugLineNum = 4210;BA.debugLine="End Sub";
return "";
}
public String  _resolvefreerammbtext() throws Exception{
 //BA.debugLineNum = 4204;BA.debugLine="Private Sub ResolveFreeRamMbText As String";
 //BA.debugLineNum = 4205;BA.debugLine="Return PlatformBridge.ResolveFreeRamMbText";
if (true) return _platformbridge._resolvefreerammbtext /*String*/ (ba);
 //BA.debugLineNum = 4206;BA.debugLine="End Sub";
return "";
}
public double  _resolveitemgaindb(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 4644;BA.debugLine="Private Sub ResolveItemGainDb(item As Map) As Doub";
 //BA.debugLineNum = 4645;BA.debugLine="If item.IsInitialized = False Then Return -3";
if (_item.IsInitialized()==__c.False) { 
if (true) return -3;};
 //BA.debugLineNum = 4646;BA.debugLine="Return NormalizeDbValue(item.GetDefault(\"gain\", -";
if (true) return _normalizedbvalue(_item.GetDefault((Object)("gain"),(Object)(-3)),-3);
 //BA.debugLineNum = 4647;BA.debugLine="End Sub";
return 0;
}
public double  _resolveitemvolume(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemtype = "";
double _gaindb = 0;
double _basefactor = 0;
 //BA.debugLineNum = 4635;BA.debugLine="Private Sub ResolveItemVolume(item As Map) As Doub";
 //BA.debugLineNum = 4636;BA.debugLine="If item.IsInitialized = False Then Return 0.7";
if (_item.IsInitialized()==__c.False) { 
if (true) return 0.7;};
 //BA.debugLineNum = 4637;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4638;BA.debugLine="Dim gainDb As Double = ResolveItemGainDb(item)";
_gaindb = _resolveitemgaindb(_item);
 //BA.debugLineNum = 4639;BA.debugLine="Dim baseFactor As Double = 1";
_basefactor = 1;
 //BA.debugLineNum = 4640;BA.debugLine="If itemType = \"track\" Then baseFactor = ResolvePl";
if ((_itemtype).equals("track")) { 
_basefactor = _resolveplayerlevelfactor();};
 //BA.debugLineNum = 4641;BA.debugLine="Return Max(0, Min(1, baseFactor * DbToFactor(gain";
if (true) return __c.Max(0,__c.Min(1,_basefactor*_dbtofactor(_gaindb)));
 //BA.debugLineNum = 4642;BA.debugLine="End Sub";
return 0;
}
public String  _resolvemachineguidasync() throws Exception{
 //BA.debugLineNum = 4830;BA.debugLine="Private Sub ResolveMachineGuidAsync";
 //BA.debugLineNum = 4840;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextplaybackboundaryitem() throws Exception{
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _fallbackitem = null;
 //BA.debugLineNum = 531;BA.debugLine="Private Sub ResolveNextPlaybackBoundaryItem As Map";
 //BA.debugLineNum = 532;BA.debugLine="Dim preparedItem As Map = Transition_GetDirectorP";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _transition_getdirectorprepareditem();
 //BA.debugLineNum = 533;BA.debugLine="If preparedItem.IsInitialized And preparedItem.Si";
if (_prepareditem.IsInitialized() && _prepareditem.getSize()>0) { 
if (true) return _prepareditem;};
 //BA.debugLineNum = 534;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
 //BA.debugLineNum = 535;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 536;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 537;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 };
 //BA.debugLineNum = 539;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
_nextobject = _playqueue.Get((int) (0));
 //BA.debugLineNum = 540;BA.debugLine="If nextObject Is Map Then Return nextObject";
if (_nextobject instanceof java.util.Map) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));};
 //BA.debugLineNum = 541;BA.debugLine="Dim fallbackItem As Map";
_fallbackitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 542;BA.debugLine="fallbackItem.Initialize";
_fallbackitem.Initialize();
 //BA.debugLineNum = 543;BA.debugLine="Return fallbackItem";
if (true) return _fallbackitem;
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return null;
}
public long  _resolveplanneddurationms(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
b4a.example.audioplayer _audio = null;
long _audioduration = 0L;
long _itemduration = 0L;
 //BA.debugLineNum = 3277;BA.debugLine="Private Sub ResolvePlannedDurationMs(audioKey As S";
 //BA.debugLineNum = 3278;BA.debugLine="Dim audio As AudioPlayer = GetAudioByKey(audioKey";
_audio = _getaudiobykey(_audiokey);
 //BA.debugLineNum = 3279;BA.debugLine="If audio.IsInitialized Then";
if (_audio.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 3280;BA.debugLine="Dim audioDuration As Long = audio.Duration";
_audioduration = _audio._duration /*long*/ ();
 //BA.debugLineNum = 3281;BA.debugLine="If audioDuration > 0 Then Return audioDuration";
if (_audioduration>0) { 
if (true) return _audioduration;};
 };
 //BA.debugLineNum = 3283;BA.debugLine="Dim itemDuration As Long = ToLongDefault(item.Get";
_itemduration = _tolongdefault(_item.GetDefault((Object)("duration"),(Object)(0)),(long) (0));
 //BA.debugLineNum = 3284;BA.debugLine="If itemDuration <= 0 Then Return 0";
if (_itemduration<=0) { 
if (true) return (long) (0);};
 //BA.debugLineNum = 3285;BA.debugLine="If itemDuration < 1000 Then Return itemDuration *";
if (_itemduration<1000) { 
if (true) return (long) (_itemduration*1000);};
 //BA.debugLineNum = 3286;BA.debugLine="Return itemDuration";
if (true) return _itemduration;
 //BA.debugLineNum = 3287;BA.debugLine="End Sub";
return 0L;
}
public String  _resolveplaybackblockreason(anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
 //BA.debugLineNum = 3395;BA.debugLine="Private Sub ResolvePlaybackBlockReason(data As Map";
 //BA.debugLineNum = 3396;BA.debugLine="Return playerDataCoordinator.ResolvePlaybackBlock";
if (true) return _playerdatacoordinator._resolveplaybackblockreason /*String*/ (_data,_effectivenowticks());
 //BA.debugLineNum = 3397;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackmediaurl(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 4601;BA.debugLine="Private Sub ResolvePlaybackMediaUrl(audioKey As St";
 //BA.debugLineNum = 4602;BA.debugLine="Return mediaCacheService.ResolvePlaybackMediaUri(";
if (true) return _mediacacheservice._resolveplaybackmediauri /*String*/ (_audiokey,_item);
 //BA.debugLineNum = 4603;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolveplaybacktickdecision() throws Exception{
anywheresoftware.b4a.objects.collections.Map _result = null;
long _remain = 0L;
 //BA.debugLineNum = 1822;BA.debugLine="Private Sub ResolvePlaybackTickDecision As Map";
 //BA.debugLineNum = 1823;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1824;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1825;BA.debugLine="result.Put(\"action\", \"\")";
_result.Put((Object)("action"),(Object)(""));
 //BA.debugLineNum = 1826;BA.debugLine="result.Put(\"remainMs\", EffectiveTrackRemainMs)";
_result.Put((Object)("remainMs"),(Object)(_effectivetrackremainms()));
 //BA.debugLineNum = 1827;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if ((_transition_getdirectoractiveaudiokey()).equals("")) { 
if (true) return _result;};
 //BA.debugLineNum = 1828;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False || _orchestrationstate._isstoppedbyuser /*boolean*/  || _isplaybackflowactive()==__c.False) { 
if (true) return _result;};
 //BA.debugLineNum = 1829;BA.debugLine="If ShouldTriggerBreakNow Then";
if (_shouldtriggerbreaknow()) { 
 //BA.debugLineNum = 1830;BA.debugLine="result.Put(\"action\", \"trigger_break\")";
_result.Put((Object)("action"),(Object)("trigger_break"));
 //BA.debugLineNum = 1831;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1833;BA.debugLine="If ShouldPrefetchImmediatelyWhenPreparedMissing T";
if (_shouldprefetchimmediatelywhenpreparedmissing()) { 
 //BA.debugLineNum = 1834;BA.debugLine="result.Put(\"action\", \"prefetch_next\")";
_result.Put((Object)("action"),(Object)("prefetch_next"));
 //BA.debugLineNum = 1835;BA.debugLine="result.Put(\"reason\", \"prepared_missing\")";
_result.Put((Object)("reason"),(Object)("prepared_missing"));
 //BA.debugLineNum = 1836;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1841;BA.debugLine="If ShouldHoldPreparedForQueuedItem Then Return re";
if (_shouldholdpreparedforqueueditem()) { 
if (true) return _result;};
 //BA.debugLineNum = 1842;BA.debugLine="Dim remain As Long = result.GetDefault(\"remainMs\"";
_remain = BA.ObjectToLongNumber(_result.GetDefault((Object)("remainMs"),(Object)(0)));
 //BA.debugLineNum = 1843;BA.debugLine="If CanCrossfadePreparedItem And remain > 0 And re";
if (_cancrossfadeprepareditem() && _remain>0 && _remain<=_track_overlap_ms) { 
 //BA.debugLineNum = 1844;BA.debugLine="result.Put(\"action\", \"crossfade_prepared_track\")";
_result.Put((Object)("action"),(Object)("crossfade_prepared_track"));
 //BA.debugLineNum = 1845;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1847;BA.debugLine="If CanStartPreparedOnTrackTail And remain > 0 And";
if (_canstartpreparedontracktail() && _remain>0 && _remain<=_ad_tail_overlap_ms) { 
 //BA.debugLineNum = 1848;BA.debugLine="result.Put(\"action\", \"start_prepared_tail\")";
_result.Put((Object)("action"),(Object)("start_prepared_tail"));
 //BA.debugLineNum = 1849;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1851;BA.debugLine="If ShouldAdvanceAtTransitionBoundary(remain) Then";
if (_shouldadvanceattransitionboundary(_remain)) { 
 //BA.debugLineNum = 1852;BA.debugLine="result.Put(\"action\", \"advance_boundary\")";
_result.Put((Object)("action"),(Object)("advance_boundary"));
 //BA.debugLineNum = 1853;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1855;BA.debugLine="If remain > 0 And remain <= PREFETCH_SECONDS * 10";
if (_remain>0 && _remain<=_prefetch_seconds*1000 && _canprefetchnextnow(__c.False)) { 
 //BA.debugLineNum = 1856;BA.debugLine="result.Put(\"action\", \"prefetch_next\")";
_result.Put((Object)("action"),(Object)("prefetch_next"));
 //BA.debugLineNum = 1857;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 1859;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1860;BA.debugLine="End Sub";
return null;
}
public double  _resolveplayerlevelfactor() throws Exception{
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
double _playerlevel = 0;
 //BA.debugLineNum = 4649;BA.debugLine="Private Sub ResolvePlayerLevelFactor As Double";
 //BA.debugLineNum = 4650;BA.debugLine="Dim playerData As Map = stateStore.OfflineData.Ge";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ().GetDefault((Object)("player"),(Object)(_createinitializedmap().getObject()))));
 //BA.debugLineNum = 4651;BA.debugLine="Dim playerLevel As Double = playerData.GetDefault";
_playerlevel = (double)(BA.ObjectToNumber(_playerdata.GetDefault((Object)("level"),(Object)(100))));
 //BA.debugLineNum = 4652;BA.debugLine="Return PlayerLevelToFactor(playerLevel)";
if (true) return _playerleveltofactor(_playerlevel);
 //BA.debugLineNum = 4653;BA.debugLine="End Sub";
return 0;
}
public String  _resolvescheduledbreakat() throws Exception{
Object _itemobj = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
 //BA.debugLineNum = 3432;BA.debugLine="Private Sub ResolveScheduledBreakAt";
 //BA.debugLineNum = 3433;BA.debugLine="scheduledBreakAt = -1";
_scheduledbreakat = (long) (-1);
 //BA.debugLineNum = 3434;BA.debugLine="If playQueue.IsInitialized = False Then";
if (_playqueue.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 3435;BA.debugLine="TraceLog(\"брейк exact sync value=\" & scheduledBr";
_tracelog("брейк exact sync value="+BA.NumberToString(_scheduledbreakat)+" queue=0");
 //BA.debugLineNum = 3436;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3438;BA.debugLine="For Each itemObj As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group6 = _playqueue;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobj = group6.Get(index6);
 //BA.debugLineNum = 3439;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
 //BA.debugLineNum = 3440;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
 //BA.debugLineNum = 3441;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && (_item.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True)) && _item.ContainsKey((Object)("at"))) { 
 //BA.debugLineNum = 3442;BA.debugLine="scheduledBreakAt = ToLongDefault(item.Get(\"at\"";
_scheduledbreakat = _tolongdefault(_item.Get((Object)("at")),(long) (-1));
 //BA.debugLineNum = 3443;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 3447;BA.debugLine="TraceLog(\"брейк exact sync value=\" & scheduledBre";
_tracelog("брейк exact sync value="+BA.NumberToString(_scheduledbreakat)+" queue="+BA.NumberToString(_playqueue.getSize()));
 //BA.debugLineNum = 3448;BA.debugLine="End Sub";
return "";
}
public int  _resolvestartfadeinms() throws Exception{
 //BA.debugLineNum = 3879;BA.debugLine="Private Sub ResolveStartFadeInMs As Int";
 //BA.debugLineNum = 3880;BA.debugLine="If initialStartFadePending = False Then Return 0";
if (_initialstartfadepending==__c.False) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3881;BA.debugLine="If Transition_GetDirectorActiveAudioKey <> \"\" The";
if ((_transition_getdirectoractiveaudiokey()).equals("") == false) { 
if (true) return (int) (0);};
 //BA.debugLineNum = 3882;BA.debugLine="initialStartFadePending = False";
_initialstartfadepending = __c.False;
 //BA.debugLineNum = 3883;BA.debugLine="Return START_FADE_MS";
if (true) return _start_fade_ms;
 //BA.debugLineNum = 3884;BA.debugLine="End Sub";
return 0;
}
public String  _resolvetotaldiskmbtext() throws Exception{
 //BA.debugLineNum = 4216;BA.debugLine="Private Sub ResolveTotalDiskMbText As String";
 //BA.debugLineNum = 4217;BA.debugLine="Return PlatformBridge.ResolveTotalDiskMbText(stor";
if (true) return _platformbridge._resolvetotaldiskmbtext /*String*/ (ba,_storagedir);
 //BA.debugLineNum = 4218;BA.debugLine="End Sub";
return "";
}
public String  _resolvetotalrammbtext() throws Exception{
 //BA.debugLineNum = 4212;BA.debugLine="Private Sub ResolveTotalRamMbText As String";
 //BA.debugLineNum = 4213;BA.debugLine="Return PlatformBridge.ResolveTotalRamMbText";
if (true) return _platformbridge._resolvetotalrammbtext /*String*/ (ba);
 //BA.debugLineNum = 4214;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackcachefilecounttext() throws Exception{
 //BA.debugLineNum = 4228;BA.debugLine="Private Sub ResolveTrackCacheFileCountText As Stri";
 //BA.debugLineNum = 4229;BA.debugLine="Return \"\" & mediaCacheService.GetCachedTrackCount";
if (true) return ""+BA.NumberToString(_mediacacheservice._getcachedtrackcount /*int*/ ());
 //BA.debugLineNum = 4230;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackcachesizembtext() throws Exception{
 //BA.debugLineNum = 4220;BA.debugLine="Private Sub ResolveTrackCacheSizeMbText As String";
 //BA.debugLineNum = 4221;BA.debugLine="Return \"\" & Floor(mediaCacheService.GetCachedTrac";
if (true) return ""+BA.NumberToString(__c.Floor(_mediacacheservice._getcachedtrackbytes /*long*/ ()/(double)1024/(double)1024));
 //BA.debugLineNum = 4222;BA.debugLine="End Sub";
return "";
}
public String  _restorewindowstate() throws Exception{
 //BA.debugLineNum = 5009;BA.debugLine="Private Sub RestoreWindowState";
 //BA.debugLineNum = 5034;BA.debugLine="End Sub";
return "";
}
public void  _resumeplaybackafterpolicypause() throws Exception{
ResumableSub_ResumePlaybackAfterPolicyPause rsub = new ResumableSub_ResumePlaybackAfterPolicyPause(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ResumePlaybackAfterPolicyPause extends BA.ResumableSub {
public ResumableSub_ResumePlaybackAfterPolicyPause(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1314;BA.debugLine="Wait For (Facade_ResumePlaybackAfterPolicyPauseCo";
parent.__c.WaitFor("complete", ba, this, parent._facade_resumeplaybackafterpolicypausecore());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1315;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _retrytimer_tick() throws Exception{
ResumableSub_RetryTimer_Tick rsub = new ResumableSub_RetryTimer_Tick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RetryTimer_Tick extends BA.ResumableSub {
public ResumableSub_RetryTimer_Tick(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _recovered = false;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3405;BA.debugLine="retryTimer.Enabled = False";
parent._retrytimer.setEnabled(parent.__c.False);
 //BA.debugLineNum = 3406;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 3407;BA.debugLine="If stateStore.GetLastRetryMode = \"audio_device\" T";
if (true) break;

case 7:
//if
this.state = 14;
if ((parent._statestore._getlastretrymode /*String*/ ()).equals("audio_device")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3408;BA.debugLine="Wait For (ProbeAudioOutputRecovery) Complete (re";
parent.__c.WaitFor("complete", ba, this, parent._probeaudiooutputrecovery());
this.state = 20;
return;
case 20:
//C
this.state = 10;
_recovered = (Boolean) result[0];
;
 //BA.debugLineNum = 3409;BA.debugLine="If recovered = False And orchestrationState.IsSt";
if (true) break;

case 10:
//if
this.state = 13;
if (_recovered==parent.__c.False && parent._orchestrationstate._isstarted /*boolean*/  && parent._orchestrationstate._isstoppedbyuser /*boolean*/ ==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 3410;BA.debugLine="ScheduleRetry(\"audio_device\", AUDIO_OUTPUT_RETR";
parent._scheduleretry("audio_device",parent._audio_output_retry_delay_ms);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 3412;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 3414;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy Then";

case 14:
//if
this.state = 19;
if (parent._datapolicystate._isplaybackpausedbypolicy /*boolean*/ ) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) return ;
if (true) break;

case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 3415;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, this, parent._loadnextandplay());
this.state = 21;
return;
case 21:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 3416;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _runaudiotimeupdateasync(String _audiokey) throws Exception{
ResumableSub_RunAudioTimeupdateAsync rsub = new ResumableSub_RunAudioTimeupdateAsync(this,_audiokey);
rsub.resume(ba, null);
}
public static class ResumableSub_RunAudioTimeupdateAsync extends BA.ResumableSub {
public ResumableSub_RunAudioTimeupdateAsync(b4a.example.b4xmainpage parent,String _audiokey) {
this.parent = parent;
this._audiokey = _audiokey;
}
b4a.example.b4xmainpage parent;
String _audiokey;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 3958;BA.debugLine="Wait For (HandleAudioTimeupdate(audioKey)) Comple";
parent.__c.WaitFor("complete", ba, this, parent._handleaudiotimeupdate(_audiokey));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 3959;BA.debugLine="audioTimeupdateQueuedByKey.Remove(audioKey)";
parent._audiotimeupdatequeuedbykey.Remove((Object)(_audiokey));
 //BA.debugLineNum = 3960;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _rundeferredpoststarttasks() throws Exception{
 //BA.debugLineNum = 1171;BA.debugLine="Private Sub RunDeferredPostStartTasks";
 //BA.debugLineNum = 1172;BA.debugLine="If isAdWarmupDeferredAfterStartup = False And isP";
if (_isadwarmupdeferredafterstartup==__c.False && _ispoststarttasksdeferredafterstartup==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1173;BA.debugLine="If CanRunDeferredPostStartTasks = False Then";
if (_canrundeferredpoststarttasks()==__c.False) { 
 //BA.debugLineNum = 1174;BA.debugLine="CancelDeferredPostStartTasks";
_canceldeferredpoststarttasks();
 //BA.debugLineNum = 1175;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1177;BA.debugLine="If isAdWarmupDeferredAfterStartup Then";
if (_isadwarmupdeferredafterstartup) { 
 //BA.debugLineNum = 1178;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
_isadwarmupdeferredafterstartup = __c.False;
 //BA.debugLineNum = 1179;BA.debugLine="EnsureAdCacheSyncAsync";
_ensureadcachesyncasync();
 };
 //BA.debugLineNum = 1181;BA.debugLine="If isPostStartTasksDeferredAfterStartup Then";
if (_ispoststarttasksdeferredafterstartup) { 
 //BA.debugLineNum = 1182;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
_ispoststarttasksdeferredafterstartup = __c.False;
 };
 //BA.debugLineNum = 1184;BA.debugLine="End Sub";
return "";
}
public String  _rundeferredpoststarttasksasync() throws Exception{
 //BA.debugLineNum = 1186;BA.debugLine="Private Sub RunDeferredPostStartTasksAsync";
 //BA.debugLineNum = 1187;BA.debugLine="RunDeferredPostStartTasks";
_rundeferredpoststarttasks();
 //BA.debugLineNum = 1188;BA.debugLine="End Sub";
return "";
}
public void  _runhistoryflushasync() throws Exception{
ResumableSub_RunHistoryFlushAsync rsub = new ResumableSub_RunHistoryFlushAsync(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RunHistoryFlushAsync extends BA.ResumableSub {
public ResumableSub_RunHistoryFlushAsync(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 984;BA.debugLine="Wait For (FlushHistoryBuffer) Complete (unused As";
parent.__c.WaitFor("complete", ba, this, parent._flushhistorybuffer());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 985;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runplaybackdirectoradvance(String _source,boolean _allowload) throws Exception{
ResumableSub_RunPlaybackDirectorAdvance rsub = new ResumableSub_RunPlaybackDirectorAdvance(this,_source,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunPlaybackDirectorAdvance extends BA.ResumableSub {
public ResumableSub_RunPlaybackDirectorAdvance(b4a.example.b4xmainpage parent,String _source,boolean _allowload) {
this.parent = parent;
this._source = _source;
this._allowload = _allowload;
}
b4a.example.b4xmainpage parent;
String _source;
boolean _allowload;
boolean _ownsdecision = false;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2000;BA.debugLine="Dim ownsDecision As Boolean = False";
_ownsdecision = parent.__c.False;
 //BA.debugLineNum = 2001;BA.debugLine="If directorState.CurrentDecision = \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((parent._directorstate._currentdecision /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2002;BA.debugLine="If directorState.TryBeginDecision(source & \":adv";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._directorstate._trybegindecision /*boolean*/ (_source+":advance")==parent.__c.False) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 2003;BA.debugLine="ownsDecision = True";
_ownsdecision = parent.__c.True;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 2005;BA.debugLine="Wait For (DispatchPlaybackAdvance(source, allowLo";
parent.__c.WaitFor("complete", ba, this, parent._dispatchplaybackadvance(_source,_allowload));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_advanced = (Boolean) result[0];
;
 //BA.debugLineNum = 2006;BA.debugLine="If ownsDecision Then directorState.ClearDecision";
if (true) break;

case 11:
//if
this.state = 16;
if (_ownsdecision) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent._directorstate._cleardecision /*String*/ ();
if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 2007;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
 //BA.debugLineNum = 2008;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runplaybackdirectortick(String _source) throws Exception{
ResumableSub_RunPlaybackDirectorTick rsub = new ResumableSub_RunPlaybackDirectorTick(this,_source);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunPlaybackDirectorTick extends BA.ResumableSub {
public ResumableSub_RunPlaybackDirectorTick(b4a.example.b4xmainpage parent,String _source) {
this.parent = parent;
this._source = _source;
}
b4a.example.b4xmainpage parent;
String _source;
long _startedat = 0L;
boolean _handledsignals = false;
anywheresoftware.b4a.objects.collections.Map _decision = null;
String _actionname = "";
boolean _executed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1905;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 1906;BA.debugLine="If directorState.IsTickInProgress Then Return Fal";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._directorstate._istickinprogress /*boolean*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1907;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._orchestrationstate._isstarted /*boolean*/ ==parent.__c.False || parent._orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 1908;BA.debugLine="directorState.IsTickInProgress = True";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 1909;BA.debugLine="Wait For (ProcessDirectorSignalStates) Complete (";
parent.__c.WaitFor("complete", ba, this, parent._processdirectorsignalstates());
this.state = 30;
return;
case 30:
//C
this.state = 13;
_handledsignals = (Boolean) result[0];
;
 //BA.debugLineNum = 1910;BA.debugLine="If handledSignals Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_handledsignals) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 1911;BA.debugLine="directorState.IsTickInProgress = False";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 1912;BA.debugLine="LogSlowMainOperation(\"director_tick:\" & source,";
parent._logslowmainoperation("director_tick:"+_source,_startedat);
 //BA.debugLineNum = 1913;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 1915;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";

case 16:
//if
this.state = 19;
if ((parent._transition_getdirectoractiveaudiokey()).equals("")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1916;BA.debugLine="directorState.IsTickInProgress = False";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 1917;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 1919;BA.debugLine="If IsPlaybackFlowActive = False Then";

case 19:
//if
this.state = 22;
if (parent._isplaybackflowactive()==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 1920;BA.debugLine="directorState.IsTickInProgress = False";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 1921;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 1923;BA.debugLine="RecoverStaleDirectorSlots";
parent._recoverstaledirectorslots();
 //BA.debugLineNum = 1924;BA.debugLine="Dim decision As Map = ResolvePlaybackTickDecision";
_decision = new anywheresoftware.b4a.objects.collections.Map();
_decision = parent._resolveplaybacktickdecision();
 //BA.debugLineNum = 1925;BA.debugLine="Dim actionName As String = decision.GetDefault(\"a";
_actionname = BA.ObjectToString(_decision.GetDefault((Object)("action"),(Object)("")));
 //BA.debugLineNum = 1926;BA.debugLine="If actionName = \"\" Then";
if (true) break;

case 23:
//if
this.state = 26;
if ((_actionname).equals("")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 1927;BA.debugLine="directorState.IsTickInProgress = False";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 1928;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 1930;BA.debugLine="If directorState.TryBeginDecision(source & \":\" &";

case 26:
//if
this.state = 29;
if (parent._directorstate._trybegindecision /*boolean*/ (_source+":"+_actionname)==parent.__c.False) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 1931;BA.debugLine="directorState.IsTickInProgress = False";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 1932;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 1934;BA.debugLine="Wait For (ExecutePlaybackTickDecision(decision))";
parent.__c.WaitFor("complete", ba, this, parent._executeplaybacktickdecision(_decision));
this.state = 31;
return;
case 31:
//C
this.state = -1;
_executed = (Boolean) result[0];
;
 //BA.debugLineNum = 1935;BA.debugLine="directorState.ClearDecision";
parent._directorstate._cleardecision /*String*/ ();
 //BA.debugLineNum = 1936;BA.debugLine="directorState.IsTickInProgress = False";
parent._directorstate._istickinprogress /*boolean*/  = parent.__c.False;
 //BA.debugLineNum = 1937;BA.debugLine="LogSlowMainOperation(\"director_tick:\" & source, s";
parent._logslowmainoperation("director_tick:"+_source,_startedat);
 //BA.debugLineNum = 1938;BA.debugLine="Return executed";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_executed));return;};
 //BA.debugLineNum = 1939;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _runplaybackdirectortimerasync(String _source) throws Exception{
ResumableSub_RunPlaybackDirectorTimerAsync rsub = new ResumableSub_RunPlaybackDirectorTimerAsync(this,_source);
rsub.resume(ba, null);
}
public static class ResumableSub_RunPlaybackDirectorTimerAsync extends BA.ResumableSub {
public ResumableSub_RunPlaybackDirectorTimerAsync(b4a.example.b4xmainpage parent,String _source) {
this.parent = parent;
this._source = _source;
}
b4a.example.b4xmainpage parent;
String _source;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3976;BA.debugLine="Wait For (RunPlaybackDirectorTick(source)) Comple";
parent.__c.WaitFor("complete", ba, this, parent._runplaybackdirectortick(_source));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 3977;BA.debugLine="isPlaybackDirectorTickQueued = False";
parent._isplaybackdirectortickqueued = parent.__c.False;
 //BA.debugLineNum = 3978;BA.debugLine="If isPlaybackDirectorRetickRequested Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._isplaybackdirectorretickrequested) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3979;BA.debugLine="isPlaybackDirectorRetickRequested = False";
parent._isplaybackdirectorretickrequested = parent.__c.False;
 //BA.debugLineNum = 3980;BA.debugLine="QueuePlaybackDirectorSignalTick(\"retick:\" & sour";
parent._queueplaybackdirectorsignaltick("retick:"+_source);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 3982;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runplaybackwatchdogtick() throws Exception{
ResumableSub_RunPlaybackWatchdogTick rsub = new ResumableSub_RunPlaybackWatchdogTick(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunPlaybackWatchdogTick extends BA.ResumableSub {
public ResumableSub_RunPlaybackWatchdogTick(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
long _nowticks = 0L;
String _currenttrackid = "";
long _currentpositionms = 0L;
long _expectedactivationtoken = 0L;
boolean _recovered = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2144;BA.debugLine="If ShouldWatchPlaybackProgress = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._shouldwatchplaybackprogress()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2145;BA.debugLine="ResetPlaybackWatchdogState";
parent._resetplaybackwatchdogstate();
 //BA.debugLineNum = 2146;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 2148;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 2149;BA.debugLine="Dim currentTrackId As String = ActiveTrackIdForWa";
_currenttrackid = parent._activetrackidforwatchdog();
 //BA.debugLineNum = 2150;BA.debugLine="Dim currentPositionMs As Long = ActivePlaybackPos";
_currentpositionms = parent._activeplaybackpositionms();
 //BA.debugLineNum = 2151;BA.debugLine="Dim expectedActivationToken As Long = playbackAct";
_expectedactivationtoken = parent._playbackactivationtoken;
 //BA.debugLineNum = 2152;BA.debugLine="If HasObservableActivePlayback = False And lastPl";
if (true) break;

case 5:
//if
this.state = 10;
if (parent._hasobservableactiveplayback()==parent.__c.False && parent._lastplaybackwatchdogprogressat==0) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 2153;BA.debugLine="If lastPlaybackWatchdogProgressAt = 0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent._lastplaybackwatchdogprogressat==0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 2154;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
parent._markplaybackwatchdogprogress(_currenttrackid,_currentpositionms);
 //BA.debugLineNum = 2155;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2157;BA.debugLine="If currentTrackId <> \"\" And currentTrackId <> las";

case 14:
//if
this.state = 17;
if ((_currenttrackid).equals("") == false && (_currenttrackid).equals(parent._lastplaybackwatchdogtrackid) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 2158;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
parent._markplaybackwatchdogprogress(_currenttrackid,_currentpositionms);
 //BA.debugLineNum = 2159;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2161;BA.debugLine="If currentPositionMs >= 0 And currentPositionMs >";

case 17:
//if
this.state = 20;
if (_currentpositionms>=0 && _currentpositionms>parent._lastplaybackwatchdogpositionms+parent._playback_watchdog_progress_delta_ms) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 2162;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
parent._markplaybackwatchdogprogress(_currenttrackid,_currentpositionms);
 //BA.debugLineNum = 2163;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
 //BA.debugLineNum = 2165;BA.debugLine="If nowTicks - lastPlaybackWatchdogRecoveryAt < PL";

case 20:
//if
this.state = 25;
if (_nowticks-parent._lastplaybackwatchdogrecoveryat<parent._playback_watchdog_grace_ms) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 25:
//C
this.state = 26;
;
 //BA.debugLineNum = 2166;BA.debugLine="If nowTicks - lastPlaybackWatchdogProgressAt < PL";
if (true) break;

case 26:
//if
this.state = 31;
if (_nowticks-parent._lastplaybackwatchdogprogressat<parent._playback_watchdog_stall_ms) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 2167;BA.debugLine="Wait For (RecoverFromPlaybackStall(currentTrackId";
parent.__c.WaitFor("complete", ba, this, parent._recoverfromplaybackstall(_currenttrackid,_currentpositionms,_expectedactivationtoken));
this.state = 36;
return;
case 36:
//C
this.state = 32;
_recovered = (Boolean) result[0];
;
 //BA.debugLineNum = 2168;BA.debugLine="If recovered Then";
if (true) break;

case 32:
//if
this.state = 35;
if (_recovered) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 2169;BA.debugLine="lastPlaybackWatchdogRecoveryAt = DateTime.Now";
parent._lastplaybackwatchdogrecoveryat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 2170;BA.debugLine="MarkPlaybackWatchdogProgress(ActiveTrackIdForWat";
parent._markplaybackwatchdogprogress(parent._activetrackidforwatchdog(),parent._activeplaybackpositionms());
 if (true) break;

case 35:
//C
this.state = -1;
;
 //BA.debugLineNum = 2172;BA.debugLine="Return recovered";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_recovered));return;};
 //BA.debugLineNum = 2173;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _savedownloadedupdatetofile(b4a.example.httpjob _j) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _instream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
long _contentlength = 0L;
long _savedsize = 0L;
 //BA.debugLineNum = 423;BA.debugLine="Private Sub SaveDownloadedUpdateToFile(j As HttpJo";
 //BA.debugLineNum = 424;BA.debugLine="If File.Exists(appUpdateDir, APP_UPDATE_TEMP_FILE";
if (__c.File.Exists(_appupdatedir,_app_update_temp_file)) { 
__c.File.Delete(_appupdatedir,_app_update_temp_file);};
 //BA.debugLineNum = 425;BA.debugLine="If File.Exists(appUpdateDir, APP_UPDATE_FILE) The";
if (__c.File.Exists(_appupdatedir,_app_update_file)) { 
__c.File.Delete(_appupdatedir,_app_update_file);};
 //BA.debugLineNum = 426;BA.debugLine="Dim inStream As InputStream = j.GetInputStream";
_instream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_instream = _j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ();
 //BA.debugLineNum = 427;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput(a";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = __c.File.OpenOutput(_appupdatedir,_app_update_temp_file,__c.False);
 //BA.debugLineNum = 428;BA.debugLine="File.Copy2(inStream, outStream)";
__c.File.Copy2((java.io.InputStream)(_instream.getObject()),(java.io.OutputStream)(_outstream.getObject()));
 //BA.debugLineNum = 429;BA.debugLine="outStream.Close";
_outstream.Close();
 //BA.debugLineNum = 430;BA.debugLine="inStream.Close";
_instream.Close();
 //BA.debugLineNum = 431;BA.debugLine="Dim contentLength As Long = ExtractContentLength(";
_contentlength = _extractcontentlength(_j);
 //BA.debugLineNum = 432;BA.debugLine="Dim savedSize As Long = File.Size(appUpdateDir, A";
_savedsize = __c.File.Size(_appupdatedir,_app_update_temp_file);
 //BA.debugLineNum = 433;BA.debugLine="If savedSize <= 0 Then";
if (_savedsize<=0) { 
 //BA.debugLineNum = 434;BA.debugLine="File.Delete(appUpdateDir, APP_UPDATE_TEMP_FILE)";
__c.File.Delete(_appupdatedir,_app_update_temp_file);
 //BA.debugLineNum = 435;BA.debugLine="TraceWarn(\"update\", \"обновление отклонено\", \"rea";
_tracewarn("update","обновление отклонено","reason=empty_file");
 //BA.debugLineNum = 436;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 438;BA.debugLine="If contentLength > 0 And savedSize <> contentLeng";
if (_contentlength>0 && _savedsize!=_contentlength) { 
 //BA.debugLineNum = 439;BA.debugLine="File.Delete(appUpdateDir, APP_UPDATE_TEMP_FILE)";
__c.File.Delete(_appupdatedir,_app_update_temp_file);
 //BA.debugLineNum = 440;BA.debugLine="TraceWarn(\"update\", \"обновление отклонено\", \"rea";
_tracewarn("update","обновление отклонено","reason=size_mismatch expected="+BA.NumberToString(_contentlength)+" actual="+BA.NumberToString(_savedsize));
 //BA.debugLineNum = 441;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 443;BA.debugLine="File.Copy(appUpdateDir, APP_UPDATE_TEMP_FILE, app";
__c.File.Copy(_appupdatedir,_app_update_temp_file,_appupdatedir,_app_update_file);
 //BA.debugLineNum = 444;BA.debugLine="File.Delete(appUpdateDir, APP_UPDATE_TEMP_FILE)";
__c.File.Delete(_appupdatedir,_app_update_temp_file);
 //BA.debugLineNum = 445;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return false;
}
public String  _saveserversnapshot(String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
 //BA.debugLineNum = 4314;BA.debugLine="Private Sub SaveServerSnapshot(method As String, u";
 //BA.debugLineNum = 4315;BA.debugLine="appTraceService.SaveServerSnapshot(method, url, s";
_apptraceservice._saveserversnapshot /*String*/ (_method,_url,_success,_body,_errormessage);
 //BA.debugLineNum = 4316;BA.debugLine="End Sub";
return "";
}
public String  _savevalue(String _key,Object _value) throws Exception{
 //BA.debugLineNum = 4874;BA.debugLine="Private Sub SaveValue(key As String, value As Obje";
 //BA.debugLineNum = 4875;BA.debugLine="storage.Put(key, value)";
_storage._put /*String*/ (_key,_value);
 //BA.debugLineNum = 4876;BA.debugLine="End Sub";
return "";
}
public String  _savewindowstate() throws Exception{
 //BA.debugLineNum = 4990;BA.debugLine="Public Sub SaveWindowState";
 //BA.debugLineNum = 5007;BA.debugLine="End Sub";
return "";
}
public int  _scalevalue(int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
 //BA.debugLineNum = 5445;BA.debugLine="Private Sub ScaleValue(availableWidth As Int, smal";
 //BA.debugLineNum = 5446;BA.debugLine="Return UiStyle.ScaleValue(availableWidth, smallVa";
if (true) return _uistyle._scalevalue /*int*/ (ba,_availablewidth,_smallvalue,_mediumvalue,_largevalue);
 //BA.debugLineNum = 5447;BA.debugLine="End Sub";
return 0;
}
public String  _scanlocaladsfortimestamp(long _targetminutetimestamp,boolean _force) throws Exception{
boolean _allowregularads = false;
 //BA.debugLineNum = 3189;BA.debugLine="Private Sub ScanLocalAdsForTimestamp(targetMinuteT";
 //BA.debugLineNum = 3190;BA.debugLine="Dim allowRegularAds As Boolean = AllowRegularAdsA";
_allowregularads = _allowregularadsattargetminute(_targetminutetimestamp);
 //BA.debugLineNum = 3191;BA.debugLine="If localAdScheduler.ScanTargetMinute(stateStore.O";
if (_localadscheduler._scantargetminute /*boolean*/ (_statestore._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (),_playqueue,_targetminutetimestamp,_force,_allowregularads)) { 
 //BA.debugLineNum = 3192;BA.debugLine="PruneQueuedBreakItemsByLocalCache";
_prunequeuedbreakitemsbylocalcache();
 //BA.debugLineNum = 3193;BA.debugLine="SyncExactBreakState";
_syncexactbreakstate();
 //BA.debugLineNum = 3194;BA.debugLine="RefreshPreparedItemAfterQueueMutation";
_refreshprepareditemafterqueuemutation();
 };
 //BA.debugLineNum = 3196;BA.debugLine="End Sub";
return "";
}
public String  _schedulebreakwatch() throws Exception{
long _delay = 0L;
 //BA.debugLineNum = 3455;BA.debugLine="Private Sub ScheduleBreakWatch";
 //BA.debugLineNum = 3457;BA.debugLine="ServiceCancelPlaybackBreak";
_servicecancelplaybackbreak();
 //BA.debugLineNum = 3461;BA.debugLine="If HasPendingExactBreak = False Then Return";
if (_haspendingexactbreak()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 3462;BA.debugLine="Dim delay As Long = Max(1, ((scheduledBreakAt - L";
_delay = (long) (__c.Max(1,((_scheduledbreakat-_localnowtimestamp())*1000)-250));
 //BA.debugLineNum = 3464;BA.debugLine="ServiceSchedulePlaybackBreak(delay)";
_servicescheduleplaybackbreak(_delay);
 //BA.debugLineNum = 3469;BA.debugLine="End Sub";
return "";
}
public String  _schedulecacheauditafter(int _delayms) throws Exception{
 //BA.debugLineNum = 962;BA.debugLine="Private Sub ScheduleCacheAuditAfter(delayMs As Int";
 //BA.debugLineNum = 964;BA.debugLine="ServiceScheduleCacheAudit(delayMs)";
_serviceschedulecacheaudit(_delayms);
 //BA.debugLineNum = 969;BA.debugLine="End Sub";
return "";
}
public String  _schedulehistorylog(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemtype = "";
 //BA.debugLineNum = 3554;BA.debugLine="Private Sub ScheduleHistoryLog(item As Map)";
 //BA.debugLineNum = 3555;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 3556;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 3557;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
if (true) return "";};
 //BA.debugLineNum = 3558;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
 //BA.debugLineNum = 3559;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 3560;BA.debugLine="TraceLog(\"история confirm reason=playback_start";
_tracelog("история confirm reason=playback_start item="+_describeitem((Object)(_item.getObject())));
 //BA.debugLineNum = 3561;BA.debugLine="QueueHistoryRecordAt(item, DateTime.Now)";
_queuehistoryrecordat(_item,__c.DateTime.getNow());
 //BA.debugLineNum = 3562;BA.debugLine="ClearHistoryLogTimer";
_clearhistorylogtimer();
 //BA.debugLineNum = 3563;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3565;BA.debugLine="TraceLog(\"история stage mode=ad_complete item=\" &";
_tracelog("история stage mode=ad_complete item="+_describeitem((Object)(_item.getObject())));
 //BA.debugLineNum = 3566;BA.debugLine="ClearHistoryLogTimer";
_clearhistorylogtimer();
 //BA.debugLineNum = 3567;BA.debugLine="metaState.StageHistoryItem(item, DateTime.Now)";
_metastate._stagehistoryitem /*String*/ (_item,__c.DateTime.getNow());
 //BA.debugLineNum = 3568;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(String _mode,int _delayms) throws Exception{
 //BA.debugLineNum = 3399;BA.debugLine="Private Sub ScheduleRetry(mode As String, delayMs";
 //BA.debugLineNum = 3400;BA.debugLine="If LOCAL_PLAYBACK_ONLY And mode <> \"audio_device\"";
if (_local_playback_only && (_mode).equals("audio_device") == false) { 
if (true) return "";};
 //BA.debugLineNum = 3401;BA.debugLine="playerDataCoordinator.ScheduleRetry(mode, delayMs";
_playerdatacoordinator._scheduleretry /*String*/ (_mode,_delayms,_local_retry_delay_max,_server_retry_delay_max,_blocked_retry_delay);
 //BA.debugLineNum = 3402;BA.debugLine="End Sub";
return "";
}
public String  _secondsagotext(long _ticksvalue) throws Exception{
 //BA.debugLineNum = 4293;BA.debugLine="Private Sub SecondsAgoText(ticksValue As Long) As";
 //BA.debugLineNum = 4294;BA.debugLine="If ticksValue <= 0 Then Return \"unknown\"";
if (_ticksvalue<=0) { 
if (true) return "unknown";};
 //BA.debugLineNum = 4295;BA.debugLine="Return \"\" & Max(0, Floor((DateTime.Now - ticksVal";
if (true) return ""+BA.NumberToString(__c.Max(0,__c.Floor((__c.DateTime.getNow()-_ticksvalue)/(double)1000)));
 //BA.debugLineNum = 4296;BA.debugLine="End Sub";
return "";
}
public String  _servicecancelcacheaudit() throws Exception{
 //BA.debugLineNum = 5361;BA.debugLine="Private Sub ServiceCancelCacheAudit";
 //BA.debugLineNum = 5362;BA.debugLine="serviceBridge.CancelCacheAudit";
_servicebridge._cancelcacheaudit /*String*/ ();
 //BA.debugLineNum = 5363;BA.debugLine="End Sub";
return "";
}
public String  _servicecancelplaybackbreak() throws Exception{
 //BA.debugLineNum = 5353;BA.debugLine="Private Sub ServiceCancelPlaybackBreak";
 //BA.debugLineNum = 5354;BA.debugLine="serviceBridge.CancelPlaybackBreak";
_servicebridge._cancelplaybackbreak /*String*/ ();
 //BA.debugLineNum = 5355;BA.debugLine="End Sub";
return "";
}
public String  _servicecheckurlvalue() throws Exception{
 //BA.debugLineNum = 5111;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
 //BA.debugLineNum = 5112;BA.debugLine="Return SERVICE_CHECK_URL";
if (true) return _service_check_url;
 //BA.debugLineNum = 5113;BA.debugLine="End Sub";
return "";
}
public String  _serviceconfigurebackgroundtimers(boolean _enablenetworktimers) throws Exception{
 //BA.debugLineNum = 5341;BA.debugLine="Private Sub ServiceConfigureBackgroundTimers(enabl";
 //BA.debugLineNum = 5342;BA.debugLine="serviceBridge.ConfigureBackgroundTimers(enableNet";
_servicebridge._configurebackgroundtimers /*String*/ (_enablenetworktimers);
 //BA.debugLineNum = 5343;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _servicegetpublishedstate() throws Exception{
 //BA.debugLineNum = 5369;BA.debugLine="Private Sub ServiceGetPublishedState As Map";
 //BA.debugLineNum = 5370;BA.debugLine="Return serviceBridge.GetPublishedState";
if (true) return _servicebridge._getpublishedstate /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 5371;BA.debugLine="End Sub";
return null;
}
public boolean  _servicehasattachedpage() throws Exception{
 //BA.debugLineNum = 5329;BA.debugLine="Private Sub ServiceHasAttachedPage As Boolean";
 //BA.debugLineNum = 5330;BA.debugLine="Return serviceBridge.HasAttachedPage";
if (true) return _servicebridge._hasattachedpage /*boolean*/ ();
 //BA.debugLineNum = 5331;BA.debugLine="End Sub";
return false;
}
public String  _serviceonpageappear() throws Exception{
 //BA.debugLineNum = 5333;BA.debugLine="Private Sub ServiceOnPageAppear";
 //BA.debugLineNum = 5334;BA.debugLine="serviceBridge.OnPageAppear(Me)";
_servicebridge._onpageappear /*String*/ (this);
 //BA.debugLineNum = 5335;BA.debugLine="End Sub";
return "";
}
public String  _serviceonpagedisappear() throws Exception{
 //BA.debugLineNum = 5337;BA.debugLine="Private Sub ServiceOnPageDisappear";
 //BA.debugLineNum = 5338;BA.debugLine="serviceBridge.OnPageDisappear(Me)";
_servicebridge._onpagedisappear /*String*/ (this);
 //BA.debugLineNum = 5339;BA.debugLine="End Sub";
return "";
}
public String  _servicepublishhoststate(anywheresoftware.b4a.objects.collections.Map _publishedstate) throws Exception{
 //BA.debugLineNum = 5365;BA.debugLine="Private Sub ServicePublishHostState(publishedState";
 //BA.debugLineNum = 5366;BA.debugLine="serviceBridge.PublishState(publishedState)";
_servicebridge._publishstate /*String*/ (_publishedstate);
 //BA.debugLineNum = 5367;BA.debugLine="End Sub";
return "";
}
public String  _serviceschedulecacheaudit(int _delayms) throws Exception{
 //BA.debugLineNum = 5357;BA.debugLine="Private Sub ServiceScheduleCacheAudit(delayMs As I";
 //BA.debugLineNum = 5358;BA.debugLine="serviceBridge.ScheduleCacheAudit(delayMs)";
_servicebridge._schedulecacheaudit /*String*/ (_delayms);
 //BA.debugLineNum = 5359;BA.debugLine="End Sub";
return "";
}
public String  _servicescheduleplaybackbreak(long _delayms) throws Exception{
 //BA.debugLineNum = 5349;BA.debugLine="Private Sub ServiceSchedulePlaybackBreak(delayMs A";
 //BA.debugLineNum = 5350;BA.debugLine="serviceBridge.SchedulePlaybackBreak(delayMs)";
_servicebridge._scheduleplaybackbreak /*String*/ (_delayms);
 //BA.debugLineNum = 5351;BA.debugLine="End Sub";
return "";
}
public String  _servicestopbackgroundtimers() throws Exception{
 //BA.debugLineNum = 5345;BA.debugLine="Private Sub ServiceStopBackgroundTimers";
 //BA.debugLineNum = 5346;BA.debugLine="serviceBridge.StopBackgroundTimers";
_servicebridge._stopbackgroundtimers /*String*/ ();
 //BA.debugLineNum = 5347;BA.debugLine="End Sub";
return "";
}
public String  _setpanestyle(anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
 //BA.debugLineNum = 5437;BA.debugLine="Private Sub SetPaneStyle(view As B4XView, style As";
 //BA.debugLineNum = 5438;BA.debugLine="UiStyle.SetPaneStyle(view, style)";
_uistyle._setpanestyle /*String*/ (ba,_view,_style);
 //BA.debugLineNum = 5439;BA.debugLine="End Sub";
return "";
}
public String  _setpickonbounds(anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
 //BA.debugLineNum = 5441;BA.debugLine="Private Sub SetPickOnBounds(view As B4XView, value";
 //BA.debugLineNum = 5442;BA.debugLine="UiStyle.SetPickOnBounds(view, value)";
_uistyle._setpickonbounds /*String*/ (ba,_view,_value);
 //BA.debugLineNum = 5443;BA.debugLine="End Sub";
return "";
}
public String  _setplaybackflowstate(String _newstate,String _reason) throws Exception{
 //BA.debugLineNum = 2238;BA.debugLine="Private Sub SetPlaybackFlowState(newState As Strin";
 //BA.debugLineNum = 2239;BA.debugLine="If newState = \"\" Then newState = FLOW_IDLE";
if ((_newstate).equals("")) { 
_newstate = _flow_idle;};
 //BA.debugLineNum = 2240;BA.debugLine="If playbackFlowState = newState Then Return";
if ((_playbackflowstate).equals(_newstate)) { 
if (true) return "";};
 //BA.debugLineNum = 2241;BA.debugLine="TraceLog(\"flow переход from=\" & playbackFlowState";
_tracelog("flow переход from="+_playbackflowstate+" to="+_newstate+" reason="+_reason);
 //BA.debugLineNum = 2242;BA.debugLine="playbackFlowState = newState";
_playbackflowstate = _newstate;
 //BA.debugLineNum = 2243;BA.debugLine="If directorState.IsInitialized Then directorState";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
_directorstate._setflowstate /*String*/ (_newstate);};
 //BA.debugLineNum = 2244;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 2245;BA.debugLine="End Sub";
return "";
}
public String  _setplayercodeprompttext(String _value) throws Exception{
 //BA.debugLineNum = 4866;BA.debugLine="Private Sub SetPlayerCodePromptText(value As Strin";
 //BA.debugLineNum = 4870;BA.debugLine="txtPlayerCode.Hint = value";
_txtplayercode.setHint(_value);
 //BA.debugLineNum = 4872;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon() throws Exception{
 //BA.debugLineNum = 4336;BA.debugLine="Private Sub SetPlayIcon";
 //BA.debugLineNum = 4337;BA.debugLine="If uiControllerReady = False Then";
if (_uicontrollerready==__c.False) { 
 //BA.debugLineNum = 4338;BA.debugLine="lblPlayIcon.Text = ICON_PLAY";
_lblplayicon.setText(BA.ObjectToCharSequence(_icon_play));
 //BA.debugLineNum = 4339;BA.debugLine="orbitTimer.Enabled = False";
_orbittimer.setEnabled(__c.False);
 //BA.debugLineNum = 4340;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4341;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4343;BA.debugLine="uiController.SetPlayIcon";
_uicontroller._setplayicon /*String*/ ();
 //BA.debugLineNum = 4344;BA.debugLine="If uiController.IsOrbitIdle Then";
if (_uicontroller._isorbitidle /*boolean*/ ()) { 
 //BA.debugLineNum = 4345;BA.debugLine="orbitTimer.Enabled = False";
_orbittimer.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 4347;BA.debugLine="orbitTimer.Enabled = True";
_orbittimer.setEnabled(__c.True);
 };
 //BA.debugLineNum = 4349;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4350;BA.debugLine="End Sub";
return "";
}
public String  _setstopicon() throws Exception{
 //BA.debugLineNum = 4352;BA.debugLine="Private Sub SetStopIcon";
 //BA.debugLineNum = 4353;BA.debugLine="If uiControllerReady = False Then";
if (_uicontrollerready==__c.False) { 
 //BA.debugLineNum = 4354;BA.debugLine="lblPlayIcon.Text = ICON_STOP";
_lblplayicon.setText(BA.ObjectToCharSequence(_icon_stop));
 //BA.debugLineNum = 4355;BA.debugLine="orbitPulseStep = 0";
_orbitpulsestep = (int) (0);
 //BA.debugLineNum = 4356;BA.debugLine="orbitTimer.Enabled = True";
_orbittimer.setEnabled(__c.True);
 //BA.debugLineNum = 4357;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4358;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4360;BA.debugLine="uiController.SetStopIcon";
_uicontroller._setstopicon /*String*/ ();
 //BA.debugLineNum = 4361;BA.debugLine="orbitPulseStep = 0";
_orbitpulsestep = (int) (0);
 //BA.debugLineNum = 4362;BA.debugLine="orbitTimer.Enabled = True";
_orbittimer.setEnabled(__c.True);
 //BA.debugLineNum = 4363;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4364;BA.debugLine="End Sub";
return "";
}
public Object  _shiftdispatchablequeueitem() throws Exception{
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemtype = "";
long _breakat = 0L;
 //BA.debugLineNum = 4673;BA.debugLine="Private Sub ShiftDispatchableQueueItem As Object";
 //BA.debugLineNum = 4674;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 4675;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_playqueue.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 4676;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = _playqueue.Get(_i);
 //BA.debugLineNum = 4677;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 4678;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
 //BA.debugLineNum = 4679;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4680;BA.debugLine="If itemType = \"break\" Then";
if ((_itemtype).equals("break")) { 
 //BA.debugLineNum = 4681;BA.debugLine="Dim breakAt As Long = ToLongDefault(item.GetDef";
_breakat = _tolongdefault(_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
 //BA.debugLineNum = 4682;BA.debugLine="If breakAt > LocalNowTimestamp Then Continue";
if (_breakat>_localnowtimestamp()) { 
if (true) continue;};
 //BA.debugLineNum = 4683;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 //BA.debugLineNum = 4684;BA.debugLine="Return item";
if (true) return (Object)(_item.getObject());
 };
 //BA.debugLineNum = 4686;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
 //BA.debugLineNum = 4687;BA.debugLine="If mediaCacheService.IsTrackCached(item.GetDefa";
if (_mediacacheservice._istrackcached /*boolean*/ (BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
 //BA.debugLineNum = 4688;BA.debugLine="TraceLog(\"переход очередь skip reason=no_local";
_tracelog("переход очередь skip reason=no_local_track item="+_describeitem((Object)(_item.getObject())));
 //BA.debugLineNum = 4689;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 4691;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 //BA.debugLineNum = 4692;BA.debugLine="Return item";
if (true) return (Object)(_item.getObject());
 };
 //BA.debugLineNum = 4694;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 4695;BA.debugLine="If mediaCacheService.IsAdCached(item.GetDefault";
if (_mediacacheservice._isadcached /*boolean*/ (BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
 //BA.debugLineNum = 4696;BA.debugLine="TraceLog(\"переход очередь skip reason=no_local";
_tracelog("переход очередь skip reason=no_local_ad item="+_describeitem((Object)(_item.getObject())));
 //BA.debugLineNum = 4697;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 4699;BA.debugLine="playQueue.RemoveAt(i)";
_playqueue.RemoveAt(_i);
 //BA.debugLineNum = 4700;BA.debugLine="Return item";
if (true) return (Object)(_item.getObject());
 };
 }
};
 //BA.debugLineNum = 4703;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 4704;BA.debugLine="End Sub";
return null;
}
public boolean  _shouldadvanceattransitionboundary(long _remainms) throws Exception{
 //BA.debugLineNum = 1961;BA.debugLine="Private Sub ShouldAdvanceAtTransitionBoundary(rema";
 //BA.debugLineNum = 1962;BA.debugLine="If remainMs > 0 Then Return False";
if (_remainms>0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1963;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if ((_transition_getdirectoractiveaudiokey()).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1964;BA.debugLine="If CanAdvancePlaybackNow(\"transition_boundary\", F";
if (_canadvanceplaybacknow("transition_boundary",__c.False)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1965;BA.debugLine="If IsPlaybackTransitionInProgress Then Return Fal";
if (_isplaybacktransitioninprogress()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1966;BA.debugLine="If orchestrationState.IsPlaybackDispatchInProgres";
if (_orchestrationstate._isplaybackdispatchinprogress /*boolean*/ ) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1967;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 1968;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldapplypendingappupdatebeforenexttrack() throws Exception{
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
 //BA.debugLineNum = 548;BA.debugLine="Private Sub ShouldApplyPendingAppUpdateBeforeNextT";
 //BA.debugLineNum = 549;BA.debugLine="If downloadedAppUpdateVersion <= AppInfo.VersionC";
if (_downloadedappupdateversion<=_appinfo._versioncode /*int*/ ) { 
if (true) return __c.False;};
 //BA.debugLineNum = 550;BA.debugLine="If PlatformBridge.IsStagedUpdateReady(appUpdateDi";
if (_platformbridge._isstagedupdateready /*boolean*/ (ba,_appupdatedir,_app_update_file)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 551;BA.debugLine="If PlatformBridge.IsHostedRuntime = False Then Re";
if (_platformbridge._ishostedruntime /*boolean*/ (ba)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 552;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 553;BA.debugLine="Dim nextItem As Map = ResolveNextPlaybackBoundary";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = _resolvenextplaybackboundaryitem();
 //BA.debugLineNum = 554;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
if (_nextitem.IsInitialized()==__c.False || _nextitem.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 555;BA.debugLine="Return nextItem.GetDefault(\"type\", \"\") = \"track\"";
if (true) return (_nextitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track"));
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldblockmusictransitionforexactbreak() throws Exception{
 //BA.debugLineNum = 2434;BA.debugLine="Private Sub ShouldBlockMusicTransitionForExactBrea";
 //BA.debugLineNum = 2435;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2436;BA.debugLine="Return HasPendingExactBreak";
if (true) return _haspendingexactbreak();
 //BA.debugLineNum = 2437;BA.debugLine="End Sub";
return false;
}
public boolean  _shoulddefercacheworkerforplaybackui() throws Exception{
 //BA.debugLineNum = 1036;BA.debugLine="Private Sub ShouldDeferCacheWorkerForPlaybackUi As";
 //BA.debugLineNum = 1037;BA.debugLine="If DateTime.Now - lastUserPlaybackInputAt < 1500";
if (__c.DateTime.getNow()-_lastuserplaybackinputat<1500) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1038;BA.debugLine="If playbackFlowState = FLOW_STARTING Then Return";
if ((_playbackflowstate).equals(_flow_starting)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1039;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
if ((_playbackflowstate).equals(_flow_stopping)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1040;BA.debugLine="If playbackFlowState = FLOW_TRANSITIONING Then Re";
if ((_playbackflowstate).equals(_flow_transitioning)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 1041;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return false;
}
public boolean  _shoulddeferhistoryflushforplaybackui() throws Exception{
 //BA.debugLineNum = 3698;BA.debugLine="Private Sub ShouldDeferHistoryFlushForPlaybackUi A";
 //BA.debugLineNum = 3699;BA.debugLine="If DateTime.Now - lastUserPlaybackInputAt < 1500";
if (__c.DateTime.getNow()-_lastuserplaybackinputat<1500) { 
if (true) return __c.True;};
 //BA.debugLineNum = 3700;BA.debugLine="If playbackFlowState = FLOW_STARTING Then Return";
if ((_playbackflowstate).equals(_flow_starting)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 3701;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
if ((_playbackflowstate).equals(_flow_stopping)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 3702;BA.debugLine="If playbackFlowState = FLOW_TRANSITIONING Then Re";
if ((_playbackflowstate).equals(_flow_transitioning)) { 
if (true) return __c.True;};
 //BA.debugLineNum = 3703;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 3704;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldholdpreparedforqueueditem() throws Exception{
 //BA.debugLineNum = 2054;BA.debugLine="Private Sub ShouldHoldPreparedForQueuedItem As Boo";
 //BA.debugLineNum = 2055;BA.debugLine="Return ShouldPrioritizeQueueHeadOverPrepared";
if (true) return _shouldprioritizequeueheadoverprepared();
 //BA.debugLineNum = 2056;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldprefetchimmediatelywhenpreparedmissing() throws Exception{
 //BA.debugLineNum = 5268;BA.debugLine="Private Sub ShouldPrefetchImmediatelyWhenPreparedM";
 //BA.debugLineNum = 5269;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if ((_transition_getdirectoractiveaudiokey()).equals("")) { 
if (true) return __c.False;};
 //BA.debugLineNum = 5270;BA.debugLine="If HasUsablePreparedItem Then Return False";
if (_hasusableprepareditem()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 5271;BA.debugLine="If metaState.CurrentMediaType <> \"track\" And meta";
if ((_metastate._currentmediatype /*String*/ ).equals("track") == false && (_metastate._currentmediatype /*String*/ ).equals("ad") == false) { 
if (true) return __c.False;};
 //BA.debugLineNum = 5272;BA.debugLine="Return CanPrefetchNextNow(False)";
if (true) return _canprefetchnextnow(__c.False);
 //BA.debugLineNum = 5273;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldprioritizequeueheadoverprepared() throws Exception{
Object _headobject = null;
anywheresoftware.b4a.objects.collections.Map _headitem = null;
String _itemtype = "";
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
long _breakat = 0L;
anywheresoftware.b4a.objects.collections.Map _breakprepareditem = null;
 //BA.debugLineNum = 2027;BA.debugLine="Private Sub ShouldPrioritizeQueueHeadOverPrepared";
 //BA.debugLineNum = 2028;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (_playqueue.IsInitialized()==__c.False || _playqueue.getSize()==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2029;BA.debugLine="Dim headObject As Object = playQueue.Get(0)";
_headobject = _playqueue.Get((int) (0));
 //BA.debugLineNum = 2030;BA.debugLine="If (headObject Is Map) = False Then Return False";
if ((_headobject instanceof java.util.Map)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2031;BA.debugLine="Dim headItem As Map = headObject";
_headitem = new anywheresoftware.b4a.objects.collections.Map();
_headitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_headobject));
 //BA.debugLineNum = 2032;BA.debugLine="Dim itemType As String = headItem.GetDefault(\"typ";
_itemtype = BA.ObjectToString(_headitem.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 2033;BA.debugLine="Dim preparedItem As Map = Transition_GetDirectorP";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = _transition_getdirectorprepareditem();
 //BA.debugLineNum = 2034;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"break","ad","message","update","idle")) {
case 0: {
 //BA.debugLineNum = 2036;BA.debugLine="Dim breakAt As Long = ToLongDefault(headItem.Ge";
_breakat = _tolongdefault(_headitem.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
 //BA.debugLineNum = 2037;BA.debugLine="If breakAt > LocalNowTimestamp Then Return Fals";
if (_breakat>_localnowtimestamp()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2038;BA.debugLine="If preparedItem.IsInitialized Then";
if (_prepareditem.IsInitialized()) { 
 //BA.debugLineNum = 2039;BA.debugLine="Dim breakPreparedItem As Map = PeekBreakPrepar";
_breakprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_breakprepareditem = _peekbreakpreparedcandidate(_headitem);
 //BA.debugLineNum = 2040;BA.debugLine="If breakPreparedItem.IsInitialized And ItemsMa";
if (_breakprepareditem.IsInitialized() && _itemsmatch(_prepareditem,_breakprepareditem)) { 
if (true) return __c.False;};
 };
 //BA.debugLineNum = 2042;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
case 1: 
case 2: 
case 3: 
case 4: {
 //BA.debugLineNum = 2044;BA.debugLine="If preparedItem.IsInitialized And ItemsMatch(pr";
if (_prepareditem.IsInitialized() && _itemsmatch(_prepareditem,_headitem)) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2045;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
default: {
 //BA.debugLineNum = 2047;BA.debugLine="Return False";
if (true) return __c.False;
 break; }
}
;
 //BA.debugLineNum = 2049;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldresumewithnewstart() throws Exception{
 //BA.debugLineNum = 2329;BA.debugLine="Private Sub ShouldResumeWithNewStart As Boolean";
 //BA.debugLineNum = 2330;BA.debugLine="Return orchestrationState.IsStarted And IsUserSto";
if (true) return _orchestrationstate._isstarted /*boolean*/  && _isuserstoppedstate()==__c.False && _ispolicypausestate()==__c.False && _orchestrationstate._isstopping /*boolean*/ ==__c.False;
 //BA.debugLineNum = 2331;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldskipfailedappupdateversion(int _targetversion) throws Exception{
int _failedversion = 0;
long _retryafterticks = 0L;
 //BA.debugLineNum = 450;BA.debugLine="Private Sub ShouldSkipFailedAppUpdateVersion(targe";
 //BA.debugLineNum = 451;BA.debugLine="Dim failedVersion As Int = Floor(ToLongDefault(st";
_failedversion = (int) (__c.Floor(_tolongdefault(_storage._getdefault /*Object*/ (_app_update_failed_version_key,(Object)(0)),(long) (0))));
 //BA.debugLineNum = 452;BA.debugLine="If failedVersion <= 0 Then Return False";
if (_failedversion<=0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 453;BA.debugLine="If targetVersion > failedVersion Then Return Fals";
if (_targetversion>_failedversion) { 
if (true) return __c.False;};
 //BA.debugLineNum = 454;BA.debugLine="If targetVersion <> failedVersion Then Return Fal";
if (_targetversion!=_failedversion) { 
if (true) return __c.False;};
 //BA.debugLineNum = 455;BA.debugLine="Dim retryAfterTicks As Long = ToLongDefault(stora";
_retryafterticks = _tolongdefault(_storage._getdefault /*Object*/ (_app_update_failed_retry_after_key,(Object)(0)),(long) (0));
 //BA.debugLineNum = 456;BA.debugLine="Return retryAfterTicks > DateTime.Now";
if (true) return _retryafterticks>__c.DateTime.getNow();
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldtriggerbreaknow() throws Exception{
 //BA.debugLineNum = 3507;BA.debugLine="Private Sub ShouldTriggerBreakNow As Boolean";
 //BA.debugLineNum = 3508;BA.debugLine="If scheduledBreakAt <= 0 Then Return False";
if (_scheduledbreakat<=0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 3509;BA.debugLine="Return LocalNowTimestamp >= scheduledBreakAt";
if (true) return _localnowtimestamp()>=_scheduledbreakat;
 //BA.debugLineNum = 3510;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldwatchplaybackprogress() throws Exception{
 //BA.debugLineNum = 2116;BA.debugLine="Private Sub ShouldWatchPlaybackProgress As Boolean";
 //BA.debugLineNum = 2117;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2118;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (_orchestrationstate._isstoppedbyuser /*boolean*/ ) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2119;BA.debugLine="If orchestrationState.IsStopping Then Return Fals";
if (_orchestrationstate._isstopping /*boolean*/ ) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2120;BA.debugLine="If IsPolicyPauseState Then Return False";
if (_ispolicypausestate()) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2121;BA.debugLine="If HasObservableActivePlayback Then Return True";
if (_hasobservableactiveplayback()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 2122;BA.debugLine="If lastPlaybackWatchdogProgressAt = 0 Then Return";
if (_lastplaybackwatchdogprogressat==0) { 
if (true) return __c.False;};
 //BA.debugLineNum = 2123;BA.debugLine="Return IsPlaybackTransitionInProgress Or orchestr";
if (true) return _isplaybacktransitioninprogress() || _orchestrationstate._isplaybackdispatchinprogress /*boolean*/ ;
 //BA.debugLineNum = 2124;BA.debugLine="End Sub";
return false;
}
public String  _showadmeta(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 4552;BA.debugLine="Private Sub ShowAdMeta(item As Map)";
 //BA.debugLineNum = 4553;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4554;BA.debugLine="uiController.ShowAdMeta(item)";
_uicontroller._showadmeta /*String*/ (_item);
 //BA.debugLineNum = 4555;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(String _text) throws Exception{
 //BA.debugLineNum = 4527;BA.debugLine="Private Sub ShowClaimPrompt(text As String)";
 //BA.debugLineNum = 4528;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 4529;BA.debugLine="uiController.ShowClaimPrompt(text)";
_uicontroller._showclaimprompt /*String*/ (_text);
 }else {
 //BA.debugLineNum = 4531;BA.debugLine="lblInfo.Text = text";
_lblinfo.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 4532;BA.debugLine="confirmPane.Visible = True";
_confirmpane.setVisible(__c.True);
 };
 //BA.debugLineNum = 4534;BA.debugLine="orchestrationState.EnterUserStoppedState";
_orchestrationstate._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 4535;BA.debugLine="SetPlayIcon";
_setplayicon();
 //BA.debugLineNum = 4536;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
_layoutui(_rootview.getWidth(),_rootview.getHeight());
 //BA.debugLineNum = 4537;BA.debugLine="End Sub";
return "";
}
public String  _showinitialscreen() throws Exception{
 //BA.debugLineNum = 923;BA.debugLine="Private Sub ShowInitialScreen";
 //BA.debugLineNum = 924;BA.debugLine="If playerCode = \"\" Then";
if ((_playercode).equals("")) { 
 //BA.debugLineNum = 925;BA.debugLine="ShowSetupScreen(\"\")";
_showsetupscreen("");
 }else {
 //BA.debugLineNum = 927;BA.debugLine="ShowPlayerScreen(True)";
_showplayerscreen(__c.True);
 //BA.debugLineNum = 928;BA.debugLine="SetStopIcon";
_setstopicon();
 //BA.debugLineNum = 929;BA.debugLine="UpdateConnectionIndicator(\"connecting\")";
_updateconnectionindicator("connecting");
 //BA.debugLineNum = 930;BA.debugLine="RequestAutoStartCommand";
_requestautostartcommand();
 };
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(String _text) throws Exception{
 //BA.debugLineNum = 4517;BA.debugLine="Private Sub ShowMessage(text As String)";
 //BA.debugLineNum = 4518;BA.debugLine="If uiControllerReady = False Then";
if (_uicontrollerready==__c.False) { 
 //BA.debugLineNum = 4519;BA.debugLine="lblInfo.Text = text";
_lblinfo.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 4520;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4521;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4523;BA.debugLine="uiController.ShowMessage(text)";
_uicontroller._showmessage /*String*/ (_text);
 //BA.debugLineNum = 4524;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4525;BA.debugLine="End Sub";
return "";
}
public String  _showplayerscreen(boolean _refreshinfo) throws Exception{
 //BA.debugLineNum = 1468;BA.debugLine="Private Sub ShowPlayerScreen(refreshInfo As Boolea";
 //BA.debugLineNum = 1469;BA.debugLine="appScreenMode = \"player\"";
_appscreenmode = "player";
 //BA.debugLineNum = 1470;BA.debugLine="ConfigurePlayerHeader";
_configureplayerheader();
 //BA.debugLineNum = 1471;BA.debugLine="UpdateVisibleMode";
_updatevisiblemode();
 //BA.debugLineNum = 1472;BA.debugLine="If orchestrationState.IsStarted = False And dataP";
if (_orchestrationstate._isstarted /*boolean*/ ==__c.False && _datapolicystate._isplaybackpausedbypolicy /*boolean*/ ==__c.False && _isstartupsequenceinprogress==__c.False) { 
_applystoppedstate();};
 //BA.debugLineNum = 1473;BA.debugLine="If refreshInfo = False Then Return";
if (_refreshinfo==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1474;BA.debugLine="RefreshPlayerHeaderFromCurrentData";
_refreshplayerheaderfromcurrentdata();
 //BA.debugLineNum = 1475;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1476;BA.debugLine="End Sub";
return "";
}
public String  _showsettingsscreen() throws Exception{
 //BA.debugLineNum = 1457;BA.debugLine="Private Sub ShowSettingsScreen";
 //BA.debugLineNum = 1458;BA.debugLine="If playerCode = \"\" Then";
if ((_playercode).equals("")) { 
 //BA.debugLineNum = 1459;BA.debugLine="ShowSetupScreen(\"\")";
_showsetupscreen("");
 //BA.debugLineNum = 1460;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1462;BA.debugLine="appScreenMode = \"settings\"";
_appscreenmode = "settings";
 //BA.debugLineNum = 1463;BA.debugLine="ConfigureSetupScreen(\"settings\", \"\")";
_configuresetupscreen("settings","");
 //BA.debugLineNum = 1464;BA.debugLine="UpdateVisibleMode";
_updatevisiblemode();
 //BA.debugLineNum = 1465;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1466;BA.debugLine="End Sub";
return "";
}
public String  _showsetupscreen(String _text) throws Exception{
 //BA.debugLineNum = 1443;BA.debugLine="Private Sub ShowSetupScreen(text As String)";
 //BA.debugLineNum = 1444;BA.debugLine="appScreenMode = \"setup\"";
_appscreenmode = "setup";
 //BA.debugLineNum = 1445;BA.debugLine="ClearPlaybackState";
_clearplaybackstate();
 //BA.debugLineNum = 1446;BA.debugLine="HidePin";
_hidepin();
 //BA.debugLineNum = 1447;BA.debugLine="orchestrationState.EnterUserStoppedState";
_orchestrationstate._enteruserstoppedstate /*String*/ ();
 //BA.debugLineNum = 1448;BA.debugLine="SetPlayIcon";
_setplayicon();
 //BA.debugLineNum = 1449;BA.debugLine="ShowMessage(\"\")";
_showmessage("");
 //BA.debugLineNum = 1450;BA.debugLine="RenderPlayerHead(\"\", \"\")";
_renderplayerhead("","");
 //BA.debugLineNum = 1451;BA.debugLine="ConfigureSetupScreen(\"setup\", text)";
_configuresetupscreen("setup",_text);
 //BA.debugLineNum = 1452;BA.debugLine="UpdateVisibleMode";
_updatevisiblemode();
 //BA.debugLineNum = 1453;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1454;BA.debugLine="CallSubDelayed(Me, \"RequestPlayerCodeFocusAsync\")";
__c.CallSubDelayed(ba,this,"RequestPlayerCodeFocusAsync");
 //BA.debugLineNum = 1455;BA.debugLine="End Sub";
return "";
}
public String  _showstream(String _text) throws Exception{
 //BA.debugLineNum = 4507;BA.debugLine="Private Sub ShowStream(text As String)";
 //BA.debugLineNum = 4508;BA.debugLine="If uiControllerReady = False Then";
if (_uicontrollerready==__c.False) { 
 //BA.debugLineNum = 4509;BA.debugLine="lblStream.Text = text";
_lblstream.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 4510;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4511;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4513;BA.debugLine="uiController.ShowStream(text)";
_uicontroller._showstream /*String*/ (_text);
 //BA.debugLineNum = 4514;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4515;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 4547;BA.debugLine="Private Sub ShowTrackMeta(item As Map)";
 //BA.debugLineNum = 4548;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4549;BA.debugLine="uiController.ShowTrackMeta(item)";
_uicontroller._showtrackmeta /*String*/ (_item);
 //BA.debugLineNum = 4550;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startfirsttrack(String _mode) throws Exception{
ResumableSub_StartFirstTrack rsub = new ResumableSub_StartFirstTrack(this,_mode);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartFirstTrack extends BA.ResumableSub {
public ResumableSub_StartFirstTrack(b4a.example.b4xmainpage parent,String _mode) {
this.parent = parent;
this._mode = _mode;
}
b4a.example.b4xmainpage parent;
String _mode;
boolean _started = false;

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
 //BA.debugLineNum = 2758;BA.debugLine="Wait For (Facade_StartFirstTrackCore(mode)) Compl";
parent.__c.WaitFor("complete", ba, this, parent._facade_startfirsttrackcore(_mode));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_started = (Boolean) result[0];
;
 //BA.debugLineNum = 2759;BA.debugLine="Return started";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_started));return;};
 //BA.debugLineNum = 2760;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _startfirsttrackmanualasync() throws Exception{
ResumableSub_StartFirstTrackManualAsync rsub = new ResumableSub_StartFirstTrackManualAsync(this);
rsub.resume(ba, null);
}
public static class ResumableSub_StartFirstTrackManualAsync extends BA.ResumableSub {
public ResumableSub_StartFirstTrackManualAsync(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _refreshed = false;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1563;BA.debugLine="If LOCAL_PLAYBACK_ONLY = False Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._local_playback_only==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1564;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refre";
parent.__c.WaitFor("complete", ba, this, parent._refreshofflinedatanow());
this.state = 11;
return;
case 11:
//C
this.state = 4;
_refreshed = (Boolean) result[0];
;
 //BA.debugLineNum = 1565;BA.debugLine="If refreshed = False And HasLocalPlaybackFallbac";
if (true) break;

case 4:
//if
this.state = 9;
if (_refreshed==parent.__c.False && parent._haslocalplaybackfallback()==parent.__c.False) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1567;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete (un";
parent.__c.WaitFor("complete", ba, this, parent._startfirsttrack("manual"));
this.state = 12;
return;
case 12:
//C
this.state = -1;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 1568;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _startofflinedatarefresh() throws Exception{
 //BA.debugLineNum = 934;BA.debugLine="Private Sub StartOfflineDataRefresh";
 //BA.debugLineNum = 936;BA.debugLine="ServiceConfigureBackgroundTimers(playerCode <> \"\"";
_serviceconfigurebackgroundtimers((_playercode).equals("") == false);
 //BA.debugLineNum = 951;BA.debugLine="DisableCacheAuditTimer";
_disablecacheaudittimer();
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startplaybackwithaudiokey(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
ResumableSub_StartPlaybackWithAudioKey rsub = new ResumableSub_StartPlaybackWithAudioKey(this,_audiokey,_item,_fadeinms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartPlaybackWithAudioKey extends BA.ResumableSub {
public ResumableSub_StartPlaybackWithAudioKey(b4a.example.b4xmainpage parent,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) {
this.parent = parent;
this._audiokey = _audiokey;
this._item = _item;
this._fadeinms = _fadeinms;
}
b4a.example.b4xmainpage parent;
String _audiokey;
anywheresoftware.b4a.objects.collections.Map _item;
int _fadeinms;
String _itemurl = "";
boolean _playbackstarted = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2569;BA.debugLine="ClearPendingPlayState";
parent._clearpendingplaystate();
 //BA.debugLineNum = 2570;BA.debugLine="If directorState.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._directorstate.IsInitialized /*boolean*/ ()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 2571;BA.debugLine="directorState.SetPendingPlay(audioKey, item)";
parent._directorstate._setpendingplay /*String*/ (_audiokey,_item);
 //BA.debugLineNum = 2572;BA.debugLine="MirrorRuntimeStateFromDirector";
parent._mirrorruntimestatefromdirector();
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 2574;BA.debugLine="runtimeState.SetPendingPlay(audioKey, item, fade";
parent._runtimestate._setpendingplay /*String*/ (_audiokey,_item,_fadeinms);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 2576;BA.debugLine="runtimeState.PendingPlayFadeInMs = fadeInMs";
parent._runtimestate._pendingplayfadeinms /*int*/  = _fadeinms;
 //BA.debugLineNum = 2577;BA.debugLine="SetPlaybackFlowState(FLOW_STARTING, \"start_playba";
parent._setplaybackflowstate(parent._flow_starting,"start_playback:"+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)(""))));
 //BA.debugLineNum = 2578;BA.debugLine="Dim itemUrl As String = ResolvePlaybackMediaUrl(a";
_itemurl = parent._resolveplaybackmediaurl(_audiokey,_item);
 //BA.debugLineNum = 2579;BA.debugLine="If itemUrl = \"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_itemurl).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 2580;BA.debugLine="TraceError(\"playback\", \"не удалось запустить тре";
parent._traceerror("playback","не удалось запустить трек","reason=media_url trackId="+parent._tracetrackvalue(_item));
 //BA.debugLineNum = 2581;BA.debugLine="WriteHealthSnapshot(\"ошибка_playback\")";
parent._writehealthsnapshot("ошибка_playback");
 //BA.debugLineNum = 2582;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 2584;BA.debugLine="TraceInfo(\"audio\", \"плеер load\", BuildAudioTraceD";
parent._traceinfo("audio","плеер load",parent._buildaudiotracedetails(_item,"player="+parent._traceplayernumber(_audiokey)+" type="+parent._traceitemtype(_item)+" id="+parent._tracetrackvalue(_item)));
 //BA.debugLineNum = 2585;BA.debugLine="GetAudioByKey(audioKey).LoadUrl(itemUrl, CurrentV";
parent._getaudiobykey(_audiokey)._loadurl /*String*/ (_itemurl,parent._currentvolume(_item));
 //BA.debugLineNum = 2586;BA.debugLine="Wait For (WaitForPlaybackActivation(audioKey, ite";
parent.__c.WaitFor("complete", ba, this, parent._waitforplaybackactivation(_audiokey,_item,parent._audio_ready_timeout_ms));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_playbackstarted = (Boolean) result[0];
;
 //BA.debugLineNum = 2587;BA.debugLine="If playbackStarted Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_playbackstarted) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 //BA.debugLineNum = 2588;BA.debugLine="TraceInfo(\"playback\", \"старт трека\", \"trackId=\"";
parent._traceinfo("playback","старт трека","trackId="+parent._tracetrackvalue(_item)+" source="+parent._mediacacheservice._resolvemediasource /*String*/ (_item)+" queue="+BA.NumberToString(parent._playqueue.getSize()));
 //BA.debugLineNum = 2589;BA.debugLine="WriteHealthSnapshot(\"старт_трека\")";
parent._writehealthsnapshot("старт_трека");
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 2591;BA.debugLine="TraceError(\"audio\", \"не удалось запустить трек\",";
parent._traceerror("audio","не удалось запустить трек","trackId="+parent._tracetrackvalue(_item));
 //BA.debugLineNum = 2592;BA.debugLine="WriteHealthSnapshot(\"ошибка_audio\")";
parent._writehealthsnapshot("ошибка_audio");
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 2594;BA.debugLine="Return playbackStarted";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_playbackstarted));return;};
 //BA.debugLineNum = 2595;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stopformissingdata(String _text) throws Exception{
 //BA.debugLineNum = 3318;BA.debugLine="Private Sub StopForMissingData(text As String)";
 //BA.debugLineNum = 3319;BA.debugLine="playerDataCoordinator.StopForMissingData(text)";
_playerdatacoordinator._stopformissingdata /*String*/ (_text);
 //BA.debugLineNum = 3320;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _stopplayer() throws Exception{
ResumableSub_StopPlayer rsub = new ResumableSub_StopPlayer(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StopPlayer extends BA.ResumableSub {
public ResumableSub_StopPlayer(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _stopped = false;

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
 //BA.debugLineNum = 3800;BA.debugLine="Wait For (Facade_StopPlayerCore) Complete (stoppe";
parent.__c.WaitFor("complete", ba, this, parent._facade_stopplayercore());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_stopped = (Boolean) result[0];
;
 //BA.debugLineNum = 3801;BA.debugLine="Return stopped";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_stopped));return;};
 //BA.debugLineNum = 3802;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _stopplayerasync() throws Exception{
ResumableSub_StopPlayerAsync rsub = new ResumableSub_StopPlayerAsync(this);
rsub.resume(ba, null);
}
public static class ResumableSub_StopPlayerAsync extends BA.ResumableSub {
public ResumableSub_StopPlayerAsync(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
boolean _unused2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1571;BA.debugLine="Wait For (StopPlayer) Complete (unused2 As Boolea";
parent.__c.WaitFor("complete", ba, this, parent._stopplayer());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused2 = (Boolean) result[0];
;
 //BA.debugLineNum = 1572;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _submitclaim() throws Exception{
ResumableSub_SubmitClaim rsub = new ResumableSub_SubmitClaim(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SubmitClaim extends BA.ResumableSub {
public ResumableSub_SubmitClaim(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 3033;BA.debugLine="btnConfirmYes.Enabled = False";
parent._btnconfirmyes.setEnabled(parent.__c.False);
 //BA.debugLineNum = 3034;BA.debugLine="btnConfirmNo.Enabled = False";
parent._btnconfirmno.setEnabled(parent.__c.False);
 //BA.debugLineNum = 3035;BA.debugLine="TraceLog(\"claim начало player=\" & FormatPlayerCod";
parent._tracelog("claim начало player="+parent._formatplayercodefordisplay(parent._playercode)+" device="+parent._deviceid);
 //BA.debugLineNum = 3036;BA.debugLine="Wait For (syncService.SubmitClaim(FETCH_TIMEOUT_M";
parent.__c.WaitFor("complete", ba, this, parent._syncservice._submitclaim /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._fetch_timeout_ms));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
 //BA.debugLineNum = 3037;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (true) break;

case 1:
//if
this.state = 12;
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 3038;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
 //BA.debugLineNum = 3039;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_resultdata instanceof java.util.Map) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 3040;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
 //BA.debugLineNum = 3041;BA.debugLine="If data.GetDefault(\"ok\", False) = True Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 3042;BA.debugLine="orchestrationState.EnterStartedState";
parent._orchestrationstate._enterstartedstate /*String*/ ();
 //BA.debugLineNum = 3043;BA.debugLine="SetStopIcon";
parent._setstopicon();
 //BA.debugLineNum = 3044;BA.debugLine="HideContentBlocks";
parent._hidecontentblocks();
 //BA.debugLineNum = 3045;BA.debugLine="TraceLog(\"claim итог success=true\")";
parent._tracelog("claim итог success=true");
 //BA.debugLineNum = 3046;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete";
parent.__c.WaitFor("complete", ba, this, parent._startfirsttrack("manual"));
this.state = 14;
return;
case 14:
//C
this.state = 10;
_unused = (Boolean) result[0];
;
 //BA.debugLineNum = 3047;BA.debugLine="btnConfirmYes.Enabled = True";
parent._btnconfirmyes.setEnabled(parent.__c.True);
 //BA.debugLineNum = 3048;BA.debugLine="btnConfirmNo.Enabled = True";
parent._btnconfirmno.setEnabled(parent.__c.True);
 //BA.debugLineNum = 3049;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 3053;BA.debugLine="TraceLog(\"claim итог success=false message=\" & Re";
parent._tracelog("claim итог success=false message="+parent._resolveerrormessage(_result,parent._messagevalue("device_busy")));
 //BA.debugLineNum = 3054;BA.debugLine="ShowClaimPrompt(ResolveErrorMessage(result, Messa";
parent._showclaimprompt(parent._resolveerrormessage(_result,parent._messagevalue("device_busy")));
 //BA.debugLineNum = 3055;BA.debugLine="btnConfirmYes.Enabled = True";
parent._btnconfirmyes.setEnabled(parent.__c.True);
 //BA.debugLineNum = 3056;BA.debugLine="btnConfirmNo.Enabled = True";
parent._btnconfirmno.setEnabled(parent.__c.True);
 //BA.debugLineNum = 3057;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 3058;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _syncexactbreakstate() throws Exception{
 //BA.debugLineNum = 3450;BA.debugLine="Private Sub SyncExactBreakState";
 //BA.debugLineNum = 3451;BA.debugLine="ResolveScheduledBreakAt";
_resolvescheduledbreakat();
 //BA.debugLineNum = 3452;BA.debugLine="ScheduleBreakWatch";
_schedulebreakwatch();
 //BA.debugLineNum = 3453;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _syncofflineplaylistmetadata() throws Exception{
ResumableSub_SyncOfflinePlaylistMetadata rsub = new ResumableSub_SyncOfflinePlaylistMetadata(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_SyncOfflinePlaylistMetadata(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _playlistdescriptors = null;
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex = null;
int _downloadedcount = 0;
int _updatedcount = 0;
int _failedcount = 0;
Object _descriptorobject = null;
anywheresoftware.b4a.objects.collections.Map _descriptor = null;
String _syncaction = "";
boolean _downloaded = false;
int _actualcount = 0;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4928;BA.debugLine="Dim playlistDescriptors As List = offlineStoreSer";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = parent._offlinestoreservice._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 4929;BA.debugLine="If playlistDescriptors.IsInitialized = False Or p";
if (true) break;

case 1:
//if
this.state = 4;
if (_playlistdescriptors.IsInitialized()==parent.__c.False || _playlistdescriptors.getSize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 4930;BA.debugLine="TraceLog(\"метаданные плейлистов sync skip reason";
parent._tracelog("метаданные плейлистов sync skip reason=nothing_to_sync");
 //BA.debugLineNum = 4931;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 4933;BA.debugLine="EnsureDirectory(offlineStoreService.GetOfflinePla";
parent._ensuredirectory(parent._offlinestoreservice._getofflineplaylistsdir /*String*/ ());
 //BA.debugLineNum = 4934;BA.debugLine="Dim cachedPlaylistIndex As Map = offlineStoreServ";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = parent._offlinestoreservice._getcachedplaylistindex /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 4935;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
 //BA.debugLineNum = 4936;BA.debugLine="Dim updatedCount As Int = 0";
_updatedcount = (int) (0);
 //BA.debugLineNum = 4937;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
 //BA.debugLineNum = 4938;BA.debugLine="For Each descriptorObject As Object In playlistDe";
if (true) break;

case 5:
//for
this.state = 30;
group11 = _playlistdescriptors;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 30;
if (index11 < groupLen11) {
this.state = 7;
_descriptorobject = group11.Get(index11);}
if (true) break;

case 32:
//C
this.state = 31;
index11++;
if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 4939;BA.debugLine="If descriptorObject Is Map Then";
if (true) break;

case 8:
//if
this.state = 29;
if (_descriptorobject instanceof java.util.Map) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 4940;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
 //BA.debugLineNum = 4941;BA.debugLine="Dim syncAction As String = offlineStoreService.";
_syncaction = parent._offlinestoreservice._resolveplaylistsyncaction /*String*/ (_descriptor,_cachedplaylistindex);
 //BA.debugLineNum = 4942;BA.debugLine="If syncAction = \"skip\" Then Continue";
if (true) break;

case 11:
//if
this.state = 16;
if ((_syncaction).equals("skip")) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
this.state = 32;
if (true) break;;
if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 4943;BA.debugLine="Wait For (DownloadOfflinePlaylistMetadata(descr";
parent.__c.WaitFor("complete", ba, this, parent._downloadofflineplaylistmetadata(_descriptor,_cachedplaylistindex));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_downloaded = (Boolean) result[0];
;
 //BA.debugLineNum = 4944;BA.debugLine="If downloaded Then";
if (true) break;

case 17:
//if
this.state = 28;
if (_downloaded) { 
this.state = 19;
}else {
this.state = 27;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 4945;BA.debugLine="If syncAction = \"missing\" Then";
if (true) break;

case 20:
//if
this.state = 25;
if ((_syncaction).equals("missing")) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 //BA.debugLineNum = 4946;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 4948;BA.debugLine="updatedCount = updatedCount + 1";
_updatedcount = (int) (_updatedcount+1);
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 4951;BA.debugLine="failedCount = failedCount + 1";
_failedcount = (int) (_failedcount+1);
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
;
 //BA.debugLineNum = 4955;BA.debugLine="offlineStoreService.SaveCachedPlaylistIndex(cache";
parent._offlinestoreservice._savecachedplaylistindex /*String*/ (_cachedplaylistindex);
 //BA.debugLineNum = 4956;BA.debugLine="offlineStoreService.RefreshPlaylistCacheStatus(pl";
parent._offlinestoreservice._refreshplaylistcachestatus /*String*/ (_playlistdescriptors);
 //BA.debugLineNum = 4957;BA.debugLine="InvalidateRelevantTrackIdsCache";
parent._invalidaterelevanttrackidscache();
 //BA.debugLineNum = 4958;BA.debugLine="Dim actualCount As Int = storage.GetDefault(\"play";
_actualcount = (int)(BA.ObjectToNumber(parent._storage._getdefault /*Object*/ ("playlist_actual_count",(Object)(0))));
 //BA.debugLineNum = 4959;BA.debugLine="TraceLog(\"метаданные плейлистов sync итог downloa";
parent._tracelog("метаданные плейлистов sync итог downloaded="+BA.NumberToString(_downloadedcount)+" updated="+BA.NumberToString(_updatedcount)+" failed="+BA.NumberToString(_failedcount)+" actual="+BA.NumberToString(_actualcount));
 //BA.debugLineNum = 4960;BA.debugLine="Return failedCount = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_failedcount==0));return;};
 //BA.debugLineNum = 4961;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _syncplaybackdirectorstate() throws Exception{
 //BA.debugLineNum = 1784;BA.debugLine="Private Sub SyncPlaybackDirectorState";
 //BA.debugLineNum = 1786;BA.debugLine="directorState.ApplyLegacyRuntime(runtimeState)";
_directorstate._applylegacyruntime /*String*/ (_runtimestate);
 //BA.debugLineNum = 1787;BA.debugLine="directorState.SetFlowState(playbackFlowState)";
_directorstate._setflowstate /*String*/ (_playbackflowstate);
 //BA.debugLineNum = 1788;BA.debugLine="End Sub";
return "";
}
public int  _timezoneoffsetminutes() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _nowoffset = null;
anywheresoftware.b4j.object.JavaObject _zoneoffset = null;
int _totalseconds = 0;
 //BA.debugLineNum = 5036;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
 //BA.debugLineNum = 5037;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 5038;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
 //BA.debugLineNum = 5039;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
 //BA.debugLineNum = 5040;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
 //BA.debugLineNum = 5041;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
 //BA.debugLineNum = 5042;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
 //BA.debugLineNum = 5043;BA.debugLine="End Sub";
return 0;
}
public int  _timezoneoffsetminutesvalue() throws Exception{
 //BA.debugLineNum = 5103;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
 //BA.debugLineNum = 5104;BA.debugLine="Return TimezoneOffsetMinutes";
if (true) return _timezoneoffsetminutes();
 //BA.debugLineNum = 5105;BA.debugLine="End Sub";
return 0;
}
public long  _tolongdefault(Object _value,long _defaultvalue) throws Exception{
 //BA.debugLineNum = 5063;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
 //BA.debugLineNum = 5064;BA.debugLine="Try";
try { //BA.debugLineNum = 5065;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 5066;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 5068;BA.debugLine="Try";
try { //BA.debugLineNum = 5069;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 5071;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
 //BA.debugLineNum = 5074;BA.debugLine="End Sub";
return 0L;
}
public String  _tracedebug(String _message) throws Exception{
 //BA.debugLineNum = 4129;BA.debugLine="Private Sub TraceDebug(message As String)";
 //BA.debugLineNum = 4130;BA.debugLine="traceRouter.TraceDebugMessage(message)";
_tracerouter._tracedebugmessage /*String*/ (_message);
 //BA.debugLineNum = 4131;BA.debugLine="End Sub";
return "";
}
public String  _traceerror(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 4121;BA.debugLine="Private Sub TraceError(category As String, message";
 //BA.debugLineNum = 4122;BA.debugLine="traceRouter.TraceError(category, message, details";
_tracerouter._traceerror /*String*/ (_category,_message,_details);
 //BA.debugLineNum = 4123;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 4107;BA.debugLine="Private Sub TraceInfo(category As String, message";
 //BA.debugLineNum = 4108;BA.debugLine="traceRouter.TraceInfo(category, message, details)";
_tracerouter._traceinfo /*String*/ (_category,_message,_details);
 //BA.debugLineNum = 4109;BA.debugLine="End Sub";
return "";
}
public String  _traceitemtype(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 4138;BA.debugLine="Private Sub TraceItemType(item As Map) As String";
 //BA.debugLineNum = 4139;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4140;BA.debugLine="Return item.GetDefault(\"type\", \"\")";
if (true) return BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4141;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(String _message) throws Exception{
 //BA.debugLineNum = 4103;BA.debugLine="Public Sub TraceLog(message As String)";
 //BA.debugLineNum = 4104;BA.debugLine="traceRouter.TraceLog(message)";
_tracerouter._tracelog /*String*/ (_message);
 //BA.debugLineNum = 4105;BA.debugLine="End Sub";
return "";
}
public String  _traceplayernumber(String _audiokey) throws Exception{
 //BA.debugLineNum = 4133;BA.debugLine="Private Sub TracePlayerNumber(audioKey As String)";
 //BA.debugLineNum = 4134;BA.debugLine="If audioKey = \"secondary\" Then Return \"2\"";
if ((_audiokey).equals("secondary")) { 
if (true) return "2";};
 //BA.debugLineNum = 4135;BA.debugLine="Return \"1\"";
if (true) return "1";
 //BA.debugLineNum = 4136;BA.debugLine="End Sub";
return "";
}
public String  _tracestate(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 4125;BA.debugLine="Private Sub TraceState(category As String, message";
 //BA.debugLineNum = 4126;BA.debugLine="traceRouter.TraceState(category, message, details";
_tracerouter._tracestate /*String*/ (_category,_message,_details);
 //BA.debugLineNum = 4127;BA.debugLine="End Sub";
return "";
}
public String  _tracetrackvalue(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _codevalue = "";
 //BA.debugLineNum = 4143;BA.debugLine="Private Sub TraceTrackValue(item As Map) As String";
 //BA.debugLineNum = 4144;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4145;BA.debugLine="Dim codeValue As String = item.GetDefault(\"code\",";
_codevalue = BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")));
 //BA.debugLineNum = 4146;BA.debugLine="If codeValue <> \"\" Then Return codeValue";
if ((_codevalue).equals("") == false) { 
if (true) return _codevalue;};
 //BA.debugLineNum = 4147;BA.debugLine="Return item.GetDefault(\"id\", \"\")";
if (true) return BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
 //BA.debugLineNum = 4148;BA.debugLine="End Sub";
return "";
}
public String  _traceuploadtimer_tick() throws Exception{
 //BA.debugLineNum = 991;BA.debugLine="Private Sub TraceUploadTimer_Tick";
 //BA.debugLineNum = 992;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return";
if ((_playercode).equals("") || (_deviceid).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 993;BA.debugLine="If traceUploader.IsUploadInProgress Then Return";
if (_traceuploader._isuploadinprogress /*boolean*/ ()) { 
if (true) return "";};
 //BA.debugLineNum = 994;BA.debugLine="WriteHealthSnapshot(\"таймер\")";
_writehealthsnapshot("таймер");
 //BA.debugLineNum = 995;BA.debugLine="If traceUploader.IsTraceUploadEnabled = False The";
if (_traceuploader._istraceuploadenabled /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 996;BA.debugLine="traceUploader.FlushTraceBufferAsync";
_traceuploader._flushtracebufferasync /*void*/ ();
 //BA.debugLineNum = 997;BA.debugLine="End Sub";
return "";
}
public String  _tracewarn(String _category,String _message,String _details) throws Exception{
 //BA.debugLineNum = 4111;BA.debugLine="Private Sub TraceWarn(category As String, message";
 //BA.debugLineNum = 4112;BA.debugLine="traceRouter.TraceWarn(category, message, details)";
_tracerouter._tracewarn /*String*/ (_category,_message,_details);
 //BA.debugLineNum = 4113;BA.debugLine="End Sub";
return "";
}
public String  _transition_activateloadeditem(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
 //BA.debugLineNum = 1352;BA.debugLine="Public Sub Transition_ActivateLoadedItem(args As M";
 //BA.debugLineNum = 1353;BA.debugLine="ActivateLoadedItem(args.GetDefault(\"audioKey\", \"\"";
_activateloadeditem(BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item")))),(int)(BA.ObjectToNumber(_args.GetDefault((Object)("fadeInMs"),(Object)(0)))));
 //BA.debugLineNum = 1354;BA.debugLine="End Sub";
return "";
}
public String  _transition_clearpreparedstate(boolean _resetplayer) throws Exception{
 //BA.debugLineNum = 1344;BA.debugLine="Public Sub Transition_ClearPreparedState(resetPlay";
 //BA.debugLineNum = 1345;BA.debugLine="ClearPreparedState(resetPlayer)";
_clearpreparedstate(_resetplayer);
 //BA.debugLineNum = 1346;BA.debugLine="End Sub";
return "";
}
public String  _transition_consumepreparedqueueitem() throws Exception{
 //BA.debugLineNum = 1348;BA.debugLine="Public Sub Transition_ConsumePreparedQueueItem";
 //BA.debugLineNum = 1349;BA.debugLine="ConsumePreparedQueueItem";
_consumepreparedqueueitem();
 //BA.debugLineNum = 1350;BA.debugLine="End Sub";
return "";
}
public double  _transition_currentvolume(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 1336;BA.debugLine="Public Sub Transition_CurrentVolume(item As Map) A";
 //BA.debugLineNum = 1337;BA.debugLine="Return CurrentVolume(item)";
if (true) return _currentvolume(_item);
 //BA.debugLineNum = 1338;BA.debugLine="End Sub";
return 0;
}
public String  _transition_describeitem(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
 //BA.debugLineNum = 1379;BA.debugLine="Public Sub Transition_DescribeItem(item As Map) As";
 //BA.debugLineNum = 1380;BA.debugLine="Return DescribeItem(item)";
if (true) return _describeitem((Object)(_item.getObject()));
 //BA.debugLineNum = 1381;BA.debugLine="End Sub";
return "";
}
public b4a.example.audioplayer  _transition_getaudiobykey(String _audiokey) throws Exception{
 //BA.debugLineNum = 1340;BA.debugLine="Public Sub Transition_GetAudioByKey(audioKey As St";
 //BA.debugLineNum = 1341;BA.debugLine="Return GetAudioByKey(audioKey)";
if (true) return _getaudiobykey(_audiokey);
 //BA.debugLineNum = 1342;BA.debugLine="End Sub";
return null;
}
public String  _transition_getdirectoractiveaudiokey() throws Exception{
b4a.example.playbackplayerslot _activeslot = null;
 //BA.debugLineNum = 2690;BA.debugLine="Public Sub Transition_GetDirectorActiveAudioKey As";
 //BA.debugLineNum = 2691;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2692;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = _directorstate._getactiveslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2693;BA.debugLine="If activeSlot.IsInitialized Then Return activeSl";
if (_activeslot.IsInitialized /*boolean*/ ()) { 
if (true) return _activeslot._audiokey /*String*/ ;};
 };
 //BA.debugLineNum = 2695;BA.debugLine="Return runtimeState.ActiveAudioKey";
if (true) return _runtimestate._activeaudiokey /*String*/ ;
 //BA.debugLineNum = 2696;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectoractiveitem() throws Exception{
b4a.example.playbackplayerslot _activeslot = null;
 //BA.debugLineNum = 2682;BA.debugLine="Public Sub Transition_GetDirectorActiveItem As Map";
 //BA.debugLineNum = 2683;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2684;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = _directorstate._getactiveslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2685;BA.debugLine="If activeSlot.IsInitialized And activeSlot.HasIt";
if (_activeslot.IsInitialized /*boolean*/ () && _activeslot._hasitem /*boolean*/ ()) { 
if (true) return _clonemap(_activeslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
 //BA.debugLineNum = 2687;BA.debugLine="Return CloneMap(runtimeState.ActiveItem)";
if (true) return _clonemap(_runtimestate._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 2688;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectorpendingplayitem(String _audiokey) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
b4a.example.playbackplayerslot _pendingplayslot = null;
 //BA.debugLineNum = 2698;BA.debugLine="Public Sub Transition_GetDirectorPendingPlayItem(a";
 //BA.debugLineNum = 2699;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2700;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 2701;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2702;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = dire";
_pendingplayslot = _directorstate._getslotbyaudiokey /*b4a.example.playbackplayerslot*/ (_audiokey);
 //BA.debugLineNum = 2703;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlay";
if (_pendingplayslot.IsInitialized /*boolean*/ () && (_pendingplayslot._role /*String*/ ).equals("pending_play") && _pendingplayslot._hasitem /*boolean*/ ()) { 
if (true) return _clonemap(_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
 //BA.debugLineNum = 2705;BA.debugLine="If runtimeState.PendingPlayAudioKey = audioKey An";
if ((_runtimestate._pendingplayaudiokey /*String*/ ).equals(_audiokey) && _runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
 //BA.debugLineNum = 2706;BA.debugLine="Return CloneMap(runtimeState.PendingPlayItem)";
if (true) return _clonemap(_runtimestate._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 //BA.debugLineNum = 2708;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 2709;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectorpendingprepareitem(String _audiokey) throws Exception{
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
 //BA.debugLineNum = 2711;BA.debugLine="Public Sub Transition_GetDirectorPendingPrepareIte";
 //BA.debugLineNum = 2712;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 2713;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
 //BA.debugLineNum = 2714;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2715;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = d";
_pendingprepareslot = _directorstate._getslotbyaudiokey /*b4a.example.playbackplayerslot*/ (_audiokey);
 //BA.debugLineNum = 2716;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingP";
if (_pendingprepareslot.IsInitialized /*boolean*/ () && (_pendingprepareslot._state /*String*/ ).equals("loading") && _pendingprepareslot._hasitem /*boolean*/ ()) { 
if (true) return _clonemap(_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
 //BA.debugLineNum = 2718;BA.debugLine="If runtimeState.PendingPrepareAudioKey = audioKey";
if ((_runtimestate._pendingprepareaudiokey /*String*/ ).equals(_audiokey) && _runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
 //BA.debugLineNum = 2719;BA.debugLine="Return CloneMap(runtimeState.PendingPrepareItem)";
if (true) return _clonemap(_runtimestate._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
 //BA.debugLineNum = 2721;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 //BA.debugLineNum = 2722;BA.debugLine="End Sub";
return null;
}
public String  _transition_getdirectorpreparedaudiokey() throws Exception{
b4a.example.playbackplayerslot _preparedslot = null;
 //BA.debugLineNum = 2674;BA.debugLine="Public Sub Transition_GetDirectorPreparedAudioKey";
 //BA.debugLineNum = 2675;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2676;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = directo";
_preparedslot = _directorstate._getpreparedslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2677;BA.debugLine="If preparedSlot.IsInitialized Then Return prepar";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedslot._audiokey /*String*/ ;};
 };
 //BA.debugLineNum = 2679;BA.debugLine="Return runtimeState.PreparedAudioKey";
if (true) return _runtimestate._preparedaudiokey /*String*/ ;
 //BA.debugLineNum = 2680;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectorprepareditem() throws Exception{
b4a.example.playbackplayerslot _preparedslot = null;
 //BA.debugLineNum = 2666;BA.debugLine="Public Sub Transition_GetDirectorPreparedItem As M";
 //BA.debugLineNum = 2667;BA.debugLine="If directorState.IsInitialized Then";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 2668;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = directo";
_preparedslot = _directorstate._getpreparedslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2669;BA.debugLine="If preparedSlot.IsInitialized And preparedSlot.H";
if (_preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ ()) { 
if (true) return _clonemap(_preparedslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
 //BA.debugLineNum = 2671;BA.debugLine="Return CloneMap(runtimeState.PreparedItem)";
if (true) return _clonemap(_runtimestate._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 2672;BA.debugLine="End Sub";
return null;
}
public String  _transition_getplaybackflowstate() throws Exception{
 //BA.debugLineNum = 2661;BA.debugLine="Public Sub Transition_GetPlaybackFlowState As Stri";
 //BA.debugLineNum = 2662;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (_directorstate.IsInitialized /*boolean*/ ()) { 
if (true) return _directorstate._flowstate /*String*/ ;};
 //BA.debugLineNum = 2663;BA.debugLine="Return playbackFlowState";
if (true) return _playbackflowstate;
 //BA.debugLineNum = 2664;BA.debugLine="End Sub";
return "";
}
public boolean  _transition_itemsmatch(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
 //BA.debugLineNum = 1383;BA.debugLine="Public Sub Transition_ItemsMatch(args As Map) As B";
 //BA.debugLineNum = 1384;BA.debugLine="Return ItemsMatch(args.Get(\"first\"), args.Get(\"se";
if (true) return _itemsmatch((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("first")))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("second")))));
 //BA.debugLineNum = 1385;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _transition_peekbreakpreparedcandidate(anywheresoftware.b4a.objects.collections.Map _breakitem) throws Exception{
 //BA.debugLineNum = 1364;BA.debugLine="Public Sub Transition_PeekBreakPreparedCandidate(b";
 //BA.debugLineNum = 1365;BA.debugLine="Return PeekBreakPreparedCandidate(breakItem)";
if (true) return _peekbreakpreparedcandidate(_breakitem);
 //BA.debugLineNum = 1366;BA.debugLine="End Sub";
return null;
}
public String  _transition_recordfadeboundary(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
 //BA.debugLineNum = 1356;BA.debugLine="Public Sub Transition_RecordFadeBoundary(args As M";
 //BA.debugLineNum = 1357;BA.debugLine="lastTransitionFadeStartedAtUs = MonotonicMicros";
_lasttransitionfadestartedatus = _monotonicmicros();
 //BA.debugLineNum = 1358;BA.debugLine="lastTransitionFadeFromAudioKey = args.GetDefault(";
_lasttransitionfadefromaudiokey = BA.ObjectToString(_args.GetDefault((Object)("fromAudioKey"),(Object)("")));
 //BA.debugLineNum = 1359;BA.debugLine="lastTransitionFadeToAudioKey = args.GetDefault(\"t";
_lasttransitionfadetoaudiokey = BA.ObjectToString(_args.GetDefault((Object)("toAudioKey"),(Object)("")));
 //BA.debugLineNum = 1360;BA.debugLine="lastTransitionFadeReason = args.GetDefault(\"reaso";
_lasttransitionfadereason = BA.ObjectToString(_args.GetDefault((Object)("reason"),(Object)("")));
 //BA.debugLineNum = 1361;BA.debugLine="TraceInfo(\"playback\", \"fade boundary\", \"from=\" &";
_traceinfo("playback","fade boundary","from="+_lasttransitionfadefromaudiokey+" to="+_lasttransitionfadetoaudiokey+" fadeOutMs="+BA.ObjectToString(_args.GetDefault((Object)("fadeOutMs"),(Object)(0)))+" fadeInMs="+BA.ObjectToString(_args.GetDefault((Object)("fadeInMs"),(Object)(0)))+" reason="+_lasttransitionfadereason+" startedUs="+BA.NumberToString(_lasttransitionfadestartedatus));
 //BA.debugLineNum = 1362;BA.debugLine="End Sub";
return "";
}
public String  _transition_resolveplaybackmediaurl(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
 //BA.debugLineNum = 1332;BA.debugLine="Public Sub Transition_ResolvePlaybackMediaUrl(args";
 //BA.debugLineNum = 1333;BA.debugLine="Return ResolvePlaybackMediaUrl(args.GetDefault(\"a";
if (true) return _resolveplaybackmediaurl(BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item")))));
 //BA.debugLineNum = 1334;BA.debugLine="End Sub";
return "";
}
public String  _transition_setdirectorpendingprepare(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
 //BA.debugLineNum = 2724;BA.debugLine="Public Sub Transition_SetDirectorPendingPrepare(ar";
 //BA.debugLineNum = 2725;BA.debugLine="If directorState.IsInitialized = False Then Retur";
if (_directorstate.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 2726;BA.debugLine="directorState.SetPendingPrepare(args.GetDefault(\"";
_directorstate._setpendingprepare /*String*/ (BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.GetDefault((Object)("item"),__c.Null))));
 //BA.debugLineNum = 2727;BA.debugLine="MirrorRuntimeStateFromDirector";
_mirrorruntimestatefromdirector();
 //BA.debugLineNum = 2728;BA.debugLine="End Sub";
return "";
}
public String  _transition_setplaybackflowstate(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
 //BA.debugLineNum = 1328;BA.debugLine="Public Sub Transition_SetPlaybackFlowState(args As";
 //BA.debugLineNum = 1329;BA.debugLine="SetPlaybackFlowState(args.GetDefault(\"state\", FLO";
_setplaybackflowstate(BA.ObjectToString(_args.GetDefault((Object)("state"),(Object)(_flow_idle))),BA.ObjectToString(_args.GetDefault((Object)("reason"),(Object)("transition"))));
 //BA.debugLineNum = 1330;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _transition_waitforpreparedaudio(anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
ResumableSub_Transition_WaitForPreparedAudio rsub = new ResumableSub_Transition_WaitForPreparedAudio(this,_args);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Transition_WaitForPreparedAudio extends BA.ResumableSub {
public ResumableSub_Transition_WaitForPreparedAudio(b4a.example.b4xmainpage parent,anywheresoftware.b4a.objects.collections.Map _args) {
this.parent = parent;
this._args = _args;
}
b4a.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _args;
String _audiokey = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
int _timeoutms = 0;
anywheresoftware.b4a.objects.collections.Map _result = null;
boolean _prepared = false;

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
 //BA.debugLineNum = 1369;BA.debugLine="Dim audioKey As String = args.GetDefault(\"audioKe";
_audiokey = BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)("")));
 //BA.debugLineNum = 1370;BA.debugLine="Dim item As Map = args.Get(\"item\")";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item"))));
 //BA.debugLineNum = 1371;BA.debugLine="Dim timeoutMs As Int = args.GetDefault(\"timeoutMs";
_timeoutms = (int)(BA.ObjectToNumber(_args.GetDefault((Object)("timeoutMs"),(Object)(parent._audio_ready_timeout_ms))));
 //BA.debugLineNum = 1372;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1373;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1374;BA.debugLine="Wait For (WaitForPreparedAudio(audioKey, item, ti";
parent.__c.WaitFor("complete", ba, this, parent._waitforpreparedaudio(_audiokey,_item,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (Boolean) result[0];
;
 //BA.debugLineNum = 1375;BA.debugLine="result.Put(\"Success\", prepared)";
_result.Put((Object)("Success"),(Object)(_prepared));
 //BA.debugLineNum = 1376;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 1377;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _tryapplypendingappupdate(String _reason) throws Exception{
 //BA.debugLineNum = 502;BA.debugLine="Private Sub TryApplyPendingAppUpdate(reason As Str";
 //BA.debugLineNum = 503;BA.debugLine="If downloadedAppUpdateVersion <= AppInfo.VersionC";
if (_downloadedappupdateversion<=_appinfo._versioncode /*int*/ ) { 
if (true) return __c.False;};
 //BA.debugLineNum = 504;BA.debugLine="If PlatformBridge.IsStagedUpdateReady(appUpdateDi";
if (_platformbridge._isstagedupdateready /*boolean*/ (ba,_appupdatedir,_app_update_file)==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 505;BA.debugLine="If PlatformBridge.IsHostedRuntime = False Then";
if (_platformbridge._ishostedruntime /*boolean*/ (ba)==__c.False) { 
 //BA.debugLineNum = 506;BA.debugLine="TraceInfo(\"update\", \"обновление отложено\", \"reas";
_traceinfo("update","обновление отложено","reason=no_host target="+BA.NumberToString(_downloadedappupdateversion));
 //BA.debugLineNum = 507;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 509;BA.debugLine="If CanApplyPendingAppUpdateNow = False Then";
if (_canapplypendingappupdatenow()==__c.False) { 
 //BA.debugLineNum = 510;BA.debugLine="TraceInfo(\"update\", \"обновление отложено\", \"reas";
_traceinfo("update","обновление отложено","reason="+_reason+" stage="+_playbackflowstate);
 //BA.debugLineNum = 511;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 513;BA.debugLine="TraceInfo(\"update\", \"применение обновления\", \"rea";
_traceinfo("update","применение обновления","reason="+_reason+" target="+BA.NumberToString(_downloadedappupdateversion));
 //BA.debugLineNum = 514;BA.debugLine="ShowMessage(MessageValue(\"player_reloading\"))";
_showmessage(_messagevalue("player_reloading"));
 //BA.debugLineNum = 515;BA.debugLine="Return PlatformBridge.RequestStagedUpdateApply(ap";
if (true) return _platformbridge._requeststagedupdateapply /*boolean*/ (ba,_appupdatedir,_app_update_file);
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _trydownloadappupdateonce(int _targetversion,int _attempt) throws Exception{
ResumableSub_TryDownloadAppUpdateOnce rsub = new ResumableSub_TryDownloadAppUpdateOnce(this,_targetversion,_attempt);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TryDownloadAppUpdateOnce extends BA.ResumableSub {
public ResumableSub_TryDownloadAppUpdateOnce(b4a.example.b4xmainpage parent,int _targetversion,int _attempt) {
this.parent = parent;
this._targetversion = _targetversion;
this._attempt = _attempt;
}
b4a.example.b4xmainpage parent;
int _targetversion;
int _attempt;
anywheresoftware.b4a.objects.collections.Map _result = null;
b4a.example.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 389;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 390;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 391;BA.debugLine="result.Put(\"success\", False)";
_result.Put((Object)("success"),(Object)(parent.__c.False));
 //BA.debugLineNum = 392;BA.debugLine="result.Put(\"reason\", \"\")";
_result.Put((Object)("reason"),(Object)(""));
 //BA.debugLineNum = 393;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.httpjob();
 //BA.debugLineNum = 394;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 395;BA.debugLine="j.Download(APP_UPDATE_URL)";
_j._download /*String*/ (parent._app_update_url);
 //BA.debugLineNum = 396;BA.debugLine="ApplyClientRequestHeaders(j)";
parent._applyclientrequestheaders(_j);
 //BA.debugLineNum = 397;BA.debugLine="j.GetRequest.Timeout = 15000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().setTimeout((int) (15000));
 //BA.debugLineNum = 398;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_j = (b4a.example.httpjob) result[0];
;
 //BA.debugLineNum = 399;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 13;
this.catchState = 12;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 12;
 //BA.debugLineNum = 400;BA.debugLine="If j.Success = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_j._success /*boolean*/ ==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 401;BA.debugLine="result.Put(\"reason\", \"http_error:\" & j.ErrorMes";
_result.Put((Object)("reason"),(Object)("http_error:"+_j._errormessage /*String*/ ));
 //BA.debugLineNum = 402;BA.debugLine="TraceWarn(\"update\", \"загрузка обновления ошибка";
parent._tracewarn("update","загрузка обновления ошибка","target="+BA.NumberToString(_targetversion)+" attempt="+BA.NumberToString(_attempt)+" message="+_j._errormessage /*String*/ );
 //BA.debugLineNum = 403;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 404;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;
;
 //BA.debugLineNum = 406;BA.debugLine="If SaveDownloadedUpdateToFile(j) = False Then";

case 7:
//if
this.state = 10;
if (parent._savedownloadedupdatetofile(_j)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 407;BA.debugLine="result.Put(\"reason\", \"invalid_file\")";
_result.Put((Object)("reason"),(Object)("invalid_file"));
 //BA.debugLineNum = 408;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 409;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 10:
//C
this.state = 13;
;
 //BA.debugLineNum = 411;BA.debugLine="result.Put(\"success\", True)";
_result.Put((Object)("success"),(Object)(parent.__c.True));
 //BA.debugLineNum = 412;BA.debugLine="result.Put(\"reason\", \"\")";
_result.Put((Object)("reason"),(Object)(""));
 //BA.debugLineNum = 413;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 414;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
 //BA.debugLineNum = 416;BA.debugLine="TraceError(\"update\", \"ошибка загрузки обновления";
parent._traceerror("update","ошибка загрузки обновления","target="+BA.NumberToString(_targetversion)+" attempt="+BA.NumberToString(_attempt)+" error="+parent.__c.LastException(ba).getMessage());
 //BA.debugLineNum = 417;BA.debugLine="result.Put(\"reason\", \"exception:\" & LastExceptio";
_result.Put((Object)("reason"),(Object)("exception:"+parent.__c.LastException(ba).getMessage()));
 //BA.debugLineNum = 418;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 419;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;
if (true) break;

case 13:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public boolean  _tryenterplaybackdispatch(String _initiator) throws Exception{
 //BA.debugLineNum = 2439;BA.debugLine="Private Sub TryEnterPlaybackDispatch(initiator As";
 //BA.debugLineNum = 2440;BA.debugLine="If orchestrationState.BeginDispatch(initiator) =";
if (_orchestrationstate._begindispatch /*boolean*/ (_initiator)==__c.False) { 
 //BA.debugLineNum = 2441;BA.debugLine="TraceLog(\"переход dispatch skip reason=reentry i";
_tracelog("переход dispatch skip reason=reentry initiator="+_initiator+" active="+_orchestrationstate._activedispatchinitiator /*String*/ +" stage="+_playbackflowstate);
 //BA.debugLineNum = 2442;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2444;BA.debugLine="TraceLog(\"переход dispatch начало initiator=\" & i";
_tracelog("переход dispatch начало initiator="+_initiator+" prepared="+_haspreparedslotfortrace()+" queue="+BA.NumberToString(_playqueue.getSize()));
 //BA.debugLineNum = 2445;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2446;BA.debugLine="End Sub";
return false;
}
public boolean  _tryenterstartupsequence() throws Exception{
 //BA.debugLineNum = 1136;BA.debugLine="Private Sub TryEnterStartupSequence As Boolean";
 //BA.debugLineNum = 1137;BA.debugLine="If isStartupSequenceInProgress Then Return False";
if (_isstartupsequenceinprogress) { 
if (true) return __c.False;};
 //BA.debugLineNum = 1138;BA.debugLine="isStartupSequenceInProgress = True";
_isstartupsequenceinprogress = __c.True;
 //BA.debugLineNum = 1139;BA.debugLine="stateStore.SetStartupSequenceInProgress(True)";
_statestore._setstartupsequenceinprogress /*String*/ (__c.True);
 //BA.debugLineNum = 1140;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
_isadwarmupdeferredafterstartup = __c.False;
 //BA.debugLineNum = 1141;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
_ispoststarttasksdeferredafterstartup = __c.False;
 //BA.debugLineNum = 1142;BA.debugLine="stateStore.ClearDispatchRetryAfter";
_statestore._cleardispatchretryafter /*String*/ ();
 //BA.debugLineNum = 1143;BA.debugLine="DisableCacheAuditTimer";
_disablecacheaudittimer();
 //BA.debugLineNum = 1144;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1145;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 1146;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tryrunimmediateboundarytransition() throws Exception{
ResumableSub_TryRunImmediateBoundaryTransition rsub = new ResumableSub_TryRunImmediateBoundaryTransition(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TryRunImmediateBoundaryTransition extends BA.ResumableSub {
public ResumableSub_TryRunImmediateBoundaryTransition(b4a.example.b4xmainpage parent) {
this.parent = parent;
}
b4a.example.b4xmainpage parent;
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
String _itemtype = "";
boolean _continuebreak = false;
int _retryafter = 0;
boolean _continueitem = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 4064;BA.debugLine="If HasDispatchableQueueItem = False Then Return F";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._hasdispatchablequeueitem()==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 4065;BA.debugLine="Do While HasDispatchableQueueItem";
if (true) break;

case 7:
//do while
this.state = 29;
while (parent._hasdispatchablequeueitem()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 4066;BA.debugLine="Dim nextObject As Object = ShiftDispatchableQueu";
_nextobject = parent._shiftdispatchablequeueitem();
 //BA.debugLineNum = 4067;BA.debugLine="If (nextObject Is Map) = False Then Return False";
if (true) break;

case 10:
//if
this.state = 15;
if ((_nextobject instanceof java.util.Map)==parent.__c.False) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 4068;BA.debugLine="Dim nextItem As Map = nextObject";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
 //BA.debugLineNum = 4069;BA.debugLine="Dim itemType As String = nextItem.GetDefault(\"ty";
_itemtype = BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 4070;BA.debugLine="If itemType = \"break\" Then";
if (true) break;

case 16:
//if
this.state = 25;
if ((_itemtype).equals("break")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 4071;BA.debugLine="TraceInfo(\"playback\", \"dispatch break\", \"queue=";
parent._traceinfo("playback","dispatch break","queue="+BA.NumberToString(parent._playqueue.getSize())+" exact="+BA.ObjectToString(_nextitem.GetDefault((Object)("exactly"),(Object)(parent.__c.False))));
 //BA.debugLineNum = 4072;BA.debugLine="Wait For (PlayQueueItem(nextItem, 0)) Complete";
parent.__c.WaitFor("complete", ba, this, parent._playqueueitem((Object)(_nextitem.getObject()),(int) (0)));
this.state = 30;
return;
case 30:
//C
this.state = 19;
_continuebreak = (Boolean) result[0];
;
 //BA.debugLineNum = 4073;BA.debugLine="If continueBreak Then";
if (true) break;

case 19:
//if
this.state = 24;
if (_continuebreak) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 4075;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;
;
 //BA.debugLineNum = 4078;BA.debugLine="If itemType <> \"break\" Then";

case 25:
//if
this.state = 28;
if ((_itemtype).equals("break") == false) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 4079;BA.debugLine="TraceInfo(\"playback\", \"dispatch next\", \"type=\"";
parent._traceinfo("playback","dispatch next","type="+_itemtype+" id="+BA.ObjectToString(_nextitem.GetDefault((Object)("id"),(Object)(""))));
 //BA.debugLineNum = 4080;BA.debugLine="Dim retryAfter As Int = stateStore.ConsumeDispa";
_retryafter = parent._statestore._consumedispatchretryafter /*int*/ ();
 //BA.debugLineNum = 4081;BA.debugLine="Wait For (PlayQueueItem(nextItem, retryAfter))";
parent.__c.WaitFor("complete", ba, this, parent._playqueueitem((Object)(_nextitem.getObject()),_retryafter));
this.state = 31;
return;
case 31:
//C
this.state = 28;
_continueitem = (Boolean) result[0];
;
 //BA.debugLineNum = 4082;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 28:
//C
this.state = 7;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 4085;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 4086;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _txtplayercode_action() throws Exception{
 //BA.debugLineNum = 1674;BA.debugLine="Private Sub txtPlayerCode_Action";
 //BA.debugLineNum = 1675;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((_appscreenmode).equals("settings")) { 
if (true) return "";};
 //BA.debugLineNum = 1676;BA.debugLine="BtnSetupSubmit_Click";
_btnsetupsubmit_click();
 //BA.debugLineNum = 1677;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 1679;BA.debugLine="Private Sub txtPlayerCode_FocusChanged (hasFocus A";
 //BA.debugLineNum = 1680;BA.debugLine="isCodeInputFocused = hasFocus";
_iscodeinputfocused = _hasfocus;
 //BA.debugLineNum = 1681;BA.debugLine="UpdateCodeInputAppearance(hasFocus)";
_updatecodeinputappearance(_hasfocus);
 //BA.debugLineNum = 1682;BA.debugLine="If hasFocus Then MovePlayerCodeCursorToEnd";
if (_hasfocus) { 
_moveplayercodecursortoend();};
 //BA.debugLineNum = 1683;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_textchanged(String _oldvalue,String _newvalue) throws Exception{
String _filtered = "";
 //BA.debugLineNum = 1665;BA.debugLine="Private Sub txtPlayerCode_TextChanged (oldValue As";
 //BA.debugLineNum = 1666;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((_appscreenmode).equals("settings")) { 
if (true) return "";};
 //BA.debugLineNum = 1667;BA.debugLine="Dim filtered As String = FilterPlayerCode(newValu";
_filtered = _filterplayercode(_newvalue);
 //BA.debugLineNum = 1668;BA.debugLine="If filtered <> newValue Then";
if ((_filtered).equals(_newvalue) == false) { 
 //BA.debugLineNum = 1669;BA.debugLine="txtPlayerCode.Text = filtered";
_txtplayercode.setText(BA.ObjectToCharSequence(_filtered));
 //BA.debugLineNum = 1670;BA.debugLine="MovePlayerCodeCursorToEnd";
_moveplayercodecursortoend();
 };
 //BA.debugLineNum = 1672;BA.debugLine="End Sub";
return "";
}
public String  _updatecodeinputappearance(boolean _isfocused) throws Exception{
int _fillcolor = 0;
int _bordercolor = 0;
int _orbitbordercolor = 0;
 //BA.debugLineNum = 4452;BA.debugLine="Private Sub UpdateCodeInputAppearance(isFocused As";
 //BA.debugLineNum = 4453;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 4454;BA.debugLine="uiController.UpdateCodeInputAppearance(isFocused";
_uicontroller._updatecodeinputappearance /*String*/ (_isfocused);
 //BA.debugLineNum = 4455;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4457;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
 //BA.debugLineNum = 4458;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
 //BA.debugLineNum = 4459;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
 //BA.debugLineNum = 4460;BA.debugLine="If isFocused Then";
if (_isfocused) { 
 //BA.debugLineNum = 4461;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
 //BA.debugLineNum = 4462;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 //BA.debugLineNum = 4463;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
 //BA.debugLineNum = 4465;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
 //BA.debugLineNum = 4466;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 //BA.debugLineNum = 4467;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
 //BA.debugLineNum = 4469;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
_accesscirclepane.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 4470;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
_accesscorepane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 4471;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
_accessinputpane.SetColorAndBorder(_xui.Color_Transparent,(int) (0),_xui.Color_Transparent,(int) (0));
 //BA.debugLineNum = 4472;BA.debugLine="UiStyle.SetPaneStyle(accessCirclePane, \"-fx-backg";
_uistyle._setpanestyle /*String*/ (ba,_accesscirclepane,"-fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 4473;BA.debugLine="UiStyle.SetPaneStyle(accessCorePane, \"-fx-backgro";
_uistyle._setpanestyle /*String*/ (ba,_accesscorepane,"-fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 4474;BA.debugLine="UiStyle.SetPaneStyle(accessInputPane, \"-fx-backgr";
_uistyle._setpanestyle /*String*/ (ba,_accessinputpane,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
 //BA.debugLineNum = 4475;BA.debugLine="UiStyle.SetPaneStyle(txtPlayerCodeView, \"-fx-back";
_uistyle._setpanestyle /*String*/ (ba,_txtplayercodeview,"-fx-background-color: transparent; -fx-text-fill: "+_uistyle._colortocss /*String*/ (ba,((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+_uistyle._colortocss /*String*/ (ba,((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+_uistyle._colortocss /*String*/ (ba,((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(_codefontsize)+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
 //BA.debugLineNum = 4476;BA.debugLine="End Sub";
return "";
}
public String  _updateconnectionindicator(String _mode) throws Exception{
 //BA.debugLineNum = 4557;BA.debugLine="Private Sub UpdateConnectionIndicator(mode As Stri";
 //BA.debugLineNum = 4558;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 4559;BA.debugLine="uiController.UpdateConnectionIndicator(mode)";
_uicontroller._updateconnectionindicator /*String*/ (_mode);
 //BA.debugLineNum = 4560;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 4561;BA.debugLine="End Sub";
return "";
}
public String  _updateheaderactionappearance(boolean _ishovered) throws Exception{
int _fillcolor = 0;
int _bordercolor = 0;
int _textcolor = 0;
 //BA.debugLineNum = 4407;BA.debugLine="Private Sub UpdateHeaderActionAppearance(isHovered";
 //BA.debugLineNum = 4408;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 4409;BA.debugLine="uiController.UpdateHeaderActionAppearance(isHove";
_uicontroller._updateheaderactionappearance /*String*/ (_ishovered);
 //BA.debugLineNum = 4410;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4412;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
 //BA.debugLineNum = 4413;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
 //BA.debugLineNum = 4414;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
 //BA.debugLineNum = 4415;BA.debugLine="If isHovered Then";
if (_ishovered) { 
 //BA.debugLineNum = 4416;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
 //BA.debugLineNum = 4417;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
 //BA.debugLineNum = 4418;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
 //BA.debugLineNum = 4420;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
 //BA.debugLineNum = 4421;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
 //BA.debugLineNum = 4422;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
 //BA.debugLineNum = 4424;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
_headeractionpane.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 4425;BA.debugLine="UiStyle.SetPaneStyle(headerActionPane, \"-fx-curso";
_uistyle._setpanestyle /*String*/ (ba,_headeractionpane,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
 //BA.debugLineNum = 4426;BA.debugLine="UiStyle.SetLabelStyle(lblHeaderAction, \"-fx-align";
_uistyle._setlabelstyle /*String*/ (ba,_lblheaderaction,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (ba,_textcolor)+";");
 //BA.debugLineNum = 4427;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblHeaderActio";
_uistyle._applymaterialiconfont /*String*/ (ba,_xui,_lblheaderaction,_headeractionfontsize);
 //BA.debugLineNum = 4428;BA.debugLine="End Sub";
return "";
}
public String  _updatemediaconnectivitystatefromcachesync(boolean _downloaded) throws Exception{
String _transition = "";
 //BA.debugLineNum = 4577;BA.debugLine="Private Sub UpdateMediaConnectivityStateFromCacheS";
 //BA.debugLineNum = 4578;BA.debugLine="Dim transition As String = stateStore.UpdateMedia";
_transition = _statestore._updatemediapathdegradedfromcachesync /*String*/ (_downloaded,_mediacacheservice._consumerecentmedianetworkfailure /*boolean*/ ());
 //BA.debugLineNum = 4579;BA.debugLine="If transition = \"entered\" Then";
if ((_transition).equals("entered")) { 
 //BA.debugLineNum = 4580;BA.debugLine="TraceLog(\"degraded path вход source=cache_sync\")";
_tracelog("degraded path вход source=cache_sync");
 }else if((_transition).equals("recovered")) { 
 //BA.debugLineNum = 4582;BA.debugLine="TraceLog(\"degraded path восстановлен source=cach";
_tracelog("degraded path восстановлен source=cache_sync");
 };
 //BA.debugLineNum = 4584;BA.debugLine="RefreshConnectionIndicatorState";
_refreshconnectionindicatorstate();
 //BA.debugLineNum = 4585;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybackmeta(anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
String _itemtype = "";
 //BA.debugLineNum = 2514;BA.debugLine="Private Sub UpdatePlaybackMeta(item As Map)";
 //BA.debugLineNum = 2515;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
 //BA.debugLineNum = 2516;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
 //BA.debugLineNum = 2517;BA.debugLine="ShowAdMeta(item)";
_showadmeta(_item);
 //BA.debugLineNum = 2518;BA.debugLine="ShowStream(MessageValue(\"ad_label\"))";
_showstream(_messagevalue("ad_label"));
 }else {
 //BA.debugLineNum = 2520;BA.debugLine="ShowTrackMeta(item)";
_showtrackmeta(_item);
 //BA.debugLineNum = 2521;BA.debugLine="ShowStream(item.GetDefault(\"stream\", \"\"))";
_showstream(BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)(""))));
 //BA.debugLineNum = 2522;BA.debugLine="SyncExactBreakState";
_syncexactbreakstate();
 };
 //BA.debugLineNum = 2524;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybuttonappearance(boolean _ishovered) throws Exception{
int _backgroundcolor = 0;
int _bordercolor = 0;
int _orbitbordercolor = 0;
 //BA.debugLineNum = 4366;BA.debugLine="Private Sub UpdatePlayButtonAppearance(isHovered A";
 //BA.debugLineNum = 4367;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 4368;BA.debugLine="uiController.UpdatePlayButtonAppearance(isHovere";
_uicontroller._updateplaybuttonappearance /*String*/ (_ishovered,_orchestrationstate._isstarted /*boolean*/ );
 //BA.debugLineNum = 4369;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4371;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
 //BA.debugLineNum = 4372;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
 //BA.debugLineNum = 4373;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
 //BA.debugLineNum = 4374;BA.debugLine="If orchestrationState.IsStarted Then";
if (_orchestrationstate._isstarted /*boolean*/ ) { 
 //BA.debugLineNum = 4375;BA.debugLine="If isHovered Then";
if (_ishovered) { 
 //BA.debugLineNum = 4376;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
 //BA.debugLineNum = 4377;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
 //BA.debugLineNum = 4379;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
 //BA.debugLineNum = 4380;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
 //BA.debugLineNum = 4383;BA.debugLine="If isHovered Then";
if (_ishovered) { 
 //BA.debugLineNum = 4384;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
 //BA.debugLineNum = 4385;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
 //BA.debugLineNum = 4387;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
 //BA.debugLineNum = 4388;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
 //BA.debugLineNum = 4391;BA.debugLine="If orchestrationState.IsStarted Or isHovered Then";
if (_orchestrationstate._isstarted /*boolean*/  || _ishovered) { 
 //BA.debugLineNum = 4392;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
 //BA.debugLineNum = 4394;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
 //BA.debugLineNum = 4396;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
_playbuttonpane.SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 4397;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
_orbitpane.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
 //BA.debugLineNum = 4398;BA.debugLine="End Sub";
return "";
}
public String  _updateresponsivestyles(int _availablewidth) throws Exception{
boolean _small = false;
boolean _medium = false;
float _streamfontsize = 0f;
float _infofontsize = 0f;
float _playfontsize = 0f;
float _stopfontsize = 0f;
float _headeractionsize = 0f;
float _codesize = 0f;
int _cardradius = 0;
 //BA.debugLineNum = 875;BA.debugLine="Private Sub UpdateResponsiveStyles(availableWidth";
 //BA.debugLineNum = 876;BA.debugLine="Dim small As Boolean = availableWidth <= 420dip";
_small = _availablewidth<=__c.DipToCurrent((int) (420));
 //BA.debugLineNum = 877;BA.debugLine="Dim medium As Boolean = availableWidth <= 720dip";
_medium = _availablewidth<=__c.DipToCurrent((int) (720));
 //BA.debugLineNum = 878;BA.debugLine="Dim streamFontSize As Float";
_streamfontsize = 0f;
 //BA.debugLineNum = 879;BA.debugLine="Dim infoFontSize As Float";
_infofontsize = 0f;
 //BA.debugLineNum = 880;BA.debugLine="Dim playFontSize As Float";
_playfontsize = 0f;
 //BA.debugLineNum = 881;BA.debugLine="Dim stopFontSize As Float";
_stopfontsize = 0f;
 //BA.debugLineNum = 882;BA.debugLine="Dim headerActionSize As Float";
_headeractionsize = 0f;
 //BA.debugLineNum = 883;BA.debugLine="Dim codeSize As Float";
_codesize = 0f;
 //BA.debugLineNum = 884;BA.debugLine="Dim cardRadius As Int";
_cardradius = 0;
 //BA.debugLineNum = 886;BA.debugLine="If small Then";
if (_small) { 
 //BA.debugLineNum = 887;BA.debugLine="streamFontSize = 28";
_streamfontsize = (float) (28);
 //BA.debugLineNum = 888;BA.debugLine="infoFontSize = 16";
_infofontsize = (float) (16);
 //BA.debugLineNum = 889;BA.debugLine="playFontSize = 60";
_playfontsize = (float) (60);
 //BA.debugLineNum = 890;BA.debugLine="stopFontSize = 56";
_stopfontsize = (float) (56);
 //BA.debugLineNum = 891;BA.debugLine="headerActionSize = 24";
_headeractionsize = (float) (24);
 //BA.debugLineNum = 892;BA.debugLine="codeSize = 31";
_codesize = (float) (31);
 //BA.debugLineNum = 893;BA.debugLine="cardRadius = 16dip";
_cardradius = __c.DipToCurrent((int) (16));
 }else if(_medium) { 
 //BA.debugLineNum = 895;BA.debugLine="streamFontSize = 32";
_streamfontsize = (float) (32);
 //BA.debugLineNum = 896;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
 //BA.debugLineNum = 897;BA.debugLine="playFontSize = 68";
_playfontsize = (float) (68);
 //BA.debugLineNum = 898;BA.debugLine="stopFontSize = 62";
_stopfontsize = (float) (62);
 //BA.debugLineNum = 899;BA.debugLine="headerActionSize = 26";
_headeractionsize = (float) (26);
 //BA.debugLineNum = 900;BA.debugLine="codeSize = 35";
_codesize = (float) (35);
 //BA.debugLineNum = 901;BA.debugLine="cardRadius = 20dip";
_cardradius = __c.DipToCurrent((int) (20));
 }else {
 //BA.debugLineNum = 903;BA.debugLine="streamFontSize = 38";
_streamfontsize = (float) (38);
 //BA.debugLineNum = 904;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
 //BA.debugLineNum = 905;BA.debugLine="playFontSize = 74";
_playfontsize = (float) (74);
 //BA.debugLineNum = 906;BA.debugLine="stopFontSize = 68";
_stopfontsize = (float) (68);
 //BA.debugLineNum = 907;BA.debugLine="headerActionSize = 28";
_headeractionsize = (float) (28);
 //BA.debugLineNum = 908;BA.debugLine="codeSize = 38";
_codesize = (float) (38);
 //BA.debugLineNum = 909;BA.debugLine="cardRadius = 24dip";
_cardradius = __c.DipToCurrent((int) (24));
 };
 //BA.debugLineNum = 912;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
_lblstream.setFont(_xui.CreateDefaultBoldFont(_streamfontsize));
 //BA.debugLineNum = 913;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
_lblinfo.setFont(_xui.CreateDefaultFont(_infofontsize));
 //BA.debugLineNum = 914;BA.debugLine="lblHeader.Font = xui.CreateDefaultFont(12)";
_lblheader.setFont(_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 915;BA.debugLine="lblFooter.Font = xui.CreateDefaultFont(12)";
_lblfooter.setFont(_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 916;BA.debugLine="headerActionFontSize = headerActionSize";
_headeractionfontsize = _headeractionsize;
 //BA.debugLineNum = 917;BA.debugLine="codeFontSize = codeSize";
_codefontsize = _codesize;
 //BA.debugLineNum = 918;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
_uistyle._applymaterialiconfont /*String*/ (ba,_xui,_lblconnectionicon,(float) (16));
 //BA.debugLineNum = 919;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
_card.SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),_cardradius);
 //BA.debugLineNum = 920;BA.debugLine="uiController.UpdateResponsiveStyles(streamFontSiz";
_uicontroller._updateresponsivestyles /*String*/ (_streamfontsize,_infofontsize,_playfontsize,_stopfontsize,_headeractionsize,_codesize,_iscodeinputfocused,_orchestrationstate._isstarted /*boolean*/  || _datapolicystate._isplaybackpausedbypolicy /*boolean*/  || _isstartupsequenceinprogress);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return "";
}
public String  _updatetextbuttonappearance(anywheresoftware.b4a.objects.B4XViewWrapper _buttonview,boolean _ishovered) throws Exception{
int _fillcolor = 0;
int _bordercolor = 0;
int _textcolor = 0;
 //BA.debugLineNum = 4430;BA.debugLine="Private Sub UpdateTextButtonAppearance(buttonView";
 //BA.debugLineNum = 4431;BA.debugLine="If uiControllerReady Then";
if (_uicontrollerready) { 
 //BA.debugLineNum = 4432;BA.debugLine="uiController.UpdateTextButtonAppearance(buttonVi";
_uicontroller._updatetextbuttonappearance /*String*/ (_buttonview,_ishovered);
 //BA.debugLineNum = 4433;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4435;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
 //BA.debugLineNum = 4436;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
 //BA.debugLineNum = 4437;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
 //BA.debugLineNum = 4438;BA.debugLine="If isHovered Then";
if (_ishovered) { 
 //BA.debugLineNum = 4439;BA.debugLine="fillColor = 0x12FFFFFF";
_fillcolor = ((int)0x12ffffff);
 //BA.debugLineNum = 4440;BA.debugLine="borderColor = 0x34FFFFFF";
_bordercolor = ((int)0x34ffffff);
 //BA.debugLineNum = 4441;BA.debugLine="textColor = 0xFFF2F7FB";
_textcolor = ((int)0xfff2f7fb);
 }else {
 //BA.debugLineNum = 4443;BA.debugLine="fillColor = 0x06FFFFFF";
_fillcolor = ((int)0x06ffffff);
 //BA.debugLineNum = 4444;BA.debugLine="borderColor = 0x1EFFFFFF";
_bordercolor = ((int)0x1effffff);
 //BA.debugLineNum = 4445;BA.debugLine="textColor = 0xFFE0E4EA";
_textcolor = ((int)0xffe0e4ea);
 };
 //BA.debugLineNum = 4447;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
_buttonview.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (12)));
 //BA.debugLineNum = 4448;BA.debugLine="UiStyle.SetPaneStyle(buttonView, \"-fx-cursor: han";
_uistyle._setpanestyle /*String*/ (ba,_buttonview,"-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+_uistyle._colortocss /*String*/ (ba,_textcolor)+";");
 //BA.debugLineNum = 4449;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
_buttonview.setFont(_xui.CreateDefaultBoldFont((float) (13)));
 //BA.debugLineNum = 4450;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode() throws Exception{
 //BA.debugLineNum = 1545;BA.debugLine="Private Sub UpdateVisibleMode";
 //BA.debugLineNum = 1546;BA.debugLine="If uiControllerReady = False Then Return";
if (_uicontrollerready==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1547;BA.debugLine="uiController.UpdateVisibleMode(appScreenMode)";
_uicontroller._updatevisiblemode /*String*/ (_appscreenmode);
 //BA.debugLineNum = 1548;BA.debugLine="PublishHostState";
_publishhoststate();
 //BA.debugLineNum = 1549;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _waitforplaybackactivation(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) throws Exception{
ResumableSub_WaitForPlaybackActivation rsub = new ResumableSub_WaitForPlaybackActivation(this,_audiokey,_item,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WaitForPlaybackActivation extends BA.ResumableSub {
public ResumableSub_WaitForPlaybackActivation(b4a.example.b4xmainpage parent,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) {
this.parent = parent;
this._audiokey = _audiokey;
this._item = _item;
this._timeoutms = _timeoutms;
}
b4a.example.b4xmainpage parent;
String _audiokey;
anywheresoftware.b4a.objects.collections.Map _item;
int _timeoutms;
long _startedat = 0L;
String _directoractiveaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _directoractiveitem = null;
b4a.example.playbackplayerslot _pendingplayslot = null;
anywheresoftware.b4a.objects.collections.Map _readyitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2599;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 2600;BA.debugLine="Do While DateTime.Now - startedAt < timeoutMs";
if (true) break;

case 1:
//do while
this.state = 25;
while (parent.__c.DateTime.getNow()-_startedat<_timeoutms) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2601;BA.debugLine="Dim directorActiveAudioKey As String = Transitio";
_directoractiveaudiokey = parent._transition_getdirectoractiveaudiokey();
 //BA.debugLineNum = 2602;BA.debugLine="Dim directorActiveItem As Map = Transition_GetDi";
_directoractiveitem = new anywheresoftware.b4a.objects.collections.Map();
_directoractiveitem = parent._transition_getdirectoractiveitem();
 //BA.debugLineNum = 2603;BA.debugLine="If directorActiveAudioKey = audioKey And ItemsMa";
if (true) break;

case 4:
//if
this.state = 9;
if ((_directoractiveaudiokey).equals(_audiokey) && parent._itemsmatch(_directoractiveitem,_item)) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 2604;BA.debugLine="If directorState.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent._directorstate.IsInitialized /*boolean*/ ()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 2605;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = dir";
_pendingplayslot = parent._directorstate._getpendingplayslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2606;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPla";
if (true) break;

case 13:
//if
this.state = 20;
if (_pendingplayslot.IsInitialized /*boolean*/ () && (_pendingplayslot._audiokey /*String*/ ).equals(_audiokey) && _pendingplayslot._hasitem /*boolean*/ () && (_pendingplayslot._state /*String*/ ).equals("ready")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 2607;BA.debugLine="Dim readyItem As Map = CloneMap(pendingPlaySlo";
_readyitem = new anywheresoftware.b4a.objects.collections.Map();
_readyitem = parent._clonemap(_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 2608;BA.debugLine="If ItemsMatch(readyItem, item) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._itemsmatch(_readyitem,_item)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 2609;BA.debugLine="ActivateLoadedItem(audioKey, readyItem, runti";
parent._activateloadeditem(_audiokey,_readyitem,parent._runtimestate._pendingplayfadeinms /*int*/ );
 //BA.debugLineNum = 2610;BA.debugLine="ClearPendingPlayState";
parent._clearpendingplaystate();
 //BA.debugLineNum = 2611;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;
;
 //BA.debugLineNum = 2615;BA.debugLine="If runtimeState.PendingPlayAudioKey = \"\" Then";

case 21:
//if
this.state = 24;
if ((parent._runtimestate._pendingplayaudiokey /*String*/ ).equals("")) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 2616;BA.debugLine="Return directorActiveAudioKey = audioKey And It";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((_directoractiveaudiokey).equals(_audiokey) && parent._itemsmatch(_directoractiveitem,_item)));return;};
 if (true) break;

case 24:
//C
this.state = 1;
;
 //BA.debugLineNum = 2618;BA.debugLine="Sleep(25)";
parent.__c.Sleep(ba,this,(int) (25));
this.state = 26;
return;
case 26:
//C
this.state = 1;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 2620;BA.debugLine="TraceWarn(\"audio\", \"таймаут старта трека\", \"audio";
parent._tracewarn("audio","таймаут старта трека","audio="+_audiokey+" trackId="+parent._tracetrackvalue(_item)+" pendingPlayAudio="+parent._runtimestate._pendingplayaudiokey /*String*/ +" activeAudio="+parent._runtimestate._activeaudiokey /*String*/ +" directorActiveAudio="+parent._transition_getdirectoractiveaudiokey());
 //BA.debugLineNum = 2621;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 2622;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _waitforpreparedaudio(String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) throws Exception{
ResumableSub_WaitForPreparedAudio rsub = new ResumableSub_WaitForPreparedAudio(this,_audiokey,_item,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WaitForPreparedAudio extends BA.ResumableSub {
public ResumableSub_WaitForPreparedAudio(b4a.example.b4xmainpage parent,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) {
this.parent = parent;
this._audiokey = _audiokey;
this._item = _item;
this._timeoutms = _timeoutms;
}
b4a.example.b4xmainpage parent;
String _audiokey;
anywheresoftware.b4a.objects.collections.Map _item;
int _timeoutms;
long _startedat = 0L;
String _directorpreparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _directorprepareditem = null;
b4a.example.playbackplayerslot _pendingprepareslot = null;
anywheresoftware.b4a.objects.collections.Map _readyitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 2626;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 2627;BA.debugLine="Do While DateTime.Now - startedAt < timeoutMs";
if (true) break;

case 1:
//do while
this.state = 25;
while (parent.__c.DateTime.getNow()-_startedat<_timeoutms) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 2628;BA.debugLine="Dim directorPreparedAudioKey As String = Transit";
_directorpreparedaudiokey = parent._transition_getdirectorpreparedaudiokey();
 //BA.debugLineNum = 2629;BA.debugLine="Dim directorPreparedItem As Map = Transition_Get";
_directorprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_directorprepareditem = parent._transition_getdirectorprepareditem();
 //BA.debugLineNum = 2630;BA.debugLine="If directorPreparedAudioKey = audioKey And Items";
if (true) break;

case 4:
//if
this.state = 9;
if ((_directorpreparedaudiokey).equals(_audiokey) && parent._itemsmatch(_directorprepareditem,_item)) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 2631;BA.debugLine="If directorState.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent._directorstate.IsInitialized /*boolean*/ ()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 2632;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot =";
_pendingprepareslot = parent._directorstate._getpendingprepareslot /*b4a.example.playbackplayerslot*/ ();
 //BA.debugLineNum = 2633;BA.debugLine="If pendingPrepareSlot.IsInitialized And pending";
if (true) break;

case 13:
//if
this.state = 20;
if (_pendingprepareslot.IsInitialized /*boolean*/ () && (_pendingprepareslot._audiokey /*String*/ ).equals(_audiokey) && _pendingprepareslot._hasitem /*boolean*/ () && (_pendingprepareslot._state /*String*/ ).equals("ready")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 2634;BA.debugLine="Dim readyItem As Map = CloneMap(pendingPrepare";
_readyitem = new anywheresoftware.b4a.objects.collections.Map();
_readyitem = parent._clonemap(_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 2635;BA.debugLine="If ItemsMatch(readyItem, item) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._itemsmatch(_readyitem,_item)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 2636;BA.debugLine="directorState.SetPrepared(audioKey, readyItem";
parent._directorstate._setprepared /*String*/ (_audiokey,_readyitem);
 //BA.debugLineNum = 2637;BA.debugLine="MirrorRuntimeStateFromDirector";
parent._mirrorruntimestatefromdirector();
 //BA.debugLineNum = 2638;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;
;
 //BA.debugLineNum = 2642;BA.debugLine="If runtimeState.PendingPrepareAudioKey = \"\" Then";

case 21:
//if
this.state = 24;
if ((parent._runtimestate._pendingprepareaudiokey /*String*/ ).equals("")) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 2643;BA.debugLine="Return directorPreparedAudioKey = audioKey And";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((_directorpreparedaudiokey).equals(_audiokey) && parent._itemsmatch(_directorprepareditem,_item)));return;};
 if (true) break;

case 24:
//C
this.state = 1;
;
 //BA.debugLineNum = 2645;BA.debugLine="Sleep(25)";
parent.__c.Sleep(ba,this,(int) (25));
this.state = 26;
return;
case 26:
//C
this.state = 1;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 2647;BA.debugLine="TraceWarn(\"audio\", \"таймаут preload\", \"audio=\" &";
parent._tracewarn("audio","таймаут preload","audio="+_audiokey+" trackId="+parent._tracetrackvalue(_item)+" pendingPrepareAudio="+parent._runtimestate._pendingprepareaudiokey /*String*/ +" preparedAudio="+parent._runtimestate._preparedaudiokey /*String*/ +" directorPreparedAudio="+parent._transition_getdirectorpreparedaudiokey());
 //BA.debugLineNum = 2648;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 //BA.debugLineNum = 2649;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _writehealthsnapshot(String _trigger) throws Exception{
String _basedetails = "";
 //BA.debugLineNum = 4150;BA.debugLine="Private Sub WriteHealthSnapshot(trigger As String)";
 //BA.debugLineNum = 4151;BA.debugLine="Dim baseDetails As String = \"trigger=\" & trigger";
_basedetails = "trigger="+_trigger;
 //BA.debugLineNum = 4152;BA.debugLine="TraceState(\"health\", \"воспроизведение\", baseDetai";
_tracestate("health","воспроизведение",_basedetails+" stage="+_playbackflowstate+" playing="+_isplaybackrunningfortrace()+" currentTrackId="+_resolvecurrenttracktracevalue()+" queue="+BA.NumberToString(_playqueue.getSize())+" reserve="+BA.NumberToString(_statestore._getlocalplayablequeuecount /*int*/ (_playqueue))+_buildhealthaudiotracedetails());
 //BA.debugLineNum = 4158;BA.debugLine="TraceState(\"health\", \"кэш\", baseDetails & _ 		\" s";
_tracestate("health","кэш",_basedetails+" status="+_resolvecachehealthstatustext()+" trackIndex="+BA.NumberToString(_mediacacheservice._getcachedtrackcount /*int*/ ())+" adIndex="+BA.NumberToString(_mediacacheservice._getcachedadcount /*int*/ ()));
 //BA.debugLineNum = 4162;BA.debugLine="TraceState(\"health\", \"устройство\", baseDetails &";
_tracestate("health","устройство",_basedetails+" device="+_resolvedevicetracename()+" deviceId="+_deviceid+" os="+_resolveclientplatformtext());
 //BA.debugLineNum = 4166;BA.debugLine="TraceState(\"health\", \"ресурсы\", baseDetails & _";
_tracestate("health","ресурсы",_basedetails+" ramFreeMb="+_resolvefreerammbtext()+" diskFreeMb="+_resolvefreediskmbtext()+" diskTotalMb="+_resolvetotaldiskmbtext());
 //BA.debugLineNum = 4170;BA.debugLine="TraceState(\"health\", \"сеть\", baseDetails & _ 		\"";
_tracestate("health","сеть",_basedetails+" netErrors="+BA.NumberToString(_statestore._getconsecutivenetworkerrors /*int*/ ())+" lastDataOkAgoSec="+_secondsagotext(_statestore._getlastdataokat /*long*/ ())+" lastHistoryOkAgoSec="+_secondsagotext(_statestore._getlasthistoryokat /*long*/ ()));
 //BA.debugLineNum = 4174;BA.debugLine="End Sub";
return "";
}
public String  _writesystemsnapshot(String _trigger) throws Exception{
 //BA.debugLineNum = 4176;BA.debugLine="Private Sub WriteSystemSnapshot(trigger As String)";
 //BA.debugLineNum = 4177;BA.debugLine="TraceInfo(\"system\", \"источник\", trigger)";
_traceinfo("system","источник",_trigger);
 //BA.debugLineNum = 4178;BA.debugLine="TraceInfo(\"system\", \"устройство\", \"name=\" & Resol";
_traceinfo("system","устройство","name="+_resolvedevicetracename()+" id="+_deviceid);
 //BA.debugLineNum = 4179;BA.debugLine="TraceInfo(\"system\", \"платформа\", \"os=\" & ResolveC";
_traceinfo("system","платформа","os="+_resolveclientplatformtext());
 //BA.debugLineNum = 4180;BA.debugLine="TraceInfo(\"system\", \"память\", \"ramFreeMb=\" & Reso";
_traceinfo("system","память","ramFreeMb="+_resolvefreerammbtext());
 //BA.debugLineNum = 4181;BA.debugLine="TraceInfo(\"system\", \"память доступно\", \"ramTotalM";
_traceinfo("system","память доступно","ramTotalMb="+_resolvetotalrammbtext());
 //BA.debugLineNum = 4182;BA.debugLine="TraceInfo(\"system\", \"диск\", \"diskFreeMb=\" & Resol";
_traceinfo("system","диск","diskFreeMb="+_resolvefreediskmbtext()+" diskTotalMb="+_resolvetotaldiskmbtext());
 //BA.debugLineNum = 4183;BA.debugLine="TraceInfo(\"system\", \"кэш треков\", \"trackCount=\" &";
_traceinfo("system","кэш треков","trackCount="+_resolvetrackcachefilecounttext()+" trackIndex="+BA.NumberToString(_mediacacheservice._getcachedtrackcount /*int*/ ())+" trackMb="+_resolvetrackcachesizembtext());
 //BA.debugLineNum = 4186;BA.debugLine="TraceInfo(\"system\", \"кэш рекламы\", \"adCount=\" & R";
_traceinfo("system","кэш рекламы","adCount="+_resolveadcachefilecounttext()+" adIndex="+BA.NumberToString(_mediacacheservice._getcachedadcount /*int*/ ())+" adMb="+_resolveadcachesizembtext());
 //BA.debugLineNum = 4189;BA.debugLine="TraceInfo(\"system\", \"история\", \"pendingHistory=\"";
_traceinfo("system","история","pendingHistory="+BA.NumberToString(_getpendinghistoryfilecount()));
 //BA.debugLineNum = 4190;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "AUDIOPLAYER_COMPLETE"))
	return _audioplayer_complete((String) args[0]);
if (BA.fastSubCompare(sub, "AUDIOPLAYER_ERROR"))
	return _audioplayer_error((String) args[0], (String) args[1]);
if (BA.fastSubCompare(sub, "AUDIOPLAYER_READY"))
	return _audioplayer_ready((String) args[0]);
if (BA.fastSubCompare(sub, "AUDIOPLAYER_TIMEUPDATE"))
	return _audioplayer_timeupdate((String) args[0]);
if (BA.fastSubCompare(sub, "AUTORESUMEAFTERCACHEWARMUP"))
	return _autoresumeaftercachewarmup();
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
if (BA.fastSubCompare(sub, "HOST_COMMANDAUTOSTART"))
	return _host_commandautostart();
if (BA.fastSubCompare(sub, "HOST_COMMANDMANUALSTART"))
	return _host_commandmanualstart();
if (BA.fastSubCompare(sub, "HOST_COMMANDSTOP"))
	return _host_commandstop();
if (BA.fastSubCompare(sub, "HOST_TIMERBREAKTICK"))
	return _host_timerbreaktick();
if (BA.fastSubCompare(sub, "HOST_TIMERCACHEAUDIT"))
	return _host_timercacheaudit();
if (BA.fastSubCompare(sub, "HOST_TIMERHISTORYFLUSH"))
	return _host_timerhistoryflush();
if (BA.fastSubCompare(sub, "HOST_TIMERLOCALADMINUTE"))
	return _host_timerlocaladminute();
if (BA.fastSubCompare(sub, "HOST_TIMEROFFLINEREFRESH"))
	return _host_timerofflinerefresh();
if (BA.fastSubCompare(sub, "HOST_TIMERPLAYBACKDIRECTORTICK"))
	return _host_timerplaybackdirectortick();
if (BA.fastSubCompare(sub, "HOST_TIMERPLAYBACKWATCHDOGTICK"))
	return _host_timerplaybackwatchdogtick();
if (BA.fastSubCompare(sub, "HOST_TIMERTRACEUPLOAD"))
	return _host_timertraceupload();
if (BA.fastSubCompare(sub, "TRACELOG"))
	return _tracelog((String) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
