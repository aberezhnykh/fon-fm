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
public int _history_flush_interval_ms = 0;
public int _trace_flush_interval_ms = 0;
public String _data_base_url = "";
public String _playlist_cdn_base_url = "";
public String _service_check_url = "";
public String _external_connectivity_check_url = "";
public boolean _use_data_playback_resolver = false;
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
public int _track_cache_warmup_delay_ms = 0;
public int _lookahead_queue_target_items = 0;
public int _cache_audit_start_delay_ms = 0;
public int _cache_audit_step_interval_ms = 0;
public int _cache_audit_recheck_interval_ms = 0;
public long _track_cache_prune_cooldown_ms = 0L;
public int _data_refresh_ms = 0;
public int _fetch_timeout_ms = 0;
public int _audio_ready_timeout_ms = 0;
public int _playback_watchdog_interval_ms = 0;
public long _playback_watchdog_stall_ms = 0L;
public long _playback_watchdog_recovery_cooldown_ms = 0L;
public long _playback_watchdog_progress_delta_ms = 0L;
public long _playback_watchdog_grace_ms = 0L;
public int _connectivity_check_timeout_ms = 0;
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
public float _playiconbasesize = 0f;
public float _stopiconbasesize = 0f;
public float _headeractionfontsize = 0f;
public float _codefontsize = 0f;
public boolean _iscodeinputfocused = false;
public b4j.example.audioplayer _audioprimary = null;
public b4j.example.audioplayer _audiosecondary = null;
public b4j.example.adscheduler _localadscheduler = null;
public b4j.example.dataplaybackresolver _dataresolver = null;
public b4j.example.offlinestore _offlinestoreservice = null;
public b4j.example.traceservice _apptraceservice = null;
public b4j.example.mediacache _mediacacheservice = null;
public b4j.example.keyvaluestore _storage = null;
public anywheresoftware.b4a.objects.collections.List _playqueue = null;
public anywheresoftware.b4a.objects.collections.Map _messages = null;
public int _traceloglimit = 0;
public int _serversnapshotlimit = 0;
public anywheresoftware.b4a.objects.collections.Map _offlinedata = null;
public anywheresoftware.b4a.objects.Timer _retrytimer = null;
public anywheresoftware.b4a.objects.Timer _breaktimer = null;
public anywheresoftware.b4a.objects.Timer _historyflushtimer = null;
public anywheresoftware.b4a.objects.Timer _traceuploadtimer = null;
public anywheresoftware.b4a.objects.Timer _orbittimer = null;
public anywheresoftware.b4a.objects.Timer _offlinedatarefreshtimer = null;
public anywheresoftware.b4a.objects.Timer _localadminutetimer = null;
public anywheresoftware.b4a.objects.Timer _trackcachewarmuptimer = null;
public anywheresoftware.b4a.objects.Timer _cacheaudittimer = null;
public anywheresoftware.b4a.objects.Timer _playbackwatchdogtimer = null;
public anywheresoftware.b4j.objects.Shell _machineguidshell = null;
public String _playercode = "";
public String _deviceid = "";
public String _appscreenmode = "";
public String _nextstartmode = "";
public b4j.example.playbackruntimestate _runtimestate = null;
public b4j.example.playbackmetastate _metastate = null;
public b4j.example.playbackorchestrationstate _orchestrationstate = null;
public b4j.example.playbackdatapolicystate _datapolicystate = null;
public b4j.example.playbackretryfallbackstate _retryfallbackstate = null;
public b4j.example.playbackqueuestate _queuestate = null;
public b4j.example.playbackqueuebuilder _queuebuilder = null;
public b4j.example.playbacktransitioncoordinator _transitioncoordinator = null;
public b4j.example.playbackfacade _facade = null;
public b4j.example.playbackresponseadapter _responseadapter = null;
public boolean _initialstartfadepending = false;
public boolean _ishistoryflushinprogress = false;
public boolean _istraceuploadinprogress = false;
public anywheresoftware.b4a.objects.collections.List _cachedrelevanttrackids = null;
public long _lasttrackcachepruneat = 0L;
public int _consecutivenetworkerrors = 0;
public long _lastdataokat = 0L;
public long _lasthistoryokat = 0L;
public long _lastplaybackwatchdogpositionms = 0L;
public String _lastplaybackwatchdogtrackid = "";
public long _lastplaybackwatchdogprogressat = 0L;
public long _lastplaybackwatchdogrecoveryat = 0L;
public boolean _isplaybackwatchdogtickinprogress = false;
public int _playlistindex = 0;
public int _orbitpulsestep = 0;
public double _orbitfadevalue = 0;
public double _orbitfadetarget = 0;
public boolean _isstartupsequenceinprogress = false;
public boolean _isadwarmupdeferredafterstartup = false;
public boolean _ispoststarttasksdeferredafterstartup = false;
public String _playbackflowstate = "";
public b4j.example.main _main = null;
public b4j.example.uistyle _uistyle = null;
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
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub SaveWindowState";
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Try";
try {RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Dim form As Form = B4XPages.GetNativeParent(Me)";
_form = _b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this);
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="If form.IsInitialized = False Then Return";
if (_form.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="If fx.PrimaryScreen.MaxX > form.Width Then";
if (_fx.getPrimaryScreen().getMaxX()>_form.getWidth()) { 
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="storage.Put(\"WindowTop\", form.WindowTop)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowTop",(Object)(_form.getWindowTop()));
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="storage.Put(\"WindowLeft\", form.WindowLeft)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowLeft",(Object)(_form.getWindowLeft()));
RDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="storage.Put(\"WindowWidth\", form.WindowWidth)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowWidth",(Object)(_form.getWindowWidth()));
RDebugUtils.currentLine=17825802;
 //BA.debugLineNum = 17825802;BA.debugLine="storage.Put(\"WindowHeight\", form.WindowHeight)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowHeight",(Object)(_form.getWindowHeight()));
RDebugUtils.currentLine=17825803;
 //BA.debugLineNum = 17825803;BA.debugLine="TraceLog(\"окно save left=\" & form.WindowLeft &";
__ref._tracelog /*String*/ (null,"окно save left="+BA.NumberToString(_form.getWindowLeft())+" top="+BA.NumberToString(_form.getWindowTop())+" width="+BA.NumberToString(_form.getWindowWidth())+" height="+BA.NumberToString(_form.getWindowHeight()));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=17825806;
 //BA.debugLineNum = 17825806;BA.debugLine="TraceLog(\"окно save ошибка message=\" & LastExcep";
__ref._tracelog /*String*/ (null,"окно save ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=17825809;
 //BA.debugLineNum = 17825809;BA.debugLine="End Sub";
return "";
}
public String  _flushpendingcacheindexes(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushpendingcacheindexes", false))
	 {return ((String) Debug.delegate(ba, "flushpendingcacheindexes", null));}
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Public Sub FlushPendingCacheIndexes";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=57606146;
 //BA.debugLineNum = 57606146;BA.debugLine="End Sub";
return "";
}
public String  _cleanupplaybacktempfiles(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cleanupplaybacktempfiles", false))
	 {return ((String) Debug.delegate(ba, "cleanupplaybacktempfiles", null));}
RDebugUtils.currentLine=55967744;
 //BA.debugLineNum = 55967744;BA.debugLine="Public Sub CleanupPlaybackTempFiles";
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=55967747;
 //BA.debugLineNum = 55967747;BA.debugLine="End Sub";
return "";
}
public String  _activateloadeditem(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activateloadeditem", false))
	 {return ((String) Debug.delegate(ba, "activateloadeditem", new Object[] {_audiokey,_item,_fadeinms}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub ActivateLoadedItem(audioKey As String,";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="runtimeState.SetActive(audioKey, item)";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._setactive /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="SetPlaybackFlowState(FLOW_PLAYING, \"activate_load";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_playing /*String*/ ,"activate_loaded_item");
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="metaState.SetCurrentMedia(ResolvePlaybackMediaUrl";
__ref._metastate /*b4j.example.playbackmetastate*/ ._setcurrentmedia /*String*/ (null,__ref._resolveplaybackmediaurl /*String*/ (null,_audiokey,_item),BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)(""))));
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="runtimeState.ClearPreparedIfMatchesAudio(audioKey";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpreparedifmatchesaudio /*String*/ (null,_audiokey);
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="UpdatePlaybackMeta(item)";
__ref._updateplaybackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="mediaCacheService.TouchCachedItem(item)";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._touchcacheditem /*String*/ (null,_item);
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="TraceLog(\"воспроизведение activate audio=\" & audi";
__ref._tracelog /*String*/ (null,"воспроизведение activate audio="+_audiokey+" item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+" fadeInMs="+BA.NumberToString(_fadeinms));
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="TraceInfo(\"audio\", \"плеер play\", \"player=\" & Trac";
__ref._traceinfo /*String*/ (null,"audio","плеер play","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_item)+" id="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="GetAudioByKey(audioKey).PlayWithFade(fadeInMs)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._playwithfade /*String*/ (null,_fadeinms);
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="MarkPlaybackWatchdogProgress(item.GetDefault(\"id\"";
__ref._markplaybackwatchdogprogress /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))),(long) (0));
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="ScheduleTrackCacheWarmup";
__ref._scheduletrackcachewarmup /*String*/ (null);
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="ScheduleHistoryLog(item)";
__ref._schedulehistorylog /*String*/ (null,_item);
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=6619152;
 //BA.debugLineNum = 6619152;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="RequestDeferredPostStartTasks";
__ref._requestdeferredpoststarttasks /*String*/ (null);
 }else 
{RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="Else If metaState.CurrentMediaType = \"track\" And";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") && __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="BackfillPlaybackQueueAsync";
__ref._backfillplaybackqueueasync /*void*/ (null);
 }}
;
RDebugUtils.currentLine=6619157;
 //BA.debugLineNum = 6619157;BA.debugLine="End Sub";
return "";
}
public String  _setplaybackflowstate(b4j.example.b4xmainpage __ref,String _newstate,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "setplaybackflowstate", new Object[] {_newstate,_reason}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub SetPlaybackFlowState(newState As Strin";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If newState = \"\" Then newState = FLOW_IDLE";
if ((_newstate).equals("")) { 
_newstate = __ref._flow_idle /*String*/ ;};
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If playbackFlowState = newState Then Return";
if ((__ref._playbackflowstate /*String*/ ).equals(_newstate)) { 
if (true) return "";};
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="TraceLog(\"flow переход from=\" & playbackFlowState";
__ref._tracelog /*String*/ (null,"flow переход from="+__ref._playbackflowstate /*String*/ +" to="+_newstate+" reason="+_reason);
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="playbackFlowState = newState";
__ref._playbackflowstate /*String*/  = _newstate;
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackmediaurl(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplaybackmediaurl", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackmediaurl", new Object[] {_audiokey,_item}));}
RDebugUtils.currentLine=55902208;
 //BA.debugLineNum = 55902208;BA.debugLine="Private Sub ResolvePlaybackMediaUrl(audioKey As St";
RDebugUtils.currentLine=55902209;
 //BA.debugLineNum = 55902209;BA.debugLine="Return mediaCacheService.ResolvePlaybackMediaUri(";
if (true) return __ref._mediacacheservice /*b4j.example.mediacache*/ ._resolveplaybackmediauri /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=55902210;
 //BA.debugLineNum = 55902210;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateplaybackmeta", false))
	 {return ((String) Debug.delegate(ba, "updateplaybackmeta", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub UpdatePlaybackMeta(item As Map)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="ShowAdMeta(item)";
__ref._showadmeta /*String*/ (null,_item);
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="ShowStream(MessageValue(\"ad_label\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"ad_label"));
 }else {
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="ShowTrackMeta(item)";
__ref._showtrackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="ShowStream(item.GetDefault(\"stream\", \"\"))";
__ref._showstream /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)(""))));
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="If HandleDiagnosticTraceMessage(message) Then Ret";
if (__ref._handlediagnostictracemessage /*boolean*/ (null,_message)) { 
if (true) return "";};
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public String  _describeitem(b4j.example.b4xmainpage __ref,Object _itemobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_itemobj}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub DescribeItem(itemObj As Object) As Str";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
 }else {
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="Return \"<empty>\"";
if (true) return "<empty>";
 };
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="If item.IsInitialized = False Then Return \"<empty";
if (_item.IsInitialized()==__c.False) { 
if (true) return "<empty>";};
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="parts.Add(\"тип=\" & item.GetDefault(\"type\", \"\"))";
_parts.Add((Object)("тип="+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=14024714;
 //BA.debugLineNum = 14024714;BA.debugLine="If item.GetDefault(\"id\", \"\") <> \"\" Then parts.Add";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("id="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")))));};
RDebugUtils.currentLine=14024715;
 //BA.debugLineNum = 14024715;BA.debugLine="If item.GetDefault(\"title\", \"\") <> \"\" Then parts.";
if ((_item.GetDefault((Object)("title"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("название="+BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)("")))));};
RDebugUtils.currentLine=14024716;
 //BA.debugLineNum = 14024716;BA.debugLine="If item.GetDefault(\"stream\", \"\") <> \"\" Then parts";
if ((_item.GetDefault((Object)("stream"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("поток="+BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)("")))));};
RDebugUtils.currentLine=14024717;
 //BA.debugLineNum = 14024717;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("сет="+BA.ObjectToString(_item.GetDefault((Object)("set"),(Object)("")))));};
RDebugUtils.currentLine=14024718;
 //BA.debugLineNum = 14024718;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("код="+BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")))));};
RDebugUtils.currentLine=14024719;
 //BA.debugLineNum = 14024719;BA.debugLine="Return JoinList(parts, \", \")";
if (true) return __ref._joinlist /*String*/ (null,_parts,", ");
RDebugUtils.currentLine=14024720;
 //BA.debugLineNum = 14024720;BA.debugLine="End Sub";
return "";
}
public String  _traceinfo(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceinfo", false))
	 {return ((String) Debug.delegate(ba, "traceinfo", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Private Sub TraceInfo(category As String, message";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="WriteTraceEntry(\"INFO\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"INFO",_category,_message,_details);
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="End Sub";
return "";
}
public String  _traceplayernumber(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceplayernumber", false))
	 {return ((String) Debug.delegate(ba, "traceplayernumber", new Object[] {_audiokey}));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Private Sub TracePlayerNumber(audioKey As String)";
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="If audioKey = \"secondary\" Then Return \"2\"";
if ((_audiokey).equals("secondary")) { 
if (true) return "2";};
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="Return \"1\"";
if (true) return "1";
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="End Sub";
return "";
}
public String  _traceitemtype(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceitemtype", false))
	 {return ((String) Debug.delegate(ba, "traceitemtype", new Object[] {_item}));}
RDebugUtils.currentLine=59768832;
 //BA.debugLineNum = 59768832;BA.debugLine="Private Sub TraceItemType(item As Map) As String";
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="Return item.GetDefault(\"type\", \"\")";
if (true) return BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="End Sub";
return "";
}
public String  _tracetrackvalue(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracetrackvalue", false))
	 {return ((String) Debug.delegate(ba, "tracetrackvalue", new Object[] {_item}));}
String _codevalue = "";
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Private Sub TraceTrackValue(item As Map) As String";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="If item.IsInitialized = False Then Return \"\"";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="Dim codeValue As String = item.GetDefault(\"code\",";
_codevalue = BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")));
RDebugUtils.currentLine=58916867;
 //BA.debugLineNum = 58916867;BA.debugLine="If codeValue <> \"\" Then Return codeValue";
if ((_codevalue).equals("") == false) { 
if (true) return _codevalue;};
RDebugUtils.currentLine=58916868;
 //BA.debugLineNum = 58916868;BA.debugLine="Return item.GetDefault(\"id\", \"\")";
if (true) return BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=58916869;
 //BA.debugLineNum = 58916869;BA.debugLine="End Sub";
return "";
}
public b4j.example.audioplayer  _getaudiobykey(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getaudiobykey", false))
	 {return ((b4j.example.audioplayer) Debug.delegate(ba, "getaudiobykey", new Object[] {_audiokey}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub GetAudioByKey(audioKey As String) As A";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="If audioKey = \"secondary\" Then Return audioSecond";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._audiosecondary /*b4j.example.audioplayer*/ ;};
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Return audioPrimary";
if (true) return __ref._audioprimary /*b4j.example.audioplayer*/ ;
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return null;
}
public String  _markplaybackwatchdogprogress(b4j.example.b4xmainpage __ref,String _trackid,long _positionms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "markplaybackwatchdogprogress", false))
	 {return ((String) Debug.delegate(ba, "markplaybackwatchdogprogress", new Object[] {_trackid,_positionms}));}
RDebugUtils.currentLine=60555264;
 //BA.debugLineNum = 60555264;BA.debugLine="Private Sub MarkPlaybackWatchdogProgress(trackId A";
RDebugUtils.currentLine=60555265;
 //BA.debugLineNum = 60555265;BA.debugLine="lastPlaybackWatchdogTrackId = trackId";
__ref._lastplaybackwatchdogtrackid /*String*/  = _trackid;
RDebugUtils.currentLine=60555266;
 //BA.debugLineNum = 60555266;BA.debugLine="lastPlaybackWatchdogPositionMs = positionMs";
__ref._lastplaybackwatchdogpositionms /*long*/  = _positionms;
RDebugUtils.currentLine=60555267;
 //BA.debugLineNum = 60555267;BA.debugLine="lastPlaybackWatchdogProgressAt = DateTime.Now";
__ref._lastplaybackwatchdogprogressat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=60555268;
 //BA.debugLineNum = 60555268;BA.debugLine="End Sub";
return "";
}
public String  _scheduletrackcachewarmup(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scheduletrackcachewarmup", false))
	 {return ((String) Debug.delegate(ba, "scheduletrackcachewarmup", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub ScheduleTrackCacheWarmup";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="trackCacheWarmupTimer.Enabled = False";
__ref._trackcachewarmuptimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="RequestDeferredPostStartTasks";
__ref._requestdeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return "";};
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="trackCacheWarmupTimer.Interval = TRACK_CACHE_WARM";
__ref._trackcachewarmuptimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._track_cache_warmup_delay_ms /*int*/ ));
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="trackCacheWarmupTimer.Enabled = True";
__ref._trackcachewarmuptimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="End Sub";
return "";
}
public String  _schedulehistorylog(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulehistorylog", false))
	 {return ((String) Debug.delegate(ba, "schedulehistorylog", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub ScheduleHistoryLog(item As Map)";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
if (true) return "";};
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="If itemType = \"track\" Then";
if ((_itemtype).equals("track")) { 
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="TraceLog(\"история confirm reason=playback_start";
__ref._tracelog /*String*/ (null,"история confirm reason=playback_start item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="QueueHistoryRecordAt(item, DateTime.Now)";
__ref._queuehistoryrecordat /*String*/ (null,_item,__c.DateTime.getNow());
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="TraceLog(\"история stage mode=ad_complete item=\" &";
__ref._tracelog /*String*/ (null,"история stage mode=ad_complete item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="metaState.StageHistoryItem(item, DateTime.Now)";
__ref._metastate /*b4j.example.playbackmetastate*/ ._stagehistoryitem /*String*/ (null,_item,__c.DateTime.getNow());
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelay(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetretrydelay", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelay", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub ResetRetryDelay";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="retryFallbackState.ResetRetryDelays(LOCAL_RETRY_D";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._resetretrydelays /*String*/ (null,__ref._local_retry_delay_initial /*int*/ ,__ref._server_retry_delay_initial /*int*/ );
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="If consecutiveNetworkErrors > 0 Then TraceInfo(\"n";
if (__ref._consecutivenetworkerrors /*int*/ >0) { 
__ref._traceinfo /*String*/ (null,"network","retry сброшен","errors="+BA.NumberToString(__ref._consecutivenetworkerrors /*int*/ ));};
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="consecutiveNetworkErrors = 0";
__ref._consecutivenetworkerrors /*int*/  = (int) (0);
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="End Sub";
return "";
}
public String  _requestdeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "requestdeferredpoststarttasks", false))
	 {return ((String) Debug.delegate(ba, "requestdeferredpoststarttasks", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub RequestDeferredPostStartTasks";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="isPostStartTasksDeferredAfterStartup = True";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.True;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public void  _backfillplaybackqueueasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "backfillplaybackqueueasync", false))
	 {Debug.delegate(ba, "backfillplaybackqueueasync", null); return;}
ResumableSub_BackfillPlaybackQueueAsync rsub = new ResumableSub_BackfillPlaybackQueueAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BackfillPlaybackQueueAsync extends BA.ResumableSub {
public ResumableSub_BackfillPlaybackQueueAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _queueprepared = false;

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
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="If isStartupSequenceInProgress Then";
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
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="RequestDeferredPostStartTasks";
__ref._requestdeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="TraceLog(\"отложенный старт skip initiator=Backfi";
__ref._tracelog /*String*/ (null,"отложенный старт skip initiator=BackfillPlaybackQueueAsync reason=startup_in_progress");
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="If orchestrationState.IsStarted = False Or orches";

case 4:
//if
this.state = 9;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
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
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="If metaState.CurrentMediaType <> \"track\" Then Ret";
if (true) break;

case 10:
//if
this.state = 15;
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") == false) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="If playQueue.Size >= LOOKAHEAD_QUEUE_TARGET_ITEMS";
if (true) break;

case 16:
//if
this.state = 21;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._lookahead_queue_target_items /*int*/ ) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) return ;
if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER = False Then Return";
if (true) break;

case 22:
//if
this.state = 27;
if (__ref._use_data_playback_resolver /*boolean*/ ==parent.__c.False) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="If CanUseDataPlaybackResolver = False Then Return";
if (true) break;

case 28:
//if
this.state = 33;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
if (true) return ;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="If orchestrationState.BeginQueueBackfill = False";
if (true) break;

case 34:
//if
this.state = 39;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._beginqueuebackfill /*boolean*/ (null)==parent.__c.False) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) return ;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="TraceLog(\"очередь добор начало current=\" & playQu";
__ref._tracelog /*String*/ (null,"очередь добор начало current="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" target="+BA.NumberToString(__ref._lookahead_queue_target_items /*int*/ ));
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="Wait For (EnsureDataPlaybackQueue(LOOKAHEAD_QUEUE";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "backfillplaybackqueueasync"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._lookahead_queue_target_items /*int*/ ));
this.state = 46;
return;
case 46:
//C
this.state = 40;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="orchestrationState.EndQueueBackfill";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._endqueuebackfill /*String*/ (null);
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="If queuePrepared And playQueue.Size > 0 Then";
if (true) break;

case 40:
//if
this.state = 45;
if (_queueprepared && __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="TraceLog(\"очередь добор итог success=true queue=";
__ref._tracelog /*String*/ (null,"очередь добор итог success=true queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="ScheduleTrackCacheWarmup";
__ref._scheduletrackcachewarmup /*String*/ (null);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="TraceLog(\"очередь добор итог success=false queue";
__ref._tracelog /*String*/ (null,"очередь добор итог success=false queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=6684693;
 //BA.debugLineNum = 6684693;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public long  _activeplaybackpositionms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activeplaybackpositionms", false))
	 {return ((Long) Debug.delegate(ba, "activeplaybackpositionms", null));}
RDebugUtils.currentLine=60424192;
 //BA.debugLineNum = 60424192;BA.debugLine="Private Sub ActivePlaybackPositionMs As Long";
RDebugUtils.currentLine=60424193;
 //BA.debugLineNum = 60424193;BA.debugLine="If runtimeState.ActiveAudioKey = \"\" Then Return -";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("")) { 
if (true) return (long) (-1);};
RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="Return Max(-1, GetAudioByKey(runtimeState.ActiveA";
if (true) return (long) (__c.Max(-1,__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ )._position /*long*/ (null)));
RDebugUtils.currentLine=60424195;
 //BA.debugLineNum = 60424195;BA.debugLine="End Sub";
return 0L;
}
public String  _activetrackidforwatchdog(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activetrackidforwatchdog", false))
	 {return ((String) Debug.delegate(ba, "activetrackidforwatchdog", null));}
RDebugUtils.currentLine=60358656;
 //BA.debugLineNum = 60358656;BA.debugLine="Private Sub ActiveTrackIdForWatchdog As String";
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="If runtimeState.ActiveItem.IsInitialized = False";
if (__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="Return runtimeState.ActiveItem.GetDefault(\"id\", \"";
if (true) return BA.ObjectToString(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=60358659;
 //BA.debugLineNum = 60358659;BA.debugLine="End Sub";
return "";
}
public String  _addprotectedtrackid(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _protectedids,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "addprotectedtrackid", false))
	 {return ((String) Debug.delegate(ba, "addprotectedtrackid", new Object[] {_protectedids,_item}));}
String _trackid = "";
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Private Sub AddProtectedTrackId(protectedIds As Ma";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return "";};
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="Dim trackId As String = item.GetDefault(\"id\", \"\")";
_trackid = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=57212932;
 //BA.debugLineNum = 57212932;BA.debugLine="If trackId = \"\" Then Return";
if ((_trackid).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=57212933;
 //BA.debugLineNum = 57212933;BA.debugLine="protectedIds.Put(trackId, True)";
_protectedids.Put((Object)(_trackid),(Object)(__c.True));
RDebugUtils.currentLine=57212934;
 //BA.debugLineNum = 57212934;BA.debugLine="End Sub";
return "";
}
public boolean  _allowregularadsattargetminute(b4j.example.b4xmainpage __ref,long _targetminutetimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "allowregularadsattargetminute", false))
	 {return ((Boolean) Debug.delegate(ba, "allowregularadsattargetminute", new Object[] {_targetminutetimestamp}));}
long _targetticks = 0L;
anywheresoftware.b4a.objects.collections.Map _targetslot = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub AllowRegularAdsAtTargetMinute(targetMi";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Dim targetTicks As Long = targetMinuteTimestamp *";
_targetticks = (long) (_targetminutetimestamp*1000);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Dim targetSlot As Map = dataResolver.ResolveDataS";
_targetslot = new anywheresoftware.b4a.objects.collections.Map();
_targetslot = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,_targetticks);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Return IsIdleSlot(targetSlot) = False";
if (true) return __ref._isidleslot /*boolean*/ (null,_targetslot)==__c.False;
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="End Sub";
return false;
}
public boolean  _isidleslot(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _slotcontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isidleslot", false))
	 {return ((Boolean) Debug.delegate(ba, "isidleslot", new Object[] {_slotcontext}));}
anywheresoftware.b4a.objects.collections.List _playlists = null;
String _streamid = "";
String _streamtitle = "";
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub IsIdleSlot(slotContext As Map) As Bool";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="If slotContext.IsInitialized = False Or slotConte";
if (_slotcontext.IsInitialized()==__c.False || _slotcontext.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Dim playlists As List = slotContext.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_slotcontext.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="If playlists.IsInitialized And playlists.Size > 0";
if (_playlists.IsInitialized() && _playlists.getSize()>0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Dim streamId As String = slotContext.GetDefault(\"";
_streamid = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_id"),(Object)("")));
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Dim streamTitle As String = slotContext.GetDefaul";
_streamtitle = BA.ObjectToString(_slotcontext.GetDefault((Object)("stream_title"),(Object)("")));
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="Return streamId = \"\" And streamTitle = \"\"";
if (true) return (_streamid).equals("") && (_streamtitle).equals("");
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub AppendHistoryRecord(recordDate As Stri";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="If recordDate = \"\" Then Return";
if ((_recorddate).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="EnsureDirectory(GetHistoryDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="Dim generator As JSONGenerator";
_generator = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="generator.Initialize(record)";
_generator.Initialize(_record);
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Dim outStream As OutputStream = File.OpenOutput(G";
_outstream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_outstream = __c.File.OpenOutput(__ref._gethistorydir /*String*/ (null),__ref._historyfilename /*String*/ (null,_recorddate),__c.True);
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="writer.Initialize2(outStream, \"UTF8\")";
_writer.Initialize2((java.io.OutputStream)(_outstream.getObject()),"UTF8");
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="writer.WriteLine(generator.ToString)";
_writer.WriteLine(_generator.ToString());
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="writer.Close";
_writer.Close();
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="storage.Put(\"pending_history_count\", storage.GetD";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"pending_history_count",(Object)((double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"pending_history_count",(Object)(0))))+1));
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="End Sub";
return "";
}
public String  _ensuredirectory(b4j.example.b4xmainpage __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="End Sub";
return "";
}
public String  _gethistorydir(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gethistorydir", false))
	 {return ((String) Debug.delegate(ba, "gethistorydir", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub GetHistoryDir As String";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Return File.Combine(storageDir, historyDirName)";
if (true) return __c.File.Combine(__ref._storagedir /*String*/ ,__ref._historydirname /*String*/ );
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public String  _historyfilename(b4j.example.b4xmainpage __ref,String _recorddate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historyfilename", false))
	 {return ((String) Debug.delegate(ba, "historyfilename", new Object[] {_recorddate}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub HistoryFileName(recordDate As String)";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Return recordDate & \".ndjson\"";
if (true) return _recorddate+".ndjson";
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return "";
}
public String  _applymaterialiconfont(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applymaterialiconfont", false))
	 {return ((String) Debug.delegate(ba, "applymaterialiconfont", new Object[] {_view,_fontsize}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub ApplyMaterialIconFont(view As B4XView,";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, view, fontSize";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,_view,_fontsize);
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitframe(b4j.example.b4xmainpage __ref,int _stepindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applyorbitframe", false))
	 {return ((String) Debug.delegate(ba, "applyorbitframe", new Object[] {_stepindex}));}
double _opacity = 0;
double _basephase = 0;
double _wave = 0;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub ApplyOrbitFrame(stepIndex As Int)";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim opacity As Double";
_opacity = 0;
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="If orbitFadeValue <= 0 Then";
if (__ref._orbitfadevalue /*double*/ <=0) { 
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="opacity = 0";
_opacity = 0;
 }else {
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="Dim basePhase As Double = stepIndex / 24";
_basephase = _stepindex/(double)24;
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="Dim wave As Double = (Sin(basePhase * cPI * 2) +";
_wave = (__c.Sin(_basephase*__c.cPI*2)+1)/(double)2;
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="opacity = (0.38 + wave * 0.28) * orbitFadeValue";
_opacity = (0.38+_wave*0.28)*__ref._orbitfadevalue /*double*/ ;
 };
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="ApplyOrbitState(opacity)";
__ref._applyorbitstate /*String*/ (null,_opacity);
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitstate(b4j.example.b4xmainpage __ref,double _opacity) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applyorbitstate", false))
	 {return ((String) Debug.delegate(ba, "applyorbitstate", new Object[] {_opacity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub ApplyOrbitState(opacity As Double)";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim jo As JavaObject = orbitPane";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="jo.RunMethod(\"setOpacity\", Array As Object(opacit";
_jo.RunMethod("setOpacity",new Object[]{(Object)(_opacity)});
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="End Sub";
return "";
}
public String  _applystoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applystoppedstate", false))
	 {return ((String) Debug.delegate(ba, "applystoppedstate", null));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub ApplyStoppedState";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="ShowStream(MessageValue(\"idle_stream\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"idle_stream"));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="End Sub";
return "";
}
public String  _showstream(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showstream", false))
	 {return ((String) Debug.delegate(ba, "showstream", new Object[] {_text}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub ShowStream(text As String)";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="SetStreamText(text)";
__ref._setstreamtext /*String*/ (null,_text);
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return "";
}
public String  _messagevalue(b4j.example.b4xmainpage __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "messagevalue", false))
	 {return ((String) Debug.delegate(ba, "messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Private Sub MessageValue(key As String) As String";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Return messages.GetDefault(key, \"\")";
if (true) return BA.ObjectToString(__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public String  _setstatustext(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstatustext", false))
	 {return ((String) Debug.delegate(ba, "setstatustext", new Object[] {_text}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub SetStatusText(text As String)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="lblInfo.Text = text";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_complete(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_complete", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_complete", null));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub AudioPrimary_Complete";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="HandleAudioCompleteAsync(\"primary\")";
__ref._handleaudiocompleteasync /*void*/ (null,"primary");
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="Wait For (HandleAudioComplete(audioKey)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiocompleteasync"), __ref._handleaudiocomplete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _audioprimary_error(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_error", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_error", new Object[] {_message}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Private Sub AudioPrimary_Error(message As String)";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": \"prim";
__ref._handleaudioerrorasync /*void*/ (null,__c.createMap(new Object[] {(Object)("audioKey"),(Object)("primary"),(Object)("message"),(Object)(_message)}));
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="Wait For (HandleAudioError(args.GetDefault(\"audio";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerrorasync"), __ref._handleaudioerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),BA.ObjectToString(_args.GetDefault((Object)("message"),(Object)("")))));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _audioprimary_ready(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_ready", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_ready", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub AudioPrimary_Ready";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="HandleAudioReady(\"primary\")";
__ref._handleaudioready /*String*/ (null,"primary");
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="End Sub";
return "";
}
public String  _handleaudioready(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudioready", false))
	 {return ((String) Debug.delegate(ba, "handleaudioready", new Object[] {_audiokey}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub HandleAudioReady(audioKey As String)";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="If runtimeState.PendingPlayAudioKey = audioKey Th";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", \"player=\" & Tr";
__ref._traceinfo /*String*/ (null,"audio","плеер ready","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" mode=play type="+__ref._traceitemtype /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ )+" id="+__ref._tracetrackvalue /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="ActivateLoadedItem(audioKey, runtimeState.Pendin";
__ref._activateloadeditem /*String*/ (null,_audiokey,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayfadeinms /*int*/ );
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="If runtimeState.PendingPrepareAudioKey = audioKey";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="TraceInfo(\"audio\", \"плеер ready\", \"player=\" & Tr";
__ref._traceinfo /*String*/ (null,"audio","плеер ready","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" mode=prepare type="+__ref._traceitemtype /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ )+" id="+__ref._tracetrackvalue /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="runtimeState.SetPrepared(audioKey, runtimeState.";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._setprepared /*String*/ (null,_audiokey,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="runtimeState.ClearPendingPrepareState";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpendingpreparestate /*String*/ (null);
 };
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_timeupdate", null));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub AudioPrimary_Timeupdate";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="HandleAudioTimeupdateAsync(\"primary\")";
__ref._handleaudiotimeupdateasync /*void*/ (null,"primary");
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="End Sub";
return "";
}
public void  _handleaudiotimeupdateasync(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudiotimeupdateasync", false))
	 {Debug.delegate(ba, "handleaudiotimeupdateasync", new Object[] {_audiokey}); return;}
ResumableSub_HandleAudioTimeupdateAsync rsub = new ResumableSub_HandleAudioTimeupdateAsync(this,__ref,_audiokey);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleAudioTimeupdateAsync extends BA.ResumableSub {
public ResumableSub_HandleAudioTimeupdateAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _audiokey) {
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
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Wait For (HandleAudioTimeupdate(audioKey)) Comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiotimeupdateasync"), __ref._handleaudiotimeupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _audiosecondary_complete(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_complete", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_complete", null));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub AudioSecondary_Complete";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="HandleAudioCompleteAsync(\"secondary\")";
__ref._handleaudiocompleteasync /*void*/ (null,"secondary");
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_error(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_error", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_error", new Object[] {_message}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Private Sub AudioSecondary_Error(message As String";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="HandleAudioErrorAsync(CreateMap(\"audioKey\": \"seco";
__ref._handleaudioerrorasync /*void*/ (null,__c.createMap(new Object[] {(Object)("audioKey"),(Object)("secondary"),(Object)("message"),(Object)(_message)}));
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_ready(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_ready", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_ready", null));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub AudioSecondary_Ready";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="HandleAudioReady(\"secondary\")";
__ref._handleaudioready /*String*/ (null,"secondary");
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_timeupdate", null));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub AudioSecondary_Timeupdate";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="HandleAudioTimeupdateAsync(\"secondary\")";
__ref._handleaudiotimeupdateasync /*void*/ (null,"secondary");
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If playerCode = \"\" Then Return False";
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
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="If orchestrationState.IsStarted Or orchestrationS";
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
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="If TryEnterStartupSequence = False Then Return Fa";
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
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="ShowMessage(MessageValue(\"connecting\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"connecting"));
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="UpdateConnectionIndicator(\"connecting\")";
__ref._updateconnectionindicator /*String*/ (null,"connecting");
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";
if (true) break;

case 19:
//if
this.state = 40;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="TraceLog(\"автостарт сначала обновление данных\")";
__ref._tracelog /*String*/ (null,"автостарт сначала обновление данных");
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 45;
return;
case 45:
//C
this.state = 22;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="If refreshed = False Then";
if (true) break;

case 22:
//if
this.state = 36;
if (_refreshed==parent.__c.False) { 
this.state = 24;
}else {
this.state = 35;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="If dataPolicyState.LastOfflineDataRefreshState";
if (true) break;

case 25:
//if
this.state = 28;
if ((__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/ ).equals("message")) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="TraceLog(\"автостарт stop reason=server_message";
__ref._tracelog /*String*/ (null,"автостарт stop reason=server_message");
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="FailStartupSequence(\"server_message\")";
__ref._failstartupsequence /*String*/ (null,"server_message");
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="If HasLocalPlaybackFallback Then";

case 28:
//if
this.state = 33;
if (__ref._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="SwitchToLocalPlayback(False, \"startup_local\")";
__ref._switchtolocalplayback /*String*/ (null,parent.__c.False,"startup_local");
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="TraceLog(\"автостарт fallback reason=fresh_data";
__ref._tracelog /*String*/ (null,"автостарт fallback reason=fresh_data_unavailable");
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="TraceLog(\"автостарт ошибка reason=no_local_que";
__ref._tracelog /*String*/ (null,"автостарт ошибка reason=no_local_queue");
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="FailStartupSequence(\"no_local_fallback\")";
__ref._failstartupsequence /*String*/ (null,"no_local_fallback");
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="UpdateConnectionIndicator(\"online\")";
__ref._updateconnectionindicator /*String*/ (null,"online");
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="RequestSkipQueueSnapshotRestore(\"fresh_sync\")";
__ref._requestskipqueuesnapshotrestore /*String*/ (null,"fresh_sync");
 if (true) break;
;
RDebugUtils.currentLine=2818077;
 //BA.debugLineNum = 2818077;BA.debugLine="If CanUseDataPlaybackResolver = False Then";

case 36:
//if
this.state = 39;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=2818078;
 //BA.debugLineNum = 2818078;BA.debugLine="TraceLog(\"автостарт отмена reason=no_data\")";
__ref._tracelog /*String*/ (null,"автостарт отмена reason=no_data");
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="FailStartupSequence(\"resolver_unavailable\")";
__ref._failstartupsequence /*String*/ (null,"resolver_unavailable");
RDebugUtils.currentLine=2818080;
 //BA.debugLineNum = 2818080;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
RDebugUtils.currentLine=2818083;
 //BA.debugLineNum = 2818083;BA.debugLine="ShowMessage(MessageValue(\"syncing\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"syncing"));
RDebugUtils.currentLine=2818084;
 //BA.debugLineNum = 2818084;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";
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
RDebugUtils.currentLine=2818085;
 //BA.debugLineNum = 2818085;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReason";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ),"server");
RDebugUtils.currentLine=2818086;
 //BA.debugLineNum = 2818086;BA.debugLine="FailStartupSequence(\"playback_not_allowed\")";
__ref._failstartupsequence /*String*/ (null,"playback_not_allowed");
RDebugUtils.currentLine=2818087;
 //BA.debugLineNum = 2818087;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 44:
//C
this.state = -1;
;
RDebugUtils.currentLine=2818089;
 //BA.debugLineNum = 2818089;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=2818090;
 //BA.debugLineNum = 2818090;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=2818091;
 //BA.debugLineNum = 2818091;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2818092;
 //BA.debugLineNum = 2818092;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=2818093;
 //BA.debugLineNum = 2818093;BA.debugLine="TraceLog(\"автостарт воспроизведение начало\")";
__ref._tracelog /*String*/ (null,"автостарт воспроизведение начало");
RDebugUtils.currentLine=2818094;
 //BA.debugLineNum = 2818094;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 46;
return;
case 46:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2818095;
 //BA.debugLineNum = 2818095;BA.debugLine="CompleteStartupSequence";
__ref._completestartupsequence /*String*/ (null);
RDebugUtils.currentLine=2818096;
 //BA.debugLineNum = 2818096;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=2818097;
 //BA.debugLineNum = 2818097;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub TryEnterStartupSequence As Boolean";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If isStartupSequenceInProgress Then Return False";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="isStartupSequenceInProgress = True";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.True;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="retryFallbackState.ClearDispatchRetryAfter";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="End Sub";
return false;
}
public String  _setstopicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Private Sub SetStopIcon";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
__ref._setlabelstyle /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="lblPlayIcon.Text = ICON_STOP";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_stop /*String*/ );
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="ApplyMaterialIconFont(lblPlayIcon, stopIconBaseSi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._stopiconbasesize /*float*/ );
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="StartOrbitAnimation";
__ref._startorbitanimation /*String*/ (null);
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub ShowMessage(text As String)";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="End Sub";
return "";
}
public String  _updateconnectionindicator(b4j.example.b4xmainpage __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateconnectionindicator", false))
	 {return ((String) Debug.delegate(ba, "updateconnectionindicator", new Object[] {_mode}));}
String _icontext = "";
int _iconcolor = 0;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub UpdateConnectionIndicator(mode As Stri";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="If lblConnectionIcon.IsInitialized = False Then R";
if (__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim iconText As String = ICON_CLOUD_OK";
_icontext = __ref._icon_cloud_ok /*String*/ ;
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim iconColor As Int = 0xFF747B86";
_iconcolor = ((int)0xff747b86);
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="Select mode";
switch (BA.switchObjectToInt(_mode,"online","offline","server","degraded","connecting")) {
case 0: {
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="iconText = ICON_CLOUD_OK";
_icontext = __ref._icon_cloud_ok /*String*/ ;
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="iconColor = 0xFFD0FF71";
_iconcolor = ((int)0xffd0ff71);
 break; }
case 1: {
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="iconText = ICON_CLOUD_OFF";
_icontext = __ref._icon_cloud_off /*String*/ ;
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="iconColor = 0xFFFF6B6B";
_iconcolor = ((int)0xffff6b6b);
 break; }
case 2: {
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="iconText = ICON_CLOUD_OFF";
_icontext = __ref._icon_cloud_off /*String*/ ;
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="iconColor = 0xFFFF6B6B";
_iconcolor = ((int)0xffff6b6b);
 break; }
case 3: {
RDebugUtils.currentLine=15532047;
 //BA.debugLineNum = 15532047;BA.debugLine="iconText = ICON_CLOUD_DEGRADED";
_icontext = __ref._icon_cloud_degraded /*String*/ ;
RDebugUtils.currentLine=15532048;
 //BA.debugLineNum = 15532048;BA.debugLine="iconColor = 0xFFFFD166";
_iconcolor = ((int)0xffffd166);
 break; }
case 4: {
RDebugUtils.currentLine=15532050;
 //BA.debugLineNum = 15532050;BA.debugLine="iconText = ICON_CLOUD_OK";
_icontext = __ref._icon_cloud_ok /*String*/ ;
RDebugUtils.currentLine=15532051;
 //BA.debugLineNum = 15532051;BA.debugLine="iconColor = 0xFF8E97A3";
_iconcolor = ((int)0xff8e97a3);
 break; }
default: {
RDebugUtils.currentLine=15532053;
 //BA.debugLineNum = 15532053;BA.debugLine="iconText = ICON_CLOUD_OK";
_icontext = __ref._icon_cloud_ok /*String*/ ;
RDebugUtils.currentLine=15532054;
 //BA.debugLineNum = 15532054;BA.debugLine="iconColor = 0xFF747B86";
_iconcolor = ((int)0xff747b86);
 break; }
}
;
RDebugUtils.currentLine=15532056;
 //BA.debugLineNum = 15532056;BA.debugLine="lblConnectionIcon.Text = iconText";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_icontext);
RDebugUtils.currentLine=15532057;
 //BA.debugLineNum = 15532057;BA.debugLine="SetLabelStyle(lblConnectionIcon, \"-fx-alignment:";
__ref._setlabelstyle /*String*/ (null,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_iconcolor)+";");
RDebugUtils.currentLine=15532058;
 //BA.debugLineNum = 15532058;BA.debugLine="ApplyMaterialIconFont(lblConnectionIcon, 16)";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If playerCode = \"\" Then Return False";
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
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If dataPolicyState.BeginOfflineDataRefresh = Fals";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._beginofflinedatarefresh /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Wait For (FetchJsonWithTimeout(DATA_BASE_URL & \"?";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "refreshofflinedatanow"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 55;
return;
case 55:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 13:
//if
this.state = 16;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErr";
__ref._consecutivenetworkerrors /*int*/  = (int) (__ref._consecutivenetworkerrors /*int*/ +1);
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="TraceWarn(\"network\", \"data ошибка\", \"kind=\" & re";
__ref._tracewarn /*String*/ (null,"network","data ошибка","kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" lastDataOkAgoSec="+__ref._secondsagotext /*String*/ (null,__ref._lastdataokat /*long*/ ));
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="dataPolicyState.EndOfflineDataRefresh(\"http_fail";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,"http_failed");
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="WriteHealthSnapshot(\"ошибка_data\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 17:
//if
this.state = 54;
if (_resultdata instanceof java.util.Map) { 
this.state = 19;
}else {
this.state = 53;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
if (true) break;

case 20:
//if
this.state = 48;
if ((_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) && (_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("data"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="lastDataOkAt = DateTime.Now";
__ref._lastdataokat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="consecutiveNetworkErrors = 0";
__ref._consecutivenetworkerrors /*int*/  = (int) (0);
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="dataPolicyState.LastOfflineDataRefreshState = \"";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/  = "data";
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="UpdateTrustedOnlineTimeFromData(data)";
__ref._updatetrustedonlinetimefromdata /*String*/ (null,_data);
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="offlineData = offlineStoreService.SaveOfflineDa";
__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._saveofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,__ref._playercode /*String*/ ,__ref._deviceid /*String*/ );
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="If IsTraceUploadEnabled Then FlushTraceBufferAs";
if (true) break;

case 23:
//if
this.state = 28;
if (__ref._istraceuploadenabled /*boolean*/ (null)) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
__ref._flushtracebufferasync /*void*/ (null);
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="InvalidateRelevantTrackIdsCache";
__ref._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="dataPolicyState.SetRemoteDataReady";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._setremotedataready /*String*/ (null);
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="TraceInfo(\"network\", \"data загружены\", \"trace=\"";
__ref._traceinfo /*String*/ (null,"network","data загружены","trace="+BA.ObjectToString(__ref._istraceuploadenabled /*boolean*/ (null)));
RDebugUtils.currentLine=2097177;
 //BA.debugLineNum = 2097177;BA.debugLine="WriteHealthSnapshot(\"data\")";
__ref._writehealthsnapshot /*String*/ (null,"data");
RDebugUtils.currentLine=2097178;
 //BA.debugLineNum = 2097178;BA.debugLine="Wait For (SyncOfflinePlaylistMetadata) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "refreshofflinedatanow"), __ref._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 56;
return;
case 56:
//C
this.state = 29;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2097179;
 //BA.debugLineNum = 2097179;BA.debugLine="If isStartupSequenceInProgress Then";
if (true) break;

case 29:
//if
this.state = 34;
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
RDebugUtils.currentLine=2097180;
 //BA.debugLineNum = 2097180;BA.debugLine="isAdWarmupDeferredAfterStartup = True";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = parent.__c.True;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=2097182;
 //BA.debugLineNum = 2097182;BA.debugLine="EnsureAdCacheSyncAsync";
__ref._ensureadcachesyncasync /*void*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=2097184;
 //BA.debugLineNum = 2097184;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";

case 34:
//if
this.state = 37;
if (__ref._isplaybackallowedbycurrentdata /*boolean*/ (null)==parent.__c.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=2097185;
 //BA.debugLineNum = 2097185;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReas";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ),"server");
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="dataPolicyState.EndOfflineDataRefresh(\"data\")";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=2097189;
 //BA.debugLineNum = 2097189;BA.debugLine="If dataPolicyState.ResumePlaybackWhenServerAllo";

case 37:
//if
this.state = 40;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._resumeplaybackwhenserverallows /*boolean*/  && __ref._shouldresumewithnewstart /*boolean*/ (null)==parent.__c.False && __ref._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ==parent.__c.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=2097190;
 //BA.debugLineNum = 2097190;BA.debugLine="TraceLog(\"policy resume авто mode=server_allow";
__ref._tracelog /*String*/ (null,"policy resume авто mode=server_allow");
RDebugUtils.currentLine=2097191;
 //BA.debugLineNum = 2097191;BA.debugLine="dataPolicyState.ResumePlaybackWhenServerAllows";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._resumeplaybackwhenserverallows /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=2097192;
 //BA.debugLineNum = 2097192;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=2097193;
 //BA.debugLineNum = 2097193;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2097194;
 //BA.debugLineNum = 2097194;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=2097195;
 //BA.debugLineNum = 2097195;BA.debugLine="ResumePlaybackAfterPolicyPause";
__ref._resumeplaybackafterpolicypause /*void*/ (null);
 if (true) break;
;
RDebugUtils.currentLine=2097197;
 //BA.debugLineNum = 2097197;BA.debugLine="If IsPolicyPauseState Then";

case 40:
//if
this.state = 47;
if (__ref._ispolicypausestate /*boolean*/ (null)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=2097198;
 //BA.debugLineNum = 2097198;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=2097199;
 //BA.debugLineNum = 2097199;BA.debugLine="If IsUserStoppedState = False And orchestratio";
if (true) break;

case 43:
//if
this.state = 46;
if (__ref._isuserstoppedstate /*boolean*/ (null)==parent.__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ==parent.__c.False) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=2097200;
 //BA.debugLineNum = 2097200;BA.debugLine="TraceLog(\"policy resume авто mode=policy_paus";
__ref._tracelog /*String*/ (null,"policy resume авто mode=policy_pause_clear");
RDebugUtils.currentLine=2097201;
 //BA.debugLineNum = 2097201;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=2097202;
 //BA.debugLineNum = 2097202;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2097203;
 //BA.debugLineNum = 2097203;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=2097204;
 //BA.debugLineNum = 2097204;BA.debugLine="ResumePlaybackAfterPolicyPause";
__ref._resumeplaybackafterpolicypause /*void*/ (null);
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=2097207;
 //BA.debugLineNum = 2097207;BA.debugLine="dataPolicyState.EndOfflineDataRefresh(\"data\")";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,"data");
RDebugUtils.currentLine=2097208;
 //BA.debugLineNum = 2097208;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=2097210;
 //BA.debugLineNum = 2097210;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 48:
//if
this.state = 51;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=2097211;
 //BA.debugLineNum = 2097211;BA.debugLine="dataPolicyState.LastOfflineDataRefreshState = \"";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/  = "message";
RDebugUtils.currentLine=2097212;
 //BA.debugLineNum = 2097212;BA.debugLine="TraceWarn(\"network\", \"data сообщение\", \"action=";
__ref._tracewarn /*String*/ (null,"network","data сообщение","action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+" reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)(""))));
RDebugUtils.currentLine=2097213;
 //BA.debugLineNum = 2097213;BA.debugLine="HandleMessageItem(data)";
__ref._handlemessageitem /*String*/ (null,_data);
RDebugUtils.currentLine=2097214;
 //BA.debugLineNum = 2097214;BA.debugLine="dataPolicyState.EndOfflineDataRefresh(\"message\"";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,"message");
RDebugUtils.currentLine=2097215;
 //BA.debugLineNum = 2097215;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 51:
//C
this.state = 54;
;
RDebugUtils.currentLine=2097217;
 //BA.debugLineNum = 2097217;BA.debugLine="dataPolicyState.LastOfflineDataRefreshState = \"i";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/  = "invalid_data";
RDebugUtils.currentLine=2097218;
 //BA.debugLineNum = 2097218;BA.debugLine="TraceWarn(\"network\", \"data некорректны\", \"type=\"";
__ref._tracewarn /*String*/ (null,"network","data некорректны","type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+" ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=2097219;
 //BA.debugLineNum = 2097219;BA.debugLine="PausePlaybackByPolicy(MessageValue(\"invalid_data";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=2097221;
 //BA.debugLineNum = 2097221;BA.debugLine="dataPolicyState.LastOfflineDataRefreshState = \"i";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/  = "invalid_payload";
RDebugUtils.currentLine=2097222;
 //BA.debugLineNum = 2097222;BA.debugLine="TraceWarn(\"network\", \"data некорректны\", \"payloa";
__ref._tracewarn /*String*/ (null,"network","data некорректны","payload=not_map");
RDebugUtils.currentLine=2097223;
 //BA.debugLineNum = 2097223;BA.debugLine="PausePlaybackByPolicy(MessageValue(\"invalid_data";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._messagevalue /*String*/ (null,"invalid_data_response"),"server");
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=2097225;
 //BA.debugLineNum = 2097225;BA.debugLine="dataPolicyState.EndOfflineDataRefresh(dataPolicyS";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endofflinedatarefresh /*String*/ (null,__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._lastofflinedatarefreshstate /*String*/ );
RDebugUtils.currentLine=2097226;
 //BA.debugLineNum = 2097226;BA.debugLine="WriteHealthSnapshot(\"ошибка_data\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_data");
RDebugUtils.currentLine=2097227;
 //BA.debugLineNum = 2097227;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=2097228;
 //BA.debugLineNum = 2097228;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub FailStartupSequence(reason As String)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If isStartupSequenceInProgress = False Then Retur";
if (__ref._isstartupsequenceinprogress /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="CancelDeferredPostStartTasks";
__ref._canceldeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="isStartupSequenceInProgress = False";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_START_DELA";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="TraceWarn(\"player\", \"старт не завершен\", \"reason=";
__ref._tracewarn /*String*/ (null,"player","старт не завершен","reason="+_reason);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="WriteHealthSnapshot(\"ошибка_старта\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_старта");
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="End Sub";
return "";
}
public boolean  _haslocalplaybackfallback(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haslocalplaybackfallback", false))
	 {return ((Boolean) Debug.delegate(ba, "haslocalplaybackfallback", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub HasLocalPlaybackFallback As Boolean";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Return HasPlayableLocalTrackInCurrentSlot";
if (true) return __ref._hasplayablelocaltrackincurrentslot /*boolean*/ (null);
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="End Sub";
return false;
}
public String  _switchtolocalplayback(b4j.example.b4xmainpage __ref,boolean _markdegraded,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "switchtolocalplayback", false))
	 {return ((String) Debug.delegate(ba, "switchtolocalplayback", new Object[] {_markdegraded,_reason}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub SwitchToLocalPlayback(markDegraded As";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="TraceLog(\"fallback activate mode=local reason=\" &";
__ref._tracelog /*String*/ (null,"fallback activate mode=local reason="+_reason+" degraded="+BA.ObjectToString(_markdegraded));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"switch_local:\" &";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"switch_local:"+_reason);
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="dataPolicyState.EnterLocalPlayback";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._enterlocalplayback /*String*/ (null);
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="retryFallbackState.SetMediaPathDegraded(markDegra";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._setmediapathdegraded /*String*/ (null,_markdegraded);
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="RequestSkipQueueSnapshotRestore(\"switch_local:\" &";
__ref._requestskipqueuesnapshotrestore /*String*/ (null,"switch_local:"+_reason);
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="End Sub";
return "";
}
public String  _handlelocaltemporarystate(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlelocaltemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handlelocaltemporarystate", new Object[] {_text}));}
boolean _fallbackready = false;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub HandleLocalTemporaryState(text As Stri";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim fallbackReady As Boolean = HasLocalPlaybackFa";
_fallbackready = __ref._haslocalplaybackfallback /*boolean*/ (null);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="TraceLog(\"состояние temporary mode=offline playab";
__ref._tracelog /*String*/ (null,"состояние temporary mode=offline playableFallback="+BA.ObjectToString(_fallbackready)+" text="+_text);
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="If fallbackReady Then TraceLog(\"fallback выбор mo";
if (_fallbackready) { 
__ref._tracelog /*String*/ (null,"fallback выбор mode=temporary_local reason=playable_local_fallback");};
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"temporary_local_";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"temporary_local_state");
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="dataPolicyState.SetLocalFallbackReady(fallbackRea";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._setlocalfallbackready /*String*/ (null,_fallbackready);
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
 }else {
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="ShowMessage(MessageValue(\"offline\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"offline"));
 };
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="ScheduleRetry(\"offline\", 0)";
__ref._scheduleretry /*String*/ (null,"offline",(int) (0));
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="End Sub";
return "";
}
public String  _requestskipqueuesnapshotrestore(b4j.example.b4xmainpage __ref,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "requestskipqueuesnapshotrestore", false))
	 {return ((String) Debug.delegate(ba, "requestskipqueuesnapshotrestore", new Object[] {_reason}));}
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Private Sub RequestSkipQueueSnapshotRestore(reason";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="queueState.RequestSkipQueueSnapshotRestore";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._requestskipqueuesnapshotrestore /*String*/ (null);
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="TraceLog(\"снимок очереди восстановление skip reas";
__ref._tracelog /*String*/ (null,"снимок очереди восстановление skip reason="+_reason);
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="End Sub";
return "";
}
public boolean  _canusedataplaybackresolver(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canusedataplaybackresolver", false))
	 {return ((Boolean) Debug.delegate(ba, "canusedataplaybackresolver", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub CanUseDataPlaybackResolver As Boolean";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER = False Then Return";
if (__ref._use_data_playback_resolver /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Return queueBuilder.CanUseDataPlaybackResolver(of";
if (true) return __ref._queuebuilder /*b4j.example.playbackqueuebuilder*/ ._canusedataplaybackresolver /*boolean*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybackallowedbycurrentdata(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackallowedbycurrentdata", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackallowedbycurrentdata", null));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _endtimestamp = 0L;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub IsPlaybackAllowedByCurrentData As Bool";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.True;};
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"p";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="If endTimestamp <= 0 Then Return True";
if (_endtimestamp<=0) { 
if (true) return __c.True;};
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="Return EffectiveNowTicks < (endTimestamp * 1000)";
if (true) return __ref._effectivenowticks /*long*/ (null)<(_endtimestamp*1000);
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="End Sub";
return false;
}
public String  _pauseplaybackbypolicy(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "pauseplaybackbypolicy", false))
	 {return ((String) Debug.delegate(ba, "pauseplaybackbypolicy", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub PausePlaybackByPolicy(reason As String";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="facade.PausePlayback(reason, connectionMode)";
__ref._facade /*b4j.example.playbackfacade*/ ._pauseplayback /*String*/ (null,_reason,_connectionmode);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public String  _resolveplaybackblockreason(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplaybackblockreason", false))
	 {return ((String) Debug.delegate(ba, "resolveplaybackblockreason", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
String _pausereason = "";
long _endtimestamp = 0L;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub ResolvePlaybackBlockReason(data As Map";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="If data.IsInitialized = False Then Return Message";
if (_data.IsInitialized()==__c.False) { 
if (true) return __ref._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Dim pauseReason As String = playerData.GetDefaul";
_pausereason = BA.ObjectToString(_playerdata.GetDefault((Object)("pause_reason"),(Object)("")));
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="If pauseReason <> \"\" Then Return pauseReason";
if ((_pausereason).equals("") == false) { 
if (true) return _pausereason;};
 };
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Dim endTimestamp As Long = ResolvePlaybackEndTime";
_endtimestamp = __ref._resolveplaybackendtimestamp /*long*/ (null,_data);
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="If endTimestamp > 0 And EffectiveNowTicks >= (end";
if (_endtimestamp>0 && __ref._effectivenowticks /*long*/ (null)>=(_endtimestamp*1000)) { 
if (true) return __ref._messagevalue /*String*/ (null,"subscription_expired");};
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="If playerData.IsInitialized And playerData.Contai";
if (_playerdata.IsInitialized() && _playerdata.ContainsKey((Object)("playback_allowed"))) { 
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="If playerData.GetDefault(\"playback_allowed\", Tru";
if ((_playerdata.GetDefault((Object)("playback_allowed"),(Object)(__c.True))).equals((Object)(__c.True)) == false) { 
if (true) return __ref._messagevalue /*String*/ (null,"playback_paused");};
 };
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="Return MessageValue(\"playback_paused\")";
if (true) return __ref._messagevalue /*String*/ (null,"playback_paused");
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub HideContentBlocks";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="SetStreamText(\"\")";
__ref._setstreamtext /*String*/ (null,"");
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Wait For (facade.StartFirstTrack(mode)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startfirsttrack"), __ref._facade /*b4j.example.playbackfacade*/ ._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mode));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_started = (boolean) result[1];
;
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Return started";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_started));return;};
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub CompleteStartupSequence";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="facade.CompleteStartupSequence";
__ref._facade /*b4j.example.playbackfacade*/ ._completestartupsequence /*String*/ (null);
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub B4XPage_Created (root1 As B4XView)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="rootView = root1";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="B4XPages.SetTitle(Me, Main.LabelName)";
_b4xpages._settitle /*String*/ (this,(Object)(_main._labelname /*String*/ ));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="rootView.Color = 0xFF0E0F11";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff0e0f11));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="InitSettings";
__ref._initsettings /*String*/ (null);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="InitState";
__ref._initstate /*String*/ (null);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="BuildUi";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="RestoreWindowState";
__ref._restorewindowstate /*String*/ (null);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="audioPrimary.Initialize(\"AudioPrimary\", Me)";
__ref._audioprimary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioPrimary",this);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="audioSecondary.Initialize(\"AudioSecondary\", Me)";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioSecondary",this);
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="TraceInfo(\"app\", \"запуск\", \"version=\" & ResolveAp";
__ref._traceinfo /*String*/ (null,"app","запуск","version="+__ref._resolveappversion /*String*/ (null)+" player="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="StartOfflineDataRefresh";
__ref._startofflinedatarefresh /*String*/ (null);
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="ShowInitialScreen";
__ref._showinitialscreen /*String*/ (null);
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="End Sub";
return "";
}
public String  _initsettings(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initsettings", false))
	 {return ((String) Debug.delegate(ba, "initsettings", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub InitSettings";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="messages.Initialize";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="messages.Put(\"offline\", \"Проверьте интернет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("offline"),(Object)("Проверьте интернет"));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="messages.Put(\"connecting\", \"Подключение...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("connecting"),(Object)("Подключение..."));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="messages.Put(\"syncing\", \"Синхронизация...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("syncing"),(Object)("Синхронизация..."));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="messages.Put(\"server_wait\", \"Временная остановка\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("server_wait"),(Object)("Временная остановка"));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="messages.Put(\"playback_paused\", \"Воспроизведение";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("playback_paused"),(Object)("Воспроизведение приостановлено"));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="messages.Put(\"subscription_expired\", \"Подписка ис";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("subscription_expired"),(Object)("Подписка истекла"));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="messages.Put(\"invalid_data_response\", \"Ошибка отв";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("invalid_data_response"),(Object)("Ошибка ответа сервера. Обратитесь в техподдержку"));
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="messages.Put(\"idle\", \"Перерыв...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle"),(Object)("Перерыв..."));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="messages.Put(\"idle_until\", \"Перерыв до {time}\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_until"),(Object)("Перерыв до {time}"));
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="messages.Put(\"blocked\", \"Плеер заблокирован\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blocked"),(Object)("Плеер заблокирован"));
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="messages.Put(\"idle_stream\", \"Запусти поток\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_stream"),(Object)("Запусти поток"));
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="messages.Put(\"player_required\", \"Не указан плеер\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_required"),(Object)("Не указан плеер"));
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="messages.Put(\"device_required\", \"Не указано устро";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_required"),(Object)("Не указано устройство"));
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="messages.Put(\"device_busy\", \"Плеер играет на друг";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_busy"),(Object)("Плеер играет на другом устройстве. Играть здесь?"));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="messages.Put(\"device_confirm_yes\", \"Да\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_yes"),(Object)("Да"));
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="messages.Put(\"device_confirm_no\", \"Нет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_no"),(Object)("Нет"));
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="messages.Put(\"not_found\", \"Плеер не найден\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("not_found"),(Object)("Плеер не найден"));
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="messages.Put(\"player_updated\", \"Плеер обновлен\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_updated"),(Object)("Плеер обновлен"));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="messages.Put(\"player_reloading\", \"Обновление…\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_reloading"),(Object)("Обновление…"));
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="messages.Put(\"ad_label\", \"Реклама\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ad_label"),(Object)("Реклама"));
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="messages.Put(\"setup_title\", \"Введите код плеера\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_title"),(Object)("Введите код плеера"));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="messages.Put(\"setup_placeholder\", \"\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_placeholder"),(Object)(""));
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="messages.Put(\"setup_submit\", \"Войти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_submit"),(Object)("Войти"));
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="messages.Put(\"setup_invalid\", \"Введите код из 5 с";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_invalid"),(Object)("Введите код из 5 символов"));
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="messages.Put(\"logout\", \"Выйти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("logout"),(Object)("Выйти"));
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="messages.Put(\"settings_open\", \"Настройки\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_open"),(Object)("Настройки"));
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="messages.Put(\"settings_close\", \"Закрыть\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_close"),(Object)("Закрыть"));
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="messages.Put(\"settings_thanks\", \"Спасибо!\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_thanks"),(Object)("Спасибо!"));
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="End Sub";
return "";
}
public String  _initstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initstate", false))
	 {return ((String) Debug.delegate(ba, "initstate", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub InitState";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="storageDir = File.DirData(\"fonfm\")";
__ref._storagedir /*String*/  = __c.File.DirData("fonfm");
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="debugResponsesDir = File.Combine(storageDir, \"deb";
__ref._debugresponsesdir /*String*/  = __c.File.Combine(__ref._storagedir /*String*/ ,"debugresponses");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="EnsureDirectory(GetHistoryDir)";
__ref._ensuredirectory /*String*/ (null,__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="RndSeed(DateTime.Now)";
__c.RndSeed(__c.DateTime.getNow());
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="storage.Initialize(storageDir, localStateDbName)";
__ref._storage /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._localstatedbname /*String*/ );
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="MigrateLegacyStorageIfNeeded";
__ref._migratelegacystorageifneeded /*String*/ (null);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="playerCode = NormalizePlayerCode(storage.GetDefau";
__ref._playercode /*String*/  = __ref._normalizeplayercode /*String*/ (null,BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"player_code",(Object)(""))));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="appTraceService.Initialize(storageDir, debugRespo";
__ref._apptraceservice /*b4j.example.traceservice*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._debugresponsesdir /*String*/ ,__ref._traceloglimit /*int*/ ,__ref._serversnapshotlimit /*int*/ );
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="offlineData.Initialize";
__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="playQueue.Initialize";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="orchestrationState.Initialize";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="runtimeState.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="metaState.Initialize";
__ref._metastate /*b4j.example.playbackmetastate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="dataPolicyState.Initialize";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="retryFallbackState.Initialize(LOCAL_RETRY_DELAY_I";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._initialize /*String*/ (null,ba,__ref._local_retry_delay_initial /*int*/ ,__ref._server_retry_delay_initial /*int*/ );
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="queueState.Initialize";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="queueBuilder.Initialize(Me)";
__ref._queuebuilder /*b4j.example.playbackqueuebuilder*/ ._initialize /*String*/ (null,ba,(b4j.example.b4xmainpage)(this));
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="transitionCoordinator.Initialize(Me)";
__ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._initialize /*String*/ (null,ba,(b4j.example.b4xmainpage)(this));
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="facade.Initialize(Me)";
__ref._facade /*b4j.example.playbackfacade*/ ._initialize /*String*/ (null,ba,(b4j.example.b4xmainpage)(this));
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="responseAdapter.Initialize";
__ref._responseadapter /*b4j.example.playbackresponseadapter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="localAdScheduler.Initialize(Me, \"TraceLog\", Messa";
__ref._localadscheduler /*b4j.example.adscheduler*/ ._initialize /*String*/ (null,ba,this,"TraceLog",__ref._messagevalue /*String*/ (null,"ad_label"));
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="dataResolver.Initialize(storageDir, Me, \"TraceLog";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,this,"TraceLog");
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="dataResolver.LoadState(storage)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadstate /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ );
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="TraceLog(\"курсор плейлистов load count=\" & dataRe";
__ref._tracelog /*String*/ (null,"курсор плейлистов load count="+BA.NumberToString(__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._cursorcount /*int*/ (null)));
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="deviceId = GetOrCreateDeviceId";
__ref._deviceid /*String*/  = __ref._getorcreatedeviceid /*String*/ (null);
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="mediaCacheService.Initialize(storageDir, storage,";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,this,"TraceLog",__ref._deviceid /*String*/ );
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="retryTimer.Initialize(\"RetryTimer\", SERVER_RETRY_";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"RetryTimer",(long) (__ref._server_retry_delay_initial /*int*/ ));
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="breakTimer.Initialize(\"BreakTimer\", 1000)";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"BreakTimer",(long) (1000));
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="historyFlushTimer.Initialize(\"HistoryFlushTimer\",";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"HistoryFlushTimer",(long) (__ref._history_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="traceUploadTimer.Initialize(\"TraceUploadTimer\", T";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TraceUploadTimer",(long) (__ref._trace_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="orbitTimer.Initialize(\"OrbitTimer\", 70)";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OrbitTimer",(long) (70));
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="offlineDataRefreshTimer.Initialize(\"OfflineDataRe";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OfflineDataRefreshTimer",(long) (__ref._data_refresh_ms /*int*/ ));
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="localAdMinuteTimer.Initialize(\"LocalAdMinuteTimer";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LocalAdMinuteTimer",(long) (1000));
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="trackCacheWarmupTimer.Initialize(\"TrackCacheWarmu";
__ref._trackcachewarmuptimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TrackCacheWarmupTimer",(long) (__ref._track_cache_warmup_delay_ms /*int*/ ));
RDebugUtils.currentLine=524325;
 //BA.debugLineNum = 524325;BA.debugLine="cacheAuditTimer.Initialize(\"CacheAuditTimer\", CAC";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"CacheAuditTimer",(long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="playbackWatchdogTimer.Initialize(\"PlaybackWatchdo";
__ref._playbackwatchdogtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"PlaybackWatchdogTimer",(long) (__ref._playback_watchdog_interval_ms /*int*/ ));
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="playbackWatchdogTimer.Enabled = True";
__ref._playbackwatchdogtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="isHistoryFlushInProgress = False";
__ref._ishistoryflushinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="isTraceUploadInProgress = False";
__ref._istraceuploadinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="isPlaybackWatchdogTickInProgress = False";
__ref._isplaybackwatchdogtickinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=524331;
 //BA.debugLineNum = 524331;BA.debugLine="isStartupSequenceInProgress = False";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=524332;
 //BA.debugLineNum = 524332;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=524333;
 //BA.debugLineNum = 524333;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="cachedRelevantTrackIds.Initialize";
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=524335;
 //BA.debugLineNum = 524335;BA.debugLine="lastTrackCachePruneAt = 0";
__ref._lasttrackcachepruneat /*long*/  = (long) (0);
RDebugUtils.currentLine=524336;
 //BA.debugLineNum = 524336;BA.debugLine="playbackFlowState = FLOW_IDLE";
__ref._playbackflowstate /*String*/  = __ref._flow_idle /*String*/ ;
RDebugUtils.currentLine=524337;
 //BA.debugLineNum = 524337;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=524338;
 //BA.debugLineNum = 524338;BA.debugLine="offlineStoreService.Initialize(storageDir, storag";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,this,"TraceLog",__ref._playerdatafile /*String*/ ,__ref._playlistrequirementsfile /*String*/ ,__ref._localplaylistsdirname /*String*/ ,__ref._playlist_cdn_base_url /*String*/ );
RDebugUtils.currentLine=524339;
 //BA.debugLineNum = 524339;BA.debugLine="offlineData = offlineStoreService.LoadOfflineData";
__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=524340;
 //BA.debugLineNum = 524340;BA.debugLine="RefreshPendingHistoryState";
__ref._refreshpendinghistorystate /*String*/ (null);
RDebugUtils.currentLine=524341;
 //BA.debugLineNum = 524341;BA.debugLine="ResolveMachineGuidAsync";
__ref._resolvemachineguidasync /*String*/ (null);
RDebugUtils.currentLine=524342;
 //BA.debugLineNum = 524342;BA.debugLine="TraceLog(\"состояние init dir=\" & storageDir & \" p";
__ref._tracelog /*String*/ (null,"состояние init dir="+__ref._storagedir /*String*/ +" player="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=524343;
 //BA.debugLineNum = 524343;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub BuildUi";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="card = xui.CreatePanel(\"\")";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="headerPane = xui.CreatePanel(\"\")";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="headerActionPane = xui.CreatePanel(\"HeaderActionP";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"HeaderActionPane");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="contentPane = xui.CreatePanel(\"\")";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="footerPane = xui.CreatePanel(\"\")";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="setupPane = xui.CreatePanel(\"\")";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="playerPane = xui.CreatePanel(\"\")";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="setupHeroPane = xui.CreatePanel(\"\")";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="setupDetailPane = xui.CreatePanel(\"\")";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="setupPrimaryPane = xui.CreatePanel(\"\")";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="setupStatusPane = xui.CreatePanel(\"\")";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="playerHeroPane = xui.CreatePanel(\"\")";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="playerDetailPane = xui.CreatePanel(\"\")";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="playerPrimaryPane = xui.CreatePanel(\"\")";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="playerStatusPane = xui.CreatePanel(\"\")";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="orbitPane = xui.CreatePanel(\"\")";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="playButtonPane = xui.CreatePanel(\"PlayButtonPane\"";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"PlayButtonPane");
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="confirmPane = xui.CreatePanel(\"\")";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="accessCirclePane = xui.CreatePanel(\"\")";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="accessCorePane = xui.CreatePanel(\"\")";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="accessInputPane = xui.CreatePanel(\"\")";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4d";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0x07ffffff),__c.DipToCurrent((int) (4)),((int)0x55ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="playButtonPane.SetColorAndBorder(xui.Color_Transp";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (4)),((int)0x33ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="headerActionPane.SetColorAndBorder(xui.Color_Tran";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="lblHeader = CreateLabel(\"\", 12, 0xFF747B86, False";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="lblHeaderAction = CreateLabel(ICON_MORE, 22, 0xFF";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_more /*String*/ ,(float) (22),((int)0xffb9c0c9),__c.False,__c.False);
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="lblPlayIcon = CreateLabel(ICON_PLAY, 48, 0xFFD0FF";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_play /*String*/ ,(float) (48),((int)0xffd0ff71),__c.False,__c.False);
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="lblStream = CreateLabel(\"\", 36, 0xFFD0FF71, True,";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (36),((int)0xffd0ff71),__c.True,__c.True);
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="lblInfo = CreateLabel(\"\", 17, 0xFFBCC3CD, False,";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="lblFooter = CreateLabel(Main.LabelName & \" \" & Re";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_main._labelname /*String*/ +" "+__ref._resolveappversion /*String*/ (null),(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="lblConnectionIcon = CreateLabel(ICON_CLOUD_OK, 16";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_cloud_ok /*String*/ ,(float) (16),((int)0xff747b86),__c.False,__c.False);
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="lblSetupMessage = CreateLabel(\"\", 17, 0xFFBCC3CD,";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="txtPlayerCode.Initialize(\"txtPlayerCode\")";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"txtPlayerCode");
RDebugUtils.currentLine=589865;
 //BA.debugLineNum = 589865;BA.debugLine="txtPlayerCodeView = txtPlayerCode";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="btnSetupSubmit = CreateTextButton(MessageValue(\"s";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"setup_submit"),"BtnSetupSubmit");
RDebugUtils.currentLine=589867;
 //BA.debugLineNum = 589867;BA.debugLine="btnConfirmYes = CreateTextButton(MessageValue(\"de";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_yes"),"BtnConfirmYes");
RDebugUtils.currentLine=589868;
 //BA.debugLineNum = 589868;BA.debugLine="btnConfirmNo = CreateTextButton(MessageValue(\"dev";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_no"),"BtnConfirmNo");
RDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="rootView.AddView(card, 0, 0, 0, 0)";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="card.AddView(headerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589875;
 //BA.debugLineNum = 589875;BA.debugLine="card.AddView(contentPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589876;
 //BA.debugLineNum = 589876;BA.debugLine="card.AddView(footerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="headerPane.AddView(lblHeader, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589878;
 //BA.debugLineNum = 589878;BA.debugLine="headerPane.AddView(headerActionPane, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589879;
 //BA.debugLineNum = 589879;BA.debugLine="headerActionPane.AddView(lblHeaderAction, 0, 0, 0";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589880;
 //BA.debugLineNum = 589880;BA.debugLine="contentPane.AddView(setupPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589881;
 //BA.debugLineNum = 589881;BA.debugLine="contentPane.AddView(playerPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589882;
 //BA.debugLineNum = 589882;BA.debugLine="footerPane.AddView(lblFooter, 0, 0, 0, 0)";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589883;
 //BA.debugLineNum = 589883;BA.debugLine="footerPane.AddView(lblConnectionIcon, 0, 0, 0, 0)";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589885;
 //BA.debugLineNum = 589885;BA.debugLine="setupPane.AddView(setupHeroPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589886;
 //BA.debugLineNum = 589886;BA.debugLine="setupPane.AddView(setupDetailPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589887;
 //BA.debugLineNum = 589887;BA.debugLine="setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589888;
 //BA.debugLineNum = 589888;BA.debugLine="setupHeroPane.AddView(accessCirclePane, 0, 0, 0,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589889;
 //BA.debugLineNum = 589889;BA.debugLine="accessCirclePane.AddView(accessInputPane, 0, 0, 0";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589890;
 //BA.debugLineNum = 589890;BA.debugLine="accessInputPane.AddView(txtPlayerCodeView, 0, 0,";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589891;
 //BA.debugLineNum = 589891;BA.debugLine="setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589892;
 //BA.debugLineNum = 589892;BA.debugLine="setupDetailPane.AddView(setupStatusPane, 0, 0, 0,";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0,";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589894;
 //BA.debugLineNum = 589894;BA.debugLine="setupStatusPane.AddView(lblSetupMessage, 0, 0, 0,";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589896;
 //BA.debugLineNum = 589896;BA.debugLine="playerPane.AddView(playerHeroPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589897;
 //BA.debugLineNum = 589897;BA.debugLine="playerPane.AddView(playerDetailPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589898;
 //BA.debugLineNum = 589898;BA.debugLine="playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589899;
 //BA.debugLineNum = 589899;BA.debugLine="playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589900;
 //BA.debugLineNum = 589900;BA.debugLine="playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589901;
 //BA.debugLineNum = 589901;BA.debugLine="playerDetailPane.AddView(playerPrimaryPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589902;
 //BA.debugLineNum = 589902;BA.debugLine="playerDetailPane.AddView(playerStatusPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589903;
 //BA.debugLineNum = 589903;BA.debugLine="playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589904;
 //BA.debugLineNum = 589904;BA.debugLine="playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589905;
 //BA.debugLineNum = 589905;BA.debugLine="playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589906;
 //BA.debugLineNum = 589906;BA.debugLine="confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589907;
 //BA.debugLineNum = 589907;BA.debugLine="confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=589909;
 //BA.debugLineNum = 589909;BA.debugLine="SetPaneStyle(card, \"-fx-background-radius: 24; -f";
__ref._setpanestyle /*String*/ (null,__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 24; -fx-border-radius: 24;");
RDebugUtils.currentLine=589910;
 //BA.debugLineNum = 589910;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589911;
 //BA.debugLineNum = 589911;BA.debugLine="SetPaneStyle(playButtonPane, \"-fx-cursor: hand; -";
__ref._setpanestyle /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589912;
 //BA.debugLineNum = 589912;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589913;
 //BA.debugLineNum = 589913;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=589914;
 //BA.debugLineNum = 589914;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=589915;
 //BA.debugLineNum = 589915;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffddf1ff))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x7affffff))+"; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=589916;
 //BA.debugLineNum = 589916;BA.debugLine="accessCorePane.Visible = True";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589917;
 //BA.debugLineNum = 589917;BA.debugLine="accessCirclePane.Visible = True";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589918;
 //BA.debugLineNum = 589918;BA.debugLine="accessInputPane.Visible = True";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589919;
 //BA.debugLineNum = 589919;BA.debugLine="SetPickOnBounds(headerActionPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=589920;
 //BA.debugLineNum = 589920;BA.debugLine="SetPickOnBounds(playButtonPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=589921;
 //BA.debugLineNum = 589921;BA.debugLine="txtPlayerCode.PromptText = MessageValue(\"setup_pl";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setPromptText(__ref._messagevalue /*String*/ (null,"setup_placeholder").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=589922;
 //BA.debugLineNum = 589922;BA.debugLine="txtPlayerCode.Visible = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=589923;
 //BA.debugLineNum = 589923;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=589924;
 //BA.debugLineNum = 589924;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=589925;
 //BA.debugLineNum = 589925;BA.debugLine="UpdateCodeInputAppearance(False)";
__ref._updatecodeinputappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=589926;
 //BA.debugLineNum = 589926;BA.debugLine="BringToFront(accessCorePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589927;
 //BA.debugLineNum = 589927;BA.debugLine="BringToFront(accessCirclePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589928;
 //BA.debugLineNum = 589928;BA.debugLine="BringToFront(accessInputPane)";
__ref._bringtofront /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589929;
 //BA.debugLineNum = 589929;BA.debugLine="BringToFront(txtPlayerCodeView)";
__ref._bringtofront /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589931;
 //BA.debugLineNum = 589931;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589932;
 //BA.debugLineNum = 589932;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=589933;
 //BA.debugLineNum = 589933;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub RestoreWindowState";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Try";
try {RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Dim form As Form = B4XPages.GetNativeParent(Me)";
_form = _b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this);
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="If form.IsInitialized = False Then Return";
if (_form.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Dim windowTop As Double = storage.GetDefault(\"Wi";
_windowtop = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowTop",(Object)(-1))));
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="Dim windowLeft As Double = storage.GetDefault(\"W";
_windowleft = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowLeft",(Object)(-1))));
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="Dim windowWidth As Double = storage.GetDefault(\"";
_windowwidth = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowWidth",(Object)(-1))));
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="Dim windowHeight As Double = storage.GetDefault(";
_windowheight = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowHeight",(Object)(-1))));
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="Dim maxWidth As Double = fx.PrimaryScreen.MaxX -";
_maxwidth = _fx.getPrimaryScreen().getMaxX()-_fx.getPrimaryScreen().getMinX();
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="Dim maxHeight As Double = fx.PrimaryScreen.MaxY";
_maxheight = _fx.getPrimaryScreen().getMaxY()-_fx.getPrimaryScreen().getMinY();
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="If windowTop > -1 Then form.WindowTop = windowTo";
if (_windowtop>-1) { 
_form.setWindowTop(_windowtop);};
RDebugUtils.currentLine=17891341;
 //BA.debugLineNum = 17891341;BA.debugLine="If windowLeft > -1 Then form.WindowLeft = window";
if (_windowleft>-1) { 
_form.setWindowLeft(_windowleft);};
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="If windowWidth > -1 Then form.WindowWidth = Min(";
if (_windowwidth>-1) { 
_form.setWindowWidth(__c.Min(_maxwidth,__c.Max(520,_windowwidth)));};
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="If windowHeight > -1 Then";
if (_windowheight>-1) { 
RDebugUtils.currentLine=17891344;
 //BA.debugLineNum = 17891344;BA.debugLine="form.WindowHeight = Min(maxHeight, Max(640, win";
_form.setWindowHeight(__c.Min(_maxheight,__c.Max(640,_windowheight)));
 }else 
{RDebugUtils.currentLine=17891345;
 //BA.debugLineNum = 17891345;BA.debugLine="Else If maxHeight < 640 Then";
if (_maxheight<640) { 
RDebugUtils.currentLine=17891346;
 //BA.debugLineNum = 17891346;BA.debugLine="form.WindowHeight = maxHeight";
_form.setWindowHeight(_maxheight);
 }}
;
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="TraceLog(\"окно restore left=\" & form.WindowLeft";
__ref._tracelog /*String*/ (null,"окно restore left="+BA.NumberToString(_form.getWindowLeft())+" top="+BA.NumberToString(_form.getWindowTop())+" width="+BA.NumberToString(_form.getWindowWidth())+" height="+BA.NumberToString(_form.getWindowHeight()));
 } 
       catch (Exception e21) {
			ba.setLastException(e21);RDebugUtils.currentLine=17891350;
 //BA.debugLineNum = 17891350;BA.debugLine="TraceLog(\"окно restore ошибка message=\" & LastEx";
__ref._tracelog /*String*/ (null,"окно restore ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=17891353;
 //BA.debugLineNum = 17891353;BA.debugLine="End Sub";
return "";
}
public String  _resolveappversion(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveappversion", false))
	 {return ((String) Debug.delegate(ba, "resolveappversion", null));}
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Private Sub ResolveAppVersion As String";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="If Main.VersionName <> \"\" Then Return Main.Versio";
if ((_main._versionname /*String*/ ).equals("") == false) { 
if (true) return _main._versionname /*String*/ ;};
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="Return \"\" & Main.VersionCode";
if (true) return ""+BA.NumberToString(_main._versioncode /*int*/ );
RDebugUtils.currentLine=59441155;
 //BA.debugLineNum = 59441155;BA.debugLine="End Sub";
return "";
}
public String  _formatplayercodefordisplay(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formatplayercodefordisplay", false))
	 {return ((String) Debug.delegate(ba, "formatplayercodefordisplay", new Object[] {_value}));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub FormatPlayerCodeForDisplay(value As St";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Return value.Trim.ToUpperCase";
if (true) return _value.trim().toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="End Sub";
return "";
}
public String  _startofflinedatarefresh(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "startofflinedatarefresh", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub StartOfflineDataRefresh";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="historyFlushTimer.Enabled = False";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="traceUploadTimer.Enabled = False";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="localAdMinuteTimer.Interval = 1000";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="localAdMinuteTimer.Enabled = True";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="If playerCode = \"\" Then Return";
if ((__ref._playercode /*String*/ ).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="offlineDataRefreshTimer.Interval = DATA_REFRESH_M";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._data_refresh_ms /*int*/ ));
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="offlineDataRefreshTimer.Enabled = True";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="historyFlushTimer.Interval = HISTORY_FLUSH_INTERV";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._history_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="historyFlushTimer.Enabled = True";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="traceUploadTimer.Interval = TRACE_FLUSH_INTERVAL_";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._trace_flush_interval_ms /*int*/ ));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="traceUploadTimer.Enabled = True";
__ref._traceuploadtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="End Sub";
return "";
}
public String  _showinitialscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showinitialscreen", false))
	 {return ((String) Debug.delegate(ba, "showinitialscreen", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub ShowInitialScreen";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
 }else {
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*String*/ (null,__c.True);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="UpdateConnectionIndicator(\"connecting\")";
__ref._updateconnectionindicator /*String*/ (null,"connecting");
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="AutoStartSavedPlayer";
__ref._autostartsavedplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 };
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4j.example.b4xmainpage __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub B4XPage_Resize (width As Int, height A";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If card.IsInitialized = False Then Return";
if (__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="LayoutUi(width, height)";
__ref._layoutui /*String*/ (null,_width,_height);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
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
int _infoheight = 0;
int _connectioniconsize = 0;
int _footergap = 0;
int _footertextwidth = 0;
int _footergroupwidth = 0;
int _footergroupleft = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub LayoutUi(width As Int, height As Int)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim safeWidth As Int = Max(width, 320dip)";
_safewidth = (int) (__c.Max(_width,__c.DipToCurrent((int) (320))));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim safeHeight As Int = Max(height, 420dip)";
_safeheight = (int) (__c.Max(_height,__c.DipToCurrent((int) (420))));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim outerPad As Int = ScaleValue(safeWidth, 12dip";
_outerpad = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim horizontalPad As Int = ScaleValue(safeWidth,";
_horizontalpad = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim sectionGap As Int = ScaleValue(safeWidth, 24d";
_sectiongap = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (48)));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim contentGap As Int = ScaleValue(safeWidth, 8di";
_contentgap = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="Dim headerHeight As Int = ScaleValue(safeWidth, 5";
_headerheight = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (56)),__c.DipToCurrent((int) (64)),__c.DipToCurrent((int) (72)));
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Dim footerHeight As Int = headerHeight";
_footerheight = _headerheight;
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Dim cardWidth As Int = Min(620dip, safeWidth - ou";
_cardwidth = (int) (__c.Min(__c.DipToCurrent((int) (620)),_safewidth-_outerpad*2));
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="Dim preferredHeight As Int = Max(400dip, safeHeig";
_preferredheight = (int) (__c.Max(__c.DipToCurrent((int) (400)),_safeheight-_outerpad*2));
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Dim cardHeight As Int = Min(preferredHeight, safe";
_cardheight = (int) (__c.Min(_preferredheight,_safeheight-__c.DipToCurrent((int) (8))));
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="Dim cardLeft As Int = (safeWidth - cardWidth) / 2";
_cardleft = (int) ((_safewidth-_cardwidth)/(double)2);
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="Dim cardTop As Int = (safeHeight - cardHeight) /";
_cardtop = (int) ((_safeheight-_cardheight)/(double)2);
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="UpdateResponsiveStyles(safeWidth)";
__ref._updateresponsivestyles /*String*/ (null,_safewidth);
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="card.SetLayoutAnimated(0, cardLeft, cardTop, card";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardleft,_cardtop,_cardwidth,_cardheight);
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="headerPane.SetLayoutAnimated(0, 0, 0, cardWidth,";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_cardwidth,_headerheight);
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="contentPane.SetLayoutAnimated(0, 0, headerHeight";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_headerheight+_sectiongap/(double)2,_cardwidth,_cardheight-_headerheight-_footerheight-_sectiongap);
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="footerPane.SetLayoutAnimated(0, 0, cardHeight - f";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_cardheight-_footerheight,_cardwidth,_footerheight);
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="Dim headerActionSize As Int = ScaleValue(safeWidt";
_headeractionsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (36)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="headerActionPane.SetLayoutAnimated(0, cardWidth -";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardwidth-_horizontalpad-_headeractionsize,(_headerheight-_headeractionsize)/(double)2,_headeractionsize,_headeractionsize);
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="lblHeaderAction.SetLayoutAnimated(0, 0, 0, header";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="lblHeader.SetLayoutAnimated(0, horizontalPad + he";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad+_headeractionsize+_contentgap,0,_cardwidth-(_horizontalpad+_headeractionsize+_contentgap)*2,_headerheight);
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="setupPane.SetLayoutAnimated(0, 0, 0, contentPane.";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="playerPane.SetLayoutAnimated(0, 0, 0, contentPane";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="Dim contentHeight As Int = contentPane.Height";
_contentheight = (int) (__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="Dim heroHeight As Int = Max(160dip, (contentHeigh";
_heroheight = (int) (__c.Max(__c.DipToCurrent((int) (160)),(_contentheight-_sectiongap)/(double)2));
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="Dim detailHeight As Int = Max(120dip, contentHeig";
_detailheight = (int) (__c.Max(__c.DipToCurrent((int) (120)),_contentheight-_heroheight-_sectiongap));
RDebugUtils.currentLine=655392;
 //BA.debugLineNum = 655392;BA.debugLine="Dim contentWidth As Int = cardWidth - horizontalP";
_contentwidth = (int) (_cardwidth-_horizontalpad*2);
RDebugUtils.currentLine=655394;
 //BA.debugLineNum = 655394;BA.debugLine="setupHeroPane.SetLayoutAnimated(0, horizontalPad,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=655395;
 //BA.debugLineNum = 655395;BA.debugLine="setupDetailPane.SetLayoutAnimated(0, horizontalPa";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="playerHeroPane.SetLayoutAnimated(0, horizontalPad";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=655397;
 //BA.debugLineNum = 655397;BA.debugLine="playerDetailPane.SetLayoutAnimated(0, horizontalP";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=655399;
 //BA.debugLineNum = 655399;BA.debugLine="Dim controlSize As Int = ScaleValue(safeWidth, 15";
_controlsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (156)),__c.DipToCurrent((int) (172)),__c.DipToCurrent((int) (182)));
RDebugUtils.currentLine=655400;
 //BA.debugLineNum = 655400;BA.debugLine="Dim inputLeft As Int = (setupHeroPane.Width - con";
_inputleft = (int) ((__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="Dim inputTop As Int = Max(0, (setupHeroPane.Heigh";
_inputtop = (int) (__c.Max(0,(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="Dim accessOrbitSize As Int = controlSize + 20dip";
_accessorbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=655403;
 //BA.debugLineNum = 655403;BA.debugLine="accessCorePane.SetLayoutAnimated(0, inputLeft - 1";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft-__c.DipToCurrent((int) (10)),_inputtop-__c.DipToCurrent((int) (10)),_accessorbitsize,_accessorbitsize);
RDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="accessCirclePane.SetLayoutAnimated(0, inputLeft,";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft,_inputtop,_controlsize,_controlsize);
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="Dim inputPaneWidth As Int = controlSize - 34dip";
_inputpanewidth = (int) (_controlsize-__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="Dim inputPaneHeight As Int = Min(72dip, controlSi";
_inputpaneheight = (int) (__c.Min(__c.DipToCurrent((int) (72)),_controlsize-__c.DipToCurrent((int) (62))));
RDebugUtils.currentLine=655407;
 //BA.debugLineNum = 655407;BA.debugLine="Dim inputPaneLeft As Int = (controlSize - inputPa";
_inputpaneleft = (int) ((_controlsize-_inputpanewidth)/(double)2);
RDebugUtils.currentLine=655408;
 //BA.debugLineNum = 655408;BA.debugLine="Dim inputPaneTop As Int = (controlSize - inputPan";
_inputpanetop = (int) ((_controlsize-_inputpaneheight)/(double)2);
RDebugUtils.currentLine=655409;
 //BA.debugLineNum = 655409;BA.debugLine="accessInputPane.SetLayoutAnimated(0, inputPaneLef";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputpaneleft,_inputpanetop,_inputpanewidth,_inputpaneheight);
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="Dim codeFieldHeight As Int = inputPaneHeight";
_codefieldheight = _inputpaneheight;
RDebugUtils.currentLine=655411;
 //BA.debugLineNum = 655411;BA.debugLine="txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inpu";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_inputpanewidth,_codefieldheight);
RDebugUtils.currentLine=655413;
 //BA.debugLineNum = 655413;BA.debugLine="Dim orbitSize As Int = controlSize + 20dip";
_orbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=655414;
 //BA.debugLineNum = 655414;BA.debugLine="Dim orbitLeft As Int = (playerHeroPane.Width - or";
_orbitleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_orbitsize)/(double)2);
RDebugUtils.currentLine=655415;
 //BA.debugLineNum = 655415;BA.debugLine="Dim controlLeft As Int = (playerHeroPane.Width -";
_controlleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=655416;
 //BA.debugLineNum = 655416;BA.debugLine="Dim controlTop As Int = Max(0, (playerHeroPane.He";
_controltop = (int) (__c.Max(0,(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=655417;
 //BA.debugLineNum = 655417;BA.debugLine="orbitPane.SetLayoutAnimated(0, orbitLeft, control";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_orbitleft,_controltop-__c.DipToCurrent((int) (10)),_orbitsize,_orbitsize);
RDebugUtils.currentLine=655418;
 //BA.debugLineNum = 655418;BA.debugLine="playButtonPane.SetLayoutAnimated(0, controlLeft,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_controlleft,_controltop,_controlsize,_controlsize);
RDebugUtils.currentLine=655419;
 //BA.debugLineNum = 655419;BA.debugLine="lblPlayIcon.SetLayoutAnimated(0, 0, 1dip, control";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__c.DipToCurrent((int) (1)),_controlsize,_controlsize);
RDebugUtils.currentLine=655421;
 //BA.debugLineNum = 655421;BA.debugLine="setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setup";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.38));
RDebugUtils.currentLine=655422;
 //BA.debugLineNum = 655422;BA.debugLine="setupStatusPane.SetLayoutAnimated(0, 0, setupPrim";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=655423;
 //BA.debugLineNum = 655423;BA.debugLine="btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setup";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (132)))/(double)2),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (44)))/(double)2),__c.DipToCurrent((int) (132)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=655424;
 //BA.debugLineNum = 655424;BA.debugLine="lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupS";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655426;
 //BA.debugLineNum = 655426;BA.debugLine="playerPrimaryPane.SetLayoutAnimated(0, 0, 0, play";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.4));
RDebugUtils.currentLine=655427;
 //BA.debugLineNum = 655427;BA.debugLine="playerStatusPane.SetLayoutAnimated(0, 0, playerPr";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=655428;
 //BA.debugLineNum = 655428;BA.debugLine="lblStream.SetLayoutAnimated(0, 0, 0, playerPrimar";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=655429;
 //BA.debugLineNum = 655429;BA.debugLine="Dim infoHeight As Int = Max(54dip, playerStatusPa";
_infoheight = (int) (__c.Max(__c.DipToCurrent((int) (54)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._confirmreservedheight /*int*/ (null)));
RDebugUtils.currentLine=655430;
 //BA.debugLineNum = 655430;BA.debugLine="lblInfo.SetLayoutAnimated(0, 0, 0, playerStatusPa";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_infoheight);
RDebugUtils.currentLine=655431;
 //BA.debugLineNum = 655431;BA.debugLine="If confirmPane.Visible Then";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=655432;
 //BA.debugLineNum = 655432;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (72)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (72)));
 }else {
RDebugUtils.currentLine=655434;
 //BA.debugLineNum = 655434;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),0);
 };
RDebugUtils.currentLine=655436;
 //BA.debugLineNum = 655436;BA.debugLine="btnConfirmYes.SetLayoutAnimated(0, Max(0, (confir";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (236)))/(double)2),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=655437;
 //BA.debugLineNum = 655437;BA.debugLine="btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.L";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (124)),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=655439;
 //BA.debugLineNum = 655439;BA.debugLine="Dim connectionIconSize As Int = ScaleValue(safeWi";
_connectioniconsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (18)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=655440;
 //BA.debugLineNum = 655440;BA.debugLine="Dim footerGap As Int = 8dip";
_footergap = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=655441;
 //BA.debugLineNum = 655441;BA.debugLine="Dim footerTextWidth As Int = MeasureViewTextWidth";
_footertextwidth = __ref._measureviewtextwidth /*int*/ (null,__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=655442;
 //BA.debugLineNum = 655442;BA.debugLine="Dim footerGroupWidth As Int = connectionIconSize";
_footergroupwidth = (int) (_connectioniconsize+_footergap+_footertextwidth);
RDebugUtils.currentLine=655443;
 //BA.debugLineNum = 655443;BA.debugLine="Dim footerGroupLeft As Int = Max(horizontalPad, (";
_footergroupleft = (int) (__c.Max(_horizontalpad,(_cardwidth-_footergroupwidth)/(double)2));
RDebugUtils.currentLine=655444;
 //BA.debugLineNum = 655444;BA.debugLine="lblConnectionIcon.SetLayoutAnimated(0, footerGrou";
__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_footergroupleft,(_footerheight-_connectioniconsize)/(double)2,_connectioniconsize,_connectioniconsize);
RDebugUtils.currentLine=655445;
 //BA.debugLineNum = 655445;BA.debugLine="lblFooter.SetLayoutAnimated(0, footerGroupLeft +";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_footergroupleft+_connectioniconsize+_footergap,0,_footertextwidth+__c.DipToCurrent((int) (4)),_footerheight);
RDebugUtils.currentLine=655446;
 //BA.debugLineNum = 655446;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=655447;
 //BA.debugLineNum = 655447;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuredataplaybackqueue(b4j.example.b4xmainpage __ref,int _minitems) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuredataplaybackqueue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuredataplaybackqueue", new Object[] {_minitems}));}
ResumableSub_EnsureDataPlaybackQueue rsub = new ResumableSub_EnsureDataPlaybackQueue(this,__ref,_minitems);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureDataPlaybackQueue extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackQueue(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,int _minitems) {
this.parent = parent;
this.__ref = __ref;
this._minitems = _minitems;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _minitems;
boolean _queueprepared = false;

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
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Wait For (queueBuilder.EnsureDataPlaybackQueue(pl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensuredataplaybackqueue"), __ref._queuebuilder /*b4j.example.playbackqueuebuilder*/ ._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,_minitems,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._effectivenowticks /*long*/ (null),__ref._storage /*b4j.example.keyvaluestore*/ ,__ref._queuestate /*b4j.example.playbackqueuestate*/ ,__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ,__ref._mediacacheservice /*b4j.example.mediacache*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Return queuePrepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_queueprepared));return;};
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
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
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="If ShouldTriggerBreakNow = False Then Return";
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
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="TraceLog(\"брейк exact timer hit\")";
__ref._tracelog /*String*/ (null,"брейк exact timer hit");
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "breaktimer_tick"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub ShouldTriggerBreakNow As Boolean";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Return queueState.ShouldTriggerBreakNow(LocalNowT";
if (true) return __ref._queuestate /*b4j.example.playbackqueuestate*/ ._shouldtriggerbreaknow /*boolean*/ (null,__ref._localnowtimestamp /*long*/ (null));
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="End Sub";
return false;
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
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="If CanAdvancePlaybackNow(\"fade_out_and_continue\",";
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
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="If IsPlaybackTransitionInProgress Then";
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
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="TraceLog(\"guard fade запрет reason=transition_in";
__ref._tracelog /*String*/ (null,"guard fade запрет reason=transition_in_progress");
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="If orchestrationState.IsPlaybackDispatchInProgres";

case 10:
//if
this.state = 13;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isplaybackdispatchinprogress /*boolean*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="TraceWarn(\"playback\", \"break переход пропущен\",";
__ref._tracewarn /*String*/ (null,"playback","break переход пропущен","reason=dispatch_busy active="+__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._activedispatchinitiator /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="TraceInfo(\"playback\", \"break переход начало\", \"ty";
__ref._traceinfo /*String*/ (null,"playback","break переход начало","type="+__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="SetPlaybackFlowState(FLOW_TRANSITIONING, \"fade_ou";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_transitioning /*String*/ ,"fade_out_and_continue");
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=11141133;
 //BA.debugLineNum = 11141133;BA.debugLine="Dim fadeMs As Int";
_fadems = 0;
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="If metaState.CurrentMediaType = \"track\" Then";
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
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="fadeMs = STOP_FADE_MS";
_fadems = __ref._stop_fade_ms /*int*/ ;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=11141137;
 //BA.debugLineNum = 11141137;BA.debugLine="fadeMs = 0";
_fadems = (int) (0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="TraceLog(\"fade начало type=\" & metaState.CurrentM";
__ref._tracelog /*String*/ (null,"fade начало type="+__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ +" fadeMs="+BA.NumberToString(_fadems));
RDebugUtils.currentLine=11141140;
 //BA.debugLineNum = 11141140;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then GetAudi";
if (true) break;

case 20:
//if
this.state = 25;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("") == false) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ )._stop /*String*/ (null,_fadems);
if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="TraceInfo(\"playback\", \"break переход fade\", \"audi";
__ref._traceinfo /*String*/ (null,"playback","break переход fade","audio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ +" fadeMs="+BA.NumberToString(_fadems));
RDebugUtils.currentLine=11141142;
 //BA.debugLineNum = 11141142;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=11141143;
 //BA.debugLineNum = 11141143;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"fade_out_and_c";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fadeoutandcontinue"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"fade_out_and_continue",parent.__c.True));
this.state = 26;
return;
case 26:
//C
this.state = -1;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=11141144;
 //BA.debugLineNum = 11141144;BA.debugLine="TraceInfo(\"playback\", \"break переход итог\", \"disp";
__ref._traceinfo /*String*/ (null,"playback","break переход итог","dispatched="+BA.ObjectToString(_dispatched)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=11141145;
 //BA.debugLineNum = 11141145;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
RDebugUtils.currentLine=11141146;
 //BA.debugLineNum = 11141146;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub BringToFront(view As B4XView)";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
_jo.RunMethod("toFront",(Object[])(__c.Null));
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_click", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_click", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub BtnConfirmNo_Click";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub HidePin";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub BtnConfirmNo_MouseEntered (eventData A";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub UpdateTextButtonAppearance(buttonView";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="fillColor = 0x12FFFFFF";
_fillcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="borderColor = 0x34FFFFFF";
_bordercolor = ((int)0x34ffffff);
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="textColor = 0xFFF2F7FB";
_textcolor = ((int)0xfff2f7fb);
 }else {
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="fillColor = 0x06FFFFFF";
_fillcolor = ((int)0x06ffffff);
RDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="borderColor = 0x1EFFFFFF";
_bordercolor = ((int)0x1effffff);
RDebugUtils.currentLine=14680075;
 //BA.debugLineNum = 14680075;BA.debugLine="textColor = 0xFFE0E4EA";
_textcolor = ((int)0xffe0e4ea);
 };
RDebugUtils.currentLine=14680077;
 //BA.debugLineNum = 14680077;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
_buttonview.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=14680078;
 //BA.debugLineNum = 14680078;BA.debugLine="SetPaneStyle(buttonView, \"-fx-cursor: hand; -fx-b";
__ref._setpanestyle /*String*/ (null,_buttonview,"-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_textcolor)+";");
RDebugUtils.currentLine=14680079;
 //BA.debugLineNum = 14680079;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
_buttonview.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (13)));
RDebugUtils.currentLine=14680080;
 //BA.debugLineNum = 14680080;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub BtnConfirmNo_MouseExited (eventData As";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Wait For (SubmitClaim) Complete (unused As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnconfirmyes_click"), __ref._submitclaim /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="btnConfirmYes.Enabled = False";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="btnConfirmNo.Enabled = False";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="TraceLog(\"claim начало player=\" & FormatPlayerCod";
__ref._tracelog /*String*/ (null,"claim начало player="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+" device="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Wait For (FetchJsonWithTimeout(CLAIM_BASE_URL & \"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._claim_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createclaimparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="If data.GetDefault(\"ok\", False) = True Then";
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
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="TraceLog(\"claim итог success=true\")";
__ref._tracelog /*String*/ (null,"claim итог success=true");
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 14;
return;
case 14:
//C
this.state = 10;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=7929873;
 //BA.debugLineNum = 7929873;BA.debugLine="Return True";
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
RDebugUtils.currentLine=7929877;
 //BA.debugLineNum = 7929877;BA.debugLine="TraceLog(\"claim итог success=false message=\" & Re";
__ref._tracelog /*String*/ (null,"claim итог success=false message="+__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=7929878;
 //BA.debugLineNum = 7929878;BA.debugLine="ShowClaimPrompt(ResolveErrorMessage(result, Messa";
__ref._showclaimprompt /*String*/ (null,__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=7929879;
 //BA.debugLineNum = 7929879;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=7929880;
 //BA.debugLineNum = 7929880;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=7929881;
 //BA.debugLineNum = 7929881;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=7929882;
 //BA.debugLineNum = 7929882;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub BtnConfirmYes_MouseEntered (eventData";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmyes_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmyes_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmyes_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub BtnConfirmYes_MouseExited (eventData A";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If appScreenMode = \"settings\" Then";
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
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Wait For (LogoutPlayer) Complete (unused As Bool";
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
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Wait For (SubmitPlayerCode) Complete (unused2 As";
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
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="SaveValue(\"player_code\", \"\")";
__ref._savevalue /*String*/ (null,"player_code",(Object)(""));
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="playerCode = \"\"";
__ref._playercode /*String*/  = "";
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Wait For (StopPlayer) Complete (unused As Boolean";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "logoutplayer"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim nextPlayer As String = NormalizePlayerCode(tx";
_nextplayer = __ref._normalizeplayercode /*String*/ (null,__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If nextPlayer = \"\" Then";
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
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="ShowSetupScreen(MessageValue(\"setup_invalid\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"setup_invalid"));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="txtPlayerCode.RequestFocus";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="playerCode = nextPlayer";
__ref._playercode /*String*/  = _nextplayer;
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="SaveValue(\"player_code\", playerCode)";
__ref._savevalue /*String*/ (null,"player_code",(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="StartOfflineDataRefresh";
__ref._startofflinedatarefresh /*String*/ (null);
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="AutoStartSavedPlayer";
__ref._autostartsavedplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub BtnSetupSubmit_MouseEntered (eventData";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public String  _btnsetupsubmit_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnsetupsubmit_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnsetupsubmit_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub BtnSetupSubmit_MouseExited (eventData";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public String  _buildparams(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildparams", false))
	 {return ((String) Debug.delegate(ba, "buildparams", new Object[] {_params}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(__ref._urlencode /*String*/ (null,(Object)(_key))).Append("=").Append(__ref._urlencode /*String*/ (null,_params.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="End Sub";
return "";
}
public String  _urlencode(b4j.example.b4xmainpage __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "urlencode", false))
	 {return ((String) Debug.delegate(ba, "urlencode", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="End Sub";
return "";
}
public String  _buildqueuesignature(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildqueuesignature", false))
	 {return ((String) Debug.delegate(ba, "buildqueuesignature", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub BuildQueueSignature As String";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Return queueBuilder.BuildQueueSignature(offlineDa";
if (true) return __ref._queuebuilder /*b4j.example.playbackqueuebuilder*/ ._buildqueuesignature /*String*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._effectivenowticks /*long*/ (null),__ref._dataresolver /*b4j.example.dataplaybackresolver*/ );
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public long  _effectivenowticks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "effectivenowticks", false))
	 {return ((Long) Debug.delegate(ba, "effectivenowticks", null));}
long _devicenow = 0L;
long _trustednow = 0L;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub EffectiveNowTicks As Long";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim deviceNow As Long = DateTime.Now";
_devicenow = __c.DateTime.getNow();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim trustedNow As Long = storage.GetDefault(trust";
_trustednow = BA.ObjectToLongNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._trustedsynctimekey /*String*/ ,(Object)(0)));
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="If trustedNow > deviceNow Then Return trustedNow";
if (_trustednow>_devicenow) { 
if (true) return _trustednow;};
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="Return deviceNow";
if (true) return _devicenow;
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.example.b4xmainpage __ref,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_text,_fontsize,_textcolor,_bold,_wraptext}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub CreateLabel(text As String, fontSize A";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Return UiStyle.CreateLabel(xui, text, fontSize, t";
if (true) return _uistyle._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,_text,_fontsize,_textcolor,_bold,_wraptext);
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextbutton(b4j.example.b4xmainpage __ref,String _text,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createtextbutton", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextbutton", new Object[] {_text,_eventname}));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Private Sub CreateTextButton(text As String, event";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="btn.Initialize(eventName)";
_btn.Initialize(ba,_eventname);
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="xbtn.Text = text.ToUpperCase";
_xbtn.setText(_text.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="UpdateTextButtonAppearance(xbtn, False)";
__ref._updatetextbuttonappearance /*String*/ (null,_xbtn,__c.False);
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="Return xbtn";
if (true) return _xbtn;
RDebugUtils.currentLine=18415623;
 //BA.debugLineNum = 18415623;BA.debugLine="End Sub";
return null;
}
public String  _setpanestyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Private Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="UiStyle.SetPaneStyle(view, style)";
_uistyle._setpanestyle /*String*/ (_view,_style);
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return "";
}
public String  _colortocss(b4j.example.b4xmainpage __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Return UiStyle.ColorToCss(color)";
if (true) return _uistyle._colortocss /*String*/ (_color);
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="End Sub";
return "";
}
public String  _setpickonbounds(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="UiStyle.SetPickOnBounds(view, value)";
_uistyle._setpickonbounds /*String*/ (_view,_value);
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub UpdateHeaderActionAppearance(isHovered";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
RDebugUtils.currentLine=14614541;
 //BA.debugLineNum = 14614541;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14614542;
 //BA.debugLineNum = 14614542;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=14614543;
 //BA.debugLineNum = 14614543;BA.debugLine="SetLabelStyle(lblHeaderAction, \"-fx-alignment: ce";
__ref._setlabelstyle /*String*/ (null,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_textcolor)+";");
RDebugUtils.currentLine=14614544;
 //BA.debugLineNum = 14614544;BA.debugLine="ApplyMaterialIconFont(lblHeaderAction, headerActi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionfontsize /*float*/ );
RDebugUtils.currentLine=14614545;
 //BA.debugLineNum = 14614545;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub UpdatePlayButtonAppearance(isHovered A";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="If orchestrationState.IsStarted Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ) { 
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=14221322;
 //BA.debugLineNum = 14221322;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
RDebugUtils.currentLine=14221325;
 //BA.debugLineNum = 14221325;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=14221326;
 //BA.debugLineNum = 14221326;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=14221327;
 //BA.debugLineNum = 14221327;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
RDebugUtils.currentLine=14221329;
 //BA.debugLineNum = 14221329;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
RDebugUtils.currentLine=14221333;
 //BA.debugLineNum = 14221333;BA.debugLine="If orchestrationState.IsStarted Or isHovered Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  || _ishovered) { 
RDebugUtils.currentLine=14221334;
 //BA.debugLineNum = 14221334;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
RDebugUtils.currentLine=14221336;
 //BA.debugLineNum = 14221336;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
RDebugUtils.currentLine=14221338;
 //BA.debugLineNum = 14221338;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14221339;
 //BA.debugLineNum = 14221339;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14221340;
 //BA.debugLineNum = 14221340;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub UpdateCodeInputAppearance(isFocused As";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="If isFocused Then";
if (_isfocused) { 
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14745615;
 //BA.debugLineNum = 14745615;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(__ref._codefontsize /*float*/ )+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=14745620;
 //BA.debugLineNum = 14745620;BA.debugLine="End Sub";
return "";
}
public String  _cacheaudittimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cacheaudittimer_tick", false))
	 {return ((String) Debug.delegate(ba, "cacheaudittimer_tick", null));}
boolean _hasmore = false;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub CacheAuditTimer_Tick";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_START_DEL";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="If mediaCacheService.IsCacheAuditInProgress = Fal";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._iscacheauditinprogress /*boolean*/ (null)==__c.False) { 
__ref._mediacacheservice /*b4j.example.mediacache*/ ._startcacheaudit /*String*/ (null);};
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim hasMore As Boolean = mediaCacheService.RunCac";
_hasmore = __ref._mediacacheservice /*b4j.example.mediacache*/ ._runcacheauditstep /*boolean*/ (null);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="If hasMore Then";
if (_hasmore) { 
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_STEP_INTE";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_step_interval_ms /*int*/ ));
 }else {
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="PruneTrackCacheIfNeeded(\"cache_audit\")";
__ref._prunetrackcacheifneeded /*String*/ (null,"cache_audit");
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_RECHECK_I";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_recheck_interval_ms /*int*/ ));
 };
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="End Sub";
return "";
}
public String  _prunetrackcacheifneeded(b4j.example.b4xmainpage __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prunetrackcacheifneeded", false))
	 {return ((String) Debug.delegate(ba, "prunetrackcacheifneeded", new Object[] {_initiator}));}
anywheresoftware.b4a.objects.collections.List _protectedtrackids = null;
anywheresoftware.b4a.objects.collections.List _relevanttrackids = null;
int _removedcount = 0;
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Private Sub PruneTrackCacheIfNeeded(initiator As S";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="If DateTime.Now - lastTrackCachePruneAt < TRACK_C";
if (__c.DateTime.getNow()-__ref._lasttrackcachepruneat /*long*/ <__ref._track_cache_prune_cooldown_ms /*long*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="Dim protectedTrackIds As List = CollectProtectedT";
_protectedtrackids = new anywheresoftware.b4a.objects.collections.List();
_protectedtrackids = __ref._collectprotectedtrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=57081859;
 //BA.debugLineNum = 57081859;BA.debugLine="Dim relevantTrackIds As List = CollectRelevantTra";
_relevanttrackids = new anywheresoftware.b4a.objects.collections.List();
_relevanttrackids = __ref._collectrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=57081860;
 //BA.debugLineNum = 57081860;BA.debugLine="Dim removedCount As Int = mediaCacheService.Prune";
_removedcount = __ref._mediacacheservice /*b4j.example.mediacache*/ ._prunetrackcacheifneeded /*int*/ (null,_protectedtrackids,_relevanttrackids);
RDebugUtils.currentLine=57081861;
 //BA.debugLineNum = 57081861;BA.debugLine="If removedCount > 0 Then";
if (_removedcount>0) { 
RDebugUtils.currentLine=57081862;
 //BA.debugLineNum = 57081862;BA.debugLine="lastTrackCachePruneAt = DateTime.Now";
__ref._lasttrackcachepruneat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=57081863;
 //BA.debugLineNum = 57081863;BA.debugLine="TraceLog(\"кэш треков очистка итог initiator=\" &";
__ref._tracelog /*String*/ (null,"кэш треков очистка итог initiator="+_initiator+" removed="+BA.NumberToString(_removedcount));
 };
RDebugUtils.currentLine=57081865;
 //BA.debugLineNum = 57081865;BA.debugLine="End Sub";
return "";
}
public boolean  _canadvanceplaybacknow(b4j.example.b4xmainpage __ref,String _initiator,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canadvanceplaybacknow", false))
	 {return ((Boolean) Debug.delegate(ba, "canadvanceplaybacknow", new Object[] {_initiator,_logdecision}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub CanAdvancePlaybackNow(initiator As Str";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If orchestrationState.IsStoppedByUser Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=stopped_by_user");};
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="If orchestrationState.IsStopping Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=stopping");};
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ )) { 
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=flow_stopping");};
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="If playbackFlowState = FLOW_PAUSED_POLICY Then";
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ )) { 
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="If logDecision Then TraceLog(\"guard переход запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard переход запрет initiator="+_initiator+" reason=flow_paused_policy");};
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="End Sub";
return false;
}
public String  _canceldeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canceldeferredpoststarttasks", false))
	 {return ((String) Debug.delegate(ba, "canceldeferredpoststarttasks", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub CancelDeferredPostStartTasks";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If isAdWarmupDeferredAfterStartup = False And isP";
if (__ref._isadwarmupdeferredafterstartup /*boolean*/ ==__c.False && __ref._ispoststarttasksdeferredafterstartup /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public boolean  _cancrossfadeprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cancrossfadeprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "cancrossfadeprepareditem", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub CanCrossfadePreparedItem As Boolean";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Return transitionCoordinator.CanCrossfadePrepared";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._cancrossfadeprepareditem /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._isplaybacktransitioninprogress /*boolean*/ (null));
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return false;
}
public boolean  _isplaybacktransitioninprogress(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybacktransitioninprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybacktransitioninprogress", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub IsPlaybackTransitionInProgress As Bool";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Return playbackFlowState = FLOW_STARTING Or playb";
if (true) return (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_starting /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_transitioning /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ );
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return false;
}
public boolean  _canprefetchnextnow(b4j.example.b4xmainpage __ref,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canprefetchnextnow", false))
	 {return ((Boolean) Debug.delegate(ba, "canprefetchnextnow", new Object[] {_logdecision}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub CanPrefetchNextNow(logDecision As Bool";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If orchestrationState.PrefetchDone Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._prefetchdone /*boolean*/ ) { 
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="If logDecision Then TraceLog(\"guard prefetch зап";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard prefetch запрет reason=already_done");};
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Return CanPrepareNextPlayableNow(logDecision)";
if (true) return __ref._canpreparenextplayablenow /*boolean*/ (null,_logdecision);
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="End Sub";
return false;
}
public boolean  _canpreparenextplayablenow(b4j.example.b4xmainpage __ref,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canpreparenextplayablenow", false))
	 {return ((Boolean) Debug.delegate(ba, "canpreparenextplayablenow", new Object[] {_logdecision}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub CanPrepareNextPlayableNow(logDecision";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="If logDecision Then TraceLog(\"guard подготовка з";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"guard подготовка запрет reason=not_started");};
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Return CanAdvancePlaybackNow(\"prepare_next\", logD";
if (true) return __ref._canadvanceplaybacknow /*boolean*/ (null,"prepare_next",_logdecision);
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="End Sub";
return false;
}
public boolean  _canresumeplaybacknow(b4j.example.b4xmainpage __ref,String _reason,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canresumeplaybacknow", false))
	 {return ((Boolean) Debug.delegate(ba, "canresumeplaybacknow", new Object[] {_reason,_logdecision}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub CanResumePlaybackNow(reason As String,";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="If IsUserStoppedState Then";
if (__ref._isuserstoppedstate /*boolean*/ (null)) { 
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=user_stopped");};
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="If orchestrationState.IsStopping Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=stopping");};
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="If IsPolicyPauseState Then";
if (__ref._ispolicypausestate /*boolean*/ (null)) { 
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=policy_pause");};
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="If logDecision Then TraceLog(\"возобновление запр";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"возобновление запрет reason="+_reason+" state=not_started");};
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5701649;
 //BA.debugLineNum = 5701649;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="End Sub";
return false;
}
public boolean  _isuserstoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isuserstoppedstate", false))
	 {return ((Boolean) Debug.delegate(ba, "isuserstoppedstate", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub IsUserStoppedState As Boolean";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Return orchestrationState.IsStoppedByUser";
if (true) return __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return false;
}
public boolean  _ispolicypausestate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ispolicypausestate", false))
	 {return ((Boolean) Debug.delegate(ba, "ispolicypausestate", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub IsPolicyPauseState As Boolean";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return dataPolicyState.IsPlaybackPausedByPolicy O";
if (true) return __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/  || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ );
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return false;
}
public boolean  _canrundeferredpoststarttasks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canrundeferredpoststarttasks", false))
	 {return ((Boolean) Debug.delegate(ba, "canrundeferredpoststarttasks", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub CanRunDeferredPostStartTasks As Boolea";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If isStartupSequenceInProgress Then";
if (__ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="If orchestrationState.IsStopping Or orchestration";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="If orchestrationState.IsStarted = False Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub CanStartPreparedOnTrackTail As Boolean";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return transitionCoordinator.CanStartPreparedOnTr";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._canstartpreparedontracktail /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._isplaybacktransitioninprogress /*boolean*/ (null));
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return false;
}
public boolean  _canstopplaybacknow(b4j.example.b4xmainpage __ref,boolean _logdecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canstopplaybacknow", false))
	 {return ((Boolean) Debug.delegate(ba, "canstopplaybacknow", new Object[] {_logdecision}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub CanStopPlaybackNow(logDecision As Bool";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If orchestrationState.IsStopping Then";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="If logDecision Then TraceLog(\"stop skip reason=a";
if (_logdecision) { 
__ref._tracelog /*String*/ (null,"stop skip reason=already_stopping");};
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="End Sub";
return false;
}
public boolean  _canuseprepareditemnow(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canuseprepareditemnow", false))
	 {return ((Boolean) Debug.delegate(ba, "canuseprepareditemnow", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub CanUsePreparedItemNow As Boolean";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return HasUsablePreparedItem And CanAdvancePlayba";
if (true) return __ref._hasusableprepareditem /*boolean*/ (null) && __ref._canadvanceplaybacknow /*boolean*/ (null,"prepared_item",__c.False);
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return false;
}
public boolean  _hasusableprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hasusableprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "hasusableprepareditem", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub HasUsablePreparedItem As Boolean";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Return transitionCoordinator.HasUsablePreparedIte";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._hasusableprepareditem /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ );
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return false;
}
public String  _capturestoppedreservequeue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "capturestoppedreservequeue", false))
	 {return ((String) Debug.delegate(ba, "capturestoppedreservequeue", null));}
String _currentsignature = "";
anywheresoftware.b4a.objects.collections.List _reservequeue = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Private Sub CaptureStoppedReserveQueue";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
_currentsignature = __ref._buildqueuesignature /*String*/ (null);
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="If currentSignature = \"\" Then Return";
if ((_currentsignature).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Dim reserveQueue As List";
_reservequeue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="reserveQueue.Initialize";
_reservequeue.Initialize();
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_itemobject = group6.Get(index6);
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="If mediaCacheService.IsTrackCached(item.GetDefa";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="reserveQueue.Add(CloneMap(item))";
_reservequeue.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
 };
 }
};
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="queueState.CaptureStoppedReserve(reserveQueue, cu";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._capturestoppedreserve /*String*/ (null,_reservequeue,_currentsignature);
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="If queueState.StoppedReserveQueue.Size = 0 Then R";
if (__ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="TraceLog(\"резерв очереди save tracks=\" & queueSta";
__ref._tracelog /*String*/ (null,"резерв очереди save tracks="+BA.NumberToString(__ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="End Sub";
return "";
}
public boolean  _isvaliddatatrackitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isvaliddatatrackitem", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddatatrackitem", new Object[] {_item}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub IsValidDataTrackItem(item As Map) As B";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If item.IsInitialized = False Or item.Size = 0 Th";
if (_item.IsInitialized()==__c.False || _item.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return Fal";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkexternalconnectivity(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "checkexternalconnectivity", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkexternalconnectivity", null));}
ResumableSub_CheckExternalConnectivity rsub = new ResumableSub_CheckExternalConnectivity(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckExternalConnectivity extends BA.ResumableSub {
public ResumableSub_CheckExternalConnectivity(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
b4j.example.httpjob _j = null;
boolean _ok = false;

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
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="j.Download(EXTERNAL_CONNECTIVITY_CHECK_URL & \"?t=";
_j._download /*String*/ (null,__ref._external_connectivity_check_url /*String*/ +"?t="+BA.NumberToString(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._connectivity_check_timeout_ms /*int*/ );
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "checkexternalconnectivity"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkserviceavailability(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "checkserviceavailability", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkserviceavailability", null));}
ResumableSub_CheckServiceAvailability rsub = new ResumableSub_CheckServiceAvailability(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckServiceAvailability extends BA.ResumableSub {
public ResumableSub_CheckServiceAvailability(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
b4j.example.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
boolean _ok = false;

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
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Dim params As Map = CreateDataParams";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = __ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="params.Put(\"t\", DateTime.Now)";
_params.Put((Object)("t"),(Object)(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="j.Download(SERVICE_CHECK_URL & \"?\" & BuildParams(";
_j._download /*String*/ (null,__ref._service_check_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,_params));
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._connectivity_check_timeout_ms /*int*/ );
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "checkserviceavailability"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.Map  _createdataparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createdataparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createdataparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub CreateDataParams As Map";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="params.Put(\"os\", ResolveClientOsName)";
_params.Put((Object)("os"),(Object)(__ref._resolveclientosname /*String*/ (null)));
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private Const NEXT_BASE_URL As String = \"https://";
_next_base_url = "https://play.fon.fm/next";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private Const CLAIM_BASE_URL As String = \"https:/";
_claim_base_url = "https://play.fon.fm/claim";
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Private Const HISTORY_BASE_URL As String = \"https";
_history_base_url = "https://play.fon.fm/history";
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Private Const TRACE_BASE_URL As String = \"https:/";
_trace_base_url = "https://play.fon.fm/trace";
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Private Const HISTORY_FLUSH_INTERVAL_MS As Int =";
_history_flush_interval_ms = (int) (30000);
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Private Const TRACE_FLUSH_INTERVAL_MS As Int = 60";
_trace_flush_interval_ms = (int) (60*1000);
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Private Const DATA_BASE_URL As String = \"https://";
_data_base_url = "https://play.fon.fm/data";
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Private Const PLAYLIST_CDN_BASE_URL As String = \"";
_playlist_cdn_base_url = "https://cdn.fon.fm/data/playlists/";
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="Private Const SERVICE_CHECK_URL As String = \"http";
_service_check_url = "https://play.fon.fm/data";
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Private Const EXTERNAL_CONNECTIVITY_CHECK_URL As";
_external_connectivity_check_url = "https://radiosparx.ru/img/logo-dark.svg";
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="Private Const USE_DATA_PLAYBACK_RESOLVER As Boole";
_use_data_playback_resolver = __c.True;
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="Private Const ICON_PLAY As String = Chr(0xE037)";
_icon_play = BA.ObjectToString(__c.Chr(((int)0xe037)));
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="Private Const ICON_STOP As String = Chr(0xE047)";
_icon_stop = BA.ObjectToString(__c.Chr(((int)0xe047)));
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="Private Const ICON_MORE As String = Chr(0xE5D3)";
_icon_more = BA.ObjectToString(__c.Chr(((int)0xe5d3)));
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Private Const ICON_CLOSE As String = Chr(0xE5CD)";
_icon_close = BA.ObjectToString(__c.Chr(((int)0xe5cd)));
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="Private Const ICON_CLOUD_OK As String = Chr(0xE2B";
_icon_cloud_ok = BA.ObjectToString(__c.Chr(((int)0xe2bf)));
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="Private Const ICON_CLOUD_OFF As String = Chr(0xE2";
_icon_cloud_off = BA.ObjectToString(__c.Chr(((int)0xe2c1)));
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="Private Const ICON_CLOUD_DEGRADED As String = Chr";
_icon_cloud_degraded = BA.ObjectToString(__c.Chr(((int)0xe2c2)));
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="Private Const PREFETCH_SECONDS As Int = 10";
_prefetch_seconds = (int) (10);
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="Private Const STOP_FADE_MS As Int = 3000";
_stop_fade_ms = (int) (3000);
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="Private Const ORBIT_FADE_MS As Int = 3000";
_orbit_fade_ms = (int) (3000);
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Private Const START_FADE_MS As Int = 1500";
_start_fade_ms = (int) (1500);
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Private Const TRACK_OVERLAP_MS As Int = 1800";
_track_overlap_ms = (int) (1800);
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Private Const AD_TAIL_OVERLAP_MS As Int = 350";
_ad_tail_overlap_ms = (int) (350);
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="Private Const TRACK_CACHE_WARMUP_DELAY_MS As Int";
_track_cache_warmup_delay_ms = (int) (7000);
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="Private Const LOOKAHEAD_QUEUE_TARGET_ITEMS As Int";
_lookahead_queue_target_items = (int) (2);
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="Private Const CACHE_AUDIT_START_DELAY_MS As Int =";
_cache_audit_start_delay_ms = (int) (20000);
RDebugUtils.currentLine=196636;
 //BA.debugLineNum = 196636;BA.debugLine="Private Const CACHE_AUDIT_STEP_INTERVAL_MS As Int";
_cache_audit_step_interval_ms = (int) (2000);
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="Private Const CACHE_AUDIT_RECHECK_INTERVAL_MS As";
_cache_audit_recheck_interval_ms = (int) (30*60*1000);
RDebugUtils.currentLine=196638;
 //BA.debugLineNum = 196638;BA.debugLine="Private Const TRACK_CACHE_PRUNE_COOLDOWN_MS As Lo";
_track_cache_prune_cooldown_ms = (long) (10*60*1000);
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="Private Const DATA_REFRESH_MS As Int = 5 * 60 * 1";
_data_refresh_ms = (int) (5*60*1000);
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="Private Const FETCH_TIMEOUT_MS As Int = 4000";
_fetch_timeout_ms = (int) (4000);
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="Private Const AUDIO_READY_TIMEOUT_MS As Int = 500";
_audio_ready_timeout_ms = (int) (5000);
RDebugUtils.currentLine=196642;
 //BA.debugLineNum = 196642;BA.debugLine="Private Const PLAYBACK_WATCHDOG_INTERVAL_MS As In";
_playback_watchdog_interval_ms = (int) (1000);
RDebugUtils.currentLine=196643;
 //BA.debugLineNum = 196643;BA.debugLine="Private Const PLAYBACK_WATCHDOG_STALL_MS As Long";
_playback_watchdog_stall_ms = (long) (4000);
RDebugUtils.currentLine=196644;
 //BA.debugLineNum = 196644;BA.debugLine="Private Const PLAYBACK_WATCHDOG_RECOVERY_COOLDOWN";
_playback_watchdog_recovery_cooldown_ms = (long) (10000);
RDebugUtils.currentLine=196645;
 //BA.debugLineNum = 196645;BA.debugLine="Private Const PLAYBACK_WATCHDOG_PROGRESS_DELTA_MS";
_playback_watchdog_progress_delta_ms = (long) (150);
RDebugUtils.currentLine=196646;
 //BA.debugLineNum = 196646;BA.debugLine="Private Const PLAYBACK_WATCHDOG_GRACE_MS As Long";
_playback_watchdog_grace_ms = (long) (3000);
RDebugUtils.currentLine=196647;
 //BA.debugLineNum = 196647;BA.debugLine="Private Const CONNECTIVITY_CHECK_TIMEOUT_MS As In";
_connectivity_check_timeout_ms = (int) (2500);
RDebugUtils.currentLine=196648;
 //BA.debugLineNum = 196648;BA.debugLine="Private Const PAUSE_RETRY_DELAY As Int = 300000";
_pause_retry_delay = (int) (300000);
RDebugUtils.currentLine=196649;
 //BA.debugLineNum = 196649;BA.debugLine="Private Const LOCAL_RETRY_DELAY_INITIAL As Int =";
_local_retry_delay_initial = (int) (5000);
RDebugUtils.currentLine=196650;
 //BA.debugLineNum = 196650;BA.debugLine="Private Const LOCAL_RETRY_DELAY_MAX As Int = 3000";
_local_retry_delay_max = (int) (30000);
RDebugUtils.currentLine=196651;
 //BA.debugLineNum = 196651;BA.debugLine="Private Const SERVER_RETRY_DELAY_INITIAL As Int =";
_server_retry_delay_initial = (int) (10000);
RDebugUtils.currentLine=196652;
 //BA.debugLineNum = 196652;BA.debugLine="Private Const SERVER_RETRY_DELAY_MAX As Int = 600";
_server_retry_delay_max = (int) (60000);
RDebugUtils.currentLine=196653;
 //BA.debugLineNum = 196653;BA.debugLine="Private Const BLOCKED_RETRY_DELAY As Int = 60000";
_blocked_retry_delay = (int) (60000);
RDebugUtils.currentLine=196654;
 //BA.debugLineNum = 196654;BA.debugLine="Private Const FLOW_IDLE As String = \"idle\"";
_flow_idle = "idle";
RDebugUtils.currentLine=196655;
 //BA.debugLineNum = 196655;BA.debugLine="Private Const FLOW_STARTING As String = \"starting";
_flow_starting = "starting";
RDebugUtils.currentLine=196656;
 //BA.debugLineNum = 196656;BA.debugLine="Private Const FLOW_PLAYING As String = \"playing\"";
_flow_playing = "playing";
RDebugUtils.currentLine=196657;
 //BA.debugLineNum = 196657;BA.debugLine="Private Const FLOW_PREPARING As String = \"prepari";
_flow_preparing = "preparing";
RDebugUtils.currentLine=196658;
 //BA.debugLineNum = 196658;BA.debugLine="Private Const FLOW_TRANSITIONING As String = \"tra";
_flow_transitioning = "transitioning";
RDebugUtils.currentLine=196659;
 //BA.debugLineNum = 196659;BA.debugLine="Private Const FLOW_STOPPING As String = \"stopping";
_flow_stopping = "stopping";
RDebugUtils.currentLine=196660;
 //BA.debugLineNum = 196660;BA.debugLine="Private Const FLOW_PAUSED_POLICY As String = \"pau";
_flow_paused_policy = "paused_policy";
RDebugUtils.currentLine=196661;
 //BA.debugLineNum = 196661;BA.debugLine="Private Const FLOW_ERROR As String = \"error\"";
_flow_error = "error";
RDebugUtils.currentLine=196662;
 //BA.debugLineNum = 196662;BA.debugLine="Private rootView As B4XView";
_rootview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196663;
 //BA.debugLineNum = 196663;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=196664;
 //BA.debugLineNum = 196664;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=196665;
 //BA.debugLineNum = 196665;BA.debugLine="Private storageFile As String = \"player_state.jso";
_storagefile = "player_state.json";
RDebugUtils.currentLine=196666;
 //BA.debugLineNum = 196666;BA.debugLine="Private localStateDbName As String = \"LocalState\"";
_localstatedbname = "LocalState";
RDebugUtils.currentLine=196667;
 //BA.debugLineNum = 196667;BA.debugLine="Private trustedSyncTimeKey As String = \"trusted_s";
_trustedsynctimekey = "trusted_sync_time_ticks";
RDebugUtils.currentLine=196668;
 //BA.debugLineNum = 196668;BA.debugLine="Private playerDataFile As String = \"player_data.j";
_playerdatafile = "player_data.json";
RDebugUtils.currentLine=196669;
 //BA.debugLineNum = 196669;BA.debugLine="Private playlistRequirementsFile As String = \"pla";
_playlistrequirementsfile = "playlist_requirements.json";
RDebugUtils.currentLine=196670;
 //BA.debugLineNum = 196670;BA.debugLine="Private localPlaylistsDirName As String = \"playli";
_localplaylistsdirname = "playlists";
RDebugUtils.currentLine=196671;
 //BA.debugLineNum = 196671;BA.debugLine="Private historyDirName As String = \"history\"";
_historydirname = "history";
RDebugUtils.currentLine=196672;
 //BA.debugLineNum = 196672;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=196674;
 //BA.debugLineNum = 196674;BA.debugLine="Private card As B4XView";
_card = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196675;
 //BA.debugLineNum = 196675;BA.debugLine="Private headerPane As B4XView";
_headerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196676;
 //BA.debugLineNum = 196676;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196677;
 //BA.debugLineNum = 196677;BA.debugLine="Private contentPane As B4XView";
_contentpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196678;
 //BA.debugLineNum = 196678;BA.debugLine="Private footerPane As B4XView";
_footerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196679;
 //BA.debugLineNum = 196679;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196680;
 //BA.debugLineNum = 196680;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196681;
 //BA.debugLineNum = 196681;BA.debugLine="Private setupHeroPane As B4XView";
_setupheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196682;
 //BA.debugLineNum = 196682;BA.debugLine="Private setupDetailPane As B4XView";
_setupdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196683;
 //BA.debugLineNum = 196683;BA.debugLine="Private setupPrimaryPane As B4XView";
_setupprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196684;
 //BA.debugLineNum = 196684;BA.debugLine="Private setupStatusPane As B4XView";
_setupstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196685;
 //BA.debugLineNum = 196685;BA.debugLine="Private playerHeroPane As B4XView";
_playerheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196686;
 //BA.debugLineNum = 196686;BA.debugLine="Private playerDetailPane As B4XView";
_playerdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196687;
 //BA.debugLineNum = 196687;BA.debugLine="Private playerPrimaryPane As B4XView";
_playerprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196688;
 //BA.debugLineNum = 196688;BA.debugLine="Private playerStatusPane As B4XView";
_playerstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196689;
 //BA.debugLineNum = 196689;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196690;
 //BA.debugLineNum = 196690;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196691;
 //BA.debugLineNum = 196691;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196692;
 //BA.debugLineNum = 196692;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196693;
 //BA.debugLineNum = 196693;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196694;
 //BA.debugLineNum = 196694;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196696;
 //BA.debugLineNum = 196696;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196697;
 //BA.debugLineNum = 196697;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196698;
 //BA.debugLineNum = 196698;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196699;
 //BA.debugLineNum = 196699;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196700;
 //BA.debugLineNum = 196700;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196701;
 //BA.debugLineNum = 196701;BA.debugLine="Private lblFooter As B4XView";
_lblfooter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196702;
 //BA.debugLineNum = 196702;BA.debugLine="Private lblConnectionIcon As B4XView";
_lblconnectionicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196703;
 //BA.debugLineNum = 196703;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196705;
 //BA.debugLineNum = 196705;BA.debugLine="Private txtPlayerCode As TextField";
_txtplayercode = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=196706;
 //BA.debugLineNum = 196706;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196707;
 //BA.debugLineNum = 196707;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196708;
 //BA.debugLineNum = 196708;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196709;
 //BA.debugLineNum = 196709;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=196710;
 //BA.debugLineNum = 196710;BA.debugLine="Private playIconBaseSize As Float";
_playiconbasesize = 0f;
RDebugUtils.currentLine=196711;
 //BA.debugLineNum = 196711;BA.debugLine="Private stopIconBaseSize As Float";
_stopiconbasesize = 0f;
RDebugUtils.currentLine=196712;
 //BA.debugLineNum = 196712;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
RDebugUtils.currentLine=196713;
 //BA.debugLineNum = 196713;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
RDebugUtils.currentLine=196714;
 //BA.debugLineNum = 196714;BA.debugLine="Private isCodeInputFocused As Boolean";
_iscodeinputfocused = false;
RDebugUtils.currentLine=196716;
 //BA.debugLineNum = 196716;BA.debugLine="Private audioPrimary As AudioPlayer";
_audioprimary = new b4j.example.audioplayer();
RDebugUtils.currentLine=196717;
 //BA.debugLineNum = 196717;BA.debugLine="Private audioSecondary As AudioPlayer";
_audiosecondary = new b4j.example.audioplayer();
RDebugUtils.currentLine=196718;
 //BA.debugLineNum = 196718;BA.debugLine="Private localAdScheduler As AdScheduler";
_localadscheduler = new b4j.example.adscheduler();
RDebugUtils.currentLine=196719;
 //BA.debugLineNum = 196719;BA.debugLine="Private dataResolver As DataPlaybackResolver";
_dataresolver = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=196720;
 //BA.debugLineNum = 196720;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4j.example.offlinestore();
RDebugUtils.currentLine=196721;
 //BA.debugLineNum = 196721;BA.debugLine="Private appTraceService As TraceService";
_apptraceservice = new b4j.example.traceservice();
RDebugUtils.currentLine=196722;
 //BA.debugLineNum = 196722;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4j.example.mediacache();
RDebugUtils.currentLine=196723;
 //BA.debugLineNum = 196723;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=196724;
 //BA.debugLineNum = 196724;BA.debugLine="Private playQueue As List";
_playqueue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196725;
 //BA.debugLineNum = 196725;BA.debugLine="Private messages As Map";
_messages = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196726;
 //BA.debugLineNum = 196726;BA.debugLine="Private traceLogLimit As Int = 1000";
_traceloglimit = (int) (1000);
RDebugUtils.currentLine=196727;
 //BA.debugLineNum = 196727;BA.debugLine="Private serverSnapshotLimit As Int = 30";
_serversnapshotlimit = (int) (30);
RDebugUtils.currentLine=196728;
 //BA.debugLineNum = 196728;BA.debugLine="Private offlineData As Map";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196730;
 //BA.debugLineNum = 196730;BA.debugLine="Private retryTimer As Timer";
_retrytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196731;
 //BA.debugLineNum = 196731;BA.debugLine="Private breakTimer As Timer";
_breaktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196732;
 //BA.debugLineNum = 196732;BA.debugLine="Private historyFlushTimer As Timer";
_historyflushtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196733;
 //BA.debugLineNum = 196733;BA.debugLine="Private traceUploadTimer As Timer";
_traceuploadtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196734;
 //BA.debugLineNum = 196734;BA.debugLine="Private orbitTimer As Timer";
_orbittimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196735;
 //BA.debugLineNum = 196735;BA.debugLine="Private offlineDataRefreshTimer As Timer";
_offlinedatarefreshtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196736;
 //BA.debugLineNum = 196736;BA.debugLine="Private localAdMinuteTimer As Timer";
_localadminutetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196737;
 //BA.debugLineNum = 196737;BA.debugLine="Private trackCacheWarmupTimer As Timer";
_trackcachewarmuptimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196738;
 //BA.debugLineNum = 196738;BA.debugLine="Private cacheAuditTimer As Timer";
_cacheaudittimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196739;
 //BA.debugLineNum = 196739;BA.debugLine="Private playbackWatchdogTimer As Timer";
_playbackwatchdogtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=196740;
 //BA.debugLineNum = 196740;BA.debugLine="Private machineGuidShell As Shell";
_machineguidshell = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=196742;
 //BA.debugLineNum = 196742;BA.debugLine="Private playerCode As String";
_playercode = "";
RDebugUtils.currentLine=196743;
 //BA.debugLineNum = 196743;BA.debugLine="Private deviceId As String";
_deviceid = "";
RDebugUtils.currentLine=196744;
 //BA.debugLineNum = 196744;BA.debugLine="Private appScreenMode As String";
_appscreenmode = "";
RDebugUtils.currentLine=196745;
 //BA.debugLineNum = 196745;BA.debugLine="Private nextStartMode As String";
_nextstartmode = "";
RDebugUtils.currentLine=196746;
 //BA.debugLineNum = 196746;BA.debugLine="Private runtimeState As PlaybackRuntimeState";
_runtimestate = new b4j.example.playbackruntimestate();
RDebugUtils.currentLine=196747;
 //BA.debugLineNum = 196747;BA.debugLine="Private metaState As PlaybackMetaState";
_metastate = new b4j.example.playbackmetastate();
RDebugUtils.currentLine=196748;
 //BA.debugLineNum = 196748;BA.debugLine="Private orchestrationState As PlaybackOrchestrati";
_orchestrationstate = new b4j.example.playbackorchestrationstate();
RDebugUtils.currentLine=196749;
 //BA.debugLineNum = 196749;BA.debugLine="Private dataPolicyState As PlaybackDataPolicyStat";
_datapolicystate = new b4j.example.playbackdatapolicystate();
RDebugUtils.currentLine=196750;
 //BA.debugLineNum = 196750;BA.debugLine="Private retryFallbackState As PlaybackRetryFallba";
_retryfallbackstate = new b4j.example.playbackretryfallbackstate();
RDebugUtils.currentLine=196751;
 //BA.debugLineNum = 196751;BA.debugLine="Private queueState As PlaybackQueueState";
_queuestate = new b4j.example.playbackqueuestate();
RDebugUtils.currentLine=196752;
 //BA.debugLineNum = 196752;BA.debugLine="Private queueBuilder As PlaybackQueueBuilder";
_queuebuilder = new b4j.example.playbackqueuebuilder();
RDebugUtils.currentLine=196753;
 //BA.debugLineNum = 196753;BA.debugLine="Private transitionCoordinator As PlaybackTransiti";
_transitioncoordinator = new b4j.example.playbacktransitioncoordinator();
RDebugUtils.currentLine=196754;
 //BA.debugLineNum = 196754;BA.debugLine="Private facade As PlaybackFacade";
_facade = new b4j.example.playbackfacade();
RDebugUtils.currentLine=196755;
 //BA.debugLineNum = 196755;BA.debugLine="Private responseAdapter As PlaybackResponseAdapte";
_responseadapter = new b4j.example.playbackresponseadapter();
RDebugUtils.currentLine=196756;
 //BA.debugLineNum = 196756;BA.debugLine="Private initialStartFadePending As Boolean";
_initialstartfadepending = false;
RDebugUtils.currentLine=196757;
 //BA.debugLineNum = 196757;BA.debugLine="Private isHistoryFlushInProgress As Boolean";
_ishistoryflushinprogress = false;
RDebugUtils.currentLine=196758;
 //BA.debugLineNum = 196758;BA.debugLine="Private isTraceUploadInProgress As Boolean";
_istraceuploadinprogress = false;
RDebugUtils.currentLine=196759;
 //BA.debugLineNum = 196759;BA.debugLine="Private cachedRelevantTrackIds As List";
_cachedrelevanttrackids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196760;
 //BA.debugLineNum = 196760;BA.debugLine="Private lastTrackCachePruneAt As Long";
_lasttrackcachepruneat = 0L;
RDebugUtils.currentLine=196761;
 //BA.debugLineNum = 196761;BA.debugLine="Private consecutiveNetworkErrors As Int";
_consecutivenetworkerrors = 0;
RDebugUtils.currentLine=196762;
 //BA.debugLineNum = 196762;BA.debugLine="Private lastDataOkAt As Long";
_lastdataokat = 0L;
RDebugUtils.currentLine=196763;
 //BA.debugLineNum = 196763;BA.debugLine="Private lastHistoryOkAt As Long";
_lasthistoryokat = 0L;
RDebugUtils.currentLine=196764;
 //BA.debugLineNum = 196764;BA.debugLine="Private lastPlaybackWatchdogPositionMs As Long";
_lastplaybackwatchdogpositionms = 0L;
RDebugUtils.currentLine=196765;
 //BA.debugLineNum = 196765;BA.debugLine="Private lastPlaybackWatchdogTrackId As String";
_lastplaybackwatchdogtrackid = "";
RDebugUtils.currentLine=196766;
 //BA.debugLineNum = 196766;BA.debugLine="Private lastPlaybackWatchdogProgressAt As Long";
_lastplaybackwatchdogprogressat = 0L;
RDebugUtils.currentLine=196767;
 //BA.debugLineNum = 196767;BA.debugLine="Private lastPlaybackWatchdogRecoveryAt As Long";
_lastplaybackwatchdogrecoveryat = 0L;
RDebugUtils.currentLine=196768;
 //BA.debugLineNum = 196768;BA.debugLine="Private isPlaybackWatchdogTickInProgress As Boole";
_isplaybackwatchdogtickinprogress = false;
RDebugUtils.currentLine=196770;
 //BA.debugLineNum = 196770;BA.debugLine="Private playlistIndex As Int = -1";
_playlistindex = (int) (-1);
RDebugUtils.currentLine=196771;
 //BA.debugLineNum = 196771;BA.debugLine="Private orbitPulseStep As Int";
_orbitpulsestep = 0;
RDebugUtils.currentLine=196772;
 //BA.debugLineNum = 196772;BA.debugLine="Private orbitFadeValue As Double";
_orbitfadevalue = 0;
RDebugUtils.currentLine=196773;
 //BA.debugLineNum = 196773;BA.debugLine="Private orbitFadeTarget As Double";
_orbitfadetarget = 0;
RDebugUtils.currentLine=196774;
 //BA.debugLineNum = 196774;BA.debugLine="Private isStartupSequenceInProgress As Boolean";
_isstartupsequenceinprogress = false;
RDebugUtils.currentLine=196775;
 //BA.debugLineNum = 196775;BA.debugLine="Private isAdWarmupDeferredAfterStartup As Boolean";
_isadwarmupdeferredafterstartup = false;
RDebugUtils.currentLine=196776;
 //BA.debugLineNum = 196776;BA.debugLine="Private isPostStartTasksDeferredAfterStartup As B";
_ispoststarttasksdeferredafterstartup = false;
RDebugUtils.currentLine=196777;
 //BA.debugLineNum = 196777;BA.debugLine="Private playbackFlowState As String";
_playbackflowstate = "";
RDebugUtils.currentLine=196778;
 //BA.debugLineNum = 196778;BA.debugLine="End Sub";
return "";
}
public String  _classifyhttpfailure(b4j.example.b4xmainpage __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "classifyhttpfailure", false))
	 {return ((String) Debug.delegate(ba, "classifyhttpfailure", new Object[] {_errormessage}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub ClassifyHttpFailure(errorMessage As St";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="If IsOfflineHttpError(errorMessage) Then Return \"";
if (__ref._isofflinehttperror /*boolean*/ (null,_errormessage)) { 
if (true) return "offline";};
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Return \"server\"";
if (true) return "server";
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="End Sub";
return "";
}
public boolean  _isofflinehttperror(b4j.example.b4xmainpage __ref,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isofflinehttperror", false))
	 {return ((Boolean) Debug.delegate(ba, "isofflinehttperror", new Object[] {_errormessage}));}
String _text = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub IsOfflineHttpError(errorMessage As Str";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim text As String = errorMessage.ToLowerCase";
_text = _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If text.Contains(\"timed out\") Then Return True";
if (_text.contains("timed out")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="If text.Contains(\"unknownhost\") Then Return True";
if (_text.contains("unknownhost")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If text.Contains(\"refused\") Then Return True";
if (_text.contains("refused")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="If text.Contains(\"sslhandshakeexception\") Then Re";
if (_text.contains("sslhandshakeexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="If text.Contains(\"pkix path building failed\") The";
if (_text.contains("pkix path building failed")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="If text.Contains(\"unable to find valid certificat";
if (_text.contains("unable to find valid certification path")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="If text.Contains(\"connectexception\") Then Return";
if (_text.contains("connectexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="If text.Contains(\"socketexception\") Then Return T";
if (_text.contains("socketexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="If text.Contains(\"sockettimeoutexception\") Then R";
if (_text.contains("sockettimeoutexception")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="End Sub";
return false;
}
public String  _clearexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "clearexactbreakstate", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub ClearExactBreakState";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="queueState.ClearExactBreakState";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorylogtimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearhistorylogtimer", false))
	 {return ((String) Debug.delegate(ba, "clearhistorylogtimer", null));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub ClearHistoryLogTimer";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="metaState.ClearHistoryStage";
__ref._metastate /*b4j.example.playbackmetastate*/ ._clearhistorystage /*String*/ (null);
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpendingplaystate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingplaystate", null));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub ClearPendingPlayState";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="runtimeState.ClearPendingPlayState";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "clearplaybackstate", null));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Private Sub ClearPlaybackState";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="TraceLog(\"состояние воспроизведения clear\")";
__ref._tracelog /*String*/ (null,"состояние воспроизведения clear");
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="audioPrimary.Reset";
__ref._audioprimary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="audioSecondary.Reset";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="runtimeState.ActiveItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12713993;
 //BA.debugLineNum = 12713993;BA.debugLine="runtimeState.PreparedItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12713994;
 //BA.debugLineNum = 12713994;BA.debugLine="metaState.Reset";
__ref._metastate /*b4j.example.playbackmetastate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=12713995;
 //BA.debugLineNum = 12713995;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=12713999;
 //BA.debugLineNum = 12713999;BA.debugLine="initialStartFadePending = False";
__ref._initialstartfadepending /*boolean*/  = __c.False;
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=12714001;
 //BA.debugLineNum = 12714001;BA.debugLine="retryFallbackState.ClearDispatchRetryAfter";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=12714002;
 //BA.debugLineNum = 12714002;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=12714003;
 //BA.debugLineNum = 12714003;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=12714004;
 //BA.debugLineNum = 12714004;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=12714005;
 //BA.debugLineNum = 12714005;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=12714006;
 //BA.debugLineNum = 12714006;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=12714007;
 //BA.debugLineNum = 12714007;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedstate(b4j.example.b4xmainpage __ref,boolean _resetplayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpreparedstate", false))
	 {return ((String) Debug.delegate(ba, "clearpreparedstate", new Object[] {_resetplayer}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Private Sub ClearPreparedState(resetPlayer As Bool";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" And resetP";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ ).equals("") == false && _resetplayer) { 
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="GetAudioByKey(runtimeState.PreparedAudioKey).Res";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ )._reset /*String*/ (null);
 };
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="runtimeState.PreparedAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="runtimeState.PreparedItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="runtimeState.ClearPendingPrepareState";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._clearpendingpreparestate /*String*/ (null);
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearretrytimer", false))
	 {return ((String) Debug.delegate(ba, "clearretrytimer", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub ClearRetryTimer";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="End Sub";
return "";
}
public String  _resetplaybackwatchdogstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetplaybackwatchdogstate", false))
	 {return ((String) Debug.delegate(ba, "resetplaybackwatchdogstate", null));}
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Private Sub ResetPlaybackWatchdogState";
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="lastPlaybackWatchdogPositionMs = -1";
__ref._lastplaybackwatchdogpositionms /*long*/  = (long) (-1);
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="lastPlaybackWatchdogTrackId = \"\"";
__ref._lastplaybackwatchdogtrackid /*String*/  = "";
RDebugUtils.currentLine=60293123;
 //BA.debugLineNum = 60293123;BA.debugLine="lastPlaybackWatchdogProgressAt = 0";
__ref._lastplaybackwatchdogprogressat /*long*/  = (long) (0);
RDebugUtils.currentLine=60293124;
 //BA.debugLineNum = 60293124;BA.debugLine="lastPlaybackWatchdogRecoveryAt = 0";
__ref._lastplaybackwatchdogrecoveryat /*long*/  = (long) (0);
RDebugUtils.currentLine=60293125;
 //BA.debugLineNum = 60293125;BA.debugLine="End Sub";
return "";
}
public String  _clearqueuesnapshotstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearqueuesnapshotstate", false))
	 {return ((String) Debug.delegate(ba, "clearqueuesnapshotstate", null));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub ClearQueueSnapshotState";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="queueState.ClearQueueSnapshot(storage)";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._clearqueuesnapshot /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ );
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="TraceLog(\"снимок очереди clear\")";
__ref._tracelog /*String*/ (null,"снимок очереди clear");
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _clonelist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clonelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "clonelist", new Object[] {_source}));}
anywheresoftware.b4a.objects.collections.List _copy = null;
Object _item = null;
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Private Sub CloneList(source As List) As List";
RDebugUtils.currentLine=57475073;
 //BA.debugLineNum = 57475073;BA.debugLine="Dim copy As List";
_copy = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="copy.Initialize";
_copy.Initialize();
RDebugUtils.currentLine=57475075;
 //BA.debugLineNum = 57475075;BA.debugLine="If source.IsInitialized = False Then Return copy";
if (_source.IsInitialized()==__c.False) { 
if (true) return _copy;};
RDebugUtils.currentLine=57475076;
 //BA.debugLineNum = 57475076;BA.debugLine="For Each item As Object In source";
{
final anywheresoftware.b4a.BA.IterableList group4 = _source;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item = group4.Get(index4);
RDebugUtils.currentLine=57475077;
 //BA.debugLineNum = 57475077;BA.debugLine="copy.Add(item)";
_copy.Add(_item);
 }
};
RDebugUtils.currentLine=57475079;
 //BA.debugLineNum = 57475079;BA.debugLine="Return copy";
if (true) return _copy;
RDebugUtils.currentLine=57475080;
 //BA.debugLineNum = 57475080;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Private Sub CollectProtectedTrackIds As List";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=57147395;
 //BA.debugLineNum = 57147395;BA.debugLine="Dim protectedIds As Map";
_protectedids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57147396;
 //BA.debugLineNum = 57147396;BA.debugLine="protectedIds.Initialize";
_protectedids.Initialize();
RDebugUtils.currentLine=57147397;
 //BA.debugLineNum = 57147397;BA.debugLine="AddProtectedTrackId(protectedIds, runtimeState.Ac";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=57147398;
 //BA.debugLineNum = 57147398;BA.debugLine="AddProtectedTrackId(protectedIds, runtimeState.Pr";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=57147399;
 //BA.debugLineNum = 57147399;BA.debugLine="AddProtectedTrackId(protectedIds, runtimeState.Pe";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=57147400;
 //BA.debugLineNum = 57147400;BA.debugLine="AddProtectedTrackId(protectedIds, runtimeState.Pe";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=57147401;
 //BA.debugLineNum = 57147401;BA.debugLine="If playQueue.IsInitialized Then";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=57147402;
 //BA.debugLineNum = 57147402;BA.debugLine="For Each itemObject As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group10 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_itemobject = group10.Get(index10);
RDebugUtils.currentLine=57147403;
 //BA.debugLineNum = 57147403;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=57147404;
 //BA.debugLineNum = 57147404;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=57147405;
 //BA.debugLineNum = 57147405;BA.debugLine="AddProtectedTrackId(protectedIds, item)";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,_item);
 };
 }
};
 };
RDebugUtils.currentLine=57147409;
 //BA.debugLineNum = 57147409;BA.debugLine="If queueState.StoppedReserveQueue.IsInitialized T";
if (__ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=57147410;
 //BA.debugLineNum = 57147410;BA.debugLine="For Each itemObject As Object In queueState.Stop";
{
final anywheresoftware.b4a.BA.IterableList group18 = __ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_itemobject = group18.Get(index18);
RDebugUtils.currentLine=57147411;
 //BA.debugLineNum = 57147411;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=57147412;
 //BA.debugLineNum = 57147412;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=57147413;
 //BA.debugLineNum = 57147413;BA.debugLine="AddProtectedTrackId(protectedIds, item)";
__ref._addprotectedtrackid /*String*/ (null,_protectedids,_item);
 };
 }
};
 };
RDebugUtils.currentLine=57147417;
 //BA.debugLineNum = 57147417;BA.debugLine="For Each trackId As String In protectedIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = _protectedids.Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_trackid = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=57147418;
 //BA.debugLineNum = 57147418;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=57147420;
 //BA.debugLineNum = 57147420;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=57147421;
 //BA.debugLineNum = 57147421;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Private Sub CollectRelevantTrackIds As List";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="If cachedRelevantTrackIds.IsInitialized And cache";
if (__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
if (true) return __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57344003;
 //BA.debugLineNum = 57344003;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=57344004;
 //BA.debugLineNum = 57344004;BA.debugLine="Dim relevantIds As Map";
_relevantids = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57344005;
 //BA.debugLineNum = 57344005;BA.debugLine="relevantIds.Initialize";
_relevantids.Initialize();
RDebugUtils.currentLine=57344006;
 //BA.debugLineNum = 57344006;BA.debugLine="Dim descriptors As List = offlineStoreService.Get";
_descriptors = new anywheresoftware.b4a.objects.collections.List();
_descriptors = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=57344007;
 //BA.debugLineNum = 57344007;BA.debugLine="If descriptors.IsInitialized = False Then Return";
if (_descriptors.IsInitialized()==__c.False) { 
if (true) return _result;};
RDebugUtils.currentLine=57344008;
 //BA.debugLineNum = 57344008;BA.debugLine="For Each descriptorObject As Object In descriptor";
{
final anywheresoftware.b4a.BA.IterableList group8 = _descriptors;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_descriptorobject = group8.Get(index8);
RDebugUtils.currentLine=57344009;
 //BA.debugLineNum = 57344009;BA.debugLine="If descriptorObject Is Map Then";
if (_descriptorobject instanceof java.util.Map) { 
RDebugUtils.currentLine=57344010;
 //BA.debugLineNum = 57344010;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=57344011;
 //BA.debugLineNum = 57344011;BA.debugLine="Dim playlistId As String = descriptor.GetDefaul";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=57344012;
 //BA.debugLineNum = 57344012;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=57344013;
 //BA.debugLineNum = 57344013;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCach";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=57344014;
 //BA.debugLineNum = 57344014;BA.debugLine="If playlistData.IsInitialized = False Then Cont";
if (_playlistdata.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=57344015;
 //BA.debugLineNum = 57344015;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"t";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=57344016;
 //BA.debugLineNum = 57344016;BA.debugLine="If tracks.IsInitialized = False Then Continue";
if (_tracks.IsInitialized()==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=57344017;
 //BA.debugLineNum = 57344017;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group17 = _tracks;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_trackobject = group17.Get(index17);
RDebugUtils.currentLine=57344018;
 //BA.debugLineNum = 57344018;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=57344019;
 //BA.debugLineNum = 57344019;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=57344020;
 //BA.debugLineNum = 57344020;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\"";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=57344021;
 //BA.debugLineNum = 57344021;BA.debugLine="If trackId <> \"\" Then relevantIds.Put(trackId";
if ((_trackid).equals("") == false) { 
_relevantids.Put((Object)(_trackid),(Object)(__c.True));};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=57344026;
 //BA.debugLineNum = 57344026;BA.debugLine="For Each trackId As String In relevantIds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group26 = _relevantids.Keys();
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_trackid = BA.ObjectToString(group26.Get(index26));
RDebugUtils.currentLine=57344027;
 //BA.debugLineNum = 57344027;BA.debugLine="result.Add(trackId)";
_result.Add((Object)(_trackid));
 }
};
RDebugUtils.currentLine=57344029;
 //BA.debugLineNum = 57344029;BA.debugLine="cachedRelevantTrackIds = CloneList(result)";
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/  = __ref._clonelist /*anywheresoftware.b4a.objects.collections.List*/ (null,_result);
RDebugUtils.currentLine=57344030;
 //BA.debugLineNum = 57344030;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=57344031;
 //BA.debugLineNum = 57344031;BA.debugLine="End Sub";
return null;
}
public String  _configureplayerheader(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configureplayerheader", false))
	 {return ((String) Debug.delegate(ba, "configureplayerheader", null));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub ConfigurePlayerHeader";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="headerActionPane.Visible = True";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="lblHeaderAction.Text = ICON_MORE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_more /*String*/ );
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(b4j.example.b4xmainpage __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configuresetupscreen", false))
	 {return ((String) Debug.delegate(ba, "configuresetupscreen", new Object[] {_mode,_text}));}
boolean _issettingsmode = false;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub ConfigureSetupScreen(mode As String, t";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
_issettingsmode = (_mode).equals("settings");
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("setup") == false);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="lblHeaderAction.Text = ICON_CLOSE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_close /*String*/ );
 }else {
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="lblHeaderAction.Text = ICON_MORE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_more /*String*/ );
 };
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="txtPlayerCode.Editable = False";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.False);
 }else {
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="txtPlayerCode.Editable = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.True);
 };
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"logout\").ToU";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"logout").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"setup_submit";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"setup_submit").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 };
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="lblSetupMessage.Text = text";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
 }else 
{RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="Else If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="lblSetupMessage.Text = MessageValue(\"settings_th";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"settings_thanks"));
 }else {
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="lblSetupMessage.Text = MessageValue(\"setup_title";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"setup_title"));
 }}
;
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="If playerCode = \"\" Then lblHeader.Text = \"\"";
if ((__ref._playercode /*String*/ ).equals("")) { 
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");};
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="End Sub";
return "";
}
public boolean  _confirmpendinghistoryitem(b4j.example.b4xmainpage __ref,String _reason) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "confirmpendinghistoryitem", false))
	 {return ((Boolean) Debug.delegate(ba, "confirmpendinghistoryitem", new Object[] {_reason}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub ConfirmPendingHistoryItem(reason As St";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If metaState.PendingHistoryItem.IsInitialized = F";
if (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="If metaState.PendingHistoryItem.GetDefault(\"id\",";
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="TraceLog(\"история confirm reason=\" & reason & \" i";
__ref._tracelog /*String*/ (null,"история confirm reason="+_reason+" item="+__ref._describeitem /*String*/ (null,(Object)(__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="QueueHistoryRecordAt(metaState.PendingHistoryItem";
__ref._queuehistoryrecordat /*String*/ (null,__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ._historystartedatticks /*long*/ );
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub QueueHistoryRecordAt(item As Map, star";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Dim startedAt As Long = startedAtValue";
_startedat = _startedatvalue;
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="If startedAt <= 0 Then startedAt = DateTime.Now";
if (_startedat<=0) { 
_startedat = __c.DateTime.getNow();};
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Dim record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="record.Initialize";
_record.Initialize();
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Dim recordDate As String = FormatHistoryDate(star";
_recorddate = __ref._formathistorydate /*String*/ (null,_startedat);
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="record.Put(\"date\", recordDate)";
_record.Put((Object)("date"),(Object)(_recorddate));
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="record.Put(\"time\", FormatHistoryTime(startedAt))";
_record.Put((Object)("time"),(Object)(__ref._formathistorytime /*String*/ (null,_startedat)));
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="record.Put(\"type\", item.GetDefault(\"type\", \"\"))";
_record.Put((Object)("type"),_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="record.Put(\"id\", item.GetDefault(\"id\", \"\"))";
_record.Put((Object)("id"),_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="AppendHistoryRecord(recordDate, record)";
__ref._appendhistoryrecord /*String*/ (null,_recorddate,_record);
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="TraceLog(\"история буфер add date=\" & record.Get(\"";
__ref._tracelog /*String*/ (null,"история буфер add date="+BA.ObjectToString(_record.Get((Object)("date")))+" time="+BA.ObjectToString(_record.Get((Object)("time")))+" type="+BA.ObjectToString(_record.Get((Object)("type")))+" id="+BA.ObjectToString(_record.Get((Object)("id")))+" files="+BA.NumberToString(__ref._getpendinghistoryfilecount /*int*/ (null)));
RDebugUtils.currentLine=11337742;
 //BA.debugLineNum = 11337742;BA.debugLine="End Sub";
return "";
}
public int  _confirmreservedheight(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "confirmreservedheight", false))
	 {return ((Integer) Debug.delegate(ba, "confirmreservedheight", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub ConfirmReservedHeight As Int";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If confirmPane.Visible Then Return 84dip";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
if (true) return __c.DipToCurrent((int) (84));};
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return 0;
}
public String  _consumelastexception(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "consumelastexception", false))
	 {return ((String) Debug.delegate(ba, "consumelastexception", null));}
String _ignored = "";
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Private Sub ConsumeLastException";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="Dim ignored As String = LastException.Message";
_ignored = __c.LastException(ba).getMessage();
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="If ignored = \"__never__\" Then Return";
if ((_ignored).equals("__never__")) { 
if (true) return "";};
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="End Sub";
return "";
}
public String  _consumepreparedqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "consumepreparedqueueitem", false))
	 {return ((String) Debug.delegate(ba, "consumepreparedqueueitem", null));}
anywheresoftware.b4a.objects.collections.Map _firstqueueditem = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub ConsumePreparedQueueItem";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If playQueue.Size = 0 Or runtimeState.PreparedIte";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 || __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="If playQueue.Get(0) Is Map Then";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)) instanceof java.util.Map) { 
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim firstQueuedItem As Map = playQueue.Get(0)";
_firstqueueditem = new anywheresoftware.b4a.objects.collections.Map();
_firstqueueditem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="If ItemsMatch(firstQueuedItem, runtimeState.Prep";
if (__ref._itemsmatch /*boolean*/ (null,_firstqueueditem,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ )) { 
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="If firstItem.IsInitialized = False Or secondItem.";
if (_firstitem.IsInitialized()==__c.False || _seconditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="If firstItem.GetDefault(\"type\", \"\") <> secondItem";
if ((_firstitem.GetDefault((Object)("type"),(Object)(""))).equals(_seconditem.GetDefault((Object)("type"),(Object)(""))) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="If firstItem.GetDefault(\"id\", \"\") <> \"\" And first";
if ((_firstitem.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false && (_firstitem.GetDefault((Object)("id"),(Object)(""))).equals(_seconditem.GetDefault((Object)("id"),(Object)("")))) { 
if (true) return __c.True;};
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub CountAllPendingHistoryRecords As Int";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),"")==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Dim total As Int = 0";
_total = (int) (0);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="If IsHistoryFileName(fileName) = False Then Cont";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Try";
try {RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="total = total + CountNdjsonRecords(File.ReadStr";
_total = (int) (_total+__ref._countndjsonrecords /*int*/ (null,__c.File.ReadString(__ref._gethistorydir /*String*/ (null),_filename)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=11862026;
 //BA.debugLineNum = 11862026;BA.debugLine="TraceWarn(\"history\", \"не удалось прочитать файл";
__ref._tracewarn /*String*/ (null,"history","не удалось прочитать файл истории","file="+_filename);
 };
 }
};
RDebugUtils.currentLine=11862029;
 //BA.debugLineNum = 11862029;BA.debugLine="Return total";
if (true) return _total;
RDebugUtils.currentLine=11862030;
 //BA.debugLineNum = 11862030;BA.debugLine="End Sub";
return 0;
}
public boolean  _ishistoryfilename(b4j.example.b4xmainpage __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ishistoryfilename", false))
	 {return ((Boolean) Debug.delegate(ba, "ishistoryfilename", new Object[] {_filename}));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Private Sub IsHistoryFileName(fileName As String)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="If fileName = \"\" Then Return False";
if ((_filename).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="If fileName.EndsWith(\".ndjson\") = False Then Retu";
if (_filename.endsWith(".ndjson")==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Return Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}\\.ndjson$";
if (true) return __c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}\\.ndjson$",_filename);
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub CountNdjsonRecords(payload As String)";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim normalized As String = NormalizeNdjsonPayload";
_normalized = __ref._normalizendjsonpayload /*String*/ (null,_payload);
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="If normalized = \"\" Then Return 0";
if ((_normalized).equals("")) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim rows() As String = Regex.Split(CRLF, normaliz";
_rows = __c.Regex.Split(__c.CRLF,_normalized);
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="For Each row As String In rows";
{
final String[] group5 = _rows;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = group5[index5];
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="If row.Trim <> \"\" Then count = count + 1";
if ((_row.trim()).equals("") == false) { 
_count = (int) (_count+1);};
 }
};
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="End Sub";
return 0;
}
public String  _tracewarn(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracewarn", false))
	 {return ((String) Debug.delegate(ba, "tracewarn", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Private Sub TraceWarn(category As String, message";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="WriteTraceEntry(\"WARN\", category, message, detail";
__ref._writetraceentry /*String*/ (null,"WARN",_category,_message,_details);
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="End Sub";
return "";
}
public String  _normalizendjsonpayload(b4j.example.b4xmainpage __ref,String _payload) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizendjsonpayload", false))
	 {return ((String) Debug.delegate(ba, "normalizendjsonpayload", new Object[] {_payload}));}
String _linefeed = "";
String _normalized = "";
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub NormalizeNdjsonPayload(payload As Stri";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="If payload = Null Then Return \"\"";
if (_payload== null) { 
if (true) return "";};
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Dim lineFeed As String = Chr(10)";
_linefeed = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Dim normalized As String = payload.Replace(CRLF,";
_normalized = _payload.replace(__c.CRLF,_linefeed).replace(BA.ObjectToString(__c.Chr((int) (13))),_linefeed);
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="Do While normalized.Contains(lineFeed & lineFeed)";
while (_normalized.contains(_linefeed+_linefeed)) {
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="normalized = normalized.Replace(lineFeed & lineF";
_normalized = _normalized.replace(_linefeed+_linefeed,_linefeed);
 }
;
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="normalized = normalized.Trim";
_normalized = _normalized.trim();
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="If normalized = \"\" Then Return \"\"";
if ((_normalized).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="Return normalized.Replace(lineFeed, CRLF)";
if (true) return _normalized.replace(_linefeed,__c.CRLF);
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createclaimparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createclaimparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub CreateClaimParams As Map";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="End Sub";
return 0;
}
public String  _resolveclientosname(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveclientosname", false))
	 {return ((String) Debug.delegate(ba, "resolveclientosname", null));}
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Private Sub ResolveClientOsName As String";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="Return \"windows\"";
if (true) return "windows";
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createnextparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createnextparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub CreateNextParams As Map";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="params.Put(\"version\", ResolveAppVersion)";
_params.Put((Object)("version"),(Object)(__ref._resolveappversion /*String*/ (null)));
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="If nextStartMode = \"manual\" Or nextStartMode = \"a";
if ((__ref._nextstartmode /*String*/ ).equals("manual") || (__ref._nextstartmode /*String*/ ).equals("auto")) { 
_params.Put((Object)("start"),(Object)(__ref._nextstartmode /*String*/ ));};
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (__ref._playlistindex /*int*/ >=0) { 
_params.Put((Object)("playlist"),(Object)(__ref._playlistindex /*int*/ ));};
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="End Sub";
return null;
}
public String  _createrandomdeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createrandomdeviceid", false))
	 {return ((String) Debug.delegate(ba, "createrandomdeviceid", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub CreateRandomDeviceId As String";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"randomUUID";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("randomUUID",(Object[])(__c.Null))));
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Return uuid.RunMethod(\"toString\", Null)";
if (true) return BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="End Sub";
return "";
}
public int  _currentsecondofminute(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentsecondofminute", false))
	 {return ((Integer) Debug.delegate(ba, "currentsecondofminute", null));}
String _previoustimeformat = "";
int _value = 0;
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub CurrentSecondOfMinute As Int";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="DateTime.TimeFormat = \"ss\"";
__c.DateTime.setTimeFormat("ss");
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="Dim value As Int = DateTime.Time(EffectiveNowTick";
_value = (int)(Double.parseDouble(__c.DateTime.Time(__ref._effectivenowticks /*long*/ (null))));
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=17498117;
 //BA.debugLineNum = 17498117;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=17498118;
 //BA.debugLineNum = 17498118;BA.debugLine="End Sub";
return 0;
}
public double  _currentvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentvolume", false))
	 {return ((Double) Debug.delegate(ba, "currentvolume", new Object[] {_item}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub CurrentVolume(item As Map) As Double";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Return ResolveItemVolume(item)";
if (true) return __ref._resolveitemvolume /*double*/ (null,_item);
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return 0;
}
public double  _resolveitemvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveitemvolume", false))
	 {return ((Double) Debug.delegate(ba, "resolveitemvolume", new Object[] {_item}));}
String _itemtype = "";
double _gaindb = 0;
double _basefactor = 0;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub ResolveItemVolume(item As Map) As Doub";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="If item.IsInitialized = False Then Return 0.7";
if (_item.IsInitialized()==__c.False) { 
if (true) return 0.7;};
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Dim gainDb As Double = NormalizeDbValue(item.GetD";
_gaindb = __ref._normalizedbvalue /*double*/ (null,_item.GetDefault((Object)("gain"),(Object)(-3)),-3);
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="Dim baseFactor As Double = 1";
_basefactor = 1;
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="If itemType = \"track\" Then baseFactor = ResolvePl";
if ((_itemtype).equals("track")) { 
_basefactor = __ref._resolveplayerlevelfactor /*double*/ (null);};
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="Return Max(0, Min(1, baseFactor * DbToFactor(gain";
if (true) return __c.Max(0,__c.Min(1,_basefactor*__ref._dbtofactor /*double*/ (null,_gaindb)));
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="End Sub";
return 0;
}
public double  _dbtofactor(b4j.example.b4xmainpage __ref,double _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbtofactor", false))
	 {return ((Double) Debug.delegate(ba, "dbtofactor", new Object[] {_db}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub DbToFactor(db As Double) As Double";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="If db >= 0 Then Return 1";
if (_db>=0) { 
if (true) return 1;};
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Return Power(10, db / 20)";
if (true) return __c.Power(10,_db/(double)20);
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="End Sub";
return 0;
}
public String  _deferfutureexactbreak(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "deferfutureexactbreak", false))
	 {return ((String) Debug.delegate(ba, "deferfutureexactbreak", new Object[] {_item}));}
int _insertindex = 0;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Private Sub DeferFutureExactBreak(item As Map)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim insertIndex As Int = Min(1, playQueue.Size)";
_insertindex = (int) (__c.Min(1,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="playQueue.InsertAt(insertIndex, item)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_insertindex,(Object)(_item.getObject()));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="TraceLog(\"брейк exact defer at=\" & ToLongDefault(";
__ref._tracelog /*String*/ (null,"брейк exact defer at="+BA.NumberToString(__ref._tolongdefault /*long*/ (null,_item.GetDefault((Object)("at"),(Object)(-1)),(long) (-1)))+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="End Sub";
return "";
}
public String  _syncexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "syncexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "syncexactbreakstate", null));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub SyncExactBreakState";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="ResolveScheduledBreakAt";
__ref._resolvescheduledbreakat /*String*/ (null);
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="ScheduleBreakWatch";
__ref._schedulebreakwatch /*String*/ (null);
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="End Sub";
return "";
}
public long  _tolongdefault(b4j.example.b4xmainpage __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Try";
try {RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="Try";
try {RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="End Sub";
return 0L;
}
public String  _deletehistorypendingfile(b4j.example.b4xmainpage __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "deletehistorypendingfile", false))
	 {return ((String) Debug.delegate(ba, "deletehistorypendingfile", new Object[] {_filename}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Private Sub DeleteHistoryPendingFile(fileName As S";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="If fileName = \"\" Then Return";
if ((_filename).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="If File.Exists(GetHistoryDir, fileName) Then File";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),_filename)) { 
__c.File.Delete(__ref._gethistorydir /*String*/ (null),_filename);};
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="End Sub";
return "";
}
public String  _joinlist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=18219016;
 //BA.debugLineNum = 18219016;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Wait For (facade.DispatchPlaybackAdvance(initiato";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "dispatchplaybackadvance"), __ref._facade /*b4j.example.playbackfacade*/ ._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_initiator,_allowload));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="If playlistId = \"\" Then Return False";
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
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Dim playlistUrl As String = offlineStoreService.P";
_playlisturl = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._playlistmetadataurl /*String*/ (null,_playlistid);
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="TraceLog(\"метаданные плейлиста fetch начало id=\"";
__ref._tracelog /*String*/ (null,"метаданные плейлиста fetch начало id="+_playlistid+" url="+_playlisturl);
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="Wait For (FetchJsonWithTimeout(playlistUrl, FETCH";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "downloadofflineplaylistmetadata"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playlisturl,__ref._fetch_timeout_ms /*int*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="TraceLog(\"метаданные плейлиста fetch ошибка id=\"";
__ref._tracelog /*String*/ (null,"метаданные плейлиста fetch ошибка id="+_playlistid+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=17629192;
 //BA.debugLineNum = 17629192;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="TraceLog(\"метаданные плейлиста fetch ошибка id=\"";
__ref._tracelog /*String*/ (null,"метаданные плейлиста fetch ошибка id="+_playlistid+" reason=not_map");
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=17629200;
 //BA.debugLineNum = 17629200;BA.debugLine="Dim playlistData As Map = resultData";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=17629201;
 //BA.debugLineNum = 17629201;BA.debugLine="offlineStoreService.SavePlaylistMetadata(descript";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._saveplaylistmetadata /*String*/ (null,_descriptor,_playlistdata,_cachedplaylistindex);
RDebugUtils.currentLine=17629202;
 //BA.debugLineNum = 17629202;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=17629203;
 //BA.debugLineNum = 17629203;BA.debugLine="End Sub";
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
b4j.example.httpjob _j = null;
String _responsetext = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
String _errormessage = "";
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
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="TraceLog(\"http get начало timeoutMs=\" & timeoutMs";
__ref._tracelog /*String*/ (null,"http get начало timeoutMs="+BA.NumberToString(_timeoutms)+" url="+_url);
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchjsonwithtimeout"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="SaveServerSnapshot(\"GET\", url, True, responseTe";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=7667731;
 //BA.debugLineNum = 7667731;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
RDebugUtils.currentLine=7667732;
 //BA.debugLineNum = 7667732;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
RDebugUtils.currentLine=7667734;
 //BA.debugLineNum = 7667734;BA.debugLine="TraceLog(\"http get итог success=true url=\" & ur";
__ref._tracelog /*String*/ (null,"http get итог success=true url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=7667736;
 //BA.debugLineNum = 7667736;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=7667737;
 //BA.debugLineNum = 7667737;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
RDebugUtils.currentLine=7667738;
 //BA.debugLineNum = 7667738;BA.debugLine="SaveServerSnapshot(\"GET\", url, False, \"\", \"bad_";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"","bad_json");
RDebugUtils.currentLine=7667739;
 //BA.debugLineNum = 7667739;BA.debugLine="TraceLog(\"http get ошибка kind=server url=\" & u";
__ref._tracelog /*String*/ (null,"http get ошибка kind=server url="+_url+" message=bad_json");
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=7667742;
 //BA.debugLineNum = 7667742;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=7667743;
 //BA.debugLineNum = 7667743;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
RDebugUtils.currentLine=7667744;
 //BA.debugLineNum = 7667744;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
_failurekind = __ref._classifyhttpfailure /*String*/ (null,_errormessage);
RDebugUtils.currentLine=7667745;
 //BA.debugLineNum = 7667745;BA.debugLine="result.Put(\"Kind\", failureKind)";
_result.Put((Object)("Kind"),(Object)(_failurekind));
RDebugUtils.currentLine=7667746;
 //BA.debugLineNum = 7667746;BA.debugLine="SaveServerSnapshot(\"GET\", url, False, \"\", errorM";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"",_errormessage);
RDebugUtils.currentLine=7667747;
 //BA.debugLineNum = 7667747;BA.debugLine="LogHttpFailure(url, failureKind)";
__ref._loghttpfailure /*String*/ (null,_url,_failurekind);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=7667749;
 //BA.debugLineNum = 7667749;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7667750;
 //BA.debugLineNum = 7667750;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=7667751;
 //BA.debugLineNum = 7667751;BA.debugLine="End Sub";
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
public long  _effectivetrackremainms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "effectivetrackremainms", false))
	 {return ((Long) Debug.delegate(ba, "effectivetrackremainms", null));}
long _trackremain = 0L;
b4j.example.audioplayer _activeaudio = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub EffectiveTrackRemainMs As Long";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim trackRemain As Long = 0";
_trackremain = (long) (0);
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Dim activeAudio As AudioPlayer = GetAudioByKey(r";
_activeaudio = __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ );
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="If activeAudio.Duration > 0 Then trackRemain = a";
if (_activeaudio._duration /*long*/ (null)>0) { 
_trackremain = (long) (_activeaudio._duration /*long*/ (null)-_activeaudio._position /*long*/ (null));};
 };
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Return queueState.LimitRemainByBreak(trackRemain,";
if (true) return __ref._queuestate /*b4j.example.playbackqueuestate*/ ._limitremainbybreak /*long*/ (null,_trackremain,__ref._localnowtimestamp /*long*/ (null));
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="End Sub";
return 0L;
}
public long  _localnowtimestamp(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localnowtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "localnowtimestamp", null));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub LocalNowTimestamp As Long";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Return Floor(EffectiveNowTicks / 1000) - (Timezon";
if (true) return (long) (__c.Floor(__ref._effectivenowticks /*long*/ (null)/(double)1000)-(__ref._timezoneoffsetminutes /*int*/ (null)*60));
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return 0L;
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
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If isStartupSequenceInProgress Then";
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
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="isAdWarmupDeferredAfterStartup = True";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="If offlineData.IsInitialized = False Then Return";

case 4:
//if
this.state = 9;
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==parent.__c.False) { 
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
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if (true) break;

case 10:
//if
this.state = 15;
if ((__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) == false) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Wait For (mediaCacheService.EnsureAdsCached(offli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensureadcachesyncasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensureadscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 16;
return;
case 16:
//C
this.state = -1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="UpdateMediaConnectivityStateFromCacheSync(downloa";
__ref._updatemediaconnectivitystatefromcachesync /*String*/ (null,_downloaded);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _updatemediaconnectivitystatefromcachesync(b4j.example.b4xmainpage __ref,boolean _downloaded) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatemediaconnectivitystatefromcachesync", false))
	 {return ((String) Debug.delegate(ba, "updatemediaconnectivitystatefromcachesync", new Object[] {_downloaded}));}
String _transition = "";
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub UpdateMediaConnectivityStateFromCacheS";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim transition As String = retryFallbackState.Upd";
_transition = __ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._updatemediapathdegradedfromcachesync /*String*/ (null,_downloaded,__ref._mediacacheservice /*b4j.example.mediacache*/ ._consumerecentmedianetworkfailure /*boolean*/ (null));
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="If transition = \"entered\" Then";
if ((_transition).equals("entered")) { 
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="TraceLog(\"degraded path вход source=cache_sync\")";
__ref._tracelog /*String*/ (null,"degraded path вход source=cache_sync");
 }else 
{RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="Else If transition = \"recovered\" Then";
if ((_transition).equals("recovered")) { 
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="TraceLog(\"degraded path восстановлен source=cach";
__ref._tracelog /*String*/ (null,"degraded path восстановлен source=cache_sync");
 }}
;
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuredataplaybackready(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuredataplaybackready", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuredataplaybackready", null));}
ResumableSub_EnsureDataPlaybackReady rsub = new ResumableSub_EnsureDataPlaybackReady(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureDataPlaybackReady extends BA.ResumableSub {
public ResumableSub_EnsureDataPlaybackReady(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _resolverready = false;

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
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Wait For (queueBuilder.EnsureDataPlaybackReady(of";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensuredataplaybackready"), __ref._queuebuilder /*b4j.example.playbackqueuebuilder*/ ._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If resolverReady = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resolverready==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="TraceLog(\"подготовка data playback ошибка\")";
__ref._tracelog /*String*/ (null,"подготовка data playback ошибка");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Return resolverReady";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resolverready));return;};
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ensuresingleplaylistmetadata(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuresingleplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ensuresingleplaylistmetadata", new Object[] {_descriptor}));}
ResumableSub_EnsureSinglePlaylistMetadata rsub = new ResumableSub_EnsureSinglePlaylistMetadata(this,__ref,_descriptor);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnsureSinglePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_EnsureSinglePlaylistMetadata(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) {
this.parent = parent;
this.__ref = __ref;
this._descriptor = _descriptor;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _descriptor;
anywheresoftware.b4a.objects.collections.Map _cachedplaylistindex = null;
boolean _downloaded = false;

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
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dim cachedPlaylistIndex As Map = offlineStoreServ";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getcachedplaylistindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Wait For (DownloadOfflinePlaylistMetadata(descrip";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensuresingleplaylistmetadata"), __ref._downloadofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descriptor,_cachedplaylistindex));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="If downloaded Then offlineStoreService.SaveCached";
if (true) break;

case 1:
//if
this.state = 6;
if (_downloaded) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._savecachedplaylistindex /*String*/ (null,_cachedplaylistindex);
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="Return downloaded";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloaded));return;};
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _ensureupcomingtrackscachedasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensureupcomingtrackscachedasync", false))
	 {Debug.delegate(ba, "ensureupcomingtrackscachedasync", null); return;}
ResumableSub_EnsureUpcomingTracksCachedAsync rsub = new ResumableSub_EnsureUpcomingTracksCachedAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_EnsureUpcomingTracksCachedAsync extends BA.ResumableSub {
public ResumableSub_EnsureUpcomingTracksCachedAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _queueprepared = false;
anywheresoftware.b4a.objects.collections.List _trackitems = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
boolean _downloaded = false;
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

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
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If dataPolicyState.BeginTrackCacheRefresh = False";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._begintrackcacherefresh /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER And metaState.Curre";
if (true) break;

case 7:
//if
this.state = 14;
if (__ref._use_data_playback_resolver /*boolean*/  && (__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("track") && __ref._canusedataplaybackresolver /*boolean*/ (null)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If playQueue.Size < LOOKAHEAD_QUEUE_TARGET_ITEMS";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<__ref._lookahead_queue_target_items /*int*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Wait For (EnsureDataPlaybackQueue(LOOKAHEAD_QUE";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensureupcomingtrackscachedasync"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._lookahead_queue_target_items /*int*/ ));
this.state = 36;
return;
case 36:
//C
this.state = 13;
_queueprepared = (boolean) result[1];
;
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
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Dim trackItems As List";
_trackitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="trackItems.Initialize";
_trackitems.Initialize();
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="If playQueue.IsInitialized Then";
if (true) break;

case 15:
//if
this.state = 32;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="For Each itemObject As Object In playQueue";
if (true) break;

case 18:
//for
this.state = 31;
group10 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 31;
if (index10 < groupLen10) {
this.state = 20;
_itemobject = group10.Get(index10);}
if (true) break;

case 38:
//C
this.state = 37;
index10++;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="If itemObject Is Map Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_itemobject instanceof java.util.Map) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"track\" Then";
if (true) break;

case 24:
//if
this.state = 29;
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track"))) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
_trackitems.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;
;
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="If trackItems.Size = 0 Then";

case 32:
//if
this.state = 35;
if (_trackitems.getSize()==0) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="dataPolicyState.EndTrackCacheRefresh";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endtrackcacherefresh /*String*/ (null);
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="Wait For (mediaCacheService.EnsureTracksCached(tr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensureupcomingtrackscachedasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensuretrackscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_trackitems,(int) (5)));
this.state = 39;
return;
case 39:
//C
this.state = -1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="UpdateMediaConnectivityStateFromCacheSync(downloa";
__ref._updatemediaconnectivitystatefromcachesync /*String*/ (null,_downloaded);
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="PruneTrackCacheIfNeeded(\"track_warmup\")";
__ref._prunetrackcacheifneeded /*String*/ (null,"track_warmup");
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="dataPolicyState.EndTrackCacheRefresh";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._endtrackcacherefresh /*String*/ (null);
RDebugUtils.currentLine=1179673;
 //BA.debugLineNum = 1179673;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _enterpolicypausestate(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "enterpolicypausestate", false))
	 {return ((String) Debug.delegate(ba, "enterpolicypausestate", new Object[] {_reason,_connectionmode}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub EnterPolicyPauseState(reason As String";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="TraceLog(\"policy pause reason=\" & reason & \" mode";
__ref._tracelog /*String*/ (null,"policy pause reason="+_reason+" mode="+_connectionmode);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="SetPlaybackFlowState(FLOW_PAUSED_POLICY, \"policy_";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_paused_policy /*String*/ ,"policy_pause");
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="dataPolicyState.EnterPolicyPause(connectionMode)";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._enterpolicypause /*String*/ (null,_connectionmode);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="orchestrationState.EnterPolicyPausedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterpolicypausedstate /*String*/ (null);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="ShowMessage(reason)";
__ref._showmessage /*String*/ (null,_reason);
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="End Sub";
return "";
}
public String  _refreshconnectionindicatorstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshconnectionindicatorstate", false))
	 {return ((String) Debug.delegate(ba, "refreshconnectionindicatorstate", null));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub RefreshConnectionIndicatorState";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If dataPolicyState.IsLocalPlaybackMode Then";
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._islocalplaybackmode /*boolean*/ ) { 
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="If retryFallbackState.IsMediaPathDegraded Then";
if (__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._ismediapathdegraded /*boolean*/ ) { 
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="UpdateConnectionIndicator(\"degraded\")";
__ref._updateconnectionindicator /*String*/ (null,"degraded");
 }else {
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="UpdateConnectionIndicator(\"offline\")";
__ref._updateconnectionindicator /*String*/ (null,"offline");
 };
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy Then";
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ) { 
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="UpdateConnectionIndicator(\"server\")";
__ref._updateconnectionindicator /*String*/ (null,"server");
RDebugUtils.currentLine=15597579;
 //BA.debugLineNum = 15597579;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15597581;
 //BA.debugLineNum = 15597581;BA.debugLine="If retryFallbackState.IsMediaPathDegraded Then";
if (__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._ismediapathdegraded /*boolean*/ ) { 
RDebugUtils.currentLine=15597582;
 //BA.debugLineNum = 15597582;BA.debugLine="UpdateConnectionIndicator(\"degraded\")";
__ref._updateconnectionindicator /*String*/ (null,"degraded");
RDebugUtils.currentLine=15597583;
 //BA.debugLineNum = 15597583;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15597585;
 //BA.debugLineNum = 15597585;BA.debugLine="UpdateConnectionIndicator(\"online\")";
__ref._updateconnectionindicator /*String*/ (null,"online");
RDebugUtils.currentLine=15597586;
 //BA.debugLineNum = 15597586;BA.debugLine="End Sub";
return "";
}
public boolean  _exitplaybackdispatch(b4j.example.b4xmainpage __ref,boolean _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "exitplaybackdispatch", false))
	 {return ((Boolean) Debug.delegate(ba, "exitplaybackdispatch", new Object[] {_result}));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub ExitPlaybackDispatch(result As Boolean";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="TraceLog(\"переход dispatch итог initiator=\" & orc";
__ref._tracelog /*String*/ (null,"переход dispatch итог initiator="+__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._activedispatchinitiator /*String*/ +" result="+BA.ObjectToString(_result)+" stage="+__ref._playbackflowstate /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return false;
}
public String  _facade_completestartupsequencecore(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_completestartupsequencecore", false))
	 {return ((String) Debug.delegate(ba, "facade_completestartupsequencecore", null));}
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Public Sub Facade_CompleteStartupSequenceCore";
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="If isStartupSequenceInProgress = False Then Retur";
if (__ref._isstartupsequenceinprogress /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="isStartupSequenceInProgress = False";
__ref._isstartupsequenceinprogress /*boolean*/  = __c.False;
RDebugUtils.currentLine=53215235;
 //BA.debugLineNum = 53215235;BA.debugLine="cacheAuditTimer.Interval = CACHE_AUDIT_START_DELA";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._cache_audit_start_delay_ms /*int*/ ));
RDebugUtils.currentLine=53215236;
 //BA.debugLineNum = 53215236;BA.debugLine="cacheAuditTimer.Enabled = True";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=53215237;
 //BA.debugLineNum = 53215237;BA.debugLine="TraceInfo(\"player\", \"старт завершен\", \"stage=\" &";
__ref._traceinfo /*String*/ (null,"player","старт завершен","stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=53215238;
 //BA.debugLineNum = 53215238;BA.debugLine="RunDeferredPostStartTasksAsync";
__ref._rundeferredpoststarttasksasync /*String*/ (null);
RDebugUtils.currentLine=53215239;
 //BA.debugLineNum = 53215239;BA.debugLine="WriteHealthSnapshot(\"старт\")";
__ref._writehealthsnapshot /*String*/ (null,"старт");
RDebugUtils.currentLine=53215240;
 //BA.debugLineNum = 53215240;BA.debugLine="End Sub";
return "";
}
public String  _rundeferredpoststarttasksasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "rundeferredpoststarttasksasync", false))
	 {return ((String) Debug.delegate(ba, "rundeferredpoststarttasksasync", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub RunDeferredPostStartTasksAsync";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="RunDeferredPostStartTasks";
__ref._rundeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _writehealthsnapshot(b4j.example.b4xmainpage __ref,String _trigger) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "writehealthsnapshot", false))
	 {return ((String) Debug.delegate(ba, "writehealthsnapshot", new Object[] {_trigger}));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Private Sub WriteHealthSnapshot(trigger As String)";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="TraceState(\"health\", \"снимок\", \"stage=\" & playbac";
__ref._tracestate /*String*/ (null,"health","снимок","stage="+__ref._playbackflowstate /*String*/ +" playing="+__ref._isplaybackrunningfortrace /*String*/ (null)+" currentTrackId="+__ref._resolvecurrenttracktracevalue /*String*/ (null)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" trackCache="+BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_track_count",(Object)(0)))+" adCache="+BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_count",(Object)(0)))+" ramFreeMb="+__ref._resolvefreerammbtext /*String*/ (null)+" diskFreeMb="+__ref._resolvefreediskmbtext /*String*/ (null)+" netErrors="+BA.NumberToString(__ref._consecutivenetworkerrors /*int*/ )+" lastDataOkAgoSec="+__ref._secondsagotext /*String*/ (null,__ref._lastdataokat /*long*/ )+" lastHistoryOkAgoSec="+__ref._secondsagotext /*String*/ (null,__ref._lasthistoryokat /*long*/ )+" trigger="+_trigger);
RDebugUtils.currentLine=58982413;
 //BA.debugLineNum = 58982413;BA.debugLine="End Sub";
return "";
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
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
int _retryafter = 0;
boolean _continuequeue = false;
boolean _queueprepared = false;

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
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="If TryEnterPlaybackDispatch(initiator) = False Th";
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
RDebugUtils.currentLine=53608450;
 //BA.debugLineNum = 53608450;BA.debugLine="TraceInfo(\"playback\", \"dispatch переход\", \"initia";
__ref._traceinfo /*String*/ (null,"playback","dispatch переход","initiator="+_initiator+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" prepared="+BA.ObjectToString(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._hasprepared /*boolean*/ (null)));
RDebugUtils.currentLine=53608451;
 //BA.debugLineNum = 53608451;BA.debugLine="Do While playbackFlowState <> FLOW_STOPPING";
if (true) break;

case 7:
//do while
this.state = 41;
while ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ ) == false) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=53608452;
 //BA.debugLineNum = 53608452;BA.debugLine="If CanUsePreparedItemNow Then";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._canuseprepareditemnow /*boolean*/ (null)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=53608453;
 //BA.debugLineNum = 53608453;BA.debugLine="TraceInfo(\"playback\", \"dispatch prepared\", \"ini";
__ref._traceinfo /*String*/ (null,"playback","dispatch prepared","initiator="+_initiator);
RDebugUtils.currentLine=53608454;
 //BA.debugLineNum = 53608454;BA.debugLine="Return ExitPlaybackDispatch(PromotePreparedPlay";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,__ref._promotepreparedplayer /*boolean*/ (null,(int) (0),(int) (0)))));return;};
 if (true) break;
;
RDebugUtils.currentLine=53608456;
 //BA.debugLineNum = 53608456;BA.debugLine="If playQueue.Size > 0 Then";

case 13:
//if
this.state = 40;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 15;
}else {
this.state = 27;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=53608457;
 //BA.debugLineNum = 53608457;BA.debugLine="Dim nextObject As Object = ShiftQueueItem";
_nextobject = __ref._shiftqueueitem /*Object*/ (null);
RDebugUtils.currentLine=53608458;
 //BA.debugLineNum = 53608458;BA.debugLine="If nextObject Is Map Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_nextobject instanceof java.util.Map) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=53608459;
 //BA.debugLineNum = 53608459;BA.debugLine="Dim nextItem As Map = nextObject";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=53608460;
 //BA.debugLineNum = 53608460;BA.debugLine="TraceInfo(\"playback\", \"dispatch next\", \"type=\"";
__ref._traceinfo /*String*/ (null,"playback","dispatch next","type="+BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")))+" id="+BA.ObjectToString(_nextitem.GetDefault((Object)("id"),(Object)(""))));
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=53608462;
 //BA.debugLineNum = 53608462;BA.debugLine="Dim retryAfter As Int = retryFallbackState.Cons";
_retryafter = __ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._consumedispatchretryafter /*int*/ (null);
RDebugUtils.currentLine=53608463;
 //BA.debugLineNum = 53608463;BA.debugLine="Wait For (PlayQueueItem(nextObject, retryAfter)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_dispatchplaybackadvancecore"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_nextobject,_retryafter));
this.state = 42;
return;
case 42:
//C
this.state = 20;
_continuequeue = (boolean) result[1];
;
RDebugUtils.currentLine=53608464;
 //BA.debugLineNum = 53608464;BA.debugLine="If continueQueue = False Then Return ExitPlayba";
if (true) break;

case 20:
//if
this.state = 25;
if (_continuequeue==parent.__c.False) { 
this.state = 22;
;}if (true) break;

case 22:
//C
this.state = 25;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.True)));return;};
if (true) break;

case 25:
//C
this.state = 40;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=53608466;
 //BA.debugLineNum = 53608466;BA.debugLine="If allowLoad = False Then Return ExitPlaybackDi";
if (true) break;

case 28:
//if
this.state = 33;
if (_allowload==parent.__c.False) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.True)));return;};
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=53608467;
 //BA.debugLineNum = 53608467;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_dispatchplaybackadvancecore"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 43;
return;
case 43:
//C
this.state = 34;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=53608468;
 //BA.debugLineNum = 53608468;BA.debugLine="If queuePrepared = False Then Return ExitPlayba";
if (true) break;

case 34:
//if
this.state = 39;
if (_queueprepared==parent.__c.False) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 7;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
RDebugUtils.currentLine=53608471;
 //BA.debugLineNum = 53608471;BA.debugLine="Return ExitPlaybackDispatch(False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._exitplaybackdispatch /*boolean*/ (null,parent.__c.False)));return;};
RDebugUtils.currentLine=53608472;
 //BA.debugLineNum = 53608472;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _tryenterplaybackdispatch(b4j.example.b4xmainpage __ref,String _initiator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tryenterplaybackdispatch", false))
	 {return ((Boolean) Debug.delegate(ba, "tryenterplaybackdispatch", new Object[] {_initiator}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub TryEnterPlaybackDispatch(initiator As";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If orchestrationState.BeginDispatch(initiator) =";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._begindispatch /*boolean*/ (null,_initiator)==__c.False) { 
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="TraceLog(\"переход dispatch skip reason=reentry i";
__ref._tracelog /*String*/ (null,"переход dispatch skip reason=reentry initiator="+_initiator+" active="+__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._activedispatchinitiator /*String*/ +" stage="+__ref._playbackflowstate /*String*/ );
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="TraceLog(\"переход dispatch начало initiator=\" & i";
__ref._tracelog /*String*/ (null,"переход dispatch начало initiator="+_initiator+" prepared="+BA.ObjectToString(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._hasprepared /*boolean*/ (null))+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="End Sub";
return false;
}
public boolean  _promotepreparedplayer(b4j.example.b4xmainpage __ref,int _fadeinms,int _fadeoutms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "promotepreparedplayer", false))
	 {return ((Boolean) Debug.delegate(ba, "promotepreparedplayer", new Object[] {_fadeinms,_fadeoutms}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub PromotePreparedPlayer(fadeInMs As Int,";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return transitionCoordinator.PromotePreparedPlaye";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._promotepreparedplayer /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,_fadeinms,_fadeoutms,__ref._flow_transitioning /*String*/ );
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return false;
}
public Object  _shiftqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shiftqueueitem", false))
	 {return ((Object) Debug.delegate(ba, "shiftqueueitem", null));}
Object _item = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub ShiftQueueItem As Object";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="If playQueue.Size = 0 Then Return Null";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim item As Object = playQueue.Get(0)";
_item = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="playQueue.RemoveAt(0)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="orchestrationState.IsCrossfadeTriggered = False";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="If current Is Map Then";
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
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Dim item As Map = current";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_current));
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="If itemType = \"message\" Then";
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
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="HandleMessageItem(item)";
__ref._handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="If itemType = \"update\" Then";

case 7:
//if
this.state = 10;
if ((_itemtype).equals("update")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"player_reloading")))));
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="If itemType = \"idle\" Then";
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
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"idle")))));
RDebugUtils.currentLine=7995415;
 //BA.debugLineNum = 7995415;BA.debugLine="If retryAfter > 0 Then";
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
RDebugUtils.currentLine=7995416;
 //BA.debugLineNum = 7995416;BA.debugLine="ScheduleRetry(\"server\", retryAfter * 1000)";
__ref._scheduleretry /*String*/ (null,"server",(int) (_retryafter*1000));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="ScheduleRetry(\"server\", PAUSE_RETRY_DELAY)";
__ref._scheduleretry /*String*/ (null,"server",__ref._pause_retry_delay /*int*/ );
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=7995420;
 //BA.debugLineNum = 7995420;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=7995423;
 //BA.debugLineNum = 7995423;BA.debugLine="If itemType = \"break\" Then";

case 20:
//if
this.state = 27;
if ((_itemtype).equals("break")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=7995424;
 //BA.debugLineNum = 7995424;BA.debugLine="If item.GetDefault(\"exactly\", False) = True And";
if (true) break;

case 23:
//if
this.state = 26;
if ((_item.GetDefault((Object)("exactly"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) && __ref._haspendingexactbreak /*boolean*/ (null) && __ref._shouldtriggerbreaknow /*boolean*/ (null)==parent.__c.False) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=7995425;
 //BA.debugLineNum = 7995425;BA.debugLine="DeferFutureExactBreak(item)";
__ref._deferfutureexactbreak /*String*/ (null,_item);
RDebugUtils.currentLine=7995426;
 //BA.debugLineNum = 7995426;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=7995428;
 //BA.debugLineNum = 7995428;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=7995429;
 //BA.debugLineNum = 7995429;BA.debugLine="MergeBreakItems(item)";
__ref._mergebreakitems /*String*/ (null,_item);
RDebugUtils.currentLine=7995430;
 //BA.debugLineNum = 7995430;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=7995433;
 //BA.debugLineNum = 7995433;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";

case 27:
//if
this.state = 30;
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=7995434;
 //BA.debugLineNum = 7995434;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=7995435;
 //BA.debugLineNum = 7995435;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=7995438;
 //BA.debugLineNum = 7995438;BA.debugLine="Dim url As String = MediaUrl(item)";
_url = __ref._mediaurl /*String*/ (null,_item);
RDebugUtils.currentLine=7995439;
 //BA.debugLineNum = 7995439;BA.debugLine="If url = \"\" Then";
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
RDebugUtils.currentLine=7995440;
 //BA.debugLineNum = 7995440;BA.debugLine="TraceWarn(\"cache\", \"нет локального файла\", \"tra";
__ref._tracewarn /*String*/ (null,"cache","нет локального файла","trackId="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=7995441;
 //BA.debugLineNum = 7995441;BA.debugLine="If HasLocalPlaybackFallback Then";
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
RDebugUtils.currentLine=7995442;
 //BA.debugLineNum = 7995442;BA.debugLine="SwitchToLocalPlayback(retryFallbackState.IsMed";
__ref._switchtolocalplayback /*String*/ (null,__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._ismediapathdegraded /*boolean*/ ,"missing_local_media");
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=7995444;
 //BA.debugLineNum = 7995444;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=7995447;
 //BA.debugLineNum = 7995447;BA.debugLine="If item.ContainsKey(\"playlist\") Then playlistInd";

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
RDebugUtils.currentLine=7995448;
 //BA.debugLineNum = 7995448;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, item)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._commitplaylistcursor /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ,_item);
RDebugUtils.currentLine=7995449;
 //BA.debugLineNum = 7995449;BA.debugLine="SaveQueueSnapshotState";
__ref._savequeuesnapshotstate /*String*/ (null);
RDebugUtils.currentLine=7995450;
 //BA.debugLineNum = 7995450;BA.debugLine="orchestrationState.PrefetchDone = False";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7995451;
 //BA.debugLineNum = 7995451;BA.debugLine="Dim fadeInMs As Int = ResolveStartFadeInMs";
_fadeinms = __ref._resolvestartfadeinms /*int*/ (null);
RDebugUtils.currentLine=7995452;
 //BA.debugLineNum = 7995452;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioK";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=7995453;
 //BA.debugLineNum = 7995453;BA.debugLine="If runtimeState.ActiveAudioKey = \"\" Then targetA";
if (true) break;

case 44:
//if
this.state = 49;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("")) { 
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
RDebugUtils.currentLine=7995454;
 //BA.debugLineNum = 7995454;BA.debugLine="Wait For (StartPlaybackWithAudioKey(targetAudioK";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._startplaybackwithaudiokey /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_targetaudiokey,_item,_fadeinms));
this.state = 70;
return;
case 70:
//C
this.state = 50;
_playbackstarted = (boolean) result[1];
;
RDebugUtils.currentLine=7995455;
 //BA.debugLineNum = 7995455;BA.debugLine="If playbackStarted = False Then";
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
RDebugUtils.currentLine=7995456;
 //BA.debugLineNum = 7995456;BA.debugLine="If orchestrationState.IsStoppedByUser = False A";
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
RDebugUtils.currentLine=7995457;
 //BA.debugLineNum = 7995457;BA.debugLine="Wait For (HandleMediaError) Complete (unusedEr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 71;
return;
case 71:
//C
this.state = 56;
_unusederror = (boolean) result[1];
;
RDebugUtils.currentLine=7995458;
 //BA.debugLineNum = 7995458;BA.debugLine="If dataPolicyState.IsLocalPlaybackMode Then";
if (true) break;

case 56:
//if
this.state = 59;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._islocalplaybackmode /*boolean*/ ) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=7995459;
 //BA.debugLineNum = 7995459;BA.debugLine="Return True";
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
RDebugUtils.currentLine=7995462;
 //BA.debugLineNum = 7995462;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=7995464;
 //BA.debugLineNum = 7995464;BA.debugLine="If orchestrationState.IsStarted = False Or orche";

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
RDebugUtils.currentLine=7995465;
 //BA.debugLineNum = 7995465;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=7995467;
 //BA.debugLineNum = 7995467;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=7995468;
 //BA.debugLineNum = 7995468;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 69:
//C
this.state = -1;
;
RDebugUtils.currentLine=7995470;
 //BA.debugLineNum = 7995470;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
boolean _resolverready = false;
boolean _queueprepared = false;
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
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._isplaybackallowedbycurrentdata /*boolean*/ (null)==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReason";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ),"server");
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 4:
//if
this.state = 25;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="retryFallbackState.ClearDispatchRetryAfter";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="If CanUseDataPlaybackResolver = False Then";
if (true) break;

case 7:
//if
this.state = 14;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="Wait For (EnsureDataPlaybackReady) Complete (re";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "populateplaybackqueue"), __ref._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 39;
return;
case 39:
//C
this.state = 10;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=7405584;
 //BA.debugLineNum = 7405584;BA.debugLine="If resolverReady = False Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_resolverready==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="TraceLog(\"очередь запрос ошибка reason=resolve";
__ref._tracelog /*String*/ (null,"очередь запрос ошибка reason=resolver_unavailable");
RDebugUtils.currentLine=7405589;
 //BA.debugLineNum = 7405589;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=7405590;
 //BA.debugLineNum = 7405590;BA.debugLine="Return False";
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
RDebugUtils.currentLine=7405593;
 //BA.debugLineNum = 7405593;BA.debugLine="Wait For (EnsureDataPlaybackQueue(1)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "populateplaybackqueue"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1)));
this.state = 40;
return;
case 40:
//C
this.state = 15;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=7405594;
 //BA.debugLineNum = 7405594;BA.debugLine="If queuePrepared = False Then";
if (true) break;

case 15:
//if
this.state = 24;
if (_queueprepared==parent.__c.False) { 
this.state = 17;
}else {
this.state = 23;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=7405598;
 //BA.debugLineNum = 7405598;BA.debugLine="TraceLog(\"очередь запрос ошибка reason=resolver";
__ref._tracelog /*String*/ (null,"очередь запрос ошибка reason=resolver_queue_empty");
RDebugUtils.currentLine=7405599;
 //BA.debugLineNum = 7405599;BA.debugLine="Dim idleText As String = ResolveIdleUntilMessag";
_idletext = __ref._resolveidleuntilmessage /*String*/ (null);
RDebugUtils.currentLine=7405600;
 //BA.debugLineNum = 7405600;BA.debugLine="If idleText <> \"\" Then";
if (true) break;

case 18:
//if
this.state = 21;
if ((_idletext).equals("") == false) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=7405601;
 //BA.debugLineNum = 7405601;BA.debugLine="HandleTemporaryState(\"server\", idleText)";
__ref._handletemporarystate /*String*/ (null,"server",_idletext);
RDebugUtils.currentLine=7405602;
 //BA.debugLineNum = 7405602;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=7405604;
 //BA.debugLineNum = 7405604;BA.debugLine="HandleTemporaryState(\"offline\", \"Нужен интернет";
__ref._handletemporarystate /*String*/ (null,"offline","Нужен интернет");
RDebugUtils.currentLine=7405605;
 //BA.debugLineNum = 7405605;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=7405607;
 //BA.debugLineNum = 7405607;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=7405611;
 //BA.debugLineNum = 7405611;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=7405614;
 //BA.debugLineNum = 7405614;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "populateplaybackqueue"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 41;
return;
case 41:
//C
this.state = 26;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7405615;
 //BA.debugLineNum = 7405615;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 26:
//if
this.state = 29;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=7405619;
 //BA.debugLineNum = 7405619;BA.debugLine="Wait For (HandleFetchFailure(result)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "populateplaybackqueue"), __ref._handlefetchfailure /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_result));
this.state = 42;
return;
case 42:
//C
this.state = 29;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=7405620;
 //BA.debugLineNum = 7405620;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=7405622;
 //BA.debugLineNum = 7405622;BA.debugLine="If orchestrationState.IsStarted = False Or orches";

case 29:
//if
this.state = 34;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=7405623;
 //BA.debugLineNum = 7405623;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=7405624;
 //BA.debugLineNum = 7405624;BA.debugLine="Dim queue As List = responseAdapter.NormalizeQueu";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._responseadapter /*b4j.example.playbackresponseadapter*/ ._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=7405625;
 //BA.debugLineNum = 7405625;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 35:
//if
this.state = 38;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=7405629;
 //BA.debugLineNum = 7405629;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=7405630;
 //BA.debugLineNum = 7405630;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=7405632;
 //BA.debugLineNum = 7405632;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=7405633;
 //BA.debugLineNum = 7405633;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=7405637;
 //BA.debugLineNum = 7405637;BA.debugLine="Dim retryAfter As Int = responseAdapter.Normalize";
_retryafter = __ref._responseadapter /*b4j.example.playbackresponseadapter*/ ._normalizeretryafter /*int*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=7405638;
 //BA.debugLineNum = 7405638;BA.debugLine="retryFallbackState.SetDispatchRetryAfter(retryAft";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._setdispatchretryafter /*String*/ (null,_retryafter);
RDebugUtils.currentLine=7405639;
 //BA.debugLineNum = 7405639;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7405640;
 //BA.debugLineNum = 7405640;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=53542913;
 //BA.debugLineNum = 53542913;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=53542914;
 //BA.debugLineNum = 53542914;BA.debugLine="If playbackFlowState = FLOW_STOPPING Then Return";
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
RDebugUtils.currentLine=53542915;
 //BA.debugLineNum = 53542915;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queueP";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_loadnextandplaycore"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=53542916;
 //BA.debugLineNum = 53542916;BA.debugLine="If queuePrepared = False Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_queueprepared==parent.__c.False) { 
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
this.state = -1;
;
RDebugUtils.currentLine=53542917;
 //BA.debugLineNum = 53542917;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"load_next_and_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_loadnextandplaycore"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"load_next_and_play:"+__ref._nextstartmode /*String*/ ,parent.__c.False));
this.state = 14;
return;
case 14:
//C
this.state = -1;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=53542918;
 //BA.debugLineNum = 53542918;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
RDebugUtils.currentLine=53542919;
 //BA.debugLineNum = 53542919;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _facade_pauseplaybackcore(b4j.example.b4xmainpage __ref,String _reason,String _connectionmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "facade_pauseplaybackcore", false))
	 {return ((String) Debug.delegate(ba, "facade_pauseplaybackcore", new Object[] {_reason,_connectionmode}));}
String _safereason = "";
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Public Sub Facade_PausePlaybackCore(reason As Stri";
RDebugUtils.currentLine=53673985;
 //BA.debugLineNum = 53673985;BA.debugLine="Dim safeReason As String = reason";
_safereason = _reason;
RDebugUtils.currentLine=53673986;
 //BA.debugLineNum = 53673986;BA.debugLine="If safeReason = \"\" Then safeReason = MessageValue";
if ((_safereason).equals("")) { 
_safereason = __ref._messagevalue /*String*/ (null,"playback_paused");};
RDebugUtils.currentLine=53673987;
 //BA.debugLineNum = 53673987;BA.debugLine="EnterPolicyPauseState(safeReason, connectionMode)";
__ref._enterpolicypausestate /*String*/ (null,_safereason,_connectionmode);
RDebugUtils.currentLine=53673988;
 //BA.debugLineNum = 53673988;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=53411841;
 //BA.debugLineNum = 53411841;BA.debugLine="If CanPrepareNextPlayableNow(True) = False Then R";
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
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="Wait For (transitionCoordinator.PrepareNextPlayab";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_preparenextplayablecore"), __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ,__ref._mediacacheservice /*b4j.example.mediacache*/ ,__ref._playbackflowstate /*String*/ ,__ref._flow_playing /*String*/ ,__ref._flow_idle /*String*/ ,__ref._flow_preparing /*String*/ ));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=53411843;
 //BA.debugLineNum = 53411843;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
RDebugUtils.currentLine=53411844;
 //BA.debugLineNum = 53411844;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="If CanResumePlaybackNow(\"policy_pause\", True) = F";
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
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="If ShouldResumeWithNewStart = False Then";
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
RDebugUtils.currentLine=53280771;
 //BA.debugLineNum = 53280771;BA.debugLine="TraceLog(\"возобновление запрет reason=policy_pau";
__ref._tracelog /*String*/ (null,"возобновление запрет reason=policy_pause state=no_new_start");
RDebugUtils.currentLine=53280772;
 //BA.debugLineNum = 53280772;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=53280774;
 //BA.debugLineNum = 53280774;BA.debugLine="TraceLog(\"возобновление итог mode=auto_restart\")";
__ref._tracelog /*String*/ (null,"возобновление итог mode=auto_restart");
RDebugUtils.currentLine=53280775;
 //BA.debugLineNum = 53280775;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_resumeplaybackafterpolicypausecore"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 11;
return;
case 11:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=53280776;
 //BA.debugLineNum = 53280776;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=53280777;
 //BA.debugLineNum = 53280777;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub ShouldResumeWithNewStart As Boolean";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return orchestrationState.IsStarted And IsUserSto";
if (true) return __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  && __ref._isuserstoppedstate /*boolean*/ (null)==__c.False && __ref._ispolicypausestate /*boolean*/ (null)==__c.False && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ==__c.False;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
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
boolean _seededfromcache = false;
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
RDebugUtils.currentLine=53477377;
 //BA.debugLineNum = 53477377;BA.debugLine="nextStartMode = mode";
__ref._nextstartmode /*String*/  = _mode;
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="SetPlaybackFlowState(FLOW_STARTING, \"start_first_";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_starting /*String*/ ,"start_first_track:"+_mode);
RDebugUtils.currentLine=53477379;
 //BA.debugLineNum = 53477379;BA.debugLine="If mode = \"manual\" And RestoreStoppedReserveQueue";
if (true) break;

case 1:
//if
this.state = 6;
if ((_mode).equals("manual") && __ref._restorestoppedreservequeue /*boolean*/ (null)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=53477381;
 //BA.debugLineNum = 53477381;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=53477383;
 //BA.debugLineNum = 53477383;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=53477384;
 //BA.debugLineNum = 53477384;BA.debugLine="initialStartFadePending = True";
__ref._initialstartfadepending /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=53477385;
 //BA.debugLineNum = 53477385;BA.debugLine="If playQueue.Size = 0 Then";
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
RDebugUtils.currentLine=53477386;
 //BA.debugLineNum = 53477386;BA.debugLine="Wait For (TrySeedFirstTrackFromCache) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_startfirsttrackcore"), __ref._tryseedfirsttrackfromcache /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 10;
_seededfromcache = (boolean) result[1];
;
RDebugUtils.currentLine=53477387;
 //BA.debugLineNum = 53477387;BA.debugLine="If seededFromCache Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_seededfromcache) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=53477388;
 //BA.debugLineNum = 53477388;BA.debugLine="TraceInfo(\"playback\", \"первый трек выбран из кэ";
__ref._traceinfo /*String*/ (null,"playback","первый трек выбран из кэша","queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=53477391;
 //BA.debugLineNum = 53477391;BA.debugLine="If runtimeState.ActiveAudioKey = \"\" And metaState";

case 14:
//if
this.state = 19;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("") && (__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ ).equals("")) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"syncing"));
if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=53477392;
 //BA.debugLineNum = 53477392;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "facade_startfirsttrackcore"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=53477393;
 //BA.debugLineNum = 53477393;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=53477394;
 //BA.debugLineNum = 53477394;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _restorestoppedreservequeue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "restorestoppedreservequeue", false))
	 {return ((Boolean) Debug.delegate(ba, "restorestoppedreservequeue", null));}
String _currentsignature = "";
anywheresoftware.b4a.objects.collections.List _restoredqueue = null;
Object _itemobject = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
int _restoredcount = 0;
Object _restoredobject = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub RestoreStoppedReserveQueue As Boolean";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If queueState.StoppedReserveQueue.IsInitialized =";
if (__ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim currentSignature As String = BuildQueueSignat";
_currentsignature = __ref._buildqueuesignature /*String*/ (null);
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="If currentSignature = \"\" Then Return False";
if ((_currentsignature).equals("")) { 
if (true) return __c.False;};
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="If queueState.CanRestoreStoppedReserve(currentSig";
if (__ref._queuestate /*b4j.example.playbackqueuestate*/ ._canrestorestoppedreserve /*boolean*/ (null,_currentsignature)==__c.False) { 
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="queueState.ClearStoppedReserve";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._clearstoppedreserve /*String*/ (null);
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Dim restoredQueue As List";
_restoredqueue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="restoredQueue.Initialize";
_restoredqueue.Initialize();
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="For Each itemObject As Object In queueState.Stopp";
{
final anywheresoftware.b4a.BA.IterableList group10 = __ref._queuestate /*b4j.example.playbackqueuestate*/ ._stoppedreservequeue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_itemobject = group10.Get(index10);
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="If itemObject Is Map Then";
if (_itemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="If IsValidDataTrackItem(item) = False Then Cont";
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_item)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="If mediaCacheService.IsTrackCached(item.GetDefa";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)(""))))==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="restoredQueue.Add(CloneMap(item))";
_restoredqueue.Add((Object)(__ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item).getObject()));
 };
 }
};
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="queueState.ClearStoppedReserve";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._clearstoppedreserve /*String*/ (null);
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Dim restoredCount As Int = 0";
_restoredcount = (int) (0);
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="For Each restoredObject As Object In restoredQueu";
{
final anywheresoftware.b4a.BA.IterableList group21 = _restoredqueue;
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_restoredobject = group21.Get(index21);
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="playQueue.Add(restoredObject)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Add(_restoredobject);
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="restoredCount = restoredCount + 1";
_restoredcount = (int) (_restoredcount+1);
 }
};
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="If restoredCount = 0 Then Return False";
if (_restoredcount==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=7274523;
 //BA.debugLineNum = 7274523;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tryseedfirsttrackfromcache(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tryseedfirsttrackfromcache", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "tryseedfirsttrackfromcache", null));}
ResumableSub_TrySeedFirstTrackFromCache rsub = new ResumableSub_TrySeedFirstTrackFromCache(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TrySeedFirstTrackFromCache extends BA.ResumableSub {
public ResumableSub_TrySeedFirstTrackFromCache(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _emptyresult = false;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
int _attempt = 0;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
anywheresoftware.b4a.objects.collections.Map _cachedtrack = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;
int step9;
int limit9;

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
RDebugUtils.currentLine=60882945;
 //BA.debugLineNum = 60882945;BA.debugLine="Dim emptyResult As Boolean = False";
_emptyresult = parent.__c.False;
RDebugUtils.currentLine=60882946;
 //BA.debugLineNum = 60882946;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._use_data_playback_resolver /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=60882947;
 //BA.debugLineNum = 60882947;BA.debugLine="If CanUseDataPlaybackResolver = False Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=60882948;
 //BA.debugLineNum = 60882948;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveData";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=60882949;
 //BA.debugLineNum = 60882949;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (true) break;

case 13:
//if
this.state = 18;
if (_currentslot.IsInitialized()==parent.__c.False || _currentslot.getSize()==0) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=60882950;
 //BA.debugLineNum = 60882950;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),parent.__c.Null)));
RDebugUtils.currentLine=60882951;
 //BA.debugLineNum = 60882951;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (true) break;

case 19:
//if
this.state = 24;
if (_playlists.IsInitialized()==parent.__c.False || _playlists.getSize()==0) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyresult));return;};
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=60882952;
 //BA.debugLineNum = 60882952;BA.debugLine="Dim workingCursors As Map = dataResolver.ClonePla";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=60882953;
 //BA.debugLineNum = 60882953;BA.debugLine="For attempt = 0 To playlists.Size - 1";
if (true) break;

case 25:
//for
this.state = 58;
step9 = 1;
limit9 = (int) (_playlists.getSize()-1);
_attempt = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 58;
if ((step9 > 0 && _attempt <= limit9) || (step9 < 0 && _attempt >= limit9)) this.state = 27;
if (true) break;

case 60:
//C
this.state = 59;
_attempt = ((int)(0 + _attempt + step9)) ;
if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=60882954;
 //BA.debugLineNum = 60882954;BA.debugLine="Dim playlistDescriptor As Map = dataResolver.Cho";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._choosenextplaylistdescriptor /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_workingcursors);
RDebugUtils.currentLine=60882955;
 //BA.debugLineNum = 60882955;BA.debugLine="If playlistDescriptor.IsInitialized = False Or p";
if (true) break;

case 28:
//if
this.state = 33;
if (_playlistdescriptor.IsInitialized()==parent.__c.False || _playlistdescriptor.getSize()==0) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 58;
if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=60882956;
 //BA.debugLineNum = 60882956;BA.debugLine="Dim playlistId As String = playlistDescriptor.Ge";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=60882957;
 //BA.debugLineNum = 60882957;BA.debugLine="If playlistId = \"\" Then Continue";
if (true) break;

case 34:
//if
this.state = 39;
if ((_playlistid).equals("")) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
this.state = 60;
if (true) break;;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=60882958;
 //BA.debugLineNum = 60882958;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCache";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=60882959;
 //BA.debugLineNum = 60882959;BA.debugLine="If playlistData.IsInitialized = False Or playlis";
if (true) break;

case 40:
//if
this.state = 45;
if (_playlistdata.IsInitialized()==parent.__c.False || _playlistdata.getSize()==0) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
this.state = 60;
if (true) break;;
if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=60882960;
 //BA.debugLineNum = 60882960;BA.debugLine="Dim cachedTrack As Map = dataResolver.ChooseRand";
_cachedtrack = new anywheresoftware.b4a.objects.collections.Map();
_cachedtrack = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._chooserandomtrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdata,__ref._mediacacheservice /*b4j.example.mediacache*/ ,parent.__c.True);
RDebugUtils.currentLine=60882961;
 //BA.debugLineNum = 60882961;BA.debugLine="If cachedTrack.IsInitialized = False Or cachedTr";
if (true) break;

case 46:
//if
this.state = 51;
if (_cachedtrack.IsInitialized()==parent.__c.False || _cachedtrack.getSize()==0) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
this.state = 60;
if (true) break;;
if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=60882962;
 //BA.debugLineNum = 60882962;BA.debugLine="Dim queueItem As Map = dataResolver.CreateQueueT";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_playlistdescriptor,_cachedtrack,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=60882963;
 //BA.debugLineNum = 60882963;BA.debugLine="If mediaCacheService.IsTrackCached(queueItem.Get";
if (true) break;

case 52:
//if
this.state = 57;
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))))==parent.__c.False) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
this.state = 60;
if (true) break;;
if (true) break;

case 57:
//C
this.state = 60;
;
RDebugUtils.currentLine=60882964;
 //BA.debugLineNum = 60882964;BA.debugLine="playQueue.Add(queueItem)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_queueitem.getObject()));
RDebugUtils.currentLine=60882965;
 //BA.debugLineNum = 60882965;BA.debugLine="dataResolver.SavePreviewPlaylistCursors(storage,";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._savepreviewplaylistcursors /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ,_workingcursors);
RDebugUtils.currentLine=60882966;
 //BA.debugLineNum = 60882966;BA.debugLine="dataResolver.RememberResolvedTrack(queueItem.Get";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=60882967;
 //BA.debugLineNum = 60882967;BA.debugLine="dataResolver.RememberResolvedTrackForPlaylist(qu";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._rememberresolvedtrackforplaylist /*String*/ (null,BA.ObjectToString(_queueitem.GetDefault((Object)("playlist_id"),(Object)(""))),BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=60882968;
 //BA.debugLineNum = 60882968;BA.debugLine="SaveQueueSnapshotState";
__ref._savequeuesnapshotstate /*String*/ (null);
RDebugUtils.currentLine=60882969;
 //BA.debugLineNum = 60882969;BA.debugLine="TraceLog(\"первый старт cache hit playlistId=\" &";
__ref._tracelog /*String*/ (null,"первый старт cache hit playlistId="+_playlistid+" trackId="+BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=60882970;
 //BA.debugLineNum = 60882970;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=60882972;
 //BA.debugLineNum = 60882972;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=60882973;
 //BA.debugLineNum = 60882973;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Wait For (facade.LoadNextAndPlay) Complete (advan";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._facade /*b4j.example.playbackfacade*/ ._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="If CanStopPlaybackNow(True) = False Then Return F";
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
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="SetPlaybackFlowState(FLOW_STOPPING, \"stop_request";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_stopping /*String*/ ,"stop_requested");
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="orchestrationState.EnterInternalStoppingState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterinternalstoppingstate /*String*/ (null);
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="TraceLog(\"stop запрос type=\" & metaState.CurrentM";
__ref._tracelog /*String*/ (null,"stop запрос type="+__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediatype /*String*/ +" activeAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ +" preparedAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=53739525;
 //BA.debugLineNum = 53739525;BA.debugLine="CaptureStoppedReserveQueue";
__ref._capturestoppedreservequeue /*String*/ (null);
RDebugUtils.currentLine=53739526;
 //BA.debugLineNum = 53739526;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=53739527;
 //BA.debugLineNum = 53739527;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=53739528;
 //BA.debugLineNum = 53739528;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=53739529;
 //BA.debugLineNum = 53739529;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=53739530;
 //BA.debugLineNum = 53739530;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=53739531;
 //BA.debugLineNum = 53739531;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=53739532;
 //BA.debugLineNum = 53739532;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=53739533;
 //BA.debugLineNum = 53739533;BA.debugLine="retryFallbackState.ClearDispatchRetryAfter";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=53739534;
 //BA.debugLineNum = 53739534;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then";
if (true) break;

case 7:
//if
this.state = 16;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=53739535;
 //BA.debugLineNum = 53739535;BA.debugLine="If metaState.CurrentMediaType = \"track\" Then";
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
RDebugUtils.currentLine=53739536;
 //BA.debugLineNum = 53739536;BA.debugLine="GetAudioByKey(runtimeState.ActiveAudioKey).Stop";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ )._stop /*String*/ (null,__ref._stop_fade_ms /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=53739538;
 //BA.debugLineNum = 53739538;BA.debugLine="GetAudioByKey(runtimeState.ActiveAudioKey).Stop";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ )._stop /*String*/ (null,(int) (0));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=53739541;
 //BA.debugLineNum = 53739541;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" Then GetAu";

case 16:
//if
this.state = 21;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ ).equals("") == false) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ )._stop /*String*/ (null,(int) (0));
if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=53739542;
 //BA.debugLineNum = 53739542;BA.debugLine="runtimeState.Reset";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=53739543;
 //BA.debugLineNum = 53739543;BA.debugLine="metaState.Reset";
__ref._metastate /*b4j.example.playbackmetastate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=53739544;
 //BA.debugLineNum = 53739544;BA.debugLine="playlistIndex = -1";
__ref._playlistindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=53739545;
 //BA.debugLineNum = 53739545;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=53739546;
 //BA.debugLineNum = 53739546;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=53739547;
 //BA.debugLineNum = 53739547;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=53739548;
 //BA.debugLineNum = 53739548;BA.debugLine="ClearQueueSnapshotState";
__ref._clearqueuesnapshotstate /*String*/ (null);
RDebugUtils.currentLine=53739549;
 //BA.debugLineNum = 53739549;BA.debugLine="mediaCacheService.FlushPendingIndexSaves";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._flushpendingindexsaves /*String*/ (null);
RDebugUtils.currentLine=53739550;
 //BA.debugLineNum = 53739550;BA.debugLine="mediaCacheService.CleanupPlaybackTempFiles";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._cleanupplaybacktempfiles /*String*/ (null);
RDebugUtils.currentLine=53739551;
 //BA.debugLineNum = 53739551;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=53739552;
 //BA.debugLineNum = 53739552;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=53739553;
 //BA.debugLineNum = 53739553;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=53739554;
 //BA.debugLineNum = 53739554;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=53739555;
 //BA.debugLineNum = 53739555;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"stop_complete\")";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"stop_complete");
RDebugUtils.currentLine=53739556;
 //BA.debugLineNum = 53739556;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=53739557;
 //BA.debugLineNum = 53739557;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setplayicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Private Sub SetPlayIcon";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
__ref._setlabelstyle /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="lblPlayIcon.Text = ICON_PLAY";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_play /*String*/ );
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="ApplyMaterialIconFont(lblPlayIcon, playIconBaseSi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playiconbasesize /*float*/ );
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="StopOrbitAnimation";
__ref._stoporbitanimation /*String*/ (null);
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="End Sub";
return "";
}
public String  _saveserversnapshot(b4j.example.b4xmainpage __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Private Sub SaveServerSnapshot(method As String, u";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="appTraceService.SaveServerSnapshot(method, url, s";
__ref._apptraceservice /*b4j.example.traceservice*/ ._saveserversnapshot /*String*/ (null,_method,_url,_success,_body,_errormessage);
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return "";
}
public String  _loghttpfailure(b4j.example.b4xmainpage __ref,String _url,String _kind) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "loghttpfailure", false))
	 {return ((String) Debug.delegate(ba, "loghttpfailure", new Object[] {_url,_kind}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub LogHttpFailure(url As String, kind As";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="consecutiveNetworkErrors = consecutiveNetworkErro";
__ref._consecutivenetworkerrors /*int*/  = (int) (__ref._consecutivenetworkerrors /*int*/ +1);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If url.Contains(\"/data\") Then";
if (_url.contains("/data")) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="TraceWarn(\"network\", \"data timeout\", \"retry=\" &";
__ref._tracewarn /*String*/ (null,"network","data timeout","retry="+BA.NumberToString(__ref._consecutivenetworkerrors /*int*/ )+" lastDataOkAgoSec="+__ref._secondsagotext /*String*/ (null,__ref._lastdataokat /*long*/ ));
 }else 
{RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Else If url.Contains(\"/history\") Then";
if (_url.contains("/history")) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="TraceWarn(\"history\", \"ошибка отправки\", \"kind=\"";
__ref._tracewarn /*String*/ (null,"history","ошибка отправки","kind="+_kind);
 }else 
{RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Else If url.Contains(\"/next\") Then";
if (_url.contains("/next")) { 
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", \"kind=\" &";
__ref._tracewarn /*String*/ (null,"network","ошибка очереди","kind="+_kind);
 }}}
;
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Wait For (FetchJsonWithTimeout(NEXT_BASE_URL & \"?";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchnext"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._next_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createnextparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="nextStartMode = \"\"";
__ref._nextstartmode /*String*/  = "";
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub FilterPlayerCode(value As String) As S";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Dim filtered As String = Regex.Replace(\"[^A-Za-z0";
_filtered = __c.Regex.Replace("[^A-Za-z0-9]",_value,"");
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If filtered.Length > 5 Then filtered = filtered.S";
if (_filtered.length()>5) { 
_filtered = _filtered.substring((int) (0),(int) (5));};
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="Return filtered.ToUpperCase";
if (true) return _filtered.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="If isHistoryFlushInProgress Then Return False";
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
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return F";
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
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Dim pendingHistoryFileName As String = GetOldestP";
_pendinghistoryfilename = __ref._getoldestpendinghistoryfilename /*String*/ (null);
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="If pendingHistoryFileName = \"\" Then Return True";
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
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="isHistoryFlushInProgress = True";
__ref._ishistoryflushinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="Dim batchDate As String = HistoryFileNameToDate(p";
_batchdate = __ref._historyfilenametodate /*String*/ (null,_pendinghistoryfilename);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="Dim payload As String = \"\"";
_payload = "";
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="Try";
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
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="payload = File.ReadString(GetHistoryDir, pending";
_payload = parent.__c.File.ReadString(__ref._gethistorydir /*String*/ (null),_pendinghistoryfilename);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="TraceLog(\"история чтение ошибка file=\" & pending";
__ref._tracelog /*String*/ (null,"история чтение ошибка file="+_pendinghistoryfilename+" message="+parent.__c.LastException(ba).getMessage());
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="payload = NormalizeNdjsonPayload(payload)";
_payload = __ref._normalizendjsonpayload /*String*/ (null,_payload);
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="If payload = \"\" Or batchDate = \"\" Then";
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
RDebugUtils.currentLine=11403279;
 //BA.debugLineNum = 11403279;BA.debugLine="DeleteHistoryPendingFile(pendingHistoryFileName)";
__ref._deletehistorypendingfile /*String*/ (null,_pendinghistoryfilename);
RDebugUtils.currentLine=11403280;
 //BA.debugLineNum = 11403280;BA.debugLine="RefreshPendingHistoryState";
__ref._refreshpendinghistorystate /*String*/ (null);
RDebugUtils.currentLine=11403281;
 //BA.debugLineNum = 11403281;BA.debugLine="isHistoryFlushInProgress = False";
__ref._ishistoryflushinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=11403282;
 //BA.debugLineNum = 11403282;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=11403284;
 //BA.debugLineNum = 11403284;BA.debugLine="Dim recordCount As Int = CountNdjsonRecords(paylo";
_recordcount = __ref._countndjsonrecords /*int*/ (null,_payload);
RDebugUtils.currentLine=11403285;
 //BA.debugLineNum = 11403285;BA.debugLine="Dim queryParams As Map";
_queryparams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11403286;
 //BA.debugLineNum = 11403286;BA.debugLine="queryParams.Initialize";
_queryparams.Initialize();
RDebugUtils.currentLine=11403287;
 //BA.debugLineNum = 11403287;BA.debugLine="queryParams.Put(\"player\", playerCode)";
_queryparams.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=11403288;
 //BA.debugLineNum = 11403288;BA.debugLine="queryParams.Put(\"device\", deviceId)";
_queryparams.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=11403289;
 //BA.debugLineNum = 11403289;BA.debugLine="queryParams.Put(\"date\", batchDate)";
_queryparams.Put((Object)("date"),(Object)(_batchdate));
RDebugUtils.currentLine=11403290;
 //BA.debugLineNum = 11403290;BA.debugLine="Dim requestUrl As String = HISTORY_BASE_URL & \"?\"";
_requesturl = __ref._history_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,_queryparams);
RDebugUtils.currentLine=11403291;
 //BA.debugLineNum = 11403291;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=11403292;
 //BA.debugLineNum = 11403292;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=11403293;
 //BA.debugLineNum = 11403293;BA.debugLine="j.PostString(requestUrl, payload)";
_j._poststring /*String*/ (null,_requesturl,_payload);
RDebugUtils.currentLine=11403294;
 //BA.debugLineNum = 11403294;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (5000));
RDebugUtils.currentLine=11403295;
 //BA.debugLineNum = 11403295;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/plain; charset=utf-8");
RDebugUtils.currentLine=11403296;
 //BA.debugLineNum = 11403296;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "flushhistorybuffer"), (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 29;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=11403297;
 //BA.debugLineNum = 11403297;BA.debugLine="Dim success As Boolean = False";
_success = parent.__c.False;
RDebugUtils.currentLine=11403298;
 //BA.debugLineNum = 11403298;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=11403299;
 //BA.debugLineNum = 11403299;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=11403300;
 //BA.debugLineNum = 11403300;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, True, res";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=11403301;
 //BA.debugLineNum = 11403301;BA.debugLine="success = IsHistoryBatchAccepted(responseText)";
_success = __ref._ishistorybatchaccepted /*boolean*/ (null,_responsetext);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=11403303;
 //BA.debugLineNum = 11403303;BA.debugLine="Dim failureKind As String = ClassifyHttpFailure(";
_failurekind = __ref._classifyhttpfailure /*String*/ (null,_j._errormessage /*String*/ );
RDebugUtils.currentLine=11403304;
 //BA.debugLineNum = 11403304;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, False, \"\"";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.False,"",_j._errormessage /*String*/ );
RDebugUtils.currentLine=11403305;
 //BA.debugLineNum = 11403305;BA.debugLine="LogHttpFailure(requestUrl, failureKind)";
__ref._loghttpfailure /*String*/ (null,_requesturl,_failurekind);
 if (true) break;
;
RDebugUtils.currentLine=11403307;
 //BA.debugLineNum = 11403307;BA.debugLine="If success Then";

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
RDebugUtils.currentLine=11403308;
 //BA.debugLineNum = 11403308;BA.debugLine="lastHistoryOkAt = DateTime.Now";
__ref._lasthistoryokat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=11403309;
 //BA.debugLineNum = 11403309;BA.debugLine="DeleteHistoryPendingFile(pendingHistoryFileName)";
__ref._deletehistorypendingfile /*String*/ (null,_pendinghistoryfilename);
RDebugUtils.currentLine=11403310;
 //BA.debugLineNum = 11403310;BA.debugLine="RefreshPendingHistoryState";
__ref._refreshpendinghistorystate /*String*/ (null);
RDebugUtils.currentLine=11403311;
 //BA.debugLineNum = 11403311;BA.debugLine="TraceInfo(\"history\", \"история отправлена\", \"reco";
__ref._traceinfo /*String*/ (null,"history","история отправлена","records="+BA.NumberToString(_recordcount));
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=11403313;
 //BA.debugLineNum = 11403313;BA.debugLine="TraceWarn(\"history\", \"история не отправлена\", \"r";
__ref._tracewarn /*String*/ (null,"history","история не отправлена","records="+BA.NumberToString(_recordcount));
 if (true) break;

case 39:
//C
this.state = -1;
;
RDebugUtils.currentLine=11403315;
 //BA.debugLineNum = 11403315;BA.debugLine="WriteHealthSnapshot(\"history\")";
__ref._writehealthsnapshot /*String*/ (null,"history");
RDebugUtils.currentLine=11403316;
 //BA.debugLineNum = 11403316;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=11403317;
 //BA.debugLineNum = 11403317;BA.debugLine="isHistoryFlushInProgress = False";
__ref._ishistoryflushinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=11403318;
 //BA.debugLineNum = 11403318;BA.debugLine="Return success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=11403319;
 //BA.debugLineNum = 11403319;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub GetOldestPendingHistoryFileName As Str";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),"")==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="If listedFiles.IsInitialized = False Or listedFil";
if (_listedfiles.IsInitialized()==__c.False || _listedfiles.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Dim historyFiles As List";
_historyfiles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="historyFiles.Initialize";
_historyfiles.Initialize();
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group6 = _listedfiles;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_filename = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="If IsHistoryFileName(fileName) Then historyFiles";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)) { 
_historyfiles.Add((Object)(_filename));};
 }
};
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="If historyFiles.Size = 0 Then Return \"\"";
if (_historyfiles.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="historyFiles.Sort(True)";
_historyfiles.Sort(__c.True);
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="Return historyFiles.Get(0)";
if (true) return BA.ObjectToString(_historyfiles.Get((int) (0)));
RDebugUtils.currentLine=12124172;
 //BA.debugLineNum = 12124172;BA.debugLine="End Sub";
return "";
}
public String  _historyfilenametodate(b4j.example.b4xmainpage __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historyfilenametodate", false))
	 {return ((String) Debug.delegate(ba, "historyfilenametodate", new Object[] {_filename}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub HistoryFileNameToDate(fileName As Stri";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="If IsHistoryFileName(fileName) = False Then Retur";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Return fileName.SubString2(0, fileName.Length - 7";
if (true) return _filename.substring((int) (0),(int) (_filename.length()-7));
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return "";
}
public String  _refreshpendinghistorystate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshpendinghistorystate", false))
	 {return ((String) Debug.delegate(ba, "refreshpendinghistorystate", null));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub RefreshPendingHistoryState";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="storage.Put(\"pending_history_count\", CountAllPend";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"pending_history_count",(Object)(__ref._countallpendinghistoryrecords /*int*/ (null)));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="End Sub";
return "";
}
public boolean  _ishistorybatchaccepted(b4j.example.b4xmainpage __ref,String _responsetext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ishistorybatchaccepted", false))
	 {return ((Boolean) Debug.delegate(ba, "ishistorybatchaccepted", new Object[] {_responsetext}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _response = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub IsHistoryBatchAccepted(responseText As";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Try";
try {RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="Dim response As Map = parser.NextObject";
_response = new anywheresoftware.b4a.objects.collections.Map();
_response = _parser.NextObject();
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Return response.GetDefault(\"ok\", False) = True";
if (true) return (_response.GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="TraceLog(\"история response parse ошибка\")";
__ref._tracelog /*String*/ (null,"история response parse ошибка");
 };
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="End Sub";
return false;
}
public void  _flushhistorybufferasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushhistorybufferasync", false))
	 {Debug.delegate(ba, "flushhistorybufferasync", null); return;}
ResumableSub_FlushHistoryBufferAsync rsub = new ResumableSub_FlushHistoryBufferAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_FlushHistoryBufferAsync extends BA.ResumableSub {
public ResumableSub_FlushHistoryBufferAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Wait For (FlushHistoryBuffer) Complete (unused As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "flushhistorybufferasync"), __ref._flushhistorybuffer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _flushtracebuffer(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushtracebuffer", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "flushtracebuffer", null));}
ResumableSub_FlushTraceBuffer rsub = new ResumableSub_FlushTraceBuffer(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FlushTraceBuffer extends BA.ResumableSub {
public ResumableSub_FlushTraceBuffer(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _tracelines = null;
String _payload = "";
anywheresoftware.b4a.objects.collections.Map _queryparams = null;
String _requesturl = "";
b4j.example.httpjob _j = null;
boolean _success = false;
String _responsetext = "";
int _statuscode = 0;

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
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return F";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._playercode /*String*/ ).equals("") || (__ref._deviceid /*String*/ ).equals("")) { 
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
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="If isTraceUploadInProgress Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._istraceuploadinprogress /*boolean*/ ) { 
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
RDebugUtils.currentLine=57868291;
 //BA.debugLineNum = 57868291;BA.debugLine="If IsTraceUploadEnabled = False Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._istraceuploadenabled /*boolean*/ (null)==parent.__c.False) { 
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
RDebugUtils.currentLine=57868292;
 //BA.debugLineNum = 57868292;BA.debugLine="Dim traceLines As List = appTraceService.BeginPen";
_tracelines = new anywheresoftware.b4a.objects.collections.List();
_tracelines = __ref._apptraceservice /*b4j.example.traceservice*/ ._beginpendingtracebatch /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=57868293;
 //BA.debugLineNum = 57868293;BA.debugLine="If traceLines.IsInitialized = False Or traceLines";
if (true) break;

case 19:
//if
this.state = 24;
if (_tracelines.IsInitialized()==parent.__c.False || _tracelines.getSize()==0) { 
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
RDebugUtils.currentLine=57868294;
 //BA.debugLineNum = 57868294;BA.debugLine="Dim payload As String = JoinList(traceLines, CRLF";
_payload = __ref._joinlist /*String*/ (null,_tracelines,parent.__c.CRLF);
RDebugUtils.currentLine=57868295;
 //BA.debugLineNum = 57868295;BA.debugLine="If payload.Trim = \"\" Then";
if (true) break;

case 25:
//if
this.state = 28;
if ((_payload.trim()).equals("")) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=57868296;
 //BA.debugLineNum = 57868296;BA.debugLine="appTraceService.CancelPendingTraceBatch";
__ref._apptraceservice /*b4j.example.traceservice*/ ._cancelpendingtracebatch /*String*/ (null);
RDebugUtils.currentLine=57868297;
 //BA.debugLineNum = 57868297;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=57868299;
 //BA.debugLineNum = 57868299;BA.debugLine="isTraceUploadInProgress = True";
__ref._istraceuploadinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=57868300;
 //BA.debugLineNum = 57868300;BA.debugLine="Dim queryParams As Map";
_queryparams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57868301;
 //BA.debugLineNum = 57868301;BA.debugLine="queryParams.Initialize";
_queryparams.Initialize();
RDebugUtils.currentLine=57868302;
 //BA.debugLineNum = 57868302;BA.debugLine="queryParams.Put(\"player\", playerCode)";
_queryparams.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=57868303;
 //BA.debugLineNum = 57868303;BA.debugLine="queryParams.Put(\"device\", deviceId)";
_queryparams.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=57868304;
 //BA.debugLineNum = 57868304;BA.debugLine="queryParams.Put(\"tz\", TimezoneOffsetMinutes)";
_queryparams.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=57868305;
 //BA.debugLineNum = 57868305;BA.debugLine="queryParams.Put(\"version\", ResolveAppVersion)";
_queryparams.Put((Object)("version"),(Object)(__ref._resolveappversion /*String*/ (null)));
RDebugUtils.currentLine=57868306;
 //BA.debugLineNum = 57868306;BA.debugLine="Dim requestUrl As String = TRACE_BASE_URL & \"?\" &";
_requesturl = __ref._trace_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,_queryparams);
RDebugUtils.currentLine=57868307;
 //BA.debugLineNum = 57868307;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=57868308;
 //BA.debugLineNum = 57868308;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=57868309;
 //BA.debugLineNum = 57868309;BA.debugLine="j.PostString(requestUrl, payload)";
_j._poststring /*String*/ (null,_requesturl,_payload);
RDebugUtils.currentLine=57868310;
 //BA.debugLineNum = 57868310;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (5000));
RDebugUtils.currentLine=57868311;
 //BA.debugLineNum = 57868311;BA.debugLine="j.GetRequest.SetContentType(\"text/plain; charset=";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("text/plain; charset=utf-8");
RDebugUtils.currentLine=57868312;
 //BA.debugLineNum = 57868312;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "flushtracebuffer"), (Object)(_j));
this.state = 57;
return;
case 57:
//C
this.state = 29;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=57868313;
 //BA.debugLineNum = 57868313;BA.debugLine="Dim success As Boolean = False";
_success = parent.__c.False;
RDebugUtils.currentLine=57868314;
 //BA.debugLineNum = 57868314;BA.debugLine="If j.Success Then";
if (true) break;

case 29:
//if
this.state = 51;
if (_j._success /*boolean*/ ) { 
this.state = 31;
}else {
this.state = 39;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=57868315;
 //BA.debugLineNum = 57868315;BA.debugLine="Dim responseText As String = \"\"";
_responsetext = "";
RDebugUtils.currentLine=57868316;
 //BA.debugLineNum = 57868316;BA.debugLine="Try";
if (true) break;

case 32:
//try
this.state = 37;
this.catchState = 36;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 37;
this.catchState = 36;
RDebugUtils.currentLine=57868317;
 //BA.debugLineNum = 57868317;BA.debugLine="responseText = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
RDebugUtils.currentLine=57868319;
 //BA.debugLineNum = 57868319;BA.debugLine="responseText = \"\"";
_responsetext = "";
 if (true) break;
if (true) break;

case 37:
//C
this.state = 51;
this.catchState = 0;
;
RDebugUtils.currentLine=57868321;
 //BA.debugLineNum = 57868321;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, True, res";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=57868322;
 //BA.debugLineNum = 57868322;BA.debugLine="success = True";
_success = parent.__c.True;
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=57868324;
 //BA.debugLineNum = 57868324;BA.debugLine="Dim statusCode As Int = 0";
_statuscode = (int) (0);
RDebugUtils.currentLine=57868325;
 //BA.debugLineNum = 57868325;BA.debugLine="Try";
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
RDebugUtils.currentLine=57868326;
 //BA.debugLineNum = 57868326;BA.debugLine="statusCode = j.Response.StatusCode";
_statuscode = _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode();
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=57868328;
 //BA.debugLineNum = 57868328;BA.debugLine="statusCode = 0";
_statuscode = (int) (0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=57868330;
 //BA.debugLineNum = 57868330;BA.debugLine="If statusCode = 204 Then";

case 45:
//if
this.state = 50;
this.catchState = 0;
if (_statuscode==204) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=57868331;
 //BA.debugLineNum = 57868331;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, True, \"\"";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.True,"","");
RDebugUtils.currentLine=57868332;
 //BA.debugLineNum = 57868332;BA.debugLine="success = True";
_success = parent.__c.True;
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=57868334;
 //BA.debugLineNum = 57868334;BA.debugLine="SaveServerSnapshot(\"POST\", requestUrl, False, \"";
__ref._saveserversnapshot /*String*/ (null,"POST",_requesturl,parent.__c.False,"",_j._errormessage /*String*/ );
RDebugUtils.currentLine=57868335;
 //BA.debugLineNum = 57868335;BA.debugLine="LogHttpFailure(requestUrl, ClassifyHttpFailure(";
__ref._loghttpfailure /*String*/ (null,_requesturl,__ref._classifyhttpfailure /*String*/ (null,_j._errormessage /*String*/ ));
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
RDebugUtils.currentLine=57868338;
 //BA.debugLineNum = 57868338;BA.debugLine="If success Then";

case 51:
//if
this.state = 56;
if (_success) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
RDebugUtils.currentLine=57868339;
 //BA.debugLineNum = 57868339;BA.debugLine="appTraceService.ConfirmPendingTraceBatchSent";
__ref._apptraceservice /*b4j.example.traceservice*/ ._confirmpendingtracebatchsent /*String*/ (null);
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=57868341;
 //BA.debugLineNum = 57868341;BA.debugLine="appTraceService.CancelPendingTraceBatch";
__ref._apptraceservice /*b4j.example.traceservice*/ ._cancelpendingtracebatch /*String*/ (null);
 if (true) break;

case 56:
//C
this.state = -1;
;
RDebugUtils.currentLine=57868343;
 //BA.debugLineNum = 57868343;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=57868344;
 //BA.debugLineNum = 57868344;BA.debugLine="isTraceUploadInProgress = False";
__ref._istraceuploadinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=57868345;
 //BA.debugLineNum = 57868345;BA.debugLine="Return success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=57868346;
 //BA.debugLineNum = 57868346;BA.debugLine="End Sub";
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
public boolean  _istraceuploadenabled(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "istraceuploadenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "istraceuploadenabled", null));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Private Sub IsTraceUploadEnabled As Boolean";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57802755;
 //BA.debugLineNum = 57802755;BA.debugLine="If offlineData.ContainsKey(\"trace\") Then";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("trace"))) { 
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="Return offlineData.GetDefault(\"trace\", False) =";
if (true) return (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
 };
RDebugUtils.currentLine=57802758;
 //BA.debugLineNum = 57802758;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"p";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("player"),__c.Null)));
RDebugUtils.currentLine=57802759;
 //BA.debugLineNum = 57802759;BA.debugLine="If playerData.IsInitialized = False Then Return F";
if (_playerdata.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=57802760;
 //BA.debugLineNum = 57802760;BA.debugLine="Return playerData.ContainsKey(\"trace\") And player";
if (true) return _playerdata.ContainsKey((Object)("trace")) && (_playerdata.GetDefault((Object)("trace"),(Object)(__c.False))).equals((Object)(__c.True));
RDebugUtils.currentLine=57802761;
 //BA.debugLineNum = 57802761;BA.debugLine="End Sub";
return false;
}
public void  _flushtracebufferasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "flushtracebufferasync", false))
	 {Debug.delegate(ba, "flushtracebufferasync", null); return;}
ResumableSub_FlushTraceBufferAsync rsub = new ResumableSub_FlushTraceBufferAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_FlushTraceBufferAsync extends BA.ResumableSub {
public ResumableSub_FlushTraceBufferAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="Wait For (FlushTraceBuffer) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "flushtracebufferasync"), __ref._flushtracebuffer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _formathistorydate(b4j.example.b4xmainpage __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formathistorydate", false))
	 {return ((String) Debug.delegate(ba, "formathistorydate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub FormatHistoryDate(ticks As Long) As St";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="End Sub";
return "";
}
public String  _formathistorytime(b4j.example.b4xmainpage __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formathistorytime", false))
	 {return ((String) Debug.delegate(ba, "formathistorytime", new Object[] {_ticks}));}
String _previoustimeformat = "";
String _value = "";
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub FormatHistoryTime(ticks As Long) As St";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Dim value As String = DateTime.Time(ticks)";
_value = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub FormatTimestampForTrace(targetTimestam";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = __ref._localtimestamptoticks /*long*/ (null,_targettimestamp);
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Dim value As String = DateTime.Date(targetTicks)";
_value = __c.DateTime.Date(_targetticks)+" "+__c.DateTime.Time(_targetticks);
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="End Sub";
return "";
}
public long  _localtimestamptoticks(b4j.example.b4xmainpage __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localtimestamptoticks", false))
	 {return ((Long) Debug.delegate(ba, "localtimestamptoticks", new Object[] {_targettimestamp}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(__ref._timezoneoffsetminutes /*int*/ (null)*60))*1000);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return 0L;
}
public String  _getinactiveaudiokey(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getinactiveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "getinactiveaudiokey", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub GetInactiveAudioKey As String";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return transitionCoordinator.GetInactiveAudioKey(";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._getinactiveaudiokey /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ );
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public String  _getorcreatedeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getorcreatedeviceid", false))
	 {return ((String) Debug.delegate(ba, "getorcreatedeviceid", null));}
String _id = "";
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub GetOrCreateDeviceId As String";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim id As String = storage.GetDefault(\"device_id\"";
_id = BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"device_id",(Object)("")));
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="If id <> \"\" Then Return id";
if ((_id).equals("") == false) { 
if (true) return _id;};
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="id = CreateRandomDeviceId";
_id = __ref._createrandomdeviceid /*String*/ (null);
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="SaveValue(\"device_id\", id)";
__ref._savevalue /*String*/ (null,"device_id",(Object)(_id));
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="End Sub";
return "";
}
public String  _savevalue(b4j.example.b4xmainpage __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savevalue", false))
	 {return ((String) Debug.delegate(ba, "savevalue", new Object[] {_key,_value}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Private Sub SaveValue(key As String, value As Obje";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="storage.Put(key, value)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_key,_value);
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return "";
}
public int  _getpendinghistoryfilecount(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getpendinghistoryfilecount", false))
	 {return ((Integer) Debug.delegate(ba, "getpendinghistoryfilecount", null));}
anywheresoftware.b4a.objects.collections.List _listedfiles = null;
int _count = 0;
String _filename = "";
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub GetPendingHistoryFileCount As Int";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="If File.Exists(GetHistoryDir, \"\") = False Then Re";
if (__c.File.Exists(__ref._gethistorydir /*String*/ (null),"")==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Dim listedFiles As List = File.ListFiles(GetHisto";
_listedfiles = new anywheresoftware.b4a.objects.collections.List();
_listedfiles = __c.File.ListFiles(__ref._gethistorydir /*String*/ (null));
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="If listedFiles.IsInitialized = False Then Return";
if (_listedfiles.IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="For Each fileName As String In listedFiles";
{
final anywheresoftware.b4a.BA.IterableList group5 = _listedfiles;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_filename = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="If IsHistoryFileName(fileName) Then count = coun";
if (__ref._ishistoryfilename /*boolean*/ (null,_filename)) { 
_count = (int) (_count+1);};
 }
};
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _getqueuebuilderofflinedata(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getqueuebuilderofflinedata", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getqueuebuilderofflinedata", null));}
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Public Sub GetQueueBuilderOfflineData As Map";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="Return offlineData";
if (true) return __ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getservertracelist", null));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Return appTraceService.GetServerTraceList";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._getservertracelist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Return appTraceService.GetServerTraceText";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._getservertracetext /*String*/ (null);
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettraceloglist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettraceloglist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettraceloglist", null));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub GetTraceLogList As List";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Return appTraceService.GetTraceList";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._gettracelist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="End Sub";
return null;
}
public String  _gettracelogtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettracelogtext", false))
	 {return ((String) Debug.delegate(ba, "gettracelogtext", null));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub GetTraceLogText As String";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Return appTraceService.GetTraceText";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._gettracetext /*String*/ (null);
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="If CanAdvancePlaybackNow(\"audio_complete:\" & audi";
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
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="If audioKey <> runtimeState.ActiveAudioKey Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_audiokey).equals(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="TraceWarn(\"playback\", \"audio complete пропущен\",";
__ref._tracewarn /*String*/ (null,"playback","audio complete пропущен","reason=inactive_audio audio="+_audiokey+" active="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ );
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="SetPlaybackFlowState(FLOW_TRANSITIONING, \"audio_c";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_transitioning /*String*/ ,"audio_complete:"+_audiokey);
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="If runtimeState.ActiveItem.IsInitialized Then";
if (true) break;

case 11:
//if
this.state = 14;
if (__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="TraceInfo(\"audio\", \"плеер complete\", \"player=\" &";
__ref._traceinfo /*String*/ (null,"audio","плеер complete","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ )+" id="+__ref._tracetrackvalue /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="TraceInfo(\"playback\", \"смена трека\", \"trackId=\"";
__ref._traceinfo /*String*/ (null,"playback","смена трека","trackId="+__ref._tracetrackvalue /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ ));
 if (true) break;
;
RDebugUtils.currentLine=13500427;
 //BA.debugLineNum = 13500427;BA.debugLine="If runtimeState.ActiveItem.GetDefault(\"type\", \"\")";

case 14:
//if
this.state = 17;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="QueueHistoryRecordAt(runtimeState.ActiveItem, me";
__ref._queuehistoryrecordat /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._metastate /*b4j.example.playbackmetastate*/ ._historystartedatticks /*long*/ );
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"audio_complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiocomplete"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_complete:"+_audiokey,parent.__c.True));
this.state = 18;
return;
case 18:
//C
this.state = -1;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="Return dispatched";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_dispatched));return;};
RDebugUtils.currentLine=13500433;
 //BA.debugLineNum = 13500433;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim errorItem As Map = runtimeState.ActiveItem";
_erroritem = new anywheresoftware.b4a.objects.collections.Map();
_erroritem = __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="If runtimeState.PendingPlayAudioKey = audioKey Th";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_erroritem = __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="If runtimeState.PendingPrepareAudioKey = audioKey";
if (true) break;

case 7:
//if
this.state = 12;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_erroritem = __ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ ;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="TraceError(\"audio\", \"плеер error\", \"player=\" & Tr";
__ref._traceerror /*String*/ (null,"audio","плеер error","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_erroritem)+" id="+__ref._tracetrackvalue /*String*/ (null,_erroritem)+" message="+_message);
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="WriteHealthSnapshot(\"ошибка_audio\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_audio");
RDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="SetPlaybackFlowState(FLOW_ERROR, \"audio_error:\" &";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_error /*String*/ ,"audio_error:"+_audiokey);
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="If runtimeState.PendingPlayAudioKey = audioKey Th";
if (true) break;

case 13:
//if
this.state = 16;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="If runtimeState.PendingPrepareAudioKey = audioKey";

case 16:
//if
this.state = 19;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="If audioKey <> runtimeState.ActiveAudioKey Then R";

case 19:
//if
this.state = 24;
if ((_audiokey).equals(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ) == false) { 
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
RDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="If CanAdvancePlaybackNow(\"audio_error:\" & audioKe";
if (true) break;

case 25:
//if
this.state = 30;
if (__ref._canadvanceplaybacknow /*boolean*/ (null,"audio_error:"+_audiokey,parent.__c.True)==parent.__c.False) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=13434897;
 //BA.debugLineNum = 13434897;BA.debugLine="Wait For (HandleMediaError) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerror"), __ref._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 31;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=13434898;
 //BA.debugLineNum = 13434898;BA.debugLine="If dataPolicyState.IsLocalPlaybackMode And orches";
if (true) break;

case 31:
//if
this.state = 34;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._islocalplaybackmode /*boolean*/  && __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=13434899;
 //BA.debugLineNum = 13434899;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"audio_error_r";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerror"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"audio_error_recovery:"+_audiokey,parent.__c.True));
this.state = 36;
return;
case 36:
//C
this.state = 34;
_unusedrecovery = (boolean) result[1];
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=13434901;
 //BA.debugLineNum = 13434901;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=13434902;
 //BA.debugLineNum = 13434902;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Private Sub TraceError(category As String, message";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="WriteTraceEntry(\"ERROR\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"ERROR",_category,_message,_details);
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9043969;BA.debugLine="SetPlaybackFlowState(FLOW_ERROR, \"media_error\")";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_error /*String*/ ,"media_error");
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="If HasLocalPlaybackFallback Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="TraceLog(\"fallback выбор mode=local reason=media";
__ref._tracelog /*String*/ (null,"fallback выбор mode=local reason=media_error");
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="SwitchToLocalPlayback(True, \"media_failure\")";
__ref._switchtolocalplayback /*String*/ (null,parent.__c.True,"media_failure");
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="HandleLocalTemporaryState(\"Нужен интернет\")";
__ref._handlelocaltemporarystate /*String*/ (null,"Нужен интернет");
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="End Sub";
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
boolean _unused = false;
long _remain = 0L;
boolean _unused2 = false;

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
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="If audioKey <> runtimeState.ActiveAudioKey Then R";
if (true) break;

case 1:
//if
this.state = 6;
if ((_audiokey).equals(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ) == false) { 
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
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
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
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="If metaState.PendingHistoryItem.IsInitialized The";
if (true) break;

case 13:
//if
this.state = 20;
if (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="If metaState.PendingHistoryItem.GetDefault(\"type";
if (true) break;

case 16:
//if
this.state = 19;
if ((__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) && (__ref._metastate /*b4j.example.playbackmetastate*/ ._currentmediaurl /*String*/ ).equals("") == false && (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))).equals(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("id"),(Object)(""))) && (__ref._metastate /*b4j.example.playbackmetastate*/ ._pendinghistoryitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)("")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="ConfirmPendingHistoryItem(\"timeupdate\")";
__ref._confirmpendinghistoryitem /*boolean*/ (null,"timeupdate");
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="If ShouldTriggerBreakNow Then";

case 20:
//if
this.state = 23;
if (__ref._shouldtriggerbreaknow /*boolean*/ (null)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="TraceInfo(\"playback\", \"вставлен break\", \"mode=ex";
__ref._traceinfo /*String*/ (null,"playback","вставлен break","mode=exact");
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 46;
return;
case 46:
//C
this.state = 23;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="Dim remain As Long = EffectiveTrackRemainMs";
_remain = __ref._effectivetrackremainms /*long*/ (null);
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="If CanCrossfadePreparedItem And remain > 0 And re";
if (true) break;

case 24:
//if
this.state = 27;
if (__ref._cancrossfadeprepareditem /*boolean*/ (null) && _remain>0 && _remain<=__ref._track_overlap_ms /*int*/ ) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="orchestrationState.IsCrossfadeTriggered = True";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepared";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=13565969;
 //BA.debugLineNum = 13565969;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=13565971;
 //BA.debugLineNum = 13565971;BA.debugLine="If CanStartPreparedOnTrackTail And remain > 0 And";

case 27:
//if
this.state = 30;
if (__ref._canstartpreparedontracktail /*boolean*/ (null) && _remain>0 && _remain<=__ref._ad_tail_overlap_ms /*int*/ ) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=13565972;
 //BA.debugLineNum = 13565972;BA.debugLine="orchestrationState.IsCrossfadeTriggered = True";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=13565973;
 //BA.debugLineNum = 13565973;BA.debugLine="TraceInfo(\"playback\", \"вставлена реклама\", \"queu";
__ref._traceinfo /*String*/ (null,"playback","вставлена реклама","queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=13565974;
 //BA.debugLineNum = 13565974;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepared";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=13565975;
 //BA.debugLineNum = 13565975;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=13565977;
 //BA.debugLineNum = 13565977;BA.debugLine="If remain <= 0 Then Return False";

case 30:
//if
this.state = 35;
if (_remain<=0) { 
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
RDebugUtils.currentLine=13565978;
 //BA.debugLineNum = 13565978;BA.debugLine="If remain <= PREFETCH_SECONDS * 1000 Then";
if (true) break;

case 36:
//if
this.state = 45;
if (_remain<=__ref._prefetch_seconds /*int*/ *1000) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=13565979;
 //BA.debugLineNum = 13565979;BA.debugLine="If CanPrefetchNextNow(False) = False Then Return";
if (true) break;

case 39:
//if
this.state = 44;
if (__ref._canprefetchnextnow /*boolean*/ (null,parent.__c.False)==parent.__c.False) { 
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
this.state = 45;
;
RDebugUtils.currentLine=13565980;
 //BA.debugLineNum = 13565980;BA.debugLine="orchestrationState.PrefetchDone = True";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._prefetchdone /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=13565981;
 //BA.debugLineNum = 13565981;BA.debugLine="Wait For (PrefetchNext) Complete (unused2 As Boo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref._prefetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 47;
return;
case 47:
//C
this.state = 45;
_unused2 = (boolean) result[1];
;
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=13565983;
 //BA.debugLineNum = 13565983;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=13565984;
 //BA.debugLineNum = 13565984;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _isplaybackflowactive(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackflowactive", false))
	 {return ((Boolean) Debug.delegate(ba, "isplaybackflowactive", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub IsPlaybackFlowActive As Boolean";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Return playbackFlowState = FLOW_PLAYING Or playba";
if (true) return (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_playing /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_preparing /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_transitioning /*String*/ ) || (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_starting /*String*/ );
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return false;
}
public int  _preparedfadeinms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeinms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeinms", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub PreparedFadeInMs As Int";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return 0;
}
public int  _preparedfadeoutms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub PreparedFadeOutMs As Int";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Return transitionCoordinator.PreparedFadeOutMs(me";
if (true) return __ref._transitioncoordinator /*b4j.example.playbacktransitioncoordinator*/ ._preparedfadeoutms /*int*/ (null,__ref._metastate /*b4j.example.playbackmetastate*/ ,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ,__ref._track_overlap_ms /*int*/ ,__ref._ad_tail_overlap_ms /*int*/ );
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
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
boolean _resolverready = false;
boolean _queueprepared = false;
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
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="If CanPrefetchNextNow(False) = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canprefetchnextnow /*boolean*/ (null,parent.__c.False)==parent.__c.False) { 
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
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="If playQueue.Size > 0 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepare";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 45;
return;
case 45:
//C
this.state = 10;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;
;
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 10:
//if
this.state = 27;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="If CanUseDataPlaybackResolver = False Then";
if (true) break;

case 13:
//if
this.state = 22;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="Wait For (EnsureDataPlaybackReady) Complete (re";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 46;
return;
case 46:
//C
this.state = 16;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="If resolverReady = False Then Return False";
if (true) break;

case 16:
//if
this.state = 21;
if (_resolverready==parent.__c.False) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Wait For (EnsureDataPlaybackQueue(1)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1)));
this.state = 47;
return;
case 47:
//C
this.state = 23;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="If queuePrepared And playQueue.Size > 0 Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_queueprepared && __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepar";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 48;
return;
case 48:
//C
this.state = 26;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="If HasPendingExactBreak Then Return False";

case 27:
//if
this.state = 32;
if (__ref._haspendingexactbreak /*boolean*/ (null)) { 
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
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 49;
return;
case 49:
//C
this.state = 33;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7536660;
 //BA.debugLineNum = 7536660;BA.debugLine="If result.GetDefault(\"Success\", False) = False Or";
if (true) break;

case 33:
//if
this.state = 38;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False)) || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="Dim queue As List = responseAdapter.NormalizeQueu";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._responseadapter /*b4j.example.playbackresponseadapter*/ ._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=7536662;
 //BA.debugLineNum = 7536662;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
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
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=7536664;
 //BA.debugLineNum = 7536664;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepared";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 50;
return;
case 50:
//C
this.state = -1;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=7536666;
 //BA.debugLineNum = 7536666;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
RDebugUtils.currentLine=7536667;
 //BA.debugLineNum = 7536667;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub HandleBlockedState";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="TraceLog(\"состояние blocked\")";
__ref._tracelog /*String*/ (null,"состояние blocked");
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="EnterPolicyPauseState(MessageValue(\"blocked\"), \"b";
__ref._enterpolicypausestate /*String*/ (null,__ref._messagevalue /*String*/ (null,"blocked"),"blocked");
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="ScheduleRetry(\"blocked\", 0)";
__ref._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub ScheduleRetry(mode As String, delayMs";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="retryTimer.Interval = ResolveRetryDelay(mode, del";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._resolveretrydelay /*int*/ (null,_mode,_delayms)));
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy And m";
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/  && (_mode).equals("blocked") == false) { 
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="TraceWarn(\"network\", \"переход в retry\", \"mode=\" &";
__ref._tracewarn /*String*/ (null,"network","переход в retry","mode="+_mode+" delaySec="+BA.NumberToString(__c.Floor(__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()/(double)1000)));
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="WriteHealthSnapshot(\"retry\")";
__ref._writehealthsnapshot /*String*/ (null,"retry");
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="retryTimer.Enabled = True";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="End Sub";
return "";
}
public boolean  _handlediagnostictracemessage(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlediagnostictracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "handlediagnostictracemessage", new Object[] {_message}));}
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Private Sub HandleDiagnosticTraceMessage(message A";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="If message = \"\" Then Return True";
if ((_message).equals("")) { 
if (true) return __c.True;};
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="If ShouldSuppressTraceMessage(message) Then Retur";
if (__ref._shouldsuppresstracemessage /*boolean*/ (null,_message)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="If message.StartsWith(\"Трек сохранен в кэш.\") The";
if (_message.startsWith("Трек сохранен в кэш.")) { 
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="TraceInfo(\"cache\", \"трек загружен в кэш\", Normal";
__ref._traceinfo /*String*/ (null,"cache","трек загружен в кэш",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Трек сохранен в кэш.")));
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="If message.StartsWith(\"Не удалось скачать трек.\")";
if (_message.startsWith("Не удалось скачать трек.") || _message.startsWith("Не удалось сохранить трек в кэш.")) { 
RDebugUtils.currentLine=58589192;
 //BA.debugLineNum = 58589192;BA.debugLine="TraceError(\"cache\", \"ошибка загрузки трека\", Nor";
__ref._traceerror /*String*/ (null,"cache","ошибка загрузки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=58589193;
 //BA.debugLineNum = 58589193;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589195;
 //BA.debugLineNum = 58589195;BA.debugLine="If message.StartsWith(\"Синхронизация кэша треков";
if (_message.startsWith("Синхронизация кэша треков завершена.")) { 
RDebugUtils.currentLine=58589196;
 //BA.debugLineNum = 58589196;BA.debugLine="TraceInfo(\"cache\", \"кэш треков обновлен\", Normal";
__ref._traceinfo /*String*/ (null,"cache","кэш треков обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Синхронизация кэша треков завершена.")));
RDebugUtils.currentLine=58589197;
 //BA.debugLineNum = 58589197;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589199;
 //BA.debugLineNum = 58589199;BA.debugLine="If message.StartsWith(\"ad cache sync done\") Then";
if (_message.startsWith("ad cache sync done")) { 
RDebugUtils.currentLine=58589200;
 //BA.debugLineNum = 58589200;BA.debugLine="TraceInfo(\"cache\", \"кэш рекламы обновлен\", Norma";
__ref._traceinfo /*String*/ (null,"cache","кэш рекламы обновлен",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"ad cache sync done")));
RDebugUtils.currentLine=58589201;
 //BA.debugLineNum = 58589201;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589203;
 //BA.debugLineNum = 58589203;BA.debugLine="If message.StartsWith(\"Аудит кэша завершен.\") The";
if (_message.startsWith("Аудит кэша завершен.")) { 
RDebugUtils.currentLine=58589204;
 //BA.debugLineNum = 58589204;BA.debugLine="TraceInfo(\"cache\", \"аудит кэша\", NormalizeLegacy";
__ref._traceinfo /*String*/ (null,"cache","аудит кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Аудит кэша завершен.")));
RDebugUtils.currentLine=58589205;
 //BA.debugLineNum = 58589205;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589207;
 //BA.debugLineNum = 58589207;BA.debugLine="If message.StartsWith(\"Очистка кэша треков заверш";
if (_message.startsWith("Очистка кэша треков завершена.")) { 
RDebugUtils.currentLine=58589208;
 //BA.debugLineNum = 58589208;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Очистка кэша треков завершена.")));
RDebugUtils.currentLine=58589209;
 //BA.debugLineNum = 58589209;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589211;
 //BA.debugLineNum = 58589211;BA.debugLine="If message.StartsWith(\"кэш треков очистка итог\")";
if (_message.startsWith("кэш треков очистка итог")) { 
RDebugUtils.currentLine=58589212;
 //BA.debugLineNum = 58589212;BA.debugLine="TraceInfo(\"cache\", \"очистка кэша\", NormalizeLega";
__ref._traceinfo /*String*/ (null,"cache","очистка кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"кэш треков очистка итог")));
RDebugUtils.currentLine=58589213;
 //BA.debugLineNum = 58589213;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589215;
 //BA.debugLineNum = 58589215;BA.debugLine="If message.StartsWith(\"Удален cached ad, отсутств";
if (_message.startsWith("Удален cached ad, отсутствующий в актуальном data.")) { 
RDebugUtils.currentLine=58589216;
 //BA.debugLineNum = 58589216;BA.debugLine="TraceInfo(\"cache\", \"реклама удалена из кэша\", No";
__ref._traceinfo /*String*/ (null,"cache","реклама удалена из кэша",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Удален cached ad, отсутствующий в актуальном data.")));
RDebugUtils.currentLine=58589217;
 //BA.debugLineNum = 58589217;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589219;
 //BA.debugLineNum = 58589219;BA.debugLine="If message.StartsWith(\"подготовка data playback о";
if (_message.startsWith("подготовка data playback ошибка")) { 
RDebugUtils.currentLine=58589220;
 //BA.debugLineNum = 58589220;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", \"\")";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста","");
RDebugUtils.currentLine=58589221;
 //BA.debugLineNum = 58589221;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589223;
 //BA.debugLineNum = 58589223;BA.debugLine="If message.StartsWith(\"очередь запрос ошибка\") Th";
if (_message.startsWith("очередь запрос ошибка")) { 
RDebugUtils.currentLine=58589224;
 //BA.debugLineNum = 58589224;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь запрос ошибка")));
RDebugUtils.currentLine=58589225;
 //BA.debugLineNum = 58589225;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589227;
 //BA.debugLineNum = 58589227;BA.debugLine="If message.StartsWith(\"очередь next ошибка\") Then";
if (_message.startsWith("очередь next ошибка")) { 
RDebugUtils.currentLine=58589228;
 //BA.debugLineNum = 58589228;BA.debugLine="TraceWarn(\"playback\", \"очередь пуста\", Normalize";
__ref._tracewarn /*String*/ (null,"playback","очередь пуста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь next ошибка")));
RDebugUtils.currentLine=58589229;
 //BA.debugLineNum = 58589229;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589231;
 //BA.debugLineNum = 58589231;BA.debugLine="If message.StartsWith(\"очередь fetch ошибка\") The";
if (_message.startsWith("очередь fetch ошибка")) { 
RDebugUtils.currentLine=58589232;
 //BA.debugLineNum = 58589232;BA.debugLine="TraceWarn(\"network\", \"ошибка очереди\", Normalize";
__ref._tracewarn /*String*/ (null,"network","ошибка очереди",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"очередь fetch ошибка")));
RDebugUtils.currentLine=58589233;
 //BA.debugLineNum = 58589233;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589235;
 //BA.debugLineNum = 58589235;BA.debugLine="If message.StartsWith(\"состояние blocked\") Then";
if (_message.startsWith("состояние blocked")) { 
RDebugUtils.currentLine=58589236;
 //BA.debugLineNum = 58589236;BA.debugLine="TraceWarn(\"player\", \"плеер заблокирован\", \"\")";
__ref._tracewarn /*String*/ (null,"player","плеер заблокирован","");
RDebugUtils.currentLine=58589237;
 //BA.debugLineNum = 58589237;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589239;
 //BA.debugLineNum = 58589239;BA.debugLine="If message.StartsWith(\"состояние stop\") Or messag";
if (_message.startsWith("состояние stop") || _message.startsWith("message shutdown")) { 
RDebugUtils.currentLine=58589240;
 //BA.debugLineNum = 58589240;BA.debugLine="TraceWarn(\"player\", \"воспроизведение остановлено";
__ref._tracewarn /*String*/ (null,"player","воспроизведение остановлено",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafterfirstspace /*String*/ (null,_message)));
RDebugUtils.currentLine=58589241;
 //BA.debugLineNum = 58589241;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589243;
 //BA.debugLineNum = 58589243;BA.debugLine="If message.StartsWith(\"fallback activate\") Then";
if (_message.startsWith("fallback activate")) { 
RDebugUtils.currentLine=58589244;
 //BA.debugLineNum = 58589244;BA.debugLine="TraceWarn(\"playback\", \"включен локальный fallbac";
__ref._tracewarn /*String*/ (null,"playback","включен локальный fallback",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"fallback activate")));
RDebugUtils.currentLine=58589245;
 //BA.debugLineNum = 58589245;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589247;
 //BA.debugLineNum = 58589247;BA.debugLine="If message.StartsWith(\"degraded path вход\") Then";
if (_message.startsWith("degraded path вход")) { 
RDebugUtils.currentLine=58589248;
 //BA.debugLineNum = 58589248;BA.debugLine="TraceWarn(\"network\", \"деградация media path\", \"\"";
__ref._tracewarn /*String*/ (null,"network","деградация media path","");
RDebugUtils.currentLine=58589249;
 //BA.debugLineNum = 58589249;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589251;
 //BA.debugLineNum = 58589251;BA.debugLine="If message.StartsWith(\"degraded path восстановлен";
if (_message.startsWith("degraded path восстановлен")) { 
RDebugUtils.currentLine=58589252;
 //BA.debugLineNum = 58589252;BA.debugLine="TraceInfo(\"network\", \"media path восстановлен\",";
__ref._traceinfo /*String*/ (null,"network","media path восстановлен","");
RDebugUtils.currentLine=58589253;
 //BA.debugLineNum = 58589253;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589255;
 //BA.debugLineNum = 58589255;BA.debugLine="If message.StartsWith(\"история чтение ошибка\") Or";
if (_message.startsWith("история чтение ошибка") || _message.startsWith("история response parse ошибка")) { 
RDebugUtils.currentLine=58589256;
 //BA.debugLineNum = 58589256;BA.debugLine="TraceWarn(\"history\", \"ошибка истории\", \"\")";
__ref._tracewarn /*String*/ (null,"history","ошибка истории","");
RDebugUtils.currentLine=58589257;
 //BA.debugLineNum = 58589257;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589259;
 //BA.debugLineNum = 58589259;BA.debugLine="If message.StartsWith(\"метаданные плейлистов sync";
if (_message.startsWith("метаданные плейлистов sync итог")) { 
RDebugUtils.currentLine=58589260;
 //BA.debugLineNum = 58589260;BA.debugLine="TraceInfo(\"network\", \"метаданные плейлистов обно";
__ref._traceinfo /*String*/ (null,"network","метаданные плейлистов обновлены",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлистов sync итог")));
RDebugUtils.currentLine=58589261;
 //BA.debugLineNum = 58589261;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589263;
 //BA.debugLineNum = 58589263;BA.debugLine="If message.StartsWith(\"метаданные плейлиста fetch";
if (_message.startsWith("метаданные плейлиста fetch ошибка")) { 
RDebugUtils.currentLine=58589264;
 //BA.debugLineNum = 58589264;BA.debugLine="TraceWarn(\"network\", \"ошибка метаданных плейлист";
__ref._tracewarn /*String*/ (null,"network","ошибка метаданных плейлиста",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"метаданные плейлиста fetch ошибка")));
RDebugUtils.currentLine=58589265;
 //BA.debugLineNum = 58589265;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589267;
 //BA.debugLineNum = 58589267;BA.debugLine="If message.StartsWith(\"Не удалось подготовить вре";
if (_message.startsWith("Не удалось подготовить временный файл трека.")) { 
RDebugUtils.currentLine=58589268;
 //BA.debugLineNum = 58589268;BA.debugLine="TraceError(\"cache\", \"ошибка подготовки трека\", N";
__ref._traceerror /*String*/ (null,"cache","ошибка подготовки трека",__ref._normalizelegacydetails /*String*/ (null,__ref._tailafter /*String*/ (null,_message,"Не удалось подготовить временный файл трека.")));
RDebugUtils.currentLine=58589269;
 //BA.debugLineNum = 58589269;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=58589271;
 //BA.debugLineNum = 58589271;BA.debugLine="WriteTraceEntry(\"INFO\", \"player\", message, \"\")";
__ref._writetraceentry /*String*/ (null,"INFO","player",_message,"");
RDebugUtils.currentLine=58589272;
 //BA.debugLineNum = 58589272;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=58589273;
 //BA.debugLineNum = 58589273;BA.debugLine="End Sub";
return false;
}
public boolean  _shouldsuppresstracemessage(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldsuppresstracemessage", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldsuppresstracemessage", new Object[] {_message}));}
anywheresoftware.b4a.objects.collections.List _noisyprefixes = null;
String _prefix = "";
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Private Sub ShouldSuppressTraceMessage(message As";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="If message.StartsWith(\"guard переход\") Or message";
if (_message.startsWith("guard переход") || _message.startsWith("переход dispatch")) { 
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="If IsReleaseBuild Then";
if (__ref._isreleasebuild /*boolean*/ (null)) { 
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=58654725;
 //BA.debugLineNum = 58654725;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
RDebugUtils.currentLine=58654728;
 //BA.debugLineNum = 58654728;BA.debugLine="Dim noisyPrefixes As List";
_noisyprefixes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58654729;
 //BA.debugLineNum = 58654729;BA.debugLine="noisyPrefixes.Initialize";
_noisyprefixes.Initialize();
RDebugUtils.currentLine=58654730;
 //BA.debugLineNum = 58654730;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов load\")";
_noisyprefixes.Add((Object)("курсор плейлистов load"));
RDebugUtils.currentLine=58654731;
 //BA.debugLineNum = 58654731;BA.debugLine="noisyPrefixes.Add(\"состояние init\")";
_noisyprefixes.Add((Object)("состояние init"));
RDebugUtils.currentLine=58654732;
 //BA.debugLineNum = 58654732;BA.debugLine="noisyPrefixes.Add(\"старт skip\")";
_noisyprefixes.Add((Object)("старт skip"));
RDebugUtils.currentLine=58654733;
 //BA.debugLineNum = 58654733;BA.debugLine="noisyPrefixes.Add(\"старт вход\")";
_noisyprefixes.Add((Object)("старт вход"));
RDebugUtils.currentLine=58654734;
 //BA.debugLineNum = 58654734;BA.debugLine="noisyPrefixes.Add(\"отложенный старт\")";
_noisyprefixes.Add((Object)("отложенный старт"));
RDebugUtils.currentLine=58654735;
 //BA.debugLineNum = 58654735;BA.debugLine="noisyPrefixes.Add(\"сценарий \")";
_noisyprefixes.Add((Object)("сценарий "));
RDebugUtils.currentLine=58654736;
 //BA.debugLineNum = 58654736;BA.debugLine="noisyPrefixes.Add(\"flow переход\")";
_noisyprefixes.Add((Object)("flow переход"));
RDebugUtils.currentLine=58654737;
 //BA.debugLineNum = 58654737;BA.debugLine="noisyPrefixes.Add(\"guard переход\")";
_noisyprefixes.Add((Object)("guard переход"));
RDebugUtils.currentLine=58654738;
 //BA.debugLineNum = 58654738;BA.debugLine="noisyPrefixes.Add(\"guard подготовка\")";
_noisyprefixes.Add((Object)("guard подготовка"));
RDebugUtils.currentLine=58654739;
 //BA.debugLineNum = 58654739;BA.debugLine="noisyPrefixes.Add(\"guard prefetch\")";
_noisyprefixes.Add((Object)("guard prefetch"));
RDebugUtils.currentLine=58654740;
 //BA.debugLineNum = 58654740;BA.debugLine="noisyPrefixes.Add(\"guard fade\")";
_noisyprefixes.Add((Object)("guard fade"));
RDebugUtils.currentLine=58654741;
 //BA.debugLineNum = 58654741;BA.debugLine="noisyPrefixes.Add(\"переход dispatch\")";
_noisyprefixes.Add((Object)("переход dispatch"));
RDebugUtils.currentLine=58654742;
 //BA.debugLineNum = 58654742;BA.debugLine="noisyPrefixes.Add(\"воспроизведение activate\")";
_noisyprefixes.Add((Object)("воспроизведение activate"));
RDebugUtils.currentLine=58654743;
 //BA.debugLineNum = 58654743;BA.debugLine="noisyPrefixes.Add(\"очередь добор\")";
_noisyprefixes.Add((Object)("очередь добор"));
RDebugUtils.currentLine=58654744;
 //BA.debugLineNum = 58654744;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=58654745;
 //BA.debugLineNum = 58654745;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=58654746;
 //BA.debugLineNum = 58654746;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=58654747;
 //BA.debugLineNum = 58654747;BA.debugLine="noisyPrefixes.Add(\"автостарт сначала обновление д";
_noisyprefixes.Add((Object)("автостарт сначала обновление данных"));
RDebugUtils.currentLine=58654748;
 //BA.debugLineNum = 58654748;BA.debugLine="noisyPrefixes.Add(\"policy resume авто\")";
_noisyprefixes.Add((Object)("policy resume авто"));
RDebugUtils.currentLine=58654749;
 //BA.debugLineNum = 58654749;BA.debugLine="noisyPrefixes.Add(\"возобновление запрет\")";
_noisyprefixes.Add((Object)("возобновление запрет"));
RDebugUtils.currentLine=58654750;
 //BA.debugLineNum = 58654750;BA.debugLine="noisyPrefixes.Add(\"возобновление итог\")";
_noisyprefixes.Add((Object)("возобновление итог"));
RDebugUtils.currentLine=58654751;
 //BA.debugLineNum = 58654751;BA.debugLine="noisyPrefixes.Add(\"снимок очереди восстановление";
_noisyprefixes.Add((Object)("снимок очереди восстановление skip"));
RDebugUtils.currentLine=58654752;
 //BA.debugLineNum = 58654752;BA.debugLine="noisyPrefixes.Add(\"http get начало\")";
_noisyprefixes.Add((Object)("http get начало"));
RDebugUtils.currentLine=58654753;
 //BA.debugLineNum = 58654753;BA.debugLine="noisyPrefixes.Add(\"http get итог\")";
_noisyprefixes.Add((Object)("http get итог"));
RDebugUtils.currentLine=58654754;
 //BA.debugLineNum = 58654754;BA.debugLine="noisyPrefixes.Add(\"claim начало\")";
_noisyprefixes.Add((Object)("claim начало"));
RDebugUtils.currentLine=58654755;
 //BA.debugLineNum = 58654755;BA.debugLine="noisyPrefixes.Add(\"claim итог\")";
_noisyprefixes.Add((Object)("claim итог"));
RDebugUtils.currentLine=58654756;
 //BA.debugLineNum = 58654756;BA.debugLine="noisyPrefixes.Add(\"элемент очереди play\")";
_noisyprefixes.Add((Object)("элемент очереди play"));
RDebugUtils.currentLine=58654757;
 //BA.debugLineNum = 58654757;BA.debugLine="noisyPrefixes.Add(\"курсор плейлистов commit\")";
_noisyprefixes.Add((Object)("курсор плейлистов commit"));
RDebugUtils.currentLine=58654758;
 //BA.debugLineNum = 58654758;BA.debugLine="noisyPrefixes.Add(\"реклама prescan начало\")";
_noisyprefixes.Add((Object)("реклама prescan начало"));
RDebugUtils.currentLine=58654759;
 //BA.debugLineNum = 58654759;BA.debugLine="noisyPrefixes.Add(\"брейк exact defer\")";
_noisyprefixes.Add((Object)("брейк exact defer"));
RDebugUtils.currentLine=58654760;
 //BA.debugLineNum = 58654760;BA.debugLine="noisyPrefixes.Add(\"брейк exact sync\")";
_noisyprefixes.Add((Object)("брейк exact sync"));
RDebugUtils.currentLine=58654761;
 //BA.debugLineNum = 58654761;BA.debugLine="noisyPrefixes.Add(\"fade начало\")";
_noisyprefixes.Add((Object)("fade начало"));
RDebugUtils.currentLine=58654762;
 //BA.debugLineNum = 58654762;BA.debugLine="noisyPrefixes.Add(\"история confirm\")";
_noisyprefixes.Add((Object)("история confirm"));
RDebugUtils.currentLine=58654763;
 //BA.debugLineNum = 58654763;BA.debugLine="noisyPrefixes.Add(\"история stage\")";
_noisyprefixes.Add((Object)("история stage"));
RDebugUtils.currentLine=58654764;
 //BA.debugLineNum = 58654764;BA.debugLine="noisyPrefixes.Add(\"история буфер add\")";
_noisyprefixes.Add((Object)("история буфер add"));
RDebugUtils.currentLine=58654765;
 //BA.debugLineNum = 58654765;BA.debugLine="noisyPrefixes.Add(\"история отправка начало\")";
_noisyprefixes.Add((Object)("история отправка начало"));
RDebugUtils.currentLine=58654766;
 //BA.debugLineNum = 58654766;BA.debugLine="noisyPrefixes.Add(\"история отправка payload\")";
_noisyprefixes.Add((Object)("история отправка payload"));
RDebugUtils.currentLine=58654767;
 //BA.debugLineNum = 58654767;BA.debugLine="noisyPrefixes.Add(\"история отправка ack\")";
_noisyprefixes.Add((Object)("история отправка ack"));
RDebugUtils.currentLine=58654768;
 //BA.debugLineNum = 58654768;BA.debugLine="noisyPrefixes.Add(\"stop запрос\")";
_noisyprefixes.Add((Object)("stop запрос"));
RDebugUtils.currentLine=58654769;
 //BA.debugLineNum = 58654769;BA.debugLine="noisyPrefixes.Add(\"резерв очереди save\")";
_noisyprefixes.Add((Object)("резерв очереди save"));
RDebugUtils.currentLine=58654770;
 //BA.debugLineNum = 58654770;BA.debugLine="noisyPrefixes.Add(\"снимок очереди clear\")";
_noisyprefixes.Add((Object)("снимок очереди clear"));
RDebugUtils.currentLine=58654771;
 //BA.debugLineNum = 58654771;BA.debugLine="noisyPrefixes.Add(\"состояние воспроизведения clea";
_noisyprefixes.Add((Object)("состояние воспроизведения clear"));
RDebugUtils.currentLine=58654772;
 //BA.debugLineNum = 58654772;BA.debugLine="noisyPrefixes.Add(\"аудио ready\")";
_noisyprefixes.Add((Object)("аудио ready"));
RDebugUtils.currentLine=58654773;
 //BA.debugLineNum = 58654773;BA.debugLine="noisyPrefixes.Add(\"аудио complete\")";
_noisyprefixes.Add((Object)("аудио complete"));
RDebugUtils.currentLine=58654774;
 //BA.debugLineNum = 58654774;BA.debugLine="noisyPrefixes.Add(\"переход overlap начало\")";
_noisyprefixes.Add((Object)("переход overlap начало"));
RDebugUtils.currentLine=58654775;
 //BA.debugLineNum = 58654775;BA.debugLine="noisyPrefixes.Add(\"переход tail начало\")";
_noisyprefixes.Add((Object)("переход tail начало"));
RDebugUtils.currentLine=58654776;
 //BA.debugLineNum = 58654776;BA.debugLine="noisyPrefixes.Add(\"переход prefetch начало\")";
_noisyprefixes.Add((Object)("переход prefetch начало"));
RDebugUtils.currentLine=58654777;
 //BA.debugLineNum = 58654777;BA.debugLine="noisyPrefixes.Add(\"trusted time update\")";
_noisyprefixes.Add((Object)("trusted time update"));
RDebugUtils.currentLine=58654778;
 //BA.debugLineNum = 58654778;BA.debugLine="noisyPrefixes.Add(\"player end parse fail\")";
_noisyprefixes.Add((Object)("player end parse fail"));
RDebugUtils.currentLine=58654779;
 //BA.debugLineNum = 58654779;BA.debugLine="noisyPrefixes.Add(\"[AudioPrimary]\")";
_noisyprefixes.Add((Object)("[AudioPrimary]"));
RDebugUtils.currentLine=58654780;
 //BA.debugLineNum = 58654780;BA.debugLine="noisyPrefixes.Add(\"[AudioSecondary]\")";
_noisyprefixes.Add((Object)("[AudioSecondary]"));
RDebugUtils.currentLine=58654781;
 //BA.debugLineNum = 58654781;BA.debugLine="noisyPrefixes.Add(\"machine guid\")";
_noisyprefixes.Add((Object)("machine guid"));
RDebugUtils.currentLine=58654782;
 //BA.debugLineNum = 58654782;BA.debugLine="noisyPrefixes.Add(\"legacy migrate итог\")";
_noisyprefixes.Add((Object)("legacy migrate итог"));
RDebugUtils.currentLine=58654783;
 //BA.debugLineNum = 58654783;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлистов sync ski";
_noisyprefixes.Add((Object)("метаданные плейлистов sync skip"));
RDebugUtils.currentLine=58654784;
 //BA.debugLineNum = 58654784;BA.debugLine="noisyPrefixes.Add(\"метаданные плейлиста fetch нач";
_noisyprefixes.Add((Object)("метаданные плейлиста fetch начало"));
RDebugUtils.currentLine=58654785;
 //BA.debugLineNum = 58654785;BA.debugLine="noisyPrefixes.Add(\"окно save\")";
_noisyprefixes.Add((Object)("окно save"));
RDebugUtils.currentLine=58654786;
 //BA.debugLineNum = 58654786;BA.debugLine="noisyPrefixes.Add(\"окно restore\")";
_noisyprefixes.Add((Object)("окно restore"));
RDebugUtils.currentLine=58654787;
 //BA.debugLineNum = 58654787;BA.debugLine="noisyPrefixes.Add(\"trace отправка\")";
_noisyprefixes.Add((Object)("trace отправка"));
RDebugUtils.currentLine=58654788;
 //BA.debugLineNum = 58654788;BA.debugLine="noisyPrefixes.Add(\"скачивание рекламы в кэш\")";
_noisyprefixes.Add((Object)("скачивание рекламы в кэш"));
RDebugUtils.currentLine=58654789;
 //BA.debugLineNum = 58654789;BA.debugLine="noisyPrefixes.Add(\"скачивание трека в кэш\")";
_noisyprefixes.Add((Object)("скачивание трека в кэш"));
RDebugUtils.currentLine=58654790;
 //BA.debugLineNum = 58654790;BA.debugLine="noisyPrefixes.Add(\"удален cached track при очистк";
_noisyprefixes.Add((Object)("удален cached track при очистке кэша"));
RDebugUtils.currentLine=58654791;
 //BA.debugLineNum = 58654791;BA.debugLine="noisyPrefixes.Add(\"очистка кэша треков пропущена\"";
_noisyprefixes.Add((Object)("очистка кэша треков пропущена"));
RDebugUtils.currentLine=58654792;
 //BA.debugLineNum = 58654792;BA.debugLine="noisyPrefixes.Add(\"очередь playlist skip\")";
_noisyprefixes.Add((Object)("очередь playlist skip"));
RDebugUtils.currentLine=58654793;
 //BA.debugLineNum = 58654793;BA.debugLine="noisyPrefixes.Add(\"очередь next итог\")";
_noisyprefixes.Add((Object)("очередь next итог"));
RDebugUtils.currentLine=58654794;
 //BA.debugLineNum = 58654794;BA.debugLine="noisyPrefixes.Add(\"очередь signature mismatch\")";
_noisyprefixes.Add((Object)("очередь signature mismatch"));
RDebugUtils.currentLine=58654795;
 //BA.debugLineNum = 58654795;BA.debugLine="noisyPrefixes.Add(\"переход очередь drop\")";
_noisyprefixes.Add((Object)("переход очередь drop"));
RDebugUtils.currentLine=58654796;
 //BA.debugLineNum = 58654796;BA.debugLine="noisyPrefixes.Add(\"переход preload ошибка\")";
_noisyprefixes.Add((Object)("переход preload ошибка"));
RDebugUtils.currentLine=58654797;
 //BA.debugLineNum = 58654797;BA.debugLine="noisyPrefixes.Add(\"переход prepared reject\")";
_noisyprefixes.Add((Object)("переход prepared reject"));
RDebugUtils.currentLine=58654798;
 //BA.debugLineNum = 58654798;BA.debugLine="For Each prefix As String In noisyPrefixes";
{
final anywheresoftware.b4a.BA.IterableList group78 = _noisyprefixes;
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_prefix = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=58654799;
 //BA.debugLineNum = 58654799;BA.debugLine="If message.ToLowerCase.StartsWith(prefix.ToLower";
if (_message.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).startsWith(_prefix.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale))) { 
if (true) return __c.True;};
 }
};
RDebugUtils.currentLine=58654801;
 //BA.debugLineNum = 58654801;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=58654802;
 //BA.debugLineNum = 58654802;BA.debugLine="End Sub";
return false;
}
public String  _normalizelegacydetails(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizelegacydetails", false))
	 {return ((String) Debug.delegate(ba, "normalizelegacydetails", new Object[] {_text}));}
String _value = "";
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Private Sub NormalizeLegacyDetails(text As String)";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="Dim value As String = text.Trim";
_value = _text.trim();
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="If value.StartsWith(\".\") Or value.StartsWith(\":\")";
if (_value.startsWith(".") || _value.startsWith(":")) { 
_value = _value.substring((int) (1)).trim();};
RDebugUtils.currentLine=58720259;
 //BA.debugLineNum = 58720259;BA.debugLine="value = value.Replace(\",\", \"\")";
_value = _value.replace(",","");
RDebugUtils.currentLine=58720260;
 //BA.debugLineNum = 58720260;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=58720261;
 //BA.debugLineNum = 58720261;BA.debugLine="End Sub";
return "";
}
public String  _tailafter(b4j.example.b4xmainpage __ref,String _text,String _prefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tailafter", false))
	 {return ((String) Debug.delegate(ba, "tailafter", new Object[] {_text,_prefix}));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Private Sub TailAfter(text As String, prefix As St";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="If text.StartsWith(prefix) = False Then Return te";
if (_text.startsWith(_prefix)==__c.False) { 
if (true) return _text;};
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="Return text.SubString(prefix.Length).Trim";
if (true) return _text.substring(_prefix.length()).trim();
RDebugUtils.currentLine=58785795;
 //BA.debugLineNum = 58785795;BA.debugLine="End Sub";
return "";
}
public String  _tailafterfirstspace(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tailafterfirstspace", false))
	 {return ((String) Debug.delegate(ba, "tailafterfirstspace", new Object[] {_text}));}
int _firstspace = 0;
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Private Sub TailAfterFirstSpace(text As String) As";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="Dim firstSpace As Int = text.IndexOf(\" \")";
_firstspace = _text.indexOf(" ");
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="If firstSpace < 0 Then Return \"\"";
if (_firstspace<0) { 
if (true) return "";};
RDebugUtils.currentLine=58851331;
 //BA.debugLineNum = 58851331;BA.debugLine="Return text.SubString(firstSpace + 1).Trim";
if (true) return _text.substring((int) (_firstspace+1)).trim();
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="End Sub";
return "";
}
public String  _writetraceentry(b4j.example.b4xmainpage __ref,String _level,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "writetraceentry", false))
	 {return ((String) Debug.delegate(ba, "writetraceentry", new Object[] {_level,_category,_message,_details}));}
String _line = "";
String _safedetails = "";
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Private Sub WriteTraceEntry(level As String, categ";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="Dim line As String = level & \" | \" & category & \"";
_line = _level+" | "+_category+" | "+_message;
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="Dim safeDetails As String = details.Trim";
_safedetails = _details.trim();
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="If safeDetails <> \"\" Then line = line & \" | \" & s";
if ((_safedetails).equals("") == false) { 
_line = _line+" | "+_safedetails;};
RDebugUtils.currentLine=58523652;
 //BA.debugLineNum = 58523652;BA.debugLine="appTraceService.Trace(line)";
__ref._apptraceservice /*b4j.example.traceservice*/ ._trace /*String*/ (null,_line);
RDebugUtils.currentLine=58523653;
 //BA.debugLineNum = 58523653;BA.debugLine="End Sub";
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
boolean _serviceavailable = false;
boolean _hasinternet = false;

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
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="TraceLog(\"очередь fetch ошибка kind=\" & result.Ge";
__ref._tracelog /*String*/ (null,"очередь fetch ошибка kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+" message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"offline\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_result.GetDefault((Object)("Kind"),(Object)(""))).equals((Object)("offline"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="If HasLocalPlaybackFallback Then";

case 4:
//if
this.state = 7;
if (__ref._haslocalplaybackfallback /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="TraceLog(\"fallback выбор mode=local reason=data_";
__ref._tracelog /*String*/ (null,"fallback выбор mode=local reason=data_fetch_error");
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="Wait For (CheckServiceAvailability) Complete (ser";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlefetchfailure"), __ref._checkserviceavailability /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 8;
_serviceavailable = (boolean) result[1];
;
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="If serviceAvailable Then";
if (true) break;

case 8:
//if
this.state = 19;
if (_serviceavailable) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 19;
RDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=8650767;
 //BA.debugLineNum = 8650767;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlefetchfailure"), __ref._checkexternalconnectivity /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = 13;
_hasinternet = (boolean) result[1];
;
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="If hasInternet Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_hasinternet) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="HandleLocalTemporaryState(\"\")";
__ref._handlelocaltemporarystate /*String*/ (null,"");
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=8650774;
 //BA.debugLineNum = 8650774;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8650775;
 //BA.debugLineNum = 8650775;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _handletemporarystate(b4j.example.b4xmainpage __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handletemporarystate", false))
	 {return ((String) Debug.delegate(ba, "handletemporarystate", new Object[] {_mode,_text}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub HandleTemporaryState(mode As String, t";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="TraceLog(\"состояние temporary mode=\" & mode & \" t";
__ref._tracelog /*String*/ (null,"состояние temporary mode="+_mode+" text="+_text);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="dataPolicyState.ApplyTemporaryMode(mode)";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._applytemporarymode /*String*/ (null,_mode);
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Else If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="ShowMessage(MessageValue(\"offline\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"offline"));
 }else {
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="ShowMessage(MessageValue(\"server_wait\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="ScheduleRetry(mode, 0)";
__ref._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="End Sub";
return "";
}
public String  _handlemessageitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "handlemessageitem", new Object[] {_item}));}
String _action = "";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub HandleMessageItem(item As Map)";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim action As String = item.GetDefault(\"action\",";
_action = BA.ObjectToString(_item.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="TraceLog(\"сообщение handle action=\" & action & \"";
__ref._tracelog /*String*/ (null,"сообщение handle action="+_action+" text="+BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(""))));
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="If action = \"claim\" Then";
if ((_action).equals("claim")) { 
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="ShowClaimPrompt(item.GetDefault(\"message\", Messa";
__ref._showclaimprompt /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"device_busy")))));
 }else 
{RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="Else If action = \"shutdown\" Then";
if ((_action).equals("shutdown")) { 
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="HandleShutdownMessage(item.GetDefault(\"message\",";
__ref._handleshutdownmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"server_wait")))));
 }else 
{RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="Else If action = \"blocked\" Then";
if ((_action).equals("blocked")) { 
RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="HandleBlockedState";
__ref._handleblockedstate /*String*/ (null);
 }else 
{RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="Else If action = \"not_found\" Then";
if ((_action).equals("not_found")) { 
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="StopForMissingData(item.GetDefault(\"message\", Me";
__ref._stopformissingdata /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"not_found")))));
 }else {
RDebugUtils.currentLine=8060944;
 //BA.debugLineNum = 8060944;BA.debugLine="HandleTemporaryState(\"server\", item.GetDefault(\"";
__ref._handletemporarystate /*String*/ (null,"server",BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"server_wait")))));
 }}}}
;
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showclaimprompt", false))
	 {return ((String) Debug.delegate(ba, "showclaimprompt", new Object[] {_text}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub ShowClaimPrompt(text As String)";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="confirmPane.Visible = True";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="End Sub";
return "";
}
public String  _handleshutdownmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleshutdownmessage", false))
	 {return ((String) Debug.delegate(ba, "handleshutdownmessage", new Object[] {_text}));}
String _safetext = "";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub HandleShutdownMessage(text As String)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim safeText As String = text";
_safetext = _text;
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="If safeText = \"\" Then safeText = MessageValue(\"se";
if ((_safetext).equals("")) { 
_safetext = __ref._messagevalue /*String*/ (null,"server_wait");};
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="TraceLog(\"message shutdown text=\" & safeText)";
__ref._tracelog /*String*/ (null,"message shutdown text="+_safetext);
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"shutdown\")";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"shutdown");
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="ShowMessage(safeText)";
__ref._showmessage /*String*/ (null,_safetext);
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="historyFlushTimer.Enabled = False";
__ref._historyflushtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="localAdMinuteTimer.Enabled = False";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="trackCacheWarmupTimer.Enabled = False";
__ref._trackcachewarmuptimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="cacheAuditTimer.Enabled = False";
__ref._cacheaudittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="TraceLog(\"состояние stop reason=missing_data text";
__ref._tracelog /*String*/ (null,"состояние stop reason=missing_data text="+_text);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"missing_data\")";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"missing_data");
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="dataPolicyState.ClearPolicyPauseAndResumeRequest";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypauseandresumerequest /*String*/ (null);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="RefreshConnectionIndicatorState";
__ref._refreshconnectionindicatorstate /*String*/ (null);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="End Sub";
return "";
}
public boolean  _hasplayablelocaltrackincurrentslot(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hasplayablelocaltrackincurrentslot", false))
	 {return ((Boolean) Debug.delegate(ba, "hasplayablelocaltrackincurrentslot", null));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
Object _playlistobject = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
String _playlistid = "";
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub HasPlayableLocalTrackInCurrentSlot As";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveData";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._resolvedataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (_currentslot.IsInitialized()==__c.False || _currentslot.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Dim playlists As List = currentSlot.GetDefault(\"p";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentslot.GetDefault((Object)("playlists"),__c.Null)));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="If playlists.IsInitialized = False Or playlists.S";
if (_playlists.IsInitialized()==__c.False || _playlists.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="For Each playlistObject As Object In playlists";
{
final anywheresoftware.b4a.BA.IterableList group5 = _playlists;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_playlistobject = group5.Get(index5);
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="If playlistObject Is Map Then";
if (_playlistobject instanceof java.util.Map) { 
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="Dim playlistDescriptor As Map = playlistObject";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_playlistobject));
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="Dim playlistId As String = playlistDescriptor.G";
_playlistid = BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="If playlistId = \"\" Then Continue";
if ((_playlistid).equals("")) { 
if (true) continue;};
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCach";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistid);
RDebugUtils.currentLine=9306123;
 //BA.debugLineNum = 9306123;BA.debugLine="If PlaylistHasCachedTrack(playlistData) Then Re";
if (__ref._playlisthascachedtrack /*boolean*/ (null,_playlistdata)) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=9306126;
 //BA.debugLineNum = 9306126;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=9306127;
 //BA.debugLineNum = 9306127;BA.debugLine="End Sub";
return false;
}
public boolean  _haspendingexactbreak(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haspendingexactbreak", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingexactbreak", null));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub HasPendingExactBreak As Boolean";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Return queueState.HasPendingExactBreak(LocalNowTi";
if (true) return __ref._queuestate /*b4j.example.playbackqueuestate*/ ._haspendingexactbreak /*boolean*/ (null,__ref._localnowtimestamp /*long*/ (null));
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return false;
}
public boolean  _playlisthascachedtrack(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _playlistdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playlisthascachedtrack", false))
	 {return ((Boolean) Debug.delegate(ba, "playlisthascachedtrack", new Object[] {_playlistdata}));}
anywheresoftware.b4a.objects.collections.List _tracks = null;
Object _trackobject = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
String _trackid = "";
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub PlaylistHasCachedTrack(playlistData As";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If playlistData.IsInitialized = False Or playlist";
if (_playlistdata.IsInitialized()==__c.False || _playlistdata.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim tracks As List = playlistData.GetDefault(\"tra";
_tracks = new anywheresoftware.b4a.objects.collections.List();
_tracks = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_playlistdata.GetDefault((Object)("tracks"),__c.Null)));
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="If tracks.IsInitialized = False Or tracks.Size =";
if (_tracks.IsInitialized()==__c.False || _tracks.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="For Each trackObject As Object In tracks";
{
final anywheresoftware.b4a.BA.IterableList group4 = _tracks;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_trackobject = group4.Get(index4);
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="If trackObject Is Map Then";
if (_trackobject instanceof java.util.Map) { 
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Dim track As Map = trackObject";
_track = new anywheresoftware.b4a.objects.collections.Map();
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_trackobject));
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Dim trackId As String = track.GetDefault(\"id\",";
_trackid = BA.ObjectToString(_track.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="If trackId <> \"\" And mediaCacheService.IsTrackC";
if ((_trackid).equals("") == false && __ref._mediacacheservice /*b4j.example.mediacache*/ ._istrackcached /*boolean*/ (null,_trackid)) { 
if (true) return __c.True;};
 };
 }
};
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="End Sub";
return false;
}
public String  _headeractionpane_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_click", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub HeaderActionPane_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="ShowSettingsScreen";
__ref._showsettingsscreen /*String*/ (null);
 }else 
{RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Else If appScreenMode = \"settings\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="ShowPlayerScreen(False)";
__ref._showplayerscreen /*String*/ (null,__c.False);
 }}
;
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
public String  _showsettingsscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsettingsscreen", false))
	 {return ((String) Debug.delegate(ba, "showsettingsscreen", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub ShowSettingsScreen";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="appScreenMode = \"settings\"";
__ref._appscreenmode /*String*/  = "settings";
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="ConfigureSetupScreen(\"settings\", \"\")";
__ref._configuresetupscreen /*String*/ (null,"settings","");
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
return "";
}
public String  _showplayerscreen(b4j.example.b4xmainpage __ref,boolean _refreshinfo) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showplayerscreen", false))
	 {return ((String) Debug.delegate(ba, "showplayerscreen", new Object[] {_refreshinfo}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub ShowPlayerScreen(refreshInfo As Boolea";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="appScreenMode = \"player\"";
__ref._appscreenmode /*String*/  = "player";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="ConfigurePlayerHeader";
__ref._configureplayerheader /*String*/ (null);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="If orchestrationState.IsStarted = False And dataP";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False && __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ==__c.False && __ref._isstartupsequenceinprogress /*boolean*/ ==__c.False) { 
__ref._applystoppedstate /*String*/ (null);};
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="If refreshInfo = False Then Return";
if (_refreshinfo==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="RefreshPlayerHeaderFromCurrentData";
__ref._refreshplayerheaderfromcurrentdata /*String*/ (null);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseclicked(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub HeaderActionPane_MouseClicked (eventDa";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="HeaderActionPane_Click";
__ref._headeractionpane_click /*String*/ (null);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Private Sub HeaderActionPane_MouseEntered (eventDa";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="UpdateHeaderActionAppearance(True)";
__ref._updateheaderactionappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub HeaderActionPane_MouseExited (eventDat";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public String  _setstreamtext(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstreamtext", false))
	 {return ((String) Debug.delegate(ba, "setstreamtext", new Object[] {_text}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub SetStreamText(text As String)";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="lblStream.Text = text";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="End Sub";
return "";
}
public String  _historyflushtimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historyflushtimer_tick", false))
	 {return ((String) Debug.delegate(ba, "historyflushtimer_tick", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub HistoryFlushTimer_Tick";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If playerCode = \"\" Then Return";
if ((__ref._playercode /*String*/ ).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If GetPendingHistoryFileCount <= 0 Then Return";
if (__ref._getpendinghistoryfilecount /*int*/ (null)<=0) { 
if (true) return "";};
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="If isHistoryFlushInProgress Then Return";
if (__ref._ishistoryflushinprogress /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="FlushHistoryBufferAsync";
__ref._flushhistorybufferasync /*void*/ (null);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Private Sub MigrateLegacyStorageIfNeeded";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="If File.Exists(storageDir, storageFile) = False T";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ )==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Try";
try {RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="parser.Initialize(File.ReadString(storageDir, st";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ ));
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="Dim legacy As Map = parser.NextObject";
_legacy = new anywheresoftware.b4a.objects.collections.Map();
_legacy = _parser.NextObject();
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="If legacy.IsInitialized Then";
if (_legacy.IsInitialized()) { 
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="For Each key As String In legacy.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _legacy.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="storage.Put(key, legacy.Get(key))";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_key,_legacy.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="TraceLog(\"legacy migrate итог target=kvs\")";
__ref._tracelog /*String*/ (null,"legacy migrate итог target=kvs");
RDebugUtils.currentLine=17170443;
 //BA.debugLineNum = 17170443;BA.debugLine="File.Delete(storageDir, storageFile)";
__c.File.Delete(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ );
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="TraceLog(\"legacy migrate ошибка message=\" & Last";
__ref._tracelog /*String*/ (null,"legacy migrate ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=17170448;
 //BA.debugLineNum = 17170448;BA.debugLine="End Sub";
return "";
}
public String  _normalizeplayercode(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeplayercode", false))
	 {return ((String) Debug.delegate(ba, "normalizeplayercode", new Object[] {_value}));}
String _code = "";
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub NormalizePlayerCode(value As String) A";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim code As String = value.Trim.ToLowerCase";
_code = _value.trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="If Regex.IsMatch(\"^[a-z0-9]{5}$\", code) Then Retu";
if (__c.Regex.IsMatch("^[a-z0-9]{5}$",_code)) { 
if (true) return _code;};
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public String  _resolvemachineguidasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvemachineguidasync", false))
	 {return ((String) Debug.delegate(ba, "resolvemachineguidasync", null));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Private Sub ResolveMachineGuidAsync";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Try";
try {RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="machineGuidShell.Initialize(\"MachineGuidShell\",";
__ref._machineguidshell /*anywheresoftware.b4j.objects.Shell*/ .Initialize("MachineGuidShell","reg",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"query","HKLM\\SOFTWARE\\Microsoft\\Cryptography","/v","MachineGuid"}));
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="machineGuidShell.Run(-1)";
__ref._machineguidshell /*anywheresoftware.b4j.objects.Shell*/ .Run(ba,(long) (-1));
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="TraceLog(\"machine guid чтение начало\")";
__ref._tracelog /*String*/ (null,"machine guid чтение начало");
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="TraceLog(\"machine guid чтение ошибка message=\" &";
__ref._tracelog /*String*/ (null,"machine guid чтение ошибка message="+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="End Sub";
return "";
}
public String  _invalidaterelevanttrackidscache(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "invalidaterelevanttrackidscache", false))
	 {return ((String) Debug.delegate(ba, "invalidaterelevanttrackidscache", null));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Private Sub InvalidateRelevantTrackIdsCache";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="If cachedRelevantTrackIds.IsInitialized = False T";
if (__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="cachedRelevantTrackIds.Clear";
__ref._cachedrelevanttrackids /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=57409539;
 //BA.debugLineNum = 57409539;BA.debugLine="End Sub";
return "";
}
public long  _resolveplaybackendtimestamp(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplaybackendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "resolveplaybackendtimestamp", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
long _playerend = 0L;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub ResolvePlaybackEndTimestamp(data As Ma";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim playerData As Map = data.GetDefault(\"player\",";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Dim playerEnd As Long = ParseEndValueToTimestamp";
_playerend = __ref._parseendvaluetotimestamp /*long*/ (null,_playerdata.Get((Object)("end")));
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="If playerEnd > 0 Then Return playerEnd";
if (_playerend>0) { 
if (true) return _playerend;};
 };
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Return ParseEndValueToTimestamp(data.Get(\"end\"))";
if (true) return __ref._parseendvaluetotimestamp /*long*/ (null,_data.Get((Object)("end")));
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="End Sub";
return 0L;
}
public String  _isplaybackrunningfortrace(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isplaybackrunningfortrace", false))
	 {return ((String) Debug.delegate(ba, "isplaybackrunningfortrace", null));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Private Sub IsPlaybackRunningForTrace As String";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
if (true) return "false";};
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="If runtimeState.ActiveAudioKey = \"\" Then Return \"";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("")) { 
if (true) return "false";};
RDebugUtils.currentLine=59047939;
 //BA.debugLineNum = 59047939;BA.debugLine="Return \"true\"";
if (true) return "true";
RDebugUtils.currentLine=59047940;
 //BA.debugLineNum = 59047940;BA.debugLine="End Sub";
return "";
}
public boolean  _isreleasebuild(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isreleasebuild", false))
	 {return ((Boolean) Debug.delegate(ba, "isreleasebuild", null));}
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Private Sub IsReleaseBuild As Boolean";
RDebugUtils.currentLine=59834372;
 //BA.debugLineNum = 59834372;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=59834374;
 //BA.debugLineNum = 59834374;BA.debugLine="End Sub";
return false;
}
public int  _scalevalue(b4j.example.b4xmainpage __ref,int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub ScaleValue(availableWidth As Int, smal";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Return UiStyle.ScaleValue(availableWidth, smallVa";
if (true) return _uistyle._scalevalue /*int*/ (_availablewidth,_smallvalue,_mediumvalue,_largevalue);
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub UpdateResponsiveStyles(availableWidth";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim small As Boolean = availableWidth <= 420dip";
_small = _availablewidth<=__c.DipToCurrent((int) (420));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim medium As Boolean = availableWidth <= 720dip";
_medium = _availablewidth<=__c.DipToCurrent((int) (720));
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Dim streamFontSize As Float";
_streamfontsize = 0f;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Dim infoFontSize As Float";
_infofontsize = 0f;
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim playFontSize As Float";
_playfontsize = 0f;
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Dim stopFontSize As Float";
_stopfontsize = 0f;
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Dim headerActionSize As Float";
_headeractionsize = 0f;
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Dim codeSize As Float";
_codesize = 0f;
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Dim cardRadius As Int";
_cardradius = 0;
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="If small Then";
if (_small) { 
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="streamFontSize = 28";
_streamfontsize = (float) (28);
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="infoFontSize = 16";
_infofontsize = (float) (16);
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="playFontSize = 60";
_playfontsize = (float) (60);
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="stopFontSize = 56";
_stopfontsize = (float) (56);
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="headerActionSize = 24";
_headeractionsize = (float) (24);
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="codeSize = 31";
_codesize = (float) (31);
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="cardRadius = 16dip";
_cardradius = __c.DipToCurrent((int) (16));
 }else 
{RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Else If medium Then";
if (_medium) { 
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="streamFontSize = 32";
_streamfontsize = (float) (32);
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="playFontSize = 68";
_playfontsize = (float) (68);
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="stopFontSize = 62";
_stopfontsize = (float) (62);
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="headerActionSize = 26";
_headeractionsize = (float) (26);
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="codeSize = 35";
_codesize = (float) (35);
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="cardRadius = 20dip";
_cardradius = __c.DipToCurrent((int) (20));
 }else {
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="streamFontSize = 38";
_streamfontsize = (float) (38);
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="playFontSize = 74";
_playfontsize = (float) (74);
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="stopFontSize = 68";
_stopfontsize = (float) (68);
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="headerActionSize = 28";
_headeractionsize = (float) (28);
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="codeSize = 38";
_codesize = (float) (38);
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="cardRadius = 24dip";
_cardradius = __c.DipToCurrent((int) (24));
 }}
;
RDebugUtils.currentLine=786469;
 //BA.debugLineNum = 786469;BA.debugLine="playIconBaseSize = playFontSize";
__ref._playiconbasesize /*float*/  = _playfontsize;
RDebugUtils.currentLine=786470;
 //BA.debugLineNum = 786470;BA.debugLine="stopIconBaseSize = stopFontSize";
__ref._stopiconbasesize /*float*/  = _stopfontsize;
RDebugUtils.currentLine=786471;
 //BA.debugLineNum = 786471;BA.debugLine="headerActionFontSize = headerActionSize";
__ref._headeractionfontsize /*float*/  = _headeractionsize;
RDebugUtils.currentLine=786472;
 //BA.debugLineNum = 786472;BA.debugLine="codeFontSize = codeSize";
__ref._codefontsize /*float*/  = _codesize;
RDebugUtils.currentLine=786473;
 //BA.debugLineNum = 786473;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_streamfontsize));
RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(_infofontsize));
RDebugUtils.currentLine=786475;
 //BA.debugLineNum = 786475;BA.debugLine="lblHeader.Font = xui.CreateDefaultFont(12)";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=786476;
 //BA.debugLineNum = 786476;BA.debugLine="lblFooter.Font = xui.CreateDefaultFont(12)";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=786477;
 //BA.debugLineNum = 786477;BA.debugLine="ApplyMaterialIconFont(lblConnectionIcon, 16)";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblconnectionicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (16));
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),_cardradius);
RDebugUtils.currentLine=786479;
 //BA.debugLineNum = 786479;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=786480;
 //BA.debugLineNum = 786480;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
__ref._updatecodeinputappearance /*String*/ (null,__ref._iscodeinputfocused /*boolean*/ );
RDebugUtils.currentLine=786481;
 //BA.debugLineNum = 786481;BA.debugLine="If orchestrationState.IsStarted Or dataPolicyStat";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/  || __ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/  || __ref._isstartupsequenceinprogress /*boolean*/ ) { 
RDebugUtils.currentLine=786482;
 //BA.debugLineNum = 786482;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
 }else {
RDebugUtils.currentLine=786484;
 //BA.debugLineNum = 786484;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
 };
RDebugUtils.currentLine=786486;
 //BA.debugLineNum = 786486;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60817408;
 //BA.debugLineNum = 60817408;BA.debugLine="Private Sub MeasureViewTextWidth(view As B4XView)";
RDebugUtils.currentLine=60817409;
 //BA.debugLineNum = 60817409;BA.debugLine="Dim textNode As JavaObject";
_textnode = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=60817410;
 //BA.debugLineNum = 60817410;BA.debugLine="textNode.InitializeNewInstance(\"javafx.scene.text";
_textnode.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_view.getText())});
RDebugUtils.currentLine=60817411;
 //BA.debugLineNum = 60817411;BA.debugLine="Dim fontObject As JavaObject = view.Font";
_fontobject = new anywheresoftware.b4j.object.JavaObject();
_fontobject = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getFont().getObject()));
RDebugUtils.currentLine=60817412;
 //BA.debugLineNum = 60817412;BA.debugLine="textNode.RunMethod(\"setFont\", Array As Object(fon";
_textnode.RunMethod("setFont",new Object[]{(Object)(_fontobject.getObject())});
RDebugUtils.currentLine=60817413;
 //BA.debugLineNum = 60817413;BA.debugLine="Dim bounds As JavaObject = textNode.RunMethod(\"ge";
_bounds = new anywheresoftware.b4j.object.JavaObject();
_bounds = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_textnode.RunMethod("getLayoutBounds",(Object[])(__c.Null))));
RDebugUtils.currentLine=60817414;
 //BA.debugLineNum = 60817414;BA.debugLine="Return Ceil(bounds.RunMethod(\"getWidth\", Null))";
if (true) return (int) (__c.Ceil((double)(BA.ObjectToNumber(_bounds.RunMethod("getWidth",(Object[])(__c.Null))))));
RDebugUtils.currentLine=60817415;
 //BA.debugLineNum = 60817415;BA.debugLine="End Sub";
return 0;
}
public String  _updatevisiblemode(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatevisiblemode", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblemode", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub UpdateVisibleMode";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="setupPane.Visible = appScreenMode <> \"player\"";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((__ref._appscreenmode /*String*/ ).equals("player") == false);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="playerPane.Visible = True";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="playerPane.Visible = False";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="If appScreenMode = \"setup\" Then headerActionPane.";
if ((__ref._appscreenmode /*String*/ ).equals("setup")) { 
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);};
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="End Sub";
return "";
}
public String  _localadminutetimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localadminutetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "localadminutetimer_tick", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub LocalAdMinuteTimer_Tick";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/  || __ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (__ref._currentsecondofminute /*int*/ (null)<50) { 
if (true) return "";};
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,__c.True);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="End Sub";
return "";
}
public String  _prescanupcomingadminute(b4j.example.b4xmainpage __ref,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prescanupcomingadminute", false))
	 {return ((String) Debug.delegate(ba, "prescanupcomingadminute", new Object[] {_force}));}
long _targettimestamp = 0L;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub PreScanUpcomingAdMinute(force As Boole";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (__ref._currentsecondofminute /*int*/ (null)<50) { 
if (true) return "";};
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim targetTimestamp As Long = LocalNowTimestamp +";
_targettimestamp = (long) (__ref._localnowtimestamp /*long*/ (null)+(60-__ref._currentsecondofminute /*int*/ (null)));
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="If (MinuteOfHourFromTimestamp(targetTimestamp) Mo";
if ((__ref._minuteofhourfromtimestamp /*int*/ (null,_targettimestamp)%5)!=0) { 
if (true) return "";};
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="If CurrentSecondOfMinute = 50 Then";
if (__ref._currentsecondofminute /*int*/ (null)==50) { 
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="TraceLog(\"реклама prescan начало target=\" & Form";
__ref._tracelog /*String*/ (null,"реклама prescan начало target="+__ref._formattimestampfortrace /*String*/ (null,_targettimestamp));
 };
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="ScanLocalAdsForTimestamp(targetTimestamp, force)";
__ref._scanlocaladsfortimestamp /*String*/ (null,_targettimestamp,_force);
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="End Sub";
return "";
}
public String  _secondsagotext(b4j.example.b4xmainpage __ref,long _ticksvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "secondsagotext", false))
	 {return ((String) Debug.delegate(ba, "secondsagotext", new Object[] {_ticksvalue}));}
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Private Sub SecondsAgoText(ticksValue As Long) As";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="If ticksValue <= 0 Then Return \"unknown\"";
if (_ticksvalue<=0) { 
if (true) return "unknown";};
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="Return \"\" & Max(0, Floor((DateTime.Now - ticksVal";
if (true) return ""+BA.NumberToString(__c.Max(0,__c.Floor((__c.DateTime.getNow()-_ticksvalue)/(double)1000)));
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Wait For (facade.StopPlayback) Complete (stopped";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "stopplayer"), __ref._facade /*b4j.example.playbackfacade*/ ._stopplayback /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_stopped = (boolean) result[1];
;
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Return stopped";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_stopped));return;};
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub ShowSetupScreen(text As String)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="appScreenMode = \"setup\"";
__ref._appscreenmode /*String*/  = "setup";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="orchestrationState.EnterUserStoppedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enteruserstoppedstate /*String*/ (null);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="lblHeader.Text = \"\"";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="ConfigureSetupScreen(\"setup\", text)";
__ref._configuresetupscreen /*String*/ (null,"setup",_text);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="If txtPlayerCode.IsInitialized Then txtPlayerCode";
if (__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .IsInitialized()) { 
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();};
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="End Sub";
return "";
}
public String  _machineguidshell_processcompleted(b4j.example.b4xmainpage __ref,boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "machineguidshell_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "machineguidshell_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
String _machineguid = "";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub MachineGuidShell_ProcessCompleted (suc";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If success And exitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"MachineG";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("MachineGuid\\s+REG_\\w+\\s+([^\\r\\n]+)",_stdout);
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="If matcher.Find Then";
if (_matcher.Find()) { 
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="Dim machineGuid As String = matcher.Group(1).Tr";
_machineguid = _matcher.Group((int) (1)).trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="If machineGuid = \"\" Then";
if ((_machineguid).equals("")) { 
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="TraceLog(\"machine guid пустой\")";
__ref._tracelog /*String*/ (null,"machine guid пустой");
RDebugUtils.currentLine=17039367;
 //BA.debugLineNum = 17039367;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="If deviceId <> machineGuid Then";
if ((__ref._deviceid /*String*/ ).equals(_machineguid) == false) { 
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="deviceId = machineGuid";
__ref._deviceid /*String*/  = _machineguid;
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="SaveValue(\"device_id\", deviceId)";
__ref._savevalue /*String*/ (null,"device_id",(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="TraceLog(\"deviceId обновлен из machine guid va";
__ref._tracelog /*String*/ (null,"deviceId обновлен из machine guid value="+__ref._deviceid /*String*/ );
 }else {
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="TraceLog(\"machine guid совпадение device=true\"";
__ref._tracelog /*String*/ (null,"machine guid совпадение device=true");
 };
 }else {
RDebugUtils.currentLine=17039377;
 //BA.debugLineNum = 17039377;BA.debugLine="TraceLog(\"machine guid чтение ошибка reason=not";
__ref._tracelog /*String*/ (null,"machine guid чтение ошибка reason=not_found");
 };
 }else {
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="TraceLog(\"machine guid чтение ошибка success=\" &";
__ref._tracelog /*String*/ (null,"machine guid чтение ошибка success="+BA.ObjectToString(_success)+" exitCode="+BA.NumberToString(_exitcode)+" stderr="+_stderr);
 };
RDebugUtils.currentLine=17039382;
 //BA.debugLineNum = 17039382;BA.debugLine="End Sub";
return "";
}
public String  _mediaurl(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mediaurl", false))
	 {return ((String) Debug.delegate(ba, "mediaurl", new Object[] {_item}));}
String _id = "";
String _localuri = "";
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub MediaUrl(item As Map) As String";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim id As String = item.GetDefault(\"id\", \"\")";
_id = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="If id = \"\" Then Return \"\"";
if ((_id).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="Dim localUri As String = mediaCacheService.Resolv";
_localuri = __ref._mediacacheservice /*b4j.example.mediacache*/ ._resolvelocalmediauri /*String*/ (null,_item);
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="If localUri <> \"\" Then Return localUri";
if ((_localuri).equals("") == false) { 
if (true) return _localuri;};
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub MergeBreakItems(item As Map)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim items As List = item.GetDefault(\"items\", Null";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Dim merged As List";
_merged = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="merged.Initialize";
_merged.Initialize();
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="For Each breakItem As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_breakitem = group5.Get(index5);
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="merged.Add(breakItem)";
_merged.Add(_breakitem);
 }
};
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="For Each existing As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_existing = group8.Get(index8);
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="merged.Add(existing)";
_merged.Add(_existing);
 }
};
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="playQueue = merged";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _merged;
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="TraceLog(\"брейк очередь add queue=\" & playQueue.S";
__ref._tracelog /*String*/ (null,"брейк очередь add queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" at="+BA.NumberToString(__ref._queuestate /*b4j.example.playbackqueuestate*/ ._scheduledbreakat /*long*/ ));
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub MinuteOfHourFromTimestamp(targetTimest";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Dim timeValue As String = DateTime.Time(targetTim";
_timevalue = __c.DateTime.Time((long) (_targettimestamp*1000));
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="Return parts(1)";
if (true) return (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="End Sub";
return 0;
}
public double  _normalizedbvalue(b4j.example.b4xmainpage __ref,Object _value,double _fallbackvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizedbvalue", false))
	 {return ((Double) Debug.delegate(ba, "normalizedbvalue", new Object[] {_value,_fallbackvalue}));}
double _db = 0;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub NormalizeDbValue(value As Object, fall";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Dim db As Double = fallbackValue";
_db = _fallbackvalue;
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="Try";
try {RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="db = value";
_db = (double)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="db = fallbackValue";
_db = _fallbackvalue;
 };
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="If db > 0 Then db = 0";
if (_db>0) { 
_db = 0;};
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="If db < -24 Then db = -24";
if (_db<-24) { 
_db = -24;};
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="Return db";
if (true) return _db;
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="End Sub";
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
this.state = -1;
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (unused";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "offlinedatarefreshtimer_tick"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub OrbitTimer_Tick";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="orbitPulseStep = (orbitPulseStep + 1) Mod 24";
__ref._orbitpulsestep /*int*/  = (int) ((__ref._orbitpulsestep /*int*/ +1)%24);
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim fadeStep As Double = orbitTimer.Interval / OR";
_fadestep = __ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()/(double)__ref._orbit_fade_ms /*int*/ ;
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="If orbitFadeValue < orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ <__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="orbitFadeValue = Min(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Min(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ +_fadestep);
 }else 
{RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="Else If orbitFadeValue > orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ >__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="orbitFadeValue = Max(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Max(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ -_fadestep);
 }}
;
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="ApplyOrbitFrame(orbitPulseStep)";
__ref._applyorbitframe /*String*/ (null,__ref._orbitpulsestep /*int*/ );
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="If orbitFadeValue = 0 And orbitFadeTarget = 0 The";
if (__ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0) { 
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);};
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="End Sub";
return "";
}
public long  _parsedateonlyendtimestamp(b4j.example.b4xmainpage __ref,String _textvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "parsedateonlyendtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parsedateonlyendtimestamp", new Object[] {_textvalue}));}
String _previousdateformat = "";
long _daystartticks = 0L;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub ParseDateOnlyEndTimestamp(textValue As";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Try";
try {RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="Dim dayStartTicks As Long = DateTime.DateParse(t";
_daystartticks = __c.DateTime.DateParse(_textvalue);
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="Return Floor((dayStartTicks + DateTime.TicksPerD";
if (true) return (long) (__c.Floor((_daystartticks+__c.DateTime.TicksPerDay)/(double)1000));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="ConsumeLastException";
__ref._consumelastexception /*String*/ (null);
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=10158092;
 //BA.debugLineNum = 10158092;BA.debugLine="End Sub";
return 0L;
}
public long  _parseendvaluetotimestamp(b4j.example.b4xmainpage __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "parseendvaluetotimestamp", false))
	 {return ((Long) Debug.delegate(ba, "parseendvaluetotimestamp", new Object[] {_value}));}
String _textvalue = "";
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetime = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub ParseEndValueToTimestamp(value As Obje";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="If value = Null Then Return 0";
if (_value== null) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim textValue As String = (\"\" & value).Trim";
_textvalue = (""+BA.ObjectToString(_value)).trim();
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="If textValue = \"\" Then Return 0";
if ((_textvalue).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="If Regex.IsMatch(\"^\\d+$\", textValue) Then Return";
if (__c.Regex.IsMatch("^\\d+$",_textvalue)) { 
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_textvalue))));};
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="If Regex.IsMatch(\"^\\d{4}-\\d{2}-\\d{2}$\", textValue";
if (__c.Regex.IsMatch("^\\d{4}-\\d{2}-\\d{2}$",_textvalue)) { 
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Return ParseDateOnlyEndTimestamp(textValue)";
if (true) return __ref._parsedateonlyendtimestamp /*long*/ (null,_textvalue);
 };
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="Try";
try {RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="ConsumeLastException";
__ref._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="Try";
try {RDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=9895954;
 //BA.debugLineNum = 9895954;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time.";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTim";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_textvalue)})));
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunMe";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="Return instant.RunMethod(\"getEpochSecond\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("getEpochSecond",(Object[])(__c.Null)));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=9895959;
 //BA.debugLineNum = 9895959;BA.debugLine="ConsumeLastException";
__ref._consumelastexception /*String*/ (null);
 };
RDebugUtils.currentLine=9895961;
 //BA.debugLineNum = 9895961;BA.debugLine="TraceLog(\"player end parse fail value=\" & textVal";
__ref._tracelog /*String*/ (null,"player end parse fail value="+_textvalue);
RDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="End Sub";
return 0L;
}
public long  _parsetrustedonlineticks(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "parsetrustedonlineticks", false))
	 {return ((Long) Debug.delegate(ba, "parsetrustedonlineticks", new Object[] {_data}));}
String _updatedtext = "";
anywheresoftware.b4j.object.JavaObject _instantclass = null;
anywheresoftware.b4j.object.JavaObject _instant = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetimeclass = null;
anywheresoftware.b4j.object.JavaObject _offsetdatetime = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub ParseTrustedOnlineTicks(data As Map) A";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="If data.IsInitialized = False Then Return 0";
if (_data.IsInitialized()==__c.False) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim updatedText As String = (\"\" & data.GetDefault";
_updatedtext = (""+BA.ObjectToString(_data.GetDefault((Object)("updated"),(Object)("")))).trim();
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="If updatedText = \"\" Then Return 0";
if ((_updatedtext).equals("")) { 
if (true) return (long) (0);};
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="Try";
try {RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Dim instantClass As JavaObject";
_instantclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="instantClass.InitializeStatic(\"java.time.Instant";
_instantclass.InitializeStatic("java.time.Instant");
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="Dim instant As JavaObject = instantClass.RunMeth";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_instantclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=10092554;
 //BA.debugLineNum = 10092554;BA.debugLine="Try";
try {RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="Dim offsetDateTimeClass As JavaObject";
_offsetdatetimeclass = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10092556;
 //BA.debugLineNum = 10092556;BA.debugLine="offsetDateTimeClass.InitializeStatic(\"java.time";
_offsetdatetimeclass.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=10092557;
 //BA.debugLineNum = 10092557;BA.debugLine="Dim offsetDateTime As JavaObject = offsetDateTi";
_offsetdatetime = new anywheresoftware.b4j.object.JavaObject();
_offsetdatetime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetimeclass.RunMethod("parse",new Object[]{(Object)(_updatedtext)})));
RDebugUtils.currentLine=10092558;
 //BA.debugLineNum = 10092558;BA.debugLine="Dim instant As JavaObject = offsetDateTime.RunM";
_instant = new anywheresoftware.b4j.object.JavaObject();
_instant = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_offsetdatetime.RunMethod("toInstant",(Object[])(__c.Null))));
RDebugUtils.currentLine=10092559;
 //BA.debugLineNum = 10092559;BA.debugLine="Return instant.RunMethod(\"toEpochMilli\", Null)";
if (true) return BA.ObjectToLongNumber(_instant.RunMethod("toEpochMilli",(Object[])(__c.Null)));
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=10092561;
 //BA.debugLineNum = 10092561;BA.debugLine="ConsumeLastException";
__ref._consumelastexception /*String*/ (null);
 };
 };
RDebugUtils.currentLine=10092564;
 //BA.debugLineNum = 10092564;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=10092565;
 //BA.debugLineNum = 10092565;BA.debugLine="End Sub";
return 0L;
}
public String  _playbackfacade_trace(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbackfacade_trace", false))
	 {return ((String) Debug.delegate(ba, "playbackfacade_trace", new Object[] {_message}));}
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Public Sub PlaybackFacade_Trace(message As String)";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="TraceLog(message)";
__ref._tracelog /*String*/ (null,_message);
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60620801;
 //BA.debugLineNum = 60620801;BA.debugLine="If isPlaybackWatchdogTickInProgress Then Return";
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
RDebugUtils.currentLine=60620802;
 //BA.debugLineNum = 60620802;BA.debugLine="isPlaybackWatchdogTickInProgress = True";
__ref._isplaybackwatchdogtickinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=60620803;
 //BA.debugLineNum = 60620803;BA.debugLine="Wait For (RunPlaybackWatchdogTick) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbackwatchdogtimer_tick"), __ref._runplaybackwatchdogtick /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=60620804;
 //BA.debugLineNum = 60620804;BA.debugLine="isPlaybackWatchdogTickInProgress = False";
__ref._isplaybackwatchdogtickinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=60620805;
 //BA.debugLineNum = 60620805;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60686337;
 //BA.debugLineNum = 60686337;BA.debugLine="If ShouldWatchPlaybackProgress = False Then";
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
RDebugUtils.currentLine=60686338;
 //BA.debugLineNum = 60686338;BA.debugLine="ResetPlaybackWatchdogState";
__ref._resetplaybackwatchdogstate /*String*/ (null);
RDebugUtils.currentLine=60686339;
 //BA.debugLineNum = 60686339;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=60686341;
 //BA.debugLineNum = 60686341;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=60686342;
 //BA.debugLineNum = 60686342;BA.debugLine="Dim currentTrackId As String = ActiveTrackIdForWa";
_currenttrackid = __ref._activetrackidforwatchdog /*String*/ (null);
RDebugUtils.currentLine=60686343;
 //BA.debugLineNum = 60686343;BA.debugLine="Dim currentPositionMs As Long = ActivePlaybackPos";
_currentpositionms = __ref._activeplaybackpositionms /*long*/ (null);
RDebugUtils.currentLine=60686344;
 //BA.debugLineNum = 60686344;BA.debugLine="If lastPlaybackWatchdogProgressAt = 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (__ref._lastplaybackwatchdogprogressat /*long*/ ==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=60686345;
 //BA.debugLineNum = 60686345;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
__ref._markplaybackwatchdogprogress /*String*/ (null,_currenttrackid,_currentpositionms);
RDebugUtils.currentLine=60686346;
 //BA.debugLineNum = 60686346;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=60686348;
 //BA.debugLineNum = 60686348;BA.debugLine="If currentTrackId <> \"\" And currentTrackId <> las";

case 8:
//if
this.state = 11;
if ((_currenttrackid).equals("") == false && (_currenttrackid).equals(__ref._lastplaybackwatchdogtrackid /*String*/ ) == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=60686349;
 //BA.debugLineNum = 60686349;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
__ref._markplaybackwatchdogprogress /*String*/ (null,_currenttrackid,_currentpositionms);
RDebugUtils.currentLine=60686350;
 //BA.debugLineNum = 60686350;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=60686352;
 //BA.debugLineNum = 60686352;BA.debugLine="If currentPositionMs >= 0 And currentPositionMs >";

case 11:
//if
this.state = 14;
if (_currentpositionms>=0 && _currentpositionms>__ref._lastplaybackwatchdogpositionms /*long*/ +__ref._playback_watchdog_progress_delta_ms /*long*/ ) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=60686353;
 //BA.debugLineNum = 60686353;BA.debugLine="MarkPlaybackWatchdogProgress(currentTrackId, cur";
__ref._markplaybackwatchdogprogress /*String*/ (null,_currenttrackid,_currentpositionms);
RDebugUtils.currentLine=60686354;
 //BA.debugLineNum = 60686354;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=60686356;
 //BA.debugLineNum = 60686356;BA.debugLine="If nowTicks - lastPlaybackWatchdogRecoveryAt < PL";

case 14:
//if
this.state = 19;
if (_nowticks-__ref._lastplaybackwatchdogrecoveryat /*long*/ <__ref._playback_watchdog_grace_ms /*long*/ ) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=60686357;
 //BA.debugLineNum = 60686357;BA.debugLine="If nowTicks - lastPlaybackWatchdogProgressAt < PL";
if (true) break;

case 20:
//if
this.state = 25;
if (_nowticks-__ref._lastplaybackwatchdogprogressat /*long*/ <__ref._playback_watchdog_stall_ms /*long*/ ) { 
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
RDebugUtils.currentLine=60686358;
 //BA.debugLineNum = 60686358;BA.debugLine="Wait For (RecoverFromPlaybackStall(currentTrackId";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "runplaybackwatchdogtick"), __ref._recoverfromplaybackstall /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_currenttrackid,_currentpositionms));
this.state = 30;
return;
case 30:
//C
this.state = 26;
_recovered = (boolean) result[1];
;
RDebugUtils.currentLine=60686359;
 //BA.debugLineNum = 60686359;BA.debugLine="If recovered Then";
if (true) break;

case 26:
//if
this.state = 29;
if (_recovered) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=60686360;
 //BA.debugLineNum = 60686360;BA.debugLine="lastPlaybackWatchdogRecoveryAt = DateTime.Now";
__ref._lastplaybackwatchdogrecoveryat /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=60686361;
 //BA.debugLineNum = 60686361;BA.debugLine="MarkPlaybackWatchdogProgress(ActiveTrackIdForWat";
__ref._markplaybackwatchdogprogress /*String*/ (null,__ref._activetrackidforwatchdog /*String*/ (null),__ref._activeplaybackpositionms /*long*/ (null));
 if (true) break;

case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=60686363;
 //BA.debugLineNum = 60686363;BA.debugLine="Return recovered";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_recovered));return;};
RDebugUtils.currentLine=60686364;
 //BA.debugLineNum = 60686364;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _playbuttonpane_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_click", false))
	 {Debug.delegate(ba, "playbuttonpane_click", null); return;}
ResumableSub_PlayButtonPane_Click rsub = new ResumableSub_PlayButtonPane_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_PlayButtonPane_Click extends BA.ResumableSub {
public ResumableSub_PlayButtonPane_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If playerCode = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._playercode /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="ShowSetupScreen(MessageValue(\"player_required\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_required"));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="If orchestrationState.IsStarted = False And IsPol";

case 4:
//if
this.state = 14;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==parent.__c.False && __ref._ispolicypausestate /*boolean*/ (null)==parent.__c.False && __ref._isuserstoppedstate /*boolean*/ (null)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="If orchestrationState.IsStopping Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="TraceLog(\"возобновление запрет reason=manual_st";
__ref._tracelog /*String*/ (null,"возобновление запрет reason=manual_start state=stopping");
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="If IsPlaybackAllowedByCurrentData = False Then";

case 10:
//if
this.state = 13;
if (__ref._isplaybackallowedbycurrentdata /*boolean*/ (null)==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="PausePlaybackByPolicy(ResolvePlaybackBlockReaso";
__ref._pauseplaybackbypolicy /*String*/ (null,__ref._resolveplaybackblockreason /*String*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ),"server");
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="TraceLog(\"возобновление итог mode=manual_start\")";
__ref._tracelog /*String*/ (null,"возобновление итог mode=manual_start");
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="orchestrationState.EnterStartedState";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enterstartedstate /*String*/ (null);
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="dataPolicyState.ClearPolicyPause";
__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._clearpolicypause /*String*/ (null);
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete (u";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbuttonpane_click"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 20;
return;
case 20:
//C
this.state = 14;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="If CanStopPlaybackNow(True) = False Then Return";

case 14:
//if
this.state = 19;
if (__ref._canstopplaybacknow /*boolean*/ (null,parent.__c.True)==parent.__c.False) { 
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
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="Wait For (StopPlayer) Complete (unused2 As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbuttonpane_click"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _playbuttonpane_mouseclicked(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub PlayButtonPane_MouseClicked (eventData";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="PlayButtonPane_Click";
__ref._playbuttonpane_click /*void*/ (null);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub PlayButtonPane_MouseEntered (eventData";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="UpdatePlayButtonAppearance(True)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub PlayButtonPane_MouseExited (eventData";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public double  _playerleveltofactor(b4j.example.b4xmainpage __ref,double _levelvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playerleveltofactor", false))
	 {return ((Double) Debug.delegate(ba, "playerleveltofactor", new Object[] {_levelvalue}));}
double _normalized = 0;
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Private Sub PlayerLevelToFactor(levelValue As Doub";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Dim normalized As Double = Max(0, Min(1, levelVal";
_normalized = __c.Max(0,__c.Min(1,_levelvalue/(double)100));
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="If normalized <= 0 Then Return 0";
if (_normalized<=0) { 
if (true) return 0;};
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="Return Power(normalized, 0.7)";
if (true) return __c.Power(_normalized,0.7);
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="End Sub";
return 0;
}
public String  _savequeuesnapshotstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savequeuesnapshotstate", false))
	 {return ((String) Debug.delegate(ba, "savequeuesnapshotstate", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub SaveQueueSnapshotState";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="queueBuilder.SaveQueueSnapshotState(playQueue, of";
__ref._queuebuilder /*b4j.example.playbackqueuebuilder*/ ._savequeuesnapshotstate /*String*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._effectivenowticks /*long*/ (null),__ref._storage /*b4j.example.keyvaluestore*/ ,__ref._queuestate /*b4j.example.playbackqueuestate*/ ,__ref._dataresolver /*b4j.example.dataplaybackresolver*/ );
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public int  _resolvestartfadeinms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvestartfadeinms", false))
	 {return ((Integer) Debug.delegate(ba, "resolvestartfadeinms", null));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Private Sub ResolveStartFadeInMs As Int";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="If initialStartFadePending = False Then Return 0";
if (__ref._initialstartfadepending /*boolean*/ ==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then Return";
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="initialStartFadePending = False";
__ref._initialstartfadepending /*boolean*/  = __c.False;
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Return START_FADE_MS";
if (true) return __ref._start_fade_ms /*int*/ ;
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="runtimeState.SetPendingPlay(audioKey, item, fadeI";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._setpendingplay /*String*/ (null,_audiokey,_item,_fadeinms);
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="SetPlaybackFlowState(FLOW_STARTING, \"start_playba";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_starting /*String*/ ,"start_playback:"+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)(""))));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim itemUrl As String = ResolvePlaybackMediaUrl(a";
_itemurl = __ref._resolveplaybackmediaurl /*String*/ (null,_audiokey,_item);
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="If itemUrl = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_itemurl).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="TraceError(\"playback\", \"не удалось запустить тре";
__ref._traceerror /*String*/ (null,"playback","не удалось запустить трек","reason=media_url trackId="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="WriteHealthSnapshot(\"ошибка_playback\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_playback");
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="TraceInfo(\"audio\", \"плеер load\", \"player=\" & Trac";
__ref._traceinfo /*String*/ (null,"audio","плеер load","player="+__ref._traceplayernumber /*String*/ (null,_audiokey)+" type="+__ref._traceitemtype /*String*/ (null,_item)+" id="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="GetAudioByKey(audioKey).LoadUrl(itemUrl, CurrentV";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._loadurl /*String*/ (null,_itemurl,__ref._currentvolume /*double*/ (null,_item));
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="Wait For (WaitForPlaybackActivation(audioKey, ite";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startplaybackwithaudiokey"), __ref._waitforplaybackactivation /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey,_item,__ref._audio_ready_timeout_ms /*int*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_playbackstarted = (boolean) result[1];
;
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="If playbackStarted Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_playbackstarted) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="TraceInfo(\"playback\", \"старт трека\", \"trackId=\"";
__ref._traceinfo /*String*/ (null,"playback","старт трека","trackId="+__ref._tracetrackvalue /*String*/ (null,_item)+" source="+__ref._mediacacheservice /*b4j.example.mediacache*/ ._resolvemediasource /*String*/ (null,_item)+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="WriteHealthSnapshot(\"старт_трека\")";
__ref._writehealthsnapshot /*String*/ (null,"старт_трека");
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="TraceError(\"audio\", \"не удалось запустить трек\",";
__ref._traceerror /*String*/ (null,"audio","не удалось запустить трек","trackId="+__ref._tracetrackvalue /*String*/ (null,_item));
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="WriteHealthSnapshot(\"ошибка_audio\")";
__ref._writehealthsnapshot /*String*/ (null,"ошибка_audio");
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="Return playbackStarted";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_playbackstarted));return;};
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resolveidleuntilmessage(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveidleuntilmessage", false))
	 {return ((String) Debug.delegate(ba, "resolveidleuntilmessage", null));}
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _nextslot = null;
String _nexttime = "";
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub ResolveIdleUntilMessage As String";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveCurr";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="If IsIdleSlot(currentSlot) = False Then Return \"\"";
if (__ref._isidleslot /*boolean*/ (null,_currentslot)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim nextSlot As Map = dataResolver.ResolveNextDat";
_nextslot = new anywheresoftware.b4a.objects.collections.Map();
_nextslot = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._resolvenextdataslotatticks /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._effectivenowticks /*long*/ (null));
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Dim nextTime As String = nextSlot.GetDefault(\"slo";
_nexttime = BA.ObjectToString(_nextslot.GetDefault((Object)("slot_time"),(Object)("")));
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="If nextTime = \"\" Then Return MessageValue(\"idle\")";
if ((_nexttime).equals("")) { 
if (true) return __ref._messagevalue /*String*/ (null,"idle");};
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="Return MessageValue(\"idle_until\").Replace(\"{time}";
if (true) return __ref._messagevalue /*String*/ (null,"idle_until").replace("{time}",_nexttime);
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Wait For (facade.PrepareNextPlayable) Complete (p";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "preparenextplayable"), __ref._facade /*b4j.example.playbackfacade*/ ._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Return prepared";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_prepared));return;};
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub ScanLocalAdsForTimestamp(targetMinuteT";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim allowRegularAds As Boolean = AllowRegularAdsA";
_allowregularads = __ref._allowregularadsattargetminute /*boolean*/ (null,_targetminutetimestamp);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="If localAdScheduler.ScanTargetMinute(offlineData,";
if (__ref._localadscheduler /*b4j.example.adscheduler*/ ._scantargetminute /*boolean*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,_targetminutetimestamp,_force,_allowregularads)) { 
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="PruneQueuedBreakItemsByLocalCache";
__ref._prunequeuedbreakitemsbylocalcache /*String*/ (null);
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub PruneQueuedBreakItemsByLocalCache";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If playQueue.IsInitialized = False Or playQueue.S";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False || __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Dim changed As Boolean = False";
_changed = __c.False;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="For i = playQueue.Size - 1 To 0 Step -1";
{
final int step3 = -1;
final int limit3 = (int) (0);
_i = (int) (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Dim itemObject As Object = playQueue.Get(i)";
_itemobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i);
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="If (itemObject Is Map) = False Then Continue";
if ((_itemobject instanceof java.util.Map)==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Dim item As Map = itemObject";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobject));
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"break\" Then C";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) == false) { 
if (true) continue;};
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Dim breakItems As List = item.GetDefault(\"items\"";
_breakitems = new anywheresoftware.b4a.objects.collections.List();
_breakitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="If breakItems.IsInitialized = False Or breakItem";
if (_breakitems.IsInitialized()==__c.False || _breakitems.getSize()==0) { 
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="changed = True";
_changed = __c.True;
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="Dim filteredItems As List";
_filtereditems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="filteredItems.Initialize";
_filtereditems.Initialize();
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="For Each breakItemObject As Object In breakItems";
{
final anywheresoftware.b4a.BA.IterableList group16 = _breakitems;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_breakitemobject = group16.Get(index16);
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="If breakItemObject Is Map Then";
if (_breakitemobject instanceof java.util.Map) { 
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="Dim breakItem As Map = breakItemObject";
_breakitem = new anywheresoftware.b4a.objects.collections.Map();
_breakitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_breakitemobject));
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="If breakItem.GetDefault(\"type\", \"\") = \"ad\" The";
if ((_breakitem.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="If mediaCacheService.HasValidatedLocalMedia(b";
if (__ref._mediacacheservice /*b4j.example.mediacache*/ ._hasvalidatedlocalmedia /*boolean*/ (null,_breakitem)==__c.False) { 
if (true) continue;};
 };
RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="filteredItems.Add(breakItem)";
_filtereditems.Add((Object)(_breakitem.getObject()));
 };
 }
};
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="If filteredItems.Size = 0 Then";
if (_filtereditems.getSize()==0) { 
RDebugUtils.currentLine=8323098;
 //BA.debugLineNum = 8323098;BA.debugLine="TraceLog(\"брейк очередь drop reason=no_cached_a";
__ref._tracelog /*String*/ (null,"брейк очередь drop reason=no_cached_ads");
RDebugUtils.currentLine=8323099;
 //BA.debugLineNum = 8323099;BA.debugLine="playQueue.RemoveAt(i)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=8323100;
 //BA.debugLineNum = 8323100;BA.debugLine="changed = True";
_changed = __c.True;
 }else 
{RDebugUtils.currentLine=8323101;
 //BA.debugLineNum = 8323101;BA.debugLine="Else If filteredItems.Size <> breakItems.Size Th";
if (_filtereditems.getSize()!=_breakitems.getSize()) { 
RDebugUtils.currentLine=8323102;
 //BA.debugLineNum = 8323102;BA.debugLine="item.Put(\"items\", filteredItems)";
_item.Put((Object)("items"),(Object)(_filtereditems.getObject()));
RDebugUtils.currentLine=8323103;
 //BA.debugLineNum = 8323103;BA.debugLine="item.Put(\"items_count\", filteredItems.Size)";
_item.Put((Object)("items_count"),(Object)(_filtereditems.getSize()));
RDebugUtils.currentLine=8323104;
 //BA.debugLineNum = 8323104;BA.debugLine="playQueue.Set(i, item)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_item.getObject()));
RDebugUtils.currentLine=8323105;
 //BA.debugLineNum = 8323105;BA.debugLine="changed = True";
_changed = __c.True;
 }}
;
 }
};
RDebugUtils.currentLine=8323108;
 //BA.debugLineNum = 8323108;BA.debugLine="If changed Then ResolveScheduledBreakAt";
if (_changed) { 
__ref._resolvescheduledbreakat /*String*/ (null);};
RDebugUtils.currentLine=8323109;
 //BA.debugLineNum = 8323109;BA.debugLine="End Sub";
return "";
}
public String  _resolvescheduledbreakat(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvescheduledbreakat", false))
	 {return ((String) Debug.delegate(ba, "resolvescheduledbreakat", null));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub ResolveScheduledBreakAt";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="queueState.ResolveScheduledBreakAt(playQueue)";
__ref._queuestate /*b4j.example.playbackqueuestate*/ ._resolvescheduledbreakat /*String*/ (null,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="TraceLog(\"брейк exact sync value=\" & queueState.S";
__ref._tracelog /*String*/ (null,"брейк exact sync value="+BA.NumberToString(__ref._queuestate /*b4j.example.playbackqueuestate*/ ._scheduledbreakat /*long*/ )+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _queuebuilder_ensuresingleplaylistmetadata(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "queuebuilder_ensuresingleplaylistmetadata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "queuebuilder_ensuresingleplaylistmetadata", new Object[] {_descriptor}));}
ResumableSub_QueueBuilder_EnsureSinglePlaylistMetadata rsub = new ResumableSub_QueueBuilder_EnsureSinglePlaylistMetadata(this,__ref,_descriptor);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_QueueBuilder_EnsureSinglePlaylistMetadata extends BA.ResumableSub {
public ResumableSub_QueueBuilder_EnsureSinglePlaylistMetadata(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _descriptor) {
this.parent = parent;
this.__ref = __ref;
this._descriptor = _descriptor;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _descriptor;
boolean _downloaded = false;

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
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="Wait For (EnsureSinglePlaylistMetadata(descriptor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "queuebuilder_ensuresingleplaylistmetadata"), __ref._ensuresingleplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descriptor));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="Return downloaded";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloaded));return;};
RDebugUtils.currentLine=50659331;
 //BA.debugLineNum = 50659331;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _queuebuilder_refreshofflinedatanow(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "queuebuilder_refreshofflinedatanow", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "queuebuilder_refreshofflinedatanow", null));}
ResumableSub_QueueBuilder_RefreshOfflineDataNow rsub = new ResumableSub_QueueBuilder_RefreshOfflineDataNow(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_QueueBuilder_RefreshOfflineDataNow extends BA.ResumableSub {
public ResumableSub_QueueBuilder_RefreshOfflineDataNow(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
this.state = -1;
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refres";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "queuebuilder_refreshofflinedatanow"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="Return refreshed";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_refreshed));return;};
RDebugUtils.currentLine=50593795;
 //BA.debugLineNum = 50593795;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _recoverfromplaybackstall(b4j.example.b4xmainpage __ref,String _trackid,long _positionms) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "recoverfromplaybackstall", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "recoverfromplaybackstall", new Object[] {_trackid,_positionms}));}
ResumableSub_RecoverFromPlaybackStall rsub = new ResumableSub_RecoverFromPlaybackStall(this,__ref,_trackid,_positionms);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RecoverFromPlaybackStall extends BA.ResumableSub {
public ResumableSub_RecoverFromPlaybackStall(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,String _trackid,long _positionms) {
this.parent = parent;
this.__ref = __ref;
this._trackid = _trackid;
this._positionms = _positionms;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
String _trackid;
long _positionms;
long _nowticks = 0L;
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
RDebugUtils.currentLine=60751873;
 //BA.debugLineNum = 60751873;BA.debugLine="Dim nowTicks As Long = DateTime.Now";
_nowticks = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=60751874;
 //BA.debugLineNum = 60751874;BA.debugLine="If nowTicks - lastPlaybackWatchdogRecoveryAt < PL";
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
RDebugUtils.currentLine=60751875;
 //BA.debugLineNum = 60751875;BA.debugLine="lastPlaybackWatchdogRecoveryAt = nowTicks";
__ref._lastplaybackwatchdogrecoveryat /*long*/  = _nowticks;
RDebugUtils.currentLine=60751876;
 //BA.debugLineNum = 60751876;BA.debugLine="TraceWarn(\"playback\", \"watchdog stall\", \"trackId=";
__ref._tracewarn /*String*/ (null,"playback","watchdog stall","trackId="+_trackid+" posMs="+BA.NumberToString(_positionms)+" stage="+__ref._playbackflowstate /*String*/ +" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=60751877;
 //BA.debugLineNum = 60751877;BA.debugLine="If runtimeState.ActiveAudioKey <> \"\" Then GetAudi";
if (true) break;

case 7:
//if
this.state = 12;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals("") == false) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ )._reset /*String*/ (null);
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=60751878;
 //BA.debugLineNum = 60751878;BA.debugLine="If runtimeState.PreparedAudioKey <> \"\" And runtim";
if (true) break;

case 13:
//if
this.state = 16;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ ).equals("") == false && (__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ ).equals(__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ) == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60751879;
 //BA.debugLineNum = 60751879;BA.debugLine="GetAudioByKey(runtimeState.PreparedAudioKey).Res";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ )._reset /*String*/ (null);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=60751881;
 //BA.debugLineNum = 60751881;BA.debugLine="runtimeState.ActiveAudioKey = \"\"";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=60751882;
 //BA.debugLineNum = 60751882;BA.debugLine="runtimeState.ActiveItem.Initialize";
__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=60751883;
 //BA.debugLineNum = 60751883;BA.debugLine="metaState.Reset";
__ref._metastate /*b4j.example.playbackmetastate*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=60751884;
 //BA.debugLineNum = 60751884;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=60751885;
 //BA.debugLineNum = 60751885;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=60751886;
 //BA.debugLineNum = 60751886;BA.debugLine="orchestrationState.ClearTrackTransitionFlags";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._cleartracktransitionflags /*String*/ (null);
RDebugUtils.currentLine=60751887;
 //BA.debugLineNum = 60751887;BA.debugLine="orchestrationState.EndDispatch";
__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._enddispatch /*String*/ (null);
RDebugUtils.currentLine=60751888;
 //BA.debugLineNum = 60751888;BA.debugLine="retryFallbackState.ClearDispatchRetryAfter";
__ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._cleardispatchretryafter /*String*/ (null);
RDebugUtils.currentLine=60751889;
 //BA.debugLineNum = 60751889;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=60751890;
 //BA.debugLineNum = 60751890;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=60751891;
 //BA.debugLineNum = 60751891;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=60751892;
 //BA.debugLineNum = 60751892;BA.debugLine="If playbackFlowState <> FLOW_STOPPING And playbac";
if (true) break;

case 17:
//if
this.state = 20;
if ((__ref._playbackflowstate /*String*/ ).equals(__ref._flow_stopping /*String*/ ) == false && (__ref._playbackflowstate /*String*/ ).equals(__ref._flow_paused_policy /*String*/ ) == false) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=60751893;
 //BA.debugLineNum = 60751893;BA.debugLine="SetPlaybackFlowState(FLOW_IDLE, \"watchdog_stall\"";
__ref._setplaybackflowstate /*String*/ (null,__ref._flow_idle /*String*/ ,"watchdog_stall");
 if (true) break;
;
RDebugUtils.currentLine=60751895;
 //BA.debugLineNum = 60751895;BA.debugLine="If playQueue.Size = 0 Then";

case 20:
//if
this.state = 27;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=60751896;
 //BA.debugLineNum = 60751896;BA.debugLine="Wait For (PopulatePlaybackQueue) Complete (queue";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "recoverfromplaybackstall"), __ref._populateplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 32;
return;
case 32:
//C
this.state = 23;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=60751897;
 //BA.debugLineNum = 60751897;BA.debugLine="If queuePrepared = False And playQueue.Size = 0";
if (true) break;

case 23:
//if
this.state = 26;
if (_queueprepared==parent.__c.False && __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=60751898;
 //BA.debugLineNum = 60751898;BA.debugLine="TraceWarn(\"playback\", \"watchdog recovery\", \"ste";
__ref._tracewarn /*String*/ (null,"playback","watchdog recovery","step=populate_failed");
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=60751901;
 //BA.debugLineNum = 60751901;BA.debugLine="Wait For (DispatchPlaybackAdvance(\"watchdog_stall";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "recoverfromplaybackstall"), __ref._dispatchplaybackadvance /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"watchdog_stall",parent.__c.True));
this.state = 33;
return;
case 33:
//C
this.state = 28;
_dispatched = (boolean) result[1];
;
RDebugUtils.currentLine=60751902;
 //BA.debugLineNum = 60751902;BA.debugLine="If dispatched Then";
if (true) break;

case 28:
//if
this.state = 31;
if (_dispatched) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=60751903;
 //BA.debugLineNum = 60751903;BA.debugLine="TraceInfo(\"playback\", \"watchdog recovery\", \"resu";
__ref._traceinfo /*String*/ (null,"playback","watchdog recovery","result=dispatch queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=60751904;
 //BA.debugLineNum = 60751904;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=60751906;
 //BA.debugLineNum = 60751906;BA.debugLine="Wait For (LoadNextAndPlay) Complete (advanced As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "recoverfromplaybackstall"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 34;
return;
case 34:
//C
this.state = -1;
_advanced = (boolean) result[1];
;
RDebugUtils.currentLine=60751907;
 //BA.debugLineNum = 60751907;BA.debugLine="TraceInfo(\"playback\", \"watchdog recovery\", \"resul";
__ref._traceinfo /*String*/ (null,"playback","watchdog recovery","result="+BA.ObjectToString(((_advanced) ? ((Object)("restart")) : ((Object)("failed"))))+" queue="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=60751908;
 //BA.debugLineNum = 60751908;BA.debugLine="Return advanced";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_advanced));return;};
RDebugUtils.currentLine=60751909;
 //BA.debugLineNum = 60751909;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _updatetrustedonlinetimefromdata(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimefromdata", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimefromdata", new Object[] {_data}));}
long _candidateticks = 0L;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub UpdateTrustedOnlineTimeFromData(data A";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim candidateTicks As Long = ParseTrustedOnlineTi";
_candidateticks = __ref._parsetrustedonlineticks /*long*/ (null,_data);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="If candidateTicks <= 0 Then candidateTicks = Date";
if (_candidateticks<=0) { 
_candidateticks = __c.DateTime.getNow();};
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="UpdateTrustedOnlineTimeTicks(candidateTicks)";
__ref._updatetrustedonlinetimeticks /*String*/ (null,_candidateticks);
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Dim playlistDescriptors As List = offlineStoreSer";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="If playlistDescriptors.IsInitialized = False Or p";
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
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="TraceLog(\"метаданные плейлистов sync skip reason";
__ref._tracelog /*String*/ (null,"метаданные плейлистов sync skip reason=nothing_to_sync");
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="EnsureDirectory(offlineStoreService.GetOfflinePla";
__ref._ensuredirectory /*String*/ (null,__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Dim cachedPlaylistIndex As Map = offlineStoreServ";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getcachedplaylistindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="Dim updatedCount As Int = 0";
_updatedcount = (int) (0);
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="For Each descriptorObject As Object In playlistDe";
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
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="If descriptorObject Is Map Then";
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
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="Dim syncAction As String = offlineStoreService.";
_syncaction = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._resolveplaylistsyncaction /*String*/ (null,_descriptor,_cachedplaylistindex);
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="If syncAction = \"skip\" Then Continue";
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
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="Wait For (DownloadOfflinePlaylistMetadata(descr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "syncofflineplaylistmetadata"), __ref._downloadofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descriptor,_cachedplaylistindex));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="If downloaded Then";
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
RDebugUtils.currentLine=17563666;
 //BA.debugLineNum = 17563666;BA.debugLine="If syncAction = \"missing\" Then";
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
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="updatedCount = updatedCount + 1";
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
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="failedCount = failedCount + 1";
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
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="offlineStoreService.SaveCachedPlaylistIndex(cache";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._savecachedplaylistindex /*String*/ (null,_cachedplaylistindex);
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="offlineStoreService.RefreshPlaylistCacheStatus(pl";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._refreshplaylistcachestatus /*String*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=17563678;
 //BA.debugLineNum = 17563678;BA.debugLine="InvalidateRelevantTrackIdsCache";
__ref._invalidaterelevanttrackidscache /*String*/ (null);
RDebugUtils.currentLine=17563679;
 //BA.debugLineNum = 17563679;BA.debugLine="Dim actualCount As Int = storage.GetDefault(\"play";
_actualcount = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"playlist_actual_count",(Object)(0))));
RDebugUtils.currentLine=17563680;
 //BA.debugLineNum = 17563680;BA.debugLine="TraceLog(\"метаданные плейлистов sync итог downloa";
__ref._tracelog /*String*/ (null,"метаданные плейлистов sync итог downloaded="+BA.NumberToString(_downloadedcount)+" updated="+BA.NumberToString(_updatedcount)+" failed="+BA.NumberToString(_failedcount)+" actual="+BA.NumberToString(_actualcount));
RDebugUtils.currentLine=17563681;
 //BA.debugLineNum = 17563681;BA.debugLine="Return failedCount = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_failedcount==0));return;};
RDebugUtils.currentLine=17563682;
 //BA.debugLineNum = 17563682;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Wait For (facade.ResumePlaybackAfterPolicyPause)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "resumeplaybackafterpolicypause"), __ref._facade /*b4j.example.playbackfacade*/ ._resumeplaybackafterpolicypause /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refreshplayerheaderfromcurrentdata(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "refreshplayerheaderfromcurrentdata", false))
	 {return ((String) Debug.delegate(ba, "refreshplayerheaderfromcurrentdata", null));}
String _safecode = "";
String _title = "";
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub RefreshPlayerHeaderFromCurrentData";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim safeCode As String = playerCode";
_safecode = __ref._playercode /*String*/ ;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim title As String = \"\"";
_title = "";
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="If offlineData.IsInitialized Then";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("player"),__c.Null)));
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="If playerData.IsInitialized Then";
if (_playerdata.IsInitialized()) { 
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="safeCode = playerData.GetDefault(\"code\", safeCo";
_safecode = BA.ObjectToString(_playerdata.GetDefault((Object)("code"),(Object)(_safecode)));
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="title = playerData.GetDefault(\"title\", \"\")";
_title = BA.ObjectToString(_playerdata.GetDefault((Object)("title"),(Object)("")));
 };
 };
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="RenderPlayerHead(safeCode, title)";
__ref._renderplayerhead /*String*/ (null,_safecode,_title);
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="End Sub";
return "";
}
public String  _renderplayerhead(b4j.example.b4xmainpage __ref,String _code,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "renderplayerhead", false))
	 {return ((String) Debug.delegate(ba, "renderplayerhead", new Object[] {_code,_title}));}
String _safecode = "";
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub RenderPlayerHead(code As String, title";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim safeCode As String = FormatPlayerCodeForDispl";
_safecode = __ref._formatplayercodefordisplay /*String*/ (null,_code);
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="lblHeader.Text = safeCode & \" • \" & title.ToUppe";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_safecode+" • "+_title.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="lblHeader.Text = safeCode";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_safecode);
 };
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="End Sub";
return "";
}
public String  _resolvecurrenttracktracevalue(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvecurrenttracktracevalue", false))
	 {return ((String) Debug.delegate(ba, "resolvecurrenttracktracevalue", null));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Private Sub ResolveCurrentTrackTraceValue As Strin";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="If runtimeState.ActiveItem.IsInitialized = False";
if (__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="Return TraceTrackValue(runtimeState.ActiveItem)";
if (true) return __ref._tracetrackvalue /*String*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=59113475;
 //BA.debugLineNum = 59113475;BA.debugLine="End Sub";
return "";
}
public String  _resolveerrormessage(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _result,String _fallback) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveerrormessage", false))
	 {return ((String) Debug.delegate(ba, "resolveerrormessage", new Object[] {_result,_fallback}));}
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _errormessage = "";
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub ResolveErrorMessage(result As Map, fal";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="If resultData Is Map Then";
if (_resultdata instanceof java.util.Map) { 
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="Dim m As Map = resultData";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="If m.GetDefault(\"message\", \"\") <> \"\" Then Retur";
if ((_m.GetDefault((Object)("message"),(Object)(""))).equals((Object)("")) == false) { 
if (true) return BA.ObjectToString(_m.Get((Object)("message")));};
 };
 };
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="Dim errorMessage As String = result.GetDefault(\"E";
_errormessage = BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)("")));
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="If errorMessage <> \"\" Then Return errorMessage";
if ((_errormessage).equals("") == false) { 
if (true) return _errormessage;};
RDebugUtils.currentLine=16252938;
 //BA.debugLineNum = 16252938;BA.debugLine="Return fallback";
if (true) return _fallback;
RDebugUtils.currentLine=16252939;
 //BA.debugLineNum = 16252939;BA.debugLine="End Sub";
return "";
}
public String  _resolvefreediskmbtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvefreediskmbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvefreediskmbtext", null));}
anywheresoftware.b4j.object.JavaObject _fileobject = null;
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Private Sub ResolveFreeDiskMbText As String";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="Try";
try {RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="Dim fileObject As JavaObject";
_fileobject = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="fileObject.InitializeNewInstance(\"java.io.File\",";
_fileobject.InitializeNewInstance("java.io.File",new Object[]{(Object)(__ref._storagedir /*String*/ )});
RDebugUtils.currentLine=59244548;
 //BA.debugLineNum = 59244548;BA.debugLine="Return \"\" & Floor(fileObject.RunMethod(\"getUsabl";
if (true) return ""+BA.NumberToString(__c.Floor((double)(BA.ObjectToNumber(_fileobject.RunMethod("getUsableSpace",(Object[])(__c.Null))))/(double)1024/(double)1024));
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=59244550;
 //BA.debugLineNum = 59244550;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
RDebugUtils.currentLine=59244552;
 //BA.debugLineNum = 59244552;BA.debugLine="End Sub";
return "";
}
public String  _resolvefreerammbtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvefreerammbtext", false))
	 {return ((String) Debug.delegate(ba, "resolvefreerammbtext", null));}
anywheresoftware.b4j.object.JavaObject _runtime = null;
anywheresoftware.b4j.object.JavaObject _currentruntime = null;
long _freebytes = 0L;
long _totalbytes = 0L;
long _maxbytes = 0L;
long _availablebytes = 0L;
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Private Sub ResolveFreeRamMbText As String";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="Try";
try {RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="Dim runtime As JavaObject";
_runtime = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=59179011;
 //BA.debugLineNum = 59179011;BA.debugLine="runtime.InitializeStatic(\"java.lang.Runtime\")";
_runtime.InitializeStatic("java.lang.Runtime");
RDebugUtils.currentLine=59179012;
 //BA.debugLineNum = 59179012;BA.debugLine="Dim currentRuntime As JavaObject = runtime.RunMe";
_currentruntime = new anywheresoftware.b4j.object.JavaObject();
_currentruntime = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_runtime.RunMethod("getRuntime",(Object[])(__c.Null))));
RDebugUtils.currentLine=59179013;
 //BA.debugLineNum = 59179013;BA.debugLine="Dim freeBytes As Long = currentRuntime.RunMethod";
_freebytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("freeMemory",(Object[])(__c.Null)));
RDebugUtils.currentLine=59179014;
 //BA.debugLineNum = 59179014;BA.debugLine="Dim totalBytes As Long = currentRuntime.RunMetho";
_totalbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("totalMemory",(Object[])(__c.Null)));
RDebugUtils.currentLine=59179015;
 //BA.debugLineNum = 59179015;BA.debugLine="Dim maxBytes As Long = currentRuntime.RunMethod(";
_maxbytes = BA.ObjectToLongNumber(_currentruntime.RunMethod("maxMemory",(Object[])(__c.Null)));
RDebugUtils.currentLine=59179016;
 //BA.debugLineNum = 59179016;BA.debugLine="Dim availableBytes As Long = freeBytes + Max(0,";
_availablebytes = (long) (_freebytes+__c.Max(0,_maxbytes-_totalbytes));
RDebugUtils.currentLine=59179017;
 //BA.debugLineNum = 59179017;BA.debugLine="Return \"\" & Floor(availableBytes / 1024 / 1024)";
if (true) return ""+BA.NumberToString(__c.Floor(_availablebytes/(double)1024/(double)1024));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=59179019;
 //BA.debugLineNum = 59179019;BA.debugLine="Return \"unknown\"";
if (true) return "unknown";
 };
RDebugUtils.currentLine=59179021;
 //BA.debugLineNum = 59179021;BA.debugLine="End Sub";
return "";
}
public double  _resolveplayerlevelfactor(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplayerlevelfactor", false))
	 {return ((Double) Debug.delegate(ba, "resolveplayerlevelfactor", null));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
double _playerlevel = 0;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub ResolvePlayerLevelFactor As Double";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"p";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Dim playerLevel As Double = playerData.GetDefault";
_playerlevel = (double)(BA.ObjectToNumber(_playerdata.GetDefault((Object)("level"),(Object)(100))));
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Return PlayerLevelToFactor(playerLevel)";
if (true) return __ref._playerleveltofactor /*double*/ (null,_playerlevel);
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="End Sub";
return 0;
}
public int  _resolveretrydelay(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub ResolveRetryDelay(mode As String, dela";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Return retryFallbackState.ResolveRetryDelay(mode,";
if (true) return __ref._retryfallbackstate /*b4j.example.playbackretryfallbackstate*/ ._resolveretrydelay /*int*/ (null,_mode,_delayms,__ref._local_retry_delay_max /*int*/ ,__ref._server_retry_delay_max /*int*/ ,__ref._blocked_retry_delay /*int*/ );
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return 0;
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
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="If orchestrationState.IsStarted = False Or orches";
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
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="If dataPolicyState.IsPlaybackPausedByPolicy Then";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._datapolicystate /*b4j.example.playbackdatapolicystate*/ ._isplaybackpausedbypolicy /*boolean*/ ) { 
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
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "retrytimer_tick"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub RunDeferredPostStartTasks";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If isAdWarmupDeferredAfterStartup = False And isP";
if (__ref._isadwarmupdeferredafterstartup /*boolean*/ ==__c.False && __ref._ispoststarttasksdeferredafterstartup /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If CanRunDeferredPostStartTasks = False Then";
if (__ref._canrundeferredpoststarttasks /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="CancelDeferredPostStartTasks";
__ref._canceldeferredpoststarttasks /*String*/ (null);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="If isAdWarmupDeferredAfterStartup Then";
if (__ref._isadwarmupdeferredafterstartup /*boolean*/ ) { 
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="isAdWarmupDeferredAfterStartup = False";
__ref._isadwarmupdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="EnsureAdCacheSyncAsync";
__ref._ensureadcachesyncasync /*void*/ (null);
 };
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="If isPostStartTasksDeferredAfterStartup Then";
if (__ref._ispoststarttasksdeferredafterstartup /*boolean*/ ) { 
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="isPostStartTasksDeferredAfterStartup = False";
__ref._ispoststarttasksdeferredafterstartup /*boolean*/  = __c.False;
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="BackfillPlaybackQueueAsync";
__ref._backfillplaybackqueueasync /*void*/ (null);
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="ScheduleTrackCacheWarmup";
__ref._scheduletrackcachewarmup /*String*/ (null);
 };
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="End Sub";
return "";
}
public boolean  _shouldwatchplaybackprogress(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shouldwatchplaybackprogress", false))
	 {return ((Boolean) Debug.delegate(ba, "shouldwatchplaybackprogress", null));}
RDebugUtils.currentLine=60489728;
 //BA.debugLineNum = 60489728;BA.debugLine="Private Sub ShouldWatchPlaybackProgress As Boolean";
RDebugUtils.currentLine=60489729;
 //BA.debugLineNum = 60489729;BA.debugLine="If orchestrationState.IsStarted = False Then Retu";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstarted /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=60489730;
 //BA.debugLineNum = 60489730;BA.debugLine="If orchestrationState.IsStoppedByUser Then Return";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstoppedbyuser /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=60489731;
 //BA.debugLineNum = 60489731;BA.debugLine="If orchestrationState.IsStopping Then Return Fals";
if (__ref._orchestrationstate /*b4j.example.playbackorchestrationstate*/ ._isstopping /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=60489732;
 //BA.debugLineNum = 60489732;BA.debugLine="If IsPolicyPauseState Then Return False";
if (__ref._ispolicypausestate /*boolean*/ (null)) { 
if (true) return __c.False;};
RDebugUtils.currentLine=60489733;
 //BA.debugLineNum = 60489733;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=60489734;
 //BA.debugLineNum = 60489734;BA.debugLine="End Sub";
return false;
}
public String  _schedulebreakwatch(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulebreakwatch", false))
	 {return ((String) Debug.delegate(ba, "schedulebreakwatch", null));}
long _delay = 0L;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub ScheduleBreakWatch";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="If HasPendingExactBreak = False Then Return";
if (__ref._haspendingexactbreak /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Dim delay As Long = Max(1, ((queueState.Scheduled";
_delay = (long) (__c.Max(1,((__ref._queuestate /*b4j.example.playbackqueuestate*/ ._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000)-250));
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="breakTimer.Interval = delay";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval(_delay);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="breakTimer.Enabled = True";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="End Sub";
return "";
}
public String  _setlabelstyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setlabelstyle", false))
	 {return ((String) Debug.delegate(ba, "setlabelstyle", new Object[] {_view,_style}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub SetLabelStyle(view As B4XView, style A";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="UiStyle.SetLabelStyle(view, style)";
_uistyle._setlabelstyle /*String*/ (_view,_style);
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
return "";
}
public String  _stoporbitanimation(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stoporbitanimation", false))
	 {return ((String) Debug.delegate(ba, "stoporbitanimation", null));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub StopOrbitAnimation";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="orbitFadeTarget = 0";
__ref._orbitfadetarget /*double*/  = 0;
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="If orbitFadeValue > 0 Then";
if (__ref._orbitfadevalue /*double*/ >0) { 
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="orbitTimer.Enabled = False";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="ApplyOrbitFrame(0)";
__ref._applyorbitframe /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="End Sub";
return "";
}
public String  _startorbitanimation(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startorbitanimation", false))
	 {return ((String) Debug.delegate(ba, "startorbitanimation", null));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub StartOrbitAnimation";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="orbitPulseStep = 0";
__ref._orbitpulsestep /*int*/  = (int) (0);
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="orbitFadeTarget = 1";
__ref._orbitfadetarget /*double*/  = 1;
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showadmeta", false))
	 {return ((String) Debug.delegate(ba, "showadmeta", new Object[] {_item}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub ShowAdMeta(item As Map)";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
__ref._setstatustext /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showtrackmeta", false))
	 {return ((String) Debug.delegate(ba, "showtrackmeta", new Object[] {_item}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub ShowTrackMeta(item As Map)";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("set")));};
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("code")));};
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
__ref._setstatustext /*String*/ (null,__ref._joinlist /*String*/ (null,_parts," • "));
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="Do While DateTime.Now - startedAt < timeoutMs";
if (true) break;

case 1:
//do while
this.state = 8;
while (parent.__c.DateTime.getNow()-_startedat<_timeoutms) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60162051;
 //BA.debugLineNum = 60162051;BA.debugLine="If runtimeState.PendingPlayAudioKey = \"\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ ).equals("")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60162052;
 //BA.debugLineNum = 60162052;BA.debugLine="Return runtimeState.ActiveAudioKey = audioKey A";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ ).equals(_audiokey) && __ref._itemsmatch /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ ,_item)));return;};
 if (true) break;

case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=60162054;
 //BA.debugLineNum = 60162054;BA.debugLine="Sleep(25)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "waitforplaybackactivation"),(int) (25));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=60162056;
 //BA.debugLineNum = 60162056;BA.debugLine="TraceWarn(\"audio\", \"таймаут старта трека\", \"audio";
__ref._tracewarn /*String*/ (null,"audio","таймаут старта трека","audio="+_audiokey+" trackId="+__ref._tracetrackvalue /*String*/ (null,_item)+" pendingPlayAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingplayaudiokey /*String*/ +" activeAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._activeaudiokey /*String*/ );
RDebugUtils.currentLine=60162057;
 //BA.debugLineNum = 60162057;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=60162058;
 //BA.debugLineNum = 60162058;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tracestate(b4j.example.b4xmainpage __ref,String _category,String _message,String _details) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracestate", false))
	 {return ((String) Debug.delegate(ba, "tracestate", new Object[] {_category,_message,_details}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Private Sub TraceState(category As String, message";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="WriteTraceEntry(\"STATE\", category, message, detai";
__ref._writetraceentry /*String*/ (null,"STATE",_category,_message,_details);
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="End Sub";
return "";
}
public void  _traceuploadtimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "traceuploadtimer_tick", false))
	 {Debug.delegate(ba, "traceuploadtimer_tick", null); return;}
ResumableSub_TraceUploadTimer_Tick rsub = new ResumableSub_TraceUploadTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_TraceUploadTimer_Tick extends BA.ResumableSub {
public ResumableSub_TraceUploadTimer_Tick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="If playerCode = \"\" Or deviceId = \"\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._playercode /*String*/ ).equals("") || (__ref._deviceid /*String*/ ).equals("")) { 
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
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="If isTraceUploadInProgress Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._istraceuploadinprogress /*boolean*/ ) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="WriteHealthSnapshot(\"таймер\")";
__ref._writehealthsnapshot /*String*/ (null,"таймер");
RDebugUtils.currentLine=57737220;
 //BA.debugLineNum = 57737220;BA.debugLine="If IsTraceUploadEnabled = False Then Return";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._istraceuploadenabled /*boolean*/ (null)==parent.__c.False) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=57737221;
 //BA.debugLineNum = 57737221;BA.debugLine="Wait For (FlushTraceBuffer) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "traceuploadtimer_tick"), __ref._flushtracebuffer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=57737222;
 //BA.debugLineNum = 57737222;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _trackcachewarmuptimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "trackcachewarmuptimer_tick", false))
	 {return ((String) Debug.delegate(ba, "trackcachewarmuptimer_tick", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub TrackCacheWarmupTimer_Tick";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="trackCacheWarmupTimer.Enabled = False";
__ref._trackcachewarmuptimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="EnsureUpcomingTracksCachedAsync";
__ref._ensureupcomingtrackscachedasync /*void*/ (null);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return "";
}
public String  _transition_activateloadeditem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_activateloadeditem", false))
	 {return ((String) Debug.delegate(ba, "transition_activateloadeditem", new Object[] {_args}));}
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Public Sub Transition_ActivateLoadedItem(args As M";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="ActivateLoadedItem(args.GetDefault(\"audioKey\", \"\"";
__ref._activateloadeditem /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item")))),(int)(BA.ObjectToNumber(_args.GetDefault((Object)("fadeInMs"),(Object)(0)))));
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="End Sub";
return "";
}
public String  _transition_clearpreparedstate(b4j.example.b4xmainpage __ref,boolean _resetplayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_clearpreparedstate", false))
	 {return ((String) Debug.delegate(ba, "transition_clearpreparedstate", new Object[] {_resetplayer}));}
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Public Sub Transition_ClearPreparedState(resetPlay";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="ClearPreparedState(resetPlayer)";
__ref._clearpreparedstate /*String*/ (null,_resetplayer);
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="End Sub";
return "";
}
public String  _transition_consumepreparedqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_consumepreparedqueueitem", false))
	 {return ((String) Debug.delegate(ba, "transition_consumepreparedqueueitem", null));}
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Public Sub Transition_ConsumePreparedQueueItem";
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="ConsumePreparedQueueItem";
__ref._consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="End Sub";
return "";
}
public double  _transition_currentvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_currentvolume", false))
	 {return ((Double) Debug.delegate(ba, "transition_currentvolume", new Object[] {_item}));}
RDebugUtils.currentLine=51838976;
 //BA.debugLineNum = 51838976;BA.debugLine="Public Sub Transition_CurrentVolume(item As Map) A";
RDebugUtils.currentLine=51838977;
 //BA.debugLineNum = 51838977;BA.debugLine="Return CurrentVolume(item)";
if (true) return __ref._currentvolume /*double*/ (null,_item);
RDebugUtils.currentLine=51838978;
 //BA.debugLineNum = 51838978;BA.debugLine="End Sub";
return 0;
}
public String  _transition_describeitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_describeitem", false))
	 {return ((String) Debug.delegate(ba, "transition_describeitem", new Object[] {_item}));}
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Public Sub Transition_DescribeItem(item As Map) As";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="Return DescribeItem(item)";
if (true) return __ref._describeitem /*String*/ (null,(Object)(_item.getObject()));
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="End Sub";
return "";
}
public b4j.example.audioplayer  _transition_getaudiobykey(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_getaudiobykey", false))
	 {return ((b4j.example.audioplayer) Debug.delegate(ba, "transition_getaudiobykey", new Object[] {_audiokey}));}
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Public Sub Transition_GetAudioByKey(audioKey As St";
RDebugUtils.currentLine=51904513;
 //BA.debugLineNum = 51904513;BA.debugLine="Return GetAudioByKey(audioKey)";
if (true) return __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey);
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="End Sub";
return null;
}
public boolean  _transition_itemsmatch(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "transition_itemsmatch", new Object[] {_args}));}
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Public Sub Transition_ItemsMatch(args As Map) As B";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="Return ItemsMatch(args.Get(\"first\"), args.Get(\"se";
if (true) return __ref._itemsmatch /*boolean*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("first")))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("second")))));
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="End Sub";
return false;
}
public String  _transition_resolveplaybackmediaurl(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_resolveplaybackmediaurl", false))
	 {return ((String) Debug.delegate(ba, "transition_resolveplaybackmediaurl", new Object[] {_args}));}
RDebugUtils.currentLine=55836672;
 //BA.debugLineNum = 55836672;BA.debugLine="Public Sub Transition_ResolvePlaybackMediaUrl(args";
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="Return ResolvePlaybackMediaUrl(args.GetDefault(\"a";
if (true) return __ref._resolveplaybackmediaurl /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)(""))),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item")))));
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="End Sub";
return "";
}
public String  _transition_savequeuesnapshotstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_savequeuesnapshotstate", false))
	 {return ((String) Debug.delegate(ba, "transition_savequeuesnapshotstate", null));}
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Public Sub Transition_SaveQueueSnapshotState";
RDebugUtils.currentLine=51970049;
 //BA.debugLineNum = 51970049;BA.debugLine="SaveQueueSnapshotState";
__ref._savequeuesnapshotstate /*String*/ (null);
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="End Sub";
return "";
}
public String  _transition_setplaybackflowstate(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "transition_setplaybackflowstate", false))
	 {return ((String) Debug.delegate(ba, "transition_setplaybackflowstate", new Object[] {_args}));}
RDebugUtils.currentLine=51707904;
 //BA.debugLineNum = 51707904;BA.debugLine="Public Sub Transition_SetPlaybackFlowState(args As";
RDebugUtils.currentLine=51707905;
 //BA.debugLineNum = 51707905;BA.debugLine="SetPlaybackFlowState(args.GetDefault(\"state\", FLO";
__ref._setplaybackflowstate /*String*/ (null,BA.ObjectToString(_args.GetDefault((Object)("state"),(Object)(__ref._flow_idle /*String*/ ))),BA.ObjectToString(_args.GetDefault((Object)("reason"),(Object)("transition"))));
RDebugUtils.currentLine=51707906;
 //BA.debugLineNum = 51707906;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="Dim audioKey As String = args.GetDefault(\"audioKe";
_audiokey = BA.ObjectToString(_args.GetDefault((Object)("audioKey"),(Object)("")));
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="Dim item As Map = args.Get(\"item\")";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_args.Get((Object)("item"))));
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="Dim timeoutMs As Int = args.GetDefault(\"timeoutMs";
_timeoutms = (int)(BA.ObjectToNumber(_args.GetDefault((Object)("timeoutMs"),(Object)(__ref._audio_ready_timeout_ms /*int*/ ))));
RDebugUtils.currentLine=60096516;
 //BA.debugLineNum = 60096516;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60096517;
 //BA.debugLineNum = 60096517;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=60096518;
 //BA.debugLineNum = 60096518;BA.debugLine="Wait For (WaitForPreparedAudio(audioKey, item, ti";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "transition_waitforpreparedaudio"), __ref._waitforpreparedaudio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_audiokey,_item,_timeoutms));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_prepared = (boolean) result[1];
;
RDebugUtils.currentLine=60096519;
 //BA.debugLineNum = 60096519;BA.debugLine="result.Put(\"Success\", prepared)";
_result.Put((Object)("Success"),(Object)(_prepared));
RDebugUtils.currentLine=60096520;
 //BA.debugLineNum = 60096520;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=60096521;
 //BA.debugLineNum = 60096521;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="Dim startedAt As Long = DateTime.Now";
_startedat = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="Do While DateTime.Now - startedAt < timeoutMs";
if (true) break;

case 1:
//do while
this.state = 8;
while (parent.__c.DateTime.getNow()-_startedat<_timeoutms) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60227587;
 //BA.debugLineNum = 60227587;BA.debugLine="If runtimeState.PendingPrepareAudioKey = \"\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ ).equals("")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60227588;
 //BA.debugLineNum = 60227588;BA.debugLine="Return runtimeState.PreparedAudioKey = audioKey";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)((__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ ).equals(_audiokey) && __ref._itemsmatch /*boolean*/ (null,__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ,_item)));return;};
 if (true) break;

case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=60227590;
 //BA.debugLineNum = 60227590;BA.debugLine="Sleep(25)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "waitforpreparedaudio"),(int) (25));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=60227592;
 //BA.debugLineNum = 60227592;BA.debugLine="TraceWarn(\"audio\", \"таймаут preload\", \"audio=\" &";
__ref._tracewarn /*String*/ (null,"audio","таймаут preload","audio="+_audiokey+" trackId="+__ref._tracetrackvalue /*String*/ (null,_item)+" pendingPrepareAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._pendingprepareaudiokey /*String*/ +" preparedAudio="+__ref._runtimestate /*b4j.example.playbackruntimestate*/ ._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=60227593;
 //BA.debugLineNum = 60227593;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=60227594;
 //BA.debugLineNum = 60227594;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub txtPlayerCode_Action";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="BtnSetupSubmit_Click";
__ref._btnsetupsubmit_click /*void*/ (null);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_focuschanged(b4j.example.b4xmainpage __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub txtPlayerCode_FocusChanged (hasFocus A";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="isCodeInputFocused = hasFocus";
__ref._iscodeinputfocused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="UpdateCodeInputAppearance(hasFocus)";
__ref._updatecodeinputappearance /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_textchanged(b4j.example.b4xmainpage __ref,String _oldvalue,String _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_textchanged", new Object[] {_oldvalue,_newvalue}));}
String _filtered = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub txtPlayerCode_TextChanged (oldValue As";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim filtered As String = FilterPlayerCode(newValu";
_filtered = __ref._filterplayercode /*String*/ (null,_newvalue);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If filtered <> newValue Then";
if ((_filtered).equals(_newvalue) == false) { 
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="txtPlayerCode.Text = filtered";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_filtered);
 };
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="End Sub";
return "";
}
public String  _updatetrustedonlinetimeticks(b4j.example.b4xmainpage __ref,long _candidateticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatetrustedonlinetimeticks", false))
	 {return ((String) Debug.delegate(ba, "updatetrustedonlinetimeticks", new Object[] {_candidateticks}));}
long _storedticks = 0L;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub UpdateTrustedOnlineTimeTicks(candidate";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If candidateTicks <= 0 Then Return";
if (_candidateticks<=0) { 
if (true) return "";};
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Dim storedTicks As Long = storage.GetDefault(trus";
_storedticks = BA.ObjectToLongNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,__ref._trustedsynctimekey /*String*/ ,(Object)(0)));
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="If candidateTicks <= storedTicks Then Return";
if (_candidateticks<=_storedticks) { 
if (true) return "";};
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="storage.Put(trustedSyncTimeKey, candidateTicks)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._trustedsynctimekey /*String*/ ,(Object)(_candidateticks));
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="TraceLog(\"trusted time update ticks=\" & candidate";
__ref._tracelog /*String*/ (null,"trusted time update ticks="+BA.NumberToString(_candidateticks));
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="End Sub";
return "";
}
}