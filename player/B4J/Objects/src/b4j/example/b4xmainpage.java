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
public String _player_base_url = "";
public String _next_base_url = "";
public String _claim_base_url = "";
public String _history_base_url = "";
public String _data_base_url = "";
public String _playlist_cdn_base_url = "";
public String _connectivity_check_url = "";
public String _app_version = "";
public boolean _use_data_playback_resolver = false;
public String _icon_play = "";
public String _icon_stop = "";
public String _icon_more = "";
public String _icon_close = "";
public int _prefetch_seconds = 0;
public int _stop_fade_ms = 0;
public int _orbit_fade_ms = 0;
public int _start_fade_ms = 0;
public int _track_overlap_ms = 0;
public int _ad_tail_overlap_ms = 0;
public int _history_log_delay_ms = 0;
public int _offline_data_refresh_ms = 0;
public int _fetch_timeout_ms = 0;
public int _connectivity_check_timeout_ms = 0;
public int _pause_retry_delay = 0;
public int _offline_retry_delay_initial = 0;
public int _offline_retry_delay_max = 0;
public int _server_retry_delay_initial = 0;
public int _server_retry_delay_max = 0;
public int _blocked_retry_delay = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _rootview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _storagedir = "";
public String _storagefile = "";
public String _storagedbname = "";
public String _offlinedatafile = "";
public String _offlineplaylistrequirementsfile = "";
public String _offlineplaylistsdirname = "";
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
public anywheresoftware.b4a.objects.Timer _historytimer = null;
public anywheresoftware.b4a.objects.Timer _orbittimer = null;
public anywheresoftware.b4a.objects.Timer _offlinedatarefreshtimer = null;
public anywheresoftware.b4a.objects.Timer _localadminutetimer = null;
public anywheresoftware.b4j.objects.Shell _machineguidshell = null;
public String _playercode = "";
public String _deviceid = "";
public String _appscreenmode = "";
public String _nextstartmode = "";
public String _currenttrackurl = "";
public String _currentmediatype = "";
public String _activeaudiokey = "";
public String _preparedaudiokey = "";
public anywheresoftware.b4a.objects.collections.Map _historyitem = null;
public anywheresoftware.b4a.objects.collections.Map _activeitem = null;
public anywheresoftware.b4a.objects.collections.Map _prepareditem = null;
public String _pendingplayaudiokey = "";
public String _pendingprepareaudiokey = "";
public anywheresoftware.b4a.objects.collections.Map _pendingplayitem = null;
public anywheresoftware.b4a.objects.collections.Map _pendingprepareitem = null;
public int _pendingplayfadeinms = 0;
public long _historystartedatticks = 0L;
public boolean _initialstartfadepending = false;
public boolean _isstarted = false;
public boolean _isstoppedbyuser = false;
public boolean _isstopping = false;
public boolean _isqueuetransitioning = false;
public boolean _prefetchdone = false;
public boolean _iscrossfadetriggered = false;
public int _offlineretrydelay = 0;
public int _serverretrydelay = 0;
public int _playlistindex = 0;
public long _scheduledbreakat = 0L;
public int _orbitpulsestep = 0;
public double _orbitfadevalue = 0;
public double _orbitfadetarget = 0;
public boolean _isofflinedatarefreshinprogress = false;
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
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub SaveWindowState";
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Try";
try {RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Dim form As Form = B4XPages.GetNativeParent(Me)";
_form = _b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this);
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="If form.IsInitialized = False Then Return";
if (_form.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="If fx.PrimaryScreen.MaxX > form.Width Then";
if (_fx.getPrimaryScreen().getMaxX()>_form.getWidth()) { 
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="storage.Put(\"WindowTop\", form.WindowTop)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowTop",(Object)(_form.getWindowTop()));
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="storage.Put(\"WindowLeft\", form.WindowLeft)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowLeft",(Object)(_form.getWindowLeft()));
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="storage.Put(\"WindowWidth\", form.WindowWidth)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowWidth",(Object)(_form.getWindowWidth()));
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="storage.Put(\"WindowHeight\", form.WindowHeight)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,"WindowHeight",(Object)(_form.getWindowHeight()));
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="TraceLog(\"Положение окна сохранено. left=\" & fo";
__ref._tracelog /*String*/ (null,"Положение окна сохранено. left="+BA.NumberToString(_form.getWindowLeft())+", top="+BA.NumberToString(_form.getWindowTop())+", width="+BA.NumberToString(_form.getWindowWidth())+", height="+BA.NumberToString(_form.getWindowHeight()));
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="TraceLog(\"Не удалось сохранить положение окна. \"";
__ref._tracelog /*String*/ (null,"Не удалось сохранить положение окна. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="End Sub";
return "";
}
public String  _activateloadeditem(b4j.example.b4xmainpage __ref,String _audiokey,anywheresoftware.b4a.objects.collections.Map _item,int _fadeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "activateloadeditem", false))
	 {return ((String) Debug.delegate(ba, "activateloadeditem", new Object[] {_audiokey,_item,_fadeinms}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub ActivateLoadedItem(audioKey As String,";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="activeAudioKey = audioKey";
__ref._activeaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="activeItem = CloneMap(item)";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_item);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="currentTrackUrl = MediaUrl(item)";
__ref._currenttrackurl /*String*/  = __ref._mediaurl /*String*/ (null,_item);
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="currentMediaType = item.GetDefault(\"type\", \"\")";
__ref._currentmediatype /*String*/  = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="If preparedAudioKey = audioKey Then";
if ((__ref._preparedaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="UpdatePlaybackMeta(item)";
__ref._updateplaybackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="TraceLog(\"ActivateLoadedItem. audio=\" & audioKey";
__ref._tracelog /*String*/ (null,"ActivateLoadedItem. audio="+_audiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+", fadeInMs="+BA.NumberToString(_fadeinms));
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="GetAudioByKey(audioKey).PlayWithFade(fadeInMs)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._playwithfade /*String*/ (null,_fadeinms);
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="ScheduleHistoryLog(item)";
__ref._schedulehistorylog /*String*/ (null,_item);
RDebugUtils.currentLine=4456462;
 //BA.debugLineNum = 4456462;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _clonemap(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clonemap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "clonemap", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.Map _clonedmap = null;
Object _key = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub CloneMap(sourceMap As Map) As Map";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim clonedMap As Map";
_clonedmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="clonedMap.Initialize";
_clonedmap.Initialize();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="If sourceMap.IsInitialized = False Then Return cl";
if (_sourcemap.IsInitialized()==__c.False) { 
if (true) return _clonedmap;};
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="For Each key As Object In sourceMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _sourcemap.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="clonedMap.Put(key, sourceMap.Get(key))";
_clonedmap.Put(_key,_sourcemap.Get(_key));
 }
};
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Return clonedMap";
if (true) return _clonedmap;
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="End Sub";
return null;
}
public String  _mediaurl(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mediaurl", false))
	 {return ((String) Debug.delegate(ba, "mediaurl", new Object[] {_item}));}
String _id = "";
String _localuri = "";
String _first = "";
String _folder = "";
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub MediaUrl(item As Map) As String";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim id As String = item.GetDefault(\"id\", \"\")";
_id = BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="If id = \"\" Then Return \"\"";
if ((_id).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Dim localUri As String = mediaCacheService.Resolv";
_localuri = __ref._mediacacheservice /*b4j.example.mediacache*/ ._resolvelocalmediauri /*String*/ (null,_item);
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="If localUri <> \"\" Then Return localUri";
if ((_localuri).equals("") == false) { 
if (true) return _localuri;};
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Dim first As String = id.SubString2(0, 1)";
_first = _id.substring((int) (0),(int) (1));
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Dim folder As String";
_folder = "";
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"ad\" Then";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"))) { 
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="folder = \"ads\"";
_folder = "ads";
 }else {
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="folder = \"tracks\"";
_folder = "tracks";
 };
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="Return \"https://cdn.fon.fm/media/\" & folder & \"/\"";
if (true) return "https://cdn.fon.fm/media/"+_folder+"/"+_first+"/"+_id+".mp3";
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="End Sub";
return "";
}
public String  _updateplaybackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updateplaybackmeta", false))
	 {return ((String) Debug.delegate(ba, "updateplaybackmeta", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Private Sub UpdatePlaybackMeta(item As Map)";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="If itemType = \"ad\" Then";
if ((_itemtype).equals("ad")) { 
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="ShowAdMeta(item)";
__ref._showadmeta /*String*/ (null,_item);
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="ShowStream(MessageValue(\"ad_label\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"ad_label"));
 }else {
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="ShowTrackMeta(item)";
__ref._showtrackmeta /*String*/ (null,_item);
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="ShowStream(item.GetDefault(\"stream\", \"\"))";
__ref._showstream /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)(""))));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="End Sub";
return "";
}
public String  _tracelog(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tracelog", false))
	 {return ((String) Debug.delegate(ba, "tracelog", new Object[] {_message}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub TraceLog(message As String)";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="appTraceService.Trace(message)";
__ref._apptraceservice /*b4j.example.traceservice*/ ._trace /*String*/ (null,_message);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return "";
}
public String  _describeitem(b4j.example.b4xmainpage __ref,Object _itemobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "describeitem", false))
	 {return ((String) Debug.delegate(ba, "describeitem", new Object[] {_itemobj}));}
anywheresoftware.b4a.objects.collections.Map _item = null;
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub DescribeItem(itemObj As Object) As Str";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
 }else {
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Return \"<empty>\"";
if (true) return "<empty>";
 };
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="If item.IsInitialized = False Then Return \"<empty";
if (_item.IsInitialized()==__c.False) { 
if (true) return "<empty>";};
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="parts.Add(\"тип=\" & item.GetDefault(\"type\", \"\"))";
_parts.Add((Object)("тип="+BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")))));
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="If item.GetDefault(\"id\", \"\") <> \"\" Then parts.Add";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("id="+BA.ObjectToString(_item.GetDefault((Object)("id"),(Object)("")))));};
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="If item.GetDefault(\"title\", \"\") <> \"\" Then parts.";
if ((_item.GetDefault((Object)("title"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("название="+BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)("")))));};
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="If item.GetDefault(\"stream\", \"\") <> \"\" Then parts";
if ((_item.GetDefault((Object)("stream"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("поток="+BA.ObjectToString(_item.GetDefault((Object)("stream"),(Object)("")))));};
RDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("сет="+BA.ObjectToString(_item.GetDefault((Object)("set"),(Object)("")))));};
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add((Object)("код="+BA.ObjectToString(_item.GetDefault((Object)("code"),(Object)("")))));};
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="Return JoinList(parts, \", \")";
if (true) return __ref._joinlist /*String*/ (null,_parts,", ");
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="End Sub";
return "";
}
public b4j.example.audioplayer  _getaudiobykey(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getaudiobykey", false))
	 {return ((b4j.example.audioplayer) Debug.delegate(ba, "getaudiobykey", new Object[] {_audiokey}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub GetAudioByKey(audioKey As String) As A";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If audioKey = \"secondary\" Then Return audioSecond";
if ((_audiokey).equals("secondary")) { 
if (true) return __ref._audiosecondary /*b4j.example.audioplayer*/ ;};
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Return audioPrimary";
if (true) return __ref._audioprimary /*b4j.example.audioplayer*/ ;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="End Sub";
return null;
}
public String  _schedulehistorylog(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulehistorylog", false))
	 {return ((String) Debug.delegate(ba, "schedulehistorylog", new Object[] {_item}));}
String _itemtype = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub ScheduleHistoryLog(item As Map)";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="If item.IsInitialized = False Then Return";
if (_item.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
if (true) return "";};
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="TraceLog(\"ScheduleHistoryLog. item=\" & DescribeIt";
__ref._tracelog /*String*/ (null,"ScheduleHistoryLog. item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+", delayMs="+BA.NumberToString(__ref._history_log_delay_ms /*int*/ ));
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="historyItem = item";
__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/  = _item;
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="historyStartedAtTicks = DateTime.Now";
__ref._historystartedatticks /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="historyTimer.Interval = HISTORY_LOG_DELAY_MS";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._history_log_delay_ms /*int*/ ));
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="historyTimer.Enabled = True";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="End Sub";
return "";
}
public String  _resetretrydelay(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resetretrydelay", false))
	 {return ((String) Debug.delegate(ba, "resetretrydelay", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub ResetRetryDelay";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="offlineRetryDelay = OFFLINE_RETRY_DELAY_INITIAL";
__ref._offlineretrydelay /*int*/  = __ref._offline_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="serverRetryDelay = SERVER_RETRY_DELAY_INITIAL";
__ref._serverretrydelay /*int*/  = __ref._server_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="End Sub";
return "";
}
public String  _applymaterialiconfont(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _fontsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applymaterialiconfont", false))
	 {return ((String) Debug.delegate(ba, "applymaterialiconfont", new Object[] {_view,_fontsize}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub ApplyMaterialIconFont(view As B4XView,";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="UiStyle.ApplyMaterialIconFont(xui, view, fontSize";
_uistyle._applymaterialiconfont /*String*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,_view,_fontsize);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub ApplyOrbitFrame(stepIndex As Int)";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim opacity As Double";
_opacity = 0;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="If orbitFadeValue <= 0 Then";
if (__ref._orbitfadevalue /*double*/ <=0) { 
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="opacity = 0";
_opacity = 0;
 }else {
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Dim basePhase As Double = stepIndex / 24";
_basephase = _stepindex/(double)24;
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="Dim wave As Double = (Sin(basePhase * cPI * 2) +";
_wave = (__c.Sin(_basephase*__c.cPI*2)+1)/(double)2;
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="opacity = (0.38 + wave * 0.28) * orbitFadeValue";
_opacity = (0.38+_wave*0.28)*__ref._orbitfadevalue /*double*/ ;
 };
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="ApplyOrbitState(opacity)";
__ref._applyorbitstate /*String*/ (null,_opacity);
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="End Sub";
return "";
}
public String  _applyorbitstate(b4j.example.b4xmainpage __ref,double _opacity) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applyorbitstate", false))
	 {return ((String) Debug.delegate(ba, "applyorbitstate", new Object[] {_opacity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub ApplyOrbitState(opacity As Double)";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim jo As JavaObject = orbitPane";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="jo.RunMethod(\"setOpacity\", Array As Object(opacit";
_jo.RunMethod("setOpacity",new Object[]{(Object)(_opacity)});
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="End Sub";
return "";
}
public String  _applystoppedstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "applystoppedstate", false))
	 {return ((String) Debug.delegate(ba, "applystoppedstate", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub ApplyStoppedState";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="ShowStream(MessageValue(\"idle_stream\"))";
__ref._showstream /*String*/ (null,__ref._messagevalue /*String*/ (null,"idle_stream"));
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="End Sub";
return "";
}
public String  _showstream(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showstream", false))
	 {return ((String) Debug.delegate(ba, "showstream", new Object[] {_text}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub ShowStream(text As String)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="SetStreamText(text)";
__ref._setstreamtext /*String*/ (null,_text);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="End Sub";
return "";
}
public String  _messagevalue(b4j.example.b4xmainpage __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "messagevalue", false))
	 {return ((String) Debug.delegate(ba, "messagevalue", new Object[] {_key}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub MessageValue(key As String) As String";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Return messages.GetDefault(key, \"\")";
if (true) return BA.ObjectToString(__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="End Sub";
return "";
}
public String  _setstatustext(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstatustext", false))
	 {return ((String) Debug.delegate(ba, "setstatustext", new Object[] {_text}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub SetStatusText(text As String)";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="lblInfo.Text = text";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_complete(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_complete", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_complete", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub AudioPrimary_Complete";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="HandleAudioComplete(\"primary\")";
__ref._handleaudiocomplete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"primary");
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="If isStoppedByUser Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if ((_audiokey).equals(__ref._activeaudiokey /*String*/ ) == false) { 
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
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="TraceLog(\"Аудио завершилось. audio=\" & audioKey &";
__ref._tracelog /*String*/ (null,"Аудио завершилось. audio="+_audiokey+", элемент="+__ref._describeitem /*String*/ (null,(Object)(__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="If PromotePreparedPlayer(0, 0) Then Return True";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._promotepreparedplayer /*boolean*/ (null,(int) (0),(int) (0))) { 
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
this.state = -1;
;
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unuse";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiocomplete"), __ref._playpreparedorloadnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub AudioPrimary_Error(message As String)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="HandleAudioError(\"primary\", message)";
__ref._handleaudioerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"primary",_message);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="TraceLog(\"Ошибка аудио. audio=\" & audioKey & \", m";
__ref._tracelog /*String*/ (null,"Ошибка аудио. audio="+_audiokey+", message="+_message);
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="If pendingPlayAudioKey = audioKey Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._pendingplayaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="CallSubDelayed2(Me, \"PlaybackStartDone\", CreateM";
parent.__c.CallSubDelayed2(ba,parent,"PlaybackStartDone",(Object)(parent.__c.createMap(new Object[] {(Object)("Success"),(Object)(parent.__c.False),(Object)("Message"),(Object)(_message)})));
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="If pendingPrepareAudioKey = audioKey Then";

case 4:
//if
this.state = 7;
if ((__ref._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="CallSubDelayed2(Me, \"PreloadDone\", CreateMap(\"Su";
parent.__c.CallSubDelayed2(ba,parent,"PreloadDone",(Object)(parent.__c.createMap(new Object[] {(Object)("Success"),(Object)(parent.__c.False),(Object)("Message"),(Object)(_message)})));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="If audioKey <> activeAudioKey Then Return False";

case 7:
//if
this.state = 12;
if ((_audiokey).equals(__ref._activeaudiokey /*String*/ ) == false) { 
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
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="If isStoppedByUser Or isStopping Then Return Fals";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._isstoppedbyuser /*boolean*/  || __ref._isstopping /*boolean*/ ) { 
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
this.state = -1;
;
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="Wait For (HandleMediaError) Complete (unused As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudioerror"), __ref._handlemediaerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8192016;
 //BA.debugLineNum = 8192016;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub AudioPrimary_Ready";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="HandleAudioReady(\"primary\")";
__ref._handleaudioready /*String*/ (null,"primary");
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _handleaudioready(b4j.example.b4xmainpage __ref,String _audiokey) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handleaudioready", false))
	 {return ((String) Debug.delegate(ba, "handleaudioready", new Object[] {_audiokey}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub HandleAudioReady(audioKey As String)";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="TraceLog(\"Аудио готово. audio=\" & audioKey)";
__ref._tracelog /*String*/ (null,"Аудио готово. audio="+_audiokey);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="If pendingPlayAudioKey = audioKey Then";
if ((__ref._pendingplayaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="ActivateLoadedItem(audioKey, pendingPlayItem, pe";
__ref._activateloadeditem /*String*/ (null,_audiokey,__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._pendingplayfadeinms /*int*/ );
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="CallSubDelayed2(Me, \"PlaybackStartDone\", CreateM";
__c.CallSubDelayed2(ba,this,"PlaybackStartDone",(Object)(__c.createMap(new Object[] {(Object)("Success"),(Object)(__c.True)})));
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="If pendingPrepareAudioKey = audioKey Then";
if ((__ref._pendingprepareaudiokey /*String*/ ).equals(_audiokey)) { 
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="preparedAudioKey = audioKey";
__ref._preparedaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="preparedItem = CloneMap(pendingPrepareItem)";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=8126475;
 //BA.debugLineNum = 8126475;BA.debugLine="pendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="pendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="CallSubDelayed2(Me, \"PreloadDone\", CreateMap(\"Su";
__c.CallSubDelayed2(ba,this,"PreloadDone",(Object)(__c.createMap(new Object[] {(Object)("Success"),(Object)(__c.True)})));
 };
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="End Sub";
return "";
}
public String  _audioprimary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audioprimary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audioprimary_timeupdate", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub AudioPrimary_Timeupdate";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="HandleAudioTimeupdate(\"primary\")";
__ref._handleaudiotimeupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"primary");
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If audioKey <> activeAudioKey Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((_audiokey).equals(__ref._activeaudiokey /*String*/ ) == false) { 
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
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="If ShouldTriggerBreakNow Then";
if (true) break;

case 13:
//if
this.state = 16;
if (__ref._shouldtriggerbreaknow /*boolean*/ (null)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="TraceLog(\"Достигнута точка exact-break.\")";
__ref._tracelog /*String*/ (null,"Достигнута точка exact-break.");
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 39;
return;
case 39:
//C
this.state = 16;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Dim remain As Long = EffectiveTrackRemainMs";
_remain = __ref._effectivetrackremainms /*long*/ (null);
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="If CanCrossfadePreparedItem And remain > 0 And re";
if (true) break;

case 17:
//if
this.state = 20;
if (__ref._cancrossfadeprepareditem /*boolean*/ (null) && _remain>0 && _remain<=__ref._track_overlap_ms /*int*/ ) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="isCrossfadeTriggered = True";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="TraceLog(\"Запуск overlap треков. remainMs=\" & re";
__ref._tracelog /*String*/ (null,"Запуск overlap треков. remainMs="+BA.NumberToString(_remain)+", next="+__ref._describeitem /*String*/ (null,(Object)(__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepared";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="If CanStartPreparedOnTrackTail And remain > 0 And";

case 20:
//if
this.state = 23;
if (__ref._canstartpreparedontracktail /*boolean*/ (null) && _remain>0 && _remain<=__ref._ad_tail_overlap_ms /*int*/ ) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="isCrossfadeTriggered = True";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="TraceLog(\"Запуск ролика на хвосте трека. remainM";
__ref._tracelog /*String*/ (null,"Запуск ролика на хвосте трека. remainMs="+BA.NumberToString(_remain)+", next="+__ref._describeitem /*String*/ (null,(Object)(__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())));
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="PromotePreparedPlayer(PreparedFadeInMs, Prepared";
__ref._promotepreparedplayer /*boolean*/ (null,__ref._preparedfadeinms /*int*/ (null),__ref._preparedfadeoutms /*int*/ (null));
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=8323093;
 //BA.debugLineNum = 8323093;BA.debugLine="If prefetchDone Then Return False";

case 23:
//if
this.state = 28;
if (__ref._prefetchdone /*boolean*/ ) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="If remain <= 0 Then Return False";
if (true) break;

case 29:
//if
this.state = 34;
if (_remain<=0) { 
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
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="If remain <= PREFETCH_SECONDS * 1000 Then";
if (true) break;

case 35:
//if
this.state = 38;
if (_remain<=__ref._prefetch_seconds /*int*/ *1000) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=8323096;
 //BA.debugLineNum = 8323096;BA.debugLine="prefetchDone = True";
__ref._prefetchdone /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="TraceLog(\"Запуск предзагрузки следующего элемент";
__ref._tracelog /*String*/ (null,"Запуск предзагрузки следующего элемента. remainMs="+BA.NumberToString(_remain));
RDebugUtils.currentLine=8323098;
 //BA.debugLineNum = 8323098;BA.debugLine="Wait For (PrefetchNext) Complete (unused2 As Boo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handleaudiotimeupdate"), __ref._prefetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 40;
return;
case 40:
//C
this.state = 38;
_unused2 = (boolean) result[1];
;
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=8323100;
 //BA.debugLineNum = 8323100;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8323101;
 //BA.debugLineNum = 8323101;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub AudioSecondary_Complete";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="HandleAudioComplete(\"secondary\")";
__ref._handleaudiocomplete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"secondary");
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_error(b4j.example.b4xmainpage __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_error", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_error", new Object[] {_message}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub AudioSecondary_Error(message As String";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="HandleAudioError(\"secondary\", message)";
__ref._handleaudioerror /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"secondary",_message);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_ready(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_ready", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_ready", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub AudioSecondary_Ready";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="HandleAudioReady(\"secondary\")";
__ref._handleaudioready /*String*/ (null,"secondary");
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _audiosecondary_timeupdate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiosecondary_timeupdate", false))
	 {return ((String) Debug.delegate(ba, "audiosecondary_timeupdate", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub AudioSecondary_Timeupdate";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="HandleAudioTimeupdate(\"secondary\")";
__ref._handleaudiotimeupdate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"secondary");
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return "";
}
public void  _autostartsavedplayer(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "autostartsavedplayer", false))
	 {Debug.delegate(ba, "autostartsavedplayer", null); return;}
ResumableSub_AutoStartSavedPlayer rsub = new ResumableSub_AutoStartSavedPlayer(this,__ref);
rsub.resume(ba, null);
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
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If playerCode = \"\" Then Return";
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
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If isStarted Or isStopping Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._isstarted /*boolean*/  || __ref._isstopping /*boolean*/ ) { 
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
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";
if (true) break;

case 13:
//if
this.state = 23;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="TraceLog(\"Автозапуск: сначала пробую получить св";
__ref._tracelog /*String*/ (null,"Автозапуск: сначала пробую получить свежий data.php.");
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 24;
return;
case 24:
//C
this.state = 16;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="If refreshed = False Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_refreshed==parent.__c.False) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="TraceLog(\"Свежий data.php недоступен. Использую";
__ref._tracelog /*String*/ (null,"Свежий data.php недоступен. Использую сохраненные офлайн-метаданные.");
 if (true) break;
;
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="If CanUseDataPlaybackResolver = False Then";

case 19:
//if
this.state = 22;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="TraceLog(\"Автозапуск отменен: нет ни свежих, ни";
__ref._tracelog /*String*/ (null,"Автозапуск отменен: нет ни свежих, ни сохраненных data/playlists.");
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="isStarted = True";
__ref._isstarted /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="isStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="TraceLog(\"Автозапуск воспроизведения при старте п";
__ref._tracelog /*String*/ (null,"Автозапуск воспроизведения при старте приложения.");
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="Wait For (StartFirstTrack(\"auto\")) Complete (unus";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "autostartsavedplayer"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"auto"));
this.state = 25;
return;
case 25:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If playerCode = \"\" Then Return False";
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
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If isOfflineDataRefreshInProgress Then Return Fal";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._isofflinedatarefreshinprogress /*boolean*/ ) { 
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
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="isOfflineDataRefreshInProgress = True";
__ref._isofflinedatarefreshinprogress /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="TraceLog(\"Запрос офлайн-метаданных. playerCode=\"";
__ref._tracelog /*String*/ (null,"Запрос офлайн-метаданных. playerCode="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+", deviceId="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Wait For (FetchJsonWithTimeout(DATA_BASE_URL & \"?";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "refreshofflinedatanow"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createdataparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="TraceLog(\"Не удалось обновить офлайн-метаданные.";
__ref._tracelog /*String*/ (null,"Не удалось обновить офлайн-метаданные. kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+", message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="isOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 17:
//if
this.state = 29;
if (_resultdata instanceof java.util.Map) { 
this.state = 19;
}else {
this.state = 28;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="If data.GetDefault(\"ok\", False) = True And data.";
if (true) break;

case 20:
//if
this.state = 23;
if ((_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) && (_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("data"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="offlineData = offlineStoreService.SaveOfflineDa";
__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._saveofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null,_data,__ref._playercode /*String*/ ,__ref._deviceid /*String*/ );
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="Wait For (SyncOfflinePlaylistMetadata) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "refreshofflinedatanow"), __ref._syncofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 31;
return;
case 31:
//C
this.state = 23;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="CallSubDelayed(Me, \"EnsureOfflineAdsCachedAsync";
parent.__c.CallSubDelayed(ba,parent,"EnsureOfflineAdsCachedAsync");
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="TraceLog(\"Кэш рекламы поставлен в фоновый прогр";
__ref._tracelog /*String*/ (null,"Кэш рекламы поставлен в фоновый прогрев после обновления data.php. cached="+BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_count",(Object)(0))));
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="isOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="If data.GetDefault(\"type\", \"\") = \"message\" Then";

case 23:
//if
this.state = 26;
if ((_data.GetDefault((Object)("type"),(Object)(""))).equals((Object)("message"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="TraceLog(\"data.php вернул message. action=\" & d";
__ref._tracelog /*String*/ (null,"data.php вернул message. action="+BA.ObjectToString(_data.GetDefault((Object)("action"),(Object)("")))+", reason="+BA.ObjectToString(_data.GetDefault((Object)("reason"),(Object)("")))+", message="+BA.ObjectToString(_data.GetDefault((Object)("message"),(Object)(""))));
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="HandleMessageItem(data)";
__ref._handlemessageitem /*String*/ (null,_data);
RDebugUtils.currentLine=1441817;
 //BA.debugLineNum = 1441817;BA.debugLine="isOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 29;
;
RDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="TraceLog(\"Ответ data.php не подходит для офлайн-";
__ref._tracelog /*String*/ (null,"Ответ data.php не подходит для офлайн-режима. type="+BA.ObjectToString(_data.GetDefault((Object)("type"),(Object)("")))+", ok="+BA.ObjectToString(_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))));
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=1441822;
 //BA.debugLineNum = 1441822;BA.debugLine="TraceLog(\"Ответ data.php не является Map.\")";
__ref._tracelog /*String*/ (null,"Ответ data.php не является Map.");
 if (true) break;

case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=1441824;
 //BA.debugLineNum = 1441824;BA.debugLine="isOfflineDataRefreshInProgress = False";
__ref._isofflinedatarefreshinprogress /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1441825;
 //BA.debugLineNum = 1441825;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=1441826;
 //BA.debugLineNum = 1441826;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _canusedataplaybackresolver(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canusedataplaybackresolver", false))
	 {return ((Boolean) Debug.delegate(ba, "canusedataplaybackresolver", null));}
anywheresoftware.b4a.objects.collections.List _schedules = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub CanUseDataPlaybackResolver As Boolean";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER = False Then Return";
if (__ref._use_data_playback_resolver /*boolean*/ ==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If offlineData.IsInitialized = False Then Return";
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";
if ((__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ok"),(Object)(__c.False))).equals((Object)(__c.True)) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Dim schedules As List = offlineData.GetDefault(\"s";
_schedules = new anywheresoftware.b4a.objects.collections.List();
_schedules = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("schedules"),__c.Null)));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="If schedules.IsInitialized = False Or schedules.S";
if (_schedules.IsInitialized()==__c.False || _schedules.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="End Sub";
return false;
}
public String  _setstopicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstopicon", false))
	 {return ((String) Debug.delegate(ba, "setstopicon", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub SetStopIcon";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
__ref._setlabelstyle /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="lblPlayIcon.Text = ICON_STOP";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_stop /*String*/ );
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="ApplyMaterialIconFont(lblPlayIcon, stopIconBaseSi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._stopiconbasesize /*float*/ );
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="StartOrbitAnimation";
__ref._startorbitanimation /*String*/ (null);
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="End Sub";
return "";
}
public String  _hidecontentblocks(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidecontentblocks", false))
	 {return ((String) Debug.delegate(ba, "hidecontentblocks", null));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub HideContentBlocks";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="SetStreamText(\"\")";
__ref._setstreamtext /*String*/ (null,"");
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="nextStartMode = mode";
__ref._nextstartmode /*String*/  = _mode;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="initialStartFadePending = True";
__ref._initialstartfadepending /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="TraceLog(\"Запуск первого трека. Режим=\" & mode)";
__ref._tracelog /*String*/ (null,"Запуск первого трека. Режим="+_mode);
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startfirsttrack"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="rootView = root1";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="rootView.Color = 0xFF0E0F11";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff0e0f11));
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="InitSettings";
__ref._initsettings /*String*/ (null);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="InitState";
__ref._initstate /*String*/ (null);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="BuildUi";
__ref._buildui /*String*/ (null);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="RestoreWindowState";
__ref._restorewindowstate /*String*/ (null);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="audioPrimary.Initialize(\"AudioPrimary\", Me)";
__ref._audioprimary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioPrimary",this);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="audioSecondary.Initialize(\"AudioSecondary\", Me)";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._initialize /*String*/ (null,ba,"AudioSecondary",this);
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="TraceLog(\"Приложение запущено. Версия=\" & APP_VER";
__ref._tracelog /*String*/ (null,"Приложение запущено. Версия="+__ref._app_version /*String*/ +", код плеера="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+", deviceId="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="StartOfflineDataRefresh";
__ref._startofflinedatarefresh /*String*/ (null);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="ShowInitialScreen";
__ref._showinitialscreen /*String*/ (null);
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="End Sub";
return "";
}
public String  _initsettings(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initsettings", false))
	 {return ((String) Debug.delegate(ba, "initsettings", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub InitSettings";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="messages.Initialize";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="messages.Put(\"offline\", \"Требуется интернет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("offline"),(Object)("Требуется интернет"));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="messages.Put(\"server_wait\", \"Временная остановка\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("server_wait"),(Object)("Временная остановка"));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="messages.Put(\"idle\", \"Перерыв...\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle"),(Object)("Перерыв..."));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="messages.Put(\"idle_until\", \"Перерыв до {time}\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_until"),(Object)("Перерыв до {time}"));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="messages.Put(\"blocked\", \"Плеер заблокирован\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blocked"),(Object)("Плеер заблокирован"));
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="messages.Put(\"idle_stream\", \"Запусти поток\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("idle_stream"),(Object)("Запусти поток"));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="messages.Put(\"player_required\", \"Не указан плеер\"";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_required"),(Object)("Не указан плеер"));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="messages.Put(\"device_required\", \"Не указано устро";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_required"),(Object)("Не указано устройство"));
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="messages.Put(\"device_busy\", \"Плеер играет на друг";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_busy"),(Object)("Плеер играет на другом устройстве. Играть здесь?"));
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="messages.Put(\"device_confirm_yes\", \"Да\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_yes"),(Object)("Да"));
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="messages.Put(\"device_confirm_no\", \"Нет\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("device_confirm_no"),(Object)("Нет"));
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="messages.Put(\"not_found\", \"Плеер не найден\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("not_found"),(Object)("Плеер не найден"));
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="messages.Put(\"player_updated\", \"Плеер обновлен\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_updated"),(Object)("Плеер обновлен"));
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="messages.Put(\"player_reloading\", \"Обновление…\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("player_reloading"),(Object)("Обновление…"));
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="messages.Put(\"ad_label\", \"Реклама\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ad_label"),(Object)("Реклама"));
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="messages.Put(\"setup_title\", \"Введите код плеера\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_title"),(Object)("Введите код плеера"));
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="messages.Put(\"setup_placeholder\", \"abc12\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_placeholder"),(Object)("abc12"));
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="messages.Put(\"setup_submit\", \"Войти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_submit"),(Object)("Войти"));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="messages.Put(\"setup_invalid\", \"Введите код из 5 с";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("setup_invalid"),(Object)("Введите код из 5 символов"));
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="messages.Put(\"logout\", \"Выйти\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("logout"),(Object)("Выйти"));
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="messages.Put(\"settings_open\", \"Настройки\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_open"),(Object)("Настройки"));
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="messages.Put(\"settings_close\", \"Закрыть\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_close"),(Object)("Закрыть"));
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="messages.Put(\"settings_thanks\", \"Спасибо!\")";
__ref._messages /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("settings_thanks"),(Object)("Спасибо!"));
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="End Sub";
return "";
}
public String  _initstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initstate", false))
	 {return ((String) Debug.delegate(ba, "initstate", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub InitState";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="storageDir = File.DirData(\"fonfm\")";
__ref._storagedir /*String*/  = __c.File.DirData("fonfm");
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="debugResponsesDir = File.Combine(storageDir, \"deb";
__ref._debugresponsesdir /*String*/  = __c.File.Combine(__ref._storagedir /*String*/ ,"debugresponses");
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="EnsureDirectory(storageDir)";
__ref._ensuredirectory /*String*/ (null,__ref._storagedir /*String*/ );
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="storage.Initialize(storageDir, storageDbName)";
__ref._storage /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storagedbname /*String*/ );
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="MigrateLegacyStorageIfNeeded";
__ref._migratelegacystorageifneeded /*String*/ (null);
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="playerCode = NormalizePlayerCode(storage.GetDefau";
__ref._playercode /*String*/  = __ref._normalizeplayercode /*String*/ (null,BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"player_code",(Object)(""))));
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="appTraceService.Initialize(storageDir, debugRespo";
__ref._apptraceservice /*b4j.example.traceservice*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._debugresponsesdir /*String*/ ,__ref._traceloglimit /*int*/ ,__ref._serversnapshotlimit /*int*/ );
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="offlineData.Initialize";
__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="playQueue.Initialize";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="localAdScheduler.Initialize(Me, \"TraceLog\", Messa";
__ref._localadscheduler /*b4j.example.adscheduler*/ ._initialize /*String*/ (null,ba,this,"TraceLog",__ref._messagevalue /*String*/ (null,"ad_label"));
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="dataResolver.Initialize(storageDir, Me, \"TraceLog";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,this,"TraceLog");
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="dataResolver.LoadState(storage)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadstate /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ );
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="TraceLog(\"Загружены курсоры playlists. count=\" &";
__ref._tracelog /*String*/ (null,"Загружены курсоры playlists. count="+BA.NumberToString(__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._cursorcount /*int*/ (null)));
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="deviceId = GetOrCreateDeviceId";
__ref._deviceid /*String*/  = __ref._getorcreatedeviceid /*String*/ (null);
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="mediaCacheService.Initialize(storageDir, storage,";
__ref._mediacacheservice /*b4j.example.mediacache*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,this,"TraceLog");
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="retryTimer.Initialize(\"RetryTimer\", SERVER_RETRY_";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"RetryTimer",(long) (__ref._server_retry_delay_initial /*int*/ ));
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="breakTimer.Initialize(\"BreakTimer\", 1000)";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"BreakTimer",(long) (1000));
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="historyTimer.Initialize(\"HistoryTimer\", HISTORY_L";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"HistoryTimer",(long) (__ref._history_log_delay_ms /*int*/ ));
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="orbitTimer.Initialize(\"OrbitTimer\", 70)";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OrbitTimer",(long) (70));
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="offlineDataRefreshTimer.Initialize(\"OfflineDataRe";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"OfflineDataRefreshTimer",(long) (__ref._offline_data_refresh_ms /*int*/ ));
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="localAdMinuteTimer.Initialize(\"LocalAdMinuteTimer";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"LocalAdMinuteTimer",(long) (1000));
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="historyItem.Initialize";
__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="historyStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="activeItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="activeAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="pendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="pendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="offlineStoreService.Initialize(storageDir, storag";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._initialize /*String*/ (null,ba,__ref._storagedir /*String*/ ,__ref._storage /*b4j.example.keyvaluestore*/ ,this,"TraceLog",__ref._offlinedatafile /*String*/ ,__ref._offlineplaylistrequirementsfile /*String*/ ,__ref._offlineplaylistsdirname /*String*/ ,__ref._playlist_cdn_base_url /*String*/ );
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="offlineData = offlineStoreService.LoadOfflineData";
__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._loadofflinedata /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="ResolveMachineGuidAsync";
__ref._resolvemachineguidasync /*String*/ (null);
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="TraceLog(\"Состояние инициализировано. Папка=\" & s";
__ref._tracelog /*String*/ (null,"Состояние инициализировано. Папка="+__ref._storagedir /*String*/ +", сохраненный код="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildui", false))
	 {return ((String) Debug.delegate(ba, "buildui", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub BuildUi";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="card = xui.CreatePanel(\"\")";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="headerPane = xui.CreatePanel(\"\")";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="headerActionPane = xui.CreatePanel(\"HeaderActionP";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"HeaderActionPane");
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="contentPane = xui.CreatePanel(\"\")";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="footerPane = xui.CreatePanel(\"\")";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="setupPane = xui.CreatePanel(\"\")";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="playerPane = xui.CreatePanel(\"\")";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="setupHeroPane = xui.CreatePanel(\"\")";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="setupDetailPane = xui.CreatePanel(\"\")";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="setupPrimaryPane = xui.CreatePanel(\"\")";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="setupStatusPane = xui.CreatePanel(\"\")";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="playerHeroPane = xui.CreatePanel(\"\")";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="playerDetailPane = xui.CreatePanel(\"\")";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="playerPrimaryPane = xui.CreatePanel(\"\")";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="playerStatusPane = xui.CreatePanel(\"\")";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="orbitPane = xui.CreatePanel(\"\")";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="playButtonPane = xui.CreatePanel(\"PlayButtonPane\"";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"PlayButtonPane");
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="confirmPane = xui.CreatePanel(\"\")";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="accessCirclePane = xui.CreatePanel(\"\")";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="accessCorePane = xui.CreatePanel(\"\")";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="accessInputPane = xui.CreatePanel(\"\")";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="accessCirclePane.SetColorAndBorder(0x07FFFFFF, 4d";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0x07ffffff),__c.DipToCurrent((int) (4)),((int)0x55ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x66ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="playButtonPane.SetColorAndBorder(xui.Color_Transp";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (4)),((int)0x33ffffff),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="headerActionPane.SetColorAndBorder(xui.Color_Tran";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=851999;
 //BA.debugLineNum = 851999;BA.debugLine="lblHeader = CreateLabel(\"\", 12, 0xFF747B86, False";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="lblHeaderAction = CreateLabel(ICON_MORE, 22, 0xFF";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_more /*String*/ ,(float) (22),((int)0xffb9c0c9),__c.False,__c.False);
RDebugUtils.currentLine=852001;
 //BA.debugLineNum = 852001;BA.debugLine="lblPlayIcon = CreateLabel(ICON_PLAY, 48, 0xFFD0FF";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._icon_play /*String*/ ,(float) (48),((int)0xffd0ff71),__c.False,__c.False);
RDebugUtils.currentLine=852002;
 //BA.debugLineNum = 852002;BA.debugLine="lblStream = CreateLabel(\"\", 36, 0xFFD0FF71, True,";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (36),((int)0xffd0ff71),__c.True,__c.True);
RDebugUtils.currentLine=852003;
 //BA.debugLineNum = 852003;BA.debugLine="lblInfo = CreateLabel(\"\", 17, 0xFFBCC3CD, False,";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=852004;
 //BA.debugLineNum = 852004;BA.debugLine="lblFooter = CreateLabel(\"FON.FM APP \" & APP_VERSI";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"FON.FM APP "+__ref._app_version /*String*/ ,(float) (12),((int)0xff747b86),__c.False,__c.True);
RDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="lblSetupMessage = CreateLabel(\"\", 17, 0xFFBCC3CD,";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"",(float) (17),((int)0xffbcc3cd),__c.False,__c.True);
RDebugUtils.currentLine=852007;
 //BA.debugLineNum = 852007;BA.debugLine="txtPlayerCode.Initialize(\"txtPlayerCode\")";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"txtPlayerCode");
RDebugUtils.currentLine=852008;
 //BA.debugLineNum = 852008;BA.debugLine="txtPlayerCodeView = txtPlayerCode";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=852009;
 //BA.debugLineNum = 852009;BA.debugLine="btnSetupSubmit = CreateTextButton(MessageValue(\"s";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"setup_submit"),"BtnSetupSubmit");
RDebugUtils.currentLine=852010;
 //BA.debugLineNum = 852010;BA.debugLine="btnConfirmYes = CreateTextButton(MessageValue(\"de";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_yes"),"BtnConfirmYes");
RDebugUtils.currentLine=852011;
 //BA.debugLineNum = 852011;BA.debugLine="btnConfirmNo = CreateTextButton(MessageValue(\"dev";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._messagevalue /*String*/ (null,"device_confirm_no"),"BtnConfirmNo");
RDebugUtils.currentLine=852012;
 //BA.debugLineNum = 852012;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=852013;
 //BA.debugLineNum = 852013;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=852014;
 //BA.debugLineNum = 852014;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=852016;
 //BA.debugLineNum = 852016;BA.debugLine="rootView.AddView(card, 0, 0, 0, 0)";
__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852017;
 //BA.debugLineNum = 852017;BA.debugLine="card.AddView(headerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852018;
 //BA.debugLineNum = 852018;BA.debugLine="card.AddView(contentPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852019;
 //BA.debugLineNum = 852019;BA.debugLine="card.AddView(footerPane, 0, 0, 0, 0)";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852020;
 //BA.debugLineNum = 852020;BA.debugLine="headerPane.AddView(lblHeader, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852021;
 //BA.debugLineNum = 852021;BA.debugLine="headerPane.AddView(headerActionPane, 0, 0, 0, 0)";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852022;
 //BA.debugLineNum = 852022;BA.debugLine="headerActionPane.AddView(lblHeaderAction, 0, 0, 0";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852023;
 //BA.debugLineNum = 852023;BA.debugLine="contentPane.AddView(setupPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852024;
 //BA.debugLineNum = 852024;BA.debugLine="contentPane.AddView(playerPane, 0, 0, 0, 0)";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852025;
 //BA.debugLineNum = 852025;BA.debugLine="footerPane.AddView(lblFooter, 0, 0, 0, 0)";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852027;
 //BA.debugLineNum = 852027;BA.debugLine="setupPane.AddView(setupHeroPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852028;
 //BA.debugLineNum = 852028;BA.debugLine="setupPane.AddView(setupDetailPane, 0, 0, 0, 0)";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852029;
 //BA.debugLineNum = 852029;BA.debugLine="setupHeroPane.AddView(accessCorePane, 0, 0, 0, 0)";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852030;
 //BA.debugLineNum = 852030;BA.debugLine="setupHeroPane.AddView(accessCirclePane, 0, 0, 0,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852031;
 //BA.debugLineNum = 852031;BA.debugLine="accessCirclePane.AddView(accessInputPane, 0, 0, 0";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852032;
 //BA.debugLineNum = 852032;BA.debugLine="accessInputPane.AddView(txtPlayerCodeView, 0, 0,";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852033;
 //BA.debugLineNum = 852033;BA.debugLine="setupDetailPane.AddView(setupPrimaryPane, 0, 0, 0";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852034;
 //BA.debugLineNum = 852034;BA.debugLine="setupDetailPane.AddView(setupStatusPane, 0, 0, 0,";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852035;
 //BA.debugLineNum = 852035;BA.debugLine="setupPrimaryPane.AddView(btnSetupSubmit, 0, 0, 0,";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852036;
 //BA.debugLineNum = 852036;BA.debugLine="setupStatusPane.AddView(lblSetupMessage, 0, 0, 0,";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852038;
 //BA.debugLineNum = 852038;BA.debugLine="playerPane.AddView(playerHeroPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852039;
 //BA.debugLineNum = 852039;BA.debugLine="playerPane.AddView(playerDetailPane, 0, 0, 0, 0)";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852040;
 //BA.debugLineNum = 852040;BA.debugLine="playerHeroPane.AddView(orbitPane, 0, 0, 0, 0)";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852041;
 //BA.debugLineNum = 852041;BA.debugLine="playerHeroPane.AddView(playButtonPane, 0, 0, 0, 0";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852042;
 //BA.debugLineNum = 852042;BA.debugLine="playButtonPane.AddView(lblPlayIcon, 0, 0, 0, 0)";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852043;
 //BA.debugLineNum = 852043;BA.debugLine="playerDetailPane.AddView(playerPrimaryPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852044;
 //BA.debugLineNum = 852044;BA.debugLine="playerDetailPane.AddView(playerStatusPane, 0, 0,";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852045;
 //BA.debugLineNum = 852045;BA.debugLine="playerPrimaryPane.AddView(lblStream, 0, 0, 0, 0)";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852046;
 //BA.debugLineNum = 852046;BA.debugLine="playerStatusPane.AddView(lblInfo, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852047;
 //BA.debugLineNum = 852047;BA.debugLine="playerStatusPane.AddView(confirmPane, 0, 0, 0, 0)";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852048;
 //BA.debugLineNum = 852048;BA.debugLine="confirmPane.AddView(btnConfirmYes, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852049;
 //BA.debugLineNum = 852049;BA.debugLine="confirmPane.AddView(btnConfirmNo, 0, 0, 0, 0)";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=852051;
 //BA.debugLineNum = 852051;BA.debugLine="SetPaneStyle(card, \"-fx-background-radius: 24; -f";
__ref._setpanestyle /*String*/ (null,__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 24; -fx-border-radius: 24;");
RDebugUtils.currentLine=852052;
 //BA.debugLineNum = 852052;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.05); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=852053;
 //BA.debugLineNum = 852053;BA.debugLine="SetPaneStyle(playButtonPane, \"-fx-cursor: hand; -";
__ref._setpanestyle /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-color: rgba(255,255,255,0.07); -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=852054;
 //BA.debugLineNum = 852054;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=852055;
 //BA.debugLineNum = 852055;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=852056;
 //BA.debugLineNum = 852056;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=852057;
 //BA.debugLineNum = 852057;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffddf1ff))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x7affffff))+"; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=852058;
 //BA.debugLineNum = 852058;BA.debugLine="accessCorePane.Visible = True";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=852059;
 //BA.debugLineNum = 852059;BA.debugLine="accessCirclePane.Visible = True";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=852060;
 //BA.debugLineNum = 852060;BA.debugLine="accessInputPane.Visible = True";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=852061;
 //BA.debugLineNum = 852061;BA.debugLine="SetPickOnBounds(headerActionPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=852062;
 //BA.debugLineNum = 852062;BA.debugLine="SetPickOnBounds(playButtonPane, True)";
__ref._setpickonbounds /*String*/ (null,__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=852063;
 //BA.debugLineNum = 852063;BA.debugLine="txtPlayerCode.PromptText = MessageValue(\"setup_pl";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setPromptText(__ref._messagevalue /*String*/ (null,"setup_placeholder").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=852064;
 //BA.debugLineNum = 852064;BA.debugLine="txtPlayerCode.Visible = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=852065;
 //BA.debugLineNum = 852065;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=852066;
 //BA.debugLineNum = 852066;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=852067;
 //BA.debugLineNum = 852067;BA.debugLine="UpdateCodeInputAppearance(False)";
__ref._updatecodeinputappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=852068;
 //BA.debugLineNum = 852068;BA.debugLine="BringToFront(accessCorePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=852069;
 //BA.debugLineNum = 852069;BA.debugLine="BringToFront(accessCirclePane)";
__ref._bringtofront /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=852070;
 //BA.debugLineNum = 852070;BA.debugLine="BringToFront(accessInputPane)";
__ref._bringtofront /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=852071;
 //BA.debugLineNum = 852071;BA.debugLine="BringToFront(txtPlayerCodeView)";
__ref._bringtofront /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=852073;
 //BA.debugLineNum = 852073;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=852074;
 //BA.debugLineNum = 852074;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=852075;
 //BA.debugLineNum = 852075;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub RestoreWindowState";
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Try";
try {RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Dim form As Form = B4XPages.GetNativeParent(Me)";
_form = _b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this);
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="If form.IsInitialized = False Then Return";
if (_form.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="Dim windowTop As Double = storage.GetDefault(\"Wi";
_windowtop = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowTop",(Object)(-1))));
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="Dim windowLeft As Double = storage.GetDefault(\"W";
_windowleft = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowLeft",(Object)(-1))));
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="Dim windowWidth As Double = storage.GetDefault(\"";
_windowwidth = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowWidth",(Object)(-1))));
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="Dim windowHeight As Double = storage.GetDefault(";
_windowheight = (double)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"WindowHeight",(Object)(-1))));
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="Dim maxWidth As Double = fx.PrimaryScreen.MaxX -";
_maxwidth = _fx.getPrimaryScreen().getMaxX()-_fx.getPrimaryScreen().getMinX();
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="Dim maxHeight As Double = fx.PrimaryScreen.MaxY";
_maxheight = _fx.getPrimaryScreen().getMaxY()-_fx.getPrimaryScreen().getMinY();
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="If windowTop > -1 Then form.WindowTop = windowTo";
if (_windowtop>-1) { 
_form.setWindowTop(_windowtop);};
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="If windowLeft > -1 Then form.WindowLeft = window";
if (_windowleft>-1) { 
_form.setWindowLeft(_windowleft);};
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="If windowWidth > -1 Then form.WindowWidth = Min(";
if (_windowwidth>-1) { 
_form.setWindowWidth(__c.Min(_maxwidth,__c.Max(520,_windowwidth)));};
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="If windowHeight > -1 Then";
if (_windowheight>-1) { 
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="form.WindowHeight = Min(maxHeight, Max(640, win";
_form.setWindowHeight(__c.Min(_maxheight,__c.Max(640,_windowheight)));
 }else 
{RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="Else If maxHeight < 640 Then";
if (_maxheight<640) { 
RDebugUtils.currentLine=14811154;
 //BA.debugLineNum = 14811154;BA.debugLine="form.WindowHeight = maxHeight";
_form.setWindowHeight(_maxheight);
 }}
;
RDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="TraceLog(\"Положение окна восстановлено. left=\" &";
__ref._tracelog /*String*/ (null,"Положение окна восстановлено. left="+BA.NumberToString(_form.getWindowLeft())+", top="+BA.NumberToString(_form.getWindowTop())+", width="+BA.NumberToString(_form.getWindowWidth())+", height="+BA.NumberToString(_form.getWindowHeight()));
 } 
       catch (Exception e21) {
			ba.setLastException(e21);RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="TraceLog(\"Не удалось восстановить положение окна";
__ref._tracelog /*String*/ (null,"Не удалось восстановить положение окна. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=14811161;
 //BA.debugLineNum = 14811161;BA.debugLine="End Sub";
return "";
}
public String  _formatplayercodefordisplay(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formatplayercodefordisplay", false))
	 {return ((String) Debug.delegate(ba, "formatplayercodefordisplay", new Object[] {_value}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub FormatPlayerCodeForDisplay(value As St";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Return value.Trim.ToUpperCase";
if (true) return _value.trim().toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return "";
}
public String  _startofflinedatarefresh(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startofflinedatarefresh", false))
	 {return ((String) Debug.delegate(ba, "startofflinedatarefresh", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub StartOfflineDataRefresh";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="offlineDataRefreshTimer.Enabled = False";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="localAdMinuteTimer.Interval = 1000";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (1000));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="localAdMinuteTimer.Enabled = True";
__ref._localadminutetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If playerCode = \"\" Then Return";
if ((__ref._playercode /*String*/ ).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="offlineDataRefreshTimer.Interval = OFFLINE_DATA_R";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._offline_data_refresh_ms /*int*/ ));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="offlineDataRefreshTimer.Enabled = True";
__ref._offlinedatarefreshtimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="TraceLog(\"Запущено обновление офлайн-метаданных.";
__ref._tracelog /*String*/ (null,"Запущено обновление офлайн-метаданных. Интервал="+BA.NumberToString(__ref._offline_data_refresh_ms /*int*/ )+" ms");
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="End Sub";
return "";
}
public String  _showinitialscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showinitialscreen", false))
	 {return ((String) Debug.delegate(ba, "showinitialscreen", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub ShowInitialScreen";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
 }else {
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*void*/ (null,__c.True);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="CallSubDelayed(Me, \"AutoStartSavedPlayer\")";
__c.CallSubDelayed(ba,this,"AutoStartSavedPlayer");
 };
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(b4j.example.b4xmainpage __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_resize", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub B4XPage_Resize (width As Int, height A";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If card.IsInitialized = False Then Return";
if (__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="LayoutUi(width, height)";
__ref._layoutui /*String*/ (null,_width,_height);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub LayoutUi(width As Int, height As Int)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim safeWidth As Int = Max(width, 320dip)";
_safewidth = (int) (__c.Max(_width,__c.DipToCurrent((int) (320))));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Dim safeHeight As Int = Max(height, 420dip)";
_safeheight = (int) (__c.Max(_height,__c.DipToCurrent((int) (420))));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim outerPad As Int = ScaleValue(safeWidth, 12dip";
_outerpad = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim horizontalPad As Int = ScaleValue(safeWidth,";
_horizontalpad = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim sectionGap As Int = ScaleValue(safeWidth, 24d";
_sectiongap = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (48)));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim contentGap As Int = ScaleValue(safeWidth, 8di";
_contentgap = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (8)),__c.DipToCurrent((int) (12)),__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim headerHeight As Int = ScaleValue(safeWidth, 5";
_headerheight = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (56)),__c.DipToCurrent((int) (64)),__c.DipToCurrent((int) (72)));
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Dim footerHeight As Int = headerHeight";
_footerheight = _headerheight;
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Dim cardWidth As Int = Min(620dip, safeWidth - ou";
_cardwidth = (int) (__c.Min(__c.DipToCurrent((int) (620)),_safewidth-_outerpad*2));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Dim preferredHeight As Int = Max(400dip, safeHeig";
_preferredheight = (int) (__c.Max(__c.DipToCurrent((int) (400)),_safeheight-_outerpad*2));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim cardHeight As Int = Min(preferredHeight, safe";
_cardheight = (int) (__c.Min(_preferredheight,_safeheight-__c.DipToCurrent((int) (8))));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim cardLeft As Int = (safeWidth - cardWidth) / 2";
_cardleft = (int) ((_safewidth-_cardwidth)/(double)2);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim cardTop As Int = (safeHeight - cardHeight) /";
_cardtop = (int) ((_safeheight-_cardheight)/(double)2);
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="card.SetLayoutAnimated(0, cardLeft, cardTop, card";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardleft,_cardtop,_cardwidth,_cardheight);
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="headerPane.SetLayoutAnimated(0, 0, 0, cardWidth,";
__ref._headerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_cardwidth,_headerheight);
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="contentPane.SetLayoutAnimated(0, 0, headerHeight";
__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_headerheight+_sectiongap/(double)2,_cardwidth,_cardheight-_headerheight-_footerheight-_sectiongap);
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="footerPane.SetLayoutAnimated(0, 0, cardHeight - f";
__ref._footerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,_cardheight-_footerheight,_cardwidth,_footerheight);
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Dim headerActionSize As Int = ScaleValue(safeWidt";
_headeractionsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (36)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (42)));
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="headerActionPane.SetLayoutAnimated(0, cardWidth -";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_cardwidth-_horizontalpad-_headeractionsize,(_headerheight-_headeractionsize)/(double)2,_headeractionsize,_headeractionsize);
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="lblHeaderAction.SetLayoutAnimated(0, 0, 0, header";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="lblHeader.SetLayoutAnimated(0, horizontalPad + he";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad+_headeractionsize+_contentgap,0,_cardwidth-(_horizontalpad+_headeractionsize+_contentgap)*2,_headerheight);
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="setupPane.SetLayoutAnimated(0, 0, 0, contentPane.";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="playerPane.SetLayoutAnimated(0, 0, 0, contentPane";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="Dim contentHeight As Int = contentPane.Height";
_contentheight = (int) (__ref._contentpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Dim heroHeight As Int = Max(160dip, (contentHeigh";
_heroheight = (int) (__c.Max(__c.DipToCurrent((int) (160)),(_contentheight-_sectiongap)/(double)2));
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="Dim detailHeight As Int = Max(120dip, contentHeig";
_detailheight = (int) (__c.Max(__c.DipToCurrent((int) (120)),_contentheight-_heroheight-_sectiongap));
RDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="Dim contentWidth As Int = cardWidth - horizontalP";
_contentwidth = (int) (_cardwidth-_horizontalpad*2);
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="setupHeroPane.SetLayoutAnimated(0, horizontalPad,";
__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="setupDetailPane.SetLayoutAnimated(0, horizontalPa";
__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="playerHeroPane.SetLayoutAnimated(0, horizontalPad";
__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_contentwidth,_heroheight);
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="playerDetailPane.SetLayoutAnimated(0, horizontalP";
__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,_heroheight+_sectiongap,_contentwidth,_detailheight);
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Dim controlSize As Int = ScaleValue(safeWidth, 15";
_controlsize = __ref._scalevalue /*int*/ (null,_safewidth,__c.DipToCurrent((int) (156)),__c.DipToCurrent((int) (172)),__c.DipToCurrent((int) (182)));
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Dim inputLeft As Int = (setupHeroPane.Width - con";
_inputleft = (int) ((__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="Dim inputTop As Int = Max(0, (setupHeroPane.Heigh";
_inputtop = (int) (__c.Max(0,(__ref._setupheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Dim accessOrbitSize As Int = controlSize + 20dip";
_accessorbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="accessCorePane.SetLayoutAnimated(0, inputLeft - 1";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft-__c.DipToCurrent((int) (10)),_inputtop-__c.DipToCurrent((int) (10)),_accessorbitsize,_accessorbitsize);
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="accessCirclePane.SetLayoutAnimated(0, inputLeft,";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputleft,_inputtop,_controlsize,_controlsize);
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="Dim inputPaneWidth As Int = controlSize - 34dip";
_inputpanewidth = (int) (_controlsize-__c.DipToCurrent((int) (34)));
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="Dim inputPaneHeight As Int = Min(72dip, controlSi";
_inputpaneheight = (int) (__c.Min(__c.DipToCurrent((int) (72)),_controlsize-__c.DipToCurrent((int) (62))));
RDebugUtils.currentLine=917550;
 //BA.debugLineNum = 917550;BA.debugLine="Dim inputPaneLeft As Int = (controlSize - inputPa";
_inputpaneleft = (int) ((_controlsize-_inputpanewidth)/(double)2);
RDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="Dim inputPaneTop As Int = (controlSize - inputPan";
_inputpanetop = (int) ((_controlsize-_inputpaneheight)/(double)2);
RDebugUtils.currentLine=917552;
 //BA.debugLineNum = 917552;BA.debugLine="accessInputPane.SetLayoutAnimated(0, inputPaneLef";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_inputpaneleft,_inputpanetop,_inputpanewidth,_inputpaneheight);
RDebugUtils.currentLine=917553;
 //BA.debugLineNum = 917553;BA.debugLine="Dim codeFieldHeight As Int = inputPaneHeight";
_codefieldheight = _inputpaneheight;
RDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="txtPlayerCodeView.SetLayoutAnimated(0, 0, 0, inpu";
__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_inputpanewidth,_codefieldheight);
RDebugUtils.currentLine=917556;
 //BA.debugLineNum = 917556;BA.debugLine="Dim orbitSize As Int = controlSize + 20dip";
_orbitsize = (int) (_controlsize+__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=917557;
 //BA.debugLineNum = 917557;BA.debugLine="Dim orbitLeft As Int = (playerHeroPane.Width - or";
_orbitleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_orbitsize)/(double)2);
RDebugUtils.currentLine=917558;
 //BA.debugLineNum = 917558;BA.debugLine="Dim controlLeft As Int = (playerHeroPane.Width -";
_controlleft = (int) ((__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_controlsize)/(double)2);
RDebugUtils.currentLine=917559;
 //BA.debugLineNum = 917559;BA.debugLine="Dim controlTop As Int = Max(0, (playerHeroPane.He";
_controltop = (int) (__c.Max(0,(__ref._playerheropane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_controlsize)/(double)2));
RDebugUtils.currentLine=917560;
 //BA.debugLineNum = 917560;BA.debugLine="orbitPane.SetLayoutAnimated(0, orbitLeft, control";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_orbitleft,_controltop-__c.DipToCurrent((int) (10)),_orbitsize,_orbitsize);
RDebugUtils.currentLine=917561;
 //BA.debugLineNum = 917561;BA.debugLine="playButtonPane.SetLayoutAnimated(0, controlLeft,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_controlleft,_controltop,_controlsize,_controlsize);
RDebugUtils.currentLine=917562;
 //BA.debugLineNum = 917562;BA.debugLine="lblPlayIcon.SetLayoutAnimated(0, 0, 1dip, control";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__c.DipToCurrent((int) (1)),_controlsize,_controlsize);
RDebugUtils.currentLine=917564;
 //BA.debugLineNum = 917564;BA.debugLine="setupPrimaryPane.SetLayoutAnimated(0, 0, 0, setup";
__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.38));
RDebugUtils.currentLine=917565;
 //BA.debugLineNum = 917565;BA.debugLine="setupStatusPane.SetLayoutAnimated(0, 0, setupPrim";
__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=917566;
 //BA.debugLineNum = 917566;BA.debugLine="btnSetupSubmit.SetLayoutAnimated(0, Max(0, (setup";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (132)))/(double)2),__c.Max(0,(__ref._setupprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (44)))/(double)2),__c.DipToCurrent((int) (132)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=917567;
 //BA.debugLineNum = 917567;BA.debugLine="lblSetupMessage.SetLayoutAnimated(0, 0, 0, setupS";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._setupstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917569;
 //BA.debugLineNum = 917569;BA.debugLine="playerPrimaryPane.SetLayoutAnimated(0, 0, 0, play";
__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__c.DipToCurrent((int) (56)),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.4));
RDebugUtils.currentLine=917570;
 //BA.debugLineNum = 917570;BA.debugLine="playerStatusPane.SetLayoutAnimated(0, 0, playerPr";
__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+_contentgap,__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerdetailpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_contentgap);
RDebugUtils.currentLine=917571;
 //BA.debugLineNum = 917571;BA.debugLine="lblStream.SetLayoutAnimated(0, 0, 0, playerPrimar";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._playerprimarypane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=917572;
 //BA.debugLineNum = 917572;BA.debugLine="Dim infoHeight As Int = Max(54dip, playerStatusPa";
_infoheight = (int) (__c.Max(__c.DipToCurrent((int) (54)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._confirmreservedheight /*int*/ (null)));
RDebugUtils.currentLine=917573;
 //BA.debugLineNum = 917573;BA.debugLine="lblInfo.SetLayoutAnimated(0, 0, 0, playerStatusPa";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_infoheight);
RDebugUtils.currentLine=917574;
 //BA.debugLineNum = 917574;BA.debugLine="If confirmPane.Visible Then";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
RDebugUtils.currentLine=917575;
 //BA.debugLineNum = 917575;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__c.DipToCurrent((int) (72)),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (72)));
 }else {
RDebugUtils.currentLine=917577;
 //BA.debugLineNum = 917577;BA.debugLine="confirmPane.SetLayoutAnimated(0, 0, playerStatus";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._playerstatuspane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),0);
 };
RDebugUtils.currentLine=917579;
 //BA.debugLineNum = 917579;BA.debugLine="btnConfirmYes.SetLayoutAnimated(0, Max(0, (confir";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (236)))/(double)2),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=917580;
 //BA.debugLineNum = 917580;BA.debugLine="btnConfirmNo.SetLayoutAnimated(0, btnConfirmYes.L";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (124)),__c.DipToCurrent((int) (14)),__c.DipToCurrent((int) (112)),__c.DipToCurrent((int) (44)));
RDebugUtils.currentLine=917582;
 //BA.debugLineNum = 917582;BA.debugLine="lblFooter.SetLayoutAnimated(0, horizontalPad, 0,";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_horizontalpad,0,_cardwidth-_horizontalpad*2,_footerheight);
RDebugUtils.currentLine=917583;
 //BA.debugLineNum = 917583;BA.debugLine="UpdateResponsiveStyles(safeWidth)";
__ref._updateresponsivestyles /*String*/ (null,_safewidth);
RDebugUtils.currentLine=917584;
 //BA.debugLineNum = 917584;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=917585;
 //BA.debugLineNum = 917585;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="If ShouldTriggerBreakNow = False Then Return";
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
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="TraceLog(\"Сработал таймер exact-break.\")";
__ref._tracelog /*String*/ (null,"Сработал таймер exact-break.");
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Wait For (FadeOutAndContinue) Complete (unused As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "breaktimer_tick"), __ref._fadeoutandcontinue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub ShouldTriggerBreakNow As Boolean";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="If scheduledBreakAt <= 0 Then Return False";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Return LocalNowTimestamp >= scheduledBreakAt";
if (true) return __ref._localnowtimestamp /*long*/ (null)>=__ref._scheduledbreakat /*long*/ ;
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="If isQueueTransitioning Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isqueuetransitioning /*boolean*/ ) { 
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
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="isQueueTransitioning = True";
__ref._isqueuetransitioning /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Dim fadeMs As Int";
_fadems = 0;
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="If currentMediaType = \"track\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((__ref._currentmediatype /*String*/ ).equals("track")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="fadeMs = STOP_FADE_MS";
_fadems = __ref._stop_fade_ms /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="fadeMs = 0";
_fadems = (int) (0);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="TraceLog(\"Переход через fade-out. currentType=\" &";
__ref._tracelog /*String*/ (null,"Переход через fade-out. currentType="+__ref._currentmediatype /*String*/ +", fadeMs="+BA.NumberToString(_fadems));
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="If activeAudioKey <> \"\" Then GetAudioByKey(active";
if (true) break;

case 13:
//if
this.state = 18;
if ((__ref._activeaudiokey /*String*/ ).equals("") == false) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ )._stop /*String*/ (null,_fadems);
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unuse";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fadeoutandcontinue"), __ref._playpreparedorloadnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 19;
return;
case 19:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="isQueueTransitioning = False";
__ref._isqueuetransitioning /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=6946832;
 //BA.debugLineNum = 6946832;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub BringToFront(view As B4XView)";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim jo As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="jo.RunMethod(\"toFront\", Null)";
_jo.RunMethod("toFront",(Object[])(__c.Null));
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_click", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_click", null));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub BtnConfirmNo_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public String  _hidepin(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "hidepin", false))
	 {return ((String) Debug.delegate(ba, "hidepin", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub HidePin";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="confirmPane.Visible = False";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub BtnConfirmNo_MouseEntered (eventData A";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub UpdateTextButtonAppearance(buttonView";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="fillColor = 0x12FFFFFF";
_fillcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="borderColor = 0x34FFFFFF";
_bordercolor = ((int)0x34ffffff);
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="textColor = 0xFFF2F7FB";
_textcolor = ((int)0xfff2f7fb);
 }else {
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="fillColor = 0x06FFFFFF";
_fillcolor = ((int)0x06ffffff);
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="borderColor = 0x1EFFFFFF";
_bordercolor = ((int)0x1effffff);
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="textColor = 0xFFE0E4EA";
_textcolor = ((int)0xffe0e4ea);
 };
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="buttonView.SetColorAndBorder(fillColor, 1dip, bor";
_buttonview.SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (12)));
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="SetPaneStyle(buttonView, \"-fx-cursor: hand; -fx-b";
__ref._setpanestyle /*String*/ (null,_buttonview,"-fx-cursor: hand; -fx-border-radius: 12; -fx-background-radius: 12; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_textcolor)+";");
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="buttonView.Font = xui.CreateDefaultBoldFont(13)";
_buttonview.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (13)));
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmno_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmno_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmno_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub BtnConfirmNo_MouseExited (eventData As";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="UpdateTextButtonAppearance(btnConfirmNo, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Wait For (SubmitClaim) Complete (unused As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnconfirmyes_click"), __ref._submitclaim /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="btnConfirmYes.Enabled = False";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="btnConfirmNo.Enabled = False";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="TraceLog(\"SubmitClaim. playerCode=\" & FormatPlaye";
__ref._tracelog /*String*/ (null,"SubmitClaim. playerCode="+__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ )+", deviceId="+__ref._deviceid /*String*/ );
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Wait For (FetchJsonWithTimeout(CLAIM_BASE_URL & \"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._claim_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createclaimparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
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
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="If data.GetDefault(\"ok\", False) = True Then";
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
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="isStarted = True";
__ref._isstarted /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="isStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=5373965;
 //BA.debugLineNum = 5373965;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="TraceLog(\"Claim OK. starting playback.\")";
__ref._tracelog /*String*/ (null,"Claim OK. starting playback.");
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "submitclaim"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 14;
return;
case 14:
//C
this.state = 10;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="Return True";
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
RDebugUtils.currentLine=5373974;
 //BA.debugLineNum = 5373974;BA.debugLine="TraceLog(\"Claim rejected. message=\" & ResolveErro";
__ref._tracelog /*String*/ (null,"Claim rejected. message="+__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="ShowClaimPrompt(ResolveErrorMessage(result, Messa";
__ref._showclaimprompt /*String*/ (null,__ref._resolveerrormessage /*String*/ (null,_result,__ref._messagevalue /*String*/ (null,"device_busy")));
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="btnConfirmYes.Enabled = True";
__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="btnConfirmNo.Enabled = True";
__ref._btnconfirmno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=5373978;
 //BA.debugLineNum = 5373978;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=5373979;
 //BA.debugLineNum = 5373979;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub BtnConfirmYes_MouseEntered (eventData";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _btnconfirmyes_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnconfirmyes_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnconfirmyes_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub BtnConfirmYes_MouseExited (eventData A";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="UpdateTextButtonAppearance(btnConfirmYes, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnconfirmyes /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If appScreenMode = \"settings\" Then";
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
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Wait For (LogoutPlayer) Complete (unused As Bool";
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
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Wait For (SubmitPlayerCode) Complete (unused2 As";
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
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="SaveValue(\"player_code\", \"\")";
__ref._savevalue /*String*/ (null,"player_code",(Object)(""));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="playerCode = \"\"";
__ref._playercode /*String*/  = "";
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Wait For (StopPlayer) Complete (unused As Boolean";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "logoutplayer"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim nextPlayer As String = NormalizePlayerCode(tx";
_nextplayer = __ref._normalizeplayercode /*String*/ (null,__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If nextPlayer = \"\" Then";
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
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="ShowSetupScreen(MessageValue(\"setup_invalid\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"setup_invalid"));
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="txtPlayerCode.RequestFocus";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="playerCode = nextPlayer";
__ref._playercode /*String*/  = _nextplayer;
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="SaveValue(\"player_code\", playerCode)";
__ref._savevalue /*String*/ (null,"player_code",(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="StartOfflineDataRefresh";
__ref._startofflinedatarefresh /*String*/ (null);
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="ShowPlayerScreen(True)";
__ref._showplayerscreen /*void*/ (null,parent.__c.True);
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub BtnSetupSubmit_MouseEntered (eventData";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, True)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.True);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public String  _btnsetupsubmit_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnsetupsubmit_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "btnsetupsubmit_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub BtnSetupSubmit_MouseExited (eventData";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="UpdateTextButtonAppearance(btnSetupSubmit, False)";
__ref._updatetextbuttonappearance /*String*/ (null,__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buildnexttrackfromdataplayback(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _workingcursors) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildnexttrackfromdataplayback", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "buildnexttrackfromdataplayback", new Object[] {_workingcursors}));}
ResumableSub_BuildNextTrackFromDataPlayback rsub = new ResumableSub_BuildNextTrackFromDataPlayback(this,__ref,_workingcursors);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuildNextTrackFromDataPlayback extends BA.ResumableSub {
public ResumableSub_BuildNextTrackFromDataPlayback(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _workingcursors) {
this.parent = parent;
this.__ref = __ref;
this._workingcursors = _workingcursors;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _workingcursors;
anywheresoftware.b4a.objects.collections.Map _emptyitem = null;
anywheresoftware.b4a.objects.collections.Map _currentslot = null;
anywheresoftware.b4a.objects.collections.Map _playlistdescriptor = null;
anywheresoftware.b4a.objects.collections.Map _playlistdata = null;
boolean _downloaded = false;
anywheresoftware.b4a.objects.collections.Map _selectedtrack = null;
anywheresoftware.b4a.objects.collections.Map _queueitem = null;

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
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim emptyItem As Map";
_emptyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="emptyItem.Initialize";
_emptyitem.Initialize();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim currentSlot As Map = dataResolver.ResolveCurr";
_currentslot = new anywheresoftware.b4a.objects.collections.Map();
_currentslot = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._resolvecurrentdataslot /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="If currentSlot.IsInitialized = False Or currentSl";
if (true) break;

case 1:
//if
this.state = 4;
if (_currentslot.IsInitialized()==parent.__c.False || _currentslot.getSize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="TraceLog(\"Не удалось определить текущий слот из";
__ref._tracelog /*String*/ (null,"Не удалось определить текущий слот из data.");
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Dim playlistDescriptor As Map = dataResolver.Choo";
_playlistdescriptor = new anywheresoftware.b4a.objects.collections.Map();
_playlistdescriptor = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._choosenextplaylistdescriptor /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_workingcursors);
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="If playlistDescriptor.IsInitialized = False Or pl";
if (true) break;

case 5:
//if
this.state = 8;
if (_playlistdescriptor.IsInitialized()==parent.__c.False || _playlistdescriptor.getSize()==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="TraceLog(\"Не удалось выбрать playlist для текуще";
__ref._tracelog /*String*/ (null,"Не удалось выбрать playlist для текущего слота.");
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="Dim playlistData As Map = dataResolver.LoadCached";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="If playlistData.IsInitialized = False Or playlist";
if (true) break;

case 9:
//if
this.state = 24;
if (_playlistdata.IsInitialized()==parent.__c.False || _playlistdata.getSize()==0) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="Wait For (EnsureSinglePlaylistMetadata(playlistD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "buildnexttrackfromdataplayback"), __ref._ensuresingleplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playlistdescriptor));
this.state = 33;
return;
case 33:
//C
this.state = 12;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="If downloaded = False Then Return emptyItem";
if (true) break;

case 12:
//if
this.state = 17;
if (_downloaded==parent.__c.False) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="playlistData = dataResolver.LoadCachedPlaylistMe";
_playlistdata = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._loadcachedplaylistmetadata /*anywheresoftware.b4a.objects.collections.Map*/ (null,BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="If playlistData.IsInitialized = False Or playlis";
if (true) break;

case 18:
//if
this.state = 23;
if (_playlistdata.IsInitialized()==parent.__c.False || _playlistdata.getSize()==0) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="Dim selectedTrack As Map = dataResolver.ChooseRan";
_selectedtrack = new anywheresoftware.b4a.objects.collections.Map();
_selectedtrack = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._chooserandomtrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_playlistdata);
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="If selectedTrack.IsInitialized = False Or selecte";
if (true) break;

case 25:
//if
this.state = 28;
if (_selectedtrack.IsInitialized()==parent.__c.False || _selectedtrack.getSize()==0) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="TraceLog(\"Не удалось выбрать трек из playlist. p";
__ref._tracelog /*String*/ (null,"Не удалось выбрать трек из playlist. playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=1703959;
 //BA.debugLineNum = 1703959;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="Dim queueItem As Map = dataResolver.CreateQueueTr";
_queueitem = new anywheresoftware.b4a.objects.collections.Map();
_queueitem = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._createqueuetrackfromplaylist /*anywheresoftware.b4a.objects.collections.Map*/ (null,_currentslot,_playlistdescriptor,_selectedtrack,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=1703962;
 //BA.debugLineNum = 1703962;BA.debugLine="If IsValidDataTrackItem(queueItem) = False Then";
if (true) break;

case 29:
//if
this.state = 32;
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_queueitem)==parent.__c.False) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="TraceLog(\"Локальный track-item собран неполно. p";
__ref._tracelog /*String*/ (null,"Локальный track-item собран неполно. playlistId="+BA.ObjectToString(_playlistdescriptor.GetDefault((Object)("id"),(Object)("")))+", trackId="+BA.ObjectToString(_selectedtrack.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=1703964;
 //BA.debugLineNum = 1703964;BA.debugLine="Return emptyItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_emptyitem));return;};
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703966;
 //BA.debugLineNum = 1703966;BA.debugLine="dataResolver.RememberResolvedTrack(queueItem.GetD";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._rememberresolvedtrack /*String*/ (null,BA.ObjectToString(_queueitem.GetDefault((Object)("id"),(Object)(""))));
RDebugUtils.currentLine=1703967;
 //BA.debugLineNum = 1703967;BA.debugLine="Return queueItem";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_queueitem));return;};
RDebugUtils.currentLine=1703968;
 //BA.debugLineNum = 1703968;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim cachedPlaylistIndex As Map = offlineStoreServ";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getcachedplaylistindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Wait For (DownloadOfflinePlaylistMetadata(descrip";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensuresingleplaylistmetadata"), __ref._downloadofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descriptor,_cachedplaylistindex));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="If downloaded Then offlineStoreService.SaveCached";
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
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Return downloaded";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_downloaded));return;};
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _isvaliddatatrackitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "isvaliddatatrackitem", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddatatrackitem", new Object[] {_item}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub IsValidDataTrackItem(item As Map) As B";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If item.IsInitialized = False Or item.Size = 0 Th";
if (_item.IsInitialized()==__c.False || _item.getSize()==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If item.GetDefault(\"type\", \"\") <> \"track\" Then Re";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="If item.GetDefault(\"id\", \"\") = \"\" Then Return Fal";
if ((_item.GetDefault((Object)("id"),(Object)(""))).equals((Object)(""))) { 
if (true) return __c.False;};
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="End Sub";
return false;
}
public String  _buildparams(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "buildparams", false))
	 {return ((String) Debug.delegate(ba, "buildparams", new Object[] {_params}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _key = "";
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub BuildParams(params As Map) As String";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="For Each key As String In params.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _params.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="If sb.Length > 0 Then sb.Append(\"&\")";
if (_sb.getLength()>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="sb.Append(UrlEncode(key)).Append(\"=\").Append(Url";
_sb.Append(__ref._urlencode /*String*/ (null,(Object)(_key))).Append("=").Append(__ref._urlencode /*String*/ (null,_params.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="End Sub";
return "";
}
public String  _urlencode(b4j.example.b4xmainpage __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "urlencode", false))
	 {return ((String) Debug.delegate(ba, "urlencode", new Object[] {_value}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub UrlEncode(value As Object) As String";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="jo.InitializeStatic(\"java.net.URLEncoder\")";
_jo.InitializeStatic("java.net.URLEncoder");
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Return jo.RunMethod(\"encode\", Array As Object(\"\"";
if (true) return BA.ObjectToString(_jo.RunMethod("encode",new Object[]{(Object)(""+BA.ObjectToString(_value)),(Object)("UTF-8")}));
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.example.b4xmainpage __ref,String _text,float _fontsize,int _textcolor,boolean _bold,boolean _wraptext) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_text,_fontsize,_textcolor,_bold,_wraptext}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub CreateLabel(text As String, fontSize A";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Return UiStyle.CreateLabel(xui, text, fontSize, t";
if (true) return _uistyle._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ ,_text,_fontsize,_textcolor,_bold,_wraptext);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextbutton(b4j.example.b4xmainpage __ref,String _text,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createtextbutton", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextbutton", new Object[] {_text,_eventname}));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub CreateTextButton(text As String, event";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="btn.Initialize(eventName)";
_btn.Initialize(ba,_eventname);
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="xbtn.Text = text.ToUpperCase";
_xbtn.setText(_text.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="UpdateTextButtonAppearance(xbtn, False)";
__ref._updatetextbuttonappearance /*String*/ (null,_xbtn,__c.False);
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="Return xbtn";
if (true) return _xbtn;
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="End Sub";
return null;
}
public String  _setpanestyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpanestyle", false))
	 {return ((String) Debug.delegate(ba, "setpanestyle", new Object[] {_view,_style}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub SetPaneStyle(view As B4XView, style As";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="UiStyle.SetPaneStyle(view, style)";
_uistyle._setpanestyle /*String*/ (_view,_style);
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="End Sub";
return "";
}
public String  _colortocss(b4j.example.b4xmainpage __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "colortocss", false))
	 {return ((String) Debug.delegate(ba, "colortocss", new Object[] {_color}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub ColorToCss(color As Int) As String";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Return UiStyle.ColorToCss(color)";
if (true) return _uistyle._colortocss /*String*/ (_color);
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="End Sub";
return "";
}
public String  _setpickonbounds(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setpickonbounds", false))
	 {return ((String) Debug.delegate(ba, "setpickonbounds", new Object[] {_view,_value}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub SetPickOnBounds(view As B4XView, value";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="UiStyle.SetPickOnBounds(view, value)";
_uistyle._setpickonbounds /*String*/ (_view,_value);
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub UpdateHeaderActionAppearance(isHovered";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Dim textColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="fillColor = 0x14FFFFFF";
_fillcolor = ((int)0x14ffffff);
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="borderColor = 0x30FFFFFF";
_bordercolor = ((int)0x30ffffff);
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="textColor = 0xFFDDE6EF";
_textcolor = ((int)0xffdde6ef);
 }else {
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="fillColor = 0x08FFFFFF";
_fillcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="borderColor = 0x18FFFFFF";
_bordercolor = ((int)0x18ffffff);
RDebugUtils.currentLine=9568267;
 //BA.debugLineNum = 9568267;BA.debugLine="textColor = 0xFFB9C0C9";
_textcolor = ((int)0xffb9c0c9);
 };
RDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="headerActionPane.SetColorAndBorder(fillColor, 1di";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="SetPaneStyle(headerActionPane, \"-fx-cursor: hand;";
__ref._setpanestyle /*String*/ (null,__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-cursor: hand; -fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=9568271;
 //BA.debugLineNum = 9568271;BA.debugLine="SetLabelStyle(lblHeaderAction, \"-fx-alignment: ce";
__ref._setlabelstyle /*String*/ (null,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,_textcolor)+";");
RDebugUtils.currentLine=9568272;
 //BA.debugLineNum = 9568272;BA.debugLine="ApplyMaterialIconFont(lblHeaderAction, headerActi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._headeractionfontsize /*float*/ );
RDebugUtils.currentLine=9568273;
 //BA.debugLineNum = 9568273;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub UpdatePlayButtonAppearance(isHovered A";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Dim backgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="If isStarted Then";
if (__ref._isstarted /*boolean*/ ) { 
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
 }else {
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="backgroundColor = 0x08FFFFFF";
_backgroundcolor = ((int)0x08ffffff);
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
 };
 }else {
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="If isHovered Then";
if (_ishovered) { 
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="backgroundColor = 0x12FFFFFF";
_backgroundcolor = ((int)0x12ffffff);
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="borderColor = 0x55D0FF71";
_bordercolor = ((int)0x55d0ff71);
 }else {
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="backgroundColor = 0x07FFFFFF";
_backgroundcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="borderColor = 0x40FFFFFF";
_bordercolor = ((int)0x40ffffff);
 };
 };
RDebugUtils.currentLine=9175061;
 //BA.debugLineNum = 9175061;BA.debugLine="If isStarted Or isHovered Then";
if (__ref._isstarted /*boolean*/  || _ishovered) { 
RDebugUtils.currentLine=9175062;
 //BA.debugLineNum = 9175062;BA.debugLine="orbitBorderColor = 0x66D0FF71";
_orbitbordercolor = ((int)0x66d0ff71);
 }else {
RDebugUtils.currentLine=9175064;
 //BA.debugLineNum = 9175064;BA.debugLine="orbitBorderColor = 0x22D0FF71";
_orbitbordercolor = ((int)0x22d0ff71);
 };
RDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="playButtonPane.SetColorAndBorder(backgroundColor,";
__ref._playbuttonpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_backgroundcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9175067;
 //BA.debugLineNum = 9175067;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9175068;
 //BA.debugLineNum = 9175068;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub UpdateCodeInputAppearance(isFocused As";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim fillColor As Int";
_fillcolor = 0;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim borderColor As Int";
_bordercolor = 0;
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Dim orbitBorderColor As Int";
_orbitbordercolor = 0;
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="If isFocused Then";
if (_isfocused) { 
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="fillColor = 0x10FFFFFF";
_fillcolor = ((int)0x10ffffff);
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="borderColor = 0x77FFFFFF";
_bordercolor = ((int)0x77ffffff);
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="orbitBorderColor = 0x88FFFFFF";
_orbitbordercolor = ((int)0x88ffffff);
 }else {
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="fillColor = 0x07FFFFFF";
_fillcolor = ((int)0x07ffffff);
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="borderColor = 0x55FFFFFF";
_bordercolor = ((int)0x55ffffff);
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="orbitBorderColor = 0x66FFFFFF";
_orbitbordercolor = ((int)0x66ffffff);
 };
RDebugUtils.currentLine=9699341;
 //BA.debugLineNum = 9699341;BA.debugLine="accessCirclePane.SetColorAndBorder(fillColor, 4di";
__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_fillcolor,__c.DipToCurrent((int) (4)),_bordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="accessCorePane.SetColorAndBorder(xui.Color_Transp";
__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),_orbitbordercolor,__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9699343;
 //BA.debugLineNum = 9699343;BA.debugLine="accessInputPane.SetColorAndBorder(xui.Color_Trans";
__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=9699344;
 //BA.debugLineNum = 9699344;BA.debugLine="SetPaneStyle(accessCirclePane, \"-fx-background-ra";
__ref._setpanestyle /*String*/ (null,__ref._accesscirclepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=9699345;
 //BA.debugLineNum = 9699345;BA.debugLine="SetPaneStyle(accessCorePane, \"-fx-background-radi";
__ref._setpanestyle /*String*/ (null,__ref._accesscorepane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-radius: 999; -fx-border-radius: 999;");
RDebugUtils.currentLine=9699346;
 //BA.debugLineNum = 9699346;BA.debugLine="SetPaneStyle(accessInputPane, \"-fx-background-col";
__ref._setpanestyle /*String*/ (null,__ref._accessinputpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0;");
RDebugUtils.currentLine=9699347;
 //BA.debugLineNum = 9699347;BA.debugLine="SetPaneStyle(txtPlayerCodeView, \"-fx-background-c";
__ref._setpanestyle /*String*/ (null,__ref._txtplayercodeview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-background-color: transparent; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xfff2f7fb))+"; -fx-prompt-text-fill: "+__ref._colortocss /*String*/ (null,((int)0x66ffffff))+"; -fx-highlight-fill: transparent; -fx-highlight-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xfff2f7fb))+"; -fx-display-caret: true; -fx-alignment: center; -fx-background-insets: 0; -fx-background-radius: 0; -fx-border-width: 0; -fx-border-radius: 0; -fx-font-size: "+BA.NumberToString(__ref._codefontsize /*float*/ )+"px; -fx-font-weight: bold; -fx-padding: 0 0 2 0;");
RDebugUtils.currentLine=9699348;
 //BA.debugLineNum = 9699348;BA.debugLine="End Sub";
return "";
}
public boolean  _cancrossfadeprepareditem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cancrossfadeprepareditem", false))
	 {return ((Boolean) Debug.delegate(ba, "cancrossfadeprepareditem", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub CanCrossfadePreparedItem As Boolean";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If isQueueTransitioning Or isCrossfadeTriggered T";
if (__ref._isqueuetransitioning /*boolean*/  || __ref._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If currentMediaType <> \"track\" Then Return False";
if ((__ref._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((__ref._preparedaudiokey /*String*/ ).equals("") || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="If preparedItem.GetDefault(\"type\", \"\") <> \"track\"";
if ((__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("track")) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="End Sub";
return false;
}
public boolean  _canstartpreparedontracktail(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "canstartpreparedontracktail", false))
	 {return ((Boolean) Debug.delegate(ba, "canstartpreparedontracktail", null));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub CanStartPreparedOnTrackTail As Boolean";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="If isQueueTransitioning Or isCrossfadeTriggered T";
if (__ref._isqueuetransitioning /*boolean*/  || __ref._iscrossfadetriggered /*boolean*/ ) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="If currentMediaType <> \"track\" Then Return False";
if ((__ref._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((__ref._preparedaudiokey /*String*/ ).equals("") || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Return preparedItem.GetDefault(\"type\", \"\") = \"ad\"";
if (true) return (__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)(""))).equals((Object)("ad"));
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="End Sub";
return false;
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
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="j.Download(CONNECTIVITY_CHECK_URL & \"?t=\" & DateT";
_j._download /*String*/ (null,__ref._connectivity_check_url /*String*/ +"?t="+BA.NumberToString(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="j.GetRequest.Timeout = CONNECTIVITY_CHECK_TIMEOUT";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(__ref._connectivity_check_timeout_ms /*int*/ );
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "checkexternalconnectivity"), (Object)(_j));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="Dim ok As Boolean = j.Success";
_ok = _j._success /*boolean*/ ;
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="Return ok";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ok));return;};
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Private Const PLAYER_BASE_URL As String = \"https:";
_player_base_url = "https://play.fon.fm/meta";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Private Const NEXT_BASE_URL As String = \"https://";
_next_base_url = "https://play.fon.fm/next";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Private Const CLAIM_BASE_URL As String = \"https:/";
_claim_base_url = "https://play.fon.fm/claim";
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private Const HISTORY_BASE_URL As String = \"https";
_history_base_url = "https://play.fon.fm/history";
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private Const DATA_BASE_URL As String = \"https://";
_data_base_url = "https://play.fon.fm/data.php";
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private Const PLAYLIST_CDN_BASE_URL As String = \"";
_playlist_cdn_base_url = "https://cdn.fon.fm/data/playlists/";
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private Const CONNECTIVITY_CHECK_URL As String =";
_connectivity_check_url = "https://radiosparx.ru/img/logo-dark.svg";
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private Const APP_VERSION As String = \"1.0.1\"";
_app_version = "1.0.1";
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private Const USE_DATA_PLAYBACK_RESOLVER As Boole";
_use_data_playback_resolver = __c.True;
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private Const ICON_PLAY As String = Chr(0xE037)";
_icon_play = BA.ObjectToString(__c.Chr(((int)0xe037)));
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private Const ICON_STOP As String = Chr(0xE047)";
_icon_stop = BA.ObjectToString(__c.Chr(((int)0xe047)));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Private Const ICON_MORE As String = Chr(0xE5D3)";
_icon_more = BA.ObjectToString(__c.Chr(((int)0xe5d3)));
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="Private Const ICON_CLOSE As String = Chr(0xE5CD)";
_icon_close = BA.ObjectToString(__c.Chr(((int)0xe5cd)));
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="Private Const PREFETCH_SECONDS As Int = 10";
_prefetch_seconds = (int) (10);
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Private Const STOP_FADE_MS As Int = 3000";
_stop_fade_ms = (int) (3000);
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="Private Const ORBIT_FADE_MS As Int = 3000";
_orbit_fade_ms = (int) (3000);
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="Private Const START_FADE_MS As Int = 1500";
_start_fade_ms = (int) (1500);
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="Private Const TRACK_OVERLAP_MS As Int = 1800";
_track_overlap_ms = (int) (1800);
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="Private Const AD_TAIL_OVERLAP_MS As Int = 350";
_ad_tail_overlap_ms = (int) (350);
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="Private Const HISTORY_LOG_DELAY_MS As Int = 15000";
_history_log_delay_ms = (int) (15000);
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="Private Const OFFLINE_DATA_REFRESH_MS As Int = 5";
_offline_data_refresh_ms = (int) (5*60*1000);
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="Private Const FETCH_TIMEOUT_MS As Int = 8000";
_fetch_timeout_ms = (int) (8000);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="Private Const CONNECTIVITY_CHECK_TIMEOUT_MS As In";
_connectivity_check_timeout_ms = (int) (5000);
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="Private Const PAUSE_RETRY_DELAY As Int = 300000";
_pause_retry_delay = (int) (300000);
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="Private Const OFFLINE_RETRY_DELAY_INITIAL As Int";
_offline_retry_delay_initial = (int) (5000);
RDebugUtils.currentLine=458778;
 //BA.debugLineNum = 458778;BA.debugLine="Private Const OFFLINE_RETRY_DELAY_MAX As Int = 30";
_offline_retry_delay_max = (int) (30000);
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="Private Const SERVER_RETRY_DELAY_INITIAL As Int =";
_server_retry_delay_initial = (int) (10000);
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="Private Const SERVER_RETRY_DELAY_MAX As Int = 600";
_server_retry_delay_max = (int) (60000);
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="Private Const BLOCKED_RETRY_DELAY As Int = 60000";
_blocked_retry_delay = (int) (60000);
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="Private rootView As B4XView";
_rootview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="Private storageDir As String";
_storagedir = "";
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="Private storageFile As String = \"player_state.jso";
_storagefile = "player_state.json";
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="Private storageDbName As String = \"PlayerState\"";
_storagedbname = "PlayerState";
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="Private offlineDataFile As String = \"offline_data";
_offlinedatafile = "offline_data.json";
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="Private offlinePlaylistRequirementsFile As String";
_offlineplaylistrequirementsfile = "offline_playlist_requirements.json";
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="Private offlinePlaylistsDirName As String = \"play";
_offlineplaylistsdirname = "playlists";
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="Private debugResponsesDir As String";
_debugresponsesdir = "";
RDebugUtils.currentLine=458792;
 //BA.debugLineNum = 458792;BA.debugLine="Private card As B4XView";
_card = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458793;
 //BA.debugLineNum = 458793;BA.debugLine="Private headerPane As B4XView";
_headerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="Private headerActionPane As B4XView";
_headeractionpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458795;
 //BA.debugLineNum = 458795;BA.debugLine="Private contentPane As B4XView";
_contentpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="Private footerPane As B4XView";
_footerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458797;
 //BA.debugLineNum = 458797;BA.debugLine="Private setupPane As B4XView";
_setuppane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458798;
 //BA.debugLineNum = 458798;BA.debugLine="Private playerPane As B4XView";
_playerpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="Private setupHeroPane As B4XView";
_setupheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458800;
 //BA.debugLineNum = 458800;BA.debugLine="Private setupDetailPane As B4XView";
_setupdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458801;
 //BA.debugLineNum = 458801;BA.debugLine="Private setupPrimaryPane As B4XView";
_setupprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458802;
 //BA.debugLineNum = 458802;BA.debugLine="Private setupStatusPane As B4XView";
_setupstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458803;
 //BA.debugLineNum = 458803;BA.debugLine="Private playerHeroPane As B4XView";
_playerheropane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458804;
 //BA.debugLineNum = 458804;BA.debugLine="Private playerDetailPane As B4XView";
_playerdetailpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458805;
 //BA.debugLineNum = 458805;BA.debugLine="Private playerPrimaryPane As B4XView";
_playerprimarypane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458806;
 //BA.debugLineNum = 458806;BA.debugLine="Private playerStatusPane As B4XView";
_playerstatuspane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458807;
 //BA.debugLineNum = 458807;BA.debugLine="Private orbitPane As B4XView";
_orbitpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458808;
 //BA.debugLineNum = 458808;BA.debugLine="Private playButtonPane As B4XView";
_playbuttonpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458809;
 //BA.debugLineNum = 458809;BA.debugLine="Private confirmPane As B4XView";
_confirmpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458810;
 //BA.debugLineNum = 458810;BA.debugLine="Private accessCirclePane As B4XView";
_accesscirclepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458811;
 //BA.debugLineNum = 458811;BA.debugLine="Private accessCorePane As B4XView";
_accesscorepane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458812;
 //BA.debugLineNum = 458812;BA.debugLine="Private accessInputPane As B4XView";
_accessinputpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458814;
 //BA.debugLineNum = 458814;BA.debugLine="Private lblHeader As B4XView";
_lblheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458815;
 //BA.debugLineNum = 458815;BA.debugLine="Private lblHeaderAction As B4XView";
_lblheaderaction = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458816;
 //BA.debugLineNum = 458816;BA.debugLine="Private lblPlayIcon As B4XView";
_lblplayicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458817;
 //BA.debugLineNum = 458817;BA.debugLine="Private lblStream As B4XView";
_lblstream = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458818;
 //BA.debugLineNum = 458818;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458819;
 //BA.debugLineNum = 458819;BA.debugLine="Private lblFooter As B4XView";
_lblfooter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458820;
 //BA.debugLineNum = 458820;BA.debugLine="Private lblSetupMessage As B4XView";
_lblsetupmessage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458822;
 //BA.debugLineNum = 458822;BA.debugLine="Private txtPlayerCode As TextField";
_txtplayercode = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458823;
 //BA.debugLineNum = 458823;BA.debugLine="Private txtPlayerCodeView As B4XView";
_txtplayercodeview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458824;
 //BA.debugLineNum = 458824;BA.debugLine="Private btnSetupSubmit As B4XView";
_btnsetupsubmit = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458825;
 //BA.debugLineNum = 458825;BA.debugLine="Private btnConfirmYes As B4XView";
_btnconfirmyes = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458826;
 //BA.debugLineNum = 458826;BA.debugLine="Private btnConfirmNo As B4XView";
_btnconfirmno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458827;
 //BA.debugLineNum = 458827;BA.debugLine="Private playIconBaseSize As Float";
_playiconbasesize = 0f;
RDebugUtils.currentLine=458828;
 //BA.debugLineNum = 458828;BA.debugLine="Private stopIconBaseSize As Float";
_stopiconbasesize = 0f;
RDebugUtils.currentLine=458829;
 //BA.debugLineNum = 458829;BA.debugLine="Private headerActionFontSize As Float";
_headeractionfontsize = 0f;
RDebugUtils.currentLine=458830;
 //BA.debugLineNum = 458830;BA.debugLine="Private codeFontSize As Float";
_codefontsize = 0f;
RDebugUtils.currentLine=458831;
 //BA.debugLineNum = 458831;BA.debugLine="Private isCodeInputFocused As Boolean";
_iscodeinputfocused = false;
RDebugUtils.currentLine=458833;
 //BA.debugLineNum = 458833;BA.debugLine="Private audioPrimary As AudioPlayer";
_audioprimary = new b4j.example.audioplayer();
RDebugUtils.currentLine=458834;
 //BA.debugLineNum = 458834;BA.debugLine="Private audioSecondary As AudioPlayer";
_audiosecondary = new b4j.example.audioplayer();
RDebugUtils.currentLine=458835;
 //BA.debugLineNum = 458835;BA.debugLine="Private localAdScheduler As AdScheduler";
_localadscheduler = new b4j.example.adscheduler();
RDebugUtils.currentLine=458836;
 //BA.debugLineNum = 458836;BA.debugLine="Private dataResolver As DataPlaybackResolver";
_dataresolver = new b4j.example.dataplaybackresolver();
RDebugUtils.currentLine=458837;
 //BA.debugLineNum = 458837;BA.debugLine="Private offlineStoreService As OfflineStore";
_offlinestoreservice = new b4j.example.offlinestore();
RDebugUtils.currentLine=458838;
 //BA.debugLineNum = 458838;BA.debugLine="Private appTraceService As TraceService";
_apptraceservice = new b4j.example.traceservice();
RDebugUtils.currentLine=458839;
 //BA.debugLineNum = 458839;BA.debugLine="Private mediaCacheService As MediaCache";
_mediacacheservice = new b4j.example.mediacache();
RDebugUtils.currentLine=458840;
 //BA.debugLineNum = 458840;BA.debugLine="Private storage As KeyValueStore";
_storage = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=458841;
 //BA.debugLineNum = 458841;BA.debugLine="Private playQueue As List";
_playqueue = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458842;
 //BA.debugLineNum = 458842;BA.debugLine="Private messages As Map";
_messages = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458843;
 //BA.debugLineNum = 458843;BA.debugLine="Private traceLogLimit As Int = 1000";
_traceloglimit = (int) (1000);
RDebugUtils.currentLine=458844;
 //BA.debugLineNum = 458844;BA.debugLine="Private serverSnapshotLimit As Int = 30";
_serversnapshotlimit = (int) (30);
RDebugUtils.currentLine=458845;
 //BA.debugLineNum = 458845;BA.debugLine="Private offlineData As Map";
_offlinedata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458847;
 //BA.debugLineNum = 458847;BA.debugLine="Private retryTimer As Timer";
_retrytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=458848;
 //BA.debugLineNum = 458848;BA.debugLine="Private breakTimer As Timer";
_breaktimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=458849;
 //BA.debugLineNum = 458849;BA.debugLine="Private historyTimer As Timer";
_historytimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=458850;
 //BA.debugLineNum = 458850;BA.debugLine="Private orbitTimer As Timer";
_orbittimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=458851;
 //BA.debugLineNum = 458851;BA.debugLine="Private offlineDataRefreshTimer As Timer";
_offlinedatarefreshtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=458852;
 //BA.debugLineNum = 458852;BA.debugLine="Private localAdMinuteTimer As Timer";
_localadminutetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=458853;
 //BA.debugLineNum = 458853;BA.debugLine="Private machineGuidShell As Shell";
_machineguidshell = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=458855;
 //BA.debugLineNum = 458855;BA.debugLine="Private playerCode As String";
_playercode = "";
RDebugUtils.currentLine=458856;
 //BA.debugLineNum = 458856;BA.debugLine="Private deviceId As String";
_deviceid = "";
RDebugUtils.currentLine=458857;
 //BA.debugLineNum = 458857;BA.debugLine="Private appScreenMode As String";
_appscreenmode = "";
RDebugUtils.currentLine=458858;
 //BA.debugLineNum = 458858;BA.debugLine="Private nextStartMode As String";
_nextstartmode = "";
RDebugUtils.currentLine=458859;
 //BA.debugLineNum = 458859;BA.debugLine="Private currentTrackUrl As String";
_currenttrackurl = "";
RDebugUtils.currentLine=458860;
 //BA.debugLineNum = 458860;BA.debugLine="Private currentMediaType As String";
_currentmediatype = "";
RDebugUtils.currentLine=458861;
 //BA.debugLineNum = 458861;BA.debugLine="Private activeAudioKey As String";
_activeaudiokey = "";
RDebugUtils.currentLine=458862;
 //BA.debugLineNum = 458862;BA.debugLine="Private preparedAudioKey As String";
_preparedaudiokey = "";
RDebugUtils.currentLine=458863;
 //BA.debugLineNum = 458863;BA.debugLine="Private historyItem As Map";
_historyitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458864;
 //BA.debugLineNum = 458864;BA.debugLine="Private activeItem As Map";
_activeitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458865;
 //BA.debugLineNum = 458865;BA.debugLine="Private preparedItem As Map";
_prepareditem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458866;
 //BA.debugLineNum = 458866;BA.debugLine="Private pendingPlayAudioKey As String";
_pendingplayaudiokey = "";
RDebugUtils.currentLine=458867;
 //BA.debugLineNum = 458867;BA.debugLine="Private pendingPrepareAudioKey As String";
_pendingprepareaudiokey = "";
RDebugUtils.currentLine=458868;
 //BA.debugLineNum = 458868;BA.debugLine="Private pendingPlayItem As Map";
_pendingplayitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458869;
 //BA.debugLineNum = 458869;BA.debugLine="Private pendingPrepareItem As Map";
_pendingprepareitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458870;
 //BA.debugLineNum = 458870;BA.debugLine="Private pendingPlayFadeInMs As Int";
_pendingplayfadeinms = 0;
RDebugUtils.currentLine=458871;
 //BA.debugLineNum = 458871;BA.debugLine="Private historyStartedAtTicks As Long";
_historystartedatticks = 0L;
RDebugUtils.currentLine=458872;
 //BA.debugLineNum = 458872;BA.debugLine="Private initialStartFadePending As Boolean";
_initialstartfadepending = false;
RDebugUtils.currentLine=458874;
 //BA.debugLineNum = 458874;BA.debugLine="Private isStarted As Boolean";
_isstarted = false;
RDebugUtils.currentLine=458875;
 //BA.debugLineNum = 458875;BA.debugLine="Private isStoppedByUser As Boolean = True";
_isstoppedbyuser = __c.True;
RDebugUtils.currentLine=458876;
 //BA.debugLineNum = 458876;BA.debugLine="Private isStopping As Boolean";
_isstopping = false;
RDebugUtils.currentLine=458877;
 //BA.debugLineNum = 458877;BA.debugLine="Private isQueueTransitioning As Boolean";
_isqueuetransitioning = false;
RDebugUtils.currentLine=458878;
 //BA.debugLineNum = 458878;BA.debugLine="Private prefetchDone As Boolean";
_prefetchdone = false;
RDebugUtils.currentLine=458879;
 //BA.debugLineNum = 458879;BA.debugLine="Private isCrossfadeTriggered As Boolean";
_iscrossfadetriggered = false;
RDebugUtils.currentLine=458881;
 //BA.debugLineNum = 458881;BA.debugLine="Private offlineRetryDelay As Int = OFFLINE_RETRY_";
_offlineretrydelay = __ref._offline_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=458882;
 //BA.debugLineNum = 458882;BA.debugLine="Private serverRetryDelay As Int = SERVER_RETRY_DE";
_serverretrydelay = __ref._server_retry_delay_initial /*int*/ ;
RDebugUtils.currentLine=458883;
 //BA.debugLineNum = 458883;BA.debugLine="Private playlistIndex As Int = -1";
_playlistindex = (int) (-1);
RDebugUtils.currentLine=458884;
 //BA.debugLineNum = 458884;BA.debugLine="Private scheduledBreakAt As Long = -1";
_scheduledbreakat = (long) (-1);
RDebugUtils.currentLine=458885;
 //BA.debugLineNum = 458885;BA.debugLine="Private orbitPulseStep As Int";
_orbitpulsestep = 0;
RDebugUtils.currentLine=458886;
 //BA.debugLineNum = 458886;BA.debugLine="Private orbitFadeValue As Double";
_orbitfadevalue = 0;
RDebugUtils.currentLine=458887;
 //BA.debugLineNum = 458887;BA.debugLine="Private orbitFadeTarget As Double";
_orbitfadetarget = 0;
RDebugUtils.currentLine=458888;
 //BA.debugLineNum = 458888;BA.debugLine="Private isOfflineDataRefreshInProgress As Boolean";
_isofflinedatarefreshinprogress = false;
RDebugUtils.currentLine=458889;
 //BA.debugLineNum = 458889;BA.debugLine="End Sub";
return "";
}
public String  _clearexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "clearexactbreakstate", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub ClearExactBreakState";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="scheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="End Sub";
return "";
}
public String  _clearhistorylogtimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearhistorylogtimer", false))
	 {return ((String) Debug.delegate(ba, "clearhistorylogtimer", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub ClearHistoryLogTimer";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="historyTimer.Enabled = False";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="historyItem.Initialize";
__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="historyStartedAtTicks = 0";
__ref._historystartedatticks /*long*/  = (long) (0);
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="End Sub";
return "";
}
public String  _clearpendingplaystate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpendingplaystate", false))
	 {return ((String) Debug.delegate(ba, "clearpendingplaystate", null));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub ClearPendingPlayState";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="pendingPlayAudioKey = \"\"";
__ref._pendingplayaudiokey /*String*/  = "";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="pendingPlayItem.Initialize";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="pendingPlayFadeInMs = 0";
__ref._pendingplayfadeinms /*int*/  = (int) (0);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return "";
}
public String  _clearplaybackstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearplaybackstate", false))
	 {return ((String) Debug.delegate(ba, "clearplaybackstate", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub ClearPlaybackState";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="TraceLog(\"ClearPlaybackState\")";
__ref._tracelog /*String*/ (null,"ClearPlaybackState");
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="audioPrimary.Reset";
__ref._audioprimary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="audioSecondary.Reset";
__ref._audiosecondary /*b4j.example.audioplayer*/ ._reset /*String*/ (null);
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="currentTrackUrl = \"\"";
__ref._currenttrackurl /*String*/  = "";
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="currentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="activeAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="activeItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = __c.False;
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="initialStartFadePending = False";
__ref._initialstartfadepending /*boolean*/  = __c.False;
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=7471121;
 //BA.debugLineNum = 7471121;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="End Sub";
return "";
}
public String  _clearpreparedstate(b4j.example.b4xmainpage __ref,boolean _resetplayer) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearpreparedstate", false))
	 {return ((String) Debug.delegate(ba, "clearpreparedstate", new Object[] {_resetplayer}));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Private Sub ClearPreparedState(resetPlayer As Bool";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If preparedAudioKey <> \"\" And resetPlayer Then";
if ((__ref._preparedaudiokey /*String*/ ).equals("") == false && _resetplayer) { 
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="GetAudioByKey(preparedAudioKey).Reset";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._preparedaudiokey /*String*/ )._reset /*String*/ (null);
 };
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="pendingPrepareAudioKey = \"\"";
__ref._pendingprepareaudiokey /*String*/  = "";
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="pendingPrepareItem.Initialize";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="End Sub";
return "";
}
public String  _clearretrytimer(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "clearretrytimer", false))
	 {return ((String) Debug.delegate(ba, "clearretrytimer", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub ClearRetryTimer";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return "";
}
public String  _configureplayerheader(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configureplayerheader", false))
	 {return ((String) Debug.delegate(ba, "configureplayerheader", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub ConfigurePlayerHeader";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="headerActionPane.Visible = True";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="lblHeaderAction.Text = ICON_MORE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_more /*String*/ );
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="End Sub";
return "";
}
public String  _configuresetupscreen(b4j.example.b4xmainpage __ref,String _mode,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "configuresetupscreen", false))
	 {return ((String) Debug.delegate(ba, "configuresetupscreen", new Object[] {_mode,_text}));}
boolean _issettingsmode = false;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub ConfigureSetupScreen(mode As String, t";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim isSettingsMode As Boolean = mode = \"settings\"";
_issettingsmode = (_mode).equals("settings");
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="headerActionPane.Visible = mode <> \"setup\"";
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_mode).equals("setup") == false);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="lblHeaderAction.Text = ICON_CLOSE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_close /*String*/ );
 }else {
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="lblHeaderAction.Text = ICON_MORE";
__ref._lblheaderaction /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_more /*String*/ );
 };
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="txtPlayerCode.Editable = False";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.False);
 }else {
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="txtPlayerCode.Editable = True";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(__c.True);
 };
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="txtPlayerCode.Text = FormatPlayerCodeForDisplay(p";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._formatplayercodefordisplay /*String*/ (null,__ref._playercode /*String*/ ));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"logout\").ToU";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"logout").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="btnSetupSubmit.Text = MessageValue(\"setup_submit";
__ref._btnsetupsubmit /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"setup_submit").toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 };
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="lblSetupMessage.Text = text";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
 }else 
{RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="Else If isSettingsMode Then";
if (_issettingsmode) { 
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="lblSetupMessage.Text = MessageValue(\"settings_th";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"settings_thanks"));
 }else {
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="lblSetupMessage.Text = MessageValue(\"setup_title";
__ref._lblsetupmessage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._messagevalue /*String*/ (null,"setup_title"));
 }}
;
RDebugUtils.currentLine=2097178;
 //BA.debugLineNum = 2097178;BA.debugLine="If playerCode = \"\" Then lblHeader.Text = \"\"";
if ((__ref._playercode /*String*/ ).equals("")) { 
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");};
RDebugUtils.currentLine=2097179;
 //BA.debugLineNum = 2097179;BA.debugLine="End Sub";
return "";
}
public int  _confirmreservedheight(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "confirmreservedheight", false))
	 {return ((Integer) Debug.delegate(ba, "confirmreservedheight", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub ConfirmReservedHeight As Int";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If confirmPane.Visible Then Return 84dip";
if (__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()) { 
if (true) return __c.DipToCurrent((int) (84));};
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return 0;
}
public String  _consumepreparedqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "consumepreparedqueueitem", false))
	 {return ((String) Debug.delegate(ba, "consumepreparedqueueitem", null));}
anywheresoftware.b4a.objects.collections.Map _firstqueueditem = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub ConsumePreparedQueueItem";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="If playQueue.Size = 0 Or preparedItem.IsInitializ";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="If playQueue.Get(0) Is Map Then";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)) instanceof java.util.Map) { 
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim firstQueuedItem As Map = playQueue.Get(0)";
_firstqueueditem = new anywheresoftware.b4a.objects.collections.Map();
_firstqueueditem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="If ItemsMatch(firstQueuedItem, preparedItem) The";
if (__ref._itemsmatch /*boolean*/ (null,_firstqueueditem,__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ )) { 
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));};
 };
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="End Sub";
return "";
}
public boolean  _itemsmatch(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _firstitem,anywheresoftware.b4a.objects.collections.Map _seconditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "itemsmatch", false))
	 {return ((Boolean) Debug.delegate(ba, "itemsmatch", new Object[] {_firstitem,_seconditem}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub ItemsMatch(firstItem As Map, secondIte";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If firstItem.IsInitialized = False Or secondItem.";
if (_firstitem.IsInitialized()==__c.False || _seconditem.IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="If firstItem.GetDefault(\"type\", \"\") <> secondItem";
if ((_firstitem.GetDefault((Object)("type"),(Object)(""))).equals(_seconditem.GetDefault((Object)("type"),(Object)(""))) == false) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="If firstItem.GetDefault(\"id\", \"\") <> \"\" And first";
if ((_firstitem.GetDefault((Object)("id"),(Object)(""))).equals((Object)("")) == false && (_firstitem.GetDefault((Object)("id"),(Object)(""))).equals(_seconditem.GetDefault((Object)("id"),(Object)("")))) { 
if (true) return __c.True;};
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Return MediaUrl(firstItem) = MediaUrl(secondItem)";
if (true) return (__ref._mediaurl /*String*/ (null,_firstitem)).equals(__ref._mediaurl /*String*/ (null,_seconditem));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _createclaimparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createclaimparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createclaimparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub CreateClaimParams As Map";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub TimezoneOffsetMinutes As Int";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="jo.InitializeStatic(\"java.time.OffsetDateTime\")";
_jo.InitializeStatic("java.time.OffsetDateTime");
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Dim nowOffset As JavaObject = jo.RunMethod(\"now\",";
_nowoffset = new anywheresoftware.b4j.object.JavaObject();
_nowoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("now",(Object[])(__c.Null))));
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="Dim zoneOffset As JavaObject = nowOffset.RunMetho";
_zoneoffset = new anywheresoftware.b4j.object.JavaObject();
_zoneoffset = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nowoffset.RunMethod("getOffset",(Object[])(__c.Null))));
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="Dim totalSeconds As Int = zoneOffset.RunMethod(\"g";
_totalseconds = (int)(BA.ObjectToNumber(_zoneoffset.RunMethod("getTotalSeconds",(Object[])(__c.Null))));
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Return -Round(totalSeconds / 60)";
if (true) return (int) (-__c.Round(_totalseconds/(double)60));
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _createdataparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createdataparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createdataparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub CreateDataParams As Map";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="params.Put(\"version\", APP_VERSION)";
_params.Put((Object)("version"),(Object)(__ref._app_version /*String*/ ));
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createinitializedmap(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createinitializedmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createinitializedmap", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub CreateInitializedMap As Map";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createmetaparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createmetaparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createmetaparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub CreateMetaParams As Map";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _createnextparams(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createnextparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "createnextparams", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub CreateNextParams As Map";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="params.Put(\"tz\", TimezoneOffsetMinutes)";
_params.Put((Object)("tz"),(Object)(__ref._timezoneoffsetminutes /*int*/ (null)));
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="params.Put(\"version\", APP_VERSION)";
_params.Put((Object)("version"),(Object)(__ref._app_version /*String*/ ));
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="If nextStartMode = \"manual\" Or nextStartMode = \"a";
if ((__ref._nextstartmode /*String*/ ).equals("manual") || (__ref._nextstartmode /*String*/ ).equals("auto")) { 
_params.Put((Object)("start"),(Object)(__ref._nextstartmode /*String*/ ));};
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="If playlistIndex >= 0 Then params.Put(\"playlist\",";
if (__ref._playlistindex /*int*/ >=0) { 
_params.Put((Object)("playlist"),(Object)(__ref._playlistindex /*int*/ ));};
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="End Sub";
return null;
}
public String  _createrandomdeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createrandomdeviceid", false))
	 {return ((String) Debug.delegate(ba, "createrandomdeviceid", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _uuid = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub CreateRandomDeviceId As String";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="jo.InitializeStatic(\"java.util.UUID\")";
_jo.InitializeStatic("java.util.UUID");
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Dim uuid As JavaObject = jo.RunMethod(\"randomUUID";
_uuid = new anywheresoftware.b4j.object.JavaObject();
_uuid = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("randomUUID",(Object[])(__c.Null))));
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Return uuid.RunMethod(\"toString\", Null)";
if (true) return BA.ObjectToString(_uuid.RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="End Sub";
return "";
}
public int  _currentsecondofminute(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentsecondofminute", false))
	 {return ((Integer) Debug.delegate(ba, "currentsecondofminute", null));}
String _previoustimeformat = "";
int _value = 0;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub CurrentSecondOfMinute As Int";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="DateTime.TimeFormat = \"ss\"";
__c.DateTime.setTimeFormat("ss");
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Dim value As Int = DateTime.Time(DateTime.Now)";
_value = (int)(Double.parseDouble(__c.DateTime.Time(__c.DateTime.getNow())));
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="End Sub";
return 0;
}
public double  _currentvolume(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "currentvolume", false))
	 {return ((Double) Debug.delegate(ba, "currentvolume", new Object[] {_item}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub CurrentVolume(item As Map) As Double";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Return ResolveItemVolume(item)";
if (true) return __ref._resolveitemvolume /*double*/ (null,_item);
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub ResolveItemVolume(item As Map) As Doub";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="If item.IsInitialized = False Then Return 0.7";
if (_item.IsInitialized()==__c.False) { 
if (true) return 0.7;};
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Dim gainDb As Double = NormalizeDbValue(item.GetD";
_gaindb = __ref._normalizedbvalue /*double*/ (null,_item.GetDefault((Object)("gain"),(Object)(-3)),-3);
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Dim baseFactor As Double = 1";
_basefactor = 1;
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="If itemType = \"track\" Then baseFactor = ResolvePl";
if ((_itemtype).equals("track")) { 
_basefactor = __ref._resolveplayerlevelfactor /*double*/ (null);};
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Return Max(0, Min(1, baseFactor * DbToFactor(gain";
if (true) return __c.Max(0,__c.Min(1,_basefactor*__ref._dbtofactor /*double*/ (null,_gaindb)));
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="End Sub";
return 0;
}
public double  _dbtofactor(b4j.example.b4xmainpage __ref,double _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "dbtofactor", false))
	 {return ((Double) Debug.delegate(ba, "dbtofactor", new Object[] {_db}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub DbToFactor(db As Double) As Double";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If db >= 0 Then Return 1";
if (_db>=0) { 
if (true) return 1;};
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Return Power(10, db / 20)";
if (true) return __c.Power(10,_db/(double)20);
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="End Sub";
return 0;
}
public String  _joinlist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _items,String _separator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "joinlist", false))
	 {return ((String) Debug.delegate(ba, "joinlist", new Object[] {_items,_separator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub JoinList(items As List, separator As S";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="If i > 0 Then sb.Append(separator)";
if (_i>0) { 
_sb.Append(_separator);};
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="sb.Append(items.Get(i))";
_sb.Append(BA.ObjectToString(_items.Get(_i)));
 }
};
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim playlistId As String = descriptor.GetDefault(";
_playlistid = BA.ObjectToString(_descriptor.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="If playlistId = \"\" Then Return False";
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
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="Dim playlistUrl As String = offlineStoreService.P";
_playlisturl = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._playlistmetadataurl /*String*/ (null,_playlistid);
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="TraceLog(\"Загрузка playlist metadata. id=\" & play";
__ref._tracelog /*String*/ (null,"Загрузка playlist metadata. id="+_playlistid+", url="+_playlisturl);
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="Wait For (FetchJsonWithTimeout(playlistUrl, FETCH";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "downloadofflineplaylistmetadata"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_playlisturl,__ref._fetch_timeout_ms /*int*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="TraceLog(\"Не удалось загрузить playlist metadata";
__ref._tracelog /*String*/ (null,"Не удалось загрузить playlist metadata. id="+_playlistid+", message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=14221322;
 //BA.debugLineNum = 14221322;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=14221323;
 //BA.debugLineNum = 14221323;BA.debugLine="If resultData Is Map Then";
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
RDebugUtils.currentLine=14221325;
 //BA.debugLineNum = 14221325;BA.debugLine="TraceLog(\"Playlist metadata не является Map. id=";
__ref._tracelog /*String*/ (null,"Playlist metadata не является Map. id="+_playlistid);
RDebugUtils.currentLine=14221326;
 //BA.debugLineNum = 14221326;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=14221328;
 //BA.debugLineNum = 14221328;BA.debugLine="Dim playlistData As Map = resultData";
_playlistdata = new anywheresoftware.b4a.objects.collections.Map();
_playlistdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=14221329;
 //BA.debugLineNum = 14221329;BA.debugLine="offlineStoreService.SavePlaylistMetadata(descript";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._saveplaylistmetadata /*String*/ (null,_descriptor,_playlistdata,_cachedplaylistindex);
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim result As Map";
_result = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="result.Put(\"Success\", False)";
_result.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="result.Put(\"Data\", Null)";
_result.Put((Object)("Data"),parent.__c.Null);
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="result.Put(\"ErrorMessage\", \"\")";
_result.Put((Object)("ErrorMessage"),(Object)(""));
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="TraceLog(\"HTTP GET. timeoutMs=\" & timeoutMs & \",";
__ref._tracelog /*String*/ (null,"HTTP GET. timeoutMs="+BA.NumberToString(_timeoutms)+", url="+_url);
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="j.GetRequest.Timeout = timeoutMs";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout(_timeoutms);
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchjsonwithtimeout"), (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="Try";
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
RDebugUtils.currentLine=5308431;
 //BA.debugLineNum = 5308431;BA.debugLine="Dim responseText As String = j.GetString";
_responsetext = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="SaveServerSnapshot(\"GET\", url, True, responseTe";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.True,_responsetext,"");
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="parser.Initialize(responseText)";
_parser.Initialize(_responsetext);
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="result.Put(\"Data\", parser.NextObject)";
_result.Put((Object)("Data"),(Object)(_parser.NextObject().getObject()));
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="result.Put(\"Success\", True)";
_result.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="result.Put(\"Kind\", \"\")";
_result.Put((Object)("Kind"),(Object)(""));
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="TraceLog(\"HTTP OK. url=\" & url)";
__ref._tracelog /*String*/ (null,"HTTP OK. url="+_url);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="result.Put(\"ErrorMessage\", \"bad_json\")";
_result.Put((Object)("ErrorMessage"),(Object)("bad_json"));
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="SaveServerSnapshot(\"GET\", url, False, \"\", \"bad_";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"","bad_json");
RDebugUtils.currentLine=5308443;
 //BA.debugLineNum = 5308443;BA.debugLine="TraceLog(\"HTTP parse error. url=\" & url & \", me";
__ref._tracelog /*String*/ (null,"HTTP parse error. url="+_url+", message=bad_json");
 if (true) break;
if (true) break;

case 9:
//C
this.state = 18;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="Dim errorMessage As String = j.ErrorMessage";
_errormessage = _j._errormessage /*String*/ ;
RDebugUtils.currentLine=5308447;
 //BA.debugLineNum = 5308447;BA.debugLine="result.Put(\"ErrorMessage\", errorMessage)";
_result.Put((Object)("ErrorMessage"),(Object)(_errormessage));
RDebugUtils.currentLine=5308448;
 //BA.debugLineNum = 5308448;BA.debugLine="If errorMessage.ToLowerCase.Contains(\"timed out\"";
if (true) break;

case 12:
//if
this.state = 17;
if (_errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("timed out") || _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("unknownhost") || _errormessage.toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale).contains("refused")) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=5308449;
 //BA.debugLineNum = 5308449;BA.debugLine="result.Put(\"Kind\", \"offline\")";
_result.Put((Object)("Kind"),(Object)("offline"));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=5308451;
 //BA.debugLineNum = 5308451;BA.debugLine="result.Put(\"Kind\", \"server\")";
_result.Put((Object)("Kind"),(Object)("server"));
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=5308453;
 //BA.debugLineNum = 5308453;BA.debugLine="SaveServerSnapshot(\"GET\", url, False, \"\", errorM";
__ref._saveserversnapshot /*String*/ (null,"GET",_url,parent.__c.False,"",_errormessage);
RDebugUtils.currentLine=5308454;
 //BA.debugLineNum = 5308454;BA.debugLine="TraceLog(\"HTTP failed. kind=\" & result.GetDefaul";
__ref._tracelog /*String*/ (null,"HTTP failed. kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+", url="+_url+", message="+_errormessage);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=5308456;
 //BA.debugLineNum = 5308456;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=5308457;
 //BA.debugLineNum = 5308457;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=5308458;
 //BA.debugLineNum = 5308458;BA.debugLine="End Sub";
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
long _breakremain = 0L;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub EffectiveTrackRemainMs As Long";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim trackRemain As Long = 0";
_trackremain = (long) (0);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="If activeAudioKey <> \"\" Then";
if ((__ref._activeaudiokey /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Dim activeAudio As AudioPlayer = GetAudioByKey(a";
_activeaudio = __ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ );
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="If activeAudio.Duration > 0 Then trackRemain = a";
if (_activeaudio._duration /*long*/ (null)>0) { 
_trackremain = (long) (_activeaudio._duration /*long*/ (null)-_activeaudio._position /*long*/ (null));};
 };
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="If scheduledBreakAt <= 0 Then Return trackRemain";
if (__ref._scheduledbreakat /*long*/ <=0) { 
if (true) return _trackremain;};
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Dim breakRemain As Long = (scheduledBreakAt - Loc";
_breakremain = (long) ((__ref._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000);
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="If trackRemain <= 0 Then Return breakRemain";
if (_trackremain<=0) { 
if (true) return _breakremain;};
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Return Min(trackRemain, breakRemain)";
if (true) return (long) (__c.Min(_trackremain,_breakremain));
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="End Sub";
return 0L;
}
public long  _localnowtimestamp(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localnowtimestamp", false))
	 {return ((Long) Debug.delegate(ba, "localnowtimestamp", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub LocalNowTimestamp As Long";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Return Floor(DateTime.Now / 1000) - (TimezoneOffs";
if (true) return (long) (__c.Floor(__c.DateTime.getNow()/(double)1000)-(__ref._timezoneoffsetminutes /*int*/ (null)*60));
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return 0L;
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
anywheresoftware.b4a.objects.collections.Map _workingcursors = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;

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
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If minItems <= 0 Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_minitems<=0) { 
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
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim workingCursors As Map = dataResolver.ClonePla";
_workingcursors = new anywheresoftware.b4a.objects.collections.Map();
_workingcursors = __ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._cloneplaylistcursors /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Do While playQueue.Size < minItems";
if (true) break;

case 7:
//do while
this.state = 16;
while (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<_minitems) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Wait For (BuildNextTrackFromDataPlayback(working";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensuredataplaybackqueue"), __ref._buildnexttrackfromdataplayback /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_workingcursors));
this.state = 17;
return;
case 17:
//C
this.state = 10;
_nextitem = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="If IsValidDataTrackItem(nextItem) = False Then E";
if (true) break;

case 10:
//if
this.state = 15;
if (__ref._isvaliddatatrackitem /*boolean*/ (null,_nextitem)==parent.__c.False) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 16;
if (true) break;
if (true) break;

case 15:
//C
this.state = 7;
;
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="playQueue.Add(nextItem)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_nextitem.getObject()));
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Return playQueue.Size >= minItems";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=_minitems));return;};
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If CanUseDataPlaybackResolver Then Return True";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="TraceLog(\"Подготовка локального playback-resolver";
__ref._tracelog /*String*/ (null,"Подготовка локального playback-resolver из data/playlists перед стартом.");
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (refres";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensuredataplaybackready"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_refreshed = (boolean) result[1];
;
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="If refreshed = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_refreshed==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="TraceLog(\"Не удалось подготовить data/playlists";
__ref._tracelog /*String*/ (null,"Не удалось подготовить data/playlists для локального воспроизведения.");
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Return CanUseDataPlaybackResolver";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._canusedataplaybackresolver /*boolean*/ (null)));return;};
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _ensuredirectory(b4j.example.b4xmainpage __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensuredirectory", false))
	 {return ((String) Debug.delegate(ba, "ensuredirectory", new Object[] {_path}));}
anywheresoftware.b4j.object.JavaObject _jofile = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub EnsureDirectory(path As String)";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim joFile As JavaObject";
_jofile = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="joFile.InitializeNewInstance(\"java.io.File\", Arra";
_jofile.InitializeNewInstance("java.io.File",new Object[]{(Object)(_path)});
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="joFile.RunMethod(\"mkdirs\", Null)";
_jofile.RunMethod("mkdirs",(Object[])(__c.Null));
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="End Sub";
return "";
}
public void  _ensureofflineadscachedasync(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ensureofflineadscachedasync", false))
	 {Debug.delegate(ba, "ensureofflineadscachedasync", null); return;}
ResumableSub_EnsureOfflineAdsCachedAsync rsub = new ResumableSub_EnsureOfflineAdsCachedAsync(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_EnsureOfflineAdsCachedAsync extends BA.ResumableSub {
public ResumableSub_EnsureOfflineAdsCachedAsync(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="If offlineData.IsInitialized = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="TraceLog(\"Прогрев кэша рекламы пропущен: offline";
__ref._tracelog /*String*/ (null,"Прогрев кэша рекламы пропущен: offlineData не инициализирован.");
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="If offlineData.GetDefault(\"ok\", False) <> True Th";

case 4:
//if
this.state = 7;
if ((__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="TraceLog(\"Прогрев кэша рекламы пропущен: offline";
__ref._tracelog /*String*/ (null,"Прогрев кэша рекламы пропущен: offlineData.ok=False.");
RDebugUtils.currentLine=37748743;
 //BA.debugLineNum = 37748743;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=37748745;
 //BA.debugLineNum = 37748745;BA.debugLine="TraceLog(\"Запуск прогрева кэша рекламы. ads=\" & s";
__ref._tracelog /*String*/ (null,"Запуск прогрева кэша рекламы. ads="+BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"offline_ads_count",(Object)(0))));
RDebugUtils.currentLine=37748746;
 //BA.debugLineNum = 37748746;BA.debugLine="Wait For (mediaCacheService.EnsureAdsCached(offli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "ensureofflineadscachedasync"), __ref._mediacacheservice /*b4j.example.mediacache*/ ._ensureadscached /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 8;
return;
case 8:
//C
this.state = -1;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=37748747;
 //BA.debugLineNum = 37748747;BA.debugLine="TraceLog(\"Прогрев кэша рекламы завершен. download";
__ref._tracelog /*String*/ (null,"Прогрев кэша рекламы завершен. downloaded="+BA.ObjectToString(_downloaded)+", cached="+BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"cached_ad_count",(Object)(0))));
RDebugUtils.currentLine=37748748;
 //BA.debugLineNum = 37748748;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _playpreparedorloadnext(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playpreparedorloadnext", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "playpreparedorloadnext", null));}
ResumableSub_PlayPreparedOrLoadNext rsub = new ResumableSub_PlayPreparedOrLoadNext(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PlayPreparedOrLoadNext extends BA.ResumableSub {
public ResumableSub_PlayPreparedOrLoadNext(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="If playQueue.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, 0)) Comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playpreparedorloadnext"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._shiftqueueitem /*Object*/ (null),(int) (0)));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused2 As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playpreparedorloadnext"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 6;
return;
case 6:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _saveserversnapshot(b4j.example.b4xmainpage __ref,String _method,String _url,boolean _success,String _body,String _errormessage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "saveserversnapshot", false))
	 {return ((String) Debug.delegate(ba, "saveserversnapshot", new Object[] {_method,_url,_success,_body,_errormessage}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub SaveServerSnapshot(method As String, u";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="appTraceService.SaveServerSnapshot(method, url, s";
__ref._apptraceservice /*b4j.example.traceservice*/ ._saveserversnapshot /*String*/ (null,_method,_url,_success,_body,_errormessage);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Wait For (FetchJsonWithTimeout(NEXT_BASE_URL & \"?";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "fetchnext"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._next_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createnextparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="nextStartMode = \"\"";
__ref._nextstartmode /*String*/  = "";
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub FilterPlayerCode(value As String) As S";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim filtered As String = Regex.Replace(\"[^A-Za-z0";
_filtered = __c.Regex.Replace("[^A-Za-z0-9]",_value,"");
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="If filtered.Length > 5 Then filtered = filtered.S";
if (_filtered.length()>5) { 
_filtered = _filtered.substring((int) (0),(int) (5));};
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="Return filtered.ToUpperCase";
if (true) return _filtered.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="End Sub";
return "";
}
public String  _formathistorydate(b4j.example.b4xmainpage __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formathistorydate", false))
	 {return ((String) Debug.delegate(ba, "formathistorydate", new Object[] {_ticks}));}
String _previousdateformat = "";
String _value = "";
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub FormatHistoryDate(ticks As Long) As St";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim value As String = DateTime.Date(ticks)";
_value = __c.DateTime.Date(_ticks);
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="End Sub";
return "";
}
public String  _formathistorytime(b4j.example.b4xmainpage __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "formathistorytime", false))
	 {return ((String) Debug.delegate(ba, "formathistorytime", new Object[] {_ticks}));}
String _previoustimeformat = "";
String _value = "";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub FormatHistoryTime(ticks As Long) As St";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Dim value As String = DateTime.Time(ticks)";
_value = __c.DateTime.Time(_ticks);
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub FormatTimestampForTrace(targetTimestam";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Dim previousDateFormat As String = DateTime.DateF";
_previousdateformat = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="DateTime.DateFormat = \"dd.MM.yyyy\"";
__c.DateTime.setDateFormat("dd.MM.yyyy");
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="Dim targetTicks As Long = LocalTimestampToTicks(t";
_targetticks = __ref._localtimestamptoticks /*long*/ (null,_targettimestamp);
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="Dim value As String = DateTime.Date(targetTicks)";
_value = __c.DateTime.Date(_targetticks)+" "+__c.DateTime.Time(_targetticks);
RDebugUtils.currentLine=38797319;
 //BA.debugLineNum = 38797319;BA.debugLine="DateTime.DateFormat = previousDateFormat";
__c.DateTime.setDateFormat(_previousdateformat);
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=38797321;
 //BA.debugLineNum = 38797321;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=38797322;
 //BA.debugLineNum = 38797322;BA.debugLine="End Sub";
return "";
}
public long  _localtimestamptoticks(b4j.example.b4xmainpage __ref,long _targettimestamp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localtimestamptoticks", false))
	 {return ((Long) Debug.delegate(ba, "localtimestamptoticks", new Object[] {_targettimestamp}));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Private Sub LocalTimestampToTicks(targetTimestamp";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Return (targetTimestamp + (TimezoneOffsetMinutes";
if (true) return (long) ((_targettimestamp+(__ref._timezoneoffsetminutes /*int*/ (null)*60))*1000);
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="End Sub";
return 0L;
}
public String  _getinactiveaudiokey(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getinactiveaudiokey", false))
	 {return ((String) Debug.delegate(ba, "getinactiveaudiokey", null));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub GetInactiveAudioKey As String";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If activeAudioKey = \"primary\" Then Return \"second";
if ((__ref._activeaudiokey /*String*/ ).equals("primary")) { 
if (true) return "secondary";};
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Return \"primary\"";
if (true) return "primary";
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return "";
}
public String  _getorcreatedeviceid(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getorcreatedeviceid", false))
	 {return ((String) Debug.delegate(ba, "getorcreatedeviceid", null));}
String _id = "";
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub GetOrCreateDeviceId As String";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim id As String = storage.GetDefault(\"device_id\"";
_id = BA.ObjectToString(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"device_id",(Object)("")));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="If id <> \"\" Then Return id";
if ((_id).equals("") == false) { 
if (true) return _id;};
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="id = CreateRandomDeviceId";
_id = __ref._createrandomdeviceid /*String*/ (null);
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="SaveValue(\"device_id\", id)";
__ref._savevalue /*String*/ (null,"device_id",(Object)(_id));
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="End Sub";
return "";
}
public String  _savevalue(b4j.example.b4xmainpage __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "savevalue", false))
	 {return ((String) Debug.delegate(ba, "savevalue", new Object[] {_key,_value}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub SaveValue(key As String, value As Obje";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="storage.Put(key, value)";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_key,_value);
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getservertracelist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracelist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getservertracelist", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub GetServerTraceList As List";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Return appTraceService.GetServerTraceList";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._getservertracelist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return null;
}
public String  _getservertracetext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "getservertracetext", false))
	 {return ((String) Debug.delegate(ba, "getservertracetext", null));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub GetServerTraceText As String";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return appTraceService.GetServerTraceText";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._getservertracetext /*String*/ (null);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettraceloglist(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettraceloglist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettraceloglist", null));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub GetTraceLogList As List";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Return appTraceService.GetTraceList";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._gettracelist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return null;
}
public String  _gettracelogtext(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "gettracelogtext", false))
	 {return ((String) Debug.delegate(ba, "gettracelogtext", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub GetTraceLogText As String";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return appTraceService.GetTraceText";
if (true) return __ref._apptraceservice /*b4j.example.traceservice*/ ._gettracetext /*String*/ (null);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public boolean  _promotepreparedplayer(b4j.example.b4xmainpage __ref,int _fadeinms,int _fadeoutms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "promotepreparedplayer", false))
	 {return ((Boolean) Debug.delegate(ba, "promotepreparedplayer", new Object[] {_fadeinms,_fadeoutms}));}
String _previousaudiokey = "";
String _nextaudiokey = "";
anywheresoftware.b4a.objects.collections.Map _promoteditem = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub PromotePreparedPlayer(fadeInMs As Int,";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="If preparedAudioKey = \"\" Or preparedItem.IsInitia";
if ((__ref._preparedaudiokey /*String*/ ).equals("") || __ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __c.False;};
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim previousAudioKey As String = activeAudioKey";
_previousaudiokey = __ref._activeaudiokey /*String*/ ;
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim nextAudioKey As String = preparedAudioKey";
_nextaudiokey = __ref._preparedaudiokey /*String*/ ;
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="Dim promotedItem As Map = CloneMap(preparedItem)";
_promoteditem = new anywheresoftware.b4a.objects.collections.Map();
_promoteditem = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="TraceLog(\"PromotePreparedPlayer. fromAudio=\" & pr";
__ref._tracelog /*String*/ (null,"PromotePreparedPlayer. fromAudio="+_previousaudiokey+", toAudio="+_nextaudiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_promoteditem.getObject()))+", fadeOutMs="+BA.NumberToString(_fadeoutms));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="ConsumePreparedQueueItem";
__ref._consumepreparedqueueitem /*String*/ (null);
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="If previousAudioKey <> \"\" And previousAudioKey <>";
if ((_previousaudiokey).equals("") == false && (_previousaudiokey).equals(_nextaudiokey) == false) { 
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="GetAudioByKey(previousAudioKey).Stop(fadeOutMs)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_previousaudiokey)._stop /*String*/ (null,_fadeoutms);
 };
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="activeAudioKey = nextAudioKey";
__ref._activeaudiokey /*String*/  = _nextaudiokey;
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="ActivateLoadedItem(activeAudioKey, promotedItem,";
__ref._activateloadeditem /*String*/ (null,__ref._activeaudiokey /*String*/ ,_promoteditem,_fadeinms);
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="End Sub";
return false;
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
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (ha";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlemediaerror"), __ref._checkexternalconnectivity /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_hasinternet = (boolean) result[1];
;
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="If hasInternet Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_hasinternet) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
__ref._handletemporarystate /*String*/ (null,"offline","");
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _preparedfadeinms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeinms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeinms", null));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Private Sub PreparedFadeInMs As Int";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return 0;
}
public int  _preparedfadeoutms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preparedfadeoutms", false))
	 {return ((Integer) Debug.delegate(ba, "preparedfadeoutms", null));}
String _nexttype = "";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub PreparedFadeOutMs As Int";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="If currentMediaType <> \"track\" Then Return 0";
if ((__ref._currentmediatype /*String*/ ).equals("track") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="If preparedItem.IsInitialized = False Then Return";
if (__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Dim nextType As String = preparedItem.GetDefault(";
_nexttype = BA.ObjectToString(__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="If nextType = \"track\" Then Return TRACK_OVERLAP_M";
if ((_nexttype).equals("track")) { 
if (true) return __ref._track_overlap_ms /*int*/ ;};
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="If nextType = \"ad\" Then Return AD_TAIL_OVERLAP_MS";
if ((_nexttype).equals("ad")) { 
if (true) return __ref._ad_tail_overlap_ms /*int*/ ;};
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If playQueue.Size > 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepare";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 39;
return;
case 39:
//C
this.state = 4;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;
;
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";

case 4:
//if
this.state = 21;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="If CanUseDataPlaybackResolver = False Then";
if (true) break;

case 7:
//if
this.state = 16;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="Wait For (EnsureDataPlaybackReady) Complete (re";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 40;
return;
case 40:
//C
this.state = 10;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="If resolverReady = False Then Return False";
if (true) break;

case 10:
//if
this.state = 15;
if (_resolverready==parent.__c.False) { 
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
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="Wait For (EnsureDataPlaybackQueue(1)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1)));
this.state = 41;
return;
case 41:
//C
this.state = 17;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="If queuePrepared And playQueue.Size > 0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_queueprepared && __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepar";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 42;
return;
case 42:
//C
this.state = 20;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="If HasPendingExactBreak Then Return False";

case 21:
//if
this.state = 26;
if (__ref._haspendingexactbreak /*boolean*/ (null)) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 43;
return;
case 43:
//C
this.state = 27;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="If result.GetDefault(\"Success\", False) = False Or";
if (true) break;

case 27:
//if
this.state = 32;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False)) || __ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 33:
//if
this.state = 38;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
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
this.state = -1;
;
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=5177367;
 //BA.debugLineNum = 5177367;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="Wait For (PrepareNextPlayable) Complete (prepared";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "prefetchnext"), __ref._preparenextplayable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 44;
return;
case 44:
//C
this.state = -1;
_preparedok = (boolean) result[1];
;
RDebugUtils.currentLine=5177369;
 //BA.debugLineNum = 5177369;BA.debugLine="Return preparedOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_preparedok));return;};
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub HandleBlockedState";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="TraceLog(\"Плеер заблокирован.\")";
__ref._tracelog /*String*/ (null,"Плеер заблокирован.");
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="ShowMessage(MessageValue(\"blocked\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"blocked"));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="ScheduleRetry(\"blocked\", 0)";
__ref._scheduleretry /*String*/ (null,"blocked",(int) (0));
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="End Sub";
return "";
}
public String  _showmessage(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showmessage", false))
	 {return ((String) Debug.delegate(ba, "showmessage", new Object[] {_text}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub ShowMessage(text As String)";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="End Sub";
return "";
}
public String  _scheduleretry(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scheduleretry", false))
	 {return ((String) Debug.delegate(ba, "scheduleretry", new Object[] {_mode,_delayms}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub ScheduleRetry(mode As String, delayMs";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="retryTimer.Interval = ResolveRetryDelay(mode, del";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._resolveretrydelay /*int*/ (null,_mode,_delayms)));
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="TraceLog(\"ScheduleRetry. mode=\" & mode & \", delay";
__ref._tracelog /*String*/ (null,"ScheduleRetry. mode="+_mode+", delayMs="+BA.NumberToString(__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()));
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="retryTimer.Enabled = True";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="TraceLog(\"Ошибка загрузки данных. kind=\" & result";
__ref._tracelog /*String*/ (null,"Ошибка загрузки данных. kind="+BA.ObjectToString(_result.GetDefault((Object)("Kind"),(Object)("")))+", message="+BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)(""))));
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If result.GetDefault(\"Kind\", \"\") = \"offline\" Then";
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
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
__ref._handletemporarystate /*String*/ (null,"offline","");
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Wait For (CheckExternalConnectivity) Complete (ha";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "handlefetchfailure"), __ref._checkexternalconnectivity /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_hasinternet = (boolean) result[1];
;
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="If hasInternet Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_hasinternet) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="HandleTemporaryState(\"offline\", \"\")";
__ref._handletemporarystate /*String*/ (null,"offline","");
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub HandleTemporaryState(mode As String, t";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="TraceLog(\"Временное состояние. mode=\" & mode & \",";
__ref._tracelog /*String*/ (null,"Временное состояние. mode="+_mode+", text="+_text);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="If text <> \"\" Then";
if ((_text).equals("") == false) { 
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
 }else 
{RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Else If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="ShowMessage(MessageValue(\"offline\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"offline"));
 }else {
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="ShowMessage(MessageValue(\"server_wait\"))";
__ref._showmessage /*String*/ (null,__ref._messagevalue /*String*/ (null,"server_wait"));
 }}
;
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="ScheduleRetry(mode, 0)";
__ref._scheduleretry /*String*/ (null,_mode,(int) (0));
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="End Sub";
return "";
}
public String  _handlemessageitem(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "handlemessageitem", false))
	 {return ((String) Debug.delegate(ba, "handlemessageitem", new Object[] {_item}));}
String _action = "";
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub HandleMessageItem(item As Map)";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim action As String = item.GetDefault(\"action\",";
_action = BA.ObjectToString(_item.GetDefault((Object)("action"),(Object)("")));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="TraceLog(\"HandleMessageItem. action=\" & action &";
__ref._tracelog /*String*/ (null,"HandleMessageItem. action="+_action+", message="+BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(""))));
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="If action = \"claim\" Then";
if ((_action).equals("claim")) { 
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="ShowClaimPrompt(item.GetDefault(\"message\", Messa";
__ref._showclaimprompt /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"device_busy")))));
 }else 
{RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Else If action = \"blocked\" Then";
if ((_action).equals("blocked")) { 
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="HandleBlockedState";
__ref._handleblockedstate /*String*/ (null);
 }else 
{RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="Else If action = \"not_found\" Then";
if ((_action).equals("not_found")) { 
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="StopForMissingData(item.GetDefault(\"message\", Me";
__ref._stopformissingdata /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"not_found")))));
 }else {
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="HandleTemporaryState(\"server\", item.GetDefault(\"";
__ref._handletemporarystate /*String*/ (null,"server",BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"server_wait")))));
 }}}
;
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="End Sub";
return "";
}
public String  _setplayicon(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setplayicon", false))
	 {return ((String) Debug.delegate(ba, "setplayicon", null));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub SetPlayIcon";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="SetLabelStyle(lblPlayIcon, \"-fx-alignment: center";
__ref._setlabelstyle /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,"-fx-alignment: center; -fx-text-fill: "+__ref._colortocss /*String*/ (null,((int)0xffd0ff71))+"; -fx-padding: 0;");
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="lblPlayIcon.Text = ICON_PLAY";
__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._icon_play /*String*/ );
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="ApplyMaterialIconFont(lblPlayIcon, playIconBaseSi";
__ref._applymaterialiconfont /*String*/ (null,__ref._lblplayicon /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._playiconbasesize /*float*/ );
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="orbitPane.SetColorAndBorder(xui.Color_Transparent";
__ref._orbitpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (2)),((int)0x00d0ff71),__c.DipToCurrent((int) (999)));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="StopOrbitAnimation";
__ref._stoporbitanimation /*String*/ (null);
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="End Sub";
return "";
}
public String  _showclaimprompt(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showclaimprompt", false))
	 {return ((String) Debug.delegate(ba, "showclaimprompt", new Object[] {_text}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub ShowClaimPrompt(text As String)";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="SetStatusText(text)";
__ref._setstatustext /*String*/ (null,_text);
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="confirmPane.Visible = True";
__ref._confirmpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="LayoutUi(rootView.Width, rootView.Height)";
__ref._layoutui /*String*/ (null,(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._rootview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="End Sub";
return "";
}
public String  _stopformissingdata(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stopformissingdata", false))
	 {return ((String) Debug.delegate(ba, "stopformissingdata", new Object[] {_text}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub StopForMissingData(text As String)";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="TraceLog(\"Остановка из-за отсутствующих данных. t";
__ref._tracelog /*String*/ (null,"Остановка из-за отсутствующих данных. text="+_text);
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="ShowMessage(text)";
__ref._showmessage /*String*/ (null,_text);
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="End Sub";
return "";
}
public boolean  _haspendingexactbreak(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "haspendingexactbreak", false))
	 {return ((Boolean) Debug.delegate(ba, "haspendingexactbreak", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub HasPendingExactBreak As Boolean";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Return scheduledBreakAt > LocalNowTimestamp";
if (true) return __ref._scheduledbreakat /*long*/ >__ref._localnowtimestamp /*long*/ (null);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return false;
}
public String  _headeractionpane_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_click", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_click", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub HeaderActionPane_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="ShowSettingsScreen";
__ref._showsettingsscreen /*String*/ (null);
 }else 
{RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Else If appScreenMode = \"settings\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="ShowPlayerScreen(False)";
__ref._showplayerscreen /*void*/ (null,__c.False);
 }}
;
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return "";
}
public String  _showsettingsscreen(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showsettingsscreen", false))
	 {return ((String) Debug.delegate(ba, "showsettingsscreen", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub ShowSettingsScreen";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If playerCode = \"\" Then";
if ((__ref._playercode /*String*/ ).equals("")) { 
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="ShowSetupScreen(\"\")";
__ref._showsetupscreen /*String*/ (null,"");
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="appScreenMode = \"settings\"";
__ref._appscreenmode /*String*/  = "settings";
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="ConfigureSetupScreen(\"settings\", \"\")";
__ref._configuresetupscreen /*String*/ (null,"settings","");
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
return "";
}
public void  _showplayerscreen(b4j.example.b4xmainpage __ref,boolean _refreshinfo) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showplayerscreen", false))
	 {Debug.delegate(ba, "showplayerscreen", new Object[] {_refreshinfo}); return;}
ResumableSub_ShowPlayerScreen rsub = new ResumableSub_ShowPlayerScreen(this,__ref,_refreshinfo);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowPlayerScreen extends BA.ResumableSub {
public ResumableSub_ShowPlayerScreen(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,boolean _refreshinfo) {
this.parent = parent;
this.__ref = __ref;
this._refreshinfo = _refreshinfo;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
boolean _refreshinfo;
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
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="appScreenMode = \"player\"";
__ref._appscreenmode /*String*/  = "player";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="ConfigurePlayerHeader";
__ref._configureplayerheader /*String*/ (null);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="If isStarted = False Then ApplyStoppedState";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstarted /*boolean*/ ==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._applystoppedstate /*String*/ (null);
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="If refreshInfo = False Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_refreshinfo==parent.__c.False) { 
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
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Wait For (InitPlayerInfo) Complete (unused As Boo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "showplayerscreen"), __ref._initplayerinfo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _headeractionpane_mouseclicked(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub HeaderActionPane_MouseClicked (eventDa";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="HeaderActionPane_Click";
__ref._headeractionpane_click /*String*/ (null);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub HeaderActionPane_MouseEntered (eventDa";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="UpdateHeaderActionAppearance(True)";
__ref._updateheaderactionappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public String  _headeractionpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "headeractionpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "headeractionpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub HeaderActionPane_MouseExited (eventDat";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public String  _setstreamtext(b4j.example.b4xmainpage __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setstreamtext", false))
	 {return ((String) Debug.delegate(ba, "setstreamtext", new Object[] {_text}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub SetStreamText(text As String)";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="lblStream.Text = text";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_text);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return "";
}
public void  _historytimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "historytimer_tick", false))
	 {Debug.delegate(ba, "historytimer_tick", null); return;}
ResumableSub_HistoryTimer_Tick rsub = new ResumableSub_HistoryTimer_Tick(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_HistoryTimer_Tick extends BA.ResumableSub {
public ResumableSub_HistoryTimer_Tick(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="historyTimer.Enabled = False";
__ref._historytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="If historyItem.IsInitialized = False Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==parent.__c.False) { 
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
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="If currentMediaType <> historyItem.GetDefault(\"ty";
if (true) break;

case 13:
//if
this.state = 18;
if ((__ref._currentmediatype /*String*/ ).equals(BA.ObjectToString(__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("type"),(Object)("")))) == false) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="If currentTrackUrl = \"\" Then Return";
if (true) break;

case 19:
//if
this.state = 24;
if ((__ref._currenttrackurl /*String*/ ).equals("")) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Wait For (SendHistory(historyItem)) Complete (unu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "historytimer_tick"), __ref._sendhistory /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._historyitem /*anywheresoftware.b4a.objects.collections.Map*/ ));
this.state = 25;
return;
case 25:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendhistory(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "sendhistory", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sendhistory", new Object[] {_item}));}
ResumableSub_SendHistory rsub = new ResumableSub_SendHistory(this,__ref,_item);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendHistory extends BA.ResumableSub {
public ResumableSub_SendHistory(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) {
this.parent = parent;
this.__ref = __ref;
this._item = _item;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _item;
anywheresoftware.b4a.objects.collections.Map _params = null;
long _startedat = 0L;
b4j.example.httpjob _j = null;

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
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="TraceLog(\"SendHistory. item=\" & DescribeItem(item";
__ref._tracelog /*String*/ (null,"SendHistory. item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="params.Put(\"player\", playerCode)";
_params.Put((Object)("player"),(Object)(__ref._playercode /*String*/ ));
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="params.Put(\"device\", deviceId)";
_params.Put((Object)("device"),(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="params.Put(\"type\", item.GetDefault(\"type\", \"\"))";
_params.Put((Object)("type"),_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="params.Put(\"id\", item.GetDefault(\"id\", \"\"))";
_params.Put((Object)("id"),_item.GetDefault((Object)("id"),(Object)("")));
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Dim startedAt As Long = historyStartedAtTicks";
_startedat = __ref._historystartedatticks /*long*/ ;
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="If startedAt <= 0 Then startedAt = DateTime.Now";
if (true) break;

case 1:
//if
this.state = 6;
if (_startedat<=0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_startedat = parent.__c.DateTime.getNow();
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="params.Put(\"date\", FormatHistoryDate(startedAt))";
_params.Put((Object)("date"),(Object)(__ref._formathistorydate /*String*/ (null,_startedat)));
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="params.Put(\"time\", FormatHistoryTime(startedAt))";
_params.Put((Object)("time"),(Object)(__ref._formathistorytime /*String*/ (null,_startedat)));
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="j.PostString(HISTORY_BASE_URL, BuildParams(params";
_j._poststring /*String*/ (null,__ref._history_base_url /*String*/ ,__ref._buildparams /*String*/ (null,_params));
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="j.GetRequest.Timeout = 5000";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (5000));
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-fo";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded;charset=UTF-8");
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "sendhistory"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_j = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="SaveServerSnapshot(\"POST\", HISTORY_BASE_URL, Tru";
__ref._saveserversnapshot /*String*/ (null,"POST",__ref._history_base_url /*String*/ ,parent.__c.True,_j._getstring /*String*/ (null),"");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="SaveServerSnapshot(\"POST\", HISTORY_BASE_URL, Fal";
__ref._saveserversnapshot /*String*/ (null,"POST",__ref._history_base_url /*String*/ ,parent.__c.False,"",_j._errormessage /*String*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="TraceLog(\"SendHistory complete. success=\" & j.Suc";
__ref._tracelog /*String*/ (null,"SendHistory complete. success="+BA.ObjectToString(_j._success /*boolean*/ ));
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _initplayerinfo(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initplayerinfo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "initplayerinfo", null));}
ResumableSub_InitPlayerInfo rsub = new ResumableSub_InitPlayerInfo(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InitPlayerInfo extends BA.ResumableSub {
public ResumableSub_InitPlayerInfo(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.Map _result = null;
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _data = null;

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
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If playerCode = \"\" Then Return False";
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
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Wait For (FetchJsonWithTimeout(PLAYER_BASE_URL &";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "initplayerinfo"), __ref._fetchjsonwithtimeout /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._player_base_url /*String*/ +"?"+__ref._buildparams /*String*/ (null,__ref._createmetaparams /*anywheresoftware.b4a.objects.collections.Map*/ (null)),__ref._fetch_timeout_ms /*int*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
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
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="If resultData Is Map Then";
if (true) break;

case 11:
//if
this.state = 18;
if (_resultdata instanceof java.util.Map) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Dim data As Map = resultData";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="If data.GetDefault(\"ok\", False) <> True Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_data.GetDefault((Object)("ok"),(Object)(parent.__c.False))).equals((Object)(parent.__c.True)) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="RenderPlayerHead(data.GetDefault(\"code\", playerC";
__ref._renderplayerhead /*String*/ (null,BA.ObjectToString(_data.GetDefault((Object)("code"),(Object)(__ref._playercode /*String*/ ))),BA.ObjectToString(_data.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=3735569;
 //BA.debugLineNum = 3735569;BA.debugLine="RenderPlayerHead(playerCode, \"\")";
__ref._renderplayerhead /*String*/ (null,__ref._playercode /*String*/ ,"");
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
RDebugUtils.currentLine=3735571;
 //BA.debugLineNum = 3735571;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _renderplayerhead(b4j.example.b4xmainpage __ref,String _code,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "renderplayerhead", false))
	 {return ((String) Debug.delegate(ba, "renderplayerhead", new Object[] {_code,_title}));}
String _safecode = "";
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub RenderPlayerHead(code As String, title";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim safeCode As String = FormatPlayerCodeForDispl";
_safecode = __ref._formatplayercodefordisplay /*String*/ (null,_code);
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="If title <> \"\" Then";
if ((_title).equals("") == false) { 
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="lblHeader.Text = safeCode & \" • \" & title.ToUppe";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_safecode+" • "+_title.toUpperCase(anywheresoftware.b4a.keywords.Common.stringLocale));
 }else {
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="lblHeader.Text = safeCode";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_safecode);
 };
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub MigrateLegacyStorageIfNeeded";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="If File.Exists(storageDir, storageFile) = False T";
if (__c.File.Exists(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ )==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Try";
try {RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="parser.Initialize(File.ReadString(storageDir, st";
_parser.Initialize(__c.File.ReadString(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ ));
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Dim legacy As Map = parser.NextObject";
_legacy = new anywheresoftware.b4a.objects.collections.Map();
_legacy = _parser.NextObject();
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="If legacy.IsInitialized Then";
if (_legacy.IsInitialized()) { 
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="For Each key As String In legacy.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _legacy.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="storage.Put(key, legacy.Get(key))";
__ref._storage /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_key,_legacy.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="TraceLog(\"Данные перенесены из legacy JSON в KV";
__ref._tracelog /*String*/ (null,"Данные перенесены из legacy JSON в KVS.");
RDebugUtils.currentLine=11993099;
 //BA.debugLineNum = 11993099;BA.debugLine="File.Delete(storageDir, storageFile)";
__c.File.Delete(__ref._storagedir /*String*/ ,__ref._storagefile /*String*/ );
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=11993102;
 //BA.debugLineNum = 11993102;BA.debugLine="TraceLog(\"Не удалось перенести legacy JSON в KVS";
__ref._tracelog /*String*/ (null,"Не удалось перенести legacy JSON в KVS. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=11993104;
 //BA.debugLineNum = 11993104;BA.debugLine="End Sub";
return "";
}
public String  _normalizeplayercode(b4j.example.b4xmainpage __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeplayercode", false))
	 {return ((String) Debug.delegate(ba, "normalizeplayercode", new Object[] {_value}));}
String _code = "";
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub NormalizePlayerCode(value As String) A";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim code As String = value.Trim.ToLowerCase";
_code = _value.trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If Regex.IsMatch(\"^[a-z0-9]{5}$\", code) Then Retu";
if (__c.Regex.IsMatch("^[a-z0-9]{5}$",_code)) { 
if (true) return _code;};
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="End Sub";
return "";
}
public String  _resolvemachineguidasync(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvemachineguidasync", false))
	 {return ((String) Debug.delegate(ba, "resolvemachineguidasync", null));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub ResolveMachineGuidAsync";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Try";
try {RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="machineGuidShell.Initialize(\"MachineGuidShell\",";
__ref._machineguidshell /*anywheresoftware.b4j.objects.Shell*/ .Initialize("MachineGuidShell","reg",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"query","HKLM\\SOFTWARE\\Microsoft\\Cryptography","/v","MachineGuid"}));
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="machineGuidShell.Run(-1)";
__ref._machineguidshell /*anywheresoftware.b4j.objects.Shell*/ .Run(ba,(long) (-1));
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="TraceLog(\"Запущено чтение MachineGuid из реестра";
__ref._tracelog /*String*/ (null,"Запущено чтение MachineGuid из реестра.");
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="TraceLog(\"Не удалось запустить чтение MachineGui";
__ref._tracelog /*String*/ (null,"Не удалось запустить чтение MachineGuid. "+__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="End Sub";
return "";
}
public int  _scalevalue(b4j.example.b4xmainpage __ref,int _availablewidth,int _smallvalue,int _mediumvalue,int _largevalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scalevalue", false))
	 {return ((Integer) Debug.delegate(ba, "scalevalue", new Object[] {_availablewidth,_smallvalue,_mediumvalue,_largevalue}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub ScaleValue(availableWidth As Int, smal";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Return UiStyle.ScaleValue(availableWidth, smallVa";
if (true) return _uistyle._scalevalue /*int*/ (_availablewidth,_smallvalue,_mediumvalue,_largevalue);
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub UpdateResponsiveStyles(availableWidth";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim small As Boolean = availableWidth <= 420dip";
_small = _availablewidth<=__c.DipToCurrent((int) (420));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim medium As Boolean = availableWidth <= 720dip";
_medium = _availablewidth<=__c.DipToCurrent((int) (720));
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Dim streamFontSize As Float";
_streamfontsize = 0f;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim infoFontSize As Float";
_infofontsize = 0f;
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim playFontSize As Float";
_playfontsize = 0f;
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Dim stopFontSize As Float";
_stopfontsize = 0f;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Dim headerActionSize As Float";
_headeractionsize = 0f;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Dim codeSize As Float";
_codesize = 0f;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim cardRadius As Int";
_cardradius = 0;
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="If small Then";
if (_small) { 
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="streamFontSize = 28";
_streamfontsize = (float) (28);
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="infoFontSize = 16";
_infofontsize = (float) (16);
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="playFontSize = 60";
_playfontsize = (float) (60);
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="stopFontSize = 56";
_stopfontsize = (float) (56);
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="headerActionSize = 24";
_headeractionsize = (float) (24);
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="codeSize = 31";
_codesize = (float) (31);
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="cardRadius = 16dip";
_cardradius = __c.DipToCurrent((int) (16));
 }else 
{RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="Else If medium Then";
if (_medium) { 
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="streamFontSize = 32";
_streamfontsize = (float) (32);
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="playFontSize = 68";
_playfontsize = (float) (68);
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="stopFontSize = 62";
_stopfontsize = (float) (62);
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="headerActionSize = 26";
_headeractionsize = (float) (26);
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="codeSize = 35";
_codesize = (float) (35);
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="cardRadius = 20dip";
_cardradius = __c.DipToCurrent((int) (20));
 }else {
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="streamFontSize = 38";
_streamfontsize = (float) (38);
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="infoFontSize = 17";
_infofontsize = (float) (17);
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="playFontSize = 74";
_playfontsize = (float) (74);
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="stopFontSize = 68";
_stopfontsize = (float) (68);
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="headerActionSize = 28";
_headeractionsize = (float) (28);
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="codeSize = 38";
_codesize = (float) (38);
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="cardRadius = 24dip";
_cardradius = __c.DipToCurrent((int) (24));
 }}
;
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="playIconBaseSize = playFontSize";
__ref._playiconbasesize /*float*/  = _playfontsize;
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="stopIconBaseSize = stopFontSize";
__ref._stopiconbasesize /*float*/  = _stopfontsize;
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="headerActionFontSize = headerActionSize";
__ref._headeractionfontsize /*float*/  = _headeractionsize;
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="codeFontSize = codeSize";
__ref._codefontsize /*float*/  = _codesize;
RDebugUtils.currentLine=1048617;
 //BA.debugLineNum = 1048617;BA.debugLine="lblStream.Font = xui.CreateDefaultBoldFont(stream";
__ref._lblstream /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_streamfontsize));
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="lblInfo.Font = xui.CreateDefaultFont(infoFontSize";
__ref._lblinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(_infofontsize));
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="lblHeader.Font = xui.CreateDefaultFont(12)";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="lblFooter.Font = xui.CreateDefaultFont(12)";
__ref._lblfooter /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="card.SetColorAndBorder(0xFF1A1B1E, 1dip, 0x14FFFF";
__ref._card /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xff1a1b1e),__c.DipToCurrent((int) (1)),((int)0x14ffffff),_cardradius);
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="UpdateHeaderActionAppearance(False)";
__ref._updateheaderactionappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="UpdateCodeInputAppearance(isCodeInputFocused)";
__ref._updatecodeinputappearance /*String*/ (null,__ref._iscodeinputfocused /*boolean*/ );
RDebugUtils.currentLine=1048624;
 //BA.debugLineNum = 1048624;BA.debugLine="If isStarted Then";
if (__ref._isstarted /*boolean*/ ) { 
RDebugUtils.currentLine=1048625;
 //BA.debugLineNum = 1048625;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
 }else {
RDebugUtils.currentLine=1048627;
 //BA.debugLineNum = 1048627;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
 };
RDebugUtils.currentLine=1048629;
 //BA.debugLineNum = 1048629;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblemode(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "updatevisiblemode", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblemode", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub UpdateVisibleMode";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="setupPane.Visible = appScreenMode <> \"player\"";
__ref._setuppane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((__ref._appscreenmode /*String*/ ).equals("player") == false);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If appScreenMode = \"player\" Then";
if ((__ref._appscreenmode /*String*/ ).equals("player")) { 
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="playerPane.Visible = True";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="playerPane.Visible = False";
__ref._playerpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="If appScreenMode = \"setup\" Then headerActionPane.";
if ((__ref._appscreenmode /*String*/ ).equals("setup")) { 
__ref._headeractionpane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);};
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="End Sub";
return "";
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
boolean _resolverready = false;
boolean _queueprepared = false;
boolean _unusedlocal = false;
anywheresoftware.b4a.objects.collections.Map _result = null;
boolean _unused = false;
anywheresoftware.b4a.objects.collections.List _queue = null;
int _retryafter = 0;
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
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="TraceLog(\"Запрос очереди и запуск. Режим старта=\"";
__ref._tracelog /*String*/ (null,"Запрос очереди и запуск. Режим старта="+__ref._nextstartmode /*String*/ +", размер очереди до запроса="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="If USE_DATA_PLAYBACK_RESOLVER Then";
if (true) break;

case 1:
//if
this.state = 18;
if (__ref._use_data_playback_resolver /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="If CanUseDataPlaybackResolver = False Then";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._canusedataplaybackresolver /*boolean*/ (null)==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Wait For (EnsureDataPlaybackReady) Complete (re";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._ensuredataplaybackready /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 32;
return;
case 32:
//C
this.state = 7;
_resolverready = (boolean) result[1];
;
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="If resolverReady = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_resolverready==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="TraceLog(\"Локальный resolver недоступен. Запус";
__ref._tracelog /*String*/ (null,"Локальный resolver недоступен. Запуск через next.php отключен в тестовом режиме.");
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="Wait For (EnsureDataPlaybackQueue(2)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._ensuredataplaybackqueue /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (2)));
this.state = 33;
return;
case 33:
//C
this.state = 12;
_queueprepared = (boolean) result[1];
;
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="If queuePrepared = False Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_queueprepared==parent.__c.False) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="TraceLog(\"Не удалось собрать очередь из data/pl";
__ref._tracelog /*String*/ (null,"Не удалось собрать очередь из data/playlists. Запуск через next.php отключен в тестовом режиме.");
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="TraceLog(\"Локальная очередь из data/playlists г";
__ref._tracelog /*String*/ (null,"Локальная очередь из data/playlists готова. Элементов="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=5046293;
 //BA.debugLineNum = 5046293;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, 0)) Com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._shiftqueueitem /*Object*/ (null),(int) (0)));
this.state = 34;
return;
case 34:
//C
this.state = 17;
_unusedlocal = (boolean) result[1];
;
RDebugUtils.currentLine=5046294;
 //BA.debugLineNum = 5046294;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="Wait For (FetchNext) Complete (result As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._fetchnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 19;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=5046298;
 //BA.debugLineNum = 5046298;BA.debugLine="If result.GetDefault(\"Success\", False) = False Th";
if (true) break;

case 19:
//if
this.state = 22;
if ((_result.GetDefault((Object)("Success"),(Object)(parent.__c.False))).equals((Object)(parent.__c.False))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=5046299;
 //BA.debugLineNum = 5046299;BA.debugLine="Wait For (HandleFetchFailure(result)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._handlefetchfailure /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_result));
this.state = 36;
return;
case 36:
//C
this.state = 22;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5046300;
 //BA.debugLineNum = 5046300;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=5046302;
 //BA.debugLineNum = 5046302;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";

case 22:
//if
this.state = 27;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=5046303;
 //BA.debugLineNum = 5046303;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=5046304;
 //BA.debugLineNum = 5046304;BA.debugLine="Dim queue As List = NormalizeQueueResponse(result";
_queue = new anywheresoftware.b4a.objects.collections.List();
_queue = __ref._normalizequeueresponse /*anywheresoftware.b4a.objects.collections.List*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=5046305;
 //BA.debugLineNum = 5046305;BA.debugLine="If queue.IsInitialized = False Or queue.Size = 0";
if (true) break;

case 28:
//if
this.state = 31;
if (_queue.IsInitialized()==parent.__c.False || _queue.getSize()==0) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=5046306;
 //BA.debugLineNum = 5046306;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=5046307;
 //BA.debugLineNum = 5046307;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=5046309;
 //BA.debugLineNum = 5046309;BA.debugLine="playQueue = queue";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _queue;
RDebugUtils.currentLine=5046310;
 //BA.debugLineNum = 5046310;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=5046311;
 //BA.debugLineNum = 5046311;BA.debugLine="Dim retryAfter As Int = NormalizeRetryAfter(resul";
_retryafter = __ref._normalizeretryafter /*int*/ (null,_result.Get((Object)("Data")));
RDebugUtils.currentLine=5046312;
 //BA.debugLineNum = 5046312;BA.debugLine="TraceLog(\"Очередь загружена. Элементов=\" & playQu";
__ref._tracelog /*String*/ (null,"Очередь загружена. Элементов="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+", retryAfter="+BA.NumberToString(_retryafter));
RDebugUtils.currentLine=5046313;
 //BA.debugLineNum = 5046313;BA.debugLine="Wait For (PlayQueueItem(ShiftQueueItem, retryAfte";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "loadnextandplay"), __ref._playqueueitem /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._shiftqueueitem /*Object*/ (null),_retryafter));
this.state = 37;
return;
case 37:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=5046314;
 //BA.debugLineNum = 5046314;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=5046315;
 //BA.debugLineNum = 5046315;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _prescanupcomingadminute(b4j.example.b4xmainpage __ref,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "prescanupcomingadminute", false))
	 {return ((String) Debug.delegate(ba, "prescanupcomingadminute", new Object[] {_force}));}
long _targettimestamp = 0L;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Private Sub PreScanUpcomingAdMinute(force As Boole";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="If CurrentSecondOfMinute < 50 Then Return";
if (__ref._currentsecondofminute /*int*/ (null)<50) { 
if (true) return "";};
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="Dim targetTimestamp As Long = LocalNowTimestamp +";
_targettimestamp = (long) (__ref._localnowtimestamp /*long*/ (null)+(60-__ref._currentsecondofminute /*int*/ (null)));
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="If (MinuteOfHourFromTimestamp(targetTimestamp) Mo";
if ((__ref._minuteofhourfromtimestamp /*int*/ (null,_targettimestamp)%5)!=0) { 
if (true) return "";};
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="TraceLog(\"Предскан рекламы за 10 секунд до блока.";
__ref._tracelog /*String*/ (null,"Предскан рекламы за 10 секунд до блока. target="+__ref._formattimestampfortrace /*String*/ (null,_targettimestamp));
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="ScanLocalAdsForTimestamp(targetTimestamp, force)";
__ref._scanlocaladsfortimestamp /*String*/ (null,_targettimestamp,_force);
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="End Sub";
return "";
}
public String  _syncexactbreakstate(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "syncexactbreakstate", false))
	 {return ((String) Debug.delegate(ba, "syncexactbreakstate", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub SyncExactBreakState";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="ResolveScheduledBreakAt";
__ref._resolvescheduledbreakat /*String*/ (null);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="ScheduleBreakWatch";
__ref._schedulebreakwatch /*String*/ (null);
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="End Sub";
return "";
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
boolean _unused = false;
String _url = "";
int _fadeinms = 0;
String _targetaudiokey = "";
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
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="If current Is Map Then";
if (true) break;

case 1:
//if
this.state = 50;
if (_current instanceof java.util.Map) { 
this.state = 3;
}else {
this.state = 49;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim item As Map = current";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_current));
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Dim itemType As String = item.GetDefault(\"type\",";
_itemtype = BA.ObjectToString(_item.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="TraceLog(\"PlayQueueItem. type=\" & itemType & \",";
__ref._tracelog /*String*/ (null,"PlayQueueItem. type="+_itemtype+", retryAfter="+BA.NumberToString(_retryafter)+", item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject())));
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="If itemType = \"message\" Then";
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
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="HandleMessageItem(item)";
__ref._handlemessageitem /*String*/ (null,_item);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="If itemType = \"update\" Then";

case 7:
//if
this.state = 10;
if ((_itemtype).equals("update")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"player_reloading")))));
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="If itemType = \"idle\" Then";
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
RDebugUtils.currentLine=5439512;
 //BA.debugLineNum = 5439512;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="ShowMessage(item.GetDefault(\"message\", MessageV";
__ref._showmessage /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("message"),(Object)(__ref._messagevalue /*String*/ (null,"idle")))));
RDebugUtils.currentLine=5439514;
 //BA.debugLineNum = 5439514;BA.debugLine="If retryAfter > 0 Then";
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
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="ScheduleRetry(\"server\", retryAfter * 1000)";
__ref._scheduleretry /*String*/ (null,"server",(int) (_retryafter*1000));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=5439517;
 //BA.debugLineNum = 5439517;BA.debugLine="ScheduleRetry(\"server\", PAUSE_RETRY_DELAY)";
__ref._scheduleretry /*String*/ (null,"server",__ref._pause_retry_delay /*int*/ );
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=5439519;
 //BA.debugLineNum = 5439519;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=5439522;
 //BA.debugLineNum = 5439522;BA.debugLine="If itemType = \"break\" Then";

case 20:
//if
this.state = 23;
if ((_itemtype).equals("break")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=5439523;
 //BA.debugLineNum = 5439523;BA.debugLine="MergeBreakItems(item)";
__ref._mergebreakitems /*String*/ (null,_item);
RDebugUtils.currentLine=5439524;
 //BA.debugLineNum = 5439524;BA.debugLine="Wait For (PlayPreparedOrLoadNext) Complete (unu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._playpreparedorloadnext /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 51;
return;
case 51:
//C
this.state = 23;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=5439525;
 //BA.debugLineNum = 5439525;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;
;
RDebugUtils.currentLine=5439528;
 //BA.debugLineNum = 5439528;BA.debugLine="If itemType <> \"track\" And itemType <> \"ad\" Then";

case 23:
//if
this.state = 26;
if ((_itemtype).equals("track") == false && (_itemtype).equals("ad") == false) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=5439529;
 //BA.debugLineNum = 5439529;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=5439530;
 //BA.debugLineNum = 5439530;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=5439533;
 //BA.debugLineNum = 5439533;BA.debugLine="Dim url As String = MediaUrl(item)";
_url = __ref._mediaurl /*String*/ (null,_item);
RDebugUtils.currentLine=5439534;
 //BA.debugLineNum = 5439534;BA.debugLine="If url = \"\" Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((_url).equals("")) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=5439535;
 //BA.debugLineNum = 5439535;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=5439536;
 //BA.debugLineNum = 5439536;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=5439539;
 //BA.debugLineNum = 5439539;BA.debugLine="If item.ContainsKey(\"playlist\") Then playlistInd";

case 30:
//if
this.state = 35;
if (_item.ContainsKey((Object)("playlist"))) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
__ref._playlistindex /*int*/  = (int)(BA.ObjectToNumber(_item.Get((Object)("playlist"))));
if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=5439540;
 //BA.debugLineNum = 5439540;BA.debugLine="dataResolver.CommitPlaylistCursor(storage, item)";
__ref._dataresolver /*b4j.example.dataplaybackresolver*/ ._commitplaylistcursor /*String*/ (null,__ref._storage /*b4j.example.keyvaluestore*/ ,_item);
RDebugUtils.currentLine=5439541;
 //BA.debugLineNum = 5439541;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=5439542;
 //BA.debugLineNum = 5439542;BA.debugLine="Dim fadeInMs As Int = ResolveStartFadeInMs";
_fadeinms = __ref._resolvestartfadeinms /*int*/ (null);
RDebugUtils.currentLine=5439543;
 //BA.debugLineNum = 5439543;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioK";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=5439544;
 //BA.debugLineNum = 5439544;BA.debugLine="If activeAudioKey = \"\" Then targetAudioKey = \"pr";
if (true) break;

case 36:
//if
this.state = 41;
if ((__ref._activeaudiokey /*String*/ ).equals("")) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
_targetaudiokey = "primary";
if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=5439545;
 //BA.debugLineNum = 5439545;BA.debugLine="Wait For (StartPlaybackWithAudioKey(targetAudioK";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playqueueitem"), __ref._startplaybackwithaudiokey /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_targetaudiokey,_item,_fadeinms));
this.state = 52;
return;
case 52:
//C
this.state = 42;
_playbackstarted = (boolean) result[1];
;
RDebugUtils.currentLine=5439546;
 //BA.debugLineNum = 5439546;BA.debugLine="If playbackStarted = False Or isStarted = False";
if (true) break;

case 42:
//if
this.state = 47;
if (_playbackstarted==parent.__c.False || __ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 47:
//C
this.state = 50;
;
RDebugUtils.currentLine=5439547;
 //BA.debugLineNum = 5439547;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=5439549;
 //BA.debugLineNum = 5439549;BA.debugLine="HandleTemporaryState(\"server\", \"\")";
__ref._handletemporarystate /*String*/ (null,"server","");
RDebugUtils.currentLine=5439550;
 //BA.debugLineNum = 5439550;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=5439552;
 //BA.debugLineNum = 5439552;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _shiftqueueitem(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "shiftqueueitem", false))
	 {return ((Object) Debug.delegate(ba, "shiftqueueitem", null));}
Object _item = null;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub ShiftQueueItem As Object";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="If playQueue.Size = 0 Then Return Null";
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Dim item As Object = playQueue.Get(0)";
_item = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="playQueue.RemoveAt(0)";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (0));
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Return item";
if (true) return _item;
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub NormalizeQueueResponse(data As Object)";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Dim items As List = m.GetDefault(\"queue\", Null)";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.GetDefault((Object)("queue"),__c.Null)));
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="If items.IsInitialized = False Then Return Null";
if (_items.IsInitialized()==__c.False) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));};
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Dim normalized As List";
_normalized = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="normalized.Initialize";
_normalized.Initialize();
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="For Each item As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group7 = _items;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = group7.Get(index7);
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="If item Is Map Then normalized.Add(item)";
if (_item instanceof java.util.Map) { 
_normalized.Add(_item);};
 }
};
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="Return normalized";
if (true) return _normalized;
 };
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="End Sub";
return null;
}
public int  _normalizeretryafter(b4j.example.b4xmainpage __ref,Object _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizeretryafter", false))
	 {return ((Integer) Debug.delegate(ba, "normalizeretryafter", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
int _value = 0;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub NormalizeRetryAfter(data As Object) As";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="If data Is Map Then";
if (_data instanceof java.util.Map) { 
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim m As Map = data";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data));
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="If m.ContainsKey(\"retry_after\") = False Then Ret";
if (_m.ContainsKey((Object)("retry_after"))==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Dim value As Int = m.Get(\"retry_after\")";
_value = (int)(BA.ObjectToNumber(_m.Get((Object)("retry_after"))));
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="If value <= 0 Then Return 0";
if (_value<=0) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="End Sub";
return 0;
}
public String  _localadminutetimer_tick(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "localadminutetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "localadminutetimer_tick", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub LocalAdMinuteTimer_Tick";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If CurrentSecondOfMinute <> 50 Then Return";
if (__ref._currentsecondofminute /*int*/ (null)!=50) { 
if (true) return "";};
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="PreScanUpcomingAdMinute(True)";
__ref._prescanupcomingadminute /*String*/ (null,__c.True);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="If isStopping Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstopping /*boolean*/ ) { 
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
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="isStopping = True";
__ref._isstopping /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="TraceLog(\"StopPlayer requested. currentType=\" & c";
__ref._tracelog /*String*/ (null,"StopPlayer requested. currentType="+__ref._currentmediatype /*String*/ +", activeAudio="+__ref._activeaudiokey /*String*/ +", preparedAudio="+__ref._preparedaudiokey /*String*/ );
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="ClearRetryTimer";
__ref._clearretrytimer /*String*/ (null);
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="ClearExactBreakState";
__ref._clearexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="ClearHistoryLogTimer";
__ref._clearhistorylogtimer /*String*/ (null);
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="ResetRetryDelay";
__ref._resetretrydelay /*String*/ (null);
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="If activeAudioKey <> \"\" Then";
if (true) break;

case 7:
//if
this.state = 16;
if ((__ref._activeaudiokey /*String*/ ).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="If currentMediaType = \"track\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((__ref._currentmediatype /*String*/ ).equals("track")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(STOP_FADE_MS";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ )._stop /*String*/ (null,__ref._stop_fade_ms /*int*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="GetAudioByKey(activeAudioKey).Stop(0)";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._activeaudiokey /*String*/ )._stop /*String*/ (null,(int) (0));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="If preparedAudioKey <> \"\" Then GetAudioByKey(prep";

case 16:
//if
this.state = 21;
if ((__ref._preparedaudiokey /*String*/ ).equals("") == false) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,__ref._preparedaudiokey /*String*/ )._stop /*String*/ (null,(int) (0));
if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="currentTrackUrl = \"\"";
__ref._currenttrackurl /*String*/  = "";
RDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="currentMediaType = \"\"";
__ref._currentmediatype /*String*/  = "";
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="activeAudioKey = \"\"";
__ref._activeaudiokey /*String*/  = "";
RDebugUtils.currentLine=7405589;
 //BA.debugLineNum = 7405589;BA.debugLine="preparedAudioKey = \"\"";
__ref._preparedaudiokey /*String*/  = "";
RDebugUtils.currentLine=7405590;
 //BA.debugLineNum = 7405590;BA.debugLine="activeItem.Initialize";
__ref._activeitem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7405591;
 //BA.debugLineNum = 7405591;BA.debugLine="preparedItem.Initialize";
__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7405592;
 //BA.debugLineNum = 7405592;BA.debugLine="playlistIndex = -1";
__ref._playlistindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=7405593;
 //BA.debugLineNum = 7405593;BA.debugLine="playQueue.Clear";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=7405594;
 //BA.debugLineNum = 7405594;BA.debugLine="prefetchDone = False";
__ref._prefetchdone /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7405595;
 //BA.debugLineNum = 7405595;BA.debugLine="isCrossfadeTriggered = False";
__ref._iscrossfadetriggered /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7405596;
 //BA.debugLineNum = 7405596;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=7405597;
 //BA.debugLineNum = 7405597;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=7405598;
 //BA.debugLineNum = 7405598;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=7405599;
 //BA.debugLineNum = 7405599;BA.debugLine="ApplyStoppedState";
__ref._applystoppedstate /*String*/ (null);
RDebugUtils.currentLine=7405600;
 //BA.debugLineNum = 7405600;BA.debugLine="isStopping = False";
__ref._isstopping /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7405601;
 //BA.debugLineNum = 7405601;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7405602;
 //BA.debugLineNum = 7405602;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub ShowSetupScreen(text As String)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="appScreenMode = \"setup\"";
__ref._appscreenmode /*String*/  = "setup";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="ClearPlaybackState";
__ref._clearplaybackstate /*String*/ (null);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="HidePin";
__ref._hidepin /*String*/ (null);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="isStarted = False";
__ref._isstarted /*boolean*/  = __c.False;
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="isStoppedByUser = True";
__ref._isstoppedbyuser /*boolean*/  = __c.True;
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="SetPlayIcon";
__ref._setplayicon /*String*/ (null);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="SetStatusText(\"\")";
__ref._setstatustext /*String*/ (null,"");
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="lblHeader.Text = \"\"";
__ref._lblheader /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="ConfigureSetupScreen(\"setup\", text)";
__ref._configuresetupscreen /*String*/ (null,"setup",_text);
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="UpdateVisibleMode";
__ref._updatevisiblemode /*String*/ (null);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="If txtPlayerCode.IsInitialized Then txtPlayerCode";
if (__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .IsInitialized()) { 
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RequestFocus();};
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="End Sub";
return "";
}
public String  _machineguidshell_processcompleted(b4j.example.b4xmainpage __ref,boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "machineguidshell_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "machineguidshell_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
String _machineguid = "";
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub MachineGuidShell_ProcessCompleted (suc";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="If success And exitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"MachineG";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("MachineGuid\\s+REG_\\w+\\s+([^\\r\\n]+)",_stdout);
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="If matcher.Find Then";
if (_matcher.Find()) { 
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Dim machineGuid As String = matcher.Group(1).Tr";
_machineguid = _matcher.Group((int) (1)).trim().toLowerCase(anywheresoftware.b4a.keywords.Common.stringLocale);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="If machineGuid = \"\" Then";
if ((_machineguid).equals("")) { 
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="TraceLog(\"MachineGuid получен пустым.\")";
__ref._tracelog /*String*/ (null,"MachineGuid получен пустым.");
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="If deviceId <> machineGuid Then";
if ((__ref._deviceid /*String*/ ).equals(_machineguid) == false) { 
RDebugUtils.currentLine=11862026;
 //BA.debugLineNum = 11862026;BA.debugLine="deviceId = machineGuid";
__ref._deviceid /*String*/  = _machineguid;
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="SaveValue(\"device_id\", deviceId)";
__ref._savevalue /*String*/ (null,"device_id",(Object)(__ref._deviceid /*String*/ ));
RDebugUtils.currentLine=11862028;
 //BA.debugLineNum = 11862028;BA.debugLine="TraceLog(\"deviceId обновлен из MachineGuid: \"";
__ref._tracelog /*String*/ (null,"deviceId обновлен из MachineGuid: "+__ref._deviceid /*String*/ );
 }else {
RDebugUtils.currentLine=11862030;
 //BA.debugLineNum = 11862030;BA.debugLine="TraceLog(\"MachineGuid совпадает с текущим devi";
__ref._tracelog /*String*/ (null,"MachineGuid совпадает с текущим deviceId.");
 };
 }else {
RDebugUtils.currentLine=11862033;
 //BA.debugLineNum = 11862033;BA.debugLine="TraceLog(\"MachineGuid не найден в выводе reg.\")";
__ref._tracelog /*String*/ (null,"MachineGuid не найден в выводе reg.");
 };
 }else {
RDebugUtils.currentLine=11862036;
 //BA.debugLineNum = 11862036;BA.debugLine="TraceLog(\"Ошибка чтения MachineGuid. success=\" &";
__ref._tracelog /*String*/ (null,"Ошибка чтения MachineGuid. success="+BA.ObjectToString(_success)+", exitCode="+BA.NumberToString(_exitcode)+", stderr="+_stderr);
 };
RDebugUtils.currentLine=11862038;
 //BA.debugLineNum = 11862038;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub MergeBreakItems(item As Map)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim items As List = item.GetDefault(\"items\", Null";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.GetDefault((Object)("items"),__c.Null)));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="If items.IsInitialized = False Or items.Size = 0";
if (_items.IsInitialized()==__c.False || _items.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim merged As List";
_merged = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="merged.Initialize";
_merged.Initialize();
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="For Each breakItem As Object In items";
{
final anywheresoftware.b4a.BA.IterableList group5 = _items;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_breakitem = group5.Get(index5);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="merged.Add(breakItem)";
_merged.Add(_breakitem);
 }
};
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="For Each existing As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_existing = group8.Get(index8);
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="merged.Add(existing)";
_merged.Add(_existing);
 }
};
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="playQueue = merged";
__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/  = _merged;
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="TraceLog(\"В очередь добавлен break. Размер очеред";
__ref._tracelog /*String*/ (null,"В очередь добавлен break. Размер очереди="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+", scheduledBreakAt="+BA.NumberToString(__ref._scheduledbreakat /*long*/ ));
RDebugUtils.currentLine=5570574;
 //BA.debugLineNum = 5570574;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub MinuteOfHourFromTimestamp(targetTimest";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim previousTimeFormat As String = DateTime.TimeF";
_previoustimeformat = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
__c.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="Dim timeValue As String = DateTime.Time(targetTim";
_timevalue = __c.DateTime.Time((long) (_targettimestamp*1000));
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="DateTime.TimeFormat = previousTimeFormat";
__c.DateTime.setTimeFormat(_previoustimeformat);
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="Dim parts() As String = Regex.Split(\":\", timeValu";
_parts = __c.Regex.Split(":",_timevalue);
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="If parts.Length < 2 Then Return 0";
if (_parts.length<2) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="Return parts(1)";
if (true) return (int)(Double.parseDouble(_parts[(int) (1)]));
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="End Sub";
return 0;
}
public double  _normalizedbvalue(b4j.example.b4xmainpage __ref,Object _value,double _fallbackvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "normalizedbvalue", false))
	 {return ((Double) Debug.delegate(ba, "normalizedbvalue", new Object[] {_value,_fallbackvalue}));}
double _db = 0;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub NormalizeDbValue(value As Object, fall";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim db As Double = fallbackValue";
_db = _fallbackvalue;
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Try";
try {RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="db = value";
_db = (double)(BA.ObjectToNumber(_value));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="db = fallbackValue";
_db = _fallbackvalue;
 };
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="If db > 0 Then db = 0";
if (_db>0) { 
_db = 0;};
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="If db < -24 Then db = -24";
if (_db<-24) { 
_db = -24;};
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="Return db";
if (true) return _db;
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Wait For (RefreshOfflineDataNow) Complete (unused";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "offlinedatarefreshtimer_tick"), __ref._refreshofflinedatanow /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub OrbitTimer_Tick";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="orbitPulseStep = (orbitPulseStep + 1) Mod 24";
__ref._orbitpulsestep /*int*/  = (int) ((__ref._orbitpulsestep /*int*/ +1)%24);
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim fadeStep As Double = orbitTimer.Interval / OR";
_fadestep = __ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .getInterval()/(double)__ref._orbit_fade_ms /*int*/ ;
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="If orbitFadeValue < orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ <__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="orbitFadeValue = Min(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Min(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ +_fadestep);
 }else 
{RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Else If orbitFadeValue > orbitFadeTarget Then";
if (__ref._orbitfadevalue /*double*/ >__ref._orbitfadetarget /*double*/ ) { 
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="orbitFadeValue = Max(orbitFadeTarget, orbitFadeV";
__ref._orbitfadevalue /*double*/  = __c.Max(__ref._orbitfadetarget /*double*/ ,__ref._orbitfadevalue /*double*/ -_fadestep);
 }}
;
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="ApplyOrbitFrame(orbitPulseStep)";
__ref._applyorbitframe /*String*/ (null,__ref._orbitpulsestep /*int*/ );
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="If orbitFadeValue = 0 And orbitFadeTarget = 0 The";
if (__ref._orbitfadevalue /*double*/ ==0 && __ref._orbitfadetarget /*double*/ ==0) { 
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);};
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="End Sub";
return "";
}
public String  _playbackstartdone(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _unusedresult) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbackstartdone", false))
	 {return ((String) Debug.delegate(ba, "playbackstartdone", new Object[] {_unusedresult}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Private Sub PlaybackStartDone(unusedResult As Map)";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If unusedResult.IsInitialized Then";
if (_unusedresult.IsInitialized()) { 
 };
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If playerCode = \"\" Then";
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
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="ShowSetupScreen(MessageValue(\"player_required\"))";
__ref._showsetupscreen /*String*/ (null,__ref._messagevalue /*String*/ (null,"player_required"));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="If isStarted = False Then";

case 4:
//if
this.state = 13;
if (__ref._isstarted /*boolean*/ ==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="If isStopping Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._isstopping /*boolean*/ ) { 
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
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="isStarted = True";
__ref._isstarted /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="isStoppedByUser = False";
__ref._isstoppedbyuser /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="SetStopIcon";
__ref._setstopicon /*String*/ (null);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="HideContentBlocks";
__ref._hidecontentblocks /*String*/ (null);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Wait For (StartFirstTrack(\"manual\")) Complete (u";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbuttonpane_click"), __ref._startfirsttrack /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"manual"));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="If isStopping Then Return";

case 13:
//if
this.state = 18;
if (__ref._isstopping /*boolean*/ ) { 
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
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Wait For (StopPlayer) Complete (unused2 As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "playbuttonpane_click"), __ref._stopplayer /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = -1;
_unused2 = (boolean) result[1];
;
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub PlayButtonPane_MouseClicked (eventData";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="PlayButtonPane_Click";
__ref._playbuttonpane_click /*void*/ (null);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseentered(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub PlayButtonPane_MouseEntered (eventData";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="UpdatePlayButtonAppearance(True)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.True);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _playbuttonpane_mouseexited(b4j.example.b4xmainpage __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playbuttonpane_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "playbuttonpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub PlayButtonPane_MouseExited (eventData";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="UpdatePlayButtonAppearance(False)";
__ref._updateplaybuttonappearance /*String*/ (null,__c.False);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public double  _playerleveltofactor(b4j.example.b4xmainpage __ref,double _levelvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "playerleveltofactor", false))
	 {return ((Double) Debug.delegate(ba, "playerleveltofactor", new Object[] {_levelvalue}));}
double _normalized = 0;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub PlayerLevelToFactor(levelValue As Doub";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim normalized As Double = Max(0, Min(1, levelVal";
_normalized = __c.Max(0,__c.Min(1,_levelvalue/(double)100));
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="If normalized <= 0 Then Return 0";
if (_normalized<=0) { 
if (true) return 0;};
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="Return Power(normalized, 0.7)";
if (true) return __c.Power(_normalized,0.7);
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="End Sub";
return 0;
}
public int  _resolvestartfadeinms(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvestartfadeinms", false))
	 {return ((Integer) Debug.delegate(ba, "resolvestartfadeinms", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub ResolveStartFadeInMs As Int";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="If initialStartFadePending = False Then Return 0";
if (__ref._initialstartfadepending /*boolean*/ ==__c.False) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="If activeAudioKey <> \"\" Then Return 0";
if ((__ref._activeaudiokey /*String*/ ).equals("") == false) { 
if (true) return (int) (0);};
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="initialStartFadePending = False";
__ref._initialstartfadepending /*boolean*/  = __c.False;
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="Return START_FADE_MS";
if (true) return __ref._start_fade_ms /*int*/ ;
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="ClearPendingPlayState";
__ref._clearpendingplaystate /*String*/ (null);
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="pendingPlayAudioKey = audioKey";
__ref._pendingplayaudiokey /*String*/  = _audiokey;
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="pendingPlayItem = item";
__ref._pendingplayitem /*anywheresoftware.b4a.objects.collections.Map*/  = _item;
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="pendingPlayFadeInMs = fadeInMs";
__ref._pendingplayfadeinms /*int*/  = _fadeinms;
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="TraceLog(\"StartPlaybackWithAudioKey. audio=\" & au";
__ref._tracelog /*String*/ (null,"StartPlaybackWithAudioKey. audio="+_audiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_item.getObject()))+", volume="+parent.__c.NumberFormat2(__ref._currentvolume /*double*/ (null,_item),(int) (1),(int) (3),(int) (3),parent.__c.False)+", fadeInMs="+BA.NumberToString(_fadeinms));
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="GetAudioByKey(audioKey).LoadUrl(MediaUrl(item), C";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_audiokey)._loadurl /*String*/ (null,__ref._mediaurl /*String*/ (null,_item),__ref._currentvolume /*double*/ (null,_item));
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Wait For PlaybackStartDone(result As Map)";
parent.__c.WaitFor("playbackstartdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "startplaybackwithaudiokey"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="TraceLog(\"PlaybackStartDone. audio=\" & audioKey &";
__ref._tracelog /*String*/ (null,"PlaybackStartDone. audio="+_audiokey+", success="+BA.ObjectToString(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))+", message="+BA.ObjectToString(_result.GetDefault((Object)("Message"),(Object)(""))));
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="End Sub";
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
Object _nextobject = null;
anywheresoftware.b4a.objects.collections.Map _nextitem = null;
String _nexttype = "";
String _targetaudiokey = "";
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
this.state = 1;
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If playQueue.Size = 0 Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
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
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Dim nextObject As Object = playQueue.Get(0)";
_nextobject = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="If nextObject Is Map Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_nextobject instanceof java.util.Map) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Dim nextItem As Map = nextObject";
_nextitem = new anywheresoftware.b4a.objects.collections.Map();
_nextitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_nextobject));
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="Dim nextType As String = nextItem.GetDefault(\"typ";
_nexttype = BA.ObjectToString(_nextitem.GetDefault((Object)("type"),(Object)("")));
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="If nextType <> \"track\" And nextType <> \"ad\" Then";
if (true) break;

case 19:
//if
this.state = 24;
if ((_nexttype).equals("track") == false && (_nexttype).equals("ad") == false) { 
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
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="If preparedItem.IsInitialized And preparedAudioKe";
if (true) break;

case 25:
//if
this.state = 30;
if (__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && (__ref._preparedaudiokey /*String*/ ).equals("") == false && __ref._itemsmatch /*boolean*/ (null,__ref._prepareditem /*anywheresoftware.b4a.objects.collections.Map*/ ,_nextitem)) { 
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
this.state = -1;
;
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="Dim targetAudioKey As String = GetInactiveAudioKe";
_targetaudiokey = __ref._getinactiveaudiokey /*String*/ (null);
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="ClearPreparedState(False)";
__ref._clearpreparedstate /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="pendingPrepareAudioKey = targetAudioKey";
__ref._pendingprepareaudiokey /*String*/  = _targetaudiokey;
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="pendingPrepareItem = CloneMap(nextItem)";
__ref._pendingprepareitem /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._clonemap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_nextitem);
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="TraceLog(\"PrepareNextPlayable. targetAudio=\" & ta";
__ref._tracelog /*String*/ (null,"PrepareNextPlayable. targetAudio="+_targetaudiokey+", item="+__ref._describeitem /*String*/ (null,(Object)(_nextitem.getObject()))+", volume="+parent.__c.NumberFormat2(__ref._currentvolume /*double*/ (null,_nextitem),(int) (1),(int) (3),(int) (3),parent.__c.False));
RDebugUtils.currentLine=4587537;
 //BA.debugLineNum = 4587537;BA.debugLine="GetAudioByKey(targetAudioKey).LoadUrl(MediaUrl(ne";
__ref._getaudiobykey /*b4j.example.audioplayer*/ (null,_targetaudiokey)._loadurl /*String*/ (null,__ref._mediaurl /*String*/ (null,_nextitem),__ref._currentvolume /*double*/ (null,_nextitem));
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="Wait For PreloadDone(result As Map)";
parent.__c.WaitFor("preloaddone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "preparenextplayable"), null);
this.state = 31;
return;
case 31:
//C
this.state = -1;
_result = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="TraceLog(\"PreloadDone. audio=\" & targetAudioKey &";
__ref._tracelog /*String*/ (null,"PreloadDone. audio="+_targetaudiokey+", success="+BA.ObjectToString(_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)))+", message="+BA.ObjectToString(_result.GetDefault((Object)("Message"),(Object)(""))));
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="Return result.GetDefault(\"Success\", False)";
if (true) {
parent.__c.ReturnFromResumableSub(this,_result.GetDefault((Object)("Success"),(Object)(parent.__c.False)));return;};
RDebugUtils.currentLine=4587541;
 //BA.debugLineNum = 4587541;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _preloaddone(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _unusedresult) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "preloaddone", false))
	 {return ((String) Debug.delegate(ba, "preloaddone", new Object[] {_unusedresult}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub PreloadDone(unusedResult As Map)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If unusedResult.IsInitialized Then";
if (_unusedresult.IsInitialized()) { 
 };
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="End Sub";
return "";
}
public String  _scanlocaladsfortimestamp(b4j.example.b4xmainpage __ref,long _targetminutetimestamp,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "scanlocaladsfortimestamp", false))
	 {return ((String) Debug.delegate(ba, "scanlocaladsfortimestamp", new Object[] {_targetminutetimestamp,_force}));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Private Sub ScanLocalAdsForTimestamp(targetMinuteT";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="If localAdScheduler.ScanTargetMinute(offlineData,";
if (__ref._localadscheduler /*b4j.example.adscheduler*/ ._scantargetminute /*boolean*/ (null,__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ ,__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ,_targetminutetimestamp,_force)) { 
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="SyncExactBreakState";
__ref._syncexactbreakstate /*String*/ (null);
 };
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Dim playlistDescriptors As List = offlineStoreSer";
_playlistdescriptors = new anywheresoftware.b4a.objects.collections.List();
_playlistdescriptors = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getstoredplaylistdescriptors /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="If playlistDescriptors.IsInitialized = False Or p";
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
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="TraceLog(\"Для синхронизации playlist metadata ни";
__ref._tracelog /*String*/ (null,"Для синхронизации playlist metadata ничего не найдено.");
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="EnsureDirectory(offlineStoreService.GetOfflinePla";
__ref._ensuredirectory /*String*/ (null,__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getofflineplaylistsdir /*String*/ (null));
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="Dim cachedPlaylistIndex As Map = offlineStoreServ";
_cachedplaylistindex = new anywheresoftware.b4a.objects.collections.Map();
_cachedplaylistindex = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._getcachedplaylistindex /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=14090248;
 //BA.debugLineNum = 14090248;BA.debugLine="Dim downloadedCount As Int = 0";
_downloadedcount = (int) (0);
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="Dim updatedCount As Int = 0";
_updatedcount = (int) (0);
RDebugUtils.currentLine=14090250;
 //BA.debugLineNum = 14090250;BA.debugLine="Dim failedCount As Int = 0";
_failedcount = (int) (0);
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="For Each descriptorObject As Object In playlistDe";
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
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="If descriptorObject Is Map Then";
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
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="Dim descriptor As Map = descriptorObject";
_descriptor = new anywheresoftware.b4a.objects.collections.Map();
_descriptor = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_descriptorobject));
RDebugUtils.currentLine=14090254;
 //BA.debugLineNum = 14090254;BA.debugLine="Dim syncAction As String = offlineStoreService.";
_syncaction = __ref._offlinestoreservice /*b4j.example.offlinestore*/ ._resolveplaylistsyncaction /*String*/ (null,_descriptor,_cachedplaylistindex);
RDebugUtils.currentLine=14090255;
 //BA.debugLineNum = 14090255;BA.debugLine="If syncAction = \"skip\" Then Continue";
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
RDebugUtils.currentLine=14090256;
 //BA.debugLineNum = 14090256;BA.debugLine="Wait For (DownloadOfflinePlaylistMetadata(descr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "syncofflineplaylistmetadata"), __ref._downloadofflineplaylistmetadata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descriptor,_cachedplaylistindex));
this.state = 33;
return;
case 33:
//C
this.state = 17;
_downloaded = (boolean) result[1];
;
RDebugUtils.currentLine=14090257;
 //BA.debugLineNum = 14090257;BA.debugLine="If downloaded Then";
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
RDebugUtils.currentLine=14090258;
 //BA.debugLineNum = 14090258;BA.debugLine="If syncAction = \"missing\" Then";
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
RDebugUtils.currentLine=14090259;
 //BA.debugLineNum = 14090259;BA.debugLine="downloadedCount = downloadedCount + 1";
_downloadedcount = (int) (_downloadedcount+1);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=14090261;
 //BA.debugLineNum = 14090261;BA.debugLine="updatedCount = updatedCount + 1";
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
RDebugUtils.currentLine=14090264;
 //BA.debugLineNum = 14090264;BA.debugLine="failedCount = failedCount + 1";
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
RDebugUtils.currentLine=14090268;
 //BA.debugLineNum = 14090268;BA.debugLine="offlineStoreService.SaveCachedPlaylistIndex(cache";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._savecachedplaylistindex /*String*/ (null,_cachedplaylistindex);
RDebugUtils.currentLine=14090269;
 //BA.debugLineNum = 14090269;BA.debugLine="offlineStoreService.RefreshPlaylistCacheStatus(pl";
__ref._offlinestoreservice /*b4j.example.offlinestore*/ ._refreshplaylistcachestatus /*String*/ (null,_playlistdescriptors);
RDebugUtils.currentLine=14090270;
 //BA.debugLineNum = 14090270;BA.debugLine="Dim actualCount As Int = storage.GetDefault(\"offl";
_actualcount = (int)(BA.ObjectToNumber(__ref._storage /*b4j.example.keyvaluestore*/ ._getdefault /*Object*/ (null,"offline_playlist_actual_count",(Object)(0))));
RDebugUtils.currentLine=14090271;
 //BA.debugLineNum = 14090271;BA.debugLine="TraceLog(\"Синхронизация playlist metadata заверше";
__ref._tracelog /*String*/ (null,"Синхронизация playlist metadata завершена. downloaded="+BA.NumberToString(_downloadedcount)+", updated="+BA.NumberToString(_updatedcount)+", failed="+BA.NumberToString(_failedcount)+", actual="+BA.NumberToString(_actualcount));
RDebugUtils.currentLine=14090272;
 //BA.debugLineNum = 14090272;BA.debugLine="Return failedCount = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_failedcount==0));return;};
RDebugUtils.currentLine=14090273;
 //BA.debugLineNum = 14090273;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resolveerrormessage(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _result,String _fallback) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveerrormessage", false))
	 {return ((String) Debug.delegate(ba, "resolveerrormessage", new Object[] {_result,_fallback}));}
Object _resultdata = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _errormessage = "";
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub ResolveErrorMessage(result As Map, fal";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="If result.GetDefault(\"Success\", False) Then";
if (BA.ObjectToBoolean(_result.GetDefault((Object)("Success"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Dim resultData As Object = result.Get(\"Data\")";
_resultdata = _result.Get((Object)("Data"));
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="If resultData Is Map Then";
if (_resultdata instanceof java.util.Map) { 
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Dim m As Map = resultData";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_resultdata));
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="If m.GetDefault(\"message\", \"\") <> \"\" Then Retur";
if ((_m.GetDefault((Object)("message"),(Object)(""))).equals((Object)("")) == false) { 
if (true) return BA.ObjectToString(_m.Get((Object)("message")));};
 };
 };
RDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="Dim errorMessage As String = result.GetDefault(\"E";
_errormessage = BA.ObjectToString(_result.GetDefault((Object)("ErrorMessage"),(Object)("")));
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="If errorMessage <> \"\" Then Return errorMessage";
if ((_errormessage).equals("") == false) { 
if (true) return _errormessage;};
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="Return fallback";
if (true) return _fallback;
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="End Sub";
return "";
}
public double  _resolveplayerlevelfactor(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveplayerlevelfactor", false))
	 {return ((Double) Debug.delegate(ba, "resolveplayerlevelfactor", null));}
anywheresoftware.b4a.objects.collections.Map _playerdata = null;
double _playerlevel = 0;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub ResolvePlayerLevelFactor As Double";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim playerData As Map = offlineData.GetDefault(\"p";
_playerdata = new anywheresoftware.b4a.objects.collections.Map();
_playerdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._offlinedata /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("player"),(Object)(__ref._createinitializedmap /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()))));
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim playerLevel As Double = playerData.GetDefault";
_playerlevel = (double)(BA.ObjectToNumber(_playerdata.GetDefault((Object)("level"),(Object)(100))));
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Return PlayerLevelToFactor(playerLevel)";
if (true) return __ref._playerleveltofactor /*double*/ (null,_playerlevel);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="End Sub";
return 0;
}
public int  _resolveretrydelay(b4j.example.b4xmainpage __ref,String _mode,int _delayms) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolveretrydelay", false))
	 {return ((Integer) Debug.delegate(ba, "resolveretrydelay", new Object[] {_mode,_delayms}));}
int _delay = 0;
int _serverdelay = 0;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub ResolveRetryDelay(mode As String, dela";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="If delayMs > 0 Then Return delayMs";
if (_delayms>0) { 
if (true) return _delayms;};
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If mode = \"offline\" Then";
if ((_mode).equals("offline")) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Dim delay As Int = offlineRetryDelay";
_delay = __ref._offlineretrydelay /*int*/ ;
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="offlineRetryDelay = Min(offlineRetryDelay * 2, O";
__ref._offlineretrydelay /*int*/  = (int) (__c.Min(__ref._offlineretrydelay /*int*/ *2,__ref._offline_retry_delay_max /*int*/ ));
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Return delay";
if (true) return _delay;
 };
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="If mode = \"blocked\" Then Return BLOCKED_RETRY_DEL";
if ((_mode).equals("blocked")) { 
if (true) return __ref._blocked_retry_delay /*int*/ ;};
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Dim serverDelay As Int = serverRetryDelay";
_serverdelay = __ref._serverretrydelay /*int*/ ;
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="serverRetryDelay = Min(serverRetryDelay * 2, SERV";
__ref._serverretrydelay /*int*/  = (int) (__c.Min(__ref._serverretrydelay /*int*/ *2,__ref._server_retry_delay_max /*int*/ ));
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="Return serverDelay";
if (true) return _serverdelay;
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="End Sub";
return 0;
}
public String  _resolvescheduledbreakat(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "resolvescheduledbreakat", false))
	 {return ((String) Debug.delegate(ba, "resolvescheduledbreakat", null));}
Object _itemobj = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub ResolveScheduledBreakAt";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="scheduledBreakAt = -1";
__ref._scheduledbreakat /*long*/  = (long) (-1);
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="For Each itemObj As Object In playQueue";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_itemobj = group2.Get(index2);
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If itemObj Is Map Then";
if (_itemobj instanceof java.util.Map) { 
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim item As Map = itemObj";
_item = new anywheresoftware.b4a.objects.collections.Map();
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemobj));
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="If item.GetDefault(\"type\", \"\") = \"break\" And it";
if ((_item.GetDefault((Object)("type"),(Object)(""))).equals((Object)("break")) && (_item.GetDefault((Object)("exactly"),(Object)(__c.False))).equals((Object)(__c.True)) && _item.ContainsKey((Object)("at"))) { 
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="scheduledBreakAt = ToLongDefault(item.Get(\"at\"";
__ref._scheduledbreakat /*long*/  = __ref._tolongdefault /*long*/ (null,_item.Get((Object)("at")),(long) (-1));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="TraceLog(\"Определена точка exact-break. value=\" &";
__ref._tracelog /*String*/ (null,"Определена точка exact-break. value="+BA.NumberToString(__ref._scheduledbreakat /*long*/ )+", queueSize="+BA.NumberToString(__ref._playqueue /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="End Sub";
return "";
}
public long  _tolongdefault(b4j.example.b4xmainpage __ref,Object _value,long _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "tolongdefault", false))
	 {return ((Long) Debug.delegate(ba, "tolongdefault", new Object[] {_value,_defaultvalue}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub ToLongDefault(value As Object, default";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Try";
try {RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="If value = Null Then Return defaultValue";
if (_value== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Return value";
if (true) return BA.ObjectToLongNumber(_value);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="Try";
try {RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Return Floor((\"\" & value).Trim)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble((""+BA.ObjectToString(_value)).trim()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="Return defaultValue";
if (true) return _defaultvalue;
 };
 };
RDebugUtils.currentLine=15007755;
 //BA.debugLineNum = 15007755;BA.debugLine="End Sub";
return 0L;
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
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="retryTimer.Enabled = False";
__ref._retrytimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="If isStarted = False Or isStoppedByUser Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._isstarted /*boolean*/ ==parent.__c.False || __ref._isstoppedbyuser /*boolean*/ ) { 
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
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="TraceLog(\"RetryTimer_Tick. reloading next queue c";
__ref._tracelog /*String*/ (null,"RetryTimer_Tick. reloading next queue chunk.");
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Wait For (LoadNextAndPlay) Complete (unused As Bo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "retrytimer_tick"), __ref._loadnextandplay /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _schedulebreakwatch(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "schedulebreakwatch", false))
	 {return ((String) Debug.delegate(ba, "schedulebreakwatch", null));}
long _delay = 0L;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub ScheduleBreakWatch";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="breakTimer.Enabled = False";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="If HasPendingExactBreak = False Then Return";
if (__ref._haspendingexactbreak /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Dim delay As Long = Max(1, ((scheduledBreakAt - L";
_delay = (long) (__c.Max(1,((__ref._scheduledbreakat /*long*/ -__ref._localnowtimestamp /*long*/ (null))*1000)-250));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="breakTimer.Interval = delay";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setInterval(_delay);
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="breakTimer.Enabled = True";
__ref._breaktimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="End Sub";
return "";
}
public String  _setlabelstyle(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "setlabelstyle", false))
	 {return ((String) Debug.delegate(ba, "setlabelstyle", new Object[] {_view,_style}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub SetLabelStyle(view As B4XView, style A";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="UiStyle.SetLabelStyle(view, style)";
_uistyle._setlabelstyle /*String*/ (_view,_style);
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return "";
}
public String  _stoporbitanimation(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "stoporbitanimation", false))
	 {return ((String) Debug.delegate(ba, "stoporbitanimation", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub StopOrbitAnimation";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="orbitFadeTarget = 0";
__ref._orbitfadetarget /*double*/  = 0;
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="If orbitFadeValue > 0 Then";
if (__ref._orbitfadevalue /*double*/ >0) { 
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 }else {
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="orbitTimer.Enabled = False";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="ApplyOrbitFrame(0)";
__ref._applyorbitframe /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="End Sub";
return "";
}
public String  _startorbitanimation(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "startorbitanimation", false))
	 {return ((String) Debug.delegate(ba, "startorbitanimation", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub StartOrbitAnimation";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="orbitPulseStep = 0";
__ref._orbitpulsestep /*int*/  = (int) (0);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="orbitFadeTarget = 1";
__ref._orbitfadetarget /*double*/  = 1;
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="orbitTimer.Enabled = True";
__ref._orbittimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="End Sub";
return "";
}
public String  _showadmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showadmeta", false))
	 {return ((String) Debug.delegate(ba, "showadmeta", new Object[] {_item}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub ShowAdMeta(item As Map)";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="SetStatusText(item.GetDefault(\"title\", \"\"))";
__ref._setstatustext /*String*/ (null,BA.ObjectToString(_item.GetDefault((Object)("title"),(Object)(""))));
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return "";
}
public String  _showtrackmeta(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.Map _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showtrackmeta", false))
	 {return ((String) Debug.delegate(ba, "showtrackmeta", new Object[] {_item}));}
anywheresoftware.b4a.objects.collections.List _parts = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub ShowTrackMeta(item As Map)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim parts As List";
_parts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="parts.Initialize";
_parts.Initialize();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="If item.GetDefault(\"set\", \"\") <> \"\" Then parts.Ad";
if ((_item.GetDefault((Object)("set"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("set")));};
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="If item.GetDefault(\"code\", \"\") <> \"\" Then parts.A";
if ((_item.GetDefault((Object)("code"),(Object)(""))).equals((Object)("")) == false) { 
_parts.Add(_item.Get((Object)("code")));};
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="SetStatusText(JoinList(parts, \" • \"))";
__ref._setstatustext /*String*/ (null,__ref._joinlist /*String*/ (null,_parts," • "));
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_action(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_action", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_action", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub txtPlayerCode_Action";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="BtnSetupSubmit_Click";
__ref._btnsetupsubmit_click /*void*/ (null);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_focuschanged(b4j.example.b4xmainpage __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub txtPlayerCode_FocusChanged (hasFocus A";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="isCodeInputFocused = hasFocus";
__ref._iscodeinputfocused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="UpdateCodeInputAppearance(hasFocus)";
__ref._updatecodeinputappearance /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="End Sub";
return "";
}
public String  _txtplayercode_textchanged(b4j.example.b4xmainpage __ref,String _oldvalue,String _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "txtplayercode_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtplayercode_textchanged", new Object[] {_oldvalue,_newvalue}));}
String _filtered = "";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub txtPlayerCode_TextChanged (oldValue As";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If appScreenMode = \"settings\" Then Return";
if ((__ref._appscreenmode /*String*/ ).equals("settings")) { 
if (true) return "";};
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim filtered As String = FilterPlayerCode(newValu";
_filtered = __ref._filterplayercode /*String*/ (null,_newvalue);
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="If filtered <> newValue Then";
if ((_filtered).equals(_newvalue) == false) { 
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="txtPlayerCode.Text = filtered";
__ref._txtplayercode /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_filtered);
 };
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="End Sub";
return "";
}
}