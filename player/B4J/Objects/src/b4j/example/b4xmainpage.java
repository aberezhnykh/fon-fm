package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _next_base_url = "";
public String _claim_base_url = "";
public String _history_base_url = "";
public String _trace_base_url = "";
public String _client_header_name = "";
public String _client_header_value = "";
public int _history_flush_interval_ms = 0;
public int _trace_flush_interval_ms = 0;
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
public int _data_refresh_ms = 0;
public int _fetch_timeout_ms = 0;
public int _audio_ready_timeout_ms = 0;
public int _audio_output_error_pause_threshold = 0;
public int _audio_output_retry_delay_ms = 0;
public int _playback_watchdog_interval_ms = 0;
public int _playback_director_interval_ms = 0;
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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtplayercode = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtplayercodeview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsetupsubmit = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfirmyes = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfirmno = null;
public float _headeractionfontsize = 0f;
public float _codefontsize = 0f;
public boolean _iscodeinputfocused = false;
public b4j.example.audioplayer _audioprimary = null;
public b4j.example.audioplayer _audiosecondary = null;
public b4j.example.adscheduler _localadscheduler = null;
public b4j.example.dataplaybackresolver _dataresolver = null;
public b4j.example.offlinestore _offlinestoreservice = null;
public b4j.example.traceservice _apptraceservice = null;
public b4j.example.autonomouscachemanager _autocachemanager = null;
public b4j.example.playbacktraceformatter _traceformatter = null;
public b4j.example.playbacktracerouter _tracerouter = null;
public b4j.example.playbacktraceuploader _traceuploader = null;
public b4j.example.mediacache _mediacacheservice = null;
public b4j.example.keyvaluestore _storage = null;
public anywheresoftware.b4a.objects.collections.List _playqueue = null;
public anywheresoftware.b4a.objects.collections.Map _messages = null;
public int _traceloglimit = 0;
public int _serversnapshotlimit = 0;
public anywheresoftware.b4a.objects.Timer _retrytimer = null;
public anywheresoftware.b4a.objects.Timer _breaktimer = null;
public anywheresoftware.b4a.objects.Timer _historyflushtimer = null;
public anywheresoftware.b4a.objects.Timer _traceuploadtimer = null;
public anywheresoftware.b4a.objects.Timer _orbittimer = null;
public anywheresoftware.b4a.objects.Timer _offlinedatarefreshtimer = null;
public anywheresoftware.b4a.objects.Timer _localadminutetimer = null;
public anywheresoftware.b4a.objects.Timer _cacheaudittimer = null;
public anywheresoftware.b4a.objects.Timer _playbackwatchdogtimer = null;
public anywheresoftware.b4a.objects.Timer _playbackdirectortimer = null;
public anywheresoftware.b4j.objects.Shell _machineguidshell = null;
public String _playercode = "";
public String _deviceid = "";
public String _appscreenmode = "";
public String _nextstartmode = "";
public b4j.example.playbackruntimestate _runtimestate = null;
public b4j.example.playbackmetastate _metastate = null;
public b4j.example.playbackorchestrationstate _orchestrationstate = null;
public b4j.example.playbackdatapolicystate _datapolicystate = null;
public b4j.example.offlineplaybackengine _offlineplaybackcore = null;
public b4j.example.playbacktransitioncoordinator _transitioncoordinator = null;
public b4j.example.playbackdatacoordinator _playerdatacoordinator = null;
public b4j.example.playerstatestore _statestore = null;
public b4j.example.networksyncservice _syncservice = null;
public b4j.example.playeruicontroller _uicontroller = null;
public b4j.example.playbackdirectorstate _directorstate = null;
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
public boolean _isplaybackwatchdogtickinprogress = false;
public boolean _isplaybackdirectortickqueued = false;
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
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
public b4j.example.platformbridge _platformbridge = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.httputils2service _httputils2service = null;
public String  _savewindowstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savewindowstate", false))
	 {return ((String) Debug.delegate(ba, "savewindowstate", null));}
anywheresoftware.b4j.objects.Form _form = null;
anywheresoftware.b4j.objects.JFX _fx = null;
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub SaveWindowState";
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="Try";
try {RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="Dim form As Form = B4XPages.GetNativeParent(Me)";
_form = _b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this);
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="If form.IsInitialized = False Then Return";
if (_form.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="If fx.PrimaryScreen.MaxX > form.Width Then";
if (_fx.getPrimaryScreen().getMaxX()>_form.getWidth()) { 
RDebugUtils.currentLine=24576007;
 //BA.debugLineNum = 24576007;BA.debugLine="storage.Put(\"WindowTop\", form.WindowTop)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowTop",(Object)(_form.getWindowTop()));
RDebugUtils.currentLine=24576008;
 //BA.debugLineNum = 24576008;BA.debugLine="storage.Put(\"WindowLeft\", form.WindowLeft)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowLeft",(Object)(_form.getWindowLeft()));
RDebugUtils.currentLine=24576009;
 //BA.debugLineNum = 24576009;BA.debugLine="storage.Put(\"WindowWidth\", form.WindowWidth)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowWidth",(Object)(_form.getWindowWidth()));
RDebugUtils.currentLine=24576010;
 //BA.debugLineNum = 24576010;BA.debugLine="storage.Put(\"WindowHeight\", form.WindowHeight)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowHeight",(Object)(_form.getWindowHeight()));
RDebugUtils.currentLine=24576011;
 //BA.debugLineNum = 24576011;BA.debugLine="TraceLog(\"окно save left=\" & form.WindowLeft &";
__ref._tracelog /*String*/ (null,"окно save left="+BA.NumberToString(_form.getWindowLeft())+" top="+BA.NumberToString(_form.getWindowTop())+" width="+BA.NumberToString(_form.getWindowWidth())+" height="+BA.NumberToString(_form.getWindowHeight()));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=24576014;
 //BA.debugLineNum = 24576014;BA.debugLine="TraceLog(\"окно save ошибка message=\" & LastExcep";
__ref._tracelog /*String*/ (null,"окно save ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=24576017;
 //BA.debugLineNum = 24576017;BA.debugLine="End Sub";
return "";
}
public String  _flushpendingcacheindexes(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushpendingcacheindexes", false))
	 {return ((String) Debug.delegate(ba, "flushpendingcacheindexes", null));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub FlushPendingCacheIndexes";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="End Sub";
return "";
}
public String  _cleanupplaybacktempfiles(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cleanupplaybacktempfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupplaybacktempfiles", null));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_error(b4j.example.b4xmainpage __ref,String _audiokey,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioplayer_error", false))
	 {return ((String) Debug.delegate(ba, "audioplayer_error", new Object[] {_audiokey,_message}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub AudioPlayer_Error(audioKey As String, m";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": audio";
__ref._handleaudioerrorasync /*void*/ (null,__c.createMap(new Object[] {(Object)("audioKey"),(Object)(_audiokey),(Object)("message"),(Object)(_message)}));
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_complete(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioplayer_complete", false))
	 {return ((String) Debug.delegate(ba, "audioplayer_complete", new Object[] {_audiokey}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub AudioPlayer_Complete(audioKey As String";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="HandleAudioCompleteAsync(audioKey)";
__ref._handleaudiocompleteasync /*void*/ (null,_audiokey);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_ready(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioplayer_ready", false))
	 {return ((String) Debug.delegate(ba, "audioplayer_ready", new Object[] {_audiokey}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub AudioPlayer_Ready(audioKey As String)";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="HandleAudioReady(audioKey)";
__ref._handleaudioready /*String*/ (null,_audiokey);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
return "";
}
public String  _audioplayer_timeupdate(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioplayer_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audioplayer_timeupdate", new Object[] {_audiokey}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub AudioPlayer_Timeupdate(audioKey As Stri";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="HandleAudioTimeupdateAsync(audioKey)";
__ref._handleaudiotimeupdateasync /*String*/ (null,_audiokey);
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="traceRouter.TraceLog(message)";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return "";
}
public String  _activateloadeditem(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activateloadeditem", false))
	 {return ((String) Debug.delegate(ba, "activateloadeditem", new Object[] {_audiokey,_item,_fadeinms}));}
String _plannedenddetails = "";
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub ActivateLoadedItem(audioKey As String,";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="playbackActivationToken = playbackActivationToken";
__ref._playbackactivationtoken /*long*/  = (long) (__ref._playbackactivationtoken /*long*/ +1);
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="ResetAudioOutputErrorState";
__ref._resetaudiooutputerrorstate /*String*/ (null);
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="directorState.SetActive(audioKey, item)";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setactive /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="directorState.ClearRole(\"prepared_music\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"prepared_music");
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="directorState.ClearRole(\"prepared_interrupt\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"prepared_interrupt");
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="directorState.ClearRole(\"prepared\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"prepared");
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="directorState.ClearRole(\"pending_play\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"pending_play");
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 }else {
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="runtimeState.SetActive(audioKey, item)";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._setactive /*String*/ (null,_audiokey,_item);
 };
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="SetPlaybackFlowState(FLOW_PLAYING, \"activate_load";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_playing /*String*/ ,"activate_loaded_item");
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="metaState.SetCurrentMedia(ResolvePlaybackMediaUrl";
__ref._metastate /*b4j.example.playbackmetastate*/ ._setcurrentmedia /*String*/ (null,__ref._resolveplaybackmediaurl /*String*/ (null,_audiokey,_item),BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)(""))));
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="UpdatePlaybackMeta(item)";
__ref._updateplaybackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"track\" Then";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track"))) { 
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, item)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._commitplaylistcursor /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ,_item);
 };
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="mediaCacheService.TouchCachedItem(item)";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._touchcacheditem /*String*/ (null,_item);
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="Dim plannedEndDetails As String = BuildPlannedEnd";
_plannedenddetails = __ref._buildplannedendtracedetails /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="TraceLog(\"воспроизведение activate audio=\" & audi";
__ref._tracelog /*String*/ (null,"воспроизведение activate audio="+_audiokey+" item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+" fadeInMs="+BA.NumberToString(_fadeinms)+BA.ObjectToString((((_plannedenddetails).equals("") == false) ? ((Object)(" "+_plannedenddetails)) : ((Object)("")))));
RDebugUtils.currentLine=10747927;
 //BA.debugLineNum = 10747927;BA.debugLine="TraceInfo(\"audio\", \"плеер play\", BuildAudioTraceD";
__ref._traceinfo /*String*/ (null,"audio","плеер play",__ref._buildaudiotracedetails /*String*/ (null,_item,"player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_item)+" id="+__ref._tracetrackvalue /*String*/ (null,_item)+BA.ObjectToString((((_plannedenddetails).equals("") == false) ? ((Object)(" "+_plannedenddetails)) : ((Object)(""))))));
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="GetAudioByKey(audioKey).PlayWithFade(fadeInMs)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._playwithfade /*String*/ (null,_fadeinms);
RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="MarkPlaybackWatchdogProgress(item.GetDefault(\"id\"";
__ref._markplaybackwatchdogprogress /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))),(long) (0));
RDebugUtils.currentLine=10747930;
 //BA.debugLineNum = 10747930;BA.debugLine="ScheduleHistoryLog(item)";
__ref._schedulehistorylog /*String*/ (null,_item);
RDebugUtils.currentLine=10747931;
 //BA.debugLineNum = 10747931;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=10747932;
 //BA.debugLineNum = 10747932;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=10747933;
 //BA.debugLineNum = 10747933;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=10747934;
 //BA.debugLineNum = 10747934;BA.debugLine="RequestDeferredPostStartTasks";
__ref._requestdeferredpoststarttasks /*String*/ (null);
 };
RDebugUtils.currentLine=10747936;
 //BA.debugLineNum = 10747936;BA.debugLine="End Sub";
return "";
}
public String  _resetaudiooutputerrorstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetaudiooutputerrorstate", false))
	 {return ((String) Debug.delegate(ba, "resetaudiooutputerrorstate", null));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub ResetAudioOutputErrorState";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="consecutiveAudioOutputErrors = 0";
__ref._consecutiveaudiooutputerrors /*int*/  = (int) (0);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="isAudioOutputRecoveryPause = False";
__ref._isaudiooutputrecoverypause /*boolean*/  = __c.False;
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="End Sub";
return "";
}
public String  _mirrorruntimestatefromdirector(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mirrorruntimestatefromdirector", false))
	 {return ((String) Debug.delegate(ba, "mirrorruntimestatefromdirector", null));}
b4j.example.playbackplayerslot _activeslot = null;
b4j.example.playbackplayerslot _preparedslot = null;
b4j.example.playbackplayerslot _pendingplayslot = null;
b4j.example.playbackplayerslot _pendingprepareslot = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub MirrorRuntimeStateFromDirector";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="runtimeState.PendingPlayAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="runtimeState.PendingPrepareAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="runtimeState.ActiveItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="runtimeState.PreparedItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="runtimeState.PendingPlayItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="runtimeState.PendingPrepareItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorSt";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="If activeSlot.IsInitialized And activeSlot.HasIte";
if (_activeslot.IsInitialized /*boolean*/ () && _activeslot._hasitem /*boolean*/ (null)) { 
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="runtimeState.ActiveAudioKey = activeSlot.AudioKe";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/  = _activeslot._audiokey /*String*/ ;
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="runtimeState.ActiveItem = CloneMap(activeSlot.It";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_activeslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = director";
_preparedslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="If preparedSlot.IsInitialized And preparedSlot.Ha";
if (_preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ (null)) { 
RDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="runtimeState.PreparedAudioKey = preparedSlot.Aud";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/  = _preparedslot._audiokey /*String*/ ;
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="runtimeState.PreparedItem = CloneMap(preparedSlo";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_preparedslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = direc";
_pendingplayslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpendingplayslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlayS";
if (_pendingplayslot.IsInitialized /*boolean*/ () && _pendingplayslot._hasitem /*boolean*/ (null)) { 
RDebugUtils.currentLine=7864341;
 //BA.debugLineNum = 7864341;BA.debugLine="runtimeState.PendingPlayAudioKey = pendingPlaySl";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/  = _pendingplayslot._audiokey /*String*/ ;
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="runtimeState.PendingPlayItem = CloneMap(pendingP";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=7864344;
 //BA.debugLineNum = 7864344;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = di";
_pendingprepareslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpendingprepareslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=7864345;
 //BA.debugLineNum = 7864345;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingPr";
if (_pendingprepareslot.IsInitialized /*boolean*/ () && _pendingprepareslot._hasitem /*boolean*/ (null)) { 
RDebugUtils.currentLine=7864346;
 //BA.debugLineNum = 7864346;BA.debugLine="runtimeState.PendingPrepareAudioKey = pendingPre";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/  = _pendingprepareslot._audiokey /*String*/ ;
RDebugUtils.currentLine=7864347;
 //BA.debugLineNum = 7864347;BA.debugLine="runtimeState.PendingPrepareItem = CloneMap(pendi";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=7864349;
 //BA.debugLineNum = 7864349;BA.debugLine="End Sub";
return "";
}
public String  _setplaybackflowstate(b4j.example.b4xmainpage __ref,String _newstate,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "setplaybackflowstate", new Object[] {_newstate,_reason}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub SetPlaybackFlowState(newState As Strin";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="If newState = \"\" Then newState = FLOW_IDLE";
if ((_newstate).equals("")) { 
_newstate = __ref._flow_idle /*String*/ ;};
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="If playbackFlowState = newState Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(_newstate)) { 
if (true) return "";};
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="TraceLog(\"flow переход from=\" & playbackFlowState";
__ref._tracelog /*String*/ (null,"flow переход from="+__ref._playbackflowstate /*String*/ +" to="+_newstate+" reason="+_reason);
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="playbackFlowState = newState";
__ref._playbackflowstate /*String*/  = _newstate;
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="If directorState.IsInitialized Then directorState";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setflowstate /*String*/ (null,_newstate);};
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackmediaurl(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplaybackmediaurl", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackmediaurl", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub ResolvePlaybackMediaUrl(audioKey As St";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Return mediaCacheService.ResolvePlaybackMediaUri(";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._resolveplaybackmediauri /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateplaybackmeta", false))
	 {return ((String) Debug.delegate(ba, "updateplaybackmeta", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub UpdatePlaybackMeta(item As Map)";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="ShowAdMeta(item)";
__ref._showadmeta /*String*/ (null,_item);
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="ShowStream(MessageValue(\"ad_label\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"ad_label"));
 }else {
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="ShowTrackMeta(item)";
__ref._showtrackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="ShowStream(item.GetDefault(\"stream\", \"\"))";
__ref._showstream /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)(""))));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="End Sub";
return "";
}
public String  _buildplannedendtracedetails(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildplannedendtracedetails", false))
	 {return ((String) Debug.delegate(ba, "buildplannedendtracedetails", new Object[] {_audiokey,_item}));}
long _durationms = 0L;
long _plannedendticks = 0L;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub BuildPlannedEndTraceDetails(audioKey A";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim durationMs As Long = ResolvePlannedDurationMs";
_durationms = __ref._resolveplanneddurationms /*long*/ (null,_audiokey,_item);
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="If durationMs <= 0 Then Return \"\"";
if (_durationms<=0) { 
if (true) return "";};
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Dim plannedEndTicks As Long = DateTime.Now + dura";
_plannedendticks = (long) (__c.DateTime.getNow()+_durationms);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Return \"durationMs=\" & durationMs & \" plannedEnd=";
if (true) return "durationMs="+BA.NumberToString(_durationms)+" plannedEnd="+__ref._formattickstimefortrace /*String*/ (null,_plannedendticks);
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="End Sub";
return "";
}
public String  _describeitem(b4j.example.b4xmainpage __ref,Object _itemobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_itemobj}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Private Sub DescribeItem(itemObj As Object) As Str";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
 }else {
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="Return \"<empty>\"";
if (true) return "<empty>";
 };
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="If item.IsInitialized = False Then Return \"<empty";
if (_item.IsInitialized()==__c.False) { 
if (true) return "<empty>";};
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21168136;
 //BA.debugLineNum = 21168136;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=21168137;
 //BA.debugLineNum = 21168137;BA.debugLine="parts.Add(\"тип=\" & item.GetDefault(\"type\", \"\"))";
_parts.Add((Object)("тип="+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=21168138;
 //BA.debugLineNum = 21168138;BA.debugLine="If item.GetDefault(\"id\", \"\") <> \"\" Then parts.Add";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("id="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")))));};
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="If item.GetDefault(\"title\", \"\") <> \"\" Then parts.";
if ((_item.GetDefault((Object)("title"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("название="+BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)("")))));};
RDebugUtils.currentLine=21168140;
 //BA.debugLineNum = 21168140;BA.debugLine="If item.GetDefault(\"stream\", \"\") <> \"\" Then parts";
if ((_item.GetDefault((Object)("stream"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("поток="+BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)("")))));};
RDebugUtils.currentLine=21168141;
 //BA.debugLineNum = 21168141;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("сет="+BA.ObjectToString(_item.GetDefault((Object)("set"),(Object)("")))));};
RDebugUtils.currentLine=21168142;
 //BA.debugLineNum = 21168142;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("код="+BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")))));};
RDebugUtils.currentLine=21168143;
 //BA.debugLineNum = 21168143;BA.debugLine="Return JoinList(parts, \", \")";
if (true) return __ref._joinlist /*String*/ (null,_parts,", ");
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub TraceInfo(category As String, message";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="traceRouter.TraceInfo(category, message, details)";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._traceinfo /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="End Sub";
return "";
}
public String  _buildaudiotracedetails(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item,String _basedetails) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildaudiotracedetails", false))
	 {return ((String) Debug.delegate(ba, "buildaudiotracedetails", new Object[] {_item,_basedetails}));}
String _details = "";
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Private Sub BuildAudioTraceDetails(item As Map, ba";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Dim details As String = baseDetails";
_details = _basedetails;
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="If item.IsInitialized = False Then Return details";
if (_item.IsInitialized()==__c.False) { 
if (true) return _details;};
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="details = details & \" volume=\" & NumberFormat2(Cu";
_details = _details+" volume="+__c.NumberFormat2(__ref._currentvolume /*double*/ (null,_item),(int) (1),(int) (3),(int) (3),__c.False);
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="details = details & \" gainDb=\" & NumberFormat2(Re";
_details = _details+" gainDb="+__c.NumberFormat2(__ref._resolveitemgaindb /*double*/ (null,_item),(int) (1),(int) (1),(int) (1),__c.False);
RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="details = details & \" gainApplied=\" & IIf(item.Co";
_details = _details+" gainApplied="+BA.ObjectToString(((_item.ContainsKey((Object)("gain"))) ? ((Object)("yes")) : ((Object)("default"))));
RDebugUtils.currentLine=22872070;
 //BA.debugLineNum = 22872070;BA.debugLine="Return details";
if (true) return _details;
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="End Sub";
return "";
}
public String  _traceplayernumber(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceplayernumber", false))
	 {return ((String) Debug.delegate(ba, "traceplayernumber", new Object[] {_audiokey}));}
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub TracePlayerNumber(audioKey As String)";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="If audioKey = \"secondary\" Then Return \"2\"";
if ((_audiokey).equals("secondary")) { 
if (true) return "2";};
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Return \"1\"";
if (true) return "1";
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="End Sub";
return "";
}
public String  _traceitemtype(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceitemtype", false))
	 {return ((String) Debug.delegate(ba, "traceitemtype", new Object[] {_item}));}
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub TraceItemType(item As Map) As String";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Return item.GetDefault(\"type\", \"\")";
if (true) return BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="End Sub";
return "";
}
public String  _tracetrackvalue(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracetrackvalue", false))
	 {return ((String) Debug.delegate(ba, "tracetrackvalue", new Object[] {_item}));}
String _codevalue = "";
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Private Sub TraceTrackValue(item As Map) As String";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="Dim codeValue As String = item.GetDefault(\"code\",";
_codevalue = BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="If codeValue <> \"\" Then Return codeValue";
if ((_codevalue).equals("") == false) { 
if (true) return _codevalue;};
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Return item.GetDefault(\"id\", \"\")";
if (true) return BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="End Sub";
return "";
}
public b4j.example.audioplayer  _getaudiobykey(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getaudiobykey", false))
	 {return ((b4j.example.audioplayer) Debug.delegate(ba, "getaudiobykey", new Object[] {_audiokey}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub GetAudioByKey(audioKey As String) As A";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="If audioKey = \"secondary\" Then Return audioSecond";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._audiosecondary /*b4j.example.audioplayer*/ ;};
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Return audioPrimary";
if (true) return __ref._audioprimary /*b4j.example.audioplayer*/ ;
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return null;
}
public String  _markplaybackwatchdogprogress(b4j.example.b4xmainpage __ref,String _trackid,long _positionms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "markplaybackwatchdogprogress", false))
	 {return ((String) Debug.delegate(ba, "markplaybackwatchdogprogress", new Object[] {_trackid,_positionms}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub MarkPlaybackWatchdogProgress(trackId A";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="lastPlaybackWatchdogTrackId = trackId";
__ref._lastplaybackwatchdogtrackid /*String*/  = _trackid;
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="lastPlaybackWatchdogPositionMs = positionMs";
__ref._lastplaybackwatchdogpositionms /*long*/  = _positionms;
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="lastPlaybackWatchdogProgressAt = DateTime.Now";
__ref._lastplaybackwatchdogprogressat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="End Sub";
return "";
}
public String  _schedulehistorylog(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulehistorylog", false))
	 {return ((String) Debug.delegate(ba, "schedulehistorylog", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub ScheduleHistoryLog(item As Map)";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
if (true) return "";};
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="TraceLog(\"история confirm reason=playback_start";
__ref._tracelog /*String*/ (null,"история confirm reason=playback_start item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="QueueHistoryRecordAt(item, DateTime.Now)";
__ref._queuehistoryrecordat /*String*/ (null,_item,__c.DateTime.getNow());
RDebugUtils.currentLine=15925256;
 //BA.debugLineNum = 15925256;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15925259;
 //BA.debugLineNum = 15925259;BA.debugLine="TraceLog(\"история stage mode=ad_complete item=\" &";
__ref._tracelog /*String*/ (null,"история stage mode=ad_complete item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=15925260;
 //BA.debugLineNum = 15925260;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=15925261;
 //BA.debugLineNum = 15925261;BA.debugLine="metaState.StageHistoryItem(item, DateTime.Now)";
__ref._metastate /*b4j.example.playbackmetastate*/ ._stagehistoryitem /*String*/ (null,_item,__c.DateTime.getNow());
RDebugUtils.currentLine=15925262;
 //BA.debugLineNum = 15925262;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelay(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetretrydelay", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelay", null));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub ResetRetryDelay";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="playerDataCoordinator.ResetRetryDelay(LOCAL_RETRY";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._resetretrydelay /*String*/ (null,__ref._local_retry_delay_initial /*int*/ ,__ref._server_retry_delay_initial /*int*/ );
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="End Sub";
return "";
}
public String  _requestdeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "requestdeferredpoststarttasks", false))
	 {return ((String) Debug.delegate(ba, "requestdeferredpoststarttasks", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub RequestDeferredPostStartTasks";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="isPostStartTasksDeferredAfterStartup = True";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.True;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public long  _activeplaybackpositionms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activeplaybackpositionms", false))
	 {return ((Long) Debug.delegate(ba, "activeplaybackpositionms", null));}
b4j.example.playbackplayerslot _activeslot = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub ActivePlaybackPositionMs As Long";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="If activeSlot.IsInitialized And activeSlot.Audio";
if (_activeslot.IsInitialized /*boolean*/ () && (_activeslot._audiokey /*String*/ ).equals("") == false) { 
if (true) return (long) (__c.Max(-1,__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeslot._audiokey /*String*/ )._position /*long*/ (null)));};
 };
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Return -1";
if (true) return (long) (-1);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="End Sub";
return 0L;
}
public String  _activetrackidforwatchdog(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activetrackidforwatchdog", false))
	 {return ((String) Debug.delegate(ba, "activetrackidforwatchdog", null));}
b4j.example.playbackplayerslot _activeslot = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub ActiveTrackIdForWatchdog As String";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="If activeSlot.IsInitialized And activeSlot.HasIt";
if (_activeslot.IsInitialized /*boolean*/ () && _activeslot._hasitem /*boolean*/ (null)) { 
if (true) return BA.ObjectToString(_activeslot._item /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));};
 };
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="End Sub";
return "";
}
public String  _addprotectedtrackid(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _protectedids,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "addprotectedtrackid", false))
	 {return ((String) Debug.delegate(ba, "addprotectedtrackid", new Object[] {_protectedids,_item}));}
String _trackid = "";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub AddProtectedTrackId(protectedIds As Ma";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="protectedIds.Put(trackId, True)";
_protectedids.Put((Object)(_trackid),(Object)(__c.True));
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
public boolean  _allowregularadsattargetminute(b4j.example.b4xmainpage __ref,long _targetminutetimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "allowregularadsattargetminute", false))
	 {return ((Boolean) Debug.delegate(ba, "allowregularadsattargetminute", new Object[] {_targetminutetimestamp}));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub AllowRegularAdsAtTargetMinute(targetMi";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Return playerDataCoordinator.AllowRegularAdsAtTar";
if (true) return __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._allowregularadsattargetminute /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),_targetminutetimestamp);
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return false;
}
public String  _appendhistoryrecord(b4j.example.b4xmainpage __ref,String _recorddate,anywheresoftware.b4a.objects.collections.Map _record) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "appendhistoryrecord", false))
	 {return ((String) Debug.delegate(ba, "appendhistoryrecord", new Object[] {_recorddate,_record}));}
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _generator = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub AppendHistoryRecord(recordDate As Stri";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="If recordDate = \"\" Then Return";
if ((_recorddate).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="EnsureDirectory(GetHistoryDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="generator.Initialize(record)";
_generator.Initialize(_record);
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput(G";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = __c.File.OpenOutput(__ref._gethistorydir /*String*/ (null),__ref._historyfilename /*String*/ (null,_recorddate),__c.True);
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Dim writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="writer.Initialize2(outStream, \"UTF8\")";
_writer.Initialize2((java.io.OutputStream)(_outstream.getObject()),"UTF8");
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="writer.WriteLine(generator.ToString)";
_writer.WriteLine(_generator.ToString());
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="writer.Close";
_writer.Close();
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="storage.Put(\"pending_history_count\", storage.GetD";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"pending_history_count",(Object)((double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"pending_history_count",(Object)(0))))+1));
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(b4j.example.b4xmainpage __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="End Sub";
return "";
}
public String  _gethistorydir(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gethistorydir", false))
	 {return ((String) Debug.delegate(ba, "gethistorydir", null));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Private Sub GetHistoryDir As String";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Return File.Combine(storageDir, historyDirName)";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._historydirname /*String*/ );
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="End Sub";
return "";
}
public String  _historyfilename(b4j.example.b4xmainpage __ref,String _recorddate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historyfilename", false))
	 {return ((String) Debug.delegate(ba, "historyfilename", new Object[] {_recorddate}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub HistoryFileName(recordDate As String)";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Return recordDate & \".ndjson\"";
if (true) return _recorddate+".ndjson";
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="End Sub";
return "";
}
public String  _applyclientrequestheaders(b4j.example.b4xmainpage __ref,b4j.example.httpjob _j) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applyclientrequestheaders", false))
	 {return ((String) Debug.delegate(ba, "applyclientrequestheaders", new Object[] {_j}));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub ApplyClientRequestHeaders(j As HttpJob";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="If j.IsInitialized = False Then Return";
if (_j.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="j.GetRequest.SetHeader(CLIENT_HEADER_NAME, CLIENT";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader(__ref._client_header_name /*String*/ ,__ref._client_header_value /*String*/ );
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="End Sub";
return "";
}
public String  _applystoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applystoppedstate", false))
	 {return ((String) Debug.delegate(ba, "applystoppedstate", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub ApplyStoppedState";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="uiController.ApplyStoppedState(MessageValue(\"idle";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._applystoppedstate /*String*/ (null,__ref._messagevalue /*String*/ (null,"idle_stream"));
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="End Sub";
return "";
}
public String  _messagevalue(b4j.example.b4xmainpage __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "messagevalue", false))
	 {return ((String) Debug.delegate(ba, "messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Private Sub MessageValue(key As String) As String";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Return messages.GetDefault(key, \"\")";
if (true) return BA.ObjectToString(__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="End Sub";
return "";
}
public void  _handleaudiocompleteasync(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudiocompleteasync", false))
	 {Debug.delegate(ba, "handleaudiocompleteasync", new Object[] {_audiokey}); return;}
ResumableSub_HandleAudioCompleteAsync rsub = new ResumableSub_HandleAudioCompleteAsync(this,__ref,_audiokey);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleAudioCompleteAsync extends BA.ResumableSub {
public ResumableSub_HandleAudioCompleteAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Wait For (HandleAudioComplete(audioKey)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiocompleteasync"), __ref._handleaudiocomplete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _handleaudioerrorasync(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudioerrorasync", false))
	 {Debug.delegate(ba, "handleaudioerrorasync", new Object[] {_args}); return;}
ResumableSub_HandleAudioErrorAsync rsub = new ResumableSub_HandleAudioErrorAsync(this,__ref,_args);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleAudioErrorAsync extends BA.ResumableSub {
public ResumableSub_HandleAudioErrorAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) {
this.parent = parent;
this.__ref = __ref;
this._args = _args;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _args;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Wait For (HandleAudioError(args.GetDefault(\"audio";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerrorasync"), __ref._handleaudioerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),BA.ObjectToString(_args.GetDefault((Object)("message"),(Object)("")))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleaudioready(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudioready", false))
	 {return ((String) Debug.delegate(ba, "handleaudioready", new Object[] {_audiokey}));}
anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub HandleAudioReady(audioKey As String)";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Dim pendingPlayItem As Map = Transition_GetDirect";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingplayitem = __ref._transition_getdirectorpendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_audiokey);
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="If pendingPlayItem.Size > 0 Then";
if (_pendingplayitem.getSize()>0) { 
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", BuildAudioTrac";
__ref._traceinfo /*String*/ (null,"audio","плеер ready",__ref._buildaudiotracedetails /*String*/ (null,_pendingplayitem,"player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" mode=play type="+__ref._traceitemtype /*String*/ (null,_pendingplayitem)+" id="+__ref._tracetrackvalue /*String*/ (null,_pendingplayitem)));
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="ActivateLoadedItem(audioKey, pendingPlayItem, ru";
__ref._activateloadeditem /*String*/ (null,_audiokey,_pendingplayitem,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayfadeinms /*int*/ );
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="Dim pendingPrepareItem As Map = Transition_GetDir";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingprepareitem = __ref._transition_getdirectorpendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_audiokey);
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="If pendingPrepareItem.Size > 0 Then";
if (_pendingprepareitem.getSize()>0) { 
RDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", BuildAudioTrac";
__ref._traceinfo /*String*/ (null,"audio","плеер ready",__ref._buildaudiotracedetails /*String*/ (null,_pendingprepareitem,"player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" mode=prepare type="+__ref._traceitemtype /*String*/ (null,_pendingprepareitem)+" id="+__ref._tracetrackvalue /*String*/ (null,_pendingprepareitem)));
RDebugUtils.currentLine=18743308;
 //BA.debugLineNum = 18743308;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=18743309;
 //BA.debugLineNum = 18743309;BA.debugLine="directorState.SetPrepared(audioKey, pendingPrep";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setprepared /*String*/ (null,_audiokey,_pendingprepareitem);
RDebugUtils.currentLine=18743310;
 //BA.debugLineNum = 18743310;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 }else {
RDebugUtils.currentLine=18743312;
 //BA.debugLineNum = 18743312;BA.debugLine="runtimeState.SetPrepared(audioKey, pendingPrepa";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._setprepared /*String*/ (null,_audiokey,_pendingprepareitem);
RDebugUtils.currentLine=18743313;
 //BA.debugLineNum = 18743313;BA.debugLine="runtimeState.ClearPendingPrepareState";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpendingpreparestate /*String*/ (null);
 };
 };
RDebugUtils.currentLine=18743316;
 //BA.debugLineNum = 18743316;BA.debugLine="End Sub";
return "";
}
public String  _handleaudiotimeupdateasync(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudiotimeupdateasync", false))
	 {return ((String) Debug.delegate(ba, "handleaudiotimeupdateasync", new Object[] {_audiokey}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub HandleAudioTimeupdateAsync(audioKey As";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="If audioTimeupdateQueuedByKey.GetDefault(audioKey";
if (BA.ObjectToBoolean(__ref._audiotimeupdatequeuedbykey /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_audiokey),(Object)(__c.False)))) { 
if (true) return "";};
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="audioTimeupdateQueuedByKey.Put(audioKey, True)";
__ref._audiotimeupdatequeuedbykey /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_audiokey),(Object)(__c.True));
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="CallSubDelayed2(Me, \"RunAudioTimeupdateAsync\", au";
__c.CallSubDelayed2(ba,this,"RunAudioTimeupdateAsync",(Object)(_audiokey));
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_complete(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_complete", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_complete", null));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub AudioPrimary_Complete";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="HandleAudioCompleteAsync(\"primary\")";
__ref._handleaudiocompleteasync /*void*/ (null,"primary");
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_error(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_error", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_error", new Object[] {_message}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub AudioPrimary_Error(message As String)";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": \"prim";
__ref._handleaudioerrorasync /*void*/ (null,__c.createMap(new Object[] {(Object)("audioKey"),(Object)("primary"),(Object)("message"),(Object)(_message)}));
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_ready(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_ready", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_ready", null));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Private Sub AudioPrimary_Ready";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="HandleAudioReady(\"primary\")";
__ref._handleaudioready /*String*/ (null,"primary");
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_timeupdate", null));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub AudioPrimary_Timeupdate";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="HandleAudioTimeupdateAsync(\"primary\")";
__ref._handleaudiotimeupdateasync /*String*/ (null,"primary");
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_complete(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_complete", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_complete", null));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub AudioSecondary_Complete";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="HandleAudioCompleteAsync(\"secondary\")";
__ref._handleaudiocompleteasync /*void*/ (null,"secondary");
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_error(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_error", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_error", new Object[] {_message}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub AudioSecondary_Error(message As String";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": \"seco";
__ref._handleaudioerrorasync /*void*/ (null,__c.createMap(new Object[] {(Object)("audioKey"),(Object)("secondary"),(Object)("message"),(Object)(_message)}));
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_ready(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_ready", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_ready", null));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub AudioSecondary_Ready";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="HandleAudioReady(\"secondary\")";
__ref._handleaudioready /*String*/ (null,"secondary");
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_timeupdate", null));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub AudioSecondary_Timeupdate";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="HandleAudioTimeupdateAsync(\"secondary\")";
__ref._handleaudiotimeupdateasync /*String*/ (null,"secondary");
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return "";
}
public String  _autoresumeaftercachewarmup(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "autoresumeaftercachewarmup", false))
	 {return ((String) Debug.delegate(ba, "autoresumeaftercachewarmup", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub AutoResumeAfterCacheWarmup";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="If orchestrationState.IsStopping Then Return";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="If IsPolicyPauseState Then Return";
if (__ref._ispolicypausestate /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="If playbackFlowState <> FLOW_IDLE Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_idle /*String*/ ) == false) { 
if (true) return "";};
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="If stateStore.HasAnyCachedTrack = False Then Retu";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="TraceLog(\"autocache resume trigger mode=auto\")";
__ref._tracelog /*String*/ (null,"autocache resume trigger mode=auto");
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="CallSubDelayed(Me, \"StartFirstTrackAutoAsync\")";
__c.CallSubDelayed(ba,this,"StartFirstTrackAutoAsync");
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="End Sub";
return "";
}
public boolean  _ispolicypausestate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ispolicypausestate", false))
	 {return ((Boolean) Debug.delegate(ba, "ispolicypausestate", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub IsPolicyPauseState As Boolean";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="If directorState.IsInitialized Then Return dataPo";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/  || (__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._flowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ );};
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Return dataPolicyState.IsPlaybackPausedByPolicy O";
if (true) return __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/  || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ );
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _autostartsavedplayer(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "autostartsavedplayer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "autostartsavedplayer", null));}
ResumableSub_AutoStartSavedPlayer rsub = new ResumableSub_AutoStartSavedPlayer(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AutoStartSavedPlayer extends BA.ResumableSub {
public ResumableSub_AutoStartSavedPlayer(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unusedoffline = false;
boolean _refreshed = false;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If playerCode = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._playercode /*String*/ ).equals("")) { 
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
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If orchestrationState.IsStarted Or orchestrationS";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
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
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="If TryEnterStartupSequence = False Then Return Fa";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._tryenterstartupsequence /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="ShowMessage(MessageValue(\"connecting\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"connecting"));
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="UpdateConnectionIndicator(\"connecting\")";
__ref._updateconnectionindicator /*String*/ (null,"connecting");
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (true) break;

case 19:
//if
this.state = 22;
if (__ref._local_playback_only /*boolean*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="ShowMessage(MessageValue(\"syncing\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"syncing"));
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="TraceLog(\"автостарт local only\")";
__ref._tracelog /*String*/ (null,"автостарт local only");
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 45;
return;
case 45:
//C
this.state = 22;
_unusedoffline = (boolean) result[1];
;
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="CompleteStartupSequence";
__ref._completestartupsequence /*String*/ (null);
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 22:
//if
this.state = 40;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="TraceLog(\"автостарт сначала обновление данных\")";
__ref._tracelog /*String*/ (null,"автостарт сначала обновление данных");
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 46;
return;
case 46:
//C
this.state = 25;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="If refreshed = False Then";
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
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="If dataPolicyState.LastOfflineDataRefreshState";
if (true) break;

case 28:
//if
this.state = 31;
if ((__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/ ).equals("message")) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=5177367;
 //BA.debugLineNum = 5177367;BA.debugLine="TraceLog(\"автостарт stop reason=server_message";
__ref._tracelog /*String*/ (null,"автостарт stop reason=server_message");
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="FailStartupSequence(\"server_message\")";
__ref._failstartupsequence /*String*/ (null,"server_message");
RDebugUtils.currentLine=5177369;
 //BA.debugLineNum = 5177369;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=5177371;
 //BA.debugLineNum = 5177371;BA.debugLine="If HasLocalPlaybackFallback Then";

case 31:
//if
this.state = 36;
if (__ref._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="playerDataCoordinator.ActivateLocalFallback(Fa";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._activatelocalfallback /*String*/ (null,parent.__c.False,"startup_local");
RDebugUtils.currentLine=5177373;
 //BA.debugLineNum = 5177373;BA.debugLine="TraceLog(\"автостарт fallback reason=fresh_data";
__ref._tracelog /*String*/ (null,"автостарт fallback reason=fresh_data_unavailable");
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=5177375;
 //BA.debugLineNum = 5177375;BA.debugLine="TraceLog(\"автостарт ошибка reason=no_local_que";
__ref._tracelog /*String*/ (null,"автостарт ошибка reason=no_local_queue");
RDebugUtils.currentLine=5177376;
 //BA.debugLineNum = 5177376;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=5177377;
 //BA.debugLineNum = 5177377;BA.debugLine="FailStartupSequence(\"no_local_fallback\")";
__ref._failstartupsequence /*String*/ (null,"no_local_fallback");
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="Return False";
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
RDebugUtils.currentLine=5177381;
 //BA.debugLineNum = 5177381;BA.debugLine="UpdateConnectionIndicator(\"online\")";
__ref._updateconnectionindicator /*String*/ (null,"online");
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
RDebugUtils.currentLine=5177384;
 //BA.debugLineNum = 5177384;BA.debugLine="ShowMessage(MessageValue(\"syncing\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"syncing"));
RDebugUtils.currentLine=5177385;
 //BA.debugLineNum = 5177385;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";
if (true) break;

case 41:
//if
this.state = 44;
if (__ref._isplaybackallowedbycurrentdata /*boolean*/ (null)==parent.__c.False) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=5177386;
 //BA.debugLineNum = 5177386;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReason";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null)),"server");
RDebugUtils.currentLine=5177387;
 //BA.debugLineNum = 5177387;BA.debugLine="FailStartupSequence(\"playback_not_allowed\")";
__ref._failstartupsequence /*String*/ (null,"playback_not_allowed");
RDebugUtils.currentLine=5177388;
 //BA.debugLineNum = 5177388;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 44:
//C
this.state = -1;
;
RDebugUtils.currentLine=5177390;
 //BA.debugLineNum = 5177390;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=5177391;
 //BA.debugLineNum = 5177391;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=5177392;
 //BA.debugLineNum = 5177392;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=5177393;
 //BA.debugLineNum = 5177393;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=5177394;
 //BA.debugLineNum = 5177394;BA.debugLine="TraceLog(\"автостарт воспроизведение начало\")";
__ref._tracelog /*String*/ (null,"автостарт воспроизведение начало");
RDebugUtils.currentLine=5177395;
 //BA.debugLineNum = 5177395;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 47;
return;
case 47:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5177396;
 //BA.debugLineNum = 5177396;BA.debugLine="CompleteStartupSequence";
__ref._completestartupsequence /*String*/ (null);
RDebugUtils.currentLine=5177397;
 //BA.debugLineNum = 5177397;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=5177398;
 //BA.debugLineNum = 5177398;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _tryenterstartupsequence(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tryenterstartupsequence", false))
	 {return ((Boolean) Debug.delegate(ba, "tryenterstartupsequence", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub TryEnterStartupSequence As Boolean";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="If isStartupSequenceInProgress Then Return False";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="isStartupSequenceInProgress = True";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="stateStore.SetStartupSequenceInProgress(True)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstartupsequenceinprogress /*String*/ (null,__c.True);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="stateStore.ClearDispatchRetryAfter";
__ref._statestore /*b4j.example.playerstatestore*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="End Sub";
return false;
}
public String  _setstopicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Private Sub SetStopIcon";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="uiController.SetStopIcon";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._setstopicon /*String*/ (null);
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="orbitPulseStep = 0";
__ref._orbitpulsestep /*int*/  = (int) (0);
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub ShowMessage(text As String)";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="uiController.ShowMessage(text)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return "";
}
public String  _updateconnectionindicator(b4j.example.b4xmainpage __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateconnectionindicator", false))
	 {return ((String) Debug.delegate(ba, "updateconnectionindicator", new Object[] {_mode}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub UpdateConnectionIndicator(mode As Stri";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="uiController.UpdateConnectionIndicator(mode)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updateconnectionindicator /*String*/ (null,_mode);
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub HideContentBlocks";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="uiController.HideContentBlocks";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startfirsttrack(b4j.example.b4xmainpage __ref,String _mode) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startfirsttrack", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "startfirsttrack", new Object[] {_mode}));}
ResumableSub_StartFirstTrack rsub = new ResumableSub_StartFirstTrack(this,__ref,_mode);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartFirstTrack extends BA.ResumableSub {
public ResumableSub_StartFirstTrack(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _mode) {
this.parent = parent;
this.__ref = __ref;
this._mode = _mode;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _mode;
boolean _started = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Wait For (Facade_StartFirstTrackCore(mode)) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startfirsttrack"), __ref._facade_startfirsttrackcore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mode));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_started = (boolean) result[1];
;
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Return started";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_started));return;};
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _completestartupsequence(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "completestartupsequence", false))
	 {return ((String) Debug.delegate(ba, "completestartupsequence", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub CompleteStartupSequence";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Facade_CompleteStartupSequenceCore";
__ref._facade_completestartupsequencecore /*String*/ (null);
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refreshofflinedatanow(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshofflinedatanow", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "refreshofflinedatanow", null));}
ResumableSub_RefreshOfflineDataNow rsub = new ResumableSub_RefreshOfflineDataNow(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefreshOfflineDataNow extends BA.ResumableSub {
public ResumableSub_RefreshOfflineDataNow(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _refreshed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._local_playback_only /*boolean*/ ) { 
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
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Wait For (playerDataCoordinator.RefreshOfflineDat";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "refreshofflinedatanow"), __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._fetch_timeout_ms /*int*/ ));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Return refreshed";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_refreshed));return;};
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _failstartupsequence(b4j.example.b4xmainpage __ref,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "failstartupsequence", false))
	 {return ((String) Debug.delegate(ba, "failstartupsequence", new Object[] {_reason}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub FailStartupSequence(reason As String)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If isStartupSequenceInProgress = False Then Retur";
if (__ref._isstartupsequenceinprogress /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="CancelDeferredPostStartTasks";
__ref._canceldeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="isStartupSequenceInProgress = False";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="stateStore.SetStartupSequenceInProgress(False)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstartupsequenceinprogress /*String*/ (null,__c.False);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_START_DELA";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="TraceWarn(\"player\", \"старт не завершен\", \"reason=";
__ref._tracewarn /*String*/ (null,"player","старт не завершен","reason="+_reason);
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="WriteHealthSnapshot(\"ошибка_старта\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_старта");
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="End Sub";
return "";
}
public boolean  _haslocalplaybackfallback(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haslocalplaybackfallback", false))
	 {return ((Boolean) Debug.delegate(ba, "haslocalplaybackfallback", null));}
anywheresoftware.b4a.objects.collections.Map _probeitem = null;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub HasLocalPlaybackFallback As Boolean";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (__ref._local_playback_only /*boolean*/ ) { 
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim probeItem As Map = stateStore.ResolveNextLoc";
_probeitem = new anywheresoftware.b4a.objects.collections.Map();
_probeitem = __ref._statestore /*b4j.example.playerstatestore*/ ._resolvenextlocaltrackitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Return probeItem.IsInitialized And probeItem.Siz";
if (true) return _probeitem.IsInitialized() && _probeitem.getSize()>0;
 };
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="If stateStore.HasAnyCachedTrack Then Return True";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="Return GetCurrentSlotLocalReserveCount > 0 Or sta";
if (true) return __ref._getcurrentslotlocalreservecount /*int*/ (null)>0 || __ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )>0;
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="End Sub";
return false;
}
public String  _handlelocaltemporarystate(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlelocaltemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handlelocaltemporarystate", new Object[] {_text}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub HandleLocalTemporaryState(text As Stri";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (__ref._local_playback_only /*boolean*/ ) { 
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="HandleNoLocalTracks(text)";
__ref._handlenolocaltracks /*String*/ (null,_text);
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="playerDataCoordinator.HandleLocalTemporaryState(t";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._handlelocaltemporarystate /*String*/ (null,_text);
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackallowedbycurrentdata(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackallowedbycurrentdata", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackallowedbycurrentdata", null));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub IsPlaybackAllowedByCurrentData As Bool";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Return playerDataCoordinator.IsPlaybackAllowed(st";
if (true) return __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._isplaybackallowed /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
return false;
}
public String  _pauseplaybackbypolicy(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "pauseplaybackbypolicy", false))
	 {return ((String) Debug.delegate(ba, "pauseplaybackbypolicy", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub PausePlaybackByPolicy(reason As String";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Facade_PausePlaybackCore(reason, connectionMode)";
__ref._facade_pauseplaybackcore /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackblockreason(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplaybackblockreason", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackblockreason", new Object[] {_data}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub ResolvePlaybackBlockReason(data As Map";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Return playerDataCoordinator.ResolvePlaybackBlock";
if (true) return __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._resolveplaybackblockreason /*String*/ (null,_data,__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub B4XPage_Created (root1 As B4XView)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="rootView = root1";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="B4XPages.SetTitle(Me, Main.LabelName)";
_b4xpages._settitle /*String*/ (this,(Object)(_main._labelname /*String*/ ));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="rootView.Color = 0xFF0E0F11";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff0e0f11));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="InitSettings";
__ref._initsettings /*String*/ (null);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="InitState";
__ref._initstate /*String*/ (null);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="BuildUi";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="uiController.Initialize(xui, lblStream, lblInfo,";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._initialize /*String*/ (null,ba,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._icon_cloud_ok /*String*/ ,__ref._icon_cloud_off /*String*/ ,__ref._icon_cloud_degraded /*String*/ ,__ref._icon_more /*String*/ ,__ref._icon_close /*String*/ ,__ref._icon_play /*String*/ ,__ref._icon_stop /*String*/ );
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="RestoreWindowState";
__ref._restorewindowstate /*String*/ (null);
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="audioPrimary.Initialize(\"AudioPrimary\", Me)";
__ref._audioprimary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioPrimary",(b4j.example.b4xmainpage)(this));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="audioSecondary.Initialize(\"AudioSecondary\", Me)";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioSecondary",(b4j.example.b4xmainpage)(this));
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="autoCacheManager.Initialize(storage, offlineStore";
__ref._autocachemanager /*b4j.example.autonomouscachemanager*/ ._initialize /*String*/ (null,ba,__ref._storage /*b4j.example.keyvaluestore*/ ,__ref._offlinestoreservice /*b4j.example.offlinestore*/ ,__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ,__ref._mediacacheservice /*b4j.example.mediacache*/ ,this,"TraceLog");
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="autoCacheManager.Configure(30000, 8, 4, 2, 2)";
__ref._autocachemanager /*b4j.example.autonomouscachemanager*/ ._configure /*String*/ (null,(int) (30000),(int) (8),(int) (4),(int) (2),(int) (2));
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="autoCacheManager.SetCooldowns(15000, 120000, 6000";
__ref._autocachemanager /*b4j.example.autonomouscachemanager*/ ._setcooldowns /*String*/ (null,(long) (15000),(long) (120000),(long) (60000));
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="autoCacheManager.Start";
__ref._autocachemanager /*b4j.example.autonomouscachemanager*/ ._start /*String*/ (null);
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="TraceInfo(\"app\", \"запуск\", \"version=\" & ResolveAp";
__ref._traceinfo /*String*/ (null,"app","запуск","version="+__ref._resolveappversion /*String*/ (null)+" player="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="TraceInfo(\"system\", \"устройство\", \"name=\" & Resol";
__ref._traceinfo /*String*/ (null,"system","устройство","name="+__ref._resolvedevicetracename /*String*/ (null)+" id="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="TraceInfo(\"system\", \"платформа\", \"os=\" & ResolveC";
__ref._traceinfo /*String*/ (null,"system","платформа","os="+__ref._resolveclientplatformtext /*String*/ (null));
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="TraceInfo(\"system\", \"диск\", \"diskFreeMb=\" & Resol";
__ref._traceinfo /*String*/ (null,"system","диск","diskFreeMb="+__ref._resolvefreediskmbtext /*String*/ (null)+" diskTotalMb="+__ref._resolvetotaldiskmbtext /*String*/ (null));
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="WriteHealthSnapshot(\"запуск\")";
__ref._writehealthsnapshot /*String*/ (null,"запуск");
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="StartOfflineDataRefresh";
__ref._startofflinedatarefresh /*String*/ (null);
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="ShowInitialScreen";
__ref._showinitialscreen /*String*/ (null);
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="End Sub";
return "";
}
public String  _initsettings(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initsettings", false))
	 {return ((String) Debug.delegate(ba, "initsettings", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub InitSettings";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="messages.Initialize";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="messages.Put(\"network\", \"Проверьте интернет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("network"),(Object)("Проверьте интернет"));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="messages.Put(\"connecting\", \"Подключение...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("connecting"),(Object)("Подключение..."));
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="messages.Put(\"syncing\", \"Синхронизация...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("syncing"),(Object)("Синхронизация..."));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="messages.Put(\"server_wait\", \"Временная остановка\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("server_wait"),(Object)("Временная остановка"));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="messages.Put(\"playback_paused\", \"Воспроизведение";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("playback_paused"),(Object)("Воспроизведение приостановлено"));
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="messages.Put(\"audio_device_check\", \"Проверьте зву";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("audio_device_check"),(Object)("Проверьте звуковое устройство"));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="messages.Put(\"subscription_expired\", \"Подписка ис";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("subscription_expired"),(Object)("Подписка истекла"));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="messages.Put(\"invalid_data_response\", \"Ошибка отв";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("invalid_data_response"),(Object)("Ошибка ответа сервера. Обратитесь в техподдержку"));
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="messages.Put(\"idle\", \"Перерыв...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle"),(Object)("Перерыв..."));
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="messages.Put(\"idle_until\", \"Перерыв до {time}\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_until"),(Object)("Перерыв до {time}"));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="messages.Put(\"blocked\", \"Плеер заблокирован\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blocked"),(Object)("Плеер заблокирован"));
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="messages.Put(\"idle_stream\", \"Запусти поток\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_stream"),(Object)("Запусти поток"));
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="messages.Put(\"player_required\", \"Не указан плеер\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_required"),(Object)("Не указан плеер"));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="messages.Put(\"device_required\", \"Не указано устро";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_required"),(Object)("Не указано устройство"));
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="messages.Put(\"device_busy\", \"Плеер играет на друг";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_busy"),(Object)("Плеер играет на другом устройстве. Играть здесь?"));
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="messages.Put(\"device_confirm_yes\", \"Да\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_yes"),(Object)("Да"));
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="messages.Put(\"device_confirm_no\", \"Нет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_no"),(Object)("Нет"));
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="messages.Put(\"not_found\", \"Плеер не найден\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("not_found"),(Object)("Плеер не найден"));
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="messages.Put(\"player_updated\", \"Плеер обновлен\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_updated"),(Object)("Плеер обновлен"));
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="messages.Put(\"player_reloading\", \"Обновление…\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_reloading"),(Object)("Обновление…"));
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="messages.Put(\"ad_label\", \"Реклама\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ad_label"),(Object)("Реклама"));
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="messages.Put(\"setup_title\", \"Введите код плеера\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_title"),(Object)("Введите код плеера"));
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="messages.Put(\"setup_placeholder\", \"\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_placeholder"),(Object)(""));
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="messages.Put(\"setup_submit\", \"Войти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_submit"),(Object)("Войти"));
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="messages.Put(\"setup_invalid\", \"Введите код из 5 с";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_invalid"),(Object)("Введите код из 5 символов"));
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="messages.Put(\"logout\", \"Выйти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("logout"),(Object)("Выйти"));
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="messages.Put(\"settings_open\", \"Настройки\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_open"),(Object)("Настройки"));
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="messages.Put(\"settings_close\", \"Закрыть\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_close"),(Object)("Закрыть"));
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="messages.Put(\"settings_thanks\", \"Спасибо!\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_thanks"),(Object)("Спасибо!"));
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="End Sub";
return "";
}
public String  _initstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initstate", false))
	 {return ((String) Debug.delegate(ba, "initstate", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub InitState";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="storageDir = PlatformBridge.ResolveStorageDir(\"fo";
__ref._storagedir /*String*/  = _platformbridge._resolvestoragedir /*String*/ ("fonfm");
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="appUpdateDir = PlatformBridge.ResolveUpdateStageD";
__ref._appupdatedir /*String*/  = _platformbridge._resolveupdatestagedir /*String*/ (__ref._storagedir /*String*/ );
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="debugResponsesDir = File.Combine(storageDir, \"deb";
__ref._debugresponsesdir /*String*/  = __c.File.Combine(__ref._storagedir /*String*/ ,"debugresponses");
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="EnsureDirectory(appUpdateDir)";
__ref._ensuredirectory /*String*/ (null,__ref._appupdatedir /*String*/ );
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="EnsureDirectory(GetHistoryDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="RndSeed(DateTime.Now)";
__c.RndSeed(__c.DateTime.getNow());
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="storage.Initialize(storageDir, localStateDbName)";
__ref._storage /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._localstatedbname /*String*/ );
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="MigrateLegacyStorageIfNeeded";
__ref._migratelegacystorageifneeded /*String*/ (null);
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="playerCode = NormalizePlayerCode(storage.GetDefau";
__ref._playercode /*String*/  = __ref._normalizeplayercode /*String*/ (null,BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"player_code",(Object)(""))));
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="appTraceService.Initialize(storageDir, debugRespo";
__ref._apptraceservice /*b4j.example.traceservice*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._debugresponsesdir /*String*/ ,__ref._traceloglimit /*int*/ ,__ref._serversnapshotlimit /*int*/ );
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="traceFormatter.Initialize";
__ref._traceformatter /*b4j.example.playbacktraceformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="traceRouter.Initialize(appTraceService, traceForm";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._initialize /*String*/ (null,ba,__ref._apptraceservice /*b4j.example.traceservice*/ ,__ref._traceformatter /*b4j.example.playbacktraceformatter*/ ,__ref._isreleasebuild /*boolean*/ (null),__ref._trace_error_debug_context_lines /*int*/ );
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="playQueue.Initialize";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="orchestrationState.Initialize";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="runtimeState.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="metaState.Initialize";
__ref._metastate /*b4j.example.playbackmetastate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="dataPolicyState.Initialize";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="directorState.Initialize";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="directorState.ConfigureDefaultSlots";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._configuredefaultslots /*String*/ (null);
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="offlinePlaybackCore.Initialize";
__ref._offlineplaybackcore /*b4j.example.offlineplaybackengine*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="transitionCoordinator.Initialize(Me)";
__ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._initialize /*String*/ (null,ba,(b4j.example.b4xmainpage)(this));
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="localAdScheduler.Initialize(Me, \"TraceLog\", Messa";
__ref._localadscheduler /*b4j.example.adscheduler*/ ._initialize /*String*/ (null,ba,this,"TraceLog",__ref._messagevalue /*String*/ (null,"ad_label"));
RDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="dataResolver.Initialize(storageDir, Me, \"TraceLog";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,this,"TraceLog");
RDebugUtils.currentLine=2162713;
 //BA.debugLineNum = 2162713;BA.debugLine="dataResolver.LoadState(storage)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadstate /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ );
RDebugUtils.currentLine=2162714;
 //BA.debugLineNum = 2162714;BA.debugLine="TraceLog(\"курсор плейлистов load count=\" & dataRe";
__ref._tracelog /*String*/ (null,"курсор плейлистов load count="+BA.NumberToString(__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._cursorcount /*int*/ (null)));
RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="deviceId = GetOrCreateDeviceId";
__ref._deviceid /*String*/  = __ref._getorcreatedeviceid /*String*/ (null);
RDebugUtils.currentLine=2162716;
 //BA.debugLineNum = 2162716;BA.debugLine="mediaCacheService.Initialize(storageDir, storage,";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,this,"TraceLog",__ref._deviceid /*String*/ );
RDebugUtils.currentLine=2162717;
 //BA.debugLineNum = 2162717;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=2162718;
 //BA.debugLineNum = 2162718;BA.debugLine="retryTimer.Initialize(\"RetryTimer\", SERVER_RETRY_";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"RetryTimer",(long) (__ref._server_retry_delay_initial /*int*/ ));
RDebugUtils.currentLine=2162719;
 //BA.debugLineNum = 2162719;BA.debugLine="breakTimer.Initialize(\"BreakTimer\", 1000)";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"BreakTimer",(long) (1000));
RDebugUtils.currentLine=2162720;
 //BA.debugLineNum = 2162720;BA.debugLine="historyFlushTimer.Initialize(\"HistoryFlushTimer\",";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"HistoryFlushTimer",(long) (__ref._history_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=2162721;
 //BA.debugLineNum = 2162721;BA.debugLine="traceUploadTimer.Initialize(\"TraceUploadTimer\", T";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TraceUploadTimer",(long) (__ref._trace_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=2162722;
 //BA.debugLineNum = 2162722;BA.debugLine="orbitTimer.Initialize(\"OrbitTimer\", 70)";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OrbitTimer",(long) (70));
RDebugUtils.currentLine=2162723;
 //BA.debugLineNum = 2162723;BA.debugLine="offlineDataRefreshTimer.Initialize(\"OfflineDataRe";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OfflineDataRefreshTimer",(long) (__ref._data_refresh_ms /*int*/ ));
RDebugUtils.currentLine=2162724;
 //BA.debugLineNum = 2162724;BA.debugLine="localAdMinuteTimer.Initialize(\"LocalAdMinuteTimer";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LocalAdMinuteTimer",(long) (1000));
RDebugUtils.currentLine=2162725;
 //BA.debugLineNum = 2162725;BA.debugLine="cacheAuditTimer.Initialize(\"CacheAuditTimer\", CAC";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CacheAuditTimer",(long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=2162726;
 //BA.debugLineNum = 2162726;BA.debugLine="playbackWatchdogTimer.Initialize(\"PlaybackWatchdo";
__ref._playbackwatchdogtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"PlaybackWatchdogTimer",(long) (__ref._playback_watchdog_interval_ms /*int*/ ));
RDebugUtils.currentLine=2162727;
 //BA.debugLineNum = 2162727;BA.debugLine="playbackDirectorTimer.Initialize(\"PlaybackDirecto";
__ref._playbackdirectortimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"PlaybackDirectorTimer",(long) (__ref._playback_director_interval_ms /*int*/ ));
RDebugUtils.currentLine=2162728;
 //BA.debugLineNum = 2162728;BA.debugLine="offlineStoreService.Initialize(storageDir, storag";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,this,"TraceLog",__ref._playerdatafile /*String*/ ,__ref._playlistrequirementsfile /*String*/ ,__ref._localplaylistsdirname /*String*/ ,__ref._playlist_cdn_base_url /*String*/ );
RDebugUtils.currentLine=2162729;
 //BA.debugLineNum = 2162729;BA.debugLine="stateStore.Initialize(Me, retryTimer, dataPolicyS";
__ref._statestore /*b4j.example.playerstatestore*/ ._initialize /*String*/ (null,ba,(b4j.example.b4xmainpage)(this),__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ ,__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,__ref._trustedsynctimekey /*String*/ ,__ref._offlinestoreservice /*b4j.example.offlinestore*/ ,__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ,__ref._mediacacheservice /*b4j.example.mediacache*/ ,__ref._local_retry_delay_initial /*int*/ ,__ref._server_retry_delay_initial /*int*/ );
RDebugUtils.currentLine=2162730;
 //BA.debugLineNum = 2162730;BA.debugLine="syncService.Initialize(stateStore)";
__ref._syncservice /*b4j.example.networksyncservice*/ ._initialize /*String*/ (null,ba,__ref._statestore /*b4j.example.playerstatestore*/ );
RDebugUtils.currentLine=2162731;
 //BA.debugLineNum = 2162731;BA.debugLine="traceUploader.Initialize(stateStore, appTraceServ";
__ref._traceuploader /*b4j.example.playbacktraceuploader*/ ._initialize /*String*/ (null,ba,__ref._statestore /*b4j.example.playerstatestore*/ ,__ref._apptraceservice /*b4j.example.traceservice*/ ,__ref._syncservice /*b4j.example.networksyncservice*/ ,__ref._trace_base_url /*String*/ ,__ref._resolveappversion /*String*/ (null));
RDebugUtils.currentLine=2162732;
 //BA.debugLineNum = 2162732;BA.debugLine="playerDataCoordinator.Initialize(stateStore, sync";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._initialize /*String*/ (null,ba,__ref._statestore /*b4j.example.playerstatestore*/ ,__ref._syncservice /*b4j.example.networksyncservice*/ );
RDebugUtils.currentLine=2162733;
 //BA.debugLineNum = 2162733;BA.debugLine="playbackWatchdogTimer.Enabled = True";
__ref._playbackwatchdogtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2162734;
 //BA.debugLineNum = 2162734;BA.debugLine="playbackDirectorTimer.Enabled = True";
__ref._playbackdirectortimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2162735;
 //BA.debugLineNum = 2162735;BA.debugLine="isHistoryFlushInProgress = False";
__ref._ishistoryflushinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=2162736;
 //BA.debugLineNum = 2162736;BA.debugLine="isPlaybackWatchdogTickInProgress = False";
__ref._isplaybackwatchdogtickinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=2162737;
 //BA.debugLineNum = 2162737;BA.debugLine="isPlaybackDirectorTickQueued = False";
__ref._isplaybackdirectortickqueued /*boolean*/  = __c.False;
RDebugUtils.currentLine=2162738;
 //BA.debugLineNum = 2162738;BA.debugLine="isStartupSequenceInProgress = False";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=2162739;
 //BA.debugLineNum = 2162739;BA.debugLine="stateStore.SetStartupSequenceInProgress(False)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstartupsequenceinprogress /*String*/ (null,__c.False);
RDebugUtils.currentLine=2162740;
 //BA.debugLineNum = 2162740;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=2162741;
 //BA.debugLineNum = 2162741;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=2162742;
 //BA.debugLineNum = 2162742;BA.debugLine="cachedRelevantTrackIds.Initialize";
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=2162743;
 //BA.debugLineNum = 2162743;BA.debugLine="audioTimeupdateQueuedByKey.Initialize";
__ref._audiotimeupdatequeuedbykey /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2162744;
 //BA.debugLineNum = 2162744;BA.debugLine="lastTrackCachePruneAt = 0";
__ref._lasttrackcachepruneat /*long*/  = (long) (0);
RDebugUtils.currentLine=2162745;
 //BA.debugLineNum = 2162745;BA.debugLine="playbackFlowState = FLOW_IDLE";
__ref._playbackflowstate /*String*/  = __ref._flow_idle /*String*/ ;
RDebugUtils.currentLine=2162746;
 //BA.debugLineNum = 2162746;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=2162747;
 //BA.debugLineNum = 2162747;BA.debugLine="directorState.SetFlowState(playbackFlowState)";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setflowstate /*String*/ (null,__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=2162748;
 //BA.debugLineNum = 2162748;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
RDebugUtils.currentLine=2162749;
 //BA.debugLineNum = 2162749;BA.debugLine="stateStore.SetOfflineData(offlineStoreService.Loa";
__ref._statestore /*b4j.example.playerstatestore*/ ._setofflinedata /*String*/ (null,__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=2162750;
 //BA.debugLineNum = 2162750;BA.debugLine="RefreshPendingHistoryState";
__ref._refreshpendinghistorystate /*String*/ (null);
RDebugUtils.currentLine=2162751;
 //BA.debugLineNum = 2162751;BA.debugLine="ResolveMachineGuidAsync";
__ref._resolvemachineguidasync /*String*/ (null);
RDebugUtils.currentLine=2162752;
 //BA.debugLineNum = 2162752;BA.debugLine="TraceLog(\"состояние init dir=\" & storageDir & \" p";
__ref._tracelog /*String*/ (null,"состояние init dir="+__ref._storagedir /*String*/ +" player="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=2162753;
 //BA.debugLineNum = 2162753;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub BuildUi";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="card = xui.CreatePanel(\"\")";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="headerPane = xui.CreatePanel(\"\")";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="headerActionPane = xui.CreatePanel(\"HeaderActionP";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"HeaderActionPane");
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="contentPane = xui.CreatePanel(\"\")";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="footerPane = xui.CreatePanel(\"\")";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="setupPane = xui.CreatePanel(\"\")";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="playerPane = xui.CreatePanel(\"\")";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="setupHeroPane = xui.CreatePanel(\"\")";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="setupDetailPane = xui.CreatePanel(\"\")";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="setupPrimaryPane = xui.CreatePanel(\"\")";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="setupStatusPane = xui.CreatePanel(\"\")";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="playerHeroPane = xui.CreatePanel(\"\")";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="playerDetailPane = xui.CreatePanel(\"\")";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="playerPrimaryPane = xui.CreatePanel(\"\")";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="playerStatusPane = xui.CreatePanel(\"\")";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="orbitPane = xui.CreatePanel(\"\")";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="playButtonPane = xui.CreatePanel(\"PlayButtonPane\"";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"PlayButtonPane");
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="confirmPane = xui.CreatePanel(\"\")";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228243;
 //BA.debugLineNum = 2228243;BA.debugLine="accessCirclePane = xui.CreatePanel(\"\")";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="accessCorePane = xui.CreatePanel(\"\")";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="accessInputPane = xui.CreatePanel(\"\")";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=2228247;
 //BA.debugLineNum = 2228247;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=2228248;
 //BA.debugLineNum = 2228248;BA.debugLine="accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4d";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0x07ffffff),__c.DipToCurrent((int) (4)),((int)0x55ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=2228249;
 //BA.debugLineNum = 2228249;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=2228250;
 //BA.debugLineNum = 2228250;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=2228251;
 //BA.debugLineNum = 2228251;BA.debugLine="playButtonPane.SetColorAndBorder(xui.Color_Transp";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (4)),((int)0x33ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=2228252;
 //BA.debugLineNum = 2228252;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=2228253;
 //BA.debugLineNum = 2228253;BA.debugLine="headerActionPane.SetColorAndBorder(xui.Color_Tran";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=2228255;
 //BA.debugLineNum = 2228255;BA.debugLine="lblHeader = CreateLabel(\"\", 12, 0xFF747B86, False";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=2228256;
 //BA.debugLineNum = 2228256;BA.debugLine="lblHeaderAction = CreateLabel(ICON_MORE, 22, 0xFF";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_more /*String*/ ,(float) (22),((int)0xffb9c0c9),__c.False,__c.False);
RDebugUtils.currentLine=2228257;
 //BA.debugLineNum = 2228257;BA.debugLine="lblPlayIcon = CreateLabel(ICON_PLAY, 48, 0xFFD0FF";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_play /*String*/ ,(float) (48),((int)0xffd0ff71),__c.False,__c.False);
RDebugUtils.currentLine=2228258;
 //BA.debugLineNum = 2228258;BA.debugLine="lblStream = CreateLabel(\"\", 36, 0xFFD0FF71, True,";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (36),((int)0xffd0ff71),__c.True,__c.True);
RDebugUtils.currentLine=2228259;
 //BA.debugLineNum = 2228259;BA.debugLine="lblInfo = CreateLabel(\"\", 17, 0xFFBCC3CD, False,";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=2228260;
 //BA.debugLineNum = 2228260;BA.debugLine="lblFooter = CreateLabel(Main.LabelName & \" \" & Re";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_main._labelname /*String*/ +" "+__ref._resolveappversion /*String*/ (null),(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=2228261;
 //BA.debugLineNum = 2228261;BA.debugLine="lblConnectionIcon = CreateLabel(ICON_CLOUD_OK, 16";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_cloud_ok /*String*/ ,(float) (16),((int)0xff747b86),__c.False,__c.False);
RDebugUtils.currentLine=2228262;
 //BA.debugLineNum = 2228262;BA.debugLine="lblSetupMessage = CreateLabel(\"\", 17, 0xFFBCC3CD,";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=2228264;
 //BA.debugLineNum = 2228264;BA.debugLine="txtPlayerCode.Initialize(\"txtPlayerCode\")";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"txtPlayerCode");
RDebugUtils.currentLine=2228265;
 //BA.debugLineNum = 2228265;BA.debugLine="txtPlayerCodeView = txtPlayerCode";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=2228266;
 //BA.debugLineNum = 2228266;BA.debugLine="btnSetupSubmit = CreateTextButton(MessageValue(\"s";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"setup_submit"),"BtnSetupSubmit");
RDebugUtils.currentLine=2228267;
 //BA.debugLineNum = 2228267;BA.debugLine="btnConfirmYes = CreateTextButton(MessageValue(\"de";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_yes"),"BtnConfirmYes");
RDebugUtils.currentLine=2228268;
 //BA.debugLineNum = 2228268;BA.debugLine="btnConfirmNo = CreateTextButton(MessageValue(\"dev";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_no"),"BtnConfirmNo");
RDebugUtils.currentLine=2228269;
 //BA.debugLineNum = 2228269;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=2228270;
 //BA.debugLineNum = 2228270;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=2228271;
 //BA.debugLineNum = 2228271;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=2228273;
 //BA.debugLineNum = 2228273;BA.debugLine="rootView.AddView(card, 0, 0, 0, 0)";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228274;
 //BA.debugLineNum = 2228274;BA.debugLine="card.AddView(headerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228275;
 //BA.debugLineNum = 2228275;BA.debugLine="card.AddView(contentPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228276;
 //BA.debugLineNum = 2228276;BA.debugLine="card.AddView(footerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228277;
 //BA.debugLineNum = 2228277;BA.debugLine="headerPane.AddView(lblHeader, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228278;
 //BA.debugLineNum = 2228278;BA.debugLine="headerPane.AddView(headerActionPane, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228279;
 //BA.debugLineNum = 2228279;BA.debugLine="headerActionPane.AddView(lblHeaderAction, 0, 0, 0";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228280;
 //BA.debugLineNum = 2228280;BA.debugLine="contentPane.AddView(setupPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228281;
 //BA.debugLineNum = 2228281;BA.debugLine="contentPane.AddView(playerPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228282;
 //BA.debugLineNum = 2228282;BA.debugLine="footerPane.AddView(lblFooter, 0, 0, 0, 0)";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228283;
 //BA.debugLineNum = 2228283;BA.debugLine="footerPane.AddView(lblConnectionIcon, 0, 0, 0, 0)";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228285;
 //BA.debugLineNum = 2228285;BA.debugLine="setupPane.AddView(setupHeroPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228286;
 //BA.debugLineNum = 2228286;BA.debugLine="setupPane.AddView(setupDetailPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228287;
 //BA.debugLineNum = 2228287;BA.debugLine="setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228288;
 //BA.debugLineNum = 2228288;BA.debugLine="setupHeroPane.AddView(accessCirclePane, 0, 0, 0,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228289;
 //BA.debugLineNum = 2228289;BA.debugLine="accessCirclePane.AddView(accessInputPane, 0, 0, 0";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228290;
 //BA.debugLineNum = 2228290;BA.debugLine="accessInputPane.AddView(txtPlayerCodeView, 0, 0,";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228291;
 //BA.debugLineNum = 2228291;BA.debugLine="setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228292;
 //BA.debugLineNum = 2228292;BA.debugLine="setupDetailPane.AddView(setupStatusPane, 0, 0, 0,";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228293;
 //BA.debugLineNum = 2228293;BA.debugLine="setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0,";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228294;
 //BA.debugLineNum = 2228294;BA.debugLine="setupStatusPane.AddView(lblSetupMessage, 0, 0, 0,";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228296;
 //BA.debugLineNum = 2228296;BA.debugLine="playerPane.AddView(playerHeroPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228297;
 //BA.debugLineNum = 2228297;BA.debugLine="playerPane.AddView(playerDetailPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228298;
 //BA.debugLineNum = 2228298;BA.debugLine="playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228299;
 //BA.debugLineNum = 2228299;BA.debugLine="playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228300;
 //BA.debugLineNum = 2228300;BA.debugLine="playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228301;
 //BA.debugLineNum = 2228301;BA.debugLine="playerDetailPane.AddView(playerPrimaryPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228302;
 //BA.debugLineNum = 2228302;BA.debugLine="playerDetailPane.AddView(playerStatusPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228303;
 //BA.debugLineNum = 2228303;BA.debugLine="playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228304;
 //BA.debugLineNum = 2228304;BA.debugLine="playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228305;
 //BA.debugLineNum = 2228305;BA.debugLine="playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228306;
 //BA.debugLineNum = 2228306;BA.debugLine="confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228307;
 //BA.debugLineNum = 2228307;BA.debugLine="confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=2228309;
 //BA.debugLineNum = 2228309;BA.debugLine="SetPaneStyle(card, \"-fx-background-radius: 24; -f";
__ref._setpanestyle /*String*/ (null,__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 24; -fx-border-radius: 24;");
RDebugUtils.currentLine=2228310;
 //BA.debugLineNum = 2228310;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=2228311;
 //BA.debugLineNum = 2228311;BA.debugLine="SetPaneStyle(playButtonPane, \"-fx-cursor: hand; -";
__ref._setpanestyle /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=2228312;
 //BA.debugLineNum = 2228312;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=2228313;
 //BA.debugLineNum = 2228313;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=2228314;
 //BA.debugLineNum = 2228314;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=2228315;
 //BA.debugLineNum = 2228315;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffddf1ff))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x7affffff))+"; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=2228316;
 //BA.debugLineNum = 2228316;BA.debugLine="accessCorePane.Visible = True";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2228317;
 //BA.debugLineNum = 2228317;BA.debugLine="accessCirclePane.Visible = True";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2228318;
 //BA.debugLineNum = 2228318;BA.debugLine="accessInputPane.Visible = True";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2228319;
 //BA.debugLineNum = 2228319;BA.debugLine="SetPickOnBounds(headerActionPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=2228320;
 //BA.debugLineNum = 2228320;BA.debugLine="SetPickOnBounds(playButtonPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=2228321;
 //BA.debugLineNum = 2228321;BA.debugLine="txtPlayerCode.PromptText = MessageValue(\"setup_pl";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setPromptText(__ref._messagevalue /*String*/ (null,"setup_placeholder").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=2228322;
 //BA.debugLineNum = 2228322;BA.debugLine="txtPlayerCode.Visible = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2228323;
 //BA.debugLineNum = 2228323;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=2228324;
 //BA.debugLineNum = 2228324;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=2228325;
 //BA.debugLineNum = 2228325;BA.debugLine="UpdateCodeInputAppearance(False)";
__ref._updatecodeinputappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=2228326;
 //BA.debugLineNum = 2228326;BA.debugLine="BringToFront(accessCorePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2228327;
 //BA.debugLineNum = 2228327;BA.debugLine="BringToFront(accessCirclePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2228328;
 //BA.debugLineNum = 2228328;BA.debugLine="BringToFront(accessInputPane)";
__ref._bringtofront /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2228329;
 //BA.debugLineNum = 2228329;BA.debugLine="BringToFront(txtPlayerCodeView)";
__ref._bringtofront /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2228331;
 //BA.debugLineNum = 2228331;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2228332;
 //BA.debugLineNum = 2228332;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatevisiblemode", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblemode", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub UpdateVisibleMode";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="uiController.UpdateVisibleMode(appScreenMode)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updatevisiblemode /*String*/ (null,__ref._appscreenmode /*String*/ );
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public String  _restorewindowstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "restorewindowstate", false))
	 {return ((String) Debug.delegate(ba, "restorewindowstate", null));}
anywheresoftware.b4j.objects.Form _form = null;
anywheresoftware.b4j.objects.JFX _fx = null;
double _windowtop = 0;
double _windowleft = 0;
double _windowwidth = 0;
double _windowheight = 0;
double _maxwidth = 0;
double _maxheight = 0;
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Private Sub RestoreWindowState";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Try";
try {RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="Dim form As Form = B4XPages.GetNativeParent(Me)";
_form = _b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this);
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="If form.IsInitialized = False Then Return";
if (_form.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="Dim windowTop As Double = storage.GetDefault(\"Wi";
_windowtop = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowTop",(Object)(-1))));
RDebugUtils.currentLine=24641543;
 //BA.debugLineNum = 24641543;BA.debugLine="Dim windowLeft As Double = storage.GetDefault(\"W";
_windowleft = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowLeft",(Object)(-1))));
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="Dim windowWidth As Double = storage.GetDefault(\"";
_windowwidth = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowWidth",(Object)(-1))));
RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="Dim windowHeight As Double = storage.GetDefault(";
_windowheight = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowHeight",(Object)(-1))));
RDebugUtils.currentLine=24641546;
 //BA.debugLineNum = 24641546;BA.debugLine="Dim maxWidth As Double = fx.PrimaryScreen.MaxX -";
_maxwidth = _fx.getPrimaryScreen().getMaxX()-_fx.getPrimaryScreen().getMinX();
RDebugUtils.currentLine=24641547;
 //BA.debugLineNum = 24641547;BA.debugLine="Dim maxHeight As Double = fx.PrimaryScreen.MaxY";
_maxheight = _fx.getPrimaryScreen().getMaxY()-_fx.getPrimaryScreen().getMinY();
RDebugUtils.currentLine=24641548;
 //BA.debugLineNum = 24641548;BA.debugLine="If windowTop > -1 Then form.WindowTop = windowTo";
if (_windowtop>-1) { 
_form.setWindowTop(_windowtop);};
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="If windowLeft > -1 Then form.WindowLeft = window";
if (_windowleft>-1) { 
_form.setWindowLeft(_windowleft);};
RDebugUtils.currentLine=24641550;
 //BA.debugLineNum = 24641550;BA.debugLine="If windowWidth > -1 Then form.WindowWidth = Min(";
if (_windowwidth>-1) { 
_form.setWindowWidth(__c.Min(_maxwidth,__c.Max(520,_windowwidth)));};
RDebugUtils.currentLine=24641551;
 //BA.debugLineNum = 24641551;BA.debugLine="If windowHeight > -1 Then";
if (_windowheight>-1) { 
RDebugUtils.currentLine=24641552;
 //BA.debugLineNum = 24641552;BA.debugLine="form.WindowHeight = Min(maxHeight, Max(640, win";
_form.setWindowHeight(__c.Min(_maxheight,__c.Max(640,_windowheight)));
 }else 
{RDebugUtils.currentLine=24641553;
 //BA.debugLineNum = 24641553;BA.debugLine="Else If maxHeight < 640 Then";
if (_maxheight<640) { 
RDebugUtils.currentLine=24641554;
 //BA.debugLineNum = 24641554;BA.debugLine="form.WindowHeight = maxHeight";
_form.setWindowHeight(_maxheight);
 }}
;
RDebugUtils.currentLine=24641556;
 //BA.debugLineNum = 24641556;BA.debugLine="TraceLog(\"окно restore left=\" & form.WindowLeft";
__ref._tracelog /*String*/ (null,"окно restore left="+BA.NumberToString(_form.getWindowLeft())+" top="+BA.NumberToString(_form.getWindowTop())+" width="+BA.NumberToString(_form.getWindowWidth())+" height="+BA.NumberToString(_form.getWindowHeight()));
 } 
       catch (Exception e21) {
			ba.setLastException(e21);RDebugUtils.currentLine=24641558;
 //BA.debugLineNum = 24641558;BA.debugLine="TraceLog(\"окно restore ошибка message=\" & LastEx";
__ref._tracelog /*String*/ (null,"окно restore ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=24641561;
 //BA.debugLineNum = 24641561;BA.debugLine="End Sub";
return "";
}
public String  _resolveappversion(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveappversion", false))
	 {return ((String) Debug.delegate(ba, "resolveappversion", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub ResolveAppVersion As String";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If Main.VersionName <> \"\" Then Return Main.Versio";
if ((_main._versionname /*String*/ ).equals("") == false) { 
if (true) return _main._versionname /*String*/ ;};
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Return \"\" & Main.VersionCode";
if (true) return ""+BA.NumberToString(_main._versioncode /*int*/ );
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return "";
}
public String  _formatplayercodefordisplay(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formatplayercodefordisplay", false))
	 {return ((String) Debug.delegate(ba, "formatplayercodefordisplay", new Object[] {_value}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub FormatPlayerCodeForDisplay(value As St";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Return value.Trim.ToUpperCase";
if (true) return _value.trim().toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="End Sub";
return "";
}
public String  _resolvedevicetracename(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvedevicetracename", false))
	 {return ((String) Debug.delegate(ba, "resolvedevicetracename", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Private Sub ResolveDeviceTraceName As String";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Return PlatformBridge.ResolveDeviceTraceName";
if (true) return _platformbridge._resolvedevicetracename /*String*/ ();
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="End Sub";
return "";
}
public String  _resolveclientplatformtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveclientplatformtext", false))
	 {return ((String) Debug.delegate(ba, "resolveclientplatformtext", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Private Sub ResolveClientPlatformText As String";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Return PlatformBridge.ResolveClientPlatformText";
if (true) return _platformbridge._resolveclientplatformtext /*String*/ ();
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="End Sub";
return "";
}
public String  _resolvefreediskmbtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvefreediskmbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvefreediskmbtext", null));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub ResolveFreeDiskMbText As String";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Return PlatformBridge.ResolveFreeDiskMbText(stora";
if (true) return _platformbridge._resolvefreediskmbtext /*String*/ (__ref._storagedir /*String*/ );
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="End Sub";
return "";
}
public String  _resolvetotaldiskmbtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvetotaldiskmbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvetotaldiskmbtext", null));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub ResolveTotalDiskMbText As String";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Return PlatformBridge.ResolveTotalDiskMbText(stor";
if (true) return _platformbridge._resolvetotaldiskmbtext /*String*/ (__ref._storagedir /*String*/ );
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="End Sub";
return "";
}
public String  _writehealthsnapshot(b4j.example.b4xmainpage __ref,String _trigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "writehealthsnapshot", false))
	 {return ((String) Debug.delegate(ba, "writehealthsnapshot", new Object[] {_trigger}));}
String _basedetails = "";
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Private Sub WriteHealthSnapshot(trigger As String)";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Dim baseDetails As String = \"trigger=\" & trigger";
_basedetails = "trigger="+_trigger;
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="TraceState(\"health\", \"воспроизведение\", baseDetai";
__ref._tracestate /*String*/ (null,"health","воспроизведение",_basedetails+" stage="+__ref._playbackflowstate /*String*/ +" playing="+__ref._isplaybackrunningfortrace /*String*/ (null)+" currentTrackId="+__ref._resolvecurrenttracktracevalue /*String*/ (null)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ))+__ref._buildhealthaudiotracedetails /*String*/ (null));
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="TraceState(\"health\", \"кэш\", baseDetails & _ 		\" s";
__ref._tracestate /*String*/ (null,"health","кэш",_basedetails+" status="+__ref._resolvecachehealthstatustext /*String*/ (null)+" trackIndex="+BA.NumberToString(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedtrackcount /*int*/ (null))+" adIndex="+BA.NumberToString(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedadcount /*int*/ (null)));
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="TraceState(\"health\", \"устройство\", baseDetails &";
__ref._tracestate /*String*/ (null,"health","устройство",_basedetails+" device="+__ref._resolvedevicetracename /*String*/ (null)+" deviceId="+__ref._deviceid /*String*/ +" os="+__ref._resolveclientplatformtext /*String*/ (null));
RDebugUtils.currentLine=19660816;
 //BA.debugLineNum = 19660816;BA.debugLine="TraceState(\"health\", \"ресурсы\", baseDetails & _";
__ref._tracestate /*String*/ (null,"health","ресурсы",_basedetails+" ramFreeMb="+__ref._resolvefreerammbtext /*String*/ (null)+" diskFreeMb="+__ref._resolvefreediskmbtext /*String*/ (null)+" diskTotalMb="+__ref._resolvetotaldiskmbtext /*String*/ (null));
RDebugUtils.currentLine=19660820;
 //BA.debugLineNum = 19660820;BA.debugLine="TraceState(\"health\", \"сеть\", baseDetails & _ 		\"";
__ref._tracestate /*String*/ (null,"health","сеть",_basedetails+" netErrors="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getconsecutivenetworkerrors /*int*/ (null))+" lastDataOkAgoSec="+__ref._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlastdataokat /*long*/ (null))+" lastHistoryOkAgoSec="+__ref._secondsagotext /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._getlasthistoryokat /*long*/ (null)));
RDebugUtils.currentLine=19660824;
 //BA.debugLineNum = 19660824;BA.debugLine="End Sub";
return "";
}
public String  _startofflinedatarefresh(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "startofflinedatarefresh", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub StartOfflineDataRefresh";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="historyFlushTimer.Enabled = False";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="traceUploadTimer.Enabled = False";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="localAdMinuteTimer.Interval = 1000";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000));
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="localAdMinuteTimer.Enabled = True";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="If playerCode = \"\" Then Return";
if ((__ref._playercode /*String*/ ).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="offlineDataRefreshTimer.Interval = DATA_REFRESH_M";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._data_refresh_ms /*int*/ ));
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="offlineDataRefreshTimer.Enabled = True";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="historyFlushTimer.Interval = HISTORY_FLUSH_INTERV";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._history_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="historyFlushTimer.Enabled = True";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="traceUploadTimer.Interval = TRACE_FLUSH_INTERVAL_";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._trace_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="traceUploadTimer.Enabled = True";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="End Sub";
return "";
}
public String  _showinitialscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showinitialscreen", false))
	 {return ((String) Debug.delegate(ba, "showinitialscreen", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub ShowInitialScreen";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
 }else {
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*String*/ (null,__c.True);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="UpdateConnectionIndicator(\"connecting\")";
__ref._updateconnectionindicator /*String*/ (null,"connecting");
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="AutoStartSavedPlayer";
__ref._autostartsavedplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 };
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4j.example.b4xmainpage __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub B4XPage_Resize (width As Int, height A";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If card.IsInitialized = False Then Return";
if (__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="LayoutUi(width, height)";
__ref._layoutui /*String*/ (null,_width,_height);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public String  _layoutui(b4j.example.b4xmainpage __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "layoutui", false))
	 {return ((String) Debug.delegate(ba, "layoutui", new Object[] {_width,_height}));}
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
int _footertextwidth = 0;
int _footergroupwidth = 0;
int _footergroupleft = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub LayoutUi(width As Int, height As Int)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim safeWidth As Int = Max(width, 320dip)";
_safewidth = (int) (__c.Max(_width,__c.DipToCurrent((int) (320))));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim safeHeight As Int = Max(height, 420dip)";
_safeheight = (int) (__c.Max(_height,__c.DipToCurrent((int) (420))));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Dim outerPad As Int = ScaleValue(safeWidth, 12dip";
_outerpad = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Dim horizontalPad As Int = ScaleValue(safeWidth,";
_horizontalpad = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Dim sectionGap As Int = ScaleValue(safeWidth, 24d";
_sectiongap = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (48)));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Dim contentGap As Int = ScaleValue(safeWidth, 8di";
_contentgap = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Dim headerHeight As Int = ScaleValue(safeWidth, 5";
_headerheight = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (56)),__c.DipToCurrent((int) (64)),__c.DipToCurrent((int) (72)));
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Dim footerHeight As Int = headerHeight";
_footerheight = _headerheight;
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Dim cardWidth As Int = Min(500dip, safeWidth - ou";
_cardwidth = (int) (__c.Min(__c.DipToCurrent((int) (500)),_safewidth-_outerpad*2));
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Dim preferredHeight As Int = Max(400dip, safeHeig";
_preferredheight = (int) (__c.Max(__c.DipToCurrent((int) (400)),_safeheight-_outerpad*2));
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Dim cardHeight As Int = Min(preferredHeight, safe";
_cardheight = (int) (__c.Min(_preferredheight,_safeheight-__c.DipToCurrent((int) (8))));
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="Dim cardLeft As Int = (safeWidth - cardWidth) / 2";
_cardleft = (int) ((_safewidth-_cardwidth)/(double)2);
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Dim cardTop As Int = (safeHeight - cardHeight) /";
_cardtop = (int) ((_safeheight-_cardheight)/(double)2);
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="UpdateResponsiveStyles(safeWidth)";
__ref._updateresponsivestyles /*String*/ (null,_safewidth);
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="card.SetLayoutAnimated(0, cardLeft, cardTop, card";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardleft,_cardtop,_cardwidth,_cardheight);
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="headerPane.SetLayoutAnimated(0, 0, 0, cardWidth,";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_cardwidth,_headerheight);
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="contentPane.SetLayoutAnimated(0, 0, headerHeight";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_headerheight+_sectiongap/(double)2,_cardwidth,_cardheight-_headerheight-_footerheight-_sectiongap);
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="footerPane.SetLayoutAnimated(0, 0, cardHeight - f";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_cardheight-_footerheight,_cardwidth,_footerheight);
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="Dim headerActionSize As Int = ScaleValue(safeWidt";
_headeractionsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (36)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="headerActionPane.SetLayoutAnimated(0, cardWidth -";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardwidth-_horizontalpad-_headeractionsize,(_headerheight-_headeractionsize)/(double)2,_headeractionsize,_headeractionsize);
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="lblHeaderAction.SetLayoutAnimated(0, 0, 0, header";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="lblHeader.SetLayoutAnimated(0, horizontalPad + he";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad+_headeractionsize+_contentgap,0,_cardwidth-(_horizontalpad+_headeractionsize+_contentgap)*2,_headerheight);
RDebugUtils.currentLine=2293788;
 //BA.debugLineNum = 2293788;BA.debugLine="setupPane.SetLayoutAnimated(0, 0, 0, contentPane.";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="playerPane.SetLayoutAnimated(0, 0, 0, contentPane";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="Dim contentHeight As Int = contentPane.Height";
_contentheight = (int) (__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="Dim heroHeight As Int = Max(160dip, (contentHeigh";
_heroheight = (int) (__c.Max(__c.DipToCurrent((int) (160)),(_contentheight-_sectiongap)/(double)2));
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="Dim detailHeight As Int = Max(120dip, contentHeig";
_detailheight = (int) (__c.Max(__c.DipToCurrent((int) (120)),_contentheight-_heroheight-_sectiongap));
RDebugUtils.currentLine=2293794;
 //BA.debugLineNum = 2293794;BA.debugLine="Dim contentWidth As Int = cardWidth - horizontalP";
_contentwidth = (int) (_cardwidth-_horizontalpad*2);
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="setupHeroPane.SetLayoutAnimated(0, horizontalPad,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=2293797;
 //BA.debugLineNum = 2293797;BA.debugLine="setupDetailPane.SetLayoutAnimated(0, horizontalPa";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=2293798;
 //BA.debugLineNum = 2293798;BA.debugLine="playerHeroPane.SetLayoutAnimated(0, horizontalPad";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=2293799;
 //BA.debugLineNum = 2293799;BA.debugLine="playerDetailPane.SetLayoutAnimated(0, horizontalP";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="Dim controlSize As Int = ScaleValue(safeWidth, 15";
_controlsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (156)),__c.DipToCurrent((int) (172)),__c.DipToCurrent((int) (182)));
RDebugUtils.currentLine=2293802;
 //BA.debugLineNum = 2293802;BA.debugLine="Dim inputLeft As Int = (setupHeroPane.Width - con";
_inputleft = (int) ((__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=2293803;
 //BA.debugLineNum = 2293803;BA.debugLine="Dim inputTop As Int = Max(0, (setupHeroPane.Heigh";
_inputtop = (int) (__c.Max(0,(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=2293804;
 //BA.debugLineNum = 2293804;BA.debugLine="Dim accessOrbitSize As Int = controlSize + 20dip";
_accessorbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=2293805;
 //BA.debugLineNum = 2293805;BA.debugLine="accessCorePane.SetLayoutAnimated(0, inputLeft - 1";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft-__c.DipToCurrent((int) (10)),_inputtop-__c.DipToCurrent((int) (10)),_accessorbitsize,_accessorbitsize);
RDebugUtils.currentLine=2293806;
 //BA.debugLineNum = 2293806;BA.debugLine="accessCirclePane.SetLayoutAnimated(0, inputLeft,";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft,_inputtop,_controlsize,_controlsize);
RDebugUtils.currentLine=2293807;
 //BA.debugLineNum = 2293807;BA.debugLine="Dim inputPaneWidth As Int = controlSize - 34dip";
_inputpanewidth = (int) (_controlsize-__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=2293808;
 //BA.debugLineNum = 2293808;BA.debugLine="Dim inputPaneHeight As Int = Min(72dip, controlSi";
_inputpaneheight = (int) (__c.Min(__c.DipToCurrent((int) (72)),_controlsize-__c.DipToCurrent((int) (62))));
RDebugUtils.currentLine=2293809;
 //BA.debugLineNum = 2293809;BA.debugLine="Dim inputPaneLeft As Int = (controlSize - inputPa";
_inputpaneleft = (int) ((_controlsize-_inputpanewidth)/(double)2);
RDebugUtils.currentLine=2293810;
 //BA.debugLineNum = 2293810;BA.debugLine="Dim inputPaneTop As Int = (controlSize - inputPan";
_inputpanetop = (int) ((_controlsize-_inputpaneheight)/(double)2);
RDebugUtils.currentLine=2293811;
 //BA.debugLineNum = 2293811;BA.debugLine="accessInputPane.SetLayoutAnimated(0, inputPaneLef";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputpaneleft,_inputpanetop,_inputpanewidth,_inputpaneheight);
RDebugUtils.currentLine=2293812;
 //BA.debugLineNum = 2293812;BA.debugLine="Dim codeFieldHeight As Int = inputPaneHeight";
_codefieldheight = _inputpaneheight;
RDebugUtils.currentLine=2293813;
 //BA.debugLineNum = 2293813;BA.debugLine="txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inpu";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_inputpanewidth,_codefieldheight);
RDebugUtils.currentLine=2293815;
 //BA.debugLineNum = 2293815;BA.debugLine="Dim orbitSize As Int = controlSize + 20dip";
_orbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=2293816;
 //BA.debugLineNum = 2293816;BA.debugLine="Dim orbitLeft As Int = (playerHeroPane.Width - or";
_orbitleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_orbitsize)/(double)2);
RDebugUtils.currentLine=2293817;
 //BA.debugLineNum = 2293817;BA.debugLine="Dim controlLeft As Int = (playerHeroPane.Width -";
_controlleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=2293818;
 //BA.debugLineNum = 2293818;BA.debugLine="Dim controlTop As Int = Max(0, (playerHeroPane.He";
_controltop = (int) (__c.Max(0,(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=2293819;
 //BA.debugLineNum = 2293819;BA.debugLine="orbitPane.SetLayoutAnimated(0, orbitLeft, control";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_orbitleft,_controltop-__c.DipToCurrent((int) (10)),_orbitsize,_orbitsize);
RDebugUtils.currentLine=2293820;
 //BA.debugLineNum = 2293820;BA.debugLine="playButtonPane.SetLayoutAnimated(0, controlLeft,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_controlleft,_controltop,_controlsize,_controlsize);
RDebugUtils.currentLine=2293821;
 //BA.debugLineNum = 2293821;BA.debugLine="lblPlayIcon.SetLayoutAnimated(0, 0, 1dip, control";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__c.DipToCurrent((int) (1)),_controlsize,_controlsize);
RDebugUtils.currentLine=2293823;
 //BA.debugLineNum = 2293823;BA.debugLine="setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setup";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.38));
RDebugUtils.currentLine=2293824;
 //BA.debugLineNum = 2293824;BA.debugLine="setupStatusPane.SetLayoutAnimated(0, 0, setupPrim";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=2293825;
 //BA.debugLineNum = 2293825;BA.debugLine="btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setup";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (132)))/(double)2),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (44)))/(double)2),__c.DipToCurrent((int) (132)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=2293826;
 //BA.debugLineNum = 2293826;BA.debugLine="lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupS";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2293828;
 //BA.debugLineNum = 2293828;BA.debugLine="playerPrimaryPane.SetLayoutAnimated(0, 0, 0, play";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.4));
RDebugUtils.currentLine=2293829;
 //BA.debugLineNum = 2293829;BA.debugLine="playerStatusPane.SetLayoutAnimated(0, 0, playerPr";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=2293832;
 //BA.debugLineNum = 2293832;BA.debugLine="Dim streamTextWidth As Int = Min(playerPrimaryPan";
_streamtextwidth = (int) (__c.Min(__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (340))));
RDebugUtils.currentLine=2293833;
 //BA.debugLineNum = 2293833;BA.debugLine="Dim streamTextLeft As Int = Max(0, (playerPrimary";
_streamtextleft = (int) (__c.Max(0,(__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_streamtextwidth)/(double)2));
RDebugUtils.currentLine=2293834;
 //BA.debugLineNum = 2293834;BA.debugLine="lblStream.SetLayoutAnimated(0, streamTextLeft, 0,";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_streamtextleft,0,_streamtextwidth,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2293835;
 //BA.debugLineNum = 2293835;BA.debugLine="Dim infoHeight As Int = Max(54dip, playerStatusPa";
_infoheight = (int) (__c.Max(__c.DipToCurrent((int) (54)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._confirmreservedheight /*int*/ (null)));
RDebugUtils.currentLine=2293836;
 //BA.debugLineNum = 2293836;BA.debugLine="Dim infoTextWidth As Int = Min(playerStatusPane.W";
_infotextwidth = (int) (__c.Min(__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (380))));
RDebugUtils.currentLine=2293837;
 //BA.debugLineNum = 2293837;BA.debugLine="Dim infoTextLeft As Int = Max(0, (playerStatusPan";
_infotextleft = (int) (__c.Max(0,(__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_infotextwidth)/(double)2));
RDebugUtils.currentLine=2293838;
 //BA.debugLineNum = 2293838;BA.debugLine="lblInfo.SetLayoutAnimated(0, infoTextLeft, 0, inf";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_infotextleft,0,_infotextwidth,_infoheight);
RDebugUtils.currentLine=2293839;
 //BA.debugLineNum = 2293839;BA.debugLine="If confirmPane.Visible Then";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=2293840;
 //BA.debugLineNum = 2293840;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (72)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (72)));
 }else {
RDebugUtils.currentLine=2293842;
 //BA.debugLineNum = 2293842;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),0);
 };
RDebugUtils.currentLine=2293844;
 //BA.debugLineNum = 2293844;BA.debugLine="btnConfirmYes.SetLayoutAnimated(0, Max(0, (confir";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (236)))/(double)2),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=2293845;
 //BA.debugLineNum = 2293845;BA.debugLine="btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.L";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (124)),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=2293847;
 //BA.debugLineNum = 2293847;BA.debugLine="Dim connectionIconSize As Int = ScaleValue(safeWi";
_connectioniconsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (18)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=2293848;
 //BA.debugLineNum = 2293848;BA.debugLine="Dim footerGap As Int = 8dip";
_footergap = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=2293849;
 //BA.debugLineNum = 2293849;BA.debugLine="Dim footerTextWidth As Int = MeasureViewTextWidth";
_footertextwidth = __ref._measureviewtextwidth /*int*/ (null,__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=2293850;
 //BA.debugLineNum = 2293850;BA.debugLine="Dim footerGroupWidth As Int = connectionIconSize";
_footergroupwidth = (int) (_connectioniconsize+_footergap+_footertextwidth);
RDebugUtils.currentLine=2293851;
 //BA.debugLineNum = 2293851;BA.debugLine="Dim footerGroupLeft As Int = Max(horizontalPad, (";
_footergroupleft = (int) (__c.Max(_horizontalpad,(_cardwidth-_footergroupwidth)/(double)2));
RDebugUtils.currentLine=2293852;
 //BA.debugLineNum = 2293852;BA.debugLine="lblConnectionIcon.SetLayoutAnimated(0, footerGrou";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_footergroupleft,(_footerheight-_connectioniconsize)/(double)2,_connectioniconsize,_connectioniconsize);
RDebugUtils.currentLine=2293853;
 //BA.debugLineNum = 2293853;BA.debugLine="lblFooter.SetLayoutAnimated(0, footerGroupLeft +";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_footergroupleft+_connectioniconsize+_footergap,0,_footertextwidth+__c.DipToCurrent((int) (4)),_footerheight);
RDebugUtils.currentLine=2293854;
 //BA.debugLineNum = 2293854;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=2293855;
 //BA.debugLineNum = 2293855;BA.debugLine="End Sub";
return "";
}
public void  _breaktimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "breaktimer_tick", false))
	 {Debug.delegate(ba, "breaktimer_tick", null); return;}
ResumableSub_BreakTimer_Tick rsub = new ResumableSub_BreakTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BreakTimer_Tick extends BA.ResumableSub {
public ResumableSub_BreakTimer_Tick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="If ShouldTriggerBreakNow = False Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._shouldtriggerbreaknow /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="TraceLog(\"брейк exact timer hit\")";
__ref._tracelog /*String*/ (null,"брейк exact timer hit");
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="Wait For (RunPlaybackDirectorTick(\"break_timer\"))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "breaktimer_tick"), __ref._runplaybackdirectortick /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"break_timer"));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _shouldtriggerbreaknow(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldtriggerbreaknow", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldtriggerbreaknow", null));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub ShouldTriggerBreakNow As Boolean";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="If scheduledBreakAt <= 0 Then Return False";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="Return LocalNowTimestamp >= scheduledBreakAt";
if (true) return __ref._localnowtimestamp /*long*/ (null)>=__ref._scheduledbreakat /*long*/ ;
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runplaybackdirectortick(b4j.example.b4xmainpage __ref,String _source) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "runplaybackdirectortick", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "runplaybackdirectortick", new Object[] {_source}));}
ResumableSub_RunPlaybackDirectorTick rsub = new ResumableSub_RunPlaybackDirectorTick(this,__ref,_source);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunPlaybackDirectorTick extends BA.ResumableSub {
public ResumableSub_RunPlaybackDirectorTick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _source) {
this.parent = parent;
this.__ref = __ref;
this._source = _source;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _source;
long _startedat = 0L;
anywheresoftware.b4a.objects.collections.Map _decision = null;
String _actionname = "";
boolean _executed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="If directorState.IsTickInProgress Then Return Fal";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._istickinprogress /*boolean*/ ) { 
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
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((__ref._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("")) { 
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
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._isplaybackflowactive /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="directorState.IsTickInProgress = True";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._istickinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="RecoverStaleDirectorSlots";
__ref._recoverstaledirectorslots /*String*/ (null);
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="Dim decision As Map = ResolvePlaybackTickDecision";
_decision = new anywheresoftware.b4a.objects.collections.Map();
_decision = __ref._resolveplaybacktickdecision /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Dim actionName As String = decision.GetDefault(\"a";
_actionname = BA.ObjectToString(_decision.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="If actionName = \"\" Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((_actionname).equals("")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="directorState.IsTickInProgress = False";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._istickinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="If directorState.TryBeginDecision(source & \":\" &";

case 22:
//if
this.state = 25;
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._trybegindecision /*boolean*/ (null,_source+":"+_actionname)==parent.__c.False) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="directorState.IsTickInProgress = False";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._istickinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=8060943;
 //BA.debugLineNum = 8060943;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=8060945;
 //BA.debugLineNum = 8060945;BA.debugLine="Wait For (ExecutePlaybackTickDecision(decision))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runplaybackdirectortick"), __ref._executeplaybacktickdecision /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_decision));
this.state = 26;
return;
case 26:
//C
this.state = -1;
_executed = (boolean) result[1];
;
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=8060947;
 //BA.debugLineNum = 8060947;BA.debugLine="directorState.IsTickInProgress = False";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._istickinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=8060948;
 //BA.debugLineNum = 8060948;BA.debugLine="LogSlowMainOperation(\"director_tick:\" & source, s";
__ref._logslowmainoperation /*String*/ (null,"director_tick:"+_source,_startedat);
RDebugUtils.currentLine=8060949;
 //BA.debugLineNum = 8060949;BA.debugLine="Return executed";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_executed));return;};
RDebugUtils.currentLine=8060950;
 //BA.debugLineNum = 8060950;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _bringtofront(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "bringtofront", false))
	 {return ((String) Debug.delegate(ba, "bringtofront", new Object[] {_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub BringToFront(view As B4XView)";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="If uiController.IsInitialized Then";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="uiController.BringToFront(view)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._bringtofront /*String*/ (null,_view);
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
_jo.RunMethod("toFront",(Object[])(__c.Null));
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_click", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_click", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub BtnConfirmNo_Click";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub HidePin";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="uiController.HidePin";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._hidepin /*String*/ (null);
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub BtnConfirmNo_MouseEntered (eventData A";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return "";
}
public String  _updatetextbuttonappearance(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _buttonview,boolean _ishovered) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatetextbuttonappearance", false))
	 {return ((String) Debug.delegate(ba, "updatetextbuttonappearance", new Object[] {_buttonview,_ishovered}));}
int _fillcolor = 0;
int _bordercolor = 0;
int _textcolor = 0;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Private Sub UpdateTextButtonAppearance(buttonView";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="If uiController.IsInitialized Then";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="uiController.UpdateTextButtonAppearance(buttonVi";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updatetextbuttonappearance /*String*/ (null,_buttonview,_ishovered);
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="fillColor = 0x12FFFFFF";
_fillcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="borderColor = 0x34FFFFFF";
_bordercolor = ((int)0x34ffffff);
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="textColor = 0xFFF2F7FB";
_textcolor = ((int)0xfff2f7fb);
 }else {
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="fillColor = 0x06FFFFFF";
_fillcolor = ((int)0x06ffffff);
RDebugUtils.currentLine=21561358;
 //BA.debugLineNum = 21561358;BA.debugLine="borderColor = 0x1EFFFFFF";
_bordercolor = ((int)0x1effffff);
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="textColor = 0xFFE0E4EA";
_textcolor = ((int)0xffe0e4ea);
 };
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
_buttonview.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=21561362;
 //BA.debugLineNum = 21561362;BA.debugLine="UiStyle.SetPaneStyle(buttonView, \"-fx-cursor: han";
_uistyle._setpanestyle /*String*/ (_buttonview,"-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_textcolor)+";");
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
_buttonview.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (13)));
RDebugUtils.currentLine=21561364;
 //BA.debugLineNum = 21561364;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub BtnConfirmNo_MouseExited (eventData As";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public void  _btnconfirmyes_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmyes_click", false))
	 {Debug.delegate(ba, "btnconfirmyes_click", null); return;}
ResumableSub_BtnConfirmYes_Click rsub = new ResumableSub_BtnConfirmYes_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BtnConfirmYes_Click extends BA.ResumableSub {
public ResumableSub_BtnConfirmYes_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Wait For (SubmitClaim) Complete (unused As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnconfirmyes_click"), __ref._submitclaim /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _submitclaim(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "submitclaim", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "submitclaim", null));}
ResumableSub_SubmitClaim rsub = new ResumableSub_SubmitClaim(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SubmitClaim extends BA.ResumableSub {
public ResumableSub_SubmitClaim(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="btnConfirmYes.Enabled = False";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="btnConfirmNo.Enabled = False";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="TraceLog(\"claim начало player=\" & FormatPlayerCod";
__ref._tracelog /*String*/ (null,"claim начало player="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+" device="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Wait For (syncService.SubmitClaim(FETCH_TIMEOUT_M";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._syncservice /*b4j.example.networksyncservice*/ ._submitclaim /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._fetch_timeout_ms /*int*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="If data.GetDefault(\"ok\", False) = True Then";
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
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="TraceLog(\"claim итог success=true\")";
__ref._tracelog /*String*/ (null,"claim итог success=true");
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 14;
return;
case 14:
//C
this.state = 10;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="Return True";
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
RDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="TraceLog(\"claim итог success=false message=\" & Re";
__ref._tracelog /*String*/ (null,"claim итог success=false message="+__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="ShowClaimPrompt(ResolveErrorMessage(result, Messa";
__ref._showclaimprompt /*String*/ (null,__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=12976151;
 //BA.debugLineNum = 12976151;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnconfirmyes_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmyes_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmyes_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub BtnConfirmYes_MouseEntered (eventData";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmyes_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmyes_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmyes_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub BtnConfirmYes_MouseExited (eventData A";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public void  _btnsetupsubmit_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnsetupsubmit_click", false))
	 {Debug.delegate(ba, "btnsetupsubmit_click", null); return;}
ResumableSub_BtnSetupSubmit_Click rsub = new ResumableSub_BtnSetupSubmit_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BtnSetupSubmit_Click extends BA.ResumableSub {
public ResumableSub_BtnSetupSubmit_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;
boolean _unused2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="If appScreenMode = \"settings\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Wait For (LogoutPlayer) Complete (unused As Bool";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnsetupsubmit_click"), __ref._logoutplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_unused = (boolean) result[1];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Wait For (SubmitPlayerCode) Complete (unused2 As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnsetupsubmit_click"), __ref._submitplayercode /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_unused2 = (boolean) result[1];
;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _logoutplayer(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "logoutplayer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "logoutplayer", null));}
ResumableSub_LogoutPlayer rsub = new ResumableSub_LogoutPlayer(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LogoutPlayer extends BA.ResumableSub {
public ResumableSub_LogoutPlayer(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="SaveValue(\"player_code\", \"\")";
__ref._savevalue /*String*/ (null,"player_code",(Object)(""));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="playerCode = \"\"";
__ref._playercode /*String*/  = "";
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Wait For (StopPlayer) Complete (unused As Boolean";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "logoutplayer"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="uiController.SetStatusText(\"\")";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _submitplayercode(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "submitplayercode", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "submitplayercode", null));}
ResumableSub_SubmitPlayerCode rsub = new ResumableSub_SubmitPlayerCode(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SubmitPlayerCode extends BA.ResumableSub {
public ResumableSub_SubmitPlayerCode(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _nextplayer = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim nextPlayer As String = NormalizePlayerCode(tx";
_nextplayer = __ref._normalizeplayercode /*String*/ (null,__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If nextPlayer = \"\" Then";
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
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="ShowSetupScreen(MessageValue(\"setup_invalid\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"setup_invalid"));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="txtPlayerCode.RequestFocus";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="playerCode = nextPlayer";
__ref._playercode /*String*/  = _nextplayer;
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="SaveValue(\"player_code\", playerCode)";
__ref._savevalue /*String*/ (null,"player_code",(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="StartOfflineDataRefresh";
__ref._startofflinedatarefresh /*String*/ (null);
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="AutoStartSavedPlayer";
__ref._autostartsavedplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsetupsubmit_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnsetupsubmit_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "btnsetupsubmit_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub BtnSetupSubmit_MouseEntered (eventData";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public String  _btnsetupsubmit_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnsetupsubmit_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnsetupsubmit_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub BtnSetupSubmit_MouseExited (eventData";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return "";
}
public double  _currentvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentvolume", false))
	 {return ((Double) Debug.delegate(ba, "currentvolume", new Object[] {_item}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Private Sub CurrentVolume(item As Map) As Double";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Return ResolveItemVolume(item)";
if (true) return __ref._resolveitemvolume /*double*/ (null,_item);
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="End Sub";
return 0;
}
public double  _resolveitemgaindb(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveitemgaindb", false))
	 {return ((Double) Debug.delegate(ba, "resolveitemgaindb", new Object[] {_item}));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Private Sub ResolveItemGainDb(item As Map) As Doub";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="If item.IsInitialized = False Then Return -3";
if (_item.IsInitialized()==__c.False) { 
if (true) return -3;};
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Return NormalizeDbValue(item.GetDefault(\"gain\", -";
if (true) return __ref._normalizedbvalue /*double*/ (null,_item.GetDefault((Object)("gain"),(Object)(-3)),-3);
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="End Sub";
return 0;
}
public String  _buildhealthaudiotracedetails(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildhealthaudiotracedetails", false))
	 {return ((String) Debug.delegate(ba, "buildhealthaudiotracedetails", null));}
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub BuildHealthAudioTraceDetails As String";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="If activeItem.IsInitialized = False Then Return \"";
if (_activeitem.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="Return \" volume=\" & NumberFormat2(CurrentVolume(a";
if (true) return " volume="+__c.NumberFormat2(__ref._currentvolume /*double*/ (null,_activeitem),(int) (1),(int) (3),(int) (3),__c.False)+" gainDb="+__c.NumberFormat2(__ref._resolveitemgaindb /*double*/ (null,_activeitem),(int) (1),(int) (1),(int) (1),__c.False)+" gainApplied="+BA.ObjectToString(((_activeitem.ContainsKey((Object)("gain"))) ? ((Object)("yes")) : ((Object)("default"))));
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectoractiveitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getdirectoractiveitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "transition_getdirectoractiveitem", null));}
b4j.example.playbackplayerslot _activeslot = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub Transition_GetDirectorActiveItem As Map";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="If activeSlot.IsInitialized And activeSlot.HasIt";
if (_activeslot.IsInitialized /*boolean*/ () && _activeslot._hasitem /*boolean*/ (null)) { 
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_activeslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Return CloneMap(runtimeState.ActiveItem)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="End Sub";
return null;
}
public String  _buildparams(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildparams", false))
	 {return ((String) Debug.delegate(ba, "buildparams", new Object[] {_params}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Private Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Return syncService.BuildParams(params)";
if (true) return __ref._syncservice /*b4j.example.networksyncservice*/ ._buildparams /*String*/ (null,_params);
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return "";
}
public long  _resolveplanneddurationms(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplanneddurationms", false))
	 {return ((Long) Debug.delegate(ba, "resolveplanneddurationms", new Object[] {_audiokey,_item}));}
b4j.example.audioplayer _audio = null;
long _audioduration = 0L;
long _itemduration = 0L;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Private Sub ResolvePlannedDurationMs(audioKey As S";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim audio As AudioPlayer = GetAudioByKey(audioKey";
_audio = __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey);
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="If audio.IsInitialized Then";
if (_audio.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Dim audioDuration As Long = audio.Duration";
_audioduration = _audio._duration /*long*/ (null);
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="If audioDuration > 0 Then Return audioDuration";
if (_audioduration>0) { 
if (true) return _audioduration;};
 };
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Dim itemDuration As Long = ToLongDefault(item.Get";
_itemduration = __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("duration"),(Object)(0)),(long) (0));
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="If itemDuration <= 0 Then Return 0";
if (_itemduration<=0) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="If itemDuration < 1000 Then Return itemDuration *";
if (_itemduration<1000) { 
if (true) return (long) (_itemduration*1000);};
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="Return itemDuration";
if (true) return _itemduration;
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="End Sub";
return 0L;
}
public String  _formattickstimefortrace(b4j.example.b4xmainpage __ref,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formattickstimefortrace", false))
	 {return ((String) Debug.delegate(ba, "formattickstimefortrace", new Object[] {_targetticks}));}
String _previousdateformat = "";
String _previoustimeformat = "";
String _value = "";
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub FormatTicksTimeForTrace(targetTicks As";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="Dim value As String = DateTime.Date(targetTicks)";
_value = __c.DateTime.Date(_targetticks)+" "+__c.DateTime.Time(_targetticks);
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.example.b4xmainpage __ref,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_text,_fontsize,_textcolor,_bold,_wraptext}));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Private Sub CreateLabel(text As String, fontSize A";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Return UiStyle.CreateLabel(xui, text, fontSize, t";
if (true) return _uistyle._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,_text,_fontsize,_textcolor,_bold,_wraptext);
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextbutton(b4j.example.b4xmainpage __ref,String _text,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createtextbutton", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextbutton", new Object[] {_text,_eventname}));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Private Sub CreateTextButton(text As String, event";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="btn.Initialize(eventName)";
_btn.Initialize(ba,_eventname);
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="xbtn.Text = text.ToUpperCase";
_xbtn.setText(_text.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="UpdateTextButtonAppearance(xbtn, False)";
__ref._updatetextbuttonappearance /*String*/ (null,_xbtn,__c.False);
RDebugUtils.currentLine=27983878;
 //BA.debugLineNum = 27983878;BA.debugLine="Return xbtn";
if (true) return _xbtn;
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="End Sub";
return null;
}
public String  _setpanestyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Private Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="UiStyle.SetPaneStyle(view, style)";
_uistyle._setpanestyle /*String*/ (_view,_style);
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return "";
}
public String  _colortocss(b4j.example.b4xmainpage __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Private Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Return UiStyle.ColorToCss(color)";
if (true) return _uistyle._colortocss /*String*/ (_color);
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="End Sub";
return "";
}
public String  _setpickonbounds(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Private Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="UiStyle.SetPickOnBounds(view, value)";
_uistyle._setpickonbounds /*String*/ (_view,_value);
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="End Sub";
return "";
}
public String  _updateheaderactionappearance(b4j.example.b4xmainpage __ref,boolean _ishovered) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateheaderactionappearance", false))
	 {return ((String) Debug.delegate(ba, "updateheaderactionappearance", new Object[] {_ishovered}));}
int _fillcolor = 0;
int _bordercolor = 0;
int _textcolor = 0;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub UpdateHeaderActionAppearance(isHovered";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="If uiController.IsInitialized Then";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="uiController.UpdateHeaderActionAppearance(isHove";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updateheaderactionappearance /*String*/ (null,_ishovered);
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=21495817;
 //BA.debugLineNum = 21495817;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=21495826;
 //BA.debugLineNum = 21495826;BA.debugLine="UiStyle.SetPaneStyle(headerActionPane, \"-fx-curso";
_uistyle._setpanestyle /*String*/ (__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="UiStyle.SetLabelStyle(lblHeaderAction, \"-fx-align";
_uistyle._setlabelstyle /*String*/ (__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+_uistyle._colortocss /*String*/ (_textcolor)+";");
RDebugUtils.currentLine=21495828;
 //BA.debugLineNum = 21495828;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblHeaderActio";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionfontsize /*float*/ );
RDebugUtils.currentLine=21495829;
 //BA.debugLineNum = 21495829;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybuttonappearance(b4j.example.b4xmainpage __ref,boolean _ishovered) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateplaybuttonappearance", false))
	 {return ((String) Debug.delegate(ba, "updateplaybuttonappearance", new Object[] {_ishovered}));}
int _backgroundcolor = 0;
int _bordercolor = 0;
int _orbitbordercolor = 0;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub UpdatePlayButtonAppearance(isHovered A";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="If uiController.IsInitialized Then";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="uiController.UpdatePlayButtonAppearance(isHovere";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updateplaybuttonappearance /*String*/ (null,_ishovered,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ );
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="If orchestrationState.IsStarted Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ) { 
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=21364750;
 //BA.debugLineNum = 21364750;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="If orchestrationState.IsStarted Or isHovered Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  || _ishovered) { 
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
RDebugUtils.currentLine=21364764;
 //BA.debugLineNum = 21364764;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=21364768;
 //BA.debugLineNum = 21364768;BA.debugLine="End Sub";
return "";
}
public String  _updatecodeinputappearance(b4j.example.b4xmainpage __ref,boolean _isfocused) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatecodeinputappearance", false))
	 {return ((String) Debug.delegate(ba, "updatecodeinputappearance", new Object[] {_isfocused}));}
int _fillcolor = 0;
int _bordercolor = 0;
int _orbitbordercolor = 0;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub UpdateCodeInputAppearance(isFocused As";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="If uiController.IsInitialized Then";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="uiController.UpdateCodeInputAppearance(isFocused";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updatecodeinputappearance /*String*/ (null,_isfocused);
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="If isFocused Then";
if (_isfocused) { 
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
RDebugUtils.currentLine=21626891;
 //BA.debugLineNum = 21626891;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
RDebugUtils.currentLine=21626895;
 //BA.debugLineNum = 21626895;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
RDebugUtils.currentLine=21626897;
 //BA.debugLineNum = 21626897;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=21626898;
 //BA.debugLineNum = 21626898;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=21626899;
 //BA.debugLineNum = 21626899;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=21626900;
 //BA.debugLineNum = 21626900;BA.debugLine="UiStyle.SetPaneStyle(accessCirclePane, \"-fx-backg";
_uistyle._setpanestyle /*String*/ (__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=21626901;
 //BA.debugLineNum = 21626901;BA.debugLine="UiStyle.SetPaneStyle(accessCorePane, \"-fx-backgro";
_uistyle._setpanestyle /*String*/ (__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=21626902;
 //BA.debugLineNum = 21626902;BA.debugLine="UiStyle.SetPaneStyle(accessInputPane, \"-fx-backgr";
_uistyle._setpanestyle /*String*/ (__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=21626903;
 //BA.debugLineNum = 21626903;BA.debugLine="UiStyle.SetPaneStyle(txtPlayerCodeView, \"-fx-back";
_uistyle._setpanestyle /*String*/ (__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+_uistyle._colortocss /*String*/ (((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+_uistyle._colortocss /*String*/ (((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(__ref._codefontsize /*float*/ )+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=21626904;
 //BA.debugLineNum = 21626904;BA.debugLine="End Sub";
return "";
}
public String  _cacheaudittimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cacheaudittimer_tick", false))
	 {return ((String) Debug.delegate(ba, "cacheaudittimer_tick", null));}
boolean _hasmore = false;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub CacheAuditTimer_Tick";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_START_DEL";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="If playbackFlowState <> FLOW_IDLE Then";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_idle /*String*/ ) == false) { 
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_RECHECK_I";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_recheck_interval_ms /*int*/ ));
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="If ShouldDeferCacheWorkerForPlaybackUi Then";
if (__ref._shoulddefercacheworkerforplaybackui /*boolean*/ (null)) { 
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_STEP_INTE";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_step_interval_ms /*int*/ ));
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="If mediaCacheService.IsCacheAuditInProgress = Fal";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._iscacheauditinprogress /*boolean*/ (null)==__c.False) { 
__ref._mediacacheservice /*b4j.example.mediacache*/ ._startcacheaudit /*String*/ (null);};
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="Dim hasMore As Boolean = mediaCacheService.RunCac";
_hasmore = __ref._mediacacheservice /*b4j.example.mediacache*/ ._runcacheauditstep /*boolean*/ (null);
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="If hasMore Then";
if (_hasmore) { 
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_STEP_INTE";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_step_interval_ms /*int*/ ));
 }else {
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="PruneTrackCacheIfNeeded(\"cache_audit\")";
__ref._prunetrackcacheifneeded /*String*/ (null,"cache_audit");
RDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="WriteSystemSnapshot(\"cache_worker\")";
__ref._writesystemsnapshot /*String*/ (null,"cache_worker");
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_RECHECK_I";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_recheck_interval_ms /*int*/ ));
 };
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="End Sub";
return "";
}
public boolean  _shoulddefercacheworkerforplaybackui(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shoulddefercacheworkerforplaybackui", false))
	 {return ((Boolean) Debug.delegate(ba, "shoulddefercacheworkerforplaybackui", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub ShouldDeferCacheWorkerForPlaybackUi As";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If DateTime.Now - lastUserPlaybackInputAt < 1500";
if (__c.DateTime.getNow()-__ref._lastuserplaybackinputat /*long*/ <1500) { 
if (true) return __c.True;};
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If playbackFlowState = FLOW_STARTING Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_starting /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="If playbackFlowState = FLOW_TRANSITIONING Then Re";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_transitioning /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return false;
}
public String  _prunetrackcacheifneeded(b4j.example.b4xmainpage __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prunetrackcacheifneeded", false))
	 {return ((String) Debug.delegate(ba, "prunetrackcacheifneeded", new Object[] {_initiator}));}
anywheresoftware.b4a.objects.collections.List _protectedtrackids = null;
anywheresoftware.b4a.objects.collections.List _relevanttrackids = null;
int _removedcount = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub PruneTrackCacheIfNeeded(initiator As S";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If DateTime.Now - lastTrackCachePruneAt < TRACK_C";
if (__c.DateTime.getNow()-__ref._lasttrackcachepruneat /*long*/ <__ref._track_cache_prune_cooldown_ms /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim protectedTrackIds As List = CollectProtectedT";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = __ref._collectprotectedtrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Dim relevantTrackIds As List = CollectRelevantTra";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = __ref._collectrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = __ref._mediacacheservice /*b4j.example.mediacache*/ ._prunetrackcacheifneeded /*int*/ (null,_protectedtrackids,_relevanttrackids);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="lastTrackCachePruneAt = DateTime.Now";
__ref._lasttrackcachepruneat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="TraceLog(\"кэш треков очистка итог initiator=\" &";
__ref._tracelog /*String*/ (null,"кэш треков очистка итог initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 };
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="End Sub";
return "";
}
public String  _writesystemsnapshot(b4j.example.b4xmainpage __ref,String _trigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "writesystemsnapshot", false))
	 {return ((String) Debug.delegate(ba, "writesystemsnapshot", new Object[] {_trigger}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub WriteSystemSnapshot(trigger As String)";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="TraceInfo(\"system\", \"источник\", trigger)";
__ref._traceinfo /*String*/ (null,"system","источник",_trigger);
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="TraceInfo(\"system\", \"устройство\", \"name=\" & Resol";
__ref._traceinfo /*String*/ (null,"system","устройство","name="+__ref._resolvedevicetracename /*String*/ (null)+" id="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="TraceInfo(\"system\", \"платформа\", \"os=\" & ResolveC";
__ref._traceinfo /*String*/ (null,"system","платформа","os="+__ref._resolveclientplatformtext /*String*/ (null));
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="TraceInfo(\"system\", \"память\", \"ramFreeMb=\" & Reso";
__ref._traceinfo /*String*/ (null,"system","память","ramFreeMb="+__ref._resolvefreerammbtext /*String*/ (null));
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="TraceInfo(\"system\", \"память доступно\", \"ramTotalM";
__ref._traceinfo /*String*/ (null,"system","память доступно","ramTotalMb="+__ref._resolvetotalrammbtext /*String*/ (null));
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="TraceInfo(\"system\", \"диск\", \"diskFreeMb=\" & Resol";
__ref._traceinfo /*String*/ (null,"system","диск","diskFreeMb="+__ref._resolvefreediskmbtext /*String*/ (null)+" diskTotalMb="+__ref._resolvetotaldiskmbtext /*String*/ (null));
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="TraceInfo(\"system\", \"кэш треков\", \"trackCount=\" &";
__ref._traceinfo /*String*/ (null,"system","кэш треков","trackCount="+__ref._resolvetrackcachefilecounttext /*String*/ (null)+" trackIndex="+BA.NumberToString(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedtrackcount /*int*/ (null))+" trackMb="+__ref._resolvetrackcachesizembtext /*String*/ (null));
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="TraceInfo(\"system\", \"кэш рекламы\", \"adCount=\" & R";
__ref._traceinfo /*String*/ (null,"system","кэш рекламы","adCount="+__ref._resolveadcachefilecounttext /*String*/ (null)+" adIndex="+BA.NumberToString(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedadcount /*int*/ (null))+" adMb="+__ref._resolveadcachesizembtext /*String*/ (null));
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="TraceInfo(\"system\", \"история\", \"pendingHistory=\"";
__ref._traceinfo /*String*/ (null,"system","история","pendingHistory="+BA.NumberToString(__ref._getpendinghistoryfilecount /*int*/ (null)));
RDebugUtils.currentLine=19726350;
 //BA.debugLineNum = 19726350;BA.debugLine="End Sub";
return "";
}
public boolean  _canadvanceplaybacknow(b4j.example.b4xmainpage __ref,String _initiator,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canadvanceplaybacknow", false))
	 {return ((Boolean) Debug.delegate(ba, "canadvanceplaybacknow", new Object[] {_initiator,_logdecision}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub CanAdvancePlaybackNow(initiator As Str";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="If orchestrationState.IsStoppedByUser Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=stopped_by_user");};
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="If orchestrationState.IsStopping Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=stopping");};
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="If directorState.FlowState = FLOW_STOPPING Then";
if ((__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._flowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ )) { 
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="If logDecision Then TraceLog(\"guard переход зап";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=flow_stopping");};
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="If directorState.FlowState = FLOW_PAUSED_POLICY";
if ((__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._flowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ )) { 
RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="If logDecision Then TraceLog(\"guard переход зап";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=flow_paused_policy");};
RDebugUtils.currentLine=9371664;
 //BA.debugLineNum = 9371664;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
RDebugUtils.currentLine=9371667;
 //BA.debugLineNum = 9371667;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ )) { 
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=flow_stopping");};
RDebugUtils.currentLine=9371669;
 //BA.debugLineNum = 9371669;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="If playbackFlowState = FLOW_PAUSED_POLICY Then";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ )) { 
RDebugUtils.currentLine=9371672;
 //BA.debugLineNum = 9371672;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=flow_paused_policy");};
RDebugUtils.currentLine=9371673;
 //BA.debugLineNum = 9371673;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9371675;
 //BA.debugLineNum = 9371675;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="End Sub";
return false;
}
public boolean  _canapplypendingappupdatenow(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canapplypendingappupdatenow", false))
	 {return ((Boolean) Debug.delegate(ba, "canapplypendingappupdatenow", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub CanApplyPendingAppUpdateNow As Boolean";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If playbackFlowState = FLOW_IDLE Then Return True";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_idle /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If playbackFlowState = FLOW_PAUSED_POLICY Then Re";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="If playbackFlowState = FLOW_ERROR Then Return Tru";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_error /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="If IsPlaybackFlowActive = False Then Return True";
if (__ref._isplaybackflowactive /*boolean*/ (null)==__c.False) { 
if (true) return __c.True;};
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackflowactive(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackflowactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackflowactive", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub IsPlaybackFlowActive As Boolean";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._isflowactive /*boolean*/ (null);};
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Return playbackFlowState = FLOW_PLAYING Or playba";
if (true) return (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_playing /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_preparing /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_transitioning /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_starting /*String*/ );
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="End Sub";
return false;
}
public String  _canceldeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canceldeferredpoststarttasks", false))
	 {return ((String) Debug.delegate(ba, "canceldeferredpoststarttasks", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub CancelDeferredPostStartTasks";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If isAdWarmupDeferredAfterStartup = False And isP";
if (__ref._isadwarmupdeferredafterstartup /*boolean*/ ==__c.False && __ref._ispoststarttasksdeferredafterstartup /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return "";
}
public boolean  _cancrossfadeprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cancrossfadeprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "cancrossfadeprepareditem", null));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub CanCrossfadePreparedItem As Boolean";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If ShouldBlockMusicTransitionForExactBreak Then R";
if (__ref._shouldblockmusictransitionforexactbreak /*boolean*/ (null)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Return transitionCoordinator.CanCrossfadePrepared";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._cancrossfadeprepareditem /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._isplaybacktransitioninprogress /*boolean*/ (null));
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldblockmusictransitionforexactbreak(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldblockmusictransitionforexactbreak", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldblockmusictransitionforexactbreak", null));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub ShouldBlockMusicTransitionForExactBrea";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Return HasPendingExactBreak";
if (true) return __ref._haspendingexactbreak /*boolean*/ (null);
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybacktransitioninprogress(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybacktransitioninprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybacktransitioninprogress", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub IsPlaybackTransitionInProgress As Bool";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._istransitioninprogress /*boolean*/ (null);};
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Return playbackFlowState = FLOW_STARTING Or playb";
if (true) return (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_starting /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_transitioning /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ );
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="End Sub";
return false;
}
public boolean  _canprefetchnextnow(b4j.example.b4xmainpage __ref,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canprefetchnextnow", false))
	 {return ((Boolean) Debug.delegate(ba, "canprefetchnextnow", new Object[] {_logdecision}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub CanPrefetchNextNow(logDecision As Bool";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If orchestrationState.PrefetchDone Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._prefetchdone /*boolean*/ ) { 
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="If logDecision Then TraceLog(\"guard prefetch зап";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard prefetch запрет reason=already_done");};
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="If ShouldBlockMusicTransitionForExactBreak Then";
if (__ref._shouldblockmusictransitionforexactbreak /*boolean*/ (null)) { 
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="If logDecision Then TraceLog(\"guard prefetch зап";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard prefetch запрет reason=exact_break_pending");};
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Return CanPrepareNextPlayableNow(logDecision)";
if (true) return __ref._canpreparenextplayablenow /*boolean*/ (null,_logdecision);
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="End Sub";
return false;
}
public boolean  _canpreparenextplayablenow(b4j.example.b4xmainpage __ref,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canpreparenextplayablenow", false))
	 {return ((Boolean) Debug.delegate(ba, "canpreparenextplayablenow", new Object[] {_logdecision}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub CanPrepareNextPlayableNow(logDecision";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard подготовка запрет reason=not_started");};
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Return CanAdvancePlaybackNow(\"prepare_next\", logD";
if (true) return __ref._canadvanceplaybacknow /*boolean*/ (null,"prepare_next",_logdecision);
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="End Sub";
return false;
}
public boolean  _canresumeplaybacknow(b4j.example.b4xmainpage __ref,String _reason,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canresumeplaybacknow", false))
	 {return ((Boolean) Debug.delegate(ba, "canresumeplaybacknow", new Object[] {_reason,_logdecision}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub CanResumePlaybackNow(reason As String,";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="If IsUserStoppedState Then";
if (__ref._isuserstoppedstate /*boolean*/ (null)) { 
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=user_stopped");};
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="If orchestrationState.IsStopping Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=stopping");};
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="If IsPolicyPauseState Then";
if (__ref._ispolicypausestate /*boolean*/ (null)) { 
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=policy_pause");};
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=not_started");};
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="End Sub";
return false;
}
public boolean  _isuserstoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isuserstoppedstate", false))
	 {return ((Boolean) Debug.delegate(ba, "isuserstoppedstate", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub IsUserStoppedState As Boolean";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return orchestrationState.IsStoppedByUser";
if (true) return __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return false;
}
public boolean  _canrundeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canrundeferredpoststarttasks", false))
	 {return ((Boolean) Debug.delegate(ba, "canrundeferredpoststarttasks", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub CanRunDeferredPostStartTasks As Boolea";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="If orchestrationState.IsStopping Or orchestration";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", null));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub CanStartPreparedOnTrackTail As Boolean";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Return transitionCoordinator.CanStartPreparedOnTr";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._canstartpreparedontracktail /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._isplaybacktransitioninprogress /*boolean*/ (null));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="End Sub";
return false;
}
public boolean  _canstopplaybacknow(b4j.example.b4xmainpage __ref,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canstopplaybacknow", false))
	 {return ((Boolean) Debug.delegate(ba, "canstopplaybacknow", new Object[] {_logdecision}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub CanStopPlaybackNow(logDecision As Bool";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="If orchestrationState.IsStopping Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="If logDecision Then TraceLog(\"stop skip reason=a";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"stop skip reason=already_stopping");};
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="End Sub";
return false;
}
public boolean  _canuseprepareditemnow(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canuseprepareditemnow", false))
	 {return ((Boolean) Debug.delegate(ba, "canuseprepareditemnow", null));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub CanUsePreparedItemNow As Boolean";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="If ShouldTriggerBreakNow Then Return False";
if (__ref._shouldtriggerbreaknow /*boolean*/ (null)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Return HasUsablePreparedItem And CanAdvancePlayba";
if (true) return __ref._hasusableprepareditem /*boolean*/ (null) && __ref._canadvanceplaybacknow /*boolean*/ (null,"prepared_item",__c.False);
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="End Sub";
return false;
}
public boolean  _hasusableprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hasusableprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "hasusableprepareditem", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub HasUsablePreparedItem As Boolean";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._haspreparedslot /*boolean*/ (null);};
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Return transitionCoordinator.HasUsablePreparedIte";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._hasusableprepareditem /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ );
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="End Sub";
return false;
}
public String  _checkforappupdate(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "checkforappupdate", false))
	 {return ((String) Debug.delegate(ba, "checkforappupdate", new Object[] {_data}));}
int _serverversion = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub CheckForAppUpdate(data As Map)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If data.IsInitialized = False Then Return";
if (_data.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim serverVersion As Int = Floor(ToLongDefault(da";
_serverversion = (int) (__c.Floor(__ref._tolongdefault /*long*/ (null,_data.GetDefault((Object)("version"),(Object)(_main._versioncode /*int*/ )),(long) (_main._versioncode /*int*/ ))));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If serverVersion <= Main.VersionCode Then Return";
if (_serverversion<=_main._versioncode /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="ClearFailedAppUpdateVersionIfNewer(serverVersion)";
__ref._clearfailedappupdateversionifnewer /*String*/ (null,_serverversion);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="If serverVersion > pendingAppUpdateVersion Then p";
if (_serverversion>__ref._pendingappupdateversion /*int*/ ) { 
__ref._pendingappupdateversion /*int*/  = _serverversion;};
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="If downloadedAppUpdateVersion >= serverVersion Th";
if (__ref._downloadedappupdateversion /*int*/ >=_serverversion) { 
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="TryApplyPendingAppUpdate(\"already_downloaded\")";
__ref._tryapplypendingappupdate /*boolean*/ (null,"already_downloaded");
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="If ShouldSkipFailedAppUpdateVersion(serverVersion";
if (__ref._shouldskipfailedappupdateversion /*boolean*/ (null,_serverversion)) { 
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="TraceInfo(\"update\", \"обновление пропущено\", \"rea";
__ref._traceinfo /*String*/ (null,"update","обновление пропущено","reason=remembered_failed_version target="+BA.NumberToString(_serverversion)+" retryAfter="+BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._app_update_failed_retry_after_key /*String*/ ,(Object)(0))));
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="If isAppUpdateDownloadInProgress Then Return";
if (__ref._isappupdatedownloadinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="TraceInfo(\"update\", \"обнаружена новая версия\", \"c";
__ref._traceinfo /*String*/ (null,"update","обнаружена новая версия","current="+BA.NumberToString(_main._versioncode /*int*/ )+" server="+BA.NumberToString(_serverversion));
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="DownloadAppUpdateAsync(serverVersion)";
__ref._downloadappupdateasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_serverversion);
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="End Sub";
return "";
}
public long  _tolongdefault(b4j.example.b4xmainpage __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Try";
try {RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="Try";
try {RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=24903691;
 //BA.debugLineNum = 24903691;BA.debugLine="End Sub";
return 0L;
}
public String  _clearfailedappupdateversionifnewer(b4j.example.b4xmainpage __ref,int _targetversion) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearfailedappupdateversionifnewer", false))
	 {return ((String) Debug.delegate(ba, "clearfailedappupdateversionifnewer", new Object[] {_targetversion}));}
int _failedversion = 0;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub ClearFailedAppUpdateVersionIfNewer(tar";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim failedVersion As Int = Floor(ToLongDefault(st";
_failedversion = (int) (__c.Floor(__ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._app_update_failed_version_key /*String*/ ,(Object)(0)),(long) (0))));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If failedVersion <= 0 Then Return";
if (_failedversion<=0) { 
if (true) return "";};
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="If targetVersion <= failedVersion Then Return";
if (_targetversion<=_failedversion) { 
if (true) return "";};
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="ClearFailedAppUpdateState";
__ref._clearfailedappupdatestate /*String*/ (null);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="TraceInfo(\"update\", \"сброс запомненной ошибки\", \"";
__ref._traceinfo /*String*/ (null,"update","сброс запомненной ошибки","failedVersion="+BA.NumberToString(_failedversion)+" newerVersion="+BA.NumberToString(_targetversion));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public boolean  _tryapplypendingappupdate(b4j.example.b4xmainpage __ref,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tryapplypendingappupdate", false))
	 {return ((Boolean) Debug.delegate(ba, "tryapplypendingappupdate", new Object[] {_reason}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub TryApplyPendingAppUpdate(reason As Str";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If downloadedAppUpdateVersion <= Main.VersionCode";
if (__ref._downloadedappupdateversion /*int*/ <=_main._versioncode /*int*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If PlatformBridge.IsStagedUpdateReady(appUpdateDi";
if (_platformbridge._isstagedupdateready /*boolean*/ (__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ )==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="If PlatformBridge.IsHostedRuntime = False Then";
if (_platformbridge._ishostedruntime /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="TraceInfo(\"update\", \"обновление отложено\", \"reas";
__ref._traceinfo /*String*/ (null,"update","обновление отложено","reason=no_host target="+BA.NumberToString(__ref._downloadedappupdateversion /*int*/ ));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="If CanApplyPendingAppUpdateNow = False Then";
if (__ref._canapplypendingappupdatenow /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="TraceInfo(\"update\", \"обновление отложено\", \"reas";
__ref._traceinfo /*String*/ (null,"update","обновление отложено","reason="+_reason+" stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="TraceInfo(\"update\", \"применение обновления\", \"rea";
__ref._traceinfo /*String*/ (null,"update","применение обновления","reason="+_reason+" target="+BA.NumberToString(__ref._downloadedappupdateversion /*int*/ ));
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="ShowMessage(MessageValue(\"player_reloading\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_reloading"));
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Return PlatformBridge.RequestStagedUpdateApply(ap";
if (true) return _platformbridge._requeststagedupdateapply /*boolean*/ (__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ );
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldskipfailedappupdateversion(b4j.example.b4xmainpage __ref,int _targetversion) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldskipfailedappupdateversion", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldskipfailedappupdateversion", new Object[] {_targetversion}));}
int _failedversion = 0;
long _retryafterticks = 0L;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub ShouldSkipFailedAppUpdateVersion(targe";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim failedVersion As Int = Floor(ToLongDefault(st";
_failedversion = (int) (__c.Floor(__ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._app_update_failed_version_key /*String*/ ,(Object)(0)),(long) (0))));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If failedVersion <= 0 Then Return False";
if (_failedversion<=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If targetVersion > failedVersion Then Return Fals";
if (_targetversion>_failedversion) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="If targetVersion <> failedVersion Then Return Fal";
if (_targetversion!=_failedversion) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Dim retryAfterTicks As Long = ToLongDefault(stora";
_retryafterticks = __ref._tolongdefault /*long*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._app_update_failed_retry_after_key /*String*/ ,(Object)(0)),(long) (0));
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Return retryAfterTicks > DateTime.Now";
if (true) return _retryafterticks>__c.DateTime.getNow();
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadappupdateasync(b4j.example.b4xmainpage __ref,int _targetversion) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "downloadappupdateasync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "downloadappupdateasync", new Object[] {_targetversion}));}
ResumableSub_DownloadAppUpdateAsync rsub = new ResumableSub_DownloadAppUpdateAsync(this,__ref,_targetversion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadAppUpdateAsync extends BA.ResumableSub {
public ResumableSub_DownloadAppUpdateAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,int _targetversion) {
this.parent = parent;
this.__ref = __ref;
this._targetversion = _targetversion;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _targetversion;
String _lastfailurereason = "";
int _attempt = 0;
anywheresoftware.b4a.objects.collections.Map _attemptresult = null;
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If isAppUpdateDownloadInProgress Then Return Fals";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isappupdatedownloadinprogress /*boolean*/ ) { 
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
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="isAppUpdateDownloadInProgress = True";
__ref._isappupdatedownloadinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="TraceInfo(\"update\", \"загрузка обновления\", \"targe";
__ref._traceinfo /*String*/ (null,"update","загрузка обновления","target="+BA.NumberToString(_targetversion)+" attempts=2");
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim lastFailureReason As String = \"\"";
_lastfailurereason = "";
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="For attempt = 1 To 2";
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
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="TraceInfo(\"update\", \"попытка загрузки\", \"target=";
__ref._traceinfo /*String*/ (null,"update","попытка загрузки","target="+BA.NumberToString(_targetversion)+" attempt="+BA.NumberToString(_attempt));
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Wait For (TryDownloadAppUpdateOnce(targetVersion";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "downloadappupdateasync"), __ref._trydownloadappupdateonce /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_targetversion,_attempt));
this.state = 17;
return;
case 17:
//C
this.state = 10;
_attemptresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="If attemptResult.GetDefault(\"success\", False) Th";
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
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="ClearFailedAppUpdateState";
__ref._clearfailedappupdatestate /*String*/ (null);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="downloadedAppUpdateVersion = targetVersion";
__ref._downloadedappupdateversion /*int*/  = _targetversion;
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="TraceInfo(\"update\", \"обновление загружено\", \"ta";
__ref._traceinfo /*String*/ (null,"update","обновление загружено","target="+BA.NumberToString(_targetversion)+" file="+__ref._app_update_file /*String*/ );
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="ShowMessage(MessageValue(\"player_updated\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_updated"));
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="TryApplyPendingAppUpdate(\"download_complete\")";
__ref._tryapplypendingappupdate /*boolean*/ (null,"download_complete");
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="isAppUpdateDownloadInProgress = False";
__ref._isappupdatedownloadinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 13:
//C
this.state = 16;
;
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="lastFailureReason = attemptResult.GetDefault(\"re";
_lastfailurereason = BA.ObjectToString(_attemptresult.GetDefault((Object)("reason"),(Object)("download_failed")));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="RememberFailedAppUpdateVersion(targetVersion, las";
__ref._rememberfailedappupdateversion /*String*/ (null,_targetversion,_lastfailurereason,(int) (2));
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="isAppUpdateDownloadInProgress = False";
__ref._isappupdatedownloadinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _claimurlvalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "claimurlvalue", false))
	 {return ((String) Debug.delegate(ba, "claimurlvalue", null));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub ClaimUrlValue As String";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Return CLAIM_BASE_URL";
if (true) return __ref._claim_base_url /*String*/ ;
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Private Const NEXT_BASE_URL As String = \"https://";
_next_base_url = "https://play.fon.fm/next";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private Const CLAIM_BASE_URL As String = \"https:/";
_claim_base_url = "https://play.fon.fm/claim";
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Private Const HISTORY_BASE_URL As String = \"https";
_history_base_url = "https://play.fon.fm/history";
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Private Const TRACE_BASE_URL As String = \"https:/";
_trace_base_url = "https://play.fon.fm/trace";
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Private Const CLIENT_HEADER_NAME As String = \"X-F";
_client_header_name = "X-Fonfm-Client";
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Private Const CLIENT_HEADER_VALUE As String = \"wi";
_client_header_value = "windows-player";
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Private Const HISTORY_FLUSH_INTERVAL_MS As Int =";
_history_flush_interval_ms = (int) (30000);
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Private Const TRACE_FLUSH_INTERVAL_MS As Int = 60";
_trace_flush_interval_ms = (int) (60*1000);
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Private Const DATA_BASE_URL As String = \"https://";
_data_base_url = "https://play.fon.fm/data";
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Private Const APP_UPDATE_URL As String = \"https:/";
_app_update_url = "https://play.fon.fm/app/fonfm.jar";
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Private Const APP_UPDATE_FILE As String = \"_fonfm";
_app_update_file = "_fonfm.jar";
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="Private Const APP_UPDATE_TEMP_FILE As String = \"_";
_app_update_temp_file = "_fonfm.jar.download";
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Private Const APP_UPDATE_RETRY_DELAY_MS As Long =";
_app_update_retry_delay_ms = (long) (60*60*1000);
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="Private Const APP_UPDATE_FAILED_VERSION_KEY As St";
_app_update_failed_version_key = "update_failed_version";
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Private Const APP_UPDATE_FAILED_REASON_KEY As Str";
_app_update_failed_reason_key = "update_failed_reason";
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="Private Const APP_UPDATE_FAILED_AT_KEY As String";
_app_update_failed_at_key = "update_failed_at";
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Private Const APP_UPDATE_FAILED_RETRY_AFTER_KEY A";
_app_update_failed_retry_after_key = "update_failed_retry_after";
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Private Const APP_UPDATE_FAILED_ATTEMPTS_KEY As S";
_app_update_failed_attempts_key = "update_failed_attempts";
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Private Const PLAYLIST_CDN_BASE_URL As String = \"";
_playlist_cdn_base_url = "https://cdn.fon.fm/data/playlists/";
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Private Const SERVICE_CHECK_URL As String = \"http";
_service_check_url = "https://play.fon.fm/data";
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="Private Const USE_DATA_PLAYBACK_RESOLVER As Boole";
_use_data_playback_resolver = __c.True;
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="Private Const LOCAL_PLAYBACK_ONLY As Boolean = Tr";
_local_playback_only = __c.True;
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="Private Const ICON_PLAY As String = Chr(0xE037)";
_icon_play = BA.ObjectToString(__c.Chr(((int)0xe037)));
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="Private Const ICON_STOP As String = Chr(0xE047)";
_icon_stop = BA.ObjectToString(__c.Chr(((int)0xe047)));
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="Private Const ICON_MORE As String = Chr(0xE5D3)";
_icon_more = BA.ObjectToString(__c.Chr(((int)0xe5d3)));
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="Private Const ICON_CLOSE As String = Chr(0xE5CD)";
_icon_close = BA.ObjectToString(__c.Chr(((int)0xe5cd)));
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="Private Const ICON_CLOUD_OK As String = Chr(0xE2B";
_icon_cloud_ok = BA.ObjectToString(__c.Chr(((int)0xe2bf)));
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="Private Const ICON_CLOUD_OFF As String = Chr(0xE2";
_icon_cloud_off = BA.ObjectToString(__c.Chr(((int)0xe2c1)));
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="Private Const ICON_CLOUD_DEGRADED As String = Chr";
_icon_cloud_degraded = BA.ObjectToString(__c.Chr(((int)0xe2c2)));
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="Private Const PREFETCH_SECONDS As Int = 10";
_prefetch_seconds = (int) (10);
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="Private Const STOP_FADE_MS As Int = 3000";
_stop_fade_ms = (int) (3000);
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="Private Const ORBIT_FADE_MS As Int = 3000";
_orbit_fade_ms = (int) (3000);
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="Private Const START_FADE_MS As Int = 1500";
_start_fade_ms = (int) (1500);
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="Private Const TRACK_OVERLAP_MS As Int = 1800";
_track_overlap_ms = (int) (1800);
RDebugUtils.currentLine=786467;
 //BA.debugLineNum = 786467;BA.debugLine="Private Const AD_TAIL_OVERLAP_MS As Int = 350";
_ad_tail_overlap_ms = (int) (350);
RDebugUtils.currentLine=786468;
 //BA.debugLineNum = 786468;BA.debugLine="Private Const CACHE_AUDIT_START_DELAY_MS As Int =";
_cache_audit_start_delay_ms = (int) (20000);
RDebugUtils.currentLine=786469;
 //BA.debugLineNum = 786469;BA.debugLine="Private Const CACHE_AUDIT_STEP_INTERVAL_MS As Int";
_cache_audit_step_interval_ms = (int) (2000);
RDebugUtils.currentLine=786470;
 //BA.debugLineNum = 786470;BA.debugLine="Private Const CACHE_AUDIT_RECHECK_INTERVAL_MS As";
_cache_audit_recheck_interval_ms = (int) (30*60*1000);
RDebugUtils.currentLine=786471;
 //BA.debugLineNum = 786471;BA.debugLine="Private Const TRACK_CACHE_PRUNE_COOLDOWN_MS As Lo";
_track_cache_prune_cooldown_ms = (long) (10*60*1000);
RDebugUtils.currentLine=786472;
 //BA.debugLineNum = 786472;BA.debugLine="Private Const DATA_REFRESH_MS As Int = 5 * 60 * 1";
_data_refresh_ms = (int) (5*60*1000);
RDebugUtils.currentLine=786473;
 //BA.debugLineNum = 786473;BA.debugLine="Private Const FETCH_TIMEOUT_MS As Int = 4000";
_fetch_timeout_ms = (int) (4000);
RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="Private Const AUDIO_READY_TIMEOUT_MS As Int = 500";
_audio_ready_timeout_ms = (int) (5000);
RDebugUtils.currentLine=786477;
 //BA.debugLineNum = 786477;BA.debugLine="Private Const AUDIO_OUTPUT_ERROR_PAUSE_THRESHOLD";
_audio_output_error_pause_threshold = (int) (3);
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="Private Const AUDIO_OUTPUT_RETRY_DELAY_MS As Int";
_audio_output_retry_delay_ms = (int) (15000);
RDebugUtils.currentLine=786479;
 //BA.debugLineNum = 786479;BA.debugLine="Private Const PLAYBACK_WATCHDOG_INTERVAL_MS As In";
_playback_watchdog_interval_ms = (int) (1000);
RDebugUtils.currentLine=786480;
 //BA.debugLineNum = 786480;BA.debugLine="Private Const PLAYBACK_DIRECTOR_INTERVAL_MS As In";
_playback_director_interval_ms = (int) (250);
RDebugUtils.currentLine=786481;
 //BA.debugLineNum = 786481;BA.debugLine="Private Const PLAYBACK_WATCHDOG_STALL_MS As Long";
_playback_watchdog_stall_ms = (long) (4000);
RDebugUtils.currentLine=786482;
 //BA.debugLineNum = 786482;BA.debugLine="Private Const PLAYBACK_WATCHDOG_RECOVERY_COOLDOWN";
_playback_watchdog_recovery_cooldown_ms = (long) (10000);
RDebugUtils.currentLine=786483;
 //BA.debugLineNum = 786483;BA.debugLine="Private Const PLAYBACK_WATCHDOG_PROGRESS_DELTA_MS";
_playback_watchdog_progress_delta_ms = (long) (150);
RDebugUtils.currentLine=786484;
 //BA.debugLineNum = 786484;BA.debugLine="Private Const PLAYBACK_WATCHDOG_GRACE_MS As Long";
_playback_watchdog_grace_ms = (long) (3000);
RDebugUtils.currentLine=786485;
 //BA.debugLineNum = 786485;BA.debugLine="Private Const TRACE_ERROR_DEBUG_CONTEXT_LINES As";
_trace_error_debug_context_lines = (int) (8);
RDebugUtils.currentLine=786486;
 //BA.debugLineNum = 786486;BA.debugLine="Private Const PAUSE_RETRY_DELAY As Int = 300000";
_pause_retry_delay = (int) (300000);
RDebugUtils.currentLine=786487;
 //BA.debugLineNum = 786487;BA.debugLine="Private Const LOCAL_RETRY_DELAY_INITIAL As Int =";
_local_retry_delay_initial = (int) (5000);
RDebugUtils.currentLine=786488;
 //BA.debugLineNum = 786488;BA.debugLine="Private Const LOCAL_RETRY_DELAY_MAX As Int = 3000";
_local_retry_delay_max = (int) (30000);
RDebugUtils.currentLine=786489;
 //BA.debugLineNum = 786489;BA.debugLine="Private Const SERVER_RETRY_DELAY_INITIAL As Int =";
_server_retry_delay_initial = (int) (10000);
RDebugUtils.currentLine=786490;
 //BA.debugLineNum = 786490;BA.debugLine="Private Const SERVER_RETRY_DELAY_MAX As Int = 600";
_server_retry_delay_max = (int) (60000);
RDebugUtils.currentLine=786491;
 //BA.debugLineNum = 786491;BA.debugLine="Private Const BLOCKED_RETRY_DELAY As Int = 60000";
_blocked_retry_delay = (int) (60000);
RDebugUtils.currentLine=786492;
 //BA.debugLineNum = 786492;BA.debugLine="Private Const FLOW_IDLE As String = \"idle\"";
_flow_idle = "idle";
RDebugUtils.currentLine=786493;
 //BA.debugLineNum = 786493;BA.debugLine="Private Const FLOW_STARTING As String = \"starting";
_flow_starting = "starting";
RDebugUtils.currentLine=786494;
 //BA.debugLineNum = 786494;BA.debugLine="Private Const FLOW_PLAYING As String = \"playing\"";
_flow_playing = "playing";
RDebugUtils.currentLine=786495;
 //BA.debugLineNum = 786495;BA.debugLine="Private Const FLOW_PREPARING As String = \"prepari";
_flow_preparing = "preparing";
RDebugUtils.currentLine=786496;
 //BA.debugLineNum = 786496;BA.debugLine="Private Const FLOW_TRANSITIONING As String = \"tra";
_flow_transitioning = "transitioning";
RDebugUtils.currentLine=786497;
 //BA.debugLineNum = 786497;BA.debugLine="Private Const FLOW_STOPPING As String = \"stopping";
_flow_stopping = "stopping";
RDebugUtils.currentLine=786498;
 //BA.debugLineNum = 786498;BA.debugLine="Private Const FLOW_PAUSED_POLICY As String = \"pau";
_flow_paused_policy = "paused_policy";
RDebugUtils.currentLine=786499;
 //BA.debugLineNum = 786499;BA.debugLine="Private Const FLOW_ERROR As String = \"error\"";
_flow_error = "error";
RDebugUtils.currentLine=786500;
 //BA.debugLineNum = 786500;BA.debugLine="Private rootView As B4XView";
_rootview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786501;
 //BA.debugLineNum = 786501;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=786502;
 //BA.debugLineNum = 786502;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=786503;
 //BA.debugLineNum = 786503;BA.debugLine="Private appUpdateDir As String";
_appupdatedir = "";
RDebugUtils.currentLine=786504;
 //BA.debugLineNum = 786504;BA.debugLine="Private storageFile As String = \"player_state.jso";
_storagefile = "player_state.json";
RDebugUtils.currentLine=786505;
 //BA.debugLineNum = 786505;BA.debugLine="Private localStateDbName As String = \"LocalState\"";
_localstatedbname = "LocalState";
RDebugUtils.currentLine=786506;
 //BA.debugLineNum = 786506;BA.debugLine="Private trustedSyncTimeKey As String = \"trusted_s";
_trustedsynctimekey = "trusted_sync_time_ticks";
RDebugUtils.currentLine=786507;
 //BA.debugLineNum = 786507;BA.debugLine="Private playerDataFile As String = \"player_data.j";
_playerdatafile = "player_data.json";
RDebugUtils.currentLine=786508;
 //BA.debugLineNum = 786508;BA.debugLine="Private playlistRequirementsFile As String = \"pla";
_playlistrequirementsfile = "playlist_requirements.json";
RDebugUtils.currentLine=786509;
 //BA.debugLineNum = 786509;BA.debugLine="Private localPlaylistsDirName As String = \"playli";
_localplaylistsdirname = "playlists";
RDebugUtils.currentLine=786510;
 //BA.debugLineNum = 786510;BA.debugLine="Private historyDirName As String = \"history\"";
_historydirname = "history";
RDebugUtils.currentLine=786511;
 //BA.debugLineNum = 786511;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=786513;
 //BA.debugLineNum = 786513;BA.debugLine="Private card As B4XView";
_card = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786514;
 //BA.debugLineNum = 786514;BA.debugLine="Private headerPane As B4XView";
_headerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786515;
 //BA.debugLineNum = 786515;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786516;
 //BA.debugLineNum = 786516;BA.debugLine="Private contentPane As B4XView";
_contentpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786517;
 //BA.debugLineNum = 786517;BA.debugLine="Private footerPane As B4XView";
_footerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786518;
 //BA.debugLineNum = 786518;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786519;
 //BA.debugLineNum = 786519;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786520;
 //BA.debugLineNum = 786520;BA.debugLine="Private setupHeroPane As B4XView";
_setupheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786521;
 //BA.debugLineNum = 786521;BA.debugLine="Private setupDetailPane As B4XView";
_setupdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786522;
 //BA.debugLineNum = 786522;BA.debugLine="Private setupPrimaryPane As B4XView";
_setupprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786523;
 //BA.debugLineNum = 786523;BA.debugLine="Private setupStatusPane As B4XView";
_setupstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786524;
 //BA.debugLineNum = 786524;BA.debugLine="Private playerHeroPane As B4XView";
_playerheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786525;
 //BA.debugLineNum = 786525;BA.debugLine="Private playerDetailPane As B4XView";
_playerdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786526;
 //BA.debugLineNum = 786526;BA.debugLine="Private playerPrimaryPane As B4XView";
_playerprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786527;
 //BA.debugLineNum = 786527;BA.debugLine="Private playerStatusPane As B4XView";
_playerstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786528;
 //BA.debugLineNum = 786528;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786529;
 //BA.debugLineNum = 786529;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786530;
 //BA.debugLineNum = 786530;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786531;
 //BA.debugLineNum = 786531;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786532;
 //BA.debugLineNum = 786532;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786533;
 //BA.debugLineNum = 786533;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786535;
 //BA.debugLineNum = 786535;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786536;
 //BA.debugLineNum = 786536;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786537;
 //BA.debugLineNum = 786537;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786538;
 //BA.debugLineNum = 786538;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786539;
 //BA.debugLineNum = 786539;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786540;
 //BA.debugLineNum = 786540;BA.debugLine="Private lblFooter As B4XView";
_lblfooter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786541;
 //BA.debugLineNum = 786541;BA.debugLine="Private lblConnectionIcon As B4XView";
_lblconnectionicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786542;
 //BA.debugLineNum = 786542;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786544;
 //BA.debugLineNum = 786544;BA.debugLine="Private txtPlayerCode As TextField";
_txtplayercode = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=786545;
 //BA.debugLineNum = 786545;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786546;
 //BA.debugLineNum = 786546;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786547;
 //BA.debugLineNum = 786547;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786548;
 //BA.debugLineNum = 786548;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786549;
 //BA.debugLineNum = 786549;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
RDebugUtils.currentLine=786550;
 //BA.debugLineNum = 786550;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
RDebugUtils.currentLine=786551;
 //BA.debugLineNum = 786551;BA.debugLine="Private isCodeInputFocused As Boolean";
_iscodeinputfocused = false;
RDebugUtils.currentLine=786553;
 //BA.debugLineNum = 786553;BA.debugLine="Private audioPrimary As AudioPlayer";
_audioprimary = new b4j.example.audioplayer();
RDebugUtils.currentLine=786554;
 //BA.debugLineNum = 786554;BA.debugLine="Private audioSecondary As AudioPlayer";
_audiosecondary = new b4j.example.audioplayer();
RDebugUtils.currentLine=786555;
 //BA.debugLineNum = 786555;BA.debugLine="Private localAdScheduler As AdScheduler";
_localadscheduler = new b4j.example.adscheduler();
RDebugUtils.currentLine=786556;
 //BA.debugLineNum = 786556;BA.debugLine="Private dataResolver As DataPlaybackResolver";
_dataresolver = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=786557;
 //BA.debugLineNum = 786557;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4j.example.offlinestore();
RDebugUtils.currentLine=786558;
 //BA.debugLineNum = 786558;BA.debugLine="Private appTraceService As TraceService";
_apptraceservice = new b4j.example.traceservice();
RDebugUtils.currentLine=786559;
 //BA.debugLineNum = 786559;BA.debugLine="Private autoCacheManager As AutonomousCacheManage";
_autocachemanager = new b4j.example.autonomouscachemanager();
RDebugUtils.currentLine=786560;
 //BA.debugLineNum = 786560;BA.debugLine="Private traceFormatter As PlaybackTraceFormatter";
_traceformatter = new b4j.example.playbacktraceformatter();
RDebugUtils.currentLine=786561;
 //BA.debugLineNum = 786561;BA.debugLine="Private traceRouter As PlaybackTraceRouter";
_tracerouter = new b4j.example.playbacktracerouter();
RDebugUtils.currentLine=786562;
 //BA.debugLineNum = 786562;BA.debugLine="Private traceUploader As PlaybackTraceUploader";
_traceuploader = new b4j.example.playbacktraceuploader();
RDebugUtils.currentLine=786563;
 //BA.debugLineNum = 786563;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4j.example.mediacache();
RDebugUtils.currentLine=786564;
 //BA.debugLineNum = 786564;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=786565;
 //BA.debugLineNum = 786565;BA.debugLine="Private playQueue As List";
_playqueue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786566;
 //BA.debugLineNum = 786566;BA.debugLine="Private messages As Map";
_messages = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=786567;
 //BA.debugLineNum = 786567;BA.debugLine="Private traceLogLimit As Int = 1000";
_traceloglimit = (int) (1000);
RDebugUtils.currentLine=786568;
 //BA.debugLineNum = 786568;BA.debugLine="Private serverSnapshotLimit As Int = 30";
_serversnapshotlimit = (int) (30);
RDebugUtils.currentLine=786569;
 //BA.debugLineNum = 786569;BA.debugLine="Private retryTimer As Timer";
_retrytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786570;
 //BA.debugLineNum = 786570;BA.debugLine="Private breakTimer As Timer";
_breaktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786571;
 //BA.debugLineNum = 786571;BA.debugLine="Private historyFlushTimer As Timer";
_historyflushtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786572;
 //BA.debugLineNum = 786572;BA.debugLine="Private traceUploadTimer As Timer";
_traceuploadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786573;
 //BA.debugLineNum = 786573;BA.debugLine="Private orbitTimer As Timer";
_orbittimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786574;
 //BA.debugLineNum = 786574;BA.debugLine="Private offlineDataRefreshTimer As Timer";
_offlinedatarefreshtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786575;
 //BA.debugLineNum = 786575;BA.debugLine="Private localAdMinuteTimer As Timer";
_localadminutetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786576;
 //BA.debugLineNum = 786576;BA.debugLine="Private cacheAuditTimer As Timer";
_cacheaudittimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786577;
 //BA.debugLineNum = 786577;BA.debugLine="Private playbackWatchdogTimer As Timer";
_playbackwatchdogtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786578;
 //BA.debugLineNum = 786578;BA.debugLine="Private playbackDirectorTimer As Timer";
_playbackdirectortimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786579;
 //BA.debugLineNum = 786579;BA.debugLine="Private machineGuidShell As Shell";
_machineguidshell = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=786581;
 //BA.debugLineNum = 786581;BA.debugLine="Private playerCode As String";
_playercode = "";
RDebugUtils.currentLine=786582;
 //BA.debugLineNum = 786582;BA.debugLine="Private deviceId As String";
_deviceid = "";
RDebugUtils.currentLine=786583;
 //BA.debugLineNum = 786583;BA.debugLine="Private appScreenMode As String";
_appscreenmode = "";
RDebugUtils.currentLine=786584;
 //BA.debugLineNum = 786584;BA.debugLine="Private nextStartMode As String";
_nextstartmode = "";
RDebugUtils.currentLine=786585;
 //BA.debugLineNum = 786585;BA.debugLine="Private runtimeState As PlaybackRuntimeState";
_runtimestate = new b4j.example.playbackruntimestate();
RDebugUtils.currentLine=786586;
 //BA.debugLineNum = 786586;BA.debugLine="Private metaState As PlaybackMetaState";
_metastate = new b4j.example.playbackmetastate();
RDebugUtils.currentLine=786587;
 //BA.debugLineNum = 786587;BA.debugLine="Private orchestrationState As PlaybackOrchestrati";
_orchestrationstate = new b4j.example.playbackorchestrationstate();
RDebugUtils.currentLine=786588;
 //BA.debugLineNum = 786588;BA.debugLine="Private dataPolicyState As PlaybackDataPolicyStat";
_datapolicystate = new b4j.example.playbackdatapolicystate();
RDebugUtils.currentLine=786589;
 //BA.debugLineNum = 786589;BA.debugLine="Private offlinePlaybackCore As OfflinePlaybackEng";
_offlineplaybackcore = new b4j.example.offlineplaybackengine();
RDebugUtils.currentLine=786590;
 //BA.debugLineNum = 786590;BA.debugLine="Private transitionCoordinator As PlaybackTransiti";
_transitioncoordinator = new b4j.example.playbacktransitioncoordinator();
RDebugUtils.currentLine=786591;
 //BA.debugLineNum = 786591;BA.debugLine="Private playerDataCoordinator As PlaybackDataCoor";
_playerdatacoordinator = new b4j.example.playbackdatacoordinator();
RDebugUtils.currentLine=786592;
 //BA.debugLineNum = 786592;BA.debugLine="Private stateStore As PlayerStateStore";
_statestore = new b4j.example.playerstatestore();
RDebugUtils.currentLine=786593;
 //BA.debugLineNum = 786593;BA.debugLine="Private syncService As NetworkSyncService";
_syncservice = new b4j.example.networksyncservice();
RDebugUtils.currentLine=786594;
 //BA.debugLineNum = 786594;BA.debugLine="Private uiController As PlayerUiController";
_uicontroller = new b4j.example.playeruicontroller();
RDebugUtils.currentLine=786595;
 //BA.debugLineNum = 786595;BA.debugLine="Private directorState As PlaybackDirectorState";
_directorstate = new b4j.example.playbackdirectorstate();
RDebugUtils.currentLine=786596;
 //BA.debugLineNum = 786596;BA.debugLine="Private initialStartFadePending As Boolean";
_initialstartfadepending = false;
RDebugUtils.currentLine=786597;
 //BA.debugLineNum = 786597;BA.debugLine="Private isHistoryFlushInProgress As Boolean";
_ishistoryflushinprogress = false;
RDebugUtils.currentLine=786598;
 //BA.debugLineNum = 786598;BA.debugLine="Private cachedRelevantTrackIds As List";
_cachedrelevanttrackids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786599;
 //BA.debugLineNum = 786599;BA.debugLine="Private lastPlayButtonInputAt As Long";
_lastplaybuttoninputat = 0L;
RDebugUtils.currentLine=786600;
 //BA.debugLineNum = 786600;BA.debugLine="Private lastHeaderActionInputAt As Long";
_lastheaderactioninputat = 0L;
RDebugUtils.currentLine=786601;
 //BA.debugLineNum = 786601;BA.debugLine="Private lastUserPlaybackInputAt As Long";
_lastuserplaybackinputat = 0L;
RDebugUtils.currentLine=786602;
 //BA.debugLineNum = 786602;BA.debugLine="Private lastTrackCachePruneAt As Long";
_lasttrackcachepruneat = 0L;
RDebugUtils.currentLine=786603;
 //BA.debugLineNum = 786603;BA.debugLine="Private consecutiveAudioOutputErrors As Int";
_consecutiveaudiooutputerrors = 0;
RDebugUtils.currentLine=786604;
 //BA.debugLineNum = 786604;BA.debugLine="Private isAudioOutputRecoveryPause As Boolean";
_isaudiooutputrecoverypause = false;
RDebugUtils.currentLine=786605;
 //BA.debugLineNum = 786605;BA.debugLine="Private lastPlaybackWatchdogPositionMs As Long";
_lastplaybackwatchdogpositionms = 0L;
RDebugUtils.currentLine=786606;
 //BA.debugLineNum = 786606;BA.debugLine="Private lastPlaybackWatchdogTrackId As String";
_lastplaybackwatchdogtrackid = "";
RDebugUtils.currentLine=786607;
 //BA.debugLineNum = 786607;BA.debugLine="Private lastPlaybackWatchdogProgressAt As Long";
_lastplaybackwatchdogprogressat = 0L;
RDebugUtils.currentLine=786608;
 //BA.debugLineNum = 786608;BA.debugLine="Private lastPlaybackWatchdogRecoveryAt As Long";
_lastplaybackwatchdogrecoveryat = 0L;
RDebugUtils.currentLine=786609;
 //BA.debugLineNum = 786609;BA.debugLine="Private isPlaybackWatchdogTickInProgress As Boole";
_isplaybackwatchdogtickinprogress = false;
RDebugUtils.currentLine=786610;
 //BA.debugLineNum = 786610;BA.debugLine="Private isPlaybackDirectorTickQueued As Boolean";
_isplaybackdirectortickqueued = false;
RDebugUtils.currentLine=786611;
 //BA.debugLineNum = 786611;BA.debugLine="Private playbackActivationToken As Long";
_playbackactivationtoken = 0L;
RDebugUtils.currentLine=786612;
 //BA.debugLineNum = 786612;BA.debugLine="Private scheduledBreakAt As Long";
_scheduledbreakat = 0L;
RDebugUtils.currentLine=786613;
 //BA.debugLineNum = 786613;BA.debugLine="Private audioTimeupdateQueuedByKey As Map";
_audiotimeupdatequeuedbykey = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=786615;
 //BA.debugLineNum = 786615;BA.debugLine="Private playlistIndex As Int = -1";
_playlistindex = (int) (-1);
RDebugUtils.currentLine=786616;
 //BA.debugLineNum = 786616;BA.debugLine="Private orbitPulseStep As Int";
_orbitpulsestep = 0;
RDebugUtils.currentLine=786617;
 //BA.debugLineNum = 786617;BA.debugLine="Private isStartupSequenceInProgress As Boolean";
_isstartupsequenceinprogress = false;
RDebugUtils.currentLine=786618;
 //BA.debugLineNum = 786618;BA.debugLine="Private isAdWarmupDeferredAfterStartup As Boolean";
_isadwarmupdeferredafterstartup = false;
RDebugUtils.currentLine=786619;
 //BA.debugLineNum = 786619;BA.debugLine="Private isPostStartTasksDeferredAfterStartup As B";
_ispoststarttasksdeferredafterstartup = false;
RDebugUtils.currentLine=786620;
 //BA.debugLineNum = 786620;BA.debugLine="Private playbackFlowState As String";
_playbackflowstate = "";
RDebugUtils.currentLine=786621;
 //BA.debugLineNum = 786621;BA.debugLine="Private isAppUpdateDownloadInProgress As Boolean";
_isappupdatedownloadinprogress = false;
RDebugUtils.currentLine=786622;
 //BA.debugLineNum = 786622;BA.debugLine="Private pendingAppUpdateVersion As Int";
_pendingappupdateversion = 0;
RDebugUtils.currentLine=786623;
 //BA.debugLineNum = 786623;BA.debugLine="Private downloadedAppUpdateVersion As Int";
_downloadedappupdateversion = 0;
RDebugUtils.currentLine=786624;
 //BA.debugLineNum = 786624;BA.debugLine="End Sub";
return "";
}
public String  _clearexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "clearexactbreakstate", null));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub ClearExactBreakState";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="scheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="End Sub";
return "";
}
public String  _clearfailedappupdatestate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearfailedappupdatestate", false))
	 {return ((String) Debug.delegate(ba, "clearfailedappupdatestate", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub ClearFailedAppUpdateState";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_VERSION_KEY)";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,__ref._app_update_failed_version_key /*String*/ );
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_REASON_KEY)";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,__ref._app_update_failed_reason_key /*String*/ );
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_AT_KEY)";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,__ref._app_update_failed_at_key /*String*/ );
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_RETRY_AFTER_KEY)";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,__ref._app_update_failed_retry_after_key /*String*/ );
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="storage.Remove(APP_UPDATE_FAILED_ATTEMPTS_KEY)";
__ref._storage /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,__ref._app_update_failed_attempts_key /*String*/ );
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorylogtimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearhistorylogtimer", false))
	 {return ((String) Debug.delegate(ba, "clearhistorylogtimer", null));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub ClearHistoryLogTimer";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="metaState.ClearHistoryStage";
__ref._metastate /*b4j.example.playbackmetastate*/ ._clearhistorystage /*String*/ (null);
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpendingplaystate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingplaystate", null));}
b4j.example.playbackplayerslot _pendingplayslot = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub ClearPendingPlayState";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = dire";
_pendingplayslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpendingplayslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlay";
if (_pendingplayslot.IsInitialized /*boolean*/ () && (_pendingplayslot._audiokey /*String*/ ).equals("") == false) { 
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearslotbyaudiokey /*String*/ (null,_pendingplayslot._audiokey /*String*/ );};
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="directorState.ClearRole(\"pending_play\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"pending_play");
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 }else {
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="runtimeState.ClearPendingPlayState";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpendingplaystate /*String*/ (null);
 };
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "clearplaybackstate", null));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub ClearPlaybackState";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="TraceLog(\"состояние воспроизведения clear\")";
__ref._tracelog /*String*/ (null,"состояние воспроизведения clear");
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="audioPrimary.Reset";
__ref._audioprimary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="audioSecondary.Reset";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="If directorState.IsInitialized Then directorState";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._reset /*String*/ (null);};
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="runtimeState.ActiveItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=17432586;
 //BA.debugLineNum = 17432586;BA.debugLine="runtimeState.PreparedItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=17432587;
 //BA.debugLineNum = 17432587;BA.debugLine="If directorState.IsInitialized Then directorState";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._configuredefaultslots /*String*/ (null);};
RDebugUtils.currentLine=17432588;
 //BA.debugLineNum = 17432588;BA.debugLine="SyncPlaybackDirectorState";
__ref._syncplaybackdirectorstate /*String*/ (null);
RDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="metaState.Reset";
__ref._metastate /*b4j.example.playbackmetastate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=17432590;
 //BA.debugLineNum = 17432590;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=17432591;
 //BA.debugLineNum = 17432591;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=17432592;
 //BA.debugLineNum = 17432592;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=17432593;
 //BA.debugLineNum = 17432593;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=17432594;
 //BA.debugLineNum = 17432594;BA.debugLine="initialStartFadePending = False";
__ref._initialstartfadepending /*boolean*/  = __c.False;
RDebugUtils.currentLine=17432595;
 //BA.debugLineNum = 17432595;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=17432596;
 //BA.debugLineNum = 17432596;BA.debugLine="stateStore.ClearDispatchRetryAfter";
__ref._statestore /*b4j.example.playerstatestore*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=17432597;
 //BA.debugLineNum = 17432597;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=17432598;
 //BA.debugLineNum = 17432598;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=17432599;
 //BA.debugLineNum = 17432599;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=17432600;
 //BA.debugLineNum = 17432600;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=17432601;
 //BA.debugLineNum = 17432601;BA.debugLine="uiController.SetStatusText(\"\")";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=17432602;
 //BA.debugLineNum = 17432602;BA.debugLine="End Sub";
return "";
}
public String  _syncplaybackdirectorstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "syncplaybackdirectorstate", false))
	 {return ((String) Debug.delegate(ba, "syncplaybackdirectorstate", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub SyncPlaybackDirectorState";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="directorState.ApplyLegacyRuntime(runtimeState)";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._applylegacyruntime /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ );
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="directorState.SetFlowState(playbackFlowState)";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setflowstate /*String*/ (null,__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedstate(b4j.example.b4xmainpage __ref,boolean _resetplayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpreparedstate", false))
	 {return ((String) Debug.delegate(ba, "clearpreparedstate", new Object[] {_resetplayer}));}
String _preparedaudiokey = "";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub ClearPreparedState(resetPlayer As Bool";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim preparedAudioKey As String = Transition_GetDi";
_preparedaudiokey = __ref._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="If preparedAudioKey <> \"\" And resetPlayer Then";
if ((_preparedaudiokey).equals("") == false && _resetplayer) { 
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_preparedaudiokey)._reset /*String*/ (null);
 };
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="If directorState.IsInitialized And preparedAudioK";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ () && (_preparedaudiokey).equals("") == false) { 
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearslotbyaudiokey /*String*/ (null,_preparedaudiokey);};
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="directorState.ClearRole(\"pending_prepare_music\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"pending_prepare_music");
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="directorState.ClearRole(\"pending_interrupt\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"pending_interrupt");
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="directorState.ClearRole(\"pending_prepare\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"pending_prepare");
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 }else {
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="runtimeState.PreparedItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="runtimeState.ClearPendingPrepareState";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpendingpreparestate /*String*/ (null);
 };
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearretrytimer", false))
	 {return ((String) Debug.delegate(ba, "clearretrytimer", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub ClearRetryTimer";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="stateStore.ClearLastRetryMode";
__ref._statestore /*b4j.example.playerstatestore*/ ._clearlastretrymode /*String*/ (null);
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="End Sub";
return "";
}
public String  _resetplaybackwatchdogstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetplaybackwatchdogstate", false))
	 {return ((String) Debug.delegate(ba, "resetplaybackwatchdogstate", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub ResetPlaybackWatchdogState";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="lastPlaybackWatchdogPositionMs = -1";
__ref._lastplaybackwatchdogpositionms /*long*/  = (long) (-1);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="lastPlaybackWatchdogTrackId = \"\"";
__ref._lastplaybackwatchdogtrackid /*String*/  = "";
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="lastPlaybackWatchdogProgressAt = 0";
__ref._lastplaybackwatchdogprogressat /*long*/  = (long) (0);
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="lastPlaybackWatchdogRecoveryAt = 0";
__ref._lastplaybackwatchdogrecoveryat /*long*/  = (long) (0);
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="playbackActivationToken = 0";
__ref._playbackactivationtoken /*long*/  = (long) (0);
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="End Sub";
return "";
}
public String  _transition_getdirectorpreparedaudiokey(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getdirectorpreparedaudiokey", false))
	 {return ((String) Debug.delegate(ba, "transition_getdirectorpreparedaudiokey", null));}
b4j.example.playbackplayerslot _preparedslot = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub Transition_GetDirectorPreparedAudioKey";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = directo";
_preparedslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="If preparedSlot.IsInitialized Then Return prepar";
if (_preparedslot.IsInitialized /*boolean*/ ()) { 
if (true) return _preparedslot._audiokey /*String*/ ;};
 };
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Return runtimeState.PreparedAudioKey";
if (true) return __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ ;
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="End Sub";
return "";
}
public String  _clientosnamevalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clientosnamevalue", false))
	 {return ((String) Debug.delegate(ba, "clientosnamevalue", null));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub ClientOsNameValue As String";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="Return ResolveClientOsName";
if (true) return __ref._resolveclientosname /*String*/ (null);
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="End Sub";
return "";
}
public String  _resolveclientosname(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveclientosname", false))
	 {return ((String) Debug.delegate(ba, "resolveclientosname", null));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Private Sub ResolveClientOsName As String";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Return \"windows\"";
if (true) return "windows";
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clonelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "clonelist", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub CloneList(source As List) As List";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _collectprotectedtrackids(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "collectprotectedtrackids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "collectprotectedtrackids", null));}
anywheresoftware.b4a.objects.collections.List _result = null;
anywheresoftware.b4a.objects.collections.Map _protectedids = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _trackid = "";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub CollectProtectedTrackIds As List";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Dim protectedIds As Map";
_protectedids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="protectedIds.Initialize";
_protectedids.Initialize();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._transition_getdirectorpendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,"primary"));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._transition_getdirectorpendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,"secondary"));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._transition_getdirectorpendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,"primary"));
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="AddProtectedTrackId(protectedIds, Transition_GetD";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._transition_getdirectorpendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,"secondary"));
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="If playQueue.IsInitialized Then";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_itemobject = group12.Get(index12);
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="AddProtectedTrackId(protectedIds, item)";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,_item);
 };
 }
};
 };
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="For Each trackId As String In protectedIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group19 = _protectedids.Keys();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_trackid = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectorprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getdirectorprepareditem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "transition_getdirectorprepareditem", null));}
b4j.example.playbackplayerslot _preparedslot = null;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub Transition_GetDirectorPreparedItem As M";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = directo";
_preparedslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="If preparedSlot.IsInitialized And preparedSlot.H";
if (_preparedslot.IsInitialized /*boolean*/ () && _preparedslot._hasitem /*boolean*/ (null)) { 
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_preparedslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Return CloneMap(runtimeState.PreparedItem)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectorpendingplayitem(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getdirectorpendingplayitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "transition_getdirectorpendingplayitem", new Object[] {_audiokey}));}
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
b4j.example.playbackplayerslot _pendingplayslot = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub Transition_GetDirectorPendingPlayItem(a";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = dire";
_pendingplayslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlay";
if (_pendingplayslot.IsInitialized /*boolean*/ () && (_pendingplayslot._role /*String*/ ).equals("pending_play") && _pendingplayslot._hasitem /*boolean*/ (null)) { 
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="If runtimeState.PendingPlayAudioKey = audioKey An";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ ).equals(_audiokey) && __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Return CloneMap(runtimeState.PendingPlayItem)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _transition_getdirectorpendingprepareitem(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getdirectorpendingprepareitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "transition_getdirectorpendingprepareitem", new Object[] {_audiokey}));}
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
b4j.example.playbackplayerslot _pendingprepareslot = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Transition_GetDirectorPendingPrepareIte";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = d";
_pendingprepareslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingP";
if (_pendingprepareslot.IsInitialized /*boolean*/ () && (_pendingprepareslot._state /*String*/ ).equals("loading") && _pendingprepareslot._hasitem /*boolean*/ (null)) { 
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ );};
 };
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="If runtimeState.PendingPrepareAudioKey = audioKey";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ ).equals(_audiokey) && __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Return CloneMap(runtimeState.PendingPrepareItem)";
if (true) return __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
 };
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _collectrelevanttrackids(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "collectrelevanttrackids", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "collectrelevanttrackids", null));}
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
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub CollectRelevantTrackIds As List";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If cachedRelevantTrackIds.IsInitialized And cache";
if (__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
if (true) return __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Dim descriptors As List = offlineStoreService.Get";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="If descriptors.IsInitialized = False Then Return";
if (_descriptors.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group8 = _descriptors;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_descriptorobject = group8.Get(index8);
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCach";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="If playlistData.IsInitialized = False Then Cont";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"t";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=3342352;
 //BA.debugLineNum = 3342352;BA.debugLine="If tracks.IsInitialized = False Then Continue";
if (_tracks.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group17 = _tracks;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_trackobject = group17.Get(index17);
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=3342356;
 //BA.debugLineNum = 3342356;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=3342357;
 //BA.debugLineNum = 3342357;BA.debugLine="If trackId <> \"\" Then relevantIds.Put(trackId";
if ((_trackid).equals("") == false) { 
_relevantids.Put((Object)(_trackid),(Object)(__c.True));};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group26 = _relevantids.Keys();
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_trackid = BA.ObjectToString(group26.Get(index26));
RDebugUtils.currentLine=3342363;
 //BA.debugLineNum = 3342363;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=3342365;
 //BA.debugLineNum = 3342365;BA.debugLine="cachedRelevantTrackIds = CloneList(result)";
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/  = __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,_result);
RDebugUtils.currentLine=3342366;
 //BA.debugLineNum = 3342366;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3342367;
 //BA.debugLineNum = 3342367;BA.debugLine="End Sub";
return null;
}
public String  _facade_completestartupsequencecore(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_completestartupsequencecore", false))
	 {return ((String) Debug.delegate(ba, "facade_completestartupsequencecore", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub Facade_CompleteStartupSequenceCore";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="If isStartupSequenceInProgress = False Then Retur";
if (__ref._isstartupsequenceinprogress /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="isStartupSequenceInProgress = False";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="stateStore.SetStartupSequenceInProgress(False)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setstartupsequenceinprogress /*String*/ (null,__c.False);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_START_DELA";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="TraceInfo(\"player\", \"старт завершен\", \"stage=\" &";
__ref._traceinfo /*String*/ (null,"player","старт завершен","stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="RunDeferredPostStartTasksAsync";
__ref._rundeferredpoststarttasksasync /*String*/ (null);
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="WriteHealthSnapshot(\"старт\")";
__ref._writehealthsnapshot /*String*/ (null,"старт");
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configureplayerheader", false))
	 {return ((String) Debug.delegate(ba, "configureplayerheader", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub ConfigurePlayerHeader";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="uiController.ConfigurePlayerHeader";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._configureplayerheader /*String*/ (null);
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(b4j.example.b4xmainpage __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configuresetupscreen", false))
	 {return ((String) Debug.delegate(ba, "configuresetupscreen", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub ConfigureSetupScreen(mode As String, t";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="uiController.ConfigureSetupScreen(mode, FormatPla";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._configuresetupscreen /*String*/ (null,_mode,__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ),_text,__ref._messagevalue /*String*/ (null,"setup_title"),__ref._messagevalue /*String*/ (null,"settings_thanks"),__ref._messagevalue /*String*/ (null,"setup_submit"),__ref._messagevalue /*String*/ (null,"logout"));
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public boolean  _confirmpendinghistoryitem(b4j.example.b4xmainpage __ref,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "confirmpendinghistoryitem", false))
	 {return ((Boolean) Debug.delegate(ba, "confirmpendinghistoryitem", new Object[] {_reason}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub ConfirmPendingHistoryItem(reason As St";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="If metaState.PendingHistoryItem.IsInitialized = F";
if (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="If metaState.PendingHistoryItem.GetDefault(\"id\",";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="TraceLog(\"история confirm reason=\" & reason & \" i";
__ref._tracelog /*String*/ (null,"история confirm reason="+_reason+" item="+__ref._describeitem /*String*/ (null,(Object)(__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="QueueHistoryRecordAt(metaState.PendingHistoryItem";
__ref._queuehistoryrecordat /*String*/ (null,__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ._historystartedatticks /*long*/ );
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="End Sub";
return false;
}
public String  _queuehistoryrecordat(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item,long _startedatvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "queuehistoryrecordat", false))
	 {return ((String) Debug.delegate(ba, "queuehistoryrecordat", new Object[] {_item,_startedatvalue}));}
long _startedat = 0L;
anywheresoftware.b4a.objects.collections.Map _record = null;
String _recorddate = "";
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub QueueHistoryRecordAt(item As Map, star";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Dim startedAt As Long = startedAtValue";
_startedat = _startedatvalue;
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="If startedAt <= 0 Then startedAt = DateTime.Now";
if (_startedat<=0) { 
_startedat = __c.DateTime.getNow();};
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="Dim record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="record.Initialize";
_record.Initialize();
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="Dim recordDate As String = FormatHistoryDate(star";
_recorddate = __ref._formathistorydate /*String*/ (null,_startedat);
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="record.Put(\"date\", recordDate)";
_record.Put((Object)("date"),(Object)(_recorddate));
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="record.Put(\"time\", FormatHistoryTime(startedAt))";
_record.Put((Object)("time"),(Object)(__ref._formathistorytime /*String*/ (null,_startedat)));
RDebugUtils.currentLine=16056330;
 //BA.debugLineNum = 16056330;BA.debugLine="record.Put(\"type\", item.GetDefault(\"type\", \"\"))";
_record.Put((Object)("type"),_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="record.Put(\"id\", item.GetDefault(\"id\", \"\"))";
_record.Put((Object)("id"),_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="AppendHistoryRecord(recordDate, record)";
__ref._appendhistoryrecord /*String*/ (null,_recorddate,_record);
RDebugUtils.currentLine=16056333;
 //BA.debugLineNum = 16056333;BA.debugLine="TraceLog(\"история буфер add date=\" & record.Get(\"";
__ref._tracelog /*String*/ (null,"история буфер add date="+BA.ObjectToString(_record.Get((Object)("date")))+" time="+BA.ObjectToString(_record.Get((Object)("time")))+" type="+BA.ObjectToString(_record.Get((Object)("type")))+" id="+BA.ObjectToString(_record.Get((Object)("id")))+" files="+BA.NumberToString(__ref._getpendinghistoryfilecount /*int*/ (null)));
RDebugUtils.currentLine=16056334;
 //BA.debugLineNum = 16056334;BA.debugLine="End Sub";
return "";
}
public int  _confirmreservedheight(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "confirmreservedheight", false))
	 {return ((Integer) Debug.delegate(ba, "confirmreservedheight", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub ConfirmReservedHeight As Int";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If confirmPane.Visible Then Return 84dip";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
if (true) return __c.DipToCurrent((int) (84));};
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return 0;
}
public String  _consumelastexception(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "consumelastexception", false))
	 {return ((String) Debug.delegate(ba, "consumelastexception", null));}
String _ignored = "";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub ConsumeLastException";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim ignored As String = LastException.Message";
_ignored = __c.LastException(ba).getMessage();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If ignored = \"__never__\" Then Return";
if ((_ignored).equals("__never__")) { 
if (true) return "";};
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public String  _consumepreparedqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "consumepreparedqueueitem", false))
	 {return ((String) Debug.delegate(ba, "consumepreparedqueueitem", null));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
int _i = 0;
Object _queuedobject = null;
anywheresoftware.b4a.objects.collections.Map _queueditem = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub ConsumePreparedQueueItem";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim preparedItem As Map = Transition_GetDirectorP";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="If playQueue.Size = 0 Or preparedItem.IsInitializ";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 || _prepareditem.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="Dim queuedObject As Object = playQueue.Get(i)";
_queuedobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i);
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="If queuedObject Is Map Then";
if (_queuedobject instanceof java.util.Map) { 
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="Dim queuedItem As Map = queuedObject";
_queueditem = new anywheresoftware.b4a.objects.collections.Map();
_queueditem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_queuedobject));
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="If ItemsMatch(queuedItem, preparedItem) Then";
if (__ref._itemsmatch /*boolean*/ (null,_queueditem,_prepareditem)) { 
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="If firstItem.IsInitialized = False Or secondItem.";
if (_firstitem.IsInitialized()==__c.False || _seconditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="If firstItem.GetDefault(\"type\", \"\") <> secondItem";
if ((_firstitem.GetDefault((Object)("type"),(Object)(""))).equals(_seconditem.GetDefault((Object)("type"),(Object)(""))) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="If firstItem.GetDefault(\"id\", \"\") <> \"\" And first";
if ((_firstitem.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false && (_firstitem.GetDefault((Object)("id"),(Object)(""))).equals(_seconditem.GetDefault((Object)("id"),(Object)("")))) { 
if (true) return __c.True;};
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="End Sub";
return false;
}
public int  _countallpendinghistoryrecords(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "countallpendinghistoryrecords", false))
	 {return ((Integer) Debug.delegate(ba, "countallpendinghistoryrecords", null));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _total = 0;
String _filename = "";
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub CountAllPendingHistoryRecords As Int";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),"")==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="Dim total As Int = 0";
_total = (int) (0);
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="If IsHistoryFileName(fileName) = False Then Cont";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="Try";
try {RDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="total = total + CountNdjsonRecords(File.ReadStr";
_total = (int) (_total+__ref._countndjsonrecords /*int*/ (null,__c.File.ReadString(__ref._gethistorydir /*String*/ (null),_filename)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="TraceWarn(\"history\", \"не удалось прочитать файл";
__ref._tracewarn /*String*/ (null,"history","не удалось прочитать файл истории","file="+_filename);
 };
 }
};
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="Return total";
if (true) return _total;
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="End Sub";
return 0;
}
public boolean  _ishistoryfilename(b4j.example.b4xmainpage __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ishistoryfilename", false))
	 {return ((Boolean) Debug.delegate(ba, "ishistoryfilename", new Object[] {_filename}));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Private Sub IsHistoryFileName(fileName As String)";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="If fileName.EndsWith(\".ndjson\") = False Then Retu";
if (_filename.endsWith(".ndjson")==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Return Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}\\.ndjson$";
if (true) return __c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}\\.ndjson$",_filename);
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="End Sub";
return false;
}
public int  _countndjsonrecords(b4j.example.b4xmainpage __ref,String _payload) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "countndjsonrecords", false))
	 {return ((Integer) Debug.delegate(ba, "countndjsonrecords", new Object[] {_payload}));}
String _normalized = "";
String[] _rows = null;
int _count = 0;
String _row = "";
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub CountNdjsonRecords(payload As String)";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Dim normalized As String = NormalizeNdjsonPayload";
_normalized = __ref._normalizendjsonpayload /*String*/ (null,_payload);
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If normalized = \"\" Then Return 0";
if ((_normalized).equals("")) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="Dim rows() As String = Regex.Split(CRLF, normaliz";
_rows = __c.Regex.Split(__c.CRLF,_normalized);
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="For Each row As String In rows";
{
final String[] group5 = _rows;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = group5[index5];
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="If row.Trim <> \"\" Then count = count + 1";
if ((_row.trim()).equals("") == false) { 
_count = (int) (_count+1);};
 }
};
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="End Sub";
return 0;
}
public String  _tracewarn(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub TraceWarn(category As String, message";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="traceRouter.TraceWarn(category, message, details)";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._tracewarn /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
return "";
}
public String  _normalizendjsonpayload(b4j.example.b4xmainpage __ref,String _payload) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizendjsonpayload", false))
	 {return ((String) Debug.delegate(ba, "normalizendjsonpayload", new Object[] {_payload}));}
String _linefeed = "";
String _normalized = "";
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub NormalizeNdjsonPayload(payload As Stri";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="If payload = Null Then Return \"\"";
if (_payload== null) { 
if (true) return "";};
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Dim lineFeed As String = Chr(10)";
_linefeed = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="Dim normalized As String = payload.Replace(CRLF,";
_normalized = _payload.replace(__c.CRLF,_linefeed).replace(BA.ObjectToString(__c.Chr((int) (13))),_linefeed);
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Do While normalized.Contains(lineFeed & lineFeed)";
while (_normalized.contains(_linefeed+_linefeed)) {
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="normalized = normalized.Replace(lineFeed & lineF";
_normalized = _normalized.replace(_linefeed+_linefeed,_linefeed);
 }
;
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="normalized = normalized.Trim";
_normalized = _normalized.trim();
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="If normalized = \"\" Then Return \"\"";
if ((_normalized).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="Return normalized.Replace(lineFeed, CRLF)";
if (true) return _normalized.replace(_linefeed,__c.CRLF);
RDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="End Sub";
return null;
}
public String  _createrandomdeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createrandomdeviceid", false))
	 {return ((String) Debug.delegate(ba, "createrandomdeviceid", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub CreateRandomDeviceId As String";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"randomUUID";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("randomUUID",(Object[])(__c.Null))));
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="Return uuid.RunMethod(\"toString\", Null)";
if (true) return BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="End Sub";
return "";
}
public int  _currentsecondofminute(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentsecondofminute", false))
	 {return ((Integer) Debug.delegate(ba, "currentsecondofminute", null));}
String _previoustimeformat = "";
int _value = 0;
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Private Sub CurrentSecondOfMinute As Int";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="DateTime.TimeFormat = \"ss\"";
__c.DateTime.setTimeFormat("ss");
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="Dim value As Int = DateTime.Time(EffectiveNowTick";
_value = (int)(Double.parseDouble(__c.DateTime.Time(__ref._effectivenowticks /*long*/ (null))));
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=24313862;
 //BA.debugLineNum = 24313862;BA.debugLine="End Sub";
return 0;
}
public long  _effectivenowticks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "effectivenowticks", false))
	 {return ((Long) Debug.delegate(ba, "effectivenowticks", null));}
long _devicenow = 0L;
long _trustednow = 0L;
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Private Sub EffectiveNowTicks As Long";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
_devicenow = __c.DateTime.getNow();
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="Dim trustedNow As Long = storage.GetDefault(trust";
_trustednow = BA.ObjectToLongNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._trustedsynctimekey /*String*/ ,(Object)(0)));
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="Return deviceNow";
if (true) return _devicenow;
RDebugUtils.currentLine=24838149;
 //BA.debugLineNum = 24838149;BA.debugLine="End Sub";
return 0L;
}
public double  _resolveitemvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveitemvolume", false))
	 {return ((Double) Debug.delegate(ba, "resolveitemvolume", new Object[] {_item}));}
String _itemtype = "";
double _gaindb = 0;
double _basefactor = 0;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub ResolveItemVolume(item As Map) As Doub";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="If item.IsInitialized = False Then Return 0.7";
if (_item.IsInitialized()==__c.False) { 
if (true) return 0.7;};
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim gainDb As Double = ResolveItemGainDb(item)";
_gaindb = __ref._resolveitemgaindb /*double*/ (null,_item);
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="Dim baseFactor As Double = 1";
_basefactor = 1;
RDebugUtils.currentLine=23003141;
 //BA.debugLineNum = 23003141;BA.debugLine="If itemType = \"track\" Then baseFactor = ResolvePl";
if ((_itemtype).equals("track")) { 
_basefactor = __ref._resolveplayerlevelfactor /*double*/ (null);};
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="Return Max(0, Min(1, baseFactor * DbToFactor(gain";
if (true) return __c.Max(0,__c.Min(1,_basefactor*__ref._dbtofactor /*double*/ (null,_gaindb)));
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="End Sub";
return 0;
}
public String  _data_applyclientrequestheaders(b4j.example.b4xmainpage __ref,b4j.example.httpjob _j) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_applyclientrequestheaders", false))
	 {return ((String) Debug.delegate(ba, "data_applyclientrequestheaders", new Object[] {_j}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub Data_ApplyClientRequestHeaders(j As Htt";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="ApplyClientRequestHeaders(j)";
__ref._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="End Sub";
return "";
}
public String  _data_applytemporarymode(b4j.example.b4xmainpage __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_applytemporarymode", false))
	 {return ((String) Debug.delegate(ba, "data_applytemporarymode", new Object[] {_mode}));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub Data_ApplyTemporaryMode(mode As String)";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="dataPolicyState.ApplyTemporaryMode(mode)";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="End Sub";
return "";
}
public String  _data_checkforappupdate(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_checkforappupdate", false))
	 {return ((String) Debug.delegate(ba, "data_checkforappupdate", new Object[] {_data}));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub Data_CheckForAppUpdate(data As Map)";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="CheckForAppUpdate(data)";
__ref._checkforappupdate /*String*/ (null,_data);
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="End Sub";
return "";
}
public String  _data_clearplaybackstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "data_clearplaybackstate", null));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub Data_ClearPlaybackState";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="End Sub";
return "";
}
public String  _data_clearpolicypause(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_clearpolicypause", false))
	 {return ((String) Debug.delegate(ba, "data_clearpolicypause", null));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub Data_ClearPolicyPause";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="End Sub";
return "";
}
public String  _data_clearpolicypauseandresumerequest(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_clearpolicypauseandresumerequest", false))
	 {return ((String) Debug.delegate(ba, "data_clearpolicypauseandresumerequest", null));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Public Sub Data_ClearPolicyPauseAndResumeRequest";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="End Sub";
return "";
}
public String  _data_consumelastexception(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_consumelastexception", false))
	 {return ((String) Debug.delegate(ba, "data_consumelastexception", null));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub Data_ConsumeLastException";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="ConsumeLastException";
__ref._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return "";
}
public String  _data_disablebackgroundrefreshtimers(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_disablebackgroundrefreshtimers", false))
	 {return ((String) Debug.delegate(ba, "data_disablebackgroundrefreshtimers", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub Data_DisableBackgroundRefreshTimers";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="historyFlushTimer.Enabled = False";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=26935299;
 //BA.debugLineNum = 26935299;BA.debugLine="localAdMinuteTimer.Enabled = False";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=26935301;
 //BA.debugLineNum = 26935301;BA.debugLine="End Sub";
return "";
}
public String  _data_ensureadcachesyncasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_ensureadcachesyncasync", false))
	 {return ((String) Debug.delegate(ba, "data_ensureadcachesyncasync", null));}
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub Data_EnsureAdCacheSyncAsync";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="EnsureAdCacheSyncAsync";
__ref._ensureadcachesyncasync /*void*/ (null);
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="End Sub";
return "";
}
public void  _ensureadcachesyncasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensureadcachesyncasync", false))
	 {Debug.delegate(ba, "ensureadcachesyncasync", null); return;}
ResumableSub_EnsureAdCacheSyncAsync rsub = new ResumableSub_EnsureAdCacheSyncAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_EnsureAdCacheSyncAsync extends BA.ResumableSub {
public ResumableSub_EnsureAdCacheSyncAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
boolean _downloaded = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If isStartupSequenceInProgress Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="isAdWarmupDeferredAfterStartup = True";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = __ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="If offlineData.IsInitialized = False Then Return";
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
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
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
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Wait For (mediaCacheService.EnsureAdsCached(offli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensureadcachesyncasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensureadscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_offlinedata));
this.state = 17;
return;
case 17:
//C
this.state = -1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="UpdateMediaConnectivityStateFromCacheSync(downloa";
__ref._updatemediaconnectivitystatefromcachesync /*String*/ (null,_downloaded);
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _data_enterlocalplayback(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_enterlocalplayback", false))
	 {return ((String) Debug.delegate(ba, "data_enterlocalplayback", null));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub Data_EnterLocalPlayback";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="dataPolicyState.EnterLocalPlayback";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="End Sub";
return "";
}
public String  _data_enterpolicypause(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_enterpolicypause", false))
	 {return ((String) Debug.delegate(ba, "data_enterpolicypause", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub Data_EnterPolicyPause(reason As String,";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="EnterPolicyPauseState(reason, connectionMode)";
__ref._enterpolicypausestate /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="End Sub";
return "";
}
public String  _enterpolicypausestate(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "enterpolicypausestate", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypausestate", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub EnterPolicyPauseState(reason As String";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="TraceLog(\"policy pause reason=\" & reason & \" mode";
__ref._tracelog /*String*/ (null,"policy pause reason="+_reason+" mode="+_connectionmode);
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="SetPlaybackFlowState(FLOW_PAUSED_POLICY, \"policy_";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_paused_policy /*String*/ ,"policy_pause");
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="dataPolicyState.EnterPolicyPause(connectionMode)";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._enterpolicypause /*String*/ (null,_connectionmode);
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="orchestrationState.EnterPolicyPausedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterpolicypausedstate /*String*/ (null);
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="ShowMessage(reason)";
__ref._showmessage /*String*/ (null,_reason);
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="End Sub";
return "";
}
public String  _data_enteruserstoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_enteruserstoppedstate", false))
	 {return ((String) Debug.delegate(ba, "data_enteruserstoppedstate", null));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub Data_EnterUserStoppedState";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return "";
}
public String  _data_flushtracebufferasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_flushtracebufferasync", false))
	 {return ((String) Debug.delegate(ba, "data_flushtracebufferasync", null));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub Data_FlushTraceBufferAsync";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="FlushTraceBufferAsync";
__ref._flushtracebufferasync /*String*/ (null);
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="End Sub";
return "";
}
public String  _flushtracebufferasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushtracebufferasync", false))
	 {return ((String) Debug.delegate(ba, "flushtracebufferasync", null));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub FlushTraceBufferAsync";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="traceUploader.FlushTraceBufferAsync";
__ref._traceuploader /*b4j.example.playbacktraceuploader*/ ._flushtracebufferasync /*void*/ (null);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public int  _data_getcurrentslotlocalreservecount(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_getcurrentslotlocalreservecount", false))
	 {return ((Integer) Debug.delegate(ba, "data_getcurrentslotlocalreservecount", null));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub Data_GetCurrentSlotLocalReserveCount As";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Return GetCurrentSlotLocalReserveCount";
if (true) return __ref._getcurrentslotlocalreservecount /*int*/ (null);
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="End Sub";
return 0;
}
public int  _getcurrentslotlocalreservecount(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getcurrentslotlocalreservecount", false))
	 {return ((Integer) Debug.delegate(ba, "getcurrentslotlocalreservecount", null));}
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub GetCurrentSlotLocalReserveCount As Int";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = __ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (_offlinedata.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((_offlinedata.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Return playerDataCoordinator.CountPlayableLocalTr";
if (true) return __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._countplayablelocaltracksincurrentslot /*int*/ (null,_offlinedata,__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="End Sub";
return 0;
}
public String  _data_handlemessageitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "data_handlemessageitem", new Object[] {_item}));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub Data_HandleMessageItem(item As Map)";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="HandleMessageItem(item)";
__ref._handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="End Sub";
return "";
}
public String  _handlemessageitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "handlemessageitem", new Object[] {_item}));}
String _action = "";
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub HandleMessageItem(item As Map)";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim action As String = item.GetDefault(\"action\",";
_action = BA.ObjectToString(_item.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="TraceLog(\"сообщение handle action=\" & action & \"";
__ref._tracelog /*String*/ (null,"сообщение handle action="+_action+" text="+BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(""))));
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="If action = \"claim\" Then";
if ((_action).equals("claim")) { 
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="ShowClaimPrompt(item.GetDefault(\"message\", Messa";
__ref._showclaimprompt /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"device_busy")))));
 }else 
{RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="Else If action = \"shutdown\" Then";
if ((_action).equals("shutdown")) { 
RDebugUtils.currentLine=13107210;
 //BA.debugLineNum = 13107210;BA.debugLine="HandleShutdownMessage(item.GetDefault(\"message\",";
__ref._handleshutdownmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"server_wait")))));
 }else 
{RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="Else If action = \"blocked\" Then";
if ((_action).equals("blocked")) { 
RDebugUtils.currentLine=13107212;
 //BA.debugLineNum = 13107212;BA.debugLine="HandleBlockedState";
__ref._handleblockedstate /*String*/ (null);
 }else 
{RDebugUtils.currentLine=13107213;
 //BA.debugLineNum = 13107213;BA.debugLine="Else If action = \"not_found\" Then";
if ((_action).equals("not_found")) { 
RDebugUtils.currentLine=13107214;
 //BA.debugLineNum = 13107214;BA.debugLine="StopForMissingData(item.GetDefault(\"message\", Me";
__ref._stopformissingdata /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"not_found")))));
 }else {
RDebugUtils.currentLine=13107216;
 //BA.debugLineNum = 13107216;BA.debugLine="HandleTemporaryState(\"server\", item.GetDefault(\"";
__ref._handletemporarystate /*String*/ (null,"server",BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"server_wait")))));
 }}}}
;
RDebugUtils.currentLine=13107218;
 //BA.debugLineNum = 13107218;BA.debugLine="End Sub";
return "";
}
public boolean  _data_haslocalplaybackfallback(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_haslocalplaybackfallback", false))
	 {return ((Boolean) Debug.delegate(ba, "data_haslocalplaybackfallback", null));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub Data_HasLocalPlaybackFallback As Boolea";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Return HasLocalPlaybackFallback";
if (true) return __ref._haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return false;
}
public String  _data_hidecontentblocks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "data_hidecontentblocks", null));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub Data_HideContentBlocks";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="End Sub";
return "";
}
public String  _data_hidepin(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_hidepin", false))
	 {return ((String) Debug.delegate(ba, "data_hidepin", null));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub Data_HidePin";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="End Sub";
return "";
}
public String  _data_invalidaterelevanttrackidscache(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_invalidaterelevanttrackidscache", false))
	 {return ((String) Debug.delegate(ba, "data_invalidaterelevanttrackidscache", null));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub Data_InvalidateRelevantTrackIdsCache";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="InvalidateRelevantTrackIdsCache";
__ref._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="End Sub";
return "";
}
public String  _invalidaterelevanttrackidscache(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "invalidaterelevanttrackidscache", false))
	 {return ((String) Debug.delegate(ba, "invalidaterelevanttrackidscache", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub InvalidateRelevantTrackIdsCache";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If cachedRelevantTrackIds.IsInitialized = False T";
if (__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="cachedRelevantTrackIds.Clear";
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
return "";
}
public String  _data_messagevalue(b4j.example.b4xmainpage __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_messagevalue", false))
	 {return ((String) Debug.delegate(ba, "data_messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub Data_MessageValue(key As String) As Str";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="Return MessageValue(key)";
if (true) return __ref._messagevalue /*String*/ (null,_key);
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="End Sub";
return "";
}
public String  _data_refreshconnectionindicatorstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_refreshconnectionindicatorstate", false))
	 {return ((String) Debug.delegate(ba, "data_refreshconnectionindicatorstate", null));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Public Sub Data_RefreshConnectionIndicatorState";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="End Sub";
return "";
}
public String  _refreshconnectionindicatorstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshconnectionindicatorstate", false))
	 {return ((String) Debug.delegate(ba, "refreshconnectionindicatorstate", null));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub RefreshConnectionIndicatorState";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="If dataPolicyState.HasLocalMediaFallback Then";
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._haslocalmediafallback /*boolean*/ ) { 
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="If stateStore.IsMediaPathDegraded Then";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._ismediapathdegraded /*boolean*/ (null)) { 
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="UpdateConnectionIndicator(\"degraded\")";
__ref._updateconnectionindicator /*String*/ (null,"degraded");
 }else {
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="UpdateConnectionIndicator(\"local\")";
__ref._updateconnectionindicator /*String*/ (null,"local");
 };
RDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy Then";
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ) { 
RDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="UpdateConnectionIndicator(\"server\")";
__ref._updateconnectionindicator /*String*/ (null,"server");
RDebugUtils.currentLine=22347787;
 //BA.debugLineNum = 22347787;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22347789;
 //BA.debugLineNum = 22347789;BA.debugLine="If stateStore.IsMediaPathDegraded Then";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._ismediapathdegraded /*boolean*/ (null)) { 
RDebugUtils.currentLine=22347790;
 //BA.debugLineNum = 22347790;BA.debugLine="UpdateConnectionIndicator(\"degraded\")";
__ref._updateconnectionindicator /*String*/ (null,"degraded");
RDebugUtils.currentLine=22347791;
 //BA.debugLineNum = 22347791;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22347793;
 //BA.debugLineNum = 22347793;BA.debugLine="UpdateConnectionIndicator(\"online\")";
__ref._updateconnectionindicator /*String*/ (null,"online");
RDebugUtils.currentLine=22347794;
 //BA.debugLineNum = 22347794;BA.debugLine="End Sub";
return "";
}
public String  _data_resolveidleuntilmessage(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data,long _targetticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_resolveidleuntilmessage", false))
	 {return ((String) Debug.delegate(ba, "data_resolveidleuntilmessage", new Object[] {_data,_targetticks}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub Data_ResolveIdleUntilMessage(data As Ma";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Return playerDataCoordinator.ResolveIdleUntilMess";
if (true) return __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._resolveidleuntilmessage /*String*/ (null,_data,_targetticks);
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
public String  _data_resumeplaybackafterpolicypauseasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_resumeplaybackafterpolicypauseasync", false))
	 {return ((String) Debug.delegate(ba, "data_resumeplaybackafterpolicypauseasync", null));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub Data_ResumePlaybackAfterPolicyPauseAsyn";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="ResumePlaybackAfterPolicyPause";
__ref._resumeplaybackafterpolicypause /*void*/ (null);
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return "";
}
public void  _resumeplaybackafterpolicypause(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resumeplaybackafterpolicypause", false))
	 {Debug.delegate(ba, "resumeplaybackafterpolicypause", null); return;}
ResumableSub_ResumePlaybackAfterPolicyPause rsub = new ResumableSub_ResumePlaybackAfterPolicyPause(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ResumePlaybackAfterPolicyPause extends BA.ResumableSub {
public ResumableSub_ResumePlaybackAfterPolicyPause(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Wait For (Facade_ResumePlaybackAfterPolicyPauseCo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "resumeplaybackafterpolicypause"), __ref._facade_resumeplaybackafterpolicypausecore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _data_saveserversnapshot(b4j.example.b4xmainpage __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "data_saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Public Sub Data_SaveServerSnapshot(method As Strin";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="SaveServerSnapshot(method, url, success, body, er";
__ref._saveserversnapshot /*String*/ (null,_method,_url,_success,_body,_errormessage);
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(b4j.example.b4xmainpage __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub SaveServerSnapshot(method As String, u";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="appTraceService.SaveServerSnapshot(method, url, s";
__ref._apptraceservice /*b4j.example.traceservice*/ ._saveserversnapshot /*String*/ (null,_method,_url,_success,_body,_errormessage);
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return "";
}
public String  _data_scheduleretry(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "data_scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub Data_ScheduleRetry(mode As String, dela";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="ScheduleRetry(mode, delayMs)";
__ref._scheduleretry /*String*/ (null,_mode,_delayms);
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub ScheduleRetry(mode As String, delayMs";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If LOCAL_PLAYBACK_ONLY And mode <> \"audio_device\"";
if (__ref._local_playback_only /*boolean*/  && (_mode).equals("audio_device") == false) { 
if (true) return "";};
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="playerDataCoordinator.ScheduleRetry(mode, delayMs";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._scheduleretry /*String*/ (null,_mode,_delayms,__ref._local_retry_delay_max /*int*/ ,__ref._server_retry_delay_max /*int*/ ,__ref._blocked_retry_delay /*int*/ );
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="End Sub";
return "";
}
public String  _data_secondsagotext(b4j.example.b4xmainpage __ref,long _ticksvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_secondsagotext", false))
	 {return ((String) Debug.delegate(ba, "data_secondsagotext", new Object[] {_ticksvalue}));}
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub Data_SecondsAgoText(ticksValue As Long)";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Return SecondsAgoText(ticksValue)";
if (true) return __ref._secondsagotext /*String*/ (null,_ticksvalue);
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="End Sub";
return "";
}
public String  _secondsagotext(b4j.example.b4xmainpage __ref,long _ticksvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "secondsagotext", false))
	 {return ((String) Debug.delegate(ba, "secondsagotext", new Object[] {_ticksvalue}));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Private Sub SecondsAgoText(ticksValue As Long) As";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="If ticksValue <= 0 Then Return \"unknown\"";
if (_ticksvalue<=0) { 
if (true) return "unknown";};
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Return \"\" & Max(0, Floor((DateTime.Now - ticksVal";
if (true) return ""+BA.NumberToString(__c.Max(0,__c.Floor((__c.DateTime.getNow()-_ticksvalue)/(double)1000)));
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="End Sub";
return "";
}
public String  _data_setmediapathdegraded(b4j.example.b4xmainpage __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_setmediapathdegraded", false))
	 {return ((String) Debug.delegate(ba, "data_setmediapathdegraded", new Object[] {_value}));}
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub Data_SetMediaPathDegraded(value As Bool";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="stateStore.SetMediaPathDegraded(value)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setmediapathdegraded /*String*/ (null,_value);
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="End Sub";
return "";
}
public String  _data_setplaybackflowstate(b4j.example.b4xmainpage __ref,String _statevalue,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "data_setplaybackflowstate", new Object[] {_statevalue,_reason}));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Public Sub Data_SetPlaybackFlowState(stateValue As";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="SetPlaybackFlowState(stateValue, reason)";
__ref._setplaybackflowstate /*String*/ (null,_statevalue,_reason);
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="End Sub";
return "";
}
public String  _data_setplayicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_setplayicon", false))
	 {return ((String) Debug.delegate(ba, "data_setplayicon", null));}
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Public Sub Data_SetPlayIcon";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Private Sub SetPlayIcon";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="uiController.SetPlayIcon";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._setplayicon /*String*/ (null);
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="If uiController.IsOrbitIdle Then";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ ._isorbitidle /*boolean*/ (null)) { 
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="orbitTimer.Enabled = False";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="End Sub";
return "";
}
public String  _data_setstopicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_setstopicon", false))
	 {return ((String) Debug.delegate(ba, "data_setstopicon", null));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub Data_SetStopIcon";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="End Sub";
return "";
}
public String  _data_showmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_showmessage", false))
	 {return ((String) Debug.delegate(ba, "data_showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub Data_ShowMessage(text As String)";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _data_syncofflineplaylistmetadata(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_syncofflineplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "data_syncofflineplaylistmetadata", null));}
ResumableSub_Data_SyncOfflinePlaylistMetadata rsub = new ResumableSub_Data_SyncOfflinePlaylistMetadata(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Data_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_Data_SyncOfflinePlaylistMetadata(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _synced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Wait For (SyncOfflinePlaylistMetadata) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "data_syncofflineplaylistmetadata"), __ref._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_synced = (boolean) result[1];
;
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="Return synced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_synced));return;};
RDebugUtils.currentLine=27852803;
 //BA.debugLineNum = 27852803;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _syncofflineplaylistmetadata(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "syncofflineplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "syncofflineplaylistmetadata", null));}
ResumableSub_SyncOfflinePlaylistMetadata rsub = new ResumableSub_SyncOfflinePlaylistMetadata(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SyncOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_SyncOfflinePlaylistMetadata(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
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
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Dim playlistDescriptors As List = offlineStoreSer";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="If playlistDescriptors.IsInitialized = False Or p";
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
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="TraceLog(\"метаданные плейлистов sync skip reason";
__ref._tracelog /*String*/ (null,"метаданные плейлистов sync skip reason=nothing_to_sync");
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="EnsureDirectory(offlineStoreService.GetOfflinePla";
__ref._ensuredirectory /*String*/ (null,__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="Dim cachedPlaylistIndex As Map = offlineStoreServ";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getcachedplaylistindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=24379400;
 //BA.debugLineNum = 24379400;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="Dim updatedCount As Int = 0";
_updatedcount = (int) (0);
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=24379403;
 //BA.debugLineNum = 24379403;BA.debugLine="For Each descriptorObject As Object In playlistDe";
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
RDebugUtils.currentLine=24379404;
 //BA.debugLineNum = 24379404;BA.debugLine="If descriptorObject Is Map Then";
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
RDebugUtils.currentLine=24379405;
 //BA.debugLineNum = 24379405;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=24379406;
 //BA.debugLineNum = 24379406;BA.debugLine="Dim syncAction As String = offlineStoreService.";
_syncaction = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._resolveplaylistsyncaction /*String*/ (null,_descriptor,_cachedplaylistindex);
RDebugUtils.currentLine=24379407;
 //BA.debugLineNum = 24379407;BA.debugLine="If syncAction = \"skip\" Then Continue";
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
RDebugUtils.currentLine=24379408;
 //BA.debugLineNum = 24379408;BA.debugLine="Wait For (DownloadOfflinePlaylistMetadata(descr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "syncofflineplaylistmetadata"), __ref._downloadofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descriptor,_cachedplaylistindex));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=24379409;
 //BA.debugLineNum = 24379409;BA.debugLine="If downloaded Then";
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
RDebugUtils.currentLine=24379410;
 //BA.debugLineNum = 24379410;BA.debugLine="If syncAction = \"missing\" Then";
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
RDebugUtils.currentLine=24379411;
 //BA.debugLineNum = 24379411;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=24379413;
 //BA.debugLineNum = 24379413;BA.debugLine="updatedCount = updatedCount + 1";
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
RDebugUtils.currentLine=24379416;
 //BA.debugLineNum = 24379416;BA.debugLine="failedCount = failedCount + 1";
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
RDebugUtils.currentLine=24379420;
 //BA.debugLineNum = 24379420;BA.debugLine="offlineStoreService.SaveCachedPlaylistIndex(cache";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._savecachedplaylistindex /*String*/ (null,_cachedplaylistindex);
RDebugUtils.currentLine=24379421;
 //BA.debugLineNum = 24379421;BA.debugLine="offlineStoreService.RefreshPlaylistCacheStatus(pl";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._refreshplaylistcachestatus /*String*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=24379422;
 //BA.debugLineNum = 24379422;BA.debugLine="InvalidateRelevantTrackIdsCache";
__ref._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=24379423;
 //BA.debugLineNum = 24379423;BA.debugLine="Dim actualCount As Int = storage.GetDefault(\"play";
_actualcount = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_actual_count",(Object)(0))));
RDebugUtils.currentLine=24379424;
 //BA.debugLineNum = 24379424;BA.debugLine="TraceLog(\"метаданные плейлистов sync итог downloa";
__ref._tracelog /*String*/ (null,"метаданные плейлистов sync итог downloaded="+BA.NumberToString(_downloadedcount)+" updated="+BA.NumberToString(_updatedcount)+" failed="+BA.NumberToString(_failedcount)+" actual="+BA.NumberToString(_actualcount));
RDebugUtils.currentLine=24379425;
 //BA.debugLineNum = 24379425;BA.debugLine="Return failedCount = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_failedcount==0));return;};
RDebugUtils.currentLine=24379426;
 //BA.debugLineNum = 24379426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _data_traceinfo(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_traceinfo", false))
	 {return ((String) Debug.delegate(ba, "data_traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub Data_TraceInfo(category As String, mess";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="TraceInfo(category, message, details)";
__ref._traceinfo /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="End Sub";
return "";
}
public String  _data_tracelog(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_tracelog", false))
	 {return ((String) Debug.delegate(ba, "data_tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub Data_TraceLog(message As String)";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="TraceLog(message)";
__ref._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="End Sub";
return "";
}
public String  _data_tracewarn(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_tracewarn", false))
	 {return ((String) Debug.delegate(ba, "data_tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub Data_TraceWarn(category As String, mess";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="TraceWarn(category, message, details)";
__ref._tracewarn /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="End Sub";
return "";
}
public String  _data_writehealthsnapshot(b4j.example.b4xmainpage __ref,String _trigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "data_writehealthsnapshot", false))
	 {return ((String) Debug.delegate(ba, "data_writehealthsnapshot", new Object[] {_trigger}));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Public Sub Data_WriteHealthSnapshot(trigger As Str";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="WriteHealthSnapshot(trigger)";
__ref._writehealthsnapshot /*String*/ (null,_trigger);
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="End Sub";
return "";
}
public String  _dataurlvalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dataurlvalue", false))
	 {return ((String) Debug.delegate(ba, "dataurlvalue", null));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub DataUrlValue As String";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="Return DATA_BASE_URL";
if (true) return __ref._data_base_url /*String*/ ;
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="End Sub";
return "";
}
public double  _dbtofactor(b4j.example.b4xmainpage __ref,double _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbtofactor", false))
	 {return ((Double) Debug.delegate(ba, "dbtofactor", new Object[] {_db}));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Private Sub DbToFactor(db As Double) As Double";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="If db >= 0 Then Return 1";
if (_db>=0) { 
if (true) return 1;};
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Return Power(10, db / 20)";
if (true) return __c.Power(10,_db/(double)20);
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="End Sub";
return 0;
}
public String  _deferfutureexactbreak(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "deferfutureexactbreak", false))
	 {return ((String) Debug.delegate(ba, "deferfutureexactbreak", new Object[] {_item}));}
int _insertindex = 0;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub DeferFutureExactBreak(item As Map)";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim insertIndex As Int = Min(1, playQueue.Size)";
_insertindex = (int) (__c.Min(1,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="playQueue.InsertAt(insertIndex, item)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_insertindex,(Object)(_item.getObject()));
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="TraceLog(\"брейк exact defer at=\" & ToLongDefault(";
__ref._tracelog /*String*/ (null,"брейк exact defer at="+BA.NumberToString(__ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1)))+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="End Sub";
return "";
}
public String  _syncexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "syncexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "syncexactbreakstate", null));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub SyncExactBreakState";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="ResolveScheduledBreakAt";
__ref._resolvescheduledbreakat /*String*/ (null);
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="ScheduleBreakWatch";
__ref._schedulebreakwatch /*String*/ (null);
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="End Sub";
return "";
}
public String  _deletehistorypendingfile(b4j.example.b4xmainpage __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "deletehistorypendingfile", false))
	 {return ((String) Debug.delegate(ba, "deletehistorypendingfile", new Object[] {_filename}));}
int _currentcount = 0;
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Private Sub DeleteHistoryPendingFile(fileName As S";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="If File.Exists(GetHistoryDir, fileName) Then";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),_filename)) { 
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="File.Delete(GetHistoryDir, fileName)";
__c.File.Delete(__ref._gethistorydir /*String*/ (null),_filename);
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="Dim currentCount As Int = Max(0, storage.GetDefa";
_currentcount = (int) (__c.Max(0,(double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"pending_history_count",(Object)(0))))-1));
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="storage.Put(\"pending_history_count\", currentCoun";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"pending_history_count",(Object)(_currentcount));
 };
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=24969224;
 //BA.debugLineNum = 24969224;BA.debugLine="End Sub";
return "";
}
public String  _deviceidvalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "deviceidvalue", false))
	 {return ((String) Debug.delegate(ba, "deviceidvalue", null));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub DeviceIdValue As String";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="Return deviceId";
if (true) return __ref._deviceid /*String*/ ;
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _dispatchplaybackadvance(b4j.example.b4xmainpage __ref,String _initiator,boolean _allowload) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dispatchplaybackadvance", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "dispatchplaybackadvance", new Object[] {_initiator,_allowload}));}
ResumableSub_DispatchPlaybackAdvance rsub = new ResumableSub_DispatchPlaybackAdvance(this,__ref,_initiator,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DispatchPlaybackAdvance extends BA.ResumableSub {
public ResumableSub_DispatchPlaybackAdvance(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _initiator,boolean _allowload) {
this.parent = parent;
this.__ref = __ref;
this._initiator = _initiator;
this._allowload = _allowload;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _initiator;
boolean _allowload;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Wait For (Facade_DispatchPlaybackAdvanceCore(init";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "dispatchplaybackadvance"), __ref._facade_dispatchplaybackadvancecore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_initiator,_allowload));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_dispatchplaybackadvancecore(b4j.example.b4xmainpage __ref,String _initiator,boolean _allowload) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_dispatchplaybackadvancecore", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "facade_dispatchplaybackadvancecore", new Object[] {_initiator,_allowload}));}
ResumableSub_Facade_DispatchPlaybackAdvanceCore rsub = new ResumableSub_Facade_DispatchPlaybackAdvanceCore(this,__ref,_initiator,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_DispatchPlaybackAdvanceCore extends BA.ResumableSub {
public ResumableSub_Facade_DispatchPlaybackAdvanceCore(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _initiator,boolean _allowload) {
this.parent = parent;
this.__ref = __ref;
this._initiator = _initiator;
this._allowload = _allowload;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
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
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="If TryEnterPlaybackDispatch(initiator) = False Th";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._tryenterplaybackdispatch /*boolean*/ (null,_initiator)==parent.__c.False) { 
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
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="TraceInfo(\"playback\", \"dispatch переход\", \"initia";
__ref._traceinfo /*String*/ (null,"playback","dispatch переход","initiator="+_initiator+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" prepared="+__ref._haspreparedslotfortrace /*String*/ (null));
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="Do While playbackFlowState <> FLOW_STOPPING";
if (true) break;

case 7:
//do while
this.state = 64;
while ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ ) == false) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="Dim dispatchDecision As Map = ResolveDispatchDec";
_dispatchdecision = new anywheresoftware.b4a.objects.collections.Map();
_dispatchdecision = __ref._resolvedispatchdecision /*anywheresoftware.b4a.objects.collections.Map*/ (null,_allowload);
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="Dim actionName As String = dispatchDecision.GetD";
_actionname = BA.ObjectToString(_dispatchdecision.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="directorState.BeginDecision(\"dispatch:\" & action";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._begindecision /*String*/ (null,"dispatch:"+_actionname);
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="Select actionName";
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
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="TraceInfo(\"playback\", \"dispatch prepared\", \"in";
__ref._traceinfo /*String*/ (null,"playback","dispatch prepared","initiator="+_initiator);
RDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="Return ExitPlaybackDispatch(PromotePreparedPla";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,__ref._promotepreparedplayer /*boolean*/ (null,(int) (0),(int) (0)))));return;};
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=12451853;
 //BA.debugLineNum = 12451853;BA.debugLine="Dim directItem As Map = offlinePlaybackCore.Re";
_directitem = new anywheresoftware.b4a.objects.collections.Map();
_directitem = __ref._offlineplaybackcore /*b4j.example.offlineplaybackengine*/ ._resolvenextmusicitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ );
RDebugUtils.currentLine=12451854;
 //BA.debugLineNum = 12451854;BA.debugLine="If directItem.IsInitialized = False Or directI";
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
RDebugUtils.currentLine=12451855;
 //BA.debugLineNum = 12451855;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="If allowLoad Then";
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
RDebugUtils.currentLine=12451857;
 //BA.debugLineNum = 12451857;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (q";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_dispatchplaybackadvancecore"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 65;
return;
case 65:
//C
this.state = 21;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=12451858;
 //BA.debugLineNum = 12451858;BA.debugLine="If queuePrepared = False Then Return ExitPla";
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
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="Continue";
this.state = 63;
if (true) break;;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=12451861;
 //BA.debugLineNum = 12451861;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=12451863;
 //BA.debugLineNum = 12451863;BA.debugLine="TraceInfo(\"playback\", \"dispatch next\", \"mode=d";
__ref._traceinfo /*String*/ (null,"playback","dispatch next","mode=direct_local type="+BA.ObjectToString(_directitem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_directitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=12451864;
 //BA.debugLineNum = 12451864;BA.debugLine="Dim directRetryAfter As Int = stateStore.Consu";
_directretryafter = __ref._statestore /*b4j.example.playerstatestore*/ ._consumedispatchretryafter /*int*/ (null);
RDebugUtils.currentLine=12451865;
 //BA.debugLineNum = 12451865;BA.debugLine="Wait For (PlayQueueItem(directItem, directRetr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_dispatchplaybackadvancecore"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_directitem.getObject()),_directretryafter));
this.state = 66;
return;
case 66:
//C
this.state = 29;
_continuedirect = (boolean) result[1];
;
RDebugUtils.currentLine=12451866;
 //BA.debugLineNum = 12451866;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=12451867;
 //BA.debugLineNum = 12451867;BA.debugLine="If continueDirect = False Then Return ExitPlay";
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
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.True)));return;};
if (true) break;

case 34:
//C
this.state = 63;
;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=12451869;
 //BA.debugLineNum = 12451869;BA.debugLine="Dim nextObject As Object = ShiftDispatchableQu";
_nextobject = __ref._shiftdispatchablequeueitem /*Object*/ (null);
RDebugUtils.currentLine=12451870;
 //BA.debugLineNum = 12451870;BA.debugLine="If nextObject Is Map Then";
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
RDebugUtils.currentLine=12451871;
 //BA.debugLineNum = 12451871;BA.debugLine="Dim nextItem As Map = nextObject";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=12451872;
 //BA.debugLineNum = 12451872;BA.debugLine="If nextItem.GetDefault(\"type\", \"\") = \"break\"";
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
RDebugUtils.currentLine=12451873;
 //BA.debugLineNum = 12451873;BA.debugLine="TraceInfo(\"playback\", \"dispatch break\", \"que";
__ref._traceinfo /*String*/ (null,"playback","dispatch break","queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" exact="+BA.ObjectToString(_nextitem.GetDefault((Object)("exactly"),(Object)(parent.__c.False))));
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=12451875;
 //BA.debugLineNum = 12451875;BA.debugLine="TraceInfo(\"playback\", \"dispatch next\", \"type";
__ref._traceinfo /*String*/ (null,"playback","dispatch next","type="+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_nextitem.GetDefault((Object)("id"),(Object)(""))));
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
RDebugUtils.currentLine=12451878;
 //BA.debugLineNum = 12451878;BA.debugLine="Dim retryAfter As Int = stateStore.ConsumeDisp";
_retryafter = __ref._statestore /*b4j.example.playerstatestore*/ ._consumedispatchretryafter /*int*/ (null);
RDebugUtils.currentLine=12451879;
 //BA.debugLineNum = 12451879;BA.debugLine="Wait For (PlayQueueItem(nextObject, retryAfter";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_dispatchplaybackadvancecore"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_nextobject,_retryafter));
this.state = 67;
return;
case 67:
//C
this.state = 47;
_continuequeue = (boolean) result[1];
;
RDebugUtils.currentLine=12451880;
 //BA.debugLineNum = 12451880;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=12451881;
 //BA.debugLineNum = 12451881;BA.debugLine="If continueQueue = False Then Return ExitPlayb";
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
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.True)));return;};
if (true) break;

case 52:
//C
this.state = 63;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=12451883;
 //BA.debugLineNum = 12451883;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (que";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_dispatchplaybackadvancecore"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 68;
return;
case 68:
//C
this.state = 55;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=12451884;
 //BA.debugLineNum = 12451884;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=12451885;
 //BA.debugLineNum = 12451885;BA.debugLine="If queuePrepared = False Then Return ExitPlayb";
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
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
if (true) break;

case 60:
//C
this.state = 63;
;
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=12451887;
 //BA.debugLineNum = 12451887;BA.debugLine="directorState.ClearDecision";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
RDebugUtils.currentLine=12451888;
 //BA.debugLineNum = 12451888;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
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
RDebugUtils.currentLine=12451891;
 //BA.debugLineNum = 12451891;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
RDebugUtils.currentLine=12451892;
 //BA.debugLineNum = 12451892;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _trydownloadappupdateonce(b4j.example.b4xmainpage __ref,int _targetversion,int _attempt) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "trydownloadappupdateonce", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "trydownloadappupdateonce", new Object[] {_targetversion,_attempt}));}
ResumableSub_TryDownloadAppUpdateOnce rsub = new ResumableSub_TryDownloadAppUpdateOnce(this,__ref,_targetversion,_attempt);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TryDownloadAppUpdateOnce extends BA.ResumableSub {
public ResumableSub_TryDownloadAppUpdateOnce(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,int _targetversion,int _attempt) {
this.parent = parent;
this.__ref = __ref;
this._targetversion = _targetversion;
this._attempt = _attempt;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _targetversion;
int _attempt;
anywheresoftware.b4a.objects.collections.Map _result = null;
b4j.example.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="result.Put(\"success\", False)";
_result.Put((Object)("success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="result.Put(\"reason\", \"\")";
_result.Put((Object)("reason"),(Object)(""));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="j.Download(APP_UPDATE_URL)";
_j._download /*String*/ (null,__ref._app_update_url /*String*/ );
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="ApplyClientRequestHeaders(j)";
__ref._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="j.GetRequest.Timeout = 15000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "trydownloadappupdateonce"), (Object)(_j));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Try";
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
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="If j.Success = False Then";
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
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="result.Put(\"reason\", \"http_error:\" & j.ErrorMes";
_result.Put((Object)("reason"),(Object)("http_error:"+_j._errormessage /*String*/ ));
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="TraceWarn(\"update\", \"загрузка обновления ошибка";
__ref._tracewarn /*String*/ (null,"update","загрузка обновления ошибка","target="+BA.NumberToString(_targetversion)+" attempt="+BA.NumberToString(_attempt)+" message="+_j._errormessage /*String*/ );
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;
;
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="If SaveDownloadedUpdateToFile(j) = False Then";

case 7:
//if
this.state = 10;
if (__ref._savedownloadedupdatetofile /*boolean*/ (null,_j)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="result.Put(\"reason\", \"invalid_file\")";
_result.Put((Object)("reason"),(Object)("invalid_file"));
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="result.Put(\"success\", True)";
_result.Put((Object)("success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="result.Put(\"reason\", \"\")";
_result.Put((Object)("reason"),(Object)(""));
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="TraceError(\"update\", \"ошибка загрузки обновления";
__ref._traceerror /*String*/ (null,"update","ошибка загрузки обновления","target="+BA.NumberToString(_targetversion)+" attempt="+BA.NumberToString(_attempt)+" error="+parent.__c.LastException(ba).getMessage());
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="result.Put(\"reason\", \"exception:\" & LastExceptio";
_result.Put((Object)("reason"),(Object)("exception:"+parent.__c.LastException(ba).getMessage()));
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;
if (true) break;

case 13:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="End Sub";
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
public String  _rememberfailedappupdateversion(b4j.example.b4xmainpage __ref,int _targetversion,String _reason,int _attempts) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "rememberfailedappupdateversion", false))
	 {return ((String) Debug.delegate(ba, "rememberfailedappupdateversion", new Object[] {_targetversion,_reason,_attempts}));}
long _retryafter = 0L;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub RememberFailedAppUpdateVersion(targetV";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim retryAfter As Long = DateTime.Now + APP_UPDAT";
_retryafter = (long) (__c.DateTime.getNow()+__ref._app_update_retry_delay_ms /*long*/ );
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="storage.Put(APP_UPDATE_FAILED_VERSION_KEY, target";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._app_update_failed_version_key /*String*/ ,(Object)(_targetversion));
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="storage.Put(APP_UPDATE_FAILED_REASON_KEY, reason)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._app_update_failed_reason_key /*String*/ ,(Object)(_reason));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="storage.Put(APP_UPDATE_FAILED_AT_KEY, DateTime.No";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._app_update_failed_at_key /*String*/ ,(Object)(__c.DateTime.getNow()));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="storage.Put(APP_UPDATE_FAILED_RETRY_AFTER_KEY, re";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._app_update_failed_retry_after_key /*String*/ ,(Object)(_retryafter));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="storage.Put(APP_UPDATE_FAILED_ATTEMPTS_KEY, attem";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._app_update_failed_attempts_key /*String*/ ,(Object)(_attempts));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="TraceWarn(\"update\", \"обновление отложено\", \"targe";
__ref._tracewarn /*String*/ (null,"update","обновление отложено","target="+BA.NumberToString(_targetversion)+" reason="+_reason+" retryAfter="+BA.NumberToString(_retryafter));
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadofflineplaylistmetadata(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "downloadofflineplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "downloadofflineplaylistmetadata", new Object[] {_descriptor,_cachedplaylistindex}));}
ResumableSub_DownloadOfflinePlaylistMetadata rsub = new ResumableSub_DownloadOfflinePlaylistMetadata(this,__ref,_descriptor,_cachedplaylistindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadOfflinePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_DownloadOfflinePlaylistMetadata(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _descriptor,anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex) {
this.parent = parent;
this.__ref = __ref;
this._descriptor = _descriptor;
this._cachedplaylistindex = _cachedplaylistindex;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _descriptor;
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex;
String _playlistid = "";
String _playlisturl = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="If playlistId = \"\" Then Return False";
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
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="Dim playlistUrl As String = offlineStoreService.P";
_playlisturl = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._playlistmetadataurl /*String*/ (null,_playlistid);
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="TraceLog(\"метаданные плейлиста fetch начало id=\"";
__ref._tracelog /*String*/ (null,"метаданные плейлиста fetch начало id="+_playlistid+" url="+_playlisturl);
RDebugUtils.currentLine=24444933;
 //BA.debugLineNum = 24444933;BA.debugLine="Wait For (FetchJsonWithTimeout(playlistUrl, FETCH";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "downloadofflineplaylistmetadata"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playlisturl,__ref._fetch_timeout_ms /*int*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=24444934;
 //BA.debugLineNum = 24444934;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="TraceLog(\"метаданные плейлиста fetch ошибка id=\"";
__ref._tracelog /*String*/ (null,"метаданные плейлиста fetch ошибка id="+_playlistid+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=24444936;
 //BA.debugLineNum = 24444936;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=24444938;
 //BA.debugLineNum = 24444938;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=24444939;
 //BA.debugLineNum = 24444939;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=24444941;
 //BA.debugLineNum = 24444941;BA.debugLine="TraceLog(\"метаданные плейлиста fetch ошибка id=\"";
__ref._tracelog /*String*/ (null,"метаданные плейлиста fetch ошибка id="+_playlistid+" reason=not_map");
RDebugUtils.currentLine=24444942;
 //BA.debugLineNum = 24444942;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=24444944;
 //BA.debugLineNum = 24444944;BA.debugLine="Dim playlistData As Map = resultData";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=24444945;
 //BA.debugLineNum = 24444945;BA.debugLine="offlineStoreService.SavePlaylistMetadata(descript";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._saveplaylistmetadata /*String*/ (null,_descriptor,_playlistdata,_cachedplaylistindex);
RDebugUtils.currentLine=24444946;
 //BA.debugLineNum = 24444946;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=24444947;
 //BA.debugLineNum = 24444947;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchjsonwithtimeout(b4j.example.b4xmainpage __ref,String _url,int _timeoutms) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "fetchjsonwithtimeout", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fetchjsonwithtimeout", new Object[] {_url,_timeoutms}));}
ResumableSub_FetchJsonWithTimeout rsub = new ResumableSub_FetchJsonWithTimeout(this,__ref,_url,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchJsonWithTimeout extends BA.ResumableSub {
public ResumableSub_FetchJsonWithTimeout(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _url,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _url;
int _timeoutms;
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Wait For (syncService.FetchJsonWithTimeout(url, t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchjsonwithtimeout"), __ref._syncservice /*b4j.example.networksyncservice*/ ._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_url,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public long  _effectivetrackremainms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "effectivetrackremainms", false))
	 {return ((Long) Debug.delegate(ba, "effectivetrackremainms", null));}
long _trackremain = 0L;
String _activeaudiokey = "";
b4j.example.audioplayer _activeaudio = null;
long _breakremain = 0L;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub EffectiveTrackRemainMs As Long";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim trackRemain As Long = 0";
_trackremain = (long) (0);
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = __ref._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="If activeAudioKey <> \"\" Then";
if ((_activeaudiokey).equals("") == false) { 
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Dim activeAudio As AudioPlayer = GetAudioByKey(a";
_activeaudio = __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeaudiokey);
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="If activeAudio.Duration > 0 Then trackRemain = a";
if (_activeaudio._duration /*long*/ (null)>0) { 
_trackremain = (long) (_activeaudio._duration /*long*/ (null)-_activeaudio._position /*long*/ (null));};
 };
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="If scheduledBreakAt <= 0 Then Return trackRemain";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return _trackremain;};
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="Dim breakRemain As Long = (scheduledBreakAt - Loc";
_breakremain = (long) ((__ref._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000);
RDebugUtils.currentLine=15794185;
 //BA.debugLineNum = 15794185;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
if (_trackremain<=0) { 
if (true) return _breakremain;};
RDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="Return Min(trackRemain, breakRemain)";
if (true) return (long) (__c.Min(_trackremain,_breakremain));
RDebugUtils.currentLine=15794187;
 //BA.debugLineNum = 15794187;BA.debugLine="End Sub";
return 0L;
}
public String  _transition_getdirectoractiveaudiokey(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getdirectoractiveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "transition_getdirectoractiveaudiokey", null));}
b4j.example.playbackplayerslot _activeslot = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub Transition_GetDirectorActiveAudioKey As";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="If activeSlot.IsInitialized Then Return activeSl";
if (_activeslot.IsInitialized /*boolean*/ ()) { 
if (true) return _activeslot._audiokey /*String*/ ;};
 };
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Return runtimeState.ActiveAudioKey";
if (true) return __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ;
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="End Sub";
return "";
}
public long  _localnowtimestamp(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localnowtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "localnowtimestamp", null));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub LocalNowTimestamp As Long";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Return Floor(EffectiveNowTicks / 1000) - (Timezon";
if (true) return (long) (__c.Floor(__ref._effectivenowticks /*long*/ (null)/(double)1000)-(__ref._timezoneoffsetminutes /*int*/ (null)*60));
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="End Sub";
return 0L;
}
public String  _updatemediaconnectivitystatefromcachesync(b4j.example.b4xmainpage __ref,boolean _downloaded) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatemediaconnectivitystatefromcachesync", false))
	 {return ((String) Debug.delegate(ba, "updatemediaconnectivitystatefromcachesync", new Object[] {_downloaded}));}
String _transition = "";
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub UpdateMediaConnectivityStateFromCacheS";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Dim transition As String = stateStore.UpdateMedia";
_transition = __ref._statestore /*b4j.example.playerstatestore*/ ._updatemediapathdegradedfromcachesync /*String*/ (null,_downloaded,__ref._mediacacheservice /*b4j.example.mediacache*/ ._consumerecentmedianetworkfailure /*boolean*/ (null));
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="If transition = \"entered\" Then";
if ((_transition).equals("entered")) { 
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="TraceLog(\"degraded path вход source=cache_sync\")";
__ref._tracelog /*String*/ (null,"degraded path вход source=cache_sync");
 }else 
{RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="Else If transition = \"recovered\" Then";
if ((_transition).equals("recovered")) { 
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="TraceLog(\"degraded path восстановлен source=cach";
__ref._tracelog /*String*/ (null,"degraded path восстановлен source=cache_sync");
 }}
;
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="End Sub";
return "";
}
public String  _enteraudiooutputrecoverypause(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "enteraudiooutputrecoverypause", false))
	 {return ((String) Debug.delegate(ba, "enteraudiooutputrecoverypause", new Object[] {_message}));}
String _safemessage = "";
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub EnterAudioOutputRecoveryPause(message";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim safeMessage As String = message";
_safemessage = _message;
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="If safeMessage = \"\" Then safeMessage = MessageVal";
if ((_safemessage).equals("")) { 
_safemessage = __ref._messagevalue /*String*/ (null,"audio_device_check");};
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="TraceWarn(\"audio\", \"output pause\", \"message=\" & s";
__ref._tracewarn /*String*/ (null,"audio","output pause","message="+_safemessage+" errors="+BA.NumberToString(__ref._consecutiveaudiooutputerrors /*int*/ ));
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="isAudioOutputRecoveryPause = True";
__ref._isaudiooutputrecoverypause /*boolean*/  = __c.True;
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="EnterPolicyPauseState(safeMessage, \"audio\")";
__ref._enterpolicypausestate /*String*/ (null,_safemessage,"audio");
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="ScheduleRetry(\"audio_device\", AUDIO_OUTPUT_RETRY_";
__ref._scheduleretry /*String*/ (null,"audio_device",__ref._audio_output_retry_delay_ms /*int*/ );
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executeplaybacktickdecision(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _decision) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "executeplaybacktickdecision", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "executeplaybacktickdecision", new Object[] {_decision}));}
ResumableSub_ExecutePlaybackTickDecision rsub = new ResumableSub_ExecutePlaybackTickDecision(this,__ref,_decision);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecutePlaybackTickDecision extends BA.ResumableSub {
public ResumableSub_ExecutePlaybackTickDecision(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _decision) {
this.parent = parent;
this.__ref = __ref;
this._decision = _decision;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _decision;
String _actionname = "";
long _remain = 0L;
boolean _unusedbreak = false;
b4j.example.playbackplayerslot _preparedslot = null;
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
boolean _prefetchok = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim actionName As String = decision.GetDefault(\"a";
_actionname = BA.ObjectToString(_decision.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim remain As Long = decision.GetDefault(\"remainM";
_remain = BA.ObjectToLongNumber(_decision.GetDefault((Object)("remainMs"),(Object)(0)));
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Select actionName";
if (true) break;

case 1:
//select
this.state = 18;
switch (BA.switchObjectToInt(_actionname,"trigger_break","crossfade_prepared_track","start_prepared_tail","prefetch_next")) {
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
default: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="TraceInfo(\"playback\", \"вставлен break\", \"mode=e";
__ref._traceinfo /*String*/ (null,"playback","вставлен break","mode=exact");
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unusedB";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "executeplaybacktickdecision"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = 18;
_unusedbreak = (boolean) result[1];
;
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="Dim preparedSlot As PlaybackPlayerSlot = direct";
_preparedslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpreparedslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="Dim preparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="If preparedSlot.IsInitialized Then";
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
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="preparedItem = preparedSlot.Item";
_prepareditem = _preparedslot._item /*anywheresoftware.b4a.objects.collections.Map*/ ;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="preparedItem.Initialize";
_prepareditem.Initialize();
 if (true) break;

case 11:
//C
this.state = 18;
;
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="TraceInfo(\"playback\", \"crossfade trigger\", \"rem";
__ref._traceinfo /*String*/ (null,"playback","crossfade trigger","remainMs="+BA.NumberToString(_remain)+" next="+__ref._tracetrackvalue /*String*/ (null,_prepareditem));
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="orchestrationState.IsCrossfadeTriggered = True";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepare";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 13:
//C
this.state = 18;
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="orchestrationState.IsCrossfadeTriggered = True";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="TraceInfo(\"playback\", \"вставлена реклама\", \"que";
__ref._traceinfo /*String*/ (null,"playback","вставлена реклама","queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=7995415;
 //BA.debugLineNum = 7995415;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepare";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=7995416;
 //BA.debugLineNum = 7995416;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="orchestrationState.PrefetchDone = True";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._prefetchdone /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7995419;
 //BA.debugLineNum = 7995419;BA.debugLine="Wait For (PrefetchNext) Complete (prefetchOk As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "executeplaybacktickdecision"), __ref._prefetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 18;
_prefetchok = (boolean) result[1];
;
RDebugUtils.currentLine=7995420;
 //BA.debugLineNum = 7995420;BA.debugLine="Return prefetchOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prefetchok));return;};
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=7995422;
 //BA.debugLineNum = 7995422;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=7995424;
 //BA.debugLineNum = 7995424;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fadeoutandcontinue(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "fadeoutandcontinue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fadeoutandcontinue", null));}
ResumableSub_FadeOutAndContinue rsub = new ResumableSub_FadeOutAndContinue(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FadeOutAndContinue extends BA.ResumableSub {
public ResumableSub_FadeOutAndContinue(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _fadems = 0;
String _activeaudiokey = "";
boolean _dispatched = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="If CanAdvancePlaybackNow(\"fade_out_and_continue\",";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canadvanceplaybacknow /*boolean*/ (null,"fade_out_and_continue",parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="If IsPlaybackTransitionInProgress Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._isplaybacktransitioninprogress /*boolean*/ (null)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="TraceLog(\"guard fade запрет reason=transition_in";
__ref._tracelog /*String*/ (null,"guard fade запрет reason=transition_in_progress");
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="If orchestrationState.IsPlaybackDispatchInProgres";

case 10:
//if
this.state = 13;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isplaybackdispatchinprogress /*boolean*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="TraceWarn(\"playback\", \"break переход пропущен\",";
__ref._tracewarn /*String*/ (null,"playback","break переход пропущен","reason=dispatch_busy active="+__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._activedispatchinitiator /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=15859720;
 //BA.debugLineNum = 15859720;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=15859722;
 //BA.debugLineNum = 15859722;BA.debugLine="TraceInfo(\"playback\", \"break переход начало\", \"ty";
__ref._traceinfo /*String*/ (null,"playback","break переход начало","type="+__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=15859723;
 //BA.debugLineNum = 15859723;BA.debugLine="SetPlaybackFlowState(FLOW_TRANSITIONING, \"fade_ou";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_transitioning /*String*/ ,"fade_out_and_continue");
RDebugUtils.currentLine=15859724;
 //BA.debugLineNum = 15859724;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=15859725;
 //BA.debugLineNum = 15859725;BA.debugLine="Dim fadeMs As Int";
_fadems = 0;
RDebugUtils.currentLine=15859726;
 //BA.debugLineNum = 15859726;BA.debugLine="If metaState.CurrentMediaType = \"track\" Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track")) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=15859727;
 //BA.debugLineNum = 15859727;BA.debugLine="fadeMs = STOP_FADE_MS";
_fadems = __ref._stop_fade_ms /*int*/ ;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=15859729;
 //BA.debugLineNum = 15859729;BA.debugLine="fadeMs = 0";
_fadems = (int) (0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=15859731;
 //BA.debugLineNum = 15859731;BA.debugLine="TraceLog(\"fade начало type=\" & metaState.CurrentM";
__ref._tracelog /*String*/ (null,"fade начало type="+__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ +" fadeMs="+BA.NumberToString(_fadems));
RDebugUtils.currentLine=15859732;
 //BA.debugLineNum = 15859732;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = __ref._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=15859733;
 //BA.debugLineNum = 15859733;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
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
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeaudiokey)._stop /*String*/ (null,_fadems);
if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=15859734;
 //BA.debugLineNum = 15859734;BA.debugLine="TraceInfo(\"playback\", \"break переход fade\", \"audi";
__ref._traceinfo /*String*/ (null,"playback","break переход fade","audio="+_activeaudiokey+" fadeMs="+BA.NumberToString(_fadems));
RDebugUtils.currentLine=15859735;
 //BA.debugLineNum = 15859735;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=15859736;
 //BA.debugLineNum = 15859736;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"fade_out_an";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fadeoutandcontinue"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"fade_out_and_continue",parent.__c.True));
this.state = 26;
return;
case 26:
//C
this.state = -1;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=15859737;
 //BA.debugLineNum = 15859737;BA.debugLine="TraceInfo(\"playback\", \"break переход итог\", \"disp";
__ref._traceinfo /*String*/ (null,"playback","break переход итог","dispatched="+BA.ObjectToString(_dispatched)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=15859738;
 //BA.debugLineNum = 15859738;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
RDebugUtils.currentLine=15859739;
 //BA.debugLineNum = 15859739;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _promotepreparedplayer(b4j.example.b4xmainpage __ref,int _fadeinms,int _fadeoutms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "promotepreparedplayer", false))
	 {return ((Boolean) Debug.delegate(ba, "promotepreparedplayer", new Object[] {_fadeinms,_fadeoutms}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub PromotePreparedPlayer(fadeInMs As Int,";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Return transitionCoordinator.PromotePreparedPlaye";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._promotepreparedplayer /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,_fadeinms,_fadeoutms,__ref._flow_transitioning /*String*/ );
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return false;
}
public int  _preparedfadeinms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeinms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeinms", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub PreparedFadeInMs As Int";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return 0;
}
public int  _preparedfadeoutms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", null));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub PreparedFadeOutMs As Int";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Return transitionCoordinator.PreparedFadeOutMs(me";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._preparedfadeoutms /*int*/ (null,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._track_overlap_ms /*int*/ ,__ref._ad_tail_overlap_ms /*int*/ );
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _prefetchnext(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prefetchnext", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "prefetchnext", null));}
ResumableSub_PrefetchNext rsub = new ResumableSub_PrefetchNext(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrefetchNext extends BA.ResumableSub {
public ResumableSub_PrefetchNext(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _preparedok = false;
anywheresoftware.b4a.objects.collections.Map _offlineitem = null;
boolean _preparedofflineok = false;
anywheresoftware.b4a.objects.collections.Map _directitem = null;
boolean _prepareddirectok = false;
anywheresoftware.b4a.objects.collections.Map _result = null;
anywheresoftware.b4a.objects.collections.List _queue = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="TraceInfo(\"playback\", \"prefetch start\", \"queue=\"";
__ref._traceinfo /*String*/ (null,"playback","prefetch start","queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ))+" current="+__ref._tracetrackvalue /*String*/ (null,__ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null)));
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="If HasDispatchableQueueItem Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._hasdispatchablequeueitem /*boolean*/ (null)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepare";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="TraceInfo(\"playback\", IIf(preparedOk, \"prefetch";
__ref._traceinfo /*String*/ (null,"playback",BA.ObjectToString(((_preparedok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )));
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;
;
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";

case 4:
//if
this.state = 11;
if (__ref._local_playback_only /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="Dim offlineItem As Map = offlinePlaybackCore.Res";
_offlineitem = new anywheresoftware.b4a.objects.collections.Map();
_offlineitem = __ref._offlineplaybackcore /*b4j.example.offlineplaybackengine*/ ._resolvenextmusicitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ );
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="If offlineItem.IsInitialized And offlineItem.Siz";
if (true) break;

case 7:
//if
this.state = 10;
if (_offlineitem.IsInitialized() && _offlineitem.getSize()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="Wait For (PrepareSpecificPlayable(offlineItem))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparespecificplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_offlineitem));
this.state = 43;
return;
case 43:
//C
this.state = 10;
_preparedofflineok = (boolean) result[1];
;
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="TraceInfo(\"playback\", IIf(preparedOfflineOk, \"p";
__ref._traceinfo /*String*/ (null,"playback",BA.ObjectToString(((_preparedofflineok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"mode=offline_local id="+BA.ObjectToString(_offlineitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="Return preparedOfflineOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedofflineok));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="TraceInfo(\"playback\", \"prefetch fail\", \"reason=n";
__ref._traceinfo /*String*/ (null,"playback","prefetch fail","reason=no_cached_track");
RDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=12517393;
 //BA.debugLineNum = 12517393;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 11:
//if
this.state = 24;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=12517394;
 //BA.debugLineNum = 12517394;BA.debugLine="Dim directItem As Map = offlinePlaybackCore.Reso";
_directitem = new anywheresoftware.b4a.objects.collections.Map();
_directitem = __ref._offlineplaybackcore /*b4j.example.offlineplaybackengine*/ ._resolvenextmusicitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ );
RDebugUtils.currentLine=12517395;
 //BA.debugLineNum = 12517395;BA.debugLine="If directItem.IsInitialized And directItem.Size";
if (true) break;

case 14:
//if
this.state = 23;
if (_directitem.IsInitialized() && _directitem.getSize()>0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=12517396;
 //BA.debugLineNum = 12517396;BA.debugLine="Wait For (PrepareSpecificPlayable(directItem))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparespecificplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_directitem));
this.state = 44;
return;
case 44:
//C
this.state = 17;
_prepareddirectok = (boolean) result[1];
;
RDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="TraceInfo(\"playback\", IIf(preparedDirectOk, \"pr";
__ref._traceinfo /*String*/ (null,"playback",BA.ObjectToString(((_prepareddirectok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"mode=direct_local reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ))+" id="+BA.ObjectToString(_directitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=12517398;
 //BA.debugLineNum = 12517398;BA.debugLine="If preparedDirectOk Then Return True";
if (true) break;

case 17:
//if
this.state = 22;
if (_prepareddirectok) { 
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
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=12517400;
 //BA.debugLineNum = 12517400;BA.debugLine="TraceInfo(\"playback\", \"prefetch fail\", \"reason=n";
__ref._traceinfo /*String*/ (null,"playback","prefetch fail","reason=no_local_direct reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )));
RDebugUtils.currentLine=12517401;
 //BA.debugLineNum = 12517401;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=12517403;
 //BA.debugLineNum = 12517403;BA.debugLine="If HasPendingExactBreak Then Return False";

case 24:
//if
this.state = 29;
if (__ref._haspendingexactbreak /*boolean*/ (null)) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=12517404;
 //BA.debugLineNum = 12517404;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 45;
return;
case 45:
//C
this.state = 30;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12517405;
 //BA.debugLineNum = 12517405;BA.debugLine="If result.GetDefault(\"Success\", False) = False Or";
if (true) break;

case 30:
//if
this.state = 35;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False)) || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=12517406;
 //BA.debugLineNum = 12517406;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=12517407;
 //BA.debugLineNum = 12517407;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 36:
//if
this.state = 41;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
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
RDebugUtils.currentLine=12517408;
 //BA.debugLineNum = 12517408;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=12517409;
 //BA.debugLineNum = 12517409;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=12517410;
 //BA.debugLineNum = 12517410;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepared";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 46;
return;
case 46:
//C
this.state = -1;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=12517411;
 //BA.debugLineNum = 12517411;BA.debugLine="TraceInfo(\"playback\", IIf(preparedOk, \"prefetch d";
__ref._traceinfo /*String*/ (null,"playback",BA.ObjectToString(((_preparedok) ? ((Object)("prefetch done")) : ((Object)("prefetch fail")))),"queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )));
RDebugUtils.currentLine=12517412;
 //BA.debugLineNum = 12517412;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
RDebugUtils.currentLine=12517413;
 //BA.debugLineNum = 12517413;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _exitplaybackdispatch(b4j.example.b4xmainpage __ref,boolean _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "exitplaybackdispatch", false))
	 {return ((Boolean) Debug.delegate(ba, "exitplaybackdispatch", new Object[] {_result}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub ExitPlaybackDispatch(result As Boolean";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="TraceLog(\"переход dispatch итог initiator=\" & orc";
__ref._tracelog /*String*/ (null,"переход dispatch итог initiator="+__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._activedispatchinitiator /*String*/ +" result="+BA.ObjectToString(_result)+" stage="+__ref._playbackflowstate /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="End Sub";
return false;
}
public long  _extractcontentlength(b4j.example.b4xmainpage __ref,b4j.example.httpjob _j) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "extractcontentlength", false))
	 {return ((Long) Debug.delegate(ba, "extractcontentlength", new Object[] {_j}));}
anywheresoftware.b4a.objects.collections.List _headerslist = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub ExtractContentLength(j As HttpJob) As";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Try";
try {RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim headersList As List = j.Response.GetHeaders.";
_headerslist = new anywheresoftware.b4a.objects.collections.List();
_headerslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders().Get((Object)("Content-Length"))));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="If headersList.IsInitialized = False Or headersL";
if (_headerslist.IsInitialized()==__c.False || _headerslist.getSize()==0) { 
_headerslist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders().Get((Object)("content-length"))));};
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="If headersList.IsInitialized = False Or headersL";
if (_headerslist.IsInitialized()==__c.False || _headerslist.getSize()==0) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Return ToLongDefault(headersList.Get(0), 0)";
if (true) return __ref._tolongdefault /*long*/ (null,_headerslist.Get((int) (0)),(long) (0));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="ConsumeLastException";
__ref._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="End Sub";
return 0L;
}
public String  _rundeferredpoststarttasksasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "rundeferredpoststarttasksasync", false))
	 {return ((String) Debug.delegate(ba, "rundeferredpoststarttasksasync", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub RunDeferredPostStartTasksAsync";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="RunDeferredPostStartTasks";
__ref._rundeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public boolean  _tryenterplaybackdispatch(b4j.example.b4xmainpage __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tryenterplaybackdispatch", false))
	 {return ((Boolean) Debug.delegate(ba, "tryenterplaybackdispatch", new Object[] {_initiator}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub TryEnterPlaybackDispatch(initiator As";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="If orchestrationState.BeginDispatch(initiator) =";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._begindispatch /*boolean*/ (null,_initiator)==__c.False) { 
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="TraceLog(\"переход dispatch skip reason=reentry i";
__ref._tracelog /*String*/ (null,"переход dispatch skip reason=reentry initiator="+_initiator+" active="+__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._activedispatchinitiator /*String*/ +" stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="TraceLog(\"переход dispatch начало initiator=\" & i";
__ref._tracelog /*String*/ (null,"переход dispatch начало initiator="+_initiator+" prepared="+__ref._haspreparedslotfortrace /*String*/ (null)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="End Sub";
return false;
}
public String  _haspreparedslotfortrace(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haspreparedslotfortrace", false))
	 {return ((String) Debug.delegate(ba, "haspreparedslotfortrace", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub HasPreparedSlotForTrace As String";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="If directorState.IsInitialized Then Return IIf(di";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
if (true) return BA.ObjectToString(((__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._haspreparedslot /*boolean*/ (null)) ? ((Object)("true")) : ((Object)("false"))));};
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Return \"false\"";
if (true) return "false";
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _resolvedispatchdecision(b4j.example.b4xmainpage __ref,boolean _allowload) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvedispatchdecision", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvedispatchdecision", new Object[] {_allowload}));}
boolean _haslocalreserve = false;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Private Sub ResolveDispatchDecision(allowLoad As B";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim hasLocalReserve As Boolean = False";
_haslocalreserve = __c.False;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (__ref._local_playback_only /*boolean*/ ) { 
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="hasLocalReserve = GetCurrentSlotLocalReserveCoun";
_haslocalreserve = __ref._getcurrentslotlocalreservecount /*int*/ (null)>0 || __ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null);
 }else {
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="hasLocalReserve = USE_DATA_PLAYBACK_RESOLVER";
_haslocalreserve = __ref._use_data_playback_resolver /*boolean*/ ;
 };
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="Return offlinePlaybackCore.ResolveAdvanceDecision";
if (true) return __ref._offlineplaybackcore /*b4j.example.offlineplaybackengine*/ ._resolveadvancedecision /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._shouldprioritizequeueheadoverprepared /*boolean*/ (null),__ref._canuseprepareditemnow /*boolean*/ (null),__ref._hasdispatchablequeueitem /*boolean*/ (null),BA.ObjectToBoolean(((__ref._local_playback_only /*boolean*/ ) ? ((Object)(_haslocalreserve)) : ((Object)(__ref._use_data_playback_resolver /*boolean*/ )))),_allowload);
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _populateplaybackqueue(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "populateplaybackqueue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "populateplaybackqueue", null));}
ResumableSub_PopulatePlaybackQueue rsub = new ResumableSub_PopulatePlaybackQueue(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PopulatePlaybackQueue extends BA.ResumableSub {
public ResumableSub_PopulatePlaybackQueue(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _playablereserve = 0;
boolean _hasmusicreserve = false;
String _idletext = "";
anywheresoftware.b4a.objects.collections.Map _result = null;
boolean _unused = false;
anywheresoftware.b4a.objects.collections.List _queue = null;
int _retryafter = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Dim playableReserve As Int = stateStore.GetLocalP";
_playablereserve = __ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._local_playback_only /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="If HasDispatchableQueueItem Or stateStore.HasAny";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._hasdispatchablequeueitem /*boolean*/ (null) || __ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null)) { 
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
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="HandleCacheWarmupPending";
__ref._handlecachewarmuppending /*String*/ (null);
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";

case 10:
//if
this.state = 13;
if (__ref._isplaybackallowedbycurrentdata /*boolean*/ (null)==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReason";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null)),"server");
RDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 13:
//if
this.state = 27;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=12320787;
 //BA.debugLineNum = 12320787;BA.debugLine="Dim hasMusicReserve As Boolean = GetCurrentSlotL";
_hasmusicreserve = __ref._getcurrentslotlocalreservecount /*int*/ (null)>0 || _playablereserve>0 || __ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null);
RDebugUtils.currentLine=12320788;
 //BA.debugLineNum = 12320788;BA.debugLine="If HasDispatchableQueueItem Then";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._hasdispatchablequeueitem /*boolean*/ (null)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=12320789;
 //BA.debugLineNum = 12320789;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=12320793;
 //BA.debugLineNum = 12320793;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=12320795;
 //BA.debugLineNum = 12320795;BA.debugLine="If hasMusicReserve Then";

case 19:
//if
this.state = 22;
if (_hasmusicreserve) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=12320799;
 //BA.debugLineNum = 12320799;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=12320804;
 //BA.debugLineNum = 12320804;BA.debugLine="Dim idleText As String = stateStore.ResolveIdleU";
_idletext = __ref._statestore /*b4j.example.playerstatestore*/ ._resolveidleuntilmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=12320805;
 //BA.debugLineNum = 12320805;BA.debugLine="If idleText <> \"\" Then";
if (true) break;

case 23:
//if
this.state = 26;
if ((_idletext).equals("") == false) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=12320806;
 //BA.debugLineNum = 12320806;BA.debugLine="HandleTemporaryState(\"server\", idleText)";
__ref._handletemporarystate /*String*/ (null,"server",_idletext);
RDebugUtils.currentLine=12320807;
 //BA.debugLineNum = 12320807;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=12320809;
 //BA.debugLineNum = 12320809;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=12320810;
 //BA.debugLineNum = 12320810;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=12320812;
 //BA.debugLineNum = 12320812;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "populateplaybackqueue"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 41;
return;
case 41:
//C
this.state = 28;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12320813;
 //BA.debugLineNum = 12320813;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 28:
//if
this.state = 31;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=12320817;
 //BA.debugLineNum = 12320817;BA.debugLine="Wait For (HandleFetchFailure(result)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "populateplaybackqueue"), __ref._handlefetchfailure /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_result));
this.state = 42;
return;
case 42:
//C
this.state = 31;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=12320818;
 //BA.debugLineNum = 12320818;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=12320820;
 //BA.debugLineNum = 12320820;BA.debugLine="If orchestrationState.IsStarted = False Or orches";

case 31:
//if
this.state = 36;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=12320821;
 //BA.debugLineNum = 12320821;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=12320822;
 //BA.debugLineNum = 12320822;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=12320823;
 //BA.debugLineNum = 12320823;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 37:
//if
this.state = 40;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=12320827;
 //BA.debugLineNum = 12320827;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=12320828;
 //BA.debugLineNum = 12320828;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=12320830;
 //BA.debugLineNum = 12320830;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=12320831;
 //BA.debugLineNum = 12320831;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=12320835;
 //BA.debugLineNum = 12320835;BA.debugLine="Dim retryAfter As Int = NormalizeRetryAfter(resul";
_retryafter = __ref._normalizeretryafter /*int*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=12320836;
 //BA.debugLineNum = 12320836;BA.debugLine="stateStore.SetDispatchRetryAfter(retryAfter)";
__ref._statestore /*b4j.example.playerstatestore*/ ._setdispatchretryafter /*String*/ (null,_retryafter);
RDebugUtils.currentLine=12320837;
 //BA.debugLineNum = 12320837;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=12320838;
 //BA.debugLineNum = 12320838;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _playqueueitem(b4j.example.b4xmainpage __ref,Object _current,int _retryafter) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playqueueitem", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "playqueueitem", new Object[] {_current,_retryafter}));}
ResumableSub_PlayQueueItem rsub = new ResumableSub_PlayQueueItem(this,__ref,_current,_retryafter);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PlayQueueItem extends BA.ResumableSub {
public ResumableSub_PlayQueueItem(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,Object _current,int _retryafter) {
this.parent = parent;
this.__ref = __ref;
this._current = _current;
this._retryafter = _retryafter;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
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
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="orchestrationState.IsCrossfadeTriggered = False";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="If current Is Map Then";
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
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Dim item As Map = current";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_current));
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="If itemType = \"message\" Then";
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
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="HandleMessageItem(item)";
__ref._handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="If itemType = \"update\" Then";

case 7:
//if
this.state = 10;
if ((_itemtype).equals("update")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=13041676;
 //BA.debugLineNum = 13041676;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=13041677;
 //BA.debugLineNum = 13041677;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=13041679;
 //BA.debugLineNum = 13041679;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"player_reloading")))));
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=13041684;
 //BA.debugLineNum = 13041684;BA.debugLine="If itemType = \"idle\" Then";
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
RDebugUtils.currentLine=13041685;
 //BA.debugLineNum = 13041685;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=13041686;
 //BA.debugLineNum = 13041686;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"idle")))));
RDebugUtils.currentLine=13041687;
 //BA.debugLineNum = 13041687;BA.debugLine="If retryAfter > 0 Then";
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
RDebugUtils.currentLine=13041688;
 //BA.debugLineNum = 13041688;BA.debugLine="ScheduleRetry(\"server\", retryAfter * 1000)";
__ref._scheduleretry /*String*/ (null,"server",(int) (_retryafter*1000));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=13041690;
 //BA.debugLineNum = 13041690;BA.debugLine="ScheduleRetry(\"server\", PAUSE_RETRY_DELAY)";
__ref._scheduleretry /*String*/ (null,"server",__ref._pause_retry_delay /*int*/ );
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=13041692;
 //BA.debugLineNum = 13041692;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=13041695;
 //BA.debugLineNum = 13041695;BA.debugLine="If itemType = \"break\" Then";

case 20:
//if
this.state = 27;
if ((_itemtype).equals("break")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=13041699;
 //BA.debugLineNum = 13041699;BA.debugLine="If item.ContainsKey(\"at\") And ToLongDefault(ite";
if (true) break;

case 23:
//if
this.state = 26;
if (_item.ContainsKey((Object)("at")) && __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1))>__ref._localnowtimestamp /*long*/ (null) && __ref._shouldtriggerbreaknow /*boolean*/ (null)==parent.__c.False) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=13041700;
 //BA.debugLineNum = 13041700;BA.debugLine="DeferFutureExactBreak(item)";
__ref._deferfutureexactbreak /*String*/ (null,_item);
RDebugUtils.currentLine=13041701;
 //BA.debugLineNum = 13041701;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=13041703;
 //BA.debugLineNum = 13041703;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=13041704;
 //BA.debugLineNum = 13041704;BA.debugLine="MergeBreakItems(item)";
__ref._mergebreakitems /*String*/ (null,_item);
RDebugUtils.currentLine=13041705;
 //BA.debugLineNum = 13041705;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=13041708;
 //BA.debugLineNum = 13041708;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";

case 27:
//if
this.state = 30;
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=13041709;
 //BA.debugLineNum = 13041709;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=13041710;
 //BA.debugLineNum = 13041710;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=13041713;
 //BA.debugLineNum = 13041713;BA.debugLine="Dim url As String = MediaUrl(item)";
_url = __ref._mediaurl /*String*/ (null,_item);
RDebugUtils.currentLine=13041714;
 //BA.debugLineNum = 13041714;BA.debugLine="If url = \"\" Then";
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
RDebugUtils.currentLine=13041715;
 //BA.debugLineNum = 13041715;BA.debugLine="TraceWarn(\"cache\", \"нет локального файла\", \"tra";
__ref._tracewarn /*String*/ (null,"cache","нет локального файла","trackId="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=13041716;
 //BA.debugLineNum = 13041716;BA.debugLine="If HasLocalPlaybackFallback Then";
if (true) break;

case 34:
//if
this.state = 37;
if (__ref._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=13041717;
 //BA.debugLineNum = 13041717;BA.debugLine="TraceLog(\"fallback reseed reason=missing_local";
__ref._tracelog /*String*/ (null,"fallback reseed reason=missing_local_media");
RDebugUtils.currentLine=13041718;
 //BA.debugLineNum = 13041718;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=13041720;
 //BA.debugLineNum = 13041720;BA.debugLine="playerDataCoordinator.ActivateLocalFallback(sta";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._activatelocalfallback /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._ismediapathdegraded /*boolean*/ (null),"missing_local_media");
RDebugUtils.currentLine=13041721;
 //BA.debugLineNum = 13041721;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=13041724;
 //BA.debugLineNum = 13041724;BA.debugLine="If item.ContainsKey(\"playlist\") Then playlistInd";

case 38:
//if
this.state = 43;
if (_item.ContainsKey((Object)("playlist"))) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
__ref._playlistindex /*int*/  = (int)(BA.ObjectToNumber(_item.Get((Object)("playlist"))));
if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=13041725;
 //BA.debugLineNum = 13041725;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, item)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._commitplaylistcursor /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ,_item);
RDebugUtils.currentLine=13041726;
 //BA.debugLineNum = 13041726;BA.debugLine="orchestrationState.PrefetchDone = False";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=13041727;
 //BA.debugLineNum = 13041727;BA.debugLine="Dim fadeInMs As Int = ResolveStartFadeInMs";
_fadeinms = __ref._resolvestartfadeinms /*int*/ (null);
RDebugUtils.currentLine=13041728;
 //BA.debugLineNum = 13041728;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioK";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=13041729;
 //BA.debugLineNum = 13041729;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" The";
if (true) break;

case 44:
//if
this.state = 49;
if ((__ref._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("")) { 
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
RDebugUtils.currentLine=13041730;
 //BA.debugLineNum = 13041730;BA.debugLine="Wait For (StartPlaybackWithAudioKey(targetAudioK";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._startplaybackwithaudiokey /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_targetaudiokey,_item,_fadeinms));
this.state = 70;
return;
case 70:
//C
this.state = 50;
_playbackstarted = (boolean) result[1];
;
RDebugUtils.currentLine=13041731;
 //BA.debugLineNum = 13041731;BA.debugLine="If playbackStarted = False Then";
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
RDebugUtils.currentLine=13041732;
 //BA.debugLineNum = 13041732;BA.debugLine="If orchestrationState.IsStoppedByUser = False A";
if (true) break;

case 53:
//if
this.state = 60;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ==parent.__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=13041733;
 //BA.debugLineNum = 13041733;BA.debugLine="Wait For (HandleMediaError) Complete (unusedEr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 71;
return;
case 71:
//C
this.state = 56;
_unusederror = (boolean) result[1];
;
RDebugUtils.currentLine=13041734;
 //BA.debugLineNum = 13041734;BA.debugLine="If dataPolicyState.HasLocalMediaFallback Then";
if (true) break;

case 56:
//if
this.state = 59;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._haslocalmediafallback /*boolean*/ ) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=13041735;
 //BA.debugLineNum = 13041735;BA.debugLine="Return True";
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
RDebugUtils.currentLine=13041738;
 //BA.debugLineNum = 13041738;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=13041740;
 //BA.debugLineNum = 13041740;BA.debugLine="If orchestrationState.IsStarted = False Or orche";

case 61:
//if
this.state = 66;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=13041741;
 //BA.debugLineNum = 13041741;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=13041743;
 //BA.debugLineNum = 13041743;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=13041744;
 //BA.debugLineNum = 13041744;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 69:
//C
this.state = -1;
;
RDebugUtils.currentLine=13041746;
 //BA.debugLineNum = 13041746;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _shiftdispatchablequeueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shiftdispatchablequeueitem", false))
	 {return ((Object) Debug.delegate(ba, "shiftdispatchablequeueitem", null));}
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemtype = "";
long _breakat = 0L;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Private Sub ShiftDispatchableQueueItem As Object";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i);
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="If itemType = \"break\" Then";
if ((_itemtype).equals("break")) { 
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Dim breakAt As Long = ToLongDefault(item.GetDef";
_breakat = __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="If breakAt > LocalNowTimestamp Then Continue";
if (_breakat>__ref._localnowtimestamp /*long*/ (null)) { 
if (true) continue;};
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="Return item";
if (true) return (Object)(_item.getObject());
 };
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="If mediaCacheService.IsTrackCached(item.GetDefa";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="TraceLog(\"переход очередь skip reason=no_local";
__ref._tracelog /*String*/ (null,"переход очередь skip reason=no_local_track item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=23265296;
 //BA.debugLineNum = 23265296;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=23265298;
 //BA.debugLineNum = 23265298;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="Return item";
if (true) return (Object)(_item.getObject());
 };
RDebugUtils.currentLine=23265301;
 //BA.debugLineNum = 23265301;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=23265302;
 //BA.debugLineNum = 23265302;BA.debugLine="If mediaCacheService.IsAdCached(item.GetDefault";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._isadcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
RDebugUtils.currentLine=23265303;
 //BA.debugLineNum = 23265303;BA.debugLine="TraceLog(\"переход очередь skip reason=no_local";
__ref._tracelog /*String*/ (null,"переход очередь skip reason=no_local_ad item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=23265304;
 //BA.debugLineNum = 23265304;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=23265306;
 //BA.debugLineNum = 23265306;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=23265307;
 //BA.debugLineNum = 23265307;BA.debugLine="Return item";
if (true) return (Object)(_item.getObject());
 };
 }
};
RDebugUtils.currentLine=23265310;
 //BA.debugLineNum = 23265310;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=23265311;
 //BA.debugLineNum = 23265311;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_loadnextandplaycore(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_loadnextandplaycore", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "facade_loadnextandplaycore", null));}
ResumableSub_Facade_LoadNextAndPlayCore rsub = new ResumableSub_Facade_LoadNextAndPlayCore(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_LoadNextAndPlayCore extends BA.ResumableSub {
public ResumableSub_Facade_LoadNextAndPlayCore(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _offlinedispatched = false;
boolean _directdispatched = false;
String _idletext = "";
boolean _queueprepared = false;
boolean _dispatched = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ )) { 
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
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then";
if (true) break;

case 7:
//if
this.state = 22;
if (__ref._local_playback_only /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"load_next_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_loadnextandplaycore"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"load_next_and_play:"+__ref._nextstartmode /*String*/ ,parent.__c.False));
this.state = 42;
return;
case 42:
//C
this.state = 10;
_offlinedispatched = (boolean) result[1];
;
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="If offlineDispatched Then Return True";
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
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="If stateStore.HasAnyCachedTrack Then";
if (true) break;

case 16:
//if
this.state = 21;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="HandleNoLocalTracks(\"\")";
__ref._handlenolocaltracks /*String*/ (null,"");
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="HandleCacheWarmupPending";
__ref._handlecachewarmuppending /*String*/ (null);
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 22:
//if
this.state = 35;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=12255246;
 //BA.debugLineNum = 12255246;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"load_next_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_loadnextandplaycore"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"load_next_and_play:"+__ref._nextstartmode /*String*/ ,parent.__c.False));
this.state = 43;
return;
case 43:
//C
this.state = 25;
_directdispatched = (boolean) result[1];
;
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="If directDispatched Then Return True";
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
RDebugUtils.currentLine=12255250;
 //BA.debugLineNum = 12255250;BA.debugLine="Dim idleText As String = stateStore.ResolveIdleU";
_idletext = __ref._statestore /*b4j.example.playerstatestore*/ ._resolveidleuntilmessage /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._statestore /*b4j.example.playerstatestore*/ ._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="If idleText <> \"\" Then";
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
RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="HandleTemporaryState(\"server\", idleText)";
__ref._handletemporarystate /*String*/ (null,"server",_idletext);
RDebugUtils.currentLine=12255253;
 //BA.debugLineNum = 12255253;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=12255255;
 //BA.debugLineNum = 12255255;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=12255256;
 //BA.debugLineNum = 12255256;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queueP";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_loadnextandplaycore"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 44;
return;
case 44:
//C
this.state = 36;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=12255259;
 //BA.debugLineNum = 12255259;BA.debugLine="If queuePrepared = False Then Return False";
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
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"load_next_a";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_loadnextandplaycore"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"load_next_and_play:"+__ref._nextstartmode /*String*/ ,parent.__c.False));
this.state = 45;
return;
case 45:
//C
this.state = -1;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
RDebugUtils.currentLine=12255262;
 //BA.debugLineNum = 12255262;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runplaybackdirectoradvance(b4j.example.b4xmainpage __ref,String _source,boolean _allowload) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "runplaybackdirectoradvance", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "runplaybackdirectoradvance", new Object[] {_source,_allowload}));}
ResumableSub_RunPlaybackDirectorAdvance rsub = new ResumableSub_RunPlaybackDirectorAdvance(this,__ref,_source,_allowload);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunPlaybackDirectorAdvance extends BA.ResumableSub {
public ResumableSub_RunPlaybackDirectorAdvance(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _source,boolean _allowload) {
this.parent = parent;
this.__ref = __ref;
this._source = _source;
this._allowload = _allowload;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _source;
boolean _allowload;
boolean _ownsdecision = false;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim ownsDecision As Boolean = False";
_ownsdecision = parent.__c.False;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="If directorState.CurrentDecision = \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._currentdecision /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="If directorState.TryBeginDecision(source & \":adv";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._trybegindecision /*boolean*/ (null,_source+":advance")==parent.__c.False) { 
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
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="ownsDecision = True";
_ownsdecision = parent.__c.True;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="Wait For (DispatchPlaybackAdvance(source, allowLo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runplaybackdirectoradvance"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_source,_allowload));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="If ownsDecision Then directorState.ClearDecision";
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
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._cleardecision /*String*/ (null);
if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handlenolocaltracks(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlenolocaltracks", false))
	 {return ((String) Debug.delegate(ba, "handlenolocaltracks", new Object[] {_text}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub HandleNoLocalTracks(text As String)";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="If text = \"\" Then text = \"Подготовка воспроизведе";
if ((_text).equals("")) { 
_text = "Подготовка воспроизведения...";};
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"no_local_tracks\"";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"no_local_tracks");
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="End Sub";
return "";
}
public String  _handlecachewarmuppending(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlecachewarmuppending", false))
	 {return ((String) Debug.delegate(ba, "handlecachewarmuppending", null));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub HandleCacheWarmupPending";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="ShowMessage(\"Подготовка воспроизведения...\")";
__ref._showmessage /*String*/ (null,"Подготовка воспроизведения...");
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"cache_warmup\")";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"cache_warmup");
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="End Sub";
return "";
}
public String  _prescanupcomingadminute(b4j.example.b4xmainpage __ref,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prescanupcomingadminute", false))
	 {return ((String) Debug.delegate(ba, "prescanupcomingadminute", new Object[] {_force}));}
long _targettimestamp = 0L;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub PreScanUpcomingAdMinute(force As Boole";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (__ref._currentsecondofminute /*int*/ (null)<50) { 
if (true) return "";};
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Dim targetTimestamp As Long = LocalNowTimestamp +";
_targettimestamp = (long) (__ref._localnowtimestamp /*long*/ (null)+(60-__ref._currentsecondofminute /*int*/ (null)));
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="If (MinuteOfHourFromTimestamp(targetTimestamp) Mo";
if ((__ref._minuteofhourfromtimestamp /*int*/ (null,_targettimestamp)%5)!=0) { 
if (true) return "";};
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="If CurrentSecondOfMinute = 50 Then";
if (__ref._currentsecondofminute /*int*/ (null)==50) { 
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="TraceLog(\"реклама prescan начало target=\" & Form";
__ref._tracelog /*String*/ (null,"реклама prescan начало target="+__ref._formattimestampfortrace /*String*/ (null,_targettimestamp));
 };
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="ScanLocalAdsForTimestamp(targetTimestamp, force)";
__ref._scanlocaladsfortimestamp /*String*/ (null,_targettimestamp,_force);
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="End Sub";
return "";
}
public String  _handletemporarystate(b4j.example.b4xmainpage __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handletemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handletemporarystate", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Private Sub HandleTemporaryState(mode As String, t";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="playerDataCoordinator.HandleTemporaryState(mode,";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._handletemporarystate /*String*/ (null,_mode,_text);
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="TryApplyPendingAppUpdate(\"temporary_state\")";
__ref._tryapplypendingappupdate /*boolean*/ (null,"temporary_state");
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="End Sub";
return "";
}
public String  _facade_pauseplaybackcore(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_pauseplaybackcore", false))
	 {return ((String) Debug.delegate(ba, "facade_pauseplaybackcore", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub Facade_PausePlaybackCore(reason As Stri";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="playerDataCoordinator.PausePlaybackByPolicy(reaso";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._pauseplaybackbypolicy /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_preparenextplayablecore(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_preparenextplayablecore", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "facade_preparenextplayablecore", null));}
ResumableSub_Facade_PrepareNextPlayableCore rsub = new ResumableSub_Facade_PrepareNextPlayableCore(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_PrepareNextPlayableCore extends BA.ResumableSub {
public ResumableSub_Facade_PrepareNextPlayableCore(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _prepared = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="If CanPrepareNextPlayableNow(True) = False Then R";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canpreparenextplayablenow /*boolean*/ (null,parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Wait For (transitionCoordinator.PrepareNextPlayab";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_preparenextplayablecore"), __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._mediacacheservice /*b4j.example.mediacache*/ ,__ref._playbackflowstate /*String*/ ,__ref._flow_playing /*String*/ ,__ref._flow_idle /*String*/ ,__ref._flow_preparing /*String*/ ));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_resumeplaybackafterpolicypausecore(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_resumeplaybackafterpolicypausecore", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "facade_resumeplaybackafterpolicypausecore", null));}
ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore rsub = new ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore extends BA.ResumableSub {
public ResumableSub_Facade_ResumePlaybackAfterPolicyPauseCore(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If CanResumePlaybackNow(\"policy_pause\", True) = F";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canresumeplaybacknow /*boolean*/ (null,"policy_pause",parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If ShouldResumeWithNewStart = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._shouldresumewithnewstart /*boolean*/ (null)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="TraceLog(\"возобновление запрет reason=policy_pau";
__ref._tracelog /*String*/ (null,"возобновление запрет reason=policy_pause state=no_new_start");
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="TraceLog(\"возобновление итог mode=auto_restart\")";
__ref._tracelog /*String*/ (null,"возобновление итог mode=auto_restart");
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_resumeplaybackafterpolicypausecore"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 11;
return;
case 11:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _shouldresumewithnewstart(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldresumewithnewstart", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldresumewithnewstart", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub ShouldResumeWithNewStart As Boolean";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Return orchestrationState.IsStarted And IsUserSto";
if (true) return __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  && __ref._isuserstoppedstate /*boolean*/ (null)==__c.False && __ref._ispolicypausestate /*boolean*/ (null)==__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ==__c.False;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_startfirsttrackcore(b4j.example.b4xmainpage __ref,String _mode) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_startfirsttrackcore", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "facade_startfirsttrackcore", new Object[] {_mode}));}
ResumableSub_Facade_StartFirstTrackCore rsub = new ResumableSub_Facade_StartFirstTrackCore(this,__ref,_mode);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_StartFirstTrackCore extends BA.ResumableSub {
public ResumableSub_Facade_StartFirstTrackCore(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _mode) {
this.parent = parent;
this.__ref = __ref;
this._mode = _mode;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _mode;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="nextStartMode = mode";
__ref._nextstartmode /*String*/  = _mode;
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="SetPlaybackFlowState(FLOW_STARTING, \"start_first_";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_starting /*String*/ ,"start_first_track:"+_mode);
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="initialStartFadePending = True";
__ref._initialstartfadepending /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER And LOCAL_PLAYBACK_";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._use_data_playback_resolver /*boolean*/  && __ref._local_playback_only /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._prescanupcomingadminute /*String*/ (null,parent.__c.True);
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" And";
if (true) break;

case 7:
//if
this.state = 12;
if ((__ref._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("") && (__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"syncing"));
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_startfirsttrackcore"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadnextandplay(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "loadnextandplay", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadnextandplay", null));}
ResumableSub_LoadNextAndPlay rsub = new ResumableSub_LoadNextAndPlay(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadNextAndPlay extends BA.ResumableSub {
public ResumableSub_LoadNextAndPlay(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _advanced = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Wait For (Facade_LoadNextAndPlayCore) Complete (a";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._facade_loadnextandplaycore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _facade_stopplayercore(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_stopplayercore", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "facade_stopplayercore", null));}
ResumableSub_Facade_StopPlayerCore rsub = new ResumableSub_Facade_StopPlayerCore(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Facade_StopPlayerCore extends BA.ResumableSub {
public ResumableSub_Facade_StopPlayerCore(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _activeaudiokey = "";
String _preparedaudiokey = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="If CanStopPlaybackNow(True) = False Then Return F";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canstopplaybacknow /*boolean*/ (null,parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="SetPlaybackFlowState(FLOW_STOPPING, \"stop_request";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_stopping /*String*/ ,"stop_requested");
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="orchestrationState.EnterInternalStoppingState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterinternalstoppingstate /*String*/ (null);
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="TraceLog(\"stop запрос type=\" & metaState.CurrentM";
__ref._tracelog /*String*/ (null,"stop запрос type="+__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ +" activeAudio="+__ref._transition_getdirectoractiveaudiokey /*String*/ (null)+" preparedAudio="+__ref._transition_getdirectorpreparedaudiokey /*String*/ (null));
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=17367052;
 //BA.debugLineNum = 17367052;BA.debugLine="ResetAudioOutputErrorState";
__ref._resetaudiooutputerrorstate /*String*/ (null);
RDebugUtils.currentLine=17367053;
 //BA.debugLineNum = 17367053;BA.debugLine="stateStore.ClearDispatchRetryAfter";
__ref._statestore /*b4j.example.playerstatestore*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = __ref._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=17367055;
 //BA.debugLineNum = 17367055;BA.debugLine="Dim preparedAudioKey As String = Transition_GetDi";
_preparedaudiokey = __ref._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="If activeAudioKey <> \"\" Then";
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
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="If metaState.CurrentMediaType = \"track\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=17367058;
 //BA.debugLineNum = 17367058;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeaudiokey)._stop /*String*/ (null,__ref._stop_fade_ms /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(0)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeaudiokey)._stop /*String*/ (null,(int) (0));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=17367063;
 //BA.debugLineNum = 17367063;BA.debugLine="If preparedAudioKey <> \"\" Then GetAudioByKey(prep";

case 16:
//if
this.state = 21;
if ((_preparedaudiokey).equals("") == false) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_preparedaudiokey)._stop /*String*/ (null,(int) (0));
if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=17367064;
 //BA.debugLineNum = 17367064;BA.debugLine="If directorState.IsInitialized Then";
if (true) break;

case 22:
//if
this.state = 27;
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="directorState.Reset";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=17367066;
 //BA.debugLineNum = 17367066;BA.debugLine="directorState.ConfigureDefaultSlots";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._configuredefaultslots /*String*/ (null);
RDebugUtils.currentLine=17367067;
 //BA.debugLineNum = 17367067;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=17367069;
 //BA.debugLineNum = 17367069;BA.debugLine="runtimeState.Reset";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._reset /*String*/ (null);
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=17367071;
 //BA.debugLineNum = 17367071;BA.debugLine="metaState.Reset";
__ref._metastate /*b4j.example.playbackmetastate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=17367072;
 //BA.debugLineNum = 17367072;BA.debugLine="playlistIndex = -1";
__ref._playlistindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=17367073;
 //BA.debugLineNum = 17367073;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=17367074;
 //BA.debugLineNum = 17367074;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=17367075;
 //BA.debugLineNum = 17367075;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=17367076;
 //BA.debugLineNum = 17367076;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=17367077;
 //BA.debugLineNum = 17367077;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=17367078;
 //BA.debugLineNum = 17367078;BA.debugLine="uiController.SetStatusText(\"\")";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=17367079;
 //BA.debugLineNum = 17367079;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=17367080;
 //BA.debugLineNum = 17367080;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=17367081;
 //BA.debugLineNum = 17367081;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=17367082;
 //BA.debugLineNum = 17367082;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"stop_complete\")";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"stop_complete");
RDebugUtils.currentLine=17367083;
 //BA.debugLineNum = 17367083;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=17367084;
 //BA.debugLineNum = 17367084;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fetchnext(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "fetchnext", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fetchnext", null));}
ResumableSub_FetchNext rsub = new ResumableSub_FetchNext(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FetchNext extends BA.ResumableSub {
public ResumableSub_FetchNext(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Wait For (syncService.FetchNext(FETCH_TIMEOUT_MS,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchnext"), __ref._syncservice /*b4j.example.networksyncservice*/ ._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._fetch_timeout_ms /*int*/ ,__ref._resolveappversion /*String*/ (null),__ref._nextstartmode /*String*/ ,__ref._playlistindex /*int*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="nextStartMode = \"\"";
__ref._nextstartmode /*String*/  = "";
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _filterplayercode(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "filterplayercode", false))
	 {return ((String) Debug.delegate(ba, "filterplayercode", new Object[] {_value}));}
String _filtered = "";
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Private Sub FilterPlayerCode(value As String) As S";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Dim filtered As String = Regex.Replace(\"[^A-Za-z0";
_filtered = __c.Regex.Replace("[^A-Za-z0-9]",_value,"");
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="If filtered.Length > 5 Then filtered = filtered.S";
if (_filtered.length()>5) { 
_filtered = _filtered.substring((int) (0),(int) (5));};
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="Return filtered.ToUpperCase";
if (true) return _filtered.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _flushhistorybuffer(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushhistorybuffer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "flushhistorybuffer", null));}
ResumableSub_FlushHistoryBuffer rsub = new ResumableSub_FlushHistoryBuffer(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FlushHistoryBuffer extends BA.ResumableSub {
public ResumableSub_FlushHistoryBuffer(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
long _startedat = 0L;
String _pendinghistoryfilename = "";
String _batchdate = "";
String _payload = "";
int _recordcount = 0;
anywheresoftware.b4a.objects.collections.Map _queryparams = null;
String _requesturl = "";
b4j.example.httpjob _j = null;
boolean _success = false;
String _responsetext = "";
String _failurekind = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="If isHistoryFlushInProgress Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._ishistoryflushinprogress /*boolean*/ ) { 
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
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return F";
if (true) break;

case 7:
//if
this.state = 12;
if ((__ref._playercode /*String*/ ).equals("") || (__ref._deviceid /*String*/ ).equals("")) { 
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
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="Dim pendingHistoryFileName As String = GetOldestP";
_pendinghistoryfilename = __ref._getoldestpendinghistoryfilename /*String*/ (null);
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="If pendingHistoryFileName = \"\" Then Return True";
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
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="isHistoryFlushInProgress = True";
__ref._ishistoryflushinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="Dim batchDate As String = HistoryFileNameToDate(p";
_batchdate = __ref._historyfilenametodate /*String*/ (null,_pendinghistoryfilename);
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="Dim payload As String = \"\"";
_payload = "";
RDebugUtils.currentLine=16121865;
 //BA.debugLineNum = 16121865;BA.debugLine="Try";
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
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="payload = File.ReadString(GetHistoryDir, pending";
_payload = parent.__c.File.ReadString(__ref._gethistorydir /*String*/ (null),_pendinghistoryfilename);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="TraceLog(\"история чтение ошибка file=\" & pending";
__ref._tracelog /*String*/ (null,"история чтение ошибка file="+_pendinghistoryfilename+" message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="payload = NormalizeNdjsonPayload(payload)";
_payload = __ref._normalizendjsonpayload /*String*/ (null,_payload);
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="If payload = \"\" Or batchDate = \"\" Then";
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
RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="DeleteHistoryPendingFile(pendingHistoryFileName)";
__ref._deletehistorypendingfile /*String*/ (null,_pendinghistoryfilename);
RDebugUtils.currentLine=16121873;
 //BA.debugLineNum = 16121873;BA.debugLine="isHistoryFlushInProgress = False";
__ref._ishistoryflushinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="LogSlowMainOperation(\"history_flush:empty\", star";
__ref._logslowmainoperation /*String*/ (null,"history_flush:empty",_startedat);
RDebugUtils.currentLine=16121875;
 //BA.debugLineNum = 16121875;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="Dim recordCount As Int = CountNdjsonRecords(paylo";
_recordcount = __ref._countndjsonrecords /*int*/ (null,_payload);
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="Dim queryParams As Map";
_queryparams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16121879;
 //BA.debugLineNum = 16121879;BA.debugLine="queryParams.Initialize";
_queryparams.Initialize();
RDebugUtils.currentLine=16121880;
 //BA.debugLineNum = 16121880;BA.debugLine="queryParams.Put(\"player\", playerCode)";
_queryparams.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=16121881;
 //BA.debugLineNum = 16121881;BA.debugLine="queryParams.Put(\"device\", deviceId)";
_queryparams.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="queryParams.Put(\"date\", batchDate)";
_queryparams.Put((Object)("date"),(Object)(_batchdate));
RDebugUtils.currentLine=16121883;
 //BA.debugLineNum = 16121883;BA.debugLine="Dim requestUrl As String = HISTORY_BASE_URL & \"?\"";
_requesturl = __ref._history_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,_queryparams);
RDebugUtils.currentLine=16121884;
 //BA.debugLineNum = 16121884;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=16121886;
 //BA.debugLineNum = 16121886;BA.debugLine="j.PostString(requestUrl, payload)";
_j._poststring /*String*/ (null,_requesturl,_payload);
RDebugUtils.currentLine=16121887;
 //BA.debugLineNum = 16121887;BA.debugLine="ApplyClientRequestHeaders(j)";
__ref._applyclientrequestheaders /*String*/ (null,_j);
RDebugUtils.currentLine=16121888;
 //BA.debugLineNum = 16121888;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (5000));
RDebugUtils.currentLine=16121889;
 //BA.debugLineNum = 16121889;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/plain; charset=utf-8");
RDebugUtils.currentLine=16121890;
 //BA.debugLineNum = 16121890;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "flushhistorybuffer"), (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 29;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=16121891;
 //BA.debugLineNum = 16121891;BA.debugLine="Dim success As Boolean = False";
_success = parent.__c.False;
RDebugUtils.currentLine=16121892;
 //BA.debugLineNum = 16121892;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16121893;
 //BA.debugLineNum = 16121893;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=16121894;
 //BA.debugLineNum = 16121894;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, True, res";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=16121895;
 //BA.debugLineNum = 16121895;BA.debugLine="success = IsHistoryBatchAccepted(responseText)";
_success = __ref._ishistorybatchaccepted /*boolean*/ (null,_responsetext);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=16121897;
 //BA.debugLineNum = 16121897;BA.debugLine="Dim failureKind As String = syncService.Classify";
_failurekind = __ref._syncservice /*b4j.example.networksyncservice*/ ._classifyhttpfailure /*String*/ (null,_j._errormessage /*String*/ );
RDebugUtils.currentLine=16121898;
 //BA.debugLineNum = 16121898;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, False, \"\"";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.False,"",_j._errormessage /*String*/ );
RDebugUtils.currentLine=16121899;
 //BA.debugLineNum = 16121899;BA.debugLine="LogHttpFailure(requestUrl, failureKind)";
__ref._loghttpfailure /*String*/ (null,_requesturl,_failurekind);
 if (true) break;
;
RDebugUtils.currentLine=16121901;
 //BA.debugLineNum = 16121901;BA.debugLine="If success Then";

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
RDebugUtils.currentLine=16121902;
 //BA.debugLineNum = 16121902;BA.debugLine="stateStore.SetLastHistoryOkNow";
__ref._statestore /*b4j.example.playerstatestore*/ ._setlasthistoryoknow /*String*/ (null);
RDebugUtils.currentLine=16121903;
 //BA.debugLineNum = 16121903;BA.debugLine="DeleteHistoryPendingFile(pendingHistoryFileName)";
__ref._deletehistorypendingfile /*String*/ (null,_pendinghistoryfilename);
RDebugUtils.currentLine=16121904;
 //BA.debugLineNum = 16121904;BA.debugLine="TraceInfo(\"history\", \"история отправлена\", \"reco";
__ref._traceinfo /*String*/ (null,"history","история отправлена","records="+BA.NumberToString(_recordcount));
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=16121906;
 //BA.debugLineNum = 16121906;BA.debugLine="TraceWarn(\"history\", \"история не отправлена\", \"r";
__ref._tracewarn /*String*/ (null,"history","история не отправлена","records="+BA.NumberToString(_recordcount));
 if (true) break;

case 39:
//C
this.state = -1;
;
RDebugUtils.currentLine=16121908;
 //BA.debugLineNum = 16121908;BA.debugLine="WriteHealthSnapshot(\"history\")";
__ref._writehealthsnapshot /*String*/ (null,"history");
RDebugUtils.currentLine=16121909;
 //BA.debugLineNum = 16121909;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16121910;
 //BA.debugLineNum = 16121910;BA.debugLine="isHistoryFlushInProgress = False";
__ref._ishistoryflushinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=16121911;
 //BA.debugLineNum = 16121911;BA.debugLine="LogSlowMainOperation(\"history_flush\", startedAt)";
__ref._logslowmainoperation /*String*/ (null,"history_flush",_startedat);
RDebugUtils.currentLine=16121912;
 //BA.debugLineNum = 16121912;BA.debugLine="Return success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=16121913;
 //BA.debugLineNum = 16121913;BA.debugLine="End Sub";
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
public String  _getoldestpendinghistoryfilename(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getoldestpendinghistoryfilename", false))
	 {return ((String) Debug.delegate(ba, "getoldestpendinghistoryfilename", null));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
anywheresoftware.b4a.objects.collections.List _historyfiles = null;
String _filename = "";
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub GetOldestPendingHistoryFileName As Str";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="If listedFiles.IsInitialized = False Or listedFil";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Dim historyFiles As List";
_historyfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="historyFiles.Initialize";
_historyfiles.Initialize();
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="If IsHistoryFileName(fileName) Then historyFiles";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)) { 
_historyfiles.Add((Object)(_filename));};
 }
};
RDebugUtils.currentLine=16908297;
 //BA.debugLineNum = 16908297;BA.debugLine="If historyFiles.Size = 0 Then Return \"\"";
if (_historyfiles.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=16908298;
 //BA.debugLineNum = 16908298;BA.debugLine="historyFiles.Sort(True)";
_historyfiles.Sort(__c.True);
RDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="Return historyFiles.Get(0)";
if (true) return BA.ObjectToString(_historyfiles.Get((int) (0)));
RDebugUtils.currentLine=16908300;
 //BA.debugLineNum = 16908300;BA.debugLine="End Sub";
return "";
}
public String  _historyfilenametodate(b4j.example.b4xmainpage __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historyfilenametodate", false))
	 {return ((String) Debug.delegate(ba, "historyfilenametodate", new Object[] {_filename}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Private Sub HistoryFileNameToDate(fileName As Stri";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="If IsHistoryFileName(fileName) = False Then Retur";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="Return fileName.SubString2(0, fileName.Length - 7";
if (true) return _filename.substring((int) (0),(int) (_filename.length()-7));
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="End Sub";
return "";
}
public String  _logslowmainoperation(b4j.example.b4xmainpage __ref,String _operationname,long _startedat) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "logslowmainoperation", false))
	 {return ((String) Debug.delegate(ba, "logslowmainoperation", new Object[] {_operationname,_startedat}));}
long _elapsed = 0L;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Private Sub LogSlowMainOperation(operationName As";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Dim elapsed As Long = DateTime.Now - startedAt";
_elapsed = (long) (__c.DateTime.getNow()-_startedat);
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="If elapsed < 50 Then Return";
if (_elapsed<50) { 
if (true) return "";};
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="TraceDebug(\"main slow op=\" & operationName & \" el";
__ref._tracedebug /*String*/ (null,"main slow op="+_operationname+" elapsedMs="+BA.NumberToString(_elapsed)+" flow="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="End Sub";
return "";
}
public boolean  _ishistorybatchaccepted(b4j.example.b4xmainpage __ref,String _responsetext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ishistorybatchaccepted", false))
	 {return ((Boolean) Debug.delegate(ba, "ishistorybatchaccepted", new Object[] {_responsetext}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _response = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub IsHistoryBatchAccepted(responseText As";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Try";
try {RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Dim response As Map = parser.NextObject";
_response = new anywheresoftware.b4a.objects.collections.Map();
_response = _parser.NextObject();
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="Return response.GetDefault(\"ok\", False) = True";
if (true) return (_response.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="TraceLog(\"история response parse ошибка\")";
__ref._tracelog /*String*/ (null,"история response parse ошибка");
 };
RDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=16777226;
 //BA.debugLineNum = 16777226;BA.debugLine="End Sub";
return false;
}
public String  _loghttpfailure(b4j.example.b4xmainpage __ref,String _url,String _kind) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "loghttpfailure", false))
	 {return ((String) Debug.delegate(ba, "loghttpfailure", new Object[] {_url,_kind}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub LogHttpFailure(url As String, kind As";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="syncService.LogHttpFailure(url, kind)";
__ref._syncservice /*b4j.example.networksyncservice*/ ._loghttpfailure /*String*/ (null,_url,_kind);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return "";
}
public String  _flushhistorybufferasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushhistorybufferasync", false))
	 {return ((String) Debug.delegate(ba, "flushhistorybufferasync", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub FlushHistoryBufferAsync";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="CallSubDelayed(Me, \"RunHistoryFlushAsync\")";
__c.CallSubDelayed(ba,this,"RunHistoryFlushAsync");
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public String  _formathistorydate(b4j.example.b4xmainpage __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formathistorydate", false))
	 {return ((String) Debug.delegate(ba, "formathistorydate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub FormatHistoryDate(ticks As Long) As St";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=16252934;
 //BA.debugLineNum = 16252934;BA.debugLine="End Sub";
return "";
}
public String  _formathistorytime(b4j.example.b4xmainpage __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formathistorytime", false))
	 {return ((String) Debug.delegate(ba, "formathistorytime", new Object[] {_ticks}));}
String _previoustimeformat = "";
String _value = "";
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub FormatHistoryTime(ticks As Long) As St";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="Dim value As String = DateTime.Time(ticks)";
_value = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="End Sub";
return "";
}
public String  _formattimestampfortrace(b4j.example.b4xmainpage __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formattimestampfortrace", false))
	 {return ((String) Debug.delegate(ba, "formattimestampfortrace", new Object[] {_targettimestamp}));}
String _previousdateformat = "";
String _previoustimeformat = "";
long _targetticks = 0L;
String _value = "";
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub FormatTimestampForTrace(targetTimestam";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = __ref._localtimestamptoticks /*long*/ (null,_targettimestamp);
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="Dim value As String = DateTime.Date(targetTicks)";
_value = __c.DateTime.Date(_targetticks)+" "+__c.DateTime.Time(_targetticks);
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="End Sub";
return "";
}
public long  _localtimestamptoticks(b4j.example.b4xmainpage __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localtimestamptoticks", false))
	 {return ((Long) Debug.delegate(ba, "localtimestamptoticks", new Object[] {_targettimestamp}));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(__ref._timezoneoffsetminutes /*int*/ (null)*60))*1000);
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="End Sub";
return 0L;
}
public String  _getinactiveaudiokey(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getinactiveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "getinactiveaudiokey", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub GetInactiveAudioKey As String";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Return transitionCoordinator.GetInactiveAudioKey(";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._getinactiveaudiokey /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ );
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _getorcreatedeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getorcreatedeviceid", false))
	 {return ((String) Debug.delegate(ba, "getorcreatedeviceid", null));}
String _id = "";
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub GetOrCreateDeviceId As String";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Dim id As String = storage.GetDefault(\"device_id\"";
_id = BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"device_id",(Object)("")));
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="If id <> \"\" Then Return id";
if ((_id).equals("") == false) { 
if (true) return _id;};
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="id = CreateRandomDeviceId";
_id = __ref._createrandomdeviceid /*String*/ (null);
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="SaveValue(\"device_id\", id)";
__ref._savevalue /*String*/ (null,"device_id",(Object)(_id));
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="End Sub";
return "";
}
public String  _savevalue(b4j.example.b4xmainpage __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savevalue", false))
	 {return ((String) Debug.delegate(ba, "savevalue", new Object[] {_key,_value}));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Private Sub SaveValue(key As String, value As Obje";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="storage.Put(key, value)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_key,_value);
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="End Sub";
return "";
}
public int  _getpendinghistoryfilecount(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getpendinghistoryfilecount", false))
	 {return ((Integer) Debug.delegate(ba, "getpendinghistoryfilecount", null));}
int _storedcount = 0;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub GetPendingHistoryFileCount As Int";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim storedCount As Int = storage.GetDefault(\"pend";
_storedcount = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"pending_history_count",(Object)(-1))));
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="If storedCount >= 0 Then Return storedCount";
if (_storedcount>=0) { 
if (true) return _storedcount;};
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="RefreshPendingHistoryState";
__ref._refreshpendinghistorystate /*String*/ (null);
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Return Max(0, storage.GetDefault(\"pending_history";
if (true) return (int) (__c.Max(0,(double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"pending_history_count",(Object)(0))))));
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="End Sub";
return 0;
}
public String  _refreshpendinghistorystate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshpendinghistorystate", false))
	 {return ((String) Debug.delegate(ba, "refreshpendinghistorystate", null));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub RefreshPendingHistoryState";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="storage.Put(\"pending_history_count\", CountAllPend";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"pending_history_count",(Object)(__ref._countallpendinghistoryrecords /*int*/ (null)));
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getservertracelist", null));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Return appTraceService.GetServerTraceList";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._getservertracelist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Return appTraceService.GetServerTraceText";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._getservertracetext /*String*/ (null);
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettraceloglist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettraceloglist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettraceloglist", null));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub GetTraceLogList As List";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Return appTraceService.GetTraceList";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._gettracelist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="End Sub";
return null;
}
public String  _gettracelogtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettracelogtext", false))
	 {return ((String) Debug.delegate(ba, "gettracelogtext", null));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub GetTraceLogText As String";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Return appTraceService.GetTraceText";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._gettracetext /*String*/ (null);
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handleaudiocomplete(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudiocomplete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handleaudiocomplete", new Object[] {_audiokey}));}
ResumableSub_HandleAudioComplete rsub = new ResumableSub_HandleAudioComplete(this,__ref,_audiokey);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleAudioComplete extends BA.ResumableSub {
public ResumableSub_HandleAudioComplete(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
long _startedat = 0L;
String _activeaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
boolean _dispatched = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="If CanAdvancePlaybackNow(\"audio_complete:\" & audi";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canadvanceplaybacknow /*boolean*/ (null,"audio_complete:"+_audiokey,parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = __ref._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="If audioKey <> activeAudioKey Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_audiokey).equals(_activeaudiokey) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="TraceWarn(\"playback\", \"audio complete пропущен\",";
__ref._tracewarn /*String*/ (null,"playback","audio complete пропущен","reason=inactive_audio audio="+_audiokey+" active="+_activeaudiokey);
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="SetPlaybackFlowState(FLOW_TRANSITIONING, \"audio_c";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_transitioning /*String*/ ,"audio_complete:"+_audiokey);
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="If activeItem.IsInitialized Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_activeitem.IsInitialized()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="TraceInfo(\"audio\", \"плеер complete\", \"player=\" &";
__ref._traceinfo /*String*/ (null,"audio","плеер complete","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_activeitem)+" id="+__ref._tracetrackvalue /*String*/ (null,_activeitem));
RDebugUtils.currentLine=18874380;
 //BA.debugLineNum = 18874380;BA.debugLine="TraceInfo(\"playback\", \"смена трека\", \"trackId=\"";
__ref._traceinfo /*String*/ (null,"playback","смена трека","trackId="+__ref._tracetrackvalue /*String*/ (null,_activeitem));
 if (true) break;
;
RDebugUtils.currentLine=18874382;
 //BA.debugLineNum = 18874382;BA.debugLine="If activeItem.GetDefault(\"type\", \"\") = \"ad\" Then";

case 14:
//if
this.state = 17;
if ((_activeitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="QueueHistoryRecordAt(activeItem, metaState.Histo";
__ref._queuehistoryrecordat /*String*/ (null,_activeitem,__ref._metastate /*b4j.example.playbackmetastate*/ ._historystartedatticks /*long*/ );
RDebugUtils.currentLine=18874384;
 //BA.debugLineNum = 18874384;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=18874386;
 //BA.debugLineNum = 18874386;BA.debugLine="If ShouldApplyPendingAppUpdateBeforeNextTrack The";

case 17:
//if
this.state = 20;
if (__ref._shouldapplypendingappupdatebeforenexttrack /*boolean*/ (null)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=18874387;
 //BA.debugLineNum = 18874387;BA.debugLine="TraceInfo(\"update\", \"применение обновления\", \"re";
__ref._traceinfo /*String*/ (null,"update","применение обновления","reason=track_boundary_before_next_track target="+BA.NumberToString(__ref._downloadedappupdateversion /*int*/ ));
RDebugUtils.currentLine=18874388;
 //BA.debugLineNum = 18874388;BA.debugLine="ShowMessage(MessageValue(\"player_reloading\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_reloading"));
RDebugUtils.currentLine=18874389;
 //BA.debugLineNum = 18874389;BA.debugLine="Return PlatformBridge.RequestStagedUpdateApply(a";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent._platformbridge._requeststagedupdateapply /*boolean*/ (__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ )));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=18874391;
 //BA.debugLineNum = 18874391;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"audio_compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiocomplete"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_complete:"+_audiokey,parent.__c.True));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=18874392;
 //BA.debugLineNum = 18874392;BA.debugLine="LogSlowMainOperation(\"audio_complete:\" & audioKey";
__ref._logslowmainoperation /*String*/ (null,"audio_complete:"+_audiokey,_startedat);
RDebugUtils.currentLine=18874393;
 //BA.debugLineNum = 18874393;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
RDebugUtils.currentLine=18874394;
 //BA.debugLineNum = 18874394;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _shouldapplypendingappupdatebeforenexttrack(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldapplypendingappupdatebeforenexttrack", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldapplypendingappupdatebeforenexttrack", null));}
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub ShouldApplyPendingAppUpdateBeforeNextT";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If downloadedAppUpdateVersion <= Main.VersionCode";
if (__ref._downloadedappupdateversion /*int*/ <=_main._versioncode /*int*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="If PlatformBridge.IsStagedUpdateReady(appUpdateDi";
if (_platformbridge._isstagedupdateready /*boolean*/ (__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ )==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="If PlatformBridge.IsHostedRuntime = False Then Re";
if (_platformbridge._ishostedruntime /*boolean*/ ()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Dim nextItem As Map = ResolveNextPlaybackBoundary";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = __ref._resolvenextplaybackboundaryitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="If nextItem.IsInitialized = False Or nextItem.Siz";
if (_nextitem.IsInitialized()==__c.False || _nextitem.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Return nextItem.GetDefault(\"type\", \"\") = \"track\"";
if (true) return (_nextitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track"));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handleaudioerror(b4j.example.b4xmainpage __ref,String _audiokey,String _message) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudioerror", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handleaudioerror", new Object[] {_audiokey,_message}));}
ResumableSub_HandleAudioError rsub = new ResumableSub_HandleAudioError(this,__ref,_audiokey,_message);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleAudioError extends BA.ResumableSub {
public ResumableSub_HandleAudioError(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey,String _message) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this._message = _message;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
String _message;
anywheresoftware.b4a.objects.collections.Map _erroritem = null;
anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
boolean _unused = false;
boolean _unusedrecovery = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim errorItem As Map = Transition_GetDirectorActi";
_erroritem = new anywheresoftware.b4a.objects.collections.Map();
_erroritem = __ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Dim pendingPlayItem As Map = Transition_GetDirect";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingplayitem = __ref._transition_getdirectorpendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_audiokey);
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Dim pendingPrepareItem As Map = Transition_GetDir";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
_pendingprepareitem = __ref._transition_getdirectorpendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ (null,_audiokey);
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="If pendingPlayItem.Size > 0 Then errorItem = pend";
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
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="If pendingPrepareItem.Size > 0 Then errorItem = p";
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
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="TraceError(\"audio\", \"плеер error\", \"player=\" & Tr";
__ref._traceerror /*String*/ (null,"audio","плеер error","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_erroritem)+" id="+__ref._tracetrackvalue /*String*/ (null,_erroritem)+" message="+_message);
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="WriteHealthSnapshot(\"ошибка_audio\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_audio");
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="SetPlaybackFlowState(FLOW_ERROR, \"audio_error:\" &";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_error /*String*/ ,"audio_error:"+_audiokey);
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="If pendingPlayItem.Size > 0 Then";
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
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="If pendingPrepareItem.Size > 0 Then";

case 16:
//if
this.state = 19;
if (_pendingprepareitem.getSize()>0) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="If audioKey <> Transition_GetDirectorActiveAudioK";

case 19:
//if
this.state = 24;
if ((_audiokey).equals(__ref._transition_getdirectoractiveaudiokey /*String*/ (null)) == false) { 
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
RDebugUtils.currentLine=18808850;
 //BA.debugLineNum = 18808850;BA.debugLine="consecutiveAudioOutputErrors = consecutiveAudioOu";
__ref._consecutiveaudiooutputerrors /*int*/  = (int) (__ref._consecutiveaudiooutputerrors /*int*/ +1);
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="If consecutiveAudioOutputErrors >= AUDIO_OUTPUT_E";
if (true) break;

case 25:
//if
this.state = 28;
if (__ref._consecutiveaudiooutputerrors /*int*/ >=__ref._audio_output_error_pause_threshold /*int*/ ) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="EnterAudioOutputRecoveryPause(MessageValue(\"audi";
__ref._enteraudiooutputrecoverypause /*String*/ (null,__ref._messagevalue /*String*/ (null,"audio_device_check"));
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=18808855;
 //BA.debugLineNum = 18808855;BA.debugLine="If CanAdvancePlaybackNow(\"audio_error:\" & audioKe";

case 28:
//if
this.state = 33;
if (__ref._canadvanceplaybacknow /*boolean*/ (null,"audio_error:"+_audiokey,parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=18808856;
 //BA.debugLineNum = 18808856;BA.debugLine="Wait For (HandleMediaError) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerror"), __ref._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 38;
return;
case 38:
//C
this.state = 34;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=18808857;
 //BA.debugLineNum = 18808857;BA.debugLine="If dataPolicyState.HasLocalMediaFallback And orch";
if (true) break;

case 34:
//if
this.state = 37;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._haslocalmediafallback /*boolean*/  && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=18808858;
 //BA.debugLineNum = 18808858;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"audio_erro";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerror"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_error_recovery:"+_audiokey,parent.__c.True));
this.state = 39;
return;
case 39:
//C
this.state = 37;
_unusedrecovery = (boolean) result[1];
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=18808860;
 //BA.debugLineNum = 18808860;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=18808861;
 //BA.debugLineNum = 18808861;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _traceerror(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceerror", false))
	 {return ((String) Debug.delegate(ba, "traceerror", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub TraceError(category As String, message";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="traceRouter.TraceError(category, message, details";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._traceerror /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlemediaerror(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlemediaerror", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handlemediaerror", null));}
ResumableSub_HandleMediaError rsub = new ResumableSub_HandleMediaError(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleMediaError extends BA.ResumableSub {
public ResumableSub_HandleMediaError(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _handled = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Wait For (playerDataCoordinator.HandleMediaError)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlemediaerror"), __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_handled = (boolean) result[1];
;
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Return handled";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_handled));return;};
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handleaudiotimeupdate(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudiotimeupdate", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handleaudiotimeupdate", new Object[] {_audiokey}));}
ResumableSub_HandleAudioTimeupdate rsub = new ResumableSub_HandleAudioTimeupdate(this,__ref,_audiokey);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleAudioTimeupdate extends BA.ResumableSub {
public ResumableSub_HandleAudioTimeupdate(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
b4j.example.playbackplayerslot _activeslot = null;
anywheresoftware.b4a.objects.collections.Map _activeitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="If audioKey <> Transition_GetDirectorActiveAudioK";
if (true) break;

case 1:
//if
this.state = 6;
if ((_audiokey).equals(__ref._transition_getdirectoractiveaudiokey /*String*/ (null)) == false) { 
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
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._isplaybackflowactive /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorSt";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getslotbyaudiokey /*b4j.example.playbackplayerslot*/ (null,_audiokey);
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="If activeSlot.IsInitialized Then activeSlot.MarkP";
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
_activeslot._markprogress /*String*/ (null);
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="If metaState.PendingHistoryItem.IsInitialized The";
if (true) break;

case 19:
//if
this.state = 26;
if (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAc";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=18939911;
 //BA.debugLineNum = 18939911;BA.debugLine="If metaState.PendingHistoryItem.GetDefault(\"type";
if (true) break;

case 22:
//if
this.state = 25;
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) && (__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediaurl /*String*/ ).equals("") == false && (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))).equals(_activeitem.GetDefault((Object)("id"),(Object)(""))) && (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals(_activeitem.GetDefault((Object)("type"),(Object)("")))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="ConfirmPendingHistoryItem(\"timeupdate\")";
__ref._confirmpendinghistoryitem /*boolean*/ (null,"timeupdate");
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
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleblockedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleblockedstate", false))
	 {return ((String) Debug.delegate(ba, "handleblockedstate", null));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub HandleBlockedState";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="playerDataCoordinator.HandleBlockedState";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._handleblockedstate /*String*/ (null);
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _handlefetchfailure(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlefetchfailure", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "handlefetchfailure", new Object[] {_result}));}
ResumableSub_HandleFetchFailure rsub = new ResumableSub_HandleFetchFailure(this,__ref,_result);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_HandleFetchFailure extends BA.ResumableSub {
public ResumableSub_HandleFetchFailure(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _result) {
this.parent = parent;
this.__ref = __ref;
this._result = _result;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result;
boolean _handled = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Wait For (playerDataCoordinator.HandleFetchFailur";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlefetchfailure"), __ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._handlefetchfailure /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_result));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_handled = (boolean) result[1];
;
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Return handled";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_handled));return;};
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handleheaderactioninput(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleheaderactioninput", false))
	 {return ((String) Debug.delegate(ba, "handleheaderactioninput", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub HandleHeaderActionInput";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="If DateTime.Now - lastHeaderActionInputAt < 250 T";
if (__c.DateTime.getNow()-__ref._lastheaderactioninputat /*long*/ <250) { 
if (true) return "";};
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="lastHeaderActionInputAt = DateTime.Now";
__ref._lastheaderactioninputat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="ShowSettingsScreen";
__ref._showsettingsscreen /*String*/ (null);
 }else 
{RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="Else If appScreenMode = \"settings\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="ShowPlayerScreen(False)";
__ref._showplayerscreen /*String*/ (null,__c.False);
 }}
;
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="End Sub";
return "";
}
public String  _showsettingsscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsettingsscreen", false))
	 {return ((String) Debug.delegate(ba, "showsettingsscreen", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub ShowSettingsScreen";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="appScreenMode = \"settings\"";
__ref._appscreenmode /*String*/  = "settings";
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="ConfigureSetupScreen(\"settings\", \"\")";
__ref._configuresetupscreen /*String*/ (null,"settings","");
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="End Sub";
return "";
}
public String  _showplayerscreen(b4j.example.b4xmainpage __ref,boolean _refreshinfo) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showplayerscreen", false))
	 {return ((String) Debug.delegate(ba, "showplayerscreen", new Object[] {_refreshinfo}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub ShowPlayerScreen(refreshInfo As Boolea";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="appScreenMode = \"player\"";
__ref._appscreenmode /*String*/  = "player";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="ConfigurePlayerHeader";
__ref._configureplayerheader /*String*/ (null);
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="If orchestrationState.IsStarted = False And dataP";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False && __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ==__c.False && __ref._isstartupsequenceinprogress /*boolean*/ ==__c.False) { 
__ref._applystoppedstate /*String*/ (null);};
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="If refreshInfo = False Then Return";
if (_refreshinfo==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="RefreshPlayerHeaderFromCurrentData";
__ref._refreshplayerheaderfromcurrentdata /*String*/ (null);
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showclaimprompt", false))
	 {return ((String) Debug.delegate(ba, "showclaimprompt", new Object[] {_text}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub ShowClaimPrompt(text As String)";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="uiController.ShowClaimPrompt(text)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._showclaimprompt /*String*/ (null,_text);
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="End Sub";
return "";
}
public String  _handleshutdownmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleshutdownmessage", false))
	 {return ((String) Debug.delegate(ba, "handleshutdownmessage", new Object[] {_text}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub HandleShutdownMessage(text As String)";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="playerDataCoordinator.HandleShutdownMessage(text)";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._handleshutdownmessage /*String*/ (null,_text);
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="playerDataCoordinator.StopForMissingData(text)";
__ref._playerdatacoordinator /*b4j.example.playbackdatacoordinator*/ ._stopformissingdata /*String*/ (null,_text);
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return "";
}
public void  _handleplaybuttoninput(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleplaybuttoninput", false))
	 {Debug.delegate(ba, "handleplaybuttoninput", null); return;}
ResumableSub_HandlePlayButtonInput rsub = new ResumableSub_HandlePlayButtonInput(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_HandlePlayButtonInput extends BA.ResumableSub {
public ResumableSub_HandlePlayButtonInput(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If DateTime.Now - lastPlayButtonInputAt < 250 The";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.DateTime.getNow()-__ref._lastplaybuttoninputat /*long*/ <250) { 
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
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="lastPlayButtonInputAt = DateTime.Now";
__ref._lastplaybuttoninputat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="lastUserPlaybackInputAt = DateTime.Now";
__ref._lastuserplaybackinputat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If playerCode = \"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((__ref._playercode /*String*/ ).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="ShowSetupScreen(MessageValue(\"player_required\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_required"));
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="If orchestrationState.IsStarted = False And IsPol";

case 10:
//if
this.state = 20;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False && __ref._ispolicypausestate /*boolean*/ (null)==parent.__c.False && __ref._isuserstoppedstate /*boolean*/ (null)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="If orchestrationState.IsStopping Then";
if (true) break;

case 13:
//if
this.state = 16;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="TraceLog(\"возобновление запрет reason=manual_st";
__ref._tracelog /*String*/ (null,"возобновление запрет reason=manual_start state=stopping");
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";

case 16:
//if
this.state = 19;
if (__ref._isplaybackallowedbycurrentdata /*boolean*/ (null)==parent.__c.False) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReaso";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null)),"server");
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=5701649;
 //BA.debugLineNum = 5701649;BA.debugLine="TraceLog(\"возобновление итог mode=manual_start\")";
__ref._tracelog /*String*/ (null,"возобновление итог mode=manual_start");
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=5701651;
 //BA.debugLineNum = 5701651;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=5701652;
 //BA.debugLineNum = 5701652;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=5701653;
 //BA.debugLineNum = 5701653;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=5701654;
 //BA.debugLineNum = 5701654;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleplaybuttoninput"),(int) (0));
this.state = 26;
return;
case 26:
//C
this.state = 20;
;
RDebugUtils.currentLine=5701655;
 //BA.debugLineNum = 5701655;BA.debugLine="CallSubDelayed(Me, \"StartFirstTrackManualAsync\")";
parent.__c.CallSubDelayed(ba,parent,"StartFirstTrackManualAsync");
RDebugUtils.currentLine=5701656;
 //BA.debugLineNum = 5701656;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=5701658;
 //BA.debugLineNum = 5701658;BA.debugLine="If CanStopPlaybackNow(True) = False Then Return";

case 20:
//if
this.state = 25;
if (__ref._canstopplaybacknow /*boolean*/ (null,parent.__c.True)==parent.__c.False) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
if (true) return ;
if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=5701659;
 //BA.debugLineNum = 5701659;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleplaybuttoninput"),(int) (0));
this.state = 27;
return;
case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=5701660;
 //BA.debugLineNum = 5701660;BA.debugLine="CallSubDelayed(Me, \"StopPlayerAsync\")";
parent.__c.CallSubDelayed(ba,parent,"StopPlayerAsync");
RDebugUtils.currentLine=5701661;
 //BA.debugLineNum = 5701661;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _showsetupscreen(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsetupscreen", false))
	 {return ((String) Debug.delegate(ba, "showsetupscreen", new Object[] {_text}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub ShowSetupScreen(text As String)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="appScreenMode = \"setup\"";
__ref._appscreenmode /*String*/  = "setup";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="uiController.SetStatusText(\"\")";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="uiController.RenderPlayerHead(\"\", \"\")";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._renderplayerhead /*String*/ (null,"","");
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="ConfigureSetupScreen(\"setup\", text)";
__ref._configuresetupscreen /*String*/ (null,"setup",_text);
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="If txtPlayerCode.IsInitialized Then txtPlayerCode";
if (__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .IsInitialized()) { 
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();};
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="End Sub";
return "";
}
public boolean  _hasdispatchablequeueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hasdispatchablequeueitem", false))
	 {return ((Boolean) Debug.delegate(ba, "hasdispatchablequeueitem", null));}
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _itemtype = "";
long _breakat = 0L;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Private Sub HasDispatchableQueueItem As Boolean";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="For i = 0 To playQueue.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i);
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="If itemType = \"break\" Then";
if ((_itemtype).equals("break")) { 
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="Dim breakAt As Long = ToLongDefault(item.GetDef";
_breakat = __ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=23199753;
 //BA.debugLineNum = 23199753;BA.debugLine="If breakAt > LocalNowTimestamp Then Continue";
if (_breakat>__ref._localnowtimestamp /*long*/ (null)) { 
if (true) continue;};
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=23199756;
 //BA.debugLineNum = 23199756;BA.debugLine="If itemType = \"track\" And mediaCacheService.IsTr";
if ((_itemtype).equals("track") && __ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return __c.True;};
RDebugUtils.currentLine=23199757;
 //BA.debugLineNum = 23199757;BA.debugLine="If itemType = \"ad\" And mediaCacheService.IsAdCac";
if ((_itemtype).equals("ad") && __ref._mediacacheservice /*b4j.example.mediacache*/ ._isadcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=23199759;
 //BA.debugLineNum = 23199759;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=23199760;
 //BA.debugLineNum = 23199760;BA.debugLine="End Sub";
return false;
}
public boolean  _hasobservableactiveplayback(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hasobservableactiveplayback", false))
	 {return ((Boolean) Debug.delegate(ba, "hasobservableactiveplayback", null));}
b4j.example.playbackplayerslot _activeslot = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub HasObservableActivePlayback As Boolean";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="If directorState.IsInitialized Then";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim activeSlot As PlaybackPlayerSlot = directorS";
_activeslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getactiveslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="If activeSlot.IsInitialized = False Then Return";
if (_activeslot.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="If activeSlot.HasItem = False Then Return False";
if (_activeslot._hasitem /*boolean*/ (null)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="If activeSlot.AudioKey = \"\" Then Return False";
if ((_activeslot._audiokey /*String*/ ).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Return GetAudioByKey(activeSlot.AudioKey).IsPlay";
if (true) return __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeslot._audiokey /*String*/ )._isplaying /*boolean*/ (null);
 };
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="End Sub";
return false;
}
public boolean  _haspendingexactbreak(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haspendingexactbreak", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingexactbreak", null));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub HasPendingExactBreak As Boolean";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Return scheduledBreakAt > LocalNowTimestamp";
if (true) return __ref._scheduledbreakat /*long*/ >__ref._localnowtimestamp /*long*/ (null);
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return false;
}
public String  _headeractionpane_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_click", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub HeaderActionPane_Click";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="HandleHeaderActionInput";
__ref._handleheaderactioninput /*String*/ (null);
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseclicked(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub HeaderActionPane_MouseClicked (eventDa";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="HandleHeaderActionInput";
__ref._handleheaderactioninput /*String*/ (null);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub HeaderActionPane_MouseEntered (eventDa";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="UpdateHeaderActionAppearance(True)";
__ref._updateheaderactionappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub HeaderActionPane_MouseExited (eventDat";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public String  _historyflushtimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historyflushtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "historyflushtimer_tick", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub HistoryFlushTimer_Tick";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="If playerCode = \"\" Then Return";
if ((__ref._playercode /*String*/ ).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If GetPendingHistoryFileCount <= 0 Then Return";
if (__ref._getpendinghistoryfilecount /*int*/ (null)<=0) { 
if (true) return "";};
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="If isHistoryFlushInProgress Then Return";
if (__ref._ishistoryflushinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="If ShouldDeferHistoryFlushForPlaybackUi Then Retu";
if (__ref._shoulddeferhistoryflushforplaybackui /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="FlushHistoryBufferAsync";
__ref._flushhistorybufferasync /*String*/ (null);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="End Sub";
return "";
}
public boolean  _shoulddeferhistoryflushforplaybackui(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shoulddeferhistoryflushforplaybackui", false))
	 {return ((Boolean) Debug.delegate(ba, "shoulddeferhistoryflushforplaybackui", null));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub ShouldDeferHistoryFlushForPlaybackUi A";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="If DateTime.Now - lastUserPlaybackInputAt < 1500";
if (__c.DateTime.getNow()-__ref._lastuserplaybackinputat /*long*/ <1500) { 
if (true) return __c.True;};
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="If playbackFlowState = FLOW_STARTING Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_starting /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="If playbackFlowState = FLOW_TRANSITIONING Then Re";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_transitioning /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="End Sub";
return "";
}
public String  _migratelegacystorageifneeded(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "migratelegacystorageifneeded", false))
	 {return ((String) Debug.delegate(ba, "migratelegacystorageifneeded", null));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _legacy = null;
String _key = "";
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Private Sub MigrateLegacyStorageIfNeeded";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="If File.Exists(storageDir, storageFile) = False T";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ )==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Try";
try {RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="parser.Initialize(File.ReadString(storageDir, st";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ ));
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="Dim legacy As Map = parser.NextObject";
_legacy = new anywheresoftware.b4a.objects.collections.Map();
_legacy = _parser.NextObject();
RDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="If legacy.IsInitialized Then";
if (_legacy.IsInitialized()) { 
RDebugUtils.currentLine=24051719;
 //BA.debugLineNum = 24051719;BA.debugLine="For Each key As String In legacy.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _legacy.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="storage.Put(key, legacy.Get(key))";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_key,_legacy.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="TraceLog(\"legacy migrate итог target=kvs\")";
__ref._tracelog /*String*/ (null,"legacy migrate итог target=kvs");
RDebugUtils.currentLine=24051723;
 //BA.debugLineNum = 24051723;BA.debugLine="File.Delete(storageDir, storageFile)";
__c.File.Delete(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ );
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=24051726;
 //BA.debugLineNum = 24051726;BA.debugLine="TraceLog(\"legacy migrate ошибка message=\" & Last";
__ref._tracelog /*String*/ (null,"legacy migrate ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=24051728;
 //BA.debugLineNum = 24051728;BA.debugLine="End Sub";
return "";
}
public String  _normalizeplayercode(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeplayercode", false))
	 {return ((String) Debug.delegate(ba, "normalizeplayercode", new Object[] {_value}));}
String _code = "";
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Private Sub NormalizePlayerCode(value As String) A";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Dim code As String = value.Trim.ToLowerCase";
_code = _value.trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="If Regex.IsMatch(\"^[a-z0-9]{5}$\", code) Then Retu";
if (__c.Regex.IsMatch("^[a-z0-9]{5}$",_code)) { 
if (true) return _code;};
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="End Sub";
return "";
}
public boolean  _isreleasebuild(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isreleasebuild", false))
	 {return ((Boolean) Debug.delegate(ba, "isreleasebuild", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub IsReleaseBuild As Boolean";
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return false;
}
public String  _resolvemachineguidasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvemachineguidasync", false))
	 {return ((String) Debug.delegate(ba, "resolvemachineguidasync", null));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub ResolveMachineGuidAsync";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Try";
try {RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="machineGuidShell.Initialize(\"MachineGuidShell\",";
__ref._machineguidshell /*anywheresoftware.b4j.objects.Shell*/ .Initialize("MachineGuidShell","reg",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"query","HKLM\\SOFTWARE\\Microsoft\\Cryptography","/v","MachineGuid"}));
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="machineGuidShell.Run(-1)";
__ref._machineguidshell /*anywheresoftware.b4j.objects.Shell*/ .Run(ba,(long) (-1));
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="TraceLog(\"machine guid чтение начало\")";
__ref._tracelog /*String*/ (null,"machine guid чтение начало");
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=23855110;
 //BA.debugLineNum = 23855110;BA.debugLine="TraceLog(\"machine guid чтение ошибка message=\" &";
__ref._tracelog /*String*/ (null,"machine guid чтение ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="End Sub";
return "";
}
public String  _isplaybackrunningfortrace(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackrunningfortrace", false))
	 {return ((String) Debug.delegate(ba, "isplaybackrunningfortrace", null));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub IsPlaybackRunningForTrace As String";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
if (true) return "false";};
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if ((__ref._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("")) { 
if (true) return "false";};
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="Return \"true\"";
if (true) return "true";
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="End Sub";
return "";
}
public boolean  _isplaybackstallalreadyrecovered(b4j.example.b4xmainpage __ref,String _expectedtrackid,long _expectedpositionms,long _expectedactivationtoken) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackstallalreadyrecovered", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackstallalreadyrecovered", new Object[] {_expectedtrackid,_expectedpositionms,_expectedactivationtoken}));}
String _currenttrackid = "";
long _currentpositionms = 0L;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub IsPlaybackStallAlreadyRecovered(expect";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/  || __ref._ispolicypausestate /*boolean*/ (null)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="If expectedActivationToken <> playbackActivationT";
if (_expectedactivationtoken!=__ref._playbackactivationtoken /*long*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="If HasObservableActivePlayback = False Then Retur";
if (__ref._hasobservableactiveplayback /*boolean*/ (null)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="Dim currentTrackId As String = ActiveTrackIdForWa";
_currenttrackid = __ref._activetrackidforwatchdog /*String*/ (null);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Dim currentPositionMs As Long = ActivePlaybackPos";
_currentpositionms = __ref._activeplaybackpositionms /*long*/ (null);
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="If currentTrackId <> \"\" And currentTrackId <> exp";
if ((_currenttrackid).equals("") == false && (_currenttrackid).equals(_expectedtrackid) == false) { 
if (true) return __c.True;};
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="If currentPositionMs >= 0 And expectedPositionMs";
if (_currentpositionms>=0 && _expectedpositionms<0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="If currentPositionMs >= 0 And currentPositionMs >";
if (_currentpositionms>=0 && _currentpositionms>_expectedpositionms+__ref._playback_watchdog_progress_delta_ms /*long*/ ) { 
if (true) return __c.True;};
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="End Sub";
return false;
}
public int  _scalevalue(b4j.example.b4xmainpage __ref,int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Private Sub ScaleValue(availableWidth As Int, smal";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Return UiStyle.ScaleValue(availableWidth, smallVa";
if (true) return _uistyle._scalevalue /*int*/ (_availablewidth,_smallvalue,_mediumvalue,_largevalue);
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="End Sub";
return 0;
}
public String  _updateresponsivestyles(b4j.example.b4xmainpage __ref,int _availablewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateresponsivestyles", false))
	 {return ((String) Debug.delegate(ba, "updateresponsivestyles", new Object[] {_availablewidth}));}
boolean _small = false;
boolean _medium = false;
float _streamfontsize = 0f;
float _infofontsize = 0f;
float _playfontsize = 0f;
float _stopfontsize = 0f;
float _headeractionsize = 0f;
float _codesize = 0f;
int _cardradius = 0;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub UpdateResponsiveStyles(availableWidth";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim small As Boolean = availableWidth <= 420dip";
_small = _availablewidth<=__c.DipToCurrent((int) (420));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim medium As Boolean = availableWidth <= 720dip";
_medium = _availablewidth<=__c.DipToCurrent((int) (720));
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim streamFontSize As Float";
_streamfontsize = 0f;
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim infoFontSize As Float";
_infofontsize = 0f;
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Dim playFontSize As Float";
_playfontsize = 0f;
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim stopFontSize As Float";
_stopfontsize = 0f;
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Dim headerActionSize As Float";
_headeractionsize = 0f;
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Dim codeSize As Float";
_codesize = 0f;
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Dim cardRadius As Int";
_cardradius = 0;
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="If small Then";
if (_small) { 
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="streamFontSize = 28";
_streamfontsize = (float) (28);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="infoFontSize = 16";
_infofontsize = (float) (16);
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="playFontSize = 60";
_playfontsize = (float) (60);
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="stopFontSize = 56";
_stopfontsize = (float) (56);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="headerActionSize = 24";
_headeractionsize = (float) (24);
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="codeSize = 31";
_codesize = (float) (31);
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="cardRadius = 16dip";
_cardradius = __c.DipToCurrent((int) (16));
 }else 
{RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="Else If medium Then";
if (_medium) { 
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="streamFontSize = 32";
_streamfontsize = (float) (32);
RDebugUtils.currentLine=2490389;
 //BA.debugLineNum = 2490389;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="playFontSize = 68";
_playfontsize = (float) (68);
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="stopFontSize = 62";
_stopfontsize = (float) (62);
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="headerActionSize = 26";
_headeractionsize = (float) (26);
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="codeSize = 35";
_codesize = (float) (35);
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="cardRadius = 20dip";
_cardradius = __c.DipToCurrent((int) (20));
 }else {
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="streamFontSize = 38";
_streamfontsize = (float) (38);
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
RDebugUtils.currentLine=2490398;
 //BA.debugLineNum = 2490398;BA.debugLine="playFontSize = 74";
_playfontsize = (float) (74);
RDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="stopFontSize = 68";
_stopfontsize = (float) (68);
RDebugUtils.currentLine=2490400;
 //BA.debugLineNum = 2490400;BA.debugLine="headerActionSize = 28";
_headeractionsize = (float) (28);
RDebugUtils.currentLine=2490401;
 //BA.debugLineNum = 2490401;BA.debugLine="codeSize = 38";
_codesize = (float) (38);
RDebugUtils.currentLine=2490402;
 //BA.debugLineNum = 2490402;BA.debugLine="cardRadius = 24dip";
_cardradius = __c.DipToCurrent((int) (24));
 }}
;
RDebugUtils.currentLine=2490405;
 //BA.debugLineNum = 2490405;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_streamfontsize));
RDebugUtils.currentLine=2490406;
 //BA.debugLineNum = 2490406;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(_infofontsize));
RDebugUtils.currentLine=2490407;
 //BA.debugLineNum = 2490407;BA.debugLine="lblHeader.Font = xui.CreateDefaultFont(12)";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=2490408;
 //BA.debugLineNum = 2490408;BA.debugLine="lblFooter.Font = xui.CreateDefaultFont(12)";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="headerActionFontSize = headerActionSize";
__ref._headeractionfontsize /*float*/  = _headeractionsize;
RDebugUtils.currentLine=2490410;
 //BA.debugLineNum = 2490410;BA.debugLine="codeFontSize = codeSize";
__ref._codefontsize /*float*/  = _codesize;
RDebugUtils.currentLine=2490411;
 //BA.debugLineNum = 2490411;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, lblConnectionI";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=2490412;
 //BA.debugLineNum = 2490412;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),_cardradius);
RDebugUtils.currentLine=2490413;
 //BA.debugLineNum = 2490413;BA.debugLine="uiController.UpdateResponsiveStyles(streamFontSiz";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._updateresponsivestyles /*String*/ (null,_streamfontsize,_infofontsize,_playfontsize,_stopfontsize,_headeractionsize,_codesize,__ref._iscodeinputfocused /*boolean*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  || __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/  || __ref._isstartupsequenceinprogress /*boolean*/ );
RDebugUtils.currentLine=2490414;
 //BA.debugLineNum = 2490414;BA.debugLine="End Sub";
return "";
}
public int  _measureviewtextwidth(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "measureviewtextwidth", false))
	 {return ((Integer) Debug.delegate(ba, "measureviewtextwidth", new Object[] {_view}));}
anywheresoftware.b4j.object.JavaObject _textnode = null;
anywheresoftware.b4j.object.JavaObject _fontobject = null;
anywheresoftware.b4j.object.JavaObject _bounds = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub MeasureViewTextWidth(view As B4XView)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim textNode As JavaObject";
_textnode = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="textNode.InitializeNewInstance(\"javafx.scene.text";
_textnode.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_view.getText())});
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim fontObject As JavaObject = view.Font";
_fontobject = new anywheresoftware.b4j.object.JavaObject();
_fontobject = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getFont().getObject()));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="textNode.RunMethod(\"setFont\", Array As Object(fon";
_textnode.RunMethod("setFont",new Object[]{(Object)(_fontobject.getObject())});
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Dim bounds As JavaObject = textNode.RunMethod(\"ge";
_bounds = new anywheresoftware.b4j.object.JavaObject();
_bounds = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_textnode.RunMethod("getLayoutBounds",(Object[])(__c.Null))));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Return Ceil(bounds.RunMethod(\"getWidth\", Null))";
if (true) return (int) (__c.Ceil((double)(BA.ObjectToNumber(_bounds.RunMethod("getWidth",(Object[])(__c.Null))))));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="End Sub";
return 0;
}
public String  _localadminutetimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localadminutetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "localadminutetimer_tick", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub LocalAdMinuteTimer_Tick";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (__ref._currentsecondofminute /*int*/ (null)<50) { 
if (true) return "";};
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,__c.True);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
public int  _timezoneoffsetminutes(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "timezoneoffsetminutes", false))
	 {return ((Integer) Debug.delegate(ba, "timezoneoffsetminutes", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _nowoffset = null;
anywheresoftware.b4j.object.JavaObject _zoneoffset = null;
int _totalseconds = 0;
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _stopplayer(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stopplayer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "stopplayer", null));}
ResumableSub_StopPlayer rsub = new ResumableSub_StopPlayer(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StopPlayer extends BA.ResumableSub {
public ResumableSub_StopPlayer(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _stopped = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Wait For (Facade_StopPlayerCore) Complete (stoppe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "stopplayer"), __ref._facade_stopplayercore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_stopped = (boolean) result[1];
;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Return stopped";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_stopped));return;};
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tracedebug(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracedebug", false))
	 {return ((String) Debug.delegate(ba, "tracedebug", new Object[] {_message}));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Private Sub TraceDebug(message As String)";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="traceRouter.TraceDebugMessage(message)";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._tracedebugmessage /*String*/ (null,_message);
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="End Sub";
return "";
}
public String  _machineguidshell_processcompleted(b4j.example.b4xmainpage __ref,boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "machineguidshell_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "machineguidshell_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
String _machineguid = "";
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Private Sub MachineGuidShell_ProcessCompleted (suc";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="If success And exitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"MachineG";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("MachineGuid\\s+REG_\\w+\\s+([^\\r\\n]+)",_stdout);
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="If matcher.Find Then";
if (_matcher.Find()) { 
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="Dim machineGuid As String = matcher.Group(1).Tr";
_machineguid = _matcher.Group((int) (1)).trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=23920645;
 //BA.debugLineNum = 23920645;BA.debugLine="If machineGuid = \"\" Then";
if ((_machineguid).equals("")) { 
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="TraceLog(\"machine guid пустой\")";
__ref._tracelog /*String*/ (null,"machine guid пустой");
RDebugUtils.currentLine=23920647;
 //BA.debugLineNum = 23920647;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23920649;
 //BA.debugLineNum = 23920649;BA.debugLine="If deviceId = machineGuid Then";
if ((__ref._deviceid /*String*/ ).equals(_machineguid)) { 
RDebugUtils.currentLine=23920650;
 //BA.debugLineNum = 23920650;BA.debugLine="TraceLog(\"machine guid совпадение device=true\"";
__ref._tracelog /*String*/ (null,"machine guid совпадение device=true");
 }else {
RDebugUtils.currentLine=23920652;
 //BA.debugLineNum = 23920652;BA.debugLine="TraceLog(\"machine guid прочитан, deviceId сохр";
__ref._tracelog /*String*/ (null,"machine guid прочитан, deviceId сохранен прежним");
 };
 }else {
RDebugUtils.currentLine=23920655;
 //BA.debugLineNum = 23920655;BA.debugLine="TraceLog(\"machine guid чтение ошибка reason=not";
__ref._tracelog /*String*/ (null,"machine guid чтение ошибка reason=not_found");
 };
 }else {
RDebugUtils.currentLine=23920658;
 //BA.debugLineNum = 23920658;BA.debugLine="TraceLog(\"machine guid чтение ошибка success=\" &";
__ref._tracelog /*String*/ (null,"machine guid чтение ошибка success="+BA.ObjectToString(_success)+" exitCode="+BA.NumberToString(_exitcode)+" stderr="+_stderr);
 };
RDebugUtils.currentLine=23920660;
 //BA.debugLineNum = 23920660;BA.debugLine="End Sub";
return "";
}
public String  _mediaurl(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mediaurl", false))
	 {return ((String) Debug.delegate(ba, "mediaurl", new Object[] {_item}));}
String _id = "";
String _localuri = "";
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Private Sub MediaUrl(item As Map) As String";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Dim id As String = item.GetDefault(\"id\", \"\")";
_id = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="If id = \"\" Then Return \"\"";
if ((_id).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Dim localUri As String = mediaCacheService.Resolv";
_localuri = __ref._mediacacheservice /*b4j.example.mediacache*/ ._resolvelocalmediauri /*String*/ (null,_item);
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="If localUri <> \"\" Then Return localUri";
if ((_localuri).equals("") == false) { 
if (true) return _localuri;};
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="End Sub";
return "";
}
public String  _mergebreakitems(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mergebreakitems", false))
	 {return ((String) Debug.delegate(ba, "mergebreakitems", new Object[] {_item}));}
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.List _merged = null;
Object _breakitem = null;
Object _existing = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub MergeBreakItems(item As Map)";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim items As List = item.GetDefault(\"items\", Null";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim merged As List";
_merged = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="merged.Initialize";
_merged.Initialize();
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="For Each breakItem As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_breakitem = group5.Get(index5);
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="merged.Add(breakItem)";
_merged.Add(_breakitem);
 }
};
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="For Each existing As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_existing = group8.Get(index8);
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="merged.Add(existing)";
_merged.Add(_existing);
 }
};
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="playQueue = merged";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _merged;
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="TraceLog(\"брейк очередь add queue=\" & playQueue.S";
__ref._tracelog /*String*/ (null,"брейк очередь add queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" at="+BA.NumberToString(__ref._scheduledbreakat /*long*/ ));
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="End Sub";
return "";
}
public int  _minuteofhourfromtimestamp(b4j.example.b4xmainpage __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "minuteofhourfromtimestamp", false))
	 {return ((Integer) Debug.delegate(ba, "minuteofhourfromtimestamp", new Object[] {_targettimestamp}));}
String _previoustimeformat = "";
String _timevalue = "";
String[] _parts = null;
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Private Sub MinuteOfHourFromTimestamp(targetTimest";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Dim timeValue As String = DateTime.Time(targetTim";
_timevalue = __c.DateTime.Time((long) (_targettimestamp*1000));
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="Return parts(1)";
if (true) return (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="End Sub";
return 0;
}
public String  _nexturlvalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "nexturlvalue", false))
	 {return ((String) Debug.delegate(ba, "nexturlvalue", null));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub NextUrlValue As String";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Return NEXT_BASE_URL";
if (true) return __ref._next_base_url /*String*/ ;
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="End Sub";
return "";
}
public double  _normalizedbvalue(b4j.example.b4xmainpage __ref,Object _value,double _fallbackvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizedbvalue", false))
	 {return ((Double) Debug.delegate(ba, "normalizedbvalue", new Object[] {_value,_fallbackvalue}));}
double _db = 0;
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Private Sub NormalizeDbValue(value As Object, fall";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="Dim db As Double = fallbackValue";
_db = _fallbackvalue;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="Try";
try {RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="db = value";
_db = (double)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="db = fallbackValue";
_db = _fallbackvalue;
 };
RDebugUtils.currentLine=24182791;
 //BA.debugLineNum = 24182791;BA.debugLine="If db > 0 Then db = 0";
if (_db>0) { 
_db = 0;};
RDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="If db < -24 Then db = -24";
if (_db<-24) { 
_db = -24;};
RDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="Return db";
if (true) return _db;
RDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _normalizequeueresponse(b4j.example.b4xmainpage __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizequeueresponse", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "normalizequeueresponse", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.List _normalized = null;
Object _item = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub NormalizeQueueResponse(data As Object)";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.GetDefault((Object)("queue"),__c.Null)));
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="If items.IsInitialized = False Then Return Null";
if (_items.IsInitialized()==__c.False) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));};
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="Dim normalized As List";
_normalized = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="normalized.Initialize";
_normalized.Initialize();
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="For Each item As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group7 = _items;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.Get(index7);
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="If item Is Map Then normalized.Add(item)";
if (_item instanceof java.util.Map) { 
_normalized.Add(_item);};
 }
};
RDebugUtils.currentLine=12648458;
 //BA.debugLineNum = 12648458;BA.debugLine="Return normalized";
if (true) return _normalized;
 };
RDebugUtils.currentLine=12648460;
 //BA.debugLineNum = 12648460;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
RDebugUtils.currentLine=12648461;
 //BA.debugLineNum = 12648461;BA.debugLine="End Sub";
return null;
}
public int  _normalizeretryafter(b4j.example.b4xmainpage __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "normalizeretryafter", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
int _value = 0;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Private Sub NormalizeRetryAfter(data As Object) As";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
if (_m.ContainsKey((Object)("retry_after"))==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
_value = (int)(BA.ObjectToNumber(_m.Get((Object)("retry_after"))));
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="If value <= 0 Then Return 0";
if (_value<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="End Sub";
return 0;
}
public void  _offlinedatarefreshtimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "offlinedatarefreshtimer_tick", false))
	 {Debug.delegate(ba, "offlinedatarefreshtimer_tick", null); return;}
ResumableSub_OfflineDataRefreshTimer_Tick rsub = new ResumableSub_OfflineDataRefreshTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_OfflineDataRefreshTimer_Tick extends BA.ResumableSub {
public ResumableSub_OfflineDataRefreshTimer_Tick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If LOCAL_PLAYBACK_ONLY Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._local_playback_only /*boolean*/ ) { 
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
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (unused";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "offlinedatarefreshtimer_tick"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _orbittimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "orbittimer_tick", false))
	 {return ((String) Debug.delegate(ba, "orbittimer_tick", null));}
double _fadestep = 0;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub OrbitTimer_Tick";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="orbitPulseStep = (orbitPulseStep + 1) Mod 24";
__ref._orbitpulsestep /*int*/  = (int) ((__ref._orbitpulsestep /*int*/ +1)%24);
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="Dim fadeStep As Double = orbitTimer.Interval / OR";
_fadestep = __ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()/(double)__ref._orbit_fade_ms /*int*/ ;
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="If uiController.AdvanceOrbitFrame(orbitPulseStep,";
if (__ref._uicontroller /*b4j.example.playeruicontroller*/ ._advanceorbitframe /*boolean*/ (null,__ref._orbitpulsestep /*int*/ ,_fadestep)) { 
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);};
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="End Sub";
return "";
}
public String  _playbackdirectortimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbackdirectortimer_tick", false))
	 {return ((String) Debug.delegate(ba, "playbackdirectortimer_tick", null));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub PlaybackDirectorTimer_Tick";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="If isPlaybackDirectorTickQueued Then Return";
if (__ref._isplaybackdirectortickqueued /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="isPlaybackDirectorTickQueued = True";
__ref._isplaybackdirectortickqueued /*boolean*/  = __c.True;
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="CallSubDelayed2(Me, \"RunPlaybackDirectorTimerAsyn";
__c.CallSubDelayed2(ba,this,"RunPlaybackDirectorTimerAsync",(Object)("director_timer"));
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="End Sub";
return "";
}
public void  _playbackwatchdogtimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbackwatchdogtimer_tick", false))
	 {Debug.delegate(ba, "playbackwatchdogtimer_tick", null); return;}
ResumableSub_PlaybackWatchdogTimer_Tick rsub = new ResumableSub_PlaybackWatchdogTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_PlaybackWatchdogTimer_Tick extends BA.ResumableSub {
public ResumableSub_PlaybackWatchdogTimer_Tick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="If isPlaybackWatchdogTickInProgress Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isplaybackwatchdogtickinprogress /*boolean*/ ) { 
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
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="isPlaybackWatchdogTickInProgress = True";
__ref._isplaybackwatchdogtickinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Wait For (RunPlaybackWatchdogTick) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbackwatchdogtimer_tick"), __ref._runplaybackwatchdogtick /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="isPlaybackWatchdogTickInProgress = False";
__ref._isplaybackwatchdogtickinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runplaybackwatchdogtick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "runplaybackwatchdogtick", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "runplaybackwatchdogtick", null));}
ResumableSub_RunPlaybackWatchdogTick rsub = new ResumableSub_RunPlaybackWatchdogTick(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunPlaybackWatchdogTick extends BA.ResumableSub {
public ResumableSub_RunPlaybackWatchdogTick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
long _nowticks = 0L;
String _currenttrackid = "";
long _currentpositionms = 0L;
long _expectedactivationtoken = 0L;
boolean _recovered = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="If ShouldWatchPlaybackProgress = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._shouldwatchplaybackprogress /*boolean*/ (null)==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="Dim currentTrackId As String = ActiveTrackIdForWa";
_currenttrackid = __ref._activetrackidforwatchdog /*String*/ (null);
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="Dim currentPositionMs As Long = ActivePlaybackPos";
_currentpositionms = __ref._activeplaybackpositionms /*long*/ (null);
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Dim expectedActivationToken As Long = playbackAct";
_expectedactivationtoken = __ref._playbackactivationtoken /*long*/ ;
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="If HasObservableActivePlayback = False And lastPl";
if (true) break;

case 5:
//if
this.state = 10;
if (__ref._hasobservableactiveplayback /*boolean*/ (null)==parent.__c.False && __ref._lastplaybackwatchdogprogressat /*long*/ ==0) { 
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
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="If lastPlaybackWatchdogProgressAt = 0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (__ref._lastplaybackwatchdogprogressat /*long*/ ==0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
__ref._markplaybackwatchdogprogress /*String*/ (null,_currenttrackid,_currentpositionms);
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="If currentTrackId <> \"\" And currentTrackId <> las";

case 14:
//if
this.state = 17;
if ((_currenttrackid).equals("") == false && (_currenttrackid).equals(__ref._lastplaybackwatchdogtrackid /*String*/ ) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
__ref._markplaybackwatchdogprogress /*String*/ (null,_currenttrackid,_currentpositionms);
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8912914;
 //BA.debugLineNum = 8912914;BA.debugLine="If currentPositionMs >= 0 And currentPositionMs >";

case 17:
//if
this.state = 20;
if (_currentpositionms>=0 && _currentpositionms>__ref._lastplaybackwatchdogpositionms /*long*/ +__ref._playback_watchdog_progress_delta_ms /*long*/ ) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
__ref._markplaybackwatchdogprogress /*String*/ (null,_currenttrackid,_currentpositionms);
RDebugUtils.currentLine=8912916;
 //BA.debugLineNum = 8912916;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8912918;
 //BA.debugLineNum = 8912918;BA.debugLine="If nowTicks - lastPlaybackWatchdogRecoveryAt < PL";

case 20:
//if
this.state = 25;
if (_nowticks-__ref._lastplaybackwatchdogrecoveryat /*long*/ <__ref._playback_watchdog_grace_ms /*long*/ ) { 
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
RDebugUtils.currentLine=8912919;
 //BA.debugLineNum = 8912919;BA.debugLine="If nowTicks - lastPlaybackWatchdogProgressAt < PL";
if (true) break;

case 26:
//if
this.state = 31;
if (_nowticks-__ref._lastplaybackwatchdogprogressat /*long*/ <__ref._playback_watchdog_stall_ms /*long*/ ) { 
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
RDebugUtils.currentLine=8912920;
 //BA.debugLineNum = 8912920;BA.debugLine="Wait For (RecoverFromPlaybackStall(currentTrackId";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runplaybackwatchdogtick"), __ref._recoverfromplaybackstall /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_currenttrackid,_currentpositionms,_expectedactivationtoken));
this.state = 36;
return;
case 36:
//C
this.state = 32;
_recovered = (boolean) result[1];
;
RDebugUtils.currentLine=8912921;
 //BA.debugLineNum = 8912921;BA.debugLine="If recovered Then";
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
RDebugUtils.currentLine=8912922;
 //BA.debugLineNum = 8912922;BA.debugLine="lastPlaybackWatchdogRecoveryAt = DateTime.Now";
__ref._lastplaybackwatchdogrecoveryat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=8912923;
 //BA.debugLineNum = 8912923;BA.debugLine="MarkPlaybackWatchdogProgress(ActiveTrackIdForWat";
__ref._markplaybackwatchdogprogress /*String*/ (null,__ref._activetrackidforwatchdog /*String*/ (null),__ref._activeplaybackpositionms /*long*/ (null));
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=8912925;
 //BA.debugLineNum = 8912925;BA.debugLine="Return recovered";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_recovered));return;};
RDebugUtils.currentLine=8912926;
 //BA.debugLineNum = 8912926;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _playbuttonpane_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_click", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_click", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub PlayButtonPane_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="HandlePlayButtonInput";
__ref._handleplaybuttoninput /*void*/ (null);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseclicked(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub PlayButtonPane_MouseClicked (eventData";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="HandlePlayButtonInput";
__ref._handleplaybuttoninput /*void*/ (null);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub PlayButtonPane_MouseEntered (eventData";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="UpdatePlayButtonAppearance(True)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub PlayButtonPane_MouseExited (eventData";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public String  _playercodevalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playercodevalue", false))
	 {return ((String) Debug.delegate(ba, "playercodevalue", null));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Public Sub PlayerCodeValue As String";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="Return playerCode";
if (true) return __ref._playercode /*String*/ ;
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="End Sub";
return "";
}
public double  _playerleveltofactor(b4j.example.b4xmainpage __ref,double _levelvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playerleveltofactor", false))
	 {return ((Double) Debug.delegate(ba, "playerleveltofactor", new Object[] {_levelvalue}));}
double _normalized = 0;
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Private Sub PlayerLevelToFactor(levelValue As Doub";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Dim normalized As Double = Max(0, Min(1, levelVal";
_normalized = __c.Max(0,__c.Min(1,_levelvalue/(double)100));
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="If normalized <= 0 Then Return 0";
if (_normalized<=0) { 
if (true) return 0;};
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="Return Power(normalized, 0.7)";
if (true) return __c.Power(_normalized,0.7);
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="End Sub";
return 0;
}
public int  _resolvestartfadeinms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvestartfadeinms", false))
	 {return ((Integer) Debug.delegate(ba, "resolvestartfadeinms", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub ResolveStartFadeInMs As Int";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="If initialStartFadePending = False Then Return 0";
if (__ref._initialstartfadepending /*boolean*/ ==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="If Transition_GetDirectorActiveAudioKey <> \"\" The";
if ((__ref._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="initialStartFadePending = False";
__ref._initialstartfadepending /*boolean*/  = __c.False;
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="Return START_FADE_MS";
if (true) return __ref._start_fade_ms /*int*/ ;
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _startplaybackwithaudiokey(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startplaybackwithaudiokey", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "startplaybackwithaudiokey", new Object[] {_audiokey,_item,_fadeinms}));}
ResumableSub_StartPlaybackWithAudioKey rsub = new ResumableSub_StartPlaybackWithAudioKey(this,__ref,_audiokey,_item,_fadeinms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StartPlaybackWithAudioKey extends BA.ResumableSub {
public ResumableSub_StartPlaybackWithAudioKey(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this._item = _item;
this._fadeinms = _fadeinms;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
anywheresoftware.b4a.objects.collections.Map _item;
int _fadeinms;
String _itemurl = "";
boolean _playbackstarted = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="If directorState.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="directorState.SetPendingPlay(audioKey, item)";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setpendingplay /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="runtimeState.SetPendingPlay(audioKey, item, fade";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._setpendingplay /*String*/ (null,_audiokey,_item,_fadeinms);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="runtimeState.PendingPlayFadeInMs = fadeInMs";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayfadeinms /*int*/  = _fadeinms;
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="SetPlaybackFlowState(FLOW_STARTING, \"start_playba";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_starting /*String*/ ,"start_playback:"+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)(""))));
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="Dim itemUrl As String = ResolvePlaybackMediaUrl(a";
_itemurl = __ref._resolveplaybackmediaurl /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="If itemUrl = \"\" Then";
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
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="TraceError(\"playback\", \"не удалось запустить тре";
__ref._traceerror /*String*/ (null,"playback","не удалось запустить трек","reason=media_url trackId="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="WriteHealthSnapshot(\"ошибка_playback\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_playback");
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="TraceInfo(\"audio\", \"плеер load\", BuildAudioTraceD";
__ref._traceinfo /*String*/ (null,"audio","плеер load",__ref._buildaudiotracedetails /*String*/ (null,_item,"player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_item)+" id="+__ref._tracetrackvalue /*String*/ (null,_item)));
RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="GetAudioByKey(audioKey).LoadUrl(itemUrl, CurrentV";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._loadurl /*String*/ (null,_itemurl,__ref._currentvolume /*double*/ (null,_item));
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="Wait For (WaitForPlaybackActivation(audioKey, ite";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startplaybackwithaudiokey"), __ref._waitforplaybackactivation /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey,_item,__ref._audio_ready_timeout_ms /*int*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_playbackstarted = (boolean) result[1];
;
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="If playbackStarted Then";
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
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="TraceInfo(\"playback\", \"старт трека\", \"trackId=\"";
__ref._traceinfo /*String*/ (null,"playback","старт трека","trackId="+__ref._tracetrackvalue /*String*/ (null,_item)+" source="+__ref._mediacacheservice /*b4j.example.mediacache*/ ._resolvemediasource /*String*/ (null,_item)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="WriteHealthSnapshot(\"старт_трека\")";
__ref._writehealthsnapshot /*String*/ (null,"старт_трека");
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=10813463;
 //BA.debugLineNum = 10813463;BA.debugLine="TraceError(\"audio\", \"не удалось запустить трек\",";
__ref._traceerror /*String*/ (null,"audio","не удалось запустить трек","trackId="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=10813464;
 //BA.debugLineNum = 10813464;BA.debugLine="WriteHealthSnapshot(\"ошибка_audio\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_audio");
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=10813466;
 //BA.debugLineNum = 10813466;BA.debugLine="Return playbackStarted";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_playbackstarted));return;};
RDebugUtils.currentLine=10813467;
 //BA.debugLineNum = 10813467;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparenextplayable(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparenextplayable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparenextplayable", null));}
ResumableSub_PrepareNextPlayable rsub = new ResumableSub_PrepareNextPlayable(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareNextPlayable extends BA.ResumableSub {
public ResumableSub_PrepareNextPlayable(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _prepared = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Wait For (Facade_PrepareNextPlayableCore) Complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "preparenextplayable"), __ref._facade_preparenextplayablecore /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparespecificplayable(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparespecificplayable", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "preparespecificplayable", new Object[] {_item}));}
ResumableSub_PrepareSpecificPlayable rsub = new ResumableSub_PrepareSpecificPlayable(this,__ref,_item);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSpecificPlayable extends BA.ResumableSub {
public ResumableSub_PrepareSpecificPlayable(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _item;
boolean _prepared = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Wait For (transitionCoordinator.PrepareSpecificPl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "preparespecificplayable"), __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._preparespecificplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_item,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._playbackflowstate /*String*/ ,__ref._flow_playing /*String*/ ,__ref._flow_idle /*String*/ ,__ref._flow_preparing /*String*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _scanlocaladsfortimestamp(b4j.example.b4xmainpage __ref,long _targetminutetimestamp,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scanlocaladsfortimestamp", false))
	 {return ((String) Debug.delegate(ba, "scanlocaladsfortimestamp", new Object[] {_targetminutetimestamp,_force}));}
boolean _allowregularads = false;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub ScanLocalAdsForTimestamp(targetMinuteT";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim allowRegularAds As Boolean = AllowRegularAdsA";
_allowregularads = __ref._allowregularadsattargetminute /*boolean*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="If localAdScheduler.ScanTargetMinute(stateStore.O";
if (__ref._localadscheduler /*b4j.example.adscheduler*/ ._scantargetminute /*boolean*/ (null,__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null),__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,_targetminutetimestamp,_force,_allowregularads)) { 
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="PruneQueuedBreakItemsByLocalCache";
__ref._prunequeuedbreakitemsbylocalcache /*String*/ (null);
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _probeaudiooutputrecovery(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "probeaudiooutputrecovery", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "probeaudiooutputrecovery", null));}
ResumableSub_ProbeAudioOutputRecovery rsub = new ResumableSub_ProbeAudioOutputRecovery(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ProbeAudioOutputRecovery extends BA.ResumableSub {
public ResumableSub_ProbeAudioOutputRecovery(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _recovered = false;
boolean _queueprepared = false;
boolean _advanced = false;
boolean _started = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="If isAudioOutputRecoveryPause = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isaudiooutputrecoverypause /*boolean*/ ==parent.__c.False) { 
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
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="TraceInfo(\"audio\", \"output probe\", \"queue=\" & pla";
__ref._traceinfo /*String*/ (null,"audio","output probe","queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"audio_output_pro";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"audio_output_probe");
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="Dim recovered As Boolean = False";
_recovered = parent.__c.False;
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="If playQueue.Size = 0 Then";
if (true) break;

case 7:
//if
this.state = 14;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queue";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "probeaudiooutputrecovery"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 22;
return;
case 22:
//C
this.state = 10;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="If queuePrepared = False And playQueue.Size = 0";
if (true) break;

case 10:
//if
this.state = 13;
if (_queueprepared==parent.__c.False && __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="EnterPolicyPauseState(MessageValue(\"audio_devic";
__ref._enterpolicypausestate /*String*/ (null,__ref._messagevalue /*String*/ (null,"audio_device_check"),"audio");
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="isAudioOutputRecoveryPause = True";
__ref._isaudiooutputrecoverypause /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="Return False";
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
RDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"audio_outpu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "probeaudiooutputrecovery"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_output_probe",parent.__c.True));
this.state = 23;
return;
case 23:
//C
this.state = 15;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=9895954;
 //BA.debugLineNum = 9895954;BA.debugLine="recovered = advanced";
_recovered = _advanced;
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="If recovered = False Then";
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
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="Wait For (StartFirstTrack(\"audio_output_probe\"))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "probeaudiooutputrecovery"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_output_probe"));
this.state = 24;
return;
case 24:
//C
this.state = 18;
_started = (boolean) result[1];
;
RDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="recovered = started";
_recovered = _started;
 if (true) break;
;
RDebugUtils.currentLine=9895959;
 //BA.debugLineNum = 9895959;BA.debugLine="If recovered Then";

case 18:
//if
this.state = 21;
if (_recovered) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=9895960;
 //BA.debugLineNum = 9895960;BA.debugLine="TraceInfo(\"audio\", \"output probe recovered\", \"\")";
__ref._traceinfo /*String*/ (null,"audio","output probe recovered","");
RDebugUtils.currentLine=9895961;
 //BA.debugLineNum = 9895961;BA.debugLine="ResetAudioOutputErrorState";
__ref._resetaudiooutputerrorstate /*String*/ (null);
RDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=9895965;
 //BA.debugLineNum = 9895965;BA.debugLine="EnterPolicyPauseState(MessageValue(\"audio_device_";
__ref._enterpolicypausestate /*String*/ (null,__ref._messagevalue /*String*/ (null,"audio_device_check"),"audio");
RDebugUtils.currentLine=9895966;
 //BA.debugLineNum = 9895966;BA.debugLine="isAudioOutputRecoveryPause = True";
__ref._isaudiooutputrecoverypause /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=9895967;
 //BA.debugLineNum = 9895967;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=9895968;
 //BA.debugLineNum = 9895968;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _prunequeuedbreakitemsbylocalcache(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prunequeuedbreakitemsbylocalcache", false))
	 {return ((String) Debug.delegate(ba, "prunequeuedbreakitemsbylocalcache", null));}
boolean _changed = false;
int _i = 0;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _breakitems = null;
anywheresoftware.b4a.objects.collections.List _filtereditems = null;
Object _breakitemobject = null;
anywheresoftware.b4a.objects.collections.Map _breakitem = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub PruneQueuedBreakItemsByLocalCache";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="For i = playQueue.Size - 1 To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_i = (int) (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i);
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"break\" Then C";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) == false) { 
if (true) continue;};
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="Dim breakItems As List = item.GetDefault(\"items\"";
_breakitems = new anywheresoftware.b4a.objects.collections.List();
_breakitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="If breakItems.IsInitialized = False Or breakItem";
if (_breakitems.IsInitialized()==__c.False || _breakitems.getSize()==0) { 
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="changed = True";
_changed = __c.True;
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=13369358;
 //BA.debugLineNum = 13369358;BA.debugLine="Dim filteredItems As List";
_filtereditems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13369359;
 //BA.debugLineNum = 13369359;BA.debugLine="filteredItems.Initialize";
_filtereditems.Initialize();
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="For Each breakItemObject As Object In breakItems";
{
final anywheresoftware.b4a.BA.IterableList group16 = _breakitems;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_breakitemobject = group16.Get(index16);
RDebugUtils.currentLine=13369361;
 //BA.debugLineNum = 13369361;BA.debugLine="If breakItemObject Is Map Then";
if (_breakitemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=13369362;
 //BA.debugLineNum = 13369362;BA.debugLine="Dim breakItem As Map = breakItemObject";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_breakitemobject));
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="If breakItem.GetDefault(\"type\", \"\") = \"ad\" The";
if ((_breakitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
RDebugUtils.currentLine=13369364;
 //BA.debugLineNum = 13369364;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(b";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_breakitem)==__c.False) { 
if (true) continue;};
 };
RDebugUtils.currentLine=13369366;
 //BA.debugLineNum = 13369366;BA.debugLine="filteredItems.Add(breakItem)";
_filtereditems.Add((Object)(_breakitem.getObject()));
 };
 }
};
RDebugUtils.currentLine=13369369;
 //BA.debugLineNum = 13369369;BA.debugLine="If filteredItems.Size = 0 Then";
if (_filtereditems.getSize()==0) { 
RDebugUtils.currentLine=13369370;
 //BA.debugLineNum = 13369370;BA.debugLine="TraceLog(\"брейк очередь drop reason=no_cached_a";
__ref._tracelog /*String*/ (null,"брейк очередь drop reason=no_cached_ads");
RDebugUtils.currentLine=13369371;
 //BA.debugLineNum = 13369371;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=13369372;
 //BA.debugLineNum = 13369372;BA.debugLine="changed = True";
_changed = __c.True;
 }else 
{RDebugUtils.currentLine=13369373;
 //BA.debugLineNum = 13369373;BA.debugLine="Else If filteredItems.Size <> breakItems.Size Th";
if (_filtereditems.getSize()!=_breakitems.getSize()) { 
RDebugUtils.currentLine=13369374;
 //BA.debugLineNum = 13369374;BA.debugLine="item.Put(\"items\", filteredItems)";
_item.Put((Object)("items"),(Object)(_filtereditems.getObject()));
RDebugUtils.currentLine=13369375;
 //BA.debugLineNum = 13369375;BA.debugLine="item.Put(\"items_count\", filteredItems.Size)";
_item.Put((Object)("items_count"),(Object)(_filtereditems.getSize()));
RDebugUtils.currentLine=13369376;
 //BA.debugLineNum = 13369376;BA.debugLine="playQueue.Set(i, item)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_item.getObject()));
RDebugUtils.currentLine=13369377;
 //BA.debugLineNum = 13369377;BA.debugLine="changed = True";
_changed = __c.True;
 }}
;
 }
};
RDebugUtils.currentLine=13369380;
 //BA.debugLineNum = 13369380;BA.debugLine="If changed Then ResolveScheduledBreakAt";
if (_changed) { 
__ref._resolvescheduledbreakat /*String*/ (null);};
RDebugUtils.currentLine=13369381;
 //BA.debugLineNum = 13369381;BA.debugLine="End Sub";
return "";
}
public String  _resolvescheduledbreakat(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvescheduledbreakat", false))
	 {return ((String) Debug.delegate(ba, "resolvescheduledbreakat", null));}
Object _itemobj = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub ResolveScheduledBreakAt";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="scheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="If playQueue.IsInitialized = False Then";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="TraceLog(\"брейк exact sync value=\" & scheduledBr";
__ref._tracelog /*String*/ (null,"брейк exact sync value="+BA.NumberToString(__ref._scheduledbreakat /*long*/ )+" queue=0");
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="For Each itemObj As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobj = group6.Get(index6);
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && (_item.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True)) && _item.ContainsKey((Object)("at"))) { 
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="scheduledBreakAt = ToLongDefault(item.Get(\"at\"";
__ref._scheduledbreakat /*long*/  = __ref._tolongdefault /*long*/ (null,_item.Get((Object)("at")),(long) (-1));
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="TraceLog(\"брейк exact sync value=\" & scheduledBre";
__ref._tracelog /*String*/ (null,"брейк exact sync value="+BA.NumberToString(__ref._scheduledbreakat /*long*/ )+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _recoverfromplaybackstall(b4j.example.b4xmainpage __ref,String _trackid,long _positionms,long _expectedactivationtoken) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "recoverfromplaybackstall", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "recoverfromplaybackstall", new Object[] {_trackid,_positionms,_expectedactivationtoken}));}
ResumableSub_RecoverFromPlaybackStall rsub = new ResumableSub_RecoverFromPlaybackStall(this,__ref,_trackid,_positionms,_expectedactivationtoken);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RecoverFromPlaybackStall extends BA.ResumableSub {
public ResumableSub_RecoverFromPlaybackStall(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _trackid,long _positionms,long _expectedactivationtoken) {
this.parent = parent;
this.__ref = __ref;
this._trackid = _trackid;
this._positionms = _positionms;
this._expectedactivationtoken = _expectedactivationtoken;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
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
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="If nowTicks - lastPlaybackWatchdogRecoveryAt < PL";
if (true) break;

case 1:
//if
this.state = 6;
if (_nowticks-__ref._lastplaybackwatchdogrecoveryat /*long*/ <__ref._playback_watchdog_recovery_cooldown_ms /*long*/ ) { 
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
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posit";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._isplaybackstallalreadyrecovered /*boolean*/ (null,_trackid,_positionms,_expectedactivationtoken)) { 
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
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="lastPlaybackWatchdogRecoveryAt = nowTicks";
__ref._lastplaybackwatchdogrecoveryat /*long*/  = _nowticks;
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="TraceWarn(\"playback\", \"watchdog stall\", \"trackId=";
__ref._tracewarn /*String*/ (null,"playback","watchdog stall","trackId="+_trackid+" posMs="+BA.NumberToString(_positionms)+" stage="+__ref._playbackflowstate /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Dim activeAudioKey As String = Transition_GetDire";
_activeaudiokey = __ref._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Dim preparedAudioKey As String = Transition_GetDi";
_preparedaudiokey = __ref._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
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
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_activeaudiokey)._reset /*String*/ (null);
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="If preparedAudioKey <> \"\" And preparedAudioKey <>";
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
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_preparedaudiokey)._reset /*String*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="If directorState.IsInitialized Then";

case 22:
//if
this.state = 27;
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="directorState.Reset";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="directorState.ConfigureDefaultSlots";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._configuredefaultslots /*String*/ (null);
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="runtimeState.ActiveItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=9043988;
 //BA.debugLineNum = 9043988;BA.debugLine="metaState.Reset";
__ref._metastate /*b4j.example.playbackmetastate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=9043989;
 //BA.debugLineNum = 9043989;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=9043990;
 //BA.debugLineNum = 9043990;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=9043991;
 //BA.debugLineNum = 9043991;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=9043992;
 //BA.debugLineNum = 9043992;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=9043993;
 //BA.debugLineNum = 9043993;BA.debugLine="stateStore.ClearDispatchRetryAfter";
__ref._statestore /*b4j.example.playerstatestore*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=9043994;
 //BA.debugLineNum = 9043994;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=9043995;
 //BA.debugLineNum = 9043995;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=9043996;
 //BA.debugLineNum = 9043996;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=9043997;
 //BA.debugLineNum = 9043997;BA.debugLine="If playbackFlowState <> FLOW_STOPPING And playbac";
if (true) break;

case 28:
//if
this.state = 31;
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ ) == false && (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ ) == false) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=9043998;
 //BA.debugLineNum = 9043998;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"watchdog_stall\"";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"watchdog_stall");
 if (true) break;
;
RDebugUtils.currentLine=9044000;
 //BA.debugLineNum = 9044000;BA.debugLine="If stateStore.GetLocalPlayableQueueCount(playQueu";

case 31:
//if
this.state = 44;
if (__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )==0) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=9044001;
 //BA.debugLineNum = 9044001;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queue";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "recoverfromplaybackstall"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 61;
return;
case 61:
//C
this.state = 34;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=9044002;
 //BA.debugLineNum = 9044002;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posi";
if (true) break;

case 34:
//if
this.state = 39;
if (__ref._isplaybackstallalreadyrecovered /*boolean*/ (null,_trackid,_positionms,_expectedactivationtoken)) { 
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
RDebugUtils.currentLine=9044003;
 //BA.debugLineNum = 9044003;BA.debugLine="If queuePrepared = False And stateStore.GetLocal";
if (true) break;

case 40:
//if
this.state = 43;
if (_queueprepared==parent.__c.False && __ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )==0) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=9044004;
 //BA.debugLineNum = 9044004;BA.debugLine="TraceWarn(\"playback\", \"watchdog recovery\", \"ste";
__ref._tracewarn /*String*/ (null,"playback","watchdog recovery","step=populate_failed reserve=0");
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
RDebugUtils.currentLine=9044007;
 //BA.debugLineNum = 9044007;BA.debugLine="Wait For (RunPlaybackDirectorAdvance(\"watchdog_st";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "recoverfromplaybackstall"), __ref._runplaybackdirectoradvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"watchdog_stall",parent.__c.True));
this.state = 62;
return;
case 62:
//C
this.state = 45;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=9044008;
 //BA.debugLineNum = 9044008;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posit";
if (true) break;

case 45:
//if
this.state = 50;
if (__ref._isplaybackstallalreadyrecovered /*boolean*/ (null,_trackid,_positionms,_expectedactivationtoken)) { 
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
RDebugUtils.currentLine=9044009;
 //BA.debugLineNum = 9044009;BA.debugLine="If dispatched Then";
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
RDebugUtils.currentLine=9044010;
 //BA.debugLineNum = 9044010;BA.debugLine="TraceInfo(\"playback\", \"watchdog recovery\", \"resu";
__ref._traceinfo /*String*/ (null,"playback","watchdog recovery","result=dispatch queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )));
RDebugUtils.currentLine=9044011;
 //BA.debugLineNum = 9044011;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=9044013;
 //BA.debugLineNum = 9044013;BA.debugLine="Wait For (LoadNextAndPlay) Complete (advanced As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "recoverfromplaybackstall"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 63;
return;
case 63:
//C
this.state = 55;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=9044014;
 //BA.debugLineNum = 9044014;BA.debugLine="If IsPlaybackStallAlreadyRecovered(trackId, posit";
if (true) break;

case 55:
//if
this.state = 60;
if (__ref._isplaybackstallalreadyrecovered /*boolean*/ (null,_trackid,_positionms,_expectedactivationtoken)) { 
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
RDebugUtils.currentLine=9044015;
 //BA.debugLineNum = 9044015;BA.debugLine="TraceInfo(\"playback\", \"watchdog recovery\", \"resul";
__ref._traceinfo /*String*/ (null,"playback","watchdog recovery","result="+BA.ObjectToString(((_advanced) ? ((Object)("restart")) : ((Object)("failed"))))+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" reserve="+BA.NumberToString(__ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ )));
RDebugUtils.currentLine=9044016;
 //BA.debugLineNum = 9044016;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=9044017;
 //BA.debugLineNum = 9044017;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _recoverstaledirectorslots(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "recoverstaledirectorslots", false))
	 {return ((String) Debug.delegate(ba, "recoverstaledirectorslots", null));}
long _nowticks = 0L;
boolean _changed = false;
b4j.example.playbackplayerslot _pendingplayslot = null;
b4j.example.playbackplayerslot _pendingprepareslot = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub RecoverStaleDirectorSlots";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="If directorState.IsInitialized = False Then Retur";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = __c.DateTime.getNow();
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Dim pendingPlaySlot As PlaybackPlayerSlot = direc";
_pendingplayslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpendingplayslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="If pendingPlaySlot.IsInitialized And pendingPlayS";
if (_pendingplayslot.IsInitialized /*boolean*/ () && _pendingplayslot._hasitem /*boolean*/ (null)) { 
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="If nowTicks - pendingPlaySlot.LastStateChangedAt";
if (_nowticks-_pendingplayslot._laststatechangedat /*long*/ >__ref._audio_ready_timeout_ms /*int*/ ) { 
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="TraceWarn(\"audio\", \"pending play timeout\", \"aud";
__ref._tracewarn /*String*/ (null,"audio","pending play timeout","audio="+_pendingplayslot._audiokey /*String*/ +" trackId="+__ref._tracetrackvalue /*String*/ (null,_pendingplayslot._item /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="directorState.ClearRole(\"pending_play\")";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,"pending_play");
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="changed = True";
_changed = __c.True;
 };
 };
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="Dim pendingPrepareSlot As PlaybackPlayerSlot = di";
_pendingprepareslot = __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._getpendingprepareslot /*b4j.example.playbackplayerslot*/ (null);
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="If pendingPrepareSlot.IsInitialized And pendingPr";
if (_pendingprepareslot.IsInitialized /*boolean*/ () && _pendingprepareslot._hasitem /*boolean*/ (null)) { 
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="If nowTicks - pendingPrepareSlot.LastStateChange";
if (_nowticks-_pendingprepareslot._laststatechangedat /*long*/ >__ref._audio_ready_timeout_ms /*int*/ ) { 
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="TraceWarn(\"audio\", \"pending prepare timeout\", \"";
__ref._tracewarn /*String*/ (null,"audio","pending prepare timeout","audio="+_pendingprepareslot._audiokey /*String*/ +" trackId="+__ref._tracetrackvalue /*String*/ (null,_pendingprepareslot._item /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="directorState.ClearRole(pendingPrepareSlot.Role";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._clearrole /*String*/ (null,_pendingprepareslot._role /*String*/ );
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="changed = True";
_changed = __c.True;
 };
 };
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="If changed Then MirrorRuntimeStateFromDirector";
if (_changed) { 
__ref._mirrorruntimestatefromdirector /*String*/ (null);};
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="End Sub";
return "";
}
public String  _refreshplayerheaderfromcurrentdata(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshplayerheaderfromcurrentdata", false))
	 {return ((String) Debug.delegate(ba, "refreshplayerheaderfromcurrentdata", null));}
String _safecode = "";
String _title = "";
anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub RefreshPlayerHeaderFromCurrentData";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim safeCode As String = playerCode";
_safecode = __ref._playercode /*String*/ ;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim title As String = \"\"";
_title = "";
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Dim offlineData As Map = stateStore.OfflineData";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
_offlinedata = __ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="If offlineData.IsInitialized Then";
if (_offlinedata.IsInitialized()) { 
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_offlinedata.GetDefault((Object)("player"),__c.Null)));
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="safeCode = playerData.GetDefault(\"code\", safeCo";
_safecode = BA.ObjectToString(_playerdata.GetDefault((Object)("code"),(Object)(_safecode)));
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="title = playerData.GetDefault(\"title\", \"\")";
_title = BA.ObjectToString(_playerdata.GetDefault((Object)("title"),(Object)("")));
 };
 };
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="RenderPlayerHead(safeCode, title)";
__ref._renderplayerhead /*String*/ (null,_safecode,_title);
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="End Sub";
return "";
}
public String  _renderplayerhead(b4j.example.b4xmainpage __ref,String _code,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "renderplayerhead", false))
	 {return ((String) Debug.delegate(ba, "renderplayerhead", new Object[] {_code,_title}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Private Sub RenderPlayerHead(code As String, title";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="uiController.RenderPlayerHead(FormatPlayerCodeFor";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._renderplayerhead /*String*/ (null,__ref._formatplayercodefordisplay /*String*/ (null,_code),_title);
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return "";
}
public String  _resolveadcachefilecounttext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveadcachefilecounttext", false))
	 {return ((String) Debug.delegate(ba, "resolveadcachefilecounttext", null));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub ResolveAdCacheFileCountText As String";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Return \"\" & mediaCacheService.GetCachedAdCount";
if (true) return ""+BA.NumberToString(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedadcount /*int*/ (null));
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="End Sub";
return "";
}
public String  _resolveadcachesizembtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveadcachesizembtext", false))
	 {return ((String) Debug.delegate(ba, "resolveadcachesizembtext", null));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub ResolveAdCacheSizeMbText As String";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Return \"\" & Floor(mediaCacheService.GetCachedAdBy";
if (true) return ""+BA.NumberToString(__c.Floor(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedadbytes /*long*/ (null)/(double)1024/(double)1024));
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="End Sub";
return "";
}
public String  _resolvecachehealthstatustext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvecachehealthstatustext", false))
	 {return ((String) Debug.delegate(ba, "resolvecachehealthstatustext", null));}
int _reserve = 0;
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Private Sub ResolveCacheHealthStatusText As String";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Dim reserve As Int = stateStore.GetLocalPlayableQ";
_reserve = __ref._statestore /*b4j.example.playerstatestore*/ ._getlocalplayablequeuecount /*int*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="If reserve > 0 Then Return \"норма\"";
if (_reserve>0) { 
if (true) return "норма";};
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="If metaState.CurrentMediaType = \"track\" And IsPla";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") && BA.ObjectToBoolean(__ref._isplaybackrunningfortrace /*String*/ (null))) { 
if (true) return "минимум";};
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="If HasDispatchableQueueItem Then Return \"вставки";
if (__ref._hasdispatchablequeueitem /*boolean*/ (null)) { 
if (true) return "вставки готовы";};
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="If stateStore.HasAnyCachedTrack Then Return \"мини";
if (__ref._statestore /*b4j.example.playerstatestore*/ ._hasanycachedtrack /*boolean*/ (null)) { 
if (true) return "минимум";};
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Return \"пусто\"";
if (true) return "пусто";
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="End Sub";
return "";
}
public String  _resolvecurrenttracktracevalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvecurrenttracktracevalue", false))
	 {return ((String) Debug.delegate(ba, "resolvecurrenttracktracevalue", null));}
anywheresoftware.b4a.objects.collections.Map _activeitem = null;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub ResolveCurrentTrackTraceValue As Strin";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim activeItem As Map = Transition_GetDirectorAct";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
_activeitem = __ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="If activeItem.IsInitialized = False Then Return \"";
if (_activeitem.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Return TraceTrackValue(activeItem)";
if (true) return __ref._tracetrackvalue /*String*/ (null,_activeitem);
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="End Sub";
return "";
}
public int  _resolvedirectoryfilecountrecursive(b4j.example.b4xmainpage __ref,String _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvedirectoryfilecountrecursive", false))
	 {return ((Integer) Debug.delegate(ba, "resolvedirectoryfilecountrecursive", new Object[] {_dir}));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _totalcount = 0;
String _filename = "";
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Private Sub ResolveDirectoryFileCountRecursive(dir";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="If dir = \"\" Then Return 0";
if ((_dir).equals("")) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="If File.Exists(dir, \"\") = False Then Return 0";
if (__c.File.Exists(_dir,"")==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="Dim listedFiles As List = File.ListFiles(dir)";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_dir);
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Dim totalCount As Int = 0";
_totalcount = (int) (0);
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=20578311;
 //BA.debugLineNum = 20578311;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="If File.IsDirectory(dir, fileName) Then";
if (__c.File.IsDirectory(_dir,_filename)) { 
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="totalCount = totalCount + ResolveDirectoryFileC";
_totalcount = (int) (_totalcount+__ref._resolvedirectoryfilecountrecursive /*int*/ (null,__c.File.Combine(_dir,_filename)));
RDebugUtils.currentLine=20578314;
 //BA.debugLineNum = 20578314;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=20578316;
 //BA.debugLineNum = 20578316;BA.debugLine="If fileName.EndsWith(\".tmp\") Then Continue";
if (_filename.endsWith(".tmp")) { 
if (true) continue;};
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="totalCount = totalCount + 1";
_totalcount = (int) (_totalcount+1);
 }
};
RDebugUtils.currentLine=20578319;
 //BA.debugLineNum = 20578319;BA.debugLine="Return totalCount";
if (true) return _totalcount;
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="End Sub";
return 0;
}
public long  _resolvedirectorysizebytesrecursive(b4j.example.b4xmainpage __ref,String _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvedirectorysizebytesrecursive", false))
	 {return ((Long) Debug.delegate(ba, "resolvedirectorysizebytesrecursive", new Object[] {_dir}));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
long _totalbytes = 0L;
String _filename = "";
String _childpath = "";
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Private Sub ResolveDirectorySizeBytesRecursive(dir";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="If dir = \"\" Then Return 0";
if ((_dir).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="If File.Exists(dir, \"\") = False Then Return 0";
if (__c.File.Exists(_dir,"")==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="Dim listedFiles As List = File.ListFiles(dir)";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(_dir);
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="Dim totalBytes As Long = 0";
_totalbytes = (long) (0);
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=20512775;
 //BA.debugLineNum = 20512775;BA.debugLine="If fileName = \"\" Then Continue";
if ((_filename).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=20512776;
 //BA.debugLineNum = 20512776;BA.debugLine="Dim childPath As String = File.Combine(dir, file";
_childpath = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=20512777;
 //BA.debugLineNum = 20512777;BA.debugLine="If File.IsDirectory(dir, fileName) Then";
if (__c.File.IsDirectory(_dir,_filename)) { 
RDebugUtils.currentLine=20512778;
 //BA.debugLineNum = 20512778;BA.debugLine="totalBytes = totalBytes + ResolveDirectorySizeB";
_totalbytes = (long) (_totalbytes+__ref._resolvedirectorysizebytesrecursive /*long*/ (null,_childpath));
RDebugUtils.currentLine=20512779;
 //BA.debugLineNum = 20512779;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=20512781;
 //BA.debugLineNum = 20512781;BA.debugLine="Try";
try {RDebugUtils.currentLine=20512782;
 //BA.debugLineNum = 20512782;BA.debugLine="totalBytes = totalBytes + File.Size(dir, fileNa";
_totalbytes = (long) (_totalbytes+__c.File.Size(_dir,_filename));
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=20512784;
 //BA.debugLineNum = 20512784;BA.debugLine="TraceDebug(\"не удалось определить размер файла";
__ref._tracedebug /*String*/ (null,"не удалось определить размер файла кэша file="+_childpath+" message="+__c.LastException(ba).getMessage());
 };
 }
};
RDebugUtils.currentLine=20512787;
 //BA.debugLineNum = 20512787;BA.debugLine="Return totalBytes";
if (true) return _totalbytes;
RDebugUtils.currentLine=20512788;
 //BA.debugLineNum = 20512788;BA.debugLine="End Sub";
return 0L;
}
public boolean  _shouldprioritizequeueheadoverprepared(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldprioritizequeueheadoverprepared", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldprioritizequeueheadoverprepared", null));}
Object _headobject = null;
anywheresoftware.b4a.objects.collections.Map _headitem = null;
String _itemtype = "";
long _breakat = 0L;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub ShouldPrioritizeQueueHeadOverPrepared";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim headObject As Object = playQueue.Get(0)";
_headobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="If (headObject Is Map) = False Then Return False";
if ((_headobject instanceof java.util.Map)==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Dim headItem As Map = headObject";
_headitem = new anywheresoftware.b4a.objects.collections.Map();
_headitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_headobject));
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Dim itemType As String = headItem.GetDefault(\"typ";
_itemtype = BA.ObjectToString(_headitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"break","ad","message","update","idle")) {
case 0: {
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Dim breakAt As Long = ToLongDefault(headItem.Ge";
_breakat = __ref._tolongdefault /*long*/ (null,_headitem.GetDefault((Object)("at"),(Object)(-1)),(long) (-1));
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="If breakAt > LocalNowTimestamp Then Return Fals";
if (_breakat>__ref._localnowtimestamp /*long*/ (null)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
case 1: 
case 2: 
case 3: 
case 4: {
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
default: {
RDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="Return False";
if (true) return __c.False;
 break; }
}
;
RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="End Sub";
return false;
}
public String  _resolveerrormessage(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _result,String _fallback) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveerrormessage", false))
	 {return ((String) Debug.delegate(ba, "resolveerrormessage", new Object[] {_result,_fallback}));}
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _errormessage = "";
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Private Sub ResolveErrorMessage(result As Map, fal";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="If resultData Is Map Then";
if (_resultdata instanceof java.util.Map) { 
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Dim m As Map = resultData";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="If m.GetDefault(\"message\", \"\") <> \"\" Then Retur";
if ((_m.GetDefault((Object)("message"),(Object)(""))).equals((Object)("")) == false) { 
if (true) return BA.ObjectToString(_m.Get((Object)("message")));};
 };
 };
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="Dim errorMessage As String = result.GetDefault(\"E";
_errormessage = BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)("")));
RDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="If errorMessage <> \"\" Then Return errorMessage";
if ((_errormessage).equals("") == false) { 
if (true) return _errormessage;};
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="Return fallback";
if (true) return _fallback;
RDebugUtils.currentLine=23330827;
 //BA.debugLineNum = 23330827;BA.debugLine="End Sub";
return "";
}
public String  _resolvefreerammbtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvefreerammbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvefreerammbtext", null));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub ResolveFreeRamMbText As String";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Return PlatformBridge.ResolveFreeRamMbText";
if (true) return _platformbridge._resolvefreerammbtext /*String*/ ();
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="End Sub";
return "";
}
public double  _resolveplayerlevelfactor(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplayerlevelfactor", false))
	 {return ((Double) Debug.delegate(ba, "resolveplayerlevelfactor", null));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
double _playerlevel = 0;
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Private Sub ResolvePlayerLevelFactor As Double";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Dim playerData As Map = stateStore.OfflineData.Ge";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._statestore /*b4j.example.playerstatestore*/ ._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null).GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Dim playerLevel As Double = playerData.GetDefault";
_playerlevel = (double)(BA.ObjectToNumber(_playerdata.GetDefault((Object)("level"),(Object)(100))));
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Return PlayerLevelToFactor(playerLevel)";
if (true) return __ref._playerleveltofactor /*double*/ (null,_playerlevel);
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _resolvenextplaybackboundaryitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvenextplaybackboundaryitem", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolvenextplaybackboundaryitem", null));}
anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _fallbackitem = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub ResolveNextPlaybackBoundaryItem As Map";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim preparedItem As Map = Transition_GetDirectorP";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
_prepareditem = __ref._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="If preparedItem.IsInitialized And preparedItem.Si";
if (_prepareditem.IsInitialized() && _prepareditem.getSize()>0) { 
if (true) return _prepareditem;};
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Return emptyItem";
if (true) return _emptyitem;
 };
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
_nextobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="If nextObject Is Map Then Return nextObject";
if (_nextobject instanceof java.util.Map) { 
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));};
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Dim fallbackItem As Map";
_fallbackitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="fallbackItem.Initialize";
_fallbackitem.Initialize();
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Return fallbackItem";
if (true) return _fallbackitem;
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _resolveplaybacktickdecision(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplaybacktickdecision", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "resolveplaybacktickdecision", null));}
anywheresoftware.b4a.objects.collections.Map _result = null;
long _remain = 0L;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub ResolvePlaybackTickDecision As Map";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="result.Put(\"action\", \"\")";
_result.Put((Object)("action"),(Object)(""));
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="result.Put(\"remainMs\", EffectiveTrackRemainMs)";
_result.Put((Object)("remainMs"),(Object)(__ref._effectivetrackremainms /*long*/ (null)));
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="If Transition_GetDirectorActiveAudioKey = \"\" Then";
if ((__ref._transition_getdirectoractiveaudiokey /*String*/ (null)).equals("")) { 
if (true) return _result;};
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._isplaybackflowactive /*boolean*/ (null)==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="If ShouldTriggerBreakNow Then";
if (__ref._shouldtriggerbreaknow /*boolean*/ (null)) { 
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="result.Put(\"action\", \"trigger_break\")";
_result.Put((Object)("action"),(Object)("trigger_break"));
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="If ShouldHoldPreparedForQueuedItem Then Return re";
if (__ref._shouldholdpreparedforqueueditem /*boolean*/ (null)) { 
if (true) return _result;};
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="Dim remain As Long = result.GetDefault(\"remainMs\"";
_remain = BA.ObjectToLongNumber(_result.GetDefault((Object)("remainMs"),(Object)(0)));
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="If CanCrossfadePreparedItem And remain > 0 And re";
if (__ref._cancrossfadeprepareditem /*boolean*/ (null) && _remain>0 && _remain<=__ref._track_overlap_ms /*int*/ ) { 
RDebugUtils.currentLine=7929873;
 //BA.debugLineNum = 7929873;BA.debugLine="result.Put(\"action\", \"crossfade_prepared_track\")";
_result.Put((Object)("action"),(Object)("crossfade_prepared_track"));
RDebugUtils.currentLine=7929874;
 //BA.debugLineNum = 7929874;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=7929876;
 //BA.debugLineNum = 7929876;BA.debugLine="If CanStartPreparedOnTrackTail And remain > 0 And";
if (__ref._canstartpreparedontracktail /*boolean*/ (null) && _remain>0 && _remain<=__ref._ad_tail_overlap_ms /*int*/ ) { 
RDebugUtils.currentLine=7929877;
 //BA.debugLineNum = 7929877;BA.debugLine="result.Put(\"action\", \"start_prepared_tail\")";
_result.Put((Object)("action"),(Object)("start_prepared_tail"));
RDebugUtils.currentLine=7929878;
 //BA.debugLineNum = 7929878;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=7929880;
 //BA.debugLineNum = 7929880;BA.debugLine="If remain > 0 And remain <= PREFETCH_SECONDS * 10";
if (_remain>0 && _remain<=__ref._prefetch_seconds /*int*/ *1000 && __ref._canprefetchnextnow /*boolean*/ (null,__c.False)) { 
RDebugUtils.currentLine=7929881;
 //BA.debugLineNum = 7929881;BA.debugLine="result.Put(\"action\", \"prefetch_next\")";
_result.Put((Object)("action"),(Object)("prefetch_next"));
RDebugUtils.currentLine=7929882;
 //BA.debugLineNum = 7929882;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=7929884;
 //BA.debugLineNum = 7929884;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=7929885;
 //BA.debugLineNum = 7929885;BA.debugLine="End Sub";
return null;
}
public boolean  _shouldholdpreparedforqueueditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldholdpreparedforqueueditem", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldholdpreparedforqueueditem", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub ShouldHoldPreparedForQueuedItem As Boo";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Return ShouldPrioritizeQueueHeadOverPrepared";
if (true) return __ref._shouldprioritizequeueheadoverprepared /*boolean*/ (null);
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="End Sub";
return false;
}
public String  _resolvetotalrammbtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvetotalrammbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvetotalrammbtext", null));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub ResolveTotalRamMbText As String";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Return PlatformBridge.ResolveTotalRamMbText";
if (true) return _platformbridge._resolvetotalrammbtext /*String*/ ();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackcachefilecounttext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvetrackcachefilecounttext", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackcachefilecounttext", null));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub ResolveTrackCacheFileCountText As Stri";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Return \"\" & mediaCacheService.GetCachedTrackCount";
if (true) return ""+BA.NumberToString(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedtrackcount /*int*/ (null));
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="End Sub";
return "";
}
public String  _resolvetrackcachesizembtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvetrackcachesizembtext", false))
	 {return ((String) Debug.delegate(ba, "resolvetrackcachesizembtext", null));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Private Sub ResolveTrackCacheSizeMbText As String";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Return \"\" & Floor(mediaCacheService.GetCachedTrac";
if (true) return ""+BA.NumberToString(__c.Floor(__ref._mediacacheservice /*b4j.example.mediacache*/ ._getcachedtrackbytes /*long*/ (null)/(double)1024/(double)1024));
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public void  _retrytimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "retrytimer_tick", false))
	 {Debug.delegate(ba, "retrytimer_tick", null); return;}
ResumableSub_RetryTimer_Tick rsub = new ResumableSub_RetryTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RetryTimer_Tick extends BA.ResumableSub {
public ResumableSub_RetryTimer_Tick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _recovered = false;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="If stateStore.GetLastRetryMode = \"audio_device\" T";
if (true) break;

case 7:
//if
this.state = 14;
if ((__ref._statestore /*b4j.example.playerstatestore*/ ._getlastretrymode /*String*/ (null)).equals("audio_device")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Wait For (ProbeAudioOutputRecovery) Complete (re";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "retrytimer_tick"), __ref._probeaudiooutputrecovery /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 10;
_recovered = (boolean) result[1];
;
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="If recovered = False And orchestrationState.IsSt";
if (true) break;

case 10:
//if
this.state = 13;
if (_recovered==parent.__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="ScheduleRetry(\"audio_device\", AUDIO_OUTPUT_RETR";
__ref._scheduleretry /*String*/ (null,"audio_device",__ref._audio_output_retry_delay_ms /*int*/ );
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy Then";

case 14:
//if
this.state = 19;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ) { 
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
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "retrytimer_tick"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _runaudiotimeupdateasync(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "runaudiotimeupdateasync", false))
	 {Debug.delegate(ba, "runaudiotimeupdateasync", new Object[] {_audiokey}); return;}
ResumableSub_RunAudioTimeupdateAsync rsub = new ResumableSub_RunAudioTimeupdateAsync(this,__ref,_audiokey);
rsub.resume(ba, null);
}
public static class ResumableSub_RunAudioTimeupdateAsync extends BA.ResumableSub {
public ResumableSub_RunAudioTimeupdateAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Wait For (HandleAudioTimeupdate(audioKey)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runaudiotimeupdateasync"), __ref._handleaudiotimeupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="audioTimeupdateQueuedByKey.Remove(audioKey)";
__ref._audiotimeupdatequeuedbykey /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_audiokey));
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _rundeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "rundeferredpoststarttasks", false))
	 {return ((String) Debug.delegate(ba, "rundeferredpoststarttasks", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub RunDeferredPostStartTasks";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If isAdWarmupDeferredAfterStartup = False And isP";
if (__ref._isadwarmupdeferredafterstartup /*boolean*/ ==__c.False && __ref._ispoststarttasksdeferredafterstartup /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="If CanRunDeferredPostStartTasks = False Then";
if (__ref._canrundeferredpoststarttasks /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="CancelDeferredPostStartTasks";
__ref._canceldeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="If isAdWarmupDeferredAfterStartup Then";
if (__ref._isadwarmupdeferredafterstartup /*boolean*/ ) { 
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="EnsureAdCacheSyncAsync";
__ref._ensureadcachesyncasync /*void*/ (null);
 };
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="If isPostStartTasksDeferredAfterStartup Then";
if (__ref._ispoststarttasksdeferredafterstartup /*boolean*/ ) { 
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="End Sub";
return "";
}
public void  _runhistoryflushasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "runhistoryflushasync", false))
	 {Debug.delegate(ba, "runhistoryflushasync", null); return;}
ResumableSub_RunHistoryFlushAsync rsub = new ResumableSub_RunHistoryFlushAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_RunHistoryFlushAsync extends BA.ResumableSub {
public ResumableSub_RunHistoryFlushAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Wait For (FlushHistoryBuffer) Complete (unused As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runhistoryflushasync"), __ref._flushhistorybuffer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _runplaybackdirectortimerasync(b4j.example.b4xmainpage __ref,String _source) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "runplaybackdirectortimerasync", false))
	 {Debug.delegate(ba, "runplaybackdirectortimerasync", new Object[] {_source}); return;}
ResumableSub_RunPlaybackDirectorTimerAsync rsub = new ResumableSub_RunPlaybackDirectorTimerAsync(this,__ref,_source);
rsub.resume(ba, null);
}
public static class ResumableSub_RunPlaybackDirectorTimerAsync extends BA.ResumableSub {
public ResumableSub_RunPlaybackDirectorTimerAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _source) {
this.parent = parent;
this.__ref = __ref;
this._source = _source;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _source;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Wait For (RunPlaybackDirectorTick(source)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runplaybackdirectortimerasync"), __ref._runplaybackdirectortick /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_source));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="isPlaybackDirectorTickQueued = False";
__ref._isplaybackdirectortickqueued /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _shouldwatchplaybackprogress(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldwatchplaybackprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldwatchplaybackprogress", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub ShouldWatchPlaybackProgress As Boolean";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="If orchestrationState.IsStopping Then Return Fals";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="If IsPolicyPauseState Then Return False";
if (__ref._ispolicypausestate /*boolean*/ (null)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="If HasObservableActivePlayback Then Return True";
if (__ref._hasobservableactiveplayback /*boolean*/ (null)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="If lastPlaybackWatchdogProgressAt = 0 Then Return";
if (__ref._lastplaybackwatchdogprogressat /*long*/ ==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Return IsPlaybackTransitionInProgress Or orchestr";
if (true) return __ref._isplaybacktransitioninprogress /*boolean*/ (null) || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isplaybackdispatchinprogress /*boolean*/ ;
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="End Sub";
return false;
}
public boolean  _savedownloadedupdatetofile(b4j.example.b4xmainpage __ref,b4j.example.httpjob _j) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savedownloadedupdatetofile", false))
	 {return ((Boolean) Debug.delegate(ba, "savedownloadedupdatetofile", new Object[] {_j}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _instream = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outstream = null;
long _contentlength = 0L;
long _savedsize = 0L;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub SaveDownloadedUpdateToFile(j As HttpJo";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If File.Exists(appUpdateDir, APP_UPDATE_TEMP_FILE";
if (__c.File.Exists(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ )) { 
__c.File.Delete(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ );};
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If File.Exists(appUpdateDir, APP_UPDATE_FILE) The";
if (__c.File.Exists(__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ )) { 
__c.File.Delete(__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ );};
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim inStream As InputStream = j.GetInputStream";
_instream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_instream = _j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput(a";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = __c.File.OpenOutput(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ ,__c.False);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="File.Copy2(inStream, outStream)";
__c.File.Copy2((java.io.InputStream)(_instream.getObject()),(java.io.OutputStream)(_outstream.getObject()));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="outStream.Close";
_outstream.Close();
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="inStream.Close";
_instream.Close();
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim contentLength As Long = ExtractContentLength(";
_contentlength = __ref._extractcontentlength /*long*/ (null,_j);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim savedSize As Long = File.Size(appUpdateDir, A";
_savedsize = __c.File.Size(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ );
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="If savedSize <= 0 Then";
if (_savedsize<=0) { 
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="File.Delete(appUpdateDir, APP_UPDATE_TEMP_FILE)";
__c.File.Delete(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ );
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="TraceWarn(\"update\", \"обновление отклонено\", \"rea";
__ref._tracewarn /*String*/ (null,"update","обновление отклонено","reason=empty_file");
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="If contentLength > 0 And savedSize <> contentLeng";
if (_contentlength>0 && _savedsize!=_contentlength) { 
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="File.Delete(appUpdateDir, APP_UPDATE_TEMP_FILE)";
__c.File.Delete(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ );
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="TraceWarn(\"update\", \"обновление отклонено\", \"rea";
__ref._tracewarn /*String*/ (null,"update","обновление отклонено","reason=size_mismatch expected="+BA.NumberToString(_contentlength)+" actual="+BA.NumberToString(_savedsize));
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="File.Copy(appUpdateDir, APP_UPDATE_TEMP_FILE, app";
__c.File.Copy(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ ,__ref._appupdatedir /*String*/ ,__ref._app_update_file /*String*/ );
RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="File.Delete(appUpdateDir, APP_UPDATE_TEMP_FILE)";
__c.File.Delete(__ref._appupdatedir /*String*/ ,__ref._app_update_temp_file /*String*/ );
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="End Sub";
return false;
}
public String  _schedulebreakwatch(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulebreakwatch", false))
	 {return ((String) Debug.delegate(ba, "schedulebreakwatch", null));}
long _delay = 0L;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub ScheduleBreakWatch";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="If HasPendingExactBreak = False Then Return";
if (__ref._haspendingexactbreak /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Dim delay As Long = Max(1, ((scheduledBreakAt - L";
_delay = (long) (__c.Max(1,((__ref._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000)-250));
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="breakTimer.Interval = delay";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval(_delay);
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="breakTimer.Enabled = True";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="End Sub";
return "";
}
public String  _servicecheckurlvalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "servicecheckurlvalue", false))
	 {return ((String) Debug.delegate(ba, "servicecheckurlvalue", null));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Public Sub ServiceCheckUrlValue As String";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Return SERVICE_CHECK_URL";
if (true) return __ref._service_check_url /*String*/ ;
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showadmeta", false))
	 {return ((String) Debug.delegate(ba, "showadmeta", new Object[] {_item}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub ShowAdMeta(item As Map)";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="uiController.ShowAdMeta(item)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._showadmeta /*String*/ (null,_item);
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return "";
}
public String  _showstream(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showstream", false))
	 {return ((String) Debug.delegate(ba, "showstream", new Object[] {_text}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub ShowStream(text As String)";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="uiController.ShowStream(text)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._showstream /*String*/ (null,_text);
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showtrackmeta", false))
	 {return ((String) Debug.delegate(ba, "showtrackmeta", new Object[] {_item}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub ShowTrackMeta(item As Map)";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="uiController.ShowTrackMeta(item)";
__ref._uicontroller /*b4j.example.playeruicontroller*/ ._showtrackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return "";
}
public void  _startfirsttrackautoasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startfirsttrackautoasync", false))
	 {Debug.delegate(ba, "startfirsttrackautoasync", null); return;}
ResumableSub_StartFirstTrackAutoAsync rsub = new ResumableSub_StartFirstTrackAutoAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_StartFirstTrackAutoAsync extends BA.ResumableSub {
public ResumableSub_StartFirstTrackAutoAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startfirsttrackautoasync"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _startfirsttrackmanualasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startfirsttrackmanualasync", false))
	 {Debug.delegate(ba, "startfirsttrackmanualasync", null); return;}
ResumableSub_StartFirstTrackManualAsync rsub = new ResumableSub_StartFirstTrackManualAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_StartFirstTrackManualAsync extends BA.ResumableSub {
public ResumableSub_StartFirstTrackManualAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete (un";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startfirsttrackmanualasync"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _waitforplaybackactivation(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "waitforplaybackactivation", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "waitforplaybackactivation", new Object[] {_audiokey,_item,_timeoutms}));}
ResumableSub_WaitForPlaybackActivation rsub = new ResumableSub_WaitForPlaybackActivation(this,__ref,_audiokey,_item,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WaitForPlaybackActivation extends BA.ResumableSub {
public ResumableSub_WaitForPlaybackActivation(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this._item = _item;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
anywheresoftware.b4a.objects.collections.Map _item;
int _timeoutms;
long _startedat = 0L;
String _directoractiveaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _directoractiveitem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Do While DateTime.Now - startedAt < timeoutMs";
if (true) break;

case 1:
//do while
this.state = 14;
while (parent.__c.DateTime.getNow()-_startedat<_timeoutms) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Dim directorActiveAudioKey As String = Transitio";
_directoractiveaudiokey = __ref._transition_getdirectoractiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Dim directorActiveItem As Map = Transition_GetDi";
_directoractiveitem = new anywheresoftware.b4a.objects.collections.Map();
_directoractiveitem = __ref._transition_getdirectoractiveitem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="If directorActiveAudioKey = audioKey And ItemsMa";
if (true) break;

case 4:
//if
this.state = 9;
if ((_directoractiveaudiokey).equals(_audiokey) && __ref._itemsmatch /*boolean*/ (null,_directoractiveitem,_item)) { 
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
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="If runtimeState.PendingPlayAudioKey = \"\" Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ ).equals("")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="Return directorActiveAudioKey = audioKey And It";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((_directoractiveaudiokey).equals(_audiokey) && __ref._itemsmatch /*boolean*/ (null,_directoractiveitem,_item)));return;};
 if (true) break;

case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="Sleep(25)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "waitforplaybackactivation"),(int) (25));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="TraceWarn(\"audio\", \"таймаут старта трека\", \"audio";
__ref._tracewarn /*String*/ (null,"audio","таймаут старта трека","audio="+_audiokey+" trackId="+__ref._tracetrackvalue /*String*/ (null,_item)+" pendingPlayAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ +" activeAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ +" directorActiveAudio="+__ref._transition_getdirectoractiveaudiokey /*String*/ (null));
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _stopplayerasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stopplayerasync", false))
	 {Debug.delegate(ba, "stopplayerasync", null); return;}
ResumableSub_StopPlayerAsync rsub = new ResumableSub_StopPlayerAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_StopPlayerAsync extends BA.ResumableSub {
public ResumableSub_StopPlayerAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _unused2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Wait For (StopPlayer) Complete (unused2 As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "stopplayerasync"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _timezoneoffsetminutesvalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "timezoneoffsetminutesvalue", false))
	 {return ((Integer) Debug.delegate(ba, "timezoneoffsetminutesvalue", null));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Public Sub TimezoneOffsetMinutesValue As Int";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="Return TimezoneOffsetMinutes";
if (true) return __ref._timezoneoffsetminutes /*int*/ (null);
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="End Sub";
return 0;
}
public String  _tracestate(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracestate", false))
	 {return ((String) Debug.delegate(ba, "tracestate", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub TraceState(category As String, message";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="traceRouter.TraceState(category, message, details";
__ref._tracerouter /*b4j.example.playbacktracerouter*/ ._tracestate /*String*/ (null,_category,_message,_details);
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="End Sub";
return "";
}
public String  _traceuploadtimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceuploadtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "traceuploadtimer_tick", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub TraceUploadTimer_Tick";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return";
if ((__ref._playercode /*String*/ ).equals("") || (__ref._deviceid /*String*/ ).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If traceUploader.IsUploadInProgress Then Return";
if (__ref._traceuploader /*b4j.example.playbacktraceuploader*/ ._isuploadinprogress /*boolean*/ (null)) { 
if (true) return "";};
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="WriteHealthSnapshot(\"таймер\")";
__ref._writehealthsnapshot /*String*/ (null,"таймер");
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="If traceUploader.IsTraceUploadEnabled = False The";
if (__ref._traceuploader /*b4j.example.playbacktraceuploader*/ ._istraceuploadenabled /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="traceUploader.FlushTraceBufferAsync";
__ref._traceuploader /*b4j.example.playbacktraceuploader*/ ._flushtracebufferasync /*void*/ (null);
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="End Sub";
return "";
}
public String  _transition_activateloadeditem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_activateloadeditem", false))
	 {return ((String) Debug.delegate(ba, "transition_activateloadeditem", new Object[] {_args}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Transition_ActivateLoadedItem(args As M";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="ActivateLoadedItem(args.GetDefault(\"audioKey\", \"\"";
__ref._activateloadeditem /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item")))),(int)(BA.ObjectToNumber(_args.GetDefault((Object)("fadeInMs"),(Object)(0)))));
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public String  _transition_clearpreparedstate(b4j.example.b4xmainpage __ref,boolean _resetplayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_clearpreparedstate", false))
	 {return ((String) Debug.delegate(ba, "transition_clearpreparedstate", new Object[] {_resetplayer}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Transition_ClearPreparedState(resetPlay";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="ClearPreparedState(resetPlayer)";
__ref._clearpreparedstate /*String*/ (null,_resetplayer);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public String  _transition_consumepreparedqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_consumepreparedqueueitem", false))
	 {return ((String) Debug.delegate(ba, "transition_consumepreparedqueueitem", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Transition_ConsumePreparedQueueItem";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="ConsumePreparedQueueItem";
__ref._consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return "";
}
public double  _transition_currentvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_currentvolume", false))
	 {return ((Double) Debug.delegate(ba, "transition_currentvolume", new Object[] {_item}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Transition_CurrentVolume(item As Map) A";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Return CurrentVolume(item)";
if (true) return __ref._currentvolume /*double*/ (null,_item);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return 0;
}
public String  _transition_describeitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_describeitem", false))
	 {return ((String) Debug.delegate(ba, "transition_describeitem", new Object[] {_item}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Transition_DescribeItem(item As Map) As";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return DescribeItem(item)";
if (true) return __ref._describeitem /*String*/ (null,(Object)(_item.getObject()));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public b4j.example.audioplayer  _transition_getaudiobykey(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getaudiobykey", false))
	 {return ((b4j.example.audioplayer) Debug.delegate(ba, "transition_getaudiobykey", new Object[] {_audiokey}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub Transition_GetAudioByKey(audioKey As St";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return GetAudioByKey(audioKey)";
if (true) return __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey);
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return null;
}
public String  _transition_getplaybackflowstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "transition_getplaybackflowstate", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub Transition_GetPlaybackFlowState As Stri";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="If directorState.IsInitialized Then Return direct";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __ref._directorstate /*b4j.example.playbackdirectorstate*/ ._flowstate /*String*/ ;};
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Return playbackFlowState";
if (true) return __ref._playbackflowstate /*String*/ ;
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="End Sub";
return "";
}
public boolean  _transition_itemsmatch(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "transition_itemsmatch", new Object[] {_args}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub Transition_ItemsMatch(args As Map) As B";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return ItemsMatch(args.Get(\"first\"), args.Get(\"se";
if (true) return __ref._itemsmatch /*boolean*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("first")))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("second")))));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return false;
}
public String  _transition_resolveplaybackmediaurl(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_resolveplaybackmediaurl", false))
	 {return ((String) Debug.delegate(ba, "transition_resolveplaybackmediaurl", new Object[] {_args}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub Transition_ResolvePlaybackMediaUrl(args";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return ResolvePlaybackMediaUrl(args.GetDefault(\"a";
if (true) return __ref._resolveplaybackmediaurl /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item")))));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return "";
}
public String  _transition_setdirectorpendingprepare(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_setdirectorpendingprepare", false))
	 {return ((String) Debug.delegate(ba, "transition_setdirectorpendingprepare", new Object[] {_args}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub Transition_SetDirectorPendingPrepare(ar";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="If directorState.IsInitialized = False Then Retur";
if (__ref._directorstate /*b4j.example.playbackdirectorstate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="directorState.SetPendingPrepare(args.GetDefault(\"";
__ref._directorstate /*b4j.example.playbackdirectorstate*/ ._setpendingprepare /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.GetDefault((Object)("item"),__c.Null))));
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="MirrorRuntimeStateFromDirector";
__ref._mirrorruntimestatefromdirector /*String*/ (null);
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="End Sub";
return "";
}
public String  _transition_setplaybackflowstate(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "transition_setplaybackflowstate", new Object[] {_args}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub Transition_SetPlaybackFlowState(args As";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="SetPlaybackFlowState(args.GetDefault(\"state\", FLO";
__ref._setplaybackflowstate /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("state"),(Object)(__ref._flow_idle /*String*/ ))),BA.ObjectToString(_args.GetDefault((Object)("reason"),(Object)("transition"))));
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _transition_waitforpreparedaudio(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_waitforpreparedaudio", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "transition_waitforpreparedaudio", new Object[] {_args}));}
ResumableSub_Transition_WaitForPreparedAudio rsub = new ResumableSub_Transition_WaitForPreparedAudio(this,__ref,_args);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Transition_WaitForPreparedAudio extends BA.ResumableSub {
public ResumableSub_Transition_WaitForPreparedAudio(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) {
this.parent = parent;
this.__ref = __ref;
this._args = _args;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _args;
String _audiokey = "";
anywheresoftware.b4a.objects.collections.Map _item = null;
int _timeoutms = 0;
anywheresoftware.b4a.objects.collections.Map _result = null;
boolean _prepared = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim audioKey As String = args.GetDefault(\"audioKe";
_audiokey = BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)("")));
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim item As Map = args.Get(\"item\")";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item"))));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim timeoutMs As Int = args.GetDefault(\"timeoutMs";
_timeoutms = (int)(BA.ObjectToNumber(_args.GetDefault((Object)("timeoutMs"),(Object)(__ref._audio_ready_timeout_ms /*int*/ ))));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Wait For (WaitForPreparedAudio(audioKey, item, ti";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "transition_waitforpreparedaudio"), __ref._waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey,_item,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="result.Put(\"Success\", prepared)";
_result.Put((Object)("Success"),(Object)(_prepared));
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _waitforpreparedaudio(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "waitforpreparedaudio", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "waitforpreparedaudio", new Object[] {_audiokey,_item,_timeoutms}));}
ResumableSub_WaitForPreparedAudio rsub = new ResumableSub_WaitForPreparedAudio(this,__ref,_audiokey,_item,_timeoutms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WaitForPreparedAudio extends BA.ResumableSub {
public ResumableSub_WaitForPreparedAudio(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _timeoutms) {
this.parent = parent;
this.__ref = __ref;
this._audiokey = _audiokey;
this._item = _item;
this._timeoutms = _timeoutms;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _audiokey;
anywheresoftware.b4a.objects.collections.Map _item;
int _timeoutms;
long _startedat = 0L;
String _directorpreparedaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _directorprepareditem = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Do While DateTime.Now - startedAt < timeoutMs";
if (true) break;

case 1:
//do while
this.state = 14;
while (parent.__c.DateTime.getNow()-_startedat<_timeoutms) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="Dim directorPreparedAudioKey As String = Transit";
_directorpreparedaudiokey = __ref._transition_getdirectorpreparedaudiokey /*String*/ (null);
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Dim directorPreparedItem As Map = Transition_Get";
_directorprepareditem = new anywheresoftware.b4a.objects.collections.Map();
_directorprepareditem = __ref._transition_getdirectorprepareditem /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="If directorPreparedAudioKey = audioKey And Items";
if (true) break;

case 4:
//if
this.state = 9;
if ((_directorpreparedaudiokey).equals(_audiokey) && __ref._itemsmatch /*boolean*/ (null,_directorprepareditem,_item)) { 
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
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="If runtimeState.PendingPrepareAudioKey = \"\" Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ ).equals("")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="Return directorPreparedAudioKey = audioKey And";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((_directorpreparedaudiokey).equals(_audiokey) && __ref._itemsmatch /*boolean*/ (null,_directorprepareditem,_item)));return;};
 if (true) break;

case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="Sleep(25)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "waitforpreparedaudio"),(int) (25));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=10944523;
 //BA.debugLineNum = 10944523;BA.debugLine="TraceWarn(\"audio\", \"таймаут preload\", \"audio=\" &";
__ref._tracewarn /*String*/ (null,"audio","таймаут preload","audio="+_audiokey+" trackId="+__ref._tracetrackvalue /*String*/ (null,_item)+" pendingPrepareAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ +" preparedAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ +" directorPreparedAudio="+__ref._transition_getdirectorpreparedaudiokey /*String*/ (null));
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=10944525;
 //BA.debugLineNum = 10944525;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _txtplayercode_action(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_action", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_action", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub txtPlayerCode_Action";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="BtnSetupSubmit_Click";
__ref._btnsetupsubmit_click /*void*/ (null);
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_focuschanged(b4j.example.b4xmainpage __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub txtPlayerCode_FocusChanged (hasFocus A";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="isCodeInputFocused = hasFocus";
__ref._iscodeinputfocused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="UpdateCodeInputAppearance(hasFocus)";
__ref._updatecodeinputappearance /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_textchanged(b4j.example.b4xmainpage __ref,String _oldvalue,String _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_textchanged", new Object[] {_oldvalue,_newvalue}));}
String _filtered = "";
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub txtPlayerCode_TextChanged (oldValue As";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim filtered As String = FilterPlayerCode(newValu";
_filtered = __ref._filterplayercode /*String*/ (null,_newvalue);
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="If filtered <> newValue Then";
if ((_filtered).equals(_newvalue) == false) { 
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="txtPlayerCode.Text = filtered";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_filtered);
 };
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="End Sub";
return "";
}
}